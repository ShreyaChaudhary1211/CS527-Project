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
package org.semanticweb.owlapi.examples;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.search.Searcher.*;
import static org.semanticweb.owlapi.vocab.OWLFacet.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.*;

import javax.annotation.Nonnull;

import org.junit.Ignore;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.*;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasoner;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.util.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import com.google.common.base.Optional;

import uk.ac.manchester.cs.owlapi.modularity.ModuleType;
import uk.ac.manchester.cs.owlapi.modularity.SyntacticLocalityModuleExtractor;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings({ "javadoc", "unused", "null" })
public class Examples extends TestBase {public static class __CLR4_5_29i49i4lvico25k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12821,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String KOALA = "<?xml version=\"1.0\"?>\n"
        + "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns=\"http://protege.stanford.edu/plugins/owl/owl-library/koala.owl#\" xml:base=\"http://protege.stanford.edu/plugins/owl/owl-library/koala.owl\">\n"
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

    /**
     * The examples here show how to load ontologies.
     * 
     * @throws Exception
     *         exception
     */
    public void shouldLoad() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12316);
        // Get hold of an ontology manager
        __CLR4_5_29i49i4lvico25k.R.inc(12317);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12318);OWLOntology ontology = load(manager);
        // We can always obtain the location where an ontology was loaded from;
        // for this test, though, since the ontology was loaded from a string,
        // this does not return a file
        __CLR4_5_29i49i4lvico25k.R.inc(12319);IRI documentIRI = manager.getOntologyDocumentIRI(ontology);
        // In cases where a local copy of one of more ontologies is used, an
        // ontology IRI mapper can be used to provide a redirection mechanism.
        // This means that ontologies can be loaded as if they were located on
        // the web. In this example, we simply redirect the loading from
        // an IRI to our local copy above.
        // iri and file here are used as examples
        __CLR4_5_29i49i4lvico25k.R.inc(12320);IRI iri = ontology.getOntologyID().getOntologyIRI().get();
        __CLR4_5_29i49i4lvico25k.R.inc(12321);IRI remoteOntology = IRI.create("http://remote.ontology/we/dont/want/to/load");
        __CLR4_5_29i49i4lvico25k.R.inc(12322);manager.getIRIMappers().add(new SimpleIRIMapper(remoteOntology, iri));
        // Load the ontology as if we were loading it from the web (from its
        // ontology IRI)
        __CLR4_5_29i49i4lvico25k.R.inc(12323);OWLOntology redirectedOntology = manager.loadOntology(remoteOntology);
        __CLR4_5_29i49i4lvico25k.R.inc(12324);assertEquals(redirectedOntology, ontology);
        // Note that when imports are loaded an ontology manager will be
        // searched for mappings
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @param manager
     *        manager
     * @return loaded ontology
     * @throws OWLOntologyCreationException
     *         if a problem pops up
     */
    @Nonnull
    OWLOntology load(@Nonnull OWLOntologyManager manager) throws OWLOntologyCreationException {try{__CLR4_5_29i49i4lvico25k.R.inc(12325);
        // in this test, the ontology is loaded from a string
        __CLR4_5_29i49i4lvico25k.R.inc(12326);return manager.loadOntologyFromOntologyDocument(new StringDocumentSource(KOALA));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how an ontology can be saved in various formats to
     * various locations and streams.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldSaveOntologies() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12327);
        // Get hold of an ontology manager
        __CLR4_5_29i49i4lvico25k.R.inc(12328);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12329);OWLOntology ontology = load(manager);
        // Now save a local copy of the ontology. (Specify a path appropriate to
        // your setup)
        __CLR4_5_29i49i4lvico25k.R.inc(12330);File file = folder.newFile("owlapiexamples_saving.owl");
        __CLR4_5_29i49i4lvico25k.R.inc(12331);manager.saveOntology(ontology, IRI.create(file.toURI()));
        // By default ontologies are saved in the format from which they were
        // loaded. In this case the ontology was loaded from rdf/xml. We
        // can get information about the format of an ontology from its manager
        __CLR4_5_29i49i4lvico25k.R.inc(12332);OWLDocumentFormat format = manager.getOntologyFormat(ontology);
        // We can save the ontology in a different format. Lets save the
        // ontology
        // in owl/xml format
        __CLR4_5_29i49i4lvico25k.R.inc(12333);OWLXMLDocumentFormat owlxmlFormat = new OWLXMLDocumentFormat();
        // Some ontology formats support prefix names and prefix IRIs. In our
        // case we loaded the Koala ontology from an rdf/xml format, which
        // supports prefixes. When we save the ontology in the new format we
        // will copy the prefixes over so that we have nicely abbreviated IRIs
        // in the new ontology document
        __CLR4_5_29i49i4lvico25k.R.inc(12334);if ((((format.isPrefixOWLOntologyFormat())&&(__CLR4_5_29i49i4lvico25k.R.iget(12335)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12336)==0&false))) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12337);owlxmlFormat.copyPrefixesFrom(format.asPrefixOWLOntologyFormat());
        }
        }__CLR4_5_29i49i4lvico25k.R.inc(12338);manager.saveOntology(ontology, owlxmlFormat, IRI.create(file.toURI()));
        // We can also dump an ontology to System.out by specifying a different
        // OWLOntologyOutputTarget. Note that we can write an ontology to a
        // stream in a similar way using the StreamOutputTarget class
        // Try another format - The Manchester OWL Syntax
        __CLR4_5_29i49i4lvico25k.R.inc(12339);ManchesterSyntaxDocumentFormat manSyntaxFormat = new ManchesterSyntaxDocumentFormat();
        __CLR4_5_29i49i4lvico25k.R.inc(12340);if ((((format.isPrefixOWLOntologyFormat())&&(__CLR4_5_29i49i4lvico25k.R.iget(12341)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12342)==0&false))) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12343);manSyntaxFormat.copyPrefixesFrom(format.asPrefixOWLOntologyFormat());
        }
        // Replace the ByteArrayOutputStream wth an actual output stream to save
        // to a file.
        }__CLR4_5_29i49i4lvico25k.R.inc(12344);manager.saveOntology(ontology, manSyntaxFormat, new StreamDocumentTarget(new ByteArrayOutputStream()));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to get access to objects that represent entities.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldAccessEntities() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12345);
        // In order to create objects that represent entities we need a
        // data factory.
        __CLR4_5_29i49i4lvico25k.R.inc(12346);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // We can get a reference to a data factory from an OWLOntologyManager.
        __CLR4_5_29i49i4lvico25k.R.inc(12347);OWLDataFactory factory = manager.getOWLDataFactory();
        // In OWL, entities are named objects that are used to build class
        // expressions and axioms. They include classes, properties (object,
        // data and annotation), named individuals and datatypes. All entities
        // may be obtained from an OWLDataFactory. Let's create an object to
        // represent a class. In this case, we'll choose
        // http://www.semanticweb.org/owlapi/ontologies/ontology#A as the IRI
        // for our class. There are two ways we can create classes (and other
        // entities). The first is by specifying the full IRI. First we create
        // an IRI object:
        __CLR4_5_29i49i4lvico25k.R.inc(12348);IRI iri = IRI.create("http://www.semanticweb.org/owlapi/ontologies/ontology#A");
        // Now we create the class
        __CLR4_5_29i49i4lvico25k.R.inc(12349);OWLClass clsAMethodA = factory.getOWLClass(iri);
        // The second is to use a prefix manager and specify abbreviated IRIs.
        // This is useful for creating lots of entities with the same prefix
        // IRIs. First create our prefix manager and specify that the default
        // prefix IRI (bound to the empty prefix name) is
        // http://www.semanticweb.org/owlapi/ontologies/ontology#
        __CLR4_5_29i49i4lvico25k.R.inc(12350);PrefixManager pm = new DefaultPrefixManager(null, null,
            "http://www.semanticweb.org/owlapi/ontologies/ontology#");
        // Now we use the prefix manager and just specify an abbreviated IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12351);OWLClass clsAMethodB = factory.getOWLClass(":A", pm);
        // Note that clsAMethodA will be equal to clsAMethodB because they are
        // both OWLClass objects and have the same IRI. Creating entities in the
        // above manner does not "add them to an ontology". They are merely
        // objects that allow us to reference certain objects (classes etc.) for
        // use in class expressions, and axioms (which can be added to an
        // ontology). Lets create an ontology, and add a declaration axiom to
        // the ontology that declares the above class
        __CLR4_5_29i49i4lvico25k.R.inc(12352);OWLOntology ontology = manager.createOntology(IRI.create("http://anyiri.com/can/be/used/ontology"));
        // We can add a declaration axiom to the ontology, that essentially adds
        // the class to the signature of our ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12353);OWLDeclarationAxiom declarationAxiom = factory.getOWLDeclarationAxiom(clsAMethodA);
        __CLR4_5_29i49i4lvico25k.R.inc(12354);manager.addAxiom(ontology, declarationAxiom);
        // Note that it isn't necessary to add declarations to an ontology in
        // order to use an entity. Declarations will automatically be added in
        // the
        // saved version of the ontology.
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to create dataranges.
     */
    @Test
    public void shouldBuildDataRanges() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12355);
        // OWLDataRange is the superclass of all data ranges in the OWL API.
        // Data ranges are used as the types of literals, as the ranges for data
        // properties, as filler for data reatrictions. Get hold of a manager to
        // work with
        __CLR4_5_29i49i4lvico25k.R.inc(12356);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12357);OWLDataFactory factory = manager.getOWLDataFactory();
        // OWLDatatype represents named datatypes in OWL. These are a bit like
        // classes whose instances are data values OWLDatatype objects are
        // obtained from a data factory. The OWL2Datatype enum defines built in
        // OWL 2 Datatypes Get hold of the integer datatype
        __CLR4_5_29i49i4lvico25k.R.inc(12358);OWLDatatype integer = factory.getOWLDatatype(OWL2Datatype.XSD_INTEGER.getIRI());
        // For common data types there are some convenience methods of
        // OWLDataFactory. For example
        __CLR4_5_29i49i4lvico25k.R.inc(12359);OWLDatatype integerDatatype = factory.getIntegerOWLDatatype();
        __CLR4_5_29i49i4lvico25k.R.inc(12360);OWLDatatype floatDatatype = factory.getFloatOWLDatatype();
        __CLR4_5_29i49i4lvico25k.R.inc(12361);OWLDatatype doubleDatatype = factory.getDoubleOWLDatatype();
        __CLR4_5_29i49i4lvico25k.R.inc(12362);OWLDatatype booleanDatatype = factory.getBooleanOWLDatatype();
        // The top datatype (analgous to owl:Thing) is rdfs:Literal, which can
        // be obtained from the data factory
        __CLR4_5_29i49i4lvico25k.R.inc(12363);OWLDatatype rdfsLiteral = factory.getTopDatatype();
        // Custom data ranges can be built up from these basic datatypes. For
        // example, it is possible to restrict a datatype using facets from XML
        // Schema Datatypes. For example, lets create a data range that
        // describes integers that are greater or equal to 18 To do this, we
        // restrict the xsd:integer datatype using the xsd:minInclusive facet
        // with a value of 18. Get hold of a literal that is an integer value 18
        __CLR4_5_29i49i4lvico25k.R.inc(12364);OWLLiteral eighteen = factory.getOWLLiteral(18);
        // Now create the restriction. The OWLFacet enum provides an enumeration
        // of the various facets that can be used
        __CLR4_5_29i49i4lvico25k.R.inc(12365);OWLDatatypeRestriction integerGE18 = factory.getOWLDatatypeRestriction(integer, MIN_INCLUSIVE, eighteen);
        // We could use this datatype in restriction, as the range of data
        // properties etc. For example, if we want to restrict the range of the
        // :hasAge data property to 18 or more we specify its range as this data
        // range
        __CLR4_5_29i49i4lvico25k.R.inc(12366);PrefixManager pm = new DefaultPrefixManager(null, null, "http://www.semanticweb.org/ontologies/dataranges#");
        __CLR4_5_29i49i4lvico25k.R.inc(12367);OWLDataProperty hasAge = factory.getOWLDataProperty(":hasAge", pm);
        __CLR4_5_29i49i4lvico25k.R.inc(12368);OWLDataPropertyRangeAxiom rangeAxiom = factory.getOWLDataPropertyRangeAxiom(hasAge, integerGE18);
        __CLR4_5_29i49i4lvico25k.R.inc(12369);OWLOntology ontology = manager.createOntology(IRI.create("http://www.semanticweb.org/ontologies/dataranges"));
        // Add the range axiom to our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12370);manager.addAxiom(ontology, rangeAxiom);
        // For creating datatype restrictions on integers or doubles there are
        // some convenience methods on OWLDataFactory For example: Create a data
        // range of integers greater or equal to 60
        __CLR4_5_29i49i4lvico25k.R.inc(12371);OWLDatatypeRestriction integerGE60 = factory.getOWLDatatypeMinInclusiveRestriction(60);
        // Create a data range of integers less than 16
        __CLR4_5_29i49i4lvico25k.R.inc(12372);OWLDatatypeRestriction integerLT16 = factory.getOWLDatatypeMaxExclusiveRestriction(18);
        // In OWL 2 it is possible to represent the intersection, union and
        // complement of data types For example, we could create a union of data
        // ranges of the data range integer less than 16 or integer greater or
        // equal to 60
        __CLR4_5_29i49i4lvico25k.R.inc(12373);OWLDataUnionOf concessionaryAge = factory.getOWLDataUnionOf(integerLT16, integerGE60);
        // We can also coin names for custom data ranges. To do this we use an
        // OWLDatatypeDefintionAxiom Get hold of a named datarange (datatype)
        // that will be used to assign a name to our above datatype
        __CLR4_5_29i49i4lvico25k.R.inc(12374);OWLDatatype concessionaryAgeDatatype = factory.getOWLDatatype(":ConcessionaryAge", pm);
        // Now create a datatype definition axiom
        __CLR4_5_29i49i4lvico25k.R.inc(12375);OWLDatatypeDefinitionAxiom datatypeDef = factory.getOWLDatatypeDefinitionAxiom(concessionaryAgeDatatype,
            concessionaryAge);
        // Add the definition to our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12376);manager.addAxiom(ontology, datatypeDef);
        // Dump our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12377);manager.saveOntology(ontology, new StreamDocumentTarget(new ByteArrayOutputStream()));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to work with dataranges. OWL 1.1 (and newer)
     * allows data ranges to be created by taking a base datatype e.g. int,
     * string etc. and then by applying facets to restrict the datarange. For
     * example, int greater than 18
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldUseDataranges() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12378);
        __CLR4_5_29i49i4lvico25k.R.inc(12379);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12380);String base = "http://org.semanticweb.datarangeexample";
        __CLR4_5_29i49i4lvico25k.R.inc(12381);OWLOntology ontology = manager.createOntology(IRI.create(base));
        // We want to add an axiom to our ontology that states that adults have
        // an age greater than 18. To do this, we will create a restriction
        // along a hasAge property, with a filler that corresponds to the set of
        // integers greater than 18. First get a reference to our hasAge
        // property
        __CLR4_5_29i49i4lvico25k.R.inc(12382);OWLDataFactory factory = manager.getOWLDataFactory();
        __CLR4_5_29i49i4lvico25k.R.inc(12383);OWLDataProperty hasAge = factory.getOWLDataProperty(IRI.create(base + "hasAge"));
        // For completeness, we will make hasAge functional by adding an axiom
        // to state this
        __CLR4_5_29i49i4lvico25k.R.inc(12384);OWLFunctionalDataPropertyAxiom funcAx = factory.getOWLFunctionalDataPropertyAxiom(hasAge);
        __CLR4_5_29i49i4lvico25k.R.inc(12385);manager.applyChange(new AddAxiom(ontology, funcAx));
        // Now create the data range which correponds to int greater than 18. To
        // do this, we get hold of the int datatype and then restrict it with a
        // minInclusive facet restriction.
        __CLR4_5_29i49i4lvico25k.R.inc(12386);OWLDatatype intDatatype = factory.getIntegerOWLDatatype();
        // Create the value "18", which is an int.
        __CLR4_5_29i49i4lvico25k.R.inc(12387);OWLLiteral eighteenConstant = factory.getOWLLiteral(18);
        // Now create our custom datarange, which is int greater than or equal
        // to 18. To do this, we need the minInclusive facet
        __CLR4_5_29i49i4lvico25k.R.inc(12388);OWLFacet facet = MIN_INCLUSIVE;
        // Create the restricted data range by applying the facet restriction
        // with a value of 18 to int
        __CLR4_5_29i49i4lvico25k.R.inc(12389);OWLDataRange intGreaterThan18 = factory.getOWLDatatypeRestriction(intDatatype, facet, eighteenConstant);
        // Now we can use this in our datatype restriction on hasAge
        __CLR4_5_29i49i4lvico25k.R.inc(12390);OWLClassExpression thingsWithAgeGreaterOrEqualTo18 = factory.getOWLDataSomeValuesFrom(hasAge, intGreaterThan18);
        // Now we want to say all adults have an age that is greater or equal to
        // 18 - i.e. Adult is a subclass of hasAge some int[>= 18] Obtain a
        // reference to the Adult class
        __CLR4_5_29i49i4lvico25k.R.inc(12391);OWLClass adult = factory.getOWLClass(IRI.create(base + "#Adult"));
        // Now make adult a subclass of the things that have an age greater to
        // or equal to 18
        __CLR4_5_29i49i4lvico25k.R.inc(12392);OWLSubClassOfAxiom ax = factory.getOWLSubClassOfAxiom(adult, thingsWithAgeGreaterOrEqualTo18);
        // Add our axiom to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12393);manager.applyChange(new AddAxiom(ontology, ax));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    @Test
    public void shouldInstantiateLiterals() {try{__CLR4_5_29i49i4lvico25k.R.inc(12394);
        __CLR4_5_29i49i4lvico25k.R.inc(12395);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12396);OWLDataFactory factory = manager.getOWLDataFactory();
        // Get an plain literal with an empty language tag
        __CLR4_5_29i49i4lvico25k.R.inc(12397);OWLLiteral literal1 = factory.getOWLLiteral("My string literal", "");
        // Get an untyped string literal with a language tag
        __CLR4_5_29i49i4lvico25k.R.inc(12398);OWLLiteral literal2 = factory.getOWLLiteral("My string literal", "en");
        // Typed literals are literals that are typed with a datatype Create a
        // typed literal to represent the integer 33
        __CLR4_5_29i49i4lvico25k.R.inc(12399);OWLDatatype integerDatatype = factory.getOWLDatatype(OWL2Datatype.XSD_INTEGER.getIRI());
        __CLR4_5_29i49i4lvico25k.R.inc(12400);OWLLiteral literal3 = factory.getOWLLiteral("33", integerDatatype);
        // There is are short cut methods on OWLDataFactory for creating typed
        // literals with common datatypes Internallym these methods create
        // literals as above Create a literal to represent the integer 33
        __CLR4_5_29i49i4lvico25k.R.inc(12401);OWLLiteral literal4 = factory.getOWLLiteral(33);
        // Create a literal to represent the double 33.3
        __CLR4_5_29i49i4lvico25k.R.inc(12402);OWLLiteral literal5 = factory.getOWLLiteral(33.3);
        // Create a literal to represent the boolean value true
        __CLR4_5_29i49i4lvico25k.R.inc(12403);OWLLiteral literal6 = factory.getOWLLiteral(true);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldLoadAndSave() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12404);
        // A simple example of how to load and save an ontology We first need to
        // obtain a copy of an OWLOntologyManager, which, as the name suggests,
        // manages a set of ontologies. An ontology is unique within an ontology
        // manager. Each ontology knows its ontology manager. To load multiple
        // copies of an ontology, multiple managers would have to be used.
        __CLR4_5_29i49i4lvico25k.R.inc(12405);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // In this test we don't rely on a remote ontology and load it from
        // a string
        __CLR4_5_29i49i4lvico25k.R.inc(12406);OWLOntology ontology = manager.loadOntologyFromOntologyDocument(new StringDocumentSource(KOALA));
        // Print out all of the classes which are contained in the signature of
        // the ontology. These are the classes that are referenced by axioms in
        // the ontology.
        // for (OWLClass cls : ontology.getClassesInSignature()) {
        // System.out.println(cls);
        // }
        // Now save a copy to another location in OWL/XML format (i.e. disregard
        // the format that the ontology was loaded in).
        __CLR4_5_29i49i4lvico25k.R.inc(12407);IRI destination = IRI.create(folder.newFile("owlapiexample_example1.xml"));
        __CLR4_5_29i49i4lvico25k.R.inc(12408);manager.saveOntology(ontology, new OWLXMLDocumentFormat(), destination);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    @Test
    public void shouldAddAxiom() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12409);
        // Create the manager that we will use to load ontologies.
        __CLR4_5_29i49i4lvico25k.R.inc(12410);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // Ontologies can have an IRI, which is used to identify the ontology.
        // You should think of the ontology IRI as the "name" of the ontology.
        // This IRI frequently resembles a Web address (i.e. http://...), but it
        // is important to realise that the ontology IRI might not necessarily
        // be resolvable. In other words, we can't necessarily get a document
        // from the URL corresponding to the ontology IRI, which represents the
        // ontology. In order to have a concrete representation of an ontology
        // (e.g. an RDF/XML file), we MAP the ontology IRI to a PHYSICAL IRI. We
        // do this using an IRIMapper Let's create an ontology and name it
        // "http://www.co-ode.org/ontologies/testont.owl" We need to set up a
        // mapping which points to a concrete file where the ontology will be
        // stored. (It's good practice to do this even if we don't intend to
        // save the ontology).
        __CLR4_5_29i49i4lvico25k.R.inc(12411);IRI ontologyIRI = IRI.create("http://www.co-ode.org/ontologies/testont.owl");
        // Create the document IRI for our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12412);IRI documentIRI = IRI.create("file:/tmp/MyOnt.owl");
        // Set up a mapping, which maps the ontology to the document IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12413);SimpleIRIMapper mapper = new SimpleIRIMapper(ontologyIRI, documentIRI);
        __CLR4_5_29i49i4lvico25k.R.inc(12414);manager.getIRIMappers().add(mapper);
        // Now create the ontology - we use the ontology IRI (not the physical
        // IRI)
        __CLR4_5_29i49i4lvico25k.R.inc(12415);OWLOntology ontology = manager.createOntology(ontologyIRI);
        // Now we want to specify that A is a subclass of B. To do this, we add
        // a subclass axiom. A subclass axiom is simply an object that specifies
        // that one class is a subclass of another class. We need a data factory
        // to create various object from. Each manager has a reference to a data
        // factory that we can use.
        __CLR4_5_29i49i4lvico25k.R.inc(12416);OWLDataFactory factory = manager.getOWLDataFactory();
        // Get hold of references to class A and class B. Note that the ontology
        // does not contain class A or classB, we simply get references to
        // objects from a data factory that represent class A and class B
        __CLR4_5_29i49i4lvico25k.R.inc(12417);OWLClass clsA = factory.getOWLClass(IRI.create(ontologyIRI + "#A"));
        __CLR4_5_29i49i4lvico25k.R.inc(12418);OWLClass clsB = factory.getOWLClass(IRI.create(ontologyIRI + "#B"));
        // Now create the axiom
        __CLR4_5_29i49i4lvico25k.R.inc(12419);OWLAxiom axiom = factory.getOWLSubClassOfAxiom(clsA, clsB);
        // We now add the axiom to the ontology, so that the ontology states
        // that A is a subclass of B. To do this we create an AddAxiom change
        // object. At this stage neither classes A or B, or the axiom are
        // contained in the ontology. We have to add the axiom to the ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12420);AddAxiom addAxiom = new AddAxiom(ontology, axiom);
        // We now use the manager to apply the change
        __CLR4_5_29i49i4lvico25k.R.inc(12421);manager.applyChange(addAxiom);
        // The ontology will now contain references to class A and class B -
        // that is, class A and class B are contained within the SIGNATURE of
        // the ontology let's print them out
        __CLR4_5_29i49i4lvico25k.R.inc(12422);for (OWLClass c : ontology.getClassesInSignature()) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12423);c.toString();
        }
        // do anything that's necessary, e.g., print them out
        // System.out.println("Referenced class: " + cls);
        // We should also find that B is an ASSERTED superclass of A
        }__CLR4_5_29i49i4lvico25k.R.inc(12424);Iterable<OWLClassExpression> superClasses = sup(ontology.filterAxioms(Filters.subClassWithSub, clsA, INCLUDED),
            OWLClassExpression.class);
        // Now save the ontology. The ontology will be saved to the location
        // where we loaded it from, in the default ontology format
        __CLR4_5_29i49i4lvico25k.R.inc(12425);manager.saveOntology(ontology);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * These examples show how to create new ontologies.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreateOntology() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12426);
        // We first need to create an OWLOntologyManager, which will provide a
        // point for creating, loading and saving ontologies. We can create a
        // default ontology manager with the OWLManager class. This provides a
        // common setup of an ontology manager. It registers parsers etc. for
        // loading ontologies in a variety of syntaxes
        __CLR4_5_29i49i4lvico25k.R.inc(12427);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // In OWL 2, an ontology may be named with an IRI (Internationalised
        // Resource Identifier) We can create an instance of the IRI class as
        // follows:
        __CLR4_5_29i49i4lvico25k.R.inc(12428);IRI ontologyIRI = IRI.create("http://www.semanticweb.org/ontologies/myontology");
        // Here we have decided to call our ontology
        // "http://www.semanticweb.org/ontologies/myontology" If we publish our
        // ontology then we should make the location coincide with the ontology
        // IRI Now we have an IRI we can create an ontology using the manager
        __CLR4_5_29i49i4lvico25k.R.inc(12429);OWLOntology ontology = manager.createOntology(ontologyIRI);
        // System.out.println("Created ontology: " + ontology);
        // In OWL 2 if an ontology has an ontology IRI it may also have a
        // version IRI The OWL API encapsulates ontology IRI and possible
        // version IRI information in an OWLOntologyID Each ontology knows about
        // its ID
        __CLR4_5_29i49i4lvico25k.R.inc(12430);OWLOntologyID ontologyID = ontology.getOntologyID();
        // In this case our ontology has an IRI but does not have a version IRI
        // System.out.println("Ontology IRI: " + ontologyID.getOntologyIRI());
        // Our version IRI will be Optional.empty() to indicate that we don't
        // have a version IRI
        // An ontology may not have a version IRI - in this case, we count the
        // ontology as an anonymous ontology. Our ontology does have an IRI so
        // it is not anonymous:
        // System.out.println("Anonymous Ontology: " +
        // ontologyID.isAnonymous());
        // Once an ontology has been created its ontology ID (Ontology IRI and
        // version IRI can be changed) to do this we must apply a SetOntologyID
        // change through the ontology manager. Lets specify a version IRI for
        // our ontology. In our case we will just "extend" our ontology IRI with
        // some version information. We could of course specify any IRI for our
        // version IRI.
        __CLR4_5_29i49i4lvico25k.R.inc(12431);IRI versionIRI = IRI.create(ontologyIRI + "/version1");
        // Note that we MUST specify an ontology IRI if we want to specify a
        // version IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12432);OWLOntologyID newOntologyID = new OWLOntologyID(Optional.of(ontologyIRI), Optional.of(versionIRI));
        // Create the change that will set our version IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12433);SetOntologyID setOntologyID = new SetOntologyID(ontology, newOntologyID);
        // Apply the change
        __CLR4_5_29i49i4lvico25k.R.inc(12434);manager.applyChange(setOntologyID);
        // We can also just specify the ontology IRI and possibly the version
        // IRI at ontology creation time Set up our ID by specifying an ontology
        // IRI and version IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12435);IRI ontologyIRI2 = IRI.create("http://www.semanticweb.org/ontologies/myontology2");
        __CLR4_5_29i49i4lvico25k.R.inc(12436);IRI versionIRI2 = IRI.create("http://www.semanticweb.org/ontologies/myontology2/newversion");
        __CLR4_5_29i49i4lvico25k.R.inc(12437);OWLOntologyID ontologyID2 = new OWLOntologyID(Optional.of(ontologyIRI2), Optional.of(versionIRI2));
        // Now create the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12438);OWLOntology ontology2 = manager.createOntology(ontologyID2);
        // Finally, if we don't want to give an ontology an IRI, in OWL 2 we
        // don't have to
        __CLR4_5_29i49i4lvico25k.R.inc(12439);OWLOntology anonOntology = manager.createOntology();
        // This ontology is anonymous
        // System.out.println("Anonymous: " + anonOntology.isAnonymous());
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to specify various property assertions for
     * individuals.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreatePropertyAssertions() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12440);
        // We can specify the properties of an individual using property
        // assertions Get a copy of an ontology manager
        __CLR4_5_29i49i4lvico25k.R.inc(12441);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12442);IRI ontologyIRI = IRI.create("http://example.com/owl/families/");
        __CLR4_5_29i49i4lvico25k.R.inc(12443);OWLOntology ontology = manager.createOntology(ontologyIRI);
        // Get hold of a data factory from the manager and set up a prefix
        // manager to make things easier
        __CLR4_5_29i49i4lvico25k.R.inc(12444);OWLDataFactory factory = manager.getOWLDataFactory();
        __CLR4_5_29i49i4lvico25k.R.inc(12445);PrefixManager pm = new DefaultPrefixManager(null, null, ontologyIRI.toString());
        // Let's specify the :John has a wife :Mary Get hold of the necessary
        // individuals and object property
        __CLR4_5_29i49i4lvico25k.R.inc(12446);OWLNamedIndividual john = factory.getOWLNamedIndividual(":John", pm);
        __CLR4_5_29i49i4lvico25k.R.inc(12447);OWLNamedIndividual mary = factory.getOWLNamedIndividual(":Mary", pm);
        __CLR4_5_29i49i4lvico25k.R.inc(12448);OWLObjectProperty hasWife = factory.getOWLObjectProperty(":hasWife", pm);
        // To specify that :John is related to :Mary via the :hasWife property
        // we create an object property assertion and add it to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12449);OWLObjectPropertyAssertionAxiom propertyAssertion = factory.getOWLObjectPropertyAssertionAxiom(hasWife, john,
            mary);
        __CLR4_5_29i49i4lvico25k.R.inc(12450);manager.addAxiom(ontology, propertyAssertion);
        // Now let's specify that :John is aged 51. Get hold of a data property
        // called :hasAge
        __CLR4_5_29i49i4lvico25k.R.inc(12451);OWLDataProperty hasAge = factory.getOWLDataProperty(":hasAge", pm);
        // To specify that :John has an age of 51 we create a data property
        // assertion and add it to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12452);OWLDataPropertyAssertionAxiom dataPropertyAssertion = factory.getOWLDataPropertyAssertionAxiom(hasAge, john,
            51);
        __CLR4_5_29i49i4lvico25k.R.inc(12453);manager.addAxiom(ontology, dataPropertyAssertion);
        // Note that the above is a shortcut for creating a typed literal and
        // specifying this typed literal as the value of the property assertion.
        // That is, Get hold of the xsd:integer datatype
        __CLR4_5_29i49i4lvico25k.R.inc(12454);OWLDatatype integerDatatype = factory.getOWLDatatype(OWL2Datatype.XSD_INTEGER.getIRI());
        // Create a typed literal. We type the literal "51" with the datatype
        __CLR4_5_29i49i4lvico25k.R.inc(12455);OWLLiteral literal = factory.getOWLLiteral("51", integerDatatype);
        // Create the property assertion and add it to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12456);OWLAxiom ax = factory.getOWLDataPropertyAssertionAxiom(hasAge, john, literal);
        __CLR4_5_29i49i4lvico25k.R.inc(12457);manager.addAxiom(ontology, ax);
        // Dump the ontology to System.out
        __CLR4_5_29i49i4lvico25k.R.inc(12458);manager.saveOntology(ontology, new StreamDocumentTarget(new ByteArrayOutputStream()));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldAddClassAssertion() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12459);
        // For more information on classes and instances see the OWL 2 Primer
        // http://www.w3.org/TR/2009/REC-owl2-primer-20091027/#Classes_and_Instances
        // In order to say that an individual is an instance of a class (in an
        // ontology), we can add a ClassAssertion to the ontology. For example,
        // suppose we wanted to specify that :Mary is an instance of the class
        // :Person. First we need to obtain the individual :Mary and the class
        // :Person Create an ontology manager to work with
        __CLR4_5_29i49i4lvico25k.R.inc(12460);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12461);OWLDataFactory dataFactory = manager.getOWLDataFactory();
        // The IRIs used here are taken from the OWL 2 Primer
        __CLR4_5_29i49i4lvico25k.R.inc(12462);String base = "http://example.com/owl/families/";
        __CLR4_5_29i49i4lvico25k.R.inc(12463);PrefixManager pm = new DefaultPrefixManager(null, null, base);
        // Get the reference to the :Person class (the full IRI will be
        // <http://example.com/owl/families/Person>)
        __CLR4_5_29i49i4lvico25k.R.inc(12464);OWLClass person = dataFactory.getOWLClass(":Person", pm);
        // Get the reference to the :Mary class (the full IRI will be
        // <http://example.com/owl/families/Mary>)
        __CLR4_5_29i49i4lvico25k.R.inc(12465);OWLNamedIndividual mary = dataFactory.getOWLNamedIndividual(":Mary", pm);
        // Now create a ClassAssertion to specify that :Mary is an instance of
        // :Person
        __CLR4_5_29i49i4lvico25k.R.inc(12466);OWLClassAssertionAxiom classAssertion = dataFactory.getOWLClassAssertionAxiom(person, mary);
        // We need to add the class assertion to the ontology that we want
        // specify that :Mary is a :Person
        __CLR4_5_29i49i4lvico25k.R.inc(12467);OWLOntology ontology = manager.createOntology(IRI.create(base));
        // Add the class assertion
        __CLR4_5_29i49i4lvico25k.R.inc(12468);manager.addAxiom(ontology, classAssertion);
        // Dump the ontology to stdout
        __CLR4_5_29i49i4lvico25k.R.inc(12469);manager.saveOntology(ontology, new StreamDocumentTarget(new ByteArrayOutputStream()));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreateAndSaveOntology() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12470);
        __CLR4_5_29i49i4lvico25k.R.inc(12471);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // Let's create an ontology and name it
        // "http://www.co-ode.org/ontologies/testont.owl" We need to set up a
        // mapping which points to a concrete file where the ontology will be
        // stored. (It's good practice to do this even if we don't intend to
        // save the ontology).
        __CLR4_5_29i49i4lvico25k.R.inc(12472);IRI ontologyIRI = IRI.create("http://www.co-ode.org/ontologies/testont.owl");
        // Create a document IRI which can be resolved to point to where our
        // ontology will be saved.
        __CLR4_5_29i49i4lvico25k.R.inc(12473);IRI documentIRI = IRI.create("file:/tmp/SWRLTest.owl");
        // Set up a mapping, which maps the ontology to the document IRI
        __CLR4_5_29i49i4lvico25k.R.inc(12474);SimpleIRIMapper mapper = new SimpleIRIMapper(ontologyIRI, documentIRI);
        __CLR4_5_29i49i4lvico25k.R.inc(12475);manager.getIRIMappers().add(mapper);
        // Now create the ontology - we use the ontology IRI (not the physical
        // IRI)
        __CLR4_5_29i49i4lvico25k.R.inc(12476);OWLOntology ontology = manager.createOntology(ontologyIRI);
        __CLR4_5_29i49i4lvico25k.R.inc(12477);OWLDataFactory factory = manager.getOWLDataFactory();
        // Get hold of references to class A and class B. Note that the ontology
        // does not contain class A or classB, we simply get references to
        // objects from a data factory that represent class A and class B
        __CLR4_5_29i49i4lvico25k.R.inc(12478);OWLClass clsA = factory.getOWLClass(IRI.create(ontologyIRI + "#A"));
        __CLR4_5_29i49i4lvico25k.R.inc(12479);OWLClass clsB = factory.getOWLClass(IRI.create(ontologyIRI + "#B"));
        __CLR4_5_29i49i4lvico25k.R.inc(12480);SWRLVariable var = factory.getSWRLVariable(IRI.create(ontologyIRI + "#x"));
        __CLR4_5_29i49i4lvico25k.R.inc(12481);SWRLRule rule = factory.getSWRLRule(singleton(factory.getSWRLClassAtom(clsA, var)), singleton(factory
            .getSWRLClassAtom(clsB, var)));
        __CLR4_5_29i49i4lvico25k.R.inc(12482);manager.applyChange(new AddAxiom(ontology, rule));
        __CLR4_5_29i49i4lvico25k.R.inc(12483);OWLObjectProperty prop = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#propA"));
        __CLR4_5_29i49i4lvico25k.R.inc(12484);OWLObjectProperty propB = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#propB"));
        __CLR4_5_29i49i4lvico25k.R.inc(12485);SWRLObjectPropertyAtom propAtom = factory.getSWRLObjectPropertyAtom(prop, var, var);
        __CLR4_5_29i49i4lvico25k.R.inc(12486);SWRLObjectPropertyAtom propAtom2 = factory.getSWRLObjectPropertyAtom(propB, var, var);
        __CLR4_5_29i49i4lvico25k.R.inc(12487);Set<SWRLAtom> antecedent = new HashSet<SWRLAtom>();
        __CLR4_5_29i49i4lvico25k.R.inc(12488);antecedent.add(propAtom);
        __CLR4_5_29i49i4lvico25k.R.inc(12489);antecedent.add(propAtom2);
        __CLR4_5_29i49i4lvico25k.R.inc(12490);SWRLRule rule2 = factory.getSWRLRule(antecedent, Collections.singleton(propAtom));
        __CLR4_5_29i49i4lvico25k.R.inc(12491);manager.applyChange(new AddAxiom(ontology, rule2));
        // Now save the ontology. The ontology will be saved to the location
        // where we loaded it from, in the default ontology format
        __CLR4_5_29i49i4lvico25k.R.inc(12492);manager.saveOntology(ontology);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how add an object property assertion (triple) of the
     * form prop(subject, object) for example hasPart(a, b).
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldAddObjectPropertyAssertions() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12493);
        __CLR4_5_29i49i4lvico25k.R.inc(12494);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12495);String base = "http://www.semanticweb.org/ontologies/individualsexample";
        __CLR4_5_29i49i4lvico25k.R.inc(12496);OWLOntology ont = man.createOntology(IRI.create(base));
        __CLR4_5_29i49i4lvico25k.R.inc(12497);OWLDataFactory dataFactory = man.getOWLDataFactory();
        // In this case, we would like to state that matthew has a father who is
        // peter. We need a subject and object - matthew is the subject and
        // peter is the object. We use the data factory to obtain references to
        // these individuals
        __CLR4_5_29i49i4lvico25k.R.inc(12498);OWLIndividual matthew = dataFactory.getOWLNamedIndividual(IRI.create(base + "#matthew"));
        __CLR4_5_29i49i4lvico25k.R.inc(12499);OWLIndividual peter = dataFactory.getOWLNamedIndividual(IRI.create(base + "#peter"));
        // We want to link the subject and object with the hasFather property,
        // so use the data factory to obtain a reference to this object
        // property.
        __CLR4_5_29i49i4lvico25k.R.inc(12500);OWLObjectProperty hasFather = dataFactory.getOWLObjectProperty(IRI.create(base + "#hasFather"));
        // Now create the actual assertion (triple), as an object property
        // assertion axiom matthew --> hasFather --> peter
        __CLR4_5_29i49i4lvico25k.R.inc(12501);OWLObjectPropertyAssertionAxiom assertion = dataFactory.getOWLObjectPropertyAssertionAxiom(hasFather, matthew,
            peter);
        // Finally, add the axiom to our ontology and save
        __CLR4_5_29i49i4lvico25k.R.inc(12502);AddAxiom addAxiomChange = new AddAxiom(ont, assertion);
        __CLR4_5_29i49i4lvico25k.R.inc(12503);man.applyChange(addAxiomChange);
        // We can also specify that matthew is an instance of Person. To do this
        // we use a ClassAssertion axiom. First we need a reference to the
        // person class
        __CLR4_5_29i49i4lvico25k.R.inc(12504);OWLClass personClass = dataFactory.getOWLClass(IRI.create(base + "#Person"));
        // Now we will create out Class Assertion to specify that matthew is an
        // instance of Person (or rather that Person has matthew as an instance)
        __CLR4_5_29i49i4lvico25k.R.inc(12505);OWLClassAssertionAxiom ax = dataFactory.getOWLClassAssertionAxiom(personClass, matthew);
        // Add this axiom to our ontology. We can use a short cut method -
        // instead of creating the AddAxiom change ourselves, it will be created
        // automatically and the change applied
        __CLR4_5_29i49i4lvico25k.R.inc(12506);man.addAxiom(ont, ax);
        // Save our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12507);man.saveOntology(ont, IRI.create("file:/tmp/example.owl"));
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * An example which shows how to "delete" entities, in this case
     * individuals, from and ontology.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldDeleteIndividuals() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12508);
        // The Koala ontology contains an individual of type Degree.
        // In this example we will delete it..
        __CLR4_5_29i49i4lvico25k.R.inc(12509);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12510);OWLOntology ont = load(man);
        // We can't directly delete individuals, properties or classes from an
        // ontology because ontologies don't directly contain entities -- they
        // are merely referenced by the axioms that the ontology contains. For
        // example, if an ontology contained a subclass axiom SubClassOf(A, B)
        // which stated A was a subclass of B, then that ontology would contain
        // references to classes A and B. If we essentially want to "delete"
        // classes A and B from this ontology we have to remove all axioms that
        // contain class A and class B in their SIGNATURE (in this case just one
        // axiom SubClassOf(A, B)). To do this, we can use the OWLEntityRemove
        // utility class, which will remove an entity (class, property or
        // individual) from a set of ontologies. Create the entity remover - in
        // this case we just want to remove the individuals from the
        // ontology, so pass our reference to the ontology in as a
        // singleton set.
        __CLR4_5_29i49i4lvico25k.R.inc(12511);OWLEntityRemover remover = new OWLEntityRemover(singleton(ont));
        // System.out.println("Number of individuals: "
        // + ont.getIndividualsInSignature().size());
        // Loop through each individual that is referenced in the
        // ontology, and ask it to accept a visit from the entity remover. The
        // remover will automatically accumulate the changes which are necessary
        // to remove the individual from the ontologies which it knows about
        __CLR4_5_29i49i4lvico25k.R.inc(12512);for (OWLNamedIndividual ind : ont.getIndividualsInSignature()) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12513);ind.accept(remover);
        }
        // Now we get all of the changes from the entity remover, which should
        // be applied to remove all of the individuals that we have visited from
        // the ontology. Notice that "batch" deletes can essentially be
        // performed - we simply visit all of the classes, properties and
        // individuals that we want to remove and then apply ALL of the changes
        // after using the entity remover to collect them
        }__CLR4_5_29i49i4lvico25k.R.inc(12514);man.applyChanges(remover.getChanges());
        // System.out.println("Number of individuals: "
        // + ont.getIndividualsInSignature().size());
        // At this point, if we wanted to reuse the entity remover, we would
        // have to reset it
        __CLR4_5_29i49i4lvico25k.R.inc(12515);remover.reset();
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * An example which shows how to create restrictions and add them as
     * superclasses of a class (i.e. "adding restrictions to classes")
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreateRestrictions() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12516);
        __CLR4_5_29i49i4lvico25k.R.inc(12517);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12518);String base = "http://org.semanticweb.restrictionexample";
        __CLR4_5_29i49i4lvico25k.R.inc(12519);OWLOntology ont = man.createOntology(IRI.create(base));
        // In this example we will add an axiom to state that all Heads have
        // parts that are noses (in fact, here we merely state that a Head has
        // at least one nose!). We do this by creating an existential (some)
        // restriction to describe the class of things which have a part that is
        // a nose (hasPart some Nose), and then we use this restriction in a
        // subclass axiom to state that Head is a subclass of things that have
        // parts that are Noses SubClassOf(Head, hasPart some Nose) -- in other
        // words, Heads have parts that are noses! First we need to obtain
        // references to our hasPart property and our Nose class
        __CLR4_5_29i49i4lvico25k.R.inc(12520);OWLDataFactory factory = man.getOWLDataFactory();
        __CLR4_5_29i49i4lvico25k.R.inc(12521);OWLObjectProperty hasPart = factory.getOWLObjectProperty(IRI.create(base + "#hasPart"));
        __CLR4_5_29i49i4lvico25k.R.inc(12522);OWLClass nose = factory.getOWLClass(IRI.create(base + "#Nose"));
        // Now create a restriction to describe the class of individuals that
        // have at least one part that is a kind of nose
        __CLR4_5_29i49i4lvico25k.R.inc(12523);OWLClassExpression hasPartSomeNose = factory.getOWLObjectSomeValuesFrom(hasPart, nose);
        // Obtain a reference to the Head class so that we can specify that
        // Heads have noses
        __CLR4_5_29i49i4lvico25k.R.inc(12524);OWLClass head = factory.getOWLClass(IRI.create(base + "#Head"));
        // We now want to state that Head is a subclass of hasPart some Nose, to
        // do this we create a subclass axiom, with head as the subclass and
        // "hasPart some Nose" as the superclass (remember, restrictions are
        // also classes - they describe classes of individuals -- they are
        // anonymous classes).
        __CLR4_5_29i49i4lvico25k.R.inc(12525);OWLSubClassOfAxiom ax = factory.getOWLSubClassOfAxiom(head, hasPartSomeNose);
        // Add the axiom to our ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12526);AddAxiom addAx = new AddAxiom(ont, ax);
        __CLR4_5_29i49i4lvico25k.R.inc(12527);man.applyChange(addAx);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * An example which shows how to interact with a reasoner. In this example
     * Pellet is used as the reasoner. You must get hold of the pellet libraries
     * from pellet.owldl.com.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldUseReasoner() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12528);
        // Create our ontology manager in the usual way.
        __CLR4_5_29i49i4lvico25k.R.inc(12529);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12530);OWLOntology ont = load(manager);
        // We need to create an instance of OWLReasoner. An OWLReasoner provides
        // the basic query functionality that we need, for example the ability
        // obtain the subclasses of a class etc. To do this we use a reasoner
        // factory. Create a reasoner factory. In this case, we will use HermiT,
        // but we could also use FaCT++ (http://code.google.com/p/factplusplus/)
        // or Pellet(http://clarkparsia.com/pellet) Note that (as of 03 Feb
        // 2010) FaCT++ and Pellet OWL API 3.0.0 compatible libraries are
        // expected to be available in the near future). For now, we'll use
        // HermiT HermiT can be downloaded from http://hermit-reasoner.com Make
        // sure you get the HermiT library and add it to your class path. You
        // can then instantiate the HermiT reasoner factory: Comment out the
        // first line below and uncomment the second line below to instantiate
        // the HermiT reasoner factory. You'll also need to import the
        // org.semanticweb.HermiT.Reasoner package.
        __CLR4_5_29i49i4lvico25k.R.inc(12531);OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        // OWLReasonerFactory reasonerFactory = new Reasoner.ReasonerFactory();
        // We'll now create an instance of an OWLReasoner (the implementation
        // being provided by HermiT as we're using the HermiT reasoner factory).
        // The are two categories of reasoner, Buffering and NonBuffering. In
        // our case, we'll create the buffering reasoner, which is the default
        // kind of reasoner. We'll also attach a progress monitor to the
        // reasoner. To do this we set up a configuration that knows about a
        // progress monitor. Create a console progress monitor. This will print
        // the reasoner progress out to the console.
        // ConsoleProgressMonitor progressMonitor = new
        // ConsoleProgressMonitor();
        // Specify the progress monitor via a configuration. We could also
        // specify other setup parameters in the configuration, and different
        // reasoners may accept their own defined parameters this way.
        // OWLReasonerConfiguration config = new SimpleConfiguration(
        // progressMonitor);
        // Create a reasoner that will reason over our ontology and its imports
        // closure. Pass in the configuration.
        // OWLReasoner reasoner = reasonerFactory.createReasoner(ont, config);
        __CLR4_5_29i49i4lvico25k.R.inc(12532);OWLReasoner reasoner = reasonerFactory.createReasoner(ont);
        // Ask the reasoner to do all the necessary work now
        __CLR4_5_29i49i4lvico25k.R.inc(12533);reasoner.precomputeInferences();
        // We can determine if the ontology is actually consistent (in this
        // case, it should be).
        __CLR4_5_29i49i4lvico25k.R.inc(12534);boolean consistent = reasoner.isConsistent();
        // System.out.println("Consistent: " + consistent);
        // We can easily get a list of unsatisfiable classes. (A class is
        // unsatisfiable if it can't possibly have any instances). Note that the
        // getUnsatisfiableClasses method is really just a convenience method
        // for obtaining the classes that are equivalent to owl:Nothing.
        __CLR4_5_29i49i4lvico25k.R.inc(12535);Node<OWLClass> bottomNode = reasoner.getUnsatisfiableClasses();
        // This node contains owl:Nothing and all the classes that are
        // equivalent to owl:Nothing - i.e. the unsatisfiable classes. We just
        // want to print out the unsatisfiable classes excluding owl:Nothing,
        // and we can used a convenience method on the node to get these
        __CLR4_5_29i49i4lvico25k.R.inc(12536);Set<OWLClass> unsatisfiable = bottomNode.getEntitiesMinusBottom();
        __CLR4_5_29i49i4lvico25k.R.inc(12537);if ((((!unsatisfiable.isEmpty())&&(__CLR4_5_29i49i4lvico25k.R.iget(12538)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12539)==0&false))) {{
            // System.out.println("The following classes are unsatisfiable: ");
            __CLR4_5_29i49i4lvico25k.R.inc(12540);for (OWLClass cls : unsatisfiable) {{
                // System.out.println(" " + cls);
            }
        }} }else {{
            // System.out.println("There are no unsatisfiable classes");
        }
        // Now we want to query the reasoner for all descendants of Marsupial.
        // Vegetarians are defined in the ontology to be animals that don't eat
        // animals or parts of animals.
        }__CLR4_5_29i49i4lvico25k.R.inc(12541);OWLDataFactory fac = manager.getOWLDataFactory();
        // Get a reference to the vegetarian class so that we can as the
        // reasoner about it. The full IRI of this class happens to be:
        // <http://protege.stanford.edu/plugins/owl/owl-library/koala.owl#Marsupials>
        __CLR4_5_29i49i4lvico25k.R.inc(12542);OWLClass marsupials = fac.getOWLClass(IRI.create(
            "http://protege.stanford.edu/plugins/owl/owl-library/koala.owl#Marsupials"));
        // Now use the reasoner to obtain the subclasses of Marsupials. We can
        // ask for the direct subclasses or all of the (proper)
        // subclasses. In this case we just want the direct ones
        // (which we specify by the "true" flag).
        __CLR4_5_29i49i4lvico25k.R.inc(12543);NodeSet<OWLClass> subClses = reasoner.getSubClasses(marsupials, true);
        // The reasoner returns a NodeSet, which represents a set of Nodes. Each
        // node in the set represents a subclass of Marsupial. A node of
        // classes contains classes, where each class in the node is equivalent.
        // For example, if we asked for the subclasses of some class A and got
        // back a NodeSet containing two nodes {B, C} and {D}, then A would have
        // two proper subclasses. One of these subclasses would be equivalent to
        // the class D, and the other would be the class that is equivalent to
        // class B and class C. In this case, we don't particularly care about
        // the equivalences, so we will flatten this set of sets and print the
        // result
        __CLR4_5_29i49i4lvico25k.R.inc(12544);Set<OWLClass> clses = subClses.getFlattened();
        // for (OWLClass cls : clses) {
        // System.out.println(" " + cls);
        // }
        // We can easily
        // retrieve the instances of a class. In this example we'll obtain the
        // instances of the class Marsupials.
        __CLR4_5_29i49i4lvico25k.R.inc(12545);NodeSet<OWLNamedIndividual> individualsNodeSet = reasoner.getInstances(marsupials, false);
        // The reasoner returns a NodeSet again. This time the NodeSet contains
        // individuals. Again, we just want the individuals, so get a flattened
        // set.
        __CLR4_5_29i49i4lvico25k.R.inc(12546);Set<OWLNamedIndividual> individuals = individualsNodeSet.getFlattened();
        // for (OWLNamedIndividual ind : individuals) {
        // System.out.println(" " + ind);
        // }
        // Again, it's worth noting that not all of the individuals that are
        // returned were explicitly stated to be marsupials. Finally, we can ask
        // for the property values (property assertions in OWL speak) for a
        // given
        // individual and property.
        // Let's get all properties for all individuals
        __CLR4_5_29i49i4lvico25k.R.inc(12547);for (OWLNamedIndividual i : ont.getIndividualsInSignature()) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12548);for (OWLObjectProperty p : ont.getObjectPropertiesInSignature()) {{
                __CLR4_5_29i49i4lvico25k.R.inc(12549);NodeSet<OWLNamedIndividual> individualValues = reasoner.getObjectPropertyValues(i, p);
                __CLR4_5_29i49i4lvico25k.R.inc(12550);Set<OWLNamedIndividual> values = individualValues.getFlattened();
                // System.out.println("The property values for "+p+" for
                // individual "+i+" are: ");
                // for (OWLNamedIndividual ind : values) {
                // System.out.println(" " + ind);
                // }
            }
        }}
        // Finally, let's print out the class hierarchy.
        }__CLR4_5_29i49i4lvico25k.R.inc(12551);Node<OWLClass> topNode = reasoner.getTopClassNode();
        __CLR4_5_29i49i4lvico25k.R.inc(12552);print(topNode, reasoner, 0);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    private static void print(@Nonnull Node<OWLClass> parent, @Nonnull OWLReasoner reasoner, int depth) {try{__CLR4_5_29i49i4lvico25k.R.inc(12553);
        // We don't want to print out the bottom node (containing owl:Nothing
        // and unsatisfiable classes) because this would appear as a leaf node
        // everywhere
        __CLR4_5_29i49i4lvico25k.R.inc(12554);if ((((parent.isBottomNode())&&(__CLR4_5_29i49i4lvico25k.R.iget(12555)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12556)==0&false))) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12557);return;
        }
        // Print an indent to denote parent-child relationships
        }__CLR4_5_29i49i4lvico25k.R.inc(12558);printIndent(depth);
        // Now print the node (containing the child classes)
        __CLR4_5_29i49i4lvico25k.R.inc(12559);printNode(parent);
        __CLR4_5_29i49i4lvico25k.R.inc(12560);for (Node<OWLClass> child : reasoner.getSubClasses(parent.getRepresentativeElement(), true)) {{
            assert (((child != null)&&(__CLR4_5_29i49i4lvico25k.R.iget(12561)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12562)==0&false));
            // Recurse to do the children. Note that we don't have to worry
            // about cycles as there are non in the inferred class hierarchy
            // graph - a cycle gets collapsed into a single node since each
            // class in the cycle is equivalent.
            __CLR4_5_29i49i4lvico25k.R.inc(12563);print(child, reasoner, depth + 1);
        }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    private static void printIndent(int depth) {try{__CLR4_5_29i49i4lvico25k.R.inc(12564);
        __CLR4_5_29i49i4lvico25k.R.inc(12565);for (int i = 0; (((i < depth)&&(__CLR4_5_29i49i4lvico25k.R.iget(12566)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12567)==0&false)); i++) {{
            // System.out.print(" ");
        }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    private static void printNode(@Nonnull Node<OWLClass> node) {try{__CLR4_5_29i49i4lvico25k.R.inc(12568);
        // The default prefix used here is only an example.
        // For real ontologies, choose a meaningful prefix - the best
        // choice depends on the actual ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12569);DefaultPrefixManager pm = new DefaultPrefixManager(null, null, "http://owl.man.ac.uk/2005/07/sssw/people#");
        // Print out a node as a list of class names in curly brackets
        __CLR4_5_29i49i4lvico25k.R.inc(12570);for (Iterator<OWLClass> it = node.getEntities().iterator(); (((it.hasNext())&&(__CLR4_5_29i49i4lvico25k.R.iget(12571)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12572)==0&false));) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12573);OWLClass cls = it.next();
            // User a prefix manager to provide a slightly nicer shorter name
            __CLR4_5_29i49i4lvico25k.R.inc(12574);String shortForm = pm.getShortForm(cls);
            __CLR4_5_29i49i4lvico25k.R.inc(12575);assertNotNull(shortForm);
        }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to examine the restrictions on a class.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldLookAtRestrictions() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12576);
        // Create our manager
        __CLR4_5_29i49i4lvico25k.R.inc(12577);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        // Load the Koala ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12578);OWLOntology ont = load(man);
        // We want to examine the restrictions on Quokka. To do this,
        // we need to obtain a reference to the Quokka class. In this
        // case, we know the IRI (it happens to be the ontology IRI + #Quokka
        // This isn't always the case. A class may have a IRI that bears no
        // resemblance to the ontology IRI which contains axioms about the
        // class.
        __CLR4_5_29i49i4lvico25k.R.inc(12579);IRI quokkaIRI = IRI.create(ont.getOntologyID().getOntologyIRI().get() + "#Quokka");
        __CLR4_5_29i49i4lvico25k.R.inc(12580);OWLClass quokka = man.getOWLDataFactory().getOWLClass(quokkaIRI);
        // Now we want to collect the properties which are used in existential
        // restrictions on the class. To do this, we will create a utility class
        // - RestrictionVisitor, which acts as a filter for existential
        // restrictions. This uses the Visitor Pattern (google Visitor Design
        // Pattern for more information on this design pattern, or see
        // http://en.wikipedia.org/wiki/Visitor_pattern)
        __CLR4_5_29i49i4lvico25k.R.inc(12581);RestrictionVisitor restrictionVisitor = new RestrictionVisitor(singleton(ont));
        // In this case, restrictions are used as (anonymous) superclasses, so
        // to get the restrictions on quokka we need to obtain the
        // subclass axioms for quokka.
        __CLR4_5_29i49i4lvico25k.R.inc(12582);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(quokka)) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12583);ax.getSuperClass().accept(restrictionVisitor);
        }
        // Ask our superclass to accept a visit from the RestrictionVisitor
        // - if it is an existential restiction then our restriction visitor
        // will answer it - if not our visitor will ignore it
        // Our RestrictionVisitor has now collected all of the properties that
        // have been restricted in existential restrictions - print them out.
        // System.out.println("Restricted properties for " + quokka
        // + ": " + restrictionVisitor.getRestrictedProperties().size());
        // for (OWLObjectPropertyExpression prop : restrictionVisitor
        // .getRestrictedProperties()) {
        // System.out.println(" " + prop);
        // }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * Visits existential restrictions and collects the properties which are
     * restricted.
     */
    private static class RestrictionVisitor extends OWLClassExpressionVisitorAdapter {

        @Nonnull
        private final Set<OWLClass> processedClasses;
        private final Set<OWLOntology> onts;

        RestrictionVisitor(Set<OWLOntology> onts) {try{__CLR4_5_29i49i4lvico25k.R.inc(12584);
            __CLR4_5_29i49i4lvico25k.R.inc(12585);processedClasses = new HashSet<OWLClass>();
            __CLR4_5_29i49i4lvico25k.R.inc(12586);this.onts = onts;
        }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_29i49i4lvico25k.R.inc(12587);
            __CLR4_5_29i49i4lvico25k.R.inc(12588);if ((((!processedClasses.contains(ce))&&(__CLR4_5_29i49i4lvico25k.R.iget(12589)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12590)==0&false))) {{
                // If we are processing inherited restrictions then we
                // recursively visit named supers. Note that we need to keep
                // track of the classes that we have processed so that we don't
                // get caught out by cycles in the taxonomy
                __CLR4_5_29i49i4lvico25k.R.inc(12591);processedClasses.add(ce);
                __CLR4_5_29i49i4lvico25k.R.inc(12592);for (OWLOntology ont : onts) {{
                    __CLR4_5_29i49i4lvico25k.R.inc(12593);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(ce)) {{
                        __CLR4_5_29i49i4lvico25k.R.inc(12594);ax.getSuperClass().accept(this);
                    }
                }}
            }}
        }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_29i49i4lvico25k.R.inc(12595);
            // This method gets called when a class expression is an existential
            // (someValuesFrom) restriction and it asks us to visit it
        }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}
    }

    /**
     * This example shows how to create and read annotations.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreateAndReadAnnotations() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12596);
        // Create our manager
        __CLR4_5_29i49i4lvico25k.R.inc(12597);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        // Load the Koala ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12598);OWLOntology ont = load(man);
        // We want to add a comment to the Quokka class. First, we need to
        // obtain
        // a reference to the class
        __CLR4_5_29i49i4lvico25k.R.inc(12599);OWLClass quokka = df.getOWLClass(IRI.create(ont.getOntologyID().getOntologyIRI().get() + "#Quokka"));
        // Now we create the content of our comment. In this case we simply want
        // a plain string literal. We'll attach a language to the comment to
        // specify that our comment is written in English (en).
        __CLR4_5_29i49i4lvico25k.R.inc(12600);OWLAnnotation commentAnno = df.getOWLAnnotation(df.getRDFSComment(), df.getOWLLiteral(
            "A class which represents quokkas", "en"));
        // Specify that the class has an annotation - to do this we attach
        // an entity annotation using an entity annotation axiom (remember,
        // classes are entities)
        __CLR4_5_29i49i4lvico25k.R.inc(12601);OWLAxiom ax = df.getOWLAnnotationAssertionAxiom(quokka.getIRI(), commentAnno);
        // Add the axiom to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12602);man.applyChange(new AddAxiom(ont, ax));
        // Now lets add a version info annotation to the ontology. There is no
        // 'standard' OWL annotation object for this, like there is for
        // comments and labels, so the creation of the annotation is a bit more
        // involved. First we'll create a constant for the annotation value.
        // Version info should probably contain a version number for the
        // ontology, but in this case, we'll add some text to describe why the
        // version has been updated
        __CLR4_5_29i49i4lvico25k.R.inc(12603);OWLLiteral lit = df.getOWLLiteral("Added a comment to the quokka class");
        // The above constant is just a plain literal containing the version
        // info text/comment we need to create an annotation, which pairs a IRI
        // with the constant
        __CLR4_5_29i49i4lvico25k.R.inc(12604);OWLAnnotation anno = df.getOWLAnnotation(df.getOWLVersionInfo(), lit);
        // Now we can add this as an ontology annotation Apply the change in the
        // usual way
        __CLR4_5_29i49i4lvico25k.R.inc(12605);man.applyChange(new AddOntologyAnnotation(ont, anno));
        // It is worth noting that literals
        // can be typed or untyped. If literals are untyped then they can have
        // language tags, which are optional - typed literals cannot have
        // language tags. For each class in the ontology, we retrieve its
        // annotations and sift through them. If the annotation annotates the
        // class with a constant which is untyped then we check the language tag
        // to see if it is English. Firstly, get the annotation property for
        // rdfs:label
        __CLR4_5_29i49i4lvico25k.R.inc(12606);OWLAnnotationProperty label = df.getOWLAnnotationProperty(OWLRDFVocabulary.RDFS_LABEL.getIRI());
        __CLR4_5_29i49i4lvico25k.R.inc(12607);for (OWLClass cls : ont.getClassesInSignature()) {{
            // Get the annotations on the class that use the label property
            __CLR4_5_29i49i4lvico25k.R.inc(12608);for (OWLOntology o : ont.getImportsClosure()) {{
                __CLR4_5_29i49i4lvico25k.R.inc(12609);for (OWLAnnotation annotation : annotationObjects(o.getAnnotationAssertionAxioms(cls.getIRI()),
                    label)) {{
                    __CLR4_5_29i49i4lvico25k.R.inc(12610);if ((((annotation.getValue() instanceof OWLLiteral)&&(__CLR4_5_29i49i4lvico25k.R.iget(12611)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12612)==0&false))) {{
                        __CLR4_5_29i49i4lvico25k.R.inc(12613);OWLLiteral val = (OWLLiteral) annotation.getValue();
                        __CLR4_5_29i49i4lvico25k.R.inc(12614);if ((((val.hasLang("pt"))&&(__CLR4_5_29i49i4lvico25k.R.iget(12615)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12616)==0&false))) {{
                            // System.out.println(cls + " -> " +
                            // val.getLiteral());
                        }
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to generate an ontology containing some inferred
     * information.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldCreateInferredAxioms() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12617);
        // Create a reasoner factory.
        // See Profiles for a list of known reasoner factories; note that you
        // will need to add the reasoner and any dependency to the classpath for
        // this to work.
        // The structural reasoner is a mock reasoner that does no inferences;
        // it is used only for examples.
        __CLR4_5_29i49i4lvico25k.R.inc(12618);OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        // Uncomment the line below reasonerFactory = new
        // PelletReasonerFactory(); Load an example ontology - for the purposes
        // of the example, we will just load the ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12619);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12620);OWLOntology ont = load(man);
        // Create the reasoner and classify the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12621);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(ont);
        __CLR4_5_29i49i4lvico25k.R.inc(12622);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        // To generate an inferred ontology we use implementations of inferred
        // axiom generators to generate the parts of the ontology we want (e.g.
        // subclass axioms, equivalent classes axioms, class assertion axiom
        // etc. - see the org.semanticweb.owlapi.util package for more
        // implementations). Set up our list of inferred axiom generators
        __CLR4_5_29i49i4lvico25k.R.inc(12623);List<InferredAxiomGenerator<? extends OWLAxiom>> gens = new ArrayList<InferredAxiomGenerator<? extends OWLAxiom>>();
        __CLR4_5_29i49i4lvico25k.R.inc(12624);gens.add(new InferredSubClassAxiomGenerator());
        // Put the inferred axioms into a fresh empty ontology - note that there
        // is nothing stopping us stuffing them back into the original asserted
        // ontology if we wanted to do this.
        __CLR4_5_29i49i4lvico25k.R.inc(12625);OWLOntology infOnt = man.createOntology();
        // Now get the inferred ontology generator to generate some inferred
        // axioms for us (into our fresh ontology). We specify the reasoner that
        // we want to use and the inferred axiom generators that we want to use.
        __CLR4_5_29i49i4lvico25k.R.inc(12626);InferredOntologyGenerator iog = new InferredOntologyGenerator(reasoner, gens);
        __CLR4_5_29i49i4lvico25k.R.inc(12627);iog.fillOntology(man.getOWLDataFactory(), infOnt);
        // Save the inferred ontology. (Replace the IRI with one that is
        // appropriate for your setup)
        __CLR4_5_29i49i4lvico25k.R.inc(12628);man.saveOntology(infOnt, new StringDocumentTarget());
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to merge to ontologies (by simply combining axioms
     * from one ontology into another ontology).
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldMergeOntologies() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12629);
        // Just load two arbitrary ontologies for the purposes of this example
        __CLR4_5_29i49i4lvico25k.R.inc(12630);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12631);load(man);
        __CLR4_5_29i49i4lvico25k.R.inc(12632);OWLOntology o = man.createOntology(IRI.create("urn:test"));
        __CLR4_5_29i49i4lvico25k.R.inc(12633);man.addAxiom(o, man.getOWLDataFactory().getOWLDeclarationAxiom(man.getOWLDataFactory().getOWLClass(IRI.create(
            "urn:testclass"))));
        // Create our ontology merger
        __CLR4_5_29i49i4lvico25k.R.inc(12634);OWLOntologyMerger merger = new OWLOntologyMerger(man);
        // We merge all of the loaded ontologies. Since an OWLOntologyManager is
        // an OWLOntologySetProvider we just pass this in. We also need to
        // specify the IRI of the new ontology that will be created.
        __CLR4_5_29i49i4lvico25k.R.inc(12635);IRI mergedOntologyIRI = IRI.create("http://www.semanticweb.com/mymergedont");
        __CLR4_5_29i49i4lvico25k.R.inc(12636);OWLOntology merged = merger.createMergedOntology(man, mergedOntologyIRI);
        // Print out the axioms in the merged ontology.
        // for (OWLAxiom ax : merged.getAxioms()) {
        // System.out.println(ax);
        // }
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldWalkOntology() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12637);
        // This example shows how to use an ontology walker to walk the asserted
        // structure of an ontology. Suppose we want to find the axioms that use
        // a some values from (existential restriction) we can use the walker to
        // do this. We'll use the Koala ontology as an example. Load the
        // ontology from the web:
        __CLR4_5_29i49i4lvico25k.R.inc(12638);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12639);OWLOntology ont = load(man);
        // Create the walker. Pass in the koala ontology - we need to put it
        // into a set though, so we just create a singleton set in this case.
        __CLR4_5_29i49i4lvico25k.R.inc(12640);OWLOntologyWalker walker = new OWLOntologyWalker(singleton(ont));
        // Now ask our walker to walk over the ontology. We specify a visitor
        // who gets visited by the various objects as the walker encounters
        // them. We need to create out visitor. This can be any ordinary
        // visitor, but we will extend the OWLOntologyWalkerVisitor because it
        // provides a convenience method to get the current axiom being visited
        // as we go. Create an instance and override the
        // visit(OWLObjectSomeValuesFrom) method, because we are interested in
        // some values from restrictions.
        __CLR4_5_29i49i4lvico25k.R.inc(12641);OWLOntologyWalkerVisitorEx<Object> visitor = new OWLOntologyWalkerVisitorEx<Object>(walker) {

            @Override
            public Object visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_29i49i4lvico25k.R.inc(12642);
                // Print out the restriction
                // System.out.println(desc);
                // Print out the axiom where the restriction is used
                // System.out.println(" " + getCurrentAxiom());
                // We don't need to return anything here.
                __CLR4_5_29i49i4lvico25k.R.inc(12643);return "";
            }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}
        };
        // Now ask the walker to walk over the ontology structure using our
        // visitor instance.
        __CLR4_5_29i49i4lvico25k.R.inc(12644);walker.walkStructure(visitor);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldQueryWithReasoner() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12645);
        // We will load the Koala ontology and query it using a reasoner
        __CLR4_5_29i49i4lvico25k.R.inc(12646);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        __CLR4_5_29i49i4lvico25k.R.inc(12647);OWLOntology ont = load(man);
        // For this particular ontology, we know that all class, properties
        // names etc. have IRIs that is made up of the ontology IRI plus # plus
        // the local name
        __CLR4_5_29i49i4lvico25k.R.inc(12648);String prefix = ont.getOntologyID().getOntologyIRI().get() + "#";
        // Create a reasoner. We will use Pellet in this case. Make sure that
        // the latest version of the Pellet libraries are on the runtime class
        // path
        __CLR4_5_29i49i4lvico25k.R.inc(12649);OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        // Uncomment the line below reasonerFactory = new
        // PelletReasonerFactory();
        __CLR4_5_29i49i4lvico25k.R.inc(12650);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(ont);
        // Now we can query the reasoner, suppose we want to determine the
        // properties that instances of Quokka must have
        __CLR4_5_29i49i4lvico25k.R.inc(12651);OWLClass quokka = man.getOWLDataFactory().getOWLClass(IRI.create(prefix, "Quokka"));
        // printProperties(man, ont, reasoner, quokka);
        // We can also ask if the instances of a class must have a property
        __CLR4_5_29i49i4lvico25k.R.inc(12652);OWLClass koala = man.getOWLDataFactory().getOWLClass(IRI.create(prefix, "KoalaWithPhD"));
        __CLR4_5_29i49i4lvico25k.R.inc(12653);OWLObjectProperty hasDegree = man.getOWLDataFactory().getOWLObjectProperty(IRI.create(prefix + "hasDegree"));
        __CLR4_5_29i49i4lvico25k.R.inc(12654);if ((((hasProperty(man, reasoner, koala, hasDegree))&&(__CLR4_5_29i49i4lvico25k.R.iget(12655)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12656)==0&false))) {{
            // System.out.println("Instances of " + koala
            // + " have a degree");
        }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    private static boolean hasProperty(@Nonnull OWLOntologyManager man, @Nonnull OWLReasoner reasoner, OWLClass cls,
        @Nonnull OWLObjectPropertyExpression prop) {try{__CLR4_5_29i49i4lvico25k.R.inc(12657);
        // To test whether the instances of a class must have a property we
        // create a some values from restriction and then ask for the
        // satisfiability of the class interesected with the complement of this
        // some values from restriction. If the intersection is satisfiable then
        // the instances of the class don't have to have the property,
        // otherwise, they do.
        __CLR4_5_29i49i4lvico25k.R.inc(12658);OWLDataFactory dataFactory = man.getOWLDataFactory();
        __CLR4_5_29i49i4lvico25k.R.inc(12659);OWLClassExpression restriction = dataFactory.getOWLObjectSomeValuesFrom(prop, dataFactory.getOWLThing());
        // Now we see if the intersection of the class and the complement of
        // this restriction is satisfiable
        __CLR4_5_29i49i4lvico25k.R.inc(12660);OWLClassExpression complement = dataFactory.getOWLObjectComplementOf(restriction);
        __CLR4_5_29i49i4lvico25k.R.inc(12661);OWLClassExpression intersection = dataFactory.getOWLObjectIntersectionOf(cls, complement);
        __CLR4_5_29i49i4lvico25k.R.inc(12662);return !reasoner.isSatisfiable(intersection);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to use IRI mappers to redirect imports and
     * loading.
     * 
     * @throws Exception
     *         exception
     */
    @Ignore("This test is ignored. We do not want to fetch stuff from the network just to run a unit test for an example")
    @Test
    public void shouldUseIRIMappers() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12663);
        __CLR4_5_29i49i4lvico25k.R.inc(12664);IRI mgedOntologyIri = IRI.create("http://mged.sourceforge.net/ontologies/MGEDOntology.owl");
        __CLR4_5_29i49i4lvico25k.R.inc(12665);IRI protegeOntologyIri = IRI.create("http://protege.stanford.edu/plugins/owl/protege");
        __CLR4_5_29i49i4lvico25k.R.inc(12666);IRI tonesRepositoryIri = IRI.create("http://owl.cs.manchester.ac.uk/repository/download");
        // Create a manager to work with
        __CLR4_5_29i49i4lvico25k.R.inc(12667);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // Load the MGED ontology. There is a copy of the MGED ontology located
        // at the address pointed to by its ontology IRI (this is good practice
        // and is recommended in the OWL 2 spec).
        __CLR4_5_29i49i4lvico25k.R.inc(12668);OWLOntology ontology = manager.loadOntology(mgedOntologyIri);
        // Print out the ontology IRI and its imported ontology IRIs
        __CLR4_5_29i49i4lvico25k.R.inc(12669);printOntologyAndImports(manager, ontology);
        // We'll load the MGED ontology again, but this time, we'll get the
        // Protege ontology (that it imports) from the TONES repository. To tell
        // the ontology manager to do this we need to add an IRI mapper. We need
        // an implementation of OWLOntologyIRIMapper. Given and IRI and
        // OWLOntologyIRIMapper simply returns some other IRI. There are quite a
        // few implementations of IRI mapper in the OWL API, here we will just
        // use a really basic implementation that maps a specific IRI to another
        // specific IRI. Create a mapper that maps the Protege ontology IRI to
        // the document IRI that points to a copy in the TONES ontology
        // repository.
        __CLR4_5_29i49i4lvico25k.R.inc(12670);IRI protegeOntologyDocumentIRI = getTONESRepositoryDocumentIRI(protegeOntologyIri, tonesRepositoryIri);
        __CLR4_5_29i49i4lvico25k.R.inc(12671);OWLOntologyIRIMapper iriMapper = new SimpleIRIMapper(protegeOntologyIri, protegeOntologyDocumentIRI);
        // Create a new manager that we will use to load the MGED ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12672);OWLOntologyManager manager2 = OWLManager.createOWLOntologyManager();
        // Register our mapper with the manager
        __CLR4_5_29i49i4lvico25k.R.inc(12673);manager2.getIRIMappers().add(iriMapper);
        // Now load our MGED ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12674);OWLOntology ontology2 = load(manager2);
        // Print out the details
        __CLR4_5_29i49i4lvico25k.R.inc(12675);printOntologyAndImports(manager2, ontology2);
        // Notice that the document IRI of the protege ontology is different to
        // the document IRI of the ontology when it was loaded the first time.
        // This is due to the mapper redirecting the ontology loader. For
        // example, AutoIRIMapper: An AutoIRIMapper finds ontologies in a local
        // folder and maps their IRIs to their locations in this folder We
        // specify a directory/folder where the ontologies are located. In this
        // case we've just specified the tmp directory.
        __CLR4_5_29i49i4lvico25k.R.inc(12676);@Nonnull
        File file = folder.newFolder();
        // We can also specify a flag to indicate whether the directory should
        // be searched recursively.
        __CLR4_5_29i49i4lvico25k.R.inc(12677);OWLOntologyIRIMapper autoIRIMapper = new AutoIRIMapper(file, false);
        // We can now use this mapper in the usual way, i.e.
        __CLR4_5_29i49i4lvico25k.R.inc(12678);manager2.getIRIMappers().add(autoIRIMapper);
        // Of course, applications (such as Protege) usually implement their own
        // mappers to deal with specific application requirements.
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    private static void printOntologyAndImports(@Nonnull OWLOntologyManager manager, @Nonnull OWLOntology ontology) {try{__CLR4_5_29i49i4lvico25k.R.inc(12679);
        // Print ontology IRI and where it was loaded from (they will be the
        // same)
        __CLR4_5_29i49i4lvico25k.R.inc(12680);printOntology(manager, ontology);
        // List the imported ontologies
        __CLR4_5_29i49i4lvico25k.R.inc(12681);for (OWLOntology o : ontology.getImports()) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12682);printOntology(manager, o);
        }
    }}finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * Prints the IRI of an ontology and its document IRI.
     * 
     * @param manager
     *        The manager that manages the ontology
     * @param ontology
     *        The ontology
     */
    private static void printOntology(@Nonnull OWLOntologyManager manager, @Nonnull OWLOntology ontology) {try{__CLR4_5_29i49i4lvico25k.R.inc(12683);
        __CLR4_5_29i49i4lvico25k.R.inc(12684);IRI ontologyIRI = ontology.getOntologyID().getOntologyIRI().get();
        __CLR4_5_29i49i4lvico25k.R.inc(12685);IRI documentIRI = manager.getOntologyDocumentIRI(ontology);
        // System.out.println(ontologyIRI == null ? "anonymous" : ontologyIRI
        // .toQuotedString());
        // System.out.println(" from " + documentIRI.toQuotedString());
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * Convenience method that obtains the document IRI of an ontology contained
     * in the TONES ontology repository given the ontology IRI. The TONES
     * repository contains various ontologies of interest to reasoner developers
     * and tools developers. Ontologies in the repository may be accessed in a
     * RESTful way (see http://owl.cs.manchester.ac.uk/repository/) for more
     * details). We basically get an ontology by specifying the repository IRI
     * with an ontology query parameter that has the ontology IRI that we're
     * after as its value.
     * 
     * @param ontologyIRI
     *        The IRI of the ontology.
     * @param tones
     *        tones iri
     * @return The document IRI of the ontology in the TONES repository.
     */
    @Nonnull
    private static IRI getTONESRepositoryDocumentIRI(IRI ontologyIRI, IRI tones) {try{__CLR4_5_29i49i4lvico25k.R.inc(12686);
        __CLR4_5_29i49i4lvico25k.R.inc(12687);return IRI.create(tones + "?ontology=" + ontologyIRI);
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * This example shows how to extract modules.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void shouldExtractModules() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12688);
        // Create our manager
        __CLR4_5_29i49i4lvico25k.R.inc(12689);OWLOntologyManager man = OWLManager.createOWLOntologyManager();
        // Load the Koala ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12690);OWLOntology ont = load(man);
        // We want to extract a module for all toppings. We therefore have to
        // generate a seed signature that contains "Quokka" and its
        // subclasses. We start by creating a signature that consists of
        // "Quokka".
        __CLR4_5_29i49i4lvico25k.R.inc(12691);OWLClass toppingCls = df.getOWLClass(IRI.create(ont.getOntologyID().getOntologyIRI().get() + "#Quokka"));
        __CLR4_5_29i49i4lvico25k.R.inc(12692);Set<OWLEntity> sig = new HashSet<OWLEntity>();
        __CLR4_5_29i49i4lvico25k.R.inc(12693);sig.add(toppingCls);
        // We now add all subclasses (direct and indirect) of the chosen
        // classes. Ideally, it should be done using a DL reasoner, in order to
        // take inferred subclass relations into account. We are using the
        // structural reasoner of the OWL API for simplicity.
        __CLR4_5_29i49i4lvico25k.R.inc(12694);Set<OWLEntity> seedSig = new HashSet<OWLEntity>();
        __CLR4_5_29i49i4lvico25k.R.inc(12695);OWLReasoner reasoner = new StructuralReasoner(ont, new SimpleConfiguration(), BufferingMode.NON_BUFFERING);
        __CLR4_5_29i49i4lvico25k.R.inc(12696);for (OWLEntity ent : sig) {{
            __CLR4_5_29i49i4lvico25k.R.inc(12697);seedSig.add(ent);
            __CLR4_5_29i49i4lvico25k.R.inc(12698);if ((((OWLClass.class.isAssignableFrom(ent.getClass()))&&(__CLR4_5_29i49i4lvico25k.R.iget(12699)!=0|true))||(__CLR4_5_29i49i4lvico25k.R.iget(12700)==0&false))) {{
                __CLR4_5_29i49i4lvico25k.R.inc(12701);NodeSet<OWLClass> subClasses = reasoner.getSubClasses((OWLClass) ent, false);
                __CLR4_5_29i49i4lvico25k.R.inc(12702);seedSig.addAll(subClasses.getFlattened());
            }
        }}
        // We now extract a locality-based module. For most reuse purposes, the
        // module type should be STAR -- this yields the smallest possible
        // locality-based module. These modules guarantee that all entailments
        // of the original ontology that can be formulated using only terms from
        // the seed signature or the module will also be entailments of the
        // module. In easier words, the module preserves all knowledge of the
        // ontology about the terms in the seed signature or the module.
        }__CLR4_5_29i49i4lvico25k.R.inc(12703);SyntacticLocalityModuleExtractor sme = new SyntacticLocalityModuleExtractor(man, ont, ModuleType.STAR);
        __CLR4_5_29i49i4lvico25k.R.inc(12704);IRI moduleIRI = IRI.create("urn:test:QuokkaModule.owl");
        __CLR4_5_29i49i4lvico25k.R.inc(12705);OWLOntology mod = sme.extractAsOntology(seedSig, moduleIRI);
        // The module can now be saved as usual
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}

    /**
     * The following example uses entities and axioms that are used in the OWL
     * Primer. The purpose of this example is to illustrate some of the methods
     * of creating class expressions and various types of axioms. Typically, an
     * ontology wouldn't be constructed programmatically in a long drawn out
     * fashion like this, it would be constructe in an ontology editor such as
     * Protege 4, or Swoop. The OWL API would then be used to examine the
     * asserted structure of the ontology, and in conjunction with an OWL
     * reasoner such as FaCT++ or Pellet used to query the inferred ontology.
     * 
     * @throws Exception
     *         exception
     */
    @Test
    public void owlPrimer() throws Exception {try{__CLR4_5_29i49i4lvico25k.R.inc(12706);
        // The OWLOntologyManager is at the heart of the OWL API, we can create
        // an instance of this using the OWLManager class, which will set up
        // commonly used options (such as which parsers are registered etc.
        // etc.)
        __CLR4_5_29i49i4lvico25k.R.inc(12707);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // We want to create an ontology that corresponds to the ontology used
        // in the OWL Primer. Every ontology has a IRI that uniquely identifies
        // the ontology. The IRI is essentially a name for the ontology. Note
        // that the IRI doesn't necessarily point to a location on the web - in
        // this example, we won't publish the ontology at the URL corresponding
        // to the ontology IRI below.
        __CLR4_5_29i49i4lvico25k.R.inc(12708);IRI ontologyIRI = IRI.create("http://example.com/owlapi/families");
        // Now that we have a IRI for out ontology, we can create the actual
        // ontology. Note that the create ontology method throws an
        // OWLOntologyCreationException if there was a problem creating the
        // ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12709);OWLOntology ont = manager.createOntology(ontologyIRI);
        // We can use the manager to get a reference to an OWLDataFactory. The
        // data factory provides a point for creating OWL API objects such as
        // classes, properties and individuals.
        __CLR4_5_29i49i4lvico25k.R.inc(12710);OWLDataFactory factory = manager.getOWLDataFactory();
        // We first need to create some references to individuals. All of our
        // individual must have IRIs. A common convention is to take the IRI of
        // an ontology, append a # and then a local name. For example we can
        // create the individual 'John', using the ontology IRI and appending
        // #John. Note however, that there is no reuqirement that a IRI of a
        // class, property or individual that is used in an ontology have a
        // correspondance with the IRI of the ontology.
        __CLR4_5_29i49i4lvico25k.R.inc(12711);OWLIndividual john = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#John"));
        __CLR4_5_29i49i4lvico25k.R.inc(12712);OWLIndividual mary = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#Mary"));
        __CLR4_5_29i49i4lvico25k.R.inc(12713);OWLIndividual susan = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#Susan"));
        __CLR4_5_29i49i4lvico25k.R.inc(12714);OWLIndividual bill = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#Bill"));
        // The ontologies that we created aren't contained in any ontology at
        // the moment. Individuals (or classes or properties) can't directly be
        // added to an ontology, they have to be used in axioms, and then the
        // axioms are added to an ontology. We now want to add some facts to the
        // ontology. These facts are otherwise known as property assertions. In
        // our case, we want to say that John has a wife Mary. To do this we
        // need to have a reference to the hasWife object property (object
        // properties link an individual to an individual, and data properties
        // link and individual to a constant - here, we need an object property
        // because John and Mary are individuals).
        __CLR4_5_29i49i4lvico25k.R.inc(12715);OWLObjectProperty hasWife = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#hasWife"));
        // Now we need to create the assertion that John hasWife Mary. To do
        // this we need an axiom, in this case an object property assertion
        // axiom. This can be thought of as a "triple" that has a subject, john,
        // a predicate, hasWife and an object Mary
        __CLR4_5_29i49i4lvico25k.R.inc(12716);OWLObjectPropertyAssertionAxiom axiom1 = factory.getOWLObjectPropertyAssertionAxiom(hasWife, john, mary);
        // We now need to add this assertion to our ontology. To do this, we
        // apply an ontology change to the ontology via the OWLOntologyManager.
        // First we create the change object that will tell the manager that we
        // want to add the axiom to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12717);AddAxiom addAxiom1 = new AddAxiom(ont, axiom1);
        // Now we apply the change using the manager.
        __CLR4_5_29i49i4lvico25k.R.inc(12718);manager.applyChange(addAxiom1);
        // Now we want to add the other facts/assertions to the ontology John
        // hasSon Bill Get a refernece to the hasSon property
        __CLR4_5_29i49i4lvico25k.R.inc(12719);OWLObjectProperty hasSon = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#hasSon"));
        // Create the assertion, John hasSon Bill
        __CLR4_5_29i49i4lvico25k.R.inc(12720);OWLAxiom axiom2 = factory.getOWLObjectPropertyAssertionAxiom(hasSon, john, bill);
        // Apply the change
        __CLR4_5_29i49i4lvico25k.R.inc(12721);manager.applyChange(new AddAxiom(ont, axiom2));
        // John hasDaughter Susan
        __CLR4_5_29i49i4lvico25k.R.inc(12722);OWLObjectProperty hasDaughter = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#hasDaughter"));
        __CLR4_5_29i49i4lvico25k.R.inc(12723);OWLAxiom axiom3 = factory.getOWLObjectPropertyAssertionAxiom(hasDaughter, john, susan);
        __CLR4_5_29i49i4lvico25k.R.inc(12724);manager.applyChange(new AddAxiom(ont, axiom3));
        // John hasAge 33 In this case, hasAge is a data property, which we need
        // a reference to
        __CLR4_5_29i49i4lvico25k.R.inc(12725);OWLDataProperty hasAge = factory.getOWLDataProperty(IRI.create(ontologyIRI + "#hasAge"));
        // We create a data property assertion instead of an object property
        // assertion
        __CLR4_5_29i49i4lvico25k.R.inc(12726);OWLAxiom axiom4 = factory.getOWLDataPropertyAssertionAxiom(hasAge, john, 33);
        __CLR4_5_29i49i4lvico25k.R.inc(12727);manager.applyChange(new AddAxiom(ont, axiom4));
        // In the above code, 33 is an integer, so we can just pass 33 into the
        // data factory method. Behind the scenes the OWL API will create a
        // typed constant that it will use as the value of the data property
        // assertion. We could have manually created the constant as follows:
        __CLR4_5_29i49i4lvico25k.R.inc(12728);OWLDatatype intDatatype = factory.getIntegerOWLDatatype();
        __CLR4_5_29i49i4lvico25k.R.inc(12729);OWLLiteral thirtyThree = factory.getOWLLiteral("33", intDatatype);
        // We would then create the axiom as follows:
        __CLR4_5_29i49i4lvico25k.R.inc(12730);factory.getOWLDataPropertyAssertionAxiom(hasAge, john, thirtyThree);
        // However, the convenice method is much shorter! We can now create the
        // other facts/assertion for Mary. The OWL API uses a change object
        // model, which means we can stack up changes (or sets of axioms) and
        // apply the changes (or add the axioms) in one go. We will do this for
        // Mary
        __CLR4_5_29i49i4lvico25k.R.inc(12731);Set<OWLAxiom> axioms = new HashSet<OWLAxiom>();
        __CLR4_5_29i49i4lvico25k.R.inc(12732);axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasSon, mary, bill));
        __CLR4_5_29i49i4lvico25k.R.inc(12733);axioms.add(factory.getOWLObjectPropertyAssertionAxiom(hasDaughter, mary, susan));
        __CLR4_5_29i49i4lvico25k.R.inc(12734);axioms.add(factory.getOWLDataPropertyAssertionAxiom(hasAge, mary, 31));
        // Add facts/assertions for Bill and Susan
        __CLR4_5_29i49i4lvico25k.R.inc(12735);axioms.add(factory.getOWLDataPropertyAssertionAxiom(hasAge, bill, 13));
        __CLR4_5_29i49i4lvico25k.R.inc(12736);axioms.add(factory.getOWLDataPropertyAssertionAxiom(hasAge, mary, 8));
        // Now add all the axioms in one go - there is a convenience method on
        // OWLOntologyManager that will automatically generate the AddAxiom
        // change objects for us. We need to specify the ontology that the
        // axioms should be added to and the axioms to add.
        __CLR4_5_29i49i4lvico25k.R.inc(12737);manager.addAxioms(ont, axioms);
        // Now specify the genders of John, Mary, Bill and Susan. To do this we
        // need the male and female individuals and the hasGender object
        // property.
        __CLR4_5_29i49i4lvico25k.R.inc(12738);OWLIndividual male = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#male"));
        __CLR4_5_29i49i4lvico25k.R.inc(12739);OWLIndividual female = factory.getOWLNamedIndividual(IRI.create(ontologyIRI + "#female"));
        __CLR4_5_29i49i4lvico25k.R.inc(12740);OWLObjectProperty hasGender = factory.getOWLObjectProperty(IRI.create(ontologyIRI + "#hasGender"));
        __CLR4_5_29i49i4lvico25k.R.inc(12741);Set<OWLAxiom> genders = new HashSet<OWLAxiom>();
        __CLR4_5_29i49i4lvico25k.R.inc(12742);genders.add(factory.getOWLObjectPropertyAssertionAxiom(hasGender, john, male));
        __CLR4_5_29i49i4lvico25k.R.inc(12743);genders.add(factory.getOWLObjectPropertyAssertionAxiom(hasGender, mary, female));
        __CLR4_5_29i49i4lvico25k.R.inc(12744);genders.add(factory.getOWLObjectPropertyAssertionAxiom(hasGender, bill, male));
        __CLR4_5_29i49i4lvico25k.R.inc(12745);genders.add(factory.getOWLObjectPropertyAssertionAxiom(hasGender, susan, female));
        // Add the facts about the genders
        __CLR4_5_29i49i4lvico25k.R.inc(12746);manager.addAxioms(ont, genders);
        // Domain and Range Axioms //At this point, we have an ontology
        // containing facts about several individuals. We now want to specify
        // more information about the various properties that we have used. We
        // want to say that the domains and ranges of hasWife, hasSon and
        // hasDaughter are the class Person. To do this we need various domain
        // and range axioms, and we need a reference to the class Person First
        // get a reference to the person class
        __CLR4_5_29i49i4lvico25k.R.inc(12747);OWLClass person = factory.getOWLClass(IRI.create(ontologyIRI + "#Person"));
        // Now we add the domain and range axioms that specify the domains and
        // ranges of the various properties that we are interested in.
        __CLR4_5_29i49i4lvico25k.R.inc(12748);Set<OWLAxiom> domainsAndRanges = new HashSet<OWLAxiom>();
        // Domain and then range of hasWife
        __CLR4_5_29i49i4lvico25k.R.inc(12749);domainsAndRanges.add(factory.getOWLObjectPropertyDomainAxiom(hasWife, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12750);domainsAndRanges.add(factory.getOWLObjectPropertyRangeAxiom(hasWife, person));
        // Domain and range of hasSon and also hasDaugher
        __CLR4_5_29i49i4lvico25k.R.inc(12751);domainsAndRanges.add(factory.getOWLObjectPropertyDomainAxiom(hasSon, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12752);domainsAndRanges.add(factory.getOWLObjectPropertyRangeAxiom(hasSon, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12753);domainsAndRanges.add(factory.getOWLObjectPropertyDomainAxiom(hasDaughter, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12754);domainsAndRanges.add(factory.getOWLObjectPropertyRangeAxiom(hasDaughter, person));
        // We also have the domain of the data property hasAge as Person, and
        // the range as integer. We need the integer datatype. The XML Schema
        // Datatype IRIs are used for data types. The OWL API provide a built in
        // set via the XSDVocabulary enum.
        __CLR4_5_29i49i4lvico25k.R.inc(12755);domainsAndRanges.add(factory.getOWLDataPropertyDomainAxiom(hasAge, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12756);OWLDatatype integerDatatype = factory.getIntegerOWLDatatype();
        __CLR4_5_29i49i4lvico25k.R.inc(12757);domainsAndRanges.add(factory.getOWLDataPropertyRangeAxiom(hasAge, integerDatatype));
        // Now add all of our domain and range axioms
        __CLR4_5_29i49i4lvico25k.R.inc(12758);manager.addAxioms(ont, domainsAndRanges);
        // Class assertion axioms //We can also explicitly say than an
        // individual is an instance of a given class. To do this we use a Class
        // assertion axiom.
        __CLR4_5_29i49i4lvico25k.R.inc(12759);OWLClassAssertionAxiom classAssertionAx = factory.getOWLClassAssertionAxiom(person, john);
        // Add the axiom directly using the addAxiom convenience method on
        // OWLOntologyManager
        __CLR4_5_29i49i4lvico25k.R.inc(12760);manager.addAxiom(ont, classAssertionAx);
        // Inverse property axioms //We can specify the inverse property of
        // hasWife as hasHusband We first need a reference to the hasHusband
        // property.
        __CLR4_5_29i49i4lvico25k.R.inc(12761);OWLObjectProperty hasHusband = factory.getOWLObjectProperty(IRI.create(ont.getOntologyID().getOntologyIRI()
            .get() + "#hasHusband"));
        // The full IRI of the hasHusband property will be
        // http://example.com/owlapi/families#hasHusband since the IRI of our
        // ontology is http://example.com/owlapi/families Create the inverse
        // object properties axiom and add it
        __CLR4_5_29i49i4lvico25k.R.inc(12762);manager.addAxiom(ont, factory.getOWLInverseObjectPropertiesAxiom(hasWife, hasHusband));
        // Sub property axioms //OWL allows a property hierarchy to be
        // specified. Here, hasSon and hasDaughter will be specified as
        // hasChild.
        __CLR4_5_29i49i4lvico25k.R.inc(12763);OWLObjectProperty hasChild = factory.getOWLObjectProperty(IRI.create(ont.getOntologyID().getOntologyIRI().get()
            + "#hasChild"));
        __CLR4_5_29i49i4lvico25k.R.inc(12764);OWLSubObjectPropertyOfAxiom hasSonSubHasChildAx = factory.getOWLSubObjectPropertyOfAxiom(hasSon, hasChild);
        // Add the axiom
        __CLR4_5_29i49i4lvico25k.R.inc(12765);manager.addAxiom(ont, hasSonSubHasChildAx);
        // And hasDaughter, which is also a sub property of hasChild
        __CLR4_5_29i49i4lvico25k.R.inc(12766);manager.addAxiom(ont, factory.getOWLSubObjectPropertyOfAxiom(hasDaughter, hasChild));
        // Property characteristics //Next, we want to say that the hasAge
        // property is Functional. This means that something can have at most
        // one hasAge property. We can do this with a functional data property
        // axiom First create the axiom
        __CLR4_5_29i49i4lvico25k.R.inc(12767);OWLFunctionalDataPropertyAxiom hasAgeFuncAx = factory.getOWLFunctionalDataPropertyAxiom(hasAge);
        // Now add it to the ontology
        __CLR4_5_29i49i4lvico25k.R.inc(12768);manager.addAxiom(ont, hasAgeFuncAx);
        // The hasWife property should be Functional, InverseFunctional,
        // Irreflexive and Asymmetric. Note that the asymmetric property axiom
        // used to be called antisymmetric - older versions of the OWL API may
        // refer to antisymmetric property axioms
        __CLR4_5_29i49i4lvico25k.R.inc(12769);Set<OWLAxiom> hasWifeAxioms = new HashSet<OWLAxiom>();
        __CLR4_5_29i49i4lvico25k.R.inc(12770);hasWifeAxioms.add(factory.getOWLFunctionalObjectPropertyAxiom(hasWife));
        __CLR4_5_29i49i4lvico25k.R.inc(12771);hasWifeAxioms.add(factory.getOWLInverseFunctionalObjectPropertyAxiom(hasWife));
        __CLR4_5_29i49i4lvico25k.R.inc(12772);hasWifeAxioms.add(factory.getOWLIrreflexiveObjectPropertyAxiom(hasWife));
        __CLR4_5_29i49i4lvico25k.R.inc(12773);hasWifeAxioms.add(factory.getOWLAsymmetricObjectPropertyAxiom(hasWife));
        // Add all of the axioms that specify the characteristics of hasWife
        __CLR4_5_29i49i4lvico25k.R.inc(12774);manager.addAxioms(ont, hasWifeAxioms);
        // SubClass axioms //Now we want to start specifying something about
        // classes in our ontology. To begin with we will simply say something
        // about the relationship between named classes Besides the Person class
        // that we already have, we want to say something about the classes Man,
        // Woman and Parent. To say something about these classes, as usual, we
        // need references to them:
        __CLR4_5_29i49i4lvico25k.R.inc(12775);OWLClass man = factory.getOWLClass(IRI.create(ontologyIRI + "#Man"));
        __CLR4_5_29i49i4lvico25k.R.inc(12776);OWLClass woman = factory.getOWLClass(IRI.create(ontologyIRI + "#Woman"));
        __CLR4_5_29i49i4lvico25k.R.inc(12777);OWLClass parent = factory.getOWLClass(IRI.create(ontologyIRI + "#Parent"));
        // It is important to realise that simply getting references to a class
        // via the data factory does not add them to an ontology - only axioms
        // can be added to an ontology. Now say that Man, Woman and Parent are
        // subclasses of Person
        __CLR4_5_29i49i4lvico25k.R.inc(12778);manager.addAxiom(ont, factory.getOWLSubClassOfAxiom(man, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12779);manager.addAxiom(ont, factory.getOWLSubClassOfAxiom(woman, person));
        __CLR4_5_29i49i4lvico25k.R.inc(12780);manager.addAxiom(ont, factory.getOWLSubClassOfAxiom(parent, person));
        // Restrictions //Now we want to say that Person has exactly 1 Age,
        // exactly 1 Gender and, only has gender that is male or female. We will
        // deal with these restrictions one by one and then combine them as a
        // superclass (Necessary conditions) of Person. All anonymous class
        // expressions extend OWLClassExpression. First, hasAge exactly 1
        __CLR4_5_29i49i4lvico25k.R.inc(12781);OWLDataExactCardinality hasAgeRestriction = factory.getOWLDataExactCardinality(1, hasAge);
        // Now the hasGender exactly 1
        __CLR4_5_29i49i4lvico25k.R.inc(12782);OWLObjectExactCardinality hasGenderRestriction = factory.getOWLObjectExactCardinality(1, hasGender);
        // And finally, the hasGender only {male female} To create this
        // restriction, we need an OWLObjectOneOf class expression since male
        // and female are individuals We can just list as many individuals as we
        // need as the argument of the method.
        __CLR4_5_29i49i4lvico25k.R.inc(12783);OWLObjectOneOf maleOrFemale = factory.getOWLObjectOneOf(male, female);
        // Now create the actual restriction
        __CLR4_5_29i49i4lvico25k.R.inc(12784);OWLObjectAllValuesFrom hasGenderOnlyMaleFemale = factory.getOWLObjectAllValuesFrom(hasGender, maleOrFemale);
        // Finally, we bundle these restrictions up into an intersection, since
        // we want person to be a subclass of the intersection of them
        __CLR4_5_29i49i4lvico25k.R.inc(12785);OWLObjectIntersectionOf intersection = factory.getOWLObjectIntersectionOf(hasAgeRestriction,
            hasGenderRestriction, hasGenderOnlyMaleFemale);
        // And now we set this anonymous intersection class to be a superclass
        // of Person using a subclass axiom
        __CLR4_5_29i49i4lvico25k.R.inc(12786);manager.addAxiom(ont, factory.getOWLSubClassOfAxiom(person, intersection));
        // Restrictions and other anonymous classes can also be used anywhere a
        // named class can be used. Let's set the range of hasSon to be Person
        // and hasGender value male. This requires an anonymous class that is
        // the intersection of Person, and also, hasGender value male. We need
        // to create the hasGender value male restriction - this describes the
        // class of things that have a hasGender relationship to the individual
        // male.
        __CLR4_5_29i49i4lvico25k.R.inc(12787);OWLObjectHasValue hasGenderValueMaleRestriction = factory.getOWLObjectHasValue(hasGender, male);
        // Now combine this with Person in an intersection
        __CLR4_5_29i49i4lvico25k.R.inc(12788);OWLClassExpression personAndHasGenderValueMale = factory.getOWLObjectIntersectionOf(person,
            hasGenderValueMaleRestriction);
        // Now specify this anonymous class as the range of hasSon using an
        // object property range axioms
        __CLR4_5_29i49i4lvico25k.R.inc(12789);manager.addAxiom(ont, factory.getOWLObjectPropertyRangeAxiom(hasSon, personAndHasGenderValueMale));
        // We can do a similar thing for hasDaughter, by specifying that
        // hasDaughter has a range of Person and hasGender value female. This
        // time, we will make things a little more compact by not using so many
        // variables
        __CLR4_5_29i49i4lvico25k.R.inc(12790);OWLClassExpression rangeOfHasDaughter = factory.getOWLObjectIntersectionOf(person, factory.getOWLObjectHasValue(
            hasGender, female));
        __CLR4_5_29i49i4lvico25k.R.inc(12791);manager.addAxiom(ont, factory.getOWLObjectPropertyRangeAxiom(hasDaughter, rangeOfHasDaughter));
        // Data Ranges and Equivalent Classes axioms //In OWL 2, we can specify
        // expressive data ranges. Here, we will specify the classes Teenage,
        // Adult and Child by saying something about individuals ages. First we
        // take the class Teenager, all of whose instance have an age greater or
        // equal to 13 and less than 20. In Manchester Syntax this is written as
        // Person and hasAge some int[>=13, <20] We create a data range by
        // taking the integer datatype and applying facet restrictions to it.
        // Note that we have statically imported the data range facet vocabulary
        // OWLFacet
        __CLR4_5_29i49i4lvico25k.R.inc(12792);OWLFacetRestriction geq13 = factory.getOWLFacetRestriction(MIN_INCLUSIVE, factory.getOWLLiteral(13));
        // We don't have to explicitly create the typed constant, there are
        // convenience methods to do this
        __CLR4_5_29i49i4lvico25k.R.inc(12793);OWLFacetRestriction lt20 = factory.getOWLFacetRestriction(MAX_EXCLUSIVE, 20);
        // Restrict the base type, integer (which is just an XML Schema
        // Datatype) with the facet restrictions.
        __CLR4_5_29i49i4lvico25k.R.inc(12794);OWLDataRange dataRng = factory.getOWLDatatypeRestriction(integerDatatype, geq13, lt20);
        // Now we have the data range of greater than equal to 13 and less than
        // 20 we can use this in a restriction.
        __CLR4_5_29i49i4lvico25k.R.inc(12795);OWLDataSomeValuesFrom teenagerAgeRestriction = factory.getOWLDataSomeValuesFrom(hasAge, dataRng);
        // Now make Teenager equivalent to Person and hasAge some int[>=13, <20]
        // First create the class Person and hasAge some int[>=13, <20]
        __CLR4_5_29i49i4lvico25k.R.inc(12796);OWLClassExpression teenagePerson = factory.getOWLObjectIntersectionOf(person, teenagerAgeRestriction);
        __CLR4_5_29i49i4lvico25k.R.inc(12797);OWLClass teenager = factory.getOWLClass(IRI.create(ontologyIRI + "#Teenager"));
        __CLR4_5_29i49i4lvico25k.R.inc(12798);OWLEquivalentClassesAxiom teenagerDefinition = factory.getOWLEquivalentClassesAxiom(teenager, teenagePerson);
        __CLR4_5_29i49i4lvico25k.R.inc(12799);manager.addAxiom(ont, teenagerDefinition);
        // Do the same for Adult that has an age greater than 21
        __CLR4_5_29i49i4lvico25k.R.inc(12800);OWLDataRange geq21 = factory.getOWLDatatypeRestriction(integerDatatype, factory.getOWLFacetRestriction(
            MIN_INCLUSIVE, 21));
        __CLR4_5_29i49i4lvico25k.R.inc(12801);OWLClass adult = factory.getOWLClass(IRI.create(ontologyIRI + "#Adult"));
        __CLR4_5_29i49i4lvico25k.R.inc(12802);OWLClassExpression adultAgeRestriction = factory.getOWLDataSomeValuesFrom(hasAge, geq21);
        __CLR4_5_29i49i4lvico25k.R.inc(12803);OWLClassExpression adultPerson = factory.getOWLObjectIntersectionOf(person, adultAgeRestriction);
        __CLR4_5_29i49i4lvico25k.R.inc(12804);OWLAxiom adultDefinition = factory.getOWLEquivalentClassesAxiom(adult, adultPerson);
        __CLR4_5_29i49i4lvico25k.R.inc(12805);manager.addAxiom(ont, adultDefinition);
        // And finally Child
        __CLR4_5_29i49i4lvico25k.R.inc(12806);OWLDataRange notGeq21 = factory.getOWLDataComplementOf(geq21);
        __CLR4_5_29i49i4lvico25k.R.inc(12807);OWLClass child = factory.getOWLClass(IRI.create(ontologyIRI + "#Child"));
        __CLR4_5_29i49i4lvico25k.R.inc(12808);OWLClassExpression childAgeRestriction = factory.getOWLDataSomeValuesFrom(hasAge, notGeq21);
        __CLR4_5_29i49i4lvico25k.R.inc(12809);OWLClassExpression childPerson = factory.getOWLObjectIntersectionOf(person, childAgeRestriction);
        __CLR4_5_29i49i4lvico25k.R.inc(12810);OWLAxiom childDefinition = factory.getOWLEquivalentClassesAxiom(child, childPerson);
        __CLR4_5_29i49i4lvico25k.R.inc(12811);manager.addAxiom(ont, childDefinition);
        // Different individuals //In OWL, we can say that individuals are
        // different from each other. To do this we use a different individuals
        // axiom. Since John, Mary, Bill and Susan are all different
        // individuals, we can express this using a different individuals axiom.
        __CLR4_5_29i49i4lvico25k.R.inc(12812);OWLDifferentIndividualsAxiom diffInds = factory.getOWLDifferentIndividualsAxiom(john, mary, bill, susan);
        __CLR4_5_29i49i4lvico25k.R.inc(12813);manager.addAxiom(ont, diffInds);
        // Male and Female are also different
        __CLR4_5_29i49i4lvico25k.R.inc(12814);manager.addAxiom(ont, factory.getOWLDifferentIndividualsAxiom(male, female));
        // Disjoint classes //Two say that two classes do not have any instances
        // in common we use a disjoint classes axiom:
        __CLR4_5_29i49i4lvico25k.R.inc(12815);OWLDisjointClassesAxiom disjointClassesAxiom = factory.getOWLDisjointClassesAxiom(man, woman);
        __CLR4_5_29i49i4lvico25k.R.inc(12816);manager.addAxiom(ont, disjointClassesAxiom);
        // Ontology Management //Having added axioms to out ontology we can now
        // save it (in a variety of formats). RDF/XML is the default format
        // System.out.println("RDF/XML: ");
        __CLR4_5_29i49i4lvico25k.R.inc(12817);manager.saveOntology(ont, new StringDocumentTarget());
        // OWL/XML
        // System.out.println("OWL/XML: ");
        __CLR4_5_29i49i4lvico25k.R.inc(12818);manager.saveOntology(ont, new OWLXMLDocumentFormat(), new StringDocumentTarget());
        // Manchester Syntax
        // System.out.println("Manchester syntax: ");
        __CLR4_5_29i49i4lvico25k.R.inc(12819);manager.saveOntology(ont, new ManchesterSyntaxDocumentFormat(), new StringDocumentTarget());
        // Turtle
        // System.out.println("Turtle: ");
        __CLR4_5_29i49i4lvico25k.R.inc(12820);manager.saveOntology(ont, new TurtleDocumentFormat(), new StringDocumentTarget());
    }finally{__CLR4_5_29i49i4lvico25k.R.flushNeeded();}}
}
