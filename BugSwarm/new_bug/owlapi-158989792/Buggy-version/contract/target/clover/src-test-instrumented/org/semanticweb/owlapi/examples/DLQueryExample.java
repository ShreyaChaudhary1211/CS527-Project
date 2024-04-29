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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import org.semanticweb.owlapi.util.BidirectionalShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

/**
 * An example that shows how to do a Protege like DLQuery. The example contains
 * several helper classes:<br>
 * DLQueryEngine - This takes a string representing a class expression built
 * from the terms in the signature of some ontology. DLQueryPrinter - This takes
 * a string class expression and prints out the sub/super/equivalent classes and
 * the instances of the specified class expression. DLQueryParser - this parses
 * the specified class expression string
 * 
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings({ "javadoc", })
public class DLQueryExample {public static class __CLR4_5_29ej9ejlvico231{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    private DLQueryExample() {try{__CLR4_5_29ej9ejlvico231.R.inc(12187);}finally{__CLR4_5_29ej9ejlvico231.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_5_29ej9ejlvico231.R.inc(12188);
        __CLR4_5_29ej9ejlvico231.R.inc(12189);try {
            // Load an example ontology. In this case, we'll just load the pizza
            // ontology.
            __CLR4_5_29ej9ejlvico231.R.inc(12190);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
            __CLR4_5_29ej9ejlvico231.R.inc(12191);OWLOntology ontology = manager.loadOntologyFromOntologyDocument(new StringDocumentSource(KOALA));
            __CLR4_5_29ej9ejlvico231.R.inc(12192);System.out.println("Loaded ontology: " + ontology.getOntologyID());
            // We need a reasoner to do our query answering
            __CLR4_5_29ej9ejlvico231.R.inc(12193);OWLReasoner reasoner = createReasoner(ontology);
            // Entities are named using IRIs. These are usually too long for use
            // in user interfaces. To solve this
            // problem, and so a query can be written using short class,
            // property, individual names we use a short form
            // provider. In this case, we'll just use a simple short form
            // provider that generates short froms from IRI
            // fragments.
            __CLR4_5_29ej9ejlvico231.R.inc(12194);ShortFormProvider shortFormProvider = new SimpleShortFormProvider();
            // Create the DLQueryPrinter helper class. This will manage the
            // parsing of input and printing of results
            __CLR4_5_29ej9ejlvico231.R.inc(12195);DLQueryPrinter dlQueryPrinter = new DLQueryPrinter(new DLQueryEngine(reasoner, shortFormProvider),
                shortFormProvider);
            // Enter the query loop. A user is expected to enter class
            // expression on the command line.
            __CLR4_5_29ej9ejlvico231.R.inc(12196);doQueryLoop(dlQueryPrinter);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_29ej9ejlvico231.R.inc(12197);System.out.println("Could not load ontology: " + e.getMessage());
        } catch (IOException ioEx) {
            __CLR4_5_29ej9ejlvico231.R.inc(12198);System.out.println(ioEx.getMessage());
        }
    }finally{__CLR4_5_29ej9ejlvico231.R.flushNeeded();}}

    private static void doQueryLoop(@Nonnull DLQueryPrinter dlQueryPrinter) throws IOException {try{__CLR4_5_29ej9ejlvico231.R.inc(12199);
        __CLR4_5_29ej9ejlvico231.R.inc(12200);while (true) {{
            // Prompt the user to enter a class expression
            __CLR4_5_29ej9ejlvico231.R.inc(12201);System.out.println(
                "Please type a class expression in Manchester Syntax and press Enter (or press x to exit):");
            __CLR4_5_29ej9ejlvico231.R.inc(12202);System.out.println("");
            __CLR4_5_29ej9ejlvico231.R.inc(12203);String classExpression = readInput();
            // Check for exit condition
            __CLR4_5_29ej9ejlvico231.R.inc(12204);if ((((classExpression.equalsIgnoreCase("x"))&&(__CLR4_5_29ej9ejlvico231.R.iget(12205)!=0|true))||(__CLR4_5_29ej9ejlvico231.R.iget(12206)==0&false))) {{
                __CLR4_5_29ej9ejlvico231.R.inc(12207);break;
            }
            }__CLR4_5_29ej9ejlvico231.R.inc(12208);dlQueryPrinter.askQuery(classExpression.trim());
            __CLR4_5_29ej9ejlvico231.R.inc(12209);System.out.println();
            __CLR4_5_29ej9ejlvico231.R.inc(12210);System.out.println();
        }
    }}finally{__CLR4_5_29ej9ejlvico231.R.flushNeeded();}}

    private static String readInput() throws IOException {try{__CLR4_5_29ej9ejlvico231.R.inc(12211);
        __CLR4_5_29ej9ejlvico231.R.inc(12212);InputStream is = System.in;
        __CLR4_5_29ej9ejlvico231.R.inc(12213);InputStreamReader reader;
        __CLR4_5_29ej9ejlvico231.R.inc(12214);reader = new InputStreamReader(is, "UTF-8");
        __CLR4_5_29ej9ejlvico231.R.inc(12215);BufferedReader br = new BufferedReader(reader);
        __CLR4_5_29ej9ejlvico231.R.inc(12216);return br.readLine();
    }finally{__CLR4_5_29ej9ejlvico231.R.flushNeeded();}}

    @Nonnull
    private static OWLReasoner createReasoner(@Nonnull OWLOntology rootOntology) {try{__CLR4_5_29ej9ejlvico231.R.inc(12217);
        // We need to create an instance of OWLReasoner. An OWLReasoner provides
        // the basic query functionality that we need, for example the ability
        // obtain the subclasses of a class etc. To do this we use a reasoner
        // factory.
        // Create a reasoner factory.
        __CLR4_5_29ej9ejlvico231.R.inc(12218);OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        __CLR4_5_29ej9ejlvico231.R.inc(12219);return reasonerFactory.createReasoner(rootOntology);
    }finally{__CLR4_5_29ej9ejlvico231.R.flushNeeded();}}
}

/**
 * This example shows how to perform a "dlquery". The DLQuery view/tab in
 * Protege 4 works like this.
 */
