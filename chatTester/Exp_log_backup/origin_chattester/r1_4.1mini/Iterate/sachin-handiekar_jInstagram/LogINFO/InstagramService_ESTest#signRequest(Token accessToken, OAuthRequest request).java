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
[INFO] Total time:  6.371 s
[INFO] Finished at: 2025-07-15T17:30:49+08:00
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
17:31:00.156 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
17:31:00.174 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
17:31:00.186 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
17:31:00.186 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 50913
17:31:00.462 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.auth.oauth.InstagramService_ESTest
17:31:03.667 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
17:31:03.667 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
17:31:03.668 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
17:31:03.717 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthRequest
17:31:03.773 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
17:31:04.097 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
17:31:04.099 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
17:31:04.104 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Request
17:31:04.108 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
17:31:04.118 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
17:31:04.118 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
17:31:04.120 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.exceptions.OAuthException
17:31:04.120 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
17:31:04.123 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
17:31:04.125 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.InstagramApi
17:31:04.126 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
17:31:04.132 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
17:31:04.133 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.AccessTokenExtractor
17:31:04.134 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Response
17:31:04.135 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Response
17:31:04.145 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Response
17:31:04.145 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EMPTY_RESPONSE
17:31:04.147 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Verbs
17:31:04.148 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
17:31:04.151 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
17:31:04.154 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.oauth.InstagramService
17:31:04.155 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
17:31:04.164 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
17:31:04.164 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
17:31:04.164 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
17:31:04.165 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramClient
17:31:04.173 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Verifier
17:31:04.175 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
17:31:04.178 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
17:31:04.179 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthConfig
17:31:04.179 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
17:31:04.181 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
17:31:04.182 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Token
17:31:04.182 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
17:31:04.191 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
17:31:04.195 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.utils.Preconditions
17:31:04.199 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
17:31:04.208 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
17:31:04.269 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.URLUtils
17:31:04.271 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/URLUtils
17:31:04.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/URLUtils
17:31:04.291 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.URLUtils$EncodingRule
17:31:04.297 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/URLUtils$EncodingRule
17:31:04.301 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/URLUtils$EncodingRule
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.555 s -- in org.jinstagram.auth.oauth.InstagramService_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13.140 s
[INFO] Finished at: 2025-07-15T17:31:04+08:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Warning: the fonts "Times" and "Lucida Bright" are not available for the Java logical font "Serif", which may have unexpected appearance or behavior. Re-enable the "Times" font to remove this warning.
