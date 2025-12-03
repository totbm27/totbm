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

    # Example content for the testRepair type
    focal_method_name = "getText()"
    Composit_prompt = (
        "# Focal method (Cannot be modified)"
        + "\n@Override"
        + "\npublic String getText() {"
        + "\n    throw new UnsupportedOperationException();"
        + "\n}"
        + "\n# Method Intention"
        + "\nThe getText() method in the RectangularTextContainer class is intended to be overridden by subclasses to provide the actual text content to be displayed within the rectangular text container."
        + "\n# Test Method"
        + "\n@Test"
        + "\npublic void testGetTextOverride() {"
        + "\n    class CustomTextContainer extends RectangularTextContainer {"
        + "\n        @Override"
        + "\n        public String getText() {"
        + "\n            return 'Hello, World!';"
        + "\n        }"
        + "\n    }"
        + "\n    [Generate an assertion statement here]"
    )
    repair_type = "testRepair"
    Class_Name = ""
    ERROR_MESSAGE = " org.evosuite.runtime.mock.java.lang.MockError Unresolved compilation problem: Implicit super constructor RectangularTextContainer() is undefined for default constructor. Must define an explicit constructor"
    Buggy_line = ""

    # Example content for the compileRepair_noClassName type
    # focal_method_name = "testMerge()"
    # Composit_prompt = (
    #     "# Test Method"
    #     + "\n@Test"
    #     + "\npublic void testMerge() {"
    #     + "\n    RectangularTextContainer container1 = new RectangularTextContainer(0, 0, 100, 50);"
    #     + "\n    RectangularTextContainer container2 = new RectangularTextContainer(10, 10, 80, 40);"
    #     + "\n    List<TextElement> textElements1 = new ArrayList<>();"
    #     + "\n    textElements1.add(new TextElement('Hello'));"
    #     + "\n    container1.setTextElements(textElements1);"
    #     + "\n    List<TextElement> textElements2 = new ArrayList<>();"

    #     + "\n<Buggy Line>: no suitable constructor found for TextElement(java.lang.String)"
    #     + "\n    textElements2.add(new TextElement('World'));"

    #     + "\n    container2.setTextElements(textElements2);"
    #     + "\n    container1.merge(container2);"
    #     + "\n    List<TextElement> mergedTextElements = container1.getTextElements();"
    #     + "\n    assertEquals(2, mergedTextElements.size());"
    #     + "\n    assertEquals('Hello', mergedTextElements.get(0).getText());"
    #     + "\n    assertEquals('World', mergedTextElements.get(1).getText());"
    #     + "\n}"
    # )

    # repair_type = "compileRepair_noClassName"
    # Class_Name = ""
    # ERROR_MESSAGE = ""
    # Buggy_line = ""

    # Example content for the compileRepair type
    # focal_method_name = "InstagramAuthService()"
    # Composit_prompt = (
    #     "# InstagramAuthService class"
    #     + "\npackage org.jinstagram.auth;"
    #     + "\npublic class InstagramAuthService {"
    #     + "\npublic InstagramAuthService();"
    #     + "\npublic InstagramAuthService callback(String callback);"
    #     + "\npublic InstagramAuthService apiKey(String apiKey);"
    #     + "\npublic InstagramAuthService apiSecret(String apiSecret);"
    #     + "\npublic InstagramAuthService scope(String scope);"
    #     + "\npublic InstagramAuthService display(String display);"
    #     + "\npublic InstagramAuthService proxy(Proxy requestProxy);"
    #     + "\npublic InstagramService build();"
    #     + "\n}"
    #     + "\n# Test Method"
    #     + "\n    @Test"
    #     + "\n    public void testCallbackValidURL() {"
    #     + "\n        InstagramAuthService authService = new InstagramAuthService();"
    #     + "\n        String validCallback = 'https://example.com/callback';"
    #     + "\n        InstagramAuthService updatedAuthService = authService.callback(validCallback);"
    #     + "\n    <Buggy Line>: cannot find symbol method 'getCallback()' in InstagramAuthService"
    #     + "\n        assertEquals(validCallback, updatedAuthService.getCallback());"
    #     + "\n    }"
    # )

    # repair_type = "compileRepair"
    # Class_Name = "InstagramAuthService"
    # ERROR_MESSAGE = ""
    # Buggy_line = ""

    # Example content for the compileRepair type
    # focal_method_name = "getAPILimitStatus(Map<String, String> headers)"
    # Composit_prompt = (
    #     "# Focal Method"
    #     + "\npublic  final class APILimitUtils {"
    #     + "\nprotected static final String LIMIT_HEADER_KEY = 'X-Ratelimit-Limit';"
    #     + "\nprivate APILimitUtils() {"
    #     + "\n}"
    #     + "\n# Focal method"
    #     + "\npublic static int getAPILimitStatus(Map<String, String> headers) {"
    #     + "\n    return APILimitUtils.getIntegerValue(headers, LIMIT_HEADER_KEY);"
    #     + "\n}"
    #     + "\n}"
    #     + "\n# Method Intention"
    #     + "\nThe getAPILimitStatus method aims to extract and return the integer value associated with the 'X-Ratelimit-Limit' key from the provided headers map, serving as a utility function within the APILimitUtils class to facilitate access to API rate limit information."
    #     + "\n# Instruction"
    #     + "\nPlease generate a complete and compilable test method for the `Focal Method` based on the `Method Intention` and Class Information. "
    #     + "\nThe generated test method coverage for the focal method is as comprehensive as possible, and the generated code should be enclosed within ``` ```."
    # )

    # repair_type = "re_Generate"
    # Class_Name = ""
    # ERROR_MESSAGE = ""
    # Buggy_line = ""

    content = []
    content.append(Composit_prompt)
    content.append(focal_method_name)
    content.append(repair_type)
    content.append(Class_Name)
    content.append(ERROR_MESSAGE)
    content.append(Buggy_line)

    project_name = "sachin-handiekar_jInstagram"

    # print(content)

    # Set up args with
    args = Namespace(
        backend="gpt-3.5-turbo",
        # backend="gpt-4",
        temperature=0.7,
        max_tokens=None,
        task="repair",
        task_start_index=0,
        task_end_index=1,
        # naive_run=False,
        # mode="solve",
        mode="merge_solve",
        prompt_sample="cot",
        method_generate="sample",
        method_evaluate="value",
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
