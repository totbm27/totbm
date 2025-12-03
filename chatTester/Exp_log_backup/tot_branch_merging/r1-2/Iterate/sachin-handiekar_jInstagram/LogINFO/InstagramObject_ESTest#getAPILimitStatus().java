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
[INFO] Total time:  5.996 s
[INFO] Finished at: 2025-07-02T11:46:07+08:00
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
11:46:18.120 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
11:46:18.136 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
11:46:18.144 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
11:46:18.145 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 10471
11:46:18.428 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.InstagramObject_ESTest
11:46:20.001 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
11:46:20.001 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-Shutdown"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
11:46:20.002 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
11:46:20.050 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramResponse
11:46:20.187 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.APILimitUtils
11:46:20.190 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/APILimitUtils
11:46:20.370 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/http/APILimitUtils
11:46:20.379 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.locations.LocationInfo
11:46:20.380 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/locations/LocationInfo
11:46:20.382 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/locations/LocationInfo
11:46:20.383 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramObject
11:46:20.384 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/InstagramObject
11:46:20.387 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/InstagramObject
11:46:20.389 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.comments.CommentData
11:46:20.390 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/CommentData
11:46:20.392 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/CommentData
11:46:20.393 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.common.Meta
11:46:20.394 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/Meta
11:46:20.396 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/Meta
11:46:20.399 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.common.Location
11:46:20.399 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/common/Location
11:46:20.403 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/common/Location
11:46:20.408 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.entity.comments.MediaCommentResponse
11:46:20.408 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/entity/comments/MediaCommentResponse
11:46:20.410 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/entity/comments/MediaCommentResponse
11:46:20.455 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Mockito
11:46:20.456 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Mockito
11:46:20.464 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Mockito
11:46:20.468 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Matchers
11:46:20.469 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Matchers
11:46:20.481 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Matchers
11:46:20.484 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.MockingProgress
11:46:20.488 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.hamcrest.Matcher
11:46:20.490 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationMode
11:46:20.492 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationWithTimeout
11:46:20.492 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationAfterDelay
11:46:20.504 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockitoDebugger
11:46:20.505 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.Answer
11:46:20.506 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.ThreadSafeMockingProgress
11:46:20.506 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/progress/ThreadSafeMockingProgress
11:46:20.512 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/progress/ThreadSafeMockingProgress
11:46:20.514 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.MockitoCore
11:46:20.514 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/MockitoCore
11:46:20.538 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/MockitoCore
11:46:20.541 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationDataInOrder
11:46:20.547 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockingDetails
11:46:20.549 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.InOrder
11:46:20.550 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NotAMockException
11:46:20.555 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NotAMockException
11:46:20.559 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NotAMockException
11:46:20.559 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoException
11:46:20.562 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoException
11:46:20.564 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoException
11:46:20.565 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationData
11:46:20.566 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainer
11:46:20.567 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.Reporter
11:46:20.572 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/Reporter
11:46:20.596 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/Reporter
11:46:20.598 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NullInsteadOfMockException
11:46:20.602 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NullInsteadOfMockException
11:46:20.603 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NullInsteadOfMockException
11:46:20.605 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MissingMethodInvocationException
11:46:20.606 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MissingMethodInvocationException
11:46:20.607 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MissingMethodInvocationException
11:46:20.608 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooLittleActualInvocations
11:46:20.609 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooLittleActualInvocations
11:46:20.610 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooLittleActualInvocations
11:46:20.611 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoAssertionError
11:46:20.612 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoAssertionError
11:46:20.613 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoAssertionError
11:46:20.614 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NoInteractionsWanted
11:46:20.615 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NoInteractionsWanted
11:46:20.615 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NoInteractionsWanted
11:46:20.616 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.VerificationInOrderFailure
11:46:20.616 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/VerificationInOrderFailure
11:46:20.616 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/VerificationInOrderFailure
11:46:20.617 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.InvalidUseOfMatchersException
11:46:20.617 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
11:46:20.618 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
11:46:20.619 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue
11:46:20.619 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
11:46:20.620 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
11:46:20.620 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.SmartNullPointerException
11:46:20.620 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/SmartNullPointerException
11:46:20.620 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/SmartNullPointerException
11:46:20.621 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock
11:46:20.621 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
11:46:20.622 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
11:46:20.623 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.WrongTypeOfReturnValue
11:46:20.623 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
11:46:20.623 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
11:46:20.624 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.WantedButNotInvoked
11:46:20.624 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/WantedButNotInvoked
11:46:20.625 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/WantedButNotInvoked
11:46:20.625 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.FriendlyReminderException
11:46:20.625 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/FriendlyReminderException
11:46:20.626 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/FriendlyReminderException
11:46:20.626 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooManyActualInvocations
11:46:20.626 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooManyActualInvocations
11:46:20.626 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooManyActualInvocations
11:46:20.627 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedStubbingException
11:46:20.627 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedStubbingException
11:46:20.627 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedStubbingException
11:46:20.627 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NeverWantedButInvoked
11:46:20.627 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NeverWantedButInvoked
11:46:20.628 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NeverWantedButInvoked
11:46:20.628 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedVerificationException
11:46:20.628 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedVerificationException
11:46:20.629 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedVerificationException
11:46:20.630 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockUtil
11:46:20.634 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockUtil
11:46:20.638 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/util/MockUtil
11:46:20.648 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.MockHandler
11:46:20.652 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockName
11:46:20.654 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.Plugins
11:46:20.654 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/Plugins
11:46:20.656 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/plugins/Plugins
11:46:20.658 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginRegistry
11:46:20.658 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginRegistry
11:46:20.660 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginRegistry
11:46:20.661 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.PluginSwitch
11:46:20.662 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginLoader
11:46:20.663 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginLoader
11:46:20.667 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginLoader
11:46:20.678 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MockitoConfigurationException
11:46:20.679 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MockitoConfigurationException
11:46:20.680 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MockitoConfigurationException
11:46:20.681 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.DefaultPluginSwitch
11:46:20.681 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
11:46:20.681 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
11:46:20.682 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFinder
11:46:20.686 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFinder
11:46:20.687 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFinder
11:46:20.687 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.Iterables
11:46:20.691 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/collections/Iterables
11:46:20.693 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/collections/Iterables
11:46:20.696 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.MockMaker
11:46:20.702 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFileReader
11:46:20.703 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFileReader
11:46:20.705 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFileReader
11:46:20.708 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.io.IOUtil
11:46:20.709 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/io/IOUtil
11:46:20.717 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/io/IOUtil
11:46:20.723 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptor
11:46:20.724 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Callback
11:46:20.724 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.StackTraceCleanerProvider
11:46:20.726 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.stacktrace.StackTraceCleaner
11:46:20.727 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Answers
11:46:20.728 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Answers
11:46:20.733 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Answers
11:46:20.736 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer
11:46:20.736 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
11:46:20.737 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
11:46:20.738 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls
11:46:20.738 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
11:46:20.740 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
11:46:20.741 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Location
11:46:20.742 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues
11:46:20.742 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
11:46:20.747 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
11:46:20.748 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues
11:46:20.748 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
11:46:20.751 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
11:46:20.752 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.ObjectMethodsGuru
11:46:20.752 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/ObjectMethodsGuru
11:46:20.754 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/ObjectMethodsGuru
11:46:20.754 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MockitoMethod
11:46:20.757 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.AbstractAwareMethod
11:46:20.758 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMocks
11:46:20.758 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
11:46:20.759 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
11:46:20.760 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
11:46:20.760 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
11:46:20.762 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
11:46:20.763 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
11:46:20.764 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
11:46:20.767 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
11:46:20.768 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.answers.CallsRealMethods
11:46:20.768 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/answers/CallsRealMethods
11:46:20.770 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/answers/CallsRealMethods
11:46:20.770 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.MockSettingsImpl
11:46:20.771 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/MockSettingsImpl
11:46:20.772 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/MockSettingsImpl
11:46:20.773 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockSettings
11:46:20.778 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockCreationSettings
11:46:20.778 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.settings.CreationSettings
11:46:20.779 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/settings/CreationSettings
11:46:20.782 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/settings/CreationSettings
11:46:20.783 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.SerializableMode
11:46:20.784 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/mock/SerializableMode
11:46:20.784 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/mock/SerializableMode
11:46:20.785 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockCreationValidator
11:46:20.786 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockCreationValidator
11:46:20.786 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockCreationValidator
11:46:20.787 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockNameImpl
11:46:20.787 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockNameImpl
11:46:20.788 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockNameImpl
11:46:20.789 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerFactory
11:46:20.789 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerFactory
11:46:20.790 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerFactory
11:46:20.790 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.InternalMockHandler
11:46:20.791 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerImpl
11:46:20.791 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerImpl
11:46:20.794 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerImpl
11:46:20.795 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.IOngoingStubbing
11:46:20.795 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.InvocationOnMock
11:46:20.796 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.VoidMethodStubbable
11:46:20.797 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MatchersBinder
11:46:20.797 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/invocation/MatchersBinder
11:46:20.799 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/invocation/MatchersBinder
11:46:20.799 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainerImpl
11:46:20.800 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/InvocationContainerImpl
11:46:20.803 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/stubbing/InvocationContainerImpl
11:46:20.804 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.SingleRegisteredInvocation
11:46:20.804 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/SingleRegisteredInvocation
11:46:20.807 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/SingleRegisteredInvocation
11:46:20.808 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.RegisteredInvocations
11:46:20.808 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.DefaultRegisteredInvocations
11:46:20.808 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/DefaultRegisteredInvocations
11:46:20.810 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/DefaultRegisteredInvocations
11:46:20.810 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.DescribedInvocation
11:46:20.813 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.PrintableInvocation
11:46:20.814 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.StubInfo
11:46:20.815 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.ListUtil$Filter
11:46:20.817 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.NullResultGuardian
11:46:20.821 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/NullResultGuardian
11:46:20.822 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/NullResultGuardian
11:46:20.822 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.InvocationNotifierHandler
11:46:20.824 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/InvocationNotifierHandler
11:46:20.824 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/InvocationNotifierHandler
11:46:20.825 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.listeners.MethodInvocationReport
11:46:20.826 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoSerializationIssue
11:46:20.826 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoSerializationIssue
11:46:20.827 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoSerializationIssue
11:46:20.828 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeGenerationException
11:46:20.828 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeGenerationException
11:46:20.831 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeGenerationException
11:46:20.832 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer
11:46:20.849 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer
11:46:20.874 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/Enhancer
11:46:20.880 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator
11:46:20.882 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator
11:46:20.889 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/AbstractClassGenerator
11:46:20.892 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassGenerator
11:46:20.897 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.NamingPolicy
11:46:20.898 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackFilter
11:46:20.899 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantationException
11:46:20.899 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantationException
11:46:20.904 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/InstantationException
11:46:20.905 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultNamingPolicy
11:46:20.906 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultNamingPolicy
11:46:20.909 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultNamingPolicy
11:46:20.912 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantiatorProvider
11:46:20.912 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantiatorProvider
11:46:20.912 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/creation/instance/InstantiatorProvider
11:46:20.913 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.Instantiator
11:46:20.915 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.ObjenesisInstantiator
11:46:20.915 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/ObjenesisInstantiator
11:46:20.916 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/ObjenesisInstantiator
11:46:20.918 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisStd
11:46:20.918 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisStd
11:46:20.918 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisStd
11:46:20.923 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisBase
11:46:20.924 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisBase
11:46:20.926 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisBase
11:46:20.928 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.Objenesis
11:46:20.929 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.InstantiatorStrategy
11:46:20.930 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.GlobalConfiguration
11:46:20.930 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/GlobalConfiguration
11:46:20.930 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/GlobalConfiguration
11:46:20.931 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.IMockitoConfiguration
11:46:20.934 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.DefaultMockitoConfiguration
11:46:20.935 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/configuration/DefaultMockitoConfiguration
11:46:20.936 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/configuration/DefaultMockitoConfiguration
11:46:20.938 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.AnnotationEngine
11:46:20.938 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.ClassPathLoader
11:46:20.938 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/ClassPathLoader
11:46:20.939 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/ClassPathLoader
11:46:20.939 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MOCKITO_CONFIGURATION_CLASS_NAME
11:46:20.940 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.StdInstantiatorStrategy
11:46:20.940 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/StdInstantiatorStrategy
11:46:20.940 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/StdInstantiatorStrategy
11:46:20.940 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.BaseInstantiatorStrategy
11:46:20.940 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/BaseInstantiatorStrategy
11:46:20.940 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/BaseInstantiatorStrategy
11:46:20.942 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.instantiator.ObjectInstantiator
11:46:20.944 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.MockitoMethodProxy
11:46:20.946 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.realmethod.RealMethod
11:46:20.946 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Invocation
11:46:20.947 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.GeneratorStrategy
11:46:20.950 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Predicate
11:46:20.953 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessSwitchCallback
11:46:20.955 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ObjectSwitchCallback
11:46:20.956 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator$Context
11:46:20.959 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Transformer
11:46:20.960 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$1
11:46:20.961 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$1
11:46:20.964 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$Source
11:46:20.964 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$Source
11:46:20.965 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/AbstractClassGenerator$Source
11:46:20.966 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey
11:46:20.966 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory
11:46:20.967 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory
11:46:20.967 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory
11:46:20.969 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Customizer
11:46:20.970 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.TypeUtils
11:46:20.974 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/TypeUtils
11:46:20.985 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/TypeUtils
11:46:20.993 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CollectionUtils
11:46:21.001 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CollectionUtils
11:46:21.007 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CollectionUtils
11:46:21.008 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Signature
11:46:21.011 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Signature
11:46:21.017 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Signature
11:46:21.018 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Type
11:46:21.019 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Type
11:46:21.023 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Type
11:46:21.026 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$1
11:46:21.029 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$1
11:46:21.040 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$2
11:46:21.041 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$2
11:46:21.043 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$Generator
11:46:21.044 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$Generator
11:46:21.054 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory$Generator
11:46:21.056 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultGeneratorStrategy
11:46:21.057 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultGeneratorStrategy
11:46:21.059 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultGeneratorStrategy
11:46:21.060 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassVisitor
11:46:21.061 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassWriter
11:46:21.062 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassWriter
11:46:21.081 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/ClassWriter
11:46:21.085 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter
11:46:21.089 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter
11:46:21.091 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DebuggingClassWriter
11:46:21.094 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodVisitor
11:46:21.096 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.AnnotationVisitor
11:46:21.097 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldVisitor
11:46:21.098 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ByteVector
11:46:21.100 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ByteVector
11:46:21.103 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ByteVector
11:46:21.105 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Item
11:46:21.106 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Item
11:46:21.107 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Item
11:46:21.112 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter
11:46:21.112 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter
11:46:21.123 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter
11:46:21.124 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field hookCounter
11:46:21.127 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassAdapter
11:46:21.128 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassAdapter
11:46:21.129 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassAdapter
11:46:21.131 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter
11:46:21.132 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter
11:46:21.143 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/CodeEmitter
11:46:21.147 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter
11:46:21.148 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter
11:46:21.161 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter
11:46:21.162 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodAdapter
11:46:21.162 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodAdapter
11:46:21.163 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodAdapter
11:46:21.163 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$3
11:46:21.164 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$3
11:46:21.165 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassInfo
11:46:21.165 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassInfo
11:46:21.166 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassInfo
11:46:21.167 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$1
11:46:21.167 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$1
11:46:21.169 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils
11:46:21.169 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils
11:46:21.180 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ReflectUtils
11:46:21.185 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.MethodInfo
11:46:21.187 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/MethodInfo
11:46:21.194 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/MethodInfo
11:46:21.196 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$3
11:46:21.196 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$3
11:46:21.198 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$4
11:46:21.198 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$4
11:46:21.200 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$1
11:46:21.200 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$1
11:46:21.202 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$2
11:46:21.202 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$2
11:46:21.207 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$1
11:46:21.208 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$1
11:46:21.209 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils
11:46:21.210 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils
11:46:21.248 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/EmitUtils
11:46:21.257 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ParameterTyper
11:46:21.259 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessArrayCallback
11:46:21.261 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ArrayDelimiters
11:46:21.262 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
11:46:21.266 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
11:46:21.267 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodWriter
11:46:21.269 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodWriter
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodWriter
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ACC_CONSTRUCTOR
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESERVED
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CHOP_FRAME
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME_EXTENDED
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field APPEND_FRAME
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FULL_FRAME
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MAXS
11:46:21.287 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NOTHING
11:46:21.293 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Label
11:46:21.295 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Label
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Label
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field DEBUG
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESOLVED
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZED
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field PUSHED
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field TARGET
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field STORE
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field REACHABLE
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field JSR
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RET
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SUBROUTINE
11:46:21.305 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VISITED
11:46:21.307 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Constants
11:46:21.310 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Opcodes
11:46:21.315 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter$State
11:46:21.317 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter$State
11:46:21.322 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeEmitter$State
11:46:21.324 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter$State
11:46:21.324 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter$State
11:46:21.325 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter$State
11:46:21.327 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Frame
11:46:21.327 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Frame
11:46:21.338 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Frame
11:46:21.343 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$FieldInfo
11:46:21.344 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$FieldInfo
11:46:21.347 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter$FieldInfo
11:46:21.348 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldWriter
11:46:21.349 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/FieldWriter
11:46:21.350 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/FieldWriter
11:46:21.353 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Edge
11:46:21.353 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Edge
11:46:21.354 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Edge
11:46:21.354 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NORMAL
11:46:21.354 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXCEPTION
11:46:21.357 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$7
11:46:21.357 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$7
11:46:21.359 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Local
11:46:21.359 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Local
11:46:21.360 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Local
11:46:21.361 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$8
11:46:21.361 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$8
11:46:21.362 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$9
11:46:21.363 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$9
11:46:21.365 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter$1
11:46:21.365 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter$1
11:46:21.375 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassReader
11:46:21.376 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassReader
11:46:21.434 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassReader
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SIGNATURES
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ANNOTATIONS
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field WRITER
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZE
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_CODE
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_DEBUG
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_FRAMES
11:46:21.435 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXPAND_FRAMES
11:46:21.444 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader
11:46:21.445 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader
11:46:21.451 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ClassNameReader
11:46:21.453 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$EarlyExitException
11:46:21.453 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$EarlyExitException
11:46:21.455 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassNameReader$EarlyExitException
11:46:21.457 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$1
11:46:21.457 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$1
11:46:21.459 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Attribute
11:46:21.460 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Attribute
11:46:21.461 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Attribute
11:46:21.462 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
11:46:21.462 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
11:46:21.468 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.SearchingClassLoader
11:46:21.470 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/util/SearchingClassLoader
11:46:21.477 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/util/SearchingClassLoader
11:46:21.480 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOp
11:46:21.482 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackInfo
11:46:21.483 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/CallbackInfo
11:46:21.486 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/CallbackInfo
11:46:21.488 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator
11:46:21.489 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOpGenerator
11:46:21.489 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/NoOpGenerator
11:46:21.490 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/NoOpGenerator
11:46:21.491 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator
11:46:21.491 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator
11:46:21.492 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/MethodInterceptorGenerator
11:46:21.493 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator$1
11:46:21.494 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator$1
11:46:21.497 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandler
11:46:21.498 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandlerGenerator
11:46:21.498 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/InvocationHandlerGenerator
11:46:21.501 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/InvocationHandlerGenerator
11:46:21.503 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoader
11:46:21.504 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoaderGenerator
11:46:21.505 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/LazyLoaderGenerator
11:46:21.506 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/LazyLoaderGenerator
11:46:21.509 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Dispatcher
11:46:21.511 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.DispatcherGenerator
11:46:21.512 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/DispatcherGenerator
11:46:21.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/DispatcherGenerator
11:46:21.519 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValue
11:46:21.519 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValueGenerator
11:46:21.519 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/FixedValueGenerator
11:46:21.520 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/FixedValueGenerator
11:46:21.522 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.ProxyRefDispatcher
11:46:21.526 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagSearchFeed
11:46:21.528 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.likes.LikesFeed
11:46:21.529 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.locations.LocationSearchFeed
11:46:21.530 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagInfoFeed
11:46:21.533 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.media.MediaInfoFeed
11:46:21.534 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.comments.MediaCommentsFeed
11:46:21.536 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.users.feed.MediaFeedData
11:46:21.537 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.relationships.RelationshipFeed
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Comments
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.tags.TagInfoData
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.relationships.RelationshipData
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Caption
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.User
11:46:21.538 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Likes
11:46:21.539 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Images
11:46:21.539 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.ImageData
11:46:21.539 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.FromTagData
11:46:21.539 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.VideoData
11:46:21.539 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.common.Videos
11:46:21.540 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.entity.users.feed.CarouselMedia
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 2.882 s <<< FAILURE! -- in org.jinstagram.InstagramObject_ESTest
[ERROR] org.jinstagram.InstagramObject_ESTest.testGetAPILimitStatus -- Time elapsed: 1.113 s <<< ERROR!
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
	at org.jinstagram.InstagramObject_ESTest.testGetAPILimitStatus(InstagramObject_ESTest.java:28)
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
[ERROR]   InstagramObject_ESTest.testGetAPILimitStatus:28 » IncompatibleClassChange Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.801 s
[INFO] Finished at: 2025-07-02T11:46:22+08:00
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
