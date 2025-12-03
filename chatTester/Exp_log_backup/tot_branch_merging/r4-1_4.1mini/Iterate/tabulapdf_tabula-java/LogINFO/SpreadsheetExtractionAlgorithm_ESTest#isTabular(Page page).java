original test path: /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java
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
[INFO] Compiling 3 source files to /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/target/test-classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[23,1] a type with the same simple name is already defined by the single-type-import of java.awt.Rectangle
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[37,26] no suitable constructor found for Page(no arguments)
    constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[39,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$1> cannot override getText() in technology.tabula.Page
  return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[42,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[49,25] no suitable constructor found for Page(no arguments)
    constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[51,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override getText() in technology.tabula.Page
  return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[50,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[62,28] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[63,56] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[67,31] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[67,38] extract(technology.tabula.Page) in TestSpreadsheetExtractionAlgorithm cannot override extract(technology.tabula.Page) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
  return type java.util.List<? extends Table> is not compatible with java.util.List<technology.tabula.Table>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[73,28] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[74,50] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,31] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,38] extract(technology.tabula.Page) in TestBasicExtractionAlgorithm cannot override extract(technology.tabula.Page) in technology.tabula.extractors.BasicExtractionAlgorithm
  return type java.util.List<? extends Table> is not compatible with java.util.List<technology.tabula.Table>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[84,32] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[91,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[95,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[116,47] cannot find symbol
  symbol:   variable Utils
  location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[118,28] cannot find symbol
  symbol:   class Table
  location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[122,13] cannot find symbol
  symbol:   class Table
  location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[136,28] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[136,67] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[144,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[151,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[160,30] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[169,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[178,32] incompatible types: boolean cannot be converted to java.lang.String
[INFO] 30 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.671 s
[INFO] Finished at: 2025-07-13T21:31:56+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[23,1] a type with the same simple name is already defined by the single-type-import of java.awt.Rectangle
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[37,26] no suitable constructor found for Page(no arguments)
[ERROR]     constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[39,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$1> cannot override getText() in technology.tabula.Page
[ERROR]   return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[38,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[42,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[49,25] no suitable constructor found for Page(no arguments)
[ERROR]     constructor technology.tabula.Page.Page(technology.tabula.PageDims,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,technology.tabula.ObjectExtractorStreamEngine,technology.tabula.TextStripper) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Page.Page(float,float,float,float,int,int,org.apache.pdfbox.pdmodel.PDPage,org.apache.pdfbox.pdmodel.PDDocument,java.util.List<technology.tabula.TextElement>,java.util.List<technology.tabula.Ruling>,float,float,technology.tabula.RectangleSpatialIndex<technology.tabula.TextElement>) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[51,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override getText() in technology.tabula.Page
[ERROR]   return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[50,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[62,28] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[63,56] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[67,31] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[67,38] extract(technology.tabula.Page) in TestSpreadsheetExtractionAlgorithm cannot override extract(technology.tabula.Page) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR]   return type java.util.List<? extends Table> is not compatible with java.util.List<technology.tabula.Table>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[73,28] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[74,50] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,31] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,38] extract(technology.tabula.Page) in TestBasicExtractionAlgorithm cannot override extract(technology.tabula.Page) in technology.tabula.extractors.BasicExtractionAlgorithm
[ERROR]   return type java.util.List<? extends Table> is not compatible with java.util.List<technology.tabula.Table>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[84,32] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[91,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[95,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[116,47] cannot find symbol
[ERROR]   symbol:   variable Utils
[ERROR]   location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[118,28] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[122,13] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[136,28] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[136,67] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[144,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[151,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[160,30] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[169,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[178,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
