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
package org.semanticweb.owlapi.profiles.test;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWL2RLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileReport;
import org.semanticweb.owlapi.profiles.OWLProfileViolation;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForAnnotationPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredAnnotationProperty;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectPropertyManager;

@SuppressWarnings("javadoc")
public class ForbiddenVocabularyTestCase extends TestBase {static class __CLR4_5_29w59w5lvico260{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,12896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void shouldFindViolation() throws Exception {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fo097k9w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.shouldFindViolation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fo097k9w5() throws Exception{try{__CLR4_5_29w59w5lvico260.R.inc(12821);
        __CLR4_5_29w59w5lvico260.R.inc(12822);String input = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" ><owl:Ontology rdf:about=\"\"/>\n<owl:Class rdf:about=\"http://phenomebrowser.net/cellphenotype.owl#C3PO:000000015\"><rdf:Description rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Any.</rdf:Description></owl:Class></rdf:RDF>";
        __CLR4_5_29w59w5lvico260.R.inc(12823);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_29w59w5lvico260.R.inc(12824);OWL2DLProfile p = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12825);OWLProfileReport checkOntology = p.checkOntology(o);
        __CLR4_5_29w59w5lvico260.R.inc(12826);assertEquals(2, checkOntology.getViolations().size());
        __CLR4_5_29w59w5lvico260.R.inc(12827);OWLProfileViolation v = checkOntology.getViolations().get(0);
        __CLR4_5_29w59w5lvico260.R.inc(12828);assertTrue(v instanceof UseOfUndeclaredAnnotationProperty
            || v instanceof UseOfReservedVocabularyForAnnotationPropertyIRI);
        __CLR4_5_29w59w5lvico260.R.inc(12829);v = checkOntology.getViolations().get(1);
        __CLR4_5_29w59w5lvico260.R.inc(12830);assertTrue(v instanceof UseOfUndeclaredAnnotationProperty
            || v instanceof UseOfReservedVocabularyForAnnotationPropertyIRI);
    }finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Test
    public void testGenIdGalenFragment() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2svnly19wf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.testGenIdGalenFragment",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2svnly19wf() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12831);
        __CLR4_5_29w59w5lvico260.R.inc(12832);String test = "<?xml version=\"1.0\"?>\n" + "<rdf:RDF \n"
            + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
            + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
            + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
            + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
            + "    <owl:Ontology rdf:about=\"http://www.co-ode.org/ontologies/galen\"/>\n"
            + "<owl:ObjectProperty rdf:about=\"http://www.co-ode.org/ontologies/galen#hasQuantity\"/>\n"
            + "<owl:Class rdf:about=\"http://www.co-ode.org/ontologies/galen#test\">\n"
            + "<rdfs:subClassOf><owl:Restriction>\n"
            + "<owl:onProperty rdf:resource=\"http://www.co-ode.org/ontologies/galen#hasQuantity\"/>\n"
            + "<owl:someValuesFrom><owl:Class rdf:about=\"http://www.co-ode.org/ontologies/galen#anotherTest\"/></owl:someValuesFrom>\n"
            + "</owl:Restriction></rdfs:subClassOf></owl:Class></rdf:RDF>";
        __CLR4_5_29w59w5lvico260.R.inc(12833);OWLOntology o = loadOntologyFromString(test);
        __CLR4_5_29w59w5lvico260.R.inc(12834);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12835);OWLProfileReport report = profile.checkOntology(o);
        __CLR4_5_29w59w5lvico260.R.inc(12836);assertTrue(report.isInProfile());
    }finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Test
    public void testOWLEL() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtsjs09wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.testOWLEL",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtsjs09wl() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12837);
        __CLR4_5_29w59w5lvico260.R.inc(12838);String onto = "<?xml version=\"1.0\"?>\n" + "<!DOCTYPE rdf:RDF [\n"
            + "<!ENTITY owl \"http://www.w3.org/2002/07/owl#\" >\n"
            + "<!ENTITY rdfs \"http://www.w3.org/2000/01/rdf-schema#\" >\n"
            + "<!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" >\n" + "]>\n"
            + "<rdf:RDF xmlns=\"http://xmlns.com/foaf/0.1/\"\n"
            + "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
            + "xmlns:owl=\"http://www.w3.org/2002/07/owl#\">\n" + "<owl:Ontology rdf:about=\"http://ex.com\"/>\n"
            + "<rdf:Property rdf:about=\"http://ex.com#p1\">\n"
            + "<rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#DatatypeProperty\"/>\n" + "</rdf:Property>\n"
            + "<rdf:Property rdf:about=\"http://ex.com#p2\">\n"
            + "<rdf:type rdf:resource=\"http://www.w3.org/2002/07/owl#DatatypeProperty\"/>\n"
            + "<rdfs:subPropertyOf rdf:resource=\"http://ex.com#p1\"/>\n" + "</rdf:Property>\n" + "</rdf:RDF>";
        __CLR4_5_29w59w5lvico260.R.inc(12839);OWLOntology o = loadOntologyFromString(onto);
        __CLR4_5_29w59w5lvico260.R.inc(12840);OWL2RLProfile p = new OWL2RLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12841);OWLProfileReport report = p.checkOntology(o);
        __CLR4_5_29w59w5lvico260.R.inc(12842);assertTrue(report.getViolations().isEmpty());
    }finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Test
    public void shouldCauseViolationsWithUseOfPropertyInChain() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvtep29wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.shouldCauseViolationsWithUseOfPropertyInChain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvtep29wr() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12843);
        __CLR4_5_29w59w5lvico260.R.inc(12844);OWLOntology o = m.createOntology();
        // SubObjectPropertyOf( ObjectPropertyChain( a:hasFather a:hasBrother )
        // a:hasUncle ) The brother of someone's father is that person's uncle.
        // SubObjectPropertyOf( ObjectPropertyChain( a:hasChild a:hasUncle )
        // a:hasBrother ) The uncle of someone's child is that person's brother.
        __CLR4_5_29w59w5lvico260.R.inc(12845);OWLObjectProperty father = df.getOWLObjectProperty(IRI("urn:test:hasFather"));
        __CLR4_5_29w59w5lvico260.R.inc(12846);OWLObjectProperty brother = df.getOWLObjectProperty(IRI("urn:test:hasBrother"));
        __CLR4_5_29w59w5lvico260.R.inc(12847);OWLObjectProperty child = df.getOWLObjectProperty(IRI("urn:test:hasChild"));
        __CLR4_5_29w59w5lvico260.R.inc(12848);OWLObjectProperty uncle = df.getOWLObjectProperty(IRI("urn:test:hasUncle"));
        __CLR4_5_29w59w5lvico260.R.inc(12849);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(father));
        __CLR4_5_29w59w5lvico260.R.inc(12850);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(brother));
        __CLR4_5_29w59w5lvico260.R.inc(12851);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(child));
        __CLR4_5_29w59w5lvico260.R.inc(12852);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(uncle));
        __CLR4_5_29w59w5lvico260.R.inc(12853);OWLSubPropertyChainOfAxiom brokenAxiom1 = df.getOWLSubPropertyChainOfAxiom(Arrays.asList(father, brother),
            uncle);
        __CLR4_5_29w59w5lvico260.R.inc(12854);OWLSubPropertyChainOfAxiom brokenAxiom2 = df.getOWLSubPropertyChainOfAxiom(Arrays.asList(child, uncle),
            brother);
        __CLR4_5_29w59w5lvico260.R.inc(12855);OWLObjectPropertyManager manager = new OWLObjectPropertyManager(o.getOWLOntologyManager(), o);
        __CLR4_5_29w59w5lvico260.R.inc(12856);o.getOWLOntologyManager().addAxiom(o, brokenAxiom1);
        __CLR4_5_29w59w5lvico260.R.inc(12857);o.getOWLOntologyManager().addAxiom(o, brokenAxiom2);
        __CLR4_5_29w59w5lvico260.R.inc(12858);assertTrue(manager.isLessThan(brother, uncle));
        __CLR4_5_29w59w5lvico260.R.inc(12859);assertTrue(manager.isLessThan(uncle, brother));
        __CLR4_5_29w59w5lvico260.R.inc(12860);assertTrue(manager.isLessThan(brother, brother));
        __CLR4_5_29w59w5lvico260.R.inc(12861);assertTrue(manager.isLessThan(uncle, uncle));
        __CLR4_5_29w59w5lvico260.R.inc(12862);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12863);List<OWLProfileViolation> violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29w59w5lvico260.R.inc(12864);assertFalse(violations.isEmpty());
        __CLR4_5_29w59w5lvico260.R.inc(12865);for (OWLProfileViolation v : violations) {{
            __CLR4_5_29w59w5lvico260.R.inc(12866);assertTrue(brokenAxiom1.equals(v.getAxiom()) || brokenAxiom2.equals(v.getAxiom()));
        }
    }}finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Test
    public void shouldNotCauseViolations() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tx28wy9xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.shouldNotCauseViolations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tx28wy9xf() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12867);
        __CLR4_5_29w59w5lvico260.R.inc(12868);OWLOntology o = m.createOntology();
        __CLR4_5_29w59w5lvico260.R.inc(12869);OWLObjectProperty father = df.getOWLObjectProperty(IRI("urn:test:hasFather"));
        __CLR4_5_29w59w5lvico260.R.inc(12870);OWLObjectProperty brother = df.getOWLObjectProperty(IRI("urn:test:hasBrother"));
        __CLR4_5_29w59w5lvico260.R.inc(12871);OWLObjectProperty child = df.getOWLObjectProperty(IRI("urn:test:hasChild"));
        __CLR4_5_29w59w5lvico260.R.inc(12872);OWLObjectProperty uncle = df.getOWLObjectProperty(IRI("urn:test:hasUncle"));
        __CLR4_5_29w59w5lvico260.R.inc(12873);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(father));
        __CLR4_5_29w59w5lvico260.R.inc(12874);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(brother));
        __CLR4_5_29w59w5lvico260.R.inc(12875);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(child));
        __CLR4_5_29w59w5lvico260.R.inc(12876);o.getOWLOntologyManager().addAxiom(o, df.getOWLDeclarationAxiom(uncle));
        __CLR4_5_29w59w5lvico260.R.inc(12877);OWLSubPropertyChainOfAxiom brokenAxiom1 = df.getOWLSubPropertyChainOfAxiom(CollectionFactory.list(father,
            brother), uncle);
        __CLR4_5_29w59w5lvico260.R.inc(12878);OWLObjectPropertyManager manager = new OWLObjectPropertyManager(o.getOWLOntologyManager(), o);
        __CLR4_5_29w59w5lvico260.R.inc(12879);o.getOWLOntologyManager().addAxiom(o, brokenAxiom1);
        __CLR4_5_29w59w5lvico260.R.inc(12880);assertTrue(manager.isLessThan(brother, uncle));
        __CLR4_5_29w59w5lvico260.R.inc(12881);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12882);List<OWLProfileViolation> violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29w59w5lvico260.R.inc(12883);assertTrue(violations.isEmpty());
        __CLR4_5_29w59w5lvico260.R.inc(12884);for (OWLProfileViolation v : violations) {{
            __CLR4_5_29w59w5lvico260.R.inc(12885);assertEquals(brokenAxiom1, v.getAxiom());
        }
    }}finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Nonnull String input1 = "<?xml version=\"1.0\"?>\n" + "<rdf:RDF xmlns=\"http://purl.org/net/social-reality#\"\n"
        + "     xml:base=\"http://purl.org/net/social-reality\"\n"
        + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
        + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
        + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
        + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
        + "    <owl:Ontology rdf:about=\"http://purl.org/net/social-reality\"/>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#context\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#counts-as\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#has_OR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n" + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/social-reality#is_OR\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "            </rdf:Description>\n" + "        </owl:propertyChainAxiom>\n" + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#is_OR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#BF\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#C\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#OR\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/social-reality#C\"/>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/social-reality#BF\"/>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#is_OR\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n" + "        <rdfs:subClassOf>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:cardinality>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:cardinality>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </rdfs:subClassOf>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "</rdf:RDF>";
    @Nonnull String input2 = "<?xml version=\"1.0\"?>\n" + "<rdf:RDF xmlns=\"http://purl.org/net/roles#\"\n"
        + "     xml:base=\"http://purl.org/net/roles\"\n"
        + "     xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
        + "     xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
        + "     xmlns:xsd=\"http://www.w3.org/2001/XMLSchema#\"\n"
        + "     xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
        + "    <owl:Ontology rdf:about=\"http://purl.org/net/roles\"/>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#has_F\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_Ac\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_F\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_Ar\"/>\n"
        + "        </owl:propertyChainAxiom>\n" + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#has_R\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n" + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_R\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "            </rdf:Description>\n" + "        </owl:propertyChainAxiom>\n" + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#has_TR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_Ac\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_TR\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/roles#is_Ag\"/>\n"
        + "        </owl:propertyChainAxiom>\n" + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_Ac\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_Ag\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_Ar\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_F\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_R\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#is_TR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n" + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/roles#plays\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#context\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#counts-as\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#has_OR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "        <owl:propertyChainAxiom rdf:parseType=\"Collection\">\n" + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "            </rdf:Description>\n"
        + "            <rdf:Description rdf:about=\"http://purl.org/net/social-reality#is_OR\"/>\n"
        + "            <rdf:Description>\n"
        + "                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "            </rdf:Description>\n" + "        </owl:propertyChainAxiom>\n" + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://purl.org/net/social-reality#is_OR\">\n"
        + "        <rdfs:subPropertyOf rdf:resource=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    </owl:ObjectProperty>\n"
        + "    <owl:ObjectProperty rdf:about=\"http://www.w3.org/2002/07/owl#topObjectProperty\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#Ac\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_Ac\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n"
        + "        <rdfs:subClassOf rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#Ag\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_Ag\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n"
        + "        <rdfs:subClassOf rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#Ar\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_Ar\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#F\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/roles#Ac\"/>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/roles#Ar\"/>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_F\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n"
        + "        <rdfs:subClassOf rdf:resource=\"http://purl.org/net/social-reality#OR\"/>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#R\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n" + "                <owl:onProperty>\n"
        + "                    <rdf:Description>\n"
        + "                        <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "                    </rdf:Description>\n" + "                </owl:onProperty>\n"
        + "                <owl:someValuesFrom rdf:resource=\"http://purl.org/net/social-reality#BF\"/>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_R\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n"
        + "        <rdfs:subClassOf rdf:resource=\"http://purl.org/net/social-reality#OR\"/>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/roles#TR\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/roles#Ac\"/>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/roles#plays\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/roles#Ag\"/>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/roles#is_TR\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n"
        + "        <rdfs:subClassOf rdf:resource=\"http://purl.org/net/social-reality#OR\"/>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#BF\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#C\"/>\n"
        + "    <owl:Class rdf:about=\"http://purl.org/net/social-reality#OR\">\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/social-reality#C\"/>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:someValuesFrom rdf:resource=\"http://purl.org/net/social-reality#BF\"/>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </owl:equivalentClass>\n" + "        <owl:equivalentClass>\n"
        + "            <owl:Restriction>\n"
        + "                <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#is_OR\"/>\n"
        + "                <owl:hasSelf rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\">true</owl:hasSelf>\n"
        + "            </owl:Restriction>\n" + "        </owl:equivalentClass>\n" + "        <rdfs:subClassOf>\n"
        + "            <owl:Class>\n" + "                <owl:intersectionOf rdf:parseType=\"Collection\">\n"
        + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty rdf:resource=\"http://purl.org/net/social-reality#context\"/>\n"
        + "                        <owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:cardinality>\n"
        + "                    </owl:Restriction>\n" + "                    <owl:Restriction>\n"
        + "                        <owl:onProperty>\n" + "                            <rdf:Description>\n"
        + "                                <owl:inverseOf rdf:resource=\"http://purl.org/net/social-reality#counts-as\"/>\n"
        + "                            </rdf:Description>\n" + "                        </owl:onProperty>\n"
        + "                        <owl:cardinality rdf:datatype=\"http://www.w3.org/2001/XMLSchema#nonNegativeInteger\">1</owl:cardinality>\n"
        + "                    </owl:Restriction>\n" + "                </owl:intersectionOf>\n"
        + "            </owl:Class>\n" + "        </rdfs:subClassOf>\n" + "    </owl:Class>\n"
        + "    <owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>\n" + "</rdf:RDF>";

    @Test
    public void shouldNotCauseViolationsInput1() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbzm6d9xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.shouldNotCauseViolationsInput1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbzm6d9xy() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12886);
        __CLR4_5_29w59w5lvico260.R.inc(12887);OWLOntology o = m.loadOntologyFromOntologyDocument(new ByteArrayInputStream(input1.getBytes()));
        __CLR4_5_29w59w5lvico260.R.inc(12888);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12889);List<OWLProfileViolation> violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29w59w5lvico260.R.inc(12890);assertTrue(violations.isEmpty());
    }finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}

    @Test
    public void shouldNotCauseViolationsInput2() throws OWLOntologyCreationException {__CLR4_5_29w59w5lvico260.R.globalSliceStart(getClass().getName(),12891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykzkyu9y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_29w59w5lvico260.R.rethrow($CLV_t2$);}finally{__CLR4_5_29w59w5lvico260.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.profiles.test.ForbiddenVocabularyTestCase.shouldNotCauseViolationsInput2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),12891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykzkyu9y3() throws OWLOntologyCreationException{try{__CLR4_5_29w59w5lvico260.R.inc(12891);
        __CLR4_5_29w59w5lvico260.R.inc(12892);OWLOntology o = m.loadOntologyFromOntologyDocument(new ByteArrayInputStream(input2.getBytes()));
        __CLR4_5_29w59w5lvico260.R.inc(12893);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_29w59w5lvico260.R.inc(12894);List<OWLProfileViolation> violations = profile.checkOntology(o).getViolations();
        __CLR4_5_29w59w5lvico260.R.inc(12895);assertTrue(violations.isEmpty());
    }finally{__CLR4_5_29w59w5lvico260.R.flushNeeded();}}
}
