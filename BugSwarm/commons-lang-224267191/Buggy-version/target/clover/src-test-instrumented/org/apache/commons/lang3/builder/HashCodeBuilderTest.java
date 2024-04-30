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
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.
 */
public class HashCodeBuilderTest {static class __CLR4_5_2vwvvwvlvha7h7m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,41678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public int hashCode() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41359);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41360);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public int hashCode() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41361);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41362);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    // -----------------------------------------------------------------------

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorExZero() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2paatqivwz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,90,101,114,111,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorExZero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41363,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2paatqivwz(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41363);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41364);new HashCodeBuilder(0, 0);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorExEvenFirst() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289cv0ivx1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,69,118,101,110,70,105,114,115,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorExEvenFirst",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289cv0ivx1(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41365);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41366);new HashCodeBuilder(2, 3);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void testConstructorExEvenSecond() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ago0gvx3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,69,118,101,110,83,101,99,111,110,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorExEvenSecond",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ago0gvx3(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41367);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41368);new HashCodeBuilder(3, 2);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorExEvenNegative() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvht69vx5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,69,118,101,110,78,101,103,97,116,105,118,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorExEvenNegative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvht69vx5(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41369);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41370);new HashCodeBuilder(-2, -2);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    static class TestObject {
        private int a;

        public TestObject(final int a) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41371);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41372);this.a = a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41373);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41374);if ((((o == this)&&(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41375)!=0|true))||(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41376)==0&false))) {{
                __CLR4_5_2vwvvwvlvha7h7m.R.inc(41377);return true;
            }
            }__CLR4_5_2vwvvwvlvha7h7m.R.inc(41378);if ((((!(o instanceof TestObject))&&(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41379)!=0|true))||(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41380)==0&false))) {{
                __CLR4_5_2vwvvwvlvha7h7m.R.inc(41381);return false;
            }
            }__CLR4_5_2vwvvwvlvha7h7m.R.inc(41382);final TestObject rhs = (TestObject) o;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41383);return a == rhs.a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41384);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41385);return a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41386);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41387);this.a = a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41388);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41389);return a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;

        @SuppressWarnings("unused")
        transient private int t;

        public TestSubObject() {
            super(0);__CLR4_5_2vwvvwvlvha7h7m.R.inc(41391);try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41390);
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public TestSubObject(final int a, final int b, final int t) {
            super(a);__CLR4_5_2vwvvwvlvha7h7m.R.inc(41393);try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41392);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41394);this.b = b;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41395);this.t = t;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41396);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41397);if ((((o == this)&&(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41398)!=0|true))||(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41399)==0&false))) {{
                __CLR4_5_2vwvvwvlvha7h7m.R.inc(41400);return true;
            }
            }__CLR4_5_2vwvvwvlvha7h7m.R.inc(41401);if ((((!(o instanceof TestSubObject))&&(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41402)!=0|true))||(__CLR4_5_2vwvvwvlvha7h7m.R.iget(41403)==0&false))) {{
                __CLR4_5_2vwvvwvlvha7h7m.R.inc(41404);return false;
            }
            }__CLR4_5_2vwvvwvlvha7h7m.R.inc(41405);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41406);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41407);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41408);return b*17 + super.hashCode();
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    }

    @Test
    public void testReflectionHashCode() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xivefzvy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xivefzvy9(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41409);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41410);assertEquals(17 * 37, HashCodeBuilder.reflectionHashCode(new TestObject(0)));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41411);assertEquals(17 * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestObject(123456)));
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testReflectionHierarchyHashCode() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21d7bzuvyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21d7bzuvyc(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41412);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41413);assertEquals(17 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0)));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41414);assertEquals(17 * 37 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0), true));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41415);assertEquals((17 * 37 + 7890) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(123456, 7890,
                0)));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41416);assertEquals(((17 * 37 + 7890) * 37 + 0) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(
                123456, 7890, 0), true));
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHierarchyHashCodeEx1() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27l3jg2vyh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,105,101,114,97,114,99,104,121,72,97,115,104,67,111,100,101,69,120,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27l3jg2vyh(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41417);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41418);HashCodeBuilder.reflectionHashCode(0, 0, new TestSubObject(0, 0, 0), true);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHierarchyHashCodeEx2() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2au3i8jvyj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,105,101,114,97,114,99,104,121,72,97,115,104,67,111,100,101,69,120,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2au3i8jvyj(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41419);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41420);HashCodeBuilder.reflectionHashCode(2, 2, new TestSubObject(0, 0, 0), true);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx1() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gmxju5vyl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gmxju5vyl(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41421);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41422);HashCodeBuilder.reflectionHashCode(0, 0, new TestObject(0), true);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx2() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jvximmvyn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jvximmvyn(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41423);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41424);HashCodeBuilder.reflectionHashCode(2, 2, new TestObject(0), true);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx3() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n4xhf3vyp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n4xhf3vyp(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41425);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41426);HashCodeBuilder.reflectionHashCode(13, 19, null, true);
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testSuper() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28bo7cgvyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28bo7cgvyr(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41427);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41428);final Object obj = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41429);assertEquals(17 * 37 + 19 * 41 + obj.hashCode(), new HashCodeBuilder(17, 37).appendSuper(
                new HashCodeBuilder(19, 41).append(obj).toHashCode()).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0vyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0vyu(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41430);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41431);Object obj = null;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41432);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41433);obj = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41434);assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvdhb0vyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvdhb0vyz(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41435);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41436);Object obj = null;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41437);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).build().intValue());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41438);obj = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41439);assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).build().intValue());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testLong() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzvz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzvz4(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41440);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41441);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(0L).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41442);assertEquals(17 * 37 + (int) (123456789L ^ 123456789L >> 32), new HashCodeBuilder(17, 37).append(
                123456789L).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testInt() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0vz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0vz7(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41443);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41444);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(0).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41445);assertEquals(17 * 37 + 123456, new HashCodeBuilder(17, 37).append(123456).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exs2r3vza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exs2r3vza(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41446);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41447);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short) 0).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41448);assertEquals(17 * 37 + 12345, new HashCodeBuilder(17, 37).append((short) 12345).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vvzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vvzd(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41449);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41450);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char) 0).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41451);assertEquals(17 * 37 + 1234, new HashCodeBuilder(17, 37).append((char) 1234).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzvzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzvzg(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41452);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41453);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte) 0).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41454);assertEquals(17 * 37 + 123, new HashCodeBuilder(17, 37).append((byte) 123).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testDouble() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hfze2vzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hfze2vzj(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41455);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41456);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(0d).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41457);final double d = 1234567.89;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41458);final long l = Double.doubleToLongBits(d);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41459);assertEquals(17 * 37 + (int) (l ^ l >> 32), new HashCodeBuilder(17, 37).append(d).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testFloat() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuf8q9vzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuf8q9vzo(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41460);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41461);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(0f).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41462);final float f = 1234.89f;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41463);final int i = Float.floatToIntBits(f);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41464);assertEquals(17 * 37 + i, new HashCodeBuilder(17, 37).append(f).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1vzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1vzt(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41465);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41466);assertEquals(17 * 37 + 0, new HashCodeBuilder(17, 37).append(true).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41467);assertEquals(17 * 37 + 1, new HashCodeBuilder(17, 37).append(false).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7vzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7vzw(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41468);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41469);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41470);final Object[] obj = new Object[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41471);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41472);obj[0] = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41473);assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41474);obj[1] = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41475);assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append(obj)
                .toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testObjectArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29jp1hcw04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29jp1hcw04(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41476);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41477);final Object[] obj = new Object[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41478);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41479);obj[0] = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41480);assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41481);obj[1] = new Object();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41482);assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append(
                (Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6w0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6w0b(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41483);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41484);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41485);final long[] obj = new long[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41486);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41487);obj[0] = 5L;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41488);final int h1 = (int) (5L ^ 5L >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41489);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41490);obj[1] = 6L;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41491);final int h2 = (int) (6L ^ 6L >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41492);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testLongArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqb7lpw0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqb7lpw0l(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41493);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41494);final long[] obj = new long[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41495);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41496);obj[0] = 5L;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41497);final int h1 = (int) (5L ^ 5L >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41498);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41499);obj[1] = 6L;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41500);final int h2 = (int) (6L ^ 6L >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41501);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28w0so3w0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28w0so3w0u(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41502);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41503);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41504);final int[] obj = new int[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41505);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41506);obj[0] = 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41507);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41508);obj[1] = 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41509);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testIntArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w79smsw12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w79smsw12(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41510);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41511);final int[] obj = new int[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41512);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41513);obj[0] = 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41514);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41515);obj[1] = 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41516);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqn45yw19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqn45yw19(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41517);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41518);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41519);final short[] obj = new short[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41520);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41521);obj[0] = (short) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41522);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41523);obj[1] = (short) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41524);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testShortArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wd4yxzw1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wd4yxzw1h(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41525);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41526);final short[] obj = new short[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41527);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41528);obj[0] = (short) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41529);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41530);obj[1] = (short) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41531);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0bza0w1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0bza0w1o(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41532);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41533);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41534);final char[] obj = new char[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41535);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41536);obj[0] = (char) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41537);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41538);obj[1] = (char) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41539);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testCharArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2781zmfw1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2781zmfw1w(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41540);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41541);final char[] obj = new char[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41542);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41543);obj[0] = (char) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41544);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41545);obj[1] = (char) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41546);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mhe7kqw23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mhe7kqw23(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41547);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41548);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41549);final byte[] obj = new byte[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41550);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41551);obj[0] = (byte) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41552);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41553);obj[1] = (byte) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41554);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testByteArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dljk1jw2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41555,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dljk1jw2b(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41555);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41556);final byte[] obj = new byte[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41557);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41558);obj[0] = (byte) 5;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41559);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41560);obj[1] = (byte) 6;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41561);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6ks4jw2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6ks4jw2i(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41562);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41563);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41564);final double[] obj = new double[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41565);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41566);obj[0] = 5.4d;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41567);final long l1 = Double.doubleToLongBits(5.4d);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41568);final int h1 = (int) (l1 ^ l1 >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41569);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41570);obj[1] = 6.3d;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41571);final long l2 = Double.doubleToLongBits(6.3d);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41572);final int h2 = (int) (l2 ^ l2 >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41573);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testDoubleArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xh418yw2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xh418yw2u(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41574);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41575);final double[] obj = new double[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41576);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41577);obj[0] = 5.4d;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41578);final long l1 = Double.doubleToLongBits(5.4d);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41579);final int h1 = (int) (l1 ^ l1 >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41580);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41581);obj[1] = 6.3d;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41582);final long l2 = Double.doubleToLongBits(6.3d);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41583);final int h2 = (int) (l2 ^ l2 >> 32);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41584);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maw6iyw35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maw6iyw35(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41585);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41586);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41587);final float[] obj = new float[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41588);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41589);obj[0] = 5.4f;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41590);final int h1 = Float.floatToIntBits(5.4f);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41591);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41592);obj[1] = 6.3f;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41593);final int h2 = Float.floatToIntBits(6.3f);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41594);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testFloatArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hlvrw3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hlvrw3f(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41595);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41596);final float[] obj = new float[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41597);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41598);obj[0] = 5.4f;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41599);final int h1 = Float.floatToIntBits(5.4f);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41600);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41601);obj[1] = 6.3f;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41602);final int h2 = Float.floatToIntBits(6.3f);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41603);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rzd0qw3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rzd0qw3o(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41604);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41605);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41606);final boolean[] obj = new boolean[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41607);assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41608);obj[0] = true;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41609);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41610);obj[1] = false;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41611);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testBooleanArrayAsObject() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lo037pw3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lo037pw3w(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41612);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41613);final boolean[] obj = new boolean[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41614);assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41615);obj[0] = true;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41616);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41617);obj[1] = false;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41618);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testBooleanMultiArray() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22cpwqlw43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22cpwqlw43(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41619);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41620);final boolean[][] obj = new boolean[2][];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41621);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41622);obj[0] = new boolean[0];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41623);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41624);obj[0] = new boolean[1];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41625);assertEquals((17 * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41626);obj[0] = new boolean[2];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41627);assertEquals(((17 * 37 + 1) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41628);obj[0][0] = true;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41629);assertEquals(((17 * 37 + 0) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41630);obj[1] = new boolean[1];
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41631);assertEquals(((17 * 37 + 0) * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    @Test
    public void testReflectionHashCodeExcludeFields() throws Exception {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l6d9aw4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l6d9aw4g() throws Exception{try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41632);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41633);final TestObjectWithMultipleFields x = new TestObjectWithMultipleFields(1, 2, 3);

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41634);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x));

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41635);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, (String[]) null));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41636);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{}));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41637);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"xxx"}));

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41638);assertEquals((17 * 37 + 1) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"two"}));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41639);assertEquals((17 * 37 + 1) * 37 + 2, HashCodeBuilder.reflectionHashCode(x, new String[]{"three"}));

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41640);assertEquals(17 * 37 + 1, HashCodeBuilder.reflectionHashCode(x, new String[]{"two", "three"}));

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41641);assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three"}));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41642);assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three", "xxx"}));
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private int one = 0;

        @SuppressWarnings("unused")
        private int two = 0;

        @SuppressWarnings("unused")
        private int three = 0;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41643);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41644);this.one = one;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41645);this.two = two;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41646);this.three = three;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    /**
     * Test Objects pointing to each other.
     */
    @Test
    public void testReflectionObjectCycle() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_247qrvzw4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_247qrvzw4v(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41647);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41648);final ReflectionTestCycleA a = new ReflectionTestCycleA();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41649);final ReflectionTestCycleB b = new ReflectionTestCycleB();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41650);a.b = b;
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41651);b.a = a;
        
        // Used to caused:
        // java.lang.StackOverflowError
        // at java.lang.ClassLoader.getCallerClassLoader(Native Method)
        // at java.lang.Class.getDeclaredFields(Class.java:992)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:373)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleB.hashCode(HashCodeBuilderTest.java:53)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:383)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleA.hashCode(HashCodeBuilderTest.java:42)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)

        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41652);a.hashCode();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41653);assertNull(HashCodeBuilder.getRegistry());
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41654);b.hashCode();
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41655);assertNull(HashCodeBuilder.getRegistry());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    /**
     * Ensures LANG-520 remains true
     */
    @Test
    public void testToHashCodeEqualsHashCode() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h7qx3dw54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h7qx3dw54(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41656);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41657);final HashCodeBuilder hcb = new HashCodeBuilder(17, 37).append(new Object()).append('a');
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41658);assertEquals("hashCode() is no longer returning the same value as toHashCode() - see LANG-520", 
                     hcb.toHashCode(), hcb.hashCode());
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

    static class TestObjectHashCodeExclude {
        @HashCodeExclude
        private final int a;
        private final int b;

        public TestObjectHashCodeExclude(final int a, final int b) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41659);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41660);this.a = a;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41661);this.b = b;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41662);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41663);return a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41664);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41665);return b;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    static class TestObjectHashCodeExclude2 {
        @HashCodeExclude
        private final int a;
        @HashCodeExclude
        private final int b;

        public TestObjectHashCodeExclude2(final int a, final int b) {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41666);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41667);this.a = a;
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41668);this.b = b;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public int getA() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41669);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41670);return a;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

        public int getB() {try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41671);
            __CLR4_5_2vwvvwvlvha7h7m.R.inc(41672);return b;
        }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}
    }

    @Test
    public void testToHashCodeExclude() {__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceStart(getClass().getName(),41673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qs5q1zw5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2vwvvwvlvha7h7m.R.rethrow($CLV_t2$);}finally{__CLR4_5_2vwvvwvlvha7h7m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeExclude",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41673,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qs5q1zw5l(){try{__CLR4_5_2vwvvwvlvha7h7m.R.inc(41673);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41674);final TestObjectHashCodeExclude one = new TestObjectHashCodeExclude(1, 2);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41675);final TestObjectHashCodeExclude2 two = new TestObjectHashCodeExclude2(1, 2);
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41676);assertEquals(17 * 37 + 2, HashCodeBuilder.reflectionHashCode(one));
        __CLR4_5_2vwvvwvlvha7h7m.R.inc(41677);assertEquals(17, HashCodeBuilder.reflectionHashCode(two));
    }finally{__CLR4_5_2vwvvwvlvha7h7m.R.flushNeeded();}}

}
