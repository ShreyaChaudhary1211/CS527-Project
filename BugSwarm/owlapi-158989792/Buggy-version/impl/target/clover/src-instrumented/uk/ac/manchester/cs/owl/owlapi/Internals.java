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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.model.AxiomType.*;
import static org.semanticweb.owlapi.util.CollectionFactory.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static uk.ac.manchester.cs.owl.owlapi.InitVisitorFactory.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Navigation;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;
import org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

/**
 * @author ignazio
 */
public class Internals implements Serializable {public static class __CLR4_5_21af1aflviclf89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,2425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    private class ReferenceChecker implements OWLEntityVisitorEx<Boolean>, Serializable {

        private static final long serialVersionUID = 40000L;

        ReferenceChecker() {try{__CLR4_5_21af1aflviclf89.R.inc(1671);}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass cls) {try{__CLR4_5_21af1aflviclf89.R.inc(1672);
            __CLR4_5_21af1aflviclf89.R.inc(1673);return owlClassReferences.containsKey(cls);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(1674);
            __CLR4_5_21af1aflviclf89.R.inc(1675);return owlObjectPropertyReferences.containsKey(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(1676);
            __CLR4_5_21af1aflviclf89.R.inc(1677);return owlDataPropertyReferences.containsKey(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLNamedIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(1678);
            __CLR4_5_21af1aflviclf89.R.inc(1679);return owlIndividualReferences.containsKey(individual);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDatatype datatype) {try{__CLR4_5_21af1aflviclf89.R.inc(1680);
            __CLR4_5_21af1aflviclf89.R.inc(1681);return owlDatatypeReferences.containsKey(datatype);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLAnnotationProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(1682);
            __CLR4_5_21af1aflviclf89.R.inc(1683);return owlAnnotationPropertyReferences.containsKey(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
    }

    protected class SetPointer<K extends Serializable> implements Serializable {

        private static final long serialVersionUID = 40000L;
        @Nonnull
        private final Set<K> set = createSyncSet();

        public boolean isEmpty() {try{__CLR4_5_21af1aflviclf89.R.inc(1684);
            __CLR4_5_21af1aflviclf89.R.inc(1685);return set.isEmpty();
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Nonnull
        public Set<K> copy() {try{__CLR4_5_21af1aflviclf89.R.inc(1686);
            __CLR4_5_21af1aflviclf89.R.inc(1687);return CollectionFactory.getCopyOnRequestSetFromMutableCollection(set);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Nonnull
        public Iterable<K> iterable() {try{__CLR4_5_21af1aflviclf89.R.inc(1688);
            __CLR4_5_21af1aflviclf89.R.inc(1689);return set;
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        public boolean add(K k) {try{__CLR4_5_21af1aflviclf89.R.inc(1690);
            __CLR4_5_21af1aflviclf89.R.inc(1691);return set.add(k);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        public boolean contains(K k) {try{__CLR4_5_21af1aflviclf89.R.inc(1692);
            __CLR4_5_21af1aflviclf89.R.inc(1693);return set.contains(k);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        public boolean remove(K k) {try{__CLR4_5_21af1aflviclf89.R.inc(1694);
            __CLR4_5_21af1aflviclf89.R.inc(1695);return set.remove(k);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
    }

    //@formatter:off
    @Nonnull protected transient MapPointer<OWLClassExpression, OWLClassAssertionAxiom>                          classAssertionAxiomsByClass                         = buildLazy(CLASS_ASSERTION, CLASSEXPRESSIONS);
    @Nonnull protected transient MapPointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom>                   annotationAssertionAxiomsBySubject                  = buildLazy(ANNOTATION_ASSERTION, ANNOTSUPERNAMED);
    @Nonnull protected transient MapPointer<OWLClass, OWLSubClassOfAxiom>                                        subClassAxiomsBySubPosition                         = buildLazy(SUBCLASS_OF, CLASSSUBNAMED);
    @Nonnull protected transient MapPointer<OWLClass, OWLSubClassOfAxiom>                                        subClassAxiomsBySuperPosition                       = buildLazy(SUBCLASS_OF, CLASSSUPERNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom>            objectSubPropertyAxiomsBySubPosition                = buildLazy(SUB_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom>            objectSubPropertyAxiomsBySuperPosition              = buildLazy(SUB_OBJECT_PROPERTY, OPSUPERNAMED);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom>                dataSubPropertyAxiomsBySubPosition                  = buildLazy(SUB_DATA_PROPERTY, DPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom>                dataSubPropertyAxiomsBySuperPosition                = buildLazy(SUB_DATA_PROPERTY, DPSUPERNAMED);

    @Nonnull protected transient MapPointer<OWLClass, OWLClassAxiom>                                             classAxiomsByClass                                  = buildClassAxiomByClass();
    @Nonnull protected transient MapPointer<OWLClass, OWLEquivalentClassesAxiom>                                 equivalentClassesAxiomsByClass                      = buildLazy(EQUIVALENT_CLASSES, CLASSCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLClass, OWLDisjointClassesAxiom>                                   disjointClassesAxiomsByClass                        = buildLazy(DISJOINT_CLASSES, CLASSCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLClass, OWLDisjointUnionAxiom>                                     disjointUnionAxiomsByClass                          = buildLazy(DISJOINT_UNION, CLASSCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLClass, OWLHasKeyAxiom>                                            hasKeyAxiomsByClass                                 = buildLazy(HAS_KEY, CLASSSUPERNAMED);

    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLEquivalentObjectPropertiesAxiom>     equivalentObjectPropertyAxiomsByProperty            = buildLazy(EQUIVALENT_OBJECT_PROPERTIES, OPCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLDisjointObjectPropertiesAxiom>       disjointObjectPropertyAxiomsByProperty              = buildLazy(DISJOINT_OBJECT_PROPERTIES, OPCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyDomainAxiom>           objectPropertyDomainAxiomsByProperty                = buildLazy(OBJECT_PROPERTY_DOMAIN, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyRangeAxiom>            objectPropertyRangeAxiomsByProperty                 = buildLazy(OBJECT_PROPERTY_RANGE, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLFunctionalObjectPropertyAxiom>       functionalObjectPropertyAxiomsByProperty            = buildLazy(FUNCTIONAL_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLInverseFunctionalObjectPropertyAxiom>inverseFunctionalPropertyAxiomsByProperty           = buildLazy(INVERSE_FUNCTIONAL_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLSymmetricObjectPropertyAxiom>        symmetricPropertyAxiomsByProperty                   = buildLazy(SYMMETRIC_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLAsymmetricObjectPropertyAxiom>       asymmetricPropertyAxiomsByProperty                  = buildLazy(ASYMMETRIC_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLReflexiveObjectPropertyAxiom>        reflexivePropertyAxiomsByProperty                   = buildLazy(REFLEXIVE_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLIrreflexiveObjectPropertyAxiom>      irreflexivePropertyAxiomsByProperty                 = buildLazy(IRREFLEXIVE_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLTransitiveObjectPropertyAxiom>       transitivePropertyAxiomsByProperty                  = buildLazy(TRANSITIVE_OBJECT_PROPERTY, OPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLObjectPropertyExpression, OWLInverseObjectPropertiesAxiom>        inversePropertyAxiomsByProperty                     = buildLazy(INVERSE_OBJECT_PROPERTIES, OPCOLLECTIONS);

    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLEquivalentDataPropertiesAxiom>         equivalentDataPropertyAxiomsByProperty              = buildLazy(EQUIVALENT_DATA_PROPERTIES, DPCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLDisjointDataPropertiesAxiom>           disjointDataPropertyAxiomsByProperty                = buildLazy(DISJOINT_DATA_PROPERTIES, DPCOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLDataPropertyDomainAxiom>               dataPropertyDomainAxiomsByProperty                  = buildLazy(DATA_PROPERTY_DOMAIN, DPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLDataPropertyRangeAxiom>                dataPropertyRangeAxiomsByProperty                   = buildLazy(DATA_PROPERTY_RANGE, DPSUBNAMED);
    @Nonnull protected transient MapPointer<OWLDataPropertyExpression, OWLFunctionalDataPropertyAxiom>           functionalDataPropertyAxiomsByProperty              = buildLazy(FUNCTIONAL_DATA_PROPERTY, DPSUBNAMED);

    @Nonnull protected transient MapPointer<OWLIndividual, OWLClassAssertionAxiom>                               classAssertionAxiomsByIndividual                    = buildLazy(CLASS_ASSERTION, INDIVIDUALSUBNAMED);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLObjectPropertyAssertionAxiom>                      objectPropertyAssertionsByIndividual                = buildLazy(OBJECT_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLDataPropertyAssertionAxiom>                        dataPropertyAssertionsByIndividual                  = buildLazy(DATA_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLNegativeObjectPropertyAssertionAxiom>              negativeObjectPropertyAssertionAxiomsByIndividual   = buildLazy(NEGATIVE_OBJECT_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLNegativeDataPropertyAssertionAxiom>                negativeDataPropertyAssertionAxiomsByIndividual     = buildLazy(NEGATIVE_DATA_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLDifferentIndividualsAxiom>                         differentIndividualsAxiomsByIndividual              = buildLazy(DIFFERENT_INDIVIDUALS, ICOLLECTIONS);
    @Nonnull protected transient MapPointer<OWLIndividual, OWLSameIndividualAxiom>                               sameIndividualsAxiomsByIndividual                   = buildLazy(SAME_INDIVIDUAL, ICOLLECTIONS);

    @Nonnull protected  SetPointer<OWLImportsDeclaration>                        importsDeclarations                 = new SetPointer<>();
    @Nonnull protected  SetPointer<OWLAnnotation>                                ontologyAnnotations                 = new SetPointer<>();
    @Nonnull protected  SetPointer<OWLClassAxiom>                                generalClassAxioms                  = new SetPointer<>();
    @Nonnull protected  SetPointer<OWLSubPropertyChainOfAxiom>                   propertyChainSubPropertyAxioms      = new SetPointer<>();

    @Nonnull protected transient MapPointer<AxiomType<?>, OWLAxiom>              axiomsByType                        = build();

    @Nonnull protected transient MapPointer<OWLClass, OWLAxiom>                  owlClassReferences                  = build();
    @Nonnull protected transient MapPointer<OWLObjectProperty, OWLAxiom>         owlObjectPropertyReferences         = build();
    @Nonnull protected transient MapPointer<OWLDataProperty, OWLAxiom>           owlDataPropertyReferences           = build();
    @Nonnull protected transient MapPointer<OWLNamedIndividual, OWLAxiom>        owlIndividualReferences             = build();
    @Nonnull protected transient MapPointer<OWLAnonymousIndividual, OWLAxiom>    owlAnonymousIndividualReferences    = build();
    @Nonnull protected transient MapPointer<OWLDatatype, OWLAxiom>               owlDatatypeReferences               = build();
    @Nonnull protected transient MapPointer<OWLAnnotationProperty, OWLAxiom>     owlAnnotationPropertyReferences     = build();
    @Nonnull protected transient MapPointer<OWLEntity, OWLDeclarationAxiom>      declarationsByEntity                = build();
//@formatter:on
    @Nullable
    private List<OWLAxiom> axiomsForSerialization;

    @SuppressWarnings("null")
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {try{__CLR4_5_21af1aflviclf89.R.inc(1696);
        __CLR4_5_21af1aflviclf89.R.inc(1697);stream.defaultReadObject();
        __CLR4_5_21af1aflviclf89.R.inc(1698);axiomsByType = build();
        __CLR4_5_21af1aflviclf89.R.inc(1699);owlClassReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1700);owlObjectPropertyReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1701);owlDataPropertyReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1702);owlIndividualReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1703);owlAnonymousIndividualReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1704);owlDatatypeReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1705);owlAnnotationPropertyReferences = build();
        __CLR4_5_21af1aflviclf89.R.inc(1706);declarationsByEntity = build();
        __CLR4_5_21af1aflviclf89.R.inc(1707);classAssertionAxiomsByClass = buildLazy(CLASS_ASSERTION, CLASSEXPRESSIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1708);annotationAssertionAxiomsBySubject = buildLazy(ANNOTATION_ASSERTION, ANNOTSUPERNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1709);subClassAxiomsBySubPosition = buildLazy(SUBCLASS_OF, CLASSSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1710);subClassAxiomsBySuperPosition = buildLazy(SUBCLASS_OF, CLASSSUPERNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1711);objectSubPropertyAxiomsBySubPosition = buildLazy(SUB_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1712);objectSubPropertyAxiomsBySuperPosition = buildLazy(SUB_OBJECT_PROPERTY, OPSUPERNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1713);dataSubPropertyAxiomsBySubPosition = buildLazy(SUB_DATA_PROPERTY, DPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1714);dataSubPropertyAxiomsBySuperPosition = buildLazy(SUB_DATA_PROPERTY, DPSUPERNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1715);classAxiomsByClass = buildClassAxiomByClass();
        __CLR4_5_21af1aflviclf89.R.inc(1716);equivalentClassesAxiomsByClass = buildLazy(EQUIVALENT_CLASSES, CLASSCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1717);disjointClassesAxiomsByClass = buildLazy(DISJOINT_CLASSES, CLASSCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1718);disjointUnionAxiomsByClass = buildLazy(DISJOINT_UNION, CLASSCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1719);hasKeyAxiomsByClass = buildLazy(HAS_KEY, CLASSSUPERNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1720);equivalentObjectPropertyAxiomsByProperty = buildLazy(EQUIVALENT_OBJECT_PROPERTIES, OPCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1721);disjointObjectPropertyAxiomsByProperty = buildLazy(DISJOINT_OBJECT_PROPERTIES, OPCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1722);objectPropertyDomainAxiomsByProperty = buildLazy(OBJECT_PROPERTY_DOMAIN, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1723);objectPropertyRangeAxiomsByProperty = buildLazy(OBJECT_PROPERTY_RANGE, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1724);functionalObjectPropertyAxiomsByProperty = buildLazy(FUNCTIONAL_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1725);inverseFunctionalPropertyAxiomsByProperty = buildLazy(INVERSE_FUNCTIONAL_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1726);symmetricPropertyAxiomsByProperty = buildLazy(SYMMETRIC_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1727);asymmetricPropertyAxiomsByProperty = buildLazy(ASYMMETRIC_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1728);reflexivePropertyAxiomsByProperty = buildLazy(REFLEXIVE_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1729);irreflexivePropertyAxiomsByProperty = buildLazy(IRREFLEXIVE_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1730);transitivePropertyAxiomsByProperty = buildLazy(TRANSITIVE_OBJECT_PROPERTY, OPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1731);inversePropertyAxiomsByProperty = buildLazy(INVERSE_OBJECT_PROPERTIES, OPCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1732);equivalentDataPropertyAxiomsByProperty = buildLazy(EQUIVALENT_DATA_PROPERTIES, DPCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1733);disjointDataPropertyAxiomsByProperty = buildLazy(DISJOINT_DATA_PROPERTIES, DPCOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1734);dataPropertyDomainAxiomsByProperty = buildLazy(DATA_PROPERTY_DOMAIN, DPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1735);dataPropertyRangeAxiomsByProperty = buildLazy(DATA_PROPERTY_RANGE, DPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1736);functionalDataPropertyAxiomsByProperty = buildLazy(FUNCTIONAL_DATA_PROPERTY, DPSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1737);classAssertionAxiomsByIndividual = buildLazy(CLASS_ASSERTION, INDIVIDUALSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1738);objectPropertyAssertionsByIndividual = buildLazy(OBJECT_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1739);dataPropertyAssertionsByIndividual = buildLazy(DATA_PROPERTY_ASSERTION, INDIVIDUALSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1740);negativeObjectPropertyAssertionAxiomsByIndividual = buildLazy(NEGATIVE_OBJECT_PROPERTY_ASSERTION,
            INDIVIDUALSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1741);negativeDataPropertyAssertionAxiomsByIndividual = buildLazy(NEGATIVE_DATA_PROPERTY_ASSERTION,
            INDIVIDUALSUBNAMED);
        __CLR4_5_21af1aflviclf89.R.inc(1742);differentIndividualsAxiomsByIndividual = buildLazy(DIFFERENT_INDIVIDUALS, ICOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1743);sameIndividualsAxiomsByIndividual = buildLazy(SAME_INDIVIDUAL, ICOLLECTIONS);
        __CLR4_5_21af1aflviclf89.R.inc(1744);for (OWLAxiom ax : axiomsForSerialization) {{
            __CLR4_5_21af1aflviclf89.R.inc(1745);addAxiom(ax);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1746);axiomsForSerialization = null;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * Trims the capacity of the axiom indexes . An application can use this
     * operation to minimize the storage of the internals instance.
     */
    public void trimToSize() {try{__CLR4_5_21af1aflviclf89.R.inc(1747);
        __CLR4_5_21af1aflviclf89.R.inc(1748);axiomsByType.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1749);owlClassReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1750);owlObjectPropertyReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1751);owlDataPropertyReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1752);owlIndividualReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1753);owlAnonymousIndividualReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1754);owlDatatypeReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1755);owlAnnotationPropertyReferences.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1756);declarationsByEntity.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1757);classAssertionAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1758);annotationAssertionAxiomsBySubject.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1759);subClassAxiomsBySubPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1760);subClassAxiomsBySuperPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1761);objectSubPropertyAxiomsBySubPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1762);objectSubPropertyAxiomsBySuperPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1763);dataSubPropertyAxiomsBySubPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1764);dataSubPropertyAxiomsBySuperPosition.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1765);classAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1766);equivalentClassesAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1767);disjointClassesAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1768);disjointUnionAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1769);hasKeyAxiomsByClass.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1770);equivalentObjectPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1771);disjointObjectPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1772);objectPropertyDomainAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1773);objectPropertyRangeAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1774);functionalObjectPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1775);inverseFunctionalPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1776);symmetricPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1777);asymmetricPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1778);reflexivePropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1779);irreflexivePropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1780);transitivePropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1781);inversePropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1782);equivalentDataPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1783);disjointDataPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1784);dataPropertyDomainAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1785);dataPropertyRangeAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1786);functionalDataPropertyAxiomsByProperty.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1787);classAssertionAxiomsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1788);objectPropertyAssertionsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1789);dataPropertyAssertionsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1790);negativeObjectPropertyAssertionAxiomsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1791);negativeDataPropertyAssertionAxiomsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1792);differentIndividualsAxiomsByIndividual.trimToSize();
        __CLR4_5_21af1aflviclf89.R.inc(1793);sameIndividualsAxiomsByIndividual.trimToSize();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    private void writeObject(ObjectOutputStream stream) throws IOException {try{__CLR4_5_21af1aflviclf89.R.inc(1794);
        __CLR4_5_21af1aflviclf89.R.inc(1795);axiomsForSerialization = new ArrayList<>();
        __CLR4_5_21af1aflviclf89.R.inc(1796);Iterables.addAll(axiomsForSerialization, axiomsByType.getAllValues());
        __CLR4_5_21af1aflviclf89.R.inc(1797);stream.defaultWriteObject();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    @Nonnull
    private final AddAxiomVisitor addChangeVisitor = new AddAxiomVisitor();
    @Nonnull
    private final RemoveAxiomVisitor removeChangeVisitor = new RemoveAxiomVisitor();
    @Nonnull
    private final ReferenceChecker refChecker = new ReferenceChecker();
    @Nonnull
    private final ReferencedAxiomsCollector refAxiomsCollector = new ReferencedAxiomsCollector();

    /**
     * @param i
     *        iri
     * @return true if a class with this iri exists
     */
    public boolean containsClassInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1798);
        __CLR4_5_21af1aflviclf89.R.inc(1799);return owlClassReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if an object property with this iri exists
     */
    public boolean containsObjectPropertyInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1800);
        __CLR4_5_21af1aflviclf89.R.inc(1801);return owlObjectPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a data property with this iri exists
     */
    public boolean containsDataPropertyInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1802);
        __CLR4_5_21af1aflviclf89.R.inc(1803);return owlDataPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if an annotation property with this iri exists
     */
    public boolean containsAnnotationPropertyInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1804);
        __CLR4_5_21af1aflviclf89.R.inc(1805);return owlAnnotationPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a individual with this iri exists
     */
    public boolean containsIndividualInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1806);
        __CLR4_5_21af1aflviclf89.R.inc(1807);return owlIndividualReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a datatype with this iri exists
     */
    public boolean containsDatatypeInSignature(IRI i) {try{__CLR4_5_21af1aflviclf89.R.inc(1808);
        __CLR4_5_21af1aflviclf89.R.inc(1809);return owlDatatypeReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a class with this iri exists
     */
    public boolean containsClassInSignature(OWLClass i) {try{__CLR4_5_21af1aflviclf89.R.inc(1810);
        __CLR4_5_21af1aflviclf89.R.inc(1811);return owlClassReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if an object property with this iri exists
     */
    public boolean containsObjectPropertyInSignature(OWLObjectProperty i) {try{__CLR4_5_21af1aflviclf89.R.inc(1812);
        __CLR4_5_21af1aflviclf89.R.inc(1813);return owlObjectPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a data property with this iri exists
     */
    public boolean containsDataPropertyInSignature(OWLDataProperty i) {try{__CLR4_5_21af1aflviclf89.R.inc(1814);
        __CLR4_5_21af1aflviclf89.R.inc(1815);return owlDataPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if an annotation property with this iri exists
     */
    public boolean containsAnnotationPropertyInSignature(OWLAnnotationProperty i) {try{__CLR4_5_21af1aflviclf89.R.inc(1816);
        __CLR4_5_21af1aflviclf89.R.inc(1817);return owlAnnotationPropertyReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a individual with this iri exists
     */
    public boolean containsIndividualInSignature(OWLNamedIndividual i) {try{__CLR4_5_21af1aflviclf89.R.inc(1818);
        __CLR4_5_21af1aflviclf89.R.inc(1819);return owlIndividualReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param i
     *        iri
     * @return true if a datatype with this iri exists
     */
    public boolean containsDatatypeInSignature(OWLDatatype i) {try{__CLR4_5_21af1aflviclf89.R.inc(1820);
        __CLR4_5_21af1aflviclf89.R.inc(1821);return owlDatatypeReferences.containsReference(i);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param type
     *        type of map key
     * @param axiom
     *        class of axiom indexed
     * @param <T>
     *        key type
     * @param <A>
     *        value type
     * @return map pointer matching the search, or null if there is not one
     */
    // not always not null, but supposed to
    @Nonnull
    <T extends OWLObject, A extends OWLAxiom> Optional<MapPointer<T, A>> get(@Nonnull Class<T> type,
        @Nonnull Class<A> axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(1822);
        __CLR4_5_21af1aflviclf89.R.inc(1823);return get(type, axiom, Navigation.IN_SUB_POSITION);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param type
     *        type of map key
     * @param axiom
     *        class of axiom indexed
     * @param position
     *        for axioms with a left/right distinction, IN_SUPER_POSITION means
     *        right index
     * @param <T>
     *        key type
     * @param <A>
     *        value type
     * @return map pointer matching the search, or null if there is not one
     */
    // not always not null, but supposed to be
    @Nonnull
    @SuppressWarnings({ "unchecked", })
    <T extends OWLObject, A extends OWLAxiom> Optional<MapPointer<T, A>> get(@Nonnull Class<T> type,
        @Nonnull Class<A> axiom, Navigation position) {try{__CLR4_5_21af1aflviclf89.R.inc(1824);
        __CLR4_5_21af1aflviclf89.R.inc(1825);if ((((OWLEntity.class.isAssignableFrom(type) && axiom.equals(OWLDeclarationAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1826)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1827)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1828);return Optional.of((MapPointer<T, A>) declarationsByEntity);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1829);if ((((type.equals(OWLClass.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1830)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1831)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1832);return Optional.of((MapPointer<T, A>) owlClassReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1833);if ((((type.equals(OWLObjectProperty.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1834)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1835)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1836);return Optional.of((MapPointer<T, A>) owlObjectPropertyReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1837);if ((((type.equals(OWLDataProperty.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1838)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1839)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1840);return Optional.of((MapPointer<T, A>) owlDataPropertyReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1841);if ((((type.equals(OWLNamedIndividual.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1842)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1843)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1844);return Optional.of((MapPointer<T, A>) owlIndividualReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1845);if ((((type.equals(OWLAnonymousIndividual.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1846)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1847)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1848);return Optional.of((MapPointer<T, A>) owlAnonymousIndividualReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1849);if ((((type.equals(OWLDatatype.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1850)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1851)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1852);return Optional.of((MapPointer<T, A>) owlDatatypeReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1853);if ((((type.equals(OWLAnnotationProperty.class) && axiom.equals(OWLAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1854)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1855)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1856);return Optional.of((MapPointer<T, A>) owlAnnotationPropertyReferences);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1857);if ((((type.equals(OWLClassExpression.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1858)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1859)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1860);return Optional.of((MapPointer<T, A>) classAssertionAxiomsByClass);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1861);if ((((type.equals(OWLObjectPropertyExpression.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1862)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1863)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1864);if ((((axiom.equals(OWLSubObjectPropertyOfAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1865)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1866)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1867);if ((((position == Navigation.IN_SUPER_POSITION)&&(__CLR4_5_21af1aflviclf89.R.iget(1868)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1869)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(1870);return Optional.of((MapPointer<T, A>) objectSubPropertyAxiomsBySuperPosition);
                } }else {{
                    __CLR4_5_21af1aflviclf89.R.inc(1871);return Optional.of((MapPointer<T, A>) objectSubPropertyAxiomsBySubPosition);
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(1872);if ((((axiom.equals(OWLEquivalentObjectPropertiesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1873)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1874)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1875);return Optional.of((MapPointer<T, A>) equivalentObjectPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1876);if ((((axiom.equals(OWLDisjointObjectPropertiesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1877)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1878)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1879);return Optional.of((MapPointer<T, A>) disjointObjectPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1880);if ((((axiom.equals(OWLObjectPropertyDomainAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1881)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1882)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1883);return Optional.of((MapPointer<T, A>) objectPropertyDomainAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1884);if ((((axiom.equals(OWLObjectPropertyRangeAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1885)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1886)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1887);return Optional.of((MapPointer<T, A>) objectPropertyRangeAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1888);if ((((axiom.equals(OWLFunctionalObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1889)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1890)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1891);return Optional.of((MapPointer<T, A>) functionalObjectPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1892);if ((((axiom.equals(OWLInverseFunctionalObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1893)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1894)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1895);return Optional.of((MapPointer<T, A>) inverseFunctionalPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1896);if ((((axiom.equals(OWLSymmetricObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1897)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1898)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1899);return Optional.of((MapPointer<T, A>) symmetricPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1900);if ((((axiom.equals(OWLAsymmetricObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1901)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1902)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1903);return Optional.of((MapPointer<T, A>) asymmetricPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1904);if ((((axiom.equals(OWLReflexiveObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1905)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1906)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1907);return Optional.of((MapPointer<T, A>) reflexivePropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1908);if ((((axiom.equals(OWLIrreflexiveObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1909)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1910)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1911);return Optional.of((MapPointer<T, A>) irreflexivePropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1912);if ((((axiom.equals(OWLTransitiveObjectPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1913)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1914)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1915);return Optional.of((MapPointer<T, A>) transitivePropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1916);if ((((axiom.equals(OWLInverseObjectPropertiesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1917)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1918)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1919);return Optional.of((MapPointer<T, A>) inversePropertyAxiomsByProperty);
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(1920);if ((((type.equals(OWLDataPropertyExpression.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1921)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1922)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1923);if ((((axiom.equals(OWLSubDataPropertyOfAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1924)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1925)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1926);if ((((position == Navigation.IN_SUPER_POSITION)&&(__CLR4_5_21af1aflviclf89.R.iget(1927)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1928)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(1929);return Optional.of((MapPointer<T, A>) dataSubPropertyAxiomsBySuperPosition);
                } }else {{
                    __CLR4_5_21af1aflviclf89.R.inc(1930);return Optional.of((MapPointer<T, A>) dataSubPropertyAxiomsBySubPosition);
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(1931);if ((((axiom.equals(OWLEquivalentDataPropertiesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1932)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1933)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1934);return Optional.of((MapPointer<T, A>) equivalentDataPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1935);if ((((axiom.equals(OWLDisjointDataPropertiesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1936)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1937)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1938);return Optional.of((MapPointer<T, A>) disjointDataPropertyAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1939);if ((((axiom.equals(OWLDataPropertyDomainAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1940)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1941)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1942);return Optional.of((MapPointer<T, A>) dataPropertyDomainAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1943);if ((((axiom.equals(OWLDataPropertyRangeAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1944)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1945)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1946);return Optional.of((MapPointer<T, A>) dataPropertyRangeAxiomsByProperty);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1947);if ((((axiom.equals(OWLFunctionalDataPropertyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1948)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1949)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1950);return Optional.of((MapPointer<T, A>) functionalDataPropertyAxiomsByProperty);
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(1951);if ((((type.equals(OWLAnnotationSubject.class) || type.equals(IRI.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1952)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1953)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1954);return Optional.of((MapPointer<T, A>) annotationAssertionAxiomsBySubject);
        }
        }__CLR4_5_21af1aflviclf89.R.inc(1955);if ((((type.equals(OWLIndividual.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1956)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1957)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1958);if ((((axiom.equals(OWLClassAssertionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1959)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1960)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1961);return Optional.of((MapPointer<T, A>) classAssertionAxiomsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1962);if ((((axiom.equals(OWLObjectPropertyAssertionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1963)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1964)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1965);return Optional.of((MapPointer<T, A>) objectPropertyAssertionsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1966);if ((((axiom.equals(OWLDataPropertyAssertionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1967)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1968)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1969);return Optional.of((MapPointer<T, A>) dataPropertyAssertionsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1970);if ((((axiom.equals(OWLNegativeObjectPropertyAssertionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1971)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1972)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1973);return Optional.of((MapPointer<T, A>) negativeObjectPropertyAssertionAxiomsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1974);if ((((axiom.equals(OWLNegativeDataPropertyAssertionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1975)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1976)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1977);return Optional.of((MapPointer<T, A>) negativeDataPropertyAssertionAxiomsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1978);if ((((axiom.equals(OWLDifferentIndividualsAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1979)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1980)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1981);return Optional.of((MapPointer<T, A>) differentIndividualsAxiomsByIndividual);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(1982);if ((((axiom.equals(OWLSameIndividualAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1983)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1984)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1985);return Optional.of((MapPointer<T, A>) sameIndividualsAxiomsByIndividual);
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(1986);if ((((type.equals(OWLClass.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1987)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1988)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(1989);if ((((axiom.equals(OWLSubClassOfAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1990)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1991)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(1992);if ((((position == Navigation.IN_SUPER_POSITION)&&(__CLR4_5_21af1aflviclf89.R.iget(1993)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1994)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(1995);return Optional.of((MapPointer<T, A>) subClassAxiomsBySuperPosition);
                } }else {{
                    __CLR4_5_21af1aflviclf89.R.inc(1996);return Optional.of((MapPointer<T, A>) subClassAxiomsBySubPosition);
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(1997);if ((((axiom.equals(OWLClassAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(1998)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(1999)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2000);return Optional.of((MapPointer<T, A>) classAxiomsByClass);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2001);if ((((axiom.equals(OWLEquivalentClassesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(2002)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2003)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2004);return Optional.of((MapPointer<T, A>) equivalentClassesAxiomsByClass);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2005);if ((((axiom.equals(OWLDisjointClassesAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(2006)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2007)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2008);return Optional.of((MapPointer<T, A>) disjointClassesAxiomsByClass);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2009);if ((((axiom.equals(OWLDisjointUnionAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(2010)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2011)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2012);return Optional.of((MapPointer<T, A>) disjointUnionAxiomsByClass);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2013);if ((((axiom.equals(OWLHasKeyAxiom.class))&&(__CLR4_5_21af1aflviclf89.R.iget(2014)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2015)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2016);return Optional.of((MapPointer<T, A>) hasKeyAxiomsByClass);
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(2017);return Optional.absent();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    @Nonnull
    protected <K, V extends OWLAxiom> MapPointer<K, V> build() {try{__CLR4_5_21af1aflviclf89.R.inc(2018);
        __CLR4_5_21af1aflviclf89.R.inc(2019);return build(null, null);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    @Nonnull
    protected <K, V extends OWLAxiom> MapPointer<K, V> buildLazy(AxiomType<?> t, OWLAxiomVisitorEx<?> v) {try{__CLR4_5_21af1aflviclf89.R.inc(2020);
        __CLR4_5_21af1aflviclf89.R.inc(2021);return new MapPointer<>(t, v, false, this);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    @Nonnull
    protected ClassAxiomByClassPointer buildClassAxiomByClass() {try{__CLR4_5_21af1aflviclf89.R.inc(2022);
        __CLR4_5_21af1aflviclf89.R.inc(2023);return new ClassAxiomByClassPointer(null, null, false, this);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    @Nonnull
    protected <K, V extends OWLAxiom> MapPointer<K, V> build(AxiomType<?> t, OWLAxiomVisitorEx<?> v) {try{__CLR4_5_21af1aflviclf89.R.inc(2024);
        __CLR4_5_21af1aflviclf89.R.inc(2025);return new MapPointer<>(t, v, true, this);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param axiom
     *        axiom to add
     * @return true if the axiom was not already included
     */
    public boolean addAxiom(@Nonnull final OWLAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2026);
        __CLR4_5_21af1aflviclf89.R.inc(2027);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_21af1aflviclf89.R.inc(2028);if ((((getAxiomsByType().put(axiom.getAxiomType(), axiom))&&(__CLR4_5_21af1aflviclf89.R.iget(2029)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2030)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2031);axiom.accept(addChangeVisitor);
            __CLR4_5_21af1aflviclf89.R.inc(2032);axiom.accept(new AbstractEntityRegistrationManager() {

                @Override
                public void visit(OWLClass ce) {try{__CLR4_5_21af1aflviclf89.R.inc(2033);
                    __CLR4_5_21af1aflviclf89.R.inc(2034);owlClassReferences.put(ce, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLObjectProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2035);
                    __CLR4_5_21af1aflviclf89.R.inc(2036);owlObjectPropertyReferences.put(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLDataProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2037);
                    __CLR4_5_21af1aflviclf89.R.inc(2038);owlDataPropertyReferences.put(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLNamedIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(2039);
                    __CLR4_5_21af1aflviclf89.R.inc(2040);owlIndividualReferences.put(individual, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLAnnotationProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2041);
                    __CLR4_5_21af1aflviclf89.R.inc(2042);owlAnnotationPropertyReferences.put(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLDatatype node) {try{__CLR4_5_21af1aflviclf89.R.inc(2043);
                    __CLR4_5_21af1aflviclf89.R.inc(2044);owlDatatypeReferences.put(node, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(2045);
                    __CLR4_5_21af1aflviclf89.R.inc(2046);owlAnonymousIndividualReferences.put(individual, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
            });
            __CLR4_5_21af1aflviclf89.R.inc(2047);return true;
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2048);return false;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param axiom
     *        axiom to remove
     * @return true if removed
     */
    public boolean removeAxiom(@Nonnull final OWLAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2049);
        __CLR4_5_21af1aflviclf89.R.inc(2050);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_21af1aflviclf89.R.inc(2051);if ((((getAxiomsByType().remove(axiom.getAxiomType(), axiom))&&(__CLR4_5_21af1aflviclf89.R.iget(2052)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2053)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2054);axiom.accept(removeChangeVisitor);
            __CLR4_5_21af1aflviclf89.R.inc(2055);AbstractEntityRegistrationManager referenceRemover = new AbstractEntityRegistrationManager() {

                @Override
                public void visit(OWLClass ce) {try{__CLR4_5_21af1aflviclf89.R.inc(2056);
                    __CLR4_5_21af1aflviclf89.R.inc(2057);owlClassReferences.remove(ce, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLObjectProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2058);
                    __CLR4_5_21af1aflviclf89.R.inc(2059);owlObjectPropertyReferences.remove(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLDataProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2060);
                    __CLR4_5_21af1aflviclf89.R.inc(2061);owlDataPropertyReferences.remove(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLNamedIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(2062);
                    __CLR4_5_21af1aflviclf89.R.inc(2063);owlIndividualReferences.remove(individual, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLAnnotationProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2064);
                    __CLR4_5_21af1aflviclf89.R.inc(2065);owlAnnotationPropertyReferences.remove(property, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLDatatype node) {try{__CLR4_5_21af1aflviclf89.R.inc(2066);
                    __CLR4_5_21af1aflviclf89.R.inc(2067);owlDatatypeReferences.remove(node, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

                @Override
                public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(2068);
                    __CLR4_5_21af1aflviclf89.R.inc(2069);owlAnonymousIndividualReferences.remove(individual, axiom);
                }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
            };
            __CLR4_5_21af1aflviclf89.R.inc(2070);axiom.accept(referenceRemover);
            __CLR4_5_21af1aflviclf89.R.inc(2071);return true;
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2072);return false;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param e
     *        entity to check
     * @return true if the entity is declared in the ontology
     */
    public boolean isDeclared(OWLEntity e) {try{__CLR4_5_21af1aflviclf89.R.inc(2073);
        __CLR4_5_21af1aflviclf89.R.inc(2074);return declarationsByEntity.containsKey(e);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return true if empty
     */
    public boolean isEmpty() {try{__CLR4_5_21af1aflviclf89.R.inc(2075);
        __CLR4_5_21af1aflviclf89.R.inc(2076);return axiomsByType.isEmpty() && ontologyAnnotations.isEmpty();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param filter
     *        filter to satisfy
     * @param <K>
     *        key type
     * @param key
     *        key
     * @return set of values
     */
    @Nonnull
    public <K> Collection<? extends OWLAxiom> filterAxioms(@Nonnull OWLAxiomSearchFilter filter, @Nonnull K key) {try{__CLR4_5_21af1aflviclf89.R.inc(2077);
        __CLR4_5_21af1aflviclf89.R.inc(2078);if ((((filter == Filters.annotations)&&(__CLR4_5_21af1aflviclf89.R.iget(2079)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2080)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2081);Optional<MapPointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom>> mapPointerOptional = get(
                OWLAnnotationSubject.class, OWLAnnotationAssertionAxiom.class);
            __CLR4_5_21af1aflviclf89.R.inc(2082);if ((((mapPointerOptional.isPresent())&&(__CLR4_5_21af1aflviclf89.R.iget(2083)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2084)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2085);MapPointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom> mapPointer = mapPointerOptional.get();
                __CLR4_5_21af1aflviclf89.R.inc(2086);Collection<OWLAnnotationAssertionAxiom> values = mapPointer.getValues((OWLAnnotationSubject) key);
                __CLR4_5_21af1aflviclf89.R.inc(2087);return values;
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(2088);return getAxiomsByType().filterAxioms(filter, key);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param <K>
     *        key type
     * @param filter
     *        filter to satisfy
     * @param key
     *        key to match
     * @return true if the filter is matched at least once
     */
    public <K> boolean contains(@Nonnull OWLAxiomSearchFilter filter, @Nonnull K key) {try{__CLR4_5_21af1aflviclf89.R.inc(2089);
        __CLR4_5_21af1aflviclf89.R.inc(2090);for (AxiomType<?> at : filter.getAxiomTypes()) {{
            __CLR4_5_21af1aflviclf89.R.inc(2091);for (OWLAxiom t : getAxiomsByType().getValues(at)) {{
                assert (((t != null)&&(__CLR4_5_21af1aflviclf89.R.iget(2092)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2093)==0&false));
                __CLR4_5_21af1aflviclf89.R.inc(2094);if ((((filter.pass(t, key))&&(__CLR4_5_21af1aflviclf89.R.iget(2095)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2096)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2097);return true;
                }
            }}
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(2098);return false;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param copy
     *        true if a copy of the set should be returned, false for a non
     *        defensive copy (to be used only by OWLImmutableOntologyImpl for
     *        iteration)
     * @return iterable of imports declaration
     */
    @Nonnull
    public Iterable<OWLImportsDeclaration> getImportsDeclarations(boolean copy) {try{__CLR4_5_21af1aflviclf89.R.inc(2099);
        __CLR4_5_21af1aflviclf89.R.inc(2100);if ((((!copy)&&(__CLR4_5_21af1aflviclf89.R.iget(2101)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2102)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2103);return importsDeclarations.iterable();
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2104);return importsDeclarations.copy();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param importDeclaration
     *        import declaration to remove
     * @return true if added
     */
    public boolean addImportsDeclaration(OWLImportsDeclaration importDeclaration) {try{__CLR4_5_21af1aflviclf89.R.inc(2105);
        __CLR4_5_21af1aflviclf89.R.inc(2106);return importsDeclarations.add(importDeclaration);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param importDeclaration
     *        import declaration to remove
     * @return true if removed
     */
    public boolean removeImportsDeclaration(OWLImportsDeclaration importDeclaration) {try{__CLR4_5_21af1aflviclf89.R.inc(2107);
        __CLR4_5_21af1aflviclf89.R.inc(2108);return importsDeclarations.remove(importDeclaration);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param copy
     *        true if a copy of the set should be returned, false for a non
     *        defensive copy (to be used only by OWLImmutableOntologyImpl for
     *        iteration)
     * @return iterable of annotations
     */
    @Nonnull
    Iterable<OWLAnnotation> getOntologyAnnotations(boolean copy) {try{__CLR4_5_21af1aflviclf89.R.inc(2109);
        __CLR4_5_21af1aflviclf89.R.inc(2110);if ((((!copy)&&(__CLR4_5_21af1aflviclf89.R.iget(2111)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2112)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2113);return ontologyAnnotations.iterable();
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2114);return ontologyAnnotations.copy();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ann
     *        annotation to add
     * @return true if annotation added
     */
    public boolean addOntologyAnnotation(OWLAnnotation ann) {try{__CLR4_5_21af1aflviclf89.R.inc(2115);
        __CLR4_5_21af1aflviclf89.R.inc(2116);return ontologyAnnotations.add(ann);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ann
     *        annotation to remove
     * @return true if annotation removed
     */
    public boolean removeOntologyAnnotation(OWLAnnotation ann) {try{__CLR4_5_21af1aflviclf89.R.inc(2117);
        __CLR4_5_21af1aflviclf89.R.inc(2118);return ontologyAnnotations.remove(ann);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param p
     *        pointer
     * @param <K>
     *        key type
     * @param <V>
     *        value type
     * @param k
     *        key
     * @param v
     *        value
     * @return true if the pair (key, value) is contained
     */
    public static <K, V extends OWLAxiom> boolean contains(@Nonnull MapPointer<K, V> p, K k, V v) {try{__CLR4_5_21af1aflviclf89.R.inc(2119);
        __CLR4_5_21af1aflviclf89.R.inc(2120);return p.contains(k, v);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return count of all axioms
     */
    public int getAxiomCount() {try{__CLR4_5_21af1aflviclf89.R.inc(2121);
        __CLR4_5_21af1aflviclf89.R.inc(2122);return axiomsByType.size();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * Gets the axioms by type.
     * 
     * @return the axioms by type
     */
    @Nonnull
    public Iterable<OWLAxiom> getAxioms() {try{__CLR4_5_21af1aflviclf89.R.inc(2123);
        __CLR4_5_21af1aflviclf89.R.inc(2124);return axiomsByType.getAllValues();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param <T>
     *        axiom type
     * @param axiomType
     *        axiom type to count
     * @return axiom count
     */
    public <T extends OWLAxiom> int getAxiomCount(AxiomType<T> axiomType) {try{__CLR4_5_21af1aflviclf89.R.inc(2125);
        __CLR4_5_21af1aflviclf89.R.inc(2126);if ((((!axiomsByType.isInitialized())&&(__CLR4_5_21af1aflviclf89.R.iget(2127)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2128)==0&false))) {{
            __CLR4_5_21af1aflviclf89.R.inc(2129);return 0;
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2130);return Iterables.size(axiomsByType.getValues(axiomType));
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return logical axioms
     */
    @Nonnull
    public Set<OWLLogicalAxiom> getLogicalAxioms() {try{__CLR4_5_21af1aflviclf89.R.inc(2131);
        __CLR4_5_21af1aflviclf89.R.inc(2132);Set<OWLLogicalAxiom> axioms = createLinkedSet();
        __CLR4_5_21af1aflviclf89.R.inc(2133);for (AxiomType<?> type : AXIOM_TYPES) {{
            __CLR4_5_21af1aflviclf89.R.inc(2134);if ((((type.isLogical())&&(__CLR4_5_21af1aflviclf89.R.iget(2135)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2136)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2137);for (OWLAxiom ax : (Collection<OWLAxiom>) axiomsByType.getValues(type)) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2138);axioms.add((OWLLogicalAxiom) ax);
                }
            }}
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(2139);return axioms;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return logical axioms count
     */
    public int getLogicalAxiomCount() {try{__CLR4_5_21af1aflviclf89.R.inc(2140);
        __CLR4_5_21af1aflviclf89.R.inc(2141);int count = 0;
        __CLR4_5_21af1aflviclf89.R.inc(2142);for (AxiomType<?> type : AXIOM_TYPES) {{
            __CLR4_5_21af1aflviclf89.R.inc(2143);if ((((type.isLogical())&&(__CLR4_5_21af1aflviclf89.R.iget(2144)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2145)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2146);count += Iterables.size(axiomsByType.getValues(type));
            }
        }}
        }__CLR4_5_21af1aflviclf89.R.inc(2147);return count;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return copy of GCI axioms
     */
    @Nonnull
    public Set<OWLClassAxiom> getGeneralClassAxioms() {try{__CLR4_5_21af1aflviclf89.R.inc(2148);
        __CLR4_5_21af1aflviclf89.R.inc(2149);return generalClassAxioms.copy();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ax
     *        GCI axiom to add
     * @return true if axiom added
     */
    public boolean addGeneralClassAxioms(OWLClassAxiom ax) {try{__CLR4_5_21af1aflviclf89.R.inc(2150);
        __CLR4_5_21af1aflviclf89.R.inc(2151);return generalClassAxioms.add(ax);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ax
     *        axiom to remove
     * @return true if removed
     */
    public boolean removeGeneralClassAxioms(OWLClassAxiom ax) {try{__CLR4_5_21af1aflviclf89.R.inc(2152);
        __CLR4_5_21af1aflviclf89.R.inc(2153);return generalClassAxioms.remove(ax);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ax
     *        axiom to add
     * @return true if added
     */
    public boolean addPropertyChainSubPropertyAxioms(OWLSubPropertyChainOfAxiom ax) {try{__CLR4_5_21af1aflviclf89.R.inc(2154);
        __CLR4_5_21af1aflviclf89.R.inc(2155);return propertyChainSubPropertyAxioms.add(ax);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param ax
     *        axiom to remove
     * @return true if removed
     */
    public boolean removePropertyChainSubPropertyAxioms(OWLSubPropertyChainOfAxiom ax) {try{__CLR4_5_21af1aflviclf89.R.inc(2156);
        __CLR4_5_21af1aflviclf89.R.inc(2157);return propertyChainSubPropertyAxioms.remove(ax);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @return map of axioms by type
     */
    @Nonnull
    public MapPointer<AxiomType<?>, OWLAxiom> getAxiomsByType() {try{__CLR4_5_21af1aflviclf89.R.inc(2158);
        __CLR4_5_21af1aflviclf89.R.inc(2159);return axiomsByType;
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    class AddAxiomVisitor extends OWLAxiomVisitorAdapter implements Serializable {

        private static final long serialVersionUID = 40000L;

        @Override
        public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2160);
            __CLR4_5_21af1aflviclf89.R.inc(2161);if ((((!axiom.getSubClass().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2162)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2163)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2164);OWLClass subClass = (OWLClass) axiom.getSubClass();
                __CLR4_5_21af1aflviclf89.R.inc(2165);subClassAxiomsBySubPosition.put(subClass, axiom);
                __CLR4_5_21af1aflviclf89.R.inc(2166);classAxiomsByClass.put(subClass, axiom);
            } }else {{
                __CLR4_5_21af1aflviclf89.R.inc(2167);addGeneralClassAxioms(axiom);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2168);if ((((!axiom.getSuperClass().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2169)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2170)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2171);subClassAxiomsBySuperPosition.put((OWLClass) axiom.getSuperClass(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2172);
            __CLR4_5_21af1aflviclf89.R.inc(2173);negativeObjectPropertyAssertionAxiomsByIndividual.put(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2174);
            __CLR4_5_21af1aflviclf89.R.inc(2175);asymmetricPropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2176);
            __CLR4_5_21af1aflviclf89.R.inc(2177);reflexivePropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2178);
            __CLR4_5_21af1aflviclf89.R.inc(2179);boolean allAnon = true;
            // Index against each named class in the axiom
            __CLR4_5_21af1aflviclf89.R.inc(2180);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2181);if ((((!desc.isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2182)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2183)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2184);OWLClass cls = (OWLClass) desc;
                    __CLR4_5_21af1aflviclf89.R.inc(2185);disjointClassesAxiomsByClass.put(cls, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2186);classAxiomsByClass.put(cls, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2187);allAnon = false;
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(2188);if ((((allAnon)&&(__CLR4_5_21af1aflviclf89.R.iget(2189)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2190)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2191);addGeneralClassAxioms(axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2192);
            __CLR4_5_21af1aflviclf89.R.inc(2193);dataPropertyDomainAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2194);
            __CLR4_5_21af1aflviclf89.R.inc(2195);if ((((axiom.getProperty() instanceof OWLObjectProperty)&&(__CLR4_5_21af1aflviclf89.R.iget(2196)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2197)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2198);objectPropertyDomainAxiomsByProperty.put(axiom.getProperty(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2199);
            __CLR4_5_21af1aflviclf89.R.inc(2200);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2201);equivalentObjectPropertyAxiomsByProperty.put(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2202);
            __CLR4_5_21af1aflviclf89.R.inc(2203);inversePropertyAxiomsByProperty.put(axiom.getFirstProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2204);inversePropertyAxiomsByProperty.put(axiom.getSecondProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2205);
            __CLR4_5_21af1aflviclf89.R.inc(2206);negativeDataPropertyAssertionAxiomsByIndividual.put(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2207);
            __CLR4_5_21af1aflviclf89.R.inc(2208);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2209);differentIndividualsAxiomsByIndividual.put(ind, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2210);
            __CLR4_5_21af1aflviclf89.R.inc(2211);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2212);disjointDataPropertyAxiomsByProperty.put(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2213);
            __CLR4_5_21af1aflviclf89.R.inc(2214);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2215);disjointObjectPropertyAxiomsByProperty.put(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2216);
            __CLR4_5_21af1aflviclf89.R.inc(2217);objectPropertyRangeAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2218);
            __CLR4_5_21af1aflviclf89.R.inc(2219);objectPropertyAssertionsByIndividual.put(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2220);
            __CLR4_5_21af1aflviclf89.R.inc(2221);functionalObjectPropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2222);
            __CLR4_5_21af1aflviclf89.R.inc(2223);objectSubPropertyAxiomsBySubPosition.put(axiom.getSubProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2224);objectSubPropertyAxiomsBySuperPosition.put(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2225);
            __CLR4_5_21af1aflviclf89.R.inc(2226);disjointUnionAxiomsByClass.put(axiom.getOWLClass(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2227);classAxiomsByClass.put(axiom.getOWLClass(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2228);
            __CLR4_5_21af1aflviclf89.R.inc(2229);declarationsByEntity.put(axiom.getEntity(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2230);
            __CLR4_5_21af1aflviclf89.R.inc(2231);annotationAssertionAxiomsBySubject.put(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2232);
            __CLR4_5_21af1aflviclf89.R.inc(2233);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2234)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2235)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2236);hasKeyAxiomsByClass.put(axiom.getClassExpression().asOWLClass(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2237);
            __CLR4_5_21af1aflviclf89.R.inc(2238);symmetricPropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2239);
            __CLR4_5_21af1aflviclf89.R.inc(2240);dataPropertyRangeAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2241);
            __CLR4_5_21af1aflviclf89.R.inc(2242);functionalDataPropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2243);
            __CLR4_5_21af1aflviclf89.R.inc(2244);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2245);equivalentDataPropertyAxiomsByProperty.put(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2246);
            __CLR4_5_21af1aflviclf89.R.inc(2247);classAssertionAxiomsByIndividual.put(axiom.getIndividual(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2248);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2249)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2250)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2251);classAssertionAxiomsByClass.put(axiom.getClassExpression(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2252);
            __CLR4_5_21af1aflviclf89.R.inc(2253);boolean allAnon = true;
            __CLR4_5_21af1aflviclf89.R.inc(2254);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2255);if ((((!desc.isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2256)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2257)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2258);equivalentClassesAxiomsByClass.put((OWLClass) desc, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2259);classAxiomsByClass.put((OWLClass) desc, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2260);allAnon = false;
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(2261);if ((((allAnon)&&(__CLR4_5_21af1aflviclf89.R.iget(2262)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2263)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2264);addGeneralClassAxioms(axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2265);
            __CLR4_5_21af1aflviclf89.R.inc(2266);dataPropertyAssertionsByIndividual.put(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2267);
            __CLR4_5_21af1aflviclf89.R.inc(2268);transitivePropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2269);
            __CLR4_5_21af1aflviclf89.R.inc(2270);irreflexivePropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2271);
            __CLR4_5_21af1aflviclf89.R.inc(2272);dataSubPropertyAxiomsBySubPosition.put(axiom.getSubProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2273);dataSubPropertyAxiomsBySuperPosition.put(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2274);
            __CLR4_5_21af1aflviclf89.R.inc(2275);inverseFunctionalPropertyAxiomsByProperty.put(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2276);
            __CLR4_5_21af1aflviclf89.R.inc(2277);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2278);sameIndividualsAxiomsByIndividual.put(ind, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2279);
            __CLR4_5_21af1aflviclf89.R.inc(2280);addPropertyChainSubPropertyAxioms(axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
    }

    class RemoveAxiomVisitor extends OWLAxiomVisitorAdapter implements Serializable {

        private static final long serialVersionUID = 40000L;

        @Override
        public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2281);
            __CLR4_5_21af1aflviclf89.R.inc(2282);if ((((!axiom.getSubClass().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2283)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2284)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2285);OWLClass subClass = (OWLClass) axiom.getSubClass();
                __CLR4_5_21af1aflviclf89.R.inc(2286);subClassAxiomsBySubPosition.remove(subClass, axiom);
                __CLR4_5_21af1aflviclf89.R.inc(2287);classAxiomsByClass.remove(subClass, axiom);
            } }else {{
                __CLR4_5_21af1aflviclf89.R.inc(2288);removeGeneralClassAxioms(axiom);
            }
            }__CLR4_5_21af1aflviclf89.R.inc(2289);if ((((!axiom.getSuperClass().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2290)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2291)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2292);subClassAxiomsBySuperPosition.remove(axiom.getSuperClass().asOWLClass(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2293);
            __CLR4_5_21af1aflviclf89.R.inc(2294);negativeObjectPropertyAssertionAxiomsByIndividual.remove(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2295);
            __CLR4_5_21af1aflviclf89.R.inc(2296);asymmetricPropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2297);
            __CLR4_5_21af1aflviclf89.R.inc(2298);reflexivePropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2299);
            __CLR4_5_21af1aflviclf89.R.inc(2300);boolean allAnon = true;
            __CLR4_5_21af1aflviclf89.R.inc(2301);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2302);if ((((!desc.isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2303)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2304)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2305);OWLClass cls = (OWLClass) desc;
                    __CLR4_5_21af1aflviclf89.R.inc(2306);disjointClassesAxiomsByClass.remove(cls, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2307);classAxiomsByClass.remove(cls, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2308);allAnon = false;
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(2309);if ((((allAnon)&&(__CLR4_5_21af1aflviclf89.R.iget(2310)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2311)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2312);removeGeneralClassAxioms(axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2313);
            __CLR4_5_21af1aflviclf89.R.inc(2314);dataPropertyDomainAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2315);
            __CLR4_5_21af1aflviclf89.R.inc(2316);if ((((axiom.getProperty() instanceof OWLObjectProperty)&&(__CLR4_5_21af1aflviclf89.R.iget(2317)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2318)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2319);objectPropertyDomainAxiomsByProperty.remove(axiom.getProperty(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2320);
            __CLR4_5_21af1aflviclf89.R.inc(2321);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2322);equivalentObjectPropertyAxiomsByProperty.remove(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2323);
            __CLR4_5_21af1aflviclf89.R.inc(2324);inversePropertyAxiomsByProperty.remove(axiom.getFirstProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2325);inversePropertyAxiomsByProperty.remove(axiom.getSecondProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2326);
            __CLR4_5_21af1aflviclf89.R.inc(2327);negativeDataPropertyAssertionAxiomsByIndividual.remove(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2328);
            __CLR4_5_21af1aflviclf89.R.inc(2329);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2330);differentIndividualsAxiomsByIndividual.remove(ind, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2331);
            __CLR4_5_21af1aflviclf89.R.inc(2332);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2333);disjointDataPropertyAxiomsByProperty.remove(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2334);
            __CLR4_5_21af1aflviclf89.R.inc(2335);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2336);disjointObjectPropertyAxiomsByProperty.remove(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2337);
            __CLR4_5_21af1aflviclf89.R.inc(2338);objectPropertyRangeAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2339);
            __CLR4_5_21af1aflviclf89.R.inc(2340);objectPropertyAssertionsByIndividual.remove(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2341);
            __CLR4_5_21af1aflviclf89.R.inc(2342);functionalObjectPropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2343);
            __CLR4_5_21af1aflviclf89.R.inc(2344);objectSubPropertyAxiomsBySubPosition.remove(axiom.getSubProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2345);objectSubPropertyAxiomsBySuperPosition.remove(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2346);
            __CLR4_5_21af1aflviclf89.R.inc(2347);disjointUnionAxiomsByClass.remove(axiom.getOWLClass(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2348);classAxiomsByClass.remove(axiom.getOWLClass(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2349);
            __CLR4_5_21af1aflviclf89.R.inc(2350);declarationsByEntity.remove(axiom.getEntity(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2351);
            __CLR4_5_21af1aflviclf89.R.inc(2352);annotationAssertionAxiomsBySubject.remove(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2353);
            __CLR4_5_21af1aflviclf89.R.inc(2354);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2355)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2356)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2357);hasKeyAxiomsByClass.remove(axiom.getClassExpression().asOWLClass(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2358);
            __CLR4_5_21af1aflviclf89.R.inc(2359);symmetricPropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2360);
            __CLR4_5_21af1aflviclf89.R.inc(2361);dataPropertyRangeAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2362);
            __CLR4_5_21af1aflviclf89.R.inc(2363);functionalDataPropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2364);
            __CLR4_5_21af1aflviclf89.R.inc(2365);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2366);equivalentDataPropertyAxiomsByProperty.remove(prop, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2367);
            __CLR4_5_21af1aflviclf89.R.inc(2368);classAssertionAxiomsByIndividual.remove(axiom.getIndividual(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2369);if ((((!axiom.getClassExpression().isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2370)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2371)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2372);classAssertionAxiomsByClass.remove(axiom.getClassExpression(), axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2373);
            __CLR4_5_21af1aflviclf89.R.inc(2374);boolean allAnon = true;
            __CLR4_5_21af1aflviclf89.R.inc(2375);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2376);if ((((!desc.isAnonymous())&&(__CLR4_5_21af1aflviclf89.R.iget(2377)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2378)==0&false))) {{
                    __CLR4_5_21af1aflviclf89.R.inc(2379);equivalentClassesAxiomsByClass.remove((OWLClass) desc, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2380);classAxiomsByClass.remove((OWLClass) desc, axiom);
                    __CLR4_5_21af1aflviclf89.R.inc(2381);allAnon = false;
                }
            }}
            }__CLR4_5_21af1aflviclf89.R.inc(2382);if ((((allAnon)&&(__CLR4_5_21af1aflviclf89.R.iget(2383)!=0|true))||(__CLR4_5_21af1aflviclf89.R.iget(2384)==0&false))) {{
                __CLR4_5_21af1aflviclf89.R.inc(2385);removeGeneralClassAxioms(axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2386);
            __CLR4_5_21af1aflviclf89.R.inc(2387);dataPropertyAssertionsByIndividual.remove(axiom.getSubject(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2388);
            __CLR4_5_21af1aflviclf89.R.inc(2389);transitivePropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2390);
            __CLR4_5_21af1aflviclf89.R.inc(2391);irreflexivePropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2392);
            __CLR4_5_21af1aflviclf89.R.inc(2393);dataSubPropertyAxiomsBySubPosition.remove(axiom.getSubProperty(), axiom);
            __CLR4_5_21af1aflviclf89.R.inc(2394);dataSubPropertyAxiomsBySuperPosition.remove(axiom.getSuperProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2395);
            __CLR4_5_21af1aflviclf89.R.inc(2396);inverseFunctionalPropertyAxiomsByProperty.remove(axiom.getProperty(), axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2397);
            __CLR4_5_21af1aflviclf89.R.inc(2398);for (OWLIndividual ind : axiom.getIndividuals()) {{
                __CLR4_5_21af1aflviclf89.R.inc(2399);sameIndividualsAxiomsByIndividual.remove(ind, axiom);
            }
        }}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_21af1aflviclf89.R.inc(2400);
            __CLR4_5_21af1aflviclf89.R.inc(2401);removePropertyChainSubPropertyAxioms(axiom);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
    }

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_21af1aflviclf89.R.inc(2402);
        __CLR4_5_21af1aflviclf89.R.inc(2403);StringBuilder b = new StringBuilder("Internals{(first 20 axioms) ");
        __CLR4_5_21af1aflviclf89.R.inc(2404);for (OWLAxiom ax : Iterables.limit(axiomsByType.getAllValues(), 20)) {{
            __CLR4_5_21af1aflviclf89.R.inc(2405);b.append(ax).append('\n');
        }
        }__CLR4_5_21af1aflviclf89.R.inc(2406);b.append('}');
        __CLR4_5_21af1aflviclf89.R.inc(2407);return b.toString();
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param entity
     *        entity to check
     * @return true if reference is contained
     */
    public boolean containsReference(@Nonnull OWLEntity entity) {try{__CLR4_5_21af1aflviclf89.R.inc(2408);
        __CLR4_5_21af1aflviclf89.R.inc(2409);return entity.accept(refChecker);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    /**
     * @param owlEntity
     *        entity to describe
     * @return referencing axioms
     */
    @Nonnull
    public Iterable<OWLAxiom> getReferencingAxioms(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_21af1aflviclf89.R.inc(2410);
        __CLR4_5_21af1aflviclf89.R.inc(2411);return owlEntity.accept(refAxiomsCollector);
    }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

    private class ReferencedAxiomsCollector implements OWLEntityVisitorEx<Iterable<OWLAxiom>>, Serializable {

        private static final long serialVersionUID = 40000L;

        ReferencedAxiomsCollector() {try{__CLR4_5_21af1aflviclf89.R.inc(2412);}finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLClass cls) {try{__CLR4_5_21af1aflviclf89.R.inc(2413);
            __CLR4_5_21af1aflviclf89.R.inc(2414);return owlClassReferences.getValues(cls);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLObjectProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2415);
            __CLR4_5_21af1aflviclf89.R.inc(2416);return owlObjectPropertyReferences.getValues(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLDataProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2417);
            __CLR4_5_21af1aflviclf89.R.inc(2418);return owlDataPropertyReferences.getValues(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLNamedIndividual individual) {try{__CLR4_5_21af1aflviclf89.R.inc(2419);
            __CLR4_5_21af1aflviclf89.R.inc(2420);return owlIndividualReferences.getValues(individual);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLDatatype datatype) {try{__CLR4_5_21af1aflviclf89.R.inc(2421);
            __CLR4_5_21af1aflviclf89.R.inc(2422);return owlDatatypeReferences.getValues(datatype);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}

        @Override
        public Iterable<OWLAxiom> visit(OWLAnnotationProperty property) {try{__CLR4_5_21af1aflviclf89.R.inc(2423);
            __CLR4_5_21af1aflviclf89.R.inc(2424);return owlAnnotationPropertyReferences.getValues(property);
        }finally{__CLR4_5_21af1aflviclf89.R.flushNeeded();}}
    }
}
