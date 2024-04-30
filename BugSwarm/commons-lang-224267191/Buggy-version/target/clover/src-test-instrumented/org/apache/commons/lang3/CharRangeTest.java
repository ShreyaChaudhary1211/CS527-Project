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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharRange}.
 */
public class CharRangeTest  {static class __CLR4_5_2mscmsclvha7fes{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,29802,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x2ulvmsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29532,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x2ulvmsc(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29532);
        // class changed to non-public in 3.0
        __CLR4_5_2mscmsclvha7fes.R.inc(29533);assertFalse(Modifier.isPublic(CharRange.class.getModifiers()));
        __CLR4_5_2mscmsclvha7fes.R.inc(29534);assertTrue(Modifier.isFinal(CharRange.class.getModifiers()));
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructorAccessors_is() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hqin7wmsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_is",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hqin7wmsf(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29535);
        __CLR4_5_2mscmsclvha7fes.R.inc(29536);final CharRange rangea = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29537);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29538);assertEquals('a', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29539);assertFalse(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29540);assertEquals("a", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNot() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2emsrijmsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNot",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29541,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2emsrijmsl(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29541);
        __CLR4_5_2mscmsclvha7fes.R.inc(29542);final CharRange rangea = CharRange.isNot('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29543);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29544);assertEquals('a', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29545);assertTrue(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29546);assertEquals("^a", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Same() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vzo6xumsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vzo6xumsr(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29547);
        __CLR4_5_2mscmsclvha7fes.R.inc(29548);final CharRange rangea = CharRange.isIn('a', 'a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29549);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29550);assertEquals('a', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29551);assertFalse(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29552);assertEquals("a", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Normal() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_262yh8dmsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_262yh8dmsx(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29553);
        __CLR4_5_2mscmsclvha7fes.R.inc(29554);final CharRange rangea = CharRange.isIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29555);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29556);assertEquals('e', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29557);assertFalse(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29558);assertEquals("a-e", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Reversed() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8eef6mt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Reversed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8eef6mt3(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29559);
        __CLR4_5_2mscmsclvha7fes.R.inc(29560);final CharRange rangea = CharRange.isIn('e', 'a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29561);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29562);assertEquals('e', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29563);assertFalse(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29564);assertEquals("a-e", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Same() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zw3fdmt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zw3fdmt9(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29565);
        __CLR4_5_2mscmsclvha7fes.R.inc(29566);final CharRange rangea = CharRange.isNotIn('a', 'a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29567);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29568);assertEquals('a', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29569);assertTrue(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29570);assertEquals("^a", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Normal() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3ur0mmtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3ur0mmtf(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29571);
        __CLR4_5_2mscmsclvha7fes.R.inc(29572);final CharRange rangea = CharRange.isNotIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29573);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29574);assertEquals('e', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29575);assertTrue(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29576);assertEquals("^a-e", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Reversed() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qt6k39mtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Reversed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qt6k39mtl(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29577);
        __CLR4_5_2mscmsclvha7fes.R.inc(29578);final CharRange rangea = CharRange.isNotIn('e', 'a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29579);assertEquals('a', rangea.getStart());
        __CLR4_5_2mscmsclvha7fes.R.inc(29580);assertEquals('e', rangea.getEnd());
        __CLR4_5_2mscmsclvha7fes.R.inc(29581);assertTrue(rangea.isNegated());
        __CLR4_5_2mscmsclvha7fes.R.inc(29582);assertEquals("^a-e", rangea.toString());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals_Object() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q292p8mtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testEquals_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q292p8mtr(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29583);
        __CLR4_5_2mscmsclvha7fes.R.inc(29584);final CharRange rangea = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29585);final CharRange rangeae = CharRange.isIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29586);final CharRange rangenotbf = CharRange.isIn('b', 'f');

        __CLR4_5_2mscmsclvha7fes.R.inc(29587);assertFalse(rangea.equals(null));

        __CLR4_5_2mscmsclvha7fes.R.inc(29588);assertTrue(rangea.equals(rangea));
        __CLR4_5_2mscmsclvha7fes.R.inc(29589);assertTrue(rangea.equals(CharRange.is('a')));
        __CLR4_5_2mscmsclvha7fes.R.inc(29590);assertTrue(rangeae.equals(rangeae));
        __CLR4_5_2mscmsclvha7fes.R.inc(29591);assertTrue(rangeae.equals(CharRange.isIn('a', 'e')));
        __CLR4_5_2mscmsclvha7fes.R.inc(29592);assertTrue(rangenotbf.equals(rangenotbf));
        __CLR4_5_2mscmsclvha7fes.R.inc(29593);assertTrue(rangenotbf.equals(CharRange.isIn('b', 'f')));

        __CLR4_5_2mscmsclvha7fes.R.inc(29594);assertFalse(rangea.equals(rangeae));
        __CLR4_5_2mscmsclvha7fes.R.inc(29595);assertFalse(rangea.equals(rangenotbf));
        __CLR4_5_2mscmsclvha7fes.R.inc(29596);assertFalse(rangeae.equals(rangea));
        __CLR4_5_2mscmsclvha7fes.R.inc(29597);assertFalse(rangeae.equals(rangenotbf));
        __CLR4_5_2mscmsclvha7fes.R.inc(29598);assertFalse(rangenotbf.equals(rangea));
        __CLR4_5_2mscmsclvha7fes.R.inc(29599);assertFalse(rangenotbf.equals(rangeae));
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8mu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29600,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8mu8(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29600);
        __CLR4_5_2mscmsclvha7fes.R.inc(29601);final CharRange rangea = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29602);final CharRange rangeae = CharRange.isIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29603);final CharRange rangenotbf = CharRange.isIn('b', 'f');

        __CLR4_5_2mscmsclvha7fes.R.inc(29604);assertTrue(rangea.hashCode() == rangea.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29605);assertTrue(rangea.hashCode() == CharRange.is('a').hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29606);assertTrue(rangeae.hashCode() == rangeae.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29607);assertTrue(rangeae.hashCode() == CharRange.isIn('a', 'e').hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29608);assertTrue(rangenotbf.hashCode() == rangenotbf.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29609);assertTrue(rangenotbf.hashCode() == CharRange.isIn('b', 'f').hashCode());

        __CLR4_5_2mscmsclvha7fes.R.inc(29610);assertFalse(rangea.hashCode() == rangeae.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29611);assertFalse(rangea.hashCode() == rangenotbf.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29612);assertFalse(rangeae.hashCode() == rangea.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29613);assertFalse(rangeae.hashCode() == rangenotbf.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29614);assertFalse(rangenotbf.hashCode() == rangea.hashCode());
        __CLR4_5_2mscmsclvha7fes.R.inc(29615);assertFalse(rangenotbf.hashCode() == rangeae.hashCode());
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_Char() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8fyfpmuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContains_Char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29616,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8fyfpmuo(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29616);
        __CLR4_5_2mscmsclvha7fes.R.inc(29617);CharRange range = CharRange.is('c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29618);assertFalse(range.contains('b'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29619);assertTrue(range.contains('c'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29620);assertFalse(range.contains('d'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29621);assertFalse(range.contains('e'));

        __CLR4_5_2mscmsclvha7fes.R.inc(29622);range = CharRange.isIn('c', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29623);assertFalse(range.contains('b'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29624);assertTrue(range.contains('c'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29625);assertTrue(range.contains('d'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29626);assertFalse(range.contains('e'));

        __CLR4_5_2mscmsclvha7fes.R.inc(29627);range = CharRange.isIn('d', 'c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29628);assertFalse(range.contains('b'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29629);assertTrue(range.contains('c'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29630);assertTrue(range.contains('d'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29631);assertFalse(range.contains('e'));

        __CLR4_5_2mscmsclvha7fes.R.inc(29632);range = CharRange.isNotIn('c', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29633);assertTrue(range.contains('b'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29634);assertFalse(range.contains('c'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29635);assertFalse(range.contains('d'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29636);assertTrue(range.contains('e'));
        __CLR4_5_2mscmsclvha7fes.R.inc(29637);assertTrue(range.contains((char) 0));
        __CLR4_5_2mscmsclvha7fes.R.inc(29638);assertTrue(range.contains(Character.MAX_VALUE));
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_Charrange() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oczku8mvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContains_Charrange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oczku8mvb(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29639);
        __CLR4_5_2mscmsclvha7fes.R.inc(29640);final CharRange a = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29641);final CharRange b = CharRange.is('b');
        __CLR4_5_2mscmsclvha7fes.R.inc(29642);final CharRange c = CharRange.is('c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29643);final CharRange c2 = CharRange.is('c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29644);final CharRange d = CharRange.is('d');
        __CLR4_5_2mscmsclvha7fes.R.inc(29645);final CharRange e = CharRange.is('e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29646);final CharRange cd = CharRange.isIn('c', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29647);final CharRange bd = CharRange.isIn('b', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29648);final CharRange bc = CharRange.isIn('b', 'c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29649);final CharRange ab = CharRange.isIn('a', 'b');
        __CLR4_5_2mscmsclvha7fes.R.inc(29650);final CharRange de = CharRange.isIn('d', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29651);final CharRange ef = CharRange.isIn('e', 'f');
        __CLR4_5_2mscmsclvha7fes.R.inc(29652);final CharRange ae = CharRange.isIn('a', 'e');

        // normal/normal
        __CLR4_5_2mscmsclvha7fes.R.inc(29653);assertFalse(c.contains(b));
        __CLR4_5_2mscmsclvha7fes.R.inc(29654);assertTrue(c.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29655);assertTrue(c.contains(c2));
        __CLR4_5_2mscmsclvha7fes.R.inc(29656);assertFalse(c.contains(d));

        __CLR4_5_2mscmsclvha7fes.R.inc(29657);assertFalse(c.contains(cd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29658);assertFalse(c.contains(bd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29659);assertFalse(c.contains(bc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29660);assertFalse(c.contains(ab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29661);assertFalse(c.contains(de));

        __CLR4_5_2mscmsclvha7fes.R.inc(29662);assertTrue(cd.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29663);assertTrue(bd.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29664);assertTrue(bc.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29665);assertFalse(ab.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29666);assertFalse(de.contains(c));

        __CLR4_5_2mscmsclvha7fes.R.inc(29667);assertTrue(ae.contains(b));
        __CLR4_5_2mscmsclvha7fes.R.inc(29668);assertTrue(ae.contains(ab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29669);assertTrue(ae.contains(bc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29670);assertTrue(ae.contains(cd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29671);assertTrue(ae.contains(de));

        __CLR4_5_2mscmsclvha7fes.R.inc(29672);final CharRange notb = CharRange.isNot('b');
        __CLR4_5_2mscmsclvha7fes.R.inc(29673);final CharRange notc = CharRange.isNot('c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29674);final CharRange notd = CharRange.isNot('d');
        __CLR4_5_2mscmsclvha7fes.R.inc(29675);final CharRange notab = CharRange.isNotIn('a', 'b');
        __CLR4_5_2mscmsclvha7fes.R.inc(29676);final CharRange notbc = CharRange.isNotIn('b', 'c');
        __CLR4_5_2mscmsclvha7fes.R.inc(29677);final CharRange notbd = CharRange.isNotIn('b', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29678);final CharRange notcd = CharRange.isNotIn('c', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29679);final CharRange notde = CharRange.isNotIn('d', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29680);final CharRange notae = CharRange.isNotIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29681);final CharRange all = CharRange.isIn((char) 0, Character.MAX_VALUE);
        __CLR4_5_2mscmsclvha7fes.R.inc(29682);final CharRange allbutfirst = CharRange.isIn((char) 1, Character.MAX_VALUE);

        // normal/negated
        __CLR4_5_2mscmsclvha7fes.R.inc(29683);assertFalse(c.contains(notc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29684);assertFalse(c.contains(notbd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29685);assertTrue(all.contains(notc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29686);assertTrue(all.contains(notbd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29687);assertFalse(allbutfirst.contains(notc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29688);assertFalse(allbutfirst.contains(notbd));

        // negated/normal
        __CLR4_5_2mscmsclvha7fes.R.inc(29689);assertTrue(notc.contains(a));
        __CLR4_5_2mscmsclvha7fes.R.inc(29690);assertTrue(notc.contains(b));
        __CLR4_5_2mscmsclvha7fes.R.inc(29691);assertFalse(notc.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29692);assertTrue(notc.contains(d));
        __CLR4_5_2mscmsclvha7fes.R.inc(29693);assertTrue(notc.contains(e));

        __CLR4_5_2mscmsclvha7fes.R.inc(29694);assertTrue(notc.contains(ab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29695);assertFalse(notc.contains(bc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29696);assertFalse(notc.contains(bd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29697);assertFalse(notc.contains(cd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29698);assertTrue(notc.contains(de));
        __CLR4_5_2mscmsclvha7fes.R.inc(29699);assertFalse(notc.contains(ae));
        __CLR4_5_2mscmsclvha7fes.R.inc(29700);assertFalse(notc.contains(all));
        __CLR4_5_2mscmsclvha7fes.R.inc(29701);assertFalse(notc.contains(allbutfirst));

        __CLR4_5_2mscmsclvha7fes.R.inc(29702);assertTrue(notbd.contains(a));
        __CLR4_5_2mscmsclvha7fes.R.inc(29703);assertFalse(notbd.contains(b));
        __CLR4_5_2mscmsclvha7fes.R.inc(29704);assertFalse(notbd.contains(c));
        __CLR4_5_2mscmsclvha7fes.R.inc(29705);assertFalse(notbd.contains(d));
        __CLR4_5_2mscmsclvha7fes.R.inc(29706);assertTrue(notbd.contains(e));

        __CLR4_5_2mscmsclvha7fes.R.inc(29707);assertTrue(notcd.contains(ab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29708);assertFalse(notcd.contains(bc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29709);assertFalse(notcd.contains(bd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29710);assertFalse(notcd.contains(cd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29711);assertFalse(notcd.contains(de));
        __CLR4_5_2mscmsclvha7fes.R.inc(29712);assertFalse(notcd.contains(ae));
        __CLR4_5_2mscmsclvha7fes.R.inc(29713);assertTrue(notcd.contains(ef));
        __CLR4_5_2mscmsclvha7fes.R.inc(29714);assertFalse(notcd.contains(all));
        __CLR4_5_2mscmsclvha7fes.R.inc(29715);assertFalse(notcd.contains(allbutfirst));

        // negated/negated
        __CLR4_5_2mscmsclvha7fes.R.inc(29716);assertFalse(notc.contains(notb));
        __CLR4_5_2mscmsclvha7fes.R.inc(29717);assertTrue(notc.contains(notc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29718);assertFalse(notc.contains(notd));

        __CLR4_5_2mscmsclvha7fes.R.inc(29719);assertFalse(notc.contains(notab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29720);assertTrue(notc.contains(notbc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29721);assertTrue(notc.contains(notbd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29722);assertTrue(notc.contains(notcd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29723);assertFalse(notc.contains(notde));

        __CLR4_5_2mscmsclvha7fes.R.inc(29724);assertFalse(notbd.contains(notb));
        __CLR4_5_2mscmsclvha7fes.R.inc(29725);assertFalse(notbd.contains(notc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29726);assertFalse(notbd.contains(notd));

        __CLR4_5_2mscmsclvha7fes.R.inc(29727);assertFalse(notbd.contains(notab));
        __CLR4_5_2mscmsclvha7fes.R.inc(29728);assertFalse(notbd.contains(notbc));
        __CLR4_5_2mscmsclvha7fes.R.inc(29729);assertTrue(notbd.contains(notbd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29730);assertFalse(notbd.contains(notcd));
        __CLR4_5_2mscmsclvha7fes.R.inc(29731);assertFalse(notbd.contains(notde));
        __CLR4_5_2mscmsclvha7fes.R.inc(29732);assertTrue(notbd.contains(notae));
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testContainsNullArg() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21hj6pxmxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContainsNullArg",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29733,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21hj6pxmxx(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29733);
        __CLR4_5_2mscmsclvha7fes.R.inc(29734);final CharRange range = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29735);try {
            __CLR4_5_2mscmsclvha7fes.R.inc(29736);@SuppressWarnings("unused")
            final
            boolean contains = range.contains(null);
        } catch(final IllegalArgumentException e) {
            __CLR4_5_2mscmsclvha7fes.R.inc(29737);assertEquals("The Range must not be null", e.getMessage());
        }
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9uicnmy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testIterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9uicnmy2(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29738);
        __CLR4_5_2mscmsclvha7fes.R.inc(29739);final CharRange a = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29740);final CharRange ad = CharRange.isIn('a', 'd');
        __CLR4_5_2mscmsclvha7fes.R.inc(29741);final CharRange nota = CharRange.isNot('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29742);final CharRange emptySet = CharRange.isNotIn((char) 0, Character.MAX_VALUE);
        __CLR4_5_2mscmsclvha7fes.R.inc(29743);final CharRange notFirst = CharRange.isNotIn((char) 1, Character.MAX_VALUE);
        __CLR4_5_2mscmsclvha7fes.R.inc(29744);final CharRange notLast = CharRange.isNotIn((char) 0, (char) (Character.MAX_VALUE - 1));

        __CLR4_5_2mscmsclvha7fes.R.inc(29745);final Iterator<Character> aIt = a.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29746);assertNotNull(aIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29747);assertTrue(aIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29748);assertEquals(Character.valueOf('a'), aIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29749);assertFalse(aIt.hasNext());

        __CLR4_5_2mscmsclvha7fes.R.inc(29750);final Iterator<Character> adIt = ad.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29751);assertNotNull(adIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29752);assertTrue(adIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29753);assertEquals(Character.valueOf('a'), adIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29754);assertEquals(Character.valueOf('b'), adIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29755);assertEquals(Character.valueOf('c'), adIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29756);assertEquals(Character.valueOf('d'), adIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29757);assertFalse(adIt.hasNext());

        __CLR4_5_2mscmsclvha7fes.R.inc(29758);final Iterator<Character> notaIt = nota.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29759);assertNotNull(notaIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29760);assertTrue(notaIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29761);while ((((notaIt.hasNext())&&(__CLR4_5_2mscmsclvha7fes.R.iget(29762)!=0|true))||(__CLR4_5_2mscmsclvha7fes.R.iget(29763)==0&false))) {{
            __CLR4_5_2mscmsclvha7fes.R.inc(29764);final Character c = notaIt.next();
            __CLR4_5_2mscmsclvha7fes.R.inc(29765);assertFalse('a' == c.charValue());
        }

        }__CLR4_5_2mscmsclvha7fes.R.inc(29766);final Iterator<Character> emptySetIt = emptySet.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29767);assertNotNull(emptySetIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29768);assertFalse(emptySetIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29769);try {
            __CLR4_5_2mscmsclvha7fes.R.inc(29770);emptySetIt.next();
            __CLR4_5_2mscmsclvha7fes.R.inc(29771);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_5_2mscmsclvha7fes.R.inc(29772);assertTrue(true);
        }

        __CLR4_5_2mscmsclvha7fes.R.inc(29773);final Iterator<Character> notFirstIt = notFirst.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29774);assertNotNull(notFirstIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29775);assertTrue(notFirstIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29776);assertEquals(Character.valueOf((char) 0), notFirstIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29777);assertFalse(notFirstIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29778);try {
            __CLR4_5_2mscmsclvha7fes.R.inc(29779);notFirstIt.next();
            __CLR4_5_2mscmsclvha7fes.R.inc(29780);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_5_2mscmsclvha7fes.R.inc(29781);assertTrue(true);
        }

        __CLR4_5_2mscmsclvha7fes.R.inc(29782);final Iterator<Character> notLastIt = notLast.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29783);assertNotNull(notLastIt);
        __CLR4_5_2mscmsclvha7fes.R.inc(29784);assertTrue(notLastIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29785);assertEquals(Character.valueOf(Character.MAX_VALUE), notLastIt.next());
        __CLR4_5_2mscmsclvha7fes.R.inc(29786);assertFalse(notLastIt.hasNext());
        __CLR4_5_2mscmsclvha7fes.R.inc(29787);try {
            __CLR4_5_2mscmsclvha7fes.R.inc(29788);notLastIt.next();
            __CLR4_5_2mscmsclvha7fes.R.inc(29789);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_5_2mscmsclvha7fes.R.inc(29790);assertTrue(true);
        }
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on9mzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on9mzj(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29791);
        __CLR4_5_2mscmsclvha7fes.R.inc(29792);CharRange range = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29793);assertEquals(range, SerializationUtils.clone(range)); 
        __CLR4_5_2mscmsclvha7fes.R.inc(29794);range = CharRange.isIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29795);assertEquals(range, SerializationUtils.clone(range)); 
        __CLR4_5_2mscmsclvha7fes.R.inc(29796);range = CharRange.isNotIn('a', 'e');
        __CLR4_5_2mscmsclvha7fes.R.inc(29797);assertEquals(range, SerializationUtils.clone(range)); 
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemove() {__CLR4_5_2mscmsclvha7fes.R.globalSliceStart(getClass().getName(),29798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcv1jfmzq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,116,101,114,97,116,111,114,82,101,109,111,118,101,58,32,91,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2mscmsclvha7fes.R.rethrow($CLV_t2$);}finally{__CLR4_5_2mscmsclvha7fes.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testIteratorRemove",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcv1jfmzq(){try{__CLR4_5_2mscmsclvha7fes.R.inc(29798);
        __CLR4_5_2mscmsclvha7fes.R.inc(29799);CharRange a = CharRange.is('a');
        __CLR4_5_2mscmsclvha7fes.R.inc(29800);final Iterator<Character> aIt = a.iterator();
        __CLR4_5_2mscmsclvha7fes.R.inc(29801);aIt.remove();
    }finally{__CLR4_5_2mscmsclvha7fes.R.flushNeeded();}}
}
