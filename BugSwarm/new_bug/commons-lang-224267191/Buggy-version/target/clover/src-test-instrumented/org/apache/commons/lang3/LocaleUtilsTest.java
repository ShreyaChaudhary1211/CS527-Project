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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link LocaleUtils}.
 */
public class LocaleUtilsTest  {static class __CLR4_5_2p3hp3hlvha7fvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,32803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_ZZZZ = new Locale("en", "US", "ZZZZ");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ"); 

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32525);
        // Testing #LANG-304. Must be called before availableLocaleSet is called.
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32526);LocaleUtils.isAvailableLocale(Locale.getDefault());
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test that constructors are public, and work, etc.
     */
    @Test
    public void testConstructor() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hp3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hp3j(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32527);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32528);assertNotNull(new LocaleUtils());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32529);final Constructor<?>[] cons = LocaleUtils.class.getDeclaredConstructors();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32530);assertEquals(1, cons.length);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32531);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32532);assertTrue(Modifier.isPublic(LocaleUtils.class.getModifiers()));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32533);assertFalse(Modifier.isFinal(LocaleUtils.class.getModifiers()));
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Pass in a valid language, test toLocale.
     *
     * @param language  the language string
     */
    private static void assertValidToLocale(final String language) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32534);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32535);final Locale locale = LocaleUtils.toLocale(language);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32536);assertNotNull("valid locale", locale);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32537);assertEquals(language, locale.getLanguage());
        //country and variant are empty
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32538);assertTrue(locale.getCountry() == null || locale.getCountry().isEmpty());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32539);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     */
    private static void assertValidToLocale(final String localeString, final String language, final String country) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32540);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32541);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32542);assertNotNull("valid locale", locale);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32543);assertEquals(language, locale.getLanguage());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32544);assertEquals(country, locale.getCountry());
        //variant is empty
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32545);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     * @param variant of the resulting Locale
     */
    private static void assertValidToLocale(
            final String localeString, final String language, 
            final String country, final String variant) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32546);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32547);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32548);assertNotNull("valid locale", locale);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32549);assertEquals(language, locale.getLanguage());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32550);assertEquals(country, locale.getCountry());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32551);assertEquals(variant, locale.getVariant());
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_1Part() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bnlwzp48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bnlwzp48(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32552);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32553);assertNull(LocaleUtils.toLocale(null));
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32554);assertValidToLocale("us");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32555);assertValidToLocale("fr");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32556);assertValidToLocale("de");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32557);assertValidToLocale("zh");
        // Valid format but lang doesn't exist, should make instance anyway
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32558);assertValidToLocale("qq");
        // LANG-941: JDK 8 introduced the empty locale as one of the default locales
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32559);assertValidToLocale("");

        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32560);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32561);LocaleUtils.toLocale("Us");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32562);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32563);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32564);LocaleUtils.toLocale("US");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32565);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32566);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32567);LocaleUtils.toLocale("uS");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32568);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32569);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32570);LocaleUtils.toLocale("u#");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32571);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32572);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32573);LocaleUtils.toLocale("u");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32574);fail("Must be 2 chars if less than 5");
        } catch (final IllegalArgumentException iae) {}

        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32575);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32576);LocaleUtils.toLocale("uu_U");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32577);fail("Must be 2 chars if less than 5");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}        

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_2Part() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28onhg4p4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28onhg4p4y(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32578);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32579);assertValidToLocale("us_EN", "us", "EN");
        //valid though doesn't exist
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32580);assertValidToLocale("us_ZH", "us", "ZH");
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32581);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32582);LocaleUtils.toLocale("us-EN");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32583);fail("Should fail as not underscore");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32584);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32585);LocaleUtils.toLocale("us_En");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32586);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32587);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32588);LocaleUtils.toLocale("us_en");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32589);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32590);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32591);LocaleUtils.toLocale("us_eN");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32592);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32593);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32594);LocaleUtils.toLocale("uS_EN");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32595);fail("Should fail first part not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32596);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32597);LocaleUtils.toLocale("us_E3");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32598);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}        

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_3Part() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h1ncz9p5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h1ncz9p5j(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32599);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32600);assertValidToLocale("us_EN_A", "us", "EN", "A");
        // this isn't pretty, but was caused by a jdk bug it seems
        // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4210525
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32601);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32602)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32603)==0&false))) {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32604);assertValidToLocale("us_EN_a", "us", "EN", "a");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32605);assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFsafdFDsdfF");
        } }else {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32606);assertValidToLocale("us_EN_a", "us", "EN", "A");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32607);assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFSAFDFDSDFF");
        }
        
        }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32608);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32609);LocaleUtils.toLocale("us_EN-a");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32610);fail("Should fail as not underscore");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32611);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32612);LocaleUtils.toLocale("uu_UU_");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32613);fail("Must be 3, 5 or 7+ in length");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Helper method for local lookups.
     *
     * @param locale  the input locale
     * @param defaultLocale  the input default locale
     * @param expected  expected results
     */
    private static void assertLocaleLookupList(final Locale locale, final Locale defaultLocale, final Locale[] expected) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32614);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32615);final List<Locale> localeList = (((defaultLocale == null )&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32616)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32617)==0&false))?
                LocaleUtils.localeLookupList(locale) :
                LocaleUtils.localeLookupList(locale, defaultLocale);
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32618);assertEquals(expected.length, localeList.size());
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32619);assertEquals(Arrays.asList(expected), localeList);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32620);assertUnmodifiableCollection(localeList);
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test localeLookupList() method.
     */
    @Test
    public void testLocaleLookupList_Locale() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ma3fgp65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_Locale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ma3fgp65(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32621);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32622);assertLocaleLookupList(null, null, new Locale[0]);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32623);assertLocaleLookupList(LOCALE_QQ, null, new Locale[]{LOCALE_QQ});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32624);assertLocaleLookupList(LOCALE_EN, null, new Locale[]{LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32625);assertLocaleLookupList(LOCALE_EN, null, new Locale[]{LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32626);assertLocaleLookupList(LOCALE_EN_US, null,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32627);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, null,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}        

    /**
     * Test localeLookupList() method.
     */
    @Test
    public void testLocaleLookupList_LocaleLocale() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yx057ap6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yx057ap6c(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32628);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32629);assertLocaleLookupList(LOCALE_QQ, LOCALE_QQ, 
                new Locale[]{LOCALE_QQ});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32630);assertLocaleLookupList(LOCALE_EN, LOCALE_EN, 
                new Locale[]{LOCALE_EN});
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32631);assertLocaleLookupList(LOCALE_EN_US, LOCALE_EN_US, 
            new Locale[]{
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32632);assertLocaleLookupList(LOCALE_EN_US, LOCALE_QQ,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32633);assertLocaleLookupList(LOCALE_EN_US, LOCALE_QQ_ZZ,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ_ZZ});
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32634);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, null,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32635);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_EN_US_ZZZZ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32636);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_QQ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32637);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_QQ_ZZ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ_ZZ});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32638);assertLocaleLookupList(LOCALE_FR_CA, LOCALE_EN,
            new Locale[] {
                LOCALE_FR_CA,
                LOCALE_FR,
                LOCALE_EN});
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleList() method.
     */
    @Test
    public void testAvailableLocaleList() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tgyeoap6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tgyeoap6n(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32639);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32640);final List<Locale> list = LocaleUtils.availableLocaleList();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32641);final List<Locale> list2 = LocaleUtils.availableLocaleList();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32642);assertNotNull(list);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32643);assertSame(list, list2);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32644);assertUnmodifiableCollection(list);
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32645);final Locale[] jdkLocaleArray = Locale.getAvailableLocales();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32646);final List<Locale> jdkLocaleList = Arrays.asList(jdkLocaleArray);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32647);assertEquals(jdkLocaleList, list);
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    @Test
    public void testAvailableLocaleSet() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228t83cp6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228t83cp6w(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32648);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32649);final Set<Locale> set = LocaleUtils.availableLocaleSet();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32650);final Set<Locale> set2 = LocaleUtils.availableLocaleSet();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32651);assertNotNull(set);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32652);assertSame(set, set2);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32653);assertUnmodifiableCollection(set);
        
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32654);final Locale[] jdkLocaleArray = Locale.getAvailableLocales();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32655);final List<Locale> jdkLocaleList = Arrays.asList(jdkLocaleArray);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32656);final Set<Locale> jdkLocaleSet = new HashSet<>(jdkLocaleList);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32657);assertEquals(jdkLocaleSet, set);
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    @SuppressWarnings("boxing") // JUnit4 does not support primitive equality testing apart from long
    @Test
    public void testIsAvailableLocale() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n2kwkup76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n2kwkup76(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32658);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32659);final Set<Locale> set = LocaleUtils.availableLocaleSet();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32660);assertEquals(set.contains(LOCALE_EN), LocaleUtils.isAvailableLocale(LOCALE_EN));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32661);assertEquals(set.contains(LOCALE_EN_US), LocaleUtils.isAvailableLocale(LOCALE_EN_US));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32662);assertEquals(set.contains(LOCALE_EN_US_ZZZZ), LocaleUtils.isAvailableLocale(LOCALE_EN_US_ZZZZ));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32663);assertEquals(set.contains(LOCALE_FR), LocaleUtils.isAvailableLocale(LOCALE_FR));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32664);assertEquals(set.contains(LOCALE_FR_CA), LocaleUtils.isAvailableLocale(LOCALE_FR_CA));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32665);assertEquals(set.contains(LOCALE_QQ), LocaleUtils.isAvailableLocale(LOCALE_QQ));
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32666);assertEquals(set.contains(LOCALE_QQ_ZZ), LocaleUtils.isAvailableLocale(LOCALE_QQ_ZZ));
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}
    
    /**
     * Test for 3-chars locale, further details at LANG-915
     * 
     */
    @Test
    public void testThreeCharsLocale() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmmx0yp7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testThreeCharsLocale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmmx0yp7f(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32667);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32668);for (final String str : Arrays.asList("udm", "tet")) {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32669);final Locale locale = LocaleUtils.toLocale(str);
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32670);assertNotNull(locale);
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32671);assertEquals(str, locale.getLanguage());
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32672);assertTrue(StringUtils.isBlank(locale.getCountry()));
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32673);assertEquals(new Locale(str), locale);
        }
    }}finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Make sure the language by country is correct. It checks that 
     * the LocaleUtils.languagesByCountry(country) call contains the 
     * array of languages passed in. It may contain more due to JVM 
     * variations.
     *
     * @param country
     * @param languages array of languages that should be returned
     */
    private static void assertLanguageByCountry(final String country, final String[] languages) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32674);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32675);final List<Locale> list = LocaleUtils.languagesByCountry(country);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32676);final List<Locale> list2 = LocaleUtils.languagesByCountry(country);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32677);assertNotNull(list);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32678);assertSame(list, list2);
        //search through languages
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32679);for (final String language : languages) {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32680);final Iterator<Locale> iterator = list.iterator();
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32681);boolean found = false;
            // see if it was returned by the set
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32682);while ((((iterator.hasNext())&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32683)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32684)==0&false))) {{
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32685);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32686);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32687);assertEquals(country, locale.getCountry());
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32688);if ((((language.equals(locale.getLanguage()))&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32689)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32690)==0&false))) {{
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32691);found = true;
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32692);break;
                }
            }}
            }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32693);if ((((!found)&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32694)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32695)==0&false))) {{
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32696);fail("Could not find language: " + language
                        + " for country: " + country);
            }
        }}
        }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32697);assertUnmodifiableCollection(list);
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Test languagesByCountry() method.
     */
    @Test
    public void testLanguagesByCountry() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q63hulp8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q63hulp8a(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32698);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32699);assertLanguageByCountry(null, new String[0]);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32700);assertLanguageByCountry("GB", new String[]{"en"});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32701);assertLanguageByCountry("ZZ", new String[0]);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32702);assertLanguageByCountry("CH", new String[]{"fr", "de", "it"});
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Make sure the country by language is correct. It checks that 
     * the LocaleUtils.countryByLanguage(language) call contains the 
     * array of countries passed in. It may contain more due to JVM 
     * variations.
     *
     *
     * @param language
     * @param countries array of countries that should be returned
     */
    private static void assertCountriesByLanguage(final String language, final String[] countries) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32703);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32704);final List<Locale> list = LocaleUtils.countriesByLanguage(language);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32705);final List<Locale> list2 = LocaleUtils.countriesByLanguage(language);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32706);assertNotNull(list);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32707);assertSame(list, list2);
        //search through languages
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32708);for (final String country : countries) {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32709);final Iterator<Locale> iterator = list.iterator();
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32710);boolean found = false;
            // see if it was returned by the set
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32711);while ((((iterator.hasNext())&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32712)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32713)==0&false))) {{
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32714);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32715);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32716);assertEquals(language, locale.getLanguage());
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32717);if ((((country.equals(locale.getCountry()))&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32718)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32719)==0&false))) {{
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32720);found = true;
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32721);break;
                }
            }}
            }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32722);if ((((!found)&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32723)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32724)==0&false))) {{
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32725);fail("Could not find language: " + country
                        + " for country: " + language);
            }
        }}
        }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32726);assertUnmodifiableCollection(list);
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Test countriesByLanguage() method.
     */
    @Test
    public void testCountriesByLanguage() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0svrsp93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0svrsp93(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32727);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32728);assertCountriesByLanguage(null, new String[0]);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32729);assertCountriesByLanguage("de", new String[]{"DE", "CH", "AT", "LU"});
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32730);assertCountriesByLanguage("zz", new String[0]);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32731);assertCountriesByLanguage("it", new String[]{"IT", "CH"});
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * @param coll  the collection to check
     */
    private static void assertUnmodifiableCollection(final Collection<?> coll) {try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32732);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32733);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32734);coll.add(null);
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32735);fail();
        } catch (final UnsupportedOperationException ex) {}
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Tests #LANG-328 - only language+variant
     */
    @Test
    public void testLang328() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2amgwp9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLang328",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2amgwp9c(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32736);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32737);assertValidToLocale("fr__P", "fr", "", "P");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32738);assertValidToLocale("fr__POSIX", "fr", "", "POSIX");
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    @Test
    public void testLanguageAndUNM49Numeric3AreaCodeLang1312() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284qjx8p9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLanguageAndUNM49Numeric3AreaCodeLang1312",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284qjx8p9f(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32739);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32740);assertValidToLocale("en_001", "en", "001");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32741);assertValidToLocale("en_150", "en", "150");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32742);assertValidToLocale("ar_001", "ar", "001");

        // LANG-1312
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32743);assertValidToLocale("en_001_GB", "en", "001", "GB");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32744);assertValidToLocale("en_150_US", "en", "150", "US");
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    /**
     * Tests #LANG-865, strings starting with an underscore.
     */
    @Test
    public void testLang865() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjr802p9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLang865",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjr802p9l(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32745);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32746);assertValidToLocale("_GB", "", "GB", "");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32747);assertValidToLocale("_GB_P", "", "GB", "P");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32748);assertValidToLocale("_GB_POSIX", "", "GB", "POSIX");
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32749);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32750);LocaleUtils.toLocale("_G");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32751);fail("Must be at least 3 chars if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32752);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32753);LocaleUtils.toLocale("_Gb");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32754);fail("Must be uppercase if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32755);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32756);LocaleUtils.toLocale("_gB");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32757);fail("Must be uppercase if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32758);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32759);LocaleUtils.toLocale("_1B");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32760);fail("Must be letter if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32761);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32762);LocaleUtils.toLocale("_G1");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32763);fail("Must be letter if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32764);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32765);LocaleUtils.toLocale("_GB_");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32766);fail("Must be at least 5 chars if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32767);try {
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32768);LocaleUtils.toLocale("_GBAP");
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32769);fail("Must have underscore after the country if starts with underscore and is at least 5 chars");
        } catch (final IllegalArgumentException iae) {
        }
    }finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

    @Test
    public void testParseAllLocales() {__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceStart(getClass().getName(),32770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pn5nswpaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p3hp3hlvha7fvn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p3hp3hlvha7fvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testParseAllLocales",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pn5nswpaa(){try{__CLR4_5_2p3hp3hlvha7fvn.R.inc(32770);
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32771);final Locale[] locales = Locale.getAvailableLocales();
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32772);int failures = 0;
        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32773);for (final Locale l : locales) {{
            // Check if it's possible to recreate the Locale using just the standard constructor
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32774);final Locale locale = new Locale(l.getLanguage(), l.getCountry(), l.getVariant());
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32775);if ((((l.equals(locale))&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32776)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32777)==0&false))) {{ // it is possible for LocaleUtils.toLocale to handle these Locales
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32778);String str = l.toString();
                // Look for the script/extension suffix
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32779);int suff = str.indexOf("_#");
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32780);if ((((suff == - 1)&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32781)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32782)==0&false))) {{
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32783);suff = str.indexOf("#");
                }
                }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32784);if ((((suff >= 0)&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32785)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32786)==0&false))) {{ // we have a suffix
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32787);try {
                        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32788);LocaleUtils.toLocale(str); // should cause IAE
                        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32789);System.out.println("Should not have parsed: " + str);
                        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32790);failures++;
                        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32791);continue; // try next Locale
                    } catch (final IllegalArgumentException iae) {
                        // expected; try without suffix
                        __CLR4_5_2p3hp3hlvha7fvn.R.inc(32792);str = str.substring(0, suff);
                    }
                }
                }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32793);final Locale loc = LocaleUtils.toLocale(str);
                __CLR4_5_2p3hp3hlvha7fvn.R.inc(32794);if ((((!l.equals(loc))&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32795)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32796)==0&false))) {{
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32797);System.out.println("Failed to parse: " + str);
                    __CLR4_5_2p3hp3hlvha7fvn.R.inc(32798);failures++;
                }
            }}
        }}
        }__CLR4_5_2p3hp3hlvha7fvn.R.inc(32799);if ((((failures > 0)&&(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32800)!=0|true))||(__CLR4_5_2p3hp3hlvha7fvn.R.iget(32801)==0&false))) {{
            __CLR4_5_2p3hp3hlvha7fvn.R.inc(32802);fail("Failed "+failures+" test(s)");
        }
    }}finally{__CLR4_5_2p3hp3hlvha7fvn.R.flushNeeded();}}

}
