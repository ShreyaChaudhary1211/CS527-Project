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
 * A delegating visitor. This utility class can be used to override visiting a
 * particular type of object.
 * 
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 * @param <O>
 *        the returned type
 */
public class DelegatingObjectVisitorEx<O> implements OWLObjectVisitorEx<O> {public static class __CLR4_5_25nc5nclvickpqm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,7490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLObjectVisitorEx<O> delegate;

    /**
     * Constructs a visitor where the specified delegate will be used to visit
     * all objects unless one of the visit methods in this visitor is overriden.
     * 
     * @param delegate
     *        The delegate.
     */
    public DelegatingObjectVisitorEx(OWLObjectVisitorEx<O> delegate) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7320);
        __CLR4_5_25nc5nclvickpqm.R.inc(7321);this.delegate = delegate;
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7322);
        __CLR4_5_25nc5nclvickpqm.R.inc(7323);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7324);
        __CLR4_5_25nc5nclvickpqm.R.inc(7325);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7326);
        __CLR4_5_25nc5nclvickpqm.R.inc(7327);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7328);
        __CLR4_5_25nc5nclvickpqm.R.inc(7329);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7330);
        __CLR4_5_25nc5nclvickpqm.R.inc(7331);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7332);
        __CLR4_5_25nc5nclvickpqm.R.inc(7333);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7334);
        __CLR4_5_25nc5nclvickpqm.R.inc(7335);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7336);
        __CLR4_5_25nc5nclvickpqm.R.inc(7337);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7338);
        __CLR4_5_25nc5nclvickpqm.R.inc(7339);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7340);
        __CLR4_5_25nc5nclvickpqm.R.inc(7341);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7342);
        __CLR4_5_25nc5nclvickpqm.R.inc(7343);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7344);
        __CLR4_5_25nc5nclvickpqm.R.inc(7345);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7346);
        __CLR4_5_25nc5nclvickpqm.R.inc(7347);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7348);
        __CLR4_5_25nc5nclvickpqm.R.inc(7349);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7350);
        __CLR4_5_25nc5nclvickpqm.R.inc(7351);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7352);
        __CLR4_5_25nc5nclvickpqm.R.inc(7353);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7354);
        __CLR4_5_25nc5nclvickpqm.R.inc(7355);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7356);
        __CLR4_5_25nc5nclvickpqm.R.inc(7357);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7358);
        __CLR4_5_25nc5nclvickpqm.R.inc(7359);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7360);
        __CLR4_5_25nc5nclvickpqm.R.inc(7361);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7362);
        __CLR4_5_25nc5nclvickpqm.R.inc(7363);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7364);
        __CLR4_5_25nc5nclvickpqm.R.inc(7365);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7366);
        __CLR4_5_25nc5nclvickpqm.R.inc(7367);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7368);
        __CLR4_5_25nc5nclvickpqm.R.inc(7369);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7370);
        __CLR4_5_25nc5nclvickpqm.R.inc(7371);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7372);
        __CLR4_5_25nc5nclvickpqm.R.inc(7373);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7374);
        __CLR4_5_25nc5nclvickpqm.R.inc(7375);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7376);
        __CLR4_5_25nc5nclvickpqm.R.inc(7377);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7378);
        __CLR4_5_25nc5nclvickpqm.R.inc(7379);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7380);
        __CLR4_5_25nc5nclvickpqm.R.inc(7381);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7382);
        __CLR4_5_25nc5nclvickpqm.R.inc(7383);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7384);
        __CLR4_5_25nc5nclvickpqm.R.inc(7385);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7386);
        __CLR4_5_25nc5nclvickpqm.R.inc(7387);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLRule rule) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7388);
        __CLR4_5_25nc5nclvickpqm.R.inc(7389);return delegate.visit(rule);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLClass ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7390);
        __CLR4_5_25nc5nclvickpqm.R.inc(7391);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7392);
        __CLR4_5_25nc5nclvickpqm.R.inc(7393);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataExactCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7394);
        __CLR4_5_25nc5nclvickpqm.R.inc(7395);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataMaxCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7396);
        __CLR4_5_25nc5nclvickpqm.R.inc(7397);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataMinCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7398);
        __CLR4_5_25nc5nclvickpqm.R.inc(7399);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7400);
        __CLR4_5_25nc5nclvickpqm.R.inc(7401);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataHasValue ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7402);
        __CLR4_5_25nc5nclvickpqm.R.inc(7403);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7404);
        __CLR4_5_25nc5nclvickpqm.R.inc(7405);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectComplementOf ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7406);
        __CLR4_5_25nc5nclvickpqm.R.inc(7407);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectExactCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7408);
        __CLR4_5_25nc5nclvickpqm.R.inc(7409);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7410);
        __CLR4_5_25nc5nclvickpqm.R.inc(7411);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7412);
        __CLR4_5_25nc5nclvickpqm.R.inc(7413);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectMinCardinality ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7414);
        __CLR4_5_25nc5nclvickpqm.R.inc(7415);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectOneOf ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7416);
        __CLR4_5_25nc5nclvickpqm.R.inc(7417);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectHasSelf ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7418);
        __CLR4_5_25nc5nclvickpqm.R.inc(7419);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7420);
        __CLR4_5_25nc5nclvickpqm.R.inc(7421);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectUnionOf ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7422);
        __CLR4_5_25nc5nclvickpqm.R.inc(7423);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectHasValue ce) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7424);
        __CLR4_5_25nc5nclvickpqm.R.inc(7425);return delegate.visit(ce);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataComplementOf node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7426);
        __CLR4_5_25nc5nclvickpqm.R.inc(7427);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataOneOf node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7428);
        __CLR4_5_25nc5nclvickpqm.R.inc(7429);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLFacetRestriction node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7430);
        __CLR4_5_25nc5nclvickpqm.R.inc(7431);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDatatypeRestriction node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7432);
        __CLR4_5_25nc5nclvickpqm.R.inc(7433);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDatatype node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7434);
        __CLR4_5_25nc5nclvickpqm.R.inc(7435);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLLiteral node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7436);
        __CLR4_5_25nc5nclvickpqm.R.inc(7437);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataProperty property) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7438);
        __CLR4_5_25nc5nclvickpqm.R.inc(7439);return delegate.visit(property);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectProperty property) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7440);
        __CLR4_5_25nc5nclvickpqm.R.inc(7441);return delegate.visit(property);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectInverseOf property) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7442);
        __CLR4_5_25nc5nclvickpqm.R.inc(7443);return delegate.visit(property);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLLiteralArgument node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7444);
        __CLR4_5_25nc5nclvickpqm.R.inc(7445);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLVariable node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7446);
        __CLR4_5_25nc5nclvickpqm.R.inc(7447);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLIndividualArgument node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7448);
        __CLR4_5_25nc5nclvickpqm.R.inc(7449);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLBuiltInAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7450);
        __CLR4_5_25nc5nclvickpqm.R.inc(7451);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLClassAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7452);
        __CLR4_5_25nc5nclvickpqm.R.inc(7453);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLDataRangeAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7454);
        __CLR4_5_25nc5nclvickpqm.R.inc(7455);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLDataPropertyAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7456);
        __CLR4_5_25nc5nclvickpqm.R.inc(7457);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7458);
        __CLR4_5_25nc5nclvickpqm.R.inc(7459);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7460);
        __CLR4_5_25nc5nclvickpqm.R.inc(7461);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(SWRLSameIndividualAtom node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7462);
        __CLR4_5_25nc5nclvickpqm.R.inc(7463);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLOntology ontology) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7464);
        __CLR4_5_25nc5nclvickpqm.R.inc(7465);return delegate.visit(ontology);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotation node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7466);
        __CLR4_5_25nc5nclvickpqm.R.inc(7467);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7468);
        __CLR4_5_25nc5nclvickpqm.R.inc(7469);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7470);
        __CLR4_5_25nc5nclvickpqm.R.inc(7471);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7472);
        __CLR4_5_25nc5nclvickpqm.R.inc(7473);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationProperty property) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7474);
        __CLR4_5_25nc5nclvickpqm.R.inc(7475);return delegate.visit(property);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7476);
        __CLR4_5_25nc5nclvickpqm.R.inc(7477);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataIntersectionOf node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7478);
        __CLR4_5_25nc5nclvickpqm.R.inc(7479);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDataUnionOf node) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7480);
        __CLR4_5_25nc5nclvickpqm.R.inc(7481);return delegate.visit(node);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLNamedIndividual individual) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7482);
        __CLR4_5_25nc5nclvickpqm.R.inc(7483);return delegate.visit(individual);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLAnonymousIndividual individual) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7484);
        __CLR4_5_25nc5nclvickpqm.R.inc(7485);return delegate.visit(individual);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(IRI iri) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7486);
        __CLR4_5_25nc5nclvickpqm.R.inc(7487);return delegate.visit(iri);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}

    @Override
    public O visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_25nc5nclvickpqm.R.inc(7488);
        __CLR4_5_25nc5nclvickpqm.R.inc(7489);return delegate.visit(axiom);
    }finally{__CLR4_5_25nc5nclvickpqm.R.flushNeeded();}}
}
