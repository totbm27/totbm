from run import run
from argparse import Namespace

if __name__ == "__main__":

    """arg
    args.add_argument("--backend", type=str, choices=["gpt-4", "gpt-3.5-turbo", "gpt-4o"], default="gpt-4")
    args.add_argument("--temperature", type=float, default=0.7)
    args.add_argument("--max_tokens", type=int, default=None)

    args.add_argument("--task", type=str, required=True, choices=["game24", "text", "crosswords"])
    args.add_argument("--task_start_index", type=int, default=900)
    args.add_argument("--task_end_index", type=int, default=1000)

    args.add_argument("--naive_run", action="store_true")  # if True, run naive IO/CoT sampling instead of ToT + BFS.
    args.add_argument(
        "--prompt_sample", type=str, choices=["standard", "cot"]
    )  # only used when method_generate = sample, or naive_run

    args.add_argument(
        "--method_generate", type=str, choices=["sample", "propose"]
    )  # sample independent thoughts (used in Creative Writing) or propose sequential thoughts (used in Game of 24)
    args.add_argument(
        "--method_evaluate", type=str, choices=["value", "vote"]
    )  # value states independently (used in Game of 24) or vote on states together (used in Creative Writing)
    args.add_argument(
        "--method_select", type=str, choices=["sample", "greedy"], default="greedy"
    )  # sample to select by value random choice or greedy select the best one
    args.add_argument("--n_generate_sample", type=int, default=1)  # only thing needed if naive_run
    args.add_argument("--n_evaluate_sample", type=int, default=1)
    args.add_argument("--n_select_sample", type=int, default=1)
    """

    # Example content for the task intention
    # focal_method_name = "callback(String callback)"
    # PL_Focal_Method = (
    #     "\n"
    #     + "public class InstagramAuthService {\n\n"
    #     + "private String callback;\n"
    #     + "public InstagramAuthService() {\n    this.callback \u003d OAuthConstants.OUT_OF_BAND;\n}\n\n"
    #     + "# Focal method\n"
    #     + 'public InstagramAuthService callback(String callback) {\n    Preconditions.checkValidOAuthCallback(callback, "Callback must be a valid URL or \u0027oob\u0027");\n    this.callback \u003d callback;\n    return this;\n}\n'
    # )

    # content = []
    # content.append(PL_Focal_Method)
    # content.append(focal_method_name)

    # Example content for the task gentest
    focal_method_name = "add(Object e)"
    Composit_prompt = (
        "# Import information\n"
        + "\nimport org.junit.Test;"
        + "\nimport com.zappos.json.util.ObjectArray;"
        + "\n\n# Focal Method Context"
        + "\npublic class ObjectArray {"
        + "\nprivate void ensureExplicitCapacity(int minCapacity);"
        + "\nprivate void ensureCapacityInternal(int minCapacity);"
        + "\nprivate void grow(int minCapacity);"
        + "\nprivate static int hugeCapacity(int minCapacity);"
        + "\npublic boolean add(Object e);"
        + "\npublic Object get(int index);"
        + "\npublic int size();"
        + "\npublic Object[] toArray();"
        + "\npublic T[] toArray(T[] a);"
        + "\n}"
        + "\npublic class ObjectArray {"
        + "\ntransient Object[] elementData;private int size;"
        + "\n# Focal method"
        + "\npublic boolean add(Object e) {"
        + "\n    ensureCapacityInternal(size + 1);"
        + "\n    elementData[size++] = e;"
        + "\n    return true;"
        + "\n}"
        + "\n}"
    )

    content = []
    content.append(Composit_prompt)
    content.append(focal_method_name)

    project_name = "sachin-handiekar_jInstagram"

    # print(content)

    # Set up args with
    args = Namespace(
        backend="gpt-3.5-turbo",
        temperature=0.7,
        max_tokens=None,
        # task="intention",
        task="gentest",
        task_start_index=0,
        task_end_index=1,
        mode="solve",
        prompt_sample="cot",
        method_generate="sample",
        method_evaluate="vote",
        method_select="greedy",
        n_generate_sample=3,
        n_evaluate_sample=3,
        n_select_sample=1,
        taskContent=content,
        log_path_arg=project_name,
    )

    # run(args)
    generated_content_wrap = run(args)[0]

    print(generated_content_wrap)

    # if "Wrap:\n" in generated_content_wrap:
    #     wrap_up = generated_content_wrap.split("Wrap:\n")[-1]
    #     if "Import" in wrap_up:
    #         generated_content = wrap_up
    #     else:
    #         wrap_import = generated_content_wrap.split("Arrange")[0]
    #         wrap_up = generated_content_wrap.split("Wrap:")[-1]
    #         generated_content = "```" + wrap_import + wrap_up + "```"
    # else:
    #     wrap_import = generated_content_wrap.split("Arrange")[0]
    #     wrap_Arrange = "Arrange" + generated_content_wrap.split("Arrange")[-1].split("Act")[0]
    #     wrap_Act = "Act" + generated_content_wrap.split("Arrange")[-1].split("Act")[-1].split("Assert")[0]
    #     wrap_Assert = "Assert" + generated_content_wrap.split("Arrange")[-1].split("Act")[-1].split("Assert")[1]
    #     generated_content = "```" + wrap_import + wrap_Arrange + wrap_Act + wrap_Assert + "```"

    # if "@Test" in generated_content_wrap:
    #     generated_content = generated_content_wrap
    # else:
    #     generated_import = generated_content_wrap.split("Arrange")[0]
    #     generated_method = "// Arrange:" + generated_content_wrap.split("Arrange")[-1]
    #     generated_content = (
    #         "```" + generated_import + "@Test\n" + f"public void test{focal_method_name}() " + "{" + generated_method + "}" + "```"
    #     )

    required_sections = ["// Import", "void", "// Arrange", "// Act", "// Assert"]
    missing = [section for section in required_sections if section not in generated_content_wrap]
    if "```" not in generated_content_wrap:
        generated_content = "```" + generated_content_wrap + "```"
    else:
        generated_content = generated_content_wrap

    if not missing:
        print("no missing")
    else:
        print("Missing sections:", missing)
    print(generated_content)
