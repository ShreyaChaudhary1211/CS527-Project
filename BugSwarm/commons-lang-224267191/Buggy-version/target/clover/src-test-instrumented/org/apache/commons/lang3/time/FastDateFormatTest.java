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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

import org.apache.commons.lang3.test.SystemDefaults;
import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.
 *
 * @since 2.0
 */
public class FastDateFormatTest {static class __CLR4_5_2182g182glvha7is5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,57268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();

    /*
     * Only the cache methods need to be tested here.
     * The print methods are tested by {@link FastDateFormat_PrinterTest}
     * and the parse methods are tested by {@link FastDateFormat_ParserTest}
     */
    @Test
    public void test_getInstance() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwz0px182g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwz0px182g(){try{__CLR4_5_2182g182glvha7is5.R.inc(57112);
        __CLR4_5_2182g182glvha7is5.R.inc(57113);final FastDateFormat format1 = FastDateFormat.getInstance();
        __CLR4_5_2182g182glvha7is5.R.inc(57114);final FastDateFormat format2 = FastDateFormat.getInstance();
        __CLR4_5_2182g182glvha7is5.R.inc(57115);assertSame(format1, format2);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void test_getInstance_String() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xny2ex182k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xny2ex182k(){try{__CLR4_5_2182g182glvha7is5.R.inc(57116);
        __CLR4_5_2182g182glvha7is5.R.inc(57117);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy");
        __CLR4_5_2182g182glvha7is5.R.inc(57118);final FastDateFormat format2 = FastDateFormat.getInstance("MM-DD-yyyy");
        __CLR4_5_2182g182glvha7is5.R.inc(57119);final FastDateFormat format3 = FastDateFormat.getInstance("MM-DD-yyyy");

        __CLR4_5_2182g182glvha7is5.R.inc(57120);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57121);assertSame(format2, format3);
        __CLR4_5_2182g182glvha7is5.R.inc(57122);assertEquals("MM/DD/yyyy", format1.getPattern());
        __CLR4_5_2182g182glvha7is5.R.inc(57123);assertEquals(TimeZone.getDefault(), format1.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57124);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @SystemDefaults(timezone="America/New_York", locale="en_US")
    @Test
    public void test_getInstance_String_TimeZone() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ntjj2r182t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ntjj2r182t(){try{__CLR4_5_2182g182glvha7is5.R.inc(57125);

        __CLR4_5_2182g182glvha7is5.R.inc(57126);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy",
                TimeZone.getTimeZone("Atlantic/Reykjavik"));
        __CLR4_5_2182g182glvha7is5.R.inc(57127);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy");
        __CLR4_5_2182g182glvha7is5.R.inc(57128);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy", TimeZone.getDefault());
        __CLR4_5_2182g182glvha7is5.R.inc(57129);final FastDateFormat format4 = FastDateFormat.getInstance("MM/DD/yyyy", TimeZone.getDefault());
        __CLR4_5_2182g182glvha7is5.R.inc(57130);final FastDateFormat format5 = FastDateFormat.getInstance("MM-DD-yyyy", TimeZone.getDefault());
        __CLR4_5_2182g182glvha7is5.R.inc(57131);final FastDateFormat format6 = FastDateFormat.getInstance("MM-DD-yyyy");

        __CLR4_5_2182g182glvha7is5.R.inc(57132);assertNotSame(format1, format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57133);assertEquals(TimeZone.getTimeZone("Atlantic/Reykjavik"), format1.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57134);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57135);assertSame(format3, format4);
        __CLR4_5_2182g182glvha7is5.R.inc(57136);assertNotSame(format3, format5);
        __CLR4_5_2182g182glvha7is5.R.inc(57137);assertNotSame(format4, format6);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @SystemDefaults(locale="en_US")
    @Test
    public void test_getInstance_String_Locale() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bl3rpq1836();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bl3rpq1836(){try{__CLR4_5_2182g182glvha7is5.R.inc(57138);
        __CLR4_5_2182g182glvha7is5.R.inc(57139);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57140);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy");
        __CLR4_5_2182g182glvha7is5.R.inc(57141);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);

        __CLR4_5_2182g182glvha7is5.R.inc(57142);assertNotSame(format1, format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57143);assertSame(format1, format3);
        __CLR4_5_2182g182glvha7is5.R.inc(57144);assertEquals(Locale.GERMANY, format1.getLocale());
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @SystemDefaults(locale="en_US")
    @Test
    public void test_changeDefault_Locale_DateInstance() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqua98183d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqua98183d(){try{__CLR4_5_2182g182glvha7is5.R.inc(57145);
        __CLR4_5_2182g182glvha7is5.R.inc(57146);final FastDateFormat format1 = FastDateFormat.getDateInstance(FastDateFormat.FULL, Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57147);final FastDateFormat format2 = FastDateFormat.getDateInstance(FastDateFormat.FULL);
        __CLR4_5_2182g182glvha7is5.R.inc(57148);Locale.setDefault(Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57149);final FastDateFormat format3 = FastDateFormat.getDateInstance(FastDateFormat.FULL);

        __CLR4_5_2182g182glvha7is5.R.inc(57150);assertSame(Locale.GERMANY, format1.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57151);assertEquals(Locale.US, format2.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57152);assertSame(Locale.GERMANY, format3.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57153);assertNotSame(format1, format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57154);assertNotSame(format2, format3);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @SystemDefaults(locale="en_US")
    @Test
    public void test_changeDefault_Locale_DateTimeInstance() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6uuxr183n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6uuxr183n(){try{__CLR4_5_2182g182glvha7is5.R.inc(57155);
        __CLR4_5_2182g182glvha7is5.R.inc(57156);final FastDateFormat format1 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57157);final FastDateFormat format2 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL);
        __CLR4_5_2182g182glvha7is5.R.inc(57158);Locale.setDefault(Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57159);final FastDateFormat format3 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL);

        __CLR4_5_2182g182glvha7is5.R.inc(57160);assertSame(Locale.GERMANY, format1.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57161);assertEquals(Locale.US, format2.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57162);assertSame(Locale.GERMANY, format3.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57163);assertNotSame(format1, format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57164);assertNotSame(format2, format3);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @SystemDefaults(locale="en_US", timezone="America/New_York")
    @Test
    public void test_getInstance_String_TimeZone_Locale() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vuwleu183x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vuwleu183x(){try{__CLR4_5_2182g182glvha7is5.R.inc(57165);
        __CLR4_5_2182g182glvha7is5.R.inc(57166);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy",
                TimeZone.getTimeZone("Atlantic/Reykjavik"), Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57167);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);
        __CLR4_5_2182g182glvha7is5.R.inc(57168);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy",
                TimeZone.getDefault(), Locale.GERMANY);

        __CLR4_5_2182g182glvha7is5.R.inc(57169);assertNotSame(format1, format2);
        __CLR4_5_2182g182glvha7is5.R.inc(57170);assertEquals(TimeZone.getTimeZone("Atlantic/Reykjavik"), format1.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57171);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57172);assertEquals(TimeZone.getDefault(), format3.getTimeZone());
        __CLR4_5_2182g182glvha7is5.R.inc(57173);assertEquals(Locale.GERMANY, format1.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57174);assertEquals(Locale.GERMANY, format2.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57175);assertEquals(Locale.GERMANY, format3.getLocale());
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testCheckDefaults() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kzd60h1848();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testCheckDefaults",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57176,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kzd60h1848(){try{__CLR4_5_2182g182glvha7is5.R.inc(57176);
        __CLR4_5_2182g182glvha7is5.R.inc(57177);final FastDateFormat format = FastDateFormat.getInstance();
        __CLR4_5_2182g182glvha7is5.R.inc(57178);final FastDateFormat medium = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        __CLR4_5_2182g182glvha7is5.R.inc(57179);assertEquals(medium, format);
        
        __CLR4_5_2182g182glvha7is5.R.inc(57180);final SimpleDateFormat sdf = new SimpleDateFormat();
        __CLR4_5_2182g182glvha7is5.R.inc(57181);assertEquals(sdf.toPattern(), format.getPattern());
        
        __CLR4_5_2182g182glvha7is5.R.inc(57182);assertEquals(Locale.getDefault(), format.getLocale());
        __CLR4_5_2182g182glvha7is5.R.inc(57183);assertEquals(TimeZone.getDefault(), format.getTimeZone());
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testCheckDifferingStyles() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u9kosd184g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testCheckDifferingStyles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u9kosd184g(){try{__CLR4_5_2182g182glvha7is5.R.inc(57184);
        __CLR4_5_2182g182glvha7is5.R.inc(57185);final FastDateFormat shortShort = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US);
        __CLR4_5_2182g182glvha7is5.R.inc(57186);final FastDateFormat shortLong = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.LONG, Locale.US);
        __CLR4_5_2182g182glvha7is5.R.inc(57187);final FastDateFormat longShort = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.SHORT, Locale.US);
        __CLR4_5_2182g182glvha7is5.R.inc(57188);final FastDateFormat longLong = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, Locale.US);
        
