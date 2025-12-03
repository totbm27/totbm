original test path: /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -----------------------< com.zappos:zappos-json >-----------------------
[INFO] Building zappos-json 0.1-alpha
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ zappos-json ---
[INFO] Deleting /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/target
[INFO] 
[INFO] --- enforcer:1.4.1:enforce (enforce-java) @ zappos-json ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/main/resources
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ zappos-json ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 34 source files with javac [debug target 1.7] to target/classes
[WARNING] bootstrap class path not set in conjunction with -source 1.7
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ zappos-json ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ zappos-json ---
[INFO] Recompiling the module because of changed dependency.
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 4 source files with javac [debug target 1.7] to target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] bootstrap class path not set in conjunction with -source 1.7
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[34,21] setPattern(java.lang.String) in TestJavaDateFormatter cannot implement setPattern(java.lang.String) in com.zappos.json.format.ValueFormatter
  return type void is not compatible with com.zappos.json.format.ValueFormatter<java.util.Date>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[33,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[41,26] getPattern() in TestJavaDateFormatter cannot override getPattern() in com.zappos.json.format.AbstractValueFormatter
  attempting to assign weaker access privileges; was public
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[45,26] toJsonValue(com.zappos.json.ZapposJson,java.lang.String) in TestJavaDateFormatter cannot override toJsonValue(com.zappos.json.ZapposJson,java.lang.String) in com.zappos.json.format.AbstractValueFormatter
  attempting to assign weaker access privileges; was public
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[49,28] constructor ZapposJson in class com.zappos.json.ZapposJson cannot be applied to given types;
  required: boolean
  found: no arguments
  reason: actual and formal argument lists differ in length
[INFO] 5 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.214 s
[INFO] Finished at: 2025-07-10T19:11:36+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[34,21] setPattern(java.lang.String) in TestJavaDateFormatter cannot implement setPattern(java.lang.String) in com.zappos.json.format.ValueFormatter
[ERROR]   return type void is not compatible with com.zappos.json.format.ValueFormatter<java.util.Date>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[33,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[41,26] getPattern() in TestJavaDateFormatter cannot override getPattern() in com.zappos.json.format.AbstractValueFormatter
[ERROR]   attempting to assign weaker access privileges; was public
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[45,26] toJsonValue(com.zappos.json.ZapposJson,java.lang.String) in TestJavaDateFormatter cannot override toJsonValue(com.zappos.json.ZapposJson,java.lang.String) in com.zappos.json.format.AbstractValueFormatter
[ERROR]   attempting to assign weaker access privileges; was public
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaDateFormatter_ESTest.java:[49,28] constructor ZapposJson in class com.zappos.json.ZapposJson cannot be applied to given types;
[ERROR]   required: boolean
[ERROR]   found: no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
