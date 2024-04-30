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

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.SimpleIRIMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an implementation of a blackbox debugger. The implementation is based
 * on the description of a black box debugger as described in Aditya Kalyanpur's
 * PhD Thesis : "Debugging and Repair of OWL Ontologies".
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class BlackBoxOWLDebugger extends AbstractOWLDebugger {public static class __CLR4_5_21d01d0lviclz79{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2018,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(BlackBoxOWLDebugger.class);
    private OWLClass currentClass;
    private OWLOntology debuggingOntology;
    @Nonnull
    private final Set<OWLAxiom> debuggingAxioms = new LinkedHashSet<>();
    @Nonnull
    private final Set<OWLEntity> objectsExpandedWithDefiningAxioms = new HashSet<>();
    @Nonnull
    private final Set<OWLEntity> objectsExpandedWithReferencingAxioms = new HashSet<>();
    @Nonnull
    private final Set<OWLAxiom> expandedWithDefiningAxioms = new HashSet<>();
    @Nonnull
    private final Set<OWLAxiom> expandedWithReferencingAxioms = new HashSet<>();
    @Nonnull
    private final OWLReasonerFactory reasonerFactory;
    @Nonnull
    private final Set<OWLAxiom> temporaryAxioms = new HashSet<>();
    private static final int DEFAULT_INITIAL_EXPANSION_LIMIT = 50;
    private final int initialExpansionLimit = DEFAULT_INITIAL_EXPANSION_LIMIT;
    private int expansionLimit = initialExpansionLimit;
    private static final int DEFAULT_FAST_PRUNING_WINDOW_SIZE = 10;
    private int fastPruningWindowSize = 0;

    /**
     * Instantiates a new black box owl debugger.
     * 
     * @param owlOntologyManager
     *        manager to use
     * @param ontology
     *        ontology to debug
     * @param reasonerFactory
     *        factory to use
     */
    public BlackBoxOWLDebugger(@Nonnull OWLOntologyManager owlOntologyManager, @Nonnull OWLOntology ontology,
        @Nonnull OWLReasonerFactory reasonerFactory) {
        super(owlOntologyManager, ontology);__CLR4_5_21d01d0lviclz79.R.inc(1765);try{__CLR4_5_21d01d0lviclz79.R.inc(1764);
        __CLR4_5_21d01d0lviclz79.R.inc(1766);this.reasonerFactory = checkNotNull(reasonerFactory, "reasonerFactory cannot be null");
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_21d01d0lviclz79.R.inc(1767);
        __CLR4_5_21d01d0lviclz79.R.inc(1768);reset();
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    private void reset() {try{__CLR4_5_21d01d0lviclz79.R.inc(1769);
        __CLR4_5_21d01d0lviclz79.R.inc(1770);currentClass = null;
        __CLR4_5_21d01d0lviclz79.R.inc(1771);debuggingOntology = null;
        __CLR4_5_21d01d0lviclz79.R.inc(1772);debuggingAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1773);objectsExpandedWithDefiningAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1774);objectsExpandedWithReferencingAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1775);expandedWithDefiningAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1776);expandedWithReferencingAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1777);temporaryAxioms.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1778);expansionLimit = initialExpansionLimit;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    @Override
    protected OWLClassExpression getCurrentClass() {try{__CLR4_5_21d01d0lviclz79.R.inc(1779);
        __CLR4_5_21d01d0lviclz79.R.inc(1780);if ((((currentClass == null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1781)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1782)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1783);throw new IllegalStateException("currentClass is null; it is not possible to use it at this point.");
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1784);return currentClass;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    /**
     * Setup debugging class.
     * 
     * @param cls
     *        the cls
     * @return the oWL class
     */
    @Nonnull
    private OWLClass setupDebuggingClass(@Nonnull OWLClassExpression cls) {try{__CLR4_5_21d01d0lviclz79.R.inc(1785);
        __CLR4_5_21d01d0lviclz79.R.inc(1786);if ((((!cls.isAnonymous())&&(__CLR4_5_21d01d0lviclz79.R.iget(1787)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1788)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1789);return (OWLClass) cls;
        } }else {{
            // The class is anonymous, so we need to assign it a name
            __CLR4_5_21d01d0lviclz79.R.inc(1790);OWLClass curCls = owlOntologyManager.getOWLDataFactory().getOWLClass(createIRI());
            __CLR4_5_21d01d0lviclz79.R.inc(1791);Set<OWLClassExpression> operands = new HashSet<>();
            __CLR4_5_21d01d0lviclz79.R.inc(1792);operands.add(curCls);
            __CLR4_5_21d01d0lviclz79.R.inc(1793);operands.add(cls);
            __CLR4_5_21d01d0lviclz79.R.inc(1794);temporaryAxioms.add(owlOntologyManager.getOWLDataFactory().getOWLEquivalentClassesAxiom(operands));
            __CLR4_5_21d01d0lviclz79.R.inc(1795);for (OWLAxiom ax : temporaryAxioms) {{
                assert (((ax != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1796)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1797)==0&false));
                __CLR4_5_21d01d0lviclz79.R.inc(1798);owlOntologyManager.applyChange(new AddAxiom(getOWLOntology(), ax));
            }
            }__CLR4_5_21d01d0lviclz79.R.inc(1799);return curCls;
        }
    }}finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getSOSForInconsistentClass(OWLClassExpression cls) throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1800);
        __CLR4_5_21d01d0lviclz79.R.inc(1801);reset();
        __CLR4_5_21d01d0lviclz79.R.inc(1802);currentClass = setupDebuggingClass(cls);
        __CLR4_5_21d01d0lviclz79.R.inc(1803);generateSOSAxioms();
        __CLR4_5_21d01d0lviclz79.R.inc(1804);for (OWLAxiom ax : temporaryAxioms) {{
            assert (((ax != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1805)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1806)==0&false));
            __CLR4_5_21d01d0lviclz79.R.inc(1807);owlOntologyManager.applyChange(new RemoveAxiom(getOWLOntology(), ax));
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1808);debuggingAxioms.removeAll(temporaryAxioms);
        __CLR4_5_21d01d0lviclz79.R.inc(1809);return new HashSet<>(debuggingAxioms);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    // Expansion
    private int expandAxioms() {try{__CLR4_5_21d01d0lviclz79.R.inc(1810);
        // We expand the axiom set using axioms that define entities that are
        // already
        // referenced in the existing set of axioms. If this fails to expand the
        // axiom
        // set we expand using axioms that reference the entities in the axioms
        // that have
        // already been expanded.
        // Keep track of the number of axioms that have been added
        __CLR4_5_21d01d0lviclz79.R.inc(1811);int axiomsAdded = 0;
        __CLR4_5_21d01d0lviclz79.R.inc(1812);int remainingSpace = expansionLimit;
        __CLR4_5_21d01d0lviclz79.R.inc(1813);double expansionFactor = 1.25;
        __CLR4_5_21d01d0lviclz79.R.inc(1814);for (OWLAxiom ax : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1815);if ((((expandedWithDefiningAxioms.contains(ax))&&(__CLR4_5_21d01d0lviclz79.R.iget(1816)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1817)==0&false))) {{
                // Skip if already done
                __CLR4_5_21d01d0lviclz79.R.inc(1818);continue;
            }
            // Collect the entities that have been used in the axiom
            }__CLR4_5_21d01d0lviclz79.R.inc(1819);for (OWLEntity curObj : ax.getSignature()) {{
                assert (((curObj != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1820)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1821)==0&false));
                __CLR4_5_21d01d0lviclz79.R.inc(1822);if ((((!objectsExpandedWithDefiningAxioms.contains(curObj))&&(__CLR4_5_21d01d0lviclz79.R.iget(1823)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1824)==0&false))) {{
                    __CLR4_5_21d01d0lviclz79.R.inc(1825);int added = expandWithDefiningAxioms(curObj, remainingSpace);
                    __CLR4_5_21d01d0lviclz79.R.inc(1826);axiomsAdded += added;
                    __CLR4_5_21d01d0lviclz79.R.inc(1827);remainingSpace -= added;
                    __CLR4_5_21d01d0lviclz79.R.inc(1828);if ((((remainingSpace == 0)&&(__CLR4_5_21d01d0lviclz79.R.iget(1829)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1830)==0&false))) {{
                        __CLR4_5_21d01d0lviclz79.R.inc(1831);expansionLimit *= expansionFactor;
                        __CLR4_5_21d01d0lviclz79.R.inc(1832);return axiomsAdded;
                    }
                    // Flag that we have completely expanded all defining axioms
                    // for this particular entity
                    }__CLR4_5_21d01d0lviclz79.R.inc(1833);objectsExpandedWithDefiningAxioms.add(curObj);
                }
            }}
            // Flag that we've completely expanded this particular axiom
            }__CLR4_5_21d01d0lviclz79.R.inc(1834);expandedWithDefiningAxioms.add(ax);
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1835);if ((((axiomsAdded > 0)&&(__CLR4_5_21d01d0lviclz79.R.iget(1836)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1837)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1838);return axiomsAdded;
        }
        // No axioms added at this point. Start adding axioms that reference
        // entities contained in the current set of debugging axioms
        }__CLR4_5_21d01d0lviclz79.R.inc(1839);for (OWLAxiom ax : new ArrayList<>(debuggingAxioms)) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1840);if ((((expandedWithReferencingAxioms.contains(ax))&&(__CLR4_5_21d01d0lviclz79.R.iget(1841)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1842)==0&false))) {{
                // Skip - already done this one
                __CLR4_5_21d01d0lviclz79.R.inc(1843);continue;
            }
            // Keep track of the number of axioms that have been added
            }__CLR4_5_21d01d0lviclz79.R.inc(1844);for (OWLEntity curObj : ax.getSignature()) {{
                assert (((curObj != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1845)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1846)==0&false));
                __CLR4_5_21d01d0lviclz79.R.inc(1847);if ((((!objectsExpandedWithReferencingAxioms.contains(curObj))&&(__CLR4_5_21d01d0lviclz79.R.iget(1848)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1849)==0&false))) {{
                    __CLR4_5_21d01d0lviclz79.R.inc(1850);int added = expandWithReferencingAxioms(curObj, expansionLimit);
                    __CLR4_5_21d01d0lviclz79.R.inc(1851);axiomsAdded += added;
                    __CLR4_5_21d01d0lviclz79.R.inc(1852);remainingSpace -= added;
                    __CLR4_5_21d01d0lviclz79.R.inc(1853);if ((((remainingSpace == 0)&&(__CLR4_5_21d01d0lviclz79.R.iget(1854)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1855)==0&false))) {{
                        __CLR4_5_21d01d0lviclz79.R.inc(1856);expansionLimit *= expansionFactor;
                        __CLR4_5_21d01d0lviclz79.R.inc(1857);return axiomsAdded;
                    }
                    }__CLR4_5_21d01d0lviclz79.R.inc(1858);objectsExpandedWithReferencingAxioms.add(curObj);
                }
            }}
            }__CLR4_5_21d01d0lviclz79.R.inc(1859);expandedWithReferencingAxioms.add(ax);
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1860);return axiomsAdded;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

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
    private int expandWithDefiningAxioms(@Nonnull OWLEntity obj, int limit) {try{__CLR4_5_21d01d0lviclz79.R.inc(1861);
        __CLR4_5_21d01d0lviclz79.R.inc(1862);Set<OWLAxiom> expansionAxioms = new HashSet<>();
        __CLR4_5_21d01d0lviclz79.R.inc(1863);if ((((obj instanceof OWLClass)&&(__CLR4_5_21d01d0lviclz79.R.iget(1864)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1865)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1866);expansionAxioms.addAll(getOWLOntology().getAxioms((OWLClass) obj, INCLUDED));
        } }else {__CLR4_5_21d01d0lviclz79.R.inc(1867);if ((((obj instanceof OWLObjectProperty)&&(__CLR4_5_21d01d0lviclz79.R.iget(1868)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1869)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1870);expansionAxioms.addAll(getOWLOntology().getAxioms((OWLObjectProperty) obj, INCLUDED));
        } }else {__CLR4_5_21d01d0lviclz79.R.inc(1871);if ((((obj instanceof OWLDataProperty)&&(__CLR4_5_21d01d0lviclz79.R.iget(1872)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1873)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1874);expansionAxioms.addAll(getOWLOntology().getAxioms((OWLDataProperty) obj, INCLUDED));
        } }else {__CLR4_5_21d01d0lviclz79.R.inc(1875);if ((((obj instanceof OWLIndividual)&&(__CLR4_5_21d01d0lviclz79.R.iget(1876)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1877)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1878);expansionAxioms.addAll(getOWLOntology().getAxioms((OWLIndividual) obj, INCLUDED));
        }
        }}}}__CLR4_5_21d01d0lviclz79.R.inc(1879);expansionAxioms.removeAll(debuggingAxioms);
        __CLR4_5_21d01d0lviclz79.R.inc(1880);return addMax(expansionAxioms, debuggingAxioms, limit);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

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
    private int expandWithReferencingAxioms(@Nonnull OWLEntity obj, int limit) {try{__CLR4_5_21d01d0lviclz79.R.inc(1881);
        __CLR4_5_21d01d0lviclz79.R.inc(1882);Set<OWLAxiom> expansionAxioms = new HashSet<>();
        // First expand by getting the defining axioms - if this doesn't
        // return any axioms, then get the axioms that reference the entity
        __CLR4_5_21d01d0lviclz79.R.inc(1883);expansionAxioms.addAll(getOWLOntology().getReferencingAxioms(obj, INCLUDED));
        __CLR4_5_21d01d0lviclz79.R.inc(1884);expansionAxioms.removeAll(debuggingAxioms);
        __CLR4_5_21d01d0lviclz79.R.inc(1885);return addMax(expansionAxioms, debuggingAxioms, limit);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

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
     * @return The number of objects that were actuall added.
     */
    private static <N extends OWLAxiom> int addMax(@Nonnull Set<N> source, @Nonnull Set<N> dest, int limit) {try{__CLR4_5_21d01d0lviclz79.R.inc(1886);
        __CLR4_5_21d01d0lviclz79.R.inc(1887);int count = 0;
        __CLR4_5_21d01d0lviclz79.R.inc(1888);for (N obj : source) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1889);if ((((count == limit)&&(__CLR4_5_21d01d0lviclz79.R.iget(1890)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1891)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1892);break;
            }
            }__CLR4_5_21d01d0lviclz79.R.inc(1893);if ((((!(obj instanceof OWLAnnotationAxiom) && dest.add(obj))&&(__CLR4_5_21d01d0lviclz79.R.iget(1894)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1895)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1896);count++;
            }
        }}
        }__CLR4_5_21d01d0lviclz79.R.inc(1897);return count;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    // Contraction/Pruning - Fast pruning is performed and then slow pruning is
    // performed.
    private void performFastPruning() throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1898);
        __CLR4_5_21d01d0lviclz79.R.inc(1899);Set<OWLAxiom> axiomWindow = new HashSet<>();
        __CLR4_5_21d01d0lviclz79.R.inc(1900);Object[] axioms = debuggingAxioms.toArray();
        __CLR4_5_21d01d0lviclz79.R.inc(1901);LOGGER.info("Fast pruning: ");
        __CLR4_5_21d01d0lviclz79.R.inc(1902);LOGGER.info("     - Window size: {}", fastPruningWindowSize);
        __CLR4_5_21d01d0lviclz79.R.inc(1903);int windowCount = debuggingAxioms.size() / fastPruningWindowSize;
        __CLR4_5_21d01d0lviclz79.R.inc(1904);for (int currentWindow = 0; (((currentWindow < windowCount)&&(__CLR4_5_21d01d0lviclz79.R.iget(1905)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1906)==0&false)); currentWindow++) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1907);axiomWindow.clear();
            __CLR4_5_21d01d0lviclz79.R.inc(1908);int startIndex = currentWindow * fastPruningWindowSize;
            __CLR4_5_21d01d0lviclz79.R.inc(1909);int endIndex = startIndex + fastPruningWindowSize;
            __CLR4_5_21d01d0lviclz79.R.inc(1910);for (int axiomIndex = startIndex; (((axiomIndex < endIndex)&&(__CLR4_5_21d01d0lviclz79.R.iget(1911)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1912)==0&false)); axiomIndex++) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1913);OWLAxiom currentAxiom = (OWLAxiom) axioms[axiomIndex];
                __CLR4_5_21d01d0lviclz79.R.inc(1914);axiomWindow.add(currentAxiom);
                __CLR4_5_21d01d0lviclz79.R.inc(1915);debuggingAxioms.remove(currentAxiom);
            }
            }__CLR4_5_21d01d0lviclz79.R.inc(1916);if ((((isSatisfiable())&&(__CLR4_5_21d01d0lviclz79.R.iget(1917)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1918)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1919);debuggingAxioms.addAll(axiomWindow);
            }
        }}
        // Add any left over axioms
        }__CLR4_5_21d01d0lviclz79.R.inc(1920);axiomWindow.clear();
        __CLR4_5_21d01d0lviclz79.R.inc(1921);int remainingAxiomsCount = debuggingAxioms.size() % fastPruningWindowSize;
        __CLR4_5_21d01d0lviclz79.R.inc(1922);if ((((remainingAxiomsCount > 0)&&(__CLR4_5_21d01d0lviclz79.R.iget(1923)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1924)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1925);int fragmentIndex = windowCount * fastPruningWindowSize;
            __CLR4_5_21d01d0lviclz79.R.inc(1926);while ((((fragmentIndex < axioms.length)&&(__CLR4_5_21d01d0lviclz79.R.iget(1927)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1928)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1929);OWLAxiom curAxiom = (OWLAxiom) axioms[fragmentIndex];
                __CLR4_5_21d01d0lviclz79.R.inc(1930);axiomWindow.add(curAxiom);
                __CLR4_5_21d01d0lviclz79.R.inc(1931);debuggingAxioms.remove(curAxiom);
                __CLR4_5_21d01d0lviclz79.R.inc(1932);fragmentIndex++;
            }
            }__CLR4_5_21d01d0lviclz79.R.inc(1933);if ((((isSatisfiable())&&(__CLR4_5_21d01d0lviclz79.R.iget(1934)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1935)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1936);debuggingAxioms.addAll(axiomWindow);
            }
        }}
        }__CLR4_5_21d01d0lviclz79.R.inc(1937);LOGGER.info("    - End of fast pruning");
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    private void performSlowPruning() throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1938);
        // Simply remove axioms one at a time. If the class
        // being debugged turns satisfiable then we know we have
        // an SOS axoiom.
        __CLR4_5_21d01d0lviclz79.R.inc(1939);List<OWLAxiom> axiomsCopy = new ArrayList<>(debuggingAxioms);
        __CLR4_5_21d01d0lviclz79.R.inc(1940);for (OWLAxiom ax : axiomsCopy) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1941);debuggingAxioms.remove(ax);
            __CLR4_5_21d01d0lviclz79.R.inc(1942);if ((((isSatisfiable())&&(__CLR4_5_21d01d0lviclz79.R.iget(1943)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1944)==0&false))) {{
                // Affects satisfiability, so add back in
                __CLR4_5_21d01d0lviclz79.R.inc(1945);debuggingAxioms.add(ax);
            }
        }}
    }}finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    // Creation of debugging ontology and satisfiability testing
    private int satTestCount = 0;

    @Nonnull
    protected OWLOntology getDebuggingOntology() {try{__CLR4_5_21d01d0lviclz79.R.inc(1946);
        __CLR4_5_21d01d0lviclz79.R.inc(1947);return verifyNotNull(debuggingOntology);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    /**
     * Tests the satisfiability of the test class. The ontology is recreated
     * before the test is performed.
     * 
     * @return true, if is satisfiable
     * @throws OWLException
     *         the oWL exception
     */
    private boolean isSatisfiable() throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1948);
        __CLR4_5_21d01d0lviclz79.R.inc(1949);createDebuggingOntology();
        __CLR4_5_21d01d0lviclz79.R.inc(1950);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(getDebuggingOntology());
        __CLR4_5_21d01d0lviclz79.R.inc(1951);satTestCount++;
        __CLR4_5_21d01d0lviclz79.R.inc(1952);boolean sat = reasoner.isSatisfiable(verifyNotNull(currentClass));
        __CLR4_5_21d01d0lviclz79.R.inc(1953);reasoner.dispose();
        __CLR4_5_21d01d0lviclz79.R.inc(1954);return sat;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    private void createDebuggingOntology() throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1955);
        __CLR4_5_21d01d0lviclz79.R.inc(1956);if ((((debuggingOntology != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1957)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1958)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1959);owlOntologyManager.removeOntology(verifyNotNull(debuggingOntology));
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1960);IRI iri = createIRI();
        __CLR4_5_21d01d0lviclz79.R.inc(1961);SimpleIRIMapper mapper = new SimpleIRIMapper(iri, iri);
        __CLR4_5_21d01d0lviclz79.R.inc(1962);owlOntologyManager.getIRIMappers().add(mapper);
        __CLR4_5_21d01d0lviclz79.R.inc(1963);debuggingOntology = owlOntologyManager.createOntology(iri);
        __CLR4_5_21d01d0lviclz79.R.inc(1964);owlOntologyManager.getIRIMappers().remove(mapper);
        __CLR4_5_21d01d0lviclz79.R.inc(1965);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_21d01d0lviclz79.R.inc(1966);for (OWLAxiom ax : debuggingAxioms) {{
            assert (((ax != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1967)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1968)==0&false));
            __CLR4_5_21d01d0lviclz79.R.inc(1969);changes.add(new AddAxiom(getDebuggingOntology(), ax));
        }
        }__CLR4_5_21d01d0lviclz79.R.inc(1970);for (OWLAxiom ax : temporaryAxioms) {{
            assert (((ax != null)&&(__CLR4_5_21d01d0lviclz79.R.iget(1971)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1972)==0&false));
            __CLR4_5_21d01d0lviclz79.R.inc(1973);changes.add(new AddAxiom(getDebuggingOntology(), ax));
        }
        // Ensure the ontology contains the signature of the class which is
        // being debugged
        }__CLR4_5_21d01d0lviclz79.R.inc(1974);OWLDataFactory factory = owlOntologyManager.getOWLDataFactory();
        __CLR4_5_21d01d0lviclz79.R.inc(1975);OWLAxiom ax = factory.getOWLSubClassOfAxiom(verifyNotNull(currentClass), factory.getOWLThing());
        __CLR4_5_21d01d0lviclz79.R.inc(1976);changes.add(new AddAxiom(getDebuggingOntology(), ax));
        __CLR4_5_21d01d0lviclz79.R.inc(1977);owlOntologyManager.applyChanges(changes);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    private void resetSatisfiabilityTestCounter() {try{__CLR4_5_21d01d0lviclz79.R.inc(1978);
        __CLR4_5_21d01d0lviclz79.R.inc(1979);satTestCount = 0;
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    private void generateSOSAxioms() throws OWLException {try{__CLR4_5_21d01d0lviclz79.R.inc(1980);
        // Perform the initial expansion - this will cause
        // the debugging axioms set to be expanded to the
        // defining axioms for the class being debugged
        __CLR4_5_21d01d0lviclz79.R.inc(1981);resetSatisfiabilityTestCounter();
        __CLR4_5_21d01d0lviclz79.R.inc(1982);expandWithDefiningAxioms((OWLClass) getCurrentClass(), expansionLimit);
        __CLR4_5_21d01d0lviclz79.R.inc(1983);LOGGER.info("Initial axiom count: {}", debuggingAxioms.size());
        __CLR4_5_21d01d0lviclz79.R.inc(1984);int totalAdded = 0;
        __CLR4_5_21d01d0lviclz79.R.inc(1985);int expansionCount = 0;
        __CLR4_5_21d01d0lviclz79.R.inc(1986);while ((((isSatisfiable())&&(__CLR4_5_21d01d0lviclz79.R.iget(1987)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1988)==0&false))) {{
            __CLR4_5_21d01d0lviclz79.R.inc(1989);LOGGER.info("Expanding axioms (expansion {})", expansionCount);
            __CLR4_5_21d01d0lviclz79.R.inc(1990);expansionCount++;
            __CLR4_5_21d01d0lviclz79.R.inc(1991);int numberAdded = expandAxioms();
            __CLR4_5_21d01d0lviclz79.R.inc(1992);totalAdded += numberAdded;
            __CLR4_5_21d01d0lviclz79.R.inc(1993);LOGGER.info("    ... expanded by {}", numberAdded);
            __CLR4_5_21d01d0lviclz79.R.inc(1994);if ((((numberAdded == 0)&&(__CLR4_5_21d01d0lviclz79.R.iget(1995)!=0|true))||(__CLR4_5_21d01d0lviclz79.R.iget(1996)==0&false))) {{
                __CLR4_5_21d01d0lviclz79.R.inc(1997);LOGGER.info("ERROR! Cannot find SOS axioms!");
                __CLR4_5_21d01d0lviclz79.R.inc(1998);debuggingAxioms.clear();
                __CLR4_5_21d01d0lviclz79.R.inc(1999);return;
            }
        }}
        }__CLR4_5_21d01d0lviclz79.R.inc(2000);LOGGER.info("Total number of axioms added: {}", totalAdded);
        __CLR4_5_21d01d0lviclz79.R.inc(2001);LOGGER.info("FOUND CLASH! Pruning {} axioms...", debuggingAxioms.size());
        __CLR4_5_21d01d0lviclz79.R.inc(2002);resetSatisfiabilityTestCounter();
        __CLR4_5_21d01d0lviclz79.R.inc(2003);LOGGER.info("Fast pruning...");
        __CLR4_5_21d01d0lviclz79.R.inc(2004);fastPruningWindowSize = DEFAULT_FAST_PRUNING_WINDOW_SIZE;
        __CLR4_5_21d01d0lviclz79.R.inc(2005);performFastPruning();
        __CLR4_5_21d01d0lviclz79.R.inc(2006);LOGGER.info("... end of fast pruning. Axioms remaining: {}", debuggingAxioms.size());
        __CLR4_5_21d01d0lviclz79.R.inc(2007);LOGGER.info("Performed {} satisfiability tests during fast pruning", satTestCount);
        __CLR4_5_21d01d0lviclz79.R.inc(2008);int totalSatTests = satTestCount;
        __CLR4_5_21d01d0lviclz79.R.inc(2009);resetSatisfiabilityTestCounter();
        __CLR4_5_21d01d0lviclz79.R.inc(2010);LOGGER.info("Slow pruning...");
        __CLR4_5_21d01d0lviclz79.R.inc(2011);performSlowPruning();
        __CLR4_5_21d01d0lviclz79.R.inc(2012);LOGGER.info("... end of slow pruning");
        __CLR4_5_21d01d0lviclz79.R.inc(2013);LOGGER.info("Performed {} satisfiability tests during slow pruning", satTestCount);
        __CLR4_5_21d01d0lviclz79.R.inc(2014);totalSatTests += satTestCount;
        __CLR4_5_21d01d0lviclz79.R.inc(2015);LOGGER.info("Total number of satisfiability tests performed: {}", totalSatTests);
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}

    @Nonnull
    private static IRI createIRI() {try{__CLR4_5_21d01d0lviclz79.R.inc(2016);
        __CLR4_5_21d01d0lviclz79.R.inc(2017);return OWLOntologyDocumentSourceBase.getNextDocumentIRI("http://debugging.blackbox#A");
    }finally{__CLR4_5_21d01d0lviclz79.R.flushNeeded();}}
}
