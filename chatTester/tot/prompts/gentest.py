# System role prompt for intention inference
generate_system_role_prompt = """
I want you to play the role of a professional who writes Java test method.
"""

vote_system_role_prompt = """
I want you to play the role of a professional who evaluates unit test.
"""

compare_system_role_prompt = """
I want you to play the role of a professional who compares two unit test.
"""

# Instruction for generating test method
generate_prompt = """
{Composit_prompt}
\n\n# Instruction\nPlease carefully read the plan and test cases above. First, understand what the focal method is intended to do, and what testing strategies were proposed. 
Then, generate a test method for the "{focal_method_name}" according to the given `Import information`, `Focal Method Context` and especially the `Method intention and Test Case Planning (it is crucial)`. 
Ensure that the generated test method is compilable, and cannot use the private and undefined method in `Method Context`.\nThe generated code should be enclosed within ``` ```.
"""

generate_prompt_AAA = """
{Composit_prompt}
\n\n# Instruction\n
Generate a unit test for the method "{focal_method_name}" according to the given `Import information`, `Focal Method Context` and especially the `Method intention and Test Case Planning (it is crucial)`.  
Write the unit test step-by-step with each section at a time with previous section(if exist). 
Your output should be of the following format:

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

vote_prompt = """
Given an instruction and several unit test candidates, analyze each candidate based on its correctness, relevance to the focal method, completeness (e.g., edge cases), and clarity. 
Then conclude in the last line: "The best choice is {s}", where s is the integer ID of the best test.
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
