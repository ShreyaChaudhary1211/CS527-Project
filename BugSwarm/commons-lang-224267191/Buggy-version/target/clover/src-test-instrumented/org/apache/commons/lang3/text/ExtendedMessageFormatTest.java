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
package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/**
 * Test case for {@link ExtendedMessageFormat}.
 *
 * @since 2.4
 */
@Deprecated
public class ExtendedMessageFormatTest {static class __CLR4_5_213iw13iwlvha7icl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, FormatFactory> registry = new HashMap<>();

    @Before
    public void setUp() throws Exception {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51224);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51225);registry.put("lower", new LowerCaseFormatFactory());
        __CLR4_5_213iw13iwlvha7icl.R.inc(51226);registry.put("upper", new UpperCaseFormatFactory());
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test extended formats.
     */
    @Test
    public void testExtendedFormats() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgzvvc13iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testExtendedFormats",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgzvvc13iz(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51227);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51228);final String pattern = "Lower: {0,lower} Upper: {1,upper}";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51229);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51230);assertEquals("TOPATTERN", pattern, emf.toPattern());
        __CLR4_5_213iw13iwlvha7icl.R.inc(51231);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"foo", "bar"}));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51232);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"Foo", "Bar"}));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51233);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"FOO", "BAR"}));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51234);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"FOO", "bar"}));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51235);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"foo", "BAR"}));
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test Bug LANG-477 - out of memory error with escaped quote
     */
    @Test
    public void testEscapedQuote_LANG_477() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23dbssi13j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEscapedQuote_LANG_477",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23dbssi13j8(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51236);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51237);final String pattern = "it''s a {0,lower} 'test'!";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51238);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51239);assertEquals("it's a dummy test!", emf.format(new Object[] {"DUMMY"}));
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test Bug LANG-917 - IndexOutOfBoundsException and/or infinite loop when using a choice pattern
     */
    @Test
    public void testEmbeddedPatternInChoice() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g9z5rz13jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEmbeddedPatternInChoice",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g9z5rz13jc(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51240);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51241);final String pattern = "Hi {0,lower}, got {1,choice,0#none|1#one|1<{1,number}}, {2,upper}!";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51242);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51243);assertEquals(emf.format(new Object[] {"there", 3, "great"}), "Hi there, got 3, GREAT!");
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test Bug LANG-948 - Exception while using ExtendedMessageFormat and escaping braces
     */
    @Test
    public void testEscapedBraces_LANG_948() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m9bz313jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEscapedBraces_LANG_948",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m9bz313jg(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51244);
        // message without placeholder because braces are escaped by quotes 
        __CLR4_5_213iw13iwlvha7icl.R.inc(51245);final String pattern = "Message without placeholders '{}'";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51246);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51247);assertEquals("Message without placeholders {}", emf.format(new Object[] {"DUMMY"}));

        // message with placeholder because quotes are escaped by quotes 
        __CLR4_5_213iw13iwlvha7icl.R.inc(51248);final String pattern2 = "Message with placeholder ''{0}''";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51249);final ExtendedMessageFormat emf2 = new ExtendedMessageFormat(pattern2, registry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51250);assertEquals("Message with placeholder 'DUMMY'", emf2.format(new Object[] {"DUMMY"}));
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test extended and built in formats.
     */
    @Test
    public void testExtendedAndBuiltInFormats() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i6x26k13jn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testExtendedAndBuiltInFormats",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i6x26k13jn(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51251);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51252);final Calendar cal = Calendar.getInstance();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51253);cal.set(2007, Calendar.JANUARY, 23, 18, 33, 05);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51254);final Object[] args = new Object[] {"John Doe", cal.getTime(), Double.valueOf("12345.67")};
        __CLR4_5_213iw13iwlvha7icl.R.inc(51255);final String builtinsPattern = "DOB: {1,date,short} Salary: {2,number,currency}";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51256);final String extendedPattern = "Name: {0,upper} ";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51257);final String pattern = extendedPattern + builtinsPattern;

        __CLR4_5_213iw13iwlvha7icl.R.inc(51258);final HashSet<Locale> testLocales = new HashSet<>();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51259);testLocales.addAll(Arrays.asList(DateFormat.getAvailableLocales()));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51260);testLocales.retainAll(Arrays.asList(NumberFormat.getAvailableLocales()));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51261);testLocales.add(null);

        __CLR4_5_213iw13iwlvha7icl.R.inc(51262);for (final Locale locale : testLocales) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51263);final MessageFormat builtins = createMessageFormat(builtinsPattern, locale);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51264);final String expectedPattern = extendedPattern + builtins.toPattern();
            __CLR4_5_213iw13iwlvha7icl.R.inc(51265);DateFormat df = null;
            __CLR4_5_213iw13iwlvha7icl.R.inc(51266);NumberFormat nf = null;
            __CLR4_5_213iw13iwlvha7icl.R.inc(51267);ExtendedMessageFormat emf = null;
            __CLR4_5_213iw13iwlvha7icl.R.inc(51268);if ((((locale == null)&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51269)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51270)==0&false))) {{
                __CLR4_5_213iw13iwlvha7icl.R.inc(51271);df = DateFormat.getDateInstance(DateFormat.SHORT);
                __CLR4_5_213iw13iwlvha7icl.R.inc(51272);nf = NumberFormat.getCurrencyInstance();
                __CLR4_5_213iw13iwlvha7icl.R.inc(51273);emf = new ExtendedMessageFormat(pattern, registry);
            } }else {{
                __CLR4_5_213iw13iwlvha7icl.R.inc(51274);df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
                __CLR4_5_213iw13iwlvha7icl.R.inc(51275);nf = NumberFormat.getCurrencyInstance(locale);
                __CLR4_5_213iw13iwlvha7icl.R.inc(51276);emf = new ExtendedMessageFormat(pattern, locale, registry);
            }
            }__CLR4_5_213iw13iwlvha7icl.R.inc(51277);final StringBuilder expected = new StringBuilder();
            __CLR4_5_213iw13iwlvha7icl.R.inc(51278);expected.append("Name: ");
            __CLR4_5_213iw13iwlvha7icl.R.inc(51279);expected.append(args[0].toString().toUpperCase());
            __CLR4_5_213iw13iwlvha7icl.R.inc(51280);expected.append(" DOB: ");
            __CLR4_5_213iw13iwlvha7icl.R.inc(51281);expected.append(df.format(args[1]));
            __CLR4_5_213iw13iwlvha7icl.R.inc(51282);expected.append(" Salary: ");
            __CLR4_5_213iw13iwlvha7icl.R.inc(51283);expected.append(nf.format(args[2]));
            __CLR4_5_213iw13iwlvha7icl.R.inc(51284);assertEquals("pattern comparison for locale " + locale, expectedPattern, emf.toPattern());
            __CLR4_5_213iw13iwlvha7icl.R.inc(51285);assertEquals(String.valueOf(locale), expected.toString(), emf.format(args));
        }
    }}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

