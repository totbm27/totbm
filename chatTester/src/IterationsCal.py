import json, os


def loadFile(withTestError=False):
    iteratePath = os.path.join(filePath, "Iterate", project_name, "final_result.json") # line with {}
    if withTestError:
        iteratResultPath = os.path.join(filePath, "IterateResultDeal", project_name, "final_result.json") # json format
    else:
        iteratResultPath = os.path.join(filePath, "IterateResultDeal_NoTestEro", project_name, "final_result.json")  # json format
    (
        totalIterateTimes,
        totalEffectiveIterateTimes,
        totalEffectiveRepair,
        totalCompileSuccess,
        totalTestSuccess,
        totalSuccess,
    ) = (0, 0, 0, 0, 0, 0)
    # Load iteratePath, iteratResultPath
    with open(iteratePath, "r", encoding="utf-8") as iterate_f:
        with open(iteratResultPath, "r", encoding="utf-8") as iteratResult_f:
            # Read the content of iteratResultPath
            iteratResult_cont = json.load(iteratResult_f)
            for line in iterate_f:
                result = 0
                iterateCon = json.loads(line.strip())
                if withTestError:
                    # Read the content of iteratePath
                    for iteratResultCon in iteratResult_cont:
                        # print(iteratResultCon)
                        # print(iterateCon)
                        # Check if the original path matches
                        iterateResult_file = iteratResultCon["generated_path"].split("GeneratedTest/")[-1]
                        iterate_file = iterateCon["generated_path"].split("GeneratedTest/")[-1]
                        if iterateResult_file == iterate_file:
                            result = 1
                            break
                else:
                    if iterateCon["Compile_result"] == 1 and iterateCon["Test_result"] == 1:
                        result = 1
                iterate_IterateTimes = iterateCon["IterateTimes"]
                iterate_Compile_result = iterateCon["Compile_result"]
                iterate_Test_result = iterateCon["Test_result"]
                totalIterateTimes += iterate_IterateTimes
                if result == 1:
                    if iterate_IterateTimes > 0:
                        totalEffectiveIterateTimes += iterate_IterateTimes
                        totalEffectiveRepair += 1
                    totalCompileSuccess += iterate_Compile_result
                    totalTestSuccess += iterate_Test_result
                    totalSuccess += 1

    return totalIterateTimes, totalEffectiveIterateTimes, totalEffectiveRepair, totalCompileSuccess, totalTestSuccess, totalSuccess


if __name__ == "__main__":
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/origin_chattester/r4_4.1mini"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/tot_repair_v2/r4-1_4.1mini"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/tot_repair_merge/r4-1_4.1mini"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/tot_intention_simple_gen_repair"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/tot_intention_tot_gen_simple_repair"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/tot_intention_gen_repair"
    # filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/java1.6test/merge"
    filePath = "/Users/curtis/Github/Thesis/chatTester/Exp_log_backup/threshold/lessprompt"

    project_name = "tabulapdf_tabula-java"
    # project_name = "sachin-handiekar_jInstagram"
    # project_name = "Zappos_zappos-json"
    withTestError = True
    totalIterateTimes, totalEffectiveIterateTimes, totalEffectiveRepair, totalCompileSuccess, totalTestSuccess, totalSuccess = loadFile(
        withTestError
    )
    print(
        f"Project: {project_name} \n"
        f"File Path: {filePath.split('Exp_log_backup/')[-1]} \n"
        f"Total Iterate Times: {totalIterateTimes} \n"
        f"Total Effective Iterate Times: {totalEffectiveIterateTimes} \n"
        f"Total Effective Repair: {totalEffectiveRepair} \n"
        f"Total Compile Success Result: {totalCompileSuccess} \n"
        f"Total Test Success Result: {totalTestSuccess} \n"
        f"Total Effective Unit Test Result: {totalSuccess} \n"
    )
