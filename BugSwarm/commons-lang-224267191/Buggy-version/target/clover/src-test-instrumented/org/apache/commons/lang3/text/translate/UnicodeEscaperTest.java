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

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.translate.UnicodeEscaper}.
 */
@Deprecated
public class UnicodeEscaperTest  {static class __CLR4_5_216ld16ldlvha7imj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBelow() {__CLR4_5_216ld16ldlvha7imj.R.globalSliceStart(getClass().getName(),55201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vjgh5m16ld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ld16ldlvha7imj.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ld16ldlvha7imj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeEscaperTest.testBelow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vjgh5m16ld(){try{__CLR4_5_216ld16ldlvha7imj.R.inc(55201);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55202);final UnicodeEscaper ue = UnicodeEscaper.below('F');

        __CLR4_5_216ld16ldlvha7imj.R.inc(55203);final String input = "ADFGZ";
        __CLR4_5_216ld16ldlvha7imj.R.inc(55204);final String result = ue.translate(input);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55205);assertEquals("Failed to escape Unicode characters via the below method", "\\u0041\\u0044FGZ", result);
    }finally{__CLR4_5_216ld16ldlvha7imj.R.flushNeeded();}}

    @Test
    public void testBetween() {__CLR4_5_216ld16ldlvha7imj.R.globalSliceStart(getClass().getName(),55206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nkypur16li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ld16ldlvha7imj.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ld16ldlvha7imj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeEscaperTest.testBetween",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nkypur16li(){try{__CLR4_5_216ld16ldlvha7imj.R.inc(55206);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55207);final UnicodeEscaper ue = UnicodeEscaper.between('F', 'L');

        __CLR4_5_216ld16ldlvha7imj.R.inc(55208);final String input = "ADFGZ";
        __CLR4_5_216ld16ldlvha7imj.R.inc(55209);final String result = ue.translate(input);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55210);assertEquals("Failed to escape Unicode characters via the between method", "AD\\u0046\\u0047Z", result);
    }finally{__CLR4_5_216ld16ldlvha7imj.R.flushNeeded();}}

    @Test
    public void testAbove() {__CLR4_5_216ld16ldlvha7imj.R.globalSliceStart(getClass().getName(),55211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hmuioi16ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ld16ldlvha7imj.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ld16ldlvha7imj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeEscaperTest.testAbove",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hmuioi16ln(){try{__CLR4_5_216ld16ldlvha7imj.R.inc(55211);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55212);final UnicodeEscaper ue = UnicodeEscaper.above('F');

        __CLR4_5_216ld16ldlvha7imj.R.inc(55213);final String input = "ADFGZ";
        __CLR4_5_216ld16ldlvha7imj.R.inc(55214);final String result = ue.translate(input);
        __CLR4_5_216ld16ldlvha7imj.R.inc(55215);assertEquals("Failed to escape Unicode characters via the above method", "ADF\\u0047\\u005A", result);
    }finally{__CLR4_5_216ld16ldlvha7imj.R.flushNeeded();}}
}