class DLQueryEngine {public static class __CLR4_5_29ej9fglvico231{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLReasoner reasoner;
    @Nonnull
    private final DLQueryParser parser;

    /**
     * Constructs a DLQueryEngine. This will answer "DL queries" using the
     * specified reasoner. A short form provider specifies how entities are
     * rendered.
     * 
     * @param reasoner
     *        The reasoner to be used for answering the queries.
     * @param shortFormProvider
     *        A short form provider.
     */
    DLQueryEngine(@Nonnull OWLReasoner reasoner, @Nonnull ShortFormProvider shortFormProvider) {try{__CLR4_5_29ej9fglvico231.R.inc(12220);
        __CLR4_5_29ej9fglvico231.R.inc(12221);this.reasoner = reasoner;
        __CLR4_5_29ej9fglvico231.R.inc(12222);OWLOntology rootOntology = reasoner.getRootOntology();
        __CLR4_5_29ej9fglvico231.R.inc(12223);parser = new DLQueryParser(rootOntology, shortFormProvider);
    }finally{__CLR4_5_29ej9fglvico231.R.flushNeeded();}}

    /**
     * Gets the superclasses of a class expression parsed from a string.
     * 
     * @param classExpressionString
     *        The string from which the class expression will be parsed.
     * @param direct
     *        Specifies whether direct superclasses should be returned or not.
     * @return The superclasses of the specified class expression If there was a
     *         problem parsing the class expression.
     */
    @Nonnull
    public Set<OWLClass> getSuperClasses(@Nonnull String classExpressionString, boolean direct) {try{__CLR4_5_29ej9fglvico231.R.inc(12224);
        __CLR4_5_29ej9fglvico231.R.inc(12225);if ((((classExpressionString.trim().isEmpty())&&(__CLR4_5_29ej9fglvico231.R.iget(12226)!=0|true))||(__CLR4_5_29ej9fglvico231.R.iget(12227)==0&false))) {{
            __CLR4_5_29ej9fglvico231.R.inc(12228);return CollectionFactory.emptySet();
        }
        }__CLR4_5_29ej9fglvico231.R.inc(12229);OWLClassExpression classExpression = parser.parseClassExpression(classExpressionString);
        __CLR4_5_29ej9fglvico231.R.inc(12230);NodeSet<OWLClass> superClasses = reasoner.getSuperClasses(classExpression, direct);
        __CLR4_5_29ej9fglvico231.R.inc(12231);return superClasses.getFlattened();
    }finally{__CLR4_5_29ej9fglvico231.R.flushNeeded();}}

