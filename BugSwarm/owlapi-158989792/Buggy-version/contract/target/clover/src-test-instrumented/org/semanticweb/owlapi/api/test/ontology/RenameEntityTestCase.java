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

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.util.OWLEntityRenamer;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class RenameEntityTestCase extends TestBase {static class __CLR4_5_27mb7mblvico1ir{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10081,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRenameClass() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),9875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wdube77mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wdube77mb(){try{__CLR4_5_27mb7mblvico1ir.R.inc(9875);
        __CLR4_5_27mb7mblvico1ir.R.inc(9876);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(9877);OWLClass clsAIRI1 = Class(iri("ClsA1"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9878);OWLClass clsAIRI2 = Class(iri("ClsA2"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9879);OWLClass clsB = Class(iri("ClsB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9880);OWLClass clsC = Class(iri("ClsC"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9881);OWLObjectPropertyExpression propA = ObjectProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9882);OWLDataPropertyExpression propB = DataProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9883);OWLIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9884);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9885);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9886);axioms1.add(SubClassOf(clsAIRI1, clsB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9887);axioms1.add(EquivalentClasses(clsAIRI1, clsC));
        __CLR4_5_27mb7mblvico1ir.R.inc(9888);axioms1.add(DisjointClasses(clsAIRI1, clsC));
        __CLR4_5_27mb7mblvico1ir.R.inc(9889);axioms1.add(ObjectPropertyDomain(propA, clsAIRI1));
        __CLR4_5_27mb7mblvico1ir.R.inc(9890);axioms1.add(ObjectPropertyRange(propA, clsAIRI1));
        __CLR4_5_27mb7mblvico1ir.R.inc(9891);axioms1.add(DataPropertyDomain(propB, clsAIRI1));
        __CLR4_5_27mb7mblvico1ir.R.inc(9892);axioms1.add(ClassAssertion(clsAIRI1, indA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9893);axioms1.add(AnnotationAssertion(annoProp, clsAIRI1.getIRI(),
                Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9894);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(9895);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9896);axioms2.add(SubClassOf(clsAIRI2, clsB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9897);axioms2.add(EquivalentClasses(clsAIRI2, clsC));
        __CLR4_5_27mb7mblvico1ir.R.inc(9898);axioms2.add(DisjointClasses(clsAIRI2, clsC));
        __CLR4_5_27mb7mblvico1ir.R.inc(9899);axioms2.add(ObjectPropertyDomain(propA, clsAIRI2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9900);axioms2.add(ObjectPropertyRange(propA, clsAIRI2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9901);axioms2.add(DataPropertyDomain(propB, clsAIRI2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9902);axioms2.add(ClassAssertion(clsAIRI2, indA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9903);axioms2.add(AnnotationAssertion(annoProp, clsAIRI2.getIRI(),
                Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9904);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(9905);List<OWLOntologyChange> changes = entityRenamer.changeIRI(clsAIRI1,
                clsAIRI2.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9906);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(9907);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9908);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                clsAIRI2.getIRI(), clsAIRI1.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9909);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9910);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}

    @Test
    public void testRenameObjectProperty() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),9911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22d8rcl7nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22d8rcl7nb(){try{__CLR4_5_27mb7mblvico1ir.R.inc(9911);
        __CLR4_5_27mb7mblvico1ir.R.inc(9912);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(9913);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9914);OWLObjectProperty propA = ObjectProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9915);OWLObjectProperty propA2 = ObjectProperty(iri("propA2"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9916);OWLObjectPropertyExpression propB = ObjectProperty(iri("propB"))
                .getInverseProperty();
        __CLR4_5_27mb7mblvico1ir.R.inc(9917);OWLIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9918);OWLIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9919);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9920);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9921);axioms1.add(SubObjectPropertyOf(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9922);axioms1.add(EquivalentObjectProperties(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9923);axioms1.add(DisjointObjectProperties(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9924);axioms1.add(ObjectPropertyDomain(propA, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9925);axioms1.add(ObjectPropertyRange(propA, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9926);axioms1.add(FunctionalObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9927);axioms1.add(InverseFunctionalObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9928);axioms1.add(SymmetricObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9929);axioms1.add(AsymmetricObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9930);axioms1.add(TransitiveObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9931);axioms1.add(ReflexiveObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9932);axioms1.add(IrreflexiveObjectProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9933);axioms1.add(ObjectPropertyAssertion(propA, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9934);axioms1.add(NegativeObjectPropertyAssertion(propA, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9935);axioms1.add(AnnotationAssertion(annoProp, propA.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9936);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(9937);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9938);axioms2.add(SubObjectPropertyOf(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9939);axioms2.add(EquivalentObjectProperties(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9940);axioms2.add(DisjointObjectProperties(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9941);axioms2.add(ObjectPropertyDomain(propA2, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9942);axioms2.add(ObjectPropertyRange(propA2, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9943);axioms2.add(FunctionalObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9944);axioms2.add(InverseFunctionalObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9945);axioms2.add(SymmetricObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9946);axioms2.add(AsymmetricObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9947);axioms2.add(TransitiveObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9948);axioms2.add(ReflexiveObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9949);axioms2.add(IrreflexiveObjectProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9950);axioms2.add(ObjectPropertyAssertion(propA2, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9951);axioms2.add(NegativeObjectPropertyAssertion(propA2, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9952);axioms2.add(AnnotationAssertion(annoProp, propA2.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9953);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(9954);List<OWLOntologyChange> changes = entityRenamer.changeIRI(propA,
                propA2.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9955);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(9956);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9957);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                propA2.getIRI(), propA.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9958);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9959);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}

    @Test
    public void testRenameDataProperty() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),9960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23rri527oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23rri527oo(){try{__CLR4_5_27mb7mblvico1ir.R.inc(9960);
        __CLR4_5_27mb7mblvico1ir.R.inc(9961);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(9962);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9963);OWLDataProperty propA = DataProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9964);OWLDataProperty propA2 = DataProperty(iri("propA2"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9965);OWLDataPropertyExpression propB = DataProperty(iri("propB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9966);OWLIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9967);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9968);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9969);axioms1.add(SubDataPropertyOf(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9970);axioms1.add(EquivalentDataProperties(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9971);axioms1.add(DisjointDataProperties(propA, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9972);axioms1.add(DataPropertyDomain(propA, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9973);axioms1.add(DataPropertyRange(propA, TopDatatype()));
        __CLR4_5_27mb7mblvico1ir.R.inc(9974);axioms1.add(FunctionalDataProperty(propA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9975);axioms1.add(DataPropertyAssertion(propA, indA, Literal(33)));
        __CLR4_5_27mb7mblvico1ir.R.inc(9976);axioms1.add(NegativeDataPropertyAssertion(propA, indA, Literal(44)));
        __CLR4_5_27mb7mblvico1ir.R.inc(9977);axioms1.add(AnnotationAssertion(annoProp, propA.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9978);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(9979);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(9980);axioms2.add(SubDataPropertyOf(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9981);axioms2.add(EquivalentDataProperties(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9982);axioms2.add(DisjointDataProperties(propA2, propB));
        __CLR4_5_27mb7mblvico1ir.R.inc(9983);axioms2.add(DataPropertyDomain(propA2, clsA));
        __CLR4_5_27mb7mblvico1ir.R.inc(9984);axioms2.add(DataPropertyRange(propA2, TopDatatype()));
        __CLR4_5_27mb7mblvico1ir.R.inc(9985);axioms2.add(FunctionalDataProperty(propA2));
        __CLR4_5_27mb7mblvico1ir.R.inc(9986);axioms2.add(DataPropertyAssertion(propA2, indA, Literal(33)));
        __CLR4_5_27mb7mblvico1ir.R.inc(9987);axioms2.add(NegativeDataPropertyAssertion(propA2, indA, Literal(44)));
        __CLR4_5_27mb7mblvico1ir.R.inc(9988);axioms2.add(AnnotationAssertion(annoProp, propA2.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(9989);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(9990);List<OWLOntologyChange> changes = entityRenamer.changeIRI(propA,
                propA2.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9991);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(9992);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9993);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                propA2.getIRI(), propA.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(9994);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(9995);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}

    @Test
    public void testRenameIndividual() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),9996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2amzb687po();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2amzb687po(){try{__CLR4_5_27mb7mblvico1ir.R.inc(9996);
        __CLR4_5_27mb7mblvico1ir.R.inc(9997);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(9998);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(9999);OWLDataProperty propA = DataProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10000);OWLObjectProperty propB = ObjectProperty(iri("propB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10001);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10002);OWLNamedIndividual indB = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10003);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10004);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10005);axioms1.add(ClassAssertion(clsA, indA));
        __CLR4_5_27mb7mblvico1ir.R.inc(10006);axioms1.add(DataPropertyAssertion(propA, indA, Literal(33)));
        __CLR4_5_27mb7mblvico1ir.R.inc(10007);axioms1.add(NegativeDataPropertyAssertion(propA, indA, Literal(44)));
        __CLR4_5_27mb7mblvico1ir.R.inc(10008);axioms1.add(AnnotationAssertion(annoProp, propA.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(10009);axioms1.add(ObjectPropertyAssertion(propB, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(10010);axioms1.add(NegativeObjectPropertyAssertion(propB, indA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(10011);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(10012);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10013);axioms2.add(ClassAssertion(clsA, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(10014);axioms2.add(DataPropertyAssertion(propA, indB, Literal(33)));
        __CLR4_5_27mb7mblvico1ir.R.inc(10015);axioms2.add(NegativeDataPropertyAssertion(propA, indB, Literal(44)));
        __CLR4_5_27mb7mblvico1ir.R.inc(10016);axioms2.add(AnnotationAssertion(annoProp, propA.getIRI(), Literal("X")));
        __CLR4_5_27mb7mblvico1ir.R.inc(10017);axioms2.add(ObjectPropertyAssertion(propB, indB, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(10018);axioms2.add(NegativeObjectPropertyAssertion(propB, indB, indB));
        __CLR4_5_27mb7mblvico1ir.R.inc(10019);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(10020);List<OWLOntologyChange> changes = entityRenamer.changeIRI(indA,
                indB.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10021);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(10022);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10023);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                indB.getIRI(), indA.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10024);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10025);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}

    @Test
    public void testRenameDatatype() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),10026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ov8x177qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ov8x177qi(){try{__CLR4_5_27mb7mblvico1ir.R.inc(10026);
        __CLR4_5_27mb7mblvico1ir.R.inc(10027);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(10028);OWLDatatype dtA = Datatype(iri("DtA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10029);OWLDatatype dtB = Datatype(iri("DtB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10030);OWLDatatype dtC = Datatype(iri("DtC"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10031);OWLDataRange rng1 = DataIntersectionOf(dtA, dtB);
        __CLR4_5_27mb7mblvico1ir.R.inc(10032);OWLDataRange rng1R = DataIntersectionOf(dtC, dtB);
        __CLR4_5_27mb7mblvico1ir.R.inc(10033);OWLDataRange rng2 = DataUnionOf(dtA, dtB);
        __CLR4_5_27mb7mblvico1ir.R.inc(10034);OWLDataRange rng2R = DataUnionOf(dtC, dtB);
        __CLR4_5_27mb7mblvico1ir.R.inc(10035);OWLDataRange rng3 = DataComplementOf(dtA);
        __CLR4_5_27mb7mblvico1ir.R.inc(10036);OWLDataRange rng3R = DataComplementOf(dtC);
        __CLR4_5_27mb7mblvico1ir.R.inc(10037);OWLDataPropertyExpression propB = DataProperty(iri("propA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10038);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10039);axioms1.add(DataPropertyRange(propB, rng1));
        __CLR4_5_27mb7mblvico1ir.R.inc(10040);axioms1.add(DataPropertyRange(propB, rng2));
        __CLR4_5_27mb7mblvico1ir.R.inc(10041);axioms1.add(DataPropertyRange(propB, rng3));
        __CLR4_5_27mb7mblvico1ir.R.inc(10042);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(10043);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10044);axioms2.add(DataPropertyRange(propB, rng1R));
        __CLR4_5_27mb7mblvico1ir.R.inc(10045);axioms2.add(DataPropertyRange(propB, rng2R));
        __CLR4_5_27mb7mblvico1ir.R.inc(10046);axioms2.add(DataPropertyRange(propB, rng3R));
        __CLR4_5_27mb7mblvico1ir.R.inc(10047);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(10048);List<OWLOntologyChange> changes = entityRenamer.changeIRI(dtA,
                dtC.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10049);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(10050);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10051);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                dtC.getIRI(), dtA.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10052);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10053);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}

    @Test
    public void testRenameAnnotationProperty() {__CLR4_5_27mb7mblvico1ir.R.globalSliceStart(getClass().getName(),10054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rwdda37ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27mb7mblvico1ir.R.rethrow($CLV_t2$);}finally{__CLR4_5_27mb7mblvico1ir.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.RenameEntityTestCase.testRenameAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rwdda37ra(){try{__CLR4_5_27mb7mblvico1ir.R.inc(10054);
        __CLR4_5_27mb7mblvico1ir.R.inc(10055);OWLOntology ont = getOWLOntology("testont");
        __CLR4_5_27mb7mblvico1ir.R.inc(10056);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10057);OWLNamedIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10058);OWLAnnotationProperty annoProp = AnnotationProperty(iri("annoProp"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10059);OWLAnnotationProperty annoPropR = AnnotationProperty(iri("annoPropR"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10060);OWLAnnotationProperty annoProp2 = AnnotationProperty(iri("annoProp2"));
        __CLR4_5_27mb7mblvico1ir.R.inc(10061);Set<OWLAxiom> axioms1 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10062);axioms1.add(Declaration(annoProp));
        __CLR4_5_27mb7mblvico1ir.R.inc(10063);axioms1.add(AnnotationAssertion(annoProp, indA.getIRI(), indB.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10064);axioms1.add(SubAnnotationPropertyOf(annoProp, annoProp2));
        __CLR4_5_27mb7mblvico1ir.R.inc(10065);axioms1.add(AnnotationPropertyRange(annoProp, indA.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10066);axioms1.add(AnnotationPropertyDomain(annoProp, indA.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10067);ont.getOWLOntologyManager().addAxioms(ont, axioms1);
        __CLR4_5_27mb7mblvico1ir.R.inc(10068);Set<OWLAxiom> axioms2 = new HashSet<>();
        __CLR4_5_27mb7mblvico1ir.R.inc(10069);axioms2.add(Declaration(annoPropR));
        __CLR4_5_27mb7mblvico1ir.R.inc(10070);axioms2.add(AnnotationAssertion(annoPropR, indA.getIRI(), indB.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10071);axioms2.add(SubAnnotationPropertyOf(annoPropR, annoProp2));
        __CLR4_5_27mb7mblvico1ir.R.inc(10072);axioms2.add(AnnotationPropertyRange(annoPropR, indA.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10073);axioms2.add(AnnotationPropertyDomain(annoPropR, indA.getIRI()));
        __CLR4_5_27mb7mblvico1ir.R.inc(10074);OWLEntityRenamer entityRenamer = new OWLEntityRenamer(
                ont.getOWLOntologyManager(), singleton(ont));
        __CLR4_5_27mb7mblvico1ir.R.inc(10075);List<OWLOntologyChange> changes = entityRenamer.changeIRI(annoProp,
                annoPropR.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10076);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_27mb7mblvico1ir.R.inc(10077);assertEquals(ont.getAxioms(), axioms2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10078);List<OWLOntologyChange> changes2 = entityRenamer.changeIRI(
                annoPropR.getIRI(), annoProp.getIRI());
        __CLR4_5_27mb7mblvico1ir.R.inc(10079);ont.getOWLOntologyManager().applyChanges(changes2);
        __CLR4_5_27mb7mblvico1ir.R.inc(10080);assertEquals(ont.getAxioms(), axioms1);
    }finally{__CLR4_5_27mb7mblvico1ir.R.flushNeeded();}}
}
