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

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.ArrayUtils;
import org.hamcrest.Matcher;
import org.junit.Test;


/**
 * Unit tests {@link DiffBuilder}.
 */
public class DiffBuilderTest {static class __CLR4_5_2uymuymlvha7gw0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,40380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final ToStringStyle SHORT_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

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
        private int intField = 1;
        private int[] intArrayField = {1};
        private long longField = 1L;
        private long[] longArrayField = {1L};
        private short shortField = 1;
        private short[] shortArrayField = {1};
        private Object objectField = null;
        private Object[] objectArrayField = {null};

        @Override
        public DiffResult diff(final TypeTestClass obj) {try{__CLR4_5_2uymuymlvha7gw0.R.inc(40126);
            __CLR4_5_2uymuymlvha7gw0.R.inc(40127);return new DiffBuilder(this, obj, style)
                .append("boolean", booleanField, obj.booleanField)
                .append("booleanArray", booleanArrayField, obj.booleanArrayField)
                .append("byte", byteField, obj.byteField)
                .append("byteArray", byteArrayField, obj.byteArrayField)
                .append("char", charField, obj.charField)
                .append("charArray", charArrayField, obj.charArrayField)
                .append("double", doubleField, obj.doubleField)
                .append("doubleArray", doubleArrayField, obj.doubleArrayField)
                .append("float", floatField, obj.floatField)
                .append("floatArray", floatArrayField, obj.floatArrayField)
                .append("int", intField, obj.intField)
                .append("intArray", intArrayField, obj.intArrayField)
                .append("long", longField, obj.longField)
                .append("longArray", longArrayField, obj.longArrayField)
                .append("short", shortField, obj.shortField)
                .append("shortArray", shortArrayField, obj.shortArrayField)
                .append("objectField", objectField, obj.objectField)
                .append("objectArrayField", objectArrayField, obj.objectArrayField)
                .build();
        }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}        

