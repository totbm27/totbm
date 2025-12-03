# -*- coding: utf-8 -*-

import torch
import shutil
import subprocess
import openai
from openai import OpenAI
import pandas as pd
import os
import sys
import re
import json
import time
import tiktoken
from tqdm import tqdm
from argparse import Namespace
import traceback
from transformers import GenerationConfig, LlamaForCausalLM, LlamaTokenizer
from transformers import AutoTokenizer, AutoModelForCausalLM, LlamaForCausalLM
from dotenv import load_dotenv

sys.path.append("../")
from run import run

# from src.EnvSetup import EnvSetup
# from src.models import generate

# TODO modify this path
java_home = "/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home"
os.environ["JAVA_HOME"] = java_home
env = os.environ.copy()
env["JAVA_TOOL_OPTIONS"] = "-Duser.language=en -Duser.country=US"

current_dir = os.path.dirname(os.path.abspath(__file__))
chatTesterDir = os.path.dirname(current_dir)

# Load .env file
load_dotenv(os.path.join(current_dir, "..", ".env"))
client = OpenAI(api_key=os.getenv("OPENAI_API_KEY"))

testedRepo_PATH = os.path.join(chatTesterDir, "Repos")  # 存放 repo的 path

# Setup env variables
# env = EnvSetup().get_env()

# model_path = "gpt-3.5-turbo"
model_path = "gpt-4.1-mini"


