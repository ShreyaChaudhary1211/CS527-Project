/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * Tests for the conversion of rdfs:comment in OWL to remark tag in OBO. This is
 * necessary as OBO-Edit won't load any OBO ontology containing a comment-tag in
 * the ontology header. WARNING: This conversion will not conserve the order of
 * remark tags in a round-trip via OWL.
 */
@SuppressWarnings("javadoc")
public class CommentRemarkConversionTest extends OboFormatTestBasics {static class __CLR4_5_2iwiwlvicnyy0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConversion() throws Exception {__CLR4_5_2iwiwlvicnyy0.R.globalSliceStart(getClass().getName(),680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2neyw0fiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iwiwlvicnyy0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iwiwlvicnyy0.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.CommentRemarkConversionTest.testConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2neyw0fiw() throws Exception{try{__CLR4_5_2iwiwlvicnyy0.R.inc(680);
        __CLR4_5_2iwiwlvicnyy0.R.inc(681);OBODoc obo = parseOBOFile("comment_remark_conversion.obo", true);
        __CLR4_5_2iwiwlvicnyy0.R.inc(682);Frame headerFrame = obo.getHeaderFrame();
        __CLR4_5_2iwiwlvicnyy0.R.inc(683);Collection<String> remarks = headerFrame.getTagValues(OboFormatTag.TAG_REMARK, String.class);
        __CLR4_5_2iwiwlvicnyy0.R.inc(684);OWLAPIObo2Owl obo2Owl = new OWLAPIObo2Owl(m);
        __CLR4_5_2iwiwlvicnyy0.R.inc(685);OWLOntology owlOntology = obo2Owl.convert(obo);
        __CLR4_5_2iwiwlvicnyy0.R.inc(686);Set<OWLAnnotation> annotations = owlOntology.getAnnotations();
        __CLR4_5_2iwiwlvicnyy0.R.inc(687);Set<String> comments = new HashSet<>();
        __CLR4_5_2iwiwlvicnyy0.R.inc(688);for (OWLAnnotation owlAnnotation : annotations) {{
            __CLR4_5_2iwiwlvicnyy0.R.inc(689);OWLAnnotationProperty property = owlAnnotation.getProperty();
            __CLR4_5_2iwiwlvicnyy0.R.inc(690);if ((((property.isComment())&&(__CLR4_5_2iwiwlvicnyy0.R.iget(691)!=0|true))||(__CLR4_5_2iwiwlvicnyy0.R.iget(692)==0&false))) {{
                __CLR4_5_2iwiwlvicnyy0.R.inc(693);OWLAnnotationValue value = owlAnnotation.getValue();
                __CLR4_5_2iwiwlvicnyy0.R.inc(694);if ((((value instanceof OWLLiteral)&&(__CLR4_5_2iwiwlvicnyy0.R.iget(695)!=0|true))||(__CLR4_5_2iwiwlvicnyy0.R.iget(696)==0&false))) {{
                    __CLR4_5_2iwiwlvicnyy0.R.inc(697);OWLLiteral literal = (OWLLiteral) value;
                    __CLR4_5_2iwiwlvicnyy0.R.inc(698);comments.add(literal.getLiteral());
                }
            }}
        }}
        // check that all remarks have been translated to rdfs:comment
        }__CLR4_5_2iwiwlvicnyy0.R.inc(699);assertEquals(remarks.size(), comments.size());
        __CLR4_5_2iwiwlvicnyy0.R.inc(700);assertTrue(comments.containsAll(remarks));
        __CLR4_5_2iwiwlvicnyy0.R.inc(701);assertTrue(remarks.containsAll(comments));
        __CLR4_5_2iwiwlvicnyy0.R.inc(702);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2iwiwlvicnyy0.R.inc(703);OBODoc oboRoundTrip = owl2Obo.convert(owlOntology);
        __CLR4_5_2iwiwlvicnyy0.R.inc(704);Frame headerFrameRoundTrip = oboRoundTrip.getHeaderFrame();
        __CLR4_5_2iwiwlvicnyy0.R.inc(705);Collection<String> remarksRoundTrip = headerFrameRoundTrip.getTagValues(OboFormatTag.TAG_REMARK, String.class);
        __CLR4_5_2iwiwlvicnyy0.R.inc(706);assertEquals(remarks.size(), remarksRoundTrip.size());
        __CLR4_5_2iwiwlvicnyy0.R.inc(707);assertTrue(remarksRoundTrip.containsAll(remarks));
        __CLR4_5_2iwiwlvicnyy0.R.inc(708);assertTrue(remarks.containsAll(remarksRoundTrip));
    }finally{__CLR4_5_2iwiwlvicnyy0.R.flushNeeded();}}
}
