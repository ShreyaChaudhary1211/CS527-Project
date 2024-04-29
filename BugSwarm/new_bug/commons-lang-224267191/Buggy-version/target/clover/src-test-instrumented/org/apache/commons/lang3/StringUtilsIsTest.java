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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - IsX methods
 */
public class StringUtilsIsTest  {static class __CLR4_5_2r90r90lvha7ggi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,35436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIsAlpha() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bg1d9lr90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlpha",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bg1d9lr90(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35316);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35317);assertFalse(StringUtils.isAlpha(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35318);assertFalse(StringUtils.isAlpha(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35319);assertFalse(StringUtils.isAlpha(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35320);assertTrue(StringUtils.isAlpha("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35321);assertTrue(StringUtils.isAlpha("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35322);assertTrue(StringUtils.isAlpha("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35323);assertFalse(StringUtils.isAlpha("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35324);assertFalse(StringUtils.isAlpha("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35325);assertFalse(StringUtils.isAlpha("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35326);assertFalse(StringUtils.isAlpha("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35327);assertFalse(StringUtils.isAlpha("hkHKHik*khbkuh"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsAlphanumeric() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fbygfir9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphanumeric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fbygfir9c(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35328);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35329);assertFalse(StringUtils.isAlphanumeric(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35330);assertFalse(StringUtils.isAlphanumeric(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35331);assertFalse(StringUtils.isAlphanumeric(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35332);assertTrue(StringUtils.isAlphanumeric("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35333);assertTrue(StringUtils.isAlphanumeric("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35334);assertTrue(StringUtils.isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35335);assertFalse(StringUtils.isAlphanumeric("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35336);assertTrue(StringUtils.isAlphanumeric("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35337);assertTrue(StringUtils.isAlphanumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35338);assertFalse(StringUtils.isAlphanumeric("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35339);assertFalse(StringUtils.isAlphanumeric("hkHKHik*khbkuh"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsWhitespace() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hky02or9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsWhitespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hky02or9o(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35340);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35341);assertFalse(StringUtils.isWhitespace(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35342);assertTrue(StringUtils.isWhitespace(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35343);assertTrue(StringUtils.isWhitespace(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35344);assertTrue(StringUtils.isWhitespace("\t \n \t"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35345);assertFalse(StringUtils.isWhitespace("\t aa\n \t"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35346);assertTrue(StringUtils.isWhitespace(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35347);assertFalse(StringUtils.isWhitespace(" a "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35348);assertFalse(StringUtils.isWhitespace("a  "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35349);assertFalse(StringUtils.isWhitespace("  a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35350);assertFalse(StringUtils.isWhitespace("aba"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35351);assertTrue(StringUtils.isWhitespace(StringUtilsTest.WHITESPACE));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35352);assertFalse(StringUtils.isWhitespace(StringUtilsTest.NON_WHITESPACE));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsAlphaspace() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291t76zra1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphaspace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291t76zra1(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35353);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35354);assertFalse(StringUtils.isAlphaSpace(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35355);assertTrue(StringUtils.isAlphaSpace(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35356);assertTrue(StringUtils.isAlphaSpace(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35357);assertTrue(StringUtils.isAlphaSpace("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35358);assertTrue(StringUtils.isAlphaSpace("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35359);assertTrue(StringUtils.isAlphaSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35360);assertTrue(StringUtils.isAlphaSpace("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35361);assertFalse(StringUtils.isAlphaSpace("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35362);assertFalse(StringUtils.isAlphaSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35363);assertFalse(StringUtils.isAlphaSpace("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35364);assertFalse(StringUtils.isAlphaSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsAlphanumericSpace() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aigmkirad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphanumericSpace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aigmkirad(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35365);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35366);assertFalse(StringUtils.isAlphanumericSpace(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35367);assertTrue(StringUtils.isAlphanumericSpace(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35368);assertTrue(StringUtils.isAlphanumericSpace(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35369);assertTrue(StringUtils.isAlphanumericSpace("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35370);assertTrue(StringUtils.isAlphanumericSpace("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35371);assertTrue(StringUtils.isAlphanumericSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35372);assertTrue(StringUtils.isAlphanumericSpace("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35373);assertTrue(StringUtils.isAlphanumericSpace("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35374);assertTrue(StringUtils.isAlphanumericSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35375);assertFalse(StringUtils.isAlphanumericSpace("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35376);assertFalse(StringUtils.isAlphanumericSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsAsciiPrintable_String() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v0b3tnrap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAsciiPrintable_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v0b3tnrap(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35377);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35378);assertFalse(StringUtils.isAsciiPrintable(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35379);assertTrue(StringUtils.isAsciiPrintable(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35380);assertTrue(StringUtils.isAsciiPrintable(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35381);assertTrue(StringUtils.isAsciiPrintable("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35382);assertTrue(StringUtils.isAsciiPrintable("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35383);assertTrue(StringUtils.isAsciiPrintable("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35384);assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35385);assertTrue(StringUtils.isAsciiPrintable("!ab2c~"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35386);assertTrue(StringUtils.isAsciiPrintable("1000"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35387);assertTrue(StringUtils.isAsciiPrintable("10 00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35388);assertFalse(StringUtils.isAsciiPrintable("10\t00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35389);assertTrue(StringUtils.isAsciiPrintable("10.00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35390);assertTrue(StringUtils.isAsciiPrintable("10,00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35391);assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35392);assertTrue(StringUtils.isAsciiPrintable("hkHK=Hik6i?UGH_KJgU7.tUJgKJ*GI87GI,kug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35393);assertTrue(StringUtils.isAsciiPrintable(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35394);assertTrue(StringUtils.isAsciiPrintable("!"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35395);assertTrue(StringUtils.isAsciiPrintable("~"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35396);assertFalse(StringUtils.isAsciiPrintable(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35397);assertTrue(StringUtils.isAsciiPrintable("G?lc?"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35398);assertTrue(StringUtils.isAsciiPrintable("=?iso-8859-1?Q?G=FClc=FC?="));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35399);assertFalse(StringUtils.isAsciiPrintable("G\u00fclc\u00fc"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}
  
    @Test
    public void testIsNumeric() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lh53nsrbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsNumeric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lh53nsrbc(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35400);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35401);assertFalse(StringUtils.isNumeric(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35402);assertFalse(StringUtils.isNumeric(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35403);assertFalse(StringUtils.isNumeric(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35404);assertFalse(StringUtils.isNumeric("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35405);assertFalse(StringUtils.isNumeric("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35406);assertFalse(StringUtils.isNumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35407);assertFalse(StringUtils.isNumeric("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35408);assertTrue(StringUtils.isNumeric("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35409);assertTrue(StringUtils.isNumeric("1000"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35410);assertTrue(StringUtils.isNumeric("\u0967\u0968\u0969"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35411);assertFalse(StringUtils.isNumeric("\u0967\u0968 \u0969"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35412);assertFalse(StringUtils.isNumeric("2.3"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35413);assertFalse(StringUtils.isNumeric("10 00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35414);assertFalse(StringUtils.isNumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35415);assertFalse(StringUtils.isNumeric("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35416);assertFalse(StringUtils.isNumeric("hkHKHik*khbkuh"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35417);assertFalse(StringUtils.isNumeric("+123"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35418);assertFalse(StringUtils.isNumeric("-123"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

    @Test
    public void testIsNumericSpace() {__CLR4_5_2r90r90lvha7ggi.R.globalSliceStart(getClass().getName(),35419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ky8kkrbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2r90r90lvha7ggi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2r90r90lvha7ggi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsNumericSpace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ky8kkrbv(){try{__CLR4_5_2r90r90lvha7ggi.R.inc(35419);
        __CLR4_5_2r90r90lvha7ggi.R.inc(35420);assertFalse(StringUtils.isNumericSpace(null));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35421);assertTrue(StringUtils.isNumericSpace(""));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35422);assertTrue(StringUtils.isNumericSpace(" "));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35423);assertFalse(StringUtils.isNumericSpace("a"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35424);assertFalse(StringUtils.isNumericSpace("A"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35425);assertFalse(StringUtils.isNumericSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35426);assertFalse(StringUtils.isNumericSpace("ham kso"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35427);assertTrue(StringUtils.isNumericSpace("1"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35428);assertTrue(StringUtils.isNumericSpace("1000"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35429);assertFalse(StringUtils.isNumericSpace("2.3"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35430);assertTrue(StringUtils.isNumericSpace("10 00"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35431);assertTrue(StringUtils.isNumericSpace("\u0967\u0968\u0969"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35432);assertTrue(StringUtils.isNumericSpace("\u0967\u0968 \u0969"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35433);assertFalse(StringUtils.isNumericSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35434);assertFalse(StringUtils.isNumericSpace("_"));
        __CLR4_5_2r90r90lvha7ggi.R.inc(35435);assertFalse(StringUtils.isNumericSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_5_2r90r90lvha7ggi.R.flushNeeded();}}

}