//    /**
//     * Test extended formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{1,lower}|2.0#{1,upper}}";
//        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
//        assertPatterns(null, pattern, emf.toPattern());
//        try {
//            assertEquals("one", emf.format(new Object[] {Integer.valueOf(1), "ONE"}));
//            assertEquals("TWO", emf.format(new Object[] {Integer.valueOf(2), "two"}));
//        } catch (IllegalArgumentException e) {
//            // currently sub-formats not supported
//        }
//    }

//    /**
//     * Test mixed extended and built-in formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedAndBuiltInWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{0} {1,lower} {2,number}|2.0#{0} {1,upper} {2,number,currency}}";
//        Object[] lowArgs  = new Object[] {Integer.valueOf(1), "Low",  Double.valueOf("1234.56")};
//        Object[] highArgs = new Object[] {Integer.valueOf(2), "High", Double.valueOf("9876.54")};
//        Locale[] availableLocales = ChoiceFormat.getAvailableLocales();
//        Locale[] testLocales = new Locale[availableLocales.length + 1];
//        testLocales[0] = null;
//        System.arraycopy(availableLocales, 0, testLocales, 1, availableLocales.length);
//        for (int i = 0; i < testLocales.length; i++) {
//            NumberFormat nf = null;
//            NumberFormat cf = null;
//            ExtendedMessageFormat emf = null;
//            if (testLocales[i] == null) {
//                nf = NumberFormat.getNumberInstance();
//                cf = NumberFormat.getCurrencyInstance();
//                emf = new ExtendedMessageFormat(pattern, registry);
//            } else {
//                nf = NumberFormat.getNumberInstance(testLocales[i]);
//                cf = NumberFormat.getCurrencyInstance(testLocales[i]);
//                emf = new ExtendedMessageFormat(pattern, testLocales[i], registry);
//            }
//            assertPatterns(null, pattern, emf.toPattern());
//            try {
//                String lowExpected = lowArgs[0] + " low "    + nf.format(lowArgs[2]);
//                String highExpected = highArgs[0] + " HIGH "  + cf.format(highArgs[2]);
//                assertEquals(lowExpected,  emf.format(lowArgs));
//                assertEquals(highExpected, emf.format(highArgs));
//            } catch (IllegalArgumentException e) {
//                // currently sub-formats not supported
//            }
//        }
//    }

    /**
     * Test the built in choice format.
     */
    @Test
    public void testBuiltInChoiceFormat() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gsn10w13km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInChoiceFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gsn10w13km(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51286);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51287);final Object[] values = new Number[] {Integer.valueOf(1), Double.valueOf("2.2"), Double.valueOf("1234.5")};
        __CLR4_5_213iw13iwlvha7icl.R.inc(51288);String choicePattern = null;
        __CLR4_5_213iw13iwlvha7icl.R.inc(51289);final Locale[] availableLocales = NumberFormat.getAvailableLocales();

        __CLR4_5_213iw13iwlvha7icl.R.inc(51290);choicePattern = "{0,choice,1#One|2#Two|3#Many {0,number}}";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51291);for (final Object value : values) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51292);checkBuiltInFormat(value + ": " + choicePattern, new Object[] {value}, availableLocales);
        }

        }__CLR4_5_213iw13iwlvha7icl.R.inc(51293);choicePattern = "{0,choice,1#''One''|2#\"Two\"|3#''{Many}'' {0,number}}";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51294);for (final Object value : values) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51295);checkBuiltInFormat(value + ": " + choicePattern, new Object[] {value}, availableLocales);
        }
    }}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test the built in date/time formats
     */
    @Test
    public void testBuiltInDateTimeFormat() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_234jv2i13kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInDateTimeFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_234jv2i13kw(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51296);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51297);final Calendar cal = Calendar.getInstance();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51298);cal.set(2007, Calendar.JANUARY, 23, 18, 33, 05);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51299);final Object[] args = new Object[] {cal.getTime()};
        __CLR4_5_213iw13iwlvha7icl.R.inc(51300);final Locale[] availableLocales = DateFormat.getAvailableLocales();

        __CLR4_5_213iw13iwlvha7icl.R.inc(51301);checkBuiltInFormat("1: {0,date,short}",    args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51302);checkBuiltInFormat("2: {0,date,medium}",   args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51303);checkBuiltInFormat("3: {0,date,long}",     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51304);checkBuiltInFormat("4: {0,date,full}",     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51305);checkBuiltInFormat("5: {0,date,d MMM yy}", args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51306);checkBuiltInFormat("6: {0,time,short}",    args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51307);checkBuiltInFormat("7: {0,time,medium}",   args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51308);checkBuiltInFormat("8: {0,time,long}",     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51309);checkBuiltInFormat("9: {0,time,full}",     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51310);checkBuiltInFormat("10: {0,time,HH:mm}",   args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51311);checkBuiltInFormat("11: {0,date}",         args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51312);checkBuiltInFormat("12: {0,time}",         args, availableLocales);
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    @Test
    public void testOverriddenBuiltinFormat() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ndi0e313ld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testOverriddenBuiltinFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ndi0e313ld(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51313);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51314);final Calendar cal = Calendar.getInstance();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51315);cal.set(2007, Calendar.JANUARY, 23);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51316);final Object[] args = new Object[] {cal.getTime()};
        __CLR4_5_213iw13iwlvha7icl.R.inc(51317);final Locale[] availableLocales = DateFormat.getAvailableLocales();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51318);final Map<String, ? extends FormatFactory> dateRegistry = Collections.singletonMap("date", new OverrideShortDateFormatFactory());

        //check the non-overridden builtins:
        __CLR4_5_213iw13iwlvha7icl.R.inc(51319);checkBuiltInFormat("1: {0,date}", dateRegistry,          args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51320);checkBuiltInFormat("2: {0,date,medium}", dateRegistry,   args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51321);checkBuiltInFormat("3: {0,date,long}", dateRegistry,     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51322);checkBuiltInFormat("4: {0,date,full}", dateRegistry,     args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51323);checkBuiltInFormat("5: {0,date,d MMM yy}", dateRegistry, args, availableLocales);

        //check the overridden format:
        __CLR4_5_213iw13iwlvha7icl.R.inc(51324);for (int i = -1; (((i < availableLocales.length)&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51325)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51326)==0&false)); i++) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51327);final Locale locale = (((i < 0 )&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51328)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51329)==0&false))? null : availableLocales[i];
            __CLR4_5_213iw13iwlvha7icl.R.inc(51330);final MessageFormat dateDefault = createMessageFormat("{0,date}", locale);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51331);final String pattern = "{0,date,short}";
            __CLR4_5_213iw13iwlvha7icl.R.inc(51332);final ExtendedMessageFormat dateShort = new ExtendedMessageFormat(pattern, locale, dateRegistry);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51333);assertEquals("overridden date,short format", dateDefault.format(args), dateShort.format(args));
            __CLR4_5_213iw13iwlvha7icl.R.inc(51334);assertEquals("overridden date,short pattern", pattern, dateShort.toPattern());
        }
    }}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test the built in number formats.
     */
    @Test
    public void testBuiltInNumberFormat() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pbliuw13lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInNumberFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pbliuw13lz(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51335);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51336);final Object[] args = new Object[] {Double.valueOf("6543.21")};
        __CLR4_5_213iw13iwlvha7icl.R.inc(51337);final Locale[] availableLocales = NumberFormat.getAvailableLocales();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51338);checkBuiltInFormat("1: {0,number}",            args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51339);checkBuiltInFormat("2: {0,number,integer}",    args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51340);checkBuiltInFormat("3: {0,number,currency}",   args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51341);checkBuiltInFormat("4: {0,number,percent}",    args, availableLocales);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51342);checkBuiltInFormat("5: {0,number,00000.000}",  args, availableLocales);
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test equals() and hashcode.
     */
    @Test
    public void testEqualsHashcode() {__CLR4_5_213iw13iwlvha7icl.R.globalSliceStart(getClass().getName(),51343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnww1913m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213iw13iwlvha7icl.R.rethrow($CLV_t2$);}finally{__CLR4_5_213iw13iwlvha7icl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEqualsHashcode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnww1913m7(){try{__CLR4_5_213iw13iwlvha7icl.R.inc(51343);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51344);final Map<String, ? extends FormatFactory> fmtRegistry = Collections.singletonMap("testfmt", new LowerCaseFormatFactory());
        __CLR4_5_213iw13iwlvha7icl.R.inc(51345);final Map<String, ? extends FormatFactory> otherRegitry = Collections.singletonMap("testfmt", new UpperCaseFormatFactory());

        __CLR4_5_213iw13iwlvha7icl.R.inc(51346);final String pattern = "Pattern: {0,testfmt}";
        __CLR4_5_213iw13iwlvha7icl.R.inc(51347);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, Locale.US, fmtRegistry);

        __CLR4_5_213iw13iwlvha7icl.R.inc(51348);ExtendedMessageFormat other = null;

        // Same object
        __CLR4_5_213iw13iwlvha7icl.R.inc(51349);assertTrue("same, equals()",   emf.equals(emf));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51350);assertTrue("same, hashcode()", emf.hashCode() == emf.hashCode());

        // Equal Object
        __CLR4_5_213iw13iwlvha7icl.R.inc(51351);other = new ExtendedMessageFormat(pattern, Locale.US, fmtRegistry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51352);assertTrue("equal, equals()",   emf.equals(other));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51353);assertTrue("equal, hashcode()", emf.hashCode() == other.hashCode());

        // Different Class
        __CLR4_5_213iw13iwlvha7icl.R.inc(51354);other = new OtherExtendedMessageFormat(pattern, Locale.US, fmtRegistry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51355);assertFalse("class, equals()",  emf.equals(other));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51356);assertTrue("class, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
        
        // Different pattern
        __CLR4_5_213iw13iwlvha7icl.R.inc(51357);other = new ExtendedMessageFormat("X" + pattern, Locale.US, fmtRegistry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51358);assertFalse("pattern, equals()",   emf.equals(other));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51359);assertFalse("pattern, hashcode()", emf.hashCode() == other.hashCode());

        // Different registry
        __CLR4_5_213iw13iwlvha7icl.R.inc(51360);other = new ExtendedMessageFormat(pattern, Locale.US, otherRegitry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51361);assertFalse("registry, equals()",   emf.equals(other));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51362);assertFalse("registry, hashcode()", emf.hashCode() == other.hashCode());

        // Different Locale
        __CLR4_5_213iw13iwlvha7icl.R.inc(51363);other = new ExtendedMessageFormat(pattern, Locale.FRANCE, fmtRegistry);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51364);assertFalse("locale, equals()",  emf.equals(other));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51365);assertTrue("locale, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51366);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51367);checkBuiltInFormat(pattern, null, args, locales);
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param fmtRegistry FormatFactory registry to use
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> fmtRegistry, final Object[] args, final Locale[] locales) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51368);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51369);checkBuiltInFormat(pattern, fmtRegistry, args, (Locale) null);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51370);for (final Locale locale : locales) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51371);checkBuiltInFormat(pattern, fmtRegistry, args, locale);
        }
    }}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Create an ExtendedMessageFormat for the specified pattern and locale and check the
     * formated output matches the expected result for the parameters.
     * @param pattern string
     * @param registryUnused map (currently unused)
     * @param args Object[]
     * @param locale Locale
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registryUnused, final Object[] args, final Locale locale) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51372);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51373);final StringBuilder buffer = new StringBuilder();
        __CLR4_5_213iw13iwlvha7icl.R.inc(51374);buffer.append("Pattern=[");
        __CLR4_5_213iw13iwlvha7icl.R.inc(51375);buffer.append(pattern);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51376);buffer.append("], locale=[");
        __CLR4_5_213iw13iwlvha7icl.R.inc(51377);buffer.append(locale);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51378);buffer.append("]");
        __CLR4_5_213iw13iwlvha7icl.R.inc(51379);final MessageFormat mf = createMessageFormat(pattern, locale);
        // System.out.println(buffer + ", result=[" + mf.format(args) +"]");
        __CLR4_5_213iw13iwlvha7icl.R.inc(51380);ExtendedMessageFormat emf = null;
        __CLR4_5_213iw13iwlvha7icl.R.inc(51381);if ((((locale == null)&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51382)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51383)==0&false))) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51384);emf = new ExtendedMessageFormat(pattern);
        } }else {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51385);emf = new ExtendedMessageFormat(pattern, locale);
        }
        }__CLR4_5_213iw13iwlvha7icl.R.inc(51386);assertEquals("format "    + buffer.toString(), mf.format(args), emf.format(args));
        __CLR4_5_213iw13iwlvha7icl.R.inc(51387);assertEquals("toPattern " + buffer.toString(), mf.toPattern(), emf.toPattern());
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    /**
     * Replace MessageFormat(String, Locale) constructor (not available until JDK 1.4).
     * @param pattern string
     * @param locale Locale
     * @return MessageFormat
     */
    private MessageFormat createMessageFormat(final String pattern, final Locale locale) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51388);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51389);final MessageFormat result = new MessageFormat(pattern);
        __CLR4_5_213iw13iwlvha7icl.R.inc(51390);if ((((locale != null)&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51391)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51392)==0&false))) {{
            __CLR4_5_213iw13iwlvha7icl.R.inc(51393);result.setLocale(locale);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51394);result.applyPattern(pattern);
        }
        }__CLR4_5_213iw13iwlvha7icl.R.inc(51395);return result;
    }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}

    // ------------------------ Test Formats ------------------------

    /**
     * {@link Format} implementation which converts to lower case.
     */
    private static class LowerCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51396);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51397);return toAppendTo.append(((String)obj).toLowerCase());
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51398);__CLR4_5_213iw13iwlvha7icl.R.inc(51399);throw new UnsupportedOperationException();}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51400);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51401);return toAppendTo.append(((String)obj).toUpperCase());
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51402);__CLR4_5_213iw13iwlvha7icl.R.inc(51403);throw new UnsupportedOperationException();}finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    private static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51404);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51405);return LOWER_INSTANCE;
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    private static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51406);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51407);return UPPER_INSTANCE;
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation to override date format "short" to "default".
     */
    private static class OverrideShortDateFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_5_213iw13iwlvha7icl.R.inc(51408);
            __CLR4_5_213iw13iwlvha7icl.R.inc(51409);return (((!"short".equals(arguments) )&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51410)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51411)==0&false))? null
                    : (((locale == null )&&(__CLR4_5_213iw13iwlvha7icl.R.iget(51412)!=0|true))||(__CLR4_5_213iw13iwlvha7icl.R.iget(51413)==0&false))? DateFormat
                            .getDateInstance(DateFormat.DEFAULT) : DateFormat
                            .getDateInstance(DateFormat.DEFAULT, locale);
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
    }

    /**
     * Alternative ExtendedMessageFormat impl.
     */
    private static class OtherExtendedMessageFormat extends ExtendedMessageFormat {
        private static final long serialVersionUID = 1L;

        public OtherExtendedMessageFormat(final String pattern, final Locale locale,
                final Map<String, ? extends FormatFactory> registry) {
            super(pattern, locale, registry);__CLR4_5_213iw13iwlvha7icl.R.inc(51415);try{__CLR4_5_213iw13iwlvha7icl.R.inc(51414);
        }finally{__CLR4_5_213iw13iwlvha7icl.R.flushNeeded();}}
        
    }

}