    /**
     * Gets the equivalent classes of a class expression parsed from a string.
     * 
     * @param classExpressionString
     *        The string from which the class expression will be parsed.
     * @return The equivalent classes of the specified class expression If there
     *         was a problem parsing the class expression.
     */
    @Nonnull
    public Set<OWLClass> getEquivalentClasses(@Nonnull String classExpressionString) {try{__CLR4_5_29ej9fglvico231.R.inc(12232);
        __CLR4_5_29ej9fglvico231.R.inc(12233);if ((((classExpressionString.trim().isEmpty())&&(__CLR4_5_29ej9fglvico231.R.iget(12234)!=0|true))||(__CLR4_5_29ej9fglvico231.R.iget(12235)==0&false))) {{
            __CLR4_5_29ej9fglvico231.R.inc(12236);return CollectionFactory.emptySet();
        }
        }__CLR4_5_29ej9fglvico231.R.inc(12237);OWLClassExpression classExpression = parser.parseClassExpression(classExpressionString);
        __CLR4_5_29ej9fglvico231.R.inc(12238);Node<OWLClass> equivalentClasses = reasoner.getEquivalentClasses(classExpression);
        __CLR4_5_29ej9fglvico231.R.inc(12239);Set<OWLClass> result;
        __CLR4_5_29ej9fglvico231.R.inc(12240);if ((((classExpression.isAnonymous())&&(__CLR4_5_29ej9fglvico231.R.iget(12241)!=0|true))||(__CLR4_5_29ej9fglvico231.R.iget(12242)==0&false))) {{
            __CLR4_5_29ej9fglvico231.R.inc(12243);result = equivalentClasses.getEntities();
        } }else {{
            __CLR4_5_29ej9fglvico231.R.inc(12244);result = equivalentClasses.getEntitiesMinus(classExpression.asOWLClass());
        }
        }__CLR4_5_29ej9fglvico231.R.inc(12245);return result;
    }finally{__CLR4_5_29ej9fglvico231.R.flushNeeded();}}

    /**
     * Gets the subclasses of a class expression parsed from a string.
     * 
     * @param classExpressionString
     *        The string from which the class expression will be parsed.
     * @param direct
     *        Specifies whether direct subclasses should be returned or not.
     * @return The subclasses of the specified class expression If there was a
     *         problem parsing the class expression.
     */
    @Nonnull
    public Set<OWLClass> getSubClasses(@Nonnull String classExpressionString, boolean direct) {try{__CLR4_5_29ej9fglvico231.R.inc(12246);
        __CLR4_5_29ej9fglvico231.R.inc(12247);if ((((classExpressionString.trim().isEmpty())&&(__CLR4_5_29ej9fglvico231.R.iget(12248)!=0|true))||(__CLR4_5_29ej9fglvico231.R.iget(12249)==0&false))) {{
            __CLR4_5_29ej9fglvico231.R.inc(12250);return CollectionFactory.emptySet();
        }
        }__CLR4_5_29ej9fglvico231.R.inc(12251);OWLClassExpression classExpression = parser.parseClassExpression(classExpressionString);
        __CLR4_5_29ej9fglvico231.R.inc(12252);NodeSet<OWLClass> subClasses = reasoner.getSubClasses(classExpression, direct);
        __CLR4_5_29ej9fglvico231.R.inc(12253);return subClasses.getFlattened();
    }finally{__CLR4_5_29ej9fglvico231.R.flushNeeded();}}

    /**
     * Gets the instances of a class expression parsed from a string.
     * 
     * @param classExpressionString
     *        The string from which the class expression will be parsed.
     * @param direct
     *        Specifies whether direct instances should be returned or not.
     * @return The instances of the specified class expression If there was a
     *         problem parsing the class expression.
     */
    @Nonnull
    public Set<OWLNamedIndividual> getInstances(@Nonnull String classExpressionString, boolean direct) {try{__CLR4_5_29ej9fglvico231.R.inc(12254);
        __CLR4_5_29ej9fglvico231.R.inc(12255);if ((((classExpressionString.trim().isEmpty())&&(__CLR4_5_29ej9fglvico231.R.iget(12256)!=0|true))||(__CLR4_5_29ej9fglvico231.R.iget(12257)==0&false))) {{
            __CLR4_5_29ej9fglvico231.R.inc(12258);return CollectionFactory.emptySet();
        }
        }__CLR4_5_29ej9fglvico231.R.inc(12259);OWLClassExpression classExpression = parser.parseClassExpression(classExpressionString);
        __CLR4_5_29ej9fglvico231.R.inc(12260);NodeSet<OWLNamedIndividual> individuals = reasoner.getInstances(classExpression, direct);
        __CLR4_5_29ej9fglvico231.R.inc(12261);return individuals.getFlattened();
    }finally{__CLR4_5_29ej9fglvico231.R.flushNeeded();}}
}

class DLQueryParser {public static class __CLR4_5_29ej9gmlvico232{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntology rootOntology;
    @Nonnull
    private final BidirectionalShortFormProvider bidiShortFormProvider;

