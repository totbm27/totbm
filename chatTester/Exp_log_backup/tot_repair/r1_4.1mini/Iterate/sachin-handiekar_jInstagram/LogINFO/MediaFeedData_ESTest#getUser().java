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
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Some input files use or override a deprecated API.
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 10 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[69,41] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[69,9] no suitable method found for assertEquals(org.jinstagram.entity.common.User,org.jinstagram.entity.common.User,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[72,47] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[73,53] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[74,53] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[75,62] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[76,48] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[77,55] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[INFO] 8 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.200 s
[INFO] Finished at: 2025-07-16T10:41:42+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[69,41] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[69,9] no suitable method found for assertEquals(org.jinstagram.entity.common.User,org.jinstagram.entity.common.User,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; org.jinstagram.entity.common.User cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[72,47] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[73,53] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[74,53] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[75,62] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[76,48] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/users/feed/MediaFeedData_ESTest.java:[77,55] user has private access in org.jinstagram.entity.users.feed.MediaFeedData
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
