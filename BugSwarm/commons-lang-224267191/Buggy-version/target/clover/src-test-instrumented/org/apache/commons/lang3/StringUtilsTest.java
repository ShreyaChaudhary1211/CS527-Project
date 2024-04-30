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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

/**
 * Unit tests for methods of {@link org.apache.commons.lang3.StringUtils}
 * which been moved to their own test classes.
 */
@SuppressWarnings("deprecation") // deliberate use of deprecated code
public class StringUtilsTest {static class __CLR4_5_2rktrktlvha7go1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,37824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final String WHITESPACE;
    static final String NON_WHITESPACE;
    static final String HARD_SPACE;
    static final String TRIMMABLE;
    static final String NON_TRIMMABLE;

    static {try{__CLR4_5_2rktrktlvha7go1.R.inc(35741);
        __CLR4_5_2rktrktlvha7go1.R.inc(35742);String ws = "";
        __CLR4_5_2rktrktlvha7go1.R.inc(35743);String nws = "";
        __CLR4_5_2rktrktlvha7go1.R.inc(35744);final String hs = String.valueOf(((char) 160));
        __CLR4_5_2rktrktlvha7go1.R.inc(35745);String tr = "";
        __CLR4_5_2rktrktlvha7go1.R.inc(35746);String ntr = "";
        __CLR4_5_2rktrktlvha7go1.R.inc(35747);for (int i = 0; (((i < Character.MAX_VALUE)&&(__CLR4_5_2rktrktlvha7go1.R.iget(35748)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(35749)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(35750);if ((((Character.isWhitespace((char) i))&&(__CLR4_5_2rktrktlvha7go1.R.iget(35751)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(35752)==0&false))) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(35753);ws += String.valueOf((char) i);
                __CLR4_5_2rktrktlvha7go1.R.inc(35754);if ((((i > 32)&&(__CLR4_5_2rktrktlvha7go1.R.iget(35755)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(35756)==0&false))) {{
                    __CLR4_5_2rktrktlvha7go1.R.inc(35757);ntr += String.valueOf((char) i);
                }
            }} }else {__CLR4_5_2rktrktlvha7go1.R.inc(35758);if ((((i < 40)&&(__CLR4_5_2rktrktlvha7go1.R.iget(35759)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(35760)==0&false))) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(35761);nws += String.valueOf((char) i);
            }
        }}}
        }__CLR4_5_2rktrktlvha7go1.R.inc(35762);for (int i = 0; (((i <= 32)&&(__CLR4_5_2rktrktlvha7go1.R.iget(35763)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(35764)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(35765);tr += String.valueOf((char) i);
        }
        }__CLR4_5_2rktrktlvha7go1.R.inc(35766);WHITESPACE = ws;
        __CLR4_5_2rktrktlvha7go1.R.inc(35767);NON_WHITESPACE = nws;
        __CLR4_5_2rktrktlvha7go1.R.inc(35768);HARD_SPACE = hs;
        __CLR4_5_2rktrktlvha7go1.R.inc(35769);TRIMMABLE = tr;
        __CLR4_5_2rktrktlvha7go1.R.inc(35770);NON_TRIMMABLE = ntr;
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    private static final String[] ARRAY_LIST = {"foo", "bar", "baz"};
    private static final String[] EMPTY_ARRAY_LIST = {};
    private static final String[] NULL_ARRAY_LIST = {null};
    private static final Object[] NULL_TO_STRING_LIST = {
            new Object() {
                @Override
                public String toString() {try{__CLR4_5_2rktrktlvha7go1.R.inc(35771);
                    __CLR4_5_2rktrktlvha7go1.R.inc(35772);return null;
                }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}
            }
    };
    private static final String[] MIXED_ARRAY_LIST = {null, "", "foo"};
    private static final Object[] MIXED_TYPE_LIST = {"foo", Long.valueOf(2L)};
    private static final long[] LONG_PRIM_LIST = {1, 2};
    private static final int[] INT_PRIM_LIST = {1, 2};
    private static final byte[] BYTE_PRIM_LIST = {1, 2};
    private static final short[] SHORT_PRIM_LIST = {1, 2};
    private static final char[] CHAR_PRIM_LIST = {'1', '2'};
    private static final float[] FLOAT_PRIM_LIST = {1, 2};
    private static final double[] DOUBLE_PRIM_LIST = {1, 2};

    private static final String SEPARATOR = ",";
    private static final char SEPARATOR_CHAR = ';';

    private static final String TEXT_LIST = "foo,bar,baz";
    private static final String TEXT_LIST_CHAR = "foo;bar;baz";
    private static final String TEXT_LIST_NOSEP = "foobarbaz";

    private static final String FOO_UNCAP = "foo";
    private static final String FOO_CAP = "Foo";

    private static final String SENTENCE_UNCAP = "foo bar baz";
    private static final String SENTENCE_CAP = "Foo Bar Baz";

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hrlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hrlp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35773);
        __CLR4_5_2rktrktlvha7go1.R.inc(35774);assertNotNull(new StringUtils());
        __CLR4_5_2rktrktlvha7go1.R.inc(35775);final Constructor<?>[] cons = StringUtils.class.getDeclaredConstructors();
        __CLR4_5_2rktrktlvha7go1.R.inc(35776);assertEquals(1, cons.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(35777);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2rktrktlvha7go1.R.inc(35778);assertTrue(Modifier.isPublic(StringUtils.class.getModifiers()));
        __CLR4_5_2rktrktlvha7go1.R.inc(35779);assertFalse(Modifier.isFinal(StringUtils.class.getModifiers()));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testUpperCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29u3xzbrlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUpperCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29u3xzbrlw(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35780);
        __CLR4_5_2rktrktlvha7go1.R.inc(35781);assertNull(StringUtils.upperCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35782);assertNull(StringUtils.upperCase(null, Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(35783);assertEquals("upperCase(String) failed",
                "FOO TEST THING", StringUtils.upperCase("fOo test THING"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35784);assertEquals("upperCase(empty-string) failed",
                "", StringUtils.upperCase(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35785);assertEquals("upperCase(String, Locale) failed",
                "FOO TEST THING", StringUtils.upperCase("fOo test THING", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(35786);assertEquals("upperCase(empty-string, Locale) failed",
                "", StringUtils.upperCase("", Locale.ENGLISH));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLowerCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dxz9omrm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLowerCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dxz9omrm3(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35787);
        __CLR4_5_2rktrktlvha7go1.R.inc(35788);assertNull(StringUtils.lowerCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35789);assertNull(StringUtils.lowerCase(null, Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(35790);assertEquals("lowerCase(String) failed",
                "foo test thing", StringUtils.lowerCase("fOo test THING"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35791);assertEquals("lowerCase(empty-string) failed",
                "", StringUtils.lowerCase(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35792);assertEquals("lowerCase(String, Locale) failed",
                "foo test thing", StringUtils.lowerCase("fOo test THING", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(35793);assertEquals("lowerCase(empty-string, Locale) failed",
                "", StringUtils.lowerCase("", Locale.ENGLISH));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testCapitalize() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ovl4mdrma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCapitalize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ovl4mdrma(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35794);
        __CLR4_5_2rktrktlvha7go1.R.inc(35795);assertNull(StringUtils.capitalize(null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35796);assertEquals("capitalize(empty-string) failed",
                "", StringUtils.capitalize(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35797);assertEquals("capitalize(single-char-string) failed",
                "X", StringUtils.capitalize("x"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35798);assertEquals("capitalize(String) failed",
                FOO_CAP, StringUtils.capitalize(FOO_CAP));
        __CLR4_5_2rktrktlvha7go1.R.inc(35799);assertEquals("capitalize(string) failed",
                FOO_CAP, StringUtils.capitalize(FOO_UNCAP));

        __CLR4_5_2rktrktlvha7go1.R.inc(35800);assertEquals("capitalize(String) is not using TitleCase",
                "\u01c8", StringUtils.capitalize("\u01c9"));

        // Javadoc examples
        __CLR4_5_2rktrktlvha7go1.R.inc(35801);assertNull(StringUtils.capitalize(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35802);assertEquals("", StringUtils.capitalize(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35803);assertEquals("Cat", StringUtils.capitalize("cat"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35804);assertEquals("CAt", StringUtils.capitalize("cAt"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35805);assertEquals("'cat'", StringUtils.capitalize("'cat'"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testUnCapitalize() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o7d3zyrmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUnCapitalize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o7d3zyrmm(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35806);
        __CLR4_5_2rktrktlvha7go1.R.inc(35807);assertNull(StringUtils.uncapitalize(null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35808);assertEquals("uncapitalize(String) failed",
                FOO_UNCAP, StringUtils.uncapitalize(FOO_CAP));
        __CLR4_5_2rktrktlvha7go1.R.inc(35809);assertEquals("uncapitalize(string) failed",
                FOO_UNCAP, StringUtils.uncapitalize(FOO_UNCAP));
        __CLR4_5_2rktrktlvha7go1.R.inc(35810);assertEquals("uncapitalize(empty-string) failed",
                "", StringUtils.uncapitalize(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35811);assertEquals("uncapitalize(single-char-string) failed",
                "x", StringUtils.uncapitalize("X"));

        // Examples from uncapitalize Javadoc
        __CLR4_5_2rktrktlvha7go1.R.inc(35812);assertEquals("cat", StringUtils.uncapitalize("cat"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35813);assertEquals("cat", StringUtils.uncapitalize("Cat"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35814);assertEquals("cAT", StringUtils.uncapitalize("CAT"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReCapitalize() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q5rmw8rmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReCapitalize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q5rmw8rmv(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35815);
        // reflection type of tests: Sentences.
        __CLR4_5_2rktrktlvha7go1.R.inc(35816);assertEquals("uncapitalize(capitalize(String)) failed",
                SENTENCE_UNCAP, StringUtils.uncapitalize(StringUtils.capitalize(SENTENCE_UNCAP)));
        __CLR4_5_2rktrktlvha7go1.R.inc(35817);assertEquals("capitalize(uncapitalize(String)) failed",
                SENTENCE_CAP, StringUtils.capitalize(StringUtils.uncapitalize(SENTENCE_CAP)));

        // reflection type of tests: One word.
        __CLR4_5_2rktrktlvha7go1.R.inc(35818);assertEquals("uncapitalize(capitalize(String)) failed",
                FOO_UNCAP, StringUtils.uncapitalize(StringUtils.capitalize(FOO_UNCAP)));
        __CLR4_5_2rktrktlvha7go1.R.inc(35819);assertEquals("capitalize(uncapitalize(String)) failed",
                FOO_CAP, StringUtils.capitalize(StringUtils.uncapitalize(FOO_CAP)));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSwapCase_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnsj26rn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSwapCase_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnsj26rn0(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35820);
        __CLR4_5_2rktrktlvha7go1.R.inc(35821);assertNull(StringUtils.swapCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35822);assertEquals("", StringUtils.swapCase(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35823);assertEquals("  ", StringUtils.swapCase("  "));

        __CLR4_5_2rktrktlvha7go1.R.inc(35824);assertEquals("i", WordUtils.swapCase("I"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35825);assertEquals("I", WordUtils.swapCase("i"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35826);assertEquals("I AM HERE 123", StringUtils.swapCase("i am here 123"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35827);assertEquals("i aM hERE 123", StringUtils.swapCase("I Am Here 123"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35828);assertEquals("I AM here 123", StringUtils.swapCase("i am HERE 123"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35829);assertEquals("i am here 123", StringUtils.swapCase("I AM HERE 123"));

        __CLR4_5_2rktrktlvha7go1.R.inc(35830);final String test = "This String contains a TitleCase character: \u01c8";
        __CLR4_5_2rktrktlvha7go1.R.inc(35831);final String expect = "tHIS sTRING CONTAINS A tITLEcASE CHARACTER: \u01c9";
        __CLR4_5_2rktrktlvha7go1.R.inc(35832);assertEquals(expect, WordUtils.swapCase(test));
        __CLR4_5_2rktrktlvha7go1.R.inc(35833);assertEquals(expect, StringUtils.swapCase(test));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testJoin_Objects() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_242x748rne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_Objects",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_242x748rne(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35834);
        __CLR4_5_2rktrktlvha7go1.R.inc(35835);assertEquals("abc", StringUtils.join("a", "b", "c"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35836);assertEquals("a", StringUtils.join(null, "", "a"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35837);assertNull(StringUtils.join((Object[]) null));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_Objectarray() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onjryrni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_Objectarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onjryrni(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35838);
//        assertNull(StringUtils.join(null)); // generates warning
        __CLR4_5_2rktrktlvha7go1.R.inc(35839);assertNull(StringUtils.join((Object[]) null)); // equivalent explicit cast
        // test additional varargs calls
        __CLR4_5_2rktrktlvha7go1.R.inc(35840);assertEquals("", StringUtils.join(new Object[0])); // empty array
        __CLR4_5_2rktrktlvha7go1.R.inc(35841);assertEquals("", StringUtils.join((Object) null)); // => new Object[]{null}

        __CLR4_5_2rktrktlvha7go1.R.inc(35842);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST));
        __CLR4_5_2rktrktlvha7go1.R.inc(35843);assertEquals("", StringUtils.join(NULL_ARRAY_LIST));
        __CLR4_5_2rktrktlvha7go1.R.inc(35844);assertEquals("null", StringUtils.join(NULL_TO_STRING_LIST));
        __CLR4_5_2rktrktlvha7go1.R.inc(35845);assertEquals("abc", StringUtils.join(new String[]{"a", "b", "c"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(35846);assertEquals("a", StringUtils.join(new String[]{null, "a", ""}));
        __CLR4_5_2rktrktlvha7go1.R.inc(35847);assertEquals("foo", StringUtils.join(MIXED_ARRAY_LIST));
        __CLR4_5_2rktrktlvha7go1.R.inc(35848);assertEquals("foo2", StringUtils.join(MIXED_TYPE_LIST));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayCharSeparator() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25y8u74rnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayCharSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25y8u74rnt(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35849);
        __CLR4_5_2rktrktlvha7go1.R.inc(35850);assertNull(StringUtils.join((Object[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35851);assertEquals(TEXT_LIST_CHAR, StringUtils.join(ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35852);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35853);assertEquals(";;foo", StringUtils.join(MIXED_ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35854);assertEquals("foo;2", StringUtils.join(MIXED_TYPE_LIST, SEPARATOR_CHAR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35855);assertNull(StringUtils.join((Object[]) null, ',', 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35856);assertEquals("/", StringUtils.join(MIXED_ARRAY_LIST, '/', 0, MIXED_ARRAY_LIST.length - 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35857);assertEquals("foo", StringUtils.join(MIXED_TYPE_LIST, '/', 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35858);assertEquals("null", StringUtils.join(NULL_TO_STRING_LIST, '/', 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35859);assertEquals("foo/2", StringUtils.join(MIXED_TYPE_LIST, '/', 0, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35860);assertEquals("2", StringUtils.join(MIXED_TYPE_LIST, '/', 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35861);assertEquals("", StringUtils.join(MIXED_TYPE_LIST, '/', 2, 1));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfChars() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zcrcrtro6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zcrcrtro6(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35862);
        __CLR4_5_2rktrktlvha7go1.R.inc(35863);assertNull(StringUtils.join((char[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35864);assertEquals("1;2", StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35865);assertEquals("2", StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35866);assertNull(StringUtils.join((char[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35867);assertEquals(StringUtils.EMPTY, StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35868);assertEquals(StringUtils.EMPTY, StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfBytes() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wywvbvrod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wywvbvrod(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35869);
        __CLR4_5_2rktrktlvha7go1.R.inc(35870);assertNull(StringUtils.join((byte[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35871);assertEquals("1;2", StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35872);assertEquals("2", StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35873);assertNull(StringUtils.join((byte[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35874);assertEquals(StringUtils.EMPTY, StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35875);assertEquals(StringUtils.EMPTY, StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfInts() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28wtha0rok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfInts",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28wtha0rok(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35876);
        __CLR4_5_2rktrktlvha7go1.R.inc(35877);assertNull(StringUtils.join((int[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35878);assertEquals("1;2", StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35879);assertEquals("2", StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35880);assertNull(StringUtils.join((int[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35881);assertEquals(StringUtils.EMPTY, StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35882);assertEquals(StringUtils.EMPTY, StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfLongs() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bxc6pror();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfLongs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bxc6pror(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35883);
        __CLR4_5_2rktrktlvha7go1.R.inc(35884);assertNull(StringUtils.join((long[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35885);assertEquals("1;2", StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35886);assertEquals("2", StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35887);assertNull(StringUtils.join((long[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35888);assertEquals(StringUtils.EMPTY, StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35889);assertEquals(StringUtils.EMPTY, StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfFloats() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vzbmtnroy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfFloats",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vzbmtnroy(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35890);
        __CLR4_5_2rktrktlvha7go1.R.inc(35891);assertNull(StringUtils.join((float[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35892);assertEquals("1.0;2.0", StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35893);assertEquals("2.0", StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35894);assertNull(StringUtils.join((float[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35895);assertEquals(StringUtils.EMPTY, StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35896);assertEquals(StringUtils.EMPTY, StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfDoubles() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sh1mvwrp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfDoubles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sh1mvwrp5(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35897);
        __CLR4_5_2rktrktlvha7go1.R.inc(35898);assertNull(StringUtils.join((double[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35899);assertEquals("1.0;2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35900);assertEquals("2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35901);assertNull(StringUtils.join((double[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35902);assertEquals(StringUtils.EMPTY, StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35903);assertEquals(StringUtils.EMPTY, StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayOfShorts() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26pu7klrpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfShorts",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26pu7klrpc(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35904);
        __CLR4_5_2rktrktlvha7go1.R.inc(35905);assertNull(StringUtils.join((short[]) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35906);assertEquals("1;2", StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35907);assertEquals("2", StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35908);assertNull(StringUtils.join((short[]) null, SEPARATOR_CHAR, 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35909);assertEquals(StringUtils.EMPTY, StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(35910);assertEquals(StringUtils.EMPTY, StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR, 1, 0));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_ArrayString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ijqc6mrpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ijqc6mrpj(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35911);
        __CLR4_5_2rktrktlvha7go1.R.inc(35912);assertNull(StringUtils.join((Object[]) null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35913);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(ARRAY_LIST, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35914);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(ARRAY_LIST, ""));

        __CLR4_5_2rktrktlvha7go1.R.inc(35915);assertEquals("", StringUtils.join(NULL_ARRAY_LIST, null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35916);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35917);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35918);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, SEPARATOR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35919);assertEquals(TEXT_LIST, StringUtils.join(ARRAY_LIST, SEPARATOR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35920);assertEquals(",,foo", StringUtils.join(MIXED_ARRAY_LIST, SEPARATOR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35921);assertEquals("foo,2", StringUtils.join(MIXED_TYPE_LIST, SEPARATOR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35922);assertEquals("/", StringUtils.join(MIXED_ARRAY_LIST, "/", 0, MIXED_ARRAY_LIST.length - 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35923);assertEquals("", StringUtils.join(MIXED_ARRAY_LIST, "", 0, MIXED_ARRAY_LIST.length - 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35924);assertEquals("foo", StringUtils.join(MIXED_TYPE_LIST, "/", 0, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(35925);assertEquals("foo/2", StringUtils.join(MIXED_TYPE_LIST, "/", 0, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35926);assertEquals("2", StringUtils.join(MIXED_TYPE_LIST, "/", 1, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(35927);assertEquals("", StringUtils.join(MIXED_TYPE_LIST, "/", 2, 1));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_IteratorChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2909zvyrq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IteratorChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2909zvyrq0(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35928);
        __CLR4_5_2rktrktlvha7go1.R.inc(35929);assertNull(StringUtils.join((Iterator<?>) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35930);assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35931);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35932);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35933);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), 'x'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_IteratorString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26yldyvrq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IteratorString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26yldyvrq6(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35934);
        __CLR4_5_2rktrktlvha7go1.R.inc(35935);assertNull(StringUtils.join((Iterator<?>) null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35936);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35937);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35938);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), "x"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35939);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35940);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST).iterator(), null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35941);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35942);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35943);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), SEPARATOR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35944);assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), SEPARATOR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35945);assertNull(StringUtils.join(Arrays.asList(NULL_TO_STRING_LIST).iterator(), SEPARATOR));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_IterableChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yt1f9qrqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IterableChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yt1f9qrqi(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35946);
        __CLR4_5_2rktrktlvha7go1.R.inc(35947);assertNull(StringUtils.join((Iterable<?>) null, ','));
        __CLR4_5_2rktrktlvha7go1.R.inc(35948);assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35949);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35950);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_5_2rktrktlvha7go1.R.inc(35951);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), 'x'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoin_IterableString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28rbj4drqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IterableString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28rbj4drqo(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35952);
        __CLR4_5_2rktrktlvha7go1.R.inc(35953);assertNull(StringUtils.join((Iterable<?>) null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35954);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35955);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35956);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), "x"));
        __CLR4_5_2rktrktlvha7go1.R.inc(35957);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35958);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), null));

        __CLR4_5_2rktrktlvha7go1.R.inc(35959);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35960);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(35961);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR));

        __CLR4_5_2rktrktlvha7go1.R.inc(35962);assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testJoinWith() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mexx6frqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoinWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mexx6frqz(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35963);
        __CLR4_5_2rktrktlvha7go1.R.inc(35964);assertEquals("", StringUtils.joinWith(",", new Object[0]));        // empty array
        __CLR4_5_2rktrktlvha7go1.R.inc(35965);assertEquals("", StringUtils.joinWith(",", (Object[]) NULL_ARRAY_LIST));
        __CLR4_5_2rktrktlvha7go1.R.inc(35966);assertEquals("null", StringUtils.joinWith(",", NULL_TO_STRING_LIST));   //toString method prints 'null'

        __CLR4_5_2rktrktlvha7go1.R.inc(35967);assertEquals("a,b,c", StringUtils.joinWith(",", new Object[]{"a", "b", "c"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(35968);assertEquals(",a,", StringUtils.joinWith(",", new Object[]{null, "a", ""}));

        __CLR4_5_2rktrktlvha7go1.R.inc(35969);assertEquals("ab", StringUtils.joinWith(null, "a", "b"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testJoinWithThrowsException() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e8coyhrr6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,74,111,105,110,87,105,116,104,84,104,114,111,119,115,69,120,99,101,112,116,105,111,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoinWithThrowsException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35970,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e8coyhrr6(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35970);
        __CLR4_5_2rktrktlvha7go1.R.inc(35971);StringUtils.joinWith(",", (Object[]) null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}


    @Test
    public void testSplit_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sdgkbzrr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sdgkbzrr8(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35972);
        __CLR4_5_2rktrktlvha7go1.R.inc(35973);assertNull(StringUtils.split(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(35974);assertEquals(0, StringUtils.split("").length);

        __CLR4_5_2rktrktlvha7go1.R.inc(35975);String str = "a b  .c";
        __CLR4_5_2rktrktlvha7go1.R.inc(35976);String[] res = StringUtils.split(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(35977);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(35978);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(35979);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(35980);assertEquals(".c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(35981);str = " a ";
        __CLR4_5_2rktrktlvha7go1.R.inc(35982);res = StringUtils.split(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(35983);assertEquals(1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(35984);assertEquals("a", res[0]);

        __CLR4_5_2rktrktlvha7go1.R.inc(35985);str = "a" + WHITESPACE + "b" + NON_WHITESPACE + "c";
        __CLR4_5_2rktrktlvha7go1.R.inc(35986);res = StringUtils.split(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(35987);assertEquals(2, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(35988);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(35989);assertEquals("b" + NON_WHITESPACE + "c", res[1]);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplit_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),35990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dymnj9rrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dymnj9rrq(){try{__CLR4_5_2rktrktlvha7go1.R.inc(35990);
        __CLR4_5_2rktrktlvha7go1.R.inc(35991);assertNull(StringUtils.split(null, '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(35992);assertEquals(0, StringUtils.split("", '.').length);

        __CLR4_5_2rktrktlvha7go1.R.inc(35993);String str = "a.b.. c";
        __CLR4_5_2rktrktlvha7go1.R.inc(35994);String[] res = StringUtils.split(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(35995);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(35996);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(35997);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(35998);assertEquals(" c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(35999);str = ".a.";
        __CLR4_5_2rktrktlvha7go1.R.inc(36000);res = StringUtils.split(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36001);assertEquals(1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36002);assertEquals("a", res[0]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36003);str = "a b c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36004);res = StringUtils.split(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36005);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36006);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36007);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36008);assertEquals("c", res[2]);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplit_StringString_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4000irs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_StringString_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4000irs9(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36009);
        __CLR4_5_2rktrktlvha7go1.R.inc(36010);assertNull(StringUtils.split(null, "."));
        __CLR4_5_2rktrktlvha7go1.R.inc(36011);assertNull(StringUtils.split(null, ".", 3));

        __CLR4_5_2rktrktlvha7go1.R.inc(36012);assertEquals(0, StringUtils.split("", ".").length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36013);assertEquals(0, StringUtils.split("", ".", 3).length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36014);innerTestSplit('.', ".", ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36015);innerTestSplit('.', ".", ',');
        __CLR4_5_2rktrktlvha7go1.R.inc(36016);innerTestSplit('.', ".,", 'x');
        __CLR4_5_2rktrktlvha7go1.R.inc(36017);for (int i = 0; (((i < WHITESPACE.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(36018)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36019)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36020);for (int j = 0; (((j < NON_WHITESPACE.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(36021)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36022)==0&false)); j++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36023);innerTestSplit(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
                __CLR4_5_2rktrktlvha7go1.R.inc(36024);innerTestSplit(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
            }
        }}

        }__CLR4_5_2rktrktlvha7go1.R.inc(36025);String[] results;
        __CLR4_5_2rktrktlvha7go1.R.inc(36026);final String[] expectedResults = {"ab", "de fg"};
        __CLR4_5_2rktrktlvha7go1.R.inc(36027);results = StringUtils.split("ab   de fg", null, 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36028);assertEquals(expectedResults.length, results.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36029);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36030)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36031)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36032);assertEquals(expectedResults[i], results[i]);
        }

        }__CLR4_5_2rktrktlvha7go1.R.inc(36033);final String[] expectedResults2 = {"ab", "cd:ef"};
        __CLR4_5_2rktrktlvha7go1.R.inc(36034);results = StringUtils.split("ab:cd:ef", ":", 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36035);assertEquals(expectedResults2.length, results.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36036);for (int i = 0; (((i < expectedResults2.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36037)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36038)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36039);assertEquals(expectedResults2[i], results[i]);
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    private void innerTestSplit(final char separator, final String sepStr, final char noMatch) {try{__CLR4_5_2rktrktlvha7go1.R.inc(36040);
        __CLR4_5_2rktrktlvha7go1.R.inc(36041);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
                "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";

        __CLR4_5_2rktrktlvha7go1.R.inc(36042);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36043);String[] res;
        // (str, sepStr)
        __CLR4_5_2rktrktlvha7go1.R.inc(36044);res = StringUtils.split(str, sepStr);
        __CLR4_5_2rktrktlvha7go1.R.inc(36045);assertEquals(msg, 3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36046);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36047);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36048);assertEquals(msg, noMatch + "c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36049);final String str2 = separator + "a" + separator;
        __CLR4_5_2rktrktlvha7go1.R.inc(36050);res = StringUtils.split(str2, sepStr);
        __CLR4_5_2rktrktlvha7go1.R.inc(36051);assertEquals(msg, 1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36052);assertEquals(msg, "a", res[0]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36053);res = StringUtils.split(str, sepStr, -1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36054);assertEquals(msg, 3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36055);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36056);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36057);assertEquals(msg, noMatch + "c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36058);res = StringUtils.split(str, sepStr, 0);
        __CLR4_5_2rktrktlvha7go1.R.inc(36059);assertEquals(msg, 3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36060);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36061);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36062);assertEquals(msg, noMatch + "c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36063);res = StringUtils.split(str, sepStr, 1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36064);assertEquals(msg, 1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36065);assertEquals(msg, str, res[0]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36066);res = StringUtils.split(str, sepStr, 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36067);assertEquals(msg, 2, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36068);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36069);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByWholeString_StringStringBoolean() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ri3upjrty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeString_StringStringBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ri3upjrty(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36070);
        __CLR4_5_2rktrktlvha7go1.R.inc(36071);assertArrayEquals(null, StringUtils.splitByWholeSeparator(null, "."));

        __CLR4_5_2rktrktlvha7go1.R.inc(36072);assertEquals(0, StringUtils.splitByWholeSeparator("", ".").length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36073);final String stringToSplitOnNulls = "ab   de fg";
        __CLR4_5_2rktrktlvha7go1.R.inc(36074);final String[] splitOnNullExpectedResults = {"ab", "de", "fg"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36075);final String[] splitOnNullResults = StringUtils.splitByWholeSeparator(stringToSplitOnNulls, null);
        __CLR4_5_2rktrktlvha7go1.R.inc(36076);assertEquals(splitOnNullExpectedResults.length, splitOnNullResults.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36077);for (int i = 0; (((i < splitOnNullExpectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36078)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36079)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36080);assertEquals(splitOnNullExpectedResults[i], splitOnNullResults[i]);
        }

        }__CLR4_5_2rktrktlvha7go1.R.inc(36081);final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiously";

        __CLR4_5_2rktrktlvha7go1.R.inc(36082);final String[] splitOnStringExpectedResults = {"abstemiously", "abstemiously"};
        __CLR4_5_2rktrktlvha7go1.R.inc(36083);final String[] splitOnStringResults = StringUtils.splitByWholeSeparator(stringToSplitOnCharactersAndString, "aeiouy");
        __CLR4_5_2rktrktlvha7go1.R.inc(36084);assertEquals(splitOnStringExpectedResults.length, splitOnStringResults.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36085);for (int i = 0; (((i < splitOnStringExpectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36086)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36087)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36088);assertEquals(splitOnStringExpectedResults[i], splitOnStringResults[i]);
        }

        }__CLR4_5_2rktrktlvha7go1.R.inc(36089);final String[] splitWithMultipleSeparatorExpectedResults = {"ab", "cd", "ef"};
        __CLR4_5_2rktrktlvha7go1.R.inc(36090);final String[] splitWithMultipleSeparator = StringUtils.splitByWholeSeparator("ab:cd::ef", ":");
        __CLR4_5_2rktrktlvha7go1.R.inc(36091);assertEquals(splitWithMultipleSeparatorExpectedResults.length, splitWithMultipleSeparator.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36092);for (int i = 0; (((i < splitWithMultipleSeparatorExpectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36093)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36094)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36095);assertEquals(splitWithMultipleSeparatorExpectedResults[i], splitWithMultipleSeparator[i]);
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByWholeString_StringStringBooleanInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qihsxmruo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeString_StringStringBooleanInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qihsxmruo(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36096);
        __CLR4_5_2rktrktlvha7go1.R.inc(36097);assertArrayEquals(null, StringUtils.splitByWholeSeparator(null, ".", 3));

        __CLR4_5_2rktrktlvha7go1.R.inc(36098);assertEquals(0, StringUtils.splitByWholeSeparator("", ".", 3).length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36099);final String stringToSplitOnNulls = "ab   de fg";
        __CLR4_5_2rktrktlvha7go1.R.inc(36100);final String[] splitOnNullExpectedResults = {"ab", "de fg"};
        //String[] splitOnNullExpectedResults = { "ab", "de" } ;

        __CLR4_5_2rktrktlvha7go1.R.inc(36101);final String[] splitOnNullResults = StringUtils.splitByWholeSeparator(stringToSplitOnNulls, null, 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36102);assertEquals(splitOnNullExpectedResults.length, splitOnNullResults.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36103);for (int i = 0; (((i < splitOnNullExpectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36104)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36105)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36106);assertEquals(splitOnNullExpectedResults[i], splitOnNullResults[i]);
        }

        }__CLR4_5_2rktrktlvha7go1.R.inc(36107);final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiouslyaeiouyabstemiously";

        __CLR4_5_2rktrktlvha7go1.R.inc(36108);final String[] splitOnStringExpectedResults = {"abstemiously", "abstemiouslyaeiouyabstemiously"};
        //String[] splitOnStringExpectedResults = { "abstemiously", "abstemiously" } ;
        __CLR4_5_2rktrktlvha7go1.R.inc(36109);final String[] splitOnStringResults = StringUtils.splitByWholeSeparator(stringToSplitOnCharactersAndString, "aeiouy", 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36110);assertEquals(splitOnStringExpectedResults.length, splitOnStringResults.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36111);for (int i = 0; (((i < splitOnStringExpectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36112)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36113)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36114);assertEquals(splitOnStringExpectedResults[i], splitOnStringResults[i]);
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b56narv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeSeparatorPreserveAllTokens_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b56narv7(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36115);
        __CLR4_5_2rktrktlvha7go1.R.inc(36116);assertArrayEquals(null, StringUtils.splitByWholeSeparatorPreserveAllTokens(null, "."));

        __CLR4_5_2rktrktlvha7go1.R.inc(36117);assertEquals(0, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ".").length);

        // test whitespace
        __CLR4_5_2rktrktlvha7go1.R.inc(36118);String input = "ab   de fg";
        __CLR4_5_2rktrktlvha7go1.R.inc(36119);String[] expected = new String[]{"ab", "", "", "de", "fg"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36120);String[] actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, null);
        __CLR4_5_2rktrktlvha7go1.R.inc(36121);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36122);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36123)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36124)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36125);assertEquals(expected[i], actual[i]);
        }

        // test delimiter singlechar
        }__CLR4_5_2rktrktlvha7go1.R.inc(36126);input = "1::2:::3::::4";
        __CLR4_5_2rktrktlvha7go1.R.inc(36127);expected = new String[]{"1", "", "2", "", "", "3", "", "", "", "4"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36128);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, ":");
        __CLR4_5_2rktrktlvha7go1.R.inc(36129);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36130);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36131)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36132)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36133);assertEquals(expected[i], actual[i]);
        }

        // test delimiter multichar
        }__CLR4_5_2rktrktlvha7go1.R.inc(36134);input = "1::2:::3::::4";
        __CLR4_5_2rktrktlvha7go1.R.inc(36135);expected = new String[]{"1", "2", ":3", "", "4"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36136);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, "::");
        __CLR4_5_2rktrktlvha7go1.R.inc(36137);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36138);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36139)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36140)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36141);assertEquals(expected[i], actual[i]);
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wx5nhzrvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeSeparatorPreserveAllTokens_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wx5nhzrvy(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36142);
        __CLR4_5_2rktrktlvha7go1.R.inc(36143);assertArrayEquals(null, StringUtils.splitByWholeSeparatorPreserveAllTokens(null, ".", -1));

        __CLR4_5_2rktrktlvha7go1.R.inc(36144);assertEquals(0, StringUtils.splitByWholeSeparatorPreserveAllTokens("", ".", -1).length);

        // test whitespace
        __CLR4_5_2rktrktlvha7go1.R.inc(36145);String input = "ab   de fg";
        __CLR4_5_2rktrktlvha7go1.R.inc(36146);String[] expected = new String[]{"ab", "", "", "de", "fg"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36147);String[] actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, null, -1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36148);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36149);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36150)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36151)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36152);assertEquals(expected[i], actual[i]);
        }

        // test delimiter singlechar
        }__CLR4_5_2rktrktlvha7go1.R.inc(36153);input = "1::2:::3::::4";
        __CLR4_5_2rktrktlvha7go1.R.inc(36154);expected = new String[]{"1", "", "2", "", "", "3", "", "", "", "4"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36155);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, ":", -1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36156);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36157);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36158)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36159)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36160);assertEquals(expected[i], actual[i]);
        }

        // test delimiter multichar
        }__CLR4_5_2rktrktlvha7go1.R.inc(36161);input = "1::2:::3::::4";
        __CLR4_5_2rktrktlvha7go1.R.inc(36162);expected = new String[]{"1", "2", ":3", "", "4"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36163);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, "::", -1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36164);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36165);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36166)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36167)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36168);assertEquals(expected[i], actual[i]);
        }

        // test delimiter char with max
        }__CLR4_5_2rktrktlvha7go1.R.inc(36169);input = "1::2::3:4";
        __CLR4_5_2rktrktlvha7go1.R.inc(36170);expected = new String[]{"1", "", "2", ":3:4"};

        __CLR4_5_2rktrktlvha7go1.R.inc(36171);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens(input, ":", 4);
        __CLR4_5_2rktrktlvha7go1.R.inc(36172);assertEquals(expected.length, actual.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36173);for (int i = 0; (((i < actual.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36174)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36175)==0&false)); i += 1) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36176);assertEquals(expected[i], actual[i]);
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitPreserveAllTokens_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2se03tcrwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2se03tcrwx(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36177);
        __CLR4_5_2rktrktlvha7go1.R.inc(36178);assertNull(StringUtils.splitPreserveAllTokens(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36179);assertEquals(0, StringUtils.splitPreserveAllTokens("").length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36180);String str = "abc def";
        __CLR4_5_2rktrktlvha7go1.R.inc(36181);String[] res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36182);assertEquals(2, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36183);assertEquals("abc", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36184);assertEquals("def", res[1]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36185);str = "abc  def";
        __CLR4_5_2rktrktlvha7go1.R.inc(36186);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36187);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36188);assertEquals("abc", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36189);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36190);assertEquals("def", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36191);str = " abc ";
        __CLR4_5_2rktrktlvha7go1.R.inc(36192);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36193);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36194);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36195);assertEquals("abc", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36196);assertEquals("", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36197);str = "a b .c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36198);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36199);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36200);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36201);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36202);assertEquals(".c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36203);str = " a b .c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36204);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36205);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36206);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36207);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36208);assertEquals("b", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36209);assertEquals(".c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36210);str = "a  b  .c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36211);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36212);assertEquals(5, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36213);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36214);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36215);assertEquals("b", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36216);assertEquals("", res[3]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36217);assertEquals(".c", res[4]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36218);str = " a  ";
        __CLR4_5_2rktrktlvha7go1.R.inc(36219);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36220);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36221);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36222);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36223);assertEquals("", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36224);assertEquals("", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36225);str = " a  b";
        __CLR4_5_2rktrktlvha7go1.R.inc(36226);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36227);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36228);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36229);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36230);assertEquals("", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36231);assertEquals("b", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36232);str = "a" + WHITESPACE + "b" + NON_WHITESPACE + "c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36233);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_5_2rktrktlvha7go1.R.inc(36234);assertEquals(WHITESPACE.length() + 1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36235);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36236);for (int i = 1; (((i < WHITESPACE.length() - 1)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36237)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36238)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36239);assertEquals("", res[i]);
        }
        }__CLR4_5_2rktrktlvha7go1.R.inc(36240);assertEquals("b" + NON_WHITESPACE + "c", res[WHITESPACE.length()]);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitPreserveAllTokens_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv88beryp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv88beryp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36241);
        __CLR4_5_2rktrktlvha7go1.R.inc(36242);assertNull(StringUtils.splitPreserveAllTokens(null, '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36243);assertEquals(0, StringUtils.splitPreserveAllTokens("", '.').length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36244);String str = "a.b. c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36245);String[] res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36246);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36247);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36248);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36249);assertEquals(" c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36250);str = "a.b.. c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36251);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36252);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36253);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36254);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36255);assertEquals("", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36256);assertEquals(" c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36257);str = ".a.";
        __CLR4_5_2rktrktlvha7go1.R.inc(36258);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36259);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36260);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36261);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36262);assertEquals("", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36263);str = ".a..";
        __CLR4_5_2rktrktlvha7go1.R.inc(36264);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36265);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36266);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36267);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36268);assertEquals("", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36269);assertEquals("", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36270);str = "..a.";
        __CLR4_5_2rktrktlvha7go1.R.inc(36271);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36272);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36273);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36274);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36275);assertEquals("a", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36276);assertEquals("", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36277);str = "..a";
        __CLR4_5_2rktrktlvha7go1.R.inc(36278);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_5_2rktrktlvha7go1.R.inc(36279);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36280);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36281);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36282);assertEquals("a", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36283);str = "a b c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36284);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36285);assertEquals(3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36286);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36287);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36288);assertEquals("c", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36289);str = "a  b  c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36290);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36291);assertEquals(5, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36292);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36293);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36294);assertEquals("b", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36295);assertEquals("", res[3]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36296);assertEquals("c", res[4]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36297);str = " a b c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36298);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36299);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36300);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36301);assertEquals("a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36302);assertEquals("b", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36303);assertEquals("c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36304);str = "  a b c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36305);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36306);assertEquals(5, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36307);assertEquals("", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36308);assertEquals("", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36309);assertEquals("a", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36310);assertEquals("b", res[3]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36311);assertEquals("c", res[4]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36312);str = "a b c ";
        __CLR4_5_2rktrktlvha7go1.R.inc(36313);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36314);assertEquals(4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36315);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36316);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36317);assertEquals("c", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36318);assertEquals("", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36319);str = "a b c  ";
        __CLR4_5_2rktrktlvha7go1.R.inc(36320);res = StringUtils.splitPreserveAllTokens(str, ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36321);assertEquals(5, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36322);assertEquals("a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36323);assertEquals("b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36324);assertEquals("c", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36325);assertEquals("", res[3]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36326);assertEquals("", res[3]);

        // Match example in javadoc
        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36327);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36328);final String[] expectedResults = {"a", "", "b", "c"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36329);results = StringUtils.splitPreserveAllTokens("a..b.c", '.');
            __CLR4_5_2rktrktlvha7go1.R.inc(36330);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36331);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36332)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36333)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36334);assertEquals(expectedResults[i], results[i]);
            }
        }}
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitPreserveAllTokens_StringString_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz395ds1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_StringString_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz395ds1b(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36335);
        __CLR4_5_2rktrktlvha7go1.R.inc(36336);assertNull(StringUtils.splitPreserveAllTokens(null, "."));
        __CLR4_5_2rktrktlvha7go1.R.inc(36337);assertNull(StringUtils.splitPreserveAllTokens(null, ".", 3));

        __CLR4_5_2rktrktlvha7go1.R.inc(36338);assertEquals(0, StringUtils.splitPreserveAllTokens("", ".").length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36339);assertEquals(0, StringUtils.splitPreserveAllTokens("", ".", 3).length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36340);innerTestSplitPreserveAllTokens('.', ".", ' ');
        __CLR4_5_2rktrktlvha7go1.R.inc(36341);innerTestSplitPreserveAllTokens('.', ".", ',');
        __CLR4_5_2rktrktlvha7go1.R.inc(36342);innerTestSplitPreserveAllTokens('.', ".,", 'x');
        __CLR4_5_2rktrktlvha7go1.R.inc(36343);for (int i = 0; (((i < WHITESPACE.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(36344)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36345)==0&false)); i++) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36346);for (int j = 0; (((j < NON_WHITESPACE.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(36347)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36348)==0&false)); j++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36349);innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
                __CLR4_5_2rktrktlvha7go1.R.inc(36350);innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
            }
        }}

        }{
            __CLR4_5_2rktrktlvha7go1.R.inc(36351);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36352);final String[] expectedResults = {"ab", "de fg"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36353);results = StringUtils.splitPreserveAllTokens("ab de fg", null, 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(36354);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36355);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36356)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36357)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36358);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36359);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36360);final String[] expectedResults = {"ab", "  de fg"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36361);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(36362);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36363);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36364)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36365)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36366);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36367);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36368);final String[] expectedResults = {"ab", "::de:fg"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36369);results = StringUtils.splitPreserveAllTokens("ab:::de:fg", ":", 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(36370);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36371);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36372)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36373)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36374);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36375);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36376);final String[] expectedResults = {"ab", "", " de fg"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36377);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 3);
            __CLR4_5_2rktrktlvha7go1.R.inc(36378);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36379);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36380)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36381)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36382);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36383);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36384);final String[] expectedResults = {"ab", "", "", "de fg"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36385);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 4);
            __CLR4_5_2rktrktlvha7go1.R.inc(36386);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36387);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36388)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36389)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36390);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36391);final String[] expectedResults = {"ab", "cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36392);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36393);results = StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(36394);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36395);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36396)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36397)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36398);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36399);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36400);final String[] expectedResults = {"ab", ":cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36401);results = StringUtils.splitPreserveAllTokens("ab::cd:ef", ":", 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(36402);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36403);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36404)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36405)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36406);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36407);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36408);final String[] expectedResults = {"ab", "", ":cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36409);results = StringUtils.splitPreserveAllTokens("ab:::cd:ef", ":", 3);
            __CLR4_5_2rktrktlvha7go1.R.inc(36410);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36411);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36412)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36413)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36414);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36415);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36416);final String[] expectedResults = {"ab", "", "", "cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36417);results = StringUtils.splitPreserveAllTokens("ab:::cd:ef", ":", 4);
            __CLR4_5_2rktrktlvha7go1.R.inc(36418);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36419);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36420)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36421)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36422);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36423);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36424);final String[] expectedResults = {"", "ab", "", "", "cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36425);results = StringUtils.splitPreserveAllTokens(":ab:::cd:ef", ":", 5);
            __CLR4_5_2rktrktlvha7go1.R.inc(36426);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36427);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36428)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36429)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36430);assertEquals(expectedResults[i], results[i]);
            }
        }}

        {
            __CLR4_5_2rktrktlvha7go1.R.inc(36431);String[] results;
            __CLR4_5_2rktrktlvha7go1.R.inc(36432);final String[] expectedResults = {"", "", "ab", "", "", "cd:ef"};
            __CLR4_5_2rktrktlvha7go1.R.inc(36433);results = StringUtils.splitPreserveAllTokens("::ab:::cd:ef", ":", 6);
            __CLR4_5_2rktrktlvha7go1.R.inc(36434);assertEquals(expectedResults.length, results.length);
            __CLR4_5_2rktrktlvha7go1.R.inc(36435);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_5_2rktrktlvha7go1.R.iget(36436)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(36437)==0&false)); i++) {{
                __CLR4_5_2rktrktlvha7go1.R.inc(36438);assertEquals(expectedResults[i], results[i]);
            }
        }}

    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch) {try{__CLR4_5_2rktrktlvha7go1.R.inc(36439);
        __CLR4_5_2rktrktlvha7go1.R.inc(36440);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
                "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";

        __CLR4_5_2rktrktlvha7go1.R.inc(36441);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_5_2rktrktlvha7go1.R.inc(36442);String[] res;
        // (str, sepStr)
        __CLR4_5_2rktrktlvha7go1.R.inc(36443);res = StringUtils.splitPreserveAllTokens(str, sepStr);
        __CLR4_5_2rktrktlvha7go1.R.inc(36444);assertEquals(msg, 4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36445);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36446);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36447);assertEquals(msg, "", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36448);assertEquals(msg, noMatch + "c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36449);final String str2 = separator + "a" + separator;
        __CLR4_5_2rktrktlvha7go1.R.inc(36450);res = StringUtils.splitPreserveAllTokens(str2, sepStr);
        __CLR4_5_2rktrktlvha7go1.R.inc(36451);assertEquals(msg, 3, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36452);assertEquals(msg, "", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36453);assertEquals(msg, "a", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36454);assertEquals(msg, "", res[2]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36455);res = StringUtils.splitPreserveAllTokens(str, sepStr, -1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36456);assertEquals(msg, 4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36457);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36458);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36459);assertEquals(msg, "", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36460);assertEquals(msg, noMatch + "c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36461);res = StringUtils.splitPreserveAllTokens(str, sepStr, 0);
        __CLR4_5_2rktrktlvha7go1.R.inc(36462);assertEquals(msg, 4, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36463);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36464);assertEquals(msg, "b", res[1]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36465);assertEquals(msg, "", res[2]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36466);assertEquals(msg, noMatch + "c", res[3]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36467);res = StringUtils.splitPreserveAllTokens(str, sepStr, 1);
        __CLR4_5_2rktrktlvha7go1.R.inc(36468);assertEquals(msg, 1, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36469);assertEquals(msg, str, res[0]);

        __CLR4_5_2rktrktlvha7go1.R.inc(36470);res = StringUtils.splitPreserveAllTokens(str, sepStr, 2);
        __CLR4_5_2rktrktlvha7go1.R.inc(36471);assertEquals(msg, 2, res.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(36472);assertEquals(msg, "a", res[0]);
        __CLR4_5_2rktrktlvha7go1.R.inc(36473);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByCharacterType() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vhf57s56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByCharacterType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vhf57s56(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36474);
        __CLR4_5_2rktrktlvha7go1.R.inc(36475);assertNull(StringUtils.splitByCharacterType(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36476);assertEquals(0, StringUtils.splitByCharacterType("").length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36477);assertTrue(Objects.deepEquals(new String[]{"ab", " ", "de", " ",
                "fg"}, StringUtils.splitByCharacterType("ab de fg")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36478);assertTrue(Objects.deepEquals(new String[]{"ab", "   ", "de", " ",
                "fg"}, StringUtils.splitByCharacterType("ab   de fg")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36479);assertTrue(Objects.deepEquals(new String[]{"ab", ":", "cd", ":",
                "ef"}, StringUtils.splitByCharacterType("ab:cd:ef")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36480);assertTrue(Objects.deepEquals(new String[]{"number", "5"},
                StringUtils.splitByCharacterType("number5")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36481);assertTrue(Objects.deepEquals(new String[]{"foo", "B", "ar"},
                StringUtils.splitByCharacterType("fooBar")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36482);assertTrue(Objects.deepEquals(new String[]{"foo", "200", "B", "ar"},
                StringUtils.splitByCharacterType("foo200Bar")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36483);assertTrue(Objects.deepEquals(new String[]{"ASFR", "ules"},
                StringUtils.splitByCharacterType("ASFRules")));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testSplitByCharacterTypeCamelCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2akiyevs5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByCharacterTypeCamelCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2akiyevs5g(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36484);
        __CLR4_5_2rktrktlvha7go1.R.inc(36485);assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36486);assertEquals(0, StringUtils.splitByCharacterTypeCamelCase("").length);

        __CLR4_5_2rktrktlvha7go1.R.inc(36487);assertTrue(Objects.deepEquals(new String[]{"ab", " ", "de", " ",
                "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab de fg")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36488);assertTrue(Objects.deepEquals(new String[]{"ab", "   ", "de", " ",
                "fg"}, StringUtils.splitByCharacterTypeCamelCase("ab   de fg")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36489);assertTrue(Objects.deepEquals(new String[]{"ab", ":", "cd", ":",
                "ef"}, StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36490);assertTrue(Objects.deepEquals(new String[]{"number", "5"},
                StringUtils.splitByCharacterTypeCamelCase("number5")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36491);assertTrue(Objects.deepEquals(new String[]{"foo", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("fooBar")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36492);assertTrue(Objects.deepEquals(new String[]{"foo", "200", "Bar"},
                StringUtils.splitByCharacterTypeCamelCase("foo200Bar")));

        __CLR4_5_2rktrktlvha7go1.R.inc(36493);assertTrue(Objects.deepEquals(new String[]{"ASF", "Rules"},
                StringUtils.splitByCharacterTypeCamelCase("ASFRules")));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDeleteWhitespace_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1q55vs5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDeleteWhitespace_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1q55vs5q(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36494);
        __CLR4_5_2rktrktlvha7go1.R.inc(36495);assertNull(StringUtils.deleteWhitespace(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36496);assertEquals("", StringUtils.deleteWhitespace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36497);assertEquals("", StringUtils.deleteWhitespace("    \t\t\n\n   "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36498);assertEquals("", StringUtils.deleteWhitespace(StringUtilsTest.WHITESPACE));
        __CLR4_5_2rktrktlvha7go1.R.inc(36499);assertEquals(StringUtilsTest.NON_WHITESPACE, StringUtils.deleteWhitespace(StringUtilsTest.NON_WHITESPACE));
        // Note: u-2007 and u-000A both cause problems in the source code
        // it should ignore 2007 but delete 000A
        __CLR4_5_2rktrktlvha7go1.R.inc(36500);assertEquals("\u00a0\u202f", StringUtils.deleteWhitespace("  \u00a0  \t\t\n\n \u202f  "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36501);assertEquals("\u00a0\u202f", StringUtils.deleteWhitespace("\u00a0\u202f"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36502);assertEquals("test", StringUtils.deleteWhitespace("t  \t\n	e\rs\n\n   \tt"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLang623() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bl9a2qs5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLang623",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bl9a2qs5z(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36503);
        __CLR4_5_2rktrktlvha7go1.R.inc(36504);assertEquals("t", StringUtils.replaceChars("\u00de", '\u00de', 't'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36505);assertEquals("t", StringUtils.replaceChars("\u00fe", '\u00fe', 't'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplace_StringStringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfsjefs62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfsjefs62(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36506);
        __CLR4_5_2rktrktlvha7go1.R.inc(36507);assertNull(StringUtils.replace(null, null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36508);assertNull(StringUtils.replace(null, null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36509);assertNull(StringUtils.replace(null, "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36510);assertNull(StringUtils.replace(null, "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36511);assertEquals("", StringUtils.replace("", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36512);assertEquals("", StringUtils.replace("", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36513);assertEquals("", StringUtils.replace("", "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36514);assertEquals("", StringUtils.replace("", "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36515);assertEquals("FOO", StringUtils.replace("FOO", "", "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36516);assertEquals("FOO", StringUtils.replace("FOO", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36517);assertEquals("FOO", StringUtils.replace("FOO", "F", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36518);assertEquals("FOO", StringUtils.replace("FOO", null, null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36519);assertEquals("", StringUtils.replace("foofoofoo", "foo", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36520);assertEquals("barbarbar", StringUtils.replace("foofoofoo", "foo", "bar"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36521);assertEquals("farfarfar", StringUtils.replace("foofoofoo", "oo", "ar"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceIgnoreCase_StringStringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r28l1ns6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceIgnoreCase_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r28l1ns6i(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36522);
        __CLR4_5_2rktrktlvha7go1.R.inc(36523);assertEquals(null, StringUtils.replaceIgnoreCase(null, null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36524);assertEquals(null, StringUtils.replaceIgnoreCase(null, null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36525);assertEquals(null, StringUtils.replaceIgnoreCase(null, "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36526);assertEquals(null, StringUtils.replaceIgnoreCase(null, "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36527);assertEquals("", StringUtils.replaceIgnoreCase("", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36528);assertEquals("", StringUtils.replaceIgnoreCase("", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36529);assertEquals("", StringUtils.replaceIgnoreCase("", "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36530);assertEquals("", StringUtils.replaceIgnoreCase("", "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36531);assertEquals("FOO", StringUtils.replaceIgnoreCase("FOO", "", "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36532);assertEquals("FOO", StringUtils.replaceIgnoreCase("FOO", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36533);assertEquals("FOO", StringUtils.replaceIgnoreCase("FOO", "F", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36534);assertEquals("FOO", StringUtils.replaceIgnoreCase("FOO", null, null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36535);assertEquals("", StringUtils.replaceIgnoreCase("foofoofoo", "foo", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36536);assertEquals("barbarbar", StringUtils.replaceIgnoreCase("foofoofoo", "foo", "bar"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36537);assertEquals("farfarfar", StringUtils.replaceIgnoreCase("foofoofoo", "oo", "ar"));

        // IgnoreCase
        __CLR4_5_2rktrktlvha7go1.R.inc(36538);assertEquals("", StringUtils.replaceIgnoreCase("foofoofoo", "FOO", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36539);assertEquals("barbarbar", StringUtils.replaceIgnoreCase("fooFOOfoo", "foo", "bar"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36540);assertEquals("farfarfar", StringUtils.replaceIgnoreCase("foofOOfoo", "OO", "ar"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplacePattern() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de6sy3s71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplacePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de6sy3s71(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36541);
        __CLR4_5_2rktrktlvha7go1.R.inc(36542);assertNull(StringUtils.replacePattern(null, "", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36543);assertEquals("any", StringUtils.replacePattern("any", null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36544);assertEquals("any", StringUtils.replacePattern("any", "", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36545);assertEquals("zzz", StringUtils.replacePattern("", "", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36546);assertEquals("zzz", StringUtils.replacePattern("", ".*", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36547);assertEquals("", StringUtils.replacePattern("", ".+", "zzz"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36548);assertEquals("z", StringUtils.replacePattern("<__>\n<__>", "<.*>", "z"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36549);assertEquals("z", StringUtils.replacePattern("<__>\\n<__>", "<.*>", "z"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36550);assertEquals("X", StringUtils.replacePattern("<A>\nxy\n</A>", "<A>.*</A>", "X"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36551);assertEquals("ABC___123", StringUtils.replacePattern("ABCabc123", "[a-z]", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36552);assertEquals("ABC_123", StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36553);assertEquals("ABC123", StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36554);assertEquals("Lorem_ipsum_dolor_sit",
                     StringUtils.replacePattern("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemovePattern() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwevpbs7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemovePattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwevpbs7f(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36555);
        __CLR4_5_2rktrktlvha7go1.R.inc(36556);assertNull(StringUtils.removePattern(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36557);assertEquals("any", StringUtils.removePattern("any", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36558);assertEquals("", StringUtils.removePattern("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36559);assertEquals("", StringUtils.removePattern("", ".*"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36560);assertEquals("", StringUtils.removePattern("", ".+"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36561);assertEquals("AB", StringUtils.removePattern("A<__>\n<__>B", "<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36562);assertEquals("AB", StringUtils.removePattern("A<__>\\n<__>B", "<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36563);assertEquals("", StringUtils.removePattern("<A>x\\ny</A>", "<A>.*</A>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36564);assertEquals("", StringUtils.removePattern("<A>\nxy\n</A>", "<A>.*</A>"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36565);assertEquals("ABC123", StringUtils.removePattern("ABCabc123", "[a-z]"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceAll() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n0a49ms7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n0a49ms7q(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36566);
        __CLR4_5_2rktrktlvha7go1.R.inc(36567);assertNull(StringUtils.replaceAll(null, "", ""));

        __CLR4_5_2rktrktlvha7go1.R.inc(36568);assertEquals("any", StringUtils.replaceAll("any", null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36569);assertEquals("any", StringUtils.replaceAll("any", "", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36570);assertEquals("zzz", StringUtils.replaceAll("", "", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36571);assertEquals("zzz", StringUtils.replaceAll("", ".*", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36572);assertEquals("", StringUtils.replaceAll("", ".+", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36573);assertEquals("ZZaZZbZZcZZ", StringUtils.replaceAll("abc", "", "ZZ"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36574);assertEquals("z\nz", StringUtils.replaceAll("<__>\n<__>", "<.*>", "z"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36575);assertEquals("z", StringUtils.replaceAll("<__>\n<__>", "(?s)<.*>", "z"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36576);assertEquals("ABC___123", StringUtils.replaceAll("ABCabc123", "[a-z]", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36577);assertEquals("ABC_123", StringUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36578);assertEquals("ABC123", StringUtils.replaceAll("ABCabc123", "[^A-Z0-9]+", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36579);assertEquals("Lorem_ipsum_dolor_sit",
                     StringUtils.replaceAll("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36580);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(36581);StringUtils.replaceAll("any", "{badRegexSyntax}", "");
            __CLR4_5_2rktrktlvha7go1.R.inc(36582);fail("StringUtils.replaceAll expecting PatternSyntaxException");
        } catch (final PatternSyntaxException ex) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceFirst() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tidz11s87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceFirst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tidz11s87(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36583);
        __CLR4_5_2rktrktlvha7go1.R.inc(36584);assertNull(StringUtils.replaceFirst(null, "", ""));

        __CLR4_5_2rktrktlvha7go1.R.inc(36585);assertEquals("any", StringUtils.replaceFirst("any", null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36586);assertEquals("any", StringUtils.replaceFirst("any", "", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36587);assertEquals("zzz", StringUtils.replaceFirst("", "", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36588);assertEquals("zzz", StringUtils.replaceFirst("", ".*", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36589);assertEquals("", StringUtils.replaceFirst("", ".+", "zzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36590);assertEquals("ZZabc", StringUtils.replaceFirst("abc", "", "ZZ"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36591);assertEquals("z\n<__>", StringUtils.replaceFirst("<__>\n<__>", "<.*>", "z"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36592);assertEquals("z", StringUtils.replaceFirst("<__>\n<__>", "(?s)<.*>", "z"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36593);assertEquals("ABC_bc123", StringUtils.replaceFirst("ABCabc123", "[a-z]", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36594);assertEquals("ABC_123abc", StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "_"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36595);assertEquals("ABC123abc", StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36596);assertEquals("Lorem_ipsum  dolor   sit",
                     StringUtils.replaceFirst("Lorem ipsum  dolor   sit", "( +)([a-z]+)", "_$2"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36597);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(36598);StringUtils.replaceFirst("any", "{badRegexSyntax}", "");
            __CLR4_5_2rktrktlvha7go1.R.inc(36599);fail("StringUtils.replaceFirst expecting PatternSyntaxException");
        } catch (final PatternSyntaxException ex) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplace_StringStringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avpi2is8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avpi2is8o(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36600);
        __CLR4_5_2rktrktlvha7go1.R.inc(36601);assertNull(StringUtils.replace(null, null, null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36602);assertNull(StringUtils.replace(null, null, "any", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36603);assertNull(StringUtils.replace(null, "any", null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36604);assertNull(StringUtils.replace(null, "any", "any", 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36605);assertEquals("", StringUtils.replace("", null, null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36606);assertEquals("", StringUtils.replace("", null, "any", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36607);assertEquals("", StringUtils.replace("", "any", null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36608);assertEquals("", StringUtils.replace("", "any", "any", 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36609);final String str = new String(new char[]{'o', 'o', 'f', 'o', 'o'});
        __CLR4_5_2rktrktlvha7go1.R.inc(36610);assertSame(str, StringUtils.replace(str, "x", "", -1));

        __CLR4_5_2rktrktlvha7go1.R.inc(36611);assertEquals("f", StringUtils.replace("oofoo", "o", "", -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36612);assertEquals("oofoo", StringUtils.replace("oofoo", "o", "", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36613);assertEquals("ofoo", StringUtils.replace("oofoo", "o", "", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36614);assertEquals("foo", StringUtils.replace("oofoo", "o", "", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36615);assertEquals("fo", StringUtils.replace("oofoo", "o", "", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36616);assertEquals("f", StringUtils.replace("oofoo", "o", "", 4));

        __CLR4_5_2rktrktlvha7go1.R.inc(36617);assertEquals("f", StringUtils.replace("oofoo", "o", "", -5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36618);assertEquals("f", StringUtils.replace("oofoo", "o", "", 1000));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceIgnoreCase_StringStringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yobi60s97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceIgnoreCase_StringStringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yobi60s97(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36619);
        __CLR4_5_2rktrktlvha7go1.R.inc(36620);assertEquals(null, StringUtils.replaceIgnoreCase(null, null, null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36621);assertEquals(null, StringUtils.replaceIgnoreCase(null, null, "any", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36622);assertEquals(null, StringUtils.replaceIgnoreCase(null, "any", null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36623);assertEquals(null, StringUtils.replaceIgnoreCase(null, "any", "any", 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36624);assertEquals("", StringUtils.replaceIgnoreCase("", null, null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36625);assertEquals("", StringUtils.replaceIgnoreCase("", null, "any", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36626);assertEquals("", StringUtils.replaceIgnoreCase("", "any", null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36627);assertEquals("", StringUtils.replaceIgnoreCase("", "any", "any", 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36628);final String str = new String(new char[] { 'o', 'o', 'f', 'o', 'o' });
        __CLR4_5_2rktrktlvha7go1.R.inc(36629);assertSame(str, StringUtils.replaceIgnoreCase(str, "x", "", -1));

        __CLR4_5_2rktrktlvha7go1.R.inc(36630);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "o", "", -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36631);assertEquals("oofoo", StringUtils.replaceIgnoreCase("oofoo", "o", "", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36632);assertEquals("ofoo", StringUtils.replaceIgnoreCase("oofoo", "o", "", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36633);assertEquals("foo", StringUtils.replaceIgnoreCase("oofoo", "o", "", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36634);assertEquals("fo", StringUtils.replaceIgnoreCase("oofoo", "o", "", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36635);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "o", "", 4));

        __CLR4_5_2rktrktlvha7go1.R.inc(36636);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "o", "", -5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36637);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "o", "", 1000));

        // IgnoreCase
        __CLR4_5_2rktrktlvha7go1.R.inc(36638);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "O", "", -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36639);assertEquals("oofoo", StringUtils.replaceIgnoreCase("oofoo", "O", "", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36640);assertEquals("ofoo", StringUtils.replaceIgnoreCase("oofoo", "O", "", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36641);assertEquals("foo", StringUtils.replaceIgnoreCase("oofoo", "O", "", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36642);assertEquals("fo", StringUtils.replaceIgnoreCase("oofoo", "O", "", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36643);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "O", "", 4));

        __CLR4_5_2rktrktlvha7go1.R.inc(36644);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "O", "", -5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36645);assertEquals("f", StringUtils.replaceIgnoreCase("oofoo", "O", "", 1000));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceOnce_StringStringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2llx8fes9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceOnce_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2llx8fes9y(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36646);
        __CLR4_5_2rktrktlvha7go1.R.inc(36647);assertNull(StringUtils.replaceOnce(null, null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36648);assertNull(StringUtils.replaceOnce(null, null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36649);assertNull(StringUtils.replaceOnce(null, "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36650);assertNull(StringUtils.replaceOnce(null, "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36651);assertEquals("", StringUtils.replaceOnce("", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36652);assertEquals("", StringUtils.replaceOnce("", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36653);assertEquals("", StringUtils.replaceOnce("", "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36654);assertEquals("", StringUtils.replaceOnce("", "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36655);assertEquals("FOO", StringUtils.replaceOnce("FOO", "", "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36656);assertEquals("FOO", StringUtils.replaceOnce("FOO", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36657);assertEquals("FOO", StringUtils.replaceOnce("FOO", "F", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36658);assertEquals("FOO", StringUtils.replaceOnce("FOO", null, null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36659);assertEquals("foofoo", StringUtils.replaceOnce("foofoofoo", "foo", ""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceOnceIgnoreCase_StringStringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2daug6ksac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceOnceIgnoreCase_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2daug6ksac(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36660);
        __CLR4_5_2rktrktlvha7go1.R.inc(36661);assertEquals(null, StringUtils.replaceOnceIgnoreCase(null, null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36662);assertEquals(null, StringUtils.replaceOnceIgnoreCase(null, null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36663);assertEquals(null, StringUtils.replaceOnceIgnoreCase(null, "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36664);assertEquals(null, StringUtils.replaceOnceIgnoreCase(null, "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36665);assertEquals("", StringUtils.replaceOnceIgnoreCase("", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36666);assertEquals("", StringUtils.replaceOnceIgnoreCase("", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36667);assertEquals("", StringUtils.replaceOnceIgnoreCase("", "any", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36668);assertEquals("", StringUtils.replaceOnceIgnoreCase("", "any", "any"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36669);assertEquals("FOO", StringUtils.replaceOnceIgnoreCase("FOO", "", "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36670);assertEquals("FOO", StringUtils.replaceOnceIgnoreCase("FOO", null, "any"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36671);assertEquals("FOO", StringUtils.replaceOnceIgnoreCase("FOO", "F", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36672);assertEquals("FOO", StringUtils.replaceOnceIgnoreCase("FOO", null, null));

        __CLR4_5_2rktrktlvha7go1.R.inc(36673);assertEquals("foofoo", StringUtils.replaceOnceIgnoreCase("foofoofoo", "foo", ""));

        // Ignore Case
        __CLR4_5_2rktrktlvha7go1.R.inc(36674);assertEquals("Foofoo", StringUtils.replaceOnceIgnoreCase("FoOFoofoo", "foo", ""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Test method for 'StringUtils.replaceEach(String, String[], String[])'
     */
    @Test
    public void testReplace_StringStringArrayStringArray() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xr60mjsar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringArrayStringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xr60mjsar(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36675);
        //JAVADOC TESTS START
        __CLR4_5_2rktrktlvha7go1.R.inc(36676);assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(36677);assertEquals(StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(36678);assertEquals(StringUtils.replaceEach("aba", null, null), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36679);assertEquals(StringUtils.replaceEach("aba", new String[0], null), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36680);assertEquals(StringUtils.replaceEach("aba", null, new String[0]), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36681);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, null), "aba");

        __CLR4_5_2rktrktlvha7go1.R.inc(36682);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}), "b");
        __CLR4_5_2rktrktlvha7go1.R.inc(36683);assertEquals(StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36684);assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}), "wcte");
        __CLR4_5_2rktrktlvha7go1.R.inc(36685);assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}), "dcte");
        //JAVADOC TESTS END

        __CLR4_5_2rktrktlvha7go1.R.inc(36686);assertEquals("bcc", StringUtils.replaceEach("abc", new String[]{"a", "b"}, new String[]{"b", "c"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(36687);assertEquals("q651.506bera", StringUtils.replaceEach("d216.102oren",
                new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                        "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D",
                        "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                        "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
                new String[]{"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a",
                        "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "N", "O", "P", "Q",
                        "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G",
                        "H", "I", "J", "K", "L", "M", "5", "6", "7", "8", "9", "1", "2", "3", "4"}));

        // Test null safety inside arrays - LANG-552
        __CLR4_5_2rktrktlvha7go1.R.inc(36688);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{null}), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36689);assertEquals(StringUtils.replaceEach("aba", new String[]{"a", "b"}, new String[]{"c", null}), "cbc");

        __CLR4_5_2rktrktlvha7go1.R.inc(36690);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(36691);StringUtils.replaceEach("abba", new String[]{"a"}, new String[]{"b", "a"});
            __CLR4_5_2rktrktlvha7go1.R.inc(36692);fail("StringUtils.replaceEach(String, String[], String[]) expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Test method for 'StringUtils.replaceEachRepeatedly(String, String[], String[])'
     */
    @Test
    public void testReplace_StringStringArrayStringArrayBoolean() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqk39dsb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringArrayStringArrayBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqk39dsb9(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36693);
        //JAVADOC TESTS START
        __CLR4_5_2rktrktlvha7go1.R.inc(36694);assertNull(StringUtils.replaceEachRepeatedly(null, new String[]{"a"}, new String[]{"b"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(36695);assertEquals(StringUtils.replaceEachRepeatedly("", new String[]{"a"}, new String[]{"b"}), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(36696);assertEquals(StringUtils.replaceEachRepeatedly("aba", null, null), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36697);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36698);assertEquals(StringUtils.replaceEachRepeatedly("aba", null, new String[0]), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36699);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null), "aba");

        __CLR4_5_2rktrktlvha7go1.R.inc(36700);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{""}), "b");
        __CLR4_5_2rktrktlvha7go1.R.inc(36701);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{null}, new String[]{"a"}), "aba");
        __CLR4_5_2rktrktlvha7go1.R.inc(36702);assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}), "wcte");
        __CLR4_5_2rktrktlvha7go1.R.inc(36703);assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}), "tcte");

        __CLR4_5_2rktrktlvha7go1.R.inc(36704);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(36705);StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"});
            __CLR4_5_2rktrktlvha7go1.R.inc(36706);fail("Should be a circular reference");
        } catch (final IllegalStateException e) {
        }

        //JAVADOC TESTS END
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceChars_StringCharChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27pq7ncsbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceChars_StringCharChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27pq7ncsbn(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36707);
        __CLR4_5_2rktrktlvha7go1.R.inc(36708);assertNull(StringUtils.replaceChars(null, 'b', 'z'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36709);assertEquals("", StringUtils.replaceChars("", 'b', 'z'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36710);assertEquals("azcza", StringUtils.replaceChars("abcba", 'b', 'z'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36711);assertEquals("abcba", StringUtils.replaceChars("abcba", 'x', 'z'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReplaceChars_StringStringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y7n6wysbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceChars_StringStringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y7n6wysbs(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36712);
        __CLR4_5_2rktrktlvha7go1.R.inc(36713);assertNull(StringUtils.replaceChars(null, null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36714);assertNull(StringUtils.replaceChars(null, "", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36715);assertNull(StringUtils.replaceChars(null, "a", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36716);assertNull(StringUtils.replaceChars(null, null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36717);assertNull(StringUtils.replaceChars(null, null, "x"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36718);assertEquals("", StringUtils.replaceChars("", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36719);assertEquals("", StringUtils.replaceChars("", "", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36720);assertEquals("", StringUtils.replaceChars("", "a", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36721);assertEquals("", StringUtils.replaceChars("", null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36722);assertEquals("", StringUtils.replaceChars("", null, "x"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36723);assertEquals("abc", StringUtils.replaceChars("abc", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36724);assertEquals("abc", StringUtils.replaceChars("abc", null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36725);assertEquals("abc", StringUtils.replaceChars("abc", null, "x"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36726);assertEquals("abc", StringUtils.replaceChars("abc", "", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36727);assertEquals("abc", StringUtils.replaceChars("abc", "", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36728);assertEquals("abc", StringUtils.replaceChars("abc", "", "x"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36729);assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36730);assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36731);assertEquals("axc", StringUtils.replaceChars("abc", "b", "x"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36732);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36733);assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36734);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));

        __CLR4_5_2rktrktlvha7go1.R.inc(36735);assertEquals("abcba", StringUtils.replaceChars("abcba", "z", "w"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36736);assertSame("abcba", StringUtils.replaceChars("abcba", "z", "w"));

        // Javadoc examples:
        __CLR4_5_2rktrktlvha7go1.R.inc(36737);assertEquals("jelly", StringUtils.replaceChars("hello", "ho", "jy"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36738);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36739);assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36740);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));

        // From http://issues.apache.org/bugzilla/show_bug.cgi?id=25454
        __CLR4_5_2rktrktlvha7go1.R.inc(36741);assertEquals("bcc", StringUtils.replaceChars("abc", "ab", "bc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36742);assertEquals("q651.506bera", StringUtils.replaceChars("d216.102oren",
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789",
                "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM567891234"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testOverlay_StringStringIntInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26tifqiscn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testOverlay_StringStringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26tifqiscn(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36743);
        __CLR4_5_2rktrktlvha7go1.R.inc(36744);assertNull(StringUtils.overlay(null, null, 2, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36745);assertNull(StringUtils.overlay(null, null, -2, -4));

        __CLR4_5_2rktrktlvha7go1.R.inc(36746);assertEquals("", StringUtils.overlay("", null, 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36747);assertEquals("", StringUtils.overlay("", "", 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36748);assertEquals("zzzz", StringUtils.overlay("", "zzzz", 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36749);assertEquals("zzzz", StringUtils.overlay("", "zzzz", 2, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36750);assertEquals("zzzz", StringUtils.overlay("", "zzzz", -2, -4));

        __CLR4_5_2rktrktlvha7go1.R.inc(36751);assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36752);assertEquals("abef", StringUtils.overlay("abcdef", null, 4, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36753);assertEquals("abef", StringUtils.overlay("abcdef", "", 2, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36754);assertEquals("abef", StringUtils.overlay("abcdef", "", 4, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36755);assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36756);assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36757);assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36758);assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", 4, -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36759);assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36760);assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -1, -2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36761);assertEquals("abcdzzzz", StringUtils.overlay("abcdef", "zzzz", 4, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(36762);assertEquals("abcdzzzz", StringUtils.overlay("abcdef", "zzzz", 10, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36763);assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(36764);assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 10, 8));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRepeat_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_240c3pvsd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRepeat_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_240c3pvsd9(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36765);
        __CLR4_5_2rktrktlvha7go1.R.inc(36766);assertNull(StringUtils.repeat(null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36767);assertEquals("", StringUtils.repeat("ab", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36768);assertEquals("", StringUtils.repeat("", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36769);assertEquals("aaa", StringUtils.repeat("a", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36770);assertEquals("", StringUtils.repeat("a", -2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36771);assertEquals("ababab", StringUtils.repeat("ab", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36772);assertEquals("abcabcabc", StringUtils.repeat("abc", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36773);final String str = StringUtils.repeat("a", 10000);  // bigger than pad limit
        __CLR4_5_2rktrktlvha7go1.R.inc(36774);assertEquals(10000, str.length());
        __CLR4_5_2rktrktlvha7go1.R.inc(36775);assertTrue(StringUtils.containsOnly(str, new char[]{'a'}));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRepeat_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2usfnmqsdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRepeat_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2usfnmqsdk(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36776);
        __CLR4_5_2rktrktlvha7go1.R.inc(36777);assertNull(StringUtils.repeat(null, null, 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36778);assertNull(StringUtils.repeat(null, "x", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36779);assertEquals("", StringUtils.repeat("", null, 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36780);assertEquals("", StringUtils.repeat("ab", "", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36781);assertEquals("", StringUtils.repeat("", "", 2));

        __CLR4_5_2rktrktlvha7go1.R.inc(36782);assertEquals("xx", StringUtils.repeat("", "x", 3));

        __CLR4_5_2rktrktlvha7go1.R.inc(36783);assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRepeat_CharInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23i20lqsds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRepeat_CharInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23i20lqsds(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36784);
        __CLR4_5_2rktrktlvha7go1.R.inc(36785);assertEquals("zzz", StringUtils.repeat('z', 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(36786);assertEquals("", StringUtils.repeat('z', 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36787);assertEquals("", StringUtils.repeat('z', -2));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testChop() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23k2mtdsdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testChop",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36788,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23k2mtdsdw(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36788);

        __CLR4_5_2rktrktlvha7go1.R.inc(36789);final String[][] chopCases = {
                {FOO_UNCAP + "\r\n", FOO_UNCAP},
                {FOO_UNCAP + "\n", FOO_UNCAP},
                {FOO_UNCAP + "\r", FOO_UNCAP},
                {FOO_UNCAP + " \r", FOO_UNCAP + " "},
                {"foo", "fo"},
                {"foo\nfoo", "foo\nfo"},
                {"\n", ""},
                {"\r", ""},
                {"\r\n", ""},
                {null, null},
                {"", ""},
                {"a", ""},
        };
        __CLR4_5_2rktrktlvha7go1.R.inc(36790);for (final String[] chopCase : chopCases) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36791);final String original = chopCase[0];
            __CLR4_5_2rktrktlvha7go1.R.inc(36792);final String expectedResult = chopCase[1];
            __CLR4_5_2rktrktlvha7go1.R.inc(36793);assertEquals("chop(String) failed",
                    expectedResult, StringUtils.chop(original));
        }
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testChomp() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6k98ese2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testChomp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6k98ese2(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36794);

        __CLR4_5_2rktrktlvha7go1.R.inc(36795);final String[][] chompCases = {
                {FOO_UNCAP + "\r\n", FOO_UNCAP},
                {FOO_UNCAP + "\n", FOO_UNCAP},
                {FOO_UNCAP + "\r", FOO_UNCAP},
                {FOO_UNCAP + " \r", FOO_UNCAP + " "},
                {FOO_UNCAP, FOO_UNCAP},
                {FOO_UNCAP + "\n\n", FOO_UNCAP + "\n"},
                {FOO_UNCAP + "\r\n\r\n", FOO_UNCAP + "\r\n"},
                {"foo\nfoo", "foo\nfoo"},
                {"foo\n\rfoo", "foo\n\rfoo"},
                {"\n", ""},
                {"\r", ""},
                {"a", "a"},
                {"\r\n", ""},
                {"", ""},
                {null, null},
                {FOO_UNCAP + "\n\r", FOO_UNCAP + "\n"}
        };
        __CLR4_5_2rktrktlvha7go1.R.inc(36796);for (final String[] chompCase : chompCases) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(36797);final String original = chompCase[0];
            __CLR4_5_2rktrktlvha7go1.R.inc(36798);final String expectedResult = chompCase[1];
            __CLR4_5_2rktrktlvha7go1.R.inc(36799);assertEquals("chomp(String) failed",
                    expectedResult, StringUtils.chomp(original));
        }

        }__CLR4_5_2rktrktlvha7go1.R.inc(36800);assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foobar", "bar"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36801);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", "baz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36802);assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foo", "foooo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36803);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36804);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36805);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", "foo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36806);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36807);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36808);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, "foo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36809);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36810);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36811);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("foo", "foo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36812);assertEquals("chomp(String, String) failed",
                " ", StringUtils.chomp(" foo", "foo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36813);assertEquals("chomp(String, String) failed",
                "foo ", StringUtils.chomp("foo ", "foo"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRightPad_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rr5ki7sem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rr5ki7sem(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36814);
        __CLR4_5_2rktrktlvha7go1.R.inc(36815);assertNull(StringUtils.rightPad(null, 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36816);assertEquals("     ", StringUtils.rightPad("", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36817);assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36818);assertEquals("abc", StringUtils.rightPad("abc", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36819);assertEquals("abc", StringUtils.rightPad("abc", -1));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRightPad_StringIntChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tw7lj9ses();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringIntChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tw7lj9ses(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36820);
        __CLR4_5_2rktrktlvha7go1.R.inc(36821);assertNull(StringUtils.rightPad(null, 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36822);assertEquals("     ", StringUtils.rightPad("", 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36823);assertEquals("abc  ", StringUtils.rightPad("abc", 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36824);assertEquals("abc", StringUtils.rightPad("abc", 2, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36825);assertEquals("abc", StringUtils.rightPad("abc", -1, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36826);assertEquals("abcxx", StringUtils.rightPad("abc", 5, 'x'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36827);final String str = StringUtils.rightPad("aaa", 10000, 'a');  // bigger than pad length
        __CLR4_5_2rktrktlvha7go1.R.inc(36828);assertEquals(10000, str.length());
        __CLR4_5_2rktrktlvha7go1.R.inc(36829);assertTrue(StringUtils.containsOnly(str, new char[]{'a'}));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRightPad_StringIntString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yrm04gsf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringIntString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yrm04gsf2(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36830);
        __CLR4_5_2rktrktlvha7go1.R.inc(36831);assertNull(StringUtils.rightPad(null, 5, "-+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36832);assertEquals("     ", StringUtils.rightPad("", 5, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36833);assertNull(StringUtils.rightPad(null, 8, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36834);assertEquals("abc-+-+", StringUtils.rightPad("abc", 7, "-+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36835);assertEquals("abc-+~", StringUtils.rightPad("abc", 6, "-+~"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36836);assertEquals("abc-+", StringUtils.rightPad("abc", 5, "-+~"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36837);assertEquals("abc", StringUtils.rightPad("abc", 2, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36838);assertEquals("abc", StringUtils.rightPad("abc", -1, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36839);assertEquals("abc  ", StringUtils.rightPad("abc", 5, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36840);assertEquals("abc  ", StringUtils.rightPad("abc", 5, ""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLeftPad_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qoqj7ksfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qoqj7ksfd(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36841);
        __CLR4_5_2rktrktlvha7go1.R.inc(36842);assertNull(StringUtils.leftPad(null, 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36843);assertEquals("     ", StringUtils.leftPad("", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36844);assertEquals("  abc", StringUtils.leftPad("abc", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(36845);assertEquals("abc", StringUtils.leftPad("abc", 2));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLeftPad_StringIntChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pisn7asfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringIntChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pisn7asfi(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36846);
        __CLR4_5_2rktrktlvha7go1.R.inc(36847);assertNull(StringUtils.leftPad(null, 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36848);assertEquals("     ", StringUtils.leftPad("", 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36849);assertEquals("  abc", StringUtils.leftPad("abc", 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36850);assertEquals("xxabc", StringUtils.leftPad("abc", 5, 'x'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36851);assertEquals("\uffff\uffffabc", StringUtils.leftPad("abc", 5, '\uffff'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36852);assertEquals("abc", StringUtils.leftPad("abc", 2, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36853);final String str = StringUtils.leftPad("aaa", 10000, 'a');  // bigger than pad length
        __CLR4_5_2rktrktlvha7go1.R.inc(36854);assertEquals(10000, str.length());
        __CLR4_5_2rktrktlvha7go1.R.inc(36855);assertTrue(StringUtils.containsOnly(str, new char[]{'a'}));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLeftPad_StringIntString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nh2r2psfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringIntString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nh2r2psfs(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36856);
        __CLR4_5_2rktrktlvha7go1.R.inc(36857);assertNull(StringUtils.leftPad(null, 5, "-+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36858);assertNull(StringUtils.leftPad(null, 5, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36859);assertEquals("     ", StringUtils.leftPad("", 5, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36860);assertEquals("-+-+abc", StringUtils.leftPad("abc", 7, "-+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36861);assertEquals("-+~abc", StringUtils.leftPad("abc", 6, "-+~"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36862);assertEquals("-+abc", StringUtils.leftPad("abc", 5, "-+~"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36863);assertEquals("abc", StringUtils.leftPad("abc", 2, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36864);assertEquals("abc", StringUtils.leftPad("abc", -1, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36865);assertEquals("  abc", StringUtils.leftPad("abc", 5, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36866);assertEquals("  abc", StringUtils.leftPad("abc", 5, ""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLengthString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmc6tssg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmc6tssg3(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36867);
        __CLR4_5_2rktrktlvha7go1.R.inc(36868);assertEquals(0, StringUtils.length(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36869);assertEquals(0, StringUtils.length(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36870);assertEquals(0, StringUtils.length(StringUtils.EMPTY));
        __CLR4_5_2rktrktlvha7go1.R.inc(36871);assertEquals(1, StringUtils.length("A"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36872);assertEquals(1, StringUtils.length(" "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36873);assertEquals(8, StringUtils.length("ABCDEFGH"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLengthStringBuffer() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28u42y8sga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthStringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28u42y8sga(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36874);
        __CLR4_5_2rktrktlvha7go1.R.inc(36875);assertEquals(0, StringUtils.length(new StringBuffer("")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36876);assertEquals(0, StringUtils.length(new StringBuffer(StringUtils.EMPTY)));
        __CLR4_5_2rktrktlvha7go1.R.inc(36877);assertEquals(1, StringUtils.length(new StringBuffer("A")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36878);assertEquals(1, StringUtils.length(new StringBuffer(" ")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36879);assertEquals(8, StringUtils.length(new StringBuffer("ABCDEFGH")));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLengthStringBuilder() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22089axsgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthStringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22089axsgg(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36880);
        __CLR4_5_2rktrktlvha7go1.R.inc(36881);assertEquals(0, StringUtils.length(new StringBuilder("")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36882);assertEquals(0, StringUtils.length(new StringBuilder(StringUtils.EMPTY)));
        __CLR4_5_2rktrktlvha7go1.R.inc(36883);assertEquals(1, StringUtils.length(new StringBuilder("A")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36884);assertEquals(1, StringUtils.length(new StringBuilder(" ")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36885);assertEquals(8, StringUtils.length(new StringBuilder("ABCDEFGH")));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLength_CharBuffer() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aikiv0sgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLength_CharBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aikiv0sgm(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36886);
        __CLR4_5_2rktrktlvha7go1.R.inc(36887);assertEquals(0, StringUtils.length(CharBuffer.wrap("")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36888);assertEquals(1, StringUtils.length(CharBuffer.wrap("A")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36889);assertEquals(1, StringUtils.length(CharBuffer.wrap(" ")));
        __CLR4_5_2rktrktlvha7go1.R.inc(36890);assertEquals(8, StringUtils.length(CharBuffer.wrap("ABCDEFGH")));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCenter_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27yqkzxsgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27yqkzxsgr(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36891);
        __CLR4_5_2rktrktlvha7go1.R.inc(36892);assertNull(StringUtils.center(null, -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36893);assertNull(StringUtils.center(null, 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36894);assertEquals("    ", StringUtils.center("", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36895);assertEquals("ab", StringUtils.center("ab", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36896);assertEquals("ab", StringUtils.center("ab", -1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36897);assertEquals("ab", StringUtils.center("ab", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36898);assertEquals("    ", StringUtils.center("", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36899);assertEquals(" ab ", StringUtils.center("ab", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36900);assertEquals("abcd", StringUtils.center("abcd", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36901);assertEquals(" a  ", StringUtils.center("a", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(36902);assertEquals("  a  ", StringUtils.center("a", 5));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testCenter_StringIntChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gb10u5sh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringIntChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gb10u5sh3(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36903);
        __CLR4_5_2rktrktlvha7go1.R.inc(36904);assertNull(StringUtils.center(null, -1, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36905);assertNull(StringUtils.center(null, 4, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36906);assertEquals("    ", StringUtils.center("", 4, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36907);assertEquals("ab", StringUtils.center("ab", 0, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36908);assertEquals("ab", StringUtils.center("ab", -1, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36909);assertEquals("ab", StringUtils.center("ab", 1, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36910);assertEquals("    ", StringUtils.center("", 4, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36911);assertEquals(" ab ", StringUtils.center("ab", 4, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36912);assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36913);assertEquals(" a  ", StringUtils.center("a", 4, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36914);assertEquals("  a  ", StringUtils.center("a", 5, ' '));
        __CLR4_5_2rktrktlvha7go1.R.inc(36915);assertEquals("xxaxx", StringUtils.center("a", 5, 'x'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testCenter_StringIntString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttv3a6shg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringIntString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttv3a6shg(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36916);
        __CLR4_5_2rktrktlvha7go1.R.inc(36917);assertNull(StringUtils.center(null, 4, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36918);assertNull(StringUtils.center(null, -1, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36919);assertNull(StringUtils.center(null, 4, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36920);assertEquals("    ", StringUtils.center("", 4, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36921);assertEquals("ab", StringUtils.center("ab", 0, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36922);assertEquals("ab", StringUtils.center("ab", -1, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36923);assertEquals("ab", StringUtils.center("ab", 1, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36924);assertEquals("    ", StringUtils.center("", 4, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36925);assertEquals(" ab ", StringUtils.center("ab", 4, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36926);assertEquals("abcd", StringUtils.center("abcd", 2, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36927);assertEquals(" a  ", StringUtils.center("a", 4, " "));
        __CLR4_5_2rktrktlvha7go1.R.inc(36928);assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36929);assertEquals("yzyayzy", StringUtils.center("a", 7, "yz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36930);assertEquals("  abc  ", StringUtils.center("abc", 7, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36931);assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRotate_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2er28h9shw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRotate_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2er28h9shw(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36932);
        __CLR4_5_2rktrktlvha7go1.R.inc(36933);assertEquals(null, StringUtils.rotate(null, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36934);assertEquals("", StringUtils.rotate("", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(36935);assertEquals("abcdefg", StringUtils.rotate("abcdefg", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(36936);assertEquals("fgabcde", StringUtils.rotate("abcdefg", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36937);assertEquals("cdefgab", StringUtils.rotate("abcdefg", -2));
        __CLR4_5_2rktrktlvha7go1.R.inc(36938);assertEquals("abcdefg", StringUtils.rotate("abcdefg", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(36939);assertEquals("abcdefg", StringUtils.rotate("abcdefg", -7));
        __CLR4_5_2rktrktlvha7go1.R.inc(36940);assertEquals("fgabcde", StringUtils.rotate("abcdefg", 9));
        __CLR4_5_2rktrktlvha7go1.R.inc(36941);assertEquals("cdefgab", StringUtils.rotate("abcdefg", -9));
        __CLR4_5_2rktrktlvha7go1.R.inc(36942);assertEquals("efgabcd", StringUtils.rotate("abcdefg", 17));
        __CLR4_5_2rktrktlvha7go1.R.inc(36943);assertEquals("defgabc", StringUtils.rotate("abcdefg", -17));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReverse_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p35ajrsi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReverse_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p35ajrsi8(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36944);
        __CLR4_5_2rktrktlvha7go1.R.inc(36945);assertNull(StringUtils.reverse(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36946);assertEquals("", StringUtils.reverse(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36947);assertEquals("sdrawkcab", StringUtils.reverse("backwards"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testReverseDelimited_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k21aecsic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReverseDelimited_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k21aecsic(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36948);
        __CLR4_5_2rktrktlvha7go1.R.inc(36949);assertNull(StringUtils.reverseDelimited(null, '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36950);assertEquals("", StringUtils.reverseDelimited("", '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36951);assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36952);assertEquals("a b c", StringUtils.reverseDelimited("a b c", '.'));
        __CLR4_5_2rktrktlvha7go1.R.inc(36953);assertEquals("", StringUtils.reverseDelimited("", '.'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDefault_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23yepfssii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefault_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23yepfssii(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36954);
        __CLR4_5_2rktrktlvha7go1.R.inc(36955);assertEquals("", StringUtils.defaultString(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(36956);assertEquals("", StringUtils.defaultString(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(36957);assertEquals("abc", StringUtils.defaultString("abc"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefault_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bv7vkpsim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefault_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bv7vkpsim(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36958);
        __CLR4_5_2rktrktlvha7go1.R.inc(36959);assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36960);assertEquals("", StringUtils.defaultString("", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36961);assertEquals("abc", StringUtils.defaultString("abc", "NULL"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bw98jrsiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bw98jrsiq(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36962);
        __CLR4_5_2rktrktlvha7go1.R.inc(36963);assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36964);assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36965);assertEquals("abc", StringUtils.defaultIfEmpty("abc", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36966);assertNull(StringUtils.defaultIfEmpty("", null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(36967);final String s = StringUtils.defaultIfEmpty("abc", "NULL");
        __CLR4_5_2rktrktlvha7go1.R.inc(36968);assertEquals("abc", s);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vk73ggsix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vk73ggsix(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36969);
        __CLR4_5_2rktrktlvha7go1.R.inc(36970);assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36971);assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36972);assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36973);assertEquals("abc", StringUtils.defaultIfBlank("abc", "NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36974);assertNull(StringUtils.defaultIfBlank("", null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(36975);final String s = StringUtils.defaultIfBlank("abc", "NULL");
        __CLR4_5_2rktrktlvha7go1.R.inc(36976);assertEquals("abc", s);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringBuilders() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nzicr2sj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringBuilders",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nzicr2sj5(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36977);
        __CLR4_5_2rktrktlvha7go1.R.inc(36978);assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuilder(""), new StringBuilder("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36979);assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36980);assertNull(StringUtils.defaultIfEmpty(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(36981);final StringBuilder s = StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36982);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringBuilders() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rxq51jsjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringBuilders",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rxq51jsjb(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36983);
        __CLR4_5_2rktrktlvha7go1.R.inc(36984);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(""), new StringBuilder("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36985);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(" "), new StringBuilder("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36986);assertEquals("abc", StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36987);assertNull(StringUtils.defaultIfBlank(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(36988);final StringBuilder s = StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36989);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringBuffers() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oqjb6dsji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringBuffers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oqjb6dsji(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36990);
        __CLR4_5_2rktrktlvha7go1.R.inc(36991);assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuffer(""), new StringBuffer("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36992);assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36993);assertNull(StringUtils.defaultIfEmpty(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(36994);final StringBuffer s = StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(36995);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringBuffers() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),36996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mbgltasjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringBuffers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),36996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mbgltasjo(){try{__CLR4_5_2rktrktlvha7go1.R.inc(36996);
        __CLR4_5_2rktrktlvha7go1.R.inc(36997);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(""), new StringBuffer("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36998);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(" "), new StringBuffer("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(36999);assertEquals("abc", StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37000);assertNull(StringUtils.defaultIfBlank(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(37001);final StringBuffer s = StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37002);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_CharBuffers() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2apr8pysjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_CharBuffers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2apr8pysjv(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37003);
        __CLR4_5_2rktrktlvha7go1.R.inc(37004);assertEquals("NULL", StringUtils.defaultIfEmpty(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37005);assertEquals("abc", StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37006);assertNull(StringUtils.defaultIfEmpty(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(37007);final CharBuffer s = StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37008);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_CharBuffers() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vxhg1fsk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_CharBuffers",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vxhg1fsk1(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37009);
        __CLR4_5_2rktrktlvha7go1.R.inc(37010);assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37011);assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(" "), CharBuffer.wrap("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37012);assertEquals("abc", StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        __CLR4_5_2rktrktlvha7go1.R.inc(37013);assertNull(StringUtils.defaultIfBlank(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        __CLR4_5_2rktrktlvha7go1.R.inc(37014);final CharBuffer s = StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37015);assertEquals("abc", s.toString());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAbbreviate_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lbb5wdsk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lbb5wdsk8(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37016);
        __CLR4_5_2rktrktlvha7go1.R.inc(37017);assertNull(StringUtils.abbreviate(null, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37018);assertEquals("", StringUtils.abbreviate("", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37019);assertEquals("short", StringUtils.abbreviate("short", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37020);assertEquals("Now is ...", StringUtils.abbreviate("Now is the time for all good men to come to the aid of their party.", 10));

        __CLR4_5_2rktrktlvha7go1.R.inc(37021);final String raspberry = "raspberry peach";
        __CLR4_5_2rktrktlvha7go1.R.inc(37022);assertEquals("raspberry p...", StringUtils.abbreviate(raspberry, 14));
        __CLR4_5_2rktrktlvha7go1.R.inc(37023);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 15));
        __CLR4_5_2rktrktlvha7go1.R.inc(37024);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 16));
        __CLR4_5_2rktrktlvha7go1.R.inc(37025);assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37026);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37027);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37028);assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(37029);assertEquals("", StringUtils.abbreviate("", 4));

        __CLR4_5_2rktrktlvha7go1.R.inc(37030);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37031);StringUtils.abbreviate("abc", 3);
            __CLR4_5_2rktrktlvha7go1.R.inc(37032);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testAbbreviate_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g95gxeskp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g95gxeskp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37033);
        __CLR4_5_2rktrktlvha7go1.R.inc(37034);assertNull(StringUtils.abbreviate(null, null, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37035);assertNull(StringUtils.abbreviate(null, "...", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37036);assertEquals("paranaguacu", StringUtils.abbreviate("paranaguacu", null, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37037);assertEquals("", StringUtils.abbreviate("", "...", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(37038);assertEquals("wai**", StringUtils.abbreviate("waiheke", "**", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(37039);assertEquals("And af,,,,", StringUtils.abbreviate("And after a long time, he finally met his son.", ",,,,", 10));

        __CLR4_5_2rktrktlvha7go1.R.inc(37040);final String raspberry = "raspberry peach";
        __CLR4_5_2rktrktlvha7go1.R.inc(37041);assertEquals("raspberry pe..", StringUtils.abbreviate(raspberry, "..", 14));
        __CLR4_5_2rktrktlvha7go1.R.inc(37042);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", "---*---", 15));
        __CLR4_5_2rktrktlvha7go1.R.inc(37043);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", ".", 16));
        __CLR4_5_2rktrktlvha7go1.R.inc(37044);assertEquals("abc()(", StringUtils.abbreviate("abcdefg", "()(", 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37045);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", ";", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37046);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", "_-", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37047);assertEquals("abc.", StringUtils.abbreviate("abcdefg", ".", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(37048);assertEquals("", StringUtils.abbreviate("", 4));

        __CLR4_5_2rktrktlvha7go1.R.inc(37049);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37050);@SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abcdefghij", "...", 3);
            __CLR4_5_2rktrktlvha7go1.R.inc(37051);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testAbbreviate_StringIntInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jsthuisl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jsthuisl8(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37052);
        __CLR4_5_2rktrktlvha7go1.R.inc(37053);assertNull(StringUtils.abbreviate(null, 10, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37054);assertEquals("", StringUtils.abbreviate("", 0, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37055);assertEquals("", StringUtils.abbreviate("", 2, 10));

        __CLR4_5_2rktrktlvha7go1.R.inc(37056);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37057);StringUtils.abbreviate("abcdefghij", 0, 3);
            __CLR4_5_2rktrktlvha7go1.R.inc(37058);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // empty
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37059);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37060);StringUtils.abbreviate("abcdefghij", 5, 6);
            __CLR4_5_2rktrktlvha7go1.R.inc(37061);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // empty
        }


        __CLR4_5_2rktrktlvha7go1.R.inc(37062);final String raspberry = "raspberry peach";
        __CLR4_5_2rktrktlvha7go1.R.inc(37063);assertEquals("raspberry peach", StringUtils.abbreviate(raspberry, 11, 15));

        __CLR4_5_2rktrktlvha7go1.R.inc(37064);assertNull(StringUtils.abbreviate(null, 7, 14));
        __CLR4_5_2rktrktlvha7go1.R.inc(37065);assertAbbreviateWithOffset("abcdefg...", -1, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37066);assertAbbreviateWithOffset("abcdefg...", 0, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37067);assertAbbreviateWithOffset("abcdefg...", 1, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37068);assertAbbreviateWithOffset("abcdefg...", 2, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37069);assertAbbreviateWithOffset("abcdefg...", 3, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37070);assertAbbreviateWithOffset("abcdefg...", 4, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37071);assertAbbreviateWithOffset("...fghi...", 5, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37072);assertAbbreviateWithOffset("...ghij...", 6, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37073);assertAbbreviateWithOffset("...hijk...", 7, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37074);assertAbbreviateWithOffset("...ijklmno", 8, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37075);assertAbbreviateWithOffset("...ijklmno", 9, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37076);assertAbbreviateWithOffset("...ijklmno", 10, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37077);assertAbbreviateWithOffset("...ijklmno", 10, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37078);assertAbbreviateWithOffset("...ijklmno", 11, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37079);assertAbbreviateWithOffset("...ijklmno", 12, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37080);assertAbbreviateWithOffset("...ijklmno", 13, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37081);assertAbbreviateWithOffset("...ijklmno", 14, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37082);assertAbbreviateWithOffset("...ijklmno", 15, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37083);assertAbbreviateWithOffset("...ijklmno", 16, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37084);assertAbbreviateWithOffset("...ijklmno", Integer.MAX_VALUE, 10);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {try{__CLR4_5_2rktrktlvha7go1.R.inc(37085);
        __CLR4_5_2rktrktlvha7go1.R.inc(37086);final String abcdefghijklmno = "abcdefghijklmno";
        __CLR4_5_2rktrktlvha7go1.R.inc(37087);final String message = "abbreviate(String,int,int) failed";
        __CLR4_5_2rktrktlvha7go1.R.inc(37088);final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        __CLR4_5_2rktrktlvha7go1.R.inc(37089);if ((((offset >= 0 && offset < abcdefghijklmno.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(37090)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37091)==0&false))) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(37092);assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char) ('a' + offset)) != -1);
        }
        }__CLR4_5_2rktrktlvha7go1.R.inc(37093);assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        __CLR4_5_2rktrktlvha7go1.R.inc(37094);assertEquals(message, expected, actual);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testAbbreviate_StringStringIntInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e9tm51smf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringStringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e9tm51smf(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37095);
        __CLR4_5_2rktrktlvha7go1.R.inc(37096);assertNull(StringUtils.abbreviate(null, null, 10, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37097);assertNull(StringUtils.abbreviate(null, "...", 10, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37098);assertEquals("", StringUtils.abbreviate("", null, 0, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37099);assertEquals("", StringUtils.abbreviate("", "...", 2, 10));

        __CLR4_5_2rktrktlvha7go1.R.inc(37100);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37101);StringUtils.abbreviate("abcdefghij", "::", 0, 2);
            __CLR4_5_2rktrktlvha7go1.R.inc(37102);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // empty
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37103);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37104);StringUtils.abbreviate("abcdefghij", "!!!", 5, 6);
            __CLR4_5_2rktrktlvha7go1.R.inc(37105);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
            // empty
        }

        __CLR4_5_2rktrktlvha7go1.R.inc(37106);final String raspberry = "raspberry peach";
        __CLR4_5_2rktrktlvha7go1.R.inc(37107);assertEquals("raspberry peach", StringUtils.abbreviate(raspberry, "--", 12, 15));

        __CLR4_5_2rktrktlvha7go1.R.inc(37108);assertNull(StringUtils.abbreviate(null, ";", 7, 14));
        __CLR4_5_2rktrktlvha7go1.R.inc(37109);assertAbbreviateWithAbbrevMarkerAndOffset("abcdefgh;;", ";;", -1, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37110);assertAbbreviateWithAbbrevMarkerAndOffset("abcdefghi.", ".", 0, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37111);assertAbbreviateWithAbbrevMarkerAndOffset("abcdefgh++", "++", 1, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37112);assertAbbreviateWithAbbrevMarkerAndOffset("abcdefghi*", "*", 2, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37113);assertAbbreviateWithAbbrevMarkerAndOffset("abcdef{{{{", "{{{{", 4, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37114);assertAbbreviateWithAbbrevMarkerAndOffset("abcdef____", "____", 5, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37115);assertAbbreviateWithAbbrevMarkerAndOffset("==fghijk==", "==", 5, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37116);assertAbbreviateWithAbbrevMarkerAndOffset("___ghij___", "___", 6, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37117);assertAbbreviateWithAbbrevMarkerAndOffset("/ghijklmno", "/", 7, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37118);assertAbbreviateWithAbbrevMarkerAndOffset("/ghijklmno", "/", 8, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37119);assertAbbreviateWithAbbrevMarkerAndOffset("/ghijklmno", "/", 9, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37120);assertAbbreviateWithAbbrevMarkerAndOffset("///ijklmno", "///", 10, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37121);assertAbbreviateWithAbbrevMarkerAndOffset("//hijklmno", "//", 10, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37122);assertAbbreviateWithAbbrevMarkerAndOffset("//hijklmno", "//", 11, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37123);assertAbbreviateWithAbbrevMarkerAndOffset("...ijklmno", "...", 12, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37124);assertAbbreviateWithAbbrevMarkerAndOffset("/ghijklmno", "/", 13, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37125);assertAbbreviateWithAbbrevMarkerAndOffset("/ghijklmno", "/", 14, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37126);assertAbbreviateWithAbbrevMarkerAndOffset("999ijklmno", "999", 15, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37127);assertAbbreviateWithAbbrevMarkerAndOffset("_ghijklmno", "_", 16, 10);
        __CLR4_5_2rktrktlvha7go1.R.inc(37128);assertAbbreviateWithAbbrevMarkerAndOffset("+ghijklmno", "+", Integer.MAX_VALUE, 10);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    private void assertAbbreviateWithAbbrevMarkerAndOffset(final String expected, final String abbrevMarker, final int offset, final int maxWidth) {try{__CLR4_5_2rktrktlvha7go1.R.inc(37129);
        __CLR4_5_2rktrktlvha7go1.R.inc(37130);final String abcdefghijklmno = "abcdefghijklmno";
        __CLR4_5_2rktrktlvha7go1.R.inc(37131);final String message = "abbreviate(String,String,int,int) failed";
        __CLR4_5_2rktrktlvha7go1.R.inc(37132);final String actual = StringUtils.abbreviate(abcdefghijklmno, abbrevMarker, offset, maxWidth);
        __CLR4_5_2rktrktlvha7go1.R.inc(37133);if ((((offset >= 0 && offset < abcdefghijklmno.length())&&(__CLR4_5_2rktrktlvha7go1.R.iget(37134)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37135)==0&false))) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(37136);assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char) ('a' + offset)) != -1);
        }
        }__CLR4_5_2rktrktlvha7go1.R.inc(37137);assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        __CLR4_5_2rktrktlvha7go1.R.inc(37138);assertEquals(message, expected, actual);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testAbbreviateMiddle() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qw9nx5snn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviateMiddle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qw9nx5snn(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37139);
        // javadoc examples
        __CLR4_5_2rktrktlvha7go1.R.inc(37140);assertNull(StringUtils.abbreviateMiddle(null, null, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37141);assertEquals("abc", StringUtils.abbreviateMiddle("abc", null, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37142);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37143);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37144);assertEquals("ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4));

        // JIRA issue (LANG-405) example (slightly different than actual expected result)
        __CLR4_5_2rktrktlvha7go1.R.inc(37145);assertEquals(
                "A very long text with un...f the text is complete.",
                StringUtils.abbreviateMiddle(
                        "A very long text with unimportant stuff in the middle but interesting start and " +
                                "end to see if the text is complete.", "...", 50));

        // Test a much longer text :)
        __CLR4_5_2rktrktlvha7go1.R.inc(37146);final String longText = "Start text" + StringUtils.repeat("x", 10000) + "Close text";
        __CLR4_5_2rktrktlvha7go1.R.inc(37147);assertEquals(
                "Start text->Close text",
                StringUtils.abbreviateMiddle(longText, "->", 22));

        // Test negative length
        __CLR4_5_2rktrktlvha7go1.R.inc(37148);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", -1));

        // Test boundaries
        // Fails to change anything as method ensures first and last char are kept
        __CLR4_5_2rktrktlvha7go1.R.inc(37149);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37150);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 2));

        // Test length of n=1
        __CLR4_5_2rktrktlvha7go1.R.inc(37151);assertEquals("a", StringUtils.abbreviateMiddle("a", ".", 1));

        // Test smallest length that can lead to success
        __CLR4_5_2rktrktlvha7go1.R.inc(37152);assertEquals("a.d", StringUtils.abbreviateMiddle("abcd", ".", 3));

        // More from LANG-405
        __CLR4_5_2rktrktlvha7go1.R.inc(37153);assertEquals("a..f", StringUtils.abbreviateMiddle("abcdef", "..", 4));
        __CLR4_5_2rktrktlvha7go1.R.inc(37154);assertEquals("ab.ef", StringUtils.abbreviateMiddle("abcdef", ".", 5));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTruncate_StringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27cnc3mso3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testTruncate_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27cnc3mso3(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37155);
        __CLR4_5_2rktrktlvha7go1.R.inc(37156);assertNull(StringUtils.truncate(null, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37157);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37158);StringUtils.truncate(null, -1);
            __CLR4_5_2rktrktlvha7go1.R.inc(37159);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37160);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37161);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37162);StringUtils.truncate(null, -10);
            __CLR4_5_2rktrktlvha7go1.R.inc(37163);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37164);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37165);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37166);StringUtils.truncate(null, Integer.MIN_VALUE);
            __CLR4_5_2rktrktlvha7go1.R.inc(37167);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37168);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37169);assertEquals("", StringUtils.truncate("", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37170);assertEquals("", StringUtils.truncate("", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37171);assertEquals("abc", StringUtils.truncate("abcdefghij", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37172);assertEquals("abcdef", StringUtils.truncate("abcdefghij", 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37173);assertEquals("", StringUtils.truncate("abcdefghij", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37174);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37175);StringUtils.truncate("abcdefghij", -1);
            __CLR4_5_2rktrktlvha7go1.R.inc(37176);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37177);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37178);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37179);StringUtils.truncate("abcdefghij", -100);
            __CLR4_5_2rktrktlvha7go1.R.inc(37180);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37181);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37182);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37183);StringUtils.truncate("abcdefghij", Integer.MIN_VALUE);
            __CLR4_5_2rktrktlvha7go1.R.inc(37184);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37185);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37186);assertEquals("abcdefghij", StringUtils.truncate("abcdefghijklmno", 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37187);assertEquals("abcdefghijklmno", StringUtils.truncate("abcdefghijklmno", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37188);assertEquals("abcde", StringUtils.truncate("abcdefghijklmno", 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(37189);assertEquals("abc", StringUtils.truncate("abcdefghijklmno", 3));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testTruncate_StringIntInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2thccv3sp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testTruncate_StringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2thccv3sp2(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37190);
        __CLR4_5_2rktrktlvha7go1.R.inc(37191);assertNull(StringUtils.truncate(null, 0, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37192);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37193);StringUtils.truncate(null, -1, 0);
            __CLR4_5_2rktrktlvha7go1.R.inc(37194);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37195);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37196);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37197);StringUtils.truncate(null, -10, -4);
            __CLR4_5_2rktrktlvha7go1.R.inc(37198);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37199);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37200);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37201);StringUtils.truncate(null, Integer.MIN_VALUE, Integer.MIN_VALUE);
            __CLR4_5_2rktrktlvha7go1.R.inc(37202);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37203);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37204);assertNull(StringUtils.truncate(null, 10, 12));
        __CLR4_5_2rktrktlvha7go1.R.inc(37205);assertEquals("", StringUtils.truncate("", 0, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37206);assertEquals("", StringUtils.truncate("", 2, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37207);assertEquals("abc", StringUtils.truncate("abcdefghij", 0, 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37208);assertEquals("fghij", StringUtils.truncate("abcdefghij", 5, 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37209);assertEquals("", StringUtils.truncate("abcdefghij", 0, 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37210);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37211);StringUtils.truncate("abcdefghij", 0, -1);
            __CLR4_5_2rktrktlvha7go1.R.inc(37212);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37213);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37214);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37215);StringUtils.truncate("abcdefghij", 0, -10);
            __CLR4_5_2rktrktlvha7go1.R.inc(37216);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37217);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37218);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37219);StringUtils.truncate("abcdefghij", 0, -100);
            __CLR4_5_2rktrktlvha7go1.R.inc(37220);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37221);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37222);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37223);StringUtils.truncate("abcdefghij", 1, -100);
            __CLR4_5_2rktrktlvha7go1.R.inc(37224);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37225);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37226);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37227);StringUtils.truncate("abcdefghij", 0, Integer.MIN_VALUE);
            __CLR4_5_2rktrktlvha7go1.R.inc(37228);fail("maxWith cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37229);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37230);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37231);StringUtils.truncate("abcdefghij", -1, 0);
            __CLR4_5_2rktrktlvha7go1.R.inc(37232);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37233);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37234);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37235);StringUtils.truncate("abcdefghij", -10, 0);
            __CLR4_5_2rktrktlvha7go1.R.inc(37236);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37237);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37238);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37239);StringUtils.truncate("abcdefghij", -100, 1);
            __CLR4_5_2rktrktlvha7go1.R.inc(37240);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37241);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37242);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37243);StringUtils.truncate("abcdefghij", Integer.MIN_VALUE, 0);
            __CLR4_5_2rktrktlvha7go1.R.inc(37244);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37245);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37246);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37247);StringUtils.truncate("abcdefghij", -1, -1);
            __CLR4_5_2rktrktlvha7go1.R.inc(37248);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37249);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37250);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37251);StringUtils.truncate("abcdefghij", -10, -10);
            __CLR4_5_2rktrktlvha7go1.R.inc(37252);fail("offset cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37253);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37254);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37255);StringUtils.truncate("abcdefghij", -100, -100);
            __CLR4_5_2rktrktlvha7go1.R.inc(37256);fail("offset  cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37257);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37258);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37259);StringUtils.truncate("abcdefghij", Integer.MIN_VALUE, Integer.MIN_VALUE);
            __CLR4_5_2rktrktlvha7go1.R.inc(37260);fail("offset  cannot be negative");
        } catch (final Exception e) {
            __CLR4_5_2rktrktlvha7go1.R.inc(37261);assertTrue(e instanceof IllegalArgumentException);
        }
        __CLR4_5_2rktrktlvha7go1.R.inc(37262);final String raspberry = "raspberry peach";
        __CLR4_5_2rktrktlvha7go1.R.inc(37263);assertEquals("peach", StringUtils.truncate(raspberry, 10, 15));
        __CLR4_5_2rktrktlvha7go1.R.inc(37264);assertEquals("abcdefghij", StringUtils.truncate("abcdefghijklmno", 0, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37265);assertEquals("abcdefghijklmno", StringUtils.truncate("abcdefghijklmno", 0, Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37266);assertEquals("bcdefghijk", StringUtils.truncate("abcdefghijklmno", 1, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37267);assertEquals("cdefghijkl", StringUtils.truncate("abcdefghijklmno", 2, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37268);assertEquals("defghijklm", StringUtils.truncate("abcdefghijklmno", 3, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37269);assertEquals("efghijklmn", StringUtils.truncate("abcdefghijklmno", 4, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37270);assertEquals("fghijklmno", StringUtils.truncate("abcdefghijklmno", 5, 10));
        __CLR4_5_2rktrktlvha7go1.R.inc(37271);assertEquals("fghij", StringUtils.truncate("abcdefghijklmno", 5, 5));
        __CLR4_5_2rktrktlvha7go1.R.inc(37272);assertEquals("fgh", StringUtils.truncate("abcdefghijklmno", 5, 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37273);assertEquals("klm", StringUtils.truncate("abcdefghijklmno", 10, 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37274);assertEquals("klmno", StringUtils.truncate("abcdefghijklmno", 10, Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37275);assertEquals("n", StringUtils.truncate("abcdefghijklmno", 13, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37276);assertEquals("no", StringUtils.truncate("abcdefghijklmno", 13, Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37277);assertEquals("o", StringUtils.truncate("abcdefghijklmno", 14, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37278);assertEquals("o", StringUtils.truncate("abcdefghijklmno", 14, Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37279);assertEquals("", StringUtils.truncate("abcdefghijklmno", 15, 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37280);assertEquals("", StringUtils.truncate("abcdefghijklmno", 15, Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37281);assertEquals("", StringUtils.truncate("abcdefghijklmno", Integer.MAX_VALUE, Integer.MAX_VALUE));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDifference_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykaovtsrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifference_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykaovtsrm(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37282);
        __CLR4_5_2rktrktlvha7go1.R.inc(37283);assertNull(StringUtils.difference(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37284);assertEquals("", StringUtils.difference("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37285);assertEquals("abc", StringUtils.difference("", "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37286);assertEquals("", StringUtils.difference("abc", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37287);assertEquals("i am a robot", StringUtils.difference(null, "i am a robot"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37288);assertEquals("i am a machine", StringUtils.difference("i am a machine", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37289);assertEquals("robot", StringUtils.difference("i am a machine", "i am a robot"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37290);assertEquals("", StringUtils.difference("abc", "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37291);assertEquals("you are a robot", StringUtils.difference("i am a robot", "you are a robot"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDifferenceAt_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2swyxuisrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifferenceAt_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2swyxuisrw(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37292);
        __CLR4_5_2rktrktlvha7go1.R.inc(37293);assertEquals(-1, StringUtils.indexOfDifference(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37294);assertEquals(0, StringUtils.indexOfDifference(null, "i am a robot"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37295);assertEquals(-1, StringUtils.indexOfDifference("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37296);assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37297);assertEquals(0, StringUtils.indexOfDifference("abc", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37298);assertEquals(0, StringUtils.indexOfDifference("i am a machine", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37299);assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37300);assertEquals(-1, StringUtils.indexOfDifference("foo", "foo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37301);assertEquals(0, StringUtils.indexOfDifference("i am a robot", "you are a robot"));
        //System.out.println("indexOfDiff: " + StringUtils.indexOfDifference("i am a robot", "not machine"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetLevenshteinDistance_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxoquess6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxoquess6(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37302);
        __CLR4_5_2rktrktlvha7go1.R.inc(37303);assertEquals(0, StringUtils.getLevenshteinDistance("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37304);assertEquals(1, StringUtils.getLevenshteinDistance("", "a"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37305);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37306);assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37307);assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37308);assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37309);assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37310);assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37311);assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37312);assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_NullString() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmuco4ssh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,101,118,101,110,115,104,116,101,105,110,68,105,115,116,97,110,99,101,95,78,117,108,108,83,116,114,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_NullString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmuco4ssh() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37313);
        __CLR4_5_2rktrktlvha7go1.R.inc(37314);StringUtils.getLevenshteinDistance("a", null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_StringNull() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mrmcpwssj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,101,118,101,110,115,104,116,101,105,110,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mrmcpwssj() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37315);
        __CLR4_5_2rktrktlvha7go1.R.inc(37316);StringUtils.getLevenshteinDistance(null, "a");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testGetLevenshteinDistance_StringStringInt() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vwy5e1ssl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vwy5e1ssl(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37317);
        // empty strings
        __CLR4_5_2rktrktlvha7go1.R.inc(37318);assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37319);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37320);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37321);assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));

        // unequal strings, zero threshold
        __CLR4_5_2rktrktlvha7go1.R.inc(37322);assertEquals(-1, StringUtils.getLevenshteinDistance("b", "a", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37323);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "b", 0));

        // equal strings
        __CLR4_5_2rktrktlvha7go1.R.inc(37324);assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 0));
        __CLR4_5_2rktrktlvha7go1.R.inc(37325);assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 2));

        // same length
        __CLR4_5_2rktrktlvha7go1.R.inc(37326);assertEquals(-1, StringUtils.getLevenshteinDistance("aaa", "bbb", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(37327);assertEquals(3, StringUtils.getLevenshteinDistance("aaa", "bbb", 3));

        // big stripe
        __CLR4_5_2rktrktlvha7go1.R.inc(37328);assertEquals(6, StringUtils.getLevenshteinDistance("aaaaaa", "b", 10));

        // distance less than threshold
        __CLR4_5_2rktrktlvha7go1.R.inc(37329);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37330);assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 4));

        // distance equal to threshold
        __CLR4_5_2rktrktlvha7go1.R.inc(37331);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37332);assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 3));

        // distance greater than threshold
        __CLR4_5_2rktrktlvha7go1.R.inc(37333);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(37334);assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 2));
        __CLR4_5_2rktrktlvha7go1.R.inc(37335);assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "b", 6));

        // stripe runs off array, strings not similar
        __CLR4_5_2rktrktlvha7go1.R.inc(37336);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37337);assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 1));

        // stripe runs off array, strings are similar
        __CLR4_5_2rktrktlvha7go1.R.inc(37338);assertEquals(-1, StringUtils.getLevenshteinDistance("12345", "1234567", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37339);assertEquals(-1, StringUtils.getLevenshteinDistance("1234567", "12345", 1));

        // old getLevenshteinDistance test cases
        __CLR4_5_2rktrktlvha7go1.R.inc(37340);assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog", 1));
        __CLR4_5_2rktrktlvha7go1.R.inc(37341);assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant", 3));
        __CLR4_5_2rktrktlvha7go1.R.inc(37342);assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37343);assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo", 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37344);assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant", 7));
        __CLR4_5_2rktrktlvha7go1.R.inc(37345);assertEquals(-1, StringUtils.getLevenshteinDistance("hippo", "elephant", 6));
        __CLR4_5_2rktrktlvha7go1.R.inc(37346);assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37347);assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo", 8));
        __CLR4_5_2rktrktlvha7go1.R.inc(37348);assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo", 1));

        __CLR4_5_2rktrktlvha7go1.R.inc(37349);assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37350);assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37351);assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37352);assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37353);assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37354);assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo", Integer.MAX_VALUE));
        __CLR4_5_2rktrktlvha7go1.R.inc(37355);assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo", Integer.MAX_VALUE));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_NullStringInt() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wuqwhtsto();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,101,118,101,110,115,104,116,101,105,110,68,105,115,116,97,110,99,101,95,78,117,108,108,83,116,114,105,110,103,73,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_NullStringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wuqwhtsto() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37356);
        __CLR4_5_2rktrktlvha7go1.R.inc(37357);StringUtils.getLevenshteinDistance(null, "a", 0);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_StringNullInt() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1608vstq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,101,118,101,110,115,104,116,101,105,110,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,78,117,108,108,73,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringNullInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1608vstq() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37358);
        __CLR4_5_2rktrktlvha7go1.R.inc(37359);StringUtils.getLevenshteinDistance("a", null, 0);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetLevenshteinDistance_StringStringNegativeInt() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9z9umsts();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,76,101,118,101,110,115,104,116,101,105,110,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,83,116,114,105,110,103,78,101,103,97,116,105,118,101,73,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringStringNegativeInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9z9umsts() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37360);
        __CLR4_5_2rktrktlvha7go1.R.inc(37361);StringUtils.getLevenshteinDistance("a", "a", -1);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testGetJaroWinklerDistance_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rkx7cvstu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetJaroWinklerDistance_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rkx7cvstu(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37362);
        __CLR4_5_2rktrktlvha7go1.R.inc(37363);assertEquals(0.93d, StringUtils.getJaroWinklerDistance("frog", "fog"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37364);assertEquals(0.0d, StringUtils.getJaroWinklerDistance("fly", "ant"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37365);assertEquals(0.44d, StringUtils.getJaroWinklerDistance("elephant", "hippo"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37366);assertEquals(0.84d, StringUtils.getJaroWinklerDistance("dwayne", "duane"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37367);assertEquals(0.93d, StringUtils.getJaroWinklerDistance("ABC Corporation", "ABC Corp"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37368);assertEquals(0.95d, StringUtils.getJaroWinklerDistance("D N H Enterprises Inc", "D & H Enterprises, Inc."), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37369);assertEquals(0.92d, StringUtils.getJaroWinklerDistance("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37370);assertEquals(0.88d, StringUtils.getJaroWinklerDistance("PENNSYLVANIA", "PENNCISYLVNIA"), 0.0d);
        __CLR4_5_2rktrktlvha7go1.R.inc(37371);assertEquals(0.63d, StringUtils.getJaroWinklerDistance("Haus Ingeborg", "Ingeborg Esser"), 0.0d);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_NullNull() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tnstgtsu4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,74,97,114,111,87,105,110,107,108,101,114,68,105,115,116,97,110,99,101,95,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetJaroWinklerDistance_NullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tnstgtsu4() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37372);
        __CLR4_5_2rktrktlvha7go1.R.inc(37373);StringUtils.getJaroWinklerDistance(null, null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_StringNull() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eh22yxsu6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,74,97,114,111,87,105,110,107,108,101,114,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetJaroWinklerDistance_StringNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eh22yxsu6() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37374);
        __CLR4_5_2rktrktlvha7go1.R.inc(37375);StringUtils.getJaroWinklerDistance(" ", null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetJaroWinklerDistance_NullString() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jca2x5su8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,74,97,114,111,87,105,110,107,108,101,114,68,105,115,116,97,110,99,101,95,78,117,108,108,83,116,114,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetJaroWinklerDistance_NullString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jca2x5su8() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37376);
        __CLR4_5_2rktrktlvha7go1.R.inc(37377);StringUtils.getJaroWinklerDistance(null, "clear");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testGetFuzzyDistance() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21r1jpesua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetFuzzyDistance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21r1jpesua() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37378);
        __CLR4_5_2rktrktlvha7go1.R.inc(37379);assertEquals(0, StringUtils.getFuzzyDistance("", "", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37380);assertEquals(0, StringUtils.getFuzzyDistance("Workshop", "b", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37381);assertEquals(1, StringUtils.getFuzzyDistance("Room", "o", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37382);assertEquals(1, StringUtils.getFuzzyDistance("Workshop", "w", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37383);assertEquals(2, StringUtils.getFuzzyDistance("Workshop", "ws", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37384);assertEquals(4, StringUtils.getFuzzyDistance("Workshop", "wo", Locale.ENGLISH));
        __CLR4_5_2rktrktlvha7go1.R.inc(37385);assertEquals(3, StringUtils.getFuzzyDistance("Apache Software Foundation", "asf", Locale.ENGLISH));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFuzzyDistance_NullNullNull() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmj39csui();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,117,122,122,121,68,105,115,116,97,110,99,101,95,78,117,108,108,78,117,108,108,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetFuzzyDistance_NullNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmj39csui() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37386);
        __CLR4_5_2rktrktlvha7go1.R.inc(37387);StringUtils.getFuzzyDistance(null, null, null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFuzzyDistance_StringNullLoclae() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3i52rsuk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,117,122,122,121,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,78,117,108,108,76,111,99,108,97,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetFuzzyDistance_StringNullLoclae",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3i52rsuk() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37388);
        __CLR4_5_2rktrktlvha7go1.R.inc(37389);StringUtils.getFuzzyDistance(" ", null, Locale.ENGLISH);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFuzzyDistance_NullStringLocale() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dq0pfnsum();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,117,122,122,121,68,105,115,116,97,110,99,101,95,78,117,108,108,83,116,114,105,110,103,76,111,99,97,108,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetFuzzyDistance_NullStringLocale",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37390,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dq0pfnsum() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37390);
        __CLR4_5_2rktrktlvha7go1.R.inc(37391);StringUtils.getFuzzyDistance(null, "clear", Locale.ENGLISH);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFuzzyDistance_StringStringNull() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n48784suo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,117,122,122,121,68,105,115,116,97,110,99,101,95,83,116,114,105,110,103,83,116,114,105,110,103,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetFuzzyDistance_StringStringNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n48784suo() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37392);
        __CLR4_5_2rktrktlvha7go1.R.inc(37393);StringUtils.getFuzzyDistance(" ", "clear", null);
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * A sanity check for {@link StringUtils#EMPTY}.
     */
    @Test
    public void testEMPTY() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2veedvmsuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEMPTY",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2veedvmsuq(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37394);
        __CLR4_5_2rktrktlvha7go1.R.inc(37395);assertNotNull(StringUtils.EMPTY);
        __CLR4_5_2rktrktlvha7go1.R.inc(37396);assertEquals("", StringUtils.EMPTY);
        __CLR4_5_2rktrktlvha7go1.R.inc(37397);assertEquals(0, StringUtils.EMPTY.length());
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Test for {@link StringUtils#isAllLowerCase(CharSequence)}.
     */
    @Test
    public void testIsAllLowerCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2chc6tpsuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testIsAllLowerCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2chc6tpsuu(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37398);
        __CLR4_5_2rktrktlvha7go1.R.inc(37399);assertFalse(StringUtils.isAllLowerCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37400);assertFalse(StringUtils.isAllLowerCase(StringUtils.EMPTY));
        __CLR4_5_2rktrktlvha7go1.R.inc(37401);assertFalse(StringUtils.isAllLowerCase("  "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37402);assertTrue(StringUtils.isAllLowerCase("abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37403);assertFalse(StringUtils.isAllLowerCase("abc "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37404);assertFalse(StringUtils.isAllLowerCase("abc\n"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37405);assertFalse(StringUtils.isAllLowerCase("abC"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37406);assertFalse(StringUtils.isAllLowerCase("ab c"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37407);assertFalse(StringUtils.isAllLowerCase("ab1c"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37408);assertFalse(StringUtils.isAllLowerCase("ab/c"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Test for {@link StringUtils#isAllUpperCase(CharSequence)}.
     */
    @Test
    public void testIsAllUpperCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gl7ij0sv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testIsAllUpperCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gl7ij0sv5(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37409);
        __CLR4_5_2rktrktlvha7go1.R.inc(37410);assertFalse(StringUtils.isAllUpperCase(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37411);assertFalse(StringUtils.isAllUpperCase(StringUtils.EMPTY));
        __CLR4_5_2rktrktlvha7go1.R.inc(37412);assertFalse(StringUtils.isAllUpperCase("  "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37413);assertTrue(StringUtils.isAllUpperCase("ABC"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37414);assertFalse(StringUtils.isAllUpperCase("ABC "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37415);assertFalse(StringUtils.isAllUpperCase("ABC\n"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37416);assertFalse(StringUtils.isAllUpperCase("aBC"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37417);assertFalse(StringUtils.isAllUpperCase("A C"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37418);assertFalse(StringUtils.isAllUpperCase("A1C"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37419);assertFalse(StringUtils.isAllUpperCase("A/C"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveStart() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24an65psvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24an65psvg(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37420);
        // StringUtils.removeStart("", *)        = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37421);assertNull(StringUtils.removeStart(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37422);assertNull(StringUtils.removeStart(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37423);assertNull(StringUtils.removeStart(null, "a"));

        // StringUtils.removeStart(*, null)      = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37424);assertEquals(StringUtils.removeStart("", null), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37425);assertEquals(StringUtils.removeStart("", ""), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37426);assertEquals(StringUtils.removeStart("", "a"), "");

        // All others:
        __CLR4_5_2rktrktlvha7go1.R.inc(37427);assertEquals(StringUtils.removeStart("www.domain.com", "www."), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37428);assertEquals(StringUtils.removeStart("domain.com", "www."), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37429);assertEquals(StringUtils.removeStart("domain.com", ""), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37430);assertEquals(StringUtils.removeStart("domain.com", null), "domain.com");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveStartIgnoreCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ytn505svr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveStartIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ytn505svr(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37431);
        // StringUtils.removeStart("", *)        = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37432);assertNull("removeStartIgnoreCase(null, null)", StringUtils.removeStartIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37433);assertNull("removeStartIgnoreCase(null, \"\")", StringUtils.removeStartIgnoreCase(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37434);assertNull("removeStartIgnoreCase(null, \"a\")", StringUtils.removeStartIgnoreCase(null, "a"));

        // StringUtils.removeStart(*, null)      = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37435);assertEquals("removeStartIgnoreCase(\"\", null)", StringUtils.removeStartIgnoreCase("", null), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37436);assertEquals("removeStartIgnoreCase(\"\", \"\")", StringUtils.removeStartIgnoreCase("", ""), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37437);assertEquals("removeStartIgnoreCase(\"\", \"a\")", StringUtils.removeStartIgnoreCase("", "a"), "");

        // All others:
        __CLR4_5_2rktrktlvha7go1.R.inc(37438);assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "www."), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37439);assertEquals("removeStartIgnoreCase(\"domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("domain.com", "www."), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37440);assertEquals("removeStartIgnoreCase(\"domain.com\", \"\")", StringUtils.removeStartIgnoreCase("domain.com", ""), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37441);assertEquals("removeStartIgnoreCase(\"domain.com\", null)", StringUtils.removeStartIgnoreCase("domain.com", null), "domain.com");

        // Case insensitive:
        __CLR4_5_2rktrktlvha7go1.R.inc(37442);assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."), "domain.com");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveEnd() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wrivbosw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wrivbosw3(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37443);
        // StringUtils.removeEnd("", *)        = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37444);assertNull(StringUtils.removeEnd(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37445);assertNull(StringUtils.removeEnd(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37446);assertNull(StringUtils.removeEnd(null, "a"));

        // StringUtils.removeEnd(*, null)      = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37447);assertEquals(StringUtils.removeEnd("", null), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37448);assertEquals(StringUtils.removeEnd("", ""), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37449);assertEquals(StringUtils.removeEnd("", "a"), "");

        // All others:
        __CLR4_5_2rktrktlvha7go1.R.inc(37450);assertEquals(StringUtils.removeEnd("www.domain.com.", ".com"), "www.domain.com.");
        __CLR4_5_2rktrktlvha7go1.R.inc(37451);assertEquals(StringUtils.removeEnd("www.domain.com", ".com"), "www.domain");
        __CLR4_5_2rktrktlvha7go1.R.inc(37452);assertEquals(StringUtils.removeEnd("www.domain", ".com"), "www.domain");
        __CLR4_5_2rktrktlvha7go1.R.inc(37453);assertEquals(StringUtils.removeEnd("domain.com", ""), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37454);assertEquals(StringUtils.removeEnd("domain.com", null), "domain.com");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveEndIgnoreCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2badniqswf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveEndIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2badniqswf(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37455);
        // StringUtils.removeEndIgnoreCase("", *)        = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37456);assertNull("removeEndIgnoreCase(null, null)", StringUtils.removeEndIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37457);assertNull("removeEndIgnoreCase(null, \"\")", StringUtils.removeEndIgnoreCase(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37458);assertNull("removeEndIgnoreCase(null, \"a\")", StringUtils.removeEndIgnoreCase(null, "a"));

        // StringUtils.removeEnd(*, null)      = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37459);assertEquals("removeEndIgnoreCase(\"\", null)", StringUtils.removeEndIgnoreCase("", null), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37460);assertEquals("removeEndIgnoreCase(\"\", \"\")", StringUtils.removeEndIgnoreCase("", ""), "");
        __CLR4_5_2rktrktlvha7go1.R.inc(37461);assertEquals("removeEndIgnoreCase(\"\", \"a\")", StringUtils.removeEndIgnoreCase("", "a"), "");

        // All others:
        __CLR4_5_2rktrktlvha7go1.R.inc(37462);assertEquals("removeEndIgnoreCase(\"www.domain.com.\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com.", ".com"), "www.domain.com.");
        __CLR4_5_2rktrktlvha7go1.R.inc(37463);assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".com"), "www.domain");
        __CLR4_5_2rktrktlvha7go1.R.inc(37464);assertEquals("removeEndIgnoreCase(\"www.domain\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain", ".com"), "www.domain");
        __CLR4_5_2rktrktlvha7go1.R.inc(37465);assertEquals("removeEndIgnoreCase(\"domain.com\", \"\")", StringUtils.removeEndIgnoreCase("domain.com", ""), "domain.com");
        __CLR4_5_2rktrktlvha7go1.R.inc(37466);assertEquals("removeEndIgnoreCase(\"domain.com\", null)", StringUtils.removeEndIgnoreCase("domain.com", null), "domain.com");

        // Case insensitive:
        __CLR4_5_2rktrktlvha7go1.R.inc(37467);assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".COM\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"), "www.domain");
        __CLR4_5_2rktrktlvha7go1.R.inc(37468);assertEquals("removeEndIgnoreCase(\"www.domain.COM\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"), "www.domain");
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemove_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2it4735swt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemove_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2it4735swt(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37469);
        // StringUtils.remove(null, *)        = null
        __CLR4_5_2rktrktlvha7go1.R.inc(37470);assertNull(StringUtils.remove(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37471);assertNull(StringUtils.remove(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37472);assertNull(StringUtils.remove(null, "a"));

        // StringUtils.remove("", *)          = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37473);assertEquals("", StringUtils.remove("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37474);assertEquals("", StringUtils.remove("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37475);assertEquals("", StringUtils.remove("", "a"));

        // StringUtils.remove(*, null)        = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37476);assertNull(StringUtils.remove(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37477);assertEquals("", StringUtils.remove("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37478);assertEquals("a", StringUtils.remove("a", null));

        // StringUtils.remove(*, "")          = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37479);assertNull(StringUtils.remove(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37480);assertEquals("", StringUtils.remove("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37481);assertEquals("a", StringUtils.remove("a", ""));

        // StringUtils.remove("queued", "ue") = "qd"
        __CLR4_5_2rktrktlvha7go1.R.inc(37482);assertEquals("qd", StringUtils.remove("queued", "ue"));

        // StringUtils.remove("queued", "zz") = "queued"
        __CLR4_5_2rktrktlvha7go1.R.inc(37483);assertEquals("queued", StringUtils.remove("queued", "zz"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveIgnoreCase_String() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2glcvtrsx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveIgnoreCase_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2glcvtrsx8(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37484);
        // StringUtils.removeIgnoreCase(null, *) = null
        __CLR4_5_2rktrktlvha7go1.R.inc(37485);assertEquals(null, StringUtils.removeIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37486);assertEquals(null, StringUtils.removeIgnoreCase(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37487);assertEquals(null, StringUtils.removeIgnoreCase(null, "a"));

        // StringUtils.removeIgnoreCase("", *) = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37488);assertEquals("", StringUtils.removeIgnoreCase("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37489);assertEquals("", StringUtils.removeIgnoreCase("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37490);assertEquals("", StringUtils.removeIgnoreCase("", "a"));

        // StringUtils.removeIgnoreCase(*, null) = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37491);assertEquals(null, StringUtils.removeIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37492);assertEquals("", StringUtils.removeIgnoreCase("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37493);assertEquals("a", StringUtils.removeIgnoreCase("a", null));

        // StringUtils.removeIgnoreCase(*, "") = *
        __CLR4_5_2rktrktlvha7go1.R.inc(37494);assertEquals(null, StringUtils.removeIgnoreCase(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37495);assertEquals("", StringUtils.removeIgnoreCase("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37496);assertEquals("a", StringUtils.removeIgnoreCase("a", ""));

        // StringUtils.removeIgnoreCase("queued", "ue") = "qd"
        __CLR4_5_2rktrktlvha7go1.R.inc(37497);assertEquals("qd", StringUtils.removeIgnoreCase("queued", "ue"));

        // StringUtils.removeIgnoreCase("queued", "zz") = "queued"
        __CLR4_5_2rktrktlvha7go1.R.inc(37498);assertEquals("queued", StringUtils.removeIgnoreCase("queued", "zz"));

        // IgnoreCase
        // StringUtils.removeIgnoreCase("quEUed", "UE") = "qd"
        __CLR4_5_2rktrktlvha7go1.R.inc(37499);assertEquals("qd", StringUtils.removeIgnoreCase("quEUed", "UE"));

        // StringUtils.removeIgnoreCase("queued", "zZ") = "queued"
        __CLR4_5_2rktrktlvha7go1.R.inc(37500);assertEquals("queued", StringUtils.removeIgnoreCase("queued", "zZ"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemove_char() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fw3dcqsxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemove_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fw3dcqsxp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37501);
        // StringUtils.remove(null, *)       = null
        __CLR4_5_2rktrktlvha7go1.R.inc(37502);assertNull(StringUtils.remove(null, 'a'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37503);assertNull(StringUtils.remove(null, 'a'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37504);assertNull(StringUtils.remove(null, 'a'));

        // StringUtils.remove("", *)          = ""
        __CLR4_5_2rktrktlvha7go1.R.inc(37505);assertEquals("", StringUtils.remove("", 'a'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37506);assertEquals("", StringUtils.remove("", 'a'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37507);assertEquals("", StringUtils.remove("", 'a'));

        // StringUtils.remove("queued", 'u') = "qeed"
        __CLR4_5_2rktrktlvha7go1.R.inc(37508);assertEquals("qeed", StringUtils.remove("queued", 'u'));

        // StringUtils.remove("queued", 'z') = "queued"
        __CLR4_5_2rktrktlvha7go1.R.inc(37509);assertEquals("queued", StringUtils.remove("queued", 'z'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveAll() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dd9vcisxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dd9vcisxy(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37510);
        __CLR4_5_2rktrktlvha7go1.R.inc(37511);assertNull(StringUtils.removeAll(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37512);assertEquals("any", StringUtils.removeAll("any", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(37513);assertEquals("any", StringUtils.removeAll("any", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37514);assertEquals("", StringUtils.removeAll("any", ".*"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37515);assertEquals("", StringUtils.removeAll("any", ".+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37516);assertEquals("", StringUtils.removeAll("any", ".?"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37517);assertEquals("A\nB", StringUtils.removeAll("A<__>\n<__>B", "<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37518);assertEquals("AB", StringUtils.removeAll("A<__>\n<__>B", "(?s)<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37519);assertEquals("ABC123", StringUtils.removeAll("ABCabc123abc", "[a-z]"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37520);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37521);StringUtils.removeAll("any", "{badRegexSyntax}");
            __CLR4_5_2rktrktlvha7go1.R.inc(37522);fail("StringUtils.removeAll expecting PatternSyntaxException");
        } catch (final PatternSyntaxException ex) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testRemoveFirst() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uvjdjzsyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveFirst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uvjdjzsyb(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37523);
        __CLR4_5_2rktrktlvha7go1.R.inc(37524);assertNull(StringUtils.removeFirst(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37525);assertEquals("any", StringUtils.removeFirst("any", null));

        __CLR4_5_2rktrktlvha7go1.R.inc(37526);assertEquals("any", StringUtils.removeFirst("any", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37527);assertEquals("", StringUtils.removeFirst("any", ".*"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37528);assertEquals("", StringUtils.removeFirst("any", ".+"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37529);assertEquals("bc", StringUtils.removeFirst("abc", ".?"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37530);assertEquals("A\n<__>B", StringUtils.removeFirst("A<__>\n<__>B", "<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37531);assertEquals("AB", StringUtils.removeFirst("A<__>\n<__>B", "(?s)<.*>"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37532);assertEquals("ABCbc123", StringUtils.removeFirst("ABCabc123", "[a-z]"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37533);assertEquals("ABC123abc", StringUtils.removeFirst("ABCabc123abc", "[a-z]+"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37534);try {
            __CLR4_5_2rktrktlvha7go1.R.inc(37535);StringUtils.removeFirst("any", "{badRegexSyntax}");
            __CLR4_5_2rktrktlvha7go1.R.inc(37536);fail("StringUtils.removeFirst expecting PatternSyntaxException");
        } catch (final PatternSyntaxException ex) {
            // empty
        }
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testDifferenceAt_StringArray() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmfprisyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifferenceAt_StringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmfprisyp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37537);
        __CLR4_5_2rktrktlvha7go1.R.inc(37538);assertEquals(-1, StringUtils.indexOfDifference((String[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37539);assertEquals(-1, StringUtils.indexOfDifference(new String[]{}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37540);assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37541);assertEquals(-1, StringUtils.indexOfDifference(new String[]{null, null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37542);assertEquals(-1, StringUtils.indexOfDifference(new String[]{"", ""}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37543);assertEquals(0, StringUtils.indexOfDifference(new String[]{"", null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37544);assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", null, null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37545);assertEquals(0, StringUtils.indexOfDifference(new String[]{null, null, "abc"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37546);assertEquals(0, StringUtils.indexOfDifference(new String[]{"", "abc"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37547);assertEquals(0, StringUtils.indexOfDifference(new String[]{"abc", ""}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37548);assertEquals(-1, StringUtils.indexOfDifference(new String[]{"abc", "abc"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37549);assertEquals(1, StringUtils.indexOfDifference(new String[]{"abc", "a"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37550);assertEquals(2, StringUtils.indexOfDifference(new String[]{"ab", "abxyz"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37551);assertEquals(2, StringUtils.indexOfDifference(new String[]{"abcde", "abxyz"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37552);assertEquals(0, StringUtils.indexOfDifference(new String[]{"abcde", "xyz"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37553);assertEquals(0, StringUtils.indexOfDifference(new String[]{"xyz", "abcde"}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37554);assertEquals(7, StringUtils.indexOfDifference(new String[]{"i am a machine", "i am a robot"}));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testGetCommonPrefix_StringArray() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rvywk1sz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetCommonPrefix_StringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rvywk1sz7(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37555);
        __CLR4_5_2rktrktlvha7go1.R.inc(37556);assertEquals("", StringUtils.getCommonPrefix((String[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37557);assertEquals("", StringUtils.getCommonPrefix());
        __CLR4_5_2rktrktlvha7go1.R.inc(37558);assertEquals("abc", StringUtils.getCommonPrefix("abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37559);assertEquals("", StringUtils.getCommonPrefix(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37560);assertEquals("", StringUtils.getCommonPrefix("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37561);assertEquals("", StringUtils.getCommonPrefix("", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37562);assertEquals("", StringUtils.getCommonPrefix("abc", null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37563);assertEquals("", StringUtils.getCommonPrefix(null, null, "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37564);assertEquals("", StringUtils.getCommonPrefix("", "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37565);assertEquals("", StringUtils.getCommonPrefix("abc", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37566);assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37567);assertEquals("a", StringUtils.getCommonPrefix("abc", "a"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37568);assertEquals("ab", StringUtils.getCommonPrefix("ab", "abxyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37569);assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37570);assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37571);assertEquals("", StringUtils.getCommonPrefix("xyz", "abcde"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37572);assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testNormalizeSpace() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2srv1n6szp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testNormalizeSpace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37573,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2srv1n6szp(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37573);
        // Java says a non-breaking whitespace is not a whitespace.
        __CLR4_5_2rktrktlvha7go1.R.inc(37574);assertFalse(Character.isWhitespace('\u00a0'));
        //
        __CLR4_5_2rktrktlvha7go1.R.inc(37575);assertNull(StringUtils.normalizeSpace(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37576);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37577);assertEquals("", StringUtils.normalizeSpace(" "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37578);assertEquals("", StringUtils.normalizeSpace("\t"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37579);assertEquals("", StringUtils.normalizeSpace("\n"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37580);assertEquals("", StringUtils.normalizeSpace("	"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37581);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37582);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37583);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37584);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37585);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37586);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37587);assertEquals("", StringUtils.normalizeSpace("\f"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37588);assertEquals("", StringUtils.normalizeSpace("\r"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37589);assertEquals("a", StringUtils.normalizeSpace("  a  "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37590);assertEquals("a b c", StringUtils.normalizeSpace("  a  b   c  "));
        __CLR4_5_2rktrktlvha7go1.R.inc(37591);assertEquals("a b c", StringUtils.normalizeSpace("a\t\f\r  b   c\n"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37592);assertEquals("a   b c", StringUtils.normalizeSpace("a\t\f\r  " + HARD_SPACE + HARD_SPACE + "b   c\n"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37593);assertEquals("b", StringUtils.normalizeSpace("\u0000b"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37594);assertEquals("b", StringUtils.normalizeSpace("b\u0000"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testLANG666() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_256knlvt0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLANG666",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_256knlvt0b(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37595);
        __CLR4_5_2rktrktlvha7go1.R.inc(37596);assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37597);assertEquals("121", StringUtils.stripEnd("121.00", ".0"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    // Methods on StringUtils that are immutable in spirit (i.e. calculate the length)
    // should take a CharSequence parameter. Methods that are mutable in spirit (i.e. capitalize)
    // should take a String or String[] parameter and return String or String[].
    // This test enforces that this is done.
    @Test
    public void testStringUtilsCharSequenceContract() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wnzeout0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testStringUtilsCharSequenceContract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wnzeout0e(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37598);
        __CLR4_5_2rktrktlvha7go1.R.inc(37599);final Class<StringUtils> c = StringUtils.class;
        // Methods that are expressly excluded from testStringUtilsCharSequenceContract()
        __CLR4_5_2rktrktlvha7go1.R.inc(37600);final String[] excludeMethods = {
            "public static int org.apache.commons.lang3.StringUtils.compare(java.lang.String,java.lang.String)",
            "public static int org.apache.commons.lang3.StringUtils.compare(java.lang.String,java.lang.String,boolean)",
            "public static int org.apache.commons.lang3.StringUtils.compareIgnoreCase(java.lang.String,java.lang.String)",
            "public static int org.apache.commons.lang3.StringUtils.compareIgnoreCase(java.lang.String,java.lang.String,boolean)"
        };
        __CLR4_5_2rktrktlvha7go1.R.inc(37601);final Method[] methods = c.getMethods();

        __CLR4_5_2rktrktlvha7go1.R.inc(37602);for (final Method m : methods) {{
            __CLR4_5_2rktrktlvha7go1.R.inc(37603);final String methodStr = m.toString();
            __CLR4_5_2rktrktlvha7go1.R.inc(37604);if ((((m.getReturnType() == String.class || m.getReturnType() == String[].class)&&(__CLR4_5_2rktrktlvha7go1.R.iget(37605)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37606)==0&false))) {{
                // Assume this is mutable and ensure the first parameter is not CharSequence.
                // It may be String or it may be something else (String[], Object, Object[]) so
                // don't actively test for that.
                __CLR4_5_2rktrktlvha7go1.R.inc(37607);final Class<?>[] params = m.getParameterTypes();
                __CLR4_5_2rktrktlvha7go1.R.inc(37608);if ((((params.length > 0 && (params[0] == CharSequence.class || params[0] == CharSequence[].class))&&(__CLR4_5_2rktrktlvha7go1.R.iget(37609)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37610)==0&false))) {{
                    __CLR4_5_2rktrktlvha7go1.R.inc(37611);if ((((!ArrayUtils.contains(excludeMethods, methodStr))&&(__CLR4_5_2rktrktlvha7go1.R.iget(37612)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37613)==0&false))) {{
                        __CLR4_5_2rktrktlvha7go1.R.inc(37614);fail("The method \"" + methodStr + "\" appears to be mutable in spirit and therefore must not accept a CharSequence");
                    }
                }}
            }} }else {{
                // Assume this is immutable in spirit and ensure the first parameter is not String.
                // As above, it may be something other than CharSequence.
                __CLR4_5_2rktrktlvha7go1.R.inc(37615);final Class<?>[] params = m.getParameterTypes();
                __CLR4_5_2rktrktlvha7go1.R.inc(37616);if ((((params.length > 0 && (params[0] == String.class || params[0] == String[].class))&&(__CLR4_5_2rktrktlvha7go1.R.iget(37617)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37618)==0&false))) {{
                    __CLR4_5_2rktrktlvha7go1.R.inc(37619);if ((((!ArrayUtils.contains(excludeMethods, methodStr))&&(__CLR4_5_2rktrktlvha7go1.R.iget(37620)!=0|true))||(__CLR4_5_2rktrktlvha7go1.R.iget(37621)==0&false))) {{
                        __CLR4_5_2rktrktlvha7go1.R.inc(37622);fail("The method \"" + methodStr + "\" appears to be immutable in spirit and therefore must not accept a String");
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@link StringUtils#toString(byte[], String)}
     *
     * @throws java.io.UnsupportedEncodingException because the method under test max throw it
     * @see StringUtils#toString(byte[], String)
     */
    @Test
    public void testToString() throws UnsupportedEncodingException {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidt13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidt13() throws UnsupportedEncodingException{try{__CLR4_5_2rktrktlvha7go1.R.inc(37623);
        __CLR4_5_2rktrktlvha7go1.R.inc(37624);final String expectedString = "The quick brown fox jumps over the lazy dog.";
        __CLR4_5_2rktrktlvha7go1.R.inc(37625);byte[] expectedBytes = expectedString.getBytes(Charset.defaultCharset());
        // sanity check start
        __CLR4_5_2rktrktlvha7go1.R.inc(37626);assertArrayEquals(expectedBytes, expectedString.getBytes());
        // sanity check end
        __CLR4_5_2rktrktlvha7go1.R.inc(37627);assertEquals(expectedString, StringUtils.toString(expectedBytes, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37628);assertEquals(expectedString, StringUtils.toString(expectedBytes, SystemUtils.FILE_ENCODING));
        __CLR4_5_2rktrktlvha7go1.R.inc(37629);final String encoding = "UTF-16";
        __CLR4_5_2rktrktlvha7go1.R.inc(37630);expectedBytes = expectedString.getBytes(Charset.forName(encoding));
        __CLR4_5_2rktrktlvha7go1.R.inc(37631);assertEquals(expectedString, StringUtils.toString(expectedBytes, encoding));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testEscapeSurrogatePairs() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pn13jvt1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEscapeSurrogatePairs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pn13jvt1c() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37632);
        __CLR4_5_2rktrktlvha7go1.R.inc(37633);assertEquals("\ud83d\ude30", StringEscapeUtils.escapeCsv("\ud83d\ude30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        __CLR4_5_2rktrktlvha7go1.R.inc(37634);assertEquals("\ud800\udc00", StringEscapeUtils.escapeCsv("\ud800\udc00"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37635);assertEquals("\ud834\udd1e", StringEscapeUtils.escapeCsv("\ud834\udd1e"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37636);assertEquals("\udbff\udffd", StringEscapeUtils.escapeCsv("\udbff\udffd"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37637);assertEquals("\udbff\udffd", StringEscapeUtils.escapeHtml3("\udbff\udffd"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37638);assertEquals("\udbff\udffd", StringEscapeUtils.escapeHtml4("\udbff\udffd"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37639);assertEquals("\udbff\udffd", StringEscapeUtils.escapeXml("\udbff\udffd"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests LANG-858.
     */
    @Test
    public void testEscapeSurrogatePairsLang858() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j3q4hst1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEscapeSurrogatePairsLang858",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j3q4hst1k(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37640);
        __CLR4_5_2rktrktlvha7go1.R.inc(37641);assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeJava("\udbff\udffd"));       //fail LANG-858
        __CLR4_5_2rktrktlvha7go1.R.inc(37642);assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeEcmaScript("\udbff\udffd")); //fail LANG-858
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testUnescapeSurrogatePairs() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wgtzuct1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUnescapeSurrogatePairs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wgtzuct1n() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37643);
        __CLR4_5_2rktrktlvha7go1.R.inc(37644);assertEquals("\ud83d\ude30", StringEscapeUtils.unescapeCsv("\ud83d\ude30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        __CLR4_5_2rktrktlvha7go1.R.inc(37645);assertEquals("\ud800\udc00", StringEscapeUtils.unescapeCsv("\ud800\udc00"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37646);assertEquals("\ud834\udd1e", StringEscapeUtils.unescapeCsv("\ud834\udd1e"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37647);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeCsv("\udbff\udffd"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37648);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeHtml3("\udbff\udffd"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37649);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeHtml4("\udbff\udffd"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@code appendIfMissing}.
     */
    @Test
    public void testAppendIfMissing() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nln83gt1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAppendIfMissing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nln83gt1u(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37650);
        __CLR4_5_2rktrktlvha7go1.R.inc(37651);assertEquals("appendIfMissing(null,null)", null, StringUtils.appendIfMissing(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37652);assertEquals("appendIfMissing(abc,null)", "abc", StringUtils.appendIfMissing("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37653);assertEquals("appendIfMissing(\"\",xyz)", "xyz", StringUtils.appendIfMissing("", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37654);assertEquals("appendIfMissing(abc,xyz)", "abcxyz", StringUtils.appendIfMissing("abc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37655);assertEquals("appendIfMissing(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissing("abcxyz", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37656);assertEquals("appendIfMissing(aXYZ,xyz)", "aXYZxyz", StringUtils.appendIfMissing("aXYZ", "xyz"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37657);assertEquals("appendIfMissing(null,null,null)", null, StringUtils.appendIfMissing(null, null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37658);assertEquals("appendIfMissing(abc,null,null)", "abc", StringUtils.appendIfMissing("abc", null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37659);assertEquals("appendIfMissing(\"\",xyz,null))", "xyz", StringUtils.appendIfMissing("", "xyz", (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37660);assertEquals("appendIfMissing(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissing("abc", "xyz", new CharSequence[]{null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37661);assertEquals("appendIfMissing(abc,xyz,\"\")", "abc", StringUtils.appendIfMissing("abc", "xyz", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37662);assertEquals("appendIfMissing(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37663);assertEquals("appendIfMissing(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abcxyz", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37664);assertEquals("appendIfMissing(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissing("abcmno", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37665);assertEquals("appendIfMissing(abcXYZ,xyz,mno)", "abcXYZxyz", StringUtils.appendIfMissing("abcXYZ", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37666);assertEquals("appendIfMissing(abcMNO,xyz,mno)", "abcMNOxyz", StringUtils.appendIfMissing("abcMNO", "xyz", "mno"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@code appendIfMissingIgnoreCase}.
     */
    @Test
    public void testAppendIfMissingIgnoreCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ag64g6t2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAppendIfMissingIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ag64g6t2b(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37667);
        __CLR4_5_2rktrktlvha7go1.R.inc(37668);assertEquals("appendIfMissingIgnoreCase(null,null)", null, StringUtils.appendIfMissingIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37669);assertEquals("appendIfMissingIgnoreCase(abc,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37670);assertEquals("appendIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.appendIfMissingIgnoreCase("", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37671);assertEquals("appendIfMissingIgnoreCase(abc,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37672);assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37673);assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37674);assertEquals("appendIfMissingIgnoreCase(null,null,null)", null, StringUtils.appendIfMissingIgnoreCase(null, null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37675);assertEquals("appendIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc", null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37676);assertEquals("appendIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.appendIfMissingIgnoreCase("", "xyz", (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37677);assertEquals("appendIfMissingIgnoreCase(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37678);assertEquals("appendIfMissingIgnoreCase(abc,xyz,\"\")", "abc", StringUtils.appendIfMissingIgnoreCase("abc", "xyz", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37679);assertEquals("appendIfMissingIgnoreCase(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37680);assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37681);assertEquals("appendIfMissingIgnoreCase(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissingIgnoreCase("abcmno", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37682);assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz,mno)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37683);assertEquals("appendIfMissingIgnoreCase(abcMNO,xyz,mno)", "abcMNO", StringUtils.appendIfMissingIgnoreCase("abcMNO", "xyz", "mno"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@code prependIfMissing}.
     */
    @Test
    public void testPrependIfMissing() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjytpwt2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testPrependIfMissing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjytpwt2s(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37684);
        __CLR4_5_2rktrktlvha7go1.R.inc(37685);assertEquals("prependIfMissing(null,null)", null, StringUtils.prependIfMissing(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37686);assertEquals("prependIfMissing(abc,null)", "abc", StringUtils.prependIfMissing("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37687);assertEquals("prependIfMissing(\"\",xyz)", "xyz", StringUtils.prependIfMissing("", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37688);assertEquals("prependIfMissing(abc,xyz)", "xyzabc", StringUtils.prependIfMissing("abc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37689);assertEquals("prependIfMissing(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissing("xyzabc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37690);assertEquals("prependIfMissing(XYZabc,xyz)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc", "xyz"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37691);assertEquals("prependIfMissing(null,null null)", null, StringUtils.prependIfMissing(null, null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37692);assertEquals("prependIfMissing(abc,null,null)", "abc", StringUtils.prependIfMissing("abc", null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37693);assertEquals("prependIfMissing(\"\",xyz,null)", "xyz", StringUtils.prependIfMissing("", "xyz", (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37694);assertEquals("prependIfMissing(abc,xyz,{null})", "xyzabc", StringUtils.prependIfMissing("abc", "xyz", new CharSequence[]{null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37695);assertEquals("prependIfMissing(abc,xyz,\"\")", "abc", StringUtils.prependIfMissing("abc", "xyz", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37696);assertEquals("prependIfMissing(abc,xyz,mno)", "xyzabc", StringUtils.prependIfMissing("abc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37697);assertEquals("prependIfMissing(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissing("xyzabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37698);assertEquals("prependIfMissing(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissing("mnoabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37699);assertEquals("prependIfMissing(XYZabc,xyz,mno)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37700);assertEquals("prependIfMissing(MNOabc,xyz,mno)", "xyzMNOabc", StringUtils.prependIfMissing("MNOabc", "xyz", "mno"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@code prependIfMissingIgnoreCase}.
     */
    @Test
    public void testPrependIfMissingIgnoreCase() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t7vw6ut39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testPrependIfMissingIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t7vw6ut39(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37701);
        __CLR4_5_2rktrktlvha7go1.R.inc(37702);assertEquals("prependIfMissingIgnoreCase(null,null)", null, StringUtils.prependIfMissingIgnoreCase(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37703);assertEquals("prependIfMissingIgnoreCase(abc,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37704);assertEquals("prependIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.prependIfMissingIgnoreCase("", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37705);assertEquals("prependIfMissingIgnoreCase(abc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("abc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37706);assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37707);assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37708);assertEquals("prependIfMissingIgnoreCase(null,null null)", null, StringUtils.prependIfMissingIgnoreCase(null, null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37709);assertEquals("prependIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc", null, (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37710);assertEquals("prependIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.prependIfMissingIgnoreCase("", "xyz", (CharSequence[]) null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37711);assertEquals("prependIfMissingIgnoreCase(abc,xyz,{null})", "xyzabc", StringUtils.prependIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}));
        __CLR4_5_2rktrktlvha7go1.R.inc(37712);assertEquals("prependIfMissingIgnoreCase(abc,xyz,\"\")", "abc", StringUtils.prependIfMissingIgnoreCase("abc", "xyz", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37713);assertEquals("prependIfMissingIgnoreCase(abc,xyz,mno)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37714);assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37715);assertEquals("prependIfMissingIgnoreCase(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissingIgnoreCase("mnoabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37716);assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz,mno)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz", "mno"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37717);assertEquals("prependIfMissingIgnoreCase(MNOabc,xyz,mno)", "MNOabc", StringUtils.prependIfMissingIgnoreCase("MNOabc", "xyz", "mno"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    /**
     * Tests {@link StringUtils#toEncodedString(byte[], Charset)}
     *
     * @see StringUtils#toEncodedString(byte[], Charset)
     */
    @Test
    public void testToEncodedString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmsbtzt3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testToEncodedString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmsbtzt3q(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37718);
        __CLR4_5_2rktrktlvha7go1.R.inc(37719);final String expectedString = "The quick brown fox jumps over the lazy dog.";
        __CLR4_5_2rktrktlvha7go1.R.inc(37720);String encoding = SystemUtils.FILE_ENCODING;
        __CLR4_5_2rktrktlvha7go1.R.inc(37721);byte[] expectedBytes = expectedString.getBytes(Charset.defaultCharset());
        // sanity check start
        __CLR4_5_2rktrktlvha7go1.R.inc(37722);assertArrayEquals(expectedBytes, expectedString.getBytes());
        // sanity check end
        __CLR4_5_2rktrktlvha7go1.R.inc(37723);assertEquals(expectedString, StringUtils.toEncodedString(expectedBytes, Charset.defaultCharset()));
        __CLR4_5_2rktrktlvha7go1.R.inc(37724);assertEquals(expectedString, StringUtils.toEncodedString(expectedBytes, Charset.forName(encoding)));
        __CLR4_5_2rktrktlvha7go1.R.inc(37725);encoding = "UTF-16";
        __CLR4_5_2rktrktlvha7go1.R.inc(37726);expectedBytes = expectedString.getBytes(Charset.forName(encoding));
        __CLR4_5_2rktrktlvha7go1.R.inc(37727);assertEquals(expectedString, StringUtils.toEncodedString(expectedBytes, Charset.forName(encoding)));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    // -----------------------------------------------------------------------

    @Test
    public void testWrap_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cqcztdt40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testWrap_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cqcztdt40(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37728);
        __CLR4_5_2rktrktlvha7go1.R.inc(37729);assertNull(StringUtils.wrap(null, '\0'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37730);assertNull(StringUtils.wrap(null, '1'));

        __CLR4_5_2rktrktlvha7go1.R.inc(37731);assertEquals("", StringUtils.wrap("", '\0'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37732);assertEquals("xabx", StringUtils.wrap("ab", 'x'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37733);assertEquals("\"ab\"", StringUtils.wrap("ab", '\"'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37734);assertEquals("\"\"ab\"\"", StringUtils.wrap("\"ab\"", '\"'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37735);assertEquals("'ab'", StringUtils.wrap("ab", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37736);assertEquals("''abcd''", StringUtils.wrap("'abcd'", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37737);assertEquals("'\"abcd\"'", StringUtils.wrap("\"abcd\"", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37738);assertEquals("\"'abcd'\"", StringUtils.wrap("'abcd'", '\"'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testWrapIfMissing_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uwye8t4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testWrapIfMissing_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uwye8t4b(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37739);
        __CLR4_5_2rktrktlvha7go1.R.inc(37740);assertNull(StringUtils.wrapIfMissing(null, '\0'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37741);assertNull(StringUtils.wrapIfMissing(null, '1'));

        __CLR4_5_2rktrktlvha7go1.R.inc(37742);assertEquals("", StringUtils.wrapIfMissing("", '\0'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37743);assertEquals("xabx", StringUtils.wrapIfMissing("ab", 'x'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37744);assertEquals("\"ab\"", StringUtils.wrapIfMissing("ab", '\"'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37745);assertEquals("\"ab\"", StringUtils.wrapIfMissing("\"ab\"", '\"'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37746);assertEquals("'ab'", StringUtils.wrapIfMissing("ab", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37747);assertEquals("'abcd'", StringUtils.wrapIfMissing("'abcd'", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37748);assertEquals("'\"abcd\"'", StringUtils.wrapIfMissing("\"abcd\"", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37749);assertEquals("\"'abcd'\"", StringUtils.wrapIfMissing("'abcd'", '\"'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37750);assertEquals("/x/", StringUtils.wrapIfMissing("x", '/'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37751);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("x/y/z", '/'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37752);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("/x/y/z", '/'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37753);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("x/y/z/", '/'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37754);assertEquals("/", StringUtils.wrapIfMissing("/", '/'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testWrapIfMissing_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kli0zpt4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testWrapIfMissing_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kli0zpt4r(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37755);
        __CLR4_5_2rktrktlvha7go1.R.inc(37756);assertNull(StringUtils.wrapIfMissing(null, "\0"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37757);assertNull(StringUtils.wrapIfMissing(null, "1"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37758);assertEquals("", StringUtils.wrapIfMissing("", "\0"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37759);assertEquals("xabx", StringUtils.wrapIfMissing("ab", "x"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37760);assertEquals("\"ab\"", StringUtils.wrapIfMissing("ab", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37761);assertEquals("\"ab\"", StringUtils.wrapIfMissing("\"ab\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37762);assertEquals("'ab'", StringUtils.wrapIfMissing("ab", "\'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37763);assertEquals("'abcd'", StringUtils.wrapIfMissing("'abcd'", "\'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37764);assertEquals("'\"abcd\"'", StringUtils.wrapIfMissing("\"abcd\"", "\'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37765);assertEquals("\"'abcd'\"", StringUtils.wrapIfMissing("'abcd'", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37766);assertEquals("/x/", StringUtils.wrapIfMissing("x", "/"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37767);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("x/y/z", "/"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37768);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("/x/y/z", "/"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37769);assertEquals("/x/y/z/", StringUtils.wrapIfMissing("x/y/z/", "/"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37770);assertEquals("/", StringUtils.wrapIfMissing("/", "/"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37771);assertEquals("ab/ab", StringUtils.wrapIfMissing("/", "ab"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37772);assertEquals("ab/ab", StringUtils.wrapIfMissing("ab/ab", "ab"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testWrap_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krsyb0t59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testWrap_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krsyb0t59(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37773);
        __CLR4_5_2rktrktlvha7go1.R.inc(37774);assertNull(StringUtils.wrap(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37775);assertNull(StringUtils.wrap(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37776);assertNull(StringUtils.wrap(null, "1"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37777);assertEquals(null, StringUtils.wrap(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37778);assertEquals("", StringUtils.wrap("", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37779);assertEquals("ab", StringUtils.wrap("ab", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37780);assertEquals("xabx", StringUtils.wrap("ab", "x"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37781);assertEquals("\"ab\"", StringUtils.wrap("ab", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37782);assertEquals("\"\"ab\"\"", StringUtils.wrap("\"ab\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37783);assertEquals("'ab'", StringUtils.wrap("ab", "'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37784);assertEquals("''abcd''", StringUtils.wrap("'abcd'", "'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37785);assertEquals("'\"abcd\"'", StringUtils.wrap("\"abcd\"", "'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37786);assertEquals("\"'abcd'\"", StringUtils.wrap("'abcd'", "\""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testUnwrap_StringString() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hl4xcjt5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUnwrap_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hl4xcjt5n(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37787);
        __CLR4_5_2rktrktlvha7go1.R.inc(37788);assertNull(StringUtils.unwrap(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37789);assertNull(StringUtils.unwrap(null, ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37790);assertNull(StringUtils.unwrap(null, "1"));

        __CLR4_5_2rktrktlvha7go1.R.inc(37791);assertEquals("abc", StringUtils.unwrap("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37792);assertEquals("abc", StringUtils.unwrap("abc", ""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37793);assertEquals("abc", StringUtils.unwrap("\'abc\'", "\'"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37794);assertEquals("abc", StringUtils.unwrap("\"abc\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37795);assertEquals("abc\"xyz", StringUtils.unwrap("\"abc\"xyz\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37796);assertEquals("abc\"xyz\"", StringUtils.unwrap("\"abc\"xyz\"\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37797);assertEquals("abc\'xyz\'", StringUtils.unwrap("\"abc\'xyz\'\"", "\""));
        __CLR4_5_2rktrktlvha7go1.R.inc(37798);assertEquals("\"abc\'xyz\'\"", StringUtils.unwrap("AA\"abc\'xyz\'\"AA", "AA"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37799);assertEquals("\"abc\'xyz\'\"", StringUtils.unwrap("123\"abc\'xyz\'\"123", "123"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37800);assertEquals("AA\"abc\'xyz\'\"", StringUtils.unwrap("AA\"abc\'xyz\'\"", "AA"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37801);assertEquals("AA\"abc\'xyz\'\"AA", StringUtils.unwrap("AAA\"abc\'xyz\'\"AAA", "A"));
        __CLR4_5_2rktrktlvha7go1.R.inc(37802);assertEquals("\"abc\'xyz\'\"AA", StringUtils.unwrap("\"abc\'xyz\'\"AA", "AA"));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}

    @Test
    public void testUnwrap_StringChar() {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_221xosot63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUnwrap_StringChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_221xosot63(){try{__CLR4_5_2rktrktlvha7go1.R.inc(37803);
        __CLR4_5_2rktrktlvha7go1.R.inc(37804);assertNull(StringUtils.unwrap(null, null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37805);assertNull(StringUtils.unwrap(null, '\0'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37806);assertNull(StringUtils.unwrap(null, '1'));
 
        __CLR4_5_2rktrktlvha7go1.R.inc(37807);assertEquals("abc", StringUtils.unwrap("abc", null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37808);assertEquals("abc", StringUtils.unwrap("\'abc\'", '\''));
        __CLR4_5_2rktrktlvha7go1.R.inc(37809);assertEquals("abc", StringUtils.unwrap("AabcA", 'A'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37810);assertEquals("AabcA", StringUtils.unwrap("AAabcAA", 'A'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37811);assertEquals("abc", StringUtils.unwrap("abc", 'b'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37812);assertEquals("#A", StringUtils.unwrap("#A", '#'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37813);assertEquals("A#", StringUtils.unwrap("A#", '#'));
        __CLR4_5_2rktrktlvha7go1.R.inc(37814);assertEquals("ABA", StringUtils.unwrap("AABAA", 'A'));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}
    
    @Test
    public void testToCodePoints() throws Exception {__CLR4_5_2rktrktlvha7go1.R.globalSliceStart(getClass().getName(),37815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273ph0kt6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2rktrktlvha7go1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2rktrktlvha7go1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testToCodePoints",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273ph0kt6f() throws Exception{try{__CLR4_5_2rktrktlvha7go1.R.inc(37815);
        __CLR4_5_2rktrktlvha7go1.R.inc(37816);final int orphanedHighSurrogate = 0xD801;
        __CLR4_5_2rktrktlvha7go1.R.inc(37817);final int orphanedLowSurrogate = 0xDC00;
        __CLR4_5_2rktrktlvha7go1.R.inc(37818);final int supplementary = 0x2070E;
        
        __CLR4_5_2rktrktlvha7go1.R.inc(37819);final int[] codePoints = {'a', orphanedHighSurrogate, 'b','c', supplementary, 
                'd', orphanedLowSurrogate, 'e'};
        __CLR4_5_2rktrktlvha7go1.R.inc(37820);final String s = new String(codePoints, 0, codePoints.length);
        __CLR4_5_2rktrktlvha7go1.R.inc(37821);assertArrayEquals(codePoints, StringUtils.toCodePoints(s));
        
        __CLR4_5_2rktrktlvha7go1.R.inc(37822);assertNull(StringUtils.toCodePoints(null));
        __CLR4_5_2rktrktlvha7go1.R.inc(37823);assertArrayEquals(ArrayUtils.EMPTY_INT_ARRAY, StringUtils.toCodePoints(""));
    }finally{__CLR4_5_2rktrktlvha7go1.R.flushNeeded();}}
}
