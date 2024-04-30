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

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAPIPreconditions;
import org.semanticweb.owlapi.util.OWLEntityCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor;
import com.clarkparsia.owlapi.explanation.util.OntologyUtils;
import com.clarkparsia.owlapi.explanation.util.SilentExplanationProgressMonitor;

/** HST explanation generator. */
public class HSTExplanationGenerator implements MultipleExplanationGenerator {public static class __CLR4_5_2akaklviclyq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(HSTExplanationGenerator.class);
    @Nonnull
    private final TransactionAwareSingleExpGen singleExplanationGenerator;
    @Nonnull
    private ExplanationProgressMonitor progressMonitor = new SilentExplanationProgressMonitor();

    /**
     * Instantiates a new hST explanation generator.
     * 
     * @param singleExplanationGenerator
     *        explanation generator to use
     */
    public HSTExplanationGenerator(
            @Nonnull TransactionAwareSingleExpGen singleExplanationGenerator) {try{__CLR4_5_2akaklviclyq5.R.inc(380);
        __CLR4_5_2akaklviclyq5.R.inc(381);this.singleExplanationGenerator = checkNotNull(
                singleExplanationGenerator,
                "singleExplanationGenerator cannot be null");
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public void setProgressMonitor(ExplanationProgressMonitor progressMonitor) {try{__CLR4_5_2akaklviclyq5.R.inc(382);
        __CLR4_5_2akaklviclyq5.R.inc(383);this.progressMonitor = checkNotNull(progressMonitor,
                "progressMonitor cannot be null");
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public OWLOntologyManager getOntologyManager() {try{__CLR4_5_2akaklviclyq5.R.inc(384);
        __CLR4_5_2akaklviclyq5.R.inc(385);return singleExplanationGenerator.getOntologyManager();
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public OWLOntology getOntology() {try{__CLR4_5_2akaklviclyq5.R.inc(386);
        __CLR4_5_2akaklviclyq5.R.inc(387);return singleExplanationGenerator.getOntology();
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public OWLReasoner getReasoner() {try{__CLR4_5_2akaklviclyq5.R.inc(388);
        __CLR4_5_2akaklviclyq5.R.inc(389);return singleExplanationGenerator.getReasoner();
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public OWLReasonerFactory getReasonerFactory() {try{__CLR4_5_2akaklviclyq5.R.inc(390);
        __CLR4_5_2akaklviclyq5.R.inc(391);return singleExplanationGenerator.getReasonerFactory();
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Gets the single explanation generator.
     * 
     * @return the explanation generator
     */
    @Nonnull
    public TransactionAwareSingleExpGen getSingleExplanationGenerator() {try{__CLR4_5_2akaklviclyq5.R.inc(392);
        __CLR4_5_2akaklviclyq5.R.inc(393);return singleExplanationGenerator;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getExplanation(OWLClassExpression unsatClass) {try{__CLR4_5_2akaklviclyq5.R.inc(394);
        __CLR4_5_2akaklviclyq5.R.inc(395);return singleExplanationGenerator.getExplanation(unsatClass);
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public Set<Set<OWLAxiom>> getExplanations(OWLClassExpression unsatClass) {try{__CLR4_5_2akaklviclyq5.R.inc(396);
        __CLR4_5_2akaklviclyq5.R.inc(397);return getExplanations(unsatClass, 0);
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_2akaklviclyq5.R.inc(398);
        __CLR4_5_2akaklviclyq5.R.inc(399);singleExplanationGenerator.dispose();
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    @Override
    public Set<Set<OWLAxiom>> getExplanations(OWLClassExpression unsatClass,
            @Nonnegative int maxExplanations) {try{__CLR4_5_2akaklviclyq5.R.inc(400);
        __CLR4_5_2akaklviclyq5.R.inc(401);OWLAPIPreconditions.checkNotNegative(maxExplanations,
                "max explanations cannot be negative");
        __CLR4_5_2akaklviclyq5.R.inc(402);Object max = (((maxExplanations == 0 )&&(__CLR4_5_2akaklviclyq5.R.iget(403)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(404)==0&false))? "all" : maxExplanations;
        __CLR4_5_2akaklviclyq5.R.inc(405);LOGGER.info("Get {} explanation(s) for: {}", max, unsatClass);
        __CLR4_5_2akaklviclyq5.R.inc(406);try {
            __CLR4_5_2akaklviclyq5.R.inc(407);Set<OWLAxiom> firstMups = getExplanation(unsatClass);
            __CLR4_5_2akaklviclyq5.R.inc(408);if ((((firstMups.isEmpty())&&(__CLR4_5_2akaklviclyq5.R.iget(409)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(410)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(411);return CollectionFactory.emptySet();
            }
            }__CLR4_5_2akaklviclyq5.R.inc(412);Set<Set<OWLAxiom>> allMups = new LinkedHashSet<>();
            __CLR4_5_2akaklviclyq5.R.inc(413);progressMonitor.foundExplanation(firstMups);
            __CLR4_5_2akaklviclyq5.R.inc(414);allMups.add(firstMups);
            __CLR4_5_2akaklviclyq5.R.inc(415);Set<Set<OWLAxiom>> satPaths = new HashSet<>();
            __CLR4_5_2akaklviclyq5.R.inc(416);Set<OWLAxiom> currentPathContents = new HashSet<>();
            __CLR4_5_2akaklviclyq5.R.inc(417);singleExplanationGenerator.beginTransaction();
            __CLR4_5_2akaklviclyq5.R.inc(418);try {
                __CLR4_5_2akaklviclyq5.R.inc(419);constructHittingSetTree(unsatClass, firstMups, allMups,
                        satPaths, currentPathContents, maxExplanations);
            } finally {
                __CLR4_5_2akaklviclyq5.R.inc(420);singleExplanationGenerator.endTransaction();
            }
            __CLR4_5_2akaklviclyq5.R.inc(421);progressMonitor.foundAllExplanations();
            __CLR4_5_2akaklviclyq5.R.inc(422);return allMups;
        } catch (OWLException e) {
            __CLR4_5_2akaklviclyq5.R.inc(423);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    // Hitting Set Stuff
    /**
     * Orders the axioms in a single MUPS by the frequency of which they appear
     * in all MUPS.
     * 
     * @param mups
     *        The MUPS containing the axioms to be ordered
     * @param allMups
     *        The set of all MUPS which is used to calculate the ordering
     * @return the ordered mups
     */
    @Nonnull
    private static List<OWLAxiom> getOrderedMUPS(@Nonnull List<OWLAxiom> mups,
            @Nonnull final Set<Set<OWLAxiom>> allMups) {try{__CLR4_5_2akaklviclyq5.R.inc(424);
        __CLR4_5_2akaklviclyq5.R.inc(425);Comparator<OWLAxiom> mupsComparator = new Comparator<OWLAxiom>() {

            @Override
            public int compare(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_2akaklviclyq5.R.inc(426);
                // The axiom that appears in most MUPS has the lowest index
                // in the list
                assert (((o1 != null)&&(__CLR4_5_2akaklviclyq5.R.iget(427)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(428)==0&false));
                assert (((o2 != null)&&(__CLR4_5_2akaklviclyq5.R.iget(429)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(430)==0&false));
                __CLR4_5_2akaklviclyq5.R.inc(431);int occ1 = getOccurrences(o1, allMups);
                __CLR4_5_2akaklviclyq5.R.inc(432);int occ2 = getOccurrences(o2, allMups);
                __CLR4_5_2akaklviclyq5.R.inc(433);return -occ1 + occ2;
            }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}
        };
        __CLR4_5_2akaklviclyq5.R.inc(434);Collections.sort(mups, mupsComparator);
        __CLR4_5_2akaklviclyq5.R.inc(435);return mups;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Given an axiom and a set of axioms this method determines how many sets
     * contain the axiom.
     * 
     * @param ax
     *        The axiom that will be counted.
     * @param axiomSets
     *        The sets to count from
     * @return the occurrences
     */
    protected static int getOccurrences(@Nonnull OWLAxiom ax,
            @Nonnull Set<Set<OWLAxiom>> axiomSets) {try{__CLR4_5_2akaklviclyq5.R.inc(436);
        __CLR4_5_2akaklviclyq5.R.inc(437);int count = 0;
        __CLR4_5_2akaklviclyq5.R.inc(438);for (Set<OWLAxiom> axioms : axiomSets) {{
            __CLR4_5_2akaklviclyq5.R.inc(439);if ((((axioms.contains(ax))&&(__CLR4_5_2akaklviclyq5.R.iget(440)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(441)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(442);count++;
            }
        }}
        }__CLR4_5_2akaklviclyq5.R.inc(443);return count;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Returns the entities referenced in an axiom.
     * 
     * @param axiom
     *        axiom whose signature is being computed
     * @return the entities referenced in the axiom
     */
    @Nonnull
    private static Set<OWLEntity> getSignature(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2akaklviclyq5.R.inc(444);
        __CLR4_5_2akaklviclyq5.R.inc(445);Set<OWLEntity> toReturn = new HashSet<>();
        __CLR4_5_2akaklviclyq5.R.inc(446);OWLEntityCollector collector = new OWLEntityCollector(toReturn);
        __CLR4_5_2akaklviclyq5.R.inc(447);axiom.accept(collector);
        __CLR4_5_2akaklviclyq5.R.inc(448);return toReturn;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * This is a recursive method that builds a hitting set tree to obtain all
     * justifications for an unsatisfiable class.
     * 
     * @param unsatClass
     *        the unsat class
     * @param mups
     *        The current justification for the current class. This corresponds
     *        to a node in the hitting set tree.
     * @param allMups
     *        All of the MUPS that have been found - this set gets populated
     *        over the course of the tree building process. Initially this
     *        should just contain the first justification
     * @param satPaths
     *        Paths that have been completed.
     * @param currentPathContents
     *        The contents of the current path. Initially this should be an
     *        empty set.
     * @param maxExplanations
     *        the max explanations
     * @throws OWLException
     *         the oWL exception
     */
    private void constructHittingSetTree(
            @Nonnull OWLClassExpression unsatClass,
            @Nonnull Set<OWLAxiom> mups, @Nonnull Set<Set<OWLAxiom>> allMups,
            @Nonnull Set<Set<OWLAxiom>> satPaths,
            @Nonnull Set<OWLAxiom> currentPathContents, int maxExplanations)
            throws OWLException {try{__CLR4_5_2akaklviclyq5.R.inc(449);
        __CLR4_5_2akaklviclyq5.R.inc(450);LOGGER.info("MUPS {}: {}", allMups.size(), mups);
        __CLR4_5_2akaklviclyq5.R.inc(451);if ((((progressMonitor.isCancelled())&&(__CLR4_5_2akaklviclyq5.R.iget(452)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(453)==0&false))) {{
            __CLR4_5_2akaklviclyq5.R.inc(454);return;
        }
        // We go through the current mups, axiom by axiom, and extend the tree
        // with edges for each axiom
        }__CLR4_5_2akaklviclyq5.R.inc(455);List<OWLAxiom> orderedMups = getOrderedMUPS(new ArrayList<>(mups),
                allMups);
        __CLR4_5_2akaklviclyq5.R.inc(456);while ((((!orderedMups.isEmpty())&&(__CLR4_5_2akaklviclyq5.R.iget(457)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(458)==0&false))) {{
            __CLR4_5_2akaklviclyq5.R.inc(459);if ((((progressMonitor.isCancelled())&&(__CLR4_5_2akaklviclyq5.R.iget(460)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(461)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(462);return;
            }
            }__CLR4_5_2akaklviclyq5.R.inc(463);OWLAxiom axiom = orderedMups.get(0);
            assert (((axiom != null)&&(__CLR4_5_2akaklviclyq5.R.iget(464)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(465)==0&false));
            __CLR4_5_2akaklviclyq5.R.inc(466);orderedMups.remove(0);
            __CLR4_5_2akaklviclyq5.R.inc(467);if ((((allMups.size() == maxExplanations)&&(__CLR4_5_2akaklviclyq5.R.iget(468)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(469)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(470);LOGGER.info("Computed {} explanations", maxExplanations);
                __CLR4_5_2akaklviclyq5.R.inc(471);return;
            }
            }__CLR4_5_2akaklviclyq5.R.inc(472);LOGGER.info("Removing axiom: {} {} more removed: {}", axiom,
                    currentPathContents.size(), currentPathContents);
            // Removal may have dereferenced some entities, if so declarations
            // are added
            __CLR4_5_2akaklviclyq5.R.inc(473);List<OWLDeclarationAxiom> temporaryDeclarations = new ArrayList<>();
            __CLR4_5_2akaklviclyq5.R.inc(474);Set<OWLOntology> ontologies = removeAxiomAndAddDeclarations(axiom,
                    temporaryDeclarations);
            __CLR4_5_2akaklviclyq5.R.inc(475);currentPathContents.add(axiom);
            __CLR4_5_2akaklviclyq5.R.inc(476);boolean earlyTermination = checkEarlyTermination(satPaths,
                    currentPathContents);
            __CLR4_5_2akaklviclyq5.R.inc(477);if ((((!earlyTermination)&&(__CLR4_5_2akaklviclyq5.R.iget(478)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(479)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(480);orderedMups = recurse(unsatClass, allMups, satPaths,
                        currentPathContents, maxExplanations, orderedMups,
                        axiom);
            }
            }__CLR4_5_2akaklviclyq5.R.inc(481);backtrack(currentPathContents, axiom, temporaryDeclarations,
                    ontologies);
        }
    }}finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Check early termination.
     * 
     * @param satPaths
     *        the sat paths
     * @param currentPathContents
     *        the current path contents
     * @return true, if successful
     */
    private static boolean checkEarlyTermination(
            @Nonnull Set<Set<OWLAxiom>> satPaths,
            @Nonnull Set<OWLAxiom> currentPathContents) {try{__CLR4_5_2akaklviclyq5.R.inc(482);
        __CLR4_5_2akaklviclyq5.R.inc(483);boolean earlyTermination = false;
        // Early path termination. If our path contents are the superset of
        // the contents of a path then we can terminate here.
        __CLR4_5_2akaklviclyq5.R.inc(484);for (Set<OWLAxiom> satPath : satPaths) {{
            __CLR4_5_2akaklviclyq5.R.inc(485);if ((((currentPathContents.containsAll(satPath))&&(__CLR4_5_2akaklviclyq5.R.iget(486)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(487)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(488);earlyTermination = true;
                __CLR4_5_2akaklviclyq5.R.inc(489);LOGGER.info("Stop - satisfiable (early termination)");
                __CLR4_5_2akaklviclyq5.R.inc(490);break;
            }
        }}
        }__CLR4_5_2akaklviclyq5.R.inc(491);return earlyTermination;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Recurse.
     * 
     * @param unsatClass
     *        the unsat class
     * @param allMups
     *        the all mups
     * @param satPaths
     *        the sat paths
     * @param currentPathContents
     *        the current path contents
     * @param maxExplanations
     *        the max explanations
     * @param orderedMups
     *        the ordered mups
     * @param axiom
     *        the axiom
     * @return the list
     * @throws OWLException
     *         the oWL exception
     */
    @Nonnull
    private List<OWLAxiom> recurse(@Nonnull OWLClassExpression unsatClass,
            @Nonnull Set<Set<OWLAxiom>> allMups,
            @Nonnull Set<Set<OWLAxiom>> satPaths,
            @Nonnull Set<OWLAxiom> currentPathContents, int maxExplanations,
            @Nonnull List<OWLAxiom> orderedMups, @Nonnull OWLAxiom axiom)
            throws OWLException {try{__CLR4_5_2akaklviclyq5.R.inc(492);
        __CLR4_5_2akaklviclyq5.R.inc(493);Set<OWLAxiom> newMUPS = getNewMUPS(unsatClass, allMups,
                currentPathContents);
        // Generate a new node - i.e. a new justification set
        __CLR4_5_2akaklviclyq5.R.inc(494);if ((((newMUPS.contains(axiom))&&(__CLR4_5_2akaklviclyq5.R.iget(495)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(496)==0&false))) {{
            // How can this be the case???
            __CLR4_5_2akaklviclyq5.R.inc(497);throw new OWLRuntimeException(
                    "Explanation contains removed axiom: " + axiom);
        }
        }__CLR4_5_2akaklviclyq5.R.inc(498);if ((((!newMUPS.isEmpty())&&(__CLR4_5_2akaklviclyq5.R.iget(499)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(500)==0&false))) {{
            // Note that getting a previous justification does not mean
            // we can stop. stopping here causes some justifications to
            // be missed
            __CLR4_5_2akaklviclyq5.R.inc(501);allMups.add(newMUPS);
            __CLR4_5_2akaklviclyq5.R.inc(502);progressMonitor.foundExplanation(newMUPS);
            // Recompute priority here?
            __CLR4_5_2akaklviclyq5.R.inc(503);constructHittingSetTree(unsatClass, newMUPS, allMups, satPaths,
                    currentPathContents, maxExplanations);
            // We have found a new MUPS, so recalculate the ordering
            // axioms in the MUPS at the current level
            __CLR4_5_2akaklviclyq5.R.inc(504);return getOrderedMUPS(orderedMups, allMups);
        } }else {{
            __CLR4_5_2akaklviclyq5.R.inc(505);LOGGER.info("Stop - satisfiable");
            // End of current path - add it to the list of paths
            __CLR4_5_2akaklviclyq5.R.inc(506);satPaths.add(new HashSet<>(currentPathContents));
        }
        }__CLR4_5_2akaklviclyq5.R.inc(507);return orderedMups;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    private void backtrack(@Nonnull Set<OWLAxiom> currentPathContents,
            @Nonnull OWLAxiom axiom,
            @Nonnull List<OWLDeclarationAxiom> temporaryDeclarations,
            @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_2akaklviclyq5.R.inc(508);
        // Back track - go one level up the tree and run for the next axiom
        __CLR4_5_2akaklviclyq5.R.inc(509);currentPathContents.remove(axiom);
        __CLR4_5_2akaklviclyq5.R.inc(510);LOGGER.info("Restoring axiom: {}", axiom);
        // Remove any temporary declarations
        __CLR4_5_2akaklviclyq5.R.inc(511);for (OWLDeclarationAxiom decl : temporaryDeclarations) {{
            assert (((decl != null)&&(__CLR4_5_2akaklviclyq5.R.iget(512)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(513)==0&false));
            __CLR4_5_2akaklviclyq5.R.inc(514);OntologyUtils.removeAxiom(decl, getReasoner().getRootOntology()
                    .getImportsClosure(), getOntologyManager());
        }
        // Done with the axiom that was removed. Add it back in
        }__CLR4_5_2akaklviclyq5.R.inc(515);OntologyUtils.addAxiom(axiom, ontologies, getOntologyManager());
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Gets the new mups.
     * 
     * @param unsatClass
     *        the unsat class
     * @param allMups
     *        the all mups
     * @param currentPathContents
     *        the current path contents
     * @return the new mups
     */
    @Nonnull
    private Set<OWLAxiom> getNewMUPS(@Nonnull OWLClassExpression unsatClass,
            @Nonnull Set<Set<OWLAxiom>> allMups,
            @Nonnull Set<OWLAxiom> currentPathContents) {try{__CLR4_5_2akaklviclyq5.R.inc(516);
        __CLR4_5_2akaklviclyq5.R.inc(517);Set<OWLAxiom> newMUPS = null;
        __CLR4_5_2akaklviclyq5.R.inc(518);for (Set<OWLAxiom> foundMUPS : allMups) {{
            __CLR4_5_2akaklviclyq5.R.inc(519);Set<OWLAxiom> foundMUPSCopy = new HashSet<>(foundMUPS);
            __CLR4_5_2akaklviclyq5.R.inc(520);foundMUPSCopy.retainAll(currentPathContents);
            __CLR4_5_2akaklviclyq5.R.inc(521);if ((((foundMUPSCopy.isEmpty())&&(__CLR4_5_2akaklviclyq5.R.iget(522)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(523)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(524);newMUPS = foundMUPS;
                __CLR4_5_2akaklviclyq5.R.inc(525);break;
            }
        }}
        }__CLR4_5_2akaklviclyq5.R.inc(526);if ((((newMUPS == null)&&(__CLR4_5_2akaklviclyq5.R.iget(527)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(528)==0&false))) {{
            __CLR4_5_2akaklviclyq5.R.inc(529);newMUPS = getExplanation(unsatClass);
        }
        }__CLR4_5_2akaklviclyq5.R.inc(530);return newMUPS;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Removes the axiom and add declarations.
     * 
     * @param axiom
     *        the axiom
     * @param temporaryDeclarations
     *        the temporary declarations
     * @return the sets the
     */
    @Nonnull
    private Set<OWLOntology> removeAxiomAndAddDeclarations(
            @Nonnull OWLAxiom axiom,
            @Nonnull List<OWLDeclarationAxiom> temporaryDeclarations) {try{__CLR4_5_2akaklviclyq5.R.inc(531);
        // Remove the current axiom from all the ontologies it is included
        // in
        __CLR4_5_2akaklviclyq5.R.inc(532);Set<OWLOntology> ontologies = OntologyUtils.removeAxiom(axiom,
                getReasoner().getRootOntology().getImportsClosure(),
                getOntologyManager());
        __CLR4_5_2akaklviclyq5.R.inc(533);collectTemporaryDeclarations(axiom, temporaryDeclarations);
        __CLR4_5_2akaklviclyq5.R.inc(534);for (OWLDeclarationAxiom decl : temporaryDeclarations) {{
            assert (((decl != null)&&(__CLR4_5_2akaklviclyq5.R.iget(535)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(536)==0&false));
            __CLR4_5_2akaklviclyq5.R.inc(537);OntologyUtils.addAxiom(decl, getReasoner().getRootOntology()
                    .getImportsClosure(), getOntologyManager());
        }
        }__CLR4_5_2akaklviclyq5.R.inc(538);return ontologies;
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    private void collectTemporaryDeclarations(@Nonnull OWLAxiom axiom,
            @Nonnull List<OWLDeclarationAxiom> temporaryDeclarations) {try{__CLR4_5_2akaklviclyq5.R.inc(539);
        __CLR4_5_2akaklviclyq5.R.inc(540);for (OWLEntity e : getSignature(axiom)) {{
            assert (((e != null)&&(__CLR4_5_2akaklviclyq5.R.iget(541)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(542)==0&false));
            __CLR4_5_2akaklviclyq5.R.inc(543);boolean referenced = getReasoner().getRootOntology().isDeclared(e,
                    INCLUDED);
            __CLR4_5_2akaklviclyq5.R.inc(544);if ((((!referenced)&&(__CLR4_5_2akaklviclyq5.R.iget(545)!=0|true))||(__CLR4_5_2akaklviclyq5.R.iget(546)==0&false))) {{
                __CLR4_5_2akaklviclyq5.R.inc(547);temporaryDeclarations.add(getDeclaration(e));
            }
        }}
    }}finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}

    /**
     * Gets the declaration.
     * 
     * @param e
     *        the e
     * @return the declaration
     */
    @Nonnull
    private OWLDeclarationAxiom getDeclaration(@Nonnull OWLEntity e) {try{__CLR4_5_2akaklviclyq5.R.inc(548);
        __CLR4_5_2akaklviclyq5.R.inc(549);return getOntologyManager().getOWLDataFactory().getOWLDeclarationAxiom(
                e);
    }finally{__CLR4_5_2akaklviclyq5.R.flushNeeded();}}
}
