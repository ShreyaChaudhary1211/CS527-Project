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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 */
public class ArrayUtilsRemoveMultipleTest {static class __CLR4_5_2izyizylvha7ein{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,25452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRemoveAllObjectArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f82h56izy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f82h56izy(){try{__CLR4_5_2izyizylvha7ein.R.inc(24622);
        __CLR4_5_2izyizylvha7ein.R.inc(24623);Object[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24624);array = ArrayUtils.removeAll(new Object[] { "a" }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24625);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24626);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24627);array = ArrayUtils.removeAll(new Object[] { "a", "b" }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24628);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24629);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24630);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c" }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24631);assertArrayEquals(new Object[] { "a" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24632);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24633);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24634);assertArrayEquals(new Object[] { "a", "d" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24635);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24636);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24637);assertArrayEquals(new Object[] { "b", "c" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24638);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24639);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24640);assertArrayEquals(new Object[] { "c" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24641);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24642);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24643);assertArrayEquals(new Object[] { "c", "e" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24644);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24645);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24646);assertArrayEquals(new Object[] { "b", "d" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24647);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24648);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3, 0, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24649);assertArrayEquals(new Object[] { "c" }, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24650);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24651);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 1, 0, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24652);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24653);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24654);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 0, 1, 3, 0, 2, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24655);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_5_2izyizylvha7ein.R.inc(24656);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllObjectArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwaidqj0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwaidqj0x(){try{__CLR4_5_2izyizylvha7ein.R.inc(24657);
        __CLR4_5_2izyizylvha7ein.R.inc(24658);final Object[] array1 = new Object[] { "foo", "bar", "baz" };
        __CLR4_5_2izyizylvha7ein.R.inc(24659);final Object[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24660);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24661);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24662);assertEquals(Object.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllObjectArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lc4dt7j13();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,79,98,106,101,99,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lc4dt7j13(){try{__CLR4_5_2izyizylvha7ein.R.inc(24663);
        __CLR4_5_2izyizylvha7ein.R.inc(24664);ArrayUtils.removeAll(new Object[] { "a", "b" }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllObjectArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25fqsxaj15();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,79,98,106,101,99,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25fqsxaj15(){try{__CLR4_5_2izyizylvha7ein.R.inc(24665);
        __CLR4_5_2izyizylvha7ein.R.inc(24666);ArrayUtils.removeAll(new Object[] { "a", "b" }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullObjectArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29g77kfj17();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,79,98,106,101,99,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24667,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29g77kfj17(){try{__CLR4_5_2izyizylvha7ein.R.inc(24667);
        __CLR4_5_2izyizylvha7ein.R.inc(24668);ArrayUtils.remove((Object[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllNumberArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jpoa4j19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNumberArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jpoa4j19(){try{__CLR4_5_2izyizylvha7ein.R.inc(24669);
        __CLR4_5_2izyizylvha7ein.R.inc(24670);final Number[] inarray = { Integer.valueOf(1), Long.valueOf(2L), Byte.valueOf((byte) 3) };
        __CLR4_5_2izyizylvha7ein.R.inc(24671);assertEquals(3, inarray.length);
        __CLR4_5_2izyizylvha7ein.R.inc(24672);Number[] outarray;

        __CLR4_5_2izyizylvha7ein.R.inc(24673);outarray = ArrayUtils.removeAll(inarray, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24674);assertArrayEquals(new Number[] { Integer.valueOf(1), Byte.valueOf((byte) 3) }, outarray);
        __CLR4_5_2izyizylvha7ein.R.inc(24675);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24676);outarray = ArrayUtils.removeAll(outarray, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24677);assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        __CLR4_5_2izyizylvha7ein.R.inc(24678);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24679);outarray = ArrayUtils.removeAll(outarray, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24680);assertEquals(0, outarray.length);
        __CLR4_5_2izyizylvha7ein.R.inc(24681);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24682);outarray = ArrayUtils.removeAll(inarray, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24683);assertArrayEquals(new Number[] { Byte.valueOf((byte) 3) }, outarray);
        __CLR4_5_2izyizylvha7ein.R.inc(24684);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24685);outarray = ArrayUtils.removeAll(inarray, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24686);assertArrayEquals(new Number[] { Long.valueOf(2L) }, outarray);
        __CLR4_5_2izyizylvha7ein.R.inc(24687);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24688);outarray = ArrayUtils.removeAll(inarray, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24689);assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        __CLR4_5_2izyizylvha7ein.R.inc(24690);assertEquals(Number.class, outarray.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllBooleanArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m5c5mlj1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m5c5mlj1v(){try{__CLR4_5_2izyizylvha7ein.R.inc(24691);
        __CLR4_5_2izyizylvha7ein.R.inc(24692);boolean[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24693);array = ArrayUtils.removeAll(new boolean[] { true }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24694);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24695);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24696);array = ArrayUtils.removeAll(new boolean[] { true, false }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24697);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24698);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24699);array = ArrayUtils.removeAll(new boolean[] { true, false }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24700);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24701);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24702);array = ArrayUtils.removeAll(new boolean[] { true, false, true }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24703);assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24704);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24705);array = ArrayUtils.removeAll(new boolean[] { true, false }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24706);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24707);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24708);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24709);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24710);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24711);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24712);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24713);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24714);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24715);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24716);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24717);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24718);assertTrue(Arrays.equals(new boolean[] { false, false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24719);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24720);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24721);assertTrue(Arrays.equals(new boolean[] { true, true, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24722);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24723);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24724);assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24725);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24726);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24727);assertTrue(Arrays.equals(new boolean[] { false, false, false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24728);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24729);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24730);assertTrue(Arrays.equals(new boolean[] { true, true, true, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24731);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24732);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24733);assertTrue(Arrays.equals(new boolean[] { false, true, false, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24734);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllBooleanArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21b61a7j33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21b61a7j33(){try{__CLR4_5_2izyizylvha7ein.R.inc(24735);
        __CLR4_5_2izyizylvha7ein.R.inc(24736);final boolean[] array1 = new boolean[] { true, false };
        __CLR4_5_2izyizylvha7ein.R.inc(24737);final boolean[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24738);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24739);assertTrue(Arrays.equals(array1, array2));
        __CLR4_5_2izyizylvha7ein.R.inc(24740);assertEquals(boolean.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllBooleanArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nk9i08j39();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,111,111,108,101,97,110,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nk9i08j39(){try{__CLR4_5_2izyizylvha7ein.R.inc(24741);
        __CLR4_5_2izyizylvha7ein.R.inc(24742);ArrayUtils.removeAll(new boolean[] { true, false }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllBooleanArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qgy3zvj3b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,111,111,108,101,97,110,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qgy3zvj3b(){try{__CLR4_5_2izyizylvha7ein.R.inc(24743);
        __CLR4_5_2izyizylvha7ein.R.inc(24744);ArrayUtils.removeAll(new boolean[] { true, false }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullBooleanArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wfvknej3d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,66,111,111,108,101,97,110,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wfvknej3d(){try{__CLR4_5_2izyizylvha7ein.R.inc(24745);
        __CLR4_5_2izyizylvha7ein.R.inc(24746);ArrayUtils.removeAll((boolean[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllByteArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bd376bj3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bd376bj3f(){try{__CLR4_5_2izyizylvha7ein.R.inc(24747);
        __CLR4_5_2izyizylvha7ein.R.inc(24748);byte[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24749);array = ArrayUtils.removeAll(new byte[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24750);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24751);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24752);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24753);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24754);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24755);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24756);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24757);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24758);array = ArrayUtils.removeAll(new byte[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24759);assertTrue(Arrays.equals(new byte[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24760);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24761);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24762);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24763);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24764);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24765);assertTrue(Arrays.equals(new byte[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24766);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24767);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24768);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24769);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24770);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24771);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24772);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24773);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24774);assertTrue(Arrays.equals(new byte[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24775);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24776);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24777);assertTrue(Arrays.equals(new byte[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24778);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24779);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24780);assertTrue(Arrays.equals(new byte[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24781);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24782);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24783);assertTrue(Arrays.equals(new byte[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24784);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllByteArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2noxl3rj4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2noxl3rj4h(){try{__CLR4_5_2izyizylvha7ein.R.inc(24785);
        __CLR4_5_2izyizylvha7ein.R.inc(24786);final byte[] array1 = new byte[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(24787);final byte[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24788);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24789);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24790);assertEquals(byte.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllByteArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24luabmj4n();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,121,116,101,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24luabmj4n(){try{__CLR4_5_2izyizylvha7ein.R.inc(24791);
        __CLR4_5_2izyizylvha7ein.R.inc(24792);ArrayUtils.removeAll(new byte[] { 1, 2 }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllByteArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2em5g4bj4p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,121,116,101,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2em5g4bj4p(){try{__CLR4_5_2izyizylvha7ein.R.inc(24793);
        __CLR4_5_2izyizylvha7ein.R.inc(24794);ArrayUtils.removeAll(new byte[] { 1, 2 }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullByteArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q4wl8mj4r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,66,121,116,101,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q4wl8mj4r(){try{__CLR4_5_2izyizylvha7ein.R.inc(24795);
        __CLR4_5_2izyizylvha7ein.R.inc(24796);ArrayUtils.removeAll((byte[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllCharArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rwh2apj4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rwh2apj4t(){try{__CLR4_5_2izyizylvha7ein.R.inc(24797);
        __CLR4_5_2izyizylvha7ein.R.inc(24798);char[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24799);array = ArrayUtils.removeAll(new char[] { 'a' }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24800);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24801);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24802);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24803);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24804);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24805);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24806);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24807);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24808);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24809);assertTrue(Arrays.equals(new char[] { 'a', 'c' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24810);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24811);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24812);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24813);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24814);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24815);assertTrue(Arrays.equals(new char[] { 'c' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24816);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24817);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24818);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24819);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24820);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24821);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24822);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24823);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24824);assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24825);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24826);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24827);assertTrue(Arrays.equals(new char[] { 'b', 'd' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24828);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24829);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24830);assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e', 'g' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24831);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24832);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24833);assertTrue(Arrays.equals(new char[] { 'b', 'd', 'f' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24834);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllCharArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_233c291j5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_233c291j5v(){try{__CLR4_5_2izyizylvha7ein.R.inc(24835);
        __CLR4_5_2izyizylvha7ein.R.inc(24836);final char[] array1 = new char[] { 'a', 'b' };
        __CLR4_5_2izyizylvha7ein.R.inc(24837);final char[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24838);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24839);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24840);assertEquals(char.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllCharArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2isjnhwj61();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,67,104,97,114,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2isjnhwj61(){try{__CLR4_5_2izyizylvha7ein.R.inc(24841);
        __CLR4_5_2izyizylvha7ein.R.inc(24842);ArrayUtils.removeAll(new char[] { 'a', 'b' }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllCharArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22z052hj63();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,67,104,97,114,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22z052hj63(){try{__CLR4_5_2izyizylvha7ein.R.inc(24843);
        __CLR4_5_2izyizylvha7ein.R.inc(24844);ArrayUtils.removeAll(new char[] { 'a', 'b' }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullCharArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29liq48j65();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,67,104,97,114,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29liq48j65(){try{__CLR4_5_2izyizylvha7ein.R.inc(24845);
        __CLR4_5_2izyizylvha7ein.R.inc(24846);ArrayUtils.removeAll((char[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllDoubleArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294gof8j67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294gof8j67(){try{__CLR4_5_2izyizylvha7ein.R.inc(24847);
        __CLR4_5_2izyizylvha7ein.R.inc(24848);double[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24849);array = ArrayUtils.removeAll(new double[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24850);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24851);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24852);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24853);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24854);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24855);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24856);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24857);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24858);array = ArrayUtils.removeAll(new double[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24859);assertTrue(Arrays.equals(new double[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24860);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24861);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24862);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24863);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24864);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24865);assertTrue(Arrays.equals(new double[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24866);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24867);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24868);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24869);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24870);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24871);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24872);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24873);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24874);assertTrue(Arrays.equals(new double[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24875);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24876);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24877);assertTrue(Arrays.equals(new double[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24878);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24879);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24880);assertTrue(Arrays.equals(new double[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24881);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24882);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24883);assertTrue(Arrays.equals(new double[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24884);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllDoubleArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgwg80j79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgwg80j79(){try{__CLR4_5_2izyizylvha7ein.R.inc(24885);
        __CLR4_5_2izyizylvha7ein.R.inc(24886);final double[] array1 = new double[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(24887);final double[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24888);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24889);assertTrue(Arrays.equals(array1, array2));
        __CLR4_5_2izyizylvha7ein.R.inc(24890);assertEquals(double.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllDoubleArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22y2jvdj7f();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,68,111,117,98,108,101,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22y2jvdj7f(){try{__CLR4_5_2izyizylvha7ein.R.inc(24891);
        __CLR4_5_2izyizylvha7ein.R.inc(24892);ArrayUtils.removeAll(new double[] { 1, 2 }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllDoubleArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29jqme4j7h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,68,111,117,98,108,101,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29jqme4j7h(){try{__CLR4_5_2izyizylvha7ein.R.inc(24893);
        __CLR4_5_2izyizylvha7ein.R.inc(24894);ArrayUtils.removeAll(new double[] { 1, 2 }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullDoubleArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsqd4tj7j();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,68,111,117,98,108,101,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsqd4tj7j(){try{__CLR4_5_2izyizylvha7ein.R.inc(24895);
        __CLR4_5_2izyizylvha7ein.R.inc(24896);ArrayUtils.removeAll((double[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllFloatArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wqz3zlj7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wqz3zlj7l(){try{__CLR4_5_2izyizylvha7ein.R.inc(24897);
        __CLR4_5_2izyizylvha7ein.R.inc(24898);float[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24899);array = ArrayUtils.removeAll(new float[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24900);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24901);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24902);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24903);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24904);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24905);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24906);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24907);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24908);array = ArrayUtils.removeAll(new float[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24909);assertTrue(Arrays.equals(new float[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24910);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24911);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24912);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24913);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24914);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24915);assertTrue(Arrays.equals(new float[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24916);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24917);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24918);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24919);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24920);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24921);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24922);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24923);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24924);assertTrue(Arrays.equals(new float[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24925);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24926);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24927);assertTrue(Arrays.equals(new float[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24928);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24929);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24930);assertTrue(Arrays.equals(new float[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24931);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24932);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24933);assertTrue(Arrays.equals(new float[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24934);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllFloatArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbqir9j8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbqir9j8n(){try{__CLR4_5_2izyizylvha7ein.R.inc(24935);
        __CLR4_5_2izyizylvha7ein.R.inc(24936);final float[] array1 = new float[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(24937);final float[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24938);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24939);assertTrue(Arrays.equals(array1, array2));
        __CLR4_5_2izyizylvha7ein.R.inc(24940);assertEquals(float.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllFloatArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rgq58j8t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,70,108,111,97,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rgq58j8t(){try{__CLR4_5_2izyizylvha7ein.R.inc(24941);
        __CLR4_5_2izyizylvha7ein.R.inc(24942);ArrayUtils.removeAll(new float[] { 1, 2 }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllFloatArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n4r3qxj8v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,70,108,111,97,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n4r3qxj8v(){try{__CLR4_5_2izyizylvha7ein.R.inc(24943);
        __CLR4_5_2izyizylvha7ein.R.inc(24944);ArrayUtils.removeAll(new float[] { 1, 2 }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullFloatArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qyiqyj8x();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,70,108,111,97,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qyiqyj8x(){try{__CLR4_5_2izyizylvha7ein.R.inc(24945);
        __CLR4_5_2izyizylvha7ein.R.inc(24946);ArrayUtils.removeAll((float[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllIntArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g4ebgcj8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g4ebgcj8z(){try{__CLR4_5_2izyizylvha7ein.R.inc(24947);
        __CLR4_5_2izyizylvha7ein.R.inc(24948);int[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(24949);array = ArrayUtils.removeAll(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.EMPTY_INT_ARRAY);
        __CLR4_5_2izyizylvha7ein.R.inc(24950);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));

        __CLR4_5_2izyizylvha7ein.R.inc(24951);array = ArrayUtils.removeAll(new int[] { 1 }, ArrayUtils.EMPTY_INT_ARRAY);
        __CLR4_5_2izyizylvha7ein.R.inc(24952);assertTrue(Arrays.equals(new int[] { 1 }, array));

        __CLR4_5_2izyizylvha7ein.R.inc(24953);array = ArrayUtils.removeAll(new int[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24954);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24955);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24956);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(24957);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24958);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24959);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24960);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24961);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24962);array = ArrayUtils.removeAll(new int[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24963);assertTrue(Arrays.equals(new int[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24964);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24965);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24966);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24967);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24968);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(24969);assertTrue(Arrays.equals(new int[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24970);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24971);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24972);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24973);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24974);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(24975);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24976);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24977);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(24978);assertTrue(Arrays.equals(new int[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24979);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24980);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(24981);assertTrue(Arrays.equals(new int[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24982);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24983);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(24984);assertTrue(Arrays.equals(new int[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24985);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(24986);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(24987);assertTrue(Arrays.equals(new int[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(24988);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllIntArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xeacvsja5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xeacvsja5(){try{__CLR4_5_2izyizylvha7ein.R.inc(24989);
        __CLR4_5_2izyizylvha7ein.R.inc(24990);final int[] array1 = new int[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(24991);final int[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(24992);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24993);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(24994);assertEquals(int.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllIntArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gftzw1jab();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,73,110,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gftzw1jab(){try{__CLR4_5_2izyizylvha7ein.R.inc(24995);
        __CLR4_5_2izyizylvha7ein.R.inc(24996);ArrayUtils.removeAll(new int[] { 1, 2 }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllIntArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ebn0sjad();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,73,110,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ebn0sjad(){try{__CLR4_5_2izyizylvha7ein.R.inc(24997);
        __CLR4_5_2izyizylvha7ein.R.inc(24998);ArrayUtils.removeAll(new int[] { 1, 2 }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullIntArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),24999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o7epc3jaf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,73,110,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o7epc3jaf(){try{__CLR4_5_2izyizylvha7ein.R.inc(24999);
        __CLR4_5_2izyizylvha7ein.R.inc(25000);ArrayUtils.removeAll((int[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllLongArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27au83rjah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25001,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27au83rjah(){try{__CLR4_5_2izyizylvha7ein.R.inc(25001);
        __CLR4_5_2izyizylvha7ein.R.inc(25002);long[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25003);array = ArrayUtils.removeAll(new long[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(25004);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25005);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25006);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(25007);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25008);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25009);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25010);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25011);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25012);array = ArrayUtils.removeAll(new long[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25013);assertTrue(Arrays.equals(new long[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25014);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25015);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25016);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25017);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25018);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25019);assertTrue(Arrays.equals(new long[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25020);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25021);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25022);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25023);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25024);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25025);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25026);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25027);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(25028);assertTrue(Arrays.equals(new long[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25029);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25030);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(25031);assertTrue(Arrays.equals(new long[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25032);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25033);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(25034);assertTrue(Arrays.equals(new long[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25035);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25036);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(25037);assertTrue(Arrays.equals(new long[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25038);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllLongArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvavt7jbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvavt7jbj(){try{__CLR4_5_2izyizylvha7ein.R.inc(25039);
        __CLR4_5_2izyizylvha7ein.R.inc(25040);final long[] array1 = new long[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(25041);final long[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(25042);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(25043);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(25044);assertEquals(long.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllLongArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gg7rxujbp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,76,111,110,103,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gg7rxujbp(){try{__CLR4_5_2izyizylvha7ein.R.inc(25045);
        __CLR4_5_2izyizylvha7ein.R.inc(25046);ArrayUtils.removeAll(new long[] { 1, 2 }, -1);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllLongArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ox85gxjbr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,76,111,110,103,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ox85gxjbr(){try{__CLR4_5_2izyizylvha7ein.R.inc(25047);
        __CLR4_5_2izyizylvha7ein.R.inc(25048);ArrayUtils.removeAll(new long[] { 1, 2 }, 2);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullLongArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u75kb6jbt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,76,111,110,103,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u75kb6jbt(){try{__CLR4_5_2izyizylvha7ein.R.inc(25049);
        __CLR4_5_2izyizylvha7ein.R.inc(25050);ArrayUtils.removeAll((long[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllShortArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dak6pbjbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dak6pbjbv(){try{__CLR4_5_2izyizylvha7ein.R.inc(25051);
        __CLR4_5_2izyizylvha7ein.R.inc(25052);short[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25053);array = ArrayUtils.removeAll(new short[] { 1 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(25054);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25055);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25056);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0);
        __CLR4_5_2izyizylvha7ein.R.inc(25057);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25058);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25059);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25060);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25061);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25062);array = ArrayUtils.removeAll(new short[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25063);assertTrue(Arrays.equals(new short[] { 1, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25064);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25065);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25066);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25067);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25068);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25069);assertTrue(Arrays.equals(new short[] { 3 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25070);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25071);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25072);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25073);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25074);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25075);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25076);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25077);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_5_2izyizylvha7ein.R.inc(25078);assertTrue(Arrays.equals(new short[] { 1, 3, 5 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25079);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25080);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_5_2izyizylvha7ein.R.inc(25081);assertTrue(Arrays.equals(new short[] { 2, 4 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25082);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25083);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_5_2izyizylvha7ein.R.inc(25084);assertTrue(Arrays.equals(new short[] { 1, 3, 5, 7 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25085);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25086);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_5_2izyizylvha7ein.R.inc(25087);assertTrue(Arrays.equals(new short[] { 2, 4, 6 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25088);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveAllShortArrayRemoveNone() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6gynfjcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayRemoveNone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6gynfjcx(){try{__CLR4_5_2izyizylvha7ein.R.inc(25089);
        __CLR4_5_2izyizylvha7ein.R.inc(25090);final short[] array1 = new short[] { 1, 2 };
        __CLR4_5_2izyizylvha7ein.R.inc(25091);final short[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_5_2izyizylvha7ein.R.inc(25092);assertNotSame(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(25093);assertArrayEquals(array1, array2);
        __CLR4_5_2izyizylvha7ein.R.inc(25094);assertEquals(short.class, array2.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllShortArrayNegativeIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kurb0kjd3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,83,104,111,114,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayNegativeIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kurb0kjd3(){try{__CLR4_5_2izyizylvha7ein.R.inc(25095);
        __CLR4_5_2izyizylvha7ein.R.inc(25096);ArrayUtils.removeAll(new short[] { 1, 2 }, -1, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllShortArrayOutOfBoundsIndex() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ps43dzjd5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,83,104,111,114,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayOutOfBoundsIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ps43dzjd5(){try{__CLR4_5_2izyizylvha7ein.R.inc(25097);
        __CLR4_5_2izyizylvha7ein.R.inc(25098);ArrayUtils.removeAll(new short[] { 1, 2 }, 2, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullShortArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqja16jd7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,83,104,111,114,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqja16jd7(){try{__CLR4_5_2izyizylvha7ein.R.inc(25099);
        __CLR4_5_2izyizylvha7ein.R.inc(25100);ArrayUtils.removeAll((short[]) null, 0);
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementsObjectArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pgd69gjd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementsObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25101,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pgd69gjd9(){try{__CLR4_5_2izyizylvha7ein.R.inc(25101);
        __CLR4_5_2izyizylvha7ein.R.inc(25102);Object[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25103);array = ArrayUtils.removeElements((Object[]) null, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25104);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25105);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25106);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25107);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25108);array = ArrayUtils.removeElements(new Object[] { "a" }, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25109);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25110);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25111);array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25112);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25113);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25114);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25115);assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25116);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25117);array = ArrayUtils.removeElements((Object[]) null, "a", "b");
        __CLR4_5_2izyizylvha7ein.R.inc(25118);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25119);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a", "b");
        __CLR4_5_2izyizylvha7ein.R.inc(25120);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25121);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25122);array = ArrayUtils.removeElements(new Object[] { "a" }, "a", "b");
        __CLR4_5_2izyizylvha7ein.R.inc(25123);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25124);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25125);array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a", "c");
        __CLR4_5_2izyizylvha7ein.R.inc(25126);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25127);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25128);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25129);assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25130);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25131);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "b");
        __CLR4_5_2izyizylvha7ein.R.inc(25132);assertTrue(Arrays.equals(new Object[] { "a" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25133);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25134);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25135);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25136);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25137);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a", "a", "a");
        __CLR4_5_2izyizylvha7ein.R.inc(25138);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25139);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementBooleanArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l0d7gijec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l0d7gijec(){try{__CLR4_5_2izyizylvha7ein.R.inc(25140);
        __CLR4_5_2izyizylvha7ein.R.inc(25141);boolean[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25142);array = ArrayUtils.removeElements((boolean[]) null, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25143);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25144);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25145);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25146);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25147);array = ArrayUtils.removeElements(new boolean[] { true }, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25148);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25149);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25150);array = ArrayUtils.removeElements(new boolean[] { true, false }, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25151);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25152);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25153);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25154);assertTrue(Arrays.equals(new boolean[] { false, true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25155);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25156);array = ArrayUtils.removeElements((boolean[]) null, true, false);
        __CLR4_5_2izyizylvha7ein.R.inc(25157);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25158);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true, false);
        __CLR4_5_2izyizylvha7ein.R.inc(25159);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25160);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25161);array = ArrayUtils.removeElements(new boolean[] { true }, true, false);
        __CLR4_5_2izyizylvha7ein.R.inc(25162);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25163);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25164);array = ArrayUtils.removeElements(new boolean[] { true, false }, true, false);
        __CLR4_5_2izyizylvha7ein.R.inc(25165);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25166);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25167);array = ArrayUtils.removeElements(new boolean[] { true, false }, true, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25168);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25169);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25170);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, false);
        __CLR4_5_2izyizylvha7ein.R.inc(25171);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25172);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25173);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25174);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25175);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25176);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, true, true, true);
        __CLR4_5_2izyizylvha7ein.R.inc(25177);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25178);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementByteArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sz2coejff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sz2coejff(){try{__CLR4_5_2izyizylvha7ein.R.inc(25179);
        __CLR4_5_2izyizylvha7ein.R.inc(25180);byte[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25181);array = ArrayUtils.removeElements((byte[]) null, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25182);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25183);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25184);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25185);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25186);array = ArrayUtils.removeElements(new byte[] { 1 }, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25187);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25188);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25189);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25190);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25191);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25192);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25193);assertTrue(Arrays.equals(new byte[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25194);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25195);array = ArrayUtils.removeElements((byte[]) null, (byte) 1, (byte) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25196);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25197);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1, (byte) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25198);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25199);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25200);array = ArrayUtils.removeElements(new byte[] { 1 }, (byte) 1, (byte) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25201);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25202);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25203);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1, (byte) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25204);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25205);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25206);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25207);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25208);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25209);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25210);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25211);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25212);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25213);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25214);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25215);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 1, (byte) 1, (byte) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25216);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25217);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementCharArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pinu6cjgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pinu6cjgi(){try{__CLR4_5_2izyizylvha7ein.R.inc(25218);
        __CLR4_5_2izyizylvha7ein.R.inc(25219);char[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25220);array = ArrayUtils.removeElements((char[]) null, 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25221);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25222);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_CHAR_ARRAY, 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25223);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25224);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25225);array = ArrayUtils.removeElements(new char[] { 'a' }, 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25226);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25227);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25228);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25229);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25230);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25231);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25232);assertTrue(Arrays.equals(new char[] { 'b', 'a' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25233);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25234);array = ArrayUtils.removeElements((char[]) null, 'a', 'b');
        __CLR4_5_2izyizylvha7ein.R.inc(25235);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25236);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_CHAR_ARRAY, 'a', 'b');
        __CLR4_5_2izyizylvha7ein.R.inc(25237);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25238);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25239);array = ArrayUtils.removeElements(new char[] { 'a' }, 'a', 'b');
        __CLR4_5_2izyizylvha7ein.R.inc(25240);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25241);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25242);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a', 'b');
        __CLR4_5_2izyizylvha7ein.R.inc(25243);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25244);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25245);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a', 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25246);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25247);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25248);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'b');
        __CLR4_5_2izyizylvha7ein.R.inc(25249);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25250);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25251);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25252);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25253);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25254);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'a', 'a', 'a');
        __CLR4_5_2izyizylvha7ein.R.inc(25255);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25256);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementDoubleArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296456fjhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296456fjhl(){try{__CLR4_5_2izyizylvha7ein.R.inc(25257);
        __CLR4_5_2izyizylvha7ein.R.inc(25258);double[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25259);array = ArrayUtils.removeElements((double[]) null, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25260);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25261);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25262);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25263);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25264);array = ArrayUtils.removeElements(new double[] { 1 }, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25265);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25266);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25267);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25268);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25269);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25270);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25271);assertTrue(Arrays.equals(new double[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25272);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25273);array = ArrayUtils.removeElements((double[]) null, (double) 1, (double) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25274);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25275);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1, (double) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25276);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25277);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25278);array = ArrayUtils.removeElements(new double[] { 1 }, (double) 1, (double) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25279);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25280);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25281);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1, (double) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25282);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25283);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25284);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25285);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25286);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25287);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25288);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25289);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25290);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25291);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25292);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25293);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 1, (double) 1, (double) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25294);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25295);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementFloatArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2afcerajio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2afcerajio(){try{__CLR4_5_2izyizylvha7ein.R.inc(25296);
        __CLR4_5_2izyizylvha7ein.R.inc(25297);float[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25298);array = ArrayUtils.removeElements((float[]) null, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25299);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25300);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25301);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25302);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25303);array = ArrayUtils.removeElements(new float[] { 1 }, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25304);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25305);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25306);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25307);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25308);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25309);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25310);assertTrue(Arrays.equals(new float[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25311);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25312);array = ArrayUtils.removeElements((float[]) null, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25313);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25314);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25315);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25316);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25317);array = ArrayUtils.removeElements(new float[] { 1 }, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25318);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25319);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25320);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1, (float) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25321);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25322);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25323);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25324);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25325);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25326);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25327);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25328);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25329);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25330);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25331);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25332);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 1, (float) 1, (float) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25333);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25334);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementIntArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k4x6rbjjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k4x6rbjjr(){try{__CLR4_5_2izyizylvha7ein.R.inc(25335);
        __CLR4_5_2izyizylvha7ein.R.inc(25336);int[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25337);array = ArrayUtils.removeElements((int[]) null, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25338);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25339);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_INT_ARRAY, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25340);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25341);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25342);array = ArrayUtils.removeElements(new int[] { 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25343);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25344);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25345);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25346);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25347);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25348);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25349);assertTrue(Arrays.equals(new int[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25350);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25351);array = ArrayUtils.removeElements((int[]) null, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25352);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25353);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_INT_ARRAY, 1, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25354);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25355);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25356);array = ArrayUtils.removeElements(new int[] { 1 }, 1, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25357);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25358);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25359);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25360);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25361);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25362);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25363);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25364);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25365);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25366);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25367);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25368);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25369);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25370);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25371);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 1, 1, 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25372);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25373);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementLongArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owtdlujku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owtdlujku(){try{__CLR4_5_2izyizylvha7ein.R.inc(25374);
        __CLR4_5_2izyizylvha7ein.R.inc(25375);long[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25376);array = ArrayUtils.removeElements((long[]) null, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25377);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25378);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_LONG_ARRAY, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25379);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25380);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25381);array = ArrayUtils.removeElements(new long[] { 1 }, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25382);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25383);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25384);array = ArrayUtils.removeElements(new long[] { 1, 2 }, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25385);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25386);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25387);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25388);assertTrue(Arrays.equals(new long[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25389);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25390);array = ArrayUtils.removeElements((long[]) null, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25391);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25392);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_LONG_ARRAY, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25393);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25394);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25395);array = ArrayUtils.removeElements(new long[] { 1 }, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25396);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25397);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25398);array = ArrayUtils.removeElements(new long[] { 1, 2 }, 1L, 2L);
        __CLR4_5_2izyizylvha7ein.R.inc(25399);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25400);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25401);array = ArrayUtils.removeElements(new long[] { 1, 2 }, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25402);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25403);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25404);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25405);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25406);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25407);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, 1L, 2L);
        __CLR4_5_2izyizylvha7ein.R.inc(25408);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25409);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25410);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, 1L, 1L, 1L, 1L);
        __CLR4_5_2izyizylvha7ein.R.inc(25411);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25412);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

    @Test
    public void testRemoveElementShortArray() {__CLR4_5_2izyizylvha7ein.R.globalSliceStart(getClass().getName(),25413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zex61ijlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2izyizylvha7ein.R.rethrow($CLV_t2$);}finally{__CLR4_5_2izyizylvha7ein.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zex61ijlx(){try{__CLR4_5_2izyizylvha7ein.R.inc(25413);
        __CLR4_5_2izyizylvha7ein.R.inc(25414);short[] array;

        __CLR4_5_2izyizylvha7ein.R.inc(25415);array = ArrayUtils.removeElements((short[]) null, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25416);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25417);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25418);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25419);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25420);array = ArrayUtils.removeElements(new short[] { 1 }, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25421);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25422);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25423);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25424);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25425);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25426);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25427);assertTrue(Arrays.equals(new short[] { 2, 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25428);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25429);array = ArrayUtils.removeElements((short[]) null, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25430);assertNull(array);

        __CLR4_5_2izyizylvha7ein.R.inc(25431);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25432);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25433);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25434);array = ArrayUtils.removeElements(new short[] { 1 }, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25435);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25436);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25437);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1, (short) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25438);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25439);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25440);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25441);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25442);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25443);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25444);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25445);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25446);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 2);
        __CLR4_5_2izyizylvha7ein.R.inc(25447);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25448);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_5_2izyizylvha7ein.R.inc(25449);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 1, (short) 1, (short) 1);
        __CLR4_5_2izyizylvha7ein.R.inc(25450);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_5_2izyizylvha7ein.R.inc(25451);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2izyizylvha7ein.R.flushNeeded();}}

}
