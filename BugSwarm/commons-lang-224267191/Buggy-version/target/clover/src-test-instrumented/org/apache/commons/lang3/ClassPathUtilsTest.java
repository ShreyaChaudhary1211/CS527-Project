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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 */
public class ClassPathUtilsTest {static class __CLR4_5_2nognoglvha7fje{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,30727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hnog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hnog(){try{__CLR4_5_2nognoglvha7fje.R.inc(30688);
        __CLR4_5_2nognoglvha7fje.R.inc(30689);assertNotNull(new ClassPathUtils());
        __CLR4_5_2nognoglvha7fje.R.inc(30690);final Constructor<?>[] cons = ClassPathUtils.class.getDeclaredConstructors();
        __CLR4_5_2nognoglvha7fje.R.inc(30691);assertEquals(1, cons.length);
        __CLR4_5_2nognoglvha7fje.R.inc(30692);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2nognoglvha7fje.R.inc(30693);assertTrue(Modifier.isPublic(ClassPathUtils.class.getModifiers()));
        __CLR4_5_2nognoglvha7fje.R.inc(30694);assertFalse(Modifier.isFinal(ClassPathUtils.class.getModifiers()));
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedNameNullClassString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ge66qpnon();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,78,97,109,101,78,117,108,108,67,108,97,115,115,83,116,114,105,110,103,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNameNullClassString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ge66qpnon() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30695);
        __CLR4_5_2nognoglvha7fje.R.inc(30696);ClassPathUtils.toFullyQualifiedName((Class<?>) null, "Test.properties");
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedNameClassNull() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hespfgnop();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,78,97,109,101,67,108,97,115,115,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNameClassNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hespfgnop() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30697);
        __CLR4_5_2nognoglvha7fje.R.inc(30698);ClassPathUtils.toFullyQualifiedName(ClassPathUtils.class, null);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test
    public void testToFullyQualifiedNameClassString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkrcqnor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNameClassString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkrcqnor() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30699);
        __CLR4_5_2nognoglvha7fje.R.inc(30700);final String expected = "org.apache.commons.lang3.Test.properties";
        __CLR4_5_2nognoglvha7fje.R.inc(30701);final String actual = ClassPathUtils.toFullyQualifiedName(ClassPathUtils.class, "Test.properties");

        __CLR4_5_2nognoglvha7fje.R.inc(30702);assertEquals(expected, actual);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedNameNullPackageString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwxdm5nov();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,78,97,109,101,78,117,108,108,80,97,99,107,97,103,101,83,116,114,105,110,103,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNameNullPackageString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwxdm5nov() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30703);
        __CLR4_5_2nognoglvha7fje.R.inc(30704);ClassPathUtils.toFullyQualifiedName((Package) null, "Test.properties");
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedNamePackageNull() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lees3anox();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,78,97,109,101,80,97,99,107,97,103,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNamePackageNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lees3anox() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30705);
        __CLR4_5_2nognoglvha7fje.R.inc(30706);ClassPathUtils.toFullyQualifiedName(ClassPathUtils.class.getPackage(), null);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test
    public void testToFullyQualifiedNamePackageString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_270an3gnoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedNamePackageString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_270an3gnoz() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30707);
        __CLR4_5_2nognoglvha7fje.R.inc(30708);final String expected = "org.apache.commons.lang3.Test.properties";
        __CLR4_5_2nognoglvha7fje.R.inc(30709);final String actual = ClassPathUtils.toFullyQualifiedName(ClassPathUtils.class.getPackage(), "Test.properties");

        __CLR4_5_2nognoglvha7fje.R.inc(30710);assertEquals(expected, actual);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedPathClassNullString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2athj7xnp3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,80,97,116,104,67,108,97,115,115,78,117,108,108,83,116,114,105,110,103,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathClassNullString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2athj7xnp3() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30711);
        __CLR4_5_2nognoglvha7fje.R.inc(30712);ClassPathUtils.toFullyQualifiedPath((Class<?>) null, "Test.properties");
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedPathClassNull() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vzjdlunp5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,80,97,116,104,67,108,97,115,115,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathClassNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vzjdlunp5() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30713);
        __CLR4_5_2nognoglvha7fje.R.inc(30714);ClassPathUtils.toFullyQualifiedPath(ClassPathUtils.class, null);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test
    public void testToFullyQualifiedPathClass() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jgbzyznp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jgbzyznp7() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30715);
        __CLR4_5_2nognoglvha7fje.R.inc(30716);final String expected = "org/apache/commons/lang3/Test.properties";
        __CLR4_5_2nognoglvha7fje.R.inc(30717);final String actual = ClassPathUtils.toFullyQualifiedPath(ClassPathUtils.class, "Test.properties");

        __CLR4_5_2nognoglvha7fje.R.inc(30718);assertEquals(expected, actual);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedPathPackageNullString() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cjg7pbnpb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,80,97,116,104,80,97,99,107,97,103,101,78,117,108,108,83,116,114,105,110,103,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathPackageNullString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cjg7pbnpb() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30719);
        __CLR4_5_2nognoglvha7fje.R.inc(30720);ClassPathUtils.toFullyQualifiedPath((Package) null, "Test.properties");
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testToFullyQualifiedPathPackageNull() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26tm6ognpd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,70,117,108,108,121,81,117,97,108,105,102,105,101,100,80,97,116,104,80,97,99,107,97,103,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathPackageNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26tm6ognpd() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30721);
        __CLR4_5_2nognoglvha7fje.R.inc(30722);ClassPathUtils.toFullyQualifiedPath(ClassPathUtils.class.getPackage(), null);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}

    @Test
    public void testToFullyQualifiedPathPackage() throws Exception {__CLR4_5_2nognoglvha7fje.R.globalSliceStart(getClass().getName(),30723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7lkbbnpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nognoglvha7fje.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nognoglvha7fje.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassPathUtilsTest.testToFullyQualifiedPathPackage",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7lkbbnpf() throws Exception{try{__CLR4_5_2nognoglvha7fje.R.inc(30723);
        __CLR4_5_2nognoglvha7fje.R.inc(30724);final String expected = "org/apache/commons/lang3/Test.properties";
        __CLR4_5_2nognoglvha7fje.R.inc(30725);final String actual = ClassPathUtils.toFullyQualifiedPath(ClassPathUtils.class.getPackage(), "Test.properties");

        __CLR4_5_2nognoglvha7fje.R.inc(30726);assertEquals(expected, actual);
    }finally{__CLR4_5_2nognoglvha7fje.R.flushNeeded();}}
}