class ChatGptTester_inital:
    def __init__(self, Intention_TAG):
        self.Intention_TAG = Intention_TAG

        if "CodeLlama-34b-Instruct" in model_path:
            sub_save_dir = "CodeLlama"
        elif "CodeFuse-CodeLlama" in model_path:
            sub_save_dir = "CodeFuse"
        elif "gpt" in model_path:
            sub_save_dir = os.path.basename(Json_file_Path).replace(".json", "")
            # openai.api_base = "https://openkey.cloud/v1"
            # # TODO set api_key
            # openai.api_key = "SET_API_KEY"

        self.original_java_PATH = os.path.join(current_dir, self.Intention_TAG, sub_save_dir, "original_java")
        self.LogINFO_PATH = os.path.join(current_dir, self.Intention_TAG, sub_save_dir, "LogINFO")
        self.Surefire_reports_dest_path = os.path.join(
            current_dir, self.Intention_TAG, sub_save_dir, "Surefire_reports"
        )
        self.GeneratedTest_PATH = os.path.join(current_dir, self.Intention_TAG, sub_save_dir, "GeneratedTest")
        self.MetricOut_Path = os.path.join(current_dir, self.Intention_TAG, sub_save_dir, "result_1.json")
        self.ToT_intention_logs_path = os.path.join(current_dir, "logs/intention", sub_save_dir)
        self.ToT_gentest_logs_path = os.path.join(current_dir, "logs/gentest", sub_save_dir)

        self.boolean(self.GeneratedTest_PATH)
        self.boolean(self.Surefire_reports_dest_path)
        self.boolean(self.LogINFO_PATH)
        self.boolean(self.original_java_PATH)

        # Remove MetricOut file if it exists
        if os.path.exists(self.MetricOut_Path):
            os.remove(self.MetricOut_Path)

        # Remove ToTLogs file if it exists
        self.boolean(self.ToT_intention_logs_path)
        self.boolean(self.ToT_gentest_logs_path)

        self.unit_instance = Unit(model_path)  # class instance

        self.read_INFO(Json_file_Path)

    def boolean(self, file_path):
        if not os.path.exists(file_path):
            print("Creat floder....")
            os.makedirs(file_path)
        else:
            shutil.rmtree(file_path)
            os.makedirs(file_path)

    def read_INFO(self, Json_file_Path):
        project_name = os.path.basename(Json_file_Path).replace(".json", "")

        with open(Json_file_Path, "r", encoding="utf-8") as f:
            file_cont = json.load(f)

        for cont in tqdm(file_cont):
            Under_test_method = cont["Under_test_method"]
            Test_method = cont["Test_method"]
            if len(Under_test_method) == 0:
                continue
            Focal_class = Under_test_method["Class_declaration"]
            Filed = self.unit_instance.commentDelete(Under_test_method["Filed"]) + "\n"
            constructors = self.unit_instance.commentDelete(Under_test_method["constructors"]) + "\n"
            Focal_Method_Info = self.unit_instance.commentDelete(Under_test_method["Method_body"])
            PL_Focal_Method = (
                Focal_class + "\n" + Filed + constructors + "\n\n" + "# Focal method\n" + Focal_Method_Info + "\n}"
            )
            PL_Focal_Method = "\n".join(filter(lambda x: x.strip(), PL_Focal_Method.split("\n")))
            Test_Import_info = Test_method["Test_import"]
            focal_method_name = Under_test_method["Method_statement"]
            Class_name = Under_test_method["Class_name"]
            contextMethod = Under_test_method["contextMethod"]
            self.MethodContext = (
                Under_test_method["Class_declaration"] + Under_test_method["all_method_signature"] + "\n}"
            )

            Test_method = cont["Test_method"]
            TestFileName = os.path.basename(Test_method["TestInfo"].split("###")[0])
            TestDir = os.path.dirname(Under_test_method["project_path"].split("###")[0].replace("/main/", "/test/"))
            TestFilePath = os.path.join(TestDir, TestFileName)
            TestScaffoldPath = os.path.join(TestDir, TestFileName.replace(".java", "_scaffolding.java"))
            ScaffoldingCode = Test_method["scaffoldingCode"]
            TestCodeShell = Test_method["TestCodeShell"]

            try:
                excute_path = os.path.join(testedRepo_PATH, project_name)

                os.chdir(excute_path)
                os.system("git add .")
                os.system('git commit -m "Initial commit for safety"')
                os.chdir(current_dir)

                self.boolean(TestDir)
                with open(TestScaffoldPath, "w", encoding="utf-8") as f:
                    f.write(ScaffoldingCode)

                if self.Intention_TAG == "Contain_intention":  # intention
                    compile_result, test_result, Gen_Path = self.Contain_intention(
                        PL_Focal_Method,
                        focal_method_name,
                        Test_Import_info,
                        TestFilePath,
                        TestCodeShell,
                        project_name,
                        contextMethod,
                        4,
                    )
                else:
                    compile_result, test_result, Gen_Path = self.No_intention(
                        PL_Focal_Method,
                        focal_method_name,
                        Test_Import_info,
                        TestFilePath,
                        TestCodeShell,
                        project_name,
                        contextMethod,
                        4,
                    )

                out_dict = {
                    "original_path": Test_method["TestInfo"],
                    "generated_path": Gen_Path,
                    "Compile": compile_result,
                    "Test": test_result,
                }
                with open(self.MetricOut_Path, "a", encoding="utf-8") as f:
                    json.dump(out_dict, f)
                    f.write("\n")

            except Exception as e:
                traceback.print_exc()
            finally:
                # reset repo status
                os.chdir(excute_path)
                os.system("git restore .")
                os.system("git clean -fd")
                print("Project reset to last committed state")
                os.chdir(current_dir)

    def Contain_intention(
        self,
        PL_Focal_Method,
        focal_method_name,
        Test_Import_info,
        TestFilePath,
        TestCodeShell,
        project_name,
        contextMethod,
        Junit_version,
    ):

        # obtain the method intention
        if Intention_ToT:
            Method_intention = self.unit_instance.intention_tot_unit(PL_Focal_Method, focal_method_name, project_name)
        else:
            Method_intention = self.unit_instance.intention_unit(PL_Focal_Method, focal_method_name)

        if Generate_ToT:
            Composit_prompt = (
                "# Import information\n"
                + Test_Import_info
                + "\n\n# Focal Method Context\n"
                + self.MethodContext
                + "\n\n# Method intention \n"
                + Method_intention
                + "\n\n"
                + PL_Focal_Method
            )

            print("##################")
            print(Composit_prompt)
            print("##################")
            Gen_test_method, import_statement = self.unit_instance.method_pred_tot_unit(
                Composit_prompt, focal_method_name, project_name
            )
        else:
            Composit_prompt = (
                "# Import information\n"
                + Test_Import_info
                + "\n\n# Focal Method Context\n"
                + self.MethodContext
                + "\n\n# Method intention \n"
                + Method_intention
                + "\n\n"
                + PL_Focal_Method
                + f'\n\n# Instruction\nPlease generate a test method for the "{focal_method_name}" according to the given `Import information`, `Focal Method Context` and `Method intention (it is crucial)`. Ensure that the generated test method is compilable, and cannot use the private and undefined method in `Method Context`.\nThe generated code should be enclosed within ``` ```.'
            )

            print("##################")
            print(Composit_prompt)
            print("##################")
            # obtain the generated test_method and import_statement
            Gen_test_method, import_statement = self.unit_instance.method_pred_unit(Composit_prompt)

        # 将生成的 test_method 写入 GenerateTest File， 和 project 当中
        Gen_TestfilePath, Dtest_para = self.file_write(
            Gen_test_method, TestFilePath, TestCodeShell, import_statement, focal_method_name
        )
        compile_result, test_result, proced_compile_INFO, proced_test_INFO = self.adhoc_excute(
            Dtest_para, Gen_TestfilePath, TestFilePath, testedRepo_PATH, project_name, Junit_version
        )

        return compile_result, test_result, Gen_TestfilePath

    def file_write(self, test_method, TestFilePath, TestCodeShell, Test_Import_info, focal_method_name):

        package_name = (
            [code for code in TestCodeShell.split("\n") if "package " in code and ";" in code][0]
            .replace("package ", "")
            .replace(";", "")
            .strip()
        )
        class_name = os.path.basename(TestFilePath).replace(".java", "")

        codeShell_1 = TestCodeShell.replace("\nimport ", Test_Import_info + "\nimport ", 1)
        codeShell_2 = codeShell_1.replace("//TOFILLL", test_method)
        codeShell = "// original test path: " + TestFilePath + "\n" + codeShell_2

        Gen_TestfilePath = os.path.join(
            self.GeneratedTest_PATH, os.path.basename(TestFilePath).replace(".java", "#" + focal_method_name + ".java")
        )
        with open(Gen_TestfilePath, "w", encoding="utf-8") as f:
            f.write(codeShell)

        # 将 testFile 也放入 project 当中
        # FileDir = os.path.dirname(TestFilePath)
        # self.boolean(FileDir)
        with open(TestFilePath, "w", encoding="utf-8") as f:
            f.write(codeShell)

        return Gen_TestfilePath, package_name + "." + class_name

    def adhoc_excute(self, Dtest_para, Gen_TestfilePath, TestFilePath, testedRepo_PATH, project_name, JUNIT_VERSION):

        excute_path = os.path.join(testedRepo_PATH, project_name)
        os.chdir(excute_path)

        mvn_compile = ["mvn", "clean", "test-compile", "-Dcheckstyle.skip=true"]
        mvn_test = ["mvn", "test", "-Dcheckstyle.skip=true"]
        if JUNIT_VERSION == 5:
            mvn_compile = ["mvn", "clean", "test-compile", "-Dtest.engine=junit-jupiter", "-Dcheckstyle.skip=true"]
            mvn_test = ["mvn", "test", "-Dtest.engine=junit-jupiter", "-Dcheckstyle.skip=true"]

        write_cont, compile_result, test_result = self.Compile_Test_sub_unit(mvn_compile, mvn_test, TestFilePath)

        # 未能正确的执行mvn 指令。此时首先需要执行 mvn clean
        if (
            compile_result != 1
            and "[ERROR] COMPILATION ERROR :" not in write_cont
            and "Could not resolve dependenci" in write_cont
        ):
            mvn_install = ["mvn", "clean", "install"]
            mvn_result = subprocess.run(
                mvn_install, stdout=subprocess.PIPE, stderr=subprocess.PIPE, env=env, universal_newlines=True
            )
            if "BUILD SUCCESS" in mvn_result.stdout or "BUILD SUCCESS" in mvn_result.stderr:
                write_cont, compile_result, test_result = self.Compile_Test_sub_unit(
                    mvn_compile, mvn_test, TestFilePath
                )
        os.chdir(current_dir)

        if compile_result == 0 and "[ERROR] COMPILATION ERROR :" not in write_cont:
            raise Exception("Mvn execute failed")
        compile_logInfo_path = os.path.join(self.LogINFO_PATH, os.path.basename(Gen_TestfilePath))
        with open(compile_logInfo_path, "w", encoding="utf-8") as f:
            f.write(write_cont)

        # 处理执行mvn test 保存到 ./target/Surefire_reports/* 当中的信息
        Surefire_reports_dst_file = self.Surefire_reports_TEST_info(
            write_cont, os.path.basename(Gen_TestfilePath), Dtest_para
        )

        return compile_result, test_result, compile_logInfo_path, Surefire_reports_dst_file

    def Compile_Test_sub_unit(self, mvn_compile, mvn_test, test_path):
        compile_success, test_success = 0, 0
        compile_result = subprocess.run(
            mvn_compile, stdout=subprocess.PIPE, stderr=subprocess.PIPE, env=env, universal_newlines=True
        )

        write_cont = (
            "original test path: "
            + test_path
            + "\n########## Compile INFO ##########\n"
            + compile_result.stdout
            + compile_result.stderr
        )

        if "BUILD SUCCESS" in compile_result.stdout or "BUILD SUCCESS" in compile_result.stderr:
            compile_success = 1

            test_result = subprocess.run(
                mvn_test, stdout=subprocess.PIPE, stderr=subprocess.PIPE, universal_newlines=True, env=env
            )

            write_cont = (
                "original test path: "
                + test_path
                + "\n########## Compile INFO ##########\n"
                + compile_result.stdout
                + compile_result.stderr
                + "\n########## Test INFO ##########\n"
                + test_result.stdout
                + test_result.stderr
            )

            if "BUILD SUCCESS" in test_result.stdout or "BUILD SUCCESS" in test_result.stderr:
                test_success = 1

        return write_cont, compile_success, test_success

    def Surefire_reports_TEST_info(self, INFO_CONT, test_file_name, Dtest_para):
        file_name = "TEST-" + os.path.basename(test_file_name).replace(".java", ".xml")
        start_index = INFO_CONT.find("[ERROR] Please refer to ")
        if start_index < 0:
            return
        start_index = start_index + len("[ERROR] Please refer to ")
        end_index = INFO_CONT.find(" for the individual test results.")
        surefire_reports_PATH = INFO_CONT[start_index:end_index]
        Surefire_reports_dst_file = ""
        if surefire_reports_PATH != "":
            surefire_reports_Name = "TEST-" + Dtest_para + ".xml"
            src_path = os.path.join(surefire_reports_PATH, surefire_reports_Name)

            shutil.copy(src_path, self.Surefire_reports_dest_path)

            # 将文件重命名， 防止被覆盖
            Surefire_reports_dst_file = os.path.join(self.Surefire_reports_dest_path, os.path.basename(src_path))
            os.rename(Surefire_reports_dst_file, os.path.join(self.Surefire_reports_dest_path, file_name))
        return Surefire_reports_dst_file

    def No_intention(
        self,
        PL_Focal_Method,
        focal_method_name,
        Test_Import_info,
        TestFilePath,
        TestCodeShell,
        project_name,
        contextMethod,
        Junit_version,
    ):

        Composit_prompt = (
            "# Import information\n"
            + Test_Import_info
            + "\n\n# Focal Method Context\n"
            + self.MethodContext
            + "\n"
            + PL_Focal_Method
            + f'\n\n# Instruction\nPlease generate a test method for the "{focal_method_name}" according to the given `Import information` and `Focal Method Context`. Ensure that the generated test method is compilable, and cannot use the private and undefined method in `Method Context`.\nThe generated code should be enclosed within ``` ```.'
        )

        print("##################")
        print(Composit_prompt)
        print("##################")

        # obtain the generated test_method and import_statement
        Gen_test_method, import_statement = self.unit_instance.method_pred_unit(Composit_prompt)

        # 将生成的 test_method 写入 GenerateTest File， 和 project 当中
        Gen_TestfilePath, Dtest_para = self.file_write(
            Gen_test_method, TestFilePath, TestCodeShell, import_statement, focal_method_name
        )
        compile_result, test_result, proced_compile_INFO, proced_test_INFO = self.adhoc_excute(
            Dtest_para, Gen_TestfilePath, TestFilePath, testedRepo_PATH, project_name, Junit_version
        )

        return compile_result, test_result, Gen_TestfilePath


