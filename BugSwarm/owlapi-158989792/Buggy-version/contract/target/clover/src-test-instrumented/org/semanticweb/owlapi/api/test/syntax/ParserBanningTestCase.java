/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.syntax;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLOntologyManager;

@SuppressWarnings("javadoc")
public class ParserBanningTestCase extends TestBase {static class __CLR4_5_28ra8ralvico1ou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = OWLOntologyCreationException.class)
    public void shouldFailWithBanningOfTriX() throws OWLOntologyCreationException {__CLR4_5_28ra8ralvico1ou.R.globalSliceStart(getClass().getName(),11350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j9uvmx8ra();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,104,111,117,108,100,70,97,105,108,87,105,116,104,66,97,110,110,105,110,103,79,102,84,114,105,88,58,32,91,79,87,76,79,110,116,111,108,111,103,121,67,114,101,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OWLOntologyCreationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ra8ralvico1ou.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ra8ralvico1ou.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ParserBanningTestCase.shouldFailWithBanningOfTriX",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j9uvmx8ra() throws OWLOntologyCreationException{try{__CLR4_5_28ra8ralvico1ou.R.inc(11350);
        // This ontology is malformed RDF/XML but does not fail under a regular
        // parsing because the
        // TriX parser does not throw an exception reading it (although it does
        // not recognise any axioms)
        // This test ensures that TriX can be banned from parsing
        __CLR4_5_28ra8ralvico1ou.R.inc(11351);String in = "<?xml version=\"1.0\"?>\n"
            + "<rdf:RDF xmlns=\"http://www.semanticweb.org/ontologies/ontologies/2016/2/untitled-ontology-199#\"\n"
            + "     xml:base=\"http://www.semanticweb.org/ontologies/ontologies/2016/2/untitled-ontology-199\"\n"
            + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
            + "     xmlns:xml=\"http://www.w3.org/XML/1998/namespace\"\n"
            + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
            + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
            + "    <owl:Ontology rdf:about=\"http://www.semanticweb.org/ontologies/ontologies/2016/2/untitled-ontology-199\"/>\n"
            + "    <owl:Class rdf:about=\"http://ontologies.owl/A\">\n"
            + "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">See more at <a href=\"http://abc.com\">abc</a></rdfs:comment>\n"
            + "    </owl:Class>\n" + "    <owl:Class rdf:about=\"http://ontologies.owl/B\">\n"
            + "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">a regular comment</rdfs:comment>\n"
            + "    </owl:Class>\n" + "    <owl:Class rdf:about=\"http://ontologies.owl/C\">\n"
            + "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">another regular comment</rdfs:comment>\n"
            + "    </owl:Class>\n" + "</rdf:RDF>";
        __CLR4_5_28ra8ralvico1ou.R.inc(11352);OWLOntologyManager manager = setupManager();
        // org.semanticweb.owlapi.rio.RioBinaryRdfParserFactory
        // org.semanticweb.owlapi.rio.RioJsonLDParserFactory
        // org.semanticweb.owlapi.rio.RioJsonParserFactory
        // org.semanticweb.owlapi.rio.RioN3ParserFactory
        // org.semanticweb.owlapi.rio.RioNQuadsParserFactory
        // org.semanticweb.owlapi.rio.RioNTriplesParserFactory
        // org.semanticweb.owlapi.rio.RioRDFaParserFactory
        // org.semanticweb.owlapi.rio.RioRDFXMLParserFactory
        // org.semanticweb.owlapi.rio.RioTrigParserFactory
        // org.semanticweb.owlapi.rio.RioTrixParserFactory
        // org.semanticweb.owlapi.rio.RioTurtleParserFactory
        __CLR4_5_28ra8ralvico1ou.R.inc(11353);String name = "org.semanticweb.owlapi.rio.RioTrixParserFactory org.semanticweb.owlapi.rio.RioRDFaParserFactory";
        __CLR4_5_28ra8ralvico1ou.R.inc(11354);OWLOntologyLoaderConfiguration config = manager.getOntologyLoaderConfiguration().setBannedParsers(name);
        __CLR4_5_28ra8ralvico1ou.R.inc(11355);manager.setOntologyLoaderConfiguration(config);
        __CLR4_5_28ra8ralvico1ou.R.inc(11356);OWLOntology o = manager.loadOntologyFromOntologyDocument(new StringDocumentSource(in));
    }finally{__CLR4_5_28ra8ralvico1ou.R.flushNeeded();}}
}
