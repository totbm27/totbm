original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java
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
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramBase.java: Some input files use or override a deprecated API.
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramBase.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[33,34] constructor Caption in class org.jinstagram.entity.common.Caption cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[34,35] constructor Comments in class org.jinstagram.entity.common.Comments cannot be applied to given types;
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[38,33] constructor Images in class org.jinstagram.entity.common.Images cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[39,32] constructor Likes in class org.jinstagram.entity.common.Likes cannot be applied to given types;
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[41,35] constructor Location in class org.jinstagram.entity.common.Location cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[42,35] cannot find symbol
  symbol:   method of(java.lang.String,java.lang.String)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[44,31] constructor User in class org.jinstagram.entity.common.User cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[46,51] constructor UsersInPhoto in class org.jinstagram.entity.common.UsersInPhoto cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[46,78] constructor UsersInPhoto in class org.jinstagram.entity.common.UsersInPhoto cannot be applied to given types;
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[30,30] no suitable constructor found for OAuthConfig(java.lang.String,java.lang.String,java.lang.String)
    constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
    constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String,java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
    constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
[INFO] 10 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.397 s
[INFO] Finished at: 2025-05-21T05:11:27+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[33,34] constructor Caption in class org.jinstagram.entity.common.Caption cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[34,35] constructor Comments in class org.jinstagram.entity.common.Comments cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: int
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[38,33] constructor Images in class org.jinstagram.entity.common.Images cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[39,32] constructor Likes in class org.jinstagram.entity.common.Likes cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: int
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[41,35] constructor Location in class org.jinstagram.entity.common.Location cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[42,35] cannot find symbol
[ERROR]   symbol:   method of(java.lang.String,java.lang.String)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[44,31] constructor User in class org.jinstagram.entity.common.User cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[46,51] constructor UsersInPhoto in class org.jinstagram.entity.common.UsersInPhoto cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[46,78] constructor UsersInPhoto in class org.jinstagram.entity.common.UsersInPhoto cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found: java.lang.String
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[30,30] no suitable constructor found for OAuthConfig(java.lang.String,java.lang.String,java.lang.String)
[ERROR]     constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String,java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor org.jinstagram.auth.model.OAuthConfig.OAuthConfig(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
