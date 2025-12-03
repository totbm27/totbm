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
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Some input files use or override a deprecated API.
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramClient.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.458 s
[INFO] Finished at: 2025-07-10T19:42:17+08:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US

########## Test INFO ##########
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
[INFO] Compiling 9 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ jInstagram ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
19:42:28.198 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
19:42:28.212 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
19:42:28.220 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
19:42:28.222 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 51225
19:42:28.511 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.auth.oauth.InstagramService_ESTest
19:42:30.275 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
19:42:30.275 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-Shutdown"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
19:42:30.276 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
19:42:30.323 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthRequest
19:42:30.372 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
19:42:30.658 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
19:42:30.659 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
19:42:30.665 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Request
19:42:30.671 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
19:42:30.680 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
19:42:30.680 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
19:42:30.681 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.exceptions.OAuthException
19:42:30.681 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
19:42:30.684 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
19:42:30.687 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.AccessTokenExtractor
19:42:30.688 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Response
19:42:30.689 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Response
19:42:30.700 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Response
19:42:30.701 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EMPTY_RESPONSE
19:42:30.704 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Verbs
19:42:30.706 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
19:42:30.709 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
19:42:30.712 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.oauth.InstagramService
19:42:30.713 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
19:42:30.718 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
19:42:30.719 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
19:42:30.719 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
19:42:30.720 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramClient
19:42:30.729 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Verifier
19:42:30.730 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
19:42:30.736 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
19:42:30.737 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthConfig
19:42:30.737 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
19:42:30.739 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
19:42:30.740 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Token
19:42:30.740 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
19:42:30.746 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
19:42:30.749 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.utils.Preconditions
19:42:30.752 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
19:42:30.757 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
19:42:30.765 [main] ERROR org.evosuite.runtime.classhandling.ClassStateSupport - Class org.jinstagram.auth.InstagramApi was not instrumented by EvoSuite. This could happen if you are running JUnit tests in a way that is not handled by EvoSuite, in which some classes are loaded be reflection before the tests are run. Consult the EvoSuite documentation for possible workarounds for this issue.
19:42:30.811 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.auth.InstagramApi
19:42:30.817 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.URLUtils$EncodingRule
19:42:30.818 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.URLUtils
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.059 s -- in org.jinstagram.auth.oauth.InstagramService_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.269 s
[INFO] Finished at: 2025-07-10T19:42:31+08:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Warning: the fonts "Times" and "Lucida Bright" are not available for the Java logical font "Serif", which may have unexpected appearance or behavior. Re-enable the "Times" font to remove this warning.
