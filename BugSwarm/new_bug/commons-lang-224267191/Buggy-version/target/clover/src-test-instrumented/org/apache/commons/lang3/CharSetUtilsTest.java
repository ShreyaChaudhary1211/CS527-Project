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
 * Unit tests {@link org.apache.commons.lang3.CharSetUtils}.
 */
public class CharSetUtilsTest  {static class __CLR4_5_2nbfnbflvha7fif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,30373,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hnbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hnbf(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30219);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30220);assertNotNull(new CharSetUtils());
        __CLR4_5_2nbfnbflvha7fif.R.inc(30221);final Constructor<?>[] cons = CharSetUtils.class.getDeclaredConstructors();
        __CLR4_5_2nbfnbflvha7fif.R.inc(30222);assertEquals(1, cons.length);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30223);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30224);assertTrue(Modifier.isPublic(CharSetUtils.class.getModifiers()));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30225);assertFalse(Modifier.isFinal(CharSetUtils.class.getModifiers()));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSqueeze_StringString() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_277uwegnbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testSqueeze_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_277uwegnbm(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30226);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30227);assertEquals(null, CharSetUtils.squeeze(null, (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30228);assertEquals(null, CharSetUtils.squeeze(null, ""));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30229);assertEquals("", CharSetUtils.squeeze("", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30230);assertEquals("", CharSetUtils.squeeze("", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30231);assertEquals("", CharSetUtils.squeeze("", "a-e"));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30232);assertEquals("hello", CharSetUtils.squeeze("hello", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30233);assertEquals("hello", CharSetUtils.squeeze("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30234);assertEquals("hello", CharSetUtils.squeeze("hello", "a-e"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30235);assertEquals("helo", CharSetUtils.squeeze("hello", "l-p"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30236);assertEquals("heloo", CharSetUtils.squeeze("helloo", "l"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30237);assertEquals("hello", CharSetUtils.squeeze("helloo", "^l"));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    @Test
    public void testSqueeze_StringStringarray() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m2trsfnby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testSqueeze_StringStringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m2trsfnby(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30238);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30239);assertEquals(null, CharSetUtils.squeeze(null, (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30240);assertEquals(null, CharSetUtils.squeeze(null, new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30241);assertEquals(null, CharSetUtils.squeeze(null, new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30242);assertEquals(null, CharSetUtils.squeeze(null, new String[] {"el"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30243);assertEquals("", CharSetUtils.squeeze("", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30244);assertEquals("", CharSetUtils.squeeze("", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30245);assertEquals("", CharSetUtils.squeeze("", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30246);assertEquals("", CharSetUtils.squeeze("", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30247);assertEquals("hello", CharSetUtils.squeeze("hello", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30248);assertEquals("hello", CharSetUtils.squeeze("hello", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30249);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30250);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30251);assertEquals("helo", CharSetUtils.squeeze("hello", new String[] { "el" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30252);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] { "e" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30253);assertEquals("fofof", CharSetUtils.squeeze("fooffooff", new String[] { "of" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30254);assertEquals("fof", CharSetUtils.squeeze("fooooff", new String[] { "fo" }));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContainsAny_StringString() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i4ipo3ncf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testContainsAny_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i4ipo3ncf(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30255);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30256);assertFalse(CharSetUtils.containsAny(null, (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30257);assertFalse(CharSetUtils.containsAny(null, ""));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30258);assertFalse(CharSetUtils.containsAny("", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30259);assertFalse(CharSetUtils.containsAny("", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30260);assertFalse(CharSetUtils.containsAny("", "a-e"));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30261);assertFalse(CharSetUtils.containsAny("hello", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30262);assertFalse(CharSetUtils.containsAny("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30263);assertTrue(CharSetUtils.containsAny("hello", "a-e"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30264);assertTrue(CharSetUtils.containsAny("hello", "l-p"));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    @Test
    public void testContainsAny_StringStringarray() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ff7y12ncp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testContainsAny_StringStringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ff7y12ncp(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30265);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30266);assertFalse(CharSetUtils.containsAny(null, (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30267);assertFalse(CharSetUtils.containsAny(null, new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30268);assertFalse(CharSetUtils.containsAny(null, new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30269);assertFalse(CharSetUtils.containsAny(null, new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30270);assertFalse(CharSetUtils.containsAny("", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30271);assertFalse(CharSetUtils.containsAny("", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30272);assertFalse(CharSetUtils.containsAny("", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30273);assertFalse(CharSetUtils.containsAny("", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30274);assertFalse(CharSetUtils.containsAny("hello", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30275);assertFalse(CharSetUtils.containsAny("hello", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30276);assertFalse(CharSetUtils.containsAny("hello", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30277);assertTrue(CharSetUtils.containsAny("hello", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30278);assertTrue(CharSetUtils.containsAny("hello", new String[] { "el" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30279);assertFalse(CharSetUtils.containsAny("hello", new String[] { "x" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30280);assertTrue(CharSetUtils.containsAny("hello", new String[] { "e-i" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30281);assertTrue(CharSetUtils.containsAny("hello", new String[] { "a-z" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30282);assertFalse(CharSetUtils.containsAny("hello", new String[] { "" }));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCount_StringString() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23lgldhnd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testCount_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23lgldhnd7(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30283);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30284);assertEquals(0, CharSetUtils.count(null, (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30285);assertEquals(0, CharSetUtils.count(null, ""));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30286);assertEquals(0, CharSetUtils.count("", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30287);assertEquals(0, CharSetUtils.count("", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30288);assertEquals(0, CharSetUtils.count("", "a-e"));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30289);assertEquals(0, CharSetUtils.count("hello", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30290);assertEquals(0, CharSetUtils.count("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30291);assertEquals(1, CharSetUtils.count("hello", "a-e"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30292);assertEquals(3, CharSetUtils.count("hello", "l-p"));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    @Test
    public void testCount_StringStringarray() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ddjlvgndh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testCount_StringStringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ddjlvgndh(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30293);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30294);assertEquals(0, CharSetUtils.count(null, (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30295);assertEquals(0, CharSetUtils.count(null, new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30296);assertEquals(0, CharSetUtils.count(null, new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30297);assertEquals(0, CharSetUtils.count(null, new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30298);assertEquals(0, CharSetUtils.count("", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30299);assertEquals(0, CharSetUtils.count("", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30300);assertEquals(0, CharSetUtils.count("", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30301);assertEquals(0, CharSetUtils.count("", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30302);assertEquals(0, CharSetUtils.count("hello", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30303);assertEquals(0, CharSetUtils.count("hello", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30304);assertEquals(0, CharSetUtils.count("hello", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30305);assertEquals(1, CharSetUtils.count("hello", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30306);assertEquals(3, CharSetUtils.count("hello", new String[] { "el" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30307);assertEquals(0, CharSetUtils.count("hello", new String[] { "x" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30308);assertEquals(2, CharSetUtils.count("hello", new String[] { "e-i" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30309);assertEquals(5, CharSetUtils.count("hello", new String[] { "a-z" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30310);assertEquals(0, CharSetUtils.count("hello", new String[] { "" }));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testKeep_StringString() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aycwq9ndz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testKeep_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aycwq9ndz(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30311);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30312);assertEquals(null, CharSetUtils.keep(null, (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30313);assertEquals(null, CharSetUtils.keep(null, ""));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30314);assertEquals("", CharSetUtils.keep("", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30315);assertEquals("", CharSetUtils.keep("", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30316);assertEquals("", CharSetUtils.keep("", "a-e"));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30317);assertEquals("", CharSetUtils.keep("hello", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30318);assertEquals("", CharSetUtils.keep("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30319);assertEquals("", CharSetUtils.keep("hello", "xyz"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30320);assertEquals("hello", CharSetUtils.keep("hello", "a-z"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30321);assertEquals("hello", CharSetUtils.keep("hello", "oleh"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30322);assertEquals("ell", CharSetUtils.keep("hello", "el"));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    @Test
    public void testKeep_StringStringarray() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4eppmneb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testKeep_StringStringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30323,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4eppmneb(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30323);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30324);assertEquals(null, CharSetUtils.keep(null, (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30325);assertEquals(null, CharSetUtils.keep(null, new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30326);assertEquals(null, CharSetUtils.keep(null, new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30327);assertEquals(null, CharSetUtils.keep(null, new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30328);assertEquals("", CharSetUtils.keep("", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30329);assertEquals("", CharSetUtils.keep("", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30330);assertEquals("", CharSetUtils.keep("", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30331);assertEquals("", CharSetUtils.keep("", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30332);assertEquals("", CharSetUtils.keep("hello", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30333);assertEquals("", CharSetUtils.keep("hello", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30334);assertEquals("", CharSetUtils.keep("hello", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30335);assertEquals("e", CharSetUtils.keep("hello", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30336);assertEquals("e", CharSetUtils.keep("hello", new String[] { "a-e" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30337);assertEquals("ell", CharSetUtils.keep("hello", new String[] { "el" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30338);assertEquals("hello", CharSetUtils.keep("hello", new String[] { "elho" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30339);assertEquals("hello", CharSetUtils.keep("hello", new String[] { "a-z" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30340);assertEquals("----", CharSetUtils.keep("----", new String[] { "-" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30341);assertEquals("ll", CharSetUtils.keep("hello", new String[] { "l" }));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDelete_StringString() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbf5v9neu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testDelete_StringString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbf5v9neu(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30342);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30343);assertEquals(null, CharSetUtils.delete(null, (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30344);assertEquals(null, CharSetUtils.delete(null, ""));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30345);assertEquals("", CharSetUtils.delete("", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30346);assertEquals("", CharSetUtils.delete("", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30347);assertEquals("", CharSetUtils.delete("", "a-e"));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30348);assertEquals("hello", CharSetUtils.delete("hello", (String) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30349);assertEquals("hello", CharSetUtils.delete("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30350);assertEquals("hllo", CharSetUtils.delete("hello", "a-e"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30351);assertEquals("he", CharSetUtils.delete("hello", "l-p"));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30352);assertEquals("hello", CharSetUtils.delete("hello", "z"));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
    @Test
    public void testDelete_StringStringarray() {__CLR4_5_2nbfnbflvha7fif.R.globalSliceStart(getClass().getName(),30353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bvs5vgnf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nbfnbflvha7fif.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nbfnbflvha7fif.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testDelete_StringStringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bvs5vgnf5(){try{__CLR4_5_2nbfnbflvha7fif.R.inc(30353);
        __CLR4_5_2nbfnbflvha7fif.R.inc(30354);assertEquals(null, CharSetUtils.delete(null, (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30355);assertEquals(null, CharSetUtils.delete(null, new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30356);assertEquals(null, CharSetUtils.delete(null, new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30357);assertEquals(null, CharSetUtils.delete(null, new String[] {"el"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30358);assertEquals("", CharSetUtils.delete("", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30359);assertEquals("", CharSetUtils.delete("", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30360);assertEquals("", CharSetUtils.delete("", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30361);assertEquals("", CharSetUtils.delete("", new String[] {"a-e"}));
        
        __CLR4_5_2nbfnbflvha7fif.R.inc(30362);assertEquals("hello", CharSetUtils.delete("hello", (String[]) null));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30363);assertEquals("hello", CharSetUtils.delete("hello", new String[0]));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30364);assertEquals("hello", CharSetUtils.delete("hello", new String[] {null}));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30365);assertEquals("hello", CharSetUtils.delete("hello", new String[] {"xyz"}));

        __CLR4_5_2nbfnbflvha7fif.R.inc(30366);assertEquals("ho", CharSetUtils.delete("hello", new String[] { "el" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30367);assertEquals("", CharSetUtils.delete("hello", new String[] { "elho" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30368);assertEquals("hello", CharSetUtils.delete("hello", new String[] { "" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30369);assertEquals("hello", CharSetUtils.delete("hello", ""));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30370);assertEquals("", CharSetUtils.delete("hello", new String[] { "a-z" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30371);assertEquals("", CharSetUtils.delete("----", new String[] { "-" }));
        __CLR4_5_2nbfnbflvha7fif.R.inc(30372);assertEquals("heo", CharSetUtils.delete("hello", new String[] { "l" }));
    }finally{__CLR4_5_2nbfnbflvha7fif.R.flushNeeded();}}
    
}
