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

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
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
import org.semanticweb.owlapi.model.OWLObject;
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
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLAxiomVisitorAdapter implements OWLAxiomVisitor {public static class __CLR4_5_27pi7pilvickqv0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * override to change default behaviour.
     * 
     * @param axiom
     *        visited axiom
     */
    protected void handleDefault(@SuppressWarnings("unused") OWLObject axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9990);}finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9991);
        __CLR4_5_27pi7pilvickqv0.R.inc(9992);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9993);
        __CLR4_5_27pi7pilvickqv0.R.inc(9994);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9995);
        __CLR4_5_27pi7pilvickqv0.R.inc(9996);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9997);
        __CLR4_5_27pi7pilvickqv0.R.inc(9998);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(9999);
        __CLR4_5_27pi7pilvickqv0.R.inc(10000);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10001);
        __CLR4_5_27pi7pilvickqv0.R.inc(10002);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10003);
        __CLR4_5_27pi7pilvickqv0.R.inc(10004);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10005);
        __CLR4_5_27pi7pilvickqv0.R.inc(10006);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10007);
        __CLR4_5_27pi7pilvickqv0.R.inc(10008);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10009);
        __CLR4_5_27pi7pilvickqv0.R.inc(10010);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10011);
        __CLR4_5_27pi7pilvickqv0.R.inc(10012);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10013);
        __CLR4_5_27pi7pilvickqv0.R.inc(10014);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10015);
        __CLR4_5_27pi7pilvickqv0.R.inc(10016);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10017);
        __CLR4_5_27pi7pilvickqv0.R.inc(10018);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10019);
        __CLR4_5_27pi7pilvickqv0.R.inc(10020);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10021);
        __CLR4_5_27pi7pilvickqv0.R.inc(10022);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10023);
        __CLR4_5_27pi7pilvickqv0.R.inc(10024);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10025);
        __CLR4_5_27pi7pilvickqv0.R.inc(10026);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10027);
        __CLR4_5_27pi7pilvickqv0.R.inc(10028);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10029);
        __CLR4_5_27pi7pilvickqv0.R.inc(10030);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10031);
        __CLR4_5_27pi7pilvickqv0.R.inc(10032);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10033);
        __CLR4_5_27pi7pilvickqv0.R.inc(10034);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10035);
        __CLR4_5_27pi7pilvickqv0.R.inc(10036);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10037);
        __CLR4_5_27pi7pilvickqv0.R.inc(10038);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10039);
        __CLR4_5_27pi7pilvickqv0.R.inc(10040);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10041);
        __CLR4_5_27pi7pilvickqv0.R.inc(10042);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10043);
        __CLR4_5_27pi7pilvickqv0.R.inc(10044);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10045);
        __CLR4_5_27pi7pilvickqv0.R.inc(10046);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10047);
        __CLR4_5_27pi7pilvickqv0.R.inc(10048);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10049);
        __CLR4_5_27pi7pilvickqv0.R.inc(10050);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10051);
        __CLR4_5_27pi7pilvickqv0.R.inc(10052);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10053);
        __CLR4_5_27pi7pilvickqv0.R.inc(10054);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10055);
        __CLR4_5_27pi7pilvickqv0.R.inc(10056);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10057);
        __CLR4_5_27pi7pilvickqv0.R.inc(10058);handleDefault(rule);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10059);
        __CLR4_5_27pi7pilvickqv0.R.inc(10060);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10061);
        __CLR4_5_27pi7pilvickqv0.R.inc(10062);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10063);
        __CLR4_5_27pi7pilvickqv0.R.inc(10064);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10065);
        __CLR4_5_27pi7pilvickqv0.R.inc(10066);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_27pi7pilvickqv0.R.inc(10067);
        __CLR4_5_27pi7pilvickqv0.R.inc(10068);handleDefault(axiom);
    }finally{__CLR4_5_27pi7pilvickqv0.R.flushNeeded();}}
}
