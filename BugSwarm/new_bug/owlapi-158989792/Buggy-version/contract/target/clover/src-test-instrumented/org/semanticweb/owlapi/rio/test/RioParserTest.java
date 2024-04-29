/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * 
 */
package org.semanticweb.owlapi.rio.test;

import static org.junit.Assert.assertEquals;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RioRDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RioRDFXMLDocumentFormatFactory;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.rdf.rdfxml.parser.RDFXMLParser;
import org.semanticweb.owlapi.rio.RioParserImpl;
import org.semanticweb.owlapi.rio.RioRDFXMLParserFactory;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings({ "javadoc" })
public class RioParserTest extends TestBase {static class __CLR4_5_2bnvbnvlvico2ea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() {try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15115);
        // Use non-Rio storers
        // limit to Rio parsers for RioParserImpl Test
        // testManager = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager(
        // OWLOntologyManagerFactoryRegistry.getOWLDataFactory(),
        // storerRegistry, parserRegistry);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15116);m.getOntologyParsers().set(new RioRDFXMLParserFactory());
        // testOntologyKoala =
        // testManager.loadOntologyFromOntologyDocument(this.getClass().getResourceAsStream("/koala.owl"));
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioParserImpl#parse(org.semanticweb.owlapi.io.OWLOntologyDocumentSource, org.semanticweb.owlapi.model.OWLOntology)}
     */
    @Test
    public void testParse() throws Exception {__CLR4_5_2bnvbnvlvico2ea.R.globalSliceStart(getClass().getName(),15117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se4tqwbnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bnvbnvlvico2ea.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bnvbnvlvico2ea.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioParserTest.testParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se4tqwbnx() throws Exception{try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15117);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15118);OWLOntology owlapiOntologyPrimer = m.createOntology();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15119);RDFXMLParser owlapiParser = new RDFXMLParser();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15120);OWLDocumentFormat owlapiOntologyFormat = owlapiParser.parse(getStream("/koala.owl"), owlapiOntologyPrimer,
            config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15121);assertEquals(70, owlapiOntologyPrimer.getAxiomCount());
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15122);assertEquals(new RDFXMLDocumentFormat(), owlapiOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15123);RioParserImpl rioParser = new RioParserImpl(new RioRDFXMLDocumentFormatFactory());
        // OWLOntology ontology = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager().createOntology(
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15124);OWLOntology ontology = m1.createOntology(IRI.create(
            "http://protege.stanford.edu/plugins/owl/owl-library/koala.owl"));
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15125);OWLDocumentFormat rioOntologyFormat = rioParser.parse(getStream("/koala.owl"), ontology, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15126);assertEquals(new RioRDFXMLDocumentFormat(), rioOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15127);equal(owlapiOntologyPrimer, ontology);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15128);assertEquals(70, ontology.getAxiomCount());
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioParserImpl#parse(org.semanticweb.owlapi.io.OWLOntologyDocumentSource, org.semanticweb.owlapi.model.OWLOntology)}
     */
    @Test
    public void testParsePrimer() throws Exception {__CLR4_5_2bnvbnvlvico2ea.R.globalSliceStart(getClass().getName(),15129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2flynujbo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bnvbnvlvico2ea.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bnvbnvlvico2ea.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioParserTest.testParsePrimer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2flynujbo9() throws Exception{try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15129);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15130);OWLOntology owlapiOntologyPrimer = m.createOntology();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15131);RDFXMLParser owlapiParser = new RDFXMLParser();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15132);OWLDocumentFormat owlapiOntologyFormat = owlapiParser.parse(getStream("/primer.rdfxml.xml"),
            owlapiOntologyPrimer, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15133);assertEquals(93, owlapiOntologyPrimer.getAxiomCount());
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15134);assertEquals(new RDFXMLDocumentFormat(), owlapiOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15135);RioParserImpl rioParser = new RioParserImpl(new RioRDFXMLDocumentFormatFactory());
        // OWLOntology rioOntologyPrimer = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager()
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15136);OWLOntology rioOntologyPrimer = m1.createOntology(IRI.create("http://example.com/owl/families"));
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15137);OWLDocumentFormat rioOntologyFormat = rioParser.parse(getStream("/primer.rdfxml.xml"), rioOntologyPrimer,
            config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15138);assertEquals(new RioRDFXMLDocumentFormat(), rioOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15139);equal(owlapiOntologyPrimer, rioOntologyPrimer);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15140);assertEquals(93, rioOntologyPrimer.getAxiomCount());
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}

    /**
     * @return stream
     */
    @Nonnull
        StreamDocumentSource getStream(String name) {try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15141);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15142);return new StreamDocumentSource(getClass().getResourceAsStream(name));
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioParserImpl#parse(org.semanticweb.owlapi.io.OWLOntologyDocumentSource, org.semanticweb.owlapi.model.OWLOntology)}
     */
    @Test
    public void testParsePrimerSubset() throws Exception {__CLR4_5_2bnvbnvlvico2ea.R.globalSliceStart(getClass().getName(),15143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cl3qrhbon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bnvbnvlvico2ea.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bnvbnvlvico2ea.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioParserTest.testParsePrimerSubset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cl3qrhbon() throws Exception{try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15143);
        // XXX this test does not work yet
        // output:
        // Rio:
        // DatatypeDefinition(<http://example.com/owl/families/majorAge>
        // DataIntersectionOf(<http://org.semanticweb.owlapi/error#Error1>
        // DataComplementOf(<http://example.com/owl/families/minorAge>) ))
        // OWLAPI:
        // DatatypeDefinition(<http://example.com/owl/families/majorAge>
        // DataIntersectionOf(<http://example.com/owl/families/personAge>
        // DataComplementOf(<http://example.com/owl/families/minorAge>) ))]
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15144);OWLOntology owlapiOntologyPrimer = m.createOntology();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15145);RDFXMLParser owlapiParser = new RDFXMLParser();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15146);OWLDocumentFormat owlapiOntologyFormat = owlapiParser.parse(getStream("/rioParserTest1-minimal.rdf"),
            owlapiOntologyPrimer, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15147);assertEquals(4, owlapiOntologyPrimer.getAxiomCount());
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15148);assertEquals(new RDFXMLDocumentFormat(), owlapiOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15149);RioParserImpl rioParser = new RioParserImpl(new RioRDFXMLDocumentFormatFactory());
        // OWLOntology rioOntologyPrimer = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager().createOntology(
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15150);OWLOntology rioOntologyPrimer = m1.createOntology(IRI.create("http://example.com/owl/families"));
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15151);OWLDocumentFormat rioOntologyFormat = rioParser.parse(getStream("/rioParserTest1-minimal.rdf"),
            rioOntologyPrimer, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15152);assertEquals(new RioRDFXMLDocumentFormat(), rioOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15153);equal(owlapiOntologyPrimer, rioOntologyPrimer);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15154);assertEquals(4, rioOntologyPrimer.getAxiomCount());
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.RioParserImpl#parse(org.semanticweb.owlapi.io.OWLOntologyDocumentSource, org.semanticweb.owlapi.model.OWLOntology)}
     */
    @Test
    public void testParsePrimerMinimalSubset() throws Exception {__CLR4_5_2bnvbnvlvico2ea.R.globalSliceStart(getClass().getName(),15155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26wh5e2boz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bnvbnvlvico2ea.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bnvbnvlvico2ea.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.test.RioParserTest.testParsePrimerMinimalSubset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26wh5e2boz() throws Exception{try{__CLR4_5_2bnvbnvlvico2ea.R.inc(15155);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15156);OWLOntology owlapiOntologyPrimer = m.createOntology();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15157);RDFXMLParser owlapiParser = new RDFXMLParser();
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15158);OWLDocumentFormat owlapiOntologyFormat = owlapiParser.parse(getStream("/rioParserTest1-minimal.rdf"),
            owlapiOntologyPrimer, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15159);assertEquals(4, owlapiOntologyPrimer.getAxiomCount());
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15160);assertEquals(new RDFXMLDocumentFormat(), owlapiOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15161);RioParserImpl rioParser = new RioParserImpl(new RioRDFXMLDocumentFormatFactory());
        // OWLOntology rioOntologyPrimer = OWLOntologyManagerFactoryRegistry
        // .createOWLOntologyManager().createOntology(
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15162);OWLOntology rioOntologyPrimer = m1.createOntology(IRI.create("http://example.com/owl/families"));
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15163);OWLDocumentFormat rioOntologyFormat = rioParser.parse(getStream("/rioParserTest1-minimal.rdf"),
            rioOntologyPrimer, config);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15164);assertEquals(new RioRDFXMLDocumentFormat(), rioOntologyFormat);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15165);equal(owlapiOntologyPrimer, rioOntologyPrimer);
        __CLR4_5_2bnvbnvlvico2ea.R.inc(15166);assertEquals(4, rioOntologyPrimer.getAxiomCount());
    }finally{__CLR4_5_2bnvbnvlvico2ea.R.flushNeeded();}}
}
