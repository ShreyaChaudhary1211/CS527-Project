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
package org.semanticweb.owlapi.api.test.ontology;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import uk.ac.manchester.cs.owl.owlapi.OWLDatatypeImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLLiteralImplBoolean;
import uk.ac.manchester.cs.owl.owlapi.OWLLiteralImplDouble;
import uk.ac.manchester.cs.owl.owlapi.OWLLiteralImplFloat;
import uk.ac.manchester.cs.owl.owlapi.OWLLiteralImplInteger;
import uk.ac.manchester.cs.owl.owlapi.OWLLiteralImplNoCompression;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
@SuppressWarnings("javadoc")
public class HashCodeTestCase {static class __CLR4_5_26q16q1lvico1bw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8753,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSetContainsInt() {__CLR4_5_26q16q1lvico1bw.R.globalSliceStart(getClass().getName(),8713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28bxypl6q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26q16q1lvico1bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_26q16q1lvico1bw.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.HashCodeTestCase.testSetContainsInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28bxypl6q1(){try{__CLR4_5_26q16q1lvico1bw.R.inc(8713);
        __CLR4_5_26q16q1lvico1bw.R.inc(8714);OWLDatatypeImpl datatype = new OWLDatatypeImpl(
                OWL2Datatype.XSD_INTEGER.getIRI());
        __CLR4_5_26q16q1lvico1bw.R.inc(8715);OWLLiteral litNoComp = new OWLLiteralImplNoCompression("3", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8716);OWLLiteral litNoComp2 = new OWLLiteralImplNoCompression("3", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8717);OWLLiteral litIntImpl = new OWLLiteralImplInteger(3, datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8718);assertEquals(litNoComp.getLiteral(), litIntImpl.getLiteral());
        __CLR4_5_26q16q1lvico1bw.R.inc(8719);Set<OWLLiteral> lncset = new HashSet<>();
        __CLR4_5_26q16q1lvico1bw.R.inc(8720);lncset.add(litNoComp);
        __CLR4_5_26q16q1lvico1bw.R.inc(8721);assertTrue(lncset.contains(litNoComp2));
        __CLR4_5_26q16q1lvico1bw.R.inc(8722);assertTrue(lncset.contains(litIntImpl));
    }finally{__CLR4_5_26q16q1lvico1bw.R.flushNeeded();}}

    @Test
    public void testSetContainsDouble() {__CLR4_5_26q16q1lvico1bw.R.globalSliceStart(getClass().getName(),8723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289xhll6qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26q16q1lvico1bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_26q16q1lvico1bw.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.HashCodeTestCase.testSetContainsDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289xhll6qb(){try{__CLR4_5_26q16q1lvico1bw.R.inc(8723);
        __CLR4_5_26q16q1lvico1bw.R.inc(8724);OWLDatatypeImpl datatype = new OWLDatatypeImpl(
                OWL2Datatype.XSD_DOUBLE.getIRI());
        __CLR4_5_26q16q1lvico1bw.R.inc(8725);OWLLiteral litNoComp = new OWLLiteralImplNoCompression("3.0", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8726);OWLLiteral litNoComp2 = new OWLLiteralImplNoCompression("3.0", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8727);OWLLiteral litIntImpl = new OWLLiteralImplDouble(3.0D, datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8728);assertEquals(litNoComp.getLiteral(), litIntImpl.getLiteral());
        __CLR4_5_26q16q1lvico1bw.R.inc(8729);Set<OWLLiteral> lncset = new HashSet<>();
        __CLR4_5_26q16q1lvico1bw.R.inc(8730);lncset.add(litNoComp);
        __CLR4_5_26q16q1lvico1bw.R.inc(8731);assertTrue(lncset.contains(litNoComp2));
        __CLR4_5_26q16q1lvico1bw.R.inc(8732);assertTrue(lncset.contains(litIntImpl));
    }finally{__CLR4_5_26q16q1lvico1bw.R.flushNeeded();}}

    @Test
    public void testSetContainsFloat() {__CLR4_5_26q16q1lvico1bw.R.globalSliceStart(getClass().getName(),8733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27717xo6ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26q16q1lvico1bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_26q16q1lvico1bw.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.HashCodeTestCase.testSetContainsFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27717xo6ql(){try{__CLR4_5_26q16q1lvico1bw.R.inc(8733);
        __CLR4_5_26q16q1lvico1bw.R.inc(8734);OWLDatatypeImpl datatype = new OWLDatatypeImpl(
                OWL2Datatype.XSD_FLOAT.getIRI());
        __CLR4_5_26q16q1lvico1bw.R.inc(8735);OWLLiteral litNoComp = new OWLLiteralImplNoCompression("3.0", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8736);OWLLiteral litNoComp2 = new OWLLiteralImplNoCompression("3.0", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8737);OWLLiteral litIntImpl = new OWLLiteralImplFloat(3.0F, datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8738);assertEquals(litNoComp.getLiteral(), litIntImpl.getLiteral());
        __CLR4_5_26q16q1lvico1bw.R.inc(8739);Set<OWLLiteral> lncset = new HashSet<>();
        __CLR4_5_26q16q1lvico1bw.R.inc(8740);lncset.add(litNoComp);
        __CLR4_5_26q16q1lvico1bw.R.inc(8741);assertTrue(lncset.contains(litNoComp2));
        __CLR4_5_26q16q1lvico1bw.R.inc(8742);assertTrue(lncset.contains(litIntImpl));
    }finally{__CLR4_5_26q16q1lvico1bw.R.flushNeeded();}}

    @Test
    public void testSetContainsBoolean() {__CLR4_5_26q16q1lvico1bw.R.globalSliceStart(getClass().getName(),8743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u9jts6qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26q16q1lvico1bw.R.rethrow($CLV_t2$);}finally{__CLR4_5_26q16q1lvico1bw.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.HashCodeTestCase.testSetContainsBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u9jts6qv(){try{__CLR4_5_26q16q1lvico1bw.R.inc(8743);
        __CLR4_5_26q16q1lvico1bw.R.inc(8744);OWLDatatypeImpl datatype = new OWLDatatypeImpl(
                OWL2Datatype.XSD_BOOLEAN.getIRI());
        __CLR4_5_26q16q1lvico1bw.R.inc(8745);OWLLiteral litNoComp = new OWLLiteralImplNoCompression("true", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8746);OWLLiteral litNoComp2 = new OWLLiteralImplNoCompression("true", null,
                datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8747);OWLLiteral litIntImpl = new OWLLiteralImplBoolean(true, datatype);
        __CLR4_5_26q16q1lvico1bw.R.inc(8748);assertEquals(litNoComp.getLiteral(), litIntImpl.getLiteral());
        __CLR4_5_26q16q1lvico1bw.R.inc(8749);Set<OWLLiteral> lncset = new HashSet<>();
        __CLR4_5_26q16q1lvico1bw.R.inc(8750);lncset.add(litNoComp);
        __CLR4_5_26q16q1lvico1bw.R.inc(8751);assertTrue(lncset.contains(litNoComp2));
        __CLR4_5_26q16q1lvico1bw.R.inc(8752);assertTrue(lncset.contains(litIntImpl));
    }finally{__CLR4_5_26q16q1lvico1bw.R.flushNeeded();}}
}
