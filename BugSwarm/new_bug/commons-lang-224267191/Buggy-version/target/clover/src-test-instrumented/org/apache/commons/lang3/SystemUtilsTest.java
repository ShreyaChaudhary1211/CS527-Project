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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_1;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_2;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_3;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_5;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_6;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_7;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_8;
import static org.apache.commons.lang3.JavaVersion.JAVA_9;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.SystemUtils}.
 * 
 * Only limited testing can be performed.
 */
public class SystemUtilsTest {static class __CLR4_5_2tagtaglvha7gqa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,38384,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8htag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8htag(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37960);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37961);assertNotNull(new SystemUtils());
        __CLR4_5_2tagtaglvha7gqa.R.inc(37962);final Constructor<?>[] cons = SystemUtils.class.getDeclaredConstructors();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37963);assertEquals(1, cons.length);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37964);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2tagtaglvha7gqa.R.inc(37965);assertTrue(Modifier.isPublic(SystemUtils.class.getModifiers()));
        __CLR4_5_2tagtaglvha7gqa.R.inc(37966);assertFalse(Modifier.isFinal(SystemUtils.class.getModifiers()));
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testGetHostName() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uiykeatan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetHostName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uiykeatan(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37967);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37968);final String hostName = SystemUtils.getHostName();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37969);String expected = (((SystemUtils.IS_OS_WINDOWS )&&(__CLR4_5_2tagtaglvha7gqa.R.iget(37970)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(37971)==0&false))? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
        __CLR4_5_2tagtaglvha7gqa.R.inc(37972);Assert.assertEquals(expected, hostName);
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    /**
     * Assumes no security manager exists.
     */
    @Test
    public void testGetJavaHome() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b2ax58tat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetJavaHome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37973,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b2ax58tat(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37973);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37974);final File dir = SystemUtils.getJavaHome();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37975);Assert.assertNotNull(dir);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37976);Assert.assertTrue(dir.exists());
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    /**
     * Assumes no security manager exists.
     */
    @Test
    public void testGetJavaIoTmpDir() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f1nxxltax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetJavaIoTmpDir",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f1nxxltax(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37977);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37978);final File dir = SystemUtils.getJavaIoTmpDir();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37979);Assert.assertNotNull(dir);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37980);Assert.assertTrue(dir.exists());
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    /**
     * Assumes no security manager exists.
     */
    @Test
    public void testGetUserDir() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0ei4ltb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetUserDir",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0ei4ltb1(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37981);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37982);final File dir = SystemUtils.getUserDir();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37983);Assert.assertNotNull(dir);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37984);Assert.assertTrue(dir.exists());
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    /**
     * Assumes no security manager exists.
     */
    @Test
    public void testGetUserHome() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2edsfxntb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetUserHome",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2edsfxntb5(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37985);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37986);final File dir = SystemUtils.getUserHome();
        __CLR4_5_2tagtaglvha7gqa.R.inc(37987);Assert.assertNotNull(dir);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37988);Assert.assertTrue(dir.exists());
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    @SuppressWarnings("deprecation")
    public void testIS_JAVA() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),37989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dkv70tb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIS_JAVA",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),37989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dkv70tb9(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(37989);
        __CLR4_5_2tagtaglvha7gqa.R.inc(37990);final String javaVersion = SystemUtils.JAVA_VERSION;
        __CLR4_5_2tagtaglvha7gqa.R.inc(37991);if ((((javaVersion == null)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(37992)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(37993)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(37994);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_5_2tagtaglvha7gqa.R.inc(37995);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_5_2tagtaglvha7gqa.R.inc(37996);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_5_2tagtaglvha7gqa.R.inc(37997);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_5_2tagtaglvha7gqa.R.inc(37998);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_5_2tagtaglvha7gqa.R.inc(37999);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38000);assertFalse(SystemUtils.IS_JAVA_1_7);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38001);assertFalse(SystemUtils.IS_JAVA_1_8);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38002);assertFalse(SystemUtils.IS_JAVA_1_9);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38003);assertFalse(SystemUtils.IS_JAVA_9);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38004);if ((((javaVersion.startsWith("1.7"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38005)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38006)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38007);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38008);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38009);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38010);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38011);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38012);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38013);assertTrue(SystemUtils.IS_JAVA_1_7);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38014);assertFalse(SystemUtils.IS_JAVA_1_8);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38015);assertFalse(SystemUtils.IS_JAVA_1_9);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38016);assertFalse(SystemUtils.IS_JAVA_9);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38017);if ((((javaVersion.startsWith("1.8"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38018)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38019)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38020);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38021);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38022);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38023);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38024);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38025);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38026);assertFalse(SystemUtils.IS_JAVA_1_7);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38027);assertTrue(SystemUtils.IS_JAVA_1_8);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38028);assertFalse(SystemUtils.IS_JAVA_1_9);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38029);assertFalse(SystemUtils.IS_JAVA_9);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38030);if ((((javaVersion.startsWith("9"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38031)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38032)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38033);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38034);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38035);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38036);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38037);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38038);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38039);assertFalse(SystemUtils.IS_JAVA_1_7);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38040);assertFalse(SystemUtils.IS_JAVA_1_8);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38041);assertTrue(SystemUtils.IS_JAVA_1_9);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38042);assertTrue(SystemUtils.IS_JAVA_9);
        } }else {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38043);System.out.println("Can't test IS_JAVA value: "+javaVersion);
        }
    }}}}}finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testIS_OS() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4gv6atcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIS_OS",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4gv6atcs(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38044);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38045);final String osName = System.getProperty("os.name");
        __CLR4_5_2tagtaglvha7gqa.R.inc(38046);if ((((osName == null)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38047)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38048)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38049);assertFalse(SystemUtils.IS_OS_WINDOWS);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38050);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38051);assertFalse(SystemUtils.IS_OS_SOLARIS);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38052);assertFalse(SystemUtils.IS_OS_LINUX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38053);assertFalse(SystemUtils.IS_OS_MAC_OSX);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38054);if ((((osName.startsWith("Windows"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38055)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38056)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38057);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38058);assertTrue(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38059);if ((((osName.startsWith("Solaris"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38060)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38061)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38062);assertTrue(SystemUtils.IS_OS_SOLARIS);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38063);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38064);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38065);if ((((osName.toLowerCase(Locale.ENGLISH).startsWith("linux"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38066)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38067)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38068);assertTrue(SystemUtils.IS_OS_LINUX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38069);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38070);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38071);if ((((osName.startsWith("Mac OS X"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38072)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38073)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38074);assertTrue(SystemUtils.IS_OS_MAC_OSX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38075);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38076);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38077);if ((((osName.startsWith("OS/2"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38078)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38079)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38080);assertTrue(SystemUtils.IS_OS_OS2);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38081);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38082);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38083);if ((((osName.startsWith("SunOS"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38084)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38085)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38086);assertTrue(SystemUtils.IS_OS_SUN_OS);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38087);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38088);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38089);if ((((osName.startsWith("FreeBSD"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38090)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38091)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38092);assertTrue(SystemUtils.IS_OS_FREE_BSD);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38093);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38094);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38095);System.out.println("Can't test IS_OS value: " + osName);
        }
    }}}}}}}}}finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testIS_zOS() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cze5dqte8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIS_zOS",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cze5dqte8(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38096);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38097);final String osName = System.getProperty("os.name");
        __CLR4_5_2tagtaglvha7gqa.R.inc(38098);if ((((osName == null)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38099)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38100)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38101);assertFalse(SystemUtils.IS_OS_ZOS);
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38102);if ((((osName.contains("z/OS"))&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38103)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38104)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38105);assertFalse(SystemUtils.IS_OS_WINDOWS);
            __CLR4_5_2tagtaglvha7gqa.R.inc(38106);assertTrue(SystemUtils.IS_OS_ZOS);
        }
    }}}finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testJavaVersionMatches() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26l52mutej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testJavaVersionMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38107,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26l52mutej(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38107);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38108);String javaVersion = null;
        __CLR4_5_2tagtaglvha7gqa.R.inc(38109);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38110);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38111);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38112);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38113);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38114);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38115);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38116);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38117);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38118);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38119);javaVersion = "";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38120);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38121);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38122);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38123);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38124);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38125);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38126);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38127);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38128);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38129);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38130);javaVersion = "1.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38131);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38132);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38133);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38134);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38135);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38136);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38137);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38138);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38139);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38140);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38141);javaVersion = "1.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38142);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38143);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38144);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38145);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38146);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38147);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38148);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38149);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38150);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38151);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38152);javaVersion = "1.2";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38153);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38154);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38155);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38156);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38157);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38158);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38159);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38160);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38161);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38162);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38163);javaVersion = "1.3.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38164);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38165);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38166);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38167);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38168);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38169);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38170);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38171);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38172);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38173);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38174);javaVersion = "1.3.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38175);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38176);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38177);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38178);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38179);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38180);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38181);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38182);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38183);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38184);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38185);javaVersion = "1.4.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38186);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38187);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38188);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38189);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38190);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38191);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38192);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38193);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38194);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38195);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38196);javaVersion = "1.4.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38197);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38198);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38199);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38200);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38201);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38202);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38203);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38204);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38205);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38206);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38207);javaVersion = "1.4.2";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38208);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38209);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38210);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38211);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38212);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38213);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38214);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38215);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38216);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38217);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38218);javaVersion = "1.5.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38219);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38220);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38221);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38222);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38223);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38224);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38225);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38226);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38227);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38228);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38229);javaVersion = "1.6.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38230);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38231);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38232);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38233);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38234);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38235);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38236);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38237);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38238);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38239);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38240);javaVersion = "1.7.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38241);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38242);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38243);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38244);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38245);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38246);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38247);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38248);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38249);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38250);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38251);javaVersion = "1.8.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38252);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38253);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38254);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38255);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38256);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38257);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38258);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38259);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38260);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38261);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38262);javaVersion = "9";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38263);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38264);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38265);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38266);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38267);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38268);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38269);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38270);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38271);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.8"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38272);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "9"));
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testIsJavaVersionAtLeat() throws Exception {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vajzq8tj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIsJavaVersionAtLeat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vajzq8tj5() throws Exception{try{__CLR4_5_2tagtaglvha7gqa.R.inc(38273);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38274);if ((((SystemUtils.IS_JAVA_1_7)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38275)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38276)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38277);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_1));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38278);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_2));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38279);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_3));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38280);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_4));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38281);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_5));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38282);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_6));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38283);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_7));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38284);assertFalse(SystemUtils.isJavaVersionAtLeast(JAVA_1_8));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38285);assertFalse(SystemUtils.isJavaVersionAtLeast(JAVA_9));
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38286);if ((((SystemUtils.IS_JAVA_1_8)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38287)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38288)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38289);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_1));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38290);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_2));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38291);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_3));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38292);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_4));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38293);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_5));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38294);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_6));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38295);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_7));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38296);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_8));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38297);assertFalse(SystemUtils.isJavaVersionAtLeast(JAVA_9));
        } }else {__CLR4_5_2tagtaglvha7gqa.R.inc(38298);if ((((SystemUtils.IS_JAVA_9)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38299)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38300)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38301);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_1));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38302);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_2));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38303);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_3));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38304);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_4));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38305);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_5));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38306);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_6));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38307);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_7));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38308);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_1_8));
            __CLR4_5_2tagtaglvha7gqa.R.inc(38309);assertTrue(SystemUtils.isJavaVersionAtLeast(JAVA_9));
        }
    }}}}finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testOSMatchesName() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_217i29tk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testOSMatchesName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_217i29tk6(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38310);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38311);String osName = null;
        __CLR4_5_2tagtaglvha7gqa.R.inc(38312);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38313);osName = "";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38314);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38315);osName = "Windows 95";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38316);assertTrue(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38317);osName = "Windows NT";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38318);assertTrue(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38319);osName = "OS/2";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38320);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testOSMatchesNameAndVersion() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hfgb80tkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testOSMatchesNameAndVersion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hfgb80tkh(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38321);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38322);String osName = null;
        __CLR4_5_2tagtaglvha7gqa.R.inc(38323);String osVersion = null;
        __CLR4_5_2tagtaglvha7gqa.R.inc(38324);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38325);osName = "";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38326);osVersion = "";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38327);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38328);osName = "Windows 95";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38329);osVersion = "4.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38330);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38331);osName = "Windows 95";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38332);osVersion = "4.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38333);assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38334);osName = "Windows 98";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38335);osVersion = "4.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38336);assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38337);osName = "Windows NT";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38338);osVersion = "4.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38339);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38340);osName = "OS/2";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38341);osVersion = "4.0";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38342);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testOsVersionMatches() throws Exception {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_287i8rstl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testOsVersionMatches",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_287i8rstl3() throws Exception{try{__CLR4_5_2tagtaglvha7gqa.R.inc(38343);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38344);String osVersion = null;
        __CLR4_5_2tagtaglvha7gqa.R.inc(38345);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38346);osVersion = "";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38347);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38348);osVersion = "10";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38349);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38350);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38351);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38352);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38353);osVersion = "10.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38354);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38355);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38356);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.10"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38357);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38358);osVersion = "10.1.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38359);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38360);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38361);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.10"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38362);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38363);osVersion = "10.10";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38364);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38365);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38366);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38367);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10.1"));

        __CLR4_5_2tagtaglvha7gqa.R.inc(38368);osVersion = "10.10.1";
        __CLR4_5_2tagtaglvha7gqa.R.inc(38369);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38370);assertFalse(SystemUtils.isOSVersionMatch(osVersion, "10.1.1"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38371);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10"));
        __CLR4_5_2tagtaglvha7gqa.R.inc(38372);assertTrue(SystemUtils.isOSVersionMatch(osVersion, "10.10.1"));
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}

    @Test
    public void testJavaAwtHeadless() {__CLR4_5_2tagtaglvha7gqa.R.globalSliceStart(getClass().getName(),38373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iu0fm2tlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2tagtaglvha7gqa.R.rethrow($CLV_t2$);}finally{__CLR4_5_2tagtaglvha7gqa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testJavaAwtHeadless",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),38373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iu0fm2tlx(){try{__CLR4_5_2tagtaglvha7gqa.R.inc(38373);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38374);final String expectedStringValue = System.getProperty("java.awt.headless");
        __CLR4_5_2tagtaglvha7gqa.R.inc(38375);final String expectedStringValueWithDefault = System.getProperty("java.awt.headless", "false");
        __CLR4_5_2tagtaglvha7gqa.R.inc(38376);assertNotNull(expectedStringValueWithDefault);
        __CLR4_5_2tagtaglvha7gqa.R.inc(38377);final boolean expectedValue = Boolean.valueOf(expectedStringValue).booleanValue();
        __CLR4_5_2tagtaglvha7gqa.R.inc(38378);if ((((expectedStringValue != null)&&(__CLR4_5_2tagtaglvha7gqa.R.iget(38379)!=0|true))||(__CLR4_5_2tagtaglvha7gqa.R.iget(38380)==0&false))) {{
            __CLR4_5_2tagtaglvha7gqa.R.inc(38381);assertEquals(expectedStringValue, SystemUtils.JAVA_AWT_HEADLESS);
        }
        }__CLR4_5_2tagtaglvha7gqa.R.inc(38382);assertEquals(expectedValue, SystemUtils.isJavaAwtHeadless());
        __CLR4_5_2tagtaglvha7gqa.R.inc(38383);assertEquals(expectedStringValueWithDefault, "" + SystemUtils.isJavaAwtHeadless());
    }finally{__CLR4_5_2tagtaglvha7gqa.R.flushNeeded();}}
}
