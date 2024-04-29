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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generates an ontology based on inferred axioms which are essentially supplied
 * by a reasoner. The generator can be configured with
 * {@code InferredAxiomGenerator}s which generate specific kinds of axioms e.g.
 * subclass axioms.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class InferredOntologyGenerator {public static class __CLR4_5_26kb6kblvickq9z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,8538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger logger = LoggerFactory
            .getLogger(InferredOntologyGenerator.class.getName());
    // The reasoner which is used to compute the inferred axioms
    @Nonnull
    private final OWLReasoner reasoner;
    @Nonnull
    private final List<InferredAxiomGenerator<? extends OWLAxiom>> axiomGenerators;

    /**
     * @param reasoner
     *        the reasoner to use
     * @param axiomGenerators
     *        the axiom generators to use
     */
    public InferredOntologyGenerator(
            @Nonnull OWLReasoner reasoner,
            @Nonnull List<InferredAxiomGenerator<? extends OWLAxiom>> axiomGenerators) {try{__CLR4_5_26kb6kblvickq9z.R.inc(8507);
        __CLR4_5_26kb6kblvickq9z.R.inc(8508);this.reasoner = checkNotNull(reasoner, "reasoner cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8509);checkNotNull(axiomGenerators, "axiomGenerators cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8510);this.axiomGenerators = new ArrayList<>(axiomGenerators);
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    /**
     * @param reasoner
     *        the reasoner to use
     */
    public InferredOntologyGenerator(@Nonnull OWLReasoner reasoner) {
        this(reasoner, generators());__CLR4_5_26kb6kblvickq9z.R.inc(8512);try{__CLR4_5_26kb6kblvickq9z.R.inc(8511);
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    @Nonnull
    private static List<InferredAxiomGenerator<? extends OWLAxiom>>
            generators() {try{__CLR4_5_26kb6kblvickq9z.R.inc(8513);
        __CLR4_5_26kb6kblvickq9z.R.inc(8514);return CollectionFactory
                .<InferredAxiomGenerator<? extends OWLAxiom>> list(
                        new InferredClassAssertionAxiomGenerator(),
                        new InferredDataPropertyCharacteristicAxiomGenerator(),
                        new InferredEquivalentClassAxiomGenerator(),
                        new InferredEquivalentDataPropertiesAxiomGenerator(),
                        new InferredEquivalentObjectPropertyAxiomGenerator(),
                        new InferredInverseObjectPropertiesAxiomGenerator(),
                        new InferredObjectPropertyCharacteristicAxiomGenerator(),
                        new InferredPropertyAssertionGenerator(),
                        new InferredSubClassAxiomGenerator(),
                        new InferredSubDataPropertyAxiomGenerator(),
                        new InferredSubObjectPropertyAxiomGenerator());
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    /** @return the axiom generators */
    @Nonnull
    public List<InferredAxiomGenerator<?>> getAxiomGenerators() {try{__CLR4_5_26kb6kblvickq9z.R.inc(8515);
        __CLR4_5_26kb6kblvickq9z.R.inc(8516);return new ArrayList<>(axiomGenerators);
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    /**
     * Adds a generator if it isn't already in the list of generators.
     * 
     * @param generator
     *        The generator to be added.
     */
    public void addGenerator(@Nonnull InferredAxiomGenerator<?> generator) {try{__CLR4_5_26kb6kblvickq9z.R.inc(8517);
        __CLR4_5_26kb6kblvickq9z.R.inc(8518);checkNotNull(generator, "generator cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8519);if ((((!axiomGenerators.contains(generator))&&(__CLR4_5_26kb6kblvickq9z.R.iget(8520)!=0|true))||(__CLR4_5_26kb6kblvickq9z.R.iget(8521)==0&false))) {{
            __CLR4_5_26kb6kblvickq9z.R.inc(8522);axiomGenerators.add(generator);
        }
    }}finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    /**
     * Removes a generator.
     * 
     * @param generator
     *        the generator to be removed
     */
    public void removeGenerator(@Nonnull InferredAxiomGenerator<?> generator) {try{__CLR4_5_26kb6kblvickq9z.R.inc(8523);
        __CLR4_5_26kb6kblvickq9z.R.inc(8524);checkNotNull(generator, "generator cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8525);axiomGenerators.remove(generator);
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}

    /**
     * Adds 'inferred axioms' to an ontology using the generators that have been
     * registered with this {@code InferredAxiomGenerator}.
     * 
     * @param df
     *        data factory.
     * @param ontology
     *        The ontology which the inferred axioms will be added to
     * @throws OWLOntologyChangeException
     *         If there was a problem adding the inferred axioms to the
     *         specified ontology.
     */
    public void fillOntology(@Nonnull OWLDataFactory df,
            @Nonnull OWLOntology ontology) {try{__CLR4_5_26kb6kblvickq9z.R.inc(8526);
        __CLR4_5_26kb6kblvickq9z.R.inc(8527);checkNotNull(df, "df cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8528);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_26kb6kblvickq9z.R.inc(8529);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_26kb6kblvickq9z.R.inc(8530);for (InferredAxiomGenerator<? extends OWLAxiom> axiomGenerator : axiomGenerators) {{
            __CLR4_5_26kb6kblvickq9z.R.inc(8531);try {
                __CLR4_5_26kb6kblvickq9z.R.inc(8532);for (OWLAxiom ax : axiomGenerator.createAxioms(df, reasoner)) {{
                    assert (((ax != null)&&(__CLR4_5_26kb6kblvickq9z.R.iget(8533)!=0|true))||(__CLR4_5_26kb6kblvickq9z.R.iget(8534)==0&false));
                    __CLR4_5_26kb6kblvickq9z.R.inc(8535);changes.add(new AddAxiom(ontology, ax));
                }
            }} catch (Exception e) {
                __CLR4_5_26kb6kblvickq9z.R.inc(8536);logger.warn("Error generating {} axioms using {}, version {}",
                        axiomGenerator.getLabel(), reasoner.getReasonerName(),
                        reasoner.getReasonerVersion(), e);
            }
        }
        }__CLR4_5_26kb6kblvickq9z.R.inc(8537);ontology.getOWLOntologyManager().applyChanges(changes);
    }finally{__CLR4_5_26kb6kblvickq9z.R.flushNeeded();}}
}
