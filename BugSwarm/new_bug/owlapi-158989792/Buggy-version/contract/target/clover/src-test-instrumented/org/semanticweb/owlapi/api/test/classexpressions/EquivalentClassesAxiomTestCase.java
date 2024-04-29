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
package org.semanticweb.owlapi.api.test.classexpressions;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
@SuppressWarnings("javadoc")
public class EquivalentClassesAxiomTestCase extends TestBase {static class __CLR4_5_25lg5lglvico0lt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,7302,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testContainsNamedClass() {__CLR4_5_25lg5lglvico0lt.R.globalSliceStart(getClass().getName(),7252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2puwx4n5lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25lg5lglvico0lt.R.rethrow($CLV_t2$);}finally{__CLR4_5_25lg5lglvico0lt.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.classexpressions.EquivalentClassesAxiomTestCase.testContainsNamedClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2puwx4n5lg(){try{__CLR4_5_25lg5lglvico0lt.R.inc(7252);
        __CLR4_5_25lg5lglvico0lt.R.inc(7253);OWLClass clsA = Class(iri("A"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7254);OWLClass clsB = Class(iri("B"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7255);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7256);OWLClassExpression desc = ObjectSomeValuesFrom(propP, clsB);
        __CLR4_5_25lg5lglvico0lt.R.inc(7257);OWLClassExpression desc2 = ObjectSomeValuesFrom(propP, clsA);
        __CLR4_5_25lg5lglvico0lt.R.inc(7258);OWLEquivalentClassesAxiom ax = EquivalentClasses(clsA, desc);
        __CLR4_5_25lg5lglvico0lt.R.inc(7259);assertTrue(ax.containsNamedEquivalentClass());
        __CLR4_5_25lg5lglvico0lt.R.inc(7260);OWLEquivalentClassesAxiom ax2 = EquivalentClasses(desc, desc2);
        __CLR4_5_25lg5lglvico0lt.R.inc(7261);assertFalse(ax2.containsNamedEquivalentClass());
    }finally{__CLR4_5_25lg5lglvico0lt.R.flushNeeded();}}

