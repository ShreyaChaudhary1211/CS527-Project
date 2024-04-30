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
package org.semanticweb.owlapi.profiles;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.profiles.violations.CycleInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.violations.DatatypeIRIAlsoUsedAsClassIRI;
import org.semanticweb.owlapi.profiles.violations.EmptyOneOfAxiom;
import org.semanticweb.owlapi.profiles.violations.IllegalPunning;
import org.semanticweb.owlapi.profiles.violations.InsufficientIndividuals;
import org.semanticweb.owlapi.profiles.violations.InsufficientOperands;
import org.semanticweb.owlapi.profiles.violations.InsufficientPropertyExpressions;
import org.semanticweb.owlapi.profiles.violations.LastPropertyInChainNotInImposedRange;
import org.semanticweb.owlapi.profiles.violations.LexicalNotInLexicalSpace;
import org.semanticweb.owlapi.profiles.violations.OntologyIRINotAbsolute;
import org.semanticweb.owlapi.profiles.violations.OntologyVersionIRINotAbsolute;
import org.semanticweb.owlapi.profiles.violations.UseOfAnonymousIndividual;
import org.semanticweb.owlapi.profiles.violations.UseOfBuiltInDatatypeInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.violations.UseOfDefinedDatatypeInDatatypeRestriction;
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalDataRange;
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalFacetRestriction;
import org.semanticweb.owlapi.profiles.violations.UseOfNonAbsoluteIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfNonAtomicClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfNonEquivalentClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInCardinalityRestriction;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInDisjointPropertiesAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInFunctionalPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInIrreflexivePropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInObjectHasSelf;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSubClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSuperClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfObjectPropertyInverse;
import org.semanticweb.owlapi.profiles.violations.UseOfPropertyInChainCausesCycle;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForAnnotationPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForClassIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForDataPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForIndividualIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForObjectPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForOntologyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForVersionIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredAnnotationProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredClass;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDataProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDatatype;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredObjectProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUnknownDatatype;
import org.semanticweb.owlapi.util.OWLBaseVisitorExAdapter;

/**
 * adapter class
 * 
 * @param <O>
 *        return type
 */
