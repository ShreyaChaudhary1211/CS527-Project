/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.mutable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * JUnit tests.
 * 
 * @see MutableShort
 */
public class MutableObjectTest {static class __CLR4_5_211vf11vflvha7i53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,49128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211vf11vflvha7i53.R.globalSliceStart(getClass().getName(),49083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211vf11vflvha7i53.R.rethrow($CLV_t2$);}finally{__CLR4_5_211vf11vflvha7i53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11vf(){try{__CLR4_5_211vf11vflvha7i53.R.inc(49083);
        __CLR4_5_211vf11vflvha7i53.R.inc(49084);assertEquals(null, new MutableObject<String>().getValue());
        
        __CLR4_5_211vf11vflvha7i53.R.inc(49085);final Integer i = Integer.valueOf(6);
        __CLR4_5_211vf11vflvha7i53.R.inc(49086);assertSame(i, new MutableObject<>(i).getValue());
        __CLR4_5_211vf11vflvha7i53.R.inc(49087);assertSame("HI", new MutableObject<>("HI").getValue());
        __CLR4_5_211vf11vflvha7i53.R.inc(49088);assertSame(null, new MutableObject<>(null).getValue());
    }finally{__CLR4_5_211vf11vflvha7i53.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211vf11vflvha7i53.R.globalSliceStart(getClass().getName(),49089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211vf11vflvha7i53.R.rethrow($CLV_t2$);}finally{__CLR4_5_211vf11vflvha7i53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711vl(){try{__CLR4_5_211vf11vflvha7i53.R.inc(49089);
        __CLR4_5_211vf11vflvha7i53.R.inc(49090);final MutableObject<String> mutNum = new MutableObject<>();
        __CLR4_5_211vf11vflvha7i53.R.inc(49091);assertEquals(null, new MutableObject<>().getValue());
        
        __CLR4_5_211vf11vflvha7i53.R.inc(49092);mutNum.setValue("HELLO");
        __CLR4_5_211vf11vflvha7i53.R.inc(49093);assertSame("HELLO", mutNum.getValue());
        
        __CLR4_5_211vf11vflvha7i53.R.inc(49094);mutNum.setValue(null);
        __CLR4_5_211vf11vflvha7i53.R.inc(49095);assertSame(null, mutNum.getValue());
    }finally{__CLR4_5_211vf11vflvha7i53.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211vf11vflvha7i53.R.globalSliceStart(getClass().getName(),49096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211vf11vflvha7i53.R.rethrow($CLV_t2$);}finally{__CLR4_5_211vf11vflvha7i53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811vs(){try{__CLR4_5_211vf11vflvha7i53.R.inc(49096);
        __CLR4_5_211vf11vflvha7i53.R.inc(49097);final MutableObject<String> mutNumA = new MutableObject<>("ALPHA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49098);final MutableObject<String> mutNumB = new MutableObject<>("ALPHA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49099);final MutableObject<String> mutNumC = new MutableObject<>("BETA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49100);final MutableObject<String> mutNumD = new MutableObject<>(null);

        __CLR4_5_211vf11vflvha7i53.R.inc(49101);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211vf11vflvha7i53.R.inc(49102);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211vf11vflvha7i53.R.inc(49103);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211vf11vflvha7i53.R.inc(49104);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211vf11vflvha7i53.R.inc(49105);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211vf11vflvha7i53.R.inc(49106);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211vf11vflvha7i53.R.inc(49107);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211vf11vflvha7i53.R.inc(49108);assertFalse(mutNumA.equals(mutNumD));
        __CLR4_5_211vf11vflvha7i53.R.inc(49109);assertTrue(mutNumD.equals(mutNumD));
        
        __CLR4_5_211vf11vflvha7i53.R.inc(49110);assertFalse(mutNumA.equals(null));
        __CLR4_5_211vf11vflvha7i53.R.inc(49111);assertFalse(mutNumA.equals(new Object()));
        __CLR4_5_211vf11vflvha7i53.R.inc(49112);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211vf11vflvha7i53.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211vf11vflvha7i53.R.globalSliceStart(getClass().getName(),49113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211vf11vflvha7i53.R.rethrow($CLV_t2$);}finally{__CLR4_5_211vf11vflvha7i53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811w9(){try{__CLR4_5_211vf11vflvha7i53.R.inc(49113);
        __CLR4_5_211vf11vflvha7i53.R.inc(49114);final MutableObject<String> mutNumA = new MutableObject<>("ALPHA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49115);final MutableObject<String> mutNumB = new MutableObject<>("ALPHA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49116);final MutableObject<String> mutNumC = new MutableObject<>("BETA");
        __CLR4_5_211vf11vflvha7i53.R.inc(49117);final MutableObject<String> mutNumD = new MutableObject<>(null);

        __CLR4_5_211vf11vflvha7i53.R.inc(49118);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211vf11vflvha7i53.R.inc(49119);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211vf11vflvha7i53.R.inc(49120);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211vf11vflvha7i53.R.inc(49121);assertFalse(mutNumA.hashCode() == mutNumD.hashCode());
        __CLR4_5_211vf11vflvha7i53.R.inc(49122);assertTrue(mutNumA.hashCode() == "ALPHA".hashCode());
        __CLR4_5_211vf11vflvha7i53.R.inc(49123);assertEquals(0, mutNumD.hashCode());
    }finally{__CLR4_5_211vf11vflvha7i53.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211vf11vflvha7i53.R.globalSliceStart(getClass().getName(),49124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid11wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211vf11vflvha7i53.R.rethrow($CLV_t2$);}finally{__CLR4_5_211vf11vflvha7i53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid11wk(){try{__CLR4_5_211vf11vflvha7i53.R.inc(49124);
        __CLR4_5_211vf11vflvha7i53.R.inc(49125);assertEquals("HI", new MutableObject<>("HI").toString());
        __CLR4_5_211vf11vflvha7i53.R.inc(49126);assertEquals("10.0", new MutableObject<>(Double.valueOf(10)).toString());
        __CLR4_5_211vf11vflvha7i53.R.inc(49127);assertEquals("null", new MutableObject<>(null).toString());
    }finally{__CLR4_5_211vf11vflvha7i53.R.flushNeeded();}}

}
