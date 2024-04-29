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

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.search.EntitySearcher.*;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class PropertyCharacteristicsAccessorsTestCase extends TestBase {static class __CLR4_5_22b02b0lvicnzrm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testTransitive() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),2988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xb3r22b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testTransitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xb3r22b0(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(2988);
        __CLR4_5_22b02b0lvicnzrm.R.inc(2989);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(2990);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(2991);assertFalse(isTransitive(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(2992);OWLAxiom ax = TransitiveObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(2993);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(2994);assertTrue(isTransitive(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testSymmetric() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),2995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzhpxw2b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testSymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzhpxw2b7(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(2995);
        __CLR4_5_22b02b0lvicnzrm.R.inc(2996);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(2997);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(2998);assertFalse(isSymmetric(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(2999);OWLAxiom ax = SymmetricObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3000);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3001);assertTrue(isSymmetric(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testAsymmetric() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fyz4pd2be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testAsymmetric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fyz4pd2be(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3002);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3003);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3004);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3005);assertFalse(isAsymmetric(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3006);OWLAxiom ax = AsymmetricObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3007);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3008);assertTrue(isAsymmetric(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testReflexive() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3kc3l2bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testReflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3kc3l2bl(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3009);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3010);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3011);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3012);assertFalse(isReflexive(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3013);OWLAxiom ax = ReflexiveObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3014);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3015);assertTrue(isReflexive(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testIrreflexive() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j59mi02bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testIrreflexive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j59mi02bs(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3016);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3017);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3018);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3019);assertFalse(isIrreflexive(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3020);OWLAxiom ax = IrreflexiveObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3021);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3022);assertTrue(isIrreflexive(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testFunctional() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pczfto2bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pczfto2bz(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3023);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3024);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3025);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3026);assertFalse(isFunctional(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3027);OWLAxiom ax = FunctionalObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3028);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3029);assertTrue(isFunctional(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testInverseFunctional() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eh10y02c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testInverseFunctional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eh10y02c6(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3030);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3031);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3032);OWLObjectProperty prop = ObjectProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3033);assertFalse(isInverseFunctional(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3034);OWLAxiom ax = InverseFunctionalObjectProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3035);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3036);assertTrue(isInverseFunctional(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}

    @Test
    public void testFunctionalDataProperty() {__CLR4_5_22b02b0lvicnzrm.R.globalSliceStart(getClass().getName(),3037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4josb2cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22b02b0lvicnzrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_22b02b0lvicnzrm.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.PropertyCharacteristicsAccessorsTestCase.testFunctionalDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4josb2cd(){try{__CLR4_5_22b02b0lvicnzrm.R.inc(3037);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3038);OWLOntology ont = getOWLOntology("Ont");
        __CLR4_5_22b02b0lvicnzrm.R.inc(3039);OWLDataProperty prop = DataProperty(iri("prop"));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3040);assertFalse(isFunctional(prop, ont));
        __CLR4_5_22b02b0lvicnzrm.R.inc(3041);OWLAxiom ax = FunctionalDataProperty(prop);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3042);m.addAxiom(ont, ax);
        __CLR4_5_22b02b0lvicnzrm.R.inc(3043);assertTrue(isFunctional(prop, ont));
    }finally{__CLR4_5_22b02b0lvicnzrm.R.flushNeeded();}}
}
