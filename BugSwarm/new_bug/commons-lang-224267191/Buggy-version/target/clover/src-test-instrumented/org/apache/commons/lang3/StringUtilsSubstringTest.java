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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 */
public class StringUtilsSubstringTest  {static class __CLR4_5_2rf0rf0lvha7gha{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,35741,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private static final String FOOBAR = "foobar";
    private static final String SENTENCE = "foo bar baz";

    //-----------------------------------------------------------------------

    @Test
    public void testSubstring_StringInt() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_233oobprf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstring_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_233oobprf0(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35532);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35533);assertEquals(null, StringUtils.substring(null, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35534);assertEquals("", StringUtils.substring("", 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35535);assertEquals("", StringUtils.substring("", 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35536);assertEquals("", StringUtils.substring(SENTENCE, 80));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35537);assertEquals(BAZ, StringUtils.substring(SENTENCE, 8));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35538);assertEquals(BAZ, StringUtils.substring(SENTENCE, -3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35539);assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35540);assertEquals("abc", StringUtils.substring("abc", -4));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35541);assertEquals("abc", StringUtils.substring("abc", -3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35542);assertEquals("bc", StringUtils.substring("abc", -2));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35543);assertEquals("c", StringUtils.substring("abc", -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35544);assertEquals("abc", StringUtils.substring("abc", 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35545);assertEquals("bc", StringUtils.substring("abc", 1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35546);assertEquals("c", StringUtils.substring("abc", 2));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35547);assertEquals("", StringUtils.substring("abc", 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35548);assertEquals("", StringUtils.substring("abc", 4));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    @Test
    public void testSubstring_StringIntInt() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ehgf3crfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstring_StringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ehgf3crfh(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35549);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35550);assertEquals(null, StringUtils.substring(null, 0, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35551);assertEquals(null, StringUtils.substring(null, 1, 2));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35552);assertEquals("", StringUtils.substring("", 0, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35553);assertEquals("", StringUtils.substring("", 1, 2));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35554);assertEquals("", StringUtils.substring("", -2, -1));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35555);assertEquals("", StringUtils.substring(SENTENCE, 8, 6));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35556);assertEquals(FOO, StringUtils.substring(SENTENCE, 0, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35557);assertEquals("o", StringUtils.substring(SENTENCE, -9, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35558);assertEquals(FOO, StringUtils.substring(SENTENCE, 0, -8));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35559);assertEquals("o", StringUtils.substring(SENTENCE, -9, -8));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35560);assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0, 80));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35561);assertEquals("", StringUtils.substring(SENTENCE, 2, 2));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35562);assertEquals("b",StringUtils.substring("abc", -2, -1));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
           
    @Test
    public void testLeft_String() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2myucirfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testLeft_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35563,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2myucirfv(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35563);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35564);assertSame(null, StringUtils.left(null, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35565);assertSame(null, StringUtils.left(null, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35566);assertSame(null, StringUtils.left(null, 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35567);assertEquals("", StringUtils.left("", -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35568);assertEquals("", StringUtils.left("", 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35569);assertEquals("", StringUtils.left("", 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35570);assertEquals("", StringUtils.left(FOOBAR, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35571);assertEquals("", StringUtils.left(FOOBAR, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35572);assertEquals(FOO, StringUtils.left(FOOBAR, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35573);assertSame(FOOBAR, StringUtils.left(FOOBAR, 80));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    @Test
    public void testRight_String() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uqxl3nrg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testRight_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uqxl3nrg6(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35574);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35575);assertSame(null, StringUtils.right(null, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35576);assertSame(null, StringUtils.right(null, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35577);assertSame(null, StringUtils.right(null, 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35578);assertEquals("", StringUtils.right("", -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35579);assertEquals("", StringUtils.right("", 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35580);assertEquals("", StringUtils.right("", 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35581);assertEquals("", StringUtils.right(FOOBAR, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35582);assertEquals("", StringUtils.right(FOOBAR, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35583);assertEquals(BAR, StringUtils.right(FOOBAR, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35584);assertSame(FOOBAR, StringUtils.right(FOOBAR, 80));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    @Test
    public void testMid_String() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24pur0hrgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testMid_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24pur0hrgh(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35585);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35586);assertSame(null, StringUtils.mid(null, -1, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35587);assertSame(null, StringUtils.mid(null, 0, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35588);assertSame(null, StringUtils.mid(null, 3, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35589);assertSame(null, StringUtils.mid(null, 3, 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35590);assertEquals("", StringUtils.mid("", 0, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35591);assertEquals("", StringUtils.mid("", 0, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35592);assertEquals("", StringUtils.mid("", 0, 2));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35593);assertEquals("", StringUtils.mid(FOOBAR, 3, -1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35594);assertEquals("", StringUtils.mid(FOOBAR, 3, 0));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35595);assertEquals("b", StringUtils.mid(FOOBAR, 3, 1));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35596);assertEquals(FOO, StringUtils.mid(FOOBAR, 0, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35597);assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35598);assertEquals(FOOBAR, StringUtils.mid(FOOBAR, 0, 80));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35599);assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 80));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35600);assertEquals("", StringUtils.mid(FOOBAR, 9, 3));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35601);assertEquals(FOO, StringUtils.mid(FOOBAR, -1, 3));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSubstringBefore_StringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j91muirgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBefore_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j91muirgy(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35602);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35603);assertEquals("foo", StringUtils.substringBefore("fooXXbarXXbaz", "XX"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35604);assertEquals(null, StringUtils.substringBefore(null, null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35605);assertEquals(null, StringUtils.substringBefore(null, ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35606);assertEquals(null, StringUtils.substringBefore(null, "XX"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35607);assertEquals("", StringUtils.substringBefore("", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35608);assertEquals("", StringUtils.substringBefore("", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35609);assertEquals("", StringUtils.substringBefore("", "XX"));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35610);assertEquals("foo", StringUtils.substringBefore("foo", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35611);assertEquals("foo", StringUtils.substringBefore("foo", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35612);assertEquals("f", StringUtils.substringBefore("foot", "o"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35613);assertEquals("", StringUtils.substringBefore("abc", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35614);assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35615);assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35616);assertEquals("", StringUtils.substringBefore("abc", ""));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    @Test
    public void testSubstringAfter_StringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2997q39rhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringAfter_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2997q39rhd(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35617);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35618);assertEquals("barXXbaz", StringUtils.substringAfter("fooXXbarXXbaz", "XX"));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35619);assertEquals(null, StringUtils.substringAfter(null, null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35620);assertEquals(null, StringUtils.substringAfter(null, ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35621);assertEquals(null, StringUtils.substringAfter(null, "XX"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35622);assertEquals("", StringUtils.substringAfter("", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35623);assertEquals("", StringUtils.substringAfter("", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35624);assertEquals("", StringUtils.substringAfter("", "XX"));
        
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35625);assertEquals("", StringUtils.substringAfter("foo", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35626);assertEquals("ot", StringUtils.substringAfter("foot", "o"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35627);assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35628);assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35629);assertEquals("", StringUtils.substringAfter("abc", "c"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35630);assertEquals("abc", StringUtils.substringAfter("abc", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35631);assertEquals("", StringUtils.substringAfter("abc", "d"));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}

    @Test
    public void testSubstringBeforeLast_StringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zhbo7grhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBeforeLast_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zhbo7grhs(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35632);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35633);assertEquals("fooXXbar", StringUtils.substringBeforeLast("fooXXbarXXbaz", "XX"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35634);assertEquals(null, StringUtils.substringBeforeLast(null, null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35635);assertEquals(null, StringUtils.substringBeforeLast(null, ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35636);assertEquals(null, StringUtils.substringBeforeLast(null, "XX"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35637);assertEquals("", StringUtils.substringBeforeLast("", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35638);assertEquals("", StringUtils.substringBeforeLast("", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35639);assertEquals("", StringUtils.substringBeforeLast("", "XX"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35640);assertEquals("foo", StringUtils.substringBeforeLast("foo", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35641);assertEquals("foo", StringUtils.substringBeforeLast("foo", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35642);assertEquals("fo", StringUtils.substringBeforeLast("foo", "o"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35643);assertEquals("abc\r\n", StringUtils.substringBeforeLast("abc\r\n", "d"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35644);assertEquals("abc", StringUtils.substringBeforeLast("abcdabc", "d"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35645);assertEquals("abcdabc", StringUtils.substringBeforeLast("abcdabcd", "d"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35646);assertEquals("a", StringUtils.substringBeforeLast("abc", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35647);assertEquals("abc ", StringUtils.substringBeforeLast("abc \n", "\n"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35648);assertEquals("a", StringUtils.substringBeforeLast("a", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35649);assertEquals("a", StringUtils.substringBeforeLast("a", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35650);assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
    
    @Test
    public void testSubstringAfterLast_StringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g5e0srrib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringAfterLast_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g5e0srrib(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35651);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35652);assertEquals("baz", StringUtils.substringAfterLast("fooXXbarXXbaz", "XX"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35653);assertEquals(null, StringUtils.substringAfterLast(null, null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35654);assertEquals(null, StringUtils.substringAfterLast(null, ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35655);assertEquals(null, StringUtils.substringAfterLast(null, "XX"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35656);assertEquals("", StringUtils.substringAfterLast("", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35657);assertEquals("", StringUtils.substringAfterLast("", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35658);assertEquals("", StringUtils.substringAfterLast("", "a"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35659);assertEquals("", StringUtils.substringAfterLast("foo", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35660);assertEquals("", StringUtils.substringAfterLast("foo", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35661);assertEquals("t", StringUtils.substringAfterLast("foot", "o"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35662);assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35663);assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35664);assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35665);assertEquals("", StringUtils.substringAfterLast("", "d"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35666);assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}        
        
    //-----------------------------------------------------------------------
    @Test
    public void testSubstringBetween_StringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2soi6nzrir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBetween_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2soi6nzrir(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35667);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35668);assertEquals(null, StringUtils.substringBetween(null, "tag"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35669);assertEquals("", StringUtils.substringBetween("", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35670);assertEquals(null, StringUtils.substringBetween("", "abc"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35671);assertEquals("", StringUtils.substringBetween("    ", " "));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35672);assertEquals(null, StringUtils.substringBetween("abc", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35673);assertEquals("", StringUtils.substringBetween("abc", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35674);assertEquals(null, StringUtils.substringBetween("abc", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35675);assertEquals("bc", StringUtils.substringBetween("abca", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35676);assertEquals("bc", StringUtils.substringBetween("abcabca", "a"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35677);assertEquals("bar", StringUtils.substringBetween("\nbar\n", "\n"));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}
            
    @Test
    public void testSubstringBetween_StringStringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2arrxhsrj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBetween_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2arrxhsrj2(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35678);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35679);assertEquals(null, StringUtils.substringBetween(null, "", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35680);assertEquals(null, StringUtils.substringBetween("", null, ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35681);assertEquals(null, StringUtils.substringBetween("", "", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35682);assertEquals("", StringUtils.substringBetween("", "", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35683);assertEquals("", StringUtils.substringBetween("foo", "", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35684);assertEquals(null, StringUtils.substringBetween("foo", "", "]"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35685);assertEquals(null, StringUtils.substringBetween("foo", "[", "]"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35686);assertEquals("", StringUtils.substringBetween("    ", " ", "  "));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35687);assertEquals("bar", StringUtils.substringBetween("<foo>bar</foo>", "<foo>", "</foo>") );
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}

   /**
     * Tests the substringsBetween method that returns an String Array of substrings.
     */
    @Test
    public void testSubstringsBetween_StringStringString() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtliijrjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringsBetween_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtliijrjc(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35688);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35689);String[] results = StringUtils.substringsBetween("[one], [two], [three]", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35690);assertEquals(3, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35691);assertEquals("one", results[0]);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35692);assertEquals("two", results[1]);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35693);assertEquals("three", results[2]);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35694);results = StringUtils.substringsBetween("[one], [two], three", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35695);assertEquals(2, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35696);assertEquals("one", results[0]);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35697);assertEquals("two", results[1]);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35698);results = StringUtils.substringsBetween("[one], [two], three]", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35699);assertEquals(2, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35700);assertEquals("one", results[0]);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35701);assertEquals("two", results[1]);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35702);results = StringUtils.substringsBetween("[one], two], three]", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35703);assertEquals(1, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35704);assertEquals("one", results[0]);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35705);results = StringUtils.substringsBetween("one], two], [three]", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35706);assertEquals(1, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35707);assertEquals("three", results[0]);

        // 'ab hello ba' will match, but 'ab non ba' won't
        // this is because the 'a' is shared between the two and can't be matched twice
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35708);results = StringUtils.substringsBetween("aabhellobabnonba", "ab", "ba");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35709);assertEquals(1, results.length);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35710);assertEquals("hello", results[0]);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35711);results = StringUtils.substringsBetween("one, two, three", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35712);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35713);results = StringUtils.substringsBetween("[one, two, three", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35714);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35715);results = StringUtils.substringsBetween("one, two, three]", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35716);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35717);results = StringUtils.substringsBetween("[one], [two], [three]", "[", null);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35718);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35719);results = StringUtils.substringsBetween("[one], [two], [three]", null, "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35720);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35721);results = StringUtils.substringsBetween("[one], [two], [three]", "", "");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35722);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35723);results = StringUtils.substringsBetween(null, "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35724);assertNull(results);

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35725);results = StringUtils.substringsBetween("", "[", "]");
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35726);assertEquals(0, results.length);
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCountMatches_String() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gwvaynrkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testCountMatches_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gwvaynrkf(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35727);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35728);assertEquals(0, StringUtils.countMatches(null, null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35729);assertEquals(0, StringUtils.countMatches("blah", null));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35730);assertEquals(0, StringUtils.countMatches(null, "DD"));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35731);assertEquals(0, StringUtils.countMatches("x", ""));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35732);assertEquals(0, StringUtils.countMatches("", ""));

        __CLR4_5_2rf0rf0lvha7gha.R.inc(35733);assertEquals(3, 
             StringUtils.countMatches("one long someone sentence of one", "one"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35734);assertEquals(0, 
             StringUtils.countMatches("one long someone sentence of one", "two"));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35735);assertEquals(4, 
             StringUtils.countMatches("oooooooooooo", "ooo"));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}

    @Test
    public void testCountMatches_char() {__CLR4_5_2rf0rf0lvha7gha.R.globalSliceStart(getClass().getName(),35736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq20smrko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rf0rf0lvha7gha.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rf0rf0lvha7gha.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testCountMatches_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq20smrko(){try{__CLR4_5_2rf0rf0lvha7gha.R.inc(35736);
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35737);assertEquals(0, StringUtils.countMatches(null, 'D'));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35738);assertEquals(5, StringUtils.countMatches("one long someone sentence of one", ' '));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35739);assertEquals(6, StringUtils.countMatches("one long someone sentence of one", 'o'));
        __CLR4_5_2rf0rf0lvha7gha.R.inc(35740);assertEquals(4, StringUtils.countMatches("oooooooooooo", "ooo"));
    }finally{__CLR4_5_2rf0rf0lvha7gha.R.flushNeeded();}}

}
