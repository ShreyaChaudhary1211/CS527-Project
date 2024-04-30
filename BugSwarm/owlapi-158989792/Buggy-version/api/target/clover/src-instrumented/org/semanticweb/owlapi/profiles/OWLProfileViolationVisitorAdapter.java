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

/** @author ignazio */
public class OWLProfileViolationVisitorAdapter implements
        OWLProfileViolationVisitor {public static class __CLR4_5_23a43a4lvicknt9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * override this method in subclasses to change default behaviour
     * 
     * @param v
     *        violation
     */
    protected void doDefault(@SuppressWarnings("unused") OWLProfileViolation v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4252);}finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(IllegalPunning v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4253);
        __CLR4_5_23a43a4lvicknt9.R.inc(4254);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(CycleInDatatypeDefinition v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4255);
        __CLR4_5_23a43a4lvicknt9.R.inc(4256);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfBuiltInDatatypeInDatatypeDefinition v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4257);
        __CLR4_5_23a43a4lvicknt9.R.inc(4258);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(DatatypeIRIAlsoUsedAsClassIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4259);
        __CLR4_5_23a43a4lvicknt9.R.inc(4260);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4261);
        __CLR4_5_23a43a4lvicknt9.R.inc(4262);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInCardinalityRestriction v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4263);
        __CLR4_5_23a43a4lvicknt9.R.inc(4264);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInDisjointPropertiesAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4265);
        __CLR4_5_23a43a4lvicknt9.R.inc(4266);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInFunctionalPropertyAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4267);
        __CLR4_5_23a43a4lvicknt9.R.inc(4268);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(
            UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4269);
        __CLR4_5_23a43a4lvicknt9.R.inc(4270);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInIrreflexivePropertyAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4271);
        __CLR4_5_23a43a4lvicknt9.R.inc(4272);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSimplePropertyInObjectHasSelf v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4273);
        __CLR4_5_23a43a4lvicknt9.R.inc(4274);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfPropertyInChainCausesCycle v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4275);
        __CLR4_5_23a43a4lvicknt9.R.inc(4276);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForAnnotationPropertyIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4277);
        __CLR4_5_23a43a4lvicknt9.R.inc(4278);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForClassIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4279);
        __CLR4_5_23a43a4lvicknt9.R.inc(4280);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForDataPropertyIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4281);
        __CLR4_5_23a43a4lvicknt9.R.inc(4282);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForIndividualIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4283);
        __CLR4_5_23a43a4lvicknt9.R.inc(4284);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForObjectPropertyIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4285);
        __CLR4_5_23a43a4lvicknt9.R.inc(4286);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForOntologyIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4287);
        __CLR4_5_23a43a4lvicknt9.R.inc(4288);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfReservedVocabularyForVersionIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4289);
        __CLR4_5_23a43a4lvicknt9.R.inc(4290);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4291);
        __CLR4_5_23a43a4lvicknt9.R.inc(4292);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUndeclaredAnnotationProperty v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4293);
        __CLR4_5_23a43a4lvicknt9.R.inc(4294);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUndeclaredClass v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4295);
        __CLR4_5_23a43a4lvicknt9.R.inc(4296);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUndeclaredDataProperty v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4297);
        __CLR4_5_23a43a4lvicknt9.R.inc(4298);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUndeclaredDatatype v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4299);
        __CLR4_5_23a43a4lvicknt9.R.inc(4300);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUndeclaredObjectProperty v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4301);
        __CLR4_5_23a43a4lvicknt9.R.inc(4302);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(InsufficientPropertyExpressions v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4303);
        __CLR4_5_23a43a4lvicknt9.R.inc(4304);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(InsufficientIndividuals v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4305);
        __CLR4_5_23a43a4lvicknt9.R.inc(4306);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(InsufficientOperands v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4307);
        __CLR4_5_23a43a4lvicknt9.R.inc(4308);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(EmptyOneOfAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4309);
        __CLR4_5_23a43a4lvicknt9.R.inc(4310);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(LastPropertyInChainNotInImposedRange v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4311);
        __CLR4_5_23a43a4lvicknt9.R.inc(4312);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(OntologyIRINotAbsolute v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4313);
        __CLR4_5_23a43a4lvicknt9.R.inc(4314);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfDefinedDatatypeInDatatypeRestriction v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4315);
        __CLR4_5_23a43a4lvicknt9.R.inc(4316);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfIllegalClassExpression v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4317);
        __CLR4_5_23a43a4lvicknt9.R.inc(4318);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfIllegalDataRange v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4319);
        __CLR4_5_23a43a4lvicknt9.R.inc(4320);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfUnknownDatatype v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4321);
        __CLR4_5_23a43a4lvicknt9.R.inc(4322);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfObjectPropertyInverse v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4323);
        __CLR4_5_23a43a4lvicknt9.R.inc(4324);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSuperClassExpression v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4325);
        __CLR4_5_23a43a4lvicknt9.R.inc(4326);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonSubClassExpression v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4327);
        __CLR4_5_23a43a4lvicknt9.R.inc(4328);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonEquivalentClassExpression v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4329);
        __CLR4_5_23a43a4lvicknt9.R.inc(4330);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonAtomicClassExpression v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4331);
        __CLR4_5_23a43a4lvicknt9.R.inc(4332);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(LexicalNotInLexicalSpace v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4333);
        __CLR4_5_23a43a4lvicknt9.R.inc(4334);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(OntologyVersionIRINotAbsolute v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4335);
        __CLR4_5_23a43a4lvicknt9.R.inc(4336);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfAnonymousIndividual v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4337);
        __CLR4_5_23a43a4lvicknt9.R.inc(4338);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfIllegalAxiom v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4339);
        __CLR4_5_23a43a4lvicknt9.R.inc(4340);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfIllegalFacetRestriction v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4341);
        __CLR4_5_23a43a4lvicknt9.R.inc(4342);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}

    @Override
    public void visit(UseOfNonAbsoluteIRI v) {try{__CLR4_5_23a43a4lvicknt9.R.inc(4343);
        __CLR4_5_23a43a4lvicknt9.R.inc(4344);doDefault(v);
    }finally{__CLR4_5_23a43a4lvicknt9.R.flushNeeded();}}
}
