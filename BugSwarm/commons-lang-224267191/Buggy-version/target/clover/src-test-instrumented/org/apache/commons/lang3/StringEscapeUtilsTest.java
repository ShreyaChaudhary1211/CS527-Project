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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils}.
 */
@Deprecated
public class StringEscapeUtilsTest {static class __CLR4_5_2qa8qa8lvha7g9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,34387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String FOO = "foo";

    @Test
    public void testConstructor() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hqa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hqa8(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34064);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34065);assertNotNull(new StringEscapeUtils());
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34066);final Constructor<?>[] cons = StringEscapeUtils.class.getDeclaredConstructors();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34067);assertEquals(1, cons.length);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34068);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34069);assertTrue(Modifier.isPublic(StringEscapeUtils.class.getModifiers()));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34070);assertFalse(Modifier.isFinal(StringEscapeUtils.class.getModifiers()));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    @Test
    public void testEscapeJava() throws IOException {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28x1r0qaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeJava",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28x1r0qaf() throws IOException{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34071);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34072);assertEquals(null, StringEscapeUtils.escapeJava(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34073);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34074);StringEscapeUtils.ESCAPE_JAVA.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34075);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34076);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34077);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34078);StringEscapeUtils.ESCAPE_JAVA.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34079);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34080);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34081);assertEscapeJava("empty string", "", "");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34082);assertEscapeJava(FOO, FOO);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34083);assertEscapeJava("tab", "\\t", "\t");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34084);assertEscapeJava("backslash", "\\\\", "\\");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34085);assertEscapeJava("single quote should not be escaped", "'", "'");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34086);assertEscapeJava("\\\\\\b\\t\\r", "\\\b\t\r");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34087);assertEscapeJava("\\u1234", "\u1234");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34088);assertEscapeJava("\\u0234", "\u0234");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34089);assertEscapeJava("\\u00EF", "\u00ef");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34090);assertEscapeJava("\\u0001", "\u0001");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34091);assertEscapeJava("Should use capitalized Unicode hex", "\\uABCD", "\uabcd");

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34092);assertEscapeJava("He didn't say, \\\"stop!\\\"",
                "He didn't say, \"stop!\"");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34093);assertEscapeJava("non-breaking space", "This space is non-breaking:" + "\\u00A0",
                "This space is non-breaking:\u00a0");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34094);assertEscapeJava("\\uABCD\\u1234\\u012C",
                "\uabcd\u1234\u012c");
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-421
     */
    @Test
    public void testEscapeJavaWithSlash() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qgo489qb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeJavaWithSlash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qgo489qb3(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34095);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34096);final String input = "String with a slash (/) in it";

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34097);final String expected = input;
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34098);final String actual = StringEscapeUtils.escapeJava(input);

        /**
         * In 2.4 StringEscapeUtils.escapeJava(String) escapes '/' characters, which are not a valid character to escape
         * in a Java string.
         */
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34099);assertEquals(expected, actual);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    private void assertEscapeJava(final String escaped, final String original) throws IOException {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34100);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34101);assertEscapeJava(null, escaped, original);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    private void assertEscapeJava(String message, final String expected, final String original) throws IOException {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34102);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34103);final String converted = StringEscapeUtils.escapeJava(original);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34104);message = "escapeJava(String) failed" + ((((message == null )&&(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34105)!=0|true))||(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34106)==0&false))? "" : (": " + message));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34107);assertEquals(message, expected, converted);

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34108);final StringWriter writer = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34109);StringEscapeUtils.ESCAPE_JAVA.translate(original, writer);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34110);assertEquals(expected, writer.toString());
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeJava() throws IOException {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kavil1qbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeJava",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kavil1qbj() throws IOException{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34111);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34112);assertEquals(null, StringEscapeUtils.unescapeJava(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34113);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34114);StringEscapeUtils.UNESCAPE_JAVA.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34115);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34116);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34117);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34118);StringEscapeUtils.UNESCAPE_JAVA.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34119);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34120);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34121);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34122);StringEscapeUtils.unescapeJava("\\u02-3");
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34123);fail();
        } catch (final RuntimeException ex) {
        }
        
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34124);assertUnescapeJava("", "");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34125);assertUnescapeJava("test", "test");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34126);assertUnescapeJava("\ntest\b", "\\ntest\\b");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34127);assertUnescapeJava("\u123425foo\ntest\b", "\\u123425foo\\ntest\\b");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34128);assertUnescapeJava("'\foo\teste\r", "\\'\\foo\\teste\\r");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34129);assertUnescapeJava("", "\\");
        //foo
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34130);assertUnescapeJava("lowercase Unicode", "\uabcdx", "\\uabcdx");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34131);assertUnescapeJava("uppercase Unicode", "\uabcdx", "\\uABCDx");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34132);assertUnescapeJava("Unicode as final character", "\uabcd", "\\uabcd");
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    private void assertUnescapeJava(final String unescaped, final String original) throws IOException {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34133);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34134);assertUnescapeJava(null, unescaped, original);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    private void assertUnescapeJava(final String message, final String unescaped, final String original) throws IOException {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34135);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34136);final String expected = unescaped;
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34137);final String actual = StringEscapeUtils.unescapeJava(original);

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34138);assertEquals("unescape(String) failed" +
                ((((message == null )&&(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34139)!=0|true))||(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34140)==0&false))? "" : (": " + message)) +
                ": expected '" + StringEscapeUtils.escapeJava(expected) +
                // we escape this so we can see it in the error message
                "' actual '" + StringEscapeUtils.escapeJava(actual) + "'",
                expected, actual);

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34141);final StringWriter writer = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34142);StringEscapeUtils.UNESCAPE_JAVA.translate(original, writer);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34143);assertEquals(unescaped, writer.toString());

    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeEcmaScript() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x8dj0pqcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeEcmaScript",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x8dj0pqcg(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34144);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34145);assertEquals(null, StringEscapeUtils.escapeEcmaScript(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34146);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34147);StringEscapeUtils.ESCAPE_ECMASCRIPT.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34148);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34149);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34150);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34151);StringEscapeUtils.ESCAPE_ECMASCRIPT.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34152);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34153);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34154);assertEquals("He didn\\'t say, \\\"stop!\\\"", StringEscapeUtils.escapeEcmaScript("He didn't say, \"stop!\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34155);assertEquals("document.getElementById(\\\"test\\\").value = \\'<script>alert(\\'aaa\\');<\\/script>\\';", 
                StringEscapeUtils.escapeEcmaScript("document.getElementById(\"test\").value = '<script>alert('aaa');</script>';"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeEcmaScript() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25m7nu8qcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeEcmaScript",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25m7nu8qcs(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34156);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34157);assertEquals(null, StringEscapeUtils.escapeEcmaScript(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34158);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34159);StringEscapeUtils.UNESCAPE_ECMASCRIPT.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34160);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34161);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34162);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34163);StringEscapeUtils.UNESCAPE_ECMASCRIPT.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34164);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34165);fail();
        } catch (final IllegalArgumentException ex) {
        }

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34166);assertEquals("He didn't say, \"stop!\"", StringEscapeUtils.unescapeEcmaScript("He didn\\'t say, \\\"stop!\\\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34167);assertEquals("document.getElementById(\"test\").value = '<script>alert('aaa');</script>';",
                StringEscapeUtils.unescapeEcmaScript("document.getElementById(\\\"test\\\").value = \\'<script>alert(\\'aaa\\');<\\/script>\\';"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}


    // HTML and XML
    //--------------------------------------------------------------

    private static final String[][] HTML_ESCAPES = {
        {"no escaping", "plain text", "plain text"},
        {"no escaping", "plain text", "plain text"},
        {"empty string", "", ""},
        {"null", null, null},
        {"ampersand", "bread &amp; butter", "bread & butter"},
        {"quotes", "&quot;bread&quot; &amp; butter", "\"bread\" & butter"},
        {"final character only", "greater than &gt;", "greater than >"},
        {"first character only", "&lt; less than", "< less than"},
        {"apostrophe", "Huntington's chorea", "Huntington's chorea"},
        {"languages", "English,Fran&ccedil;ais,\u65e5\u672c\u8a9e (nihongo)", "English,Fran\u00e7ais,\u65e5\u672c\u8a9e (nihongo)"},
        {"8-bit ascii shouldn't number-escape", "\u0080\u009f", "\u0080\u009f"},
    };

    @Test
    public void testEscapeHtml() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e2cn9qd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeHtml",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e2cn9qd4(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34168);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34169);for (final String[] element : HTML_ESCAPES) {{
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34170);final String message = element[0];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34171);final String expected = element[1];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34172);final String original = element[2];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34173);assertEquals(message, expected, StringEscapeUtils.escapeHtml4(original));
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34174);final StringWriter sw = new StringWriter();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34175);try {
                __CLR4_5_2qa8qa8lvha7g9d.R.inc(34176);StringEscapeUtils.ESCAPE_HTML4.translate(original, sw);
            } catch (final IOException e) {
            }
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34177);final String actual = (((original == null )&&(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34178)!=0|true))||(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34179)==0&false))? null : sw.toString();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34180);assertEquals(message, expected, actual);
        }
    }}finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeHtml4() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ys10boqdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeHtml4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ys10boqdh(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34181);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34182);for (final String[] element : HTML_ESCAPES) {{
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34183);final String message = element[0];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34184);final String expected = element[2];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34185);final String original = element[1];
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34186);assertEquals(message, expected, StringEscapeUtils.unescapeHtml4(original));
            
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34187);final StringWriter sw = new StringWriter();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34188);try {
                __CLR4_5_2qa8qa8lvha7g9d.R.inc(34189);StringEscapeUtils.UNESCAPE_HTML4.translate(original, sw);
            } catch (final IOException e) {
            }
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34190);final String actual = (((original == null )&&(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34191)!=0|true))||(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34192)==0&false))? null : sw.toString();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34193);assertEquals(message, expected, actual);
        }
        // \u00e7 is a cedilla (c with wiggle under)
        // note that the test string must be 7-bit-clean (Unicode escaped) or else it will compile incorrectly
        // on some locales        
        }__CLR4_5_2qa8qa8lvha7g9d.R.inc(34194);assertEquals("funny chars pass through OK", "Fran\u00e7ais", StringEscapeUtils.unescapeHtml4("Fran\u00e7ais"));
        
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34195);assertEquals("Hello&;World", StringEscapeUtils.unescapeHtml4("Hello&;World"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34196);assertEquals("Hello&#;World", StringEscapeUtils.unescapeHtml4("Hello&#;World"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34197);assertEquals("Hello&# ;World", StringEscapeUtils.unescapeHtml4("Hello&# ;World"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34198);assertEquals("Hello&##;World", StringEscapeUtils.unescapeHtml4("Hello&##;World"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeHexCharsHtml() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcmug0qdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeHexCharsHtml",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcmug0qdz(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34199);
        // Simple easy to grok test 
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34200);assertEquals("hex number unescape", "\u0080\u009f", StringEscapeUtils.unescapeHtml4("&#x80;&#x9F;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34201);assertEquals("hex number unescape", "\u0080\u009f", StringEscapeUtils.unescapeHtml4("&#X80;&#X9F;"));
        // Test all Character values:
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34202);for (char i = Character.MIN_VALUE; (((i < Character.MAX_VALUE)&&(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34203)!=0|true))||(__CLR4_5_2qa8qa8lvha7g9d.R.iget(34204)==0&false)); i++) {{
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34205);final Character c1 = new Character(i);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34206);final Character c2 = new Character((char)(i+1));
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34207);final String expected = c1.toString() + c2.toString();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34208);final String escapedC1 = "&#x" + Integer.toHexString((c1.charValue())) + ";";
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34209);final String escapedC2 = "&#x" + Integer.toHexString((c2.charValue())) + ";";
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34210);assertEquals("hex number unescape index " + (int)i, expected, StringEscapeUtils.unescapeHtml4(escapedC1 + escapedC2));
        }
    }}finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeUnknownEntity() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fl469kqeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeUnknownEntity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fl469kqeb() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34211);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34212);assertEquals("&zzzz;", StringEscapeUtils.unescapeHtml4("&zzzz;"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeHtmlVersions() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qxxr4qed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeHtmlVersions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qxxr4qed() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34213);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34214);assertEquals("&Beta;", StringEscapeUtils.escapeHtml4("\u0392"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34215);assertEquals("\u0392", StringEscapeUtils.unescapeHtml4("&Beta;"));

        // TODO: refine API for escaping/unescaping specific HTML versions
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeXml() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z55hw5qeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeXml",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z55hw5qeg() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34216);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34217);assertEquals("&lt;abc&gt;", StringEscapeUtils.escapeXml("<abc>"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34218);assertEquals("<abc>", StringEscapeUtils.unescapeXml("&lt;abc&gt;"));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34219);assertEquals("XML should not escape >0x7f values",
                "\u00a1", StringEscapeUtils.escapeXml("\u00a1"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34220);assertEquals("XML should be able to unescape >0x7f values",
                "\u00a0", StringEscapeUtils.unescapeXml("&#160;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34221);assertEquals("XML should be able to unescape >0x7f values with one leading 0",
                "\u00a0", StringEscapeUtils.unescapeXml("&#0160;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34222);assertEquals("XML should be able to unescape >0x7f values with two leading 0s",
                "\u00a0", StringEscapeUtils.unescapeXml("&#00160;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34223);assertEquals("XML should be able to unescape >0x7f values with three leading 0s",
                "\u00a0", StringEscapeUtils.unescapeXml("&#000160;"));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34224);assertEquals("ain't", StringEscapeUtils.unescapeXml("ain&apos;t"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34225);assertEquals("ain&apos;t", StringEscapeUtils.escapeXml("ain't"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34226);assertEquals("", StringEscapeUtils.escapeXml(""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34227);assertEquals(null, StringEscapeUtils.escapeXml(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34228);assertEquals(null, StringEscapeUtils.unescapeXml(null));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34229);StringWriter sw = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34230);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34231);StringEscapeUtils.ESCAPE_XML.translate("<abc>", sw);
        } catch (final IOException e) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34232);assertEquals("XML was escaped incorrectly", "&lt;abc&gt;", sw.toString() );

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34233);sw = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34234);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34235);StringEscapeUtils.UNESCAPE_XML.translate("&lt;abc&gt;", sw);
        } catch (final IOException e) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34236);assertEquals("XML was unescaped incorrectly", "<abc>", sw.toString() );
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    @Test
    public void testEscapeXml10() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnb9eyqf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeXml10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnb9eyqf1() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34237);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34238);assertEquals("a&lt;b&gt;c&quot;d&apos;e&amp;f", StringEscapeUtils.escapeXml10("a<b>c\"d'e&f"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34239);assertEquals("XML 1.0 should not escape \t \n \r",
                "a\tb\rc\nd", StringEscapeUtils.escapeXml10("a\tb\rc\nd"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34240);assertEquals("XML 1.0 should omit most #x0-x8 | #xb | #xc | #xe-#x19",
                "ab", StringEscapeUtils.escapeXml10("a\u0000\u0001b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34241);assertEquals("XML 1.0 should omit #xd800-#xdfff",
                "a\ud7ff  \ue000b", StringEscapeUtils.escapeXml10("a\ud7ff\ud800 \udfff \ue000b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34242);assertEquals("XML 1.0 should omit #xfffe | #xffff",
                "a\ufffdb", StringEscapeUtils.escapeXml10("a\ufffd\ufffe\uffffb"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34243);assertEquals("XML 1.0 should escape #x7f-#x84 | #x86 - #x9f, for XML 1.1 compatibility",
                "a~&#127;&#132;\u0085&#134;&#159;\u00a0b", StringEscapeUtils.escapeXml10("a~\u0084\u0085\u0086\u009f\u00a0b"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    @Test
    public void testEscapeXml11() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owb87fqf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeXml11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owb87fqf8() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34244);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34245);assertEquals("a&lt;b&gt;c&quot;d&apos;e&amp;f", StringEscapeUtils.escapeXml11("a<b>c\"d'e&f"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34246);assertEquals("XML 1.1 should not escape \t \n \r",
                "a\tb\rc\nd", StringEscapeUtils.escapeXml11("a\tb\rc\nd"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34247);assertEquals("XML 1.1 should omit #x0",
                "ab", StringEscapeUtils.escapeXml11("a\u0000b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34248);assertEquals("XML 1.1 should escape #x1-x8 | #xb | #xc | #xe-#x19",
                "a&#1;&#8;&#11;&#12;&#14;&#31;b", StringEscapeUtils.escapeXml11("a\u0001b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34249);assertEquals("XML 1.1 should escape #x7F-#x84 | #x86-#x9F",
                "a~&#127;&#132;\u0085&#134;&#159;\u00a0b", StringEscapeUtils.escapeXml11("a~\u0084\u0085\u0086\u009f\u00a0b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34250);assertEquals("XML 1.1 should omit #xd800-#xdfff",
                "a\ud7ff  \ue000b", StringEscapeUtils.escapeXml11("a\ud7ff\ud800 \udfff \ue000b"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34251);assertEquals("XML 1.1 should omit #xfffe | #xffff",
                "a\ufffdb", StringEscapeUtils.escapeXml11("a\ufffd\ufffe\uffffb"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests Supplementary characters. 
     * <p>
     * From http://www.w3.org/International/questions/qa-escapes
     * </p>
     * <blockquote>
     * Supplementary characters are those Unicode characters that have code points higher than the characters in
     * the Basic Multilingual Plane (BMP). In UTF-16 a supplementary character is encoded using two 16-bit surrogate code points from the
     * BMP. Because of this, some people think that supplementary characters need to be represented using two escapes, but this is incorrect
     * - you must use the single, code point value for that character. For example, use &amp;&#35;x233B4&#59; rather than
     * &amp;&#35;xD84C&#59;&amp;&#35;xDFB4&#59;.
     * </blockquote>
     * @see <a href="http://www.w3.org/International/questions/qa-escapes">Using character escapes in markup and CSS</a>
     * @see <a href="https://issues.apache.org/jira/browse/LANG-728">LANG-728</a>
     */
    @Test
    public void testEscapeXmlSupplementaryCharacters() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29c2pokqfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeXmlSupplementaryCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29c2pokqfg(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34252);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34253);final CharSequenceTranslator escapeXml = 
            StringEscapeUtils.ESCAPE_XML.with( NumericEntityEscaper.between(0x7f, Integer.MAX_VALUE) );

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34254);assertEquals("Supplementary character must be represented using a single escape", "&#144308;",
                escapeXml.translate("\ud84c\udfb4"));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34255);assertEquals("Supplementary characters mixed with basic characters should be encoded correctly", "a b c &#144308;",
                        escapeXml.translate("a b c \ud84c\udfb4"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    @Test
    public void testEscapeXmlAllCharacters() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eyvlbmqfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeXmlAllCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eyvlbmqfk(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34256);
        // http://www.w3.org/TR/xml/#charsets says:
        // Char ::= #x9 | #xA | #xD | [#x20-#xD7FF] | [#xE000-#xFFFD] | [#x10000-#x10FFFF] /* any Unicode character,
        // excluding the surrogate blocks, FFFE, and FFFF. */
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34257);final CharSequenceTranslator escapeXml = StringEscapeUtils.ESCAPE_XML
                .with(NumericEntityEscaper.below(9), NumericEntityEscaper.between(0xB, 0xC), NumericEntityEscaper.between(0xE, 0x19),
                        NumericEntityEscaper.between(0xD800, 0xDFFF), NumericEntityEscaper.between(0xFFFE, 0xFFFF), NumericEntityEscaper.above(0x110000));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34258);assertEquals("&#0;&#1;&#2;&#3;&#4;&#5;&#6;&#7;&#8;", escapeXml.translate("\u0000\u0001\u0002"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34259);assertEquals("\t", escapeXml.translate("\t")); // 0x9
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34260);assertEquals("\n", escapeXml.translate("\n")); // 0xA
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34261);assertEquals("&#11;&#12;", escapeXml.translate(""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34262);assertEquals("\r", escapeXml.translate("\r")); // 0xD
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34263);assertEquals("Hello World! Ain&apos;t this great?", escapeXml.translate("Hello World! Ain't this great?"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34264);assertEquals("&#14;&#15;&#24;&#25;", escapeXml.translate(""));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
    
    /**
     * Reverse of the above.
     *
     * @see <a href="https://issues.apache.org/jira/browse/LANG-729">LANG-729</a>
     */
    @Test
    public void testUnescapeXmlSupplementaryCharacters() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27o0kfpqft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeXmlSupplementaryCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27o0kfpqft(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34265);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34266);assertEquals("Supplementary character must be represented using a single escape", "\ud84c\udfb4",
                StringEscapeUtils.unescapeXml("&#144308;") );

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34267);assertEquals("Supplementary characters mixed with basic characters should be decoded correctly", "a b c \ud84c\udfb4",
                StringEscapeUtils.unescapeXml("a b c &#144308;") );
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
        
    // Tests issue #38569
    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38569
    @Test
    public void testStandaloneAmphersand() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cj111pqfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testStandaloneAmphersand",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cj111pqfw(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34268);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34269);assertEquals("<P&O>", StringEscapeUtils.unescapeHtml4("&lt;P&O&gt;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34270);assertEquals("test & <", StringEscapeUtils.unescapeHtml4("test & &lt;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34271);assertEquals("<P&O>", StringEscapeUtils.unescapeXml("&lt;P&O&gt;"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34272);assertEquals("test & <", StringEscapeUtils.unescapeXml("test & &lt;"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testLang313() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ywk410qg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testLang313",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ywk410qg1(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34273);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34274);assertEquals("& &", StringEscapeUtils.unescapeHtml4("& &amp;"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeCsvString() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2unxm2zqg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeCsvString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2unxm2zqg3() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34275);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34276);assertEquals("foo.bar",            StringEscapeUtils.escapeCsv("foo.bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34277);assertEquals("\"foo,bar\"",        StringEscapeUtils.escapeCsv("foo,bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34278);assertEquals("\"foo\nbar\"",       StringEscapeUtils.escapeCsv("foo\nbar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34279);assertEquals("\"foo\rbar\"",       StringEscapeUtils.escapeCsv("foo\rbar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34280);assertEquals("\"foo\"\"bar\"",     StringEscapeUtils.escapeCsv("foo\"bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34281);assertEquals("foo\ud84c\udfb4bar", StringEscapeUtils.escapeCsv("foo\ud84c\udfb4bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34282);assertEquals("",   StringEscapeUtils.escapeCsv(""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34283);assertEquals(null, StringEscapeUtils.escapeCsv(null));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeCsvWriter() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ti01cjqgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeCsvWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ti01cjqgc() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34284);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34285);checkCsvEscapeWriter("foo.bar",            "foo.bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34286);checkCsvEscapeWriter("\"foo,bar\"",        "foo,bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34287);checkCsvEscapeWriter("\"foo\nbar\"",       "foo\nbar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34288);checkCsvEscapeWriter("\"foo\rbar\"",       "foo\rbar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34289);checkCsvEscapeWriter("\"foo\"\"bar\"",     "foo\"bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34290);checkCsvEscapeWriter("foo\ud84c\udfb4bar", "foo\ud84c\udfb4bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34291);checkCsvEscapeWriter("", null);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34292);checkCsvEscapeWriter("", "");
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    private void checkCsvEscapeWriter(final String expected, final String value) {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34293);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34294);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34295);final StringWriter writer = new StringWriter();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34296);StringEscapeUtils.ESCAPE_CSV.translate(value, writer);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34297);assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34298);fail("Threw: " + e);
        }
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test(expected = IllegalStateException.class)
    public void testEscapeCsvIllegalStateException() throws IOException {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ugpxewqgr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,115,99,97,112,101,67,115,118,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeCsvIllegalStateException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34299,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ugpxewqgr() throws IOException{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34299);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34300);final StringWriter writer = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34301);StringEscapeUtils.ESCAPE_CSV.translate("foo", -1, writer);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeCsvString() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fvmxgyqgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeCsvString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fvmxgyqgu() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34302);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34303);assertEquals("foo.bar",              StringEscapeUtils.unescapeCsv("foo.bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34304);assertEquals("foo,bar",              StringEscapeUtils.unescapeCsv("\"foo,bar\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34305);assertEquals("foo\nbar",             StringEscapeUtils.unescapeCsv("\"foo\nbar\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34306);assertEquals("foo\rbar",             StringEscapeUtils.unescapeCsv("\"foo\rbar\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34307);assertEquals("foo\"bar",             StringEscapeUtils.unescapeCsv("\"foo\"\"bar\""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34308);assertEquals("foo\ud84c\udfb4bar",   StringEscapeUtils.unescapeCsv("foo\ud84c\udfb4bar"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34309);assertEquals("",   StringEscapeUtils.unescapeCsv(""));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34310);assertEquals(null, StringEscapeUtils.unescapeCsv(null));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34311);assertEquals("\"foo.bar\"",          StringEscapeUtils.unescapeCsv("\"foo.bar\""));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeCsvWriter() throws Exception {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqtc0kqh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeCsvWriter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqtc0kqh4() throws Exception{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34312);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34313);checkCsvUnescapeWriter("foo.bar",            "foo.bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34314);checkCsvUnescapeWriter("foo,bar",            "\"foo,bar\"");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34315);checkCsvUnescapeWriter("foo\nbar",           "\"foo\nbar\"");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34316);checkCsvUnescapeWriter("foo\rbar",           "\"foo\rbar\"");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34317);checkCsvUnescapeWriter("foo\"bar",           "\"foo\"\"bar\"");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34318);checkCsvUnescapeWriter("foo\ud84c\udfb4bar", "foo\ud84c\udfb4bar");
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34319);checkCsvUnescapeWriter("", null);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34320);checkCsvUnescapeWriter("", "");

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34321);checkCsvUnescapeWriter("\"foo.bar\"",        "\"foo.bar\"");
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    private void checkCsvUnescapeWriter(final String expected, final String value) {try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34322);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34323);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34324);final StringWriter writer = new StringWriter();
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34325);StringEscapeUtils.UNESCAPE_CSV.translate(value, writer);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34326);assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34327);fail("Threw: " + e);
        }
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test(expected = IllegalStateException.class)
        public void testUnescapeCsvIllegalStateException() throws IOException {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mkn4blqhk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,101,115,99,97,112,101,67,115,118,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeCsvIllegalStateException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mkn4blqhk() throws IOException{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34328);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34329);final StringWriter writer = new StringWriter();
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34330);StringEscapeUtils.UNESCAPE_CSV.translate("foo", -1, writer);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests // https://issues.apache.org/jira/browse/LANG-480
     */
    @Test
    public void testEscapeHtmlHighUnicode() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24k64ikqhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeHtmlHighUnicode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24k64ikqhn(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34331);
        // this is the utf8 representation of the character:
        // COUNTING ROD UNIT DIGIT THREE
        // in Unicode
        // codepoint: U+1D362
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34332);final byte[] data = new byte[] { (byte)0xF0, (byte)0x9D, (byte)0x8D, (byte)0xA2 };

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34333);final String original = new String(data, Charset.forName("UTF8"));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34334);final String escaped = StringEscapeUtils.escapeHtml4( original );
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34335);assertEquals( "High Unicode should not have been escaped", original, escaped);

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34336);final String unescaped = StringEscapeUtils.unescapeHtml4( escaped );
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34337);assertEquals( "High Unicode should have been unchanged", original, unescaped);

