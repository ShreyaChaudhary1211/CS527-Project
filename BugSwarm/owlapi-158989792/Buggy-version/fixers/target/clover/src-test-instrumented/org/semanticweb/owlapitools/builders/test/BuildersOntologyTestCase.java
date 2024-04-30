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

import static org.junit.Assert.assertTrue;

import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapitools.builders.*;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternalsImplNoCache;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyManagerImpl;

@SuppressWarnings({ "javadoc", })
public class BuildersOntologyTestCase {static class __CLR4_5_2164164lvicn1w6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0066\u0069\u0078\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237320442L,8589935092L,1760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLDataFactory df = new OWLDataFactoryImpl(new OWLDataFactoryInternalsImplNoCache(false));
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
    private final OWLDatatype d = df.getOWLDatatype(IRI.create("urn:test#datatype"));
    @Nonnull
    private final Set<OWLDataProperty> dps = new HashSet<>(Arrays.asList(df.getOWLDataProperty(iri), dp));
    @Nonnull
    private final Set<OWLObjectProperty> ops = new HashSet<>(Arrays.asList(df.getOWLObjectProperty(iri), op));
    @Nonnull
    private final Set<OWLClass> classes = new HashSet<>(Arrays.asList(df.getOWLClass(iri), ce));
    @Nonnull
    private final Set<OWLNamedIndividual> inds = new HashSet<>(Arrays.asList(i, df.getOWLNamedIndividual(iri)));
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
    @Nonnull
    private final OWLOntologyManager m = getManager();

