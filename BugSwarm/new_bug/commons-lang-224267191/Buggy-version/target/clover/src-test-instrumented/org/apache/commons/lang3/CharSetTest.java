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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharSet}.
 */
public class CharSetTest  {static class __CLR4_5_2n23n23lvha7fi0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,30219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x2ulvn23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x2ulvn23(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29883);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29884);assertTrue(Modifier.isPublic(CharSet.class.getModifiers()));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29885);assertFalse(Modifier.isFinal(CharSet.class.getModifiers()));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testGetInstance() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29yurb4n26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testGetInstance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29yurb4n26(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29886);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29887);assertSame(CharSet.EMPTY, CharSet.getInstance( (String) null));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29888);assertSame(CharSet.EMPTY, CharSet.getInstance(""));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29889);assertSame(CharSet.ASCII_ALPHA, CharSet.getInstance("a-zA-Z"));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29890);assertSame(CharSet.ASCII_ALPHA, CharSet.getInstance("A-Za-z"));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29891);assertSame(CharSet.ASCII_ALPHA_LOWER, CharSet.getInstance("a-z"));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29892);assertSame(CharSet.ASCII_ALPHA_UPPER, CharSet.getInstance("A-Z"));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29893);assertSame(CharSet.ASCII_NUMERIC, CharSet.getInstance("0-9"));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstance_Stringarray() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmm5k9n2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testGetInstance_Stringarray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmm5k9n2e(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29894);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29895);assertEquals(null, CharSet.getInstance((String[]) null));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29896);assertEquals("[]", CharSet.getInstance(new String[0]).toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29897);assertEquals("[]", CharSet.getInstance(new String[] {null}).toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29898);assertEquals("[a-e]", CharSet.getInstance(new String[] {"a-e"}).toString());
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_simple() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6wsi8n2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_simple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6wsi8n2j(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29899);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29900);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(29901);CharRange[] array;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29902);set = CharSet.getInstance((String) null);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29903);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29904);assertEquals("[]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29905);assertEquals(0, array.length);
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29906);set = CharSet.getInstance("");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29907);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29908);assertEquals("[]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29909);assertEquals(0, array.length);
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29910);set = CharSet.getInstance("a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29911);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29912);assertEquals("[a]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29913);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29914);assertEquals("a", array[0].toString());
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29915);set = CharSet.getInstance("^a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29916);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29917);assertEquals("[^a]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29918);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29919);assertEquals("^a", array[0].toString());
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29920);set = CharSet.getInstance("a-e");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29921);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29922);assertEquals("[a-e]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29923);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29924);assertEquals("a-e", array[0].toString());
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29925);set = CharSet.getInstance("^a-e");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29926);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29927);assertEquals("[^a-e]", set.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(29928);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29929);assertEquals("^a-e", array[0].toString());
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_combo() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jx4472n3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_combo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jx4472n3e(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29930);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29931);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(29932);CharRange[] array;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29933);set = CharSet.getInstance("abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29934);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29935);assertEquals(3, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29936);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29937);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29938);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29939);set = CharSet.getInstance("a-ce-f");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29940);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29941);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29942);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'c')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29943);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29944);set = CharSet.getInstance("ae-f");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29945);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29946);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29947);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29948);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29949);set = CharSet.getInstance("e-fa");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29950);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29951);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29952);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29953);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29954);set = CharSet.getInstance("ae-fm-pz");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29955);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29956);assertEquals(4, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29957);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29958);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29959);assertTrue(ArrayUtils.contains(array, CharRange.isIn('m', 'p')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29960);assertTrue(ArrayUtils.contains(array, CharRange.is('z')));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_comboNegated() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22smfdan49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_comboNegated",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22smfdan49(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29961);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29962);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(29963);CharRange[] array;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29964);set = CharSet.getInstance("^abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29965);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29966);assertEquals(3, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29967);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29968);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29969);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29970);set = CharSet.getInstance("b^ac");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29971);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29972);assertEquals(3, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29973);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29974);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29975);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29976);set = CharSet.getInstance("db^ac");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29977);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29978);assertEquals(4, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29979);assertTrue(ArrayUtils.contains(array, CharRange.is('d')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29980);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29981);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29982);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29983);set = CharSet.getInstance("^b^a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29984);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29985);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29986);assertTrue(ArrayUtils.contains(array, CharRange.isNot('b')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29987);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29988);set = CharSet.getInstance("b^a-c^z");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29989);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29990);assertEquals(3, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29991);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('a', 'c')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29992);assertTrue(ArrayUtils.contains(array, CharRange.isNot('z')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(29993);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}

    @Test
    public void testConstructor_String_oddDash() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),29994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235zey9n56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddDash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),29994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235zey9n56(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(29994);
        __CLR4_5_2n23n23lvha7fi0.R.inc(29995);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(29996);CharRange[] array;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(29997);set = CharSet.getInstance("-");
        __CLR4_5_2n23n23lvha7fi0.R.inc(29998);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(29999);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30000);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30001);set = CharSet.getInstance("--");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30002);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30003);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30004);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30005);set = CharSet.getInstance("---");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30006);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30007);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30008);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30009);set = CharSet.getInstance("----");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30010);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30011);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30012);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30013);set = CharSet.getInstance("-a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30014);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30015);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30016);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30017);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30018);set = CharSet.getInstance("a-");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30019);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30020);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30021);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30022);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30023);set = CharSet.getInstance("a--");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30024);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30025);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30026);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', '-')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30027);set = CharSet.getInstance("--a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30028);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30029);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30030);assertTrue(ArrayUtils.contains(array, CharRange.isIn('-', 'a')));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_oddNegate() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2taotsxn67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddNegate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2taotsxn67(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30031);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30032);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(30033);CharRange[] array;
        __CLR4_5_2n23n23lvha7fi0.R.inc(30034);set = CharSet.getInstance("^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30035);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30036);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30037);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30038);set = CharSet.getInstance("^^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30039);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30040);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30041);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30042);set = CharSet.getInstance("^^^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30043);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30044);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30045);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30046);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30047);set = CharSet.getInstance("^^^^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30048);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30049);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30050);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^" x2
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30051);set = CharSet.getInstance("a^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30052);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30053);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30054);assertTrue(ArrayUtils.contains(array, CharRange.is('a'))); // "a"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30055);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30056);set = CharSet.getInstance("^a-");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30057);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30058);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30059);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a'))); // "^a"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30060);assertTrue(ArrayUtils.contains(array, CharRange.is('-'))); // "-"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30061);set = CharSet.getInstance("^^-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30062);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30063);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30064);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('^', 'c'))); // "^^-c"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30065);set = CharSet.getInstance("^c-^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30066);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30067);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30068);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('c', '^'))); // "^c-^"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30069);set = CharSet.getInstance("^c-^d");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30070);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30071);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30072);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('c', '^'))); // "^c-^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30073);assertTrue(ArrayUtils.contains(array, CharRange.is('d'))); // "d"
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30074);set = CharSet.getInstance("^^-");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30075);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30076);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30077);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30078);assertTrue(ArrayUtils.contains(array, CharRange.is('-'))); // "-"
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_oddCombinations() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28cfh7hn7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddCombinations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28cfh7hn7j(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30079);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30080);CharSet set;
        __CLR4_5_2n23n23lvha7fi0.R.inc(30081);CharRange[] array = null;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30082);set = CharSet.getInstance("a-^c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30083);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30084);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', '^'))); // "a-^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30085);assertTrue(ArrayUtils.contains(array, CharRange.is('c'))); // "c"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30086);assertFalse(set.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30087);assertTrue(set.contains('^'));  
        __CLR4_5_2n23n23lvha7fi0.R.inc(30088);assertTrue(set.contains('_')); // between ^ and a
        __CLR4_5_2n23n23lvha7fi0.R.inc(30089);assertTrue(set.contains('c'));  
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30090);set = CharSet.getInstance("^a-^c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30091);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30092);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('a', '^'))); // "^a-^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30093);assertTrue(ArrayUtils.contains(array, CharRange.is('c'))); // "c"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30094);assertTrue(set.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30095);assertFalse(set.contains('^'));  
        __CLR4_5_2n23n23lvha7fi0.R.inc(30096);assertFalse(set.contains('_')); // between ^ and a
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30097);set = CharSet.getInstance("a- ^-- "); //contains everything
        __CLR4_5_2n23n23lvha7fi0.R.inc(30098);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30099);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', ' '))); // "a- "
        __CLR4_5_2n23n23lvha7fi0.R.inc(30100);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('-', ' '))); // "^-- "
        __CLR4_5_2n23n23lvha7fi0.R.inc(30101);assertTrue(set.contains('#'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30102);assertTrue(set.contains('^'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30103);assertTrue(set.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30104);assertTrue(set.contains('*'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30105);assertTrue(set.contains('A'));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30106);set = CharSet.getInstance("^-b");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30107);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30108);assertTrue(ArrayUtils.contains(array, CharRange.isIn('^','b'))); // "^-b"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30109);assertTrue(set.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30110);assertTrue(set.contains('_')); // between ^ and a
        __CLR4_5_2n23n23lvha7fi0.R.inc(30111);assertFalse(set.contains('A'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30112);assertTrue(set.contains('^')); 
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30113);set = CharSet.getInstance("b-^");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30114);array = set.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30115);assertTrue(ArrayUtils.contains(array, CharRange.isIn('^','b'))); // "b-^"
        __CLR4_5_2n23n23lvha7fi0.R.inc(30116);assertTrue(set.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30117);assertTrue(set.contains('^'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30118);assertTrue(set.contains('a')); // between ^ and b
        __CLR4_5_2n23n23lvha7fi0.R.inc(30119);assertFalse(set.contains('c')); 
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
        
    //-----------------------------------------------------------------------    
    @Test
    public void testEquals_Object() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q292p8n8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testEquals_Object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q292p8n8o(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30120);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30121);final CharSet abc = CharSet.getInstance("abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30122);final CharSet abc2 = CharSet.getInstance("abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30123);final CharSet atoc = CharSet.getInstance("a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30124);final CharSet atoc2 = CharSet.getInstance("a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30125);final CharSet notatoc = CharSet.getInstance("^a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30126);final CharSet notatoc2 = CharSet.getInstance("^a-c");
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30127);assertFalse(abc.equals(null));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30128);assertTrue(abc.equals(abc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30129);assertTrue(abc.equals(abc2));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30130);assertFalse(abc.equals(atoc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30131);assertFalse(abc.equals(notatoc));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30132);assertFalse(atoc.equals(abc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30133);assertTrue(atoc.equals(atoc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30134);assertTrue(atoc.equals(atoc2));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30135);assertFalse(atoc.equals(notatoc));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30136);assertFalse(notatoc.equals(abc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30137);assertFalse(notatoc.equals(atoc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30138);assertTrue(notatoc.equals(notatoc));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30139);assertTrue(notatoc.equals(notatoc2));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
            
    @Test
    public void testHashCode() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zkhv8n98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testHashCode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zkhv8n98(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30140);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30141);final CharSet abc = CharSet.getInstance("abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30142);final CharSet abc2 = CharSet.getInstance("abc");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30143);final CharSet atoc = CharSet.getInstance("a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30144);final CharSet atoc2 = CharSet.getInstance("a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30145);final CharSet notatoc = CharSet.getInstance("^a-c");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30146);final CharSet notatoc2 = CharSet.getInstance("^a-c");
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30147);assertEquals(abc.hashCode(), abc.hashCode());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30148);assertEquals(abc.hashCode(), abc2.hashCode());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30149);assertEquals(atoc.hashCode(), atoc.hashCode());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30150);assertEquals(atoc.hashCode(), atoc2.hashCode());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30151);assertEquals(notatoc.hashCode(), notatoc.hashCode());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30152);assertEquals(notatoc.hashCode(), notatoc2.hashCode());
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testContains_Char() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8fyfpn9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testContains_Char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8fyfpn9l(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30153);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30154);final CharSet btod = CharSet.getInstance("b-d");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30155);final CharSet dtob = CharSet.getInstance("d-b");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30156);final CharSet bcd = CharSet.getInstance("bcd");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30157);final CharSet bd = CharSet.getInstance("bd");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30158);final CharSet notbtod = CharSet.getInstance("^b-d");
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30159);assertFalse(btod.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30160);assertTrue(btod.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30161);assertTrue(btod.contains('c'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30162);assertTrue(btod.contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30163);assertFalse(btod.contains('e'));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30164);assertFalse(bcd.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30165);assertTrue(bcd.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30166);assertTrue(bcd.contains('c'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30167);assertTrue(bcd.contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30168);assertFalse(bcd.contains('e'));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30169);assertFalse(bd.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30170);assertTrue(bd.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30171);assertFalse(bd.contains('c'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30172);assertTrue(bd.contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30173);assertFalse(bd.contains('e'));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30174);assertTrue(notbtod.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30175);assertFalse(notbtod.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30176);assertFalse(notbtod.contains('c'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30177);assertFalse(notbtod.contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30178);assertTrue(notbtod.contains('e'));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30179);assertFalse(dtob.contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30180);assertTrue(dtob.contains('b'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30181);assertTrue(dtob.contains('c'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30182);assertTrue(dtob.contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30183);assertFalse(dtob.contains('e'));
      
        __CLR4_5_2n23n23lvha7fi0.R.inc(30184);final CharRange[] array = dtob.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30185);assertEquals("[b-d]", dtob.toString());
        __CLR4_5_2n23n23lvha7fi0.R.inc(30186);assertEquals(1, array.length);
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testSerialization() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on9naj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on9naj(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30187);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30188);CharSet set = CharSet.getInstance("a");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30189);assertEquals(set, SerializationUtils.clone(set)); 
        __CLR4_5_2n23n23lvha7fi0.R.inc(30190);set = CharSet.getInstance("a-e");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30191);assertEquals(set, SerializationUtils.clone(set)); 
        __CLR4_5_2n23n23lvha7fi0.R.inc(30192);set = CharSet.getInstance("be-f^a-z");
        __CLR4_5_2n23n23lvha7fi0.R.inc(30193);assertEquals(set, SerializationUtils.clone(set)); 
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testStatics() {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i1n64anaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testStatics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i1n64anaq(){try{__CLR4_5_2n23n23lvha7fi0.R.inc(30194);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30195);CharRange[] array;
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30196);array = CharSet.EMPTY.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30197);assertEquals(0, array.length);
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30198);array = CharSet.ASCII_ALPHA.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30199);assertEquals(2, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30200);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'z')));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30201);assertTrue(ArrayUtils.contains(array, CharRange.isIn('A', 'Z')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30202);array = CharSet.ASCII_ALPHA_LOWER.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30203);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30204);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'z')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30205);array = CharSet.ASCII_ALPHA_UPPER.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30206);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30207);assertTrue(ArrayUtils.contains(array, CharRange.isIn('A', 'Z')));
        
        __CLR4_5_2n23n23lvha7fi0.R.inc(30208);array = CharSet.ASCII_NUMERIC.getCharRanges();
        __CLR4_5_2n23n23lvha7fi0.R.inc(30209);assertEquals(1, array.length);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30210);assertTrue(ArrayUtils.contains(array, CharRange.isIn('0', '9')));
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
    
    @Test
    public void testJavadocExamples() throws Exception {__CLR4_5_2n23n23lvha7fi0.R.globalSliceStart(getClass().getName(),30211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w9cvt8nb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2n23n23lvha7fi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2n23n23lvha7fi0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testJavadocExamples",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w9cvt8nb7() throws Exception{try{__CLR4_5_2n23n23lvha7fi0.R.inc(30211);
        __CLR4_5_2n23n23lvha7fi0.R.inc(30212);assertFalse(CharSet.getInstance("^a-c").contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30213);assertTrue(CharSet.getInstance("^a-c").contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30214);assertTrue(CharSet.getInstance("^^a-c").contains('a'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30215);assertFalse(CharSet.getInstance("^^a-c").contains('^'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30216);assertTrue(CharSet.getInstance("^a-cd-f").contains('d'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30217);assertTrue(CharSet.getInstance("a-c^").contains('^'));
        __CLR4_5_2n23n23lvha7fi0.R.inc(30218);assertTrue(CharSet.getInstance("^", "a-c").contains('^'));        
    }finally{__CLR4_5_2n23n23lvha7fi0.R.flushNeeded();}}
}
