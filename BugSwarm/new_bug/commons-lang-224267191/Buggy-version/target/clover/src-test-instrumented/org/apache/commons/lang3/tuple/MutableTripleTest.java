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
 * Test the MutableTriple class.
 */
public class MutableTripleTest {static class __CLR4_5_2191v191vlvha7iz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58444,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2uf7h191v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testBasic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2uf7h191v() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58387);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58388);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<>(0, "foo", Boolean.FALSE);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58389);assertEquals(0, triple.getLeft().intValue());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58390);assertEquals("foo", triple.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58391);assertEquals(Boolean.FALSE, triple.getRight());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58392);final MutableTriple<Object, String, String> triple2 = new MutableTriple<>(null, "bar", "hello");
        __CLR4_5_2191v191vlvha7iz4.R.inc(58393);assertNull(triple2.getLeft());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58394);assertEquals("bar", triple2.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58395);assertEquals("hello", triple2.getRight());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    public void testDefault() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwf06u1924();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testDefault",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwf06u1924() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58396);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58397);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<>();
        __CLR4_5_2191v191vlvha7iz4.R.inc(58398);assertNull(triple.getLeft());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58399);assertNull(triple.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58400);assertNull(triple.getRight());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}
    
    @Test
    public void testMutate() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qo56p1929();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testMutate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qo56p1929() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58401);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58402);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<>(0, "foo", Boolean.TRUE);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58403);triple.setLeft(42);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58404);triple.setMiddle("bar");
        __CLR4_5_2191v191vlvha7iz4.R.inc(58405);triple.setRight(Boolean.FALSE);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58406);assertEquals(42, triple.getLeft().intValue());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58407);assertEquals("bar", triple.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58408);assertEquals(Boolean.FALSE, triple.getRight());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    public void testTripleOf() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pm0a6192h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testTripleOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pm0a6192h() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58409);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58410);final MutableTriple<Integer, String, Boolean> triple = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58411);assertEquals(0, triple.getLeft().intValue());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58412);assertEquals("foo", triple.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58413);assertEquals(Boolean.TRUE, triple.getRight());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58414);final MutableTriple<Object, String, String> triple2 = MutableTriple.of(null, "bar", "hello");
        __CLR4_5_2191v191vlvha7iz4.R.inc(58415);assertNull(triple2.getLeft());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58416);assertEquals("bar", triple2.getMiddle());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58417);assertEquals("hello", triple2.getRight());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608192q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608192q() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58418);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58419);assertEquals(MutableTriple.of(null, "foo", "baz"), MutableTriple.of(null, "foo", "baz"));
        __CLR4_5_2191v191vlvha7iz4.R.inc(58420);assertFalse(MutableTriple.of("foo", 0, Boolean.TRUE).equals(MutableTriple.of("foo", null, Boolean.TRUE)));
        __CLR4_5_2191v191vlvha7iz4.R.inc(58421);assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("xyz", "bar", "baz")));
        __CLR4_5_2191v191vlvha7iz4.R.inc(58422);assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("foo", "bar", "blo")));

        __CLR4_5_2191v191vlvha7iz4.R.inc(58423);final MutableTriple<String, String, String> p = MutableTriple.of("foo", "bar", "baz");
        __CLR4_5_2191v191vlvha7iz4.R.inc(58424);assertTrue(p.equals(p));
        __CLR4_5_2191v191vlvha7iz4.R.inc(58425);assertFalse(p.equals(new Object()));
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8192y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8192y() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58426);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58427);assertEquals(MutableTriple.of(null, "foo", "baz").hashCode(), MutableTriple.of(null, "foo", "baz").hashCode());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid1930();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid1930() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58428);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58429);assertEquals("(null,null,null)", MutableTriple.of(null, null, null).toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58430);assertEquals("(null,two,null)", MutableTriple.of(null, "two", null).toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58431);assertEquals("(one,null,null)", MutableTriple.of("one", null, null).toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58432);assertEquals("(one,two,null)", MutableTriple.of("one", "two", null).toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58433);assertEquals("(null,two,three)", MutableTriple.of(null, "two", "three").toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58434);assertEquals("(one,null,three)", MutableTriple.of("one", null, "three").toString());
        __CLR4_5_2191v191vlvha7iz4.R.inc(58435);assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_5_2191v191vlvha7iz4.R.globalSliceStart(getClass().getName(),58436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on91938();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2191v191vlvha7iz4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2191v191vlvha7iz4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on91938() throws Exception{try{__CLR4_5_2191v191vlvha7iz4.R.inc(58436);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58437);final MutableTriple<Integer, String, Boolean> origTriple = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58438);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2191v191vlvha7iz4.R.inc(58439);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58440);out.writeObject(origTriple);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58441);final MutableTriple<Integer, String, Boolean> deserializedTriple = (MutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_5_2191v191vlvha7iz4.R.inc(58442);assertEquals(origTriple, deserializedTriple);
        __CLR4_5_2191v191vlvha7iz4.R.inc(58443);assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }finally{__CLR4_5_2191v191vlvha7iz4.R.flushNeeded();}}
}

