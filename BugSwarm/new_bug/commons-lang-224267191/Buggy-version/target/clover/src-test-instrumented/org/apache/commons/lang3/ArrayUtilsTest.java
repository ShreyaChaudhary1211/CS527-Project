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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ArrayUtils}.
 */
@SuppressWarnings("deprecation") // deliberate use of deprecated code
public class ArrayUtilsTest  {static class __CLR4_5_2k0dk0dlvha7f8c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,29009,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),25933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hk0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hk0d(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(25933);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25934);assertNotNull(new ArrayUtils());
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25935);final Constructor<?>[] cons = ArrayUtils.class.getDeclaredConstructors();
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25936);assertEquals(1, cons.length);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25937);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25938);assertTrue(Modifier.isPublic(ArrayUtils.class.getModifiers()));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25939);assertFalse(Modifier.isFinal(ArrayUtils.class.getModifiers()));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),25940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidk0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidk0k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(25940);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25941);assertEquals("{}", ArrayUtils.toString(null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25942);assertEquals("{}", ArrayUtils.toString(new Object[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25943);assertEquals("{}", ArrayUtils.toString(new String[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25944);assertEquals("{<null>}", ArrayUtils.toString(new String[] {null}));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25945);assertEquals("{pink,blue}", ArrayUtils.toString(new String[] {"pink","blue"}));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25946);assertEquals("<empty>", ArrayUtils.toString(null, "<empty>"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25947);assertEquals("{}", ArrayUtils.toString(new Object[0], "<empty>"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25948);assertEquals("{}", ArrayUtils.toString(new String[0], "<empty>"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25949);assertEquals("{<null>}", ArrayUtils.toString(new String[] {null}, "<empty>"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25950);assertEquals("{pink,blue}", ArrayUtils.toString(new String[] {"pink","blue"}, "<empty>"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testHashCode() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),25951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8k0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8k0v(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(25951);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25952);final long[][] array1 = new long[][] {{2,5}, {4,5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25953);final long[][] array2 = new long[][] {{2,5}, {4,6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25954);assertTrue(ArrayUtils.hashCode(array1) == ArrayUtils.hashCode(array1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25955);assertFalse(ArrayUtils.hashCode(array1) == ArrayUtils.hashCode(array2));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25956);final Object[] array3 = new Object[] {new String(new char[] {'A', 'B'})};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25957);final Object[] array4 = new Object[] {"AB"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25958);assertTrue(ArrayUtils.hashCode(array3) == ArrayUtils.hashCode(array3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25959);assertTrue(ArrayUtils.hashCode(array3) == ArrayUtils.hashCode(array4));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25960);final Object[] arrayA = new Object[] {new boolean[] {true, false}, new int[] {6, 7}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25961);final Object[] arrayB = new Object[] {new boolean[] {true, false}, new int[] {6, 7}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25962);assertTrue(ArrayUtils.hashCode(arrayB) == ArrayUtils.hashCode(arrayA));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertIsEquals(final Object array1, final Object array2, final Object array3) {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(25963);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25964);assertTrue(ArrayUtils.isEquals(array1, array1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25965);assertTrue(ArrayUtils.isEquals(array2, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25966);assertTrue(ArrayUtils.isEquals(array3, array3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25967);assertFalse(ArrayUtils.isEquals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25968);assertFalse(ArrayUtils.isEquals(array2, array1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25969);assertFalse(ArrayUtils.isEquals(array1, array3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25970);assertFalse(ArrayUtils.isEquals(array3, array1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25971);assertFalse(ArrayUtils.isEquals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25972);assertFalse(ArrayUtils.isEquals(array2, array1));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsEquals() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),25973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26db4dak1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25973,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26db4dak1h(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(25973);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25974);final long[][] larray1 = new long[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25975);final long[][] larray2 = new long[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25976);final long[] larray3 = new long[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25977);this.assertIsEquals(larray1, larray2, larray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25978);final int[][] iarray1 = new int[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25979);final int[][] iarray2 = new int[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25980);final int[] iarray3 = new int[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25981);this.assertIsEquals(iarray1, iarray2, iarray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25982);final short[][] sarray1 = new short[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25983);final short[][] sarray2 = new short[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25984);final short[] sarray3 = new short[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25985);this.assertIsEquals(sarray1, sarray2, sarray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25986);final float[][] farray1 = new float[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25987);final float[][] farray2 = new float[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25988);final float[] farray3 = new float[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25989);this.assertIsEquals(farray1, farray2, farray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25990);final double[][] darray1 = new double[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25991);final double[][] darray2 = new double[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25992);final double[] darray3 = new double[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25993);this.assertIsEquals(darray1, darray2, darray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25994);final byte[][] byteArray1 = new byte[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25995);final byte[][] byteArray2 = new byte[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25996);final byte[] byteArray3 = new byte[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25997);this.assertIsEquals(byteArray1, byteArray2, byteArray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25998);final char[][] charArray1 = new char[][]{{2, 5}, {4, 5}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(25999);final char[][] charArray2 = new char[][]{{2, 5}, {4, 6}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26000);final char[] charArray3 = new char[]{2, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26001);this.assertIsEquals(charArray1, charArray2, charArray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26002);final boolean[][] barray1 = new boolean[][]{{true, false}, {true, true}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26003);final boolean[][] barray2 = new boolean[][]{{true, false}, {true, false}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26004);final boolean[] barray3 = new boolean[]{false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26005);this.assertIsEquals(barray1, barray2, barray3);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26006);final Object[] array3 = new Object[]{new String(new char[]{'A', 'B'})};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26007);final Object[] array4 = new Object[]{"AB"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26008);assertTrue(ArrayUtils.isEquals(array3, array3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26009);assertTrue(ArrayUtils.isEquals(array3, array4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26010);assertTrue(ArrayUtils.isEquals(null, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26011);assertFalse(ArrayUtils.isEquals(null, array4));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Tests generic array creation with parameters of same type.
     */
    @Test
    public void testArrayCreation()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j74m7hk2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j74m7hk2k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26012);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26013);final String[] array = ArrayUtils.toArray("foo", "bar");
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26014);assertEquals(2, array.length);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26015);assertEquals("foo", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26016);assertEquals("bar", array[1]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests generic array creation with general return type.
     */
    @Test
    public void testArrayCreationWithGeneralReturnType()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l99tg3k2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreationWithGeneralReturnType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l99tg3k2p(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26017);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26018);final Object obj = ArrayUtils.toArray("foo", "bar");
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26019);assertTrue(obj instanceof String[]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests generic array creation with parameters of common base type.
     */
    @Test
    public void testArrayCreationWithDifferentTypes()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zq74dk2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreationWithDifferentTypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zq74dk2s(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26020);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26021);final Number[] array = ArrayUtils.<Number>toArray(Integer.valueOf(42), Double.valueOf(Math.PI));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26022);assertEquals(2, array.length);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26023);assertEquals(Integer.valueOf(42), array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26024);assertEquals(Double.valueOf(Math.PI), array[1]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests generic array creation with generic type.
     */
    @Test
    public void testIndirectArrayCreation()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yg1httk2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndirectArrayCreation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yg1httk2x(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26025);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26026);final String[] array = toArrayPropagatingType("foo", "bar");
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26027);assertEquals(2, array.length);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26028);assertEquals("foo", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26029);assertEquals("bar", array[1]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests generic empty array creation with generic type.
     */
    @Test
    public void testEmptyArrayCreation()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o59jvok32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testEmptyArrayCreation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o59jvok32(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26030);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26031);final String[] array = ArrayUtils.<String>toArray();
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26032);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests indirect generic empty array creation with generic type.
     */
    @Test
    public void testIndirectEmptyArrayCreation()
    {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zb2luak35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndirectEmptyArrayCreation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26033,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zb2luak35(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26033);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26034);final String[] array = ArrayUtilsTest.<String>toArrayPropagatingType();
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26035);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SafeVarargs
    private static <T> T[] toArrayPropagatingType(final T... items)
    {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26036);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26037);return ArrayUtils.toArray(items);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testToMap() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27y2w2ek3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27y2w2ek3a(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26038);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26039);Map<?, ?> map = ArrayUtils.toMap(new String[][] {{"foo", "bar"}, {"hello", "world"}});
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26040);assertEquals("bar", map.get("foo"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26041);assertEquals("world", map.get("hello"));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26042);assertEquals(null, ArrayUtils.toMap(null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26043);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26044);ArrayUtils.toMap(new String[][] {{"foo", "bar"}, {"short"}});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26045);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26046);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26047);ArrayUtils.toMap(new Object[] {new Object[] {"foo", "bar"}, "illegal type"});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26048);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26049);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26050);ArrayUtils.toMap(new Object[] {new Object[] {"foo", "bar"}, null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26051);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26052);map = ArrayUtils.toMap(new Object[] {new Map.Entry<Object, Object>() {
            @Override
            public Object getKey() {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26053);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(26054);return "foo";
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
            @Override
            public Object getValue() {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26055);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(26056);return "bar";
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
            @Override
            public Object setValue(final Object value) {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26057);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(26058);throw new UnsupportedOperationException();
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
            @Override
            public boolean equals(final Object o) {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26059);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(26060);throw new UnsupportedOperationException();
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
            @Override
            public int hashCode() {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26061);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(26062);throw new UnsupportedOperationException();
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
        }});
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26063);assertEquals("bar", map.get("foo"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClone() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2csyejyk40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testClone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2csyejyk40(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26064);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26065);assertArrayEquals(null, ArrayUtils.clone((Object[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26066);Object[] original1 = new Object[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26067);Object[] cloned1 = ArrayUtils.clone(original1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26068);assertTrue(Arrays.equals(original1, cloned1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26069);assertTrue(original1 != cloned1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26070);final StringBuilder builder = new StringBuilder("pick");
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26071);original1 = new Object[] {builder, "a", new String[] {"stick"}};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26072);cloned1 = ArrayUtils.clone(original1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26073);assertTrue(Arrays.equals(original1, cloned1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26074);assertTrue(original1 != cloned1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26075);assertSame(original1[0], cloned1[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26076);assertSame(original1[1], cloned1[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26077);assertSame(original1[2], cloned1[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testCloneBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmt0kk4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmt0kk4e(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26078);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26079);assertEquals(null, ArrayUtils.clone((boolean[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26080);final boolean[] original = new boolean[] {true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26081);final boolean[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26082);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26083);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0c0b6k4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0c0b6k4k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26084);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26085);assertEquals(null, ArrayUtils.clone((long[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26086);final long[] original = new long[] {0L, 1L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26087);final long[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26088);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26089);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2raqc3vk4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2raqc3vk4q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26090);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26091);assertEquals(null, ArrayUtils.clone((int[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26092);final int[] original = new int[] {5, 8};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26093);final int[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26094);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26095);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mg9ugok4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mg9ugok4w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26096);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26097);assertEquals(null, ArrayUtils.clone((short[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26098);final short[] original = new short[] {1, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26099);final short[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26100);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26101);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iuz8cok52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iuz8cok52(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26102);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26103);assertEquals(null, ArrayUtils.clone((char[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26104);final char[] original = new char[] {'a', '4'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26105);final char[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26106);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26107);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wc2nuk58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wc2nuk58(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26108);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26109);assertEquals(null, ArrayUtils.clone((byte[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26110);final byte[] original = new byte[] {1, 6};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26111);final byte[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26112);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26113);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3apgjk5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3apgjk5e(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26114);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26115);assertEquals(null, ArrayUtils.clone((double[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26116);final double[] original = new double[] {2.4d, 5.7d};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26117);final double[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26118);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26119);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testCloneFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23smw14k5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23smw14k5k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26120);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26121);assertEquals(null, ArrayUtils.clone((float[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26122);final float[] original = new float[] {2.6f, 6.4f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26123);final float[] cloned = ArrayUtils.clone(original);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26124);assertTrue(Arrays.equals(original, cloned));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26125);assertTrue(original != cloned);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    private class TestClass{}
    
    @Test
    public void testNullToEmptyGenericNull() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxu7kck5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyGenericNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxu7kck5q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26126);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26127);final TestClass[] output = ArrayUtils.nullToEmpty(null, TestClass[].class);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26128);assertTrue(output != null);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26129);assertTrue(output.length == 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyGenericEmpty() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29l1wyyk5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyGenericEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29l1wyyk5u(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26130);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26131);final TestClass[] input = new TestClass[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26132);final TestClass[] output = ArrayUtils.nullToEmpty(input, TestClass[].class);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26133);assertSame(input, output);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyGeneric() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2uhvpk5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyGeneric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2uhvpk5y(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26134);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26135);final TestClass[] input = new TestClass[]{new TestClass(), new TestClass()};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26136);final TestClass[] output = ArrayUtils.nullToEmpty(input, TestClass[].class);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26137);assertSame(input, output);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testNullToEmptyGenericNullType() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uv6ueek62();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,84,111,69,109,112,116,121,71,101,110,101,114,105,99,78,117,108,108,84,121,112,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyGenericNullType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uv6ueek62(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26138);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26139);final TestClass[] input = new TestClass[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26140);ArrayUtils.nullToEmpty(input, null);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}    

    @Test
    public void testNullToEmptyBooleanNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m7ved9k65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m7ved9k65() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26141);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26142);assertEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.nullToEmpty((boolean[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBooleanEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awn76qk67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awn76qk67() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26143);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26144);final boolean[] empty = new boolean[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26145);final boolean[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26146);assertEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26147);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tt5bnak6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tt5bnak6c(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26148);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26149);final boolean[] original = new boolean[] {true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26150);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLongNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cc82lk6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cc82lk6f() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26151);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26152);assertEquals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.nullToEmpty((long[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLongEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270iu9kk6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270iu9kk6h() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26153);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26154);final long[] empty = new long[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26155);final long[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26156);assertEquals(ArrayUtils.EMPTY_LONG_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26157);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27jx3j8k6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27jx3j8k6m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26158);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26159);final long[] original = new long[] {1L, 2L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26160);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyIntNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c77sysk6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c77sysk6p() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26161);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26162);assertEquals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.nullToEmpty((int[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyIntEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2by6c6vk6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2by6c6vk6r() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26163);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26164);final int[] empty = new int[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26165);final int[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26166);assertEquals(ArrayUtils.EMPTY_INT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26167);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22r4h3xk6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22r4h3xk6w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26168);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26169);final int[] original = new int[] {1, 2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26170);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShortNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dtf3lbk6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dtf3lbk6z() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26171);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26172);assertEquals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.nullToEmpty((short[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShortEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwhx9yk71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwhx9yk71() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26173);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26174);final short[] empty = new short[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26175);final short[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26176);assertEquals(ArrayUtils.EMPTY_SHORT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26177);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hb3kqyk76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hb3kqyk76(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26178);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26179);final short[] original = new short[] {1, 2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26180);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyCharNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j67oebk79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyCharNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j67oebk79() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26181);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26182);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.nullToEmpty((char[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyCharEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28wb3j2k7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyCharEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28wb3j2k7b() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26183);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26184);final char[] empty = new char[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26185);final char[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26186);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26187);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vppwuik7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vppwuik7g(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26188);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26189);final char[] original = new char[] {'a', 'b'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26190);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByteNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29h228hk7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29h228hk7j() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26191);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26192);assertEquals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.nullToEmpty((byte[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByteEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246y91wk7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246y91wk7l() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26193);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26194);final byte[] empty = new byte[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26195);final byte[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26196);assertEquals(ArrayUtils.EMPTY_BYTE_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26197);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ncqzfsk7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ncqzfsk7q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26198);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26199);final byte[] original = new byte[] {0x0F, 0x0E};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26200);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDoubleNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0yne0k7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0yne0k7t() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26201);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26202);assertEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.nullToEmpty((double[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDoubleEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lh6wl9k7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lh6wl9k7v() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26203);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26204);final double[] empty = new double[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26205);final double[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26206);assertEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26207);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28p4g9dk80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28p4g9dk80(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26208);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26209);final double[] original = new double[] {1L, 2L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26210);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloatNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z3u4flk83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z3u4flk83() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26211);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26212);assertEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.nullToEmpty((float[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloatEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24fda3uk85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24fda3uk85() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26213);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26214);final float[] empty = new float[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26215);final float[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26216);assertEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26217);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28xt5quk8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28xt5quk8a(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26218);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26219);final float[] original = new float[] {2.6f, 3.8f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26220);assertEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2top7i2k8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2top7i2k8d() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26221);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26222);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Object[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26z0xudk8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26z0xudk8f() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26223);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26224);final Object[] empty = new Object[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26225);final Object[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26226);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26227);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dgrzepk8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dgrzepk8k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26228);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26229);final Object[] original = new Object[] {Boolean.TRUE, Boolean.FALSE};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26230);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyClassNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lglyerk8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyClassNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lglyerk8n() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26231);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26232);assertArrayEquals(ArrayUtils.EMPTY_CLASS_ARRAY, ArrayUtils.nullToEmpty((Class<?>[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyClassEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ixrp6ak8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyClassEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26233,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ixrp6ak8p() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26233);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26234);final Class<?>[] empty = {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26235);final Class<?>[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26236);assertArrayEquals(ArrayUtils.EMPTY_CLASS_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26237);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyClass() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ubssw6k8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ubssw6k8u(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26238);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26239);final Class<?>[] original = { Object.class, String.class };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26240);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyStringNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27v1qvsk8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyStringNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27v1qvsk8x() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26241);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26242);assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.nullToEmpty((String[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyStringEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25tnghvk8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyStringEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25tnghvk8z() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26243);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26244);final String[] empty = new String[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26245);final String[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26246);assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26247);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyString() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22x3zhrk94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22x3zhrk94(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26248);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26249);final String[] original = new String[] {"abc", "def"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26250);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBooleanObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5wq10k97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5wq10k97() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26251);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26252);assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Boolean[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBooleanObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kq3pnlk99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kq3pnlk99() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26253);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26254);final Boolean[] empty = new Boolean[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26255);final Boolean[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26256);assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26257);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBooleanObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27yol8rk9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27yol8rk9e(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26258);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26259);final Boolean[] original = new Boolean[] {Boolean.TRUE, Boolean.FALSE};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26260);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLongObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s32rhak9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26261,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s32rhak9h() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26261);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26262);assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Long[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLongObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x2yc3dk9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x2yc3dk9j() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26263);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26264);final Long[] empty = new Long[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26265);final Long[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26266);assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26267);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyLongObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28b36g5k9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28b36g5k9o(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26268);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26269);@SuppressWarnings("boxing")
        final Long[] original = new Long[] {1L, 2L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26270);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyIntObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0q9elk9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0q9elk9r() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26271);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26272);assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Integer[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyIntObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vczzsok9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vczzsok9t() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26273);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26274);final Integer[] empty = new Integer[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26275);final Integer[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26276);assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26277);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyIntObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oqsk2kk9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oqsk2kk9y(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26278);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26279);final Integer[] original = new Integer[] {1, 2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26280);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShortObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bty028ka1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bty028ka1() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26281);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26282);assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Short[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShortObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xzdovpka3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xzdovpka3() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26283);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26284);final Short[] empty = new Short[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26285);final Short[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26286);assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26287);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyShortObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2on0r9lka8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2on0r9lka8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26288);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26289);@SuppressWarnings("boxing")
        final Short[] original = new Short[] {1, 2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26290);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNUllToEmptyCharObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwp40skab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNUllToEmptyCharObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwp40skab() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26291);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26292);assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Character[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyCharObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2slkeldkad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyCharObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2slkeldkad() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26293);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26294);final Character[] empty = new Character[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26295);final Character[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26296);assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26297);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyCharObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nqonfkai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyCharObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nqonfkai(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26298);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26299);final Character[] original = new Character[] {'a', 'b'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26300);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByteObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gvlo5ukal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gvlo5ukal() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26301);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26302);assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Byte[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByteObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ta1nwzkan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ta1nwzkan() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26303);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26304);final Byte[] empty = new Byte[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26305);final Byte[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26306);assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26307);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyByteObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27teqavkas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27teqavkas(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26308);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26309);final Byte[] original = new Byte[] {0x0F, 0x0E};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26310);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDoubleObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2emzdjkav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2emzdjkav() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26311);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26312);assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Double[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDoubleObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g93tmkkax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g93tmkkax() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26313);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26314);final Double[] empty = new Double[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26315);final Double[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26316);assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26317);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyDoubleObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jpndjkkb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jpndjkkb2(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26318);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26319);final Double[] original = new Double[] {1D, 2D};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26320);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloatObjectNull() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2phx7bkkb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatObjectNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2phx7bkkb5() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26321);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26322);assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Float[]) null));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloatObjectEmptyArray() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n79f57kb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatObjectEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n79f57kb7() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26323);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26324);final Float[] empty = new Float[]{};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26325);final Float[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26326);assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, result);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26327);assertNotSame(empty, result);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testNullToEmptyFloatObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hxnnc9kbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hxnnc9kbc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26328);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26329);final Float[] original = new Float[] {2.6f, 3.8f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26330);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testSubarrayObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gars35kbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gars35kbf(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26331);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26332);final Object[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26333);final Object[] objectArray = { "a", "b", "c", "d", "e", "f"};

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26334);assertEquals("0 start, mid end", "abcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, 0, 4)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26335);assertEquals("0 start, length end", "abcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 0, objectArray.length)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26336);assertEquals("mid start, mid end", "bcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, 1, 4)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26337);assertEquals("mid start, length end", "bcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 1, objectArray.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26338);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26339);assertEquals("empty array", "",
            StringUtils.join(ArrayUtils.subarray(ArrayUtils.EMPTY_OBJECT_ARRAY, 1, 2)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26340);assertEquals("start > end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 4, 2)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26341);assertEquals("start == end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 3, 3)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26342);assertEquals("start undershoot, normal end", "abcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, -2, 4)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26343);assertEquals("start overshoot, any end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 33, 4)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26344);assertEquals("normal start, end overshoot", "cdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 2, 33)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26345);assertEquals("start undershoot, end overshoot", "abcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, -2, 12)));
            
        // array type tests
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26346);final Date[] dateArray = { new java.sql.Date(new Date().getTime()),
            new Date(), new Date(), new Date(), new Date() };

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26347);assertSame("Object type", Object.class,
            ArrayUtils.subarray(objectArray, 2, 4).getClass().getComponentType());
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26348);assertSame("java.util.Date type", java.util.Date.class,
            ArrayUtils.subarray(dateArray, 1, 4).getClass().getComponentType());
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26349);assertNotSame("java.sql.Date type", java.sql.Date.class,
            ArrayUtils.subarray(dateArray, 1, 4).getClass().getComponentType());
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26350);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26351);@SuppressWarnings("unused")
            final
            java.sql.Date[] dummy = (java.sql.Date[])ArrayUtils.subarray(dateArray, 1,3);
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26352);fail("Invalid downcast");
        } catch (final ClassCastException e) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bftxgykc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bftxgykc1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26353);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26354);final long[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26355);final long[] array = { 999910, 999911, 999912, 999913, 999914, 999915 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26356);final long[] leftSubarray     = { 999910, 999911, 999912, 999913 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26357);final long[] midSubarray      = { 999911, 999912, 999913, 999914 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26358);final long[] rightSubarray    = { 999912, 999913, 999914, 999915 };

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26359);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26360);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26361);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26362);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26363);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26364);assertEquals("empty array", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_LONG_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26365);assertEquals("start > end", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26366);assertEquals("start == end", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26367);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26368);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26369);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26370);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26371);assertSame("empty array, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_LONG_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26372);assertSame("start > end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26373);assertSame("start == end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26374);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26375);assertSame("long type", long.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22mlzvvkco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22mlzvvkco(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26376);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26377);final int[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26378);final int[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26379);final int[] leftSubarray  = { 10, 11, 12, 13 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26380);final int[] midSubarray   = { 11, 12, 13, 14 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26381);final int[] rightSubarray = { 12, 13, 14, 15 };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26382);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26383);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26384);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26385);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26386);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26387);assertEquals("empty array", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_INT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26388);assertEquals("start > end", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26389);assertEquals("start == end", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26390);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26391);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26392);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26393);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26394);assertSame("empty array, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_INT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26395);assertSame("start > end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26396);assertSame("start == end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26397);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26398);assertSame("int type", int.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w525bckdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w525bckdb(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26399);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26400);final short[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26401);final short[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26402);final short[] leftSubarray    = { 10, 11, 12, 13 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26403);final short[] midSubarray     = { 11, 12, 13, 14 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26404);final short[] rightSubarray   = { 12, 13, 14, 15 };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26405);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26406);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26407);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26408);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26409);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26410);assertEquals("empty array", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_SHORT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26411);assertEquals("start > end", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26412);assertEquals("start == end", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26413);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26414);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26415);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26416);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26417);assertSame("empty array, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_SHORT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26418);assertSame("start > end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26419);assertSame("start == end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26420);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26421);assertSame("short type", short.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnqc28kdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnqc28kdy(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26422);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26423);final char[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26424);final char[] array = { 'a', 'b', 'c', 'd', 'e', 'f' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26425);final char[] leftSubarray     = { 'a', 'b', 'c', 'd', };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26426);final char[] midSubarray      = { 'b', 'c', 'd', 'e', };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26427);final char[] rightSubarray    = { 'c', 'd', 'e', 'f', };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26428);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26429);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26430);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26431);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26432);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26433);assertEquals("empty array", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_CHAR_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26434);assertEquals("start > end", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26435);assertEquals("start == end", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26436);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26437);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26438);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26439);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26440);assertSame("empty array, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_CHAR_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26441);assertSame("start > end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26442);assertSame("start == end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26443);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26444);assertSame("char type", char.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgu5i2kel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgu5i2kel(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26445);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26446);final byte[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26447);final byte[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26448);final byte[] leftSubarray     = { 10, 11, 12, 13 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26449);final byte[] midSubarray      = { 11, 12, 13, 14 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26450);final byte[] rightSubarray = { 12, 13, 14, 15 };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26451);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26452);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26453);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26454);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26455);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26456);assertEquals("empty array", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_BYTE_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26457);assertEquals("start > end", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26458);assertEquals("start == end", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26459);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26460);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26461);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26462);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26463);assertSame("empty array, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_BYTE_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26464);assertSame("start > end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26465);assertSame("start == end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26466);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26467);assertSame("byte type", byte.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wkfu7xkf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wkfu7xkf8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26468);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26469);final double[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26470);final double[] array = { 10.123, 11.234, 12.345, 13.456, 14.567, 15.678 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26471);final double[] leftSubarray   = { 10.123, 11.234, 12.345, 13.456, };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26472);final double[] midSubarray    = { 11.234, 12.345, 13.456, 14.567, };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26473);final double[] rightSubarray  = { 12.345, 13.456, 14.567, 15.678 };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26474);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26475);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26476);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26477);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26478);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26479);assertEquals("empty array", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_DOUBLE_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26480);assertEquals("start > end", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26481);assertEquals("start == end", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26482);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26483);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26484);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26485);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26486);assertSame("empty array, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_DOUBLE_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26487);assertSame("start > end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26488);assertSame("start == end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26489);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26490);assertSame("double type", double.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cn5660kfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cn5660kfv(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26491);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26492);final float[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26493);final float[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26494);final float[] leftSubarray    = { 10, 11, 12, 13 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26495);final float[] midSubarray     = { 11, 12, 13, 14 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26496);final float[] rightSubarray   = { 12, 13, 14, 15 };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26497);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26498);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26499);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26500);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26501);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26502);assertEquals("empty array", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_FLOAT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26503);assertEquals("start > end", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26504);assertEquals("start == end", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26505);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26506);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26507);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26508);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26509);assertSame("empty array, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_FLOAT_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26510);assertSame("start > end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26511);assertSame("start == end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26512);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26513);assertSame("float type", float.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSubarrayBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4pabokgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26514,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4pabokgi(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26514);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26515);final boolean[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26516);final boolean[] array = { true, true, false, true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26517);final boolean[] leftSubarray  = { true, true, false, true  };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26518);final boolean[] midSubarray   = { true, false, true, false };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26519);final boolean[] rightSubarray = { false, true, false, true };


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26520);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26521);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26522);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26523);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26524);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26525);assertEquals("empty array", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_BOOLEAN_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26526);assertEquals("start > end", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26527);assertEquals("start == end", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26528);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26529);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26530);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26531);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26532);assertSame("empty array, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_BOOLEAN_ARRAY, 1, 2));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26533);assertSame("start > end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26534);assertSame("start == end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26535);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26536);assertSame("boolean type", boolean.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSameLength() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lcrag5kh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lcrag5kh5(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26537);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26538);final Object[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26539);final Object[] emptyArray = new Object[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26540);final Object[] oneArray = new Object[] {"pick"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26541);final Object[] twoArray = new Object[] {"pick", "stick"};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26542);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26543);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26544);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26545);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26546);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26547);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26548);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26549);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26550);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26551);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26552);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26553);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26554);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26555);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26556);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26557);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSameLengthBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_249qj3lkhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_249qj3lkhq(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26558);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26559);final boolean[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26560);final boolean[] emptyArray = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26561);final boolean[] oneArray = new boolean[] {true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26562);final boolean[] twoArray = new boolean[] {true, false};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26563);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26564);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26565);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26566);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26567);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26568);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26569);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26570);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26571);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26572);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26573);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26574);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26575);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26576);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26577);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26578);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gbloe9kib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gbloe9kib(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26579);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26580);final long[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26581);final long[] emptyArray = new long[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26582);final long[] oneArray = new long[] {0L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26583);final long[] twoArray = new long[] {0L, 76L};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26584);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26585);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26586);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26587);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26588);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26589);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26590);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26591);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26592);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26593);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26594);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26595);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26596);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26597);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26598);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26599);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a82o6gkiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a82o6gkiw(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26600);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26601);final int[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26602);final int[] emptyArray = new int[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26603);final int[] oneArray = new int[] {4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26604);final int[] twoArray = new int[] {5, 7};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26605);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26606);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26607);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26608);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26609);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26610);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26611);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26612);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26613);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26614);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26615);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26616);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26617);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26618);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26619);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26620);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvyz5nkjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvyz5nkjh(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26621);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26622);final short[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26623);final short[] emptyArray = new short[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26624);final short[] oneArray = new short[] {4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26625);final short[] twoArray = new short[] {6, 8};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26626);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26627);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26628);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26629);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26630);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26631);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26632);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26633);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26634);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26635);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26636);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26637);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26638);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26639);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26640);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26641);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27u74x1kk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27u74x1kk2(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26642);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26643);final char[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26644);final char[] emptyArray = new char[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26645);final char[] oneArray = new char[] {'f'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26646);final char[] twoArray = new char[] {'d', 't'};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26647);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26648);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26649);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26650);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26651);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26652);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26653);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26654);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26655);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26656);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26657);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26658);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26659);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26660);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26661);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26662);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsualvkkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsualvkkn(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26663);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26664);final byte[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26665);final byte[] emptyArray = new byte[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26666);final byte[] oneArray = new byte[] {3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26667);final byte[] twoArray = new byte[] {4, 6};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26668);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26669);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26670);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26671);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26672);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26673);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26674);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26675);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26676);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26677);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26678);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26679);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26680);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26681);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26682);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26683);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5yarakl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5yarakl8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26684);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26685);final double[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26686);final double[] emptyArray = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26687);final double[] oneArray = new double[] {1.3d};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26688);final double[] twoArray = new double[] {4.5d, 6.3d};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26689);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26690);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26691);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26692);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26693);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26694);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26695);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26696);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26697);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26698);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26699);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26700);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26701);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26702);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26703);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26704);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSameLengthFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kw8cbpklt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kw8cbpklt(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26705);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26706);final float[] nullArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26707);final float[] emptyArray = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26708);final float[] oneArray = new float[] {2.5f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26709);final float[] twoArray = new float[] {6.4f, 5.8f};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26710);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26711);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26712);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26713);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26714);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26715);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26716);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26717);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26718);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26719);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26720);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26721);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26722);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26723);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26724);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26725);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSameType() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fxwlfdkme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fxwlfdkme(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26726);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26727);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26728);ArrayUtils.isSameType(null, null);
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26729);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26730);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26731);ArrayUtils.isSameType(null, new Object[0]);
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26732);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26733);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26734);ArrayUtils.isSameType(new Object[0], null);
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(26735);fail();
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26736);assertTrue(ArrayUtils.isSameType(new Object[0], new Object[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26737);assertFalse(ArrayUtils.isSameType(new String[0], new Object[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26738);assertTrue(ArrayUtils.isSameType(new String[0][0], new String[0][0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26739);assertFalse(ArrayUtils.isSameType(new String[0], new String[0][0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26740);assertFalse(ArrayUtils.isSameType(new String[0][0], new String[0]));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testReverse() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8om2xkmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8om2xkmt(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26741);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26742);final StringBuffer str1 = new StringBuffer("pick");
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26743);final String str2 = "a";
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26744);final String[] str3 = new String[] {"stick"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26745);final String str4 = "up";
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26746);Object[] array = new Object[] {str1, str2, str3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26747);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26748);assertEquals(array[0], str3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26749);assertEquals(array[1], str2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26750);assertEquals(array[2], str1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26751);array = new Object[] {str1, str2, str3, str4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26752);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26753);assertEquals(array[0], str4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26754);assertEquals(array[1], str3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26755);assertEquals(array[2], str2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26756);assertEquals(array[3], str1);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26757);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26758);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26759);assertArrayEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testReverseLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ymavrnknc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ymavrnknc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26760);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26761);long[] array = new long[] {1L, 2L, 3L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26762);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26763);assertEquals(array[0], 3L);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26764);assertEquals(array[1], 2L);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26765);assertEquals(array[2], 1L);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26766);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26767);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26768);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bxba2iknl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26769,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bxba2iknl(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26769);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26770);int[] array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26771);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26772);assertEquals(array[0], 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26773);assertEquals(array[1], 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26774);assertEquals(array[2], 1);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26775);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26776);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26777);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ox62fhknu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ox62fhknu(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26778);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26779);short[] array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26780);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26781);assertEquals(array[0], 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26782);assertEquals(array[1], 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26783);assertEquals(array[2], 1);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26784);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26785);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26786);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2agi2gdko3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2agi2gdko3(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26787);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26788);char[] array = new char[] {'a', 'f', 'C'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26789);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26790);assertEquals(array[0], 'C');
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26791);assertEquals(array[1], 'f');
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26792);assertEquals(array[2], 'a');

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26793);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26794);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26795);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25i538hkoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25i538hkoc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26796);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26797);byte[] array = new byte[] {2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26798);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26799);assertEquals(array[0], 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26800);assertEquals(array[1], 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26801);assertEquals(array[2], 2);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26802);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26803);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26804);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lv5ipkkol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lv5ipkkol(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26805);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26806);double[] array = new double[] {0.3d, 0.4d, 0.5d};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26807);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26808);assertEquals(array[0], 0.5d, 0.0d);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26809);assertEquals(array[1], 0.4d, 0.0d);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26810);assertEquals(array[2], 0.3d, 0.0d);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26811);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26812);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26813);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jv191vkou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jv191vkou(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26814);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26815);float[] array = new float[] {0.3f, 0.4f, 0.5f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26816);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26817);assertEquals(array[0], 0.5f, 0.0f);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26818);assertEquals(array[1], 0.4f, 0.0f);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26819);assertEquals(array[2], 0.3f, 0.0f);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26820);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26821);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26822);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25r0x9bkp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25r0x9bkp3(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26823);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26824);boolean[] array = new boolean[] {false, false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26825);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26826);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26827);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26828);assertFalse(array[2]);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26829);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26830);ArrayUtils.reverse(array);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26831);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseBooleanRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cc4qj8kpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseBooleanRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cc4qj8kpc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26832);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26833);boolean[] array = new boolean[] {false, false, true};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26834);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26835);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26836);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26837);assertFalse(array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26838);array = new boolean[] {false, false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26839);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26840);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26841);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26842);assertTrue(array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26843);array = new boolean[] {false, false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26844);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26845);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26846);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26847);assertFalse(array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26848);array = new boolean[] {false, false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26849);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26850);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26851);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26852);assertFalse(array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26853);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26854);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26855);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseByteRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hxnc18kq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseByteRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hxnc18kq0(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26856);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26857);byte[] array = new byte[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26858);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26859);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26860);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26861);assertEquals(1, array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26862);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26863);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26864);assertEquals(2, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26865);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26866);assertEquals(3, array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26867);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26868);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26869);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26870);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26871);assertEquals(1, array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26872);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26873);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26874);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26875);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26876);assertEquals(1, array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26877);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26878);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26879);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseCharRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21e9gwukqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseCharRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21e9gwukqo(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26880);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26881);char[] array = new char[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26882);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26883);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26884);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26885);assertEquals(1, array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26886);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26887);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26888);assertEquals(2, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26889);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26890);assertEquals(3, array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26891);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26892);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26893);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26894);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26895);assertEquals(1, array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26896);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26897);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26898);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26899);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26900);assertEquals(1, array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26901);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26902);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26903);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseDoubleRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wlccwtkrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseDoubleRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wlccwtkrc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26904);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26905);double[] array = new double[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26906);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26907);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26908);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26909);assertEquals(1, array[2], 0);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26910);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26911);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26912);assertEquals(2, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26913);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26914);assertEquals(3, array[2], 0);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26915);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26916);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26917);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26918);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26919);assertEquals(1, array[2], 0);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26920);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26921);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26922);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26923);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26924);assertEquals(1, array[2], 0);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26925);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26926);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26927);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseFloatRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nfepagks0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseFloatRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nfepagks0(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26928);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26929);float[] array = new float[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26930);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26931);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26932);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26933);assertEquals(1, array[2], 0);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26934);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26935);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26936);assertEquals(2, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26937);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26938);assertEquals(3, array[2], 0);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26939);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26940);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26941);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26942);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26943);assertEquals(1, array[2], 0);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26944);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26945);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26946);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26947);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26948);assertEquals(1, array[2], 0);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26949);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26950);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26951);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseIntRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kdsxqzkso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseIntRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kdsxqzkso(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26952);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26953);int[] array = new int[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26954);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26955);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26956);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26957);assertEquals(1, array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26958);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26959);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26960);assertEquals(2, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26961);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26962);assertEquals(3, array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26963);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26964);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26965);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26966);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26967);assertEquals(1, array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26968);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26969);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26970);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26971);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26972);assertEquals(1, array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26973);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26974);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26975);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseLongRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),26976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lzwb3sktc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseLongRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lzwb3sktc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(26976);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26977);long[] array = new long[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26978);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26979);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26980);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26981);assertEquals(1, array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26982);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26983);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26984);assertEquals(2, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26985);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26986);assertEquals(3, array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26987);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26988);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26989);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26990);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26991);assertEquals(1, array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26992);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26993);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26994);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26995);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26996);assertEquals(1, array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26997);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26998);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(26999);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseShortRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mm4legku0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseShortRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mm4legku0(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27001);short[] array = new short[] {1, 2, 3};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27002);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27003);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27004);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27005);assertEquals(1, array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27006);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27007);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27008);assertEquals(2, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27009);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27010);assertEquals(3, array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27011);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27012);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27013);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27014);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27015);assertEquals(1, array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27016);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27017);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27018);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27019);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27020);assertEquals(1, array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27021);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27022);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27023);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testReverseObjectRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e38jhxkuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseObjectRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e38jhxkuo(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27024);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27025);String[] array = new String[] {"1", "2", "3"};
        // The whole array
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27026);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27027);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27028);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27029);assertEquals("1", array[2]);
        // a range
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27030);array = new String[] {"1", "2", "3"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27031);ArrayUtils.reverse(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27032);assertEquals("2", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27033);assertEquals("1", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27034);assertEquals("3", array[2]);
        // a range with a negative start
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27035);array = new String[] {"1", "2", "3"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27036);ArrayUtils.reverse(array, -1, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27037);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27038);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27039);assertEquals("1", array[2]);
        // a range with a large stop index
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27040);array = new String[] {"1", "2", "3"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27041);ArrayUtils.reverse(array, -1, array.length + 1000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27042);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27043);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27044);assertEquals("1", array[2]);
        // null
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27045);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27046);ArrayUtils.reverse(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27047);assertEquals(null, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSwapChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_212e4v6kvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_212e4v6kvc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27048);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27049);char[] array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27050);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27051);assertArrayEquals(new char[] {3, 2, 1}, array);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27052);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27053);ArrayUtils.swap(array, 0, 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27054);assertArrayEquals(new char[] {1, 2, 3}, array);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27055);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27056);ArrayUtils.swap(array, 1, 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27057);assertArrayEquals(new char[] {2, 1, 3}, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapCharRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2acnzk9kvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapCharRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2acnzk9kvm(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27058);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27059);char[] array = new char[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27060);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27061);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27062);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27063);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27064);assertEquals(2, array[3]);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27065);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27066);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27067);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27068);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27069);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27070);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27071);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27072);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27073);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27074);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27075);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27076);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27077);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27078);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27079);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27080);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27081);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27082);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27083);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27084);assertEquals(3, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27085);array = new char[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27086);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27087);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27088);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27089);assertEquals(3, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ew90tokwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ew90tokwi(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27090);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27091);final byte[] array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27092);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27093);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27094);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27095);assertEquals(1, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullByteArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28rin1wkwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28rin1wkwo(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27096);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27097);final byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27098);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27099);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyByteArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lauoy8kws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lauoy8kws(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27100);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27101);final byte[] array = new byte[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27102);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27103);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapByteRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qw1uonkww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapByteRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qw1uonkww(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27104);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27105);byte[] array = new byte[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27106);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27107);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27108);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27109);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27110);assertEquals(2, array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27111);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27112);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27113);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27114);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27115);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27116);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27117);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27118);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27119);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27120);assertEquals(1, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27121);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27122);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27123);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27124);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27125);assertEquals(1, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27126);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27127);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27128);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27129);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27130);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27131);array = new byte[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27132);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27133);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27134);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27135);assertEquals(3, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu3jpakxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu3jpakxs(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27136);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27137);final float[] array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27138);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27139);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27140);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27141);assertEquals(1, array[2], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullFloatArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7du5skxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7du5skxy(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27142);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27143);final float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27144);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27145);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyFloatArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ebwuukky2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ebwuukky2(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27146);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27147);final float[] array = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27148);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27149);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapFloatRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2txcv0zky6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapFloatRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2txcv0zky6(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27150);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27151);float[] array = new float[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27152);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27153);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27154);assertEquals(4, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27155);assertEquals(1, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27156);assertEquals(2, array[3], 0);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27157);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27158);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27159);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27160);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27161);assertEquals(3, array[2], 0);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27162);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27163);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27164);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27165);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27166);assertEquals(1, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27167);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27168);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27169);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27170);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27171);assertEquals(1, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27172);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27173);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27174);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27175);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27176);assertEquals(3, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27177);array = new float[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27178);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27179);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27180);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27181);assertEquals(3, array[2], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qku6mbkz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qku6mbkz2(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27182);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27183);final double[] array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27184);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27185);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27186);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27187);assertEquals(1, array[2], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullDoubleArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kvbx6rkz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kvbx6rkz8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27188);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27189);final double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27190);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27191);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyDoubleArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1dh3tkzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1dh3tkzc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27192);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27193);final double[] array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27194);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27195);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapDoubleRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kyf4tukzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapDoubleRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kyf4tukzg(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27196);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27197);double[] array = new double[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27198);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27199);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27200);assertEquals(4, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27201);assertEquals(1, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27202);assertEquals(2, array[3], 0);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27203);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27204);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27205);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27206);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27207);assertEquals(3, array[2], 0);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27208);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27209);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27210);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27211);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27212);assertEquals(1, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27213);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27214);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27215);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27216);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27217);assertEquals(1, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27218);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27219);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27220);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27221);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27222);assertEquals(3, array[2], 0);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27223);array = new double[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27224);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27225);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27226);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27227);assertEquals(3, array[2], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wulvgvl0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wulvgvl0c(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27228);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27229);final int[] array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27230);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27231);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27232);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27233);assertEquals(1, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullIntArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2604otl0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2604otl0i(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27234);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27235);final int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27236);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27237);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyIntArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ei78nl0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ei78nl0m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27238);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27239);final int[] array = new int[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27240);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27241);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapIntRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_241zokml0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapIntRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27242,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_241zokml0q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27242);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27243);int[] array = new int[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27244);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27245);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27246);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27247);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27248);assertEquals(2, array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27249);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27250);ArrayUtils.swap(array, 3, 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27251);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27252);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27253);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27254);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27255);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27256);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27257);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27258);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27259);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27260);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27261);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27262);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27263);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27264);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27265);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27266);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27267);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27268);assertEquals(3, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27269);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27270);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27271);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27272);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27273);assertEquals(3, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapIntExchangedOffsets() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_287nd3kl1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapIntExchangedOffsets",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_287nd3kl1m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27274);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27275);int[] array;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27276);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27277);ArrayUtils.swap(array, 0, 1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27278);assertArrayEquals(new int[] {2, 3, 1}, array);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27279);array = new int[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27280);ArrayUtils.swap(array, 1, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27281);assertArrayEquals(new int[] {2, 3, 1}, array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vy3rs2l1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vy3rs2l1u(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27282);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27283);final short[] array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27284);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27285);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27286);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27287);assertEquals(1, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullShortArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mu5gj4l20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mu5gj4l20(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27288);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27289);final short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27290);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27291);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyShortArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2annwfol24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2annwfol24(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27292);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27293);final short[] array = new short[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27294);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27295);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapShortRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g46fnxl28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapShortRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g46fnxl28(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27296);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27297);short[] array = new short[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27298);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27299);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27300);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27301);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27302);assertEquals(2, array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27303);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27304);ArrayUtils.swap(array, 3, 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27305);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27306);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27307);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27308);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27309);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27310);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27311);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27312);assertEquals(1, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27313);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27314);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27315);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27316);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27317);assertEquals(1, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27318);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27319);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27320);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27321);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27322);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27323);array = new short[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27324);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27325);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27326);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27327);assertEquals(3, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullCharArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pawi6al34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pawi6al34(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27328);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27329);final char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27330);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27331);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyCharArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x6vhwil38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x6vhwil38(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27332);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27333);final char[] array = new char[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27334);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27335);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p86y6gl3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p86y6gl3c(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27336);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27337);final long[] array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27338);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27339);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27340);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27341);assertEquals(1, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullLongArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24p9nzcl3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24p9nzcl3i(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27342);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27343);final long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27344);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27345);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyLongArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h8lpvol3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h8lpvol3m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27346);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27347);final long[] array = new long[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27348);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27349);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapLongRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uyatr7l3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapLongRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uyatr7l3q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27350);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27351);long[] array = new long[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27352);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27353);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27354);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27355);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27356);assertEquals(2, array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27357);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27358);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27359);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27360);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27361);assertEquals(3, array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27362);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27363);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27364);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27365);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27366);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27367);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27368);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27369);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27370);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27371);assertEquals(1, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27372);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27373);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27374);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27375);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27376);assertEquals(3, array[2]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27377);array = new long[] {1, 2, 3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27378);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27379);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27380);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27381);assertEquals(3, array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21p0g0al4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21p0g0al4m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27382);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27383);final boolean[] array = new boolean[] {true, false, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27384);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27385);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27386);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27387);assertTrue(array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullBooleanArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d5zvssl4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d5zvssl4s(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27388);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27389);final boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27390);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27391);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyBooleanArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oqq5cwl4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oqq5cwl4w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27392);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27393);final boolean[] array = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27394);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27395);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapBooleanRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26r31unl50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapBooleanRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26r31unl50(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27396);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27397);boolean[] array = new boolean[] {false, false, true, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27398);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27399);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27400);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27401);assertFalse(array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27402);assertFalse(array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27403);array = new boolean[] {false, true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27404);ArrayUtils.swap(array, 0, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27405);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27406);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27407);assertFalse(array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27408);array = new boolean[] {true, true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27409);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27410);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27411);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27412);assertTrue(array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27413);array = new boolean[] {true, true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27414);ArrayUtils.swap(array, -1, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27415);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27416);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27417);assertTrue(array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27418);array = new boolean[] {true, true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27419);ArrayUtils.swap(array, 0, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27420);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27421);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27422);assertFalse(array[2]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27423);array = new boolean[] {true, true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27424);ArrayUtils.swap(array, -1, -1, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27425);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27426);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27427);assertFalse(array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2madforl5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2madforl5w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27428);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27429);final String[] array = new String[] {"1", "2", "3"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27430);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27431);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27432);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27433);assertEquals("1", array[2]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapNullObjectArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23h78dnl62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapNullObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23h78dnl62(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27434);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27435);final String[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27436);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27437);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testSwapEmptyObjectArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nn7faxl66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapEmptyObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nn7faxl66(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27438);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27439);final String[] array = new String[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27440);ArrayUtils.swap(array, 0, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27441);assertEquals(0, array.length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testSwapObjectRange() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pq5rkwl6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSwapObjectRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pq5rkwl6a(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27442);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27443);String[] array = new String[] {"1", "2", "3", "4"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27444);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27445);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27446);assertEquals("4", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27447);assertEquals("1", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27448);assertEquals("2", array[3]);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27449);array = new String[] {"1", "2", "3", "4"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27450);ArrayUtils.swap(array, -1, 2, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27451);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27452);assertEquals("4", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27453);assertEquals("1", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27454);assertEquals("2", array[3]);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27455);array = new String[] {"1", "2", "3", "4", "5"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27456);ArrayUtils.swap(array, -3, 2, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27457);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27458);assertEquals("4", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27459);assertEquals("5", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27460);assertEquals("2", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27461);assertEquals("1", array[4]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27462);array = new String[] {"1", "2", "3", "4", "5"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27463);ArrayUtils.swap(array, 2, -2, 3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27464);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27465);assertEquals("4", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27466);assertEquals("5", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27467);assertEquals("2", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27468);assertEquals("1", array[4]);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27469);array = new String[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27470);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27471);assertEquals(0, array.length);
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27472);array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27473);ArrayUtils.swap(array, 0, 2, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27474);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testShiftDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211lfs8l77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211lfs8l77(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27475);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27476);final double[] array = new double[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27477);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27478);assertEquals(4, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27479);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27480);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27481);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27482);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27483);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27484);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27485);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27486);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27487);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27488);assertEquals(4, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27489);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27490);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27491);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27492);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27493);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27494);assertEquals(4, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27495);assertEquals(1, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27496);assertEquals(2, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25u70orl7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25u70orl7t(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27497);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27498);final double[] array = new double[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27499);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27500);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27501);assertEquals(3, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27502);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27503);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27504);assertEquals(5, array[4], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27505);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27506);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27507);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27508);assertEquals(4, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27509);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27510);assertEquals(5, array[4], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wnysrl87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wnysrl87(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27511);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27512);final double[] array = new double[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27513);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27514);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27515);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27516);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27517);assertEquals(4, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwjkmsl8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwjkmsl8e(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27518);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27519);final double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27520);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27521);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26365kfl8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26365kfl8i(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27522);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27523);final double[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27524);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27525);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yqvgpjl8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yqvgpjl8m(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27526);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27527);final double[] array = new double[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27528);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27529);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27530);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27531);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27532);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27533);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27534);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27535);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27536);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27537);assertEquals(4, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bh6oell8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bh6oell8y(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27538);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27539);final float[] array = new float[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27540);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27541);assertEquals(4, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27542);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27543);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27544);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27545);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27546);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27547);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27548);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27549);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27550);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27551);assertEquals(4, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27552);assertEquals(1, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27553);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27554);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27555);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27556);assertEquals(3, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27557);assertEquals(4, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27558);assertEquals(1, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27559);assertEquals(2, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m6oal9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m6oal9k(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27560);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27561);final float[] array = new float[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27562);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27563);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27564);assertEquals(3, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27565);assertEquals(2, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27566);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27567);assertEquals(5, array[4], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27568);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27569);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27570);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27571);assertEquals(4, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27572);assertEquals(3, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27573);assertEquals(5, array[4], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26rabmul9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26rabmul9y(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27574);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27575);final float[] array = new float[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27576);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27577);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27578);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27579);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27580);assertEquals(4, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25zf3ynla5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27581,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25zf3ynla5(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27581);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27582);final float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27583);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27584);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qcprola9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qcprola9(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27585);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27586);final float[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27587);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27588);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h5l6qalad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h5l6qalad(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27589);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27590);final float[] array = new float[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27591);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27592);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27593);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27594);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27595);assertEquals(4, array[3], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27596);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27597);assertEquals(1, array[0], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27598);assertEquals(2, array[1], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27599);assertEquals(3, array[2], 0);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27600);assertEquals(4, array[3], 0);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2erq237lap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2erq237lap(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27601);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27602);short[] array = new short[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27603);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27604);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27605);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27606);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27607);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27608);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27609);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27610);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27611);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27612);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27613);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27614);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27615);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27616);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27617);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27618);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27619);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27620);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27621);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27622);assertEquals(2, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27623);array = new short[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27624);ArrayUtils.shift(array, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27625);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27626);assertEquals(5, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27627);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27628);assertEquals(2, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27629);assertEquals(3, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jik0q4lbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jik0q4lbi(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27630);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27631);final short[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27632);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27633);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_233ajtilbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_233ajtilbm(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27634);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27635);final short[] array = new short[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27636);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27637);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27638);assertEquals(3, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27639);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27640);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27641);assertEquals(5, array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27642);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27643);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27644);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27645);assertEquals(4, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27646);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27647);assertEquals(5, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0724mlc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0724mlc0(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27648);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27649);final short[] array = new short[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27650);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27651);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27652);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27653);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27654);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w8bugflc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w8bugflc7(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27655);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27656);final short[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27657);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27658);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmm4r2lcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmm4r2lcb(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27659);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27660);final short[] array = new short[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27661);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27662);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27663);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27664);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27665);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27666);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27667);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27668);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27669);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27670);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28t0txdlcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27671,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28t0txdlcn(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27671);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27672);final byte[] array = new byte[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27673);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27674);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27675);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27676);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27677);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27678);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27679);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27680);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27681);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27682);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27683);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27684);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27685);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27686);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27687);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27688);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27689);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27690);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27691);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27692);assertEquals(2, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_296l2n8ld9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_296l2n8ld9(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27693);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27694);final byte[] array = new byte[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27695);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27696);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27697);assertEquals(3, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27698);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27699);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27700);assertEquals(5, array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27701);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27702);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27703);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27704);assertEquals(4, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27705);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27706);assertEquals(5, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_287uh5gldn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_287uh5gldn(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27707);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27708);final byte[] array = new byte[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27709);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27710);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27711);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27712);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27713);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oa5ot9ldu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oa5ot9ldu(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27714);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27715);final byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27716);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27717);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jc7jy8ldy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jc7jy8ldy(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27718);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27719);final byte[] array = new byte[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27720);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27721);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27722);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27723);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27724);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27725);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27726);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27727);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27728);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27729);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_275mbrhlea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_275mbrhlea(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27730);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27731);final char[] array = new char[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27732);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27733);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27734);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27735);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27736);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27737);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27738);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27739);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27740);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27741);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27742);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27743);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27744);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27745);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27746);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27747);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27748);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27749);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27750);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27751);assertEquals(2, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s231mlew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s231mlew(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27752);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27753);final char[] array = new char[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27754);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27755);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27756);assertEquals(3, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27757);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27758);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27759);assertEquals(5, array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27760);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27761);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27762);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27763);assertEquals(4, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27764);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27765);assertEquals(5, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27qsojelfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27qsojelfa(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27766);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27767);final char[] array = new char[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27768);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27769);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27770);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27771);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27772);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28bij4flfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27773,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28bij4flfh(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27773);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27774);final char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27775);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27776);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23dke9elfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23dke9elfl(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27777);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27778);final char[] array = new char[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27779);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27780);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27781);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27782);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27783);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27784);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27785);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27786);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27787);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27788);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbf52rlfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27789,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbf52rlfx(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27789);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27790);final long[] array = new long[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27791);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27792);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27793);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27794);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27795);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27796);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27797);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27798);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27799);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27800);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27801);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27802);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27803);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27804);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27805);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27806);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27807);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27808);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27809);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27810);assertEquals(2, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uxuwcwlgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uxuwcwlgj(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27811);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27812);final long[] array = new long[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27813);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27814);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27815);assertEquals(3, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27816);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27817);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27818);assertEquals(5, array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27819);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27820);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27821);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27822);assertEquals(4, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27823);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27824);assertEquals(5, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vwlhuolgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vwlhuolgx(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27825);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27826);final long[] array = new long[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27827);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27828);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27829);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27830);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27831);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fuaa6vlh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fuaa6vlh4(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27832);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27833);final long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27834);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27835);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olgvjulh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olgvjulh8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27836);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27837);final long[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27838);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27839);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ks8f1wlhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ks8f1wlhc(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27840);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27841);final long[] array = new long[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27842);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27843);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27844);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27845);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27846);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27847);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27848);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27849);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27850);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27851);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2409ijqlho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2409ijqlho(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27852);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27853);final int[] array = new int[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27854);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27855);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27856);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27857);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27858);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27859);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27860);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27861);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27862);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27863);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27864);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27865);assertEquals(4, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27866);assertEquals(1, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27867);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27868);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27869);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27870);assertEquals(3, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27871);assertEquals(4, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27872);assertEquals(1, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27873);assertEquals(2, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sad5vllia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sad5vllia(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27874);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27875);final int[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27876);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27877);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29r3j9zlie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29r3j9zlie(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27878);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27879);final int[] array = new int[] {1, 2, 3, 4, 5};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27880);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27881);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27882);assertEquals(3, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27883);assertEquals(2, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27884);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27885);assertEquals(5, array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27886);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27887);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27888);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27889);assertEquals(4, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27890);assertEquals(3, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27891);assertEquals(5, array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pre1lzlis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pre1lzlis(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27892);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27893);final int[] array = new int[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27894);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27895);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27896);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27897);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27898);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skj6keliz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skj6keliz(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27899);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27900);final int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27901);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27902);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qkwo5hlj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qkwo5hlj3(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27903);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27904);final int[] array = new int[] {1, 2, 3, 4};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27905);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27906);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27907);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27908);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27909);assertEquals(4, array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27910);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27911);assertEquals(1, array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27912);assertEquals(2, array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27913);assertEquals(3, array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27914);assertEquals(4, array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l4azvuljf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l4azvuljf(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27915);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27916);final String[] array = new String[] {"1", "2", "3", "4"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27917);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27918);assertEquals("4", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27919);assertEquals("1", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27920);assertEquals("2", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27921);assertEquals("3", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27922);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27923);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27924);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27925);assertEquals("3", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27926);assertEquals("4", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27927);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27928);assertEquals("4", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27929);assertEquals("1", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27930);assertEquals("2", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27931);assertEquals("3", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27932);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27933);assertEquals("3", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27934);assertEquals("4", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27935);assertEquals("1", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27936);assertEquals("2", array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g2qa3nlk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g2qa3nlk1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27937);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27938);final String[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27939);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27940);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s03gctlk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s03gctlk5(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27941);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27942);final String[] array = new String[] {"1", "2", "3", "4", "5"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27943);ArrayUtils.shift(array, 1, 3, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27944);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27945);assertEquals("3", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27946);assertEquals("2", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27947);assertEquals("4", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27948);assertEquals("5", array[4]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27949);ArrayUtils.shift(array, 1, 4, 2);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27950);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27951);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27952);assertEquals("4", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27953);assertEquals("3", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27954);assertEquals("5", array[4]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftRangeNoElemObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2kegtlkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNoElemObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2kegtlkj(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27955);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27956);final String[] array = new String[] {"1", "2", "3", "4"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27957);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27958);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27959);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27960);assertEquals("3", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27961);assertEquals("4", array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftRangeNullObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2myo1oalkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftRangeNullObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2myo1oalkq(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27962);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27963);final String[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27964);ArrayUtils.shift(array, 1, 1, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27965);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShiftAllObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4c5ljlku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftAllObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4c5ljlku(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27966);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27967);final String[] array = new String[] {"1", "2", "3", "4"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27968);ArrayUtils.shift(array, 4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27969);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27970);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27971);assertEquals("3", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27972);assertEquals("4", array[3]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27973);ArrayUtils.shift(array, -4);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27974);assertEquals("1", array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27975);assertEquals("2", array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27976);assertEquals("3", array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27977);assertEquals("4", array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),27978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25n42tbll6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),27978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25n42tbll6(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(27978);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27979);final boolean[] array = new boolean[] {true, true, false, false};
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27980);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27981);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27982);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27983);assertTrue(array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27984);assertFalse(array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27985);ArrayUtils.shift(array, -1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27986);assertTrue(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27987);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27988);assertFalse(array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27989);assertFalse(array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27990);ArrayUtils.shift(array, 5);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27991);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27992);assertTrue(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27993);assertTrue(array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27994);assertFalse(array[3]);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27995);ArrayUtils.shift(array, -3);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27996);assertFalse(array[0]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27997);assertFalse(array[1]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27998);assertTrue(array[2]);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(27999);assertTrue(array[3]);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test
    public void testShiftNullBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jxq654lls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShiftNullBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jxq654lls(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28000);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28001);final boolean[] array = null;
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28002);ArrayUtils.shift(array, 1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28003);assertNull(array);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2656tvillw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2656tvillw(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28004);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28005);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28006);assertEquals(-1, ArrayUtils.indexOf(null, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28007);assertEquals(-1, ArrayUtils.indexOf(null, "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28008);assertEquals(-1, ArrayUtils.indexOf(new Object[0], "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28009);assertEquals(0, ArrayUtils.indexOf(array, "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28010);assertEquals(1, ArrayUtils.indexOf(array, "1"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28011);assertEquals(2, ArrayUtils.indexOf(array, "2"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28012);assertEquals(3, ArrayUtils.indexOf(array, "3"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28013);assertEquals(4, ArrayUtils.indexOf(array, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28014);assertEquals(-1, ArrayUtils.indexOf(array, "notInArray"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nmwdv0lm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nmwdv0lm7(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28015);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28016);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28017);assertEquals(-1, ArrayUtils.indexOf(null, null, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28018);assertEquals(-1, ArrayUtils.indexOf(new Object[0], "0", 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28019);assertEquals(-1, ArrayUtils.indexOf(null, "0", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28020);assertEquals(5, ArrayUtils.indexOf(array, "0", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28021);assertEquals(-1, ArrayUtils.indexOf(array, "1", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28022);assertEquals(2, ArrayUtils.indexOf(array, "2", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28023);assertEquals(3, ArrayUtils.indexOf(array, "3", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28024);assertEquals(4, ArrayUtils.indexOf(array, null, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28025);assertEquals(-1, ArrayUtils.indexOf(array, "notInArray", 2));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28026);assertEquals(4, ArrayUtils.indexOf(array, null, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28027);assertEquals(-1, ArrayUtils.indexOf(array, null, 8));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28028);assertEquals(-1, ArrayUtils.indexOf(array, "0", 8));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOf() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nbvnclml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nbvnclml(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28029);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28030);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28031);assertEquals(-1, ArrayUtils.lastIndexOf(null, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28032);assertEquals(-1, ArrayUtils.lastIndexOf(null, "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28033);assertEquals(5, ArrayUtils.lastIndexOf(array, "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28034);assertEquals(1, ArrayUtils.lastIndexOf(array, "1"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28035);assertEquals(2, ArrayUtils.lastIndexOf(array, "2"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28036);assertEquals(3, ArrayUtils.lastIndexOf(array, "3"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28037);assertEquals(4, ArrayUtils.lastIndexOf(array, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28038);assertEquals(-1, ArrayUtils.lastIndexOf(array, "notInArray"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzp3z6lmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzp3z6lmv(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28039);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28040);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28041);assertEquals(-1, ArrayUtils.lastIndexOf(null, null, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28042);assertEquals(-1, ArrayUtils.lastIndexOf(null, "0", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28043);assertEquals(0, ArrayUtils.lastIndexOf(array, "0", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28044);assertEquals(1, ArrayUtils.lastIndexOf(array, "1", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28045);assertEquals(2, ArrayUtils.lastIndexOf(array, "2", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28046);assertEquals(-1, ArrayUtils.lastIndexOf(array, "3", 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28047);assertEquals(-1, ArrayUtils.lastIndexOf(array, "3", -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28048);assertEquals(4, ArrayUtils.lastIndexOf(array, null, 5));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28049);assertEquals(-1, ArrayUtils.lastIndexOf(array, null, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28050);assertEquals(-1, ArrayUtils.lastIndexOf(array, "notInArray", 5));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28051);assertEquals(-1, ArrayUtils.lastIndexOf(array, null, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28052);assertEquals(5, ArrayUtils.lastIndexOf(array, "0", 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContains() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y9zhfsln9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y9zhfsln9(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28053);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28054);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28055);assertFalse(ArrayUtils.contains(null, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28056);assertFalse(ArrayUtils.contains(null, "1"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28057);assertTrue(ArrayUtils.contains(array, "0"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28058);assertTrue(ArrayUtils.contains(array, "1"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28059);assertTrue(ArrayUtils.contains(array, "2"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28060);assertTrue(ArrayUtils.contains(array, "3"));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28061);assertTrue(ArrayUtils.contains(array, null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28062);assertFalse(ArrayUtils.contains(array, "notInArray"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContains_LANG_1261() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jp31zalnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContains_LANG_1261",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jp31zalnj(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28063);
        class LANG1261ParentObject {
            @Override
            public boolean equals(final Object o) {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28064);
                __CLR4_5_2k0dk0dlvha7f8c.R.inc(28065);return true;
            }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
        }
        class LANG1261ChildObject extends LANG1261ParentObject {
        }

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28066);final Object[] array = new LANG1261ChildObject[] { new LANG1261ChildObject() };

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28067);assertTrue(ArrayUtils.contains(array, new LANG1261ParentObject()));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m44bdylno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m44bdylno(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28068);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28069);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28070);assertEquals(-1, ArrayUtils.indexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28071);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28072);assertEquals(0, ArrayUtils.indexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28073);assertEquals(1, ArrayUtils.indexOf(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28074);assertEquals(2, ArrayUtils.indexOf(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28075);assertEquals(3, ArrayUtils.indexOf(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28076);assertEquals(-1, ArrayUtils.indexOf(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfLongWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv0hw0lnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfLongWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv0hw0lnx(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28077);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28078);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28079);assertEquals(-1, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28080);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28081);assertEquals(4, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28082);assertEquals(-1, ArrayUtils.indexOf(array, 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28083);assertEquals(2, ArrayUtils.indexOf(array, 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28084);assertEquals(3, ArrayUtils.indexOf(array, 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28085);assertEquals(3, ArrayUtils.indexOf(array, 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28086);assertEquals(-1, ArrayUtils.indexOf(array, 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28087);assertEquals(-1, ArrayUtils.indexOf(array, 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gw9ie4lo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gw9ie4lo8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28088);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28089);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28090);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28091);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28092);assertEquals(4, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28093);assertEquals(1, ArrayUtils.lastIndexOf(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28094);assertEquals(2, ArrayUtils.lastIndexOf(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28095);assertEquals(3, ArrayUtils.lastIndexOf(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28096);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfLongWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbjzneloh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfLongWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbjzneloh(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28097);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28098);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28099);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28100);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28101);assertEquals(0, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28102);assertEquals(1, ArrayUtils.lastIndexOf(array, 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28103);assertEquals(2, ArrayUtils.lastIndexOf(array, 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28104);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28105);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28106);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99, 4));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28107);assertEquals(4, ArrayUtils.lastIndexOf(array, 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b5t3sclos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b5t3sclos(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28108);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28109);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28110);assertFalse(ArrayUtils.contains(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28111);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28112);assertTrue(ArrayUtils.contains(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28113);assertTrue(ArrayUtils.contains(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28114);assertTrue(ArrayUtils.contains(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28115);assertTrue(ArrayUtils.contains(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28116);assertFalse(ArrayUtils.contains(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w33ixtlp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w33ixtlp1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28117);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28118);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28119);assertEquals(-1, ArrayUtils.indexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28120);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28121);assertEquals(0, ArrayUtils.indexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28122);assertEquals(1, ArrayUtils.indexOf(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28123);assertEquals(2, ArrayUtils.indexOf(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28124);assertEquals(3, ArrayUtils.indexOf(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28125);assertEquals(-1, ArrayUtils.indexOf(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfIntWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2co5aoblpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfIntWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2co5aoblpa(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28126);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28127);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28128);assertEquals(-1, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28129);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28130);assertEquals(4, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28131);assertEquals(-1, ArrayUtils.indexOf(array, 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28132);assertEquals(2, ArrayUtils.indexOf(array, 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28133);assertEquals(3, ArrayUtils.indexOf(array, 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28134);assertEquals(3, ArrayUtils.indexOf(array, 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28135);assertEquals(-1, ArrayUtils.indexOf(array, 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28136);assertEquals(-1, ArrayUtils.indexOf(array, 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224p7vvlpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224p7vvlpl(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28137);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28138);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28139);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28140);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28141);assertEquals(4, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28142);assertEquals(1, ArrayUtils.lastIndexOf(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28143);assertEquals(2, ArrayUtils.lastIndexOf(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28144);assertEquals(3, ArrayUtils.lastIndexOf(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28145);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIntWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fw8jorlpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfIntWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fw8jorlpu(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28146);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28147);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28148);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28149);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28150);assertEquals(0, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28151);assertEquals(1, ArrayUtils.lastIndexOf(array, 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28152);assertEquals(2, ArrayUtils.lastIndexOf(array, 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28153);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28154);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28155);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28156);assertEquals(4, ArrayUtils.lastIndexOf(array, 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ruaorplq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ruaorplq5(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28157);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28158);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28159);assertFalse(ArrayUtils.contains(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28160);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28161);assertTrue(ArrayUtils.contains(array, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28162);assertTrue(ArrayUtils.contains(array, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28163);assertTrue(ArrayUtils.contains(array, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28164);assertTrue(ArrayUtils.contains(array, 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28165);assertFalse(ArrayUtils.contains(array, 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wfuuslqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wfuuslqe(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28166);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28167);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28168);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28169);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28170);assertEquals(0, ArrayUtils.indexOf(array, (short) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28171);assertEquals(1, ArrayUtils.indexOf(array, (short) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28172);assertEquals(2, ArrayUtils.indexOf(array, (short) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28173);assertEquals(3, ArrayUtils.indexOf(array, (short) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28174);assertEquals(-1, ArrayUtils.indexOf(array, (short) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfShortWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exzi5elqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfShortWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exzi5elqn(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28175);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28176);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28177);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28178);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28179);assertEquals(4, ArrayUtils.indexOf(array, (short) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28180);assertEquals(-1, ArrayUtils.indexOf(array, (short) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28181);assertEquals(2, ArrayUtils.indexOf(array, (short) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28182);assertEquals(3, ArrayUtils.indexOf(array, (short) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28183);assertEquals(3, ArrayUtils.indexOf(array, (short) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28184);assertEquals(-1, ArrayUtils.indexOf(array, (short) 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28185);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bsv01ulqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28186,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bsv01ulqy(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28186);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28187);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28188);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28189);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28190);assertEquals(4, ArrayUtils.lastIndexOf(array, (short) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28191);assertEquals(1, ArrayUtils.lastIndexOf(array, (short) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28192);assertEquals(2, ArrayUtils.lastIndexOf(array, (short) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28193);assertEquals(3, ArrayUtils.lastIndexOf(array, (short) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28194);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfShortWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lv27s8lr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfShortWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28195,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lv27s8lr7(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28195);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28196);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28197);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28198);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28199);assertEquals(0, ArrayUtils.lastIndexOf(array, (short) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28200);assertEquals(1, ArrayUtils.lastIndexOf(array, (short) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28201);assertEquals(2, ArrayUtils.lastIndexOf(array, (short) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28202);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28203);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28204);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 99));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28205);assertEquals(4, ArrayUtils.lastIndexOf(array, (short) 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nicl4elri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nicl4elri(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28206);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28207);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28208);assertFalse(ArrayUtils.contains(array, (short) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28209);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28210);assertTrue(ArrayUtils.contains(array, (short) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28211);assertTrue(ArrayUtils.contains(array, (short) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28212);assertTrue(ArrayUtils.contains(array, (short) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28213);assertTrue(ArrayUtils.contains(array, (short) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28214);assertFalse(ArrayUtils.contains(array, (short) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2or6x9wlrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2or6x9wlrr(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28215);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28216);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28217);assertEquals(-1, ArrayUtils.indexOf(array, 'a'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28218);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28219);assertEquals(0, ArrayUtils.indexOf(array, 'a'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28220);assertEquals(1, ArrayUtils.indexOf(array, 'b'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28221);assertEquals(2, ArrayUtils.indexOf(array, 'c'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28222);assertEquals(3, ArrayUtils.indexOf(array, 'd'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28223);assertEquals(-1, ArrayUtils.indexOf(array, 'e'));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfCharWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2of34aels0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfCharWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2of34aels0(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28224);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28225);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28226);assertEquals(-1, ArrayUtils.indexOf(array, 'a', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28227);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28228);assertEquals(4, ArrayUtils.indexOf(array, 'a', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28229);assertEquals(-1, ArrayUtils.indexOf(array, 'b', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28230);assertEquals(2, ArrayUtils.indexOf(array, 'c', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28231);assertEquals(3, ArrayUtils.indexOf(array, 'd', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28232);assertEquals(3, ArrayUtils.indexOf(array, 'd', -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28233);assertEquals(-1, ArrayUtils.indexOf(array, 'e', 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28234);assertEquals(-1, ArrayUtils.indexOf(array, 'a', 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tz1q9qlsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tz1q9qlsb(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28235);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28236);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28237);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'a'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28238);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28239);assertEquals(4, ArrayUtils.lastIndexOf(array, 'a'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28240);assertEquals(1, ArrayUtils.lastIndexOf(array, 'b'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28241);assertEquals(2, ArrayUtils.lastIndexOf(array, 'c'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28242);assertEquals(3, ArrayUtils.lastIndexOf(array, 'd'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28243);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'e'));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfCharWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28rhd90lsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfCharWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28rhd90lsk(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28244);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28245);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28246);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'a', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28247);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28248);assertEquals(0, ArrayUtils.lastIndexOf(array, 'a', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28249);assertEquals(1, ArrayUtils.lastIndexOf(array, 'b', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28250);assertEquals(2, ArrayUtils.lastIndexOf(array, 'c', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28251);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'd', 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28252);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'd', -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28253);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'e'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28254);assertEquals(4, ArrayUtils.lastIndexOf(array, 'a', 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zblx3mlsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zblx3mlsv(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28255);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28256);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28257);assertFalse(ArrayUtils.contains(array, 'b'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28258);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28259);assertTrue(ArrayUtils.contains(array, 'a'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28260);assertTrue(ArrayUtils.contains(array, 'b'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28261);assertTrue(ArrayUtils.contains(array, 'c'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28262);assertTrue(ArrayUtils.contains(array, 'd'));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28263);assertFalse(ArrayUtils.contains(array, 'e'));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28sjrl2lt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28sjrl2lt4(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28264);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28265);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28266);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28267);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28268);assertEquals(0, ArrayUtils.indexOf(array, (byte) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28269);assertEquals(1, ArrayUtils.indexOf(array, (byte) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28270);assertEquals(2, ArrayUtils.indexOf(array, (byte) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28271);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28272);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfByteWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i7jog4ltd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfByteWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i7jog4ltd(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28273);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28274);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28275);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28276);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28277);assertEquals(4, ArrayUtils.indexOf(array, (byte) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28278);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28279);assertEquals(2, ArrayUtils.indexOf(array, (byte) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28280);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28281);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28282);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28283);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e0ekkwlto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e0ekkwlto(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28284);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28285);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28286);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28287);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28288);assertEquals(4, ArrayUtils.lastIndexOf(array, (byte) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28289);assertEquals(1, ArrayUtils.lastIndexOf(array, (byte) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28290);assertEquals(2, ArrayUtils.lastIndexOf(array, (byte) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28291);assertEquals(3, ArrayUtils.lastIndexOf(array, (byte) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28292);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfByteWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ez0t3altx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfByteWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ez0t3altx(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28293);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28294);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28295);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28296);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28297);assertEquals(0, ArrayUtils.lastIndexOf(array, (byte) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28298);assertEquals(1, ArrayUtils.lastIndexOf(array, (byte) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28299);assertEquals(2, ArrayUtils.lastIndexOf(array, (byte) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28300);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28301);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28302);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 99));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28303);assertEquals(4, ArrayUtils.lastIndexOf(array, (byte) 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jquz6olu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jquz6olu8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28304);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28305);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28306);assertFalse(ArrayUtils.contains(array, (byte) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28307);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28308);assertTrue(ArrayUtils.contains(array, (byte) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28309);assertTrue(ArrayUtils.contains(array, (byte) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28310);assertTrue(ArrayUtils.contains(array, (byte) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28311);assertTrue(ArrayUtils.contains(array, (byte) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28312);assertFalse(ArrayUtils.contains(array, (byte) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28jmma7luh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28jmma7luh(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28313);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28314);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28315);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28316);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28317);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28318);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28319);assertEquals(0, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28320);assertEquals(1, ArrayUtils.indexOf(array, (double) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28321);assertEquals(2, ArrayUtils.indexOf(array, (double) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28322);assertEquals(3, ArrayUtils.indexOf(array, (double) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28323);assertEquals(3, ArrayUtils.indexOf(array, (double) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28324);assertEquals(-1, ArrayUtils.indexOf(array, (double) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleTolerance() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a56geklut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleTolerance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a56geklut(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28325);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28326);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28327);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28328);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28329);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28330);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28331);assertEquals(0, ArrayUtils.indexOf(array, (double) 0, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28332);assertEquals(2, ArrayUtils.indexOf(array, 2.2, 0.35));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28333);assertEquals(3, ArrayUtils.indexOf(array, 4.15, 2.0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28334);assertEquals(1, ArrayUtils.indexOf(array, 1.00001324, 0.0001));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23bay05lv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23bay05lv3(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28335);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28336);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28337);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28338);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28339);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28340);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28341);assertEquals(4, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28342);assertEquals(-1, ArrayUtils.indexOf(array, (double) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28343);assertEquals(2, ArrayUtils.indexOf(array, (double) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28344);assertEquals(3, ArrayUtils.indexOf(array, (double) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28345);assertEquals(-1, ArrayUtils.indexOf(array, (double) 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28346);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleWithStartIndexTolerance() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0yn7ulvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleWithStartIndexTolerance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28347,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0yn7ulvf(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28347);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28348);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28349);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28350);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28351);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28352);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28353);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 99, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28354);assertEquals(0, ArrayUtils.indexOf(array, (double) 0, 0, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28355);assertEquals(4, ArrayUtils.indexOf(array, (double) 0, 3, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28356);assertEquals(2, ArrayUtils.indexOf(array, 2.2, 0, 0.35));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28357);assertEquals(3, ArrayUtils.indexOf(array, 4.15, 0, 2.0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28358);assertEquals(1, ArrayUtils.indexOf(array, 1.00001324, 0, 0.0001));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28359);assertEquals(3, ArrayUtils.indexOf(array, 4.15, -1, 2.0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28360);assertEquals(1, ArrayUtils.indexOf(array, 1.00001324, -300, 0.0001));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jy19evlvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jy19evlvt(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28361);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28362);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28363);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28364);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28365);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28366);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28367);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28368);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28369);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28370);assertEquals(3, ArrayUtils.lastIndexOf(array, (double) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28371);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleTolerance() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2da08oylw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleTolerance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28372,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2da08oylw4(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28372);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28373);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28374);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28375);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28376);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28377);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28378);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28379);assertEquals(2, ArrayUtils.lastIndexOf(array, 2.2, 0.35));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28380);assertEquals(3, ArrayUtils.lastIndexOf(array, 4.15, 2.0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28381);assertEquals(1, ArrayUtils.lastIndexOf(array, 1.00001324, 0.0001));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_217dic1lwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28382,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_217dic1lwe(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28382);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28383);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28384);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28385);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28386);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28387);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28388);assertEquals(0, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28389);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28390);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28391);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28392);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28393);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 99));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28394);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleWithStartIndexTolerance() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v4wx64lwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleWithStartIndexTolerance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v4wx64lwr(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28395);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28396);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28397);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28398);array = new double[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28399);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28400);array = new double[] { (double) 3 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28401);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 1, 0, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28402);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28403);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, 99, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28404);assertEquals(0, ArrayUtils.lastIndexOf(array, (double) 0, 3, 0.3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28405);assertEquals(2, ArrayUtils.lastIndexOf(array, 2.2, 3, 0.35));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28406);assertEquals(3, ArrayUtils.lastIndexOf(array, 4.15, array.length, 2.0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28407);assertEquals(1, ArrayUtils.lastIndexOf(array, 1.00001324, array.length, 0.0001));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28408);assertEquals(-1, ArrayUtils.lastIndexOf(array, 4.15, -200, 2.0));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lw8du1lx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lw8du1lx5(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28409);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28410);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28411);assertFalse(ArrayUtils.contains(array, (double) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28412);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28413);assertTrue(ArrayUtils.contains(array, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28414);assertTrue(ArrayUtils.contains(array, (double) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28415);assertTrue(ArrayUtils.contains(array, (double) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28416);assertTrue(ArrayUtils.contains(array, (double) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28417);assertFalse(ArrayUtils.contains(array, (double) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsDoubleTolerance() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g30tg2lxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsDoubleTolerance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g30tg2lxe(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28418);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28419);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28420);assertFalse(ArrayUtils.contains(array, (double) 1, (double) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28421);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28422);assertFalse(ArrayUtils.contains(array, 4.0, 0.33));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28423);assertFalse(ArrayUtils.contains(array, 2.5, 0.49));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28424);assertTrue(ArrayUtils.contains(array, 2.5, 0.50));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28425);assertTrue(ArrayUtils.contains(array, 2.5, 0.51));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y5clcklxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y5clcklxm(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28426);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28427);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28428);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28429);array = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28430);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28431);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28432);assertEquals(0, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28433);assertEquals(1, ArrayUtils.indexOf(array, (float) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28434);assertEquals(2, ArrayUtils.indexOf(array, (float) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28435);assertEquals(3, ArrayUtils.indexOf(array, (float) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28436);assertEquals(-1, ArrayUtils.indexOf(array, (float) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfFloatWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mv7wxulxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfFloatWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28437,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mv7wxulxx(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28437);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28438);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28439);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28440);array = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28441);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28442);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28443);assertEquals(4, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28444);assertEquals(-1, ArrayUtils.indexOf(array, (float) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28445);assertEquals(2, ArrayUtils.indexOf(array, (float) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28446);assertEquals(3, ArrayUtils.indexOf(array, (float) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28447);assertEquals(3, ArrayUtils.indexOf(array, (float) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28448);assertEquals(-1, ArrayUtils.indexOf(array, (float) 99, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28449);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 6));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eg1qfylya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eg1qfylya(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28450);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28451);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28452);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28453);array = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28454);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28455);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28456);assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28457);assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28458);assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28459);assertEquals(3, ArrayUtils.lastIndexOf(array, (float) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28460);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfFloatWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dxtszslyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfFloatWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28461,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dxtszslyl(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28461);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28462);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28463);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28464);array = new float[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28465);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28466);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28467);assertEquals(0, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28468);assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28469);assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28470);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28471);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28472);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28473);assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0, 88));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l9uqcylyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l9uqcylyy(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28474);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28475);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28476);assertFalse(ArrayUtils.contains(array, (float) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28477);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28478);assertTrue(ArrayUtils.contains(array, (float) 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28479);assertTrue(ArrayUtils.contains(array, (float) 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28480);assertTrue(ArrayUtils.contains(array, (float) 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28481);assertTrue(ArrayUtils.contains(array, (float) 3));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28482);assertFalse(ArrayUtils.contains(array, (float) 99));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2sid4lz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2sid4lz7(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28483);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28484);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28485);assertEquals(-1, ArrayUtils.indexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28486);array = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28487);assertEquals(-1, ArrayUtils.indexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28488);array = new boolean[] { true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28489);assertEquals(0, ArrayUtils.indexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28490);assertEquals(1, ArrayUtils.indexOf(array, false));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28491);array = new boolean[] { true, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28492);assertEquals(-1, ArrayUtils.indexOf(array, false));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIndexOfBooleanWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_276eusylzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfBooleanWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_276eusylzh(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28493);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28494);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28495);assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28496);array = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28497);assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28498);array = new boolean[] { true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28499);assertEquals(2, ArrayUtils.indexOf(array, true, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28500);assertEquals(-1, ArrayUtils.indexOf(array, false, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28501);assertEquals(1, ArrayUtils.indexOf(array, false, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28502);assertEquals(1, ArrayUtils.indexOf(array, false, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28503);array = new boolean[] { true, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28504);assertEquals(-1, ArrayUtils.indexOf(array, false, 0));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28505);assertEquals(-1, ArrayUtils.indexOf(array, false, -1));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rf4ialzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rf4ialzu(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28506);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28507);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28508);assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28509);array = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28510);assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28511);array = new boolean[] { true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28512);assertEquals(2, ArrayUtils.lastIndexOf(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28513);assertEquals(1, ArrayUtils.lastIndexOf(array, false));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28514);array = new boolean[] { true, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28515);assertEquals(-1, ArrayUtils.lastIndexOf(array, false));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testLastIndexOfBooleanWithStartIndex() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2578tbwm04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfBooleanWithStartIndex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2578tbwm04(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28516);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28517);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28518);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28519);array = new boolean[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28520);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28521);array = new boolean[] { true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28522);assertEquals(2, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28523);assertEquals(0, ArrayUtils.lastIndexOf(array, true, 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28524);assertEquals(1, ArrayUtils.lastIndexOf(array, false, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28525);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28526);array = new boolean[] { true, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28527);assertEquals(-1, ArrayUtils.lastIndexOf(array, false, 2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28528);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testContainsBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cquwlam0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cquwlam0h(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28529);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28530);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28531);assertFalse(ArrayUtils.contains(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28532);array = new boolean[] { true, false, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28533);assertTrue(ArrayUtils.contains(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28534);assertTrue(ArrayUtils.contains(array, false));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28535);array = new boolean[] { true, true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28536);assertTrue(ArrayUtils.contains(array, true));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28537);assertFalse(ArrayUtils.contains(array, false));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    // testToPrimitive/Object for boolean
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_boolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y21nrem0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y21nrem0q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28538);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28539);final Boolean[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28540);assertEquals(null, ArrayUtils.toPrimitive(b));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28541);assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28542);assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28543);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28544);ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28545);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_boolean_boolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27mdep9m0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_boolean_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27mdep9m0y(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28546);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28547);assertEquals(null, ArrayUtils.toPrimitive(null, false));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28548);assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0], false));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28549);assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}, false))
        );
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28550);assertTrue(Arrays.equals(
            new boolean[] {true, false, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, false))
        );
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28551);assertTrue(Arrays.equals(
            new boolean[] {true, true, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, true))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToObject_boolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4so9om14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4so9om14(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28552);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28553);final boolean[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28554);assertArrayEquals(null, ArrayUtils.toObject(b));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28555);assertSame(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.toObject(new boolean[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28556);assertTrue(Arrays.equals(
            new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE},
            ArrayUtils.toObject(new boolean[] {true, false, true}))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_char() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22fm5cym19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22fm5cym19(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28557);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28558);final Character[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28559);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28560);assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28561);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28562);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28563);ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28564);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_char_char() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263y4dbm1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_char_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263y4dbm1h(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28565);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28566);final Character[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28567);assertEquals(null, ArrayUtils.toPrimitive(b, Character.MIN_VALUE));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28568);assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, 
            ArrayUtils.toPrimitive(new Character[0], (char)0));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28569);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}, 
                Character.MIN_VALUE))
        );
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28570);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null, 
                new Character('0')}, Character.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToObject_char() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_210sm8gm1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_210sm8gm1n(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28571);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28572);final char[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28573);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28574);assertSame(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, 
            ArrayUtils.toObject(new char[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28575);assertTrue(Arrays.equals(
            new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')},
                ArrayUtils.toObject(new char[] {Character.MIN_VALUE, Character.MAX_VALUE, 
                '0'} ))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_byte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dj10bwm1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dj10bwm1s(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28576);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28577);final Byte[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28578);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28579);assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.toPrimitive(new Byte[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28580);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28581);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28582);ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28583);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_byte_byte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25j7exrm20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_byte_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25j7exrm20(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28584);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28585);final Byte[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28586);assertEquals(null, ArrayUtils.toPrimitive(b, Byte.MIN_VALUE));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28587);assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, 
            ArrayUtils.toPrimitive(new Byte[0], (byte)1));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28588);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}, 
                Byte.MIN_VALUE))
        );
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28589);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null, 
                Byte.valueOf((byte)9999999)}, Byte.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToObject_byte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exujgem26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exujgem26(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28590);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28591);final byte[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28592);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28593);assertSame(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, 
            ArrayUtils.toObject(new byte[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28594);assertTrue(Arrays.equals(
            new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)},
                ArrayUtils.toObject(new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, 
                (byte)9999999}))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    // testToPrimitive/Object for short
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_short() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2afsnj2m2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2afsnj2m2b(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28595);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28596);final Short[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28597);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28598);assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28599);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28600);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28601);ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28602);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_short_short() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hz8zpm2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_short_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hz8zpm2j(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28603);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28604);final Short[] s = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28605);assertEquals(null, ArrayUtils.toPrimitive(s, Short.MIN_VALUE));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28606);assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0], 
        Short.MIN_VALUE));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28607);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}, Short.MIN_VALUE))
        );
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28608);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null, 
                Short.valueOf((short)9999999)}, Short.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToObject_short() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbmtcgm2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbmtcgm2p(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28609);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28610);final short[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28611);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28612);assertSame(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, 
        ArrayUtils.toObject(new short[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28613);assertTrue(Arrays.equals(
            new Short[] {Short.valueOf(Short.MIN_VALUE), Short.valueOf(Short.MAX_VALUE), 
                Short.valueOf((short)9999999)},
            ArrayUtils.toObject(new short[] {Short.MIN_VALUE, Short.MAX_VALUE, 
                (short)9999999}))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //  testToPrimitive/Object for int
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_int() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2659n1tm2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2659n1tm2u(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28614);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28615);final Integer[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28616);assertEquals(null, ArrayUtils.toPrimitive(b));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28617);assertSame(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.toPrimitive(new Integer[0]));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28618);assertTrue(Arrays.equals(
            new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28619);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28620);ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28621);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_int_int() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_233n8inm32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_int_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_233n8inm32(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28622);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28623);final Long[] l = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28624);assertEquals(null, ArrayUtils.toPrimitive(l, Integer.MIN_VALUE));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28625);assertSame(ArrayUtils.EMPTY_INT_ARRAY, 
        ArrayUtils.toPrimitive(new Integer[0], 1));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28626);assertTrue(Arrays.equals(
            new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)},1)));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28627);assertTrue(Arrays.equals(
            new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                null, Integer.valueOf(9999999)}, Integer.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
     
    @Test
    public void testToPrimitive_intNull() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gg452wm38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_intNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gg452wm38(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28628);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28629);final Integer[] iArray = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28630);assertEquals(null, ArrayUtils.toPrimitive(iArray, Integer.MIN_VALUE));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToObject_int() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xlh83nm3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xlh83nm3b(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28631);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28632);final int[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28633);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28634);assertSame(
            ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY,
            ArrayUtils.toObject(new int[0]));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28635);assertTrue(
            Arrays.equals(
                new Integer[] {
                    Integer.valueOf(Integer.MIN_VALUE),
                    Integer.valueOf(Integer.MAX_VALUE),
                    Integer.valueOf(9999999)},
            ArrayUtils.toObject(
                new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999 })));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //  testToPrimitive/Object for long
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_long() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qleyo8m3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qleyo8m3g(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28636);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28637);final Long[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28638);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28639);assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
           ArrayUtils.toPrimitive(new Long[0]));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28640);assertTrue(Arrays.equals(
            new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28641);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28642);ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28643);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_long_long() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wdmiu7m3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_long_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wdmiu7m3o(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28644);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28645);final Long[] l = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28646);assertEquals(null, ArrayUtils.toPrimitive(l, Long.MIN_VALUE));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28647);assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
        ArrayUtils.toPrimitive(new Long[0], 1));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28648);assertTrue(Arrays.equals(
            new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)},1)));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28649);assertTrue(Arrays.equals(
            new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                null, Long.valueOf(9999999)}, Long.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
     
    @Test
    public void testToObject_long() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p6lfjqm3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p6lfjqm3u(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28650);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28651);final long[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28652);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28653);assertSame(
            ArrayUtils.EMPTY_LONG_OBJECT_ARRAY,
            ArrayUtils.toObject(new long[0]));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28654);assertTrue(
            Arrays.equals(
                new Long[] {
                    Long.valueOf(Long.MIN_VALUE),
                    Long.valueOf(Long.MAX_VALUE),
                    Long.valueOf(9999999)},
            ArrayUtils.toObject(
                new long[] { Long.MIN_VALUE, Long.MAX_VALUE, 9999999 })));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //  testToPrimitive/Object for float
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_float() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ft42yqm3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ft42yqm3z(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28655);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28656);final Float[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28657);assertEquals(null, ArrayUtils.toPrimitive(b));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28658);assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
           ArrayUtils.toPrimitive(new Float[0]));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28659);assertTrue(Arrays.equals(
            new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28660);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28661);ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28662);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_float_float() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ykuykbm47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_float_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ykuykbm47(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28663);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28664);final Float[] l = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28665);assertEquals(null, ArrayUtils.toPrimitive(l, Float.MIN_VALUE));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28666);assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
        ArrayUtils.toPrimitive(new Float[0], 1));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28667);assertTrue(Arrays.equals(
            new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)},1)));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28668);assertTrue(Arrays.equals(
            new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                null, Float.valueOf(9999999)}, Float.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
     
    @Test
    public void testToObject_float() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgki4wm4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgki4wm4d(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28669);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28670);final float[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28671);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28672);assertSame(
            ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY,
            ArrayUtils.toObject(new float[0]));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28673);assertTrue(
            Arrays.equals(
                new Float[] {
                    Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE),
                    Float.valueOf(9999999)},
            ArrayUtils.toObject(
                new float[] { Float.MIN_VALUE, Float.MAX_VALUE, 9999999 })));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //  testToPrimitive/Object for double
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_double() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28u20e5m4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28u20e5m4i(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28674);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28675);final Double[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28676);assertEquals(null, ArrayUtils.toPrimitive(b));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28677);assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
           ArrayUtils.toPrimitive(new Double[0]));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28678);assertTrue(Arrays.equals(
            new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)}))
        );

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28679);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28680);ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28681);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToPrimitive_double_double() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2zj5rm4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_double_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2zj5rm4q(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28682);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28683);final Double[] l = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28684);assertEquals(null, ArrayUtils.toPrimitive(l, Double.MIN_VALUE));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28685);assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
        ArrayUtils.toPrimitive(new Double[0], 1));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28686);assertTrue(Arrays.equals(
            new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)},1)));
         
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28687);assertTrue(Arrays.equals(
            new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
            ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                null, Double.valueOf(9999999)}, Double.MAX_VALUE))
        );
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
     
    @Test
    public void testToObject_double() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21svisrm4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21svisrm4w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28688);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28689);final double[] b = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28690);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28691);assertSame(
            ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY,
            ArrayUtils.toObject(new double[0]));
    
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28692);assertTrue(
            Arrays.equals(
                new Double[] {
                    Double.valueOf(Double.MIN_VALUE),
                    Double.valueOf(Double.MAX_VALUE),
                    Double.valueOf(9999999)},
            ArrayUtils.toObject(
                new double[] { Double.MIN_VALUE, Double.MAX_VALUE, 9999999 })));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test for {@link ArrayUtils#isEmpty(java.lang.Object[])}.
     */
    @Test
    public void testIsEmptyObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255xyvdm51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEmptyObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255xyvdm51(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28693);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28694);final Object[] emptyArray = new Object[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28695);final Object[] notEmptyArray = new Object[] { new String("Value") };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28696);assertTrue(ArrayUtils.isEmpty((Object[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28697);assertTrue(ArrayUtils.isEmpty(emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28698);assertFalse(ArrayUtils.isEmpty(notEmptyArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests for {@link ArrayUtils#isEmpty(long[])},
     * {@link ArrayUtils#isEmpty(int[])},
     * {@link ArrayUtils#isEmpty(short[])},
     * {@link ArrayUtils#isEmpty(char[])},
     * {@link ArrayUtils#isEmpty(byte[])},
     * {@link ArrayUtils#isEmpty(double[])},
     * {@link ArrayUtils#isEmpty(float[])} and
     * {@link ArrayUtils#isEmpty(boolean[])}.
     */
    @Test
    public void testIsEmptyPrimitives() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21l4urgm57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEmptyPrimitives",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21l4urgm57(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28699);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28700);final long[] emptyLongArray = new long[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28701);final long[] notEmptyLongArray = new long[] { 1L };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28702);assertTrue(ArrayUtils.isEmpty((long[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28703);assertTrue(ArrayUtils.isEmpty(emptyLongArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28704);assertFalse(ArrayUtils.isEmpty(notEmptyLongArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28705);final int[] emptyIntArray = new int[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28706);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28707);assertTrue(ArrayUtils.isEmpty((int[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28708);assertTrue(ArrayUtils.isEmpty(emptyIntArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28709);assertFalse(ArrayUtils.isEmpty(notEmptyIntArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28710);final short[] emptyShortArray = new short[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28711);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28712);assertTrue(ArrayUtils.isEmpty((short[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28713);assertTrue(ArrayUtils.isEmpty(emptyShortArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28714);assertFalse(ArrayUtils.isEmpty(notEmptyShortArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28715);final char[] emptyCharArray = new char[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28716);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28717);assertTrue(ArrayUtils.isEmpty((char[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28718);assertTrue(ArrayUtils.isEmpty(emptyCharArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28719);assertFalse(ArrayUtils.isEmpty(notEmptyCharArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28720);final byte[] emptyByteArray = new byte[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28721);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28722);assertTrue(ArrayUtils.isEmpty((byte[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28723);assertTrue(ArrayUtils.isEmpty(emptyByteArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28724);assertFalse(ArrayUtils.isEmpty(notEmptyByteArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28725);final double[] emptyDoubleArray = new double[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28726);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28727);assertTrue(ArrayUtils.isEmpty((double[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28728);assertTrue(ArrayUtils.isEmpty(emptyDoubleArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28729);assertFalse(ArrayUtils.isEmpty(notEmptyDoubleArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28730);final float[] emptyFloatArray = new float[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28731);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28732);assertTrue(ArrayUtils.isEmpty((float[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28733);assertTrue(ArrayUtils.isEmpty(emptyFloatArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28734);assertFalse(ArrayUtils.isEmpty(notEmptyFloatArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28735);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28736);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28737);assertTrue(ArrayUtils.isEmpty((boolean[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28738);assertTrue(ArrayUtils.isEmpty(emptyBooleanArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28739);assertFalse(ArrayUtils.isEmpty(notEmptyBooleanArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    /**
     * Test for {@link ArrayUtils#isNotEmpty(java.lang.Object[])}.
     */
    @Test
    public void testIsNotEmptyObject() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26srg78m6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsNotEmptyObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26srg78m6c(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28740);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28741);final Object[] emptyArray = new Object[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28742);final Object[] notEmptyArray = new Object[] { new String("Value") };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28743);assertFalse(ArrayUtils.isNotEmpty((Object[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28744);assertFalse(ArrayUtils.isNotEmpty(emptyArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28745);assertTrue(ArrayUtils.isNotEmpty(notEmptyArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    /**
     * Tests for {@link ArrayUtils#isNotEmpty(long[])},
     * {@link ArrayUtils#isNotEmpty(int[])},
     * {@link ArrayUtils#isNotEmpty(short[])},
     * {@link ArrayUtils#isNotEmpty(char[])},
     * {@link ArrayUtils#isNotEmpty(byte[])},
     * {@link ArrayUtils#isNotEmpty(double[])},
     * {@link ArrayUtils#isNotEmpty(float[])} and
     * {@link ArrayUtils#isNotEmpty(boolean[])}.
     */
    @Test
    public void testIsNotEmptyPrimitives() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24s8gcpm6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsNotEmptyPrimitives",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24s8gcpm6i(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28746);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28747);final long[] emptyLongArray = new long[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28748);final long[] notEmptyLongArray = new long[] { 1L };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28749);assertFalse(ArrayUtils.isNotEmpty((long[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28750);assertFalse(ArrayUtils.isNotEmpty(emptyLongArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28751);assertTrue(ArrayUtils.isNotEmpty(notEmptyLongArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28752);final int[] emptyIntArray = new int[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28753);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28754);assertFalse(ArrayUtils.isNotEmpty((int[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28755);assertFalse(ArrayUtils.isNotEmpty(emptyIntArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28756);assertTrue(ArrayUtils.isNotEmpty(notEmptyIntArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28757);final short[] emptyShortArray = new short[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28758);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28759);assertFalse(ArrayUtils.isNotEmpty((short[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28760);assertFalse(ArrayUtils.isNotEmpty(emptyShortArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28761);assertTrue(ArrayUtils.isNotEmpty(notEmptyShortArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28762);final char[] emptyCharArray = new char[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28763);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28764);assertFalse(ArrayUtils.isNotEmpty((char[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28765);assertFalse(ArrayUtils.isNotEmpty(emptyCharArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28766);assertTrue(ArrayUtils.isNotEmpty(notEmptyCharArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28767);final byte[] emptyByteArray = new byte[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28768);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28769);assertFalse(ArrayUtils.isNotEmpty((byte[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28770);assertFalse(ArrayUtils.isNotEmpty(emptyByteArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28771);assertTrue(ArrayUtils.isNotEmpty(notEmptyByteArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28772);final double[] emptyDoubleArray = new double[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28773);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28774);assertFalse(ArrayUtils.isNotEmpty((double[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28775);assertFalse(ArrayUtils.isNotEmpty(emptyDoubleArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28776);assertTrue(ArrayUtils.isNotEmpty(notEmptyDoubleArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28777);final float[] emptyFloatArray = new float[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28778);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28779);assertFalse(ArrayUtils.isNotEmpty((float[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28780);assertFalse(ArrayUtils.isNotEmpty(emptyFloatArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28781);assertTrue(ArrayUtils.isNotEmpty(notEmptyFloatArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28782);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28783);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28784);assertFalse(ArrayUtils.isNotEmpty((boolean[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28785);assertFalse(ArrayUtils.isNotEmpty(emptyBooleanArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28786);assertTrue(ArrayUtils.isNotEmpty(notEmptyBooleanArray));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    // ------------------------------------------------------------------------
    @Test
    public void testGetLength() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rj0cxdm7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testGetLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rj0cxdm7n(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28787);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28788);assertEquals(0, ArrayUtils.getLength(null));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28789);final Object[] emptyObjectArray = new Object[0];
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28790);final Object[] notEmptyObjectArray = new Object[] {"aValue"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28791);assertEquals(0, ArrayUtils.getLength((Object[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28792);assertEquals(0, ArrayUtils.getLength(emptyObjectArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28793);assertEquals(1, ArrayUtils.getLength(notEmptyObjectArray));
 
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28794);final int[] emptyIntArray = new int[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28795);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28796);assertEquals(0, ArrayUtils.getLength((int[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28797);assertEquals(0, ArrayUtils.getLength(emptyIntArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28798);assertEquals(1, ArrayUtils.getLength(notEmptyIntArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28799);final short[] emptyShortArray = new short[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28800);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28801);assertEquals(0, ArrayUtils.getLength((short[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28802);assertEquals(0, ArrayUtils.getLength(emptyShortArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28803);assertEquals(1, ArrayUtils.getLength(notEmptyShortArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28804);final char[] emptyCharArray = new char[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28805);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28806);assertEquals(0, ArrayUtils.getLength((char[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28807);assertEquals(0, ArrayUtils.getLength(emptyCharArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28808);assertEquals(1, ArrayUtils.getLength(notEmptyCharArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28809);final byte[] emptyByteArray = new byte[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28810);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28811);assertEquals(0, ArrayUtils.getLength((byte[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28812);assertEquals(0, ArrayUtils.getLength(emptyByteArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28813);assertEquals(1, ArrayUtils.getLength(notEmptyByteArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28814);final double[] emptyDoubleArray = new double[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28815);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28816);assertEquals(0, ArrayUtils.getLength((double[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28817);assertEquals(0, ArrayUtils.getLength(emptyDoubleArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28818);assertEquals(1, ArrayUtils.getLength(notEmptyDoubleArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28819);final float[] emptyFloatArray = new float[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28820);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28821);assertEquals(0, ArrayUtils.getLength((float[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28822);assertEquals(0, ArrayUtils.getLength(emptyFloatArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28823);assertEquals(1, ArrayUtils.getLength(notEmptyFloatArray));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28824);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28825);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28826);assertEquals(0, ArrayUtils.getLength((boolean[]) null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28827);assertEquals(0, ArrayUtils.getLength(emptyBooleanArray));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28828);assertEquals(1, ArrayUtils.getLength(notEmptyBooleanArray));
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28829);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28830);ArrayUtils.getLength("notAnArray");
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28831);fail("IllegalArgumentException should have been thrown");
        } catch (final IllegalArgumentException e) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSorted() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q9ruqom8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSorted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q9ruqom8w(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28832);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28833);Integer[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28834);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28835);array = new Integer[]{1};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28836);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28837);array = new Integer[]{1,2,3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28838);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28839);array = new Integer[]{1,3,2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28840);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedComparator() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278hys6m95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278hys6m95(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28841);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28842);final Comparator<Integer> c = new Comparator<Integer>() {
                @Override
                public int compare(final Integer o1, final Integer o2) {try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28843);
                        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28844);return o2.compareTo(o1);
                    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
            };

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28845);Integer[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28846);assertTrue(ArrayUtils.isSorted(array, c));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28847);array = new Integer[]{1};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28848);assertTrue(ArrayUtils.isSorted(array, c));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28849);array = new Integer[]{3,2,1};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28850);assertTrue(ArrayUtils.isSorted(array, c));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28851);array = new Integer[]{1,3,2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28852);assertFalse(ArrayUtils.isSorted(array, c));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsSortedNullComparator() throws Exception {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6w6hpm9h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,115,83,111,114,116,101,100,78,117,108,108,67,111,109,112,97,114,97,116,111,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedNullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6w6hpm9h() throws Exception{try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28853);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28854);ArrayUtils.isSorted(null, null);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29f4qrhm9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29f4qrhm9j(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28855);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28856);int[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28857);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28858);array = new int[]{1};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28859);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28860);array = new int[]{1,2,3};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28861);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28862);array = new int[]{1,3,2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28863);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2557ma2m9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2557ma2m9s(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28864);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28865);float[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28866);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28867);array = new float[]{0f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28868);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28869);array = new float[]{-1f, 0f, 0.1f, 0.2f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28870);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28871);array = new float[]{-1f, 0.2f, 0.1f, 0f};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28872);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dz0y6cma1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dz0y6cma1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28873);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28874);long[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28875);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28876);array = new long[]{0L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28877);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28878);array = new long[]{-1L, 0L, 1L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28879);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28880);array = new long[]{-1L, 1L, 0L};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28881);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j44969maa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j44969maa(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28882);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28883);double[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28884);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28885);array = new double[]{0.0};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28886);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28887);array = new double[]{-1.0, 0.0, 0.1, 0.2};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28888);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28889);array = new double[]{-1.0, 0.2, 0.1, 0.0};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28890);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwaahimaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwaahimaj(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28891);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28892);char[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28893);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28894);array = new char[]{'a'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28895);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28896);array = new char[]{'a', 'b', 'c'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28897);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28898);array = new char[]{'a', 'c', 'b'};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28899);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxn4somas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxn4somas(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28900);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28901);byte[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28902);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28903);array = new byte[]{0x10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28904);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28905);array = new byte[]{0x10, 0x20, 0x30};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28906);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28907);array = new byte[]{0x10, 0x30, 0x20};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28908);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ve4crumb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ve4crumb1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28909);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28910);short[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28911);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28912);array = new short[]{0};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28913);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28914);array = new short[]{-1, 0, 1};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28915);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28916);array = new short[]{-1, 1, 0};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28917);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testIsSortedBool() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gj0nrqmba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsSortedBool",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gj0nrqmba(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28918);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28919);boolean[] array = null;
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28920);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28921);array = new boolean[]{true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28922);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28923);array = new boolean[]{false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28924);assertTrue(ArrayUtils.isSorted(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28925);array = new boolean[]{true, false};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28926);assertFalse(ArrayUtils.isSorted(array));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testCreatePrimitiveArray() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q0xg3rmbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCreatePrimitiveArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q0xg3rmbj(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28927);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28928);Assert.assertNull(ArrayUtils.toPrimitive((Object[])null));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28929);Assert.assertArrayEquals(new int[]{}, ArrayUtils.toPrimitive(new Integer[]{}));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28930);Assert.assertArrayEquals(new short[]{2}, ArrayUtils.toPrimitive(new Short[]{2}));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28931);Assert.assertArrayEquals(new long[]{2, 3}, ArrayUtils.toPrimitive(new Long[]{2L, 3L}));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28932);Assert.assertArrayEquals(new float[]{3.14f}, ArrayUtils.toPrimitive(new Float[]{3.14f}), 0.1f);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28933);Assert.assertArrayEquals(new double[]{2.718}, ArrayUtils.toPrimitive(new Double[]{2.718}), 0.1);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToStringArray_array() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hdb6ucmbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToStringArray_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hdb6ucmbq(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28934);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28935);assertNull(ArrayUtils.toStringArray(null));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28936);assertArrayEquals(new String[0], ArrayUtils.toStringArray(new Object[0]));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28937);final Object[] array = new Object[] {1, 2, 3, "array", "test"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28938);assertArrayEquals(new String[]{"1", "2", "3", "array", "test"}, ArrayUtils.toStringArray(array));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28939);try {
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28940);ArrayUtils.toStringArray(new Object[] {null});
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28941);fail("NullPointerException expected!");
        } catch (final NullPointerException expected) {}
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testToStringArray_array_string() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nr7tz6mby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToStringArray_array_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nr7tz6mby(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28942);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28943);assertNull(ArrayUtils.toStringArray(null, ""));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28944);assertArrayEquals(new String[0], ArrayUtils.toStringArray(new Object[0], ""));

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28945);final Object[] array = new Object[] { 1, null, "test" };
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28946);assertArrayEquals(new String[]{"1", "valueForNullElements", "test"},
                ArrayUtils.toStringArray(array, "valueForNullElements"));
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffle() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lynhqmc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lynhqmc3(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28947);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28948);String[] array1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28949);String[] array2 = ArrayUtils.clone(array1);

        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28950);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28951);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28952);for (String element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28953);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleBoolean() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qlz87cmca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qlz87cmca(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28954);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28955);boolean[] array1 = new boolean[]{true, false, true, true, false, false, true, false, false, true};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28956);boolean[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28957);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28958);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28959);Assert.assertEquals(5, ArrayUtils.removeAllOccurences(array1, true).length);
    }finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleByte() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26gintimcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26gintimcg(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28960);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28961);byte[] array1 = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28962);byte[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28963);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28964);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28965);for (byte element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28966);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleChar() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mf5ticmcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mf5ticmcn(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28967);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28968);char[] array1 = new char[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28969);char[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28970);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28971);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28972);for (char element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28973);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleShort() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_298a1lwmcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_298a1lwmcu(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28974);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28975);short[] array1 = new short[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28976);short[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28977);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28978);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28979);for (short element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28980);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleInt() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5t3ypmd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5t3ypmd1(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28981);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28982);int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28983);int[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28984);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28985);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28986);for (int element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28987);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleLong() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2og5f5imd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2og5f5imd8(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28988);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28989);long[] array1 = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28990);long[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28991);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28992);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28993);for (long element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(28994);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleFloat() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),28995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zh6s3omdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),28995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zh6s3omdf(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(28995);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28996);float[] array1 = new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28997);float[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28998);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(28999);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29000);for (float element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(29001);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}

    @Test
    public void testShuffleDouble() {__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceStart(getClass().getName(),29002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wnd729mdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k0dk0dlvha7f8c.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k0dk0dlvha7f8c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testShuffleDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wnd729mdm(){try{__CLR4_5_2k0dk0dlvha7f8c.R.inc(29002);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29003);double[] array1 = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29004);double[] array2 = ArrayUtils.clone(array1);
        
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29005);ArrayUtils.shuffle(array1);
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29006);Assert.assertFalse(Arrays.equals(array1, array2));
        __CLR4_5_2k0dk0dlvha7f8c.R.inc(29007);for (double element : array2) {{
            __CLR4_5_2k0dk0dlvha7f8c.R.inc(29008);Assert.assertTrue("Element " + element + " not found", ArrayUtils.contains(array1, element));
        }
    }}finally{__CLR4_5_2k0dk0dlvha7f8c.R.flushNeeded();}}
}
