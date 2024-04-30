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
package com.clarkparsia.owlapi.explanation.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeListener;

/** Tracker for definitions. */
public class DefinitionTracker implements OWLOntologyChangeListener {public static class __CLR4_5_2hhhhlviclyr2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,689,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Mapping from entities to the number of axioms. */
    private final Map<OWLEntity, Integer> referenceCounts = new HashMap<>();
    private final OWLOntology ontology;
    private final Set<OWLAxiom> axioms = new HashSet<>();
    private final static Integer ONE = Integer.valueOf(1);

    /**
     * Instantiates a new definition tracker.
     * 
     * @param ontology
     *        ontology to track
     */
    public DefinitionTracker(@Nonnull OWLOntology ontology) {try{__CLR4_5_2hhhhlviclyr2.R.inc(629);
        __CLR4_5_2hhhhlviclyr2.R.inc(630);this.ontology = checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2hhhhlviclyr2.R.inc(631);for (OWLOntology importOnt : ontology.getImportsClosure()) {{
            __CLR4_5_2hhhhlviclyr2.R.inc(632);for (OWLAxiom axiom : importOnt.getAxioms()) {{
                assert (((axiom != null)&&(__CLR4_5_2hhhhlviclyr2.R.iget(633)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(634)==0&false));
                __CLR4_5_2hhhhlviclyr2.R.inc(635);addAxiom(axiom);
            }
        }}
        }__CLR4_5_2hhhhlviclyr2.R.inc(636);ontology.getOWLOntologyManager().addOntologyChangeListener(this);
    }finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}

    private void addAxiom(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2hhhhlviclyr2.R.inc(637);
        __CLR4_5_2hhhhlviclyr2.R.inc(638);if ((((axioms.add(axiom))&&(__CLR4_5_2hhhhlviclyr2.R.iget(639)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(640)==0&false))) {{
            __CLR4_5_2hhhhlviclyr2.R.inc(641);for (OWLEntity entity : axiom.getSignature()) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(642);Integer count = referenceCounts.get(entity);
                __CLR4_5_2hhhhlviclyr2.R.inc(643);if ((((count == null)&&(__CLR4_5_2hhhhlviclyr2.R.iget(644)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(645)==0&false))) {{
                    __CLR4_5_2hhhhlviclyr2.R.inc(646);count = ONE;
                } }else {{
                    __CLR4_5_2hhhhlviclyr2.R.inc(647);count += 1;
                }
                }__CLR4_5_2hhhhlviclyr2.R.inc(648);referenceCounts.put(entity, count);
            }
        }}
    }}finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}

    private void removeAxiom(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2hhhhlviclyr2.R.inc(649);
        __CLR4_5_2hhhhlviclyr2.R.inc(650);if ((((axioms.remove(axiom))&&(__CLR4_5_2hhhhlviclyr2.R.iget(651)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(652)==0&false))) {{
            __CLR4_5_2hhhhlviclyr2.R.inc(653);for (OWLEntity entity : axiom.getSignature()) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(654);Integer count = referenceCounts.get(entity);
                __CLR4_5_2hhhhlviclyr2.R.inc(655);if ((((count == 1)&&(__CLR4_5_2hhhhlviclyr2.R.iget(656)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(657)==0&false))) {{
                    __CLR4_5_2hhhhlviclyr2.R.inc(658);referenceCounts.remove(entity);
                } }else {{
                    __CLR4_5_2hhhhlviclyr2.R.inc(659);referenceCounts.put(entity, count - 1);
                }
            }}
        }}
    }}finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}

    /**
     * Checks if this entity is referred by a logical axiom in the imports
     * closure of the designated ontology.
     * 
     * @param entity
     *        entity we are searching for
     * @return {@code true} if there is at least one logical axiom in the
     *         imports closure of the given ontology that refers the given
     *         entity
     */
    public boolean isDefined(@Nonnull OWLEntity entity) {try{__CLR4_5_2hhhhlviclyr2.R.inc(660);
        __CLR4_5_2hhhhlviclyr2.R.inc(661);return checkNotNull(entity, "entity cannot be null").isBuiltIn()
                || referenceCounts.containsKey(entity);
    }finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}

    /**
     * Checks if all the entities referred in the given concept are also
     * referred by a logical axiom in the imports closure of the designated
     * ontology.
     * 
     * @param classExpression
     *        description that contains the entities we are searching for
     * @return {@code true} if all the entities in the given description are
     *         referred by at least one logical axiom in the imports closure of
     *         the given ontology
     */
    public boolean isDefined(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2hhhhlviclyr2.R.inc(662);
        __CLR4_5_2hhhhlviclyr2.R.inc(663);for (OWLEntity entity : checkNotNull(classExpression,
                "classExpression cannot be null").getSignature()) {{
            assert (((entity != null)&&(__CLR4_5_2hhhhlviclyr2.R.iget(664)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(665)==0&false));
            __CLR4_5_2hhhhlviclyr2.R.inc(666);if ((((!isDefined(entity))&&(__CLR4_5_2hhhhlviclyr2.R.iget(667)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(668)==0&false))) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(669);return false;
            }
        }}
        }__CLR4_5_2hhhhlviclyr2.R.inc(670);return true;
    }finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}

    @Override
    public void ontologiesChanged(List<? extends OWLOntologyChange> changes) {try{__CLR4_5_2hhhhlviclyr2.R.inc(671);
        __CLR4_5_2hhhhlviclyr2.R.inc(672);for (OWLOntologyChange change : changes) {{
            __CLR4_5_2hhhhlviclyr2.R.inc(673);if ((((!change.isAxiomChange()
                    || !ontology.getImportsClosure().contains(
                            change.getOntology()))&&(__CLR4_5_2hhhhlviclyr2.R.iget(674)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(675)==0&false))) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(676);continue;
            }
            }__CLR4_5_2hhhhlviclyr2.R.inc(677);OWLAxiom axiom = change.getAxiom();
            assert (((axiom != null)&&(__CLR4_5_2hhhhlviclyr2.R.iget(678)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(679)==0&false));
            __CLR4_5_2hhhhlviclyr2.R.inc(680);if ((((change.isAddAxiom())&&(__CLR4_5_2hhhhlviclyr2.R.iget(681)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(682)==0&false))) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(683);addAxiom(axiom);
            } }else {__CLR4_5_2hhhhlviclyr2.R.inc(684);if ((((change.isRemoveAxiom())&&(__CLR4_5_2hhhhlviclyr2.R.iget(685)!=0|true))||(__CLR4_5_2hhhhlviclyr2.R.iget(686)==0&false))) {{
                __CLR4_5_2hhhhlviclyr2.R.inc(687);removeAxiom(axiom);
            } }else {{
                __CLR4_5_2hhhhlviclyr2.R.inc(688);throw new UnsupportedOperationException(
                        "Unrecognized axiom change: " + change);
            }
        }}}
    }}finally{__CLR4_5_2hhhhlviclyr2.R.flushNeeded();}}
}
