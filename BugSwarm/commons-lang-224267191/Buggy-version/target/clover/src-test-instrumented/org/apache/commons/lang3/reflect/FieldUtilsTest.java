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
package org.apache.commons.lang3.reflect;

import org.apache.commons.lang3.ArrayUtils;

import org.apache.commons.lang3.reflect.testbed.Ambig;
import org.apache.commons.lang3.reflect.testbed.Annotated;
import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.PrivatelyShadowedChild;
import org.apache.commons.lang3.reflect.testbed.PublicChild;
import org.apache.commons.lang3.reflect.testbed.PubliclyShadowedChild;
import org.apache.commons.lang3.reflect.testbed.StaticContainer;
import org.apache.commons.lang3.reflect.testbed.StaticContainerChild;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeNotNull;

/**
 * Unit tests FieldUtils
 */
public class FieldUtilsTest {static class __CLR4_5_2123v123vlvha7i8i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,50126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final Integer I0 = Integer.valueOf(0);
    static final Integer I1 = Integer.valueOf(1);
    static final Double D0 = Double.valueOf(0.0);
    static final Double D1 = Double.valueOf(1.0);

    @Annotated
    private PublicChild publicChild;
    private PubliclyShadowedChild publiclyShadowedChild;
    @Annotated
    private PrivatelyShadowedChild privatelyShadowedChild;
    private final Class<? super PublicChild> parentClass = PublicChild.class.getSuperclass();

