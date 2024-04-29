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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.HashSet;

import org.junit.Test;

/**
 * Test the Triple class.
 */
public class TripleTest {static class __CLR4_5_2194z194zlvha7izj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testTripleOf() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pm0a6194z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testTripleOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pm0a6194z() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58499);
        __CLR4_5_2194z194zlvha7izj.R.inc(58500);final Triple<Integer, String, Boolean> triple = Triple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_2194z194zlvha7izj.R.inc(58501);assertTrue(triple instanceof ImmutableTriple<?, ?, ?>);
        __CLR4_5_2194z194zlvha7izj.R.inc(58502);assertEquals(0, ((ImmutableTriple<Integer, String, Boolean>) triple).left.intValue());
        __CLR4_5_2194z194zlvha7izj.R.inc(58503);assertEquals("foo", ((ImmutableTriple<Integer, String, Boolean>) triple).middle);
        __CLR4_5_2194z194zlvha7izj.R.inc(58504);assertEquals(Boolean.TRUE, ((ImmutableTriple<Integer, String, Boolean>) triple).right);
        __CLR4_5_2194z194zlvha7izj.R.inc(58505);final Triple<Object, String, Long> triple2 = Triple.of(null, "bar", Long.valueOf(200L));
        __CLR4_5_2194z194zlvha7izj.R.inc(58506);assertTrue(triple2 instanceof ImmutableTriple<?, ?, ?>);
        __CLR4_5_2194z194zlvha7izj.R.inc(58507);assertNull(((ImmutableTriple<Object, String, Long>) triple2).left);
        __CLR4_5_2194z194zlvha7izj.R.inc(58508);assertEquals("bar", ((ImmutableTriple<Object, String, Long>) triple2).middle);
        __CLR4_5_2194z194zlvha7izj.R.inc(58509);assertEquals(new Long(200L), ((ImmutableTriple<Object, String, Long>) triple2).right);
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testCompatibilityBetweenTriples() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28408c2195a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testCompatibilityBetweenTriples",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28408c2195a() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58510);
        __CLR4_5_2194z194zlvha7izj.R.inc(58511);final Triple<Integer, String, Boolean> triple = ImmutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_2194z194zlvha7izj.R.inc(58512);final Triple<Integer, String, Boolean> triple2 = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_5_2194z194zlvha7izj.R.inc(58513);assertEquals(triple, triple2);
        __CLR4_5_2194z194zlvha7izj.R.inc(58514);assertEquals(triple.hashCode(), triple2.hashCode());
        __CLR4_5_2194z194zlvha7izj.R.inc(58515);final HashSet<Triple<Integer, String, Boolean>> set = new HashSet<>();
        __CLR4_5_2194z194zlvha7izj.R.inc(58516);set.add(triple);
        __CLR4_5_2194z194zlvha7izj.R.inc(58517);assertTrue(set.contains(triple2));
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testComparable1() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m96w1g195i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m96w1g195i() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58518);
        __CLR4_5_2194z194zlvha7izj.R.inc(58519);final Triple<String, String, String> triple1 = Triple.of("A", "D", "A");
        __CLR4_5_2194z194zlvha7izj.R.inc(58520);final Triple<String, String, String> triple2 = Triple.of("B", "C", "A");
        __CLR4_5_2194z194zlvha7izj.R.inc(58521);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58522);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58523);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58524);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testComparable2() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j06x8z195p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j06x8z195p() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58525);
        __CLR4_5_2194z194zlvha7izj.R.inc(58526);final Triple<String, String, String> triple1 = Triple.of("A", "C", "B");
        __CLR4_5_2194z194zlvha7izj.R.inc(58527);final Triple<String, String, String> triple2 = Triple.of("A", "D", "B");
        __CLR4_5_2194z194zlvha7izj.R.inc(58528);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58529);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58530);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58531);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testComparable3() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fr6ygi195w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fr6ygi195w() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58532);
        __CLR4_5_2194z194zlvha7izj.R.inc(58533);final Triple<String, String, String> triple1 = Triple.of("A", "A", "D");
        __CLR4_5_2194z194zlvha7izj.R.inc(58534);final Triple<String, String, String> triple2 = Triple.of("A", "B", "C");
        __CLR4_5_2194z194zlvha7izj.R.inc(58535);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58536);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58537);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58538);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testComparable4() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ci6zo11963();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ci6zo11963() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58539);
        __CLR4_5_2194z194zlvha7izj.R.inc(58540);final Triple<String, String, String> triple1 = Triple.of("B", "A", "C");
        __CLR4_5_2194z194zlvha7izj.R.inc(58541);final Triple<String, String, String> triple2 = Triple.of("B", "A", "D");
        __CLR4_5_2194z194zlvha7izj.R.inc(58542);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58543);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58544);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_5_2194z194zlvha7izj.R.inc(58545);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid196a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid196a() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58546);
        __CLR4_5_2194z194zlvha7izj.R.inc(58547);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_5_2194z194zlvha7izj.R.inc(58548);assertEquals("(Key,Something,Value)", triple.toString());
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testToStringCustom() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qi0ine196d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testToStringCustom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qi0ine196d() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58549);
        __CLR4_5_2194z194zlvha7izj.R.inc(58550);final Calendar date = Calendar.getInstance();
        __CLR4_5_2194z194zlvha7izj.R.inc(58551);date.set(2011, Calendar.APRIL, 25);
        __CLR4_5_2194z194zlvha7izj.R.inc(58552);final Triple<String, String, Calendar> triple = Triple.of("DOB", "string", date);
        __CLR4_5_2194z194zlvha7izj.R.inc(58553);assertEquals("Test created on " + "04-25-2011", triple.toString("Test created on %3$tm-%3$td-%3$tY"));
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testFormattable_simple() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2js7hrn196i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testFormattable_simple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2js7hrn196i() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58554);
        __CLR4_5_2194z194zlvha7izj.R.inc(58555);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_5_2194z194zlvha7izj.R.inc(58556);assertEquals("(Key,Something,Value)", String.format("%1$s", triple));
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

    @Test
    public void testFormattable_padded() throws Exception {__CLR4_5_2194z194zlvha7izj.R.globalSliceStart(getClass().getName(),58557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgb1ld196l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194z194zlvha7izj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194z194zlvha7izj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testFormattable_padded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgb1ld196l() throws Exception{try{__CLR4_5_2194z194zlvha7izj.R.inc(58557);
        __CLR4_5_2194z194zlvha7izj.R.inc(58558);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_5_2194z194zlvha7izj.R.inc(58559);assertEquals("         (Key,Something,Value)", String.format("%1$30s", triple));
    }finally{__CLR4_5_2194z194zlvha7izj.R.flushNeeded();}}

}

