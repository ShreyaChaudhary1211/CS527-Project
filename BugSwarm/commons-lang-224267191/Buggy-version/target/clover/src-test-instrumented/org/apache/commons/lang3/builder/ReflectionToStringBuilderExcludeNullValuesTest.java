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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReflectionToStringBuilderExcludeNullValuesTest {static class __CLR4_5_2wucwuclvha7hgz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class TestFixture {
        @SuppressWarnings("unused")
        private Integer testIntegerField;
        @SuppressWarnings("unused")
        private String testStringField;

        public TestFixture(Integer a, String b) {try{__CLR4_5_2wucwuclvha7hgz.R.inc(42564);
            __CLR4_5_2wucwuclvha7hgz.R.inc(42565);this.testIntegerField = a;
            __CLR4_5_2wucwuclvha7hgz.R.inc(42566);this.testStringField = b;
        }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}
    }
    
    private static final String INTEGER_FIELD_NAME = "testIntegerField";
    private static final String STRING_FIELD_NAME = "testStringField";
    private final TestFixture BOTH_NON_NULL = new TestFixture(0, "str");
    private final TestFixture FIRST_NULL = new TestFixture(null, "str");
    private final TestFixture SECOND_NULL = new TestFixture(0, null);
    private final TestFixture BOTH_NULL = new TestFixture(null, null);
    
    @Test
    public void test_NonExclude(){__CLR4_5_2wucwuclvha7hgz.R.globalSliceStart(getClass().getName(),42567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29excu9wuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wucwuclvha7hgz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wucwuclvha7hgz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeNullValuesTest.test_NonExclude",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29excu9wuf(){try{__CLR4_5_2wucwuclvha7hgz.R.inc(42567);
        //normal case=
        __CLR4_5_2wucwuclvha7hgz.R.inc(42568);String toString = ReflectionToStringBuilder.toString(BOTH_NON_NULL, null, false, false, false, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42569);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42570);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        //make one null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42571);toString = ReflectionToStringBuilder.toString(FIRST_NULL, null, false, false, false, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42572);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42573);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        //other one null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42574);toString = ReflectionToStringBuilder.toString(SECOND_NULL, null, false, false, false, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42575);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42576);assertTrue(toString.contains(STRING_FIELD_NAME));

        //make the both null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42577);toString = ReflectionToStringBuilder.toString(BOTH_NULL, null, false, false, false, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42578);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42579);assertTrue(toString.contains(STRING_FIELD_NAME));
    }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}
    
    @Test
    public void test_excludeNull(){__CLR4_5_2wucwuclvha7hgz.R.globalSliceStart(getClass().getName(),42580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l1vrhhwus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wucwuclvha7hgz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wucwuclvha7hgz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeNullValuesTest.test_excludeNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l1vrhhwus(){try{__CLR4_5_2wucwuclvha7hgz.R.inc(42580);
        
        //test normal case
        __CLR4_5_2wucwuclvha7hgz.R.inc(42581);String toString = ReflectionToStringBuilder.toString(BOTH_NON_NULL, null, false, false, true, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42582);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42583);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        //make one null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42584);toString = ReflectionToStringBuilder.toString(FIRST_NULL, null, false, false, true, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42585);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42586);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        //other one null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42587);toString = ReflectionToStringBuilder.toString(SECOND_NULL, null, false, false, true, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42588);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42589);assertFalse(toString.contains(STRING_FIELD_NAME));
        
        //both null
        __CLR4_5_2wucwuclvha7hgz.R.inc(42590);toString = ReflectionToStringBuilder.toString(BOTH_NULL, null, false, false, true, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42591);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42592);assertFalse(toString.contains(STRING_FIELD_NAME));
    }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}
    
    @Test
    public void test_ConstructorOption(){__CLR4_5_2wucwuclvha7hgz.R.globalSliceStart(getClass().getName(),42593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5ujd5wv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wucwuclvha7hgz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wucwuclvha7hgz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeNullValuesTest.test_ConstructorOption",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42593,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5ujd5wv5(){try{__CLR4_5_2wucwuclvha7hgz.R.inc(42593);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42594);ReflectionToStringBuilder builder = new ReflectionToStringBuilder(BOTH_NON_NULL, null, null, null, false, false, true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42595);assertTrue(builder.isExcludeNullValues());
        __CLR4_5_2wucwuclvha7hgz.R.inc(42596);String toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42597);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42598);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42599);builder = new ReflectionToStringBuilder(FIRST_NULL, null, null, null, false, false, true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42600);toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42601);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42602);assertTrue(toString.contains(STRING_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42603);builder = new ReflectionToStringBuilder(SECOND_NULL, null, null, null, false, false, true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42604);toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42605);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42606);assertFalse(toString.contains(STRING_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42607);builder = new ReflectionToStringBuilder(BOTH_NULL, null, null, null, false, false, true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42608);toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42609);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42610);assertFalse(toString.contains(STRING_FIELD_NAME));
    }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}
    
    @Test
    public void test_ConstructorOptionNormal(){__CLR4_5_2wucwuclvha7hgz.R.globalSliceStart(getClass().getName(),42611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cc4cvkwvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wucwuclvha7hgz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wucwuclvha7hgz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeNullValuesTest.test_ConstructorOptionNormal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cc4cvkwvn(){try{__CLR4_5_2wucwuclvha7hgz.R.inc(42611);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42612);ReflectionToStringBuilder builder = new ReflectionToStringBuilder(BOTH_NULL, null, null, null, false, false, false);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42613);assertFalse(builder.isExcludeNullValues());
        __CLR4_5_2wucwuclvha7hgz.R.inc(42614);String toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42615);assertTrue(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42616);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        
        //regression test older constructors
        __CLR4_5_2wucwuclvha7hgz.R.inc(42617);ReflectionToStringBuilder oldBuilder = new ReflectionToStringBuilder(BOTH_NULL);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42618);toString = oldBuilder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42619);assertTrue(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42620);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42621);oldBuilder = new ReflectionToStringBuilder(BOTH_NULL, null, null, null, false, false);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42622);toString = oldBuilder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42623);assertTrue(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42624);assertTrue(toString.contains(INTEGER_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42625);oldBuilder = new ReflectionToStringBuilder(BOTH_NULL, null, null);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42626);toString = oldBuilder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42627);assertTrue(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42628);assertTrue(toString.contains(INTEGER_FIELD_NAME));
    }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}
    
    @Test
    public void test_ConstructorOption_ExcludeNull(){__CLR4_5_2wucwuclvha7hgz.R.globalSliceStart(getClass().getName(),42629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2buujv9ww5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wucwuclvha7hgz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wucwuclvha7hgz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeNullValuesTest.test_ConstructorOption_ExcludeNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2buujv9ww5(){try{__CLR4_5_2wucwuclvha7hgz.R.inc(42629);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42630);ReflectionToStringBuilder builder = new ReflectionToStringBuilder(BOTH_NULL, null, null, null, false, false, false);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42631);builder.setExcludeNullValues(true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42632);assertTrue(builder.isExcludeNullValues());
        __CLR4_5_2wucwuclvha7hgz.R.inc(42633);String toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42634);assertFalse(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42635);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42636);builder = new ReflectionToStringBuilder(BOTH_NULL, null, null, null, false, false, true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42637);toString = builder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42638);assertFalse(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42639);assertFalse(toString.contains(INTEGER_FIELD_NAME));
        
        __CLR4_5_2wucwuclvha7hgz.R.inc(42640);ReflectionToStringBuilder oldBuilder = new ReflectionToStringBuilder(BOTH_NULL);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42641);oldBuilder.setExcludeNullValues(true);
        __CLR4_5_2wucwuclvha7hgz.R.inc(42642);assertTrue(oldBuilder.isExcludeNullValues());
        __CLR4_5_2wucwuclvha7hgz.R.inc(42643);toString = oldBuilder.toString();
        __CLR4_5_2wucwuclvha7hgz.R.inc(42644);assertFalse(toString.contains(STRING_FIELD_NAME));
        __CLR4_5_2wucwuclvha7hgz.R.inc(42645);assertFalse(toString.contains(INTEGER_FIELD_NAME));
    }finally{__CLR4_5_2wucwuclvha7hgz.R.flushNeeded();}}

}
