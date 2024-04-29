/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null" })
public class RoundTripCardinalityTest extends RoundTripTest {static class __CLR4_5_2118118lvicnz61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1391,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRoundTripCardinality() throws Exception {__CLR4_5_2118118lvicnz61.R.globalSliceStart(getClass().getName(),1340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229jtas118();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2118118lvicnz61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2118118lvicnz61.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.RoundTripCardinalityTest.testRoundTripCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229jtas118() throws Exception{try{__CLR4_5_2118118lvicnz61.R.inc(1340);
        // create minimal ontology
        __CLR4_5_2118118lvicnz61.R.inc(1341);OBODoc oboDocSource = parseOBOFile("roundtrip_cardinality.obo");
        // convert to OWL and retrieve def
        __CLR4_5_2118118lvicnz61.R.inc(1342);OWLAPIObo2Owl bridge = new OWLAPIObo2Owl(m);
        __CLR4_5_2118118lvicnz61.R.inc(1343);OWLOntology owlOntology = bridge.convert(oboDocSource);
        __CLR4_5_2118118lvicnz61.R.inc(1344);OWLDataFactory factory = owlOntology.getOWLOntologyManager().getOWLDataFactory();
        __CLR4_5_2118118lvicnz61.R.inc(1345);OWLClass c = factory.getOWLClass(bridge.oboIdToIRI("PR:000027136"));
        // Relations
        __CLR4_5_2118118lvicnz61.R.inc(1346);boolean foundRel1 = false;
        __CLR4_5_2118118lvicnz61.R.inc(1347);boolean foundRel2 = false;
        __CLR4_5_2118118lvicnz61.R.inc(1348);Set<OWLSubClassOfAxiom> axioms = owlOntology.getSubClassAxiomsForSubClass(c);
        __CLR4_5_2118118lvicnz61.R.inc(1349);assertEquals(3, axioms.size());
        __CLR4_5_2118118lvicnz61.R.inc(1350);for (OWLSubClassOfAxiom axiom : axioms) {{
            __CLR4_5_2118118lvicnz61.R.inc(1351);OWLClassExpression superClass = axiom.getSuperClass();
            __CLR4_5_2118118lvicnz61.R.inc(1352);if ((((superClass instanceof OWLObjectExactCardinality)&&(__CLR4_5_2118118lvicnz61.R.iget(1353)!=0|true))||(__CLR4_5_2118118lvicnz61.R.iget(1354)==0&false))) {{
                __CLR4_5_2118118lvicnz61.R.inc(1355);OWLObjectExactCardinality cardinality = (OWLObjectExactCardinality) superClass;
                __CLR4_5_2118118lvicnz61.R.inc(1356);OWLClassExpression filler = cardinality.getFiller();
                __CLR4_5_2118118lvicnz61.R.inc(1357);assertFalse(filler.isAnonymous());
                __CLR4_5_2118118lvicnz61.R.inc(1358);IRI iri = filler.asOWLClass().getIRI();
                __CLR4_5_2118118lvicnz61.R.inc(1359);if ((((iri.equals(bridge.oboIdToIRI("PR:000005116")))&&(__CLR4_5_2118118lvicnz61.R.iget(1360)!=0|true))||(__CLR4_5_2118118lvicnz61.R.iget(1361)==0&false))) {{
                    __CLR4_5_2118118lvicnz61.R.inc(1362);foundRel1 = true;
                    __CLR4_5_2118118lvicnz61.R.inc(1363);assertEquals(1, cardinality.getCardinality());
                } }else {__CLR4_5_2118118lvicnz61.R.inc(1364);if ((((iri.equals(bridge.oboIdToIRI("PR:000027122")))&&(__CLR4_5_2118118lvicnz61.R.iget(1365)!=0|true))||(__CLR4_5_2118118lvicnz61.R.iget(1366)==0&false))) {{
                    __CLR4_5_2118118lvicnz61.R.inc(1367);foundRel2 = true;
                    __CLR4_5_2118118lvicnz61.R.inc(1368);assertEquals(2, cardinality.getCardinality());
                }
            }}}
        }}
        }__CLR4_5_2118118lvicnz61.R.inc(1369);assertTrue(foundRel1);
        __CLR4_5_2118118lvicnz61.R.inc(1370);assertTrue(foundRel2);
        // convert back to OBO
        __CLR4_5_2118118lvicnz61.R.inc(1371);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2118118lvicnz61.R.inc(1372);OBODoc convertedOboDoc = owl2Obo.convert(owlOntology);
        __CLR4_5_2118118lvicnz61.R.inc(1373);Frame convertedFrame = convertedOboDoc.getTermFrame("PR:000027136");
        __CLR4_5_2118118lvicnz61.R.inc(1374);Collection<Clause> clauses = convertedFrame.getClauses(OboFormatTag.TAG_RELATIONSHIP);
        // check that round trip still contains relationships
        __CLR4_5_2118118lvicnz61.R.inc(1375);assertEquals(2, clauses.size());
        __CLR4_5_2118118lvicnz61.R.inc(1376);for (Clause clause : clauses) {{
            __CLR4_5_2118118lvicnz61.R.inc(1377);Collection<QualifierValue> qualifierValues = clause.getQualifierValues();
            __CLR4_5_2118118lvicnz61.R.inc(1378);assertEquals(1, qualifierValues.size());
            __CLR4_5_2118118lvicnz61.R.inc(1379);QualifierValue value = qualifierValues.iterator().next();
            __CLR4_5_2118118lvicnz61.R.inc(1380);assertEquals("cardinality", value.getQualifier());
            __CLR4_5_2118118lvicnz61.R.inc(1381);if ((((clause.getValue2().equals("PR:000005116"))&&(__CLR4_5_2118118lvicnz61.R.iget(1382)!=0|true))||(__CLR4_5_2118118lvicnz61.R.iget(1383)==0&false))) {{
                __CLR4_5_2118118lvicnz61.R.inc(1384);assertEquals("1", value.getValue());
            } }else {__CLR4_5_2118118lvicnz61.R.inc(1385);if ((((clause.getValue2().equals("PR:000027122"))&&(__CLR4_5_2118118lvicnz61.R.iget(1386)!=0|true))||(__CLR4_5_2118118lvicnz61.R.iget(1387)==0&false))) {{
                __CLR4_5_2118118lvicnz61.R.inc(1388);assertEquals("2", value.getValue());
            }
        }}}
    }}finally{__CLR4_5_2118118lvicnz61.R.flushNeeded();}}

    @Test
    public void roundTrip() throws Exception {__CLR4_5_2118118lvicnz61.R.globalSliceStart(getClass().getName(),1389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284hvwa12l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2118118lvicnz61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2118118lvicnz61.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.RoundTripCardinalityTest.roundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284hvwa12l() throws Exception{try{__CLR4_5_2118118lvicnz61.R.inc(1389);
        __CLR4_5_2118118lvicnz61.R.inc(1390);roundTripOBOFile("roundtrip_cardinality.obo", true);
    }finally{__CLR4_5_2118118lvicnz61.R.flushNeeded();}}
}
