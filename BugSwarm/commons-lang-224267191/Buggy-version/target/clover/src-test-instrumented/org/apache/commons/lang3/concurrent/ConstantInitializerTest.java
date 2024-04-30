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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code ConstantInitializer}.
 */
public class ConstantInitializerTest {static class __CLR4_5_2yp8yp8lvha7ho5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45011,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the object managed by the initializer. */
    private static final Integer VALUE = 42;

    /** The initializer to be tested. */
    private ConstantInitializer<Integer> init;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44972);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44973);init = new ConstantInitializer<>(VALUE);
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Helper method for testing equals() and hashCode().
     *
     * @param obj the object to compare with the test instance
     * @param expected the expected result
     */
    private void checkEquals(final Object obj, final boolean expected) {try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44974);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44975);assertTrue("Wrong result of equals", expected == init.equals(obj));
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44976);if ((((obj != null)&&(__CLR4_5_2yp8yp8lvha7ho5.R.iget(44977)!=0|true))||(__CLR4_5_2yp8yp8lvha7ho5.R.iget(44978)==0&false))) {{
            __CLR4_5_2yp8yp8lvha7ho5.R.inc(44979);assertTrue("Not symmetric", expected == obj.equals(init));
            __CLR4_5_2yp8yp8lvha7ho5.R.inc(44980);if ((((expected)&&(__CLR4_5_2yp8yp8lvha7ho5.R.iget(44981)!=0|true))||(__CLR4_5_2yp8yp8lvha7ho5.R.iget(44982)==0&false))) {{
                __CLR4_5_2yp8yp8lvha7ho5.R.inc(44983);assertEquals("Different hash codes", init.hashCode(),
                        obj.hashCode());
            }
        }}
    }}finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests whether the correct object is returned.
     */
    @Test
    public void testGetObject() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),44984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ejm016ypk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGetObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ejm016ypk(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44984);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44985);assertEquals("Wrong object", VALUE, init.getObject());
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests whether get() returns the correct object.
     *
     * @throws org.apache.commons.lang3.concurrent.ConcurrentException so we don't have to catch it
     */
    @Test
    public void testGet() throws ConcurrentException {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),44986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpje3vypm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpje3vypm() throws ConcurrentException{try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44986);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44987);assertEquals("Wrong object", VALUE, init.get());
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests equals() if the expected result is true.
     */
    @Test
    public void testEqualsTrue() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),44988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a7e92yypo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsTrue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a7e92yypo(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44988);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44989);checkEquals(init, true);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44990);ConstantInitializer<Integer> init2 = new ConstantInitializer<>(
                Integer.valueOf(VALUE.intValue()));
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44991);checkEquals(init2, true);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44992);init = new ConstantInitializer<>(null);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44993);init2 = new ConstantInitializer<>(null);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44994);checkEquals(init2, true);
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests equals() if the expected result is false.
     */
    @Test
    public void testEqualsFalse() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),44995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e5zr5zypv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsFalse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e5zr5zypv(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(44995);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44996);ConstantInitializer<Integer> init2 = new ConstantInitializer<>(
                null);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44997);checkEquals(init2, false);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44998);init2 = new ConstantInitializer<>(VALUE + 1);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(44999);checkEquals(init2, false);
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests equals() with objects of other classes.
     */
    @Test
    public void testEqualsWithOtherObjects() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),45000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lhmwuyq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsWithOtherObjects",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lhmwuyq0(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(45000);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45001);checkEquals(null, false);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45002);checkEquals(this, false);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45003);checkEquals(new ConstantInitializer<>("Test"), false);
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests the string representation.
     */
    @Test
    public void testToString() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),45004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidyq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidyq4(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(45004);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45005);final String s = init.toString();
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45006);final Pattern pattern = Pattern
                .compile("ConstantInitializer@-?\\d+ \\[ object = " + VALUE
                        + " \\]");
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45007);assertTrue("Wrong string: " + s, pattern.matcher(s).matches());
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}

    /**
     * Tests the string representation if the managed object is null.
     */
    @Test
    public void testToStringNull() {__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceStart(getClass().getName(),45008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jnvi3wyq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yp8yp8lvha7ho5.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yp8yp8lvha7ho5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToStringNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jnvi3wyq8(){try{__CLR4_5_2yp8yp8lvha7ho5.R.inc(45008);
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45009);final String s = new ConstantInitializer<>(null).toString();
        __CLR4_5_2yp8yp8lvha7ho5.R.inc(45010);assertTrue("Object not found: " + s, s.indexOf("object = null") > 0);
    }finally{__CLR4_5_2yp8yp8lvha7ho5.R.flushNeeded();}}
}
