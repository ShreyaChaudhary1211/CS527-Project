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
package org.apache.commons.lang3.tuple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * Test the MutablePair class.
 */
public class MutablePairTest {static class __CLR4_5_2190l190llvha7iyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h190l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h190l() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58341);
        __CLR4_5_2190l190llvha7iyy.R.inc(58342);final MutablePair<Integer, String> pair = new MutablePair<>(0, "foo");
        __CLR4_5_2190l190llvha7iyy.R.inc(58343);assertEquals(0, pair.getLeft().intValue());
        __CLR4_5_2190l190llvha7iyy.R.inc(58344);assertEquals("foo", pair.getRight());
        __CLR4_5_2190l190llvha7iyy.R.inc(58345);final MutablePair<Object, String> pair2 = new MutablePair<>(null, "bar");
        __CLR4_5_2190l190llvha7iyy.R.inc(58346);assertNull(pair2.getLeft());
        __CLR4_5_2190l190llvha7iyy.R.inc(58347);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    public void testDefault() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwf06u190s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testDefault",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwf06u190s() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58348);
        __CLR4_5_2190l190llvha7iyy.R.inc(58349);final MutablePair<Integer, String> pair = new MutablePair<>();
        __CLR4_5_2190l190llvha7iyy.R.inc(58350);assertNull(pair.getLeft());
        __CLR4_5_2190l190llvha7iyy.R.inc(58351);assertNull(pair.getRight());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}
    
    @Test
    public void testMutate() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qo56p190w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testMutate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qo56p190w() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58352);
        __CLR4_5_2190l190llvha7iyy.R.inc(58353);final MutablePair<Integer, String> pair = new MutablePair<>(0, "foo");
        __CLR4_5_2190l190llvha7iyy.R.inc(58354);pair.setLeft(42);
        __CLR4_5_2190l190llvha7iyy.R.inc(58355);pair.setRight("bar");
        __CLR4_5_2190l190llvha7iyy.R.inc(58356);assertEquals(42, pair.getLeft().intValue());
        __CLR4_5_2190l190llvha7iyy.R.inc(58357);assertEquals("bar", pair.getRight());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    public void testPairOf() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4t2ty1912();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testPairOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4t2ty1912() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58358);
        __CLR4_5_2190l190llvha7iyy.R.inc(58359);final MutablePair<Integer, String> pair = MutablePair.of(0, "foo");
        __CLR4_5_2190l190llvha7iyy.R.inc(58360);assertEquals(0, pair.getLeft().intValue());
        __CLR4_5_2190l190llvha7iyy.R.inc(58361);assertEquals("foo", pair.getRight());
        __CLR4_5_2190l190llvha7iyy.R.inc(58362);final MutablePair<Object, String> pair2 = MutablePair.of(null, "bar");
        __CLR4_5_2190l190llvha7iyy.R.inc(58363);assertNull(pair2.getLeft());
        __CLR4_5_2190l190llvha7iyy.R.inc(58364);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e6081919();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e6081919() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58365);
        __CLR4_5_2190l190llvha7iyy.R.inc(58366);assertEquals(MutablePair.of(null, "foo"), MutablePair.of(null, "foo"));
        __CLR4_5_2190l190llvha7iyy.R.inc(58367);assertFalse(MutablePair.of("foo", 0).equals(MutablePair.of("foo", null)));
        __CLR4_5_2190l190llvha7iyy.R.inc(58368);assertFalse(MutablePair.of("foo", "bar").equals(MutablePair.of("xyz", "bar")));

        __CLR4_5_2190l190llvha7iyy.R.inc(58369);final MutablePair<String, String> p = MutablePair.of("foo", "bar");
        __CLR4_5_2190l190llvha7iyy.R.inc(58370);assertTrue(p.equals(p));
        __CLR4_5_2190l190llvha7iyy.R.inc(58371);assertFalse(p.equals(new Object()));
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8191g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8191g() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58372);
        __CLR4_5_2190l190llvha7iyy.R.inc(58373);assertEquals(MutablePair.of(null, "foo").hashCode(), MutablePair.of(null, "foo").hashCode());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid191i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid191i() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58374);
        __CLR4_5_2190l190llvha7iyy.R.inc(58375);assertEquals("(null,null)", MutablePair.of(null, null).toString());
        __CLR4_5_2190l190llvha7iyy.R.inc(58376);assertEquals("(null,two)", MutablePair.of(null, "two").toString());
        __CLR4_5_2190l190llvha7iyy.R.inc(58377);assertEquals("(one,null)", MutablePair.of("one", null).toString());
        __CLR4_5_2190l190llvha7iyy.R.inc(58378);assertEquals("(one,two)", MutablePair.of("one", "two").toString());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_5_2190l190llvha7iyy.R.globalSliceStart(getClass().getName(),58379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on9191n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2190l190llvha7iyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2190l190llvha7iyy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on9191n() throws Exception{try{__CLR4_5_2190l190llvha7iyy.R.inc(58379);
        __CLR4_5_2190l190llvha7iyy.R.inc(58380);final MutablePair<Integer, String> origPair = MutablePair.of(0, "foo");
        __CLR4_5_2190l190llvha7iyy.R.inc(58381);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2190l190llvha7iyy.R.inc(58382);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_5_2190l190llvha7iyy.R.inc(58383);out.writeObject(origPair);
        __CLR4_5_2190l190llvha7iyy.R.inc(58384);final MutablePair<Integer, String> deserializedPair = (MutablePair<Integer, String>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_5_2190l190llvha7iyy.R.inc(58385);assertEquals(origPair, deserializedPair);
        __CLR4_5_2190l190llvha7iyy.R.inc(58386);assertEquals(origPair.hashCode(), deserializedPair.hashCode());
    }finally{__CLR4_5_2190l190llvha7iyy.R.flushNeeded();}}
}
