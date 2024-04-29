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

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;

@SuppressWarnings({ "javadoc" })
@RunWith(Parameterized.class)
public class ManSyntaxTestCase extends TestBase {static class __CLR4_5_21y51y5lvicnzo5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2611,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private final OWLAxiom object;

    public ManSyntaxTestCase(OWLAxiom object) {try{__CLR4_5_21y51y5lvicnzo5.R.inc(2525);
        __CLR4_5_21y51y5lvicnzo5.R.inc(2526);this.object = object;
    }finally{__CLR4_5_21y51y5lvicnzo5.R.flushNeeded();}}

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {try{__CLR4_5_21y51y5lvicnzo5.R.inc(2527);
        __CLR4_5_21y51y5lvicnzo5.R.inc(2528);Collection<Object[]> toReturn = new ArrayList<>();
        __CLR4_5_21y51y5lvicnzo5.R.inc(2529);Builder b = new Builder();
        __CLR4_5_21y51y5lvicnzo5.R.inc(2530);toReturn.add(new Object[] {b.ann()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2531);toReturn.add(new Object[] {b.asymm()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2532);toReturn.add(new Object[] {b.annDom()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2533);toReturn.add(new Object[] {b.annRange()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2534);toReturn.add(new Object[] {b.ass()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2535);toReturn.add(new Object[] {b.assAnd()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2536);toReturn.add(new Object[] {b.assOr()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2537);toReturn.add(new Object[] {b.dRangeAnd()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2538);toReturn.add(new Object[] {b.dRangeOr()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2539);toReturn.add(new Object[] {b.assNot()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2540);toReturn.add(new Object[] {b.assNotAnon()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2541);toReturn.add(new Object[] {b.assSome()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2542);toReturn.add(new Object[] {b.assAll()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2543);toReturn.add(new Object[] {b.assHas()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2544);toReturn.add(new Object[] {b.assMin()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2545);toReturn.add(new Object[] {b.assMax()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2546);toReturn.add(new Object[] {b.assEq()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2547);toReturn.add(new Object[] {b.assHasSelf()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2548);toReturn.add(new Object[] {b.assOneOf()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2549);toReturn.add(new Object[] {b.assDSome()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2550);toReturn.add(new Object[] {b.assDAll()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2551);toReturn.add(new Object[] {b.assDHas()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2552);toReturn.add(new Object[] {b.assDMin()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2553);toReturn.add(new Object[] {b.assDMax()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2554);toReturn.add(new Object[] {b.assDEq()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2555);toReturn.add(new Object[] {b.dOneOf()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2556);toReturn.add(new Object[] {b.dNot()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2557);toReturn.add(new Object[] {b.dRangeRestrict()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2558);toReturn.add(new Object[] {b.assD()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2559);toReturn.add(new Object[] {b.assDPlain()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2560);toReturn.add(new Object[] {b.dDom()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2561);toReturn.add(new Object[] {b.dRange()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2562);toReturn.add(new Object[] {b.dDef()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2563);toReturn.add(new Object[] {b.decC()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2564);toReturn.add(new Object[] {b.decOp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2565);toReturn.add(new Object[] {b.decDp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2566);toReturn.add(new Object[] {b.decDt()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2567);toReturn.add(new Object[] {b.decAp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2568);toReturn.add(new Object[] {b.decI()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2569);toReturn.add(new Object[] {b.assDi()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2570);toReturn.add(new Object[] {b.dc()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2571);toReturn.add(new Object[] {b.dDp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2572);toReturn.add(new Object[] {b.dOp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2573);toReturn.add(new Object[] {b.du()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2574);toReturn.add(new Object[] {b.ec()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2575);toReturn.add(new Object[] {b.eDp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2576);toReturn.add(new Object[] {b.eOp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2577);toReturn.add(new Object[] {b.fdp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2578);toReturn.add(new Object[] {b.fop()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2579);toReturn.add(new Object[] {b.ifp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2580);toReturn.add(new Object[] {b.iop()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2581);toReturn.add(new Object[] {b.irr()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2582);toReturn.add(new Object[] {b.ndp()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2583);toReturn.add(new Object[] {b.nop()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2584);toReturn.add(new Object[] {b.opa()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2585);toReturn.add(new Object[] {b.opaInv()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2586);toReturn.add(new Object[] {b.opaInvj()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2587);toReturn.add(new Object[] {b.oDom()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2588);toReturn.add(new Object[] {b.oRange()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2589);toReturn.add(new Object[] {b.chain()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2590);toReturn.add(new Object[] {b.ref()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2591);toReturn.add(new Object[] {b.same()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2592);toReturn.add(new Object[] {b.subAnn()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2593);toReturn.add(new Object[] {b.subClass()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2594);toReturn.add(new Object[] {b.subData()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2595);toReturn.add(new Object[] {b.subObject()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2596);toReturn.add(new Object[] {b.rule()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2597);toReturn.add(new Object[] {b.symm()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2598);toReturn.add(new Object[] {b.trans()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2599);toReturn.add(new Object[] {b.hasKey()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2600);toReturn.add(new Object[] {b.bigRule()});
        __CLR4_5_21y51y5lvicnzo5.R.inc(2601);return toReturn;
    }finally{__CLR4_5_21y51y5lvicnzo5.R.flushNeeded();}}

    @Test
    public void testAssertion() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_21y51y5lvicnzo5.R.globalSliceStart(getClass().getName(),2602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hm6z3d20a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y51y5lvicnzo5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y51y5lvicnzo5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ManSyntaxTestCase.testAssertion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hm6z3d20a() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_21y51y5lvicnzo5.R.inc(2602);
        __CLR4_5_21y51y5lvicnzo5.R.inc(2603);OWLOntology o=setupManager().createOntology(IRI.create("urn:test:manchester"));
        __CLR4_5_21y51y5lvicnzo5.R.inc(2604);o.getOWLOntologyManager().addAxiom(o, object);
        __CLR4_5_21y51y5lvicnzo5.R.inc(2605);StringDocumentTarget s = saveOntology(o, new ManchesterSyntaxDocumentFormat());
        __CLR4_5_21y51y5lvicnzo5.R.inc(2606);if((((object instanceof OWLSubDataPropertyOfAxiom)&&(__CLR4_5_21y51y5lvicnzo5.R.iget(2607)!=0|true))||(__CLR4_5_21y51y5lvicnzo5.R.iget(2608)==0&false))) {{
        __CLR4_5_21y51y5lvicnzo5.R.inc(2609);System.out.println("ManSyntaxTestCase.testAssertion() "+saveOntology(o, new ManchesterSyntaxDocumentFormat()));
        }
        }__CLR4_5_21y51y5lvicnzo5.R.inc(2610);loadOntologyFromString(s);
    }finally{__CLR4_5_21y51y5lvicnzo5.R.flushNeeded();}}
}
