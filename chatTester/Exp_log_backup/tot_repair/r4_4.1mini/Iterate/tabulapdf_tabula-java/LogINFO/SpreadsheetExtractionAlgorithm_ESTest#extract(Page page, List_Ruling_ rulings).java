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
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java: /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java uses or overrides a deprecated API.
[INFO] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java: Recompile with -Xlint:deprecation for details.
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[26,1] a type with the same simple name is already defined by the single-type-import of java.awt.Rectangle
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[44,17] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[46,21] cannot find symbol
  symbol: class TextElement
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[45,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,38] cannot find symbol
  symbol: class TextElement
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[58,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[59,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[60,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[63,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[64,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[65,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
    constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[72,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[79,30] findCells(java.util.List<technology.tabula.Ruling>,java.util.List<technology.tabula.Ruling>) in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override findCells(java.util.List<technology.tabula.Ruling>,java.util.List<technology.tabula.Ruling>) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
  overridden method is static
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[84,23] no suitable constructor found for Cell(java.awt.Rectangle)
    constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[85,23] no suitable constructor found for Cell(java.awt.Rectangle)
    constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[86,23] no suitable constructor found for Cell(java.awt.Rectangle)
    constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[87,23] no suitable constructor found for Cell(java.awt.Rectangle)
    constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
      (actual and formal argument lists differ in length)
    constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
      (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[92,35] name clash: findSpreadsheetsFromCells(java.util.List<technology.tabula.Cell>) in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> and findSpreadsheetsFromCells(java.util.List<? extends technology.tabula.Rectangle>) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm have the same erasure, yet neither overrides the other
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[91,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[99,10] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[103,5] no suitable method found for assertEquals(int,int,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.lang.String cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.lang.String cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[105,5] cannot find symbol
  symbol:   class Table
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[106,33] cannot find symbol
  symbol:   class TableWithRulingLines
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[106,22] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[108,5] cannot find symbol
  symbol:   class TableWithRulingLines
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[108,31] cannot find symbol
  symbol:   class TableWithRulingLines
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[119,5] no suitable method found for assertEquals(int,int,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.lang.String cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.lang.String cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[123,14] cannot find symbol
  symbol:   class TextElement
  location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[125,34] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[128,33] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[133,5] no suitable method found for assertEquals(int,int,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.lang.String cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.lang.String cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[137,5] no suitable method found for assertEquals(int,int,java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(float,float,float) is not applicable
      (argument mismatch; java.lang.String cannot be converted to float)
    method org.junit.Assert.assertEquals(double,double,double) is not applicable
      (argument mismatch; java.lang.String cannot be converted to double)
    method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
    method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
      (argument mismatch; int cannot be converted to java.lang.String)
[INFO] 33 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.418 s
[INFO] Finished at: 2025-07-11T07:37:05+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project tabula: Compilation failure: Compilation failure: 
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[26,1] a type with the same simple name is already defined by the single-type-import of java.awt.Rectangle
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[44,17] no suitable constructor found for Page(no arguments)
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
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[46,21] cannot find symbol
[ERROR]   symbol: class TextElement
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[45,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[48,38] cannot find symbol
[ERROR]   symbol: class TextElement
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[58,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[59,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[60,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[63,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[64,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[65,17] no suitable constructor found for Ruling(int,int,int,int,boolean,boolean)
[ERROR]     constructor technology.tabula.Ruling.Ruling(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Ruling.Ruling(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[72,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[79,30] findCells(java.util.List<technology.tabula.Ruling>,java.util.List<technology.tabula.Ruling>) in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> cannot override findCells(java.util.List<technology.tabula.Ruling>,java.util.List<technology.tabula.Ruling>) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm
[ERROR]   overridden method is static
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[78,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[84,23] no suitable constructor found for Cell(java.awt.Rectangle)
[ERROR]     constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[85,23] no suitable constructor found for Cell(java.awt.Rectangle)
[ERROR]     constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[86,23] no suitable constructor found for Cell(java.awt.Rectangle)
[ERROR]     constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[87,23] no suitable constructor found for Cell(java.awt.Rectangle)
[ERROR]     constructor technology.tabula.Cell.Cell(float,float,float,float) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor technology.tabula.Cell.Cell(java.awt.geom.Point2D,java.awt.geom.Point2D) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[92,35] name clash: findSpreadsheetsFromCells(java.util.List<technology.tabula.Cell>) in <anonymous technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest$2> and findSpreadsheetsFromCells(java.util.List<? extends technology.tabula.Rectangle>) in technology.tabula.extractors.SpreadsheetExtractionAlgorithm have the same erasure, yet neither overrides the other
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[91,9] method does not override or implement a method from a supertype
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[99,10] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[103,5] no suitable method found for assertEquals(int,int,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[105,5] cannot find symbol
[ERROR]   symbol:   class Table
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[106,33] cannot find symbol
[ERROR]   symbol:   class TableWithRulingLines
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[106,22] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[108,5] cannot find symbol
[ERROR]   symbol:   class TableWithRulingLines
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[108,31] cannot find symbol
[ERROR]   symbol:   class TableWithRulingLines
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[119,5] no suitable method found for assertEquals(int,int,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[123,14] cannot find symbol
[ERROR]   symbol:   class TextElement
[ERROR]   location: class technology.tabula.extractors.SpreadsheetExtractionAlgorithm_ESTest
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[125,34] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[128,33] incompatible types: boolean cannot be converted to java.lang.String
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[133,5] no suitable method found for assertEquals(int,int,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] /Users/curtis/Github/Thesis/chatTester/Repos/tabulapdf_tabula-java/src/test/java/technology/tabula/extractors/SpreadsheetExtractionAlgorithm_ESTest.java:[137,5] no suitable method found for assertEquals(int,int,java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object[],java.lang.Object[]) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(float,float,float) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to float)
[ERROR]     method org.junit.Assert.assertEquals(double,double,double) is not applicable
[ERROR]       (argument mismatch; java.lang.String cannot be converted to double)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,double,double) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,long,long) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR]     method org.junit.Assert.assertEquals(java.lang.String,java.lang.Object,java.lang.Object) is not applicable
[ERROR]       (argument mismatch; int cannot be converted to java.lang.String)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Picked up JAVA_TOOL_OPTIONS: -Duser.language=en -Duser.country=US
