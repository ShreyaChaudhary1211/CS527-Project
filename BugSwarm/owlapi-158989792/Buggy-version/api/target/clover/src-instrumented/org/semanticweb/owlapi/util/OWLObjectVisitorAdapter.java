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
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
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
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectVisitorAdapter extends OWLAxiomVisitorAdapter implements
        OWLObjectVisitor {public static class __CLR4_5_2acvacvlvickrfz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13523,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13423);
        __CLR4_5_2acvacvlvickrfz.R.inc(13424);handleDefault(ontology);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13425);
        __CLR4_5_2acvacvlvickrfz.R.inc(13426);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13427);
        __CLR4_5_2acvacvlvickrfz.R.inc(13428);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13429);
        __CLR4_5_2acvacvlvickrfz.R.inc(13430);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13431);
        __CLR4_5_2acvacvlvickrfz.R.inc(13432);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13433);
        __CLR4_5_2acvacvlvickrfz.R.inc(13434);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13435);
        __CLR4_5_2acvacvlvickrfz.R.inc(13436);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13437);
        __CLR4_5_2acvacvlvickrfz.R.inc(13438);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13439);
        __CLR4_5_2acvacvlvickrfz.R.inc(13440);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13441);
        __CLR4_5_2acvacvlvickrfz.R.inc(13442);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13443);
        __CLR4_5_2acvacvlvickrfz.R.inc(13444);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13445);
        __CLR4_5_2acvacvlvickrfz.R.inc(13446);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13447);
        __CLR4_5_2acvacvlvickrfz.R.inc(13448);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13449);
        __CLR4_5_2acvacvlvickrfz.R.inc(13450);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13451);
        __CLR4_5_2acvacvlvickrfz.R.inc(13452);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13453);
        __CLR4_5_2acvacvlvickrfz.R.inc(13454);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13455);
        __CLR4_5_2acvacvlvickrfz.R.inc(13456);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13457);
        __CLR4_5_2acvacvlvickrfz.R.inc(13458);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13459);
        __CLR4_5_2acvacvlvickrfz.R.inc(13460);handleDefault(ce);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13461);
        __CLR4_5_2acvacvlvickrfz.R.inc(13462);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13463);
        __CLR4_5_2acvacvlvickrfz.R.inc(13464);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13465);
        __CLR4_5_2acvacvlvickrfz.R.inc(13466);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13467);
        __CLR4_5_2acvacvlvickrfz.R.inc(13468);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13469);
        __CLR4_5_2acvacvlvickrfz.R.inc(13470);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13471);
        __CLR4_5_2acvacvlvickrfz.R.inc(13472);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13473);
        __CLR4_5_2acvacvlvickrfz.R.inc(13474);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13475);
        __CLR4_5_2acvacvlvickrfz.R.inc(13476);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13477);
        __CLR4_5_2acvacvlvickrfz.R.inc(13478);handleDefault(property);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13479);
        __CLR4_5_2acvacvlvickrfz.R.inc(13480);handleDefault(property);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13481);
        __CLR4_5_2acvacvlvickrfz.R.inc(13482);handleDefault(property);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13483);
        __CLR4_5_2acvacvlvickrfz.R.inc(13484);handleDefault(individual);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13485);
        __CLR4_5_2acvacvlvickrfz.R.inc(13486);handleDefault(property);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13487);
        __CLR4_5_2acvacvlvickrfz.R.inc(13488);handleDefault(axiom);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13489);
        __CLR4_5_2acvacvlvickrfz.R.inc(13490);handleDefault(axiom);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13491);
        __CLR4_5_2acvacvlvickrfz.R.inc(13492);handleDefault(axiom);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13493);
        __CLR4_5_2acvacvlvickrfz.R.inc(13494);handleDefault(axiom);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13495);
        __CLR4_5_2acvacvlvickrfz.R.inc(13496);handleDefault(individual);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13497);
        __CLR4_5_2acvacvlvickrfz.R.inc(13498);handleDefault(iri);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13499);
        __CLR4_5_2acvacvlvickrfz.R.inc(13500);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13501);
        __CLR4_5_2acvacvlvickrfz.R.inc(13502);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13503);
        __CLR4_5_2acvacvlvickrfz.R.inc(13504);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13505);
        __CLR4_5_2acvacvlvickrfz.R.inc(13506);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13507);
        __CLR4_5_2acvacvlvickrfz.R.inc(13508);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13509);
        __CLR4_5_2acvacvlvickrfz.R.inc(13510);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13511);
        __CLR4_5_2acvacvlvickrfz.R.inc(13512);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13513);
        __CLR4_5_2acvacvlvickrfz.R.inc(13514);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13515);
        __CLR4_5_2acvacvlvickrfz.R.inc(13516);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13517);
        __CLR4_5_2acvacvlvickrfz.R.inc(13518);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13519);
        __CLR4_5_2acvacvlvickrfz.R.inc(13520);handleDefault(node);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2acvacvlvickrfz.R.inc(13521);
        __CLR4_5_2acvacvlvickrfz.R.inc(13522);handleDefault(axiom);
    }finally{__CLR4_5_2acvacvlvickrfz.R.flushNeeded();}}
}
