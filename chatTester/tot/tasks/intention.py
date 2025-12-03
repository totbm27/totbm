import os
import re
from tot.tasks.base import Task, DATA_PATH
from tot.prompts.intention import *
from tot.models import gpt


class IntentionTask(Task):
    """
    Input (x)   : a focal method name to be tested
    Output (y)  : a focal method intention and unit test planning 
    Reward (r)  : # TODO
    Input Example:
    Output Example:
    """

    def __init__(self, content=None):
        """
        content: a focal method and method name to be tested
        """
        super().__init__()
        self.data = content
        self.steps = 2
        self.stops = ["\nTest Plan:\n", None]

    def __len__(self) -> int:
        return 1

    def get_input(self, idx: int) -> list:
        if idx == 0:  
            return self.data
        else:
            raise IndexError("Index out of range. This task only has one input.")

    def test_output(self, idx: int, output: str, n: int, backend: str):
        output = output.split("Test Plan:\n")[-1]
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
        PL_Focal_Method = x[0]
        focal_method_name = x[1]
        Intention_NL = intention_prompt.format(focal_method_name=focal_method_name) + y
        ask_intention_prompt = PL_Focal_Method + "\n\n" + Intention_NL
        return ask_intention_prompt

    @staticmethod
    def cot_prompt_wrap(x: list, y: str = "") -> str:
        PL_Focal_Method = x[0]
        focal_method_name = x[1]
        Intention_NL = intention_cot_prompt.format(focal_method_name=focal_method_name) + y
        ask_intention_prompt = PL_Focal_Method + "\n\n" + Intention_NL
        return ask_intention_prompt

    @staticmethod
    def vote_prompt_wrap(x: list, ys: list) -> str:
        prompt = vote_prompt
        for i, y in enumerate(ys, 1):
            # y = y.replace('Plan:\n', '')
            # TODO: truncate the plan part?
            prompt += f"Choice {i}:\n{y}\n"
        return prompt

    @staticmethod
    def vote_outputs_unwrap(vote_outputs: list, n_candidates: int) -> list:
        vote_results = [0] * n_candidates
        for vote_output in vote_outputs:
            pattern = r".*best choice is .*(\d+).*"
            match = re.match(pattern, vote_output, re.DOTALL)
            if match:
                vote = int(match.groups()[0]) - 1
                if vote in range(n_candidates):
                    vote_results[vote] += 1
            else:
                print(f"vote no match: {[vote_output]}")
        return vote_results

    @staticmethod
    def compare_prompt_wrap(x: list, ys: list) -> str:
        assert len(ys) == 2, "compare prompt only supports 2 candidates"
        ys = [y.split("Test Plan:\n")[-1] for y in ys]
        prompt = compare_prompt + f"Test Plan 1:\n{ys[0]}\n\Test Plan 2:\n{ys[1]}\n"
        return prompt

    @staticmethod
    def compare_output_unwrap(compare_output: str):
        if "better test plan is 1" in compare_output:
            return 0
        elif "better test plan is 2" in compare_output:
            return 1
        elif "two test plans are similarly good" in compare_output:
            return 0.5
        else:
            print(f"-----------------compare no match: {[compare_output]}")
            return -1

    def get_system_role_prompt(self, method_name: str) -> str:
        if method_name == "standard" or method_name == "cot":
            role_prompt = intention_system_role_prompt
        elif method_name == "propose":
            role_prompt = intention_system_role_prompt
        elif method_name == "vote":
            role_prompt = vote_system_role_prompt
        elif method_name == "value":
            role_prompt = vote_system_role_prompt
        elif method_name == "compare":
            role_prompt = compare_system_role_prompt
        else:
            role_prompt = ""

        return role_prompt
