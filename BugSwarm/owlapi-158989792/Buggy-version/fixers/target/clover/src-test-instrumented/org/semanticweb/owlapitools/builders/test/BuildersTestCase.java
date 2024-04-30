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
public class BuildersTestCase {static class __CLR4_5_21cw1cwlvicn1xi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0066\u0069\u0078\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237320442L,8589935092L,2185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void shouldBuildAnnotation() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dwnpt1cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dwnpt1cw(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1760);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1761);BuilderAnnotation builder = new BuilderAnnotation(df).withProperty(ap).withValue(lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1762);OWLObject expected = df.getOWLAnnotation(ap, lit);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1763);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1764);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qoy25b1d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnnotationAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qoy25b1d1(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1765);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1766);BuilderAnnotationAssertion builder = new BuilderAnnotationAssertion(df).withAnnotations(annotations)
            .withProperty(ap).withSubject(iri).withValue(lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1767);OWLObject expected = df.getOWLAnnotationAssertionAxiom(ap, iri, lit, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1768);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1769);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vc1kdi1d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vc1kdi1d6(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1770);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1771);BuilderAnnotationProperty builder = new BuilderAnnotationProperty(df).withIRI(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1772);OWLObject expected = df.getOWLAnnotationProperty(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1773);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1774);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyDomain() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pp2jqu1db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnnotationPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pp2jqu1db(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1775);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1776);BuilderAnnotationPropertyDomain builder = new BuilderAnnotationPropertyDomain(df).withProperty(ap).withDomain(
            iri).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1777);OWLObject expected = df.getOWLAnnotationPropertyDomainAxiom(ap, iri, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1778);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1779);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyRange() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24poc8r1dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnnotationPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24poc8r1dg(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1780);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1781);BuilderAnnotationPropertyRange builder = new BuilderAnnotationPropertyRange(df).withProperty(ap).withRange(iri)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1782);OWLObject expected = df.getOWLAnnotationPropertyRangeAxiom(ap, iri, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1783);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1784);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAnonymousIndividual() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0i2c21dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAnonymousIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0i2c21dl(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1785);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1786);BuilderAnonymousIndividual builder = new BuilderAnonymousIndividual(df).withId("id");
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1787);OWLObject expected = df.getOWLAnonymousIndividual("id");
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1788);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1789);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildAsymmetricObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ld4ac1dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildAsymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ld4ac1dq(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1790);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1791);BuilderAsymmetricObjectProperty builder = new BuilderAsymmetricObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1792);OWLObject expected = df.getOWLAsymmetricObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1793);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1794);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildClass() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zhw7l01dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zhw7l01dv(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1795);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1796);BuilderClass builder = new BuilderClass(df).withIRI(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1797);OWLObject expected = df.getOWLClass(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1798);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1799);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildClassAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmto5w1e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmto5w1e0(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1800);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1801);BuilderClassAssertion builder = new BuilderClassAssertion(df).withClass(ce).withIndividual(i).withAnnotations(
            annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1802);OWLObject expected = df.getOWLClassAssertionAxiom(ce, i, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1803);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1804);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildComplementOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m50nwf1e5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m50nwf1e5(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1805);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1806);BuilderComplementOf builder = new BuilderComplementOf(df).withClass(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1807);OWLObject expected = df.getOWLObjectComplementOf(ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1808);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1809);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataAllValuesFrom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2er0h011ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2er0h011ea(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1810);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1811);BuilderDataAllValuesFrom builder = new BuilderDataAllValuesFrom(df).withProperty(dp).withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1812);OWLObject expected = df.getOWLDataAllValuesFrom(dp, d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1813);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1814);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataComplementOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkornb1ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataComplementOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkornb1ef(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1815);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1816);BuilderDataComplementOf builder = new BuilderDataComplementOf(df).withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1817);OWLObject expected = df.getOWLDataComplementOf(d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1818);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1819);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataExactCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlqenv1ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataExactCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlqenv1ek(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1820);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1821);BuilderDataExactCardinality builder = new BuilderDataExactCardinality(df).withCardinality(1).withProperty(dp)
            .withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1822);OWLObject expected = df.getOWLDataExactCardinality(1, dp, d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1823);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1824);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataHasValue() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21swm1v1ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataHasValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21swm1v1ep(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1825);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1826);BuilderDataHasValue builder = new BuilderDataHasValue(df).withProperty(dp).withLiteral(lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1827);OWLObject expected = df.getOWLDataHasValue(dp, lit);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1828);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1829);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataIntersectionOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21letcc1eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21letcc1eu(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1830);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1831);BuilderDataIntersectionOf builder = new BuilderDataIntersectionOf(df).withItem(d).withItem(df
            .getFloatOWLDatatype());
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1832);OWLObject expected = df.getOWLDataIntersectionOf(d, df.getFloatOWLDatatype());
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1833);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1834);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataMaxCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cd78ra1ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cd78ra1ez(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1835);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1836);BuilderDataMaxCardinality builder = new BuilderDataMaxCardinality(df).withCardinality(1).withProperty(dp)
            .withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1837);OWLObject expected = df.getOWLDataMaxCardinality(1, dp, d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1838);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1839);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataMinCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wubtbc1f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wubtbc1f4(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1840);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1841);BuilderDataMinCardinality builder = new BuilderDataMinCardinality(df).withCardinality(1).withProperty(dp)
            .withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1842);OWLObject expected = df.getOWLDataMinCardinality(1, dp, d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1843);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1844);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataOneOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx080x1f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx080x1f9(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1845);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1846);BuilderDataOneOf builder = new BuilderDataOneOf(df).withItem(lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1847);OWLObject expected = df.getOWLDataOneOf(lit);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1848);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1849);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tv9x6n1fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tv9x6n1fe(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1850);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1851);BuilderDataProperty builder = new BuilderDataProperty(df).withIRI(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1852);OWLObject expected = df.getOWLDataProperty(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1853);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1854);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p617ip1fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p617ip1fj(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1855);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1856);BuilderDataPropertyAssertion builder = new BuilderDataPropertyAssertion(df).withProperty(dp).withSubject(i)
            .withValue(lit).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1857);OWLObject expected = df.getOWLDataPropertyAssertionAxiom(dp, i, lit, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1858);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1859);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyDomain() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0cyhx1fo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0cyhx1fo(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1860);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1861);BuilderDataPropertyDomain builder = new BuilderDataPropertyDomain(df).withProperty(dp).withDomain(ce)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1862);OWLObject expected = df.getOWLDataPropertyDomainAxiom(dp, ce, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1863);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1864);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyRange() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jsx7ka1ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jsx7ka1ft(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1865);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1866);BuilderDataPropertyRange builder = new BuilderDataPropertyRange(df).withProperty(dp).withRange(d)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1867);OWLObject expected = df.getOWLDataPropertyRangeAxiom(dp, d, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1868);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1869);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataSomeValuesFrom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1gmh81fy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1gmh81fy(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1870);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1871);BuilderDataSomeValuesFrom builder = new BuilderDataSomeValuesFrom(df).withProperty(dp).withRange(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1872);OWLObject expected = df.getOWLDataSomeValuesFrom(dp, d);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1873);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1874);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatype() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eueexm1g3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eueexm1g3(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1875);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1876);BuilderDatatype builder = new BuilderDatatype(df).withIRI(iri).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1877);OWLObject expected = df.getOWLDatatype(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1878);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1879);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatypeDefinition() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uq6aex1g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDatatypeDefinition",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uq6aex1g8(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1880);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1881);BuilderDatatypeDefinition builder = new BuilderDatatypeDefinition(df).with(d).withType(df
            .getDoubleOWLDatatype()).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1882);OWLObject expected = df.getOWLDatatypeDefinitionAxiom(d, df.getDoubleOWLDatatype(), annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1883);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1884);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatypeRestriction() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x65wms1gd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDatatypeRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x65wms1gd(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1885);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1886);OWLFacetRestriction r = df.getOWLFacetRestriction(OWLFacet.MAX_LENGTH, lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1887);BuilderDatatypeRestriction builder = new BuilderDatatypeRestriction(df).withItem(r).withDatatype(d);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1888);OWLObject expected = df.getOWLDatatypeRestriction(d, r);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1889);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1890);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDataUnionOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23dors81gj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDataUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23dors81gj(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1891);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1892);BuilderDataUnionOf builder = new BuilderDataUnionOf(df).withItem(d).withItem(df.getDoubleOWLDatatype());
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1893);OWLObject expected = df.getOWLDataUnionOf(d, df.getDoubleOWLDatatype());
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1894);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1895);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDeclaration() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hv93161go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDeclaration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hv93161go(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1896);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1897);BuilderDeclaration builder = new BuilderDeclaration(df).withEntity(ce).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1898);OWLObject expected = df.getOWLDeclarationAxiom(ce, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1899);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1900);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDifferentIndividuals() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5k2jn1gt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDifferentIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5k2jn1gt(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1901);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1902);BuilderDifferentIndividuals builder = new BuilderDifferentIndividuals(df).withItem(i).withItem(df
            .getOWLNamedIndividual(iri));
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1903);OWLObject expected = df.getOWLDifferentIndividualsAxiom(i, df.getOWLNamedIndividual(iri));
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1904);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1905);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointClasses() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eapjxy1gy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eapjxy1gy(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1906);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1907);BuilderDisjointClasses builder = new BuilderDisjointClasses(df).withItem(ce).withItem(df.getOWLClass(iri));
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1908);OWLObject expected = df.getOWLDisjointClassesAxiom(ce, df.getOWLClass(iri));
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1909);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1910);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointDataProperties() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qowp11h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qowp11h3(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1911);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1912);BuilderDisjointDataProperties builder = new BuilderDisjointDataProperties(df).withItems(dps).withAnnotations(
            annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1913);OWLObject expected = df.getOWLDisjointDataPropertiesAxiom(dps, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1914);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1915);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointObjectProperties() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybx4sw1h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybx4sw1h8(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1916);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1917);BuilderDisjointObjectProperties builder = new BuilderDisjointObjectProperties(df).withItems(ops)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1918);OWLObject expected = df.getOWLDisjointObjectPropertiesAxiom(ops, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1919);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1920);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointUnion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kgvzz1hd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildDisjointUnion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kgvzz1hd(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1921);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1922);BuilderDisjointUnion builder = new BuilderDisjointUnion(df).withClass(ce).withItems(classes).withAnnotations(
            annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1923);OWLObject expected = df.getOWLDisjointUnionAxiom(ce, classes, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1924);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1925);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildEntity() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kz3971hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildEntity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kz3971hi(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1926);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1927);BuilderEntity builder = new BuilderEntity(df).withIRI(iri).withType(EntityType.CLASS);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1928);OWLObject expected = df.getOWLClass(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1929);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1930);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentClasses() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21w75iw1hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21w75iw1hn(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1931);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1932);BuilderEquivalentClasses builder = new BuilderEquivalentClasses(df).withItems(classes).withAnnotations(
            annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1933);OWLObject expected = df.getOWLEquivalentClassesAxiom(classes, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1934);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1935);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentDataProperties() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2llhand1hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2llhand1hs(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1936);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1937);BuilderEquivalentDataProperties builder = new BuilderEquivalentDataProperties(df).withItems(dps)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1938);OWLObject expected = df.getOWLEquivalentDataPropertiesAxiom(dps, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1939);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1940);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentObjectProperties() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekd4yq1hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekd4yq1hx(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1941);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1942);BuilderEquivalentObjectProperties builder = new BuilderEquivalentObjectProperties(df).withItems(ops)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1943);OWLObject expected = df.getOWLEquivalentObjectPropertiesAxiom(ops, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1944);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1945);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildFacetRestriction() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284ak531i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildFacetRestriction",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284ak531i2(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1946);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1947);BuilderFacetRestriction builder = new BuilderFacetRestriction(df).withLiteral(lit).withFacet(
            OWLFacet.MAX_EXCLUSIVE);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1948);OWLObject expected = df.getOWLFacetRestriction(OWLFacet.MAX_EXCLUSIVE, lit);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1949);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1950);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalDataProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hy74n81i7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildFunctionalDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hy74n81i7(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1951);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1952);BuilderFunctionalDataProperty builder = new BuilderFunctionalDataProperty(df).withProperty(dp).withAnnotations(
            annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1953);OWLObject expected = df.getOWLFunctionalDataPropertyAxiom(dp, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1954);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1955);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejrjnr1ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejrjnr1ic(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1956);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1957);BuilderFunctionalObjectProperty builder = new BuilderFunctionalObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1958);OWLObject expected = df.getOWLFunctionalObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1959);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1960);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildHasKey() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29eoq2h1ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildHasKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29eoq2h1ih(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1961);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1962);BuilderHasKey builder = new BuilderHasKey(df).withAnnotations(annotations).withClass(ce).withItems(ops);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1963);OWLObject expected = df.getOWLHasKeyAxiom(ce, ops, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1964);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1965);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildImportsDeclarationProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nav1s31im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildImportsDeclarationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nav1s31im(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1966);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1967);BuilderImportsDeclaration builder = new BuilderImportsDeclaration(df).withImportedOntology(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1968);OWLImportsDeclaration expected = df.getOWLImportsDeclaration(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1969);OWLImportsDeclaration built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1970);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseFunctionalObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuof651ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildInverseFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuof651ir(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1971);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1972);BuilderInverseFunctionalObjectProperty builder = new BuilderInverseFunctionalObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1973);OWLObject expected = df.getOWLInverseFunctionalObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1974);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1975);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseObjectProperties() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21tqr2m1iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildInverseObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21tqr2m1iw(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1976);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1977);BuilderInverseObjectProperties builder = new BuilderInverseObjectProperties(df).withProperty(op)
            .withInverseProperty(op).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1978);OWLObject expected = df.getOWLInverseObjectPropertiesAxiom(op, op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1979);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1980);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildIrreflexiveObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jmd1z71j1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildIrreflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jmd1z71j1(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1981);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1982);BuilderIrreflexiveObjectProperty builder = new BuilderIrreflexiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1983);OWLObject expected = df.getOWLIrreflexiveObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1984);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1985);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildLiteral() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2juy06z1j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2juy06z1j6(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1986);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1987);BuilderLiteral builder = new BuilderLiteral(df).withValue(true).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1988);OWLObject expected = df.getOWLLiteral(true);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1989);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1990);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildNamedIndividual() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p1q6761jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p1q6761jb(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1991);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1992);BuilderNamedIndividual builder = new BuilderNamedIndividual(df).withIRI(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1993);OWLObject expected = df.getOWLNamedIndividual(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1994);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1995);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeDataPropertyAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),1996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22bs1d21jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildNegativeDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22bs1d21jg(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(1996);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1997);BuilderNegativeDataPropertyAssertion builder = new BuilderNegativeDataPropertyAssertion(df).withAnnotations(
            annotations).withProperty(dp).withValue(lit).withSubject(i);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1998);OWLObject expected = df.getOWLNegativeDataPropertyAssertionAxiom(dp, i, lit, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(1999);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2000);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeObjectPropertyAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kk0og51jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildNegativeObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kk0og51jl(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2001);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2002);BuilderNegativeObjectPropertyAssertion builder = new BuilderNegativeObjectPropertyAssertion(df).withAnnotations(
            annotations).withProperty(op).withValue(i).withSubject(i);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2003);OWLObject expected = df.getOWLNegativeObjectPropertyAssertionAxiom(op, i, i, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2004);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2005);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectAllValuesFrom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yyf0t61jq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2006,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yyf0t61jq(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2006);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2007);BuilderObjectAllValuesFrom builder = new BuilderObjectAllValuesFrom(df).withProperty(op).withRange(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2008);OWLObject expected = df.getOWLObjectAllValuesFrom(op, ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2009);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2010);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectExactCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2td5gcw1jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectExactCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2td5gcw1jv(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2011);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2012);BuilderObjectExactCardinality builder = new BuilderObjectExactCardinality(df).withCardinality(1).withProperty(
            op).withRange(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2013);OWLObject expected = df.getOWLObjectExactCardinality(1, op, ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2014);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2015);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectHasSelf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vw7591k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectHasSelf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vw7591k0(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2016);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2017);BuilderObjectHasSelf builder = new BuilderObjectHasSelf(df).withProperty(op);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2018);OWLObject expected = df.getOWLObjectHasSelf(op);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2019);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2020);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectHasValue() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kc4nh41k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectHasValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kc4nh41k5(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2021);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2022);BuilderObjectHasValue builder = new BuilderObjectHasValue(df).withProperty(op).withValue(i);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2023);OWLObject expected = df.getOWLObjectHasValue(op, i);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2024);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2025);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectIntersectionOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k6q1z31ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k6q1z31ka(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2026);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2027);BuilderObjectIntersectionOf builder = new BuilderObjectIntersectionOf(df).withItems(classes);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2028);OWLObject expected = df.getOWLObjectIntersectionOf(classes);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2029);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2030);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectInverseOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bc1wa41kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectInverseOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bc1wa41kf(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2031);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2032);BuilderObjectInverseOf builder = new BuilderObjectInverseOf(df).withProperty(op);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2033);OWLObject expected = df.getOWLObjectInverseOf(op);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2034);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2035);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectMaxCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29exmk51kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29exmk51kk(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2036);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2037);BuilderObjectMaxCardinality builder = new BuilderObjectMaxCardinality(df).withCardinality(1).withProperty(op)
            .withRange(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2038);OWLObject expected = df.getOWLObjectMaxCardinality(1, op, ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2039);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2040);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectMinCardinality() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b26xzx1kp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b26xzx1kp(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2041);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2042);BuilderObjectMinCardinality builder = new BuilderObjectMinCardinality(df).withCardinality(1).withProperty(op)
            .withRange(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2043);OWLObject expected = df.getOWLObjectMinCardinality(1, op, ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2044);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2045);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bc1vre1ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bc1vre1ku(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2046);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2047);BuilderObjectProperty builder = new BuilderObjectProperty(df).withIRI(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2048);OWLObject expected = df.getOWLObjectProperty(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2049);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2050);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyAssertion() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jh0aai1kz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jh0aai1kz(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2051);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2052);BuilderObjectPropertyAssertion builder = new BuilderObjectPropertyAssertion(df).withProperty(op).withSubject(i)
            .withValue(i).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2053);OWLObject expected = df.getOWLObjectPropertyAssertionAxiom(op, i, i, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2054);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2055);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyDomain() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228836i1l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228836i1l4(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2056);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2057);BuilderObjectPropertyDomain builder = new BuilderObjectPropertyDomain(df).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2058);OWLObject expected = df.getOWLObjectPropertyDomainAxiom(op, ce, annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2059);builder.withDomain(ce).withProperty(op).withAnnotations(annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2060);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2061);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyRange() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ircln1la();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ircln1la(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2062);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2063);BuilderObjectPropertyRange builder = new BuilderObjectPropertyRange(df).withProperty(op).withRange(ce)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2064);OWLObject expected = df.getOWLObjectPropertyRangeAxiom(op, ce, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2065);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2066);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectSomeValuesFrom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289br5t1lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildObjectSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289br5t1lf(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2067);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2068);BuilderObjectSomeValuesFrom builder = new BuilderObjectSomeValuesFrom(df).withProperty(op).withRange(ce);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2069);OWLObject expected = df.getOWLObjectSomeValuesFrom(op, ce);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2070);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2071);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildOneOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jbhwrt1lk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildOneOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2072,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jbhwrt1lk(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2072);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2073);BuilderOneOf builder = new BuilderOneOf(df).withItem(i);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2074);OWLObject expected = df.getOWLObjectOneOf(i);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2075);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2076);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildPropertyChain() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab7cyg1lp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildPropertyChain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab7cyg1lp(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2077);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2078);List<OWLObjectProperty> chain = new ArrayList<>(ops);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2079);BuilderPropertyChain builder = new BuilderPropertyChain(df).withProperty(op).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2080);for (OWLObjectPropertyExpression p : chain) {{
            __CLR4_5_21cw1cwlvicn1xi.R.inc(2081);builder.withPropertyInChain(p);
        }
        }__CLR4_5_21cw1cwlvicn1xi.R.inc(2082);OWLObject expected = df.getOWLSubPropertyChainOfAxiom(chain, op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2083);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2084);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildReflexiveObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkvo301lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildReflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkvo301lx(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2085);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2086);BuilderReflexiveObjectProperty builder = new BuilderReflexiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2087);OWLObject expected = df.getOWLReflexiveObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2088);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2089);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSameIndividual() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4914x1m2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4914x1m2(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2090);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2091);BuilderSameIndividual builder = new BuilderSameIndividual(df).withItems(inds).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2092);OWLObject expected = df.getOWLSameIndividualAxiom(inds, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2093);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2094);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSubAnnotationPropertyOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hahb5z1m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSubAnnotationPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hahb5z1m7(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2095);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2096);BuilderSubAnnotationPropertyOf builder = new BuilderSubAnnotationPropertyOf(df).withSub(ap).withSup(df
            .getRDFSLabel()).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2097);OWLObject expected = df.getOWLSubAnnotationPropertyOfAxiom(ap, df.getRDFSLabel(), annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2098);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2099);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSubClass() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l9clne1mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSubClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l9clne1mc(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2100);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2101);BuilderSubClass builder = new BuilderSubClass(df).withAnnotations(annotations).withSub(ce).withSup(df
            .getOWLThing());
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2102);OWLObject expected = df.getOWLSubClassOfAxiom(ce, df.getOWLThing(), annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2103);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2104);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSubDataProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bee7911mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSubDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bee7911mh(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2105);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2106);BuilderSubDataProperty builder = new BuilderSubDataProperty(df).withSub(dp).withSup(df.getOWLTopDataProperty());
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2107);OWLObject expected = df.getOWLSubDataPropertyOfAxiom(dp, df.getOWLTopDataProperty());
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2108);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2109);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSubObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kfgbcw1mm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSubObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kfgbcw1mm(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2110);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2111);BuilderSubObjectProperty builder = new BuilderSubObjectProperty(df).withSub(op).withSup(df
            .getOWLTopObjectProperty()).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2112);OWLObject expected = df.getOWLSubObjectPropertyOfAxiom(op, df.getOWLTopObjectProperty(), annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2113);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2114);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLBuiltInAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1zgi1mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLBuiltInAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1zgi1mr(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2115);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2116);BuilderSWRLBuiltInAtom builder = new BuilderSWRLBuiltInAtom(df).with(iri).with(var1);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2117);OWLObject expected = df.getSWRLBuiltInAtom(iri, Arrays.asList(var1));
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2118);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2119);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLClassAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2feql491mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLClassAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2feql491mw(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2120);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2121);BuilderSWRLClassAtom builder = new BuilderSWRLClassAtom(df).with(ce).with(var2);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2122);OWLObject expected = df.getSWRLClassAtom(ce, var2);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2123);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2124);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDataPropertyAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbhwgg1n1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLDataPropertyAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbhwgg1n1(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2125);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2126);BuilderSWRLDataPropertyAtom builder = new BuilderSWRLDataPropertyAtom(df).withProperty(dp).with(var2).with(
            var1);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2127);OWLObject expected = df.getSWRLDataPropertyAtom(dp, var2, var1);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2128);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2129);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDataRangeAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ltyhzi1n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLDataRangeAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ltyhzi1n6(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2130);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2131);BuilderSWRLDataRangeAtom builder = new BuilderSWRLDataRangeAtom(df).with(d).with(var1);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2132);OWLObject expected = df.getSWRLDataRangeAtom(d, var1);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2133);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2134);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLDifferentIndividualsAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2041a1nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLDifferentIndividualsAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2041a1nb(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2135);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2136);BuilderSWRLDifferentIndividualsAtom builder = new BuilderSWRLDifferentIndividualsAtom(df).withArg0(var2)
            .withArg1(var2).withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2137);OWLObject expected = df.getSWRLDifferentIndividualsAtom(var2, var2);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2138);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2139);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLIndividualArgument() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4mxm21ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLIndividualArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4mxm21ng(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2140);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2141);BuilderSWRLIndividualArgument builder = new BuilderSWRLIndividualArgument(df).with(i);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2142);OWLObject expected = df.getSWRLIndividualArgument(i);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2143);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2144);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLLiteralArgument() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2a1ye1nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLLiteralArgument",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2a1ye1nl(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2145);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2146);BuilderSWRLLiteralArgument builder = new BuilderSWRLLiteralArgument(df).with(lit);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2147);OWLObject expected = df.getSWRLLiteralArgument(lit);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2148);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2149);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLObjectPropertyAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xfq0md1nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLObjectPropertyAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xfq0md1nq(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2150);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2151);BuilderSWRLObjectPropertyAtom builder = new BuilderSWRLObjectPropertyAtom(df).withProperty(op).withArg0(var2)
            .withArg1(var2);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2152);OWLObject expected = df.getSWRLObjectPropertyAtom(op, var2, var2);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2153);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2154);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLRule() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wtypr01nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLRule",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wtypr01nv(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2155);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2156);BuilderSWRLRule builder = new BuilderSWRLRule(df).withBody(v1).withHead(v2);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2157);OWLObject expected = df.getSWRLRule(body, head);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2158);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2159);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLSameIndividualAtom() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vfe9tc1o0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLSameIndividualAtom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vfe9tc1o0(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2160);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2161);BuilderSWRLSameIndividualAtom builder = new BuilderSWRLSameIndividualAtom(df).withArg0(df
            .getSWRLIndividualArgument(i)).withArg1(df.getSWRLIndividualArgument(i));
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2162);OWLObject expected = df.getSWRLSameIndividualAtom(df.getSWRLIndividualArgument(i), df.getSWRLIndividualArgument(
            i));
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2163);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2164);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLVariable() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjzjz01o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSWRLVariable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjzjz01o5(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2165);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2166);BuilderSWRLVariable builder = new BuilderSWRLVariable(df).with(iri);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2167);OWLObject expected = df.getSWRLVariable(iri);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2168);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2169);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildSymmetricObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rf89sn1oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildSymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rf89sn1oa(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2170);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2171);BuilderSymmetricObjectProperty builder = new BuilderSymmetricObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2172);OWLObject expected = df.getOWLSymmetricObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2173);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2174);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildTransitiveObjectProperty() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nn60v91of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildTransitiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nn60v91of(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2175);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2176);BuilderTransitiveObjectProperty builder = new BuilderTransitiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2177);OWLObject expected = df.getOWLTransitiveObjectPropertyAxiom(op, annotations);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2178);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2179);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}

    @Test
    public void shouldBuildUnionOf() {__CLR4_5_21cw1cwlvicn1xi.R.globalSliceStart(getClass().getName(),2180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l4ncaa1ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cw1cwlvicn1xi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cw1cwlvicn1xi.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersTestCase.shouldBuildUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2180,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l4ncaa1ok(){try{__CLR4_5_21cw1cwlvicn1xi.R.inc(2180);
        // given
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2181);BuilderUnionOf builder = new BuilderUnionOf(df).withItems(classes);
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2182);OWLObject expected = df.getOWLObjectUnionOf(classes);
        // when
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2183);OWLObject built = builder.buildObject();
        // then
        __CLR4_5_21cw1cwlvicn1xi.R.inc(2184);assertEquals(expected, built);
    }finally{__CLR4_5_21cw1cwlvicn1xi.R.flushNeeded();}}
}
