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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

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
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
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
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObject;
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
import org.semanticweb.owlapi.model.OWLObjectVisitor;
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
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class OWLObjectTypeIndexProvider implements OWLObjectVisitor {public static class __CLR4_5_2a84a84lvickrfd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //@formatter:off
    /** ENTITY_TYPE_INDEX_BASE           */ public static final int ENTITY_TYPE_INDEX_BASE              = 1000;
    /** IRI                              */ public static final int IRI                                 = 0;
    /** ONTOLOGY                         */ public static final int ONTOLOGY                            = 1;
    /** OWL_CLASS                        */ public static final int OWL_CLASS                           = ENTITY_TYPE_INDEX_BASE + 1;
    /** OBJECT_PROPERTY                  */ public static final int OBJECT_PROPERTY                     = ENTITY_TYPE_INDEX_BASE + 2;
    /** OBJECT_PROPERTY_INVERSE          */ public static final int OBJECT_PROPERTY_INVERSE             = ENTITY_TYPE_INDEX_BASE + 3;
    /** DATA_PROPERTY                    */ public static final int DATA_PROPERTY                       = ENTITY_TYPE_INDEX_BASE + 4;
    /** INDIVIDUAL                       */ public static final int INDIVIDUAL                          = ENTITY_TYPE_INDEX_BASE + 5;
    /** ANNOTATION_PROPERTY              */ public static final int ANNOTATION_PROPERTY                 = ENTITY_TYPE_INDEX_BASE + 6;
    /** ANON_INDIVIDUAL                  */ public static final int ANON_INDIVIDUAL                     = ENTITY_TYPE_INDEX_BASE + 7;
    /** AXIOM_TYPE_INDEX_BASE            */ public static final int AXIOM_TYPE_INDEX_BASE               = 2000;
    /** DATA_TYPE_INDEX_BASE             */ public static final int DATA_TYPE_INDEX_BASE                = 4000;
    /** ANNOTATION_TYPE_INDEX_BASE       */ public static final int ANNOTATION_TYPE_INDEX_BASE          = 5000;
    /** RULE_OBJECT_TYPE_INDEX_BASE      */ public static final int RULE_OBJECT_TYPE_INDEX_BASE         = 6000;
    /** CLASS_EXPRESSION_TYPE_INDEX_BASE */ public static final int CLASS_EXPRESSION_TYPE_INDEX_BASE    = 3000;
//@formatter:on
    private int type;

    /**
     * @param object
     *        the object to compute the type index of
     * @return the type
     */
    public int getTypeIndex(@Nonnull OWLObject object) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13252);
        __CLR4_5_2a84a84lvickrfd.R.inc(13253);checkNotNull(object, "object cannot be null").accept(this);
        __CLR4_5_2a84a84lvickrfd.R.inc(13254);return type;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13255);
        __CLR4_5_2a84a84lvickrfd.R.inc(13256);type = IRI;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Entities
    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13257);
        __CLR4_5_2a84a84lvickrfd.R.inc(13258);type = OWL_CLASS;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13259);
        __CLR4_5_2a84a84lvickrfd.R.inc(13260);type = OBJECT_PROPERTY;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13261);
        __CLR4_5_2a84a84lvickrfd.R.inc(13262);type = OBJECT_PROPERTY_INVERSE;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13263);
        __CLR4_5_2a84a84lvickrfd.R.inc(13264);type = DATA_PROPERTY;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13265);
        __CLR4_5_2a84a84lvickrfd.R.inc(13266);type = INDIVIDUAL;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13267);
        __CLR4_5_2a84a84lvickrfd.R.inc(13268);type = ANNOTATION_PROPERTY;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13269);
        __CLR4_5_2a84a84lvickrfd.R.inc(13270);type = ONTOLOGY;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13271);
        __CLR4_5_2a84a84lvickrfd.R.inc(13272);type = ANON_INDIVIDUAL;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Axioms
    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13273);
        __CLR4_5_2a84a84lvickrfd.R.inc(13274);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13275);
        __CLR4_5_2a84a84lvickrfd.R.inc(13276);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13277);
        __CLR4_5_2a84a84lvickrfd.R.inc(13278);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13279);
        __CLR4_5_2a84a84lvickrfd.R.inc(13280);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13281);
        __CLR4_5_2a84a84lvickrfd.R.inc(13282);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13283);
        __CLR4_5_2a84a84lvickrfd.R.inc(13284);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13285);
        __CLR4_5_2a84a84lvickrfd.R.inc(13286);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13287);
        __CLR4_5_2a84a84lvickrfd.R.inc(13288);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13289);
        __CLR4_5_2a84a84lvickrfd.R.inc(13290);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13291);
        __CLR4_5_2a84a84lvickrfd.R.inc(13292);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13293);
        __CLR4_5_2a84a84lvickrfd.R.inc(13294);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13295);
        __CLR4_5_2a84a84lvickrfd.R.inc(13296);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13297);
        __CLR4_5_2a84a84lvickrfd.R.inc(13298);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13299);
        __CLR4_5_2a84a84lvickrfd.R.inc(13300);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13301);
        __CLR4_5_2a84a84lvickrfd.R.inc(13302);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13303);
        __CLR4_5_2a84a84lvickrfd.R.inc(13304);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13305);
        __CLR4_5_2a84a84lvickrfd.R.inc(13306);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13307);
        __CLR4_5_2a84a84lvickrfd.R.inc(13308);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13309);
        __CLR4_5_2a84a84lvickrfd.R.inc(13310);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13311);
        __CLR4_5_2a84a84lvickrfd.R.inc(13312);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13313);
        __CLR4_5_2a84a84lvickrfd.R.inc(13314);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13315);
        __CLR4_5_2a84a84lvickrfd.R.inc(13316);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13317);
        __CLR4_5_2a84a84lvickrfd.R.inc(13318);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13319);
        __CLR4_5_2a84a84lvickrfd.R.inc(13320);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13321);
        __CLR4_5_2a84a84lvickrfd.R.inc(13322);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13323);
        __CLR4_5_2a84a84lvickrfd.R.inc(13324);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13325);
        __CLR4_5_2a84a84lvickrfd.R.inc(13326);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13327);
        __CLR4_5_2a84a84lvickrfd.R.inc(13328);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13329);
        __CLR4_5_2a84a84lvickrfd.R.inc(13330);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13331);
        __CLR4_5_2a84a84lvickrfd.R.inc(13332);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13333);
        __CLR4_5_2a84a84lvickrfd.R.inc(13334);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13335);
        __CLR4_5_2a84a84lvickrfd.R.inc(13336);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13337);
        __CLR4_5_2a84a84lvickrfd.R.inc(13338);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13339);
        __CLR4_5_2a84a84lvickrfd.R.inc(13340);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13341);
        __CLR4_5_2a84a84lvickrfd.R.inc(13342);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13343);
        __CLR4_5_2a84a84lvickrfd.R.inc(13344);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13345);
        __CLR4_5_2a84a84lvickrfd.R.inc(13346);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13347);
        __CLR4_5_2a84a84lvickrfd.R.inc(13348);type = AXIOM_TYPE_INDEX_BASE + rule.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13349);
        __CLR4_5_2a84a84lvickrfd.R.inc(13350);type = AXIOM_TYPE_INDEX_BASE + axiom.getAxiomType().getIndex();
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Anon class expressions
    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13351);
        __CLR4_5_2a84a84lvickrfd.R.inc(13352);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13353);
        __CLR4_5_2a84a84lvickrfd.R.inc(13354);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 2;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13355);
        __CLR4_5_2a84a84lvickrfd.R.inc(13356);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 3;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13357);
        __CLR4_5_2a84a84lvickrfd.R.inc(13358);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 4;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13359);
        __CLR4_5_2a84a84lvickrfd.R.inc(13360);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 5;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13361);
        __CLR4_5_2a84a84lvickrfd.R.inc(13362);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 6;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13363);
        __CLR4_5_2a84a84lvickrfd.R.inc(13364);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 7;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13365);
        __CLR4_5_2a84a84lvickrfd.R.inc(13366);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13367);
        __CLR4_5_2a84a84lvickrfd.R.inc(13368);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 9;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13369);
        __CLR4_5_2a84a84lvickrfd.R.inc(13370);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 10;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13371);
        __CLR4_5_2a84a84lvickrfd.R.inc(13372);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 11;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13373);
        __CLR4_5_2a84a84lvickrfd.R.inc(13374);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 12;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13375);
        __CLR4_5_2a84a84lvickrfd.R.inc(13376);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 13;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13377);
        __CLR4_5_2a84a84lvickrfd.R.inc(13378);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 14;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13379);
        __CLR4_5_2a84a84lvickrfd.R.inc(13380);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 15;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13381);
        __CLR4_5_2a84a84lvickrfd.R.inc(13382);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 16;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13383);
        __CLR4_5_2a84a84lvickrfd.R.inc(13384);type = CLASS_EXPRESSION_TYPE_INDEX_BASE + 17;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Data types and data values
    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13385);
        __CLR4_5_2a84a84lvickrfd.R.inc(13386);type = DATA_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13387);
        __CLR4_5_2a84a84lvickrfd.R.inc(13388);type = DATA_TYPE_INDEX_BASE + 2;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13389);
        __CLR4_5_2a84a84lvickrfd.R.inc(13390);type = DATA_TYPE_INDEX_BASE + 3;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13391);
        __CLR4_5_2a84a84lvickrfd.R.inc(13392);type = DATA_TYPE_INDEX_BASE + 4;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13393);
        __CLR4_5_2a84a84lvickrfd.R.inc(13394);type = AXIOM_TYPE_INDEX_BASE + 5;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13395);
        __CLR4_5_2a84a84lvickrfd.R.inc(13396);type = DATA_TYPE_INDEX_BASE + 6;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13397);
        __CLR4_5_2a84a84lvickrfd.R.inc(13398);type = DATA_TYPE_INDEX_BASE + 7;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13399);
        __CLR4_5_2a84a84lvickrfd.R.inc(13400);type = DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Annotations
    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13401);
        __CLR4_5_2a84a84lvickrfd.R.inc(13402);type = ANNOTATION_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    // Rule objects
    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13403);
        __CLR4_5_2a84a84lvickrfd.R.inc(13404);type = RULE_OBJECT_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13405);
        __CLR4_5_2a84a84lvickrfd.R.inc(13406);type = RULE_OBJECT_TYPE_INDEX_BASE + 2;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13407);
        __CLR4_5_2a84a84lvickrfd.R.inc(13408);type = RULE_OBJECT_TYPE_INDEX_BASE + 3;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13409);
        __CLR4_5_2a84a84lvickrfd.R.inc(13410);type = RULE_OBJECT_TYPE_INDEX_BASE + 4;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13411);
        __CLR4_5_2a84a84lvickrfd.R.inc(13412);type = RULE_OBJECT_TYPE_INDEX_BASE + 5;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13413);
        __CLR4_5_2a84a84lvickrfd.R.inc(13414);type = RULE_OBJECT_TYPE_INDEX_BASE + 6;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13415);
        __CLR4_5_2a84a84lvickrfd.R.inc(13416);type = RULE_OBJECT_TYPE_INDEX_BASE + 7;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13417);
        __CLR4_5_2a84a84lvickrfd.R.inc(13418);type = RULE_OBJECT_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13419);
        __CLR4_5_2a84a84lvickrfd.R.inc(13420);type = RULE_OBJECT_TYPE_INDEX_BASE + 9;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2a84a84lvickrfd.R.inc(13421);
        __CLR4_5_2a84a84lvickrfd.R.inc(13422);type = RULE_OBJECT_TYPE_INDEX_BASE + 10;
    }finally{__CLR4_5_2a84a84lvickrfd.R.flushNeeded();}}
}
