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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test case for ToStringStyle.
 */
public class ToStringStyleTest {static class __CLR4_5_2y85y85lvha7hmj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44405,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class ToStringStyleImpl extends ToStringStyle {
        private static final long serialVersionUID = 1L;

    }

    //-----------------------------------------------------------------------
    @Test
    public void testSetArrayStart() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27u9c0y85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArrayStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27u9c0y85(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44357);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44358);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44359);style.setArrayStart(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44360);assertEquals("", style.getArrayStart());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetArrayEnd() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm1sbry89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArrayEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm1sbry89(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44361);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44362);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44363);style.setArrayEnd(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44364);assertEquals("", style.getArrayEnd());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetArraySeparator() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26b5muby8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArraySeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26b5muby8d(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44365);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44366);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44367);style.setArraySeparator(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44368);assertEquals("", style.getArraySeparator());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetContentStart() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cy31cy8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetContentStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cy31cy8h(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44369);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44370);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44371);style.setContentStart(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44372);assertEquals("", style.getContentStart());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetContentEnd() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2avwjify8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetContentEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2avwjify8l(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44373);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44374);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44375);style.setContentEnd(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44376);assertEquals("", style.getContentEnd());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetFieldNameValueSeparator() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zsjqoy8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetFieldNameValueSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zsjqoy8p(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44377);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44378);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44379);style.setFieldNameValueSeparator(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44380);assertEquals("", style.getFieldNameValueSeparator());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetFieldSeparator() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2575b3yy8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetFieldSeparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2575b3yy8t(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44381);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44382);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44383);style.setFieldSeparator(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44384);assertEquals("", style.getFieldSeparator());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetNullText() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qdgaxhy8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetNullText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qdgaxhy8x(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44385);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44386);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44387);style.setNullText(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44388);assertEquals("", style.getNullText());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetSizeStartText() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2giqv6jy91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSizeStartText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2giqv6jy91(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44389);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44390);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44391);style.setSizeStartText(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44392);assertEquals("", style.getSizeStartText());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetSizeEndText() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l54ywyy95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSizeEndText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l54ywyy95(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44393);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44394);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44395);style.setSizeEndText(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44396);assertEquals("", style.getSizeEndText());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetSummaryObjectStartText() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sl5uwvy99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSummaryObjectStartText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sl5uwvy99(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44397);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44398);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44399);style.setSummaryObjectStartText(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44400);assertEquals("", style.getSummaryObjectStartText());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    @Test
    public void testSetSummaryObjectEndText() {__CLR4_5_2y85y85lvha7hmj.R.globalSliceStart(getClass().getName(),44401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2othcd6y9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y85y85lvha7hmj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y85y85lvha7hmj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSummaryObjectEndText",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2othcd6y9d(){try{__CLR4_5_2y85y85lvha7hmj.R.inc(44401);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44402);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_5_2y85y85lvha7hmj.R.inc(44403);style.setSummaryObjectEndText(null);
        __CLR4_5_2y85y85lvha7hmj.R.inc(44404);assertEquals("", style.getSummaryObjectEndText());
    }finally{__CLR4_5_2y85y85lvha7hmj.R.flushNeeded();}}

    /**
     * An object used to test {@link ToStringStyle}.
     * 
     */
    static class Person {
        /**
         * Test String field.
         */
        String name;

        /**
         * Test integer field.
         */
        int age;

        /**
         * Test boolean field.
         */
        boolean smoker;
    }
}
