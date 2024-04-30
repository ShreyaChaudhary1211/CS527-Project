/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.obo2owl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.obolibrary.oboformat.model.OBODoc;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;

@SuppressWarnings("javadoc")
public class Owl2OboTest extends OboFormatTestBasics {static class __CLR4_5_2xvxvlvicnz42{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,1249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConversion() throws Exception {__CLR4_5_2xvxvlvicnz42.R.globalSliceStart(getClass().getName(),1219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2neyw0fxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xvxvlvicnz42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xvxvlvicnz42.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.Owl2OboTest.testConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2neyw0fxv() throws Exception{try{__CLR4_5_2xvxvlvicnz42.R.inc(1219);
        __CLR4_5_2xvxvlvicnz42.R.inc(1220);OWLOntology ontology = convert(parseOBOFile("caro.obo"));
        __CLR4_5_2xvxvlvicnz42.R.inc(1221);OBODoc doc = convert(ontology);
        __CLR4_5_2xvxvlvicnz42.R.inc(1222);writeOBO(doc);
    }finally{__CLR4_5_2xvxvlvicnz42.R.flushNeeded();}}

    @Test
    public void testIRTsConversion() throws Exception {__CLR4_5_2xvxvlvicnz42.R.globalSliceStart(getClass().getName(),1223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24qk1d5xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xvxvlvicnz42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xvxvlvicnz42.R.globalSliceEnd(getClass().getName(),"org.obolibrary.obo2owl.Owl2OboTest.testIRTsConversion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24qk1d5xz() throws Exception{try{__CLR4_5_2xvxvlvicnz42.R.inc(1223);
        __CLR4_5_2xvxvlvicnz42.R.inc(1224);IRI ontologyIRI = IRI.create("http://purl.obolibrary.org/obo/test.owl");
        __CLR4_5_2xvxvlvicnz42.R.inc(1225);OWLOntology ontology = m.createOntology(ontologyIRI);
        __CLR4_5_2xvxvlvicnz42.R.inc(1226);convert(ontology);
        __CLR4_5_2xvxvlvicnz42.R.inc(1227);String ontId = OWLAPIOwl2Obo.getOntologyId(ontology);
        __CLR4_5_2xvxvlvicnz42.R.inc(1228);assertEquals("test", ontId);
        __CLR4_5_2xvxvlvicnz42.R.inc(1229);IRI iri = IRI.create("http://purl.obolibrary.org/obo/OBI_0000306");
        __CLR4_5_2xvxvlvicnz42.R.inc(1230);String id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1231);assertTrue("OBI:0000306".endsWith(id));
        __CLR4_5_2xvxvlvicnz42.R.inc(1232);iri = IRI.create("http://purl.obolibrary.org/obo/IAO_0000119");
        __CLR4_5_2xvxvlvicnz42.R.inc(1233);id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1234);assertEquals("IAO:0000119", id);
        __CLR4_5_2xvxvlvicnz42.R.inc(1235);iri = IRI.create("http://purl.obolibrary.org/obo/caro_part_of");
        __CLR4_5_2xvxvlvicnz42.R.inc(1236);id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1237);assertEquals("http://purl.obolibrary.org/obo/caro_part_of", id);
        __CLR4_5_2xvxvlvicnz42.R.inc(1238);iri = IRI.create("http://purl.obolibrary.org/obo/MyOnt#_part_of");
        __CLR4_5_2xvxvlvicnz42.R.inc(1239);id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1240);assertEquals("MyOnt:part_of", id);
        __CLR4_5_2xvxvlvicnz42.R.inc(1241);iri = IRI.create("http://purl.obolibrary.org/obo/MyOnt#termid");
        __CLR4_5_2xvxvlvicnz42.R.inc(1242);id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1243);assertEquals("termid", id);
        // unprefixed IDs from different ontology
        __CLR4_5_2xvxvlvicnz42.R.inc(1244);iri = IRI.create("http://purl.obolibrary.org/obo/MyOnt#termid");
        __CLR4_5_2xvxvlvicnz42.R.inc(1245);id = OWLAPIOwl2Obo.getIdentifier(iri);
        // assertTrue("http://purl.obolibrary.org/obo/MyOnt#termid".equals(id));
        __CLR4_5_2xvxvlvicnz42.R.inc(1246);iri = IRI.create("http://www.w3.org/2002/07/owl#topObjectProperty");
        __CLR4_5_2xvxvlvicnz42.R.inc(1247);id = OWLAPIOwl2Obo.getIdentifier(iri);
        __CLR4_5_2xvxvlvicnz42.R.inc(1248);assertEquals("owl:topObjectProperty", id);
    }finally{__CLR4_5_2xvxvlvicnz42.R.flushNeeded();}}
}