    @Test
    public void testGetNamedClasses() {__CLR4_5_25lg5lglvico0lt.R.globalSliceStart(getClass().getName(),7262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gqnru05lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25lg5lglvico0lt.R.rethrow($CLV_t2$);}finally{__CLR4_5_25lg5lglvico0lt.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.classexpressions.EquivalentClassesAxiomTestCase.testGetNamedClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gqnru05lq(){try{__CLR4_5_25lg5lglvico0lt.R.inc(7262);
        __CLR4_5_25lg5lglvico0lt.R.inc(7263);OWLClass clsA = Class(iri("A"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7264);OWLClass clsB = Class(iri("B"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7265);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7266);OWLClassExpression desc = ObjectSomeValuesFrom(propP, clsB);
        __CLR4_5_25lg5lglvico0lt.R.inc(7267);OWLEquivalentClassesAxiom ax = EquivalentClasses(clsA, desc);
        __CLR4_5_25lg5lglvico0lt.R.inc(7268);Set<OWLClass> clses = ax.getNamedClasses();
        __CLR4_5_25lg5lglvico0lt.R.inc(7269);assertEquals(1, clses.size());
        __CLR4_5_25lg5lglvico0lt.R.inc(7270);assertTrue(clses.contains(clsA));
    }finally{__CLR4_5_25lg5lglvico0lt.R.flushNeeded();}}

    @Test
    public void testGetNamedClassesWithNothing() {__CLR4_5_25lg5lglvico0lt.R.globalSliceStart(getClass().getName(),7271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_257x3gd5lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25lg5lglvico0lt.R.rethrow($CLV_t2$);}finally{__CLR4_5_25lg5lglvico0lt.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.classexpressions.EquivalentClassesAxiomTestCase.testGetNamedClassesWithNothing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_257x3gd5lz(){try{__CLR4_5_25lg5lglvico0lt.R.inc(7271);
        __CLR4_5_25lg5lglvico0lt.R.inc(7272);OWLClass clsB = Class(iri("B"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7273);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7274);OWLClassExpression desc = ObjectSomeValuesFrom(propP, clsB);
        __CLR4_5_25lg5lglvico0lt.R.inc(7275);OWLEquivalentClassesAxiom ax = EquivalentClasses(OWLNothing(), desc);
        __CLR4_5_25lg5lglvico0lt.R.inc(7276);Set<OWLClass> clses = ax.getNamedClasses();
        __CLR4_5_25lg5lglvico0lt.R.inc(7277);assertTrue(clses.isEmpty());
        __CLR4_5_25lg5lglvico0lt.R.inc(7278);assertFalse(ax.containsOWLThing());
        __CLR4_5_25lg5lglvico0lt.R.inc(7279);assertTrue(ax.containsOWLNothing());
    }finally{__CLR4_5_25lg5lglvico0lt.R.flushNeeded();}}

    @Test
    public void testGetNamedClassesWithThing() {__CLR4_5_25lg5lglvico0lt.R.globalSliceStart(getClass().getName(),7280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gl2fb65m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25lg5lglvico0lt.R.rethrow($CLV_t2$);}finally{__CLR4_5_25lg5lglvico0lt.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.classexpressions.EquivalentClassesAxiomTestCase.testGetNamedClassesWithThing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gl2fb65m8(){try{__CLR4_5_25lg5lglvico0lt.R.inc(7280);
        __CLR4_5_25lg5lglvico0lt.R.inc(7281);OWLClass clsB = Class(iri("B"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7282);OWLObjectProperty propP = ObjectProperty(iri("p"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7283);OWLClassExpression desc = ObjectSomeValuesFrom(propP, clsB);
        __CLR4_5_25lg5lglvico0lt.R.inc(7284);OWLEquivalentClassesAxiom ax = EquivalentClasses(OWLThing(), desc);
        __CLR4_5_25lg5lglvico0lt.R.inc(7285);Set<OWLClass> clses = ax.getNamedClasses();
        __CLR4_5_25lg5lglvico0lt.R.inc(7286);assertTrue(clses.isEmpty());
        __CLR4_5_25lg5lglvico0lt.R.inc(7287);assertFalse(ax.containsOWLNothing());
        __CLR4_5_25lg5lglvico0lt.R.inc(7288);assertTrue(ax.containsOWLThing());
    }finally{__CLR4_5_25lg5lglvico0lt.R.flushNeeded();}}

    @Test
    public void testSplit() {__CLR4_5_25lg5lglvico0lt.R.globalSliceStart(getClass().getName(),7289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o34tg15mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25lg5lglvico0lt.R.rethrow($CLV_t2$);}finally{__CLR4_5_25lg5lglvico0lt.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.classexpressions.EquivalentClassesAxiomTestCase.testSplit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o34tg15mh(){try{__CLR4_5_25lg5lglvico0lt.R.inc(7289);
        __CLR4_5_25lg5lglvico0lt.R.inc(7290);OWLClass clsA = Class(iri("A"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7291);OWLClass clsB = Class(iri("B"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7292);OWLClass clsC = Class(iri("C"));
        __CLR4_5_25lg5lglvico0lt.R.inc(7293);OWLEquivalentClassesAxiom ax = EquivalentClasses(clsA, clsB, clsC);
        __CLR4_5_25lg5lglvico0lt.R.inc(7294);Set<OWLSubClassOfAxiom> scas = ax.asOWLSubClassOfAxioms();
        __CLR4_5_25lg5lglvico0lt.R.inc(7295);assertEquals(6, scas.size());
        __CLR4_5_25lg5lglvico0lt.R.inc(7296);assertTrue(scas.contains(SubClassOf(clsA, clsB)));
        __CLR4_5_25lg5lglvico0lt.R.inc(7297);assertTrue(scas.contains(SubClassOf(clsB, clsA)));
        __CLR4_5_25lg5lglvico0lt.R.inc(7298);assertTrue(scas.contains(SubClassOf(clsA, clsC)));
        __CLR4_5_25lg5lglvico0lt.R.inc(7299);assertTrue(scas.contains(SubClassOf(clsC, clsA)));
        __CLR4_5_25lg5lglvico0lt.R.inc(7300);assertTrue(scas.contains(SubClassOf(clsB, clsC)));
        __CLR4_5_25lg5lglvico0lt.R.inc(7301);assertTrue(scas.contains(SubClassOf(clsC, clsB)));
    }finally{__CLR4_5_25lg5lglvico0lt.R.flushNeeded();}}
}
