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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 */
public class CompareToBuilderTest {static class __CLR4_5_2u8eu8elvha7gup{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,40067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39182);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39183);this.a = a;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39184);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39185);if ((((o == this)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39186)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39187)==0&false))) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39188);return true;
            }
            }__CLR4_5_2u8eu8elvha7gup.R.inc(39189);if ((((!(o instanceof TestObject))&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39190)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39191)==0&false))) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39192);return false;
            }
            }__CLR4_5_2u8eu8elvha7gup.R.inc(39193);final TestObject rhs = (TestObject) o;
            __CLR4_5_2u8eu8elvha7gup.R.inc(39194);return a == rhs.a;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39195);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39196);return a;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39197);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39198);this.a = a;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39199);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39200);return a;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
        @Override
        public int compareTo(final TestObject rhs) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39201);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39202);return (((a < rhs.a )&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39203)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39204)==0&false))? -1 : (((a > rhs.a )&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39205)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39206)==0&false))? +1 : 0;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_5_2u8eu8elvha7gup.R.inc(39208);try{__CLR4_5_2u8eu8elvha7gup.R.inc(39207);
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_5_2u8eu8elvha7gup.R.inc(39210);try{__CLR4_5_2u8eu8elvha7gup.R.inc(39209);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39211);this.b = b;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39212);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39213);if ((((o == this)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39214)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39215)==0&false))) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39216);return true;
            }
            }__CLR4_5_2u8eu8elvha7gup.R.inc(39217);if ((((!(o instanceof TestSubObject))&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39218)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39219)==0&false))) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39220);return false;
            }
            }__CLR4_5_2u8eu8elvha7gup.R.inc(39221);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_5_2u8eu8elvha7gup.R.inc(39222);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);__CLR4_5_2u8eu8elvha7gup.R.inc(39224);try{__CLR4_5_2u8eu8elvha7gup.R.inc(39223);
            __CLR4_5_2u8eu8elvha7gup.R.inc(39225);this.t = t;
        }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    }
    
    @Test
    public void testReflectionCompare() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k5t1ptu9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k5t1ptu9m(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39226);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39227);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39228);final TestObject o2 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39229);assertTrue(CompareToBuilder.reflectionCompare(o1, o1) == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39230);assertTrue(CompareToBuilder.reflectionCompare(o1, o2) == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39231);o2.setA(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39232);assertTrue(CompareToBuilder.reflectionCompare(o1, o2) < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39233);assertTrue(CompareToBuilder.reflectionCompare(o2, o1) > 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testReflectionCompareEx1() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uvqm5u9u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,67,111,109,112,97,114,101,69,120,49,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uvqm5u9u(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39234);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39235);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39236);CompareToBuilder.reflectionCompare(o1, null);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testReflectionCompareEx2() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263vpemu9x();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,67,111,109,112,97,114,101,69,120,50,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263vpemu9x(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39237);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39238);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39239);final Object o2 = new Object();
        __CLR4_5_2u8eu8elvha7gup.R.inc(39240);CompareToBuilder.reflectionCompare(o1, o2);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testReflectionHierarchyCompare() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ps4jccua1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ps4jccua1(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39241);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39242);testReflectionHierarchyCompare(false, null);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyCompareExcludeFields() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2svd703ua3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2svd703ua3(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39243);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39244);final String[] excludeFields = new String[] { "b" };
        __CLR4_5_2u8eu8elvha7gup.R.inc(39245);testReflectionHierarchyCompare(true, excludeFields);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39246);TestSubObject x;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39247);TestSubObject y;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39248);TestSubObject z;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39249);x = new TestSubObject(1, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39250);y = new TestSubObject(2, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39251);z = new TestSubObject(3, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39252);assertXYZCompareOrder(x, y, z, true, excludeFields);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39253);x = new TestSubObject(1, 3);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39254);y = new TestSubObject(2, 2);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39255);z = new TestSubObject(3, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39256);assertXYZCompareOrder(x, y, z, true, excludeFields);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyCompareTransients() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0ek8tuah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0ek8tuah(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39257);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39258);testReflectionHierarchyCompare(true, null);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39259);TestTransientSubObject x;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39260);TestTransientSubObject y;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39261);TestTransientSubObject z;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39262);x = new TestTransientSubObject(1, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39263);y = new TestTransientSubObject(2, 2);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39264);z = new TestTransientSubObject(3, 3);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39265);assertXYZCompareOrder(x, y, z, true, null);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39266);x = new TestTransientSubObject(1, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39267);y = new TestTransientSubObject(1, 2);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39268);z = new TestTransientSubObject(1, 3);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39269);assertXYZCompareOrder(x, y, z, true, null);  
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39270);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39271);assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39272);assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39273);assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39274);assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39275);assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39276);assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39277);assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39278);assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39279);assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39280);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39281);final TestObject to1 = new TestObject(1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39282);final TestObject to2 = new TestObject(2);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39283);final TestObject to3 = new TestObject(3);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39284);final TestSubObject tso1 = new TestSubObject(1, 1);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39285);final TestSubObject tso2 = new TestSubObject(2, 2);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39286);final TestSubObject tso3 = new TestSubObject(3, 3);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39287);assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39288);assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39289);assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39290);assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39291);assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39292);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        __CLR4_5_2u8eu8elvha7gup.R.inc(39293);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        __CLR4_5_2u8eu8elvha7gup.R.inc(39294);assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        __CLR4_5_2u8eu8elvha7gup.R.inc(39295);assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39296);

        // signum
        __CLR4_5_2u8eu8elvha7gup.R.inc(39297);assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        __CLR4_5_2u8eu8elvha7gup.R.inc(39298);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39299)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39300)==0&false))){{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39301);assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39302);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39303)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39304)==0&false))) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39305);assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39306);assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    /**
     * Returns the signum of the result of comparing x and y with
     * <code>CompareToBuilder.reflectionCompare</code>
     * 
     * @param lhs The "left-hand-side" of the comparison.
     * @param rhs The "right-hand-side" of the comparison.
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     * @return int The signum
     */
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {try{__CLR4_5_2u8eu8elvha7gup.R.inc(39307);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39308);return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testAppendSuper() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiubx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiubx(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39309);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39310);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39311);final TestObject o2 = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39312);assertTrue(new CompareToBuilder().appendSuper(0).append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39313);assertTrue(new CompareToBuilder().appendSuper(0).append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39314);assertTrue(new CompareToBuilder().appendSuper(0).append(o2, o1).toComparison() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39315);assertTrue(new CompareToBuilder().appendSuper(-1).append(o1, o1).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39316);assertTrue(new CompareToBuilder().appendSuper(-1).append(o1, o2).toComparison() < 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39317);assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39318);assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o2).toComparison() > 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0uc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0uc7(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39319);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39320);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39321);final TestObject o2 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39322);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39323);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39324);o2.setA(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39325);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39326);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39327);assertTrue(new CompareToBuilder().append(o1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39328);assertTrue(new CompareToBuilder().append((Object) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39329);assertTrue(new CompareToBuilder().append(null, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvdhb0uci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvdhb0uci(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39330);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39331);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39332);final TestObject o2 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39333);assertEquals(Integer.valueOf(0), new CompareToBuilder().append(o1, o1).build());
        __CLR4_5_2u8eu8elvha7gup.R.inc(39334);assertEquals(Integer.valueOf(0), new CompareToBuilder().append(o1, o2).build());
        __CLR4_5_2u8eu8elvha7gup.R.inc(39335);o2.setA(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39336);assertTrue(new CompareToBuilder().append(o1, o2).build().intValue() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39337);assertTrue(new CompareToBuilder().append(o2, o1).build().intValue() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39338);assertTrue(new CompareToBuilder().append(o1, null).build().intValue() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39339);assertEquals(Integer.valueOf(0), new CompareToBuilder().append((Object) null, null).build());
        __CLR4_5_2u8eu8elvha7gup.R.inc(39340);assertTrue(new CompareToBuilder().append(null, o1).build().intValue() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testObjectEx2() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qm10p7uct();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,98,106,101,99,116,69,120,50,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39341,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qm10p7uct(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39341);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39342);final TestObject o1 = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39343);final Object o2 = new Object();
        __CLR4_5_2u8eu8elvha7gup.R.inc(39344);new CompareToBuilder().append(o1, o2);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testObjectComparator() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ni45qucx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ni45qucx(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39345);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39346);final String o1 = "Fred";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39347);String o2 = "Fred";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39348);assertTrue(new CompareToBuilder().append(o1, o1, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39349);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39350);o2 = "FRED";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39351);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39352);assertTrue(new CompareToBuilder().append(o2, o1, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39353);o2 = "FREDA";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39354);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39355);assertTrue(new CompareToBuilder().append(o2, o1, String.CASE_INSENSITIVE_ORDER).toComparison() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39356);assertTrue(new CompareToBuilder().append(o1, null, String.CASE_INSENSITIVE_ORDER).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39357);assertTrue(new CompareToBuilder().append(null, null, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39358);assertTrue(new CompareToBuilder().append(null, o1, String.CASE_INSENSITIVE_ORDER).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testObjectComparatorNull() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ijcborudb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ijcborudb(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39359);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39360);final String o1 = "Fred";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39361);String o2 = "Fred";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39362);assertTrue(new CompareToBuilder().append(o1, o1, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39363);assertTrue(new CompareToBuilder().append(o1, o2, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39364);o2 = "Zebra";
        __CLR4_5_2u8eu8elvha7gup.R.inc(39365);assertTrue(new CompareToBuilder().append(o1, o2, null).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39366);assertTrue(new CompareToBuilder().append(o2, o1, null).toComparison() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39367);assertTrue(new CompareToBuilder().append(o1, null, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39368);assertTrue(new CompareToBuilder().append(null, null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39369);assertTrue(new CompareToBuilder().append(null, o1, null).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzudm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39370,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzudm(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39370);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39371);final long o1 = 1L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39372);final long o2 = 2L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39373);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39374);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39375);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39376);assertTrue(new CompareToBuilder().append(o1, Long.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39377);assertTrue(new CompareToBuilder().append(Long.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39378);assertTrue(new CompareToBuilder().append(o1, Long.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39379);assertTrue(new CompareToBuilder().append(Long.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testInt() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0udw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0udw(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39380);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39381);final int o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39382);final int o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39383);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39384);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39385);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39386);assertTrue(new CompareToBuilder().append(o1, Integer.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39387);assertTrue(new CompareToBuilder().append(Integer.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39388);assertTrue(new CompareToBuilder().append(o1, Integer.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39389);assertTrue(new CompareToBuilder().append(Integer.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exs2r3ue6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39390,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exs2r3ue6(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39390);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39391);final short o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39392);final short o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39393);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39394);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39395);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39396);assertTrue(new CompareToBuilder().append(o1, Short.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39397);assertTrue(new CompareToBuilder().append(Short.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39398);assertTrue(new CompareToBuilder().append(o1, Short.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39399);assertTrue(new CompareToBuilder().append(Short.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vueg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vueg(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39400);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39401);final char o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39402);final char o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39403);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39404);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39405);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39406);assertTrue(new CompareToBuilder().append(o1, Character.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39407);assertTrue(new CompareToBuilder().append(Character.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39408);assertTrue(new CompareToBuilder().append(o1, Character.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39409);assertTrue(new CompareToBuilder().append(Character.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzueq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzueq(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39410);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39411);final byte o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39412);final byte o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39413);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39414);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39415);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39416);assertTrue(new CompareToBuilder().append(o1, Byte.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39417);assertTrue(new CompareToBuilder().append(Byte.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39418);assertTrue(new CompareToBuilder().append(o1, Byte.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39419);assertTrue(new CompareToBuilder().append(Byte.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testDouble() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hfze2uf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hfze2uf0(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39420);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39421);final double o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39422);final double o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39423);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39424);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39425);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39426);assertTrue(new CompareToBuilder().append(o1, Double.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39427);assertTrue(new CompareToBuilder().append(Double.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39428);assertTrue(new CompareToBuilder().append(o1, Double.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39429);assertTrue(new CompareToBuilder().append(Double.MIN_VALUE, o1).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39430);assertTrue(new CompareToBuilder().append(Double.NaN, Double.NaN).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39431);assertTrue(new CompareToBuilder().append(Double.NaN, Double.MAX_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39432);assertTrue(new CompareToBuilder().append(Double.POSITIVE_INFINITY, Double.MAX_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39433);assertTrue(new CompareToBuilder().append(Double.NEGATIVE_INFINITY, Double.MIN_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39434);assertTrue(new CompareToBuilder().append(o1, Double.NaN).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39435);assertTrue(new CompareToBuilder().append(Double.NaN, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39436);assertTrue(new CompareToBuilder().append(-0.0, 0.0).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39437);assertTrue(new CompareToBuilder().append(0.0, -0.0).toComparison() > 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuf8q9ufi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuf8q9ufi(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39438);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39439);final float o1 = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39440);final float o2 = 2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39441);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39442);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39443);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39444);assertTrue(new CompareToBuilder().append(o1, Float.MAX_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39445);assertTrue(new CompareToBuilder().append(Float.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39446);assertTrue(new CompareToBuilder().append(o1, Float.MIN_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39447);assertTrue(new CompareToBuilder().append(Float.MIN_VALUE, o1).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39448);assertTrue(new CompareToBuilder().append(Float.NaN, Float.NaN).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39449);assertTrue(new CompareToBuilder().append(Float.NaN, Float.MAX_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39450);assertTrue(new CompareToBuilder().append(Float.POSITIVE_INFINITY, Float.MAX_VALUE).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39451);assertTrue(new CompareToBuilder().append(Float.NEGATIVE_INFINITY, Float.MIN_VALUE).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39452);assertTrue(new CompareToBuilder().append(o1, Float.NaN).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39453);assertTrue(new CompareToBuilder().append(Float.NaN, o1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39454);assertTrue(new CompareToBuilder().append(-0.0, 0.0).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39455);assertTrue(new CompareToBuilder().append(0.0, -0.0).toComparison() > 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1ug0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1ug0(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39456);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39457);final boolean o1 = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39458);final boolean o2 = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39459);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39460);assertTrue(new CompareToBuilder().append(o2, o2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39461);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39462);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7ug7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7ug7(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39463);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39464);final TestObject[] obj1 = new TestObject[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39465);obj1[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39466);obj1[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39467);final TestObject[] obj2 = new TestObject[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39468);obj2[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39469);obj2[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39470);final TestObject[] obj3 = new TestObject[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39471);obj3[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39472);obj3[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39473);obj3[2] = new TestObject(6);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39474);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39475);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39476);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39477);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39478);obj1[1] = new TestObject(7);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39479);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39480);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39481);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39482);assertTrue(new CompareToBuilder().append((Object[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39483);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6ugs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6ugs(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39484);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39485);final long[] obj1 = new long[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39486);obj1[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39487);obj1[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39488);final long[] obj2 = new long[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39489);obj2[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39490);obj2[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39491);final long[] obj3 = new long[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39492);obj3[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39493);obj3[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39494);obj3[2] = 7L;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39495);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39496);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39497);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39498);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39499);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39500);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39501);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39502);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39503);assertTrue(new CompareToBuilder().append((long[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39504);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28w0so3uhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28w0so3uhd(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39505);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39506);final int[] obj1 = new int[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39507);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39508);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39509);final int[] obj2 = new int[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39510);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39511);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39512);final int[] obj3 = new int[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39513);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39514);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39515);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39516);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39517);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39518);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39519);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39520);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39521);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39522);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39523);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39524);assertTrue(new CompareToBuilder().append((int[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39525);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqn45yuhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqn45yuhy(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39526);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39527);final short[] obj1 = new short[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39528);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39529);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39530);final short[] obj2 = new short[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39531);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39532);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39533);final short[] obj3 = new short[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39534);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39535);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39536);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39537);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39538);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39539);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39540);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39541);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39542);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39543);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39544);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39545);assertTrue(new CompareToBuilder().append((short[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39546);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0bza0uij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0bza0uij(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39547);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39548);final char[] obj1 = new char[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39549);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39550);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39551);final char[] obj2 = new char[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39552);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39553);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39554);final char[] obj3 = new char[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39555);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39556);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39557);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39558);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39559);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39560);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39561);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39562);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39563);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39564);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39565);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39566);assertTrue(new CompareToBuilder().append((char[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39567);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mhe7kquj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mhe7kquj4(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39568);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39569);final byte[] obj1 = new byte[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39570);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39571);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39572);final byte[] obj2 = new byte[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39573);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39574);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39575);final byte[] obj3 = new byte[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39576);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39577);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39578);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39579);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39580);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39581);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39582);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39583);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39584);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39585);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39586);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39587);assertTrue(new CompareToBuilder().append((byte[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39588);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6ks4jujp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6ks4jujp(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39589);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39590);final double[] obj1 = new double[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39591);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39592);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39593);final double[] obj2 = new double[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39594);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39595);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39596);final double[] obj3 = new double[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39597);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39598);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39599);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39600);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39601);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39602);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39603);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39604);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39605);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39606);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39607);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39608);assertTrue(new CompareToBuilder().append((double[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39609);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maw6iyuka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maw6iyuka(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39610);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39611);final float[] obj1 = new float[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39612);obj1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39613);obj1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39614);final float[] obj2 = new float[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39615);obj2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39616);obj2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39617);final float[] obj3 = new float[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39618);obj3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39619);obj3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39620);obj3[2] = 7;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39621);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39622);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39623);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39624);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39625);obj1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39626);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39627);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39628);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39629);assertTrue(new CompareToBuilder().append((float[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39630);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rzd0qukv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39631,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rzd0qukv(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39631);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39632);final boolean[] obj1 = new boolean[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39633);obj1[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39634);obj1[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39635);final boolean[] obj2 = new boolean[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39636);obj2[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39637);obj2[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39638);final boolean[] obj3 = new boolean[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39639);obj3[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39640);obj3[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39641);obj3[2] = true;

        __CLR4_5_2u8eu8elvha7gup.R.inc(39642);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39643);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39644);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39645);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39646);obj1[1] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39647);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39648);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39649);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39650);assertTrue(new CompareToBuilder().append((boolean[]) null, null).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39651);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiLongArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f7d7lpulg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39652,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f7d7lpulg(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39652);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39653);final long[][] array1 = new long[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39654);final long[][] array2 = new long[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39655);final long[][] array3 = new long[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39656);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39657)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39658)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39659);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39660)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39661)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39662);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39663);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39664);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39665);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39666);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39667);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39668);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39669);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39670);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39671);array1[1][1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39672);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39673);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiIntArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ol03cum2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ol03cum2(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39674);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39675);final int[][] array1 = new int[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39676);final int[][] array2 = new int[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39677);final int[][] array3 = new int[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39678);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39679)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39680)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39681);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39682)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39683)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39684);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39685);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39686);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39687);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39688);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39689);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39690);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39691);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39692);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39693);array1[1][1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39694);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39695);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiShortArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nu5uzumo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nu5uzumo(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39696);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39697);final short[][] array1 = new short[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39698);final short[][] array2 = new short[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39699);final short[][] array3 = new short[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39700);for (short i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39701)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39702)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39703);for (short j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39704)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39705)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39706);array1[i][j] = (short)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39707);array2[i][j] = (short)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39708);array3[i][j] = (short)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39709);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39710);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39711);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39712);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39713);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39714);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39715);array1[1][1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39716);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39717);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiCharArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25e9ml9una();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25e9ml9una(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39718);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39719);final char[][] array1 = new char[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39720);final char[][] array2 = new char[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39721);final char[][] array3 = new char[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39722);for (short i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39723)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39724)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39725);for (short j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39726)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39727)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39728);array1[i][j] = (char)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39729);array2[i][j] = (char)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39730);array3[i][j] = (char)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39731);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39732);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39733);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39734);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39735);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39736);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39737);array1[1][1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39738);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39739);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiByteArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b548j5unw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b548j5unw(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39740);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39741);final byte[][] array1 = new byte[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39742);final byte[][] array2 = new byte[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39743);final byte[][] array3 = new byte[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39744);for (byte i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39745)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39746)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39747);for (byte j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39748)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39749)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39750);array1[i][j] = (byte)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39751);array2[i][j] = (byte)((i + 1) * (j + 1));
                __CLR4_5_2u8eu8elvha7gup.R.inc(39752);array3[i][j] = (byte)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39753);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39754);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39755);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39756);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39757);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39758);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39759);array1[1][1] = 127;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39760);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39761);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
    
    @Test
    public void testMultiFloatArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pnex57uoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pnex57uoi(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39762);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39763);final float[][] array1 = new float[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39764);final float[][] array2 = new float[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39765);final float[][] array3 = new float[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39766);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39767)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39768)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39769);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39770)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39771)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39772);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39773);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39774);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39775);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39776);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39777);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39778);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39779);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39780);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39781);array1[1][1] = 127;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39782);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39783);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiDoubleArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2radrtkup4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2radrtkup4(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39784);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39785);final double[][] array1 = new double[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39786);final double[][] array2 = new double[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39787);final double[][] array3 = new double[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39788);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39789)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39790)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39791);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39792)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39793)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39794);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39795);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39796);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39797);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39798);array3[1][2] = 100;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39799);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39800);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39801);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39802);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39803);array1[1][1] = 127;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39804);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39805);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMultiBooleanArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2efr9kxupq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2efr9kxupq(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39806);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39807);final boolean[][] array1 = new boolean[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39808);final boolean[][] array2 = new boolean[2][2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39809);final boolean[][] array3 = new boolean[2][3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39810);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39811)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39812)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39813);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39814)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39815)==0&false)); j++) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39816);array1[i][j] = i == 1 ^ j == 1;
                __CLR4_5_2u8eu8elvha7gup.R.inc(39817);array2[i][j] = i == 1 ^ j == 1;
                __CLR4_5_2u8eu8elvha7gup.R.inc(39818);array3[i][j] = i == 1 ^ j == 1;
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39819);array3[1][2] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39820);array3[1][2] = false;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39821);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39822);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39823);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39824);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39825);array1[1][1] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39826);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39827);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testRaggedArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rmuiouqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rmuiouqc(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39828);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39829);final long array1[][] = new long[2][];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39830);final long array2[][] = new long[2][];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39831);final long array3[][] = new long[3][];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39832);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39833)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39834)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39835);array1[i] = new long[2];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39836);array2[i] = new long[2];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39837);array3[i] = new long[3];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39838);for (int j = 0; (((j < array1[i].length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39839)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39840)==0&false)); ++j) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39841);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39842);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39843);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39844);array3[1][2] = 100;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39845);array3[1][2] = 100;
        
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39846);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39847);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39848);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39849);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39850);array1[1][1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39851);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39852);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testMixedArray() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qvks4pur1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qvks4pur1(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39853);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39854);final Object array1[] = new Object[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39855);final Object array2[] = new Object[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39856);final Object array3[] = new Object[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39857);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39858)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39859)==0&false)); ++i) {{
            __CLR4_5_2u8eu8elvha7gup.R.inc(39860);array1[i] = new long[2];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39861);array2[i] = new long[2];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39862);array3[i] = new long[3];
            __CLR4_5_2u8eu8elvha7gup.R.inc(39863);for (int j = 0; (((j < 2)&&(__CLR4_5_2u8eu8elvha7gup.R.iget(39864)!=0|true))||(__CLR4_5_2u8eu8elvha7gup.R.iget(39865)==0&false)); ++j) {{
                __CLR4_5_2u8eu8elvha7gup.R.inc(39866);((long[]) array1[i])[j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39867);((long[]) array2[i])[j] = (i + 1) * (j + 1);
                __CLR4_5_2u8eu8elvha7gup.R.inc(39868);((long[]) array3[i])[j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2u8eu8elvha7gup.R.inc(39869);((long[]) array3[0])[2] = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39870);((long[]) array3[1])[2] = 1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39871);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39872);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39873);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39874);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39875);((long[]) array1[1])[1] = 200;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39876);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39877);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testObjectArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcpt73urq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcpt73urq(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39878);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39879);final TestObject[] array1 = new TestObject[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39880);array1[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39881);array1[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39882);final TestObject[] array2 = new TestObject[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39883);array2[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39884);array2[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39885);final TestObject[] array3 = new TestObject[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39886);array3[0] = new TestObject(4);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39887);array3[1] = new TestObject(5);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39888);array3[2] = new TestObject(6);
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39889);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39890);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39891);final Object obj3 = array3;
        
        __CLR4_5_2u8eu8elvha7gup.R.inc(39892);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39893);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39894);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39895);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39896);array1[1] = new TestObject(7);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39897);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39898);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testLongArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwc0mmusb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwc0mmusb(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39899);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39900);final long[] array1 = new long[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39901);array1[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39902);array1[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39903);final long[] array2 = new long[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39904);array2[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39905);array2[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39906);final long[] array3 = new long[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39907);array3[0] = 5L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39908);array3[1] = 6L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39909);array3[2] = 7L;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39910);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39911);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39912);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39913);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39914);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39915);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39916);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39917);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39918);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39919);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testIntArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b23hj1usw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b23hj1usw(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39920);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39921);final int[] array1 = new int[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39922);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39923);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39924);final int[] array2 = new int[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39925);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39926);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39927);final int[] array3 = new int[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39928);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39929);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39930);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39931);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39932);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39933);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39934);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39935);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39936);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39937);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39938);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39939);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39940);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testShortArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27gi80auth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27gi80auth(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39941);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39942);final short[] array1 = new short[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39943);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39944);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39945);final short[] array2 = new short[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39946);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39947);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39948);final short[] array3 = new short[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39949);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39950);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39951);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39952);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39953);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39954);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39955);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39956);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39957);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39958);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39959);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39960);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39961);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testCharArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1ukfsuu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1ukfsuu2(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39962);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39963);final char[] array1 = new char[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39964);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39965);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39966);final char[] array2 = new char[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39967);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39968);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39969);final char[] array3 = new char[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39970);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39971);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39972);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39973);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39974);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39975);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39976);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39977);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39978);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39979);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(39980);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39981);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39982);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testByteArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),39983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vn0kzquun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),39983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vn0kzquun(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(39983);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39984);final byte[] array1 = new byte[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39985);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39986);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39987);final byte[] array2 = new byte[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39988);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39989);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39990);final byte[] array3 = new byte[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(39991);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39992);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39993);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39994);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39995);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39996);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(39997);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39998);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(39999);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40000);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(40001);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40002);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40003);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testDoubleArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),40004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7e5j1uv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7e5j1uv8(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(40004);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40005);final double[] array1 = new double[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40006);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40007);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40008);final double[] array2 = new double[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40009);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40010);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40011);final double[] array3 = new double[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40012);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40013);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40014);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40015);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40016);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40017);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40018);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40019);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40020);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40021);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(40022);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40023);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40024);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testFloatArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),40025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eda87quvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eda87quvt(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(40025);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40026);final float[] array1 = new float[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40027);array1[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40028);array1[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40029);final float[] array2 = new float[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40030);array2[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40031);array2[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40032);final float[] array3 = new float[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40033);array3[0] = 5;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40034);array3[1] = 6;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40035);array3[2] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40036);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40037);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40038);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40039);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40040);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40041);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40042);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(40043);array1[1] = 7;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40044);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40045);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}

    @Test
    public void testBooleanArrayHiddenByObject() {__CLR4_5_2u8eu8elvha7gup.R.globalSliceStart(getClass().getName(),40046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zg9jjquwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2u8eu8elvha7gup.R.rethrow($CLV_t2$);}finally{__CLR4_5_2u8eu8elvha7gup.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zg9jjquwe(){try{__CLR4_5_2u8eu8elvha7gup.R.inc(40046);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40047);final boolean[] array1 = new boolean[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40048);array1[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40049);array1[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40050);final boolean[] array2 = new boolean[2];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40051);array2[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40052);array2[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40053);final boolean[] array3 = new boolean[3];
        __CLR4_5_2u8eu8elvha7gup.R.inc(40054);array3[0] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40055);array3[1] = false;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40056);array3[2] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40057);final Object obj1 = array1;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40058);final Object obj2 = array2;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40059);final Object obj3 = array3;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40060);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40061);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40062);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40063);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_5_2u8eu8elvha7gup.R.inc(40064);array1[1] = true;
        __CLR4_5_2u8eu8elvha7gup.R.inc(40065);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_5_2u8eu8elvha7gup.R.inc(40066);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_5_2u8eu8elvha7gup.R.flushNeeded();}}
  
 }
