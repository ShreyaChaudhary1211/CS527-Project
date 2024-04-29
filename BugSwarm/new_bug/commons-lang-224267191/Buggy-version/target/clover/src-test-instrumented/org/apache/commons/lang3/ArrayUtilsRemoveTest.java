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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 */
public class ArrayUtilsRemoveTest {static class __CLR4_5_2jn0jn0lvha7epm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,25933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRemoveObjectArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22m0dxjn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22m0dxjn0(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25452);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25453);Object[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25454);array = ArrayUtils.remove(new Object[] {"a"}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25455);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25456);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25457);array = ArrayUtils.remove(new Object[] {"a", "b"}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25458);assertTrue(Arrays.equals(new Object[] {"b"}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25459);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25460);array = ArrayUtils.remove(new Object[] {"a", "b"}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25461);assertTrue(Arrays.equals(new Object[] {"a"}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25462);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25463);array = ArrayUtils.remove(new Object[] {"a", "b", "c"}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25464);assertTrue(Arrays.equals(new Object[] {"a", "c"}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25465);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25466);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25467);ArrayUtils.remove(new Object[] {"a", "b"}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25468);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25469);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25470);ArrayUtils.remove(new Object[] {"a", "b"}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25471);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25472);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25473);ArrayUtils.remove((Object[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25474);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveNumberArray(){__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fp651djnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveNumberArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fp651djnn(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25475);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25476);final Number[] inarray = {Integer.valueOf(1),Long.valueOf(2),Byte.valueOf((byte) 3)};
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25477);assertEquals(3, inarray.length);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25478);Number[] outarray;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25479);outarray = ArrayUtils.remove(inarray, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25480);assertEquals(2, outarray.length);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25481);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25482);outarray = ArrayUtils.remove(outarray, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25483);assertEquals(1, outarray.length);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25484);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25485);outarray = ArrayUtils.remove(outarray, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25486);assertEquals(0, outarray.length);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25487);assertEquals(Number.class, outarray.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveBooleanArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ld5xzijo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ld5xzijo0(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25488);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25489);boolean[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25490);array = ArrayUtils.remove(new boolean[] {true}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25491);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25492);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25493);array = ArrayUtils.remove(new boolean[] {true, false}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25494);assertTrue(Arrays.equals(new boolean[] {false}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25495);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25496);array = ArrayUtils.remove(new boolean[] {true, false}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25497);assertTrue(Arrays.equals(new boolean[] {true}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25498);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25499);array = ArrayUtils.remove(new boolean[] {true, false, true}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25500);assertTrue(Arrays.equals(new boolean[] {true, true}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25501);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25502);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25503);ArrayUtils.remove(new boolean[] {true, false}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25504);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25505);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25506);ArrayUtils.remove(new boolean[] {true, false}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25507);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25508);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25509);ArrayUtils.remove((boolean[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25510);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveByteArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hmp2wujon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hmp2wujon(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25511);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25512);byte[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25513);array = ArrayUtils.remove(new byte[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25514);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25515);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25516);array = ArrayUtils.remove(new byte[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25517);assertTrue(Arrays.equals(new byte[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25518);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25519);array = ArrayUtils.remove(new byte[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25520);assertTrue(Arrays.equals(new byte[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25521);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25522);array = ArrayUtils.remove(new byte[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25523);assertTrue(Arrays.equals(new byte[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25524);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25525);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25526);ArrayUtils.remove(new byte[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25527);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25528);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25529);ArrayUtils.remove(new byte[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25530);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25531);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25532);ArrayUtils.remove((byte[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25533);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveCharArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y62y18jpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y62y18jpa(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25534);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25535);char[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25536);array = ArrayUtils.remove(new char[] {'a'}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25537);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25538);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25539);array = ArrayUtils.remove(new char[] {'a', 'b'}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25540);assertTrue(Arrays.equals(new char[] {'b'}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25541);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25542);array = ArrayUtils.remove(new char[] {'a', 'b'}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25543);assertTrue(Arrays.equals(new char[] {'a'}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25544);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25545);array = ArrayUtils.remove(new char[] {'a', 'b', 'c'}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25546);assertTrue(Arrays.equals(new char[] {'a', 'c'}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25547);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25548);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25549);ArrayUtils.remove(new char[] {'a', 'b'}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25550);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25551);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25552);ArrayUtils.remove(new char[] {'a', 'b'}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25553);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25554);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25555);ArrayUtils.remove((char[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25556);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveDoubleArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o9x56hjpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o9x56hjpx(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25557);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25558);double[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25559);array = ArrayUtils.remove(new double[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25560);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25561);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25562);array = ArrayUtils.remove(new double[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25563);assertTrue(Arrays.equals(new double[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25564);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25565);array = ArrayUtils.remove(new double[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25566);assertTrue(Arrays.equals(new double[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25567);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25568);array = ArrayUtils.remove(new double[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25569);assertTrue(Arrays.equals(new double[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25570);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25571);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25572);ArrayUtils.remove(new double[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25573);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25574);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25575);ArrayUtils.remove(new double[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25576);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25577);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25578);ArrayUtils.remove((double[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25579);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveFloatArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dxh9wmjqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dxh9wmjqk(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25580);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25581);float[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25582);array = ArrayUtils.remove(new float[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25583);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25584);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25585);array = ArrayUtils.remove(new float[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25586);assertTrue(Arrays.equals(new float[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25587);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25588);array = ArrayUtils.remove(new float[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25589);assertTrue(Arrays.equals(new float[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25590);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25591);array = ArrayUtils.remove(new float[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25592);assertTrue(Arrays.equals(new float[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25593);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25594);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25595);ArrayUtils.remove(new float[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25596);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25597);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25598);ArrayUtils.remove(new float[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25599);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25600);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25601);ArrayUtils.remove((float[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25602);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveIntArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2to1mfbjr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2to1mfbjr7(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25603);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25604);int[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25605);array = ArrayUtils.remove(new int[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25606);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25607);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25608);array = ArrayUtils.remove(new int[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25609);assertTrue(Arrays.equals(new int[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25610);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25611);array = ArrayUtils.remove(new int[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25612);assertTrue(Arrays.equals(new int[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25613);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25614);array = ArrayUtils.remove(new int[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25615);assertTrue(Arrays.equals(new int[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25616);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25617);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25618);ArrayUtils.remove(new int[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25619);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25620);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25621);ArrayUtils.remove(new int[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25622);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25623);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25624);ArrayUtils.remove((int[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25625);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveLongArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dkg3uajru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dkg3uajru(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25626);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25627);long[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25628);array = ArrayUtils.remove(new long[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25629);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25630);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25631);array = ArrayUtils.remove(new long[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25632);assertTrue(Arrays.equals(new long[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25633);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25634);array = ArrayUtils.remove(new long[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25635);assertTrue(Arrays.equals(new long[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25636);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25637);array = ArrayUtils.remove(new long[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25638);assertTrue(Arrays.equals(new long[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25639);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25640);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25641);ArrayUtils.remove(new long[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25642);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25643);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25644);ArrayUtils.remove(new long[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25645);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25646);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25647);ArrayUtils.remove((long[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25648);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveShortArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w420sajsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w420sajsh(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25649);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25650);short[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25651);array = ArrayUtils.remove(new short[] {1}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25652);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25653);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25654);array = ArrayUtils.remove(new short[] {1, 2}, 0);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25655);assertTrue(Arrays.equals(new short[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25656);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25657);array = ArrayUtils.remove(new short[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25658);assertTrue(Arrays.equals(new short[] {1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25659);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25660);array = ArrayUtils.remove(new short[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25661);assertTrue(Arrays.equals(new short[] {1, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25662);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25663);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25664);ArrayUtils.remove(new short[] {1, 2}, -1);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25665);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25666);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25667);ArrayUtils.remove(new short[] {1, 2}, 2);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25668);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25669);try {
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25670);ArrayUtils.remove((short[]) null, 0);
            __CLR4_5_2jn0jn0lvha7epm.R.inc(25671);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementObjectArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xinaqtjt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xinaqtjt4(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25672);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25673);Object[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25674);array = ArrayUtils.removeElement(null, "a");
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25675);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25676);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_OBJECT_ARRAY, "a");
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25677);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25678);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25679);array = ArrayUtils.removeElement(new Object[] {"a"}, "a");
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25680);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25681);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25682);array = ArrayUtils.removeElement(new Object[] {"a", "b"}, "a");
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25683);assertTrue(Arrays.equals(new Object[] {"b"}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25684);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25685);array = ArrayUtils.removeElement(new Object[] {"a", "b", "a"}, "a");
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25686);assertTrue(Arrays.equals(new Object[] {"b", "a"}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25687);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementBooleanArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l0d7gijtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l0d7gijtk(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25688);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25689);boolean[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25690);array = ArrayUtils.removeElement(null, true);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25691);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25692);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25693);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25694);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25695);array = ArrayUtils.removeElement(new boolean[] {true}, true);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25696);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25697);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25698);array = ArrayUtils.removeElement(new boolean[] {true, false}, true);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25699);assertTrue(Arrays.equals(new boolean[] {false}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25700);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25701);array = ArrayUtils.removeElement(new boolean[] {true, false, true}, true);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25702);assertTrue(Arrays.equals(new boolean[] {false, true}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25703);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementByteArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sz2coeju0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sz2coeju0(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25704);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25705);byte[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25706);array = ArrayUtils.removeElement((byte[]) null, (byte) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25707);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25708);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25709);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25710);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25711);array = ArrayUtils.removeElement(new byte[] {1}, (byte) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25712);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25713);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25714);array = ArrayUtils.removeElement(new byte[] {1, 2}, (byte) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25715);assertTrue(Arrays.equals(new byte[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25716);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25717);array = ArrayUtils.removeElement(new byte[] {1, 2, 1}, (byte) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25718);assertTrue(Arrays.equals(new byte[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25719);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementCharArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pinu6cjug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pinu6cjug(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25720);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25721);char[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25722);array = ArrayUtils.removeElement((char[]) null, 'a');
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25723);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25724);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_CHAR_ARRAY, 'a');
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25725);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25726);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25727);array = ArrayUtils.removeElement(new char[] {'a'}, 'a');
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25728);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25729);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25730);array = ArrayUtils.removeElement(new char[] {'a', 'b'}, 'a');
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25731);assertTrue(Arrays.equals(new char[] {'b'}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25732);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25733);array = ArrayUtils.removeElement(new char[] {'a', 'b', 'a'}, 'a');
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25734);assertTrue(Arrays.equals(new char[] {'b', 'a'}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25735);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementDoubleArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296456fjuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296456fjuw(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25736);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25737);double[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25738);array = ArrayUtils.removeElement(null, (double) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25739);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25740);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25741);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25742);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25743);array = ArrayUtils.removeElement(new double[] {1}, (double) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25744);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25745);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25746);array = ArrayUtils.removeElement(new double[] {1, 2}, (double) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25747);assertTrue(Arrays.equals(new double[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25748);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25749);array = ArrayUtils.removeElement(new double[] {1, 2, 1}, (double) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25750);assertTrue(Arrays.equals(new double[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25751);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementFloatArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2afcerajvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2afcerajvc(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25752);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25753);float[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25754);array = ArrayUtils.removeElement((float[]) null, (float) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25755);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25756);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25757);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25758);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25759);array = ArrayUtils.removeElement(new float[] {1}, (float) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25760);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25761);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25762);array = ArrayUtils.removeElement(new float[] {1, 2}, (float) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25763);assertTrue(Arrays.equals(new float[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25764);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25765);array = ArrayUtils.removeElement(new float[] {1, 2, 1}, (float) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25766);assertTrue(Arrays.equals(new float[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25767);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementIntArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k4x6rbjvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k4x6rbjvs(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25768);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25769);int[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25770);array = ArrayUtils.removeElement((int[]) null, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25771);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25772);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_INT_ARRAY, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25773);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25774);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25775);array = ArrayUtils.removeElement(new int[] {1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25776);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25777);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25778);array = ArrayUtils.removeElement(new int[] {1, 2}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25779);assertTrue(Arrays.equals(new int[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25780);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25781);array = ArrayUtils.removeElement(new int[] {1, 2, 1}, 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25782);assertTrue(Arrays.equals(new int[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25783);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementLongArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owtdlujw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owtdlujw8(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25784);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25785);long[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25786);array = ArrayUtils.removeElement((long[]) null, 1L);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25787);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25788);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_LONG_ARRAY, 1L);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25789);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25790);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25791);array = ArrayUtils.removeElement(new long[] {1}, 1L);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25792);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25793);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25794);array = ArrayUtils.removeElement(new long[] {1, 2}, 1L);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25795);assertTrue(Arrays.equals(new long[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25796);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25797);array = ArrayUtils.removeElement(new long[] {1, 2, 1}, 1L);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25798);assertTrue(Arrays.equals(new long[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25799);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementShortArray() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zex61ijwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zex61ijwo(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25800);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25801);short[] array;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25802);array = ArrayUtils.removeElement((short[]) null, (short) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25803);assertNull(array);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25804);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25805);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25806);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25807);array = ArrayUtils.removeElement(new short[] {1}, (short) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25808);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25809);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25810);array = ArrayUtils.removeElement(new short[] {1, 2}, (short) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25811);assertTrue(Arrays.equals(new short[] {2}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25812);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25813);array = ArrayUtils.removeElement(new short[] {1, 2, 1}, (short) 1);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25814);assertTrue(Arrays.equals(new short[] {2, 1}, array));
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25815);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    

    @Test
    public void testRemoveAllBooleanOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g38szkjx4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllBooleanOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g38szkjx4(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25816);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25817);boolean[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25818);assertNull(ArrayUtils.removeAllOccurences(a, true));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25819);a = new boolean[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25820);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.removeAllOccurences(a, true)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25821);a = new boolean[] { true };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25822);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.removeAllOccurences(a, true)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25823);a = new boolean[] { true, true };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25824);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.removeAllOccurences(a, true)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25825);a = new boolean[] { false, true, true, false, true };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25826);assertTrue(Arrays.equals(new boolean[] { false, false }, ArrayUtils.removeAllOccurences(a, true)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25827);a = new boolean[] { false, true, true, false, true };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25828);assertTrue(Arrays.equals(new boolean[] { true, true, true }, ArrayUtils.removeAllOccurences(a, false)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllCharOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rszzmsjxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllCharOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rszzmsjxh(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25829);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25830);char[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25831);assertNull(ArrayUtils.removeAllOccurences(a, '2'));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25832);a = new char[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25833);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.removeAllOccurences(a, '2')));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25834);a = new char[] { '2' };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25835);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.removeAllOccurences(a, '2')));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25836);a = new char[] { '2', '2' };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25837);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.removeAllOccurences(a, '2')));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25838);a = new char[] { '1', '2', '2', '3', '2' };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25839);assertTrue(Arrays.equals(new char[] { '1', '3' }, ArrayUtils.removeAllOccurences(a, '2')));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25840);a = new char[] { '1', '2', '2', '3', '2' };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25841);assertTrue(Arrays.equals(new char[] { '1', '2', '2', '3', '2' }, ArrayUtils.removeAllOccurences(a, '4')));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
    
    @Test
    public void testRemoveAllByteOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u4uprejxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllByteOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25842,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u4uprejxu(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25842);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25843);byte[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25844);assertNull(ArrayUtils.removeAllOccurences(a, (byte) 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25845);a = new byte[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25846);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.removeAllOccurences(a, (byte) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25847);a = new byte[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25848);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.removeAllOccurences(a, (byte) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25849);a = new byte[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25850);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.removeAllOccurences(a, (byte) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25851);a = new byte[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25852);assertTrue(Arrays.equals(new byte[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, (byte) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25853);a = new byte[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25854);assertTrue(Arrays.equals(new byte[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, (byte) 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllShortOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2voboocjy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllShortOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2voboocjy7(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25855);
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25856);short[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25857);assertNull(ArrayUtils.removeAllOccurences(a, (short) 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25858);a = new short[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25859);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.removeAllOccurences(a, (short) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25860);a = new short[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25861);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.removeAllOccurences(a, (short) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25862);a = new short[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25863);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.removeAllOccurences(a, (short) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25864);a = new short[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25865);assertTrue(Arrays.equals(new short[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, (short) 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25866);a = new short[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25867);assertTrue(Arrays.equals(new short[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, (short) 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllIntOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pq9exzjyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllIntOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pq9exzjyk(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25868);        
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25869);int[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25870);assertNull(ArrayUtils.removeAllOccurences(a, 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25871);a = new int[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25872);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25873);a = new int[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25874);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25875);a = new int[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25876);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25877);a = new int[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25878);assertTrue(Arrays.equals(new int[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25879);a = new int[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25880);assertTrue(Arrays.equals(new int[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}    
    
    @Test
    public void testRemoveAllLongOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tos8wajyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllLongOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tos8wajyx(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25881);        
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25882);long[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25883);assertNull(ArrayUtils.removeAllOccurences(a, 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25884);a = new long[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25885);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25886);a = new long[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25887);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25888);a = new long[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25889);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25890);a = new long[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25891);assertTrue(Arrays.equals(new long[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25892);a = new long[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25893);assertTrue(Arrays.equals(new long[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllFloatOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_220x5x0jza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllFloatOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_220x5x0jza(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25894);    
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25895);float[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25896);assertNull(ArrayUtils.removeAllOccurences(a, 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25897);a = new float[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25898);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25899);a = new float[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25900);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25901);a = new float[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25902);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25903);a = new float[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25904);assertTrue(Arrays.equals(new float[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25905);a = new float[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25906);assertTrue(Arrays.equals(new float[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllDoubleOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dke4zjjzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllDoubleOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dke4zjjzn(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25907);    
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25908);double[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25909);assertNull(ArrayUtils.removeAllOccurences(a, 2));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25910);a = new double[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25911);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25912);a = new double[] { 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25913);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25914);a = new double[] { 2, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25915);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25916);a = new double[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25917);assertTrue(Arrays.equals(new double[] { 1, 3 }, ArrayUtils.removeAllOccurences(a, 2)));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25918);a = new double[] { 1, 2, 2, 3, 2 };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25919);assertTrue(Arrays.equals(new double[] { 1, 2, 2, 3, 2 }, ArrayUtils.removeAllOccurences(a, 4)));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}

    @Test
    public void testRemoveAllObjectOccurences() {__CLR4_5_2jn0jn0lvha7epm.R.globalSliceStart(getClass().getName(),25920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evtpg3k00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jn0jn0lvha7epm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jn0jn0lvha7epm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveAllObjectOccurences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evtpg3k00(){try{__CLR4_5_2jn0jn0lvha7epm.R.inc(25920);    
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25921);String[] a = null;
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25922);assertNull(ArrayUtils.removeAllOccurences(a, "2"));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25923);a = new String[0];
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25924);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.removeAllOccurences(a, "2")));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25925);a = new String[] { "2" };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25926);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.removeAllOccurences(a, "2")));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25927);a = new String[] { "2", "2" };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25928);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.removeAllOccurences(a, "2")));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25929);a = new String[] { "1", "2", "2", "3", "2" };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25930);assertTrue(Arrays.equals(new String[] { "1", "3" }, ArrayUtils.removeAllOccurences(a, "2")));

        __CLR4_5_2jn0jn0lvha7epm.R.inc(25931);a = new String[] { "1", "2", "2", "3", "2" };
        __CLR4_5_2jn0jn0lvha7epm.R.inc(25932);assertTrue(Arrays.equals(new String[] { "1", "2", "2", "3", "2" }, ArrayUtils.removeAllOccurences(a, "4")));
    }finally{__CLR4_5_2jn0jn0lvha7epm.R.flushNeeded();}}
}
