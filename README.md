# ToT Branch Merging

## Setup

set up :

- `java_home`
- `OPENAI_API_KEY` in `.env`
- `model_path`
- `Intention`, `ToT`, `Merge` Tag
- `projects_name`

## Experiment

### Step 1

Nagivate to `./ExperimentCode`

Run `InitialPhrase_Experiment.py`

-> Create `Contain_intention` file with projects name child files

-> Gen test code at `Contain_intention/{project_name}/GeneratedTest`

-> Create `Contain_intention/result_1.json` for metadata with:

- original file path (src code)
- generated file path (generated unit test)
- compile times
- test times

### Step 2-1

Run `ChatGptTester.py`

> Iterate to repair code(`ChatGptTester()`)

-> Read code from `Contain_intention/{project_name}/result_1.json`

-> Create `Iterate` file to save iteration repair `GeneratedTest`, `RepairProcess`(repair logs)

-> Create `final_result.json` for metadata with:

- original file path (src code)
- generated file path (generated unit test)
- IterateTimes
- Compile_result(1 for pass)
- Test_result(1 for pass)
  
### Step 2-2

> Process the iteration result(`ProceFinalResult()`)

-> Read iterate repair code from `Iterate/{project_name}/final_result.json`

-> select unit test with - `Compile_result == 1` and `Test_result == 1`

-> Create `IterateResultDeal` file to save selected `GeneratedTest`

-> Create `final_result.json` for metadata with:

- original file path (src code)
- generated file path (generated unit test) 
- IterateTimes
- Compile_result(need to be 1)
- Test_result(need to be 1)

## Coverage Calculate

### Step 1

Navigate to `./CoverageCal`

Run `Mergy.py`

-> copy generated code from `IterateResultDeal/{project_name}/final_result.json` to `./ProjectResult/ChatTester/{project_name}`

-> merge generated code by class

### Step 2

Run `script/jacoco.py`

-> copy generated code from `./ProjectResult/ChatTester/{project_name}` to `repos/{project_name}/src/test`

-> execute jacoco

-> get covarage from `target/jacoco-report/index.html`

## Experiment Result Calculate

### Step 1

Run `IterationsCal.py`

-> Read result from `Iterate/{project_name}/final_result.json`

- Total Iterate Times : Add all iterate times
- Total Effective Iterate Times : Iterate times where `"Compile_result": 1`
- Total Effective Repair : Iterate times where `"Test_result": 1`
- Total Compile Success Result : Count `"Compile_result": 1`
- Total Test Success Result : Count `"Test_result": 1`
- Total Effective Unit Test Result : Count `"Test_result": 1` and `"Compile_result": 1`


## note

> project run times
> 
> sachin-handiekar_jInstagram / 449
> 
> tabulapdf_tabula-java / 90
> 
> Zappos_zappos-json / 139


<!-- # ToT

`run.py` get task

`bfs.py` -> `solve` Method to gen tree

-> get input(`code to test`)

-> generate(`sample`): `new_ys`

-> evaluation(`vote`): `values`

-> selection(`greedy`): get result(`select_new_ys`) by values

-> output final result: `ys` -->

# Thesis

## Experiment result file

-> `ExperimentCode/Contain_intention`

-> `ExperimentCode/Iterate`

-> `ExperimentCode/IterateResultDeal`

## Experiment result logs
in `Exp_log_backup/`

r1 -> repair from `origin_chattester/r1/Contain_intention` 

_4.1mini -> run with `gpt-4.1-mini`

```file tree
    -- java1.6test # Specify version
    
    -- origin_chattester # Original chatTester method experiment
    
    -- prompt # Prompt experiment
    
    -- threshold # Threshold experiment
    
    -- tot_intention_gen_repair # ToT method in intention, generate, repair part

    -- tot_intention_gen_simple_repair # ToT method in intention, generate part
    
    -- tot_intention_simple_gen_repair # ToT method in intention part
    
    -- tot_branch_merging # tot branch merging method

    -- tot_repair # tot method
    
    -- errorcaselog # Error case sample

    -- promptcontent # less prompt content
tot_repair_v3

```

