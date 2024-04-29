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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit test for Tokenizer.
 */
@Deprecated
public class StrTokenizerTest {static class __CLR4_5_215u715u7lvha7ikz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,54789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String CSV_SIMPLE_FIXTURE = "A,b,c";

    private static final String TSV_SIMPLE_FIXTURE = "A\tb\tc";

    private void checkClone(final StrTokenizer tokenizer) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54223);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54224);assertFalse(StrTokenizer.getCSVInstance() == tokenizer);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54225);assertFalse(StrTokenizer.getTSVInstance() == tokenizer);
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu15ua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu15ua(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54226);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54227);final String input = "a;b;c;\"d;\"\"e\";f; ; ;  ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54228);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54229);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54230);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54231);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54232);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54233);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54234);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f", "", "", "",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54235);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54236);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54237)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54238)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54239);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b15uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b15uo(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54240);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54241);final String input = "a;b;c ;\"d;\"\"e\";f; ; ;";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54242);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54243);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54244);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54245);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54246);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54247);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54248);final String expected[] = new String[]{"a", "b", "c ", "d;\"e", "f", " ", " ", "",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54249);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54250);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54251)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54252)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54253);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test3() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs15v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs15v2(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54254);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54255);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54256);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54257);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54258);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54259);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54260);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54261);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54262);final String expected[] = new String[]{"a", "b", " c", "d;\"e", "f", " ", " ", "",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54263);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54264);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54265)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54266)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54267);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test4() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s915vg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s915vg(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54268);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54269);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54270);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54271);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54272);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54273);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54274);tok.setIgnoreEmptyTokens(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54275);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54276);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54277);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54278);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54279)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54280)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54281);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test5() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq15vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq15vu(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54282);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54283);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54284);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54285);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54286);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54287);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54288);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54289);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54290);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54291);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f", null, null, null,};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54292);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54293);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54294)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54295)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54296);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test6() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d715w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d715w9(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54297);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54298);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54299);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54300);tok.setDelimiterChar(';');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54301);tok.setQuoteChar('"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54302);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54303);tok.setIgnoreEmptyTokens(false);
        // tok.setTreatingEmptyAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54304);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54305);final String expected[] = new String[]{"a", "b", " c", "d;\"e", "f", null, null, null,};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54306);int nextCount = 0;
        __CLR4_5_215u715u7lvha7ikz.R.inc(54307);while ((((tok.hasNext())&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54308)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54309)==0&false))) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54310);tok.next();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54311);nextCount++;
        }

        }__CLR4_5_215u715u7lvha7ikz.R.inc(54312);int prevCount = 0;
        __CLR4_5_215u715u7lvha7ikz.R.inc(54313);while ((((tok.hasPrevious())&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54314)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54315)==0&false))) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54316);tok.previous();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54317);prevCount++;
        }

        }__CLR4_5_215u715u7lvha7ikz.R.inc(54318);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54319);assertTrue("could not cycle through entire token list" + " using the 'hasNext' and 'next' methods",
                nextCount == expected.length);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54320);assertTrue("could not cycle through entire token list" + " using the 'hasPrevious' and 'previous' methods",
                prevCount == expected.length);

    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test7() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nw645o15wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nw645o15wx(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54321);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54322);final String input = "a   b c \"d e\" f ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54323);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54324);tok.setDelimiterMatcher(StrMatcher.spaceMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54325);tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54326);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54327);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54328);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54329);final String expected[] = new String[]{"a", "", "", "b", "c", "d e", "f", "",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54330);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54331);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54332)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54333)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54334);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void test8() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r562y515xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r562y515xb(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54335);

        __CLR4_5_215u715u7lvha7ikz.R.inc(54336);final String input = "a   b c \"d e\" f ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54337);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54338);tok.setDelimiterMatcher(StrMatcher.spaceMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54339);tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54340);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54341);tok.setIgnoreEmptyTokens(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54342);final String tokens[] = tok.getTokenArray();

        __CLR4_5_215u715u7lvha7ikz.R.inc(54343);final String expected[] = new String[]{"a", "b", "c", "d e", "f",};

        __CLR4_5_215u715u7lvha7ikz.R.inc(54344);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54345);for (int i = 0; (((i < expected.length)&&(__CLR4_5_215u715u7lvha7ikz.R.iget(54346)!=0|true))||(__CLR4_5_215u715u7lvha7ikz.R.iget(54347)==0&false)); i++) {{
            __CLR4_5_215u715u7lvha7ikz.R.inc(54348);assertEquals("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    expected[i], tokens[i]);
        }

    }}finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasic1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rlm9us15xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rlm9us15xp(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54349);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54350);final String input = "a  b c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54351);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54352);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54353);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54354);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54355);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasic2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ocmb2b15xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54356,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ocmb2b15xw(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54356);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54357);final String input = "a \nb\fc";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54358);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54359);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54360);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54361);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54362);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasic3() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l3mc9u15y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l3mc9u15y3(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54363);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54364);final String input = "a \nb\u0001\fc";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54365);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54366);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54367);assertEquals("b\u0001", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54368);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54369);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasic4() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2humdhd15ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2humdhd15ya(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54370);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54371);final String input = "a \"b\" c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54372);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54373);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54374);assertEquals("\"b\"", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54375);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54376);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasic5() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2elmeow15yh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2elmeow15yh(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54377);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54378);final String input = "a:b':c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54379);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54380);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54381);assertEquals("b'", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54382);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54383);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicDelim1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tauj2d15yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicDelim1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tauj2d15yo(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54384);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54385);final String input = "a:b:c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54386);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54387);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54388);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54389);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54390);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicDelim2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wjuhuu15yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicDelim2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wjuhuu15yv(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54391);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54392);final String input = "a:b:c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54393);final StrTokenizer tok = new StrTokenizer(input, ',');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54394);assertEquals("a:b:c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54395);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicEmpty1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22dr13t15z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicEmpty1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22dr13t15z0(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54396);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54397);final String input = "a  b c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54398);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54399);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54400);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54401);assertEquals("", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54402);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54403);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54404);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicEmpty2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8xoo15z9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicEmpty2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8xoo15z9(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54405);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54406);final String input = "a  b c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54407);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54408);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54409);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54410);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54411);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54412);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54413);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54414);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23371m415zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23371m415zj(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54415);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54416);final String input = "a 'b' c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54417);final StrTokenizer tok = new StrTokenizer(input, ' ', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54418);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54419);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54420);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54421);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25sx6d15zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25sx6d15zq(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54422);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54423);final String input = "a:'b':";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54424);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54425);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54426);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54427);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54428);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54429);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54430);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted3() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23esvyu15zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23esvyu15zz(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54431);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54432);final String input = "a:'b''c'";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54433);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54434);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54435);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54436);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54437);assertEquals("b'c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54438);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted4() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26nsurb1607();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26nsurb1607(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54439);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54440);final String input = "a: 'b' 'c' :d";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54441);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54442);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54443);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54444);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54445);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54446);assertEquals("b c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54447);assertEquals("d", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54448);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted5() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wstjs160h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wstjs160h(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54449);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54450);final String input = "a: 'b'x'c' :d";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54451);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54452);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54453);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54454);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54455);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54456);assertEquals("bxc", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54457);assertEquals("d", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54458);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted6() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d5ssc9160r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d5ssc9160r(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54459);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54460);final String input = "a:'b'\"c':d";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54461);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54462);tok.setQuoteMatcher(StrMatcher.quoteMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54463);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54464);assertEquals("b\"c:d", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54465);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuoted7() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gesr4q160y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gesr4q160y(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54466);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54467);final String input = "a:\"There's a reason here\":b";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54468);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54469);tok.setQuoteMatcher(StrMatcher.quoteMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54470);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54471);assertEquals("There's a reason here", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54472);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54473);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicQuotedTrimmed1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acxmj61616();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuotedTrimmed1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acxmj61616(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54474);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54475);final String input = "a: 'b' :";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54476);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54477);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54478);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54479);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54480);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54481);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54482);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54483);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicTrimmed1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_231qn62161g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicTrimmed1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_231qn62161g(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54484);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54485);final String input = "a: b :  ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54486);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54487);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54488);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54489);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54490);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54491);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54492);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54493);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicTrimmed2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26aqlyj161q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicTrimmed2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26aqlyj161q(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54494);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54495);final String input = "a:  b  :";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54496);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54497);tok.setTrimmerMatcher(StrMatcher.stringMatcher("  "));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54498);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54499);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54500);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54501);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54502);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54503);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed1() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cytnr01620();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cytnr01620(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54504);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54505);final String input = "a: bIGNOREc : ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54506);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54507);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54508);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54509);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54510);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54511);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54512);assertEquals("bc", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54513);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54514);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed2() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g7tmjh162b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g7tmjh162b(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54515);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54516);final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54517);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54518);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54519);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54520);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54521);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54522);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54523);assertEquals("bc", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54524);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54525);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed3() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgtlby162m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgtlby162m(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54526);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54527);final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54528);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54529);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54530);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54531);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54532);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54533);assertEquals("  bc  ", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54534);assertEquals("  ", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54535);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed4() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mptk4f162w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mptk4f162w(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54536);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54537);final String input = "IGNOREaIGNORE: IGNORE 'bIGNOREc'IGNORE'd' IGNORE : IGNORE ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54538);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54539);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54540);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54541);tok.setIgnoreEmptyTokens(false);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54542);tok.setEmptyTokenAsNull(true);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54543);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54544);assertEquals("bIGNOREcd", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54545);assertEquals(null, tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54546);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testListArray() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nz0nw01637();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testListArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nz0nw01637(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54547);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54548);final String input = "a  b c";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54549);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54550);final String[] array = tok.getTokenArray();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54551);final List<?> list = tok.getTokenList();
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54552);assertEquals(Arrays.asList(array), list);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54553);assertEquals(3, list.size());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void testCSV(final String data) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54554);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54555);this.testXSVAbc(StrTokenizer.getCSVInstance(data));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54556);this.testXSVAbc(StrTokenizer.getCSVInstance(data.toCharArray()));
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testCSVEmpty() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xqvfsw163h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xqvfsw163h(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54557);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54558);this.testEmpty(StrTokenizer.getCSVInstance());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54559);this.testEmpty(StrTokenizer.getCSVInstance(""));
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testCSVSimple() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hdwm8j163k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hdwm8j163k(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54560);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54561);this.testCSV(CSV_SIMPLE_FIXTURE);
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testCSVSimpleNeedsTrim() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24t3jcw163m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVSimpleNeedsTrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24t3jcw163m(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54562);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54563);this.testCSV("   " + CSV_SIMPLE_FIXTURE);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54564);this.testCSV("   \n\t  " + CSV_SIMPLE_FIXTURE);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54565);this.testCSV("   \n  " + CSV_SIMPLE_FIXTURE + "\n\n\r");
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    void testEmpty(final StrTokenizer tokenizer) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54566);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54567);this.checkClone(tokenizer);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54568);assertFalse(tokenizer.hasNext());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54569);assertFalse(tokenizer.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54570);assertEquals(null, tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54571);assertEquals(0, tokenizer.size());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54572);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54573);tokenizer.next();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54574);fail();
        } catch (final NoSuchElementException ex) {}
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testGetContent() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26pculg163z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testGetContent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26pculg163z(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54575);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54576);final String input = "a   b c \"d e\" f ";
        __CLR4_5_215u715u7lvha7ikz.R.inc(54577);StrTokenizer tok = new StrTokenizer(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54578);assertEquals(input, tok.getContent());

        __CLR4_5_215u715u7lvha7ikz.R.inc(54579);tok = new StrTokenizer(input.toCharArray());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54580);assertEquals(input, tok.getContent());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54581);tok = new StrTokenizer();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54582);assertEquals(null, tok.getContent());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testChaining() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ks9sm21647();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testChaining",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ks9sm21647(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54583);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54584);final StrTokenizer tok = new StrTokenizer();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54585);assertEquals(tok, tok.reset());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54586);assertEquals(tok, tok.reset(""));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54587);assertEquals(tok, tok.reset(new char[0]));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54588);assertEquals(tok, tok.setDelimiterChar(' '));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54589);assertEquals(tok, tok.setDelimiterString(" "));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54590);assertEquals(tok, tok.setDelimiterMatcher(null));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54591);assertEquals(tok, tok.setQuoteChar(' '));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54592);assertEquals(tok, tok.setQuoteMatcher(null));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54593);assertEquals(tok, tok.setIgnoredChar(' '));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54594);assertEquals(tok, tok.setIgnoredMatcher(null));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54595);assertEquals(tok, tok.setTrimmerMatcher(null));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54596);assertEquals(tok, tok.setEmptyTokenAsNull(false));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54597);assertEquals(tok, tok.setIgnoreEmptyTokens(false));
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    /**
     * Tests that the {@link StrTokenizer#clone()} clone method catches {@link CloneNotSupportedException} and returns
     * <code>null</code>.
     */
    @Test
    public void testCloneNotSupportedException() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29o7lao164m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneNotSupportedException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29o7lao164m(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54598);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54599);final Object notCloned = new StrTokenizer() {
            @Override
            Object cloneReset() throws CloneNotSupportedException {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54600);
                __CLR4_5_215u715u7lvha7ikz.R.inc(54601);throw new CloneNotSupportedException("test");
            }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}
        }.clone();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54602);assertNull(notCloned);
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testCloneNull() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_239os87164r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_239os87164r(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54603);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54604);final StrTokenizer tokenizer = new StrTokenizer((char[]) null);
        // Start sanity check
        __CLR4_5_215u715u7lvha7ikz.R.inc(54605);assertEquals(null, tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54606);tokenizer.reset();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54607);assertEquals(null, tokenizer.nextToken());
        // End sanity check
        __CLR4_5_215u715u7lvha7ikz.R.inc(54608);final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54609);tokenizer.reset();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54610);assertEquals(null, tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54611);assertEquals(null, clonedTokenizer.nextToken());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testCloneReset() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uubunf1650();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneReset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uubunf1650(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54612);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54613);final char[] input = new char[]{'a'};
        __CLR4_5_215u715u7lvha7ikz.R.inc(54614);final StrTokenizer tokenizer = new StrTokenizer(input);
        // Start sanity check
        __CLR4_5_215u715u7lvha7ikz.R.inc(54615);assertEquals("a", tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54616);tokenizer.reset(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54617);assertEquals("a", tokenizer.nextToken());
        // End sanity check
        __CLR4_5_215u715u7lvha7ikz.R.inc(54618);final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54619);input[0] = 'b';
        __CLR4_5_215u715u7lvha7ikz.R.inc(54620);tokenizer.reset(input);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54621);assertEquals("b", tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54622);assertEquals("a", clonedTokenizer.nextToken());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}
  
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_String() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245xchd165b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245xchd165b(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54623);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54624);StrTokenizer tok = new StrTokenizer("a b");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54625);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54626);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54627);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54628);tok = new StrTokenizer("");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54629);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54630);tok = new StrTokenizer((String) null);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54631);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_char() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2188rxo165k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2188rxo165k(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54632);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54633);StrTokenizer tok = new StrTokenizer("a b", ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54634);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54635);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54636);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54637);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54638);tok = new StrTokenizer("", ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54639);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54640);tok = new StrTokenizer((String) null, ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54641);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_char_char() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c4x7bl165u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c4x7bl165u(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54642);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54643);StrTokenizer tok = new StrTokenizer("a b", ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54644);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54645);assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54646);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54647);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54648);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54649);tok = new StrTokenizer("", ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54650);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54651);tok = new StrTokenizer((String) null, ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54652);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k0rg1f1665();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k0rg1f1665(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54653);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54654);StrTokenizer tok = new StrTokenizer("a b".toCharArray());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54655);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54656);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54657);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54658);tok = new StrTokenizer(new char[0]);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54659);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54660);tok = new StrTokenizer((char[]) null);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54661);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray_char() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nu859s166e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nu859s166e(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54662);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54663);StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54664);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54665);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54666);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54667);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54668);tok = new StrTokenizer(new char[0], ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54669);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54670);tok = new StrTokenizer((char[]) null, ' ');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54671);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray_char_char() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aql3pv166o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aql3pv166o(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54672);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54673);StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54674);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54675);assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54676);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54677);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54678);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54679);tok = new StrTokenizer(new char[0], ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54680);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54681);tok = new StrTokenizer((char[]) null, ' ', '"');
        __CLR4_5_215u715u7lvha7ikz.R.inc(54682);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jq2kc166z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jq2kc166z(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54683);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54684);final StrTokenizer tok = new StrTokenizer("a b c");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54685);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54686);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54687);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54688);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54689);tok.reset();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54690);assertEquals("a", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54691);assertEquals("b", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54692);assertEquals("c", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54693);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset_String() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap8c3q167a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap8c3q167a(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54694);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54695);final StrTokenizer tok = new StrTokenizer("x x x");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54696);tok.reset("d e");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54697);assertEquals("d", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54698);assertEquals("e", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54699);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54700);tok.reset((String) null);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54701);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset_charArray() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25wln2w167i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset_charArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25wln2w167i(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54702);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54703);final StrTokenizer tok = new StrTokenizer("x x x");
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54704);final char[] array = new char[] {'a', 'b', 'c'};
        __CLR4_5_215u715u7lvha7ikz.R.inc(54705);tok.reset(array);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54706);assertEquals("abc", tok.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54707);assertFalse(tok.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54708);tok.reset((char[]) null);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54709);assertFalse(tok.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTSV() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28t1n64167q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTSV",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28t1n64167q(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54710);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54711);this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE));
        __CLR4_5_215u715u7lvha7ikz.R.inc(54712);this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE.toCharArray()));
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testTSVEmpty() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28f3m3z167t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTSVEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28f3m3z167t(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54713);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54714);this.testEmpty(StrTokenizer.getTSVInstance());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54715);this.testEmpty(StrTokenizer.getTSVInstance(""));
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    void testXSVAbc(final StrTokenizer tokenizer) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54716);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54717);this.checkClone(tokenizer);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54718);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54719);assertEquals(0, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54720);assertEquals(null, tokenizer.previousToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54721);assertEquals("A", tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54722);assertEquals(1, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54723);assertEquals("b", tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54724);assertEquals(2, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54725);assertEquals("c", tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54726);assertEquals(3, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54727);assertEquals(null, tokenizer.nextToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54728);assertEquals(3, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54729);assertEquals("c", tokenizer.previousToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54730);assertEquals(2, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54731);assertEquals("b", tokenizer.previousToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54732);assertEquals(1, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54733);assertEquals("A", tokenizer.previousToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54734);assertEquals(0, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54735);assertEquals(null, tokenizer.previousToken());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54736);assertEquals(0, tokenizer.nextIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54737);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54738);assertEquals(3, tokenizer.size());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    @Test
    public void testIteration() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ob0pe168j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testIteration",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ob0pe168j(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54739);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54740);final StrTokenizer tkn = new StrTokenizer("a b c");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54741);assertFalse(tkn.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54742);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54743);tkn.previous();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54744);fail();
        } catch (final NoSuchElementException ex) {}
        __CLR4_5_215u715u7lvha7ikz.R.inc(54745);assertTrue(tkn.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54746);assertEquals("a", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54747);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54748);tkn.remove();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54749);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_5_215u715u7lvha7ikz.R.inc(54750);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54751);tkn.set("x");
            __CLR4_5_215u715u7lvha7ikz.R.inc(54752);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_5_215u715u7lvha7ikz.R.inc(54753);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54754);tkn.add("y");
            __CLR4_5_215u715u7lvha7ikz.R.inc(54755);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_5_215u715u7lvha7ikz.R.inc(54756);assertTrue(tkn.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54757);assertTrue(tkn.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54758);assertEquals("b", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54759);assertTrue(tkn.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54760);assertTrue(tkn.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54761);assertEquals("c", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54762);assertTrue(tkn.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54763);assertFalse(tkn.hasNext());
        
        __CLR4_5_215u715u7lvha7ikz.R.inc(54764);try {
            __CLR4_5_215u715u7lvha7ikz.R.inc(54765);tkn.next();
            __CLR4_5_215u715u7lvha7ikz.R.inc(54766);fail();
        } catch (final NoSuchElementException ex) {}
        __CLR4_5_215u715u7lvha7ikz.R.inc(54767);assertTrue(tkn.hasPrevious());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54768);assertFalse(tkn.hasNext());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTokenizeSubclassInputChange() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fk0bwk169d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTokenizeSubclassInputChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fk0bwk169d(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54769);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54770);final StrTokenizer tkn = new StrTokenizer("a b c d e") {
            @Override
            protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54771);
                __CLR4_5_215u715u7lvha7ikz.R.inc(54772);return super.tokenize("w x y z".toCharArray(), 2, 5);
            }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}
        };
        __CLR4_5_215u715u7lvha7ikz.R.inc(54773);assertEquals("x", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54774);assertEquals("y", tkn.next());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTokenizeSubclassOutputChange() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2edwzct169j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTokenizeSubclassOutputChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2edwzct169j(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54775);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54776);final StrTokenizer tkn = new StrTokenizer("a b c") {
            @Override
            protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_5_215u715u7lvha7ikz.R.inc(54777);
                __CLR4_5_215u715u7lvha7ikz.R.inc(54778);final List<String> list = super.tokenize(chars, offset, count);
                __CLR4_5_215u715u7lvha7ikz.R.inc(54779);Collections.reverse(list);
                __CLR4_5_215u715u7lvha7ikz.R.inc(54780);return list;
            }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}
        };
        __CLR4_5_215u715u7lvha7ikz.R.inc(54781);assertEquals("c", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54782);assertEquals("b", tkn.next());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54783);assertEquals("a", tkn.next());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_5_215u715u7lvha7ikz.R.globalSliceStart(getClass().getName(),54784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid169s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215u715u7lvha7ikz.R.rethrow($CLV_t2$);}finally{__CLR4_5_215u715u7lvha7ikz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid169s(){try{__CLR4_5_215u715u7lvha7ikz.R.inc(54784);
        __CLR4_5_215u715u7lvha7ikz.R.inc(54785);final StrTokenizer tkn = new StrTokenizer("a b c d e");
        __CLR4_5_215u715u7lvha7ikz.R.inc(54786);assertEquals("StrTokenizer[not tokenized yet]", tkn.toString());
        __CLR4_5_215u715u7lvha7ikz.R.inc(54787);tkn.next();
        __CLR4_5_215u715u7lvha7ikz.R.inc(54788);assertEquals("StrTokenizer[a, b, c, d, e]", tkn.toString());
    }finally{__CLR4_5_215u715u7lvha7ikz.R.flushNeeded();}}

}