public class OWLProfileViolationVisitorExAdapter<O> extends
        OWLBaseVisitorExAdapter<O, OWLProfileViolation> implements
        OWLProfileViolationVisitorEx<O> {public static class __CLR4_5_23cp3cplvicknu8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** default returned value is null */
    @SuppressWarnings("null")
    public OWLProfileViolationVisitorExAdapter() {
        this(null);__CLR4_5_23cp3cplvicknu8.R.inc(4346);try{__CLR4_5_23cp3cplvicknu8.R.inc(4345);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    /**
     * @param o
     *        default return value
     */
    public OWLProfileViolationVisitorExAdapter(@Nonnull O o) {
        super(o);__CLR4_5_23cp3cplvicknu8.R.inc(4348);try{__CLR4_5_23cp3cplvicknu8.R.inc(4347);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull IllegalPunning v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4349);
        __CLR4_5_23cp3cplvicknu8.R.inc(4350);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull CycleInDatatypeDefinition v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4351);
        __CLR4_5_23cp3cplvicknu8.R.inc(4352);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfBuiltInDatatypeInDatatypeDefinition v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4353);
        __CLR4_5_23cp3cplvicknu8.R.inc(4354);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull DatatypeIRIAlsoUsedAsClassIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4355);
        __CLR4_5_23cp3cplvicknu8.R.inc(4356);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(
            @Nonnull UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4357);
        __CLR4_5_23cp3cplvicknu8.R.inc(4358);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSimplePropertyInCardinalityRestriction v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4359);
        __CLR4_5_23cp3cplvicknu8.R.inc(4360);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSimplePropertyInDisjointPropertiesAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4361);
        __CLR4_5_23cp3cplvicknu8.R.inc(4362);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSimplePropertyInFunctionalPropertyAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4363);
        __CLR4_5_23cp3cplvicknu8.R.inc(4364);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public
            O
            visit(@Nonnull UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4365);
        __CLR4_5_23cp3cplvicknu8.R.inc(4366);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSimplePropertyInIrreflexivePropertyAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4367);
        __CLR4_5_23cp3cplvicknu8.R.inc(4368);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSimplePropertyInObjectHasSelf v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4369);
        __CLR4_5_23cp3cplvicknu8.R.inc(4370);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfPropertyInChainCausesCycle v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4371);
        __CLR4_5_23cp3cplvicknu8.R.inc(4372);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForAnnotationPropertyIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4373);
        __CLR4_5_23cp3cplvicknu8.R.inc(4374);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForClassIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4375);
        __CLR4_5_23cp3cplvicknu8.R.inc(4376);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForDataPropertyIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4377);
        __CLR4_5_23cp3cplvicknu8.R.inc(4378);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForIndividualIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4379);
        __CLR4_5_23cp3cplvicknu8.R.inc(4380);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForObjectPropertyIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4381);
        __CLR4_5_23cp3cplvicknu8.R.inc(4382);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForOntologyIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4383);
        __CLR4_5_23cp3cplvicknu8.R.inc(4384);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfReservedVocabularyForVersionIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4385);
        __CLR4_5_23cp3cplvicknu8.R.inc(4386);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(
            @Nonnull UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4387);
        __CLR4_5_23cp3cplvicknu8.R.inc(4388);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUndeclaredAnnotationProperty v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4389);
        __CLR4_5_23cp3cplvicknu8.R.inc(4390);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUndeclaredClass v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4391);
        __CLR4_5_23cp3cplvicknu8.R.inc(4392);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUndeclaredDataProperty v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4393);
        __CLR4_5_23cp3cplvicknu8.R.inc(4394);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUndeclaredDatatype v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4395);
        __CLR4_5_23cp3cplvicknu8.R.inc(4396);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUndeclaredObjectProperty v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4397);
        __CLR4_5_23cp3cplvicknu8.R.inc(4398);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull InsufficientPropertyExpressions v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4399);
        __CLR4_5_23cp3cplvicknu8.R.inc(4400);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull InsufficientIndividuals v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4401);
        __CLR4_5_23cp3cplvicknu8.R.inc(4402);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull InsufficientOperands v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4403);
        __CLR4_5_23cp3cplvicknu8.R.inc(4404);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull EmptyOneOfAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4405);
        __CLR4_5_23cp3cplvicknu8.R.inc(4406);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull LastPropertyInChainNotInImposedRange v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4407);
        __CLR4_5_23cp3cplvicknu8.R.inc(4408);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull OntologyIRINotAbsolute v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4409);
        __CLR4_5_23cp3cplvicknu8.R.inc(4410);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfDefinedDatatypeInDatatypeRestriction v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4411);
        __CLR4_5_23cp3cplvicknu8.R.inc(4412);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfIllegalClassExpression v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4413);
        __CLR4_5_23cp3cplvicknu8.R.inc(4414);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfIllegalDataRange v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4415);
        __CLR4_5_23cp3cplvicknu8.R.inc(4416);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfUnknownDatatype v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4417);
        __CLR4_5_23cp3cplvicknu8.R.inc(4418);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfObjectPropertyInverse v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4419);
        __CLR4_5_23cp3cplvicknu8.R.inc(4420);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSuperClassExpression v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4421);
        __CLR4_5_23cp3cplvicknu8.R.inc(4422);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonSubClassExpression v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4423);
        __CLR4_5_23cp3cplvicknu8.R.inc(4424);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonEquivalentClassExpression v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4425);
        __CLR4_5_23cp3cplvicknu8.R.inc(4426);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonAtomicClassExpression v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4427);
        __CLR4_5_23cp3cplvicknu8.R.inc(4428);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull LexicalNotInLexicalSpace v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4429);
        __CLR4_5_23cp3cplvicknu8.R.inc(4430);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull OntologyVersionIRINotAbsolute v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4431);
        __CLR4_5_23cp3cplvicknu8.R.inc(4432);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfAnonymousIndividual v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4433);
        __CLR4_5_23cp3cplvicknu8.R.inc(4434);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfIllegalAxiom v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4435);
        __CLR4_5_23cp3cplvicknu8.R.inc(4436);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfIllegalFacetRestriction v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4437);
        __CLR4_5_23cp3cplvicknu8.R.inc(4438);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}

    @Override
    public O visit(@Nonnull UseOfNonAbsoluteIRI v) {try{__CLR4_5_23cp3cplvicknu8.R.inc(4439);
        __CLR4_5_23cp3cplvicknu8.R.inc(4440);return doDefault(v);
    }finally{__CLR4_5_23cp3cplvicknu8.R.flushNeeded();}}
}
