/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * 
 */
package org.semanticweb.owlapi.rio.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openrdf.model.BNode;
import org.openrdf.model.Literal;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.semanticweb.owlapi.io.RDFLiteral;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFResourceIRI;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.rio.utils.RioUtils;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 */
@SuppressWarnings({ "javadoc", "null" })
public class RioUtilsTest {static class __CLR4_5_2brtbrtlvico2et{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ValueFactory VF = ValueFactoryImpl.getInstance();
    private RDFTriple testOwlApiTripleAllIRI;
    private RDFTriple testOwlApiTriplePlainLiteral;
    private RDFTriple testOwlApiTripleLangLiteral;
    private RDFTriple testOwlApiTripleTypedLiteral;
    private RDFTriple testOwlApiTripleSubjectBNode;
    private RDFTriple testOwlApiTripleObjectBNode;
    private RDFTriple testOwlApiTripleSubjectObjectBNode;
    private Statement testSesameTripleAllIRI;
    private Statement testSesameTriplePlainLiteral;
    private Statement testSesameTripleLangLiteral;
    private Statement testSesameTripleTypedLiteral;
    private Statement testSesameTripleSubjectBNode;
    private Statement testSesameTripleObjectBNode;
    private Statement testSesameTripleSubjectObjectBNode;

    @Before
    public void setUp() {try{__CLR4_5_2brtbrtlvico2et.R.inc(15257);
        __CLR4_5_2brtbrtlvico2et.R.inc(15258);RDFResourceIRI testOwlApiSubjectUri1 = new RDFResourceIRI(
            IRI.create("urn:test:subject:uri:1"));
        __CLR4_5_2brtbrtlvico2et.R.inc(15259);RDFResourceIRI testOwlApiPredicateUri1 = new RDFResourceIRI(
            IRI.create("urn:test:predicate:uri:1"));
        __CLR4_5_2brtbrtlvico2et.R.inc(15260);RDFResourceIRI testOwlApiObjectUri1 = new RDFResourceIRI(
            IRI.create("urn:test:object:uri:1"));
        __CLR4_5_2brtbrtlvico2et.R.inc(15261);RDFLiteral testOwlApiObjectPlainLiteral1 = new RDFLiteral(
            "Test literal", "", null);
        __CLR4_5_2brtbrtlvico2et.R.inc(15262);RDFLiteral testOwlApiObjectLangLiteral1 = new RDFLiteral(
            "Test literal", "en", null);
        __CLR4_5_2brtbrtlvico2et.R.inc(15263);RDFLiteral testOwlApiObjectTypedLiteral1 = new RDFLiteral(
            "Test literal", null, IRI.create("urn:test:datatype:1"));
        __CLR4_5_2brtbrtlvico2et.R.inc(15264);RDFResourceBlankNode testOwlApiSubjectBNode1 = new RDFResourceBlankNode(
            IRI.create("subjectBnode1"), true, true);
        __CLR4_5_2brtbrtlvico2et.R.inc(15265);RDFResourceBlankNode testOwlApiObjectBNode1 = new RDFResourceBlankNode(
            IRI.create("objectBnode1"), true, true);
        __CLR4_5_2brtbrtlvico2et.R.inc(15266);testOwlApiTripleAllIRI = new RDFTriple(testOwlApiSubjectUri1,
            testOwlApiPredicateUri1, testOwlApiObjectUri1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15267);testOwlApiTriplePlainLiteral = new RDFTriple(testOwlApiSubjectUri1,
            testOwlApiPredicateUri1, testOwlApiObjectPlainLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15268);testOwlApiTripleLangLiteral = new RDFTriple(testOwlApiSubjectUri1,
            testOwlApiPredicateUri1, testOwlApiObjectLangLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15269);testOwlApiTripleTypedLiteral = new RDFTriple(testOwlApiSubjectUri1,
            testOwlApiPredicateUri1, testOwlApiObjectTypedLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15270);testOwlApiTripleSubjectBNode = new RDFTriple(testOwlApiSubjectBNode1,
            testOwlApiPredicateUri1, testOwlApiObjectUri1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15271);testOwlApiTripleObjectBNode = new RDFTriple(testOwlApiSubjectUri1,
            testOwlApiPredicateUri1, testOwlApiObjectBNode1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15272);testOwlApiTripleSubjectObjectBNode = new RDFTriple(
            testOwlApiSubjectBNode1, testOwlApiPredicateUri1,
            testOwlApiObjectBNode1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15273);URI testSesameSubjectUri1 = VF.createURI("urn:test:subject:uri:1");
        __CLR4_5_2brtbrtlvico2et.R.inc(15274);URI testSesamePredicateUri1 = VF.createURI("urn:test:predicate:uri:1");
        __CLR4_5_2brtbrtlvico2et.R.inc(15275);URI testSesameObjectUri1 = VF.createURI("urn:test:object:uri:1");
        __CLR4_5_2brtbrtlvico2et.R.inc(15276);Literal testSesameObjectPlainLiteral1 = VF
            .createLiteral("Test literal");
        __CLR4_5_2brtbrtlvico2et.R.inc(15277);Literal testSesameObjectLangLiteral1 = VF.createLiteral("Test literal",
            "en");
        __CLR4_5_2brtbrtlvico2et.R.inc(15278);Literal testSesameObjectTypedLiteral1 = VF.createLiteral(
            "Test literal", VF.createURI("urn:test:datatype:1"));
        __CLR4_5_2brtbrtlvico2et.R.inc(15279);BNode testSesameSubjectBNode1 = VF.createBNode("subjectBnode1");
        __CLR4_5_2brtbrtlvico2et.R.inc(15280);BNode testSesameObjectBNode1 = VF.createBNode("objectBnode1");
        __CLR4_5_2brtbrtlvico2et.R.inc(15281);testSesameTripleAllIRI = VF.createStatement(testSesameSubjectUri1,
            testSesamePredicateUri1, testSesameObjectUri1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15282);testSesameTriplePlainLiteral = VF.createStatement(
            testSesameSubjectUri1, testSesamePredicateUri1,
            testSesameObjectPlainLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15283);testSesameTripleLangLiteral = VF.createStatement(testSesameSubjectUri1,
            testSesamePredicateUri1, testSesameObjectLangLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15284);testSesameTripleTypedLiteral = VF.createStatement(
            testSesameSubjectUri1, testSesamePredicateUri1,
            testSesameObjectTypedLiteral1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15285);testSesameTripleSubjectBNode = VF.createStatement(
            testSesameSubjectBNode1, testSesamePredicateUri1,
            testSesameObjectUri1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15286);testSesameTripleObjectBNode = VF.createStatement(testSesameSubjectUri1,
            testSesamePredicateUri1, testSesameObjectBNode1);
        __CLR4_5_2brtbrtlvico2et.R.inc(15287);testSesameTripleSubjectObjectBNode = VF.createStatement(
            testSesameSubjectBNode1, testSesamePredicateUri1,
            testSesameObjectBNode1);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.utils.RioUtils#tripleAsStatement(org.semanticweb.owlapi.io.RDFTriple)}
     */
    @Test
    public void testTripleAllIRI() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2otgve2bso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleAllIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2otgve2bso(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15288);
        __CLR4_5_2brtbrtlvico2et.R.inc(15289);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleAllIRI);
        __CLR4_5_2brtbrtlvico2et.R.inc(15290);assertEquals(testSesameTripleAllIRI, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    @Test
    public void testTripleBNodeComparisonObject() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nijsf1bsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleBNodeComparisonObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nijsf1bsr(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15291);
        __CLR4_5_2brtbrtlvico2et.R.inc(15292);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleObjectBNode);
        __CLR4_5_2brtbrtlvico2et.R.inc(15293);assertEquals(testSesameTripleObjectBNode, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    @Test
    public void testTripleBNodeComparisonSubject() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx3yzabsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleBNodeComparisonSubject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx3yzabsu(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15294);
        __CLR4_5_2brtbrtlvico2et.R.inc(15295);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleSubjectBNode);
        __CLR4_5_2brtbrtlvico2et.R.inc(15296);assertEquals(testSesameTripleSubjectBNode, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    @Test
    public void testTripleBNodeComparisonSubjectAndObject() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfl9ribsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleBNodeComparisonSubjectAndObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfl9ribsx(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15297);
        __CLR4_5_2brtbrtlvico2et.R.inc(15298);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleSubjectObjectBNode);
        __CLR4_5_2brtbrtlvico2et.R.inc(15299);assertEquals(testSesameTripleSubjectObjectBNode, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.utils.RioUtils#tripleAsStatement(org.semanticweb.owlapi.io.RDFTriple)}
     */
    @Test
    public void testTripleLangLiteral() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ppnl48bt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleLangLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ppnl48bt0(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15300);
        __CLR4_5_2brtbrtlvico2et.R.inc(15301);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleLangLiteral);
        __CLR4_5_2brtbrtlvico2et.R.inc(15302);assertEquals(testSesameTripleLangLiteral, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.utils.RioUtils#tripleAsStatement(org.semanticweb.owlapi.io.RDFTriple)}
     */
    @Test
    public void testTriplePlainLiteral() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibtplobt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTriplePlainLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibtplobt3(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15303);
        __CLR4_5_2brtbrtlvico2et.R.inc(15304);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTriplePlainLiteral);
        __CLR4_5_2brtbrtlvico2et.R.inc(15305);assertEquals(testSesameTriplePlainLiteral, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}

    /*
     * Test method for
     * {@link org.semanticweb.owlapi.rio.utils.RioUtils#tripleAsStatement(org.semanticweb.owlapi.io.RDFTriple)}
     */
    @Test
    public void testTripleTypedLiteral() {__CLR4_5_2brtbrtlvico2et.R.globalSliceStart(getClass().getName(),15306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xeg118bt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2brtbrtlvico2et.R.rethrow($CLV_t2$);}finally{__CLR4_5_2brtbrtlvico2et.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rio.utils.test.RioUtilsTest.testTripleTypedLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xeg118bt6(){try{__CLR4_5_2brtbrtlvico2et.R.inc(15306);
        __CLR4_5_2brtbrtlvico2et.R.inc(15307);Statement tripleAsStatement = RioUtils
            .tripleAsStatement(testOwlApiTripleTypedLiteral);
        __CLR4_5_2brtbrtlvico2et.R.inc(15308);assertEquals(testSesameTripleTypedLiteral, tripleAsStatement);
    }finally{__CLR4_5_2brtbrtlvico2et.R.flushNeeded();}}
}