// TODO: I think this should hold, needs further investigation
//        String unescapedFromEntity = StringEscapeUtils.unescapeHtml4( "&#119650;" );
//        assertEquals( "High Unicode should have been unescaped", original, unescapedFromEntity);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-339
     */
    @Test
    public void testEscapeHiragana() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26z83rrqhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeHiragana",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26z83rrqhu(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34338);
        // Some random Japanese Unicode characters
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34339);final String original = "\u304b\u304c\u3068";
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34340);final String escaped = StringEscapeUtils.escapeHtml4(original);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34341);assertEquals( "Hiragana character Unicode behaviour should not be being escaped by escapeHtml4",
        original, escaped);

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34342);final String unescaped = StringEscapeUtils.unescapeHtml4( escaped );

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34343);assertEquals( "Hiragana character Unicode behaviour has changed - expected no unescaping", escaped, unescaped);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-708
     * 
     * @throws IOException
     *             if an I/O error occurs
     */
    @Test
    public void testLang708() throws IOException {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4a3wmqi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testLang708",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4a3wmqi0() throws IOException{try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34344);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34345);final byte[] inputBytes = Files.readAllBytes(Paths.get("src/test/resources/lang-708-input.txt"));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34346);final String input = new String(inputBytes, StandardCharsets.UTF_8);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34347);final String escaped = StringEscapeUtils.escapeEcmaScript(input);
        // just the end:
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34348);assertTrue(escaped, escaped.endsWith("}]"));
        // a little more:
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34349);assertTrue(escaped, escaped.endsWith("\"valueCode\\\":\\\"\\\"}]"));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-720
     */
    @Test
    public void testLang720() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nh3vb8qi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testLang720",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nh3vb8qi6(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34350);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34351);final String input = "\ud842\udfb7" + "A";
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34352);final String escaped = StringEscapeUtils.escapeXml(input);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34353);assertEquals(input, escaped);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-911
     */
    @Test
    public void testLang911() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gtfv6oqia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testLang911",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gtfv6oqia(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34354);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34355);final String bellsTest = "\ud83d\udc80\ud83d\udd14";
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34356);final String value = StringEscapeUtils.escapeJava(bellsTest);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34357);final String valueTest = StringEscapeUtils.unescapeJava(value);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34358);assertEquals(bellsTest, valueTest);
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testEscapeJson() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294w0maqif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testEscapeJson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294w0maqif(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34359);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34360);assertEquals(null, StringEscapeUtils.escapeJson(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34361);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34362);StringEscapeUtils.ESCAPE_JSON.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34363);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34364);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34365);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34366);StringEscapeUtils.ESCAPE_JSON.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34367);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34368);fail();
        } catch (final IllegalArgumentException ex) {
        }

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34369);assertEquals("He didn't say, \\\"stop!\\\"", StringEscapeUtils.escapeJson("He didn't say, \"stop!\""));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34370);final String expected = "\\\"foo\\\" isn't \\\"bar\\\". specials: \\b\\r\\n\\f\\t\\\\\\/";
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34371);final String input ="\"foo\" isn't \"bar\". specials: \b\r\n\f\t\\/";

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34372);assertEquals(expected, StringEscapeUtils.escapeJson(input));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}

    @Test
    public void testUnescapeJson() {__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceStart(getClass().getName(),34373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t6uhgbqit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qa8qa8lvha7g9d.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qa8qa8lvha7g9d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringEscapeUtilsTest.testUnescapeJson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t6uhgbqit(){try{__CLR4_5_2qa8qa8lvha7g9d.R.inc(34373);
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34374);assertEquals(null, StringEscapeUtils.unescapeJson(null));
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34375);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34376);StringEscapeUtils.UNESCAPE_JSON.translate(null, null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34377);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34378);fail();
        } catch (final IllegalArgumentException ex) {
        }
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34379);try {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34380);StringEscapeUtils.UNESCAPE_JSON.translate("", null);
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34381);fail();
        } catch (final IOException ex) {
            __CLR4_5_2qa8qa8lvha7g9d.R.inc(34382);fail();
        } catch (final IllegalArgumentException ex) {
        }

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34383);assertEquals("He didn't say, \"stop!\"", StringEscapeUtils.unescapeJson("He didn't say, \\\"stop!\\\""));

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34384);final String expected ="\"foo\" isn't \"bar\". specials: \b\r\n\f\t\\/";
        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34385);final String input = "\\\"foo\\\" isn't \\\"bar\\\". specials: \\b\\r\\n\\f\\t\\\\\\/";

        __CLR4_5_2qa8qa8lvha7g9d.R.inc(34386);assertEquals(expected, StringEscapeUtils.unescapeJson(input));
    }finally{__CLR4_5_2qa8qa8lvha7g9d.R.flushNeeded();}}
}
