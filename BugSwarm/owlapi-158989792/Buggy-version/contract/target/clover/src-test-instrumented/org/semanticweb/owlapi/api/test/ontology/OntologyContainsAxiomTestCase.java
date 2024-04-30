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
package org.semanticweb.owlapi.api.test.ontology;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.model.parameters.AxiomAnnotations.*;
import static org.semanticweb.owlapi.model.parameters.Imports.*;

import java.io.File;
import java.io.FileOutputStream;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.formats.TurtleDocumentFormat;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class OntologyContainsAxiomTestCase extends TestBase {static class __CLR4_5_27cn7cnlvico1ga{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testOntologyContainsPlainAxiom() {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iat60d7cn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsPlainAxiom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iat60d7cn(){try{__CLR4_5_27cn7cnlvico1ga.R.inc(9527);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9528);OWLAxiom axiom = SubClassOf(Class(iri("A")), Class(iri("B")));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9529);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9530);ont.getOWLOntologyManager().addAxiom(ont, axiom);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9531);assertTrue(ont.containsAxiom(axiom));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9532);assertTrue(ont.containsAxiom(axiom, EXCLUDED, IGNORE_AXIOM_ANNOTATIONS));
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAnnotatedAxiom() {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wjgyp7ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAnnotatedAxiom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wjgyp7ct(){try{__CLR4_5_27cn7cnlvico1ga.R.inc(9533);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9534);OWLLiteral annoLiteral = Literal("value");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9535);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9536);OWLAnnotation anno = Annotation(annoProp, annoLiteral);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9537);OWLAxiom axiom = SubClassOf(Class(iri("A")), Class(iri("B")), singleton(anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9538);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9539);ont.getOWLOntologyManager().addAxiom(ont, axiom);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9540);assertTrue(ont.containsAxiom(axiom));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9541);assertTrue(ont.containsAxiom(axiom, EXCLUDED, IGNORE_AXIOM_ANNOTATIONS));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9542);assertFalse(ont.containsAxiom(axiom.getAxiomWithoutAnnotations()));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9543);assertTrue(ont.containsAxiom(axiom.getAxiomWithoutAnnotations(), EXCLUDED, IGNORE_AXIOM_ANNOTATIONS));
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForRDFXML1() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hknjbj7d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForRDFXML1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hknjbj7d4() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9544);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9545);RDFXMLDocumentFormat format = createRDFXMLFormat();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9546);runTestOntologyContainsAxioms1(format);
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Nonnull
    private static RDFXMLDocumentFormat createRDFXMLFormat() {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9547);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9548);RDFXMLDocumentFormat format = new RDFXMLDocumentFormat();
        // This test case relies on certain declarations being in certain
        // ontologies. The default
        // behaviour is to add missing declarations. Therefore, this needs to be
        // turned off.
        __CLR4_5_27cn7cnlvico1ga.R.inc(9549);format.setAddMissingTypes(false);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9550);return format;
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForOWLXML1() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2545ppd7db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForOWLXML1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2545ppd7db() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9551);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9552);runTestOntologyContainsAxioms1(new OWLXMLDocumentFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForOWLFunctionalSyntax1() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21zt6to7dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForOWLFunctionalSyntax1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21zt6to7dd() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9553);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9554);runTestOntologyContainsAxioms1(new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForTurtleSyntax1() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221kw197df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForTurtleSyntax1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221kw197df() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9555);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9556);TurtleDocumentFormat format = createTurtleOntologyFormat();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9557);runTestOntologyContainsAxioms1(format);
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Nonnull
    private static TurtleDocumentFormat createTurtleOntologyFormat() {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9558);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9559);TurtleDocumentFormat format = new TurtleDocumentFormat();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9560);format.setAddMissingTypes(false);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9561);return format;
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @SuppressWarnings("resource")
    private void runTestOntologyContainsAxioms1(@Nonnull OWLDocumentFormat format) throws Exception {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9562);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9563);OWLOntology ont1 = getOWLOntology("testont1A");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9564);@Nonnull IRI ont1iri = ont1.getOntologyID().getOntologyIRI().get();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9565);OWLOntology ont2 = getOWLOntology("testont2A");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9566);@Nonnull IRI ont2iri = ont2.getOntologyID().getOntologyIRI().get();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9567);OWLImportsDeclaration ont2import = ImportsDeclaration(ont1iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9568);ont1.getOWLOntologyManager().applyChange(new AddImport(ont2, ont2import));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9569);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9570);OWLAxiom axannoPropdecl = Declaration(annoProp);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9571);ont1.getOWLOntologyManager().addAxiom(ont1, axannoPropdecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9572);OWLAnnotation inont1anno = Annotation(annoProp, ont1iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9573);OWLAnnotation inont2anno = Annotation(annoProp, ont2iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9574);OWLClass a = Class(iri("A"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9575);OWLAxiom axAdecl = Declaration(a, singleton(inont1anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9576);ont1.getOWLOntologyManager().addAxiom(ont1, axAdecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9577);OWLClass b = Class(iri("B"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9578);OWLAxiom axBdecl = Declaration(b, singleton(inont2anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9579);ont2.getOWLOntologyManager().addAxiom(ont2, axBdecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9580);OWLAxiom axAsubB = SubClassOf(Class(iri("A")), Class(iri("B")), singleton(inont2anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9581);ont2.getOWLOntologyManager().addAxiom(ont2, axAsubB);
        // annoProp is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9582);assertTrue(containsConsiderEx(ont1, axannoPropdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9583);assertFalse(containsConsiderEx(ont2, axannoPropdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9584);assertTrue(containsConsider(ont2, axannoPropdecl));
        // A is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9585);assertTrue(containsConsiderEx(ont1, axAdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9586);assertFalse(containsConsiderEx(ont2, axAdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9587);assertTrue(containsConsider(ont2, axAdecl));
        // B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9588);assertFalse(containsConsider(ont1, axBdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9589);assertTrue(containsConsiderEx(ont2, axBdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9590);assertTrue(containsConsider(ont2, axBdecl));
        // A is a subclass of B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9591);assertFalse(containsConsider(ont1, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9592);assertTrue(containsConsiderEx(ont2, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9593);assertTrue(containsConsider(ont2, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9594);@Nonnull File savedLocation1 = folder.newFile("testont1A.owl");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9595);FileOutputStream out1 = new FileOutputStream(savedLocation1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9596);StreamDocumentTarget writer1 = new StreamDocumentTarget(out1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9597);ont1.getOWLOntologyManager().saveOntology(ont1, format, writer1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9598);@Nonnull File savedLocation2 = folder.newFile("testont2A.owl");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9599);FileOutputStream out2 = new FileOutputStream(savedLocation2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9600);StreamDocumentTarget writer2 = new StreamDocumentTarget(out2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9601);ont2.getOWLOntologyManager().saveOntology(ont2, format, writer2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9602);OWLOntologyManager man = m1;
        __CLR4_5_27cn7cnlvico1ga.R.inc(9603);OWLOntology ont1L = man.loadOntologyFromOntologyDocument(savedLocation1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9604);OWLOntology ont2L = man.loadOntologyFromOntologyDocument(savedLocation2);
        // annoProp is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9605);assertTrue(containsConsiderEx(ont1L, axannoPropdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9606);assertFalse(containsConsiderEx(ont2L, axannoPropdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9607);assertTrue(containsConsider(ont2L, axannoPropdecl));
        // A is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9608);assertTrue(containsConsiderEx(ont1L, axAdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9609);assertFalse(containsConsiderEx(ont2L, axAdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9610);assertTrue(containsConsider(ont2L, axAdecl));
        // B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9611);assertFalse(containsConsider(ont1L, axBdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9612);assertTrue(containsConsiderEx(ont2L, axBdecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9613);assertTrue(containsConsider(ont2L, axBdecl));
        // A is a subclass of B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9614);assertFalse(containsConsider(ont1L, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9615);assertTrue(containsConsiderEx(ont2L, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9616);assertTrue(containsConsider(ont2L, axAsubB));
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    boolean containsConsider(OWLOntology o, @Nonnull OWLAxiom ax) {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9617);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9618);return o.containsAxiom(ax, INCLUDED, CONSIDER_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    boolean containsConsiderEx(OWLOntology o, @Nonnull OWLAxiom ax) {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9619);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9620);return o.containsAxiom(ax, EXCLUDED, CONSIDER_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForRDFXML2() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ktni407f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForRDFXML2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ktni407f9() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9621);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9622);runTestOntologyContainsAxioms2(createRDFXMLFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForOWLXML2() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21v5qww7fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForOWLXML2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21v5qww7fb() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9623);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9624);runTestOntologyContainsAxioms2(new OWLXMLDocumentFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForOWLFunctionalSyntax2() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2196ryt7fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForOWLFunctionalSyntax2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2196ryt7fd() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9625);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9626);runTestOntologyContainsAxioms2(new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @Test
    public void testOntologyContainsAxiomsForTurtleSyntax2() throws Exception {__CLR4_5_27cn7cnlvico1ga.R.globalSliceStart(getClass().getName(),9627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_217f2r87ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27cn7cnlvico1ga.R.rethrow($CLV_t2$);}finally{__CLR4_5_27cn7cnlvico1ga.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyContainsAxiomTestCase.testOntologyContainsAxiomsForTurtleSyntax2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_217f2r87ff() throws Exception{try{__CLR4_5_27cn7cnlvico1ga.R.inc(9627);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9628);runTestOntologyContainsAxioms2(createTurtleOntologyFormat());
    }finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}

    @SuppressWarnings("resource")
    private void runTestOntologyContainsAxioms2(@Nonnull OWLDocumentFormat format) throws Exception {try{__CLR4_5_27cn7cnlvico1ga.R.inc(9629);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9630);OWLOntology ont1 = getOWLOntology("testont1B");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9631);IRI ont1iri = ont1.getOntologyID().getOntologyIRI().get();
        __CLR4_5_27cn7cnlvico1ga.R.inc(9632);OWLOntology ont2 = getOWLOntology("testont2B");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9633);IRI ont2iri = ont2.getOntologyID().getOntologyIRI().get();
        assert (((ont1iri != null)&&(__CLR4_5_27cn7cnlvico1ga.R.iget(9634)!=0|true))||(__CLR4_5_27cn7cnlvico1ga.R.iget(9635)==0&false));
        assert (((ont2iri != null)&&(__CLR4_5_27cn7cnlvico1ga.R.iget(9636)!=0|true))||(__CLR4_5_27cn7cnlvico1ga.R.iget(9637)==0&false));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9638);OWLImportsDeclaration ont2import = ImportsDeclaration(ont1iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9639);ont2.getOWLOntologyManager().applyChange(new AddImport(ont2, ont2import));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9640);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9641);OWLAxiom axAnnoPropDecl = Declaration(annoProp);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9642);ont1.getOWLOntologyManager().addAxiom(ont1, axAnnoPropDecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9643);OWLAnnotation inOnt1Anno = Annotation(annoProp, ont1iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9644);OWLAnnotation inOnt2Anno = Annotation(annoProp, ont2iri);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9645);OWLClass a = Class(iri("A"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9646);OWLAxiom axADecl = Declaration(a, singleton(inOnt1Anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9647);ont1.getOWLOntologyManager().addAxiom(ont1, axADecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9648);OWLClass b = Class(iri("B"));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9649);OWLAxiom axBDecl = Declaration(b, singleton(inOnt2Anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9650);ont2.getOWLOntologyManager().addAxiom(ont2, axBDecl);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9651);OWLAxiom axAsubB = SubClassOf(Class(iri("A")), Class(iri("B")), singleton(inOnt2Anno));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9652);ont2.getOWLOntologyManager().addAxiom(ont2, axAsubB);
        // annoProp is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9653);assertTrue(containsConsiderEx(ont1, axAnnoPropDecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9654);assertFalse(containsConsiderEx(ont2, axAnnoPropDecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9655);assertTrue(containsConsider(ont2, axAnnoPropDecl));
        // A is in ont1 and in the import closure of ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9656);assertTrue(containsConsiderEx(ont1, axADecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9657);assertFalse(containsConsiderEx(ont2, axADecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9658);assertTrue(containsConsider(ont2, axADecl));
        // B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9659);assertFalse(containsConsider(ont1, axBDecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9660);assertTrue(containsConsiderEx(ont2, axBDecl));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9661);assertTrue(containsConsider(ont2, axBDecl));
        // A is a subclass of B is in only in ont2
        __CLR4_5_27cn7cnlvico1ga.R.inc(9662);assertFalse(containsConsider(ont1, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9663);assertTrue(containsConsiderEx(ont2, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9664);assertTrue(containsConsider(ont2, axAsubB));
        __CLR4_5_27cn7cnlvico1ga.R.inc(9665);@Nonnull File savedLocation1 = folder.newFile("testont1B.owl");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9666);FileOutputStream out1 = new FileOutputStream(savedLocation1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9667);StreamDocumentTarget writer1 = new StreamDocumentTarget(out1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9668);ont1.getOWLOntologyManager().saveOntology(ont1, format, writer1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9669);@Nonnull File savedLocation2 = folder.newFile("testont2B.owl");
        __CLR4_5_27cn7cnlvico1ga.R.inc(9670);FileOutputStream out2 = new FileOutputStream(savedLocation2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9671);StreamDocumentTarget writer2 = new StreamDocumentTarget(out2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9672);ont2.getOWLOntologyManager().saveOntology(ont2, format, writer2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9673);OWLOntologyManager man = m1;
        __CLR4_5_27cn7cnlvico1ga.R.inc(9674);@SuppressWarnings("unused") OWLOntology ont1L = man.loadOntologyFromOntologyDocument(savedLocation1);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9675);OWLOntology ont2L = man.loadOntologyFromOntologyDocument(savedLocation2);
        __CLR4_5_27cn7cnlvico1ga.R.inc(9676);for (OWLOntology importedOntology : ont2L.getImports()) {{
            __CLR4_5_27cn7cnlvico1ga.R.inc(9677);for (OWLAxiom importedAxiom : importedOntology.getAxioms()) {{
                assert (((importedAxiom != null)&&(__CLR4_5_27cn7cnlvico1ga.R.iget(9678)!=0|true))||(__CLR4_5_27cn7cnlvico1ga.R.iget(9679)==0&false));
                __CLR4_5_27cn7cnlvico1ga.R.inc(9680);assertTrue(containsConsiderEx(importedOntology, importedAxiom));
                __CLR4_5_27cn7cnlvico1ga.R.inc(9681);assertFalse(containsConsiderEx(ont2L, importedAxiom));
            }
        }}
    }}finally{__CLR4_5_27cn7cnlvico1ga.R.flushNeeded();}}
}
