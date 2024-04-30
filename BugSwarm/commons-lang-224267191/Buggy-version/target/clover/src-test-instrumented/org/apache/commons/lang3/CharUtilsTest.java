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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharUtils}.
 */
public class CharUtilsTest {static class __CLR4_5_2nhknhklvha7fj9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,30688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Character CHARACTER_A = new Character('A');
    private static final Character CHARACTER_B = new Character('B');
    private static final char CHAR_COPY = '\u00a9';
    
    @Test
    public void testConstructor() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hnhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hnhk(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30440);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30441);assertNotNull(new CharUtils());
        __CLR4_5_2nhknhklvha7fj9.R.inc(30442);final Constructor<?>[] cons = CharUtils.class.getDeclaredConstructors();
        __CLR4_5_2nhknhklvha7fj9.R.inc(30443);assertEquals(1, cons.length);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30444);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30445);assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers()));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30446);assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers()));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @SuppressWarnings("deprecation") // intentional test of deprecated method
    @Test
    public void testToCharacterObject_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kllvpdnhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToCharacterObject_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kllvpdnhr(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30447);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30448);assertEquals(new Character('a'), CharUtils.toCharacterObject('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30449);assertSame(CharUtils.toCharacterObject('a'), CharUtils.toCharacterObject('a'));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30450);for (int i = 0; (((i < 128)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30451)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30452)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30453);final Character ch = CharUtils.toCharacterObject((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30454);final Character ch2 = CharUtils.toCharacterObject((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30455);assertSame(ch, ch2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30456);assertEquals(i, ch.charValue());
        }
        }__CLR4_5_2nhknhklvha7fj9.R.inc(30457);for (int i = 128; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30458)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30459)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30460);final Character ch = CharUtils.toCharacterObject((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30461);final Character ch2 = CharUtils.toCharacterObject((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30462);assertEquals(ch, ch2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30463);assertTrue(ch != ch2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30464);assertEquals(i, ch.charValue());
            __CLR4_5_2nhknhklvha7fj9.R.inc(30465);assertEquals(i, ch2.charValue());
        }
        }__CLR4_5_2nhknhklvha7fj9.R.inc(30466);assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject('a'));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToCharacterObject_String() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21xg43onib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToCharacterObject_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21xg43onib(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30467);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30468);assertEquals(null, CharUtils.toCharacterObject(null));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30469);assertEquals(null, CharUtils.toCharacterObject(""));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30470);assertEquals(new Character('a'), CharUtils.toCharacterObject("a"));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30471);assertEquals(new Character('a'), CharUtils.toCharacterObject("abc"));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30472);assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject("a"));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToChar_Character() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmj1n8nih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_Character",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmj1n8nih(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30473);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30474);assertEquals('A', CharUtils.toChar(CHARACTER_A));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30475);assertEquals('B', CharUtils.toChar(CHARACTER_B));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30476);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30477);CharUtils.toChar((Character) null);
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToChar_Character_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f4yfo1nim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_Character_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f4yfo1nim(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30478);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30479);assertEquals('A', CharUtils.toChar(CHARACTER_A, 'X'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30480);assertEquals('B', CharUtils.toChar(CHARACTER_B, 'X'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30481);assertEquals('X', CharUtils.toChar((Character) null, 'X'));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToChar_String() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qq3ylwniq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qq3ylwniq(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30482);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30483);assertEquals('A', CharUtils.toChar("A"));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30484);assertEquals('B', CharUtils.toChar("BA"));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30485);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30486);CharUtils.toChar((String) null);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2nhknhklvha7fj9.R.inc(30487);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30488);CharUtils.toChar("");
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToChar_String_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28yvmfjnix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_String_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28yvmfjnix(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30489);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30490);assertEquals('A', CharUtils.toChar("A", 'X'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30491);assertEquals('B', CharUtils.toChar("BA", 'X'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30492);assertEquals('X', CharUtils.toChar("", 'X'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30493);assertEquals('X', CharUtils.toChar((String) null, 'X'));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rp10tvnj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rp10tvnj2(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30494);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30495);assertEquals(0, CharUtils.toIntValue('0'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30496);assertEquals(1, CharUtils.toIntValue('1'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30497);assertEquals(2, CharUtils.toIntValue('2'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30498);assertEquals(3, CharUtils.toIntValue('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30499);assertEquals(4, CharUtils.toIntValue('4'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30500);assertEquals(5, CharUtils.toIntValue('5'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30501);assertEquals(6, CharUtils.toIntValue('6'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30502);assertEquals(7, CharUtils.toIntValue('7'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30503);assertEquals(8, CharUtils.toIntValue('8'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30504);assertEquals(9, CharUtils.toIntValue('9'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30505);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30506);CharUtils.toIntValue('a');
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_char_int() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29rji2rnjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_char_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29rji2rnjf(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30507);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30508);assertEquals(0, CharUtils.toIntValue('0', -1));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30509);assertEquals(3, CharUtils.toIntValue('3', -1));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30510);assertEquals(-1, CharUtils.toIntValue('a', -1));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_Character() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evzgjknjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_Character",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evzgjknjj(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30511);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30512);assertEquals(0, CharUtils.toIntValue(new Character('0')));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30513);assertEquals(3, CharUtils.toIntValue(new Character('3')));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30514);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30515);CharUtils.toIntValue(null);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_5_2nhknhklvha7fj9.R.inc(30516);try {
            __CLR4_5_2nhknhklvha7fj9.R.inc(30517);CharUtils.toIntValue(CHARACTER_A);
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_Character_int() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z0ivv4njq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_Character_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z0ivv4njq(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30518);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30519);assertEquals(0, CharUtils.toIntValue(new Character('0'), -1));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30520);assertEquals(3, CharUtils.toIntValue(new Character('3'), -1));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30521);assertEquals(-1, CharUtils.toIntValue(new Character('A'), -1));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30522);assertEquals(-1, CharUtils.toIntValue(null, -1));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToString_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sj7cjinjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToString_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sj7cjinjv(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30523);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30524);assertEquals("a", CharUtils.toString('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30525);assertSame(CharUtils.toString('a'), CharUtils.toString('a'));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30526);for (int i = 0; (((i < 128)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30527)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30528)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30529);final String str = CharUtils.toString((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30530);final String str2 = CharUtils.toString((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30531);assertSame(str, str2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30532);assertEquals(1, str.length());
            __CLR4_5_2nhknhklvha7fj9.R.inc(30533);assertEquals(i, str.charAt(0));
        }
        }__CLR4_5_2nhknhklvha7fj9.R.inc(30534);for (int i = 128; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30535)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30536)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30537);final String str = CharUtils.toString((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30538);final String str2 = CharUtils.toString((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30539);assertEquals(str, str2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30540);assertTrue(str != str2);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30541);assertEquals(1, str.length());
            __CLR4_5_2nhknhklvha7fj9.R.inc(30542);assertEquals(i, str.charAt(0));
            __CLR4_5_2nhknhklvha7fj9.R.inc(30543);assertEquals(1, str2.length());
            __CLR4_5_2nhknhklvha7fj9.R.inc(30544);assertEquals(i, str2.charAt(0));
        }
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToString_Character() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v0rxinnkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToString_Character",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v0rxinnkh(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30545);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30546);assertEquals(null, CharUtils.toString(null));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30547);assertEquals("A", CharUtils.toString(CHARACTER_A));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30548);assertSame(CharUtils.toString(CHARACTER_A), CharUtils.toString(CHARACTER_A));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToUnicodeEscaped_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22n3e7dnkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToUnicodeEscaped_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22n3e7dnkl(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30549);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30550);assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30551);assertEquals("\\u004c", CharUtils.unicodeEscaped('L'));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30552);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30553)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30554)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30555);final String str = CharUtils.unicodeEscaped((char) i);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30556);assertEquals(6, str.length());
            __CLR4_5_2nhknhklvha7fj9.R.inc(30557);final int val = Integer.parseInt(str.substring(2), 16);
            __CLR4_5_2nhknhklvha7fj9.R.inc(30558);assertEquals(i, val);
        }
        }__CLR4_5_2nhknhklvha7fj9.R.inc(30559);assertEquals("\\u0999", CharUtils.unicodeEscaped((char) 0x999));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30560);assertEquals("\\u1001", CharUtils.unicodeEscaped((char) 0x1001));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testToUnicodeEscaped_Character() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r2zkt8nkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToUnicodeEscaped_Character",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r2zkt8nkx(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30561);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30562);assertEquals(null, CharUtils.unicodeEscaped(null));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30563);assertEquals("\\u0041", CharUtils.unicodeEscaped(CHARACTER_A));
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAscii_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x0qwqvnl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAscii_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x0qwqvnl0(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30564);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30565);assertTrue(CharUtils.isAscii('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30566);assertTrue(CharUtils.isAscii('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30567);assertTrue(CharUtils.isAscii('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30568);assertTrue(CharUtils.isAscii('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30569);assertTrue(CharUtils.isAscii('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30570);assertFalse(CharUtils.isAscii(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30571);for (int i = 0; (((i < 128)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30572)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30573)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30574);if ((((i < 128)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30575)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30576)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30577);assertTrue(CharUtils.isAscii((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30578);assertFalse(CharUtils.isAscii((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiPrintable_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25qr9linlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiPrintable_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25qr9linlf(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30579);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30580);assertTrue(CharUtils.isAsciiPrintable('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30581);assertTrue(CharUtils.isAsciiPrintable('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30582);assertTrue(CharUtils.isAsciiPrintable('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30583);assertTrue(CharUtils.isAsciiPrintable('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30584);assertFalse(CharUtils.isAsciiPrintable('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30585);assertFalse(CharUtils.isAsciiPrintable(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30586);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30587)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30588)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30589);if ((((i >= 32 && i <= 126)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30590)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30591)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30592);assertTrue(CharUtils.isAsciiPrintable((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30593);assertFalse(CharUtils.isAsciiPrintable((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiControl_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m8dw18nlu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiControl_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m8dw18nlu(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30594);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30595);assertFalse(CharUtils.isAsciiControl('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30596);assertFalse(CharUtils.isAsciiControl('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30597);assertFalse(CharUtils.isAsciiControl('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30598);assertFalse(CharUtils.isAsciiControl('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30599);assertTrue(CharUtils.isAsciiControl('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30600);assertFalse(CharUtils.isAsciiControl(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30601);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30602)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30603)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30604);if ((((i < 32 || i == 127)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30605)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30606)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30607);assertTrue(CharUtils.isAsciiControl((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30608);assertFalse(CharUtils.isAsciiControl((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlpha_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ypcuwdnm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlpha_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ypcuwdnm9(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30609);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30610);assertTrue(CharUtils.isAsciiAlpha('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30611);assertTrue(CharUtils.isAsciiAlpha('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30612);assertFalse(CharUtils.isAsciiAlpha('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30613);assertFalse(CharUtils.isAsciiAlpha('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30614);assertFalse(CharUtils.isAsciiAlpha('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30615);assertFalse(CharUtils.isAsciiAlpha(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30616);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30617)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30618)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30619);if (((((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30620)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30621)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30622);assertTrue(CharUtils.isAsciiAlpha((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30623);assertFalse(CharUtils.isAsciiAlpha((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphaUpper_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2blkigznmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphaUpper_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2blkigznmo(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30624);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30625);assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30626);assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30627);assertFalse(CharUtils.isAsciiAlphaUpper('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30628);assertFalse(CharUtils.isAsciiAlphaUpper('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30629);assertFalse(CharUtils.isAsciiAlphaUpper('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30630);assertFalse(CharUtils.isAsciiAlphaUpper(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30631);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30632)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30633)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30634);if ((((i >= 'A' && i <= 'Z')&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30635)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30636)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30637);assertTrue(CharUtils.isAsciiAlphaUpper((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30638);assertFalse(CharUtils.isAsciiAlphaUpper((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphaLower_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_234oiosnn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphaLower_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_234oiosnn3(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30639);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30640);assertTrue(CharUtils.isAsciiAlphaLower('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30641);assertFalse(CharUtils.isAsciiAlphaLower('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30642);assertFalse(CharUtils.isAsciiAlphaLower('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30643);assertFalse(CharUtils.isAsciiAlphaLower('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30644);assertFalse(CharUtils.isAsciiAlphaLower('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30645);assertFalse(CharUtils.isAsciiAlphaLower(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30646);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30647)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30648)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30649);if ((((i >= 'a' && i <= 'z')&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30650)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30651)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30652);assertTrue(CharUtils.isAsciiAlphaLower((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30653);assertFalse(CharUtils.isAsciiAlphaLower((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiNumeric_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd48v8nni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiNumeric_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd48v8nni(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30654);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30655);assertFalse(CharUtils.isAsciiNumeric('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30656);assertFalse(CharUtils.isAsciiNumeric('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30657);assertTrue(CharUtils.isAsciiNumeric('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30658);assertFalse(CharUtils.isAsciiNumeric('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30659);assertFalse(CharUtils.isAsciiNumeric('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30660);assertFalse(CharUtils.isAsciiNumeric(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30661);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30662)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30663)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30664);if ((((i >= '0' && i <= '9')&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30665)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30666)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30667);assertTrue(CharUtils.isAsciiNumeric((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30668);assertFalse(CharUtils.isAsciiNumeric((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphanumeric_char() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21hdurcnnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphanumeric_char",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21hdurcnnx(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30669);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30670);assertTrue(CharUtils.isAsciiAlphanumeric('a'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30671);assertTrue(CharUtils.isAsciiAlphanumeric('A'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30672);assertTrue(CharUtils.isAsciiAlphanumeric('3'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30673);assertFalse(CharUtils.isAsciiAlphanumeric('-'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30674);assertFalse(CharUtils.isAsciiAlphanumeric('\n'));
        __CLR4_5_2nhknhklvha7fj9.R.inc(30675);assertFalse(CharUtils.isAsciiAlphanumeric(CHAR_COPY));
       
        __CLR4_5_2nhknhklvha7fj9.R.inc(30676);for (int i = 0; (((i < 196)&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30677)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30678)==0&false)); i++) {{
            __CLR4_5_2nhknhklvha7fj9.R.inc(30679);if (((((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z') || (i >= '0' && i <= '9'))&&(__CLR4_5_2nhknhklvha7fj9.R.iget(30680)!=0|true))||(__CLR4_5_2nhknhklvha7fj9.R.iget(30681)==0&false))) {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30682);assertTrue(CharUtils.isAsciiAlphanumeric((char) i));
            } }else {{
                __CLR4_5_2nhknhklvha7fj9.R.inc(30683);assertFalse(CharUtils.isAsciiAlphanumeric((char) i));
            }
        }}
    }}finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}

    @Test
    public void testCompare() {__CLR4_5_2nhknhklvha7fj9.R.globalSliceStart(getClass().getName(),30684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28o8au2noc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2nhknhklvha7fj9.R.rethrow($CLV_t2$);}finally{__CLR4_5_2nhknhklvha7fj9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testCompare",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),30684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28o8au2noc(){try{__CLR4_5_2nhknhklvha7fj9.R.inc(30684);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30685);assertTrue(CharUtils.compare('a', 'b') < 0);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30686);assertTrue(CharUtils.compare('c', 'c') == 0);
        __CLR4_5_2nhknhklvha7fj9.R.inc(30687);assertTrue(CharUtils.compare('c', 'a') > 0);
    }finally{__CLR4_5_2nhknhklvha7fj9.R.flushNeeded();}}
}
