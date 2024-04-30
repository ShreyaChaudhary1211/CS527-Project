/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import javax.annotation.Nonnull;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.model.IRI;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.5
 */
@SuppressWarnings("javadoc")
public class OWLOntologyIRIShortFormProviderTestCase {static class __CLR4_5_2claclalvicku64{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237216579L,8589935092L,16364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    public static final String SCHEME_DOMAIN = "http://www.semanticweb.org";
    private OntologyIRIShortFormProvider sfp;

    @Before
    public void setUp() {try{__CLR4_5_2claclalvicku64.R.inc(16318);
        __CLR4_5_2claclalvicku64.R.inc(16319);sfp = new OntologyIRIShortFormProvider();
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldFindLastPathElement() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z7is2kclc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldFindLastPathElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z7is2kclc(){try{__CLR4_5_2claclalvicku64.R.inc(16320);
        __CLR4_5_2claclalvicku64.R.inc(16321);String input = SCHEME_DOMAIN + "/ontologies/ont";
        __CLR4_5_2claclalvicku64.R.inc(16322);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16323);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    /*
     * A test to see if a meaningful short form is returned when the ontology
     * IRI encodes version information at the end. For example, the dublin core
     * IRIs do this.
     */
    @Test
    public void shouldReturnLastNonNumericPathElement() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23srwxxclg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnLastNonNumericPathElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23srwxxclg(){try{__CLR4_5_2claclalvicku64.R.inc(16324);
        __CLR4_5_2claclalvicku64.R.inc(16325);String input = SCHEME_DOMAIN + "/ontologies/ont/1.1.11";
        __CLR4_5_2claclalvicku64.R.inc(16326);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16327);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldReturnLastNonVersionPathElement() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_252a9xiclk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnLastNonVersionPathElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_252a9xiclk(){try{__CLR4_5_2claclalvicku64.R.inc(16328);
        __CLR4_5_2claclalvicku64.R.inc(16329);String input = SCHEME_DOMAIN + "/ontologies/ont/v1.1.11";
        __CLR4_5_2claclalvicku64.R.inc(16330);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16331);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldReturnFullIRIForNoPath() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dz2108clo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnFullIRIForNoPath",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dz2108clo(){try{__CLR4_5_2claclalvicku64.R.inc(16332);
        __CLR4_5_2claclalvicku64.R.inc(16333);String input = SCHEME_DOMAIN;
        __CLR4_5_2claclalvicku64.R.inc(16334);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16335);assertThat(shortForm, is(equalTo(SCHEME_DOMAIN)));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldStripAwayOWLExtension() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi4vm3cls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldStripAwayOWLExtension",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi4vm3cls(){try{__CLR4_5_2claclalvicku64.R.inc(16336);
        __CLR4_5_2claclalvicku64.R.inc(16337);String input = SCHEME_DOMAIN + "/ontologies/ont.owl";
        __CLR4_5_2claclalvicku64.R.inc(16338);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16339);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldStripAwayRDFExtension() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5mcxnclw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldStripAwayRDFExtension",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5mcxnclw(){try{__CLR4_5_2claclalvicku64.R.inc(16340);
        __CLR4_5_2claclalvicku64.R.inc(16341);String input = SCHEME_DOMAIN + "/ontologies/ont.rdf";
        __CLR4_5_2claclalvicku64.R.inc(16342);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16343);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldStripAwayXMLExtension() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ihk5r6cm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldStripAwayXMLExtension",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ihk5r6cm0(){try{__CLR4_5_2claclalvicku64.R.inc(16344);
        __CLR4_5_2claclalvicku64.R.inc(16345);String input = SCHEME_DOMAIN + "/ontologies/ont.xml";
        __CLR4_5_2claclalvicku64.R.inc(16346);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16347);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldStripAwayOBOExtension() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgy5q5cm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldStripAwayOBOExtension",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgy5q5cm4(){try{__CLR4_5_2claclalvicku64.R.inc(16348);
        __CLR4_5_2claclalvicku64.R.inc(16349);String input = SCHEME_DOMAIN + "/ontologies/ont.obo";
        __CLR4_5_2claclalvicku64.R.inc(16350);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16351);assertThat(shortForm, is(equalTo("ont")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldReturnSkosForSKOSNamespace() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25pgssccm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnSkosForSKOSNamespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25pgssccm8(){try{__CLR4_5_2claclalvicku64.R.inc(16352);
        __CLR4_5_2claclalvicku64.R.inc(16353);String input = "http://www.w3.org/2004/02/skos/core";
        __CLR4_5_2claclalvicku64.R.inc(16354);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16355);assertThat(shortForm, is(CoreMatchers.equalTo("skos")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldReturnDcForDublinCoreNamespace() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wcj878cmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnDcForDublinCoreNamespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wcj878cmc(){try{__CLR4_5_2claclalvicku64.R.inc(16356);
        __CLR4_5_2claclalvicku64.R.inc(16357);String input = "http://purl.org/dc/elements/1.1";
        __CLR4_5_2claclalvicku64.R.inc(16358);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16359);assertThat(shortForm, is(CoreMatchers.equalTo("dc")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}

    @Test
    public void shouldReturnDcForDublinCoreNamespaceEndingWithSlash() {__CLR4_5_2claclalvicku64.R.globalSliceStart(getClass().getName(),16360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fa6jnicmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2claclalvicku64.R.rethrow($CLV_t2$);}finally{__CLR4_5_2claclalvicku64.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyIRIShortFormProviderTestCase.shouldReturnDcForDublinCoreNamespaceEndingWithSlash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fa6jnicmg(){try{__CLR4_5_2claclalvicku64.R.inc(16360);
        __CLR4_5_2claclalvicku64.R.inc(16361);String input = "http://purl.org/dc/elements/1.1/";
        __CLR4_5_2claclalvicku64.R.inc(16362);String shortForm = sfp.getShortForm(IRI.create(input));
        __CLR4_5_2claclalvicku64.R.inc(16363);assertThat(shortForm, is(CoreMatchers.equalTo("dc")));
    }finally{__CLR4_5_2claclalvicku64.R.flushNeeded();}}
}
