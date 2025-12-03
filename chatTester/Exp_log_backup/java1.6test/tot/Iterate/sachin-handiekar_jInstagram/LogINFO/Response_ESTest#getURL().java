original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Response_ESTest.java
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
[INFO] Compiling 3 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.238 s
[INFO] Finished at: 2025-07-20T00:16:31+08:00
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
[INFO] Compiling 3 source files to /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ jInstagram ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
00:16:42.849 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
00:16:42.867 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
00:16:42.877 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/Users/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/Users/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/Users/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/Users/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/Users/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/Users/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/Users/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
00:16:42.878 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 77327
00:16:43.147 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.http.Response_ESTest
00:16:46.794 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
00:16:46.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
00:16:46.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
00:16:46.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
00:16:46.795 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AppKit Thread"
00:16:46.796 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Queue Flusher"
00:16:46.796 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
00:16:46.796 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
00:16:46.796 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
00:16:46.796 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
00:16:46.867 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.http.Response
00:16:46.924 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/http/Response
00:16:47.248 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/http/Response
00:16:47.250 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EMPTY_RESPONSE
00:16:48.544 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Mockito
00:16:48.546 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Mockito
00:16:48.552 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Mockito
00:16:48.554 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Matchers
00:16:48.555 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Matchers
00:16:48.570 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Matchers
00:16:48.575 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.MockingProgress
00:16:48.576 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.hamcrest.Matcher
00:16:48.577 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationMode
00:16:48.578 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationWithTimeout
00:16:48.579 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.Answer
00:16:48.581 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.verification.VerificationAfterDelay
00:16:48.582 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockitoDebugger
00:16:48.583 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.ThreadSafeMockingProgress
00:16:48.584 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/progress/ThreadSafeMockingProgress
00:16:48.590 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/progress/ThreadSafeMockingProgress
00:16:48.593 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.MockitoCore
00:16:48.597 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/MockitoCore
00:16:48.629 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/MockitoCore
00:16:48.631 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationDataInOrder
00:16:48.634 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.InOrder
00:16:48.635 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NotAMockException
00:16:48.636 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NotAMockException
00:16:48.646 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NotAMockException
00:16:48.647 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoException
00:16:48.647 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoException
00:16:48.651 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoException
00:16:48.652 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.api.VerificationData
00:16:48.653 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainer
00:16:48.653 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockingDetails
00:16:48.654 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.Reporter
00:16:48.656 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/Reporter
00:16:48.663 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/Reporter
00:16:48.664 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.InvalidUseOfMatchersException
00:16:48.667 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
00:16:48.671 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/InvalidUseOfMatchersException
00:16:48.672 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedVerificationException
00:16:48.673 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedVerificationException
00:16:48.673 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedVerificationException
00:16:48.674 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.UnfinishedStubbingException
00:16:48.679 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/UnfinishedStubbingException
00:16:48.681 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/UnfinishedStubbingException
00:16:48.682 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.NullInsteadOfMockException
00:16:48.683 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/NullInsteadOfMockException
00:16:48.683 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/NullInsteadOfMockException
00:16:48.684 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MissingMethodInvocationException
00:16:48.684 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MissingMethodInvocationException
00:16:48.686 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MissingMethodInvocationException
00:16:48.688 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.WrongTypeOfReturnValue
00:16:48.688 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
00:16:48.689 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/WrongTypeOfReturnValue
00:16:48.689 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.FriendlyReminderException
00:16:48.690 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/FriendlyReminderException
00:16:48.690 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/FriendlyReminderException
00:16:48.691 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.SmartNullPointerException
00:16:48.691 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/SmartNullPointerException
00:16:48.691 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/SmartNullPointerException
00:16:48.692 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoAssertionError
00:16:48.693 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoAssertionError
00:16:48.694 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoAssertionError
00:16:48.695 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue
00:16:48.696 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
00:16:48.697 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotStubVoidMethodWithReturnValue
00:16:48.698 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.VerificationInOrderFailure
00:16:48.698 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/VerificationInOrderFailure
00:16:48.698 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/VerificationInOrderFailure
00:16:48.698 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NoInteractionsWanted
00:16:48.699 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NoInteractionsWanted
00:16:48.699 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NoInteractionsWanted
00:16:48.699 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooLittleActualInvocations
00:16:48.699 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooLittleActualInvocations
00:16:48.700 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooLittleActualInvocations
00:16:48.701 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.NeverWantedButInvoked
00:16:48.701 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/NeverWantedButInvoked
00:16:48.701 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/NeverWantedButInvoked
00:16:48.702 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.TooManyActualInvocations
00:16:48.702 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/TooManyActualInvocations
00:16:48.702 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/TooManyActualInvocations
00:16:48.703 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.verification.WantedButNotInvoked
00:16:48.705 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/verification/WantedButNotInvoked
00:16:48.706 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/verification/WantedButNotInvoked
00:16:48.708 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock
00:16:48.711 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
00:16:48.712 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/CannotVerifyStubOnlyMock
00:16:48.715 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockUtil
00:16:48.718 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockUtil
00:16:48.723 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/util/MockUtil
00:16:48.726 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockName
00:16:48.727 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.MockHandler
00:16:48.729 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.Plugins
00:16:48.730 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/Plugins
00:16:48.730 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/plugins/Plugins
00:16:48.731 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginRegistry
00:16:48.733 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginRegistry
00:16:48.734 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginRegistry
00:16:48.735 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.PluginSwitch
00:16:48.736 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginLoader
00:16:48.737 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginLoader
00:16:48.741 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginLoader
00:16:48.742 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.misusing.MockitoConfigurationException
00:16:48.743 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/misusing/MockitoConfigurationException
00:16:48.744 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/misusing/MockitoConfigurationException
00:16:48.745 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.DefaultPluginSwitch
00:16:48.745 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
00:16:48.746 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/DefaultPluginSwitch
00:16:48.746 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFinder
00:16:48.749 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFinder
00:16:48.752 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFinder
00:16:48.754 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.Iterables
00:16:48.759 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/collections/Iterables
00:16:48.767 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/collections/Iterables
00:16:48.768 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.MockMaker
00:16:48.772 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.plugins.PluginFileReader
00:16:48.774 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/plugins/PluginFileReader
00:16:48.775 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/plugins/PluginFileReader
00:16:48.776 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.io.IOUtil
00:16:48.777 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/io/IOUtil
00:16:48.789 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/io/IOUtil
00:16:48.793 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptor
00:16:48.794 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Callback
00:16:48.795 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.plugins.StackTraceCleanerProvider
00:16:48.796 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.stacktrace.StackTraceCleaner
00:16:48.797 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.Answers
00:16:48.798 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/Answers
00:16:48.799 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/Answers
00:16:48.800 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer
00:16:48.801 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
00:16:48.802 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/GloballyConfiguredAnswer
00:16:48.803 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls
00:16:48.804 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
00:16:48.808 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsSmartNulls
00:16:48.809 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Location
00:16:48.811 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues
00:16:48.813 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
00:16:48.816 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMoreEmptyValues
00:16:48.818 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues
00:16:48.818 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
00:16:48.822 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsEmptyValues
00:16:48.823 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.ObjectMethodsGuru
00:16:48.824 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/ObjectMethodsGuru
00:16:48.833 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/ObjectMethodsGuru
00:16:48.834 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MockitoMethod
00:16:48.835 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.AbstractAwareMethod
00:16:48.836 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsMocks
00:16:48.837 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
00:16:48.840 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsMocks
00:16:48.840 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
00:16:48.841 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
00:16:48.842 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs
00:16:48.843 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
00:16:48.843 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
00:16:48.847 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs$ReturnsDeepStubsSerializationFallback
00:16:48.848 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.answers.CallsRealMethods
00:16:48.848 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/answers/CallsRealMethods
00:16:48.849 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/stubbing/answers/CallsRealMethods
00:16:48.851 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.MockSettingsImpl
00:16:48.851 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/MockSettingsImpl
00:16:48.859 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/MockSettingsImpl
00:16:48.860 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.MockSettings
00:16:48.864 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.MockCreationSettings
00:16:48.865 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.settings.CreationSettings
00:16:48.865 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/settings/CreationSettings
00:16:48.867 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/settings/CreationSettings
00:16:48.868 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.mock.SerializableMode
00:16:48.868 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/mock/SerializableMode
00:16:48.871 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/mock/SerializableMode
00:16:48.874 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockCreationValidator
00:16:48.874 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockCreationValidator
00:16:48.875 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockCreationValidator
00:16:48.888 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.MockNameImpl
00:16:48.888 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/util/MockNameImpl
00:16:48.889 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/util/MockNameImpl
00:16:48.890 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerFactory
00:16:48.891 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerFactory
00:16:48.891 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerFactory
00:16:48.892 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.InternalMockHandler
00:16:48.893 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.MockHandlerImpl
00:16:48.893 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/MockHandlerImpl
00:16:48.894 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/MockHandlerImpl
00:16:48.896 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.stubbing.VoidMethodStubbable
00:16:48.897 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.progress.IOngoingStubbing
00:16:48.898 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.InvocationOnMock
00:16:48.899 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.MatchersBinder
00:16:48.899 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/invocation/MatchersBinder
00:16:48.901 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/invocation/MatchersBinder
00:16:48.902 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.stubbing.InvocationContainerImpl
00:16:48.902 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/stubbing/InvocationContainerImpl
00:16:48.907 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/stubbing/InvocationContainerImpl
00:16:48.910 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.SingleRegisteredInvocation
00:16:48.910 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/SingleRegisteredInvocation
00:16:48.910 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/SingleRegisteredInvocation
00:16:48.911 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.RegisteredInvocations
00:16:48.911 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.verification.DefaultRegisteredInvocations
00:16:48.911 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/verification/DefaultRegisteredInvocations
00:16:48.912 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/verification/DefaultRegisteredInvocations
00:16:48.912 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.DescribedInvocation
00:16:48.914 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.PrintableInvocation
00:16:48.915 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.StubInfo
00:16:48.916 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.util.collections.ListUtil$Filter
00:16:48.917 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.NullResultGuardian
00:16:48.917 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/NullResultGuardian
00:16:48.920 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/NullResultGuardian
00:16:48.922 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.handler.InvocationNotifierHandler
00:16:48.922 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/handler/InvocationNotifierHandler
00:16:48.923 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/handler/InvocationNotifierHandler
00:16:48.924 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.listeners.MethodInvocationReport
00:16:48.925 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.exceptions.base.MockitoSerializationIssue
00:16:48.926 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/exceptions/base/MockitoSerializationIssue
00:16:48.926 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/exceptions/base/MockitoSerializationIssue
00:16:48.928 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeGenerationException
00:16:48.928 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeGenerationException
00:16:48.929 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeGenerationException
00:16:48.930 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer
00:16:48.944 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer
00:16:48.977 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/Enhancer
00:16:48.982 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator
00:16:48.984 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator
00:16:48.992 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/AbstractClassGenerator
00:16:48.994 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassGenerator
00:16:48.995 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.NamingPolicy
00:16:48.996 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackFilter
00:16:48.996 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantationException
00:16:48.996 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantationException
00:16:48.998 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/InstantationException
00:16:48.999 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultNamingPolicy
00:16:48.999 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultNamingPolicy
00:16:49.000 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultNamingPolicy
00:16:49.003 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.InstantiatorProvider
00:16:49.003 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/InstantiatorProvider
00:16:49.005 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/creation/instance/InstantiatorProvider
00:16:49.006 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.Instantiator
00:16:49.007 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.instance.ObjenesisInstantiator
00:16:49.008 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/instance/ObjenesisInstantiator
00:16:49.009 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/instance/ObjenesisInstantiator
00:16:49.011 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisStd
00:16:49.011 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisStd
00:16:49.012 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisStd
00:16:49.013 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.ObjenesisBase
00:16:49.014 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/ObjenesisBase
00:16:49.017 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/ObjenesisBase
00:16:49.017 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.Objenesis
00:16:49.018 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.InstantiatorStrategy
00:16:49.022 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.GlobalConfiguration
00:16:49.024 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/GlobalConfiguration
00:16:49.025 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/internal/configuration/GlobalConfiguration
00:16:49.025 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.IMockitoConfiguration
00:16:49.029 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.DefaultMockitoConfiguration
00:16:49.029 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/configuration/DefaultMockitoConfiguration
00:16:49.030 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/configuration/DefaultMockitoConfiguration
00:16:49.031 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.configuration.AnnotationEngine
00:16:49.032 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.configuration.ClassPathLoader
00:16:49.032 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/configuration/ClassPathLoader
00:16:49.032 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/configuration/ClassPathLoader
00:16:49.032 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MOCKITO_CONFIGURATION_CLASS_NAME
00:16:49.033 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.StdInstantiatorStrategy
00:16:49.033 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/StdInstantiatorStrategy
00:16:49.034 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/StdInstantiatorStrategy
00:16:49.034 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.strategy.BaseInstantiatorStrategy
00:16:49.034 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/objenesis/strategy/BaseInstantiatorStrategy
00:16:49.034 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/objenesis/strategy/BaseInstantiatorStrategy
00:16:49.035 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.objenesis.instantiator.ObjectInstantiator
00:16:49.037 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.MockitoMethodProxy
00:16:49.042 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.invocation.realmethod.RealMethod
00:16:49.043 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.invocation.Invocation
00:16:49.046 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Predicate
00:16:49.047 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.GeneratorStrategy
00:16:49.048 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessSwitchCallback
00:16:49.051 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ObjectSwitchCallback
00:16:49.052 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator$Context
00:16:49.055 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Transformer
00:16:49.057 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$1
00:16:49.058 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$1
00:16:49.061 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$Source
00:16:49.061 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$Source
00:16:49.061 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/AbstractClassGenerator$Source
00:16:49.063 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey
00:16:49.064 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory
00:16:49.065 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory
00:16:49.066 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory
00:16:49.067 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Customizer
00:16:49.068 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.TypeUtils
00:16:49.072 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/TypeUtils
00:16:49.079 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/TypeUtils
00:16:49.082 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CollectionUtils
00:16:49.082 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CollectionUtils
00:16:49.085 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CollectionUtils
00:16:49.086 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Signature
00:16:49.086 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Signature
00:16:49.088 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Signature
00:16:49.089 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Type
00:16:49.089 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Type
00:16:49.096 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Type
00:16:49.098 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$1
00:16:49.100 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$1
00:16:49.104 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$2
00:16:49.105 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$2
00:16:49.109 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.KeyFactory$Generator
00:16:49.111 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/KeyFactory$Generator
00:16:49.114 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/KeyFactory$Generator
00:16:49.116 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DefaultGeneratorStrategy
00:16:49.117 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DefaultGeneratorStrategy
00:16:49.118 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DefaultGeneratorStrategy
00:16:49.120 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassVisitor
00:16:49.123 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassWriter
00:16:49.125 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassWriter
00:16:49.161 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/ClassWriter
00:16:49.165 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter
00:16:49.193 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter
00:16:49.273 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/DebuggingClassWriter
00:16:49.287 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodVisitor
00:16:49.295 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.AnnotationVisitor
00:16:49.300 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldVisitor
00:16:49.308 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ByteVector
00:16:49.311 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ByteVector
00:16:49.334 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ByteVector
00:16:49.336 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Item
00:16:49.336 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Item
00:16:49.342 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Item
00:16:49.347 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter
00:16:49.348 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter
00:16:49.359 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter
00:16:49.360 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field hookCounter
00:16:49.362 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassAdapter
00:16:49.363 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassAdapter
00:16:49.364 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassAdapter
00:16:49.366 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter
00:16:49.368 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter
00:16:49.385 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/CodeEmitter
00:16:49.394 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter
00:16:49.395 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter
00:16:49.399 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter
00:16:49.402 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodAdapter
00:16:49.403 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodAdapter
00:16:49.405 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodAdapter
00:16:49.407 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$3
00:16:49.408 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$3
00:16:49.410 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassInfo
00:16:49.410 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassInfo
00:16:49.411 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassInfo
00:16:49.412 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$1
00:16:49.412 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$1
00:16:49.414 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils
00:16:49.415 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils
00:16:49.430 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ReflectUtils
00:16:49.435 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.MethodInfo
00:16:49.435 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/MethodInfo
00:16:49.437 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/MethodInfo
00:16:49.438 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$3
00:16:49.439 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$3
00:16:49.442 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$4
00:16:49.442 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$4
00:16:49.444 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$1
00:16:49.444 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$1
00:16:49.446 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ReflectUtils$2
00:16:49.446 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ReflectUtils$2
00:16:49.452 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.AbstractClassGenerator$1
00:16:49.452 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/AbstractClassGenerator$1
00:16:49.454 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils
00:16:49.455 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils
00:16:49.475 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/EmitUtils
00:16:49.478 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ProcessArrayCallback
00:16:49.480 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ParameterTyper
00:16:49.482 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$ArrayDelimiters
00:16:49.482 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
00:16:49.487 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/EmitUtils$ArrayDelimiters
00:16:49.490 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.MethodWriter
00:16:49.494 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/MethodWriter
00:16:49.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/MethodWriter
00:16:49.517 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ACC_CONSTRUCTOR
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESERVED
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field CHOP_FRAME
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SAME_FRAME_EXTENDED
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field APPEND_FRAME
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FULL_FRAME
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field MAXS
00:16:49.518 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NOTHING
00:16:49.526 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Label
00:16:49.527 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Label
00:16:49.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Label
00:16:49.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field DEBUG
00:16:49.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESOLVED
00:16:49.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZED
00:16:49.535 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field PUSHED
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field TARGET
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field STORE
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field REACHABLE
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field JSR
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RET
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SUBROUTINE
00:16:49.536 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field VISITED
00:16:49.537 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Constants
00:16:49.539 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Opcodes
00:16:49.543 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.CodeEmitter$State
00:16:49.543 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/CodeEmitter$State
00:16:49.545 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/CodeEmitter$State
00:16:49.548 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.LocalVariablesSorter$State
00:16:49.548 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/LocalVariablesSorter$State
00:16:49.552 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/LocalVariablesSorter$State
00:16:49.553 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Frame
00:16:49.554 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Frame
00:16:49.563 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/asm/Frame
00:16:49.568 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassEmitter$FieldInfo
00:16:49.574 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassEmitter$FieldInfo
00:16:49.578 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassEmitter$FieldInfo
00:16:49.581 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.FieldWriter
00:16:49.582 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/FieldWriter
00:16:49.584 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/FieldWriter
00:16:49.586 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Edge
00:16:49.586 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Edge
00:16:49.586 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Edge
00:16:49.586 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field NORMAL
00:16:49.586 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXCEPTION
00:16:49.589 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$7
00:16:49.589 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$7
00:16:49.590 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.Local
00:16:49.590 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/Local
00:16:49.590 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/Local
00:16:49.591 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$8
00:16:49.591 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$8
00:16:49.592 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.EmitUtils$9
00:16:49.592 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/EmitUtils$9
00:16:49.594 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.DebuggingClassWriter$1
00:16:49.594 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/DebuggingClassWriter$1
00:16:49.604 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.ClassReader
00:16:49.605 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/ClassReader
00:16:49.642 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/ClassReader
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SIGNATURES
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field ANNOTATIONS
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field FRAMES
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field WRITER
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field RESIZE
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_CODE
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_DEBUG
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field SKIP_FRAMES
00:16:49.643 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field EXPAND_FRAMES
00:16:49.651 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader
00:16:49.666 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader
00:16:49.673 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/core/ClassNameReader
00:16:49.675 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$EarlyExitException
00:16:49.675 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$EarlyExitException
00:16:49.678 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/cglib/core/ClassNameReader$EarlyExitException
00:16:49.680 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.core.ClassNameReader$1
00:16:49.680 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/core/ClassNameReader$1
00:16:49.682 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.asm.Attribute
00:16:49.683 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/asm/Attribute
00:16:49.683 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/asm/Attribute
00:16:49.684 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
00:16:49.685 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/Enhancer$EnhancerKey$$KeyFactoryByCGLIB$$69
00:16:49.696 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.internal.creation.util.SearchingClassLoader
00:16:49.699 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/internal/creation/util/SearchingClassLoader
00:16:49.706 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/mockito/internal/creation/util/SearchingClassLoader
00:16:49.709 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOp
00:16:49.709 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackInfo
00:16:49.709 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/CallbackInfo
00:16:49.713 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/CallbackInfo
00:16:49.714 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.CallbackGenerator
00:16:49.715 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.NoOpGenerator
00:16:49.715 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/NoOpGenerator
00:16:49.718 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/NoOpGenerator
00:16:49.719 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator
00:16:49.719 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator
00:16:49.721 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/MethodInterceptorGenerator
00:16:49.722 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.MethodInterceptorGenerator$1
00:16:49.722 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/MethodInterceptorGenerator$1
00:16:49.725 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandler
00:16:49.726 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.InvocationHandlerGenerator
00:16:49.727 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/InvocationHandlerGenerator
00:16:49.729 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/InvocationHandlerGenerator
00:16:49.730 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoader
00:16:49.730 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.LazyLoaderGenerator
00:16:49.730 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/LazyLoaderGenerator
00:16:49.732 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/LazyLoaderGenerator
00:16:49.733 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.Dispatcher
00:16:49.734 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.DispatcherGenerator
00:16:49.735 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/DispatcherGenerator
00:16:49.735 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/DispatcherGenerator
00:16:49.736 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValue
00:16:49.736 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.FixedValueGenerator
00:16:49.736 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/mockito/cglib/proxy/FixedValueGenerator
00:16:49.736 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/mockito/cglib/proxy/FixedValueGenerator
00:16:49.737 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.mockito.cglib.proxy.ProxyRefDispatcher
00:16:49.742 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.HttpStatus
00:16:49.745 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.http.StreamUtils
00:16:49.745 [main] DEBUG org.evosuite.runtime.classhandling.ClassResetter - __STATIC_RESET() method does not exists in class org.jinstagram.utils.Preconditions
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 6.360 s <<< FAILURE! -- in org.jinstagram.http.Response_ESTest
[ERROR] org.jinstagram.http.Response_ESTest.testGetURL -- Time elapsed: 1.231 s <<< ERROR!
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
	at org.jinstagram.http.Response_ESTest.testGetURL(Response_ESTest.java:34)
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
[ERROR]   Response_ESTest.testGetURL:34 » IncompatibleClassChange Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.530 s
[INFO] Finished at: 2025-07-20T00:16:50+08:00
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
