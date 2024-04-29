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
package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertTrue;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.search.Searcher.annotationObjects;

import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class AnnotationAccessorsTestCase extends TestBase {static class __CLR4_5_22gz2gzlvicnzun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final IRI SUBJECT = IRI.create("http://owlapi.sourceforge.net/ontologies/test#X");

    @Nonnull
    private OWLAnnotationAssertionAxiom createAnnotationAssertionAxiom() {try{__CLR4_5_22gz2gzlvicnzun.R.inc(3203);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3204);OWLAnnotationProperty prop = AnnotationProperty(iri("prop"));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3205);OWLAnnotationValue value = Literal("value");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3206);return AnnotationAssertion(prop, SUBJECT, value);
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testClassAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28qzt2k2h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testClassAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28qzt2k2h3(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3207);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3208);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3209);OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3210);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3211);assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3212);OWLClass cls = Class(SUBJECT);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3213);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(cls.getIRI());
        __CLR4_5_22gz2gzlvicnzun.R.inc(3214);assertTrue(axioms.contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3215);assertTrue(annotationObjects(axioms, null).contains(ax.getAnnotation()));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testNamedIndividualAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k1ehyq2hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testNamedIndividualAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k1ehyq2hc(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3216);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3217);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3218);OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3219);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3220);assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3221);OWLNamedIndividual cls = NamedIndividual(SUBJECT);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3222);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(cls.getIRI());
        __CLR4_5_22gz2gzlvicnzun.R.inc(3223);assertTrue(axioms.contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3224);assertTrue(annotationObjects(axioms, null).contains(ax.getAnnotation()));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testObjectPropertyAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27qkx9w2hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testObjectPropertyAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27qkx9w2hl(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3225);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3226);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3227);OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3228);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3229);assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3230);OWLObjectProperty cls = ObjectProperty(SUBJECT);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3231);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(cls.getIRI());
        __CLR4_5_22gz2gzlvicnzun.R.inc(3232);assertTrue(axioms.contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3233);assertTrue(annotationObjects(axioms, null).contains(ax.getAnnotation()));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testDataPropertyAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqjk012hu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testDataPropertyAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqjk012hu(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3234);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3235);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3236);OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3237);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3238);assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3239);OWLDataProperty cls = DataProperty(SUBJECT);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3240);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(cls.getIRI());
        __CLR4_5_22gz2gzlvicnzun.R.inc(3241);assertTrue(axioms.contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3242);assertTrue(annotationObjects(axioms, null).contains(ax.getAnnotation()));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testDatatypeAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vndg9w2i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testDatatypeAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vndg9w2i3(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3243);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3244);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3245);OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3246);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3247);assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3248);OWLDatatype cls = Datatype(SUBJECT);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3249);Set<OWLAnnotationAssertionAxiom> axioms = ont.getAnnotationAssertionAxioms(cls.getIRI());
        __CLR4_5_22gz2gzlvicnzun.R.inc(3250);assertTrue(axioms.contains(ax));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3251);assertTrue(annotationObjects(axioms, null).contains(ax.getAnnotation()));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}

    @Test
    public void testAnonAccessor() {__CLR4_5_22gz2gzlvicnzun.R.globalSliceStart(getClass().getName(),3252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lfck8k2ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22gz2gzlvicnzun.R.rethrow($CLV_t2$);}finally{__CLR4_5_22gz2gzlvicnzun.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationAccessorsTestCase.testAnonAccessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lfck8k2ic(){try{__CLR4_5_22gz2gzlvicnzun.R.inc(3252);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3253);OWLOntology ont = getOWLOntology("ontology");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3254);OWLAnnotationProperty prop = AnnotationProperty(iri("prop"));
        __CLR4_5_22gz2gzlvicnzun.R.inc(3255);OWLAnnotationValue value = Literal("value");
        __CLR4_5_22gz2gzlvicnzun.R.inc(3256);OWLAnonymousIndividual a = AnonymousIndividual();
        __CLR4_5_22gz2gzlvicnzun.R.inc(3257);OWLAnnotationAssertionAxiom ax = AnnotationAssertion(prop, a, value);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3258);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_22gz2gzlvicnzun.R.inc(3259);assertTrue(ont.getAnnotationAssertionAxioms(a).contains(ax));
    }finally{__CLR4_5_22gz2gzlvicnzun.R.flushNeeded();}}
}