    /**
     * Constructs a DLQueryParser using the specified ontology and short form
     * provider to map entity IRIs to short names.
     * 
     * @param rootOntology
     *        The root ontology. This essentially provides the domain vocabulary
     *        for the query.
     * @param shortFormProvider
     *        A short form provider to be used for mapping back and forth
     *        between entities and their short names (renderings).
     */
    DLQueryParser(@Nonnull OWLOntology rootOntology, @Nonnull ShortFormProvider shortFormProvider) {try{__CLR4_5_29ej9gmlvico232.R.inc(12262);
        __CLR4_5_29ej9gmlvico232.R.inc(12263);this.rootOntology = rootOntology;
        __CLR4_5_29ej9gmlvico232.R.inc(12264);OWLOntologyManager manager = rootOntology.getOWLOntologyManager();
        __CLR4_5_29ej9gmlvico232.R.inc(12265);Set<OWLOntology> importsClosure = rootOntology.getImportsClosure();
        // Create a bidirectional short form provider to do the actual mapping.
        // It will generate names using the input
        // short form provider.
        __CLR4_5_29ej9gmlvico232.R.inc(12266);bidiShortFormProvider = new BidirectionalShortFormProviderAdapter(manager, importsClosure, shortFormProvider);
    }finally{__CLR4_5_29ej9gmlvico232.R.flushNeeded();}}

    /**
     * Parses a class expression string to obtain a class expression.
     * 
     * @param classExpressionString
     *        The class expression string
     * @return The corresponding class expression if the class expression string
     *         is malformed or contains unknown entity names.
     */
    @Nonnull
    public OWLClassExpression parseClassExpression(@Nonnull String classExpressionString) {try{__CLR4_5_29ej9gmlvico232.R.inc(12267);
        // Set up the real parser
        __CLR4_5_29ej9gmlvico232.R.inc(12268);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_29ej9gmlvico232.R.inc(12269);parser.setStringToParse(classExpressionString);
        __CLR4_5_29ej9gmlvico232.R.inc(12270);parser.setDefaultOntology(rootOntology);
        // Specify an entity checker that wil be used to check a class
        // expression contains the correct names.
        __CLR4_5_29ej9gmlvico232.R.inc(12271);OWLEntityChecker entityChecker = new ShortFormEntityChecker(bidiShortFormProvider);
        __CLR4_5_29ej9gmlvico232.R.inc(12272);parser.setOWLEntityChecker(entityChecker);
        // Do the actual parsing
        __CLR4_5_29ej9gmlvico232.R.inc(12273);return parser.parseClassExpression();
    }finally{__CLR4_5_29ej9gmlvico232.R.flushNeeded();}}
}

class DLQueryPrinter {public static class __CLR4_5_29ej9gylvico232{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DLQueryEngine dlQueryEngine;
    private final ShortFormProvider shortFormProvider;

    /**
     * @param engine
     *        the engine
     * @param shortFormProvider
     *        the short form provider
     */
    DLQueryPrinter(DLQueryEngine engine, ShortFormProvider shortFormProvider) {try{__CLR4_5_29ej9gylvico232.R.inc(12274);
        __CLR4_5_29ej9gylvico232.R.inc(12275);this.shortFormProvider = shortFormProvider;
        __CLR4_5_29ej9gylvico232.R.inc(12276);dlQueryEngine = engine;
    }finally{__CLR4_5_29ej9gylvico232.R.flushNeeded();}}

