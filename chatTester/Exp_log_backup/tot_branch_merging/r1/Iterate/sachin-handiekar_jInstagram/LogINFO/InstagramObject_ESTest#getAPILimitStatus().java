original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/InstagramObject_ESTest.java
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
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.270 s
[INFO] Finished at: 2025-06-26T10:22:11+08:00
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
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ jInstagram ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
10:22:22.107 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
10:22:22.124 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
10:22:22.134 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
10:22:22.134 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 53938
10:22:22.406 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.InstagramObject_ESTest
10:22:25.793 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
10:22:25.794 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
10:22:25.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
10:22:25.847 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramResponse
10:22:26.002 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.APILimitUtils
10:22:26.006 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/APILimitUtils
10:22:26.200 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/APILimitUtils
10:22:26.208 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.locations.LocationInfo
10:22:26.209 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/locations/LocationInfo
10:22:26.211 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/locations/LocationInfo
10:22:26.213 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramObject
10:22:26.214 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/InstagramObject
10:22:26.217 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/InstagramObject
10:22:26.219 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.comments.CommentData
10:22:26.219 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData
10:22:26.220 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData
10:22:26.221 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.common.Meta
10:22:26.222 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/Meta
10:22:26.224 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/Meta
10:22:26.227 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.common.Location
10:22:26.228 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/Location
10:22:26.231 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/Location
10:22:26.236 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.comments.MediaCommentResponse
10:22:26.236 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/MediaCommentResponse
10:22:26.238 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/MediaCommentResponse
10:22:26.278 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Mockito
10:22:26.279 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Mockito
10:22:26.286 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Mockito
10:22:26.289 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Matchers
10:22:26.290 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Matchers
10:22:26.300 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Matchers
10:22:26.304 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.MockingProgress
10:22:26.308 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.hamcrest.Matcher
10:22:26.309 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationMode
10:22:26.311 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.Answer
10:22:26.312 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationAfterDelay
10:22:26.325 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockitoDebugger
10:22:26.326 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationWithTimeout
10:22:26.327 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.ThreadSafeMockingProgress
10:22:26.327 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/progress/ThreadSafeMockingProgress
10:22:26.332 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/progress/ThreadSafeMockingProgress
10:22:26.335 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.MockitoCore
10:22:26.335 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/MockitoCore
10:22:26.356 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/MockitoCore
10:22:26.358 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationDataInOrder
10:22:26.363 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockingDetails
10:22:26.365 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NotAMockException
10:22:26.369 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NotAMockException
10:22:26.373 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NotAMockException
10:22:26.373 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoException
10:22:26.375 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoException
10:22:26.378 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoException
10:22:26.379 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationData
10:22:26.380 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainer
10:22:26.381 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.InOrder
10:22:26.381 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.Reporter
10:22:26.389 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/Reporter
10:22:26.413 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/Reporter
10:22:26.415 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NullInsteadOfMockException
10:22:26.418 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NullInsteadOfMockException
10:22:26.420 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NullInsteadOfMockException
10:22:26.421 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MissingMethodInvocationException
10:22:26.422 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MissingMethodInvocationException
10:22:26.423 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MissingMethodInvocationException
10:22:26.424 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.WrongTypeOfReturnValue
10:22:26.424 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
10:22:26.424 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
10:22:26.425 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.FriendlyReminderException
10:22:26.426 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/FriendlyReminderException
10:22:26.427 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/FriendlyReminderException
10:22:26.428 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.SmartNullPointerException
10:22:26.428 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/SmartNullPointerException
10:22:26.428 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/SmartNullPointerException
10:22:26.429 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.InvalidUseOfMatchersException
10:22:26.429 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
10:22:26.430 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
10:22:26.430 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoAssertionError
10:22:26.431 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoAssertionError
10:22:26.432 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoAssertionError
10:22:26.433 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue
10:22:26.433 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
10:22:26.433 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
10:22:26.434 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.VerificationInOrderFailure
10:22:26.434 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/VerificationInOrderFailure
10:22:26.434 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/VerificationInOrderFailure
10:22:26.434 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NoInteractionsWanted
10:22:26.434 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NoInteractionsWanted
10:22:26.434 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NoInteractionsWanted
10:22:26.435 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooLittleActualInvocations
10:22:26.436 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooLittleActualInvocations
10:22:26.437 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooLittleActualInvocations
10:22:26.437 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NeverWantedButInvoked
10:22:26.438 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NeverWantedButInvoked
10:22:26.438 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NeverWantedButInvoked
10:22:26.438 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooManyActualInvocations
10:22:26.438 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooManyActualInvocations
10:22:26.438 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooManyActualInvocations
10:22:26.439 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.WantedButNotInvoked
10:22:26.441 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/WantedButNotInvoked
10:22:26.441 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/WantedButNotInvoked
10:22:26.442 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock
10:22:26.442 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
10:22:26.442 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
10:22:26.443 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedVerificationException
10:22:26.443 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedVerificationException
10:22:26.443 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedVerificationException
10:22:26.443 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedStubbingException
10:22:26.444 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedStubbingException
10:22:26.444 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedStubbingException
10:22:26.445 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockUtil
10:22:26.448 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockUtil
10:22:26.450 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/util/MockUtil
10:22:26.451 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.MockHandler
10:22:26.455 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockName
10:22:26.455 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.Plugins
10:22:26.456 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/Plugins
10:22:26.457 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/plugins/Plugins
10:22:26.457 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginRegistry
10:22:26.458 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginRegistry
10:22:26.459 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginRegistry
10:22:26.459 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.PluginSwitch
10:22:26.460 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginLoader
10:22:26.461 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginLoader
10:22:26.464 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginLoader
10:22:26.476 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MockitoConfigurationException
10:22:26.476 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MockitoConfigurationException
10:22:26.480 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MockitoConfigurationException
10:22:26.480 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.DefaultPluginSwitch
10:22:26.481 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
10:22:26.481 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
10:22:26.482 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFinder
10:22:26.485 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFinder
10:22:26.487 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFinder
10:22:26.489 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.Iterables
10:22:26.493 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/collections/Iterables
10:22:26.494 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/collections/Iterables
10:22:26.498 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.MockMaker
10:22:26.503 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFileReader
10:22:26.505 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFileReader
10:22:26.507 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFileReader
10:22:26.509 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.io.IOUtil
10:22:26.511 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/io/IOUtil
10:22:26.520 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/io/IOUtil
10:22:26.525 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Callback
10:22:26.526 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptor
10:22:26.527 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.StackTraceCleanerProvider
10:22:26.530 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.stacktrace.StackTraceCleaner
10:22:26.531 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Answers
10:22:26.532 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Answers
10:22:26.539 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Answers
10:22:26.543 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer
10:22:26.543 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
10:22:26.544 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
10:22:26.545 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls
10:22:26.545 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
10:22:26.547 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
10:22:26.548 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Location
10:22:26.549 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues
10:22:26.549 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
10:22:26.553 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
10:22:26.554 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues
10:22:26.554 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
10:22:26.557 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
10:22:26.558 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.ObjectMethodsGuru
10:22:26.558 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/ObjectMethodsGuru
10:22:26.560 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/ObjectMethodsGuru
10:22:26.561 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MockitoMethod
10:22:26.562 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.AbstractAwareMethod
10:22:26.563 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMocks
10:22:26.564 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
10:22:26.566 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
10:22:26.566 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
10:22:26.566 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
10:22:26.571 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
10:22:26.572 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
10:22:26.573 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
10:22:26.574 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
10:22:26.575 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.answers.CallsRealMethods
10:22:26.575 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/answers/CallsRealMethods
10:22:26.576 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/answers/CallsRealMethods
10:22:26.577 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.MockSettingsImpl
10:22:26.577 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/MockSettingsImpl
10:22:26.583 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/MockSettingsImpl
10:22:26.584 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockSettings
10:22:26.588 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockCreationSettings
10:22:26.589 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.settings.CreationSettings
10:22:26.589 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/settings/CreationSettings
10:22:26.592 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/settings/CreationSettings
10:22:26.593 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.SerializableMode
10:22:26.593 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/mock/SerializableMode
10:22:26.593 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/mock/SerializableMode
10:22:26.594 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockCreationValidator
10:22:26.594 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockCreationValidator
10:22:26.595 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockCreationValidator
10:22:26.596 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockNameImpl
10:22:26.597 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockNameImpl
10:22:26.599 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockNameImpl
10:22:26.600 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerFactory
10:22:26.600 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerFactory
10:22:26.600 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerFactory
10:22:26.601 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.InternalMockHandler
10:22:26.601 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerImpl
10:22:26.602 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerImpl
10:22:26.605 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerImpl
10:22:26.605 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.IOngoingStubbing
10:22:26.606 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.InvocationOnMock
10:22:26.607 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.VoidMethodStubbable
10:22:26.609 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MatchersBinder
10:22:26.609 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/invocation/MatchersBinder
10:22:26.610 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/invocation/MatchersBinder
10:22:26.610 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainerImpl
10:22:26.610 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/InvocationContainerImpl
10:22:26.613 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/stubbing/InvocationContainerImpl
10:22:26.613 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.SingleRegisteredInvocation
10:22:26.614 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/SingleRegisteredInvocation
10:22:26.615 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/SingleRegisteredInvocation
10:22:26.616 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.RegisteredInvocations
10:22:26.616 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.DefaultRegisteredInvocations
10:22:26.616 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/DefaultRegisteredInvocations
10:22:26.617 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/DefaultRegisteredInvocations
10:22:26.618 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.DescribedInvocation
10:22:26.619 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.PrintableInvocation
10:22:26.624 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.StubInfo
10:22:26.625 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.ListUtil$Filter
10:22:26.626 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.NullResultGuardian
10:22:26.627 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/NullResultGuardian
10:22:26.627 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/NullResultGuardian
10:22:26.628 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.InvocationNotifierHandler
10:22:26.628 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/InvocationNotifierHandler
10:22:26.628 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/InvocationNotifierHandler
10:22:26.629 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.listeners.MethodInvocationReport
10:22:26.630 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoSerializationIssue
10:22:26.630 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoSerializationIssue
10:22:26.631 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoSerializationIssue
10:22:26.632 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.NamingPolicy
10:22:26.634 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackFilter
10:22:26.637 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeGenerationException
10:22:26.637 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeGenerationException
10:22:26.639 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeGenerationException
10:22:26.640 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer
10:22:26.649 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer
10:22:26.673 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/Enhancer
10:22:26.679 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator
10:22:26.684 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator
10:22:26.693 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/AbstractClassGenerator
10:22:26.696 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassGenerator
10:22:26.702 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantationException
10:22:26.703 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantationException
10:22:26.705 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/InstantationException
10:22:26.706 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultNamingPolicy
10:22:26.708 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultNamingPolicy
10:22:26.710 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultNamingPolicy
10:22:26.712 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantiatorProvider
10:22:26.712 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantiatorProvider
10:22:26.712 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/creation/instance/InstantiatorProvider
10:22:26.713 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.Instantiator
10:22:26.715 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.ObjenesisInstantiator
10:22:26.716 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/ObjenesisInstantiator
10:22:26.716 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/ObjenesisInstantiator
10:22:26.722 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisStd
10:22:26.723 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisStd
10:22:26.724 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisStd
10:22:26.725 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisBase
10:22:26.728 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisBase
10:22:26.730 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisBase
10:22:26.730 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.Objenesis
10:22:26.732 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.InstantiatorStrategy
10:22:26.732 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.GlobalConfiguration
10:22:26.733 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/GlobalConfiguration
10:22:26.734 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/GlobalConfiguration
10:22:26.734 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.IMockitoConfiguration
10:22:26.738 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.DefaultMockitoConfiguration
10:22:26.738 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/configuration/DefaultMockitoConfiguration
10:22:26.739 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/configuration/DefaultMockitoConfiguration
10:22:26.740 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.AnnotationEngine
10:22:26.741 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.ClassPathLoader
10:22:26.741 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/ClassPathLoader
10:22:26.741 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/ClassPathLoader
10:22:26.741 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MOCKITO_CONFIGURATION_CLASS_NAME
10:22:26.742 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.StdInstantiatorStrategy
10:22:26.742 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/StdInstantiatorStrategy
10:22:26.745 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/StdInstantiatorStrategy
10:22:26.745 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.BaseInstantiatorStrategy
10:22:26.745 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/BaseInstantiatorStrategy
10:22:26.745 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/BaseInstantiatorStrategy
10:22:26.746 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.instantiator.ObjectInstantiator
10:22:26.749 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.realmethod.RealMethod
10:22:26.751 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Invocation
10:22:26.751 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.MockitoMethodProxy
10:22:26.752 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Predicate
10:22:26.753 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.GeneratorStrategy
10:22:26.756 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessSwitchCallback
10:22:26.757 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ObjectSwitchCallback
10:22:26.758 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator$Context
10:22:26.761 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Transformer
10:22:26.763 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$1
10:22:26.764 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$1
10:22:26.766 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$Source
10:22:26.767 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$Source
10:22:26.767 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/AbstractClassGenerator$Source
10:22:26.768 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey
10:22:26.769 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory
10:22:26.770 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory
10:22:26.770 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory
10:22:26.771 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Customizer
10:22:26.772 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.TypeUtils
10:22:26.775 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/TypeUtils
10:22:26.786 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/TypeUtils
10:22:26.795 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CollectionUtils
10:22:26.795 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CollectionUtils
10:22:26.801 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CollectionUtils
10:22:26.802 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Signature
10:22:26.804 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Signature
10:22:26.809 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Signature
10:22:26.811 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Type
10:22:26.811 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Type
10:22:26.817 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Type
10:22:26.820 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$1
10:22:26.820 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$1
10:22:26.828 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$2
10:22:26.828 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$2
10:22:26.833 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$Generator
10:22:26.834 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$Generator
10:22:26.846 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory$Generator
10:22:26.848 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultGeneratorStrategy
10:22:26.849 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultGeneratorStrategy
10:22:26.879 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultGeneratorStrategy
10:22:26.899 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassVisitor
10:22:26.903 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassWriter
10:22:26.906 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassWriter
10:22:26.924 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/ClassWriter
10:22:26.928 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter
10:22:26.928 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter
10:22:26.932 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DebuggingClassWriter
10:22:26.939 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodVisitor
10:22:26.942 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.AnnotationVisitor
10:22:26.942 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldVisitor
10:22:26.944 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ByteVector
10:22:26.945 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ByteVector
10:22:26.949 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ByteVector
10:22:26.950 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Item
10:22:26.952 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Item
10:22:26.954 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Item
10:22:26.959 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter
10:22:26.959 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter
10:22:26.969 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter
10:22:26.970 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field hookCounter
10:22:26.973 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassAdapter
10:22:26.974 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassAdapter
10:22:26.975 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassAdapter
10:22:26.977 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter
10:22:26.977 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter
10:22:26.989 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/CodeEmitter
10:22:26.993 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter
10:22:26.995 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter
10:22:27.008 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter
10:22:27.008 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodAdapter
10:22:27.009 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodAdapter
10:22:27.009 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodAdapter
10:22:27.010 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$3
10:22:27.010 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$3
10:22:27.011 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassInfo
10:22:27.011 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassInfo
10:22:27.012 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassInfo
10:22:27.013 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$1
10:22:27.013 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$1
10:22:27.015 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils
10:22:27.015 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils
10:22:27.024 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ReflectUtils
10:22:27.028 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$4
10:22:27.029 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$4
10:22:27.035 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.MethodInfo
10:22:27.038 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/MethodInfo
10:22:27.040 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/MethodInfo
10:22:27.041 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$3
10:22:27.041 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$3
10:22:27.043 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$1
10:22:27.043 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$1
10:22:27.045 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$2
10:22:27.045 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$2
10:22:27.051 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$1
10:22:27.051 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$1
10:22:27.052 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils
10:22:27.053 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils
10:22:27.093 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/EmitUtils
10:22:27.099 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ParameterTyper
10:22:27.101 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessArrayCallback
10:22:27.102 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ArrayDelimiters
10:22:27.103 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
10:22:27.105 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
10:22:27.106 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodWriter
10:22:27.107 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodWriter
10:22:27.124 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodWriter
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ACC_CONSTRUCTOR
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESERVED
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CHOP_FRAME
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME_EXTENDED
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field APPEND_FRAME
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FULL_FRAME
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MAXS
10:22:27.125 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NOTHING
10:22:27.131 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Label
10:22:27.131 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Label
10:22:27.140 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Label
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field DEBUG
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESOLVED
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZED
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field PUSHED
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field TARGET
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field STORE
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field REACHABLE
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field JSR
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RET
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SUBROUTINE
10:22:27.141 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VISITED
10:22:27.142 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Constants
10:22:27.144 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Opcodes
10:22:27.148 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter$State
10:22:27.152 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter$State
10:22:27.156 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeEmitter$State
10:22:27.157 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter$State
10:22:27.157 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter$State
10:22:27.158 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter$State
10:22:27.160 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Frame
10:22:27.160 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Frame
10:22:27.166 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Frame
10:22:27.171 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$FieldInfo
10:22:27.172 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$FieldInfo
10:22:27.174 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter$FieldInfo
10:22:27.175 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldWriter
10:22:27.175 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/FieldWriter
10:22:27.177 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/FieldWriter
10:22:27.178 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Edge
10:22:27.178 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Edge
10:22:27.180 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Edge
10:22:27.180 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NORMAL
10:22:27.180 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXCEPTION
10:22:27.183 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$7
10:22:27.183 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$7
10:22:27.184 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Local
10:22:27.184 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Local
10:22:27.184 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Local
10:22:27.185 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$8
10:22:27.185 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$8
10:22:27.187 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$9
10:22:27.188 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$9
10:22:27.189 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter$1
10:22:27.190 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter$1
10:22:27.198 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassReader
10:22:27.199 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassReader
10:22:27.226 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassReader
10:22:27.226 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SIGNATURES
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ANNOTATIONS
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field WRITER
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZE
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_CODE
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_DEBUG
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_FRAMES
10:22:27.227 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXPAND_FRAMES
10:22:27.234 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader
10:22:27.234 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader
10:22:27.242 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ClassNameReader
10:22:27.244 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$EarlyExitException
10:22:27.245 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$EarlyExitException
10:22:27.247 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassNameReader$EarlyExitException
10:22:27.249 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$1
10:22:27.249 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$1
10:22:27.253 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Attribute
10:22:27.254 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Attribute
10:22:27.258 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Attribute
10:22:27.259 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
10:22:27.259 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
10:22:27.273 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.SearchingClassLoader
10:22:27.274 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/util/SearchingClassLoader
10:22:27.280 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/util/SearchingClassLoader
10:22:27.284 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOp
10:22:27.284 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackInfo
10:22:27.285 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/CallbackInfo
10:22:27.290 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/CallbackInfo
10:22:27.294 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator
10:22:27.298 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOpGenerator
10:22:27.298 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/NoOpGenerator
10:22:27.304 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/NoOpGenerator
10:22:27.305 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator
10:22:27.306 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator
10:22:27.308 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/MethodInterceptorGenerator
10:22:27.310 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator$1
10:22:27.311 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator$1
10:22:27.313 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandler
10:22:27.313 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandlerGenerator
10:22:27.313 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/InvocationHandlerGenerator
10:22:27.314 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/InvocationHandlerGenerator
10:22:27.316 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoader
10:22:27.317 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoaderGenerator
10:22:27.318 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/LazyLoaderGenerator
10:22:27.319 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/LazyLoaderGenerator
10:22:27.321 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Dispatcher
10:22:27.323 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.DispatcherGenerator
10:22:27.325 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/DispatcherGenerator
10:22:27.328 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/DispatcherGenerator
10:22:27.330 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValue
10:22:27.330 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValueGenerator
10:22:27.330 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/FixedValueGenerator
10:22:27.330 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/FixedValueGenerator
10:22:27.331 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.ProxyRefDispatcher
10:22:27.338 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagSearchFeed
10:22:27.340 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.likes.LikesFeed
10:22:27.341 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.locations.LocationSearchFeed
10:22:27.341 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagInfoFeed
10:22:27.344 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.media.MediaInfoFeed
10:22:27.345 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.comments.MediaCommentsFeed
10:22:27.347 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.users.feed.MediaFeedData
10:22:27.347 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.relationships.RelationshipFeed
10:22:27.347 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Comments
10:22:27.347 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagInfoData
10:22:27.348 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.relationships.RelationshipData
10:22:27.348 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Caption
10:22:27.348 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.User
10:22:27.348 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Likes
10:22:27.348 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Images
10:22:27.349 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.ImageData
10:22:27.349 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.FromTagData
10:22:27.349 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.VideoData
10:22:27.349 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Videos
10:22:27.350 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.users.feed.CarouselMedia
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 4.729 s <<< FAILURE! -- in org.jinstagram.InstagramObject_ESTest
[ERROR] org.jinstagram.InstagramObject_ESTest.testGetAPILimitStatus -- Time elapsed: 1.103 s <<< ERROR!
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
	at org.jinstagram.InstagramObject_ESTest.testGetAPILimitStatus(InstagramObject_ESTest.java:29)
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
[ERROR]   InstagramObject_ESTest.testGetAPILimitStatus:29 » IncompatibleClassChange Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.001 s
[INFO] Finished at: 2025-06-26T10:22:27+08:00
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
