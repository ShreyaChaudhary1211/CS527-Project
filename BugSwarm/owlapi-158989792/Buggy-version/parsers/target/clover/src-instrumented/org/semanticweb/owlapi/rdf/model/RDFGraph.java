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
package org.semanticweb.owlapi.rdf.model;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.RDFNode;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFResourceIRI;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.NodeID;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import com.google.common.collect.Sets;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class RDFGraph implements Serializable {public static class __CLR4_5_2o0zo0zlvicmcfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,31216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Set<IRI> skippedPredicates = Sets.newHashSet(OWLRDFVocabulary.OWL_ANNOTATED_TARGET.getIRI());
    private static final long serialVersionUID = 40000L;
    @Nonnull private final Map<RDFResource, Set<RDFTriple>> triplesBySubject = new HashMap<>();
    @Nonnull private final Set<RDFResourceBlankNode> rootAnonymousNodes = new HashSet<>();
    @Nonnull private final Set<RDFTriple> triples = new HashSet<>();
    @Nonnull private final Map<RDFNode, RDFNode> remappedNodes = new HashMap<>();

    /**
     * Determines if this graph is empty (i.e. whether or not it contains any
     * triples).
     * 
     * @return {@code true} if the graph contains triples, otherwise
     *         {@code false}
     * @since 3.5
     */
    public boolean isEmpty() {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31139);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31140);return triples.isEmpty();
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @param triple
     *        triple to add
     */
    public void addTriple(@Nonnull RDFTriple triple) {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31141);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31142);checkNotNull(triple, "triple cannot be null");
        // Reset the computation of root anon nodes
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31143);rootAnonymousNodes.clear();
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31144);triples.add(triple);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31145);Set<RDFTriple> tripleSet = triplesBySubject.get(triple.getSubject());
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31146);if ((((tripleSet == null)&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31147)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31148)==0&false))) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31149);tripleSet = new LinkedHashSet<>();
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31150);triplesBySubject.put(triple.getSubject(), tripleSet);
        }
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31151);tripleSet.add(triple);
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @param subject
     *        subject
     * @return sorted triples
     */
    public Collection<RDFTriple> getTriplesForSubject(RDFNode subject) {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31152);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31153);Set<RDFTriple> set = triplesBySubject.get(subject);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31154);if ((((set == null)&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31155)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31156)==0&false))) {{
            // check if the node is remapped
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31157);RDFNode rdfNode = remappedNodes.get(subject);
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31158);if ((((rdfNode == null)&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31159)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31160)==0&false))) {{
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31161);return Collections.emptyList();
            }
            // else return the triples for the remapped node
            }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31162);return getTriplesForSubject(rdfNode);
        }
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31163);return set;
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @return for each triple with a blank node object that is shared with
     *         other triples, compute a remapping of the node.
     */
    public Map<RDFTriple, RDFResourceBlankNode> computeRemappingForSharedNodes() {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31164);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31165);Map<RDFTriple, RDFResourceBlankNode> toReturn = new HashMap<>();
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31166);Map<RDFNode, List<RDFTriple>> sharers = new HashMap<>();
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31167);for (RDFTriple t : triples) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31168);if ((((t.getObject().isAnonymous() && !t.getObject().isIndividual() && notInSkippedPredicates(t
                .getPredicate()))&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31169)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31170)==0&false))) {{
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31171);List<RDFTriple> list = sharers.get(t.getObject());
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31172);if ((((list == null)&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31173)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31174)==0&false))) {{
                    __CLR4_5_2o0zo0zlvicmcfi.R.inc(31175);list = new ArrayList<>(2);
                    __CLR4_5_2o0zo0zlvicmcfi.R.inc(31176);sharers.put(t.getObject(), list);
                }
                }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31177);list.add(t);
            }
        }}
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31178);for (Map.Entry<RDFNode, List<RDFTriple>> e : sharers.entrySet()) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31179);if ((((e.getValue().size() > 1)&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31180)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31181)==0&false))) {{
                // found reused blank nodes
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31182);for (RDFTriple t : e.getValue()) {{
                    __CLR4_5_2o0zo0zlvicmcfi.R.inc(31183);RDFResourceBlankNode bnode = new RDFResourceBlankNode(IRI.create(NodeID.nextAnonymousIRI()), e
                        .getKey().isIndividual(), e.getKey().shouldOutputId());
                    __CLR4_5_2o0zo0zlvicmcfi.R.inc(31184);remappedNodes.put(bnode, e.getKey());
                    __CLR4_5_2o0zo0zlvicmcfi.R.inc(31185);toReturn.put(t, bnode);
                }
            }}
        }}
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31186);return toReturn;
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @param predicate
     *        predicate to check for inclusion
     * @return true if the predicate IRI is not in the set of predicates that
     *         should be skipped from blank node reuse analysis.
     */
    private static boolean notInSkippedPredicates(RDFResourceIRI predicate) {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31187);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31188);return !skippedPredicates.contains(predicate.getIRI());
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @return root anonymous nodes
     */
    @Nonnull
    public Set<RDFResourceBlankNode> getRootAnonymousNodes() {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31189);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31190);if ((((rootAnonymousNodes.isEmpty())&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31191)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31192)==0&false))) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31193);rebuildAnonRoots();
        }
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31194);return rootAnonymousNodes;
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    private void rebuildAnonRoots() {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31195);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31196);rootAnonymousNodes.clear();
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31197);for (RDFTriple triple : triples) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31198);if ((((triple.getSubject().isAnonymous())&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31199)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31200)==0&false))) {{
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31201);rootAnonymousNodes.add((RDFResourceBlankNode) triple.getSubject());
            }
        }}
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31202);for (RDFTriple triple : triples) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31203);if ((((triple.getObject().isAnonymous() && !triple.isSubjectSameAsObject())&&(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31204)!=0|true))||(__CLR4_5_2o0zo0zlvicmcfi.R.iget(31205)==0&false))) {{
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31206);rootAnonymousNodes.remove(triple.getObject());
            }
        }}
    }}finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @param w
     *        writer to write to
     * @throws IOException
     *         if exceptions happen
     */
    public void dumpTriples(@Nonnull Writer w) throws IOException {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31207);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31208);checkNotNull(w, "w cannot be null");
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31209);for (Set<RDFTriple> set : triplesBySubject.values()) {{
            __CLR4_5_2o0zo0zlvicmcfi.R.inc(31210);for (RDFTriple triple : set) {{
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31211);w.write(triple.toString());
                __CLR4_5_2o0zo0zlvicmcfi.R.inc(31212);w.write("\n");
            }
        }}
        }__CLR4_5_2o0zo0zlvicmcfi.R.inc(31213);w.flush();
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}

    /**
     * @return all triples in an unmodifiable set
     */
    public Set<RDFTriple> getAllTriples() {try{__CLR4_5_2o0zo0zlvicmcfi.R.inc(31214);
        __CLR4_5_2o0zo0zlvicmcfi.R.inc(31215);return Collections.unmodifiableSet(triples);
    }finally{__CLR4_5_2o0zo0zlvicmcfi.R.flushNeeded();}}
}
