import os
import re
from tot.tasks.base import Task, DATA_PATH
from tot.prompts.repair import *
from tot.models import gpt


class RepairTask(Task):
    """
    Input (x)   : a focal method name and composit prompt
    Output (y)  : a unit test generation
    Reward (r)  : # TODO
    Input Example:
    Output Example:
    """

    def __init__(self, content=None):
        """
        file: a text file, each line is some sentences
        """
        super().__init__()
        self.data = content
        self.value_cache = {}
        self.steps = 2
        self.stops = ["\nMethod:\n", None]

    def __len__(self) -> int:
        return 1

    def get_input(self, idx: int) -> str:
        if idx == 0:  
            return self.data
        else:
            raise IndexError("Index out of range. This task only has one input.")

    def test_output(self, idx: int, output: str, n: int, backend: str):
        output = output.split("Method:\n")[-1]
        prompt = score_prompt + output
        score_outputs = gpt(prompt, n=n, model=backend)
        scores = []
        for score_output in score_outputs:
            # print(score_output)
            pattern = r".*quality score is (\d+).*"
            match = re.match(pattern, score_output, re.DOTALL)
            if match:
                score = int(match.groups()[0])
                scores.append(score)
            else:
                print(f"------------------score no match: {[score_output]}")
        print(scores)
        # print('------------')
        info = {"rs": scores, "r": sum(scores) / len(scores) if scores else 0}
        return info

    @staticmethod
    def standard_prompt_wrap(x: list, y: str = "") -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        if repair_type == "testRepair":
            ask_test_method_prompt = test_repair_prompt.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name, ERROR_MESSAGE=ERROR_MESSAGE, Buggy_line=Buggy_line
            ) + y
        elif repair_type == "compileRepair":
            ask_test_method_prompt = compile_repair_prompt.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name, Class_Name=Class_Name
            ) + y
        elif repair_type == "compileRepair_noClassName":
            ask_test_method_prompt = compile_repair_prompt_noClassName.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name
            ) + y
        return ask_test_method_prompt

    @staticmethod
    def cot_prompt_wrap(x: list, y: str = "") -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        if repair_type == "testRepair":
            ask_test_method_prompt = test_repair_tot_prompt.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name, ERROR_MESSAGE=ERROR_MESSAGE, Buggy_line=Buggy_line
            ) + y
        elif repair_type == "compileRepair":
            ask_test_method_prompt = compile_repair_tot_prompt.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name, Class_Name=Class_Name
            ) + y
        elif repair_type == "compileRepair_noClassName":
            ask_test_method_prompt = compile_repair_tot_prompt_noClassName.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name
            ) + y
        else:
            ask_test_method_prompt = re_generate_tot_prompt.format(
                Composit_prompt=Composit_prompt, focal_method_name=focal_method_name
            ) + y
        return ask_test_method_prompt

    @staticmethod
    def value_prompt_wrap(x: list, y: str) -> str:
        if "\nMethod:\n" not in y:
            return value_plan_prompt.format(Composit_prompt=x[0], Plan = y)
        return value_method_prompt.format(Composit_prompt=x[0], Fixed_method=y)

    @staticmethod
    def value_outputs_unwrap(x: list, y: str, value_outputs: list) -> float:
        value_names = [_.split("\n")[-1] for _ in value_outputs]
        value_map = {"impossible": 0.001, "likely": 1, "sure": 20}  # TODO: ad hoc
        value = sum(value * value_names.count(name) for name, value in value_map.items())
        return value

    @staticmethod
    def merge_plan_prompt_wrap(x: list, merge_ys: list) -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        merge_ys1 = merge_ys[0]
        merge_ys2 = merge_ys[1]
        ask_test_method_prompt = merge_plan_prompt.format(
            Composit_prompt=Composit_prompt, ys_1=merge_ys1, ys_2=merge_ys2
        )
        return ask_test_method_prompt

    @staticmethod
    def merge_method_prompt_wrap(x: list, merge_ys: list) -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        merge_ys1 = merge_ys[0]
        merge_ys2 = merge_ys[1]
        plan = merge_ys1.split("Method:\n")[0]
        ask_test_method_prompt = merge_method_prompt.format(
            Composit_prompt=Composit_prompt, ys_1=merge_ys1, ys_2=merge_ys2, plan=plan
        )
        return ask_test_method_prompt

    @staticmethod
    def refine_plan_prompt_wrap(x: list, refine_ys: list) -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        ys = refine_ys
        ask_test_method_prompt = refine_plan_prompt.format(
            Composit_prompt=Composit_prompt, ys=ys
        )
        return ask_test_method_prompt

    @staticmethod
    def refine_method_prompt_wrap(x: list, refine_ys: list) -> str:
        Composit_prompt, focal_method_name, repair_type, Class_Name, ERROR_MESSAGE, Buggy_line = x
        ys = refine_ys
        plan = ys.split("Method:\n")[0]
        ask_test_method_prompt = refine_method_prompt.format(Composit_prompt=Composit_prompt, ys=ys, plan=plan)
        return ask_test_method_prompt

    def get_system_role_prompt(self, method_name: str) -> str:
        if method_name == "standard" or method_name == "cot":
            role_prompt = repair_system_role_prompt
        elif method_name == "propose":
            role_prompt = repair_system_role_prompt
        elif method_name == "vote":
            role_prompt = vote_system_role_prompt
        elif method_name == "value":
            role_prompt = vote_system_role_prompt
        elif method_name == "compare":
            role_prompt = compare_system_role_prompt
        elif method_name == "merge_plan":
            role_prompt = repair_system_role_prompt
        elif method_name == "merge_method":
            role_prompt = repair_system_role_prompt
        elif method_name == "refine_plan":
            role_prompt = repair_system_role_prompt
        elif method_name == "refine_method":
            role_prompt = repair_system_role_prompt
        else:
            role_prompt = ""

        return role_prompt
