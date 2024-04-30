/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Clark & Parsia, LLC
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package com.clarkparsia.owlapi.explanation;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor;

/**
 * @author Matthew Horridge, Clark &amp; Parsia, LLC, Bio-Health Informatics
 *         Group
 * @since 2.2.0
 */
public class DefaultExplanationGenerator implements ExplanationGenerator {public static class __CLR4_5_29v9vlviclypd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLDataFactory dataFactory;
    @Nonnull
    private final MultipleExplanationGenerator gen;

    /**
     * Instantiates a new default explanation generator.
     * 
     * @param man
     *        manager
     * @param reasonerFactory
     *        reasoner factory
     * @param ontology
     *        ontology to reason on
     * @param progressMonitor
     *        progress monitor
     */
    public DefaultExplanationGenerator(@Nonnull OWLOntologyManager man,
            @Nonnull OWLReasonerFactory reasonerFactory,
            @Nonnull OWLOntology ontology,
            @Nonnull ExplanationProgressMonitor progressMonitor) {
        this(man, reasonerFactory, ontology, checkNotNull(reasonerFactory,
                "reasonerFactory cannot be null").createNonBufferingReasoner(
                ontology), progressMonitor);__CLR4_5_29v9vlviclypd.R.inc(356);try{__CLR4_5_29v9vlviclypd.R.inc(355);
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    /**
     * Instantiates a new default explanation generator.
     * 
     * @param man
     *        manager
     * @param reasonerFactory
     *        reasoner factory
     * @param ontology
     *        ontology to reason on
     * @param reasoner
     *        the reasoner to use
     * @param progressMonitor
     *        progress monitor
     */
    public DefaultExplanationGenerator(@Nonnull OWLOntologyManager man,
            @Nonnull OWLReasonerFactory reasonerFactory,
            @Nonnull OWLOntology ontology, @Nonnull OWLReasoner reasoner,
            @Nullable ExplanationProgressMonitor progressMonitor) {try{__CLR4_5_29v9vlviclypd.R.inc(357);
        __CLR4_5_29v9vlviclypd.R.inc(358);dataFactory = checkNotNull(man, "man cannot be null")
                .getOWLDataFactory();
        __CLR4_5_29v9vlviclypd.R.inc(359);BlackBoxExplanation singleGen = new BlackBoxExplanation(checkNotNull(
                ontology, "ontology cannot be null"), checkNotNull(
                reasonerFactory, "reasonerFactory cannot be null"),
                checkNotNull(reasoner, "reasoner cannot be null"));
        __CLR4_5_29v9vlviclypd.R.inc(360);gen = new HSTExplanationGenerator(singleGen);
        __CLR4_5_29v9vlviclypd.R.inc(361);if ((((progressMonitor != null)&&(__CLR4_5_29v9vlviclypd.R.iget(362)!=0|true))||(__CLR4_5_29v9vlviclypd.R.iget(363)==0&false))) {{
            __CLR4_5_29v9vlviclypd.R.inc(364);gen.setProgressMonitor(progressMonitor);
        }
    }}finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getExplanation(OWLClassExpression unsatClass) {try{__CLR4_5_29v9vlviclypd.R.inc(365);
        __CLR4_5_29v9vlviclypd.R.inc(366);return gen.getExplanation(unsatClass);
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    /**
     * Gets the explanation.
     * 
     * @param axiom
     *        the axiom to explain
     * @return the explanation
     */
    @Nonnull
    public Set<OWLAxiom> getExplanation(@Nonnull OWLAxiom axiom) {try{__CLR4_5_29v9vlviclypd.R.inc(367);
        __CLR4_5_29v9vlviclypd.R.inc(368);SatisfiabilityConverter converter = new SatisfiabilityConverter(
                dataFactory);
        __CLR4_5_29v9vlviclypd.R.inc(369);return getExplanation(converter.convert(checkNotNull(axiom,
                "axiom cannot be null")));
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    @Override
    public Set<Set<OWLAxiom>> getExplanations(OWLClassExpression unsatClass) {try{__CLR4_5_29v9vlviclypd.R.inc(370);
        __CLR4_5_29v9vlviclypd.R.inc(371);return gen.getExplanations(unsatClass);
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    /**
     * Gets the explanations.
     * 
     * @param axiom
     *        the axiom to explain
     * @return the set of explanations
     */
    @Nonnull
    public Set<Set<OWLAxiom>> getExplanations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_29v9vlviclypd.R.inc(372);
        __CLR4_5_29v9vlviclypd.R.inc(373);SatisfiabilityConverter converter = new SatisfiabilityConverter(
                dataFactory);
        __CLR4_5_29v9vlviclypd.R.inc(374);return getExplanations(converter.convert(checkNotNull(axiom,
                "axiom cannot be null")));
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    @Override
    public Set<Set<OWLAxiom>> getExplanations(OWLClassExpression unsatClass,
            int maxExplanations) {try{__CLR4_5_29v9vlviclypd.R.inc(375);
        __CLR4_5_29v9vlviclypd.R.inc(376);return gen.getExplanations(unsatClass, maxExplanations);
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}

    /**
     * Gets the explanations.
     * 
     * @param axiom
     *        the axiom to explain
     * @param maxExplanations
     *        max number of explanations
     * @return the set of explanations
     */
    @Nonnull
    public Set<Set<OWLAxiom>> getExplanations(@Nonnull OWLAxiom axiom,
            int maxExplanations) {try{__CLR4_5_29v9vlviclypd.R.inc(377);
        __CLR4_5_29v9vlviclypd.R.inc(378);SatisfiabilityConverter converter = new SatisfiabilityConverter(
                dataFactory);
        __CLR4_5_29v9vlviclypd.R.inc(379);return getExplanations(
                converter.convert(checkNotNull(axiom, "axiom cannot be null")),
                maxExplanations);
    }finally{__CLR4_5_29v9vlviclypd.R.flushNeeded();}}
}
