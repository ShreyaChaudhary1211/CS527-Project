/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings("javadoc")
public class HeaderLostBugTest extends OboFormatTestBasics {static class __CLR4_5_2nfnflvicnyz3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * During the conversion of the rdfxml formatfile the ontology header tags
     * are lost. The possible reason is that the RDFXMLOntologyFormat format
     * writes the annotation assertion axioms as annotations.
     */
    @Test
    public void testHeaderLog() {__CLR4_5_2nfnflvicnyz3.R.globalSliceStart(getClass().getName(),843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28891zonf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nfnflvicnyz3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nfnflvicnyz3.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.HeaderLostBugTest.testHeaderLog",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28891zonf(){try{__CLR4_5_2nfnflvicnyz3.R.inc(843);
        __CLR4_5_2nfnflvicnyz3.R.inc(844);OWLOntology ontology = convertOBOFile("header_lost_bug.obo");
        __CLR4_5_2nfnflvicnyz3.R.inc(845);IRI ontologyIRI = IRI.create("http://purl.obolibrary.org/obo/test.owl");
        __CLR4_5_2nfnflvicnyz3.R.inc(846);Set<OWLAnnotation> ontAnns = ontology.getAnnotations();
        __CLR4_5_2nfnflvicnyz3.R.inc(847);Set<OWLAnnotationAssertionAxiom> axioms = ontology.getAnnotationAssertionAxioms(ontologyIRI);
        // two tags in the header of the obo file are translated as annotation
        // assertions, so the axioms
        // should have two axioms in count.
        __CLR4_5_2nfnflvicnyz3.R.inc(848);assertEquals(2, ontAnns.size());
        __CLR4_5_2nfnflvicnyz3.R.inc(849);assertEquals(0, axioms.size());
    }finally{__CLR4_5_2nfnflvicnyz3.R.flushNeeded();}}

    @Override
    protected OWLOntology convertOBOFile(String fn) {try{__CLR4_5_2nfnflvicnyz3.R.inc(850);
        __CLR4_5_2nfnflvicnyz3.R.inc(851);OWLOntology ontology = convert(parseOBOFile(fn));
        __CLR4_5_2nfnflvicnyz3.R.inc(852);StringDocumentTarget target = new StringDocumentTarget();
        __CLR4_5_2nfnflvicnyz3.R.inc(853);try {
            __CLR4_5_2nfnflvicnyz3.R.inc(854);ontology.getOWLOntologyManager().saveOntology(ontology, new RDFXMLDocumentFormat(), target);
            __CLR4_5_2nfnflvicnyz3.R.inc(855);return m.loadOntologyFromOntologyDocument(new StringDocumentSource(target));
        } catch (OWLException e) {
            __CLR4_5_2nfnflvicnyz3.R.inc(856);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2nfnflvicnyz3.R.flushNeeded();}}
}
