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
package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsFragmentTest {static class __CLR4_5_216pk16pklvha7iny{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55633,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int months = 7;   // second final prime before 12
    private static final int days = 23;    // second final prime before 31 (and valid)
    private static final int hours = 19;   // second final prime before 24
    private static final int minutes = 53; // second final prime before 60
    private static final int seconds = 47; // third final prime before 60
    private static final int millis = 991; // second final prime before 1000

    private Date aDate;
    private Calendar aCalendar;


    @Before
    public void setUp() {try{__CLR4_5_216pk16pklvha7iny.R.inc(55352);
        __CLR4_5_216pk16pklvha7iny.R.inc(55353);aCalendar = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55354);aCalendar.set(2005, months, days, hours, minutes, seconds);
        __CLR4_5_216pk16pklvha7iny.R.inc(55355);aCalendar.set(Calendar.MILLISECOND, millis);
        __CLR4_5_216pk16pklvha7iny.R.inc(55356);aDate = aCalendar.getTime();
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testNullDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oklpn616pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testNullDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oklpn616pp(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55357);
        __CLR4_5_216pk16pklvha7iny.R.inc(55358);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55359);DateUtils.getFragmentInMilliseconds((Date) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55360);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55361);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55362);DateUtils.getFragmentInSeconds((Date) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55363);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55364);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55365);DateUtils.getFragmentInMinutes((Date) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55366);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55367);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55368);DateUtils.getFragmentInHours((Date) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55369);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55370);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55371);DateUtils.getFragmentInDays((Date) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55372);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testNullCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eqtxe16q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testNullCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eqtxe16q5(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55373);
        __CLR4_5_216pk16pklvha7iny.R.inc(55374);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55375);DateUtils.getFragmentInMilliseconds((Calendar) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55376);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55377);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55378);DateUtils.getFragmentInSeconds((Calendar) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55379);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55380);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55381);DateUtils.getFragmentInMinutes((Calendar) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55382);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55383);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55384);DateUtils.getFragmentInHours((Calendar) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55385);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55386);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55387);DateUtils.getFragmentInDays((Calendar) null, Calendar.MILLISECOND);
            __CLR4_5_216pk16pklvha7iny.R.inc(55388);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testInvalidFragmentWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcy9io16ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testInvalidFragmentWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcy9io16ql(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55389);
        __CLR4_5_216pk16pklvha7iny.R.inc(55390);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55391);DateUtils.getFragmentInMilliseconds(aDate, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55392);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55393);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55394);DateUtils.getFragmentInSeconds(aDate, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55395);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55396);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55397);DateUtils.getFragmentInMinutes(aDate, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55398);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55399);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55400);DateUtils.getFragmentInHours(aDate, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55401);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55402);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55403);DateUtils.getFragmentInDays(aDate, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55404);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testInvalidFragmentWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_292xl5s16r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testInvalidFragmentWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_292xl5s16r1(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55405);
        __CLR4_5_216pk16pklvha7iny.R.inc(55406);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55407);DateUtils.getFragmentInMilliseconds(aCalendar, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55408);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55409);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55410);DateUtils.getFragmentInSeconds(aCalendar, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55411);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55412);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55413);DateUtils.getFragmentInMinutes(aCalendar, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55414);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55415);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55416);DateUtils.getFragmentInHours(aCalendar, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55417);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_5_216pk16pklvha7iny.R.inc(55418);try {
            __CLR4_5_216pk16pklvha7iny.R.inc(55419);DateUtils.getFragmentInDays(aCalendar, 0);
            __CLR4_5_216pk16pklvha7iny.R.inc(55420);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ryj8cm16rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ryj8cm16rh(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55421);
        __CLR4_5_216pk16pklvha7iny.R.inc(55422);assertEquals(0, DateUtils.getFragmentInMilliseconds(aDate, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55423);assertEquals(0, DateUtils.getFragmentInSeconds(aDate, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55424);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55425);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55426);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.MILLISECOND));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyzmra16rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyzmra16rn(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55427);
        __CLR4_5_216pk16pklvha7iny.R.inc(55428);assertEquals(0, DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55429);assertEquals(0, DateUtils.getFragmentInSeconds(aCalendar, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55430);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55431);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.MILLISECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55432);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.MILLISECOND));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testSecondFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bjbqz316rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bjbqz316rt(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55433);
        __CLR4_5_216pk16pklvha7iny.R.inc(55434);assertEquals(0, DateUtils.getFragmentInSeconds(aDate, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55435);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55436);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55437);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.SECOND));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cldepr16ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cldepr16ry(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55438);
        __CLR4_5_216pk16pklvha7iny.R.inc(55439);assertEquals(0, DateUtils.getFragmentInSeconds(aCalendar, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55440);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55441);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.SECOND));
        __CLR4_5_216pk16pklvha7iny.R.inc(55442);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.SECOND));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testMinuteFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25pc1bj16s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinuteFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25pc1bj16s3(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55443);
        __CLR4_5_216pk16pklvha7iny.R.inc(55444);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.MINUTE));
        __CLR4_5_216pk16pklvha7iny.R.inc(55445);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.MINUTE));
        __CLR4_5_216pk16pklvha7iny.R.inc(55446);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.MINUTE));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinuteFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24i3u1t16s7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinuteFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24i3u1t16s7(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55447);
        __CLR4_5_216pk16pklvha7iny.R.inc(55448);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.MINUTE));
        __CLR4_5_216pk16pklvha7iny.R.inc(55449);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.MINUTE));
        __CLR4_5_216pk16pklvha7iny.R.inc(55450);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.MINUTE));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHourOfDayFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lirjcq16sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHourOfDayFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lirjcq16sb(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55451);
        __CLR4_5_216pk16pklvha7iny.R.inc(55452);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.HOUR_OF_DAY));
        __CLR4_5_216pk16pklvha7iny.R.inc(55453);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.HOUR_OF_DAY));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHourOfDayFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zek82216se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHourOfDayFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zek82216se(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55454);
        __CLR4_5_216pk16pklvha7iny.R.inc(55455);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.HOUR_OF_DAY));
        __CLR4_5_216pk16pklvha7iny.R.inc(55456);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.HOUR_OF_DAY));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testDayOfYearFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qg6bb16sh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDayOfYearFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qg6bb16sh(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55457);
        __CLR4_5_216pk16pklvha7iny.R.inc(55458);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.DAY_OF_YEAR));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testDayOfYearFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nasy9316sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDayOfYearFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nasy9316sj(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55459);
        __CLR4_5_216pk16pklvha7iny.R.inc(55460);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.DAY_OF_YEAR));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testDateFragmentInLargerUnitWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ndnm5116sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDateFragmentInLargerUnitWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ndnm5116sl(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55461);
        __CLR4_5_216pk16pklvha7iny.R.inc(55462);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.DATE));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testDateFragmentInLargerUnitWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t3q6h116sn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDateFragmentInLargerUnitWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t3q6h116sn(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55463);
        __CLR4_5_216pk16pklvha7iny.R.inc(55464);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.DATE));
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    //Calendar.SECOND as useful fragment
    
    @Test
    public void testMillisecondsOfSecondWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kl7cra16sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfSecondWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kl7cra16sp(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55465);
        __CLR4_5_216pk16pklvha7iny.R.inc(55466);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.SECOND);
        __CLR4_5_216pk16pklvha7iny.R.inc(55467);assertEquals(millis, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfSecondWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzdnzu16ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfSecondWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzdnzu16ss(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55468);
        __CLR4_5_216pk16pklvha7iny.R.inc(55469);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.SECOND);
        __CLR4_5_216pk16pklvha7iny.R.inc(55470);assertEquals(millis, testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55471);assertEquals(aCalendar.get(Calendar.MILLISECOND), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    //Calendar.MINUTE as useful fragment

    @Test
    public void testMillisecondsOfMinuteWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ezzlpy16sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMinuteWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ezzlpy16sw(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55472);
        __CLR4_5_216pk16pklvha7iny.R.inc(55473);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.MINUTE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55474);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfMinuteWithCalender() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qasdyi16sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMinuteWithCalender",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qasdyi16sz(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55475);
        __CLR4_5_216pk16pklvha7iny.R.inc(55476);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MINUTE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55477);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsofMinuteWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u66g9f16t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofMinuteWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u66g9f16t2(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55478);
        __CLR4_5_216pk16pklvha7iny.R.inc(55479);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.MINUTE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55480);assertEquals(seconds, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsofMinuteWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ccofhf16t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofMinuteWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ccofhf16t5(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55481);
        __CLR4_5_216pk16pklvha7iny.R.inc(55482);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.MINUTE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55483);assertEquals(seconds, testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55484);assertEquals(aCalendar.get(Calendar.SECOND), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    //Calendar.HOUR_OF_DAY as useful fragment
    
    @Test
    public void testMillisecondsOfHourWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o4gy5616t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfHourWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o4gy5616t9(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55485);
        __CLR4_5_216pk16pklvha7iny.R.inc(55486);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55487);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testMillisecondsOfHourWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m0nai16tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfHourWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m0nai16tc(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55488);
        __CLR4_5_216pk16pklvha7iny.R.inc(55489);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55490);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsofHourWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9aieb16tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofHourWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9aieb16tf(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55491);
        __CLR4_5_216pk16pklvha7iny.R.inc(55492);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55493);assertEquals(
                seconds
                        + (minutes
                                * DateUtils.MILLIS_PER_MINUTE / DateUtils.MILLIS_PER_SECOND),
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsofHourWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gdu1bn16ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofHourWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gdu1bn16ti(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55494);
        __CLR4_5_216pk16pklvha7iny.R.inc(55495);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55496);assertEquals(
                seconds
                        + (minutes
                                * DateUtils.MILLIS_PER_MINUTE / DateUtils.MILLIS_PER_SECOND),
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfHourWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2osm1gd16tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfHourWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2osm1gd16tl(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55497);
        __CLR4_5_216pk16pklvha7iny.R.inc(55498);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55499);assertEquals(minutes, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfHourWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2obp60j16to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfHourWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2obp60j16to(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55500);
        __CLR4_5_216pk16pklvha7iny.R.inc(55501);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55502);assertEquals(minutes, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    //Calendar.DATE and Calendar.DAY_OF_YEAR as useful fragment
    @Test
    public void testMillisecondsOfDayWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v0583g16tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfDayWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v0583g16tr(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55503);
        __CLR4_5_216pk16pklvha7iny.R.inc(55504);long testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55505);final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        __CLR4_5_216pk16pklvha7iny.R.inc(55506);assertEquals(expectedValue, testresult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55507);testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55508);assertEquals(expectedValue, testresult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testMillisecondsOfDayWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sjp2us16tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfDayWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sjp2us16tx(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55509);
        __CLR4_5_216pk16pklvha7iny.R.inc(55510);long testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55511);final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        __CLR4_5_216pk16pklvha7iny.R.inc(55512);assertEquals(expectedValue, testresult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55513);testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55514);assertEquals(expectedValue, testresult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsOfDayWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2quz6sz16u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfDayWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2quz6sz16u3(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55515);
        __CLR4_5_216pk16pklvha7iny.R.inc(55516);long testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55517);final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        __CLR4_5_216pk16pklvha7iny.R.inc(55518);assertEquals(expectedValue, testresult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55519);testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55520);assertEquals(expectedValue, testresult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsOfDayWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wfqvr116u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfDayWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wfqvr116u9(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55521);
        __CLR4_5_216pk16pklvha7iny.R.inc(55522);long testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55523);final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        __CLR4_5_216pk16pklvha7iny.R.inc(55524);assertEquals(expectedValue, testresult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55525);testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55526);assertEquals(expectedValue, testresult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfDayWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d020d16uf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfDayWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d020d16uf(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55527);
        __CLR4_5_216pk16pklvha7iny.R.inc(55528);long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55529);final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        __CLR4_5_216pk16pklvha7iny.R.inc(55530);assertEquals(expectedValue,testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55531);testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55532);assertEquals(expectedValue,testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfDayWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wk3na516ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfDayWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wk3na516ul(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55533);
        __CLR4_5_216pk16pklvha7iny.R.inc(55534);long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55535);final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        __CLR4_5_216pk16pklvha7iny.R.inc(55536);assertEquals(expectedValue, testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55537);testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55538);assertEquals(expectedValue, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testHoursOfDayWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wxt9nn16ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfDayWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wxt9nn16ur(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55539);
        __CLR4_5_216pk16pklvha7iny.R.inc(55540);long testResult = DateUtils.getFragmentInHours(aDate, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55541);final long expectedValue = hours; 
        __CLR4_5_216pk16pklvha7iny.R.inc(55542);assertEquals(expectedValue,testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55543);testResult = DateUtils.getFragmentInHours(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55544);assertEquals(expectedValue,testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHoursOfDayWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4pv7x16ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfDayWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4pv7x16ux(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55545);
        __CLR4_5_216pk16pklvha7iny.R.inc(55546);long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DATE);
        __CLR4_5_216pk16pklvha7iny.R.inc(55547);final long expectedValue = hours; 
        __CLR4_5_216pk16pklvha7iny.R.inc(55548);assertEquals(expectedValue, testResult);
        __CLR4_5_216pk16pklvha7iny.R.inc(55549);testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55550);assertEquals(expectedValue, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    
    //Calendar.MONTH as useful fragment
    @Test
    public void testMillisecondsOfMonthWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gmutgg16v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMonthWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gmutgg16v3(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55551);
        __CLR4_5_216pk16pklvha7iny.R.inc(55552);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55553);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY),
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfMonthWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi9m6o16v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMonthWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi9m6o16v6(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55554);
        __CLR4_5_216pk16pklvha7iny.R.inc(55555);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55556);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY),
testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testSecondsOfMonthWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuo7e116v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfMonthWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuo7e116v9(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55557);
        __CLR4_5_216pk16pklvha7iny.R.inc(55558);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55559);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsOfMonthWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21kkxlz16vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfMonthWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21kkxlz16vc(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55560);
        __CLR4_5_216pk16pklvha7iny.R.inc(55561);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55562);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfMonthWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tk1qgn16vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfMonthWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55563,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tk1qgn16vf(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55563);
        __CLR4_5_216pk16pklvha7iny.R.inc(55564);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55565);assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfMonthWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2re24ef16vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfMonthWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2re24ef16vi(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55566);
        __CLR4_5_216pk16pklvha7iny.R.inc(55567);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55568);assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + ((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHoursOfMonthWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23oykqh16vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfMonthWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23oykqh16vl(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55569);
        __CLR4_5_216pk16pklvha7iny.R.inc(55570);final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55571);assertEquals(hours + (((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHoursOfMonthWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wo0h7b16vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfMonthWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wo0h7b16vo(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55572);
        __CLR4_5_216pk16pklvha7iny.R.inc(55573);final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55574);assertEquals( hours +(((days - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    //Calendar.YEAR as useful fragment
    @Test
    public void testMillisecondsOfYearWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2oz5916vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfYearWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2oz5916vr(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55575);
        __CLR4_5_216pk16pklvha7iny.R.inc(55576);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55577);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55578);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55579);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((cal.get(Calendar.DAY_OF_YEAR) - 1)* DateUtils.MILLIS_PER_DAY),
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfYearWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236aul916vw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfYearWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236aul916vw(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55580);
        __CLR4_5_216pk16pklvha7iny.R.inc(55581);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55582);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + ((aCalendar.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY),
testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testSecondsOfYearWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dgnz7o16vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfYearWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dgnz7o16vz(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55583);
        __CLR4_5_216pk16pklvha7iny.R.inc(55584);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55585);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55586);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55587);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((cal.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testSecondsOfYearWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iaddl816w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfYearWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iaddl816w4(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55588);
        __CLR4_5_216pk16pklvha7iny.R.inc(55589);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55590);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + ((aCalendar.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfYearWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ynwro16w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfYearWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ynwro16w7(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55591);
        __CLR4_5_216pk16pklvha7iny.R.inc(55592);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55593);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55594);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55595);assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + ((cal.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfYearWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejdo4s16wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfYearWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejdo4s16wc(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55596);
        __CLR4_5_216pk16pklvha7iny.R.inc(55597);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55598);assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + ((aCalendar.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testMinutesOfYearWithWrongOffsetBugWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26fuguy16wf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfYearWithWrongOffsetBugWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26fuguy16wf(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55599);
        __CLR4_5_216pk16pklvha7iny.R.inc(55600);final Calendar c = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55601);c.set(Calendar.MONTH, Calendar.JANUARY);
        __CLR4_5_216pk16pklvha7iny.R.inc(55602);c.set(Calendar.DAY_OF_YEAR, 1);
        __CLR4_5_216pk16pklvha7iny.R.inc(55603);c.set(Calendar.HOUR_OF_DAY, 0);
        __CLR4_5_216pk16pklvha7iny.R.inc(55604);c.set(Calendar.MINUTE, 0);
        __CLR4_5_216pk16pklvha7iny.R.inc(55605);c.set(Calendar.SECOND, 0);
        __CLR4_5_216pk16pklvha7iny.R.inc(55606);c.set(Calendar.MILLISECOND, 0);
        __CLR4_5_216pk16pklvha7iny.R.inc(55607);final long testResult = DateUtils.getFragmentInMinutes(c, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55608);assertEquals( 0, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHoursOfYearWithDate() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wx0d8s16wp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfYearWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wx0d8s16wp(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55609);
        __CLR4_5_216pk16pklvha7iny.R.inc(55610);final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55611);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55612);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55613);assertEquals(hours + (((cal.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}

    @Test
    public void testHoursOfYearWithCalendar() {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hdbftw16wu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfYearWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hdbftw16wu(){try{__CLR4_5_216pk16pklvha7iny.R.inc(55614);
        __CLR4_5_216pk16pklvha7iny.R.inc(55615);final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55616);assertEquals( hours +(((aCalendar.get(Calendar.DAY_OF_YEAR) - 1) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testDaysOfMonthWithCalendar() throws Exception {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jumjl716wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDaysOfMonthWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jumjl716wx() throws Exception{try{__CLR4_5_216pk16pklvha7iny.R.inc(55617);
        __CLR4_5_216pk16pklvha7iny.R.inc(55618);final long testResult = DateUtils.getFragmentInDays(aCalendar, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55619);assertEquals(days, testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testDaysOfMonthWithDate() throws Exception {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_265uaxx16x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDaysOfMonthWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_265uaxx16x0() throws Exception{try{__CLR4_5_216pk16pklvha7iny.R.inc(55620);
        __CLR4_5_216pk16pklvha7iny.R.inc(55621);final long testResult = DateUtils.getFragmentInDays(aDate, Calendar.MONTH);
        __CLR4_5_216pk16pklvha7iny.R.inc(55622);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55623);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55624);assertEquals(cal.get(Calendar.DAY_OF_MONTH), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}    
    
    @Test
    public void testDaysOfYearWithCalendar() throws Exception {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ivlk3s16x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDaysOfYearWithCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ivlk3s16x5() throws Exception{try{__CLR4_5_216pk16pklvha7iny.R.inc(55625);
        __CLR4_5_216pk16pklvha7iny.R.inc(55626);final long testResult = DateUtils.getFragmentInDays(aCalendar, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55627);assertEquals(aCalendar.get(Calendar.DAY_OF_YEAR), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
    
    @Test
    public void testDaysOfYearWithDate() throws Exception {__CLR4_5_216pk16pklvha7iny.R.globalSliceStart(getClass().getName(),55628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_264579k16x8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pk16pklvha7iny.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pk16pklvha7iny.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDaysOfYearWithDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_264579k16x8() throws Exception{try{__CLR4_5_216pk16pklvha7iny.R.inc(55628);
        __CLR4_5_216pk16pklvha7iny.R.inc(55629);final long testResult = DateUtils.getFragmentInDays(aDate, Calendar.YEAR);
        __CLR4_5_216pk16pklvha7iny.R.inc(55630);final Calendar cal = Calendar.getInstance();
        __CLR4_5_216pk16pklvha7iny.R.inc(55631);cal.setTime(aDate);
        __CLR4_5_216pk16pklvha7iny.R.inc(55632);assertEquals(cal.get(Calendar.DAY_OF_YEAR), testResult);
    }finally{__CLR4_5_216pk16pklvha7iny.R.flushNeeded();}}
}
