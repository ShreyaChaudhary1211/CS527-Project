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

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * Test the Pair class.
 */
public class PairTest {static class __CLR4_5_2193g193glvha7iza{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPairOf() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4t2ty193g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testPairOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4t2ty193g() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58444);
        __CLR4_5_2193g193glvha7iza.R.inc(58445);final Pair<Integer, String> pair = Pair.of(0, "foo");
        __CLR4_5_2193g193glvha7iza.R.inc(58446);assertTrue(pair instanceof ImmutablePair<?, ?>);
        __CLR4_5_2193g193glvha7iza.R.inc(58447);assertEquals(0, ((ImmutablePair<Integer, String>) pair).left.intValue());
        __CLR4_5_2193g193glvha7iza.R.inc(58448);assertEquals("foo", ((ImmutablePair<Integer, String>) pair).right);
        __CLR4_5_2193g193glvha7iza.R.inc(58449);final Pair<Object, String> pair2 = Pair.of(null, "bar");
        __CLR4_5_2193g193glvha7iza.R.inc(58450);assertTrue(pair2 instanceof ImmutablePair<?, ?>);
        __CLR4_5_2193g193glvha7iza.R.inc(58451);assertNull(((ImmutablePair<Object, String>) pair2).left);
        __CLR4_5_2193g193glvha7iza.R.inc(58452);assertEquals("bar", ((ImmutablePair<Object, String>) pair2).right);
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testCompatibilityBetweenPairs() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i13rqu193p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testCompatibilityBetweenPairs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i13rqu193p() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58453);
        __CLR4_5_2193g193glvha7iza.R.inc(58454);final Pair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_5_2193g193glvha7iza.R.inc(58455);final Pair<Integer, String> pair2 = MutablePair.of(0, "foo");
        __CLR4_5_2193g193glvha7iza.R.inc(58456);assertEquals(pair, pair2);
        __CLR4_5_2193g193glvha7iza.R.inc(58457);assertEquals(pair.hashCode(), pair2.hashCode());
        __CLR4_5_2193g193glvha7iza.R.inc(58458);final HashSet<Pair<Integer, String>> set = new HashSet<>();
        __CLR4_5_2193g193glvha7iza.R.inc(58459);set.add(pair);
        __CLR4_5_2193g193glvha7iza.R.inc(58460);assertTrue(set.contains(pair2));

        __CLR4_5_2193g193glvha7iza.R.inc(58461);pair2.setValue("bar");
        __CLR4_5_2193g193glvha7iza.R.inc(58462);assertFalse(pair.equals(pair2));
        __CLR4_5_2193g193glvha7iza.R.inc(58463);assertFalse(pair.hashCode() == pair2.hashCode());
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testMapEntry() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vnlht1940();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testMapEntry",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vnlht1940() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58464);
        __CLR4_5_2193g193glvha7iza.R.inc(58465);final Pair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_5_2193g193glvha7iza.R.inc(58466);final HashMap<Integer, String> map = new HashMap<>();
        __CLR4_5_2193g193glvha7iza.R.inc(58467);map.put(0, "foo");
        __CLR4_5_2193g193glvha7iza.R.inc(58468);final Entry<Integer, String> entry = map.entrySet().iterator().next();
        __CLR4_5_2193g193glvha7iza.R.inc(58469);assertEquals(pair, entry);
        __CLR4_5_2193g193glvha7iza.R.inc(58470);assertEquals(pair.hashCode(), entry.hashCode());
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testComparable1() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m96w1g1947();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testComparable1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m96w1g1947() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58471);
        __CLR4_5_2193g193glvha7iza.R.inc(58472);final Pair<String, String> pair1 = Pair.of("A", "D");
        __CLR4_5_2193g193glvha7iza.R.inc(58473);final Pair<String, String> pair2 = Pair.of("B", "C");
        __CLR4_5_2193g193glvha7iza.R.inc(58474);assertTrue(pair1.compareTo(pair1) == 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58475);assertTrue(pair1.compareTo(pair2) < 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58476);assertTrue(pair2.compareTo(pair2) == 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58477);assertTrue(pair2.compareTo(pair1) > 0);
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testComparable2() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j06x8z194e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testComparable2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j06x8z194e() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58478);
        __CLR4_5_2193g193glvha7iza.R.inc(58479);final Pair<String, String> pair1 = Pair.of("A", "C");
        __CLR4_5_2193g193glvha7iza.R.inc(58480);final Pair<String, String> pair2 = Pair.of("A", "D");
        __CLR4_5_2193g193glvha7iza.R.inc(58481);assertTrue(pair1.compareTo(pair1) == 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58482);assertTrue(pair1.compareTo(pair2) < 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58483);assertTrue(pair2.compareTo(pair2) == 0);
        __CLR4_5_2193g193glvha7iza.R.inc(58484);assertTrue(pair2.compareTo(pair1) > 0);
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid194l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid194l() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58485);
        __CLR4_5_2193g193glvha7iza.R.inc(58486);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_5_2193g193glvha7iza.R.inc(58487);assertEquals("(Key,Value)", pair.toString());
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testToStringCustom() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qi0ine194o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testToStringCustom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qi0ine194o() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58488);
        __CLR4_5_2193g193glvha7iza.R.inc(58489);final Calendar date = Calendar.getInstance();
        __CLR4_5_2193g193glvha7iza.R.inc(58490);date.set(2011, Calendar.APRIL, 25);
        __CLR4_5_2193g193glvha7iza.R.inc(58491);final Pair<String, Calendar> pair = Pair.of("DOB", date);
        __CLR4_5_2193g193glvha7iza.R.inc(58492);assertEquals("Test created on " + "04-25-2011", pair.toString("Test created on %2$tm-%2$td-%2$tY"));
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testFormattable_simple() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2js7hrn194t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testFormattable_simple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2js7hrn194t() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58493);
        __CLR4_5_2193g193glvha7iza.R.inc(58494);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_5_2193g193glvha7iza.R.inc(58495);assertEquals("(Key,Value)", String.format("%1$s", pair));
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

    @Test
    public void testFormattable_padded() throws Exception {__CLR4_5_2193g193glvha7iza.R.globalSliceStart(getClass().getName(),58496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgb1ld194w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2193g193glvha7iza.R.rethrow($CLV_t2$);}finally{__CLR4_5_2193g193glvha7iza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testFormattable_padded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgb1ld194w() throws Exception{try{__CLR4_5_2193g193glvha7iza.R.inc(58496);
        __CLR4_5_2193g193glvha7iza.R.inc(58497);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_5_2193g193glvha7iza.R.inc(58498);assertEquals("         (Key,Value)", String.format("%1$20s", pair));
    }finally{__CLR4_5_2193g193glvha7iza.R.flushNeeded();}}

}
