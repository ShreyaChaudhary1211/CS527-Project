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
package uk.ac.manchester.cs.owlapi.modularity;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.modularity.OntologySegmenter;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.clarkparsia.owlapi.modularity.locality.LocalityClass;
import com.clarkparsia.owlapi.modularity.locality.SyntacticLocalityEvaluator;

/**
 * Implementation of module extraction based on syntactic locality.
 * 
 * @author Thomas Schneider, School of Computer Science, University of
 *         Manchester
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class SyntacticLocalityModuleExtractor implements OntologySegmenter {public static class __CLR4_5_22gv2gvlvicm093{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,3535,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(SyntacticLocalityModuleExtractor.class);

    /**
     * Auxiliary inner class for the representation of the associated ontology
     * and all its sub-ontologies as arrays of axioms. Advantages: (1) quicker
     * set manipulation operations; (2) storage of all referenced entities of an
     * axiom once this axiom is dealt with.
     * 
     * @author Thomas Schneider
     * @author School of Computer Science
     * @author University of Manchester
     */
    static class OntologyAxiomSet {

        /** Array representing all axioms of the associated ontology. */
        @Nonnull
        final OWLAxiom[] ax;

        /**
         * Creates a new OntologyAxiomSet from a given set of axioms without
         * looking up the referenced entities.
         * 
         * @param axs
         *        the set of axioms representing the ontology
         */
        OntologyAxiomSet(@Nonnull Set<OWLAxiom> axs) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3199);
            __CLR4_5_22gv2gvlvicm093.R.inc(3200);ax = axs.toArray(new OWLAxiom[axs.size()]);
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Returns the number of axioms in this set.
         * 
         * @return the number of axioms in this set
         */
        public int size() {try{__CLR4_5_22gv2gvlvicm093.R.inc(3201);
            __CLR4_5_22gv2gvlvicm093.R.inc(3202);return ax.length;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Returns some axiom from this set.
         * 
         * @param i
         *        a number for an axiom
         * @return the i-th axiom in this set
         */
        @Nonnull
        public OWLAxiom getAxiom(int i) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3203);
            __CLR4_5_22gv2gvlvicm093.R.inc(3204);return ax[i];
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Returns an array containing all axioms in this set.
         * 
         * @return array containing all axioms in this set
         */
        @Nonnull
        public OWLAxiom[] getAllAxioms() {try{__CLR4_5_22gv2gvlvicm093.R.inc(3205);
            __CLR4_5_22gv2gvlvicm093.R.inc(3206);OWLAxiom[] toReturn = new OWLAxiom[ax.length];
            __CLR4_5_22gv2gvlvicm093.R.inc(3207);System.arraycopy(ax, 0, toReturn, 0, ax.length);
            __CLR4_5_22gv2gvlvicm093.R.inc(3208);return toReturn;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Returns the set of axioms that is represented by some array of
         * Booleans.
         * 
         * @param isIn
         *        an array of Booleans
         * @return the set of axioms represented by the specified array of
         *         Booleans
         */
        @Nonnull
        public Set<OWLAxiom> getAxiomSet(boolean[] isIn) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3209);
            __CLR4_5_22gv2gvlvicm093.R.inc(3210);HashSet<OWLAxiom> gas = new HashSet<>();
            __CLR4_5_22gv2gvlvicm093.R.inc(3211);for (int i = 0; (((i < isIn.length)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3212)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3213)==0&false)); i++) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3214);if ((((isIn[i])&&(__CLR4_5_22gv2gvlvicm093.R.iget(3215)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3216)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3217);gas.add(ax[i]);
                }
            }}
            }__CLR4_5_22gv2gvlvicm093.R.inc(3218);return gas;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Constructs an array of Booleans that represents a subset of this set.
         * The subset either equals this set (if init==true) or is the empty set
         * (if init==false).
         * 
         * @param init
         *        determines the initial value of the subset
         * @return array of Booleans representing the specified subset
         */
        @Nonnull
        public boolean[] getSubset(boolean init) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3219);
            __CLR4_5_22gv2gvlvicm093.R.inc(3220);boolean[] subset = new boolean[ax.length];
            __CLR4_5_22gv2gvlvicm093.R.inc(3221);for (int i = 0; (((i < ax.length)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3222)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3223)==0&false)); i++) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3224);subset[i] = init;
            }
            }__CLR4_5_22gv2gvlvicm093.R.inc(3225);return subset;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Clones an array of Booleans that represents a subset of this set.
         * 
         * @param oldSubset
         *        an array representing the original subset
         * @return an array representing the new subset
         */
        @Nonnull
        public boolean[] cloneSubset(boolean[] oldSubset) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3226);
            __CLR4_5_22gv2gvlvicm093.R.inc(3227);boolean[] newSubset = new boolean[ax.length];
            __CLR4_5_22gv2gvlvicm093.R.inc(3228);System.arraycopy(oldSubset, 0, newSubset, 0, ax.length);
            __CLR4_5_22gv2gvlvicm093.R.inc(3229);return newSubset;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Subset cardinality.
         * 
         * @param subset
         *        the subset
         * @return the int
         */
        public int subsetCardinality(boolean[] subset) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3230);
            __CLR4_5_22gv2gvlvicm093.R.inc(3231);int card = 0;
            __CLR4_5_22gv2gvlvicm093.R.inc(3232);for (int i = 0; (((i < ax.length)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3233)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3234)==0&false)); i++) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3235);if ((((subset[i])&&(__CLR4_5_22gv2gvlvicm093.R.iget(3236)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3237)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3238);card++;
                }
            }}
            }__CLR4_5_22gv2gvlvicm093.R.inc(3239);return card;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

        /**
         * Transforms a subset of this set (represented by an array of Booleans)
         * into a set of axioms.
         * 
         * @param subset
         *        an array representing the subset
         * @return a set of axioms
         */
        @Nonnull
        public Set<OWLAxiom> toSet(boolean[] subset) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3240);
            __CLR4_5_22gv2gvlvicm093.R.inc(3241);HashSet<OWLAxiom> axs = new HashSet<>();
            __CLR4_5_22gv2gvlvicm093.R.inc(3242);for (int i = 0; (((i < ax.length)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3243)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3244)==0&false)); i++) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3245);if ((((subset[i])&&(__CLR4_5_22gv2gvlvicm093.R.iget(3246)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3247)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3248);axs.add(ax[i]);
                }
            }}
            }__CLR4_5_22gv2gvlvicm093.R.inc(3249);return axs;
        }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}
    }

    /** Type of module. */
    @Nonnull
    private ModuleType moduleType;
    /** Represents the associated ontology. */
    private final OntologyAxiomSet ontologyAxiomSet;
    private final IRI rootOntology;
    @Nonnull
    private final OWLOntology ontology;
    /** Represents the manager for the associated ontology. */
    private final OWLOntologyManager manager;

    /**
     * Creates a new module extractor for a subset of a given ontology, its
     * manager, and a specified type of locality.
     * 
     * @param man
     *        the manager for the associated ontology
     * @param ont
     *        the associated ontology
     * @param axs
     *        the subset of the ontology as a set of axioms
     * @param moduleType
     *        the type of module this extractor will construct
     * @deprecated use the contructor that takes an IRI rather than an ontology
     *             as second argument. The second argument is used only in
     *             logging assertions and can be null.
     */
    @Deprecated
    public SyntacticLocalityModuleExtractor(@Nonnull OWLOntologyManager man, OWLOntology ont,
        @Nonnull Set<OWLAxiom> axs, @Nonnull ModuleType moduleType) {
        this(man, (((ont == null )&&(__CLR4_5_22gv2gvlvicm093.R.iget(3251)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3252)==0&false))? null : ont.getOntologyID().getOntologyIRI().orNull(), axs, moduleType);__CLR4_5_22gv2gvlvicm093.R.inc(3253);try{__CLR4_5_22gv2gvlvicm093.R.inc(3250);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Creates a new module extractor for a subset of a given ontology, its
     * manager, and a specified type of locality.
     * 
     * @param man
     *        the manager for the associated ontology
     * @param ontIRI
     *        the associated ontology IRI. Only for debugging purposes.
     * @param axs
     *        the subset of the ontology as a set of axioms
     * @param moduleType
     *        the type of module this extractor will construct
     */
    public SyntacticLocalityModuleExtractor(@Nonnull OWLOntologyManager man, IRI ontIRI,
        @Nonnull Set<OWLAxiom> axs, @Nonnull ModuleType moduleType) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3254);
        __CLR4_5_22gv2gvlvicm093.R.inc(3255);this.moduleType = checkNotNull(moduleType, "moduleType cannot be null");
        __CLR4_5_22gv2gvlvicm093.R.inc(3256);manager = checkNotNull(man, "man cannot be null");
        __CLR4_5_22gv2gvlvicm093.R.inc(3257);rootOntology = ontIRI;
        __CLR4_5_22gv2gvlvicm093.R.inc(3258);ontologyAxiomSet = new OntologyAxiomSet(axs);
        __CLR4_5_22gv2gvlvicm093.R.inc(3259);try {
            __CLR4_5_22gv2gvlvicm093.R.inc(3260);ontology = checkNotNull(man.createOntology(axs));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_22gv2gvlvicm093.R.inc(3261);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Creates a new module extractor for a given ontology, its manager, and a
     * specified type of locality.
     * 
     * @param man
     *        the manager for the associated ontology
     * @param ont
     *        the associated ontology
     * @param moduleType
     *        the type of module this extractor will construct
     */
    public SyntacticLocalityModuleExtractor(@Nonnull OWLOntologyManager man, @Nonnull OWLOntology ont,
        @Nonnull ModuleType moduleType) {
        this(man, ont, asAxiomSet(ont), moduleType);__CLR4_5_22gv2gvlvicm093.R.inc(3263);try{__CLR4_5_22gv2gvlvicm093.R.inc(3262);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    @Nonnull
    private static Set<OWLAxiom> asAxiomSet(OWLOntology ont) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3264);
        __CLR4_5_22gv2gvlvicm093.R.inc(3265);Set<OWLAxiom> axs = new HashSet<>(ont.getAxioms());
        __CLR4_5_22gv2gvlvicm093.R.inc(3266);for (OWLOntology importedOnt : ont.getImportsClosure()) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3267);axs.addAll(importedOnt.getAxioms());
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3268);return axs;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Changes the module type for this extractor without deleting the stored
     * referenced entities.
     * 
     * @param moduleType
     *        the new type of module
     */
    public void setModuleType(@Nonnull ModuleType moduleType) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3269);
        __CLR4_5_22gv2gvlvicm093.R.inc(3270);this.moduleType = checkNotNull(moduleType, "moduleType cannot be null");
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Returns the module type for this extractor.
     * 
     * @return module type for this extractor
     */
    @Nonnull
    public ModuleType getModuleType() {try{__CLR4_5_22gv2gvlvicm093.R.inc(3271);
        __CLR4_5_22gv2gvlvicm093.R.inc(3272);return moduleType;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * This auxiliary method extracts a module from a given sub-ontology of the
     * associated ontology for a given signature and locality type. The module
     * will contain only logical axioms, no annotation or declaration axioms.
     * The sub-ontology and module are represented as arrays of Booleans.
     * <p/>
     * This method is (if necessary, iteratively) called by the public method
     * extract.
     * 
     * @param subOnt
     *        an array of Booleans representing the sub-ontology
     * @param signature
     *        the seed signature (set of entities) for the module; on return of
     *        the method, this will contain the signature of the module
     * @param localityClass
     *        the type of locality
     * @param verbose
     *        a flag for verbose output (test purposes)
     * @return an array of Booleans representing the module
     */
    @Nonnull
        boolean[] extractLogicalAxioms(@Nonnull boolean[] subOnt, @Nonnull Set<OWLEntity> signature,
            @Nonnull LocalityClass localityClass, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3273);
        __CLR4_5_22gv2gvlvicm093.R.inc(3274);boolean[] mod = ontologyAxiomSet.getSubset(false);
        __CLR4_5_22gv2gvlvicm093.R.inc(3275);boolean[] q2 = ontologyAxiomSet.cloneSubset(subOnt);
        __CLR4_5_22gv2gvlvicm093.R.inc(3276);SyntacticLocalityEvaluator sle = new SyntacticLocalityEvaluator(localityClass);
        __CLR4_5_22gv2gvlvicm093.R.inc(3277);boolean change = true;
        __CLR4_5_22gv2gvlvicm093.R.inc(3278);int loopNumber = 0;
        __CLR4_5_22gv2gvlvicm093.R.inc(3279);while ((((change)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3280)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3281)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3282);change = false;
            __CLR4_5_22gv2gvlvicm093.R.inc(3283);loopNumber++;
            __CLR4_5_22gv2gvlvicm093.R.inc(3284);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3285)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3286)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3287);LOGGER.info("  Loop {}", loopNumber);
            }
            }__CLR4_5_22gv2gvlvicm093.R.inc(3288);for (int i = 0; (((i < q2.length)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3289)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3290)==0&false)); i += 1) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3291);if ((((q2[i])&&(__CLR4_5_22gv2gvlvicm093.R.iget(3292)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3293)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3294);if ((((!sle.isLocal(ontologyAxiomSet.getAxiom(i), signature))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3295)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3296)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3297);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3298)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3299)==0&false))) {{
                            __CLR4_5_22gv2gvlvicm093.R.inc(3300);LOGGER.info("      Non-local axiom:   {}", minusOntologyURI(ontologyAxiomSet.getAxiom(i)
                                .toString()));
                        }
                        }__CLR4_5_22gv2gvlvicm093.R.inc(3301);mod[i] = true;
                        __CLR4_5_22gv2gvlvicm093.R.inc(3302);q2[i] = false;
                        __CLR4_5_22gv2gvlvicm093.R.inc(3303);int oldSize = signature.size();
                        __CLR4_5_22gv2gvlvicm093.R.inc(3304);signature.addAll(ontologyAxiomSet.getAxiom(i).getSignature());
                        // only triggering a change when the signature has
                        // changed doesn't improve performance
                        __CLR4_5_22gv2gvlvicm093.R.inc(3305);if ((((signature.size() > oldSize)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3306)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3307)==0&false))) {{
                            __CLR4_5_22gv2gvlvicm093.R.inc(3308);change = true;
                            __CLR4_5_22gv2gvlvicm093.R.inc(3309);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3310)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3311)==0&false))) {{
                                __CLR4_5_22gv2gvlvicm093.R.inc(3312);LOGGER.info("    New signature:   {}", signature);
                            }
                        }}
                    }} }else {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3313);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3314)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3315)==0&false))) {{
                            __CLR4_5_22gv2gvlvicm093.R.inc(3316);LOGGER.info("      Local axiom:       {}", minusOntologyURI(ontologyAxiomSet.getAxiom(i)
                                .toString()));
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_22gv2gvlvicm093.R.inc(3317);return mod;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * This method extracts a module from a given sub-ontology of the associated
     * ontology for a given signature and locality type. The module will only
     * contain logical axioms, no annotation or declaration axioms. The
     * sub-ontology and module are represented as sets of axioms.
     * 
     * @param subOnt
     *        a set of axioms representing the sub-ontology
     * @param signature
     *        the seed signature (set of entities) for the module; on return of
     *        the method, this will contain the signature of the module
     * @param localityClass
     *        the type of locality
     * @param verbose
     *        a flag for verbose output (test purposes)
     * @return a set of axioms representing the module
     */
    @Nonnull
        Set<OWLAxiom> extract(@Nonnull Set<OWLAxiom> subOnt, @Nonnull Set<OWLEntity> signature,
            @Nonnull LocalityClass localityClass, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3318);
        __CLR4_5_22gv2gvlvicm093.R.inc(3319);HashSet<OWLAxiom> mod = new HashSet<>();
        __CLR4_5_22gv2gvlvicm093.R.inc(3320);HashSet<OWLAxiom> q2 = new HashSet<>(subOnt);
        __CLR4_5_22gv2gvlvicm093.R.inc(3321);SyntacticLocalityEvaluator sle = new SyntacticLocalityEvaluator(localityClass);
        __CLR4_5_22gv2gvlvicm093.R.inc(3322);boolean change = true;
        __CLR4_5_22gv2gvlvicm093.R.inc(3323);int loopNumber = 0;
        __CLR4_5_22gv2gvlvicm093.R.inc(3324);while ((((change)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3325)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3326)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3327);change = false;
            __CLR4_5_22gv2gvlvicm093.R.inc(3328);loopNumber++;
            __CLR4_5_22gv2gvlvicm093.R.inc(3329);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3330)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3331)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3332);LOGGER.info("  Loop {}", loopNumber);
            }
            }__CLR4_5_22gv2gvlvicm093.R.inc(3333);HashSet<OWLAxiom> q2remove = new HashSet<>();
            __CLR4_5_22gv2gvlvicm093.R.inc(3334);for (OWLAxiom ax : q2) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3335);if ((((!sle.isLocal(ax, signature))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3336)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3337)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3338);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3339)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3340)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3341);LOGGER.info("      Non-local axiom:   {}", minusOntologyURI(ax.toString()));
                    }
                    }__CLR4_5_22gv2gvlvicm093.R.inc(3342);mod.add(ax);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3343);q2remove.add(ax);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3344);int oldSize = signature.size();
                    __CLR4_5_22gv2gvlvicm093.R.inc(3345);signature.addAll(ax.getSignature());
                    // only triggering a change when the signature has changed
                    // doesn't improve performance
                    __CLR4_5_22gv2gvlvicm093.R.inc(3346);if ((((signature.size() > oldSize)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3347)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3348)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3349);change = true;
                        __CLR4_5_22gv2gvlvicm093.R.inc(3350);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3351)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3352)==0&false))) {{
                            __CLR4_5_22gv2gvlvicm093.R.inc(3353);LOGGER.info("    New signature:   {}", signature);
                        }
                    }}
                }} }else {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3354);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3355)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3356)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3357);LOGGER.info("      Local axiom:       {}", minusOntologyURI(ax.toString()));
                    }
                }}
            }}
            }__CLR4_5_22gv2gvlvicm093.R.inc(3358);q2.removeAll(q2remove);
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3359);return mod;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * This method enriches a module that contains only logical axioms with all
     * necessary entity declaration axioms, entity annotation axioms, and axiom
     * annotation axioms. The module and enriched module are represented as sets
     * of axioms.
     * 
     * @param module
     *        a set of axioms representing the original module
     * @param sig
     *        a set of entities representing the signature of the original
     *        module
     * @param verbose
     *        a flag for verbose output (test purposes)
     * @return a set of axioms representing the enriched module
     */
    @Nonnull
        Set<OWLAxiom> enrich(@Nonnull Set<OWLAxiom> module, @Nonnull Set<OWLEntity> sig, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3360);
        __CLR4_5_22gv2gvlvicm093.R.inc(3361);Set<OWLAxiom> enrichedModule = new HashSet<>(module);
        __CLR4_5_22gv2gvlvicm093.R.inc(3362);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3363)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3364)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3365);LOGGER.info("\nEnriching with declaration axioms, annotation axioms, same/different individual axioms ...");
        }
        // Adding all entity declaration axioms
        // Adding all entity annotation axioms
        }__CLR4_5_22gv2gvlvicm093.R.inc(3366);for (OWLEntity entity : sig) {{
            assert (((entity != null)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3367)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3368)==0&false));
            __CLR4_5_22gv2gvlvicm093.R.inc(3369);Set<OWLDeclarationAxiom> declarationAxioms = ontology.getDeclarationAxioms(entity);
            __CLR4_5_22gv2gvlvicm093.R.inc(3370);enrichedModule.addAll(declarationAxioms);
            __CLR4_5_22gv2gvlvicm093.R.inc(3371);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3372)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3373)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3374);for (OWLDeclarationAxiom declarationAxiom : declarationAxioms) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3375);LOGGER.info("  Added entity declaration axiom:   {}", minusOntologyURI(declarationAxiom
                        .toString()));
                }
            }}
        }}
        }__CLR4_5_22gv2gvlvicm093.R.inc(3376);Set<IRI> iris = new HashSet<>(sig.size());
        __CLR4_5_22gv2gvlvicm093.R.inc(3377);for (OWLEntity i : sig) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3378);iris.add(i.getIRI());
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3379);for (OWLAnnotationAssertionAxiom annotation : ontology.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3380);if ((((iris.contains(annotation.getSubject()))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3381)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3382)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3383);enrichedModule.add(annotation);
                __CLR4_5_22gv2gvlvicm093.R.inc(3384);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3385)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3386)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3387);LOGGER.info("  Added entity annotation axiom:   {}", minusOntologyURI(annotation.toString()));
                }
            }}
        }}
        // Adding all same-individuals axioms
        // Adding all different-individuals axioms
        }__CLR4_5_22gv2gvlvicm093.R.inc(3388);for (OWLEntity entity : sig) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3389);if ((((OWLNamedIndividual.class.isAssignableFrom(entity.getClass()))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3390)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3391)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3392);OWLIndividual individual = (OWLIndividual) entity;
                __CLR4_5_22gv2gvlvicm093.R.inc(3393);Set<OWLSameIndividualAxiom> sameIndividualAxioms = ontology.getSameIndividualAxioms(individual);
                __CLR4_5_22gv2gvlvicm093.R.inc(3394);enrichedModule.addAll(sameIndividualAxioms);
                __CLR4_5_22gv2gvlvicm093.R.inc(3395);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3396)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3397)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3398);for (OWLSameIndividualAxiom sameIndividualAxiom : sameIndividualAxioms) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3399);LOGGER.info("  Added same individual axiom:   {}", minusOntologyURI(sameIndividualAxiom
                            .toString()));
                    }
                }}
                }__CLR4_5_22gv2gvlvicm093.R.inc(3400);Set<OWLDifferentIndividualsAxiom> differentIndividualAxioms = ontology.getDifferentIndividualAxioms(
                    individual);
                __CLR4_5_22gv2gvlvicm093.R.inc(3401);enrichedModule.addAll(differentIndividualAxioms);
                __CLR4_5_22gv2gvlvicm093.R.inc(3402);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3403)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3404)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3405);for (OWLDifferentIndividualsAxiom differentIndividualsAxiom : differentIndividualAxioms) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3406);LOGGER.info("  Added different individual axiom:   {}", minusOntologyURI(
                            differentIndividualsAxiom.toString()));
                    }
                }}
            }}
        }}
        }__CLR4_5_22gv2gvlvicm093.R.inc(3407);return enrichedModule;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Minus ontology uri.
     * 
     * @param s
     *        the s
     * @return the string
     */
    @Nonnull
        String minusOntologyURI(@Nonnull String s) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3408);
        __CLR4_5_22gv2gvlvicm093.R.inc(3409);String uri = ((((rootOntology == null )&&(__CLR4_5_22gv2gvlvicm093.R.iget(3410)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3411)==0&false))? "" : rootOntology.toString()) + "#";
        __CLR4_5_22gv2gvlvicm093.R.inc(3412);return s.replace(uri, "").replace("<", "").replace(">", "");
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Output signature.
     * 
     * @param preamble
     *        the preamble
     * @param sig
     *        the sig
     * @param verbose
     *        the verbose
     */
    void outputSignature(@Nonnull String preamble, @Nonnull Set<OWLEntity> sig, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3413);
        __CLR4_5_22gv2gvlvicm093.R.inc(3414);if ((((verbose)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3415)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3416)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3417);LOGGER.info(preamble);
            __CLR4_5_22gv2gvlvicm093.R.inc(3418);for (OWLEntity ent : sig) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3419);LOGGER.info("  {}", minusOntologyURI(ent.toString()));
            }
        }}
    }}finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Extract unnested module.
     * 
     * @param sig
     *        the sig
     * @param cls
     *        the cls
     * @param verbose
     *        the verbose
     * @return the sets the
     */
    @Nonnull
        Set<OWLAxiom> extractUnnestedModule(@Nonnull Set<OWLEntity> sig, @Nonnull LocalityClass cls, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3420);
        __CLR4_5_22gv2gvlvicm093.R.inc(3421);outputSignature("\nExtracting " + cls + " module for the following seed signature ... ", sig, verbose);
        __CLR4_5_22gv2gvlvicm093.R.inc(3422);boolean[] subOnt = ontologyAxiomSet.getSubset(true);
        __CLR4_5_22gv2gvlvicm093.R.inc(3423);Set<OWLEntity> signature = new HashSet<>(sig);
        __CLR4_5_22gv2gvlvicm093.R.inc(3424);boolean[] module = extractLogicalAxioms(subOnt, signature, cls, verbose);
        __CLR4_5_22gv2gvlvicm093.R.inc(3425);Set<OWLAxiom> moduleAsSet = ontologyAxiomSet.toSet(module);
        __CLR4_5_22gv2gvlvicm093.R.inc(3426);return enrich(moduleAsSet, signature, verbose);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Super or sub classes.
     * 
     * @param superOrSubClassLevel
     *        the super or sub class level
     * @param superVsSub
     *        the super vs sub
     * @param reasoner
     *        the reasoner
     * @param classesInSig
     *        the classes in sig
     * @return the sets the
     */
    @Nonnull
    static Set<OWLClass> SuperOrSubClasses(int superOrSubClassLevel, boolean superVsSub, @Nonnull OWLReasoner reasoner,
        @Nonnull Set<OWLClass> classesInSig) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3427);
        __CLR4_5_22gv2gvlvicm093.R.inc(3428);Set<OWLClass> superOrSubClasses = new HashSet<>();
        __CLR4_5_22gv2gvlvicm093.R.inc(3429);if ((((superOrSubClassLevel < 0)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3430)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3431)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3432);for (OWLClassExpression ent : classesInSig) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3433);NodeSet<OWLClass> nodes;
                __CLR4_5_22gv2gvlvicm093.R.inc(3434);if ((((superVsSub)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3435)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3436)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3437);nodes = reasoner.getSuperClasses(ent, false);
                } }else {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3438);nodes = reasoner.getSubClasses(ent, false);
                }
                }__CLR4_5_22gv2gvlvicm093.R.inc(3439);superOrSubClasses.addAll(nodes.getFlattened());
            }
        }} }else {__CLR4_5_22gv2gvlvicm093.R.inc(3440);if ((((superOrSubClassLevel > 0)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3441)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3442)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3443);Queue<OWLClass> toBeSuClassedNow;
            __CLR4_5_22gv2gvlvicm093.R.inc(3444);Queue<OWLClass> toBeSuClassedNext = new LinkedList<>(classesInSig);
            __CLR4_5_22gv2gvlvicm093.R.inc(3445);Queue<OWLClass> suClassesToBeAdded = new LinkedList<>();
            __CLR4_5_22gv2gvlvicm093.R.inc(3446);for (int i = 0; (((i < superOrSubClassLevel)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3447)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3448)==0&false)); i++) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3449);toBeSuClassedNow = toBeSuClassedNext;
                __CLR4_5_22gv2gvlvicm093.R.inc(3450);toBeSuClassedNext = new LinkedList<>();
                __CLR4_5_22gv2gvlvicm093.R.inc(3451);for (OWLClassExpression ce : toBeSuClassedNow) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3452);Set<OWLClass> suClasses;
                    __CLR4_5_22gv2gvlvicm093.R.inc(3453);if ((((superVsSub)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3454)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3455)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3456);suClasses = reasoner.getSuperClasses(ce, true).getFlattened();
                    } }else {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3457);suClasses = reasoner.getSubClasses(ce, true).getFlattened();
                    }
                    }__CLR4_5_22gv2gvlvicm093.R.inc(3458);for (OWLClass suClass : suClasses) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3459);if ((((!classesInSig.contains(suClass) && !suClassesToBeAdded.contains(suClass))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3460)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3461)==0&false))) {{
                            __CLR4_5_22gv2gvlvicm093.R.inc(3462);toBeSuClassedNext.add(suClass);
                            __CLR4_5_22gv2gvlvicm093.R.inc(3463);suClassesToBeAdded.add(suClass);
                        }
                    }}
                }}
            }}
            }__CLR4_5_22gv2gvlvicm093.R.inc(3464);superOrSubClasses.addAll(suClassesToBeAdded);
        }
        }}__CLR4_5_22gv2gvlvicm093.R.inc(3465);return superOrSubClasses;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Enrich signature.
     * 
     * @param sig
     *        the sig
     * @param superClassLevel
     *        the super class level
     * @param subClassLevel
     *        the sub class level
     * @param reasoner
     *        the reasoner
     * @return the sets the
     */
    @Nonnull
        Set<OWLEntity> enrichSignature(@Nonnull Set<OWLEntity> sig, int superClassLevel, int subClassLevel,
            OWLReasoner reasoner) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3466);
        __CLR4_5_22gv2gvlvicm093.R.inc(3467);Set<OWLEntity> enrichedSig = new HashSet<>(sig);
        __CLR4_5_22gv2gvlvicm093.R.inc(3468);Set<OWLClass> classesInSig = new HashSet<>();
        __CLR4_5_22gv2gvlvicm093.R.inc(3469);for (OWLEntity ent : sig) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3470);if ((((OWLClass.class.isAssignableFrom(ent.getClass()))&&(__CLR4_5_22gv2gvlvicm093.R.iget(3471)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3472)==0&false))) {{
                __CLR4_5_22gv2gvlvicm093.R.inc(3473);classesInSig.add((OWLClass) ent);
            }
        }}
        }__CLR4_5_22gv2gvlvicm093.R.inc(3474);if ((((superClassLevel != 0)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3475)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3476)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3477);enrichedSig.addAll(SuperOrSubClasses(superClassLevel, true, reasoner, classesInSig));
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3478);if ((((subClassLevel != 0)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3479)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3480)==0&false))) {{
            __CLR4_5_22gv2gvlvicm093.R.inc(3481);enrichedSig.addAll(SuperOrSubClasses(subClassLevel, false, reasoner, classesInSig));
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3482);return enrichedSig;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> extract(Set<OWLEntity> signature) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3483);
        __CLR4_5_22gv2gvlvicm093.R.inc(3484);return extract(signature, 0, 0, null, false);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> extract(Set<OWLEntity> signature, int superClassLevel, int subClassLevel,
        OWLReasoner reasoner) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3485);
        __CLR4_5_22gv2gvlvicm093.R.inc(3486);return extract(signature, superClassLevel, subClassLevel, reasoner, false);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Extracts a module from the associated ontology for a given signature and
     * the associated module type, and returns the module as a set of axioms.
     * The seed signature (set of entities) which determines the module is the
     * specified signature plus possibly all superclasses and/or subclasses of
     * the classes therein. Sub-/superclasses are determined using the specified
     * reasoner. The module will include annotation and declaration axioms for
     * all entities and axioms in it.
     * 
     * @param sig
     *        the seed signature (set of entities) for the module
     * @param superClassLevel
     *        determines whether superclasses are added to the signature before
     *        segment extraction, see below for admissible values
     * @param subClassLevel
     *        determines whether subclasses are added to the signature before
     *        segment extraction<br>
     *        Admissible values for superClassLevel (analogously for
     *        subClassLevel):
     *        <ul>
     *        <li>If superClassLevel greater than 0, then all classes C are
     *        included for which the class hierarchy computed by the reasoner
     *        contains a path of length at most superClassLevel downwards from C
     *        to some class from the signature.</li>
     *        <li>If superClassLevel = 0, then no super-/subclasses are added.
     *        </li>
     *        <li>If superClassLevel lesser than 0, then all direct and indirect
     *        super-/subclasses of any class in the signature are added.</li>
     *        </ul>
     * @param reasoner
     *        the reasoner to determine super-/subclasses. This can be an
     *        arbitrary reasoner, including a ToldClassHierarchyReasoner. It
     *        must have loaded the ontology. Can be null if superClassLevel and
     *        subClassLevel are 0.
     * @param verbose
     *        true if verbose output is required
     * @return the module
     */
    @Nonnull
    public Set<OWLAxiom> extract(@Nonnull Set<OWLEntity> sig, int superClassLevel, int subClassLevel,
        OWLReasoner reasoner, boolean verbose) {try{__CLR4_5_22gv2gvlvicm093.R.inc(3487);
        __CLR4_5_22gv2gvlvicm093.R.inc(3488);Set<OWLEntity> enrichedSig = enrichSignature(sig, superClassLevel, subClassLevel, reasoner);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_22gv2gvlvicm093.R.inc(3489);switch (moduleType) {
            case TOP:if (!__CLB4_5_2_bool0) {__CLR4_5_22gv2gvlvicm093.R.inc(3490);__CLB4_5_2_bool0=true;}
                __CLR4_5_22gv2gvlvicm093.R.inc(3491);return extractUnnestedModule(enrichedSig, LocalityClass.TOP_TOP, verbose);
            case BOT:if (!__CLB4_5_2_bool0) {__CLR4_5_22gv2gvlvicm093.R.inc(3492);__CLB4_5_2_bool0=true;}
                __CLR4_5_22gv2gvlvicm093.R.inc(3493);return extractUnnestedModule(enrichedSig, LocalityClass.BOTTOM_BOTTOM, verbose);
            case STAR:if (!__CLB4_5_2_bool0) {__CLR4_5_22gv2gvlvicm093.R.inc(3494);__CLB4_5_2_bool0=true;}
                __CLR4_5_22gv2gvlvicm093.R.inc(3495);boolean[] subOnt = ontologyAxiomSet.getSubset(true);
                __CLR4_5_22gv2gvlvicm093.R.inc(3496);boolean nextStepNecessary = true;
                __CLR4_5_22gv2gvlvicm093.R.inc(3497);boolean inFirstStep = true;
                __CLR4_5_22gv2gvlvicm093.R.inc(3498);LocalityClass localityClass = LocalityClass.BOTTOM_BOTTOM;
                __CLR4_5_22gv2gvlvicm093.R.inc(3499);Set<OWLEntity> seedSig = new HashSet<>(enrichedSig);
                __CLR4_5_22gv2gvlvicm093.R.inc(3500);while ((((nextStepNecessary)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3501)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3502)==0&false))) {{
                    __CLR4_5_22gv2gvlvicm093.R.inc(3503);outputSignature("\nExtracting " + localityClass + " module for the following seed signature: ",
                        enrichedSig, verbose);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3504);int previousModuleSize = ontologyAxiomSet.subsetCardinality(subOnt);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3505);seedSig = new HashSet<>(enrichedSig);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3506);subOnt = extractLogicalAxioms(subOnt, seedSig, localityClass, verbose);
                    __CLR4_5_22gv2gvlvicm093.R.inc(3507);if ((((ontologyAxiomSet.subsetCardinality(subOnt) == previousModuleSize && !inFirstStep)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3508)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3509)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3510);nextStepNecessary = false;
                    }
                    }__CLR4_5_22gv2gvlvicm093.R.inc(3511);inFirstStep = false;
                    __CLR4_5_22gv2gvlvicm093.R.inc(3512);if ((((localityClass == LocalityClass.BOTTOM_BOTTOM)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3513)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3514)==0&false))) {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3515);localityClass = LocalityClass.TOP_TOP;
                    } }else {{
                        __CLR4_5_22gv2gvlvicm093.R.inc(3516);localityClass = LocalityClass.BOTTOM_BOTTOM;
                    }
                }}
                }__CLR4_5_22gv2gvlvicm093.R.inc(3517);Set<OWLAxiom> moduleAsSet = ontologyAxiomSet.toSet(subOnt);
                __CLR4_5_22gv2gvlvicm093.R.inc(3518);return enrich(moduleAsSet, seedSig, verbose);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_22gv2gvlvicm093.R.inc(3519);__CLB4_5_2_bool0=true;}
                __CLR4_5_22gv2gvlvicm093.R.inc(3520);throw new OWLRuntimeException("Unsupported module type: " + moduleType);
        }
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    @Override
    public OWLOntology extractAsOntology(Set<OWLEntity> signature, IRI iri) throws OWLOntologyCreationException {try{__CLR4_5_22gv2gvlvicm093.R.inc(3521);
        __CLR4_5_22gv2gvlvicm093.R.inc(3522);return extractAsOntology(signature, iri, 0, 0, null, false);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    @Override
    public OWLOntology extractAsOntology(Set<OWLEntity> signature, IRI iri, int superClassLevel, int subClassLevel,
        OWLReasoner reasoner) throws OWLOntologyCreationException {try{__CLR4_5_22gv2gvlvicm093.R.inc(3523);
        __CLR4_5_22gv2gvlvicm093.R.inc(3524);return extractAsOntology(signature, iri, superClassLevel, subClassLevel, reasoner, false);
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}

    /**
     * Extract as ontology.
     * 
     * @param signature
     *        the signature
     * @param iri
     *        the iri
     * @param superClassLevel
     *        the super class level
     * @param subClassLevel
     *        the sub class level
     * @param reasoner
     *        the reasoner
     * @param verbose
     *        the verbose
     * @return the oWL ontology
     * @throws OWLOntologyCreationException
     *         the oWL ontology creation exception
     */
    @Nonnull
        OWLOntology extractAsOntology(@Nonnull Set<OWLEntity> signature, @Nonnull IRI iri, int superClassLevel,
            int subClassLevel, OWLReasoner reasoner, boolean verbose) throws OWLOntologyCreationException {try{__CLR4_5_22gv2gvlvicm093.R.inc(3525);
        __CLR4_5_22gv2gvlvicm093.R.inc(3526);Set<OWLAxiom> axs = extract(signature, superClassLevel, subClassLevel, reasoner, verbose);
        __CLR4_5_22gv2gvlvicm093.R.inc(3527);OWLOntology newOnt = manager.createOntology(iri);
        __CLR4_5_22gv2gvlvicm093.R.inc(3528);LinkedList<AddAxiom> addaxs = new LinkedList<>();
        __CLR4_5_22gv2gvlvicm093.R.inc(3529);for (OWLAxiom ax : axs) {{
            assert (((ax != null)&&(__CLR4_5_22gv2gvlvicm093.R.iget(3530)!=0|true))||(__CLR4_5_22gv2gvlvicm093.R.iget(3531)==0&false));
            __CLR4_5_22gv2gvlvicm093.R.inc(3532);addaxs.add(new AddAxiom(newOnt, ax));
        }
        }__CLR4_5_22gv2gvlvicm093.R.inc(3533);manager.applyChanges(addaxs);
        __CLR4_5_22gv2gvlvicm093.R.inc(3534);return newOnt;
    }finally{__CLR4_5_22gv2gvlvicm093.R.flushNeeded();}}
}
