import os
import openai
from openai import OpenAI
import backoff
from dotenv import load_dotenv

completion_tokens = prompt_tokens = 0

load_dotenv()

if not api_key:
    print("Warning: OPENAI_API_KEY is not set. Please set it in a .env file or environment variables.")
    
client = OpenAI(api_key=api_key)



@backoff.on_exception(backoff.expo, openai.OpenAIError, max_tries=5)
def completions_with_backoff(**kwargs):
    try:
        r = client.chat.completions.create(**kwargs)
        # print(f"Response: {r}")
        return r
    except openai.OpenAIError as e:
        print(f"OpenAIError: {e}")
        raise e

def gpt(prompt, model="gpt-4", temperature=0.7, max_tokens=1000, n=1, stop=None) -> list:
    messages = [{"role": "user", "content": prompt}]
    return chatgpt(messages, model=model, temperature=temperature, max_tokens=max_tokens, n=n, stop=stop)


def system_role_gpt(
    system_role_prompt, prompt, model="gpt-4", temperature=0.7, max_tokens=1000, n=1, stop=None
) -> list:
    messages = [
        {
            "role": "system",
            "content": system_role_prompt,
        },
        {"role": "user", "content": prompt},
    ]
    return chatgpt(messages, model=model, temperature=temperature, max_tokens=max_tokens, n=n, stop=stop)


def chatgpt(messages, model="gpt-4", temperature=0.7, max_tokens=1000, n=1, stop=None) -> list:
    global completion_tokens, prompt_tokens
    outputs = []
    while n > 0:
        cnt = min(n, 20)
        n -= cnt
        if max_tokens is None:
            res = completions_with_backoff(model=model, messages=messages, temperature=temperature, n=cnt, stop=stop)
        else:
            res = completions_with_backoff(
                model=model, messages=messages, temperature=temperature, max_tokens=max_tokens, n=cnt, stop=stop
            )
        outputs.extend([choice.message.content for choice in res.choices])
        # log completion tokens
        completion_tokens += res.usage.completion_tokens
        prompt_tokens += res.usage.prompt_tokens
    return outputs


def gpt_usage(backend="gpt-4"):
    global completion_tokens, prompt_tokens
    if backend == "gpt-4":
        cost = completion_tokens / 1000 * 0.06 + prompt_tokens / 1000 * 0.03
    elif backend == "gpt-3.5-turbo":
        cost = completion_tokens / 1000 * 0.002 + prompt_tokens / 1000 * 0.0015
    elif backend == "gpt-4o":
        cost = completion_tokens / 1000 * 0.00250 + prompt_tokens / 1000 * 0.01
    else:
        cost = completion_tokens / 1000 + prompt_tokens / 1000 
    return {"completion_tokens": completion_tokens, "prompt_tokens": prompt_tokens, "cost": cost}
