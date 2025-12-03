import os
import openai
from openai import OpenAI
import backoff
import torch
from transformers import AutoTokenizer, AutoModelForCausalLM
from src.EnvSetup import EnvSetup

api_key = EnvSetup.get_api_key()

completion_tokens = prompt_tokens = 0

api_key = os.getenv("OPENAI_API_KEY")

if api_key != "":
    client = OpenAI(api_key=api_key)
else:
    print("Warning: OPENAI_API_KEY is not set")



# Call the OpenAI API with backoff
@backoff.on_exception(backoff.expo, openai.OpenAIError)
def completions_with_backoff(**kwargs):
    return client.chat.completions.create(**kwargs)


# Set the prompt message and model
def generate(prompt, model="gpt-4", temperature=0, n=1, stop=None) -> list:
    if "gpt" in model:
        messages = [
            {
                "role": "system",
                "content": "I want you to play the role of a professional who repairs buggy lines of the test method. Unnecessary import statement can be removed.",
            },
            {"role": "user", "content": prompt},
        ]
        return chatgpt(messages, model=model, temperature=temperature, n=n, stop=stop)
    elif model == "CodeLlama-34b-Instruct":
        # Set syetem prompt
        B_SYS, E_SYS = "<<SYS>>\n", "\n<</SYS>>\n\n"
        system_prompt = """
        You are a helpful, respectful and honest assistant with a deep knowledge of code and software design. Always answer as helpfully as possible, while being safe. Your answers should not include any harmful, unethical, racist, sexist, toxic, dangerous, or illegal content. Please ensure that your responses are socially unbiased and positive in nature.
        If a question does not make any sense, or is not factually coherent, explain why instead of answering something not correct. If you don't know the answer to a question, please don't share false information.
        """
        system_prompt = f"{B_SYS}{system_prompt}{E_SYS}"
        problem_prompt = system_prompt + "[INST] {instruction} [/INST]"

        # Set instruction prompt
        role = "I want you to play the role of a professional who repairs buggy lines of the test method."
        instruction = role + "\n\n" + prompt
        prompt = problem_prompt.format(instruction=instruction)
        return llm_models(prompt)

    elif model == "CodeFuse-CodeLlama":
        # Set syetem prompt
        HUMAN_ROLE_START_TAG = "<|role_start|>human<|role_end|>"
        BOT_ROLE_START_TAG = "<|role_start|>bot<|role_end|>"
        problem_prompt = HUMAN_ROLE_START_TAG + "{instruction}" + BOT_ROLE_START_TAG

        # Set instruction prompt
        role = "I want you to play the role of a professional who repairs buggy lines of the test method."
        instruction = role + "\n\n" + prompt
        prompt = problem_prompt.format(instruction=instruction)
        return llm_models(prompt)


def chatgpt(messages, model="gpt-4", temperature=0.7, n=1, stop=None) -> list:
    global completion_tokens, prompt_tokens
    outputs = []
    while n > 0:
        cnt = min(n, 20)
        n -= cnt
        res = completions_with_backoff(model=model, messages=messages, temperature=temperature, n=cnt, stop=stop)
        outputs.extend([choice.message.content for choice in res.choices])
        # log completion tokens
        completion_tokens += res.usage.completion_tokens
        prompt_tokens += res.usage.prompt_tokens
    return outputs


def llm_models(prompt, model="CodeLlama-34b-Instruct"):
    if model == "CodeLlama-34b-Instruct":
        tokenizer = AutoTokenizer.from_pretrained(model, use_fast=False)
        model = AutoModelForCausalLM.from_pretrained(model, low_cpu_mem_usage=True, torch_dtype=torch.float16).cuda()
    elif model == "CodeFuse-CodeLlama":
        tokenizer = AutoTokenizer.from_pretrained(model, use_fast=False)
        model = AutoModelForCausalLM.from_pretrained(model, low_cpu_mem_usage=True, torch_dtype=torch.float16).cuda()
    input_ids = tokenizer([prompt]).input_ids
    output_ids = model.generate(torch.as_tensor(input_ids).cuda(), max_new_tokens=1024, max_length=2048)
    output_ids = output_ids[0][len(input_ids[0]):]
    outputs = tokenizer.decode(output_ids, skip_special_tokens=True).strip()
    return outputs


def gpt_usage(backend="gpt-4"):
    global completion_tokens, prompt_tokens
    if backend == "gpt-4":
        cost = completion_tokens / 1000 * 0.06 + prompt_tokens / 1000 * 0.03
    elif backend == "gpt-3.5-turbo":
        cost = completion_tokens / 1000 * 0.002 + prompt_tokens / 1000 * 0.0015
    elif backend == "gpt-4o":
        cost = completion_tokens / 1000 * 0.00250 + prompt_tokens / 1000 * 0.01
    return {"completion_tokens": completion_tokens, "prompt_tokens": prompt_tokens, "cost": cost}
