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

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
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
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/**
 * Provides a default implementation of {@code OWLObjectVisitorEx}. Only the
 * methods that need specific client implementation need be overridden. The
 * adapter can be set up to return a default value.
 * 
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 * @param <O>
 *        visitor return type
 */
public class OWLObjectVisitorExAdapter<O> extends OWLDataVisitorExAdapter<O>
        implements OWLObjectVisitorEx<O> {public static class __CLR4_5_2afnafnlvickrh1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @param defaultReturnValue
     *        default return value
     */
    public OWLObjectVisitorExAdapter(@Nonnull O defaultReturnValue) {
        super(defaultReturnValue);__CLR4_5_2afnafnlvickrh1.R.inc(13524);try{__CLR4_5_2afnafnlvickrh1.R.inc(13523);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13525);
        __CLR4_5_2afnafnlvickrh1.R.inc(13526);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13527);
        __CLR4_5_2afnafnlvickrh1.R.inc(13528);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13529);
        __CLR4_5_2afnafnlvickrh1.R.inc(13530);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13531);
        __CLR4_5_2afnafnlvickrh1.R.inc(13532);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13533);
        __CLR4_5_2afnafnlvickrh1.R.inc(13534);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13535);
        __CLR4_5_2afnafnlvickrh1.R.inc(13536);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13537);
        __CLR4_5_2afnafnlvickrh1.R.inc(13538);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13539);
        __CLR4_5_2afnafnlvickrh1.R.inc(13540);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13541);
        __CLR4_5_2afnafnlvickrh1.R.inc(13542);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13543);
        __CLR4_5_2afnafnlvickrh1.R.inc(13544);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13545);
        __CLR4_5_2afnafnlvickrh1.R.inc(13546);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13547);
        __CLR4_5_2afnafnlvickrh1.R.inc(13548);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13549);
        __CLR4_5_2afnafnlvickrh1.R.inc(13550);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13551);
        __CLR4_5_2afnafnlvickrh1.R.inc(13552);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13553);
        __CLR4_5_2afnafnlvickrh1.R.inc(13554);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13555);
        __CLR4_5_2afnafnlvickrh1.R.inc(13556);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13557);
        __CLR4_5_2afnafnlvickrh1.R.inc(13558);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13559);
        __CLR4_5_2afnafnlvickrh1.R.inc(13560);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13561);
        __CLR4_5_2afnafnlvickrh1.R.inc(13562);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13563);
        __CLR4_5_2afnafnlvickrh1.R.inc(13564);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13565);
        __CLR4_5_2afnafnlvickrh1.R.inc(13566);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13567);
        __CLR4_5_2afnafnlvickrh1.R.inc(13568);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13569);
        __CLR4_5_2afnafnlvickrh1.R.inc(13570);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13571);
        __CLR4_5_2afnafnlvickrh1.R.inc(13572);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13573);
        __CLR4_5_2afnafnlvickrh1.R.inc(13574);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13575);
        __CLR4_5_2afnafnlvickrh1.R.inc(13576);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13577);
        __CLR4_5_2afnafnlvickrh1.R.inc(13578);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13579);
        __CLR4_5_2afnafnlvickrh1.R.inc(13580);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13581);
        __CLR4_5_2afnafnlvickrh1.R.inc(13582);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13583);
        __CLR4_5_2afnafnlvickrh1.R.inc(13584);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13585);
        __CLR4_5_2afnafnlvickrh1.R.inc(13586);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13587);
        __CLR4_5_2afnafnlvickrh1.R.inc(13588);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13589);
        __CLR4_5_2afnafnlvickrh1.R.inc(13590);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13591);
        __CLR4_5_2afnafnlvickrh1.R.inc(13592);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLRule rule) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13593);
        __CLR4_5_2afnafnlvickrh1.R.inc(13594);return doDefault(rule);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLClass ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13595);
        __CLR4_5_2afnafnlvickrh1.R.inc(13596);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13597);
        __CLR4_5_2afnafnlvickrh1.R.inc(13598);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataExactCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13599);
        __CLR4_5_2afnafnlvickrh1.R.inc(13600);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13601);
        __CLR4_5_2afnafnlvickrh1.R.inc(13602);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataMinCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13603);
        __CLR4_5_2afnafnlvickrh1.R.inc(13604);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13605);
        __CLR4_5_2afnafnlvickrh1.R.inc(13606);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataHasValue ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13607);
        __CLR4_5_2afnafnlvickrh1.R.inc(13608);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13609);
        __CLR4_5_2afnafnlvickrh1.R.inc(13610);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectComplementOf ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13611);
        __CLR4_5_2afnafnlvickrh1.R.inc(13612);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13613);
        __CLR4_5_2afnafnlvickrh1.R.inc(13614);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectHasSelf ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13615);
        __CLR4_5_2afnafnlvickrh1.R.inc(13616);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectHasValue ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13617);
        __CLR4_5_2afnafnlvickrh1.R.inc(13618);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13619);
        __CLR4_5_2afnafnlvickrh1.R.inc(13620);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13621);
        __CLR4_5_2afnafnlvickrh1.R.inc(13622);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13623);
        __CLR4_5_2afnafnlvickrh1.R.inc(13624);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectOneOf ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13625);
        __CLR4_5_2afnafnlvickrh1.R.inc(13626);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13627);
        __CLR4_5_2afnafnlvickrh1.R.inc(13628);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectUnionOf ce) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13629);
        __CLR4_5_2afnafnlvickrh1.R.inc(13630);return doDefault(ce);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDataProperty property) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13631);
        __CLR4_5_2afnafnlvickrh1.R.inc(13632);return doDefault(property);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectProperty property) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13633);
        __CLR4_5_2afnafnlvickrh1.R.inc(13634);return doDefault(property);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectInverseOf property) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13635);
        __CLR4_5_2afnafnlvickrh1.R.inc(13636);return doDefault(property);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLNamedIndividual individual) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13637);
        __CLR4_5_2afnafnlvickrh1.R.inc(13638);return doDefault(individual);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationProperty property) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13639);
        __CLR4_5_2afnafnlvickrh1.R.inc(13640);return doDefault(property);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotation node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13641);
        __CLR4_5_2afnafnlvickrh1.R.inc(13642);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13643);
        __CLR4_5_2afnafnlvickrh1.R.inc(13644);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13645);
        __CLR4_5_2afnafnlvickrh1.R.inc(13646);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13647);
        __CLR4_5_2afnafnlvickrh1.R.inc(13648);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13649);
        __CLR4_5_2afnafnlvickrh1.R.inc(13650);return doDefault(individual);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(IRI iri) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13651);
        __CLR4_5_2afnafnlvickrh1.R.inc(13652);return doDefault(iri);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLLiteralArgument node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13653);
        __CLR4_5_2afnafnlvickrh1.R.inc(13654);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLVariable node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13655);
        __CLR4_5_2afnafnlvickrh1.R.inc(13656);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLIndividualArgument node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13657);
        __CLR4_5_2afnafnlvickrh1.R.inc(13658);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLBuiltInAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13659);
        __CLR4_5_2afnafnlvickrh1.R.inc(13660);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLClassAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13661);
        __CLR4_5_2afnafnlvickrh1.R.inc(13662);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLDataRangeAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13663);
        __CLR4_5_2afnafnlvickrh1.R.inc(13664);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13665);
        __CLR4_5_2afnafnlvickrh1.R.inc(13666);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13667);
        __CLR4_5_2afnafnlvickrh1.R.inc(13668);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13669);
        __CLR4_5_2afnafnlvickrh1.R.inc(13670);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13671);
        __CLR4_5_2afnafnlvickrh1.R.inc(13672);return doDefault(node);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLOntology ontology) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13673);
        __CLR4_5_2afnafnlvickrh1.R.inc(13674);return doDefault(ontology);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}

    @Override
    public O visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2afnafnlvickrh1.R.inc(13675);
        __CLR4_5_2afnafnlvickrh1.R.inc(13676);return doDefault(axiom);
    }finally{__CLR4_5_2afnafnlvickrh1.R.flushNeeded();}}
}
