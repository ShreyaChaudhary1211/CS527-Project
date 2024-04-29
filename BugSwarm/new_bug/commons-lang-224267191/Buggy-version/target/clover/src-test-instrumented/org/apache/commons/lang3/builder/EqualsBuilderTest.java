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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.
 */
public class EqualsBuilderTest {static class __CLR4_5_2v7ev7elvha7h3e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,41319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject {
        private int a;
        public TestObject() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40442);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        public TestObject(final int a) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40443);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40444);this.a = a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40445);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40446);if ((((o == null)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40447)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40448)==0&false))) {{ __CLR4_5_2v7ev7elvha7h3e.R.inc(40449);return false; }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40450);if ((((o == this)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40451)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40452)==0&false))) {{ __CLR4_5_2v7ev7elvha7h3e.R.inc(40453);return true; }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40454);if ((((o.getClass() != getClass())&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40455)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40456)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40457);return false;
            }

            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40458);final TestObject rhs = (TestObject) o;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40459);return a == rhs.a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40460);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40461);return a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40462);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40463);this.a = a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40464);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40465);return a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_5_2v7ev7elvha7h3e.R.inc(40467);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40466);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_5_2v7ev7elvha7h3e.R.inc(40469);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40468);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40470);this.b = b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40471);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40472);if ((((o == null)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40473)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40474)==0&false))) {{ __CLR4_5_2v7ev7elvha7h3e.R.inc(40475);return false; }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40476);if ((((o == this)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40477)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40478)==0&false))) {{ __CLR4_5_2v7ev7elvha7h3e.R.inc(40479);return true; }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40480);if ((((o.getClass() != getClass())&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40481)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40482)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40483);return false;
            }

            }__CLR4_5_2v7ev7elvha7h3e.R.inc(40484);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40485);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40486);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40487);return b *17 + super.hashCode();
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public void setB(final int b) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40488);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40489);this.b = b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40490);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40491);return b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }
    
    static class TestEmptySubObject extends TestObject {
        public TestEmptySubObject(final int a) {
            super(a);__CLR4_5_2v7ev7elvha7h3e.R.inc(40493);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40492);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestTSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTSubObject(final int a, final int t) {
            super(a);__CLR4_5_2v7ev7elvha7h3e.R.inc(40495);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40494);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40496);this.t = t;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestTTSubObject extends TestTSubObject {
        @SuppressWarnings("unused")
        private transient int tt;
        public TestTTSubObject(final int a, final int t, final int tt) {
            super(a, t);__CLR4_5_2v7ev7elvha7h3e.R.inc(40498);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40497);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40499);this.tt = tt;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestTTLeafObject extends TestTTSubObject {
        @SuppressWarnings("unused")
        private final int leafValue;
        public TestTTLeafObject(final int a, final int t, final int tt, final int leafValue) {
            super(a, t, tt);__CLR4_5_2v7ev7elvha7h3e.R.inc(40501);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40500);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40502);this.leafValue = leafValue;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestTSubObject2 extends TestObject {
        private transient int t;
        public TestTSubObject2(final int a, final int t) {
            super(a);__CLR4_5_2v7ev7elvha7h3e.R.inc(40504);try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40503);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        public int getT() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40505);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40506);return t;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        public void setT(final int t) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40507);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40508);this.t = t;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestRecursiveObject {
        private final TestRecursiveInnerObject a;
        private final TestRecursiveInnerObject b;
        private int z;
        
        public TestRecursiveObject(final TestRecursiveInnerObject a, 
                final TestRecursiveInnerObject b, final int z) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40509);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40510);this.a = a;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40511);this.b = b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public TestRecursiveInnerObject getA() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40512);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40513);return a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public TestRecursiveInnerObject getB() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40514);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40515);return b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getZ() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40516);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40517);return z;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
    }

    static class TestRecursiveInnerObject {
        private final int n;
        public TestRecursiveInnerObject(final int n) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40518);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40519);this.n = n;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public int getN() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40520);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40521);return n;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    static class TestRecursiveCycleObject {
        private TestRecursiveCycleObject cycle;
        private final int n;
        public TestRecursiveCycleObject(final int n) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40522);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40523);this.n = n;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40524);this.cycle = this;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public TestRecursiveCycleObject(final TestRecursiveCycleObject cycle, final int n) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40525);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40526);this.n = n;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40527);this.cycle = cycle;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public int getN() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40528);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40529);return n;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public TestRecursiveCycleObject getCycle() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40530);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40531);return cycle;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
        
        public void setCycle(final TestRecursiveCycleObject cycle) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40532);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40533);this.cycle = cycle;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    @Test
    public void testReflectionEquals() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29weq0zv9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29weq0zv9y(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40534);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40535);final TestObject o1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40536);final TestObject o2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40537);assertTrue(EqualsBuilder.reflectionEquals(o1, o1));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40538);assertTrue(!EqualsBuilder.reflectionEquals(o1, o2));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40539);o2.setA(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40540);assertTrue(EqualsBuilder.reflectionEquals(o1, o2));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40541);assertTrue(!EqualsBuilder.reflectionEquals(o1, this));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40542);assertTrue(!EqualsBuilder.reflectionEquals(o1, null));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40543);assertTrue(!EqualsBuilder.reflectionEquals(null, o2));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40544);assertTrue(EqualsBuilder.reflectionEquals(null, null));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyEquals() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8ekwyva9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8ekwyva9(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40545);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40546);testReflectionHierarchyEquals(false);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40547);testReflectionHierarchyEquals(true);
        // Transients
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40548);assertTrue(EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), true));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40549);assertTrue(EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), false));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40550);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 0, 0, 4), new TestTTLeafObject(1, 2, 3, 4), true));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40551);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 0), true));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40552);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(0, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), true));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    private void testReflectionHierarchyEquals(final boolean testTransients) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40553);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40554);final TestObject to1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40555);final TestObject to1Bis = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40556);final TestObject to1Ter = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40557);final TestObject to2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40558);final TestEmptySubObject teso = new TestEmptySubObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40559);final TestTSubObject ttso = new TestTSubObject(4, 1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40560);final TestTTSubObject tttso = new TestTTSubObject(4, 1, 2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40561);final TestTTLeafObject ttlo = new TestTTLeafObject(4, 1, 2, 3);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40562);final TestSubObject tso1 = new TestSubObject(1, 4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40563);final TestSubObject tso1bis = new TestSubObject(1, 4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40564);final TestSubObject tso1ter = new TestSubObject(1, 4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40565);final TestSubObject tso2 = new TestSubObject(2, 5);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40566);testReflectionEqualsEquivalenceRelationship(to1, to1Bis, to1Ter, to2, new TestObject(), testTransients);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40567);testReflectionEqualsEquivalenceRelationship(tso1, tso1bis, tso1ter, tso2, new TestSubObject(), testTransients);

        // More sanity checks:

        // same values
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40568);assertTrue(EqualsBuilder.reflectionEquals(ttlo, ttlo, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40569);assertTrue(EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 10), testTransients));
        // same super values, diff sub values
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40570);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 11), testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40571);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 11), new TestSubObject(1, 10), testTransients));
        // diff super values, same sub values
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40572);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestSubObject(1, 10), testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40573);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(0, 10), testTransients));

        // mix super and sub types: equals
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40574);assertTrue(EqualsBuilder.reflectionEquals(to1, teso, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40575);assertTrue(EqualsBuilder.reflectionEquals(teso, to1, testTransients));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40576);assertTrue(EqualsBuilder.reflectionEquals(to1, ttso, false)); // Force testTransients = false for this assert
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40577);assertTrue(EqualsBuilder.reflectionEquals(ttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40578);assertTrue(EqualsBuilder.reflectionEquals(to1, tttso, false)); // Force testTransients = false for this assert
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40579);assertTrue(EqualsBuilder.reflectionEquals(tttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40580);assertTrue(EqualsBuilder.reflectionEquals(ttso, tttso, false)); // Force testTransients = false for this assert
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40581);assertTrue(EqualsBuilder.reflectionEquals(tttso, ttso, false)); // Force testTransients = false for this assert

        // mix super and sub types: NOT equals
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40582);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestEmptySubObject(1), testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40583);assertTrue(!EqualsBuilder.reflectionEquals(new TestEmptySubObject(1), new TestObject(0), testTransients));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40584);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestTSubObject(1, 1), testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40585);assertTrue(!EqualsBuilder.reflectionEquals(new TestTSubObject(1, 1), new TestObject(0), testTransients));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40586);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(1), new TestSubObject(0, 10), testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40587);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestObject(1), testTransients));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40588);assertTrue(!EqualsBuilder.reflectionEquals(to1, ttlo));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40589);assertTrue(!EqualsBuilder.reflectionEquals(tso1, this));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    /**
     * Equivalence relationship tests inspired by "Effective Java":
     * <ul>
     * <li>reflection</li>
     * <li>symmetry</li>
     * <li>transitive</li>
     * <li>consistency</li>
     * <li>non-null reference</li>
     * </ul>
     * @param to a TestObject
     * @param toBis a TestObject, equal to to and toTer
     * @param toTer Left hand side, equal to to and toBis
     * @param to2 a different TestObject
     * @param oToChange a TestObject that will be changed
     * @param testTransients whether to test transient instance variables 
     */
    private void testReflectionEqualsEquivalenceRelationship(
        final TestObject to,
        final TestObject toBis,
        final TestObject toTer,
        final TestObject to2,
        final TestObject oToChange,
        final boolean testTransients) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40590);

        // reflection test
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40591);assertTrue(EqualsBuilder.reflectionEquals(to, to, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40592);assertTrue(EqualsBuilder.reflectionEquals(to2, to2, testTransients));

        // symmetry test
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40593);assertTrue(EqualsBuilder.reflectionEquals(to, toBis, testTransients) && EqualsBuilder.reflectionEquals(toBis, to, testTransients));

        // transitive test
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40594);assertTrue(
            EqualsBuilder.reflectionEquals(to, toBis, testTransients)
                && EqualsBuilder.reflectionEquals(toBis, toTer, testTransients)
                && EqualsBuilder.reflectionEquals(to, toTer, testTransients));

        // consistency test
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40595);oToChange.setA(to.getA());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40596);if ((((oToChange instanceof TestSubObject)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40597)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40598)==0&false))) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40599);((TestSubObject) oToChange).setB(((TestSubObject) to).getB());
        }
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40600);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40601);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40602);oToChange.setA(to.getA() + 1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40603);if ((((oToChange instanceof TestSubObject)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40604)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40605)==0&false))) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40606);((TestSubObject) oToChange).setB(((TestSubObject) to).getB() + 1);
        }
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40607);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40608);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));

        // non-null reference test
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40609);assertTrue(!EqualsBuilder.reflectionEquals(to, null, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40610);assertTrue(!EqualsBuilder.reflectionEquals(to2, null, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40611);assertTrue(!EqualsBuilder.reflectionEquals(null, to, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40612);assertTrue(!EqualsBuilder.reflectionEquals(null, to2, testTransients));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40613);assertTrue(EqualsBuilder.reflectionEquals(null, null, testTransients));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testSuper() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28bo7cgvc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28bo7cgvc6(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40614);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40615);final TestObject o1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40616);final TestObject o2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40617);assertTrue(new EqualsBuilder().appendSuper(true).append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40618);assertFalse(new EqualsBuilder().appendSuper(false).append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40619);assertFalse(new EqualsBuilder().appendSuper(true).append(o1, o2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40620);assertFalse(new EqualsBuilder().appendSuper(false).append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0vcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0vcd(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40621);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40622);final TestObject o1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40623);final TestObject o2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40624);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40625);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40626);o2.setA(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40627);assertTrue(new EqualsBuilder().append(o1, o2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40628);assertTrue(!new EqualsBuilder().append(o1, this).isEquals());
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40629);assertTrue(!new EqualsBuilder().append(o1, null).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40630);assertTrue(!new EqualsBuilder().append(null, o2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40631);assertTrue(new EqualsBuilder().append((Object) null, null).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvdhb0vco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvdhb0vco(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40632);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40633);final TestObject o1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40634);final TestObject o2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40635);assertEquals(Boolean.TRUE, new EqualsBuilder().append(o1, o1).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40636);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, o2).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40637);o2.setA(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40638);assertEquals(Boolean.TRUE, new EqualsBuilder().append(o1, o2).build());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40639);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, this).build());
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40640);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, null).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40641);assertEquals(Boolean.FALSE, new EqualsBuilder().append(null, o2).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40642);assertEquals(Boolean.TRUE, new EqualsBuilder().append((Object) null, null).build());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObjectRecursive() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29zqbxkvcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectRecursive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29zqbxkvcz(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40643);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40644);final TestRecursiveInnerObject i1_1 = new TestRecursiveInnerObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40645);final TestRecursiveInnerObject i1_2 = new TestRecursiveInnerObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40646);final TestRecursiveInnerObject i2_1 = new TestRecursiveInnerObject(2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40647);final TestRecursiveInnerObject i2_2 = new TestRecursiveInnerObject(2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40648);final TestRecursiveInnerObject i3 = new TestRecursiveInnerObject(3);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40649);final TestRecursiveInnerObject i4 = new TestRecursiveInnerObject(4);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40650);final TestRecursiveObject o1_a = new TestRecursiveObject(i1_1, i2_1, 1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40651);final TestRecursiveObject o1_b = new TestRecursiveObject(i1_2, i2_2, 1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40652);final TestRecursiveObject o2 = new TestRecursiveObject(i3, i4, 2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40653);final TestRecursiveObject oNull = new TestRecursiveObject(null, null, 2);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40654);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_a).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40655);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_b).isEquals());
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40656);assertFalse(new EqualsBuilder().setTestRecursive(true).append(o1_a, o2).isEquals());
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40657);assertTrue(new EqualsBuilder().setTestRecursive(true).append(oNull, oNull).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40658);assertFalse(new EqualsBuilder().setTestRecursive(true).append(o1_a, oNull).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObjectRecursiveCycleSelfreference() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2924tunvdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectRecursiveCycleSelfreference",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2924tunvdf(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40659);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40660);final TestRecursiveCycleObject o1_a = new TestRecursiveCycleObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40661);final TestRecursiveCycleObject o1_b = new TestRecursiveCycleObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40662);final TestRecursiveCycleObject o2 = new TestRecursiveCycleObject(2);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40663);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_a).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40664);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_b).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40665);assertFalse(new EqualsBuilder().setTestRecursive(true).append(o1_a, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObjectRecursiveCycle() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zky8cvdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectRecursiveCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zky8cvdm(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40666);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40667);final TestRecursiveCycleObject o1_a = new TestRecursiveCycleObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40668);final TestRecursiveCycleObject i1_a = new TestRecursiveCycleObject(o1_a, 100);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40669);o1_a.setCycle(i1_a);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40670);final TestRecursiveCycleObject o1_b = new TestRecursiveCycleObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40671);final TestRecursiveCycleObject i1_b = new TestRecursiveCycleObject(o1_b, 100);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40672);o1_b.setCycle(i1_b);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40673);final TestRecursiveCycleObject o2 = new TestRecursiveCycleObject(2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40674);final TestRecursiveCycleObject i2 = new TestRecursiveCycleObject(o1_b, 200);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40675);o2.setCycle(i2);
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40676);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_a).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40677);assertTrue(new EqualsBuilder().setTestRecursive(true).append(o1_a, o1_b).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40678);assertFalse(new EqualsBuilder().setTestRecursive(true).append(o1_a, o2).isEquals());
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40679);assertTrue(EqualsBuilder.reflectionEquals(o1_a, o1_b, false, null, true));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40680);assertFalse(EqualsBuilder.reflectionEquals(o1_a, o2, false, null, true));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzve1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzve1(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40681);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40682);final long o1 = 1L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40683);final long o2 = 2L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40684);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40685);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testInt() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0ve6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0ve6(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40686);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40687);final int o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40688);final int o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40689);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40690);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exs2r3veb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exs2r3veb(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40691);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40692);final short o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40693);final short o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40694);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40695);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vveg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vveg(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40696);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40697);final char o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40698);final char o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40699);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40700);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzvel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzvel(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40701);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40702);final byte o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40703);final byte o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40704);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40705);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testDouble() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hfze2veq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hfze2veq(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40706);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40707);final double o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40708);final double o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40709);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40710);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40711);assertTrue(!new EqualsBuilder().append(o1, Double.NaN).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40712);assertTrue(new EqualsBuilder().append(Double.NaN, Double.NaN).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40713);assertTrue(new EqualsBuilder().append(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuf8q9vey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuf8q9vey(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40714);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40715);final float o1 = 1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40716);final float o2 = 2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40717);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40718);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40719);assertTrue(!new EqualsBuilder().append(o1, Float.NaN).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40720);assertTrue(new EqualsBuilder().append(Float.NaN, Float.NaN).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40721);assertTrue(new EqualsBuilder().append(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testAccessors() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hde3s1vf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hde3s1vf6(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40722);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40723);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40724);assertTrue(equalsBuilder.isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40725);equalsBuilder.setEquals(true);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40726);assertTrue(equalsBuilder.isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40727);equalsBuilder.setEquals(false);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40728);assertFalse(equalsBuilder.isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testReset() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jq2kcvfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jq2kcvfd(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40729);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40730);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40731);assertTrue(equalsBuilder.isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40732);equalsBuilder.setEquals(false);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40733);assertFalse(equalsBuilder.isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40734);equalsBuilder.reset();
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40735);assertTrue(equalsBuilder.isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    
    @Test
    public void testBoolean() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1vfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1vfk(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40736);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40737);final boolean o1 = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40738);final boolean o2 = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40739);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40740);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7vfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7vfp(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40741);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40742);TestObject[] obj1 = new TestObject[3];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40743);obj1[0] = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40744);obj1[1] = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40745);obj1[2] = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40746);TestObject[] obj2 = new TestObject[3];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40747);obj2[0] = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40748);obj2[1] = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40749);obj2[2] = null;
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40750);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40751);assertTrue(new EqualsBuilder().append(obj2, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40752);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40753);obj1[1].setA(6);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40754);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40755);obj1[1].setA(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40756);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40757);obj1[2] = obj1[1];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40758);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40759);obj1[2] = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40760);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
                       
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40761);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40762);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40763);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40764);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6vgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6vgd(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40765);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40766);long[] obj1 = new long[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40767);obj1[0] = 5L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40768);obj1[1] = 6L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40769);long[] obj2 = new long[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40770);obj2[0] = 5L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40771);obj2[1] = 6L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40772);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40773);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40774);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40775);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40776);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40777);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40778);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40779);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28w0so3vgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28w0so3vgs(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40780);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40781);int[] obj1 = new int[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40782);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40783);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40784);int[] obj2 = new int[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40785);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40786);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40787);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40788);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40789);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40790);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40791);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40792);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40793);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40794);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqn45yvh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqn45yvh7(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40795);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40796);short[] obj1 = new short[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40797);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40798);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40799);short[] obj2 = new short[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40800);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40801);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40802);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40803);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40804);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40805);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40806);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40807);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40808);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40809);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0bza0vhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0bza0vhm(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40810);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40811);char[] obj1 = new char[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40812);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40813);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40814);char[] obj2 = new char[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40815);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40816);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40817);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40818);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40819);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40820);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40821);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40822);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40823);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40824);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mhe7kqvi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mhe7kqvi1(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40825);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40826);byte[] obj1 = new byte[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40827);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40828);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40829);byte[] obj2 = new byte[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40830);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40831);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40832);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40833);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40834);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40835);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40836);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40837);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40838);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40839);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6ks4jvig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6ks4jvig(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40840);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40841);double[] obj1 = new double[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40842);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40843);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40844);double[] obj2 = new double[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40845);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40846);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40847);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40848);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40849);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40850);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40851);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40852);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40853);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40854);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maw6iyviv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maw6iyviv(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40855);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40856);float[] obj1 = new float[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40857);obj1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40858);obj1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40859);float[] obj2 = new float[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40860);obj2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40861);obj2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40862);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40863);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40864);obj1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40865);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40866);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40867);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40868);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40869);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rzd0qvja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rzd0qvja(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40870);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40871);boolean[] obj1 = new boolean[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40872);obj1[0] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40873);obj1[1] = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40874);boolean[] obj2 = new boolean[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40875);obj2[0] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40876);obj2[1] = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40877);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40878);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40879);obj1[1] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40880);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(40881);obj2 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40882);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40883);obj1 = null;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40884);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiLongArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f7d7lpvjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f7d7lpvjp(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40885);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40886);final long[][] array1 = new long[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40887);final long[][] array2 = new long[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40888);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40889)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40890)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40891);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40892)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40893)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40894);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40895);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40896);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40897);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40898);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40899);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiIntArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ol03cvk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ol03cvk4(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40900);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40901);final int[][] array1 = new int[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40902);final int[][] array2 = new int[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40903);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40904)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40905)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40906);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40907)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40908)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40909);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40910);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40911);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40912);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40913);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40914);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiShortArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nu5uzvkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nu5uzvkj(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40915);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40916);final short[][] array1 = new short[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40917);final short[][] array2 = new short[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40918);for (short i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40919)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40920)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40921);for (short j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40922)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40923)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40924);array1[i][j] = i;
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40925);array2[i][j] = i;
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40926);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40927);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40928);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40929);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiCharArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25e9ml9vky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25e9ml9vky(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40930);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40931);final char[][] array1 = new char[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40932);final char[][] array2 = new char[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40933);for (char i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40934)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40935)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40936);for (char j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40937)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40938)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40939);array1[i][j] = i;
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40940);array2[i][j] = i;
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40941);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40942);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40943);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40944);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiByteArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b548j5vld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b548j5vld(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40945);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40946);final byte[][] array1 = new byte[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40947);final byte[][] array2 = new byte[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40948);for (byte i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40949)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40950)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40951);for (byte j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40952)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40953)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40954);array1[i][j] = i;
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40955);array2[i][j] = i;
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40956);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40957);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40958);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40959);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiFloatArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pnex57vls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pnex57vls(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40960);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40961);final float[][] array1 = new float[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40962);final float[][] array2 = new float[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40963);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40964)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40965)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40966);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40967)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40968)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40969);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40970);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40971);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40972);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40973);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40974);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiDoubleArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2radrtkvm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2radrtkvm7(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40975);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40976);final double[][] array1 = new double[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40977);final double[][] array2 = new double[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40978);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40979)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40980)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40981);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40982)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40983)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40984);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40985);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(40986);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40987);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40988);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40989);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMultiBooleanArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),40990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2efr9kxvmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2efr9kxvmm(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(40990);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40991);final boolean[][] array1 = new boolean[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40992);final boolean[][] array2 = new boolean[2][2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(40993);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40994)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40995)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(40996);for (int j = 0; (((j < array1[0].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(40997)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(40998)==0&false)); j++) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(40999);array1[i][j] = i == 1 || j == 1;
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41000);array2[i][j] = i == 1 || j == 1;
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(41001);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41002);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41003);array1[1][1] = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41004);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
        
        // compare 1 dim to 2.
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41005);final boolean[] array3 = new boolean[]{true, true};
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41006);assertFalse(new EqualsBuilder().append(array1, array3).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41007);assertFalse(new EqualsBuilder().append(array3, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41008);assertFalse(new EqualsBuilder().append(array2, array3).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41009);assertFalse(new EqualsBuilder().append(array3, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testRaggedArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22rmuiovn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22rmuiovn6(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41010);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41011);final long array1[][] = new long[2][];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41012);final long array2[][] = new long[2][];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41013);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41014)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41015)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41016);array1[i] = new long[2];
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41017);array2[i] = new long[2];
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41018);for (int j = 0; (((j < array1[i].length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41019)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41020)==0&false)); ++j) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41021);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41022);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(41023);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41024);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41025);array1[1][1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41026);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testMixedArray() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qvks4pvnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qvks4pvnn(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41027);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41028);final Object array1[] = new Object[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41029);final Object array2[] = new Object[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41030);for (int i = 0; (((i < array1.length)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41031)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41032)==0&false)); ++i) {{
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41033);array1[i] = new long[2];
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41034);array2[i] = new long[2];
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41035);for (int j = 0; (((j < 2)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41036)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41037)==0&false)); ++j) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41038);((long[]) array1[i])[j] = (i + 1) * (j + 1);
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41039);((long[]) array2[i])[j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_5_2v7ev7elvha7h3e.R.inc(41040);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41041);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41042);((long[]) array1[1])[1] = 0;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41043);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testObjectArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcpt73vo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcpt73vo4(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41044);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41045);final TestObject[] array1 = new TestObject[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41046);array1[0] = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41047);array1[1] = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41048);final TestObject[] array2 = new TestObject[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41049);array2[0] = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41050);array2[1] = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41051);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41052);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41053);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41054);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41055);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41056);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41057);array1[1].setA(6);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41058);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testLongArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pwc0mmvoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pwc0mmvoj(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41059);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41060);final long[] array1 = new long[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41061);array1[0] = 5L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41062);array1[1] = 6L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41063);final long[] array2 = new long[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41064);array2[0] = 5L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41065);array2[1] = 6L;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41066);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41067);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41068);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41069);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41070);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41071);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41072);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41073);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testIntArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b23hj1voy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b23hj1voy(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41074);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41075);final int[] array1 = new int[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41076);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41077);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41078);final int[] array2 = new int[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41079);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41080);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41081);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41082);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41083);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41084);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41085);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41086);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41087);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41088);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testShortArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27gi80avpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27gi80avpd(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41089);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41090);final short[] array1 = new short[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41091);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41092);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41093);final short[] array2 = new short[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41094);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41095);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41096);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41097);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41098);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41099);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41100);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41101);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41102);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41103);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testCharArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1ukfsvps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1ukfsvps(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41104);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41105);final char[] array1 = new char[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41106);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41107);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41108);final char[] array2 = new char[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41109);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41110);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41111);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41112);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41113);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41114);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41115);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41116);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41117);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41118);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testByteArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vn0kzqvq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vn0kzqvq7(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41119);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41120);final byte[] array1 = new byte[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41121);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41122);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41123);final byte[] array2 = new byte[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41124);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41125);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41126);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41127);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41128);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41129);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41130);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41131);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41132);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41133);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testDoubleArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x7e5j1vqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x7e5j1vqm(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41134);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41135);final double[] array1 = new double[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41136);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41137);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41138);final double[] array2 = new double[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41139);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41140);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41141);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41142);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41143);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41144);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41145);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41146);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41147);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41148);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testFloatArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eda87qvr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eda87qvr1(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41149);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41150);final float[] array1 = new float[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41151);array1[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41152);array1[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41153);final float[] array2 = new float[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41154);array2[0] = 5;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41155);array2[1] = 6;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41156);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41157);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41158);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41159);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41160);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41161);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41162);array1[1] = 7;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41163);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testBooleanArrayHiddenByObject() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zg9jjqvrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zg9jjqvrg(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41164);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41165);final boolean[] array1 = new boolean[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41166);array1[0] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41167);array1[1] = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41168);final boolean[] array2 = new boolean[2];
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41169);array2[0] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41170);array2[1] = false;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41171);final Object obj1 = array1;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41172);final Object obj2 = array2;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41173);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41174);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41175);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41176);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41177);array1[1] = true;
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41178);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    
    public static class TestACanEqualB {
        private final int a;

        public TestACanEqualB(final int a) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41179);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41180);this.a = a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41181);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41182);if ((((o == this)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41183)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41184)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41185);return true;
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41186);if ((((o instanceof TestACanEqualB)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41187)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41188)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41189);return this.a == ((TestACanEqualB) o).getA();
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41190);if ((((o instanceof TestBCanEqualA)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41191)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41192)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41193);return this.a == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41194);return false;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41195);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41196);return a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41197);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41198);return this.a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    public static class TestBCanEqualA {
        private final int b;

        public TestBCanEqualA(final int b) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41199);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41200);this.b = b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41201);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41202);if ((((o == this)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41203)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41204)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41205);return true;
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41206);if ((((o instanceof TestACanEqualB)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41207)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41208)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41209);return this.b == ((TestACanEqualB) o).getA();
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41210);if ((((o instanceof TestBCanEqualA)&&(__CLR4_5_2v7ev7elvha7h3e.R.iget(41211)!=0|true))||(__CLR4_5_2v7ev7elvha7h3e.R.iget(41212)==0&false))) {{
                __CLR4_5_2v7ev7elvha7h3e.R.inc(41213);return this.b == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_5_2v7ev7elvha7h3e.R.inc(41214);return false;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41215);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41216);return b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41217);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41218);return this.b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }
    
    /**
     * Tests two instances of classes that can be equal and that are not "related". The two classes are not subclasses
     * of each other and do not share a parent aside from Object.
     * See http://issues.apache.org/bugzilla/show_bug.cgi?id=33069
     */
    @Test
    public void testUnrelatedClasses() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pb7ywjvsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pb7ywjvsz(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41219);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41220);final Object[] x = new Object[]{new TestACanEqualB(1)};
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41221);final Object[] y = new Object[]{new TestBCanEqualA(1)};

        // sanity checks:
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41222);assertTrue(Arrays.equals(x, x));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41223);assertTrue(Arrays.equals(y, y));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41224);assertTrue(Arrays.equals(x, y));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41225);assertTrue(Arrays.equals(y, x));
        // real tests:
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41226);assertTrue(x[0].equals(x[0]));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41227);assertTrue(y[0].equals(y[0]));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41228);assertTrue(x[0].equals(y[0]));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41229);assertTrue(y[0].equals(x[0]));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41230);assertTrue(new EqualsBuilder().append(x, x).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41231);assertTrue(new EqualsBuilder().append(y, y).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41232);assertTrue(new EqualsBuilder().append(x, y).isEquals());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41233);assertTrue(new EqualsBuilder().append(y, x).isEquals());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    
    /**
     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id=33067
     */
    @Test
    public void testNpeForNullElement() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fgbl7gvte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fgbl7gvte(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41234);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41235);final Object[] x1 = new Object[] { Integer.valueOf(1), null, Integer.valueOf(3) };
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41236);final Object[] x2 = new Object[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) };

        // causes an NPE in 2.0 according to:
        // http://issues.apache.org/bugzilla/show_bug.cgi?id=33067
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41237);new EqualsBuilder().append(x1, x2);
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testReflectionEqualsExcludeFields() throws Exception {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0tny6vti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0tny6vti() throws Exception{try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41238);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41239);final TestObjectWithMultipleFields x1 = new TestObjectWithMultipleFields(1, 2, 3);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41240);final TestObjectWithMultipleFields x2 = new TestObjectWithMultipleFields(1, 3, 4);

        // not equal when including all fields
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41241);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2));

        // doesn't barf on null, empty array, or non-existent field, but still tests as not equal
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41242);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, (String[]) null));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41243);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {}));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41244);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"xxx"}));

        // not equal if only one of the differing fields excluded
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41245);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"two"}));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41246);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"three"}));

        // equal if both differing fields excluded
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41247);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"two", "three"}));

        // still equal as long as both differing fields are among excluded
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41248);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"one", "two", "three"}));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41249);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"one", "two", "three", "xxx"}));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private final TestObject one;
        @SuppressWarnings("unused")
        private final TestObject two;
        @SuppressWarnings("unused")
        private final TestObject three;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41250);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41251);this.one = new TestObject(one);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41252);this.two = new TestObject(two);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41253);this.three = new TestObject(three);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }
    
    /**
     * Test cyclical object references which cause a StackOverflowException if
     * not handled properly. s. LANG-606
     */
    @Test
    public void testCyclicalObjectReferences() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hbrvzwvty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41254,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hbrvzwvty(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41254);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41255);final TestObjectReference refX1 = new TestObjectReference(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41256);final TestObjectReference x1 = new TestObjectReference(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41257);x1.setObjectReference(refX1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41258);refX1.setObjectReference(x1);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41259);final TestObjectReference refX2 = new TestObjectReference(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41260);final TestObjectReference x2 = new TestObjectReference(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41261);x2.setObjectReference(refX2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41262);refX2.setObjectReference(x2);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41263);final TestObjectReference refX3 = new TestObjectReference(2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41264);final TestObjectReference x3 = new TestObjectReference(2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41265);x3.setObjectReference(refX3);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41266);refX3.setObjectReference(x3);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41267);assertTrue(x1.equals(x2));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41268);assertNull(EqualsBuilder.getRegistry());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41269);assertFalse(x1.equals(x3));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41270);assertNull(EqualsBuilder.getRegistry());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41271);assertFalse(x2.equals(x3));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41272);assertNull(EqualsBuilder.getRegistry());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    static class TestObjectReference {
        @SuppressWarnings("unused")
        private TestObjectReference reference;
        @SuppressWarnings("unused")
        private final TestObject one;

        public TestObjectReference(final int one) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41273);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41274);this.one = new TestObject(one);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public void setObjectReference(final TestObjectReference reference) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41275);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41276);this.reference = reference;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41277);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41278);return EqualsBuilder.reflectionEquals(this, obj);
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }
    
    @Test
    public void testReflectionArrays() throws Exception {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27g1p5uvun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionArrays",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27g1p5uvun() throws Exception{try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41279);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41280);final TestObject one = new TestObject(1);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41281);final TestObject two = new TestObject(2);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41282);final Object[] o1 = new Object[] { one };
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41283);final Object[] o2 = new Object[] { two };
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41284);final Object[] o3 = new Object[] { one };

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41285);assertTrue(!EqualsBuilder.reflectionEquals(o1, o2));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41286);assertTrue(EqualsBuilder.reflectionEquals(o1, o1));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41287);assertTrue(EqualsBuilder.reflectionEquals(o1, o3));
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41288);final double[] d1 = { 0, 1 };
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41289);final double[] d2 = { 2, 3 };
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41290);final double[] d3 = { 0, 1 };
        
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41291);assertTrue(!EqualsBuilder.reflectionEquals(d1, d2));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41292);assertTrue(EqualsBuilder.reflectionEquals(d1, d1));
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41293);assertTrue(EqualsBuilder.reflectionEquals(d1, d3));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    static class TestObjectEqualsExclude {
        @EqualsExclude
        private final int a;
        private final int b;

        public TestObjectEqualsExclude(final int a, final int b) {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41294);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41295);this.a = a;
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41296);this.b = b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41297);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41298);return a;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41299);
            __CLR4_5_2v7ev7elvha7h3e.R.inc(41300);return b;
        }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}
    }

    @Test
    public void testToEqualsExclude() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2apxlv9vv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testToEqualsExclude",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2apxlv9vv9(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41301);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41302);TestObjectEqualsExclude one = new TestObjectEqualsExclude(1, 2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41303);TestObjectEqualsExclude two = new TestObjectEqualsExclude(1, 3);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41304);assertFalse(EqualsBuilder.reflectionEquals(one, two));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41305);one = new TestObjectEqualsExclude(1, 2);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41306);two = new TestObjectEqualsExclude(2, 2);

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41307);assertTrue(EqualsBuilder.reflectionEquals(one, two));
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

    @Test
    public void testReflectionAppend() {__CLR4_5_2v7ev7elvha7h3e.R.globalSliceStart(getClass().getName(),41308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284fdxavvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v7ev7elvha7h3e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v7ev7elvha7h3e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionAppend",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284fdxavvg(){try{__CLR4_5_2v7ev7elvha7h3e.R.inc(41308);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41309);assertTrue(EqualsBuilder.reflectionEquals(null, null));

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41310);final TestObject o1 = new TestObject(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41311);final TestObject o2 = new TestObject(5);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41312);assertTrue(new EqualsBuilder().reflectionAppend(o1, o1).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41313);assertFalse(new EqualsBuilder().reflectionAppend(o1, o2).build());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41314);o2.setA(4);
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41315);assertTrue(new EqualsBuilder().reflectionAppend(o1, o2).build());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41316);assertFalse(new EqualsBuilder().reflectionAppend(o1, this).build());

        __CLR4_5_2v7ev7elvha7h3e.R.inc(41317);assertFalse(new EqualsBuilder().reflectionAppend(o1, null).build());
        __CLR4_5_2v7ev7elvha7h3e.R.inc(41318);assertFalse(new EqualsBuilder().reflectionAppend(null, o2).build());
    }finally{__CLR4_5_2v7ev7elvha7h3e.R.flushNeeded();}}

}

