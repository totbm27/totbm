original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java
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
[INFO] --- enforcer:1.0:enforce (enforce-maven) @ jInstagram ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ jInstagram ---
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/resources
[INFO] 
[INFO] --- compiler:3.0:compile (default-compile) @ jInstagram ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[38,39] no suitable method found for thenReturn(java.lang.String)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[46,9] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[46,33] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[49,14] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,42] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,16] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,42] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,16] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[57,42] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[57,16] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[58,42] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[58,16] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[59,42] cannot find symbol
  symbol:   variable OAuthConstants
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[59,16] cannot find symbol
  symbol:   variable request
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[INFO] 14 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.441 s
[INFO] Finished at: 2025-05-06T20:52:22+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[38,39] no suitable method found for thenReturn(java.lang.String)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[46,9] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[46,33] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[49,14] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,42] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[55,16] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,42] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[56,16] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[57,42] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[57,16] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[58,42] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[58,16] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[59,42] cannot find symbol
[ERROR]   symbol:   variable OAuthConstants
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[59,16] cannot find symbol
[ERROR]   symbol:   variable request
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
