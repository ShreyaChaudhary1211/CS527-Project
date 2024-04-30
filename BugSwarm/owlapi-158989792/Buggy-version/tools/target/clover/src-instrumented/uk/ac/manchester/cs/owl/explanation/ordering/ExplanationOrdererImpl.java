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
package uk.ac.manchester.cs.owl.explanation.ordering;

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter;

/**
 * Provides ordering and indenting of explanations based on various ordering
 * heuristics.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class ExplanationOrdererImpl implements ExplanationOrderer {public static class __CLR4_5_221g21glviclzzn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,3046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Set<OWLAxiom> currentExplanation;
    @Nonnull
    private final Map<OWLEntity, Set<OWLAxiom>> lhs2AxiomMap = new HashMap<>();
    @Nonnull
    private final Map<OWLAxiom, Set<OWLEntity>> entitiesByAxiomRHS = new HashMap<>();
    @Nonnull
    private final SeedExtractor seedExtractor = new SeedExtractor();
    @Nonnull
    private final OWLOntologyManager man;
    private OWLOntology ont;
    @Nonnull
    private final Map<OWLObject, Set<OWLAxiom>> mappedAxioms = new HashMap<>();
    @Nonnull
    private final Set<OWLAxiom> consumedAxioms = new HashSet<>();
    @Nonnull
    private final Set<AxiomType<?>> passTypes = new HashSet<>();

    /**
     * Instantiates a new explanation orderer impl.
     * 
     * @param m
     *        the manager to use
     */
    public ExplanationOrdererImpl(@Nonnull OWLOntologyManager m) {try{__CLR4_5_221g21glviclzzn.R.inc(2644);
        __CLR4_5_221g21glviclzzn.R.inc(2645);currentExplanation = CollectionFactory.emptySet();
        __CLR4_5_221g21glviclzzn.R.inc(2646);man = checkNotNull(m, "m cannot be null");
        // I'm not sure what to do with disjoint classes yet. At the
        // moment, we just shove them at the end at the top level.
        __CLR4_5_221g21glviclzzn.R.inc(2647);passTypes.add(AxiomType.DISJOINT_CLASSES);
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_221g21glviclzzn.R.inc(2648);
        __CLR4_5_221g21glviclzzn.R.inc(2649);lhs2AxiomMap.clear();
        __CLR4_5_221g21glviclzzn.R.inc(2650);entitiesByAxiomRHS.clear();
        __CLR4_5_221g21glviclzzn.R.inc(2651);consumedAxioms.clear();
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    @Override
    public ExplanationTree getOrderedExplanation(@Nonnull OWLAxiom entailment,
        @Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_221g21glviclzzn.R.inc(2652);
        __CLR4_5_221g21glviclzzn.R.inc(2653);currentExplanation = new HashSet<>(axioms);
        __CLR4_5_221g21glviclzzn.R.inc(2654);buildIndices();
        __CLR4_5_221g21glviclzzn.R.inc(2655);ExplanationTree root = new EntailedAxiomTree(entailment);
        __CLR4_5_221g21glviclzzn.R.inc(2656);insertChildren(seedExtractor.getSource(entailment), root);
        __CLR4_5_221g21glviclzzn.R.inc(2657);OWLEntity currentTarget = seedExtractor.getTarget(entailment);
        __CLR4_5_221g21glviclzzn.R.inc(2658);Set<OWLAxiom> axs = root.getUserObjectClosure();
        __CLR4_5_221g21glviclzzn.R.inc(2659);List<OWLAxiom> rootAxioms = new ArrayList<>();
        __CLR4_5_221g21glviclzzn.R.inc(2660);for (OWLAxiom ax : axioms) {{
            __CLR4_5_221g21glviclzzn.R.inc(2661);if ((((!axs.contains(ax))&&(__CLR4_5_221g21glviclzzn.R.iget(2662)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2663)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2664);rootAxioms.add(ax);
            }
        }}
        }__CLR4_5_221g21glviclzzn.R.inc(2665);Collections.sort(rootAxioms, new TargetAxiomsComparator(
            getTargetAxioms(currentTarget)));
        __CLR4_5_221g21glviclzzn.R.inc(2666);for (OWLAxiom ax : rootAxioms) {{
            assert (((ax != null)&&(__CLR4_5_221g21glviclzzn.R.iget(2667)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2668)==0&false));
            __CLR4_5_221g21glviclzzn.R.inc(2669);root.addChild(new ExplanationTree(ax));
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2670);return root;
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /**
     * Gets the target axioms.
     * 
     * @param currentTarget
     *        the current target
     * @return the target axioms
     */
    @Nonnull
    private Set<OWLAxiom> getTargetAxioms(@Nonnull OWLEntity currentTarget) {try{__CLR4_5_221g21glviclzzn.R.inc(2671);
        __CLR4_5_221g21glviclzzn.R.inc(2672);Set<OWLAxiom> targetAxioms = new HashSet<>();
        __CLR4_5_221g21glviclzzn.R.inc(2673);if ((((currentTarget.isOWLClass())&&(__CLR4_5_221g21glviclzzn.R.iget(2674)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2675)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2676);targetAxioms.addAll(ont.getAxioms(currentTarget.asOWLClass(),
                EXCLUDED));
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2677);if ((((currentTarget.isOWLObjectProperty())&&(__CLR4_5_221g21glviclzzn.R.iget(2678)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2679)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2680);targetAxioms.addAll(ont.getAxioms(
                currentTarget.asOWLObjectProperty(), EXCLUDED));
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2681);if ((((currentTarget.isOWLDataProperty())&&(__CLR4_5_221g21glviclzzn.R.iget(2682)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2683)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2684);targetAxioms.addAll(ont.getAxioms(
                currentTarget.asOWLDataProperty(), EXCLUDED));
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2685);if ((((currentTarget.isOWLNamedIndividual())&&(__CLR4_5_221g21glviclzzn.R.iget(2686)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2687)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2688);targetAxioms.addAll(ont.getAxioms(
                currentTarget.asOWLNamedIndividual(), EXCLUDED));
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2689);return targetAxioms;
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    @Nonnull
    private List<OWLEntity> getRHSEntitiesSorted(@Nonnull OWLAxiom ax) {try{__CLR4_5_221g21glviclzzn.R.inc(2690);
        __CLR4_5_221g21glviclzzn.R.inc(2691);Collection<OWLEntity> entities = getRHSEntities(ax);
        __CLR4_5_221g21glviclzzn.R.inc(2692);List<OWLEntity> sortedEntities = new ArrayList<>(entities);
        __CLR4_5_221g21glviclzzn.R.inc(2693);Collections.sort(sortedEntities, PROPERTIESFIRSTCOMPARATOR);
        __CLR4_5_221g21glviclzzn.R.inc(2694);return sortedEntities;
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    private void insertChildren(@Nullable OWLEntity entity,
        @Nonnull ExplanationTree tree) {try{__CLR4_5_221g21glviclzzn.R.inc(2695);
        __CLR4_5_221g21glviclzzn.R.inc(2696);if ((((entity == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2697)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2698)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2699);return;
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2700);Set<OWLAxiom> currentPath = new HashSet<>(
            tree.getUserObjectPathToRoot());
        __CLR4_5_221g21glviclzzn.R.inc(2701);Set<? extends OWLAxiom> axioms = CollectionFactory.emptySet();
        __CLR4_5_221g21glviclzzn.R.inc(2702);if ((((entity.isOWLClass())&&(__CLR4_5_221g21glviclzzn.R.iget(2703)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2704)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2705);axioms = ont.getAxioms(entity.asOWLClass(), EXCLUDED);
        } }else {__CLR4_5_221g21glviclzzn.R.inc(2706);if ((((entity.isOWLObjectProperty())&&(__CLR4_5_221g21glviclzzn.R.iget(2707)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2708)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2709);axioms = ont.getAxioms(entity.asOWLObjectProperty(), EXCLUDED);
        } }else {__CLR4_5_221g21glviclzzn.R.inc(2710);if ((((entity.isOWLDataProperty())&&(__CLR4_5_221g21glviclzzn.R.iget(2711)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2712)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2713);axioms = ont.getAxioms(entity.asOWLDataProperty(), EXCLUDED);
        } }else {__CLR4_5_221g21glviclzzn.R.inc(2714);if ((((entity.isOWLNamedIndividual())&&(__CLR4_5_221g21glviclzzn.R.iget(2715)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2716)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2717);axioms = ont.getAxioms(entity.asOWLNamedIndividual(), EXCLUDED);
        }
        }}}}__CLR4_5_221g21glviclzzn.R.inc(2718);for (OWLAxiom ax : axioms) {{
            __CLR4_5_221g21glviclzzn.R.inc(2719);if ((((passTypes.contains(ax.getAxiomType()))&&(__CLR4_5_221g21glviclzzn.R.iget(2720)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2721)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2722);continue;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2723);Set<OWLAxiom> mapped = getIndexedSet(entity, mappedAxioms, true);
            __CLR4_5_221g21glviclzzn.R.inc(2724);if ((((consumedAxioms.contains(ax) || mapped.contains(ax)
                || currentPath.contains(ax))&&(__CLR4_5_221g21glviclzzn.R.iget(2725)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2726)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2727);continue;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2728);mapped.add(ax);
            __CLR4_5_221g21glviclzzn.R.inc(2729);consumedAxioms.add(ax);
            __CLR4_5_221g21glviclzzn.R.inc(2730);ExplanationTree child = new ExplanationTree(ax);
            __CLR4_5_221g21glviclzzn.R.inc(2731);tree.addChild(child);
            __CLR4_5_221g21glviclzzn.R.inc(2732);for (OWLEntity ent : getRHSEntitiesSorted(ax)) {{
                assert (((ent != null)&&(__CLR4_5_221g21glviclzzn.R.iget(2733)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2734)==0&false));
                __CLR4_5_221g21glviclzzn.R.inc(2735);insertChildren(ent, child);
            }
        }}
        }__CLR4_5_221g21glviclzzn.R.inc(2736);sortChildrenAxioms(tree);
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /** The comparator. */
    @Nonnull
    private static final Comparator<Tree<OWLAxiom>> COMPARATOR = new OWLAxiomTreeComparator();

    private static void sortChildrenAxioms(@Nonnull ExplanationTree tree) {try{__CLR4_5_221g21glviclzzn.R.inc(2737);
        __CLR4_5_221g21glviclzzn.R.inc(2738);tree.sortChildren(COMPARATOR);
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    private static final AtomicLong RANDOMSTART = new AtomicLong(
        System.currentTimeMillis());

    private void buildIndices() {try{__CLR4_5_221g21glviclzzn.R.inc(2739);
        __CLR4_5_221g21glviclzzn.R.inc(2740);reset();
        __CLR4_5_221g21glviclzzn.R.inc(2741);AxiomMapBuilder builder = new AxiomMapBuilder();
        __CLR4_5_221g21glviclzzn.R.inc(2742);for (OWLAxiom ax : currentExplanation) {{
            __CLR4_5_221g21glviclzzn.R.inc(2743);ax.accept(builder);
        }
        }__CLR4_5_221g21glviclzzn.R.inc(2744);try {
            __CLR4_5_221g21glviclzzn.R.inc(2745);if ((((ont != null)&&(__CLR4_5_221g21glviclzzn.R.iget(2746)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2747)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2748);man.removeOntology(verifyNotNull(ont));
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2749);ont = man.createOntology(IRI.create("http://www.semanticweb.org/",
                "ontology" + RANDOMSTART.incrementAndGet()));
            __CLR4_5_221g21glviclzzn.R.inc(2750);List<AddAxiom> changes = new ArrayList<>();
            __CLR4_5_221g21glviclzzn.R.inc(2751);for (OWLAxiom ax : currentExplanation) {{
                assert (((ax != null)&&(__CLR4_5_221g21glviclzzn.R.iget(2752)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2753)==0&false));
                __CLR4_5_221g21glviclzzn.R.inc(2754);changes.add(new AddAxiom(verifyNotNull(ont), ax));
                __CLR4_5_221g21glviclzzn.R.inc(2755);ax.accept(builder);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2756);man.applyChanges(changes);
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_221g21glviclzzn.R.inc(2757);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /**
     * A utility method that obtains a set of axioms that are indexed by some
     * object.
     * 
     * @param <K>
     *        the key type
     * @param <E>
     *        the element type
     * @param obj
     *        The object that indexed the axioms
     * @param map
     *        The map that provides the index structure
     * @param addIfEmpty
     *        A flag that indicates whether an empty set of axiom should be
     *        added to the index if there is not value present for the indexing
     *        object.
     * @return A set of axioms (may be empty)
     */
    @Nonnull
    private static <K, E> Set<E> getIndexedSet(@Nonnull K obj,
        @Nonnull Map<K, Set<E>> map, boolean addIfEmpty) {try{__CLR4_5_221g21glviclzzn.R.inc(2758);
        __CLR4_5_221g21glviclzzn.R.inc(2759);Set<E> values = map.get(obj);
        __CLR4_5_221g21glviclzzn.R.inc(2760);if ((((values == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2761)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2762)==0&false))) {{
            __CLR4_5_221g21glviclzzn.R.inc(2763);values = new HashSet<>();
            __CLR4_5_221g21glviclzzn.R.inc(2764);if ((((addIfEmpty)&&(__CLR4_5_221g21glviclzzn.R.iget(2765)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2766)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2767);map.put(obj, values);
            }
        }}
        }__CLR4_5_221g21glviclzzn.R.inc(2768);return values;
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /**
     * Gets axioms that have a LHS corresponding to the specified entity.
     * 
     * @param lhs
     *        The entity that occurs on the left hand side of the axiom.
     * @return A set of axioms that have the specified entity as their left hand
     *         side.
     */
    @Nonnull
    protected Set<OWLAxiom> getAxiomsForLHS(@Nonnull OWLEntity lhs) {try{__CLR4_5_221g21glviclzzn.R.inc(2769);
        __CLR4_5_221g21glviclzzn.R.inc(2770);return getIndexedSet(lhs, lhs2AxiomMap, true);
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /**
     * Gets the rHS entities.
     * 
     * @param axiom
     *        the axiom
     * @return the rHS entities
     */
    @Nonnull
    private Collection<OWLEntity> getRHSEntities(@Nonnull OWLAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2771);
        __CLR4_5_221g21glviclzzn.R.inc(2772);return getIndexedSet(axiom, entitiesByAxiomRHS, true);
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /**
     * Index axioms by rhs entities.
     * 
     * @param rhs
     *        the rhs
     * @param axiom
     *        the axiom
     */
    protected void indexAxiomsByRHSEntities(@Nonnull OWLObject rhs,
        @Nonnull OWLAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2773);
        __CLR4_5_221g21glviclzzn.R.inc(2774);getIndexedSet(axiom, entitiesByAxiomRHS, true).addAll(
            rhs.getSignature());
    }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

    /** The Class TargetAxiomsComparator. */
    private static class TargetAxiomsComparator implements
        Comparator<OWLAxiom>, Serializable {

        private static final long serialVersionUID = 40000L;
        private final Set<OWLAxiom> targetAxioms;

        /**
         * Instantiates a new target axioms comparator.
         * 
         * @param targetAxioms
         *        the target axioms
         */
        TargetAxiomsComparator(@Nonnull Set<OWLAxiom> targetAxioms) {try{__CLR4_5_221g21glviclzzn.R.inc(2775);
            __CLR4_5_221g21glviclzzn.R.inc(2776);this.targetAxioms = checkNotNull(targetAxioms,
                "targetAxioms cannot be null");
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public int compare(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_221g21glviclzzn.R.inc(2777);
            __CLR4_5_221g21glviclzzn.R.inc(2778);if ((((targetAxioms.contains(o1))&&(__CLR4_5_221g21glviclzzn.R.iget(2779)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2780)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2781);return 1;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2782);if ((((targetAxioms.contains(o2))&&(__CLR4_5_221g21glviclzzn.R.iget(2783)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2784)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2785);return -1;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2786);return 0;
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}
    }

    /** The Class PropertiesFirstComparator. */
    private static class PropertiesFirstComparator implements
        Comparator<OWLObject>, Serializable {

        private static final long serialVersionUID = 40000L;

        PropertiesFirstComparator() {try{__CLR4_5_221g21glviclzzn.R.inc(2787);}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public int compare(OWLObject o1, OWLObject o2) {try{__CLR4_5_221g21glviclzzn.R.inc(2788);
            __CLR4_5_221g21glviclzzn.R.inc(2789);if ((((o1 instanceof OWLProperty)&&(__CLR4_5_221g21glviclzzn.R.iget(2790)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2791)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2792);return -1;
            } }else {{
                __CLR4_5_221g21glviclzzn.R.inc(2793);if ((((o1.equals(o2))&&(__CLR4_5_221g21glviclzzn.R.iget(2794)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2795)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2796);return 0;
                }
                }__CLR4_5_221g21glviclzzn.R.inc(2797);return 1;
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}
    }

    /** The properties first comparator. */
    private static final PropertiesFirstComparator PROPERTIESFIRSTCOMPARATOR = new PropertiesFirstComparator();

    /** tree comparator. */
    private static class OWLAxiomTreeComparator implements
        Comparator<Tree<OWLAxiom>>, Serializable {

        private static final long serialVersionUID = 40000L;

        OWLAxiomTreeComparator() {try{__CLR4_5_221g21glviclzzn.R.inc(2798);}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public int compare(Tree<OWLAxiom> o1, Tree<OWLAxiom> o2) {try{__CLR4_5_221g21glviclzzn.R.inc(2799);
            __CLR4_5_221g21glviclzzn.R.inc(2800);OWLAxiom ax1 = o1.getUserObject();
            __CLR4_5_221g21glviclzzn.R.inc(2801);OWLAxiom ax2 = o2.getUserObject();
            // Equivalent classes axioms always come last
            __CLR4_5_221g21glviclzzn.R.inc(2802);if ((((ax1 instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_221g21glviclzzn.R.iget(2803)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2804)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2805);return 1;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2806);if ((((ax2 instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_221g21glviclzzn.R.iget(2807)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2808)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2809);return -1;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2810);if ((((ax1 instanceof OWLPropertyAxiom)&&(__CLR4_5_221g21glviclzzn.R.iget(2811)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2812)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2813);return -1;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2814);int diff = childDiff(o1, o2);
            __CLR4_5_221g21glviclzzn.R.inc(2815);if ((((diff != 0)&&(__CLR4_5_221g21glviclzzn.R.iget(2816)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2817)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2818);return diff;
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2819);if ((((ax1 instanceof OWLSubClassOfAxiom
                && ax2 instanceof OWLSubClassOfAxiom)&&(__CLR4_5_221g21glviclzzn.R.iget(2820)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2821)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2822);OWLSubClassOfAxiom sc1 = (OWLSubClassOfAxiom) ax1;
                __CLR4_5_221g21glviclzzn.R.inc(2823);OWLSubClassOfAxiom sc2 = (OWLSubClassOfAxiom) ax2;
                __CLR4_5_221g21glviclzzn.R.inc(2824);return sc1.getSuperClass().compareTo(sc2.getSuperClass());
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2825);return 1;
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        private static int childDiff(Tree<OWLAxiom> o1, Tree<OWLAxiom> o2) {try{__CLR4_5_221g21glviclzzn.R.inc(2826);
            __CLR4_5_221g21glviclzzn.R.inc(2827);int childCount1 = o1.getChildCount();
            __CLR4_5_221g21glviclzzn.R.inc(2828);childCount1 = (((childCount1 > 0 )&&(__CLR4_5_221g21glviclzzn.R.iget(2829)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2830)==0&false))? 0 : 1;
            __CLR4_5_221g21glviclzzn.R.inc(2831);int childCount2 = o2.getChildCount();
            __CLR4_5_221g21glviclzzn.R.inc(2832);childCount2 = (((childCount2 > 0 )&&(__CLR4_5_221g21glviclzzn.R.iget(2833)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2834)==0&false))? 0 : 1;
            __CLR4_5_221g21glviclzzn.R.inc(2835);return childCount1 - childCount2;
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}
    }

    /** The Class SeedExtractor. */
    private static class SeedExtractor extends OWLAxiomVisitorAdapter {

        private OWLEntity source;
        private OWLEntity target;

        SeedExtractor() {try{__CLR4_5_221g21glviclzzn.R.inc(2836);}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        /**
         * @param axiom
         *        the axiom
         * @return the source
         */
        @Nullable
        public OWLEntity getSource(@Nonnull OWLAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2837);
            __CLR4_5_221g21glviclzzn.R.inc(2838);axiom.accept(this);
            __CLR4_5_221g21glviclzzn.R.inc(2839);return source;
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        /**
         * @param axiom
         *        the axiom
         * @return the target
         */
        @Nonnull
        public OWLEntity getTarget(@Nonnull OWLAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2840);
            __CLR4_5_221g21glviclzzn.R.inc(2841);axiom.accept(this);
            __CLR4_5_221g21glviclzzn.R.inc(2842);return verifyNotNull(target);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2843);
            __CLR4_5_221g21glviclzzn.R.inc(2844);if ((((!axiom.getSubClass().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2845)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2846)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2847);source = axiom.getSubClass().asOWLClass();
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2848);if ((((!axiom.getSuperClass().isOWLNothing())&&(__CLR4_5_221g21glviclzzn.R.iget(2849)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2850)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2851);OWLClassExpression classExpression = axiom.getSuperClass();
                __CLR4_5_221g21glviclzzn.R.inc(2852);if ((((!classExpression.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2853)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2854)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2855);target = classExpression.asOWLClass();
                }
            }}
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2856);
            __CLR4_5_221g21glviclzzn.R.inc(2857);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2858);if ((((!ce.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2859)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2860)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2861);if ((((source == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2862)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2863)==0&false))) {{
                        __CLR4_5_221g21glviclzzn.R.inc(2864);source = ce.asOWLClass();
                    } }else {__CLR4_5_221g21glviclzzn.R.inc(2865);if ((((target == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2866)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2867)==0&false))) {{
                        __CLR4_5_221g21glviclzzn.R.inc(2868);target = ce.asOWLClass();
                    } }else {{
                        __CLR4_5_221g21glviclzzn.R.inc(2869);break;
                    }
                }}}
            }}
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2870);
            __CLR4_5_221g21glviclzzn.R.inc(2871);if ((((!axiom.getSubProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2872)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2873)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2874);source = axiom.getSubProperty().asOWLObjectProperty();
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2875);if ((((!axiom.getSuperProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2876)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2877)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2878);target = axiom.getSuperProperty().asOWLObjectProperty();
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2879);
            __CLR4_5_221g21glviclzzn.R.inc(2880);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2881)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2882)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2883);source = axiom.getIndividual().asOWLNamedIndividual();
                __CLR4_5_221g21glviclzzn.R.inc(2884);target = axiom.getClassExpression().asOWLClass();
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2885);
            __CLR4_5_221g21glviclzzn.R.inc(2886);for (OWLClass cls : axiom.getNamedClasses()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2887);if ((((source == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2888)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2889)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2890);source = cls;
                } }else {__CLR4_5_221g21glviclzzn.R.inc(2891);if ((((target == null)&&(__CLR4_5_221g21glviclzzn.R.iget(2892)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2893)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2894);target = cls;
                } }else {{
                    __CLR4_5_221g21glviclzzn.R.inc(2895);break;
                }
            }}}
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(SWRLRule rule) {try{__CLR4_5_221g21glviclzzn.R.inc(2896);}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}
    }

    /** A visitor that indexes axioms by their left and right hand sides. */
    private class AxiomMapBuilder extends OWLAxiomVisitorAdapter {

        AxiomMapBuilder() {try{__CLR4_5_221g21glviclzzn.R.inc(2897);}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2898);
            __CLR4_5_221g21glviclzzn.R.inc(2899);if ((((!axiom.getSubClass().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2900)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2901)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2902);getAxiomsForLHS(axiom.getSubClass().asOWLClass()).add(axiom);
                __CLR4_5_221g21glviclzzn.R.inc(2903);indexAxiomsByRHSEntities(axiom.getSuperClass(), axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2904);
            __CLR4_5_221g21glviclzzn.R.inc(2905);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2906)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2907)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2908);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2909);
            __CLR4_5_221g21glviclzzn.R.inc(2910);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2911)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2912)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2913);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2914);
            __CLR4_5_221g21glviclzzn.R.inc(2915);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2916);if ((((!desc.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2917)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2918)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2919);getAxiomsForLHS(desc.asOWLClass()).add(axiom);
                }
                }__CLR4_5_221g21glviclzzn.R.inc(2920);indexAxiomsByRHSEntities(desc, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2921);
            __CLR4_5_221g21glviclzzn.R.inc(2922);getAxiomsForLHS(axiom.getProperty().asOWLDataProperty()).add(axiom);
            __CLR4_5_221g21glviclzzn.R.inc(2923);indexAxiomsByRHSEntities(axiom.getDomain(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2924);
            __CLR4_5_221g21glviclzzn.R.inc(2925);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2926)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2927)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2928);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2929);indexAxiomsByRHSEntities(axiom.getDomain(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2930);
            __CLR4_5_221g21glviclzzn.R.inc(2931);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2932);if ((((!prop.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2933)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2934)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2935);getAxiomsForLHS(prop.asOWLObjectProperty()).add(axiom);
                }
                }__CLR4_5_221g21glviclzzn.R.inc(2936);indexAxiomsByRHSEntities(prop, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2937);
            __CLR4_5_221g21glviclzzn.R.inc(2938);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2939);if ((((!ind.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2940)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2941)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2942);getAxiomsForLHS(ind.asOWLNamedIndividual()).add(axiom);
                    __CLR4_5_221g21glviclzzn.R.inc(2943);indexAxiomsByRHSEntities(ind, axiom);
                }
            }}
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2944);
            __CLR4_5_221g21glviclzzn.R.inc(2945);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2946);getAxiomsForLHS(prop.asOWLDataProperty()).add(axiom);
                __CLR4_5_221g21glviclzzn.R.inc(2947);indexAxiomsByRHSEntities(prop, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2948);
            __CLR4_5_221g21glviclzzn.R.inc(2949);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2950);if ((((!prop.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2951)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2952)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(2953);getAxiomsForLHS(prop.asOWLObjectProperty()).add(axiom);
                }
                }__CLR4_5_221g21glviclzzn.R.inc(2954);indexAxiomsByRHSEntities(prop, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2955);
            __CLR4_5_221g21glviclzzn.R.inc(2956);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2957)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2958)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2959);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2960);indexAxiomsByRHSEntities(axiom.getRange(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2961);
            __CLR4_5_221g21glviclzzn.R.inc(2962);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2963)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2964)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2965);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2966);
            __CLR4_5_221g21glviclzzn.R.inc(2967);if ((((!axiom.getSubProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2968)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2969)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2970);getAxiomsForLHS(axiom.getSubProperty().asOWLObjectProperty())
                    .add(axiom);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2971);indexAxiomsByRHSEntities(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2972);
            __CLR4_5_221g21glviclzzn.R.inc(2973);getAxiomsForLHS(axiom.getOWLClass()).add(axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2974);
            __CLR4_5_221g21glviclzzn.R.inc(2975);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2976)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2977)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2978);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2979);
            __CLR4_5_221g21glviclzzn.R.inc(2980);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2981)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2982)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2983);getAxiomsForLHS(axiom.getProperty().asOWLDataProperty()).add(
                    axiom);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(2984);indexAxiomsByRHSEntities(axiom.getRange(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2985);
            __CLR4_5_221g21glviclzzn.R.inc(2986);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2987)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2988)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2989);getAxiomsForLHS(axiom.getProperty().asOWLDataProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2990);
            __CLR4_5_221g21glviclzzn.R.inc(2991);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_221g21glviclzzn.R.inc(2992);getAxiomsForLHS(prop.asOWLDataProperty()).add(axiom);
                __CLR4_5_221g21glviclzzn.R.inc(2993);indexAxiomsByRHSEntities(prop, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(2994);
            __CLR4_5_221g21glviclzzn.R.inc(2995);if ((((!axiom.getIndividual().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(2996)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(2997)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(2998);getAxiomsForLHS(axiom.getIndividual().asOWLNamedIndividual())
                    .add(axiom);
                __CLR4_5_221g21glviclzzn.R.inc(2999);indexAxiomsByRHSEntities(axiom.getClassExpression(), axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3000);
            __CLR4_5_221g21glviclzzn.R.inc(3001);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_221g21glviclzzn.R.inc(3002);if ((((!desc.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3003)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3004)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(3005);getAxiomsForLHS(desc.asOWLClass()).add(axiom);
                }
                }__CLR4_5_221g21glviclzzn.R.inc(3006);indexAxiomsByRHSEntities(desc, axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3007);
            __CLR4_5_221g21glviclzzn.R.inc(3008);indexAxiomsByRHSEntities(axiom.getSubject(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3009);
            __CLR4_5_221g21glviclzzn.R.inc(3010);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3011)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3012)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(3013);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3014);
            __CLR4_5_221g21glviclzzn.R.inc(3015);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3016)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3017)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(3018);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3019);
            __CLR4_5_221g21glviclzzn.R.inc(3020);getAxiomsForLHS(axiom.getSubProperty().asOWLDataProperty()).add(
                axiom);
            __CLR4_5_221g21glviclzzn.R.inc(3021);indexAxiomsByRHSEntities(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3022);
            __CLR4_5_221g21glviclzzn.R.inc(3023);if ((((!axiom.getProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3024)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3025)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(3026);getAxiomsForLHS(axiom.getProperty().asOWLObjectProperty()).add(
                    axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3027);
            __CLR4_5_221g21glviclzzn.R.inc(3028);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_221g21glviclzzn.R.inc(3029);if ((((!ind.isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3030)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3031)==0&false))) {{
                    __CLR4_5_221g21glviclzzn.R.inc(3032);getAxiomsForLHS(ind.asOWLNamedIndividual()).add(axiom);
                    __CLR4_5_221g21glviclzzn.R.inc(3033);indexAxiomsByRHSEntities(ind, axiom);
                }
            }}
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3034);
            __CLR4_5_221g21glviclzzn.R.inc(3035);if ((((!axiom.getFirstProperty().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3036)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3037)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(3038);getAxiomsForLHS(axiom.getFirstProperty().asOWLObjectProperty())
                    .add(axiom);
            }
            }__CLR4_5_221g21glviclzzn.R.inc(3039);indexAxiomsByRHSEntities(axiom.getFirstProperty(), axiom);
            __CLR4_5_221g21glviclzzn.R.inc(3040);indexAxiomsByRHSEntities(axiom.getSecondProperty(), axiom);
        }finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}

        @Override
        public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_221g21glviclzzn.R.inc(3041);
            __CLR4_5_221g21glviclzzn.R.inc(3042);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_221g21glviclzzn.R.iget(3043)!=0|true))||(__CLR4_5_221g21glviclzzn.R.iget(3044)==0&false))) {{
                __CLR4_5_221g21glviclzzn.R.inc(3045);indexAxiomsByRHSEntities(axiom.getClassExpression()
                    .asOWLClass(), axiom);
            }
        }}finally{__CLR4_5_221g21glviclzzn.R.flushNeeded();}}
    }
}
