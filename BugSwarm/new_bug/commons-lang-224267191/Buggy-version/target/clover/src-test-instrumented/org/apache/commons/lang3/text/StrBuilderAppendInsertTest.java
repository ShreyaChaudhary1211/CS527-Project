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
import static org.junit.Assert.fail;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 */
@Deprecated
public class StrBuilderAppendInsertTest {static class __CLR4_5_213q313q3lvha7ie7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,52380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The system line separator. */
    private static final String SEP = System.lineSeparator();

    /** Test subclass of Object, with a toString method. */
    private static final Object FOO = new Object() {
        @Override
        public String toString() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51483);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51484);return "foo";
        }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
    };

    //-----------------------------------------------------------------------
    @Test
    public void testAppendNewLine() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gzphpt13q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendNewLine",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gzphpt13q5(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51485);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51486);StrBuilder sb = new StrBuilder("---");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51487);sb.appendNewLine().append("+++");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51488);assertEquals("---" + SEP + "+++", sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(51489);sb = new StrBuilder("---");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51490);sb.setNewLineText("#").appendNewLine().setNewLineText(null).appendNewLine();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51491);assertEquals("---#" + SEP, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithNullText() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ih84ib13qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithNullText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51492,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ih84ib13qc(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51492);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51493);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51494);sb.setNullText("NULL");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51495);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51496);sb.appendNull();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51497);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51498);sb.append((Object) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51499);assertEquals("NULLNULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51500);sb.append(FOO);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51501);assertEquals("NULLNULLfoo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51502);sb.append((String) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51503);assertEquals("NULLNULLfooNULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51504);sb.append("");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51505);assertEquals("NULLNULLfooNULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51506);sb.append("bar");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51507);assertEquals("NULLNULLfooNULLbar", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51508);sb.append((StringBuffer) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51509);assertEquals("NULLNULLfooNULLbarNULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51510);sb.append(new StringBuffer("baz"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51511);assertEquals("NULLNULLfooNULLbarNULLbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_Object() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k9usvt13qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k9usvt13qw(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51512);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51513);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51514);sb.appendNull();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51515);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51516);sb.append((Object) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51517);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51518);sb.append(FOO);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51519);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51520);sb.append((StringBuffer) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51521);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51522);sb.append(new StringBuffer("baz"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51523);assertEquals("foobaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51524);sb.append(new StrBuilder("yes"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51525);assertEquals("foobazyes", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51526);sb.append((CharSequence) "Seq");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51527);assertEquals("foobazyesSeq", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51528);sb.append(new StringBuilder("bld")); // Check it supports StringBuilder
        __CLR4_5_213q313q3lvha7ie7.R.inc(51529);assertEquals("foobazyesSeqbld", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuilder() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvq78i13re();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvq78i13re(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51530);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51531);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51532);sb.setNullText("NULL").append((String) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51533);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51534);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51535);sb.append(new StringBuilder("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51536);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51537);sb.append(new StringBuilder(""));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51538);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51539);sb.append(new StringBuilder("bar"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51540);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_String() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utissr13rp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utissr13rp(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51541);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51542);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51543);sb.setNullText("NULL").append((String) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51544);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51545);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51546);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51547);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51548);sb.append("");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51549);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51550);sb.append("bar");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51551);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_String_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvwd6313s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_String_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvwd6313s0(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51552);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51553);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51554);sb.setNullText("NULL").append((String) null, 0, 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51555);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51556);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51557);sb.append("foo", 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51558);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51559);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51560);sb.append("bar", -1, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51561);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51562);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51563);sb.append("bar", 3, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51564);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51565);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51566);sb.append("bar", 1, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51567);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51568);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51569);sb.append("bar", 1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51570);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51571);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51572);sb.append("bar", -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51573);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51574);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51575);sb.append("bar", 4, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51576);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51577);sb.append("bar", 3, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51578);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51579);sb.append("abcbardef", 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51580);assertEquals("foobar", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51581);sb.append( (CharSequence)"abcbardef", 4, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51582);assertEquals("foobarard", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuilder_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fuyshu13sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuilder_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fuyshu13sv(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51583);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51584);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51585);sb.setNullText("NULL").append((String) null, 0, 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51586);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51587);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51588);sb.append(new StringBuilder("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51589);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51590);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51591);sb.append(new StringBuilder("bar"), -1, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51592);fail("append(StringBuilder, -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51593);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51594);sb.append(new StringBuilder("bar"), 3, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51595);fail("append(StringBuilder, 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51596);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51597);sb.append(new StringBuilder("bar"), 1, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51598);fail("append(StringBuilder,, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51599);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51600);sb.append(new StringBuilder("bar"), 1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51601);fail("append(StringBuilder, 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51602);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51603);sb.append(new StringBuilder("bar"), -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51604);fail("append(StringBuilder, -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51605);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51606);sb.append(new StringBuilder("bar"), 4, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51607);fail("append(StringBuilder, 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51608);sb.append(new StringBuilder("bar"), 3, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51609);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51610);sb.append(new StringBuilder("abcbardef"), 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51611);assertEquals("foobar", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51612);sb.append( new StringBuilder("abcbardef"), 4, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51613);assertEquals("foobarard", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuffer() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aox57v13tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aox57v13tq(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51614);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51615);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51616);sb.setNullText("NULL").append((StringBuffer) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51617);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51618);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51619);sb.append(new StringBuffer("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51620);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51621);sb.append(new StringBuffer(""));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51622);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51623);sb.append(new StringBuffer("bar"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51624);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuffer_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r3e58513u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuffer_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r3e58513u1(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51625);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51626);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51627);sb.setNullText("NULL").append((StringBuffer) null, 0, 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51628);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51629);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51630);sb.append(new StringBuffer("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51631);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51632);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51633);sb.append(new StringBuffer("bar"), -1, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51634);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51635);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51636);sb.append(new StringBuffer("bar"), 3, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51637);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51638);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51639);sb.append(new StringBuffer("bar"), 1, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51640);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51641);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51642);sb.append(new StringBuffer("bar"), 1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51643);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51644);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51645);sb.append(new StringBuffer("bar"), -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51646);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51647);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51648);sb.append(new StringBuffer("bar"), 4, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51649);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51650);sb.append(new StringBuffer("bar"), 3, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51651);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51652);sb.append(new StringBuffer("abcbardef"), 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51653);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StrBuilder() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gvs5hg13uu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StrBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gvs5hg13uu(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51654);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51655);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51656);sb.setNullText("NULL").append((StrBuilder) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51657);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51658);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51659);sb.append(new StrBuilder("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51660);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51661);sb.append(new StrBuilder(""));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51662);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51663);sb.append(new StrBuilder("bar"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51664);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StrBuilder_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgdpzw13v5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StrBuilder_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgdpzw13v5(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51665);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51666);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51667);sb.setNullText("NULL").append((StrBuilder) null, 0, 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51668);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51669);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51670);sb.append(new StrBuilder("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51671);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51672);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51673);sb.append(new StrBuilder("bar"), -1, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51674);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51675);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51676);sb.append(new StrBuilder("bar"), 3, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51677);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51678);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51679);sb.append(new StrBuilder("bar"), 1, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51680);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51681);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51682);sb.append(new StrBuilder("bar"), 1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51683);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51684);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51685);sb.append(new StrBuilder("bar"), -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51686);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51687);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51688);sb.append(new StrBuilder("bar"), 4, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51689);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51690);sb.append(new StrBuilder("bar"), 3, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51691);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51692);sb.append(new StrBuilder("abcbardef"), 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51693);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_CharArray() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iaia2113vy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_CharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iaia2113vy(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51694);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51695);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51696);sb.setNullText("NULL").append((char[]) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51697);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51698);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51699);sb.append(new char[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51700);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51701);sb.append(new char[]{'f', 'o', 'o'});
        __CLR4_5_213q313q3lvha7ie7.R.inc(51702);assertEquals("foo", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_CharArray_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jiosmv13w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_CharArray_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jiosmv13w7(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51703);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51704);StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51705);sb.setNullText("NULL").append((char[]) null, 0, 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51706);assertEquals("NULL", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51707);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51708);sb.append(new char[]{'f', 'o', 'o'}, 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51709);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51710);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51711);sb.append(new char[]{'b', 'a', 'r'}, -1, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51712);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51713);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51714);sb.append(new char[]{'b', 'a', 'r'}, 3, 1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51715);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51716);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51717);sb.append(new char[]{'b', 'a', 'r'}, 1, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51718);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51719);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51720);sb.append(new char[]{'b', 'a', 'r'}, 1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51721);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51722);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51723);sb.append(new char[]{'b', 'a', 'r'}, -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51724);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51725);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(51726);sb.append(new char[]{'b', 'a', 'r'}, 4, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(51727);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(51728);sb.append(new char[]{'b', 'a', 'r'}, 3, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51729);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51730);sb.append(new char[]{'a', 'b', 'c', 'b', 'a', 'r', 'd', 'e', 'f'}, 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51731);assertEquals("foobar", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_Boolean() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aa2v2413x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aa2v2413x0(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51732);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51733);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51734);sb.append(true);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51735);assertEquals("true", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51736);sb.append(false);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51737);assertEquals("truefalse", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51738);sb.append('!');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51739);assertEquals("truefalse!", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_PrimitiveNumber() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cmmr3813x8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_PrimitiveNumber",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cmmr3813x8(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51740);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51741);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51742);sb.append(0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51743);assertEquals("0", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51744);sb.append(1L);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51745);assertEquals("01", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51746);sb.append(2.3f);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51747);assertEquals("012.3", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51748);sb.append(4.5d);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51749);assertEquals("012.34.5", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_FormattedString() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l8eqeb13xi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_FormattedString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l8eqeb13xi(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51750);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51751);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51752);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final String str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51753);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51754);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51755);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51756);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51757);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51758);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51759);sb.appendln("Hello %s", "Alice");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51760);assertEquals("Hello Alice" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51761);assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        __CLR4_5_213q313q3lvha7ie7.R.inc(51762);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_Object() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22h494n13xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22h494n13xv(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51763);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51764);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51765);sb.appendln((Object) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51766);assertEquals("" + SEP, sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51767);sb.appendln(FOO);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51768);assertEquals(SEP + "foo" + SEP, sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51769);sb.appendln(Integer.valueOf(6));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51770);assertEquals(SEP + "foo" + SEP + "6" + SEP, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_String() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0s91l13y3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0s91l13y3(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51771);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51772);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51773);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final String str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51774);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51775);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51776);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51777);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51778);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51779);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51780);sb.appendln("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51781);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51782);assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        __CLR4_5_213q313q3lvha7ie7.R.inc(51783);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_String_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oe8bah13yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_String_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oe8bah13yg(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51784);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51785);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51786);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final String str, final int startIndex, final int length) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51787);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51788);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51789);return super.append(str, startIndex, length);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51790);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51791);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51792);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51793);sb.appendln("foo", 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51794);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51795);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51796);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuffer() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if2pg713yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if2pg713yt(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51797);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51798);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51799);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StringBuffer str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51800);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51801);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51802);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51803);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51804);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51805);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51806);sb.appendln(new StringBuffer("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51807);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51808);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51809);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuilder() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ax4w9s13z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ax4w9s13z6(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51810);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51811);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51812);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StringBuilder str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51813);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51814);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51815);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51816);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51817);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51818);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51819);sb.appendln(new StringBuilder("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51820);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51821);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51822);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuffer_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zw1rr13zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuffer_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zw1rr13zj(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51823);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51824);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51825);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51826);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51827);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51828);return super.append(str, startIndex, length);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51829);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51830);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51831);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51832);sb.appendln(new StringBuffer("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51833);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51834);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51835);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuilder_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuhmv413zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuilder_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuhmv413zw(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51836);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51837);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51838);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51839);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51840);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51841);return super.append(str, startIndex, length);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51842);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51843);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51844);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51845);sb.appendln(new StringBuilder("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51846);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51847);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51848);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StrBuilder() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23p19ku1409();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StrBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23p19ku1409(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51849);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51850);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51851);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StrBuilder str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51852);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51853);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51854);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51855);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51856);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51857);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51858);sb.appendln(new StrBuilder("foo"));
        __CLR4_5_213q313q3lvha7ie7.R.inc(51859);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51860);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51861);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StrBuilder_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h0htia140m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StrBuilder_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h0htia140m(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51862);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51863);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51864);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51865);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51866);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51867);return super.append(str, startIndex, length);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51868);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51869);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51870);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51871);sb.appendln(new StrBuilder("foo"), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51872);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51873);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51874);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_CharArray() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mi6jr140z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_CharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mi6jr140z(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51875);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51876);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51877);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final char[] str) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51878);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51879);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51880);return super.append(str);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51881);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51882);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51883);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51884);sb.appendln("foo".toCharArray());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51885);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51886);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51887);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_CharArray_int_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24kn8lj141c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_CharArray_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24kn8lj141c(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51888);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51889);final int[] count = new int[2];
        __CLR4_5_213q313q3lvha7ie7.R.inc(51890);final StrBuilder sb = new StrBuilder() {
            private static final long serialVersionUID = 1L;

            @Override
            public StrBuilder append(final char[] str, final int startIndex, final int length) {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51891);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51892);count[0]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51893);return super.append(str, startIndex, length);
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_5_213q313q3lvha7ie7.R.inc(51894);
                __CLR4_5_213q313q3lvha7ie7.R.inc(51895);count[1]++;
                __CLR4_5_213q313q3lvha7ie7.R.inc(51896);return super.appendNewLine();
            }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
        };
        __CLR4_5_213q313q3lvha7ie7.R.inc(51897);sb.appendln("foo".toCharArray(), 0, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51898);assertEquals("foo" + SEP, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(51899);assertEquals(1, count[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51900);assertEquals(1, count[1]);
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_Boolean() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qs4agu141p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qs4agu141p(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51901);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51902);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51903);sb.appendln(true);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51904);assertEquals("true" + SEP, sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(51905);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51906);sb.appendln(false);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51907);assertEquals("false" + SEP, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_PrimitiveNumber() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gqn50a141w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_PrimitiveNumber",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gqn50a141w(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51908);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51909);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51910);sb.appendln(0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51911);assertEquals("0" + SEP, sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(51912);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51913);sb.appendln(1L);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51914);assertEquals("1" + SEP, sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(51915);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51916);sb.appendln(2.3f);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51917);assertEquals("2.3" + SEP, sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(51918);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51919);sb.appendln(4.5d);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51920);assertEquals("4.5" + SEP, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendPadding() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27b6h4k1429();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendPadding",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27b6h4k1429(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51921);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51922);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51923);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51924);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51925);sb.appendPadding(-1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51926);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51927);sb.appendPadding(0, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51928);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51929);sb.appendPadding(1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51930);assertEquals("foo-", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51931);sb.appendPadding(16, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51932);assertEquals(20, sb.length());
        //            12345678901234567890
        __CLR4_5_213q313q3lvha7ie7.R.inc(51933);assertEquals("foo-----------------", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadLeft() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yx3zzx142m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadLeft",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yx3zzx142m(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51934);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51935);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51936);sb.appendFixedWidthPadLeft("foo", -1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51937);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51938);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51939);sb.appendFixedWidthPadLeft("foo", 0, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51940);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51941);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51942);sb.appendFixedWidthPadLeft("foo", 1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51943);assertEquals("o", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51944);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51945);sb.appendFixedWidthPadLeft("foo", 2, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51946);assertEquals("oo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51947);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51948);sb.appendFixedWidthPadLeft("foo", 3, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51949);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51950);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51951);sb.appendFixedWidthPadLeft("foo", 4, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51952);assertEquals("-foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51953);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51954);sb.appendFixedWidthPadLeft("foo", 10, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51955);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_5_213q313q3lvha7ie7.R.inc(51956);assertEquals("-------foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51957);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51958);sb.setNullText("null");
        __CLR4_5_213q313q3lvha7ie7.R.inc(51959);sb.appendFixedWidthPadLeft(null, 5, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51960);assertEquals("-null", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadLeft_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vybpp143d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadLeft_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vybpp143d(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51961);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51962);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51963);sb.appendFixedWidthPadLeft(123, -1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51964);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51965);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51966);sb.appendFixedWidthPadLeft(123, 0, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51967);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51968);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51969);sb.appendFixedWidthPadLeft(123, 1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51970);assertEquals("3", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51971);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51972);sb.appendFixedWidthPadLeft(123, 2, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51973);assertEquals("23", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51974);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51975);sb.appendFixedWidthPadLeft(123, 3, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51976);assertEquals("123", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51977);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51978);sb.appendFixedWidthPadLeft(123, 4, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51979);assertEquals("-123", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51980);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51981);sb.appendFixedWidthPadLeft(123, 10, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51982);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_5_213q313q3lvha7ie7.R.inc(51983);assertEquals("-------123", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadRight() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),51984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m3b75a1440();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadRight",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m3b75a1440(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(51984);
        __CLR4_5_213q313q3lvha7ie7.R.inc(51985);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51986);sb.appendFixedWidthPadRight("foo", -1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51987);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51988);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51989);sb.appendFixedWidthPadRight("foo", 0, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51990);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51991);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51992);sb.appendFixedWidthPadRight("foo", 1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51993);assertEquals("f", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51994);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51995);sb.appendFixedWidthPadRight("foo", 2, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51996);assertEquals("fo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(51997);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(51998);sb.appendFixedWidthPadRight("foo", 3, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(51999);assertEquals("foo", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52000);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52001);sb.appendFixedWidthPadRight("foo", 4, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52002);assertEquals("foo-", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52003);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52004);sb.appendFixedWidthPadRight("foo", 10, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52005);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_5_213q313q3lvha7ie7.R.inc(52006);assertEquals("foo-------", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52007);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52008);sb.setNullText("null");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52009);sb.appendFixedWidthPadRight(null, 5, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52010);assertEquals("null-", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    // See: http://issues.apache.org/jira/browse/LANG-299
    @Test
    public void testLang299() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bdtfzt144r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testLang299",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bdtfzt144r(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52011);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52012);final StrBuilder sb = new StrBuilder(1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52013);sb.appendFixedWidthPadRight("foo", 1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52014);assertEquals("f", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadRight_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_290rony144v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadRight_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_290rony144v(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52015);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52016);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52017);sb.appendFixedWidthPadRight(123, -1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52018);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52019);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52020);sb.appendFixedWidthPadRight(123, 0, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52021);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52022);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52023);sb.appendFixedWidthPadRight(123, 1, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52024);assertEquals("1", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52025);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52026);sb.appendFixedWidthPadRight(123, 2, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52027);assertEquals("12", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52028);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52029);sb.appendFixedWidthPadRight(123, 3, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52030);assertEquals("123", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52031);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52032);sb.appendFixedWidthPadRight(123, 4, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52033);assertEquals("123-", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52034);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52035);sb.appendFixedWidthPadRight(123, 10, '-');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52036);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_5_213q313q3lvha7ie7.R.inc(52037);assertEquals("123-------", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_FormattedString() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kfffhb145i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_FormattedString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kfffhb145i(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52038);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52039);StrBuilder sb;

        __CLR4_5_213q313q3lvha7ie7.R.inc(52040);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52041);sb.append("Hi", (Object[]) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52042);assertEquals("Hi", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52043);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52044);sb.append("Hi", "Alice");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52045);assertEquals("Hi", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52046);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52047);sb.append("Hi %s", "Alice");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52048);assertEquals("Hi Alice", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52049);sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52050);sb.append("Hi %s %,d", "Alice", 5000);
        // group separator depends on system locale
        __CLR4_5_213q313q3lvha7ie7.R.inc(52051);final char groupingSeparator = DecimalFormatSymbols.getInstance().getGroupingSeparator();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52052);final String expected = "Hi Alice 5" + groupingSeparator + "000";
        __CLR4_5_213q313q3lvha7ie7.R.inc(52053);assertEquals(expected, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Array() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jjsgpi145y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jjsgpi145y(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52054);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52055);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52056);sb.appendAll((Object[]) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52057);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52058);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52059);sb.appendAll(new Object[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52060);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52061);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52062);sb.appendAll(new Object[]{"foo", "bar", "baz"});
        __CLR4_5_213q313q3lvha7ie7.R.inc(52063);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52064);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52065);sb.appendAll("foo", "bar", "baz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52066);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Collection() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2co8ma7146b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Collection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2co8ma7146b(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52067);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52068);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52069);sb.appendAll((Collection<?>) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52070);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52071);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52072);sb.appendAll(Collections.EMPTY_LIST);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52073);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52074);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52075);sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}));
        __CLR4_5_213q313q3lvha7ie7.R.inc(52076);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Iterator() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p5ja3l146l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Iterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p5ja3l146l(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52077);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52078);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52079);sb.appendAll((Iterator<?>) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52080);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52081);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52082);sb.appendAll(Collections.EMPTY_LIST.iterator());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52083);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52084);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52085);sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52086);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Array() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dqyzzz146v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dqyzzz146v(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52087);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52088);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52089);sb.appendWithSeparators((Object[]) null, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52090);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52091);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52092);sb.appendWithSeparators(new Object[0], ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52093);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52094);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52095);sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52096);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52097);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52098);sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52099);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52100);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52101);sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52102);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Collection() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259r0n8147b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Collection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259r0n8147b(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52103);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52104);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52105);sb.appendWithSeparators((Collection<?>) null, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52106);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52107);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52108);sb.appendWithSeparators(Collections.EMPTY_LIST, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52109);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52110);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52111);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52112);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52113);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52114);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52115);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52116);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52117);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52118);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Iterator() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h3rxws147r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Iterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h3rxws147r(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52119);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52120);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52121);sb.appendWithSeparators((Iterator<?>) null, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52122);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52123);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52124);sb.appendWithSeparators(Collections.EMPTY_LIST.iterator(), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52125);assertEquals("", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52126);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52127);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52128);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52129);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52130);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52131);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52132);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52133);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}).iterator(), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52134);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparatorsWithNullText() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kplx7l1487();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparatorsWithNullText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kplx7l1487(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52135);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52136);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52137);sb.setNullText("null");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52138);sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52139);assertEquals("foo,null,baz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52140);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52141);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52142);assertEquals("foo,null,baz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24dm2ci148f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24dm2ci148f(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52143);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52144);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52145);sb.appendSeparator(",");  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52146);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52147);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52148);assertEquals("foo", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52149);sb.appendSeparator(",");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52150);assertEquals("foo,", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String_String() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dvoy8w148n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dvoy8w148n(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52151);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52152);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52153);final String startSeparator = "order by ";
        __CLR4_5_213q313q3lvha7ie7.R.inc(52154);final String standardSeparator = ",";
        __CLR4_5_213q313q3lvha7ie7.R.inc(52155);final String foo = "foo";
        __CLR4_5_213q313q3lvha7ie7.R.inc(52156);sb.appendSeparator(null, null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52157);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52158);sb.appendSeparator(standardSeparator, null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52159);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52160);sb.appendSeparator(standardSeparator, startSeparator); 
        __CLR4_5_213q313q3lvha7ie7.R.inc(52161);assertEquals(startSeparator, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52162);sb.appendSeparator(null, null); 
        __CLR4_5_213q313q3lvha7ie7.R.inc(52163);assertEquals(startSeparator, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52164);sb.appendSeparator(null, startSeparator); 
        __CLR4_5_213q313q3lvha7ie7.R.inc(52165);assertEquals(startSeparator, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52166);sb.append(foo);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52167);assertEquals(startSeparator + foo, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52168);sb.appendSeparator(standardSeparator, startSeparator);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52169);assertEquals(startSeparator + foo + standardSeparator, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_char() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qxfn191496();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qxfn191496(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52170);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52171);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52172);sb.appendSeparator(',');  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52173);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52174);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52175);assertEquals("foo", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52176);sb.appendSeparator(',');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52177);assertEquals("foo,", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
    @Test
    public void testAppendSeparator_char_char() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fghzi8149e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fghzi8149e(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52178);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52179);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52180);final char startSeparator = ':';
        __CLR4_5_213q313q3lvha7ie7.R.inc(52181);final char standardSeparator = ',';
        __CLR4_5_213q313q3lvha7ie7.R.inc(52182);final String foo = "foo";
        __CLR4_5_213q313q3lvha7ie7.R.inc(52183);sb.appendSeparator(standardSeparator, startSeparator);  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52184);assertEquals(String.valueOf(startSeparator), sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52185);sb.append(foo);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52186);assertEquals(String.valueOf(startSeparator) + foo, sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52187);sb.appendSeparator(standardSeparator, startSeparator);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52188);assertEquals(String.valueOf(startSeparator) + foo + standardSeparator, sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iepu8e149p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iepu8e149p(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52189);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52190);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52191);sb.appendSeparator(",", 0);  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52192);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52193);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52194);assertEquals("foo", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52195);sb.appendSeparator(",", 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52196);assertEquals("foo,", sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(52197);sb.appendSeparator(",", -1);  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52198);assertEquals("foo,", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_char_int() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pifju5149z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pifju5149z(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52199);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52200);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52201);sb.appendSeparator(',', 0);  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52202);assertEquals("", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52203);sb.append("foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52204);assertEquals("foo", sb.toString());
        __CLR4_5_213q313q3lvha7ie7.R.inc(52205);sb.appendSeparator(',', 1);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52206);assertEquals("foo,", sb.toString());
        
        __CLR4_5_213q313q3lvha7ie7.R.inc(52207);sb.appendSeparator(',', -1);  // no effect
        __CLR4_5_213q313q3lvha7ie7.R.inc(52208);assertEquals("foo,", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInsert() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2adr9w214a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testInsert",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2adr9w214a9(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52209);

        __CLR4_5_213q313q3lvha7ie7.R.inc(52210);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52211);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52212);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52213);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52214);sb.insert(-1, FOO);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52215);fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52216);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52217);sb.insert(7, FOO);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52218);fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52219);sb.insert(0, (Object) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52220);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52221);sb.insert(0, FOO);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52222);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52223);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52224);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52225);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52226);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52227);sb.insert(-1, "foo");
            __CLR4_5_213q313q3lvha7ie7.R.inc(52228);fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52229);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52230);sb.insert(7, "foo");
            __CLR4_5_213q313q3lvha7ie7.R.inc(52231);fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52232);sb.insert(0, (String) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52233);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52234);sb.insert(0, "foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52235);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52236);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52237);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52238);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52239);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52240);sb.insert(-1, new char[]{'f', 'o', 'o'});
            __CLR4_5_213q313q3lvha7ie7.R.inc(52241);fail("insert(-1, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52242);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52243);sb.insert(7, new char[]{'f', 'o', 'o'});
            __CLR4_5_213q313q3lvha7ie7.R.inc(52244);fail("insert(7, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52245);sb.insert(0, (char[]) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52246);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52247);sb.insert(0, new char[0]);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52248);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52249);sb.insert(0, new char[]{'f', 'o', 'o'});
        __CLR4_5_213q313q3lvha7ie7.R.inc(52250);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52251);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52252);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52253);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52254);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52255);sb.insert(-1, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52256);fail("insert(-1, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52257);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52258);sb.insert(7, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52259);fail("insert(7, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52260);sb.insert(0, null, 0, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52261);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52262);sb.insert(0, new char[0], 0, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52263);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52264);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52265);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, -1, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52266);fail("insert(0, char[], -1, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52267);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52268);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 10, 3);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52269);fail("insert(0, char[], 10, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52270);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52271);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, -1);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52272);fail("insert(0, char[], 0, -1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52273);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52274);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 10);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52275);fail("insert(0, char[], 0, 10) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52276);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52277);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52278);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52279);assertEquals("foobarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52280);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52281);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52282);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52283);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52284);sb.insert(-1, true);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52285);fail("insert(-1, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52286);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52287);sb.insert(7, true);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52288);fail("insert(7, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52289);sb.insert(0, true);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52290);assertEquals("truebarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52291);sb.insert(0, false);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52292);assertEquals("falsetruebarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52293);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52294);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52295);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52296);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52297);sb.insert(-1, '!');
            __CLR4_5_213q313q3lvha7ie7.R.inc(52298);fail("insert(-1, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52299);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52300);sb.insert(7, '!');
            __CLR4_5_213q313q3lvha7ie7.R.inc(52301);fail("insert(7, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52302);sb.insert(0, '!');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52303);assertEquals("!barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52304);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52305);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52306);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52307);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52308);sb.insert(-1, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52309);fail("insert(-1, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52310);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52311);sb.insert(7, 0);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52312);fail("insert(7, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52313);sb.insert(0, '0');
        __CLR4_5_213q313q3lvha7ie7.R.inc(52314);assertEquals("0barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52315);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52316);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52317);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52318);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52319);sb.insert(-1, 1L);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52320);fail("insert(-1, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52321);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52322);sb.insert(7, 1L);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52323);fail("insert(7, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52324);sb.insert(0, 1L);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52325);assertEquals("1barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52326);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52327);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52328);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52329);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52330);sb.insert(-1, 2.3F);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52331);fail("insert(-1, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52332);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52333);sb.insert(7, 2.3F);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52334);fail("insert(7, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52335);sb.insert(0, 2.3F);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52336);assertEquals("2.3barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52337);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52338);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52339);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52340);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52341);sb.insert(-1, 4.5D);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52342);fail("insert(-1, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52343);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52344);sb.insert(7, 4.5D);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52345);fail("insert(7, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52346);sb.insert(0, 4.5D);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52347);assertEquals("4.5barbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInsertWithNullText() {__CLR4_5_213q313q3lvha7ie7.R.globalSliceStart(getClass().getName(),52348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2auvp9014e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q313q3lvha7ie7.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q313q3lvha7ie7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testInsertWithNullText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2auvp9014e4(){try{__CLR4_5_213q313q3lvha7ie7.R.inc(52348);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52349);final StrBuilder sb = new StrBuilder();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52350);sb.setNullText("null");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52351);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52352);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52353);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52354);sb.insert(-1, FOO);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52355);fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52356);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52357);sb.insert(7, FOO);
            __CLR4_5_213q313q3lvha7ie7.R.inc(52358);fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52359);sb.insert(0, (Object) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52360);assertEquals("nullbarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52361);sb.insert(0, FOO);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52362);assertEquals("foonullbarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52363);sb.clear();
        __CLR4_5_213q313q3lvha7ie7.R.inc(52364);sb.append("barbaz");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52365);assertEquals("barbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52366);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52367);sb.insert(-1, "foo");
            __CLR4_5_213q313q3lvha7ie7.R.inc(52368);fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52369);try {
            __CLR4_5_213q313q3lvha7ie7.R.inc(52370);sb.insert(7, "foo");
            __CLR4_5_213q313q3lvha7ie7.R.inc(52371);fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_213q313q3lvha7ie7.R.inc(52372);sb.insert(0, (String) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52373);assertEquals("nullbarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52374);sb.insert(0, "foo");
        __CLR4_5_213q313q3lvha7ie7.R.inc(52375);assertEquals("foonullbarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52376);sb.insert(0, (char[]) null);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52377);assertEquals("nullfoonullbarbaz", sb.toString());

        __CLR4_5_213q313q3lvha7ie7.R.inc(52378);sb.insert(0, null, 0, 0);
        __CLR4_5_213q313q3lvha7ie7.R.inc(52379);assertEquals("nullnullfoonullbarbaz", sb.toString());
    }finally{__CLR4_5_213q313q3lvha7ie7.R.flushNeeded();}}
}
