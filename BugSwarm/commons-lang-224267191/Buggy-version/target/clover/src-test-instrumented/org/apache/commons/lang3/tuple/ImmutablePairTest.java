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
 * Test the Pair class.
 */
public class ImmutablePairTest {static class __CLR4_5_218xu18xulvha7iyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h18xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h18xu() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58242);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58243);final ImmutablePair<Integer, String> pair = new ImmutablePair<>(0, "foo");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58244);assertEquals(0, pair.left.intValue());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58245);assertEquals(0, pair.getLeft().intValue());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58246);assertEquals("foo", pair.right);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58247);assertEquals("foo", pair.getRight());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58248);final ImmutablePair<Object, String> pair2 = new ImmutablePair<>(null, "bar");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58249);assertNull(pair2.left);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58250);assertNull(pair2.getLeft());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58251);assertEquals("bar", pair2.right);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58252);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}

    @Test
    public void testPairOf() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4t2ty18y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testPairOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4t2ty18y5() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58253);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58254);final ImmutablePair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58255);assertEquals(0, pair.left.intValue());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58256);assertEquals(0, pair.getLeft().intValue());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58257);assertEquals("foo", pair.right);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58258);assertEquals("foo", pair.getRight());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58259);final ImmutablePair<Object, String> pair2 = ImmutablePair.of(null, "bar");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58260);assertNull(pair2.left);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58261);assertNull(pair2.getLeft());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58262);assertEquals("bar", pair2.right);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58263);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60818yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60818yg() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58264);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58265);assertEquals(ImmutablePair.of(null, "foo"), ImmutablePair.of(null, "foo"));
        __CLR4_5_218xu18xulvha7iyl.R.inc(58266);assertFalse(ImmutablePair.of("foo", 0).equals(ImmutablePair.of("foo", null)));
        __CLR4_5_218xu18xulvha7iyl.R.inc(58267);assertFalse(ImmutablePair.of("foo", "bar").equals(ImmutablePair.of("xyz", "bar")));

        __CLR4_5_218xu18xulvha7iyl.R.inc(58268);final ImmutablePair<String, String> p = ImmutablePair.of("foo", "bar");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58269);assertTrue(p.equals(p));
        __CLR4_5_218xu18xulvha7iyl.R.inc(58270);assertFalse(p.equals(new Object()));
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv818yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv818yn() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58271);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58272);assertEquals(ImmutablePair.of(null, "foo").hashCode(), ImmutablePair.of(null, "foo").hashCode());
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid18yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid18yp() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58273);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58274);assertEquals("(null,null)", ImmutablePair.of(null, null).toString());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58275);assertEquals("(null,two)", ImmutablePair.of(null, "two").toString());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58276);assertEquals("(one,null)", ImmutablePair.of("one", null).toString());
        __CLR4_5_218xu18xulvha7iyl.R.inc(58277);assertEquals("(one,two)", ImmutablePair.of("one", "two").toString());
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_5_218xu18xulvha7iyl.R.globalSliceStart(getClass().getName(),58278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on918yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218xu18xulvha7iyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_218xu18xulvha7iyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on918yu() throws Exception{try{__CLR4_5_218xu18xulvha7iyl.R.inc(58278);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58279);final ImmutablePair<Integer, String> origPair = ImmutablePair.of(0, "foo");
        __CLR4_5_218xu18xulvha7iyl.R.inc(58280);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_218xu18xulvha7iyl.R.inc(58281);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58282);out.writeObject(origPair);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58283);final ImmutablePair<Integer, String> deserializedPair = (ImmutablePair<Integer, String>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_5_218xu18xulvha7iyl.R.inc(58284);assertEquals(origPair, deserializedPair);
        __CLR4_5_218xu18xulvha7iyl.R.inc(58285);assertEquals(origPair.hashCode(), deserializedPair.hashCode());
    }finally{__CLR4_5_218xu18xulvha7iyl.R.flushNeeded();}}
}
