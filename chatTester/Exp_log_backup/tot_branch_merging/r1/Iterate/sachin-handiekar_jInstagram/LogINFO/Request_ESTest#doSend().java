original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Request_ESTest.java
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
[INFO] Total time:  6.788 s
[INFO] Finished at: 2025-06-26T13:13:47+08:00
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
13:13:58.987 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
13:13:59.005 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
13:13:59.016 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
13:13:59.016 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 72515
13:13:59.297 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.http.Request_ESTest
13:14:02.457 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
13:14:02.457 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
13:14:02.458 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
13:14:02.514 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.auth.exceptions.OAuthException
13:14:02.576 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/auth/exceptions/OAuthException
13:14:02.875 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/auth/exceptions/OAuthException
13:14:02.881 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.URLUtils$EncodingRule
13:14:02.883 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/URLUtils$EncodingRule
13:14:02.885 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/URLUtils$EncodingRule
13:14:02.887 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.URLUtils
13:14:02.889 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/URLUtils
13:14:02.916 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/URLUtils
13:14:02.924 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Response
13:14:02.924 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Response
13:14:02.934 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Response
13:14:02.934 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EMPTY_RESPONSE
13:14:02.937 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Verbs
13:14:02.937 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Verbs
13:14:02.940 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/Verbs
13:14:02.942 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.utils.Preconditions
13:14:02.942 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/utils/Preconditions
13:14:02.946 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/utils/Preconditions
13:14:02.952 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Request
13:14:02.953 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Request
13:14:02.968 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Request
13:14:02.968 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CONTENT_LENGTH
13:14:04.344 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Mockito
13:14:04.347 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Mockito
13:14:04.360 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Mockito
13:14:04.362 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Matchers
13:14:04.364 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Matchers
13:14:04.369 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Matchers
13:14:04.370 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.MockingProgress
13:14:04.376 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.hamcrest.Matcher
13:14:04.381 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationMode
13:14:04.383 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.Answer
13:14:04.385 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationWithTimeout
13:14:04.392 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationAfterDelay
13:14:04.393 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockitoDebugger
13:14:04.394 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.ThreadSafeMockingProgress
13:14:04.401 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/progress/ThreadSafeMockingProgress
13:14:04.411 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/progress/ThreadSafeMockingProgress
13:14:04.413 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.MockitoCore
13:14:04.416 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/MockitoCore
13:14:04.441 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/MockitoCore
13:14:04.443 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NotAMockException
13:14:04.443 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NotAMockException
13:14:04.445 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NotAMockException
13:14:04.445 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoException
13:14:04.446 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoException
13:14:04.447 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoException
13:14:04.448 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationData
13:14:04.448 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainer
13:14:04.449 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockingDetails
13:14:04.450 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.InOrder
13:14:04.451 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationDataInOrder
13:14:04.454 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.Reporter
13:14:04.462 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/Reporter
13:14:04.476 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/Reporter
13:14:04.478 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.InvalidUseOfMatchersException
13:14:04.480 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
13:14:04.481 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
13:14:04.482 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock
13:14:04.482 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
13:14:04.482 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
13:14:04.483 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.WrongTypeOfReturnValue
13:14:04.483 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
13:14:04.483 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
13:14:04.484 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.FriendlyReminderException
13:14:04.484 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/FriendlyReminderException
13:14:04.485 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/FriendlyReminderException
13:14:04.485 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.SmartNullPointerException
13:14:04.486 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/SmartNullPointerException
13:14:04.486 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/SmartNullPointerException
13:14:04.486 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoAssertionError
13:14:04.486 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoAssertionError
13:14:04.488 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoAssertionError
13:14:04.489 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue
13:14:04.491 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
13:14:04.495 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
13:14:04.497 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.VerificationInOrderFailure
13:14:04.498 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/VerificationInOrderFailure
13:14:04.498 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/VerificationInOrderFailure
13:14:04.499 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NoInteractionsWanted
13:14:04.499 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NoInteractionsWanted
13:14:04.499 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NoInteractionsWanted
13:14:04.499 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooLittleActualInvocations
13:14:04.499 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooLittleActualInvocations
13:14:04.500 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooLittleActualInvocations
13:14:04.503 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NeverWantedButInvoked
13:14:04.503 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NeverWantedButInvoked
13:14:04.503 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NeverWantedButInvoked
13:14:04.504 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooManyActualInvocations
13:14:04.504 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooManyActualInvocations
13:14:04.504 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooManyActualInvocations
13:14:04.504 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.WantedButNotInvoked
13:14:04.504 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/WantedButNotInvoked
13:14:04.505 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/WantedButNotInvoked
13:14:04.505 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NullInsteadOfMockException
13:14:04.505 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NullInsteadOfMockException
13:14:04.506 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NullInsteadOfMockException
13:14:04.508 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MissingMethodInvocationException
13:14:04.508 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MissingMethodInvocationException
13:14:04.508 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MissingMethodInvocationException
13:14:04.509 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedVerificationException
13:14:04.509 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedVerificationException
13:14:04.510 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedVerificationException
13:14:04.510 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedStubbingException
13:14:04.510 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedStubbingException
13:14:04.511 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedStubbingException
13:14:04.512 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockUtil
13:14:04.513 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockUtil
13:14:04.522 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/util/MockUtil
13:14:04.524 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.MockHandler
13:14:04.526 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockName
13:14:04.528 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.Plugins
13:14:04.528 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/Plugins
13:14:04.529 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/plugins/Plugins
13:14:04.538 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginRegistry
13:14:04.538 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginRegistry
13:14:04.541 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginRegistry
13:14:04.542 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.PluginSwitch
13:14:04.543 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginLoader
13:14:04.544 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginLoader
13:14:04.546 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginLoader
13:14:04.553 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MockitoConfigurationException
13:14:04.553 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MockitoConfigurationException
13:14:04.554 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MockitoConfigurationException
13:14:04.554 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.DefaultPluginSwitch
13:14:04.554 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
13:14:04.555 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
13:14:04.556 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFinder
13:14:04.559 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFinder
13:14:04.560 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFinder
13:14:04.564 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.Iterables
13:14:04.569 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/collections/Iterables
13:14:04.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/collections/Iterables
13:14:04.572 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.MockMaker
13:14:04.574 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFileReader
13:14:04.575 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFileReader
13:14:04.576 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFileReader
13:14:04.579 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.io.IOUtil
13:14:04.580 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/io/IOUtil
13:14:04.587 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/io/IOUtil
13:14:04.591 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Callback
13:14:04.592 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptor
13:14:04.595 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.StackTraceCleanerProvider
13:14:04.598 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.stacktrace.StackTraceCleaner
13:14:04.600 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Answers
13:14:04.600 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Answers
13:14:04.605 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Answers
13:14:04.610 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer
13:14:04.610 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
13:14:04.612 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
13:14:04.612 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls
13:14:04.613 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
13:14:04.614 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
13:14:04.615 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Location
13:14:04.616 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues
13:14:04.616 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
13:14:04.617 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
13:14:04.618 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues
13:14:04.618 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
13:14:04.622 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
13:14:04.624 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.ObjectMethodsGuru
13:14:04.624 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/ObjectMethodsGuru
13:14:04.625 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/ObjectMethodsGuru
13:14:04.626 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MockitoMethod
13:14:04.627 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.AbstractAwareMethod
13:14:04.628 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMocks
13:14:04.629 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
13:14:04.629 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
13:14:04.630 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
13:14:04.630 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
13:14:04.631 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
13:14:04.632 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
13:14:04.632 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
13:14:04.633 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
13:14:04.634 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.answers.CallsRealMethods
13:14:04.634 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/answers/CallsRealMethods
13:14:04.634 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/answers/CallsRealMethods
13:14:04.635 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.MockSettingsImpl
13:14:04.635 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/MockSettingsImpl
13:14:04.637 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/MockSettingsImpl
13:14:04.638 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockSettings
13:14:04.643 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockCreationSettings
13:14:04.646 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.settings.CreationSettings
13:14:04.647 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/settings/CreationSettings
13:14:04.649 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/settings/CreationSettings
13:14:04.651 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.SerializableMode
13:14:04.651 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/mock/SerializableMode
13:14:04.653 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/mock/SerializableMode
13:14:04.655 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockCreationValidator
13:14:04.655 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockCreationValidator
13:14:04.656 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockCreationValidator
13:14:04.657 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockNameImpl
13:14:04.657 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockNameImpl
13:14:04.659 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockNameImpl
13:14:04.660 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerFactory
13:14:04.661 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerFactory
13:14:04.661 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerFactory
13:14:04.661 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.InternalMockHandler
13:14:04.662 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerImpl
13:14:04.662 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerImpl
13:14:04.668 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerImpl
13:14:04.669 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.VoidMethodStubbable
13:14:04.670 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.IOngoingStubbing
13:14:04.671 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.InvocationOnMock
13:14:04.672 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MatchersBinder
13:14:04.672 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/invocation/MatchersBinder
13:14:04.673 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/invocation/MatchersBinder
13:14:04.673 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainerImpl
13:14:04.673 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/InvocationContainerImpl
13:14:04.676 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/stubbing/InvocationContainerImpl
13:14:04.677 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.SingleRegisteredInvocation
13:14:04.679 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/SingleRegisteredInvocation
13:14:04.680 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/SingleRegisteredInvocation
13:14:04.680 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.RegisteredInvocations
13:14:04.681 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.DefaultRegisteredInvocations
13:14:04.682 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/DefaultRegisteredInvocations
13:14:04.683 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/DefaultRegisteredInvocations
13:14:04.684 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.DescribedInvocation
13:14:04.684 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.PrintableInvocation
13:14:04.685 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.StubInfo
13:14:04.686 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.ListUtil$Filter
13:14:04.688 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.NullResultGuardian
13:14:04.688 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/NullResultGuardian
13:14:04.690 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/NullResultGuardian
13:14:04.691 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.InvocationNotifierHandler
13:14:04.691 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/InvocationNotifierHandler
13:14:04.692 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/InvocationNotifierHandler
13:14:04.692 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.listeners.MethodInvocationReport
13:14:04.702 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoSerializationIssue
13:14:04.705 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoSerializationIssue
13:14:04.709 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoSerializationIssue
13:14:04.710 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.NamingPolicy
13:14:04.711 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackFilter
13:14:04.712 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeGenerationException
13:14:04.712 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeGenerationException
13:14:04.713 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeGenerationException
13:14:04.714 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer
13:14:04.729 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer
13:14:04.747 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/Enhancer
13:14:04.749 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator
13:14:04.757 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator
13:14:04.763 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/AbstractClassGenerator
13:14:04.765 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassGenerator
13:14:04.767 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantationException
13:14:04.767 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantationException
13:14:04.770 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/InstantationException
13:14:04.772 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultNamingPolicy
13:14:04.772 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultNamingPolicy
13:14:04.779 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultNamingPolicy
13:14:04.781 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantiatorProvider
13:14:04.781 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantiatorProvider
13:14:04.782 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/creation/instance/InstantiatorProvider
13:14:04.783 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.Instantiator
13:14:04.785 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.ObjenesisInstantiator
13:14:04.786 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/ObjenesisInstantiator
13:14:04.786 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/ObjenesisInstantiator
13:14:04.789 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisStd
13:14:04.789 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisStd
13:14:04.790 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisStd
13:14:04.791 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisBase
13:14:04.793 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisBase
13:14:04.797 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisBase
13:14:04.797 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.Objenesis
13:14:04.798 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.InstantiatorStrategy
13:14:04.800 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.GlobalConfiguration
13:14:04.800 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/GlobalConfiguration
13:14:04.802 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/GlobalConfiguration
13:14:04.802 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.IMockitoConfiguration
13:14:04.807 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.DefaultMockitoConfiguration
13:14:04.808 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/configuration/DefaultMockitoConfiguration
13:14:04.810 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/configuration/DefaultMockitoConfiguration
13:14:04.812 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.AnnotationEngine
13:14:04.819 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.ClassPathLoader
13:14:04.821 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/ClassPathLoader
13:14:04.822 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/ClassPathLoader
13:14:04.822 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MOCKITO_CONFIGURATION_CLASS_NAME
13:14:04.823 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.StdInstantiatorStrategy
13:14:04.824 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/StdInstantiatorStrategy
13:14:04.824 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/StdInstantiatorStrategy
13:14:04.825 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.BaseInstantiatorStrategy
13:14:04.825 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/BaseInstantiatorStrategy
13:14:04.825 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/BaseInstantiatorStrategy
13:14:04.826 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.instantiator.ObjectInstantiator
13:14:04.834 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.MockitoMethodProxy
13:14:04.837 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.realmethod.RealMethod
13:14:04.839 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Invocation
13:14:04.845 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.GeneratorStrategy
13:14:04.848 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Predicate
13:14:04.851 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessSwitchCallback
13:14:04.853 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ObjectSwitchCallback
13:14:04.855 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator$Context
13:14:04.857 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Transformer
13:14:04.864 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$1
13:14:04.865 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$1
13:14:04.873 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$Source
13:14:04.873 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$Source
13:14:04.875 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/AbstractClassGenerator$Source
13:14:04.876 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey
13:14:04.877 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory
13:14:04.879 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory
13:14:04.880 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory
13:14:04.882 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Customizer
13:14:04.884 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.TypeUtils
13:14:04.889 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/TypeUtils
13:14:04.905 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/TypeUtils
13:14:04.908 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CollectionUtils
13:14:04.913 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CollectionUtils
13:14:04.918 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CollectionUtils
13:14:04.919 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Signature
13:14:04.919 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Signature
13:14:04.922 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Signature
13:14:04.923 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Type
13:14:04.923 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Type
13:14:04.927 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Type
13:14:04.929 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$1
13:14:04.930 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$1
13:14:04.933 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$2
13:14:04.934 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$2
13:14:04.935 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$Generator
13:14:04.936 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$Generator
13:14:04.952 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory$Generator
13:14:04.954 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultGeneratorStrategy
13:14:04.954 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultGeneratorStrategy
13:14:04.957 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultGeneratorStrategy
13:14:04.958 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassVisitor
13:14:04.959 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassWriter
13:14:04.960 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassWriter
13:14:05.003 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/ClassWriter
13:14:05.008 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter
13:14:05.010 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter
13:14:05.012 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DebuggingClassWriter
13:14:05.017 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodVisitor
13:14:05.020 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.AnnotationVisitor
13:14:05.021 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldVisitor
13:14:05.022 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ByteVector
13:14:05.022 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ByteVector
13:14:05.027 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ByteVector
13:14:05.028 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Item
13:14:05.028 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Item
13:14:05.031 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Item
13:14:05.033 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter
13:14:05.033 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter
13:14:05.043 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter
13:14:05.043 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field hookCounter
13:14:05.045 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassAdapter
13:14:05.045 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassAdapter
13:14:05.046 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassAdapter
13:14:05.047 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter
13:14:05.048 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter
13:14:05.055 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/CodeEmitter
13:14:05.060 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter
13:14:05.061 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter
13:14:05.068 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter
13:14:05.069 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodAdapter
13:14:05.070 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodAdapter
13:14:05.073 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodAdapter
13:14:05.074 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$3
13:14:05.075 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$3
13:14:05.079 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassInfo
13:14:05.079 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassInfo
13:14:05.081 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassInfo
13:14:05.082 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$1
13:14:05.082 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$1
13:14:05.086 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils
13:14:05.086 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils
13:14:05.104 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ReflectUtils
13:14:05.109 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.MethodInfo
13:14:05.111 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/MethodInfo
13:14:05.116 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/MethodInfo
13:14:05.119 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$3
13:14:05.119 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$3
13:14:05.121 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$4
13:14:05.122 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$4
13:14:05.125 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$1
13:14:05.126 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$1
13:14:05.126 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$2
13:14:05.127 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$2
13:14:05.130 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$1
13:14:05.130 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$1
13:14:05.132 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils
13:14:05.132 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils
13:14:05.159 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/EmitUtils
13:14:05.165 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ParameterTyper
13:14:05.166 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessArrayCallback
13:14:05.168 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ArrayDelimiters
13:14:05.168 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
13:14:05.169 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
13:14:05.170 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodWriter
13:14:05.171 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodWriter
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodWriter
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ACC_CONSTRUCTOR
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESERVED
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CHOP_FRAME
13:14:05.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME_EXTENDED
13:14:05.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field APPEND_FRAME
13:14:05.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FULL_FRAME
13:14:05.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
13:14:05.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MAXS
13:14:05.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NOTHING
13:14:05.190 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Label
13:14:05.191 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Label
13:14:05.202 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Label
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field DEBUG
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESOLVED
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZED
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field PUSHED
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field TARGET
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field STORE
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field REACHABLE
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field JSR
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RET
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SUBROUTINE
13:14:05.203 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VISITED
13:14:05.206 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Constants
13:14:05.211 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Opcodes
13:14:05.220 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter$State
13:14:05.223 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter$State
13:14:05.229 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeEmitter$State
13:14:05.230 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter$State
13:14:05.231 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter$State
13:14:05.232 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter$State
13:14:05.233 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Frame
13:14:05.234 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Frame
13:14:05.238 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Frame
13:14:05.244 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$FieldInfo
13:14:05.244 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$FieldInfo
13:14:05.246 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter$FieldInfo
13:14:05.251 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldWriter
13:14:05.252 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/FieldWriter
13:14:05.257 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/FieldWriter
13:14:05.260 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Edge
13:14:05.261 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Edge
13:14:05.262 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Edge
13:14:05.262 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NORMAL
13:14:05.262 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXCEPTION
13:14:05.263 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$7
13:14:05.263 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$7
13:14:05.264 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Local
13:14:05.264 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Local
13:14:05.265 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Local
13:14:05.265 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$8
13:14:05.266 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$8
13:14:05.267 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$9
13:14:05.267 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$9
13:14:05.269 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter$1
13:14:05.269 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter$1
13:14:05.278 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassReader
13:14:05.278 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassReader
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassReader
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SIGNATURES
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ANNOTATIONS
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field WRITER
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZE
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_CODE
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_DEBUG
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_FRAMES
13:14:05.331 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXPAND_FRAMES
13:14:05.339 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader
13:14:05.344 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader
13:14:05.348 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ClassNameReader
13:14:05.349 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$EarlyExitException
13:14:05.349 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$EarlyExitException
13:14:05.352 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassNameReader$EarlyExitException
13:14:05.354 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$1
13:14:05.354 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$1
13:14:05.357 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Attribute
13:14:05.358 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Attribute
13:14:05.361 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Attribute
13:14:05.361 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$6a
13:14:05.363 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$6a
13:14:05.369 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.SearchingClassLoader
13:14:05.372 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/util/SearchingClassLoader
13:14:05.377 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/util/SearchingClassLoader
13:14:05.379 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOp
13:14:05.380 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackInfo
13:14:05.381 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/CallbackInfo
13:14:05.387 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/CallbackInfo
13:14:05.389 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator
13:14:05.390 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOpGenerator
13:14:05.390 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/NoOpGenerator
13:14:05.395 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/NoOpGenerator
13:14:05.396 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator
13:14:05.396 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator
13:14:05.398 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/MethodInterceptorGenerator
13:14:05.400 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator$1
13:14:05.401 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator$1
13:14:05.401 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandler
13:14:05.402 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandlerGenerator
13:14:05.402 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/InvocationHandlerGenerator
13:14:05.402 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/InvocationHandlerGenerator
13:14:05.403 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoader
13:14:05.406 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoaderGenerator
13:14:05.408 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/LazyLoaderGenerator
13:14:05.411 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/LazyLoaderGenerator
13:14:05.414 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Dispatcher
13:14:05.416 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.DispatcherGenerator
13:14:05.416 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/DispatcherGenerator
13:14:05.417 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/DispatcherGenerator
13:14:05.417 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValue
13:14:05.418 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValueGenerator
13:14:05.418 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/FixedValueGenerator
13:14:05.418 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/FixedValueGenerator
13:14:05.419 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.ProxyRefDispatcher
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.901 s <<< FAILURE! -- in org.jinstagram.http.Request_ESTest
[ERROR] org.jinstagram.http.Request_ESTest.testDoSend -- Time elapsed: 1.112 s <<< ERROR!
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
	at org.jinstagram.http.Request_ESTest.testDoSend(Request_ESTest.java:49)
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
[ERROR]   Request_ESTest.testDoSend:49 » IncompatibleClassChange Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.539 s
[INFO] Finished at: 2025-06-26T13:14:06+08:00
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
Warning: the fonts "Times" and "Lucida Bright" are not available for the Java logical font "Serif", which may have unexpected appearance or behavior. Re-enable the "Times" font to remove this warning.
