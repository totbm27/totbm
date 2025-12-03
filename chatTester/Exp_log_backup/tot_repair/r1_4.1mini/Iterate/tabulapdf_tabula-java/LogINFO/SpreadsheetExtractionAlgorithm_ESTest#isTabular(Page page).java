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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[42,26] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[44,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$1> cannot override getText() in technology.tabula.Page
  return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[47,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,36] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[56,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override getText() in technology.tabula.Page
  return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[55,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[59,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[68,32] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[75,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[79,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[88,23] Illegal static declaration in inner class Utils
  modifier 'static' is only allowed in constant variable declarations
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[95,22] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[96,44] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[100,21] cannot find symbol
  symbol:   class Table
  location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[107,21] cannot find symbol
  symbol:   class Table
  location: class BasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[113,22] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[114,44] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[118,21] cannot find symbol
  symbol:   class Table
  location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[138,72] incompatible types: java.util.List<technology.tabula.TextElement> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[140,28] cannot find symbol
  symbol:   class Table
  location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[144,13] cannot find symbol
  symbol:   class Table
  location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[157,28] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[157,67] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[166,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[173,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[177,43] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[181,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[189,43] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[191,37] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[193,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[200,43] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[202,37] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[204,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[211,43] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[213,37] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[215,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[223,44] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[225,38] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[227,33] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[232,44] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[234,38] cannot find symbol
  symbol:   method of(StubTable)
  location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[237,33] incompatible types: boolean cannot be converted to java.lang.String
[INFO] 43 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.085 s
[INFO] Finished at: 2025-07-17T03:08:41+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[42,26] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[44,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$1> cannot override getText() in technology.tabula.Page
[ERROR]   return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[43,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[47,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[54,36] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[56,23] getText() in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override getText() in technology.tabula.Page
[ERROR]   return type java.lang.String is not compatible with java.util.List<technology.tabula.TextElement>
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[55,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[59,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[68,32] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[75,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[79,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[88,23] Illegal static declaration in inner class Utils
[ERROR]   modifier 'static' is only allowed in constant variable declarations
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[95,22] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[96,44] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[100,21] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[107,21] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class BasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[113,22] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[114,44] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[118,21] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestBasicExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[138,72] incompatible types: java.util.List<technology.tabula.TextElement> cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[140,28] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[144,13] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class TestableSpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[157,28] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[157,67] MAGIC_HEURISTIC_NUMBER has private access in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[166,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[173,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[177,43] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[181,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[189,43] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[191,37] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[193,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[200,43] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[202,37] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[204,32] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[211,43] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[213,37] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[215,31] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[223,44] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[225,38] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[227,33] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[232,44] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[234,38] cannot find symbol
[ERROR]   symbol:   method of(StubTable)
[ERROR]   location: interface java.util.List
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[237,33] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
