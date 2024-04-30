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

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.translate.EntityArrays}.
 */
@Deprecated
public class EntityArraysTest  {static class __CLR4_5_216hq16hqlvha7ilp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,55102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructorExists() {__CLR4_5_216hq16hqlvha7ilp.R.globalSliceStart(getClass().getName(),55070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21fvlx116hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hq16hqlvha7ilp.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hq16hqlvha7ilp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testConstructorExists",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21fvlx116hq(){try{__CLR4_5_216hq16hqlvha7ilp.R.inc(55070);
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55071);new EntityArrays();
    }finally{__CLR4_5_216hq16hqlvha7ilp.R.flushNeeded();}}
    
    // LANG-659 - check arrays for duplicate entries
    @Test
    public void testHTML40_EXTENDED_ESCAPE(){__CLR4_5_216hq16hqlvha7ilp.R.globalSliceStart(getClass().getName(),55072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mewrq016hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hq16hqlvha7ilp.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hq16hqlvha7ilp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testHTML40_EXTENDED_ESCAPE",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55072,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mewrq016hs(){try{__CLR4_5_216hq16hqlvha7ilp.R.inc(55072);
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55073);final Set<String> col0 = new HashSet<>();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55074);final Set<String> col1 = new HashSet<>();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55075);final String [][] sa = EntityArrays.HTML40_EXTENDED_ESCAPE();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55076);for(int i =0; (((i <sa.length)&&(__CLR4_5_216hq16hqlvha7ilp.R.iget(55077)!=0|true))||(__CLR4_5_216hq16hqlvha7ilp.R.iget(55078)==0&false)); i++){{
            __CLR4_5_216hq16hqlvha7ilp.R.inc(55079);assertTrue("Already added entry 0: "+i+" "+sa[i][0],col0.add(sa[i][0]));
            __CLR4_5_216hq16hqlvha7ilp.R.inc(55080);assertTrue("Already added entry 1: "+i+" "+sa[i][1],col1.add(sa[i][1]));
        }
    }}finally{__CLR4_5_216hq16hqlvha7ilp.R.flushNeeded();}}
    
   // LANG-658 - check arrays for duplicate entries
    @Test
    public void testISO8859_1_ESCAPE(){__CLR4_5_216hq16hqlvha7ilp.R.globalSliceStart(getClass().getName(),55081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pg8e2m16i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hq16hqlvha7ilp.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hq16hqlvha7ilp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testISO8859_1_ESCAPE",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pg8e2m16i1(){try{__CLR4_5_216hq16hqlvha7ilp.R.inc(55081);
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55082);final Set<String> col0 = new HashSet<>();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55083);final Set<String> col1 = new HashSet<>();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55084);final String [][] sa = EntityArrays.ISO8859_1_ESCAPE();
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55085);boolean success = true;
        __CLR4_5_216hq16hqlvha7ilp.R.inc(55086);for(int i =0; (((i <sa.length)&&(__CLR4_5_216hq16hqlvha7ilp.R.iget(55087)!=0|true))||(__CLR4_5_216hq16hqlvha7ilp.R.iget(55088)==0&false)); i++){{
            __CLR4_5_216hq16hqlvha7ilp.R.inc(55089);final boolean add0 = col0.add(sa[i][0]);
            __CLR4_5_216hq16hqlvha7ilp.R.inc(55090);final boolean add1 = col1.add(sa[i][1]);
            __CLR4_5_216hq16hqlvha7ilp.R.inc(55091);if ((((!add0)&&(__CLR4_5_216hq16hqlvha7ilp.R.iget(55092)!=0|true))||(__CLR4_5_216hq16hqlvha7ilp.R.iget(55093)==0&false))) {{ 
                __CLR4_5_216hq16hqlvha7ilp.R.inc(55094);success = false;
                __CLR4_5_216hq16hqlvha7ilp.R.inc(55095);System.out.println("Already added entry 0: "+i+" "+sa[i][0]+" "+sa[i][1]);
            }
            }__CLR4_5_216hq16hqlvha7ilp.R.inc(55096);if ((((!add1)&&(__CLR4_5_216hq16hqlvha7ilp.R.iget(55097)!=0|true))||(__CLR4_5_216hq16hqlvha7ilp.R.iget(55098)==0&false))) {{
                __CLR4_5_216hq16hqlvha7ilp.R.inc(55099);success = false;
                __CLR4_5_216hq16hqlvha7ilp.R.inc(55100);System.out.println("Already added entry 1: "+i+" "+sa[i][0]+" "+sa[i][1]);
            }
        }}
        }__CLR4_5_216hq16hqlvha7ilp.R.inc(55101);assertTrue("One or more errors detected",success);
    }finally{__CLR4_5_216hq16hqlvha7ilp.R.flushNeeded();}}
    
    
}
