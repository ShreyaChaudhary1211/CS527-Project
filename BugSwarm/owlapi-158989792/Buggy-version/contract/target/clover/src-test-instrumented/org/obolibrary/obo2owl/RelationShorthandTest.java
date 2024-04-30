/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.Xref;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/** @author cjm see 5.9.3 and 8.2.2 of spec */
@SuppressWarnings({ "javadoc", "null" })
public class RelationShorthandTest extends OboFormatTestBasics {static class __CLR4_5_2yryrlvicnz4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1295,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConvert() {__CLR4_5_2yryrlvicnz4h.R.globalSliceStart(getClass().getName(),1251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbsq20yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yryrlvicnz4h.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yryrlvicnz4h.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.RelationShorthandTest.testConvert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbsq20yr(){try{__CLR4_5_2yryrlvicnz4h.R.inc(1251);
        // PARSE TEST FILE, CONVERT TO OWL, AND WRITE TO OWL FILE
        __CLR4_5_2yryrlvicnz4h.R.inc(1252);OWLOntology ontology = convert(parseOBOFile("relation_shorthand_test.obo"));
        // TEST CONTENTS OF OWL ONTOLOGY
        __CLR4_5_2yryrlvicnz4h.R.inc(1253);Set<OWLSubClassOfAxiom> scas = ontology
                .getAxioms(AxiomType.SUBCLASS_OF);
        __CLR4_5_2yryrlvicnz4h.R.inc(1254);boolean ok = false;
        __CLR4_5_2yryrlvicnz4h.R.inc(1255);for (OWLSubClassOfAxiom sca : scas) {{
            __CLR4_5_2yryrlvicnz4h.R.inc(1256);OWLClassExpression sup = sca.getSuperClass();
            __CLR4_5_2yryrlvicnz4h.R.inc(1257);if ((((sup instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_2yryrlvicnz4h.R.iget(1258)!=0|true))||(__CLR4_5_2yryrlvicnz4h.R.iget(1259)==0&false))) {{
                __CLR4_5_2yryrlvicnz4h.R.inc(1260);OWLObjectProperty p = (OWLObjectProperty) ((OWLObjectSomeValuesFrom) sup)
                        .getProperty();
                __CLR4_5_2yryrlvicnz4h.R.inc(1261);OWLClass v = (OWLClass) ((OWLObjectSomeValuesFrom) sup)
                        .getFiller();
                __CLR4_5_2yryrlvicnz4h.R.inc(1262);if ((((p.getIRI().toString()
                        .equals("http://purl.obolibrary.org/obo/BFO_0000051")
                        && v.getIRI()
                                .toString()
                                .equals("http://purl.obolibrary.org/obo/GO_0004055"))&&(__CLR4_5_2yryrlvicnz4h.R.iget(1263)!=0|true))||(__CLR4_5_2yryrlvicnz4h.R.iget(1264)==0&false))) {{
                    __CLR4_5_2yryrlvicnz4h.R.inc(1265);ok = true;
                }
            }}
        }}
        }__CLR4_5_2yryrlvicnz4h.R.inc(1266);assertTrue(ok);
        __CLR4_5_2yryrlvicnz4h.R.inc(1267);scas = ontology.getAxioms(AxiomType.SUBCLASS_OF);
        __CLR4_5_2yryrlvicnz4h.R.inc(1268);ok = false;
        __CLR4_5_2yryrlvicnz4h.R.inc(1269);for (OWLSubClassOfAxiom sca : scas) {{
            __CLR4_5_2yryrlvicnz4h.R.inc(1270);OWLClassExpression sup = sca.getSuperClass();
            __CLR4_5_2yryrlvicnz4h.R.inc(1271);if ((((sup instanceof OWLObjectSomeValuesFrom)&&(__CLR4_5_2yryrlvicnz4h.R.iget(1272)!=0|true))||(__CLR4_5_2yryrlvicnz4h.R.iget(1273)==0&false))) {{
                __CLR4_5_2yryrlvicnz4h.R.inc(1274);OWLObjectProperty p = (OWLObjectProperty) ((OWLObjectSomeValuesFrom) sup)
                        .getProperty();
                __CLR4_5_2yryrlvicnz4h.R.inc(1275);OWLClass v = (OWLClass) ((OWLObjectSomeValuesFrom) sup)
                        .getFiller();
                __CLR4_5_2yryrlvicnz4h.R.inc(1276);if ((((p.getIRI().toString()
                        .equals("http://purl.obolibrary.org/obo/BFO_0000050")
                        && v.getIRI()
                                .toString()
                                .equals("http://purl.obolibrary.org/obo/XX_0000001"))&&(__CLR4_5_2yryrlvicnz4h.R.iget(1277)!=0|true))||(__CLR4_5_2yryrlvicnz4h.R.iget(1278)==0&false))) {{
                    __CLR4_5_2yryrlvicnz4h.R.inc(1279);ok = true;
                }
            }}
        }}
        }__CLR4_5_2yryrlvicnz4h.R.inc(1280);assertTrue(ok);
        // CONVERT BACK TO OBO
        __CLR4_5_2yryrlvicnz4h.R.inc(1281);OBODoc obodoc = convert(ontology);
        // test that relation IDs are converted back to symbolic form
        __CLR4_5_2yryrlvicnz4h.R.inc(1282);Frame tf = obodoc.getTermFrame("GO:0000050");
        __CLR4_5_2yryrlvicnz4h.R.inc(1283);Clause c = tf.getClause(OboFormatTag.TAG_RELATIONSHIP);
        __CLR4_5_2yryrlvicnz4h.R.inc(1284);Object v = c.getValue();
        // should be converted back to symbolic form
        __CLR4_5_2yryrlvicnz4h.R.inc(1285);assertEquals("has_part", v);
        __CLR4_5_2yryrlvicnz4h.R.inc(1286);tf = obodoc.getTermFrame("GO:0004055");
        __CLR4_5_2yryrlvicnz4h.R.inc(1287);c = tf.getClause(OboFormatTag.TAG_RELATIONSHIP);
        __CLR4_5_2yryrlvicnz4h.R.inc(1288);v = c.getValue();
        // should be converted back to symbolic form
        __CLR4_5_2yryrlvicnz4h.R.inc(1289);assertEquals("part_of", v);
        __CLR4_5_2yryrlvicnz4h.R.inc(1290);tf = obodoc.getTypedefFrame("has_part");
        __CLR4_5_2yryrlvicnz4h.R.inc(1291);Collection<Clause> cs = tf.getClauses(OboFormatTag.TAG_XREF);
        __CLR4_5_2yryrlvicnz4h.R.inc(1292);assertEquals(1, cs.size());
        __CLR4_5_2yryrlvicnz4h.R.inc(1293);v = cs.iterator().next().getValue(Xref.class).getIdref();
        // should be converted back to symbolic form
        __CLR4_5_2yryrlvicnz4h.R.inc(1294);assertEquals("BFO:0000051", v);
    }finally{__CLR4_5_2yryrlvicnz4h.R.flushNeeded();}}
}
