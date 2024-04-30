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

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.GenericTypeHolder;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test TypeUtils
 */
@SuppressWarnings({ "unchecked", "unused" , "rawtypes" })
//raw types, where used, are used purposely
public class TypeUtilsTest<B> {static class __CLR4_5_2131r131rlvha7ib1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public interface This<K, V> {
    }

    public class That<K, V> implements This<K, V> {
    }

    public interface And<K, V> extends This<Number, Number> {
    }

    public class The<K, V> extends That<Number, Number> implements And<String, String> {
    }

    public class Other<T> implements This<String, T> {
    }

    public class Thing<Q> extends Other<B> {
    }

    public class Tester implements This<String, B> {
    }

    public This<String, String> dis;

    public That<String, String> dat;

    public The<String, String> da;

    public Other<String> uhder;

    public Thing ding;

    public TypeUtilsTest<String>.Tester tester;

    public Tester tester2;

    public TypeUtilsTest<String>.That<String, String> dat2;

    public TypeUtilsTest<Number>.That<String, String> dat3;

    public Comparable<? extends Integer>[] intWildcardComparable;

    public static Comparable<String> stringComparable;

    public static Comparable<URI> uriComparable;

    public static Comparable<Integer> intComparable;

    public static Comparable<Long> longComparable;

    public static Comparable<?> wildcardComparable;

    public static URI uri;

    public static List<String>[] stringListArray;

    public void dummyMethod(final List list0, final List<Object> list1, final List<?> list2,
            final List<? super Object> list3, final List<String> list4, final List<? extends String> list5,
            final List<? super String> list6, final List[] list7, final List<Object>[] list8, final List<?>[] list9,
            final List<? super Object>[] list10, final List<String>[] list11, final List<? extends String>[] list12,
            final List<? super String>[] list13) {try{__CLR4_5_2131r131rlvha7ib1.R.inc(50607);
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @SuppressWarnings("boxing") // deliberately used here
    @Test
    public void testIsAssignable() throws SecurityException, NoSuchMethodException,
            NoSuchFieldException {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243to2c131s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsAssignable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243to2c131s() throws SecurityException, NoSuchMethodException, NoSuchFieldException{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50608);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50609);List list0 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50610);List<Object> list1 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50611);List<?> list2 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50612);List<? super Object> list3 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50613);List<String> list4 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50614);List<? extends String> list5 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50615);List<? super String> list6 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50616);List[] list7 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50617);List<Object>[] list8 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50618);List<?>[] list9 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50619);List<? super Object>[] list10 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50620);List<String>[] list11 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50621);List<? extends String>[] list12 = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50622);List<? super String>[] list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50623);final Class<?> clazz = getClass();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50624);final Method method = clazz.getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50625);final Type[] types = method.getGenericParameterTypes();
//        list0 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50626);delegateBooleanAssertion(types, 0, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50627);list1 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50628);delegateBooleanAssertion(types, 0, 1, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50629);list0 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50630);delegateBooleanAssertion(types, 1, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50631);list2 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50632);delegateBooleanAssertion(types, 0, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50633);list0 = list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50634);delegateBooleanAssertion(types, 2, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50635);list3 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50636);delegateBooleanAssertion(types, 0, 3, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50637);list0 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50638);delegateBooleanAssertion(types, 3, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50639);list4 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50640);delegateBooleanAssertion(types, 0, 4, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50641);list0 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50642);delegateBooleanAssertion(types, 4, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50643);list5 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50644);delegateBooleanAssertion(types, 0, 5, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50645);list0 = list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50646);delegateBooleanAssertion(types, 5, 0, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50647);list6 = list0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50648);delegateBooleanAssertion(types, 0, 6, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50649);list0 = list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50650);delegateBooleanAssertion(types, 6, 0, true);
//        list1 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50651);delegateBooleanAssertion(types, 1, 1, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50652);list2 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50653);delegateBooleanAssertion(types, 1, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50654);list1 = (List<Object>) list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50655);delegateBooleanAssertion(types, 2, 1, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50656);list3 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50657);delegateBooleanAssertion(types, 1, 3, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50658);list1 = (List<Object>) list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50659);delegateBooleanAssertion(types, 3, 1, false);
        // list4 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50660);delegateBooleanAssertion(types, 1, 4, false);
        // list1 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50661);delegateBooleanAssertion(types, 4, 1, false);
        // list5 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50662);delegateBooleanAssertion(types, 1, 5, false);
        // list1 = list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50663);delegateBooleanAssertion(types, 5, 1, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50664);list6 = list1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50665);delegateBooleanAssertion(types, 1, 6, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50666);list1 = (List<Object>) list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50667);delegateBooleanAssertion(types, 6, 1, false);
