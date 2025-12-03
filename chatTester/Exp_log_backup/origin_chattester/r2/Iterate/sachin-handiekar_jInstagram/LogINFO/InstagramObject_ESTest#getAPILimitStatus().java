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
[INFO] Total time:  2.324 s
[INFO] Finished at: 2025-05-21T15:54:00+08:00
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
15:54:08.135 [main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
15:54:08.141 [main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
15:54:08.144 [main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/sachin-handiekar_jInstagram/target/classes:/home/curtis/.m2/repository/com/google/code/gson/gson/2.7/gson-2.7.jar:/home/curtis/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar:/home/curtis/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar:/home/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.21/slf4j-api-1.7.21.jar:/home/curtis/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/home/curtis/.m2/repository/org/mockito/mockito-core/1.10.19/mockito-core-1.10.19.jar:/home/curtis/.m2/repository/org/objenesis/objenesis/2.1/objenesis-2.1.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar:/home/curtis/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito/1.6.6/powermock-api-mockito-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-mockito-common/1.6.6/powermock-api-mockito-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-api-support/1.6.6/powermock-api-support-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4/1.6.6/powermock-module-junit4-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-module-junit4-common/1.6.6/powermock-module-junit4-common-1.6.6.jar:/home/curtis/.m2/repository/org/powermock/powermock-core/1.6.6/powermock-core-1.6.6.jar:/home/curtis/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar:/home/curtis/.m2/repository/org/powermock/powermock-reflect/1.6.6/powermock-reflect-1.6.6.jar:/home/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/home/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/home/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/home/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/home/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
15:54:08.145 [main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 263526
15:54:08.364 [Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
[INFO] Running org.jinstagram.InstagramObject_ESTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.014 s <<< FAILURE! -- in org.jinstagram.InstagramObject_ESTest
[ERROR] org.jinstagram.InstagramObject_ESTest -- Time elapsed: 0.002 s <<< ERROR!
java.lang.Exception: No runnable methods
	at org.junit.runners.BlockJUnit4ClassRunner.validateInstanceMethods(BlockJUnit4ClassRunner.java:191)
	at org.junit.runners.BlockJUnit4ClassRunner.collectInitializationErrors(BlockJUnit4ClassRunner.java:128)
	at org.junit.runners.ParentRunner.validate(ParentRunner.java:416)
	at org.junit.runners.ParentRunner.<init>(ParentRunner.java:84)
	at org.junit.runners.BlockJUnit4ClassRunner.<init>(BlockJUnit4ClassRunner.java:65)
	at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:77)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
	at org.junit.vintage.engine.discovery.DefensiveAllDefaultPossibilitiesBuilder$DefensiveAnnotatedBuilder.buildRunner(DefensiveAllDefaultPossibilitiesBuilder.java:114)
	at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
	at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:26)
	at org.junit.vintage.engine.discovery.DefensiveAllDefaultPossibilitiesBuilder.runnerForClass(DefensiveAllDefaultPossibilitiesBuilder.java:57)
	at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	at org.junit.vintage.engine.discovery.ClassSelectorResolver.resolveTestClass(ClassSelectorResolver.java:66)
	at org.junit.vintage.engine.discovery.ClassSelectorResolver.resolve(ClassSelectorResolver.java:47)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolution.lambda$resolve$2(EngineDiscoveryRequestResolution.java:135)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1361)
	at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)
	at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:531)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolution.resolve(EngineDiscoveryRequestResolution.java:189)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolution.resolve(EngineDiscoveryRequestResolution.java:126)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolution.resolveCompletely(EngineDiscoveryRequestResolution.java:92)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolution.run(EngineDiscoveryRequestResolution.java:83)
	at org.junit.platform.engine.support.discovery.EngineDiscoveryRequestResolver.resolve(EngineDiscoveryRequestResolver.java:113)
	at org.junit.vintage.engine.discovery.VintageDiscoverer.discover(VintageDiscoverer.java:42)
	at org.junit.vintage.engine.VintageTestEngine.discover(VintageTestEngine.java:64)
	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discoverEngineRoot(EngineDiscoveryOrchestrator.java:152)
	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discoverSafely(EngineDiscoveryOrchestrator.java:132)
	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discover(EngineDiscoveryOrchestrator.java:107)
	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discover(EngineDiscoveryOrchestrator.java:78)
	at org.junit.platform.launcher.core.DefaultLauncher.discover(DefaultLauncher.java:110)
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
[ERROR]   InstagramObject_ESTest »  No runnable methods
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.586 s
[INFO] Finished at: 2025-05-21T15:54:08+08:00
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
