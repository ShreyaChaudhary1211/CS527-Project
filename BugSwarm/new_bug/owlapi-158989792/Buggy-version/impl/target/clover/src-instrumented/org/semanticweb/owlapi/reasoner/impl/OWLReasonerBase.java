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
package org.semanticweb.owlapi.reasoner.impl;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeListener;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.reasoner.BufferingMode;
import org.semanticweb.owlapi.reasoner.FreshEntityPolicy;
import org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public abstract class OWLReasonerBase implements OWLReasoner {public static class __CLR4_5_27j7jlvicleqm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntologyManager manager;
    @Nonnull
    private final OWLOntology rootOntology;
    @Nonnull
    private final BufferingMode bufferingMode;
    private final List<OWLOntologyChange> rawChanges = new ArrayList<>();
    @Nonnull
    private final Set<OWLAxiom> reasonerAxioms;
    private final long timeOut;
    @Nonnull
    private final OWLReasonerConfiguration configuration;
    @Nonnull
    private final OWLOntologyChangeListener ontologyChangeListener = new OWLOntologyChangeListener() {

        @Override
        public void
                ontologiesChanged(List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27j7jlvicleqm.R.inc(271);
            __CLR4_5_27j7jlvicleqm.R.inc(272);handleRawOntologyChanges(changes);
        }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}
    };

    protected OWLReasonerBase(@Nonnull OWLOntology rootOntology,
            @Nonnull OWLReasonerConfiguration configuration,
            @Nonnull BufferingMode bufferingMode) {try{__CLR4_5_27j7jlvicleqm.R.inc(273);
        __CLR4_5_27j7jlvicleqm.R.inc(274);this.rootOntology = checkNotNull(rootOntology,
                "rootOntology cannot be null");
        __CLR4_5_27j7jlvicleqm.R.inc(275);this.bufferingMode = checkNotNull(bufferingMode,
                "bufferingMode cannot be null");
        __CLR4_5_27j7jlvicleqm.R.inc(276);this.configuration = checkNotNull(configuration,
                "configuration cannot be null");
        __CLR4_5_27j7jlvicleqm.R.inc(277);timeOut = configuration.getTimeOut();
        __CLR4_5_27j7jlvicleqm.R.inc(278);manager = rootOntology.getOWLOntologyManager();
        __CLR4_5_27j7jlvicleqm.R.inc(279);manager.addOntologyChangeListener(ontologyChangeListener);
        __CLR4_5_27j7jlvicleqm.R.inc(280);reasonerAxioms = new HashSet<>();
        __CLR4_5_27j7jlvicleqm.R.inc(281);for (OWLOntology ont : rootOntology.getImportsClosure()) {{
            __CLR4_5_27j7jlvicleqm.R.inc(282);for (OWLAxiom ax : ont.getLogicalAxioms()) {{
                __CLR4_5_27j7jlvicleqm.R.inc(283);reasonerAxioms.add(ax.getAxiomWithoutAnnotations());
            }
            }__CLR4_5_27j7jlvicleqm.R.inc(284);for (OWLAxiom ax : ont.getAxioms(AxiomType.DECLARATION)) {{
                __CLR4_5_27j7jlvicleqm.R.inc(285);reasonerAxioms.add(ax.getAxiomWithoutAnnotations());
            }
        }}
    }}finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /** @return the configuration */
    @Nonnull
    public OWLReasonerConfiguration getReasonerConfiguration() {try{__CLR4_5_27j7jlvicleqm.R.inc(286);
        __CLR4_5_27j7jlvicleqm.R.inc(287);return configuration;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public BufferingMode getBufferingMode() {try{__CLR4_5_27j7jlvicleqm.R.inc(288);
        __CLR4_5_27j7jlvicleqm.R.inc(289);return bufferingMode;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public long getTimeOut() {try{__CLR4_5_27j7jlvicleqm.R.inc(290);
        __CLR4_5_27j7jlvicleqm.R.inc(291);return timeOut;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public OWLOntology getRootOntology() {try{__CLR4_5_27j7jlvicleqm.R.inc(292);
        __CLR4_5_27j7jlvicleqm.R.inc(293);return rootOntology;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /**
     * Handles raw ontology changes. If the reasoner is a buffering reasoner
     * then the changes will be stored in a buffer. If the reasoner is a
     * non-buffering reasoner then the changes will be automatically flushed
     * through to the change filter and passed on to the reasoner.
     * 
     * @param changes
     *        The list of raw changes.
     */
    protected synchronized void handleRawOntologyChanges(
            @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27j7jlvicleqm.R.inc(294);
        __CLR4_5_27j7jlvicleqm.R.inc(295);rawChanges.addAll(changes);
        // We auto-flush the changes if the reasoner is non-buffering
        __CLR4_5_27j7jlvicleqm.R.inc(296);if ((((bufferingMode.equals(BufferingMode.NON_BUFFERING))&&(__CLR4_5_27j7jlvicleqm.R.iget(297)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(298)==0&false))) {{
            __CLR4_5_27j7jlvicleqm.R.inc(299);flush();
        }
    }}finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public List<OWLOntologyChange> getPendingChanges() {try{__CLR4_5_27j7jlvicleqm.R.inc(300);
        __CLR4_5_27j7jlvicleqm.R.inc(301);return new ArrayList<>(rawChanges);
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getPendingAxiomAdditions() {try{__CLR4_5_27j7jlvicleqm.R.inc(302);
        __CLR4_5_27j7jlvicleqm.R.inc(303);Set<OWLAxiom> added = new HashSet<>();
        __CLR4_5_27j7jlvicleqm.R.inc(304);computeDiff(added, new HashSet<OWLAxiom>());
        __CLR4_5_27j7jlvicleqm.R.inc(305);return added;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getPendingAxiomRemovals() {try{__CLR4_5_27j7jlvicleqm.R.inc(306);
        __CLR4_5_27j7jlvicleqm.R.inc(307);Set<OWLAxiom> removed = new HashSet<>();
        __CLR4_5_27j7jlvicleqm.R.inc(308);computeDiff(new HashSet<OWLAxiom>(), removed);
        __CLR4_5_27j7jlvicleqm.R.inc(309);return removed;
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public void flush() {try{__CLR4_5_27j7jlvicleqm.R.inc(310);
        // Process the changes
        __CLR4_5_27j7jlvicleqm.R.inc(311);Set<OWLAxiom> added = new HashSet<>();
        __CLR4_5_27j7jlvicleqm.R.inc(312);Set<OWLAxiom> removed = new HashSet<>();
        __CLR4_5_27j7jlvicleqm.R.inc(313);computeDiff(added, removed);
        __CLR4_5_27j7jlvicleqm.R.inc(314);reasonerAxioms.removeAll(removed);
        __CLR4_5_27j7jlvicleqm.R.inc(315);reasonerAxioms.addAll(added);
        __CLR4_5_27j7jlvicleqm.R.inc(316);rawChanges.clear();
        __CLR4_5_27j7jlvicleqm.R.inc(317);if ((((!added.isEmpty() || !removed.isEmpty())&&(__CLR4_5_27j7jlvicleqm.R.iget(318)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(319)==0&false))) {{
            __CLR4_5_27j7jlvicleqm.R.inc(320);handleChanges(added, removed);
        }
    }}finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /**
     * Computes a diff of what axioms have been added and what axioms have been
     * removed from the list of pending changes. Note that even if the list of
     * pending changes is non-empty then there may be no changes for the
     * reasoner to deal with.
     * 
     * @param added
     *        The logical axioms that have been added to the imports closure of
     *        the reasoner root ontology
     * @param removed
     *        The logical axioms that have been removed from the imports closure
     *        of the reasoner root ontology
     */
    private void computeDiff(@Nonnull Set<OWLAxiom> added,
            @Nonnull Set<OWLAxiom> removed) {try{__CLR4_5_27j7jlvicleqm.R.inc(321);
        __CLR4_5_27j7jlvicleqm.R.inc(322);if ((((rawChanges.isEmpty())&&(__CLR4_5_27j7jlvicleqm.R.iget(323)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(324)==0&false))) {{
            __CLR4_5_27j7jlvicleqm.R.inc(325);return;
        }
        }__CLR4_5_27j7jlvicleqm.R.inc(326);for (OWLOntology ont : rootOntology.getImportsClosure()) {{
            __CLR4_5_27j7jlvicleqm.R.inc(327);for (OWLAxiom ax : ont.getLogicalAxioms()) {{
                __CLR4_5_27j7jlvicleqm.R.inc(328);if ((((!reasonerAxioms.contains(ax.getAxiomWithoutAnnotations()))&&(__CLR4_5_27j7jlvicleqm.R.iget(329)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(330)==0&false))) {{
                    __CLR4_5_27j7jlvicleqm.R.inc(331);added.add(ax);
                }
            }}
            }__CLR4_5_27j7jlvicleqm.R.inc(332);for (OWLAxiom ax : ont.getAxioms(AxiomType.DECLARATION)) {{
                __CLR4_5_27j7jlvicleqm.R.inc(333);if ((((!reasonerAxioms.contains(ax.getAxiomWithoutAnnotations()))&&(__CLR4_5_27j7jlvicleqm.R.iget(334)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(335)==0&false))) {{
                    __CLR4_5_27j7jlvicleqm.R.inc(336);added.add(ax);
                }
            }}
        }}
        }__CLR4_5_27j7jlvicleqm.R.inc(337);for (OWLAxiom ax : reasonerAxioms) {{
            assert (((ax != null)&&(__CLR4_5_27j7jlvicleqm.R.iget(338)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(339)==0&false));
            __CLR4_5_27j7jlvicleqm.R.inc(340);if ((((!rootOntology.containsAxiom(ax, Imports.INCLUDED,
                    AxiomAnnotations.CONSIDER_AXIOM_ANNOTATIONS))&&(__CLR4_5_27j7jlvicleqm.R.iget(341)!=0|true))||(__CLR4_5_27j7jlvicleqm.R.iget(342)==0&false))) {{
                __CLR4_5_27j7jlvicleqm.R.inc(343);removed.add(ax);
            }
        }}
    }}finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /**
     * Gets the axioms that should be currently being reasoned over.
     * 
     * @return A collections of axioms (not containing duplicates) that the
     *         reasoner should be taking into consideration when reasoning. This
     *         set of axioms many not correspond to the current state of the
     *         imports closure of the reasoner root ontology if the reasoner is
     *         buffered.
     */
    @Nonnull
    public Collection<OWLAxiom> getReasonerAxioms() {try{__CLR4_5_27j7jlvicleqm.R.inc(344);
        __CLR4_5_27j7jlvicleqm.R.inc(345);return new ArrayList<>(reasonerAxioms);
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /**
     * Asks the reasoner implementation to handle axiom additions and removals
     * from the imports closure of the root ontology. The changes will not
     * include annotation axiom additions and removals.
     * 
     * @param addAxioms
     *        The axioms to be added to the reasoner.
     * @param removeAxioms
     *        The axioms to be removed from the reasoner
     */
    protected abstract void handleChanges(@Nonnull Set<OWLAxiom> addAxioms,
            @Nonnull Set<OWLAxiom> removeAxioms);

    @Override
    public void dispose() {try{__CLR4_5_27j7jlvicleqm.R.inc(346);
        __CLR4_5_27j7jlvicleqm.R.inc(347);manager.removeOntologyChangeListener(ontologyChangeListener);
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public FreshEntityPolicy getFreshEntityPolicy() {try{__CLR4_5_27j7jlvicleqm.R.inc(348);
        __CLR4_5_27j7jlvicleqm.R.inc(349);return configuration.getFreshEntityPolicy();
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    @Override
    public IndividualNodeSetPolicy getIndividualNodeSetPolicy() {try{__CLR4_5_27j7jlvicleqm.R.inc(350);
        __CLR4_5_27j7jlvicleqm.R.inc(351);return configuration.getIndividualNodeSetPolicy();
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}

    /** @return the data factory */
    @Nonnull
    public OWLDataFactory getOWLDataFactory() {try{__CLR4_5_27j7jlvicleqm.R.inc(352);
        __CLR4_5_27j7jlvicleqm.R.inc(353);return rootOntology.getOWLOntologyManager().getOWLDataFactory();
    }finally{__CLR4_5_27j7jlvicleqm.R.flushNeeded();}}
}
