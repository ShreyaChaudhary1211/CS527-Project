/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.Validate}.
 */
public class ValidateTest  {static class __CLR4_5_2trstrslvha7gs7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,39182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2emedoutrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2emedoutrs(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38584);
        __CLR4_5_2trstrslvha7gs7.R.inc(38585);Validate.isTrue(true);
        __CLR4_5_2trstrslvha7gs7.R.inc(38586);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38587);Validate.isTrue(false);
            __CLR4_5_2trstrslvha7gs7.R.inc(38588);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38589);assertEquals("The validated expression is false", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvechbtry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvechbtry(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38590);
        __CLR4_5_2trstrslvha7gs7.R.inc(38591);Validate.isTrue(true, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38592);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38593);Validate.isTrue(false, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38594);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38595);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue3() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l4eb9sts4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l4eb9sts4(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38596);
        __CLR4_5_2trstrslvha7gs7.R.inc(38597);Validate.isTrue(true, "MSG", 6);
        __CLR4_5_2trstrslvha7gs7.R.inc(38598);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38599);Validate.isTrue(false, "MSG", 6);
            __CLR4_5_2trstrslvha7gs7.R.inc(38600);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38601);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue4() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2odea29tsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2odea29tsa(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38602);
        __CLR4_5_2trstrslvha7gs7.R.inc(38603);Validate.isTrue(true, "MSG", 7);
        __CLR4_5_2trstrslvha7gs7.R.inc(38604);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38605);Validate.isTrue(false, "MSG", 7);
            __CLR4_5_2trstrslvha7gs7.R.inc(38606);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38607);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue5() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rme8uqtsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rme8uqtsg(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38608);
        __CLR4_5_2trstrslvha7gs7.R.inc(38609);Validate.isTrue(true, "MSG", 7.4d);
        __CLR4_5_2trstrslvha7gs7.R.inc(38610);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38611);Validate.isTrue(false, "MSG", 7.4d);
            __CLR4_5_2trstrslvha7gs7.R.inc(38612);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38613);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @SuppressWarnings("unused")
    @Test
    public void testNotNull1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27o8l2otsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNull1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27o8l2otsm(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38614);
        __CLR4_5_2trstrslvha7gs7.R.inc(38615);Validate.notNull(new Object());
        __CLR4_5_2trstrslvha7gs7.R.inc(38616);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38617);Validate.notNull(null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38618);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38619);assertEquals("The validated object is null", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38620);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38621);final String testStr = Validate.notNull(str);
        __CLR4_5_2trstrslvha7gs7.R.inc(38622);assertSame(str, testStr);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("unused")
    @Test
    public void testNotNull2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24f8ma7tsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNull2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24f8ma7tsv(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38623);
        __CLR4_5_2trstrslvha7gs7.R.inc(38624);Validate.notNull(new Object(), "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38625);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38626);Validate.notNull(null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38627);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38628);assertEquals("MSG", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38629);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38630);final String testStr = Validate.notNull(str, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38631);assertSame(str, testStr);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyArray1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vx37pntt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyArray1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vx37pntt4(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38632);
        __CLR4_5_2trstrslvha7gs7.R.inc(38633);Validate.notEmpty(new Object[] {null});
        __CLR4_5_2trstrslvha7gs7.R.inc(38634);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38635);Validate.notEmpty((Object[]) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38636);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38637);assertEquals("The validated array is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38638);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38639);Validate.notEmpty(new Object[0]);
            __CLR4_5_2trstrslvha7gs7.R.inc(38640);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38641);assertEquals("The validated array is empty", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38642);final String[] array = new String[] {"hi"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38643);final String[] test = Validate.notEmpty(array);
        __CLR4_5_2trstrslvha7gs7.R.inc(38644);assertSame(array, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyArray2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z636i4tth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyArray2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z636i4tth(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38645);
        __CLR4_5_2trstrslvha7gs7.R.inc(38646);Validate.notEmpty(new Object[] {null}, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38647);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38648);Validate.notEmpty((Object[]) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38649);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38650);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38651);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38652);Validate.notEmpty(new Object[0], "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38653);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38654);assertEquals("MSG", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38655);final String[] array = new String[] {"hi"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38656);final String[] test = Validate.notEmpty(array, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38657);assertSame(array, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyCollection1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277ye5qttu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyCollection1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277ye5qttu(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38658);
        __CLR4_5_2trstrslvha7gs7.R.inc(38659);final Collection<Integer> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38660);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38661);Validate.notEmpty((Collection<?>) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38662);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38663);assertEquals("The validated collection is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38664);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38665);Validate.notEmpty(coll);
            __CLR4_5_2trstrslvha7gs7.R.inc(38666);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38667);assertEquals("The validated collection is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38668);coll.add(Integer.valueOf(8));
        __CLR4_5_2trstrslvha7gs7.R.inc(38669);Validate.notEmpty(coll);

        __CLR4_5_2trstrslvha7gs7.R.inc(38670);final Collection<Integer> test = Validate.notEmpty(coll);
        __CLR4_5_2trstrslvha7gs7.R.inc(38671);assertSame(coll, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyCollection2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agycy7tu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyCollection2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agycy7tu8(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38672);
        __CLR4_5_2trstrslvha7gs7.R.inc(38673);final Collection<Integer> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38674);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38675);Validate.notEmpty((Collection<?>) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38676);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38677);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38678);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38679);Validate.notEmpty(coll, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38680);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38681);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38682);coll.add(Integer.valueOf(8));
        __CLR4_5_2trstrslvha7gs7.R.inc(38683);Validate.notEmpty(coll, "MSG");

        __CLR4_5_2trstrslvha7gs7.R.inc(38684);final Collection<Integer> test = Validate.notEmpty(coll, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38685);assertSame(coll, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyMap1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25fusg8tum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyMap1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25fusg8tum(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38686);
        __CLR4_5_2trstrslvha7gs7.R.inc(38687);final Map<String, Integer> map = new HashMap<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38688);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38689);Validate.notEmpty((Map<?, ?>) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38690);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38691);assertEquals("The validated map is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38692);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38693);Validate.notEmpty(map);
            __CLR4_5_2trstrslvha7gs7.R.inc(38694);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38695);assertEquals("The validated map is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38696);map.put("ll", Integer.valueOf(8));
        __CLR4_5_2trstrslvha7gs7.R.inc(38697);Validate.notEmpty(map);

        __CLR4_5_2trstrslvha7gs7.R.inc(38698);final Map<String, Integer> test = Validate.notEmpty(map);
        __CLR4_5_2trstrslvha7gs7.R.inc(38699);assertSame(map, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyMap2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28our8ptv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyMap2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28our8ptv0(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38700);
        __CLR4_5_2trstrslvha7gs7.R.inc(38701);final Map<String, Integer> map = new HashMap<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38702);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38703);Validate.notEmpty((Map<?, ?>) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38704);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38705);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38706);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38707);Validate.notEmpty(map, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38708);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38709);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38710);map.put("ll", Integer.valueOf(8));
        __CLR4_5_2trstrslvha7gs7.R.inc(38711);Validate.notEmpty(map, "MSG");

        __CLR4_5_2trstrslvha7gs7.R.inc(38712);final Map<String, Integer> test = Validate.notEmpty(map, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38713);assertSame(map, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyString1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s16jy3tve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyString1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s16jy3tve(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38714);
        __CLR4_5_2trstrslvha7gs7.R.inc(38715);Validate.notEmpty("hjl");
        __CLR4_5_2trstrslvha7gs7.R.inc(38716);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38717);Validate.notEmpty((String) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38718);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38719);assertEquals("The validated character sequence is empty", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38720);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38721);Validate.notEmpty("");
            __CLR4_5_2trstrslvha7gs7.R.inc(38722);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38723);assertEquals("The validated character sequence is empty", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38724);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38725);final String testStr = Validate.notEmpty(str);
        __CLR4_5_2trstrslvha7gs7.R.inc(38726);assertSame(str, testStr);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyString2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2va6iqktvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyString2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2va6iqktvr(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38727);
        __CLR4_5_2trstrslvha7gs7.R.inc(38728);Validate.notEmpty("a", "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38729);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38730);Validate.notEmpty((String) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38731);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38732);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38733);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38734);Validate.notEmpty("", "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38735);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38736);assertEquals("MSG", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38737);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38738);final String testStr = Validate.notEmpty(str, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38739);assertSame(str, testStr);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNullStringShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rst3tdtw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNullStringShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rst3tdtw4(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38740);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38741);final String string = null;

        __CLR4_5_2trstrslvha7gs7.R.inc(38742);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38743);Validate.notBlank(string);
            __CLR4_5_2trstrslvha7gs7.R.inc(38744);fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38745);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNullStringShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296of10twa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNullStringShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296of10twa(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38746);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38747);final String string = null;

        __CLR4_5_2trstrslvha7gs7.R.inc(38748);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38749);Validate.notBlank(string, "Message");
            __CLR4_5_2trstrslvha7gs7.R.inc(38750);fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38751);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankEmptyStringShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26l6strtwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankEmptyStringShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26l6strtwg(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38752);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38753);final String string = "";

        __CLR4_5_2trstrslvha7gs7.R.inc(38754);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38755);Validate.notBlank(string);
            __CLR4_5_2trstrslvha7gs7.R.inc(38756);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38757);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankBlankStringWithWhitespacesShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwsmnwtwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankBlankStringWithWhitespacesShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwsmnwtwm(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38758);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38759);final String string = "   ";

        __CLR4_5_2trstrslvha7gs7.R.inc(38760);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38761);Validate.notBlank(string);
            __CLR4_5_2trstrslvha7gs7.R.inc(38762);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38763);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankBlankStringWithNewlinesShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f45l19tws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankBlankStringWithNewlinesShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f45l19tws(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38764);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38765);final String string = " \n \t \r \n ";

        __CLR4_5_2trstrslvha7gs7.R.inc(38766);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38767);Validate.notBlank(string);
            __CLR4_5_2trstrslvha7gs7.R.inc(38768);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38769);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgBlankStringShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmrlr1twy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgBlankStringShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmrlr1twy(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38770);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38771);final String string = " \n \t \r \n ";

        __CLR4_5_2trstrslvha7gs7.R.inc(38772);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38773);Validate.notBlank(string, "Message");
            __CLR4_5_2trstrslvha7gs7.R.inc(38774);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38775);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgBlankStringWithWhitespacesShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mvblb3tx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgBlankStringWithWhitespacesShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mvblb3tx4(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38776);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38777);final String string = "   ";

        __CLR4_5_2trstrslvha7gs7.R.inc(38778);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38779);Validate.notBlank(string, "Message");
            __CLR4_5_2trstrslvha7gs7.R.inc(38780);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38781);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgEmptyStringShouldThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnh5d6txa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgEmptyStringShouldThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnh5d6txa(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38782);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38783);final String string = "";

        __CLR4_5_2trstrslvha7gs7.R.inc(38784);try {
            //when
            __CLR4_5_2trstrslvha7gs7.R.inc(38785);Validate.notBlank(string, "Message");
            __CLR4_5_2trstrslvha7gs7.R.inc(38786);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_5_2trstrslvha7gs7.R.inc(38787);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23vxy0itxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38788,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23vxy0itxg(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38788);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38789);final String string = "abc";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38790);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringWithWhitespacesShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xig860txj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringWithWhitespacesShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xig860txj(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38791);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38792);final String string = "  abc   ";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38793);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringWithNewlinesShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ycnj07txm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringWithNewlinesShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ycnj07txm(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38794);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38795);final String string = " \n \t abc \r \n ";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38796);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n9we99txp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n9we99txp(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38797);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38798);final String string = "abc";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38799);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2miilz7txs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2miilz7txs(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38800);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38801);final String string = "  abc   ";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38802);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jupicytxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jupicytxv(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38803);
        //given
        __CLR4_5_2trstrslvha7gs7.R.inc(38804);final String string = " \n \t abc \r \n ";

        //when
        __CLR4_5_2trstrslvha7gs7.R.inc(38805);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankReturnValues1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hwplftxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankReturnValues1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hwplftxy(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38806);
        __CLR4_5_2trstrslvha7gs7.R.inc(38807);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38808);final String test = Validate.notBlank(str);
        __CLR4_5_2trstrslvha7gs7.R.inc(38809);assertSame(str, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testNotBlankReturnValues2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qwodwty2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankReturnValues2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qwodwty2(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38810);
        __CLR4_5_2trstrslvha7gs7.R.inc(38811);final String str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38812);final String test = Validate.notBlank(str, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38813);assertSame(str, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsArray1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a835g0ty6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsArray1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a835g0ty6(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38814);
        __CLR4_5_2trstrslvha7gs7.R.inc(38815);String[] array = new String[] {"a", "b"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38816);Validate.noNullElements(array);
        __CLR4_5_2trstrslvha7gs7.R.inc(38817);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38818);Validate.noNullElements((Object[]) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38819);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38820);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38821);array[1] = null;
        __CLR4_5_2trstrslvha7gs7.R.inc(38822);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38823);Validate.noNullElements(array);
            __CLR4_5_2trstrslvha7gs7.R.inc(38824);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38825);assertEquals("The validated array contains null element at index: 1", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38826);array = new String[] {"a", "b"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38827);final String[] test = Validate.noNullElements(array);
        __CLR4_5_2trstrslvha7gs7.R.inc(38828);assertSame(array, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsArray2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26z36njtyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsArray2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26z36njtyl(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38829);
        __CLR4_5_2trstrslvha7gs7.R.inc(38830);String[] array = new String[] {"a", "b"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38831);Validate.noNullElements(array, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38832);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38833);Validate.noNullElements((Object[]) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38834);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38835);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38836);array[1] = null;
        __CLR4_5_2trstrslvha7gs7.R.inc(38837);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38838);Validate.noNullElements(array, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38839);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38840);assertEquals("MSG", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38841);array = new String[] {"a", "b"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38842);final String[] test = Validate.noNullElements(array, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38843);assertSame(array, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsCollection1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2egl1uftz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsCollection1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2egl1uftz0(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38844);
        __CLR4_5_2trstrslvha7gs7.R.inc(38845);final List<String> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38846);coll.add("a");
        __CLR4_5_2trstrslvha7gs7.R.inc(38847);coll.add("b");
        __CLR4_5_2trstrslvha7gs7.R.inc(38848);Validate.noNullElements(coll);
        __CLR4_5_2trstrslvha7gs7.R.inc(38849);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38850);Validate.noNullElements((Collection<?>) null);
            __CLR4_5_2trstrslvha7gs7.R.inc(38851);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38852);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38853);coll.set(1, null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38854);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38855);Validate.noNullElements(coll);
            __CLR4_5_2trstrslvha7gs7.R.inc(38856);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38857);assertEquals("The validated collection contains null element at index: 1", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38858);coll.set(1, "b");
        __CLR4_5_2trstrslvha7gs7.R.inc(38859);final List<String> test = Validate.noNullElements(coll);
        __CLR4_5_2trstrslvha7gs7.R.inc(38860);assertSame(coll, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsCollection2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b7l31ytzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsCollection2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b7l31ytzh(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38861);
        __CLR4_5_2trstrslvha7gs7.R.inc(38862);final List<String> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38863);coll.add("a");
        __CLR4_5_2trstrslvha7gs7.R.inc(38864);coll.add("b");
        __CLR4_5_2trstrslvha7gs7.R.inc(38865);Validate.noNullElements(coll, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(38866);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38867);Validate.noNullElements((Collection<?>) null, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38868);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38869);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38870);coll.set(1, null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38871);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38872);Validate.noNullElements(coll, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(38873);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38874);assertEquals("MSG", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38875);coll.set(1, "b");
        __CLR4_5_2trstrslvha7gs7.R.inc(38876);final List<String> test = Validate.noNullElements(coll, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38877);assertSame(coll, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8htzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8htzy(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38878);
        __CLR4_5_2trstrslvha7gs7.R.inc(38879);assertNotNull(new Validate());
        __CLR4_5_2trstrslvha7gs7.R.inc(38880);final Constructor<?>[] cons = Validate.class.getDeclaredConstructors();
        __CLR4_5_2trstrslvha7gs7.R.inc(38881);assertEquals(1, cons.length);
        __CLR4_5_2trstrslvha7gs7.R.inc(38882);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2trstrslvha7gs7.R.inc(38883);assertTrue(Modifier.isPublic(Validate.class.getModifiers()));
        __CLR4_5_2trstrslvha7gs7.R.inc(38884);assertFalse(Modifier.isFinal(Validate.class.getModifiers()));
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_array() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hbg71nu05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hbg71nu05(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38885);
        __CLR4_5_2trstrslvha7gs7.R.inc(38886);final Object[] array = new Object[2];
        __CLR4_5_2trstrslvha7gs7.R.inc(38887);Validate.validIndex(array, 0, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38888);Validate.validIndex(array, 1, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38889);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38890);Validate.validIndex(array, -1, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38891);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38892);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38893);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38894);Validate.validIndex(array, 2, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38895);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38896);assertEquals("Broken: ", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38897);final String[] strArray = new String[] {"Hi"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38898);final String[] test = Validate.noNullElements(strArray, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38899);assertSame(strArray, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testValidIndex_array() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8ugndu0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8ugndu0k(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38900);
        __CLR4_5_2trstrslvha7gs7.R.inc(38901);final Object[] array = new Object[2];
        __CLR4_5_2trstrslvha7gs7.R.inc(38902);Validate.validIndex(array, 0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38903);Validate.validIndex(array, 1);
        __CLR4_5_2trstrslvha7gs7.R.inc(38904);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38905);Validate.validIndex(array, -1);
            __CLR4_5_2trstrslvha7gs7.R.inc(38906);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38907);assertEquals("The validated array index is invalid: -1", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38908);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38909);Validate.validIndex(array, 2);
            __CLR4_5_2trstrslvha7gs7.R.inc(38910);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38911);assertEquals("The validated array index is invalid: 2", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38912);final String[] strArray = new String[] {"Hi"};
        __CLR4_5_2trstrslvha7gs7.R.inc(38913);final String[] test = Validate.noNullElements(strArray);
        __CLR4_5_2trstrslvha7gs7.R.inc(38914);assertSame(strArray, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_collection() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxhyxyu0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_collection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxhyxyu0z(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38915);
        __CLR4_5_2trstrslvha7gs7.R.inc(38916);final Collection<String> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38917);coll.add(null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38918);coll.add(null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38919);Validate.validIndex(coll, 0, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38920);Validate.validIndex(coll, 1, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38921);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38922);Validate.validIndex(coll, -1, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38923);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38924);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38925);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38926);Validate.validIndex(coll, 2, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38927);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38928);assertEquals("Broken: ", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38929);final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        __CLR4_5_2trstrslvha7gs7.R.inc(38930);final List<String> test = Validate.validIndex(strColl, 0, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38931);assertSame(strColl, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testValidIndex_collection() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25clpq4u1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_collection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25clpq4u1g(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38932);
        __CLR4_5_2trstrslvha7gs7.R.inc(38933);final Collection<String> coll = new ArrayList<>();
        __CLR4_5_2trstrslvha7gs7.R.inc(38934);coll.add(null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38935);coll.add(null);
        __CLR4_5_2trstrslvha7gs7.R.inc(38936);Validate.validIndex(coll, 0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38937);Validate.validIndex(coll, 1);
        __CLR4_5_2trstrslvha7gs7.R.inc(38938);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38939);Validate.validIndex(coll, -1);
            __CLR4_5_2trstrslvha7gs7.R.inc(38940);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38941);assertEquals("The validated collection index is invalid: -1", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38942);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38943);Validate.validIndex(coll, 2);
            __CLR4_5_2trstrslvha7gs7.R.inc(38944);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38945);assertEquals("The validated collection index is invalid: 2", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38946);final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        __CLR4_5_2trstrslvha7gs7.R.inc(38947);final List<String> test = Validate.validIndex(strColl, 0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38948);assertSame(strColl, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_charSequence() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278emstu1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_charSequence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278emstu1x(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38949);
        __CLR4_5_2trstrslvha7gs7.R.inc(38950);final CharSequence str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38951);Validate.validIndex(str, 0, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38952);Validate.validIndex(str, 1, "Broken: ");
        __CLR4_5_2trstrslvha7gs7.R.inc(38953);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38954);Validate.validIndex(str, -1, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38955);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38956);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38957);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38958);Validate.validIndex(str, 2, "Broken: ");
            __CLR4_5_2trstrslvha7gs7.R.inc(38959);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38960);assertEquals("Broken: ", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38961);final String input = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38962);final String test = Validate.validIndex(input, 0, "Message");
        __CLR4_5_2trstrslvha7gs7.R.inc(38963);assertSame(input, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testValidIndex_charSequence() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqc2izu2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_charSequence",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38964,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqc2izu2c(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38964);
        __CLR4_5_2trstrslvha7gs7.R.inc(38965);final CharSequence str = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38966);Validate.validIndex(str, 0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38967);Validate.validIndex(str, 1);
        __CLR4_5_2trstrslvha7gs7.R.inc(38968);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38969);Validate.validIndex(str, -1);
            __CLR4_5_2trstrslvha7gs7.R.inc(38970);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38971);assertEquals("The validated character sequence index is invalid: -1", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(38972);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38973);Validate.validIndex(str, 2);
            __CLR4_5_2trstrslvha7gs7.R.inc(38974);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(38975);assertEquals("The validated character sequence index is invalid: 2", ex.getMessage());
        }

        __CLR4_5_2trstrslvha7gs7.R.inc(38976);final String input = "Hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38977);final String test = Validate.validIndex(input, 0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38978);assertSame(input, test);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testMatchesPattern()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ila4juu2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testMatchesPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ila4juu2r(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38979);
        __CLR4_5_2trstrslvha7gs7.R.inc(38980);final CharSequence str = "hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38981);Validate.matchesPattern(str, "[a-z]*");
        __CLR4_5_2trstrslvha7gs7.R.inc(38982);try
        {
            __CLR4_5_2trstrslvha7gs7.R.inc(38983);Validate.matchesPattern(str, "[0-9]*");
            __CLR4_5_2trstrslvha7gs7.R.inc(38984);fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_5_2trstrslvha7gs7.R.inc(38985);assertEquals("The string hi does not match the pattern [0-9]*", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testMatchesPattern_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y90ml4u2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testMatchesPattern_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y90ml4u2y(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38986);
        __CLR4_5_2trstrslvha7gs7.R.inc(38987);final CharSequence str = "hi";
        __CLR4_5_2trstrslvha7gs7.R.inc(38988);Validate.matchesPattern(str, "[a-z]*", "Does not match");
        __CLR4_5_2trstrslvha7gs7.R.inc(38989);try
        {
            __CLR4_5_2trstrslvha7gs7.R.inc(38990);Validate.matchesPattern(str, "[0-9]*", "Does not match");
            __CLR4_5_2trstrslvha7gs7.R.inc(38991);fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_5_2trstrslvha7gs7.R.inc(38992);assertEquals("Does not match", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    @Test
    public void testNotNaN1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),38993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ysneymu35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNaN1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38993,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ysneymu35(){try{__CLR4_5_2trstrslvha7gs7.R.inc(38993);
        __CLR4_5_2trstrslvha7gs7.R.inc(38994);Validate.notNaN(0.0);
        __CLR4_5_2trstrslvha7gs7.R.inc(38995);Validate.notNaN(Double.POSITIVE_INFINITY);
        __CLR4_5_2trstrslvha7gs7.R.inc(38996);Validate.notNaN(Double.NEGATIVE_INFINITY);
        __CLR4_5_2trstrslvha7gs7.R.inc(38997);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(38998);Validate.notNaN(Double.NaN);
            __CLR4_5_2trstrslvha7gs7.R.inc(38999);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39000);assertEquals("The validated value is not a number", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testNotNaN2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wzgo81u3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNaN2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wzgo81u3d(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39001);
        __CLR4_5_2trstrslvha7gs7.R.inc(39002);Validate.notNaN(0.0, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(39003);Validate.notNaN(Double.POSITIVE_INFINITY, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(39004);Validate.notNaN(Double.NEGATIVE_INFINITY, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(39005);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39006);Validate.notNaN(Double.NaN, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(39007);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39008);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    @Test
    public void testFinite1() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bpz689u3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testFinite1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bpz689u3l(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39009);
        __CLR4_5_2trstrslvha7gs7.R.inc(39010);Validate.finite(0.0);
        __CLR4_5_2trstrslvha7gs7.R.inc(39011);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39012);Validate.finite(Double.POSITIVE_INFINITY);
            __CLR4_5_2trstrslvha7gs7.R.inc(39013);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39014);assertEquals("The value is invalid: Infinity", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39015);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39016);Validate.finite(Double.NEGATIVE_INFINITY);
            __CLR4_5_2trstrslvha7gs7.R.inc(39017);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39018);assertEquals("The value is invalid: -Infinity", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39019);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39020);Validate.finite(Double.NaN);
            __CLR4_5_2trstrslvha7gs7.R.inc(39021);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39022);assertEquals("The value is invalid: NaN", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testFinite2() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28gz7fsu3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testFinite2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28gz7fsu3z(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39023);
        __CLR4_5_2trstrslvha7gs7.R.inc(39024);Validate.finite(0.0, "MSG");
        __CLR4_5_2trstrslvha7gs7.R.inc(39025);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39026);Validate.finite(Double.POSITIVE_INFINITY, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(39027);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39028);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39029);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39030);Validate.finite(Double.NEGATIVE_INFINITY, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(39031);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39032);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39033);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39034);Validate.finite(Double.NaN, "MSG");
            __CLR4_5_2trstrslvha7gs7.R.inc(39035);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39036);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    @Test
    public void testInclusiveBetween()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kgan5hu4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetween",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kgan5hu4d(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39037);
        __CLR4_5_2trstrslvha7gs7.R.inc(39038);Validate.inclusiveBetween("a", "c", "b");
        __CLR4_5_2trstrslvha7gs7.R.inc(39039);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39040);Validate.inclusiveBetween("0", "5", "6");
            __CLR4_5_2trstrslvha7gs7.R.inc(39041);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39042);assertEquals("The value 6 is not in the specified inclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testInclusiveBetween_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttvbhlu4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetween_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttvbhlu4j(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39043);
        __CLR4_5_2trstrslvha7gs7.R.inc(39044);Validate.inclusiveBetween("a", "c", "b", "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39045);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39046);Validate.inclusiveBetween("0", "5", "6", "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39047);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39048);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testInclusiveBetweenLong()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2chko29u4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetweenLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2chko29u4p(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39049);
        __CLR4_5_2trstrslvha7gs7.R.inc(39050);Validate.inclusiveBetween(0, 2, 1);
        __CLR4_5_2trstrslvha7gs7.R.inc(39051);Validate.inclusiveBetween(0, 2, 2);
        __CLR4_5_2trstrslvha7gs7.R.inc(39052);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39053);Validate.inclusiveBetween(0, 5, 6);
            __CLR4_5_2trstrslvha7gs7.R.inc(39054);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39055);assertEquals("The value 6 is not in the specified inclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testInclusiveBetweenLong_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_279vrnxu4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetweenLong_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_279vrnxu4w(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39056);
        __CLR4_5_2trstrslvha7gs7.R.inc(39057);Validate.inclusiveBetween(0, 2, 1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39058);Validate.inclusiveBetween(0, 2, 2, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39059);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39060);Validate.inclusiveBetween(0, 5, 6, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39061);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39062);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testInclusiveBetweenDouble()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j6v952u53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetweenDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j6v952u53(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39063);
        __CLR4_5_2trstrslvha7gs7.R.inc(39064);Validate.inclusiveBetween(0.1, 2.1, 1.1);
        __CLR4_5_2trstrslvha7gs7.R.inc(39065);Validate.inclusiveBetween(0.1, 2.1, 2.1);
        __CLR4_5_2trstrslvha7gs7.R.inc(39066);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39067);Validate.inclusiveBetween(0.1, 5.1, 6.1);
            __CLR4_5_2trstrslvha7gs7.R.inc(39068);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39069);assertEquals("The value 6.1 is not in the specified inclusive range of 0.1 to 5.1", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testInclusiveBetweenDouble_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lpv3fcu5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetweenDouble_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lpv3fcu5a(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39070);
        __CLR4_5_2trstrslvha7gs7.R.inc(39071);Validate.inclusiveBetween(0.1, 2.1, 1.1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39072);Validate.inclusiveBetween(0.1, 2.1, 2.1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39073);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39074);Validate.inclusiveBetween(0.1, 5.1, 6.1, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39075);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39076);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetween()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yuinelu5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetween",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yuinelu5h(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39077);
        __CLR4_5_2trstrslvha7gs7.R.inc(39078);Validate.exclusiveBetween("a", "c", "b");
        __CLR4_5_2trstrslvha7gs7.R.inc(39079);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39080);Validate.exclusiveBetween("0", "5", "6");
            __CLR4_5_2trstrslvha7gs7.R.inc(39081);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39082);assertEquals("The value 6 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39083);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39084);Validate.exclusiveBetween("0", "5", "5");
            __CLR4_5_2trstrslvha7gs7.R.inc(39085);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39086);assertEquals("The value 5 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetween_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olg0v9u5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetween_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olg0v9u5r(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39087);
        __CLR4_5_2trstrslvha7gs7.R.inc(39088);Validate.exclusiveBetween("a", "c", "b", "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39089);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39090);Validate.exclusiveBetween("0", "5", "6", "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39091);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39092);assertEquals("Error", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39093);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39094);Validate.exclusiveBetween("0", "5", "5", "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39095);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39096);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetweenLong()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tfpsm7u61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetweenLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tfpsm7u61(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39097);
        __CLR4_5_2trstrslvha7gs7.R.inc(39098);Validate.exclusiveBetween(0, 2, 1);
        __CLR4_5_2trstrslvha7gs7.R.inc(39099);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39100);Validate.exclusiveBetween(0, 5, 6);
            __CLR4_5_2trstrslvha7gs7.R.inc(39101);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39102);assertEquals("The value 6 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39103);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39104);Validate.exclusiveBetween(0, 5, 5);
            __CLR4_5_2trstrslvha7gs7.R.inc(39105);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39106);assertEquals("The value 5 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetweenLong_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lvyhdru6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetweenLong_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lvyhdru6b(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39107);
        __CLR4_5_2trstrslvha7gs7.R.inc(39108);Validate.exclusiveBetween(0, 2, 1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39109);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39110);Validate.exclusiveBetween(0, 5, 6, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39111);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39112);assertEquals("Error", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39113);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39114);Validate.exclusiveBetween(0, 5, 5, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39115);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39116);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetweenDouble()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ui6srwu6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetweenDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ui6srwu6l(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39117);
        __CLR4_5_2trstrslvha7gs7.R.inc(39118);Validate.exclusiveBetween(0.1, 2.1, 1.1);
        __CLR4_5_2trstrslvha7gs7.R.inc(39119);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39120);Validate.exclusiveBetween(0.1, 5.1, 6.1);
            __CLR4_5_2trstrslvha7gs7.R.inc(39121);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39122);assertEquals("The value 6.1 is not in the specified exclusive range of 0.1 to 5.1", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39123);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39124);Validate.exclusiveBetween(0.1, 5.1, 5.1);
            __CLR4_5_2trstrslvha7gs7.R.inc(39125);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39126);assertEquals("The value 5.1 is not in the specified exclusive range of 0.1 to 5.1", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testExclusiveBetweenDouble_withMessage()
    {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0qx6u6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetweenDouble_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0qx6u6v(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39127);
        __CLR4_5_2trstrslvha7gs7.R.inc(39128);Validate.exclusiveBetween(0.1, 2.1, 1.1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39129);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39130);Validate.exclusiveBetween(0.1, 5.1, 6.1, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39131);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39132);assertEquals("Error", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39133);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39134);Validate.exclusiveBetween(0.1, 5.1, 5.1, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39135);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39136);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsInstanceOf() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2je21o1u75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2je21o1u75(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39137);
        __CLR4_5_2trstrslvha7gs7.R.inc(39138);Validate.isInstanceOf(String.class, "hi");
        __CLR4_5_2trstrslvha7gs7.R.inc(39139);Validate.isInstanceOf(Integer.class, 1);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsInstanceOfExceptionMessage() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ksbtzu78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOfExceptionMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ksbtzu78(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39140);
        __CLR4_5_2trstrslvha7gs7.R.inc(39141);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39142);Validate.isInstanceOf(List.class, "hi");
            __CLR4_5_2trstrslvha7gs7.R.inc(39143);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39144);assertEquals("Expected type: java.util.List, actual: java.lang.String", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsInstanceOf_withMessage() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ncztrlu7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOf_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ncztrlu7d(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39145);
        __CLR4_5_2trstrslvha7gs7.R.inc(39146);Validate.isInstanceOf(String.class, "hi", "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39147);Validate.isInstanceOf(Integer.class, 1, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39148);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39149);Validate.isInstanceOf(List.class, "hi", "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39150);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39151);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsInstanceOf_withMessageArgs() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ezjriu7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOf_withMessageArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39152,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ezjriu7k(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39152);
        __CLR4_5_2trstrslvha7gs7.R.inc(39153);Validate.isInstanceOf(String.class, "hi", "Error %s=%s", "Name", "Value");
        __CLR4_5_2trstrslvha7gs7.R.inc(39154);Validate.isInstanceOf(Integer.class, 1, "Error %s=%s", "Name", "Value");
        __CLR4_5_2trstrslvha7gs7.R.inc(39155);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39156);Validate.isInstanceOf(List.class, "hi", "Error %s=%s", "Name", "Value");
            __CLR4_5_2trstrslvha7gs7.R.inc(39157);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39158);assertEquals("Error Name=Value", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39159);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39160);Validate.isInstanceOf(List.class, "hi", "Error %s=%s", List.class, "Value");
            __CLR4_5_2trstrslvha7gs7.R.inc(39161);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39162);assertEquals("Error interface java.util.List=Value", e.getMessage());
        }
        __CLR4_5_2trstrslvha7gs7.R.inc(39163);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39164);Validate.isInstanceOf(List.class, "hi", "Error %s=%s", List.class, null);
            __CLR4_5_2trstrslvha7gs7.R.inc(39165);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39166);assertEquals("Error interface java.util.List=null", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsAssignable() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243to2cu7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243to2cu7z(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39167);
        __CLR4_5_2trstrslvha7gs7.R.inc(39168);Validate.isAssignableFrom(CharSequence.class, String.class);
        __CLR4_5_2trstrslvha7gs7.R.inc(39169);Validate.isAssignableFrom(AbstractList.class, ArrayList.class);
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsAssignableExceptionMessage() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28hrlc4u82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignableExceptionMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28hrlc4u82(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39170);
        __CLR4_5_2trstrslvha7gs7.R.inc(39171);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39172);Validate.isAssignableFrom(List.class, String.class);
            __CLR4_5_2trstrslvha7gs7.R.inc(39173);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39174);assertEquals("Cannot assign a java.lang.String to a java.util.List", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

    @Test
    public void testIsAssignable_withMessage() {__CLR4_5_2trstrslvha7gs7.R.globalSliceStart(getClass().getName(),39175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ojm4uu87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2trstrslvha7gs7.R.rethrow($CLV_t2$);}finally{__CLR4_5_2trstrslvha7gs7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignable_withMessage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ojm4uu87(){try{__CLR4_5_2trstrslvha7gs7.R.inc(39175);
        __CLR4_5_2trstrslvha7gs7.R.inc(39176);Validate.isAssignableFrom(CharSequence.class, String.class, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39177);Validate.isAssignableFrom(AbstractList.class, ArrayList.class, "Error");
        __CLR4_5_2trstrslvha7gs7.R.inc(39178);try {
            __CLR4_5_2trstrslvha7gs7.R.inc(39179);Validate.isAssignableFrom(List.class, String.class, "Error");
            __CLR4_5_2trstrslvha7gs7.R.inc(39180);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2trstrslvha7gs7.R.inc(39181);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_5_2trstrslvha7gs7.R.flushNeeded();}}

}
