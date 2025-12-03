# System role prompt for intention inference
intention_system_role_prompt = """
I want you to play the role of a professional who infers method intention.
"""

vote_system_role_prompt = """
I want you to play the role of a professional who evaluates unit test plans.
"""

compare_system_role_prompt = """
I want you to play the role of a professional who compares two unit test plans.
"""

# Prompt for intention inference
intention_prompt = """
Please describe the overall intention of the {focal_method_name} method in as much detail as possible in one sentence.
"""

intention_cot_prompt = """
Please describe the overall intention of the {focal_method_name} method in as much detail as possible in one sentence.
Then, create a test plan that verifies its correctness, including the test objective, input, and expected output as much detail as possible in few sentence.
Your output should follow this format:

Describe:
Your describe here.

Test Plan:
Your best single test plan here.
"""

# Prompt for selecting the best test plan
vote_prompt = """
Given a method and several unit test plans, analyze each plan based on the following criteria:
- Correctness: Does the plan reflect the actual behavior of the method?
- Coverage: Does it include normal, boundary, and invalid cases?
- Clarity: Is the test plan structured, understandable, and actionable?
- Practicality: Are mocking or isolation decisions appropriate?

Then conclude in the last line: "The best choice is {s}", where s is the integer ID of the best plan.
"""

compare_prompt = """
Compare the following two unit test plans for a given method. Evaluate their:
- Accuracy in reflecting the method's behavior
- Completeness of test cases (including edge cases and invalid inputs)
- Clarity and structure
- Appropriateness of mocking/isolation if needed

Conclude in the last line with one of the following:
"The better test plan is 1", "The better test plan is 2", or "The two test plans are similarly good".
"""

score_prompt = """
Evaluate the following unit test plan for a method. Consider:
- How well it understands and covers the method's behavior
- The range and depth of test cases
- The clarity and organization of the plan
- The handling of dependencies (e.g., mocks or stubs)

At the end, conclude with: "Thus the test plan quality score is {s}", where s is an integer from 1 (poor) to 10 (excellent).
"""
