# System role prompt for intention inference
repair_system_role_prompt = """
I want you to play the role of a professional who repairs buggy lines of the test method. Unnecessary import statement can be removed.
"""

vote_system_role_prompt = """
I want you to play the role of a professional who evaluates repairs plan and method.
"""

compare_system_role_prompt = """
I want you to play the role of a professional who compares two repairs plan and method.
"""

# Instruction for compile repair
compile_repair_prompt = """
{Composit_prompt}
\n\n# Instruction\n
The test method has a bug error (marked <Buggy Line>).
Please fix the buggy line based on the given "{Class_Name}" class information (it is crucial) and return the complete and compilable test method after fix. \n
Note that the contents in  "{Class_Name}" class  cannot be modified.\nThe generated code should be enclosed within ``` ```.
"""

compile_repair_tot_prompt = """
{Composit_prompt}
\n\n# Instruction\n
The test method has a bug error (the previous line is marked <Buggy Line> with error messages).
Please fix the buggy line based on the given "{Class_Name}" class information. \n

Your output should be of the following format:

Plan:
Explain how to modify the test to validate behavior appropriately.

Method:
Your repair of the test method include necessary import statements, enclosed within ``` ```.
"""

compile_repair_prompt_noClassName = """
{Composit_prompt}
\n\n# Instruction\n
The test method has a bug error (marked <Buggy Line>). \n 
Please repair the buggy code line and return the complete and compilable test method after repair. \n
Your output should be of the following format:

Plan:
Your fix plan here.

Method:
Your test method include necessary import statements enclosed within ``` ```.
"""

compile_repair_tot_prompt_noClassName = """
{Composit_prompt}
\n\n# Instruction\n
The test method has a bug error (marked <Buggy Line>). \n 
Please repair the buggy code line. \n
Your output should be of the following format:

Plan:
Your fix plan to modify test method here.

Method:
Your test method based on your fix plan, with required import statement. Enclosed within ``` ```.
"""

# Instruction for test repair
test_repair_prompt = """
{Composit_prompt}
\n\n# Instruction\nThe test method throw an error " {ERROR_MESSAGE} " in " {Buggy_line} ".\n
Please analyze the code logic and method intention of the Focal method, then generate a correct assertion statement in the test method. Return the complete and compilable test method for the Focal method.\nThe generated code should be enclosed within ``` ```.
"""

test_repair_tot_prompt = """
{Composit_prompt}
\n\n# Instruction\nThe test method throw an error " {ERROR_MESSAGE} " in " {Buggy_line} ".\n
Please analyze the code logic and method intention of the Focal method, then generate a correct assertion statement in the test method. \n
Your output should be of the following format:

Plan:
Explain how to modify the test to validate behavior appropriately.

Method:
Your repair of the test method include necessary import statements, enclosed within ``` ```.
"""

re_generate_tot_prompt = """
{Composit_prompt}
\n\n# Instruction\n
Please generate a complete and compilable test method for the `Focal Method` based on the `Method Intention` and Class Information. 
The generated test method coverage for the focal method is as comprehensive as possible.
Write the unit test step-by-step with each section at a time with previous section(if exist). 
Your output should be of the following format:

Method:

```

// Import:\n
Your import statements here.

@Test\n
Your test method definition here\n

// Arrange:\n
Your arrange here.

// Act:\n
Your act here.

// Assert:\n
Your assert here.

```

Ensure that the generated test method is compilable, and cannot use the private and undefined method in `Method Context`.
"""

value_plan_prompt = """
Evaluate if the proposed fix plan is reasonable and likely to resolve the test failure (sure/likely/impossible).

Original Code and Error Message:
{Composit_prompt}
Proposed Plan:
{Plan}

Your output should be of the following format:
Evaluation:
Your evaluation here (sure/likely/impossible).
"""


value_method_prompt = """
Evaluate if given repairs can fix the reported error and the test method can pass the compile and test (sure/likely/impossible).

Original Code and Error Message:
{Composit_prompt}
Proposed Plan and Repair Method:
{Fixed_method}

Your output should be of the following format:
Evaluation:
Your evaluation here (sure/likely/impossible).
"""

compare_prompt = """
Compare the following two test method generations in terms of their relevance, completeness, and correctness based on the given focal method. 
Consider how well each test aligns with the method's purpose, handles important edge cases, and follows good testing practices.
Conclude in the last line with one of the following: 
"The better test is 1", "The better test is 2", or "The two tests are similarly good".
"""

score_prompt = """
Evaluate the following unit test in terms of its relevance to the focal method, correctness, completeness (e.g. edge cases), and adherence to good testing practices. 
At the end, conclude with: "Thus the test quality score is {s}", where s is an integer from 1 (poor) to 10 (excellent).
"""

refine_plan_prompt = """
Original Code and Error Message:
{Composit_prompt}
Repair plan:
{ys}
\n\n# Instruction\n
# Instruction
The repair plan above fail to fix the bug or break the test’s intent.
Please re-analyze the original code and explain what the test is meant to verify. Then, provide a new repair plan that is logically sound and leads to a correct, compilable test.
Your output should strictly follow the format below:

Plan:
Explain how to modify the test to validate behavior appropriately, with an example of the corrected line(s).
"""

refine_method_prompt = """
Original Code and Error Message:
{Composit_prompt}
Repair plan and test method:
{ys}
\n\n# Instruction\n
The repair method above fail to fix the bug or break the test’s intent.
Please re-analyze the original code and explain what the test is meant to verify. 
Then, provide a complete and compilable test method based on fix plan.
Your output should strictly follow the format below:

Plan (cannot be modified):
{plan}

Method:
```
// Import:\n
Your import statements here.
@Test\n
Your merged test method definition here\n
// Arrange:\n
Your arrange here.
// Act:\n
Your act here.
// Assert:\n
Your assert here.
```
"""

merge_plan_prompt = """
Original Code and Error Message:
{Composit_prompt}
Repair plan 1:
{ys_1}
Repair plan 2:
{ys_2}
\n\n# Instruction\n
# Instruction
Plans 1 and 2 attempt to fix the test method, but both have issues—some parts may be helpful, while others introduce new errors or fail to address the bug fully.
Please analyze the strengths and weaknesses of both plans. Then, combine the correct ideas or approaches, discard the problematic ones, and produce a new, logically sound and compilable fix that ensures the test behaves as intended.
Your output should strictly follow the format below:

Plan:
Explain how to modify the test to validate behavior appropriately, with an example of the corrected line(s).
"""

merge_method_prompt = """
Original Code and Error Message:
{Composit_prompt}
Repair plan and test method 1:
{ys_1}
Repair plan and test method 2:
{ys_2}
\n\n# Instruction\n
# Instruction
Method 1 and 2 attempt to fix the original code error, but both have issues—some parts may be helpful, while others introduce new errors or fail to address the bug fully.
Please analyze the strengths and weaknesses of both method. 
Then, combine the correct ideas or approaches, discard the problematic ones, provide a complete and compilable test method based on fix plan.
Your output should strictly follow the format below:

Plan (cannot be modified):
{plan}

Method:
```
// Import:\n
Your import statements here.
@Test\n
Your merged test method definition here\n
// Arrange:\n
Your arrange here.
// Act:\n
Your act here.
// Assert:\n
Your assert here.
```
"""
