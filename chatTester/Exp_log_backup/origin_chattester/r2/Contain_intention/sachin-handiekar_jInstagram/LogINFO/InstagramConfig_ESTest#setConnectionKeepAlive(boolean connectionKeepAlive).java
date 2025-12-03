original test path: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/InstagramConfig_ESTest.java
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
[INFO] Total time:  2.678 s
[INFO] Finished at: 2025-05-21T05:34:07+08:00
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
05:34:16.520 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
05:34:16.526 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
05:34:16.530 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/home/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/home/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/home/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/home/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/home/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/home/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/home/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/home/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/home/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/home/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/home/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
05:34:16.530 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 91420
05:34:16.747 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.InstagramConfig_ESTest
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Reference Handler"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Finalizer"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Signal Dispatcher"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Attach Listener"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "Java2D Disposer"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "AWT-XAWT"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "process reaper"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "process reaper"
05:34:17.026 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "main"
05:34:17.027 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-stream-flusher"
05:34:17.027 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager - Adding privileged thread: "surefire-forkedjvm-command-thread"
05:34:17.050 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.InstagramConfig
05:34:17.079 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/InstagramConfig
05:34:17.183 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class org/jinstagram/InstagramConfig
05:34:17.184 [main] DEBUG org.evosuite.runtime.agent.TransformerForTests - Going to instrument: org.jinstagram.model.Constants
05:34:17.185 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class org/jinstagram/model/Constants
05:34:17.186 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class org/jinstagram/model/Constants
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.362 s -- in org.jinstagram.InstagramConfig_ESTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.184 s
[INFO] Finished at: 2025-05-21T05:34:17+08:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
