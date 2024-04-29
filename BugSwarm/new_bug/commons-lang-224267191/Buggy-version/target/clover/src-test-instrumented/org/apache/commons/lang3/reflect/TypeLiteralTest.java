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
package org.apache.commons.lang3.reflect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TypeLiteralTest {static class __CLR4_5_2131d131dlvha7i9p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,50607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() {__CLR4_5_2131d131dlvha7i9p.R.globalSliceStart(getClass().getName(),50593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h131d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131d131dlvha7i9p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131d131dlvha7i9p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeLiteralTest.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50593,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h131d(){try{__CLR4_5_2131d131dlvha7i9p.R.inc(50593);
        __CLR4_5_2131d131dlvha7i9p.R.inc(50594);assertTrue(TypeUtils.equals(String.class, new TypeLiteral<String>() {}.value));
        __CLR4_5_2131d131dlvha7i9p.R.inc(50595);assertTrue(TypeUtils.equals(TypeUtils.parameterize(List.class, String.class),
            new TypeLiteral<List<String>>() {}.value));
    }finally{__CLR4_5_2131d131dlvha7i9p.R.flushNeeded();}}

    @Test
    public void testTyped() {__CLR4_5_2131d131dlvha7i9p.R.globalSliceStart(getClass().getName(),50596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ekvcx131g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131d131dlvha7i9p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131d131dlvha7i9p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeLiteralTest.testTyped",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ekvcx131g(){try{__CLR4_5_2131d131dlvha7i9p.R.inc(50596);
        __CLR4_5_2131d131dlvha7i9p.R.inc(50597);final Typed<String> stringType = new TypeLiteral<String>() {};
        __CLR4_5_2131d131dlvha7i9p.R.inc(50598);assertTrue(TypeUtils.equals(String.class, stringType.getType()));
        __CLR4_5_2131d131dlvha7i9p.R.inc(50599);final Typed<List<String>> listOfStringType = new TypeLiteral<List<String>>() {};
        __CLR4_5_2131d131dlvha7i9p.R.inc(50600);assertTrue(TypeUtils.equals(TypeUtils.parameterize(List.class, String.class), listOfStringType.getType()));
    }finally{__CLR4_5_2131d131dlvha7i9p.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_2131d131dlvha7i9p.R.globalSliceStart(getClass().getName(),50601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608131l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131d131dlvha7i9p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131d131dlvha7i9p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeLiteralTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608131l(){try{__CLR4_5_2131d131dlvha7i9p.R.inc(50601);
        __CLR4_5_2131d131dlvha7i9p.R.inc(50602);assertEquals(new TypeLiteral<String>() {}, new TypeLiteral<String>() {});
        __CLR4_5_2131d131dlvha7i9p.R.inc(50603);assertEquals(new TypeLiteral<List<String>>() {}, new TypeLiteral<List<String>>() {});
        __CLR4_5_2131d131dlvha7i9p.R.inc(50604);assertNotEquals(new TypeLiteral<String>() {}, new TypeLiteral<List<String>>() {});
    }finally{__CLR4_5_2131d131dlvha7i9p.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    @Test(expected = NullPointerException.class)
    public void testRaw() {__CLR4_5_2131d131dlvha7i9p.R.globalSliceStart(getClass().getName(),50605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vv5v7n131p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,97,119,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131d131dlvha7i9p.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131d131dlvha7i9p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeLiteralTest.testRaw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vv5v7n131p(){try{__CLR4_5_2131d131dlvha7i9p.R.inc(50605);
        __CLR4_5_2131d131dlvha7i9p.R.inc(50606);new TypeLiteral() {};
    }finally{__CLR4_5_2131d131dlvha7i9p.R.flushNeeded();}}
}
