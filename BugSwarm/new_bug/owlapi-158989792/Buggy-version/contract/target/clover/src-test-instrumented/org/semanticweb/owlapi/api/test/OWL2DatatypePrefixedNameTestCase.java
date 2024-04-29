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
public class OWL2DatatypePrefixedNameTestCase {static class __CLR4_5_222l22llvicnzqg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldReturnCorrectPrefixNameForXMLLiteral() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oyqft022l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForXMLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oyqft022l(){try{__CLR4_5_222l22llvicnzqg.R.inc(2685);
        __CLR4_5_222l22llvicnzqg.R.inc(2686);String prefixedName = RDF_XML_LITERAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2687);assertThat(prefixedName, is(equalTo("rdf:XMLLiteral")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForLiteral() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xk3k3322o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xk3k3322o(){try{__CLR4_5_222l22llvicnzqg.R.inc(2688);
        __CLR4_5_222l22llvicnzqg.R.inc(2689);String prefixedName = RDFS_LITERAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2690);assertThat(prefixedName, is(equalTo("rdfs:Literal")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForPlainLiteral() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2au7n9t22r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForPlainLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2au7n9t22r(){try{__CLR4_5_222l22llvicnzqg.R.inc(2691);
        __CLR4_5_222l22llvicnzqg.R.inc(2692);String prefixedName = RDF_PLAIN_LITERAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2693);assertThat(prefixedName, is(equalTo("rdf:PlainLiteral")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForreal() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23d1a3u22u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForreal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23d1a3u22u(){try{__CLR4_5_222l22llvicnzqg.R.inc(2694);
        __CLR4_5_222l22llvicnzqg.R.inc(2695);String prefixedName = OWL_REAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2696);assertThat(prefixedName, is(equalTo("owl:real")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForrational() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22x8m1222x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForrational",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22x8m1222x(){try{__CLR4_5_222l22llvicnzqg.R.inc(2697);
        __CLR4_5_222l22llvicnzqg.R.inc(2698);String prefixedName = OWL_RATIONAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2699);assertThat(prefixedName, is(equalTo("owl:rational")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForstring() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22y17er230();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForstring",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22y17er230(){try{__CLR4_5_222l22llvicnzqg.R.inc(2700);
        __CLR4_5_222l22llvicnzqg.R.inc(2701);String prefixedName = XSD_STRING.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2702);assertThat(prefixedName, is(equalTo("xsd:string")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFornormalizedString() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27w27sk233();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFornormalizedString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27w27sk233(){try{__CLR4_5_222l22llvicnzqg.R.inc(2703);
        __CLR4_5_222l22llvicnzqg.R.inc(2704);String prefixedName = XSD_NORMALIZED_STRING.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2705);assertThat(prefixedName, is(equalTo("xsd:normalizedString")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFortoken() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z7j9tx236();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFortoken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z7j9tx236(){try{__CLR4_5_222l22llvicnzqg.R.inc(2706);
        __CLR4_5_222l22llvicnzqg.R.inc(2707);String prefixedName = XSD_TOKEN.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2708);assertThat(prefixedName, is(equalTo("xsd:token")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForlanguage() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kjz3j0239();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForlanguage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kjz3j0239(){try{__CLR4_5_222l22llvicnzqg.R.inc(2709);
        __CLR4_5_222l22llvicnzqg.R.inc(2710);String prefixedName = XSD_LANGUAGE.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2711);assertThat(prefixedName, is(equalTo("xsd:language")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForName() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t0vt1z23c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t0vt1z23c(){try{__CLR4_5_222l22llvicnzqg.R.inc(2712);
        __CLR4_5_222l22llvicnzqg.R.inc(2713);String prefixedName = XSD_NAME.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2714);assertThat(prefixedName, is(equalTo("xsd:Name")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForNCName() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vwmmgc23f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForNCName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vwmmgc23f(){try{__CLR4_5_222l22llvicnzqg.R.inc(2715);
        __CLR4_5_222l22llvicnzqg.R.inc(2716);String prefixedName = XSD_NCNAME.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2717);assertThat(prefixedName, is(equalTo("xsd:NCName")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForNMTOKEN() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t0m80s23i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForNMTOKEN",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t0m80s23i(){try{__CLR4_5_222l22llvicnzqg.R.inc(2718);
        __CLR4_5_222l22llvicnzqg.R.inc(2719);String prefixedName = XSD_NMTOKEN.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2720);assertThat(prefixedName, is(equalTo("xsd:NMTOKEN")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFordecimal() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eoz7df23l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFordecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eoz7df23l(){try{__CLR4_5_222l22llvicnzqg.R.inc(2721);
        __CLR4_5_222l22llvicnzqg.R.inc(2722);String prefixedName = XSD_DECIMAL.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2723);assertThat(prefixedName, is(equalTo("xsd:decimal")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForinteger() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zee0dc23o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForinteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zee0dc23o(){try{__CLR4_5_222l22llvicnzqg.R.inc(2724);
        __CLR4_5_222l22llvicnzqg.R.inc(2725);String prefixedName = XSD_INTEGER.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2726);assertThat(prefixedName, is(equalTo("xsd:integer")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFornonNegativeInteger() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzzgug23r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFornonNegativeInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzzgug23r(){try{__CLR4_5_222l22llvicnzqg.R.inc(2727);
        __CLR4_5_222l22llvicnzqg.R.inc(2728);String prefixedName = XSD_NON_NEGATIVE_INTEGER.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2729);assertThat(prefixedName, is(equalTo("xsd:nonNegativeInteger")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFornonPositiveInteger() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_298czi423u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFornonPositiveInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_298czi423u(){try{__CLR4_5_222l22llvicnzqg.R.inc(2730);
        __CLR4_5_222l22llvicnzqg.R.inc(2731);String prefixedName = XSD_NON_POSITIVE_INTEGER.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2732);assertThat(prefixedName, is(equalTo("xsd:nonPositiveInteger")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForpositiveInteger() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2285q6123x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForpositiveInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2285q6123x(){try{__CLR4_5_222l22llvicnzqg.R.inc(2733);
        __CLR4_5_222l22llvicnzqg.R.inc(2734);String prefixedName = XSD_POSITIVE_INTEGER.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2735);assertThat(prefixedName, is(equalTo("xsd:positiveInteger")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFornegativeInteger() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0xbsl240();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFornegativeInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0xbsl240(){try{__CLR4_5_222l22llvicnzqg.R.inc(2736);
        __CLR4_5_222l22llvicnzqg.R.inc(2737);String prefixedName = XSD_NEGATIVE_INTEGER.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2738);assertThat(prefixedName, is(equalTo("xsd:negativeInteger")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForlong() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5zuk8243();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForlong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5zuk8243(){try{__CLR4_5_222l22llvicnzqg.R.inc(2739);
        __CLR4_5_222l22llvicnzqg.R.inc(2740);String prefixedName = XSD_LONG.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2741);assertThat(prefixedName, is(equalTo("xsd:long")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForint() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzyc1d246();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForint",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzyc1d246(){try{__CLR4_5_222l22llvicnzqg.R.inc(2742);
        __CLR4_5_222l22llvicnzqg.R.inc(2743);String prefixedName = XSD_INT.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2744);assertThat(prefixedName, is(equalTo("xsd:int")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForshort() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ze55cy249();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForshort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ze55cy249(){try{__CLR4_5_222l22llvicnzqg.R.inc(2745);
        __CLR4_5_222l22llvicnzqg.R.inc(2746);String prefixedName = XSD_SHORT.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2747);assertThat(prefixedName, is(equalTo("xsd:short")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForbyte() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_219brl824c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForbyte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_219brl824c(){try{__CLR4_5_222l22llvicnzqg.R.inc(2748);
        __CLR4_5_222l22llvicnzqg.R.inc(2749);String prefixedName = XSD_BYTE.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2750);assertThat(prefixedName, is(equalTo("xsd:byte")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForunsignedLong() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tyioal24f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForunsignedLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tyioal24f(){try{__CLR4_5_222l22llvicnzqg.R.inc(2751);
        __CLR4_5_222l22llvicnzqg.R.inc(2752);String prefixedName = XSD_UNSIGNED_LONG.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2753);assertThat(prefixedName, is(equalTo("xsd:unsignedLong")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForunsignedInt() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2au5djw24i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForunsignedInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2au5djw24i(){try{__CLR4_5_222l22llvicnzqg.R.inc(2754);
        __CLR4_5_222l22llvicnzqg.R.inc(2755);String prefixedName = XSD_UNSIGNED_INT.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2756);assertThat(prefixedName, is(equalTo("xsd:unsignedInt")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForunsignedShort() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rc8e5z24l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForunsignedShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rc8e5z24l(){try{__CLR4_5_222l22llvicnzqg.R.inc(2757);
        __CLR4_5_222l22llvicnzqg.R.inc(2758);String prefixedName = XSD_UNSIGNED_SHORT.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2759);assertThat(prefixedName, is(equalTo("xsd:unsignedShort")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForunsignedByte() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5xapj24o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForunsignedByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5xapj24o(){try{__CLR4_5_222l22llvicnzqg.R.inc(2760);
        __CLR4_5_222l22llvicnzqg.R.inc(2761);String prefixedName = XSD_UNSIGNED_BYTE.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2762);assertThat(prefixedName, is(equalTo("xsd:unsignedByte")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFordouble() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o78cd24r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFordouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o78cd24r(){try{__CLR4_5_222l22llvicnzqg.R.inc(2763);
        __CLR4_5_222l22llvicnzqg.R.inc(2764);String prefixedName = XSD_DOUBLE.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2765);assertThat(prefixedName, is(equalTo("xsd:double")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForfloat() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29e264e24u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForfloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29e264e24u(){try{__CLR4_5_222l22llvicnzqg.R.inc(2766);
        __CLR4_5_222l22llvicnzqg.R.inc(2767);String prefixedName = XSD_FLOAT.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2768);assertThat(prefixedName, is(equalTo("xsd:float")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForboolean() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t0ji8a24x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForboolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t0ji8a24x(){try{__CLR4_5_222l22llvicnzqg.R.inc(2769);
        __CLR4_5_222l22llvicnzqg.R.inc(2770);String prefixedName = XSD_BOOLEAN.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2771);assertThat(prefixedName, is(equalTo("xsd:boolean")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForhexBinary() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22p6rtu250();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForhexBinary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22p6rtu250(){try{__CLR4_5_222l22llvicnzqg.R.inc(2772);
        __CLR4_5_222l22llvicnzqg.R.inc(2773);String prefixedName = XSD_HEX_BINARY.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2774);assertThat(prefixedName, is(equalTo("xsd:hexBinary")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForbase64Binary() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anagqs253();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForbase64Binary",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anagqs253(){try{__CLR4_5_222l22llvicnzqg.R.inc(2775);
        __CLR4_5_222l22llvicnzqg.R.inc(2776);String prefixedName = XSD_BASE_64_BINARY.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2777);assertThat(prefixedName, is(equalTo("xsd:base64Binary")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameForanyURI() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3gwd0256();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameForanyURI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3gwd0256(){try{__CLR4_5_222l22llvicnzqg.R.inc(2778);
        __CLR4_5_222l22llvicnzqg.R.inc(2779);String prefixedName = XSD_ANY_URI.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2780);assertThat(prefixedName, is(equalTo("xsd:anyURI")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFordateTime() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26prn3t259();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFordateTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26prn3t259(){try{__CLR4_5_222l22llvicnzqg.R.inc(2781);
        __CLR4_5_222l22llvicnzqg.R.inc(2782);String prefixedName = XSD_DATE_TIME.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2783);assertThat(prefixedName, is(equalTo("xsd:dateTime")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}

    @Test
    public void shouldReturnCorrectPrefixNameFordateTimeStamp() {__CLR4_5_222l22llvicnzqg.R.globalSliceStart(getClass().getName(),2784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g3y7wq25c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222l22llvicnzqg.R.rethrow($CLV_t2$);}finally{__CLR4_5_222l22llvicnzqg.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWL2DatatypePrefixedNameTestCase.shouldReturnCorrectPrefixNameFordateTimeStamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g3y7wq25c(){try{__CLR4_5_222l22llvicnzqg.R.inc(2784);
        __CLR4_5_222l22llvicnzqg.R.inc(2785);String prefixedName = XSD_DATE_TIME_STAMP.getPrefixedName();
        __CLR4_5_222l22llvicnzqg.R.inc(2786);assertThat(prefixedName, is(equalTo("xsd:dateTimeStamp")));
    }finally{__CLR4_5_222l22llvicnzqg.R.flushNeeded();}}
}
