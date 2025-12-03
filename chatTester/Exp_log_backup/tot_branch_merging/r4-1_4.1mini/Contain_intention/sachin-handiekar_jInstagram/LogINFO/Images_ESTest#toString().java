original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] -------------------< com.sachinhandiekar:jInstagram >-------------------
[INFO] Building jInstagram 1.2.3-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ jInstagram ---
[INFO] Deleting /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target
[INFO] 
[INFO] --- enforcer:1.0:enforce (enforce-maven) @ jInstagram ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ jInstagram ---
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 86 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Some input files use or override a deprecated API.
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 8 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[24,11] cannot find symbol
  symbol:   method setUrl(java.lang.String)
  location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[25,11] cannot find symbol
  symbol:   method setWidth(int)
  location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[26,11] cannot find symbol
  symbol:   method setHeight(int)
  location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[29,16] cannot find symbol
  symbol:   method setUrl(java.lang.String)
  location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[30,16] cannot find symbol
  symbol:   method setWidth(int)
  location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[31,16] cannot find symbol
  symbol:   method setHeight(int)
  location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[34,14] cannot find symbol
  symbol:   method setUrl(java.lang.String)
  location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[35,14] cannot find symbol
  symbol:   method setWidth(int)
  location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[36,14] cannot find symbol
  symbol:   method setHeight(int)
  location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[INFO] 9 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.339 s
[INFO] Finished at: 2025-07-09T21:07:34+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[24,11] cannot find symbol
[ERROR]   symbol:   method setUrl(java.lang.String)
[ERROR]   location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[25,11] cannot find symbol
[ERROR]   symbol:   method setWidth(int)
[ERROR]   location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[26,11] cannot find symbol
[ERROR]   symbol:   method setHeight(int)
[ERROR]   location: variable lowRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[29,16] cannot find symbol
[ERROR]   symbol:   method setUrl(java.lang.String)
[ERROR]   location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[30,16] cannot find symbol
[ERROR]   symbol:   method setWidth(int)
[ERROR]   location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[31,16] cannot find symbol
[ERROR]   symbol:   method setHeight(int)
[ERROR]   location: variable standardRes of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[34,14] cannot find symbol
[ERROR]   symbol:   method setUrl(java.lang.String)
[ERROR]   location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[35,14] cannot find symbol
[ERROR]   symbol:   method setWidth(int)
[ERROR]   location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/common/Images_ESTest.java:[36,14] cannot find symbol
[ERROR]   symbol:   method setHeight(int)
[ERROR]   location: variable thumbnail of type org.jinstagram.entity.common.ImageData
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
