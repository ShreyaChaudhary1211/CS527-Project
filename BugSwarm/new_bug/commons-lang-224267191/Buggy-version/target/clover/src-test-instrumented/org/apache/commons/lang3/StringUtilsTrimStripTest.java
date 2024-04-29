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
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Trim/Strip methods
 */
public class StringUtilsTrimStripTest  {static class __CLR4_5_2t6ot6olvha7gp2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,37960,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";

    @Test
    public void testTrim() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bl47fft6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testTrim",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bl47fft6o(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37824);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37825);assertEquals(FOO, StringUtils.trim(FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37826);assertEquals(FOO, StringUtils.trim(" " + FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37827);assertEquals(FOO, StringUtils.trim(" " + FOO));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37828);assertEquals(FOO, StringUtils.trim(FOO + ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37829);assertEquals("", StringUtils.trim(" \t\r\n\b "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37830);assertEquals("", StringUtils.trim(StringUtilsTest.TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37831);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trim(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37832);assertEquals("", StringUtils.trim(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37833);assertEquals(null, StringUtils.trim(null));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}

    @Test
    public void testTrimToNull() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzqrktt6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testTrimToNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzqrktt6y(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37834);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37835);assertEquals(FOO, StringUtils.trimToNull(FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37836);assertEquals(FOO, StringUtils.trimToNull(" " + FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37837);assertEquals(FOO, StringUtils.trimToNull(" " + FOO));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37838);assertEquals(FOO, StringUtils.trimToNull(FOO + ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37839);assertEquals(null, StringUtils.trimToNull(" \t\r\n\b "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37840);assertEquals(null, StringUtils.trimToNull(StringUtilsTest.TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37841);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trimToNull(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37842);assertEquals(null, StringUtils.trimToNull(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37843);assertEquals(null, StringUtils.trimToNull(null));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}

    @Test
    public void testTrimToEmpty() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1zbfpt78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testTrimToEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1zbfpt78(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37844);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37845);assertEquals(FOO, StringUtils.trimToEmpty(FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37846);assertEquals(FOO, StringUtils.trimToEmpty(" " + FOO + "  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37847);assertEquals(FOO, StringUtils.trimToEmpty(" " + FOO));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37848);assertEquals(FOO, StringUtils.trimToEmpty(FOO + ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37849);assertEquals("", StringUtils.trimToEmpty(" \t\r\n\b "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37850);assertEquals("", StringUtils.trimToEmpty(StringUtilsTest.TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37851);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trimToEmpty(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37852);assertEquals("", StringUtils.trimToEmpty(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37853);assertEquals("", StringUtils.trimToEmpty(null));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStrip_String() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fnarcht7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStrip_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fnarcht7i(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37854);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37855);assertEquals(null, StringUtils.strip(null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37856);assertEquals("", StringUtils.strip(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37857);assertEquals("", StringUtils.strip("        "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37858);assertEquals("abc", StringUtils.strip("  abc  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37859);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.strip(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
    
    @Test
    public void testStripToNull_String() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kfzpe9t7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripToNull_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kfzpe9t7o(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37860);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37861);assertEquals(null, StringUtils.stripToNull(null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37862);assertEquals(null, StringUtils.stripToNull(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37863);assertEquals(null, StringUtils.stripToNull("        "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37864);assertEquals(null, StringUtils.stripToNull(StringUtilsTest.WHITESPACE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37865);assertEquals("ab c", StringUtils.stripToNull("  ab c  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37866);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripToNull(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
    
    @Test
    public void testStripToEmpty_String() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ciz6obt7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripToEmpty_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ciz6obt7v(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37867);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37868);assertEquals("", StringUtils.stripToEmpty(null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37869);assertEquals("", StringUtils.stripToEmpty(""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37870);assertEquals("", StringUtils.stripToEmpty("        "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37871);assertEquals("", StringUtils.stripToEmpty(StringUtilsTest.WHITESPACE));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37872);assertEquals("ab c", StringUtils.stripToEmpty("  ab c  "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37873);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripToEmpty(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
    
    @Test
    public void testStrip_StringString() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22qw5mmt82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStrip_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22qw5mmt82(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37874);
        // null strip
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37875);assertEquals(null, StringUtils.strip(null, null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37876);assertEquals("", StringUtils.strip("", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37877);assertEquals("", StringUtils.strip("        ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37878);assertEquals("abc", StringUtils.strip("  abc  ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37879);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.strip(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" strip
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37880);assertEquals(null, StringUtils.strip(null, ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37881);assertEquals("", StringUtils.strip("", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37882);assertEquals("        ", StringUtils.strip("        ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37883);assertEquals("  abc  ", StringUtils.strip("  abc  ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37884);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.strip(StringUtilsTest.WHITESPACE, ""));
        
        // " " strip
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37885);assertEquals(null, StringUtils.strip(null, " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37886);assertEquals("", StringUtils.strip("", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37887);assertEquals("", StringUtils.strip("        ", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37888);assertEquals("abc", StringUtils.strip("  abc  ", " "));
        
        // "ab" strip
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37889);assertEquals(null, StringUtils.strip(null, "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37890);assertEquals("", StringUtils.strip("", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37891);assertEquals("        ", StringUtils.strip("        ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37892);assertEquals("  abc  ", StringUtils.strip("  abc  ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37893);assertEquals("c", StringUtils.strip("abcabab", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37894);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.strip(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
    
    @Test
    public void testStripStart_StringString() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ck5o3wt8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripStart_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ck5o3wt8n(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37895);
        // null stripStart
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37896);assertEquals(null, StringUtils.stripStart(null, null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37897);assertEquals("", StringUtils.stripStart("", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37898);assertEquals("", StringUtils.stripStart("        ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37899);assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37900);assertEquals(StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, 
            StringUtils.stripStart(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" stripStart
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37901);assertEquals(null, StringUtils.stripStart(null, ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37902);assertEquals("", StringUtils.stripStart("", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37903);assertEquals("        ", StringUtils.stripStart("        ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37904);assertEquals("  abc  ", StringUtils.stripStart("  abc  ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37905);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripStart(StringUtilsTest.WHITESPACE, ""));
        
        // " " stripStart
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37906);assertEquals(null, StringUtils.stripStart(null, " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37907);assertEquals("", StringUtils.stripStart("", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37908);assertEquals("", StringUtils.stripStart("        ", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37909);assertEquals("abc  ", StringUtils.stripStart("  abc  ", " "));
        
        // "ab" stripStart
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37910);assertEquals(null, StringUtils.stripStart(null, "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37911);assertEquals("", StringUtils.stripStart("", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37912);assertEquals("        ", StringUtils.stripStart("        ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37913);assertEquals("  abc  ", StringUtils.stripStart("  abc  ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37914);assertEquals("cabab", StringUtils.stripStart("abcabab", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37915);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripStart(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
    
    @Test
    public void testStripEnd_StringString() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273n0urt98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripEnd_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273n0urt98(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37916);
        // null stripEnd
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37917);assertEquals(null, StringUtils.stripEnd(null, null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37918);assertEquals("", StringUtils.stripEnd("", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37919);assertEquals("", StringUtils.stripEnd("        ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37920);assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37921);assertEquals(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripEnd(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" stripEnd
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37922);assertEquals(null, StringUtils.stripEnd(null, ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37923);assertEquals("", StringUtils.stripEnd("", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37924);assertEquals("        ", StringUtils.stripEnd("        ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37925);assertEquals("  abc  ", StringUtils.stripEnd("  abc  ", ""));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37926);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripEnd(StringUtilsTest.WHITESPACE, ""));
        
        // " " stripEnd
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37927);assertEquals(null, StringUtils.stripEnd(null, " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37928);assertEquals("", StringUtils.stripEnd("", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37929);assertEquals("", StringUtils.stripEnd("        ", " "));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37930);assertEquals("  abc", StringUtils.stripEnd("  abc  ", " "));
        
        // "ab" stripEnd
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37931);assertEquals(null, StringUtils.stripEnd(null, "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37932);assertEquals("", StringUtils.stripEnd("", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37933);assertEquals("        ", StringUtils.stripEnd("        ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37934);assertEquals("  abc  ", StringUtils.stripEnd("  abc  ", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37935);assertEquals("abc", StringUtils.stripEnd("abcabab", "ab"));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37936);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripEnd(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}

    @Test
    public void testStripAll() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcgc8yt9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripAll",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcgc8yt9t(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37937);
        // test stripAll method, merely an array version of the above strip
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37938);final String[] empty = new String[0];
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37939);final String[] fooSpace = new String[] { "  "+FOO+"  ", "  "+FOO, FOO+"  " };
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37940);final String[] fooDots = new String[] { ".."+FOO+"..", ".."+FOO, FOO+".." };
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37941);final String[] foo = new String[] { FOO, FOO, FOO };

        __CLR4_5_2t6ot6olvha7gp2.R.inc(37942);assertNull(StringUtils.stripAll((String[]) null));
        // Additional varargs tests
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37943);assertArrayEquals(empty, StringUtils.stripAll()); // empty array
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37944);assertArrayEquals(new String[]{null}, StringUtils.stripAll((String) null)); // == new String[]{null}

        __CLR4_5_2t6ot6olvha7gp2.R.inc(37945);assertArrayEquals(empty, StringUtils.stripAll(empty));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37946);assertArrayEquals(foo, StringUtils.stripAll(fooSpace));
        
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37947);assertNull(StringUtils.stripAll(null, null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37948);assertArrayEquals(foo, StringUtils.stripAll(fooSpace, null));
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37949);assertArrayEquals(foo, StringUtils.stripAll(fooDots, "."));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}

    @Test
    public void testStripAccents() {__CLR4_5_2t6ot6olvha7gp2.R.globalSliceStart(getClass().getName(),37950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_244nwayta6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2t6ot6olvha7gp2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2t6ot6olvha7gp2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimStripTest.testStripAccents",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_244nwayta6(){try{__CLR4_5_2t6ot6olvha7gp2.R.inc(37950);
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37951);final String cue = "\u00c7\u00fa\u00ea";
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37952);assertEquals( "Failed to strip accents from " + cue, "Cue", StringUtils.stripAccents(cue));

        __CLR4_5_2t6ot6olvha7gp2.R.inc(37953);final String lots = "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c7\u00c8\u00c9" + 
                      "\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf\u00d1\u00d2\u00d3" + 
                      "\u00d4\u00d5\u00d6\u00d9\u00da\u00db\u00dc\u00dd";
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37954);assertEquals( "Failed to strip accents from " + lots, 
                      "AAAAAACEEEEIIIINOOOOOUUUUY", 
                      StringUtils.stripAccents(lots));

        __CLR4_5_2t6ot6olvha7gp2.R.inc(37955);assertNull( "Failed null safety", StringUtils.stripAccents(null) );
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37956);assertEquals( "Failed empty String", "", StringUtils.stripAccents("") );
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37957);assertEquals( "Failed to handle non-accented text", "control", StringUtils.stripAccents("control") );
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37958);assertEquals( "Failed to handle easy example", "eclair", StringUtils.stripAccents("\u00e9clair") );
        __CLR4_5_2t6ot6olvha7gp2.R.inc(37959);assertEquals("ALOSZZCN aloszzcn", StringUtils.stripAccents("\u0104\u0141\u00d3\u015a\u017b\u0179\u0106\u0143 "
                + "\u0105\u0142\u00f3\u015b\u017c\u017a\u0107\u0144"));
    }finally{__CLR4_5_2t6ot6olvha7gp2.R.flushNeeded();}}
}
