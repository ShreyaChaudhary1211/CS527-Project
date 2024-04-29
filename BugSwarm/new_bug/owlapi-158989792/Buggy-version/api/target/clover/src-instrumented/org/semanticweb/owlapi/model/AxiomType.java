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
package org.semanticweb.owlapi.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.util.CollectionFactory;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * Represents the type of axioms which can belong to ontologies. Axioms can be
 * retrieved from ontologies by their {@code AxiomType}. For example, see
 * {@link org.semanticweb.owlapi.model.OWLOntology#getAxioms(AxiomType)} and
 * {@link org.semanticweb.owlapi.model.OWLOntology#getAxiomCount(AxiomType, org.semanticweb.owlapi.model.parameters.Imports)}
 * .
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 * @param <C>
 *        axiom type
 */
@SuppressWarnings({ "unchecked" })
public final class AxiomType<C extends OWLAxiom> implements Serializable {public static class __CLR4_5_21of1oflvicklrd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final String name;
    private final boolean owl2Axiom;
    private final boolean nonSyntacticOWL2Axiom;
    private final boolean isLogical;
    private final int index;
    private final Class<C> actualClass;

    private AxiomType(Class<C> actualClass, int ind, String name, boolean owl2Axiom, boolean nonSyntacticOWL2Axiom,
        boolean isLogical) {try{__CLR4_5_21of1oflvicklrd.R.inc(2175);
        __CLR4_5_21of1oflvicklrd.R.inc(2176);this.actualClass = actualClass;
        __CLR4_5_21of1oflvicklrd.R.inc(2177);this.name = name;
        __CLR4_5_21of1oflvicklrd.R.inc(2178);this.owl2Axiom = owl2Axiom;
        __CLR4_5_21of1oflvicklrd.R.inc(2179);this.nonSyntacticOWL2Axiom = nonSyntacticOWL2Axiom;
        __CLR4_5_21of1oflvicklrd.R.inc(2180);this.isLogical = isLogical;
        __CLR4_5_21of1oflvicklrd.R.inc(2181);index = ind;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    @Nonnull
    private static <O extends OWLAxiom> AxiomType<O> getInstance(Class<O> c, int i, String name, boolean owl2Axiom,
        boolean nonSyntacticOWL2Axiom, boolean isLogical) {try{__CLR4_5_21of1oflvicklrd.R.inc(2182);
        __CLR4_5_21of1oflvicklrd.R.inc(2183);return new AxiomType<>(c, i, name, owl2Axiom, nonSyntacticOWL2Axiom, isLogical);
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21of1oflvicklrd.R.inc(2184);
        __CLR4_5_21of1oflvicklrd.R.inc(2185);return name;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * @return the axiom interface corresponding to this type
     */
    public Class<C> getActualClass() {try{__CLR4_5_21of1oflvicklrd.R.inc(2186);
        __CLR4_5_21of1oflvicklrd.R.inc(2187);return actualClass;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Determines if this axiom is structurally an OWL 2 axiom.
     * 
     * @return {@code true} if this axiom is an OWL 2 axiom, {@code false} if
     *         this axiom is not an OWL 2 axiom and it can be represented using
     *         OWL 1.
     */
    public boolean isOWL2Axiom() {try{__CLR4_5_21of1oflvicklrd.R.inc(2188);
        __CLR4_5_21of1oflvicklrd.R.inc(2189);return owl2Axiom;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Some OWL 2 axioms, for example,
     * {@link org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom}
     * axioms are structurally OWL 2 axioms, but can be represented using OWL 1
     * syntax. This method determines if this axiom type is a pure OWL 2 axiom
     * and cannot be represented using OWL 1 syntax.
     * 
     * @return {@code true} if this axiom is a pure OWL 2 axiom and cannot be
     *         represented using OWL 1 syntax, otherwise {@code false}.
     */
    public boolean isNonSyntacticOWL2Axiom() {try{__CLR4_5_21of1oflvicklrd.R.inc(2190);
        __CLR4_5_21of1oflvicklrd.R.inc(2191);return nonSyntacticOWL2Axiom;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * @return index in the axiom type list
     */
    public int getIndex() {try{__CLR4_5_21of1oflvicklrd.R.inc(2192);
        __CLR4_5_21of1oflvicklrd.R.inc(2193);return index;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * @return axiom type name
     */
    public String getName() {try{__CLR4_5_21of1oflvicklrd.R.inc(2194);
        __CLR4_5_21of1oflvicklrd.R.inc(2195);return name;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Determines if this axiom type is a logical axiom type.
     * 
     * @return {@code true} if this axiom type is a logical axiom type,
     *         otherwise false;
     */
    public boolean isLogical() {try{__CLR4_5_21of1oflvicklrd.R.inc(2196);
        __CLR4_5_21of1oflvicklrd.R.inc(2197);return isLogical;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Gets the set of axioms from a source set of axioms that are not of the
     * specified type
     * 
     * @param sourceAxioms
     *        The source set of axioms
     * @param axiomTypes
     *        The types that will be filtered out of the source set
     * @return A set of axioms that represents the sourceAxioms without the
     *         specified types. Note that sourceAxioms will not be modified. The
     *         returned set is a copy.
     */
    @Nonnull
    public static Set<OWLAxiom> getAxiomsWithoutTypes(@Nonnull Set<OWLAxiom> sourceAxioms,
        @Nonnull AxiomType<?>... axiomTypes) {try{__CLR4_5_21of1oflvicklrd.R.inc(2198);
        __CLR4_5_21of1oflvicklrd.R.inc(2199);Set<OWLAxiom> result = new HashSet<>();
        __CLR4_5_21of1oflvicklrd.R.inc(2200);Set<AxiomType<?>> disallowed = Sets.newHashSet(axiomTypes);
        __CLR4_5_21of1oflvicklrd.R.inc(2201);for (OWLAxiom ax : sourceAxioms) {{
            __CLR4_5_21of1oflvicklrd.R.inc(2202);if ((((!disallowed.contains(ax.getAxiomType()))&&(__CLR4_5_21of1oflvicklrd.R.iget(2203)!=0|true))||(__CLR4_5_21of1oflvicklrd.R.iget(2204)==0&false))) {{
                __CLR4_5_21of1oflvicklrd.R.inc(2205);result.add(ax);
            }
        }}
        }__CLR4_5_21of1oflvicklrd.R.inc(2206);return result;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Gets the set of axioms from a source set of axioms that have a specified
     * type
     * 
     * @param sourceAxioms
     *        The source set of axioms
     * @param axiomTypes
     *        The types of axioms that will be returned
     * @return A set of axioms that represents the sourceAxioms that have the
     *         specified types. Note that sourceAxioms will not be modified. The
     *         returned set is a copy.
     */
    @Nonnull
    public static Set<OWLAxiom> getAxiomsOfTypes(@Nonnull Set<OWLAxiom> sourceAxioms,
        @Nonnull AxiomType<?>... axiomTypes) {try{__CLR4_5_21of1oflvicklrd.R.inc(2207);
        __CLR4_5_21of1oflvicklrd.R.inc(2208);Set<OWLAxiom> result = new HashSet<>();
        __CLR4_5_21of1oflvicklrd.R.inc(2209);Set<AxiomType<?>> allowed = Sets.newHashSet(axiomTypes);
        __CLR4_5_21of1oflvicklrd.R.inc(2210);for (OWLAxiom ax : sourceAxioms) {{
            __CLR4_5_21of1oflvicklrd.R.inc(2211);if ((((allowed.contains(ax.getAxiomType()))&&(__CLR4_5_21of1oflvicklrd.R.iget(2212)!=0|true))||(__CLR4_5_21of1oflvicklrd.R.iget(2213)==0&false))) {{
                __CLR4_5_21of1oflvicklrd.R.inc(2214);result.add(ax);
            }
        }}
        }__CLR4_5_21of1oflvicklrd.R.inc(2215);return result;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Gets an axiom type by its name
     * 
     * @param name
     *        The name of the axiom type
     * @return The axiom type with the specified name, or {@code null} if there
     *         is no such axiom type with the specified name
     */
    public static AxiomType<?> getAxiomType(String name) {try{__CLR4_5_21of1oflvicklrd.R.inc(2216);
        __CLR4_5_21of1oflvicklrd.R.inc(2217);return NAME_TYPE_MAP.get(name);
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

    /**
     * Determines if there is an axiom type with the specified name
     * 
     * @param _name
     *        The name to test for
     * @return {@code true} if there is an axiom type with the specified name,
     *         or {@code false} if there is no axiom type with the specified
     *         name.
     */
    public static boolean isAxiomType(String _name) {try{__CLR4_5_21of1oflvicklrd.R.inc(2218);
        __CLR4_5_21of1oflvicklrd.R.inc(2219);return NAME_TYPE_MAP.containsKey(_name);
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

//@formatter:off
    /** Declaration */                      @Nonnull public static final AxiomType<OWLDeclarationAxiom>                      DECLARATION                         = getInstance(OWLDeclarationAxiom.class,                     0, "Declaration",                      true, true, false);

    /** EquivalentClasses */                @Nonnull public static final AxiomType<OWLEquivalentClassesAxiom>                EQUIVALENT_CLASSES                  = getInstance(OWLEquivalentClassesAxiom.class,               1, "EquivalentClasses",                false, false, true);
    /** SubClassOf */                       @Nonnull public static final AxiomType<OWLSubClassOfAxiom>                       SUBCLASS_OF                         = getInstance(OWLSubClassOfAxiom.class,                      2, "SubClassOf",                       false, false, true);
    /** DisjointClasses */                  @Nonnull public static final AxiomType<OWLDisjointClassesAxiom>                  DISJOINT_CLASSES                    = getInstance(OWLDisjointClassesAxiom.class,                 3, "DisjointClasses",                  false, false, true);
    /** DisjointUnion */                    @Nonnull public static final AxiomType<OWLDisjointUnionAxiom>                    DISJOINT_UNION                      = getInstance(OWLDisjointUnionAxiom.class,                   4, "DisjointUnion",                    true, false, true);

    /** ClassAssertion */                   @Nonnull public static final AxiomType<OWLClassAssertionAxiom>                   CLASS_ASSERTION                     = getInstance(OWLClassAssertionAxiom.class,                  5, "ClassAssertion",                   false, false, true);
    /** SameIndividual */                   @Nonnull public static final AxiomType<OWLSameIndividualAxiom>                   SAME_INDIVIDUAL                     = getInstance(OWLSameIndividualAxiom.class,                  6, "SameIndividual",                   false, false, true);
    /** DifferentIndividuals */             @Nonnull public static final AxiomType<OWLDifferentIndividualsAxiom>             DIFFERENT_INDIVIDUALS               = getInstance(OWLDifferentIndividualsAxiom.class,            7, "DifferentIndividuals",             false, false, true);
    /** ObjectPropertyAssertion */          @Nonnull public static final AxiomType<OWLObjectPropertyAssertionAxiom>          OBJECT_PROPERTY_ASSERTION           = getInstance(OWLObjectPropertyAssertionAxiom.class,         8, "ObjectPropertyAssertion",          false, false, true);
    /** NegativeObjectPropertyAssertion */  @Nonnull public static final AxiomType<OWLNegativeObjectPropertyAssertionAxiom>  NEGATIVE_OBJECT_PROPERTY_ASSERTION  = getInstance(OWLNegativeObjectPropertyAssertionAxiom.class, 9, "NegativeObjectPropertyAssertion",  true, false, true);
    /** DataPropertyAssertion */            @Nonnull public static final AxiomType<OWLDataPropertyAssertionAxiom>            DATA_PROPERTY_ASSERTION             = getInstance(OWLDataPropertyAssertionAxiom.class,           10, "DataPropertyAssertion",           false, false, true);
    /** NegativeDataPropertyAssertion */    @Nonnull public static final AxiomType<OWLNegativeDataPropertyAssertionAxiom>    NEGATIVE_DATA_PROPERTY_ASSERTION    = getInstance(OWLNegativeDataPropertyAssertionAxiom.class,   11, "NegativeDataPropertyAssertion",   true, false, true);

    /** EquivalentObjectProperties */       @Nonnull public static final AxiomType<OWLEquivalentObjectPropertiesAxiom>       EQUIVALENT_OBJECT_PROPERTIES        = getInstance(OWLEquivalentObjectPropertiesAxiom.class,      12, "EquivalentObjectProperties",      false, false, true);
    /** SubObjectPropertyOf */              @Nonnull public static final AxiomType<OWLSubObjectPropertyOfAxiom>              SUB_OBJECT_PROPERTY                 = getInstance(OWLSubObjectPropertyOfAxiom.class,             13, "SubObjectPropertyOf",             false, false, true);
    /** InverseObjectProperties */          @Nonnull public static final AxiomType<OWLInverseObjectPropertiesAxiom>          INVERSE_OBJECT_PROPERTIES           = getInstance(OWLInverseObjectPropertiesAxiom.class,         14, "InverseObjectProperties",         false, false, true);
    /** FunctionalObjectProperty */         @Nonnull public static final AxiomType<OWLFunctionalObjectPropertyAxiom>         FUNCTIONAL_OBJECT_PROPERTY          = getInstance(OWLFunctionalObjectPropertyAxiom.class,        15, "FunctionalObjectProperty",        false, false, true);
    /** InverseFunctionalObjectProperty */  @Nonnull public static final AxiomType<OWLInverseFunctionalObjectPropertyAxiom>  INVERSE_FUNCTIONAL_OBJECT_PROPERTY  = getInstance(OWLInverseFunctionalObjectPropertyAxiom.class, 16, "InverseFunctionalObjectProperty", false, false, true);
    /** SymmetricObjectProperty */          @Nonnull public static final AxiomType<OWLSymmetricObjectPropertyAxiom>          SYMMETRIC_OBJECT_PROPERTY           = getInstance(OWLSymmetricObjectPropertyAxiom.class,         17, "SymmetricObjectProperty",         false, false, true);
    /** AsymmetricObjectProperty */         @Nonnull public static final AxiomType<OWLAsymmetricObjectPropertyAxiom>         ASYMMETRIC_OBJECT_PROPERTY          = getInstance(OWLAsymmetricObjectPropertyAxiom.class,        18, "AsymmetricObjectProperty",        true, true, true);
    /** TransitiveObjectProperty */         @Nonnull public static final AxiomType<OWLTransitiveObjectPropertyAxiom>         TRANSITIVE_OBJECT_PROPERTY          = getInstance(OWLTransitiveObjectPropertyAxiom.class,        19, "TransitiveObjectProperty",        false, false, true);
    /** ReflexiveObjectProperty */          @Nonnull public static final AxiomType<OWLReflexiveObjectPropertyAxiom>          REFLEXIVE_OBJECT_PROPERTY           = getInstance(OWLReflexiveObjectPropertyAxiom.class,         20, "ReflexiveObjectProperty",         true, true, true);
    /** IrreflexiveObjectProperty */        @Nonnull public static final AxiomType<OWLIrreflexiveObjectPropertyAxiom>        IRREFLEXIVE_OBJECT_PROPERTY         = getInstance(OWLIrreflexiveObjectPropertyAxiom.class,       21, "IrrefexiveObjectProperty",        true, true, true);
    /** ObjectPropertyDomain */             @Nonnull public static final AxiomType<OWLObjectPropertyDomainAxiom>             OBJECT_PROPERTY_DOMAIN              = getInstance(OWLObjectPropertyDomainAxiom.class,            22, "ObjectPropertyDomain",            false, false, true);
    /** ObjectPropertyRange */              @Nonnull public static final AxiomType<OWLObjectPropertyRangeAxiom>              OBJECT_PROPERTY_RANGE               = getInstance(OWLObjectPropertyRangeAxiom.class,             23, "ObjectPropertyRange",             false, false, true);
    /** DisjointObjectProperties */         @Nonnull public static final AxiomType<OWLDisjointObjectPropertiesAxiom>         DISJOINT_OBJECT_PROPERTIES          = getInstance(OWLDisjointObjectPropertiesAxiom.class,        24, "DisjointObjectProperties",        true, true, true);
    /** SubPropertyChainOf */               @Nonnull public static final AxiomType<OWLSubPropertyChainOfAxiom>               SUB_PROPERTY_CHAIN_OF               = getInstance(OWLSubPropertyChainOfAxiom.class,              25, "SubPropertyChainOf",              true, true, true);

    /** EquivalentDataProperties */         @Nonnull public static final AxiomType<OWLEquivalentDataPropertiesAxiom>         EQUIVALENT_DATA_PROPERTIES          = getInstance(OWLEquivalentDataPropertiesAxiom.class,        26, "EquivalentDataProperties",        false, false, true);
    /** SubDataPropertyOf */                @Nonnull public static final AxiomType<OWLSubDataPropertyOfAxiom>                SUB_DATA_PROPERTY                   = getInstance(OWLSubDataPropertyOfAxiom.class,               27, "SubDataPropertyOf",               false, false, true);
    /** FunctionalDataProperty */           @Nonnull public static final AxiomType<OWLFunctionalDataPropertyAxiom>           FUNCTIONAL_DATA_PROPERTY            = getInstance(OWLFunctionalDataPropertyAxiom.class,          28, "FunctionalDataProperty",          false, false, true);
    /** DataPropertyDomain */               @Nonnull public static final AxiomType<OWLDataPropertyDomainAxiom>               DATA_PROPERTY_DOMAIN                = getInstance(OWLDataPropertyDomainAxiom.class,              29, "DataPropertyDomain",              false, false, true);
    /** DataPropertyRange */                @Nonnull public static final AxiomType<OWLDataPropertyRangeAxiom>                DATA_PROPERTY_RANGE                 = getInstance(OWLDataPropertyRangeAxiom.class,               30, "DataPropertyRange",               false, false, true);
    /** DisjointDataProperties */           @Nonnull public static final AxiomType<OWLDisjointDataPropertiesAxiom>           DISJOINT_DATA_PROPERTIES            = getInstance(OWLDisjointDataPropertiesAxiom.class,          31, "DisjointDataProperties",          true, true, true);

    /** DatatypeDefinition */               @Nonnull public static final AxiomType<OWLDatatypeDefinitionAxiom>               DATATYPE_DEFINITION                 = getInstance(OWLDatatypeDefinitionAxiom.class,              38, "DatatypeDefinition",              true, true, true);

    /** HasKey */                           @Nonnull public static final AxiomType<OWLHasKeyAxiom>                           HAS_KEY                             = getInstance(OWLHasKeyAxiom.class,                          32, "HasKey",                          true, true, true);

    /** Rule */                             @Nonnull public static final AxiomType<SWRLRule>                                 SWRL_RULE                           = getInstance(SWRLRule.class,                                33, "Rule",                            false, false, true);

    /** AnnotationAssertion */              @Nonnull public static final AxiomType<OWLAnnotationAssertionAxiom>              ANNOTATION_ASSERTION                = getInstance(OWLAnnotationAssertionAxiom.class,             34, "AnnotationAssertion",             false, false, false);
    /** SubAnnotationPropertyOf */          @Nonnull public static final AxiomType<OWLSubAnnotationPropertyOfAxiom>          SUB_ANNOTATION_PROPERTY_OF          = getInstance(OWLSubAnnotationPropertyOfAxiom.class,         35, "SubAnnotationPropertyOf",         true, true, false);
    /** AnnotationPropertyRangeOf */        @Nonnull public static final AxiomType<OWLAnnotationPropertyRangeAxiom>          ANNOTATION_PROPERTY_RANGE           = getInstance(OWLAnnotationPropertyRangeAxiom.class,         36, "AnnotationPropertyRangeOf",       true, true, false);
    /** AnnotationPropertyDomain */         @Nonnull public static final AxiomType<OWLAnnotationPropertyDomainAxiom>         ANNOTATION_PROPERTY_DOMAIN          = getInstance(OWLAnnotationPropertyDomainAxiom.class,        37, "AnnotationPropertyDomain",        true, true, false);
  //@formatter:on
    /** axiom types */
    @Nonnull public static final Set<AxiomType<?>> AXIOM_TYPES = CollectionFactory.createSet(SUBCLASS_OF,
        EQUIVALENT_CLASSES, DISJOINT_CLASSES, CLASS_ASSERTION, SAME_INDIVIDUAL, DIFFERENT_INDIVIDUALS,
        OBJECT_PROPERTY_ASSERTION, NEGATIVE_OBJECT_PROPERTY_ASSERTION, DATA_PROPERTY_ASSERTION,
        NEGATIVE_DATA_PROPERTY_ASSERTION, OBJECT_PROPERTY_DOMAIN, OBJECT_PROPERTY_RANGE, DISJOINT_OBJECT_PROPERTIES,
        SUB_OBJECT_PROPERTY, EQUIVALENT_OBJECT_PROPERTIES, INVERSE_OBJECT_PROPERTIES, SUB_PROPERTY_CHAIN_OF,
        FUNCTIONAL_OBJECT_PROPERTY, INVERSE_FUNCTIONAL_OBJECT_PROPERTY, SYMMETRIC_OBJECT_PROPERTY,
        ASYMMETRIC_OBJECT_PROPERTY, TRANSITIVE_OBJECT_PROPERTY, REFLEXIVE_OBJECT_PROPERTY, IRREFLEXIVE_OBJECT_PROPERTY,
        DATA_PROPERTY_DOMAIN, DATA_PROPERTY_RANGE, DISJOINT_DATA_PROPERTIES, SUB_DATA_PROPERTY,
        EQUIVALENT_DATA_PROPERTIES, FUNCTIONAL_DATA_PROPERTY, DATATYPE_DEFINITION, DISJOINT_UNION, DECLARATION,
        SWRL_RULE, ANNOTATION_ASSERTION, SUB_ANNOTATION_PROPERTY_OF, ANNOTATION_PROPERTY_DOMAIN,
        ANNOTATION_PROPERTY_RANGE, HAS_KEY);
    private static final Map<String, AxiomType<?>> NAME_TYPE_MAP = Maps.uniqueIndex(AXIOM_TYPES,
        new Function<AxiomType<?>, String>() {

            @SuppressWarnings("null")
            @Override
            public String apply(AxiomType<?> input) {try{__CLR4_5_21of1oflvicklrd.R.inc(2220);
                __CLR4_5_21of1oflvicklrd.R.inc(2221);return input.getName();
            }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}
        });
    private static final Map<Class<?>, AxiomType<?>> CLASS_TYPE_MAP = Maps.uniqueIndex(AXIOM_TYPES,
        new Function<AxiomType<?>, Class<?>>() {

            @SuppressWarnings("null")
            @Override
            public Class<?> apply(AxiomType<?> input) {try{__CLR4_5_21of1oflvicklrd.R.inc(2222);
                __CLR4_5_21of1oflvicklrd.R.inc(2223);return input.getActualClass();
            }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}
        });

    /**
     * @param t
     *        axiom class to match
     * @param <T>
     *        axiom type
     * @return axiom type for axiom class
     */
    @Nonnull
    public static <T extends OWLAxiom> AxiomType<T> getTypeForClass(Class<T> t) {try{__CLR4_5_21of1oflvicklrd.R.inc(2224);
        __CLR4_5_21of1oflvicklrd.R.inc(2225);AxiomType<?> axiomType = CLASS_TYPE_MAP.get(t);
        __CLR4_5_21of1oflvicklrd.R.inc(2226);if ((((axiomType == null)&&(__CLR4_5_21of1oflvicklrd.R.iget(2227)!=0|true))||(__CLR4_5_21of1oflvicklrd.R.iget(2228)==0&false))) {{
            __CLR4_5_21of1oflvicklrd.R.inc(2229);throw new OWLRuntimeException("No known axiom type for " + t);
        }
        }__CLR4_5_21of1oflvicklrd.R.inc(2230);return (AxiomType<T>) axiomType;
    }finally{__CLR4_5_21of1oflvicklrd.R.flushNeeded();}}

//@formatter:off
    /** set of tbox axiom types */
    @Nonnull public static final Set<AxiomType<?>> TBoxAxiomTypes = CollectionFactory.createSet(
        (AxiomType<?>) SUBCLASS_OF, 
        EQUIVALENT_CLASSES, 
        DISJOINT_CLASSES, 
        OBJECT_PROPERTY_DOMAIN, 
        OBJECT_PROPERTY_RANGE,
        FUNCTIONAL_OBJECT_PROPERTY, 
        INVERSE_FUNCTIONAL_OBJECT_PROPERTY, 
        DATA_PROPERTY_DOMAIN, 
        DATA_PROPERTY_RANGE,
        FUNCTIONAL_DATA_PROPERTY, 
        DATATYPE_DEFINITION, 
        DISJOINT_UNION, 
        HAS_KEY);
    /** set of abox axiom types */
    @Nonnull public static final Set<AxiomType<?>> ABoxAxiomTypes = CollectionFactory.createSet(
        (AxiomType<?>) CLASS_ASSERTION, 
        SAME_INDIVIDUAL, 
        DIFFERENT_INDIVIDUALS, 
        OBJECT_PROPERTY_ASSERTION,
        NEGATIVE_OBJECT_PROPERTY_ASSERTION, 
        DATA_PROPERTY_ASSERTION, 
        NEGATIVE_DATA_PROPERTY_ASSERTION);
    /** set of rbox axiom types */
    @Nonnull public static final Set<AxiomType<?>> RBoxAxiomTypes = CollectionFactory.createSet(
        (AxiomType<?>) TRANSITIVE_OBJECT_PROPERTY, 
        DISJOINT_DATA_PROPERTIES, 
        SUB_DATA_PROPERTY,
        EQUIVALENT_DATA_PROPERTIES, 
        DISJOINT_OBJECT_PROPERTIES, 
        SUB_OBJECT_PROPERTY, 
        EQUIVALENT_OBJECT_PROPERTIES,
        SUB_PROPERTY_CHAIN_OF, 
        INVERSE_OBJECT_PROPERTIES, 
        SYMMETRIC_OBJECT_PROPERTY, 
        ASYMMETRIC_OBJECT_PROPERTY,
        REFLEXIVE_OBJECT_PROPERTY, 
        IRREFLEXIVE_OBJECT_PROPERTY);
    /** set of tbox and rbox axiom types */
    @Nonnull public static final Set<AxiomType<?>> TBoxAndRBoxAxiomTypes = Sets.newHashSet(Iterables.concat(
        TBoxAxiomTypes, RBoxAxiomTypes));
//@formatter:off
}
