/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

@SuppressWarnings("javadoc")
public class ExpandExpressionTest extends OboFormatTestBasics {static class __CLR4_5_2f5f5lvicnyws{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,573,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testExpand() {__CLR4_5_2f5f5lvicnyws.R.globalSliceStart(getClass().getName(),545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtw1w3f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2f5f5lvicnyws.R.rethrow($CLV_t2$);}finally{__CLR4_5_2f5f5lvicnyws.R.globalSliceEnd(getClass().getName(),"org.obolibrary.macro.ExpandExpressionTest.testExpand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtw1w3f5(){try{__CLR4_5_2f5f5lvicnyws.R.inc(545);
        __CLR4_5_2f5f5lvicnyws.R.inc(546);OWLOntology ontology = convert(parseOBOFile("no_overlap.obo"));
        __CLR4_5_2f5f5lvicnyws.R.inc(547);MacroExpansionVisitor mev = new MacroExpansionVisitor(ontology);
        __CLR4_5_2f5f5lvicnyws.R.inc(548);OWLOntology outputOntology = mev.expandAll();
        __CLR4_5_2f5f5lvicnyws.R.inc(549);OWLClass cls = df.getOWLClass(IRI
                .create("http://purl.obolibrary.org/obo/TEST_2"));
        __CLR4_5_2f5f5lvicnyws.R.inc(550);Set<OWLDisjointClassesAxiom> dcas = outputOntology
                .getDisjointClassesAxioms(cls);
        // System.out.println(dcas);
        __CLR4_5_2f5f5lvicnyws.R.inc(551);assertEquals(1, dcas.size());
        __CLR4_5_2f5f5lvicnyws.R.inc(552);cls = df.getOWLClass(IRI
                .create("http://purl.obolibrary.org/obo/TEST_3"));
        __CLR4_5_2f5f5lvicnyws.R.inc(553);Set<OWLSubClassOfAxiom> scas = outputOntology
                .getSubClassAxiomsForSubClass(cls);
        // System.out.println(scas);
        __CLR4_5_2f5f5lvicnyws.R.inc(554);assertEquals(1, scas.size());
        __CLR4_5_2f5f5lvicnyws.R.inc(555);assertEquals(
                "[SubClassOf(<http://purl.obolibrary.org/obo/TEST_3> ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> ObjectIntersectionOf(<http://purl.obolibrary.org/obo/GO_0005886> ObjectSomeValuesFrom(<http://purl.obolibrary.org/obo/BFO_0000051> <http://purl.obolibrary.org/obo/TEST_4>))))]",
                scas.toString());
        __CLR4_5_2f5f5lvicnyws.R.inc(556);cls = df.getOWLClass(IRI
                .create("http://purl.obolibrary.org/obo/TEST_4"));
        __CLR4_5_2f5f5lvicnyws.R.inc(557);Set<OWLEquivalentClassesAxiom> ecas = outputOntology
                .getEquivalentClassesAxioms(cls);
        __CLR4_5_2f5f5lvicnyws.R.inc(558);boolean ok = false;
        __CLR4_5_2f5f5lvicnyws.R.inc(559);for (OWLEquivalentClassesAxiom eca : ecas) {{
            __CLR4_5_2f5f5lvicnyws.R.inc(560);for (OWLClassExpression x : eca.getClassExpressions()) {{
                __CLR4_5_2f5f5lvicnyws.R.inc(561);if ((((x instanceof OWLObjectIntersectionOf)&&(__CLR4_5_2f5f5lvicnyws.R.iget(562)!=0|true))||(__CLR4_5_2f5f5lvicnyws.R.iget(563)==0&false))) {{
                    __CLR4_5_2f5f5lvicnyws.R.inc(564);for (OWLClassExpression y : ((OWLObjectIntersectionOf) x)
                            .getOperands()) {{
                        __CLR4_5_2f5f5lvicnyws.R.inc(565);if ((((y instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_2f5f5lvicnyws.R.iget(566)!=0|true))||(__CLR4_5_2f5f5lvicnyws.R.iget(567)==0&false))) {{
                            __CLR4_5_2f5f5lvicnyws.R.inc(568);String pStr = ((OWLObjectSomeValuesFrom) y)
                                    .getProperty().toString();
                            // System.out.println("p=" + pStr);
                            __CLR4_5_2f5f5lvicnyws.R.inc(569);assertEquals(
                                    "<http://purl.obolibrary.org/obo/BFO_0000051>",
                                    pStr);
                            __CLR4_5_2f5f5lvicnyws.R.inc(570);ok = true;
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_2f5f5lvicnyws.R.inc(571);assertTrue(ok);
        __CLR4_5_2f5f5lvicnyws.R.inc(572);writeOWL(ontology);
    }finally{__CLR4_5_2f5f5lvicnyws.R.flushNeeded();}}
}