        __CLR4_5_2182g182glvha7is5.R.inc(57189);assertFalse(shortShort.equals(shortLong));
        __CLR4_5_2182g182glvha7is5.R.inc(57190);assertFalse(shortShort.equals(longShort));
        __CLR4_5_2182g182glvha7is5.R.inc(57191);assertFalse(shortShort.equals(longLong));
        __CLR4_5_2182g182glvha7is5.R.inc(57192);assertFalse(shortLong.equals(longShort));
        __CLR4_5_2182g182glvha7is5.R.inc(57193);assertFalse(shortLong.equals(longLong));
        __CLR4_5_2182g182glvha7is5.R.inc(57194);assertFalse(longShort.equals(longLong));
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testDateDefaults() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wp5rkp184r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testDateDefaults",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wp5rkp184r(){try{__CLR4_5_2182g182glvha7is5.R.inc(57195);
        __CLR4_5_2182g182glvha7is5.R.inc(57196);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.CANADA), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA));
        
        __CLR4_5_2182g182glvha7is5.R.inc(57197);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_5_2182g182glvha7is5.R.inc(57198);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testTimeDefaults() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_244qioo184v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testTimeDefaults",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_244qioo184v(){try{__CLR4_5_2182g182glvha7is5.R.inc(57199);
        __CLR4_5_2182g182glvha7is5.R.inc(57200);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.CANADA),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA));

        __CLR4_5_2182g182glvha7is5.R.inc(57201);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_5_2182g182glvha7is5.R.inc(57202);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testTimeDateDefaults() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p1z2cm184z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testTimeDateDefaults",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p1z2cm184z(){try{__CLR4_5_2182g182glvha7is5.R.inc(57203);
        __CLR4_5_2182g182glvha7is5.R.inc(57204);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, Locale.CANADA),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.CANADA));

        __CLR4_5_2182g182glvha7is5.R.inc(57205);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York")),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_5_2182g182glvha7is5.R.inc(57206);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testParseSync() throws InterruptedException {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mbcla51853();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testParseSync",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mbcla51853() throws InterruptedException{try{__CLR4_5_2182g182glvha7is5.R.inc(57207);
        __CLR4_5_2182g182glvha7is5.R.inc(57208);final String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        __CLR4_5_2182g182glvha7is5.R.inc(57209);final SimpleDateFormat inner = new SimpleDateFormat(pattern);
        __CLR4_5_2182g182glvha7is5.R.inc(57210);final Format sdf= new Format() {
            private static final long serialVersionUID = 1L;

            @Override
            public StringBuffer format(final Object obj,
                    final StringBuffer toAppendTo,
                    final FieldPosition fieldPosition) {try{__CLR4_5_2182g182glvha7is5.R.inc(57211);
                __CLR4_5_2182g182glvha7is5.R.inc(57212);synchronized(this) {
                    __CLR4_5_2182g182glvha7is5.R.inc(57213);return inner.format(obj, toAppendTo, fieldPosition);
                }
            }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

            @Override
            public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_2182g182glvha7is5.R.inc(57214);
                __CLR4_5_2182g182glvha7is5.R.inc(57215);synchronized(this) {
                    __CLR4_5_2182g182glvha7is5.R.inc(57216);return inner.parseObject(source, pos);
                }
            }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}
        };
        __CLR4_5_2182g182glvha7is5.R.inc(57217);final AtomicLongArray sdfTime= measureTime(sdf, sdf);

        __CLR4_5_2182g182glvha7is5.R.inc(57218);final Format fdf = FastDateFormat.getInstance(pattern);
        __CLR4_5_2182g182glvha7is5.R.inc(57219);final AtomicLongArray fdfTime= measureTime(fdf, fdf);

        __CLR4_5_2182g182glvha7is5.R.inc(57220);System.out.println(">>FastDateFormatTest: FastDatePrinter:"+fdfTime.get(0)+"  SimpleDateFormat:"+sdfTime.get(0));
        __CLR4_5_2182g182glvha7is5.R.inc(57221);System.out.println(">>FastDateFormatTest: FastDateParser:"+fdfTime.get(1)+"  SimpleDateFormat:"+sdfTime.get(1));
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    final static private int NTHREADS= 10;
    final static private int NROUNDS= 10000;
    
    private AtomicLongArray measureTime(final Format printer, final Format parser) throws InterruptedException {try{__CLR4_5_2182g182glvha7is5.R.inc(57222);
        __CLR4_5_2182g182glvha7is5.R.inc(57223);final ExecutorService pool = Executors.newFixedThreadPool(NTHREADS);
        __CLR4_5_2182g182glvha7is5.R.inc(57224);final AtomicInteger failures= new AtomicInteger(0);
        __CLR4_5_2182g182glvha7is5.R.inc(57225);final AtomicLongArray totalElapsed= new AtomicLongArray(2);

        __CLR4_5_2182g182glvha7is5.R.inc(57226);for(int i= 0; (((i<NTHREADS)&&(__CLR4_5_2182g182glvha7is5.R.iget(57227)!=0|true))||(__CLR4_5_2182g182glvha7is5.R.iget(57228)==0&false)); ++i) {{
            __CLR4_5_2182g182glvha7is5.R.inc(57229);pool.submit(new Runnable() {
                @Override
                public void run() {try{__CLR4_5_2182g182glvha7is5.R.inc(57230);
                    __CLR4_5_2182g182glvha7is5.R.inc(57231);for(int j= 0; (((j<NROUNDS)&&(__CLR4_5_2182g182glvha7is5.R.iget(57232)!=0|true))||(__CLR4_5_2182g182glvha7is5.R.iget(57233)==0&false)); ++j) {{
                        __CLR4_5_2182g182glvha7is5.R.inc(57234);try {
                            __CLR4_5_2182g182glvha7is5.R.inc(57235);final Date date= new Date();

                            __CLR4_5_2182g182glvha7is5.R.inc(57236);final long t0= System.currentTimeMillis();
                            __CLR4_5_2182g182glvha7is5.R.inc(57237);final String formattedDate= printer.format(date);
                            __CLR4_5_2182g182glvha7is5.R.inc(57238);totalElapsed.addAndGet(0, System.currentTimeMillis() - t0);

                            __CLR4_5_2182g182glvha7is5.R.inc(57239);final long t1 = System.currentTimeMillis();
                            __CLR4_5_2182g182glvha7is5.R.inc(57240);final Object pd= parser.parseObject(formattedDate);
                            __CLR4_5_2182g182glvha7is5.R.inc(57241);totalElapsed.addAndGet(1, System.currentTimeMillis() - t1);

                            __CLR4_5_2182g182glvha7is5.R.inc(57242);if((((!date.equals(pd))&&(__CLR4_5_2182g182glvha7is5.R.iget(57243)!=0|true))||(__CLR4_5_2182g182glvha7is5.R.iget(57244)==0&false))) {{
                                __CLR4_5_2182g182glvha7is5.R.inc(57245);failures.incrementAndGet();
                            }
                        }} catch (final Exception e) {
                            __CLR4_5_2182g182glvha7is5.R.inc(57246);failures.incrementAndGet();
                            __CLR4_5_2182g182glvha7is5.R.inc(57247);e.printStackTrace();
                        }
                    }
                }}finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}
            });
        }
        }__CLR4_5_2182g182glvha7is5.R.inc(57248);pool.shutdown();
        // depending on the performance of the machine used to run the parsing,
        // the tests can run for a while. It should however complete within
        // 30 seconds. Might need increase on very slow machines.
        __CLR4_5_2182g182glvha7is5.R.inc(57249);if((((!pool.awaitTermination(30, TimeUnit.SECONDS))&&(__CLR4_5_2182g182glvha7is5.R.iget(57250)!=0|true))||(__CLR4_5_2182g182glvha7is5.R.iget(57251)==0&false))) {{
            __CLR4_5_2182g182glvha7is5.R.inc(57252);pool.shutdownNow();
            __CLR4_5_2182g182glvha7is5.R.inc(57253);fail("did not complete tasks");
        }
        }__CLR4_5_2182g182glvha7is5.R.inc(57254);assertEquals(0, failures.get());
        __CLR4_5_2182g182glvha7is5.R.inc(57255);return totalElapsed;
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    /**
     * According to LANG-954 (https://issues.apache.org/jira/browse/LANG-954) this is broken in Android 2.1.
     */
    @Test
    public void testLANG_954() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jksr5s186g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testLANG_954",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jksr5s186g(){try{__CLR4_5_2182g182glvha7is5.R.inc(57256);
        __CLR4_5_2182g182glvha7is5.R.inc(57257);final String pattern = "yyyy-MM-dd'T'";
        __CLR4_5_2182g182glvha7is5.R.inc(57258);FastDateFormat.getInstance(pattern);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testLANG_1152() {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23kdsrn186j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testLANG_1152",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23kdsrn186j(){try{__CLR4_5_2182g182glvha7is5.R.inc(57259);
        __CLR4_5_2182g182glvha7is5.R.inc(57260);final TimeZone utc = TimeZone.getTimeZone("UTC");
        __CLR4_5_2182g182glvha7is5.R.inc(57261);final Date date = new Date(Long.MAX_VALUE);

        __CLR4_5_2182g182glvha7is5.R.inc(57262);String dateAsString = FastDateFormat.getInstance("yyyy-MM-dd", utc, Locale.US).format(date);
        __CLR4_5_2182g182glvha7is5.R.inc(57263);Assert.assertEquals("292278994-08-17", dateAsString);

        __CLR4_5_2182g182glvha7is5.R.inc(57264);dateAsString = FastDateFormat.getInstance("dd/MM/yyyy", utc, Locale.US).format(date);
        __CLR4_5_2182g182glvha7is5.R.inc(57265);Assert.assertEquals("17/08/292278994", dateAsString);
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}

    @Test
    public void testLANG_1267() throws Exception {__CLR4_5_2182g182glvha7is5.R.globalSliceStart(getClass().getName(),57266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nmq7ko186q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2182g182glvha7is5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2182g182glvha7is5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testLANG_1267",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57266,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nmq7ko186q() throws Exception{try{__CLR4_5_2182g182glvha7is5.R.inc(57266);
        __CLR4_5_2182g182glvha7is5.R.inc(57267);FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
    }finally{__CLR4_5_2182g182glvha7is5.R.flushNeeded();}}
}
