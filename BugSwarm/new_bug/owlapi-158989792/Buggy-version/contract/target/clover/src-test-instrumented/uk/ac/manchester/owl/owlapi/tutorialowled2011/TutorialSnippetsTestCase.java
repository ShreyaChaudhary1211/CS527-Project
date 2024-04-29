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
package uk.ac.manchester.owl.owlapi.tutorialowled2011;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.search.EntitySearcher.getAnnotationObjects;
import static org.semanticweb.owlapi.search.Searcher.annotationObjects;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.*;

import javax.annotation.Nonnull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileReport;
import org.semanticweb.owlapi.profiles.OWLProfileViolation;
import org.semanticweb.owlapi.reasoner.*;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import org.semanticweb.owlapi.util.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.manchester.cs.owlapi.modularity.ModuleType;
import uk.ac.manchester.cs.owlapi.modularity.SyntacticLocalityModuleExtractor;

@SuppressWarnings({ "javadoc" })
public class TutorialSnippetsTestCase {static class __CLR4_5_2bz1bz1lvico2hm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    @Nonnull
    private static final Logger LOG = LoggerFactory.getLogger(TutorialSnippetsTestCase.class);
    @Nonnull
    private static final String KOALA = "<?xml version=\"1.0\"?>\n"
        + "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\""
        + " xmlns=\"http://protege.stanford.edu/plugins/owl/owl-library/koala.owl#\" xml:base=\"http://protege.stanford.edu/plugins/owl/owl-library/koala.owl\">\n"
        + "  <owl:Ontology rdf:about=\"\"/>\n"
        + "  <owl:Class rdf:ID=\"Female\"><owl:equivalentClass><owl:Restriction><owl:onProperty><owl:FunctionalProperty rdf:about=\"#hasGender\"/></owl:onProperty><owl:hasValue><Gender rdf:ID=\"female\"/></owl:hasValue></owl:Restriction></owl:equivalentClass></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Marsupials\"><owl:disjointWith><owl:Class rdf:about=\"#Person\"/></owl:disjointWith><rdfs:subClassOf><owl:Class rdf:about=\"#Animal\"/></rdfs:subClassOf></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Student\"><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Class rdf:about=\"#Person\"/><owl:Restriction><owl:onProperty><owl:FunctionalProperty rdf:about=\"#isHardWorking\"/></owl:onProperty><owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasValue></owl:Restriction><owl:Restriction><owl:someValuesFrom><owl:Class rdf:about=\"#University\"/></owl:someValuesFrom><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasHabitat\"/></owl:onProperty></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"KoalaWithPhD\"><owl:versionInfo>1.2</owl:versionInfo><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Restriction><owl:hasValue><Degree rdf:ID=\"PhD\"/></owl:hasValue><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasDegree\"/></owl:onProperty></owl:Restriction><owl:Class rdf:about=\"#Koala\"/></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"University\"><rdfs:subClassOf><owl:Class rdf:ID=\"Habitat\"/></rdfs:subClassOf></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Koala\"><rdfs:subClassOf><owl:Restriction><owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">false</owl:hasValue><owl:onProperty><owl:FunctionalProperty rdf:about=\"#isHardWorking\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:someValuesFrom><owl:Class rdf:about=\"#DryEucalyptForest\"/></owl:someValuesFrom><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasHabitat\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf rdf:resource=\"#Marsupials\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Animal\"><rdfs:seeAlso>Male</rdfs:seeAlso><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasHabitat\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#int\">1</owl:minCardinality></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf><owl:Restriction><owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#int\">1</owl:cardinality><owl:onProperty><owl:FunctionalProperty rdf:about=\"#hasGender\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf><owl:versionInfo>1.1</owl:versionInfo></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Forest\"><rdfs:subClassOf rdf:resource=\"#Habitat\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Rainforest\"><rdfs:subClassOf rdf:resource=\"#Forest\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"GraduateStudent\"><rdfs:subClassOf><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasDegree\"/></owl:onProperty><owl:someValuesFrom><owl:Class><owl:oneOf rdf:parseType=\"Collection\"><Degree rdf:ID=\"BA\"/><Degree rdf:ID=\"BS\"/></owl:oneOf></owl:Class></owl:someValuesFrom></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf rdf:resource=\"#Student\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Parent\"><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Class rdf:about=\"#Animal\"/><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasChildren\"/></owl:onProperty><owl:minCardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#int\">1</owl:minCardinality></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass><rdfs:subClassOf rdf:resource=\"#Animal\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"DryEucalyptForest\"><rdfs:subClassOf rdf:resource=\"#Forest\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Quokka\"><rdfs:subClassOf><owl:Restriction><owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasValue><owl:onProperty><owl:FunctionalProperty rdf:about=\"#isHardWorking\"/></owl:onProperty></owl:Restriction></rdfs:subClassOf><rdfs:subClassOf rdf:resource=\"#Marsupials\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"TasmanianDevil\"><rdfs:subClassOf rdf:resource=\"#Marsupials\"/></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"MaleStudentWith3Daughters\"><owl:equivalentClass><owl:Class><owl:intersectionOf rdf:parseType=\"Collection\"><owl:Class rdf:about=\"#Student\"/><owl:Restriction><owl:onProperty><owl:FunctionalProperty rdf:about=\"#hasGender\"/></owl:onProperty><owl:hasValue><Gender rdf:ID=\"male\"/></owl:hasValue></owl:Restriction><owl:Restriction><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasChildren\"/></owl:onProperty><owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#int\">3</owl:cardinality></owl:Restriction><owl:Restriction><owl:allValuesFrom rdf:resource=\"#Female\"/><owl:onProperty><owl:ObjectProperty rdf:about=\"#hasChildren\"/></owl:onProperty></owl:Restriction></owl:intersectionOf></owl:Class></owl:equivalentClass></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Degree\"/>\n  <owl:Class rdf:ID=\"Gender\"/>\n"
        + "  <owl:Class rdf:ID=\"Male\"><owl:equivalentClass><owl:Restriction><owl:hasValue rdf:resource=\"#male\"/><owl:onProperty><owl:FunctionalProperty rdf:about=\"#hasGender\"/></owl:onProperty></owl:Restriction></owl:equivalentClass></owl:Class>\n"
        + "  <owl:Class rdf:ID=\"Person\"><rdfs:subClassOf rdf:resource=\"#Animal\"/><owl:disjointWith rdf:resource=\"#Marsupials\"/></owl:Class>\n"
        + "  <owl:ObjectProperty rdf:ID=\"hasHabitat\"><rdfs:range rdf:resource=\"#Habitat\"/><rdfs:domain rdf:resource=\"#Animal\"/></owl:ObjectProperty>\n"
        + "  <owl:ObjectProperty rdf:ID=\"hasDegree\"><rdfs:domain rdf:resource=\"#Person\"/><rdfs:range rdf:resource=\"#Degree\"/></owl:ObjectProperty>\n"
        + "  <owl:ObjectProperty rdf:ID=\"hasChildren\"><rdfs:range rdf:resource=\"#Animal\"/><rdfs:domain rdf:resource=\"#Animal\"/></owl:ObjectProperty>\n"
        + "  <owl:FunctionalProperty rdf:ID=\"hasGender\"><rdfs:range rdf:resource=\"#Gender\"/><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#ObjectProperty\"/><rdfs:domain rdf:resource=\"#Animal\"/></owl:FunctionalProperty>\n"
        + "  <owl:FunctionalProperty rdf:ID=\"isHardWorking\"><rdfs:range rdf:resource=\"http://www.w3.org/2001/XMLSchema#boolean\"/><rdfs:domain rdf:resource=\"#Person\"/><rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#DatatypeProperty\"/></owl:FunctionalProperty>\n"
        + "  <Degree rdf:ID=\"MA\"/>\n</rdf:RDF>";
    @Nonnull
    public static final IRI KOALA_IRI = IRI.create("http://protege.stanford.edu/plugins/owl/owl-library/koala.owl");
    @Nonnull
    public static final IRI EXAMPLE_IRI = IRI.create("http://www.semanticweb.org/ontologies/ont.owl");
    @Nonnull
    public static final IRI EXAMPLE_SAVE_IRI = IRI.create("file:materializedOntologies/ont1290535967123.owl");
    @Nonnull
    OWLDataFactory df = OWLManager.getOWLDataFactory();
    @Nonnull
    OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();

