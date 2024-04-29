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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Tests ArrayUtils insert methods.
 */
public class ArrayUtilsInsertTest {static class __CLR4_5_2iuniunlvha7edj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,24622,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testInsertBooleans() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n67x9fiun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertBooleans",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24431,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n67x9fiun() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24431);
        __CLR4_5_2iuniunlvha7edj.R.inc(24432);final boolean[] array = {true,false,true};
        __CLR4_5_2iuniunlvha7edj.R.inc(24433);final boolean[] values = {false,true,false};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24434);boolean[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24435);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24436);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24437);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24438);assertArrayEquals(new boolean[0], ArrayUtils.insert(0, new boolean[0], null));        
        __CLR4_5_2iuniunlvha7edj.R.inc(24439);assertNull(ArrayUtils.insert(42, (boolean[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24440);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24441);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24442);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24443);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24444);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24445);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24446);assertArrayEquals(new boolean[]{false,true,false,true}, ArrayUtils.insert(0, array, false));
        __CLR4_5_2iuniunlvha7edj.R.inc(24447);assertArrayEquals(new boolean[]{true,false,false,true}, ArrayUtils.insert(1, array, false));
        __CLR4_5_2iuniunlvha7edj.R.inc(24448);assertArrayEquals(new boolean[]{true,false,true,false}, ArrayUtils.insert(array.length, array, false));
        __CLR4_5_2iuniunlvha7edj.R.inc(24449);assertArrayEquals(new boolean[]{false,true,false,true,false,true}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24450);assertArrayEquals(new boolean[]{true,false,true,false,false,true}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24451);assertArrayEquals(new boolean[]{true,false,true,false,true,false}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}


    @Test
    public void testInsertBytes() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_248esmxiv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_248esmxiv8() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24452);
        __CLR4_5_2iuniunlvha7edj.R.inc(24453);final byte[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24454);final byte[] values = {4,5,6};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24455);byte[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24456);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24457);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24458);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24459);assertArrayEquals(new byte[0], ArrayUtils.insert(0, new byte[0], null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24460);assertNull(ArrayUtils.insert(42, (byte[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24461);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24462);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24463);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24464);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24465);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24466);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24467);assertArrayEquals(new byte[]{0,1,2,3}, ArrayUtils.insert(0, array, (byte) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24468);assertArrayEquals(new byte[]{1,0,2,3}, ArrayUtils.insert(1, array, (byte) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24469);assertArrayEquals(new byte[]{1,2,3,0}, ArrayUtils.insert(array.length, array, (byte) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24470);assertArrayEquals(new byte[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24471);assertArrayEquals(new byte[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24472);assertArrayEquals(new byte[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}
    
    @Test
    public void testInsertChars() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m9a2vivt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertChars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m9a2vivt() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24473);
        __CLR4_5_2iuniunlvha7edj.R.inc(24474);final char[] array = {'a','b','c'};
        __CLR4_5_2iuniunlvha7edj.R.inc(24475);final char[] values = {'d','e','f'};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24476);char[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24477);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24478);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24479);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24480);assertArrayEquals(new char[0], ArrayUtils.insert(0, new char[0], null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24481);assertNull(ArrayUtils.insert(42, (char[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24482);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24483);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24484);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24485);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24486);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24487);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24488);assertArrayEquals(new char[]{'z','a','b','c'}, ArrayUtils.insert(0, array, 'z'));
        __CLR4_5_2iuniunlvha7edj.R.inc(24489);assertArrayEquals(new char[]{'a','z','b','c'}, ArrayUtils.insert(1, array, 'z'));
        __CLR4_5_2iuniunlvha7edj.R.inc(24490);assertArrayEquals(new char[]{'a','b','c','z'}, ArrayUtils.insert(array.length, array, 'z'));
        __CLR4_5_2iuniunlvha7edj.R.inc(24491);assertArrayEquals(new char[]{'d','e','f','a','b','c'}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24492);assertArrayEquals(new char[]{'a','d','e','f','b','c'}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24493);assertArrayEquals(new char[]{'a','b','c','d','e','f'}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}
    
    @Test
    public void testInsertDoubles() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwq6daiwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertDoubles",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwq6daiwe() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24494);
        __CLR4_5_2iuniunlvha7edj.R.inc(24495);final double[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24496);final double[] values = {4,5,6};
        __CLR4_5_2iuniunlvha7edj.R.inc(24497);final double delta = 0.000001;
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24498);double[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24499);assertArrayEquals(array, result, delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24500);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24501);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24502);assertArrayEquals(new double[0], ArrayUtils.insert(0, new double[0], null), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24503);assertNull(ArrayUtils.insert(42, (double[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24504);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24505);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24506);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24507);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24508);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24509);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24510);assertArrayEquals(new double[]{0,1,2,3}, ArrayUtils.insert(0, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24511);assertArrayEquals(new double[]{1,0,2,3}, ArrayUtils.insert(1, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24512);assertArrayEquals(new double[]{1,2,3,0}, ArrayUtils.insert(array.length, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24513);assertArrayEquals(new double[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24514);assertArrayEquals(new double[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24515);assertArrayEquals(new double[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values), delta);
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}    
    
    @Test
    public void testInsertFloats() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lkrdjix0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertFloats",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lkrdjix0() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24516);
        __CLR4_5_2iuniunlvha7edj.R.inc(24517);final float[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24518);final float[] values = {4,5,6};
        __CLR4_5_2iuniunlvha7edj.R.inc(24519);final float delta = 0.000001f;
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24520);float[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24521);assertArrayEquals(array, result, delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24522);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24523);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24524);assertArrayEquals(new float[0], ArrayUtils.insert(0, new float[0], null), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24525);assertNull(ArrayUtils.insert(42, (float[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24526);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24527);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24528);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24529);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24530);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24531);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24532);assertArrayEquals(new float[]{0,1,2,3}, ArrayUtils.insert(0, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24533);assertArrayEquals(new float[]{1,0,2,3}, ArrayUtils.insert(1, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24534);assertArrayEquals(new float[]{1,2,3,0}, ArrayUtils.insert(array.length, array, 0), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24535);assertArrayEquals(new float[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24536);assertArrayEquals(new float[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values), delta);
        __CLR4_5_2iuniunlvha7edj.R.inc(24537);assertArrayEquals(new float[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values), delta);
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}     
    
    @Test
    public void testInsertInts() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oj4ey2ixm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertInts",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oj4ey2ixm() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24538);
        __CLR4_5_2iuniunlvha7edj.R.inc(24539);final int[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24540);final int[] values = {4,5,6};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24541);int[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24542);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24543);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24544);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24545);assertArrayEquals(new int[0], ArrayUtils.insert(0, new int[0], null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24546);assertNull(ArrayUtils.insert(42, (int[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24547);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24548);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24549);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24550);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24551);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24552);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24553);assertArrayEquals(new int[]{0,1,2,3}, ArrayUtils.insert(0, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24554);assertArrayEquals(new int[]{1,0,2,3}, ArrayUtils.insert(1, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24555);assertArrayEquals(new int[]{1,2,3,0}, ArrayUtils.insert(array.length, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24556);assertArrayEquals(new int[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24557);assertArrayEquals(new int[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24558);assertArrayEquals(new int[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}    
    
    
    @Test
    public void testInsertLongs() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w2fevniy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertLongs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w2fevniy7() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24559);
        __CLR4_5_2iuniunlvha7edj.R.inc(24560);final long[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24561);final long[] values = {4,5,6};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24562);long[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24563);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24564);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24565);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24566);assertArrayEquals(new long[0], ArrayUtils.insert(0, new long[0], null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24567);assertNull(ArrayUtils.insert(42, (long[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24568);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24569);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24570);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24571);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24572);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24573);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24574);assertArrayEquals(new long[]{0,1,2,3}, ArrayUtils.insert(0, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24575);assertArrayEquals(new long[]{1,0,2,3}, ArrayUtils.insert(1, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24576);assertArrayEquals(new long[]{1,2,3,0}, ArrayUtils.insert(array.length, array, 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24577);assertArrayEquals(new long[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24578);assertArrayEquals(new long[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24579);assertArrayEquals(new long[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}} 
    
    
    @Test
    public void testInsertShorts() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vqdg7diys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertShorts",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vqdg7diys() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24580);
        __CLR4_5_2iuniunlvha7edj.R.inc(24581);final short[] array = {1,2,3};
        __CLR4_5_2iuniunlvha7edj.R.inc(24582);final short[] values = {4,5,6};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24583);short[] result = ArrayUtils.insert(42, array, null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24584);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24585);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24586);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24587);assertArrayEquals(new short[0], ArrayUtils.insert(0, new short[0], null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24588);assertNull(ArrayUtils.insert(42, (short[]) null, null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24589);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24590);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24591);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24592);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24593);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24594);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24595);assertArrayEquals(new short[]{0,1,2,3}, ArrayUtils.insert(0, array, (short) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24596);assertArrayEquals(new short[]{1,0,2,3}, ArrayUtils.insert(1, array, (short) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24597);assertArrayEquals(new short[]{1,2,3,0}, ArrayUtils.insert(array.length, array, (short) 0));
        __CLR4_5_2iuniunlvha7edj.R.inc(24598);assertArrayEquals(new short[]{4,5,6,1,2,3}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24599);assertArrayEquals(new short[]{1,4,5,6,2,3}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24600);assertArrayEquals(new short[]{1,2,3,4,5,6}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}} 
    
    
    @Test
    public void testInsertGenericArray() throws Exception {__CLR4_5_2iuniunlvha7edj.R.globalSliceStart(getClass().getName(),24601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224s07gizd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2iuniunlvha7edj.R.rethrow($CLV_t2$);}finally{__CLR4_5_2iuniunlvha7edj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsInsertTest.testInsertGenericArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224s07gizd() throws Exception{try{__CLR4_5_2iuniunlvha7edj.R.inc(24601);
        __CLR4_5_2iuniunlvha7edj.R.inc(24602);final String[] array = {"a","b","c"};
        __CLR4_5_2iuniunlvha7edj.R.inc(24603);final String[] values = {"d","e","f"};
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24604);String[] result = ArrayUtils.insert(42, array, (String[]) null);
        __CLR4_5_2iuniunlvha7edj.R.inc(24605);assertArrayEquals(array, result);
        __CLR4_5_2iuniunlvha7edj.R.inc(24606);assertFalse(array == result);
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24607);assertNull(ArrayUtils.insert(42, null, array));    
        __CLR4_5_2iuniunlvha7edj.R.inc(24608);assertArrayEquals(new String[0], ArrayUtils.insert(0, new String[0], (String[]) null));
        __CLR4_5_2iuniunlvha7edj.R.inc(24609);assertNull(ArrayUtils.insert(42, null, (String[]) null));
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24610);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24611);ArrayUtils.insert(-1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24612);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24613);try {
            __CLR4_5_2iuniunlvha7edj.R.inc(24614);ArrayUtils.insert(array.length + 1, array, array);
            __CLR4_5_2iuniunlvha7edj.R.inc(24615);fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }        
        
        __CLR4_5_2iuniunlvha7edj.R.inc(24616);assertArrayEquals(new String[]{"z","a","b","c"}, ArrayUtils.insert(0, array, "z"));
        __CLR4_5_2iuniunlvha7edj.R.inc(24617);assertArrayEquals(new String[]{"a","z","b","c"}, ArrayUtils.insert(1, array, "z"));
        __CLR4_5_2iuniunlvha7edj.R.inc(24618);assertArrayEquals(new String[]{"a","b","c","z"}, ArrayUtils.insert(array.length, array, "z"));
        __CLR4_5_2iuniunlvha7edj.R.inc(24619);assertArrayEquals(new String[]{"d","e","f","a","b","c"}, ArrayUtils.insert(0, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24620);assertArrayEquals(new String[]{"a","d","e","f","b","c"}, ArrayUtils.insert(1, array, values));
        __CLR4_5_2iuniunlvha7edj.R.inc(24621);assertArrayEquals(new String[]{"a","b","c","d","e","f"}, ArrayUtils.insert(array.length, array, values));
    }finally{__CLR4_5_2iuniunlvha7edj.R.flushNeeded();}}     
}
