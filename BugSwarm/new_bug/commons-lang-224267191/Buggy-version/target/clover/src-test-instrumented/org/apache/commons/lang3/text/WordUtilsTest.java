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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests for WordUtils class.
 */
public class WordUtilsTest {static class __CLR4_5_2169x169xlvha7ilm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h169x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54789,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h169x(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54789);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54790);assertNotNull(new WordUtils());
        __CLR4_5_2169x169xlvha7ilm.R.inc(54791);final Constructor<?>[] cons = WordUtils.class.getDeclaredConstructors();
        __CLR4_5_2169x169xlvha7ilm.R.inc(54792);assertEquals(1, cons.length);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54793);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54794);assertTrue(Modifier.isPublic(WordUtils.class.getModifiers()));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54795);assertFalse(Modifier.isFinal(WordUtils.class.getModifiers()));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testWrap_StringInt() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_279p47y16a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testWrap_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_279p47y16a4(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54796);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54797);assertEquals(null, WordUtils.wrap(null, 20));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54798);assertEquals(null, WordUtils.wrap(null, -1));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54799);assertEquals("", WordUtils.wrap("", 20));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54800);assertEquals("", WordUtils.wrap("", -1));
        
        // normal
        __CLR4_5_2169x169xlvha7ilm.R.inc(54801);final String systemNewLine = System.lineSeparator();
        __CLR4_5_2169x169xlvha7ilm.R.inc(54802);String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54803);String expected = "Here is one line of" + systemNewLine + "text that is going" 
            + systemNewLine + "to be wrapped after" + systemNewLine + "20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54804);assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word at end
        __CLR4_5_2169x169xlvha7ilm.R.inc(54805);input = "Click here to jump to the commons website - http://commons.apache.org";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54806);expected = "Click here to jump" + systemNewLine + "to the commons" + systemNewLine 
            + "website -" + systemNewLine + "http://commons.apache.org";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54807);assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word in middle
        __CLR4_5_2169x169xlvha7ilm.R.inc(54808);input = "Click here, http://commons.apache.org, to jump to the commons website";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54809);expected = "Click here," + systemNewLine + "http://commons.apache.org," + systemNewLine 
            + "to jump to the" + systemNewLine + "commons website";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54810);assertEquals(expected, WordUtils.wrap(input, 20));

        // leading spaces on a new line are stripped
        // trailing spaces are not stripped
        __CLR4_5_2169x169xlvha7ilm.R.inc(54811);input = "word1             word2                        word3";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54812);expected = "word1  " + systemNewLine + "word2  " + systemNewLine + "word3";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54813);assertEquals(expected, WordUtils.wrap(input, 7));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    @Test
    public void testWrap_StringIntStringBoolean() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnpyxp16am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testWrap_StringIntStringBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnpyxp16am(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54814);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54815);assertEquals(null, WordUtils.wrap(null, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54816);assertEquals(null, WordUtils.wrap(null, 20, "\n", true));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54817);assertEquals(null, WordUtils.wrap(null, 20, null, true));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54818);assertEquals(null, WordUtils.wrap(null, 20, null, false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54819);assertEquals(null, WordUtils.wrap(null, -1, null, true));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54820);assertEquals(null, WordUtils.wrap(null, -1, null, false));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54821);assertEquals("", WordUtils.wrap("", 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54822);assertEquals("", WordUtils.wrap("", 20, "\n", true));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54823);assertEquals("", WordUtils.wrap("", 20, null, false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54824);assertEquals("", WordUtils.wrap("", 20, null, true));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54825);assertEquals("", WordUtils.wrap("", -1, null, false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54826);assertEquals("", WordUtils.wrap("", -1, null, true));
        
        // normal
        __CLR4_5_2169x169xlvha7ilm.R.inc(54827);String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54828);String expected = "Here is one line of\ntext that is going\nto be wrapped after\n20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54829);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54830);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));

        // unusual newline char
        __CLR4_5_2169x169xlvha7ilm.R.inc(54831);input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54832);expected = "Here is one line of<br />text that is going<br />to be wrapped after<br />20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54833);assertEquals(expected, WordUtils.wrap(input, 20, "<br />", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54834);assertEquals(expected, WordUtils.wrap(input, 20, "<br />", true));

        // short line length
        __CLR4_5_2169x169xlvha7ilm.R.inc(54835);input = "Here is one line";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54836);expected = "Here\nis one\nline";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54837);assertEquals(expected, WordUtils.wrap(input, 6, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54838);expected = "Here\nis\none\nline";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54839);assertEquals(expected, WordUtils.wrap(input, 2, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54840);assertEquals(expected, WordUtils.wrap(input, -1, "\n", false));

        // system newline char
        __CLR4_5_2169x169xlvha7ilm.R.inc(54841);final String systemNewLine = System.lineSeparator();
        __CLR4_5_2169x169xlvha7ilm.R.inc(54842);input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54843);expected = "Here is one line of" + systemNewLine + "text that is going" + systemNewLine 
            + "to be wrapped after" + systemNewLine + "20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54844);assertEquals(expected, WordUtils.wrap(input, 20, null, false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54845);assertEquals(expected, WordUtils.wrap(input, 20, null, true));

        // with extra spaces
        __CLR4_5_2169x169xlvha7ilm.R.inc(54846);input = " Here:  is  one  line  of  text  that  is  going  to  be  wrapped  after  20  columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54847);expected = "Here:  is  one  line\nof  text  that  is \ngoing  to  be \nwrapped  after  20 \ncolumns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54848);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54849);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab
        __CLR4_5_2169x169xlvha7ilm.R.inc(54850);input = "Here is\tone line of text that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54851);expected = "Here is\tone line of\ntext that is going\nto be wrapped after\n20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54852);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54853);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab at wrapColumn
        __CLR4_5_2169x169xlvha7ilm.R.inc(54854);input = "Here is one line of\ttext that is going to be wrapped after 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54855);expected = "Here is one line\nof\ttext that is\ngoing to be wrapped\nafter 20 columns.";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54856);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54857);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word
        __CLR4_5_2169x169xlvha7ilm.R.inc(54858);input = "Click here to jump to the commons website - http://commons.apache.org";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54859);expected = "Click here to jump\nto the commons\nwebsite -\nhttp://commons.apache.org";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54860);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54861);expected = "Click here to jump\nto the commons\nwebsite -\nhttp://commons.apach\ne.org";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54862);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word in middle
        __CLR4_5_2169x169xlvha7ilm.R.inc(54863);input = "Click here, http://commons.apache.org, to jump to the commons website";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54864);expected = "Click here,\nhttp://commons.apache.org,\nto jump to the\ncommons website";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54865);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54866);expected = "Click here,\nhttp://commons.apach\ne.org, to jump to\nthe commons website";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54867);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    @Test
    public void testWrap_StringIntStringBooleanString() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21jy0vo16c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testWrap_StringIntStringBooleanString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21jy0vo16c4(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54868);

        //no changes test
        __CLR4_5_2169x169xlvha7ilm.R.inc(54869);String input = "flammable/inflammable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54870);String expected = "flammable/inflammable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54871);assertEquals(expected, WordUtils.wrap(input, 30, "\n", false, "/"));

        // wrap on / and small width
        __CLR4_5_2169x169xlvha7ilm.R.inc(54872);expected = "flammable\ninflammable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54873);assertEquals(expected, WordUtils.wrap(input, 2, "\n", false, "/"));

        // wrap long words on / 1
        __CLR4_5_2169x169xlvha7ilm.R.inc(54874);expected = "flammable\ninflammab\nle";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54875);assertEquals(expected, WordUtils.wrap(input, 9, "\n", true, "/"));

        // wrap long words on / 2
        __CLR4_5_2169x169xlvha7ilm.R.inc(54876);expected = "flammable\ninflammable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54877);assertEquals(expected, WordUtils.wrap(input, 15, "\n", true, "/"));

        // wrap long words on / 3
        __CLR4_5_2169x169xlvha7ilm.R.inc(54878);input = "flammableinflammable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54879);expected = "flammableinflam\nmable";
        __CLR4_5_2169x169xlvha7ilm.R.inc(54880);assertEquals(expected, WordUtils.wrap(input, 15, "\n", true, "/"));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCapitalize_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ujwc916ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalize_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ujwc916ch(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54881);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54882);assertEquals(null, WordUtils.capitalize(null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54883);assertEquals("", WordUtils.capitalize(""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54884);assertEquals("  ", WordUtils.capitalize("  "));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54885);assertEquals("I", WordUtils.capitalize("I") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54886);assertEquals("I", WordUtils.capitalize("i") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54887);assertEquals("I Am Here 123", WordUtils.capitalize("i am here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54888);assertEquals("I Am Here 123", WordUtils.capitalize("I Am Here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54889);assertEquals("I Am HERE 123", WordUtils.capitalize("i am HERE 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54890);assertEquals("I AM HERE 123", WordUtils.capitalize("I AM HERE 123") );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    @Test
    public void testCapitalizeWithDelimiters_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xhhctj16cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeWithDelimiters_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xhhctj16cr(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54891);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54892);assertEquals(null, WordUtils.capitalize(null, null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54893);assertEquals("", WordUtils.capitalize("", new char[0]));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54894);assertEquals("  ", WordUtils.capitalize("  ", new char[0]));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54895);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_5_2169x169xlvha7ilm.R.inc(54896);assertEquals("I", WordUtils.capitalize("I", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54897);assertEquals("I", WordUtils.capitalize("i", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54898);assertEquals("I-Am Here+123", WordUtils.capitalize("i-am here+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54899);assertEquals("I Am+Here-123", WordUtils.capitalize("I Am+Here-123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54900);assertEquals("I+Am-HERE 123", WordUtils.capitalize("i+am-HERE 123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54901);assertEquals("I-AM HERE+123", WordUtils.capitalize("I-AM HERE+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54902);chars = new char[] {'.'};
        __CLR4_5_2169x169xlvha7ilm.R.inc(54903);assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54904);assertEquals("I Am.fine", WordUtils.capitalize("i am.fine", null) );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    @Test
    public void testCapitalizeFully_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwas0b16d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeFully_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwas0b16d5(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54905);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54906);assertEquals(null, WordUtils.capitalizeFully(null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54907);assertEquals("", WordUtils.capitalizeFully(""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54908);assertEquals("  ", WordUtils.capitalizeFully("  "));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54909);assertEquals("I", WordUtils.capitalizeFully("I") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54910);assertEquals("I", WordUtils.capitalizeFully("i") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54911);assertEquals("I Am Here 123", WordUtils.capitalizeFully("i am here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54912);assertEquals("I Am Here 123", WordUtils.capitalizeFully("I Am Here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54913);assertEquals("I Am Here 123", WordUtils.capitalizeFully("i am HERE 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54914);assertEquals("I Am Here 123", WordUtils.capitalizeFully("I AM HERE 123") );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    @Test
    public void testCapitalizeFullyWithDelimiters_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qnlon16df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeFullyWithDelimiters_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qnlon16df(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54915);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54916);assertEquals(null, WordUtils.capitalizeFully(null, null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54917);assertEquals("", WordUtils.capitalizeFully("", new char[0]));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54918);assertEquals("  ", WordUtils.capitalizeFully("  ", new char[0]));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54919);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_5_2169x169xlvha7ilm.R.inc(54920);assertEquals("I", WordUtils.capitalizeFully("I", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54921);assertEquals("I", WordUtils.capitalizeFully("i", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54922);assertEquals("I-Am Here+123", WordUtils.capitalizeFully("i-am here+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54923);assertEquals("I Am+Here-123", WordUtils.capitalizeFully("I Am+Here-123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54924);assertEquals("I+Am-Here 123", WordUtils.capitalizeFully("i+am-HERE 123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54925);assertEquals("I-Am Here+123", WordUtils.capitalizeFully("I-AM HERE+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54926);chars = new char[] {'.'};
        __CLR4_5_2169x169xlvha7ilm.R.inc(54927);assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54928);assertEquals("I Am.fine", WordUtils.capitalizeFully("i am.fine", null) );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    @Test
    public void testContainsAllWords_StringString() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272g73j16dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testContainsAllWords_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272g73j16dt(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54929);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54930);assertFalse(WordUtils.containsAllWords(null, (String) null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54931);assertFalse(WordUtils.containsAllWords(null, ""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54932);assertFalse(WordUtils.containsAllWords(null, "ab"));

        __CLR4_5_2169x169xlvha7ilm.R.inc(54933);assertFalse(WordUtils.containsAllWords("", (String) null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54934);assertFalse(WordUtils.containsAllWords("", ""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54935);assertFalse(WordUtils.containsAllWords("", "ab"));

        __CLR4_5_2169x169xlvha7ilm.R.inc(54936);assertFalse(WordUtils.containsAllWords("foo", (String) null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54937);assertFalse(WordUtils.containsAllWords("bar", ""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54938);assertFalse(WordUtils.containsAllWords("zzabyycdxx", "by"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54939);assertTrue(WordUtils.containsAllWords("lorem ipsum dolor sit amet", "ipsum", "lorem", "dolor"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54940);assertFalse(WordUtils.containsAllWords("lorem ipsum dolor sit amet", "ipsum", null, "lorem", "dolor"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54941);assertFalse(WordUtils.containsAllWords("lorem ipsum null dolor sit amet", "ipsum", null, "lorem", "dolor"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54942);assertFalse(WordUtils.containsAllWords("ab", "b"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54943);assertFalse(WordUtils.containsAllWords("ab", "z"));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    @Test
    public void testUncapitalize_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvvds16e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testUncapitalize_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvvds16e8(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54944);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54945);assertEquals(null, WordUtils.uncapitalize(null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54946);assertEquals("", WordUtils.uncapitalize(""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54947);assertEquals("  ", WordUtils.uncapitalize("  "));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54948);assertEquals("i", WordUtils.uncapitalize("I") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54949);assertEquals("i", WordUtils.uncapitalize("i") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54950);assertEquals("i am here 123", WordUtils.uncapitalize("i am here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54951);assertEquals("i am here 123", WordUtils.uncapitalize("I Am Here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54952);assertEquals("i am hERE 123", WordUtils.uncapitalize("i am HERE 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54953);assertEquals("i aM hERE 123", WordUtils.uncapitalize("I AM HERE 123") );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    @Test
    public void testUncapitalizeWithDelimiters_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21yegwe16ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testUncapitalizeWithDelimiters_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21yegwe16ei(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54954);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54955);assertEquals(null, WordUtils.uncapitalize(null, null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54956);assertEquals("", WordUtils.uncapitalize("", new char[0]));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54957);assertEquals("  ", WordUtils.uncapitalize("  ", new char[0]));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54958);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_5_2169x169xlvha7ilm.R.inc(54959);assertEquals("i", WordUtils.uncapitalize("I", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54960);assertEquals("i", WordUtils.uncapitalize("i", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54961);assertEquals("i am-here+123", WordUtils.uncapitalize("i am-here+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54962);assertEquals("i+am here-123", WordUtils.uncapitalize("I+Am Here-123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54963);assertEquals("i-am+hERE 123", WordUtils.uncapitalize("i-am+HERE 123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54964);assertEquals("i aM-hERE+123", WordUtils.uncapitalize("I AM-HERE+123", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54965);chars = new char[] {'.'};
        __CLR4_5_2169x169xlvha7ilm.R.inc(54966);assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", chars) );
        __CLR4_5_2169x169xlvha7ilm.R.inc(54967);assertEquals("i aM.FINE", WordUtils.uncapitalize("I AM.FINE", null) );
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInitials_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9i4ae16ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testInitials_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9i4ae16ew(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54968);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54969);assertEquals(null, WordUtils.initials(null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54970);assertEquals("", WordUtils.initials(""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54971);assertEquals("", WordUtils.initials("  "));

        __CLR4_5_2169x169xlvha7ilm.R.inc(54972);assertEquals("I", WordUtils.initials("I"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54973);assertEquals("i", WordUtils.initials("i"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54974);assertEquals("BJL", WordUtils.initials("Ben John Lee"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54975);assertEquals("BJL", WordUtils.initials("   Ben \n   John\tLee\t"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54976);assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54977);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee"));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54978);assertEquals("iah1", WordUtils.initials("i am here 123"));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testInitials_String_charArray() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),54979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rgo4yi16f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testInitials_String_charArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rgo4yi16f7(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(54979);
        __CLR4_5_2169x169xlvha7ilm.R.inc(54980);char[] array = null;
        __CLR4_5_2169x169xlvha7ilm.R.inc(54981);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54982);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54983);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54984);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54985);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54986);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54987);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54988);assertEquals("BJL", WordUtils.initials("   Ben \n   John\tLee\t", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54989);assertEquals("BJ", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54990);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54991);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54992);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(54993);array = new char[0];
        __CLR4_5_2169x169xlvha7ilm.R.inc(54994);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54995);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54996);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54997);assertEquals("", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54998);assertEquals("", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(54999);assertEquals("", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55000);assertEquals("", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55001);assertEquals("", WordUtils.initials("   Ben \n   John\tLee\t", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55002);assertEquals("", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55003);assertEquals("", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55004);assertEquals("", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55005);assertEquals("", WordUtils.initials("i am here 123", array));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(55006);array = " ".toCharArray();
        __CLR4_5_2169x169xlvha7ilm.R.inc(55007);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55008);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55009);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55010);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55011);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55012);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55013);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55014);assertEquals("BJ", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55015);assertEquals("B\nJ", WordUtils.initials("   Ben \n   John\tLee\t", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55016);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55017);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55018);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(55019);array = " .".toCharArray();
        __CLR4_5_2169x169xlvha7ilm.R.inc(55020);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55021);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55022);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55023);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55024);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55025);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55026);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55027);assertEquals("BJL", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55028);assertEquals("BJL", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55029);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55030);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(55031);array = " .'".toCharArray();
        __CLR4_5_2169x169xlvha7ilm.R.inc(55032);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55033);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55034);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55035);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55036);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55037);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55038);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55039);assertEquals("BJL", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55040);assertEquals("BJL", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55041);assertEquals("KOM", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55042);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(55043);array = "SIJo1".toCharArray();
        __CLR4_5_2169x169xlvha7ilm.R.inc(55044);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55045);assertEquals("", WordUtils.initials("", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55046);assertEquals(" ", WordUtils.initials("  ", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55047);assertEquals("", WordUtils.initials("I", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55048);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55049);assertEquals("C", WordUtils.initials("SJC", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55050);assertEquals("Bh", WordUtils.initials("Ben John Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55051);assertEquals("B.", WordUtils.initials("Ben J.Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55052);assertEquals(" h", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55053);assertEquals("K", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55054);assertEquals("i2", WordUtils.initials("i am here 123", array));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSwapCase_String() {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),55055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vnsj2616hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testSwapCase_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55055,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vnsj2616hb(){try{__CLR4_5_2169x169xlvha7ilm.R.inc(55055);
        __CLR4_5_2169x169xlvha7ilm.R.inc(55056);assertEquals(null, WordUtils.swapCase(null));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55057);assertEquals("", WordUtils.swapCase(""));
        __CLR4_5_2169x169xlvha7ilm.R.inc(55058);assertEquals("  ", WordUtils.swapCase("  "));
        
        __CLR4_5_2169x169xlvha7ilm.R.inc(55059);assertEquals("i", WordUtils.swapCase("I") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(55060);assertEquals("I", WordUtils.swapCase("i") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(55061);assertEquals("I AM HERE 123", WordUtils.swapCase("i am here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(55062);assertEquals("i aM hERE 123", WordUtils.swapCase("I Am Here 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(55063);assertEquals("I AM here 123", WordUtils.swapCase("i am HERE 123") );
        __CLR4_5_2169x169xlvha7ilm.R.inc(55064);assertEquals("i am here 123", WordUtils.swapCase("I AM HERE 123") );

        __CLR4_5_2169x169xlvha7ilm.R.inc(55065);final String test = "This String contains a TitleCase character: \u01c8";
        __CLR4_5_2169x169xlvha7ilm.R.inc(55066);final String expect = "tHIS sTRING CONTAINS A tITLEcASE CHARACTER: \u01c9";
        __CLR4_5_2169x169xlvha7ilm.R.inc(55067);assertEquals(expect, WordUtils.swapCase(test));
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}
    
    @Test
    public void testLANG1292() throws Exception {__CLR4_5_2169x169xlvha7ilm.R.globalSliceStart(getClass().getName(),55068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlc7sx16ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2169x169xlvha7ilm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2169x169xlvha7ilm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testLANG1292",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlc7sx16ho() throws Exception{try{__CLR4_5_2169x169xlvha7ilm.R.inc(55068);
        // Prior to fix, this was throwing StringIndexOutOfBoundsException
        __CLR4_5_2169x169xlvha7ilm.R.inc(55069);WordUtils.wrap("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",70);
    }finally{__CLR4_5_2169x169xlvha7ilm.R.flushNeeded();}}

}