//        list2 = list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50668);delegateBooleanAssertion(types, 2, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50669);list2 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50670);delegateBooleanAssertion(types, 2, 3, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50671);list2 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50672);delegateBooleanAssertion(types, 3, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50673);list3 = (List<? super Object>) list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50674);delegateBooleanAssertion(types, 2, 4, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50675);list2 = list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50676);delegateBooleanAssertion(types, 4, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50677);list4 = (List<String>) list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50678);delegateBooleanAssertion(types, 2, 5, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50679);list2 = list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50680);delegateBooleanAssertion(types, 5, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50681);list5 = (List<? extends String>) list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50682);delegateBooleanAssertion(types, 2, 6, false);
//        list3 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50683);delegateBooleanAssertion(types, 6, 2, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50684);list6 = (List<? super String>) list2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50685);delegateBooleanAssertion(types, 3, 3, true);
        // list4 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50686);delegateBooleanAssertion(types, 3, 4, false);
        // list3 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50687);delegateBooleanAssertion(types, 4, 3, false);
        // list5 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50688);delegateBooleanAssertion(types, 3, 5, false);
        // list3 = list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50689);delegateBooleanAssertion(types, 5, 3, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50690);list6 = list3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50691);delegateBooleanAssertion(types, 3, 6, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50692);list3 = (List<? super Object>) list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50693);delegateBooleanAssertion(types, 6, 3, false);
//        list4 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50694);delegateBooleanAssertion(types, 4, 4, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50695);list5 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50696);delegateBooleanAssertion(types, 4, 5, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50697);list4 = (List<String>) list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50698);delegateBooleanAssertion(types, 5, 4, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50699);list6 = list4;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50700);delegateBooleanAssertion(types, 4, 6, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50701);list4 = (List<String>) list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50702);delegateBooleanAssertion(types, 6, 4, false);
//        list5 = list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50703);delegateBooleanAssertion(types, 5, 5, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50704);list6 = (List<? super String>) list5;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50705);delegateBooleanAssertion(types, 5, 6, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50706);list5 = (List<? extends String>) list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50707);delegateBooleanAssertion(types, 6, 5, false);
//        list6 = list6;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50708);delegateBooleanAssertion(types, 6, 6, true);

//        list7 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50709);delegateBooleanAssertion(types, 7, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50710);list8 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50711);delegateBooleanAssertion(types, 7, 8, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50712);list7 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50713);delegateBooleanAssertion(types, 8, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50714);list9 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50715);delegateBooleanAssertion(types, 7, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50716);list7 = list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50717);delegateBooleanAssertion(types, 9, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50718);list10 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50719);delegateBooleanAssertion(types, 7, 10, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50720);list7 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50721);delegateBooleanAssertion(types, 10, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50722);list11 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50723);delegateBooleanAssertion(types, 7, 11, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50724);list7 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50725);delegateBooleanAssertion(types, 11, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50726);list12 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50727);delegateBooleanAssertion(types, 7, 12, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50728);list7 = list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50729);delegateBooleanAssertion(types, 12, 7, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50730);list13 = list7;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50731);delegateBooleanAssertion(types, 7, 13, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50732);list7 = list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50733);delegateBooleanAssertion(types, 13, 7, true);
//        list8 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50734);delegateBooleanAssertion(types, 8, 8, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50735);list9 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50736);delegateBooleanAssertion(types, 8, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50737);list8 = (List<Object>[]) list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50738);delegateBooleanAssertion(types, 9, 8, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50739);list10 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50740);delegateBooleanAssertion(types, 8, 10, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50741);list8 = (List<Object>[]) list10; // NOTE cast is required by Sun Java, but not by Eclipse
        __CLR4_5_2131r131rlvha7ib1.R.inc(50742);delegateBooleanAssertion(types, 10, 8, false);
        // list11 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50743);delegateBooleanAssertion(types, 8, 11, false);
        // list8 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50744);delegateBooleanAssertion(types, 11, 8, false);
        // list12 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50745);delegateBooleanAssertion(types, 8, 12, false);
        // list8 = list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50746);delegateBooleanAssertion(types, 12, 8, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50747);list13 = list8;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50748);delegateBooleanAssertion(types, 8, 13, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50749);list8 = (List<Object>[]) list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50750);delegateBooleanAssertion(types, 13, 8, false);
//        list9 = list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50751);delegateBooleanAssertion(types, 9, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50752);list10 = (List<? super Object>[]) list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50753);delegateBooleanAssertion(types, 9, 10, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50754);list9 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50755);delegateBooleanAssertion(types, 10, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50756);list11 = (List<String>[]) list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50757);delegateBooleanAssertion(types, 9, 11, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50758);list9 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50759);delegateBooleanAssertion(types, 11, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50760);list12 = (List<? extends String>[]) list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50761);delegateBooleanAssertion(types, 9, 12, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50762);list9 = list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50763);delegateBooleanAssertion(types, 12, 9, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50764);list13 = (List<? super String>[]) list9;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50765);delegateBooleanAssertion(types, 9, 13, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50766);list9 = list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50767);delegateBooleanAssertion(types, 13, 9, true);
//        list10 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50768);delegateBooleanAssertion(types, 10, 10, true);
        // list11 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50769);delegateBooleanAssertion(types, 10, 11, false);
        // list10 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50770);delegateBooleanAssertion(types, 11, 10, false);
        // list12 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50771);delegateBooleanAssertion(types, 10, 12, false);
        // list10 = list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50772);delegateBooleanAssertion(types, 12, 10, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50773);list13 = list10;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50774);delegateBooleanAssertion(types, 10, 13, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50775);list10 = (List<? super Object>[]) list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50776);delegateBooleanAssertion(types, 13, 10, false);