    @Before
    public void setUp() {try{__CLR4_5_2123v123vlvha7i8i.R.inc(49387);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49388);StaticContainer.reset();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49389);publicChild = new PublicChild();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49390);publiclyShadowedChild = new PubliclyShadowedChild();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49391);privatelyShadowedChild = new PrivatelyShadowedChild();
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testConstructor() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8h1240();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8h1240(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49392);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49393);assertNotNull(new FieldUtils());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49394);final Constructor<?>[] cons = FieldUtils.class.getDeclaredConstructors();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49395);assertEquals(1, cons.length);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49396);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49397);assertTrue(Modifier.isPublic(FieldUtils.class.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49398);assertFalse(Modifier.isFinal(FieldUtils.class.getModifiers()));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lx8n7n1247();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lx8n7n1247(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49399);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49400);assertEquals(Foo.class, FieldUtils.getField(PublicChild.class, "VALUE").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49401);assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "s").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49402);assertNull(FieldUtils.getField(PublicChild.class, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49403);assertNull(FieldUtils.getField(PublicChild.class, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49404);assertNull(FieldUtils.getField(PublicChild.class, "d"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49405);assertEquals(Foo.class, FieldUtils.getField(PubliclyShadowedChild.class, "VALUE").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49406);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "s").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49407);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "b").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49408);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "i").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49409);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "d").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49410);assertEquals(Foo.class, FieldUtils.getField(PrivatelyShadowedChild.class, "VALUE").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49411);assertEquals(parentClass, FieldUtils.getField(PrivatelyShadowedChild.class, "s").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49412);assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49413);assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49414);assertNull(FieldUtils.getField(PrivatelyShadowedChild.class, "d"));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hptvq124n();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hptvq124n(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49415);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49416);FieldUtils.getField(null, "none");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qpso7124p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qpso7124p(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49417);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49418);FieldUtils.getField(PublicChild.class, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zprgo124r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zprgo124r(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49419);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49420);FieldUtils.getField(PublicChild.class, "");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldIllegalArgumentException4() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a8pq95124t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,52,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldIllegalArgumentException4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a8pq95124t(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49421);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49422);FieldUtils.getField(PublicChild.class, " ");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetFieldForceAccess() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqpklc124v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqpklc124v(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49423);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49424);assertEquals(PublicChild.class, FieldUtils.getField(PublicChild.class, "VALUE", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49425);assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "s", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49426);assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "b", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49427);assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "i", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49428);assertEquals(parentClass, FieldUtils.getField(PublicChild.class, "d", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49429);assertEquals(Foo.class, FieldUtils.getField(PubliclyShadowedChild.class, "VALUE", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49430);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "s", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49431);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "b", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49432);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "i", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49433);assertEquals(PubliclyShadowedChild.class, FieldUtils.getField(PubliclyShadowedChild.class, "d", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49434);assertEquals(Foo.class, FieldUtils.getField(PrivatelyShadowedChild.class, "VALUE", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49435);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "s", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49436);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "b", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49437);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "i", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49438);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getField(PrivatelyShadowedChild.class, "d", true).getDeclaringClass());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldForceAccessIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_275w65125b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldForceAccessIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_275w65125b(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49439);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49440);FieldUtils.getField(null, "none", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldForceAccessIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_231u2mc125d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldForceAccessIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_231u2mc125d(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49441);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49442);FieldUtils.getField(PublicChild.class, null, true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldForceAccessIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26au1et125f();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldForceAccessIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26au1et125f(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49443);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49444);FieldUtils.getField(PublicChild.class, "", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldForceAccessIllegalArgumentException4() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ju07a125h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,52,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldForceAccessIllegalArgumentException4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ju07a125h(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49445);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49446);FieldUtils.getField(PublicChild.class, " ", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetAllFields() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23gy5dv125j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetAllFields",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23gy5dv125j(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49447);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49448);assertArrayEquals(new Field[0], FieldUtils.getAllFields(Object.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49449);final Field[] fieldsNumber = Number.class.getDeclaredFields();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49450);assertArrayEquals(fieldsNumber, FieldUtils.getAllFields(Number.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49451);final Field[] fieldsInteger = Integer.class.getDeclaredFields();
        __CLR4_5_2123v123vlvha7i8i.R.inc(49452);assertArrayEquals(ArrayUtils.addAll(fieldsInteger, fieldsNumber), FieldUtils.getAllFields(Integer.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49453);assertEquals(5, FieldUtils.getAllFields(PublicChild.class).length);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetAllFieldsList() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21u2r7f125q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetAllFieldsList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21u2r7f125q(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49454);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49455);assertEquals(0, FieldUtils.getAllFieldsList(Object.class).size());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49456);final List<Field> fieldsNumber = Arrays.asList(Number.class.getDeclaredFields());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49457);assertEquals(fieldsNumber, FieldUtils.getAllFieldsList(Number.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49458);final List<Field> fieldsInteger = Arrays.asList(Integer.class.getDeclaredFields());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49459);final List<Field> allFieldsInteger = new ArrayList<>(fieldsInteger);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49460);allFieldsInteger.addAll(fieldsNumber);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49461);assertEquals(allFieldsInteger, FieldUtils.getAllFieldsList(Integer.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49462);assertEquals(5, FieldUtils.getAllFieldsList(PublicChild.class).size());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetFieldsWithAnnotation() throws NoSuchFieldException {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u5qo1l125z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsWithAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u5qo1l125z() throws NoSuchFieldException{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49463);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49464);assertArrayEquals(new Field[0], FieldUtils.getFieldsWithAnnotation(Object.class, Annotated.class));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49465);final Field[] annotatedFields = new Field[]{
                FieldUtilsTest.class.getDeclaredField("publicChild"),
                FieldUtilsTest.class.getDeclaredField("privatelyShadowedChild")
        };
        __CLR4_5_2123v123vlvha7i8i.R.inc(49466);assertArrayEquals(annotatedFields, FieldUtils.getFieldsWithAnnotation(FieldUtilsTest.class, Annotated.class));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsWithAnnotationIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utc2161263();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsWithAnnotationIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utc2161263(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49467);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49468);FieldUtils.getFieldsWithAnnotation(FieldUtilsTest.class, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsWithAnnotationIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2c0tn1265();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsWithAnnotationIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2c0tn1265(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49469);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49470);FieldUtils.getFieldsWithAnnotation(null, Annotated.class);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsWithAnnotationIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xps2d01267();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsWithAnnotationIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xps2d01267(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49471);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49472);FieldUtils.getFieldsWithAnnotation(null, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetFieldsListWithAnnotation() throws NoSuchFieldException {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sp5q9j1269();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsListWithAnnotation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sp5q9j1269() throws NoSuchFieldException{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49473);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49474);assertEquals(0, FieldUtils.getFieldsListWithAnnotation(Object.class, Annotated.class).size());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49475);final List<Field> annotatedFields = Arrays.asList(
                FieldUtilsTest.class.getDeclaredField("publicChild"),
                FieldUtilsTest.class.getDeclaredField("privatelyShadowedChild")
        );
        __CLR4_5_2123v123vlvha7i8i.R.inc(49476);final List<Field> fieldUtilsTestAnnotatedFields = FieldUtils.getFieldsListWithAnnotation(FieldUtilsTest.class, Annotated.class);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49477);assertEquals(annotatedFields.size(),fieldUtilsTestAnnotatedFields.size());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49478);assertTrue(fieldUtilsTestAnnotatedFields.contains(annotatedFields.get(0)));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49479);assertTrue(fieldUtilsTestAnnotatedFields.contains(annotatedFields.get(1)));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsListWithAnnotationIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qgyt4k126g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsListWithAnnotationIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qgyt4k126g(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49480);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49481);FieldUtils.getFieldsListWithAnnotation(FieldUtilsTest.class, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsListWithAnnotationIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n7yuc3126i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsListWithAnnotationIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n7yuc3126i(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49482);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49483);FieldUtils.getFieldsListWithAnnotation(null, Annotated.class);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldsListWithAnnotationIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jyyvjm126k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,70,105,101,108,100,115,76,105,115,116,87,105,116,104,65,110,110,111,116,97,116,105,111,110,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetFieldsListWithAnnotationIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jyyvjm126k(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49484);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49485);FieldUtils.getFieldsListWithAnnotation(null, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetDeclaredField() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gk7331126m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gk7331126m(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49486);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49487);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49488);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49489);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49490);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49491);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "d"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49492);assertNull(FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49493);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "s").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49494);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "b").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49495);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "i").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49496);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "d").getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49497);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49498);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49499);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49500);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49501);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "d"));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldAccessIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ds323o1272();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldAccessIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ds323o1272(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49502);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49503);FieldUtils.getDeclaredField(null, "none");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldAccessIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aj33b71274();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldAccessIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49504,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aj33b71274(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49504);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49505);FieldUtils.getDeclaredField(PublicChild.class, null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldAccessIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27a34iq1276();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldAccessIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27a34iq1276(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49506);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49507);FieldUtils.getDeclaredField(PublicChild.class, "");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldAccessIllegalArgumentException4() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24135q91278();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,52,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldAccessIllegalArgumentException4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24135q91278(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49508);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49509);FieldUtils.getDeclaredField(PublicChild.class, " ");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testGetDeclaredFieldForceAccess() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g6tbom127a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g6tbom127a(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49510);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49511);assertEquals(PublicChild.class, FieldUtils.getDeclaredField(PublicChild.class, "VALUE", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49512);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49513);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49514);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49515);assertNull(FieldUtils.getDeclaredField(PublicChild.class, "d", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49516);assertNull(FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49517);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "s", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49518);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "b", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49519);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "i", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49520);assertEquals(PubliclyShadowedChild.class, FieldUtils.getDeclaredField(PubliclyShadowedChild.class, "d", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49521);assertNull(FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49522);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "s", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49523);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "b", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49524);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "i", true).getDeclaringClass());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49525);assertEquals(PrivatelyShadowedChild.class, FieldUtils.getDeclaredField(PrivatelyShadowedChild.class, "d", true).getDeclaringClass());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException1() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mw8i1127q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldForceAccessIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mw8i1127q(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49526);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49527);FieldUtils.getDeclaredField(null, "none", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException2() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23vw7ai127s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldForceAccessIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23vw7ai127s(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49528);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49529);FieldUtils.getDeclaredField(PublicChild.class, null, true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException3() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_274w62z127u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldForceAccessIllegalArgumentException3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_274w62z127u(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49530);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49531);FieldUtils.getDeclaredField(PublicChild.class, "", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException4() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2adw4vg127w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,52,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testGetDeclaredFieldForceAccessIllegalArgumentException4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2adw4vg127w(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(49532);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49533);FieldUtils.getDeclaredField(PublicChild.class, " ", true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmkqrv127y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmkqrv127y() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49534);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49535);assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testReadStaticFieldIllegalArgumentException1() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25p7hs81280();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,97,100,83,116,97,116,105,99,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticFieldIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25p7hs81280() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49536);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49537);FieldUtils.readStaticField(null);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testReadStaticFieldIllegalArgumentException2() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22g7izr1282();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,97,100,83,116,97,116,105,99,70,105,101,108,100,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticFieldIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49538,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22g7izr1282() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49538);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49539);assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49540);final Field nonStaticField = FieldUtils.getField(PublicChild.class, "s");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49541);assumeNotNull(nonStaticField);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49542);FieldUtils.readStaticField(nonStaticField);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vcynci1287();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vcynci1287() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49543);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49544);assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(Foo.class, "VALUE")));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49545);assertEquals(Foo.VALUE, FieldUtils.readStaticField(FieldUtils.getField(PublicChild.class, "VALUE")));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testReadStaticFieldForceAccessIllegalArgumentException1() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqfdov128a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,97,100,83,116,97,116,105,99,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticFieldForceAccessIllegalArgumentException1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqfdov128a() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49546);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49547);FieldUtils.readStaticField(null, true);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testReadStaticFieldForceAccessIllegalArgumentException2() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bhfewe128c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,97,100,83,116,97,116,105,99,70,105,101,108,100,70,111,114,99,101,65,99,99,101,115,115,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadStaticFieldForceAccessIllegalArgumentException2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bhfewe128c() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49548);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49549);final Field nonStaticField = FieldUtils.getField(PublicChild.class, "s", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49550);assumeNotNull(nonStaticField);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49551);FieldUtils.readStaticField(nonStaticField);
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadNamedStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1wsxu128g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadNamedStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49552,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1wsxu128g() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49552);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49553);assertEquals(Foo.VALUE, FieldUtils.readStaticField(Foo.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49554);assertEquals(Foo.VALUE, FieldUtils.readStaticField(PubliclyShadowedChild.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49555);assertEquals(Foo.VALUE, FieldUtils.readStaticField(PrivatelyShadowedChild.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49556);assertEquals(Foo.VALUE, FieldUtils.readStaticField(PublicChild.class, "VALUE"));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49557);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49558);FieldUtils.readStaticField(null, "none");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49559);fail("null class should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49560);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49561);FieldUtils.readStaticField(Foo.class, null);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49562);fail("null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49563);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49564);FieldUtils.readStaticField(Foo.class, "");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49565);fail("empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49566);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49567);FieldUtils.readStaticField(Foo.class, " ");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49568);fail("blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49569);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49570);FieldUtils.readStaticField(Foo.class, "does_not_exist");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49571);fail("a field that doesn't exist should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49572);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49573);FieldUtils.readStaticField(PublicChild.class, "s");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49574);fail("non-static field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadNamedStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xv2l5x1293();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadNamedStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xv2l5x1293() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49575);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49576);assertEquals(Foo.VALUE, FieldUtils.readStaticField(Foo.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49577);assertEquals(Foo.VALUE, FieldUtils.readStaticField(PubliclyShadowedChild.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49578);assertEquals(Foo.VALUE, FieldUtils.readStaticField(PrivatelyShadowedChild.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49579);assertEquals("child", FieldUtils.readStaticField(PublicChild.class, "VALUE", true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49580);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49581);FieldUtils.readStaticField(null, "none", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49582);fail("null class should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49583);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49584);FieldUtils.readStaticField(Foo.class, null, true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49585);fail("null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49586);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49587);FieldUtils.readStaticField(Foo.class, "", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49588);fail("empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49589);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49590);FieldUtils.readStaticField(Foo.class, " ", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49591);fail("blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49592);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49593);FieldUtils.readStaticField(Foo.class, "does_not_exist", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49594);fail("a field that doesn't exist should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49595);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49596);FieldUtils.readStaticField(PublicChild.class, "s", false);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49597);fail("non-static field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadDeclaredNamedStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3n730129q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadDeclaredNamedStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3n730129q() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49598);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49599);assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(Foo.class, "VALUE"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49600);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49601);FieldUtils.readDeclaredStaticField(PublicChild.class, "VALUE");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49602);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49603);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49604);FieldUtils.readDeclaredStaticField(PubliclyShadowedChild.class, "VALUE");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49605);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49606);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49607);FieldUtils.readDeclaredStaticField(PrivatelyShadowedChild.class, "VALUE");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49608);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadDeclaredNamedStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f22scf12a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadDeclaredNamedStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f22scf12a1() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49609);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49610);assertEquals(Foo.VALUE, FieldUtils.readDeclaredStaticField(Foo.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49611);assertEquals("child", FieldUtils.readDeclaredStaticField(PublicChild.class, "VALUE", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49612);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49613);FieldUtils.readDeclaredStaticField(PubliclyShadowedChild.class, "VALUE", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49614);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49615);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49616);FieldUtils.readDeclaredStaticField(PrivatelyShadowedChild.class, "VALUE", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49617);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ecfgiv12aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49618,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ecfgiv12aa() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49618);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49619);final Field parentS = FieldUtils.getDeclaredField(parentClass, "s");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49620);assertEquals("s", FieldUtils.readField(parentS, publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49621);assertEquals("s", FieldUtils.readField(parentS, publiclyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49622);assertEquals("s", FieldUtils.readField(parentS, privatelyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49623);final Field parentB = FieldUtils.getDeclaredField(parentClass, "b", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49624);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49625);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publiclyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49626);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, privatelyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49627);final Field parentI = FieldUtils.getDeclaredField(parentClass, "i", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49628);assertEquals(I0, FieldUtils.readField(parentI, publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49629);assertEquals(I0, FieldUtils.readField(parentI, publiclyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49630);assertEquals(I0, FieldUtils.readField(parentI, privatelyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49631);final Field parentD = FieldUtils.getDeclaredField(parentClass, "d", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49632);assertEquals(D0, FieldUtils.readField(parentD, publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49633);assertEquals(D0, FieldUtils.readField(parentD, publiclyShadowedChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49634);assertEquals(D0, FieldUtils.readField(parentD, privatelyShadowedChild));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49635);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49636);FieldUtils.readField(null, publicChild);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49637);fail("a null field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m0s0kk12au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m0s0kk12au() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49638);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49639);final Field parentS = FieldUtils.getDeclaredField(parentClass, "s");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49640);parentS.setAccessible(false);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49641);assertEquals("s", FieldUtils.readField(parentS, publicChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49642);assertEquals("s", FieldUtils.readField(parentS, publiclyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49643);assertEquals("s", FieldUtils.readField(parentS, privatelyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49644);final Field parentB = FieldUtils.getDeclaredField(parentClass, "b", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49645);parentB.setAccessible(false);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49646);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publicChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49647);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, publiclyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49648);assertEquals(Boolean.FALSE, FieldUtils.readField(parentB, privatelyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49649);final Field parentI = FieldUtils.getDeclaredField(parentClass, "i", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49650);parentI.setAccessible(false);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49651);assertEquals(I0, FieldUtils.readField(parentI, publicChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49652);assertEquals(I0, FieldUtils.readField(parentI, publiclyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49653);assertEquals(I0, FieldUtils.readField(parentI, privatelyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49654);final Field parentD = FieldUtils.getDeclaredField(parentClass, "d", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49655);parentD.setAccessible(false);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49656);assertEquals(D0, FieldUtils.readField(parentD, publicChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49657);assertEquals(D0, FieldUtils.readField(parentD, publiclyShadowedChild, true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49658);assertEquals(D0, FieldUtils.readField(parentD, privatelyShadowedChild, true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49659);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49660);FieldUtils.readField(null, publicChild, true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49661);fail("a null field should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadNamedField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqw3ps12bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadNamedField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49662,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqw3ps12bi() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49662);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49663);assertEquals("s", FieldUtils.readField(publicChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49664);assertEquals("ss", FieldUtils.readField(publiclyShadowedChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49665);assertEquals("s", FieldUtils.readField(privatelyShadowedChild, "s"));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49666);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49667);FieldUtils.readField(publicChild, null);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49668);fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49669);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49670);FieldUtils.readField(publicChild, "");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49671);fail("an empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49672);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49673);FieldUtils.readField(publicChild, " ");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49674);fail("a blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49675);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49676);FieldUtils.readField((Object) null, "none");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49677);fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49678);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49679);FieldUtils.readField(publicChild, "b");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49680);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49681);assertEquals(Boolean.TRUE, FieldUtils.readField(publiclyShadowedChild, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49682);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49683);FieldUtils.readField(privatelyShadowedChild, "b");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49684);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49685);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49686);FieldUtils.readField(publicChild, "i");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49687);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49688);assertEquals(I1, FieldUtils.readField(publiclyShadowedChild, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49689);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49690);FieldUtils.readField(privatelyShadowedChild, "i");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49691);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49692);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49693);FieldUtils.readField(publicChild, "d");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49694);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49695);assertEquals(D1, FieldUtils.readField(publiclyShadowedChild, "d"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49696);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49697);FieldUtils.readField(privatelyShadowedChild, "d");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49698);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadNamedFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22t1zkd12cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadNamedFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22t1zkd12cj() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49699);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49700);assertEquals("s", FieldUtils.readField(publicChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49701);assertEquals("ss", FieldUtils.readField(publiclyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49702);assertEquals("ss", FieldUtils.readField(privatelyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49703);assertEquals(Boolean.FALSE, FieldUtils.readField(publicChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49704);assertEquals(Boolean.TRUE, FieldUtils.readField(publiclyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49705);assertEquals(Boolean.TRUE, FieldUtils.readField(privatelyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49706);assertEquals(I0, FieldUtils.readField(publicChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49707);assertEquals(I1, FieldUtils.readField(publiclyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49708);assertEquals(I1, FieldUtils.readField(privatelyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49709);assertEquals(D0, FieldUtils.readField(publicChild, "d", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49710);assertEquals(D1, FieldUtils.readField(publiclyShadowedChild, "d", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49711);assertEquals(D1, FieldUtils.readField(privatelyShadowedChild, "d", true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49712);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49713);FieldUtils.readField(publicChild, null, true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49714);fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49715);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49716);FieldUtils.readField(publicChild, "", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49717);fail("an empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49718);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49719);FieldUtils.readField(publicChild, " ", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49720);fail("a blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49721);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49722);FieldUtils.readField((Object) null, "none", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49723);fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadDeclaredNamedField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h1rdre12d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadDeclaredNamedField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h1rdre12d8() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49724);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49725);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49726);FieldUtils.readDeclaredField(publicChild, null);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49727);fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49728);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49729);FieldUtils.readDeclaredField(publicChild, "");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49730);fail("an empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49731);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49732);FieldUtils.readDeclaredField(publicChild, " ");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49733);fail("a blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49734);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49735);FieldUtils.readDeclaredField(null, "none");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49736);fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49737);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49738);FieldUtils.readDeclaredField(publicChild, "s");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49739);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49740);assertEquals("ss", FieldUtils.readDeclaredField(publiclyShadowedChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49741);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49742);FieldUtils.readDeclaredField(privatelyShadowedChild, "s");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49743);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49744);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49745);FieldUtils.readDeclaredField(publicChild, "b");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49746);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49747);assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49748);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49749);FieldUtils.readDeclaredField(privatelyShadowedChild, "b");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49750);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49751);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49752);FieldUtils.readDeclaredField(publicChild, "i");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49753);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49754);assertEquals(I1, FieldUtils.readDeclaredField(publiclyShadowedChild, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49755);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49756);FieldUtils.readDeclaredField(privatelyShadowedChild, "i");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49757);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49758);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49759);FieldUtils.readDeclaredField(publicChild, "d");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49760);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49761);assertEquals(D1, FieldUtils.readDeclaredField(publiclyShadowedChild, "d"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49762);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49763);FieldUtils.readDeclaredField(privatelyShadowedChild, "d");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49764);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testReadDeclaredNamedFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e5ll7112ed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testReadDeclaredNamedFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e5ll7112ed() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49765);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49766);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49767);FieldUtils.readDeclaredField(publicChild, null, true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49768);fail("a null field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49769);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49770);FieldUtils.readDeclaredField(publicChild, "", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49771);fail("an empty field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49772);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49773);FieldUtils.readDeclaredField(publicChild, " ", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49774);fail("a blank field name should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49775);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49776);FieldUtils.readDeclaredField(null, "none", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49777);fail("a null target should cause an IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // expected
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49778);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49779);FieldUtils.readDeclaredField(publicChild, "s", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49780);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49781);assertEquals("ss", FieldUtils.readDeclaredField(publiclyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49782);assertEquals("ss", FieldUtils.readDeclaredField(privatelyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49783);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49784);FieldUtils.readDeclaredField(publicChild, "b", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49785);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49786);assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49787);assertEquals(Boolean.TRUE, FieldUtils.readDeclaredField(privatelyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49788);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49789);FieldUtils.readDeclaredField(publicChild, "i", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49790);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49791);assertEquals(I1, FieldUtils.readDeclaredField(publiclyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49792);assertEquals(I1, FieldUtils.readDeclaredField(privatelyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49793);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49794);FieldUtils.readDeclaredField(publicChild, "d", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49795);fail("expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49796);assertEquals(D1, FieldUtils.readDeclaredField(publiclyShadowedChild, "d", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49797);assertEquals(D1, FieldUtils.readDeclaredField(privatelyShadowedChild, "d", true));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25qmsyi12fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25qmsyi12fa() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49798);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49799);Field field = StaticContainer.class.getDeclaredField("mutablePublic");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49800);FieldUtils.writeStaticField(field, "new");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49801);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49802);field = StaticContainer.class.getDeclaredField("mutableProtected");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49803);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49804);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49805);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49806);field = StaticContainer.class.getDeclaredField("mutablePackage");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49807);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49808);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49809);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49810);field = StaticContainer.class.getDeclaredField("mutablePrivate");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49811);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49812);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49813);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49814);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PUBLIC");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49815);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49816);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49817);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49818);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PROTECTED");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49819);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49820);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49821);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49822);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PACKAGE");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49823);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49824);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49825);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49826);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49827);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49828);FieldUtils.writeStaticField(field, "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49829);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c0e8p512g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c0e8p512g6() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49830);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49831);Field field = StaticContainer.class.getDeclaredField("mutablePublic");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49832);FieldUtils.writeStaticField(field, "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49833);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49834);field = StaticContainer.class.getDeclaredField("mutableProtected");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49835);FieldUtils.writeStaticField(field, "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49836);assertEquals("new", StaticContainer.getMutableProtected());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49837);field = StaticContainer.class.getDeclaredField("mutablePackage");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49838);FieldUtils.writeStaticField(field, "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49839);assertEquals("new", StaticContainer.getMutablePackage());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49840);field = StaticContainer.class.getDeclaredField("mutablePrivate");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49841);FieldUtils.writeStaticField(field, "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49842);assertEquals("new", StaticContainer.getMutablePrivate());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49843);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PUBLIC");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49844);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49845);FieldUtils.writeStaticField(field, "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49846);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49847);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PROTECTED");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49848);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49849);FieldUtils.writeStaticField(field, "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49850);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49851);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PACKAGE");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49852);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49853);FieldUtils.writeStaticField(field, "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49854);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49855);field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49856);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49857);FieldUtils.writeStaticField(field, "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49858);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteNamedStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kl7taf12gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteNamedStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kl7taf12gz() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49859);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49860);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePublic", "new");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49861);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49862);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49863);FieldUtils.writeStaticField(StaticContainerChild.class, "mutableProtected", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49864);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49865);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49866);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePackage", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49867);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49868);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49869);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePrivate", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49870);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49871);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49872);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PUBLIC", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49873);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49874);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49875);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PROTECTED", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49876);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49877);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49878);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PACKAGE", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49879);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49880);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49881);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PRIVATE", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49882);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteNamedStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_267uwy212hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteNamedStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_267uwy212hn() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49883);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49884);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePublic", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49885);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49886);FieldUtils.writeStaticField(StaticContainerChild.class, "mutableProtected", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49887);assertEquals("new", StaticContainer.getMutableProtected());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49888);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePackage", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49889);assertEquals("new", StaticContainer.getMutablePackage());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49890);FieldUtils.writeStaticField(StaticContainerChild.class, "mutablePrivate", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49891);assertEquals("new", StaticContainer.getMutablePrivate());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49892);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49893);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PUBLIC", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49894);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49895);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49896);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PROTECTED", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49897);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49898);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49899);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PACKAGE", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49900);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49901);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49902);FieldUtils.writeStaticField(StaticContainerChild.class, "IMMUTABLE_PRIVATE", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49903);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteDeclaredNamedStaticField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pnnyu912i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteDeclaredNamedStaticField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pnnyu912i8() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49904);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49905);FieldUtils.writeStaticField(StaticContainer.class, "mutablePublic", "new");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49906);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49907);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49908);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutableProtected", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49909);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49910);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49911);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePackage", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49912);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49913);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49914);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePrivate", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49915);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49916);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49917);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PUBLIC", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49918);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49919);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49920);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PROTECTED", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49921);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49922);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49923);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PACKAGE", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49924);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49925);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49926);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PRIVATE", "new");
            __CLR4_5_2123v123vlvha7i8i.R.inc(49927);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteDeclaredNamedStaticFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pn0hng12iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteDeclaredNamedStaticFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pn0hng12iw() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49928);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49929);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePublic", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49930);assertEquals("new", StaticContainer.mutablePublic);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49931);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutableProtected", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49932);assertEquals("new", StaticContainer.getMutableProtected());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49933);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePackage", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49934);assertEquals("new", StaticContainer.getMutablePackage());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49935);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "mutablePrivate", "new", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49936);assertEquals("new", StaticContainer.getMutablePrivate());
        __CLR4_5_2123v123vlvha7i8i.R.inc(49937);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49938);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PUBLIC", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49939);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49940);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49941);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PROTECTED", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49942);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49943);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49944);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PACKAGE", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49945);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49946);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49947);FieldUtils.writeDeclaredStaticField(StaticContainer.class, "IMMUTABLE_PRIVATE", "new", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49948);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9mnkc12jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9mnkc12jh() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49949);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49950);Field field = parentClass.getDeclaredField("s");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49951);FieldUtils.writeField(field, publicChild, "S");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49952);assertEquals("S", field.get(publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49953);field = parentClass.getDeclaredField("b");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49954);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49955);FieldUtils.writeField(field, publicChild, Boolean.TRUE);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49956);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49957);field = parentClass.getDeclaredField("i");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49958);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49959);FieldUtils.writeField(field, publicChild, Integer.valueOf(Integer.MAX_VALUE));
            __CLR4_5_2123v123vlvha7i8i.R.inc(49960);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49961);field = parentClass.getDeclaredField("d");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49962);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49963);FieldUtils.writeField(field, publicChild, Double.valueOf(Double.MAX_VALUE));
            __CLR4_5_2123v123vlvha7i8i.R.inc(49964);fail("Expected IllegalAccessException");
        } catch (final IllegalAccessException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ok30x512jx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ok30x512jx() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49965);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49966);Field field = parentClass.getDeclaredField("s");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49967);FieldUtils.writeField(field, publicChild, "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49968);assertEquals("S", field.get(publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49969);field = parentClass.getDeclaredField("b");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49970);FieldUtils.writeField(field, publicChild, Boolean.TRUE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49971);assertEquals(Boolean.TRUE, field.get(publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49972);field = parentClass.getDeclaredField("i");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49973);FieldUtils.writeField(field, publicChild, Integer.valueOf(Integer.MAX_VALUE), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49974);assertEquals(Integer.valueOf(Integer.MAX_VALUE), field.get(publicChild));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49975);field = parentClass.getDeclaredField("d");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49976);FieldUtils.writeField(field, publicChild, Double.valueOf(Double.MAX_VALUE), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49977);assertEquals(Double.valueOf(Double.MAX_VALUE), field.get(publicChild));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteNamedField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),49978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ndnllh12ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteNamedField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ndnllh12ka() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(49978);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49979);FieldUtils.writeField(publicChild, "s", "S");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49980);assertEquals("S", FieldUtils.readField(publicChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49981);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49982);FieldUtils.writeField(publicChild, "b", Boolean.TRUE);
            __CLR4_5_2123v123vlvha7i8i.R.inc(49983);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49984);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49985);FieldUtils.writeField(publicChild, "i", Integer.valueOf(1));
            __CLR4_5_2123v123vlvha7i8i.R.inc(49986);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(49987);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(49988);FieldUtils.writeField(publicChild, "d", Double.valueOf(1.0));
            __CLR4_5_2123v123vlvha7i8i.R.inc(49989);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(49990);FieldUtils.writeField(publiclyShadowedChild, "s", "S");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49991);assertEquals("S", FieldUtils.readField(publiclyShadowedChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49992);FieldUtils.writeField(publiclyShadowedChild, "b", Boolean.FALSE);
        __CLR4_5_2123v123vlvha7i8i.R.inc(49993);assertEquals(Boolean.FALSE, FieldUtils.readField(publiclyShadowedChild, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49994);FieldUtils.writeField(publiclyShadowedChild, "i", Integer.valueOf(0));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49995);assertEquals(Integer.valueOf(0), FieldUtils.readField(publiclyShadowedChild, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49996);FieldUtils.writeField(publiclyShadowedChild, "d", Double.valueOf(0.0));
        __CLR4_5_2123v123vlvha7i8i.R.inc(49997);assertEquals(Double.valueOf(0.0), FieldUtils.readField(publiclyShadowedChild, "d"));

        __CLR4_5_2123v123vlvha7i8i.R.inc(49998);FieldUtils.writeField(privatelyShadowedChild, "s", "S");
        __CLR4_5_2123v123vlvha7i8i.R.inc(49999);assertEquals("S", FieldUtils.readField(privatelyShadowedChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50000);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50001);FieldUtils.writeField(privatelyShadowedChild, "b", Boolean.TRUE);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50002);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50003);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50004);FieldUtils.writeField(privatelyShadowedChild, "i", Integer.valueOf(1));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50005);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50006);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50007);FieldUtils.writeField(privatelyShadowedChild, "d", Double.valueOf(1.0));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50008);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteNamedFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vsr2w12l5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteNamedFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vsr2w12l5() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50009);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50010);FieldUtils.writeField(publicChild, "s", "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50011);assertEquals("S", FieldUtils.readField(publicChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50012);FieldUtils.writeField(publicChild, "b", Boolean.TRUE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50013);assertEquals(Boolean.TRUE, FieldUtils.readField(publicChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50014);FieldUtils.writeField(publicChild, "i", Integer.valueOf(1), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50015);assertEquals(Integer.valueOf(1), FieldUtils.readField(publicChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50016);FieldUtils.writeField(publicChild, "d", Double.valueOf(1.0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50017);assertEquals(Double.valueOf(1.0), FieldUtils.readField(publicChild, "d", true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(50018);FieldUtils.writeField(publiclyShadowedChild, "s", "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50019);assertEquals("S", FieldUtils.readField(publiclyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50020);FieldUtils.writeField(publiclyShadowedChild, "b", Boolean.FALSE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50021);assertEquals(Boolean.FALSE, FieldUtils.readField(publiclyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50022);FieldUtils.writeField(publiclyShadowedChild, "i", Integer.valueOf(0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50023);assertEquals(Integer.valueOf(0), FieldUtils.readField(publiclyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50024);FieldUtils.writeField(publiclyShadowedChild, "d", Double.valueOf(0.0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50025);assertEquals(Double.valueOf(0.0), FieldUtils.readField(publiclyShadowedChild, "d", true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(50026);FieldUtils.writeField(privatelyShadowedChild, "s", "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50027);assertEquals("S", FieldUtils.readField(privatelyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50028);FieldUtils.writeField(privatelyShadowedChild, "b", Boolean.FALSE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50029);assertEquals(Boolean.FALSE, FieldUtils.readField(privatelyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50030);FieldUtils.writeField(privatelyShadowedChild, "i", Integer.valueOf(0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50031);assertEquals(Integer.valueOf(0), FieldUtils.readField(privatelyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50032);FieldUtils.writeField(privatelyShadowedChild, "d", Double.valueOf(0.0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50033);assertEquals(Double.valueOf(0.0), FieldUtils.readField(privatelyShadowedChild, "d", true));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteDeclaredNamedField() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2voa7gx12lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteDeclaredNamedField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2voa7gx12lu() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50034);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50035);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50036);FieldUtils.writeDeclaredField(publicChild, "s", "S");
            __CLR4_5_2123v123vlvha7i8i.R.inc(50037);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50038);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50039);FieldUtils.writeDeclaredField(publicChild, "b", Boolean.TRUE);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50040);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50041);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50042);FieldUtils.writeDeclaredField(publicChild, "i", Integer.valueOf(1));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50043);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50044);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50045);FieldUtils.writeDeclaredField(publicChild, "d", Double.valueOf(1.0));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50046);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(50047);FieldUtils.writeDeclaredField(publiclyShadowedChild, "s", "S");
        __CLR4_5_2123v123vlvha7i8i.R.inc(50048);assertEquals("S", FieldUtils.readDeclaredField(publiclyShadowedChild, "s"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50049);FieldUtils.writeDeclaredField(publiclyShadowedChild, "b", Boolean.FALSE);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50050);assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50051);FieldUtils.writeDeclaredField(publiclyShadowedChild, "i", Integer.valueOf(0));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50052);assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(publiclyShadowedChild, "i"));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50053);FieldUtils.writeDeclaredField(publiclyShadowedChild, "d", Double.valueOf(0.0));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50054);assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(publiclyShadowedChild, "d"));

        __CLR4_5_2123v123vlvha7i8i.R.inc(50055);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50056);FieldUtils.writeDeclaredField(privatelyShadowedChild, "s", "S");
            __CLR4_5_2123v123vlvha7i8i.R.inc(50057);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50058);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50059);FieldUtils.writeDeclaredField(privatelyShadowedChild, "b", Boolean.TRUE);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50060);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50061);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50062);FieldUtils.writeDeclaredField(privatelyShadowedChild, "i", Integer.valueOf(1));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50063);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50064);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50065);FieldUtils.writeDeclaredField(privatelyShadowedChild, "d", Double.valueOf(1.0));
            __CLR4_5_2123v123vlvha7i8i.R.inc(50066);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testWriteDeclaredNamedFieldForceAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d1wm4212mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testWriteDeclaredNamedFieldForceAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d1wm4212mr() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50067);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50068);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50069);FieldUtils.writeDeclaredField(publicChild, "s", "S", true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50070);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50071);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50072);FieldUtils.writeDeclaredField(publicChild, "b", Boolean.TRUE, true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50073);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50074);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50075);FieldUtils.writeDeclaredField(publicChild, "i", Integer.valueOf(1), true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50076);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }
        __CLR4_5_2123v123vlvha7i8i.R.inc(50077);try {
            __CLR4_5_2123v123vlvha7i8i.R.inc(50078);FieldUtils.writeDeclaredField(publicChild, "d", Double.valueOf(1.0), true);
            __CLR4_5_2123v123vlvha7i8i.R.inc(50079);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            // pass
        }

        __CLR4_5_2123v123vlvha7i8i.R.inc(50080);FieldUtils.writeDeclaredField(publiclyShadowedChild, "s", "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50081);assertEquals("S", FieldUtils.readDeclaredField(publiclyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50082);FieldUtils.writeDeclaredField(publiclyShadowedChild, "b", Boolean.FALSE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50083);assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(publiclyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50084);FieldUtils.writeDeclaredField(publiclyShadowedChild, "i", Integer.valueOf(0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50085);assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(publiclyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50086);FieldUtils.writeDeclaredField(publiclyShadowedChild, "d", Double.valueOf(0.0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50087);assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(publiclyShadowedChild, "d", true));

        __CLR4_5_2123v123vlvha7i8i.R.inc(50088);FieldUtils.writeDeclaredField(privatelyShadowedChild, "s", "S", true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50089);assertEquals("S", FieldUtils.readDeclaredField(privatelyShadowedChild, "s", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50090);FieldUtils.writeDeclaredField(privatelyShadowedChild, "b", Boolean.FALSE, true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50091);assertEquals(Boolean.FALSE, FieldUtils.readDeclaredField(privatelyShadowedChild, "b", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50092);FieldUtils.writeDeclaredField(privatelyShadowedChild, "i", Integer.valueOf(0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50093);assertEquals(Integer.valueOf(0), FieldUtils.readDeclaredField(privatelyShadowedChild, "i", true));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50094);FieldUtils.writeDeclaredField(privatelyShadowedChild, "d", Double.valueOf(0.0), true);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50095);assertEquals(Double.valueOf(0.0), FieldUtils.readDeclaredField(privatelyShadowedChild, "d", true));
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testAmbig() {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_231qzmx12nk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,109,98,105,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testAmbig",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_231qzmx12nk(){try{__CLR4_5_2123v123vlvha7i8i.R.inc(50096);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50097);FieldUtils.getField(Ambig.class, "VALUE");
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testRemoveFinalModifier() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24jm6ri12nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testRemoveFinalModifier",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24jm6ri12nm() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50098);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50099);final Field field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE_2");
        __CLR4_5_2123v123vlvha7i8i.R.inc(50100);assertFalse(field.isAccessible());
        __CLR4_5_2123v123vlvha7i8i.R.inc(50101);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50102);FieldUtils.removeFinalModifier(field);
        // The field is no longer final
        __CLR4_5_2123v123vlvha7i8i.R.inc(50103);assertFalse(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50104);assertFalse(field.isAccessible());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}
    
    @Test
    public void testRemoveFinalModifierWithAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2khmzzc12nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testRemoveFinalModifierWithAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2khmzzc12nt() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50105);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50106);final Field field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE_2");
        __CLR4_5_2123v123vlvha7i8i.R.inc(50107);assertFalse(field.isAccessible());
        __CLR4_5_2123v123vlvha7i8i.R.inc(50108);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50109);FieldUtils.removeFinalModifier(field, true);
        // The field is no longer final
        __CLR4_5_2123v123vlvha7i8i.R.inc(50110);assertFalse(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50111);assertFalse(field.isAccessible());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testRemoveFinalModifierWithoutAccess() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ecxqsc12o0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testRemoveFinalModifierWithoutAccess",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ecxqsc12o0() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50112);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50113);final Field field = StaticContainer.class.getDeclaredField("IMMUTABLE_PRIVATE_2");
        __CLR4_5_2123v123vlvha7i8i.R.inc(50114);assertFalse(field.isAccessible());
        __CLR4_5_2123v123vlvha7i8i.R.inc(50115);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50116);FieldUtils.removeFinalModifier(field, false);
        // The field is STILL final because we did not force access
        __CLR4_5_2123v123vlvha7i8i.R.inc(50117);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50118);assertFalse(field.isAccessible());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

    @Test
    public void testRemoveFinalModifierAccessNotNeeded() throws Exception {__CLR4_5_2123v123vlvha7i8i.R.globalSliceStart(getClass().getName(),50119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ew1zuc12o7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2123v123vlvha7i8i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2123v123vlvha7i8i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.FieldUtilsTest.testRemoveFinalModifierAccessNotNeeded",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ew1zuc12o7() throws Exception{try{__CLR4_5_2123v123vlvha7i8i.R.inc(50119);
        __CLR4_5_2123v123vlvha7i8i.R.inc(50120);final Field field = StaticContainer.class.getDeclaredField("IMMUTABLE_PACKAGE");
        __CLR4_5_2123v123vlvha7i8i.R.inc(50121);assertFalse(field.isAccessible());
        __CLR4_5_2123v123vlvha7i8i.R.inc(50122);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50123);FieldUtils.removeFinalModifier(field, false);
        // The field is no longer final AND we did not need to force access
        __CLR4_5_2123v123vlvha7i8i.R.inc(50124);assertTrue(Modifier.isFinal(field.getModifiers()));
        __CLR4_5_2123v123vlvha7i8i.R.inc(50125);assertFalse(field.isAccessible());
    }finally{__CLR4_5_2123v123vlvha7i8i.R.flushNeeded();}}

}
