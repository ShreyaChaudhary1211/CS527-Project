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

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Random;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.RandomStringUtils}.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class RandomStringUtilsTest {static class __CLR4_5_2pknpknlvha7g0j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,33557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hpkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hpkn(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33143);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33144);assertNotNull(new RandomStringUtils());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33145);final Constructor<?>[] cons = RandomStringUtils.class.getDeclaredConstructors();
        __CLR4_5_2pknpknlvha7g0j.R.inc(33146);assertEquals(1, cons.length);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33147);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33148);assertTrue(Modifier.isPublic(RandomStringUtils.class.getModifiers()));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33149);assertFalse(Modifier.isFinal(RandomStringUtils.class.getModifiers()));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Test the implementation
     */
    @Test
    public void testRandomStringUtils() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_222a85upku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomStringUtils",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_222a85upku(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33150);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33151);String r1 = RandomStringUtils.random(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33152);assertEquals("random(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33153);String r2 = RandomStringUtils.random(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33154);assertEquals("random(50) length", 50, r2.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33155);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33156);r1 = RandomStringUtils.randomAscii(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33157);assertEquals("randomAscii(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33158);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33159)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33160)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33161);assertTrue("char between 32 and 127", r1.charAt(i) >= 32 && r1.charAt(i) <= 127);
        }        
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33162);r2 = RandomStringUtils.randomAscii(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33163);assertTrue("!r1.equals(r2)", !r1.equals(r2));

        __CLR4_5_2pknpknlvha7g0j.R.inc(33164);r1 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33165);assertEquals("randomAlphabetic(50)", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33166);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33167)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33168)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33169);assertTrue("r1 contains alphabetic", Character.isLetter(r1.charAt(i)) && !Character.isDigit(r1.charAt(i)));
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33170);r2 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33171);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33172);r1 = RandomStringUtils.randomAlphanumeric(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33173);assertEquals("randomAlphanumeric(50)", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33174);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33175)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33176)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33177);assertTrue("r1 contains alphanumeric", Character.isLetterOrDigit(r1.charAt(i)));
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33178);r2 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33179);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33180);r1 = RandomStringUtils.randomGraph(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33181);assertEquals("randomGraph(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33182);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33183)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33184)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33185);assertTrue("char between 33 and 126", r1.charAt(i) >= 33 && r1.charAt(i) <= 126);
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33186);r2 = RandomStringUtils.randomGraph(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33187);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33188);r1 = RandomStringUtils.randomNumeric(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33189);assertEquals("randomNumeric(50)", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33190);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33191)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33192)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33193);assertTrue("r1 contains numeric", Character.isDigit(r1.charAt(i)) && !Character.isLetter(r1.charAt(i)));
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33194);r2 = RandomStringUtils.randomNumeric(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33195);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33196);r1 = RandomStringUtils.randomPrint(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33197);assertEquals("randomPrint(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33198);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33199)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33200)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33201);assertTrue("char between 32 and 126", r1.charAt(i) >= 32 && r1.charAt(i) <= 126);
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33202);r2 = RandomStringUtils.randomPrint(50);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33203);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33204);String set = "abcdefg";
        __CLR4_5_2pknpknlvha7g0j.R.inc(33205);r1 = RandomStringUtils.random(50, set);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33206);assertEquals("random(50, \"abcdefg\")", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33207);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33208)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33209)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33210);assertTrue("random char in set", set.indexOf(r1.charAt(i)) > -1);
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33211);r2 = RandomStringUtils.random(50, set);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33212);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33213);r1 = RandomStringUtils.random(50, (String) null);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33214);assertEquals("random(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33215);r2 = RandomStringUtils.random(50, (String) null);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33216);assertEquals("random(50) length", 50, r2.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33217);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33218);set = "stuvwxyz";
        __CLR4_5_2pknpknlvha7g0j.R.inc(33219);r1 = RandomStringUtils.random(50, set.toCharArray());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33220);assertEquals("random(50, \"stuvwxyz\")", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33221);for(int i = 0; (((i < r1.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33222)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33223)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33224);assertTrue("random char in set", set.indexOf(r1.charAt(i)) > -1);
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33225);r2 = RandomStringUtils.random(50, set);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33226);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33227);r1 = RandomStringUtils.random(50, (char[]) null);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33228);assertEquals("random(50) length", 50, r1.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33229);r2 = RandomStringUtils.random(50, (char[]) null);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33230);assertEquals("random(50) length", 50, r2.length());
        __CLR4_5_2pknpknlvha7g0j.R.inc(33231);assertTrue("!r1.equals(r2)", !r1.equals(r2));

        __CLR4_5_2pknpknlvha7g0j.R.inc(33232);final long seed = System.currentTimeMillis();
        __CLR4_5_2pknpknlvha7g0j.R.inc(33233);r1 = RandomStringUtils.random(50,0,0,true,true,null,new Random(seed));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33234);r2 = RandomStringUtils.random(50,0,0,true,true,null,new Random(seed));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33235);assertEquals("r1.equals(r2)", r1, r2);

        __CLR4_5_2pknpknlvha7g0j.R.inc(33236);r1 = RandomStringUtils.random(0);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33237);assertEquals("random(0).equals(\"\")", "", r1);
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testLANG805() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m2wqjopna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLANG805",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33238,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m2wqjopna(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33238);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33239);final long seed = System.currentTimeMillis();
        __CLR4_5_2pknpknlvha7g0j.R.inc(33240);assertEquals("aaa", RandomStringUtils.random(3,0,0,false,false,new char[]{'a'},new Random(seed)));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testLANG807() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skwo4mpnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLANG807",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skwo4mpnd(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33241);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33242);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33243);RandomStringUtils.random(3,5,5,false,false);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33244);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException ex) { // distinguish from Random#nextInt message
            __CLR4_5_2pknpknlvha7g0j.R.inc(33245);final String msg = ex.getMessage();
            __CLR4_5_2pknpknlvha7g0j.R.inc(33246);assertTrue("Message (" + msg + ") must contain 'start'", msg.contains("start"));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33247);assertTrue("Message (" + msg + ") must contain 'end'", msg.contains("end"));
        }
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testExceptions() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tx2tdvpnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testExceptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tx2tdvpnk(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33248);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33249);final char[] DUMMY = new char[]{'a'}; // valid char array
        __CLR4_5_2pknpknlvha7g0j.R.inc(33250);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33251);RandomStringUtils.random(-1);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33252);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33253);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33254);RandomStringUtils.random(-1, true, true);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33255);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33256);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33257);RandomStringUtils.random(-1, DUMMY);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33258);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33259);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33260);RandomStringUtils.random(1, new char[0]); // must not provide empty array => IAE
            __CLR4_5_2pknpknlvha7g0j.R.inc(33261);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33262);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33263);RandomStringUtils.random(-1, "");
            __CLR4_5_2pknpknlvha7g0j.R.inc(33264);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33265);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33266);RandomStringUtils.random(-1, (String)null);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33267);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33268);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33269);RandomStringUtils.random(-1, 'a', 'z', false, false);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33270);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33271);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33272);RandomStringUtils.random(-1, 'a', 'z', false, false, DUMMY);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33273);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33274);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33275);RandomStringUtils.random(-1, 'a', 'z', false, false, DUMMY, new Random());
            __CLR4_5_2pknpknlvha7g0j.R.inc(33276);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33277);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33278);RandomStringUtils.random(8, 32, 48, false, true);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33279);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2pknpknlvha7g0j.R.inc(33280);try {
            __CLR4_5_2pknpknlvha7g0j.R.inc(33281);RandomStringUtils.random(8, 32, 65, true, false);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33282);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /**
     * Make sure boundary alphanumeric characters are generated by randomAlphaNumeric
     * This test will fail randomly with probability = 6 * (61/62)**1000 ~ 5.2E-7
     */  
    @Test
    public void testRandomAlphaNumeric() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3n9atpoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphaNumeric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3n9atpoj(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33283);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33284);final char[] testChars = {'a', 'z', 'A', 'Z', '0', '9'};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33285);final boolean[] found = {false, false, false, false, false, false};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33286);for (int i = 0; (((i < 100)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33287)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33288)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33289);final String randString = RandomStringUtils.randomAlphanumeric(10);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33290);for (int j = 0; (((j < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33291)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33292)==0&false)); j++) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33293);if ((((randString.indexOf(testChars[j]) > 0)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33294)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33295)==0&false))) {{
                    __CLR4_5_2pknpknlvha7g0j.R.inc(33296);found[j] = true;
                }
            }}
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33297);for (int i = 0; (((i < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33298)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33299)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33300);if ((((!found[i])&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33301)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33302)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33303);fail("alphanumeric character not generated in 1000 attempts: " 
                   + testChars[i] +" -- repeated failures indicate a problem ");
            }
        }}
    }}finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /**
     * Make sure '0' and '9' are generated by randomNumeric
     * This test will fail randomly with probability = 2 * (9/10)**1000 ~ 3.5E-46
     */  
    @Test
    public void testRandomNumeric() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22jp47zpp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomNumeric",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22jp47zpp4(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33304);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33305);final char[] testChars = {'0','9'};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33306);final boolean[] found = {false, false};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33307);for (int i = 0; (((i < 100)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33308)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33309)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33310);final String randString = RandomStringUtils.randomNumeric(10);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33311);for (int j = 0; (((j < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33312)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33313)==0&false)); j++) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33314);if ((((randString.indexOf(testChars[j]) > 0)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33315)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33316)==0&false))) {{
                    __CLR4_5_2pknpknlvha7g0j.R.inc(33317);found[j] = true;
                }
            }}
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33318);for (int i = 0; (((i < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33319)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33320)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33321);if ((((!found[i])&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33322)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33323)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33324);fail("digit not generated in 1000 attempts: " 
                   + testChars[i] +" -- repeated failures indicate a problem ");
            }
        }}  
    }}finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /**
     * Make sure boundary alpha characters are generated by randomAlphabetic
     * This test will fail randomly with probability = 4 * (51/52)**1000 ~ 1.58E-8
     */  
    @Test
    public void testRandomAlphabetic() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cyhp3rppp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphabetic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cyhp3rppp(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33325);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33326);final char[] testChars = {'a', 'z', 'A', 'Z'};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33327);final boolean[] found = {false, false, false, false};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33328);for (int i = 0; (((i < 100)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33329)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33330)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33331);final String randString = RandomStringUtils.randomAlphabetic(10);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33332);for (int j = 0; (((j < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33333)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33334)==0&false)); j++) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33335);if ((((randString.indexOf(testChars[j]) > 0)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33336)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33337)==0&false))) {{
                    __CLR4_5_2pknpknlvha7g0j.R.inc(33338);found[j] = true;
                }
            }}
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33339);for (int i = 0; (((i < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33340)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33341)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33342);if ((((!found[i])&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33343)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33344)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33345);fail("alphanumeric character not generated in 1000 attempts: " 
                   + testChars[i] +" -- repeated failures indicate a problem ");
            }
        }}
    }}finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /**
     * Make sure 32 and 127 are generated by randomNumeric
     * This test will fail randomly with probability = 2*(95/96)**1000 ~ 5.7E-5
     */  
    @Test
    public void testRandomAscii() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lnkafxpqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAscii",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lnkafxpqa(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33346);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33347);final char[] testChars = {(char) 32, (char) 126};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33348);final boolean[] found = {false, false};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33349);for (int i = 0; (((i < 100)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33350)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33351)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33352);final String randString = RandomStringUtils.randomAscii(10);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33353);for (int j = 0; (((j < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33354)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33355)==0&false)); j++) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33356);if ((((randString.indexOf(testChars[j]) > 0)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33357)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33358)==0&false))) {{
                    __CLR4_5_2pknpknlvha7g0j.R.inc(33359);found[j] = true;
                }
            }}
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33360);for (int i = 0; (((i < testChars.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33361)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33362)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33363);if ((((!found[i])&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33364)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33365)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33366);fail("ascii character not generated in 1000 attempts: " 
                + (int) testChars[i] + 
                 " -- repeated failures indicate a problem");
            }
        }}  
    }}finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomAsciiRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_293km08pqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAsciiRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_293km08pqv(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33367);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33368);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33369);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33370);final String pattern = "^\\p{ASCII}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33371);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33372);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33373);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33374)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33375)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33376);final String s = RandomStringUtils.randomAscii(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33377);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33378);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33379);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33380)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33381)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33382);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33383);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33384)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33385)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33386);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33387);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33388);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomAlphabeticRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24x5o4eprh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphabeticRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24x5o4eprh(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33389);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33390);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33391);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33392);final String pattern = "^\\p{Alpha}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33393);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33394);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33395);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33396)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33397)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33398);final String s = RandomStringUtils.randomAlphabetic(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33399);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33400);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33401);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33402)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33403)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33404);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33405);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33406)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33407)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33408);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33409);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33410);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomAlphanumericRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmvwowps3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphanumericRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmvwowps3(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33411);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33412);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33413);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33414);final String pattern = "^\\p{Alnum}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33415);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33416);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33417);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33418)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33419)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33420);final String s = RandomStringUtils.randomAlphanumeric(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33421);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33422);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33423);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33424)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33425)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33426);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33427);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33428)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33429)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33430);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33431);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33432);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomGraphRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27w0jpxpsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomGraphRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27w0jpxpsp(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33433);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33434);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33435);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33436);final String pattern = "^\\p{Graph}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33437);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33438);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33439);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33440)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33441)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33442);final String s = RandomStringUtils.randomGraph(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33443);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33444);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33445);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33446)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33447)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33448);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33449);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33450)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33451)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33452);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33453);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33454);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomNumericRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lbbjx0ptb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomNumericRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lbbjx0ptb(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33455);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33456);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33457);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33458);final String pattern = "^\\p{Digit}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33459);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33460);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33461);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33462)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33463)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33464);final String s = RandomStringUtils.randomNumeric(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33465);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33466);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33467);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33468)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33469)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33470);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33471);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33472)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33473)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33474);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33475);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33476);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}

    @Test
    public void testRandomPrintRange() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m5vfucptx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomPrintRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m5vfucptx(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33477);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33478);final int expectedMinLengthInclusive = 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33479);final int expectedMaxLengthExclusive = 11;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33480);final String pattern = "^\\p{Print}{" + expectedMinLengthInclusive + ',' + expectedMaxLengthExclusive + "}$";

        __CLR4_5_2pknpknlvha7g0j.R.inc(33481);int maxCreatedLength = expectedMinLengthInclusive;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33482);int minCreatedLength = expectedMaxLengthExclusive - 1;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33483);for (int i = 0; (((i < 1000)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33484)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33485)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33486);final String s = RandomStringUtils.randomPrint(expectedMinLengthInclusive, expectedMaxLengthExclusive);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33487);assertThat("within range", s.length(), allOf(greaterThanOrEqualTo(expectedMinLengthInclusive), lessThanOrEqualTo(expectedMaxLengthExclusive - 1)));
            __CLR4_5_2pknpknlvha7g0j.R.inc(33488);assertTrue(s, s.matches(pattern));

            __CLR4_5_2pknpknlvha7g0j.R.inc(33489);if ((((s.length() < minCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33490)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33491)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33492);minCreatedLength = s.length();
            }

            }__CLR4_5_2pknpknlvha7g0j.R.inc(33493);if ((((s.length() > maxCreatedLength)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33494)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33495)==0&false))) {{
                __CLR4_5_2pknpknlvha7g0j.R.inc(33496);maxCreatedLength = s.length();
            }
        }}
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33497);assertThat("min generated, may fail randomly rarely", minCreatedLength, is(expectedMinLengthInclusive));
        __CLR4_5_2pknpknlvha7g0j.R.inc(33498);assertThat("max generated, may fail randomly rarely", maxCreatedLength, is(expectedMaxLengthExclusive - 1));
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /** 
     * Test homogeneity of random strings generated --
     * i.e., test that characters show up with expected frequencies
     * in generated strings.  Will fail randomly about 1 in 1000 times.
     * Repeated failures indicate a problem.
     */
    @Test
    public void testRandomStringUtilsHomog() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26bn9nqpuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomStringUtilsHomog",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26bn9nqpuj(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33499);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33500);final String set = "abc";
        __CLR4_5_2pknpknlvha7g0j.R.inc(33501);final char[] chars = set.toCharArray();
        __CLR4_5_2pknpknlvha7g0j.R.inc(33502);String gen = "";
        __CLR4_5_2pknpknlvha7g0j.R.inc(33503);final int[] counts = {0,0,0};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33504);final int[] expected = {200,200,200};
        __CLR4_5_2pknpknlvha7g0j.R.inc(33505);for (int i = 0; (((i< 100)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33506)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33507)==0&false)); i++) {{
           __CLR4_5_2pknpknlvha7g0j.R.inc(33508);gen = RandomStringUtils.random(6,chars);
           __CLR4_5_2pknpknlvha7g0j.R.inc(33509);for (int j = 0; (((j < 6)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33510)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33511)==0&false)); j++) {{
               boolean __CLB4_5_2_bool0=false;__CLR4_5_2pknpknlvha7g0j.R.inc(33512);switch (gen.charAt(j)) {
                   case 'a':if (!__CLB4_5_2_bool0) {__CLR4_5_2pknpknlvha7g0j.R.inc(33513);__CLB4_5_2_bool0=true;} {__CLR4_5_2pknpknlvha7g0j.R.inc(33514);counts[0]++; __CLR4_5_2pknpknlvha7g0j.R.inc(33515);break;}
                   case 'b':if (!__CLB4_5_2_bool0) {__CLR4_5_2pknpknlvha7g0j.R.inc(33516);__CLB4_5_2_bool0=true;} {__CLR4_5_2pknpknlvha7g0j.R.inc(33517);counts[1]++; __CLR4_5_2pknpknlvha7g0j.R.inc(33518);break;}
                   case 'c':if (!__CLB4_5_2_bool0) {__CLR4_5_2pknpknlvha7g0j.R.inc(33519);__CLB4_5_2_bool0=true;} {__CLR4_5_2pknpknlvha7g0j.R.inc(33520);counts[2]++; __CLR4_5_2pknpknlvha7g0j.R.inc(33521);break;}
                   default:if (!__CLB4_5_2_bool0) {__CLR4_5_2pknpknlvha7g0j.R.inc(33522);__CLB4_5_2_bool0=true;} {__CLR4_5_2pknpknlvha7g0j.R.inc(33523);fail("generated character not in set");}
               }
           }
        }} 
        // Perform chi-square test with df = 3-1 = 2, testing at .001 level
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33524);assertTrue("test homogeneity -- will fail about 1 in 1000 times",
            chiSquare(expected,counts) < 13.82);  
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    /**
     * Computes Chi-Square statistic given observed and expected counts
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     */
    private double chiSquare(final int[] expected, final int[] observed) {try{__CLR4_5_2pknpknlvha7g0j.R.inc(33525);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33526);double sumSq = 0.0d;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33527);double dev = 0.0d;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33528);for (int i = 0; (((i < observed.length)&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33529)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33530)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33531);dev = observed[i] - expected[i];
            __CLR4_5_2pknpknlvha7g0j.R.inc(33532);sumSq += dev * dev / expected[i];
        }
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33533);return sumSq;
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}           

    /**
     * Checks if the string got by {@link RandomStringUtils#random(int)}
     * can be converted to UTF-8 and back without loss.
     *
     * @see <a href="http://issues.apache.org/jira/browse/LANG-100">LANG-100</a>
     */
    @Test
    public void testLang100() {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xeircpvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLang100",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xeircpvi(){try{__CLR4_5_2pknpknlvha7g0j.R.inc(33534);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33535);final int size = 5000;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33536);final Charset charset = Charset.forName("UTF-8");
        __CLR4_5_2pknpknlvha7g0j.R.inc(33537);final String orig = RandomStringUtils.random(size);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33538);final byte[] bytes = orig.getBytes(charset);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33539);final String copy = new String(bytes, charset);

        // for a verbose compare:
        __CLR4_5_2pknpknlvha7g0j.R.inc(33540);for (int i=0; (((i < orig.length() && i < copy.length())&&(__CLR4_5_2pknpknlvha7g0j.R.iget(33541)!=0|true))||(__CLR4_5_2pknpknlvha7g0j.R.iget(33542)==0&false)); i++) {{
            __CLR4_5_2pknpknlvha7g0j.R.inc(33543);final char o = orig.charAt(i);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33544);final char c = copy.charAt(i);
            __CLR4_5_2pknpknlvha7g0j.R.inc(33545);assertEquals("differs at " + i + "(" + Integer.toHexString(new Character(o).hashCode()) + "," +
            Integer.toHexString(new Character(c).hashCode()) + ")", o, c);
        }
        // compare length also
        }__CLR4_5_2pknpknlvha7g0j.R.inc(33546);assertEquals(orig.length(), copy.length());
        // just to be complete
        __CLR4_5_2pknpknlvha7g0j.R.inc(33547);assertEquals(orig, copy);
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
    
    
    /**
     * Test for LANG-1286. Creates situation where old code would
     * overflow a char and result in a code point outside the specified
     * range.
     * 
     * @throws Exception
     */
    @Test
    public void testCharOverflow() throws Exception {__CLR4_5_2pknpknlvha7g0j.R.globalSliceStart(getClass().getName(),33548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2umqottpvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2pknpknlvha7g0j.R.rethrow($CLV_t2$);}finally{__CLR4_5_2pknpknlvha7g0j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testCharOverflow",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2umqottpvw() throws Exception{try{__CLR4_5_2pknpknlvha7g0j.R.inc(33548);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33549);int start = Character.MAX_VALUE;
        __CLR4_5_2pknpknlvha7g0j.R.inc(33550);int end = Integer.MAX_VALUE;
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33551);@SuppressWarnings("serial")
        Random fixedRandom = new Random() {
            @Override
            public int nextInt(int n) {try{__CLR4_5_2pknpknlvha7g0j.R.inc(33552);
                // Prevents selection of 'start' as the character
                __CLR4_5_2pknpknlvha7g0j.R.inc(33553);return super.nextInt(n - 1) + 1;
            }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
        };
        
        __CLR4_5_2pknpknlvha7g0j.R.inc(33554);String result = RandomStringUtils.random(2, start, end, false, false, null, fixedRandom);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33555);int c = result.codePointAt(0);
        __CLR4_5_2pknpknlvha7g0j.R.inc(33556);assertTrue(String.format("Character '%d' not in range [%d,%d).", c, start, end), c >= start && c < end);
    }finally{__CLR4_5_2pknpknlvha7g0j.R.flushNeeded();}}
}

