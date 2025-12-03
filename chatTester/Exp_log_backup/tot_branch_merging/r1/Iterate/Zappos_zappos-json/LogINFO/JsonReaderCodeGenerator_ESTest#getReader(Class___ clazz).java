original test path: /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[42,29] cannot find symbol
  symbol:   method mock(java.lang.Class<com.zappos.json.ZapposJson>)
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[43,45] cannot find symbol
  symbol:   method mock(java.lang.Class<com.zappos.json.JsonBeanIntrospector>)
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[44,43] cannot find symbol
  symbol:   method mock(java.lang.Class<com.zappos.json.JsonReaderInvoker>)
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[47,62] cannot find symbol
  symbol:   method spy(java.util.concurrent.ConcurrentHashMap<java.lang.Object,java.lang.Object>)
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[48,17] cannot find symbol
  symbol:   class SomeClass
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[51,5] cannot find symbol
  symbol:   class Field
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[56,56] cannot find symbol
  symbol:   class SomeClass
  location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[INFO] 7 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.967 s
[INFO] Finished at: 2025-06-26T14:35:40+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[42,29] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<com.zappos.json.ZapposJson>)
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[43,45] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<com.zappos.json.JsonBeanIntrospector>)
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[44,43] cannot find symbol
[ERROR]   symbol:   method mock(java.lang.Class<com.zappos.json.JsonReaderInvoker>)
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[47,62] cannot find symbol
[ERROR]   symbol:   method spy(java.util.concurrent.ConcurrentHashMap<java.lang.Object,java.lang.Object>)
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[48,17] cannot find symbol
[ERROR]   symbol:   class SomeClass
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[51,5] cannot find symbol
[ERROR]   symbol:   class Field
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/JsonReaderCodeGenerator_ESTest.java:[56,56] cannot find symbol
[ERROR]   symbol:   class SomeClass
[ERROR]   location: class com.zappos.json.JsonReaderCodeGenerator_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
