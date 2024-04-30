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
package org.semanticweb.owlapi.apibinding;

import static org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.getNextDocumentIRI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;

/**
 * A utility class whose methods may be statically imported so that OWL API
 * objects can be constructed by writing code that looks like the OWL 2
 * Functional Syntax. <br>
 * Note that this class is primarily intended for developers who need to write
 * test cases. Normal client code should probably use an
 * {@link org.semanticweb.owlapi.model.OWLDataFactory} for creating objects.
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public final class OWLFunctionalSyntaxFactory {public static class __CLR4_5_200lvicniiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u0062\u0069\u006e\u0064\u0069\u006e\u0067\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237341989L,8589935092L,279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String URNTESTS_URI = "urn:tests#uri";
    private static final OWLDataFactory DF = OWLManager.getOWLDataFactory();

    private OWLFunctionalSyntaxFactory() {try{__CLR4_5_200lvicniiv.R.inc(0);}finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLImportsDeclaration ImportsDeclaration(@Nonnull IRI i) {try{__CLR4_5_200lvicniiv.R.inc(1);
        __CLR4_5_200lvicniiv.R.inc(2);return DF.getOWLImportsDeclaration(i);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    // Entities
    @Nonnull
    public static OWLClass Class(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(3);
        __CLR4_5_200lvicniiv.R.inc(4);return DF.getOWLClass(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClass createClass() {try{__CLR4_5_200lvicniiv.R.inc(5);
        __CLR4_5_200lvicniiv.R.inc(6);return Class(getNextDocumentIRI(URNTESTS_URI));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectProperty createObjectProperty() {try{__CLR4_5_200lvicniiv.R.inc(7);
        __CLR4_5_200lvicniiv.R.inc(8);return ObjectProperty(getNextDocumentIRI(URNTESTS_URI));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataProperty createDataProperty() {try{__CLR4_5_200lvicniiv.R.inc(9);
        __CLR4_5_200lvicniiv.R.inc(10);return DataProperty(getNextDocumentIRI(URNTESTS_URI));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLNamedIndividual createIndividual() {try{__CLR4_5_200lvicniiv.R.inc(11);
        __CLR4_5_200lvicniiv.R.inc(12);return NamedIndividual(getNextDocumentIRI(URNTESTS_URI));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationProperty createAnnotationProperty() {try{__CLR4_5_200lvicniiv.R.inc(13);
        __CLR4_5_200lvicniiv.R.inc(14);return AnnotationProperty(getNextDocumentIRI(URNTESTS_URI));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    public static OWLLiteral createOWLLiteral() {try{__CLR4_5_200lvicniiv.R.inc(15);
        __CLR4_5_200lvicniiv.R.inc(16);return Literal("Test" + System.currentTimeMillis(),
                Datatype(getNextDocumentIRI(URNTESTS_URI)));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClass Class(@Nonnull String abbreviatedIRI,
            @Nonnull PrefixManager pm) {try{__CLR4_5_200lvicniiv.R.inc(17);
        __CLR4_5_200lvicniiv.R.inc(18);return DF.getOWLClass(abbreviatedIRI, pm);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationProperty RDFSComment() {try{__CLR4_5_200lvicniiv.R.inc(19);
        __CLR4_5_200lvicniiv.R.inc(20);return DF.getRDFSComment();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationProperty RDFSLabel() {try{__CLR4_5_200lvicniiv.R.inc(21);
        __CLR4_5_200lvicniiv.R.inc(22);return DF.getRDFSLabel();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype TopDatatype() {try{__CLR4_5_200lvicniiv.R.inc(23);
        __CLR4_5_200lvicniiv.R.inc(24);return DF.getTopDatatype();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClass OWLThing() {try{__CLR4_5_200lvicniiv.R.inc(25);
        __CLR4_5_200lvicniiv.R.inc(26);return DF.getOWLThing();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype Integer() {try{__CLR4_5_200lvicniiv.R.inc(27);
        __CLR4_5_200lvicniiv.R.inc(28);return DF.getIntegerOWLDatatype();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype Double() {try{__CLR4_5_200lvicniiv.R.inc(29);
        __CLR4_5_200lvicniiv.R.inc(30);return DF.getDoubleOWLDatatype();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype Float() {try{__CLR4_5_200lvicniiv.R.inc(31);
        __CLR4_5_200lvicniiv.R.inc(32);return DF.getFloatOWLDatatype();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype Boolean() {try{__CLR4_5_200lvicniiv.R.inc(33);
        __CLR4_5_200lvicniiv.R.inc(34);return DF.getBooleanOWLDatatype();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClass OWLNothing() {try{__CLR4_5_200lvicniiv.R.inc(35);
        __CLR4_5_200lvicniiv.R.inc(36);return DF.getOWLNothing();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectProperty ObjectProperty(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(37);
        __CLR4_5_200lvicniiv.R.inc(38);return DF.getOWLObjectProperty(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectProperty ObjectProperty(
            @Nonnull String abbreviatedIRI, @Nonnull PrefixManager pm) {try{__CLR4_5_200lvicniiv.R.inc(39);
        __CLR4_5_200lvicniiv.R.inc(40);return DF.getOWLObjectProperty(abbreviatedIRI, pm);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectInverseOf ObjectInverseOf(
            @Nonnull OWLObjectPropertyExpression pe) {try{__CLR4_5_200lvicniiv.R.inc(41);
        __CLR4_5_200lvicniiv.R.inc(42);return DF.getOWLObjectInverseOf(pe);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataProperty DataProperty(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(43);
        __CLR4_5_200lvicniiv.R.inc(44);return DF.getOWLDataProperty(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataProperty DataProperty(@Nonnull String abbreviatedIRI,
            @Nonnull PrefixManager pm) {try{__CLR4_5_200lvicniiv.R.inc(45);
        __CLR4_5_200lvicniiv.R.inc(46);return DF.getOWLDataProperty(abbreviatedIRI, pm);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationProperty AnnotationProperty(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(47);
        __CLR4_5_200lvicniiv.R.inc(48);return DF.getOWLAnnotationProperty(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationProperty AnnotationProperty(
            @Nonnull String abbreviatedIRI, @Nonnull PrefixManager pm) {try{__CLR4_5_200lvicniiv.R.inc(49);
        __CLR4_5_200lvicniiv.R.inc(50);return DF.getOWLAnnotationProperty(abbreviatedIRI, pm);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLNamedIndividual NamedIndividual(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(51);
        __CLR4_5_200lvicniiv.R.inc(52);return DF.getOWLNamedIndividual(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnonymousIndividual AnonymousIndividual() {try{__CLR4_5_200lvicniiv.R.inc(53);
        __CLR4_5_200lvicniiv.R.inc(54);return DF.getOWLAnonymousIndividual();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnonymousIndividual
            AnonymousIndividual(@Nonnull String id) {try{__CLR4_5_200lvicniiv.R.inc(55);
        __CLR4_5_200lvicniiv.R.inc(56);return DF.getOWLAnonymousIndividual(id);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLNamedIndividual NamedIndividual(
            @Nonnull String abbreviatedIRI, @Nonnull PrefixManager pm) {try{__CLR4_5_200lvicniiv.R.inc(57);
        __CLR4_5_200lvicniiv.R.inc(58);return DF.getOWLNamedIndividual(abbreviatedIRI, pm);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype Datatype(@Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(59);
        __CLR4_5_200lvicniiv.R.inc(60);return DF.getOWLDatatype(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDeclarationAxiom Declaration(@Nonnull OWLEntity entity) {try{__CLR4_5_200lvicniiv.R.inc(61);
        __CLR4_5_200lvicniiv.R.inc(62);return DF.getOWLDeclarationAxiom(entity);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDeclarationAxiom Declaration(@Nonnull OWLEntity entity,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(63);
        __CLR4_5_200lvicniiv.R.inc(64);return DF.getOWLDeclarationAxiom(entity, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    // Class Expressions
    @Nonnull
    public static OWLObjectIntersectionOf ObjectIntersectionOf(
            @Nonnull OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(65);
        __CLR4_5_200lvicniiv.R.inc(66);return DF.getOWLObjectIntersectionOf(classExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectUnionOf ObjectUnionOf(
            @Nonnull OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(67);
        __CLR4_5_200lvicniiv.R.inc(68);return DF.getOWLObjectUnionOf(classExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectComplementOf ObjectComplementOf(
            @Nonnull OWLClassExpression classExpression) {try{__CLR4_5_200lvicniiv.R.inc(69);
        __CLR4_5_200lvicniiv.R.inc(70);return DF.getOWLObjectComplementOf(classExpression);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectSomeValuesFrom ObjectSomeValuesFrom(
            @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLClassExpression ce) {try{__CLR4_5_200lvicniiv.R.inc(71);
        __CLR4_5_200lvicniiv.R.inc(72);return DF.getOWLObjectSomeValuesFrom(pe, ce);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectAllValuesFrom ObjectAllValuesFrom(
            @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLClassExpression ce) {try{__CLR4_5_200lvicniiv.R.inc(73);
        __CLR4_5_200lvicniiv.R.inc(74);return DF.getOWLObjectAllValuesFrom(pe, ce);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectHasValue ObjectHasValue(
            @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLIndividual individual) {try{__CLR4_5_200lvicniiv.R.inc(75);
        __CLR4_5_200lvicniiv.R.inc(76);return DF.getOWLObjectHasValue(pe, individual);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectMinCardinality ObjectMinCardinality(int cardinality,
            @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLClassExpression ce) {try{__CLR4_5_200lvicniiv.R.inc(77);
        __CLR4_5_200lvicniiv.R.inc(78);return DF.getOWLObjectMinCardinality(cardinality, pe, ce);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectMaxCardinality ObjectMaxCardinality(int cardinality,
            @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLClassExpression ce) {try{__CLR4_5_200lvicniiv.R.inc(79);
        __CLR4_5_200lvicniiv.R.inc(80);return DF.getOWLObjectMaxCardinality(cardinality, pe, ce);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectExactCardinality ObjectExactCardinality(
            int cardinality, @Nonnull OWLObjectPropertyExpression pe,
            @Nonnull OWLClassExpression ce) {try{__CLR4_5_200lvicniiv.R.inc(81);
        __CLR4_5_200lvicniiv.R.inc(82);return DF.getOWLObjectExactCardinality(cardinality, pe, ce);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectHasSelf ObjectHasSelf(
            @Nonnull OWLObjectPropertyExpression pe) {try{__CLR4_5_200lvicniiv.R.inc(83);
        __CLR4_5_200lvicniiv.R.inc(84);return DF.getOWLObjectHasSelf(pe);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectOneOf ObjectOneOf(
            @Nonnull OWLIndividual... individuals) {try{__CLR4_5_200lvicniiv.R.inc(85);
        __CLR4_5_200lvicniiv.R.inc(86);return DF.getOWLObjectOneOf(individuals);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataSomeValuesFrom DataSomeValuesFrom(
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLDataRange dr) {try{__CLR4_5_200lvicniiv.R.inc(87);
        __CLR4_5_200lvicniiv.R.inc(88);return DF.getOWLDataSomeValuesFrom(pe, dr);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataAllValuesFrom DataAllValuesFrom(
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLDataRange dr) {try{__CLR4_5_200lvicniiv.R.inc(89);
        __CLR4_5_200lvicniiv.R.inc(90);return DF.getOWLDataAllValuesFrom(pe, dr);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataHasValue DataHasValue(
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLLiteral literal) {try{__CLR4_5_200lvicniiv.R.inc(91);
        __CLR4_5_200lvicniiv.R.inc(92);return DF.getOWLDataHasValue(pe, literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataMinCardinality DataMinCardinality(int cardinality,
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLDataRange dr) {try{__CLR4_5_200lvicniiv.R.inc(93);
        __CLR4_5_200lvicniiv.R.inc(94);return DF.getOWLDataMinCardinality(cardinality, pe, dr);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataMaxCardinality DataMaxCardinality(int cardinality,
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLDataRange dr) {try{__CLR4_5_200lvicniiv.R.inc(95);
        __CLR4_5_200lvicniiv.R.inc(96);return DF.getOWLDataMaxCardinality(cardinality, pe, dr);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataExactCardinality DataExactCardinality(int cardinality,
            @Nonnull OWLDataPropertyExpression pe, @Nonnull OWLDataRange dr) {try{__CLR4_5_200lvicniiv.R.inc(97);
        __CLR4_5_200lvicniiv.R.inc(98);return DF.getOWLDataExactCardinality(cardinality, pe, dr);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    // Data Ranges other than datatype
    @Nonnull
    public static OWLDataIntersectionOf DataIntersectionOf(
            @Nonnull OWLDataRange... dataRanges) {try{__CLR4_5_200lvicniiv.R.inc(99);
        __CLR4_5_200lvicniiv.R.inc(100);return DF.getOWLDataIntersectionOf(dataRanges);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataUnionOf DataUnionOf(
            @Nonnull OWLDataRange... dataRanges) {try{__CLR4_5_200lvicniiv.R.inc(101);
        __CLR4_5_200lvicniiv.R.inc(102);return DF.getOWLDataUnionOf(dataRanges);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataComplementOf DataComplementOf(
            @Nonnull OWLDataRange dataRange) {try{__CLR4_5_200lvicniiv.R.inc(103);
        __CLR4_5_200lvicniiv.R.inc(104);return DF.getOWLDataComplementOf(dataRange);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataOneOf DataOneOf(@Nonnull OWLLiteral... literals) {try{__CLR4_5_200lvicniiv.R.inc(105);
        __CLR4_5_200lvicniiv.R.inc(106);return DF.getOWLDataOneOf(literals);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatypeRestriction DatatypeRestriction(
            @Nonnull OWLDatatype datatype,
            @Nonnull OWLFacetRestriction... facetRestrictions) {try{__CLR4_5_200lvicniiv.R.inc(107);
        __CLR4_5_200lvicniiv.R.inc(108);return DF.getOWLDatatypeRestriction(datatype, facetRestrictions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLFacetRestriction FacetRestriction(@Nonnull OWLFacet facet,
            @Nonnull OWLLiteral facetValue) {try{__CLR4_5_200lvicniiv.R.inc(109);
        __CLR4_5_200lvicniiv.R.inc(110);return DF.getOWLFacetRestriction(facet, facetValue);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    // Axioms
    @Nonnull
    public static OWLSubClassOfAxiom SubClassOf(
            @Nonnull OWLClassExpression subClass,
            @Nonnull OWLClassExpression superClass) {try{__CLR4_5_200lvicniiv.R.inc(111);
        __CLR4_5_200lvicniiv.R.inc(112);return DF.getOWLSubClassOfAxiom(subClass, superClass);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubClassOfAxiom SubClassOf(
            @Nonnull OWLClassExpression subClass,
            @Nonnull OWLClassExpression superClass,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(113);
        __CLR4_5_200lvicniiv.R.inc(114);return DF.getOWLSubClassOfAxiom(subClass, superClass, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentClassesAxiom EquivalentClasses(
            @Nonnull OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(115);
        __CLR4_5_200lvicniiv.R.inc(116);return DF.getOWLEquivalentClassesAxiom(classExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentClassesAxiom EquivalentClasses(
            @Nonnull Set<OWLAnnotation> a,
            OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(117);
        __CLR4_5_200lvicniiv.R.inc(118);return DF.getOWLEquivalentClassesAxiom(
                new HashSet<>(Arrays.asList(classExpressions)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointClassesAxiom DisjointClasses(
            @Nonnull OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(119);
        __CLR4_5_200lvicniiv.R.inc(120);return DF.getOWLDisjointClassesAxiom(classExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointClassesAxiom DisjointClasses(
            @Nonnull Set<? extends OWLClassExpression> classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(121);
        __CLR4_5_200lvicniiv.R.inc(122);return DF.getOWLDisjointClassesAxiom(classExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointClassesAxiom DisjointClasses(
            @Nonnull Set<OWLClassExpression> classExpressions,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(123);
        __CLR4_5_200lvicniiv.R.inc(124);return DF.getOWLDisjointClassesAxiom(classExpressions, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointUnionAxiom DisjointUnion(@Nonnull OWLClass cls,
            @Nonnull OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(125);
        __CLR4_5_200lvicniiv.R.inc(126);return DF.getOWLDisjointUnionAxiom(cls,
                CollectionFactory.createSet(classExpressions));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointClassesAxiom DisjointClasses(
            @Nonnull Set<OWLAnnotation> a,
            OWLClassExpression... classExpressions) {try{__CLR4_5_200lvicniiv.R.inc(127);
        __CLR4_5_200lvicniiv.R.inc(128);return DF.getOWLDisjointClassesAxiom(
                new HashSet<>(Arrays.asList(classExpressions)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubObjectPropertyOfAxiom SubObjectPropertyOf(
            @Nonnull OWLObjectPropertyExpression subProperty,
            @Nonnull OWLObjectPropertyExpression superProperty) {try{__CLR4_5_200lvicniiv.R.inc(129);
        __CLR4_5_200lvicniiv.R.inc(130);return DF.getOWLSubObjectPropertyOfAxiom(subProperty, superProperty);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubPropertyChainOfAxiom SubPropertyChainOf(
            @Nonnull List<? extends OWLObjectPropertyExpression> chain,
            @Nonnull OWLObjectPropertyExpression superProperty) {try{__CLR4_5_200lvicniiv.R.inc(131);
        __CLR4_5_200lvicniiv.R.inc(132);return DF.getOWLSubPropertyChainOfAxiom(chain, superProperty);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubPropertyChainOfAxiom SubPropertyChainOf(
            @Nonnull List<? extends OWLObjectPropertyExpression> chain,
            @Nonnull OWLObjectPropertyExpression superProperty,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(133);
        __CLR4_5_200lvicniiv.R.inc(134);return DF.getOWLSubPropertyChainOfAxiom(chain, superProperty, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubObjectPropertyOfAxiom SubObjectPropertyOf(
            @Nonnull OWLObjectPropertyExpression subProperty,
            @Nonnull OWLObjectPropertyExpression superProperty,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(135);
        __CLR4_5_200lvicniiv.R.inc(136);return DF.getOWLSubObjectPropertyOfAxiom(subProperty, superProperty, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentObjectPropertiesAxiom
            EquivalentObjectProperties(
                    @Nonnull OWLObjectPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(137);
        __CLR4_5_200lvicniiv.R.inc(138);return DF.getOWLEquivalentObjectPropertiesAxiom(properties);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentObjectPropertiesAxiom
            EquivalentObjectProperties(@Nonnull Set<OWLAnnotation> a,
                    OWLObjectPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(139);
        __CLR4_5_200lvicniiv.R.inc(140);return DF.getOWLEquivalentObjectPropertiesAxiom(
                new HashSet<>(Arrays.asList(properties)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointObjectPropertiesAxiom DisjointObjectProperties(
            @Nonnull OWLObjectPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(141);
        __CLR4_5_200lvicniiv.R.inc(142);return DF.getOWLDisjointObjectPropertiesAxiom(properties);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointObjectPropertiesAxiom DisjointObjectProperties(
            @Nonnull Set<OWLAnnotation> a,
            OWLObjectPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(143);
        __CLR4_5_200lvicniiv.R.inc(144);return DF.getOWLDisjointObjectPropertiesAxiom(
                new HashSet<>(Arrays.asList(properties)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLInverseObjectPropertiesAxiom InverseObjectProperties(
            @Nonnull OWLObjectPropertyExpression peA,
            @Nonnull OWLObjectPropertyExpression peB) {try{__CLR4_5_200lvicniiv.R.inc(145);
        __CLR4_5_200lvicniiv.R.inc(146);return DF.getOWLInverseObjectPropertiesAxiom(peA, peB);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyDomainAxiom ObjectPropertyDomain(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLClassExpression domain) {try{__CLR4_5_200lvicniiv.R.inc(147);
        __CLR4_5_200lvicniiv.R.inc(148);return DF.getOWLObjectPropertyDomainAxiom(property, domain);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyDomainAxiom ObjectPropertyDomain(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLClassExpression domain, @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(149);
        __CLR4_5_200lvicniiv.R.inc(150);return DF.getOWLObjectPropertyDomainAxiom(property, domain, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyRangeAxiom ObjectPropertyRange(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLClassExpression range) {try{__CLR4_5_200lvicniiv.R.inc(151);
        __CLR4_5_200lvicniiv.R.inc(152);return DF.getOWLObjectPropertyRangeAxiom(property, range);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyRangeAxiom ObjectPropertyRange(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLClassExpression range, @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(153);
        __CLR4_5_200lvicniiv.R.inc(154);return DF.getOWLObjectPropertyRangeAxiom(property, range, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLFunctionalObjectPropertyAxiom FunctionalObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(155);
        __CLR4_5_200lvicniiv.R.inc(156);return DF.getOWLFunctionalObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLFunctionalObjectPropertyAxiom FunctionalObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(157);
        __CLR4_5_200lvicniiv.R.inc(158);return DF.getOWLFunctionalObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLInverseFunctionalObjectPropertyAxiom
            InverseFunctionalObjectProperty(
                    @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(159);
        __CLR4_5_200lvicniiv.R.inc(160);return DF.getOWLInverseFunctionalObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLInverseFunctionalObjectPropertyAxiom
            InverseFunctionalObjectProperty(
                    @Nonnull OWLObjectPropertyExpression property,
                    @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(161);
        __CLR4_5_200lvicniiv.R.inc(162);return DF.getOWLInverseFunctionalObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLReflexiveObjectPropertyAxiom ReflexiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(163);
        __CLR4_5_200lvicniiv.R.inc(164);return DF.getOWLReflexiveObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLReflexiveObjectPropertyAxiom ReflexiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(165);
        __CLR4_5_200lvicniiv.R.inc(166);return DF.getOWLReflexiveObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLIrreflexiveObjectPropertyAxiom IrreflexiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(167);
        __CLR4_5_200lvicniiv.R.inc(168);return DF.getOWLIrreflexiveObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLIrreflexiveObjectPropertyAxiom IrreflexiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(169);
        __CLR4_5_200lvicniiv.R.inc(170);return DF.getOWLIrreflexiveObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSymmetricObjectPropertyAxiom SymmetricObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(171);
        __CLR4_5_200lvicniiv.R.inc(172);return DF.getOWLSymmetricObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSymmetricObjectPropertyAxiom SymmetricObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(173);
        __CLR4_5_200lvicniiv.R.inc(174);return DF.getOWLSymmetricObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAsymmetricObjectPropertyAxiom AsymmetricObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(175);
        __CLR4_5_200lvicniiv.R.inc(176);return DF.getOWLAsymmetricObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAsymmetricObjectPropertyAxiom AsymmetricObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(177);
        __CLR4_5_200lvicniiv.R.inc(178);return DF.getOWLAsymmetricObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLTransitiveObjectPropertyAxiom TransitiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(179);
        __CLR4_5_200lvicniiv.R.inc(180);return DF.getOWLTransitiveObjectPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLTransitiveObjectPropertyAxiom TransitiveObjectProperty(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(181);
        __CLR4_5_200lvicniiv.R.inc(182);return DF.getOWLTransitiveObjectPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubDataPropertyOfAxiom SubDataPropertyOf(
            @Nonnull OWLDataPropertyExpression subProperty,
            @Nonnull OWLDataPropertyExpression superProperty) {try{__CLR4_5_200lvicniiv.R.inc(183);
        __CLR4_5_200lvicniiv.R.inc(184);return DF.getOWLSubDataPropertyOfAxiom(subProperty, superProperty);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubDataPropertyOfAxiom SubDataPropertyOf(
            @Nonnull OWLDataPropertyExpression subProperty,
            @Nonnull OWLDataPropertyExpression superProperty,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(185);
        __CLR4_5_200lvicniiv.R.inc(186);return DF.getOWLSubDataPropertyOfAxiom(subProperty, superProperty, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentDataPropertiesAxiom EquivalentDataProperties(
            @Nonnull OWLDataPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(187);
        __CLR4_5_200lvicniiv.R.inc(188);return DF.getOWLEquivalentDataPropertiesAxiom(properties);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLEquivalentDataPropertiesAxiom EquivalentDataProperties(
            @Nonnull Set<OWLAnnotation> a,
            OWLDataPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(189);
        __CLR4_5_200lvicniiv.R.inc(190);return DF.getOWLEquivalentDataPropertiesAxiom(
                new HashSet<>(Arrays.asList(properties)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointDataPropertiesAxiom DisjointDataProperties(
            @Nonnull OWLDataPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(191);
        __CLR4_5_200lvicniiv.R.inc(192);return DF.getOWLDisjointDataPropertiesAxiom(properties);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDisjointDataPropertiesAxiom DisjointDataProperties(
            @Nonnull Set<OWLAnnotation> a,
            OWLDataPropertyExpression... properties) {try{__CLR4_5_200lvicniiv.R.inc(193);
        __CLR4_5_200lvicniiv.R.inc(194);return DF.getOWLDisjointDataPropertiesAxiom(
                new HashSet<>(Arrays.asList(properties)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyDomainAxiom DataPropertyDomain(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLClassExpression domain) {try{__CLR4_5_200lvicniiv.R.inc(195);
        __CLR4_5_200lvicniiv.R.inc(196);return DF.getOWLDataPropertyDomainAxiom(property, domain);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyDomainAxiom DataPropertyDomain(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLClassExpression domain, @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(197);
        __CLR4_5_200lvicniiv.R.inc(198);return DF.getOWLDataPropertyDomainAxiom(property, domain, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyRangeAxiom DataPropertyRange(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLDataRange range) {try{__CLR4_5_200lvicniiv.R.inc(199);
        __CLR4_5_200lvicniiv.R.inc(200);return DF.getOWLDataPropertyRangeAxiom(property, range);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyRangeAxiom DataPropertyRange(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLDataRange range, @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(201);
        __CLR4_5_200lvicniiv.R.inc(202);return DF.getOWLDataPropertyRangeAxiom(property, range, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLFunctionalDataPropertyAxiom FunctionalDataProperty(
            @Nonnull OWLDataPropertyExpression property) {try{__CLR4_5_200lvicniiv.R.inc(203);
        __CLR4_5_200lvicniiv.R.inc(204);return DF.getOWLFunctionalDataPropertyAxiom(property);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLFunctionalDataPropertyAxiom FunctionalDataProperty(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(205);
        __CLR4_5_200lvicniiv.R.inc(206);return DF.getOWLFunctionalDataPropertyAxiom(property, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatypeDefinitionAxiom DatatypeDefinition(
            @Nonnull OWLDatatype datatype, @Nonnull OWLDataRange dataRange) {try{__CLR4_5_200lvicniiv.R.inc(207);
        __CLR4_5_200lvicniiv.R.inc(208);return DF.getOWLDatatypeDefinitionAxiom(datatype, dataRange);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLHasKeyAxiom HasKey(
            @Nonnull OWLClassExpression classExpression,
            @Nonnull OWLPropertyExpression... propertyExpressions) {try{__CLR4_5_200lvicniiv.R.inc(209);
        __CLR4_5_200lvicniiv.R.inc(210);return DF.getOWLHasKeyAxiom(classExpression, propertyExpressions);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLHasKeyAxiom HasKey(@Nonnull Set<OWLAnnotation> a,
            @Nonnull OWLClassExpression classExpression,
            OWLPropertyExpression... propertyExpressions) {try{__CLR4_5_200lvicniiv.R.inc(211);
        __CLR4_5_200lvicniiv.R.inc(212);return DF.getOWLHasKeyAxiom(classExpression,
                new HashSet<>(Arrays.asList(propertyExpressions)), a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSameIndividualAxiom SameIndividual(
            @Nonnull OWLIndividual... individuals) {try{__CLR4_5_200lvicniiv.R.inc(213);
        __CLR4_5_200lvicniiv.R.inc(214);return DF.getOWLSameIndividualAxiom(individuals);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDifferentIndividualsAxiom DifferentIndividuals(
            @Nonnull OWLIndividual... individuals) {try{__CLR4_5_200lvicniiv.R.inc(215);
        __CLR4_5_200lvicniiv.R.inc(216);return DF.getOWLDifferentIndividualsAxiom(individuals);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClassAssertionAxiom ClassAssertion(
            @Nonnull OWLClassExpression ce, @Nonnull OWLIndividual ind,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(217);
        __CLR4_5_200lvicniiv.R.inc(218);return DF.getOWLClassAssertionAxiom(ce, ind, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLClassAssertionAxiom ClassAssertion(
            @Nonnull OWLClassExpression ce, @Nonnull OWLIndividual ind) {try{__CLR4_5_200lvicniiv.R.inc(219);
        __CLR4_5_200lvicniiv.R.inc(220);return DF.getOWLClassAssertionAxiom(ce, ind);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyAssertionAxiom ObjectPropertyAssertion(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLIndividual source, @Nonnull OWLIndividual target) {try{__CLR4_5_200lvicniiv.R.inc(221);
        __CLR4_5_200lvicniiv.R.inc(222);return DF.getOWLObjectPropertyAssertionAxiom(property, source, target);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLObjectPropertyAssertionAxiom ObjectPropertyAssertion(
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull OWLIndividual source, @Nonnull OWLIndividual target,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(223);
        __CLR4_5_200lvicniiv.R.inc(224);return DF.getOWLObjectPropertyAssertionAxiom(property, source, target,
                a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static
            OWLNegativeObjectPropertyAssertionAxiom
            NegativeObjectPropertyAssertion(
                    @Nonnull OWLObjectPropertyExpression property,
                    @Nonnull OWLIndividual source, @Nonnull OWLIndividual target) {try{__CLR4_5_200lvicniiv.R.inc(225);
        __CLR4_5_200lvicniiv.R.inc(226);return DF.getOWLNegativeObjectPropertyAssertionAxiom(property, source,
                target);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static
            OWLNegativeObjectPropertyAssertionAxiom
            NegativeObjectPropertyAssertion(
                    @Nonnull OWLObjectPropertyExpression property,
                    @Nonnull OWLIndividual source,
                    @Nonnull OWLIndividual target, @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(227);
        __CLR4_5_200lvicniiv.R.inc(228);return DF.getOWLNegativeObjectPropertyAssertionAxiom(property, source,
                target, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyAssertionAxiom DataPropertyAssertion(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLIndividual source, @Nonnull OWLLiteral target) {try{__CLR4_5_200lvicniiv.R.inc(229);
        __CLR4_5_200lvicniiv.R.inc(230);return DF.getOWLDataPropertyAssertionAxiom(property, source, target);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDataPropertyAssertionAxiom DataPropertyAssertion(
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLIndividual source, @Nonnull OWLLiteral target,
            @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(231);
        __CLR4_5_200lvicniiv.R.inc(232);return DF.getOWLDataPropertyAssertionAxiom(property, source, target, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLNegativeDataPropertyAssertionAxiom
            NegativeDataPropertyAssertion(
                    @Nonnull OWLDataPropertyExpression property,
                    @Nonnull OWLIndividual source, @Nonnull OWLLiteral target) {try{__CLR4_5_200lvicniiv.R.inc(233);
        __CLR4_5_200lvicniiv.R.inc(234);return DF.getOWLNegativeDataPropertyAssertionAxiom(property, source,
                target);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLNegativeDataPropertyAssertionAxiom
            NegativeDataPropertyAssertion(
                    @Nonnull OWLDataPropertyExpression property,
                    @Nonnull OWLIndividual source, @Nonnull OWLLiteral target,
                    @Nonnull Set<OWLAnnotation> a) {try{__CLR4_5_200lvicniiv.R.inc(235);
        __CLR4_5_200lvicniiv.R.inc(236);return DF.getOWLNegativeDataPropertyAssertionAxiom(property, source,
                target, a);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationAssertionAxiom AnnotationAssertion(
            @Nonnull OWLAnnotationProperty property,
            @Nonnull OWLAnnotationSubject subject,
            @Nonnull OWLAnnotationValue value) {try{__CLR4_5_200lvicniiv.R.inc(237);
        __CLR4_5_200lvicniiv.R.inc(238);return DF.getOWLAnnotationAssertionAxiom(property, subject, value);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotation Annotation(
            @Nonnull OWLAnnotationProperty property,
            @Nonnull OWLAnnotationValue value) {try{__CLR4_5_200lvicniiv.R.inc(239);
        __CLR4_5_200lvicniiv.R.inc(240);return DF.getOWLAnnotation(property, value);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLSubAnnotationPropertyOfAxiom SubAnnotationPropertyOf(
            @Nonnull OWLAnnotationProperty subProperty,
            @Nonnull OWLAnnotationProperty superProperty) {try{__CLR4_5_200lvicniiv.R.inc(241);
        __CLR4_5_200lvicniiv.R.inc(242);return DF
                .getOWLSubAnnotationPropertyOfAxiom(subProperty, superProperty);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationPropertyDomainAxiom AnnotationPropertyDomain(
            @Nonnull OWLAnnotationProperty property, @Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(243);
        __CLR4_5_200lvicniiv.R.inc(244);return DF.getOWLAnnotationPropertyDomainAxiom(property, iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationPropertyRangeAxiom AnnotationPropertyRange(
            @Nonnull OWLAnnotationProperty property, @Nonnull IRI iri) {try{__CLR4_5_200lvicniiv.R.inc(245);
        __CLR4_5_200lvicniiv.R.inc(246);return DF.getOWLAnnotationPropertyRangeAxiom(property, iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationPropertyDomainAxiom AnnotationPropertyDomain(
            @Nonnull OWLAnnotationProperty property, @Nonnull String iri) {try{__CLR4_5_200lvicniiv.R.inc(247);
        __CLR4_5_200lvicniiv.R.inc(248);return DF.getOWLAnnotationPropertyDomainAxiom(property, IRI(iri));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLAnnotationPropertyRangeAxiom AnnotationPropertyRange(
            @Nonnull OWLAnnotationProperty property, @Nonnull String iri) {try{__CLR4_5_200lvicniiv.R.inc(249);
        __CLR4_5_200lvicniiv.R.inc(250);return DF.getOWLAnnotationPropertyRangeAxiom(property, IRI(iri));
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static IRI IRI(@Nonnull String iri) {try{__CLR4_5_200lvicniiv.R.inc(251);
        __CLR4_5_200lvicniiv.R.inc(252);return IRI.create(iri);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static IRI IRI(String ns, String fragment) {try{__CLR4_5_200lvicniiv.R.inc(253);
        __CLR4_5_200lvicniiv.R.inc(254);return IRI.create(ns, fragment);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral PlainLiteral(@Nonnull String literal) {try{__CLR4_5_200lvicniiv.R.inc(255);
        __CLR4_5_200lvicniiv.R.inc(256);return DF.getOWLLiteral(literal, "");
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLDatatype PlainLiteral() {try{__CLR4_5_200lvicniiv.R.inc(257);
        __CLR4_5_200lvicniiv.R.inc(258);return DF.getRDFPlainLiteral();
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(@Nonnull String literal, String lang) {try{__CLR4_5_200lvicniiv.R.inc(259);
        __CLR4_5_200lvicniiv.R.inc(260);return DF.getOWLLiteral(literal, lang);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(@Nonnull String literal,
            @Nonnull OWLDatatype type) {try{__CLR4_5_200lvicniiv.R.inc(261);
        __CLR4_5_200lvicniiv.R.inc(262);return DF.getOWLLiteral(literal, type);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(@Nonnull String literal,
            @Nonnull OWL2Datatype type) {try{__CLR4_5_200lvicniiv.R.inc(263);
        __CLR4_5_200lvicniiv.R.inc(264);return DF.getOWLLiteral(literal, type);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(@Nonnull String literal) {try{__CLR4_5_200lvicniiv.R.inc(265);
        __CLR4_5_200lvicniiv.R.inc(266);return DF.getOWLLiteral(literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(boolean literal) {try{__CLR4_5_200lvicniiv.R.inc(267);
        __CLR4_5_200lvicniiv.R.inc(268);return DF.getOWLLiteral(literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(int literal) {try{__CLR4_5_200lvicniiv.R.inc(269);
        __CLR4_5_200lvicniiv.R.inc(270);return DF.getOWLLiteral(literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(double literal) {try{__CLR4_5_200lvicniiv.R.inc(271);
        __CLR4_5_200lvicniiv.R.inc(272);return DF.getOWLLiteral(literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLLiteral Literal(float literal) {try{__CLR4_5_200lvicniiv.R.inc(273);
        __CLR4_5_200lvicniiv.R.inc(274);return DF.getOWLLiteral(literal);
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}

    @Nonnull
    public static OWLOntology Ontology(@Nonnull OWLOntologyManager man,
            @Nonnull OWLAxiom... axioms) {try{__CLR4_5_200lvicniiv.R.inc(275);
        __CLR4_5_200lvicniiv.R.inc(276);try {
            __CLR4_5_200lvicniiv.R.inc(277);return man.createOntology(CollectionFactory.createSet(axioms));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_200lvicniiv.R.inc(278);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_200lvicniiv.R.flushNeeded();}}
}
