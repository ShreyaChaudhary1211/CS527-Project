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
package org.semanticweb.owlapi.debugging;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.RemoveAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * An abstract debugger which provides common infrastructure for finding
 * multiple justification. This functionality relies on a concrete
 * implementation of a debugger that can compute a minimal set of axioms that
 * cause the unsatisfiability.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class AbstractOWLDebugger implements OWLDebugger {public static class __CLR4_5_21be1belviclz68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,1764,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected final OWLOntologyManager owlOntologyManager;
    @Nonnull
    private OWLOntology ontology;

    /**
     * Instantiates a new abstract owl debugger.
     * 
     * @param owlOntologyManager
     *        the owl ontology manager
     * @param ontology
     *        the ontology
     */
    protected AbstractOWLDebugger(
            @Nonnull OWLOntologyManager owlOntologyManager,
            @Nonnull OWLOntology ontology) {try{__CLR4_5_21be1belviclz68.R.inc(1706);
        __CLR4_5_21be1belviclz68.R.inc(1707);this.owlOntologyManager = checkNotNull(owlOntologyManager,
                "owlOntologyManager cannot be null");
        __CLR4_5_21be1belviclz68.R.inc(1708);this.ontology = checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_21be1belviclz68.R.inc(1709);mergeImportsClosure();
    }finally{__CLR4_5_21be1belviclz68.R.flushNeeded();}}

    private void mergeImportsClosure() {try{__CLR4_5_21be1belviclz68.R.inc(1710);
        __CLR4_5_21be1belviclz68.R.inc(1711);OWLOntology originalOntology = ontology;
        __CLR4_5_21be1belviclz68.R.inc(1712);try {
            __CLR4_5_21be1belviclz68.R.inc(1713);ontology = owlOntologyManager
                    .createOntology(OWLOntologyDocumentSourceBase
                            .getNextDocumentIRI("http://debugger.semanticweb.org/ontolog"));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_21be1belviclz68.R.inc(1714);throw new OWLRuntimeException(e);
        }
        __CLR4_5_21be1belviclz68.R.inc(1715);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_21be1belviclz68.R.inc(1716);for (OWLOntology ont : owlOntologyManager
                .getImportsClosure(originalOntology)) {{
            __CLR4_5_21be1belviclz68.R.inc(1717);for (OWLAxiom ax : ont.getLogicalAxioms()) {{
                assert (((ax != null)&&(__CLR4_5_21be1belviclz68.R.iget(1718)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1719)==0&false));
                __CLR4_5_21be1belviclz68.R.inc(1720);changes.add(new AddAxiom(ontology, ax));
            }
        }}
        }__CLR4_5_21be1belviclz68.R.inc(1721);owlOntologyManager.applyChanges(changes);
    }finally{__CLR4_5_21be1belviclz68.R.flushNeeded();}}

    /**
     * Gets the current class.
     * 
     * @return the current class
     * @throws OWLException
     *         the OWL exception
     */
    @Nonnull
    protected abstract OWLClassExpression getCurrentClass() throws OWLException;

    @Override
    public OWLOntology getOWLOntology() {try{__CLR4_5_21be1belviclz68.R.inc(1722);
        __CLR4_5_21be1belviclz68.R.inc(1723);return ontology;
    }finally{__CLR4_5_21be1belviclz68.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<Set<OWLAxiom>> getAllSOSForInconsistentClass(
            OWLClassExpression cls) throws OWLException {try{__CLR4_5_21be1belviclz68.R.inc(1724);
        __CLR4_5_21be1belviclz68.R.inc(1725);Set<OWLAxiom> firstMups = getSOSForInconsistentClass(cls);
        __CLR4_5_21be1belviclz68.R.inc(1726);if ((((firstMups.isEmpty())&&(__CLR4_5_21be1belviclz68.R.iget(1727)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1728)==0&false))) {{
            __CLR4_5_21be1belviclz68.R.inc(1729);return CollectionFactory.emptySet();
        }
        }__CLR4_5_21be1belviclz68.R.inc(1730);Set<Set<OWLAxiom>> allMups = new HashSet<>();
        __CLR4_5_21be1belviclz68.R.inc(1731);allMups.add(firstMups);
        __CLR4_5_21be1belviclz68.R.inc(1732);Set<Set<OWLAxiom>> satPaths = new HashSet<>();
        __CLR4_5_21be1belviclz68.R.inc(1733);Set<OWLAxiom> currentPathContents = new HashSet<>();
        __CLR4_5_21be1belviclz68.R.inc(1734);constructHittingSetTree(firstMups, allMups, satPaths,
                currentPathContents);
        __CLR4_5_21be1belviclz68.R.inc(1735);return allMups;
    }finally{__CLR4_5_21be1belviclz68.R.flushNeeded();}}

    // Hitting Set Stuff
    /**
     * This is a recursive method that builds a hitting set tree to obtain all
     * justifications for an unsatisfiable class.
     * 
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
     * @throws OWLException
     *         if there is any problem
     */
    public void constructHittingSetTree(@Nonnull Set<OWLAxiom> mups,
            @Nonnull Set<Set<OWLAxiom>> allMups,
            @Nonnull Set<Set<OWLAxiom>> satPaths,
            @Nonnull Set<OWLAxiom> currentPathContents) throws OWLException {try{__CLR4_5_21be1belviclz68.R.inc(1736);
        // We go through the current mups, axiom by axiom, and extend the tree
        // with edges for each axiom
        __CLR4_5_21be1belviclz68.R.inc(1737);for (OWLAxiom axiom : mups) {{
            assert (((axiom != null)&&(__CLR4_5_21be1belviclz68.R.iget(1738)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1739)==0&false));
            // Remove the current axiom from the ontology
            __CLR4_5_21be1belviclz68.R.inc(1740);owlOntologyManager.applyChange(new RemoveAxiom(ontology, axiom));
            __CLR4_5_21be1belviclz68.R.inc(1741);currentPathContents.add(axiom);
            __CLR4_5_21be1belviclz68.R.inc(1742);boolean earlyTermination = false;
            // Early path termination. If our path contents are the superset of
            // the contents of a path then we can terminate here.
            __CLR4_5_21be1belviclz68.R.inc(1743);for (Set<OWLAxiom> satPath : satPaths) {{
                __CLR4_5_21be1belviclz68.R.inc(1744);if ((((satPath.containsAll(currentPathContents))&&(__CLR4_5_21be1belviclz68.R.iget(1745)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1746)==0&false))) {{
                    __CLR4_5_21be1belviclz68.R.inc(1747);earlyTermination = true;
                    __CLR4_5_21be1belviclz68.R.inc(1748);break;
                }
            }}
            }__CLR4_5_21be1belviclz68.R.inc(1749);if ((((!earlyTermination)&&(__CLR4_5_21be1belviclz68.R.iget(1750)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1751)==0&false))) {{
                // Generate a new node - i.e. a new justification set
                // generateSOSAxioms();
                __CLR4_5_21be1belviclz68.R.inc(1752);Set<OWLAxiom> newMUPS = getSOSForInconsistentClass(getCurrentClass());
                __CLR4_5_21be1belviclz68.R.inc(1753);if ((((!newMUPS.isEmpty())&&(__CLR4_5_21be1belviclz68.R.iget(1754)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1755)==0&false))) {{
                    // We have a new justification set, and a new node
                    __CLR4_5_21be1belviclz68.R.inc(1756);if ((((!allMups.contains(newMUPS))&&(__CLR4_5_21be1belviclz68.R.iget(1757)!=0|true))||(__CLR4_5_21be1belviclz68.R.iget(1758)==0&false))) {{
                        // Entirely new justification set
                        __CLR4_5_21be1belviclz68.R.inc(1759);allMups.add(newMUPS);
                        __CLR4_5_21be1belviclz68.R.inc(1760);constructHittingSetTree(newMUPS, allMups, satPaths,
                                currentPathContents);
                    }
                }} }else {{
                    // End of current path - add it to the list of paths
                    __CLR4_5_21be1belviclz68.R.inc(1761);satPaths.add(new HashSet<>(currentPathContents));
                }
            }}
            // Back track - go one level up the tree and run for the next axiom
            }__CLR4_5_21be1belviclz68.R.inc(1762);currentPathContents.remove(axiom);
            // Done with the axiom that was removed. Add it back in
            __CLR4_5_21be1belviclz68.R.inc(1763);owlOntologyManager.applyChange(new AddAxiom(ontology, axiom));
        }
    }}finally{__CLR4_5_21be1belviclz68.R.flushNeeded();}}
}
