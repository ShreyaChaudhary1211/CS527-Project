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
package org.semanticweb.owlapitools.builders.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapitools.builders.*;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

@SuppressWarnings({ "javadoc", })
public class BuildersEqualTestCase {static class __CLR4_5_2ueuelvicn1uh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0066\u0069\u0078\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237320442L,8589935092L,1516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLDataFactory df = new OWLDataFactoryImpl();
    @Nonnull
    private final OWLAnnotationProperty ap = df.getOWLAnnotationProperty(IRI.create("urn:test#ann"));
    @Nonnull
    private final OWLObjectProperty op = df.getOWLObjectProperty(IRI.create("urn:test#op"));
    @Nonnull
    private final OWLDataProperty dp = df.getOWLDataProperty(IRI.create("urn:test#dp"));
    @Nonnull
    private final OWLLiteral lit = df.getOWLLiteral(false);
    @Nonnull
    private final IRI iri = IRI.create("urn:test#iri");
    @Nonnull
    private final Set<OWLAnnotation> annotations = new HashSet<>(Arrays.asList(df.getOWLAnnotation(ap, df.getOWLLiteral(
        "test"))));
    @Nonnull
    private final OWLClass ce = df.getOWLClass(IRI.create("urn:test#c"));
    @Nonnull
    private final OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("urn:test#i"));
    @Nonnull
    private final OWLDatatype d = df.getBooleanOWLDatatype();
    @Nonnull
    private final Set<OWLDataProperty> dps = new HashSet<>(Arrays.asList(df.getOWLDataProperty(iri), dp));
    @Nonnull
    private final Set<OWLObjectProperty> ops = new HashSet<>(Arrays.asList(df.getOWLObjectProperty(iri), op));
    @Nonnull
    private final Set<OWLClass> classes = new HashSet<>(Arrays.asList(df.getOWLClass(iri), ce));
    @Nonnull
    private final Set<OWLNamedIndividual> inds = new HashSet<>(Arrays.asList(i, df.getOWLNamedIndividual(iri)));
    @Nonnull
    private final SWRLDArgument var1 = df.getSWRLVariable(IRI.create("var1"));
    @Nonnull
    private final SWRLIArgument var2 = df.getSWRLVariable(IRI.create("var2"));
    @Nonnull
    private final SWRLAtom v1 = df.getSWRLBuiltInAtom(IRI.create("v1"), Arrays.asList((SWRLDArgument) df
        .getSWRLVariable(IRI.create("var3")), df.getSWRLVariable(IRI.create("var4"))));
    @Nonnull
    private final SWRLAtom v2 = df.getSWRLBuiltInAtom(IRI.create("v2"), Arrays.asList((SWRLDArgument) df
        .getSWRLVariable(IRI.create("var5")), df.getSWRLVariable(IRI.create("var6"))));
    @Nonnull
    private final Set<SWRLAtom> body = new HashSet<>(Arrays.asList(v1));
    @Nonnull
    private final Set<SWRLAtom> head = new HashSet<>(Arrays.asList(v2));

    @Test
    public void shouldBuildAnnotation() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dwnptue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dwnptue(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1094);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1095);OWLAnnotation expected = df.getOWLAnnotation(ap, lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1096);BuilderAnnotation builder = new BuilderAnnotation(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1097);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1098);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qoy25buj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnnotationAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qoy25buj(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1099);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1100);OWLAnnotationAssertionAxiom expected = df.getOWLAnnotationAssertionAxiom(ap, iri, lit, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1101);BuilderAnnotationAssertion builder = new BuilderAnnotationAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1102);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1103);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vc1kdiuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vc1kdiuo(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1104);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1105);OWLAnnotationProperty expected = df.getOWLAnnotationProperty(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1106);BuilderAnnotationProperty builder = new BuilderAnnotationProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1107);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1108);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyDomain() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pp2jquut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnnotationPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pp2jquut(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1109);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1110);OWLAnnotationPropertyDomainAxiom expected = df.getOWLAnnotationPropertyDomainAxiom(ap, iri, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1111);BuilderAnnotationPropertyDomain builder = new BuilderAnnotationPropertyDomain(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1112);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1113);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyRange() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24poc8ruy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnnotationPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24poc8ruy(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1114);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1115);OWLAnnotationPropertyRangeAxiom expected = df.getOWLAnnotationPropertyRangeAxiom(ap, iri, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1116);BuilderAnnotationPropertyRange builder = new BuilderAnnotationPropertyRange(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1117);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1118);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAnonymousIndividual() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0i2c2v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAnonymousIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0i2c2v3(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1119);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1120);OWLAnonymousIndividual expected = df.getOWLAnonymousIndividual("id");
        __CLR4_5_2ueuelvicn1uh.R.inc(1121);BuilderAnonymousIndividual builder = new BuilderAnonymousIndividual(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1122);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1123);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildAsymmetricObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ld4acv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildAsymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ld4acv8(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1124);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1125);OWLAsymmetricObjectPropertyAxiom expected = df.getOWLAsymmetricObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1126);BuilderAsymmetricObjectProperty builder = new BuilderAsymmetricObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1127);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1128);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildClass() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zhw7l0vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zhw7l0vd(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1129);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1130);OWLClass expected = df.getOWLClass(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1131);BuilderClass builder = new BuilderClass(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1132);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1133);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildClassAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmto5wvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmto5wvi(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1134);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1135);OWLClassAssertionAxiom expected = df.getOWLClassAssertionAxiom(ce, i, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1136);BuilderClassAssertion builder = new BuilderClassAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1137);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1138);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildComplementOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m50nwfvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m50nwfvn(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1139);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1140);OWLObjectComplementOf expected = df.getOWLObjectComplementOf(ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1141);BuilderComplementOf builder = new BuilderComplementOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1142);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1143);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataAllValuesFrom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2er0h01vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2er0h01vs(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1144);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1145);OWLDataAllValuesFrom expected = df.getOWLDataAllValuesFrom(dp, d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1146);BuilderDataAllValuesFrom builder = new BuilderDataAllValuesFrom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1147);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1148);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataComplementOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkornbvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkornbvx(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1149);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1150);OWLDataComplementOf expected = df.getOWLDataComplementOf(d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1151);BuilderDataComplementOf builder = new BuilderDataComplementOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1152);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1153);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataExactCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlqenvw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataExactCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlqenvw2(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1154);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1155);OWLDataExactCardinality expected = df.getOWLDataExactCardinality(1, dp, d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1156);BuilderDataExactCardinality builder = new BuilderDataExactCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1157);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1158);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataHasValue() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21swm1vw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataHasValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21swm1vw7(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1159);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1160);OWLDataHasValue expected = df.getOWLDataHasValue(dp, lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1161);BuilderDataHasValue builder = new BuilderDataHasValue(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1162);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1163);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataIntersectionOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21letccwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21letccwc(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1164);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1165);OWLDataIntersectionOf expected = df.getOWLDataIntersectionOf(d, df.getFloatOWLDatatype());
        __CLR4_5_2ueuelvicn1uh.R.inc(1166);BuilderDataIntersectionOf builder = new BuilderDataIntersectionOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1167);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1168);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataMaxCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cd78rawh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cd78rawh(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1169);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1170);OWLDataMaxCardinality expected = df.getOWLDataMaxCardinality(1, dp, d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1171);BuilderDataMaxCardinality builder = new BuilderDataMaxCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1172);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1173);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataMinCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wubtbcwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wubtbcwm(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1174);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1175);OWLDataMinCardinality expected = df.getOWLDataMinCardinality(1, dp, d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1176);BuilderDataMinCardinality builder = new BuilderDataMinCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1177);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1178);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataOneOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx080xwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx080xwr(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1179);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1180);OWLDataOneOf expected = df.getOWLDataOneOf(lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1181);BuilderDataOneOf builder = new BuilderDataOneOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1182);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1183);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tv9x6nww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tv9x6nww(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1184);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1185);OWLDataProperty expected = df.getOWLDataProperty(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1186);BuilderDataProperty builder = new BuilderDataProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1187);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1188);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p617ipx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p617ipx1(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1189);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1190);OWLDataPropertyAssertionAxiom expected = df.getOWLDataPropertyAssertionAxiom(dp, i, lit, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1191);BuilderDataPropertyAssertion builder = new BuilderDataPropertyAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1192);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1193);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyDomain() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0cyhxx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0cyhxx6(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1194);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1195);OWLDataPropertyDomainAxiom expected = df.getOWLDataPropertyDomainAxiom(dp, ce, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1196);BuilderDataPropertyDomain builder = new BuilderDataPropertyDomain(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1197);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1198);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyRange() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jsx7kaxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jsx7kaxb(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1199);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1200);OWLDataPropertyRangeAxiom expected = df.getOWLDataPropertyRangeAxiom(dp, d, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1201);BuilderDataPropertyRange builder = new BuilderDataPropertyRange(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1202);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1203);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataSomeValuesFrom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1gmh8xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1gmh8xg(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1204);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1205);OWLDataSomeValuesFrom expected = df.getOWLDataSomeValuesFrom(dp, d);
        __CLR4_5_2ueuelvicn1uh.R.inc(1206);BuilderDataSomeValuesFrom builder = new BuilderDataSomeValuesFrom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1207);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1208);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatype() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eueexmxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eueexmxl(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1209);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1210);OWLDatatype expected = df.getOWLDatatype(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1211);BuilderDatatype builder = new BuilderDatatype(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1212);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1213);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatypeDefinition() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uq6aexxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDatatypeDefinition",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uq6aexxq(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1214);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1215);OWLDatatypeDefinitionAxiom expected = df.getOWLDatatypeDefinitionAxiom(d, df.getDoubleOWLDatatype(),
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1216);BuilderDatatypeDefinition builder = new BuilderDatatypeDefinition(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1217);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1218);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatypeRestriction() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x65wmsxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDatatypeRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x65wmsxv(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1219);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1220);OWLFacetRestriction r = df.getOWLFacetRestriction(OWLFacet.MAX_LENGTH, lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1221);OWLDatatypeRestriction expected = df.getOWLDatatypeRestriction(d, r);
        __CLR4_5_2ueuelvicn1uh.R.inc(1222);BuilderDatatypeRestriction builder = new BuilderDatatypeRestriction(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1223);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1224);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDataUnionOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23dors8y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDataUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23dors8y1(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1225);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1226);OWLDataUnionOf expected = df.getOWLDataUnionOf(d, df.getDoubleOWLDatatype());
        __CLR4_5_2ueuelvicn1uh.R.inc(1227);BuilderDataUnionOf builder = new BuilderDataUnionOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1228);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1229);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDeclaration() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hv9316y6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDeclaration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hv9316y6(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1230);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1231);OWLDeclarationAxiom expected = df.getOWLDeclarationAxiom(ce, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1232);BuilderDeclaration builder = new BuilderDeclaration(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1233);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1234);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDifferentIndividuals() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5k2jnyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDifferentIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5k2jnyb(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1235);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1236);OWLDifferentIndividualsAxiom expected = df.getOWLDifferentIndividualsAxiom(i, df.getOWLNamedIndividual(iri));
        __CLR4_5_2ueuelvicn1uh.R.inc(1237);BuilderDifferentIndividuals builder = new BuilderDifferentIndividuals(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1238);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1239);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointClasses() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eapjxyyg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eapjxyyg(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1240);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1241);OWLDisjointClassesAxiom expected = df.getOWLDisjointClassesAxiom(ce, df.getOWLClass(iri));
        __CLR4_5_2ueuelvicn1uh.R.inc(1242);BuilderDisjointClasses builder = new BuilderDisjointClasses(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1243);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1244);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointDataProperties() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qowp1yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qowp1yl(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1245);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1246);OWLDisjointDataPropertiesAxiom expected = df.getOWLDisjointDataPropertiesAxiom(dps, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1247);BuilderDisjointDataProperties builder = new BuilderDisjointDataProperties(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1248);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1249);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointObjectProperties() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybx4swyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybx4swyq(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1250);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1251);OWLDisjointObjectPropertiesAxiom expected = df.getOWLDisjointObjectPropertiesAxiom(ops, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1252);BuilderDisjointObjectProperties builder = new BuilderDisjointObjectProperties(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1253);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1254);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointUnion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kgvzzyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildDisjointUnion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kgvzzyv(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1255);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1256);OWLDisjointUnionAxiom expected = df.getOWLDisjointUnionAxiom(ce, classes, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1257);BuilderDisjointUnion builder = new BuilderDisjointUnion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1258);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1259);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildEntity() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kz397z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildEntity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kz397z0(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1260);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1261);OWLClass expected = df.getOWLClass(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1262);BuilderEntity builder = new BuilderEntity(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1263);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1264);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentClasses() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21w75iwz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21w75iwz5(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1265);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1266);OWLEquivalentClassesAxiom expected = df.getOWLEquivalentClassesAxiom(classes, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1267);BuilderEquivalentClasses builder = new BuilderEquivalentClasses(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1268);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1269);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentDataProperties() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2llhandza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2llhandza(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1270);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1271);OWLEquivalentDataPropertiesAxiom expected = df.getOWLEquivalentDataPropertiesAxiom(dps, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1272);BuilderEquivalentDataProperties builder = new BuilderEquivalentDataProperties(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1273);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1274);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentObjectProperties() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekd4yqzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekd4yqzf(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1275);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1276);OWLEquivalentObjectPropertiesAxiom expected = df.getOWLEquivalentObjectPropertiesAxiom(ops, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1277);BuilderEquivalentObjectProperties builder = new BuilderEquivalentObjectProperties(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1278);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1279);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildFacetRestriction() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284ak53zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildFacetRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284ak53zk(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1280);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1281);OWLFacetRestriction expected = df.getOWLFacetRestriction(OWLFacet.MAX_EXCLUSIVE, lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1282);BuilderFacetRestriction builder = new BuilderFacetRestriction(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1283);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1284);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalDataProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hy74n8zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildFunctionalDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hy74n8zp(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1285);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1286);OWLFunctionalDataPropertyAxiom expected = df.getOWLFunctionalDataPropertyAxiom(dp, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1287);BuilderFunctionalDataProperty builder = new BuilderFunctionalDataProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1288);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1289);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejrjnrzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejrjnrzu(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1290);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1291);OWLFunctionalObjectPropertyAxiom expected = df.getOWLFunctionalObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1292);BuilderFunctionalObjectProperty builder = new BuilderFunctionalObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1293);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1294);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildHasKey() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29eoq2hzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildHasKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29eoq2hzz(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1295);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1296);OWLHasKeyAxiom expected = df.getOWLHasKeyAxiom(ce, ops, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1297);BuilderHasKey builder = new BuilderHasKey(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1298);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1299);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildImportsDeclarationProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nav1s3104();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildImportsDeclarationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nav1s3104(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1300);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1301);OWLImportsDeclaration expected = df.getOWLImportsDeclaration(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1302);BuilderImportsDeclaration builder = new BuilderImportsDeclaration(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1303);OWLImportsDeclaration built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1304);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseFunctionalObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuof65109();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildInverseFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuof65109(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1305);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1306);OWLInverseFunctionalObjectPropertyAxiom expected = df.getOWLInverseFunctionalObjectPropertyAxiom(op,
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1307);BuilderInverseFunctionalObjectProperty builder = new BuilderInverseFunctionalObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1308);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1309);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseObjectProperties() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21tqr2m10e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildInverseObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21tqr2m10e(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1310);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1311);OWLInverseObjectPropertiesAxiom expected = df.getOWLInverseObjectPropertiesAxiom(op, op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1312);BuilderInverseObjectProperties builder = new BuilderInverseObjectProperties(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1313);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1314);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildIrreflexiveObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jmd1z710j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildIrreflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jmd1z710j(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1315);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1316);OWLIrreflexiveObjectPropertyAxiom expected = df.getOWLIrreflexiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1317);BuilderIrreflexiveObjectProperty builder = new BuilderIrreflexiveObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1318);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1319);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildLiteral() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2juy06z10o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2juy06z10o(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1320);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1321);OWLLiteral expected = df.getOWLLiteral(true);
        __CLR4_5_2ueuelvicn1uh.R.inc(1322);BuilderLiteral builder = new BuilderLiteral(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1323);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1324);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildNamedIndividual() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p1q67610t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p1q67610t(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1325);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1326);OWLNamedIndividual expected = df.getOWLNamedIndividual(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1327);BuilderNamedIndividual builder = new BuilderNamedIndividual(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1328);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1329);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeDataPropertyAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22bs1d210y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildNegativeDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22bs1d210y(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1330);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1331);OWLNegativeDataPropertyAssertionAxiom expected = df.getOWLNegativeDataPropertyAssertionAxiom(dp, i, lit,
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1332);BuilderNegativeDataPropertyAssertion builder = new BuilderNegativeDataPropertyAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1333);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1334);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeObjectPropertyAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kk0og5113();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildNegativeObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kk0og5113(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1335);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1336);OWLNegativeObjectPropertyAssertionAxiom expected = df.getOWLNegativeObjectPropertyAssertionAxiom(op, i, i,
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1337);BuilderNegativeObjectPropertyAssertion builder = new BuilderNegativeObjectPropertyAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1338);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1339);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectAllValuesFrom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yyf0t6118();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yyf0t6118(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1340);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1341);OWLObjectAllValuesFrom expected = df.getOWLObjectAllValuesFrom(op, ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1342);BuilderObjectAllValuesFrom builder = new BuilderObjectAllValuesFrom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1343);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1344);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectExactCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2td5gcw11d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectExactCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2td5gcw11d(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1345);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1346);OWLObjectExactCardinality expected = df.getOWLObjectExactCardinality(1, op, ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1347);BuilderObjectExactCardinality builder = new BuilderObjectExactCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1348);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1349);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectHasSelf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vw75911i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vw75911i(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1350);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1351);OWLObjectHasSelf expected = df.getOWLObjectHasSelf(op);
        __CLR4_5_2ueuelvicn1uh.R.inc(1352);BuilderObjectHasSelf builder = new BuilderObjectHasSelf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1353);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1354);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectHasValue() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kc4nh411n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectHasValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kc4nh411n(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1355);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1356);OWLObjectHasValue expected = df.getOWLObjectHasValue(op, i);
        __CLR4_5_2ueuelvicn1uh.R.inc(1357);BuilderObjectHasValue builder = new BuilderObjectHasValue(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1358);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1359);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectIntersectionOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k6q1z311s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k6q1z311s(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1360);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1361);OWLObjectIntersectionOf expected = df.getOWLObjectIntersectionOf(classes);
        __CLR4_5_2ueuelvicn1uh.R.inc(1362);BuilderObjectIntersectionOf builder = new BuilderObjectIntersectionOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1363);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1364);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectInverseOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bc1wa411x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectInverseOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bc1wa411x(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1365);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1366);OWLObjectInverseOf expected = df.getOWLObjectInverseOf(op);
        __CLR4_5_2ueuelvicn1uh.R.inc(1367);BuilderObjectInverseOf builder = new BuilderObjectInverseOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1368);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1369);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectMaxCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29exmk5122();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29exmk5122(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1370);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1371);OWLObjectMaxCardinality expected = df.getOWLObjectMaxCardinality(1, op, ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1372);BuilderObjectMaxCardinality builder = new BuilderObjectMaxCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1373);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1374);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectMinCardinality() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b26xzx127();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b26xzx127(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1375);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1376);OWLObjectMinCardinality expected = df.getOWLObjectMinCardinality(1, op, ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1377);BuilderObjectMinCardinality builder = new BuilderObjectMinCardinality(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1378);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1379);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bc1vre12c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bc1vre12c(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1380);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1381);OWLObjectProperty expected = df.getOWLObjectProperty(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1382);BuilderObjectProperty builder = new BuilderObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1383);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1384);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyAssertion() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jh0aai12h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jh0aai12h(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1385);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1386);OWLObjectPropertyAssertionAxiom expected = df.getOWLObjectPropertyAssertionAxiom(op, i, i, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1387);BuilderObjectPropertyAssertion builder = new BuilderObjectPropertyAssertion(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1388);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1389);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyDomain() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228836i12m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1390,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228836i12m(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1390);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1391);OWLObjectPropertyDomainAxiom expected = df.getOWLObjectPropertyDomainAxiom(op, ce, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1392);BuilderObjectPropertyDomain builder = new BuilderObjectPropertyDomain(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1393);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1394);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyRange() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ircln12r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ircln12r(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1395);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1396);OWLObjectPropertyRangeAxiom expected = df.getOWLObjectPropertyRangeAxiom(op, ce, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1397);BuilderObjectPropertyRange builder = new BuilderObjectPropertyRange(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1398);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1399);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectSomeValuesFrom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289br5t12w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildObjectSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289br5t12w(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1400);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1401);OWLObjectSomeValuesFrom expected = df.getOWLObjectSomeValuesFrom(op, ce);
        __CLR4_5_2ueuelvicn1uh.R.inc(1402);BuilderObjectSomeValuesFrom builder = new BuilderObjectSomeValuesFrom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1403);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1404);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildOneOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jbhwrt131();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jbhwrt131(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1405);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1406);OWLObjectOneOf expected = df.getOWLObjectOneOf(i);
        __CLR4_5_2ueuelvicn1uh.R.inc(1407);BuilderOneOf builder = new BuilderOneOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1408);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1409);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildPropertyChain() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab7cyg136();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildPropertyChain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab7cyg136(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1410);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1411);List<OWLObjectProperty> chain = new ArrayList<>(ops);
        __CLR4_5_2ueuelvicn1uh.R.inc(1412);OWLSubPropertyChainOfAxiom expected = df.getOWLSubPropertyChainOfAxiom(chain, op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1413);BuilderPropertyChain builder = new BuilderPropertyChain(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1414);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1415);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildReflexiveObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkvo3013c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildReflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkvo3013c(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1416);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1417);OWLReflexiveObjectPropertyAxiom expected = df.getOWLReflexiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1418);BuilderReflexiveObjectProperty builder = new BuilderReflexiveObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1419);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1420);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSameIndividual() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4914x13h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4914x13h(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1421);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1422);OWLSameIndividualAxiom expected = df.getOWLSameIndividualAxiom(inds, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1423);BuilderSameIndividual builder = new BuilderSameIndividual(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1424);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1425);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSubAnnotationPropertyOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hahb5z13m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSubAnnotationPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hahb5z13m(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1426);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1427);OWLSubAnnotationPropertyOfAxiom expected = df.getOWLSubAnnotationPropertyOfAxiom(ap, df.getRDFSLabel(),
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1428);BuilderSubAnnotationPropertyOf builder = new BuilderSubAnnotationPropertyOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1429);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1430);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSubClass() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l9clne13r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSubClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l9clne13r(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1431);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1432);OWLSubClassOfAxiom expected = df.getOWLSubClassOfAxiom(ce, df.getOWLThing(), annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1433);BuilderSubClass builder = new BuilderSubClass(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1434);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1435);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSubDataProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bee79113w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSubDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bee79113w(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1436);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1437);OWLSubDataPropertyOfAxiom expected = df.getOWLSubDataPropertyOfAxiom(dp, df.getOWLTopDataProperty());
        __CLR4_5_2ueuelvicn1uh.R.inc(1438);BuilderSubDataProperty builder = new BuilderSubDataProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1439);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1440);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSubObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kfgbcw141();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSubObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kfgbcw141(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1441);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1442);OWLSubObjectPropertyOfAxiom expected = df.getOWLSubObjectPropertyOfAxiom(op, df.getOWLTopObjectProperty(),
            annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1443);BuilderSubObjectProperty builder = new BuilderSubObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1444);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1445);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLBuiltInAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1zgi146();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLBuiltInAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1zgi146(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1446);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1447);SWRLBuiltInAtom expected = df.getSWRLBuiltInAtom(iri, Arrays.asList(var1));
        __CLR4_5_2ueuelvicn1uh.R.inc(1448);BuilderSWRLBuiltInAtom builder = new BuilderSWRLBuiltInAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1449);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1450);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLClassAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2feql4914b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLClassAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2feql4914b(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1451);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1452);SWRLClassAtom expected = df.getSWRLClassAtom(ce, var2);
        __CLR4_5_2ueuelvicn1uh.R.inc(1453);BuilderSWRLClassAtom builder = new BuilderSWRLClassAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1454);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1455);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDataPropertyAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbhwgg14g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLDataPropertyAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbhwgg14g(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1456);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1457);SWRLDataPropertyAtom expected = df.getSWRLDataPropertyAtom(dp, var2, var1);
        __CLR4_5_2ueuelvicn1uh.R.inc(1458);BuilderSWRLDataPropertyAtom builder = new BuilderSWRLDataPropertyAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1459);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1460);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDataRangeAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ltyhzi14l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLDataRangeAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ltyhzi14l(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1461);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1462);SWRLDataRangeAtom expected = df.getSWRLDataRangeAtom(d, var1);
        __CLR4_5_2ueuelvicn1uh.R.inc(1463);BuilderSWRLDataRangeAtom builder = new BuilderSWRLDataRangeAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1464);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1465);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDifferentIndividualsAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2041a14q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLDifferentIndividualsAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2041a14q(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1466);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1467);SWRLDifferentIndividualsAtom expected = df.getSWRLDifferentIndividualsAtom(var2, var2);
        __CLR4_5_2ueuelvicn1uh.R.inc(1468);BuilderSWRLDifferentIndividualsAtom builder = new BuilderSWRLDifferentIndividualsAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1469);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1470);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLIndividualArgument() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4mxm214v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLIndividualArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4mxm214v(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1471);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1472);SWRLIndividualArgument expected = df.getSWRLIndividualArgument(i);
        __CLR4_5_2ueuelvicn1uh.R.inc(1473);BuilderSWRLIndividualArgument builder = new BuilderSWRLIndividualArgument(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1474);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1475);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLLiteralArgument() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2a1ye150();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLLiteralArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2a1ye150(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1476);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1477);SWRLLiteralArgument expected = df.getSWRLLiteralArgument(lit);
        __CLR4_5_2ueuelvicn1uh.R.inc(1478);BuilderSWRLLiteralArgument builder = new BuilderSWRLLiteralArgument(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1479);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1480);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLObjectPropertyAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xfq0md155();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLObjectPropertyAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xfq0md155(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1481);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1482);SWRLObjectPropertyAtom expected = df.getSWRLObjectPropertyAtom(op, var2, var2);
        __CLR4_5_2ueuelvicn1uh.R.inc(1483);BuilderSWRLObjectPropertyAtom builder = new BuilderSWRLObjectPropertyAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1484);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1485);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLRule() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wtypr015a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLRule",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wtypr015a(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1486);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1487);SWRLRule expected = df.getSWRLRule(body, head);
        __CLR4_5_2ueuelvicn1uh.R.inc(1488);BuilderSWRLRule builder = new BuilderSWRLRule(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1489);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1490);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLSameIndividualAtom() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vfe9tc15f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLSameIndividualAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vfe9tc15f(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1491);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1492);SWRLSameIndividualAtom expected = df.getSWRLSameIndividualAtom(df.getSWRLIndividualArgument(i), df
            .getSWRLIndividualArgument(i));
        __CLR4_5_2ueuelvicn1uh.R.inc(1493);BuilderSWRLSameIndividualAtom builder = new BuilderSWRLSameIndividualAtom(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1494);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1495);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLVariable() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjzjz015k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSWRLVariable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjzjz015k(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1496);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1497);SWRLVariable expected = df.getSWRLVariable(iri);
        __CLR4_5_2ueuelvicn1uh.R.inc(1498);BuilderSWRLVariable builder = new BuilderSWRLVariable(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1499);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1500);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildSymmetricObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rf89sn15p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildSymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rf89sn15p(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1501);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1502);OWLSymmetricObjectPropertyAxiom expected = df.getOWLSymmetricObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1503);BuilderSymmetricObjectProperty builder = new BuilderSymmetricObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1504);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1505);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildTransitiveObjectProperty() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nn60v915u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildTransitiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nn60v915u(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1506);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1507);OWLTransitiveObjectPropertyAxiom expected = df.getOWLTransitiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2ueuelvicn1uh.R.inc(1508);BuilderTransitiveObjectProperty builder = new BuilderTransitiveObjectProperty(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1509);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1510);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}

    @Test
    public void shouldBuildUnionOf() {__CLR4_5_2ueuelvicn1uh.R.globalSliceStart(getClass().getName(),1511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l4ncaa15z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ueuelvicn1uh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ueuelvicn1uh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersEqualTestCase.shouldBuildUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l4ncaa15z(){try{__CLR4_5_2ueuelvicn1uh.R.inc(1511);
        // given
        __CLR4_5_2ueuelvicn1uh.R.inc(1512);OWLObjectUnionOf expected = df.getOWLObjectUnionOf(classes);
        __CLR4_5_2ueuelvicn1uh.R.inc(1513);BuilderUnionOf builder = new BuilderUnionOf(expected, df);
        // when
        __CLR4_5_2ueuelvicn1uh.R.inc(1514);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_2ueuelvicn1uh.R.inc(1515);assertEquals(expected, built);
    }finally{__CLR4_5_2ueuelvicn1uh.R.flushNeeded();}}
}
