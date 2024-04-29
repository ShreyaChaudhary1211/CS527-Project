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
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.apache.commons.lang3.test.SystemDefaults;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Contains methods
 */
public class StringUtilsContainsTest  {static class __CLR4_5_2qj7qj7lvha7gbf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,34669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();

    /**
     * Supplementary character U+20000
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20000 = "\ud840\udc00";
    /**
     * Supplementary character U+20001
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20001 = "\ud840\udc01";
    /**
     * Incomplete supplementary character U+20000, high surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharHigh = "\udc00";

    /**
     * Incomplete supplementary character U+20000, low surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharLow = "\ud840";

    @Test
    public void testContains_Char() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8fyfpqj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContains_Char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8fyfpqj7(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34387);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34388);assertFalse(StringUtils.contains(null, ' '));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34389);assertFalse(StringUtils.contains("", ' '));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34390);assertFalse(StringUtils.contains("", null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34391);assertFalse(StringUtils.contains(null, null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34392);assertTrue(StringUtils.contains("abc", 'a'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34393);assertTrue(StringUtils.contains("abc", 'b'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34394);assertTrue(StringUtils.contains("abc", 'c'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34395);assertFalse(StringUtils.contains("abc", 'z'));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContains_String() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2z9vqqjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContains_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2z9vqqjg(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34396);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34397);assertFalse(StringUtils.contains(null, null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34398);assertFalse(StringUtils.contains(null, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34399);assertFalse(StringUtils.contains(null, "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34400);assertFalse(StringUtils.contains("", null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34401);assertTrue(StringUtils.contains("", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34402);assertFalse(StringUtils.contains("", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34403);assertTrue(StringUtils.contains("abc", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34404);assertTrue(StringUtils.contains("abc", "b"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34405);assertTrue(StringUtils.contains("abc", "c"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34406);assertTrue(StringUtils.contains("abc", "abc"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34407);assertFalse(StringUtils.contains("abc", "z"));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContains_StringWithBadSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmtephqjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContains_StringWithBadSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmtephqjs(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34408);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34409);assertFalse(StringUtils.contains(CharUSuppCharHigh, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34410);assertFalse(StringUtils.contains(CharUSuppCharLow, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34411);assertFalse(StringUtils.contains(CharU20001, CharUSuppCharHigh));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34412);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34413);assertTrue(StringUtils.contains(CharU20001, CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34414);assertTrue(StringUtils.contains(CharU20001 + CharUSuppCharLow + "a", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34415);assertTrue(StringUtils.contains(CharU20001 + CharUSuppCharHigh + "a", "a"));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContains_StringWithSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28k93s6qk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContains_StringWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28k93s6qk0(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34416);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34417);assertTrue(StringUtils.contains(CharU20000 + CharU20001, CharU20000));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34418);assertTrue(StringUtils.contains(CharU20000 + CharU20001, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34419);assertTrue(StringUtils.contains(CharU20000, CharU20000));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34420);assertFalse(StringUtils.contains(CharU20000, CharU20001));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsAny_StringCharArray() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykdcyzqk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykdcyzqk5(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34421);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34422);assertFalse(StringUtils.containsAny(null, (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34423);assertFalse(StringUtils.containsAny(null, new char[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34424);assertFalse(StringUtils.containsAny(null, 'a', 'b'));

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34425);assertFalse(StringUtils.containsAny("", (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34426);assertFalse(StringUtils.containsAny("", new char[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34427);assertFalse(StringUtils.containsAny("", 'a', 'b'));

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34428);assertFalse(StringUtils.containsAny("zzabyycdxx", (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34429);assertFalse(StringUtils.containsAny("zzabyycdxx", new char[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34430);assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'a'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34431);assertTrue(StringUtils.containsAny("zzabyycdxx", 'b', 'y'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34432);assertTrue(StringUtils.containsAny("zzabyycdxx", 'z', 'y'));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34433);assertFalse(StringUtils.containsAny("ab", 'z'));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringCharArrayWithBadSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z2h5tmqki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringCharArrayWithBadSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z2h5tmqki(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34434);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34435);assertFalse(StringUtils.containsAny(CharUSuppCharHigh, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34436);assertFalse(StringUtils.containsAny("abc" + CharUSuppCharHigh + "xyz", CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34437);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34438);assertFalse(StringUtils.containsAny(CharUSuppCharLow, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34439);assertFalse(StringUtils.containsAny(CharU20001, CharUSuppCharHigh.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34440);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34441);assertTrue(StringUtils.containsAny(CharU20001, CharUSuppCharLow.toCharArray()));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringCharArrayWithSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27cpffbqkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringCharArrayWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27cpffbqkq(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34442);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34443);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34444);assertTrue(StringUtils.containsAny("a" + CharU20000 + CharU20001, "a".toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34445);assertTrue(StringUtils.containsAny(CharU20000 + "a" + CharU20001, "a".toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34446);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001 + "a", "a".toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34447);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34448);assertTrue(StringUtils.containsAny(CharU20000, CharU20000.toCharArray()));
        // Sanity check:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34449);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34450);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34451);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34452);assertFalse(StringUtils.containsAny(CharU20000, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34453);assertFalse(StringUtils.containsAny(CharU20001, CharU20000.toCharArray()));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsAny_StringString() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i4ipo3ql2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i4ipo3ql2(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34454);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34455);assertFalse(StringUtils.containsAny(null, (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34456);assertFalse(StringUtils.containsAny(null, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34457);assertFalse(StringUtils.containsAny(null, "ab"));

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34458);assertFalse(StringUtils.containsAny("", (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34459);assertFalse(StringUtils.containsAny("", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34460);assertFalse(StringUtils.containsAny("", "ab"));

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34461);assertFalse(StringUtils.containsAny("zzabyycdxx", (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34462);assertFalse(StringUtils.containsAny("zzabyycdxx", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34463);assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34464);assertTrue(StringUtils.containsAny("zzabyycdxx", "by"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34465);assertTrue(StringUtils.containsAny("zzabyycdxx", "zy"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34466);assertFalse(StringUtils.containsAny("ab", "z"));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringWithBadSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kz2pz5qlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringWithBadSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kz2pz5qlf(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34467);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34468);assertFalse(StringUtils.containsAny(CharUSuppCharHigh, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34469);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34470);assertFalse(StringUtils.containsAny(CharUSuppCharLow, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34471);assertFalse(StringUtils.containsAny(CharU20001, CharUSuppCharHigh));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34472);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34473);assertTrue(StringUtils.containsAny(CharU20001, CharUSuppCharLow));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringWithSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_251cd4gqlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_251cd4gqlm(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34474);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34475);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20000));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34476);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34477);assertTrue(StringUtils.containsAny(CharU20000, CharU20000));
        // Sanity check:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34478);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34479);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34480);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34481);assertFalse(StringUtils.containsAny(CharU20000, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34482);assertFalse(StringUtils.containsAny(CharU20001, CharU20000));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}
    
    @Test
    public void testContainsAny_StringStringArray() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215c8uyqlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsAny_StringStringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215c8uyqlv(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34483);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34484);assertFalse(StringUtils.containsAny(null, (String[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34485);assertFalse(StringUtils.containsAny(null, new String[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34486);assertFalse(StringUtils.containsAny(null, new String[] { "hello" }));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34487);assertFalse(StringUtils.containsAny("", (String[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34488);assertFalse(StringUtils.containsAny("", new String[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34489);assertFalse(StringUtils.containsAny("", new String[] { "hello" }));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34490);assertFalse(StringUtils.containsAny("hello, goodbye", (String[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34491);assertFalse(StringUtils.containsAny("hello, goodbye", new String[0]));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34492);assertTrue(StringUtils.containsAny("hello, goodbye", new String[]{"hello", "goodbye"}));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34493);assertTrue(StringUtils.containsAny("hello, goodbye", new String[]{"hello", "Goodbye"}));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34494);assertFalse(StringUtils.containsAny("hello, goodbye", new String[]{"Hello", "Goodbye"}));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34495);assertFalse(StringUtils.containsAny("hello, goodbye", new String[]{"Hello", null}));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34496);assertFalse(StringUtils.containsAny("hello, null", new String[] { "Hello", null }));
        // Javadoc examples:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34497);assertTrue(StringUtils.containsAny("abcd", "ab", null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34498);assertTrue(StringUtils.containsAny("abcd", "ab", "cd"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34499);assertTrue(StringUtils.containsAny("abc", "d", "abc"));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @SystemDefaults(locale="de_DE")
    @Test
    public void testContainsIgnoreCase_LocaleIndependence() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o1z6p5qmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsIgnoreCase_LocaleIndependence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o1z6p5qmc(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34500);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34501);final Locale[] locales = { Locale.ENGLISH, new Locale("tr"), Locale.getDefault() };

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34502);final String[][] tdata = {
            { "i", "I" },
            { "I", "i" },
            { "\u03c2", "\u03c3" },
            { "\u03a3", "\u03c2" },
            { "\u03a3", "\u03c3" },
        };

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34503);final String[][] fdata = {
            { "\u00df", "SS" },
        };

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34504);for (final Locale testLocale : locales) {{
            __CLR4_5_2qj7qj7lvha7gbf.R.inc(34505);Locale.setDefault(testLocale);
            __CLR4_5_2qj7qj7lvha7gbf.R.inc(34506);for (int j = 0; (((j < tdata.length)&&(__CLR4_5_2qj7qj7lvha7gbf.R.iget(34507)!=0|true))||(__CLR4_5_2qj7qj7lvha7gbf.R.iget(34508)==0&false)); j++) {{
                __CLR4_5_2qj7qj7lvha7gbf.R.inc(34509);assertTrue(Locale.getDefault() + ": " + j + " " + tdata[j][0] + " " + tdata[j][1], StringUtils
                        .containsIgnoreCase(tdata[j][0], tdata[j][1]));
            }
            }__CLR4_5_2qj7qj7lvha7gbf.R.inc(34510);for (int j = 0; (((j < fdata.length)&&(__CLR4_5_2qj7qj7lvha7gbf.R.iget(34511)!=0|true))||(__CLR4_5_2qj7qj7lvha7gbf.R.iget(34512)==0&false)); j++) {{
                __CLR4_5_2qj7qj7lvha7gbf.R.inc(34513);assertFalse(Locale.getDefault() + ": " + j + " " + fdata[j][0] + " " + fdata[j][1], StringUtils
                        .containsIgnoreCase(fdata[j][0], fdata[j][1]));
            }
        }}
    }}finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsIgnoreCase_StringString() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7d42zqmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsIgnoreCase_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7d42zqmq(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34514);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34515);assertFalse(StringUtils.containsIgnoreCase(null, null));

        // Null tests
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34516);assertFalse(StringUtils.containsIgnoreCase(null, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34517);assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34518);assertFalse(StringUtils.containsIgnoreCase(null, "abc"));

        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34519);assertFalse(StringUtils.containsIgnoreCase("", null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34520);assertFalse(StringUtils.containsIgnoreCase("a", null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34521);assertFalse(StringUtils.containsIgnoreCase("abc", null));

        // Match len = 0
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34522);assertTrue(StringUtils.containsIgnoreCase("", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34523);assertTrue(StringUtils.containsIgnoreCase("a", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34524);assertTrue(StringUtils.containsIgnoreCase("abc", ""));

        // Match len = 1
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34525);assertFalse(StringUtils.containsIgnoreCase("", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34526);assertTrue(StringUtils.containsIgnoreCase("a", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34527);assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34528);assertFalse(StringUtils.containsIgnoreCase("", "A"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34529);assertTrue(StringUtils.containsIgnoreCase("a", "A"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34530);assertTrue(StringUtils.containsIgnoreCase("abc", "A"));

        // Match len > 1
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34531);assertFalse(StringUtils.containsIgnoreCase("", "abc"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34532);assertFalse(StringUtils.containsIgnoreCase("a", "abc"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34533);assertTrue(StringUtils.containsIgnoreCase("xabcz", "abc"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34534);assertFalse(StringUtils.containsIgnoreCase("", "ABC"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34535);assertFalse(StringUtils.containsIgnoreCase("a", "ABC"));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34536);assertTrue(StringUtils.containsIgnoreCase("xabcz", "ABC"));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsNone_CharArray() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yv1jboqnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_CharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yv1jboqnd(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34537);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34538);final String str1 = "a";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34539);final String str2 = "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34540);final String str3 = "ab.";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34541);final char[] chars1= {'b'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34542);final char[] chars2= {'.'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34543);final char[] chars3= {'c', 'd'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34544);final char[] emptyChars = new char[0];
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34545);assertTrue(StringUtils.containsNone(null, (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34546);assertTrue(StringUtils.containsNone("", (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34547);assertTrue(StringUtils.containsNone(null, emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34548);assertTrue(StringUtils.containsNone(str1, emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34549);assertTrue(StringUtils.containsNone("", emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34550);assertTrue(StringUtils.containsNone("", chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34551);assertTrue(StringUtils.containsNone(str1, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34552);assertTrue(StringUtils.containsNone(str1, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34553);assertTrue(StringUtils.containsNone(str1, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34554);assertFalse(StringUtils.containsNone(str2, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34555);assertTrue(StringUtils.containsNone(str2, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34556);assertTrue(StringUtils.containsNone(str2, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34557);assertFalse(StringUtils.containsNone(str3, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34558);assertFalse(StringUtils.containsNone(str3, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34559);assertTrue(StringUtils.containsNone(str3, chars3));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_CharArrayWithBadSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_265t42hqo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_CharArrayWithBadSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_265t42hqo0(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34560);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34561);assertTrue(StringUtils.containsNone(CharUSuppCharHigh, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34562);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34563);assertTrue(StringUtils.containsNone(CharUSuppCharLow, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34564);assertEquals(-1, CharU20001.indexOf(CharUSuppCharHigh));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34565);assertTrue(StringUtils.containsNone(CharU20001, CharUSuppCharHigh.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34566);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34567);assertFalse(StringUtils.containsNone(CharU20001, CharUSuppCharLow.toCharArray()));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_CharArrayWithSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fibckoqo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_CharArrayWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fibckoqo8(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34568);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34569);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34570);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34571);assertFalse(StringUtils.containsNone(CharU20000, CharU20000.toCharArray()));
        // Sanity check:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34572);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34573);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34574);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34575);assertTrue(StringUtils.containsNone(CharU20000, CharU20001.toCharArray()));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34576);assertTrue(StringUtils.containsNone(CharU20001, CharU20000.toCharArray()));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsNone_String() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sc59m6qoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sc59m6qoh(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34577);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34578);final String str1 = "a";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34579);final String str2 = "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34580);final String str3 = "ab.";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34581);final String chars1= "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34582);final String chars2= ".";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34583);final String chars3= "cd";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34584);assertTrue(StringUtils.containsNone(null, (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34585);assertTrue(StringUtils.containsNone("", (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34586);assertTrue(StringUtils.containsNone(null, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34587);assertTrue(StringUtils.containsNone(str1, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34588);assertTrue(StringUtils.containsNone("", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34589);assertTrue(StringUtils.containsNone("", chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34590);assertTrue(StringUtils.containsNone(str1, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34591);assertTrue(StringUtils.containsNone(str1, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34592);assertTrue(StringUtils.containsNone(str1, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34593);assertFalse(StringUtils.containsNone(str2, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34594);assertTrue(StringUtils.containsNone(str2, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34595);assertTrue(StringUtils.containsNone(str2, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34596);assertFalse(StringUtils.containsNone(str3, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34597);assertFalse(StringUtils.containsNone(str3, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34598);assertTrue(StringUtils.containsNone(str3, chars3));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_StringWithBadSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k11s3xqp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_StringWithBadSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k11s3xqp3(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34599);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34600);assertTrue(StringUtils.containsNone(CharUSuppCharHigh, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34601);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34602);assertTrue(StringUtils.containsNone(CharUSuppCharLow, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34603);assertEquals(-1, CharU20001.indexOf(CharUSuppCharHigh));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34604);assertTrue(StringUtils.containsNone(CharU20001, CharUSuppCharHigh));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34605);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34606);assertFalse(StringUtils.containsNone(CharU20001, CharUSuppCharLow));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_StringWithSupplementaryChars() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v23iv2qpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsNone_StringWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v23iv2qpb(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34607);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34608);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20000));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34609);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34610);assertFalse(StringUtils.containsNone(CharU20000, CharU20000));
        // Sanity check:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34611);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34612);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34613);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34614);assertTrue(StringUtils.containsNone(CharU20000, CharU20001));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34615);assertTrue(StringUtils.containsNone(CharU20001, CharU20000));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsOnly_CharArray() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j9yepkqpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsOnly_CharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j9yepkqpk(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34616);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34617);final String str1 = "a";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34618);final String str2 = "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34619);final String str3 = "ab";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34620);final char[] chars1= {'b'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34621);final char[] chars2= {'a'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34622);final char[] chars3= {'a', 'b'};
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34623);final char[] emptyChars = new char[0];
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34624);assertFalse(StringUtils.containsOnly(null, (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34625);assertFalse(StringUtils.containsOnly("", (char[]) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34626);assertFalse(StringUtils.containsOnly(null, emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34627);assertFalse(StringUtils.containsOnly(str1, emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34628);assertTrue(StringUtils.containsOnly("", emptyChars));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34629);assertTrue(StringUtils.containsOnly("", chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34630);assertFalse(StringUtils.containsOnly(str1, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34631);assertTrue(StringUtils.containsOnly(str1, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34632);assertTrue(StringUtils.containsOnly(str1, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34633);assertTrue(StringUtils.containsOnly(str2, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34634);assertFalse(StringUtils.containsOnly(str2, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34635);assertTrue(StringUtils.containsOnly(str2, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34636);assertFalse(StringUtils.containsOnly(str3, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34637);assertFalse(StringUtils.containsOnly(str3, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34638);assertTrue(StringUtils.containsOnly(str3, chars3));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsOnly_String() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xabr7qqq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsOnly_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xabr7qqq7(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34639);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34640);final String str1 = "a";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34641);final String str2 = "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34642);final String str3 = "ab";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34643);final String chars1= "b";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34644);final String chars2= "a";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34645);final String chars3= "ab";
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34646);assertFalse(StringUtils.containsOnly(null, (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34647);assertFalse(StringUtils.containsOnly("", (String) null));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34648);assertFalse(StringUtils.containsOnly(null, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34649);assertFalse(StringUtils.containsOnly(str1, ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34650);assertTrue(StringUtils.containsOnly("", ""));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34651);assertTrue(StringUtils.containsOnly("", chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34652);assertFalse(StringUtils.containsOnly(str1, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34653);assertTrue(StringUtils.containsOnly(str1, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34654);assertTrue(StringUtils.containsOnly(str1, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34655);assertTrue(StringUtils.containsOnly(str2, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34656);assertFalse(StringUtils.containsOnly(str2, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34657);assertTrue(StringUtils.containsOnly(str2, chars3));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34658);assertFalse(StringUtils.containsOnly(str3, chars1));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34659);assertFalse(StringUtils.containsOnly(str3, chars2));
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34660);assertTrue(StringUtils.containsOnly(str3, chars3));
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}

    @Test
    public void testContainsWhitespace() {__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceStart(getClass().getName(),34661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22tc791qqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qj7qj7lvha7gbf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qj7qj7lvha7gbf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsContainsTest.testContainsWhitespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22tc791qqt(){try{__CLR4_5_2qj7qj7lvha7gbf.R.inc(34661);
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34662);assertFalse( StringUtils.containsWhitespace("") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34663);assertTrue( StringUtils.containsWhitespace(" ") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34664);assertFalse( StringUtils.containsWhitespace("a") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34665);assertTrue( StringUtils.containsWhitespace("a ") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34666);assertTrue( StringUtils.containsWhitespace(" a") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34667);assertTrue( StringUtils.containsWhitespace("a\t") );
        __CLR4_5_2qj7qj7lvha7gbf.R.inc(34668);assertTrue( StringUtils.containsWhitespace("\n") );
    }finally{__CLR4_5_2qj7qj7lvha7gbf.R.flushNeeded();}}
}
