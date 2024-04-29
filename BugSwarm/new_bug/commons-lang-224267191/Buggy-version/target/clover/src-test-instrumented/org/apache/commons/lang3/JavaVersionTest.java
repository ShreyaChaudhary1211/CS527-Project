/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import org.junit.Test;

import static org.apache.commons.lang3.JavaVersion.JAVA_RECENT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.JavaVersion.JAVA_0_9;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_1;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_2;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_3;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_5;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_6;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_7;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_8;
import static org.apache.commons.lang3.JavaVersion.JAVA_9;
import static org.apache.commons.lang3.JavaVersion.get;
import static org.apache.commons.lang3.JavaVersion.getJavaVersion;

/**
 * Unit tests {@link org.apache.commons.lang3.JavaVersion}.
 */
public class JavaVersionTest {static class __CLR4_5_2p2wp2wlvha7fv4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,32525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGetJavaVersion() {__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceStart(getClass().getName(),32504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29epmsnp2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p2wp2wlvha7fv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testGetJavaVersion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29epmsnp2w(){try{__CLR4_5_2p2wp2wlvha7fv4.R.inc(32504);
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32505);assertEquals("0.9 failed", JAVA_0_9, get("0.9"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32506);assertEquals("1.1 failed", JAVA_1_1, get("1.1"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32507);assertEquals("1.2 failed", JAVA_1_2, get("1.2"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32508);assertEquals("1.3 failed", JAVA_1_3, get("1.3"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32509);assertEquals("1.4 failed", JAVA_1_4, get("1.4"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32510);assertEquals("1.5 failed", JAVA_1_5, get("1.5"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32511);assertEquals("1.6 failed", JAVA_1_6, get("1.6"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32512);assertEquals("1.7 failed", JAVA_1_7, get("1.7"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32513);assertEquals("1.8 failed", JAVA_1_8, get("1.8"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32514);assertEquals("9 failed", JAVA_9, get("9"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32515);assertEquals("1.10 failed", JAVA_RECENT, get("1.10"));
        // assertNull("2.10 unexpectedly worked", get("2.10"));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32516);assertEquals("Wrapper method failed", get("1.5"), getJavaVersion("1.5"));
    }finally{__CLR4_5_2p2wp2wlvha7fv4.R.flushNeeded();}}

    @Test
    public void testAtLeast() {__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceStart(getClass().getName(),32517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sjhe7pp39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p2wp2wlvha7fv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testAtLeast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sjhe7pp39(){try{__CLR4_5_2p2wp2wlvha7fv4.R.inc(32517);
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32518);assertFalse("1.2 at least 1.5 passed", JAVA_1_2.atLeast(JAVA_1_5));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32519);assertTrue("1.5 at least 1.2 failed", JAVA_1_5.atLeast(JAVA_1_2));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32520);assertFalse("1.6 at least 1.7 passed", JAVA_1_6.atLeast(JAVA_1_7));

        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32521);assertTrue("0.9 at least 1.5 failed", JAVA_0_9.atLeast(JAVA_1_5));
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32522);assertFalse("0.9 at least 1.6 passed", JAVA_0_9.atLeast(JAVA_1_6));
    }finally{__CLR4_5_2p2wp2wlvha7fv4.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceStart(getClass().getName(),32523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdidp3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2p2wp2wlvha7fv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2p2wp2wlvha7fv4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdidp3f(){try{__CLR4_5_2p2wp2wlvha7fv4.R.inc(32523);
        __CLR4_5_2p2wp2wlvha7fv4.R.inc(32524);assertEquals("1.2", JAVA_1_2.toString());
    }finally{__CLR4_5_2p2wp2wlvha7fv4.R.flushNeeded();}}

}
