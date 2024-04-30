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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assume.assumeFalse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.
 */
public class ToStringBuilderTest {static class __CLR4_5_2xtixtilvha7hlz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44324,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));

    /*
     * All tests should leave the registry empty. 
     */
    @After
    public void after(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43830);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43831);validateNullToStringStyleRegistry();
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testConstructorEx1() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqgldpxtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqgldpxtk(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43832);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43833);assertEquals("<null>", new ToStringBuilder(null).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testConstructorEx2() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzgk66xtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzgk66xtm(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43834);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43835);assertEquals("<null>", new ToStringBuilder(null, null).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(43836);new ToStringBuilder(this.base, null).toString();
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testConstructorEx3() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y8giynxtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y8giynxtp(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43837);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43838);assertEquals("<null>", new ToStringBuilder(null, null, null).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(43839);new ToStringBuilder(this.base, null, null).toString();
        __CLR4_5_2xtixtilvha7hlz.R.inc(43840);new ToStringBuilder(this.base, ToStringStyle.DEFAULT_STYLE, null).toString();
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testGetSetDefault() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2suvbbqxtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testGetSetDefault",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2suvbbqxtt(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43841);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43842);try {
            __CLR4_5_2xtixtilvha7hlz.R.inc(43843);ToStringBuilder.setDefaultStyle(ToStringStyle.NO_FIELD_NAMES_STYLE);
            __CLR4_5_2xtixtilvha7hlz.R.inc(43844);assertSame(ToStringStyle.NO_FIELD_NAMES_STYLE, ToStringBuilder.getDefaultStyle());
        } finally {
            // reset for other tests
            __CLR4_5_2xtixtilvha7hlz.R.inc(43845);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
        }
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testSetDefaultEx() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21bbi7pxty();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,68,101,102,97,117,108,116,69,120,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSetDefaultEx",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21bbi7pxty(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43846);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43847);ToStringBuilder.setDefaultStyle(null);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testBlank() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s7z6qxxu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s7z6qxxu0(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43848);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43849);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test wrapper for int primitive.
     */
    @Test
    public void testReflectionInteger() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c6vxrsxu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c6vxrsxu2(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43850);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43851);assertEquals(baseStr + "[value=5]", ToStringBuilder.reflectionToString(base));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test wrapper for char primitive.
     */
    @Test
    public void testReflectionCharacter() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qq5xcjxu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharacter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qq5xcjxu4(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43852);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43853);final Character c = new Character('A');
        __CLR4_5_2xtixtilvha7hlz.R.inc(43854);assertEquals(this.toBaseString(c) + "[value=A]", ToStringBuilder.reflectionToString(c));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test wrapper for char boolean.
     */
    @Test
    public void testReflectionBoolean() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ikqfwuxu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ikqfwuxu7(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43855);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43856);Boolean b;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43857);b = Boolean.TRUE;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43858);assertEquals(this.toBaseString(b) + "[value=true]", ToStringBuilder.reflectionToString(b));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43859);b = Boolean.FALSE;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43860);assertEquals(this.toBaseString(b) + "[value=false]", ToStringBuilder.reflectionToString(b));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Create the same toString() as Object.toString().
     * @param o the object to create the string for.
     * @return a String in the Object.toString format.
     */
    private String toBaseString(final Object o) {try{__CLR4_5_2xtixtilvha7hlz.R.inc(43861);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43862);return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    // Reflection Array tests

    //
    // Note on the following line of code repeated in the reflection array tests.
    //
    // assertReflectionArray("<null>", array);
    //
    // The expected value is not baseStr + "[<null>]" since array==null and is typed as Object.
    // The null array does not carry array type information.
    // If we added a primitive array type constructor and pile of associated methods,
    // then type declaring type information could be carried forward. IMHO, null is null.
    //
    // Gary Gregory - 2003-03-12 - ggregory@seagullsw.com
    //

    public void assertReflectionArray(final String expected, final Object actual) {try{__CLR4_5_2xtixtilvha7hlz.R.inc(43863);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43864);if ((((actual == null)&&(__CLR4_5_2xtixtilvha7hlz.R.iget(43865)!=0|true))||(__CLR4_5_2xtixtilvha7hlz.R.iget(43866)==0&false))) {{
            // Until ToStringBuilder supports null objects.
            __CLR4_5_2xtixtilvha7hlz.R.inc(43867);return;
        }
        }__CLR4_5_2xtixtilvha7hlz.R.inc(43868);assertEquals(expected, ToStringBuilder.reflectionToString(actual));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43869);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43870);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, true));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43871);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, false));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionObjectArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26bs9d0xuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26bs9d0xuo(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43872);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43873);Object[] array = new Object[] { null, base, new int[] { 3, 6 } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43874);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43875);assertEquals(baseString + "[{<null>,5,{3,6}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43876);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43877);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionLongArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q77wbdxuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q77wbdxuu(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43878);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43879);long[] array = new long[] { 1, 2, -3, 4 };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43880);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43881);assertEquals(baseString + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43882);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43883);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionIntArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wlscqaxv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wlscqaxv0(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43884);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43885);int[] array = new int[] { 1, 2, -3, 4 };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43886);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43887);assertEquals(baseString + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43888);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43889);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionShortArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24cb81rxv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24cb81rxv6(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43890);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43891);short[] array = new short[] { 1, 2, -3, 4 };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43892);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43893);assertEquals(baseString + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43894);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43895);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionyteArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s1me43xvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionyteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s1me43xvc(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43896);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43897);byte[] array = new byte[] { 1, 2, -3, 4 };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43898);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43899);assertEquals(baseString + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43900);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43901);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionCharArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o89bgtxvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o89bgtxvi(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43902);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43903);char[] array = new char[] { 'A', '2', '_', 'D' };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43904);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43905);assertEquals(baseString + "[{A,2,_,D}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43906);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43907);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionDoubleArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uobexexvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uobexexvo(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43908);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43909);double[] array = new double[] { 1.0, 2.9876, -3.00001, 4.3 };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43910);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43911);assertEquals(baseString + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43912);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43913);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionFloatArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn9j8hxvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn9j8hxvu(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43914);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43915);float[] array = new float[] { 1.0f, 2.9876f, -3.00001f, 4.3f };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43916);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43917);assertEquals(baseString + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43918);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43919);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionBooleanArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26o468lxw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26o468lxw0(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43920);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43921);boolean[] array = new boolean[] { true, false, false };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43922);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43923);assertEquals(baseString + "[{true,false,false}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43924);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43925);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    // Reflection Array Array tests

    @Test
    public void testReflectionFloatArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ochx6xw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ochx6xw6(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43926);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43927);float[][] array = new float[][] { { 1.0f, 2.29686f }, null, { Float.NaN } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43928);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43929);assertEquals(baseString + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43930);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43931);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}


    @Test
    public void testReflectionLongArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nye51cxwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nye51cxwc(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43932);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43933);long[][] array = new long[][] { { 1, 2 }, null, { 5 } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43934);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43935);assertEquals(baseString + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43936);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43937);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionIntArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kvt8jdxwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kvt8jdxwi(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43938);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43939);int[][] array = new int[][] { { 1, 2 }, null, { 5 } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43940);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43941);assertEquals(baseString + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43942);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43943);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionhortArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8icc3xwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionhortArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8icc3xwo(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43944);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43945);short[][] array = new short[][] { { 1, 2 }, null, { 5 } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43946);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43947);assertEquals(baseString + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43948);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43949);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionByteArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cqx1pwxwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionByteArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cqx1pwxwu(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43950);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43951);byte[][] array = new byte[][] { { 1, 2 }, null, { 5 } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43952);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43953);assertEquals(baseString + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43954);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43955);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionCharArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pu6eauxx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43956,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pu6eauxx0(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43956);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43957);char[][] array = new char[][] { { 'A', 'B' }, null, { 'p' } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43958);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43959);assertEquals(baseString + "[{{A,B},<null>,{p}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43960);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43961);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionDoubleArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24m69cbxx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24m69cbxx6(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43962);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43963);double[][] array = new double[][] { { 1.0, 2.29686 }, null, { Double.NaN } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43964);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43965);assertEquals(baseString + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43966);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43967);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionBooleanArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1qdaqxxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1qdaqxxc(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43968);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43969);boolean[][] array = new boolean[][] { { true, false }, null, { false } };
        __CLR4_5_2xtixtilvha7hlz.R.inc(43970);final String baseString = this.toBaseString(array);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43971);assertEquals(baseString + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43972);assertEquals(baseString + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43973);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(43974);assertReflectionArray("<null>", array);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    // Reflection hierarchy tests
    @Test
    public void testReflectionHierarchyArrayList() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hlhll2xxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchyArrayList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hlhll2xxj(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43975);
        // note, the test data depends on the internal representation of the ArrayList, which may differ between JDK versions and vendors
        // representation different for IBM JDK 1.6.0, LANG-727
        __CLR4_5_2xtixtilvha7hlz.R.inc(43976);assumeFalse("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43977);assumeFalse("Oracle Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".compareTo(SystemUtils.JAVA_SPECIFICATION_VERSION) < 0);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43978);final List<Object> list = new ArrayList<>();
        __CLR4_5_2xtixtilvha7hlz.R.inc(43979);final String baseString = this.toBaseString(list);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43980);final String expectedWithTransients = baseString + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
        __CLR4_5_2xtixtilvha7hlz.R.inc(43981);final String toStringWithTransients = ToStringBuilder.reflectionToString(list, null, true);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43982);if ((((!expectedWithTransients.equals(toStringWithTransients))&&(__CLR4_5_2xtixtilvha7hlz.R.iget(43983)!=0|true))||(__CLR4_5_2xtixtilvha7hlz.R.iget(43984)==0&false))) {{
            __CLR4_5_2xtixtilvha7hlz.R.inc(43985);assertEquals(expectedWithTransients, toStringWithTransients);
        }
        }__CLR4_5_2xtixtilvha7hlz.R.inc(43986);final String expectedWithoutTransients = baseString + "[size=0]";
        __CLR4_5_2xtixtilvha7hlz.R.inc(43987);final String toStringWithoutTransients = ToStringBuilder.reflectionToString(list, null, false);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43988);if ((((!expectedWithoutTransients.equals(toStringWithoutTransients))&&(__CLR4_5_2xtixtilvha7hlz.R.iget(43989)!=0|true))||(__CLR4_5_2xtixtilvha7hlz.R.iget(43990)==0&false))) {{
            __CLR4_5_2xtixtilvha7hlz.R.inc(43991);assertEquals(expectedWithoutTransients, toStringWithoutTransients);
        }
    }}finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionHierarchy() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),43992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlswgxxy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlswgxxy0(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(43992);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43993);final ReflectionTestFixtureA baseA = new ReflectionTestFixtureA();
        __CLR4_5_2xtixtilvha7hlz.R.inc(43994);String baseString = this.toBaseString(baseA);
        __CLR4_5_2xtixtilvha7hlz.R.inc(43995);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43996);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA, null));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43997);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43998);assertEquals(baseString + "[a=a,transientA=t]", ToStringBuilder.reflectionToString(baseA, null, true));
        __CLR4_5_2xtixtilvha7hlz.R.inc(43999);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, null));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44000);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, Object.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44001);assertEquals(baseString + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, ReflectionTestFixtureA.class));

        __CLR4_5_2xtixtilvha7hlz.R.inc(44002);final ReflectionTestFixtureB baseB = new ReflectionTestFixtureB();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44003);baseString = this.toBaseString(baseB);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44004);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44005);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44006);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44007);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44008);assertEquals(baseString + "[b=b,transientB=t,a=a,transientA=t]", ToStringBuilder.reflectionToString(baseB, null, true));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44009);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, null));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44010);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, Object.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44011);assertEquals(baseString + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureA.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44012);assertEquals(baseString + "[b=b]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureB.class));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    static class ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char a='a';
        @SuppressWarnings("unused")
        private transient char transientA='t';
    }

    static class ReflectionTestFixtureB extends ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char b='b';
        @SuppressWarnings("unused")
        private transient char transientB='t';
    }

    @Test
    public void testInnerClassReflection() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229odyexyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInnerClassReflection",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44013,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229odyexyl(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44013);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44014);final Outer outer = new Outer();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44015);assertEquals(toBaseString(outer) + "[inner=" + toBaseString(outer.inner) + "[]]", outer.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    static class Outer {
        Inner inner = new Inner();
        class Inner {
            @Override
            public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44016);
                __CLR4_5_2xtixtilvha7hlz.R.inc(44017);return ToStringBuilder.reflectionToString(this);
            }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
        }
        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44018);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44019);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    // Reflection cycle tests

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void testReflectionArrayCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aj3l4fxys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aj3l4fxys(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44020);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44021);final Object[] objects = new Object[1];
        __CLR4_5_2xtixtilvha7hlz.R.inc(44022);objects[0] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44023);assertEquals(
            this.toBaseString(objects) + "[{" + this.toBaseString(objects) + "}]",
            ToStringBuilder.reflectionToString(objects));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void testReflectionArrayCycleLevel2() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dti8xxyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycleLevel2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dti8xxyw(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44024);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44025);final Object[] objects = new Object[1];
        __CLR4_5_2xtixtilvha7hlz.R.inc(44026);final Object[] objectsLevel2 = new Object[1];
        __CLR4_5_2xtixtilvha7hlz.R.inc(44027);objects[0] = objectsLevel2;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44028);objectsLevel2[0] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44029);assertEquals(
            this.toBaseString(objects) + "[{{" + this.toBaseString(objects) + "}}]",
            ToStringBuilder.reflectionToString(objects));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44030);assertEquals(
            this.toBaseString(objectsLevel2) + "[{{" + this.toBaseString(objectsLevel2) + "}}]",
            ToStringBuilder.reflectionToString(objectsLevel2));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testReflectionArrayArrayCycle() throws Exception {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26cpqk0xz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayArrayCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26cpqk0xz3() throws Exception{try{__CLR4_5_2xtixtilvha7hlz.R.inc(44031);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44032);final Object[][] objects = new Object[2][2];
        __CLR4_5_2xtixtilvha7hlz.R.inc(44033);objects[0][0] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44034);objects[0][1] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44035);objects[1][0] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44036);objects[1][1] = objects;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44037);final String basicToString = this.toBaseString(objects);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44038);assertEquals(
            basicToString
                + "[{{"
                + basicToString
                + ","
                + basicToString
                + "},{"
                + basicToString
                + ","
                + basicToString
                + "}}]",
            ToStringBuilder.reflectionToString(objects));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44039);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44040);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44041);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44042);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class SimpleReflectionTestFixture {
        Object o;

        public SimpleReflectionTestFixture() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44043);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

        public SimpleReflectionTestFixture(final Object o) {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44044);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44045);this.o = o;
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44046);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44047);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    private static class SelfInstanceVarReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceVarReflectionTestFixture typeIsSelf;

        public SelfInstanceVarReflectionTestFixture() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44048);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44049);this.typeIsSelf = this;
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44050);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44051);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
      }

    private static class SelfInstanceTwoVarsReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceTwoVarsReflectionTestFixture typeIsSelf;
        private final String otherType = "The Other Type";

        public SelfInstanceTwoVarsReflectionTestFixture() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44052);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44053);this.typeIsSelf = this;
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

        public String getOtherType(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44054);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44055);return this.otherType;
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44056);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44057);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
      }


    /**
     * Test an Object pointing to itself, the simplest test.
     */
    @Test
    public void testSimpleReflectionObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28n0oldxzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28n0oldxzu(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44058);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44059);final SimpleReflectionTestFixture simple = new SimpleReflectionTestFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44060);simple.o = simple;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44061);assertEquals(this.toBaseString(simple) + "[o=" + this.toBaseString(simple) + "]", simple.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test a class that defines an ivar pointing to itself.
     */
    @Test
    public void testSelfInstanceVarReflectionObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uriy9bxzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceVarReflectionObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uriy9bxzy(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44062);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44063);final SelfInstanceVarReflectionTestFixture test = new SelfInstanceVarReflectionTestFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44064);assertEquals(this.toBaseString(test) + "[typeIsSelf=" + this.toBaseString(test) + "]", test.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test a class that defines an ivar pointing to itself.  This test was
     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.
     */
    @Test
    public void testSelfInstanceTwoVarsReflectionObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wyfi9uy01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceTwoVarsReflectionObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wyfi9uy01(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44065);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44066);final SelfInstanceTwoVarsReflectionTestFixture test = new SelfInstanceTwoVarsReflectionTestFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44067);assertEquals(this.toBaseString(test) + "[typeIsSelf=" + this.toBaseString(test) + ",otherType=" + test.getOtherType().toString() + "]", test.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}


    /**
     * Test Objects pointing to each other.
     */
    @Test
    public void testReflectionObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_247qrvzy04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_247qrvzy04(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44068);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44069);final ReflectionTestCycleA a = new ReflectionTestCycleA();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44070);final ReflectionTestCycleB b = new ReflectionTestCycleB();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44071);a.b = b;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44072);b.a = a;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44073);assertEquals(
            this.toBaseString(a) + "[b=" + this.toBaseString(b) + "[a=" + this.toBaseString(a) + "]]",
            a.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Test a nasty combination of arrays and Objects pointing to each other.
     * objects[0] -&gt; SimpleReflectionTestFixture[ o -&gt; objects ]
     */
    @Test
    public void testReflectionArrayAndObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hn0rrhy0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayAndObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hn0rrhy0a(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44074);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44075);final Object[] objects = new Object[1];
        __CLR4_5_2xtixtilvha7hlz.R.inc(44076);final SimpleReflectionTestFixture simple = new SimpleReflectionTestFixture(objects);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44077);objects[0] = simple;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44078);assertEquals(
            this.toBaseString(objects)
                + "[{"
                + this.toBaseString(simple)
                + "[o="
                + this.toBaseString(objects)
                + "]"
                + "}]",
            ToStringBuilder.reflectionToString(objects));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44079);assertEquals(
            this.toBaseString(simple)
                + "[o={"
                + this.toBaseString(simple)
                + "}]",
            ToStringBuilder.reflectionToString(simple));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    void validateNullToStringStyleRegistry() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44080);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44081);final Map<Object, Object> registry = ToStringStyle.getRegistry();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44082);assertNull("Expected null, actual: "+registry, registry);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    //  End: Reflection cycle tests

    @Test
    public void testAppendSuper() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cvyfiiy0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendSuper",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cvyfiiy0j(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44083);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44084);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44085);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());

        __CLR4_5_2xtixtilvha7hlz.R.inc(44086);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44087);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44088);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testAppendToString() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fa5fj5y0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fa5fj5y0p(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44089);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44090);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendToString("Integer@8888[]").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44091);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendToString("Integer@8888[<null>]").toString());

        __CLR4_5_2xtixtilvha7hlz.R.inc(44092);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendToString("Integer@8888[]").append("a", "hello").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44093);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendToString("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44094);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendToString(null).append("a", "hello").toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iogga0y0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iogga0y0v(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44095);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44096);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44097);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44098);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44099);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44100);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44101);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44102);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44103);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44104);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44105);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44106);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44107);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44108);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44109);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvdhb0y1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectBuild",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvdhb0y1a(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44110);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44111);final Integer i3 = Integer.valueOf(3);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44112);final Integer i4 = Integer.valueOf(4);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44113);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44114);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44115);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44116);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44117);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44118);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44119);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<>(), false).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44120);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<>(), true).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44121);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<>(), false).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44122);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<>(), true).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44123);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).build());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44124);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).build());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsq9mzy1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsq9mzy1p(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44125);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44126);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44127);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44128);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    @Test
    public void testInt() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28s3xd0y1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28s3xd0y1t(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44129);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44130);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44131);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44132);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3).append("b", 4).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2exs2r3y1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2exs2r3y1x(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44133);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44134);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append((short) 3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44135);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", (short) 3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44136);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", (short) 3).append("b", (short) 4).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2kz0vy21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testChar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2kz0vy21(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44137);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44138);assertEquals(baseStr + "[A]", new ToStringBuilder(base).append((char) 65).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44139);assertEquals(baseStr + "[a=A]", new ToStringBuilder(base).append("a", (char) 65).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44140);assertEquals(baseStr + "[a=A,b=B]", new ToStringBuilder(base).append("a", (char) 65).append("b", (char) 66).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22w26nzy25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22w26nzy25(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44141);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44142);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append((byte) 3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44143);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", (byte) 3).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44144);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", (byte) 3).append("b", (byte) 4).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testDouble() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hfze2y29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hfze2y29(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44145);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44146);assertEquals(baseStr + "[3.2]", new ToStringBuilder(base).append(3.2).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44147);assertEquals(baseStr + "[a=3.2]", new ToStringBuilder(base).append("a", 3.2).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44148);assertEquals(baseStr + "[a=3.2,b=4.3]", new ToStringBuilder(base).append("a", 3.2).append("b", 4.3).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tuf8q9y2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tuf8q9y2d(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44149);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44150);assertEquals(baseStr + "[3.2]", new ToStringBuilder(base).append((float) 3.2).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44151);assertEquals(baseStr + "[a=3.2]", new ToStringBuilder(base).append("a", (float) 3.2).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44152);assertEquals(baseStr + "[a=3.2,b=4.3]", new ToStringBuilder(base).append("a", (float) 3.2).append("b", (float) 4.3).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1y2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1y2h(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44153);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44154);assertEquals(baseStr + "[true]", new ToStringBuilder(base).append(true).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44155);assertEquals(baseStr + "[a=true]", new ToStringBuilder(base).append("a", true).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44156);assertEquals(baseStr + "[a=true,b=false]", new ToStringBuilder(base).append("a", true).append("b", false).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}


    @Test
    public void testObjectArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oi04a7y2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oi04a7y2l(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44157);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44158);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44159);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44160);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44161);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44162);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44163);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2if58i6y2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2if58i6y2s(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44164);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44165);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44166);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44167);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44168);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44169);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44170);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28w0so3y2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28w0so3y2z(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44171);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44172);int[] array = new int[] {1, 2, -3, 4};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44173);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44174);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44175);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44176);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44177);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqn45yy36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqn45yy36(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44178);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44179);short[] array = new short[] {1, 2, -3, 4};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44180);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44181);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44182);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44183);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44184);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mhe7kqy3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mhe7kqy3d(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44185);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44186);byte[] array = new byte[] {1, 2, -3, 4};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44187);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44188);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44189);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44190);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44191);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0bza0y3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0bza0y3k(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44192);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44193);char[] array = new char[] {'A', '2', '_', 'D'};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44194);assertEquals(baseStr + "[{A,2,_,D}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44195);assertEquals(baseStr + "[{A,2,_,D}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44196);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44197);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44198);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6ks4jy3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44199,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6ks4jy3r(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44199);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44200);double[] array = new double[] {1.0, 2.9876, -3.00001, 4.3};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44201);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44202);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44203);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44204);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44205);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2maw6iyy3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2maw6iyy3y(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44206);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44207);float[] array = new float[] {1.0f, 2.9876f, -3.00001f, 4.3f};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44208);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44209);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44210);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44211);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44212);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rzd0qy45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rzd0qy45(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44213);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44214);boolean[] array = new boolean[] {true, false, false};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44215);assertEquals(baseStr + "[{true,false,false}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44216);assertEquals(baseStr + "[{true,false,false}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44217);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44218);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44219);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xbpkgly4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xbpkgly4c(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44220);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44221);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44222);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44223);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44224);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44225);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44226);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testIntArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9w6pwy4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9w6pwy4j(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44227);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44228);int[][] array = new int[][] {{1, 2}, null, {5}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44229);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44230);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44231);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44232);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44233);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testShortArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zg7rgvy4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zg7rgvy4q(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44234);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44235);short[][] array = new short[][] {{1, 2}, null, {5}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44236);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44237);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44238);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44239);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44240);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testByteArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhxe73y4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhxe73y4x(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44241);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44242);byte[][] array = new byte[][] {{1, 2}, null, {5}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44243);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44244);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44245);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44246);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44247);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testCharArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vfxb73y54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vfxb73y54(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44248);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44249);char[][] array = new char[][] {{'A', 'B'}, null, {'p'}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44250);assertEquals(baseStr + "[{{A,B},<null>,{p}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44251);assertEquals(baseStr + "[{{A,B},<null>,{p}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44252);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44253);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44254);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testDoubleArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vh4xiy5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vh4xiy5b(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44255);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44256);double[][] array = new double[][] {{1.0, 2.29686}, null, {Double.NaN}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44257);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44258);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44259);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44260);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44261);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testFloatArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21qywvjy5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21qywvjy5i(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44262);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44263);float[][] array = new float[][] {{1.0f, 2.29686f}, null, {Float.NaN}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44264);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44265);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44266);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44267);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44268);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testBooleanArrayArray() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f2h80ty5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArrayArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f2h80ty5p(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44269);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44270);boolean[][] array = new boolean[][] {{true, false}, null, {false}};
        __CLR4_5_2xtixtilvha7hlz.R.inc(44271);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44272);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44273);array = null;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44274);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44275);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    @Test
    public void testObjectCycle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dyh318y5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectCycle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dyh318y5w(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44276);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44277);final ObjectCycle a = new ObjectCycle();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44278);final ObjectCycle b = new ObjectCycle();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44279);a.obj = b;
        __CLR4_5_2xtixtilvha7hlz.R.inc(44280);b.obj = a;

        __CLR4_5_2xtixtilvha7hlz.R.inc(44281);final String expected = toBaseString(a) + "[" + toBaseString(b) + "[" + toBaseString(a) + "]]";
        __CLR4_5_2xtixtilvha7hlz.R.inc(44282);assertEquals(expected, a.toString());
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    static class ObjectCycle {
        Object obj;

        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44283);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44284);return new ToStringBuilder(this).append(obj).toString();
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    @Test
    public void testSimpleReflectionStatics() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ud4737y65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionStatics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ud4737y65(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44285);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44286);final SimpleReflectionStaticFieldsFixture instance1 = new SimpleReflectionStaticFieldsFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44287);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44288);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, true, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44289);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44290);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    @Test
    public void testReflectionStatics() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ase6fly6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionStatics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44291,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ase6fly6b(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44291);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44292);final ReflectionStaticFieldsFixture instance1 = new ReflectionStaticFieldsFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44293);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, ReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44294);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,staticTransientString=staticTransientString,staticTransientInt=54321,instanceString=instanceString,instanceInt=67890,transientString=transientString,transientInt=98765]",
            ReflectionToStringBuilder.toString(instance1, null, true, true, ReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44295);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            this.toStringWithStatics(instance1, null, ReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44296);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            this.toStringWithStatics(instance1, null, ReflectionStaticFieldsFixture.class));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    @Test
    public void testInheritedReflectionStatics() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xfj72xy6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInheritedReflectionStatics",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xfj72xy6h(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44297);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44298);final InheritedReflectionStaticFieldsFixture instance1 = new InheritedReflectionStaticFieldsFixture();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44299);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, InheritedReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44300);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44301);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_5_2xtixtilvha7hlz.R.inc(44302);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to build a suitable
     * <code>toString</code> value which includes static fields.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run
     * under a security manager, if the permissions are not set up correctly.
     * It is also not as efficient as testing explicitly. </p>
     *
     * <p>Transient fields are not output.</p>
     *
     * <p>Superclass fields will be appended up to and including the specified superclass.
     * A null superclass is treated as <code>java.lang.Object</code>.</p>
     *
     * <p>If the style is <code>null</code>, the default
     * <code>ToStringStyle</code> is used.</p>
     *
     * @param <T> the type of the output object
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create,
     *  may be <code>null</code>
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException if the Object is <code>null</code>
     */
    public <T> String toStringWithStatics(final T object, final ToStringStyle style, final Class<? super T> reflectUpToClass) {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44303);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44304);return ReflectionToStringBuilder.toString(object, style, false, true, reflectUpToClass);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    @Test
    public void test_setUpToClass_valid() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jfw5hry6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_valid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jfw5hry6p(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44305);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44306);final Integer val = Integer.valueOf(5);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44307);final ReflectionToStringBuilder test = new ReflectionToStringBuilder(val);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44308);test.setUpToClass(Number.class);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44309);test.toString();
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    @Test(expected=IllegalArgumentException.class)
    public void test_setUpToClass_invalid() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c7i6ycy6u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,115,101,116,85,112,84,111,67,108,97,115,115,95,105,110,118,97,108,105,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_invalid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c7i6ycy6u(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44310);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44311);final Integer val = Integer.valueOf(5);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44312);final ReflectionToStringBuilder test = new ReflectionToStringBuilder(val);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44313);try {
            __CLR4_5_2xtixtilvha7hlz.R.inc(44314);test.setUpToClass(String.class);
        } finally {
            __CLR4_5_2xtixtilvha7hlz.R.inc(44315);test.toString();
        }
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    class ReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
        static final transient String staticTransientString = "staticTransientString";
        static final transient int staticTransientInt = 54321;
        String instanceString = "instanceString";
        int instanceInt = 67890;
        transient String transientString = "transientString";
        transient int transientInt = 98765;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class SimpleReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class InheritedReflectionStaticFieldsFixture extends SimpleReflectionStaticFieldsFixture {
        static final String staticString2 = "staticString2";
        static final int staticInt2 = 67890;
    }

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionNull() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22l3kgby70();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22l3kgby70(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44316);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44317);assertEquals("<null>", ReflectionToStringBuilder.toString(null));
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

    /**
     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.
     * See issue LANG-372.
     */
    class MultiLineTestObject {
        Integer i = Integer.valueOf(31337);
        @Override
        public String toString() {try{__CLR4_5_2xtixtilvha7hlz.R.inc(44318);
            __CLR4_5_2xtixtilvha7hlz.R.inc(44319);return new ToStringBuilder(this).append("testInt", i).toString();
        }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}
    }

    @Test
    public void testAppendToStringUsingMultiLineStyle() {__CLR4_5_2xtixtilvha7hlz.R.globalSliceStart(getClass().getName(),44320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pmlq21y74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xtixtilvha7hlz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xtixtilvha7hlz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToStringUsingMultiLineStyle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pmlq21y74(){try{__CLR4_5_2xtixtilvha7hlz.R.inc(44320);
        __CLR4_5_2xtixtilvha7hlz.R.inc(44321);final MultiLineTestObject obj = new MultiLineTestObject();
        __CLR4_5_2xtixtilvha7hlz.R.inc(44322);final ToStringBuilder testBuilder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                                          .appendToString(obj.toString());
        __CLR4_5_2xtixtilvha7hlz.R.inc(44323);assertEquals(testBuilder.toString().indexOf("testInt=31337"), -1);
    }finally{__CLR4_5_2xtixtilvha7hlz.R.flushNeeded();}}

}

