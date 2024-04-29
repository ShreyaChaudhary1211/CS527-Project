/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test.swrl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.Class;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group, Date: 04/04/2014
 */
@SuppressWarnings({ "javadoc", "null" })
public class SWRLAtomOrderingRoundTripTestCase extends TestBase {static class __CLR4_5_2810810lvico1kz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final Set<SWRLAtom> body = new LinkedHashSet<>();
    @Nonnull private final Set<SWRLAtom> head = new LinkedHashSet<>();
    @Nonnull private SWRLRule rule;

    @Before
    public void setUp() {try{__CLR4_5_2810810lvico1kz.R.inc(10404);
        __CLR4_5_2810810lvico1kz.R.inc(10405);PrefixManager pm = new DefaultPrefixManager(null, null, "http://stuff.com/A/");
        __CLR4_5_2810810lvico1kz.R.inc(10406);OWLClass clsA = Class("A", pm);
        __CLR4_5_2810810lvico1kz.R.inc(10407);OWLClass clsB = Class("B", pm);
        __CLR4_5_2810810lvico1kz.R.inc(10408);OWLClass clsC = Class("C", pm);
        __CLR4_5_2810810lvico1kz.R.inc(10409);OWLClass clsD = Class("D", pm);
        __CLR4_5_2810810lvico1kz.R.inc(10410);OWLClass clsE = Class("E", pm);
        __CLR4_5_2810810lvico1kz.R.inc(10411);SWRLVariable varA = df.getSWRLVariable(IRI.create("http://other.com/A/VarA"));
        __CLR4_5_2810810lvico1kz.R.inc(10412);SWRLVariable varB = df.getSWRLVariable(IRI.create("http://other.com/A/VarA"));
        __CLR4_5_2810810lvico1kz.R.inc(10413);SWRLVariable varC = df.getSWRLVariable(IRI.create("http://other.com/A/VarA"));
        __CLR4_5_2810810lvico1kz.R.inc(10414);body.add(df.getSWRLClassAtom(clsC, varA));
        __CLR4_5_2810810lvico1kz.R.inc(10415);body.add(df.getSWRLClassAtom(clsB, varB));
        __CLR4_5_2810810lvico1kz.R.inc(10416);body.add(df.getSWRLClassAtom(clsA, varC));
        __CLR4_5_2810810lvico1kz.R.inc(10417);head.add(df.getSWRLClassAtom(clsE, varA));
        __CLR4_5_2810810lvico1kz.R.inc(10418);head.add(df.getSWRLClassAtom(clsD, varA));
        __CLR4_5_2810810lvico1kz.R.inc(10419);rule = df.getSWRLRule(body, head);
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    @Test
    public void individualsShouldNotGetSWRLVariableTypes() throws OWLOntologyStorageException {__CLR4_5_2810810lvico1kz.R.globalSliceStart(getClass().getName(),10420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zbj3bq81g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2810810lvico1kz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2810810lvico1kz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingRoundTripTestCase.individualsShouldNotGetSWRLVariableTypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zbj3bq81g() throws OWLOntologyStorageException{try{__CLR4_5_2810810lvico1kz.R.inc(10420);
        __CLR4_5_2810810lvico1kz.R.inc(10421);String in = "<rdf:RDF xmlns=\"urn:test#\" xml:base=\"urn:test\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:xml=\"http://www.w3.org/XML/1998/namespace\" xmlns:swrlb=\"http://www.w3.org/2003/11/swrlb#\" xmlns:swrl=\"http://www.w3.org/2003/11/swrl#\" xmlns:protege=\"urn:test#\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
            + "    <owl:Ontology rdf:about=\"urn:test\"/>\n"
            + "    <owl:ObjectProperty rdf:about=\"urn:test#drives\"/>\n"
            + "    <owl:ObjectProperty rdf:about=\"urn:test#hasDriver\"/>\n"
            + "    <owl:NamedIndividual rdf:about=\"urn:test#i61\"/>\n"
            + "    <owl:NamedIndividual rdf:about=\"urn:test#i62\"/>\n" + "    <rdf:Description>\n"
            + "        <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#Imp\"/>\n"
            + "        <swrl:body rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
            + "        <swrl:head>\n" + "            <rdf:Description>\n"
            + "                <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#AtomList\"/>\n"
            + "                <rdf:first>\n" + "                    <rdf:Description>\n"
            + "                        <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#IndividualPropertyAtom\"/>\n"
            + "                        <swrl:argument1 rdf:resource=\"urn:test#i61\"/>\n"
            + "                        <swrl:argument2 rdf:resource=\"urn:test#i62\"/>\n"
            + "                        <swrl:propertyPredicate rdf:resource=\"urn:test#drives\"/>\n"
            + "                    </rdf:Description>\n" + "                </rdf:first>\n"
            + "                <rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
            + "            </rdf:Description>\n" + "        </swrl:head>\n" + "    </rdf:Description>\n"
            + "    <rdf:Description>\n" + "        <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#Imp\"/>\n"
            + "        <rdfs:comment rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">:i62, :i61</rdfs:comment>\n"
            + "        <swrl:body>\n" + "            <rdf:Description>\n"
            + "                <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#AtomList\"/>\n"
            + "                <rdf:first>\n" + "                    <rdf:Description>\n"
            + "                        <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#IndividualPropertyAtom\"/>\n"
            + "                        <swrl:argument1 rdf:resource=\"urn:test#i62\"/>\n"
            + "                        <swrl:argument2 rdf:resource=\"urn:test#i61\"/>\n"
            + "                        <swrl:propertyPredicate rdf:resource=\"urn:test#hasDriver\"/>\n"
            + "                    </rdf:Description>\n" + "                </rdf:first>\n"
            + "                <rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
            + "            </rdf:Description>\n" + "        </swrl:body>\n" + "        <swrl:head>\n"
            + "            <rdf:Description>\n"
            + "                <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#AtomList\"/>\n"
            + "                <rdf:first>\n" + "                    <rdf:Description>\n"
            + "                        <rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#BuiltinAtom\"/>\n"
            + "                        <swrl:arguments rdf:parseType=\"Collection\">\n"
            + "                            <rdf:Description rdf:about=\"urn:test#i62\"/>\n"
            + "                            <rdf:Description rdf:about=\"urn:test#i61\"/>\n"
            + "                        </swrl:arguments>\n"
            + "                        <swrl:builtin rdf:resource=\"http://sqwrl.stanford.edu/ontologies/built-ins/3.4/sqwrl.owl#select\"/>\n"
            + "                    </rdf:Description>\n" + "                </rdf:first>\n"
            + "                <rdf:rest rdf:resource=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#nil\"/>\n"
            + "            </rdf:Description>\n" + "        </swrl:head>\n" + "    </rdf:Description>\n" + "</rdf:RDF>";
        __CLR4_5_2810810lvico1kz.R.inc(10422);OWLOntology o = loadOntologyFromString(in, IRI.create("urn:test"), new RDFXMLDocumentFormat());
        __CLR4_5_2810810lvico1kz.R.inc(10423);String string = saveOntology(o).toString();
        __CLR4_5_2810810lvico1kz.R.inc(10424);assertFalse(string, string.contains("<rdf:type rdf:resource=\"http://www.w3.org/2003/11/swrl#Variable\"/>"));
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    @Test
    public void shouldPreserveOrderingInRDFXMLRoundTrip() throws Exception {__CLR4_5_2810810lvico1kz.R.globalSliceStart(getClass().getName(),10425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yut8kf81l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2810810lvico1kz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2810810lvico1kz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingRoundTripTestCase.shouldPreserveOrderingInRDFXMLRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yut8kf81l() throws Exception{try{__CLR4_5_2810810lvico1kz.R.inc(10425);
        __CLR4_5_2810810lvico1kz.R.inc(10426);roundTrip(new RDFXMLDocumentFormat());
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    private void roundTrip(@Nonnull OWLDocumentFormat ontologyFormat) throws OWLOntologyCreationException,
        OWLOntologyStorageException {try{__CLR4_5_2810810lvico1kz.R.inc(10427);
        __CLR4_5_2810810lvico1kz.R.inc(10428);OWLOntology ont = m.createOntology();
        __CLR4_5_2810810lvico1kz.R.inc(10429);m.addAxiom(ont, rule);
        __CLR4_5_2810810lvico1kz.R.inc(10430);StringDocumentTarget documentTarget = new StringDocumentTarget();
        __CLR4_5_2810810lvico1kz.R.inc(10431);m.saveOntology(ont, ontologyFormat, documentTarget);
        __CLR4_5_2810810lvico1kz.R.inc(10432);OWLOntology ont2 = m1.loadOntologyFromOntologyDocument(new StringDocumentSource(documentTarget.toString(),
            OWLOntologyDocumentSourceBase.getNextDocumentIRI("string:ontology"), ontologyFormat, null));
        __CLR4_5_2810810lvico1kz.R.inc(10433);Set<SWRLRule> rules = ont2.getAxioms(AxiomType.SWRL_RULE);
        __CLR4_5_2810810lvico1kz.R.inc(10434);assertThat(rules.size(), is(1));
        __CLR4_5_2810810lvico1kz.R.inc(10435);SWRLRule parsedRule = rules.iterator().next();
        __CLR4_5_2810810lvico1kz.R.inc(10436);assertThat(parsedRule, is(equalTo(rule)));
        __CLR4_5_2810810lvico1kz.R.inc(10437);List<SWRLAtom> originalBody = new ArrayList<>(body);
        __CLR4_5_2810810lvico1kz.R.inc(10438);List<SWRLAtom> parsedBody = new ArrayList<>(parsedRule.getBody());
        __CLR4_5_2810810lvico1kz.R.inc(10439);assertThat(parsedBody, is(equalTo(originalBody)));
        __CLR4_5_2810810lvico1kz.R.inc(10440);List<SWRLAtom> originalHead = new ArrayList<>(head);
        __CLR4_5_2810810lvico1kz.R.inc(10441);List<SWRLAtom> parsedHead = new ArrayList<>(parsedRule.getHead());
        __CLR4_5_2810810lvico1kz.R.inc(10442);assertThat(originalHead, is(equalTo(parsedHead)));
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    @Test
    public void shouldPreserveOrderingInTurtleRoundTrip() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_2810810lvico1kz.R.globalSliceStart(getClass().getName(),10443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m5fpei823();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2810810lvico1kz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2810810lvico1kz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingRoundTripTestCase.shouldPreserveOrderingInTurtleRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m5fpei823() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2810810lvico1kz.R.inc(10443);
        __CLR4_5_2810810lvico1kz.R.inc(10444);roundTrip(new TurtleDocumentFormat());
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    @Test
    public void shouldPreserveOrderingInManchesterSyntaxRoundTrip() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_2810810lvico1kz.R.globalSliceStart(getClass().getName(),10445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jtfv825();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2810810lvico1kz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2810810lvico1kz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingRoundTripTestCase.shouldPreserveOrderingInManchesterSyntaxRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jtfv825() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2810810lvico1kz.R.inc(10445);
        __CLR4_5_2810810lvico1kz.R.inc(10446);roundTrip(new ManchesterSyntaxDocumentFormat());
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}

    @Test
    public void shouldPreserveOrderingInOWLXMLRoundTrip() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_2810810lvico1kz.R.globalSliceStart(getClass().getName(),10447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fb4bwx827();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2810810lvico1kz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2810810lvico1kz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.swrl.SWRLAtomOrderingRoundTripTestCase.shouldPreserveOrderingInOWLXMLRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fb4bwx827() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2810810lvico1kz.R.inc(10447);
        __CLR4_5_2810810lvico1kz.R.inc(10448);roundTrip(new OWLXMLDocumentFormat());
    }finally{__CLR4_5_2810810lvico1kz.R.flushNeeded();}}
}
