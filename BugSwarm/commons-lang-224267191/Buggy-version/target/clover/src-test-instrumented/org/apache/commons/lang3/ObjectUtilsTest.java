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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.text.StrBuilder;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ObjectUtils}.
 */
@SuppressWarnings("deprecation") // deliberate use of deprecated code
public class ObjectUtilsTest {static class __CLR4_5_2pbspbslvha7fyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,33143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";
    private static final String BAR = "bar";

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hpbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hpbs(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32824);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32825);assertNotNull(new ObjectUtils());
        __CLR4_5_2pbspbslvha7fyl.R.inc(32826);final Constructor<?>[] cons = ObjectUtils.class.getDeclaredConstructors();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32827);assertEquals(1, cons.length);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32828);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32829);assertTrue(Modifier.isPublic(ObjectUtils.class.getModifiers()));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32830);assertFalse(Modifier.isFinal(ObjectUtils.class.getModifiers()));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsNull() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ant4pipbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIsNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ant4pipbz(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32831);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32832);final Object o = FOO;
        __CLR4_5_2pbspbslvha7fyl.R.inc(32833);final Object dflt = BAR;
        __CLR4_5_2pbspbslvha7fyl.R.inc(32834);assertSame("dflt was not returned when o was null", dflt, ObjectUtils.defaultIfNull(null, dflt));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32835);assertSame("dflt was returned when o was not null", o, ObjectUtils.defaultIfNull(o, dflt));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testFirstNonNull() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27qp3fnpc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testFirstNonNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27qp3fnpc4(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32836);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32837);assertEquals("", ObjectUtils.firstNonNull(null, ""));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32838);final String firstNonNullGenerics = ObjectUtils.firstNonNull(null, null, "123", "456");
        __CLR4_5_2pbspbslvha7fyl.R.inc(32839);assertEquals("123", firstNonNullGenerics);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32840);assertEquals("123", ObjectUtils.firstNonNull("123", null, "456", null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32841);assertSame(Boolean.TRUE, ObjectUtils.firstNonNull(Boolean.TRUE));
        
        // Explicitly pass in an empty array of Object type to ensure compiler doesn't complain of unchecked generic array creation
        __CLR4_5_2pbspbslvha7fyl.R.inc(32842);assertNull(ObjectUtils.firstNonNull(new Object[0]));
        
        // Cast to Object in line below ensures compiler doesn't complain of unchecked generic array creation
        __CLR4_5_2pbspbslvha7fyl.R.inc(32843);assertNull(ObjectUtils.firstNonNull(null, null));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32844);assertNull(ObjectUtils.firstNonNull((Object) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32845);assertNull(ObjectUtils.firstNonNull((Object[]) null));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#anyNotNull(Object...)}.
     */
    @Test
    public void testAnyNotNull() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ugpp5pce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testAnyNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ugpp5pce(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32846);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32847);assertFalse(ObjectUtils.anyNotNull());
        __CLR4_5_2pbspbslvha7fyl.R.inc(32848);assertFalse(ObjectUtils.anyNotNull((Object) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32849);assertFalse(ObjectUtils.anyNotNull((Object[]) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32850);assertFalse(ObjectUtils.anyNotNull(null, null, null));

        __CLR4_5_2pbspbslvha7fyl.R.inc(32851);assertTrue(ObjectUtils.anyNotNull(FOO));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32852);assertTrue(ObjectUtils.anyNotNull(null, FOO, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32853);assertTrue(ObjectUtils.anyNotNull(null, null, null, null, FOO, BAR));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#allNotNull(Object...)}.
     */
    @Test
    public void testAllNotNull() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rzqrpqpcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testAllNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rzqrpqpcm(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32854);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32855);assertFalse(ObjectUtils.allNotNull((Object) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32856);assertFalse(ObjectUtils.allNotNull((Object[]) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32857);assertFalse(ObjectUtils.allNotNull(null, null, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32858);assertFalse(ObjectUtils.allNotNull(null, FOO, BAR));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32859);assertFalse(ObjectUtils.allNotNull(FOO, BAR, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32860);assertFalse(ObjectUtils.allNotNull(FOO, BAR, null, FOO, BAR));

        __CLR4_5_2pbspbslvha7fyl.R.inc(32861);assertTrue(ObjectUtils.allNotNull());
        __CLR4_5_2pbspbslvha7fyl.R.inc(32862);assertTrue(ObjectUtils.allNotNull(FOO));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32863);assertTrue(ObjectUtils.allNotNull(FOO, BAR, 1, Boolean.TRUE, new Object(), new Object[]{}));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608pcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608pcw(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32864);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32865);assertTrue("ObjectUtils.equals(null, null) returned false", ObjectUtils.equals(null, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32866);assertTrue("ObjectUtils.equals(\"foo\", null) returned true", !ObjectUtils.equals(FOO, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32867);assertTrue("ObjectUtils.equals(null, \"bar\") returned true", !ObjectUtils.equals(null, BAR));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32868);assertTrue("ObjectUtils.equals(\"foo\", \"bar\") returned true", !ObjectUtils.equals(FOO, BAR));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32869);assertTrue("ObjectUtils.equals(\"foo\", \"foo\") returned false", ObjectUtils.equals(FOO, FOO));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testNotEqual() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rfc14qpd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testNotEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rfc14qpd2(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32870);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32871);assertFalse("ObjectUtils.notEqual(null, null) returned false", ObjectUtils.notEqual(null, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32872);assertTrue("ObjectUtils.notEqual(\"foo\", null) returned true", ObjectUtils.notEqual(FOO, null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32873);assertTrue("ObjectUtils.notEqual(null, \"bar\") returned true", ObjectUtils.notEqual(null, BAR));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32874);assertTrue("ObjectUtils.notEqual(\"foo\", \"bar\") returned true", ObjectUtils.notEqual(FOO, BAR));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32875);assertFalse("ObjectUtils.notEqual(\"foo\", \"foo\") returned false", ObjectUtils.notEqual(FOO, FOO));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8pd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8pd8(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32876);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32877);assertEquals(0, ObjectUtils.hashCode(null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32878);assertEquals("a".hashCode(), ObjectUtils.hashCode("a"));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_emptyArray() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wk88s1pdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_emptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wk88s1pdb(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32879);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32880);final Object[] array = new Object[0];
        __CLR4_5_2pbspbslvha7fyl.R.inc(32881);assertEquals(1, ObjectUtils.hashCodeMulti(array));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_nullArray() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oam1nhpde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_nullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oam1nhpde(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32882);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32883);final Object[] array = null;
        __CLR4_5_2pbspbslvha7fyl.R.inc(32884);assertEquals(1, ObjectUtils.hashCodeMulti(array));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_likeList() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yyboawpdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_likeList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yyboawpdh(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32885);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32886);final List<Object> list0 = new ArrayList<>(Arrays.asList(new Object[0]));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32887);assertEquals(list0.hashCode(), ObjectUtils.hashCodeMulti());
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32888);final List<Object> list1 = new ArrayList<Object>(Arrays.asList("a"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32889);assertEquals(list1.hashCode(), ObjectUtils.hashCodeMulti("a"));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32890);final List<Object> list2 = new ArrayList<Object>(Arrays.asList("a", "b"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32891);assertEquals(list2.hashCode(), ObjectUtils.hashCodeMulti("a", "b"));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32892);final List<Object> list3 = new ArrayList<Object>(Arrays.asList("a", "b", "c"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32893);assertEquals(list3.hashCode(), ObjectUtils.hashCodeMulti("a", "b", "c"));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testIdentityToStringStringBuffer() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qw618pdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIdentityToStringStringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qw618pdq(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32894);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32895);final Integer i = Integer.valueOf(45);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32896);final String expected = "java.lang.Integer@" + Integer.toHexString(System.identityHashCode(i));

        __CLR4_5_2pbspbslvha7fyl.R.inc(32897);final StringBuffer buffer = new StringBuffer();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32898);ObjectUtils.identityToString(buffer, i);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32899);assertEquals(expected, buffer.toString());

        __CLR4_5_2pbspbslvha7fyl.R.inc(32900);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32901);ObjectUtils.identityToString((StringBuffer)null, "tmp");
            __CLR4_5_2pbspbslvha7fyl.R.inc(32902);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
        __CLR4_5_2pbspbslvha7fyl.R.inc(32903);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32904);ObjectUtils.identityToString(new StringBuffer(), null);
            __CLR4_5_2pbspbslvha7fyl.R.inc(32905);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    
    @Test
    public void testIdentityToStringStringBuilder() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q7yea3pe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIdentityToStringStringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q7yea3pe2(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32906);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32907);assertEquals(null, ObjectUtils.identityToString(null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32908);assertEquals(
            "java.lang.String@" + Integer.toHexString(System.identityHashCode(FOO)),
            ObjectUtils.identityToString(FOO));
        __CLR4_5_2pbspbslvha7fyl.R.inc(32909);final Integer i = Integer.valueOf(90);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32910);final String expected = "java.lang.Integer@" + Integer.toHexString(System.identityHashCode(i));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32911);assertEquals(expected, ObjectUtils.identityToString(i));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32912);final StringBuilder builder = new StringBuilder();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32913);ObjectUtils.identityToString(builder, i);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32914);assertEquals(expected, builder.toString());

        __CLR4_5_2pbspbslvha7fyl.R.inc(32915);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32916);ObjectUtils.identityToString((StringBuilder)null, "tmp");
            __CLR4_5_2pbspbslvha7fyl.R.inc(32917);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32918);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32919);ObjectUtils.identityToString(new StringBuilder(), null);
            __CLR4_5_2pbspbslvha7fyl.R.inc(32920);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    
    @Test
    public void testIdentityToStringStrBuilder() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qjlbylpeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIdentityToStringStrBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qjlbylpeh(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32921);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32922);final Integer i = Integer.valueOf(102);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32923);final String expected = "java.lang.Integer@" + Integer.toHexString(System.identityHashCode(i));

        __CLR4_5_2pbspbslvha7fyl.R.inc(32924);final StrBuilder builder = new StrBuilder();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32925);ObjectUtils.identityToString(builder, i);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32926);assertEquals(expected, builder.toString());

        __CLR4_5_2pbspbslvha7fyl.R.inc(32927);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32928);ObjectUtils.identityToString((StrBuilder)null, "tmp");
            __CLR4_5_2pbspbslvha7fyl.R.inc(32929);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32930);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32931);ObjectUtils.identityToString(new StrBuilder(), null);
            __CLR4_5_2pbspbslvha7fyl.R.inc(32932);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    
    @Test
    public void testIdentityToStringAppendable() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eqrglzpet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIdentityToStringAppendable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32933,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eqrglzpet(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32933);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32934);final Integer i = Integer.valueOf(121);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32935);final String expected = "java.lang.Integer@" + Integer.toHexString(System.identityHashCode(i));

        __CLR4_5_2pbspbslvha7fyl.R.inc(32936);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32937);final Appendable appendable = new StringBuilder();
            __CLR4_5_2pbspbslvha7fyl.R.inc(32938);ObjectUtils.identityToString(appendable, i);
            __CLR4_5_2pbspbslvha7fyl.R.inc(32939);assertEquals(expected, appendable.toString());
        } catch(final IOException ex) {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32940);fail("IOException unexpected");
        }
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32941);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32942);ObjectUtils.identityToString((Appendable)null, "tmp");
            __CLR4_5_2pbspbslvha7fyl.R.inc(32943);fail("NullPointerException expected");
        } catch(final NullPointerException expectedException) {
        } catch(final IOException ex) {
          __CLR4_5_2pbspbslvha7fyl.R.inc(32944);fail("IOException unexpected");
        }

        __CLR4_5_2pbspbslvha7fyl.R.inc(32945);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(32946);ObjectUtils.identityToString((Appendable)(new StringBuilder()), null);
            __CLR4_5_2pbspbslvha7fyl.R.inc(32947);fail("NullPointerException expected");
        } catch(final NullPointerException expectedException) {
        } catch(final IOException ex) {
          __CLR4_5_2pbspbslvha7fyl.R.inc(32948);fail("IOException unexpected");
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testToString_Object() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1wh5zpf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testToString_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1wh5zpf9(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32949);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32950);assertEquals("", ObjectUtils.toString(null) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32951);assertEquals(Boolean.TRUE.toString(), ObjectUtils.toString(Boolean.TRUE) );
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testToString_ObjectString() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28qnit4pfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testToString_ObjectString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28qnit4pfc(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32952);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32953);assertEquals(BAR, ObjectUtils.toString(null, BAR) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32954);assertEquals(Boolean.TRUE.toString(), ObjectUtils.toString(Boolean.TRUE, BAR) );
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @SuppressWarnings("cast") // 1 OK, because we are checking for code change
    @Test
    public void testNull() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29231k0pff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29231k0pff(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32955);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32956);assertNotNull(ObjectUtils.NULL);
        // 1 Check that NULL really is a Null i.e. the definition has not been changed
        __CLR4_5_2pbspbslvha7fyl.R.inc(32957);assertTrue(ObjectUtils.NULL instanceof ObjectUtils.Null);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32958);assertSame(ObjectUtils.NULL, SerializationUtils.clone(ObjectUtils.NULL));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testMax() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hxwg3rpfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hxwg3rpfj(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32959);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32960);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32961);final Date nonNullComparable1 = calendar.getTime();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32962);final Date nonNullComparable2 = calendar.getTime();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32963);final String[] nullArray = null;
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32964);calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32965);final Date minComparable = calendar.getTime();
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32966);assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32967);assertNull(ObjectUtils.max( (String) null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32968);assertNull(ObjectUtils.max( nullArray ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32969);assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32970);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32971);assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1, null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32972);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, nonNullComparable2 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32973);assertSame( nonNullComparable2, ObjectUtils.max( nonNullComparable2, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32974);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, minComparable ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32975);assertSame( nonNullComparable1, ObjectUtils.max( minComparable, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32976);assertSame( nonNullComparable1, ObjectUtils.max( null, minComparable, null, nonNullComparable1 ) );

        __CLR4_5_2pbspbslvha7fyl.R.inc(32977);assertNull( ObjectUtils.max(null, null) );
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testMin() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2psd1llpg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2psd1llpg2(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32978);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32979);final Calendar calendar = Calendar.getInstance();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32980);final Date nonNullComparable1 = calendar.getTime();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32981);final Date nonNullComparable2 = calendar.getTime();
        __CLR4_5_2pbspbslvha7fyl.R.inc(32982);final String[] nullArray = null;
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32983);calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32984);final Date minComparable = calendar.getTime();
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32985);assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(32986);assertNull(ObjectUtils.min( (String) null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32987);assertNull(ObjectUtils.min( nullArray ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32988);assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32989);assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32990);assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1, null ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32991);assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, nonNullComparable2 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32992);assertSame( nonNullComparable2, ObjectUtils.min( nonNullComparable2, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32993);assertSame( minComparable, ObjectUtils.min( nonNullComparable1, minComparable ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32994);assertSame( minComparable, ObjectUtils.min( minComparable, nonNullComparable1 ) );
        __CLR4_5_2pbspbslvha7fyl.R.inc(32995);assertSame( minComparable, ObjectUtils.min( null, nonNullComparable1, null, minComparable ) );

        __CLR4_5_2pbspbslvha7fyl.R.inc(32996);assertNull( ObjectUtils.min(null, null) );
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#compare(Comparable, Comparable, boolean)}.
     */
    @Test
    public void testCompare() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),32997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o8au2pgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),32997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o8au2pgl(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(32997);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32998);final Integer one = Integer.valueOf(1);
        __CLR4_5_2pbspbslvha7fyl.R.inc(32999);final Integer two = Integer.valueOf(2);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33000);final Integer nullValue = null;

        __CLR4_5_2pbspbslvha7fyl.R.inc(33001);assertEquals("Null Null false", 0, ObjectUtils.compare(nullValue, nullValue));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33002);assertEquals("Null Null true",  0, ObjectUtils.compare(nullValue, nullValue, true));

        __CLR4_5_2pbspbslvha7fyl.R.inc(33003);assertEquals("Null one false", -1, ObjectUtils.compare(nullValue, one));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33004);assertEquals("Null one true",   1, ObjectUtils.compare(nullValue, one, true));
        
        __CLR4_5_2pbspbslvha7fyl.R.inc(33005);assertEquals("one Null false", 1, ObjectUtils.compare(one, nullValue));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33006);assertEquals("one Null true", -1, ObjectUtils.compare(one, nullValue, true));

        __CLR4_5_2pbspbslvha7fyl.R.inc(33007);assertEquals("one two false", -1, ObjectUtils.compare(one, two));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33008);assertEquals("one two true",  -1, ObjectUtils.compare(one, two, true));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testMedian() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2apj4lfpgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2apj4lfpgx(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33009);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33010);assertEquals("foo", ObjectUtils.median("foo"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33011);assertEquals("bar", ObjectUtils.median("foo", "bar"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33012);assertEquals("baz", ObjectUtils.median("foo", "bar", "baz"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33013);assertEquals("baz", ObjectUtils.median("foo", "bar", "baz", "blah"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33014);assertEquals("blah", ObjectUtils.median("foo", "bar", "baz", "blah", "wah"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33015);assertEquals(Integer.valueOf(5),
            ObjectUtils.median(Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(10)));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33016);assertEquals(
            Integer.valueOf(7),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8),
                Integer.valueOf(9)));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33017);assertEquals(Integer.valueOf(6),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testMedian_nullItems() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5vfb7ph6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,101,100,105,97,110,95,110,117,108,108,73,116,101,109,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian_nullItems",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33018,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5vfb7ph6(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33018);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33019);ObjectUtils.median((String[]) null);
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMedian_emptyItems() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23jjil9ph8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,101,100,105,97,110,95,101,109,112,116,121,73,116,101,109,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian_emptyItems",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23jjil9ph8(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33020);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33021);ObjectUtils.<String> median();
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testComparatorMedian() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qmiqexpha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qmiqexpha(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33022);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33023);final CharSequenceComparator cmp = new CharSequenceComparator();
        __CLR4_5_2pbspbslvha7fyl.R.inc(33024);final NonComparableCharSequence foo = new NonComparableCharSequence("foo");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33025);final NonComparableCharSequence bar = new NonComparableCharSequence("bar");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33026);final NonComparableCharSequence baz = new NonComparableCharSequence("baz");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33027);final NonComparableCharSequence blah = new NonComparableCharSequence("blah");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33028);final NonComparableCharSequence wah = new NonComparableCharSequence("wah");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33029);assertSame(foo, ObjectUtils.median(cmp, foo));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33030);assertSame(bar, ObjectUtils.median(cmp, foo, bar));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33031);assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33032);assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz, blah));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33033);assertSame(blah, ObjectUtils.median(cmp, foo, bar, baz, blah, wah));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testComparatorMedian_nullComparator() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u25m6nphm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,110,117,108,108,67,111,109,112,97,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_nullComparator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u25m6nphm(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33034);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33035);ObjectUtils.median((Comparator<CharSequence>) null, new NonComparableCharSequence("foo"));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testComparatorMedian_nullItems() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lx66lpho();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,110,117,108,108,73,116,101,109,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_nullItems",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lx66lpho(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33036);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33037);ObjectUtils.median(new CharSequenceComparator(), (CharSequence[]) null);
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testComparatorMedian_emptyItems() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnt9lzphq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,101,109,112,116,121,73,116,101,109,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_emptyItems",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnt9lzphq(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33038);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33039);ObjectUtils.median(new CharSequenceComparator());
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testMode() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mixofwphs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mixofwphs(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33040);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33041);assertNull(ObjectUtils.mode((Object[]) null));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33042);assertNull(ObjectUtils.mode());
        __CLR4_5_2pbspbslvha7fyl.R.inc(33043);assertNull(ObjectUtils.mode("foo", "bar", "baz"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33044);assertNull(ObjectUtils.mode("foo", "bar", "baz", "foo", "bar"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33045);assertEquals("foo", ObjectUtils.mode("foo", "bar", "baz", "foo"));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33046);assertEquals(Integer.valueOf(9),
            ObjectUtils.mode("foo", "bar", "baz", Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(9)));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a cloneable object.
     */
    @Test
    public void testCloneOfCloneable() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25p2x98phz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfCloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25p2x98phz(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33047);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33048);final CloneableString string = new CloneableString("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33049);final CloneableString stringClone = ObjectUtils.clone(string);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33050);assertEquals("apache", stringClone.getValue());
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a not cloneable object.
     */
    @Test
    public void testCloneOfNotCloneable() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zifo8dpi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfNotCloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zifo8dpi3(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33051);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33052);final String string = new String("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33053);assertNull(ObjectUtils.clone(string));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an uncloneable object.
     *
     * @throws java.lang.Throwable because we expect this to fail
     */
    @Test(expected = NoSuchMethodException.class)
    public void testCloneOfUncloneable() throws Throwable {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fhvg1vpi6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,108,111,110,101,79,102,85,110,99,108,111,110,101,97,98,108,101,58,32,91,78,111,83,117,99,104,77,101,116,104,111,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchMethodException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfUncloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fhvg1vpi6() throws Throwable{try{__CLR4_5_2pbspbslvha7fyl.R.inc(33054);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33055);final UncloneableString string = new UncloneableString("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33056);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33057);ObjectUtils.clone(string);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33058);fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33059);throw e.getCause();
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an object array.
     */
    @Test
    public void testCloneOfStringArray() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j94z77pic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfStringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j94z77pic(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33060);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33061);assertTrue(Arrays.deepEquals(
            new String[]{"string"}, ObjectUtils.clone(new String[]{"string"})));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an array of primitives.
     */
    @Test
    public void testCloneOfPrimitiveArray() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ah22tpie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfPrimitiveArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ah22tpie(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33062);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33063);assertTrue(Arrays.equals(new int[]{1}, ObjectUtils.clone(new int[]{1})));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a cloneable object.
     */
    @Test
    public void testPossibleCloneOfCloneable() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rfhprnpig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfCloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rfhprnpig(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33064);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33065);final CloneableString string = new CloneableString("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33066);final CloneableString stringClone = ObjectUtils.cloneIfPossible(string);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33067);assertEquals("apache", stringClone.getValue());
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a not cloneable object.
     */
    @Test
    public void testPossibleCloneOfNotCloneable() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jniyecpik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfNotCloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jniyecpik(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33068);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33069);final String string = new String("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33070);assertSame(string, ObjectUtils.cloneIfPossible(string));
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with an uncloneable object.
     *
     * @throws java.lang.Throwable because we expect this to fail
     */
    @Test(expected = NoSuchMethodException.class)
    public void testPossibleCloneOfUncloneable() throws Throwable {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229df04pin();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,111,115,115,105,98,108,101,67,108,111,110,101,79,102,85,110,99,108,111,110,101,97,98,108,101,58,32,91,78,111,83,117,99,104,77,101,116,104,111,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchMethodException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfUncloneable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229df04pin() throws Throwable{try{__CLR4_5_2pbspbslvha7fyl.R.inc(33071);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33072);final UncloneableString string = new UncloneableString("apache");
        __CLR4_5_2pbspbslvha7fyl.R.inc(33073);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33074);ObjectUtils.cloneIfPossible(string);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33075);fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33076);throw e.getCause();
        }
    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    @Test
    public void testConstMethods() {__CLR4_5_2pbspbslvha7fyl.R.globalSliceStart(getClass().getName(),33077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aml6jcpit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pbspbslvha7fyl.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pbspbslvha7fyl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testConstMethods",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aml6jcpit(){try{__CLR4_5_2pbspbslvha7fyl.R.inc(33077);

        // To truly test the CONST() method, we'd want to look in the
        // bytecode to see if the literals were folded into the
        // class, or if the bytecode kept the method call.

        __CLR4_5_2pbspbslvha7fyl.R.inc(33078);assertTrue("CONST(boolean)", ObjectUtils.CONST(true));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33079);assertEquals("CONST(byte)", (byte) 3, ObjectUtils.CONST((byte) 3));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33080);assertEquals("CONST(char)", (char) 3, ObjectUtils.CONST((char) 3));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33081);assertEquals("CONST(short)", (short) 3, ObjectUtils.CONST((short) 3));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33082);assertEquals("CONST(int)", 3, ObjectUtils.CONST(3));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33083);assertEquals("CONST(long)", 3L, ObjectUtils.CONST(3L));
        __CLR4_5_2pbspbslvha7fyl.R.inc(33084);assertEquals("CONST(float)", 3f, ObjectUtils.CONST(3f), 0);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33085);assertEquals("CONST(double)", 3.0, ObjectUtils.CONST(3.0), 0);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33086);assertEquals("CONST(Object)", "abc", ObjectUtils.CONST("abc"));

        // Make sure documentation examples from Javadoc all work
        // (this fixed a lot of my bugs when I these!)
        //
        // My bugs should be in a software engineering textbook
        // for "Can you screw this up?"  The answer is, yes,
        // you can even screw this up.  (When you == Julius)
        // .
        __CLR4_5_2pbspbslvha7fyl.R.inc(33087);final boolean MAGIC_FLAG = ObjectUtils.CONST(true);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33088);final byte MAGIC_BYTE1 = ObjectUtils.CONST((byte) 127);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33089);final byte MAGIC_BYTE2 = ObjectUtils.CONST_BYTE(127);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33090);final char MAGIC_CHAR = ObjectUtils.CONST('a');
        __CLR4_5_2pbspbslvha7fyl.R.inc(33091);final short MAGIC_SHORT1 = ObjectUtils.CONST((short) 123);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33092);final short MAGIC_SHORT2 = ObjectUtils.CONST_SHORT(127);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33093);final int MAGIC_INT = ObjectUtils.CONST(123);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33094);final long MAGIC_LONG1 = ObjectUtils.CONST(123L);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33095);final long MAGIC_LONG2 = ObjectUtils.CONST(3);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33096);final float MAGIC_FLOAT = ObjectUtils.CONST(1.0f);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33097);final double MAGIC_DOUBLE = ObjectUtils.CONST(1.0);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33098);final String MAGIC_STRING = ObjectUtils.CONST("abc");

        __CLR4_5_2pbspbslvha7fyl.R.inc(33099);assertTrue(MAGIC_FLAG);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33100);assertEquals(127, MAGIC_BYTE1);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33101);assertEquals(127, MAGIC_BYTE2);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33102);assertEquals('a', MAGIC_CHAR);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33103);assertEquals(123, MAGIC_SHORT1);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33104);assertEquals(127, MAGIC_SHORT2);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33105);assertEquals(123, MAGIC_INT);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33106);assertEquals(123, MAGIC_LONG1);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33107);assertEquals(3, MAGIC_LONG2);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33108);assertEquals(1.0f, MAGIC_FLOAT, 0.0f);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33109);assertEquals(1.0, MAGIC_DOUBLE, 0.0);
        __CLR4_5_2pbspbslvha7fyl.R.inc(33110);assertEquals("abc", MAGIC_STRING);

        __CLR4_5_2pbspbslvha7fyl.R.inc(33111);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33112);ObjectUtils.CONST_BYTE(-129);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33113);fail("CONST_BYTE(-129): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_5_2pbspbslvha7fyl.R.inc(33114);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33115);ObjectUtils.CONST_BYTE(128);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33116);fail("CONST_BYTE(128): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_5_2pbspbslvha7fyl.R.inc(33117);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33118);ObjectUtils.CONST_SHORT(-32769);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33119);fail("CONST_SHORT(-32769): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_5_2pbspbslvha7fyl.R.inc(33120);try {
            __CLR4_5_2pbspbslvha7fyl.R.inc(33121);ObjectUtils.CONST_BYTE(32768);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33122);fail("CONST_SHORT(32768): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }

    }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    /**
     * String that is cloneable.
     */
    static final class CloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        CloneableString(final String s) {
            super(s);__CLR4_5_2pbspbslvha7fyl.R.inc(33124);try{__CLR4_5_2pbspbslvha7fyl.R.inc(33123);
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

        @Override
        public CloneableString clone() throws CloneNotSupportedException {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33125);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33126);return (CloneableString)super.clone();
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    }

    /**
     * String that is not cloneable.
     */
    static final class UncloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        UncloneableString(final String s) {
            super(s);__CLR4_5_2pbspbslvha7fyl.R.inc(33128);try{__CLR4_5_2pbspbslvha7fyl.R.inc(33127);
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    }

    static final class NonComparableCharSequence implements CharSequence {
        final String value;

        /**
         * Create a new NonComparableCharSequence instance.
         *
         * @param value
         */
        public NonComparableCharSequence(final String value) {
            super();__CLR4_5_2pbspbslvha7fyl.R.inc(33130);try{__CLR4_5_2pbspbslvha7fyl.R.inc(33129);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33131);Validate.notNull(value);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33132);this.value = value;
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

        @Override
        public char charAt(final int arg0) {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33133);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33134);return value.charAt(arg0);
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

        @Override
        public int length() {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33135);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33136);return value.length();
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

        @Override
        public CharSequence subSequence(final int arg0, final int arg1) {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33137);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33138);return value.subSequence(arg0, arg1);
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33139);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33140);return value;
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}
    }

    static final class CharSequenceComparator implements Comparator<CharSequence> {

        @Override
        public int compare(final CharSequence o1, final CharSequence o2) {try{__CLR4_5_2pbspbslvha7fyl.R.inc(33141);
            __CLR4_5_2pbspbslvha7fyl.R.inc(33142);return o1.toString().compareTo(o2.toString());
        }finally{__CLR4_5_2pbspbslvha7fyl.R.flushNeeded();}}

    }
}
