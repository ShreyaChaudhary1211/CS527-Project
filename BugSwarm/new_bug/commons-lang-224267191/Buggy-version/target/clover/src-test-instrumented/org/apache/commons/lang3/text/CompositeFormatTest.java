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

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.CompositeFormat}.
 */
@Deprecated
public class CompositeFormatTest {static class __CLR4_5_213i913i9lvha7ic5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Ensures that the parse/format separation is correctly maintained. 
     */
    @Test
    public void testCompositeFormat() {__CLR4_5_213i913i9lvha7ic5.R.globalSliceStart(getClass().getName(),51201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jvcngt13i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213i913i9lvha7ic5.R.rethrow($CLV_t2$);}finally{__CLR4_5_213i913i9lvha7ic5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.CompositeFormatTest.testCompositeFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jvcngt13i9(){try{__CLR4_5_213i913i9lvha7ic5.R.inc(51201);

        __CLR4_5_213i913i9lvha7ic5.R.inc(51202);final Format parser = new Format() {
            private static final long serialVersionUID = 1L;

            @Override
            public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_213i913i9lvha7ic5.R.inc(51203);
                __CLR4_5_213i913i9lvha7ic5.R.inc(51204);throw new UnsupportedOperationException("Not implemented");
            }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}

            @Override
            public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_213i913i9lvha7ic5.R.inc(51205);
                __CLR4_5_213i913i9lvha7ic5.R.inc(51206);return null;    // do nothing
            }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}
        };

        __CLR4_5_213i913i9lvha7ic5.R.inc(51207);final Format formatter = new Format() {
            private static final long serialVersionUID = 1L;

            @Override
            public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_5_213i913i9lvha7ic5.R.inc(51208);
                __CLR4_5_213i913i9lvha7ic5.R.inc(51209);return null;    // do nothing
            }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}

            @Override
            public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_5_213i913i9lvha7ic5.R.inc(51210);
                __CLR4_5_213i913i9lvha7ic5.R.inc(51211);throw new UnsupportedOperationException("Not implemented");
            }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}
        };

        __CLR4_5_213i913i9lvha7ic5.R.inc(51212);final CompositeFormat composite = new CompositeFormat(parser, formatter);

        __CLR4_5_213i913i9lvha7ic5.R.inc(51213);composite.parseObject("", null);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51214);composite.format(new Object(), new StringBuffer(), null);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51215);assertEquals( "Parser get method incorrectly implemented", parser, composite.getParser() );
        __CLR4_5_213i913i9lvha7ic5.R.inc(51216);assertEquals( "Formatter get method incorrectly implemented", formatter, composite.getFormatter() );
    }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}

    @Test
    public void testUsage() throws Exception {__CLR4_5_213i913i9lvha7ic5.R.globalSliceStart(getClass().getName(),51217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26has8a13ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213i913i9lvha7ic5.R.rethrow($CLV_t2$);}finally{__CLR4_5_213i913i9lvha7ic5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.CompositeFormatTest.testUsage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26has8a13ip() throws Exception{try{__CLR4_5_213i913i9lvha7ic5.R.inc(51217);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51218);final Format f1 = new SimpleDateFormat("MMddyyyy", Locale.ENGLISH);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51219);final Format f2 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51220);final CompositeFormat c = new CompositeFormat(f1, f2);
        __CLR4_5_213i913i9lvha7ic5.R.inc(51221);final String testString = "January 3, 2005";
        __CLR4_5_213i913i9lvha7ic5.R.inc(51222);assertEquals(testString, c.format(c.parseObject("01032005")));
        __CLR4_5_213i913i9lvha7ic5.R.inc(51223);assertEquals(testString, c.reformat("01032005"));
    }finally{__CLR4_5_213i913i9lvha7ic5.R.flushNeeded();}}

}
