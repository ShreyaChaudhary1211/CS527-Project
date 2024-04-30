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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeListener;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
@SuppressWarnings("javadoc")
public class OntologyMutationTestCase extends TestBase {static class __CLR4_5_27if7iflvico1h1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9775,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAddAxiom() {__CLR4_5_27if7iflvico1h1.R.globalSliceStart(getClass().getName(),9735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ei3hk7if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27if7iflvico1h1.R.rethrow($CLV_t2$);}finally{__CLR4_5_27if7iflvico1h1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyMutationTestCase.testAddAxiom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ei3hk7if(){try{__CLR4_5_27if7iflvico1h1.R.inc(9735);
        __CLR4_5_27if7iflvico1h1.R.inc(9736);OWLOntology ont = getOWLOntology("OntA");
        __CLR4_5_27if7iflvico1h1.R.inc(9737);OWLAxiom ax = SubClassOf(Class(iri("A")), OWLThing());
        __CLR4_5_27if7iflvico1h1.R.inc(9738);final List<OWLOntologyChange> chgs = new ArrayList<>();
        __CLR4_5_27if7iflvico1h1.R.inc(9739);ont.getOWLOntologyManager().addOntologyChangeListener(
                new OWLOntologyChangeListener() {

                    @Override
                    public void ontologiesChanged(
                            @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27if7iflvico1h1.R.inc(9740);
                        __CLR4_5_27if7iflvico1h1.R.inc(9741);chgs.addAll(changes);
                    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}
                });
        __CLR4_5_27if7iflvico1h1.R.inc(9742);ont.getOWLOntologyManager().addAxiom(ont, ax);
        __CLR4_5_27if7iflvico1h1.R.inc(9743);assertEquals(1, chgs.size());
        __CLR4_5_27if7iflvico1h1.R.inc(9744);assertTrue(chgs.contains(new AddAxiom(ont, ax)));
    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}

    @Test
    public void testAddAxioms() {__CLR4_5_27if7iflvico1h1.R.globalSliceStart(getClass().getName(),9745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdes9l7ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27if7iflvico1h1.R.rethrow($CLV_t2$);}finally{__CLR4_5_27if7iflvico1h1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyMutationTestCase.testAddAxioms",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdes9l7ip(){try{__CLR4_5_27if7iflvico1h1.R.inc(9745);
        __CLR4_5_27if7iflvico1h1.R.inc(9746);OWLOntology ont = getOWLOntology("OntB");
        __CLR4_5_27if7iflvico1h1.R.inc(9747);OWLAxiom ax = SubClassOf(Class(iri("A")), OWLThing());
        __CLR4_5_27if7iflvico1h1.R.inc(9748);final List<OWLOntologyChange> chgs = new ArrayList<>();
        __CLR4_5_27if7iflvico1h1.R.inc(9749);ont.getOWLOntologyManager().addOntologyChangeListener(
                new OWLOntologyChangeListener() {

                    @Override
                    public void ontologiesChanged(
                            @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27if7iflvico1h1.R.inc(9750);
                        __CLR4_5_27if7iflvico1h1.R.inc(9751);chgs.addAll(changes);
                    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}
                });
        __CLR4_5_27if7iflvico1h1.R.inc(9752);ont.getOWLOntologyManager().addAxioms(ont, singleton(ax));
        __CLR4_5_27if7iflvico1h1.R.inc(9753);assertEquals(1, chgs.size());
        __CLR4_5_27if7iflvico1h1.R.inc(9754);assertTrue(chgs.contains(new AddAxiom(ont, ax)));
    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}

    @Test
    public void testApplyChange() {__CLR4_5_27if7iflvico1h1.R.globalSliceStart(getClass().getName(),9755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26arwbx7iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27if7iflvico1h1.R.rethrow($CLV_t2$);}finally{__CLR4_5_27if7iflvico1h1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyMutationTestCase.testApplyChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26arwbx7iz(){try{__CLR4_5_27if7iflvico1h1.R.inc(9755);
        __CLR4_5_27if7iflvico1h1.R.inc(9756);OWLOntology ont = getOWLOntology("OntC");
        __CLR4_5_27if7iflvico1h1.R.inc(9757);OWLAxiom ax = SubClassOf(Class(iri("A")), OWLThing());
        __CLR4_5_27if7iflvico1h1.R.inc(9758);final List<OWLOntologyChange> chgs = new ArrayList<>();
        __CLR4_5_27if7iflvico1h1.R.inc(9759);ont.getOWLOntologyManager().addOntologyChangeListener(
                new OWLOntologyChangeListener() {

                    @Override
                    public void ontologiesChanged(
                            @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27if7iflvico1h1.R.inc(9760);
                        __CLR4_5_27if7iflvico1h1.R.inc(9761);chgs.addAll(changes);
                    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}
                });
        __CLR4_5_27if7iflvico1h1.R.inc(9762);ont.getOWLOntologyManager().applyChange(new AddAxiom(ont, ax));
        __CLR4_5_27if7iflvico1h1.R.inc(9763);assertEquals(1, chgs.size());
        __CLR4_5_27if7iflvico1h1.R.inc(9764);assertTrue(chgs.contains(new AddAxiom(ont, ax)));
    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}

    @Test
    public void testApplyChanges() {__CLR4_5_27if7iflvico1h1.R.globalSliceStart(getClass().getName(),9765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9qu7m7j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_27if7iflvico1h1.R.rethrow($CLV_t2$);}finally{__CLR4_5_27if7iflvico1h1.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OntologyMutationTestCase.testApplyChanges",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9qu7m7j9(){try{__CLR4_5_27if7iflvico1h1.R.inc(9765);
        __CLR4_5_27if7iflvico1h1.R.inc(9766);OWLOntology ont = getOWLOntology("OntD");
        __CLR4_5_27if7iflvico1h1.R.inc(9767);OWLAxiom ax = SubClassOf(Class(iri("A")), OWLThing());
        __CLR4_5_27if7iflvico1h1.R.inc(9768);final List<OWLOntologyChange> chgs = new ArrayList<>();
        __CLR4_5_27if7iflvico1h1.R.inc(9769);ont.getOWLOntologyManager().addOntologyChangeListener(
                new OWLOntologyChangeListener() {

                    @Override
                    public void ontologiesChanged(
                            @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27if7iflvico1h1.R.inc(9770);
                        __CLR4_5_27if7iflvico1h1.R.inc(9771);chgs.addAll(changes);
                    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}
                });
        __CLR4_5_27if7iflvico1h1.R.inc(9772);ont.getOWLOntologyManager().applyChange(new AddAxiom(ont, ax));
        __CLR4_5_27if7iflvico1h1.R.inc(9773);assertEquals(1, chgs.size());
        __CLR4_5_27if7iflvico1h1.R.inc(9774);assertTrue(chgs.contains(new AddAxiom(ont, ax)));
    }finally{__CLR4_5_27if7iflvico1h1.R.flushNeeded();}}
}
