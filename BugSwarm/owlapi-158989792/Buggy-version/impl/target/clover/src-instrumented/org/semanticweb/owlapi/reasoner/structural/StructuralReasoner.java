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
package org.semanticweb.owlapi.reasoner.structural;

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.search.Searcher.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.reasoner.*;
import org.semanticweb.owlapi.reasoner.impl.*;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectPropertyManager;
import org.semanticweb.owlapi.util.Version;

/**
 * This is a simple structural reasoner that essentially answers with told
 * information. It is incomplete.
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class StructuralReasoner extends OWLReasonerBase {public static class __CLR4_5_2ararlviclf00{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,1250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final ClassHierarchyInfo classHierarchyInfo = new ClassHierarchyInfo();
    @Nonnull
    private final ObjectPropertyHierarchyInfo objectPropertyHierarchyInfo = new ObjectPropertyHierarchyInfo();
    @Nonnull
    private final DataPropertyHierarchyInfo dataPropertyHierarchyInfo = new DataPropertyHierarchyInfo();
    @Nonnull
    private static final Version VERSION = new Version(1, 0, 0, 0);
    private boolean interrupted = false;
    @Nonnull
    protected final ReasonerProgressMonitor pm;
    private boolean prepared = false;

    /**
     * @param rootOntology
     *        the ontology
     * @param configuration
     *        the reasoner configuration
     * @param bufferingMode
     *        the buffering mode
     */
    public StructuralReasoner(@Nonnull OWLOntology rootOntology, @Nonnull OWLReasonerConfiguration configuration,
        @Nonnull BufferingMode bufferingMode) {
        super(rootOntology, configuration, bufferingMode);__CLR4_5_2ararlviclf00.R.inc(388);try{__CLR4_5_2ararlviclf00.R.inc(387);
        __CLR4_5_2ararlviclf00.R.inc(389);checkNotNull(configuration, "configuration cannot be null");
        __CLR4_5_2ararlviclf00.R.inc(390);pm = configuration.getProgressMonitor();
        __CLR4_5_2ararlviclf00.R.inc(391);prepareReasoner();
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getReasonerName() {try{__CLR4_5_2ararlviclf00.R.inc(392);
        __CLR4_5_2ararlviclf00.R.inc(393);return "Structural Reasoner";
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public FreshEntityPolicy getFreshEntityPolicy() {try{__CLR4_5_2ararlviclf00.R.inc(394);
        __CLR4_5_2ararlviclf00.R.inc(395);return FreshEntityPolicy.ALLOW;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public IndividualNodeSetPolicy getIndividualNodeSetPolicy() {try{__CLR4_5_2ararlviclf00.R.inc(396);
        __CLR4_5_2ararlviclf00.R.inc(397);return IndividualNodeSetPolicy.BY_NAME;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public Version getReasonerVersion() {try{__CLR4_5_2ararlviclf00.R.inc(398);
        __CLR4_5_2ararlviclf00.R.inc(399);return VERSION;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    protected void handleChanges(@Nonnull Set<OWLAxiom> addAxioms, @Nonnull Set<OWLAxiom> removeAxioms) {try{__CLR4_5_2ararlviclf00.R.inc(400);
        __CLR4_5_2ararlviclf00.R.inc(401);handleChanges(addAxioms, removeAxioms, classHierarchyInfo);
        __CLR4_5_2ararlviclf00.R.inc(402);handleChanges(addAxioms, removeAxioms, objectPropertyHierarchyInfo);
        __CLR4_5_2ararlviclf00.R.inc(403);handleChanges(addAxioms, removeAxioms, dataPropertyHierarchyInfo);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private static <T extends OWLObject> void handleChanges(@Nonnull Set<OWLAxiom> added,
        @Nonnull Set<OWLAxiom> removed, @Nonnull AbstractHierarchyInfo<T> hierarchyInfo) {try{__CLR4_5_2ararlviclf00.R.inc(404);
        __CLR4_5_2ararlviclf00.R.inc(405);Set<T> sig = hierarchyInfo.getEntitiesInSignature(added);
        __CLR4_5_2ararlviclf00.R.inc(406);sig.addAll(hierarchyInfo.getEntitiesInSignature(removed));
        __CLR4_5_2ararlviclf00.R.inc(407);hierarchyInfo.processChanges(sig, added, removed);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public void interrupt() {try{__CLR4_5_2ararlviclf00.R.inc(408);
        __CLR4_5_2ararlviclf00.R.inc(409);interrupted = true;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private void ensurePrepared() {try{__CLR4_5_2ararlviclf00.R.inc(410);
        __CLR4_5_2ararlviclf00.R.inc(411);if ((((!prepared)&&(__CLR4_5_2ararlviclf00.R.iget(412)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(413)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(414);prepareReasoner();
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    /**
     * @throws ReasonerInterruptedException
     *         on interruption
     * @throws TimeOutException
     *         on timeout
     */
    public final void prepareReasoner() {try{__CLR4_5_2ararlviclf00.R.inc(415);
        __CLR4_5_2ararlviclf00.R.inc(416);classHierarchyInfo.computeHierarchy();
        __CLR4_5_2ararlviclf00.R.inc(417);objectPropertyHierarchyInfo.computeHierarchy();
        __CLR4_5_2ararlviclf00.R.inc(418);dataPropertyHierarchyInfo.computeHierarchy();
        __CLR4_5_2ararlviclf00.R.inc(419);prepared = true;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public void precomputeInferences(InferenceType... inferenceTypes) {try{__CLR4_5_2ararlviclf00.R.inc(420);
        __CLR4_5_2ararlviclf00.R.inc(421);prepareReasoner();
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isPrecomputed(InferenceType inferenceType) {try{__CLR4_5_2ararlviclf00.R.inc(422);
        __CLR4_5_2ararlviclf00.R.inc(423);return true;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Set<InferenceType> getPrecomputableInferenceTypes() {try{__CLR4_5_2ararlviclf00.R.inc(424);
        __CLR4_5_2ararlviclf00.R.inc(425);return CollectionFactory.createSet(InferenceType.CLASS_HIERARCHY, InferenceType.OBJECT_PROPERTY_HIERARCHY,
            InferenceType.DATA_PROPERTY_HIERARCHY);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    protected void throwExceptionIfInterrupted() {try{__CLR4_5_2ararlviclf00.R.inc(426);
        __CLR4_5_2ararlviclf00.R.inc(427);if ((((interrupted)&&(__CLR4_5_2ararlviclf00.R.iget(428)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(429)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(430);interrupted = false;
            __CLR4_5_2ararlviclf00.R.inc(431);throw new ReasonerInterruptedException();
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isConsistent() {try{__CLR4_5_2ararlviclf00.R.inc(432);
        __CLR4_5_2ararlviclf00.R.inc(433);return true;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isSatisfiable(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2ararlviclf00.R.inc(434);
        __CLR4_5_2ararlviclf00.R.inc(435);return !classExpression.isAnonymous() && !getEquivalentClasses(classExpression.asOWLClass()).contains(
            getDataFactory().getOWLNothing());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public Node<OWLClass> getUnsatisfiableClasses() {try{__CLR4_5_2ararlviclf00.R.inc(436);
        __CLR4_5_2ararlviclf00.R.inc(437);return OWLClassNode.getBottomNode();
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isEntailed(OWLAxiom axiom) {try{__CLR4_5_2ararlviclf00.R.inc(438);
        __CLR4_5_2ararlviclf00.R.inc(439);return getRootOntology().containsAxiom(axiom, INCLUDED, AxiomAnnotations.IGNORE_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isEntailed(@Nonnull Set<? extends OWLAxiom> axioms) {try{__CLR4_5_2ararlviclf00.R.inc(440);
        __CLR4_5_2ararlviclf00.R.inc(441);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_2ararlviclf00.R.iget(442)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(443)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(444);if ((((!getRootOntology().containsAxiom(ax, INCLUDED, AxiomAnnotations.IGNORE_AXIOM_ANNOTATIONS))&&(__CLR4_5_2ararlviclf00.R.iget(445)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(446)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(447);return false;
            }
        }}
        }__CLR4_5_2ararlviclf00.R.inc(448);return true;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public boolean isEntailmentCheckingSupported(AxiomType<?> axiomType) {try{__CLR4_5_2ararlviclf00.R.inc(449);
        __CLR4_5_2ararlviclf00.R.inc(450);return false;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLClass> getTopClassNode() {try{__CLR4_5_2ararlviclf00.R.inc(451);
        __CLR4_5_2ararlviclf00.R.inc(452);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(453);return classHierarchyInfo.getEquivalents(getDataFactory().getOWLThing());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLClass> getBottomClassNode() {try{__CLR4_5_2ararlviclf00.R.inc(454);
        __CLR4_5_2ararlviclf00.R.inc(455);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(456);return classHierarchyInfo.getEquivalents(getDataFactory().getOWLNothing());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getSubClasses(@Nonnull OWLClassExpression ce, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(457);
        __CLR4_5_2ararlviclf00.R.inc(458);OWLClassNodeSet ns = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(459);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(460)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(461)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(462);ensurePrepared();
            __CLR4_5_2ararlviclf00.R.inc(463);return classHierarchyInfo.getNodeHierarchyChildren(ce.asOWLClass(), direct, ns);
        }
        }__CLR4_5_2ararlviclf00.R.inc(464);return ns;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getSuperClasses(@Nonnull OWLClassExpression ce, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(465);
        __CLR4_5_2ararlviclf00.R.inc(466);OWLClassNodeSet ns = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(467);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(468)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(469)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(470);ensurePrepared();
            __CLR4_5_2ararlviclf00.R.inc(471);return classHierarchyInfo.getNodeHierarchyParents(ce.asOWLClass(), direct, ns);
        }
        }__CLR4_5_2ararlviclf00.R.inc(472);return ns;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLClass> getEquivalentClasses(@Nonnull OWLClassExpression ce) {try{__CLR4_5_2ararlviclf00.R.inc(473);
        __CLR4_5_2ararlviclf00.R.inc(474);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(475);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(476)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(477)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(478);return classHierarchyInfo.getEquivalents(ce.asOWLClass());
        } }else {{
            __CLR4_5_2ararlviclf00.R.inc(479);return new OWLClassNode();
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getDisjointClasses(@Nonnull OWLClassExpression ce) {try{__CLR4_5_2ararlviclf00.R.inc(480);
        __CLR4_5_2ararlviclf00.R.inc(481);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(482);OWLClassNodeSet nodeSet = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(483);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(484)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(485)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(486);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
                __CLR4_5_2ararlviclf00.R.inc(487);for (OWLDisjointClassesAxiom ax : ontology.getDisjointClassesAxioms(ce.asOWLClass())) {{
                    __CLR4_5_2ararlviclf00.R.inc(488);for (OWLClassExpression op : ax.getClassExpressions()) {{
                        __CLR4_5_2ararlviclf00.R.inc(489);if ((((!op.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(490)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(491)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(492);nodeSet.addNode(getEquivalentClasses(op));
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(493);return nodeSet;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLObjectPropertyExpression> getTopObjectPropertyNode() {try{__CLR4_5_2ararlviclf00.R.inc(494);
        __CLR4_5_2ararlviclf00.R.inc(495);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(496);return objectPropertyHierarchyInfo.getEquivalents(getDataFactory().getOWLTopObjectProperty());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLObjectPropertyExpression> getBottomObjectPropertyNode() {try{__CLR4_5_2ararlviclf00.R.inc(497);
        __CLR4_5_2ararlviclf00.R.inc(498);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(499);return objectPropertyHierarchyInfo.getEquivalents(getDataFactory().getOWLBottomObjectProperty());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLObjectPropertyExpression> getSubObjectProperties(OWLObjectPropertyExpression pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(500);
        __CLR4_5_2ararlviclf00.R.inc(501);OWLObjectPropertyNodeSet ns = new OWLObjectPropertyNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(502);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(503);return objectPropertyHierarchyInfo.getNodeHierarchyChildren(pe, direct, ns);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLObjectPropertyExpression> getSuperObjectProperties(OWLObjectPropertyExpression pe,
        boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(504);
        __CLR4_5_2ararlviclf00.R.inc(505);OWLObjectPropertyNodeSet ns = new OWLObjectPropertyNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(506);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(507);return objectPropertyHierarchyInfo.getNodeHierarchyParents(pe, direct, ns);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLObjectPropertyExpression> getEquivalentObjectProperties(OWLObjectPropertyExpression pe) {try{__CLR4_5_2ararlviclf00.R.inc(508);
        __CLR4_5_2ararlviclf00.R.inc(509);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(510);return objectPropertyHierarchyInfo.getEquivalents(pe);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLObjectPropertyExpression> getDisjointObjectProperties(OWLObjectPropertyExpression pe) {try{__CLR4_5_2ararlviclf00.R.inc(511);
        __CLR4_5_2ararlviclf00.R.inc(512);return new OWLObjectPropertyNodeSet();
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLObjectPropertyExpression> getInverseObjectProperties(@Nonnull OWLObjectPropertyExpression pe) {try{__CLR4_5_2ararlviclf00.R.inc(513);
        __CLR4_5_2ararlviclf00.R.inc(514);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(515);OWLObjectPropertyExpression inv = pe.getInverseProperty().getSimplified();
        __CLR4_5_2ararlviclf00.R.inc(516);return getEquivalentObjectProperties(inv);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getObjectPropertyDomains(@Nonnull OWLObjectPropertyExpression pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(517);
        __CLR4_5_2ararlviclf00.R.inc(518);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(519);DefaultNodeSet<OWLClass> result = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(520);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(521);for (OWLObjectPropertyDomainAxiom axiom : ontology.getObjectPropertyDomainAxioms(pe)) {{
                __CLR4_5_2ararlviclf00.R.inc(522);result.addNode(getEquivalentClasses(axiom.getDomain()));
                __CLR4_5_2ararlviclf00.R.inc(523);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(524)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(525)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(526);result.addAllNodes(getSuperClasses(axiom.getDomain(), false).getNodes());
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(527);for (OWLObjectPropertyExpression invPe : getInverseObjectProperties(pe).getEntities()) {{
                assert (((invPe != null)&&(__CLR4_5_2ararlviclf00.R.iget(528)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(529)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(530);for (OWLObjectPropertyRangeAxiom axiom : ontology.getObjectPropertyRangeAxioms(invPe)) {{
                    __CLR4_5_2ararlviclf00.R.inc(531);result.addNode(getEquivalentClasses(axiom.getRange()));
                    __CLR4_5_2ararlviclf00.R.inc(532);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(533)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(534)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(535);result.addAllNodes(getSuperClasses(axiom.getRange(), false).getNodes());
                    }
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(536);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getObjectPropertyRanges(@Nonnull OWLObjectPropertyExpression pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(537);
        __CLR4_5_2ararlviclf00.R.inc(538);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(539);DefaultNodeSet<OWLClass> result = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(540);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(541);for (OWLObjectPropertyRangeAxiom axiom : ontology.getObjectPropertyRangeAxioms(pe)) {{
                __CLR4_5_2ararlviclf00.R.inc(542);result.addNode(getEquivalentClasses(axiom.getRange()));
                __CLR4_5_2ararlviclf00.R.inc(543);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(544)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(545)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(546);result.addAllNodes(getSuperClasses(axiom.getRange(), false).getNodes());
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(547);for (OWLObjectPropertyExpression invPe : getInverseObjectProperties(pe).getEntities()) {{
                assert (((invPe != null)&&(__CLR4_5_2ararlviclf00.R.iget(548)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(549)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(550);for (OWLObjectPropertyDomainAxiom axiom : ontology.getObjectPropertyDomainAxioms(invPe)) {{
                    __CLR4_5_2ararlviclf00.R.inc(551);result.addNode(getEquivalentClasses(axiom.getDomain()));
                    __CLR4_5_2ararlviclf00.R.inc(552);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(553)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(554)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(555);result.addAllNodes(getSuperClasses(axiom.getDomain(), false).getNodes());
                    }
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(556);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLDataProperty> getTopDataPropertyNode() {try{__CLR4_5_2ararlviclf00.R.inc(557);
        __CLR4_5_2ararlviclf00.R.inc(558);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(559);return dataPropertyHierarchyInfo.getEquivalents(getDataFactory().getOWLTopDataProperty());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLDataProperty> getBottomDataPropertyNode() {try{__CLR4_5_2ararlviclf00.R.inc(560);
        __CLR4_5_2ararlviclf00.R.inc(561);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(562);return dataPropertyHierarchyInfo.getEquivalents(getDataFactory().getOWLBottomDataProperty());
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLDataProperty> getSubDataProperties(OWLDataProperty pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(563);
        __CLR4_5_2ararlviclf00.R.inc(564);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(565);OWLDataPropertyNodeSet ns = new OWLDataPropertyNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(566);return dataPropertyHierarchyInfo.getNodeHierarchyChildren(pe, direct, ns);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLDataProperty> getSuperDataProperties(OWLDataProperty pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(567);
        __CLR4_5_2ararlviclf00.R.inc(568);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(569);OWLDataPropertyNodeSet ns = new OWLDataPropertyNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(570);return dataPropertyHierarchyInfo.getNodeHierarchyParents(pe, direct, ns);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Override
    public Node<OWLDataProperty> getEquivalentDataProperties(OWLDataProperty pe) {try{__CLR4_5_2ararlviclf00.R.inc(571);
        __CLR4_5_2ararlviclf00.R.inc(572);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(573);return dataPropertyHierarchyInfo.getEquivalents(pe);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLDataProperty> getDisjointDataProperties(@Nonnull OWLDataPropertyExpression pe) {try{__CLR4_5_2ararlviclf00.R.inc(574);
        __CLR4_5_2ararlviclf00.R.inc(575);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(576);DefaultNodeSet<OWLDataProperty> result = new OWLDataPropertyNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(577);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(578);for (OWLDisjointDataPropertiesAxiom axiom : ontology.getDisjointDataPropertiesAxioms(pe
                .asOWLDataProperty())) {{
                __CLR4_5_2ararlviclf00.R.inc(579);for (OWLDataPropertyExpression dpe : axiom.getPropertiesMinus(pe)) {{
                    __CLR4_5_2ararlviclf00.R.inc(580);if ((((!dpe.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(581)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(582)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(583);result.addNode(dataPropertyHierarchyInfo.getEquivalents(dpe.asOWLDataProperty()));
                        __CLR4_5_2ararlviclf00.R.inc(584);result.addAllNodes(getSubDataProperties(dpe.asOWLDataProperty(), false).getNodes());
                    }
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(585);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getDataPropertyDomains(OWLDataProperty pe, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(586);
        __CLR4_5_2ararlviclf00.R.inc(587);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(588);DefaultNodeSet<OWLClass> result = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(589);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(590);for (OWLDataPropertyDomainAxiom axiom : ontology.getDataPropertyDomainAxioms(pe)) {{
                __CLR4_5_2ararlviclf00.R.inc(591);result.addNode(getEquivalentClasses(axiom.getDomain()));
                __CLR4_5_2ararlviclf00.R.inc(592);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(593)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(594)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(595);result.addAllNodes(getSuperClasses(axiom.getDomain(), false).getNodes());
                }
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(596);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLClass> getTypes(OWLNamedIndividual ind, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(597);
        __CLR4_5_2ararlviclf00.R.inc(598);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(599);DefaultNodeSet<OWLClass> result = new OWLClassNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(600);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(601);for (OWLClassAssertionAxiom axiom : ontology.getClassAssertionAxioms(ind)) {{
                __CLR4_5_2ararlviclf00.R.inc(602);OWLClassExpression ce = axiom.getClassExpression();
                __CLR4_5_2ararlviclf00.R.inc(603);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(604)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(605)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(606);result.addNode(classHierarchyInfo.getEquivalents(ce.asOWLClass()));
                    __CLR4_5_2ararlviclf00.R.inc(607);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(608)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(609)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(610);result.addAllNodes(getSuperClasses(ce, false).getNodes());
                    }
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(611);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLNamedIndividual> getInstances(@Nonnull OWLClassExpression ce, boolean direct) {try{__CLR4_5_2ararlviclf00.R.inc(612);
        __CLR4_5_2ararlviclf00.R.inc(613);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(614);DefaultNodeSet<OWLNamedIndividual> result = new OWLNamedIndividualNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(615);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(616)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(617)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(618);OWLClass cls = ce.asOWLClass();
            __CLR4_5_2ararlviclf00.R.inc(619);Set<OWLClass> clses = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(620);clses.add(cls);
            __CLR4_5_2ararlviclf00.R.inc(621);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(622)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(623)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(624);clses.addAll(getSubClasses(cls, false).getFlattened());
            }
            }__CLR4_5_2ararlviclf00.R.inc(625);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
                __CLR4_5_2ararlviclf00.R.inc(626);for (OWLClass curCls : clses) {{
                    assert (((curCls != null)&&(__CLR4_5_2ararlviclf00.R.iget(627)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(628)==0&false));
                    __CLR4_5_2ararlviclf00.R.inc(629);for (OWLClassAssertionAxiom axiom : ontology.getClassAssertionAxioms(curCls)) {{
                        __CLR4_5_2ararlviclf00.R.inc(630);OWLIndividual individual = axiom.getIndividual();
                        __CLR4_5_2ararlviclf00.R.inc(631);if ((((!individual.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(632)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(633)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(634);if ((((getIndividualNodeSetPolicy().equals(IndividualNodeSetPolicy.BY_SAME_AS))&&(__CLR4_5_2ararlviclf00.R.iget(635)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(636)==0&false))) {{
                                __CLR4_5_2ararlviclf00.R.inc(637);result.addNode(getSameIndividuals(individual.asOWLNamedIndividual()));
                            } }else {{
                                __CLR4_5_2ararlviclf00.R.inc(638);result.addNode(new OWLNamedIndividualNode(individual.asOWLNamedIndividual()));
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(639);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLNamedIndividual> getObjectPropertyValues(OWLNamedIndividual ind,
        @Nonnull OWLObjectPropertyExpression pe) {try{__CLR4_5_2ararlviclf00.R.inc(640);
        __CLR4_5_2ararlviclf00.R.inc(641);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(642);OWLNamedIndividualNodeSet result = new OWLNamedIndividualNodeSet();
        __CLR4_5_2ararlviclf00.R.inc(643);Node<OWLObjectPropertyExpression> inverses = getInverseObjectProperties(pe);
        __CLR4_5_2ararlviclf00.R.inc(644);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(645);for (OWLObjectPropertyAssertionAxiom axiom : ontology.getObjectPropertyAssertionAxioms(ind)) {{
                __CLR4_5_2ararlviclf00.R.inc(646);if ((((!axiom.getObject().isAnonymous() && axiom.getProperty().getSimplified().equals(pe
                    .getSimplified()))&&(__CLR4_5_2ararlviclf00.R.iget(647)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(648)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(649);if ((((getIndividualNodeSetPolicy().equals(IndividualNodeSetPolicy.BY_SAME_AS))&&(__CLR4_5_2ararlviclf00.R.iget(650)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(651)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(652);result.addNode(getSameIndividuals(axiom.getObject().asOWLNamedIndividual()));
                    } }else {{
                        __CLR4_5_2ararlviclf00.R.inc(653);result.addNode(new OWLNamedIndividualNode(axiom.getObject().asOWLNamedIndividual()));
                    }
                }}
                // Inverse of pe
                }__CLR4_5_2ararlviclf00.R.inc(654);if ((((axiom.getObject().equals(ind) && !axiom.getSubject().isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(655)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(656)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(657);OWLObjectPropertyExpression invPe = axiom.getProperty().getInverseProperty().getSimplified();
                    __CLR4_5_2ararlviclf00.R.inc(658);if ((((!invPe.isAnonymous() && inverses.contains(invPe.asOWLObjectProperty()))&&(__CLR4_5_2ararlviclf00.R.iget(659)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(660)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(661);if ((((getIndividualNodeSetPolicy().equals(IndividualNodeSetPolicy.BY_SAME_AS))&&(__CLR4_5_2ararlviclf00.R.iget(662)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(663)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(664);result.addNode(getSameIndividuals(axiom.getObject().asOWLNamedIndividual()));
                        } }else {{
                            __CLR4_5_2ararlviclf00.R.inc(665);result.addNode(new OWLNamedIndividualNode(axiom.getObject().asOWLNamedIndividual()));
                        }
                    }}
                }}
            }}
        }}
        // Could do other stuff like inspecting owl:hasValue restrictions
        }__CLR4_5_2ararlviclf00.R.inc(666);return result;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLLiteral> getDataPropertyValues(OWLNamedIndividual ind, OWLDataProperty pe) {try{__CLR4_5_2ararlviclf00.R.inc(667);
        __CLR4_5_2ararlviclf00.R.inc(668);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(669);Set<OWLLiteral> literals = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(670);Set<OWLDataProperty> superProperties = getSuperDataProperties(pe, false).getFlattened();
        __CLR4_5_2ararlviclf00.R.inc(671);superProperties.addAll(getEquivalentDataProperties(pe).getEntities());
        __CLR4_5_2ararlviclf00.R.inc(672);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
            __CLR4_5_2ararlviclf00.R.inc(673);for (OWLDataPropertyAssertionAxiom axiom : ontology.getDataPropertyAssertionAxioms(ind)) {{
                __CLR4_5_2ararlviclf00.R.inc(674);if ((((superProperties.contains(axiom.getProperty().asOWLDataProperty()))&&(__CLR4_5_2ararlviclf00.R.iget(675)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(676)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(677);literals.add(axiom.getObject());
                }
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(678);return literals;
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public Node<OWLNamedIndividual> getSameIndividuals(OWLNamedIndividual ind) {try{__CLR4_5_2ararlviclf00.R.inc(679);
        __CLR4_5_2ararlviclf00.R.inc(680);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(681);Set<OWLNamedIndividual> inds = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(682);Set<OWLSameIndividualAxiom> processed = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(683);List<OWLNamedIndividual> stack = new LinkedList<>();
        __CLR4_5_2ararlviclf00.R.inc(684);stack.add(ind);
        __CLR4_5_2ararlviclf00.R.inc(685);while ((((!stack.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(686)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(687)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(688);OWLNamedIndividual currentInd = stack.remove(0);
            assert (((currentInd != null)&&(__CLR4_5_2ararlviclf00.R.iget(689)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(690)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(691);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
                __CLR4_5_2ararlviclf00.R.inc(692);for (OWLSameIndividualAxiom axiom : ontology.getSameIndividualAxioms(currentInd)) {{
                    __CLR4_5_2ararlviclf00.R.inc(693);if ((((!processed.contains(axiom))&&(__CLR4_5_2ararlviclf00.R.iget(694)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(695)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(696);processed.add(axiom);
                        __CLR4_5_2ararlviclf00.R.inc(697);for (OWLIndividual i : axiom.getIndividuals()) {{
                            __CLR4_5_2ararlviclf00.R.inc(698);if ((((!i.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(699)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(700)==0&false))) {{
                                __CLR4_5_2ararlviclf00.R.inc(701);OWLNamedIndividual namedInd = i.asOWLNamedIndividual();
                                __CLR4_5_2ararlviclf00.R.inc(702);if ((((inds.add(namedInd))&&(__CLR4_5_2ararlviclf00.R.iget(703)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(704)==0&false))) {{
                                    __CLR4_5_2ararlviclf00.R.inc(705);stack.add(namedInd);
                                }
                            }}
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(706);if ((((inds.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(707)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(708)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(709);inds.add(ind);
        }
        }__CLR4_5_2ararlviclf00.R.inc(710);return new OWLNamedIndividualNode(inds);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    @Nonnull
    @Override
    public NodeSet<OWLNamedIndividual> getDifferentIndividuals(OWLNamedIndividual ind) {try{__CLR4_5_2ararlviclf00.R.inc(711);
        __CLR4_5_2ararlviclf00.R.inc(712);ensurePrepared();
        __CLR4_5_2ararlviclf00.R.inc(713);Set<OWLNamedIndividual> inds = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(714);Set<OWLDifferentIndividualsAxiom> processed = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(715);List<OWLNamedIndividual> stack = new LinkedList<>();
        __CLR4_5_2ararlviclf00.R.inc(716);stack.add(ind);
        __CLR4_5_2ararlviclf00.R.inc(717);while ((((!stack.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(718)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(719)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(720);OWLNamedIndividual currentInd = stack.remove(0);
            assert (((currentInd != null)&&(__CLR4_5_2ararlviclf00.R.iget(721)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(722)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(723);for (OWLOntology ontology : getRootOntology().getImportsClosure()) {{
                __CLR4_5_2ararlviclf00.R.inc(724);for (OWLDifferentIndividualsAxiom axiom : ontology.getDifferentIndividualAxioms(currentInd)) {{
                    __CLR4_5_2ararlviclf00.R.inc(725);if ((((!processed.contains(axiom))&&(__CLR4_5_2ararlviclf00.R.iget(726)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(727)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(728);processed.add(axiom);
                        __CLR4_5_2ararlviclf00.R.inc(729);for (OWLIndividual i : axiom.getIndividuals()) {{
                            __CLR4_5_2ararlviclf00.R.inc(730);if ((((!i.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(731)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(732)==0&false))) {{
                                __CLR4_5_2ararlviclf00.R.inc(733);OWLNamedIndividual namedInd = i.asOWLNamedIndividual();
                                __CLR4_5_2ararlviclf00.R.inc(734);if ((((inds.add(namedInd))&&(__CLR4_5_2ararlviclf00.R.iget(735)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(736)==0&false))) {{
                                    __CLR4_5_2ararlviclf00.R.inc(737);stack.add(namedInd);
                                }
                            }}
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_5_2ararlviclf00.R.inc(738);if ((((inds.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(739)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(740)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(741);inds.add(ind);
        }
        }__CLR4_5_2ararlviclf00.R.inc(742);Set<Node<OWLNamedIndividual>> set = new HashSet<>();
        __CLR4_5_2ararlviclf00.R.inc(743);for (OWLNamedIndividual n : inds) {{
            __CLR4_5_2ararlviclf00.R.inc(744);set.add(getSameIndividuals(n));
        }
        }__CLR4_5_2ararlviclf00.R.inc(745);return new OWLNamedIndividualNodeSet(set);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    protected OWLDataFactory getDataFactory() {try{__CLR4_5_2ararlviclf00.R.inc(746);
        __CLR4_5_2ararlviclf00.R.inc(747);return getRootOntology().getOWLOntologyManager().getOWLDataFactory();
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    /**
     * @param showBottomNode
     *        true if bottom node is to be showed
     */
    public void dumpClassHierarchy(boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(748);
        __CLR4_5_2ararlviclf00.R.inc(749);dumpClassHierarchy(OWLClassNode.getTopNode(), 0, showBottomNode);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private void dumpClassHierarchy(@Nonnull Node<OWLClass> cls, int level, boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(750);
        __CLR4_5_2ararlviclf00.R.inc(751);if ((((!showBottomNode && cls.isBottomNode())&&(__CLR4_5_2ararlviclf00.R.iget(752)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(753)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(754);return;
        }
        }__CLR4_5_2ararlviclf00.R.inc(755);printIndent(level);
        __CLR4_5_2ararlviclf00.R.inc(756);OWLClass representative = cls.getRepresentativeElement();
        __CLR4_5_2ararlviclf00.R.inc(757);System.out.println(getEquivalentClasses(representative));
        __CLR4_5_2ararlviclf00.R.inc(758);for (Node<OWLClass> subCls : getSubClasses(representative, true)) {{
            assert (((subCls != null)&&(__CLR4_5_2ararlviclf00.R.iget(759)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(760)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(761);dumpClassHierarchy(subCls, level + 1, showBottomNode);
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    /**
     * @param showBottomNode
     *        true if bottom node is to be showed
     */
    public void dumpObjectPropertyHierarchy(boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(762);
        __CLR4_5_2ararlviclf00.R.inc(763);dumpObjectPropertyHierarchy(OWLObjectPropertyNode.getTopNode(), 0, showBottomNode);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private void dumpObjectPropertyHierarchy(@Nonnull Node<OWLObjectPropertyExpression> cls, int level,
        boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(764);
        __CLR4_5_2ararlviclf00.R.inc(765);if ((((!showBottomNode && cls.isBottomNode())&&(__CLR4_5_2ararlviclf00.R.iget(766)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(767)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(768);return;
        }
        }__CLR4_5_2ararlviclf00.R.inc(769);printIndent(level);
        __CLR4_5_2ararlviclf00.R.inc(770);OWLObjectPropertyExpression representative = cls.getRepresentativeElement();
        __CLR4_5_2ararlviclf00.R.inc(771);System.out.println(getEquivalentObjectProperties(representative));
        __CLR4_5_2ararlviclf00.R.inc(772);for (Node<OWLObjectPropertyExpression> subProp : getSubObjectProperties(representative, true)) {{
            assert (((subProp != null)&&(__CLR4_5_2ararlviclf00.R.iget(773)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(774)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(775);dumpObjectPropertyHierarchy(subProp, level + 1, showBottomNode);
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    /**
     * @param showBottomNode
     *        true if bottom node is to be showed
     */
    public void dumpDataPropertyHierarchy(boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(776);
        __CLR4_5_2ararlviclf00.R.inc(777);dumpDataPropertyHierarchy(OWLDataPropertyNode.getTopNode(), 0, showBottomNode);
    }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private void dumpDataPropertyHierarchy(@Nonnull Node<OWLDataProperty> cls, int level, boolean showBottomNode) {try{__CLR4_5_2ararlviclf00.R.inc(778);
        __CLR4_5_2ararlviclf00.R.inc(779);if ((((!showBottomNode && cls.isBottomNode())&&(__CLR4_5_2ararlviclf00.R.iget(780)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(781)==0&false))) {{
            __CLR4_5_2ararlviclf00.R.inc(782);return;
        }
        }__CLR4_5_2ararlviclf00.R.inc(783);printIndent(level);
        __CLR4_5_2ararlviclf00.R.inc(784);OWLDataProperty representative = cls.getRepresentativeElement();
        __CLR4_5_2ararlviclf00.R.inc(785);System.out.println(getEquivalentDataProperties(representative));
        __CLR4_5_2ararlviclf00.R.inc(786);for (Node<OWLDataProperty> subProp : getSubDataProperties(representative, true)) {{
            assert (((subProp != null)&&(__CLR4_5_2ararlviclf00.R.iget(787)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(788)==0&false));
            __CLR4_5_2ararlviclf00.R.inc(789);dumpDataPropertyHierarchy(subProp, level + 1, showBottomNode);
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    private static void printIndent(int level) {try{__CLR4_5_2ararlviclf00.R.inc(790);
        __CLR4_5_2ararlviclf00.R.inc(791);for (int i = 0; (((i < level)&&(__CLR4_5_2ararlviclf00.R.iget(792)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(793)==0&false)); i++) {{
            __CLR4_5_2ararlviclf00.R.inc(794);System.out.print("    ");
        }
    }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

    // HierarchyInfo
    private abstract class AbstractHierarchyInfo<T extends OWLObject> {

        private final RawHierarchyProvider<T> rawParentChildProvider;
        /** The entity that always appears in the top node in the hierarchy. */
        @Nonnull
        T topEntity;
        /**
         * The entity that always appears as the bottom node in the hierarchy.
         */
        @Nonnull
        T bottomEntity;
        @Nonnull
        private final Set<T> directChildrenOfTopNode = new HashSet<>();
        @Nonnull
        private final Set<T> directParentsOfBottomNode = new HashSet<>();
        private final NodeCache<T> nodeCache;
        private final String name;
        private int classificationSize;

        AbstractHierarchyInfo(String name, @Nonnull T topEntity, @Nonnull T bottomEntity,
            RawHierarchyProvider<T> rawParentChildProvider) {try{__CLR4_5_2ararlviclf00.R.inc(795);
            __CLR4_5_2ararlviclf00.R.inc(796);this.topEntity = topEntity;
            __CLR4_5_2ararlviclf00.R.inc(797);this.bottomEntity = bottomEntity;
            __CLR4_5_2ararlviclf00.R.inc(798);nodeCache = new NodeCache<>(this);
            __CLR4_5_2ararlviclf00.R.inc(799);this.rawParentChildProvider = rawParentChildProvider;
            __CLR4_5_2ararlviclf00.R.inc(800);this.name = name;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public RawHierarchyProvider<T> getRawParentChildProvider() {try{__CLR4_5_2ararlviclf00.R.inc(801);
            __CLR4_5_2ararlviclf00.R.inc(802);return rawParentChildProvider;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        /**
         * Gets the set of relevant entities from the specified ontology.
         * 
         * @param ont
         *        The ontology
         * @return A set of entities to be "classified"
         */
        @Nonnull
        protected abstract Set<T> getEntities(@Nonnull OWLOntology ont);

        /**
         * Creates a node for a given set of entities.
         * 
         * @param cycle
         *        The set of entities
         * @return A node
         */
        @Nonnull
        protected abstract DefaultNode<T> createNode(@Nonnull Set<T> cycle);

        @Nonnull
        protected abstract DefaultNode<T> createNode();

        /**
         * Gets the set of relevant entities in a particular axiom.
         * 
         * @param ax
         *        The axiom
         * @return The set of relevant entities in the signature of the
         *         specified axiom
         */
        @Nonnull
        protected abstract Set<? extends T> getEntitiesInSignature(@Nonnull OWLAxiom ax);

        @Nonnull
        Set<T> getEntitiesInSignature(@Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_2ararlviclf00.R.inc(803);
            __CLR4_5_2ararlviclf00.R.inc(804);Set<T> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(805);for (OWLAxiom ax : axioms) {{
                assert (((ax != null)&&(__CLR4_5_2ararlviclf00.R.iget(806)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(807)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(808);result.addAll(getEntitiesInSignature(ax));
            }
            }__CLR4_5_2ararlviclf00.R.inc(809);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void computeHierarchy() {try{__CLR4_5_2ararlviclf00.R.inc(810);
            __CLR4_5_2ararlviclf00.R.inc(811);pm.reasonerTaskStarted("Computing " + name + " hierarchy");
            __CLR4_5_2ararlviclf00.R.inc(812);pm.reasonerTaskBusy();
            __CLR4_5_2ararlviclf00.R.inc(813);nodeCache.clear();
            __CLR4_5_2ararlviclf00.R.inc(814);Map<T, Collection<T>> cache = new HashMap<>();
            __CLR4_5_2ararlviclf00.R.inc(815);Set<T> entities = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(816);for (OWLOntology ont : getRootOntology().getImportsClosure()) {{
                assert (((ont != null)&&(__CLR4_5_2ararlviclf00.R.iget(817)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(818)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(819);entities.addAll(getEntities(ont));
            }
            }__CLR4_5_2ararlviclf00.R.inc(820);classificationSize = entities.size();
            __CLR4_5_2ararlviclf00.R.inc(821);pm.reasonerTaskProgressChanged(0, classificationSize);
            __CLR4_5_2ararlviclf00.R.inc(822);updateForSignature(entities, cache);
            __CLR4_5_2ararlviclf00.R.inc(823);pm.reasonerTaskStopped();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        private void updateForSignature(@Nonnull Set<T> signature, @Nullable Map<T, Collection<T>> cache) {try{__CLR4_5_2ararlviclf00.R.inc(824);
            __CLR4_5_2ararlviclf00.R.inc(825);HashSet<Set<T>> cyclesResult = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(826);Set<T> processed = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(827);nodeCache.clearTopNode();
            __CLR4_5_2ararlviclf00.R.inc(828);nodeCache.clearBottomNode();
            __CLR4_5_2ararlviclf00.R.inc(829);nodeCache.clearNodes(signature);
            __CLR4_5_2ararlviclf00.R.inc(830);directChildrenOfTopNode.removeAll(signature);
            __CLR4_5_2ararlviclf00.R.inc(831);Set<T> equivTopOrChildrenOfTop = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(832);Set<T> equivBottomOrParentsOfBottom = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(833);for (T entity : signature) {{
                assert (((entity != null)&&(__CLR4_5_2ararlviclf00.R.iget(834)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(835)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(836);if ((((!processed.contains(entity))&&(__CLR4_5_2ararlviclf00.R.iget(837)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(838)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(839);pm.reasonerTaskProgressChanged(processed.size(), signature.size());
                    __CLR4_5_2ararlviclf00.R.inc(840);tarjan(entity, 0, new Stack<T>(), new HashMap<T, Integer>(), new HashMap<T, Integer>(),
                        cyclesResult, processed, new HashSet<T>(), cache, equivTopOrChildrenOfTop,
                        equivBottomOrParentsOfBottom);
                    __CLR4_5_2ararlviclf00.R.inc(841);throwExceptionIfInterrupted();
                }
            }}
            // Store new cycles
            }__CLR4_5_2ararlviclf00.R.inc(842);for (Set<T> cycle : cyclesResult) {{
                assert (((cycle != null)&&(__CLR4_5_2ararlviclf00.R.iget(843)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(844)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(845);nodeCache.addNode(cycle);
            }
            }__CLR4_5_2ararlviclf00.R.inc(846);directChildrenOfTopNode.addAll(equivTopOrChildrenOfTop);
            __CLR4_5_2ararlviclf00.R.inc(847);directChildrenOfTopNode.removeAll(nodeCache.getTopNode().getEntities());
            __CLR4_5_2ararlviclf00.R.inc(848);directParentsOfBottomNode.addAll(equivBottomOrParentsOfBottom);
            __CLR4_5_2ararlviclf00.R.inc(849);directParentsOfBottomNode.removeAll(nodeCache.getBottomNode().getEntities());
            // Now check that each found cycle has a proper parent an child
            __CLR4_5_2ararlviclf00.R.inc(850);for (Set<T> node : cyclesResult) {{
                __CLR4_5_2ararlviclf00.R.inc(851);if ((((!node.contains(topEntity) && !node.contains(bottomEntity))&&(__CLR4_5_2ararlviclf00.R.iget(852)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(853)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(854);boolean childOfTop = true;
                    __CLR4_5_2ararlviclf00.R.inc(855);for (T element : node) {{
                        assert (((element != null)&&(__CLR4_5_2ararlviclf00.R.iget(856)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(857)==0&false));
                        __CLR4_5_2ararlviclf00.R.inc(858);Collection<T> parents = rawParentChildProvider.getParents(element);
                        __CLR4_5_2ararlviclf00.R.inc(859);parents.removeAll(node);
                        __CLR4_5_2ararlviclf00.R.inc(860);parents.removeAll(nodeCache.getTopNode().getEntities());
                        __CLR4_5_2ararlviclf00.R.inc(861);if ((((!parents.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(862)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(863)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(864);childOfTop = false;
                            __CLR4_5_2ararlviclf00.R.inc(865);break;
                        }
                    }}
                    }__CLR4_5_2ararlviclf00.R.inc(866);if ((((childOfTop)&&(__CLR4_5_2ararlviclf00.R.iget(867)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(868)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(869);directChildrenOfTopNode.addAll(node);
                    }
                    }__CLR4_5_2ararlviclf00.R.inc(870);boolean parentOfBottom = true;
                    __CLR4_5_2ararlviclf00.R.inc(871);for (T element : node) {{
                        assert (((element != null)&&(__CLR4_5_2ararlviclf00.R.iget(872)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(873)==0&false));
                        __CLR4_5_2ararlviclf00.R.inc(874);Collection<T> children = rawParentChildProvider.getChildren(element);
                        __CLR4_5_2ararlviclf00.R.inc(875);children.removeAll(node);
                        __CLR4_5_2ararlviclf00.R.inc(876);children.removeAll(nodeCache.getBottomNode().getEntities());
                        __CLR4_5_2ararlviclf00.R.inc(877);if ((((!children.isEmpty())&&(__CLR4_5_2ararlviclf00.R.iget(878)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(879)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(880);parentOfBottom = false;
                            __CLR4_5_2ararlviclf00.R.inc(881);break;
                        }
                    }}
                    }__CLR4_5_2ararlviclf00.R.inc(882);if ((((parentOfBottom)&&(__CLR4_5_2ararlviclf00.R.iget(883)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(884)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(885);directParentsOfBottomNode.addAll(node);
                    }
                }}
            }}
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        /**
         * Processes the specified signature that represents the signature of
         * potential changes.
         * 
         * @param signature
         *        The signature
         * @param added
         *        added axioms
         * @param removed
         *        removed axioms
         */
        @SuppressWarnings("unused")
        public void processChanges(@Nonnull Set<T> signature, @Nonnull Set<OWLAxiom> added,
            @Nonnull Set<OWLAxiom> removed) {try{__CLR4_5_2ararlviclf00.R.inc(886);
            __CLR4_5_2ararlviclf00.R.inc(887);updateForSignature(signature, null);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        /**
         * Applies the tarjan algorithm for a given entity. This computes the
         * cycle that the entity is involved in (if any).
         * 
         * @param entity
         *        The entity
         * @param inputIndex
         *        index
         * @param stack
         *        stack
         * @param indexMap
         *        index map
         * @param lowlinkMap
         *        low link map
         * @param result
         *        result
         * @param processed
         *        processed
         * @param stackEntities
         *        stack entities
         * @param cache
         *        A cache of children to parents - may be {@code null} if no
         *        caching is to take place.
         * @param childrenOfTop
         *        A set of entities that have a raw parent that is the top
         *        entity
         * @param parentsOfBottom
         *        A set of entities that have a raw parent that is the bottom
         *        entity
         */
        public void tarjan(@Nonnull T entity, int inputIndex, @Nonnull Stack<T> stack,
            @Nonnull Map<T, Integer> indexMap, @Nonnull Map<T, Integer> lowlinkMap, @Nonnull Set<Set<T>> result,
            @Nonnull Set<T> processed, @Nonnull Set<T> stackEntities, @Nullable Map<T, Collection<T>> cache,
            @Nonnull Set<T> childrenOfTop, @Nonnull Set<T> parentsOfBottom) {try{__CLR4_5_2ararlviclf00.R.inc(888);
            __CLR4_5_2ararlviclf00.R.inc(889);int index = inputIndex;
            __CLR4_5_2ararlviclf00.R.inc(890);throwExceptionIfInterrupted();
            __CLR4_5_2ararlviclf00.R.inc(891);if ((((processed.add(entity))&&(__CLR4_5_2ararlviclf00.R.iget(892)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(893)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(894);Collection<T> rawChildren = rawParentChildProvider.getChildren(entity);
                __CLR4_5_2ararlviclf00.R.inc(895);if ((((rawChildren.isEmpty() || rawChildren.contains(bottomEntity))&&(__CLR4_5_2ararlviclf00.R.iget(896)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(897)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(898);parentsOfBottom.add(entity);
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(899);pm.reasonerTaskProgressChanged(processed.size(), classificationSize);
            __CLR4_5_2ararlviclf00.R.inc(900);indexMap.put(entity, index);
            __CLR4_5_2ararlviclf00.R.inc(901);lowlinkMap.put(entity, index);
            __CLR4_5_2ararlviclf00.R.inc(902);index += 1;
            __CLR4_5_2ararlviclf00.R.inc(903);stack.push(entity);
            __CLR4_5_2ararlviclf00.R.inc(904);stackEntities.add(entity);
            // Get the raw parents - cache if necessary
            __CLR4_5_2ararlviclf00.R.inc(905);Collection<T> rawParents = null;
            __CLR4_5_2ararlviclf00.R.inc(906);if ((((cache != null)&&(__CLR4_5_2ararlviclf00.R.iget(907)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(908)==0&false))) {{
                // We are therefore caching raw parents of children.
                __CLR4_5_2ararlviclf00.R.inc(909);rawParents = cache.get(entity);
                __CLR4_5_2ararlviclf00.R.inc(910);if ((((rawParents == null)&&(__CLR4_5_2ararlviclf00.R.iget(911)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(912)==0&false))) {{
                    // Not in cache!
                    __CLR4_5_2ararlviclf00.R.inc(913);rawParents = rawParentChildProvider.getParents(entity);
                    // Note down if our entity is a
                    __CLR4_5_2ararlviclf00.R.inc(914);if ((((rawParents.isEmpty() || rawParents.contains(topEntity))&&(__CLR4_5_2ararlviclf00.R.iget(915)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(916)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(917);childrenOfTop.add(entity);
                    }
                    }__CLR4_5_2ararlviclf00.R.inc(918);cache.put(entity, rawParents);
                }
            }} }else {{
                __CLR4_5_2ararlviclf00.R.inc(919);rawParents = rawParentChildProvider.getParents(entity);
                // Note down if our entity is a
                __CLR4_5_2ararlviclf00.R.inc(920);if ((((rawParents.isEmpty() || rawParents.contains(topEntity))&&(__CLR4_5_2ararlviclf00.R.iget(921)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(922)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(923);childrenOfTop.add(entity);
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(924);for (T superEntity : rawParents) {{
                assert (((superEntity != null)&&(__CLR4_5_2ararlviclf00.R.iget(925)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(926)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(927);if ((((!indexMap.containsKey(superEntity))&&(__CLR4_5_2ararlviclf00.R.iget(928)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(929)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(930);tarjan(superEntity, index, stack, indexMap, lowlinkMap, result, processed, stackEntities, cache,
                        childrenOfTop, parentsOfBottom);
                    __CLR4_5_2ararlviclf00.R.inc(931);lowlinkMap.put(entity, Math.min(lowlinkMap.get(entity), lowlinkMap.get(superEntity)));
                } }else {__CLR4_5_2ararlviclf00.R.inc(932);if ((((stackEntities.contains(superEntity))&&(__CLR4_5_2ararlviclf00.R.iget(933)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(934)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(935);lowlinkMap.put(entity, Math.min(lowlinkMap.get(entity), indexMap.get(superEntity)));
                }
            }}}
            }__CLR4_5_2ararlviclf00.R.inc(936);if ((((lowlinkMap.get(entity).equals(indexMap.get(entity)))&&(__CLR4_5_2ararlviclf00.R.iget(937)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(938)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(939);Set<T> scc = new HashSet<>();
                __CLR4_5_2ararlviclf00.R.inc(940);while (true) {{
                    __CLR4_5_2ararlviclf00.R.inc(941);T clsPrime = stack.pop();
                    __CLR4_5_2ararlviclf00.R.inc(942);stackEntities.remove(clsPrime);
                    __CLR4_5_2ararlviclf00.R.inc(943);scc.add(clsPrime);
                    __CLR4_5_2ararlviclf00.R.inc(944);if ((((clsPrime.equals(entity))&&(__CLR4_5_2ararlviclf00.R.iget(945)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(946)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(947);break;
                    }
                }}
                }__CLR4_5_2ararlviclf00.R.inc(948);if ((((scc.size() > 1)&&(__CLR4_5_2ararlviclf00.R.iget(949)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(950)==0&false))) {{
                    // We ADD a cycle
                    __CLR4_5_2ararlviclf00.R.inc(951);result.add(scc);
                }
            }}
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public NodeSet<T> getNodeHierarchyChildren(@Nonnull T parent, boolean direct, @Nonnull DefaultNodeSet<T> ns) {try{__CLR4_5_2ararlviclf00.R.inc(952);
            __CLR4_5_2ararlviclf00.R.inc(953);Node<T> node = nodeCache.getNode(parent);
            __CLR4_5_2ararlviclf00.R.inc(954);if ((((node.isBottomNode())&&(__CLR4_5_2ararlviclf00.R.iget(955)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(956)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(957);return ns;
            }
            }__CLR4_5_2ararlviclf00.R.inc(958);Set<T> directChildren = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(959);for (T equiv : node) {{
                assert (((equiv != null)&&(__CLR4_5_2ararlviclf00.R.iget(960)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(961)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(962);directChildren.addAll(rawParentChildProvider.getChildren(equiv));
                __CLR4_5_2ararlviclf00.R.inc(963);if ((((directParentsOfBottomNode.contains(equiv))&&(__CLR4_5_2ararlviclf00.R.iget(964)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(965)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(966);ns.addNode(nodeCache.getBottomNode());
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(967);directChildren.removeAll(node.getEntities());
            __CLR4_5_2ararlviclf00.R.inc(968);if ((((node.isTopNode())&&(__CLR4_5_2ararlviclf00.R.iget(969)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(970)==0&false))) {{
                // Special treatment
                __CLR4_5_2ararlviclf00.R.inc(971);directChildren.addAll(directChildrenOfTopNode);
            }
            }__CLR4_5_2ararlviclf00.R.inc(972);for (Node<T> childNode : nodeCache.getNodes(directChildren)) {{
                assert (((childNode != null)&&(__CLR4_5_2ararlviclf00.R.iget(973)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(974)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(975);ns.addNode(childNode);
            }
            }__CLR4_5_2ararlviclf00.R.inc(976);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(977)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(978)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(979);for (T child : directChildren) {{
                    assert (((child != null)&&(__CLR4_5_2ararlviclf00.R.iget(980)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(981)==0&false));
                    __CLR4_5_2ararlviclf00.R.inc(982);getNodeHierarchyChildren(child, direct, ns);
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(983);return ns;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public NodeSet<T> getNodeHierarchyParents(@Nonnull T child, boolean direct, @Nonnull DefaultNodeSet<T> ns) {try{__CLR4_5_2ararlviclf00.R.inc(984);
            __CLR4_5_2ararlviclf00.R.inc(985);Node<T> node = nodeCache.getNode(child);
            __CLR4_5_2ararlviclf00.R.inc(986);if ((((node.isTopNode())&&(__CLR4_5_2ararlviclf00.R.iget(987)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(988)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(989);return ns;
            }
            }__CLR4_5_2ararlviclf00.R.inc(990);Set<T> directParents = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(991);for (T equiv : node) {{
                assert (((equiv != null)&&(__CLR4_5_2ararlviclf00.R.iget(992)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(993)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(994);directParents.addAll(rawParentChildProvider.getParents(equiv));
                __CLR4_5_2ararlviclf00.R.inc(995);if ((((directChildrenOfTopNode.contains(equiv))&&(__CLR4_5_2ararlviclf00.R.iget(996)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(997)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(998);ns.addNode(nodeCache.getTopNode());
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(999);directParents.removeAll(node.getEntities());
            __CLR4_5_2ararlviclf00.R.inc(1000);if ((((node.isBottomNode())&&(__CLR4_5_2ararlviclf00.R.iget(1001)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1002)==0&false))) {{
                // Special treatment
                __CLR4_5_2ararlviclf00.R.inc(1003);directParents.addAll(directParentsOfBottomNode);
            }
            }__CLR4_5_2ararlviclf00.R.inc(1004);for (Node<T> parentNode : nodeCache.getNodes(directParents)) {{
                assert (((parentNode != null)&&(__CLR4_5_2ararlviclf00.R.iget(1005)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1006)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(1007);ns.addNode(parentNode);
            }
            }__CLR4_5_2ararlviclf00.R.inc(1008);if ((((!direct)&&(__CLR4_5_2ararlviclf00.R.iget(1009)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1010)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1011);for (T parent : directParents) {{
                    assert (((parent != null)&&(__CLR4_5_2ararlviclf00.R.iget(1012)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1013)==0&false));
                    __CLR4_5_2ararlviclf00.R.inc(1014);getNodeHierarchyParents(parent, direct, ns);
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(1015);return ns;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public Node<T> getEquivalents(@Nonnull T element) {try{__CLR4_5_2ararlviclf00.R.inc(1016);
            __CLR4_5_2ararlviclf00.R.inc(1017);return nodeCache.getNode(element);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private static class NodeCache<T extends OWLObject> {

        @Nonnull
        private final AbstractHierarchyInfo<T> hierarchyInfo;
        private Node<T> topNode;
        private Node<T> bottomNode;
        @Nonnull
        private final Map<T, Node<T>> map = new HashMap<>();

        protected NodeCache(@Nonnull AbstractHierarchyInfo<T> hierarchyInfo) {try{__CLR4_5_2ararlviclf00.R.inc(1018);
            __CLR4_5_2ararlviclf00.R.inc(1019);this.hierarchyInfo = hierarchyInfo;
            __CLR4_5_2ararlviclf00.R.inc(1020);clearTopNode();
            __CLR4_5_2ararlviclf00.R.inc(1021);clearBottomNode();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void addNode(@Nonnull Node<T> node) {try{__CLR4_5_2ararlviclf00.R.inc(1022);
            __CLR4_5_2ararlviclf00.R.inc(1023);for (T element : node.getEntities()) {{
                __CLR4_5_2ararlviclf00.R.inc(1024);map.put(element, node);
                __CLR4_5_2ararlviclf00.R.inc(1025);if ((((element.isTopEntity())&&(__CLR4_5_2ararlviclf00.R.iget(1026)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1027)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(1028);topNode = node;
                } }else {__CLR4_5_2ararlviclf00.R.inc(1029);if ((((element.isBottomEntity())&&(__CLR4_5_2ararlviclf00.R.iget(1030)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1031)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(1032);bottomNode = node;
                }
            }}}
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public Set<Node<T>> getNodes(@Nonnull Set<T> elements) {try{__CLR4_5_2ararlviclf00.R.inc(1033);
            __CLR4_5_2ararlviclf00.R.inc(1034);Set<Node<T>> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1035);for (T element : elements) {{
                assert (((element != null)&&(__CLR4_5_2ararlviclf00.R.iget(1036)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1037)==0&false));
                __CLR4_5_2ararlviclf00.R.inc(1038);result.add(getNode(element));
            }
            }__CLR4_5_2ararlviclf00.R.inc(1039);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public Node<T> getNode(@Nonnull T containing) {try{__CLR4_5_2ararlviclf00.R.inc(1040);
            __CLR4_5_2ararlviclf00.R.inc(1041);Node<T> parentNode = map.get(containing);
            __CLR4_5_2ararlviclf00.R.inc(1042);if ((((parentNode != null)&&(__CLR4_5_2ararlviclf00.R.iget(1043)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1044)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1045);return parentNode;
            } }else {{
                __CLR4_5_2ararlviclf00.R.inc(1046);return hierarchyInfo.createNode(CollectionFactory.createSet(containing));
            }
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void addNode(@Nonnull Set<T> elements) {try{__CLR4_5_2ararlviclf00.R.inc(1047);
            __CLR4_5_2ararlviclf00.R.inc(1048);addNode(hierarchyInfo.createNode(elements));
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public Node<T> getTopNode() {try{__CLR4_5_2ararlviclf00.R.inc(1049);
            __CLR4_5_2ararlviclf00.R.inc(1050);return verifyNotNull(topNode);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        public Node<T> getBottomNode() {try{__CLR4_5_2ararlviclf00.R.inc(1051);
            __CLR4_5_2ararlviclf00.R.inc(1052);return verifyNotNull(bottomNode);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public final void clearTopNode() {try{__CLR4_5_2ararlviclf00.R.inc(1053);
            __CLR4_5_2ararlviclf00.R.inc(1054);removeNode(hierarchyInfo.topEntity);
            __CLR4_5_2ararlviclf00.R.inc(1055);topNode = hierarchyInfo.createNode(CollectionFactory.createSet(hierarchyInfo.topEntity));
            __CLR4_5_2ararlviclf00.R.inc(1056);addNode(getTopNode());
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public final void clearBottomNode() {try{__CLR4_5_2ararlviclf00.R.inc(1057);
            __CLR4_5_2ararlviclf00.R.inc(1058);removeNode(hierarchyInfo.bottomEntity);
            __CLR4_5_2ararlviclf00.R.inc(1059);bottomNode = hierarchyInfo.createNode(CollectionFactory.createSet(hierarchyInfo.bottomEntity));
            __CLR4_5_2ararlviclf00.R.inc(1060);addNode(getBottomNode());
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void clearNodes(@Nonnull Set<T> containing) {try{__CLR4_5_2ararlviclf00.R.inc(1061);
            __CLR4_5_2ararlviclf00.R.inc(1062);for (T entity : containing) {{
                __CLR4_5_2ararlviclf00.R.inc(1063);removeNode(entity);
            }
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void clear() {try{__CLR4_5_2ararlviclf00.R.inc(1064);
            __CLR4_5_2ararlviclf00.R.inc(1065);map.clear();
            __CLR4_5_2ararlviclf00.R.inc(1066);clearTopNode();
            __CLR4_5_2ararlviclf00.R.inc(1067);clearBottomNode();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public void removeNode(T containing) {try{__CLR4_5_2ararlviclf00.R.inc(1068);
            __CLR4_5_2ararlviclf00.R.inc(1069);Node<T> node = map.remove(containing);
            __CLR4_5_2ararlviclf00.R.inc(1070);if ((((node != null)&&(__CLR4_5_2ararlviclf00.R.iget(1071)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1072)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1073);for (T object : node.getEntities()) {{
                    __CLR4_5_2ararlviclf00.R.inc(1074);map.remove(object);
                }
            }}
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private class ClassHierarchyInfo extends AbstractHierarchyInfo<OWLClass> {

        ClassHierarchyInfo() {
            super("class", getDataFactory().getOWLThing(), getDataFactory().getOWLNothing(),
                new RawClassHierarchyProvider());__CLR4_5_2ararlviclf00.R.inc(1076);try{__CLR4_5_2ararlviclf00.R.inc(1075);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected Set<OWLClass> getEntitiesInSignature(@Nonnull OWLAxiom ax) {try{__CLR4_5_2ararlviclf00.R.inc(1077);
            __CLR4_5_2ararlviclf00.R.inc(1078);return ax.getClassesInSignature();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLClass> createNode(@Nonnull Set<OWLClass> cycle) {try{__CLR4_5_2ararlviclf00.R.inc(1079);
            __CLR4_5_2ararlviclf00.R.inc(1080);return new OWLClassNode(cycle);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected Set<OWLClass> getEntities(@Nonnull OWLOntology ont) {try{__CLR4_5_2ararlviclf00.R.inc(1081);
            __CLR4_5_2ararlviclf00.R.inc(1082);return ont.getClassesInSignature();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLClass> createNode() {try{__CLR4_5_2ararlviclf00.R.inc(1083);
            __CLR4_5_2ararlviclf00.R.inc(1084);return new OWLClassNode();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private class ObjectPropertyHierarchyInfo extends AbstractHierarchyInfo<OWLObjectPropertyExpression> {

        ObjectPropertyHierarchyInfo() {
            super("object property", getDataFactory().getOWLTopObjectProperty(), getDataFactory()
                .getOWLBottomObjectProperty(), new RawObjectPropertyHierarchyProvider());__CLR4_5_2ararlviclf00.R.inc(1086);try{__CLR4_5_2ararlviclf00.R.inc(1085);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected Set<OWLObjectPropertyExpression> getEntitiesInSignature(@Nonnull OWLAxiom ax) {try{__CLR4_5_2ararlviclf00.R.inc(1087);
            __CLR4_5_2ararlviclf00.R.inc(1088);Set<OWLObjectPropertyExpression> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1089);for (OWLObjectProperty property : ax.getObjectPropertiesInSignature()) {{
                __CLR4_5_2ararlviclf00.R.inc(1090);result.add(property);
                __CLR4_5_2ararlviclf00.R.inc(1091);result.add(property.getInverseProperty());
            }
            }__CLR4_5_2ararlviclf00.R.inc(1092);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected Set<OWLObjectPropertyExpression> getEntities(@Nonnull OWLOntology ont) {try{__CLR4_5_2ararlviclf00.R.inc(1093);
            __CLR4_5_2ararlviclf00.R.inc(1094);Set<OWLObjectPropertyExpression> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1095);for (OWLObjectPropertyExpression property : ont.getObjectPropertiesInSignature()) {{
                __CLR4_5_2ararlviclf00.R.inc(1096);result.add(property);
                __CLR4_5_2ararlviclf00.R.inc(1097);result.add(property.getInverseProperty());
            }
            }__CLR4_5_2ararlviclf00.R.inc(1098);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLObjectPropertyExpression> createNode(Set<OWLObjectPropertyExpression> cycle) {try{__CLR4_5_2ararlviclf00.R.inc(1099);
            __CLR4_5_2ararlviclf00.R.inc(1100);return new OWLObjectPropertyNode(cycle);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLObjectPropertyExpression> createNode() {try{__CLR4_5_2ararlviclf00.R.inc(1101);
            __CLR4_5_2ararlviclf00.R.inc(1102);return new OWLObjectPropertyNode();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Override
        public void processChanges(@Nonnull Set<OWLObjectPropertyExpression> signature, @Nonnull Set<OWLAxiom> added,
            @Nonnull Set<OWLAxiom> removed) {try{__CLR4_5_2ararlviclf00.R.inc(1103);
            __CLR4_5_2ararlviclf00.R.inc(1104);boolean rebuild = false;
            __CLR4_5_2ararlviclf00.R.inc(1105);for (OWLAxiom ax : added) {{
                __CLR4_5_2ararlviclf00.R.inc(1106);if ((((ax instanceof OWLObjectPropertyAxiom)&&(__CLR4_5_2ararlviclf00.R.iget(1107)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1108)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(1109);rebuild = true;
                    __CLR4_5_2ararlviclf00.R.inc(1110);break;
                }
            }}
            }__CLR4_5_2ararlviclf00.R.inc(1111);if ((((!rebuild)&&(__CLR4_5_2ararlviclf00.R.iget(1112)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1113)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1114);for (OWLAxiom ax : removed) {{
                    __CLR4_5_2ararlviclf00.R.inc(1115);if ((((ax instanceof OWLObjectPropertyAxiom)&&(__CLR4_5_2ararlviclf00.R.iget(1116)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1117)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(1118);rebuild = true;
                        __CLR4_5_2ararlviclf00.R.inc(1119);break;
                    }
                }}
            }}
            }__CLR4_5_2ararlviclf00.R.inc(1120);if ((((rebuild)&&(__CLR4_5_2ararlviclf00.R.iget(1121)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1122)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1123);((RawObjectPropertyHierarchyProvider) getRawParentChildProvider()).rebuild();
            }
            }__CLR4_5_2ararlviclf00.R.inc(1124);super.processChanges(signature, added, removed);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private class DataPropertyHierarchyInfo extends AbstractHierarchyInfo<OWLDataProperty> {

        DataPropertyHierarchyInfo() {
            super("data property", getDataFactory().getOWLTopDataProperty(), getDataFactory()
                .getOWLBottomDataProperty(), new RawDataPropertyHierarchyProvider());__CLR4_5_2ararlviclf00.R.inc(1126);try{__CLR4_5_2ararlviclf00.R.inc(1125);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Override
        protected Set<OWLDataProperty> getEntitiesInSignature(@Nonnull OWLAxiom ax) {try{__CLR4_5_2ararlviclf00.R.inc(1127);
            __CLR4_5_2ararlviclf00.R.inc(1128);return ax.getDataPropertiesInSignature();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Override
        protected Set<OWLDataProperty> getEntities(@Nonnull OWLOntology ont) {try{__CLR4_5_2ararlviclf00.R.inc(1129);
            __CLR4_5_2ararlviclf00.R.inc(1130);return ont.getDataPropertiesInSignature();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLDataProperty> createNode(Set<OWLDataProperty> cycle) {try{__CLR4_5_2ararlviclf00.R.inc(1131);
            __CLR4_5_2ararlviclf00.R.inc(1132);return new OWLDataPropertyNode(cycle);
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        protected DefaultNode<OWLDataProperty> createNode() {try{__CLR4_5_2ararlviclf00.R.inc(1133);
            __CLR4_5_2ararlviclf00.R.inc(1134);return new OWLDataPropertyNode();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    /**
     * An interface for objects who can provide the parents and children of some
     * object.
     * 
     * @param <T>
     *        type of elements
     */
    private interface RawHierarchyProvider<T> {

        /**
         * Gets the parents as asserted. These parents may also be children
         * (resulting in equivalences).
         * 
         * @param child
         *        The child whose parents are to be retrieved
         * @return The raw asserted parents of the specified child. If the child
         *         does not have any parents then the empty set can be returned.
         */
        @Nonnull
        Collection<T> getParents(@Nonnull T child);

        /**
         * Gets the children as asserted.
         * 
         * @param parent
         *        The parent whose children are to be retrieved
         * @return The raw asserted children of the speicified parent
         */
        @Nonnull
        Collection<T> getChildren(@Nonnull T parent);
    }

    private class RawClassHierarchyProvider implements RawHierarchyProvider<OWLClass> {

        RawClassHierarchyProvider() {try{__CLR4_5_2ararlviclf00.R.inc(1135);}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLClass> getParents(OWLClass child) {try{__CLR4_5_2ararlviclf00.R.inc(1136);
            __CLR4_5_2ararlviclf00.R.inc(1137);Collection<OWLClass> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1138);for (OWLOntology ont : getRootOntology().getImportsClosure()) {{
                __CLR4_5_2ararlviclf00.R.inc(1139);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(child)) {{
                    __CLR4_5_2ararlviclf00.R.inc(1140);OWLClassExpression superCls = ax.getSuperClass();
                    __CLR4_5_2ararlviclf00.R.inc(1141);if ((((!superCls.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(1142)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1143)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(1144);result.add(superCls.asOWLClass());
                    } }else {__CLR4_5_2ararlviclf00.R.inc(1145);if ((((superCls instanceof OWLObjectIntersectionOf)&&(__CLR4_5_2ararlviclf00.R.iget(1146)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1147)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(1148);OWLObjectIntersectionOf intersectionOf = (OWLObjectIntersectionOf) superCls;
                        __CLR4_5_2ararlviclf00.R.inc(1149);for (OWLClassExpression conjunct : intersectionOf.asConjunctSet()) {{
                            __CLR4_5_2ararlviclf00.R.inc(1150);if ((((!conjunct.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(1151)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1152)==0&false))) {{
                                __CLR4_5_2ararlviclf00.R.inc(1153);result.add(conjunct.asOWLClass());
                            }
                        }}
                    }}
                }}}
                }__CLR4_5_2ararlviclf00.R.inc(1154);for (OWLEquivalentClassesAxiom ax : ont.getEquivalentClassesAxioms(child)) {{
                    __CLR4_5_2ararlviclf00.R.inc(1155);for (OWLClassExpression ce : ax.getClassExpressionsMinus(child)) {{
                        __CLR4_5_2ararlviclf00.R.inc(1156);if ((((!ce.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(1157)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1158)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(1159);result.add(ce.asOWLClass());
                        } }else {__CLR4_5_2ararlviclf00.R.inc(1160);if ((((ce instanceof OWLObjectIntersectionOf)&&(__CLR4_5_2ararlviclf00.R.iget(1161)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1162)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(1163);OWLObjectIntersectionOf intersectionOf = (OWLObjectIntersectionOf) ce;
                            __CLR4_5_2ararlviclf00.R.inc(1164);for (OWLClassExpression conjunct : intersectionOf.asConjunctSet()) {{
                                __CLR4_5_2ararlviclf00.R.inc(1165);if ((((!conjunct.isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(1166)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1167)==0&false))) {{
                                    __CLR4_5_2ararlviclf00.R.inc(1168);result.add(conjunct.asOWLClass());
                                }
                            }}
                        }}
                    }}}
                }}
            }}
            }__CLR4_5_2ararlviclf00.R.inc(1169);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLClass> getChildren(OWLClass parent) {try{__CLR4_5_2ararlviclf00.R.inc(1170);
            __CLR4_5_2ararlviclf00.R.inc(1171);Collection<OWLClass> result = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1172);for (OWLAxiom ax : getRootOntology().getReferencingAxioms(parent, INCLUDED)) {{
                __CLR4_5_2ararlviclf00.R.inc(1173);if ((((ax instanceof OWLSubClassOfAxiom)&&(__CLR4_5_2ararlviclf00.R.iget(1174)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1175)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(1176);OWLSubClassOfAxiom sca = (OWLSubClassOfAxiom) ax;
                    __CLR4_5_2ararlviclf00.R.inc(1177);if ((((!sca.getSubClass().isAnonymous())&&(__CLR4_5_2ararlviclf00.R.iget(1178)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1179)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(1180);Set<OWLClassExpression> conjuncts = sca.getSuperClass().asConjunctSet();
                        __CLR4_5_2ararlviclf00.R.inc(1181);if ((((conjuncts.contains(parent))&&(__CLR4_5_2ararlviclf00.R.iget(1182)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1183)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(1184);result.add(sca.getSubClass().asOWLClass());
                        }
                    }}
                }} }else {__CLR4_5_2ararlviclf00.R.inc(1185);if ((((ax instanceof OWLEquivalentClassesAxiom)&&(__CLR4_5_2ararlviclf00.R.iget(1186)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1187)==0&false))) {{
                    __CLR4_5_2ararlviclf00.R.inc(1188);OWLEquivalentClassesAxiom eca = (OWLEquivalentClassesAxiom) ax;
                    __CLR4_5_2ararlviclf00.R.inc(1189);for (OWLClassExpression ce : eca.getClassExpressions()) {{
                        __CLR4_5_2ararlviclf00.R.inc(1190);if ((((ce.containsConjunct(parent))&&(__CLR4_5_2ararlviclf00.R.iget(1191)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1192)==0&false))) {{
                            __CLR4_5_2ararlviclf00.R.inc(1193);for (OWLClassExpression sub : eca.getClassExpressions()) {{
                                __CLR4_5_2ararlviclf00.R.inc(1194);if ((((!sub.isAnonymous() && !sub.equals(ce))&&(__CLR4_5_2ararlviclf00.R.iget(1195)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1196)==0&false))) {{
                                    __CLR4_5_2ararlviclf00.R.inc(1197);result.add(sub.asOWLClass());
                                }
                            }}
                        }}
                    }}
                }}
            }}}
            }__CLR4_5_2ararlviclf00.R.inc(1198);return result;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private class RawObjectPropertyHierarchyProvider implements RawHierarchyProvider<OWLObjectPropertyExpression> {

        private OWLObjectPropertyManager propertyManager;
        private Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> sub2Super;
        private Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> super2Sub;

        RawObjectPropertyHierarchyProvider() {try{__CLR4_5_2ararlviclf00.R.inc(1199);
            __CLR4_5_2ararlviclf00.R.inc(1200);rebuild();
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        public final void rebuild() {try{__CLR4_5_2ararlviclf00.R.inc(1201);
            __CLR4_5_2ararlviclf00.R.inc(1202);propertyManager = new OWLObjectPropertyManager(getRootOntology().getOWLOntologyManager(),
                getRootOntology());
            __CLR4_5_2ararlviclf00.R.inc(1203);sub2Super = propertyManager.getPropertyHierarchy();
            __CLR4_5_2ararlviclf00.R.inc(1204);super2Sub = new HashMap<>();
            __CLR4_5_2ararlviclf00.R.inc(1205);for (OWLObjectPropertyExpression sub : sub2Super.keySet()) {{
                __CLR4_5_2ararlviclf00.R.inc(1206);for (OWLObjectPropertyExpression superProp : sub2Super.get(sub)) {{
                    __CLR4_5_2ararlviclf00.R.inc(1207);Set<OWLObjectPropertyExpression> subs = super2Sub.get(superProp);
                    __CLR4_5_2ararlviclf00.R.inc(1208);if ((((subs == null)&&(__CLR4_5_2ararlviclf00.R.iget(1209)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1210)==0&false))) {{
                        __CLR4_5_2ararlviclf00.R.inc(1211);subs = new HashSet<>();
                        __CLR4_5_2ararlviclf00.R.inc(1212);super2Sub.put(superProp, subs);
                    }
                    }__CLR4_5_2ararlviclf00.R.inc(1213);subs.add(sub);
                }
            }}
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLObjectPropertyExpression> getParents(@Nonnull OWLObjectPropertyExpression child) {try{__CLR4_5_2ararlviclf00.R.inc(1214);
            __CLR4_5_2ararlviclf00.R.inc(1215);if ((((child.isBottomEntity())&&(__CLR4_5_2ararlviclf00.R.iget(1216)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1217)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1218);return CollectionFactory.emptySet();
            }
            }__CLR4_5_2ararlviclf00.R.inc(1219);Set<OWLObjectPropertyExpression> propertyExpressions = sub2Super.get(child);
            __CLR4_5_2ararlviclf00.R.inc(1220);if ((((propertyExpressions == null)&&(__CLR4_5_2ararlviclf00.R.iget(1221)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1222)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1223);return CollectionFactory.emptySet();
            } }else {{
                __CLR4_5_2ararlviclf00.R.inc(1224);return new HashSet<>(propertyExpressions);
            }
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLObjectPropertyExpression> getChildren(@Nonnull OWLObjectPropertyExpression parent) {try{__CLR4_5_2ararlviclf00.R.inc(1225);
            __CLR4_5_2ararlviclf00.R.inc(1226);if ((((parent.isTopEntity())&&(__CLR4_5_2ararlviclf00.R.iget(1227)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1228)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1229);return CollectionFactory.emptySet();
            }
            }__CLR4_5_2ararlviclf00.R.inc(1230);Set<OWLObjectPropertyExpression> propertyExpressions = super2Sub.get(parent);
            __CLR4_5_2ararlviclf00.R.inc(1231);if ((((propertyExpressions == null)&&(__CLR4_5_2ararlviclf00.R.iget(1232)!=0|true))||(__CLR4_5_2ararlviclf00.R.iget(1233)==0&false))) {{
                __CLR4_5_2ararlviclf00.R.inc(1234);return CollectionFactory.emptySet();
            } }else {{
                __CLR4_5_2ararlviclf00.R.inc(1235);return new HashSet<>(propertyExpressions);
            }
        }}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }

    private class RawDataPropertyHierarchyProvider implements RawHierarchyProvider<OWLDataProperty> {

        RawDataPropertyHierarchyProvider() {try{__CLR4_5_2ararlviclf00.R.inc(1236);}finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLDataProperty> getParents(@Nonnull OWLDataProperty child) {try{__CLR4_5_2ararlviclf00.R.inc(1237);
            __CLR4_5_2ararlviclf00.R.inc(1238);Set<OWLDataProperty> properties = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1239);Collection<OWLAxiom> axioms = getRootOntology().filterAxioms(Filters.subDataPropertyWithSub, child,
                INCLUDED);
            __CLR4_5_2ararlviclf00.R.inc(1240);Collection<OWLDataPropertyExpression> expressions = sup(axioms, OWLDataPropertyExpression.class);
            __CLR4_5_2ararlviclf00.R.inc(1241);for (OWLDataPropertyExpression prop : expressions) {{
                __CLR4_5_2ararlviclf00.R.inc(1242);properties.add(prop.asOWLDataProperty());
            }
            }__CLR4_5_2ararlviclf00.R.inc(1243);return properties;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}

        @Nonnull
        @Override
        public Collection<OWLDataProperty> getChildren(@Nonnull OWLDataProperty parent) {try{__CLR4_5_2ararlviclf00.R.inc(1244);
            __CLR4_5_2ararlviclf00.R.inc(1245);Set<OWLDataProperty> properties = new HashSet<>();
            __CLR4_5_2ararlviclf00.R.inc(1246);Collection<OWLAxiom> axioms = getRootOntology().filterAxioms(Filters.subDataPropertyWithSuper, parent,
                INCLUDED);
            __CLR4_5_2ararlviclf00.R.inc(1247);for (OWLDataPropertyExpression prop : sub(axioms, OWLDataPropertyExpression.class)) {{
                __CLR4_5_2ararlviclf00.R.inc(1248);properties.add(prop.asOWLDataProperty());
            }
            }__CLR4_5_2ararlviclf00.R.inc(1249);return properties;
        }finally{__CLR4_5_2ararlviclf00.R.flushNeeded();}}
    }
}
