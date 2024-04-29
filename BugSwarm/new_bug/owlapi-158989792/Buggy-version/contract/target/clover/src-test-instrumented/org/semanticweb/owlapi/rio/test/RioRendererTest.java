/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * 
 */
package org.semanticweb.owlapi.rio.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.openrdf.model.Statement;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.OWL;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFParser;
import org.openrdf.rio.RDFWriter;
import org.openrdf.rio.Rio;
import org.openrdf.rio.helpers.StatementCollector;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.rio.RioManchesterSyntaxParserFactory;
import org.semanticweb.owlapi.rio.RioNTriplesStorerFactory;
import org.semanticweb.owlapi.rio.RioRDFXMLStorerFactory;
import org.semanticweb.owlapi.rio.RioRenderer;
import org.semanticweb.owlapi.rio.RioTurtleStorerFactory;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings({ "javadoc", "null" })
public class RioRendererTest extends TestBase {static class __CLR4_5_2bpbbpblvico2em{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ValueFactory vf;
    @Nonnull private OWLOntology testOntologyEmpty;
    @Nonnull private OWLOntology testOntologyKoala;
    private Statement testOntologyEmptyStatement;
    @Nonnull private final IRI testOntologyUri1 = IRI.create("urn:test:ontology:uri:1");
    private StatementCollector testHandlerStatementCollector;
    private StringWriter testRdfXmlStringWriter;
    private RDFWriter testRdfXmlRioWriter;
    private StringWriter testTurtleStringWriter;
    private RDFWriter testTurtleRioWriter;
    private StringWriter testNTriplesStringWriter;
    private RDFWriter testNTriplesRioWriter;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2bpbbpblvico2em.R.inc(15167);
        __CLR4_5_2bpbbpblvico2em.R.inc(15168);vf = new ValueFactoryImpl();
        // limit the storers to known Rio OntologyStorers to minimise false
        // negative results
        // use all parsers for renderer test
        // OWLParserFactoryRegistry parserRegistry = new
        // OWLParserFactoryRegistry();
        // XXX update registry
        // testManager = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager(
        // OWLOntologyManagerFactoryRegistry.getOWLDataFactory(),
        // storerRegistry, parserRegistry);
        __CLR4_5_2bpbbpblvico2em.R.inc(15169);m.getOntologyStorers().set(new RioNTriplesStorerFactory(), new RioRDFXMLStorerFactory(),
            new RioTurtleStorerFactory());
        __CLR4_5_2bpbbpblvico2em.R.inc(15170);testOntologyEmpty = m.createOntology(testOntologyUri1);
        __CLR4_5_2bpbbpblvico2em.R.inc(15171);testOntologyKoala = m.loadOntologyFromOntologyDocument(getClass().getResourceAsStream("/koala.owl"));
        __CLR4_5_2bpbbpblvico2em.R.inc(15172);assertEquals(70, testOntologyKoala.getAxiomCount());
        __CLR4_5_2bpbbpblvico2em.R.inc(15173);testHandlerStatementCollector = new StatementCollector();
        __CLR4_5_2bpbbpblvico2em.R.inc(15174);testOntologyEmptyStatement = vf.createStatement(vf.createURI("urn:test:ontology:uri:1"), RDF.TYPE,
            OWL.ONTOLOGY);
        __CLR4_5_2bpbbpblvico2em.R.inc(15175);testRdfXmlStringWriter = new StringWriter();
        __CLR4_5_2bpbbpblvico2em.R.inc(15176);testRdfXmlRioWriter = Rio.createWriter(RDFFormat.RDFXML, testRdfXmlStringWriter);
        __CLR4_5_2bpbbpblvico2em.R.inc(15177);testTurtleStringWriter = new StringWriter();
        __CLR4_5_2bpbbpblvico2em.R.inc(15178);testTurtleRioWriter = Rio.createWriter(RDFFormat.TURTLE, testTurtleStringWriter);
        __CLR4_5_2bpbbpblvico2em.R.inc(15179);testNTriplesStringWriter = new StringWriter();
        __CLR4_5_2bpbbpblvico2em.R.inc(15180);testNTriplesRioWriter = Rio.createWriter(RDFFormat.NTRIPLES, testNTriplesStringWriter);
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /* 
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderEmptyStatementCollector() throws IOException {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lyj92bpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderEmptyStatementCollector",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lyj92bpp() throws IOException{try{__CLR4_5_2bpbbpblvico2em.R.inc(15181);
        __CLR4_5_2bpbbpblvico2em.R.inc(15182);RioRenderer testRenderer = new RioRenderer(testOntologyEmpty, testHandlerStatementCollector, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15183);testRenderer.render();
        __CLR4_5_2bpbbpblvico2em.R.inc(15184);assertEquals(6, testHandlerStatementCollector.getNamespaces().size());
        __CLR4_5_2bpbbpblvico2em.R.inc(15185);assertEquals(1, testHandlerStatementCollector.getStatements().size());
        // Verify that the RDF:TYPE OWL:ONTOLOGY statement was generated for the
        // otherwise empty
        // ontology
        __CLR4_5_2bpbbpblvico2em.R.inc(15186);assertEquals(testOntologyEmptyStatement, testHandlerStatementCollector.getStatements().iterator().next());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderEmptyRdfXmlWriter() throws IOException {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27s7mbibpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderEmptyRdfXmlWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27s7mbibpv() throws IOException{try{__CLR4_5_2bpbbpblvico2em.R.inc(15187);
        __CLR4_5_2bpbbpblvico2em.R.inc(15188);RioRenderer testRenderer = new RioRenderer(testOntologyEmpty, testRdfXmlRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15189);testRenderer.render();
        // testRdfXmlRioWriter outputs its results to testRdfXmlStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15190);String result = testRdfXmlStringWriter.toString();
        __CLR4_5_2bpbbpblvico2em.R.inc(15191);assertTrue("Result was smaller than expected:" + result, result.length() > 560);
        __CLR4_5_2bpbbpblvico2em.R.inc(15192);assertTrue("Result was larger than expected:" + result, result.length() < 590);
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderEmptyTurtleWriter() throws IOException {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hk517pbq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderEmptyTurtleWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hk517pbq1() throws IOException{try{__CLR4_5_2bpbbpblvico2em.R.inc(15193);
        __CLR4_5_2bpbbpblvico2em.R.inc(15194);RioRenderer testRenderer = new RioRenderer(testOntologyEmpty, testTurtleRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15195);testRenderer.render();
        // testTurtleRioWriter outputs its results to testTurtleStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15196);String result = testTurtleStringWriter.toString();
        __CLR4_5_2bpbbpblvico2em.R.inc(15197);assertTrue("Result was smaller than expected:" + result, result.length() > 420);
        __CLR4_5_2bpbbpblvico2em.R.inc(15198);assertTrue("Result was larger than expected:" + result, result.length() < 450);
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderEmptyNTriplesWriter() throws IOException {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u31czqbq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderEmptyNTriplesWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u31czqbq7() throws IOException{try{__CLR4_5_2bpbbpblvico2em.R.inc(15199);
        __CLR4_5_2bpbbpblvico2em.R.inc(15200);RioRenderer testRenderer = new RioRenderer(testOntologyEmpty, testNTriplesRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15201);testRenderer.render();
        // testNTriplesRioWriter outputs its results to testNTriplesStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15202);String result = testNTriplesStringWriter.toString();
        __CLR4_5_2bpbbpblvico2em.R.inc(15203);assertTrue("Result was smaller than expected:" + result, result.length() > 190);
        __CLR4_5_2bpbbpblvico2em.R.inc(15204);assertTrue("Result was larger than expected:" + result, result.length() < 220);
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderKoalaStatementCollector() throws IOException {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ul22z3bqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderKoalaStatementCollector",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ul22z3bqd() throws IOException{try{__CLR4_5_2bpbbpblvico2em.R.inc(15205);
        __CLR4_5_2bpbbpblvico2em.R.inc(15206);RioRenderer testRenderer = new RioRenderer(testOntologyKoala, testHandlerStatementCollector, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15207);testRenderer.render();
        __CLR4_5_2bpbbpblvico2em.R.inc(15208);assertEquals(6, testHandlerStatementCollector.getNamespaces().size());
        __CLR4_5_2bpbbpblvico2em.R.inc(15209);assertEquals(171, testHandlerStatementCollector.getStatements().size());
        // check for duplicate statements
        __CLR4_5_2bpbbpblvico2em.R.inc(15210);HashSet<Statement> resultStatements = new HashSet<>(testHandlerStatementCollector.getStatements());
        __CLR4_5_2bpbbpblvico2em.R.inc(15211);assertEquals("Duplicate statements were emitted", 171, resultStatements.size());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderKoalaRdfXmlWriter() throws Exception {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ys1fndbqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderKoalaRdfXmlWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ys1fndbqk() throws Exception{try{__CLR4_5_2bpbbpblvico2em.R.inc(15212);
        __CLR4_5_2bpbbpblvico2em.R.inc(15213);RioRenderer testRenderer = new RioRenderer(testOntologyKoala, testRdfXmlRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15214);testRenderer.render();
        // testRdfXmlRioWriter outputs its results to testRdfXmlStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15215);String result = testRdfXmlStringWriter.toString();
        // actual length depends on the length of dynamically assigned blank
        // node identifiers, so we
        // only test a minimum length and a maximum length
        __CLR4_5_2bpbbpblvico2em.R.inc(15216);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() > 24000);
        __CLR4_5_2bpbbpblvico2em.R.inc(15217);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() < 26000);
        __CLR4_5_2bpbbpblvico2em.R.inc(15218);RDFParser parser = Rio.createParser(RDFFormat.RDFXML, vf);
        __CLR4_5_2bpbbpblvico2em.R.inc(15219);parser.setRDFHandler(testHandlerStatementCollector);
        __CLR4_5_2bpbbpblvico2em.R.inc(15220);parser.parse(new StringReader(result), "");
        // NOTE: The base xmlns: does not get counted as a namespace by the Rio
        // RDFXML parser, which
        // is why it counts to 5, compared to direct StatementCollector result
        // and the turtle result
        __CLR4_5_2bpbbpblvico2em.R.inc(15221);assertEquals(5, testHandlerStatementCollector.getNamespaces().size());
        __CLR4_5_2bpbbpblvico2em.R.inc(15222);assertEquals(171, testHandlerStatementCollector.getStatements().size());
        // check for duplicate statements
        __CLR4_5_2bpbbpblvico2em.R.inc(15223);HashSet<Statement> resultStatements = new HashSet<>(testHandlerStatementCollector.getStatements());
        __CLR4_5_2bpbbpblvico2em.R.inc(15224);assertEquals("Duplicate statements were emitted", 171, resultStatements.size());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderKoalaTurtleWriter() throws Exception {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qh57fkbqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderKoalaTurtleWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qh57fkbqx() throws Exception{try{__CLR4_5_2bpbbpblvico2em.R.inc(15225);
        __CLR4_5_2bpbbpblvico2em.R.inc(15226);RioRenderer testRenderer = new RioRenderer(testOntologyKoala, testTurtleRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15227);testRenderer.render();
        // testTurtleRioWriter outputs its results to testTurtleStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15228);String result = testTurtleStringWriter.toString();
        // actual length depends on the length of dynamically assigned blank
        // node identifiers, so we
        // only test a minimum length and a maximum length
        __CLR4_5_2bpbbpblvico2em.R.inc(15229);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() > 8250);
        __CLR4_5_2bpbbpblvico2em.R.inc(15230);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() < 9500);
        __CLR4_5_2bpbbpblvico2em.R.inc(15231);RDFParser parser = Rio.createParser(RDFFormat.TURTLE, vf);
        __CLR4_5_2bpbbpblvico2em.R.inc(15232);parser.setRDFHandler(testHandlerStatementCollector);
        __CLR4_5_2bpbbpblvico2em.R.inc(15233);parser.parse(new StringReader(result), "");
        __CLR4_5_2bpbbpblvico2em.R.inc(15234);assertEquals(6, testHandlerStatementCollector.getNamespaces().size());
        __CLR4_5_2bpbbpblvico2em.R.inc(15235);assertEquals(171, testHandlerStatementCollector.getStatements().size());
        // check for duplicate statements
        __CLR4_5_2bpbbpblvico2em.R.inc(15236);HashSet<Statement> resultStatements = new HashSet<>(testHandlerStatementCollector.getStatements());
        __CLR4_5_2bpbbpblvico2em.R.inc(15237);assertEquals("Duplicate statements were emitted", 171, resultStatements.size());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioRenderer#render(org.semanticweb.owlapi.io.RDFResource)}
     */
    @Test
    public void testRenderKoalaNTriplesWriter() throws Exception {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dy9gcrbra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRenderKoalaNTriplesWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dy9gcrbra() throws Exception{try{__CLR4_5_2bpbbpblvico2em.R.inc(15238);
        __CLR4_5_2bpbbpblvico2em.R.inc(15239);RioRenderer testRenderer = new RioRenderer(testOntologyKoala, testNTriplesRioWriter, null);
        __CLR4_5_2bpbbpblvico2em.R.inc(15240);testRenderer.render();
        // testNTriplesRioWriter outputs its results to testNTriplesStringWriter
        __CLR4_5_2bpbbpblvico2em.R.inc(15241);String result = testNTriplesStringWriter.toString();
        // actual length depends on the length of dynamically assigned blank
        // node identifiers, so we
        // only test a minimum length and a maximum length
        __CLR4_5_2bpbbpblvico2em.R.inc(15242);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() > 26200);
        __CLR4_5_2bpbbpblvico2em.R.inc(15243);assertTrue("result.length()=" + result.length() + " was not inside the expected bounds", result
            .length() < 27500);
        __CLR4_5_2bpbbpblvico2em.R.inc(15244);RDFParser parser = Rio.createParser(RDFFormat.NTRIPLES, vf);
        __CLR4_5_2bpbbpblvico2em.R.inc(15245);parser.setRDFHandler(testHandlerStatementCollector);
        __CLR4_5_2bpbbpblvico2em.R.inc(15246);parser.parse(new StringReader(result), "");
        // NTriples does not contain namespaces, so we will not find any when
        // parsing the document
        __CLR4_5_2bpbbpblvico2em.R.inc(15247);assertEquals(0, testHandlerStatementCollector.getNamespaces().size());
        __CLR4_5_2bpbbpblvico2em.R.inc(15248);assertEquals(171, testHandlerStatementCollector.getStatements().size());
        // check for duplicate statements
        __CLR4_5_2bpbbpblvico2em.R.inc(15249);HashSet<Statement> resultStatements = new HashSet<>(testHandlerStatementCollector.getStatements());
        __CLR4_5_2bpbbpblvico2em.R.inc(15250);assertEquals("Duplicate statements were emitted", 171, resultStatements.size());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}

    @Test
    public void testRioOWLRDFParser() throws Exception {__CLR4_5_2bpbbpblvico2em.R.globalSliceStart(getClass().getName(),15251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocagzobrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bpbbpblvico2em.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bpbbpblvico2em.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioRendererTest.testRioOWLRDFParser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocagzobrn() throws Exception{try{__CLR4_5_2bpbbpblvico2em.R.inc(15251);
        __CLR4_5_2bpbbpblvico2em.R.inc(15252);RDFParser parser = new RioManchesterSyntaxParserFactory().getParser();
        __CLR4_5_2bpbbpblvico2em.R.inc(15253);String inputManSyntax = "Prefix: owl: <http://www.w3.org/2002/07/owl#>\n"
            + "Prefix: rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
            + "Prefix: xml: <http://www.w3.org/XML/1998/namespace>\n"
            + "Prefix: xsd: <http://www.w3.org/2001/XMLSchema#>\n"
            + "Prefix: rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
            + "Ontology: <http://www.owl-ontologies.com/Ontology1307394066.owl>\n" + "Datatype: xsd:decimal\n"
            + "Datatype: xsd:int\n" + "Datatype: xsd:dateTime\n"
            + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>\n"
            + "    Characteristics: \n" + "        Functional\n" + "    Range: \n" + "        xsd:int\n"
            + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasDate>\n" + "    Range: \n"
            + "        xsd:dateTime\n" + "Class: <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n"
            + "Individual: <http://www.owl-ontologies.com/Ontology1307394066.owl#p1>\n" + "    Types: \n"
            + "        <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n" + "Rule: \n"
            + "    xsd:decimal(?x), <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>(?p, ?x) -> <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>(?p)";
        __CLR4_5_2bpbbpblvico2em.R.inc(15254);parser.setRDFHandler(testHandlerStatementCollector);
        __CLR4_5_2bpbbpblvico2em.R.inc(15255);parser.parse(new StringReader(inputManSyntax), "http://www.owl-ontologies.com/Ontology1307394066.owl");
        __CLR4_5_2bpbbpblvico2em.R.inc(15256);assertEquals(36, testHandlerStatementCollector.getStatements().size());
    }finally{__CLR4_5_2bpbbpblvico2em.R.flushNeeded();}}
}
