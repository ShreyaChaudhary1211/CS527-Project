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
package org.semanticweb.owlapi.datafactory;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.vocab.OWLFacet.*;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

/**
 * The base for test cases that need a data factory.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings("javadoc")
public class OWLDataFactoryTestCase {static class __CLR4_5_2adhadhlviclh9m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237246897L,8589935092L,14751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final AtomicInteger counter = new AtomicInteger(1);
    @Nonnull
    private final OWLDataFactory testSubject = new OWLDataFactoryImpl();

    @Nonnull
    private static IRI IRI() {try{__CLR4_5_2adhadhlviclh9m.R.inc(13445);
        __CLR4_5_2adhadhlviclh9m.R.inc(13446);return OWLOntologyDocumentSourceBase.getNextDocumentIRI("urn:test#A");
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLIndividual I() {try{__CLR4_5_2adhadhlviclh9m.R.inc(13447);
        __CLR4_5_2adhadhlviclh9m.R.inc(13448);return testSubject.getOWLNamedIndividual(IRI());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLLiteral Literal() {try{__CLR4_5_2adhadhlviclh9m.R.inc(13449);
        __CLR4_5_2adhadhlviclh9m.R.inc(13450);return testSubject.getOWLLiteral("A" + counter.getAndIncrement());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLClass C(@Nonnull IRI iri) {try{__CLR4_5_2adhadhlviclh9m.R.inc(13451);
        __CLR4_5_2adhadhlviclh9m.R.inc(13452);return testSubject.getOWLClass(iri);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty OP(@Nonnull IRI iri) {try{__CLR4_5_2adhadhlviclh9m.R.inc(13453);
        __CLR4_5_2adhadhlviclh9m.R.inc(13454);return testSubject.getOWLObjectProperty(iri);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLDataProperty DP(@Nonnull IRI iri) {try{__CLR4_5_2adhadhlviclh9m.R.inc(13455);
        __CLR4_5_2adhadhlviclh9m.R.inc(13456);return testSubject.getOWLDataProperty(iri);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Nonnull
    private OWLDatatype D(@Nonnull IRI iri) {try{__CLR4_5_2adhadhlviclh9m.R.inc(13457);
        __CLR4_5_2adhadhlviclh9m.R.inc(13458);return testSubject.getOWLDatatype(iri);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveOWLLiteral() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h2axngadv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveOWLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h2axngadv(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13459);
        __CLR4_5_2adhadhlviclh9m.R.inc(13460);OWLDatatype dt = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13461);OWLLiteral conA = testSubject.getOWLLiteral("3", dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13462);OWLLiteral conB = testSubject.getOWLLiteral("3", dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13463);assertEquals(conA, conB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeOWLLiteral() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2by5vmwae0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeOWLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2by5vmwae0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13464);
        // Different datatypes - same literal
        __CLR4_5_2adhadhlviclh9m.R.inc(13465);OWLLiteral conA = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13466);OWLLiteral conB = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13467);assertFalse(conA.equals(conB));
        // Different literals - same datatype
        __CLR4_5_2adhadhlviclh9m.R.inc(13468);OWLDatatype dtC = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13469);OWLLiteral conC = testSubject.getOWLLiteral("3", dtC);
        __CLR4_5_2adhadhlviclh9m.R.inc(13470);OWLLiteral conD = testSubject.getOWLLiteral("4", dtC);
        __CLR4_5_2adhadhlviclh9m.R.inc(13471);assertFalse(conC.equals(conD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeOWLLiteral() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hmui69ae8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeOWLLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hmui69ae8(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13472);
        __CLR4_5_2adhadhlviclh9m.R.inc(13473);OWLDatatype dt = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13474);OWLLiteral conA = testSubject.getOWLLiteral("3", dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13475);OWLLiteral conB = testSubject.getOWLLiteral("3", dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13476);assertEquals(conA.hashCode(), conB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationOWLLiteralLang() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vdfz0xaed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationOWLLiteralLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vdfz0xaed(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13477);
        __CLR4_5_2adhadhlviclh9m.R.inc(13478);assertNotNull(testSubject.getOWLLiteral("TEST", "LANG"));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveOWLLiteralLang() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jtoa7eaef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveOWLLiteralLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jtoa7eaef(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13479);
        __CLR4_5_2adhadhlviclh9m.R.inc(13480);OWLLiteral conC = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13481);OWLLiteral conD = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13482);assertEquals(conC, conD);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeOWLLiteralLang() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24wwviyaej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeOWLLiteralLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24wwviyaej(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13483);
        __CLR4_5_2adhadhlviclh9m.R.inc(13484);OWLLiteral conC = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13485);OWLLiteral conD = testSubject.getOWLLiteral("TEST", "OTHER_LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13486);assertFalse(conC.equals(conD));
        __CLR4_5_2adhadhlviclh9m.R.inc(13487);OWLLiteral conE = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13488);OWLLiteral conF = testSubject.getOWLLiteral("OTHER", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13489);assertFalse(conE.equals(conF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeOWLLiteralLang() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l8jaczaeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeOWLLiteralLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l8jaczaeq(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13490);
        __CLR4_5_2adhadhlviclh9m.R.inc(13491);OWLLiteral conA = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13492);OWLLiteral conB = testSubject.getOWLLiteral("TEST", "LANG");
        __CLR4_5_2adhadhlviclh9m.R.inc(13493);assertEquals(conA.hashCode(), conB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationAxiomSameIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zkyvvaeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationAxiomSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zkyvvaeu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13494);
        __CLR4_5_2adhadhlviclh9m.R.inc(13495);OWLObject obj = testSubject.getOWLSameIndividualAxiom(I(), I(), I());
        __CLR4_5_2adhadhlviclh9m.R.inc(13496);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveAxiomSameIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgec18aex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveAxiomSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgec18aex(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13497);
        __CLR4_5_2adhadhlviclh9m.R.inc(13498);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13499);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13500);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13501);OWLObject objA = testSubject.getOWLSameIndividualAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13502);OWLObject objB = testSubject.getOWLSameIndividualAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13503);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeAxiomSameIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25t3zn4af4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeAxiomSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25t3zn4af4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13504);
        __CLR4_5_2adhadhlviclh9m.R.inc(13505);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13506);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13507);OWLObject objA = testSubject.getOWLSameIndividualAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13508);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13509);OWLObject objB = testSubject.getOWLSameIndividualAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13510);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeAxiomSameIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrsvyvafb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeAxiomSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrsvyvafb(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13511);
        __CLR4_5_2adhadhlviclh9m.R.inc(13512);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13513);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13514);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13515);OWLObject objA = testSubject.getOWLSameIndividualAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13516);OWLObject objB = testSubject.getOWLSameIndividualAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13517);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationAxiomDifferentFrom() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t37e3vafi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationAxiomDifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t37e3vafi(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13518);
        __CLR4_5_2adhadhlviclh9m.R.inc(13519);OWLObject obj = testSubject.getOWLDifferentIndividualsAxiom(I(), I(),
            I());
        __CLR4_5_2adhadhlviclh9m.R.inc(13520);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveAxiomDifferentFrom() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brtjr8afl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveAxiomDifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brtjr8afl(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13521);
        __CLR4_5_2adhadhlviclh9m.R.inc(13522);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13523);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13524);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13525);OWLObject objA = testSubject.getOWLDifferentIndividualsAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13526);OWLObject objB = testSubject.getOWLDifferentIndividualsAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13527);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeAxiomDifferentFrom() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yoqtj4afs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeAxiomDifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yoqtj4afs(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13528);
        __CLR4_5_2adhadhlviclh9m.R.inc(13529);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13530);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13531);OWLObject objA = testSubject.getOWLDifferentIndividualsAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13532);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13533);OWLObject objB = testSubject.getOWLDifferentIndividualsAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13534);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeAxiomDifferentFrom() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25sn8x3afz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeAxiomDifferentFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25sn8x3afz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13535);
        __CLR4_5_2adhadhlviclh9m.R.inc(13536);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13537);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13538);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13539);OWLObject objA = testSubject.getOWLDifferentIndividualsAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13540);OWLObject objB = testSubject.getOWLDifferentIndividualsAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13541);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDatatype() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22h1anwag6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22h1anwag6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13542);
        __CLR4_5_2adhadhlviclh9m.R.inc(13543);OWLDatatype typeA = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13544);assertNotNull(typeA);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDatatype() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tiukizag9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tiukizag9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13545);
        __CLR4_5_2adhadhlviclh9m.R.inc(13546);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(13547);OWLDatatype typeA = D(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(13548);OWLDatatype typeB = D(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(13549);assertEquals(typeA, typeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDatatype() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a4ykpdage();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a4ykpdage(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13550);
        __CLR4_5_2adhadhlviclh9m.R.inc(13551);OWLDatatype typeA = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13552);OWLDatatype typeB = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13553);assertFalse(typeA.equals(typeB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDatatype() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cxv01kagi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cxv01kagi(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13554);
        __CLR4_5_2adhadhlviclh9m.R.inc(13555);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(13556);OWLDatatype typeA = D(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(13557);OWLDatatype typeB = D(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(13558);assertEquals(typeA.hashCode(), typeB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j7qp7tagn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j7qp7tagn(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13559);
        __CLR4_5_2adhadhlviclh9m.R.inc(13560);OWLDatatype rng = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13561);OWLLiteral facetValue = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13562);OWLDatatypeRestriction restRng = testSubject.getOWLDatatypeRestriction(
            rng,
            testSubject.getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue));
        __CLR4_5_2adhadhlviclh9m.R.inc(13563);assertNotNull(restRng);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqvlyoags();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqvlyoags(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13564);
        __CLR4_5_2adhadhlviclh9m.R.inc(13565);OWLDatatype rng = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13566);OWLLiteral facetValue = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13567);OWLDatatypeRestriction restRngA = testSubject
            .getOWLDatatypeRestriction(rng, testSubject
                .getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue));
        __CLR4_5_2adhadhlviclh9m.R.inc(13568);OWLDatatypeRestriction restRngB = testSubject
            .getOWLDatatypeRestriction(rng, testSubject
                .getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue));
        __CLR4_5_2adhadhlviclh9m.R.inc(13569);assertEquals(restRngA, restRngB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rb1vf0agy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rb1vf0agy(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13570);
        __CLR4_5_2adhadhlviclh9m.R.inc(13571);OWLLiteral facetValue = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13572);OWLFacetRestriction r1 = testSubject
            .getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue);
        __CLR4_5_2adhadhlviclh9m.R.inc(13573);OWLFacetRestriction r2 = testSubject
            .getOWLFacetRestriction(MIN_INCLUSIVE, facetValue);
        __CLR4_5_2adhadhlviclh9m.R.inc(13574);assertNotEquals(r1, r2);
        __CLR4_5_2adhadhlviclh9m.R.inc(13575);OWLDatatype rng = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13576);OWLDatatypeRestriction restRngA = testSubject
            .getOWLDatatypeRestriction(rng, r1);
        __CLR4_5_2adhadhlviclh9m.R.inc(13577);OWLDatatypeRestriction restRngB = testSubject
            .getOWLDatatypeRestriction(rng, r2);
        __CLR4_5_2adhadhlviclh9m.R.inc(13578);assertNotEquals(restRngA, restRngB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bg8pw3ah7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bg8pw3ah7(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13579);
        __CLR4_5_2adhadhlviclh9m.R.inc(13580);OWLDatatype rng = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13581);OWLLiteral facetValue = testSubject.getOWLLiteral("3", D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13582);OWLDatatypeRestriction restRngA = testSubject
            .getOWLDatatypeRestriction(rng, testSubject
                .getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue));
        __CLR4_5_2adhadhlviclh9m.R.inc(13583);OWLDatatypeRestriction restRngB = testSubject
            .getOWLDatatypeRestriction(rng, testSubject
                .getOWLFacetRestriction(MAX_EXCLUSIVE, facetValue));
        __CLR4_5_2adhadhlviclh9m.R.inc(13584);assertEquals(restRngA.hashCode(), restRngB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationIntersection() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7w1q9ahd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationIntersection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7w1q9ahd(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13585);
        __CLR4_5_2adhadhlviclh9m.R.inc(13586);OWLObject obj = testSubject.getOWLObjectIntersectionOf(C(IRI()),
            C(IRI()), C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13587);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveIntersection() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ga449mahg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveIntersection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ga449mahg(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13588);
        __CLR4_5_2adhadhlviclh9m.R.inc(13589);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13590);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13591);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13592);OWLObject objA = testSubject.getOWLObjectIntersectionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13593);OWLObject objB = testSubject.getOWLObjectIntersectionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13594);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeIntersection() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2k696ahn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeIntersection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2k696ahn(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13595);
        __CLR4_5_2adhadhlviclh9m.R.inc(13596);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13597);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13598);OWLObject objA = testSubject.getOWLObjectIntersectionOf(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13599);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13600);OWLObject objB = testSubject.getOWLObjectIntersectionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13601);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeIntersection() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fm9kznahu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeIntersection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fm9kznahu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13602);
        __CLR4_5_2adhadhlviclh9m.R.inc(13603);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13604);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13605);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13606);OWLObject objA = testSubject.getOWLObjectIntersectionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13607);OWLObject objB = testSubject.getOWLObjectIntersectionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13608);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25pqfntai1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25pqfntai1(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13609);
        __CLR4_5_2adhadhlviclh9m.R.inc(13610);OWLObject obj = testSubject.getOWLDataOneOf(Literal(), Literal(),
            Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(13611);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_288vceoai4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_288vceoai4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13612);
        __CLR4_5_2adhadhlviclh9m.R.inc(13613);OWLLiteral a = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13614);OWLLiteral b = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13615);OWLLiteral c = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13616);OWLObject objA = testSubject.getOWLDataOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13617);OWLObject objB = testSubject.getOWLDataOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13618);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u81x04aib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u81x04aib(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13619);
        __CLR4_5_2adhadhlviclh9m.R.inc(13620);OWLLiteral a = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13621);OWLLiteral b = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13622);OWLObject objA = testSubject.getOWLDataOneOf(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13623);OWLLiteral c = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13624);OWLObject objB = testSubject.getOWLDataOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13625);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oy8zg3aii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oy8zg3aii(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13626);
        __CLR4_5_2adhadhlviclh9m.R.inc(13627);OWLLiteral a = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13628);OWLLiteral b = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13629);OWLLiteral c = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(13630);OWLObject objA = testSubject.getOWLDataOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13631);OWLObject objB = testSubject.getOWLDataOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13632);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bfaj4vaip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bfaj4vaip(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13633);
        __CLR4_5_2adhadhlviclh9m.R.inc(13634);OWLDatatype dt = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13635);OWLDataComplementOf rng = testSubject.getOWLDataComplementOf(dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13636);assertNotNull(rng);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26hagy0ait();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26hagy0ait(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13637);
        __CLR4_5_2adhadhlviclh9m.R.inc(13638);OWLDatatype dt = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13639);OWLDataComplementOf rngA = testSubject.getOWLDataComplementOf(dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13640);OWLDataComplementOf rngB = testSubject.getOWLDataComplementOf(dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13641);assertEquals(rngA, rngB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4lwtwaiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4lwtwaiy(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13642);
        __CLR4_5_2adhadhlviclh9m.R.inc(13643);OWLDatatype dtA = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13644);OWLDataComplementOf rngA = testSubject.getOWLDataComplementOf(dtA);
        __CLR4_5_2adhadhlviclh9m.R.inc(13645);OWLDatatype dtB = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13646);OWLDataComplementOf rngB = testSubject.getOWLDataComplementOf(dtB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13647);assertFalse(rngA.equals(rngB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qp81sraj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qp81sraj4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13648);
        __CLR4_5_2adhadhlviclh9m.R.inc(13649);OWLDatatype dt = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13650);OWLDataComplementOf rngA = testSubject.getOWLDataComplementOf(dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13651);OWLDataComplementOf rngB = testSubject.getOWLDataComplementOf(dt);
        __CLR4_5_2adhadhlviclh9m.R.inc(13652);assertEquals(rngA.hashCode(), rngB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDisjointClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_283h3kpaj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_283h3kpaj9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13653);
        __CLR4_5_2adhadhlviclh9m.R.inc(13654);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13655);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13656);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13657);OWLObject objA = testSubject.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13658);OWLObject objB = testSubject.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13659);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDisjointClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26cjkh7ajg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26cjkh7ajg(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13660);
        __CLR4_5_2adhadhlviclh9m.R.inc(13661);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13662);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13663);OWLObject objA = testSubject.getOWLDisjointClassesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13664);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13665);OWLObject objB = testSubject.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13666);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDisjointClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22fytjwajn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22fytjwajn(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13667);
        __CLR4_5_2adhadhlviclh9m.R.inc(13668);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13669);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13670);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13671);OWLObject objA = testSubject.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13672);OWLObject objB = testSubject.getOWLDisjointClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13673);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectUnionOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttjmwzaju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttjmwzaju(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13674);
        __CLR4_5_2adhadhlviclh9m.R.inc(13675);OWLObject obj = testSubject.getOWLObjectUnionOf(C(IRI()), C(IRI()),
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13676);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectUnionOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dcazk4ajx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dcazk4ajx(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13677);
        __CLR4_5_2adhadhlviclh9m.R.inc(13678);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13679);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13680);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13681);OWLObject objA = testSubject.getOWLObjectUnionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13682);OWLObject objB = testSubject.getOWLObjectUnionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13683);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectUnionOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_282t708ak4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_282t708ak4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13684);
        __CLR4_5_2adhadhlviclh9m.R.inc(13685);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13686);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13687);OWLObject objA = testSubject.getOWLObjectUnionOf(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13688);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13689);OWLObject objB = testSubject.getOWLObjectUnionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13690);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectUnionOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iw308xakb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iw308xakb(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13691);
        __CLR4_5_2adhadhlviclh9m.R.inc(13692);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13693);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13694);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13695);OWLObject objA = testSubject.getOWLObjectUnionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13696);OWLObject objB = testSubject.getOWLObjectUnionOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13697);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDisjointObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w6tih2aki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w6tih2aki(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13698);
        __CLR4_5_2adhadhlviclh9m.R.inc(13699);OWLObjectPropertyExpression[] properties = { OP(IRI()), OP(IRI()),
            OP(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13700);OWLObject obj = testSubject
            .getOWLDisjointObjectPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13701);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDisjointObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25wcb8hakm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25wcb8hakm(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13702);
        __CLR4_5_2adhadhlviclh9m.R.inc(13703);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13704);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13705);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13706);OWLObject objA = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13707);OWLObject objB = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13708);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDisjointObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28drh9hakt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28drh9hakt(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13709);
        __CLR4_5_2adhadhlviclh9m.R.inc(13710);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13711);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13712);OWLObject objA = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13713);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13714);OWLObject objB = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13715);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDisjointObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vj1ksial0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vj1ksial0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13716);
        __CLR4_5_2adhadhlviclh9m.R.inc(13717);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13718);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13719);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13720);OWLObject objA = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13721);OWLObject objB = testSubject.getOWLDisjointObjectPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13722);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testAsSubAxiomsEquivalentObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ud86imal7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testAsSubAxiomsEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ud86imal7(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13723);
        __CLR4_5_2adhadhlviclh9m.R.inc(13724);OWLObjectPropertyExpression[] properties = { OP(IRI()), OP(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13725);OWLEquivalentObjectPropertiesAxiom objA = testSubject
            .getOWLEquivalentObjectPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13726);assertEquals(2, objA.asSubObjectPropertyOfAxioms().size());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationEquivalentObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4f6a4alb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4f6a4alb(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13727);
        __CLR4_5_2adhadhlviclh9m.R.inc(13728);OWLObjectPropertyExpression[] properties = { OP(IRI()), OP(IRI()),
            OP(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13729);OWLObject obj = testSubject
            .getOWLEquivalentObjectPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13730);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveEquivalentObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xf72j1alf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xf72j1alf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13731);
        __CLR4_5_2adhadhlviclh9m.R.inc(13732);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13733);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13734);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13735);OWLObject objA = testSubject.getOWLEquivalentObjectPropertiesAxiom(a,
            b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13736);OWLObject objB = testSubject.getOWLEquivalentObjectPropertiesAxiom(a,
            b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13737);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeEquivalentObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lz0zbalm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lz0zbalm(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13738);
        __CLR4_5_2adhadhlviclh9m.R.inc(13739);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13740);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13741);OWLObject objA = testSubject
            .getOWLEquivalentObjectPropertiesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13742);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13743);OWLObject objB = testSubject.getOWLEquivalentObjectPropertiesAxiom(a,
            b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13744);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeEquivalentObjectProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bj4t00alt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bj4t00alt(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13745);
        __CLR4_5_2adhadhlviclh9m.R.inc(13746);OWLObjectProperty a = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13747);OWLObjectProperty b = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13748);OWLObjectProperty c = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13749);OWLObject objA = testSubject.getOWLEquivalentObjectPropertiesAxiom(a,
            b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13750);OWLObject objB = testSubject.getOWLEquivalentObjectPropertiesAxiom(a,
            b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13751);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDisjointDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c6mzblam0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c6mzblam0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13752);
        __CLR4_5_2adhadhlviclh9m.R.inc(13753);OWLDataPropertyExpression[] properties = { DP(IRI()), DP(IRI()),
            DP(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13754);OWLObject obj = testSubject
            .getOWLDisjointDataPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13755);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDisjointDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_220o4buam4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_220o4buam4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13756);
        __CLR4_5_2adhadhlviclh9m.R.inc(13757);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13758);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13759);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13760);OWLObject objA = testSubject.getOWLDisjointDataPropertiesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13761);OWLObject objB = testSubject.getOWLDisjointDataPropertiesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13762);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDisjointDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_238cggqamb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_238cggqamb(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13763);
        __CLR4_5_2adhadhlviclh9m.R.inc(13764);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13765);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13766);OWLObject objA = testSubject.getOWLDisjointDataPropertiesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13767);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13768);OWLObject objB = testSubject.getOWLDisjointDataPropertiesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13769);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDisjointDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vw8abami();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vw8abami(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13770);
        __CLR4_5_2adhadhlviclh9m.R.inc(13771);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13772);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13773);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13774);OWLObject objA = testSubject.getOWLDisjointDataPropertiesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13775);OWLObject objB = testSubject.getOWLDisjointDataPropertiesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13776);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testAsSubAxiomsEquivalentDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211ccj7amp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testAsSubAxiomsEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211ccj7amp(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13777);
        __CLR4_5_2adhadhlviclh9m.R.inc(13778);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13779);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13780);OWLDataPropertyExpression[] properties = { a, b };
        __CLR4_5_2adhadhlviclh9m.R.inc(13781);OWLEquivalentDataPropertiesAxiom objA = testSubject
            .getOWLEquivalentDataPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13782);assertEquals(2, objA.asSubDataPropertyOfAxioms().size());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationEquivalentDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h33vy7amv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h33vy7amv(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13783);
        __CLR4_5_2adhadhlviclh9m.R.inc(13784);OWLDataPropertyExpression[] properties = { DP(IRI()), DP(IRI()),
            DP(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13785);OWLObject obj = testSubject
            .getOWLEquivalentDataPropertiesAxiom(properties);
        __CLR4_5_2adhadhlviclh9m.R.inc(13786);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveEquivalentDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l01xrcamz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l01xrcamz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13787);
        __CLR4_5_2adhadhlviclh9m.R.inc(13788);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13789);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13790);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13791);OWLObject objA = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13792);OWLObject objB = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13793);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeEquivalentDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhh3scan6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhh3scan6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13794);
        __CLR4_5_2adhadhlviclh9m.R.inc(13795);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13796);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13797);OWLObject objA = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13798);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13799);OWLObject objB = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13800);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeEquivalentDataProperties() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gfby9nand();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gfby9nand(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13801);
        __CLR4_5_2adhadhlviclh9m.R.inc(13802);OWLDataProperty a = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13803);OWLDataProperty b = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13804);OWLDataProperty c = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13805);OWLObject objA = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13806);OWLObject objB = testSubject.getOWLEquivalentDataPropertiesAxiom(a, b,
            c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13807);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testAsSubAxiomsEquivalentClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xd9bvoank();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testAsSubAxiomsEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xd9bvoank(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13808);
        __CLR4_5_2adhadhlviclh9m.R.inc(13809);OWLClassExpression[] classExpressions = { C(IRI()), C(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13810);OWLEquivalentClassesAxiom objA = testSubject
            .getOWLEquivalentClassesAxiom(classExpressions);
        __CLR4_5_2adhadhlviclh9m.R.inc(13811);assertEquals(2, objA.asOWLSubClassOfAxioms().size());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationEquivalentClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ddhoweano();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ddhoweano(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13812);
        __CLR4_5_2adhadhlviclh9m.R.inc(13813);OWLClassExpression[] classExpressions = { C(IRI()), C(IRI()), C(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(13814);OWLObject obj = testSubject
            .getOWLEquivalentClassesAxiom(classExpressions);
        __CLR4_5_2adhadhlviclh9m.R.inc(13815);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveEquivalentClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26obk7ans();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26obk7ans(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13816);
        __CLR4_5_2adhadhlviclh9m.R.inc(13817);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13818);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13819);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13820);OWLObject objA = testSubject.getOWLEquivalentClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13821);OWLObject objB = testSubject.getOWLEquivalentClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13822);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeEquivalentClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ue71odanz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ue71odanz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13823);
        __CLR4_5_2adhadhlviclh9m.R.inc(13824);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13825);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13826);OWLObject objA = testSubject.getOWLEquivalentClassesAxiom(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13827);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13828);OWLObject objB = testSubject.getOWLEquivalentClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13829);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeEquivalentClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xzp1tiao6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xzp1tiao6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13830);
        __CLR4_5_2adhadhlviclh9m.R.inc(13831);OWLClassExpression a = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13832);OWLClassExpression b = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13833);OWLClassExpression c = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13834);OWLObject objA = testSubject.getOWLEquivalentClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13835);OWLObject objB = testSubject.getOWLEquivalentClassesAxiom(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13836);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x5wvosaod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x5wvosaod(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13837);
        __CLR4_5_2adhadhlviclh9m.R.inc(13838);OWLClassExpression operand = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13839);OWLObjectComplementOf not = testSubject
            .getOWLObjectComplementOf(operand);
        __CLR4_5_2adhadhlviclh9m.R.inc(13840);assertNotNull(not);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kjtbxpaoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kjtbxpaoh(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13841);
        __CLR4_5_2adhadhlviclh9m.R.inc(13842);OWLClassExpression operand = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13843);OWLObjectComplementOf notA = testSubject
            .getOWLObjectComplementOf(operand);
        __CLR4_5_2adhadhlviclh9m.R.inc(13844);OWLObjectComplementOf notB = testSubject
            .getOWLObjectComplementOf(operand);
        __CLR4_5_2adhadhlviclh9m.R.inc(13845);assertEquals(notA, notB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwr1cnaom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwr1cnaom(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13846);
        __CLR4_5_2adhadhlviclh9m.R.inc(13847);OWLClassExpression operandA = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13848);OWLObjectComplementOf notA = testSubject
            .getOWLObjectComplementOf(operandA);
        __CLR4_5_2adhadhlviclh9m.R.inc(13849);OWLClassExpression operandB = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13850);OWLObjectComplementOf notB = testSubject
            .getOWLObjectComplementOf(operandB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13851);assertFalse(notA.equals(notB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectComplementOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekn13kaos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekn13kaos(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13852);
        __CLR4_5_2adhadhlviclh9m.R.inc(13853);OWLClassExpression operand = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13854);OWLObjectComplementOf notA = testSubject
            .getOWLObjectComplementOf(operand);
        __CLR4_5_2adhadhlviclh9m.R.inc(13855);OWLObjectComplementOf notB = testSubject
            .getOWLObjectComplementOf(operand);
        __CLR4_5_2adhadhlviclh9m.R.inc(13856);assertEquals(notA.hashCode(), notB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2shce6kaox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2shce6kaox(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13857);
        __CLR4_5_2adhadhlviclh9m.R.inc(13858);OWLIndividual[] individuals = { I(), I(), I() };
        __CLR4_5_2adhadhlviclh9m.R.inc(13859);OWLObject obj = testSubject.getOWLObjectOneOf(individuals);
        __CLR4_5_2adhadhlviclh9m.R.inc(13860);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap44atap1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap44atap1(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13861);
        __CLR4_5_2adhadhlviclh9m.R.inc(13862);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13863);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13864);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13865);OWLObject objA = testSubject.getOWLObjectOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13866);OWLObject objB = testSubject.getOWLObjectOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13867);assertEquals(objA, objB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2davdhbap8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2davdhbap8(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13868);
        __CLR4_5_2adhadhlviclh9m.R.inc(13869);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13870);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13871);OWLObject objA = testSubject.getOWLObjectOneOf(a, b);
        __CLR4_5_2adhadhlviclh9m.R.inc(13872);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13873);OWLObject objB = testSubject.getOWLObjectOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13874);assertFalse(objA.equals(objB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectOneOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kw3x8oapf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kw3x8oapf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13875);
        __CLR4_5_2adhadhlviclh9m.R.inc(13876);OWLIndividual a = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13877);OWLIndividual b = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13878);OWLIndividual c = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(13879);OWLObject objA = testSubject.getOWLObjectOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13880);OWLObject objB = testSubject.getOWLObjectOneOf(a, b, c);
        __CLR4_5_2adhadhlviclh9m.R.inc(13881);assertEquals(objA.hashCode(), objB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectHasSelf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iw0uv1apm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iw0uv1apm(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13882);
        __CLR4_5_2adhadhlviclh9m.R.inc(13883);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13884);OWLObjectHasSelf restA = testSubject.getOWLObjectHasSelf(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(13885);assertNotNull(restA);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectHasSelf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28z8kn0apq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28z8kn0apq(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13886);
        __CLR4_5_2adhadhlviclh9m.R.inc(13887);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13888);OWLObjectHasSelf restA = testSubject.getOWLObjectHasSelf(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(13889);OWLObjectHasSelf restB = testSubject.getOWLObjectHasSelf(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(13890);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectHasSelf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uecr7capv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uecr7capv(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13891);
        __CLR4_5_2adhadhlviclh9m.R.inc(13892);OWLObjectHasSelf restA = testSubject.getOWLObjectHasSelf(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13893);OWLObjectHasSelf restB = testSubject.getOWLObjectHasSelf(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13894);assertFalse(restA.equals(restB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectHasSelf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fgjy7apz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fgjy7apz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13895);
        __CLR4_5_2adhadhlviclh9m.R.inc(13896);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13897);OWLObjectHasSelf restA = testSubject.getOWLObjectHasSelf(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(13898);OWLObjectHasSelf restB = testSubject.getOWLObjectHasSelf(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(13899);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataExact() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k8tzytaq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataExact",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k8tzytaq4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13900);
        __CLR4_5_2adhadhlviclh9m.R.inc(13901);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13902);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13903);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataExactCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13904);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(13905);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13906);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataExactCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13907);assertNotNull(restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13908);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataExact() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hpp37yaqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataExact",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hpp37yaqd(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13909);
        __CLR4_5_2adhadhlviclh9m.R.inc(13910);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13911);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13912);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataExactCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13913);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataExactCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13914);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13915);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13916);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataExactCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13917);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataExactCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13918);assertEquals(restC, restD);
        __CLR4_5_2adhadhlviclh9m.R.inc(13919);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataExact() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_249hhdiaqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataExact",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_249hhdiaqo(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13920);
        __CLR4_5_2adhadhlviclh9m.R.inc(13921);OWLDataProperty prop = DP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(13922);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataExactCardinality(3, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13923);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataExactCardinality(4, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13924);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(13925);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataExactCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13926);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataExactCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13927);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(13928);OWLDataCardinalityRestriction restE = testSubject
            .getOWLDataExactCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13929);OWLDataCardinalityRestriction restF = testSubject
            .getOWLDataExactCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13930);assertFalse(restE.equals(restF));
        __CLR4_5_2adhadhlviclh9m.R.inc(13931);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataExact() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k4amwfar0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataExact",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k4amwfar0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13932);
        __CLR4_5_2adhadhlviclh9m.R.inc(13933);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13934);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13935);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13936);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataExactCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13937);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataExactCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13938);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13939);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataMin() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p0v0gyar8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p0v0gyar8(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13940);
        __CLR4_5_2adhadhlviclh9m.R.inc(13941);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13942);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13943);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMinCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13944);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(13945);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13946);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMinCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13947);assertNotNull(restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13948);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataMin() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxhc4barh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxhc4barh(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13949);
        __CLR4_5_2adhadhlviclh9m.R.inc(13950);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13951);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13952);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMinCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13953);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMinCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13954);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13955);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13956);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataMinCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13957);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataMinCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13958);assertEquals(restC, restD);
        __CLR4_5_2adhadhlviclh9m.R.inc(13959);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataMin() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27av489ars();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27av489ars(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13960);
        __CLR4_5_2adhadhlviclh9m.R.inc(13961);OWLDataProperty prop = DP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(13962);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMinCardinality(3, prop, testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13963);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMinCardinality(4, prop, testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13964);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(13965);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataMinCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13966);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataMinCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13967);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(13968);OWLDataCardinalityRestriction restE = testSubject
            .getOWLDataMinCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13969);OWLDataCardinalityRestriction restF = testSubject
            .getOWLDataMinCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(13970);assertFalse(restE.equals(restF));
        __CLR4_5_2adhadhlviclh9m.R.inc(13971);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataMin() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ht8rbyas4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ht8rbyas4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13972);
        __CLR4_5_2adhadhlviclh9m.R.inc(13973);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13974);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13975);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13976);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMinCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13977);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMinCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13978);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13979);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataMax() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6eez4asc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6eez4asc(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13980);
        __CLR4_5_2adhadhlviclh9m.R.inc(13981);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13982);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13983);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMaxCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13984);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(13985);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13986);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMaxCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13987);assertNotNull(restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13988);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataMax() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),13989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p30qmhasl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),13989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p30qmhasl(){try{__CLR4_5_2adhadhlviclh9m.R.inc(13989);
        __CLR4_5_2adhadhlviclh9m.R.inc(13990);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13991);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(13992);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMaxCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13993);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMaxCardinality(cardinality, prop,
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(13994);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(13995);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(13996);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataMaxCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13997);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataMaxCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(13998);assertEquals(restC, restD);
        __CLR4_5_2adhadhlviclh9m.R.inc(13999);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataMax() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5bpq3asw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5bpq3asw(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14000);
        __CLR4_5_2adhadhlviclh9m.R.inc(14001);OWLDataProperty prop = DP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(14002);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMaxCardinality(3, prop, testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(14003);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMaxCardinality(4, prop, testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(14004);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14005);OWLDataCardinalityRestriction restC = testSubject
            .getOWLDataMaxCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(14006);OWLDataCardinalityRestriction restD = testSubject
            .getOWLDataMaxCardinality(3, DP(IRI()),
                testSubject.getTopDatatype());
        __CLR4_5_2adhadhlviclh9m.R.inc(14007);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14008);OWLDataCardinalityRestriction restE = testSubject
            .getOWLDataMaxCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14009);OWLDataCardinalityRestriction restF = testSubject
            .getOWLDataMaxCardinality(3, prop, D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14010);assertFalse(restE.equals(restF));
        __CLR4_5_2adhadhlviclh9m.R.inc(14011);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataMax() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ys5u4at8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ys5u4at8(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14012);
        __CLR4_5_2adhadhlviclh9m.R.inc(14013);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14014);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14015);OWLDataRange dataRange = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14016);OWLDataCardinalityRestriction restA = testSubject
            .getOWLDataMaxCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(14017);OWLDataCardinalityRestriction restB = testSubject
            .getOWLDataMaxCardinality(cardinality, prop, dataRange);
        __CLR4_5_2adhadhlviclh9m.R.inc(14018);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(14019);assertEquals(restA.getProperty(), prop);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationClass() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s736xaatg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s736xaatg(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14020);
        __CLR4_5_2adhadhlviclh9m.R.inc(14021);assertNotNull(C(IRI()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveClass() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o7ryejati();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o7ryejati(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14022);
        __CLR4_5_2adhadhlviclh9m.R.inc(14023);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14024);OWLEntity entityA = C(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14025);OWLEntity entityB = C(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14026);assertEquals(entityA, entityB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeClass() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yl4w61atn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yl4w61atn(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14027);
        __CLR4_5_2adhadhlviclh9m.R.inc(14028);OWLEntity entityA = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14029);OWLEntity entityB = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14030);assertFalse(entityA.equals(entityB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeClass() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_271vu5qatr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_271vu5qatr(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14031);
        __CLR4_5_2adhadhlviclh9m.R.inc(14032);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14033);int hashCodeA = C(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14034);int hashCodeB = C(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14035);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cy1mqatw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cy1mqatw(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14036);
        __CLR4_5_2adhadhlviclh9m.R.inc(14037);assertNotNull(DP(IRI()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2szpyedaty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2szpyedaty(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14038);
        __CLR4_5_2adhadhlviclh9m.R.inc(14039);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14040);OWLEntity entityA = DP(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14041);OWLEntity entityB = DP(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14042);assertEquals(entityA, entityB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xyw97tau3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xyw97tau3(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14043);
        __CLR4_5_2adhadhlviclh9m.R.inc(14044);OWLEntity entityA = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14045);OWLEntity entityB = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14046);assertFalse(entityA.equals(entityB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sfseiqau7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sfseiqau7(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14047);
        __CLR4_5_2adhadhlviclh9m.R.inc(14048);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14049);int hashCodeA = DP(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14050);int hashCodeB = DP(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14051);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObject() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28hpuh5auc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28hpuh5auc(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14052);
        __CLR4_5_2adhadhlviclh9m.R.inc(14053);assertNotNull(OP(IRI()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObject() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f1tsgaue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f1tsgaue(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14054);
        __CLR4_5_2adhadhlviclh9m.R.inc(14055);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14056);OWLEntity entityA = OP(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14057);OWLEntity entityB = OP(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14058);assertEquals(entityA, entityB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObject() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhl9v8auj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhl9v8auj(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14059);
        __CLR4_5_2adhadhlviclh9m.R.inc(14060);OWLEntity entityA = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14061);OWLEntity entityB = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14062);assertFalse(entityA.equals(entityB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObject() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z9x3jnaun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z9x3jnaun(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14063);
        __CLR4_5_2adhadhlviclh9m.R.inc(14064);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14065);int hashCodeA = OP(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14066);int hashCodeB = OP(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14067);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationAnnotationProperty() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ulj5mkaus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ulj5mkaus(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14068);
        __CLR4_5_2adhadhlviclh9m.R.inc(14069);assertNotNull(testSubject.getOWLAnnotationProperty(IRI()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveAnnotationProperty() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2da5b9xauu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2da5b9xauu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14070);
        __CLR4_5_2adhadhlviclh9m.R.inc(14071);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14072);OWLEntity entityA = testSubject.getOWLAnnotationProperty(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14073);OWLEntity entityB = testSubject.getOWLAnnotationProperty(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14074);assertEquals(entityA, entityB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeAnnotationProperty() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x6f20fauz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x6f20fauz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14075);
        __CLR4_5_2adhadhlviclh9m.R.inc(14076);OWLEntity entityA = testSubject.getOWLAnnotationProperty(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14077);OWLEntity entityB = testSubject.getOWLAnnotationProperty(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14078);assertFalse(entityA.equals(entityB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeAnnotationProperty() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27az0fsav3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27az0fsav3(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14079);
        __CLR4_5_2adhadhlviclh9m.R.inc(14080);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14081);int hashCodeA = testSubject.getOWLAnnotationProperty(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14082);int hashCodeB = testSubject.getOWLAnnotationProperty(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14083);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationNamedIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qghbt4av8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qghbt4av8(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14084);
        __CLR4_5_2adhadhlviclh9m.R.inc(14085);assertNotNull(testSubject.getOWLNamedIndividual(IRI()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveNamedIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nl789bava();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nl789bava(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14086);
        __CLR4_5_2adhadhlviclh9m.R.inc(14087);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14088);OWLEntity entityA = testSubject.getOWLNamedIndividual(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14089);OWLEntity entityB = testSubject.getOWLNamedIndividual(iri);
        __CLR4_5_2adhadhlviclh9m.R.inc(14090);assertEquals(entityA, entityB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeNamedIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wzw5nxavf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wzw5nxavf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14091);
        __CLR4_5_2adhadhlviclh9m.R.inc(14092);OWLEntity entityA = testSubject.getOWLNamedIndividual(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14093);OWLEntity entityB = testSubject.getOWLNamedIndividual(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14094);assertFalse(entityA.equals(entityB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeNamedIndividual() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8pia4avj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8pia4avj(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14095);
        __CLR4_5_2adhadhlviclh9m.R.inc(14096);IRI iri = IRI();
        __CLR4_5_2adhadhlviclh9m.R.inc(14097);int hashCodeA = testSubject.getOWLNamedIndividual(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14098);int hashCodeB = testSubject.getOWLNamedIndividual(iri).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14099);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xuvpwoavo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xuvpwoavo(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14100);
        __CLR4_5_2adhadhlviclh9m.R.inc(14101);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14102);OWLIndividual filler = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14103);OWLRestriction restA = testSubject.getOWLObjectHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14104);OWLRestriction restB = testSubject.getOWLObjectHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14105);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvp5b8avu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvp5b8avu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14106);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14107);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14108);OWLRestriction restA = testSubject.getOWLObjectHasValue(prop, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14109);OWLRestriction restB = testSubject.getOWLObjectHasValue(prop, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14110);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14111);OWLIndividual filler = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14112);OWLRestriction restC = testSubject.getOWLObjectHasValue(OP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14113);OWLRestriction restD = testSubject.getOWLObjectHasValue(OP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14114);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23z407paw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23z407paw3(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14115);
        __CLR4_5_2adhadhlviclh9m.R.inc(14116);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14117);OWLIndividual filler = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14118);OWLRestriction restA = testSubject.getOWLObjectHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14119);OWLRestriction restB = testSubject.getOWLObjectHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14120);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21fw0kcaw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21fw0kcaw9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14121);
        __CLR4_5_2adhadhlviclh9m.R.inc(14122);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14123);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14124);OWLRestriction restA = testSubject.getOWLObjectSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14125);OWLRestriction restB = testSubject.getOWLObjectSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14126);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ugctuoawf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ugctuoawf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14127);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14128);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14129);OWLRestriction restA = testSubject.getOWLObjectSomeValuesFrom(prop,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14130);OWLRestriction restB = testSubject.getOWLObjectSomeValuesFrom(prop,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14131);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14132);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14133);OWLRestriction restC = testSubject.getOWLObjectSomeValuesFrom(
            OP(IRI()), filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14134);OWLRestriction restD = testSubject.getOWLObjectSomeValuesFrom(
            OP(IRI()), filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14135);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yw2ll3awo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yw2ll3awo(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14136);
        __CLR4_5_2adhadhlviclh9m.R.inc(14137);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14138);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14139);OWLRestriction restA = testSubject.getOWLObjectSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14140);OWLRestriction restB = testSubject.getOWLObjectSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14141);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21432nzawu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21432nzawu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14142);
        __CLR4_5_2adhadhlviclh9m.R.inc(14143);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14144);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14145);OWLRestriction restA = testSubject.getOWLObjectAllValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14146);OWLRestriction restB = testSubject.getOWLObjectAllValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14147);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n39n9fax0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n39n9fax0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14148);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14149);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14150);OWLRestriction restA = testSubject.getOWLObjectAllValuesFrom(prop,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14151);OWLRestriction restB = testSubject.getOWLObjectAllValuesFrom(prop,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14152);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14153);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14154);OWLRestriction restC = testSubject.getOWLObjectAllValuesFrom(OP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14155);OWLRestriction restD = testSubject.getOWLObjectAllValuesFrom(OP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14156);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w3196sax9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w3196sax9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14157);
        __CLR4_5_2adhadhlviclh9m.R.inc(14158);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14159);OWLClassExpression filler = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14160);OWLRestriction restA = testSubject.getOWLObjectAllValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14161);OWLRestriction restB = testSubject.getOWLObjectAllValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14162);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2unr49faxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2unr49faxf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14163);
        __CLR4_5_2adhadhlviclh9m.R.inc(14164);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14165);OWLLiteral filler = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14166);OWLRestriction restA = testSubject.getOWLDataHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14167);OWLRestriction restB = testSubject.getOWLDataHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14168);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29klc35axl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29klc35axl(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14169);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14170);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14171);OWLRestriction restA = testSubject.getOWLDataHasValue(prop, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14172);OWLRestriction restB = testSubject.getOWLDataHasValue(prop, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14173);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14174);OWLLiteral filler = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14175);OWLRestriction restC = testSubject
            .getOWLDataHasValue(DP(IRI()), filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14176);OWLRestriction restD = testSubject
            .getOWLDataHasValue(DP(IRI()), filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14177);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataHas() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fjijh2axu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataHas",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fjijh2axu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14178);
        __CLR4_5_2adhadhlviclh9m.R.inc(14179);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14180);OWLLiteral filler = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14181);OWLRestriction restA = testSubject.getOWLDataHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14182);OWLRestriction restB = testSubject.getOWLDataHasValue(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14183);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qnykhbay0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qnykhbay0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14184);
        __CLR4_5_2adhadhlviclh9m.R.inc(14185);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14186);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14187);OWLRestriction restA = testSubject.getOWLDataSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14188);OWLRestriction restB = testSubject.getOWLDataSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14189);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24pcc9hay6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24pcc9hay6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14190);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14191);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14192);OWLRestriction restA = testSubject.getOWLDataSomeValuesFrom(prop,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14193);OWLRestriction restB = testSubject.getOWLDataSomeValuesFrom(prop,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14194);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14195);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14196);OWLRestriction restC = testSubject.getOWLDataSomeValuesFrom(DP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14197);OWLRestriction restD = testSubject.getOWLDataSomeValuesFrom(DP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14198);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataSome() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wfwxaayf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wfwxaayf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14199);
        __CLR4_5_2adhadhlviclh9m.R.inc(14200);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14201);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14202);OWLRestriction restA = testSubject.getOWLDataSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14203);OWLRestriction restB = testSubject.getOWLDataSomeValuesFrom(prop,
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14204);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24b7ob8ayl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24b7ob8ayl(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14205);
        __CLR4_5_2adhadhlviclh9m.R.inc(14206);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14207);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14208);OWLRestriction restA = testSubject
            .getOWLDataAllValuesFrom(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14209);OWLRestriction restB = testSubject
            .getOWLDataAllValuesFrom(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14210);assertEquals(restA, restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhjxbcayr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhjxbcayr(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14211);
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14212);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14213);OWLRestriction restA = testSubject.getOWLDataAllValuesFrom(prop,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14214);OWLRestriction restB = testSubject.getOWLDataAllValuesFrom(prop,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14215);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14216);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14217);OWLRestriction restC = testSubject.getOWLDataAllValuesFrom(DP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14218);OWLRestriction restD = testSubject.getOWLDataAllValuesFrom(DP(IRI()),
            filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14219);assertFalse(restC.equals(restD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataAll() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfg93laz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfg93laz0(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14220);
        __CLR4_5_2adhadhlviclh9m.R.inc(14221);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14222);OWLDataRange filler = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14223);OWLRestriction restA = testSubject
            .getOWLDataAllValuesFrom(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14224);OWLRestriction restB = testSubject
            .getOWLDataAllValuesFrom(prop, filler);
        __CLR4_5_2adhadhlviclh9m.R.inc(14225);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectAsymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ln5499az6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectAsymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ln5499az6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14226);
        __CLR4_5_2adhadhlviclh9m.R.inc(14227);OWLPropertyAxiom axiom = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14228);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectAsymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qk46eaz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectAsymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qk46eaz9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14229);
        __CLR4_5_2adhadhlviclh9m.R.inc(14230);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14231);OWLPropertyAxiom axA = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14232);OWLPropertyAxiom axB = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14233);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectAsymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pcghyaaze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectAsymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pcghyaaze(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14234);
        __CLR4_5_2adhadhlviclh9m.R.inc(14235);OWLPropertyAxiom axA = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14236);OWLPropertyAxiom axB = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14237);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectAsymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y41f1zazi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectAsymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y41f1zazi(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14238);
        __CLR4_5_2adhadhlviclh9m.R.inc(14239);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14240);OWLPropertyAxiom axA = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14241);OWLPropertyAxiom axB = testSubject
            .getOWLAsymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14242);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectInverseFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aycidyazn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectInverseFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aycidyazn(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14243);
        __CLR4_5_2adhadhlviclh9m.R.inc(14244);OWLPropertyAxiom axiom = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14245);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectInverseFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t272pdazq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectInverseFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t272pdazq(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14246);
        __CLR4_5_2adhadhlviclh9m.R.inc(14247);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14248);OWLPropertyAxiom axA = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14249);OWLPropertyAxiom axB = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14250);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectInverseFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28cxa2dazv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectInverseFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28cxa2dazv(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14251);
        __CLR4_5_2adhadhlviclh9m.R.inc(14252);OWLPropertyAxiom axA = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14253);OWLPropertyAxiom axB = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14254);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectInverseFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xvzmfmazz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectInverseFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xvzmfmazz(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14255);
        __CLR4_5_2adhadhlviclh9m.R.inc(14256);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14257);OWLPropertyAxiom axA = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14258);OWLPropertyAxiom axB = testSubject
            .getOWLInverseFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14259);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectIrreflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ael7p6b04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectIrreflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ael7p6b04(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14260);
        __CLR4_5_2adhadhlviclh9m.R.inc(14261);OWLPropertyAxiom axiom = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14262);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectIrreflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nlel1db07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectIrreflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nlel1db07(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14263);
        __CLR4_5_2adhadhlviclh9m.R.inc(14264);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14265);OWLPropertyAxiom axA = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14266);OWLPropertyAxiom axB = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14267);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectIrreflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2guu3p7b0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectIrreflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2guu3p7b0c(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14268);
        __CLR4_5_2adhadhlviclh9m.R.inc(14269);OWLPropertyAxiom axA = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14270);OWLPropertyAxiom axB = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14271);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectIrreflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9c3k2b0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectIrreflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14272,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9c3k2b0g(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14272);
        __CLR4_5_2adhadhlviclh9m.R.inc(14273);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14274);OWLPropertyAxiom axA = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14275);OWLPropertyAxiom axB = testSubject
            .getOWLIrreflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14276);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectReflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ouwpvb0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectReflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ouwpvb0l(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14277);
        __CLR4_5_2adhadhlviclh9m.R.inc(14278);OWLPropertyAxiom axiom = testSubject
            .getOWLReflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14279);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectReflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tkt62b0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectReflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tkt62b0o(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14280);
        __CLR4_5_2adhadhlviclh9m.R.inc(14281);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14282);OWLPropertyAxiom axA = testSubject
            .getOWLReflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14283);OWLPropertyAxiom axB = testSubject
            .getOWLReflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14284);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectReflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9lh7yb0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectReflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9lh7yb0t(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14285);
        __CLR4_5_2adhadhlviclh9m.R.inc(14286);OWLPropertyAxiom axA = testSubject
            .getOWLReflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14287);OWLPropertyAxiom axB = testSubject
            .getOWLReflexiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14288);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectReflexive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29h336vb0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectReflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29h336vb0x(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14289);
        __CLR4_5_2adhadhlviclh9m.R.inc(14290);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14291);OWLPropertyAxiom axA = testSubject
            .getOWLReflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14292);OWLPropertyAxiom axB = testSubject
            .getOWLReflexiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14293);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectSymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2umwwnib12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectSymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2umwwnib12(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14294);
        __CLR4_5_2adhadhlviclh9m.R.inc(14295);OWLPropertyAxiom axiom = testSubject
            .getOWLSymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14296);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectSymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rrmt3pb15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectSymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rrmt3pb15(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14297);
        __CLR4_5_2adhadhlviclh9m.R.inc(14298);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14299);OWLPropertyAxiom axA = testSubject
            .getOWLSymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14300);OWLPropertyAxiom axB = testSubject
            .getOWLSymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14301);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectSymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2stgktjb1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectSymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2stgktjb1a(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14302);
        __CLR4_5_2adhadhlviclh9m.R.inc(14303);OWLPropertyAxiom axA = testSubject
            .getOWLSymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14304);OWLPropertyAxiom axB = testSubject
            .getOWLSymmetricObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14305);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectSymmetric() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xf534ib1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectSymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xf534ib1e(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14306);
        __CLR4_5_2adhadhlviclh9m.R.inc(14307);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14308);OWLPropertyAxiom axA = testSubject
            .getOWLSymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14309);OWLPropertyAxiom axB = testSubject
            .getOWLSymmetricObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14310);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectTransitive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ohop9gb1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectTransitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ohop9gb1j(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14311);
        __CLR4_5_2adhadhlviclh9m.R.inc(14312);OWLPropertyAxiom axiom = testSubject
            .getOWLTransitiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14313);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectTransitive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smucmtb1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectTransitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smucmtb1m(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14314);
        __CLR4_5_2adhadhlviclh9m.R.inc(14315);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14316);OWLPropertyAxiom axA = testSubject
            .getOWLTransitiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14317);OWLPropertyAxiom axB = testSubject
            .getOWLTransitiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14318);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectTransitive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ksdbkfb1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectTransitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ksdbkfb1r(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14319);
        __CLR4_5_2adhadhlviclh9m.R.inc(14320);OWLPropertyAxiom axA = testSubject
            .getOWLTransitiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14321);OWLPropertyAxiom axB = testSubject
            .getOWLTransitiveObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14322);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectTransitive() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297r6lkb1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectTransitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297r6lkb1v(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14323);
        __CLR4_5_2adhadhlviclh9m.R.inc(14324);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14325);OWLPropertyAxiom axA = testSubject
            .getOWLTransitiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14326);OWLPropertyAxiom axB = testSubject
            .getOWLTransitiveObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14327);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2820d6ub20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2820d6ub20(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14328);
        __CLR4_5_2adhadhlviclh9m.R.inc(14329);OWLPropertyAxiom axiom = testSubject
            .getOWLFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14330);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pyld9pb23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pyld9pb23(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14331);
        __CLR4_5_2adhadhlviclh9m.R.inc(14332);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14333);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14334);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14335);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cozhtb28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cozhtb28(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14336);
        __CLR4_5_2adhadhlviclh9m.R.inc(14337);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14338);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalObjectPropertyAxiom(OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14339);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectFunctional() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277x5h2b2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277x5h2b2c(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14340);
        __CLR4_5_2adhadhlviclh9m.R.inc(14341);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14342);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14343);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalObjectPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14344);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataFunctionalData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ipic7jb2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataFunctionalData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ipic7jb2h(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14345);
        __CLR4_5_2adhadhlviclh9m.R.inc(14346);OWLPropertyAxiom axiom = testSubject
            .getOWLFunctionalDataPropertyAxiom(DP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14347);assertNotNull(axiom);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataFunctionalData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21e4huwb2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataFunctionalData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21e4huwb2k(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14348);
        __CLR4_5_2adhadhlviclh9m.R.inc(14349);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14350);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalDataPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14351);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalDataPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14352);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataFunctionalData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pyo6job2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataFunctionalData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pyo6job2p(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14353);
        __CLR4_5_2adhadhlviclh9m.R.inc(14354);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalDataPropertyAxiom(DP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14355);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalDataPropertyAxiom(DP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14356);assertFalse(axA.equals(axB));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataFunctionalData() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24l1sz9b2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataFunctionalData",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24l1sz9b2t(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14357);
        __CLR4_5_2adhadhlviclh9m.R.inc(14358);OWLDataProperty prop = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14359);OWLPropertyAxiom axA = testSubject
            .getOWLFunctionalDataPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14360);OWLPropertyAxiom axB = testSubject
            .getOWLFunctionalDataPropertyAxiom(prop);
        __CLR4_5_2adhadhlviclh9m.R.inc(14361);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationExactCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2duk52db2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationExactCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2duk52db2y(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14362);
        __CLR4_5_2adhadhlviclh9m.R.inc(14363);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14364);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14365);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectExactCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14366);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(14367);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14368);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectExactCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14369);assertNotNull(restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveExactCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gdp1t8b36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveExactCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gdp1t8b36(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14370);
        __CLR4_5_2adhadhlviclh9m.R.inc(14371);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14372);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14373);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectExactCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14374);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectExactCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14375);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(14376);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14377);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectExactCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14378);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectExactCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14379);assertEquals(restC, restD);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeExactCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wo8fkgb3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeExactCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wo8fkgb3g(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14380);
        __CLR4_5_2adhadhlviclh9m.R.inc(14381);OWLObjectProperty prop = OP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(14382);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectExactCardinality(3, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14383);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectExactCardinality(4, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14384);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14385);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectExactCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14386);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectExactCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14387);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14388);OWLObjectCardinalityRestriction restE = testSubject
            .getOWLObjectExactCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14389);OWLObjectCardinalityRestriction restF = testSubject
            .getOWLObjectExactCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14390);assertFalse(restE.equals(restF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeExactCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtfa1jb3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeExactCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtfa1jb3r(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14391);
        __CLR4_5_2adhadhlviclh9m.R.inc(14392);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14393);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14394);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14395);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectExactCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14396);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectExactCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14397);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationMaxCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aybmmub3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationMaxCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aybmmub3y(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14398);
        __CLR4_5_2adhadhlviclh9m.R.inc(14399);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14400);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14401);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14402);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(14403);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14404);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14405);assertNotNull(restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveMaxCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iuxya7b46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveMaxCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iuxya7b46(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14406);
        __CLR4_5_2adhadhlviclh9m.R.inc(14407);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14408);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14409);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14410);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14411);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(14412);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14413);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14414);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14415);assertEquals(restC, restD);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeMaxCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ldei2db4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeMaxCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ldei2db4g(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14416);
        __CLR4_5_2adhadhlviclh9m.R.inc(14417);OWLObjectProperty prop = OP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(14418);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMaxCardinality(3, prop, testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14419);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMaxCardinality(4, prop, testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14420);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14421);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectMaxCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14422);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectMaxCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14423);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14424);OWLObjectCardinalityRestriction restE = testSubject
            .getOWLObjectMaxCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14425);OWLObjectCardinalityRestriction restF = testSubject
            .getOWLObjectMaxCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14426);assertFalse(restE.equals(restF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeMaxCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qpdhub4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeMaxCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qpdhub4r(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14427);
        __CLR4_5_2adhadhlviclh9m.R.inc(14428);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14429);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14430);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14431);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14432);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMaxCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14433);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationMinCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wapewb4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationMinCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wapewb4y(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14434);
        __CLR4_5_2adhadhlviclh9m.R.inc(14435);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14436);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14437);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMinCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14438);assertNotNull(restA);
        __CLR4_5_2adhadhlviclh9m.R.inc(14439);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14440);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMinCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14441);assertNotNull(restB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveMinCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hsx129b56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveMinCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hsx129b56(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14442);
        __CLR4_5_2adhadhlviclh9m.R.inc(14443);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14444);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14445);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMinCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14446);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMinCardinality(cardinality, prop,
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14447);assertEquals(restA, restB);
        __CLR4_5_2adhadhlviclh9m.R.inc(14448);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14449);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectMinCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14450);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectMinCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14451);assertEquals(restC, restD);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeMinCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mfffabb5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeMinCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mfffabb5g(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14452);
        __CLR4_5_2adhadhlviclh9m.R.inc(14453);OWLObjectProperty prop = OP(IRI());
        // Different cardinality
        __CLR4_5_2adhadhlviclh9m.R.inc(14454);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMinCardinality(3, prop, testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14455);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMinCardinality(4, prop, testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14456);assertFalse(restA.equals(restB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14457);OWLObjectCardinalityRestriction restC = testSubject
            .getOWLObjectMinCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14458);OWLObjectCardinalityRestriction restD = testSubject
            .getOWLObjectMinCardinality(3, OP(IRI()),
                testSubject.getOWLThing());
        __CLR4_5_2adhadhlviclh9m.R.inc(14459);assertFalse(restC.equals(restD));
        // Different filler
        __CLR4_5_2adhadhlviclh9m.R.inc(14460);OWLObjectCardinalityRestriction restE = testSubject
            .getOWLObjectMinCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14461);OWLObjectCardinalityRestriction restF = testSubject
            .getOWLObjectMinCardinality(3, prop, C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14462);assertFalse(restE.equals(restF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeMinCard() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22oog9wb5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeMinCard",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22oog9wb5r(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14463);
        __CLR4_5_2adhadhlviclh9m.R.inc(14464);OWLObjectProperty prop = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14465);int cardinality = 3;
        __CLR4_5_2adhadhlviclh9m.R.inc(14466);OWLClassExpression cls = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14467);OWLObjectCardinalityRestriction restA = testSubject
            .getOWLObjectMinCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14468);OWLObjectCardinalityRestriction restB = testSubject
            .getOWLObjectMinCardinality(cardinality, prop, cls);
        __CLR4_5_2adhadhlviclh9m.R.inc(14469);assertEquals(restA.hashCode(), restB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDisjointClasses() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_258700wb5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_258700wb5y(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14470);
        __CLR4_5_2adhadhlviclh9m.R.inc(14471);OWLClassExpression[] classExpressions = { C(IRI()), C(IRI()), C(IRI()) };
        __CLR4_5_2adhadhlviclh9m.R.inc(14472);OWLObject obj = testSubject
            .getOWLDisjointClassesAxiom(classExpressions);
        __CLR4_5_2adhadhlviclh9m.R.inc(14473);assertNotNull(obj);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationNotDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xmvkkb62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationNotDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xmvkkb62(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14474);
        __CLR4_5_2adhadhlviclh9m.R.inc(14475);assertNotNull(testSubject.getOWLNegativeDataPropertyAssertionAxiom(
            DP(IRI()), I(), Literal()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveNotDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gdr0q5b64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveNotDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gdr0q5b64(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14476);
        __CLR4_5_2adhadhlviclh9m.R.inc(14477);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14478);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14479);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14480);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14481);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14482);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeNotDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmpsk7b6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeNotDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmpsk7b6b(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14483);
        // Different subject
        __CLR4_5_2adhadhlviclh9m.R.inc(14484);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14485);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14486);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14487);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14488);assertFalse(axA.equals(axB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14489);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14490);OWLIndividualAxiom axiomC = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(DP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14491);OWLIndividualAxiom axiomD = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(DP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14492);assertFalse(axiomC.equals(axiomD));
        // Different object
        __CLR4_5_2adhadhlviclh9m.R.inc(14493);OWLIndividualAxiom axiomE = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14494);OWLIndividualAxiom axiomF = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14495);assertFalse(axiomE.equals(axiomF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeNotDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ibef3kb6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeNotDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ibef3kb6o(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14496);
        __CLR4_5_2adhadhlviclh9m.R.inc(14497);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14498);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14499);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14500);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14501);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeDataPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14502);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j0bwl7b6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j0bwl7b6v(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14503);
        __CLR4_5_2adhadhlviclh9m.R.inc(14504);assertNotNull(testSubject.getOWLDataPropertyAssertionAxiom(DP(IRI()),
            I(), Literal()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qwy88kb6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qwy88kb6x(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14505);
        __CLR4_5_2adhadhlviclh9m.R.inc(14506);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14507);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14508);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14509);OWLIndividualAxiom axA = testSubject.getOWLDataPropertyAssertionAxiom(
            p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14510);OWLIndividualAxiom axB = testSubject.getOWLDataPropertyAssertionAxiom(
            p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14511);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dbe840b74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dbe840b74(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14512);
        // Different subject
        __CLR4_5_2adhadhlviclh9m.R.inc(14513);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14514);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14515);OWLIndividualAxiom axA = testSubject.getOWLDataPropertyAssertionAxiom(
            p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14516);OWLIndividualAxiom axB = testSubject.getOWLDataPropertyAssertionAxiom(
            p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14517);assertFalse(axA.equals(axB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14518);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14519);OWLIndividualAxiom axiomC = testSubject
            .getOWLDataPropertyAssertionAxiom(DP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14520);OWLIndividualAxiom axiomD = testSubject
            .getOWLDataPropertyAssertionAxiom(DP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14521);assertFalse(axiomC.equals(axiomD));
        // Different object
        __CLR4_5_2adhadhlviclh9m.R.inc(14522);OWLIndividualAxiom axiomE = testSubject
            .getOWLDataPropertyAssertionAxiom(p, s, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14523);OWLIndividualAxiom axiomF = testSubject
            .getOWLDataPropertyAssertionAxiom(p, s, Literal());
        __CLR4_5_2adhadhlviclh9m.R.inc(14524);assertFalse(axiomE.equals(axiomF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bspng7b7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bspng7b7h(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14525);
        __CLR4_5_2adhadhlviclh9m.R.inc(14526);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14527);OWLDataProperty p = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14528);OWLLiteral o = Literal();
        __CLR4_5_2adhadhlviclh9m.R.inc(14529);OWLIndividualAxiom axA = testSubject.getOWLDataPropertyAssertionAxiom(
            p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14530);OWLIndividualAxiom axB = testSubject.getOWLDataPropertyAssertionAxiom(
            p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14531);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationNotObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smarsxb7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationNotObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smarsxb7o(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14532);
        __CLR4_5_2adhadhlviclh9m.R.inc(14533);assertNotNull(testSubject.getOWLNegativeObjectPropertyAssertionAxiom(
            OP(IRI()), I(), I()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveNotObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ph1cpkb7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveNotObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ph1cpkb7q(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14534);
        __CLR4_5_2adhadhlviclh9m.R.inc(14535);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14536);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14537);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14538);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14539);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14540);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeNotObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvmxt8b7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeNotObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvmxt8b7x(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14541);
        // Different subject
        __CLR4_5_2adhadhlviclh9m.R.inc(14542);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14543);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14544);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14545);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14546);assertFalse(axA.equals(axB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14547);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14548);OWLIndividualAxiom axiomC = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(OP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14549);OWLIndividualAxiom axiomD = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(OP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14550);assertFalse(axiomC.equals(axiomD));
        // Different object
        __CLR4_5_2adhadhlviclh9m.R.inc(14551);OWLIndividualAxiom axiomE = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14552);OWLIndividualAxiom axiomF = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14553);assertFalse(axiomE.equals(axiomF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeNotObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fccjpb8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeNotObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fccjpb8a(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14554);
        __CLR4_5_2adhadhlviclh9m.R.inc(14555);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14556);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14557);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14558);OWLIndividualAxiom axA = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14559);OWLIndividualAxiom axB = testSubject
            .getOWLNegativeObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14560);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wn7qmob8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wn7qmob8h(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14561);
        __CLR4_5_2adhadhlviclh9m.R.inc(14562);assertNotNull(testSubject.getOWLObjectPropertyAssertionAxiom(OP(IRI()),
            I(), I()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u42tvtb8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14563,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u42tvtb8j(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14563);
        __CLR4_5_2adhadhlviclh9m.R.inc(14564);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14565);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14566);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14567);OWLIndividualAxiom axA = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14568);OWLIndividualAxiom axB = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14569);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284w9adb8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284w9adb8q(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14570);
        // Different subject
        __CLR4_5_2adhadhlviclh9m.R.inc(14571);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14572);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14573);OWLIndividualAxiom axA = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14574);OWLIndividualAxiom axB = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, I(), o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14575);assertFalse(axA.equals(axB));
        // Different property
        __CLR4_5_2adhadhlviclh9m.R.inc(14576);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14577);OWLIndividualAxiom axiomC = testSubject
            .getOWLObjectPropertyAssertionAxiom(OP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14578);OWLIndividualAxiom axiomD = testSubject
            .getOWLObjectPropertyAssertionAxiom(OP(IRI()), s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14579);assertFalse(axiomC.equals(axiomD));
        // Different object
        __CLR4_5_2adhadhlviclh9m.R.inc(14580);OWLIndividualAxiom axiomE = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14581);OWLIndividualAxiom axiomF = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14582);assertFalse(axiomE.equals(axiomF));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectRel() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pww8kb93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectRel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pww8kb93(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14583);
        __CLR4_5_2adhadhlviclh9m.R.inc(14584);OWLIndividual s = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14585);OWLObjectProperty p = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14586);OWLIndividual o = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14587);OWLIndividualAxiom axA = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14588);OWLIndividualAxiom axB = testSubject
            .getOWLObjectPropertyAssertionAxiom(p, s, o);
        __CLR4_5_2adhadhlviclh9m.R.inc(14589);assertEquals(axA.hashCode(), axB.hashCode());
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n9ujqzb9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n9ujqzb9a(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14590);
        __CLR4_5_2adhadhlviclh9m.R.inc(14591);assertNotNull(testSubject.getOWLDataPropertyDomainAxiom(DP(IRI()),
            C(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ygpecb9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ygpecb9c(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14592);
        __CLR4_5_2adhadhlviclh9m.R.inc(14593);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14594);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14595);OWLAxiom axA = testSubject.getOWLDataPropertyDomainAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14596);OWLAxiom axB = testSubject.getOWLDataPropertyDomainAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14597);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uj0e34b9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uj0e34b9i(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14598);
        __CLR4_5_2adhadhlviclh9m.R.inc(14599);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14600);OWLClass right = C(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14601);OWLAxiom axA = testSubject.getOWLDataPropertyDomainAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14602);OWLAxiom axB = testSubject.getOWLDataPropertyDomainAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14603);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14604);OWLAxiom axiomC = testSubject.getOWLDataPropertyDomainAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14605);OWLAxiom axiomD = testSubject.getOWLDataPropertyDomainAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14606);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2plftb9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2plftb9r(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14607);
        __CLR4_5_2adhadhlviclh9m.R.inc(14608);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14609);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14610);int hashCodeA = testSubject.getOWLDataPropertyDomainAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14611);int hashCodeB = testSubject.getOWLDataPropertyDomainAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14612);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationDataPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28bmo6sb9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28bmo6sb9x(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14613);
        __CLR4_5_2adhadhlviclh9m.R.inc(14614);assertNotNull(testSubject.getOWLDataPropertyRangeAxiom(DP(IRI()),
            D(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveDataPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lig1izb9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lig1izb9z(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14615);
        __CLR4_5_2adhadhlviclh9m.R.inc(14616);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14617);OWLDatatype right = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14618);OWLAxiom axA = testSubject.getOWLDataPropertyRangeAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14619);OWLAxiom axB = testSubject.getOWLDataPropertyRangeAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14620);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeDataPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ixsn7lba5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ixsn7lba5(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14621);
        __CLR4_5_2adhadhlviclh9m.R.inc(14622);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14623);OWLDatatype right = D(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14624);OWLAxiom axA = testSubject.getOWLDataPropertyRangeAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14625);OWLAxiom axB = testSubject.getOWLDataPropertyRangeAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14626);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14627);OWLAxiom axiomC = testSubject.getOWLDataPropertyRangeAxiom(left,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14628);OWLAxiom axiomD = testSubject.getOWLDataPropertyRangeAxiom(left,
            D(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14629);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeDataPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fcan2gbae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fcan2gbae(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14630);
        __CLR4_5_2adhadhlviclh9m.R.inc(14631);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14632);OWLDatatype right = D(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14633);int hashCodeA = testSubject.getOWLDataPropertyRangeAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14634);int hashCodeB = testSubject.getOWLDataPropertyRangeAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14635);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationSubDataPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4io98bak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationSubDataPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4io98bak(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14636);
        __CLR4_5_2adhadhlviclh9m.R.inc(14637);assertNotNull(testSubject.getOWLSubDataPropertyOfAxiom(DP(IRI()),
            DP(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveSubDataPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tps0dpbam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveSubDataPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tps0dpbam(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14638);
        __CLR4_5_2adhadhlviclh9m.R.inc(14639);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14640);OWLDataProperty right = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14641);OWLAxiom axA = testSubject.getOWLSubDataPropertyOfAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14642);OWLAxiom axB = testSubject.getOWLSubDataPropertyOfAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14643);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeSubDataPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v3cuvbas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeSubDataPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v3cuvbas(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14644);
        __CLR4_5_2adhadhlviclh9m.R.inc(14645);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14646);OWLDataProperty right = DP(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14647);OWLAxiom axA = testSubject.getOWLSubDataPropertyOfAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14648);OWLAxiom axB = testSubject.getOWLSubDataPropertyOfAxiom(DP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14649);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14650);OWLAxiom axiomC = testSubject.getOWLSubDataPropertyOfAxiom(left,
            DP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14651);OWLAxiom axiomD = testSubject.getOWLSubDataPropertyOfAxiom(left,
            DP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14652);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeSubDataPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gld00bb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeSubDataPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gld00bb1(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14653);
        __CLR4_5_2adhadhlviclh9m.R.inc(14654);OWLDataProperty left = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14655);OWLDataProperty right = DP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14656);int hashCodeA = testSubject.getOWLSubDataPropertyOfAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14657);int hashCodeB = testSubject.getOWLSubDataPropertyOfAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14658);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationClassAssertion() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24xljnibb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24xljnibb7(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14659);
        __CLR4_5_2adhadhlviclh9m.R.inc(14660);assertNotNull(testSubject.getOWLClassAssertionAxiom(C(IRI()), I()));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveClassAssertion() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ghd8h1bb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ghd8h1bb9(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14661);
        __CLR4_5_2adhadhlviclh9m.R.inc(14662);OWLIndividual left = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14663);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14664);OWLAxiom axA = testSubject.getOWLClassAssertionAxiom(right, left);
        __CLR4_5_2adhadhlviclh9m.R.inc(14665);OWLAxiom axB = testSubject.getOWLClassAssertionAxiom(right, left);
        __CLR4_5_2adhadhlviclh9m.R.inc(14666);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeClassAssertion() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tt5nrrbbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tt5nrrbbf(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14667);
        __CLR4_5_2adhadhlviclh9m.R.inc(14668);OWLIndividual left = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14669);OWLClass right = C(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14670);OWLAxiom axA = testSubject.getOWLClassAssertionAxiom(right, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14671);OWLAxiom axB = testSubject.getOWLClassAssertionAxiom(right, I());
        __CLR4_5_2adhadhlviclh9m.R.inc(14672);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14673);OWLAxiom axiomC = testSubject.getOWLClassAssertionAxiom(C(IRI()), left);
        __CLR4_5_2adhadhlviclh9m.R.inc(14674);OWLAxiom axiomD = testSubject.getOWLClassAssertionAxiom(C(IRI()), left);
        __CLR4_5_2adhadhlviclh9m.R.inc(14675);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeClassAssertion() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dhj8xqbbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dhj8xqbbo(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14676);
        __CLR4_5_2adhadhlviclh9m.R.inc(14677);OWLIndividual left = I();
        __CLR4_5_2adhadhlviclh9m.R.inc(14678);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14679);int hashCodeA = testSubject.getOWLClassAssertionAxiom(right, left)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14680);int hashCodeB = testSubject.getOWLClassAssertionAxiom(right, left)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14681);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24twxo0bbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24twxo0bbu(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14682);
        __CLR4_5_2adhadhlviclh9m.R.inc(14683);assertNotNull(testSubject.getOWLObjectPropertyDomainAxiom(OP(IRI()),
            C(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eu9fhzbbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eu9fhzbbw(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14684);
        __CLR4_5_2adhadhlviclh9m.R.inc(14685);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14686);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14687);OWLAxiom axA = testSubject.getOWLObjectPropertyDomainAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14688);OWLAxiom axB = testSubject.getOWLObjectPropertyDomainAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14689);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fdue4lbc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fdue4lbc2(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14690);
        __CLR4_5_2adhadhlviclh9m.R.inc(14691);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14692);OWLClass right = C(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14693);OWLAxiom axA = testSubject.getOWLObjectPropertyDomainAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14694);OWLAxiom axB = testSubject.getOWLObjectPropertyDomainAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14695);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14696);OWLAxiom axiomC = testSubject.getOWLObjectPropertyDomainAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14697);OWLAxiom axiomD = testSubject.getOWLObjectPropertyDomainAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14698);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectPropertyDomain() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25bca1gbcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25bca1gbcb(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14699);
        __CLR4_5_2adhadhlviclh9m.R.inc(14700);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14701);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14702);int hashCodeA = testSubject
            .getOWLObjectPropertyDomainAxiom(left, right).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14703);int hashCodeB = testSubject
            .getOWLObjectPropertyDomainAxiom(left, right).hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14704);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationObjectPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocm1sxbch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocm1sxbch(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14705);
        __CLR4_5_2adhadhlviclh9m.R.inc(14706);assertNotNull(testSubject.getOWLObjectPropertyRangeAxiom(OP(IRI()),
            C(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveObjectPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273d946bcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273d946bcj(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14707);
        __CLR4_5_2adhadhlviclh9m.R.inc(14708);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14709);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14710);OWLAxiom axA = testSubject.getOWLObjectPropertyRangeAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14711);OWLAxiom axB = testSubject.getOWLObjectPropertyRangeAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14712);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeObjectPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cjx39ybcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cjx39ybcp(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14713);
        __CLR4_5_2adhadhlviclh9m.R.inc(14714);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14715);OWLClass right = C(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14716);OWLAxiom axA = testSubject.getOWLObjectPropertyRangeAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14717);OWLAxiom axB = testSubject.getOWLObjectPropertyRangeAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14718);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14719);OWLAxiom axiomC = testSubject.getOWLObjectPropertyRangeAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14720);OWLAxiom axiomD = testSubject.getOWLObjectPropertyRangeAxiom(left,
            C(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14721);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeObjectPropertyRange() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ywa337bcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ywa337bcy(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14722);
        __CLR4_5_2adhadhlviclh9m.R.inc(14723);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14724);OWLClass right = C(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14725);int hashCodeA = testSubject.getOWLObjectPropertyRangeAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14726);int hashCodeB = testSubject.getOWLObjectPropertyRangeAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14727);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testCreationSubObjectPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25a9kchbd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testCreationSubObjectPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25a9kchbd4(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14728);
        __CLR4_5_2adhadhlviclh9m.R.inc(14729);assertNotNull(testSubject.getOWLSubObjectPropertyOfAxiom(OP(IRI()),
            OP(IRI())));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsPositiveSubObjectPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yav6pkbd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsPositiveSubObjectPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yav6pkbd6(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14730);
        __CLR4_5_2adhadhlviclh9m.R.inc(14731);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14732);OWLObjectProperty right = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14733);OWLAxiom axA = testSubject.getOWLSubObjectPropertyOfAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14734);OWLAxiom axB = testSubject.getOWLSubObjectPropertyOfAxiom(left, right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14735);assertEquals(axA, axB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testEqualsNegativeSubObjectPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h2yivgbdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testEqualsNegativeSubObjectPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h2yivgbdc(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14736);
        __CLR4_5_2adhadhlviclh9m.R.inc(14737);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14738);OWLObjectProperty right = OP(IRI());
        // Different left operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14739);OWLAxiom axA = testSubject.getOWLSubObjectPropertyOfAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14740);OWLAxiom axB = testSubject.getOWLSubObjectPropertyOfAxiom(OP(IRI()),
            right);
        __CLR4_5_2adhadhlviclh9m.R.inc(14741);assertFalse(axA.equals(axB));
        // Different right operand
        __CLR4_5_2adhadhlviclh9m.R.inc(14742);OWLAxiom axiomC = testSubject.getOWLSubObjectPropertyOfAxiom(left,
            OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14743);OWLAxiom axiomD = testSubject.getOWLSubObjectPropertyOfAxiom(left,
            OP(IRI()));
        __CLR4_5_2adhadhlviclh9m.R.inc(14744);assertFalse(axiomC.equals(axiomD));
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}

    @Test
    public void testHashCodeSubObjectPropertyOf() {__CLR4_5_2adhadhlviclh9m.R.globalSliceStart(getClass().getName(),14745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26hycqjbdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2adhadhlviclh9m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2adhadhlviclh9m.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.datafactory.OWLDataFactoryTestCase.testHashCodeSubObjectPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26hycqjbdl(){try{__CLR4_5_2adhadhlviclh9m.R.inc(14745);
        __CLR4_5_2adhadhlviclh9m.R.inc(14746);OWLObjectProperty left = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14747);OWLObjectProperty right = OP(IRI());
        __CLR4_5_2adhadhlviclh9m.R.inc(14748);int hashCodeA = testSubject.getOWLSubObjectPropertyOfAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14749);int hashCodeB = testSubject.getOWLSubObjectPropertyOfAxiom(left, right)
            .hashCode();
        __CLR4_5_2adhadhlviclh9m.R.inc(14750);assertEquals(hashCodeA, hashCodeB);
    }finally{__CLR4_5_2adhadhlviclh9m.R.flushNeeded();}}
}
