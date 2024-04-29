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

package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Tests the methods in the {@link org.apache.commons.lang3.Range} class.
 * </p>
 */
@SuppressWarnings("boxing")
public class RangeTest {static class __CLR4_5_2pyepyelvha7g42{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,33835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Integer> intRange;
    private Range<Long> longRange;
    private Range<Float> floatRange;
    private Range<Double> doubleRange;

    @SuppressWarnings("cast") // intRange
    @Before
    public void setUp() {try{__CLR4_5_2pyepyelvha7g42.R.inc(33638);
        __CLR4_5_2pyepyelvha7g42.R.inc(33639);byteRange = Range.between((byte) 0, (byte) 5);
        __CLR4_5_2pyepyelvha7g42.R.inc(33640);byteRange2 = Range.between((byte) 0, (byte) 5);
        __CLR4_5_2pyepyelvha7g42.R.inc(33641);byteRange3 = Range.between((byte) 0, (byte) 10);

        __CLR4_5_2pyepyelvha7g42.R.inc(33642);intRange = Range.between(10, 20);
        __CLR4_5_2pyepyelvha7g42.R.inc(33643);longRange = Range.between(10L, 20L);
        __CLR4_5_2pyepyelvha7g42.R.inc(33644);floatRange = Range.between((float) 10, (float) 20);
        __CLR4_5_2pyepyelvha7g42.R.inc(33645);doubleRange = Range.between((double) 10, (double) 20);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void testComparableConstructors() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8bn90pym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testComparableConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8bn90pym(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33646);
        __CLR4_5_2pyepyelvha7g42.R.inc(33647);final Comparable c = new Comparable() {
            @Override
            public int compareTo(final Object other) {try{__CLR4_5_2pyepyelvha7g42.R.inc(33648);
                __CLR4_5_2pyepyelvha7g42.R.inc(33649);return 1;
            }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}
        };
        __CLR4_5_2pyepyelvha7g42.R.inc(33650);final Range r1 = Range.is(c);
        __CLR4_5_2pyepyelvha7g42.R.inc(33651);final Range r2 = Range.between(c, c);
        __CLR4_5_2pyepyelvha7g42.R.inc(33652);assertEquals(true, r1.isNaturalOrdering());
        __CLR4_5_2pyepyelvha7g42.R.inc(33653);assertEquals(true, r2.isNaturalOrdering());
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsWithCompare() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n8rcq2pyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsWithCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n8rcq2pyu(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33654);
        __CLR4_5_2pyepyelvha7g42.R.inc(33655);final Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(final Integer o1, final Integer o2) {try{__CLR4_5_2pyepyelvha7g42.R.inc(33656);
                __CLR4_5_2pyepyelvha7g42.R.inc(33657);return 0; // all integers are equal
            }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}
        };
        __CLR4_5_2pyepyelvha7g42.R.inc(33658);Range<Integer> ri = Range.is(10);
        __CLR4_5_2pyepyelvha7g42.R.inc(33659);assertFalse("should not contain null", ri.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33660);assertTrue("should contain 10", ri.contains(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33661);assertFalse("should not contain 11", ri.contains(11));
        __CLR4_5_2pyepyelvha7g42.R.inc(33662);ri = Range.is(10, c);
        __CLR4_5_2pyepyelvha7g42.R.inc(33663);assertFalse("should not contain null", ri.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33664);assertTrue("should contain 10", ri.contains(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33665);assertTrue("should contain 11", ri.contains(11));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testBetweenWithCompare() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v0tnjkpz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testBetweenWithCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v0tnjkpz6(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33666);
        __CLR4_5_2pyepyelvha7g42.R.inc(33667);final Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(final Integer o1, final Integer o2) {try{__CLR4_5_2pyepyelvha7g42.R.inc(33668);
                __CLR4_5_2pyepyelvha7g42.R.inc(33669);return 0; // all integers are equal
            }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}
        };
        __CLR4_5_2pyepyelvha7g42.R.inc(33670);final Comparator<String> lengthComp = new Comparator<String>() {
            @Override
            public int compare(final String str1, final String str2) {try{__CLR4_5_2pyepyelvha7g42.R.inc(33671);
                __CLR4_5_2pyepyelvha7g42.R.inc(33672);return str1.length() - str2.length();
            }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}
        };
        __CLR4_5_2pyepyelvha7g42.R.inc(33673);Range<Integer> rb = Range.between(-10, 20);
        __CLR4_5_2pyepyelvha7g42.R.inc(33674);assertFalse("should not contain null", rb.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33675);assertTrue("should contain 10", rb.contains(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33676);assertTrue("should contain -10", rb.contains(-10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33677);assertFalse("should not contain 21", rb.contains(21));
        __CLR4_5_2pyepyelvha7g42.R.inc(33678);assertFalse("should not contain -11", rb.contains(-11));
        __CLR4_5_2pyepyelvha7g42.R.inc(33679);rb = Range.between(-10, 20, c);
        __CLR4_5_2pyepyelvha7g42.R.inc(33680);assertFalse("should not contain null", rb.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33681);assertTrue("should contain 10", rb.contains(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33682);assertTrue("should contain -10", rb.contains(-10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33683);assertTrue("should contain 21", rb.contains(21));
        __CLR4_5_2pyepyelvha7g42.R.inc(33684);assertTrue("should contain -11", rb.contains(-11));
        __CLR4_5_2pyepyelvha7g42.R.inc(33685);Range<String> rbstr = Range.between("house", "i");
        __CLR4_5_2pyepyelvha7g42.R.inc(33686);assertFalse("should not contain null", rbstr.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33687);assertTrue("should contain house", rbstr.contains("house"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33688);assertTrue("should contain i", rbstr.contains("i"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33689);assertFalse("should not contain hose", rbstr.contains("hose"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33690);assertFalse("should not contain ice", rbstr.contains("ice"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33691);rbstr = Range.between("house", "i", lengthComp);
        __CLR4_5_2pyepyelvha7g42.R.inc(33692);assertFalse("should not contain null", rbstr.contains(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33693);assertTrue("should contain house", rbstr.contains("house"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33694);assertTrue("should contain i", rbstr.contains("i"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33695);assertFalse("should not contain houses", rbstr.contains("houses"));
        __CLR4_5_2pyepyelvha7g42.R.inc(33696);assertFalse("should not contain ''", rbstr.contains(""));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testRangeOfChars() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28c2c4iq01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testRangeOfChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28c2c4iq01(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33697);
        __CLR4_5_2pyepyelvha7g42.R.inc(33698);final Range<Character> chars = Range.between('a', 'z');
        __CLR4_5_2pyepyelvha7g42.R.inc(33699);assertTrue(chars.contains('b'));
        __CLR4_5_2pyepyelvha7g42.R.inc(33700);assertFalse(chars.contains('B'));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testEqualsObject() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ayw755q05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testEqualsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ayw755q05(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33701);
        __CLR4_5_2pyepyelvha7g42.R.inc(33702);assertEquals(byteRange, byteRange);
        __CLR4_5_2pyepyelvha7g42.R.inc(33703);assertEquals(byteRange, byteRange2);
        __CLR4_5_2pyepyelvha7g42.R.inc(33704);assertEquals(byteRange2, byteRange2);
        __CLR4_5_2pyepyelvha7g42.R.inc(33705);assertTrue(byteRange.equals(byteRange));
        __CLR4_5_2pyepyelvha7g42.R.inc(33706);assertTrue(byteRange2.equals(byteRange2));
        __CLR4_5_2pyepyelvha7g42.R.inc(33707);assertTrue(byteRange3.equals(byteRange3));
        __CLR4_5_2pyepyelvha7g42.R.inc(33708);assertFalse(byteRange2.equals(byteRange3));
        __CLR4_5_2pyepyelvha7g42.R.inc(33709);assertFalse(byteRange2.equals(null));
        __CLR4_5_2pyepyelvha7g42.R.inc(33710);assertFalse(byteRange2.equals("Ni!"));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8q0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8q0f(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33711);
        __CLR4_5_2pyepyelvha7g42.R.inc(33712);assertEquals(byteRange.hashCode(), byteRange2.hashCode());
        __CLR4_5_2pyepyelvha7g42.R.inc(33713);assertFalse(byteRange.hashCode() == byteRange3.hashCode());

        __CLR4_5_2pyepyelvha7g42.R.inc(33714);assertEquals(intRange.hashCode(), intRange.hashCode());
        __CLR4_5_2pyepyelvha7g42.R.inc(33715);assertTrue(intRange.hashCode() != 0);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidq0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidq0k(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33716);
        __CLR4_5_2pyepyelvha7g42.R.inc(33717);assertNotNull(byteRange.toString());

        __CLR4_5_2pyepyelvha7g42.R.inc(33718);final String str = intRange.toString();
        __CLR4_5_2pyepyelvha7g42.R.inc(33719);assertEquals("[10..20]", str);
        __CLR4_5_2pyepyelvha7g42.R.inc(33720);assertEquals("[-20..-10]", Range.between(-20, -10).toString());
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testToStringFormat() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xkhrh8q0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testToStringFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xkhrh8q0p(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33721);
        __CLR4_5_2pyepyelvha7g42.R.inc(33722);final String str = intRange.toString("From %1$s to %2$s");
        __CLR4_5_2pyepyelvha7g42.R.inc(33723);assertEquals("From 10 to 20", str);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testGetMinimum() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0bkz3q0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testGetMinimum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0bkz3q0s(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33724);
        __CLR4_5_2pyepyelvha7g42.R.inc(33725);assertEquals(10, (int) intRange.getMinimum());
        __CLR4_5_2pyepyelvha7g42.R.inc(33726);assertEquals(10L, (long) longRange.getMinimum());
        __CLR4_5_2pyepyelvha7g42.R.inc(33727);assertEquals(10f, floatRange.getMinimum(), 0.00001f);
        __CLR4_5_2pyepyelvha7g42.R.inc(33728);assertEquals(10d, doubleRange.getMinimum(), 0.00001d);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testGetMaximum() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e2ci71q0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testGetMaximum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e2ci71q0x(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33729);
        __CLR4_5_2pyepyelvha7g42.R.inc(33730);assertEquals(20, (int) intRange.getMaximum());
        __CLR4_5_2pyepyelvha7g42.R.inc(33731);assertEquals(20L, (long) longRange.getMaximum());
        __CLR4_5_2pyepyelvha7g42.R.inc(33732);assertEquals(20f, floatRange.getMaximum(), 0.00001f);
        __CLR4_5_2pyepyelvha7g42.R.inc(33733);assertEquals(20d, doubleRange.getMaximum(), 0.00001d);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testContains() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y9zhfsq12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testContains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y9zhfsq12(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33734);
        __CLR4_5_2pyepyelvha7g42.R.inc(33735);assertFalse(intRange.contains(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33736);assertFalse(intRange.contains(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33737);assertTrue(intRange.contains(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33738);assertTrue(intRange.contains(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33739);assertTrue(intRange.contains(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33740);assertFalse(intRange.contains(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsAfter() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ax1icnq19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsAfter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ax1icnq19(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33741);
        __CLR4_5_2pyepyelvha7g42.R.inc(33742);assertFalse(intRange.isAfter(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33743);assertTrue(intRange.isAfter(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33744);assertFalse(intRange.isAfter(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33745);assertFalse(intRange.isAfter(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33746);assertFalse(intRange.isAfter(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33747);assertFalse(intRange.isAfter(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsStartedBy() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25qeq2rq1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsStartedBy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25qeq2rq1g(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33748);
        __CLR4_5_2pyepyelvha7g42.R.inc(33749);assertFalse(intRange.isStartedBy(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33750);assertFalse(intRange.isStartedBy(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33751);assertTrue(intRange.isStartedBy(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33752);assertFalse(intRange.isStartedBy(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33753);assertFalse(intRange.isStartedBy(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33754);assertFalse(intRange.isStartedBy(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsEndedBy() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29nab8cq1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsEndedBy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29nab8cq1n(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33755);
        __CLR4_5_2pyepyelvha7g42.R.inc(33756);assertFalse(intRange.isEndedBy(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33757);assertFalse(intRange.isEndedBy(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33758);assertFalse(intRange.isEndedBy(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33759);assertFalse(intRange.isEndedBy(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33760);assertTrue(intRange.isEndedBy(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33761);assertFalse(intRange.isEndedBy(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsBefore() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rmvj2q1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsBefore",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rmvj2q1u(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33762);
        __CLR4_5_2pyepyelvha7g42.R.inc(33763);assertFalse(intRange.isBefore(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33764);assertFalse(intRange.isBefore(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33765);assertFalse(intRange.isBefore(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33766);assertFalse(intRange.isBefore(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33767);assertFalse(intRange.isBefore(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33768);assertTrue(intRange.isBefore(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testElementCompareTo() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqzq3hq21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testElementCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqzq3hq21(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33769);
        __CLR4_5_2pyepyelvha7g42.R.inc(33770);try {
            __CLR4_5_2pyepyelvha7g42.R.inc(33771);intRange.elementCompareTo(null);
            __CLR4_5_2pyepyelvha7g42.R.inc(33772);fail("NullPointerException should have been thrown");
        } catch (final NullPointerException npe) {
            // expected
        }

        __CLR4_5_2pyepyelvha7g42.R.inc(33773);assertEquals(-1, intRange.elementCompareTo(5));
        __CLR4_5_2pyepyelvha7g42.R.inc(33774);assertEquals(0, intRange.elementCompareTo(10));
        __CLR4_5_2pyepyelvha7g42.R.inc(33775);assertEquals(0, intRange.elementCompareTo(15));
        __CLR4_5_2pyepyelvha7g42.R.inc(33776);assertEquals(0, intRange.elementCompareTo(20));
        __CLR4_5_2pyepyelvha7g42.R.inc(33777);assertEquals(1, intRange.elementCompareTo(25));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testContainsRange() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d61e8dq2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testContainsRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d61e8dq2a(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33778);

        // null handling
        __CLR4_5_2pyepyelvha7g42.R.inc(33779);assertFalse(intRange.containsRange(null));

        // easy inside range
        __CLR4_5_2pyepyelvha7g42.R.inc(33780);assertTrue(intRange.containsRange(Range.between(12, 18)));

        // outside range on each side
        __CLR4_5_2pyepyelvha7g42.R.inc(33781);assertFalse(intRange.containsRange(Range.between(32, 45)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33782);assertFalse(intRange.containsRange(Range.between(2, 8)));

        // equals range
        __CLR4_5_2pyepyelvha7g42.R.inc(33783);assertTrue(intRange.containsRange(Range.between(10, 20)));

        // overlaps
        __CLR4_5_2pyepyelvha7g42.R.inc(33784);assertFalse(intRange.containsRange(Range.between(9, 14)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33785);assertFalse(intRange.containsRange(Range.between(16, 21)));

        // touches lower boundary
        __CLR4_5_2pyepyelvha7g42.R.inc(33786);assertTrue(intRange.containsRange(Range.between(10, 19)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33787);assertFalse(intRange.containsRange(Range.between(10, 21)));

        // touches upper boundary
        __CLR4_5_2pyepyelvha7g42.R.inc(33788);assertTrue(intRange.containsRange(Range.between(11, 20)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33789);assertFalse(intRange.containsRange(Range.between(9, 20)));

        // negative
        __CLR4_5_2pyepyelvha7g42.R.inc(33790);assertFalse(intRange.containsRange(Range.between(-11, -18)));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsAfterRange() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsoljwq2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsAfterRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsoljwq2n(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33791);
        __CLR4_5_2pyepyelvha7g42.R.inc(33792);assertFalse(intRange.isAfterRange(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33793);assertTrue(intRange.isAfterRange(Range.between(5, 9)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33794);assertFalse(intRange.isAfterRange(Range.between(5, 10)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33795);assertFalse(intRange.isAfterRange(Range.between(5, 20)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33796);assertFalse(intRange.isAfterRange(Range.between(5, 25)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33797);assertFalse(intRange.isAfterRange(Range.between(15, 25)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33798);assertFalse(intRange.isAfterRange(Range.between(21, 25)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33799);assertFalse(intRange.isAfterRange(Range.between(10, 20)));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsOverlappedBy() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tbz4n6q2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsOverlappedBy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tbz4n6q2w(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33800);

        // null handling
        __CLR4_5_2pyepyelvha7g42.R.inc(33801);assertFalse(intRange.isOverlappedBy(null));

        // easy inside range
        __CLR4_5_2pyepyelvha7g42.R.inc(33802);assertTrue(intRange.isOverlappedBy(Range.between(12, 18)));

        // outside range on each side
        __CLR4_5_2pyepyelvha7g42.R.inc(33803);assertFalse(intRange.isOverlappedBy(Range.between(32, 45)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33804);assertFalse(intRange.isOverlappedBy(Range.between(2, 8)));

        // equals range
        __CLR4_5_2pyepyelvha7g42.R.inc(33805);assertTrue(intRange.isOverlappedBy(Range.between(10, 20)));

        // overlaps
        __CLR4_5_2pyepyelvha7g42.R.inc(33806);assertTrue(intRange.isOverlappedBy(Range.between(9, 14)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33807);assertTrue(intRange.isOverlappedBy(Range.between(16, 21)));

        // touches lower boundary
        __CLR4_5_2pyepyelvha7g42.R.inc(33808);assertTrue(intRange.isOverlappedBy(Range.between(10, 19)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33809);assertTrue(intRange.isOverlappedBy(Range.between(10, 21)));

        // touches upper boundary
        __CLR4_5_2pyepyelvha7g42.R.inc(33810);assertTrue(intRange.isOverlappedBy(Range.between(11, 20)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33811);assertTrue(intRange.isOverlappedBy(Range.between(9, 20)));

        // negative
        __CLR4_5_2pyepyelvha7g42.R.inc(33812);assertFalse(intRange.isOverlappedBy(Range.between(-11, -18)));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIsBeforeRange() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ww54nq39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsBeforeRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ww54nq39(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33813);
        __CLR4_5_2pyepyelvha7g42.R.inc(33814);assertFalse(intRange.isBeforeRange(null));

        __CLR4_5_2pyepyelvha7g42.R.inc(33815);assertFalse(intRange.isBeforeRange(Range.between(5, 9)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33816);assertFalse(intRange.isBeforeRange(Range.between(5, 10)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33817);assertFalse(intRange.isBeforeRange(Range.between(5, 20)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33818);assertFalse(intRange.isBeforeRange(Range.between(5, 25)));
        __CLR4_5_2pyepyelvha7g42.R.inc(33819);assertFalse(intRange.isBeforeRange(Range.between(15, 25)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33820);assertTrue(intRange.isBeforeRange(Range.between(21, 25)));

        __CLR4_5_2pyepyelvha7g42.R.inc(33821);assertFalse(intRange.isBeforeRange(Range.between(10, 20)));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test
    public void testIntersectionWith() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qu8q88q3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qu8q88q3i(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33822);
        __CLR4_5_2pyepyelvha7g42.R.inc(33823);assertSame(intRange, intRange.intersectionWith(intRange));
        __CLR4_5_2pyepyelvha7g42.R.inc(33824);assertSame(byteRange, byteRange.intersectionWith(byteRange));
        __CLR4_5_2pyepyelvha7g42.R.inc(33825);assertSame(longRange, longRange.intersectionWith(longRange));
        __CLR4_5_2pyepyelvha7g42.R.inc(33826);assertSame(floatRange, floatRange.intersectionWith(floatRange));
        __CLR4_5_2pyepyelvha7g42.R.inc(33827);assertSame(doubleRange, doubleRange.intersectionWith(doubleRange));

        __CLR4_5_2pyepyelvha7g42.R.inc(33828);assertEquals(Range.between(10, 15), intRange.intersectionWith(Range.between(5, 15)));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIntersectionWithNull() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sqf7jlq3p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,116,101,114,115,101,99,116,105,111,110,87,105,116,104,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWithNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sqf7jlq3p(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33829);
        __CLR4_5_2pyepyelvha7g42.R.inc(33830);intRange.intersectionWith(null);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIntersectionWithNonOverlapping() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzzt4cq3r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,116,101,114,115,101,99,116,105,111,110,87,105,116,104,78,111,110,79,118,101,114,108,97,112,112,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWithNonOverlapping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzzt4cq3r(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33831);
        __CLR4_5_2pyepyelvha7g42.R.inc(33832);intRange.intersectionWith(Range.between(0, 9));
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSerializing() {__CLR4_5_2pyepyelvha7g42.R.globalSliceStart(getClass().getName(),33833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqv6umq3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pyepyelvha7g42.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pyepyelvha7g42.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testSerializing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqv6umq3t(){try{__CLR4_5_2pyepyelvha7g42.R.inc(33833);
        __CLR4_5_2pyepyelvha7g42.R.inc(33834);SerializationUtils.clone(intRange);
    }finally{__CLR4_5_2pyepyelvha7g42.R.flushNeeded();}}

}
