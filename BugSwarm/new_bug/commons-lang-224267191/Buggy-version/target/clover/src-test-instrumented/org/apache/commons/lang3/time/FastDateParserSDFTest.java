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
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Compare FastDateParser with SimpleDateFormat 
 */
@RunWith(Parameterized.class)
public class FastDateParserSDFTest {static class __CLR4_5_2186w186wlvha7isp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,57361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    @Parameters(name= "{index}: {0} {1} {2}")
    public static Collection<Object[]> data() {try{__CLR4_5_2186w186wlvha7isp.R.inc(57272);
        __CLR4_5_2186w186wlvha7isp.R.inc(57273);return Arrays.asList(new Object [][]{
                // General Time zone tests
                {"z yyyy", "GMT 2010",       Locale.UK, true}, // no offset specified, but this is allowed as a TimeZone name
                {"z yyyy", "GMT-123 2010",   Locale.UK, false},
                {"z yyyy", "GMT-1234 2010",  Locale.UK, false},
                {"z yyyy", "GMT-12:34 2010", Locale.UK, true},
                {"z yyyy", "GMT-1:23 2010",  Locale.UK, true},
                // RFC 822 tests
                {"z yyyy", "-1234 2010",     Locale.UK, true},
                {"z yyyy", "-12:34 2010",    Locale.UK, false},
                {"z yyyy", "-123 2010",      Locale.UK, false},
                // year tests
                { "MM/dd/yyyy", "01/11/12",  Locale.UK, true},
                { "MM/dd/yy", "01/11/12",    Locale.UK, true},

                // LANG-1089
                { "HH", "00",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "00",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "00",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "00",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "01",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "01",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "01",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "01",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "11",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "11",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "11",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "11",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "12",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "12",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "12",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "12",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "13",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "13",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "13",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "13",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "23",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "23",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "23",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "23",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "24",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "24",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "24",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "24",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "25",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "25",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "25",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "25",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0

                { "HH", "48",    Locale.UK, true}, // Hour in day (0-23)
                { "KK", "48",    Locale.UK, true}, // Hour in am/pm (0-11)
                { "hh", "48",    Locale.UK, true}, // Hour in am/pm (1-12), i.e. midday/midnight is 12, not 0
                { "kk", "48",    Locale.UK, true}, // Hour in day (1-24), i.e. midnight is 24, not 0
                });
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    private final String format;
    private final String input;
    private final Locale locale;
    private final boolean valid;
    private final TimeZone timeZone = TimeZone.getDefault();

    public FastDateParserSDFTest(final String format, final String input, final Locale locale, final boolean valid) {try{__CLR4_5_2186w186wlvha7isp.R.inc(57274);
        __CLR4_5_2186w186wlvha7isp.R.inc(57275);this.format = format;
        __CLR4_5_2186w186wlvha7isp.R.inc(57276);this.input = input;
        __CLR4_5_2186w186wlvha7isp.R.inc(57277);this.locale = locale;
        __CLR4_5_2186w186wlvha7isp.R.inc(57278);this.valid = valid;
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testOriginal() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_237wryu1873();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testOriginal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_237wryu1873() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57279);
        __CLR4_5_2186w186wlvha7isp.R.inc(57280);checkParse(input);
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testOriginalPP() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pio9cm1875();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testOriginalPP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pio9cm1875() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57281);
        __CLR4_5_2186w186wlvha7isp.R.inc(57282);checkParsePosition(input);
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testUpperCase() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29u3xzb1877();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testUpperCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29u3xzb1877() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57283);
        __CLR4_5_2186w186wlvha7isp.R.inc(57284);checkParse(input.toUpperCase(locale));
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testUpperCasePP() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyqrbb1879();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testUpperCasePP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyqrbb1879() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57285);
        __CLR4_5_2186w186wlvha7isp.R.inc(57286);checkParsePosition(input.toUpperCase(locale));
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testLowerCase() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dxz9om187b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testLowerCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57287,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dxz9om187b() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57287);
        __CLR4_5_2186w186wlvha7isp.R.inc(57288);checkParse(input.toLowerCase(locale));
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    @Test
    public void testLowerCasePP() throws Exception {__CLR4_5_2186w186wlvha7isp.R.globalSliceStart(getClass().getName(),57289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agcwsa187d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2186w186wlvha7isp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2186w186wlvha7isp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserSDFTest.testLowerCasePP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agcwsa187d() throws Exception{try{__CLR4_5_2186w186wlvha7isp.R.inc(57289);
        __CLR4_5_2186w186wlvha7isp.R.inc(57290);checkParsePosition(input.toLowerCase(locale));
    }finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}

    private void checkParse(final String formattedDate) {try{__CLR4_5_2186w186wlvha7isp.R.inc(57291);
        __CLR4_5_2186w186wlvha7isp.R.inc(57292);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        __CLR4_5_2186w186wlvha7isp.R.inc(57293);sdf.setTimeZone(timeZone);
        __CLR4_5_2186w186wlvha7isp.R.inc(57294);final DateParser fdf = new FastDateParser(format, timeZone, locale);
        __CLR4_5_2186w186wlvha7isp.R.inc(57295);Date expectedTime=null;
        __CLR4_5_2186w186wlvha7isp.R.inc(57296);Class<?> sdfE = null;
        __CLR4_5_2186w186wlvha7isp.R.inc(57297);try {
            __CLR4_5_2186w186wlvha7isp.R.inc(57298);expectedTime = sdf.parse(formattedDate);
            __CLR4_5_2186w186wlvha7isp.R.inc(57299);if ((((!valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57300)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57301)==0&false))) {{
                // Error in test data
                __CLR4_5_2186w186wlvha7isp.R.inc(57302);throw new RuntimeException("Test data error: expected SDF parse to fail, but got " + expectedTime);
            }
        }} catch (final ParseException e) {
            __CLR4_5_2186w186wlvha7isp.R.inc(57303);if ((((valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57304)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57305)==0&false))) {{
                // Error in test data
                __CLR4_5_2186w186wlvha7isp.R.inc(57306);throw new RuntimeException("Test data error: expected SDF parse to succeed, but got " + e);
            }
            }__CLR4_5_2186w186wlvha7isp.R.inc(57307);sdfE = e.getClass();
        }
        __CLR4_5_2186w186wlvha7isp.R.inc(57308);Date actualTime = null;
        __CLR4_5_2186w186wlvha7isp.R.inc(57309);Class<?> fdfE = null;
        __CLR4_5_2186w186wlvha7isp.R.inc(57310);try {
            __CLR4_5_2186w186wlvha7isp.R.inc(57311);actualTime = fdf.parse(formattedDate);
            __CLR4_5_2186w186wlvha7isp.R.inc(57312);if ((((!valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57313)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57314)==0&false))) {{
                // failure in test
                __CLR4_5_2186w186wlvha7isp.R.inc(57315);fail("Expected FDP parse to fail, but got " + actualTime);
            }
        }} catch (final ParseException e) {
            __CLR4_5_2186w186wlvha7isp.R.inc(57316);if ((((valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57317)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57318)==0&false))) {{
                // failure in test
                __CLR4_5_2186w186wlvha7isp.R.inc(57319);fail("Expected FDP parse to succeed, but got " + e);
            }
            }__CLR4_5_2186w186wlvha7isp.R.inc(57320);fdfE = e.getClass();
        }
        __CLR4_5_2186w186wlvha7isp.R.inc(57321);if ((((valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57322)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57323)==0&false))) {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57324);assertEquals(locale.toString()+" "+formattedDate +"\n",expectedTime, actualTime);            
        } }else {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57325);assertEquals(locale.toString()+" "+formattedDate + " expected same Exception ", sdfE, fdfE);            
        }
    }}finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}
    private void checkParsePosition(final String formattedDate) {try{__CLR4_5_2186w186wlvha7isp.R.inc(57326);
        __CLR4_5_2186w186wlvha7isp.R.inc(57327);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        __CLR4_5_2186w186wlvha7isp.R.inc(57328);sdf.setTimeZone(timeZone);
        __CLR4_5_2186w186wlvha7isp.R.inc(57329);final DateParser fdf = new FastDateParser(format, timeZone, locale);

        __CLR4_5_2186w186wlvha7isp.R.inc(57330);final ParsePosition sdfP = new ParsePosition(0);
        __CLR4_5_2186w186wlvha7isp.R.inc(57331);final Date expectedTime = sdf.parse(formattedDate, sdfP);
        __CLR4_5_2186w186wlvha7isp.R.inc(57332);final int sdferrorIndex = sdfP.getErrorIndex();
        __CLR4_5_2186w186wlvha7isp.R.inc(57333);if ((((valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57334)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57335)==0&false))) {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57336);assertEquals("Expected SDF error index -1 ", -1, sdferrorIndex);
            __CLR4_5_2186w186wlvha7isp.R.inc(57337);final int endIndex = sdfP.getIndex();
            __CLR4_5_2186w186wlvha7isp.R.inc(57338);final int length = formattedDate.length();
            __CLR4_5_2186w186wlvha7isp.R.inc(57339);if ((((endIndex != length)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57340)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57341)==0&false))) {{
                // Error in test data
                __CLR4_5_2186w186wlvha7isp.R.inc(57342);throw new RuntimeException("Test data error: expected SDF parse to consume entire string; endindex " + endIndex + " != " + length);                
            }
        }} }else {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57343);final int errorIndex = sdfP.getErrorIndex();
            __CLR4_5_2186w186wlvha7isp.R.inc(57344);if ((((errorIndex == -1)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57345)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57346)==0&false))) {{
                __CLR4_5_2186w186wlvha7isp.R.inc(57347);throw new RuntimeException("Test data error: expected SDF parse to fail, but got " + expectedTime);                
            }
        }}

        }__CLR4_5_2186w186wlvha7isp.R.inc(57348);final ParsePosition fdfP = new ParsePosition(0);
        __CLR4_5_2186w186wlvha7isp.R.inc(57349);final Date actualTime = fdf.parse(formattedDate, fdfP);
        __CLR4_5_2186w186wlvha7isp.R.inc(57350);final int fdferrorIndex = fdfP.getErrorIndex();
        __CLR4_5_2186w186wlvha7isp.R.inc(57351);if ((((valid)&&(__CLR4_5_2186w186wlvha7isp.R.iget(57352)!=0|true))||(__CLR4_5_2186w186wlvha7isp.R.iget(57353)==0&false))) {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57354);assertEquals("Expected FDF error index -1 ", -1, fdferrorIndex);
            __CLR4_5_2186w186wlvha7isp.R.inc(57355);final int endIndex = fdfP.getIndex();
            __CLR4_5_2186w186wlvha7isp.R.inc(57356);final int length = formattedDate.length();
            __CLR4_5_2186w186wlvha7isp.R.inc(57357);assertEquals("Expected FDF to parse full string " + fdfP, length, endIndex);
            __CLR4_5_2186w186wlvha7isp.R.inc(57358);assertEquals(locale.toString()+" "+formattedDate +"\n", expectedTime, actualTime);
        } }else {{
            __CLR4_5_2186w186wlvha7isp.R.inc(57359);assertNotEquals("Test data error: expected FDF parse to fail, but got " + actualTime, -1, fdferrorIndex);
            __CLR4_5_2186w186wlvha7isp.R.inc(57360);assertTrue("FDF error index ("+ fdferrorIndex + ") should approximate SDF index (" + sdferrorIndex + ")",
                    sdferrorIndex - fdferrorIndex <= 4);
        }        
    }}finally{__CLR4_5_2186w186wlvha7isp.R.flushNeeded();}}
}