    // no parsers and storers injected
    @Nonnull
    private OWLOntologyManager getManager() {try{__CLR4_5_2164164lvicn1w6.R.inc(1516);
        __CLR4_5_2164164lvicn1w6.R.inc(1517);OWLOntologyManager instance = new OWLOntologyManagerImpl(df, new ReentrantReadWriteLock());
        __CLR4_5_2164164lvicn1w6.R.inc(1518);instance.setOntologyFactories(Collections.singleton((OWLOntologyFactory) new OWLOntologyFactoryImpl(
            new OWLOntologyBuilder() {

                @Nonnull
                @Override
                public OWLOntology createOWLOntology(@Nonnull OWLOntologyManager manager,
                    @Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_2164164lvicn1w6.R.inc(1519);
                    __CLR4_5_2164164lvicn1w6.R.inc(1520);return new OWLOntologyImpl(manager, ontologyID);
                }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}
            })));
        __CLR4_5_2164164lvicn1w6.R.inc(1521);return instance;
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qoy25b16a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildAnnotationAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qoy25b16a() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1522);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1523);BuilderAnnotationAssertion builder = new BuilderAnnotationAssertion(df).withAnnotations(annotations)
            .withProperty(ap).withSubject(iri).withValue(lit);
        __CLR4_5_2164164lvicn1w6.R.inc(1524);OWLAxiom expected = df.getOWLAnnotationAssertionAxiom(ap, iri, lit, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1525);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1526);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1527);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyDomain() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pp2jqu16g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildAnnotationPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pp2jqu16g() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1528);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1529);BuilderAnnotationPropertyDomain builder = new BuilderAnnotationPropertyDomain(df).withProperty(ap).withDomain(
            iri).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1530);OWLAxiom expected = df.getOWLAnnotationPropertyDomainAxiom(ap, iri, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1531);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1532);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1533);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildAnnotationPropertyRange() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24poc8r16m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildAnnotationPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24poc8r16m() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1534);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1535);BuilderAnnotationPropertyRange builder = new BuilderAnnotationPropertyRange(df).withProperty(ap).withRange(iri)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1536);OWLAxiom expected = df.getOWLAnnotationPropertyRangeAxiom(ap, iri, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1537);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1538);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1539);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildAsymmetricObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ld4ac16s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildAsymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ld4ac16s() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1540);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1541);BuilderAsymmetricObjectProperty builder = new BuilderAsymmetricObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1542);OWLAxiom expected = df.getOWLAsymmetricObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1543);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1544);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1545);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildClassAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmto5w16y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildClassAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmto5w16y() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1546);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1547);BuilderClassAssertion builder = new BuilderClassAssertion(df).withClass(ce).withIndividual(i).withAnnotations(
            annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1548);OWLAxiom expected = df.getOWLClassAssertionAxiom(ce, i, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1549);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1550);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1551);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p617ip174();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p617ip174() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1552);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1553);BuilderDataPropertyAssertion builder = new BuilderDataPropertyAssertion(df).withProperty(dp).withSubject(i)
            .withValue(lit).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1554);OWLAxiom expected = df.getOWLDataPropertyAssertionAxiom(dp, i, lit, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1555);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1556);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1557);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyDomain() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o0cyhx17a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDataPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o0cyhx17a() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1558);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1559);BuilderDataPropertyDomain builder = new BuilderDataPropertyDomain(df).withProperty(dp).withDomain(ce)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1560);OWLAxiom expected = df.getOWLDataPropertyDomainAxiom(dp, ce, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1561);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1562);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1563);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDataPropertyRange() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jsx7ka17g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDataPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jsx7ka17g() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1564);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1565);BuilderDataPropertyRange builder = new BuilderDataPropertyRange(df).withProperty(dp).withRange(d)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1566);OWLAxiom expected = df.getOWLDataPropertyRangeAxiom(dp, d, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1567);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1568);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1569);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDatatypeDefinition() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uq6aex17m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDatatypeDefinition",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uq6aex17m() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1570);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1571);BuilderDatatypeDefinition builder = new BuilderDatatypeDefinition(df).with(d).withType(df
            .getDoubleOWLDatatype()).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1572);OWLAxiom expected = df.getOWLDatatypeDefinitionAxiom(d, df.getDoubleOWLDatatype(), annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1573);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1574);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1575);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDeclaration() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hv931617s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDeclaration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hv931617s() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1576);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1577);BuilderDeclaration builder = new BuilderDeclaration(df).withEntity(ce).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1578);OWLAxiom expected = df.getOWLDeclarationAxiom(ce, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1579);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1580);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1581);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDifferentIndividuals() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5k2jn17y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDifferentIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5k2jn17y() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1582);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1583);BuilderDifferentIndividuals builder = new BuilderDifferentIndividuals(df).withItem(i).withItem(df
            .getOWLNamedIndividual(iri));
        __CLR4_5_2164164lvicn1w6.R.inc(1584);OWLAxiom expected = df.getOWLDifferentIndividualsAxiom(i, df.getOWLNamedIndividual(iri));
        __CLR4_5_2164164lvicn1w6.R.inc(1585);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1586);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1587);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointClasses() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eapjxy184();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eapjxy184() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1588);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1589);BuilderDisjointClasses builder = new BuilderDisjointClasses(df).withItem(ce).withItem(df.getOWLClass(iri));
        __CLR4_5_2164164lvicn1w6.R.inc(1590);OWLAxiom expected = df.getOWLDisjointClassesAxiom(ce, df.getOWLClass(iri));
        __CLR4_5_2164164lvicn1w6.R.inc(1591);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1592);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1593);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointDataProperties() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qowp118a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qowp118a() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1594);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1595);BuilderDisjointDataProperties builder = new BuilderDisjointDataProperties(df).withItems(dps).withAnnotations(
            annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1596);OWLAxiom expected = df.getOWLDisjointDataPropertiesAxiom(dps, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1597);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1598);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1599);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointObjectProperties() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ybx4sw18g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ybx4sw18g() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1600);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1601);BuilderDisjointObjectProperties builder = new BuilderDisjointObjectProperties(df).withItems(ops)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1602);OWLAxiom expected = df.getOWLDisjointObjectPropertiesAxiom(ops, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1603);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1604);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1605);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildDisjointUnion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kgvzz18m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildDisjointUnion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1606,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kgvzz18m() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1606);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1607);BuilderDisjointUnion builder = new BuilderDisjointUnion(df).withClass(ce).withItems(classes).withAnnotations(
            annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1608);OWLAxiom expected = df.getOWLDisjointUnionAxiom(ce, classes, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1609);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1610);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1611);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentClasses() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21w75iw18s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21w75iw18s() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1612);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1613);BuilderEquivalentClasses builder = new BuilderEquivalentClasses(df).withItems(classes).withAnnotations(
            annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1614);OWLAxiom expected = df.getOWLEquivalentClassesAxiom(classes, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1615);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1616);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1617);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentDataProperties() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2llhand18y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1618,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2llhand18y() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1618);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1619);BuilderEquivalentDataProperties builder = new BuilderEquivalentDataProperties(df).withItems(dps)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1620);OWLAxiom expected = df.getOWLEquivalentDataPropertiesAxiom(dps, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1621);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1622);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1623);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildEquivalentObjectProperties() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ekd4yq194();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ekd4yq194() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1624);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1625);BuilderEquivalentObjectProperties builder = new BuilderEquivalentObjectProperties(df).withItems(ops)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1626);OWLAxiom expected = df.getOWLEquivalentObjectPropertiesAxiom(ops, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1627);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1628);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1629);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalDataProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hy74n819a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildFunctionalDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hy74n819a() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1630);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1631);BuilderFunctionalDataProperty builder = new BuilderFunctionalDataProperty(df).withProperty(dp).withAnnotations(
            annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1632);OWLAxiom expected = df.getOWLFunctionalDataPropertyAxiom(dp, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1633);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1634);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1635);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildFunctionalObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejrjnr19g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejrjnr19g() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1636);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1637);BuilderFunctionalObjectProperty builder = new BuilderFunctionalObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1638);OWLAxiom expected = df.getOWLFunctionalObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1639);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1640);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1641);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildHasKey() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29eoq2h19m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildHasKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29eoq2h19m() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1642);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1643);BuilderHasKey builder = new BuilderHasKey(df).withAnnotations(annotations).withClass(ce).withItems(ops);
        __CLR4_5_2164164lvicn1w6.R.inc(1644);OWLAxiom expected = df.getOWLHasKeyAxiom(ce, ops, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1645);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1646);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1647);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseFunctionalObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuof6519s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildInverseFunctionalObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuof6519s() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1648);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1649);BuilderInverseFunctionalObjectProperty builder = new BuilderInverseFunctionalObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1650);OWLAxiom expected = df.getOWLInverseFunctionalObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1651);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1652);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1653);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildInverseObjectProperties() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21tqr2m19y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildInverseObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21tqr2m19y() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1654);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1655);BuilderInverseObjectProperties builder = new BuilderInverseObjectProperties(df).withProperty(op)
            .withInverseProperty(op).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1656);OWLAxiom expected = df.getOWLInverseObjectPropertiesAxiom(op, op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1657);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1658);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1659);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildIrreflexiveObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jmd1z71a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildIrreflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jmd1z71a4() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1660);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1661);BuilderIrreflexiveObjectProperty builder = new BuilderIrreflexiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1662);OWLAxiom expected = df.getOWLIrreflexiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1663);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1664);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1665);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeDataPropertyAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22bs1d21aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildNegativeDataPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22bs1d21aa() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1666);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1667);BuilderNegativeDataPropertyAssertion builder = new BuilderNegativeDataPropertyAssertion(df).withAnnotations(
            annotations).withProperty(dp).withValue(lit).withSubject(i);
        __CLR4_5_2164164lvicn1w6.R.inc(1668);OWLAxiom expected = df.getOWLNegativeDataPropertyAssertionAxiom(dp, i, lit, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1669);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1670);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1671);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildNegativeObjectPropertyAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kk0og51ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildNegativeObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kk0og51ag() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1672);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1673);BuilderNegativeObjectPropertyAssertion builder = new BuilderNegativeObjectPropertyAssertion(df).withAnnotations(
            annotations).withProperty(op).withValue(i).withSubject(i);
        __CLR4_5_2164164lvicn1w6.R.inc(1674);OWLAxiom expected = df.getOWLNegativeObjectPropertyAssertionAxiom(op, i, i, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1675);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1676);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1677);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyAssertion() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jh0aai1am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildObjectPropertyAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jh0aai1am() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1678);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1679);BuilderObjectPropertyAssertion builder = new BuilderObjectPropertyAssertion(df).withProperty(op).withSubject(i)
            .withValue(i).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1680);OWLAxiom expected = df.getOWLObjectPropertyAssertionAxiom(op, i, i, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1681);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1682);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1683);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyDomain() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228836i1as();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildObjectPropertyDomain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228836i1as() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1684);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1685);BuilderObjectPropertyDomain builder = new BuilderObjectPropertyDomain(df).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1686);OWLAxiom expected = df.getOWLObjectPropertyDomainAxiom(op, ce, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1687);builder.withDomain(ce).withProperty(op).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1688);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1689);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1690);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildObjectPropertyRange() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ircln1az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildObjectPropertyRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ircln1az() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1691);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1692);BuilderObjectPropertyRange builder = new BuilderObjectPropertyRange(df).withProperty(op).withRange(ce)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1693);OWLAxiom expected = df.getOWLObjectPropertyRangeAxiom(op, ce, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1694);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1695);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1696);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildPropertyChain() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab7cyg1b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildPropertyChain",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab7cyg1b5() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1697);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1698);List<OWLObjectProperty> chain = new ArrayList<>(ops);
        __CLR4_5_2164164lvicn1w6.R.inc(1699);BuilderPropertyChain builder = new BuilderPropertyChain(df).withProperty(op).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1700);for (OWLObjectPropertyExpression p : chain) {{
            __CLR4_5_2164164lvicn1w6.R.inc(1701);builder.withPropertyInChain(p);
        }
        }__CLR4_5_2164164lvicn1w6.R.inc(1702);OWLAxiom expected = df.getOWLSubPropertyChainOfAxiom(chain, op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1703);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1704);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1705);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildReflexiveObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkvo301be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildReflexiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkvo301be() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1706);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1707);BuilderReflexiveObjectProperty builder = new BuilderReflexiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1708);OWLAxiom expected = df.getOWLReflexiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1709);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1710);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1711);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSameIndividual() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4914x1bk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSameIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4914x1bk() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1712);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1713);BuilderSameIndividual builder = new BuilderSameIndividual(df).withItems(inds).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1714);OWLAxiom expected = df.getOWLSameIndividualAxiom(inds, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1715);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1716);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1717);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSubAnnotationPropertyOf() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hahb5z1bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSubAnnotationPropertyOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hahb5z1bq() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1718);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1719);BuilderSubAnnotationPropertyOf builder = new BuilderSubAnnotationPropertyOf(df).withSub(ap).withSup(df
            .getRDFSLabel()).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1720);OWLAxiom expected = df.getOWLSubAnnotationPropertyOfAxiom(ap, df.getRDFSLabel(), annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1721);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1722);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1723);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSubClass() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l9clne1bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSubClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l9clne1bw() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1724);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1725);BuilderSubClass builder = new BuilderSubClass(df).withAnnotations(annotations).withSub(ce).withSup(df
            .getOWLThing());
        __CLR4_5_2164164lvicn1w6.R.inc(1726);OWLAxiom expected = df.getOWLSubClassOfAxiom(ce, df.getOWLThing(), annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1727);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1728);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1729);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSubDataProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bee7911c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSubDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bee7911c2() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1730);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1731);BuilderSubDataProperty builder = new BuilderSubDataProperty(df).withSub(dp).withSup(df.getOWLTopDataProperty());
        __CLR4_5_2164164lvicn1w6.R.inc(1732);OWLAxiom expected = df.getOWLSubDataPropertyOfAxiom(dp, df.getOWLTopDataProperty());
        __CLR4_5_2164164lvicn1w6.R.inc(1733);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1734);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1735);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSubObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kfgbcw1c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSubObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kfgbcw1c8() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1736);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1737);BuilderSubObjectProperty builder = new BuilderSubObjectProperty(df).withSub(op).withSup(df
            .getOWLTopObjectProperty()).withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1738);OWLAxiom expected = df.getOWLSubObjectPropertyOfAxiom(op, df.getOWLTopObjectProperty(), annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1739);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1740);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1741);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSWRLRule() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wtypr01ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSWRLRule",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wtypr01ce() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1742);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1743);BuilderSWRLRule builder = new BuilderSWRLRule(df).withBody(v1).withHead(v2);
        __CLR4_5_2164164lvicn1w6.R.inc(1744);OWLAxiom expected = df.getSWRLRule(body, head);
        __CLR4_5_2164164lvicn1w6.R.inc(1745);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1746);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1747);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildSymmetricObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rf89sn1ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildSymmetricObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rf89sn1ck() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1748);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1749);BuilderSymmetricObjectProperty builder = new BuilderSymmetricObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1750);OWLAxiom expected = df.getOWLSymmetricObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1751);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1752);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1753);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}

    @Test
    public void shouldBuildTransitiveObjectProperty() throws OWLOntologyCreationException {__CLR4_5_2164164lvicn1w6.R.globalSliceStart(getClass().getName(),1754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nn60v91cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2164164lvicn1w6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2164164lvicn1w6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapitools.builders.test.BuildersOntologyTestCase.shouldBuildTransitiveObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),1754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nn60v91cq() throws OWLOntologyCreationException{try{__CLR4_5_2164164lvicn1w6.R.inc(1754);
        // given
        __CLR4_5_2164164lvicn1w6.R.inc(1755);BuilderTransitiveObjectProperty builder = new BuilderTransitiveObjectProperty(df).withProperty(op)
            .withAnnotations(annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1756);OWLAxiom expected = df.getOWLTransitiveObjectPropertyAxiom(op, annotations);
        __CLR4_5_2164164lvicn1w6.R.inc(1757);OWLOntology o = m.createOntology();
        // when
        __CLR4_5_2164164lvicn1w6.R.inc(1758);builder.applyChanges(o);
        // then
        __CLR4_5_2164164lvicn1w6.R.inc(1759);assertTrue(o.containsAxiom(expected));
    }finally{__CLR4_5_2164164lvicn1w6.R.flushNeeded();}}
}
