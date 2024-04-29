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
 * Test the Triple class.
 */
public class ImmutableTripleTest {static class __CLR4_5_218z218z2lvha7iyr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58341,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h18z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h18z2() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58286);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58287);final ImmutableTriple<Integer, String, Boolean> triple = new ImmutableTriple<>(0, "foo", Boolean.TRUE);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58288);assertEquals(0, triple.left.intValue());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58289);assertEquals(0, triple.getLeft().intValue());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58290);assertEquals("foo", triple.middle);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58291);assertEquals("foo", triple.getMiddle());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58292);assertEquals(Boolean.TRUE, triple.right);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58293);assertEquals(Boolean.TRUE, triple.getRight());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58294);final ImmutableTriple<Object, String, Integer> triple2 = new ImmutableTriple<>(null, "bar", 42);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58295);assertNull(triple2.left);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58296);assertNull(triple2.getLeft());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58297);assertEquals("bar", triple2.middle);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58298);assertEquals("bar", triple2.getMiddle());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58299);assertEquals(new Integer(42), triple2.right);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58300);assertEquals(new Integer(42), triple2.getRight());
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}

    @Test
    public void testTripleOf() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pm0a618zh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testTripleOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pm0a618zh() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58301);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58302);final ImmutableTriple<Integer, String, Boolean> triple = ImmutableTriple.of(0, "foo", Boolean.FALSE);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58303);assertEquals(0, triple.left.intValue());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58304);assertEquals(0, triple.getLeft().intValue());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58305);assertEquals("foo", triple.middle);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58306);assertEquals("foo", triple.getMiddle());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58307);assertEquals(Boolean.FALSE, triple.right);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58308);assertEquals(Boolean.FALSE, triple.getRight());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58309);final ImmutableTriple<Object, String, Boolean> triple2 = ImmutableTriple.of(null, "bar", Boolean.TRUE);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58310);assertNull(triple2.left);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58311);assertNull(triple2.getLeft());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58312);assertEquals("bar", triple2.middle);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58313);assertEquals("bar", triple2.getMiddle());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58314);assertEquals(Boolean.TRUE, triple2.right);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58315);assertEquals(Boolean.TRUE, triple2.getRight());
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60818zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60818zw() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58316);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58317);assertEquals(ImmutableTriple.of(null, "foo", 42), ImmutableTriple.of(null, "foo", 42));
        __CLR4_5_218z218z2lvha7iyr.R.inc(58318);assertFalse(ImmutableTriple.of("foo", 0, Boolean.TRUE).equals(ImmutableTriple.of("foo", null, null)));
        __CLR4_5_218z218z2lvha7iyr.R.inc(58319);assertFalse(ImmutableTriple.of("foo", "bar", "baz").equals(ImmutableTriple.of("xyz", "bar", "blo")));

        __CLR4_5_218z218z2lvha7iyr.R.inc(58320);final ImmutableTriple<String, String, String> p = ImmutableTriple.of("foo", "bar", "baz");
        __CLR4_5_218z218z2lvha7iyr.R.inc(58321);assertTrue(p.equals(p));
        __CLR4_5_218z218z2lvha7iyr.R.inc(58322);assertFalse(p.equals(new Object()));
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv81903();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv81903() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58323);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58324);assertEquals(ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode(), ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode());
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1905();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1905() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58325);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58326);assertEquals("(null,null,null)", ImmutableTriple.of(null, null, null).toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58327);assertEquals("(null,two,null)", ImmutableTriple.of(null, "two", null).toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58328);assertEquals("(one,null,null)", ImmutableTriple.of("one", null, null).toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58329);assertEquals("(one,two,null)", ImmutableTriple.of("one", "two", null).toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58330);assertEquals("(null,two,three)", ImmutableTriple.of(null, "two", "three").toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58331);assertEquals("(one,null,three)", ImmutableTriple.of("one", null, "three").toString());
        __CLR4_5_218z218z2lvha7iyr.R.inc(58332);assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_5_218z218z2lvha7iyr.R.globalSliceStart(getClass().getName(),58333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on9190d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z218z2lvha7iyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z218z2lvha7iyr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58333,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on9190d() throws Exception{try{__CLR4_5_218z218z2lvha7iyr.R.inc(58333);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58334);final ImmutableTriple<Integer, String, Boolean> origTriple = ImmutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58335);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_218z218z2lvha7iyr.R.inc(58336);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58337);out.writeObject(origTriple);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58338);final ImmutableTriple<Integer, String, Boolean> deserializedTriple = (ImmutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_5_218z218z2lvha7iyr.R.inc(58339);assertEquals(origTriple, deserializedTriple);
        __CLR4_5_218z218z2lvha7iyr.R.inc(58340);assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }finally{__CLR4_5_218z218z2lvha7iyr.R.flushNeeded();}}
}

