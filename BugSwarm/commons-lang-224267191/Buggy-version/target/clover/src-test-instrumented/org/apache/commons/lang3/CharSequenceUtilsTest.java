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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Tests CharSequenceUtils
 */
public class CharSequenceUtilsTest {static class __CLR4_5_2mzumzulvha7fhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,29883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hmzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hmzu(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29802);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29803);assertNotNull(new CharSequenceUtils());
        __CLR4_5_2mzumzulvha7fhg.R.inc(29804);final Constructor<?>[] cons = CharSequenceUtils.class.getDeclaredConstructors();
        __CLR4_5_2mzumzulvha7fhg.R.inc(29805);assertEquals(1, cons.length);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29806);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29807);assertTrue(Modifier.isPublic(CharSequenceUtils.class.getModifiers()));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29808);assertFalse(Modifier.isFinal(CharSequenceUtils.class.getModifiers()));
    }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSubSequence() {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9n7u2n01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9n7u2n01(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29809);
        //
        // null input
        //
        __CLR4_5_2mzumzulvha7fhg.R.inc(29810);assertEquals(null, CharSequenceUtils.subSequence(null, -1));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29811);assertEquals(null, CharSequenceUtils.subSequence(null, 0));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29812);assertEquals(null, CharSequenceUtils.subSequence(null, 1));
        //
        // non-null input
        //
        __CLR4_5_2mzumzulvha7fhg.R.inc(29813);assertEquals(StringUtils.EMPTY, CharSequenceUtils.subSequence(StringUtils.EMPTY, 0));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29814);assertEquals("012", CharSequenceUtils.subSequence("012", 0));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29815);assertEquals("12", CharSequenceUtils.subSequence("012", 1));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29816);assertEquals("2", CharSequenceUtils.subSequence("012", 2));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29817);assertEquals(StringUtils.EMPTY, CharSequenceUtils.subSequence("012", 3));
    }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}

    @Test(expected=IndexOutOfBoundsException.class)
    public void testSubSequenceNegativeStart() {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nc80cln0a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,98,83,101,113,117,101,110,99,101,78,101,103,97,116,105,118,101,83,116,97,114,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequenceNegativeStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nc80cln0a(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29818);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29819);assertEquals(null, CharSequenceUtils.subSequence(StringUtils.EMPTY, -1));
    }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}

    @Test(expected=IndexOutOfBoundsException.class)
    public void testSubSequenceTooLong() {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv6cygn0c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,98,83,101,113,117,101,110,99,101,84,111,111,76,111,110,103,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testSubSequenceTooLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv6cygn0c(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29820);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29821);assertEquals(null, CharSequenceUtils.subSequence(StringUtils.EMPTY, 1));
    }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}

    static class TestData{
        final String source;
        final boolean ignoreCase;
        final int toffset;
        final String other;
        final int ooffset;
        final int len;
        final boolean expected;
        final Class<?> throwable;
        TestData(final String source, final boolean ignoreCase, final int toffset,
                final String other, final int ooffset, final int len, final boolean expected){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29822);
            __CLR4_5_2mzumzulvha7fhg.R.inc(29823);this.source = source;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29824);this.ignoreCase = ignoreCase;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29825);this.toffset = toffset;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29826);this.other = other;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29827);this.ooffset = ooffset;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29828);this.len = len;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29829);this.expected = expected;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29830);this.throwable = null;
        }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
        TestData(final String source, final boolean ignoreCase, final int toffset,
                final String other, final int ooffset, final int len, final Class<?> throwable){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29831);
            __CLR4_5_2mzumzulvha7fhg.R.inc(29832);this.source = source;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29833);this.ignoreCase = ignoreCase;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29834);this.toffset = toffset;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29835);this.other = other;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29836);this.ooffset = ooffset;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29837);this.len = len;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29838);this.expected = false;
            __CLR4_5_2mzumzulvha7fhg.R.inc(29839);this.throwable = throwable;
        }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
        @Override
        public String toString(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29840);
            __CLR4_5_2mzumzulvha7fhg.R.inc(29841);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2mzumzulvha7fhg.R.inc(29842);sb.append(source).append("[").append(toffset).append("]");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29843);sb.append((((ignoreCase)&&(__CLR4_5_2mzumzulvha7fhg.R.iget(29844)!=0|true))||(__CLR4_5_2mzumzulvha7fhg.R.iget(29845)==0&false))? " caseblind ":" samecase ");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29846);sb.append(other).append("[").append(ooffset).append("]");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29847);sb.append(" ").append(len).append(" => ");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29848);if ((((throwable != null)&&(__CLR4_5_2mzumzulvha7fhg.R.iget(29849)!=0|true))||(__CLR4_5_2mzumzulvha7fhg.R.iget(29850)==0&false))) {{
                __CLR4_5_2mzumzulvha7fhg.R.inc(29851);sb.append(throwable);
            } }else {{
                __CLR4_5_2mzumzulvha7fhg.R.inc(29852);sb.append(expected);
            }
            }__CLR4_5_2mzumzulvha7fhg.R.inc(29853);return sb.toString();
        }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
    }

    private static final TestData[] TEST_DATA = {
            //          Source  IgnoreCase Offset Other  Offset Length Result
            new TestData("",    true,      -1,    "",    -1,    -1,    false),
            new TestData("",    true,      0,     "",    0,     1,     false),
            new TestData("a",   true,      0,     "abc", 0,     0,     true),
            new TestData("a",   true,      0,     "abc", 0,     1,     true),
            new TestData("a",   true,      0,     null,  0,     0,     NullPointerException.class),
            new TestData(null,  true,      0,     null,  0,     0,     NullPointerException.class),
            new TestData(null,  true,      0,     "",    0,     0,     NullPointerException.class),
            new TestData("Abc", true,      0,     "abc", 0,     3,     true),
            new TestData("Abc", false,     0,     "abc", 0,     3,     false),
            new TestData("Abc", true,      1,     "abc", 1,     2,     true),
            new TestData("Abc", false,     1,     "abc", 1,     2,     true),
            new TestData("Abcd",true,      1,     "abcD",1,     2,     true),
            new TestData("Abcd",false,     1,     "abcD",1,     2,     true),
    };

    private static abstract class RunTest {
        
        abstract boolean invoke();
        
        void run(final TestData data, final String id) {try{__CLR4_5_2mzumzulvha7fhg.R.inc(29854);
            __CLR4_5_2mzumzulvha7fhg.R.inc(29855);if ((((data.throwable != null)&&(__CLR4_5_2mzumzulvha7fhg.R.iget(29856)!=0|true))||(__CLR4_5_2mzumzulvha7fhg.R.iget(29857)==0&false))) {{
                __CLR4_5_2mzumzulvha7fhg.R.inc(29858);try {
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29859);invoke();
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29860);fail(id + " Expected " + data.throwable);
                } catch (final Exception e) {
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29861);if ((((!e.getClass().equals(data.throwable))&&(__CLR4_5_2mzumzulvha7fhg.R.iget(29862)!=0|true))||(__CLR4_5_2mzumzulvha7fhg.R.iget(29863)==0&false))) {{
                        __CLR4_5_2mzumzulvha7fhg.R.inc(29864);fail(id + " Expected " + data.throwable + " got " + e.getClass());
                    }
                }}
            } }else {{
                __CLR4_5_2mzumzulvha7fhg.R.inc(29865);final boolean stringCheck = invoke();
                __CLR4_5_2mzumzulvha7fhg.R.inc(29866);assertEquals(id + " Failed test " + data, data.expected, stringCheck);
            }
        }}finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
        
    }

    @Test
    public void testRegionMatches() {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f17qr0n1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testRegionMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f17qr0n1n(){try{__CLR4_5_2mzumzulvha7fhg.R.inc(29867);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29868);for (final TestData data : TEST_DATA) {{
            __CLR4_5_2mzumzulvha7fhg.R.inc(29869);new RunTest() {
                @Override
                boolean invoke() {try{__CLR4_5_2mzumzulvha7fhg.R.inc(29870);
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29871);return data.source.regionMatches(data.ignoreCase, data.toffset, data.other, data.ooffset, data.len);                        
                }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
            }.run(data, "String");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29872);new RunTest() {
                @Override
                boolean invoke() {try{__CLR4_5_2mzumzulvha7fhg.R.inc(29873);
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29874);return CharSequenceUtils.regionMatches(data.source, data.ignoreCase, data.toffset, data.other, data.ooffset, data.len);                        
                }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
            }.run(data, "CSString");
            __CLR4_5_2mzumzulvha7fhg.R.inc(29875);new RunTest() {
                @Override
                boolean invoke() {try{__CLR4_5_2mzumzulvha7fhg.R.inc(29876);
                    __CLR4_5_2mzumzulvha7fhg.R.inc(29877);return CharSequenceUtils.regionMatches(new StringBuilder(data.source), data.ignoreCase, data.toffset, data.other, data.ooffset, data.len);             
                }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
            }.run(data, "CSNonString");
        }
    }}finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}
    
    
    @Test
    public void testToCharArray() throws Exception {__CLR4_5_2mzumzulvha7fhg.R.globalSliceStart(getClass().getName(),29878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b7st8jn1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mzumzulvha7fhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mzumzulvha7fhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSequenceUtilsTest.testToCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b7st8jn1y() throws Exception{try{__CLR4_5_2mzumzulvha7fhg.R.inc(29878);
        __CLR4_5_2mzumzulvha7fhg.R.inc(29879);final StringBuilder builder = new StringBuilder("abcdefg");
        __CLR4_5_2mzumzulvha7fhg.R.inc(29880);final char[] expected = builder.toString().toCharArray();
        __CLR4_5_2mzumzulvha7fhg.R.inc(29881);assertArrayEquals(expected, CharSequenceUtils.toCharArray(builder));
        __CLR4_5_2mzumzulvha7fhg.R.inc(29882);assertArrayEquals(expected, CharSequenceUtils.toCharArray(builder.toString()));
    }finally{__CLR4_5_2mzumzulvha7fhg.R.flushNeeded();}}

}
