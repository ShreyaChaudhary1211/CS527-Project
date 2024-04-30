/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

@SuppressWarnings("javadoc")
public class IDsTest extends TestBase {static class __CLR4_5_2ntntlvicnyzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,905,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIDs() throws OWLOntologyCreationException {__CLR4_5_2ntntlvicnyzb.R.globalSliceStart(getClass().getName(),857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z412mrnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ntntlvicnyzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ntntlvicnyzb.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.IDsTest.testIDs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z412mrnt() throws OWLOntologyCreationException{try{__CLR4_5_2ntntlvicnyzb.R.inc(857);
        __CLR4_5_2ntntlvicnyzb.R.inc(858);OBODoc doc = new OBODoc();
        __CLR4_5_2ntntlvicnyzb.R.inc(859);Frame header = new Frame(FrameType.HEADER);
        __CLR4_5_2ntntlvicnyzb.R.inc(860);Clause c = new Clause(OboFormatTag.TAG_ONTOLOGY.getTag());
        __CLR4_5_2ntntlvicnyzb.R.inc(861);c.setValue("test");
        __CLR4_5_2ntntlvicnyzb.R.inc(862);header.addClause(c);
        __CLR4_5_2ntntlvicnyzb.R.inc(863);doc.setHeaderFrame(header);
        __CLR4_5_2ntntlvicnyzb.R.inc(864);OWLAPIObo2Owl obo2owl = new OWLAPIObo2Owl(m);
        __CLR4_5_2ntntlvicnyzb.R.inc(865);OWLAPIOwl2Obo owl2Obo = new OWLAPIOwl2Obo(m);
        __CLR4_5_2ntntlvicnyzb.R.inc(866);OWLOntology ontology = obo2owl.convert(doc);
        __CLR4_5_2ntntlvicnyzb.R.inc(867);owl2Obo.convert(ontology);
        // Obo 2 OWL
        __CLR4_5_2ntntlvicnyzb.R.inc(868);IRI iri = obo2owl.oboIdToIRI("GO:001");
        __CLR4_5_2ntntlvicnyzb.R.inc(869);assertEquals("http://purl.obolibrary.org/obo/GO_001", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(870);String oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(871);assertEquals("GO:001", oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(872);iri = obo2owl.oboIdToIRI("My_Ont:FOO_002");
        __CLR4_5_2ntntlvicnyzb.R.inc(873);assertEquals("http://purl.obolibrary.org/obo/My_Ont#_FOO_002", iri.toString());
        __CLR4_5_2ntntlvicnyzb.R.inc(874);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(875);assertEquals("My_Ont:FOO_002", oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(876);iri = obo2owl.oboIdToIRI("My_Ont:002");
        __CLR4_5_2ntntlvicnyzb.R.inc(877);assertEquals("http://purl.obolibrary.org/obo/My_Ont_002", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(878);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(879);assertEquals("My_Ont:002", oboId);
        // unprefixed IDs are prefixed with the current ontology ID
        __CLR4_5_2ntntlvicnyzb.R.inc(880);iri = obo2owl.oboIdToIRI("003");
        __CLR4_5_2ntntlvicnyzb.R.inc(881);assertEquals("http://purl.obolibrary.org/obo/test#003", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(882);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(883);assertEquals("003", oboId);
        // arbitrary URL to obo ID
        __CLR4_5_2ntntlvicnyzb.R.inc(884);oboId = OWLAPIOwl2Obo.getIdentifier(IRI.create("http://purl.obolibrary.org/obo/alternate#abcdef"));
        // todo - test this
        // System.out.println("== "+oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(885);iri = obo2owl.oboIdToIRI("part_of");
        __CLR4_5_2ntntlvicnyzb.R.inc(886);assertEquals("http://purl.obolibrary.org/obo/test#part_of", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(887);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(888);assertEquals("part_of", oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(889);iri = obo2owl.oboIdToIRI("OBO_REL:part_of");
        __CLR4_5_2ntntlvicnyzb.R.inc(890);assertEquals("http://purl.obolibrary.org/obo/OBO_REL#_part_of", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(891);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(892);assertEquals("OBO_REL:part_of", oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(893);iri = obo2owl.oboIdToIRI("http://purl.obolibrary.org/testont");
        __CLR4_5_2ntntlvicnyzb.R.inc(894);assertEquals("http://purl.obolibrary.org/testont", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(895);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(896);assertEquals("http://purl.obolibrary.org/testont", oboId);
        __CLR4_5_2ntntlvicnyzb.R.inc(897);iri = obo2owl.oboIdToIRI("http://purl.obolibrary.org/obo/BFO_0000050");
        __CLR4_5_2ntntlvicnyzb.R.inc(898);assertEquals("http://purl.obolibrary.org/obo/BFO_0000050", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(899);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(900);assertEquals("BFO:0000050", oboId);
        // MGI IDs are perverse - they have a double-separator
        __CLR4_5_2ntntlvicnyzb.R.inc(901);iri = obo2owl.oboIdToIRI("MGI:MGI:1");
        __CLR4_5_2ntntlvicnyzb.R.inc(902);assertEquals("http://purl.obolibrary.org/obo/MGI_MGI%3A1", iri.toString());
        // OWL 2 obo
        __CLR4_5_2ntntlvicnyzb.R.inc(903);oboId = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2ntntlvicnyzb.R.inc(904);assertEquals("MGI:MGI:1", oboId);
    }finally{__CLR4_5_2ntntlvicnyzb.R.flushNeeded();}}
}
