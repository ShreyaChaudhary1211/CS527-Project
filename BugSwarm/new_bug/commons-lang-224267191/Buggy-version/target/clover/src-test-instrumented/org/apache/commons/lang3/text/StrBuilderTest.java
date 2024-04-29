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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 */
@Deprecated
public class StrBuilderTest {static class __CLR4_5_214f014f0lvha7ig2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,53697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe14f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe14f0(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52380);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52381);final StrBuilder sb0 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52382);assertEquals(32, sb0.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52383);assertEquals(0, sb0.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52384);assertEquals(0, sb0.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52385);final StrBuilder sb1 = new StrBuilder(32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52386);assertEquals(32, sb1.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52387);assertEquals(0, sb1.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52388);assertEquals(0, sb1.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52389);final StrBuilder sb2 = new StrBuilder(0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52390);assertEquals(32, sb2.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52391);assertEquals(0, sb2.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52392);assertEquals(0, sb2.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52393);final StrBuilder sb3 = new StrBuilder(-1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52394);assertEquals(32, sb3.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52395);assertEquals(0, sb3.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52396);assertEquals(0, sb3.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52397);final StrBuilder sb4 = new StrBuilder(1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52398);assertEquals(1, sb4.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52399);assertEquals(0, sb4.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52400);assertEquals(0, sb4.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52401);final StrBuilder sb5 = new StrBuilder(null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52402);assertEquals(32, sb5.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52403);assertEquals(0, sb5.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52404);assertEquals(0, sb5.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52405);final StrBuilder sb6 = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52406);assertEquals(32, sb6.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52407);assertEquals(0, sb6.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52408);assertEquals(0, sb6.size());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52409);final StrBuilder sb7 = new StrBuilder("foo");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52410);assertEquals(35, sb7.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52411);assertEquals(3, sb7.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52412);assertEquals(3, sb7.size());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testChaining() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ks9sm214fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testChaining",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ks9sm214fx(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52413);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52414);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52415);assertSame(sb, sb.setNewLineText(null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52416);assertSame(sb, sb.setNullText(null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52417);assertSame(sb, sb.setLength(1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52418);assertSame(sb, sb.setCharAt(0, 'a'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52419);assertSame(sb, sb.ensureCapacity(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52420);assertSame(sb, sb.minimizeCapacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52421);assertSame(sb, sb.clear());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52422);assertSame(sb, sb.reverse());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52423);assertSame(sb, sb.trim());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReadFromReader() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gks3z014g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gks3z014g8() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52424);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52425);String s = "";
        __CLR4_5_214f014f0lvha7ig2.R.inc(52426);for (int i = 0; (((i < 100)&&(__CLR4_5_214f014f0lvha7ig2.R.iget(52427)!=0|true))||(__CLR4_5_214f014f0lvha7ig2.R.iget(52428)==0&false)); ++i) {{
            __CLR4_5_214f014f0lvha7ig2.R.inc(52429);final StrBuilder sb = new StrBuilder();
            __CLR4_5_214f014f0lvha7ig2.R.inc(52430);final int len = sb.readFrom(new StringReader(s));

            __CLR4_5_214f014f0lvha7ig2.R.inc(52431);assertEquals(s.length(), len);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52432);assertEquals(s, sb.toString());

            __CLR4_5_214f014f0lvha7ig2.R.inc(52433);s += Integer.toString(i);
        }
    }}finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReadFromReaderAppendsToEnd() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ecnf8d14gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromReaderAppendsToEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ecnf8d14gi() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52434);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52435);final StrBuilder sb = new StrBuilder("Test");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52436);sb.readFrom(new StringReader(" 123"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52437);assertEquals("Test 123", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReadFromCharBuffer() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgpaun14gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromCharBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgpaun14gm() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52438);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52439);String s = "";
        __CLR4_5_214f014f0lvha7ig2.R.inc(52440);for (int i = 0; (((i < 100)&&(__CLR4_5_214f014f0lvha7ig2.R.iget(52441)!=0|true))||(__CLR4_5_214f014f0lvha7ig2.R.iget(52442)==0&false)); ++i) {{
            __CLR4_5_214f014f0lvha7ig2.R.inc(52443);final StrBuilder sb = new StrBuilder();
            __CLR4_5_214f014f0lvha7ig2.R.inc(52444);final int len = sb.readFrom(CharBuffer.wrap(s));

            __CLR4_5_214f014f0lvha7ig2.R.inc(52445);assertEquals(s.length(), len);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52446);assertEquals(s, sb.toString());

            __CLR4_5_214f014f0lvha7ig2.R.inc(52447);s += Integer.toString(i);
        }
    }}finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReadFromCharBufferAppendsToEnd() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yilqd214gw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromCharBufferAppendsToEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yilqd214gw() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52448);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52449);final StrBuilder sb = new StrBuilder("Test");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52450);sb.readFrom(CharBuffer.wrap(" 123"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52451);assertEquals("Test 123", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReadFromReadable() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pu22i114h0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromReadable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pu22i114h0() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52452);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52453);String s = "";
        __CLR4_5_214f014f0lvha7ig2.R.inc(52454);for (int i = 0; (((i < 100)&&(__CLR4_5_214f014f0lvha7ig2.R.iget(52455)!=0|true))||(__CLR4_5_214f014f0lvha7ig2.R.iget(52456)==0&false)); ++i) {{
            __CLR4_5_214f014f0lvha7ig2.R.inc(52457);final StrBuilder sb = new StrBuilder();
            __CLR4_5_214f014f0lvha7ig2.R.inc(52458);final int len = sb.readFrom(new MockReadable(s));

            __CLR4_5_214f014f0lvha7ig2.R.inc(52459);assertEquals(s.length(), len);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52460);assertEquals(s, sb.toString());

            __CLR4_5_214f014f0lvha7ig2.R.inc(52461);s += Integer.toString(i);
        }
    }}finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReadFromReadableAppendsToEnd() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ws4zao14ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReadFromReadableAppendsToEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ws4zao14ha() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(52462);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52463);final StrBuilder sb = new StrBuilder("Test");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52464);sb.readFrom(new MockReadable(" 123"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52465);assertEquals("Test 123", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    private static class MockReadable implements Readable {

        private final CharBuffer src;

        public MockReadable(final String src) {try{__CLR4_5_214f014f0lvha7ig2.R.inc(52466);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52467);this.src = CharBuffer.wrap(src);
        }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

        @Override
        public int read(final CharBuffer cb) throws IOException {try{__CLR4_5_214f014f0lvha7ig2.R.inc(52468);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52469);return src.read(cb);
        }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetSetNewLineText() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mr60k614hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetSetNewLineText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mr60k614hi(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52470);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52471);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52472);assertEquals(null, sb.getNewLineText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52473);sb.setNewLineText("#");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52474);assertEquals("#", sb.getNewLineText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52475);sb.setNewLineText("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52476);assertEquals("", sb.getNewLineText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52477);sb.setNewLineText(null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52478);assertEquals(null, sb.getNewLineText());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetSetNullText() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sltnaf14hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetSetNullText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sltnaf14hr(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52479);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52480);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52481);assertEquals(null, sb.getNullText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52482);sb.setNullText("null");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52483);assertEquals("null", sb.getNullText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52484);sb.setNullText("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52485);assertEquals(null, sb.getNullText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52486);sb.setNullText("NULL");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52487);assertEquals("NULL", sb.getNullText());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52488);sb.setNullText(null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52489);assertEquals(null, sb.getNullText());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCapacityAndLength() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qzht4o14i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCapacityAndLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qzht4o14i2(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52490);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52491);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52492);assertEquals(32, sb.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52493);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52494);assertEquals(0, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52495);assertTrue(sb.isEmpty());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52496);sb.minimizeCapacity();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52497);assertEquals(0, sb.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52498);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52499);assertEquals(0, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52500);assertTrue(sb.isEmpty());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52501);sb.ensureCapacity(32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52502);assertTrue(sb.capacity() >= 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52503);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52504);assertEquals(0, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52505);assertTrue(sb.isEmpty());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52506);sb.append("foo");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52507);assertTrue(sb.capacity() >= 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52508);assertEquals(3, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52509);assertEquals(3, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52510);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52511);sb.clear();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52512);assertTrue(sb.capacity() >= 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52513);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52514);assertEquals(0, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52515);assertTrue(sb.isEmpty());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52516);sb.append("123456789012345678901234567890123");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52517);assertTrue(sb.capacity() > 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52518);assertEquals(33, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52519);assertEquals(33, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52520);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52521);sb.ensureCapacity(16);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52522);assertTrue(sb.capacity() > 16);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52523);assertEquals(33, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52524);assertEquals(33, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52525);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52526);sb.minimizeCapacity();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52527);assertEquals(33, sb.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52528);assertEquals(33, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52529);assertEquals(33, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52530);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52531);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52532);sb.setLength(-1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52533);fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_5_214f014f0lvha7ig2.R.inc(52534);sb.setLength(33);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52535);assertEquals(33, sb.capacity());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52536);assertEquals(33, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52537);assertEquals(33, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52538);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52539);sb.setLength(16);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52540);assertTrue(sb.capacity() >= 16);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52541);assertEquals(16, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52542);assertEquals(16, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52543);assertEquals("1234567890123456", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52544);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52545);sb.setLength(32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52546);assertTrue(sb.capacity() >= 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52547);assertEquals(32, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52548);assertEquals(32, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52549);assertEquals("1234567890123456\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52550);assertTrue(sb.isEmpty() == false);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52551);sb.setLength(0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52552);assertTrue(sb.capacity() >= 32);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52553);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52554);assertEquals(0, sb.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52555);assertTrue(sb.isEmpty());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLength() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25p23dt14jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25p23dt14jw(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52556);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52557);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52558);assertEquals(0, sb.length());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52559);sb.append("Hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52560);assertEquals(5, sb.length());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testSetLength() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cb8uf114k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSetLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cb8uf114k1(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52561);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52562);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52563);sb.append("Hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52564);sb.setLength(2);  // shorten
        __CLR4_5_214f014f0lvha7ig2.R.inc(52565);assertEquals("He", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52566);sb.setLength(2);  // no change
        __CLR4_5_214f014f0lvha7ig2.R.inc(52567);assertEquals("He", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52568);sb.setLength(3);  // lengthen
        __CLR4_5_214f014f0lvha7ig2.R.inc(52569);assertEquals("He\0", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52570);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52571);sb.setLength(-1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52572);fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCapacity() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmpwp914kd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCapacity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52573,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmpwp914kd(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52573);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52574);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52575);assertEquals(sb.buffer.length, sb.capacity());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52576);sb.append("HelloWorldHelloWorldHelloWorldHelloWorld");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52577);assertEquals(sb.buffer.length, sb.capacity());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testEnsureCapacity() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oebgz314ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEnsureCapacity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oebgz314ki(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52578);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52579);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52580);sb.ensureCapacity(2);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52581);assertTrue(sb.capacity() >= 2);
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52582);sb.ensureCapacity(-1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52583);assertTrue(sb.capacity() >= 0);
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52584);sb.append("HelloWorld");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52585);sb.ensureCapacity(40);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52586);assertTrue(sb.capacity() >= 40);
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testMinimizeCapacity() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22kk4b314kr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testMinimizeCapacity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22kk4b314kr(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52587);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52588);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52589);sb.minimizeCapacity();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52590);assertEquals(0, sb.capacity());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52591);sb.append("HelloWorld");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52592);sb.minimizeCapacity();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52593);assertEquals(10, sb.capacity());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSize() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27xx12214ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27xx12214ky(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52594);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52595);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52596);assertEquals(0, sb.size());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52597);sb.append("Hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52598);assertEquals(5, sb.size());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testIsEmpty() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2custqg14l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIsEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2custqg14l3(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52599);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52600);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52601);assertTrue(sb.isEmpty());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52602);sb.append("Hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52603);assertFalse(sb.isEmpty());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52604);sb.clear();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52605);assertTrue(sb.isEmpty());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testClear() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlyl6q14la();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testClear",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52606,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlyl6q14la(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52606);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52607);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52608);sb.append("Hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52609);sb.clear();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52610);assertEquals(0, sb.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52611);assertTrue(sb.buffer.length >= 5);
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharAt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u60p4y14lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCharAt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u60p4y14lg(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52612);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52613);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52614);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52615);sb.charAt(0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52616);fail("charAt(0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52617);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52618);sb.charAt(-1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52619);fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52620);sb.append("foo");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52621);assertEquals('f', sb.charAt(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52622);assertEquals('o', sb.charAt(1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52623);assertEquals('o', sb.charAt(2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(52624);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52625);sb.charAt(-1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52626);fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52627);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52628);sb.charAt(3);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52629);fail("charAt(3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetCharAt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2musf1c14ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSetCharAt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2musf1c14ly(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52630);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52631);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52632);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52633);sb.setCharAt(0, 'f');
            __CLR4_5_214f014f0lvha7ig2.R.inc(52634);fail("setCharAt(0,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52635);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52636);sb.setCharAt(-1, 'f');
            __CLR4_5_214f014f0lvha7ig2.R.inc(52637);fail("setCharAt(-1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52638);sb.append("foo");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52639);sb.setCharAt(0, 'b');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52640);sb.setCharAt(1, 'a');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52641);sb.setCharAt(2, 'r');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52642);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52643);sb.setCharAt(3, '!');
            __CLR4_5_214f014f0lvha7ig2.R.inc(52644);fail("setCharAt(3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_5_214f014f0lvha7ig2.R.inc(52645);assertEquals("bar", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteCharAt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfjylp14me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteCharAt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfjylp14me(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52646);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52647);final StrBuilder sb = new StrBuilder("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52648);sb.deleteCharAt(0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52649);assertEquals("bc", sb.toString()); 
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52650);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52651);sb.deleteCharAt(1000);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52652);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToCharArray() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b7st8j14ml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b7st8j14ml(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52653);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52654);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52655);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52656);char[] a = sb.toCharArray();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52657);assertNotNull("toCharArray() result is null", a);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52658);assertEquals("toCharArray() result is too large", 0, a.length);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52659);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52660);a = sb.toCharArray();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52661);assertEquals("toCharArray() result incorrect length", 5, a.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52662);assertTrue("toCharArray() result does not match", Arrays.equals("junit".toCharArray(), a));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testToCharArrayIntInt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27g5zj114mv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToCharArrayIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27g5zj114mv(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52663);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52664);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52665);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(0, 0));

        __CLR4_5_214f014f0lvha7ig2.R.inc(52666);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52667);char[] a = sb.toCharArray(0, 20); // too large test
        __CLR4_5_214f014f0lvha7ig2.R.inc(52668);assertEquals("toCharArray(int,int) result incorrect length", 5, a.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52669);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("junit".toCharArray(), a));

        __CLR4_5_214f014f0lvha7ig2.R.inc(52670);a = sb.toCharArray(0, 4);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52671);assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52672);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        __CLR4_5_214f014f0lvha7ig2.R.inc(52673);a = sb.toCharArray(0, 4);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52674);assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52675);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        __CLR4_5_214f014f0lvha7ig2.R.inc(52676);a = sb.toCharArray(0, 1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52677);assertNotNull("toCharArray(int,int) result is null", a);

        __CLR4_5_214f014f0lvha7ig2.R.inc(52678);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52679);sb.toCharArray(-1, 5);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52680);fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }

        __CLR4_5_214f014f0lvha7ig2.R.inc(52681);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52682);sb.toCharArray(6, 5);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52683);fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testGetChars ( ) {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tcpedc14ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tcpedc14ng( ){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52684);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52685);final StrBuilder sb = new StrBuilder();
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52686);char[] input = new char[10];
        __CLR4_5_214f014f0lvha7ig2.R.inc(52687);char[] a = sb.getChars(input);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52688);assertSame (input, a);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52689);assertTrue(Arrays.equals(new char[10], a));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52690);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52691);a = sb.getChars(input);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52692);assertSame(input, a);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52693);assertTrue(Arrays.equals(new char[] {'j','u','n','i','t',0,0,0,0,0},a));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52694);a = sb.getChars(null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52695);assertNotSame(input,a);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52696);assertEquals(5,a.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52697);assertTrue(Arrays.equals("junit".toCharArray(),a));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52698);input = new char[5];
        __CLR4_5_214f014f0lvha7ig2.R.inc(52699);a = sb.getChars(input);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52700);assertSame(input, a);
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52701);input = new char[4];
        __CLR4_5_214f014f0lvha7ig2.R.inc(52702);a = sb.getChars(input);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52703);assertNotSame(input, a);
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testGetCharsIntIntCharArrayInt( ) {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a05k1g14o0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetCharsIntIntCharArrayInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a05k1g14o0( ){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52704);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52705);final StrBuilder sb = new StrBuilder();
               
        __CLR4_5_214f014f0lvha7ig2.R.inc(52706);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52707);char[] a = new char[5];
        __CLR4_5_214f014f0lvha7ig2.R.inc(52708);sb.getChars(0,5,a,0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52709);assertTrue(Arrays.equals(new char[] {'j','u','n','i','t'},a));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52710);a = new char[5];
        __CLR4_5_214f014f0lvha7ig2.R.inc(52711);sb.getChars(0,2,a,3);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52712);assertTrue(Arrays.equals(new char[] {0,0,0,'j','u'},a));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52713);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52714);sb.getChars(-1,0,a,0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52715);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52716);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52717);sb.getChars(0,-1,a,0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52718);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52719);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52720);sb.getChars(0,20,a,0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52721);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52722);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52723);sb.getChars(4,2,a,0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52724);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteIntInt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qfiyjo14ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qfiyjo14ol(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52725);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52726);StrBuilder sb = new StrBuilder("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52727);sb.delete(0, 1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52728);assertEquals("bc", sb.toString()); 
        __CLR4_5_214f014f0lvha7ig2.R.inc(52729);sb.delete(1, 2);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52730);assertEquals("b", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52731);sb.delete(0, 1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52732);assertEquals("", sb.toString()); 
        __CLR4_5_214f014f0lvha7ig2.R.inc(52733);sb.delete(0, 1000);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52734);assertEquals("", sb.toString()); 
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52735);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52736);sb.delete(1, 2);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52737);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(52738);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52739);sb.delete(-1, 1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52740);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52741);sb = new StrBuilder("anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52742);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52743);sb.delete(2, 1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(52744);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteAll_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h916so14p5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h916so14p5(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52745);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52746);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52747);sb.deleteAll('X');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52748);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52749);sb.deleteAll('a');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52750);assertEquals("bcbccb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52751);sb.deleteAll('c');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52752);assertEquals("bbb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52753);sb.deleteAll('b');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52754);assertEquals("", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52755);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52756);sb.deleteAll('b');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52757);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o3k5h314pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o3k5h314pi(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52758);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52759);StrBuilder sb = new StrBuilder("abcba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52760);sb.deleteFirst('X');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52761);assertEquals("abcba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52762);sb.deleteFirst('a');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52763);assertEquals("bcba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52764);sb.deleteFirst('c');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52765);assertEquals("bba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52766);sb.deleteFirst('b');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52767);assertEquals("ba", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52768);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52769);sb.deleteFirst('b');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52770);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAll_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291lrzh14pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291lrzh14pv(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52771);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52772);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52773);sb.deleteAll((String) null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52774);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52775);sb.deleteAll("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52776);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52777);sb.deleteAll("X");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52778);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52779);sb.deleteAll("a");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52780);assertEquals("bcbccb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52781);sb.deleteAll("c");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52782);assertEquals("bbb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52783);sb.deleteAll("b");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52784);assertEquals("", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52785);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52786);sb.deleteAll("bc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52787);assertEquals("acba", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52788);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52789);sb.deleteAll("bc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52790);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fxnlxg14qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fxnlxg14qf(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52791);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52792);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52793);sb.deleteFirst((String) null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52794);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52795);sb.deleteFirst("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52796);assertEquals("abcbccba", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52797);sb.deleteFirst("X");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52798);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52799);sb.deleteFirst("a");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52800);assertEquals("bcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52801);sb.deleteFirst("c");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52802);assertEquals("bbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52803);sb.deleteFirst("b");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52804);assertEquals("bccba", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52805);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52806);sb.deleteFirst("bc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52807);assertEquals("abccba", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52808);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52809);sb.deleteFirst("bc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52810);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAll_StrMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a0g2bh14qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_StrMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a0g2bh14qz(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52811);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52812);StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52813);sb.deleteAll((StrMatcher) null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52814);assertEquals("A0xA1A2yA3", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52815);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52816);assertEquals("xy", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52817);sb = new StrBuilder("Ax1");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52818);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52819);assertEquals("Ax1", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52820);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52821);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52822);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_StrMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ca1h1o14rb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_StrMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ca1h1o14rb(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52823);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52824);StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52825);sb.deleteFirst((StrMatcher) null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52826);assertEquals("A0xA1A2yA3", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52827);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52828);assertEquals("xA1A2yA3", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52829);sb = new StrBuilder("Ax1");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52830);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52831);assertEquals("Ax1", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52832);sb = new StrBuilder("");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52833);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52834);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testReplace_int_int_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxj71x14rn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_int_int_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxj71x14rn(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52835);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52836);StrBuilder sb = new StrBuilder("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52837);sb.replace(0, 1, "d");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52838);assertEquals("dbc", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52839);sb.replace(0, 1, "aaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52840);assertEquals("aaabc", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52841);sb.replace(0, 3, "");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52842);assertEquals("bc", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52843);sb.replace(1, 2, null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52844);assertEquals("b", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52845);sb.replace(1, 1000, "text");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52846);assertEquals("btext", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52847);sb.replace(0, 1000, "text");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52848);assertEquals("text", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52849);sb = new StrBuilder("atext");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52850);sb.replace(1, 1, "ny");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52851);assertEquals("anytext", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52852);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52853);sb.replace(2, 1, "anything");
            __CLR4_5_214f014f0lvha7ig2.R.inc(52854);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52855);sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(52856);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52857);sb.replace(1, 2, "anything");
            __CLR4_5_214f014f0lvha7ig2.R.inc(52858);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(52859);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(52860);sb.replace(-1, 1, "anything");
            __CLR4_5_214f014f0lvha7ig2.R.inc(52861);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_char_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o1ml6i14se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o1ml6i14se(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52862);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52863);final StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52864);sb.replaceAll('x', 'y');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52865);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52866);sb.replaceAll('a', 'd');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52867);assertEquals("dbcbccbd", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52868);sb.replaceAll('b', 'e');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52869);assertEquals("dececced", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52870);sb.replaceAll('c', 'f');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52871);assertEquals("defeffed", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52872);sb.replaceAll('d', 'd');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52873);assertEquals("defeffed", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceFirst_char_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cq173p14sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cq173p14sq(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52874);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52875);final StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52876);sb.replaceFirst('x', 'y');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52877);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52878);sb.replaceFirst('a', 'd');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52879);assertEquals("dbcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52880);sb.replaceFirst('b', 'e');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52881);assertEquals("decbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52882);sb.replaceFirst('c', 'f');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52883);assertEquals("defbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52884);sb.replaceFirst('d', 'd');
        __CLR4_5_214f014f0lvha7ig2.R.inc(52885);assertEquals("defbccba", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_String_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hukdi14t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hukdi14t2(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52886);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52887);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52888);sb.replaceAll((String) null, null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52889);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52890);sb.replaceAll((String) null, "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52891);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52892);sb.replaceAll("", null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52893);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52894);sb.replaceAll("", "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52895);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52896);sb.replaceAll("x", "y");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52897);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52898);sb.replaceAll("a", "d");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52899);assertEquals("dbcbccbd", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52900);sb.replaceAll("d", null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52901);assertEquals("bcbccb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52902);sb.replaceAll("cb", "-");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52903);assertEquals("b-c-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52904);sb = new StrBuilder("abcba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52905);sb.replaceAll("b", "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52906);assertEquals("axbxcxbxa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52907);sb = new StrBuilder("bb");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52908);sb.replaceAll("b", "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52909);assertEquals("xbxxbx", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplaceFirst_String_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lv9pud14tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_String_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lv9pud14tq(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52910);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52911);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52912);sb.replaceFirst((String) null, null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52913);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52914);sb.replaceFirst((String) null, "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52915);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52916);sb.replaceFirst("", null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52917);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52918);sb.replaceFirst("", "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52919);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52920);sb.replaceFirst("x", "y");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52921);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52922);sb.replaceFirst("a", "d");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52923);assertEquals("dbcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52924);sb.replaceFirst("d", null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52925);assertEquals("bcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52926);sb.replaceFirst("cb", "-");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52927);assertEquals("b-ccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52928);sb = new StrBuilder("abcba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52929);sb.replaceFirst("b", "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52930);assertEquals("axbxcba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52931);sb = new StrBuilder("bb");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52932);sb.replaceFirst("b", "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52933);assertEquals("xbxb", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_StrMatcher_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxcsui14ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_StrMatcher_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxcsui14ue(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52934);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52935);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52936);sb.replaceAll((StrMatcher) null, null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52937);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52938);sb.replaceAll((StrMatcher) null, "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52939);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52940);sb.replaceAll(StrMatcher.noneMatcher(), null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52941);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52942);sb.replaceAll(StrMatcher.noneMatcher(), "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52943);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52944);sb.replaceAll(StrMatcher.charMatcher('x'), "y");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52945);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52946);sb.replaceAll(StrMatcher.charMatcher('a'), "d");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52947);assertEquals("dbcbccbd", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52948);sb.replaceAll(StrMatcher.charMatcher('d'), null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52949);assertEquals("bcbccb", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52950);sb.replaceAll(StrMatcher.stringMatcher("cb"), "-");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52951);assertEquals("b-c-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52952);sb = new StrBuilder("abcba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52953);sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52954);assertEquals("axbxcxbxa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52955);sb = new StrBuilder("bb");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52956);sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52957);assertEquals("xbxxbx", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52958);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52959);sb.replaceAll(A_NUMBER_MATCHER, "***");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52960);assertEquals("***-******-***", sb.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(52961);sb = new StrBuilder("Dear X, hello X.");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52962);sb.replaceAll(StrMatcher.stringMatcher("X"), "012345678901234567");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52963);assertEquals("Dear 012345678901234567, hello 012345678901234567.", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplaceFirst_StrMatcher_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29gj6e314v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_StrMatcher_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29gj6e314v8(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52964);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52965);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52966);sb.replaceFirst((StrMatcher) null, null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52967);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52968);sb.replaceFirst((StrMatcher) null, "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52969);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52970);sb.replaceFirst(StrMatcher.noneMatcher(), null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52971);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52972);sb.replaceFirst(StrMatcher.noneMatcher(), "anything");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52973);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52974);sb.replaceFirst(StrMatcher.charMatcher('x'), "y");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52975);assertEquals("abcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52976);sb.replaceFirst(StrMatcher.charMatcher('a'), "d");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52977);assertEquals("dbcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52978);sb.replaceFirst(StrMatcher.charMatcher('d'), null);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52979);assertEquals("bcbccba", sb.toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(52980);sb.replaceFirst(StrMatcher.stringMatcher("cb"), "-");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52981);assertEquals("b-ccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52982);sb = new StrBuilder("abcba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52983);sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52984);assertEquals("axbxcba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52985);sb = new StrBuilder("bb");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52986);sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52987);assertEquals("xbxb", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52988);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52989);sb.replaceFirst(A_NUMBER_MATCHER, "***");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52990);assertEquals("***-A2A3-A4", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),52991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kaxs2214vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52991,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kaxs2214vz(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(52991);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52992);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(52993);sb.replace(null, "x", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52994);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52995);sb.replace(StrMatcher.charMatcher('a'), "x", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52996);assertEquals("xbcbccbx", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52997);sb.replace(StrMatcher.stringMatcher("cb"), "x", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(52998);assertEquals("xbxcxx", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(52999);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53000);sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53001);assertEquals("***-******-***", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53002);sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53003);sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53004);assertEquals("", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryReplace() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sc5z7w14wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryReplace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53005,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sc5z7w14wd(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53005);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53006);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53007);sb.replace(StrMatcher.stringMatcher("cb"), "cb", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53008);assertEquals("abcbccba", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53009);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53010);sb.replace(StrMatcher.stringMatcher("cb"), "-", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53011);assertEquals("ab-c-a", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53012);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53013);sb.replace(StrMatcher.stringMatcher("cb"), "+++", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53014);assertEquals("ab+++c+++a", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53015);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53016);sb.replace(StrMatcher.stringMatcher("cb"), "", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53017);assertEquals("abca", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53018);sb = new StrBuilder("abcbccba");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53019);sb.replace(StrMatcher.stringMatcher("cb"), null, 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53020);assertEquals("abca", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryStartIndex() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uo60py14wt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53021,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uo60py14wt(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53021);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53022);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53023);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53024);assertEquals("-x--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53025);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53026);sb.replace(StrMatcher.stringMatcher("aa"), "-", 1, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53027);assertEquals("aax--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53028);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53029);sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53030);assertEquals("aax--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53031);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53032);sb.replace(StrMatcher.stringMatcher("aa"), "-", 3, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53033);assertEquals("aax--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53034);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53035);sb.replace(StrMatcher.stringMatcher("aa"), "-", 4, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53036);assertEquals("aaxa-ay-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53037);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53038);sb.replace(StrMatcher.stringMatcher("aa"), "-", 5, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53039);assertEquals("aaxaa-y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53040);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53041);sb.replace(StrMatcher.stringMatcher("aa"), "-", 6, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53042);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53043);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53044);sb.replace(StrMatcher.stringMatcher("aa"), "-", 7, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53045);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53046);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53047);sb.replace(StrMatcher.stringMatcher("aa"), "-", 8, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53048);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53049);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53050);sb.replace(StrMatcher.stringMatcher("aa"), "-", 9, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53051);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53052);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53053);sb.replace(StrMatcher.stringMatcher("aa"), "-", 10, sb.length(), -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53054);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53055);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53056);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53057);sb.replace(StrMatcher.stringMatcher("aa"), "-", 11, sb.length(), -1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53058);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53059);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53060);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53061);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53062);sb.replace(StrMatcher.stringMatcher("aa"), "-", -1, sb.length(), -1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53063);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53064);assertEquals("aaxaaaayaa", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryEndIndex() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kiz4ml14y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryEndIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kiz4ml14y1(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53065);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53066);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53067);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 0, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53068);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53069);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53070);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 2, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53071);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53072);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53073);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 3, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53074);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53075);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53076);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 4, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53077);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53078);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53079);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 5, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53080);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53081);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53082);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 6, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53083);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53084);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53085);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 7, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53086);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53087);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53088);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 8, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53089);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53090);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53091);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 9, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53092);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53093);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53094);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53095);assertEquals("-x--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53096);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53097);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 1000, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53098);assertEquals("-x--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53099);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53100);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53101);sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, 1, -1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53102);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53103);assertEquals("aaxaaaayaa", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryCount() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22lix8n14z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryCount",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22lix8n14z4(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53104);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53105);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53106);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53107);assertEquals("-x--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53108);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53109);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53110);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53111);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53112);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53113);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53114);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53115);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 2);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53116);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53117);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53118);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 3);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53119);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53120);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53121);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 4);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53122);assertEquals("-x--y-", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53123);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53124);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 5);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53125);assertEquals("-x--y-", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReverse() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8om2x14zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8om2x14zq(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53126);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53127);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53128);assertEquals("", sb.reverse().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53129);sb.clear().append(true);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53130);assertEquals("eurt", sb.reverse().toString());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53131);assertEquals("true", sb.reverse().toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTrim() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bl47ff14zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testTrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bl47ff14zw(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53132);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53133);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53134);assertEquals("", sb.reverse().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53135);sb.clear().append(" \u0000 ");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53136);assertEquals("", sb.trim().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53137);sb.clear().append(" \u0000 a b c");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53138);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53139);sb.clear().append("a b c \u0000 ");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53140);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53141);sb.clear().append(" \u0000 a b c \u0000 ");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53142);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53143);sb.clear().append("a b c");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53144);assertEquals("a b c", sb.trim().toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStartsWith() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_210ksuo1509();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testStartsWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_210ksuo1509(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53145);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53146);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53147);assertFalse(sb.startsWith("a"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53148);assertFalse(sb.startsWith(null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53149);assertTrue(sb.startsWith(""));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53150);sb.append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53151);assertTrue(sb.startsWith("a"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53152);assertTrue(sb.startsWith("ab"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53153);assertTrue(sb.startsWith("abc"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53154);assertFalse(sb.startsWith("cba"));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testEndsWith() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf5q6v150j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEndsWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf5q6v150j(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53155);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53156);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53157);assertFalse(sb.endsWith("a"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53158);assertFalse(sb.endsWith("c"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53159);assertTrue(sb.endsWith(""));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53160);assertFalse(sb.endsWith(null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53161);sb.append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53162);assertTrue(sb.endsWith("c"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53163);assertTrue(sb.endsWith("bc"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53164);assertTrue(sb.endsWith("abc"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53165);assertFalse(sb.endsWith("cba"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53166);assertFalse(sb.endsWith("abcd"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53167);assertFalse(sb.endsWith(" abc"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53168);assertFalse(sb.endsWith("abc "));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubSequenceIntInt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6ex6150x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubSequenceIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6ex6150x(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53169);
       __CLR4_5_214f014f0lvha7ig2.R.inc(53170);final StrBuilder sb = new StrBuilder ("hello goodbye");
       // Start index is negative
       __CLR4_5_214f014f0lvha7ig2.R.inc(53171);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53172);sb.subSequence(-1, 5);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53173);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index is negative
       __CLR4_5_214f014f0lvha7ig2.R.inc(53174);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53175);sb.subSequence(2, -1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53176);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index greater than length()
        __CLR4_5_214f014f0lvha7ig2.R.inc(53177);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53178);sb.subSequence(2, sb.length() + 1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53179);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Start index greater then end index
        __CLR4_5_214f014f0lvha7ig2.R.inc(53180);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53181);sb.subSequence(3, 2);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53182);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Normal cases
        __CLR4_5_214f014f0lvha7ig2.R.inc(53183);assertEquals ("hello", sb.subSequence(0, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53184);assertEquals ("hello goodbye".subSequence(0, 6), sb.subSequence(0, 6));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53185);assertEquals ("goodbye", sb.subSequence(6, 13));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53186);assertEquals ("hello goodbye".subSequence(6,13), sb.subSequence(6, 13));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testSubstringInt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29itbmx151f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubstringInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29itbmx151f(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53187);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53188);final StrBuilder sb = new StrBuilder ("hello goodbye");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53189);assertEquals ("goodbye", sb.substring(6));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53190);assertEquals ("hello goodbye".substring(6), sb.substring(6));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53191);assertEquals ("hello goodbye", sb.substring(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53192);assertEquals ("hello goodbye".substring(0), sb.substring(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53193);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53194);sb.substring(-1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53195);fail ();
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53196);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53197);sb.substring(15);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53198);fail ();
        } catch (final IndexOutOfBoundsException e) {}
    
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}
    
    @Test
    public void testSubstringIntInt() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6nyhm151r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubstringIntInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6nyhm151r(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53199);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53200);final StrBuilder sb = new StrBuilder ("hello goodbye");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53201);assertEquals ("hello", sb.substring(0, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53202);assertEquals ("hello goodbye".substring(0, 6), sb.substring(0, 6));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53203);assertEquals ("goodbye", sb.substring(6, 13));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53204);assertEquals ("hello goodbye".substring(6,13), sb.substring(6, 13));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53205);assertEquals ("goodbye", sb.substring(6, 20));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53206);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53207);sb.substring(-1, 5);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53208);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53209);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53210);sb.substring(15, 20);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53211);fail();
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testMidString() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tk2f821524();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testMidString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tk2f821524(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53212);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53213);final StrBuilder sb = new StrBuilder("hello goodbye hello");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53214);assertEquals("goodbye", sb.midString(6, 7));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53215);assertEquals("hello", sb.midString(0, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53216);assertEquals("hello", sb.midString(-5, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53217);assertEquals("", sb.midString(0, -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53218);assertEquals("", sb.midString(20, 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53219);assertEquals("hello", sb.midString(14, 22));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testRightString() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a2v6wu152c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testRightString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a2v6wu152c(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53220);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53221);final StrBuilder sb = new StrBuilder("left right");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53222);assertEquals("right", sb.rightString(5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53223);assertEquals("", sb.rightString(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53224);assertEquals("", sb.rightString(-5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53225);assertEquals("left right", sb.rightString(15));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLeftString() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dovhsf152i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLeftString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dovhsf152i(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53226);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53227);final StrBuilder sb = new StrBuilder("left right");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53228);assertEquals("left", sb.leftString(4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53229);assertEquals("", sb.leftString(0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53230);assertEquals("", sb.leftString(-5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53231);assertEquals("left right", sb.leftString(15));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testContains_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0rfp1152o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0rfp1152o(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53232);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53233);final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53234);assertTrue(sb.contains('a'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53235);assertTrue(sb.contains('o'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53236);assertTrue(sb.contains('z'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53237);assertFalse(sb.contains('1'));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testContains_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2z9vq152u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2z9vq152u(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53238);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53239);final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53240);assertTrue(sb.contains("a"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53241);assertTrue(sb.contains("pq"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53242);assertTrue(sb.contains("z"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53243);assertFalse(sb.contains("zyx"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53244);assertFalse(sb.contains((String) null));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testContains_StrMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdf43a1531();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_StrMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdf43a1531(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53245);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53246);StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53247);assertTrue(sb.contains(StrMatcher.charMatcher('a')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53248);assertTrue(sb.contains(StrMatcher.stringMatcher("pq")));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53249);assertTrue(sb.contains(StrMatcher.charMatcher('z')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53250);assertFalse(sb.contains(StrMatcher.stringMatcher("zy")));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53251);assertFalse(sb.contains((StrMatcher) null));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53252);sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53253);assertFalse(sb.contains(A_NUMBER_MATCHER));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53254);sb.append("B A1 C");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53255);assertTrue(sb.contains(A_NUMBER_MATCHER));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22eupff153c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22eupff153c(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53256);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53257);final StrBuilder sb = new StrBuilder("abab");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53258);assertEquals(0, sb.indexOf('a'));
        
        // should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53259);assertEquals("abab".indexOf('a'), sb.indexOf('a'));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53260);assertEquals(1, sb.indexOf('b'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53261);assertEquals("abab".indexOf('b'), sb.indexOf('b'));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53262);assertEquals(-1, sb.indexOf('z'));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testIndexOf_char_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gf2423153j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_char_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gf2423153j(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53263);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53264);StrBuilder sb = new StrBuilder("abab");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53265);assertEquals(0, sb.indexOf('a', -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53266);assertEquals(0, sb.indexOf('a', 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53267);assertEquals(2, sb.indexOf('a', 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53268);assertEquals(-1, sb.indexOf('a', 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53269);assertEquals(-1, sb.indexOf('a', 5));

        // should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53270);assertEquals("abab".indexOf('a', 1), sb.indexOf('a', 1));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53271);assertEquals(3, sb.indexOf('b', 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53272);assertEquals("abab".indexOf('b', 2), sb.indexOf('b', 2));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53273);assertEquals(-1, sb.indexOf('z', 2));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53274);sb = new StrBuilder("xyzabc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53275);assertEquals(2, sb.indexOf('z', 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53276);assertEquals(-1, sb.indexOf('z', 3));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hag5h7153x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hag5h7153x(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53277);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53278);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53279);assertEquals (2, sb.lastIndexOf('a'));
        //should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53280);assertEquals ("abab".lastIndexOf('a'), sb.lastIndexOf('a'));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53281);assertEquals(3, sb.lastIndexOf('b'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53282);assertEquals ("abab".lastIndexOf('b'), sb.lastIndexOf('b'));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53283);assertEquals (-1, sb.lastIndexOf('z'));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0ws9h1544();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_char_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0ws9h1544(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53284);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53285);StrBuilder sb = new StrBuilder("abab");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53286);assertEquals(-1, sb.lastIndexOf('a', -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53287);assertEquals(0, sb.lastIndexOf('a', 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53288);assertEquals(0, sb.lastIndexOf('a', 1));

        // should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53289);assertEquals("abab".lastIndexOf('a', 1), sb.lastIndexOf('a', 1));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53290);assertEquals(1, sb.lastIndexOf('b', 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53291);assertEquals("abab".lastIndexOf('b', 2), sb.lastIndexOf('b', 2));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53292);assertEquals(-1, sb.lastIndexOf('z', 2));

        __CLR4_5_214f014f0lvha7ig2.R.inc(53293);sb = new StrBuilder("xyzabc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53294);assertEquals(2, sb.lastIndexOf('z', sb.length()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53295);assertEquals(-1, sb.lastIndexOf('z', 1));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qm76bk154g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qm76bk154g(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53296);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53297);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53298);assertEquals(0, sb.indexOf("a"));
        //should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53299);assertEquals("abab".indexOf("a"), sb.indexOf("a"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53300);assertEquals(0, sb.indexOf("ab"));
        //should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53301);assertEquals("abab".indexOf("ab"), sb.indexOf("ab"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53302);assertEquals(1, sb.indexOf("b"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53303);assertEquals("abab".indexOf("b"), sb.indexOf("b"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53304);assertEquals(1, sb.indexOf("ba"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53305);assertEquals("abab".indexOf("ba"), sb.indexOf("ba"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53306);assertEquals(-1, sb.indexOf("z"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53307);assertEquals(-1, sb.indexOf((String) null));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testIndexOf_String_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2knlb74154s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_String_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2knlb74154s(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53308);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53309);StrBuilder sb = new StrBuilder("abab");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53310);assertEquals(0, sb.indexOf("a", -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53311);assertEquals(0, sb.indexOf("a", 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53312);assertEquals(2, sb.indexOf("a", 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53313);assertEquals(2, sb.indexOf("a", 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53314);assertEquals(-1, sb.indexOf("a", 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53315);assertEquals(-1, sb.indexOf("a", 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53316);assertEquals(-1, sb.indexOf("a", 5));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53317);assertEquals(-1, sb.indexOf("abcdef", 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53318);assertEquals(0, sb.indexOf("", 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53319);assertEquals(1, sb.indexOf("", 1));
        
        //should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53320);assertEquals ("abab".indexOf("a", 1), sb.indexOf("a", 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53321);assertEquals(2, sb.indexOf("ab", 1));
        //should work like String#indexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53322);assertEquals("abab".indexOf("ab", 1), sb.indexOf("ab", 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53323);assertEquals(3, sb.indexOf("b", 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53324);assertEquals("abab".indexOf("b", 2), sb.indexOf("b", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53325);assertEquals(1, sb.indexOf("ba", 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53326);assertEquals("abab".indexOf("ba", 2), sb.indexOf("ba", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53327);assertEquals(-1, sb.indexOf("z", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53328);sb = new StrBuilder("xyzabc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53329);assertEquals(2, sb.indexOf("za", 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53330);assertEquals(-1, sb.indexOf("za", 3));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53331);assertEquals(-1, sb.indexOf((String) null, 2));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dkp8s6155g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dkp8s6155g(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53332);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53333);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53334);assertEquals(2, sb.lastIndexOf("a"));
        //should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53335);assertEquals("abab".lastIndexOf("a"), sb.lastIndexOf("a"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53336);assertEquals(2, sb.lastIndexOf("ab"));
        //should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53337);assertEquals("abab".lastIndexOf("ab"), sb.lastIndexOf("ab"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53338);assertEquals(3, sb.lastIndexOf("b"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53339);assertEquals("abab".lastIndexOf("b"), sb.lastIndexOf("b"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53340);assertEquals(1, sb.lastIndexOf("ba"));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53341);assertEquals("abab".lastIndexOf("ba"), sb.lastIndexOf("ba"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53342);assertEquals(-1, sb.lastIndexOf("z"));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53343);assertEquals(-1, sb.lastIndexOf((String) null));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqyjkq155s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_String_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqyjkq155s(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53344);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53345);StrBuilder sb = new StrBuilder("abab");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53346);assertEquals(-1, sb.lastIndexOf("a", -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53347);assertEquals(0, sb.lastIndexOf("a", 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53348);assertEquals(0, sb.lastIndexOf("a", 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53349);assertEquals(2, sb.lastIndexOf("a", 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53350);assertEquals(2, sb.lastIndexOf("a", 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53351);assertEquals(2, sb.lastIndexOf("a", 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53352);assertEquals(2, sb.lastIndexOf("a", 5));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53353);assertEquals(-1, sb.lastIndexOf("abcdef", 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53354);assertEquals("abab".lastIndexOf("", 3), sb.lastIndexOf("", 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53355);assertEquals("abab".lastIndexOf("", 1), sb.lastIndexOf("", 1));
        
        //should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53356);assertEquals("abab".lastIndexOf("a", 1), sb.lastIndexOf("a", 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53357);assertEquals(0, sb.lastIndexOf("ab", 1));
        //should work like String#lastIndexOf
        __CLR4_5_214f014f0lvha7ig2.R.inc(53358);assertEquals("abab".lastIndexOf("ab", 1), sb.lastIndexOf("ab", 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53359);assertEquals(1, sb.lastIndexOf("b", 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53360);assertEquals("abab".lastIndexOf("b", 2), sb.lastIndexOf("b", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53361);assertEquals(1, sb.lastIndexOf("ba", 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53362);assertEquals("abab".lastIndexOf("ba", 2), sb.lastIndexOf("ba", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53363);assertEquals(-1, sb.lastIndexOf("z", 2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53364);sb = new StrBuilder("xyzabc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53365);assertEquals(2, sb.lastIndexOf("za", sb.length()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53366);assertEquals(-1, sb.lastIndexOf("za", 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53367);assertEquals(-1, sb.lastIndexOf((String) null, 2));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_StrMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zd6rkg156g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_StrMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53368,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zd6rkg156g(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53368);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53369);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53370);assertEquals(-1, sb.indexOf((StrMatcher) null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53371);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a')));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53372);sb.append("ab bd");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53373);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53374);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53375);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53376);assertEquals(4, sb.indexOf(StrMatcher.charMatcher('d')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53377);assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53378);assertEquals(-1, sb.indexOf((StrMatcher) null));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53379);sb.append(" A1 junction");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53380);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testIndexOf_StrMatcher_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k52gkg156t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_StrMatcher_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k52gkg156t(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53381);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53382);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53383);assertEquals(-1, sb.indexOf((StrMatcher) null, 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53384);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53385);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53386);sb.append("ab bd");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53387);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), -2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53388);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53389);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53390);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 20));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53391);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53392);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53393);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53394);assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53395);assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53396);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53397);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53398);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 6));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53399);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), -2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53400);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53401);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53402);assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53403);assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 20));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53404);assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher(), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53405);assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53406);sb.append(" A1 junction with A2");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53407);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53408);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 6));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53409);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 7));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53410);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 22));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53411);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 23));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53412);assertEquals(-1, sb.indexOf(A_NUMBER_MATCHER, 24));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StrMatcher() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cqmkd6157p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_StrMatcher",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cqmkd6157p(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53413);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53414);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53415);assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53416);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53417);sb.append("ab bd");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53418);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53419);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53420);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53421);assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('d')));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53422);assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher()));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53423);assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53424);sb.append(" A1 junction");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53425);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StrMatcher_int() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h08oa21582();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_StrMatcher_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h08oa21582(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53426);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53427);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53428);assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53429);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53430);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53431);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53432);sb.append("ab bd");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53433);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53434);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53435);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53436);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 20));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53437);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), -1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53438);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53439);assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53440);assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53441);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53442);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53443);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53444);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 6));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53445);assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), -2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53446);assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53447);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53448);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 4));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53449);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 20));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53450);assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher(), 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53451);assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53452);sb.append(" A1 junction with A2");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53453);assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 5));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53454);assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 6)); // A matches, 1 is outside bounds
        __CLR4_5_214f014f0lvha7ig2.R.inc(53455);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 7));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53456);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 22));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53457);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 23)); // A matches, 2 is outside bounds
        __CLR4_5_214f014f0lvha7ig2.R.inc(53458);assertEquals(23, sb.lastIndexOf(A_NUMBER_MATCHER, 24));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    static final StrMatcher A_NUMBER_MATCHER = new StrMatcher() {
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_5_214f014f0lvha7ig2.R.inc(53459);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53460);if ((((buffer[pos] == 'A')&&(__CLR4_5_214f014f0lvha7ig2.R.iget(53461)!=0|true))||(__CLR4_5_214f014f0lvha7ig2.R.iget(53462)==0&false))) {{
                __CLR4_5_214f014f0lvha7ig2.R.inc(53463);pos++;
                __CLR4_5_214f014f0lvha7ig2.R.inc(53464);if ((((pos < bufferEnd && buffer[pos] >= '0' && buffer[pos] <= '9')&&(__CLR4_5_214f014f0lvha7ig2.R.iget(53465)!=0|true))||(__CLR4_5_214f014f0lvha7ig2.R.iget(53466)==0&false))) {{
                    __CLR4_5_214f014f0lvha7ig2.R.inc(53467);return 2;
                }
            }}
            }__CLR4_5_214f014f0lvha7ig2.R.inc(53468);return 0;
        }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}
    };

    //-----------------------------------------------------------------------
    @Test
    public void testAsTokenizer() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n2uwq1599();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsTokenizer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n2uwq1599() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53469);
        // from Javadoc
        __CLR4_5_214f014f0lvha7ig2.R.inc(53470);final StrBuilder b = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53471);b.append("a b ");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53472);final StrTokenizer t = b.asTokenizer();
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53473);final String[] tokens1 = t.getTokenArray();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53474);assertEquals(2, tokens1.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53475);assertEquals("a", tokens1[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53476);assertEquals("b", tokens1[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53477);assertEquals(2, t.size());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53478);b.append("c d ");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53479);final String[] tokens2 = t.getTokenArray();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53480);assertEquals(2, tokens2.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53481);assertEquals("a", tokens2[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53482);assertEquals("b", tokens2[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53483);assertEquals(2, t.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53484);assertEquals("a", t.next());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53485);assertEquals("b", t.next());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53486);t.reset();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53487);final String[] tokens3 = t.getTokenArray();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53488);assertEquals(4, tokens3.length);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53489);assertEquals("a", tokens3[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53490);assertEquals("b", tokens3[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53491);assertEquals("c", tokens3[2]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53492);assertEquals("d", tokens3[3]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53493);assertEquals(4, t.size());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53494);assertEquals("a", t.next());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53495);assertEquals("b", t.next());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53496);assertEquals("c", t.next());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53497);assertEquals("d", t.next());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53498);assertEquals("a b c d ", t.getContent());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testAsReader() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21qxnse15a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsReader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21qxnse15a3() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53499);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53500);final StrBuilder sb = new StrBuilder("some text");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53501);Reader reader = sb.asReader();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53502);assertTrue(reader.ready());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53503);final char[] buf = new char[40];
        __CLR4_5_214f014f0lvha7ig2.R.inc(53504);assertEquals(9, reader.read(buf));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53505);assertEquals("some text", new String(buf, 0, 9));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53506);assertEquals(-1, reader.read());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53507);assertFalse(reader.ready());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53508);assertEquals(0, reader.skip(2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53509);assertEquals(0, reader.skip(-1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53510);assertTrue(reader.markSupported());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53511);reader = sb.asReader();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53512);assertEquals('s', reader.read());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53513);reader.mark(-1);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53514);char[] array = new char[3];
        __CLR4_5_214f014f0lvha7ig2.R.inc(53515);assertEquals(3, reader.read(array, 0, 3));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53516);assertEquals('o', array[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53517);assertEquals('m', array[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53518);assertEquals('e', array[2]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53519);reader.reset();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53520);assertEquals(1, reader.read(array, 1, 1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53521);assertEquals('o', array[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53522);assertEquals('o', array[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53523);assertEquals('e', array[2]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53524);assertEquals(2, reader.skip(2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53525);assertEquals(' ', reader.read());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53526);assertTrue(reader.ready());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53527);reader.close();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53528);assertTrue(reader.ready());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53529);reader = sb.asReader();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53530);array = new char[3];
        __CLR4_5_214f014f0lvha7ig2.R.inc(53531);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53532);reader.read(array, -1, 0);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53533);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53534);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53535);reader.read(array, 0, -1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53536);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53537);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53538);reader.read(array, 100, 1);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53539);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53540);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53541);reader.read(array, 0, 100);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53542);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_5_214f014f0lvha7ig2.R.inc(53543);try {
            __CLR4_5_214f014f0lvha7ig2.R.inc(53544);reader.read(array, Integer.MAX_VALUE, Integer.MAX_VALUE);
            __CLR4_5_214f014f0lvha7ig2.R.inc(53545);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53546);assertEquals(0, reader.read(array, 0, 0));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53547);assertEquals(0, array[0]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53548);assertEquals(0, array[1]);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53549);assertEquals(0, array[2]);
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53550);reader.skip(9);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53551);assertEquals(-1, reader.read(array, 0, 1));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53552);reader.reset();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53553);array = new char[30];
        __CLR4_5_214f014f0lvha7ig2.R.inc(53554);assertEquals(9, reader.read(array, 0, 30));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAsWriter() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29k26jm15bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29k26jm15bn() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53555);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53556);final StrBuilder sb = new StrBuilder("base");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53557);final Writer writer = sb.asWriter();
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53558);writer.write('l');
        __CLR4_5_214f014f0lvha7ig2.R.inc(53559);assertEquals("basel", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53560);writer.write(new char[] {'i', 'n'});
        __CLR4_5_214f014f0lvha7ig2.R.inc(53561);assertEquals("baselin", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53562);writer.write(new char[] {'n', 'e', 'r'}, 1, 2);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53563);assertEquals("baseliner", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53564);writer.write(" rout");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53565);assertEquals("baseliner rout", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53566);writer.write("ping that server", 1, 3);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53567);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53568);writer.flush();  // no effect
        __CLR4_5_214f014f0lvha7ig2.R.inc(53569);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53570);writer.close();  // no effect
        __CLR4_5_214f014f0lvha7ig2.R.inc(53571);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53572);writer.write(" hi");  // works after close
        __CLR4_5_214f014f0lvha7ig2.R.inc(53573);assertEquals("baseliner routing hi", sb.toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53574);sb.setLength(4);  // mix and match
        __CLR4_5_214f014f0lvha7ig2.R.inc(53575);writer.write('d');
        __CLR4_5_214f014f0lvha7ig2.R.inc(53576);assertEquals("based", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsIgnoreCase() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c1544m15c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEqualsIgnoreCase",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c1544m15c9(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53577);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53578);final StrBuilder sb1 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53579);final StrBuilder sb2 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53580);assertTrue(sb1.equalsIgnoreCase(sb1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53581);assertTrue(sb1.equalsIgnoreCase(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53582);assertTrue(sb2.equalsIgnoreCase(sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53583);sb1.append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53584);assertFalse(sb1.equalsIgnoreCase(sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53585);sb2.append("ABC");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53586);assertTrue(sb1.equalsIgnoreCase(sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53587);sb2.clear().append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53588);assertTrue(sb1.equalsIgnoreCase(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53589);assertTrue(sb1.equalsIgnoreCase(sb1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53590);assertTrue(sb2.equalsIgnoreCase(sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53591);sb2.clear().append("aBc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53592);assertTrue(sb1.equalsIgnoreCase(sb2));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60815cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53593,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60815cp(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53593);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53594);final StrBuilder sb1 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53595);final StrBuilder sb2 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53596);assertTrue(sb1.equals(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53597);assertTrue(sb1.equals(sb1));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53598);assertTrue(sb2.equals(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53599);assertTrue(sb1.equals((Object) sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53600);sb1.append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53601);assertFalse(sb1.equals(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53602);assertFalse(sb1.equals((Object) sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53603);sb2.append("ABC");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53604);assertFalse(sb1.equals(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53605);assertFalse(sb1.equals((Object) sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53606);sb2.clear().append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53607);assertTrue(sb1.equals(sb2));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53608);assertTrue(sb1.equals((Object) sb2));
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53609);assertFalse(sb1.equals(Integer.valueOf(1)));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53610);assertFalse(sb1.equals("abc"));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void test_LANG_1131_EqualsWithNullStrBuilder() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqbgxy15d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.test_LANG_1131_EqualsWithNullStrBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqbgxy15d7() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53611);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53612);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53613);final StrBuilder other = null;
        __CLR4_5_214f014f0lvha7ig2.R.inc(53614);assertFalse(sb.equals(other));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testHashCode() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv815db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv815db(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53615);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53616);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53617);final int hc1a = sb.hashCode();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53618);final int hc1b = sb.hashCode();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53619);assertEquals(0, hc1a);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53620);assertEquals(hc1a, hc1b);
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53621);sb.append("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53622);final int hc2a = sb.hashCode();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53623);final int hc2b = sb.hashCode();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53624);assertTrue(hc2a != 0);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53625);assertEquals(hc2a, hc2b);
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid15dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid15dm(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53626);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53627);final StrBuilder sb = new StrBuilder("abc");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53628);assertEquals("abc", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStringBuffer() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkk5ff15dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToStringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkk5ff15dp(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53629);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53630);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53631);assertEquals(new StringBuffer().toString(), sb.toStringBuffer().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53632);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53633);assertEquals(new StringBuffer("junit").toString(), sb.toStringBuffer().toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStringBuilder() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jio9015du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToStringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jio9015du(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53634);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53635);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53636);assertEquals(new StringBuilder().toString(), sb.toStringBuilder().toString());
        
        __CLR4_5_214f014f0lvha7ig2.R.inc(53637);sb.append("junit");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53638);assertEquals(new StringBuilder("junit").toString(), sb.toStringBuilder().toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang294() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24v6dyk15dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang294",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24v6dyk15dz(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53639);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53640);final StrBuilder sb = new StrBuilder("\n%BLAH%\nDo more stuff\neven more stuff\n%BLAH%\n");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53641);sb.deleteAll("\n%BLAH%");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53642);assertEquals("\nDo more stuff\neven more stuff\n", sb.toString()); 
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testIndexOfLang294() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29yb7rj15e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOfLang294",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29yb7rj15e3(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53643);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53644);final StrBuilder sb = new StrBuilder("onetwothree");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53645);sb.deleteFirst("three");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53646);assertEquals(-1, sb.indexOf("three"));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang295() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21m6f6315e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang295",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21m6f6315e7(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53647);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53648);final StrBuilder sb = new StrBuilder("onetwothree");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53649);sb.deleteFirst("three");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53650);assertFalse( "The contains(char) method is looking beyond the end of the string", sb.contains('h'));
        __CLR4_5_214f014f0lvha7ig2.R.inc(53651);assertEquals( "The indexOf(char) method is looking beyond the end of the string", -1, sb.indexOf('h'));
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang412Right() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tm8jy15ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang412Right",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53652,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tm8jy15ec(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53652);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53653);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53654);sb.appendFixedWidthPadRight(null, 10, '*');
        __CLR4_5_214f014f0lvha7ig2.R.inc(53655);assertEquals( "Failed to invoke appendFixedWidthPadRight correctly", "**********", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testLang412Left() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2150iql15eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang412Left",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2150iql15eg(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53656);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53657);final StrBuilder sb = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53658);sb.appendFixedWidthPadLeft(null, 10, '*');
        __CLR4_5_214f014f0lvha7ig2.R.inc(53659);assertEquals( "Failed to invoke appendFixedWidthPadLeft correctly", "**********", sb.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testAsBuilder() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaybk215ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaybk215ek(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53660);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53661);final StrBuilder sb = new StrBuilder().appendAll("Lorem", " ", "ipsum", " ", "dolor");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53662);assertEquals(sb.toString(), sb.build());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendCharBuffer() {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25xzejb15en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAppendCharBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25xzejb15en(){try{__CLR4_5_214f014f0lvha7ig2.R.inc(53663);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53664);final StrBuilder sb1 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53665);final CharBuffer buf = CharBuffer.allocate(10);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53666);buf.append("0123456789");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53667);buf.flip();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53668);sb1.append(buf);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53669);assertEquals("0123456789", sb1.toString());

        __CLR4_5_214f014f0lvha7ig2.R.inc(53670);final StrBuilder sb2 = new StrBuilder();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53671);sb2.append(buf, 1, 8);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53672);assertEquals("12345678", sb2.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendToWriter() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ez0zj15ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAppendToWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ez0zj15ex() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53673);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53674);final StrBuilder sb = new StrBuilder("1234567890");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53675);final StringWriter writer = new StringWriter();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53676);writer.append("Test ");

        __CLR4_5_214f014f0lvha7ig2.R.inc(53677);sb.appendTo(writer);

        __CLR4_5_214f014f0lvha7ig2.R.inc(53678);assertEquals("Test 1234567890", writer.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testAppendToStringBuilder() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25h87li15f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAppendToStringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25h87li15f3() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53679);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53680);final StrBuilder sb = new StrBuilder("1234567890");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53681);final StringBuilder builder = new StringBuilder("Test ");

        __CLR4_5_214f014f0lvha7ig2.R.inc(53682);sb.appendTo(builder);

        __CLR4_5_214f014f0lvha7ig2.R.inc(53683);assertEquals("Test 1234567890", builder.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testAppendToStringBuffer() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ygggan15f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAppendToStringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ygggan15f8() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53684);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53685);final StrBuilder sb = new StrBuilder("1234567890");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53686);final StringBuffer buffer = new StringBuffer("Test ");

        __CLR4_5_214f014f0lvha7ig2.R.inc(53687);sb.appendTo(buffer);

        __CLR4_5_214f014f0lvha7ig2.R.inc(53688);assertEquals("Test 1234567890", buffer.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}

    @Test
    public void testAppendToCharBuffer() throws Exception {__CLR4_5_214f014f0lvha7ig2.R.globalSliceStart(getClass().getName(),53689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcarl015fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214f014f0lvha7ig2.R.rethrow($CLV_t2$);}finally{__CLR4_5_214f014f0lvha7ig2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAppendToCharBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcarl015fd() throws Exception{try{__CLR4_5_214f014f0lvha7ig2.R.inc(53689);
        __CLR4_5_214f014f0lvha7ig2.R.inc(53690);final StrBuilder sb = new StrBuilder("1234567890");
        __CLR4_5_214f014f0lvha7ig2.R.inc(53691);final String text = "Test ";
        __CLR4_5_214f014f0lvha7ig2.R.inc(53692);final CharBuffer buffer = CharBuffer.allocate(sb.size() + text.length());
        __CLR4_5_214f014f0lvha7ig2.R.inc(53693);buffer.put(text);

        __CLR4_5_214f014f0lvha7ig2.R.inc(53694);sb.appendTo(buffer);

        __CLR4_5_214f014f0lvha7ig2.R.inc(53695);buffer.flip();
        __CLR4_5_214f014f0lvha7ig2.R.inc(53696);assertEquals("Test 1234567890", buffer.toString());
    }finally{__CLR4_5_214f014f0lvha7ig2.R.flushNeeded();}}
}