        @Override
        public int hashCode() {try{__CLR4_5_2uymuymlvha7gw0.R.inc(40128);
            __CLR4_5_2uymuymlvha7gw0.R.inc(40129);return HashCodeBuilder.reflectionHashCode(this, false);
        }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
        
        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2uymuymlvha7gw0.R.inc(40130);
            __CLR4_5_2uymuymlvha7gw0.R.inc(40131);return EqualsBuilder.reflectionEquals(this, obj, false);
        }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    }
    
    
    @Test
    public void testBoolean() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1uys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1uys(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40132);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40133);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40134);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40135);class2.booleanField = false;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40136);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40137);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40138);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40139);assertEquals(Boolean.class, diff.getType());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40140);assertEquals(Boolean.TRUE, diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40141);assertEquals(Boolean.FALSE, diff.getRight());        
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test
    public void testBooleanArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rzd0quz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rzd0quz2() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40142);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40143);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40144);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40145);class2.booleanArrayField = new boolean[] {false, false};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40146);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40147);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40148);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40149);assertArrayEquals(ArrayUtils.toObject(class1.booleanArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40150);assertArrayEquals(ArrayUtils.toObject(class2.booleanArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    
    @Test
    public void testByte() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzuzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzuzb(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40151);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40152);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40153);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40154);class2.byteField = 0x01;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40155);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40156);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40157);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40158);assertEquals(Byte.valueOf(class1.byteField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40159);assertEquals(Byte.valueOf(class2.byteField), diff.getRight());        
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testByteArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mhe7kquzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mhe7kquzk() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40160);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40161);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40162);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40163);class2.byteArrayField= new byte[] {0x01, 0x02};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40164);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40165);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40166);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40167);assertArrayEquals(ArrayUtils.toObject(class1.byteArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40168);assertArrayEquals(ArrayUtils.toObject(class2.byteArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vuzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vuzt(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40169);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40170);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40171);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40172);class2.charField = 'z';
        __CLR4_5_2uymuymlvha7gw0.R.inc(40173);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40174);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40175);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40176);assertEquals(Character.valueOf(class1.charField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40177);assertEquals(Character.valueOf(class2.charField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    
    @Test
    public void testCharArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0bza0v02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0bza0v02() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40178);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40179);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40180);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40181);class2.charArrayField = new char[] {'f', 'o', 'o'};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40182);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40183);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40184);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40185);assertArrayEquals(ArrayUtils.toObject(class1.charArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40186);assertArrayEquals(ArrayUtils.toObject(class2.charArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    
    @Test
    public void testDouble() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hfze2v0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hfze2v0b(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40187);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40188);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40189);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40190);class2.doubleField = 99.99;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40191);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40192);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40193);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40194);assertEquals(Double.valueOf(class1.doubleField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40195);assertEquals(Double.valueOf(class2.doubleField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    

    
    @Test
    public void testDoubleArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6ks4jv0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6ks4jv0k() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40196);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40197);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40198);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40199);class2.doubleArrayField = new double[] {3.0, 2.9, 2.8};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40200);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40201);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40202);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40203);assertArrayEquals(ArrayUtils.toObject(class1.doubleArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40204);assertArrayEquals(ArrayUtils.toObject(class2.doubleArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testFloat() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuf8q9v0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuf8q9v0t(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40205);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40206);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40207);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40208);class2.floatField = 99.99F;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40209);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40210);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40211);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40212);assertEquals(Float.valueOf(class1.floatField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40213);assertEquals(Float.valueOf(class2.floatField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    

    
    @Test
    public void testFloatArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maw6iyv12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maw6iyv12() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40214);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40215);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40216);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40217);class2.floatArrayField = new float[] {3.0F, 2.9F, 2.8F};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40218);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40219);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40220);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40221);assertArrayEquals(ArrayUtils.toObject(class1.floatArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40222);assertArrayEquals(ArrayUtils.toObject(class2.floatArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    
    
    
    @Test
    public void testInt() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0v1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0v1b(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40223);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40224);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40225);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40226);class2.intField = 42;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40227);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40228);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40229);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40230);assertEquals(Integer.valueOf(class1.intField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40231);assertEquals(Integer.valueOf(class2.intField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    

    
    @Test
    public void testIntArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28w0so3v1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28w0so3v1k() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40232);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40233);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40234);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40235);class2.intArrayField = new int[] {3, 2, 1};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40236);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40237);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40238);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40239);assertArrayEquals(ArrayUtils.toObject(class1.intArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40240);assertArrayEquals(ArrayUtils.toObject(class2.intArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testLong() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzv1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzv1t(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40241);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40242);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40243);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40244);class2.longField = 42L;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40245);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40246);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40247);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40248);assertEquals(Long.valueOf(class1.longField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40249);assertEquals(Long.valueOf(class2.longField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    

    
    @Test
    public void testLongArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6v22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40250,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6v22() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40250);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40251);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40252);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40253);class2.longArrayField = new long[] {3L, 2L, 1L};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40254);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40255);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40256);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40257);assertArrayEquals(ArrayUtils.toObject(class1.longArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40258);assertArrayEquals(ArrayUtils.toObject(class2.longArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testShort() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exs2r3v2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exs2r3v2b(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40259);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40260);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40261);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40262);class2.shortField = 42;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40263);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40264);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40265);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40266);assertEquals(Short.valueOf(class1.shortField), diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40267);assertEquals(Short.valueOf(class2.shortField), diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}    

    
    @Test
    public void testShortArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqn45yv2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqn45yv2k() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40268);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40269);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40270);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40271);class2.shortArrayField = new short[] {3, 2, 1};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40272);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40273);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40274);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40275);assertArrayEquals(ArrayUtils.toObject(class1.shortArrayField), 
                (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40276);assertArrayEquals(ArrayUtils.toObject(class2.shortArrayField), 
                (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testObject() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0v2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0v2t() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40277);        
        __CLR4_5_2uymuymlvha7gw0.R.inc(40278);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40279);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40280);class2.objectField = "Some string";
        __CLR4_5_2uymuymlvha7gw0.R.inc(40281);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40282);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40283);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40284);assertEquals(class1.objectField, diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40285);assertEquals(class2.objectField, diff.getRight());                
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    /** 
     * Test that "left" and "right" are the same instance and are equal. 
     */
    @Test
    public void testObjectsSameAndEqual() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_274b7qsv32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObjectsSameAndEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_274b7qsv32() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40286);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40287);final Integer sameObject = 1;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40288);final TypeTestClass left = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40289);left.objectField = sameObject;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40290);final TypeTestClass right = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40291);right.objectField = sameObject;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40292);assertTrue(left.objectField == right.objectField);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40293);assertTrue(left.objectField.equals(right.objectField));

        __CLR4_5_2uymuymlvha7gw0.R.inc(40294);final DiffResult list = left.diff(right);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40295);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    /** 
     * Test that "left" and "right" are the same instance but are equal. 
     */
    @Test
    public void testObjectsNotSameButEqual() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7lltdv3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObjectsNotSameButEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7lltdv3c() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40296);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40297);final TypeTestClass left = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40298);left.objectField = new Integer(1);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40299);final TypeTestClass right = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40300);right.objectField = new Integer(1);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40301);assertFalse(left.objectField == right.objectField);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40302);assertTrue(left.objectField.equals(right.objectField));

        __CLR4_5_2uymuymlvha7gw0.R.inc(40303);final DiffResult list = left.diff(right);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40304);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    /** 
     * Test that "left" and "right" are not the same instance and are not equal. 
     */
    @Test
    public void testObjectsNotSameNorEqual() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2eowvv3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObjectsNotSameNorEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2eowvv3l() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40305);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40306);final TypeTestClass left = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40307);left.objectField = 4;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40308);final TypeTestClass right = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40309);right.objectField = 100;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40310);assertFalse(left.objectField == right.objectField);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40311);assertFalse(left.objectField.equals(right.objectField));

        __CLR4_5_2uymuymlvha7gw0.R.inc(40312);final DiffResult list = left.diff(right);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40313);assertEquals(1, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test
    public void testObjectArray() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7v3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7v3u() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40314);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40315);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40316);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40317);class2.objectArrayField = new Object[] {"string", 1, 2};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40318);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40319);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40320);final Diff<?> diff = list.getDiffs().get(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40321);assertArrayEquals(class1.objectArrayField, (Object[]) diff.getLeft());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40322);assertArrayEquals(class2.objectArrayField, (Object[]) diff.getRight());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}   
    
    @Test
    public void testObjectArrayEqual() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fn6annv43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testObjectArrayEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fn6annv43() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40323);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40324);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40325);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40326);class1.objectArrayField = new Object[] {"string", 1, 2};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40327);class2.objectArrayField = new Object[] {"string", 1, 2};
        __CLR4_5_2uymuymlvha7gw0.R.inc(40328);final DiffResult list = class1.diff(class2);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40329);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}  
    
    
    @Test
    public void testByteArrayEqualAsObject() throws Exception {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rf7vcdv4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testByteArrayEqualAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rf7vcdv4a() throws Exception{try{__CLR4_5_2uymuymlvha7gw0.R.inc(40330);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40331);final DiffResult list = new DiffBuilder("String1", "String2", SHORT_STYLE)
            .append("foo", new boolean[] {false}, new boolean[] {false})
            .append("foo", new byte[] {0x01}, new byte[] {0x01})
            .append("foo", new char[] {'a'}, new char[] {'a'})
            .append("foo", new double[] {1.0}, new double[] {1.0})
            .append("foo", new float[] {1.0F}, new float[] {1.0F})
            .append("foo", new int[] {1}, new int[] {1})
            .append("foo", new long[] {1L}, new long[] {1L})
            .append("foo", new short[] {1}, new short[] {1})
            .append("foo", new Object[] {1, "two"}, new Object[] {1, "two"})
            .build();

        __CLR4_5_2uymuymlvha7gw0.R.inc(40332);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testDiffResult() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vz7blxv4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testDiffResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40333,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vz7blxv4d(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40333);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40334);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40335);final TypeTestClass class2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40336);class2.intField = 2;

        __CLR4_5_2uymuymlvha7gw0.R.inc(40337);final DiffResult list = new DiffBuilder(class1, class2, SHORT_STYLE)
            .append("prop1", class1.diff(class2))
            .build();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40338);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2uymuymlvha7gw0.R.inc(40339);assertEquals("prop1.int", list.getDiffs().get(0).getFieldName());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testNullLhs() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ggd8lv4k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,76,104,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testNullLhs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ggd8lv4k(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40340);      
        __CLR4_5_2uymuymlvha7gw0.R.inc(40341);new DiffBuilder(null, this, ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    

    @Test(expected=IllegalArgumentException.class)
    public void testNullRhs() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcnrxxv4m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,82,104,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testNullRhs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcnrxxv4m(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40342);      
        __CLR4_5_2uymuymlvha7gw0.R.inc(40343);new DiffBuilder(this, null, ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}   
    
    @Test
    public void testSameObjectIgnoresAppends() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_227a6nqv4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testSameObjectIgnoresAppends",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_227a6nqv4o(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40344);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40345);final TypeTestClass testClass = new TypeTestClass();        
        __CLR4_5_2uymuymlvha7gw0.R.inc(40346);final DiffResult list = new DiffBuilder(testClass, testClass, SHORT_STYLE)
            .append("ignored", false, true)
            .build();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40347);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    @Test
    public void testSimilarObjectIgnoresAppends() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz67plv4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testSimilarObjectIgnoresAppends",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz67plv4s(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40348);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40349);final TypeTestClass testClass1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40350);final TypeTestClass testClass2 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40351);final DiffResult list = new DiffBuilder(testClass1, testClass2, SHORT_STYLE)
            .append("ignored", false, true)
            .build();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40352);assertEquals(0, list.getNumberOfDiffs());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}
    
    
    @Test
    public void testStylePassedToDiffResult() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b0gc43v4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testStylePassedToDiffResult",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b0gc43v4x(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40353);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40354);final TypeTestClass class1 = new TypeTestClass();
        __CLR4_5_2uymuymlvha7gw0.R.inc(40355);DiffResult list = class1.diff(class1);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40356);assertEquals(SHORT_STYLE, list.getToStringStyle());
        
        __CLR4_5_2uymuymlvha7gw0.R.inc(40357);class1.style = ToStringStyle.MULTI_LINE_STYLE;
        __CLR4_5_2uymuymlvha7gw0.R.inc(40358);list = class1.diff(class1);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40359);assertEquals(ToStringStyle.MULTI_LINE_STYLE, list.getToStringStyle());
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test
    public void testTriviallyEqualTestDisabled() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uliwjpv54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testTriviallyEqualTestDisabled",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uliwjpv54(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40360);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40361);final Matcher<Integer> equalToOne = equalTo(1);

        // Constructor's arguments are not trivially equal, but not testing for that.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40362);final DiffBuilder explicitTestAndNotEqual1 = new DiffBuilder(1, 2, null, false);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40363);explicitTestAndNotEqual1.append("letter", "X", "Y");
        __CLR4_5_2uymuymlvha7gw0.R.inc(40364);assertThat(explicitTestAndNotEqual1.build().getNumberOfDiffs(), equalToOne);

        // Constructor's arguments are trivially equal, but not testing for that.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40365);final DiffBuilder explicitTestAndNotEqual2 = new DiffBuilder(1, 1, null, false);
        // This append(f, l, r) will not abort early.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40366);explicitTestAndNotEqual2.append("letter", "X", "Y");
        __CLR4_5_2uymuymlvha7gw0.R.inc(40367);assertThat(explicitTestAndNotEqual2.build().getNumberOfDiffs(), equalToOne);
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

    @Test
    public void testTriviallyEqualTestEnabled() {__CLR4_5_2uymuymlvha7gw0.R.globalSliceStart(getClass().getName(),40368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uejkkav5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2uymuymlvha7gw0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2uymuymlvha7gw0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffBuilderTest.testTriviallyEqualTestEnabled",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40368,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uejkkav5c(){try{__CLR4_5_2uymuymlvha7gw0.R.inc(40368);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40369);final Matcher<Integer> equalToZero = equalTo(0);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40370);final Matcher<Integer> equalToOne = equalTo(1);

        // The option to test if trivially equal is enabled by default.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40371);final DiffBuilder implicitTestAndEqual = new DiffBuilder(1, 1, null);
        // This append(f, l, r) will abort without creating a Diff for letter.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40372);implicitTestAndEqual.append("letter", "X", "Y");
        __CLR4_5_2uymuymlvha7gw0.R.inc(40373);assertThat(implicitTestAndEqual.build().getNumberOfDiffs(), equalToZero);

        __CLR4_5_2uymuymlvha7gw0.R.inc(40374);final DiffBuilder implicitTestAndNotEqual = new DiffBuilder(1, 2, null);
        // This append(f, l, r) will not abort early
        // because the constructor's arguments were not trivially equal.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40375);implicitTestAndNotEqual.append("letter", "X", "Y");
        __CLR4_5_2uymuymlvha7gw0.R.inc(40376);assertThat(implicitTestAndNotEqual.build().getNumberOfDiffs(), equalToOne);

        // This is explicitly enabling the trivially equal test.
        __CLR4_5_2uymuymlvha7gw0.R.inc(40377);final DiffBuilder explicitTestAndEqual = new DiffBuilder(1, 1, null, true);
        __CLR4_5_2uymuymlvha7gw0.R.inc(40378);explicitTestAndEqual.append("letter", "X", "Y");
        __CLR4_5_2uymuymlvha7gw0.R.inc(40379);assertThat(explicitTestAndEqual.build().getNumberOfDiffs(), equalToZero);
    }finally{__CLR4_5_2uymuymlvha7gw0.R.flushNeeded();}}

}
