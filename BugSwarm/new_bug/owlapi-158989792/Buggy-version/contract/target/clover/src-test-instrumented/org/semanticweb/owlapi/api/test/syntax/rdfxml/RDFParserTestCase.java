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
package org.semanticweb.owlapi.api.test.syntax.rdfxml;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyBuilder;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.RDFXMLStorerFactory;

import uk.ac.manchester.cs.owl.owlapi.OWLOntologyFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings("javadoc")
public class RDFParserTestCase extends TestBase {static class __CLR4_5_29dk9dklvico21p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() {try{__CLR4_5_29dk9dklvico21p.R.inc(12152);
        // Use the reference implementation
        __CLR4_5_29dk9dklvico21p.R.inc(12153);m.getOntologyStorers().set(new RDFXMLStorerFactory());
        __CLR4_5_29dk9dklvico21p.R.inc(12154);m.getOntologyFactories().set(
                new OWLOntologyFactoryImpl(new OWLOntologyBuilder() {
                    @Nonnull
                    @Override
                    public OWLOntology createOWLOntology(@Nonnull OWLOntologyManager manager,
                                                         @Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_29dk9dklvico21p.R.inc(12155);
                        __CLR4_5_29dk9dklvico21p.R.inc(12156);return new OWLOntologyImpl(manager, ontologyID);
                    }finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}
                }));
    }finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}

    @Test
    public void testOWLAPI() throws Exception {__CLR4_5_29dk9dklvico21p.R.globalSliceStart(getClass().getName(),12157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ve6mxd9dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dk9dklvico21p.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dk9dklvico21p.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.RDFParserTestCase.testOWLAPI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ve6mxd9dp() throws Exception{try{__CLR4_5_29dk9dklvico21p.R.inc(12157);
        __CLR4_5_29dk9dklvico21p.R.inc(12158);parseFiles("/owlapi/");
    }finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}

    private void parseFiles(String base) throws URISyntaxException,
            OWLOntologyCreationException {try{__CLR4_5_29dk9dklvico21p.R.inc(12159);
        __CLR4_5_29dk9dklvico21p.R.inc(12160);URL url = getClass().getResource(base);
        __CLR4_5_29dk9dklvico21p.R.inc(12161);File file = new File(url.toURI());
        __CLR4_5_29dk9dklvico21p.R.inc(12162);for (File testSuiteFolder : file.listFiles()) {{
            __CLR4_5_29dk9dklvico21p.R.inc(12163);if ((((testSuiteFolder.isDirectory())&&(__CLR4_5_29dk9dklvico21p.R.iget(12164)!=0|true))||(__CLR4_5_29dk9dklvico21p.R.iget(12165)==0&false))) {{
                __CLR4_5_29dk9dklvico21p.R.inc(12166);for (File ontologyFile : testSuiteFolder.listFiles()) {{
                    __CLR4_5_29dk9dklvico21p.R.inc(12167);if ((((ontologyFile.getName().endsWith(".rdf")
                            || ontologyFile.getName().endsWith(".owlapi"))&&(__CLR4_5_29dk9dklvico21p.R.iget(12168)!=0|true))||(__CLR4_5_29dk9dklvico21p.R.iget(12169)==0&false))) {{
                        __CLR4_5_29dk9dklvico21p.R.inc(12170);OWLOntology ont = m
                                .loadOntologyFromOntologyDocument(ontologyFile);
                        __CLR4_5_29dk9dklvico21p.R.inc(12171);m.removeOntology(ont);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}

    @Test
    public void shouldParseDataProperty() throws OWLOntologyCreationException {__CLR4_5_29dk9dklvico21p.R.globalSliceStart(getClass().getName(),12172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtxiau9e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dk9dklvico21p.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dk9dklvico21p.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.RDFParserTestCase.shouldParseDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtxiau9e4() throws OWLOntologyCreationException{try{__CLR4_5_29dk9dklvico21p.R.inc(12172);
        __CLR4_5_29dk9dklvico21p.R.inc(12173);String in = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<!DOCTYPE rdf:RDF [\n"
                + "    <!ENTITY b 'http://www.loa-cnr.it/ontologies/ExtendedDnS.owl#'>\n"
                + "    <!ENTITY k 'http://www.loa-cnr.it/ontologies/Plans.owl#'>\n"
                + "    <!ENTITY owl 'http://www.w3.org/2002/07/owl#'>\n"
                + "    <!ENTITY xsd 'http://www.w3.org/2001/XMLSchema#'>\n"
                + "]>\n"
                + "\n"
                + "<rdf:RDF\n"
                + "    xml:base=\"http://www.loa-cnr.it/ontologies/DLP_397.owl\"\n"
                + "    xmlns:b=\"http://www.loa-cnr.it/ontologies/ExtendedDnS.owl#\"\n"
                + "    xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + "    xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + "    xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\">\n"
                + "\n"
                + "<owl:Ontology rdf:about=\"\"/>\n"
                + "\n"
                + "<owl:Class rdf:about=\"&b;task\">\n"
                + "    <rdfs:comment rdf:datatype=\"&xsd;string\">A course used to sequence activities or other controllable perdurants (some states, processes), usually within methods. They must be defined by a method, but can be *used* by other kinds of descriptions. They are desire targets of some role played by an agent. Tasks can be complex, and ordered according to an abstract succession relation. Tasks can relate to ground activities or decision making; the last kind deals with typical flowchart content. A task is different both from a flowchart node, and from an action or action type.Tasks can be considered shortcuts for plans, since at least one role played by an agent has a desire attitude towards them (possibly different from the one that puts the task into action). In principle, tasks could be transformed into explicit plans.</rdfs:comment>\n"
                + "</owl:Class>\n"
                + "\n"
                + "<owl:DatatypeProperty rdf:about=\"&k;iteration-cardinality\">\n"
                + "    <rdfs:comment rdf:datatype=\"&xsd;string\">iteration cardinality can be used to state in a task how many times an action should be repeated</rdfs:comment>\n"
                + "    <rdfs:domain rdf:resource=\"&b;task\"/>\n"
                + "    <rdfs:range rdf:resource=\"&xsd;integer\"/>\n"
                + "</owl:DatatypeProperty>\n"
                + "<owl:Datatype rdf:about=\"&xsd;decimal\"/>\n"
                + "<owl:Datatype rdf:about=\"&xsd;integer\"/>\n"
                + "<owl:Datatype rdf:about=\"&xsd;string\"/>\n" + "</rdf:RDF>";
        __CLR4_5_29dk9dklvico21p.R.inc(12174);OWLOntology o = loadOntologyFromString(in);
        __CLR4_5_29dk9dklvico21p.R.inc(12175);assertFalse(o
                .containsObjectPropertyInSignature(IRI
                        .create("http://www.loa-cnr.it/ontologies/Plans.owl#iteration-cardinality")));
    }finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}

    @Test
    public void shouldLoadSubPropertiesAsObjectProperties()
            throws OWLOntologyCreationException {__CLR4_5_29dk9dklvico21p.R.globalSliceStart(getClass().getName(),12176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eajftn9e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29dk9dklvico21p.R.rethrow($CLV_t2$);}finally{__CLR4_5_29dk9dklvico21p.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.rdfxml.RDFParserTestCase.shouldLoadSubPropertiesAsObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12176,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eajftn9e8() throws OWLOntologyCreationException{try{__CLR4_5_29dk9dklvico21p.R.inc(12176);
        __CLR4_5_29dk9dklvico21p.R.inc(12177);String in = "<rdf:RDF xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\" xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:dcterms=\"http://purl.org/dc/terms/\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:marc-fields=\"http://bibframe.org/marc/\" xmlns:rda-fields=\"http://bibframe.org/rda/\" xmlns:bf-abstract=\"http://bibframe.org/model-abstract/\" xmlns:bframe=\"http://bibframe.org/vocab/frame\" xmlns:bfmain=\"http://bibframe.org/vocab/main\" xml:base=\"http://bibframe.org/vocab/\">\n"
                + "  <owl:Ontology rdf:about=\"\">\n" + "  </owl:Ontology>\n"
                + "  <rdfs:Class rdf:about=\"http://bibframe.org/vocab/Resource\">\n"
                + "  </rdfs:Class>\n"
                + "  <rdf:Property rdf:about=\"http://bibframe.org/vocab/relatedTo\">\n"
                + "    <rdfs:domain rdf:resource=\"http://bibframe.org/vocab/Resource\"/>\n"
                + "    <rdfs:range rdf:resource=\"http://bibframe.org/vocab/Resource\"/>\n"
                + "  </rdf:Property>\n"
                + "  <rdf:Property rdf:about=\"http://bibframe.org/vocab/partOf\">\n"
                + "    <rdfs:subPropertyOf rdf:resource=\"http://bibframe.org/vocab/relatedTo\"/>\n"
                + "  </rdf:Property>\n" + "</rdf:RDF>";
        __CLR4_5_29dk9dklvico21p.R.inc(12178);OWLOntology o = loadOntologyFromString(in);
        __CLR4_5_29dk9dklvico21p.R.inc(12179);Set<OWLSubAnnotationPropertyOfAxiom> axioms1 = o
                .getAxioms(AxiomType.SUB_ANNOTATION_PROPERTY_OF);
        __CLR4_5_29dk9dklvico21p.R.inc(12180);assertEquals(0, axioms1.size());
        __CLR4_5_29dk9dklvico21p.R.inc(12181);Set<OWLSubObjectPropertyOfAxiom> axioms2 = o
                .getAxioms(AxiomType.SUB_OBJECT_PROPERTY);
        __CLR4_5_29dk9dklvico21p.R.inc(12182);assertEquals(1, axioms2.size());
    }finally{__CLR4_5_29dk9dklvico21p.R.flushNeeded();}}

}
