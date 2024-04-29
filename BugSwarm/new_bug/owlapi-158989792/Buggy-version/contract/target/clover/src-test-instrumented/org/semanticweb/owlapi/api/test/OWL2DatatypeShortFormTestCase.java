/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.semanticweb.owlapi.vocab.OWL2Datatype.*;

import org.junit.Test;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group, Date: 04/04/2014
 */
@SuppressWarnings("javadoc")
public class OWL2DatatypeShortFormTestCase {static class __CLR4_5_225f25flvicnzqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldReturnCorrectShortFormForXMLLiteral() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3izu925f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForXMLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3izu925f(){try{__CLR4_5_225f25flvicnzqp.R.inc(2787);
        __CLR4_5_225f25flvicnzqp.R.inc(2788);String shortForm = RDF_XML_LITERAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2789);assertThat(shortForm, is(equalTo("XMLLiteral")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForLiteral() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqidju25i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqidju25i(){try{__CLR4_5_225f25flvicnzqp.R.inc(2790);
        __CLR4_5_225f25flvicnzqp.R.inc(2791);String shortForm = RDFS_LITERAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2792);assertThat(shortForm, is(equalTo("Literal")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForPlainLiteral() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o49f3825l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForPlainLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o49f3825l(){try{__CLR4_5_225f25flvicnzqp.R.inc(2793);
        __CLR4_5_225f25flvicnzqp.R.inc(2794);String shortForm = RDF_PLAIN_LITERAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2795);assertThat(shortForm, is(equalTo("PlainLiteral")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForreal() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_251b0ol25o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForreal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_251b0ol25o(){try{__CLR4_5_225f25flvicnzqp.R.inc(2796);
        __CLR4_5_225f25flvicnzqp.R.inc(2797);String shortForm = OWL_REAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2798);assertThat(shortForm, is(equalTo("real")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForrational() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28efqo525r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForrational",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28efqo525r(){try{__CLR4_5_225f25flvicnzqp.R.inc(2799);
        __CLR4_5_225f25flvicnzqp.R.inc(2800);String shortForm = OWL_RATIONAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2801);assertThat(shortForm, is(equalTo("rational")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForstring() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rro0xk25u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForstring",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rro0xk25u(){try{__CLR4_5_225f25flvicnzqp.R.inc(2802);
        __CLR4_5_225f25flvicnzqp.R.inc(2803);String shortForm = XSD_STRING.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2804);assertThat(shortForm, is(equalTo("string")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFornormalizedString() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1hp3325x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFornormalizedString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1hp3325x(){try{__CLR4_5_225f25flvicnzqp.R.inc(2805);
        __CLR4_5_225f25flvicnzqp.R.inc(2806);String shortForm = XSD_NORMALIZED_STRING.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2807);assertThat(shortForm, is(equalTo("normalizedString")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFortoken() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2goum1c260();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFortoken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2goum1c260(){try{__CLR4_5_225f25flvicnzqp.R.inc(2808);
        __CLR4_5_225f25flvicnzqp.R.inc(2809);String shortForm = XSD_TOKEN.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2810);assertThat(shortForm, is(equalTo("token")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForlanguage() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_298aqtt263();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForlanguage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_298aqtt263(){try{__CLR4_5_225f25flvicnzqp.R.inc(2811);
        __CLR4_5_225f25flvicnzqp.R.inc(2812);String shortForm = XSD_LANGUAGE.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2813);assertThat(shortForm, is(equalTo("language")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForName() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2up5jmq266();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2up5jmq266(){try{__CLR4_5_225f25flvicnzqp.R.inc(2814);
        __CLR4_5_225f25flvicnzqp.R.inc(2815);String shortForm = XSD_NAME.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2816);assertThat(shortForm, is(equalTo("Name")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForNCName() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272zsxj269();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForNCName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272zsxj269(){try{__CLR4_5_225f25flvicnzqp.R.inc(2817);
        __CLR4_5_225f25flvicnzqp.R.inc(2818);String shortForm = XSD_NCNAME.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2819);assertThat(shortForm, is(equalTo("NCName")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForNMTOKEN() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u6wnf326c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForNMTOKEN",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u6wnf326c(){try{__CLR4_5_225f25flvicnzqp.R.inc(2820);
        __CLR4_5_225f25flvicnzqp.R.inc(2821);String shortForm = XSD_NMTOKEN.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2822);assertThat(shortForm, is(equalTo("NMTOKEN")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFordecimal() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qikdwo26f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFordecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qikdwo26f(){try{__CLR4_5_225f25flvicnzqp.R.inc(2823);
        __CLR4_5_225f25flvicnzqp.R.inc(2824);String shortForm = XSD_DECIMAL.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2825);assertThat(shortForm, is(equalTo("decimal")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForinteger() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nt4v2j26i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForinteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nt4v2j26i(){try{__CLR4_5_225f25flvicnzqp.R.inc(2826);
        __CLR4_5_225f25flvicnzqp.R.inc(2827);String shortForm = XSD_INTEGER.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2828);assertThat(shortForm, is(equalTo("integer")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFornonNegativeInteger() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h0cnmb26l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFornonNegativeInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h0cnmb26l(){try{__CLR4_5_225f25flvicnzqp.R.inc(2829);
        __CLR4_5_225f25flvicnzqp.R.inc(2830);String shortForm = XSD_NON_NEGATIVE_INTEGER.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2831);assertThat(shortForm, is(equalTo("nonNegativeInteger")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFornonPositiveInteger() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7zsq926o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFornonPositiveInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7zsq926o(){try{__CLR4_5_225f25flvicnzqp.R.inc(2832);
        __CLR4_5_225f25flvicnzqp.R.inc(2833);String shortForm = XSD_NON_POSITIVE_INTEGER.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2834);assertThat(shortForm, is(equalTo("nonPositiveInteger")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForpositiveInteger() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2up18yk26r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForpositiveInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2up18yk26r(){try{__CLR4_5_225f25flvicnzqp.R.inc(2835);
        __CLR4_5_225f25flvicnzqp.R.inc(2836);String shortForm = XSD_POSITIVE_INTEGER.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2837);assertThat(shortForm, is(equalTo("positiveInteger")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFornegativeInteger() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qco026u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFornegativeInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qco026u(){try{__CLR4_5_225f25flvicnzqp.R.inc(2838);
        __CLR4_5_225f25flvicnzqp.R.inc(2839);String shortForm = XSD_NEGATIVE_INTEGER.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2840);assertThat(shortForm, is(equalTo("negativeInteger")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForlong() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhq3zh26x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForlong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhq3zh26x(){try{__CLR4_5_225f25flvicnzqp.R.inc(2841);
        __CLR4_5_225f25flvicnzqp.R.inc(2842);String shortForm = XSD_LONG.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2843);assertThat(shortForm, is(equalTo("long")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForint() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a02pm270();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForint",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a02pm270(){try{__CLR4_5_225f25flvicnzqp.R.inc(2844);
        __CLR4_5_225f25flvicnzqp.R.inc(2845);String shortForm = XSD_INT.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2846);assertThat(shortForm, is(equalTo("int")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForshort() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gi8qib273();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForshort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gi8qib273(){try{__CLR4_5_225f25flvicnzqp.R.inc(2847);
        __CLR4_5_225f25flvicnzqp.R.inc(2848);String shortForm = XSD_SHORT.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2849);assertThat(shortForm, is(equalTo("short")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForbyte() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exyzj276();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForbyte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exyzj276(){try{__CLR4_5_225f25flvicnzqp.R.inc(2850);
        __CLR4_5_225f25flvicnzqp.R.inc(2851);String shortForm = XSD_BYTE.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2852);assertThat(shortForm, is(equalTo("byte")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForunsignedLong() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24zye2g279();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForunsignedLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24zye2g279(){try{__CLR4_5_225f25flvicnzqp.R.inc(2853);
        __CLR4_5_225f25flvicnzqp.R.inc(2854);String shortForm = XSD_UNSIGNED_LONG.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2855);assertThat(shortForm, is(equalTo("unsignedLong")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForunsignedInt() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2md9s2727c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForunsignedInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2md9s2727c(){try{__CLR4_5_225f25flvicnzqp.R.inc(2856);
        __CLR4_5_225f25flvicnzqp.R.inc(2857);String shortForm = XSD_UNSIGNED_INT.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2858);assertThat(shortForm, is(equalTo("unsignedInt")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForunsignedShort() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgvg7y27f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForunsignedShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgvg7y27f(){try{__CLR4_5_225f25flvicnzqp.R.inc(2859);
        __CLR4_5_225f25flvicnzqp.R.inc(2860);String shortForm = XSD_UNSIGNED_SHORT.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2861);assertThat(shortForm, is(equalTo("unsignedShort")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForunsignedByte() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwpowk27i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForunsignedByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwpowk27i(){try{__CLR4_5_225f25flvicnzqp.R.inc(2862);
        __CLR4_5_225f25flvicnzqp.R.inc(2863);String shortForm = XSD_UNSIGNED_BYTE.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2864);assertThat(shortForm, is(equalTo("unsignedByte")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFordouble() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g5fl6g27l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFordouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g5fl6g27l(){try{__CLR4_5_225f25flvicnzqp.R.inc(2865);
        __CLR4_5_225f25flvicnzqp.R.inc(2866);String shortForm = XSD_DOUBLE.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2867);assertThat(shortForm, is(equalTo("double")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForfloat() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qnzzh27o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForfloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qnzzh27o(){try{__CLR4_5_225f25flvicnzqp.R.inc(2868);
        __CLR4_5_225f25flvicnzqp.R.inc(2869);String shortForm = XSD_FLOAT.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2870);assertThat(shortForm, is(equalTo("float")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForboolean() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u6zd7l27r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForboolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u6zd7l27r(){try{__CLR4_5_225f25flvicnzqp.R.inc(2871);
        __CLR4_5_225f25flvicnzqp.R.inc(2872);String shortForm = XSD_BOOLEAN.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2873);assertThat(shortForm, is(equalTo("boolean")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForhexBinary() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ss40d27u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForhexBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ss40d27u(){try{__CLR4_5_225f25flvicnzqp.R.inc(2874);
        __CLR4_5_225f25flvicnzqp.R.inc(2875);String shortForm = XSD_HEX_BINARY.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2876);assertThat(shortForm, is(equalTo("hexBinary")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForbase64Binary() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfcivb27x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForbase64Binary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfcivb27x(){try{__CLR4_5_225f25flvicnzqp.R.inc(2877);
        __CLR4_5_225f25flvicnzqp.R.inc(2878);String shortForm = XSD_BASE_64_BINARY.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2879);assertThat(shortForm, is(equalTo("base64Binary")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormForanyURI() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f40c3b280();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormForanyURI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f40c3b280(){try{__CLR4_5_225f25flvicnzqp.R.inc(2880);
        __CLR4_5_225f25flvicnzqp.R.inc(2881);String shortForm = XSD_ANY_URI.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2882);assertThat(shortForm, is(equalTo("anyURI")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFordateTime() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lwple283();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFordateTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lwple283(){try{__CLR4_5_225f25flvicnzqp.R.inc(2883);
        __CLR4_5_225f25flvicnzqp.R.inc(2884);String shortForm = XSD_DATE_TIME.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2885);assertThat(shortForm, is(equalTo("dateTime")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectShortFormFordateTimeStamp() {__CLR4_5_225f25flvicnzqp.R.globalSliceStart(getClass().getName(),2886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2241zoh286();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_225f25flvicnzqp.R.rethrow($CLV_t2$);}finally{__CLR4_5_225f25flvicnzqp.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypeShortFormTestCase.shouldReturnCorrectShortFormFordateTimeStamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2241zoh286(){try{__CLR4_5_225f25flvicnzqp.R.inc(2886);
        __CLR4_5_225f25flvicnzqp.R.inc(2887);String shortForm = XSD_DATE_TIME_STAMP.getShortForm();
        __CLR4_5_225f25flvicnzqp.R.inc(2888);assertThat(shortForm, is(equalTo("dateTimeStamp")));
    }finally{__CLR4_5_225f25flvicnzqp.R.flushNeeded();}}
}
