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
package org.apache.commons.lang3.mutable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * JUnit tests.
 * 
 * @see MutableShort
 */
public class MutableShortTest {static class __CLR4_5_211wo11wolvha7i5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,49268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lwxahe11wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testConstructors",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lwxahe11wo(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49128);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49129);assertEquals((short) 0, new MutableShort().shortValue());
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49130);assertEquals((short) 1, new MutableShort((short) 1).shortValue());
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49131);assertEquals((short) 2, new MutableShort(Short.valueOf((short) 2)).shortValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49132);assertEquals((short) 3, new MutableShort(new MutableShort((short) 3)).shortValue());

        __CLR4_5_211wo11wolvha7i5o.R.inc(49133);assertEquals((short) 2, new MutableShort("2").shortValue());

        __CLR4_5_211wo11wolvha7i5o.R.inc(49134);try {
            __CLR4_5_211wo11wolvha7i5o.R.inc(49135);new MutableShort((Number)null);
            __CLR4_5_211wo11wolvha7i5o.R.inc(49136);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22wnvh711wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetSet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22wnvh711wx(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49137);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49138);final MutableShort mutNum = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49139);assertEquals((short) 0, new MutableShort().shortValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49140);assertEquals(Short.valueOf((short) 0), new MutableShort().getValue());
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49141);mutNum.setValue((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49142);assertEquals((short) 1, mutNum.shortValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49143);assertEquals(Short.valueOf((short) 1), mutNum.getValue());
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49144);mutNum.setValue(Short.valueOf((short) 2));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49145);assertEquals((short) 2, mutNum.shortValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49146);assertEquals(Short.valueOf((short) 2), mutNum.getValue());
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49147);mutNum.setValue(new MutableShort((short) 3));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49148);assertEquals((short) 3, mutNum.shortValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49149);assertEquals(Short.valueOf((short) 3), mutNum.getValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49150);try {
            __CLR4_5_211wo11wolvha7i5o.R.inc(49151);mutNum.setValue(null);
            __CLR4_5_211wo11wolvha7i5o.R.inc(49152);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e60811xd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e60811xd(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49153);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49154);final MutableShort mutNumA = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49155);final MutableShort mutNumB = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49156);final MutableShort mutNumC = new MutableShort((short) 1);

        __CLR4_5_211wo11wolvha7i5o.R.inc(49157);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49158);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49159);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49160);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49161);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49162);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49163);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49164);assertFalse(mutNumA.equals(null));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49165);assertFalse(mutNumA.equals(Short.valueOf((short) 0)));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49166);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv811xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv811xr(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49167);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49168);final MutableShort mutNumA = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49169);final MutableShort mutNumB = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49170);final MutableShort mutNumC = new MutableShort((short) 1);

        __CLR4_5_211wo11wolvha7i5o.R.inc(49171);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49172);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49173);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49174);assertTrue(mutNumA.hashCode() == Short.valueOf((short) 0).hashCode());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pz6vfv11xz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testCompareTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pz6vfv11xz(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49175);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49176);final MutableShort mutNum = new MutableShort((short) 0);

        __CLR4_5_211wo11wolvha7i5o.R.inc(49177);assertEquals((short) 0, mutNum.compareTo(new MutableShort((short) 0)));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49178);assertEquals((short) +1, mutNum.compareTo(new MutableShort((short) -1)));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49179);assertEquals((short) -1, mutNum.compareTo(new MutableShort((short) 1)));
        __CLR4_5_211wo11wolvha7i5o.R.inc(49180);try {
            __CLR4_5_211wo11wolvha7i5o.R.inc(49181);mutNum.compareTo(null);
            __CLR4_5_211wo11wolvha7i5o.R.inc(49182);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uifry11y7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testPrimitiveValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uifry11y7(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49183);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49184);final MutableShort mutNum = new MutableShort( (short) 1 );
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49185);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_5_211wo11wolvha7i5o.R.inc(49186);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_5_211wo11wolvha7i5o.R.inc(49187);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_5_211wo11wolvha7i5o.R.inc(49188);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_5_211wo11wolvha7i5o.R.inc(49189);assertEquals( 1, mutNum.intValue() );
        __CLR4_5_211wo11wolvha7i5o.R.inc(49190);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testToShort() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3ox5611yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testToShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3ox5611yf(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49191);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49192);assertEquals(Short.valueOf((short) 0), new MutableShort((short) 0).toShort());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49193);assertEquals(Short.valueOf((short) 123), new MutableShort((short) 123).toShort());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6qqn011yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6qqn011yi(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49194);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49195);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49196);mutNum.increment();
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49197);assertEquals(2, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49198);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testIncrementAndGet() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qa1xk311yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testIncrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qa1xk311yn(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49199);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49200);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49201);final short result = mutNum.incrementAndGet();

        __CLR4_5_211wo11wolvha7i5o.R.inc(49202);assertEquals(2, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49203);assertEquals(2, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49204);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testGetAndIncrement() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0tjtv11yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetAndIncrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49205,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0tjtv11yt(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49205);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49206);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49207);final short result = mutNum.getAndIncrement();

        __CLR4_5_211wo11wolvha7i5o.R.inc(49208);assertEquals(1, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49209);assertEquals(2, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49210);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pripmw11yz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pripmw11yz(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49211);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49212);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49213);mutNum.decrement();
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49214);assertEquals(0, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49215);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testDecrementAndGet() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272ukah11z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testDecrementAndGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272ukah11z4(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49216);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49217);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49218);final short result = mutNum.decrementAndGet();

        __CLR4_5_211wo11wolvha7i5o.R.inc(49219);assertEquals(0, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49220);assertEquals(0, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49221);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testGetAndDecrement() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28211vd11za();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetAndDecrement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28211vd11za(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49222);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49223);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49224);final short result = mutNum.getAndDecrement();

        __CLR4_5_211wo11wolvha7i5o.R.inc(49225);assertEquals(1, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49226);assertEquals(0, mutNum.intValue());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49227);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrme6s11zg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrme6s11zg(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49228);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49229);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49230);mutNum.add((short) 1);
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49231);assertEquals((short) 2, mutNum.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu6v3s11zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49232,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu6v3s11zk(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49232);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49233);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49234);mutNum.add(Short.valueOf((short) 1));
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49235);assertEquals((short) 2, mutNum.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testGetAndAddValuePrimitive() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n5m0b11zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetAndAddValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n5m0b11zo(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49236);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49237);final MutableShort mutableShort = new MutableShort((short)0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49238);final short result = mutableShort.getAndAdd((short) 1);

        __CLR4_5_211wo11wolvha7i5o.R.inc(49239);assertEquals((short) 0, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49240);assertEquals((short) 1, mutableShort.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testGetAndAddValueObject() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzlrhl11zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetAndAddValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzlrhl11zt(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49241);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49242);final MutableShort mutableShort = new MutableShort((short)0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49243);final short result = mutableShort.getAndAdd(Short.valueOf((short) 1));

        __CLR4_5_211wo11wolvha7i5o.R.inc(49244);assertEquals((short) 0, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49245);assertEquals((short) 1, mutableShort.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testAddAndGetValuePrimitive() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_211nwiz11zy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddAndGetValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_211nwiz11zy(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49246);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49247);final MutableShort mutableShort = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49248);final short result = mutableShort.addAndGet((short) 1);

        __CLR4_5_211wo11wolvha7i5o.R.inc(49249);assertEquals((short) 1, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49250);assertEquals((short) 1, mutableShort.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testAddAndGetValueObject() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24to3131203();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddAndGetValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24to3131203(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49251);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49252);final MutableShort mutableShort = new MutableShort((short) 0);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49253);final short result = mutableShort.addAndGet(Short.valueOf((short) 1));

        __CLR4_5_211wo11wolvha7i5o.R.inc(49254);assertEquals((short) 1, result);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49255);assertEquals((short) 1, mutableShort.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w07icj1208();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testSubtractValuePrimitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w07icj1208(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49256);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49257);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49258);mutNum.subtract((short) 1);
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49259);assertEquals((short) 0, mutNum.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xnns6p120c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testSubtractValueObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xnns6p120c(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49260);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49261);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49262);mutNum.subtract(Short.valueOf((short) 1));
        
        __CLR4_5_211wo11wolvha7i5o.R.inc(49263);assertEquals((short) 0, mutNum.shortValue());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_5_211wo11wolvha7i5o.R.globalSliceStart(getClass().getName(),49264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrxdid120g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211wo11wolvha7i5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_211wo11wolvha7i5o.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrxdid120g(){try{__CLR4_5_211wo11wolvha7i5o.R.inc(49264);
        __CLR4_5_211wo11wolvha7i5o.R.inc(49265);assertEquals("0", new MutableShort((short) 0).toString());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49266);assertEquals("10", new MutableShort((short) 10).toString());
        __CLR4_5_211wo11wolvha7i5o.R.inc(49267);assertEquals("-123", new MutableShort((short) -123).toString());
    }finally{__CLR4_5_211wo11wolvha7i5o.R.flushNeeded();}}

}