//        list11 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50777);delegateBooleanAssertion(types, 11, 11, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50778);list12 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50779);delegateBooleanAssertion(types, 11, 12, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50780);list11 = (List<String>[]) list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50781);delegateBooleanAssertion(types, 12, 11, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50782);list13 = list11;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50783);delegateBooleanAssertion(types, 11, 13, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50784);list11 = (List<String>[]) list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50785);delegateBooleanAssertion(types, 13, 11, false);
//        list12 = list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50786);delegateBooleanAssertion(types, 12, 12, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50787);list13 = (List<? super String>[]) list12;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50788);delegateBooleanAssertion(types, 12, 13, false);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50789);list12 = (List<? extends String>[]) list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50790);delegateBooleanAssertion(types, 13, 12, false);
//        list13 = list13;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50791);delegateBooleanAssertion(types, 13, 13, true);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50792);final Type disType = getClass().getField("dis").getGenericType();
        // Reporter.log( ( ( ParameterizedType ) disType
        // ).getOwnerType().getClass().toString() );
        __CLR4_5_2131r131rlvha7ib1.R.inc(50793);final Type datType = getClass().getField("dat").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50794);final Type daType = getClass().getField("da").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50795);final Type uhderType = getClass().getField("uhder").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50796);final Type dingType = getClass().getField("ding").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50797);final Type testerType = getClass().getField("tester").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50798);final Type tester2Type = getClass().getField("tester2").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50799);final Type dat2Type = getClass().getField("dat2").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50800);final Type dat3Type = getClass().getField("dat3").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50801);dis = dat;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50802);Assert.assertTrue(TypeUtils.isAssignable(datType, disType));
        // dis = da;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50803);Assert.assertFalse(TypeUtils.isAssignable(daType, disType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50804);dis = uhder;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50805);Assert.assertTrue(TypeUtils.isAssignable(uhderType, disType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50806);dis = ding;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50807);Assert.assertFalse(String.format("type %s not assignable to %s!", dingType, disType),
                TypeUtils.isAssignable(dingType, disType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50808);dis = tester;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50809);Assert.assertTrue(TypeUtils.isAssignable(testerType, disType));
        // dis = tester2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50810);Assert.assertFalse(TypeUtils.isAssignable(tester2Type, disType));
        // dat = dat2;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50811);Assert.assertFalse(TypeUtils.isAssignable(dat2Type, datType));
        // dat2 = dat;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50812);Assert.assertFalse(TypeUtils.isAssignable(datType, dat2Type));
        // dat = dat3;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50813);Assert.assertFalse(TypeUtils.isAssignable(dat3Type, datType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50814);final char ch = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50815);final boolean bo = false;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50816);final byte by = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50817);final short sh = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50818);int in = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50819);long lo = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50820);final float fl = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50821);double du = 0;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50822);du = ch;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50823);Assert.assertTrue(TypeUtils.isAssignable(char.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50824);du = by;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50825);Assert.assertTrue(TypeUtils.isAssignable(byte.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50826);du = sh;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50827);Assert.assertTrue(TypeUtils.isAssignable(short.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50828);du = in;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50829);Assert.assertTrue(TypeUtils.isAssignable(int.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50830);du = lo;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50831);Assert.assertTrue(TypeUtils.isAssignable(long.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50832);du = fl;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50833);Assert.assertTrue(TypeUtils.isAssignable(float.class, double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50834);lo = in;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50835);Assert.assertTrue(TypeUtils.isAssignable(int.class, long.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50836);lo = Integer.valueOf(0);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50837);Assert.assertTrue(TypeUtils.isAssignable(Integer.class, long.class));
        // Long lngW = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50838);Assert.assertFalse(TypeUtils.isAssignable(int.class, Long.class));
        // lngW = Integer.valueOf( 0 );
        __CLR4_5_2131r131rlvha7ib1.R.inc(50839);Assert.assertFalse(TypeUtils.isAssignable(Integer.class, Long.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50840);in = Integer.valueOf(0);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50841);Assert.assertTrue(TypeUtils.isAssignable(Integer.class, int.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50842);final Integer inte = in;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50843);Assert.assertTrue(TypeUtils.isAssignable(int.class, Integer.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50844);Assert.assertTrue(TypeUtils.isAssignable(int.class, Number.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50845);Assert.assertTrue(TypeUtils.isAssignable(int.class, Object.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50846);final Type intComparableType = getClass().getField("intComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50847);intComparable = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50848);Assert.assertTrue(TypeUtils.isAssignable(int.class, intComparableType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50849);Assert.assertTrue(TypeUtils.isAssignable(int.class, Comparable.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50850);final Serializable ser = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50851);Assert.assertTrue(TypeUtils.isAssignable(int.class, Serializable.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50852);final Type longComparableType = getClass().getField("longComparable").getGenericType();
        // longComparable = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50853);Assert.assertFalse(TypeUtils.isAssignable(int.class, longComparableType));
        // longComparable = Integer.valueOf( 0 );
        __CLR4_5_2131r131rlvha7ib1.R.inc(50854);Assert.assertFalse(TypeUtils.isAssignable(Integer.class, longComparableType));
        // int[] ia;
        // long[] la = ia;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50855);Assert.assertFalse(TypeUtils.isAssignable(int[].class, long[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50856);final Integer[] ia = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50857);final Type caType = getClass().getField("intWildcardComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50858);intWildcardComparable = ia;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50859);Assert.assertTrue(TypeUtils.isAssignable(Integer[].class, caType));
        // int[] ina = ia;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50860);Assert.assertFalse(TypeUtils.isAssignable(Integer[].class, int[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50861);final int[] ina = null;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50862);Object[] oa;
        // oa = ina;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50863);Assert.assertFalse(TypeUtils.isAssignable(int[].class, Object[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50864);oa = new Integer[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50865);Assert.assertTrue(TypeUtils.isAssignable(Integer[].class, Object[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50866);final Type bClassType = AClass.class.getField("bClass").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50867);final Type cClassType = AClass.class.getField("cClass").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50868);final Type dClassType = AClass.class.getField("dClass").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50869);final Type eClassType = AClass.class.getField("eClass").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50870);final Type fClassType = AClass.class.getField("fClass").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50871);final AClass aClass = new AClass(new AAClass<String>());
        __CLR4_5_2131r131rlvha7ib1.R.inc(50872);aClass.bClass = aClass.cClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50873);Assert.assertTrue(TypeUtils.isAssignable(cClassType, bClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50874);aClass.bClass = aClass.dClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50875);Assert.assertTrue(TypeUtils.isAssignable(dClassType, bClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50876);aClass.bClass = aClass.eClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50877);Assert.assertTrue(TypeUtils.isAssignable(eClassType, bClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50878);aClass.bClass = aClass.fClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50879);Assert.assertTrue(TypeUtils.isAssignable(fClassType, bClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50880);aClass.cClass = aClass.dClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50881);Assert.assertTrue(TypeUtils.isAssignable(dClassType, cClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50882);aClass.cClass = aClass.eClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50883);Assert.assertTrue(TypeUtils.isAssignable(eClassType, cClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50884);aClass.cClass = aClass.fClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50885);Assert.assertTrue(TypeUtils.isAssignable(fClassType, cClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50886);aClass.dClass = aClass.eClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50887);Assert.assertTrue(TypeUtils.isAssignable(eClassType, dClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50888);aClass.dClass = aClass.fClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50889);Assert.assertTrue(TypeUtils.isAssignable(fClassType, dClassType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50890);aClass.eClass = aClass.fClass;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50891);Assert.assertTrue(TypeUtils.isAssignable(fClassType, eClassType));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    public void delegateBooleanAssertion(final Type[] types, final int i2, final int i1, final boolean expected) {try{__CLR4_5_2131r131rlvha7ib1.R.inc(50892);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50893);final Type type1 = types[i1];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50894);final Type type2 = types[i2];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50895);final boolean isAssignable = TypeUtils.isAssignable(type2, type1);

        __CLR4_5_2131r131rlvha7ib1.R.inc(50896);if ((((expected)&&(__CLR4_5_2131r131rlvha7ib1.R.iget(50897)!=0|true))||(__CLR4_5_2131r131rlvha7ib1.R.iget(50898)==0&false))) {{
            __CLR4_5_2131r131rlvha7ib1.R.inc(50899);Assert.assertTrue("[" + i1 + ", " + i2 + "]: From "
                    + String.valueOf(type2) + " to "
                    + String.valueOf(type1), isAssignable);
        } }else {{
            __CLR4_5_2131r131rlvha7ib1.R.inc(50900);Assert.assertFalse("[" + i1 + ", " + i2 + "]: From "
                    + String.valueOf(type2) + " to "
                    + String.valueOf(type1), isAssignable);
        }
    }}finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @SuppressWarnings("boxing") // boxing is deliberate here
    @Test
    public void testIsInstance() throws SecurityException, NoSuchFieldException {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ojkxqg139x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ojkxqg139x() throws SecurityException, NoSuchFieldException{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50901);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50902);final Type intComparableType = getClass().getField("intComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50903);final Type uriComparableType = getClass().getField("uriComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50904);intComparable = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50905);Assert.assertTrue(TypeUtils.isInstance(1, intComparableType));
        // uriComparable = 1;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50906);Assert.assertFalse(TypeUtils.isInstance(1, uriComparableType));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testGetTypeArguments() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b8w29r13a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetTypeArguments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b8w29r13a3(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(50907);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50908);Map<TypeVariable<?>, Type> typeVarAssigns;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50909);TypeVariable<?> treeSetTypeVar;
        __CLR4_5_2131r131rlvha7ib1.R.inc(50910);Type typeArg;

        __CLR4_5_2131r131rlvha7ib1.R.inc(50911);typeVarAssigns = TypeUtils.getTypeArguments(Integer.class, Comparable.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50912);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50913);Assert.assertTrue("Type var assigns for Comparable from Integer: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50914);typeArg = typeVarAssigns.get(treeSetTypeVar);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50915);Assert.assertEquals("Type argument of Comparable from Integer: " + typeArg, Integer.class,
                typeVarAssigns.get(treeSetTypeVar));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50916);typeVarAssigns = TypeUtils.getTypeArguments(int.class, Comparable.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50917);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50918);Assert.assertTrue("Type var assigns for Comparable from int: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50919);typeArg = typeVarAssigns.get(treeSetTypeVar);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50920);Assert.assertEquals("Type argument of Comparable from int: " + typeArg, Integer.class,
                typeVarAssigns.get(treeSetTypeVar));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50921);final Collection<Integer> col = Arrays.asList(new Integer[0]);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50922);typeVarAssigns = TypeUtils.getTypeArguments(List.class, Collection.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50923);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50924);Assert.assertFalse("Type var assigns for Collection from List: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50925);typeVarAssigns = TypeUtils.getTypeArguments(AAAClass.BBBClass.class, AAClass.BBClass.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50926);Assert.assertTrue(typeVarAssigns.size() == 2);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50927);Assert.assertEquals(String.class, typeVarAssigns.get(AAClass.class.getTypeParameters()[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50928);Assert.assertEquals(String.class, typeVarAssigns.get(AAClass.BBClass.class.getTypeParameters()[0]));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50929);typeVarAssigns = TypeUtils.getTypeArguments(Other.class, This.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50930);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_5_2131r131rlvha7ib1.R.inc(50931);Assert.assertEquals(String.class, typeVarAssigns.get(This.class.getTypeParameters()[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50932);Assert.assertEquals(Other.class.getTypeParameters()[0], typeVarAssigns.get(This.class.getTypeParameters()[1]));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50933);typeVarAssigns = TypeUtils.getTypeArguments(And.class, This.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50934);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_5_2131r131rlvha7ib1.R.inc(50935);Assert.assertEquals(Number.class, typeVarAssigns.get(This.class.getTypeParameters()[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50936);Assert.assertEquals(Number.class, typeVarAssigns.get(This.class.getTypeParameters()[1]));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50937);typeVarAssigns = TypeUtils.getTypeArguments(Thing.class, Other.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50938);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_5_2131r131rlvha7ib1.R.inc(50939);Assert.assertEquals(getClass().getTypeParameters()[0], typeVarAssigns.get(getClass().getTypeParameters()[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50940);Assert.assertEquals(getClass().getTypeParameters()[0], typeVarAssigns.get(Other.class.getTypeParameters()[0]));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testTypesSatisfyVariables() throws SecurityException, NoSuchFieldException,
            NoSuchMethodException {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cdktcu13b1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testTypesSatisfyVariables",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cdktcu13b1() throws SecurityException, NoSuchFieldException, NoSuchMethodException{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50941);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50942);final Map<TypeVariable<?>, Type> typeVarAssigns = new HashMap<>();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50943);final Integer max = TypeUtilsTest.<Integer> stub();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50944);typeVarAssigns.put(getClass().getMethod("stub").getTypeParameters()[0], Integer.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50945);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50946);typeVarAssigns.clear();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50947);typeVarAssigns.put(getClass().getMethod("stub2").getTypeParameters()[0], Integer.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50948);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50949);typeVarAssigns.clear();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50950);typeVarAssigns.put(getClass().getMethod("stub3").getTypeParameters()[0], Integer.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50951);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testDetermineTypeVariableAssignments() throws SecurityException,
            NoSuchFieldException, NoSuchMethodException {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bv7d9213bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testDetermineTypeVariableAssignments",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bv7d9213bc() throws SecurityException, NoSuchFieldException, NoSuchMethodException{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50952);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50953);final ParameterizedType iterableType = (ParameterizedType) getClass().getField("iterable")
                .getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50954);final Map<TypeVariable<?>, Type> typeVarAssigns = TypeUtils.determineTypeArguments(TreeSet.class,
                iterableType);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50955);final TypeVariable<?> treeSetTypeVar = TreeSet.class.getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50956);Assert.assertTrue(typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50957);Assert.assertEquals(iterableType.getActualTypeArguments()[0], typeVarAssigns
                .get(treeSetTypeVar));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testGetRawType() throws SecurityException, NoSuchFieldException {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21t0cud13bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetRawType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21t0cud13bi() throws SecurityException, NoSuchFieldException{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50958);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50959);final Type stringParentFieldType = GenericTypeHolder.class.getDeclaredField("stringParent")
                .getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50960);final Type integerParentFieldType = GenericTypeHolder.class.getDeclaredField("integerParent")
                .getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50961);final Type foosFieldType = GenericTypeHolder.class.getDeclaredField("foos").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(50962);final Type genericParentT = GenericParent.class.getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(50963);Assert.assertEquals(GenericParent.class, TypeUtils.getRawType(stringParentFieldType, null));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50964);Assert
                .assertEquals(GenericParent.class, TypeUtils.getRawType(integerParentFieldType,
                        null));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50965);Assert.assertEquals(List.class, TypeUtils.getRawType(foosFieldType, null));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50966);Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                StringParameterizedChild.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50967);Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                stringParentFieldType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50968);Assert.assertEquals(Foo.class, TypeUtils.getRawType(Iterable.class.getTypeParameters()[0],
                foosFieldType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50969);Assert.assertEquals(Foo.class, TypeUtils.getRawType(List.class.getTypeParameters()[0],
                foosFieldType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50970);Assert.assertNull(TypeUtils.getRawType(genericParentT, GenericParent.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50971);Assert.assertEquals(GenericParent[].class, TypeUtils.getRawType(GenericTypeHolder.class
                .getDeclaredField("barParents").getGenericType(), null));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testIsArrayTypeClasses() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e9kbx213bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayTypeClasses",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e9kbx213bw(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(50972);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50973);Assert.assertTrue(TypeUtils.isArrayType(boolean[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50974);Assert.assertTrue(TypeUtils.isArrayType(byte[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50975);Assert.assertTrue(TypeUtils.isArrayType(short[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50976);Assert.assertTrue(TypeUtils.isArrayType(int[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50977);Assert.assertTrue(TypeUtils.isArrayType(char[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50978);Assert.assertTrue(TypeUtils.isArrayType(long[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50979);Assert.assertTrue(TypeUtils.isArrayType(float[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50980);Assert.assertTrue(TypeUtils.isArrayType(double[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50981);Assert.assertTrue(TypeUtils.isArrayType(Object[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50982);Assert.assertTrue(TypeUtils.isArrayType(String[].class));

        __CLR4_5_2131r131rlvha7ib1.R.inc(50983);Assert.assertFalse(TypeUtils.isArrayType(boolean.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50984);Assert.assertFalse(TypeUtils.isArrayType(byte.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50985);Assert.assertFalse(TypeUtils.isArrayType(short.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50986);Assert.assertFalse(TypeUtils.isArrayType(int.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50987);Assert.assertFalse(TypeUtils.isArrayType(char.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50988);Assert.assertFalse(TypeUtils.isArrayType(long.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50989);Assert.assertFalse(TypeUtils.isArrayType(float.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50990);Assert.assertFalse(TypeUtils.isArrayType(double.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50991);Assert.assertFalse(TypeUtils.isArrayType(Object.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50992);Assert.assertFalse(TypeUtils.isArrayType(String.class));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testIsArrayGenericTypes() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),50993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2an9cxm13ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayGenericTypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50993,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2an9cxm13ch() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(50993);
        __CLR4_5_2131r131rlvha7ib1.R.inc(50994);final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        __CLR4_5_2131r131rlvha7ib1.R.inc(50995);final Type[] types = method.getGenericParameterTypes();

        __CLR4_5_2131r131rlvha7ib1.R.inc(50996);Assert.assertFalse(TypeUtils.isArrayType(types[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50997);Assert.assertFalse(TypeUtils.isArrayType(types[1]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50998);Assert.assertFalse(TypeUtils.isArrayType(types[2]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(50999);Assert.assertFalse(TypeUtils.isArrayType(types[3]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51000);Assert.assertFalse(TypeUtils.isArrayType(types[4]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51001);Assert.assertFalse(TypeUtils.isArrayType(types[5]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51002);Assert.assertFalse(TypeUtils.isArrayType(types[6]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51003);Assert.assertTrue(TypeUtils.isArrayType(types[7]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51004);Assert.assertTrue(TypeUtils.isArrayType(types[8]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51005);Assert.assertTrue(TypeUtils.isArrayType(types[9]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51006);Assert.assertTrue(TypeUtils.isArrayType(types[10]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51007);Assert.assertTrue(TypeUtils.isArrayType(types[11]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51008);Assert.assertTrue(TypeUtils.isArrayType(types[12]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51009);Assert.assertTrue(TypeUtils.isArrayType(types[13]));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testGetPrimitiveArrayComponentType() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25cgtjs13cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetPrimitiveArrayComponentType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25cgtjs13cy() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51010);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51011);Assert.assertEquals(boolean.class, TypeUtils.getArrayComponentType(boolean[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51012);Assert.assertEquals(byte.class, TypeUtils.getArrayComponentType(byte[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51013);Assert.assertEquals(short.class, TypeUtils.getArrayComponentType(short[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51014);Assert.assertEquals(int.class, TypeUtils.getArrayComponentType(int[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51015);Assert.assertEquals(char.class, TypeUtils.getArrayComponentType(char[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51016);Assert.assertEquals(long.class, TypeUtils.getArrayComponentType(long[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51017);Assert.assertEquals(float.class, TypeUtils.getArrayComponentType(float[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51018);Assert.assertEquals(double.class, TypeUtils.getArrayComponentType(double[].class));

        __CLR4_5_2131r131rlvha7ib1.R.inc(51019);Assert.assertNull(TypeUtils.getArrayComponentType(boolean.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51020);Assert.assertNull(TypeUtils.getArrayComponentType(byte.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51021);Assert.assertNull(TypeUtils.getArrayComponentType(short.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51022);Assert.assertNull(TypeUtils.getArrayComponentType(int.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51023);Assert.assertNull(TypeUtils.getArrayComponentType(char.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51024);Assert.assertNull(TypeUtils.getArrayComponentType(long.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51025);Assert.assertNull(TypeUtils.getArrayComponentType(float.class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51026);Assert.assertNull(TypeUtils.getArrayComponentType(double.class));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testGetArrayComponentType() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i67ert13df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetArrayComponentType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i67ert13df() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51027);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51028);final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        __CLR4_5_2131r131rlvha7ib1.R.inc(51029);final Type[] types = method.getGenericParameterTypes();

        __CLR4_5_2131r131rlvha7ib1.R.inc(51030);Assert.assertNull(TypeUtils.getArrayComponentType(types[0]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51031);Assert.assertNull(TypeUtils.getArrayComponentType(types[1]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51032);Assert.assertNull(TypeUtils.getArrayComponentType(types[2]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51033);Assert.assertNull(TypeUtils.getArrayComponentType(types[3]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51034);Assert.assertNull(TypeUtils.getArrayComponentType(types[4]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51035);Assert.assertNull(TypeUtils.getArrayComponentType(types[5]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51036);Assert.assertNull(TypeUtils.getArrayComponentType(types[6]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51037);Assert.assertEquals(types[0], TypeUtils.getArrayComponentType(types[7]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51038);Assert.assertEquals(types[1], TypeUtils.getArrayComponentType(types[8]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51039);Assert.assertEquals(types[2], TypeUtils.getArrayComponentType(types[9]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51040);Assert.assertEquals(types[3], TypeUtils.getArrayComponentType(types[10]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51041);Assert.assertEquals(types[4], TypeUtils.getArrayComponentType(types[11]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51042);Assert.assertEquals(types[5], TypeUtils.getArrayComponentType(types[12]));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51043);Assert.assertEquals(types[6], TypeUtils.getArrayComponentType(types[13]));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testLang820() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2plyk6b13dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testLang820",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2plyk6b13dw() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51044);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51045);final Type[] typeArray = {String.class, String.class};
        __CLR4_5_2131r131rlvha7ib1.R.inc(51046);final Type[] expectedArray = {String.class};
        __CLR4_5_2131r131rlvha7ib1.R.inc(51047);Assert.assertArrayEquals(expectedArray, TypeUtils.normalizeUpperBounds(typeArray));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testParameterize() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_246wdr013e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testParameterize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_246wdr013e0() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51048);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51049);final ParameterizedType stringComparableType = TypeUtils.parameterize(Comparable.class, String.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51050);Assert.assertTrue(TypeUtils.equals(getClass().getField("stringComparable").getGenericType(),
            stringComparableType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51051);Assert.assertEquals("java.lang.Comparable<java.lang.String>", stringComparableType.toString());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}
    
    @Test
    public void testParameterizeWithOwner() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pl89lj13e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testParameterizeWithOwner",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pl89lj13e4() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51052);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51053);final Type owner = TypeUtils.parameterize(TypeUtilsTest.class, String.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51054);final ParameterizedType dat2Type = TypeUtils.parameterizeWithOwner(owner, That.class, String.class, String.class);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51055);Assert.assertTrue(TypeUtils.equals(getClass().getField("dat2").getGenericType(), dat2Type));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}
    
    @Test
    public void testWildcardType() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuyhyl13e8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testWildcardType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuyhyl13e8() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51056);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51057);final WildcardType simpleWildcard = TypeUtils.wildcardType().withUpperBounds(String.class).build();
        __CLR4_5_2131r131rlvha7ib1.R.inc(51058);final Field cClass = AClass.class.getField("cClass");
        __CLR4_5_2131r131rlvha7ib1.R.inc(51059);Assert.assertTrue(TypeUtils.equals(((ParameterizedType) cClass.getGenericType()).getActualTypeArguments()[0],
            simpleWildcard));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51060);Assert.assertEquals(String.format("? extends %s", String.class.getName()), TypeUtils.toString(simpleWildcard));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51061);Assert.assertEquals(String.format("? extends %s", String.class.getName()), simpleWildcard.toString());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testUnboundedWildcardType() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27rsf2l13ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testUnboundedWildcardType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27rsf2l13ee(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(51062);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51063);final WildcardType unbounded = TypeUtils.wildcardType().withLowerBounds((Type) null).withUpperBounds().build();
        __CLR4_5_2131r131rlvha7ib1.R.inc(51064);Assert.assertTrue(TypeUtils.equals(TypeUtils.WILDCARD_ALL, unbounded));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51065);Assert.assertArrayEquals(new Type[] { Object.class }, TypeUtils.getImplicitUpperBounds(unbounded));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51066);Assert.assertArrayEquals(new Type[] { null }, TypeUtils.getImplicitLowerBounds(unbounded));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51067);Assert.assertEquals("?", TypeUtils.toString(unbounded));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51068);Assert.assertEquals("?", unbounded.toString());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testLowerBoundedWildcardType() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jguetz13el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testLowerBoundedWildcardType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jguetz13el(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(51069);
       __CLR4_5_2131r131rlvha7ib1.R.inc(51070);final WildcardType lowerBounded = TypeUtils.wildcardType().withLowerBounds(java.sql.Date.class).build();
       __CLR4_5_2131r131rlvha7ib1.R.inc(51071);Assert.assertEquals(String.format("? super %s", java.sql.Date.class.getName()), TypeUtils.toString(lowerBounded));
       __CLR4_5_2131r131rlvha7ib1.R.inc(51072);Assert.assertEquals(String.format("? super %s", java.sql.Date.class.getName()), lowerBounded.toString());

       __CLR4_5_2131r131rlvha7ib1.R.inc(51073);final TypeVariable<Class<Iterable>> iterableT0 = Iterable.class.getTypeParameters()[0];
       __CLR4_5_2131r131rlvha7ib1.R.inc(51074);final WildcardType lowerTypeVariable = TypeUtils.wildcardType().withLowerBounds(iterableT0).build();
       __CLR4_5_2131r131rlvha7ib1.R.inc(51075);Assert.assertEquals(String.format("? super %s", iterableT0.getName()), TypeUtils.toString(lowerTypeVariable));
       __CLR4_5_2131r131rlvha7ib1.R.inc(51076);Assert.assertEquals(String.format("? super %s", iterableT0.getName()), lowerTypeVariable.toString());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testLang1114() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yluhfu13et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testLang1114",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yluhfu13et() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51077);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51078);final Type nonWildcardType = getClass().getDeclaredField("wildcardComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(51079);final Type wildcardType = ((ParameterizedType)nonWildcardType).getActualTypeArguments()[0];

        __CLR4_5_2131r131rlvha7ib1.R.inc(51080);Assert.assertFalse(TypeUtils.equals(wildcardType, nonWildcardType));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51081);Assert.assertFalse(TypeUtils.equals(nonWildcardType, wildcardType));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testGenericArrayType() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d0dob913ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGenericArrayType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d0dob913ey() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51082);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51083);final Type expected = getClass().getField("intWildcardComparable").getGenericType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(51084);final GenericArrayType actual =
            TypeUtils.genericArrayType(TypeUtils.parameterize(Comparable.class, TypeUtils.wildcardType()
                .withUpperBounds(Integer.class).build()));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51085);Assert.assertTrue(TypeUtils.equals(expected, actual));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51086);Assert.assertEquals("java.lang.Comparable<? extends java.lang.Integer>[]", actual.toString());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testToStringLang1311() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e71h1n13f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testToStringLang1311",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e71h1n13f3(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(51087);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51088);Assert.assertEquals("int[]", TypeUtils.toString(int[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51089);Assert.assertEquals("java.lang.Integer[]", TypeUtils.toString(Integer[].class));
        __CLR4_5_2131r131rlvha7ib1.R.inc(51090);Field stringListField = FieldUtils.getDeclaredField(getClass(), "stringListArray");
        __CLR4_5_2131r131rlvha7ib1.R.inc(51091);Assert.assertEquals("java.util.List<java.lang.String>[]", TypeUtils.toString(stringListField.getGenericType()));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testToLongString() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1ekox13f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testToLongString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1ekox13f8(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(51092);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51093);Assert.assertEquals(getClass().getName() + ":B", TypeUtils.toLongString(getClass().getTypeParameters()[0]));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    @Test
    public void testWrap() {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b8mz0j13fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testWrap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b8mz0j13fa(){try{__CLR4_5_2131r131rlvha7ib1.R.inc(51094);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51095);final Type t = getClass().getTypeParameters()[0];
        __CLR4_5_2131r131rlvha7ib1.R.inc(51096);Assert.assertTrue(TypeUtils.equals(t, TypeUtils.wrap(t).getType()));

        __CLR4_5_2131r131rlvha7ib1.R.inc(51097);Assert.assertEquals(String.class, TypeUtils.wrap(String.class).getType());
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    public static class ClassWithSuperClassWithGenericType extends ArrayList<Object> {
        private static final long serialVersionUID = 1L;

        public static <U> Iterable<U> methodWithGenericReturnType() {try{__CLR4_5_2131r131rlvha7ib1.R.inc(51098);
            __CLR4_5_2131r131rlvha7ib1.R.inc(51099);return null;
        }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}
    }

    @Test
    public void testLANG1190() throws Exception {__CLR4_5_2131r131rlvha7ib1.R.globalSliceStart(getClass().getName(),51100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m86z3213fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2131r131rlvha7ib1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2131r131rlvha7ib1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testLANG1190",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m86z3213fg() throws Exception{try{__CLR4_5_2131r131rlvha7ib1.R.inc(51100);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51101);final Type fromType = ClassWithSuperClassWithGenericType.class.getDeclaredMethod("methodWithGenericReturnType").getGenericReturnType();
        __CLR4_5_2131r131rlvha7ib1.R.inc(51102);final Type failingToType = TypeUtils.wildcardType().withLowerBounds(ClassWithSuperClassWithGenericType.class).build();

        __CLR4_5_2131r131rlvha7ib1.R.inc(51103);Assert.assertTrue(TypeUtils.isAssignable(fromType, failingToType));
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    public Iterable<? extends Map<Integer, ? extends Collection<?>>> iterable;

    public static <G extends Comparable<G>> G stub() {try{__CLR4_5_2131r131rlvha7ib1.R.inc(51104);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51105);return null;
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    public static <G extends Comparable<? super G>> G stub2() {try{__CLR4_5_2131r131rlvha7ib1.R.inc(51106);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51107);return null;
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}

    public static <T extends Comparable<? extends T>> T stub3() {try{__CLR4_5_2131r131rlvha7ib1.R.inc(51108);
        __CLR4_5_2131r131rlvha7ib1.R.inc(51109);return null;
    }finally{__CLR4_5_2131r131rlvha7ib1.R.flushNeeded();}}
}

class AAClass<T> {

    public class BBClass<S> {
    }
}

class AAAClass extends AAClass<String> {
    public class BBBClass extends BBClass<String> {
    }
}

@SuppressWarnings("rawtypes")
//raw types, where used, are used purposely
class AClass extends AAClass<String>.BBClass<Number> {public static class __CLR4_5_2131r13fqlvha7ib1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,51112,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AClass(final AAClass<String> enclosingInstance) {
        enclosingInstance.super();__CLR4_5_2131r13fqlvha7ib1.R.inc(51111);try{__CLR4_5_2131r13fqlvha7ib1.R.inc(51110);
    }finally{__CLR4_5_2131r13fqlvha7ib1.R.flushNeeded();}}

    public class BClass<T> {
    }

    public class CClass<T> extends BClass {
    }

    public class DClass<T> extends CClass<T> {
    }

    public class EClass<T> extends DClass {
    }

    public class FClass extends EClass<String> {
    }

    public class GClass<T extends BClass<? extends T> & AInterface<AInterface<? super T>>> {
    }

    public BClass<Number> bClass;

    public CClass<? extends String> cClass;

    public DClass<String> dClass;

    public EClass<String> eClass;

    public FClass fClass;

    public GClass gClass;

    public interface AInterface<T> {
    }
}
