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
import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.search.EntitySearcher.*;
import static org.semanticweb.owlapi.search.Filters.*;
import static org.semanticweb.owlapi.search.Searcher.*;

import java.util.Collection;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
@SuppressWarnings("javadoc")
public class OWLOntologyAccessorsTestCase extends TestBase {static class __CLR4_5_26wx6wxlvico1ek{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static void performAxiomTests(@Nonnull OWLOntology ont,
            @Nonnull OWLAxiom... axioms) {try{__CLR4_5_26wx6wxlvico1ek.R.inc(8961);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8962);assertEquals(ont.getAxiomCount(), axioms.length);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8963);for (OWLAxiom ax : axioms) {{
            __CLR4_5_26wx6wxlvico1ek.R.inc(8964);assertTrue(ont.getAxioms().contains(ax));
            __CLR4_5_26wx6wxlvico1ek.R.inc(8965);if ((((ax.isLogicalAxiom())&&(__CLR4_5_26wx6wxlvico1ek.R.iget(8966)!=0|true))||(__CLR4_5_26wx6wxlvico1ek.R.iget(8967)==0&false))) {{
                __CLR4_5_26wx6wxlvico1ek.R.inc(8968);assertTrue(ont.getLogicalAxioms().contains(ax));
            }
            }__CLR4_5_26wx6wxlvico1ek.R.inc(8969);assertEquals(ont.getLogicalAxiomCount(), axioms.length);
            __CLR4_5_26wx6wxlvico1ek.R.inc(8970);AxiomType<?> axiomType = ax.getAxiomType();
            __CLR4_5_26wx6wxlvico1ek.R.inc(8971);assertTrue(ont.getAxioms(axiomType).contains(ax));
            __CLR4_5_26wx6wxlvico1ek.R.inc(8972);assertTrue(ont.getAxioms(axiomType, INCLUDED).contains(ax));
            __CLR4_5_26wx6wxlvico1ek.R.inc(8973);assertEquals(ont.getAxiomCount(axiomType), axioms.length);
            __CLR4_5_26wx6wxlvico1ek.R.inc(8974);assertEquals(ont.getAxiomCount(axiomType, INCLUDED), axioms.length);
            __CLR4_5_26wx6wxlvico1ek.R.inc(8975);for (OWLEntity entity : ax.getSignature()) {{
                assert (((entity != null)&&(__CLR4_5_26wx6wxlvico1ek.R.iget(8976)!=0|true))||(__CLR4_5_26wx6wxlvico1ek.R.iget(8977)==0&false));
                __CLR4_5_26wx6wxlvico1ek.R.inc(8978);assertTrue(ont.getReferencingAxioms(entity, EXCLUDED).contains(
                        ax));
                __CLR4_5_26wx6wxlvico1ek.R.inc(8979);assertTrue(ont.getSignature().contains(entity));
            }
        }}
    }}finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testSubClassOfAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),8980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bz3yc6xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testSubClassOfAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bz3yc6xg(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(8980);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8981);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(8982);OWLClass clsA = Class(iri("A"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8983);OWLClass clsB = Class(iri("B"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8984);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8985);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(8986);OWLSubClassOfAxiom ax = SubClassOf(clsA, clsB);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8987);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8988);OWLSubClassOfAxiom ax2 = SubClassOf(clsA,
                ObjectSomeValuesFrom(prop, clsB));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8989);man.addAxiom(ont, ax2);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8990);performAxiomTests(ont, ax, ax2);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8991);assertTrue(ont.getSubClassAxiomsForSubClass(clsA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8992);assertTrue(ont.getSubClassAxiomsForSuperClass(clsB).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8993);assertTrue(ont.getAxioms(clsA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8994);assertTrue(sup(ont.filterAxioms(subClassWithSub, clsA, INCLUDED))
                .contains(clsB));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8995);assertTrue(sub(ont.filterAxioms(subClassWithSuper, clsB, INCLUDED))
                .contains(clsA));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testEquivalentClassesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),8996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21blpcd6xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testEquivalentClassesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21blpcd6xw(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(8996);
        __CLR4_5_26wx6wxlvico1ek.R.inc(8997);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(8998);OWLClass clsA = Class(iri("A"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(8999);OWLClass clsB = Class(iri("B"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9000);OWLClass clsC = Class(iri("C"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9001);OWLClass clsD = Class(iri("D"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9002);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9003);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9004);OWLEquivalentClassesAxiom ax = EquivalentClasses(clsA, clsB, clsC,
                ObjectSomeValuesFrom(prop, clsD));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9005);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9006);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9007);assertTrue(ont.getEquivalentClassesAxioms(clsA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9008);assertTrue(ont.getEquivalentClassesAxioms(clsB).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9009);assertTrue(ont.getEquivalentClassesAxioms(clsC).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9010);assertTrue(ont.getAxioms(clsA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9011);assertTrue(ont.getAxioms(clsB, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9012);assertTrue(ont.getAxioms(clsC, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDisjointClassesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mc5ryd6yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDisjointClassesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mc5ryd6yd(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9013);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9014);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9015);OWLClass clsA = Class(iri("A"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9016);OWLClass clsB = Class(iri("B"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9017);OWLClass clsC = Class(iri("C"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9018);OWLClass clsD = Class(iri("D"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9019);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9020);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9021);OWLDisjointClassesAxiom ax = DisjointClasses(clsA, clsB, clsC,
                ObjectSomeValuesFrom(prop, clsD));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9022);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9023);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9024);assertTrue(ont.getDisjointClassesAxioms(clsA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9025);assertTrue(ont.getDisjointClassesAxioms(clsB).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9026);assertTrue(ont.getDisjointClassesAxioms(clsC).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9027);assertTrue(ont.getAxioms(clsA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9028);assertTrue(ont.getAxioms(clsB, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9029);assertTrue(ont.getAxioms(clsC, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testSubObjectPropertyOfAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c073to6yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testSubObjectPropertyOfAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c073to6yu(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9030);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9031);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9032);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9033);OWLObjectProperty propQ = ObjectProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9034);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9035);OWLSubObjectPropertyOfAxiom ax = SubObjectPropertyOf(propP, propQ);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9036);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9037);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9038);assertTrue(ont.getObjectSubPropertyAxiomsForSubProperty(propP)
                .contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9039);assertTrue(ont.getObjectSubPropertyAxiomsForSuperProperty(propQ)
                .contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9040);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testEquivalentObjectPropertiesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27gd07j6z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testEquivalentObjectPropertiesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27gd07j6z5(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9041);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9042);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9043);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9044);OWLObjectProperty propQ = ObjectProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9045);OWLObjectProperty propR = ObjectProperty(iri("r"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9046);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9047);OWLEquivalentObjectPropertiesAxiom ax = EquivalentObjectProperties(
                propP, propQ, propR);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9048);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9049);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9050);assertTrue(ont.getEquivalentObjectPropertiesAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9051);assertTrue(ont.getEquivalentObjectPropertiesAxioms(propQ).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9052);assertTrue(ont.getEquivalentObjectPropertiesAxioms(propR).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9053);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9054);assertTrue(ont.getAxioms(propQ, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9055);assertTrue(ont.getAxioms(propR, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDisjointObjectPropertiesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25iwhml6zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDisjointObjectPropertiesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25iwhml6zk(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9056);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9057);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9058);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9059);OWLObjectProperty propQ = ObjectProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9060);OWLObjectProperty propR = ObjectProperty(iri("r"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9061);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9062);OWLDisjointObjectPropertiesAxiom ax = DisjointObjectProperties(propP,
                propQ, propR);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9063);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9064);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9065);assertTrue(ont.getDisjointObjectPropertiesAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9066);assertTrue(ont.getDisjointObjectPropertiesAxioms(propQ).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9067);assertTrue(ont.getDisjointObjectPropertiesAxioms(propR).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9068);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9069);assertTrue(ont.getAxioms(propQ, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9070);assertTrue(ont.getAxioms(propR, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testObjectPropertyDomainAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cl8gb76zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testObjectPropertyDomainAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cl8gb76zz(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9071);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9072);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9073);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9074);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9075);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9076);OWLObjectPropertyDomainAxiom ax = ObjectPropertyDomain(propP, clsA);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9077);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9078);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9079);assertTrue(ont.getObjectPropertyDomainAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9080);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9081);assertTrue(domain(ont.getObjectPropertyDomainAxioms(propP)).contains(
                clsA));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testObjectPropertyRangeAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7fsq70a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testObjectPropertyRangeAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7fsq70a(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9082);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9083);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9084);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9085);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9086);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9087);OWLObjectPropertyRangeAxiom ax = ObjectPropertyRange(propP, clsA);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9088);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9089);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9090);assertTrue(ont.getObjectPropertyRangeAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9091);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9092);assertTrue(range(ont.getObjectPropertyRangeAxioms(propP))
                .contains(clsA));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testFunctionalObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21lr1dg70l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testFunctionalObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21lr1dg70l(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9093);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9094);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9095);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9096);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9097);OWLFunctionalObjectPropertyAxiom ax = FunctionalObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9098);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9099);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9100);assertTrue(ont.getFunctionalObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9101);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9102);assertTrue(isFunctional(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testInverseFunctionalObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2burts870v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testInverseFunctionalObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2burts870v(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9103);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9104);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9105);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9106);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9107);OWLInverseFunctionalObjectPropertyAxiom ax = InverseFunctionalObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9108);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9109);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9110);assertTrue(ont.getInverseFunctionalObjectPropertyAxioms(propP)
                .contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9111);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9112);assertTrue(isInverseFunctional(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testTransitiveObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1pmb2715();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testTransitiveObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1pmb2715(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9113);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9114);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9115);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9116);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9117);OWLTransitiveObjectPropertyAxiom ax = TransitiveObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9118);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9119);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9120);assertTrue(ont.getTransitiveObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9121);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9122);assertTrue(isTransitive(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testSymmetricObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnshr071f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testSymmetricObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnshr071f(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9123);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9124);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9125);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9126);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9127);OWLSymmetricObjectPropertyAxiom ax = SymmetricObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9128);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9129);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9130);assertTrue(ont.getSymmetricObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9131);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9132);assertTrue(isSymmetric(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testAsymmetricObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l7ijl71p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testAsymmetricObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l7ijl71p(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9133);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9134);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9135);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9136);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9137);OWLAsymmetricObjectPropertyAxiom ax = AsymmetricObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9138);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9139);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9140);assertTrue(ont.getAsymmetricObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9141);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9142);assertTrue(isAsymmetric(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testReflexiveObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gk0my971z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testReflexiveObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gk0my971z(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9143);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9144);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9145);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9146);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9147);OWLReflexiveObjectPropertyAxiom ax = ReflexiveObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9148);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9149);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9150);assertTrue(ont.getReflexiveObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9151);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9152);assertTrue(isReflexive(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testIrreflexiveObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_253hko729();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testIrreflexiveObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_253hko729(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9153);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9154);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9155);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9156);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9157);OWLIrreflexiveObjectPropertyAxiom ax = IrreflexiveObjectProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9158);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9159);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9160);assertTrue(ont.getIrreflexiveObjectPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9161);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9162);assertTrue(isIrreflexive(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testSubDataPropertyOfAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2flmeuf72j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testSubDataPropertyOfAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2flmeuf72j(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9163);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9164);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9165);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9166);OWLDataProperty propQ = DataProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9167);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9168);OWLSubDataPropertyOfAxiom ax = SubDataPropertyOf(propP, propQ);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9169);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9170);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9171);assertTrue(ont.getDataSubPropertyAxiomsForSubProperty(propP).contains(
                ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9172);assertTrue(ont.getDataSubPropertyAxiomsForSuperProperty(propQ)
                .contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9173);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testEquivalentDataPropertiesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2padrus72u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testEquivalentDataPropertiesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2padrus72u(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9174);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9175);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9176);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9177);OWLDataProperty propQ = DataProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9178);OWLDataProperty propR = DataProperty(iri("r"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9179);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9180);OWLEquivalentDataPropertiesAxiom ax = EquivalentDataProperties(propP,
                propQ, propR);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9181);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9182);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9183);assertTrue(ont.getEquivalentDataPropertiesAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9184);assertTrue(ont.getEquivalentDataPropertiesAxioms(propQ).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9185);assertTrue(ont.getEquivalentDataPropertiesAxioms(propR).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9186);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9187);assertTrue(ont.getAxioms(propQ, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9188);assertTrue(ont.getAxioms(propR, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDisjointDataPropertiesAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2keowj6739();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDisjointDataPropertiesAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2keowj6739(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9189);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9190);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9191);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9192);OWLDataProperty propQ = DataProperty(iri("q"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9193);OWLDataProperty propR = DataProperty(iri("r"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9194);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9195);OWLDisjointDataPropertiesAxiom ax = DisjointDataProperties(propP,
                propQ, propR);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9196);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9197);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9198);assertTrue(ont.getDisjointDataPropertiesAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9199);assertTrue(ont.getDisjointDataPropertiesAxioms(propQ).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9200);assertTrue(ont.getDisjointDataPropertiesAxioms(propR).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9201);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9202);assertTrue(ont.getAxioms(propQ, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9203);assertTrue(ont.getAxioms(propR, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDataPropertyDomainAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4fvco73o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDataPropertyDomainAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4fvco73o(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9204);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9205);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9206);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9207);OWLClass clsA = Class(iri("ClsA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9208);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9209);OWLDataPropertyDomainAxiom ax = DataPropertyDomain(propP, clsA);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9210);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9211);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9212);assertTrue(ont.getDataPropertyDomainAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9213);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9214);assertTrue(domain(ont.getDataPropertyDomainAxioms(propP))
                .contains(clsA));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDataPropertyRangeAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29dy8j573z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDataPropertyRangeAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29dy8j573z(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9215);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9216);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9217);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9218);OWLDatatype dt = Datatype(iri("dt"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9219);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9220);OWLDataPropertyRangeAxiom ax = DataPropertyRange(propP, dt);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9221);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9222);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9223);assertTrue(ont.getDataPropertyRangeAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9224);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9225);assertTrue(range(ont.getDataPropertyRangeAxioms(propP)).contains(dt));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testFunctionalDataPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfmu9574a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testFunctionalDataPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfmu9574a(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9226);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9227);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9228);OWLDataProperty propP = DataProperty(iri("p"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9229);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9230);OWLFunctionalDataPropertyAxiom ax = FunctionalDataProperty(propP);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9231);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9232);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9233);assertTrue(ont.getFunctionalDataPropertyAxioms(propP).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9234);assertTrue(ont.getAxioms(propP, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9235);assertTrue(isFunctional(propP, ont));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testClassAssertionAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2txvaf574k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testClassAssertionAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2txvaf574k(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9236);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9237);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9238);OWLClass clsA = Class(iri("clsA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9239);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9240);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9241);OWLClassAssertionAxiom ax = ClassAssertion(clsA, indA);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9242);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9243);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9244);assertTrue(ont.getClassAssertionAxioms(indA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9245);assertTrue(ont.getClassAssertionAxioms(clsA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9246);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9247);assertTrue(instances(ont.getClassAssertionAxioms(indA)).contains(indA));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9248);assertTrue(types(ont.getClassAssertionAxioms(indA)).contains(clsA));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nd3xpz74x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nd3xpz74x(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9249);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9250);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9251);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9252);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9253);OWLNamedIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9254);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9255);OWLObjectPropertyAssertionAxiom ax = ObjectPropertyAssertion(prop,
                indA, indB);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9256);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9257);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9258);assertTrue(ont.getObjectPropertyAssertionAxioms(indA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9259);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testNegativeObjectPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dubcn2758();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testNegativeObjectPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dubcn2758(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9260);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9261);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9262);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9263);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9264);OWLNamedIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9265);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9266);OWLNegativeObjectPropertyAssertionAxiom ax = NegativeObjectPropertyAssertion(
                prop, indA, indB);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9267);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9268);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9269);assertTrue(ont.getNegativeObjectPropertyAssertionAxioms(indA).contains(
                ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9270);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDataPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ka6qzw75j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDataPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ka6qzw75j(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9271);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9272);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9273);OWLDataProperty prop = DataProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9274);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9275);OWLLiteral lit = Literal(3);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9276);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9277);OWLDataPropertyAssertionAxiom ax = DataPropertyAssertion(prop, indA,
                lit);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9278);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9279);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9280);assertTrue(ont.getDataPropertyAssertionAxioms(indA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9281);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testNegativeDataPropertyAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1p9op75u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testNegativeDataPropertyAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1p9op75u(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9282);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9283);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9284);OWLDataProperty prop = DataProperty(iri("prop"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9285);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9286);OWLLiteral lit = Literal(3);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9287);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9288);OWLNegativeDataPropertyAssertionAxiom ax = NegativeDataPropertyAssertion(
                prop, indA, lit);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9289);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9290);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9291);assertTrue(ont.getNegativeDataPropertyAssertionAxioms(indA)
                .contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9292);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testSameIndividualAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h4zvpw765();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testSameIndividualAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h4zvpw765(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9293);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9294);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9295);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9296);OWLNamedIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9297);OWLNamedIndividual indC = NamedIndividual(iri("indC"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9298);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9299);OWLSameIndividualAxiom ax = SameIndividual(indA, indB, indC);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9300);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9301);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9302);assertTrue(ont.getSameIndividualAxioms(indA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9303);assertTrue(ont.getSameIndividualAxioms(indB).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9304);assertTrue(ont.getSameIndividualAxioms(indC).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9305);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9306);Collection<OWLObject> equivalent = equivalent(ont
                .getSameIndividualAxioms(indA));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9307);assertTrue(equivalent.contains(indB));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9308);assertTrue(equivalent.contains(indC));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}

    @Test
    public void testDifferentIndividualsAxiomAccessors() {__CLR4_5_26wx6wxlvico1ek.R.globalSliceStart(getClass().getName(),9309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24yuhrq76l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26wx6wxlvico1ek.R.rethrow($CLV_t2$);}finally{__CLR4_5_26wx6wxlvico1ek.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyAccessorsTestCase.testDifferentIndividualsAxiomAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24yuhrq76l(){try{__CLR4_5_26wx6wxlvico1ek.R.inc(9309);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9310);OWLOntology ont = getOWLOntology("ont");
        __CLR4_5_26wx6wxlvico1ek.R.inc(9311);OWLNamedIndividual indA = NamedIndividual(iri("indA"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9312);OWLNamedIndividual indB = NamedIndividual(iri("indB"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9313);OWLNamedIndividual indC = NamedIndividual(iri("indC"));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9314);OWLOntologyManager man = ont.getOWLOntologyManager();
        __CLR4_5_26wx6wxlvico1ek.R.inc(9315);OWLDifferentIndividualsAxiom ax = DifferentIndividuals(indA, indB, indC);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9316);man.addAxiom(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9317);performAxiomTests(ont, ax);
        __CLR4_5_26wx6wxlvico1ek.R.inc(9318);assertTrue(ont.getDifferentIndividualAxioms(indA).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9319);assertTrue(ont.getDifferentIndividualAxioms(indB).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9320);assertTrue(ont.getDifferentIndividualAxioms(indC).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9321);assertTrue(ont.getAxioms(indA, EXCLUDED).contains(ax));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9322);Collection<OWLObject> different = different(ont
                .getDifferentIndividualAxioms(indA));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9323);assertTrue(different.contains(indB));
        __CLR4_5_26wx6wxlvico1ek.R.inc(9324);assertTrue(different.contains(indC));
    }finally{__CLR4_5_26wx6wxlvico1ek.R.flushNeeded();}}
}
