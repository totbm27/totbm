original test path: /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java
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
[INFO] Compiling 3 source files with javac [debug target 1.7] to target/test-classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] bootstrap class path not set in conjunction with -source 1.7
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[44,34] cannot find symbol
  symbol:   class TestClass
  location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[46,23] incompatible types: java.lang.Class<capture#1 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[47,9] no suitable method found for assertEquals(java.lang.Class<java.lang.Integer>,java.lang.Class<capture#2 of ?>,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[50,36] cannot find symbol
  symbol:   class TestClass
  location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[52,20] incompatible types: java.lang.Class<capture#3 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[55,32] cannot find symbol
  symbol:   class TestClass
  location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[57,20] incompatible types: java.lang.Class<capture#4 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[60,52] incompatible types: java.lang.Class<capture#5 of ?> cannot be converted to java.lang.String
[INFO] 8 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.147 s
[INFO] Finished at: 2025-07-10T18:03:59+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project zappos-json: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[44,34] cannot find symbol
[ERROR]   symbol:   class TestClass
[ERROR]   location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[46,23] incompatible types: java.lang.Class<capture#1 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[47,9] no suitable method found for assertEquals(java.lang.Class<java.lang.Integer>,java.lang.Class<capture#2 of ?>,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; java.lang.Class<java.lang.Integer> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[50,36] cannot find symbol
[ERROR]   symbol:   class TestClass
[ERROR]   location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[52,20] incompatible types: java.lang.Class<capture#3 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[55,32] cannot find symbol
[ERROR]   symbol:   class TestClass
[ERROR]   location: class com.zappos.json.util.Reflections_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[57,20] incompatible types: java.lang.Class<capture#4 of ?> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/Zappos_zappos-json/src/test/java/com/zappos/json/util/Reflections_ESTest.java:[60,52] incompatible types: java.lang.Class<capture#5 of ?> cannot be converted to java.lang.String
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
