/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.obo2owl.OWLAPIOwl2Obo;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;

/** Tests for {@link ManchesterSyntaxTool}. */
@SuppressWarnings("javadoc")
public class ManchesterSyntaxToolTest extends OboFormatTestBasics {static class __CLR4_5_2gsgslvicnyx7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntology owlOntology = convert(parseOBOFile("simplego.obo"));
    @Nonnull
    private final ManchesterSyntaxTool parser = new ManchesterSyntaxTool(
            owlOntology);

    @Test
    public void testParseManchesterIds() {__CLR4_5_2gsgslvicnyx7.R.globalSliceStart(getClass().getName(),604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qeopd6gs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gsgslvicnyx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gsgslvicnyx7.R.globalSliceEnd(getClass().getName(),"org.obolibrary.macro.ManchesterSyntaxToolTest.testParseManchesterIds",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qeopd6gs(){try{__CLR4_5_2gsgslvicnyx7.R.inc(604);
        __CLR4_5_2gsgslvicnyx7.R.inc(605);OWLClassExpression expression = parser
                .parseManchesterExpression("GO_0018901 AND BFO:0000050 some GO_0055124");
        __CLR4_5_2gsgslvicnyx7.R.inc(606);checkIntersection(expression, "GO:0018901", "BFO:0000050", "GO:0055124");
    }finally{__CLR4_5_2gsgslvicnyx7.R.flushNeeded();}}

    @Test
    public void testParseManchesterNames() {__CLR4_5_2gsgslvicnyx7.R.globalSliceStart(getClass().getName(),607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uviaeygv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2gsgslvicnyx7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2gsgslvicnyx7.R.globalSliceEnd(getClass().getName(),"org.obolibrary.macro.ManchesterSyntaxToolTest.testParseManchesterNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uviaeygv(){try{__CLR4_5_2gsgslvicnyx7.R.inc(607);
        __CLR4_5_2gsgslvicnyx7.R.inc(608);OWLClassExpression expression = parser
                .parseManchesterExpression("'2,4-dichlorophenoxyacetic acid metabolic process' AND 'part_of' some 'premature neural plate formation'");
        __CLR4_5_2gsgslvicnyx7.R.inc(609);checkIntersection(expression, "GO:0018901", "BFO:0000050", "GO:0055124");
    }finally{__CLR4_5_2gsgslvicnyx7.R.flushNeeded();}}

    private static void checkIntersection(OWLClassExpression expression,
            String genus, String relId, String differentia) {try{__CLR4_5_2gsgslvicnyx7.R.inc(610);
        __CLR4_5_2gsgslvicnyx7.R.inc(611);OWLObjectIntersectionOf intersection = (OWLObjectIntersectionOf) expression;
        __CLR4_5_2gsgslvicnyx7.R.inc(612);List<OWLClassExpression> list = intersection.getOperandsAsList();
        __CLR4_5_2gsgslvicnyx7.R.inc(613);OWLClass cls = (OWLClass) list.get(0);
        __CLR4_5_2gsgslvicnyx7.R.inc(614);assertEquals(genus, OWLAPIOwl2Obo.getIdentifier(cls.getIRI()));
        __CLR4_5_2gsgslvicnyx7.R.inc(615);OWLClassExpression rhs = list.get(1);
        __CLR4_5_2gsgslvicnyx7.R.inc(616);OWLClass cls2 = rhs.getClassesInSignature().iterator().next();
        __CLR4_5_2gsgslvicnyx7.R.inc(617);assertEquals(differentia, OWLAPIOwl2Obo.getIdentifier(cls2.getIRI()));
        __CLR4_5_2gsgslvicnyx7.R.inc(618);OWLObjectProperty property = rhs.getObjectPropertiesInSignature()
                .iterator().next();
        __CLR4_5_2gsgslvicnyx7.R.inc(619);assertEquals(relId, OWLAPIOwl2Obo.getIdentifier(property.getIRI()));
    }finally{__CLR4_5_2gsgslvicnyx7.R.flushNeeded();}}
}
