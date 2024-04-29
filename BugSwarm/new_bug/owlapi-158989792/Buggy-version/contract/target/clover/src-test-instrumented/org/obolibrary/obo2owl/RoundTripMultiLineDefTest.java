/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null" })
public class RoundTripMultiLineDefTest extends OboFormatTestBasics {static class __CLR4_5_212v12vlvicnz69{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMultiLineDefinitions() throws Exception {__CLR4_5_212v12vlvicnz69.R.globalSliceStart(getClass().getName(),1399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25taotw12v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212v12vlvicnz69.R.rethrow($CLV_t2$);}finally{__CLR4_5_212v12vlvicnz69.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.RoundTripMultiLineDefTest.testMultiLineDefinitions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25taotw12v() throws Exception{try{__CLR4_5_212v12vlvicnz69.R.inc(1399);
        // create minimal ontology
        __CLR4_5_212v12vlvicnz69.R.inc(1400);OBODoc oboDocSource = new OBODoc();
        __CLR4_5_212v12vlvicnz69.R.inc(1401);oboDocSource.setHeaderFrame(new Frame(FrameType.HEADER));
        __CLR4_5_212v12vlvicnz69.R.inc(1402);oboDocSource.addDefaultOntologyHeader("caro");
        // add source frame that contains at least one new line
        __CLR4_5_212v12vlvicnz69.R.inc(1403);Frame sourceFrame = new Frame(FrameType.TERM);
        __CLR4_5_212v12vlvicnz69.R.inc(1404);sourceFrame.setId("CARO:0000049");
        __CLR4_5_212v12vlvicnz69.R.inc(1405);sourceFrame.addClause(new Clause(OboFormatTag.TAG_DEF,
            "Sequential hermaphroditic organism that produces\ngametes first of the male sex, and then later of the\nfemale sex."));
        __CLR4_5_212v12vlvicnz69.R.inc(1406);oboDocSource.addTermFrame(sourceFrame);
        // convert to OWL and retrieve def
        __CLR4_5_212v12vlvicnz69.R.inc(1407);OWLAPIObo2Owl bridge = new OWLAPIObo2Owl(m);
        __CLR4_5_212v12vlvicnz69.R.inc(1408);OWLOntology owlOntology = bridge.convert(oboDocSource);
        __CLR4_5_212v12vlvicnz69.R.inc(1409);OWLDataFactory factory = owlOntology.getOWLOntologyManager().getOWLDataFactory();
        // IRI
        __CLR4_5_212v12vlvicnz69.R.inc(1410);IRI iri = bridge.oboIdToIRI("CARO:0000049");
        __CLR4_5_212v12vlvicnz69.R.inc(1411);OWLClass c = factory.getOWLClass(iri);
        // Def
        __CLR4_5_212v12vlvicnz69.R.inc(1412);OWLAnnotationProperty defProperty = factory.getOWLAnnotationProperty(Obo2OWLVocabulary.IRI_IAO_0000115
            .getIRI());
        __CLR4_5_212v12vlvicnz69.R.inc(1413);int counter = 0;
        __CLR4_5_212v12vlvicnz69.R.inc(1414);for (OWLAnnotationAssertionAxiom ax : owlOntology.getAnnotationAssertionAxioms(c.getIRI())) {{
            __CLR4_5_212v12vlvicnz69.R.inc(1415);if ((((ax.getProperty().equals(defProperty))&&(__CLR4_5_212v12vlvicnz69.R.iget(1416)!=0|true))||(__CLR4_5_212v12vlvicnz69.R.iget(1417)==0&false))) {{
                __CLR4_5_212v12vlvicnz69.R.inc(1418);counter++;
                __CLR4_5_212v12vlvicnz69.R.inc(1419);assertTrue(ax.getValue() instanceof OWLLiteral);
                __CLR4_5_212v12vlvicnz69.R.inc(1420);String owlDef = ((OWLLiteral) ax.getValue()).getLiteral();
                // check that owl def also contains at least one new line
                __CLR4_5_212v12vlvicnz69.R.inc(1421);assertTrue(owlDef.indexOf('\n') > 0);
            }
        }}
        }__CLR4_5_212v12vlvicnz69.R.inc(1422);assertEquals(1, counter);
        // convert back to OBO
        __CLR4_5_212v12vlvicnz69.R.inc(1423);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_212v12vlvicnz69.R.inc(1424);OBODoc convertedOboDoc = owl2Obo.convert(owlOntology);
        __CLR4_5_212v12vlvicnz69.R.inc(1425);Frame convertedFrame = convertedOboDoc.getTermFrame("CARO:0000049");
        __CLR4_5_212v12vlvicnz69.R.inc(1426);String convertedDef = convertedFrame.getTagValue(OboFormatTag.TAG_DEF, String.class);
        // check that round trip still contains newlines
        __CLR4_5_212v12vlvicnz69.R.inc(1427);assertTrue(convertedDef.indexOf('\n') > 0);
    }finally{__CLR4_5_212v12vlvicnz69.R.flushNeeded();}}
}
