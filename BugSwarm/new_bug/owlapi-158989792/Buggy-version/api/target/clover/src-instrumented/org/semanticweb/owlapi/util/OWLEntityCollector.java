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

import java.util.Collection;
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
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
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
import org.semanticweb.owlapi.model.SWRLObjectVisitorEx;
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
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEntityCollector implements
        OWLObjectVisitorEx<Collection<OWLEntity>>,
        SWRLObjectVisitorEx<Collection<OWLEntity>> {public static class __CLR4_5_282z82zlvickr0q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Collection<OWLEntity> objects;

    /**
     * @param toReturn
     *        the set that will contain the results
     */
    public OWLEntityCollector(@Nonnull Set<OWLEntity> toReturn) {try{__CLR4_5_282z82zlvickr0q.R.inc(10475);
        __CLR4_5_282z82zlvickr0q.R.inc(10476);objects = checkNotNull(toReturn, "toReturn cannot be null");
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    protected void processAxiomAnnotations(@Nonnull OWLAxiom ax) {try{__CLR4_5_282z82zlvickr0q.R.inc(10477);
        // default behavior: iterate over the annotations outside the axiom
        __CLR4_5_282z82zlvickr0q.R.inc(10478);for (OWLAnnotation anno : ax.getAnnotations()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10479);anno.accept(this);
        }
    }}finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10480);
        __CLR4_5_282z82zlvickr0q.R.inc(10481);axiom.getSubClass().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10482);axiom.getSuperClass().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10483);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10484);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(
            OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10485);
        __CLR4_5_282z82zlvickr0q.R.inc(10486);axiom.getSubject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10487);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10488);axiom.getObject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10489);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10490);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10491);
        __CLR4_5_282z82zlvickr0q.R.inc(10492);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10493);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10494);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10495);
        __CLR4_5_282z82zlvickr0q.R.inc(10496);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10497);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10498);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10499);
        __CLR4_5_282z82zlvickr0q.R.inc(10500);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10501);desc.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10502);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10503);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10504);
        __CLR4_5_282z82zlvickr0q.R.inc(10505);axiom.getDomain().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10506);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10507);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10508);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10509);
        __CLR4_5_282z82zlvickr0q.R.inc(10510);axiom.getDomain().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10511);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10512);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10513);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity>
            visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10514);
        __CLR4_5_282z82zlvickr0q.R.inc(10515);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10516);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10517);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10518);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(
            OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10519);
        __CLR4_5_282z82zlvickr0q.R.inc(10520);axiom.getSubject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10521);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10522);axiom.getObject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10523);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10524);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10525);
        __CLR4_5_282z82zlvickr0q.R.inc(10526);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10527);ind.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10528);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10529);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10530);
        __CLR4_5_282z82zlvickr0q.R.inc(10531);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10532);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10533);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10534);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10535);
        __CLR4_5_282z82zlvickr0q.R.inc(10536);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10537);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10538);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10539);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10540);
        __CLR4_5_282z82zlvickr0q.R.inc(10541);axiom.getRange().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10542);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10543);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10544);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10545);
        __CLR4_5_282z82zlvickr0q.R.inc(10546);axiom.getSubject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10547);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10548);axiom.getObject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10549);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10550);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10551);
        __CLR4_5_282z82zlvickr0q.R.inc(10552);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10553);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10554);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10555);
        __CLR4_5_282z82zlvickr0q.R.inc(10556);axiom.getSubProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10557);axiom.getSuperProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10558);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10559);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10560);
        __CLR4_5_282z82zlvickr0q.R.inc(10561);axiom.getOWLClass().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10562);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10563);desc.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10564);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10565);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10566);
        __CLR4_5_282z82zlvickr0q.R.inc(10567);axiom.getEntity().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10568);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10569);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10570);
        __CLR4_5_282z82zlvickr0q.R.inc(10571);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10572);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10573);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10574);
        __CLR4_5_282z82zlvickr0q.R.inc(10575);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10576);axiom.getRange().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10577);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10578);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10579);
        __CLR4_5_282z82zlvickr0q.R.inc(10580);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10581);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10582);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10583);
        __CLR4_5_282z82zlvickr0q.R.inc(10584);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10585);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10586);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10587);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10588);
        __CLR4_5_282z82zlvickr0q.R.inc(10589);axiom.getClassExpression().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10590);axiom.getIndividual().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10591);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10592);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10593);
        __CLR4_5_282z82zlvickr0q.R.inc(10594);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10595);desc.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10596);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10597);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10598);
        __CLR4_5_282z82zlvickr0q.R.inc(10599);axiom.getSubject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10600);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10601);axiom.getObject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10602);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10603);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10604);
        __CLR4_5_282z82zlvickr0q.R.inc(10605);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10606);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10607);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10608);
        __CLR4_5_282z82zlvickr0q.R.inc(10609);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10610);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10611);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10612);
        __CLR4_5_282z82zlvickr0q.R.inc(10613);axiom.getSubProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10614);axiom.getSuperProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10615);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10616);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(
            OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10617);
        __CLR4_5_282z82zlvickr0q.R.inc(10618);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10619);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10620);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10621);
        __CLR4_5_282z82zlvickr0q.R.inc(10622);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10623);ind.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10624);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10625);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10626);
        __CLR4_5_282z82zlvickr0q.R.inc(10627);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10628);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10629);axiom.getSuperProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10630);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10631);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10632);
        __CLR4_5_282z82zlvickr0q.R.inc(10633);axiom.getFirstProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10634);axiom.getSecondProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10635);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10636);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10637);
        __CLR4_5_282z82zlvickr0q.R.inc(10638);axiom.getClassExpression().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10639);for (OWLPropertyExpression prop : axiom.getPropertyExpressions()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10640);prop.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10641);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10642);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    // OWLClassExpressionVisitor
    @Override
    public Collection<OWLEntity> visit(OWLClass ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10643);
        __CLR4_5_282z82zlvickr0q.R.inc(10644);objects.add(ce);
        __CLR4_5_282z82zlvickr0q.R.inc(10645);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10646);
        __CLR4_5_282z82zlvickr0q.R.inc(10647);for (OWLClassExpression operand : ce.getOperands()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10648);operand.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10649);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectUnionOf ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10650);
        __CLR4_5_282z82zlvickr0q.R.inc(10651);for (OWLClassExpression operand : ce.getOperands()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10652);operand.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10653);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectComplementOf ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10654);
        __CLR4_5_282z82zlvickr0q.R.inc(10655);ce.getOperand().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10656);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10657);
        __CLR4_5_282z82zlvickr0q.R.inc(10658);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10659);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10660);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10661);
        __CLR4_5_282z82zlvickr0q.R.inc(10662);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10663);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10664);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectHasValue ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10665);
        __CLR4_5_282z82zlvickr0q.R.inc(10666);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10667);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10668);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectMinCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10669);
        __CLR4_5_282z82zlvickr0q.R.inc(10670);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10671);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10672);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectExactCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10673);
        __CLR4_5_282z82zlvickr0q.R.inc(10674);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10675);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10676);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10677);
        __CLR4_5_282z82zlvickr0q.R.inc(10678);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10679);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10680);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectHasSelf ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10681);
        __CLR4_5_282z82zlvickr0q.R.inc(10682);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10683);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLObjectOneOf ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10684);
        __CLR4_5_282z82zlvickr0q.R.inc(10685);for (OWLIndividual ind : ce.getIndividuals()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10686);ind.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10687);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10688);
        __CLR4_5_282z82zlvickr0q.R.inc(10689);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10690);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10691);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10692);
        __CLR4_5_282z82zlvickr0q.R.inc(10693);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10694);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10695);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataHasValue ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10696);
        __CLR4_5_282z82zlvickr0q.R.inc(10697);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10698);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10699);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataMinCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10700);
        __CLR4_5_282z82zlvickr0q.R.inc(10701);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10702);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10703);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataExactCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10704);
        __CLR4_5_282z82zlvickr0q.R.inc(10705);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10706);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10707);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataMaxCardinality ce) {try{__CLR4_5_282z82zlvickr0q.R.inc(10708);
        __CLR4_5_282z82zlvickr0q.R.inc(10709);ce.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10710);ce.getFiller().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10711);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    // Data visitor
    @Override
    public Collection<OWLEntity> visit(OWLDataComplementOf node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10712);
        __CLR4_5_282z82zlvickr0q.R.inc(10713);node.getDataRange().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10714);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataOneOf node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10715);
        __CLR4_5_282z82zlvickr0q.R.inc(10716);for (OWLLiteral val : node.getValues()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10717);val.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10718);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataIntersectionOf node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10719);
        __CLR4_5_282z82zlvickr0q.R.inc(10720);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10721);dr.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10722);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataUnionOf node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10723);
        __CLR4_5_282z82zlvickr0q.R.inc(10724);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10725);dr.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10726);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDatatypeRestriction node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10727);
        __CLR4_5_282z82zlvickr0q.R.inc(10728);node.getDatatype().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10729);for (OWLFacetRestriction facetRestriction : node.getFacetRestrictions()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10730);facetRestriction.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10731);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLFacetRestriction node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10732);
        __CLR4_5_282z82zlvickr0q.R.inc(10733);node.getFacetValue().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10734);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLLiteral node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10735);
        __CLR4_5_282z82zlvickr0q.R.inc(10736);node.getDatatype().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10737);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    // Property expression visitor
    @Override
    public Collection<OWLEntity> visit(OWLObjectInverseOf property) {try{__CLR4_5_282z82zlvickr0q.R.inc(10738);
        __CLR4_5_282z82zlvickr0q.R.inc(10739);property.getInverse().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10740);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    // Entity visitor
    @Override
    public Collection<OWLEntity> visit(OWLObjectProperty property) {try{__CLR4_5_282z82zlvickr0q.R.inc(10741);
        __CLR4_5_282z82zlvickr0q.R.inc(10742);objects.add(property);
        __CLR4_5_282z82zlvickr0q.R.inc(10743);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDataProperty property) {try{__CLR4_5_282z82zlvickr0q.R.inc(10744);
        __CLR4_5_282z82zlvickr0q.R.inc(10745);objects.add(property);
        __CLR4_5_282z82zlvickr0q.R.inc(10746);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLNamedIndividual individual) {try{__CLR4_5_282z82zlvickr0q.R.inc(10747);
        __CLR4_5_282z82zlvickr0q.R.inc(10748);objects.add(individual);
        __CLR4_5_282z82zlvickr0q.R.inc(10749);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDatatype node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10750);
        __CLR4_5_282z82zlvickr0q.R.inc(10751);objects.add(node);
        __CLR4_5_282z82zlvickr0q.R.inc(10752);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnnotation node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10753);
        __CLR4_5_282z82zlvickr0q.R.inc(10754);node.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10755);node.getValue().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10756);for (OWLAnnotation anno : node.getAnnotations()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10757);anno.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10758);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10759);
        __CLR4_5_282z82zlvickr0q.R.inc(10760);axiom.getSubject().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10761);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10762);axiom.getValue().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10763);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10764);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnonymousIndividual individual) {try{__CLR4_5_282z82zlvickr0q.R.inc(10765);
        __CLR4_5_282z82zlvickr0q.R.inc(10766);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(IRI iri) {try{__CLR4_5_282z82zlvickr0q.R.inc(10767);
        __CLR4_5_282z82zlvickr0q.R.inc(10768);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLOntology ontology) {try{__CLR4_5_282z82zlvickr0q.R.inc(10769);
        __CLR4_5_282z82zlvickr0q.R.inc(10770);objects.addAll(ontology.getSignature());
        __CLR4_5_282z82zlvickr0q.R.inc(10771);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnnotationProperty property) {try{__CLR4_5_282z82zlvickr0q.R.inc(10772);
        __CLR4_5_282z82zlvickr0q.R.inc(10773);objects.add(property);
        __CLR4_5_282z82zlvickr0q.R.inc(10774);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10775);
        __CLR4_5_282z82zlvickr0q.R.inc(10776);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10777);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10778);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10779);
        __CLR4_5_282z82zlvickr0q.R.inc(10780);axiom.getProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10781);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10782);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10783);
        __CLR4_5_282z82zlvickr0q.R.inc(10784);axiom.getSubProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10785);axiom.getSuperProperty().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10786);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10787);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_282z82zlvickr0q.R.inc(10788);
        __CLR4_5_282z82zlvickr0q.R.inc(10789);axiom.getDatatype().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10790);axiom.getDataRange().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10791);processAxiomAnnotations(axiom);
        __CLR4_5_282z82zlvickr0q.R.inc(10792);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    // SWRL Object Visitor
    @Override
    public Collection<OWLEntity> visit(SWRLRule rule) {try{__CLR4_5_282z82zlvickr0q.R.inc(10793);
        __CLR4_5_282z82zlvickr0q.R.inc(10794);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10795);atom.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10796);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10797);atom.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10798);processAxiomAnnotations(rule);
        __CLR4_5_282z82zlvickr0q.R.inc(10799);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLClassAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10800);
        __CLR4_5_282z82zlvickr0q.R.inc(10801);node.getArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10802);node.getPredicate().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10803);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLDataRangeAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10804);
        __CLR4_5_282z82zlvickr0q.R.inc(10805);node.getArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10806);node.getPredicate().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10807);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10808);
        __CLR4_5_282z82zlvickr0q.R.inc(10809);node.getPredicate().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10810);node.getFirstArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10811);node.getSecondArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10812);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLDataPropertyAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10813);
        __CLR4_5_282z82zlvickr0q.R.inc(10814);node.getPredicate().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10815);node.getFirstArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10816);node.getSecondArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10817);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLBuiltInAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10818);
        __CLR4_5_282z82zlvickr0q.R.inc(10819);for (SWRLArgument obj : node.getAllArguments()) {{
            __CLR4_5_282z82zlvickr0q.R.inc(10820);obj.accept(this);
        }
        }__CLR4_5_282z82zlvickr0q.R.inc(10821);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLVariable node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10822);
        __CLR4_5_282z82zlvickr0q.R.inc(10823);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLIndividualArgument node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10824);
        __CLR4_5_282z82zlvickr0q.R.inc(10825);node.getIndividual().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10826);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLLiteralArgument node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10827);
        __CLR4_5_282z82zlvickr0q.R.inc(10828);node.getLiteral().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10829);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10830);
        __CLR4_5_282z82zlvickr0q.R.inc(10831);node.getFirstArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10832);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}

    @Override
    public Collection<OWLEntity> visit(SWRLSameIndividualAtom node) {try{__CLR4_5_282z82zlvickr0q.R.inc(10833);
        __CLR4_5_282z82zlvickr0q.R.inc(10834);node.getSecondArgument().accept(this);
        __CLR4_5_282z82zlvickr0q.R.inc(10835);return objects;
    }finally{__CLR4_5_282z82zlvickr0q.R.flushNeeded();}}
}
