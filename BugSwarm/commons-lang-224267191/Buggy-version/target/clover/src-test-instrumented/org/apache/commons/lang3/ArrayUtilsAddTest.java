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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils add methods.
 */
public class ArrayUtilsAddTest {static class __CLR4_5_2ijtijtlvha7e7r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,24431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testJira567(){__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ikczs3ijt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testJira567",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ikczs3ijt(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24041);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24042);Number[] n;
        // Valid array construction
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24043);n = ArrayUtils.addAll(new Number[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24044);assertEquals(2,n.length);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24045);assertEquals(Number.class,n.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24046);try {
            // Invalid - can't store Long in Integer array
               __CLR4_5_2ijtijtlvha7e7r.R.inc(24047);n = ArrayUtils.addAll(new Integer[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
               __CLR4_5_2ijtijtlvha7e7r.R.inc(24048);fail("Should have generated IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
        }
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayBoolean() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21gqdwcik1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21gqdwcik1(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24049);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24050);boolean[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24051);newArray = ArrayUtils.add(null, false);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24052);assertTrue(Arrays.equals(new boolean[]{false}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24053);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24054);newArray = ArrayUtils.add(null, true);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24055);assertTrue(Arrays.equals(new boolean[]{true}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24056);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24057);final boolean[] array1 = new boolean[]{true, false, true};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24058);newArray = ArrayUtils.add(array1, false);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24059);assertTrue(Arrays.equals(new boolean[]{true, false, true, false}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24060);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayByte() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlqcvuikd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlqcvuikd(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24061);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24062);byte[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24063);newArray = ArrayUtils.add((byte[])null, (byte)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24064);assertTrue(Arrays.equals(new byte[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24065);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24066);newArray = ArrayUtils.add((byte[])null, (byte)1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24067);assertTrue(Arrays.equals(new byte[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24068);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24069);final byte[] array1 = new byte[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24070);newArray = ArrayUtils.add(array1, (byte)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24071);assertTrue(Arrays.equals(new byte[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24072);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24073);newArray = ArrayUtils.add(array1, (byte)4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24074);assertTrue(Arrays.equals(new byte[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24075);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayChar() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkdikoiks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkdikoiks(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24076);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24077);char[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24078);newArray = ArrayUtils.add((char[])null, (char)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24079);assertTrue(Arrays.equals(new char[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24080);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24081);newArray = ArrayUtils.add((char[])null, (char)1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24082);assertTrue(Arrays.equals(new char[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24083);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24084);final char[] array1 = new char[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24085);newArray = ArrayUtils.add(array1, (char)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24086);assertTrue(Arrays.equals(new char[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24087);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24088);newArray = ArrayUtils.add(array1, (char)4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24089);assertTrue(Arrays.equals(new char[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24090);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayDouble() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ek9mlfil7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ek9mlfil7(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24091);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24092);double[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24093);newArray = ArrayUtils.add((double[])null, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24094);assertTrue(Arrays.equals(new double[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24095);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24096);newArray = ArrayUtils.add((double[])null, 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24097);assertTrue(Arrays.equals(new double[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24098);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24099);final double[] array1 = new double[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24100);newArray = ArrayUtils.add(array1, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24101);assertTrue(Arrays.equals(new double[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24102);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24103);newArray = ArrayUtils.add(array1, 4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24104);assertTrue(Arrays.equals(new double[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24105);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayFloat() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2wd0oilm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2wd0oilm(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24106);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24107);float[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24108);newArray = ArrayUtils.add((float[])null, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24109);assertTrue(Arrays.equals(new float[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24110);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24111);newArray = ArrayUtils.add((float[])null, 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24112);assertTrue(Arrays.equals(new float[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24113);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24114);final float[] array1 = new float[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24115);newArray = ArrayUtils.add(array1, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24116);assertTrue(Arrays.equals(new float[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24117);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24118);newArray = ArrayUtils.add(array1, 4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24119);assertTrue(Arrays.equals(new float[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24120);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayInt() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2blr1jfim1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2blr1jfim1(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24121);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24122);int[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24123);newArray = ArrayUtils.add((int[])null, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24124);assertTrue(Arrays.equals(new int[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24125);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24126);newArray = ArrayUtils.add((int[])null, 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24127);assertTrue(Arrays.equals(new int[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24128);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24129);final int[] array1 = new int[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24130);newArray = ArrayUtils.add(array1, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24131);assertTrue(Arrays.equals(new int[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24132);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24133);newArray = ArrayUtils.add(array1, 4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24134);assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24135);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayLong() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2haxq36img();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2haxq36img(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24136);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24137);long[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24138);newArray = ArrayUtils.add((long[])null, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24139);assertTrue(Arrays.equals(new long[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24140);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24141);newArray = ArrayUtils.add((long[])null, 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24142);assertTrue(Arrays.equals(new long[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24143);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24144);final long[] array1 = new long[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24145);newArray = ArrayUtils.add(array1, 0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24146);assertTrue(Arrays.equals(new long[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24147);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24148);newArray = ArrayUtils.add(array1, 4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24149);assertTrue(Arrays.equals(new long[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24150);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayShort() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tzmiwimv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tzmiwimv(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24151);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24152);short[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24153);newArray = ArrayUtils.add((short[])null, (short)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24154);assertTrue(Arrays.equals(new short[]{0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24155);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24156);newArray = ArrayUtils.add((short[])null, (short)1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24157);assertTrue(Arrays.equals(new short[]{1}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24158);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24159);final short[] array1 = new short[]{1, 2, 3};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24160);newArray = ArrayUtils.add(array1, (short)0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24161);assertTrue(Arrays.equals(new short[]{1, 2, 3, 0}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24162);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24163);newArray = ArrayUtils.add(array1, (short)4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24164);assertTrue(Arrays.equals(new short[]{1, 2, 3, 4}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24165);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayObject() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27lmt2nina();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27lmt2nina(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24166);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24167);Object[] newArray;

        //show that not casting is okay
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24168);newArray = ArrayUtils.add((Object[])null, "a");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24169);assertTrue(Arrays.equals(new String[]{"a"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24170);assertTrue(Arrays.equals(new Object[]{"a"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24171);assertEquals(String.class, newArray.getClass().getComponentType());

        //show that not casting to Object[] is okay and will assume String based on "a"
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24172);final String[] newStringArray = ArrayUtils.add(null, "a");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24173);assertTrue(Arrays.equals(new String[]{"a"}, newStringArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24174);assertTrue(Arrays.equals(new Object[]{"a"}, newStringArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24175);assertEquals(String.class, newStringArray.getClass().getComponentType());

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24176);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24177);newArray = ArrayUtils.add(stringArray1, null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24178);assertTrue(Arrays.equals(new String[]{"a", "b", "c", null}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24179);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24180);newArray = ArrayUtils.add(stringArray1, "d");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24181);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24182);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24183);Number[] numberArray1 = new Number[]{Integer.valueOf(1), Double.valueOf(2)};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24184);newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24185);assertTrue(Arrays.equals(new Number[]{Integer.valueOf(1), Double.valueOf(2), Float.valueOf(3)}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24186);assertEquals(Number.class, newArray.getClass().getComponentType());

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24187);numberArray1 = null;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24188);newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24189);assertTrue(Arrays.equals(new Float[]{Float.valueOf(3)}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24190);assertEquals(Float.class, newArray.getClass().getComponentType());
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}
    
    @Test
    public void testLANG571(){__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2af53ueinz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testLANG571",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2af53ueinz(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24191);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24192);final String[] stringArray=null;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24193);final String aString=null;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24194);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24195);@SuppressWarnings("unused")
            final
            String[] sa = ArrayUtils.add(stringArray, aString);
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24196);fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24197);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24198);@SuppressWarnings({ "unused", "deprecation" })
            final
            String[] sa = ArrayUtils.add(stringArray, 0, aString);
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24199);fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayToObjectArray() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2taaeh1io8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayToObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24200,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2taaeh1io8(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24200);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24201);assertNull(ArrayUtils.addAll(null, (Object[]) null));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24202);Object[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24203);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24204);final String[] stringArray2 = new String[]{"1", "2", "3"};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24205);newArray = ArrayUtils.addAll(stringArray1, (String[]) null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24206);assertNotSame(stringArray1, newArray);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24207);assertTrue(Arrays.equals(stringArray1, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24208);assertTrue(Arrays.equals(new String[]{"a", "b", "c"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24209);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24210);newArray = ArrayUtils.addAll(null, stringArray2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24211);assertNotSame(stringArray2, newArray);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24212);assertTrue(Arrays.equals(stringArray2, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24213);assertTrue(Arrays.equals(new String[]{"1", "2", "3"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24214);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24215);newArray = ArrayUtils.addAll(stringArray1, stringArray2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24216);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "1", "2", "3"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24217);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24218);newArray = ArrayUtils.addAll(ArrayUtils.EMPTY_STRING_ARRAY, (String[]) null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24219);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24220);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24221);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24222);newArray = ArrayUtils.addAll(null, ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24223);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24224);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24225);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24226);newArray = ArrayUtils.addAll(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24227);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24228);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24229);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24230);final String[] stringArrayNull = new String []{null};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24231);newArray = ArrayUtils.addAll(stringArrayNull, stringArrayNull);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24232);assertTrue(Arrays.equals(new String[]{null, null}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24233);assertEquals(String.class, newArray.getClass().getComponentType());

        // boolean
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24234);assertTrue( Arrays.equals( new boolean[] { true, false, false, true },
            ArrayUtils.addAll( new boolean[] { true, false }, new boolean[] { false, true } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24235);assertTrue( Arrays.equals( new boolean[] { false, true },
            ArrayUtils.addAll( null, new boolean[] { false, true } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24236);assertTrue( Arrays.equals( new boolean[] { true, false },
            ArrayUtils.addAll( new boolean[] { true, false }, null ) ) );

        // char
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24237);assertTrue( Arrays.equals( new char[] { 'a', 'b', 'c', 'd' },
            ArrayUtils.addAll( new char[] { 'a', 'b' }, new char[] { 'c', 'd' } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24238);assertTrue( Arrays.equals( new char[] { 'c', 'd' },
            ArrayUtils.addAll( null, new char[] { 'c', 'd' } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24239);assertTrue( Arrays.equals( new char[] { 'a', 'b' },
            ArrayUtils.addAll( new char[] { 'a', 'b' }, null ) ) );

        // byte
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24240);assertTrue( Arrays.equals( new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 },
            ArrayUtils.addAll( new byte[] { (byte) 0, (byte) 1 }, new byte[] { (byte) 2, (byte) 3 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24241);assertTrue( Arrays.equals( new byte[] { (byte) 2, (byte) 3 },
            ArrayUtils.addAll( null, new byte[] { (byte) 2, (byte) 3 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24242);assertTrue( Arrays.equals( new byte[] { (byte) 0, (byte) 1 },
            ArrayUtils.addAll( new byte[] { (byte) 0, (byte) 1 }, null ) ) );

        // short
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24243);assertTrue( Arrays.equals( new short[] { (short) 10, (short) 20, (short) 30, (short) 40 },
            ArrayUtils.addAll( new short[] { (short) 10, (short) 20 }, new short[] { (short) 30, (short) 40 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24244);assertTrue( Arrays.equals( new short[] { (short) 30, (short) 40 },
            ArrayUtils.addAll( null, new short[] { (short) 30, (short) 40 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24245);assertTrue( Arrays.equals( new short[] { (short) 10, (short) 20 },
            ArrayUtils.addAll( new short[] { (short) 10, (short) 20 }, null ) ) );

        // int
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24246);assertTrue( Arrays.equals( new int[] { 1, 1000, -1000, -1 },
            ArrayUtils.addAll( new int[] { 1, 1000 }, new int[] { -1000, -1 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24247);assertTrue( Arrays.equals( new int[] { -1000, -1 },
            ArrayUtils.addAll( null, new int[] { -1000, -1 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24248);assertTrue( Arrays.equals( new int[] { 1, 1000 },
            ArrayUtils.addAll( new int[] { 1, 1000 }, null ) ) );

        // long
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24249);assertTrue( Arrays.equals( new long[] { 1L, -1L, 1000L, -1000L },
            ArrayUtils.addAll( new long[] { 1L, -1L }, new long[] { 1000L, -1000L } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24250);assertTrue( Arrays.equals( new long[] { 1000L, -1000L },
            ArrayUtils.addAll( null, new long[] { 1000L, -1000L } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24251);assertTrue( Arrays.equals( new long[] { 1L, -1L },
            ArrayUtils.addAll( new long[] { 1L, -1L }, null ) ) );

        // float
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24252);assertTrue( Arrays.equals( new float[] { 10.5f, 10.1f, 1.6f, 0.01f },
            ArrayUtils.addAll( new float[] { 10.5f, 10.1f }, new float[] { 1.6f, 0.01f } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24253);assertTrue( Arrays.equals( new float[] { 1.6f, 0.01f },
            ArrayUtils.addAll( null, new float[] { 1.6f, 0.01f } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24254);assertTrue( Arrays.equals( new float[] { 10.5f, 10.1f },
            ArrayUtils.addAll( new float[] { 10.5f, 10.1f }, null ) ) );

        // double
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24255);assertTrue( Arrays.equals( new double[] { Math.PI, -Math.PI, 0, 9.99 },
            ArrayUtils.addAll( new double[] { Math.PI, -Math.PI }, new double[] { 0, 9.99 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24256);assertTrue( Arrays.equals( new double[] { 0, 9.99 },
            ArrayUtils.addAll( null, new double[] { 0, 9.99 } ) ) );

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24257);assertTrue( Arrays.equals( new double[] { Math.PI, -Math.PI },
            ArrayUtils.addAll( new double[] { Math.PI, -Math.PI }, null ) ) );

    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testAddObjectAtIndex() {__CLR4_5_2ijtijtlvha7e7r.R.globalSliceStart(getClass().getName(),24258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2en97vsipu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ijtijtlvha7e7r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ijtijtlvha7e7r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectAtIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2en97vsipu(){try{__CLR4_5_2ijtijtlvha7e7r.R.inc(24258);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24259);Object[] newArray;
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24260);newArray = ArrayUtils.add((Object[])null, 0, "a");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24261);assertTrue(Arrays.equals(new String[]{"a"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24262);assertTrue(Arrays.equals(new Object[]{"a"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24263);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24264);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24265);newArray = ArrayUtils.add(stringArray1, 0, null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24266);assertTrue(Arrays.equals(new String[]{null, "a", "b", "c"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24267);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24268);newArray = ArrayUtils.add(stringArray1, 1, null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24269);assertTrue(Arrays.equals(new String[]{"a", null, "b", "c"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24270);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24271);newArray = ArrayUtils.add(stringArray1, 3, null);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24272);assertTrue(Arrays.equals(new String[]{"a", "b", "c", null}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24273);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24274);newArray = ArrayUtils.add(stringArray1, 3, "d");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24275);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, newArray));
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24276);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24277);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24278);final Object[] o = new Object[] {"1", "2", "4"};
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24279);final Object[] result = ArrayUtils.add(o, 2, "3");
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24280);final Object[] result2 = ArrayUtils.add(o, 3, "5");

        __CLR4_5_2ijtijtlvha7e7r.R.inc(24281);assertNotNull(result);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24282);assertEquals(4, result.length);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24283);assertEquals("1", result[0]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24284);assertEquals("2", result[1]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24285);assertEquals("3", result[2]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24286);assertEquals("4", result[3]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24287);assertNotNull(result2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24288);assertEquals(4, result2.length);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24289);assertEquals("1", result2[0]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24290);assertEquals("2", result2[1]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24291);assertEquals("4", result2[2]);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24292);assertEquals("5", result2[3]);

        // boolean tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24293);boolean[] booleanArray = ArrayUtils.add( null, 0, true );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24294);assertTrue( Arrays.equals( new boolean[] { true }, booleanArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24295);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24296);booleanArray = ArrayUtils.add( null, -1, true );
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24297);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24298);booleanArray = ArrayUtils.add( new boolean[] { true }, 0, false);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24299);assertTrue( Arrays.equals( new boolean[] { false, true }, booleanArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24300);booleanArray = ArrayUtils.add( new boolean[] { false }, 1, true);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24301);assertTrue( Arrays.equals( new boolean[] { false, true }, booleanArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24302);booleanArray = ArrayUtils.add( new boolean[] { true, false }, 1, true);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24303);assertTrue( Arrays.equals( new boolean[] { true, true, false }, booleanArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24304);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24305);booleanArray = ArrayUtils.add( new boolean[] { true, false }, 4, true);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24306);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24307);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24308);booleanArray = ArrayUtils.add( new boolean[] { true, false }, -1, true);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24309);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // char tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24310);char[] charArray = ArrayUtils.add( (char[]) null, 0, 'a' );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24311);assertTrue( Arrays.equals( new char[] { 'a' }, charArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24312);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24313);charArray = ArrayUtils.add( (char[]) null, -1, 'a' );
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24314);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24315);charArray = ArrayUtils.add( new char[] { 'a' }, 0, 'b');
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24316);assertTrue( Arrays.equals( new char[] { 'b', 'a' }, charArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24317);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 0, 'c');
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24318);assertTrue( Arrays.equals( new char[] { 'c', 'a', 'b' }, charArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24319);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 1, 'k');
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24320);assertTrue( Arrays.equals( new char[] { 'a', 'k', 'b' }, charArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24321);charArray = ArrayUtils.add( new char[] { 'a', 'b', 'c' }, 1, 't');
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24322);assertTrue( Arrays.equals( new char[] { 'a', 't', 'b', 'c' }, charArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24323);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24324);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 4, 'c');
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24325);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24326);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24327);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, -1, 'c');
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24328);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // short tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24329);short[] shortArray = ArrayUtils.add( new short[] { 1 }, 0, (short) 2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24330);assertTrue( Arrays.equals( new short[] { 2, 1 }, shortArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24331);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24332);shortArray = ArrayUtils.add( (short[]) null, -1, (short) 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24333);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24334);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 2, (short) 10);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24335);assertTrue( Arrays.equals( new short[] { 2, 6, 10 }, shortArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24336);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 0, (short) -4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24337);assertTrue( Arrays.equals( new short[] { -4, 2, 6 }, shortArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24338);shortArray = ArrayUtils.add( new short[] { 2, 6, 3 }, 2, (short) 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24339);assertTrue( Arrays.equals( new short[] { 2, 6, 1, 3 }, shortArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24340);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24341);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 4, (short) 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24342);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24343);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24344);shortArray = ArrayUtils.add( new short[] { 2, 6 }, -1, (short) 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24345);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // byte tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24346);byte[] byteArray = ArrayUtils.add( new byte[] { 1 }, 0, (byte) 2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24347);assertTrue( Arrays.equals( new byte[] { 2, 1 }, byteArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24348);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24349);byteArray = ArrayUtils.add( (byte[]) null, -1, (byte) 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24350);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24351);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 2, (byte) 3);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24352);assertTrue( Arrays.equals( new byte[] { 2, 6, 3 }, byteArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24353);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 0, (byte) 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24354);assertTrue( Arrays.equals( new byte[] { 1, 2, 6 }, byteArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24355);byteArray = ArrayUtils.add( new byte[] { 2, 6, 3 }, 2, (byte) 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24356);assertTrue( Arrays.equals( new byte[] { 2, 6, 1, 3 }, byteArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24357);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24358);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 4, (byte) 3);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24359);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24360);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24361);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, -1, (byte) 3);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24362);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // int tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24363);int[] intArray = ArrayUtils.add( new int[] { 1 }, 0, 2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24364);assertTrue( Arrays.equals( new int[] { 2, 1 }, intArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24365);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24366);intArray = ArrayUtils.add( (int[]) null, -1, 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24367);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24368);intArray = ArrayUtils.add( new int[] { 2, 6 }, 2, 10);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24369);assertTrue( Arrays.equals( new int[] { 2, 6, 10 }, intArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24370);intArray = ArrayUtils.add( new int[] { 2, 6 }, 0, -4);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24371);assertTrue( Arrays.equals( new int[] { -4, 2, 6 }, intArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24372);intArray = ArrayUtils.add( new int[] { 2, 6, 3 }, 2, 1);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24373);assertTrue( Arrays.equals( new int[] { 2, 6, 1, 3 }, intArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24374);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24375);intArray = ArrayUtils.add( new int[] { 2, 6 }, 4, 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24376);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24377);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24378);intArray = ArrayUtils.add( new int[] { 2, 6 }, -1, 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24379);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // long tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24380);long[] longArray = ArrayUtils.add( new long[] { 1L }, 0, 2L);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24381);assertTrue( Arrays.equals( new long[] { 2L, 1L }, longArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24382);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24383);longArray = ArrayUtils.add( (long[]) null, -1, 2L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24384);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24385);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 2, 10L);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24386);assertTrue( Arrays.equals( new long[] { 2L, 6L, 10L }, longArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24387);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 0, -4L);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24388);assertTrue( Arrays.equals( new long[] { -4L, 2L, 6L }, longArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24389);longArray = ArrayUtils.add( new long[] { 2L, 6L, 3L }, 2, 1L);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24390);assertTrue( Arrays.equals( new long[] { 2L, 6L, 1L, 3L }, longArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24391);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24392);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 4, 10L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24393);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24394);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24395);longArray = ArrayUtils.add( new long[] { 2L, 6L }, -1, 10L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24396);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // float tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24397);float[] floatArray = ArrayUtils.add( new float[] { 1.1f }, 0, 2.2f);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24398);assertTrue( Arrays.equals( new float[] { 2.2f, 1.1f }, floatArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24399);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24400);floatArray = ArrayUtils.add( (float[]) null, -1, 2.2f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24401);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24402);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, 2, 10.5f);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24403);assertTrue( Arrays.equals( new float[] { 2.3f, 6.4f, 10.5f }, floatArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24404);floatArray = ArrayUtils.add( new float[] { 2.6f, 6.7f }, 0, -4.8f);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24405);assertTrue( Arrays.equals( new float[] { -4.8f, 2.6f, 6.7f }, floatArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24406);floatArray = ArrayUtils.add( new float[] { 2.9f, 6.0f, 0.3f }, 2, 1.0f);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24407);assertTrue( Arrays.equals( new float[] { 2.9f, 6.0f, 1.0f, 0.3f }, floatArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24408);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24409);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, 4, 10.5f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24410);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24411);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24412);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, -1, 10.5f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24413);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // double tests
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24414);double[] doubleArray = ArrayUtils.add( new double[] { 1.1 }, 0, 2.2);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24415);assertTrue( Arrays.equals( new double[] { 2.2, 1.1 }, doubleArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24416);try {
          __CLR4_5_2ijtijtlvha7e7r.R.inc(24417);doubleArray = ArrayUtils.add(null, -1, 2.2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24418);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24419);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, 2, 10.5);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24420);assertTrue( Arrays.equals( new double[] { 2.3, 6.4, 10.5 }, doubleArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24421);doubleArray = ArrayUtils.add( new double[] { 2.6, 6.7 }, 0, -4.8);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24422);assertTrue( Arrays.equals( new double[] { -4.8, 2.6, 6.7 }, doubleArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24423);doubleArray = ArrayUtils.add( new double[] { 2.9, 6.0, 0.3 }, 2, 1.0);
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24424);assertTrue( Arrays.equals( new double[] { 2.9, 6.0, 1.0, 0.3 }, doubleArray ) );
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24425);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24426);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, 4, 10.5);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24427);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_5_2ijtijtlvha7e7r.R.inc(24428);try {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24429);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, -1, 10.5);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_5_2ijtijtlvha7e7r.R.inc(24430);assertEquals("Index: -1, Length: 2", e.getMessage());
        }
    }finally{__CLR4_5_2ijtijtlvha7e7r.R.flushNeeded();}}

}
