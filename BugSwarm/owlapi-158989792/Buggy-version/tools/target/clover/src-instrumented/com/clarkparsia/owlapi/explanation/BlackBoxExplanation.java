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

import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clarkparsia.owlapi.explanation.util.OntologyUtils;

/** A black box explanation. */
public class BlackBoxExplanation extends SingleExplanationGeneratorImpl
        implements SingleExplanationGenerator {public static class __CLR4_5_22s2slviclyp3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory
            .getLogger(BlackBoxExplanation.class.getName());
    /** The debugging ontology. */
    private OWLOntology debuggingOntology;
    /** The debugging axioms. */
    @Nonnull
    protected final Set<OWLAxiom> debuggingAxioms = new LinkedHashSet<>();
    /** The objects expanded with defining axioms. */
    @Nonnull
    private final Set<OWLEntity> objectsExpandedWithDefiningAxioms = new HashSet<>();
    /** The objects expanded with referencing axioms. */
    @Nonnull
    private final Set<OWLEntity> objectsExpandedWithReferencingAxioms = new HashSet<>();
    /** The expanded with defining axioms. */
    @Nonnull
    private final Set<OWLAxiom> expandedWithDefiningAxioms = new HashSet<>();
    /** The expanded with referencing axioms. */
    @Nonnull
    private final Set<OWLAxiom> expandedWithReferencingAxioms = new HashSet<>();
    /** default expansion limit. */
    public static final int DEFAULT_INITIAL_EXPANSION_LIMIT = 50;
    /** The initial expansion limit. */
    private final int initialExpansionLimit = DEFAULT_INITIAL_EXPANSION_LIMIT;
    /** The expansion limit. */
    private int expansionLimit = initialExpansionLimit;
    /** The Constant DEFAULT_FAST_PRUNING_WINDOW_SIZE. */
    private static final int DEFAULT_FAST_PRUNING_WINDOW_SIZE = 10;
    /** The fast pruning window size. */
    private int fastPruningWindowSize = 0;
    /** The owl ontology manager. */
    private final OWLOntologyManager owlOntologyManager;
    // Creation of debugging ontology and satisfiability testing
    private int satTestCount = 0;

    /**
     * Instantiates a new black box explanation.
     * 
     * @param ontology
     *        the ontology
     * @param reasonerFactory
     *        the reasoner factory
     * @param reasoner
     *        the reasoner
     */
    public BlackBoxExplanation(@Nonnull OWLOntology ontology,
            @Nonnull OWLReasonerFactory reasonerFactory,
            @Nonnull OWLReasoner reasoner) {
        super(ontology, reasonerFactory, reasoner);__CLR4_5_22s2slviclyp3.R.inc(101);try{__CLR4_5_22s2slviclyp3.R.inc(100);
        __CLR4_5_22s2slviclyp3.R.inc(102);owlOntologyManager = ontology.getOWLOntologyManager();
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_22s2slviclyp3.R.inc(103);
        __CLR4_5_22s2slviclyp3.R.inc(104);reset();
        __CLR4_5_22s2slviclyp3.R.inc(105);getReasoner().dispose();
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_22s2slviclyp3.R.inc(106);
        __CLR4_5_22s2slviclyp3.R.inc(107);if ((((debuggingOntology != null)&&(__CLR4_5_22s2slviclyp3.R.iget(108)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(109)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(110);owlOntologyManager.removeOntology(verifyNotNull(debuggingOntology));
            __CLR4_5_22s2slviclyp3.R.inc(111);debuggingOntology = null;
        }
        }__CLR4_5_22s2slviclyp3.R.inc(112);debuggingAxioms.clear();
        __CLR4_5_22s2slviclyp3.R.inc(113);objectsExpandedWithDefiningAxioms.clear();
        __CLR4_5_22s2slviclyp3.R.inc(114);objectsExpandedWithReferencingAxioms.clear();
        __CLR4_5_22s2slviclyp3.R.inc(115);expandedWithDefiningAxioms.clear();
        __CLR4_5_22s2slviclyp3.R.inc(116);expandedWithReferencingAxioms.clear();
        __CLR4_5_22s2slviclyp3.R.inc(117);expansionLimit = initialExpansionLimit;
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getExplanation(OWLClassExpression unsatClass) {try{__CLR4_5_22s2slviclyp3.R.inc(118);
        __CLR4_5_22s2slviclyp3.R.inc(119);if ((((!getDefinitionTracker().isDefined(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(120)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(121)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(122);return CollectionFactory.emptySet();
        }
        }__CLR4_5_22s2slviclyp3.R.inc(123);try {
            __CLR4_5_22s2slviclyp3.R.inc(124);satTestCount++;
            __CLR4_5_22s2slviclyp3.R.inc(125);if ((((isFirstExplanation() && getReasoner().isSatisfiable(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(126)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(127)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(128);return CollectionFactory.emptySet();
            }
            }__CLR4_5_22s2slviclyp3.R.inc(129);reset();
            __CLR4_5_22s2slviclyp3.R.inc(130);expandUntilUnsatisfiable(unsatClass);
            __CLR4_5_22s2slviclyp3.R.inc(131);pruneUntilMinimal(unsatClass);
            __CLR4_5_22s2slviclyp3.R.inc(132);removeDeclarations();
            __CLR4_5_22s2slviclyp3.R.inc(133);return new HashSet<>(debuggingAxioms);
        } catch (OWLException e) {
            __CLR4_5_22s2slviclyp3.R.inc(134);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    // Expansion
    private int expandAxioms() {try{__CLR4_5_22s2slviclyp3.R.inc(135);
        /*
         * We expand the axiom set using axioms that define entities that are
         * already referenced in the existing set of axioms. If this fails to
         * expand the axiom set we expand using axioms that reference the
         * entities in the axioms that have already been expanded.
         */
        // Keep track of the number of axioms that have been added
        __CLR4_5_22s2slviclyp3.R.inc(136);int axiomsAdded = 0;
        __CLR4_5_22s2slviclyp3.R.inc(137);int remainingSpace = expansionLimit;
        /* The expansion factor. */
        __CLR4_5_22s2slviclyp3.R.inc(138);double expansionFactor = 1.25;
        __CLR4_5_22s2slviclyp3.R.inc(139);for (OWLAxiom ax : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_22s2slviclyp3.R.inc(140);if ((((expandedWithDefiningAxioms.contains(ax))&&(__CLR4_5_22s2slviclyp3.R.iget(141)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(142)==0&false))) {{
                // Skip if already done
                __CLR4_5_22s2slviclyp3.R.inc(143);continue;
            }
            // Collect the entities that have been used in the axiom
            }__CLR4_5_22s2slviclyp3.R.inc(144);for (OWLEntity curObj : ax.getSignature()) {{
                assert (((curObj != null)&&(__CLR4_5_22s2slviclyp3.R.iget(145)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(146)==0&false));
                __CLR4_5_22s2slviclyp3.R.inc(147);if ((((!objectsExpandedWithDefiningAxioms.contains(curObj))&&(__CLR4_5_22s2slviclyp3.R.iget(148)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(149)==0&false))) {{
                    __CLR4_5_22s2slviclyp3.R.inc(150);int added = expandWithDefiningAxioms(curObj, remainingSpace);
                    __CLR4_5_22s2slviclyp3.R.inc(151);axiomsAdded += added;
                    __CLR4_5_22s2slviclyp3.R.inc(152);remainingSpace -= added;
                    __CLR4_5_22s2slviclyp3.R.inc(153);if ((((remainingSpace == 0)&&(__CLR4_5_22s2slviclyp3.R.iget(154)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(155)==0&false))) {{
                        __CLR4_5_22s2slviclyp3.R.inc(156);expansionLimit *= expansionFactor;
                        __CLR4_5_22s2slviclyp3.R.inc(157);return axiomsAdded;
                    }
                    // Flag that we have completely expanded all defining axioms
                    // for this particular entity
                    }__CLR4_5_22s2slviclyp3.R.inc(158);objectsExpandedWithDefiningAxioms.add(curObj);
                }
            }}
            // Flag that we've completely expanded this particular axiom
            }__CLR4_5_22s2slviclyp3.R.inc(159);expandedWithDefiningAxioms.add(ax);
        }
        }__CLR4_5_22s2slviclyp3.R.inc(160);if ((((axiomsAdded > 0)&&(__CLR4_5_22s2slviclyp3.R.iget(161)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(162)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(163);return axiomsAdded;
        }
        // No axioms added at this point. Start adding axioms that reference
        // entities contained in the current set of debugging axioms
        }__CLR4_5_22s2slviclyp3.R.inc(164);for (OWLAxiom ax : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_22s2slviclyp3.R.inc(165);if ((((expandedWithReferencingAxioms.contains(ax))&&(__CLR4_5_22s2slviclyp3.R.iget(166)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(167)==0&false))) {{
                // Skip - already done this one
                __CLR4_5_22s2slviclyp3.R.inc(168);continue;
            }
            // Keep track of the number of axioms that have been added
            }__CLR4_5_22s2slviclyp3.R.inc(169);for (OWLEntity curObj : ax.getSignature()) {{
                assert (((curObj != null)&&(__CLR4_5_22s2slviclyp3.R.iget(170)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(171)==0&false));
                __CLR4_5_22s2slviclyp3.R.inc(172);if ((((!objectsExpandedWithReferencingAxioms.contains(curObj))&&(__CLR4_5_22s2slviclyp3.R.iget(173)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(174)==0&false))) {{
                    __CLR4_5_22s2slviclyp3.R.inc(175);int added = expandWithReferencingAxioms(curObj,
                            expansionLimit);
                    __CLR4_5_22s2slviclyp3.R.inc(176);axiomsAdded += added;
                    __CLR4_5_22s2slviclyp3.R.inc(177);remainingSpace -= added;
                    __CLR4_5_22s2slviclyp3.R.inc(178);if ((((remainingSpace == 0)&&(__CLR4_5_22s2slviclyp3.R.iget(179)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(180)==0&false))) {{
                        __CLR4_5_22s2slviclyp3.R.inc(181);expansionLimit *= expansionFactor;
                        __CLR4_5_22s2slviclyp3.R.inc(182);return axiomsAdded;
                    }
                    }__CLR4_5_22s2slviclyp3.R.inc(183);objectsExpandedWithReferencingAxioms.add(curObj);
                }
            }}
            }__CLR4_5_22s2slviclyp3.R.inc(184);expandedWithReferencingAxioms.add(ax);
        }
        }__CLR4_5_22s2slviclyp3.R.inc(185);return axiomsAdded;
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    /**
     * Creates a set of axioms to expands the debugging axiom set by adding the
     * defining axioms for the specified entity.
     * 
     * @param obj
     *        the obj
     * @param limit
     *        the limit
     * @return the int
     */
    private int expandWithDefiningAxioms(@Nonnull OWLEntity obj, int limit) {try{__CLR4_5_22s2slviclyp3.R.inc(186);
        __CLR4_5_22s2slviclyp3.R.inc(187);Set<OWLAxiom> expansionAxioms = new HashSet<>();
        __CLR4_5_22s2slviclyp3.R.inc(188);for (OWLOntology ont : getOntology().getImportsClosure()) {{
            __CLR4_5_22s2slviclyp3.R.inc(189);boolean referenceFound = false;
            __CLR4_5_22s2slviclyp3.R.inc(190);if ((((obj instanceof OWLClass)&&(__CLR4_5_22s2slviclyp3.R.iget(191)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(192)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(193);referenceFound = expansionAxioms.addAll(ont.getAxioms(
                        (OWLClass) obj, EXCLUDED));
            } }else {__CLR4_5_22s2slviclyp3.R.inc(194);if ((((obj instanceof OWLObjectProperty)&&(__CLR4_5_22s2slviclyp3.R.iget(195)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(196)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(197);referenceFound = expansionAxioms.addAll(ont.getAxioms(
                        (OWLObjectProperty) obj, EXCLUDED));
            } }else {__CLR4_5_22s2slviclyp3.R.inc(198);if ((((obj instanceof OWLDataProperty)&&(__CLR4_5_22s2slviclyp3.R.iget(199)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(200)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(201);referenceFound = expansionAxioms.addAll(ont.getAxioms(
                        (OWLDataProperty) obj, EXCLUDED));
            } }else {__CLR4_5_22s2slviclyp3.R.inc(202);if ((((obj instanceof OWLIndividual)&&(__CLR4_5_22s2slviclyp3.R.iget(203)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(204)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(205);referenceFound = expansionAxioms.addAll(ont.getAxioms(
                        (OWLIndividual) obj, EXCLUDED));
            }
            }}}}__CLR4_5_22s2slviclyp3.R.inc(206);if ((((!referenceFound)&&(__CLR4_5_22s2slviclyp3.R.iget(207)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(208)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(209);expansionAxioms.add(owlOntologyManager.getOWLDataFactory()
                        .getOWLDeclarationAxiom(obj));
            }
        }}
        }__CLR4_5_22s2slviclyp3.R.inc(210);expansionAxioms.removeAll(debuggingAxioms);
        __CLR4_5_22s2slviclyp3.R.inc(211);return addMax(expansionAxioms, debuggingAxioms, limit);
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    /**
     * Expands the axiom set by adding the referencing axioms for the specified
     * entity.
     * 
     * @param obj
     *        the obj
     * @param limit
     *        the limit
     * @return the int
     */
    private int expandWithReferencingAxioms(@Nonnull OWLEntity obj, int limit) {try{__CLR4_5_22s2slviclyp3.R.inc(212);
        __CLR4_5_22s2slviclyp3.R.inc(213);Set<OWLAxiom> expansionAxioms = new HashSet<>();
        // First expand by getting the defining axioms - if this doesn't
        // return any axioms, then get the axioms that reference the entity
        __CLR4_5_22s2slviclyp3.R.inc(214);expansionAxioms.addAll(getOntology()
                .getReferencingAxioms(obj, INCLUDED));
        __CLR4_5_22s2slviclyp3.R.inc(215);expansionAxioms.removeAll(debuggingAxioms);
        __CLR4_5_22s2slviclyp3.R.inc(216);return addMax(expansionAxioms, debuggingAxioms, limit);
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    /**
     * A utility method. Adds axioms from one set to another set upto a
     * specified limit. Annotation axioms are stripped out
     * 
     * @param <N>
     *        the number type
     * @param source
     *        The source set. Objects from this set will be added to the
     *        destination set
     * @param dest
     *        The destination set. Objects will be added to this set
     * @param limit
     *        The maximum number of objects to be added.
     * @return The number of objects that were actually added.
     */
    private static <N extends OWLAxiom> int addMax(@Nonnull Set<N> source,
            @Nonnull Set<N> dest, int limit) {try{__CLR4_5_22s2slviclyp3.R.inc(217);
        __CLR4_5_22s2slviclyp3.R.inc(218);int count = 0;
        __CLR4_5_22s2slviclyp3.R.inc(219);for (N obj : source) {{
            __CLR4_5_22s2slviclyp3.R.inc(220);if ((((count == limit)&&(__CLR4_5_22s2slviclyp3.R.iget(221)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(222)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(223);break;
            }
            }__CLR4_5_22s2slviclyp3.R.inc(224);if ((((!(obj instanceof OWLAnnotationAxiom) && dest.add(obj))&&(__CLR4_5_22s2slviclyp3.R.iget(225)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(226)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(227);count++;
            }
        }}
        }__CLR4_5_22s2slviclyp3.R.inc(228);return count;
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    // Contraction/Pruning - Fast pruning is performed and then slow pruning is
    // performed.
    private void performFastPruning(@Nonnull OWLClassExpression unsatClass)
            throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(229);
        __CLR4_5_22s2slviclyp3.R.inc(230);Set<OWLAxiom> axiomWindow = new HashSet<>();
        __CLR4_5_22s2slviclyp3.R.inc(231);Object[] axioms = debuggingAxioms.toArray();
        __CLR4_5_22s2slviclyp3.R.inc(232);LOGGER.info("Fast pruning: ");
        __CLR4_5_22s2slviclyp3.R.inc(233);LOGGER.info("     - Window size: {}", fastPruningWindowSize);
        __CLR4_5_22s2slviclyp3.R.inc(234);int windowCount = debuggingAxioms.size() / fastPruningWindowSize;
        __CLR4_5_22s2slviclyp3.R.inc(235);for (int currentWindow = 0; (((currentWindow < windowCount)&&(__CLR4_5_22s2slviclyp3.R.iget(236)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(237)==0&false)); currentWindow++) {{
            __CLR4_5_22s2slviclyp3.R.inc(238);axiomWindow.clear();
            __CLR4_5_22s2slviclyp3.R.inc(239);int startIndex = currentWindow * fastPruningWindowSize;
            __CLR4_5_22s2slviclyp3.R.inc(240);int endIndex = startIndex + fastPruningWindowSize;
            __CLR4_5_22s2slviclyp3.R.inc(241);for (int axiomIndex = startIndex; (((axiomIndex < endIndex)&&(__CLR4_5_22s2slviclyp3.R.iget(242)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(243)==0&false)); axiomIndex++) {{
                __CLR4_5_22s2slviclyp3.R.inc(244);OWLAxiom currentAxiom = (OWLAxiom) axioms[axiomIndex];
                __CLR4_5_22s2slviclyp3.R.inc(245);axiomWindow.add(currentAxiom);
                __CLR4_5_22s2slviclyp3.R.inc(246);debuggingAxioms.remove(currentAxiom);
            }
            }__CLR4_5_22s2slviclyp3.R.inc(247);if ((((isSatisfiable(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(248)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(249)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(250);debuggingAxioms.addAll(axiomWindow);
            }
        }}
        // Add any left over axioms
        }__CLR4_5_22s2slviclyp3.R.inc(251);axiomWindow.clear();
        __CLR4_5_22s2slviclyp3.R.inc(252);int remainingAxiomsCount = debuggingAxioms.size()
                % fastPruningWindowSize;
        __CLR4_5_22s2slviclyp3.R.inc(253);if ((((remainingAxiomsCount > 0)&&(__CLR4_5_22s2slviclyp3.R.iget(254)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(255)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(256);int fragmentIndex = windowCount * fastPruningWindowSize;
            __CLR4_5_22s2slviclyp3.R.inc(257);while ((((fragmentIndex < axioms.length)&&(__CLR4_5_22s2slviclyp3.R.iget(258)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(259)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(260);OWLAxiom curAxiom = (OWLAxiom) axioms[fragmentIndex];
                __CLR4_5_22s2slviclyp3.R.inc(261);axiomWindow.add(curAxiom);
                __CLR4_5_22s2slviclyp3.R.inc(262);debuggingAxioms.remove(curAxiom);
                __CLR4_5_22s2slviclyp3.R.inc(263);fragmentIndex++;
            }
            }__CLR4_5_22s2slviclyp3.R.inc(264);if ((((isSatisfiable(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(265)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(266)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(267);debuggingAxioms.addAll(axiomWindow);
            }
        }}
        }__CLR4_5_22s2slviclyp3.R.inc(268);LOGGER.info("    - End of fast pruning");
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void performSlowPruning(@Nonnull OWLClassExpression unsatClass)
            throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(269);
        // Simply remove axioms one at a time. If the class
        // being debugged turns satisfiable then we know we have
        // an SOS axiom.
        __CLR4_5_22s2slviclyp3.R.inc(270);List<OWLAxiom> axiomsCopy = new ArrayList<>(debuggingAxioms);
        __CLR4_5_22s2slviclyp3.R.inc(271);for (OWLAxiom ax : axiomsCopy) {{
            __CLR4_5_22s2slviclyp3.R.inc(272);debuggingAxioms.remove(ax);
            __CLR4_5_22s2slviclyp3.R.inc(273);if ((((isSatisfiable(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(274)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(275)==0&false))) {{
                // Affects satisfiability, so add back in
                __CLR4_5_22s2slviclyp3.R.inc(276);debuggingAxioms.add(ax);
            }
        }}
    }}finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    /**
     * Tests the satisfiability of the test class. The ontology is recreated
     * before the test is performed.
     * 
     * @param unsatClass
     *        the unsat class
     * @return true, if is satisfiable
     * @throws OWLException
     *         the oWL exception
     */
    private boolean isSatisfiable(@Nonnull OWLClassExpression unsatClass)
            throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(277);
        __CLR4_5_22s2slviclyp3.R.inc(278);createDebuggingOntology();
        __CLR4_5_22s2slviclyp3.R.inc(279);OWLReasoner reasoner = getReasonerFactory().createNonBufferingReasoner(
                verifyNotNull(debuggingOntology));
        __CLR4_5_22s2slviclyp3.R.inc(280);if ((((OntologyUtils.containsUnreferencedEntity(
                verifyNotNull(debuggingOntology), unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(281)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(282)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(283);reasoner.dispose();
            __CLR4_5_22s2slviclyp3.R.inc(284);return true;
        }
        }__CLR4_5_22s2slviclyp3.R.inc(285);satTestCount++;
        __CLR4_5_22s2slviclyp3.R.inc(286);boolean sat = reasoner.isSatisfiable(unsatClass);
        __CLR4_5_22s2slviclyp3.R.inc(287);reasoner.dispose();
        __CLR4_5_22s2slviclyp3.R.inc(288);return sat;
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void createDebuggingOntology() throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(289);
        __CLR4_5_22s2slviclyp3.R.inc(290);if ((((debuggingOntology != null)&&(__CLR4_5_22s2slviclyp3.R.iget(291)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(292)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(293);owlOntologyManager.removeOntology(verifyNotNull(debuggingOntology));
        }
        }__CLR4_5_22s2slviclyp3.R.inc(294);debuggingOntology = owlOntologyManager.createOntology();
        __CLR4_5_22s2slviclyp3.R.inc(295);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_22s2slviclyp3.R.inc(296);for (OWLAxiom ax : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_22s2slviclyp3.R.inc(297);changes.add(new AddAxiom(verifyNotNull(debuggingOntology),
                    verifyNotNull(ax)));
        }
        }__CLR4_5_22s2slviclyp3.R.inc(298);owlOntologyManager.applyChanges(changes);
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void resetSatisfiabilityTestCounter() {try{__CLR4_5_22s2slviclyp3.R.inc(299);
        __CLR4_5_22s2slviclyp3.R.inc(300);satTestCount = 0;
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void
            expandUntilUnsatisfiable(@Nonnull OWLClassExpression unsatClass)
                    throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(301);
        // Perform the initial expansion - this will cause
        // the debugging axioms set to be expanded to the
        // defining axioms for the class being debugged
        __CLR4_5_22s2slviclyp3.R.inc(302);resetSatisfiabilityTestCounter();
        __CLR4_5_22s2slviclyp3.R.inc(303);if ((((!unsatClass.isAnonymous())&&(__CLR4_5_22s2slviclyp3.R.iget(304)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(305)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(306);expandWithDefiningAxioms((OWLClass) unsatClass, expansionLimit);
        } }else {{
            __CLR4_5_22s2slviclyp3.R.inc(307);OWLClass owlThing = owlOntologyManager.getOWLDataFactory()
                    .getOWLThing();
            __CLR4_5_22s2slviclyp3.R.inc(308);OWLSubClassOfAxiom axiom = owlOntologyManager.getOWLDataFactory()
                    .getOWLSubClassOfAxiom(unsatClass, owlThing);
            __CLR4_5_22s2slviclyp3.R.inc(309);debuggingAxioms.add(axiom);
            __CLR4_5_22s2slviclyp3.R.inc(310);expandAxioms();
            __CLR4_5_22s2slviclyp3.R.inc(311);debuggingAxioms.remove(axiom);
        }
        }__CLR4_5_22s2slviclyp3.R.inc(312);LOGGER.info("Initial axiom count: {}", debuggingAxioms.size());
        __CLR4_5_22s2slviclyp3.R.inc(313);int totalAdded = 0;
        __CLR4_5_22s2slviclyp3.R.inc(314);int expansionCount = 0;
        __CLR4_5_22s2slviclyp3.R.inc(315);while ((((isSatisfiable(unsatClass))&&(__CLR4_5_22s2slviclyp3.R.iget(316)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(317)==0&false))) {{
            __CLR4_5_22s2slviclyp3.R.inc(318);LOGGER.info("Expanding axioms (expansion {})", expansionCount);
            __CLR4_5_22s2slviclyp3.R.inc(319);expansionCount++;
            __CLR4_5_22s2slviclyp3.R.inc(320);int numberAdded = expandAxioms();
            __CLR4_5_22s2slviclyp3.R.inc(321);totalAdded += numberAdded;
            __CLR4_5_22s2slviclyp3.R.inc(322);LOGGER.info("    ... expanded by {}", numberAdded);
            __CLR4_5_22s2slviclyp3.R.inc(323);if ((((numberAdded == 0)&&(__CLR4_5_22s2slviclyp3.R.iget(324)!=0|true))||(__CLR4_5_22s2slviclyp3.R.iget(325)==0&false))) {{
                __CLR4_5_22s2slviclyp3.R.inc(326);LOGGER.info("ERROR! Cannot find SOS axioms!");
                __CLR4_5_22s2slviclyp3.R.inc(327);debuggingAxioms.clear();
                __CLR4_5_22s2slviclyp3.R.inc(328);return;
            }
        }}
        }__CLR4_5_22s2slviclyp3.R.inc(329);LOGGER.info("Total number of axioms added: {}", totalAdded);
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    /**
     * Prune until minimal.
     * 
     * @param unsatClass
     *        the unsat class
     * @throws OWLException
     *         the oWL exception
     */
    protected void pruneUntilMinimal(@Nonnull OWLClassExpression unsatClass)
            throws OWLException {try{__CLR4_5_22s2slviclyp3.R.inc(330);
        __CLR4_5_22s2slviclyp3.R.inc(331);LOGGER.info("FOUND CLASH! Pruning {} axioms...", debuggingAxioms.size());
        __CLR4_5_22s2slviclyp3.R.inc(332);resetSatisfiabilityTestCounter();
        __CLR4_5_22s2slviclyp3.R.inc(333);LOGGER.info("Fast pruning...");
        __CLR4_5_22s2slviclyp3.R.inc(334);fastPruningWindowSize = DEFAULT_FAST_PRUNING_WINDOW_SIZE;
        __CLR4_5_22s2slviclyp3.R.inc(335);performFastPruning(unsatClass);
        __CLR4_5_22s2slviclyp3.R.inc(336);LOGGER.info("... end of fast pruning. Axioms remaining: {}",
                debuggingAxioms.size());
        __CLR4_5_22s2slviclyp3.R.inc(337);LOGGER.info("Performed {} satisfiability tests during fast pruning",
                satTestCount);
        __CLR4_5_22s2slviclyp3.R.inc(338);int totalSatTests = satTestCount;
        __CLR4_5_22s2slviclyp3.R.inc(339);resetSatisfiabilityTestCounter();
        __CLR4_5_22s2slviclyp3.R.inc(340);LOGGER.info("Slow pruning...");
        __CLR4_5_22s2slviclyp3.R.inc(341);performSlowPruning(unsatClass);
        __CLR4_5_22s2slviclyp3.R.inc(342);LOGGER.info("... end of slow pruning");
        __CLR4_5_22s2slviclyp3.R.inc(343);LOGGER.info("Performed {} satisfiability tests during slow pruning",
                satTestCount);
        __CLR4_5_22s2slviclyp3.R.inc(344);totalSatTests += satTestCount;
        __CLR4_5_22s2slviclyp3.R.inc(345);LOGGER.info("Total number of satisfiability tests performed: {}",
                totalSatTests);
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    private void removeDeclarations() {try{__CLR4_5_22s2slviclyp3.R.inc(346);
        __CLR4_5_22s2slviclyp3.R.inc(347);OWLAxiomVisitor declarationRemover = new OWLAxiomVisitorAdapter() {

            @Override
            public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_22s2slviclyp3.R.inc(348);
                __CLR4_5_22s2slviclyp3.R.inc(349);checkNotNull(axiom, "axiom cannot be null");
                __CLR4_5_22s2slviclyp3.R.inc(350);debuggingAxioms.remove(axiom);
            }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}
        };
        __CLR4_5_22s2slviclyp3.R.inc(351);for (OWLAxiom axiom : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_22s2slviclyp3.R.inc(352);axiom.accept(declarationRemover);
        }
    }}finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22s2slviclyp3.R.inc(353);
        __CLR4_5_22s2slviclyp3.R.inc(354);return "BlackBox";
    }finally{__CLR4_5_22s2slviclyp3.R.flushNeeded();}}
}
