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
package org.semanticweb.owlapi.api.test.baseclasses;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import javax.annotation.Nonnull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

/**
 * This test case creates a small ontology and tests the getters in the reasoner
 * interface. The test ontology isn't designed to test the correctness of
 * reasoning results, rather it is designed to test the reasoner returns the
 * results in the form required by the OWL API reasoner interface.
 * 
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class ReasonerTestCase extends TestBase {static class __CLR4_5_24us4uslvico0gz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,6789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
    @Nonnull private OWLOntology ont;
    private OWLReasoner reasoner;

    @Nonnull
    private OWLOntology createOntology() {try{__CLR4_5_24us4uslvico0gz.R.inc(6292);
        __CLR4_5_24us4uslvico0gz.R.inc(6293);OWLOntology o = getOWLOntology("ont");
        __CLR4_5_24us4uslvico0gz.R.inc(6294);OWLClass clsA = getClsA();
        __CLR4_5_24us4uslvico0gz.R.inc(6295);OWLClass clsB = getClsB();
        __CLR4_5_24us4uslvico0gz.R.inc(6296);OWLClass clsC = getClsC();
        __CLR4_5_24us4uslvico0gz.R.inc(6297);OWLClass clsD = getClsD();
        __CLR4_5_24us4uslvico0gz.R.inc(6298);OWLClass clsE = getClsE();
        __CLR4_5_24us4uslvico0gz.R.inc(6299);OWLClass clsF = getClsF();
        __CLR4_5_24us4uslvico0gz.R.inc(6300);OWLClass clsG = getClsG();
        __CLR4_5_24us4uslvico0gz.R.inc(6301);OWLClass clsK = getClsK();
        __CLR4_5_24us4uslvico0gz.R.inc(6302);OWLOntologyManager man = o.getOWLOntologyManager();
        __CLR4_5_24us4uslvico0gz.R.inc(6303);man.addAxiom(o, SubClassOf(clsG, OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6304);man.addAxiom(o, SubClassOf(OWLThing(), clsG));
        __CLR4_5_24us4uslvico0gz.R.inc(6305);man.addAxiom(o, EquivalentClasses(clsA, clsB));
        __CLR4_5_24us4uslvico0gz.R.inc(6306);man.addAxiom(o, SubClassOf(clsC, clsB));
        __CLR4_5_24us4uslvico0gz.R.inc(6307);man.addAxiom(o, SubClassOf(clsD, clsA));
        __CLR4_5_24us4uslvico0gz.R.inc(6308);man.addAxiom(o, SubClassOf(clsD, clsF));
        __CLR4_5_24us4uslvico0gz.R.inc(6309);man.addAxiom(o, SubClassOf(clsF, clsD));
        __CLR4_5_24us4uslvico0gz.R.inc(6310);man.addAxiom(o, SubClassOf(clsE, clsC));
        __CLR4_5_24us4uslvico0gz.R.inc(6311);man.addAxiom(o, SubClassOf(clsK, clsD));
        __CLR4_5_24us4uslvico0gz.R.inc(6312);man.addAxiom(o, EquivalentClasses(clsK, OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6313);OWLObjectPropertyExpression propP = getPropP();
        __CLR4_5_24us4uslvico0gz.R.inc(6314);OWLObjectPropertyExpression propQ = getPropQ();
        __CLR4_5_24us4uslvico0gz.R.inc(6315);OWLObjectPropertyExpression propR = getPropR();
        __CLR4_5_24us4uslvico0gz.R.inc(6316);OWLObjectPropertyExpression propS = getPropS();
        __CLR4_5_24us4uslvico0gz.R.inc(6317);man.addAxiom(o, EquivalentObjectProperties(propP, propQ));
        __CLR4_5_24us4uslvico0gz.R.inc(6318);man.addAxiom(o, SubObjectPropertyOf(propP, propR));
        __CLR4_5_24us4uslvico0gz.R.inc(6319);man.addAxiom(o, InverseObjectProperties(propR, propS));
        __CLR4_5_24us4uslvico0gz.R.inc(6320);return o;
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty getPropS() {try{__CLR4_5_24us4uslvico0gz.R.inc(6321);
        __CLR4_5_24us4uslvico0gz.R.inc(6322);return ObjectProperty(iri("s"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty getPropR() {try{__CLR4_5_24us4uslvico0gz.R.inc(6323);
        __CLR4_5_24us4uslvico0gz.R.inc(6324);return ObjectProperty(iri("r"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty getPropQ() {try{__CLR4_5_24us4uslvico0gz.R.inc(6325);
        __CLR4_5_24us4uslvico0gz.R.inc(6326);return ObjectProperty(iri("q"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty getPropP() {try{__CLR4_5_24us4uslvico0gz.R.inc(6327);
        __CLR4_5_24us4uslvico0gz.R.inc(6328);return ObjectProperty(iri("p"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsK() {try{__CLR4_5_24us4uslvico0gz.R.inc(6329);
        __CLR4_5_24us4uslvico0gz.R.inc(6330);return Class(iri("K"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsG() {try{__CLR4_5_24us4uslvico0gz.R.inc(6331);
        __CLR4_5_24us4uslvico0gz.R.inc(6332);return Class(iri("G"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsF() {try{__CLR4_5_24us4uslvico0gz.R.inc(6333);
        __CLR4_5_24us4uslvico0gz.R.inc(6334);return Class(iri("F"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsE() {try{__CLR4_5_24us4uslvico0gz.R.inc(6335);
        __CLR4_5_24us4uslvico0gz.R.inc(6336);return Class(iri("E"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsD() {try{__CLR4_5_24us4uslvico0gz.R.inc(6337);
        __CLR4_5_24us4uslvico0gz.R.inc(6338);return Class(iri("D"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsC() {try{__CLR4_5_24us4uslvico0gz.R.inc(6339);
        __CLR4_5_24us4uslvico0gz.R.inc(6340);return Class(iri("C"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsB() {try{__CLR4_5_24us4uslvico0gz.R.inc(6341);
        __CLR4_5_24us4uslvico0gz.R.inc(6342);return Class(iri("B"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Nonnull
    private OWLClass getClsA() {try{__CLR4_5_24us4uslvico0gz.R.inc(6343);
        __CLR4_5_24us4uslvico0gz.R.inc(6344);return Class(iri("A"));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Before
    public void setUpOntoAndReasoner() {try{__CLR4_5_24us4uslvico0gz.R.inc(6345);
        __CLR4_5_24us4uslvico0gz.R.inc(6346);ont = createOntology();
        __CLR4_5_24us4uslvico0gz.R.inc(6347);reasoner = reasonerFactory.createReasoner(ont);
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_5_24us4uslvico0gz.R.inc(6348);
        __CLR4_5_24us4uslvico0gz.R.inc(6349);reasoner.dispose();
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetName() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yb2b9m4we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yb2b9m4we(){try{__CLR4_5_24us4uslvico0gz.R.inc(6350);
        __CLR4_5_24us4uslvico0gz.R.inc(6351);assertNotNull("name should not be null", reasoner.getReasonerName());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetVersion() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_274ik634wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetVersion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_274ik634wg(){try{__CLR4_5_24us4uslvico0gz.R.inc(6352);
        __CLR4_5_24us4uslvico0gz.R.inc(6353);assertNotNull("version should not be null", reasoner.getReasonerVersion());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetRootOntology() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w5ym44wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetRootOntology",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w5ym44wi(){try{__CLR4_5_24us4uslvico0gz.R.inc(6354);
        __CLR4_5_24us4uslvico0gz.R.inc(6355);assertEquals("ontology should be equal", reasoner.getRootOntology(), ont);
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetTopClassNode() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iiw4uo4wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetTopClassNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iiw4uo4wk(){try{__CLR4_5_24us4uslvico0gz.R.inc(6356);
        __CLR4_5_24us4uslvico0gz.R.inc(6357);Node<OWLClass> node = reasoner.getTopClassNode();
        __CLR4_5_24us4uslvico0gz.R.inc(6358);assertTrue(node.isTopNode());
        __CLR4_5_24us4uslvico0gz.R.inc(6359);assertFalse(node.isBottomNode());
        __CLR4_5_24us4uslvico0gz.R.inc(6360);assertTrue(node.contains(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6361);assertTrue(node.contains(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6362);assertEquals(2, node.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6363);assertEquals(2, node.getEntities().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6364);assertEquals(1, node.getEntitiesMinusTop().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6365);assertTrue(node.getEntitiesMinusTop().contains(getClsG()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetBottomClassNode() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28cmutu4wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetBottomClassNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28cmutu4wu(){try{__CLR4_5_24us4uslvico0gz.R.inc(6366);
        __CLR4_5_24us4uslvico0gz.R.inc(6367);Node<OWLClass> node = reasoner.getBottomClassNode();
        __CLR4_5_24us4uslvico0gz.R.inc(6368);assertTrue(node.isBottomNode());
        __CLR4_5_24us4uslvico0gz.R.inc(6369);assertFalse(node.isTopNode());
        __CLR4_5_24us4uslvico0gz.R.inc(6370);assertTrue(node.contains(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6371);assertTrue(node.contains(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6372);assertEquals(2, node.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6373);assertEquals(2, node.getEntities().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6374);assertEquals(1, node.getEntitiesMinusBottom().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6375);assertTrue(node.getEntitiesMinusBottom().contains(getClsK()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetEquivalentClasses() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tmuych4x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tmuych4x4(){try{__CLR4_5_24us4uslvico0gz.R.inc(6376);
        __CLR4_5_24us4uslvico0gz.R.inc(6377);Node<OWLClass> nTop = reasoner.getEquivalentClasses(OWLThing());
        __CLR4_5_24us4uslvico0gz.R.inc(6378);assertNotNull("object should not be null", nTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6379);assertEquals(2, nTop.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6380);assertTrue(nTop.contains(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6381);assertTrue(nTop.contains(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6382);Node<OWLClass> nG = reasoner.getEquivalentClasses(getClsG());
        __CLR4_5_24us4uslvico0gz.R.inc(6383);assertNotNull("object should not be null", nG);
        __CLR4_5_24us4uslvico0gz.R.inc(6384);assertEquals(2, nG.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6385);assertTrue(nG.contains(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6386);assertTrue(nG.contains(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6387);assertEquals(nTop, nG);
        __CLR4_5_24us4uslvico0gz.R.inc(6388);Node<OWLClass> nA = reasoner.getEquivalentClasses(getClsA());
        __CLR4_5_24us4uslvico0gz.R.inc(6389);assertNotNull("object should not be null", nA);
        __CLR4_5_24us4uslvico0gz.R.inc(6390);assertEquals(2, nA.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6391);assertTrue(nA.contains(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6392);assertTrue(nA.contains(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6393);Node<OWLClass> nB = reasoner.getEquivalentClasses(getClsB());
        __CLR4_5_24us4uslvico0gz.R.inc(6394);assertNotNull("object should not be null", nB);
        __CLR4_5_24us4uslvico0gz.R.inc(6395);assertEquals(2, nB.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6396);assertTrue(nB.contains(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6397);assertTrue(nB.contains(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6398);assertEquals("object should not be null", nA, nB);
        __CLR4_5_24us4uslvico0gz.R.inc(6399);Node<OWLClass> nC = reasoner.getEquivalentClasses(getClsC());
        __CLR4_5_24us4uslvico0gz.R.inc(6400);assertNotNull("object should not be null", nC);
        __CLR4_5_24us4uslvico0gz.R.inc(6401);assertEquals(1, nC.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6402);assertTrue(nC.contains(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6403);assertEquals(nC.getRepresentativeElement(), getClsC());
        __CLR4_5_24us4uslvico0gz.R.inc(6404);Node<OWLClass> nE = reasoner.getEquivalentClasses(getClsE());
        __CLR4_5_24us4uslvico0gz.R.inc(6405);assertNotNull("object should not be null", nE);
        __CLR4_5_24us4uslvico0gz.R.inc(6406);assertEquals(1, nE.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6407);assertTrue(nE.contains(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6408);assertEquals(nE.getRepresentativeElement(), getClsE());
        __CLR4_5_24us4uslvico0gz.R.inc(6409);Node<OWLClass> nD = reasoner.getEquivalentClasses(getClsD());
        __CLR4_5_24us4uslvico0gz.R.inc(6410);assertNotNull("object should not be null", nD);
        __CLR4_5_24us4uslvico0gz.R.inc(6411);assertEquals(2, nD.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6412);assertTrue(nD.contains(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6413);assertTrue(nD.contains(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6414);Node<OWLClass> nF = reasoner.getEquivalentClasses(getClsF());
        __CLR4_5_24us4uslvico0gz.R.inc(6415);assertNotNull("object should not be null", nF);
        __CLR4_5_24us4uslvico0gz.R.inc(6416);assertEquals(2, nF.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6417);assertTrue(nF.contains(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6418);assertTrue(nF.contains(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6419);assertEquals(nD, nF);
        __CLR4_5_24us4uslvico0gz.R.inc(6420);Node<OWLClass> nBot = reasoner.getEquivalentClasses(OWLNothing());
        __CLR4_5_24us4uslvico0gz.R.inc(6421);assertNotNull("object should not be null", nBot);
        __CLR4_5_24us4uslvico0gz.R.inc(6422);assertEquals(2, nBot.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6423);assertTrue(nBot.contains(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6424);assertTrue(nBot.contains(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6425);Node<OWLClass> nK = reasoner.getEquivalentClasses(getClsK());
        __CLR4_5_24us4uslvico0gz.R.inc(6426);assertNotNull("object should not be null", nK);
        __CLR4_5_24us4uslvico0gz.R.inc(6427);assertEquals(2, nK.getSize());
        __CLR4_5_24us4uslvico0gz.R.inc(6428);assertTrue(nBot.contains(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6429);assertTrue(nBot.contains(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6430);assertEquals(nBot, nK);
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSuperClassesDirect() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2liykw14yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSuperClassesDirect",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2liykw14yn(){try{__CLR4_5_24us4uslvico0gz.R.inc(6431);
        __CLR4_5_24us4uslvico0gz.R.inc(6432);NodeSet<OWLClass> nsSupTop = reasoner.getSuperClasses(OWLThing(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6433);assertNotNull("object should not be null", nsSupTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6434);assertTrue(nsSupTop.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6435);NodeSet<OWLClass> nsSupG = reasoner.getSuperClasses(getClsG(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6436);assertNotNull("object should not be null", nsSupG);
        __CLR4_5_24us4uslvico0gz.R.inc(6437);assertTrue(nsSupG.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6438);NodeSet<OWLClass> nsSupA = reasoner.getSuperClasses(getClsA(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6439);assertNotNull("object should not be null", nsSupA);
        __CLR4_5_24us4uslvico0gz.R.inc(6440);assertFalse(nsSupA.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6441);assertEquals(1, nsSupA.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6442);assertTrue(nsSupA.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6443);assertTrue(nsSupA.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6444);assertTrue(nsSupA.isTopSingleton());
        __CLR4_5_24us4uslvico0gz.R.inc(6445);NodeSet<OWLClass> nsSupB = reasoner.getSuperClasses(getClsB(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6446);assertNotNull("object should not be null", nsSupB);
        __CLR4_5_24us4uslvico0gz.R.inc(6447);assertEquals(1, nsSupB.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6448);assertTrue(nsSupB.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6449);assertTrue(nsSupB.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6450);assertTrue(nsSupB.isTopSingleton());
        __CLR4_5_24us4uslvico0gz.R.inc(6451);NodeSet<OWLClass> nsSupC = reasoner.getSuperClasses(getClsC(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6452);assertNotNull("object should not be null", nsSupC);
        __CLR4_5_24us4uslvico0gz.R.inc(6453);assertEquals(1, nsSupC.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6454);assertTrue(nsSupC.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6455);assertTrue(nsSupC.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6456);NodeSet<OWLClass> nsSupE = reasoner.getSuperClasses(getClsE(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6457);assertNotNull("object should not be null", nsSupE);
        __CLR4_5_24us4uslvico0gz.R.inc(6458);assertEquals(1, nsSupE.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6459);assertTrue(nsSupE.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6460);NodeSet<OWLClass> nsSupD = reasoner.getSuperClasses(getClsD(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6461);assertNotNull("object should not be null", nsSupD);
        __CLR4_5_24us4uslvico0gz.R.inc(6462);assertEquals(1, nsSupD.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6463);assertTrue(nsSupD.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6464);assertTrue(nsSupD.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6465);NodeSet<OWLClass> nsSupF = reasoner.getSuperClasses(getClsF(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6466);assertNotNull("object should not be null", nsSupF);
        __CLR4_5_24us4uslvico0gz.R.inc(6467);assertEquals(1, nsSupF.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6468);assertTrue(nsSupF.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6469);assertTrue(nsSupF.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6470);NodeSet<OWLClass> nsSupK = reasoner.getSuperClasses(getClsK(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6471);assertNotNull("object should not be null", nsSupK);
        __CLR4_5_24us4uslvico0gz.R.inc(6472);assertEquals(2, nsSupK.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6473);assertTrue(nsSupK.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6474);assertTrue(nsSupK.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6475);assertTrue(nsSupK.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6476);NodeSet<OWLClass> nsSupBot = reasoner.getSuperClasses(OWLNothing(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6477);assertNotNull("object should not be null", nsSupBot);
        __CLR4_5_24us4uslvico0gz.R.inc(6478);assertEquals(2, nsSupBot.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6479);assertTrue(nsSupBot.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6480);assertTrue(nsSupBot.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6481);assertTrue(nsSupBot.containsEntity(getClsF()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSuperClasses() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sdczca502();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSuperClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sdczca502(){try{__CLR4_5_24us4uslvico0gz.R.inc(6482);
        __CLR4_5_24us4uslvico0gz.R.inc(6483);NodeSet<OWLClass> nsSupTop = reasoner.getSuperClasses(OWLThing(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6484);assertNotNull("object should not be null", nsSupTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6485);assertTrue(nsSupTop.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6486);NodeSet<OWLClass> nsSupG = reasoner.getSuperClasses(getClsG(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6487);assertNotNull("object should not be null", nsSupG);
        __CLR4_5_24us4uslvico0gz.R.inc(6488);assertTrue(nsSupG.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6489);NodeSet<OWLClass> nsSupA = reasoner.getSuperClasses(getClsA(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6490);assertNotNull("object should not be null", nsSupA);
        __CLR4_5_24us4uslvico0gz.R.inc(6491);assertFalse(nsSupA.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6492);assertEquals(1, nsSupA.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6493);assertTrue(nsSupA.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6494);assertTrue(nsSupA.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6495);assertTrue(nsSupA.isTopSingleton());
        __CLR4_5_24us4uslvico0gz.R.inc(6496);NodeSet<OWLClass> nsSupB = reasoner.getSuperClasses(getClsB(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6497);assertNotNull("object should not be null", nsSupB);
        __CLR4_5_24us4uslvico0gz.R.inc(6498);assertEquals(1, nsSupB.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6499);assertTrue(nsSupB.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6500);assertTrue(nsSupB.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6501);assertTrue(nsSupB.isTopSingleton());
        __CLR4_5_24us4uslvico0gz.R.inc(6502);NodeSet<OWLClass> nsSupC = reasoner.getSuperClasses(getClsC(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6503);assertNotNull("object should not be null", nsSupC);
        __CLR4_5_24us4uslvico0gz.R.inc(6504);assertEquals(2, nsSupC.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6505);assertTrue(nsSupC.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6506);assertTrue(nsSupC.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6507);assertTrue(nsSupC.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6508);assertTrue(nsSupC.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6509);NodeSet<OWLClass> nsSupE = reasoner.getSuperClasses(getClsE(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6510);assertNotNull("object should not be null", nsSupE);
        __CLR4_5_24us4uslvico0gz.R.inc(6511);assertEquals(3, nsSupE.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6512);assertTrue(nsSupE.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6513);assertTrue(nsSupE.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6514);assertTrue(nsSupE.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6515);assertTrue(nsSupE.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6516);assertTrue(nsSupE.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6517);NodeSet<OWLClass> nsSupD = reasoner.getSuperClasses(getClsD(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6518);assertNotNull("object should not be null", nsSupD);
        __CLR4_5_24us4uslvico0gz.R.inc(6519);assertEquals(2, nsSupD.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6520);assertTrue(nsSupD.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6521);assertTrue(nsSupD.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6522);assertTrue(nsSupD.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6523);assertTrue(nsSupD.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6524);NodeSet<OWLClass> nsSupF = reasoner.getSuperClasses(getClsF(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6525);assertNotNull("object should not be null", nsSupF);
        __CLR4_5_24us4uslvico0gz.R.inc(6526);assertEquals(2, nsSupF.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6527);assertTrue(nsSupF.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6528);assertTrue(nsSupF.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6529);assertTrue(nsSupF.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6530);assertTrue(nsSupF.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6531);NodeSet<OWLClass> nsSupK = reasoner.getSuperClasses(getClsK(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6532);assertNotNull("object should not be null", nsSupK);
        __CLR4_5_24us4uslvico0gz.R.inc(6533);assertEquals(5, nsSupK.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6534);assertTrue(nsSupK.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6535);assertTrue(nsSupK.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6536);assertTrue(nsSupK.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6537);assertTrue(nsSupK.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6538);assertTrue(nsSupK.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6539);assertTrue(nsSupK.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6540);assertTrue(nsSupK.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6541);assertTrue(nsSupK.containsEntity(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6542);NodeSet<OWLClass> nsSupBot = reasoner.getSuperClasses(OWLNothing(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6543);assertNotNull("object should not be null", nsSupBot);
        __CLR4_5_24us4uslvico0gz.R.inc(6544);assertEquals(5, nsSupBot.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6545);assertTrue(nsSupBot.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6546);assertTrue(nsSupBot.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6547);assertTrue(nsSupBot.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6548);assertTrue(nsSupBot.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6549);assertTrue(nsSupBot.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6550);assertTrue(nsSupBot.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6551);assertTrue(nsSupBot.containsEntity(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6552);assertTrue(nsSupBot.containsEntity(OWLThing()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSubClassesDirect() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6rkqi521();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSubClassesDirect",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6rkqi521(){try{__CLR4_5_24us4uslvico0gz.R.inc(6553);
        __CLR4_5_24us4uslvico0gz.R.inc(6554);NodeSet<OWLClass> nsSubTop = reasoner.getSubClasses(OWLThing(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6555);assertNotNull("object should not be null", nsSubTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6556);assertEquals(1, nsSubTop.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6557);assertTrue(nsSubTop.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6558);assertTrue(nsSubTop.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6559);NodeSet<OWLClass> nsSubG = reasoner.getSubClasses(getClsG(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6560);assertNotNull("object should not be null", nsSubG);
        __CLR4_5_24us4uslvico0gz.R.inc(6561);assertEquals(1, nsSubG.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6562);assertTrue(nsSubG.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6563);assertTrue(nsSubG.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6564);NodeSet<OWLClass> nsSubA = reasoner.getSubClasses(getClsA(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6565);assertNotNull("object should not be null", nsSubA);
        __CLR4_5_24us4uslvico0gz.R.inc(6566);assertFalse(nsSubG.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6567);assertEquals(2, nsSubA.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6568);assertTrue(nsSubA.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6569);assertTrue(nsSubA.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6570);assertTrue(nsSubA.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6571);NodeSet<OWLClass> nsSubB = reasoner.getSubClasses(getClsB(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6572);assertNotNull("object should not be null", nsSubB);
        __CLR4_5_24us4uslvico0gz.R.inc(6573);assertEquals(2, nsSubB.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6574);assertTrue(nsSubB.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6575);assertTrue(nsSubB.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6576);assertTrue(nsSubB.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6577);NodeSet<OWLClass> nsSubC = reasoner.getSubClasses(getClsC(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6578);assertNotNull("object should not be null", nsSubC);
        __CLR4_5_24us4uslvico0gz.R.inc(6579);assertEquals(1, nsSubC.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6580);assertTrue(nsSubC.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6581);NodeSet<OWLClass> nsSubE = reasoner.getSubClasses(getClsE(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6582);assertNotNull("object should not be null", nsSubE);
        __CLR4_5_24us4uslvico0gz.R.inc(6583);assertEquals(1, nsSubE.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6584);assertTrue(nsSubE.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6585);assertTrue(nsSubE.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6586);NodeSet<OWLClass> nsSubD = reasoner.getSubClasses(getClsD(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6587);assertNotNull("object should not be null", nsSubD);
        __CLR4_5_24us4uslvico0gz.R.inc(6588);assertEquals(1, nsSubD.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6589);assertTrue(nsSubD.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6590);assertTrue(nsSubD.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6591);NodeSet<OWLClass> nsSubF = reasoner.getSubClasses(getClsF(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6592);assertNotNull("object should not be null", nsSubF);
        __CLR4_5_24us4uslvico0gz.R.inc(6593);assertEquals(1, nsSubF.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6594);assertTrue(nsSubF.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6595);assertTrue(nsSubF.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6596);NodeSet<OWLClass> nsSubK = reasoner.getSubClasses(getClsK(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6597);assertNotNull("object should not be null", nsSubK);
        __CLR4_5_24us4uslvico0gz.R.inc(6598);assertTrue(nsSubK.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6599);NodeSet<OWLClass> nsSubBot = reasoner.getSubClasses(OWLNothing(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6600);assertNotNull("object should not be null", nsSubBot);
        __CLR4_5_24us4uslvico0gz.R.inc(6601);assertTrue(nsSubBot.isEmpty());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSubClasses() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29a0jm953e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSubClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29a0jm953e(){try{__CLR4_5_24us4uslvico0gz.R.inc(6602);
        __CLR4_5_24us4uslvico0gz.R.inc(6603);NodeSet<OWLClass> nsSubTop = reasoner.getSubClasses(OWLThing(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6604);assertNotNull("object should not be null", nsSubTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6605);assertEquals(5, nsSubTop.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6606);assertTrue(nsSubTop.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6607);assertTrue(nsSubTop.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6608);assertTrue(nsSubTop.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6609);assertTrue(nsSubTop.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6610);assertTrue(nsSubTop.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6611);assertTrue(nsSubTop.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6612);assertTrue(nsSubTop.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6613);assertTrue(nsSubTop.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6614);NodeSet<OWLClass> nsSubG = reasoner.getSubClasses(getClsG(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6615);assertNotNull("object should not be null", nsSubG);
        __CLR4_5_24us4uslvico0gz.R.inc(6616);assertEquals(5, nsSubG.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6617);assertTrue(nsSubG.containsEntity(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6618);assertTrue(nsSubG.containsEntity(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6619);assertTrue(nsSubG.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6620);assertTrue(nsSubG.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6621);assertTrue(nsSubG.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6622);assertTrue(nsSubG.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6623);assertTrue(nsSubG.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6624);assertTrue(nsSubG.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6625);NodeSet<OWLClass> nsSubA = reasoner.getSubClasses(getClsA(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6626);assertNotNull("object should not be null", nsSubA);
        __CLR4_5_24us4uslvico0gz.R.inc(6627);assertFalse(nsSubG.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6628);assertEquals(4, nsSubA.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6629);assertTrue(nsSubA.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6630);assertTrue(nsSubA.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6631);assertTrue(nsSubA.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6632);assertTrue(nsSubA.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6633);assertTrue(nsSubA.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6634);assertTrue(nsSubA.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6635);NodeSet<OWLClass> nsSubB = reasoner.getSubClasses(getClsB(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6636);assertNotNull("object should not be null", nsSubB);
        __CLR4_5_24us4uslvico0gz.R.inc(6637);assertEquals(4, nsSubB.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6638);assertTrue(nsSubB.containsEntity(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6639);assertTrue(nsSubB.containsEntity(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6640);assertTrue(nsSubB.containsEntity(getClsF()));
        __CLR4_5_24us4uslvico0gz.R.inc(6641);assertTrue(nsSubB.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6642);assertTrue(nsSubB.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6643);assertTrue(nsSubB.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6644);NodeSet<OWLClass> nsSubC = reasoner.getSubClasses(getClsC(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6645);assertNotNull("object should not be null", nsSubC);
        __CLR4_5_24us4uslvico0gz.R.inc(6646);assertEquals(2, nsSubC.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6647);assertTrue(nsSubC.containsEntity(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6648);assertTrue(nsSubC.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6649);assertTrue(nsSubC.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6650);NodeSet<OWLClass> nsSubE = reasoner.getSubClasses(getClsE(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6651);assertNotNull("object should not be null", nsSubE);
        __CLR4_5_24us4uslvico0gz.R.inc(6652);assertEquals(1, nsSubE.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6653);assertTrue(nsSubE.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6654);assertTrue(nsSubE.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6655);NodeSet<OWLClass> nsSubD = reasoner.getSubClasses(getClsD(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6656);assertNotNull("object should not be null", nsSubD);
        __CLR4_5_24us4uslvico0gz.R.inc(6657);assertEquals(1, nsSubD.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6658);assertTrue(nsSubD.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6659);assertTrue(nsSubD.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6660);NodeSet<OWLClass> nsSubF = reasoner.getSubClasses(getClsF(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6661);assertNotNull("object should not be null", nsSubF);
        __CLR4_5_24us4uslvico0gz.R.inc(6662);assertEquals(1, nsSubF.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6663);assertTrue(nsSubF.containsEntity(getClsK()));
        __CLR4_5_24us4uslvico0gz.R.inc(6664);assertTrue(nsSubF.containsEntity(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6665);NodeSet<OWLClass> nsSubK = reasoner.getSubClasses(getClsK(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6666);assertNotNull("object should not be null", nsSubK);
        __CLR4_5_24us4uslvico0gz.R.inc(6667);assertTrue(nsSubK.isEmpty());
        __CLR4_5_24us4uslvico0gz.R.inc(6668);NodeSet<OWLClass> nsSubBot = reasoner.getSubClasses(OWLNothing(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6669);assertNotNull("object should not be null", nsSubBot);
        __CLR4_5_24us4uslvico0gz.R.inc(6670);assertTrue(nsSubBot.isEmpty());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testIsSatisfiable() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_280chig55b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testIsSatisfiable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6671,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_280chig55b(){try{__CLR4_5_24us4uslvico0gz.R.inc(6671);
        __CLR4_5_24us4uslvico0gz.R.inc(6672);assertTrue(reasoner.isSatisfiable(OWLThing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6673);assertTrue(reasoner.isSatisfiable(getClsG()));
        __CLR4_5_24us4uslvico0gz.R.inc(6674);assertTrue(reasoner.isSatisfiable(getClsA()));
        __CLR4_5_24us4uslvico0gz.R.inc(6675);assertTrue(reasoner.isSatisfiable(getClsB()));
        __CLR4_5_24us4uslvico0gz.R.inc(6676);assertTrue(reasoner.isSatisfiable(getClsC()));
        __CLR4_5_24us4uslvico0gz.R.inc(6677);assertTrue(reasoner.isSatisfiable(getClsD()));
        __CLR4_5_24us4uslvico0gz.R.inc(6678);assertTrue(reasoner.isSatisfiable(getClsE()));
        __CLR4_5_24us4uslvico0gz.R.inc(6679);assertFalse(reasoner.isSatisfiable(OWLNothing()));
        __CLR4_5_24us4uslvico0gz.R.inc(6680);assertFalse(reasoner.isSatisfiable(getClsK()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testComputeClassHierarchy() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bithvb55l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testComputeClassHierarchy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bithvb55l(){try{__CLR4_5_24us4uslvico0gz.R.inc(6681);
        __CLR4_5_24us4uslvico0gz.R.inc(6682);reasoner.precomputeInferences(InferenceType.CLASS_HIERARCHY);
        __CLR4_5_24us4uslvico0gz.R.inc(6683);assertTrue(reasoner.isPrecomputed(InferenceType.CLASS_HIERARCHY));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetTopObjectPropertyNode() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bxnbou55o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetTopObjectPropertyNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bxnbou55o(){try{__CLR4_5_24us4uslvico0gz.R.inc(6684);
        __CLR4_5_24us4uslvico0gz.R.inc(6685);Node<OWLObjectPropertyExpression> node = reasoner.getTopObjectPropertyNode();
        __CLR4_5_24us4uslvico0gz.R.inc(6686);assertNotNull("object should not be null", node);
        __CLR4_5_24us4uslvico0gz.R.inc(6687);assertTrue(node.isTopNode());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetBottomObjectPropertyNode() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elamlw55s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetBottomObjectPropertyNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elamlw55s(){try{__CLR4_5_24us4uslvico0gz.R.inc(6688);
        __CLR4_5_24us4uslvico0gz.R.inc(6689);Node<OWLObjectPropertyExpression> node = reasoner.getBottomObjectPropertyNode();
        __CLR4_5_24us4uslvico0gz.R.inc(6690);assertNotNull("object should not be null", node);
        __CLR4_5_24us4uslvico0gz.R.inc(6691);assertTrue(node.isBottomNode());
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSubObjectPropertiesDirect() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cupbs255w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSubObjectPropertiesDirect",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cupbs255w(){try{__CLR4_5_24us4uslvico0gz.R.inc(6692);
        __CLR4_5_24us4uslvico0gz.R.inc(6693);NodeSet<OWLObjectPropertyExpression> nsSubTop = reasoner.getSubObjectProperties(df.getOWLTopObjectProperty(),
            true);
        __CLR4_5_24us4uslvico0gz.R.inc(6694);assertNotNull("object should not be null", nsSubTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6695);assertEquals(2, nsSubTop.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6696);assertTrue(nsSubTop.containsEntity(getPropR()));
        __CLR4_5_24us4uslvico0gz.R.inc(6697);assertTrue(nsSubTop.containsEntity(getPropS()));
        __CLR4_5_24us4uslvico0gz.R.inc(6698);assertTrue(nsSubTop.containsEntity(getPropR().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6699);assertTrue(nsSubTop.containsEntity(getPropS().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6700);NodeSet<OWLObjectPropertyExpression> nsSubR = reasoner.getSubObjectProperties(getPropR(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6701);assertNotNull("object should not be null", nsSubR);
        __CLR4_5_24us4uslvico0gz.R.inc(6702);assertEquals(1, nsSubR.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6703);assertTrue(nsSubR.containsEntity(getPropP()));
        __CLR4_5_24us4uslvico0gz.R.inc(6704);assertTrue(nsSubR.containsEntity(getPropQ()));
        __CLR4_5_24us4uslvico0gz.R.inc(6705);NodeSet<OWLObjectPropertyExpression> nsSubRMinus = reasoner.getSubObjectProperties(getPropR()
            .getInverseProperty(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6706);assertNotNull("object should not be null", nsSubRMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6707);assertEquals(1, nsSubRMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6708);assertTrue(nsSubRMinus.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6709);assertTrue(nsSubRMinus.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6710);NodeSet<OWLObjectPropertyExpression> nsSubSMinus = reasoner.getSubObjectProperties(getPropS()
            .getInverseProperty(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6711);assertNotNull("object should not be null", nsSubSMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6712);assertEquals(1, nsSubSMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6713);assertTrue(nsSubSMinus.containsEntity(getPropP()));
        __CLR4_5_24us4uslvico0gz.R.inc(6714);assertTrue(nsSubSMinus.containsEntity(getPropQ()));
        __CLR4_5_24us4uslvico0gz.R.inc(6715);NodeSet<OWLObjectPropertyExpression> nsSubS = reasoner.getSubObjectProperties(getPropS(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6716);assertNotNull("object should not be null", nsSubS);
        __CLR4_5_24us4uslvico0gz.R.inc(6717);assertEquals(1, nsSubS.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6718);assertTrue(nsSubS.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6719);assertTrue(nsSubS.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6720);NodeSet<OWLObjectPropertyExpression> nsSubP = reasoner.getSubObjectProperties(getPropP(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6721);assertNotNull("object should not be null", nsSubP);
        __CLR4_5_24us4uslvico0gz.R.inc(6722);assertEquals(1, nsSubP.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6723);assertTrue(nsSubP.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6724);NodeSet<OWLObjectPropertyExpression> nsSubQ = reasoner.getSubObjectProperties(getPropQ(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6725);assertNotNull("object should not be null", nsSubQ);
        __CLR4_5_24us4uslvico0gz.R.inc(6726);assertEquals(1, nsSubQ.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6727);assertTrue(nsSubQ.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6728);NodeSet<OWLObjectPropertyExpression> nsSubPMinus = reasoner.getSubObjectProperties(getPropP()
            .getInverseProperty(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6729);assertNotNull("object should not be null", nsSubPMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6730);assertEquals(1, nsSubPMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6731);assertTrue(nsSubPMinus.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6732);NodeSet<OWLObjectPropertyExpression> nsSubQMinus = reasoner.getSubObjectProperties(getPropQ()
            .getInverseProperty(), true);
        __CLR4_5_24us4uslvico0gz.R.inc(6733);assertNotNull("object should not be null", nsSubQMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6734);assertEquals(1, nsSubQMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6735);assertTrue(nsSubQMinus.containsEntity(df.getOWLBottomObjectProperty()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}

    @Test
    public void testGetSubObjectProperties() {__CLR4_5_24us4uslvico0gz.R.globalSliceStart(getClass().getName(),6736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pweeut574();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_24us4uslvico0gz.R.rethrow($CLV_t2$);}finally{__CLR4_5_24us4uslvico0gz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.ReasonerTestCase.testGetSubObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),6736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pweeut574(){try{__CLR4_5_24us4uslvico0gz.R.inc(6736);
        __CLR4_5_24us4uslvico0gz.R.inc(6737);NodeSet<OWLObjectPropertyExpression> nsSubTop = reasoner.getSubObjectProperties(df.getOWLTopObjectProperty(),
            false);
        __CLR4_5_24us4uslvico0gz.R.inc(6738);assertNotNull("object should not be null", nsSubTop);
        __CLR4_5_24us4uslvico0gz.R.inc(6739);assertEquals(5, nsSubTop.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6740);assertTrue(nsSubTop.containsEntity(getPropR()));
        __CLR4_5_24us4uslvico0gz.R.inc(6741);assertTrue(nsSubTop.containsEntity(getPropS()));
        __CLR4_5_24us4uslvico0gz.R.inc(6742);assertTrue(nsSubTop.containsEntity(getPropP()));
        __CLR4_5_24us4uslvico0gz.R.inc(6743);assertTrue(nsSubTop.containsEntity(getPropQ()));
        __CLR4_5_24us4uslvico0gz.R.inc(6744);assertTrue(nsSubTop.containsEntity(getPropR().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6745);assertTrue(nsSubTop.containsEntity(getPropR().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6746);assertTrue(nsSubTop.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6747);assertTrue(nsSubTop.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6748);assertTrue(nsSubTop.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6749);NodeSet<OWLObjectPropertyExpression> nsSubR = reasoner.getSubObjectProperties(getPropR(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6750);assertNotNull("object should not be null", nsSubR);
        __CLR4_5_24us4uslvico0gz.R.inc(6751);assertEquals(2, nsSubR.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6752);assertTrue(nsSubR.containsEntity(getPropP()));
        __CLR4_5_24us4uslvico0gz.R.inc(6753);assertTrue(nsSubR.containsEntity(getPropQ()));
        __CLR4_5_24us4uslvico0gz.R.inc(6754);assertTrue(nsSubR.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6755);NodeSet<OWLObjectPropertyExpression> nsSubRMinus = reasoner.getSubObjectProperties(getPropR()
            .getInverseProperty(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6756);assertNotNull("object should not be null", nsSubRMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6757);assertEquals(2, nsSubRMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6758);assertTrue(nsSubRMinus.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6759);assertTrue(nsSubRMinus.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6760);assertTrue(nsSubRMinus.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6761);NodeSet<OWLObjectPropertyExpression> nsSubSMinus = reasoner.getSubObjectProperties(getPropS()
            .getInverseProperty(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6762);assertNotNull("object should not be null", nsSubSMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6763);assertEquals(2, nsSubSMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6764);assertTrue(nsSubRMinus.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6765);assertTrue(nsSubRMinus.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6766);assertTrue(nsSubRMinus.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6767);NodeSet<OWLObjectPropertyExpression> nsSubS = reasoner.getSubObjectProperties(getPropS(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6768);assertNotNull("object should not be null", nsSubS);
        __CLR4_5_24us4uslvico0gz.R.inc(6769);assertEquals(2, nsSubS.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6770);assertTrue(nsSubS.containsEntity(getPropP().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6771);assertTrue(nsSubS.containsEntity(getPropQ().getInverseProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6772);assertTrue(nsSubS.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6773);NodeSet<OWLObjectPropertyExpression> nsSubP = reasoner.getSubObjectProperties(getPropP(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6774);assertNotNull("object should not be null", nsSubP);
        __CLR4_5_24us4uslvico0gz.R.inc(6775);assertEquals(1, nsSubP.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6776);assertTrue(nsSubP.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6777);NodeSet<OWLObjectPropertyExpression> nsSubQ = reasoner.getSubObjectProperties(getPropQ(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6778);assertNotNull("object should not be null", nsSubQ);
        __CLR4_5_24us4uslvico0gz.R.inc(6779);assertEquals(1, nsSubQ.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6780);assertTrue(nsSubQ.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6781);NodeSet<OWLObjectPropertyExpression> nsSubPMinus = reasoner.getSubObjectProperties(getPropP()
            .getInverseProperty(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6782);assertNotNull("object should not be null", nsSubPMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6783);assertEquals(1, nsSubPMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6784);assertTrue(nsSubPMinus.containsEntity(df.getOWLBottomObjectProperty()));
        __CLR4_5_24us4uslvico0gz.R.inc(6785);NodeSet<OWLObjectPropertyExpression> nsSubQMinus = reasoner.getSubObjectProperties(getPropQ()
            .getInverseProperty(), false);
        __CLR4_5_24us4uslvico0gz.R.inc(6786);assertNotNull("object should not be null", nsSubQMinus);
        __CLR4_5_24us4uslvico0gz.R.inc(6787);assertEquals(1, nsSubQMinus.getNodes().size());
        __CLR4_5_24us4uslvico0gz.R.inc(6788);assertTrue(nsSubQMinus.containsEntity(df.getOWLBottomObjectProperty()));
    }finally{__CLR4_5_24us4uslvico0gz.R.flushNeeded();}}
}