class Unit:
    def __init__(self, model_path) -> None:

        if "CodeLlama-34b-Instruct" in model_path:
            B_INST, E_INST = "[INST]", "[/INST]"
            B_SYS, E_SYS = "<<SYS>>\n", "\n<</SYS>>\n\n"

            system_prompt = """
            You are a helpful, respectful and honest assistant with a deep knowledge of code and software design. Always answer as helpfully as possible, while being safe. Your answers should not include any harmful, unethical, racist, sexist, toxic, dangerous, or illegal content. Please ensure that your responses are socially unbiased and positive in nature.
            If a question does not make any sense, or is not factually coherent, explain why instead of answering something not correct. If you don't know the answer to a question, please don't share false information.
            """
            system_prompt = f"{B_SYS}{system_prompt}{E_SYS}"
            self.problem_prompt = system_prompt + "[INST] {instruction} [/INST]"
            self.tokenizer = AutoTokenizer.from_pretrained(model_path, use_fast=False)
            self.model = AutoModelForCausalLM.from_pretrained(
                model_path, low_cpu_mem_usage=True, torch_dtype=torch.float16
            ).cuda()

        elif "CodeFuse-CodeLlama" in model_path:
            HUMAN_ROLE_START_TAG = "<|role_start|>human<|role_end|>"
            BOT_ROLE_START_TAG = "<|role_start|>bot<|role_end|>"
            self.problem_prompt = HUMAN_ROLE_START_TAG + "{instruction}" + BOT_ROLE_START_TAG
            self.tokenizer = AutoTokenizer.from_pretrained(model_path, use_fast=False)
            self.model = AutoModelForCausalLM.from_pretrained(
                model_path, low_cpu_mem_usage=True, torch_dtype=torch.float16
            ).cuda()

    def generate(self, prompt):
        input_ids = self.tokenizer([prompt]).input_ids
        output_ids = self.model.generate(torch.as_tensor(input_ids).cuda(), max_new_tokens=1024, max_length=2048)
        output_ids = output_ids[0][len(input_ids[0]) :]
        outputs = self.tokenizer.decode(output_ids, skip_special_tokens=True).strip()
        return outputs

    def method_pred_unit(self, ask_test_method_prompt, repair_TAG=False):
        if repair_TAG:
            if "gpt" in model_path:
                response_test = client.chat.completions.create(
                    model=model_path,
                    messages=[
                        {
                            "role": "system",
                            "content": "I want you to play the role of a professional who repairs buggy lines of the test method. Unnecessary import statement can be removed.",
                        },
                        {"role": "user", "content": ask_test_method_prompt},
                    ],
                    temperature=0,
                )
                generated_content = response_test.choices[0].message.content
            else:
                role = "I want you to play the role of a professional who repairs buggy lines of the test method."
                instruction = role + "\n\n" + ask_test_method_prompt
                prompt = self.problem_prompt.format(instruction=instruction)
                generated_content = self.generate(prompt)

        else:
            if "gpt" in model_path:
                response_test = client.chat.completions.create(
                    model=model_path,
                    messages=[
                        {
                            "role": "system",
                            "content": "I want you to play the role of a professional who writes Java test method.",
                        },
                        {"role": "user", "content": ask_test_method_prompt},
                    ],
                    temperature=0,
                )
                generated_content = response_test.choices[0].message.content

            else:
                role = "I want you to play the role of a professional who writes Java test method for the Focal method. The following is the Class, Focal method and Import information."
                instruction = role + "\n\n" + ask_test_method_prompt
                prompt = self.problem_prompt.format(instruction=instruction)
                generated_content = self.generate(prompt)

        test_method, import_statement = self.return_code(generated_content)
        return test_method, import_statement

    def method_pred_tot_unit(self, ask_test_method_prompt, focal_method_name, project_name, repair_TAG=False):
        if repair_TAG:
            if "gpt" in model_path:
                response_test = client.chat.completions.create(
                    model=model_path,
                    messages=[
                        {
                            "role": "system",
                            "content": "I want you to play the role of a professional who repairs buggy lines of the test method. Unnecessary import statement can be removed.",
                        },
                        {"role": "user", "content": ask_test_method_prompt},
                    ],
                    temperature=0,
                )
                generated_content = response_test.choices[0].message.content

            else:
                role = "I want you to play the role of a professional who repairs buggy lines of the test method."
                instruction = role + "\n\n" + ask_test_method_prompt
                prompt = self.problem_prompt.format(instruction=instruction)
                generated_content = self.generate(prompt)

        else:
            if "gpt" in model_path:
                content = []
                content.append(ask_test_method_prompt)
                content.append(focal_method_name)

                args = Namespace(
                    backend=model_path,
                    temperature=0.7,
                    max_tokens=None,
                    task="gentest",
                    task_start_index=0,
                    task_end_index=1,
                    mode="solve",
                    prompt_sample="cot",
                    method_generate="sample",
                    method_evaluate="vote",
                    method_select="greedy",
                    n_generate_sample=3,
                    n_evaluate_sample=3,
                    n_select_sample=1,
                    taskContent=content,
                    log_path_arg=project_name,
                )

                generated_content = ""
                genTimes = 5
                while genTimes > 0:
                    generated_content_wrap = run(args)[0]
                    if "```" in generated_content_wrap:
                        match = re.search(r"```(?:\w*\n)?(.*?)```", generated_content_wrap, re.DOTALL)
                        generated_content = match.group(1).strip()
                    else:
                        generated_content = generated_content_wrap

                    required_sections = ["// Import", "void", "// Arrange", "// Act", "// Assert"]
                    missing = [section for section in required_sections if section not in generated_content]
                    if not missing:

                        # 目標排序順序
                        target_order = ["// Import", "void", "// Arrange", "// Act", "// Assert"]

                        # 使用 regex 拆分區塊（每個標記為區塊開始）
                        pattern = r"(// Import|void|// Arrange|// Act|// Assert)"
                        parts = re.split(pattern, generated_content)

                        # re.split 會留下標記為獨立項，因此我們要將它們與對應的內容配對
                        blocks = []
                        i = 1
                        while i < len(parts):
                            marker = parts[i].strip()
                            body = parts[i + 1] if i + 1 < len(parts) else ''
                            blocks.append((marker, body))
                            i += 2

                        # 檢查現有順序
                        current_order = [marker for marker, _ in blocks]

                        if current_order == target_order:
                            pass
                        else:
                            # 依照正確順序排序
                            sorted_blocks = sorted(blocks, key=lambda x: target_order.index(x[0]))
                            # 組合回內容
                            generated_content = "".join([f"{marker}\n{body}" for marker, body in sorted_blocks])

                        # 輸出新內容
                        generated_content = "```" + generated_content + "```"
                        break
                    else:
                        genTimes -= 1
                        print(f"Missing sections: {missing} in {focal_method_name} generated. Retrying...{5 - genTimes}")

            else:
                role = "I want you to play the role of a professional who writes Java test method for the Focal method. The following is the Class, Focal method and Import information."
                instruction = role + "\n\n" + ask_test_method_prompt
                prompt = self.problem_prompt.format(instruction=instruction)
                generated_content = self.generate(prompt)

        print("######### Generated Content #########")
        print(generated_content)
        print("#####################################")
        test_method, import_statement = self.return_code(generated_content)
        return test_method, import_statement

    def intention_unit(self, PL_Focal_Method, focal_method_name):
        if "gpt" in model_path:
            Intention_NL = f"""Please describe the overall intention of the {focal_method_name} method in as much detail as possible in one sentence."""
            # Intention_NL = f''Please infer the overall intention of the {focal_method_name} method with one sentence.
            ask_intention_prompt = PL_Focal_Method + "\n\n" + Intention_NL
            response_intention = client.chat.completions.create(
                model=model_path,
                messages=[
                    {
                        "role": "system",
                        "content": "I want you to play the role of a professional who infers method intention.",
                    },
                    {"role": "user", "content": ask_intention_prompt},
                ],
                temperature=0,
            )
            intentions = response_intention.choices[0].message.content
        else:
            role = "I want you to play the role of a professional who infers method intention."
            Intention_NL = f"Please tell me the intention of the {focal_method_name} method."
            ask_intention_prompt = PL_Focal_Method + "\n\n" + Intention_NL
            instruction = role + "\n\n" + ask_intention_prompt
            prompt = self.problem_prompt.format(instruction=instruction)
            intentions = self.generate(prompt)

        intentions = " ".join(intentions.split())
        # intention = re.split('(?<=[.!?]) +', intentions)
        return intentions

    def intention_tot_unit(self, PL_Focal_Method, focal_method_name, project_name):
        if "gpt" in model_path:
            content = []
            content.append(PL_Focal_Method)
            content.append(focal_method_name)

            args = Namespace(
                backend=model_path,
                temperature=0.7,
                max_tokens=None,
                task="intention",
                task_start_index=0,
                task_end_index=1,
                mode="solve",
                prompt_sample="cot",
                method_generate="sample",
                method_evaluate="vote",
                method_select="greedy",
                n_generate_sample=3,
                n_evaluate_sample=3,
                n_select_sample=1,
                taskContent=content,
                log_path_arg=project_name,
            )

            intentions = run(args)[0]
        # else:
        #     role = "I want you to play the role of a professional who infers method intention."
        #     Intention_NL = f"Please tell me the intention of the {focal_method_name} method."
        #     ask_intention_prompt = PL_Focal_Method + "\n\n" + Intention_NL
        #     instruction = role + "\n\n" + ask_intention_prompt
        #     prompt = self.problem_prompt.format(instruction=instruction)
        #     intentions = self.generate(prompt)

        intentions = " ".join(intentions.split())
        # intention = re.split('(?<=[.!?]) +', intentions)
        return intentions

    def return_code(self, gen_cont):
        gen_cont = "\n".join([line for line in gen_cont.split("\n") if "Below is " not in line])
        gen_cont = (
            gen_cont.replace("(Fixed)", "")
            .replace("java\r\n", "")
            .replace("...", "")
            .replace("java\n", "")
            .replace("Java\n", "")
        )
        # find code

        pattern = r"```(.*?)```"
        matches = re.findall(pattern, gen_cont, re.DOTALL)
        try:
            matchCode = [match for match in matches if len(match) > 5 and " void " in match][-1]
        except:
            print("No matchCode where matches:", matches)

        JavaCode_list = matchCode.split("\n")

        import_statements = []
        TAG = False
        for line_code in JavaCode_list:
            if "import " in line_code:
                TAG = True
                import_statements.append(line_code)
            elif TAG == True:
                break
        import_statement = "\n".join(import_statements)

        codeBlock = []
        left_brack_list = []
        right_brack_list = []
        Start_Tag = False
        for current_line_number, line in enumerate(JavaCode_list, start=1):
            if ("@Test" in line or " void " in line) and Start_Tag == False:
                Start_Tag = True
                if "@Test" not in line:  # 生成的代码当中可能没有 @Test 这个关键字
                    line_str = "@Test\n" + line
                    codeBlock.append(line_str)
                else:
                    codeBlock.append(line)

                left_brack_count = line.count("{")
                left_brack_list.extend(["{"] * left_brack_count)
                right_brack_count = line.count("}")
                right_brack_list.extend(["}"] * right_brack_count)
                continue
            if Start_Tag:
                codeBlock.append(line)

                left_brack_count = line.count("{")
                left_brack_list.extend(["{"] * left_brack_count)
                right_brack_count = line.count("}")
                right_brack_list.extend(["}"] * right_brack_count)
                if len(left_brack_list) == len(right_brack_list):
                    break
        codeBlock_str = "\n".join(codeBlock)

        return codeBlock_str, import_statement

    def commentDelete(self, code):
        # comment delete
        regex = r"/\*(.|\\n)*?\*/"
        noMultilineComments = re.sub(regex, "", code)

        # remove single line comments (// ...)
        regex = r"//.*"
        non_comment_code = re.sub(regex, "", noMultilineComments)

        pattern = re.compile(r"(?s)/\*.*?\*/|//.*?[\r\n]")  # 匹配 /**...*/ 样式的注释
        codeWithoutComment = pattern.sub("", non_comment_code)  # 去除注释

        return codeWithoutComment


if __name__ == "__main__":
    Intention_TAG = True
    Intention_ToT = False
    Generate_ToT = False

    if Intention_TAG:
        Intention = "Contain_intention"
    else:
        Intention = "No_intention"

    # projects_name = ["sachin-handiekar_jInstagram.json", "tabulapdf_tabula-java.json", "Zappos_zappos-json.json"]
    projects_name = ["tabulapdf_tabula-java.json"]

    for project_name in projects_name:
        Json_file_Path = os.path.join(chatTesterDir, "RepoData", project_name)
        ChatGptTester_inital(Intention)
