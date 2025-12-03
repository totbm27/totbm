import json, os, shutil

def read_and_copy_java_file(filePath, project_name):
    iteratePath = os.path.join(filePath, project_name, "final_result.json")  # Path to the iterate json file
    copyPath = os.path.join(filePath, project_name, "copyGeneratedTest")  # Path to the copy directory
    os.makedirs(copyPath, exist_ok=True)
    with open(iteratePath, "r", encoding="utf-8") as f:
        for line in f:
            iterate_data = json.loads(line.strip())
            generated_path = iterate_data["generated_path"]
            generated_filename = os.path.basename(generated_path)
            from_path = os.path.join(filePath, project_name, "GeneratedTest", generated_filename)

            # copy the file to the copy directory
            shutil.copy2(from_path, copyPath)


def read_and_copy_loginfo(filePath, project_name):
    iteratePath = os.path.join(filePath, project_name, "final_result.json")  # Path to the iterate json file
    copyPath = os.path.join(filePath, project_name, "copyLogINFO")  # Path to the copy directory
    os.makedirs(copyPath, exist_ok=True)
    with open(iteratePath, "r", encoding="utf-8") as f:
        for line in f:
            iterate_data = json.loads(line.strip())
            generated_path = iterate_data["generated_path"]
            generated_filename = os.path.basename(generated_path)
            from_path = os.path.join(filePath, project_name, "LogINFO", generated_filename)
            
            if os.path.exists(from_path):
                # copy the file to the copy directory
                shutil.copy2(from_path, copyPath)


def read_and_copy_repairprocess(filePath, project_name):
    iteratePath = os.path.join(filePath, project_name, "final_result.json")  # Path to the iterate json file
    copyPath = os.path.join(filePath, project_name, "copyRepairProcess")  # Path to the copy directory
    os.makedirs(copyPath, exist_ok=True)
    with open(iteratePath, "r", encoding="utf-8") as f:
        for line in f:
            iterate_data = json.loads(line.strip())
            generated_path = iterate_data["generated_path"]
            generated_filename = os.path.basename(generated_path)

            classname, _ = os.path.splitext(generated_filename)
            promptfileclassname = classname.replace("#", ".java_")
            promptfilename = f"{promptfileclassname}_prompt.txt"
            compilefilename = f"{classname}_compile.text"

            # copy the file to the copy directory
            from_path = os.path.join(filePath, project_name, "RepairProcess", promptfilename)
            if os.path.exists(from_path):
                shutil.copy2(from_path, copyPath)

            from_path = os.path.join(filePath, project_name, "RepairProcess", compilefilename)
            if os.path.exists(from_path):
                shutil.copy2(from_path, copyPath)


def read_and_copy_surefirereports(filePath, project_name):
    iteratePath = os.path.join(filePath, project_name, "final_result.json")  # Path to the iterate json file
    copyPath = os.path.join(filePath, project_name, "copySurefire_reports")  # Path to the copy directory
    os.makedirs(copyPath, exist_ok=True)
    with open(iteratePath, "r", encoding="utf-8") as f:
        for line in f:
            iterate_data = json.loads(line.strip())
            generated_path = iterate_data["generated_path"]
            generated_filename = os.path.basename(generated_path)

            classname, _ = os.path.splitext(generated_filename)
            filename = f"TEST-{classname}.xml"

            # copy the file to the copy directory
            from_path = os.path.join(filePath, project_name, "Surefire_reports", filename)
            if os.path.exists(from_path):
                shutil.copy2(from_path, copyPath)


if __name__ == "__main__":
    filePath = "/Users/curtis/Github/Thesis/chatTester/ExperimentCode/Iterate/"
    project_name = "tabulapdf_tabula-java_1"

    read_and_copy_java_file(filePath, project_name)
    read_and_copy_loginfo(filePath, project_name)
    read_and_copy_repairprocess(filePath, project_name)
    read_and_copy_surefirereports(filePath, project_name)
