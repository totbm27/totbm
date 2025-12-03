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
[INFO] --- clean:3.2.0:clean (default-clean) @ tabula ---
[INFO] Deleting /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ tabula ---
[INFO] skip non existing resourceDirectory /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 36 source files to /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/classes
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/java/technology/tabula/RectangleSpatialIndex.java: Some input files use or override a deprecated API.
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/java/technology/tabula/RectangleSpatialIndex.java: Recompile with -Xlint:deprecation for details.
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/java/technology/tabula/Table.java: Some input files use unchecked or unsafe operations.
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/main/java/technology/tabula/Table.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ tabula ---
[INFO] Copying 334 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ tabula ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[35,25] no suitable constructor found for TextElement(java.lang.String,float,float,float,float)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[36,25] no suitable constructor found for TextElement(java.lang.String,float,float,float,float)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
      (actual and formal argument lists differ in length)
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.224 s
[INFO] Finished at: 2025-08-01T18:00:04+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[35,25] no suitable constructor found for TextElement(java.lang.String,float,float,float,float)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[36,25] no suitable constructor found for TextElement(java.lang.String,float,float,float,float)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.TextElement.TextElement(float,float,float,float,org.apache.pdfbox.pdmodel.font.PDFont,float,java.lang.String,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
