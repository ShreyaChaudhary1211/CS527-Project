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
package org.semanticweb.owlapi.api.test.axioms;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.util.NNF;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@SuppressWarnings("javadoc")
public class NNFTestCase extends TestBase {static class __CLR4_5_231e31elvico06x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,4077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPosOWLClass() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fx65wd31e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosOWLClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fx65wd31e(){try{__CLR4_5_231e31elvico06x.R.inc(3938);
        __CLR4_5_231e31elvico06x.R.inc(3939);OWLClass cls = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3940);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegOWLClass() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k0l44931h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegOWLClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k0l44931h(){try{__CLR4_5_231e31elvico06x.R.inc(3941);
        __CLR4_5_231e31elvico06x.R.inc(3942);OWLClassExpression cls = ObjectComplementOf(Class(iri("A")));
        __CLR4_5_231e31elvico06x.R.inc(3943);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosAllValuesFrom() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ehp0u31k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ehp0u31k(){try{__CLR4_5_231e31elvico06x.R.inc(3944);
        __CLR4_5_231e31elvico06x.R.inc(3945);OWLClassExpression cls = ObjectAllValuesFrom(ObjectProperty(iri("p")),
                Class(iri("A")));
        __CLR4_5_231e31elvico06x.R.inc(3946);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegAllValuesFrom() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ls46om31n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegAllValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ls46om31n(){try{__CLR4_5_231e31elvico06x.R.inc(3947);
        __CLR4_5_231e31elvico06x.R.inc(3948);OWLObjectProperty property = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3949);OWLClass filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3950);OWLObjectAllValuesFrom allValuesFrom = ObjectAllValuesFrom(property,
                filler);
        __CLR4_5_231e31elvico06x.R.inc(3951);OWLClassExpression cls = allValuesFrom.getObjectComplementOf();
        __CLR4_5_231e31elvico06x.R.inc(3952);OWLClassExpression nnf = ObjectSomeValuesFrom(property,
                filler.getObjectComplementOf());
        __CLR4_5_231e31elvico06x.R.inc(3953);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosSomeValuesFrom() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qo2fwp31u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qo2fwp31u(){try{__CLR4_5_231e31elvico06x.R.inc(3954);
        __CLR4_5_231e31elvico06x.R.inc(3955);OWLClassExpression cls = ObjectSomeValuesFrom(ObjectProperty(iri("p")),
                Class(iri("A")));
        __CLR4_5_231e31elvico06x.R.inc(3956);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegSomeValuesFrom() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q0o53931x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegSomeValuesFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q0o53931x(){try{__CLR4_5_231e31elvico06x.R.inc(3957);
        __CLR4_5_231e31elvico06x.R.inc(3958);OWLObjectProperty property = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3959);OWLClass filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3960);OWLObjectSomeValuesFrom someValuesFrom = ObjectSomeValuesFrom(property,
                filler);
        __CLR4_5_231e31elvico06x.R.inc(3961);OWLClassExpression cls = ObjectComplementOf(someValuesFrom);
        __CLR4_5_231e31elvico06x.R.inc(3962);OWLClassExpression nnf = ObjectAllValuesFrom(property,
                ObjectComplementOf(filler));
        __CLR4_5_231e31elvico06x.R.inc(3963);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosObjectIntersectionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wutu6g324();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosObjectIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wutu6g324(){try{__CLR4_5_231e31elvico06x.R.inc(3964);
        __CLR4_5_231e31elvico06x.R.inc(3965);OWLClassExpression cls = ObjectIntersectionOf(Class(iri("A")),
                Class(iri("B")), Class(iri("C")));
        __CLR4_5_231e31elvico06x.R.inc(3966);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegObjectIntersectionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmpyo4327();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegObjectIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmpyo4327(){try{__CLR4_5_231e31elvico06x.R.inc(3967);
        __CLR4_5_231e31elvico06x.R.inc(3968);OWLClassExpression cls = ObjectComplementOf(ObjectIntersectionOf(
                Class(iri("A")), Class(iri("B")), Class(iri("C"))));
        __CLR4_5_231e31elvico06x.R.inc(3969);OWLClassExpression nnf = ObjectUnionOf(
                ObjectComplementOf(Class(iri("A"))),
                ObjectComplementOf(Class(iri("B"))),
                ObjectComplementOf(Class(iri("C"))));
        __CLR4_5_231e31elvico06x.R.inc(3970);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosObjectUnionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29rl7f832b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29rl7f832b(){try{__CLR4_5_231e31elvico06x.R.inc(3971);
        __CLR4_5_231e31elvico06x.R.inc(3972);OWLClassExpression cls = ObjectUnionOf(Class(iri("A")),
                Class(iri("B")), Class(iri("C")));
        __CLR4_5_231e31elvico06x.R.inc(3973);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegObjectUnionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ff0oa832e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ff0oa832e(){try{__CLR4_5_231e31elvico06x.R.inc(3974);
        __CLR4_5_231e31elvico06x.R.inc(3975);OWLClassExpression cls = ObjectComplementOf(ObjectUnionOf(
                Class(iri("A")), Class(iri("B")), Class(iri("C"))));
        __CLR4_5_231e31elvico06x.R.inc(3976);OWLClassExpression nnf = ObjectIntersectionOf(
                ObjectComplementOf(Class(iri("A"))),
                ObjectComplementOf(Class(iri("B"))),
                ObjectComplementOf(Class(iri("C"))));
        __CLR4_5_231e31elvico06x.R.inc(3977);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosObjectMinCardinality() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26xd7to32i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosObjectMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26xd7to32i(){try{__CLR4_5_231e31elvico06x.R.inc(3978);
        __CLR4_5_231e31elvico06x.R.inc(3979);OWLObjectProperty prop = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3980);OWLClassExpression filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3981);OWLClassExpression cls = ObjectMinCardinality(3, prop, filler);
        __CLR4_5_231e31elvico06x.R.inc(3982);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegObjectMinCardinality() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d5h3c032n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegObjectMinCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d5h3c032n(){try{__CLR4_5_231e31elvico06x.R.inc(3983);
        __CLR4_5_231e31elvico06x.R.inc(3984);OWLObjectProperty prop = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3985);OWLClassExpression filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3986);OWLClassExpression cls = ObjectMinCardinality(3, prop, filler)
                .getObjectComplementOf();
        __CLR4_5_231e31elvico06x.R.inc(3987);OWLClassExpression nnf = ObjectMaxCardinality(2, prop, filler);
        __CLR4_5_231e31elvico06x.R.inc(3988);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testPosObjectMaxCardinality() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rehsdq32t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testPosObjectMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rehsdq32t(){try{__CLR4_5_231e31elvico06x.R.inc(3989);
        __CLR4_5_231e31elvico06x.R.inc(3990);OWLObjectProperty prop = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3991);OWLClassExpression filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3992);OWLClassExpression cls = ObjectMaxCardinality(3, prop, filler);
        __CLR4_5_231e31elvico06x.R.inc(3993);assertEquals(cls.getNNF(), cls);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNegObjectMaxCardinality() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),3994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xmlnw232y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNegObjectMaxCardinality",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xmlnw232y(){try{__CLR4_5_231e31elvico06x.R.inc(3994);
        __CLR4_5_231e31elvico06x.R.inc(3995);OWLObjectProperty prop = ObjectProperty(iri("p"));
        __CLR4_5_231e31elvico06x.R.inc(3996);OWLClassExpression filler = Class(iri("A"));
        __CLR4_5_231e31elvico06x.R.inc(3997);OWLClassExpression cls = ObjectMaxCardinality(3, prop, filler)
                .getObjectComplementOf();
        __CLR4_5_231e31elvico06x.R.inc(3998);OWLClassExpression nnf = ObjectMinCardinality(4, prop, filler);
        __CLR4_5_231e31elvico06x.R.inc(3999);assertEquals(cls.getNNF(), nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Nonnull
    private final OWLClass clsA = Class(IRI("A"));
    @Nonnull
    private final OWLClass clsB = Class(IRI("B"));
    @Nonnull
    private final OWLClass clsC = Class(IRI("C"));
    @Nonnull
    private final OWLClass clsD = Class(IRI("D"));
    @Nonnull
    private final OWLObjectProperty propP = ObjectProperty(IRI("p"));
    @Nonnull
    private final OWLNamedIndividual indA = NamedIndividual(IRI("a"));

    private OWLClassExpression getNNF(
            @Nonnull OWLClassExpression classExpression) {try{__CLR4_5_231e31elvico06x.R.inc(4000);
        __CLR4_5_231e31elvico06x.R.inc(4001);NNF nnf = new NNF(df);
        __CLR4_5_231e31elvico06x.R.inc(4002);return classExpression.accept(nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNamedClass() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21eydjs337();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNamedClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21eydjs337(){try{__CLR4_5_231e31elvico06x.R.inc(4003);
        __CLR4_5_231e31elvico06x.R.inc(4004);OWLClassExpression desc = clsA;
        __CLR4_5_231e31elvico06x.R.inc(4005);OWLClassExpression nnf = clsA;
        __CLR4_5_231e31elvico06x.R.inc(4006);OWLClassExpression comp = getNNF(desc);
        __CLR4_5_231e31elvico06x.R.inc(4007);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectIntersectionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nf9s5k33c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectIntersectionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nf9s5k33c(){try{__CLR4_5_231e31elvico06x.R.inc(4008);
        __CLR4_5_231e31elvico06x.R.inc(4009);OWLClassExpression desc = ObjectIntersectionOf(clsA, clsB);
        __CLR4_5_231e31elvico06x.R.inc(4010);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4011);OWLClassExpression nnf = ObjectUnionOf(ObjectComplementOf(clsA),
                ObjectComplementOf(clsB));
        __CLR4_5_231e31elvico06x.R.inc(4012);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4013);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectUnionOf() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j2am0s33i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectUnionOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j2am0s33i(){try{__CLR4_5_231e31elvico06x.R.inc(4014);
        __CLR4_5_231e31elvico06x.R.inc(4015);OWLClassExpression desc = ObjectUnionOf(clsA, clsB);
        __CLR4_5_231e31elvico06x.R.inc(4016);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4017);OWLClassExpression nnf = ObjectIntersectionOf(ObjectComplementOf(clsA),
                ObjectComplementOf(clsB));
        __CLR4_5_231e31elvico06x.R.inc(4018);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4019);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testDoubleNegation() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vvglr33o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testDoubleNegation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vvglr33o(){try{__CLR4_5_231e31elvico06x.R.inc(4020);
        __CLR4_5_231e31elvico06x.R.inc(4021);OWLClassExpression desc = ObjectComplementOf(clsA);
        __CLR4_5_231e31elvico06x.R.inc(4022);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4023);OWLClassExpression nnf = clsA;
        __CLR4_5_231e31elvico06x.R.inc(4024);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4025);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testTripleNegation() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqrhac33u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testTripleNegation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqrhac33u(){try{__CLR4_5_231e31elvico06x.R.inc(4026);
        __CLR4_5_231e31elvico06x.R.inc(4027);OWLClassExpression desc = ObjectComplementOf(ObjectComplementOf(clsA));
        __CLR4_5_231e31elvico06x.R.inc(4028);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4029);OWLClassExpression nnf = ObjectComplementOf(clsA);
        __CLR4_5_231e31elvico06x.R.inc(4030);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4031);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectSome() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkikdo340();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectSome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkikdo340(){try{__CLR4_5_231e31elvico06x.R.inc(4032);
        __CLR4_5_231e31elvico06x.R.inc(4033);OWLClassExpression desc = ObjectSomeValuesFrom(propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4034);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4035);OWLClassExpression nnf = ObjectAllValuesFrom(propP,
                ObjectComplementOf(clsA));
        __CLR4_5_231e31elvico06x.R.inc(4036);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4037);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectAll() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qwd41j346();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qwd41j346(){try{__CLR4_5_231e31elvico06x.R.inc(4038);
        __CLR4_5_231e31elvico06x.R.inc(4039);OWLClassExpression desc = ObjectAllValuesFrom(propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4040);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4041);OWLClassExpression nnf = ObjectSomeValuesFrom(propP,
                ObjectComplementOf(clsA));
        __CLR4_5_231e31elvico06x.R.inc(4042);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4043);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectHasValue() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2982qep34c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectHasValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2982qep34c(){try{__CLR4_5_231e31elvico06x.R.inc(4044);
        __CLR4_5_231e31elvico06x.R.inc(4045);OWLClassExpression desc = ObjectHasValue(propP, indA);
        __CLR4_5_231e31elvico06x.R.inc(4046);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4047);OWLClassExpression nnf = ObjectAllValuesFrom(propP,
                ObjectComplementOf(ObjectOneOf(indA)));
        __CLR4_5_231e31elvico06x.R.inc(4048);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4049);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectMin() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acbwe034i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acbwe034i(){try{__CLR4_5_231e31elvico06x.R.inc(4050);
        __CLR4_5_231e31elvico06x.R.inc(4051);OWLClassExpression desc = ObjectMinCardinality(3, propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4052);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4053);OWLClassExpression nnf = ObjectMaxCardinality(2, propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4054);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4055);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testObjectMax() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22hvaw634o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testObjectMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22hvaw634o(){try{__CLR4_5_231e31elvico06x.R.inc(4056);
        __CLR4_5_231e31elvico06x.R.inc(4057);OWLClassExpression desc = ObjectMaxCardinality(3, propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4058);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4059);OWLClassExpression nnf = ObjectMinCardinality(4, propP, clsA);
        __CLR4_5_231e31elvico06x.R.inc(4060);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4061);assertEquals(nnf, comp);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNestedA() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kwwf3z34u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNestedA",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kwwf3z34u(){try{__CLR4_5_231e31elvico06x.R.inc(4062);
        __CLR4_5_231e31elvico06x.R.inc(4063);OWLClassExpression fillerA = ObjectUnionOf(clsA, clsB);
        __CLR4_5_231e31elvico06x.R.inc(4064);OWLClassExpression opA = ObjectSomeValuesFrom(propP, fillerA);
        __CLR4_5_231e31elvico06x.R.inc(4065);OWLClassExpression opB = clsB;
        __CLR4_5_231e31elvico06x.R.inc(4066);OWLClassExpression desc = ObjectUnionOf(opA, opB);
        __CLR4_5_231e31elvico06x.R.inc(4067);OWLClassExpression nnf = ObjectIntersectionOf(
                ObjectComplementOf(clsB),
                ObjectAllValuesFrom(
                        propP,
                        ObjectIntersectionOf(ObjectComplementOf(clsA),
                                ObjectComplementOf(clsB))));
        __CLR4_5_231e31elvico06x.R.inc(4068);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4069);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4070);assertEquals(comp, nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}

    @Test
    public void testNestedB() {__CLR4_5_231e31elvico06x.R.globalSliceStart(getClass().getName(),4071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o5wdwg353();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_231e31elvico06x.R.rethrow($CLV_t2$);}finally{__CLR4_5_231e31elvico06x.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.axioms.NNFTestCase.testNestedB",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o5wdwg353(){try{__CLR4_5_231e31elvico06x.R.inc(4071);
        __CLR4_5_231e31elvico06x.R.inc(4072);OWLClassExpression desc = ObjectIntersectionOf(
                ObjectIntersectionOf(clsA, clsB),
                ObjectComplementOf(ObjectUnionOf(clsC, clsD)));
        __CLR4_5_231e31elvico06x.R.inc(4073);OWLClassExpression neg = ObjectComplementOf(desc);
        __CLR4_5_231e31elvico06x.R.inc(4074);OWLClassExpression nnf = ObjectUnionOf(
                ObjectUnionOf(ObjectComplementOf(clsA),
                        ObjectComplementOf(clsB)), ObjectUnionOf(clsC, clsD));
        __CLR4_5_231e31elvico06x.R.inc(4075);OWLClassExpression comp = getNNF(neg);
        __CLR4_5_231e31elvico06x.R.inc(4076);assertEquals(comp, nnf);
    }finally{__CLR4_5_231e31elvico06x.R.flushNeeded();}}
}
