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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 */
public class MultilineRecursiveToStringStyleTest {static class __CLR4_5_2wl9wl9lvha7hfc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,42305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String BR = System.lineSeparator();

    @Test
    public void simpleObject() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n9cthkwl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.simpleObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n9cthkwl9(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42237);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42238);final Transaction tx = new Transaction("2014.10.15", 100);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42239);final String expected = getClassPrefix(tx) + "[" + BR 
                        + "  amount=100.0," + BR 
                        + "  date=2014.10.15" + BR 
                        + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42240);assertEquals(expected, toString(tx));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void nestedElements() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkh8q3wld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.nestedElements",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkh8q3wld(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42241);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42242);final Customer customer = new Customer("Douglas Adams");
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42243);final Bank bank = new Bank("ASF Bank");
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42244);customer.bank = bank;
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42245);final String exp = getClassPrefix(customer) + "[" + BR 
                   + "  name=Douglas Adams," + BR 
                   + "  bank=" + getClassPrefix(bank) + "[" + BR 
                   + "    name=ASF Bank" + BR 
                   + "  ]," + BR 
                   + "  accounts=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42246);assertEquals(exp, toString(customer));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void nestedAndArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mmgnwgwlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.nestedAndArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mmgnwgwlj(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42247);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42248);final Account acc = new Account();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42249);final Transaction tx1 = new Transaction("2014.10.14", 100);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42250);final Transaction tx2 = new Transaction("2014.10.15", 50);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42251);acc.transactions.add(tx1);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42252);acc.transactions.add(tx2);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42253);final String expected = getClassPrefix(acc) + "[" + BR 
                        + "  owner=<null>," + BR 
                        + "  transactions=" + getClassPrefix(acc.transactions) + "{" + BR 
                        + "    " + getClassPrefix(tx1) + "[" + BR 
                        + "      amount=100.0," + BR 
                        + "      date=2014.10.14" + BR 
                        + "    ]," + BR 
                        + "    " + getClassPrefix(tx2) + "[" + BR
                        + "      amount=50.0," + BR 
                        + "      date=2014.10.15" + BR 
                        + "    ]" + BR 
                        + "  }" + BR 
                        + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42254);assertEquals(expected, toString(acc));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void noArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uydr33wlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.noArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uydr33wlr(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42255);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42256);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42257);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray=<null>," + BR
                   + "  intArray=<null>," + BR 
                   + "  doubleArray=<null>," + BR 
                   + "  longArray=<null>," + BR 
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42258);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void boolArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r7k0l2wlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.boolArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r7k0l2wlv(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42259);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42260);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42261);wa.boolArray = new boolean[] { true, false, true };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42262);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray={" + BR 
                   + "    true," + BR 
                   + "    false," + BR 
                   + "    true" + BR 
                   + "  }," + BR 
                   + "  charArray=<null>," + BR 
                   + "  intArray=<null>," + BR 
                   + "  doubleArray=<null>," + BR
                   + "  longArray=<null>," + BR 
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42263);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void charArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23llzeywm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.charArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23llzeywm0(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42264);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42265);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42266);wa.charArray = new char[] { 'a', 'A' };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42267);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray={" + BR 
                   + "    a," + BR 
                   + "    A" + BR 
                   + "  }," + BR 
                   + "  intArray=<null>," + BR 
                   + "  doubleArray=<null>," + BR 
                   + "  longArray=<null>," + BR
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42268);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void intArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sorolrwm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.intArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sorolrwm5(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42269);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42270);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42271);wa.intArray = new int[] { 1, 2 };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42272);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray=<null>," + BR 
                   + "  intArray={" + BR 
                   + "    1," + BR 
                   + "    2" + BR 
                   + "  }," + BR 
                   + "  doubleArray=<null>," + BR 
                   + "  longArray=<null>," + BR
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42273);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void doubleArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2npu0cvwma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.doubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2npu0cvwma(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42274);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42275);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42276);wa.doubleArray = new double[] { 1, 2 };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42277);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray=<null>," + BR
                   + "  intArray=<null>," + BR 
                   + "  doubleArray={" + BR 
                   + "    1.0," + BR 
                   + "    2.0" + BR 
                   + "  }," + BR
                   + "  longArray=<null>," + BR 
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42278);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void longArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o78tlwwmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.longArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42279,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o78tlwwmf(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42279);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42280);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42281);wa.longArray = new long[] { 1L, 2L };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42282);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray=<null>," + BR
                   + "  intArray=<null>," + BR 
                   + "  doubleArray=<null>," + BR 
                   + "  longArray={" + BR 
                   + "    1," + BR 
                   + "    2" + BR
                   + "  }," + BR 
                   + "  stringArray=<null>" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42283);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    @Test
    public void stringArray() {__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceStart(getClass().getName(),42284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qvpl3jwmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wl9wl9lvha7hfc.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wl9wl9lvha7hfc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultilineRecursiveToStringStyleTest.stringArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qvpl3jwmk(){try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42284);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42285);final WithArrays wa = new WithArrays();
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42286);wa.stringArray = new String[] { "a", "A" };
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42287);final String exp = getClassPrefix(wa) + "[" + BR 
                   + "  boolArray=<null>," + BR 
                   + "  charArray=<null>," + BR
                   + "  intArray=<null>," + BR 
                   + "  doubleArray=<null>," + BR 
                   + "  longArray=<null>," + BR 
                   + "  stringArray={" + BR
                   + "    a," + BR 
                   + "    A" + BR 
                   + "  }" + BR 
                   + "]";
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42288);assertEquals(exp, toString(wa));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    private String getClassPrefix(final Object object) {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42289);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42290);return object.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object));
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    private String toString(final Object object) {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42291);
        __CLR4_5_2wl9wl9lvha7hfc.R.inc(42292);return new ReflectionToStringBuilder(object, new MultilineRecursiveToStringStyle()).toString();
    }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}

    static class WithArrays {
        boolean[] boolArray;
        char[] charArray;
        int[] intArray;
        double[] doubleArray;
        long[] longArray;
        String[] stringArray;
    }

    static class Bank {
        String name;

        public Bank(final String name) {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42293);
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42294);this.name = name;
        }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}
    }

    static class Customer {
        String name;
        Bank bank;
        List<Account> accounts;

        public Customer(final String name) {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42295);
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42296);this.name = name;
        }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}
    }

    static class Account {
        Customer owner;
        List<Transaction> transactions = new ArrayList<>();

        public double getBalance() {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42297);
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42298);double balance = 0;
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42299);for (final Transaction tx : transactions) {{
                __CLR4_5_2wl9wl9lvha7hfc.R.inc(42300);balance += tx.amount;
            }
            }__CLR4_5_2wl9wl9lvha7hfc.R.inc(42301);return balance;
        }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}
    }

    static class Transaction {
        double amount;
        String date;

        public Transaction(final String datum, final double betrag) {try{__CLR4_5_2wl9wl9lvha7hfc.R.inc(42302);
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42303);this.date = datum;
            __CLR4_5_2wl9wl9lvha7hfc.R.inc(42304);this.amount = betrag;
        }finally{__CLR4_5_2wl9wl9lvha7hfc.R.flushNeeded();}}
    }

}
