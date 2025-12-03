original test path: /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java
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
[INFO] Compiling 2 source files with javac [debug target 1.7] to target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] bootstrap class path not set in conjunction with -source 1.7
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[59,20] incompatible types: com.zappos.json.format.ValueFormatter<java.lang.Object> cannot be converted to com.zappos.json.format.JavaDateFormatter
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[64,53] cannot find symbol
  symbol:   class JavaSqlDateFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[69,55] cannot find symbol
  symbol:   class JavaTimestampFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[74,56] cannot find symbol
  symbol:   class BigIntegerFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[79,56] cannot find symbol
  symbol:   class BigDecimalFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[82,13] cannot find symbol
  symbol:   variable Reflections
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[83,91] cannot find symbol
  symbol:   class LocalDate
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[85,59] cannot find symbol
  symbol:   class JavaTimeLocalDateFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[89,13] cannot find symbol
  symbol:   variable Reflections
  location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[92,57] cannot find symbol
  symbol:   class JavaTimeInstantFormatter
  location: class com.zappos.json.ZapposJson_ESTest
[INFO] 10 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.519 s
[INFO] Finished at: 2025-06-23T15:40:04+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[59,20] incompatible types: com.zappos.json.format.ValueFormatter<java.lang.Object> cannot be converted to com.zappos.json.format.JavaDateFormatter
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[64,53] cannot find symbol
[ERROR]   symbol:   class JavaSqlDateFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[69,55] cannot find symbol
[ERROR]   symbol:   class JavaTimestampFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[74,56] cannot find symbol
[ERROR]   symbol:   class BigIntegerFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[79,56] cannot find symbol
[ERROR]   symbol:   class BigDecimalFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[82,13] cannot find symbol
[ERROR]   symbol:   variable Reflections
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[83,91] cannot find symbol
[ERROR]   symbol:   class LocalDate
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[85,59] cannot find symbol
[ERROR]   symbol:   class JavaTimeLocalDateFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[89,13] cannot find symbol
[ERROR]   symbol:   variable Reflections
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/ZapposJson_ESTest.java:[92,57] cannot find symbol
[ERROR]   symbol:   class JavaTimeInstantFormatter
[ERROR]   location: class com.zappos.json.ZapposJson_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
