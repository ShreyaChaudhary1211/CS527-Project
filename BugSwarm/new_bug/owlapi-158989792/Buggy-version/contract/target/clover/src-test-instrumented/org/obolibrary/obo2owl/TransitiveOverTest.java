/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;

/** see 5.4 of spec */
@SuppressWarnings("javadoc")
public class TransitiveOverTest extends RoundTripTest {static class __CLR4_5_219c19clvicnz92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1664,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConvert() {__CLR4_5_219c19clvicnz92.R.globalSliceStart(getClass().getName(),1632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbsq2019c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219c19clvicnz92.R.rethrow($CLV_t2$);}finally{__CLR4_5_219c19clvicnz92.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.TransitiveOverTest.testConvert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbsq2019c(){try{__CLR4_5_219c19clvicnz92.R.inc(1632);
        // PARSE TEST FILE, CONVERT TO OWL
        __CLR4_5_219c19clvicnz92.R.inc(1633);OWLOntology ontology = convert(parseOBOFile("relation_shorthand_test.obo"));
        // TEST CONTENTS OF OWL ONTOLOGY
        __CLR4_5_219c19clvicnz92.R.inc(1634);IRI regulatesIRI = getIriByLabel(ontology, "regulates");
        __CLR4_5_219c19clvicnz92.R.inc(1635);assertNotNull(regulatesIRI);
        __CLR4_5_219c19clvicnz92.R.inc(1636);boolean ok = false;
        // test that transitive over is translated to a property chain
        __CLR4_5_219c19clvicnz92.R.inc(1637);Set<OWLSubPropertyChainOfAxiom> axioms = ontology
                .getAxioms(AxiomType.SUB_PROPERTY_CHAIN_OF);
        __CLR4_5_219c19clvicnz92.R.inc(1638);for (OWLSubPropertyChainOfAxiom axiom : axioms) {{
            __CLR4_5_219c19clvicnz92.R.inc(1639);OWLObjectProperty p = (OWLObjectProperty) axiom.getSuperProperty();
            __CLR4_5_219c19clvicnz92.R.inc(1640);if ((((regulatesIRI.equals(p.getIRI()))&&(__CLR4_5_219c19clvicnz92.R.iget(1641)!=0|true))||(__CLR4_5_219c19clvicnz92.R.iget(1642)==0&false))) {{
                __CLR4_5_219c19clvicnz92.R.inc(1643);List<OWLObjectPropertyExpression> chain = axiom
                        .getPropertyChain();
                __CLR4_5_219c19clvicnz92.R.inc(1644);assertEquals(2, chain.size());
                __CLR4_5_219c19clvicnz92.R.inc(1645);assertEquals(p, chain.get(0));
                __CLR4_5_219c19clvicnz92.R.inc(1646);assertEquals("http://purl.obolibrary.org/obo/BFO_0000050",
                        ((OWLObjectProperty) chain.get(1)).getIRI().toString());
                __CLR4_5_219c19clvicnz92.R.inc(1647);ok = true;
            }
        }}
        }__CLR4_5_219c19clvicnz92.R.inc(1648);assertTrue(ok);
        // CONVERT BACK TO OBO
        __CLR4_5_219c19clvicnz92.R.inc(1649);OBODoc obodoc = convert(ontology);
        // test that transitive over is converted back
        __CLR4_5_219c19clvicnz92.R.inc(1650);Frame tf = obodoc.getTypedefFrame("regulates");
        assert (((tf != null)&&(__CLR4_5_219c19clvicnz92.R.iget(1651)!=0|true))||(__CLR4_5_219c19clvicnz92.R.iget(1652)==0&false));
        __CLR4_5_219c19clvicnz92.R.inc(1653);assertEquals(3, tf.getClauses().size());
        __CLR4_5_219c19clvicnz92.R.inc(1654);assertEquals("regulates", tf.getTagValue(OboFormatTag.TAG_ID));
        __CLR4_5_219c19clvicnz92.R.inc(1655);assertEquals("regulates", tf.getTagValue(OboFormatTag.TAG_NAME));
        __CLR4_5_219c19clvicnz92.R.inc(1656);Clause clause = tf.getClause(OboFormatTag.TAG_TRANSITIVE_OVER);
        assert (((clause != null)&&(__CLR4_5_219c19clvicnz92.R.iget(1657)!=0|true))||(__CLR4_5_219c19clvicnz92.R.iget(1658)==0&false));
        __CLR4_5_219c19clvicnz92.R.inc(1659);assertEquals(1, clause.getValues().size());
        __CLR4_5_219c19clvicnz92.R.inc(1660);assertEquals("part_of", clause.getValue());
        __CLR4_5_219c19clvicnz92.R.inc(1661);assertTrue(clause.getQualifierValues().isEmpty());
    }finally{__CLR4_5_219c19clvicnz92.R.flushNeeded();}}

    @Test
    public void testRoundTrip() throws Exception {__CLR4_5_219c19clvicnz92.R.globalSliceStart(getClass().getName(),1662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhw67s1a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219c19clvicnz92.R.rethrow($CLV_t2$);}finally{__CLR4_5_219c19clvicnz92.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.TransitiveOverTest.testRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhw67s1a6() throws Exception{try{__CLR4_5_219c19clvicnz92.R.inc(1662);
        __CLR4_5_219c19clvicnz92.R.inc(1663);roundTripOBOFile("relation_shorthand_test.obo", true);
    }finally{__CLR4_5_219c19clvicnz92.R.flushNeeded();}}
}
