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
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.699 s
[INFO] Finished at: 2025-05-21T15:19:52+08:00
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
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramBase.java: Some input files use or override a deprecated API.
[WARNING] /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/main/java/org/jinstagram/InstagramBase.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ jInstagram ---
[INFO] Copying 3 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.0:testCompile (default-testCompile) @ jInstagram ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ jInstagram ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
15:20:01.449 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
15:20:01.456 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
15:20:01.460 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/home/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/home/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/home/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/home/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/home/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/home/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/home/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/home/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/home/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/home/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/home/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
15:20:01.460 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 231680
15:20:01.678 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.auth.oauth.InstagramService_ESTest
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "process reaper"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "process reaper"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
15:20:01.981 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
15:20:02.008 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthRequest
15:20:02.046 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthRequest
15:20:02.172 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthRequest
15:20:02.172 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field OAUTH_PREFIX
15:20:02.173 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Request
15:20:02.176 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
15:20:02.182 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
15:20:02.182 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
15:20:02.183 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.exceptions.OAuthException
15:20:02.184 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
15:20:02.185 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
15:20:02.186 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.InstagramApi
15:20:02.186 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/InstagramApi
15:20:02.187 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/InstagramApi
15:20:02.188 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.AccessTokenExtractor
15:20:02.190 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Response
15:20:02.190 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Response
15:20:02.192 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Response
15:20:02.192 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EMPTY_RESPONSE
15:20:02.193 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Verbs
15:20:02.193 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
15:20:02.194 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
15:20:02.195 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.oauth.InstagramService
15:20:02.196 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/oauth/InstagramService
15:20:02.197 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/oauth/InstagramService
15:20:02.197 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VERSION
15:20:02.197 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AUTHORIZATION_CODE
15:20:02.198 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramClient
15:20:02.200 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Verifier
15:20:02.201 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Verifier
15:20:02.201 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Verifier
15:20:02.202 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.OAuthConfig
15:20:02.202 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/OAuthConfig
15:20:02.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/OAuthConfig
15:20:02.204 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.model.Token
15:20:02.204 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/model/Token
15:20:02.206 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/model/Token
15:20:02.207 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.utils.Preconditions
15:20:02.207 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
15:20:02.209 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
15:20:02.227 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Mockito
15:20:02.228 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Mockito
15:20:02.234 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Mockito
15:20:02.235 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Matchers
15:20:02.235 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Matchers
15:20:02.237 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Matchers
15:20:02.238 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.hamcrest.Matcher
15:20:02.239 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.MockingProgress
15:20:02.240 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.Answer
15:20:02.241 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationMode
15:20:02.242 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationWithTimeout
15:20:02.242 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationAfterDelay
15:20:02.243 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockitoDebugger
15:20:02.244 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.ThreadSafeMockingProgress
15:20:02.244 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/progress/ThreadSafeMockingProgress
15:20:02.245 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/progress/ThreadSafeMockingProgress
15:20:02.246 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.MockitoCore
15:20:02.246 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/MockitoCore
15:20:02.253 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/MockitoCore
15:20:02.254 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationDataInOrder
15:20:02.255 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.InOrder
15:20:02.256 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NotAMockException
15:20:02.256 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NotAMockException
15:20:02.257 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NotAMockException
15:20:02.258 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoException
15:20:02.258 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoException
15:20:02.259 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoException
15:20:02.260 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationData
15:20:02.260 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainer
15:20:02.261 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockingDetails
15:20:02.262 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.Reporter
15:20:02.264 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/Reporter
15:20:02.269 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/Reporter
15:20:02.271 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.WrongTypeOfReturnValue
15:20:02.271 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
15:20:02.271 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
15:20:02.272 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.FriendlyReminderException
15:20:02.272 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/FriendlyReminderException
15:20:02.272 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/FriendlyReminderException
15:20:02.273 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.SmartNullPointerException
15:20:02.273 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/SmartNullPointerException
15:20:02.273 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/SmartNullPointerException
15:20:02.274 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.InvalidUseOfMatchersException
15:20:02.274 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
15:20:02.274 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
15:20:02.275 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoAssertionError
15:20:02.275 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoAssertionError
15:20:02.275 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoAssertionError
15:20:02.276 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NullInsteadOfMockException
15:20:02.276 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NullInsteadOfMockException
15:20:02.276 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NullInsteadOfMockException
15:20:02.277 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MissingMethodInvocationException
15:20:02.277 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MissingMethodInvocationException
15:20:02.277 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MissingMethodInvocationException
15:20:02.278 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedStubbingException
15:20:02.278 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedStubbingException
15:20:02.279 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedStubbingException
15:20:02.280 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedVerificationException
15:20:02.280 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedVerificationException
15:20:02.280 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedVerificationException
15:20:02.281 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.WantedButNotInvoked
15:20:02.281 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/WantedButNotInvoked
15:20:02.281 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/WantedButNotInvoked
15:20:02.282 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock
15:20:02.282 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
15:20:02.282 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
15:20:02.283 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue
15:20:02.283 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
15:20:02.284 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
15:20:02.284 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.VerificationInOrderFailure
15:20:02.284 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/VerificationInOrderFailure
15:20:02.284 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/VerificationInOrderFailure
15:20:02.285 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NoInteractionsWanted
15:20:02.285 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NoInteractionsWanted
15:20:02.285 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NoInteractionsWanted
15:20:02.285 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooLittleActualInvocations
15:20:02.286 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooLittleActualInvocations
15:20:02.286 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooLittleActualInvocations
15:20:02.286 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NeverWantedButInvoked
15:20:02.286 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NeverWantedButInvoked
15:20:02.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NeverWantedButInvoked
15:20:02.287 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooManyActualInvocations
15:20:02.287 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooManyActualInvocations
15:20:02.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooManyActualInvocations
15:20:02.288 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockUtil
15:20:02.288 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockUtil
15:20:02.289 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/util/MockUtil
15:20:02.290 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockName
15:20:02.290 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.MockHandler
15:20:02.291 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.Plugins
15:20:02.291 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/Plugins
15:20:02.291 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/plugins/Plugins
15:20:02.292 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginRegistry
15:20:02.292 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginRegistry
15:20:02.292 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginRegistry
15:20:02.293 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.PluginSwitch
15:20:02.293 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginLoader
15:20:02.294 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginLoader
15:20:02.294 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginLoader
15:20:02.295 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MockitoConfigurationException
15:20:02.295 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MockitoConfigurationException
15:20:02.296 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MockitoConfigurationException
15:20:02.297 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.DefaultPluginSwitch
15:20:02.297 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
15:20:02.297 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
15:20:02.298 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFinder
15:20:02.299 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFinder
15:20:02.300 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFinder
15:20:02.301 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.Iterables
15:20:02.302 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/collections/Iterables
15:20:02.303 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/collections/Iterables
15:20:02.304 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.MockMaker
15:20:02.305 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFileReader
15:20:02.305 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFileReader
15:20:02.306 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFileReader
15:20:02.307 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.io.IOUtil
15:20:02.307 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/io/IOUtil
15:20:02.311 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/io/IOUtil
15:20:02.314 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptor
15:20:02.315 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Callback
15:20:02.316 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.StackTraceCleanerProvider
15:20:02.318 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.stacktrace.StackTraceCleaner
15:20:02.319 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Answers
15:20:02.319 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Answers
15:20:02.319 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Answers
15:20:02.320 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer
15:20:02.321 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
15:20:02.321 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
15:20:02.322 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls
15:20:02.322 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
15:20:02.323 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
15:20:02.323 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Location
15:20:02.324 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues
15:20:02.324 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
15:20:02.325 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
15:20:02.326 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues
15:20:02.326 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
15:20:02.326 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
15:20:02.327 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.ObjectMethodsGuru
15:20:02.327 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/ObjectMethodsGuru
15:20:02.328 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/ObjectMethodsGuru
15:20:02.328 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MockitoMethod
15:20:02.329 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.AbstractAwareMethod
15:20:02.330 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMocks
15:20:02.330 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
15:20:02.330 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
15:20:02.331 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
15:20:02.331 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
15:20:02.332 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
15:20:02.333 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
15:20:02.333 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
15:20:02.333 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
15:20:02.334 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.answers.CallsRealMethods
15:20:02.334 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/answers/CallsRealMethods
15:20:02.335 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/answers/CallsRealMethods
15:20:02.335 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.MockSettingsImpl
15:20:02.335 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/MockSettingsImpl
15:20:02.336 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/MockSettingsImpl
15:20:02.337 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockSettings
15:20:02.337 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockCreationSettings
15:20:02.339 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.settings.CreationSettings
15:20:02.339 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/settings/CreationSettings
15:20:02.339 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/settings/CreationSettings
15:20:02.341 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.SerializableMode
15:20:02.341 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/mock/SerializableMode
15:20:02.342 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/mock/SerializableMode
15:20:02.344 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockCreationValidator
15:20:02.344 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockCreationValidator
15:20:02.345 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockCreationValidator
15:20:02.346 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockNameImpl
15:20:02.346 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockNameImpl
15:20:02.346 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockNameImpl
15:20:02.347 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerFactory
15:20:02.347 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerFactory
15:20:02.348 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerFactory
15:20:02.348 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.InternalMockHandler
15:20:02.349 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerImpl
15:20:02.365 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerImpl
15:20:02.365 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerImpl
15:20:02.366 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.VoidMethodStubbable
15:20:02.367 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.IOngoingStubbing
15:20:02.367 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.InvocationOnMock
15:20:02.368 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MatchersBinder
15:20:02.368 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/invocation/MatchersBinder
15:20:02.368 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/invocation/MatchersBinder
15:20:02.369 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainerImpl
15:20:02.369 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/InvocationContainerImpl
15:20:02.371 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/stubbing/InvocationContainerImpl
15:20:02.371 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.SingleRegisteredInvocation
15:20:02.371 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/SingleRegisteredInvocation
15:20:02.372 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/SingleRegisteredInvocation
15:20:02.372 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.RegisteredInvocations
15:20:02.373 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.DefaultRegisteredInvocations
15:20:02.373 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/DefaultRegisteredInvocations
15:20:02.374 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/DefaultRegisteredInvocations
15:20:02.374 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.DescribedInvocation
15:20:02.374 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.PrintableInvocation
15:20:02.375 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.StubInfo
15:20:02.376 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.ListUtil$Filter
15:20:02.376 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.NullResultGuardian
15:20:02.377 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/NullResultGuardian
15:20:02.377 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/NullResultGuardian
15:20:02.377 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.InvocationNotifierHandler
15:20:02.378 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/InvocationNotifierHandler
15:20:02.378 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/InvocationNotifierHandler
15:20:02.379 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.listeners.MethodInvocationReport
15:20:02.381 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoSerializationIssue
15:20:02.381 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoSerializationIssue
15:20:02.382 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoSerializationIssue
15:20:02.384 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantationException
15:20:02.384 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantationException
15:20:02.385 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/InstantationException
15:20:02.385 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.NamingPolicy
15:20:02.386 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackFilter
15:20:02.387 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeGenerationException
15:20:02.387 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeGenerationException
15:20:02.387 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeGenerationException
15:20:02.388 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer
15:20:02.389 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer
15:20:02.394 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/Enhancer
15:20:02.395 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator
15:20:02.395 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator
15:20:02.398 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/AbstractClassGenerator
15:20:02.399 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassGenerator
15:20:02.401 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultNamingPolicy
15:20:02.401 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultNamingPolicy
15:20:02.401 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultNamingPolicy
15:20:02.402 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantiatorProvider
15:20:02.402 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantiatorProvider
15:20:02.403 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/creation/instance/InstantiatorProvider
15:20:02.403 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.Instantiator
15:20:02.404 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.ObjenesisInstantiator
15:20:02.404 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/ObjenesisInstantiator
15:20:02.404 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/ObjenesisInstantiator
15:20:02.405 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisStd
15:20:02.405 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisStd
15:20:02.405 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisStd
15:20:02.406 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisBase
15:20:02.406 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisBase
15:20:02.407 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisBase
15:20:02.408 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.Objenesis
15:20:02.408 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.InstantiatorStrategy
15:20:02.409 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.GlobalConfiguration
15:20:02.409 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/GlobalConfiguration
15:20:02.409 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/GlobalConfiguration
15:20:02.410 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.IMockitoConfiguration
15:20:02.410 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.DefaultMockitoConfiguration
15:20:02.411 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/configuration/DefaultMockitoConfiguration
15:20:02.412 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/configuration/DefaultMockitoConfiguration
15:20:02.412 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.AnnotationEngine
15:20:02.413 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.ClassPathLoader
15:20:02.413 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/ClassPathLoader
15:20:02.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/ClassPathLoader
15:20:02.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MOCKITO_CONFIGURATION_CLASS_NAME
15:20:02.414 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.StdInstantiatorStrategy
15:20:02.414 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/StdInstantiatorStrategy
15:20:02.414 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/StdInstantiatorStrategy
15:20:02.415 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.BaseInstantiatorStrategy
15:20:02.415 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/BaseInstantiatorStrategy
15:20:02.415 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/BaseInstantiatorStrategy
15:20:02.416 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.instantiator.ObjectInstantiator
15:20:02.417 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.MockitoMethodProxy
15:20:02.417 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.realmethod.RealMethod
15:20:02.418 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Invocation
15:20:02.419 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.GeneratorStrategy
15:20:02.420 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Predicate
15:20:02.421 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessSwitchCallback
15:20:02.422 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ObjectSwitchCallback
15:20:02.423 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator$Context
15:20:02.424 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Transformer
15:20:02.426 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$1
15:20:02.426 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$1
15:20:02.427 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$Source
15:20:02.427 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$Source
15:20:02.427 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/AbstractClassGenerator$Source
15:20:02.428 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey
15:20:02.428 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory
15:20:02.428 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory
15:20:02.429 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory
15:20:02.429 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Customizer
15:20:02.430 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.TypeUtils
15:20:02.431 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/TypeUtils
15:20:02.433 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/TypeUtils
15:20:02.436 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CollectionUtils
15:20:02.436 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CollectionUtils
15:20:02.437 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CollectionUtils
15:20:02.438 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Signature
15:20:02.438 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Signature
15:20:02.441 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Signature
15:20:02.442 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Type
15:20:02.442 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Type
15:20:02.444 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Type
15:20:02.446 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$1
15:20:02.447 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$1
15:20:02.448 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$2
15:20:02.448 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$2
15:20:02.449 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$Generator
15:20:02.449 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$Generator
15:20:02.451 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory$Generator
15:20:02.452 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultGeneratorStrategy
15:20:02.452 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultGeneratorStrategy
15:20:02.453 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultGeneratorStrategy
15:20:02.454 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassWriter
15:20:02.455 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassWriter
15:20:02.460 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/ClassWriter
15:20:02.461 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassVisitor
15:20:02.462 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter
15:20:02.463 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter
15:20:02.463 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DebuggingClassWriter
15:20:02.465 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodVisitor
15:20:02.466 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.AnnotationVisitor
15:20:02.466 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldVisitor
15:20:02.468 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ByteVector
15:20:02.468 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ByteVector
15:20:02.469 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ByteVector
15:20:02.469 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Item
15:20:02.470 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Item
15:20:02.470 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Item
15:20:02.471 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter
15:20:02.471 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter
15:20:02.475 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter
15:20:02.475 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field hookCounter
15:20:02.477 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassAdapter
15:20:02.477 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassAdapter
15:20:02.478 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassAdapter
15:20:02.479 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter
15:20:02.479 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter
15:20:02.483 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/CodeEmitter
15:20:02.484 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter
15:20:02.485 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter
15:20:02.486 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter
15:20:02.487 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodAdapter
15:20:02.487 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodAdapter
15:20:02.488 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodAdapter
15:20:02.489 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$3
15:20:02.489 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$3
15:20:02.490 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassInfo
15:20:02.490 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassInfo
15:20:02.490 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassInfo
15:20:02.490 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$1
15:20:02.491 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$1
15:20:02.492 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils
15:20:02.492 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils
15:20:02.494 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ReflectUtils
15:20:02.496 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$4
15:20:02.496 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$4
15:20:02.497 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.MethodInfo
15:20:02.497 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/MethodInfo
15:20:02.497 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/MethodInfo
15:20:02.498 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$3
15:20:02.498 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$3
15:20:02.499 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$1
15:20:02.500 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$1
15:20:02.500 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$2
15:20:02.500 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$2
15:20:02.502 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$1
15:20:02.502 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$1
15:20:02.503 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils
15:20:02.504 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils
15:20:02.507 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/EmitUtils
15:20:02.508 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessArrayCallback
15:20:02.509 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ParameterTyper
15:20:02.511 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ArrayDelimiters
15:20:02.511 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
15:20:02.511 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
15:20:02.512 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodWriter
15:20:02.513 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodWriter
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodWriter
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ACC_CONSTRUCTOR
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESERVED
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CHOP_FRAME
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME_EXTENDED
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field APPEND_FRAME
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FULL_FRAME
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MAXS
15:20:02.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NOTHING
15:20:02.524 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Label
15:20:02.524 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Label
15:20:02.526 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Label
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field DEBUG
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESOLVED
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZED
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field PUSHED
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field TARGET
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field STORE
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field REACHABLE
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field JSR
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RET
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SUBROUTINE
15:20:02.527 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VISITED
15:20:02.528 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Constants
15:20:02.530 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Opcodes
15:20:02.532 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter$State
15:20:02.532 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter$State
15:20:02.533 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeEmitter$State
15:20:02.534 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter$State
15:20:02.535 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter$State
15:20:02.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter$State
15:20:02.536 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Frame
15:20:02.537 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Frame
15:20:02.539 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Frame
15:20:02.542 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$FieldInfo
15:20:02.542 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$FieldInfo
15:20:02.542 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter$FieldInfo
15:20:02.543 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldWriter
15:20:02.544 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/FieldWriter
15:20:02.544 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/FieldWriter
15:20:02.546 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Edge
15:20:02.546 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Edge
15:20:02.546 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Edge
15:20:02.546 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NORMAL
15:20:02.546 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXCEPTION
15:20:02.547 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$7
15:20:02.547 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$7
15:20:02.548 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Local
15:20:02.548 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Local
15:20:02.548 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Local
15:20:02.549 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$8
15:20:02.549 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$8
15:20:02.552 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$9
15:20:02.552 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$9
15:20:02.555 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter$1
15:20:02.556 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter$1
15:20:02.561 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassReader
15:20:02.562 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassReader
15:20:02.569 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassReader
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SIGNATURES
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ANNOTATIONS
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field WRITER
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZE
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_CODE
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_DEBUG
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_FRAMES
15:20:02.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXPAND_FRAMES
15:20:02.580 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader
15:20:02.580 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader
15:20:02.580 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ClassNameReader
15:20:02.581 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$EarlyExitException
15:20:02.581 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$EarlyExitException
15:20:02.581 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassNameReader$EarlyExitException
15:20:02.582 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$1
15:20:02.582 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$1
15:20:02.583 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Attribute
15:20:02.583 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Attribute
15:20:02.583 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Attribute
15:20:02.584 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
15:20:02.584 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
15:20:02.587 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.SearchingClassLoader
15:20:02.587 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/util/SearchingClassLoader
15:20:02.588 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/util/SearchingClassLoader
15:20:02.589 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOp
15:20:02.590 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackInfo
15:20:02.590 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/CallbackInfo
15:20:02.591 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/CallbackInfo
15:20:02.592 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator
15:20:02.592 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOpGenerator
15:20:02.592 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/NoOpGenerator
15:20:02.592 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/NoOpGenerator
15:20:02.593 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator
15:20:02.593 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator
15:20:02.594 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/MethodInterceptorGenerator
15:20:02.595 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator$1
15:20:02.595 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator$1
15:20:02.595 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandler
15:20:02.596 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandlerGenerator
15:20:02.596 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/InvocationHandlerGenerator
15:20:02.596 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/InvocationHandlerGenerator
15:20:02.597 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoader
15:20:02.598 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoaderGenerator
15:20:02.598 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/LazyLoaderGenerator
15:20:02.598 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/LazyLoaderGenerator
15:20:02.599 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Dispatcher
15:20:02.599 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.DispatcherGenerator
15:20:02.599 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/DispatcherGenerator
15:20:02.599 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/DispatcherGenerator
15:20:02.600 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValue
15:20:02.601 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValueGenerator
15:20:02.601 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/FixedValueGenerator
15:20:02.601 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/FixedValueGenerator
15:20:02.601 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.ProxyRefDispatcher
15:20:02.634 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.URLUtils$EncodingRule
15:20:02.636 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.URLUtils
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.868 s <<< FAILURE! -- in org.jinstagram.auth.oauth.InstagramService_ESTest
[ERROR] org.jinstagram.auth.oauth.InstagramService_ESTest.testGetAuthorizationUrl -- Time elapsed: 0.419 s <<< ERROR!
java.lang.IncompatibleClassChangeError: Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
	at org.mockito.cglib.proxy.Enhancer.setSerialVersionUID(Enhancer.java:326)
	at org.powermock.api.mockito.repackaged.ClassImposterizer.createProxyClass(ClassImposterizer.java:121)
	at org.powermock.api.mockito.repackaged.ClassImposterizer.imposterise(ClassImposterizer.java:58)
	at org.powermock.api.mockito.repackaged.ClassImposterizer.imposterise(ClassImposterizer.java:50)
	at org.powermock.api.mockito.repackaged.CglibMockMaker.createMock(CglibMockMaker.java:25)
	at org.powermock.api.mockito.internal.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:47)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:33)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:59)
	at org.mockito.Mockito.mock(Mockito.java:1285)
	at org.mockito.Mockito.mock(Mockito.java:1163)
	at org.jinstagram.auth.oauth.InstagramService_ESTest.testGetAuthorizationUrl(InstagramService_ESTest.java:36)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
	at org.evosuite.runtime.vnet.NonFunctionalRequirementRule$1.evaluate(NonFunctionalRequirementRule.java:41)
	at org.junit.rules.RunRules.evaluate(RunRules.java:20)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:42)
	at org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:80)
	at org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:72)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   InstagramService_ESTest.testGetAuthorizationUrl:36 » IncompatibleClassChange Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.876 s
[INFO] Finished at: 2025-05-21T15:20:02+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project jInstagram: 
[ERROR] 
[ERROR] Please refer to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
