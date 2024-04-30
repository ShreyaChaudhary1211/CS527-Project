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

import static org.semanticweb.owlapi.search.Searcher.inverse;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class OWLObjectPropertyManager {public static class __CLR4_5_298f98flvickrae{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,12250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class SetSizeComparator implements
            Comparator<Set<OWLObjectPropertyExpression>>, Serializable {

        private static final long serialVersionUID = 40000L;

        @Override
        public int compare(Set<OWLObjectPropertyExpression> o1,
                Set<OWLObjectPropertyExpression> o2) {try{__CLR4_5_298f98flvickrae.R.inc(11967);
            __CLR4_5_298f98flvickrae.R.inc(11968);return o1.size() - o2.size();
        }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}
    }

    @Nonnull
    private final OWLOntologyManager man;
    @Nonnull
    private final OWLOntology ontology;
    @Nonnull
    private final Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> hierarchy = new HashMap<>();
    @Nonnull
    private final Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> reflexiveTransitiveClosure = new HashMap<>();
    @Nonnull
    private final Set<OWLObjectPropertyExpression> compositeProperties = new HashSet<>();
    @Nonnull
    private final Set<OWLObjectPropertyExpression> nonSimpleProperties = new HashSet<>();
    @Nonnull
    private final Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> partialOrdering = new HashMap<>();
    private boolean compositeDirty;
    private boolean hierarchyDirty;
    private boolean reflexiveTransitiveClosureDirty;
    private boolean simpleDirty;
    private boolean partialOrderingDirty;

    /**
     * @param manager
     *        the ontology manager to use
     * @param ont
     *        the ontology to use
     */
    public OWLObjectPropertyManager(@Nonnull OWLOntologyManager manager,
            @Nonnull OWLOntology ont) {try{__CLR4_5_298f98flvickrae.R.inc(11969);
        __CLR4_5_298f98flvickrae.R.inc(11970);man = checkNotNull(manager, "manager cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(11971);ontology = checkNotNull(ont, "ontology cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(11972);reset();
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_298f98flvickrae.R.inc(11973);
        __CLR4_5_298f98flvickrae.R.inc(11974);compositeDirty = true;
        __CLR4_5_298f98flvickrae.R.inc(11975);hierarchyDirty = true;
        __CLR4_5_298f98flvickrae.R.inc(11976);reflexiveTransitiveClosureDirty = true;
        __CLR4_5_298f98flvickrae.R.inc(11977);simpleDirty = true;
        __CLR4_5_298f98flvickrae.R.inc(11978);partialOrderingDirty = true;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** clear the object and its resources. */
    public void dispose() {try{__CLR4_5_298f98flvickrae.R.inc(11979);}finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    @Nonnull
    protected Set<OWLOntology> getOntologies() {try{__CLR4_5_298f98flvickrae.R.inc(11980);
        __CLR4_5_298f98flvickrae.R.inc(11981);return man.getImportsClosure(ontology);
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * An object property expression PE is composite in Ax if Ax contains an
     * axiom of the form SubObjectPropertyOf(SubObjectPropertyChain(PE1 ... PEn)
     * PE) with n greater than 1, or
     * SubObjectPropertyOf(SubObjectPropertyChain(PE1 ... PEn) INV(PE)) with n
     * greater than 1, or TransitiveObjectProperty(PE), or
     * TransitiveObjectProperty(INV(PE)).
     * 
     * @param expression
     *        The object property expression to be tested
     * @return {@code true} if the object property is composite (according to
     *         the above definition) or {@code false} if the object property is
     *         not composite.
     */
    public boolean isComposite(@Nonnull OWLObjectPropertyExpression expression) {try{__CLR4_5_298f98flvickrae.R.inc(11982);
        __CLR4_5_298f98flvickrae.R.inc(11983);checkNotNull(expression, "expression cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(11984);return getCompositeProperties().contains(expression.getSimplified());
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** @return the property expressions */
    @Nonnull
    public Set<OWLObjectPropertyExpression> getCompositeProperties() {try{__CLR4_5_298f98flvickrae.R.inc(11985);
        __CLR4_5_298f98flvickrae.R.inc(11986);if ((((compositeDirty)&&(__CLR4_5_298f98flvickrae.R.iget(11987)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(11988)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(11989);compositeProperties.clear();
            __CLR4_5_298f98flvickrae.R.inc(11990);compositeProperties.add(man.getOWLDataFactory()
                    .getOWLTopObjectProperty());
            __CLR4_5_298f98flvickrae.R.inc(11991);compositeProperties.add(man.getOWLDataFactory()
                    .getOWLBottomObjectProperty());
            // We only depend on:
            // 1) Property chain axioms
            // 2) Transitive property axioms
            __CLR4_5_298f98flvickrae.R.inc(11992);for (OWLOntology ont : getOntologies()) {{
                __CLR4_5_298f98flvickrae.R.inc(11993);for (OWLTransitiveObjectPropertyAxiom ax : ont
                        .getAxioms(AxiomType.TRANSITIVE_OBJECT_PROPERTY)) {{
                    __CLR4_5_298f98flvickrae.R.inc(11994);markComposite(ax.getProperty());
                    __CLR4_5_298f98flvickrae.R.inc(11995);for (OWLObjectPropertyExpression namedInv : inverse(
                            ontology.getInverseObjectPropertyAxioms(ax
                                    .getProperty()), ax.getProperty())) {{
                        assert (((namedInv != null)&&(__CLR4_5_298f98flvickrae.R.iget(11996)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(11997)==0&false));
                        __CLR4_5_298f98flvickrae.R.inc(11998);markComposite(namedInv);
                    }
                }}
                }__CLR4_5_298f98flvickrae.R.inc(11999);for (OWLSubPropertyChainOfAxiom ax : ont
                        .getAxioms(AxiomType.SUB_PROPERTY_CHAIN_OF)) {{
                    __CLR4_5_298f98flvickrae.R.inc(12000);markComposite(ax.getSuperProperty());
                    __CLR4_5_298f98flvickrae.R.inc(12001);for (OWLObjectPropertyExpression namedInv : inverse(
                            ontology.getInverseObjectPropertyAxioms(ax
                                    .getSuperProperty()), ax.getSuperProperty())) {{
                        assert (((namedInv != null)&&(__CLR4_5_298f98flvickrae.R.iget(12002)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12003)==0&false));
                        __CLR4_5_298f98flvickrae.R.inc(12004);markComposite(namedInv);
                    }
                }}
            }}
            }__CLR4_5_298f98flvickrae.R.inc(12005);compositeDirty = false;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12006);return compositeProperties;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    private void markComposite(@Nonnull OWLObjectPropertyExpression prop) {try{__CLR4_5_298f98flvickrae.R.inc(12007);
        __CLR4_5_298f98flvickrae.R.inc(12008);checkNotNull(prop, "prop cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12009);compositeProperties.add(prop.getSimplified());
        __CLR4_5_298f98flvickrae.R.inc(12010);compositeProperties.add(prop.getInverseProperty().getSimplified());
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * The object property hierarchy relation -&gt; is the smallest relation on
     * object property expressions for which the following conditions hold (A
     * -&gt; B means that -&gt; holds for A and B): if Ax contains an axiom
     * SubObjectPropertyOf(PE1 PE2), then PE1 -&gt; PE2 holds; and if Ax
     * contains an axiom EquivalentObjectProperties(PE1 PE2), then PE1 -&gt; PE2
     * and PE2 -&gt; PE1 hold; and if Ax contains an axiom
     * InverseObjectProperties(PE1 PE2), then PE1 -&gt; INV(PE2) and INV(PE2)
     * -&gt; PE1 hold; and if Ax contains an axiom SymmetricObjectProperty(PE),
     * then PE -&gt; INV(PE) holds; and if PE1 -&gt; PE2 holds, then INV(PE1)
     * -&gt; INV(PE2) holds as well.
     * 
     * @return A Map that maps sub properties to sets of super properties.
     */
    @Nonnull
    public Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>>
            getPropertyHierarchy() {try{__CLR4_5_298f98flvickrae.R.inc(12011);
        __CLR4_5_298f98flvickrae.R.inc(12012);if ((((hierarchyDirty)&&(__CLR4_5_298f98flvickrae.R.iget(12013)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12014)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12015);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> map = new HashMap<>();
            // Examine: SubObjectPropertyOf
            // EquivalentObjectProperties
            // InverseObjectProperties
            // SymmetricObjectProperty
            __CLR4_5_298f98flvickrae.R.inc(12016);for (OWLOntology ont : getOntologies()) {{
                __CLR4_5_298f98flvickrae.R.inc(12017);for (OWLSubObjectPropertyOfAxiom ax : ont
                        .getAxioms(AxiomType.SUB_OBJECT_PROPERTY)) {{
                    __CLR4_5_298f98flvickrae.R.inc(12018);getKeyValue(ax.getSubProperty().getSimplified(), map).add(
                            ax.getSuperProperty().getSimplified());
                    __CLR4_5_298f98flvickrae.R.inc(12019);getKeyValue(
                            ax.getSubProperty().getInverseProperty()
                                    .getSimplified(), map).add(
                            ax.getSuperProperty().getInverseProperty()
                                    .getSimplified());
                }
                }__CLR4_5_298f98flvickrae.R.inc(12020);for (OWLEquivalentObjectPropertiesAxiom ax : ont
                        .getAxioms(AxiomType.EQUIVALENT_OBJECT_PROPERTIES)) {{
                    // Do pairwise
                    __CLR4_5_298f98flvickrae.R.inc(12021);for (OWLObjectPropertyExpression propA : ax.getProperties()) {{
                        __CLR4_5_298f98flvickrae.R.inc(12022);for (OWLObjectPropertyExpression propB : ax
                                .getProperties()) {{
                            __CLR4_5_298f98flvickrae.R.inc(12023);if ((((!propA.equals(propB))&&(__CLR4_5_298f98flvickrae.R.iget(12024)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12025)==0&false))) {{
                                __CLR4_5_298f98flvickrae.R.inc(12026);getKeyValue(propA.getSimplified(), map).add(
                                        propB.getSimplified());
                                __CLR4_5_298f98flvickrae.R.inc(12027);getKeyValue(propB.getSimplified(), map).add(
                                        propA.getSimplified());
                                __CLR4_5_298f98flvickrae.R.inc(12028);getKeyValue(
                                        propA.getInverseProperty()
                                                .getSimplified(), map).add(
                                        propB.getInverseProperty()
                                                .getSimplified());
                                __CLR4_5_298f98flvickrae.R.inc(12029);getKeyValue(
                                        propB.getInverseProperty()
                                                .getSimplified(), map).add(
                                        propA.getInverseProperty()
                                                .getSimplified());
                            }
                        }}
                    }}
                }}
                }__CLR4_5_298f98flvickrae.R.inc(12030);for (OWLInverseObjectPropertiesAxiom ax : ont
                        .getAxioms(AxiomType.INVERSE_OBJECT_PROPERTIES)) {{
                    __CLR4_5_298f98flvickrae.R.inc(12031);getKeyValue(ax.getFirstProperty().getSimplified(), map)
                            .add(ax.getSecondProperty().getInverseProperty()
                                    .getSimplified());
                    __CLR4_5_298f98flvickrae.R.inc(12032);getKeyValue(
                            ax.getSecondProperty().getInverseProperty()
                                    .getSimplified(), map).add(
                            ax.getFirstProperty().getSimplified());
                    __CLR4_5_298f98flvickrae.R.inc(12033);getKeyValue(
                            ax.getFirstProperty().getInverseProperty()
                                    .getSimplified(), map).add(
                            ax.getSecondProperty().getSimplified());
                    __CLR4_5_298f98flvickrae.R.inc(12034);getKeyValue(ax.getSecondProperty().getSimplified(), map)
                            .add(ax.getFirstProperty().getInverseProperty()
                                    .getSimplified());
                }
                }__CLR4_5_298f98flvickrae.R.inc(12035);for (OWLSymmetricObjectPropertyAxiom ax : ont
                        .getAxioms(AxiomType.SYMMETRIC_OBJECT_PROPERTY)) {{
                    __CLR4_5_298f98flvickrae.R.inc(12036);getKeyValue(ax.getProperty().getSimplified(), map).add(
                            ax.getProperty().getInverseProperty()
                                    .getSimplified());
                    __CLR4_5_298f98flvickrae.R.inc(12037);getKeyValue(
                            ax.getProperty().getInverseProperty()
                                    .getSimplified(), map).add(
                            ax.getProperty().getSimplified());
                }
            }}
            }__CLR4_5_298f98flvickrae.R.inc(12038);hierarchy.clear();
            __CLR4_5_298f98flvickrae.R.inc(12039);hierarchy.putAll(map);
            __CLR4_5_298f98flvickrae.R.inc(12040);hierarchyDirty = false;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12041);return hierarchy;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** @return transitive reflexive closure */
    @Nonnull
    public Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>>
            getHierarchyReflexiveTransitiveClosure() {try{__CLR4_5_298f98flvickrae.R.inc(12042);
        __CLR4_5_298f98flvickrae.R.inc(12043);if ((((reflexiveTransitiveClosureDirty)&&(__CLR4_5_298f98flvickrae.R.iget(12044)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12045)==0&false))) {{
            // Produce a map of the transitive reflexive closure of this
            __CLR4_5_298f98flvickrae.R.inc(12046);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> rtcMap = new HashMap<>();
            __CLR4_5_298f98flvickrae.R.inc(12047);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> propertyHierarchy = getPropertyHierarchy();
            __CLR4_5_298f98flvickrae.R.inc(12048);for (OWLObjectPropertyExpression prop : getReferencedProperties()) {{
                assert (((prop != null)&&(__CLR4_5_298f98flvickrae.R.iget(12049)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12050)==0&false));
                __CLR4_5_298f98flvickrae.R.inc(12051);Set<OWLObjectPropertyExpression> processed = new HashSet<>();
                __CLR4_5_298f98flvickrae.R.inc(12052);Set<OWLObjectPropertyExpression> rtc = new HashSet<>();
                __CLR4_5_298f98flvickrae.R.inc(12053);getReflexiveTransitiveClosure(prop, propertyHierarchy, rtc,
                        processed);
                __CLR4_5_298f98flvickrae.R.inc(12054);rtcMap.put(prop, rtc);
            }
            }__CLR4_5_298f98flvickrae.R.inc(12055);reflexiveTransitiveClosure.clear();
            __CLR4_5_298f98flvickrae.R.inc(12056);reflexiveTransitiveClosure.putAll(rtcMap);
            __CLR4_5_298f98flvickrae.R.inc(12057);reflexiveTransitiveClosureDirty = false;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12058);return reflexiveTransitiveClosure;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * Tests to see if one property is a sub property of another property in the
     * reflexive transitive closure of the property hierarchy.
     * 
     * @param sub
     *        The sub property
     * @param sup
     *        The super property
     * @return {@code true} if sub is the sub-property of sup, otherwise
     *         {@code false}
     */
    public boolean isSubPropertyOf(@Nonnull OWLObjectPropertyExpression sub,
            @Nonnull OWLObjectPropertyExpression sup) {try{__CLR4_5_298f98flvickrae.R.inc(12059);
        __CLR4_5_298f98flvickrae.R.inc(12060);checkNotNull(sub, "sub cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12061);checkNotNull(sup, "sup cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12062);Set<OWLObjectPropertyExpression> supers = getHierarchyReflexiveTransitiveClosure()
                .get(sub);
        __CLR4_5_298f98flvickrae.R.inc(12063);if ((((supers == null)&&(__CLR4_5_298f98flvickrae.R.iget(12064)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12065)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12066);return false;
        } }else {{
            __CLR4_5_298f98flvickrae.R.inc(12067);return supers.contains(sup);
        }
    }}finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * The relation -&gt;* is the reflexive-transitive closure of -&gt;. An
     * object property expression PE is simple in Ax if, for each object
     * property expression PE' such that PE' -&gt;* PE holds, PE' is not
     * composite.
     * 
     * @param expression
     *        The expression to be tested.
     * @return {@code true} if the object property expression is simple,
     *         otherwise false.
     */
    public boolean isNonSimple(@Nonnull OWLObjectPropertyExpression expression) {try{__CLR4_5_298f98flvickrae.R.inc(12068);
        __CLR4_5_298f98flvickrae.R.inc(12069);checkNotNull(expression, "expression cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12070);return getNonSimpleProperties().contains(expression.getSimplified());
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** @return non simple properties */
    @Nonnull
    public Set<OWLObjectPropertyExpression> getNonSimpleProperties() {try{__CLR4_5_298f98flvickrae.R.inc(12071);
        __CLR4_5_298f98flvickrae.R.inc(12072);if ((((simpleDirty)&&(__CLR4_5_298f98flvickrae.R.iget(12073)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12074)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12075);nonSimpleProperties.clear();
            __CLR4_5_298f98flvickrae.R.inc(12076);Set<OWLObjectPropertyExpression> props = getReferencedProperties();
            __CLR4_5_298f98flvickrae.R.inc(12077);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> reflexiveTransitiveClosureMap = getHierarchyReflexiveTransitiveClosure();
            __CLR4_5_298f98flvickrae.R.inc(12078);for (OWLObjectPropertyExpression prop : getReferencedProperties()) {{
                assert (((prop != null)&&(__CLR4_5_298f98flvickrae.R.iget(12079)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12080)==0&false));
                __CLR4_5_298f98flvickrae.R.inc(12081);if ((((isComposite(prop))&&(__CLR4_5_298f98flvickrae.R.iget(12082)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12083)==0&false))) {{
                    // Supers are not simple
                    __CLR4_5_298f98flvickrae.R.inc(12084);Set<OWLObjectPropertyExpression> rtc = reflexiveTransitiveClosureMap
                            .get(prop);
                    __CLR4_5_298f98flvickrae.R.inc(12085);props.removeAll(rtc);
                    __CLR4_5_298f98flvickrae.R.inc(12086);nonSimpleProperties.add(prop);
                    __CLR4_5_298f98flvickrae.R.inc(12087);nonSimpleProperties.addAll(rtc);
                }
            }}
            }__CLR4_5_298f98flvickrae.R.inc(12088);for (OWLObjectPropertyExpression prop : new ArrayList<>(
                    nonSimpleProperties)) {{
                __CLR4_5_298f98flvickrae.R.inc(12089);nonSimpleProperties.add(prop.getInverseProperty()
                        .getSimplified());
            }
            }__CLR4_5_298f98flvickrae.R.inc(12090);simpleDirty = false;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12091);return nonSimpleProperties;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** @return partial ordering */
    @Nonnull
    public Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>>
            getPropertyPartialOrdering() {try{__CLR4_5_298f98flvickrae.R.inc(12092);
        __CLR4_5_298f98flvickrae.R.inc(12093);if ((((partialOrderingDirty)&&(__CLR4_5_298f98flvickrae.R.iget(12094)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12095)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12096);partialOrdering.clear();
            __CLR4_5_298f98flvickrae.R.inc(12097);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> map = new HashMap<>(
                    getPropertyHierarchy());
            __CLR4_5_298f98flvickrae.R.inc(12098);for (OWLOntology ont : getOntologies()) {{
                __CLR4_5_298f98flvickrae.R.inc(12099);for (OWLSubPropertyChainOfAxiom ax : ont
                        .getAxioms(AxiomType.SUB_PROPERTY_CHAIN_OF)) {{
                    __CLR4_5_298f98flvickrae.R.inc(12100);for (OWLObjectPropertyExpression prop : ax
                            .getPropertyChain()) {{
                        __CLR4_5_298f98flvickrae.R.inc(12101);Set<OWLObjectPropertyExpression> sups = map.get(prop
                                .getSimplified());
                        __CLR4_5_298f98flvickrae.R.inc(12102);if ((((sups == null)&&(__CLR4_5_298f98flvickrae.R.iget(12103)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12104)==0&false))) {{
                            __CLR4_5_298f98flvickrae.R.inc(12105);sups = new HashSet<>();
                            __CLR4_5_298f98flvickrae.R.inc(12106);map.put(prop, sups);
                        }
                        }__CLR4_5_298f98flvickrae.R.inc(12107);sups.add(ax.getSuperProperty().getSimplified());
                        __CLR4_5_298f98flvickrae.R.inc(12108);Set<OWLObjectPropertyExpression> supsInv = map.get(prop
                                .getInverseProperty().getSimplified());
                        __CLR4_5_298f98flvickrae.R.inc(12109);if ((((supsInv == null)&&(__CLR4_5_298f98flvickrae.R.iget(12110)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12111)==0&false))) {{
                            __CLR4_5_298f98flvickrae.R.inc(12112);supsInv = new HashSet<>();
                            __CLR4_5_298f98flvickrae.R.inc(12113);map.put(prop.getInverseProperty().getSimplified(),
                                    supsInv);
                        }
                        }__CLR4_5_298f98flvickrae.R.inc(12114);supsInv.add(ax.getSuperProperty().getInverseProperty()
                                .getSimplified());
                    }
                }}
            }}
            }__CLR4_5_298f98flvickrae.R.inc(12115);Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> ordering = new HashMap<>();
            __CLR4_5_298f98flvickrae.R.inc(12116);for (OWLObjectPropertyExpression prop : getReferencedProperties()) {{
                assert (((prop != null)&&(__CLR4_5_298f98flvickrae.R.iget(12117)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12118)==0&false));
                __CLR4_5_298f98flvickrae.R.inc(12119);Set<OWLObjectPropertyExpression> processed = new HashSet<>();
                __CLR4_5_298f98flvickrae.R.inc(12120);Set<OWLObjectPropertyExpression> rtc = new HashSet<>();
                __CLR4_5_298f98flvickrae.R.inc(12121);getReflexiveTransitiveClosure(prop, map, rtc, processed);
                __CLR4_5_298f98flvickrae.R.inc(12122);ordering.put(prop, rtc);
            }
            }__CLR4_5_298f98flvickrae.R.inc(12123);partialOrdering.putAll(ordering);
            __CLR4_5_298f98flvickrae.R.inc(12124);partialOrderingDirty = false;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12125);return partialOrdering;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * @param propA
     *        first property
     * @param propB
     *        second property
     * @return true if first property comes first in the default ordering
     */
    public boolean isLessThan(@Nonnull OWLObjectPropertyExpression propA,
            @Nonnull OWLObjectPropertyExpression propB) {try{__CLR4_5_298f98flvickrae.R.inc(12126);
        __CLR4_5_298f98flvickrae.R.inc(12127);checkNotNull(propA, "propA cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12128);checkNotNull(propB, "propB cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12129);Set<OWLObjectPropertyExpression> props = getPropertyPartialOrdering()
                .get(propA.getSimplified());
        __CLR4_5_298f98flvickrae.R.inc(12130);if ((((props == null)&&(__CLR4_5_298f98flvickrae.R.iget(12131)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12132)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12133);return false;
        } }else {{
            __CLR4_5_298f98flvickrae.R.inc(12134);return props.contains(propB.getSimplified());
        }
    }}finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    @Nonnull
    private Set<OWLObjectPropertyExpression> getReferencedProperties() {try{__CLR4_5_298f98flvickrae.R.inc(12135);
        __CLR4_5_298f98flvickrae.R.inc(12136);Set<OWLObjectPropertyExpression> props = new HashSet<>();
        __CLR4_5_298f98flvickrae.R.inc(12137);for (OWLOntology ont : getOntologies()) {{
            __CLR4_5_298f98flvickrae.R.inc(12138);for (OWLObjectPropertyExpression prop : ont
                    .getObjectPropertiesInSignature()) {{
                __CLR4_5_298f98flvickrae.R.inc(12139);props.add(prop.getSimplified());
            }
        }}
        }__CLR4_5_298f98flvickrae.R.inc(12140);return props;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * @param ontologies
     *        ontologies to search
     * @return sets of equivalent properties
     */
    @Nonnull
    public static Collection<Set<OWLObjectPropertyExpression>>
            getEquivalentObjectProperties(@Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_298f98flvickrae.R.inc(12141);
        __CLR4_5_298f98flvickrae.R.inc(12142);checkNotNull(ontologies, "ontologies cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12143);Set<Set<OWLObjectPropertyExpression>> result = new HashSet<>();
        __CLR4_5_298f98flvickrae.R.inc(12144);Set<OWLObjectPropertyExpression> processed = new HashSet<>();
        __CLR4_5_298f98flvickrae.R.inc(12145);Set<OWLObjectPropertyExpression> properties = new HashSet<>();
        __CLR4_5_298f98flvickrae.R.inc(12146);for (OWLOntology ont : ontologies) {{
            __CLR4_5_298f98flvickrae.R.inc(12147);properties.addAll(ont.getObjectPropertiesInSignature());
        }
        }__CLR4_5_298f98flvickrae.R.inc(12148);for (OWLObjectPropertyExpression prop : properties) {{
            assert (((prop != null)&&(__CLR4_5_298f98flvickrae.R.iget(12149)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12150)==0&false));
            __CLR4_5_298f98flvickrae.R.inc(12151);if ((((processed.contains(prop))&&(__CLR4_5_298f98flvickrae.R.iget(12152)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12153)==0&false))) {{
                __CLR4_5_298f98flvickrae.R.inc(12154);continue;
            }
            }__CLR4_5_298f98flvickrae.R.inc(12155);tarjan(ontologies, prop, 0,
                    new Stack<OWLObjectPropertyExpression>(),
                    new HashMap<OWLObjectPropertyExpression, Integer>(),
                    new HashMap<OWLObjectPropertyExpression, Integer>(),
                    result, processed,
                    new HashSet<OWLObjectPropertyExpression>());
        }
        // Get maximal
        }__CLR4_5_298f98flvickrae.R.inc(12156);List<Set<OWLObjectPropertyExpression>> equivs = new ArrayList<>(result);
        __CLR4_5_298f98flvickrae.R.inc(12157);Collections.sort(equivs, new SetSizeComparator());
        __CLR4_5_298f98flvickrae.R.inc(12158);for (int i = 0; (((i < equivs.size())&&(__CLR4_5_298f98flvickrae.R.iget(12159)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12160)==0&false)); i++) {{
            __CLR4_5_298f98flvickrae.R.inc(12161);Set<OWLObjectPropertyExpression> first = equivs.get(i);
            __CLR4_5_298f98flvickrae.R.inc(12162);for (int j = i; (((j < equivs.size())&&(__CLR4_5_298f98flvickrae.R.iget(12163)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12164)==0&false)); j++) {{
                __CLR4_5_298f98flvickrae.R.inc(12165);Set<OWLObjectPropertyExpression> second = equivs.get(j);
                __CLR4_5_298f98flvickrae.R.inc(12166);if ((((second.size() > first.size() && second.containsAll(first))&&(__CLR4_5_298f98flvickrae.R.iget(12167)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12168)==0&false))) {{
                    __CLR4_5_298f98flvickrae.R.inc(12169);equivs.remove(i);
                    __CLR4_5_298f98flvickrae.R.inc(12170);break;
                }
            }}
        }}
        }__CLR4_5_298f98flvickrae.R.inc(12171);return equivs;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /** @return sets of equivalent properties */
    @Nonnull
    public Collection<Set<OWLObjectPropertyExpression>>
            getEquivalentObjectProperties() {try{__CLR4_5_298f98flvickrae.R.inc(12172);
        __CLR4_5_298f98flvickrae.R.inc(12173);return getEquivalentObjectProperties(getOntologies());
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    /**
     * @param ontologies
     *        The ontologies
     * @param prop
     *        the property
     * @param index
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
     * @param stackProps
     *        stack entities
     */
    public static void tarjan(@Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLObjectPropertyExpression prop, int index,
            @Nonnull Stack<OWLObjectPropertyExpression> stack,
            @Nonnull Map<OWLObjectPropertyExpression, Integer> indexMap,
            @Nonnull Map<OWLObjectPropertyExpression, Integer> lowlinkMap,
            @Nonnull Set<Set<OWLObjectPropertyExpression>> result,
            @Nonnull Set<OWLObjectPropertyExpression> processed,
            @Nonnull Set<OWLObjectPropertyExpression> stackProps) {try{__CLR4_5_298f98flvickrae.R.inc(12174);
        __CLR4_5_298f98flvickrae.R.inc(12175);checkNotNull(ontologies, "ontologies cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12176);checkNotNull(prop, "prop cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12177);checkNotNull(stack, "stack cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12178);checkNotNull(indexMap, "indexMap cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12179);checkNotNull(lowlinkMap, "lowlinkMap cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12180);checkNotNull(result, "result cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12181);checkNotNull(processed, "processed cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12182);checkNotNull(stackProps, "stackProps cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12183);processed.add(prop);
        __CLR4_5_298f98flvickrae.R.inc(12184);indexMap.put(prop, index);
        __CLR4_5_298f98flvickrae.R.inc(12185);lowlinkMap.put(prop, index);
        __CLR4_5_298f98flvickrae.R.inc(12186);stack.push(prop);
        __CLR4_5_298f98flvickrae.R.inc(12187);stackProps.add(prop);
        __CLR4_5_298f98flvickrae.R.inc(12188);for (OWLOntology ont : ontologies) {{
            __CLR4_5_298f98flvickrae.R.inc(12189);for (OWLSubObjectPropertyOfAxiom ax : ont
                    .getObjectSubPropertyAxiomsForSubProperty(prop)) {{
                __CLR4_5_298f98flvickrae.R.inc(12190);if ((((ax.getSubProperty().equals(prop))&&(__CLR4_5_298f98flvickrae.R.iget(12191)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12192)==0&false))) {{
                    __CLR4_5_298f98flvickrae.R.inc(12193);OWLObjectPropertyExpression supProp = ax.getSuperProperty();
                    __CLR4_5_298f98flvickrae.R.inc(12194);if ((((!indexMap.containsKey(supProp))&&(__CLR4_5_298f98flvickrae.R.iget(12195)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12196)==0&false))) {{
                        __CLR4_5_298f98flvickrae.R.inc(12197);tarjan(ontologies, supProp, index + 1, stack, indexMap,
                                lowlinkMap, result, processed, stackProps);
                        __CLR4_5_298f98flvickrae.R.inc(12198);lowlinkMap.put(
                                prop,
                                Math.min(lowlinkMap.get(prop),
                                        lowlinkMap.get(supProp)));
                    } }else {__CLR4_5_298f98flvickrae.R.inc(12199);if ((((stackProps.contains(supProp))&&(__CLR4_5_298f98flvickrae.R.iget(12200)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12201)==0&false))) {{
                        __CLR4_5_298f98flvickrae.R.inc(12202);lowlinkMap.put(
                                prop,
                                Math.min(lowlinkMap.get(prop),
                                        indexMap.get(supProp)));
                    }
                }}}
            }}
        }}
        }__CLR4_5_298f98flvickrae.R.inc(12203);if ((((lowlinkMap.get(prop).equals(indexMap.get(prop)))&&(__CLR4_5_298f98flvickrae.R.iget(12204)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12205)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12206);Set<OWLObjectPropertyExpression> scc = new HashSet<>();
            __CLR4_5_298f98flvickrae.R.inc(12207);OWLObjectPropertyExpression propPrime;
            __CLR4_5_298f98flvickrae.R.inc(12208);while (true) {{
                __CLR4_5_298f98flvickrae.R.inc(12209);propPrime = stack.pop();
                __CLR4_5_298f98flvickrae.R.inc(12210);stackProps.remove(propPrime);
                __CLR4_5_298f98flvickrae.R.inc(12211);scc.add(propPrime);
                __CLR4_5_298f98flvickrae.R.inc(12212);if ((((propPrime.equals(prop))&&(__CLR4_5_298f98flvickrae.R.iget(12213)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12214)==0&false))) {{
                    __CLR4_5_298f98flvickrae.R.inc(12215);break;
                }
            }}
            }__CLR4_5_298f98flvickrae.R.inc(12216);if ((((scc.size() > 1)&&(__CLR4_5_298f98flvickrae.R.iget(12217)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12218)==0&false))) {{
                __CLR4_5_298f98flvickrae.R.inc(12219);result.add(scc);
            }
        }}
    }}finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    // Util methods
    private static
            void
            getReflexiveTransitiveClosure(
                    @Nonnull OWLObjectPropertyExpression prop,
                    @Nonnull Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> map,
                    @Nonnull Set<OWLObjectPropertyExpression> rtc,
                    @Nonnull Set<OWLObjectPropertyExpression> processed) {try{__CLR4_5_298f98flvickrae.R.inc(12220);
        __CLR4_5_298f98flvickrae.R.inc(12221);checkNotNull(prop, "prop cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12222);checkNotNull(map, "map cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12223);checkNotNull(rtc, "rtc cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12224);checkNotNull(processed, "processed cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12225);if ((((processed.contains(prop))&&(__CLR4_5_298f98flvickrae.R.iget(12226)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12227)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12228);return;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12229);rtc.add(prop);
        __CLR4_5_298f98flvickrae.R.inc(12230);processed.add(prop);
        __CLR4_5_298f98flvickrae.R.inc(12231);Set<OWLObjectPropertyExpression> supers = map.get(prop);
        __CLR4_5_298f98flvickrae.R.inc(12232);if ((((supers == null)&&(__CLR4_5_298f98flvickrae.R.iget(12233)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12234)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12235);return;
        }
        }__CLR4_5_298f98flvickrae.R.inc(12236);for (OWLObjectPropertyExpression sup : supers) {{
            assert (((sup != null)&&(__CLR4_5_298f98flvickrae.R.iget(12237)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12238)==0&false));
            __CLR4_5_298f98flvickrae.R.inc(12239);getReflexiveTransitiveClosure(sup, map, rtc, processed);
        }
    }}finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}

    @Nonnull
    private static
            Set<OWLObjectPropertyExpression>
            getKeyValue(
                    @Nonnull OWLObjectPropertyExpression key,
                    @Nonnull Map<OWLObjectPropertyExpression, Set<OWLObjectPropertyExpression>> map) {try{__CLR4_5_298f98flvickrae.R.inc(12240);
        __CLR4_5_298f98flvickrae.R.inc(12241);checkNotNull(key, "key cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12242);checkNotNull(map, "map cannot be null");
        __CLR4_5_298f98flvickrae.R.inc(12243);Set<OWLObjectPropertyExpression> vals = map.get(key);
        __CLR4_5_298f98flvickrae.R.inc(12244);if ((((vals == null)&&(__CLR4_5_298f98flvickrae.R.iget(12245)!=0|true))||(__CLR4_5_298f98flvickrae.R.iget(12246)==0&false))) {{
            __CLR4_5_298f98flvickrae.R.inc(12247);vals = new HashSet<>(4);
            __CLR4_5_298f98flvickrae.R.inc(12248);map.put(key, vals);
        }
        }__CLR4_5_298f98flvickrae.R.inc(12249);return vals;
    }finally{__CLR4_5_298f98flvickrae.R.flushNeeded();}}
}
