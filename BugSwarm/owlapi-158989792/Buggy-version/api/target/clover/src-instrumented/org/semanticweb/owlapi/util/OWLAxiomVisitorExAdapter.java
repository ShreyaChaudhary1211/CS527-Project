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

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
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
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLRule;

/**
 * adapter for axiom visitors
 * 
 * @author ignazio
 * @param <O>
 *        return type
 */
public class OWLAxiomVisitorExAdapter<O> extends
        OWLBaseVisitorExAdapter<O, OWLAxiom> implements OWLAxiomVisitorEx<O> {public static class __CLR4_5_27rp7rplvickqwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * adapter with object as default value
     * 
     * @param object
     *        default return value
     */
    public OWLAxiomVisitorExAdapter(@Nonnull O object) {
        super(object);__CLR4_5_27rp7rplvickqwf.R.inc(10070);try{__CLR4_5_27rp7rplvickqwf.R.inc(10069);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10071);
        __CLR4_5_27rp7rplvickqwf.R.inc(10072);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10073);
        __CLR4_5_27rp7rplvickqwf.R.inc(10074);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10075);
        __CLR4_5_27rp7rplvickqwf.R.inc(10076);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10077);
        __CLR4_5_27rp7rplvickqwf.R.inc(10078);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10079);
        __CLR4_5_27rp7rplvickqwf.R.inc(10080);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10081);
        __CLR4_5_27rp7rplvickqwf.R.inc(10082);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10083);
        __CLR4_5_27rp7rplvickqwf.R.inc(10084);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10085);
        __CLR4_5_27rp7rplvickqwf.R.inc(10086);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10087);
        __CLR4_5_27rp7rplvickqwf.R.inc(10088);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10089);
        __CLR4_5_27rp7rplvickqwf.R.inc(10090);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10091);
        __CLR4_5_27rp7rplvickqwf.R.inc(10092);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10093);
        __CLR4_5_27rp7rplvickqwf.R.inc(10094);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10095);
        __CLR4_5_27rp7rplvickqwf.R.inc(10096);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10097);
        __CLR4_5_27rp7rplvickqwf.R.inc(10098);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10099);
        __CLR4_5_27rp7rplvickqwf.R.inc(10100);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10101);
        __CLR4_5_27rp7rplvickqwf.R.inc(10102);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10103);
        __CLR4_5_27rp7rplvickqwf.R.inc(10104);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10105);
        __CLR4_5_27rp7rplvickqwf.R.inc(10106);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10107);
        __CLR4_5_27rp7rplvickqwf.R.inc(10108);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10109);
        __CLR4_5_27rp7rplvickqwf.R.inc(10110);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10111);
        __CLR4_5_27rp7rplvickqwf.R.inc(10112);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10113);
        __CLR4_5_27rp7rplvickqwf.R.inc(10114);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10115);
        __CLR4_5_27rp7rplvickqwf.R.inc(10116);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10117);
        __CLR4_5_27rp7rplvickqwf.R.inc(10118);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10119);
        __CLR4_5_27rp7rplvickqwf.R.inc(10120);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10121);
        __CLR4_5_27rp7rplvickqwf.R.inc(10122);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10123);
        __CLR4_5_27rp7rplvickqwf.R.inc(10124);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10125);
        __CLR4_5_27rp7rplvickqwf.R.inc(10126);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10127);
        __CLR4_5_27rp7rplvickqwf.R.inc(10128);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10129);
        __CLR4_5_27rp7rplvickqwf.R.inc(10130);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10131);
        __CLR4_5_27rp7rplvickqwf.R.inc(10132);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10133);
        __CLR4_5_27rp7rplvickqwf.R.inc(10134);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10135);
        __CLR4_5_27rp7rplvickqwf.R.inc(10136);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10137);
        __CLR4_5_27rp7rplvickqwf.R.inc(10138);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10139);
        __CLR4_5_27rp7rplvickqwf.R.inc(10140);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10141);
        __CLR4_5_27rp7rplvickqwf.R.inc(10142);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10143);
        __CLR4_5_27rp7rplvickqwf.R.inc(10144);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10145);
        __CLR4_5_27rp7rplvickqwf.R.inc(10146);return doDefault(axiom);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}

    @Override
    public O visit(SWRLRule rule) {try{__CLR4_5_27rp7rplvickqwf.R.inc(10147);
        __CLR4_5_27rp7rplvickqwf.R.inc(10148);return doDefault(rule);
    }finally{__CLR4_5_27rp7rplvickqwf.R.flushNeeded();}}
}
