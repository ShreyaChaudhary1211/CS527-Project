/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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


public class ReflectionDiffBuilderTest {static class __CLR4_5_2ws5ws5lvha7hgh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final ToStringStyle SHORT_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

    @SuppressWarnings("unused")
    private static class TypeTestClass implements Diffable<TypeTestClass> {
        private ToStringStyle style = SHORT_STYLE;
        private boolean booleanField = true;
        private boolean[] booleanArrayField = {true};
        private byte byteField = (byte) 0xFF;
        private byte[] byteArrayField = {(byte) 0xFF};
        private char charField = 'a';
        private char[] charArrayField = {'a'};
        private double doubleField = 1.0;
        private double[] doubleArrayField = {1.0};
        private float floatField = 1.0f;
        private float[] floatArrayField = {1.0f};
        int intField = 1;
        private int[] intArrayField = {1};
        private long longField = 1L;
        private long[] longArrayField = {1L};
        private short shortField = 1;
        private short[] shortArrayField = {1};
        private Object objectField = null;
        private Object[] objectArrayField = {null};
        private static int staticField;
        private transient String transientField;

        @Override
        public DiffResult diff(final TypeTestClass obj) {try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42485);
            __CLR4_5_2ws5ws5lvha7hgh.R.inc(42486);return new ReflectionDiffBuilder(this, obj, style).build();
        }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42487);
            __CLR4_5_2ws5ws5lvha7hgh.R.inc(42488);return HashCodeBuilder.reflectionHashCode(this, false);
        }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42489);
            __CLR4_5_2ws5ws5lvha7hgh.R.inc(42490);return EqualsBuilder.reflectionEquals(this, obj, false);
        }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}
    }

    @SuppressWarnings("unused")
    private static class TypeTestChildClass extends TypeTestClass {
        String field = "a";
    }

    @Test
    public void test_no_differences() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22a3po4wsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_no_differences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22a3po4wsb(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42491);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42492);final TypeTestClass firstObject = new TypeTestClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42493);final TypeTestClass secondObject = new TypeTestClass();

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42494);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42495);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

    @Test
    public void test_primitive_difference() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2cm5lwsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_primitive_difference",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42496,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2cm5lwsg(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42496);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42497);final TypeTestClass firstObject = new TypeTestClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42498);firstObject.charField = 'c';
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42499);final TypeTestClass secondObject = new TypeTestClass();

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42500);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42501);assertEquals(1, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

    @Test
    public void test_array_difference() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3lu7rwsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_array_difference",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3lu7rwsm(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42502);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42503);final TypeTestClass firstObject = new TypeTestClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42504);firstObject.charArrayField = new char[] { 'c' };
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42505);final TypeTestClass secondObject = new TypeTestClass();

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42506);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42507);assertEquals(1, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

    @Test
    public void test_transient_field_difference() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fd0ggbwss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_transient_field_difference",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fd0ggbwss(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42508);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42509);final TypeTestClass firstObject = new TypeTestClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42510);firstObject.transientField = "a";
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42511);final TypeTestClass secondObject = new TypeTestClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42512);firstObject.transientField = "b";

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42513);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42514);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

    @Test
    public void test_no_differences_inheritance() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yw5vntwsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_no_differences_inheritance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yw5vntwsz(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42515);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42516);final TypeTestChildClass firstObject = new TypeTestChildClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42517);final TypeTestChildClass secondObject = new TypeTestChildClass();

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42518);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42519);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}

    @Test
    public void test_difference_in_inherited_field() {__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceStart(getClass().getName(),42520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dcwaaxwt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ws5ws5lvha7hgh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ws5ws5lvha7hgh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionDiffBuilderTest.test_difference_in_inherited_field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dcwaaxwt4(){try{__CLR4_5_2ws5ws5lvha7hgh.R.inc(42520);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42521);final TypeTestChildClass firstObject = new TypeTestChildClass();
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42522);firstObject.intField = 99;
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42523);final TypeTestChildClass secondObject = new TypeTestChildClass();

        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42524);final DiffResult list = firstObject.diff(secondObject);
        __CLR4_5_2ws5ws5lvha7hgh.R.inc(42525);assertEquals(1, list.getNumberOfDiffs());
    }finally{__CLR4_5_2ws5ws5lvha7hgh.R.flushNeeded();}}
}
