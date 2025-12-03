original test path: /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java
########## Compile INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java: /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java uses unchecked or unsafe operations.
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java: Recompile with -Xlint:unchecked for details.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.274 s
[INFO] Finished at: 2025-05-20T01:32:17+08:00
[INFO] ------------------------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US

########## Test INFO ##########
[INFO] Scanning for projects...
[INFO] Inspecting build with total of 1 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 1 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] 
[INFO] ----------------------< technology.tabula:tabula >----------------------
[INFO] Building Tabula 1.0.6-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:2.22.2:test (default-test) @ tabula ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running technology.tabula.RectangularTextContainer_ESTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 3.596 s <<< FAILURE! - in technology.tabula.RectangularTextContainer_ESTest
[ERROR] testToString(technology.tabula.RectangularTextContainer_ESTest)  Time elapsed: 0.044 s  <<< ERROR!
java.lang.UnsupportedOperationException
	at technology.tabula.RectangularTextContainer_ESTest.testToString(RectangularTextContainer_ESTest.java:44)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   RectangularTextContainer_ESTest.testToString:44 » UnsupportedOperation
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.589 s
[INFO] Finished at: 2025-05-20T01:32:27+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.2:test (default-test) on project tabula: There are test failures.
[ERROR] 
[ERROR] Please refer to /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
[main] INFO org.evosuite.runtime.agent.AgentLoader - dynamically loading javaagent
[main] INFO org.evosuite.runtime.agent.AgentLoader - Using JavaAgent in /Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar
[main] INFO org.evosuite.runtime.agent.AgentLoader - Classpath: /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/test-classes:/Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/classes:/Users/curtis/.m2/repository/org/locationtech/jts/jts-core/1.18.1/jts-core-1.18.1.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-api/1.7.35/slf4j-api-1.7.35.jar:/Users/curtis/.m2/repository/org/slf4j/slf4j-simple/1.7.32/slf4j-simple-1.7.32.jar:/Users/curtis/.m2/repository/org/apache/pdfbox/pdfbox/2.0.26/pdfbox-2.0.26.jar:/Users/curtis/.m2/repository/org/apache/pdfbox/fontbox/2.0.26/fontbox-2.0.26.jar:/Users/curtis/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/curtis/.m2/repository/org/bouncycastle/bcprov-jdk15on/1.70/bcprov-jdk15on-1.70.jar:/Users/curtis/.m2/repository/org/bouncycastle/bcmail-jdk15on/1.70/bcmail-jdk15on-1.70.jar:/Users/curtis/.m2/repository/org/bouncycastle/bcutil-jdk15on/1.70/bcutil-jdk15on-1.70.jar:/Users/curtis/.m2/repository/org/bouncycastle/bcpkix-jdk15on/1.70/bcpkix-jdk15on-1.70.jar:/Users/curtis/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar:/Users/curtis/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/curtis/.m2/repository/commons-cli/commons-cli/1.4/commons-cli-1.4.jar:/Users/curtis/.m2/repository/org/apache/commons/commons-csv/1.9.0/commons-csv-1.9.0.jar:/Users/curtis/.m2/repository/com/google/code/gson/gson/2.9.0/gson-2.9.0.jar:/Users/curtis/.m2/repository/com/github/jai-imageio/jai-imageio-core/1.4.0/jai-imageio-core-1.4.0.jar:/Users/curtis/.m2/repository/com/github/jai-imageio/jai-imageio-jpeg2000/1.4.0/jai-imageio-jpeg2000-1.4.0.jar:/Users/curtis/.m2/repository/org/apache/pdfbox/jbig2-imageio/3.0.4/jbig2-imageio-3.0.4.jar:/Users/curtis/.m2/repository/org/evosuite/evosuite-standalone-runtime/1.0.6/evosuite-standalone-runtime-1.0.6.jar:/Users/curtis/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.9.0/junit-jupiter-api-5.9.0.jar:/Users/curtis/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/curtis/.m2/repository/org/junit/platform/junit-platform-commons/1.9.0/junit-platform-commons-1.9.0.jar:/Users/curtis/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:
[main] INFO org.evosuite.runtime.agent.AgentLoader - Going to attach agent to process 66943
[Attach Listener] INFO org.evosuite.runtime.agent.InstrumentingAgent - Executing agentmain of JavaAgent
Warning: the fonts "Times" and "Lucida Bright" are not available for the Java logical font "Serif", which may have unexpected appearance or behavior. Re-enable the "Times" font to remove this warning.
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/Rectangle
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class technology/tabula/Rectangle
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/Rectangle$1
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/Cell
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class technology/tabula/Cell
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/RectangularTextContainer
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class technology/tabula/RectangularTextContainer
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/TextChunk
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class technology/tabula/TextChunk
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/TextElement
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Creating brand-new static initializer in class technology/tabula/TextElement
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Adding bytecode for initializing field AVERAGE_CHAR_TOLERANCE
[main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter - Adding mock interface to class technology/tabula/TextChunk$DirectionalityOptions
[main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter - Found static initializer in class technology/tabula/TextChunk$DirectionalityOptions
