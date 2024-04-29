/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.manchestersyntax.renderer.ManchesterOWLSyntaxPrefixNameShortFormProvider;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.AnnotationValueShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

@SuppressWarnings({ "javadoc", "null" })
public class ManchesterOWLSyntaxParserTestCase extends TestBase {static class __CLR4_5_28ih8ihlvico1o0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldRoundtripAnnotationAssertionsWithAnnotations()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21123zv8ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldRoundtripAnnotationAssertionsWithAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21123zv8ih() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11033);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11034);String input = "Prefix: o: <urn:test#>\nOntology: <urn:test>\n AnnotationProperty: o:bob\n Annotations:\n rdfs:label \"bob-label\"@en";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11035);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11036);OWLOntology o2 = roundTrip(o);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11037);equal(o, o2);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldRoundTrip() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2duwo878im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2duwo878im() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11038);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11039);IRI iri = IRI("http://protege.org/ontologies" + "#p");
        __CLR4_5_28ih8ihlvico1o0.R.inc(11040);OWLOntology ontology = m
                .createOntology(IRI("http://protege.org/ontologies"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11041);m.addAxiom(ontology, Declaration(DataProperty(iri)));
        // when
        __CLR4_5_28ih8ihlvico1o0.R.inc(11042);ontology = roundTrip(ontology);
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11043);assertTrue(ontology.containsDataPropertyInSignature(iri, EXCLUDED));
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldRenderCorrectly() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rptec58is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldRenderCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rptec58is() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11044);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11045);OWLObjectProperty prop = ObjectProperty(IRI("urn:test#p"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11046);OWLClass led = Class(IRI("urn:test#led"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11047);OWLClass crt = Class(IRI("urn:test#crt"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11048);OWLClass display = Class(IRI("urn:test#display"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11049);OWLOntology ontology = m
                .createOntology(IRI("http://protege.org/ontologies"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11050);OWLObjectSomeValuesFrom r = df.getOWLObjectSomeValuesFrom(prop,
                df.getOWLObjectUnionOf(led, crt));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11051);OWLSubClassOfAxiom axiom = df.getOWLSubClassOfAxiom(display, r);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11052);m.addAxiom(ontology, axiom);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11053);StringDocumentTarget target = saveOntology(ontology,
                new ManchesterSyntaxDocumentFormat());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11054);assertFalse(target.toString().contains(
                "((<urn:test#crt> or <urn:test#led>))"));
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldRoundtripDisjointUnion() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cer66e8j3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldRoundtripDisjointUnion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11055,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cer66e8j3() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11055);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11056);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11057);OWLClass a = Class(IRI("http://iri/#a"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11058);OWLClass b = Class(IRI("http://iri/#b"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11059);OWLClass c = Class(IRI("http://iri/#c"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11060);OWLClass d = Class(IRI("http://iri/#d"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11061);OWLDisjointUnionAxiom axiom = DisjointUnion(a, b, c, d);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11062);o.getOWLOntologyManager().addAxiom(o, axiom);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11063);o.getOWLOntologyManager().addAxiom(o, Declaration(a));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11064);o.getOWLOntologyManager().addAxiom(o, Declaration(b));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11065);o.getOWLOntologyManager().addAxiom(o, Declaration(c));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11066);o.getOWLOntologyManager().addAxiom(o, Declaration(d));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11067);OWLOntology roundtripped = roundTrip(o,
                new ManchesterSyntaxDocumentFormat());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11068);assertEquals(o.getAxioms(), roundtripped.getAxioms());
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test(expected = ParserException.class)
    public void testManSyntaxEditorParser() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2odf9gi8jh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,110,83,121,110,116,97,120,69,100,105,116,111,114,80,97,114,115,101,114,58,32,91,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.testManSyntaxEditorParser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2odf9gi8jh() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11069);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11070);String onto = "<?xml version=\"1.0\"?>"
                + "<!DOCTYPE rdf:RDF ["
                + "<!ENTITY vin  \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#\" >"
                + "<!ENTITY food \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#\" >"
                + "<!ENTITY owl  \"http://www.w3.org/2002/07/owl#\" >"
                + "<!ENTITY xsd  \"http://www.w3.org/2001/XMLSchema#\" >"
                + "]>"
                + "<rdf:RDF "
                + "xmlns     = \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#\" "
                + "xmlns:vin = \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#\" "
                + "xml:base  = \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#\" "
                + "xmlns:food= \"http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#\" "
                + "xmlns:owl = \"http://www.w3.org/2002/07/owl#\" "
                + "xmlns:rdf = \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" "
                + "xmlns:rdfs= \"http://www.w3.org/2000/01/rdf-schema#\" "
                + "xmlns:xsd = \"http://www.w3.org/2001/XMLSchema#\">"
                + "<owl:Ontology rdf:about=\"\"><rdfs:comment>An example OWL ontology</rdfs:comment>"
                + "<rdfs:label>Wine Ontology</rdfs:label></owl:Ontology>"
                + "<owl:Class rdf:ID=\"VintageYear\" />"
                + "<owl:DatatypeProperty rdf:ID=\"yearValue\"><rdfs:domain rdf:resource=\"#VintageYear\" />    <rdfs:range  rdf:resource=\"&xsd;positiveInteger\" />"
                + "</owl:DatatypeProperty></rdf:RDF>";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11071);String expression = "yearValue some ";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11072);OWLOntology wine = loadOntologyFromString(onto);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11073);Set<OWLOntology> ontologies = m.getOntologies();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11074);ShortFormProvider sfp = new ManchesterOWLSyntaxPrefixNameShortFormProvider(
                wine.getOWLOntologyManager().getOntologyFormat(wine));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11075);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                ontologies, sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11076);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11077);parser.setStringToParse(expression);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11078);parser.setDefaultOntology(wine);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11079);parser.setOWLEntityChecker(new ShortFormEntityChecker(shortFormProvider));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11080);parser.parseClassExpression();
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldParseRuleInManSyntax() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8nmv78jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldParseRuleInManSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8nmv78jt() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11081);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11082);String inputManSyntax = "Prefix: owl: <http://www.w3.org/2002/07/owl#>\n"
                + "Prefix: rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "Prefix: xml: <http://www.w3.org/XML/1998/namespace>\n"
                + "Prefix: xsd: <http://www.w3.org/2001/XMLSchema#>\n"
                + "Prefix: rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "Ontology: <http://www.owl-ontologies.com/Ontology1307394066.owl>\n"
                + "Datatype: xsd:decimal\n Datatype: xsd:int\n Datatype: xsd:dateTime\n"
                + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>\n Characteristics: \n Functional\n Range: \n xsd:int\n"
                + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasDate>\n Range: \n xsd:dateTime\n"
                + "Class: <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n"
                + "Individual: <http://www.owl-ontologies.com/Ontology1307394066.owl#p1>\n Types: \n <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n"
                + "Rule: \n xsd:decimal(?<urn:swrl#x>), <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>(?<urn:swrl#p>, ?<urn:swrl#x>) -> <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>(?<urn:swrl#p>)";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11083);OWLOntology o = loadOntologyFromString(inputManSyntax);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11084);OWLOntology o1 = roundTrip(o, new ManchesterSyntaxDocumentFormat());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11085);assertEquals(o.getLogicalAxioms(), o1.getLogicalAxioms());
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldParseRuleInManSimpleSyntax() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2knre3v8jy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldParseRuleInManSimpleSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2knre3v8jy() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11086);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11087);String inputManSyntax = "Prefix: owl: <http://www.w3.org/2002/07/owl#>\n"
                + "Prefix: rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
                + "Prefix: xml: <http://www.w3.org/XML/1998/namespace>\n"
                + "Prefix: xsd: <http://www.w3.org/2001/XMLSchema#>\n"
                + "Prefix: rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "Ontology: <http://www.owl-ontologies.com/Ontology1307394066.owl>\n"
                + "Datatype: xsd:decimal\n"
                + "Datatype: xsd:int\n"
                + "Datatype: xsd:dateTime\n"
                + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>\n"
                + "    Characteristics: \n"
                + "        Functional\n"
                + "    Range: \n"
                + "        xsd:int\n"
                + "DataProperty: <http://www.owl-ontologies.com/Ontology1307394066.owl#hasDate>\n"
                + "    Range: \n"
                + "        xsd:dateTime\n"
                + "Class: <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n"
                + "Individual: <http://www.owl-ontologies.com/Ontology1307394066.owl#p1>\n"
                + "    Types: \n"
                + "        <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>\n"
                + "Rule: \n"
                + "    xsd:decimal(?x), <http://www.owl-ontologies.com/Ontology1307394066.owl#hasAge>(?p, ?x) -> <http://www.owl-ontologies.com/Ontology1307394066.owl#Person>(?p)";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11088);OWLOntology o = loadOntologyFromString(inputManSyntax);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11089);OWLOntology o1 = roundTrip(o, new ManchesterSyntaxDocumentFormat());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11090);assertEquals(o.getLogicalAxioms(), o1.getLogicalAxioms());
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldAnnotateAndRoundTrip()
            throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fv8w9u8k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldAnnotateAndRoundTrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fv8w9u8k3() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11091);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11092);String input = "Prefix: : <http://example.com/owl/families/>\n"
                + "Ontology: <http://example.com/owl/families>\n"
                + "Class: Person\n Annotations:  rdfs:comment \"Represents the set of all people.\"\n"
                + "Class: Man\n Annotations: rdfs:comment \"States that every man is a person.\"\n SubClassOf:  Person";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11093);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11094);Set<OWLAxiom> axioms = o.getAxioms();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11095);OWLClass person = Class(IRI("http://example.com/owl/families/Person"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11096);OWLClass man = Class(IRI("http://example.com/owl/families/Man"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11097);assertTrue(axioms.contains(Declaration(person)));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11098);assertTrue(axioms.contains(Declaration(man)));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11099);assertTrue(axioms.contains(SubClassOf(man, person)));
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Nonnull
    public static final String NS = "http://protege.org/ontologies/Test.owl";
    @Nonnull
    OWLDataProperty p;
    @Nonnull
    OWLDatatype dateTime;

    @Before
    public void setUpPAndDateTime() {try{__CLR4_5_28ih8ihlvico1o0.R.inc(11100);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11101);p = DataProperty(IRI(NS + "#p"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11102);dateTime = df.getOWLDatatype(XSDVocabulary.DATE_TIME.getIRI());
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldParseCorrectly() throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24j09368kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldParseCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24j09368kf() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11103);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11104);OWLClass a = Class(IRI(NS + "#A"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11105);String text1 = "'GWAS study' and  has_publication_date some dateTime[< \"2009-01-01T00:00:00+00:00\"^^dateTime]";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11106);OWLClassExpression expected = df
                .getOWLObjectIntersectionOf(a, df
                        .getOWLDataSomeValuesFrom(p, df
                                .getOWLDatatypeRestriction(dateTime,
                                        OWLFacet.MAX_EXCLUSIVE,
                                        df.getOWLLiteral(
                                                "2009-01-01T00:00:00+00:00",
                                                dateTime))));
        // ontology creation including labels - this is the input ontology
        __CLR4_5_28ih8ihlvico1o0.R.inc(11107);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11108);m.addAxiom(o, df.getOWLDeclarationAxiom(a));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11109);m.addAxiom(o, df.getOWLDeclarationAxiom(p));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11110);m.addAxiom(o, df.getOWLDeclarationAxiom(dateTime));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11111);m.addAxiom(o, annotation(a, "'GWAS study'"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11112);m.addAxiom(o, annotation(p, "has_publication_date"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11113);m.addAxiom(o, annotation(dateTime, "dateTime"));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11114);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11115);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11116);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11117);parser.setStringToParse(text1);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11118);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11119);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11120);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11121);OWLClassExpression dsvf = parser.parseClassExpression();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11122);assertEquals(expected, dsvf);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Nonnull
    public OWLAxiom annotation(@Nonnull OWLEntity e, @Nonnull String s) {try{__CLR4_5_28ih8ihlvico1o0.R.inc(11123);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11124);return df.getOWLAnnotationAssertionAxiom(e.getIRI(),
                df.getOWLAnnotation(df.getRDFSLabel(), df.getOWLLiteral(s)));
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldDoPrecedenceWithParentheses()
            throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gdtwml8l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldDoPrecedenceWithParentheses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gdtwml8l1() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11125);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11126);OWLClass a = Class(IRI("urn:test#a"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11127);OWLClass b = Class(IRI("urn:test#b"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11128);OWLClass c = Class(IRI("urn:test#c"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11129);OWLClass d = Class(IRI("urn:test#all"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11130);String text1 = "(a and b) or c";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11131);OWLClassExpression expected = df.getOWLObjectUnionOf(
                df.getOWLObjectIntersectionOf(a, b), c);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11132);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11133);m.addAxiom(o, df.getOWLDeclarationAxiom(a));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11134);m.addAxiom(o, df.getOWLDeclarationAxiom(b));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11135);m.addAxiom(o, df.getOWLDeclarationAxiom(c));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11136);m.addAxiom(o, df.getOWLDeclarationAxiom(d));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11137);m.addAxiom(o, df.getOWLSubClassOfAxiom(expected, d));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11138);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11139);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11140);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11141);parser.setStringToParse(text1);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11142);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11143);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11144);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11145);OWLClassExpression dsvf = parser.parseClassExpression();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11146);assertEquals("Expected " + expected + " actual " + dsvf, expected, dsvf);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldParseCorrectlydecimal()
            throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28owilb8ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldParseCorrectlydecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28owilb8ln() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11147);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11148);String text1 = "p some decimal[<=2.0, >= 1.0]";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11149);OWLDatatype decimal = df.getOWLDatatype(OWL2Datatype.XSD_DECIMAL
                .getIRI());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11150);OWLFacetRestriction max = df.getOWLFacetRestriction(
                OWLFacet.MAX_INCLUSIVE, df.getOWLLiteral("2.0", decimal));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11151);OWLFacetRestriction min = df.getOWLFacetRestriction(
                OWLFacet.MIN_INCLUSIVE, df.getOWLLiteral("1.0", decimal));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11152);OWLClassExpression expected = df.getOWLDataSomeValuesFrom(p,
                df.getOWLDatatypeRestriction(decimal, max, min));
        // ontology creation including labels - this is the input ontology
        __CLR4_5_28ih8ihlvico1o0.R.inc(11153);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11154);m.addAxiom(o, df.getOWLDeclarationAxiom(p));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11155);m.addAxiom(o, df.getOWLDeclarationAxiom(decimal));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11156);m.addAxiom(o, annotation(p, "p"));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11157);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11158);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11159);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11160);parser.setStringToParse(text1);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11161);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11162);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11163);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11164);OWLClassExpression dsvf = parser.parseClassExpression();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11165);assertEquals(expected, dsvf);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldParseCorrectlydecimalNotSpecified()
            throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qr0nlq8m6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldParseCorrectlydecimalNotSpecified",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qr0nlq8m6() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11166);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11167);OWLAxiom expected = df.getOWLDataPropertyRangeAxiom(df
                .getOWLDataProperty(IRI.create("urn:a")), df.getOWLDataOneOf(df
                .getOWLLiteral("1.2", OWL2Datatype.XSD_DECIMAL)));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11168);String input = "Ontology:\n DataProperty: <urn:a>\n Range: {1.2}";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11169);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11170);Set<OWLLogicalAxiom> axioms = o.getLogicalAxioms();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11171);for (OWLLogicalAxiom ax : axioms) {{
            __CLR4_5_28ih8ihlvico1o0.R.inc(11172);assertEquals(expected, ax);
        }
    }}finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldDoPrecedenceWithoutParentheses()
            throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nomov58md();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldDoPrecedenceWithoutParentheses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nomov58md() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11173);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11174);OWLClass a = Class(IRI("urn:test#a"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11175);OWLClass b = Class(IRI("urn:test#b"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11176);OWLClass c = Class(IRI("urn:test#c"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11177);OWLClass d = Class(IRI("urn:test#all"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11178);String text1 = "a and b or c";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11179);OWLClassExpression expected = df.getOWLObjectUnionOf(
                df.getOWLObjectIntersectionOf(a, b), c);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11180);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11181);m.addAxiom(o, df.getOWLDeclarationAxiom(a));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11182);m.addAxiom(o, df.getOWLDeclarationAxiom(b));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11183);m.addAxiom(o, df.getOWLDeclarationAxiom(c));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11184);m.addAxiom(o, df.getOWLDeclarationAxiom(d));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11185);m.addAxiom(o, df.getOWLSubClassOfAxiom(expected, d));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11186);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11187);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11188);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11189);parser.setStringToParse(text1);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11190);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11191);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11192);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11193);OWLClassExpression dsvf = parser.parseClassExpression();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11194);assertEquals("Expected " + expected + " actual " + dsvf, expected, dsvf);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldNotFailOnAnnotations() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_261rhq8mz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldNotFailOnAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_261rhq8mz() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11195);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11196);String in = "Ontology(<http://x.org/>\n"
                + "Declaration(Class(<http://x.org/c>))\n"
                + "AnnotationAssertion(<http://x.org/p> <http://x.org/c> \"v1\")\n"
                + "AnnotationAssertion(<http://x.org/p> <http://x.org/c> \"orifice\")\n"
                + "AnnotationAssertion(Annotation(<http://x.org/p2> \"foo\") <http://x.org/p> <http://x.org/c> \"v1\"))";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11197);OWLOntology o = loadOntologyFromString(in);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11198);OWLOntology result = roundTrip(o, new ManchesterSyntaxDocumentFormat());
        __CLR4_5_28ih8ihlvico1o0.R.inc(11199);for (OWLAxiom ax : o.getAxioms()) {{
            assert (((ax != null)&&(__CLR4_5_28ih8ihlvico1o0.R.iget(11200)!=0|true))||(__CLR4_5_28ih8ihlvico1o0.R.iget(11201)==0&false));
            __CLR4_5_28ih8ihlvico1o0.R.inc(11202);assertTrue(result.containsAxiom(ax));
        }
    }}finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}

    @Test
    public void shouldNotFailSubclass() throws Exception {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1qapv8n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldNotFailSubclass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1qapv8n7() throws Exception{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11203);
        // given
        __CLR4_5_28ih8ihlvico1o0.R.inc(11204);OWLClass a = Class(IRI("urn:test#A"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11205);OWLClass b = Class(IRI("urn:test#B"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11206);String in = "A SubClassOf B";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11207);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11208);m.addAxiom(o, df.getOWLDeclarationAxiom(a));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11209);m.addAxiom(o, df.getOWLDeclarationAxiom(b));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11210);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11211);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11212);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11213);parser.setStringToParse(in);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11214);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11215);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11216);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11217);OWLAxiom axiom = parser.parseAxiom();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11218);assertEquals(df.getOWLSubClassOfAxiom(a, b), axiom);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}
    @Test
    public void shouldNotFailOWLReal() throws OWLOntologyCreationException {__CLR4_5_28ih8ihlvico1o0.R.globalSliceStart(getClass().getName(),11219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fxibij8nn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28ih8ihlvico1o0.R.rethrow($CLV_t2$);}finally{__CLR4_5_28ih8ihlvico1o0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterOWLSyntaxParserTestCase.shouldNotFailOWLReal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fxibij8nn() throws OWLOntologyCreationException{try{__CLR4_5_28ih8ihlvico1o0.R.inc(11219);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11220);OWLDataProperty p = DataProperty(IRI("urn:test#name"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11221);OWLClass b = Class(IRI("urn:test#B"));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11222);String in = "name max 1 owl:real";
        __CLR4_5_28ih8ihlvico1o0.R.inc(11223);OWLOntology o = m.createOntology();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11224);m.addAxiom(o, df.getOWLDeclarationAxiom(p));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11225);m.addAxiom(o, df.getOWLDeclarationAxiom(b));
        // select a short form provider that uses annotations
        __CLR4_5_28ih8ihlvico1o0.R.inc(11226);ShortFormProvider sfp = new AnnotationValueShortFormProvider(
                Arrays.asList(df.getRDFSLabel()),
                Collections.<OWLAnnotationProperty, List<String>> emptyMap(), m);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11227);BidirectionalShortFormProvider shortFormProvider = new BidirectionalShortFormProviderAdapter(
                m.getOntologies(), sfp);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11228);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28ih8ihlvico1o0.R.inc(11229);parser.setStringToParse(in);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11230);ShortFormEntityChecker owlEntityChecker = new ShortFormEntityChecker(
                shortFormProvider);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11231);parser.setOWLEntityChecker(owlEntityChecker);
        __CLR4_5_28ih8ihlvico1o0.R.inc(11232);parser.setDefaultOntology(o);
        // when
        // finally parse
        __CLR4_5_28ih8ihlvico1o0.R.inc(11233);OWLClassExpression expected=df.getOWLDataMaxCardinality(1, p, OWL2Datatype.OWL_REAL.getDatatype(df));
        __CLR4_5_28ih8ihlvico1o0.R.inc(11234);OWLClassExpression cl = parser.parseClassExpression();
        // then
        __CLR4_5_28ih8ihlvico1o0.R.inc(11235);assertEquals(cl, expected);
    }finally{__CLR4_5_28ih8ihlvico1o0.R.flushNeeded();}}
}