    /**
     * @param classExpression
     *        the class expression to use for interrogation
     */
    public void askQuery(@Nonnull String classExpression) {try{__CLR4_5_29ej9gylvico232.R.inc(12277);
        __CLR4_5_29ej9gylvico232.R.inc(12278);if ((((classExpression.isEmpty())&&(__CLR4_5_29ej9gylvico232.R.iget(12279)!=0|true))||(__CLR4_5_29ej9gylvico232.R.iget(12280)==0&false))) {{
            __CLR4_5_29ej9gylvico232.R.inc(12281);System.out.println("No class expression specified");
        } }else {{
            __CLR4_5_29ej9gylvico232.R.inc(12282);StringBuilder sb = new StringBuilder();
            __CLR4_5_29ej9gylvico232.R.inc(12283);sb.append("\n--------------------------------------------------------------------------------\n");
            __CLR4_5_29ej9gylvico232.R.inc(12284);sb.append("QUERY:   ");
            __CLR4_5_29ej9gylvico232.R.inc(12285);sb.append(classExpression);
            __CLR4_5_29ej9gylvico232.R.inc(12286);sb.append('\n');
            __CLR4_5_29ej9gylvico232.R.inc(12287);sb.append("--------------------------------------------------------------------------------\n\n");
            // Ask for the subclasses, superclasses etc. of the specified
            // class expression. Print out the results.
            __CLR4_5_29ej9gylvico232.R.inc(12288);Set<OWLClass> superClasses = dlQueryEngine.getSuperClasses(classExpression, true);
            __CLR4_5_29ej9gylvico232.R.inc(12289);printEntities("SuperClasses", superClasses, sb);
            __CLR4_5_29ej9gylvico232.R.inc(12290);Set<OWLClass> equivalentClasses = dlQueryEngine.getEquivalentClasses(classExpression);
            __CLR4_5_29ej9gylvico232.R.inc(12291);printEntities("EquivalentClasses", equivalentClasses, sb);
            __CLR4_5_29ej9gylvico232.R.inc(12292);Set<OWLClass> subClasses = dlQueryEngine.getSubClasses(classExpression, true);
            __CLR4_5_29ej9gylvico232.R.inc(12293);printEntities("SubClasses", subClasses, sb);
            __CLR4_5_29ej9gylvico232.R.inc(12294);Set<OWLNamedIndividual> individuals = dlQueryEngine.getInstances(classExpression, true);
            __CLR4_5_29ej9gylvico232.R.inc(12295);printEntities("Instances", individuals, sb);
            __CLR4_5_29ej9gylvico232.R.inc(12296);System.out.println(sb);
        }
    }}finally{__CLR4_5_29ej9gylvico232.R.flushNeeded();}}

    private void printEntities(@Nonnull String name, @Nonnull Set<? extends OWLEntity> entities,
        @Nonnull StringBuilder sb) {try{__CLR4_5_29ej9gylvico232.R.inc(12297);
        __CLR4_5_29ej9gylvico232.R.inc(12298);sb.append(name);
        __CLR4_5_29ej9gylvico232.R.inc(12299);int length = 50 - name.length();
        __CLR4_5_29ej9gylvico232.R.inc(12300);for (int i = 0; (((i < length)&&(__CLR4_5_29ej9gylvico232.R.iget(12301)!=0|true))||(__CLR4_5_29ej9gylvico232.R.iget(12302)==0&false)); i++) {{
            __CLR4_5_29ej9gylvico232.R.inc(12303);sb.append('.');
        }
        }__CLR4_5_29ej9gylvico232.R.inc(12304);sb.append("\n\n");
        __CLR4_5_29ej9gylvico232.R.inc(12305);if ((((!entities.isEmpty())&&(__CLR4_5_29ej9gylvico232.R.iget(12306)!=0|true))||(__CLR4_5_29ej9gylvico232.R.iget(12307)==0&false))) {{
            __CLR4_5_29ej9gylvico232.R.inc(12308);for (OWLEntity entity : entities) {{
                assert (((entity != null)&&(__CLR4_5_29ej9gylvico232.R.iget(12309)!=0|true))||(__CLR4_5_29ej9gylvico232.R.iget(12310)==0&false));
                __CLR4_5_29ej9gylvico232.R.inc(12311);sb.append('\t');
                __CLR4_5_29ej9gylvico232.R.inc(12312);sb.append(shortFormProvider.getShortForm(entity));
                __CLR4_5_29ej9gylvico232.R.inc(12313);sb.append('\n');
            }
        }} }else {{
            __CLR4_5_29ej9gylvico232.R.inc(12314);sb.append("\t[NONE]\n");
        }
        }__CLR4_5_29ej9gylvico232.R.inc(12315);sb.append('\n');
    }finally{__CLR4_5_29ej9gylvico232.R.flushNeeded();}}
}
