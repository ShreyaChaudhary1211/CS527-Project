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
package org.semanticweb.owlapi.api.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.AutoIRIMapper;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;

@SuppressWarnings({ "javadoc", "null" })
public class SerializationTest extends TestBase {static class __CLR4_5_22cp2cplvicnzt2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private static final OWLDataFactory DF = OWLManager.getOWLDataFactory();
    @Nonnull OWL2Datatype owl2datatype = OWL2Datatype.XSD_INT;
    @Nonnull OWLDataPropertyExpression dp = DF.getOWLDataProperty(IRI.create("urn:dp"));
    @Nonnull OWLObjectPropertyExpression op = DF.getOWLObjectProperty(IRI.create("urn:op"));
    @Nonnull IRI iri = IRI.create("urn:iri");
    @Nonnull OWLLiteral owlliteral = DF.getOWLLiteral(true);
    @Nonnull OWLAnnotationSubject as = IRI.create("urn:i");
    @Nonnull OWLDatatype owldatatype = DF.getOWLDatatype(owl2datatype.getIRI());
    @Nonnull OWLDataRange dr = DF.getOWLDatatypeRestriction(owldatatype);
    @Nonnull OWLAnnotationProperty ap = DF.getOWLAnnotationProperty(IRI.create("urn:ap"));
    @Nonnull OWLFacet owlfacet = OWLFacet.MIN_EXCLUSIVE;
    @Nonnull OWLAnnotation owlannotation = DF.getOWLAnnotation(ap, owlliteral);
    @Nonnull String string = "testString";
    @Nonnull OWLClassExpression c = DF.getOWLClass(IRI.create("urn:classexpression"));
    @Nonnull PrefixManager prefixmanager = new DefaultPrefixManager();
    @Nonnull OWLIndividual ai = DF.getOWLAnonymousIndividual();
    @Nonnull OWLAnnotationValue owlannotationvalue = owlliteral;
    @Nonnull Set<OWLObjectPropertyExpression> setop = new HashSet<>();
    @Nonnull Set<OWLAnnotation> setowlannotation = new HashSet<>();
    @Nonnull Set<OWLDataPropertyExpression> setdp = new HashSet<>();
    @Nonnull List<OWLObjectPropertyExpression> listowlobjectpropertyexpression = new ArrayList<>();
    @Nonnull Set<OWLIndividual> setowlindividual = new HashSet<>();
    @Nonnull Set<OWLPropertyExpression> setowlpropertyexpression = new HashSet<>();
    @Nonnull OWLFacetRestriction[] lowlfacetrestriction = { DF.getOWLFacetRestriction(owlfacet, 1) };
    @Nonnull OWLFacetRestriction[] nulllowlfacetrestriction = { DF.getOWLFacetRestriction(owlfacet, 1) };
    @Nonnull Set<OWLClassExpression> setowlclassexpression = new HashSet<>();
    @Nonnull Set<OWLFacetRestriction> setowlfacetrestriction = new HashSet<>();
    @Nonnull OWLPropertyExpression[] owlpropertyexpression = {};

