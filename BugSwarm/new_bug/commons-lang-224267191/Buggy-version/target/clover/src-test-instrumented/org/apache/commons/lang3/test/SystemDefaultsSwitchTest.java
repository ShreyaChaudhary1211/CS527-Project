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
package org.apache.commons.lang3.test;

import static org.junit.Assert.assertEquals;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class SystemDefaultsSwitchTest {static class __CLR4_5_213hi13hilvha7ic1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Locale TEST_DEFAULT_LOCALE;
    private static Locale DEFAULT_LOCALE_BEFORE_TEST;

    private static TimeZone DEFAULT_TIMEZONE_BEFORE_TEST;
    private static TimeZone TEST_DEFAULT_TIMEZONE;

    @BeforeClass
    public static void classSetUp() {try{__CLR4_5_213hi13hilvha7ic1.R.inc(51174);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51175);DEFAULT_LOCALE_BEFORE_TEST = Locale.getDefault();
        __CLR4_5_213hi13hilvha7ic1.R.inc(51176);if ((((!DEFAULT_LOCALE_BEFORE_TEST.equals(Locale.CANADA))&&(__CLR4_5_213hi13hilvha7ic1.R.iget(51177)!=0|true))||(__CLR4_5_213hi13hilvha7ic1.R.iget(51178)==0&false))) {{
            __CLR4_5_213hi13hilvha7ic1.R.inc(51179);Locale.setDefault(Locale.CANADA);
        } }else {{
            // you seem to be from Canada...
            __CLR4_5_213hi13hilvha7ic1.R.inc(51180);Locale.setDefault(Locale.CHINESE);
        }
        }__CLR4_5_213hi13hilvha7ic1.R.inc(51181);TEST_DEFAULT_LOCALE = Locale.getDefault();

        __CLR4_5_213hi13hilvha7ic1.R.inc(51182);DEFAULT_TIMEZONE_BEFORE_TEST = TimeZone.getDefault();
        __CLR4_5_213hi13hilvha7ic1.R.inc(51183);final TimeZone utc = TimeZone.getTimeZone("UTC");
        __CLR4_5_213hi13hilvha7ic1.R.inc(51184);if ((((!DEFAULT_TIMEZONE_BEFORE_TEST.equals(utc))&&(__CLR4_5_213hi13hilvha7ic1.R.iget(51185)!=0|true))||(__CLR4_5_213hi13hilvha7ic1.R.iget(51186)==0&false))) {{
            __CLR4_5_213hi13hilvha7ic1.R.inc(51187);TimeZone.setDefault(utc);
        } }else {{
            __CLR4_5_213hi13hilvha7ic1.R.inc(51188);TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        }
        }__CLR4_5_213hi13hilvha7ic1.R.inc(51189);TEST_DEFAULT_TIMEZONE = TimeZone.getDefault();
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}

    @Rule
    public SystemDefaultsSwitch defaultsSwitch = new SystemDefaultsSwitch();

    @Test
    public void testDefaultLocaleNoAnnotation() throws Exception {__CLR4_5_213hi13hilvha7ic1.R.globalSliceStart(getClass().getName(),51190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0a7mo13hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213hi13hilvha7ic1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213hi13hilvha7ic1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testDefaultLocaleNoAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0a7mo13hy() throws Exception{try{__CLR4_5_213hi13hilvha7ic1.R.inc(51190);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51191);assertEquals(TEST_DEFAULT_LOCALE, Locale.getDefault());
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}

    @Test
    @SystemDefaults(locale = "en_EN")
    public void testUseDifferentLocale() throws Exception {__CLR4_5_213hi13hilvha7ic1.R.globalSliceStart(getClass().getName(),51192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkybs513i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213hi13hilvha7ic1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213hi13hilvha7ic1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testUseDifferentLocale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkybs513i0() throws Exception{try{__CLR4_5_213hi13hilvha7ic1.R.inc(51192);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51193);assertEquals(new Locale("en", "EN"), Locale.getDefault());
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}

    @Test
    public void testDefaultTimeZoneNoAnnotation() throws Exception {__CLR4_5_213hi13hilvha7ic1.R.globalSliceStart(getClass().getName(),51194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ks5bjz13i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213hi13hilvha7ic1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213hi13hilvha7ic1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testDefaultTimeZoneNoAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ks5bjz13i2() throws Exception{try{__CLR4_5_213hi13hilvha7ic1.R.inc(51194);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51195);assertEquals(TEST_DEFAULT_TIMEZONE, TimeZone.getDefault());
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}

    @Test
    @SystemDefaults(timezone = "CET")
    public void testUseDifferentTimeZone() throws Exception {__CLR4_5_213hi13hilvha7ic1.R.globalSliceStart(getClass().getName(),51196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29mstfo13i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213hi13hilvha7ic1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213hi13hilvha7ic1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.test.SystemDefaultsSwitchTest.testUseDifferentTimeZone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29mstfo13i4() throws Exception{try{__CLR4_5_213hi13hilvha7ic1.R.inc(51196);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51197);assertEquals(TimeZone.getTimeZone("CET"), TimeZone.getDefault());
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}

    @AfterClass
    public static void classTearDown() {try{__CLR4_5_213hi13hilvha7ic1.R.inc(51198);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51199);Locale.setDefault(DEFAULT_LOCALE_BEFORE_TEST);
        __CLR4_5_213hi13hilvha7ic1.R.inc(51200);TimeZone.setDefault(DEFAULT_TIMEZONE_BEFORE_TEST);
    }finally{__CLR4_5_213hi13hilvha7ic1.R.flushNeeded();}}
}
