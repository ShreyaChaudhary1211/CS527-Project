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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 */
public class ReflectionToStringBuilderExcludeTest {static class __CLR4_5_2wwmwwmlvha7hh8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    class TestFixture {
        @SuppressWarnings("unused")
        private final String secretField = SECRET_VALUE;

        @SuppressWarnings("unused")
        private final String showField = NOT_SECRET_VALUE;
    }

    private static final String NOT_SECRET_FIELD = "showField";

    private static final String NOT_SECRET_VALUE = "Hello World!";

    private static final String SECRET_FIELD = "secretField";

    private static final String SECRET_VALUE = "secret value";

    @Test
    public void test_toStringExclude() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8rg6wwwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExclude",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8rg6wwwm(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42646);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42647);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), SECRET_FIELD);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42648);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArray() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpkqv3wwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpkqv3wwp(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42649);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42650);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{SECRET_FIELD});
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42651);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArrayWithNull() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2ozccwws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArrayWithNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42652,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2ozccwws(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42652);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42653);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{null});
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42654);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArrayWithNulls() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b1rxw5wwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArrayWithNulls",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b1rxw5wwv(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42655);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42656);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{null, null});
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42657);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollection() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vc301mwwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vc301mwwy(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42658);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42659);final List<String> excludeList = new ArrayList<>();
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42660);excludeList.add(SECRET_FIELD);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42661);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42662);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollectionWithNull() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29qqmlvwx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollectionWithNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29qqmlvwx3(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42663);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42664);final List<String> excludeList = new ArrayList<>();
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42665);excludeList.add(null);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42666);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42667);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollectionWithNulls() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c6kwyawx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollectionWithNulls",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c6kwyawx8(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42668);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42669);final List<String> excludeList = new ArrayList<>();
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42670);excludeList.add(null);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42671);excludeList.add(null);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42672);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42673);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeEmptyArray() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s1wh4kwxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeEmptyArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s1wh4kwxe(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42674);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42675);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42676);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeEmptyCollection() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21syxypwxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeEmptyCollection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21syxypwxh(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42677);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42678);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new ArrayList<String>());
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42679);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeNullArray() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aeso2wwxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeNullArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aeso2wwxk(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42680);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42681);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (String[]) null);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42682);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeNullCollection() {__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceStart(getClass().getName(),42683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fa4t4jwxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wwmwwmlvha7hh8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wwmwwmlvha7hh8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeNullCollection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fa4t4jwxn(){try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42683);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42684);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (Collection<String>) null);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42685);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    private void validateNonSecretField(final String toString) {try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42686);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42687);Assert.assertTrue(toString.indexOf(NOT_SECRET_FIELD) > ArrayUtils.INDEX_NOT_FOUND);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42688);Assert.assertTrue(toString.indexOf(NOT_SECRET_VALUE) > ArrayUtils.INDEX_NOT_FOUND);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    private void validateSecretFieldAbsent(final String toString) {try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42689);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42690);Assert.assertEquals(ArrayUtils.INDEX_NOT_FOUND, toString.indexOf(SECRET_VALUE));
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42691);this.validateNonSecretField(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}

    private void validateSecretFieldPresent(final String toString) {try{__CLR4_5_2wwmwwmlvha7hh8.R.inc(42692);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42693);Assert.assertTrue(toString.indexOf(SECRET_VALUE) > 0);
        __CLR4_5_2wwmwwmlvha7hh8.R.inc(42694);this.validateNonSecretField(toString);
    }finally{__CLR4_5_2wwmwwmlvha7hh8.R.flushNeeded();}}
}
