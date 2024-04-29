/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Collection;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.obolibrary.oboformat.parser.OBOFormatParser;
import org.obolibrary.oboformat.writer.OBOFormatWriter;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author cjm see 5.9.3 and 8.2.2 of spec See
 *         http://code.google.com/p/oboformat/issues/detail?id=13
 */
@SuppressWarnings({ "javadoc" })
public class EquivalentToTest extends OboFormatTestBasics {static class __CLR4_5_2krkrlvicnyyt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConvert() throws Exception {__CLR4_5_2krkrlvicnyyt.R.globalSliceStart(getClass().getName(),747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbsq20kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2krkrlvicnyyt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2krkrlvicnyyt.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.EquivalentToTest.testConvert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbsq20kr() throws Exception{try{__CLR4_5_2krkrlvicnyyt.R.inc(747);
        // PARSE TEST FILE
        __CLR4_5_2krkrlvicnyyt.R.inc(748);OWLOntology ontology = convert(parseOBOFile("equivtest.obo"));
        // TEST CONTENTS OF OWL ONTOLOGY
        __CLR4_5_2krkrlvicnyyt.R.inc(749);Set<OWLEquivalentClassesAxiom> ecas = ontology.getAxioms(AxiomType.EQUIVALENT_CLASSES);
        __CLR4_5_2krkrlvicnyyt.R.inc(750);assertEquals(2, ecas.size());
        // CONVERT BACK TO OBO
        __CLR4_5_2krkrlvicnyyt.R.inc(751);OWLAPIOwl2Obo owl2obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2krkrlvicnyyt.R.inc(752);OBODoc obodoc = owl2obo.convert(ontology);
        __CLR4_5_2krkrlvicnyyt.R.inc(753);checkOBODoc(obodoc);
        // ROUNDTRIP AND TEST AGAIN
        __CLR4_5_2krkrlvicnyyt.R.inc(754);OBOFormatWriter w = new OBOFormatWriter();
        __CLR4_5_2krkrlvicnyyt.R.inc(755);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_2krkrlvicnyyt.R.inc(756);OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
        __CLR4_5_2krkrlvicnyyt.R.inc(757);BufferedWriter bw = new BufferedWriter(osw);
        __CLR4_5_2krkrlvicnyyt.R.inc(758);w.setCheckStructure(true);
        __CLR4_5_2krkrlvicnyyt.R.inc(759);w.write(obodoc, bw);
        __CLR4_5_2krkrlvicnyyt.R.inc(760);bw.close();
        __CLR4_5_2krkrlvicnyyt.R.inc(761);OBOFormatParser p = new OBOFormatParser();
        __CLR4_5_2krkrlvicnyyt.R.inc(762);obodoc = p.parse(new BufferedReader(new InputStreamReader(new ByteArrayInputStream(os.toByteArray()))));
        __CLR4_5_2krkrlvicnyyt.R.inc(763);checkOBODoc(obodoc);
    }finally{__CLR4_5_2krkrlvicnyyt.R.flushNeeded();}}

    public void checkOBODoc(@Nonnull OBODoc obodoc) {try{__CLR4_5_2krkrlvicnyyt.R.inc(764);
        // OBODoc tests
        // test ECA between named classes is persisted using correct tag
        __CLR4_5_2krkrlvicnyyt.R.inc(765);Frame tf = obodoc.getTermFrame("X:1");
        assert (((tf != null)&&(__CLR4_5_2krkrlvicnyyt.R.iget(766)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(767)==0&false));
        __CLR4_5_2krkrlvicnyyt.R.inc(768);Collection<Clause> cs = tf.getClauses(OboFormatTag.TAG_EQUIVALENT_TO);
        __CLR4_5_2krkrlvicnyyt.R.inc(769);assertEquals(1, cs.size());
        __CLR4_5_2krkrlvicnyyt.R.inc(770);Object v = cs.iterator().next().getValue();
        __CLR4_5_2krkrlvicnyyt.R.inc(771);assertEquals("X:2", v);
        // test ECA between named class and anon class is persisted as
        // genus-differentia intersection_of tags
        __CLR4_5_2krkrlvicnyyt.R.inc(772);tf = obodoc.getTermFrame("X:1");
        assert (((tf != null)&&(__CLR4_5_2krkrlvicnyyt.R.iget(773)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(774)==0&false));
        __CLR4_5_2krkrlvicnyyt.R.inc(775);cs = tf.getClauses(OboFormatTag.TAG_INTERSECTION_OF);
        __CLR4_5_2krkrlvicnyyt.R.inc(776);assertEquals(2, cs.size());
        __CLR4_5_2krkrlvicnyyt.R.inc(777);boolean okGenus = false;
        __CLR4_5_2krkrlvicnyyt.R.inc(778);boolean okDifferentia = false;
        __CLR4_5_2krkrlvicnyyt.R.inc(779);for (Clause c : cs) {{
            __CLR4_5_2krkrlvicnyyt.R.inc(780);Collection<Object> vs = c.getValues();
            __CLR4_5_2krkrlvicnyyt.R.inc(781);if ((((vs.size() == 2)&&(__CLR4_5_2krkrlvicnyyt.R.iget(782)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(783)==0&false))) {{
                __CLR4_5_2krkrlvicnyyt.R.inc(784);if ((((c.getValue().equals("R:1") && c.getValue2().equals("Z:1"))&&(__CLR4_5_2krkrlvicnyyt.R.iget(785)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(786)==0&false))) {{
                    __CLR4_5_2krkrlvicnyyt.R.inc(787);okDifferentia = true;
                }
            }} }else {__CLR4_5_2krkrlvicnyyt.R.inc(788);if ((((vs.size() == 1)&&(__CLR4_5_2krkrlvicnyyt.R.iget(789)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(790)==0&false))) {{
                __CLR4_5_2krkrlvicnyyt.R.inc(791);if ((((c.getValue().equals("Y:1"))&&(__CLR4_5_2krkrlvicnyyt.R.iget(792)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(793)==0&false))) {{
                    __CLR4_5_2krkrlvicnyyt.R.inc(794);okGenus = true;
                }
            }} }else {{
                __CLR4_5_2krkrlvicnyyt.R.inc(795);fail();
            }
        }}}
        }__CLR4_5_2krkrlvicnyyt.R.inc(796);assertTrue(okGenus);
        __CLR4_5_2krkrlvicnyyt.R.inc(797);assertTrue(okDifferentia);
        // check reciprocal direction
        __CLR4_5_2krkrlvicnyyt.R.inc(798);Frame tf2 = obodoc.getTermFrame("X:2");
        assert (((tf2 != null)&&(__CLR4_5_2krkrlvicnyyt.R.iget(799)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(800)==0&false));
        __CLR4_5_2krkrlvicnyyt.R.inc(801);Collection<Clause> cs2 = tf2.getClauses(OboFormatTag.TAG_EQUIVALENT_TO);
        __CLR4_5_2krkrlvicnyyt.R.inc(802);Frame tf1 = obodoc.getTermFrame("X:1");
        assert (((tf1 != null)&&(__CLR4_5_2krkrlvicnyyt.R.iget(803)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(804)==0&false));
        __CLR4_5_2krkrlvicnyyt.R.inc(805);Collection<Clause> cs1 = tf1.getClauses(OboFormatTag.TAG_EQUIVALENT_TO);
        __CLR4_5_2krkrlvicnyyt.R.inc(806);boolean ok = false;
        __CLR4_5_2krkrlvicnyyt.R.inc(807);if ((((cs2.size() == 1)&&(__CLR4_5_2krkrlvicnyyt.R.iget(808)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(809)==0&false))) {{
            __CLR4_5_2krkrlvicnyyt.R.inc(810);if ((((cs2.iterator().next().getValue(String.class).equals("X:1"))&&(__CLR4_5_2krkrlvicnyyt.R.iget(811)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(812)==0&false))) {{
                __CLR4_5_2krkrlvicnyyt.R.inc(813);ok = true;
            }
        }}
        }__CLR4_5_2krkrlvicnyyt.R.inc(814);if ((((cs1.size() == 1)&&(__CLR4_5_2krkrlvicnyyt.R.iget(815)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(816)==0&false))) {{
            __CLR4_5_2krkrlvicnyyt.R.inc(817);if ((((cs1.iterator().next().getValue(String.class).equals("X:2"))&&(__CLR4_5_2krkrlvicnyyt.R.iget(818)!=0|true))||(__CLR4_5_2krkrlvicnyyt.R.iget(819)==0&false))) {{
                __CLR4_5_2krkrlvicnyyt.R.inc(820);ok = true;
            }
        }}
        }__CLR4_5_2krkrlvicnyyt.R.inc(821);assertTrue(ok);
    }finally{__CLR4_5_2krkrlvicnyyt.R.flushNeeded();}}
}
