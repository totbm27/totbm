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
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[9,33] cannot find symbol
  symbol:   class OAuthException
  location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[10,33] cannot find symbol
  symbol:   class OAuthConfig
  location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[11,33] cannot find symbol
  symbol:   class OAuthRequest
  location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[12,33] cannot find symbol
  symbol:   class OAuthConstants
  location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,33] cannot find symbol
  symbol:   class InstagramApi
  location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[15,33] cannot find symbol
  symbol:   class Response
  location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[18,29] package org.jinstagram.client does not exist
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[19,33] cannot find symbol
  symbol:   class InstagramApi
  location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[20,28] cannot find symbol
  symbol:   class OAuthConstants
  location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[21,28] cannot find symbol
  symbol:   class Response
  location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[22,28] cannot find symbol
  symbol:   class Token
  location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[23,28] cannot find symbol
  symbol:   class Verifier
  location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[62,5] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[62,42] cannot find symbol
  symbol:   class Response
  location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[81,47] no suitable method found for thenReturn(java.lang.String)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
    method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
      (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[INFO] 15 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.194 s
[INFO] Finished at: 2025-06-20T13:31:15+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.0:testCompile (default-testCompile) on project jInstagram: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[9,33] cannot find symbol
[ERROR]   symbol:   class OAuthException
[ERROR]   location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[10,33] cannot find symbol
[ERROR]   symbol:   class OAuthConfig
[ERROR]   location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[11,33] cannot find symbol
[ERROR]   symbol:   class OAuthRequest
[ERROR]   location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[12,33] cannot find symbol
[ERROR]   symbol:   class OAuthConstants
[ERROR]   location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[14,33] cannot find symbol
[ERROR]   symbol:   class InstagramApi
[ERROR]   location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[15,33] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: package org.jinstagram.auth.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[18,29] package org.jinstagram.client does not exist
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[19,33] cannot find symbol
[ERROR]   symbol:   class InstagramApi
[ERROR]   location: package org.jinstagram.auth.oauth
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[20,28] cannot find symbol
[ERROR]   symbol:   class OAuthConstants
[ERROR]   location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[21,28] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[22,28] cannot find symbol
[ERROR]   symbol:   class Token
[ERROR]   location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[23,28] cannot find symbol
[ERROR]   symbol:   class Verifier
[ERROR]   location: package org.jinstagram.model
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[62,5] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[62,42] cannot find symbol
[ERROR]   symbol:   class Response
[ERROR]   location: class org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java:[81,47] no suitable method found for thenReturn(java.lang.String)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR]     method org.mockito.stubbing.OngoingStubbing.thenReturn(org.jinstagram.http.Verbs,org.jinstagram.http.Verbs...) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to org.jinstagram.http.Verbs)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