    @Test
    public void testrun() throws Exception {__CLR4_5_22cp2cplvicnzt2.R.globalSliceStart(getClass().getName(),3049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wa1yxs2cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22cp2cplvicnzt2.R.rethrow($CLV_t2$);}finally{__CLR4_5_22cp2cplvicnzt2.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.SerializationTest.testrun",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wa1yxs2cp() throws Exception{try{__CLR4_5_22cp2cplvicnzt2.R.inc(3049);
        __CLR4_5_22cp2cplvicnzt2.R.inc(3050);m.getIRIMappers().add(new AutoIRIMapper(new File("."), false));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3051);OWLOntology o = m.loadOntologyFromOntologyDocument(getClass().getResourceAsStream("/pizza.owl"));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3052);m.addAxiom(o, DF.getOWLDeclarationAxiom(DF.getOWLClass(iri)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3053);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLClass(string, prefixmanager)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3054);m.addAxiom(o, DF.getOWLEquivalentClassesAxiom(DF.getOWLClass(iri), c));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3055);m.addAxiom(o, DF.getOWLDisjointClassesAxiom(DF.getOWLClass(iri), c));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3056);m.addAxiom(o, DF.getOWLSubObjectPropertyOfAxiom(op, op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3057);m.addAxiom(o, DF.getOWLSubPropertyChainOfAxiom(listowlobjectpropertyexpression, op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3058);m.addAxiom(o, DF.getOWLEquivalentObjectPropertiesAxiom(setop));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3059);m.addAxiom(o, DF.getOWLDisjointObjectPropertiesAxiom(setop));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3060);m.addAxiom(o, DF.getOWLInverseObjectPropertiesAxiom(op, op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3061);m.addAxiom(o, DF.getOWLObjectPropertyDomainAxiom(op, c));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3062);m.addAxiom(o, DF.getOWLObjectPropertyRangeAxiom(op, c));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3063);m.addAxiom(o, DF.getOWLFunctionalObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3064);m.addAxiom(o, DF.getOWLAnnotationAssertionAxiom(ap, as, owlannotationvalue));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3065);m.applyChange(new AddImport(o, DF.getOWLImportsDeclaration(iri)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3066);m.addAxiom(o, DF.getOWLAnnotationPropertyDomainAxiom(ap, iri));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3067);m.addAxiom(o, DF.getOWLAnnotationPropertyRangeAxiom(ap, iri));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3068);m.addAxiom(o, DF.getOWLSubAnnotationPropertyOfAxiom(ap, ap));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3069);m.addAxiom(o, DF.getOWLInverseFunctionalObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3070);m.addAxiom(o, DF.getOWLReflexiveObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3071);m.addAxiom(o, DF.getOWLIrreflexiveObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3072);m.addAxiom(o, DF.getOWLSymmetricObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3073);m.addAxiom(o, DF.getOWLAsymmetricObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3074);m.addAxiom(o, DF.getOWLTransitiveObjectPropertyAxiom(op));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3075);m.addAxiom(o, DF.getOWLSubDataPropertyOfAxiom(dp, dp));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3076);m.addAxiom(o, DF.getOWLEquivalentDataPropertiesAxiom(setdp));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3077);m.addAxiom(o, DF.getOWLDisjointDataPropertiesAxiom(setdp));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3078);m.addAxiom(o, DF.getOWLDataPropertyDomainAxiom(dp, c));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3079);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, dr));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3080);m.addAxiom(o, DF.getOWLFunctionalDataPropertyAxiom(dp));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3081);m.addAxiom(o, DF.getOWLHasKeyAxiom(c, setowlpropertyexpression));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3082);m.addAxiom(o, DF.getOWLDatatypeDefinitionAxiom(owldatatype, dr));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3083);m.addAxiom(o, DF.getOWLSameIndividualAxiom(setowlindividual));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3084);m.addAxiom(o, DF.getOWLDifferentIndividualsAxiom(setowlindividual));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3085);m.addAxiom(o, DF.getOWLClassAssertionAxiom(c, ai));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3086);m.addAxiom(o, DF.getOWLObjectPropertyAssertionAxiom(op, ai, ai));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3087);m.addAxiom(o, DF.getOWLNegativeObjectPropertyAssertionAxiom(op, ai, ai));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3088);m.addAxiom(o, DF.getOWLDataPropertyAssertionAxiom(dp, ai, owlliteral));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3089);m.addAxiom(o, DF.getOWLNegativeDataPropertyAssertionAxiom(dp, ai, owlliteral));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3090);m.addAxiom(o, DF.getOWLInverseObjectPropertiesAxiom(op, DF.getOWLObjectInverseOf(op)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3091);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataExactCardinality(1, dp)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3092);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataMaxCardinality(1, dp)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3093);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataMinCardinality(1, dp)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3094);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectExactCardinality(1, op)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3095);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectMaxCardinality(1, op)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3096);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectMinCardinality(1, op)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3097);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDatatype(string, prefixmanager)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3098);m.addAxiom(o, DF.getOWLDataPropertyAssertionAxiom(dp, ai, DF.getOWLLiteral(string, owldatatype)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3099);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDataOneOf(owlliteral)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3100);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDataUnionOf(dr)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3101);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDataIntersectionOf(dr)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3102);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDatatypeRestriction(owldatatype, owlfacet,
            owlliteral)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3103);m.addAxiom(o, DF.getOWLDataPropertyRangeAxiom(dp, DF.getOWLDatatypeRestriction(owldatatype, DF
            .getOWLFacetRestriction(owlfacet, 1))));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3104);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectIntersectionOf(c, DF.getOWLClass(string,
            prefixmanager))));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3105);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataSomeValuesFrom(dp, dr)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3106);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataAllValuesFrom(dp, dr)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3107);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLDataHasValue(dp, owlliteral)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3108);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectComplementOf(DF.getOWLClass(iri))));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3109);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectOneOf(DF.getOWLNamedIndividual(iri))));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3110);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectAllValuesFrom(op, c)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3111);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectSomeValuesFrom(op, c)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3112);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectHasValue(op, ai)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3113);m.addAxiom(o, DF.getOWLSubClassOfAxiom(c, DF.getOWLObjectUnionOf(DF.getOWLClass(iri))));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3114);m.addAxiom(o, DF.getOWLAnnotationAssertionAxiom(iri, DF.getOWLAnnotation(ap, owlannotationvalue)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3115);m.addAxiom(o, DF.getOWLAnnotationAssertionAxiom(DF.getOWLNamedIndividual(iri).getIRI(), DF.getOWLAnnotation(ap,
            owlannotationvalue)));
        __CLR4_5_22cp2cplvicnzt2.R.inc(3116);ByteArrayOutputStream out = new ByteArrayOutputStream();
        __CLR4_5_22cp2cplvicnzt2.R.inc(3117);ObjectOutputStream stream = new ObjectOutputStream(out);
        __CLR4_5_22cp2cplvicnzt2.R.inc(3118);stream.writeObject(m);
        __CLR4_5_22cp2cplvicnzt2.R.inc(3119);stream.flush();
        // System.out.println(out.toString());
        __CLR4_5_22cp2cplvicnzt2.R.inc(3120);ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        __CLR4_5_22cp2cplvicnzt2.R.inc(3121);ObjectInputStream inStream = new ObjectInputStream(in);
        __CLR4_5_22cp2cplvicnzt2.R.inc(3122);OWLOntologyManager copy = (OWLOntologyManager) inStream.readObject();
        __CLR4_5_22cp2cplvicnzt2.R.inc(3123);for (OWLOntology onto : copy.getOntologies()) {{
            __CLR4_5_22cp2cplvicnzt2.R.inc(3124);OWLOntology original = m.getOntology(onto.getOntologyID().getOntologyIRI().get());
            __CLR4_5_22cp2cplvicnzt2.R.inc(3125);assertEquals("Troubles with ontology " + onto.getOntologyID(), original.getAxioms(), onto.getAxioms());
        }
    }}finally{__CLR4_5_22cp2cplvicnzt2.R.flushNeeded();}}
}
