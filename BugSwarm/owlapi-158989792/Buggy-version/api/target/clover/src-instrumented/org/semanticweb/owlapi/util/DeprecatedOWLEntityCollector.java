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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
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
import org.semanticweb.owlapi.model.OWLEntityVisitor;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
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
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLArgument;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLObjectVisitor;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/**
 * A utility class that visits axioms, class expressions etc. and accumulates
 * the named objects that are referred to in those axioms, class expressions
 * etc. For example, if the collector visited the axiom (propP some C)
 * subClassOf (propQ some D), it would contain the objects propP, C, propQ and
 * D.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 13-Nov-2006
 * @deprecated the old OWLEntityCollector is still used in non trivial ways in
 *             third party software. For new code, use OWLEntityCollector.
 */
@Deprecated
public class DeprecatedOWLEntityCollector implements OWLObjectVisitor,
        SWRLObjectVisitor {public static class __CLR4_5_25s25s2lvickpvq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,7850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Collection<OWLEntity> objects;
    private final Collection<OWLAnonymousIndividual> anonymousIndividuals;
    private boolean collectClasses = true;
    private boolean collectObjectProperties = true;
    private boolean collectDataProperties = true;
    private boolean collectIndividuals = true;
    private boolean collectDatatypes = true;

    /**
     * @param toReturn
     *        the set that will contain the results
     * @param anonsToReturn
     *        the set that will contain the anon individuals
     */
    public DeprecatedOWLEntityCollector(Set<OWLEntity> toReturn,
            Collection<OWLAnonymousIndividual> anonsToReturn) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7490);
        __CLR4_5_25s25s2lvickpvq.R.inc(7491);objects = toReturn;
        __CLR4_5_25s25s2lvickpvq.R.inc(7492);anonymousIndividuals = anonsToReturn;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param toReturn
     *        the set that will contain the results
     */
    public DeprecatedOWLEntityCollector(Set<OWLEntity> toReturn) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7493);
        __CLR4_5_25s25s2lvickpvq.R.inc(7494);objects = toReturn;
        __CLR4_5_25s25s2lvickpvq.R.inc(7495);anonymousIndividuals = FAKE;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * Deprecated default constructor: use one of the other constructors to get
     * more efficient set creation.
     */
    @Deprecated
    public DeprecatedOWLEntityCollector() {
        this(new HashSet<OWLEntity>(), new HashSet<OWLAnonymousIndividual>());__CLR4_5_25s25s2lvickpvq.R.inc(7497);try{__CLR4_5_25s25s2lvickpvq.R.inc(7496);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * Clears all objects that have accumulated during the course of visiting
     * axioms, class expressions etc.
     * 
     * @param toReturn
     *        the set that will contain the results
     */
    public void reset(Set<OWLEntity> toReturn) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7498);
        __CLR4_5_25s25s2lvickpvq.R.inc(7499);objects = toReturn;
        __CLR4_5_25s25s2lvickpvq.R.inc(7500);anonymousIndividuals.clear();
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param collectClasses
     *        true to collect classes
     */
    public void setCollectClasses(boolean collectClasses) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7501);
        __CLR4_5_25s25s2lvickpvq.R.inc(7502);this.collectClasses = collectClasses;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param collectObjectProperties
     *        true to collect object properties
     */
    public void setCollectObjectProperties(boolean collectObjectProperties) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7503);
        __CLR4_5_25s25s2lvickpvq.R.inc(7504);this.collectObjectProperties = collectObjectProperties;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param collectDataProperties
     *        true to collect data properties
     */
    public void setCollectDataProperties(boolean collectDataProperties) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7505);
        __CLR4_5_25s25s2lvickpvq.R.inc(7506);this.collectDataProperties = collectDataProperties;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param collectIndividuals
     *        true to collect individuals
     */
    public void setCollectIndividuals(boolean collectIndividuals) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7507);
        __CLR4_5_25s25s2lvickpvq.R.inc(7508);this.collectIndividuals = collectIndividuals;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * @param collectDatatypes
     *        true to collect datatypes
     */
    public void setCollectDatatypes(boolean collectDatatypes) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7509);
        __CLR4_5_25s25s2lvickpvq.R.inc(7510);this.collectDatatypes = collectDatatypes;
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * Gets the objects that are used by all axioms, class expressions etc. that
     * this collector has visited since it was constructed or reset. Deprecated:
     * if the non deprecated constructors are used, this method is useless and
     * inefficient
     * 
     * @return A set of entities. This will be a copy.
     */
    @Deprecated
    public Set<OWLEntity> getObjects() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7511);
        __CLR4_5_25s25s2lvickpvq.R.inc(7512);return new HashSet<>(objects);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    /**
     * A convenience method. Although anonymous individuals are not entities
     * they are collected by this collector and stored in a separate set. This
     * method returns collected individuals. Deprecated: if the non deprecated
     * constructors are used, this method is useless and inefficient
     * 
     * @return The set of anonymous individuals that were collected by the
     *         collector
     */
    @Deprecated
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7513);
        __CLR4_5_25s25s2lvickpvq.R.inc(7514);return new HashSet<>(anonymousIndividuals);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    protected void processAxiomAnnotations(OWLAxiom ax) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7515);
        // default behavior: iterate over the annotations outside the axiom
        __CLR4_5_25s25s2lvickpvq.R.inc(7516);for (OWLAnnotation anno : ax.getAnnotations()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7517);anno.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7518);
        __CLR4_5_25s25s2lvickpvq.R.inc(7519);axiom.getSubClass().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7520);axiom.getSuperClass().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7521);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7522);
        __CLR4_5_25s25s2lvickpvq.R.inc(7523);axiom.getSubject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7524);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7525);axiom.getObject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7526);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7527);
        __CLR4_5_25s25s2lvickpvq.R.inc(7528);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7529);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7530);
        __CLR4_5_25s25s2lvickpvq.R.inc(7531);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7532);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7533);
        __CLR4_5_25s25s2lvickpvq.R.inc(7534);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7535);desc.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7536);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7537);
        __CLR4_5_25s25s2lvickpvq.R.inc(7538);axiom.getDomain().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7539);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7540);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7541);
        __CLR4_5_25s25s2lvickpvq.R.inc(7542);axiom.getDomain().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7543);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7544);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7545);
        __CLR4_5_25s25s2lvickpvq.R.inc(7546);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7547);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7548);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7549);
        __CLR4_5_25s25s2lvickpvq.R.inc(7550);axiom.getSubject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7551);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7552);axiom.getObject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7553);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7554);
        __CLR4_5_25s25s2lvickpvq.R.inc(7555);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7556);ind.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7557);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7558);
        __CLR4_5_25s25s2lvickpvq.R.inc(7559);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7560);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7561);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7562);
        __CLR4_5_25s25s2lvickpvq.R.inc(7563);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7564);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7565);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7566);
        __CLR4_5_25s25s2lvickpvq.R.inc(7567);axiom.getRange().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7568);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7569);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7570);
        __CLR4_5_25s25s2lvickpvq.R.inc(7571);axiom.getSubject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7572);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7573);axiom.getObject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7574);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7575);
        __CLR4_5_25s25s2lvickpvq.R.inc(7576);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7577);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7578);
        __CLR4_5_25s25s2lvickpvq.R.inc(7579);axiom.getSubProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7580);axiom.getSuperProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7581);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7582);
        __CLR4_5_25s25s2lvickpvq.R.inc(7583);axiom.getOWLClass().accept((OWLEntityVisitor) this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7584);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7585);desc.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7586);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7587);
        __CLR4_5_25s25s2lvickpvq.R.inc(7588);axiom.getEntity().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7589);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7590);
        __CLR4_5_25s25s2lvickpvq.R.inc(7591);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7592);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7593);
        __CLR4_5_25s25s2lvickpvq.R.inc(7594);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7595);axiom.getRange().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7596);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7597);
        __CLR4_5_25s25s2lvickpvq.R.inc(7598);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7599);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7600);
        __CLR4_5_25s25s2lvickpvq.R.inc(7601);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7602);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7603);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7604);
        __CLR4_5_25s25s2lvickpvq.R.inc(7605);axiom.getClassExpression().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7606);axiom.getIndividual().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7607);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7608);
        __CLR4_5_25s25s2lvickpvq.R.inc(7609);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7610);desc.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7611);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7612);
        __CLR4_5_25s25s2lvickpvq.R.inc(7613);axiom.getSubject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7614);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7615);axiom.getObject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7616);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7617);
        __CLR4_5_25s25s2lvickpvq.R.inc(7618);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7619);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7620);
        __CLR4_5_25s25s2lvickpvq.R.inc(7621);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7622);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7623);
        __CLR4_5_25s25s2lvickpvq.R.inc(7624);axiom.getSubProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7625);axiom.getSuperProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7626);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7627);
        __CLR4_5_25s25s2lvickpvq.R.inc(7628);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7629);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7630);
        __CLR4_5_25s25s2lvickpvq.R.inc(7631);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7632);ind.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7633);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7634);
        __CLR4_5_25s25s2lvickpvq.R.inc(7635);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7636);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7637);axiom.getSuperProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7638);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7639);
        __CLR4_5_25s25s2lvickpvq.R.inc(7640);axiom.getFirstProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7641);axiom.getSecondProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7642);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7643);
        __CLR4_5_25s25s2lvickpvq.R.inc(7644);axiom.getClassExpression().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7645);for (OWLPropertyExpression prop : axiom.getPropertyExpressions()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7646);prop.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7647);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLClass desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7648);
        __CLR4_5_25s25s2lvickpvq.R.inc(7649);if ((((collectClasses)&&(__CLR4_5_25s25s2lvickpvq.R.iget(7650)!=0|true))||(__CLR4_5_25s25s2lvickpvq.R.iget(7651)==0&false))) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7652);objects.add(desc);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7653);
        __CLR4_5_25s25s2lvickpvq.R.inc(7654);for (OWLClassExpression operand : desc.getOperands()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7655);operand.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7656);
        __CLR4_5_25s25s2lvickpvq.R.inc(7657);for (OWLClassExpression operand : desc.getOperands()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7658);operand.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7659);
        __CLR4_5_25s25s2lvickpvq.R.inc(7660);desc.getOperand().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7661);
        __CLR4_5_25s25s2lvickpvq.R.inc(7662);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7663);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7664);
        __CLR4_5_25s25s2lvickpvq.R.inc(7665);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7666);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7667);
        __CLR4_5_25s25s2lvickpvq.R.inc(7668);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7669);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7670);
        __CLR4_5_25s25s2lvickpvq.R.inc(7671);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7672);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7673);
        __CLR4_5_25s25s2lvickpvq.R.inc(7674);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7675);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7676);
        __CLR4_5_25s25s2lvickpvq.R.inc(7677);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7678);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7679);
        __CLR4_5_25s25s2lvickpvq.R.inc(7680);desc.getProperty().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7681);
        __CLR4_5_25s25s2lvickpvq.R.inc(7682);for (OWLIndividual ind : desc.getIndividuals()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7683);ind.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7684);
        __CLR4_5_25s25s2lvickpvq.R.inc(7685);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7686);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7687);
        __CLR4_5_25s25s2lvickpvq.R.inc(7688);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7689);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7690);
        __CLR4_5_25s25s2lvickpvq.R.inc(7691);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7692);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7693);
        __CLR4_5_25s25s2lvickpvq.R.inc(7694);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7695);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7696);
        __CLR4_5_25s25s2lvickpvq.R.inc(7697);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7698);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality desc) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7699);
        __CLR4_5_25s25s2lvickpvq.R.inc(7700);desc.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7701);desc.getFiller().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7702);
        __CLR4_5_25s25s2lvickpvq.R.inc(7703);node.getDataRange().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7704);
        __CLR4_5_25s25s2lvickpvq.R.inc(7705);for (OWLLiteral val : node.getValues()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7706);val.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7707);
        __CLR4_5_25s25s2lvickpvq.R.inc(7708);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7709);dr.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7710);
        __CLR4_5_25s25s2lvickpvq.R.inc(7711);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7712);dr.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7713);
        __CLR4_5_25s25s2lvickpvq.R.inc(7714);node.getDatatype().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7715);for (OWLFacetRestriction facetRestriction : node.getFacetRestrictions()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7716);facetRestriction.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7717);
        __CLR4_5_25s25s2lvickpvq.R.inc(7718);node.getFacetValue().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7719);
        __CLR4_5_25s25s2lvickpvq.R.inc(7720);node.getDatatype().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf expression) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7721);
        __CLR4_5_25s25s2lvickpvq.R.inc(7722);expression.getInverse().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7723);
        __CLR4_5_25s25s2lvickpvq.R.inc(7724);if ((((collectObjectProperties)&&(__CLR4_5_25s25s2lvickpvq.R.iget(7725)!=0|true))||(__CLR4_5_25s25s2lvickpvq.R.iget(7726)==0&false))) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7727);objects.add(property);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7728);
        __CLR4_5_25s25s2lvickpvq.R.inc(7729);if ((((collectDataProperties)&&(__CLR4_5_25s25s2lvickpvq.R.iget(7730)!=0|true))||(__CLR4_5_25s25s2lvickpvq.R.iget(7731)==0&false))) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7732);objects.add(property);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7733);
        __CLR4_5_25s25s2lvickpvq.R.inc(7734);if ((((collectIndividuals)&&(__CLR4_5_25s25s2lvickpvq.R.iget(7735)!=0|true))||(__CLR4_5_25s25s2lvickpvq.R.iget(7736)==0&false))) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7737);objects.add(individual);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype datatype) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7738);
        __CLR4_5_25s25s2lvickpvq.R.inc(7739);if ((((collectDatatypes)&&(__CLR4_5_25s25s2lvickpvq.R.iget(7740)!=0|true))||(__CLR4_5_25s25s2lvickpvq.R.iget(7741)==0&false))) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7742);objects.add(datatype);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation annotation) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7743);
        __CLR4_5_25s25s2lvickpvq.R.inc(7744);annotation.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7745);annotation.getValue().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7746);for (OWLAnnotation anno : annotation.getAnnotations()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7747);anno.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7748);
        __CLR4_5_25s25s2lvickpvq.R.inc(7749);axiom.getSubject().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7750);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7751);axiom.getValue().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7752);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7753);
        // Anon individuals aren't entities
        // But store them in a set anyway for utility
        __CLR4_5_25s25s2lvickpvq.R.inc(7754);anonymousIndividuals.add(individual);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7755);}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    // public void visit(OWLAnnotationValue value) {
    // if(value.isLiteral()) {
    // value.asLiteral().accept(this);
    // }
    // else if(value.isAnonymousIndividual()) {
    // value.asOWLAnonymousIndividual().accept(this);
    // }
    // }
    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7756);
        __CLR4_5_25s25s2lvickpvq.R.inc(7757);objects.addAll(ontology.getSignature());
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7758);
        __CLR4_5_25s25s2lvickpvq.R.inc(7759);objects.add(property);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7760);
        __CLR4_5_25s25s2lvickpvq.R.inc(7761);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7762);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7763);
        __CLR4_5_25s25s2lvickpvq.R.inc(7764);axiom.getProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7765);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7766);
        __CLR4_5_25s25s2lvickpvq.R.inc(7767);axiom.getSubProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7768);axiom.getSuperProperty().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7769);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7770);
        __CLR4_5_25s25s2lvickpvq.R.inc(7771);axiom.getDatatype().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7772);axiom.getDataRange().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7773);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7774);
        __CLR4_5_25s25s2lvickpvq.R.inc(7775);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7776);atom.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7777);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7778);atom.accept(this);
        }
        }__CLR4_5_25s25s2lvickpvq.R.inc(7779);processAxiomAnnotations(rule);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7780);
        __CLR4_5_25s25s2lvickpvq.R.inc(7781);node.getArgument().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7782);node.getPredicate().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7783);
        __CLR4_5_25s25s2lvickpvq.R.inc(7784);node.getArgument().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7785);node.getPredicate().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7786);
        __CLR4_5_25s25s2lvickpvq.R.inc(7787);node.getPredicate().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7788);node.getFirstArgument().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7789);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7790);
        __CLR4_5_25s25s2lvickpvq.R.inc(7791);node.getPredicate().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7792);node.getFirstArgument().accept(this);
        __CLR4_5_25s25s2lvickpvq.R.inc(7793);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7794);
        __CLR4_5_25s25s2lvickpvq.R.inc(7795);for (SWRLArgument obj : node.getAllArguments()) {{
            __CLR4_5_25s25s2lvickpvq.R.inc(7796);obj.accept(this);
        }
    }}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7797);}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7798);
        __CLR4_5_25s25s2lvickpvq.R.inc(7799);node.getIndividual().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7800);
        __CLR4_5_25s25s2lvickpvq.R.inc(7801);node.getLiteral().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7802);
        __CLR4_5_25s25s2lvickpvq.R.inc(7803);node.getFirstArgument().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7804);
        __CLR4_5_25s25s2lvickpvq.R.inc(7805);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

    private static final List<OWLAnonymousIndividual> FAKE = new ArrayList<OWLAnonymousIndividual>() {

        private static final long serialVersionUID = 40000L;

        @Override
        public <T> T[] toArray(T[] arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7806);
            __CLR4_5_25s25s2lvickpvq.R.inc(7807);return arg0;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public Object[] toArray() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7808);
            __CLR4_5_25s25s2lvickpvq.R.inc(7809);return new Object[0];
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public List<OWLAnonymousIndividual> subList(int arg0, int arg1) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7810);
            __CLR4_5_25s25s2lvickpvq.R.inc(7811);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7812);
            __CLR4_5_25s25s2lvickpvq.R.inc(7813);return 0;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public OWLAnonymousIndividual
                set(int arg0, OWLAnonymousIndividual arg1) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7814);
            __CLR4_5_25s25s2lvickpvq.R.inc(7815);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean retainAll(Collection<?> arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7816);
            __CLR4_5_25s25s2lvickpvq.R.inc(7817);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean removeAll(Collection<?> arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7818);
            __CLR4_5_25s25s2lvickpvq.R.inc(7819);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public OWLAnonymousIndividual remove(int arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7820);
            __CLR4_5_25s25s2lvickpvq.R.inc(7821);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean remove(Object arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7822);
            __CLR4_5_25s25s2lvickpvq.R.inc(7823);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public ListIterator<OWLAnonymousIndividual> listIterator(int arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7824);
            __CLR4_5_25s25s2lvickpvq.R.inc(7825);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public ListIterator<OWLAnonymousIndividual> listIterator() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7826);
            __CLR4_5_25s25s2lvickpvq.R.inc(7827);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public int lastIndexOf(Object arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7828);
            __CLR4_5_25s25s2lvickpvq.R.inc(7829);return 0;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public Iterator<OWLAnonymousIndividual> iterator() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7830);
            __CLR4_5_25s25s2lvickpvq.R.inc(7831);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean isEmpty() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7832);
            __CLR4_5_25s25s2lvickpvq.R.inc(7833);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public int indexOf(Object arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7834);
            __CLR4_5_25s25s2lvickpvq.R.inc(7835);return 0;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public OWLAnonymousIndividual get(int arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7836);
            __CLR4_5_25s25s2lvickpvq.R.inc(7837);return null;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean containsAll(Collection<?> arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7838);
            __CLR4_5_25s25s2lvickpvq.R.inc(7839);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean contains(Object arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7840);
            __CLR4_5_25s25s2lvickpvq.R.inc(7841);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public void clear() {try{__CLR4_5_25s25s2lvickpvq.R.inc(7842);}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean addAll(int arg0,
                Collection<? extends OWLAnonymousIndividual> arg1) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7843);
            __CLR4_5_25s25s2lvickpvq.R.inc(7844);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean
                addAll(Collection<? extends OWLAnonymousIndividual> arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7845);
            __CLR4_5_25s25s2lvickpvq.R.inc(7846);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public void add(int arg0, OWLAnonymousIndividual arg1) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7847);}finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}

        @Override
        public boolean add(OWLAnonymousIndividual arg0) {try{__CLR4_5_25s25s2lvickpvq.R.inc(7848);
            __CLR4_5_25s25s2lvickpvq.R.inc(7849);return false;
        }finally{__CLR4_5_25s25s2lvickpvq.R.flushNeeded();}}
    };
}
