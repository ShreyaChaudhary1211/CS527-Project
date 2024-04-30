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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.test.SystemDefaultsSwitch;
import org.hamcrest.core.IsNot;
import org.junit.Rule;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Equals/IndexOf methods
 */
public class StringUtilsEqualsIndexOfTest  {static class __CLR4_5_2qteqtelvha7gg5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,35316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Rule
    public SystemDefaultsSwitch defaults = new SystemDefaultsSwitch();

    private static final String BAR = "bar";
    /**
     * Supplementary character U+20000
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20000 = "\ud840\udc00";
    /**
     * Supplementary character U+20001
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20001 = "\ud840\udc01";

    private static final String FOO = "foo";

    private static final String FOOBAR = "foobar";

    private static final String[] FOOBAR_SUB_ARRAY = new String[] {"ob", "ba"};

    // The purpose of this class is to test StringUtils#equals(CharSequence, CharSequence)
    // with a CharSequence implementation whose equals(Object) override requires that the
    // other object be an instance of CustomCharSequence, even though, as char sequences,
    // `seq` may equal the other object.
    private static class CustomCharSequence implements CharSequence {
        private final CharSequence seq;

        public CustomCharSequence(final CharSequence seq) {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34754);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34755);this.seq = seq;
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public char charAt(final int index) {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34756);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34757);return seq.charAt(index);
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public int length() {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34758);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34759);return seq.length();
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public CharSequence subSequence(final int start, final int end) {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34760);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34761);return new CustomCharSequence(seq.subSequence(start, end));
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34762);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34763);if ((((obj == null || !(obj instanceof CustomCharSequence))&&(__CLR4_5_2qteqtelvha7gg5.R.iget(34764)!=0|true))||(__CLR4_5_2qteqtelvha7gg5.R.iget(34765)==0&false))) {{
                __CLR4_5_2qteqtelvha7gg5.R.inc(34766);return false;
            }
            }__CLR4_5_2qteqtelvha7gg5.R.inc(34767);final CustomCharSequence other = (CustomCharSequence) obj;
            __CLR4_5_2qteqtelvha7gg5.R.inc(34768);return seq.equals(other.seq);
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34769);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34770);return seq.hashCode();
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2qteqtelvha7gg5.R.inc(34771);
            __CLR4_5_2qteqtelvha7gg5.R.inc(34772);return seq.toString();
        }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}
    }

    @Test
    public void testCustomCharSequence() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pfmbnjqtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCustomCharSequence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pfmbnjqtx(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34773);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34774);assertThat(new CustomCharSequence(FOO), IsNot.<CharSequence>not(FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34775);assertThat(FOO, IsNot.<CharSequence>not(new CustomCharSequence(FOO)));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34776);assertEquals(new CustomCharSequence(FOO), new CustomCharSequence(FOO));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608qu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608qu1(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34777);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34778);final CharSequence fooCs = new StringBuilder(FOO), barCs = new StringBuilder(BAR), foobarCs = new StringBuilder(FOOBAR);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34779);assertTrue(StringUtils.equals(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34780);assertTrue(StringUtils.equals(fooCs, fooCs));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34781);assertTrue(StringUtils.equals(fooCs, new StringBuilder(FOO)));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34782);assertTrue(StringUtils.equals(fooCs, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34783);assertTrue(StringUtils.equals(fooCs, new CustomCharSequence(FOO)));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34784);assertTrue(StringUtils.equals(new CustomCharSequence(FOO), fooCs));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34785);assertFalse(StringUtils.equals(fooCs, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34786);assertFalse(StringUtils.equals(fooCs, barCs));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34787);assertFalse(StringUtils.equals(fooCs, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34788);assertFalse(StringUtils.equals(null, fooCs));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34789);assertFalse(StringUtils.equals(fooCs, foobarCs));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34790);assertFalse(StringUtils.equals(foobarCs, fooCs));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testEqualsOnStrings() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2biupbtquf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsOnStrings",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2biupbtquf(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34791);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34792);assertTrue(StringUtils.equals(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34793);assertTrue(StringUtils.equals(FOO, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34794);assertTrue(StringUtils.equals(FOO, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34795);assertFalse(StringUtils.equals(FOO, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34796);assertFalse(StringUtils.equals(FOO, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34797);assertFalse(StringUtils.equals(FOO, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34798);assertFalse(StringUtils.equals(null, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34799);assertFalse(StringUtils.equals(FOO, FOOBAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34800);assertFalse(StringUtils.equals(FOOBAR, FOO));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testEqualsIgnoreCase() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c1544mqup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c1544mqup(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34801);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34802);assertTrue(StringUtils.equalsIgnoreCase(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34803);assertTrue(StringUtils.equalsIgnoreCase(FOO, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34804);assertTrue(StringUtils.equalsIgnoreCase(FOO, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34805);assertTrue(StringUtils.equalsIgnoreCase(FOO, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34806);assertFalse(StringUtils.equalsIgnoreCase(FOO, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34807);assertFalse(StringUtils.equalsIgnoreCase(FOO, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34808);assertFalse(StringUtils.equalsIgnoreCase(null, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34809);assertTrue(StringUtils.equalsIgnoreCase("",""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34810);assertFalse(StringUtils.equalsIgnoreCase("abcd","abcd "));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testEqualsAny() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x15r1equz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsAny",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x15r1equz(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34811);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34812);assertFalse(StringUtils.equalsAny(FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34813);assertFalse(StringUtils.equalsAny(FOO, new String[]{}));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34814);assertTrue(StringUtils.equalsAny(FOO, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34815);assertTrue(StringUtils.equalsAny(FOO, BAR, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34816);assertFalse(StringUtils.equalsAny(FOO, BAR, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34817);assertFalse(StringUtils.equalsAny(FOO, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34818);assertFalse(StringUtils.equalsAny(FOO, BAR, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34819);assertFalse(StringUtils.equalsAny(null, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34820);assertFalse(StringUtils.equalsAny(FOO, FOOBAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34821);assertFalse(StringUtils.equalsAny(FOOBAR, FOO));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34822);assertTrue(StringUtils.equalsAny(null, null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34823);assertFalse(StringUtils.equalsAny(null, FOO, BAR, FOOBAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34824);assertFalse(StringUtils.equalsAny(FOO, null, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34825);assertTrue(StringUtils.equalsAny(FOO, BAR, null, "", FOO, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34826);assertFalse(StringUtils.equalsAny(FOO, FOO.toUpperCase()));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34827);assertFalse(StringUtils.equalsAny(null, (CharSequence[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34828);assertTrue(StringUtils.equalsAny(FOO, new CustomCharSequence("foo")));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34829);assertTrue(StringUtils.equalsAny(FOO, new StringBuilder("foo")));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34830);assertFalse(StringUtils.equalsAny(FOO, new CustomCharSequence("fOo")));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34831);assertFalse(StringUtils.equalsAny(FOO, new StringBuilder("fOo")));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testEqualsAnyIgnoreCase() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ve5mxwqvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsAnyIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ve5mxwqvk(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34832);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34833);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34834);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO, new String[]{}));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34835);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34836);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, FOO.toUpperCase()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34837);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, FOO, new String(new char[]{'f', 'o', 'o'})));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34838);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, BAR, new String(new char[]{'f', 'O', 'O'})));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34839);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34840);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO, BAR, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34841);assertFalse(StringUtils.equalsAnyIgnoreCase(null, FOO));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34842);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO, FOOBAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34843);assertFalse(StringUtils.equalsAnyIgnoreCase(FOOBAR, FOO));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34844);assertTrue(StringUtils.equalsAnyIgnoreCase(null, null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34845);assertFalse(StringUtils.equalsAnyIgnoreCase(null, FOO, BAR, FOOBAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34846);assertFalse(StringUtils.equalsAnyIgnoreCase(FOO, null, BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34847);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, BAR, null, "", FOO.toUpperCase(), BAR));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34848);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, FOO.toUpperCase()));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34849);assertFalse(StringUtils.equalsAnyIgnoreCase(null, (CharSequence[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34850);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, new CustomCharSequence("fOo")));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34851);assertTrue(StringUtils.equalsAnyIgnoreCase(FOO, new StringBuilder("fOo")));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCompare_StringString() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21020hhqw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCompare_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21020hhqw4(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34852);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34853);assertTrue(StringUtils.compare(null, null) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34854);assertTrue(StringUtils.compare(null, "a") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34855);assertTrue(StringUtils.compare("a", null) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34856);assertTrue(StringUtils.compare("abc", "abc") == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34857);assertTrue(StringUtils.compare("a", "b") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34858);assertTrue(StringUtils.compare("b", "a") > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34859);assertTrue(StringUtils.compare("a", "B") > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34860);assertTrue(StringUtils.compare("abc", "abd") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34861);assertTrue(StringUtils.compare("ab", "abc") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34862);assertTrue(StringUtils.compare("ab", "ab ") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34863);assertTrue(StringUtils.compare("abc", "ab ") > 0);
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testCompare_StringStringBoolean() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285rishqwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCompare_StringStringBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285rishqwg(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34864);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34865);assertTrue(StringUtils.compare(null, null, false) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34866);assertTrue(StringUtils.compare(null, "a", true) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34867);assertTrue(StringUtils.compare(null, "a", false) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34868);assertTrue(StringUtils.compare("a", null, true) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34869);assertTrue(StringUtils.compare("a", null, false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34870);assertTrue(StringUtils.compare("abc", "abc", false) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34871);assertTrue(StringUtils.compare("a", "b", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34872);assertTrue(StringUtils.compare("b", "a", false) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34873);assertTrue(StringUtils.compare("a", "B", false) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34874);assertTrue(StringUtils.compare("abc", "abd", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34875);assertTrue(StringUtils.compare("ab", "abc", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34876);assertTrue(StringUtils.compare("ab", "ab ", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34877);assertTrue(StringUtils.compare("abc", "ab ", false) > 0);
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testCompareIgnoreCase_StringString() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmqa6lqwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCompareIgnoreCase_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmqa6lqwu(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34878);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34879);assertTrue(StringUtils.compareIgnoreCase(null, null) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34880);assertTrue(StringUtils.compareIgnoreCase(null, "a") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34881);assertTrue(StringUtils.compareIgnoreCase("a", null) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34882);assertTrue(StringUtils.compareIgnoreCase("abc", "abc") == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34883);assertTrue(StringUtils.compareIgnoreCase("abc", "ABC") == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34884);assertTrue(StringUtils.compareIgnoreCase("a", "b") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34885);assertTrue(StringUtils.compareIgnoreCase("b", "a") > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34886);assertTrue(StringUtils.compareIgnoreCase("a", "B") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34887);assertTrue(StringUtils.compareIgnoreCase("A", "b") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34888);assertTrue(StringUtils.compareIgnoreCase("abc", "ABD") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34889);assertTrue(StringUtils.compareIgnoreCase("ab", "ABC") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34890);assertTrue(StringUtils.compareIgnoreCase("ab", "AB ") < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34891);assertTrue(StringUtils.compareIgnoreCase("abc", "AB ") > 0);
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testCompareIgnoreCase_StringStringBoolean() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9d4pvqx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCompareIgnoreCase_StringStringBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9d4pvqx8(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34892);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34893);assertTrue(StringUtils.compareIgnoreCase(null, null, false) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34894);assertTrue(StringUtils.compareIgnoreCase(null, "a", true) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34895);assertTrue(StringUtils.compareIgnoreCase(null, "a", false) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34896);assertTrue(StringUtils.compareIgnoreCase("a", null, true) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34897);assertTrue(StringUtils.compareIgnoreCase("a", null, false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34898);assertTrue(StringUtils.compareIgnoreCase("abc", "abc", false) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34899);assertTrue(StringUtils.compareIgnoreCase("abc", "ABC", false) == 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34900);assertTrue(StringUtils.compareIgnoreCase("a", "b", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34901);assertTrue(StringUtils.compareIgnoreCase("b", "a", false) > 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34902);assertTrue(StringUtils.compareIgnoreCase("a", "B", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34903);assertTrue(StringUtils.compareIgnoreCase("A", "b", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34904);assertTrue(StringUtils.compareIgnoreCase("abc", "ABD", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34905);assertTrue(StringUtils.compareIgnoreCase("ab", "ABC", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34906);assertTrue(StringUtils.compareIgnoreCase("ab", "AB ", false) < 0);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34907);assertTrue(StringUtils.compareIgnoreCase("abc", "AB ", false) > 0);
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf_char() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22eupffqxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22eupffqxo(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34908);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34909);assertEquals(-1, StringUtils.indexOf(null, ' '));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34910);assertEquals(-1, StringUtils.indexOf("", ' '));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34911);assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34912);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34913);assertEquals(2, StringUtils.indexOf(new StringBuilder("aabaabaa"), 'b'));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOf_charInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g13kegqxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g13kegqxu(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34914);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34915);assertEquals(-1, StringUtils.indexOf(null, ' ', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34916);assertEquals(-1, StringUtils.indexOf(null, ' ', -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34917);assertEquals(-1, StringUtils.indexOf("", ' ', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34918);assertEquals(-1, StringUtils.indexOf("", ' ', -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34919);assertEquals(0, StringUtils.indexOf("aabaabaa", 'a', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34920);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34921);assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34922);assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34923);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34924);assertEquals(5, StringUtils.indexOf(new StringBuilder("aabaabaa"), 'b', 3));
        
        //LANG-1300 tests go here
        __CLR4_5_2qteqtelvha7gg5.R.inc(34925);final int CODE_POINT = 0x2070E;
        __CLR4_5_2qteqtelvha7gg5.R.inc(34926);StringBuilder builder = new StringBuilder();
        __CLR4_5_2qteqtelvha7gg5.R.inc(34927);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34928);assertEquals(0, StringUtils.indexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34929);assertEquals(0, StringUtils.indexOf(builder.toString(), CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34930);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34931);assertEquals(2, StringUtils.indexOf(builder, CODE_POINT, 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34932);assertEquals(2, StringUtils.indexOf(builder.toString(), CODE_POINT, 1));
        // inner branch on the supplementary character block
        __CLR4_5_2qteqtelvha7gg5.R.inc(34933);char[] tmp = { (char) 55361 };
        __CLR4_5_2qteqtelvha7gg5.R.inc(34934);builder = new StringBuilder();
        __CLR4_5_2qteqtelvha7gg5.R.inc(34935);builder.append(tmp);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34936);assertEquals(-1, StringUtils.indexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34937);assertEquals(-1, StringUtils.indexOf(builder.toString(), CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34938);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34939);assertEquals(1, StringUtils.indexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34940);assertEquals(1, StringUtils.indexOf(builder.toString(), CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34941);assertEquals(-1, StringUtils.indexOf(builder, CODE_POINT, 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34942);assertEquals(-1, StringUtils.indexOf(builder.toString(), CODE_POINT, 2));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOf_String() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qm76bkqyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qm76bkqyn(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34943);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34944);assertEquals(-1, StringUtils.indexOf(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34945);assertEquals(-1, StringUtils.indexOf("", null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34946);assertEquals(0, StringUtils.indexOf("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34947);assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34948);assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34949);assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34950);assertEquals(0, StringUtils.indexOf("aabaabaa", ""));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34951);assertEquals(2, StringUtils.indexOf(new StringBuilder("aabaabaa"), "b"));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOf_StringInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qeq93xqyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qeq93xqyw(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34952);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34953);assertEquals(-1, StringUtils.indexOf(null, null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34954);assertEquals(-1, StringUtils.indexOf(null, null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34955);assertEquals(-1, StringUtils.indexOf(null, "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34956);assertEquals(-1, StringUtils.indexOf(null, "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34957);assertEquals(-1, StringUtils.indexOf("", null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34958);assertEquals(-1, StringUtils.indexOf("", null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34959);assertEquals(0, StringUtils.indexOf("", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34960);assertEquals(0, StringUtils.indexOf("", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34961);assertEquals(0, StringUtils.indexOf("", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34962);assertEquals(0, StringUtils.indexOf("abc", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34963);assertEquals(0, StringUtils.indexOf("abc", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34964);assertEquals(3, StringUtils.indexOf("abc", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34965);assertEquals(3, StringUtils.indexOf("abc", "", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34966);assertEquals(0, StringUtils.indexOf("aabaabaa", "a", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34967);assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34968);assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34969);assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34970);assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34971);assertEquals(2, StringUtils.indexOf("aabaabaa", "b", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34972);assertEquals(2,StringUtils.indexOf("aabaabaa", "", 2));

        // Test that startIndex works correctly, i.e. cannot match before startIndex
        __CLR4_5_2qteqtelvha7gg5.R.inc(34973);assertEquals(7, StringUtils.indexOf("12345678", "8", 5));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34974);assertEquals(7, StringUtils.indexOf("12345678", "8", 6));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34975);assertEquals(7, StringUtils.indexOf("12345678", "8", 7)); // 7 is last index
        __CLR4_5_2qteqtelvha7gg5.R.inc(34976);assertEquals(-1, StringUtils.indexOf("12345678", "8", 8));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34977);assertEquals(5, StringUtils.indexOf(new StringBuilder("aabaabaa"), "b", 3));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringCharArray() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mjfr0vqzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mjfr0vqzm(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34978);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34979);assertEquals(-1, StringUtils.indexOfAny(null, (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34980);assertEquals(-1, StringUtils.indexOfAny(null, new char[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34981);assertEquals(-1, StringUtils.indexOfAny(null, 'a','b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34982);assertEquals(-1, StringUtils.indexOfAny("", (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34983);assertEquals(-1, StringUtils.indexOfAny("", new char[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34984);assertEquals(-1, StringUtils.indexOfAny("", 'a','b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34985);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34986);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new char[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34987);assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", 'z','a'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34988);assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", 'b','y'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34989);assertEquals(-1, StringUtils.indexOfAny("ab", 'z'));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testIndexOfAny_StringCharArrayWithSupplementaryChars() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ozixvqzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ozixvqzy(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34990);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34991);assertEquals(0, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34992);assertEquals(2, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34993);assertEquals(0, StringUtils.indexOfAny(CharU20000, CharU20000.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34994);assertEquals(-1, StringUtils.indexOfAny(CharU20000, CharU20001.toCharArray()));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringString() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),34995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ato7yrr03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ato7yrr03(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(34995);
        __CLR4_5_2qteqtelvha7gg5.R.inc(34996);assertEquals(-1, StringUtils.indexOfAny(null, (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34997);assertEquals(-1, StringUtils.indexOfAny(null, ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(34998);assertEquals(-1, StringUtils.indexOfAny(null, "ab"));

        __CLR4_5_2qteqtelvha7gg5.R.inc(34999);assertEquals(-1, StringUtils.indexOfAny("", (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35000);assertEquals(-1, StringUtils.indexOfAny("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35001);assertEquals(-1, StringUtils.indexOfAny("", "ab"));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35002);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35003);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35004);assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35005);assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35006);assertEquals(-1, StringUtils.indexOfAny("ab", "z"));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringStringArray() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2mii4r0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2mii4r0f(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35007);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35008);assertEquals(-1, StringUtils.indexOfAny(null, (String[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35009);assertEquals(-1, StringUtils.indexOfAny(null, FOOBAR_SUB_ARRAY));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35010);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, (String[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35011);assertEquals(2, StringUtils.indexOfAny(FOOBAR, FOOBAR_SUB_ARRAY));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35012);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35013);assertEquals(-1, StringUtils.indexOfAny(null, new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35014);assertEquals(-1, StringUtils.indexOfAny("", new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35015);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[] {"llll"}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35016);assertEquals(0, StringUtils.indexOfAny(FOOBAR, new String[] {""}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35017);assertEquals(0, StringUtils.indexOfAny("", new String[] {""}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35018);assertEquals(-1, StringUtils.indexOfAny("", new String[] {"a"}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35019);assertEquals(-1, StringUtils.indexOfAny("", new String[] {null}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35020);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[] {null}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35021);assertEquals(-1, StringUtils.indexOfAny(null, new String[] {null}));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testIndexOfAny_StringStringWithSupplementaryChars() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvlf2xr0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvlf2xr0u(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35022);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35023);assertEquals(0, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20000));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35024);assertEquals(2, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20001));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35025);assertEquals(0, StringUtils.indexOfAny(CharU20000, CharU20000));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35026);assertEquals(-1, StringUtils.indexOfAny(CharU20000, CharU20001));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringCharArray() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nblwe2r0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nblwe2r0z(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35027);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35028);assertEquals(-1, StringUtils.indexOfAnyBut(null, (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35029);assertEquals(-1, StringUtils.indexOfAnyBut(null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35030);assertEquals(-1, StringUtils.indexOfAnyBut(null, 'a','b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35031);assertEquals(-1, StringUtils.indexOfAnyBut("", (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35032);assertEquals(-1, StringUtils.indexOfAnyBut(""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35033);assertEquals(-1, StringUtils.indexOfAnyBut("", 'a','b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35034);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (char[]) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35035);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35036);assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", 'z','a'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35037);assertEquals(0, StringUtils.indexOfAnyBut("zzabyycdxx", 'b','y'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35038);assertEquals(-1, StringUtils.indexOfAnyBut("aba", 'a', 'b'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35039);assertEquals(0, StringUtils.indexOfAnyBut("aba", 'z'));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringCharArrayWithSupplementaryChars() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224gi92r1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224gi92r1c(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35040);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35041);assertEquals(2, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35042);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35043);assertEquals(-1, StringUtils.indexOfAnyBut(CharU20000, CharU20000.toCharArray()));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35044);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000, CharU20001.toCharArray()));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringString() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22npunwr1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22npunwr1h(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35045);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35046);assertEquals(-1, StringUtils.indexOfAnyBut(null, (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35047);assertEquals(-1, StringUtils.indexOfAnyBut(null, ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35048);assertEquals(-1, StringUtils.indexOfAnyBut(null, "ab"));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35049);assertEquals(-1, StringUtils.indexOfAnyBut("", (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35050);assertEquals(-1, StringUtils.indexOfAnyBut("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35051);assertEquals(-1, StringUtils.indexOfAnyBut("", "ab"));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35052);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (String) null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35053);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35054);assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35055);assertEquals(0, StringUtils.indexOfAnyBut("zzabyycdxx", "by"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35056);assertEquals(0, StringUtils.indexOfAnyBut("ab", "z"));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringStringWithSupplementaryChars() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7ri6or1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7ri6or1t(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35057);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35058);assertEquals(2, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20000));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35059);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20001));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35060);assertEquals(-1, StringUtils.indexOfAnyBut(CharU20000, CharU20000));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35061);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000, CharU20001));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfIgnoreCase_String() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q89f7mr1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q89f7mr1y(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35062);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35063);assertEquals(-1, StringUtils.indexOfIgnoreCase(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35064);assertEquals(-1, StringUtils.indexOfIgnoreCase(null, ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35065);assertEquals(-1, StringUtils.indexOfIgnoreCase("", null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35066);assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35067);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35068);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35069);assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "b"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35070);assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35071);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "ab"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35072);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35073);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", ""));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testIndexOfIgnoreCase_StringInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hw1rq9r2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hw1rq9r2a(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35074);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35075);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35076);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35077);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35078);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35079);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35080);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 4));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35081);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 5));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35082);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 6));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35083);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 7));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35084);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35085);assertEquals(1, StringUtils.indexOfIgnoreCase("aab", "AB", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35086);assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "", 5));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35087);assertEquals(-1, StringUtils.indexOfIgnoreCase("ab", "AAB", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35088);assertEquals(-1, StringUtils.indexOfIgnoreCase("aab", "AAB", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35089);assertEquals(-1, StringUtils.indexOfIgnoreCase("abc", "", 9));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hag5h7r2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hag5h7r2q(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35090);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35091);assertEquals(-1, StringUtils.lastIndexOf(null, ' '));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35092);assertEquals(-1, StringUtils.lastIndexOf("", ' '));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35093);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35094);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35095);assertEquals(5, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), 'b'));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_charInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mdwi82r2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mdwi82r2w(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35096);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35097);assertEquals(-1, StringUtils.lastIndexOf(null, ' ', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35098);assertEquals(-1, StringUtils.lastIndexOf(null, ' ', -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35099);assertEquals(-1, StringUtils.lastIndexOf("", ' ', 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35100);assertEquals(-1, StringUtils.lastIndexOf("", ' ', -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35101);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a', 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35102);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35103);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35104);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35105);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35106);assertEquals(0, StringUtils.lastIndexOf("aabaabaa", 'a', 0));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35107);assertEquals(2, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), 'b', 2));
        
        //LANG-1300 addition test
        __CLR4_5_2qteqtelvha7gg5.R.inc(35108);final int CODE_POINT = 0x2070E;
        __CLR4_5_2qteqtelvha7gg5.R.inc(35109);StringBuilder builder = new StringBuilder();
        __CLR4_5_2qteqtelvha7gg5.R.inc(35110);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35111);assertEquals(0, StringUtils.lastIndexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35112);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35113);assertEquals(0, StringUtils.lastIndexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35114);assertEquals(0, StringUtils.lastIndexOf(builder, CODE_POINT, 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35115);assertEquals(2, StringUtils.lastIndexOf(builder, CODE_POINT, 2));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35116);builder.append("aaaaa");
        __CLR4_5_2qteqtelvha7gg5.R.inc(35117);assertEquals(2, StringUtils.lastIndexOf(builder, CODE_POINT, 4));
        // inner branch on the supplementary character block
        __CLR4_5_2qteqtelvha7gg5.R.inc(35118);char[] tmp = { (char) 55361 };
        __CLR4_5_2qteqtelvha7gg5.R.inc(35119);builder = new StringBuilder();
        __CLR4_5_2qteqtelvha7gg5.R.inc(35120);builder.append(tmp);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35121);assertEquals(-1, StringUtils.lastIndexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35122);builder.appendCodePoint(CODE_POINT);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35123);assertEquals(-1, StringUtils.lastIndexOf(builder, CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35124);assertEquals(1, StringUtils.lastIndexOf(builder, CODE_POINT, 1 ));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35125);assertEquals(-1, StringUtils.lastIndexOf(builder.toString(), CODE_POINT, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35126);assertEquals(1, StringUtils.lastIndexOf(builder.toString(), CODE_POINT, 1));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dkp8s6r3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dkp8s6r3r(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35127);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35128);assertEquals(-1, StringUtils.lastIndexOf(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35129);assertEquals(-1, StringUtils.lastIndexOf("", null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35130);assertEquals(-1, StringUtils.lastIndexOf("", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35131);assertEquals(0, StringUtils.lastIndexOf("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35132);assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35133);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35134);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35135);assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab"));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35136);assertEquals(4, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), "ab"));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StringInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28t3sknr41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28t3sknr41(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35137);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35138);assertEquals(-1, StringUtils.lastIndexOf(null, null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35139);assertEquals(-1, StringUtils.lastIndexOf(null, null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35140);assertEquals(-1, StringUtils.lastIndexOf(null, "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35141);assertEquals(-1, StringUtils.lastIndexOf(null, "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35142);assertEquals(-1, StringUtils.lastIndexOf("", null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35143);assertEquals(-1, StringUtils.lastIndexOf("", null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35144);assertEquals(0, StringUtils.lastIndexOf("", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35145);assertEquals(-1, StringUtils.lastIndexOf("", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35146);assertEquals(0, StringUtils.lastIndexOf("", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35147);assertEquals(0, StringUtils.lastIndexOf("abc", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35148);assertEquals(-1, StringUtils.lastIndexOf("abc", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35149);assertEquals(3, StringUtils.lastIndexOf("abc", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35150);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35151);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35152);assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35153);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35154);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35155);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35156);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35157);assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35158);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "a", -1));

        // Test that fromIndex works correctly, i.e. cannot match after fromIndex
        __CLR4_5_2qteqtelvha7gg5.R.inc(35159);assertEquals(7, StringUtils.lastIndexOf("12345678", "8", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35160);assertEquals(7, StringUtils.lastIndexOf("12345678", "8", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35161);assertEquals(7, StringUtils.lastIndexOf("12345678", "8", 7)); // 7 is last index
        __CLR4_5_2qteqtelvha7gg5.R.inc(35162);assertEquals(-1, StringUtils.lastIndexOf("12345678", "8", 6));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35163);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35164);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35165);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "ba", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35166);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "ba", 3));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35167);assertEquals(2, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), "b", 3));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOfAny_StringStringArray() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3gh12r4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3gh12r4w(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35168);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35169);assertEquals(-1, StringUtils.lastIndexOfAny(null, (CharSequence) null));   // test both types of ...
        __CLR4_5_2qteqtelvha7gg5.R.inc(35170);assertEquals(-1, StringUtils.lastIndexOfAny(null, (CharSequence[]) null)); // ... varargs invocation
        __CLR4_5_2qteqtelvha7gg5.R.inc(35171);assertEquals(-1, StringUtils.lastIndexOfAny(null)); // Missing varag
        __CLR4_5_2qteqtelvha7gg5.R.inc(35172);assertEquals(-1, StringUtils.lastIndexOfAny(null, FOOBAR_SUB_ARRAY));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35173);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, (CharSequence) null));   // test both types of ...
        __CLR4_5_2qteqtelvha7gg5.R.inc(35174);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, (CharSequence[]) null)); // ... varargs invocation
        __CLR4_5_2qteqtelvha7gg5.R.inc(35175);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR)); // Missing vararg
        __CLR4_5_2qteqtelvha7gg5.R.inc(35176);assertEquals(3, StringUtils.lastIndexOfAny(FOOBAR, FOOBAR_SUB_ARRAY));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35177);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35178);assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35179);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[0]));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35180);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] {"llll"}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35181);assertEquals(6, StringUtils.lastIndexOfAny(FOOBAR, new String[] {""}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35182);assertEquals(0, StringUtils.lastIndexOfAny("", new String[] {""}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35183);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] {"a"}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35184);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] {null}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35185);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] {null}));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35186);assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[] {null}));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIgnoreCase_String() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22c4f5gr5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22c4f5gr5f(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35187);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35188);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35189);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35190);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35191);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35192);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35193);assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", ""));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35194);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "a"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35195);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35196);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "b"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35197);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35198);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "ab"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35199);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35200);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("ab", "AAB"));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35201);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aab", "AAB"));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIgnoreCase_StringInt() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2meq82fr5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2meq82fr5u(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35202);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35203);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35204);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35205);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35206);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35207);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35208);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35209);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35210);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35211);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35212);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("abc", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35213);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35214);assertEquals(3, StringUtils.lastIndexOfIgnoreCase("abc", "", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35215);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35216);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35217);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35218);assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35219);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35220);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35221);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35222);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35223);assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aab", "AB", 1));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLastOrdinalIndexOf() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jortmhr6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jortmhr6g(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35224);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35225);assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "*", 42) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35226);assertEquals(-1, StringUtils.lastOrdinalIndexOf("*", null, 42) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35227);assertEquals(0, StringUtils.lastOrdinalIndexOf("", "", 42) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35228);assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35229);assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35230);assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35231);assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35232);assertEquals(4, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35233);assertEquals(1, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35234);assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1) );
        __CLR4_5_2qteqtelvha7gg5.R.inc(35235);assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2) );
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testOrdinalIndexOf() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b5ft8xr6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b5ft8xr6s(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35236);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35237);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35238);assertEquals(-1, StringUtils.ordinalIndexOf("", null, Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35239);assertEquals(-1, StringUtils.ordinalIndexOf("", "", Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35240);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35241);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35242);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", Integer.MIN_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35243);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", Integer.MIN_VALUE));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35244);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35245);assertEquals(-1, StringUtils.ordinalIndexOf("", null, -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35246);assertEquals(-1, StringUtils.ordinalIndexOf("", "", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35247);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35248);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35249);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", -1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35250);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", -1));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35251);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35252);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35253);assertEquals(-1, StringUtils.ordinalIndexOf("", "", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35254);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35255);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35256);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35257);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", 0));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35258);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35259);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35260);assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35261);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35262);assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35263);assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35264);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35265);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35266);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35267);assertEquals(0, StringUtils.ordinalIndexOf("", "", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35268);assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35269);assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35270);assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35271);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 2));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35272);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35273);assertEquals(-1, StringUtils.ordinalIndexOf("", null, Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35274);assertEquals(0, StringUtils.ordinalIndexOf("", "", Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35275);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35276);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35277);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", Integer.MAX_VALUE));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35278);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", Integer.MAX_VALUE));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35279);assertEquals(-1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 0));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35280);assertEquals(0, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35281);assertEquals(1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35282);assertEquals(2, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35283);assertEquals(3, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 4));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35284);assertEquals(4, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 5));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35285);assertEquals(5, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 6));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35286);assertEquals(6, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 7));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35287);assertEquals(7, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 8));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35288);assertEquals(8, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 9));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35289);assertEquals(-1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 10));

        // match at each possible position
        __CLR4_5_2qteqtelvha7gg5.R.inc(35290);assertEquals(0, StringUtils.ordinalIndexOf("aaaaaa", "aa", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35291);assertEquals(1, StringUtils.ordinalIndexOf("aaaaaa", "aa", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35292);assertEquals(2, StringUtils.ordinalIndexOf("aaaaaa", "aa", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35293);assertEquals(3, StringUtils.ordinalIndexOf("aaaaaa", "aa", 4));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35294);assertEquals(4, StringUtils.ordinalIndexOf("aaaaaa", "aa", 5));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35295);assertEquals(-1, StringUtils.ordinalIndexOf("aaaaaa", "aa", 6));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35296);assertEquals(0, StringUtils.ordinalIndexOf("ababab", "aba", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35297);assertEquals(2, StringUtils.ordinalIndexOf("ababab", "aba", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35298);assertEquals(-1, StringUtils.ordinalIndexOf("ababab", "aba", 3));

        __CLR4_5_2qteqtelvha7gg5.R.inc(35299);assertEquals(0, StringUtils.ordinalIndexOf("abababab", "abab", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35300);assertEquals(2, StringUtils.ordinalIndexOf("abababab", "abab", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35301);assertEquals(4, StringUtils.ordinalIndexOf("abababab", "abab", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35302);assertEquals(-1, StringUtils.ordinalIndexOf("abababab", "abab", 4));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    public void testLANG1193() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vz6vghr8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLANG1193",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vz6vghr8n(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35303);
        __CLR4_5_2qteqtelvha7gg5.R.inc(35304);assertEquals(0, StringUtils.ordinalIndexOf("abc", "ab", 1));        
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    // Non-overlapping test
    public void testLANG1241_1() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xf7p2hr8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLANG1241_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xf7p2hr8p(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35305);
        //                                          0  3  6
        __CLR4_5_2qteqtelvha7gg5.R.inc(35306);assertEquals(0, StringUtils.ordinalIndexOf("abaabaab", "ab", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35307);assertEquals(3, StringUtils.ordinalIndexOf("abaabaab", "ab", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35308);assertEquals(6, StringUtils.ordinalIndexOf("abaabaab", "ab", 3));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}

    @Test
    // Overlapping matching test
    public void testLANG1241_2() {__CLR4_5_2qteqtelvha7gg5.R.globalSliceStart(getClass().getName(),35309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u67qa0r8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qteqtelvha7gg5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qteqtelvha7gg5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLANG1241_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),35309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u67qa0r8t(){try{__CLR4_5_2qteqtelvha7gg5.R.inc(35309);
        //                                          0 2 4
        __CLR4_5_2qteqtelvha7gg5.R.inc(35310);assertEquals(0, StringUtils.ordinalIndexOf("abababa", "aba", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35311);assertEquals(2, StringUtils.ordinalIndexOf("abababa", "aba", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35312);assertEquals(4, StringUtils.ordinalIndexOf("abababa", "aba", 3));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35313);assertEquals(0, StringUtils.ordinalIndexOf("abababab", "abab", 1));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35314);assertEquals(2, StringUtils.ordinalIndexOf("abababab", "abab", 2));
        __CLR4_5_2qteqtelvha7gg5.R.inc(35315);assertEquals(4, StringUtils.ordinalIndexOf("abababab", "abab", 3));
    }finally{__CLR4_5_2qteqtelvha7gg5.R.flushNeeded();}}
}
