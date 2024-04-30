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

import java.util.HashSet;
import java.util.Set;

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
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
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
import org.semanticweb.owlapi.model.SWRLDArgument;
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
public class OWLObjectComponentCollector implements OWLObjectVisitor {public static class __CLR4_5_28ma8malvickr7y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,11477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Set<OWLObject> result = new HashSet<>();

    /**
     * A convenience method that obtains the components of an OWL object. Note
     * that by definition, the components of the object include the object
     * itself.
     * 
     * @param object
     *        The object whose components are to be obtained.
     * @return The component of the specified object.
     */
    @Nonnull
    public Set<OWLObject> getComponents(@Nonnull OWLObject object) {try{__CLR4_5_28ma8malvickr7y.R.inc(11170);
        __CLR4_5_28ma8malvickr7y.R.inc(11171);checkNotNull(object, "object cannot be null");
        __CLR4_5_28ma8malvickr7y.R.inc(11172);result.clear();
        __CLR4_5_28ma8malvickr7y.R.inc(11173);object.accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11174);return getResult();
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    /** @return the resulting owl objects */
    @Nonnull
    public Set<OWLObject> getResult() {try{__CLR4_5_28ma8malvickr7y.R.inc(11175);
        __CLR4_5_28ma8malvickr7y.R.inc(11176);return CollectionFactory
                .getCopyOnRequestSetFromMutableCollection(result);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    private void process(@Nonnull Set<? extends OWLObject> objects) {try{__CLR4_5_28ma8malvickr7y.R.inc(11177);
        __CLR4_5_28ma8malvickr7y.R.inc(11178);checkNotNull(objects, "objects cannot be null");
        __CLR4_5_28ma8malvickr7y.R.inc(11179);for (OWLObject obj : objects) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11180);obj.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    /**
     * Handles an object. By default, this method adds the object to the result
     * collection. This method may be overriden to do something else.
     * 
     * @param obj
     *        The object being added.
     */
    protected void handleObject(@Nonnull OWLObject obj) {try{__CLR4_5_28ma8malvickr7y.R.inc(11181);
        __CLR4_5_28ma8malvickr7y.R.inc(11182);checkNotNull(obj, "obj cannot be null");
        __CLR4_5_28ma8malvickr7y.R.inc(11183);result.add(obj);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_28ma8malvickr7y.R.inc(11184);
        __CLR4_5_28ma8malvickr7y.R.inc(11185);process(ontology.getAxioms());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11186);
        __CLR4_5_28ma8malvickr7y.R.inc(11187);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11188);ce.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_28ma8malvickr7y.R.inc(11189);
        __CLR4_5_28ma8malvickr7y.R.inc(11190);handleObject(property);
        __CLR4_5_28ma8malvickr7y.R.inc(11191);property.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_28ma8malvickr7y.R.inc(11192);
        __CLR4_5_28ma8malvickr7y.R.inc(11193);handleObject(property);
        __CLR4_5_28ma8malvickr7y.R.inc(11194);property.getInverse().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_28ma8malvickr7y.R.inc(11195);
        __CLR4_5_28ma8malvickr7y.R.inc(11196);handleObject(property);
        __CLR4_5_28ma8malvickr7y.R.inc(11197);property.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11198);
        __CLR4_5_28ma8malvickr7y.R.inc(11199);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11200);node.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11201);
        __CLR4_5_28ma8malvickr7y.R.inc(11202);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11203);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11204);op.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11205);
        __CLR4_5_28ma8malvickr7y.R.inc(11206);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11207);process(ce.getOperands());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11208);
        __CLR4_5_28ma8malvickr7y.R.inc(11209);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11210);ce.getOperand().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11211);
        __CLR4_5_28ma8malvickr7y.R.inc(11212);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11213);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11214);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11215);
        __CLR4_5_28ma8malvickr7y.R.inc(11216);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11217);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11218);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11219);
        __CLR4_5_28ma8malvickr7y.R.inc(11220);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11221);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11222);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11223);
        __CLR4_5_28ma8malvickr7y.R.inc(11224);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11225);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11226);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11227);
        __CLR4_5_28ma8malvickr7y.R.inc(11228);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11229);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11230);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11231);
        __CLR4_5_28ma8malvickr7y.R.inc(11232);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11233);ce.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11234);ce.getFiller().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11235);
        __CLR4_5_28ma8malvickr7y.R.inc(11236);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11237);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11238);
        __CLR4_5_28ma8malvickr7y.R.inc(11239);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11240);process(ce.getIndividuals());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11241);
        __CLR4_5_28ma8malvickr7y.R.inc(11242);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11243);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11244);
        __CLR4_5_28ma8malvickr7y.R.inc(11245);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11246);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11247);
        __CLR4_5_28ma8malvickr7y.R.inc(11248);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11249);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11250);
        __CLR4_5_28ma8malvickr7y.R.inc(11251);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11252);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11253);
        __CLR4_5_28ma8malvickr7y.R.inc(11254);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11255);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_28ma8malvickr7y.R.inc(11256);
        __CLR4_5_28ma8malvickr7y.R.inc(11257);handleObject(ce);
        __CLR4_5_28ma8malvickr7y.R.inc(11258);ce.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11259);
        __CLR4_5_28ma8malvickr7y.R.inc(11260);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11261);axiom.getSubClass().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11262);axiom.getSuperClass().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11263);
        __CLR4_5_28ma8malvickr7y.R.inc(11264);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11265);axiom.getSubject().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11266);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11267);axiom.getObject().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11268);
        __CLR4_5_28ma8malvickr7y.R.inc(11269);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11270);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11271);
        __CLR4_5_28ma8malvickr7y.R.inc(11272);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11273);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11274);
        __CLR4_5_28ma8malvickr7y.R.inc(11275);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11276);process(axiom.getClassExpressions());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11277);
        __CLR4_5_28ma8malvickr7y.R.inc(11278);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11279);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11280);
        __CLR4_5_28ma8malvickr7y.R.inc(11281);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11282);axiom.getDomain().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11283);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11284);
        __CLR4_5_28ma8malvickr7y.R.inc(11285);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11286);process(axiom.getProperties());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11287);
        __CLR4_5_28ma8malvickr7y.R.inc(11288);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11289);axiom.getSubject().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11290);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11291);axiom.getObject().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11292);
        __CLR4_5_28ma8malvickr7y.R.inc(11293);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11294);process(axiom.getIndividuals());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11295);
        __CLR4_5_28ma8malvickr7y.R.inc(11296);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11297);process(axiom.getProperties());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11298);
        __CLR4_5_28ma8malvickr7y.R.inc(11299);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11300);process(axiom.getProperties());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11301);
        __CLR4_5_28ma8malvickr7y.R.inc(11302);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11303);axiom.getRange().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11304);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11305);
        __CLR4_5_28ma8malvickr7y.R.inc(11306);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11307);axiom.getSubject().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11308);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11309);axiom.getObject().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11310);
        __CLR4_5_28ma8malvickr7y.R.inc(11311);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11312);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11313);
        __CLR4_5_28ma8malvickr7y.R.inc(11314);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11315);axiom.getSubProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11316);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11317);
        __CLR4_5_28ma8malvickr7y.R.inc(11318);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11319);axiom.getOWLClass().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11320);process(axiom.getClassExpressions());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11321);
        __CLR4_5_28ma8malvickr7y.R.inc(11322);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11323);axiom.getEntity().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11324);
        __CLR4_5_28ma8malvickr7y.R.inc(11325);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11326);axiom.getSubject().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11327);axiom.getAnnotation().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11328);
        __CLR4_5_28ma8malvickr7y.R.inc(11329);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11330);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11331);
        __CLR4_5_28ma8malvickr7y.R.inc(11332);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11333);axiom.getRange().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11334);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11335);
        __CLR4_5_28ma8malvickr7y.R.inc(11336);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11337);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11338);
        __CLR4_5_28ma8malvickr7y.R.inc(11339);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11340);process(axiom.getProperties());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11341);
        __CLR4_5_28ma8malvickr7y.R.inc(11342);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11343);axiom.getClassExpression().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11344);axiom.getIndividual().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11345);
        __CLR4_5_28ma8malvickr7y.R.inc(11346);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11347);process(axiom.getClassExpressions());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11348);
        __CLR4_5_28ma8malvickr7y.R.inc(11349);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11350);axiom.getSubject().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11351);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11352);axiom.getObject().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11353);
        __CLR4_5_28ma8malvickr7y.R.inc(11354);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11355);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11356);
        __CLR4_5_28ma8malvickr7y.R.inc(11357);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11358);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11359);
        __CLR4_5_28ma8malvickr7y.R.inc(11360);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11361);axiom.getSubProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11362);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11363);
        __CLR4_5_28ma8malvickr7y.R.inc(11364);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11365);axiom.getProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11366);
        __CLR4_5_28ma8malvickr7y.R.inc(11367);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11368);process(axiom.getIndividuals());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11369);
        __CLR4_5_28ma8malvickr7y.R.inc(11370);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11371);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11372);prop.accept(this);
        }
        }__CLR4_5_28ma8malvickr7y.R.inc(11373);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11374);
        __CLR4_5_28ma8malvickr7y.R.inc(11375);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11376);process(axiom.getProperties());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_28ma8malvickr7y.R.inc(11377);
        __CLR4_5_28ma8malvickr7y.R.inc(11378);handleObject(rule);
        __CLR4_5_28ma8malvickr7y.R.inc(11379);process(rule.getBody());
        __CLR4_5_28ma8malvickr7y.R.inc(11380);process(rule.getHead());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11381);
        __CLR4_5_28ma8malvickr7y.R.inc(11382);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11383);node.getDataRange().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11384);
        __CLR4_5_28ma8malvickr7y.R.inc(11385);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11386);process(node.getValues());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11387);
        __CLR4_5_28ma8malvickr7y.R.inc(11388);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11389);node.getDatatype().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11390);process(node.getFacetRestrictions());
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11391);
        __CLR4_5_28ma8malvickr7y.R.inc(11392);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11393);node.getDatatype().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11394);
        __CLR4_5_28ma8malvickr7y.R.inc(11395);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11396);node.getFacetValue().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11397);
        __CLR4_5_28ma8malvickr7y.R.inc(11398);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11399);axiom.getClassExpression().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11400);for (OWLObjectPropertyExpression prop : axiom
                .getObjectPropertyExpressions()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11401);prop.accept(this);
        }
        }__CLR4_5_28ma8malvickr7y.R.inc(11402);for (OWLDataPropertyExpression prop : axiom
                .getDataPropertyExpressions()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11403);prop.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11404);
        __CLR4_5_28ma8malvickr7y.R.inc(11405);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11406);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11407);axiom.getDomain().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11408);
        __CLR4_5_28ma8malvickr7y.R.inc(11409);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11410);axiom.getProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11411);axiom.getRange().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11412);
        __CLR4_5_28ma8malvickr7y.R.inc(11413);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11414);axiom.getSubProperty().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11415);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11416);
        __CLR4_5_28ma8malvickr7y.R.inc(11417);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11418);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11419);rng.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11420);
        __CLR4_5_28ma8malvickr7y.R.inc(11421);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11422);for (OWLDataRange rng : node.getOperands()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11423);rng.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_28ma8malvickr7y.R.inc(11424);
        __CLR4_5_28ma8malvickr7y.R.inc(11425);handleObject(individual);
        __CLR4_5_28ma8malvickr7y.R.inc(11426);individual.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_28ma8malvickr7y.R.inc(11427);
        __CLR4_5_28ma8malvickr7y.R.inc(11428);handleObject(property);
        __CLR4_5_28ma8malvickr7y.R.inc(11429);property.getIRI().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_28ma8malvickr7y.R.inc(11430);
        __CLR4_5_28ma8malvickr7y.R.inc(11431);handleObject(individual);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_28ma8malvickr7y.R.inc(11432);
        __CLR4_5_28ma8malvickr7y.R.inc(11433);handleObject(iri);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11434);}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11435);
        __CLR4_5_28ma8malvickr7y.R.inc(11436);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11437);node.getPredicate().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11438);node.getArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11439);
        __CLR4_5_28ma8malvickr7y.R.inc(11440);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11441);node.getPredicate().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11442);node.getArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11443);
        __CLR4_5_28ma8malvickr7y.R.inc(11444);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11445);node.getPredicate().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11446);node.getFirstArgument().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11447);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11448);
        __CLR4_5_28ma8malvickr7y.R.inc(11449);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11450);node.getPredicate().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11451);node.getFirstArgument().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11452);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11453);
        __CLR4_5_28ma8malvickr7y.R.inc(11454);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11455);for (SWRLDArgument obj : node.getArguments()) {{
            __CLR4_5_28ma8malvickr7y.R.inc(11456);obj.accept(this);
        }
    }}finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11457);
        __CLR4_5_28ma8malvickr7y.R.inc(11458);handleObject(node);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11459);
        __CLR4_5_28ma8malvickr7y.R.inc(11460);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11461);node.getIndividual().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11462);
        __CLR4_5_28ma8malvickr7y.R.inc(11463);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11464);node.getLiteral().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11465);
        __CLR4_5_28ma8malvickr7y.R.inc(11466);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11467);node.getFirstArgument().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11468);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_28ma8malvickr7y.R.inc(11469);
        __CLR4_5_28ma8malvickr7y.R.inc(11470);handleObject(node);
        __CLR4_5_28ma8malvickr7y.R.inc(11471);node.getFirstArgument().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11472);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_28ma8malvickr7y.R.inc(11473);
        __CLR4_5_28ma8malvickr7y.R.inc(11474);handleObject(axiom);
        __CLR4_5_28ma8malvickr7y.R.inc(11475);axiom.getDatatype().accept(this);
        __CLR4_5_28ma8malvickr7y.R.inc(11476);axiom.getDataRange().accept(this);
    }finally{__CLR4_5_28ma8malvickr7y.R.flushNeeded();}}
}
