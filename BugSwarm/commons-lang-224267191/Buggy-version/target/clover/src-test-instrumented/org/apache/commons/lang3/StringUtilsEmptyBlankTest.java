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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Empty/Blank methods
 */
public class StringUtilsEmptyBlankTest  {static class __CLR4_5_2qr1qr1lvha7gbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,34754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIsEmpty() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2custqgqr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2custqgqr1(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34669);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34670);assertTrue(StringUtils.isEmpty(null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34671);assertTrue(StringUtils.isEmpty(""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34672);assertFalse(StringUtils.isEmpty(" "));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34673);assertFalse(StringUtils.isEmpty("foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34674);assertFalse(StringUtils.isEmpty("  foo  "));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsNotEmpty() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278bq65qr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsNotEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278bq65qr7(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34675);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34676);assertFalse(StringUtils.isNotEmpty(null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34677);assertFalse(StringUtils.isNotEmpty(""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34678);assertTrue(StringUtils.isNotEmpty(" "));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34679);assertTrue(StringUtils.isNotEmpty("foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34680);assertTrue(StringUtils.isNotEmpty("  foo  "));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsAnyEmpty() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n0sd7oqrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsAnyEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n0sd7oqrd(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34681);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34682);assertTrue(StringUtils.isAnyEmpty((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34683);assertFalse(StringUtils.isAnyEmpty((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34684);assertTrue(StringUtils.isAnyEmpty(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34685);assertTrue(StringUtils.isAnyEmpty("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34686);assertTrue(StringUtils.isAnyEmpty("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34687);assertTrue(StringUtils.isAnyEmpty("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34688);assertFalse(StringUtils.isAnyEmpty(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34689);assertFalse(StringUtils.isAnyEmpty("foo", "bar"));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsNoneEmpty() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cjg200qrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsNoneEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cjg200qrm(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34690);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34691);assertFalse(StringUtils.isNoneEmpty((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34692);assertTrue(StringUtils.isNoneEmpty((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34693);assertFalse(StringUtils.isNoneEmpty(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34694);assertFalse(StringUtils.isNoneEmpty("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34695);assertFalse(StringUtils.isNoneEmpty("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34696);assertFalse(StringUtils.isNoneEmpty("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34697);assertTrue(StringUtils.isNoneEmpty(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34698);assertTrue(StringUtils.isNoneEmpty("foo", "bar"));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsAllEmpty() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owg2kxqrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsAllEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owg2kxqrv(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34699);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34700);assertTrue(StringUtils.isAllEmpty());
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34701);assertTrue(StringUtils.isAllEmpty(new String[]{}));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34702);assertTrue(StringUtils.isAllEmpty((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34703);assertTrue(StringUtils.isAllEmpty((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34704);assertFalse(StringUtils.isAllEmpty(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34705);assertFalse(StringUtils.isAllEmpty("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34706);assertFalse(StringUtils.isAllEmpty("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34707);assertFalse(StringUtils.isAllEmpty("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34708);assertFalse(StringUtils.isAllEmpty(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34709);assertFalse(StringUtils.isAllEmpty("foo", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34710);assertTrue(StringUtils.isAllEmpty("", null));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsBlank() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhhizlqs7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhhizlqs7(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34711);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34712);assertTrue(StringUtils.isBlank(null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34713);assertTrue(StringUtils.isBlank(""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34714);assertTrue(StringUtils.isBlank(StringUtilsTest.WHITESPACE));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34715);assertFalse(StringUtils.isBlank("foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34716);assertFalse(StringUtils.isBlank("  foo  "));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsNotBlank() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ecz30qsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsNotBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ecz30qsd(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34717);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34718);assertFalse(StringUtils.isNotBlank(null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34719);assertFalse(StringUtils.isNotBlank(""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34720);assertFalse(StringUtils.isNotBlank(StringUtilsTest.WHITESPACE));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34721);assertTrue(StringUtils.isNotBlank("foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34722);assertTrue(StringUtils.isNotBlank("  foo  "));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsAnyBlank() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ee3nyjqsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsAnyBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ee3nyjqsj(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34723);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34724);assertTrue(StringUtils.isAnyBlank((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34725);assertFalse(StringUtils.isAnyBlank((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34726);assertTrue(StringUtils.isAnyBlank(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34727);assertTrue(StringUtils.isAnyBlank(null, null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34728);assertTrue(StringUtils.isAnyBlank("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34729);assertTrue(StringUtils.isAnyBlank("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34730);assertTrue(StringUtils.isAnyBlank("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34731);assertTrue(StringUtils.isAnyBlank(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34732);assertFalse(StringUtils.isAnyBlank("foo", "bar"));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsNoneBlank() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23wrcqvqst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsNoneBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23wrcqvqst(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34733);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34734);assertFalse(StringUtils.isNoneBlank((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34735);assertTrue(StringUtils.isNoneBlank((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34736);assertFalse(StringUtils.isNoneBlank(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34737);assertFalse(StringUtils.isNoneBlank(null, null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34738);assertFalse(StringUtils.isNoneBlank("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34739);assertFalse(StringUtils.isNoneBlank("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34740);assertFalse(StringUtils.isNoneBlank("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34741);assertFalse(StringUtils.isNoneBlank(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34742);assertTrue(StringUtils.isNoneBlank("foo", "bar"));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}

    @Test
    public void testIsAllBlank() {__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceStart(getClass().getName(),34743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xj4ru2qt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2qr1qr1lvha7gbu.R.rethrow($CLV_t2$);}finally{__CLR4_5_2qr1qr1lvha7gbu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEmptyBlankTest.testIsAllBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xj4ru2qt3(){try{__CLR4_5_2qr1qr1lvha7gbu.R.inc(34743);
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34744);assertTrue(StringUtils.isAllBlank((String) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34745);assertTrue(StringUtils.isAllBlank((String[]) null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34746);assertTrue(StringUtils.isAllBlank(null, null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34747);assertTrue(StringUtils.isAllBlank(null, " "));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34748);assertFalse(StringUtils.isAllBlank(null, "foo"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34749);assertFalse(StringUtils.isAllBlank("", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34750);assertFalse(StringUtils.isAllBlank("bob", ""));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34751);assertFalse(StringUtils.isAllBlank("  bob  ", null));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34752);assertFalse(StringUtils.isAllBlank(" ", "bar"));
        __CLR4_5_2qr1qr1lvha7gbu.R.inc(34753);assertFalse(StringUtils.isAllBlank("foo", "bar"));
    }finally{__CLR4_5_2qr1qr1lvha7gbu.R.flushNeeded();}}
}