    @Nonnull
    public OWLOntologyManager create() {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15517);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15518);OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15519);PriorityCollection<OWLOntologyIRIMapper> iriMappers = m.getIRIMappers();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15520);iriMappers.add(new AutoIRIMapper(new File("materializedOntologies"), true));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15521);return m;
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Nonnull
    private static OWLOntology loadPizzaOntology(@Nonnull OWLOntologyManager m) throws OWLOntologyCreationException {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15522);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15523);return m.loadOntologyFromOntologyDocument(new StringDocumentSource(KOALA));
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testOntologyLoading() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w7ut42bz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testOntologyLoading",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w7ut42bz8() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15524);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15525);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15526);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15527);assertNotNull(o);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testOntologyLoadingFromStringSource() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dbcne0bzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testOntologyLoadingFromStringSource",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dbcne0bzc() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15528);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15529);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15530);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15531);assertNotNull(o);
        // save an ontology to a document target which holds all data in memory
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15532);StringDocumentTarget target = new StringDocumentTarget();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15533);m.saveOntology(o, target);
        // remove the ontology from the manager, so it can be loaded again
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15534);m.removeOntology(o);
        // create a document source from a string
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15535);StringDocumentSource documentSource = new StringDocumentSource(target);
        // load the ontology from a document source
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15536);OWLOntology o2 = m.loadOntologyFromOntologyDocument(documentSource);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15537);assertNotNull(o2);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testOntologyCreation() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26l6kw7bzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testOntologyCreation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26l6kw7bzm() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15538);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15539);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15540);OWLOntology o = m.createOntology(EXAMPLE_IRI);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15541);assertNotNull(o);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testShowClasses() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7x0rmbzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testShowClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7x0rmbzq() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15542);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15543);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15544);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15545);assertNotNull(o);
        // These are the named classes referenced by axioms in the ontology.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15546);for (OWLClass cls : o.getClassesInSignature()) {{
            // use the class for whatever purpose
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15547);assertNotNull(cls);
        }
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testSaveOntology() throws Exception {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkmndnbzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testSaveOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkmndnbzw() throws Exception{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15548);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15549);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15550);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15551);assertNotNull(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15552);File output = temporaryFolder.newFile("saved_pizza.owl");
        // Output will be deleted on exit; to keep temporary file replace
        // previous line with the following
        // File output = File.createTempFile("saved_pizza", ".owl");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15553);IRI documentIRI2 = IRI.create(output);
        // save in OWL/XML format
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15554);m.saveOntology(o, new OWLXMLDocumentFormat(), documentIRI2);
        // save in RDF/XML
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15555);m.saveOntology(o, documentIRI2);
        // print out the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15556);StringDocumentTarget target = new StringDocumentTarget();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15557);m.saveOntology(o, target);
        // Remove the ontology from the manager
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15558);m.removeOntology(o);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testIRIMapper() throws Exception {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bcaq2c07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testIRIMapper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bcaq2c07() throws Exception{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15559);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15560);OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        // map the ontology IRI to a physical IRI (files for example)
        // Create the document IRI for our ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15561);File output = temporaryFolder.newFile("saved_pizza.owl");
        // Output will be deleted on exit; to keep temporary file replace
        // previous line with the following
        // File output = File.createTempFile("saved_pizza", ".owl");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15562);IRI documentIRI = IRI.create(output);
        // Set up a mapping, which maps the ontology to the document IRI
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15563);SimpleIRIMapper mapper = new SimpleIRIMapper(EXAMPLE_SAVE_IRI, documentIRI);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15564);m.getIRIMappers().add(mapper);
        // set up a mapper to read local copies of ontologies
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15565);File localFolder = new File("materializedOntologies");
        // the manager will look up an ontology IRI by checking
        // localFolder first for a local copy, checking its subfolders as well
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15566);m.getIRIMappers().add(new AutoIRIMapper(localFolder, true));
        // Create the ontology - we use the ontology IRI (not the physical URI)
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15567);OWLOntology o = m.createOntology(EXAMPLE_SAVE_IRI);
        // save the ontology to its physical location - documentIRI
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15568);m.saveOntology(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15569);assertNotNull(o);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testAddAxioms() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdes9lc0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testAddAxioms",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdes9lc0i() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15570);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15571);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15572);OWLOntology o = m.createOntology(KOALA_IRI);
        // class A and class B
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15573);OWLClass clsA = df.getOWLClass(IRI.create(KOALA_IRI + "#A"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15574);OWLClass clsB = df.getOWLClass(IRI.create(KOALA_IRI + "#B"));
        // Now create the axiom
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15575);OWLAxiom axiom = df.getOWLSubClassOfAxiom(clsA, clsB);
        // add the axiom to the ontology.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15576);AddAxiom addAxiom = new AddAxiom(o, axiom);
        // We now use the manager to apply the change
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15577);m.applyChange(addAxiom);
        // remove the axiom from the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15578);RemoveAxiom removeAxiom = new RemoveAxiom(o, axiom);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15579);m.applyChange(removeAxiom);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testAssertedSuperclasses() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yl0lbrc0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testAssertedSuperclasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yl0lbrc0s() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15580);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15581);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15582);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15583);OWLClass quokkaCls = df.getOWLClass(IRI.create(KOALA_IRI + "#Quokka"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15584);Collection<OWLSubClassOfAxiom> classes = o.getSubClassAxiomsForSubClass(quokkaCls);
        // for each superclass there will be a corresponding axiom
        // the ontology indexes axioms in a variety of ways
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15585);assertEquals(2, classes.size());
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testSWRL() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g34xahc0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testSWRL",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15586,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g34xahc0y() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15586);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15587);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15588);OWLOntology o = m.createOntology(EXAMPLE_IRI);
        // Get hold of references to class A and class B.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15589);OWLClass clsA = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#A"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15590);OWLClass clsB = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#B"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15591);SWRLVariable var = df.getSWRLVariable(IRI.create(EXAMPLE_IRI + "#x"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15592);Set<SWRLClassAtom> body = Collections.singleton(df.getSWRLClassAtom(clsA, var));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15593);Set<SWRLClassAtom> head = Collections.singleton(df.getSWRLClassAtom(clsB, var));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15594);SWRLRule rule = df.getSWRLRule(body, head);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15595);m.applyChange(new AddAxiom(o, rule));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15596);OWLObjectProperty prop = df.getOWLObjectProperty(IRI.create(EXAMPLE_IRI + "#propA"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15597);OWLObjectProperty propB = df.getOWLObjectProperty(IRI.create(EXAMPLE_IRI + "#propB"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15598);SWRLObjectPropertyAtom propAtom = df.getSWRLObjectPropertyAtom(prop, var, var);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15599);SWRLObjectPropertyAtom propAtom2 = df.getSWRLObjectPropertyAtom(propB, var, var);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15600);Set<SWRLAtom> antecedent = new HashSet<>();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15601);antecedent.add(propAtom);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15602);antecedent.add(propAtom2);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15603);SWRLRule rule2 = df.getSWRLRule(antecedent, Collections.singleton(propAtom));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15604);m.applyChange(new AddAxiom(o, rule2));
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testIndividualAssertions() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nppczc1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testIndividualAssertions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nppczc1h() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15605);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15606);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15607);OWLOntology o = m.createOntology(EXAMPLE_IRI);
        // We want to state that matthew has a father who is peter.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15608);OWLIndividual matthew = df.getOWLNamedIndividual(IRI.create(EXAMPLE_IRI + "#matthew"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15609);OWLIndividual peter = df.getOWLNamedIndividual(IRI.create(EXAMPLE_IRI + "#peter"));
        // We need the hasFather property
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15610);OWLObjectProperty hasFather = df.getOWLObjectProperty(IRI.create(EXAMPLE_IRI + "#hasFather"));
        // matthew --> hasFather --> peter
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15611);OWLObjectPropertyAssertionAxiom assertion = df.getOWLObjectPropertyAssertionAxiom(hasFather, matthew, peter);
        // Finally, add the axiom to our ontology and save
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15612);AddAxiom addAxiomChange = new AddAxiom(o, assertion);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15613);m.applyChange(addAxiomChange);
        // matthew is an instance of Person
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15614);OWLClass personClass = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#Person"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15615);OWLClassAssertionAxiom ax = df.getOWLClassAssertionAxiom(personClass, matthew);
        // Add this axiom to our ontology - with a convenience method
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15616);m.addAxiom(o, ax);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testDelete() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yilj0cc1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testDelete",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yilj0cc1t() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15617);
        // Delete individuals representing countries
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15618);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15619);OWLOntology o = loadPizzaOntology(m);
        // Ontologies don't directly contain entities but axioms
        // OWLEntityRemover will remove an entity (class, property or
        // individual)
        // from a set of ontologies by removing all referencing axioms
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15620);OWLEntityRemover remover = new OWLEntityRemover(Collections.singleton(o));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15621);int previousNumberOfIndividuals = o.getIndividualsInSignature().size();
        // Visit all individuals with the remover
        // Changes needed for removal will be prepared
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15622);for (OWLNamedIndividual ind : o.getIndividualsInSignature()) {{
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15623);ind.accept(remover);
        }
        // Now apply the changes
        }__CLR4_5_2bz1bz1lvico2hm.R.inc(15624);m.applyChanges(remover.getChanges());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15625);int size = o.getIndividualsInSignature().size();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15626);assertTrue(previousNumberOfIndividuals + " supposed to be larger than " + size,
            previousNumberOfIndividuals > size);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testAddSomeRestriction() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29tvy5sc23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testAddSomeRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29tvy5sc23() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15627);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15628);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15629);OWLOntology o = m.createOntology(EXAMPLE_IRI);
        // all Heads have parts that are noses (at least one)
        // We do this by creating an existential (some) restriction
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15630);OWLObjectProperty hasPart = df.getOWLObjectProperty(IRI.create(EXAMPLE_IRI + "#hasPart"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15631);OWLClass nose = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#Nose"));
        // Now let's describe the class of individuals that have at
        // least one part that is a kind of nose
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15632);OWLClassExpression hasPartSomeNose = df.getOWLObjectSomeValuesFrom(hasPart, nose);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15633);OWLClass head = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#Head"));
        // Head subclass of our restriction
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15634);OWLSubClassOfAxiom ax = df.getOWLSubClassOfAxiom(head, hasPartSomeNose);
        // Add the axiom to our ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15635);AddAxiom addAx = new AddAxiom(o, ax);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15636);m.applyChange(addAx);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testDatatypeRestriction() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25vvsirc2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testDatatypeRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25vvsirc2d() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15637);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15638);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15639);OWLOntology o = m.createOntology(EXAMPLE_IRI);
        // Adults have an age greater than 18.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15640);OWLDataProperty hasAge = df.getOWLDataProperty(IRI.create(EXAMPLE_IRI + "hasAge"));
        // Create the restricted data range by applying the facet restriction
        // with a value of 18 to int
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15641);OWLDataRange greaterThan18 = df.getOWLDatatypeRestriction(df.getIntegerOWLDatatype(), OWLFacet.MIN_INCLUSIVE, df
            .getOWLLiteral(18));
        // Now we can use this in our datatype restriction on hasAge
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15642);OWLClassExpression adultDefinition = df.getOWLDataSomeValuesFrom(hasAge, greaterThan18);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15643);OWLClass adult = df.getOWLClass(IRI.create(EXAMPLE_IRI + "#Adult"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15644);OWLSubClassOfAxiom ax = df.getOWLSubClassOfAxiom(adult, adultDefinition);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15645);m.applyChange(new AddAxiom(o, ax));
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testUnsatisfiableClasses() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289izg5c2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testUnsatisfiableClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289izg5c2m() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15646);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15647);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15648);OWLOntology o = loadPizzaOntology(m);
        // Create a console progress monitor. This will print the reasoner
        // progress out to the console.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15649);ReasonerProgressMonitor progressMonitor = new LoggingReasonerProgressMonitor(LOG, "testUnsatisfiableClasses");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15650);OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor);
        // Create a reasoner that will reason over our ontology and its imports
        // closure. Pass in the configuration.
        // not using it in tests, we don't need the output
        // OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15651);OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        // Ask the reasoner to precompute some inferences
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15652);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        // We can determine if the ontology is actually consistent (in this
        // case, it should be).
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15653);assertTrue(reasoner.isConsistent());
        // get a list of unsatisfiable classes
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15654);Node<OWLClass> bottomNode = reasoner.getUnsatisfiableClasses();
        // leave owl:Nothing out
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15655);Set<OWLClass> unsatisfiable = bottomNode.getEntitiesMinusBottom();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15656);if ((((!unsatisfiable.isEmpty())&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15657)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15658)==0&false))) {{
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15659);for (OWLClass cls : unsatisfiable) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15660);assertNotNull(cls);
                // deal with unsatisfiable classes
            }
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testDescendants() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzjllhc31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testDescendants",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzjllhc31() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15661);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15662);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15663);OWLOntology o = loadPizzaOntology(m);
        // Create a console progress monitor. This will print the reasoner
        // progress out to the console.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15664);ReasonerProgressMonitor progressMonitor = new LoggingReasonerProgressMonitor(LOG, "testDescendants");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15665);OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor);
        // Create a reasoner that will reason over our ontology and its imports
        // closure. Pass in the configuration.
        // not using it in tests, we don't need the output
        // OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15666);OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        // Ask the reasoner to precompute some inferences
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15667);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        // Look up and print all direct subclasses for all classes
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15668);for (OWLClass c : o.getClassesInSignature()) {{
            assert (((c != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15669)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15670)==0&false));
            // the boolean argument specifies direct subclasses; false would
            // specify all subclasses
            // a NodeSet represents a set of Nodes.
            // a Node represents a set of equivalent classes
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15671);NodeSet<OWLClass> subClasses = reasoner.getSubClasses(c, true);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15672);for (OWLClass subClass : subClasses.getFlattened()) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15673);assertNotNull(subClass);
                // process all subclasses no matter what node they're in
            }
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testPetInstances() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2feh98oc3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testPetInstances",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2feh98oc3e() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15674);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15675);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15676);OWLOntology o = loadPizzaOntology(m);
        // Create a console progress monitor. This will print the reasoner
        // progress out to the console.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15677);ReasonerProgressMonitor progressMonitor = new LoggingReasonerProgressMonitor(LOG, "testPetInstances");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15678);OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor);
        // Create a reasoner that will reason over our ontology and its imports
        // closure. Pass in the configuration.
        // not using it in tests, we don't need the output
        // OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15679);OWLReasoner reasoner = reasonerFactory.createReasoner(o, config);
        // Ask the reasoner to precompute some inferences
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15680);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        // for each class, look up the instances
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15681);for (OWLClass c : o.getClassesInSignature()) {{
            assert (((c != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15682)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15683)==0&false));
            // the boolean argument specifies direct subclasses; false would
            // specify all subclasses
            // a NodeSet represents a set of Nodes.
            // a Node represents a set of equivalent classes/or sameAs
            // individuals
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15684);NodeSet<OWLNamedIndividual> instances = reasoner.getInstances(c, true);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15685);for (OWLNamedIndividual i : instances.getFlattened()) {{
                assert (((i != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15686)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15687)==0&false));
                // look up all property assertions
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15688);for (OWLObjectProperty op : o.getObjectPropertiesInSignature()) {{
                    assert (((op != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15689)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15690)==0&false));
                    __CLR4_5_2bz1bz1lvico2hm.R.inc(15691);NodeSet<OWLNamedIndividual> petValuesNodeSet = reasoner.getObjectPropertyValues(i, op);
                    __CLR4_5_2bz1bz1lvico2hm.R.inc(15692);for (OWLNamedIndividual value : petValuesNodeSet.getFlattened()) {{
                        __CLR4_5_2bz1bz1lvico2hm.R.inc(15693);assertNotNull(value);
                        // use the value individuals
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testLookupRestrictions() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqbpwac3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testLookupRestrictions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqbpwac3y() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15694);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15695);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15696);OWLOntology o = loadPizzaOntology(m);
        // We want to examine the restrictions on all classes.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15697);for (OWLClass c : o.getClassesInSignature()) {{
            assert (((c != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15698)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15699)==0&false));
            // collect the properties which are used in existential restrictions
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15700);RestrictionVisitor visitor = new RestrictionVisitor(Collections.singleton(o));
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15701);for (OWLSubClassOfAxiom ax : o.getSubClassAxiomsForSubClass(c)) {{
                // Ask our superclass to accept a visit from the
                // RestrictionVisitor
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15702);ax.getSuperClass().accept(visitor);
            }
            // Our RestrictionVisitor has now collected all of the properties
            // that have been restricted in existential
            // restrictions - print them out.
            }__CLR4_5_2bz1bz1lvico2hm.R.inc(15703);Set<OWLObjectPropertyExpression> restrictedProperties = visitor.getRestrictedProperties();
            // System.out.println("Restricted properties for " + labelFor(c, o)
            // + ": " + restrictedProperties.size());
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15704);for (OWLObjectPropertyExpression prop : restrictedProperties) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15705);assertNotNull(prop);
                // System.out.println(" " + prop);
            }
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    /**
     * Visits existential restrictions and collects the properties which are
     * restricted
     */
    private static class RestrictionVisitor extends OWLClassExpressionVisitorAdapter {

        @Nonnull
        private final Set<OWLClass> processedClasses;
        @Nonnull
        private final Set<OWLObjectPropertyExpression> restrictedProperties;
        private final Set<OWLOntology> onts;

        RestrictionVisitor(Set<OWLOntology> onts) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15706);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15707);restrictedProperties = new HashSet<>();
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15708);processedClasses = new HashSet<>();
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15709);this.onts = onts;
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Nonnull
        public Set<OWLObjectPropertyExpression> getRestrictedProperties() {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15710);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15711);return restrictedProperties;
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15712);
            // avoid cycles
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15713);if ((((!processedClasses.contains(ce))&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15714)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15715)==0&false))) {{
                // If we are processing inherited restrictions then
                // we recursively visit named supers.
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15716);processedClasses.add(ce);
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15717);for (OWLOntology ont : onts) {{
                    __CLR4_5_2bz1bz1lvico2hm.R.inc(15718);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(ce)) {{
                        __CLR4_5_2bz1bz1lvico2hm.R.inc(15719);ax.getSuperClass().accept(this);
                    }
                }}
            }}
        }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15720);
            // This method gets called when a class expression is an
            // existential (someValuesFrom) restriction and it asks us to visit
            // it
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15721);restrictedProperties.add(ce.getProperty());
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}
    }

    @Test
    public void testComment() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dikgksc4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testComment",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dikgksc4q() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15722);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15723);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15724);OWLOntology o = loadPizzaOntology(m);
        // We want to add a comment to the pizza class.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15725);OWLClass quokkaCls = df.getOWLClass(IRI.create(KOALA_IRI + "#Quokka"));
        // the content of our comment: a string and a language tag
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15726);OWLAnnotation commentAnno = df.getOWLAnnotation(df.getRDFSComment(), df.getOWLLiteral(
            "A class which represents Quokkas", "en"));
        // Specify that the pizza class has an annotation
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15727);OWLAxiom ax = df.getOWLAnnotationAssertionAxiom(quokkaCls.getIRI(), commentAnno);
        // Add the axiom to the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15728);m.applyChange(new AddAxiom(o, ax));
        // add a version info annotation to the ontology
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testVersionInfo() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gmlkslc4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testVersionInfo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gmlkslc4x() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15729);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15730);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15731);OWLOntology o = loadPizzaOntology(m);
        // We want to add a comment to the pizza class.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15732);OWLLiteral lit = df.getOWLLiteral("Added a comment to the pizza class");
        // create an annotation to pair a URI with the constant
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15733);OWLAnnotationProperty owlAnnotationProperty = df.getOWLAnnotationProperty(OWLRDFVocabulary.OWL_VERSION_INFO
            .getIRI());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15734);OWLAnnotation anno = df.getOWLAnnotation(owlAnnotationProperty, lit);
        // Now we can add this as an ontology annotation
        // Apply the change in the usual way
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15735);m.applyChange(new AddOntologyAnnotation(o, anno));
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testReadAnnotations() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ir2id9c54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testReadAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ir2id9c54() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15736);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15737);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15738);OWLOntology o = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15739);for (OWLClass cls : o.getClassesInSignature()) {{
            // Get the annotations on the class that use the label property
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15740);for (OWLAnnotation annotation : annotationObjects(o.getAnnotationAssertionAxioms(cls.getIRI()), df
                .getRDFSLabel())) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15741);if ((((annotation.getValue() instanceof OWLLiteral)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15742)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15743)==0&false))) {{
                    __CLR4_5_2bz1bz1lvico2hm.R.inc(15744);OWLLiteral val = (OWLLiteral) annotation.getValue();
                    // look for portuguese labels
                    __CLR4_5_2bz1bz1lvico2hm.R.inc(15745);if ((((val.hasLang("pt"))&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15746)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15747)==0&false))) {{
                        __CLR4_5_2bz1bz1lvico2hm.R.inc(15748);assertNotNull(val.getLiteral());
                        // System.out.println(cls + " labelled " +
                        // val.getLiteral());
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testInferredOntology() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkj8glc5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testInferredOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkj8glc5h() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15749);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15750);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15751);OWLOntology o = loadPizzaOntology(m);
        // Create the reasoner and classify the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15752);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15753);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        // To generate an inferred ontology, use implementations of inferred
        // axiom generators
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15754);List<InferredAxiomGenerator<? extends OWLAxiom>> gens = new ArrayList<>();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15755);gens.add(new InferredSubClassAxiomGenerator());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15756);OWLOntology infOnt = m.createOntology();
        // create the inferred ontology generator
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15757);InferredOntologyGenerator iog = new InferredOntologyGenerator(reasoner, gens);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15758);iog.fillOntology(m.getOWLDataFactory(), infOnt);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testMergedOntology() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21xfnwc5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testMergedOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21xfnwc5r() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15759);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15760);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15761);OWLOntology o1 = loadPizzaOntology(m);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15762);OWLOntology o2 = m.createOntology(EXAMPLE_IRI);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15763);m.addAxiom(o2, df.getOWLDeclarationAxiom(df.getOWLClass(IRI.create(EXAMPLE_IRI + "#Weasel"))));
        // Create our ontology merger
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15764);OWLOntologyMerger merger = new OWLOntologyMerger(m);
        // We merge all of the loaded ontologies. Since an OWLOntologyManager is
        // an OWLOntologySetProvider we
        // just pass this in. We also need to specify the URI of the new
        // ontology that will be created.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15765);IRI mergedOntologyIRI = IRI.create("http://www.semanticweb.com/mymergedont");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15766);OWLOntology merged = merger.createMergedOntology(m, mergedOntologyIRI);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15767);assertTrue(merged.getAxiomCount() > o1.getAxiomCount());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15768);assertTrue(merged.getAxiomCount() > o2.getAxiomCount());
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testOntologyWalker() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xvm5fmc61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testOntologyWalker",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xvm5fmc61() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15769);
        // How to use an ontology walker to walk the asserted structure of an
        // ontology.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15770);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15771);OWLOntology o = loadPizzaOntology(m);
        // Create the walker
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15772);OWLOntologyWalker walker = new OWLOntologyWalker(Collections.singleton(o));
        // Now ask our walker to walk over the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15773);OWLOntologyWalkerVisitorEx<Object> visitor = new OWLOntologyWalkerVisitorEx<Object>(walker) {

            @Override
            public Object visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15774);
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15775);assertNotNull(ce);
                // Print out the restriction
                // System.out.println(desc);
                // Print out the axiom where the restriction is used
                // System.out.println(" " + getCurrentAxiom());
                // System.out.println();
                // We don't need to return anything here.
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15776);return "";
            }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}
        };
        // Now ask the walker to walk over the ontology structure using our
        // visitor instance.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15777);walker.walkStructure(visitor);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testMargherita() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2astuvxc6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testMargherita",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2astuvxc6a() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15778);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15779);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15780);OWLOntology o = loadPizzaOntology(m);
        // For this particular ontology, we know that all class, properties
        // names etc. have
        // URIs that is made up of the ontology IRI plus # plus the local name
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15781);String prefix = KOALA_IRI + "#";
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15782);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(o);
        // Now we can query the reasoner, suppose we want to determine the
        // properties that
        // instances of Margherita pizza must have
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15783);OWLClass margherita = df.getOWLClass(IRI.create(prefix + "Margherita"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15784);printProperties(o, reasoner, margherita);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    /**
     * Prints out the properties that instances of a class expression must have
     * 
     * @param o
     *        The ontology
     * @param reasoner
     *        The reasoner
     * @param cls
     *        The class expression
     */
    private void printProperties(@Nonnull OWLOntology o, @Nonnull OWLReasoner reasoner, OWLClass cls) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15785);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15786);for (OWLObjectPropertyExpression prop : o.getObjectPropertiesInSignature()) {{
            assert (((prop != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15787)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15788)==0&false));
            // To test whether an instance of A MUST have a property p with a
            // filler, check for the satisfiability of A and not (some p Thing)
            // if this is satisfiable, then there might be instances with no
            // p-filler
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15789);OWLClassExpression restriction = df.getOWLObjectSomeValuesFrom(prop, df.getOWLThing());
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15790);OWLClassExpression intersection = df.getOWLObjectIntersectionOf(cls, df.getOWLObjectComplementOf(
                restriction));
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15791);boolean sat = !reasoner.isSatisfiable(intersection);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15792);if ((((sat)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15793)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15794)==0&false))) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15795);assertNotNull(prop);
                // System.out.println("Instances of " + cls +
                // " necessarily have the property " + prop);
            }
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testModularization() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pkl1ppc6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testModularization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pkl1ppc6s() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15796);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15797);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15798);OWLOntology o = loadPizzaOntology(m);
        // extract a module for all toppings.
        // start by creating a signature that consists of "Quokka".
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15799);OWLClass quokkaCls = df.getOWLClass(IRI.create(KOALA_IRI + "#Quokka"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15800);Set<OWLEntity> sig = new HashSet<>();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15801);sig.add(quokkaCls);
        // We now add all subclasses (direct and indirect) of the chosen
        // classes.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15802);Set<OWLEntity> seedSig = new HashSet<>();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15803);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15804);for (OWLEntity ent : sig) {{
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15805);seedSig.add(ent);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15806);if ((((ent.isOWLClass())&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15807)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15808)==0&false))) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15809);NodeSet<OWLClass> subClasses = reasoner.getSubClasses(ent.asOWLClass(), false);
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15810);seedSig.addAll(subClasses.getFlattened());
            }
        }}
        // We now extract a locality-based module. STAR provides the smallest
        // ones
        }__CLR4_5_2bz1bz1lvico2hm.R.inc(15811);SyntacticLocalityModuleExtractor sme = new SyntacticLocalityModuleExtractor(m, o, ModuleType.STAR);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15812);Set<OWLAxiom> mod = sme.extract(seedSig);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15813);assertNotNull(mod);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testIndividual() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xxxjdac7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xxxjdac7a() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15814);
        // :Mary is an instance of the class :Person.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15815);OWLOntologyManager m = create();
        // The IRIs used here are taken from the OWL 2 Primer
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15816);String base = "http://example.com/owl/families/";
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15817);PrefixManager pm = new DefaultPrefixManager(null, null, base);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15818);OWLClass person = df.getOWLClass(":Person", pm);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15819);OWLNamedIndividual mary = df.getOWLNamedIndividual(":Mary", pm);
        // create a ClassAssertion to specify that :Mary is an instance of
        // :Person
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15820);OWLClassAssertionAxiom classAssertion = df.getOWLClassAssertionAxiom(person, mary);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15821);OWLOntology o = m.createOntology(IRI.create(base));
        // Add the class assertion
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15822);m.addAxiom(o, classAssertion);
        // Dump the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15823);StreamDocumentTarget target = new StreamDocumentTarget(new ByteArrayOutputStream());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15824);m.saveOntology(o, target);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @SuppressWarnings("unused")
    @Test
    public void testDataRanges() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2msju55c7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testDataRanges",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2msju55c7l() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15825);
        // Data ranges are used as the types of literals, as the ranges for data
        // properties
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15826);OWLOntologyManager m = create();
        // OWLDatatype represents named datatypes in OWL
        // The OWL2Datatype enum defines built in OWL 2 Datatypes
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15827);OWLDatatype integer = df.getOWLDatatype(OWL2Datatype.XSD_INTEGER.getIRI());
        // For common data types there are some convenience methods of
        // OWLDataFactory
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15828);OWLDatatype integerDatatype = df.getIntegerOWLDatatype();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15829);OWLDatatype floatDatatype = df.getFloatOWLDatatype();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15830);OWLDatatype doubleDatatype = df.getDoubleOWLDatatype();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15831);OWLDatatype booleanDatatype = df.getBooleanOWLDatatype();
        // The top datatype is rdfs:Literal
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15832);OWLDatatype rdfsLiteral = df.getTopDatatype();
        // Custom data ranges can be built up from these basic datatypes
        // Get hold of a literal that is an integer value 18
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15833);OWLLiteral eighteen = df.getOWLLiteral(18);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15834);OWLDatatypeRestriction integerGE18 = df.getOWLDatatypeRestriction(integer, OWLFacet.MIN_INCLUSIVE, eighteen);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15835);OWLDataProperty hasAge = df.getOWLDataProperty(IRI.create(
            "http://www.semanticweb.org/ontologies/dataranges#hasAge"));
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15836);OWLDataPropertyRangeAxiom rangeAxiom = df.getOWLDataPropertyRangeAxiom(hasAge, integerGE18);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15837);OWLOntology o = m.createOntology(IRI.create("http://www.semanticweb.org/ontologies/dataranges"));
        // Add the range axiom to our ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15838);m.addAxiom(o, rangeAxiom);
        // Now create a datatype definition axiom
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15839);OWLDatatypeDefinitionAxiom datatypeDef = df.getOWLDatatypeDefinitionAxiom(df.getOWLDatatype(IRI.create(
            "http://www.semanticweb.org/ontologies/dataranges#age")), integerGE18);
        // Add the definition to our ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15840);m.addAxiom(o, datatypeDef);
        // Dump our ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15841);StreamDocumentTarget target = new StreamDocumentTarget(new ByteArrayOutputStream());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15842);m.saveOntology(o, target);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testPropertyAssertions() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pbw7zc83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testPropertyAssertions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pbw7zc83() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15843);
        // how to specify various property assertions for individuals
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15844);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15845);IRI ontologyIRI = IRI.create("http://example.com/owl/families/");
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15846);OWLOntology o = m.createOntology(ontologyIRI);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15847);PrefixManager pm = new DefaultPrefixManager(null, null, ontologyIRI.toString());
        // Let's specify the :John has a wife :Mary
        // Get hold of the necessary individuals and object property
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15848);OWLNamedIndividual john = df.getOWLNamedIndividual(":John", pm);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15849);OWLNamedIndividual mary = df.getOWLNamedIndividual(":Mary", pm);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15850);OWLObjectProperty hasWife = df.getOWLObjectProperty(":hasWife", pm);
        // To specify that :John is related to :Mary via the :hasWife property
        // we create an object property
        // assertion and add it to the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15851);OWLObjectPropertyAssertionAxiom propertyAssertion = df.getOWLObjectPropertyAssertionAxiom(hasWife, john, mary);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15852);m.addAxiom(o, propertyAssertion);
        // Now let's specify that :John is aged 51.
        // Get hold of a data property called :hasAge
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15853);OWLDataProperty hasAge = df.getOWLDataProperty(":hasAge", pm);
        // To specify that :John has an age of 51 we create a data property
        // assertion and add it to the ontology
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15854);OWLDataPropertyAssertionAxiom dataPropertyAssertion = df.getOWLDataPropertyAssertionAxiom(hasAge, john, 51);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15855);m.addAxiom(o, dataPropertyAssertion);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    /**
     * Print the class hierarchy for the given ontology from this class down,
     * assuming this class is at the given level. Makes no attempt to deal
     * sensibly with multiple inheritance.
     */
    public void printHierarchy(@Nonnull OWLOntology o, @Nonnull OWLClass clazz) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15856);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15857);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15858);printHierarchy(reasoner, clazz, 0, new HashSet<OWLClass>());
        /* Now print out any unsatisfiable classes */
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15859);for (OWLClass cl : o.getClassesInSignature()) {{
            assert (((cl != null)&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15860)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15861)==0&false));
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15862);if ((((!reasoner.isSatisfiable(cl))&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15863)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15864)==0&false))) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15865);assertNotNull(labelFor(cl, o));
                // System.out.println("XXX: " + labelFor(cl, o));
            }
        }}
        }__CLR4_5_2bz1bz1lvico2hm.R.inc(15866);reasoner.dispose();
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    public static class LoggingReasonerProgressMonitor implements ReasonerProgressMonitor {

        private static final long serialVersionUID = 40000L;
        private static Logger logger;

        public LoggingReasonerProgressMonitor(Logger log) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15867);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15868);logger = log;
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        public LoggingReasonerProgressMonitor(@Nonnull Logger log, String methodName) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15869);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15870);String loggerName = log.getName() + '.' + methodName;
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15871);logger = LoggerFactory.getLogger(loggerName);
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void reasonerTaskStarted(String taskName) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15872);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15873);logger.info("Reasoner Task Started: {}.", taskName);
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void reasonerTaskStopped() {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15874);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15875);logger.info("Task stopped.");
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void reasonerTaskProgressChanged(int value, int max) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15876);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15877);logger.info("Reasoner Task made progress: {}/{}", value, max);
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

        @Override
        public void reasonerTaskBusy() {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15878);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15879);logger.info("Reasoner Task is busy");
        }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}
    }

    // a visitor to extract label annotations
    @Nonnull
    LabelExtractor le = new LabelExtractor();

    private String labelFor(@Nonnull OWLEntity clazz, @Nonnull OWLOntology o) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15880);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15881);Iterable<OWLAnnotation> annotations = getAnnotationObjects(clazz, o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15882);for (OWLAnnotation anno : annotations) {{
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15883);String result = anno.accept(le);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15884);if ((((!result.isEmpty())&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15885)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15886)==0&false))) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15887);return result;
            }
        }}
        }__CLR4_5_2bz1bz1lvico2hm.R.inc(15888);return clazz.getIRI().toString();
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    public void printHierarchy(@Nonnull OWLReasoner reasoner, @Nonnull OWLClass clazz, int level,
        @Nonnull Set<OWLClass> visited) {try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15889);
        // Only print satisfiable classes to skip Nothing
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15890);if ((((!visited.contains(clazz) && reasoner.isSatisfiable(clazz))&&(__CLR4_5_2bz1bz1lvico2hm.R.iget(15891)!=0|true))||(__CLR4_5_2bz1bz1lvico2hm.R.iget(15892)==0&false))) {{
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15893);visited.add(clazz);
            // for (int i = 0; i < level * 4; i++) {
            // System.out.print(" ");
            // }
            // System.out.println(labelFor(clazz, reasoner.getRootOntology()));
            /* Find the children and recurse */
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15894);NodeSet<OWLClass> subClasses = reasoner.getSubClasses(clazz, true);
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15895);for (OWLClass child : subClasses.getFlattened()) {{
                __CLR4_5_2bz1bz1lvico2hm.R.inc(15896);printHierarchy(reasoner, child, level + 1, visited);
            }
        }}
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testHierarchy() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25tq8nqc9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testHierarchy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25tq8nqc9l() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15897);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15898);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15899);OWLOntology o = loadPizzaOntology(m);
        // Get Thing
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15900);OWLClass clazz = df.getOWLThing();
        // System.out.println("Class : " + clazz);
        // Print the hierarchy below thing
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15901);printHierarchy(o, clazz);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testRendering() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wqpuzlc9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testRendering",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wqpuzlc9q() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15902);
        // Simple Rendering Example. Reads an ontology and then renders it.
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15903);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15904);OWLOntology o = loadPizzaOntology(m);
        // Register the ontology storer with the manager
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15905);m.getOntologyStorers().add(new TutorialSyntaxStorerFactory());
        // Save using a different format
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15906);StreamDocumentTarget target = new StreamDocumentTarget(new ByteArrayOutputStream());
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15907);m.saveOntology(o, new OWLTutorialSyntaxOntologyFormat(), target);
    }finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}

    @Test
    public void testCheckProfile() throws OWLException {__CLR4_5_2bz1bz1lvico2hm.R.globalSliceStart(getClass().getName(),15908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvz9juc9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bz1bz1lvico2hm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bz1bz1lvico2hm.R.globalSliceEnd(getClass().getName(),"uk.ac.manchester.owl.owlapi.tutorialowled2011.TutorialSnippetsTestCase.testCheckProfile",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvz9juc9w() throws OWLException{try{__CLR4_5_2bz1bz1lvico2hm.R.inc(15908);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15909);OWLOntologyManager m = create();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15910);OWLOntology o = m.createOntology(KOALA_IRI);
        // Available profiles: DL, EL, QL, RL, OWL2 (Full)
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15911);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15912);OWLProfileReport report = profile.checkOntology(o);
        __CLR4_5_2bz1bz1lvico2hm.R.inc(15913);for (OWLProfileViolation v : report.getViolations()) {{
            // deal with violations
            __CLR4_5_2bz1bz1lvico2hm.R.inc(15914);System.out.println(v);
        }
    }}finally{__CLR4_5_2bz1bz1lvico2hm.R.flushNeeded();}}
}
