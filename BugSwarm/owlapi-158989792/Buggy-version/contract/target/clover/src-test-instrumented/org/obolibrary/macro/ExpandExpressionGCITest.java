/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings("javadoc")
public class ExpandExpressionGCITest extends OboFormatTestBasics {static class __CLR4_5_2ebeblvicnyvz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testExpand() {__CLR4_5_2ebeblvicnyvz.R.globalSliceStart(getClass().getName(),515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtw1w3eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ebeblvicnyvz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ebeblvicnyvz.R.globalSliceEnd(getClass().getName(),"org.obolibrary.macro.ExpandExpressionGCITest.testExpand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtw1w3eb(){try{__CLR4_5_2ebeblvicnyvz.R.inc(515);
        __CLR4_5_2ebeblvicnyvz.R.inc(516);OWLOntology ontology = convert(parseOBOFile("no_overlap.obo"));
        __CLR4_5_2ebeblvicnyvz.R.inc(517);MacroExpansionGCIVisitor mev = new MacroExpansionGCIVisitor(m, ontology, false);
        __CLR4_5_2ebeblvicnyvz.R.inc(518);OWLOntology gciOntology = mev.createGCIOntology();
        __CLR4_5_2ebeblvicnyvz.R.inc(519);int axiomCount = gciOntology.getAxiomCount();
        __CLR4_5_2ebeblvicnyvz.R.inc(520);assertTrue(axiomCount > 0);
        __CLR4_5_2ebeblvicnyvz.R.inc(521);OWLClass cls = df.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/TEST_2"));
        __CLR4_5_2ebeblvicnyvz.R.inc(522);Set<OWLDisjointClassesAxiom> dcas = gciOntology.getDisjointClassesAxioms(cls);
        __CLR4_5_2ebeblvicnyvz.R.inc(523);assertEquals(1, dcas.size());
        __CLR4_5_2ebeblvicnyvz.R.inc(524);Set<OWLEquivalentClassesAxiom> equivalentClassesAxioms = gciOntology.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        // assertEquals(2, equivalentClassesAxioms.size());
        __CLR4_5_2ebeblvicnyvz.R.inc(525);for (OWLEquivalentClassesAxiom eca : equivalentClassesAxioms) {{
            __CLR4_5_2ebeblvicnyvz.R.inc(526);Set<OWLClassExpression> ces = eca.getClassExpressions();
            __CLR4_5_2ebeblvicnyvz.R.inc(527);OWLClass clst4 = df.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/TEST_4"));
            __CLR4_5_2ebeblvicnyvz.R.inc(528);OWLObjectPropertyExpression p = df.getOWLObjectProperty(IRI.create(
                "http://purl.obolibrary.org/obo/RO_0002104"));
            __CLR4_5_2ebeblvicnyvz.R.inc(529);OWLClassExpression cet4 = df.getOWLObjectSomeValuesFrom(p, clst4);
            __CLR4_5_2ebeblvicnyvz.R.inc(530);OWLClass clst5 = df.getOWLClass(IRI.create("http://purl.obolibrary.org/obo/TEST_5"));
            __CLR4_5_2ebeblvicnyvz.R.inc(531);OWLClassExpression cet5 = df.getOWLObjectSomeValuesFrom(p, clst5);
            __CLR4_5_2ebeblvicnyvz.R.inc(532);if ((((ces.contains(cet4))&&(__CLR4_5_2ebeblvicnyvz.R.iget(533)!=0|true))||(__CLR4_5_2ebeblvicnyvz.R.iget(534)==0&false))) {{
                __CLR4_5_2ebeblvicnyvz.R.inc(535);ces.remove(cet4);
                __CLR4_5_2ebeblvicnyvz.R.inc(536);OWLClassExpression clst4ex = ces.iterator().next();
                __CLR4_5_2ebeblvicnyvz.R.inc(537);assertEquals(
                    "ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> ObjectIntersectionOf(<http://purl.obolibrary.org/obo/GO_0005886> ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> <http://purl.obolibrary.org/obo/TEST_4>)))",
                    clst4ex.toString());
            } }else {__CLR4_5_2ebeblvicnyvz.R.inc(538);if ((((ces.contains(cet5))&&(__CLR4_5_2ebeblvicnyvz.R.iget(539)!=0|true))||(__CLR4_5_2ebeblvicnyvz.R.iget(540)==0&false))) {{
                __CLR4_5_2ebeblvicnyvz.R.inc(541);ces.remove(cet5);
                __CLR4_5_2ebeblvicnyvz.R.inc(542);OWLClassExpression clst5ex = ces.iterator().next();
                __CLR4_5_2ebeblvicnyvz.R.inc(543);assertEquals(
                    "ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> ObjectIntersectionOf(<http://purl.obolibrary.org/obo/GO_0005886> ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> <http://purl.obolibrary.org/obo/TEST_5>)))",
                    clst5ex.toString());
            } }else {{
                __CLR4_5_2ebeblvicnyvz.R.inc(544);fail("Unknown OWLEquivalentClassesAxiom: " + eca);
            }
        }}}
    }}finally{__CLR4_5_2ebeblvicnyvz.R.flushNeeded();}}
}
