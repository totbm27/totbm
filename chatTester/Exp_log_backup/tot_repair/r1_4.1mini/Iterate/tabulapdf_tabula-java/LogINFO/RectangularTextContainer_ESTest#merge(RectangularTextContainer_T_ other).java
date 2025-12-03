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
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[82,45] method merge(TestRectangularTextContainer) is already defined in class TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[58,29] getTextElements() in TestRectangularTextContainer cannot override getTextElements() in technology.tabula.RectangularTextContainer
  return type java.util.List<java.lang.String> is not compatible with java.util.List<TestRectangularTextContainer>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[65,25] cannot find symbol
  symbol:   method compare(float,float)
  location: class java.awt.geom.Rectangle2D.Float
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[81,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[102,59] incompatible types: void cannot be converted to TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[106,38] cannot find symbol
  symbol:   method of(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[107,5] no suitable method found for assertEquals(java.util.List<java.lang.String>,java.util.List<java.lang.String>,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[110,16] incompatible types: TestRectangularTextContainer cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[113,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[114,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[115,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[116,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[126,60] incompatible types: void cannot be converted to TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[129,39] cannot find symbol
  symbol:   method of(java.lang.String,java.lang.String,java.lang.String)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[130,5] no suitable method found for assertEquals(java.util.List<java.lang.String>,java.util.List<java.lang.String>,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[133,16] incompatible types: TestRectangularTextContainer cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[136,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[137,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[138,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[139,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[INFO] 20 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.980 s
[INFO] Finished at: 2025-07-17T02:44:38+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[82,45] method merge(TestRectangularTextContainer) is already defined in class TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[58,29] getTextElements() in TestRectangularTextContainer cannot override getTextElements() in technology.tabula.RectangularTextContainer
[ERROR]   return type java.util.List<java.lang.String> is not compatible with java.util.List<TestRectangularTextContainer>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[65,25] cannot find symbol
[ERROR]   symbol:   method compare(float,float)
[ERROR]   location: class java.awt.geom.Rectangle2D.Float
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[81,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[102,59] incompatible types: void cannot be converted to TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[106,38] cannot find symbol
[ERROR]   symbol:   method of(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[107,5] no suitable method found for assertEquals(java.util.List<java.lang.String>,java.util.List<java.lang.String>,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[110,16] incompatible types: TestRectangularTextContainer cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[113,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[114,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[115,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[116,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[126,60] incompatible types: void cannot be converted to TestRectangularTextContainer
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[129,39] cannot find symbol
[ERROR]   symbol:   method of(java.lang.String,java.lang.String,java.lang.String)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[130,5] no suitable method found for assertEquals(java.util.List<java.lang.String>,java.util.List<java.lang.String>,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; java.util.List<java.lang.String> cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[133,16] incompatible types: TestRectangularTextContainer cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[136,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[137,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[138,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/RectangularTextContainer_ESTest.java:[139,5] no suitable method found for assertEquals(int,float,double,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,float,float,float) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
