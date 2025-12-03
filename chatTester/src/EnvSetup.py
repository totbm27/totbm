import os
from dotenv import load_dotenv


# Setup env variables for the project
class EnvSetup:
    def __init__(self):
        self.current_dir = os.path.dirname(os.path.abspath(__file__))
        self.chatTesterDir = os.path.dirname(self.current_dir)
        self.env = None
        self.api_key = None

    def setup_env(self):
        load_dotenv(os.path.join(self.current_dir, "../..", ".env"))

        # Set JAVA_HOME
        os.environ["JAVA_HOME"] = os.getenv("java_home")
        self.env = os.environ.copy()
        self.env["JAVA_TOOL_OPTIONS"] = "-Duser.language=en -Duser.country=US"

        # Set OpenAI API key
        self.api_key = os.getenv("OPENAI_API_KEY")

    def get_env(self):
        if self.env is None:
            self.setup_env()
        return self.env

    def get_api_key(self):
        if self.api_key is None:
            self.setup_env()
        return self.api_key
