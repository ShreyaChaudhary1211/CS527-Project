/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax.rdfxml;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterPreferences;

@SuppressWarnings("javadoc")
public class EntitiesTestCase extends TestBase {static class __CLR4_5_298u98ulvico1u4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldRoundtripEntities() throws Exception {__CLR4_5_298u98ulvico1u4.R.globalSliceStart(getClass().getName(),11982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zdvp498u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_298u98ulvico1u4.R.rethrow($CLV_t2$);}finally{__CLR4_5_298u98ulvico1u4.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.EntitiesTestCase.shouldRoundtripEntities",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11982,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zdvp498u() throws Exception{try{__CLR4_5_298u98ulvico1u4.R.inc(11982);
        __CLR4_5_298u98ulvico1u4.R.inc(11983);String input = "<?xml version=\"1.0\"?>\n<!DOCTYPE rdf:RDF [<!ENTITY vin  \"http://www.w3.org/TR/2004/REC-owl-guide-20040210/wine#\" > ]>\n"
                + "<rdf:RDF xmlns:owl =\"http://www.w3.org/2002/07/owl#\" xmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:xsd =\"http://www.w3.org/2001/XMLSchema#\"> \n"
                + "<owl:Ontology rdf:about=\"\"><owl:priorVersion rdf:resource=\"&vin;test\"/></owl:Ontology></rdf:RDF>";
        __CLR4_5_298u98ulvico1u4.R.inc(11984);XMLWriterPreferences.getInstance().setUseNamespaceEntities(true);
        __CLR4_5_298u98ulvico1u4.R.inc(11985);OWLOntology o = m
                .loadOntologyFromOntologyDocument(new StringDocumentSource(
                        input, IRI.create("urn:test"),
                        new RDFXMLDocumentFormat(), null));
        __CLR4_5_298u98ulvico1u4.R.inc(11986);StringDocumentTarget o2 = saveOntology(o);
        __CLR4_5_298u98ulvico1u4.R.inc(11987);assertTrue(o2.toString().contains(
                "<owl:priorVersion rdf:resource=\"&vin;test\"/>"));
    }finally{__CLR4_5_298u98ulvico1u4.R.flushNeeded();}}
}
