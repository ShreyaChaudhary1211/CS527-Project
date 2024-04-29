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
package org.apache.commons.lang3.time;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

public class FastDateParser_MoreOrLessTest {static class __CLR4_5_218kg18kglvha7ivc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,57814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    
    @Test
    public void testInputHasPrecedingCharacters() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jn3thq18kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasPrecedingCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jn3thq18kg(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57760);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57761);final FastDateParser parser = new FastDateParser("MM/dd", TimeZone.getDefault(), Locale.getDefault());
        __CLR4_5_218kg18kglvha7ivc.R.inc(57762);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57763);final Date date = parser.parse("A 3/23/61", parsePosition);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57764);Assert.assertNull(date);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57765);Assert.assertEquals(0, parsePosition.getIndex());      
        __CLR4_5_218kg18kglvha7ivc.R.inc(57766);Assert.assertEquals(0, parsePosition.getErrorIndex());        
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}

    @Test
    public void testInputHasWhitespace() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bdw69218kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasWhitespace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bdw69218kn(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57767);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57768);final FastDateParser parser = new FastDateParser("M/d/y", TimeZone.getDefault(), Locale.getDefault());
        //SimpleDateFormat parser = new SimpleDateFormat("M/d/y");
        __CLR4_5_218kg18kglvha7ivc.R.inc(57769);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57770);final Date date = parser.parse(" 3/ 23/ 1961", parsePosition);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57771);Assert.assertEquals(12, parsePosition.getIndex());

        __CLR4_5_218kg18kglvha7ivc.R.inc(57772);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_218kg18kglvha7ivc.R.inc(57773);calendar.setTime(date);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57774);Assert.assertEquals(1961, calendar.get(Calendar.YEAR));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57775);Assert.assertEquals(2, calendar.get(Calendar.MONTH));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57776);Assert.assertEquals(23, calendar.get(Calendar.DATE));       
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}

    @Test
    public void testInputHasMoreCharacters() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cftxmw18kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasMoreCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cftxmw18kx(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57777);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57778);final FastDateParser parser = new FastDateParser("MM/dd", TimeZone.getDefault(), Locale.getDefault());
        __CLR4_5_218kg18kglvha7ivc.R.inc(57779);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57780);final Date date = parser.parse("3/23/61", parsePosition);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57781);Assert.assertEquals(4, parsePosition.getIndex());

        __CLR4_5_218kg18kglvha7ivc.R.inc(57782);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_218kg18kglvha7ivc.R.inc(57783);calendar.setTime(date);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57784);Assert.assertEquals(2, calendar.get(Calendar.MONTH));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57785);Assert.assertEquals(23, calendar.get(Calendar.DATE));       
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}
    
    @Test
    public void testInputHasWrongCharacters() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jqcu1o18l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasWrongCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jqcu1o18l6(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57786);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57787);final FastDateParser parser = new FastDateParser("MM-dd-yyy", TimeZone.getDefault(), Locale.getDefault());
        __CLR4_5_218kg18kglvha7ivc.R.inc(57788);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57789);Assert.assertNull(parser.parse("03/23/1961", parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57790);Assert.assertEquals(2, parsePosition.getErrorIndex());
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}
    
    @Test
    public void testInputHasLessCharacters() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_280uoc18lb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasLessCharacters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_280uoc18lb(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57791);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57792);final FastDateParser parser = new FastDateParser("MM/dd/yyy", TimeZone.getDefault(), Locale.getDefault());
        __CLR4_5_218kg18kglvha7ivc.R.inc(57793);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57794);Assert.assertNull(parser.parse("03/23", parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57795);Assert.assertEquals(5, parsePosition.getErrorIndex());
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}
    
    @Test
    public void testInputHasWrongTimeZone() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ihc1g518lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasWrongTimeZone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ihc1g518lg(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57796);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57797);final FastDateParser parser = new FastDateParser("mm:ss z", NEW_YORK, Locale.US);
        
        __CLR4_5_218kg18kglvha7ivc.R.inc(57798);final String input = "11:23 Pacific Standard Time";
        __CLR4_5_218kg18kglvha7ivc.R.inc(57799);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57800);Assert.assertNotNull(parser.parse(input, parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57801);Assert.assertEquals(input.length(), parsePosition.getIndex());
        
        __CLR4_5_218kg18kglvha7ivc.R.inc(57802);parsePosition.setIndex(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57803);Assert.assertNull(parser.parse( "11:23 Pacific Standard ", parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57804);Assert.assertEquals(6, parsePosition.getErrorIndex());
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}
    
    @Test
    public void testInputHasWrongDay() {__CLR4_5_218kg18kglvha7ivc.R.globalSliceStart(getClass().getName(),57805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27li2ag18lp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218kg18kglvha7ivc.R.rethrow($CLV_t2$);}finally{__CLR4_5_218kg18kglvha7ivc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParser_MoreOrLessTest.testInputHasWrongDay",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27li2ag18lp(){try{__CLR4_5_218kg18kglvha7ivc.R.inc(57805);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57806);final FastDateParser parser = new FastDateParser("EEEE, MM/dd/yyy", NEW_YORK, Locale.US);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57807);final String input = "Thursday, 03/23/61";
        __CLR4_5_218kg18kglvha7ivc.R.inc(57808);final ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57809);Assert.assertNotNull(parser.parse(input, parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57810);Assert.assertEquals(input.length(), parsePosition.getIndex());
        
        __CLR4_5_218kg18kglvha7ivc.R.inc(57811);parsePosition.setIndex(0);
        __CLR4_5_218kg18kglvha7ivc.R.inc(57812);Assert.assertNull(parser.parse( "Thorsday, 03/23/61", parsePosition));
        __CLR4_5_218kg18kglvha7ivc.R.inc(57813);Assert.assertEquals(0, parsePosition.getErrorIndex());
    }finally{__CLR4_5_218kg18kglvha7ivc.R.flushNeeded();}}
}
