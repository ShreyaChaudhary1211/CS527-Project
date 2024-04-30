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

import static java.util.FormattableFlags.LEFT_JUSTIFY;
import static org.junit.Assert.assertEquals;

import java.util.Formatter;

import org.junit.Test;

/**
 * Unit tests {@link FormattableUtils}.
 */
@Deprecated
public class FormattableUtilsTest {static class __CLR4_5_213o813o8lvha7ict{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51483,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDefaultAppend() {__CLR4_5_213o813o8lvha7ict.R.globalSliceStart(getClass().getName(),51416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_238asgg13o8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213o813o8lvha7ict.R.rethrow($CLV_t2$);}finally{__CLR4_5_213o813o8lvha7ict.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testDefaultAppend",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_238asgg13o8(){try{__CLR4_5_213o813o8lvha7ict.R.inc(51416);
        __CLR4_5_213o813o8lvha7ict.R.inc(51417);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51418);assertEquals("fo", FormattableUtils.append("foo", new Formatter(), 0, -1, 2).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51419);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51420);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51421);assertEquals(" fo", FormattableUtils.append("foo", new Formatter(), 0, 3, 2).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51422);assertEquals("   fo", FormattableUtils.append("foo", new Formatter(), 0, 5, 2).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51423);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51424);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51425);assertEquals("fo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51426);assertEquals("fo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2).toString());
    }finally{__CLR4_5_213o813o8lvha7ict.R.flushNeeded();}}

    @Test
    public void testAlternatePadCharacter() {__CLR4_5_213o813o8lvha7ict.R.globalSliceStart(getClass().getName(),51427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y7bj4513oj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213o813o8lvha7ict.R.rethrow($CLV_t2$);}finally{__CLR4_5_213o813o8lvha7ict.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testAlternatePadCharacter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y7bj4513oj(){try{__CLR4_5_213o813o8lvha7ict.R.inc(51427);
        __CLR4_5_213o813o8lvha7ict.R.inc(51428);final char pad='_';
        __CLR4_5_213o813o8lvha7ict.R.inc(51429);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51430);assertEquals("fo", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51431);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51432);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51433);assertEquals("_fo", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51434);assertEquals("___fo", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51435);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51436);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51437);assertEquals("fo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, pad).toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51438);assertEquals("fo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, pad).toString());
    }finally{__CLR4_5_213o813o8lvha7ict.R.flushNeeded();}}

    @Test
    public void testEllipsis() {__CLR4_5_213o813o8lvha7ict.R.globalSliceStart(getClass().getName(),51439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujddp213ov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213o813o8lvha7ict.R.rethrow($CLV_t2$);}finally{__CLR4_5_213o813o8lvha7ict.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testEllipsis",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujddp213ov(){try{__CLR4_5_213o813o8lvha7ict.R.inc(51439);
        __CLR4_5_213o813o8lvha7ict.R.inc(51440);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51441);assertEquals("f*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51442);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51443);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51444);assertEquals(" f*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51445);assertEquals("   f*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51446);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51447);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51448);assertEquals("f* ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51449);assertEquals("f*   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, "*").toString());

        __CLR4_5_213o813o8lvha7ict.R.inc(51450);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51451);assertEquals("+*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51452);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51453);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51454);assertEquals(" +*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51455);assertEquals("   +*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51456);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51457);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51458);assertEquals("+* ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51459);assertEquals("+*   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, "+*").toString());
    }finally{__CLR4_5_213o813o8lvha7ict.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testIllegalEllipsis() {__CLR4_5_213o813o8lvha7ict.R.globalSliceStart(getClass().getName(),51460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jdfgf813pg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,108,108,101,103,97,108,69,108,108,105,112,115,105,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213o813o8lvha7ict.R.rethrow($CLV_t2$);}finally{__CLR4_5_213o813o8lvha7ict.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testIllegalEllipsis",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jdfgf813pg(){try{__CLR4_5_213o813o8lvha7ict.R.inc(51460);
        __CLR4_5_213o813o8lvha7ict.R.inc(51461);FormattableUtils.append("foo", new Formatter(), 0, -1, 1, "xx");
    }finally{__CLR4_5_213o813o8lvha7ict.R.flushNeeded();}}

    @Test
    public void testAlternatePadCharAndEllipsis() {__CLR4_5_213o813o8lvha7ict.R.globalSliceStart(getClass().getName(),51462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22td4oi13pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213o813o8lvha7ict.R.rethrow($CLV_t2$);}finally{__CLR4_5_213o813o8lvha7ict.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testAlternatePadCharAndEllipsis",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22td4oi13pi(){try{__CLR4_5_213o813o8lvha7ict.R.inc(51462);
        __CLR4_5_213o813o8lvha7ict.R.inc(51463);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51464);assertEquals("f*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51465);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51466);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51467);assertEquals("_f*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51468);assertEquals("___f*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51469);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51470);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51471);assertEquals("f*_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, '_', "*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51472);assertEquals("f*___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, '_', "*").toString());

        __CLR4_5_213o813o8lvha7ict.R.inc(51473);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51474);assertEquals("+*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51475);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51476);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51477);assertEquals("_+*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51478);assertEquals("___+*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51479);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51480);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51481);assertEquals("+*_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, '_', "+*").toString());
        __CLR4_5_213o813o8lvha7ict.R.inc(51482);assertEquals("+*___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, '_', "+*").toString());
    }finally{__CLR4_5_213o813o8lvha7ict.R.flushNeeded();}}

}
