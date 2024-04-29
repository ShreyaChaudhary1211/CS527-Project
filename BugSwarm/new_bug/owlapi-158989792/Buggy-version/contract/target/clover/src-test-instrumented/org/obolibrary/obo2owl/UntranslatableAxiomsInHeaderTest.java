/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * Tests for the handling of axioms, which cannot be translated to OBO. Such
 * axioms will be added in a tag in the ontology header.
 */
@SuppressWarnings("javadoc")
public class UntranslatableAxiomsInHeaderTest extends OboFormatTestBasics {static class __CLR4_5_21ay1aylvicnz9i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testUntranslatableAxioms() throws Exception {__CLR4_5_21ay1aylvicnz9i.R.globalSliceStart(getClass().getName(),1690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qto5gm1ay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ay1aylvicnz9i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ay1aylvicnz9i.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.UntranslatableAxiomsInHeaderTest.testUntranslatableAxioms",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qto5gm1ay() throws Exception{try{__CLR4_5_21ay1aylvicnz9i.R.inc(1690);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1691);OWLOntology original = parseOWLFile("untranslatable_axioms.owl");
        __CLR4_5_21ay1aylvicnz9i.R.inc(1692);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1693);OBODoc obo = owl2Obo.convert(original);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1694);renderOboToString(obo);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1695);Frame headerFrame = obo.getHeaderFrame();
        __CLR4_5_21ay1aylvicnz9i.R.inc(1696);String owlAxiomString = headerFrame.getTagValue(OboFormatTag.TAG_OWL_AXIOMS, String.class);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1697);assertNotNull(owlAxiomString);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1698);OWLAPIObo2Owl obo2Owl = new OWLAPIObo2Owl(m1);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1699);OWLOntology converted = obo2Owl.convert(obo);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1700);Set<OWLEquivalentClassesAxiom> originalEqAxioms = original.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1701);Set<OWLEquivalentClassesAxiom> convertedEqAxioms = converted.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1702);assertEquals(originalEqAxioms.size(), convertedEqAxioms.size());
        __CLR4_5_21ay1aylvicnz9i.R.inc(1703);assertTrue(originalEqAxioms.containsAll(convertedEqAxioms));
        __CLR4_5_21ay1aylvicnz9i.R.inc(1704);assertTrue(convertedEqAxioms.containsAll(originalEqAxioms));
    }finally{__CLR4_5_21ay1aylvicnz9i.R.flushNeeded();}}

    @Test
    public void testUntranslatableAxioms2() throws Exception {__CLR4_5_21ay1aylvicnz9i.R.globalSliceStart(getClass().getName(),1705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lywa7u1bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ay1aylvicnz9i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ay1aylvicnz9i.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.UntranslatableAxiomsInHeaderTest.testUntranslatableAxioms2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lywa7u1bd() throws Exception{try{__CLR4_5_21ay1aylvicnz9i.R.inc(1705);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1706);OWLOntology original = parseOWLFile("untranslatable_axioms2.owl");
        __CLR4_5_21ay1aylvicnz9i.R.inc(1707);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1708);OBODoc obo = owl2Obo.convert(original);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1709);renderOboToString(obo);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1710);Frame headerFrame = obo.getHeaderFrame();
        __CLR4_5_21ay1aylvicnz9i.R.inc(1711);String owlAxiomString = headerFrame.getTagValue(OboFormatTag.TAG_OWL_AXIOMS, String.class);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1712);assertNotNull(owlAxiomString);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1713);OWLAPIObo2Owl obo2Owl = new OWLAPIObo2Owl(m1);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1714);OWLOntology converted = obo2Owl.convert(obo);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1715);Set<OWLEquivalentClassesAxiom> originalEqAxioms = original.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1716);Set<OWLEquivalentClassesAxiom> convertedEqAxioms = converted.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        __CLR4_5_21ay1aylvicnz9i.R.inc(1717);assertEquals(originalEqAxioms.size(), convertedEqAxioms.size());
        __CLR4_5_21ay1aylvicnz9i.R.inc(1718);assertTrue(originalEqAxioms.containsAll(convertedEqAxioms));
        __CLR4_5_21ay1aylvicnz9i.R.inc(1719);assertTrue(convertedEqAxioms.containsAll(originalEqAxioms));
    }finally{__CLR4_5_21ay1aylvicnz9i.R.flushNeeded();}}
}
