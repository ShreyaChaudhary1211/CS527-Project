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
package org.semanticweb.owlapi.api.test.syntax;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

@SuppressWarnings({ "javadoc", "null" })
public class InvalidAxiomRoundTripTestCase extends TestBase {static class __CLR4_5_288k88klvico1mh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,10791,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private OWLOntology o;

    @Before
    public void setUpO() throws OWLOntologyCreationException {try{__CLR4_5_288k88klvico1mh.R.inc(10676);
        __CLR4_5_288k88klvico1mh.R.inc(10677);o = m.createOntology();
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    private static void assertCorrectResult(@Nonnull OWLAxiom wrongAxiom,
            @Nonnull OWLAxiom validAxiom, @Nonnull OWLOntology reloaded) {try{__CLR4_5_288k88klvico1mh.R.inc(10678);
        __CLR4_5_288k88klvico1mh.R.inc(10679);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10680);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10681);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10682);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    private void addAxioms(@Nonnull OWLAxiom... axioms) {try{__CLR4_5_288k88klvico1mh.R.inc(10683);
        __CLR4_5_288k88klvico1mh.R.inc(10684);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_288k88klvico1mh.R.iget(10685)!=0|true))||(__CLR4_5_288k88klvico1mh.R.iget(10686)==0&false));
            __CLR4_5_288k88klvico1mh.R.inc(10687);o.getOWLOntologyManager().addAxiom(o, ax);
        }
    }}finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    private OWLOntology saveAndReload() throws OWLOntologyStorageException,
            OWLOntologyCreationException {try{__CLR4_5_288k88klvico1mh.R.inc(10688);
        __CLR4_5_288k88klvico1mh.R.inc(10689);return roundTrip(o, new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidDifferentIndividuals()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27zadzz88y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidDifferentIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27zadzz88y() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10690);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10691);OWLNamedIndividual e1 = NamedIndividual(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10692);OWLNamedIndividual e2 = NamedIndividual(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10693);OWLNamedIndividual e3 = NamedIndividual(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10694);OWLAxiom wrongAxiom = DifferentIndividuals(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10695);OWLAxiom validAxiom = DifferentIndividuals(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10696);addAxioms(wrongAxiom, validAxiom);
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10697);assertCorrectResult(wrongAxiom, validAxiom, saveAndReload());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidDisjointObjectProperties()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dz0jkk896();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidDisjointObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dz0jkk896() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10698);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10699);OWLObjectProperty e1 = ObjectProperty(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10700);OWLObjectProperty e2 = ObjectProperty(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10701);OWLObjectProperty e3 = ObjectProperty(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10702);OWLAxiom wrongAxiom = DisjointObjectProperties(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10703);OWLAxiom validAxiom = DisjointObjectProperties(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10704);addAxioms(wrongAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10705);OWLOntology reloaded = saveAndReload();
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10706);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10707);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10708);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10709);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidDisjointClasses() throws Exception {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqcqme89i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidDisjointClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqcqme89i() throws Exception{try{__CLR4_5_288k88klvico1mh.R.inc(10710);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10711);OWLClass e1 = Class(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10712);OWLClass e2 = Class(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10713);OWLClass e3 = Class(IRI("urn:test3"));
        // The implementation now checks for classes that only have a single
        // distinct element
        // Note: we cannot distinguish between a self-disjoint axiom and an
        // FSS/API etc created single element axiom.
        // but this is coding around a problem in the spec.
        __CLR4_5_288k88klvico1mh.R.inc(10714);checkSingletonDisjointFixup(e1, DisjointClasses(e1, e1));
        __CLR4_5_288k88klvico1mh.R.inc(10715);checkSingletonDisjointFixup(OWLThing(),
                DisjointClasses(OWLThing(), OWLThing()));
        __CLR4_5_288k88klvico1mh.R.inc(10716);OWLDisjointClassesAxiom singleClassDisjointAxiom = DisjointClasses(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10717);checkSingletonDisjointFixup(e1, singleClassDisjointAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10718);OWLAxiom validAxiom = DisjointClasses(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10719);addAxioms(singleClassDisjointAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10720);OWLOntology reloaded = roundTrip(o,
                new FunctionalSyntaxDocumentFormat());
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10721);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10722);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10723);assertTrue(reloaded.containsAxiom(singleClassDisjointAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10724);assertEquals(2, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    protected void checkSingletonDisjointFixup(OWLClass e1,
            OWLDisjointClassesAxiom wrongAxiom) {try{__CLR4_5_288k88klvico1mh.R.inc(10725);
        __CLR4_5_288k88klvico1mh.R.inc(10726);Set<OWLClassExpression> classExpressions = wrongAxiom
                .getClassExpressions();
        __CLR4_5_288k88klvico1mh.R.inc(10727);assertEquals("should have two members", 2, classExpressions.size());
        __CLR4_5_288k88klvico1mh.R.inc(10728);assertTrue("contains e1", classExpressions.contains(e1));
        __CLR4_5_288k88klvico1mh.R.inc(10729);if ((((!e1.isOWLThing())&&(__CLR4_5_288k88klvico1mh.R.iget(10730)!=0|true))||(__CLR4_5_288k88klvico1mh.R.iget(10731)==0&false))) {{
            __CLR4_5_288k88klvico1mh.R.inc(10732);assertTrue("contains Thing", classExpressions.contains(OWLThing()));
        } }else {{
            __CLR4_5_288k88klvico1mh.R.inc(10733);assertTrue("contains Nothing",
                    classExpressions.contains(OWLNothing()));
        }
        }__CLR4_5_288k88klvico1mh.R.inc(10734);assertTrue("is annotated", wrongAxiom.isAnnotated());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidDisjointDataProperties()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b59qfd8a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidDisjointDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b59qfd8a7() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10735);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10736);OWLDataProperty e1 = DataProperty(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10737);OWLDataProperty e2 = DataProperty(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10738);OWLDataProperty e3 = DataProperty(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10739);OWLAxiom wrongAxiom = DisjointDataProperties(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10740);OWLAxiom validAxiom = DisjointDataProperties(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10741);addAxioms(wrongAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10742);OWLOntology reloaded = saveAndReload();
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10743);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10744);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10745);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10746);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidSameIndividuals()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ae38x08aj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidSameIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ae38x08aj() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10747);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10748);OWLNamedIndividual e1 = NamedIndividual(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10749);OWLNamedIndividual e2 = NamedIndividual(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10750);OWLNamedIndividual e3 = NamedIndividual(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10751);OWLAxiom wrongAxiom = SameIndividual(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10752);OWLAxiom validAxiom = SameIndividual(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10753);addAxioms(wrongAxiom, validAxiom);
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10754);assertCorrectResult(wrongAxiom, validAxiom, saveAndReload());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidEquivalentClasses()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oao1n08ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidEquivalentClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oao1n08ar() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10755);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10756);OWLClass e1 = Class(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10757);OWLClass e2 = Class(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10758);OWLClass e3 = Class(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10759);OWLAxiom wrongAxiom = EquivalentClasses(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10760);OWLAxiom validAxiom = EquivalentClasses(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10761);addAxioms(wrongAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10762);OWLOntology reloaded = saveAndReload();
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10763);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10764);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10765);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10766);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidEquivalentObjectProperties()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gfmja28b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidEquivalentObjectProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gfmja28b3() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10767);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10768);OWLObjectProperty e1 = ObjectProperty(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10769);OWLObjectProperty e2 = ObjectProperty(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10770);OWLObjectProperty e3 = ObjectProperty(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10771);OWLAxiom wrongAxiom = EquivalentObjectProperties(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10772);OWLAxiom validAxiom = EquivalentObjectProperties(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10773);addAxioms(wrongAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10774);OWLOntology reloaded = saveAndReload();
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10775);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10776);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10777);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10778);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}

    @Test
    public void shouldRoundTripInvalidEquivalentDataProperties()
            throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_288k88klvico1mh.R.globalSliceStart(getClass().getName(),10779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2q63f8bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_288k88klvico1mh.R.rethrow($CLV_t2$);}finally{__CLR4_5_288k88klvico1mh.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.InvalidAxiomRoundTripTestCase.shouldRoundTripInvalidEquivalentDataProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),10779,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2q63f8bf() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_288k88klvico1mh.R.inc(10779);
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10780);OWLDataProperty e1 = DataProperty(IRI("urn:test1"));
        __CLR4_5_288k88klvico1mh.R.inc(10781);OWLDataProperty e2 = DataProperty(IRI("urn:test2"));
        __CLR4_5_288k88klvico1mh.R.inc(10782);OWLDataProperty e3 = DataProperty(IRI("urn:test3"));
        // given
        __CLR4_5_288k88klvico1mh.R.inc(10783);OWLAxiom wrongAxiom = EquivalentDataProperties(e1);
        __CLR4_5_288k88klvico1mh.R.inc(10784);OWLAxiom validAxiom = EquivalentDataProperties(e2, e3);
        // when
        __CLR4_5_288k88klvico1mh.R.inc(10785);addAxioms(wrongAxiom, validAxiom);
        __CLR4_5_288k88klvico1mh.R.inc(10786);OWLOntology reloaded = saveAndReload();
        // then
        __CLR4_5_288k88klvico1mh.R.inc(10787);assertNotNull(reloaded);
        __CLR4_5_288k88klvico1mh.R.inc(10788);assertTrue(reloaded.containsAxiom(validAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10789);assertFalse(reloaded.containsAxiom(wrongAxiom));
        __CLR4_5_288k88klvico1mh.R.inc(10790);assertEquals(1, reloaded.getLogicalAxiomCount());
    }finally{__CLR4_5_288k88klvico1mh.R.flushNeeded();}}
}
