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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 */
public class NumberUtilsTest {static class __CLR4_5_210kr10krlvha7hy8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,48300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h10kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h10kr(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47403);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47404);assertNotNull(new NumberUtils());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47405);final Constructor<?>[] cons = NumberUtils.class.getDeclaredConstructors();
        __CLR4_5_210kr10krlvha7hy8.R.inc(47406);assertEquals(1, cons.length);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47407);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47408);assertTrue(Modifier.isPublic(NumberUtils.class.getModifiers()));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47409);assertFalse(Modifier.isFinal(NumberUtils.class.getModifiers()));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * Test for {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void testToIntString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qi7p9610ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToIntString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qi7p9610ky(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47410);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47411);assertTrue("toInt(String) 1 failed", NumberUtils.toInt("12345") == 12345);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47412);assertTrue("toInt(String) 2 failed", NumberUtils.toInt("abc") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47413);assertTrue("toInt(empty) failed", NumberUtils.toInt("") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47414);assertTrue("toInt(null) failed", NumberUtils.toInt(null) == 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void testToIntStringI() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ftli0t10l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToIntStringI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ftli0t10l3(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47415);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47416);assertTrue("toInt(String,int) 1 failed", NumberUtils.toInt("12345", 5) == 12345);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47417);assertTrue("toInt(String,int) 2 failed", NumberUtils.toInt("1234.5", 5) == 5);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void testToLongString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1ekox10l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToLongString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1ekox10l6(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47418);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47419);assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47420);assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47421);assertTrue("toLong(String) 3 failed", NumberUtils.toLong("1L") == 0L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47422);assertTrue("toLong(String) 4 failed", NumberUtils.toLong("1l") == 0L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47423);assertTrue("toLong(Long.MAX_VALUE) failed", NumberUtils.toLong(Long.MAX_VALUE+"") == Long.MAX_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47424);assertTrue("toLong(Long.MIN_VALUE) failed", NumberUtils.toLong(Long.MIN_VALUE+"") == Long.MIN_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47425);assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47426);assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0L);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void testToLongStringL() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25qx95z10lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToLongStringL",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25qx95z10lf(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47427);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47428);assertTrue("toLong(String,long) 1 failed", NumberUtils.toLong("12345", 5L) == 12345L);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47429);assertTrue("toLong(String,long) 2 failed", NumberUtils.toLong("1234.5", 5L) == 5L);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void testToFloatString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvq8m110li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToFloatString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvq8m110li(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47430);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47431);assertTrue("toFloat(String) 1 failed", NumberUtils.toFloat("-1.2345") == -1.2345f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47432);assertTrue("toFloat(String) 2 failed", NumberUtils.toFloat("1.2345") == 1.2345f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47433);assertTrue("toFloat(String) 3 failed", NumberUtils.toFloat("abc") == 0.0f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47434);assertTrue("toFloat(Float.MAX_VALUE) failed", NumberUtils.toFloat(Float.MAX_VALUE+"") ==  Float.MAX_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47435);assertTrue("toFloat(Float.MIN_VALUE) failed", NumberUtils.toFloat(Float.MIN_VALUE+"") == Float.MIN_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47436);assertTrue("toFloat(empty) failed", NumberUtils.toFloat("") == 0.0f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47437);assertTrue("toFloat(null) failed", NumberUtils.toFloat(null) == 0.0f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void testToFloatStringF() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s5t6tv10lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToFloatStringF",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s5t6tv10lq(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47438);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47439);assertTrue("toFloat(String,int) 1 failed", NumberUtils.toFloat("1.2345", 5.1f) == 1.2345f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47440);assertTrue("toFloat(String,int) 2 failed", NumberUtils.toFloat("a", 5.0f) == 5.0f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}
    
    /**
     * Test for {(@link NumberUtils#createNumber(String)}
     */
    @Test
    public void testStringCreateNumberEnsureNoPrecisionLoss(){__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ir7cv10lt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testStringCreateNumberEnsureNoPrecisionLoss",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ir7cv10lt(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47441);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47442);final String shouldBeFloat = "1.23";
        __CLR4_5_210kr10krlvha7hy8.R.inc(47443);final String shouldBeDouble = "3.40282354e+38";
        __CLR4_5_210kr10krlvha7hy8.R.inc(47444);final String shouldBeBigDecimal = "1.797693134862315759e+308";
        
        __CLR4_5_210kr10krlvha7hy8.R.inc(47445);assertTrue(NumberUtils.createNumber(shouldBeFloat) instanceof Float);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47446);assertTrue(NumberUtils.createNumber(shouldBeDouble) instanceof Double);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47447);assertTrue(NumberUtils.createNumber(shouldBeBigDecimal) instanceof BigDecimal);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}
    /**
     * Test for {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void testStringToDoubleString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263i24910m0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testStringToDoubleString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263i24910m0(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47448);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47449);assertTrue("toDouble(String) 1 failed", NumberUtils.toDouble("-1.2345") == -1.2345d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47450);assertTrue("toDouble(String) 2 failed", NumberUtils.toDouble("1.2345") == 1.2345d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47451);assertTrue("toDouble(String) 3 failed", NumberUtils.toDouble("abc") == 0.0d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47452);assertTrue("toDouble(Double.MAX_VALUE) failed", NumberUtils.toDouble(Double.MAX_VALUE+"") == Double.MAX_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47453);assertTrue("toDouble(Double.MIN_VALUE) failed", NumberUtils.toDouble(Double.MIN_VALUE+"") == Double.MIN_VALUE);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47454);assertTrue("toDouble(empty) failed", NumberUtils.toDouble("") == 0.0d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47455);assertTrue("toDouble(null) failed", NumberUtils.toDouble(null) == 0.0d);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void testStringToDoubleStringD() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gp04tx10m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testStringToDoubleStringD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gp04tx10m8(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47456);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47457);assertTrue("toDouble(String,int) 1 failed", NumberUtils.toDouble("1.2345", 5.1d) == 1.2345d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47458);assertTrue("toDouble(String,int) 2 failed", NumberUtils.toDouble("a", 5.0d) == 5.0d);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

     /**
     * Test for {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void testToByteString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u5whfx10mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToByteString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u5whfx10mb(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47459);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47460);assertTrue("toByte(String) 1 failed", NumberUtils.toByte("123") == 123);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47461);assertTrue("toByte(String) 2 failed", NumberUtils.toByte("abc") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47462);assertTrue("toByte(empty) failed", NumberUtils.toByte("") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47463);assertTrue("toByte(null) failed", NumberUtils.toByte(null) == 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void testToByteStringI() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cuac4610mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToByteStringI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47464,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cuac4610mg(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47464);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47465);assertTrue("toByte(String,byte) 1 failed", NumberUtils.toByte("123", (byte) 5) == 123);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47466);assertTrue("toByte(String,byte) 2 failed", NumberUtils.toByte("12.3", (byte) 5) == 5);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void testToShortString() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6d4op10mj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToShortString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6d4op10mj(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47467);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47468);assertTrue("toShort(String) 1 failed", NumberUtils.toShort("12345") == 12345);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47469);assertTrue("toShort(String) 2 failed", NumberUtils.toShort("abc") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47470);assertTrue("toShort(empty) failed", NumberUtils.toShort("") == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47471);assertTrue("toShort(null) failed", NumberUtils.toShort(null) == 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void testToShortStringI() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnv2og10mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToShortStringI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnv2og10mo(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47472);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47473);assertTrue("toShort(String,short) 1 failed", NumberUtils.toShort("12345", (short) 5) == 12345);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47474);assertTrue("toShort(String,short) 2 failed", NumberUtils.toShort("1234.5", (short) 5) == 5);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateNumber() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvsfpa10mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumber",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvsfpa10mr(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47475);
        // a lot of things can go wrong
        __CLR4_5_210kr10krlvha7hy8.R.inc(47476);assertEquals("createNumber(String) 1 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47477);assertEquals("createNumber(String) 2 failed", Integer.valueOf("12345"), NumberUtils.createNumber("12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47478);assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5D"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47479);assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5d"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47480);assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5F"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47481);assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5f"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47482);assertEquals("createNumber(String) 5 failed", Long.valueOf(Integer.MAX_VALUE + 1L), NumberUtils.createNumber(""
            + (Integer.MAX_VALUE + 1L)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47483);assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345L"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47484);assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345l"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47485);assertEquals("createNumber(String) 7 failed", Float.valueOf("-1234.5"), NumberUtils.createNumber("-1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47486);assertEquals("createNumber(String) 8 failed", Integer.valueOf("-12345"), NumberUtils.createNumber("-12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47487);assertTrue("createNumber(String) 9a failed", 0xFADE == NumberUtils.createNumber("0xFADE").intValue());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47488);assertTrue("createNumber(String) 9b failed", 0xFADE == NumberUtils.createNumber("0Xfade").intValue());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47489);assertTrue("createNumber(String) 10a failed", -0xFADE == NumberUtils.createNumber("-0xFADE").intValue());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47490);assertTrue("createNumber(String) 10b failed", -0xFADE == NumberUtils.createNumber("-0Xfade").intValue());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47491);assertEquals("createNumber(String) 11 failed", Double.valueOf("1.1E200"), NumberUtils.createNumber("1.1E200"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47492);assertEquals("createNumber(String) 12 failed", Float.valueOf("1.1E20"), NumberUtils.createNumber("1.1E20"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47493);assertEquals("createNumber(String) 13 failed", Double.valueOf("-1.1E200"), NumberUtils.createNumber("-1.1E200"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47494);assertEquals("createNumber(String) 14 failed", Double.valueOf("1.1E-200"), NumberUtils.createNumber("1.1E-200"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47495);assertEquals("createNumber(null) failed", null, NumberUtils.createNumber(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47496);assertEquals("createNumber(String) failed", new BigInteger("12345678901234567890"), NumberUtils
                .createNumber("12345678901234567890L"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47497);assertEquals("createNumber(String) 15 failed", new BigDecimal("1.1E-700"), NumberUtils
                    .createNumber("1.1E-700F"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47498);assertEquals("createNumber(String) 16 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE + "L"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47499);assertEquals("createNumber(String) 17 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47500);assertEquals("createNumber(String) 18 failed", new BigInteger("10" + Long.MAX_VALUE), NumberUtils
                .createNumber("10" + Long.MAX_VALUE));

        // LANG-521
        __CLR4_5_210kr10krlvha7hy8.R.inc(47501);assertEquals("createNumber(String) LANG-521 failed", Float.valueOf("2."), NumberUtils.createNumber("2."));

        // LANG-638
        __CLR4_5_210kr10krlvha7hy8.R.inc(47502);assertFalse("createNumber(String) succeeded", checkCreateNumber("1eE"));

        // LANG-693
        __CLR4_5_210kr10krlvha7hy8.R.inc(47503);assertEquals("createNumber(String) LANG-693 failed", Double.valueOf(Double.MAX_VALUE), NumberUtils
                    .createNumber("" + Double.MAX_VALUE));

        // LANG-822
        // ensure that the underlying negative number would create a BigDecimal
        __CLR4_5_210kr10krlvha7hy8.R.inc(47504);final Number bigNum = NumberUtils.createNumber("-1.1E-700F");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47505);assertNotNull(bigNum);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47506);assertEquals(BigDecimal.class, bigNum.getClass());
        
        // LANG-1018
        __CLR4_5_210kr10krlvha7hy8.R.inc(47507);assertEquals("createNumber(String) LANG-1018 failed",
                Double.valueOf("-160952.54"), NumberUtils.createNumber("-160952.54"));
        // LANG-1187
        __CLR4_5_210kr10krlvha7hy8.R.inc(47508);assertEquals("createNumber(String) LANG-1187 failed",
                Double.valueOf("6264583.33"), NumberUtils.createNumber("6264583.33"));
        // LANG-1215
        __CLR4_5_210kr10krlvha7hy8.R.inc(47509);assertEquals("createNumber(String) LANG-1215 failed",
                Double.valueOf("193343.82"), NumberUtils.createNumber("193343.82"));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}
    
    @Test
    public void testLang1087(){__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tlqtff10nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLang1087",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tlqtff10nq(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47510);
        // no sign cases
        __CLR4_5_210kr10krlvha7hy8.R.inc(47511);assertEquals(Float.class, NumberUtils.createNumber("0.0").getClass());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47512);assertEquals(Float.valueOf("0.0"), NumberUtils.createNumber("0.0"));
        // explicit positive sign cases
        __CLR4_5_210kr10krlvha7hy8.R.inc(47513);assertEquals(Float.class, NumberUtils.createNumber("+0.0").getClass());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47514);assertEquals(Float.valueOf("+0.0"), NumberUtils.createNumber("+0.0"));
        // negative sign cases
        __CLR4_5_210kr10krlvha7hy8.R.inc(47515);assertEquals(Float.class, NumberUtils.createNumber("-0.0").getClass());
        __CLR4_5_210kr10krlvha7hy8.R.inc(47516);assertEquals(Float.valueOf("-0.0"), NumberUtils.createNumber("-0.0"));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void TestLang747() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl2w1r10nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.TestLang747",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl2w1r10nx(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47517);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47518);assertEquals(Integer.valueOf(0x8000),      NumberUtils.createNumber("0x8000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47519);assertEquals(Integer.valueOf(0x80000),     NumberUtils.createNumber("0x80000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47520);assertEquals(Integer.valueOf(0x800000),    NumberUtils.createNumber("0x800000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47521);assertEquals(Integer.valueOf(0x8000000),   NumberUtils.createNumber("0x8000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47522);assertEquals(Integer.valueOf(0x7FFFFFFF),  NumberUtils.createNumber("0x7FFFFFFF"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47523);assertEquals(Long.valueOf(0x80000000L),    NumberUtils.createNumber("0x80000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47524);assertEquals(Long.valueOf(0xFFFFFFFFL),    NumberUtils.createNumber("0xFFFFFFFF"));

        // Leading zero tests
        __CLR4_5_210kr10krlvha7hy8.R.inc(47525);assertEquals(Integer.valueOf(0x8000000),   NumberUtils.createNumber("0x08000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47526);assertEquals(Integer.valueOf(0x7FFFFFFF),  NumberUtils.createNumber("0x007FFFFFFF"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47527);assertEquals(Long.valueOf(0x80000000L),    NumberUtils.createNumber("0x080000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47528);assertEquals(Long.valueOf(0xFFFFFFFFL),    NumberUtils.createNumber("0x00FFFFFFFF"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47529);assertEquals(Long.valueOf(0x800000000L),        NumberUtils.createNumber("0x800000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47530);assertEquals(Long.valueOf(0x8000000000L),       NumberUtils.createNumber("0x8000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47531);assertEquals(Long.valueOf(0x80000000000L),      NumberUtils.createNumber("0x80000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47532);assertEquals(Long.valueOf(0x800000000000L),     NumberUtils.createNumber("0x800000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47533);assertEquals(Long.valueOf(0x8000000000000L),    NumberUtils.createNumber("0x8000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47534);assertEquals(Long.valueOf(0x80000000000000L),   NumberUtils.createNumber("0x80000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47535);assertEquals(Long.valueOf(0x800000000000000L),  NumberUtils.createNumber("0x800000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47536);assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x7FFFFFFFFFFFFFFF"));
        // N.B. Cannot use a hex constant such as 0x8000000000000000L here as that is interpreted as a negative long
        __CLR4_5_210kr10krlvha7hy8.R.inc(47537);assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x8000000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47538);assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0xFFFFFFFFFFFFFFFF"));

        // Leading zero tests
        __CLR4_5_210kr10krlvha7hy8.R.inc(47539);assertEquals(Long.valueOf(0x80000000000000L),   NumberUtils.createNumber("0x00080000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47540);assertEquals(Long.valueOf(0x800000000000000L),  NumberUtils.createNumber("0x0800000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47541);assertEquals(Long.valueOf(0x7FFFFFFFFFFFFFFFL), NumberUtils.createNumber("0x07FFFFFFFFFFFFFFF"));
        // N.B. Cannot use a hex constant such as 0x8000000000000000L here as that is interpreted as a negative long
        __CLR4_5_210kr10krlvha7hy8.R.inc(47542);assertEquals(new BigInteger("8000000000000000", 16), NumberUtils.createNumber("0x00008000000000000000"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47543);assertEquals(new BigInteger("FFFFFFFFFFFFFFFF", 16), NumberUtils.createNumber("0x0FFFFFFFFFFFFFFFF"));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when preceded by -- rather than -
    public void testCreateNumberFailure_1() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26hd52s10oo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,49,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26hd52s10oo(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47544);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47545);NumberUtils.createNumber("--1.1E-700F");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (with decimal)
    public void testCreateNumberFailure_2() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_238d6ab10oq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,50,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_238d6ab10oq(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47546);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47547);NumberUtils.createNumber("-1.1E+0-7e00");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void testCreateNumberFailure_3() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2msi610os();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,51,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2msi610os(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47548);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47549);NumberUtils.createNumber("-11E+0-7e00");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void testCreateNumberFailure_4() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_239mran10ou();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,52,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47550,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_239mran10ou(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47550);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47551);NumberUtils.createNumber("1eE+00001");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when there are multiple trailing 'f' characters (LANG-1205)
    public void testCreateNumberFailure_5() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26imq3410ow();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,53,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26imq3410ow(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47552);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47553);NumberUtils.createNumber("1234.5ff");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when there are multiple trailing 'F' characters (LANG-1205)
    public void testCreateNumberFailure_6() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29rmovl10oy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,54,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29rmovl10oy(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47554);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47555);NumberUtils.createNumber("1234.5FF");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when there are multiple trailing 'd' characters (LANG-1205)
    public void testCreateNumberFailure_7() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0mno210p0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,55,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0mno210p0(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47556);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47557);NumberUtils.createNumber("1234.5dd");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when there are multiple trailing 'D' characters (LANG-1205)
    public void testCreateNumberFailure_8() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9mmgj10p2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,56,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9mmgj10p2(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47558);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47559);NumberUtils.createNumber("1234.5DD");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    // Tests to show when magnitude causes switch to next Number type
    // Will probably need to be adjusted if code is changed to check precision (LANG-693)
    @Test
    public void testCreateNumberMagnitude() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwp2hs10p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberMagnitude",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwp2hs10p4(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47560);
        // Test Float.MAX_VALUE, and same with +1 in final digit to check conversion changes to next Number type
        __CLR4_5_210kr10krlvha7hy8.R.inc(47561);assertEquals(Float.valueOf(Float.MAX_VALUE),  NumberUtils.createNumber("3.4028235e+38"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47562);assertEquals(Double.valueOf(3.4028236e+38),   NumberUtils.createNumber("3.4028236e+38"));

        // Test Double.MAX_VALUE
        __CLR4_5_210kr10krlvha7hy8.R.inc(47563);assertEquals(Double.valueOf(Double.MAX_VALUE),          NumberUtils.createNumber("1.7976931348623157e+308"));
        // Test with +2 in final digit (+1 does not cause roll-over to BigDecimal)
        __CLR4_5_210kr10krlvha7hy8.R.inc(47564);assertEquals(new BigDecimal("1.7976931348623159e+308"), NumberUtils.createNumber("1.7976931348623159e+308"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47565);assertEquals(Integer.valueOf(0x12345678), NumberUtils.createNumber("0x12345678"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47566);assertEquals(Long.valueOf(0x123456789L),  NumberUtils.createNumber("0x123456789"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47567);assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("0x7fffffffffffffff"));
        // Does not appear to be a way to create a literal BigInteger of this magnitude
        __CLR4_5_210kr10krlvha7hy8.R.inc(47568);assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("0x7fffffffffffffff0"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47569);assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("#7fffffffffffffff"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47570);assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("#7fffffffffffffff0"));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47571);assertEquals(Integer.valueOf(017777777777), NumberUtils.createNumber("017777777777")); // 31 bits
        __CLR4_5_210kr10krlvha7hy8.R.inc(47572);assertEquals(Long.valueOf(037777777777L),   NumberUtils.createNumber("037777777777")); // 32 bits

        __CLR4_5_210kr10krlvha7hy8.R.inc(47573);assertEquals(Long.valueOf(0777777777777777777777L),      NumberUtils.createNumber("0777777777777777777777")); // 63 bits
        __CLR4_5_210kr10krlvha7hy8.R.inc(47574);assertEquals(new BigInteger("1777777777777777777777",8), NumberUtils.createNumber("01777777777777777777777"));// 64 bits
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g1ot6310pj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g1ot6310pj(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47575);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47576);assertEquals("createFloat(String) failed", Float.valueOf("1234.5"), NumberUtils.createFloat("1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47577);assertEquals("createFloat(null) failed", null, NumberUtils.createFloat(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47578);this.testCreateFloatFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47579);this.testCreateFloatFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47580);this.testCreateFloatFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47581);this.testCreateFloatFailure("\u00a0\ufeff");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateFloatFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47582);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47583);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47584);final Float value = NumberUtils.createFloat(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47585);fail("createFloat(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21g7g1y10pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47586,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21g7g1y10pu(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47586);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47587);assertEquals("createDouble(String) failed", Double.valueOf("1234.5"), NumberUtils.createDouble("1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47588);assertEquals("createDouble(null) failed", null, NumberUtils.createDouble(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47589);this.testCreateDoubleFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47590);this.testCreateDoubleFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47591);this.testCreateDoubleFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47592);this.testCreateDoubleFailure("\u00a0\ufeff");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateDoubleFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47593);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47594);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47595);final Double value = NumberUtils.createDouble(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47596);fail("createDouble(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateInteger() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olwtbr10q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olwtbr10q5(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47597);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47598);assertEquals("createInteger(String) failed", Integer.valueOf("12345"), NumberUtils.createInteger("12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47599);assertEquals("createInteger(null) failed", null, NumberUtils.createInteger(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47600);this.testCreateIntegerFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47601);this.testCreateIntegerFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47602);this.testCreateIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47603);this.testCreateIntegerFailure("\u00a0\ufeff");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateIntegerFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47604);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47605);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47606);final Integer value = NumberUtils.createInteger(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47607);fail("createInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wplin10qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wplin10qg(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47608);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47609);assertEquals("createLong(String) failed", Long.valueOf("12345"), NumberUtils.createLong("12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47610);assertEquals("createLong(null) failed", null, NumberUtils.createLong(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47611);this.testCreateLongFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47612);this.testCreateLongFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47613);this.testCreateLongFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47614);this.testCreateLongFailure("\u00a0\ufeff");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateLongFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47615);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47616);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47617);final Long value = NumberUtils.createLong(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47618);fail("createLong(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateBigInteger() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rahrnx10qr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateBigInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rahrnx10qr(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47619);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47620);assertEquals("createBigInteger(String) failed", new BigInteger("12345"), NumberUtils.createBigInteger("12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47621);assertEquals("createBigInteger(null) failed", null, NumberUtils.createBigInteger(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47622);this.testCreateBigIntegerFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47623);this.testCreateBigIntegerFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47624);this.testCreateBigIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47625);this.testCreateBigIntegerFailure("\u00a0\ufeff");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47626);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0xff"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47627);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0Xff"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47628);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("#ff"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47629);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0xff"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47630);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0377"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47631);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47632);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47633);assertEquals("createBigInteger(String) failed", new BigInteger("-0"), NumberUtils.createBigInteger("-0"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47634);assertEquals("createBigInteger(String) failed", new BigInteger("0"), NumberUtils.createBigInteger("0"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47635);testCreateBigIntegerFailure("#");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47636);testCreateBigIntegerFailure("-#");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47637);testCreateBigIntegerFailure("0x");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47638);testCreateBigIntegerFailure("-0x");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateBigIntegerFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47639);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47640);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47641);final BigInteger value = NumberUtils.createBigInteger(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47642);fail("createBigInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCreateBigDecimal() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n17hba10rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateBigDecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n17hba10rf(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47643);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47644);assertEquals("createBigDecimal(String) failed", new BigDecimal("1234.5"), NumberUtils.createBigDecimal("1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47645);assertEquals("createBigDecimal(null) failed", null, NumberUtils.createBigDecimal(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47646);this.testCreateBigDecimalFailure("");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47647);this.testCreateBigDecimalFailure(" ");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47648);this.testCreateBigDecimalFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_5_210kr10krlvha7hy8.R.inc(47649);this.testCreateBigDecimalFailure("\u00a0\ufeff");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47650);this.testCreateBigDecimalFailure("-"); // sign alone not valid
        __CLR4_5_210kr10krlvha7hy8.R.inc(47651);this.testCreateBigDecimalFailure("--"); // comment in NumberUtils suggests some implementations may incorrectly allow this
        __CLR4_5_210kr10krlvha7hy8.R.inc(47652);this.testCreateBigDecimalFailure("--0");
        __CLR4_5_210kr10krlvha7hy8.R.inc(47653);this.testCreateBigDecimalFailure("+"); // sign alone not valid
        __CLR4_5_210kr10krlvha7hy8.R.inc(47654);this.testCreateBigDecimalFailure("++"); // in case this was also allowed by some JVMs
        __CLR4_5_210kr10krlvha7hy8.R.inc(47655);this.testCreateBigDecimalFailure("++0");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    protected void testCreateBigDecimalFailure(final String str) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(47656);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47657);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47658);final BigDecimal value = NumberUtils.createBigDecimal(str);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47659);fail("createBigDecimal(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    // min/max tests
    // ----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testMinLong_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ci3h1m10rw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,76,111,110,103,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ci3h1m10rw(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47660);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47661);NumberUtils.min((long[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinLong_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y8pl7a10ry();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,76,111,110,103,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y8pl7a10ry(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47662);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47663);NumberUtils.min(new long[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25599kz10s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25599kz10s0(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47664);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47665);assertEquals(
            "min(long[]) failed for array length 1",
            5,
            NumberUtils.min(new long[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47666);assertEquals(
            "min(long[]) failed for array length 2",
            6,
            NumberUtils.min(new long[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47667);assertEquals(-10, NumberUtils.min(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47668);assertEquals(-10, NumberUtils.min(new long[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinInt_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vrqdvb10s5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,73,110,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vrqdvb10s5(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47669);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47670);NumberUtils.min((int[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinInt_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_256vrfn10s7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,73,110,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47671,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_256vrfn10s7(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47671);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47672);NumberUtils.min(new int[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinInt() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21f3pka10s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21f3pka10s9(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47673);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47674);assertEquals(
            "min(int[]) failed for array length 1",
            5,
            NumberUtils.min(new int[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47675);assertEquals(
            "min(int[]) failed for array length 2",
            6,
            NumberUtils.min(new int[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47676);assertEquals(-10, NumberUtils.min(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47677);assertEquals(-10, NumberUtils.min(new int[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinShort_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2phd9fu10se();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,104,111,114,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2phd9fu10se(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47678);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47679);NumberUtils.min((short[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinShort_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cz5l6210sg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,104,111,114,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cz5l6210sg(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47680);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47681);NumberUtils.min(new short[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinShort() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f73ghp10si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f73ghp10si(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47682);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47683);assertEquals(
            "min(short[]) failed for array length 1",
            5,
            NumberUtils.min(new short[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47684);assertEquals(
            "min(short[]) failed for array length 2",
            6,
            NumberUtils.min(new short[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47685);assertEquals(-10, NumberUtils.min(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47686);assertEquals(-10, NumberUtils.min(new short[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinByte_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21amdq610sn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,66,121,116,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21amdq610sn(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47687);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47688);NumberUtils.min((byte[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinByte_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qiv66i10sp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,66,121,116,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qiv66i10sp(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47689);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47690);NumberUtils.min(new byte[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinByte() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yz6pf510sr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yz6pf510sr(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47691);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47692);assertEquals(
            "min(byte[]) failed for array length 1",
            5,
            NumberUtils.min(new byte[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47693);assertEquals(
            "min(byte[]) failed for array length 2",
            6,
            NumberUtils.min(new byte[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47694);assertEquals(-10, NumberUtils.min(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47695);assertEquals(-10, NumberUtils.min(new byte[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinDouble_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0xv8r10sw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,68,111,117,98,108,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0xv8r10sw(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47696);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47697);NumberUtils.min((double[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinDouble_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2u6kh10sy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,68,111,117,98,108,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2u6kh10sy(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47698);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47699);NumberUtils.min(new double[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24jcuiw10t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24jcuiw10t0(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47700);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47701);assertEquals(
            "min(double[]) failed for array length 1",
            5.12,
            NumberUtils.min(new double[] { 5.12 }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47702);assertEquals(
            "min(double[]) failed for array length 2",
            6.23,
            NumberUtils.min(new double[] { 6.23, 9.34 }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47703);assertEquals(
            "min(double[]) failed for array length 5",
            -10.45,
            NumberUtils.min(new double[] { -10.45, -5.56, 0, 5.67, 10.78 }),
            0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47704);assertEquals(-10, NumberUtils.min(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47705);assertEquals(-10, NumberUtils.min(new double[] { -5, 0, -10, 5, 10 }), 0.0001);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloat_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_287vl5i10t6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,70,108,111,97,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_287vl5i10t6(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47706);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47707);NumberUtils.min((float[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloat_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xp82fe10t8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,70,108,111,97,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xp82fe10t8(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47708);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47709);NumberUtils.min(new float[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tl3uzn10ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tl3uzn10ta(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47710);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47711);assertEquals(
            "min(float[]) failed for array length 1",
            5.9f,
            NumberUtils.min(new float[] { 5.9f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47712);assertEquals(
            "min(float[]) failed for array length 2",
            6.8f,
            NumberUtils.min(new float[] { 6.8f, 9.7f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47713);assertEquals(
            "min(float[]) failed for array length 5",
            -10.6f,
            NumberUtils.min(new float[] { -10.6f, -5.5f, 0, 5.4f, 10.3f }),
            0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47714);assertEquals(-10, NumberUtils.min(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47715);assertEquals(-10, NumberUtils.min(new float[] { -5, 0, -10, 5, 10 }), 0.0001f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLong_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27vk6dk10tg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,76,111,110,103,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27vk6dk10tg(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47716);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47717);NumberUtils.max((long[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLong_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qq29hg10ti();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,76,111,110,103,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qq29hg10ti(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47718);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47719);NumberUtils.max(new long[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2438cd110tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2438cd110tk(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47720);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47721);assertEquals(
            "max(long[]) failed for array length 1",
            5,
            NumberUtils.max(new long[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47722);assertEquals(
            "max(long[]) failed for array length 2",
            9,
            NumberUtils.max(new long[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47723);assertEquals(
            "max(long[]) failed for array length 5",
            10,
            NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47724);assertEquals(10, NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47725);assertEquals(10, NumberUtils.max(new long[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xejy2x10tq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,110,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xejy2x10tq(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47726);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47727);NumberUtils.max((int[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pkjeut10ts();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,110,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pkjeut10ts(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47728);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47729);NumberUtils.max(new int[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxInt() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2js89q410tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2js89q410tu(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47730);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47731);assertEquals(
            "max(int[]) failed for array length 1",
            5,
            NumberUtils.max(new int[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47732);assertEquals(
            "max(int[]) failed for array length 2",
            9,
            NumberUtils.max(new int[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47733);assertEquals(
            "max(int[]) failed for array length 5",
            10,
            NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47734);assertEquals(10, NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47735);assertEquals(10, NumberUtils.max(new int[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShort_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x00l5o10u0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,83,104,111,114,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x00l5o10u0(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47736);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47737);NumberUtils.max((short[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShort_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxwihk10u2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,83,104,111,114,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxwihk10u2(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47738);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47739);NumberUtils.max(new short[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxShort() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n37zn510u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n37zn510u4(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47740);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47741);assertEquals(
            "max(short[]) failed for array length 1",
            5,
            NumberUtils.max(new short[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47742);assertEquals(
            "max(short[]) failed for array length 2",
            9,
            NumberUtils.max(new short[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47743);assertEquals(
            "max(short[]) failed for array length 5",
            10,
            NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47744);assertEquals(10, NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47745);assertEquals(10, NumberUtils.max(new short[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByte_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j319p010ua();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,66,121,116,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j319p010ua(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47746);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47747);NumberUtils.max((byte[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByte_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j07ugo10uc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,66,121,116,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j07ugo10uc(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47748);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47749);NumberUtils.max(new byte[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxByte() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzwfc110ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzwfc110ue(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47750);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47751);assertEquals(
            "max(byte[]) failed for array length 1",
            5,
            NumberUtils.max(new byte[] { 5 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47752);assertEquals(
            "max(byte[]) failed for array length 2",
            9,
            NumberUtils.max(new byte[] { 6, 9 }));

        __CLR4_5_210kr10krlvha7hy8.R.inc(47753);assertEquals(
            "max(byte[]) failed for array length 5",
            10,
            NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47754);assertEquals(10, NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47755);assertEquals(10, NumberUtils.max(new byte[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDouble_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2826xx910uk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,68,111,117,98,108,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2826xx910uk(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47756);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47757);NumberUtils.max((double[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDouble_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wfnzfz10um();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,68,111,117,98,108,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wfnzfz10um(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47758);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47759);NumberUtils.max(new double[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6evxy10uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6evxy10uo(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47760);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47761);final double[] d = null;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47762);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47763);NumberUtils.max(d);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47764);fail("No exception was thrown for null input.");
        } catch (final IllegalArgumentException ex) {}

        __CLR4_5_210kr10krlvha7hy8.R.inc(47765);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(47766);NumberUtils.max(new double[0]);
            __CLR4_5_210kr10krlvha7hy8.R.inc(47767);fail("No exception was thrown for empty input.");
        } catch (final IllegalArgumentException ex) {}

        __CLR4_5_210kr10krlvha7hy8.R.inc(47768);assertEquals(
            "max(double[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new double[] { 5.1f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47769);assertEquals(
            "max(double[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new double[] { 6.3f, 9.2f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47770);assertEquals(
            "max(double[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new double[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47771);assertEquals(10, NumberUtils.max(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47772);assertEquals(10, NumberUtils.max(new double[] { -5, 0, 10, 5, -10 }), 0.0001);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloat_nullArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p89fo10v1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,70,108,111,97,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p89fo10v1(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47773);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47774);NumberUtils.max((float[]) null);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloat_emptyArray() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hd528810v3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,70,108,111,97,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hd528810v3(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47775);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47776);NumberUtils.max(new float[0]);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaxFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235oqun10v5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235oqun10v5(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47777);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47778);assertEquals(
            "max(float[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new float[] { 5.1f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47779);assertEquals(
            "max(float[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new float[] { 6.3f, 9.2f }),
            0);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47780);assertEquals(
            "max(float[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new float[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47781);assertEquals(10, NumberUtils.max(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47782);assertEquals(10, NumberUtils.max(new float[] { -5, 0, 10, 5, -10 }), 0.0001f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n4uayn10vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n4uayn10vb(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47783);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47784);assertEquals("minimum(long,long,long) 1 failed", 12345L, NumberUtils.min(12345L, 12345L + 1L, 12345L + 2L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47785);assertEquals("minimum(long,long,long) 2 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345 + 2L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47786);assertEquals("minimum(long,long,long) 3 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L + 2L, 12345L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47787);assertEquals("minimum(long,long,long) 4 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47788);assertEquals("minimum(long,long,long) 5 failed", 12345L, NumberUtils.min(12345L, 12345L, 12345L));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumInt() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m2ntp610vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47789,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m2ntp610vh(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47789);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47790);assertEquals("minimum(int,int,int) 1 failed", 12345, NumberUtils.min(12345, 12345 + 1, 12345 + 2));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47791);assertEquals("minimum(int,int,int) 2 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345 + 2));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47792);assertEquals("minimum(int,int,int) 3 failed", 12345, NumberUtils.min(12345 + 1, 12345 + 2, 12345));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47793);assertEquals("minimum(int,int,int) 4 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47794);assertEquals("minimum(int,int,int) 5 failed", 12345, NumberUtils.min(12345, 12345, 12345));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumShort() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2psvpix10vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2psvpix10vn(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47795);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47796);final short low = 1234;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47797);final short mid = 1234 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47798);final short high = 1234 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47799);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47800);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, low, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47801);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, high, low));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47802);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, low));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumByte() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzlo1h10vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzlo1h10vv(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47803);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47804);final byte low = 123;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47805);final byte mid = 123 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47806);final byte high = 123 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47807);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47808);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, low, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47809);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, high, low));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47810);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, low));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2luvnas10w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2luvnas10w3(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47811);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47812);final double low = 12.3;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47813);final double mid = 12.3 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47814);final double high = 12.3 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47815);assertEquals(low, NumberUtils.min(low, mid, high), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47816);assertEquals(low, NumberUtils.min(mid, low, high), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47817);assertEquals(low, NumberUtils.min(mid, high, low), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47818);assertEquals(low, NumberUtils.min(low, mid, low), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47819);assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMinimumFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2izblyf10wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2izblyf10wc(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47820);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47821);final float low = 12.3f;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47822);final float mid = 12.3f + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47823);final float high = 12.3f + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47824);assertEquals(low, NumberUtils.min(low, mid, high), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47825);assertEquals(low, NumberUtils.min(mid, low, high), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47826);assertEquals(low, NumberUtils.min(mid, high, low), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47827);assertEquals(low, NumberUtils.min(low, mid, low), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47828);assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259tr6910wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259tr6910wl(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47829);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47830);assertEquals("maximum(long,long,long) 1 failed", 12345L, NumberUtils.max(12345L, 12345L - 1L, 12345L - 2L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47831);assertEquals("maximum(long,long,long) 2 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L - 2L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47832);assertEquals("maximum(long,long,long) 3 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L - 2L, 12345L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47833);assertEquals("maximum(long,long,long) 4 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47834);assertEquals("maximum(long,long,long) 5 failed", 12345L, NumberUtils.max(12345L, 12345L, 12345L));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumInt() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhx3ig10wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhx3ig10wr(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47835);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47836);assertEquals("maximum(int,int,int) 1 failed", 12345, NumberUtils.max(12345, 12345 - 1, 12345 - 2));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47837);assertEquals("maximum(int,int,int) 2 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345 - 2));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47838);assertEquals("maximum(int,int,int) 3 failed", 12345, NumberUtils.max(12345 - 1, 12345 - 2, 12345));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47839);assertEquals("maximum(int,int,int) 4 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47840);assertEquals("maximum(int,int,int) 5 failed", 12345, NumberUtils.max(12345, 12345, 12345));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumShort() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9gb6310wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9gb6310wx(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47841);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47842);final short low = 1234;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47843);final short mid = 1234 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47844);final short high = 1234 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47845);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(low, mid, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47846);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, low, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47847);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, high, low));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47848);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(high, mid, high));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumByte() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yum7tv10x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yum7tv10x5(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47849);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47850);final byte low = 123;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47851);final byte mid = 123 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47852);final byte high = 123 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47853);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(low, mid, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47854);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, low, high));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47855);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, high, low));
        __CLR4_5_210kr10krlvha7hy8.R.inc(47856);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(high, mid, high));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2omndh610xd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2omndh610xd(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47857);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47858);final double low = 12.3;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47859);final double mid = 12.3 + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47860);final double high = 12.3 + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47861);assertEquals(high, NumberUtils.max(low, mid, high), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47862);assertEquals(high, NumberUtils.max(mid, low, high), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47863);assertEquals(high, NumberUtils.max(mid, high, low), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47864);assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47865);assertEquals(high, NumberUtils.max(high, mid, high), 0.0001);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testMaximumFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xir0b910xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47866,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xir0b910xm(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47866);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47867);final float low = 12.3f;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47868);final float mid = 12.3f + 1;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47869);final float high = 12.3f + 2;
        __CLR4_5_210kr10krlvha7hy8.R.inc(47870);assertEquals(high, NumberUtils.max(low, mid, high), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47871);assertEquals(high, NumberUtils.max(mid, low, high), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47872);assertEquals(high, NumberUtils.max(mid, high, low), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47873);assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47874);assertEquals(high, NumberUtils.max(high, mid, high), 0.0001f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    // Testing JDK against old Lang functionality
    @Test
    public void testCompareDouble() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h9jc0l10xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCompareDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h9jc0l10xv(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47875);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47876);assertTrue(Double.compare(Double.NaN, Double.NaN) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47877);assertTrue(Double.compare(Double.NaN, Double.POSITIVE_INFINITY) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47878);assertTrue(Double.compare(Double.NaN, Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47879);assertTrue(Double.compare(Double.NaN, 1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47880);assertTrue(Double.compare(Double.NaN, 0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47881);assertTrue(Double.compare(Double.NaN, -0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47882);assertTrue(Double.compare(Double.NaN, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47883);assertTrue(Double.compare(Double.NaN, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47884);assertTrue(Double.compare(Double.NaN, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47885);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47886);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47887);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47888);assertTrue(Double.compare(Double.POSITIVE_INFINITY, 1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47889);assertTrue(Double.compare(Double.POSITIVE_INFINITY, 0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47890);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47891);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47892);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47893);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47894);assertTrue(Double.compare(Double.MAX_VALUE, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47895);assertTrue(Double.compare(Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47896);assertTrue(Double.compare(Double.MAX_VALUE, Double.MAX_VALUE) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47897);assertTrue(Double.compare(Double.MAX_VALUE, 1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47898);assertTrue(Double.compare(Double.MAX_VALUE, 0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47899);assertTrue(Double.compare(Double.MAX_VALUE, -0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47900);assertTrue(Double.compare(Double.MAX_VALUE, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47901);assertTrue(Double.compare(Double.MAX_VALUE, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47902);assertTrue(Double.compare(Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47903);assertTrue(Double.compare(1.2d, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47904);assertTrue(Double.compare(1.2d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47905);assertTrue(Double.compare(1.2d, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47906);assertTrue(Double.compare(1.2d, 1.2d) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47907);assertTrue(Double.compare(1.2d, 0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47908);assertTrue(Double.compare(1.2d, -0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47909);assertTrue(Double.compare(1.2d, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47910);assertTrue(Double.compare(1.2d, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47911);assertTrue(Double.compare(1.2d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47912);assertTrue(Double.compare(0.0d, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47913);assertTrue(Double.compare(0.0d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47914);assertTrue(Double.compare(0.0d, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47915);assertTrue(Double.compare(0.0d, 1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47916);assertTrue(Double.compare(0.0d, 0.0d) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47917);assertTrue(Double.compare(0.0d, -0.0d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47918);assertTrue(Double.compare(0.0d, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47919);assertTrue(Double.compare(0.0d, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47920);assertTrue(Double.compare(0.0d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47921);assertTrue(Double.compare(-0.0d, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47922);assertTrue(Double.compare(-0.0d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47923);assertTrue(Double.compare(-0.0d, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47924);assertTrue(Double.compare(-0.0d, 1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47925);assertTrue(Double.compare(-0.0d, 0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47926);assertTrue(Double.compare(-0.0d, -0.0d) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47927);assertTrue(Double.compare(-0.0d, -1.2d) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47928);assertTrue(Double.compare(-0.0d, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47929);assertTrue(Double.compare(-0.0d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47930);assertTrue(Double.compare(-1.2d, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47931);assertTrue(Double.compare(-1.2d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47932);assertTrue(Double.compare(-1.2d, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47933);assertTrue(Double.compare(-1.2d, 1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47934);assertTrue(Double.compare(-1.2d, 0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47935);assertTrue(Double.compare(-1.2d, -0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47936);assertTrue(Double.compare(-1.2d, -1.2d) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47937);assertTrue(Double.compare(-1.2d, -Double.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47938);assertTrue(Double.compare(-1.2d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47939);assertTrue(Double.compare(-Double.MAX_VALUE, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47940);assertTrue(Double.compare(-Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47941);assertTrue(Double.compare(-Double.MAX_VALUE, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47942);assertTrue(Double.compare(-Double.MAX_VALUE, 1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47943);assertTrue(Double.compare(-Double.MAX_VALUE, 0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47944);assertTrue(Double.compare(-Double.MAX_VALUE, -0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47945);assertTrue(Double.compare(-Double.MAX_VALUE, -1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47946);assertTrue(Double.compare(-Double.MAX_VALUE, -Double.MAX_VALUE) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47947);assertTrue(Double.compare(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47948);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47949);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47950);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47951);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47952);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47953);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -0.0d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47954);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -1.2d) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47955);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -Double.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47956);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY) == 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testCompareFloat() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),47957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0ddc1105();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCompareFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0ddc1105(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(47957);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47958);assertTrue(Float.compare(Float.NaN, Float.NaN) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47959);assertTrue(Float.compare(Float.NaN, Float.POSITIVE_INFINITY) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47960);assertTrue(Float.compare(Float.NaN, Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47961);assertTrue(Float.compare(Float.NaN, 1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47962);assertTrue(Float.compare(Float.NaN, 0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47963);assertTrue(Float.compare(Float.NaN, -0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47964);assertTrue(Float.compare(Float.NaN, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47965);assertTrue(Float.compare(Float.NaN, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47966);assertTrue(Float.compare(Float.NaN, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47967);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47968);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47969);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47970);assertTrue(Float.compare(Float.POSITIVE_INFINITY, 1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47971);assertTrue(Float.compare(Float.POSITIVE_INFINITY, 0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47972);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47973);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47974);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47975);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47976);assertTrue(Float.compare(Float.MAX_VALUE, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47977);assertTrue(Float.compare(Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47978);assertTrue(Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47979);assertTrue(Float.compare(Float.MAX_VALUE, 1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47980);assertTrue(Float.compare(Float.MAX_VALUE, 0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47981);assertTrue(Float.compare(Float.MAX_VALUE, -0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47982);assertTrue(Float.compare(Float.MAX_VALUE, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47983);assertTrue(Float.compare(Float.MAX_VALUE, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47984);assertTrue(Float.compare(Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47985);assertTrue(Float.compare(1.2f, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47986);assertTrue(Float.compare(1.2f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47987);assertTrue(Float.compare(1.2f, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47988);assertTrue(Float.compare(1.2f, 1.2f) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47989);assertTrue(Float.compare(1.2f, 0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47990);assertTrue(Float.compare(1.2f, -0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47991);assertTrue(Float.compare(1.2f, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47992);assertTrue(Float.compare(1.2f, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47993);assertTrue(Float.compare(1.2f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(47994);assertTrue(Float.compare(0.0f, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47995);assertTrue(Float.compare(0.0f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47996);assertTrue(Float.compare(0.0f, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47997);assertTrue(Float.compare(0.0f, 1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47998);assertTrue(Float.compare(0.0f, 0.0f) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(47999);assertTrue(Float.compare(0.0f, -0.0f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48000);assertTrue(Float.compare(0.0f, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48001);assertTrue(Float.compare(0.0f, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48002);assertTrue(Float.compare(0.0f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48003);assertTrue(Float.compare(-0.0f, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48004);assertTrue(Float.compare(-0.0f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48005);assertTrue(Float.compare(-0.0f, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48006);assertTrue(Float.compare(-0.0f, 1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48007);assertTrue(Float.compare(-0.0f, 0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48008);assertTrue(Float.compare(-0.0f, -0.0f) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48009);assertTrue(Float.compare(-0.0f, -1.2f) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48010);assertTrue(Float.compare(-0.0f, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48011);assertTrue(Float.compare(-0.0f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48012);assertTrue(Float.compare(-1.2f, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48013);assertTrue(Float.compare(-1.2f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48014);assertTrue(Float.compare(-1.2f, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48015);assertTrue(Float.compare(-1.2f, 1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48016);assertTrue(Float.compare(-1.2f, 0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48017);assertTrue(Float.compare(-1.2f, -0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48018);assertTrue(Float.compare(-1.2f, -1.2f) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48019);assertTrue(Float.compare(-1.2f, -Float.MAX_VALUE) == +1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48020);assertTrue(Float.compare(-1.2f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48021);assertTrue(Float.compare(-Float.MAX_VALUE, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48022);assertTrue(Float.compare(-Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48023);assertTrue(Float.compare(-Float.MAX_VALUE, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48024);assertTrue(Float.compare(-Float.MAX_VALUE, 1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48025);assertTrue(Float.compare(-Float.MAX_VALUE, 0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48026);assertTrue(Float.compare(-Float.MAX_VALUE, -0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48027);assertTrue(Float.compare(-Float.MAX_VALUE, -1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48028);assertTrue(Float.compare(-Float.MAX_VALUE, -Float.MAX_VALUE) == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48029);assertTrue(Float.compare(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48030);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NaN) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48031);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48032);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48033);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48034);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48035);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -0.0f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48036);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -1.2f) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48037);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -Float.MAX_VALUE) == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48038);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY) == 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testIsDigits() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xdmkbt112f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsDigits",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xdmkbt112f(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48039);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48040);assertFalse("isDigits(null) failed", NumberUtils.isDigits(null));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48041);assertFalse("isDigits('') failed", NumberUtils.isDigits(""));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48042);assertTrue("isDigits(String) failed", NumberUtils.isDigits("12345"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48043);assertFalse("isDigits(String) neg 1 failed", NumberUtils.isDigits("1234.5"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48044);assertFalse("isDigits(String) neg 3 failed", NumberUtils.isDigits("1ab"));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48045);assertFalse("isDigits(String) neg 4 failed", NumberUtils.isDigits("abc"));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Tests isCreatable(String) and tests that createNumber(String) returns
     * a valid number iff isCreatable(String) returns false.
     */
    @Test
    public void testIsCreatable() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28b4zzm112m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsCreatable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28b4zzm112m(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48046);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48047);compareIsCreatableWithCreateNumber("12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48048);compareIsCreatableWithCreateNumber("1234.5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48049);compareIsCreatableWithCreateNumber(".12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48050);compareIsCreatableWithCreateNumber("1234E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48051);compareIsCreatableWithCreateNumber("1234E+5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48052);compareIsCreatableWithCreateNumber("1234E-5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48053);compareIsCreatableWithCreateNumber("123.4E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48054);compareIsCreatableWithCreateNumber("-1234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48055);compareIsCreatableWithCreateNumber("-1234.5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48056);compareIsCreatableWithCreateNumber("-.12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48057);compareIsCreatableWithCreateNumber("-1234E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48058);compareIsCreatableWithCreateNumber("0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48059);compareIsCreatableWithCreateNumber("0.1", true); // LANG-1216
        __CLR4_5_210kr10krlvha7hy8.R.inc(48060);compareIsCreatableWithCreateNumber("-0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48061);compareIsCreatableWithCreateNumber("01234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48062);compareIsCreatableWithCreateNumber("-01234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48063);compareIsCreatableWithCreateNumber("-0xABC123", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48064);compareIsCreatableWithCreateNumber("-0x0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48065);compareIsCreatableWithCreateNumber("123.4E21D", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48066);compareIsCreatableWithCreateNumber("-221.23F", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48067);compareIsCreatableWithCreateNumber("22338L", true);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48068);compareIsCreatableWithCreateNumber(null, false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48069);compareIsCreatableWithCreateNumber("", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48070);compareIsCreatableWithCreateNumber(" ", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48071);compareIsCreatableWithCreateNumber("\r\n\t", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48072);compareIsCreatableWithCreateNumber("--2.3", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48073);compareIsCreatableWithCreateNumber(".12.3", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48074);compareIsCreatableWithCreateNumber("-123E", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48075);compareIsCreatableWithCreateNumber("-123E+-212", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48076);compareIsCreatableWithCreateNumber("-123E2.12", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48077);compareIsCreatableWithCreateNumber("0xGF", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48078);compareIsCreatableWithCreateNumber("0xFAE-1", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48079);compareIsCreatableWithCreateNumber(".", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48080);compareIsCreatableWithCreateNumber("-0ABC123", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48081);compareIsCreatableWithCreateNumber("123.4E-D", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48082);compareIsCreatableWithCreateNumber("123.4ED", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48083);compareIsCreatableWithCreateNumber("1234E5l", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48084);compareIsCreatableWithCreateNumber("11a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48085);compareIsCreatableWithCreateNumber("1a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48086);compareIsCreatableWithCreateNumber("a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48087);compareIsCreatableWithCreateNumber("11g", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48088);compareIsCreatableWithCreateNumber("11z", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48089);compareIsCreatableWithCreateNumber("11def", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48090);compareIsCreatableWithCreateNumber("11d11", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48091);compareIsCreatableWithCreateNumber("11 11", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48092);compareIsCreatableWithCreateNumber(" 1111", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48093);compareIsCreatableWithCreateNumber("1111 ", false);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48094);compareIsCreatableWithCreateNumber("2.", true); // LANG-521
        __CLR4_5_210kr10krlvha7hy8.R.inc(48095);compareIsCreatableWithCreateNumber("1.1L", false); // LANG-664
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLANG971() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21vqce21140();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLANG971",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21vqce21140(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48096);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48097);compareIsCreatableWithCreateNumber("0085", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48098);compareIsCreatableWithCreateNumber("085", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48099);compareIsCreatableWithCreateNumber("08", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48100);compareIsCreatableWithCreateNumber("07", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48101);compareIsCreatableWithCreateNumber("00", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLANG992() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26gnxpj1146();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLANG992",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26gnxpj1146(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48102);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48103);compareIsCreatableWithCreateNumber("0.0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48104);compareIsCreatableWithCreateNumber("0.4790", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLANG972() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254qb6j1149();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLANG972",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254qb6j1149(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48105);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48106);compareIsCreatableWithCreateNumber("0xABCD", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48107);compareIsCreatableWithCreateNumber("0XABCD", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLANG1252() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l8zce3114c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLANG1252",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l8zce3114c(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48108);
        //Check idiosyncrasies between java 1.6 and 1.7, 1.8 regarding leading + signs
        __CLR4_5_210kr10krlvha7hy8.R.inc(48109);if ((((SystemUtils.IS_JAVA_1_6)&&(__CLR4_5_210kr10krlvha7hy8.R.iget(48110)!=0|true))||(__CLR4_5_210kr10krlvha7hy8.R.iget(48111)==0&false))) {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48112);compareIsCreatableWithCreateNumber("+2", false);
        } }else {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48113);compareIsCreatableWithCreateNumber("+2", true);
        }

        //The Following should work regardless of 1.6, 1.7, or 1.8
        }__CLR4_5_210kr10krlvha7hy8.R.inc(48114);compareIsCreatableWithCreateNumber("+2.0", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    private void compareIsCreatableWithCreateNumber(final String val, final boolean expected) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(48115);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48116);final boolean isValid = NumberUtils.isCreatable(val);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48117);final boolean canCreate = checkCreateNumber(val);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48118);if ((((isValid == expected && canCreate == expected)&&(__CLR4_5_210kr10krlvha7hy8.R.iget(48119)!=0|true))||(__CLR4_5_210kr10krlvha7hy8.R.iget(48120)==0&false))) {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48121);return;
        }
        }__CLR4_5_210kr10krlvha7hy8.R.inc(48122);fail("Expecting "+ expected + " for isCreatable/createNumber using \"" + val + "\" but got " + isValid + " and " + canCreate);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    /**
     * Tests isCreatable(String) and tests that createNumber(String) returns
     * a valid number iff isCreatable(String) returns false.
     */
    @Test
    public void testIsNumber() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nd01as114r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumber",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nd01as114r(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48123);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48124);compareIsNumberWithCreateNumber("12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48125);compareIsNumberWithCreateNumber("1234.5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48126);compareIsNumberWithCreateNumber(".12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48127);compareIsNumberWithCreateNumber("1234E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48128);compareIsNumberWithCreateNumber("1234E+5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48129);compareIsNumberWithCreateNumber("1234E-5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48130);compareIsNumberWithCreateNumber("123.4E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48131);compareIsNumberWithCreateNumber("-1234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48132);compareIsNumberWithCreateNumber("-1234.5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48133);compareIsNumberWithCreateNumber("-.12345", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48134);compareIsNumberWithCreateNumber("-1234E5", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48135);compareIsNumberWithCreateNumber("0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48136);compareIsNumberWithCreateNumber("-0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48137);compareIsNumberWithCreateNumber("01234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48138);compareIsNumberWithCreateNumber("-01234", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48139);compareIsNumberWithCreateNumber("-0xABC123", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48140);compareIsNumberWithCreateNumber("-0x0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48141);compareIsNumberWithCreateNumber("123.4E21D", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48142);compareIsNumberWithCreateNumber("-221.23F", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48143);compareIsNumberWithCreateNumber("22338L", true);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48144);compareIsNumberWithCreateNumber(null, false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48145);compareIsNumberWithCreateNumber("", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48146);compareIsNumberWithCreateNumber(" ", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48147);compareIsNumberWithCreateNumber("\r\n\t", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48148);compareIsNumberWithCreateNumber("--2.3", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48149);compareIsNumberWithCreateNumber(".12.3", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48150);compareIsNumberWithCreateNumber("-123E", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48151);compareIsNumberWithCreateNumber("-123E+-212", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48152);compareIsNumberWithCreateNumber("-123E2.12", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48153);compareIsNumberWithCreateNumber("0xGF", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48154);compareIsNumberWithCreateNumber("0xFAE-1", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48155);compareIsNumberWithCreateNumber(".", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48156);compareIsNumberWithCreateNumber("-0ABC123", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48157);compareIsNumberWithCreateNumber("123.4E-D", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48158);compareIsNumberWithCreateNumber("123.4ED", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48159);compareIsNumberWithCreateNumber("1234E5l", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48160);compareIsNumberWithCreateNumber("11a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48161);compareIsNumberWithCreateNumber("1a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48162);compareIsNumberWithCreateNumber("a", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48163);compareIsNumberWithCreateNumber("11g", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48164);compareIsNumberWithCreateNumber("11z", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48165);compareIsNumberWithCreateNumber("11def", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48166);compareIsNumberWithCreateNumber("11d11", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48167);compareIsNumberWithCreateNumber("11 11", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48168);compareIsNumberWithCreateNumber(" 1111", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48169);compareIsNumberWithCreateNumber("1111 ", false);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48170);compareIsNumberWithCreateNumber("2.", true); // LANG-521
        __CLR4_5_210kr10krlvha7hy8.R.inc(48171);compareIsNumberWithCreateNumber("1.1L", false); // LANG-664
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testIsNumberLANG971() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hi3ojd1164();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumberLANG971",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48172,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hi3ojd1164(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48172);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48173);compareIsNumberWithCreateNumber("0085", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48174);compareIsNumberWithCreateNumber("085", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48175);compareIsNumberWithCreateNumber("08", false);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48176);compareIsNumberWithCreateNumber("07", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48177);compareIsNumberWithCreateNumber("00", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testIsNumberLANG992() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2puhymy116a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumberLANG992",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2puhymy116a(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48178);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48179);compareIsNumberWithCreateNumber("0.0", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48180);compareIsNumberWithCreateNumber("0.4790", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testIsNumberLANG972() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e93pqw116d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumberLANG972",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e93pqw116d(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48181);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48182);compareIsNumberWithCreateNumber("0xABCD", true);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48183);compareIsNumberWithCreateNumber("0XABCD", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testIsNumberLANG1252() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h46cm0116g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumberLANG1252",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h46cm0116g(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48184);
        //Check idiosyncrasies between java 1.6 and 1.7,1.8 regarding leading + signs
        __CLR4_5_210kr10krlvha7hy8.R.inc(48185);if ((((SystemUtils.IS_JAVA_1_6)&&(__CLR4_5_210kr10krlvha7hy8.R.iget(48186)!=0|true))||(__CLR4_5_210kr10krlvha7hy8.R.iget(48187)==0&false))) {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48188);compareIsNumberWithCreateNumber("+2", false);
        } }else {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48189);compareIsNumberWithCreateNumber("+2", true);
        }

        //The Following should work regardless of 1.6, 1.7, or 1.8
        }__CLR4_5_210kr10krlvha7hy8.R.inc(48190);compareIsNumberWithCreateNumber("+2.0", true);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    private void compareIsNumberWithCreateNumber(final String val, final boolean expected) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(48191);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48192);final boolean isValid = NumberUtils.isCreatable(val);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48193);final boolean canCreate = checkCreateNumber(val);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48194);if ((((isValid == expected && canCreate == expected)&&(__CLR4_5_210kr10krlvha7hy8.R.iget(48195)!=0|true))||(__CLR4_5_210kr10krlvha7hy8.R.iget(48196)==0&false))) {{
            __CLR4_5_210kr10krlvha7hy8.R.inc(48197);return;
        }
        }__CLR4_5_210kr10krlvha7hy8.R.inc(48198);fail("Expecting "+ expected + " for isCreatable/createNumber using \"" + val + "\" but got " + isValid + " and " + canCreate);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}
    
    @Test
    public void testIsParsable() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ioe2a7116v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsParsable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ioe2a7116v(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48199);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48200);assertFalse( NumberUtils.isParsable(null) );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48201);assertFalse( NumberUtils.isParsable("") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48202);assertFalse( NumberUtils.isParsable("0xC1AB") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48203);assertFalse( NumberUtils.isParsable("65CBA2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48204);assertFalse( NumberUtils.isParsable("pendro") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48205);assertFalse( NumberUtils.isParsable("64,2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48206);assertFalse( NumberUtils.isParsable("64.2.2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48207);assertFalse( NumberUtils.isParsable("64.") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48208);assertFalse( NumberUtils.isParsable("64L") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48209);assertFalse( NumberUtils.isParsable("-") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48210);assertFalse( NumberUtils.isParsable("--2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48211);assertTrue( NumberUtils.isParsable("64.2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48212);assertTrue( NumberUtils.isParsable("64") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48213);assertTrue( NumberUtils.isParsable("018") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48214);assertTrue( NumberUtils.isParsable(".18") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48215);assertTrue( NumberUtils.isParsable("-65") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48216);assertTrue( NumberUtils.isParsable("-018") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48217);assertTrue( NumberUtils.isParsable("-018.2") );
        __CLR4_5_210kr10krlvha7hy8.R.inc(48218);assertTrue( NumberUtils.isParsable("-.236") );
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    private boolean checkCreateNumber(final String val) {try{__CLR4_5_210kr10krlvha7hy8.R.inc(48219);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48220);try {
            __CLR4_5_210kr10krlvha7hy8.R.inc(48221);final Object obj = NumberUtils.createNumber(val);
            __CLR4_5_210kr10krlvha7hy8.R.inc(48222);if ((((obj == null)&&(__CLR4_5_210kr10krlvha7hy8.R.iget(48223)!=0|true))||(__CLR4_5_210kr10krlvha7hy8.R.iget(48224)==0&false))) {{
                __CLR4_5_210kr10krlvha7hy8.R.inc(48225);return false;
            }
            }__CLR4_5_210kr10krlvha7hy8.R.inc(48226);return true;
        } catch (final NumberFormatException e) {
            __CLR4_5_210kr10krlvha7hy8.R.inc(48227);return false;
       }
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @SuppressWarnings("cast") // suppress instanceof warning check
    @Test
    public void testConstants() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25epzlw117o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testConstants",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25epzlw117o(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48228);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48229);assertTrue(NumberUtils.LONG_ZERO instanceof Long);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48230);assertTrue(NumberUtils.LONG_ONE instanceof Long);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48231);assertTrue(NumberUtils.LONG_MINUS_ONE instanceof Long);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48232);assertTrue(NumberUtils.INTEGER_ZERO instanceof Integer);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48233);assertTrue(NumberUtils.INTEGER_ONE instanceof Integer);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48234);assertTrue(NumberUtils.INTEGER_MINUS_ONE instanceof Integer);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48235);assertTrue(NumberUtils.SHORT_ZERO instanceof Short);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48236);assertTrue(NumberUtils.SHORT_ONE instanceof Short);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48237);assertTrue(NumberUtils.SHORT_MINUS_ONE instanceof Short);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48238);assertTrue(NumberUtils.BYTE_ZERO instanceof Byte);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48239);assertTrue(NumberUtils.BYTE_ONE instanceof Byte);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48240);assertTrue(NumberUtils.BYTE_MINUS_ONE instanceof Byte);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48241);assertTrue(NumberUtils.DOUBLE_ZERO instanceof Double);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48242);assertTrue(NumberUtils.DOUBLE_ONE instanceof Double);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48243);assertTrue(NumberUtils.DOUBLE_MINUS_ONE instanceof Double);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48244);assertTrue(NumberUtils.FLOAT_ZERO instanceof Float);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48245);assertTrue(NumberUtils.FLOAT_ONE instanceof Float);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48246);assertTrue(NumberUtils.FLOAT_MINUS_ONE instanceof Float);

        __CLR4_5_210kr10krlvha7hy8.R.inc(48247);assertTrue(NumberUtils.LONG_ZERO.longValue() == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48248);assertTrue(NumberUtils.LONG_ONE.longValue() == 1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48249);assertTrue(NumberUtils.LONG_MINUS_ONE.longValue() == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48250);assertTrue(NumberUtils.INTEGER_ZERO.intValue() == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48251);assertTrue(NumberUtils.INTEGER_ONE.intValue() == 1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48252);assertTrue(NumberUtils.INTEGER_MINUS_ONE.intValue() == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48253);assertTrue(NumberUtils.SHORT_ZERO.shortValue() == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48254);assertTrue(NumberUtils.SHORT_ONE.shortValue() == 1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48255);assertTrue(NumberUtils.SHORT_MINUS_ONE.shortValue() == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48256);assertTrue(NumberUtils.BYTE_ZERO.byteValue() == 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48257);assertTrue(NumberUtils.BYTE_ONE.byteValue() == 1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48258);assertTrue(NumberUtils.BYTE_MINUS_ONE.byteValue() == -1);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48259);assertTrue(NumberUtils.DOUBLE_ZERO.doubleValue() == 0.0d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48260);assertTrue(NumberUtils.DOUBLE_ONE.doubleValue() == 1.0d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48261);assertTrue(NumberUtils.DOUBLE_MINUS_ONE.doubleValue() == -1.0d);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48262);assertTrue(NumberUtils.FLOAT_ZERO.floatValue() == 0.0f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48263);assertTrue(NumberUtils.FLOAT_ONE.floatValue() == 1.0f);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48264);assertTrue(NumberUtils.FLOAT_MINUS_ONE.floatValue() == -1.0f);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLang300() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23cauyu118p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLang300",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23cauyu118p(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48265);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48266);NumberUtils.createNumber("-1l");
        __CLR4_5_210kr10krlvha7hy8.R.inc(48267);NumberUtils.createNumber("01l");
        __CLR4_5_210kr10krlvha7hy8.R.inc(48268);NumberUtils.createNumber("1l");
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void testLang381() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ok868j118t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLang381",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ok868j118t(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48269);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48270);assertTrue(Double.isNaN(NumberUtils.min(1.2, 2.5, Double.NaN)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48271);assertTrue(Double.isNaN(NumberUtils.max(1.2, 2.5, Double.NaN)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48272);assertTrue(Float.isNaN(NumberUtils.min(1.2f, 2.5f, Float.NaN)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48273);assertTrue(Float.isNaN(NumberUtils.max(1.2f, 2.5f, Float.NaN)));

        __CLR4_5_210kr10krlvha7hy8.R.inc(48274);final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_5_210kr10krlvha7hy8.R.inc(48275);assertTrue(Double.isNaN(NumberUtils.max(a)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48276);assertTrue(Double.isNaN(NumberUtils.min(a)));

        __CLR4_5_210kr10krlvha7hy8.R.inc(48277);final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_5_210kr10krlvha7hy8.R.inc(48278);assertTrue(Double.isNaN(NumberUtils.max(b)));
        __CLR4_5_210kr10krlvha7hy8.R.inc(48279);assertTrue(Double.isNaN(NumberUtils.min(b)));

        __CLR4_5_210kr10krlvha7hy8.R.inc(48280);final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_5_210kr10krlvha7hy8.R.inc(48281);assertTrue(Float.isNaN(NumberUtils.max(aF)));

        __CLR4_5_210kr10krlvha7hy8.R.inc(48282);final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_5_210kr10krlvha7hy8.R.inc(48283);assertTrue(Float.isNaN(NumberUtils.max(bF)));
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void compareInt() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eb554f1198();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.compareInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eb554f1198(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48284);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48285);assertTrue(NumberUtils.compare(-3, 0) < 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48286);assertTrue(NumberUtils.compare(113, 113)==0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48287);assertTrue(NumberUtils.compare(213, 32) > 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void compareLong() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqp73c119c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.compareLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqp73c119c(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48288);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48289);assertTrue(NumberUtils.compare(-3L, 0L) < 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48290);assertTrue(NumberUtils.compare(113L, 113L)==0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48291);assertTrue(NumberUtils.compare(213L, 32L) > 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void compareShort() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rxdsla119g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.compareShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rxdsla119g(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48292);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48293);assertTrue(NumberUtils.compare((short)-3, (short)0) < 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48294);assertTrue(NumberUtils.compare((short)113, (short)113)==0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48295);assertTrue(NumberUtils.compare((short)213, (short)32) > 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}

    @Test
    public void compareByte() {__CLR4_5_210kr10krlvha7hy8.R.globalSliceStart(getClass().getName(),48296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28dqrws119k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210kr10krlvha7hy8.R.rethrow($CLV_t2$);}finally{__CLR4_5_210kr10krlvha7hy8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.compareByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),48296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28dqrws119k(){try{__CLR4_5_210kr10krlvha7hy8.R.inc(48296);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48297);assertTrue(NumberUtils.compare((byte)-3, (byte)0) < 0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48298);assertTrue(NumberUtils.compare((byte)113, (byte)113)==0);
        __CLR4_5_210kr10krlvha7hy8.R.inc(48299);assertTrue(NumberUtils.compare((byte)123, (byte)32) > 0);
    }finally{__CLR4_5_210kr10krlvha7hy8.R.flushNeeded();}}
}
