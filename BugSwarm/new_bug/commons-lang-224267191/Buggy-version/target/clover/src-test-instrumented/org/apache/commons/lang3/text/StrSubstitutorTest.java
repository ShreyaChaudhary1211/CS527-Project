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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for StrSubstitutor.
 */
@Deprecated
public class StrSubstitutorTest {static class __CLR4_5_215k615k6lvha7ijx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,54223,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_215k615k6lvha7ijx.R.inc(53862);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53863);values = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(53864);values.put("animal", "quick brown fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53865);values.put("target", "lazy dog");
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_5_215k615k6lvha7ijx.R.inc(53866);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53867);values = null;
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplaceSimple() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olg08515kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olg08515kc(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53868);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53869);doTestReplace("The quick brown fox jumps over the lazy dog.", "The ${animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplaceSolo() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yx4dm015ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSolo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yx4dm015ke(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53870);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53871);doTestReplace("quick brown fox", "${animal}", false);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests replace with no variables.
     */
    @Test
    public void testReplaceNoVariables() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bee4pn15kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoVariables",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bee4pn15kg(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53872);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53873);doTestNoReplace("The balloon arrived.");
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests replace with null.
     */
    @Test
    public void testReplaceNull() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bwevzk15ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bwevzk15ki(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53874);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53875);doTestNoReplace(null);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests replace with null.
     */
    @Test
    public void testReplaceEmpty() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jrkqky15kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmpty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jrkqky15kk(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53876);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53877);doTestNoReplace("");
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests key replace changing map after initialization (not recommended).
     */
    @Test
    public void testReplaceChangedMap() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lm6vm715km();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceChangedMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lm6vm715km(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53878);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53879);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53880);values.put("target", "moon");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53881);assertEquals("The quick brown fox jumps over the moon.", sub.replace("The ${animal} jumps over the ${target}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests unknown key replace.
     */
    @Test
    public void testReplaceUnknownKey() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r9oayq15kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceUnknownKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r9oayq15kq(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53882);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53883);doTestReplace("The ${person} jumps over the lazy dog.", "The ${person} jumps over the ${target}.", true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53884);doTestReplace("The ${person} jumps over the lazy dog. 1234567890.", "The ${person} jumps over the ${target}. ${undefined.number:-1234567890}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests adjacent keys.
     */
    @Test
    public void testReplaceAdjacentAtStart() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6potq15kt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtStart",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6potq15kt(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53885);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53886);values.put("code", "GBP");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53887);values.put("amount", "12.50");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53888);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53889);assertEquals("GBP12.50 charged", sub.replace("${code}${amount} charged"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests adjacent keys.
     */
    @Test
    public void testReplaceAdjacentAtEnd() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xlm3px15ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtEnd",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53890,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xlm3px15ky(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53890);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53891);values.put("code", "GBP");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53892);values.put("amount", "12.50");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53893);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53894);assertEquals("Amount is GBP12.50", sub.replace("Amount is ${code}${amount}"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests simple recursive replace.
     */
    @Test
    public void testReplaceRecursive() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufij8715l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceRecursive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufij8715l3(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53895);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53896);values.put("animal", "${critter}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53897);values.put("target", "${pet}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53898);values.put("pet", "${petCharacteristic} dog");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53899);values.put("petCharacteristic", "lazy");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53900);values.put("critter", "${critterSpeed} ${critterColor} ${critterType}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53901);values.put("critterSpeed", "quick");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53902);values.put("critterColor", "brown");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53903);values.put("critterType", "fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53904);doTestReplace("The quick brown fox jumps over the lazy dog.", "The ${animal} jumps over the ${target}.", true);

        __CLR4_5_215k615k6lvha7ijx.R.inc(53905);values.put("pet", "${petCharacteristicUnknown:-lazy} dog");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53906);doTestReplace("The quick brown fox jumps over the lazy dog.", "The ${animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests escaping.
     */
    @Test
    public void testReplaceEscaping() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wode5515lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEscaping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wode5515lf(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53907);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53908);doTestReplace("The ${animal} jumps over the lazy dog.", "The $${animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests escaping.
     */
    @Test
    public void testReplaceSoloEscaping() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245nmii15lh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSoloEscaping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245nmii15lh(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53909);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53910);doTestReplace("${animal}", "$${animal}", false);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests complex escaping.
     */
    @Test
    public void testReplaceComplexEscaping() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25esozx15lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceComplexEscaping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25esozx15lj(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53911);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53912);doTestReplace("The ${quick brown fox} jumps over the lazy dog.", "The $${${animal}} jumps over the ${target}.", true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53913);doTestReplace("The ${quick brown fox} jumps over the lazy dog. ${1234567890}.", "The $${${animal}} jumps over the ${target}. $${${undefined.number:-1234567890}}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests when no prefix or suffix.
     */
    @Test
    public void testReplaceNoPrefixNoSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ldpbm15lm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixNoSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ldpbm15lm(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53914);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53915);doTestReplace("The animal jumps over the lazy dog.", "The animal jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests when no incomplete prefix.
     */
    @Test
    public void testReplaceIncompletePrefix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrmnbb15lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceIncompletePrefix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrmnbb15lo(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53916);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53917);doTestReplace("The {animal} jumps over the lazy dog.", "The {animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests when prefix but no suffix.
     */
    @Test
    public void testReplacePrefixNoSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qo7z0315lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePrefixNoSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qo7z0315lq(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53918);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53919);doTestReplace("The ${animal jumps over the ${target} lazy dog.", "The ${animal jumps over the ${target} ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests when suffix but no prefix.
     */
    @Test
    public void testReplaceNoPrefixSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vq3jub15ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vq3jub15ls(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53920);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53921);doTestReplace("The animal} jumps over the lazy dog.", "The animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests when no variable name.
     */
    @Test
    public void testReplaceEmptyKeys() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kkhui15lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmptyKeys",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kkhui15lu(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53922);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53923);doTestReplace("The ${} jumps over the lazy dog.", "The ${} jumps over the ${target}.", true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53924);doTestReplace("The animal jumps over the lazy dog.", "The ${:-animal} jumps over the ${target}.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests replace creates output same as input.
     */
    @Test
    public void testReplaceToIdentical() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmtr4v15lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceToIdentical",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53925,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmtr4v15lx(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53925);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53926);values.put("animal", "$${${thing}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53927);values.put("thing", "animal");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53928);doTestReplace("The ${animal} jumps.", "The ${animal} jumps.", true);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests a cyclic replace operation.
     * The cycle should be detected and cause an exception to be thrown.
     */
    @Test
    public void testCyclicReplacement() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kg8xo215m1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testCyclicReplacement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kg8xo215m1(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53929);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53930);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(53931);map.put("animal", "${critter}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53932);map.put("target", "${pet}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53933);map.put("pet", "${petCharacteristic} dog");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53934);map.put("petCharacteristic", "lazy");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53935);map.put("critter", "${critterSpeed} ${critterColor} ${critterType}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53936);map.put("critterSpeed", "quick");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53937);map.put("critterColor", "brown");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53938);map.put("critterType", "${animal}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53939);StrSubstitutor sub = new StrSubstitutor(map);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53940);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(53941);sub.replace("The ${animal} jumps over the ${target}.");
            __CLR4_5_215k615k6lvha7ijx.R.inc(53942);fail("Cyclic replacement was not detected!");
        } catch (final IllegalStateException ex) {
            // expected
        }

        // also check even when default value is set.
        __CLR4_5_215k615k6lvha7ijx.R.inc(53943);map.put("critterType", "${animal:-fox}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53944);sub = new StrSubstitutor(map);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53945);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(53946);sub.replace("The ${animal} jumps over the ${target}.");
            __CLR4_5_215k615k6lvha7ijx.R.inc(53947);fail("Cyclic replacement was not detected!");
        } catch (final IllegalStateException ex) {
            // expected
        }
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests interpolation with weird boundary patterns.
     */
    @Test
    public void testReplaceWeirdPattens() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ai36rv15mk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceWeirdPattens",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ai36rv15mk(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53948);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53949);doTestNoReplace("");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53950);doTestNoReplace("${}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53951);doTestNoReplace("${ }");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53952);doTestNoReplace("${\t}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53953);doTestNoReplace("${\n}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53954);doTestNoReplace("${\b}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53955);doTestNoReplace("${");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53956);doTestNoReplace("$}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53957);doTestNoReplace("}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53958);doTestNoReplace("${}$");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53959);doTestNoReplace("${${");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53960);doTestNoReplace("${${}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53961);doTestNoReplace("${$${}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53962);doTestNoReplace("${$$${}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53963);doTestNoReplace("${$$${$}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53964);doTestNoReplace("${${}}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53965);doTestNoReplace("${${ }}");
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplacePartialString_noReplace() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p5frud15n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePartialString_noReplace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p5frud15n2(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53966);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53967);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(53968);assertEquals("${animal} jumps", sub.replace("The ${animal} jumps over the ${target}.", 4, 15));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests whether a variable can be replaced in a variable name.
     */
    @Test
    public void testReplaceInVariable() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24do93e15n5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24do93e15n5(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53969);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53970);values.put("animal.1", "fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53971);values.put("animal.2", "mouse");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53972);values.put("species", "2");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53973);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53974);sub.setEnableSubstitutionInVariables(true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53975);assertEquals(
                "Wrong result (1)",
                "The mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
        __CLR4_5_215k615k6lvha7ijx.R.inc(53976);values.put("species", "1");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53977);assertEquals(
                "Wrong result (2)",
                "The fox jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
        __CLR4_5_215k615k6lvha7ijx.R.inc(53978);assertEquals(
                "Wrong result (3)",
                "The fox jumps over the lazy dog.",
                sub.replace("The ${unknown.animal.${unknown.species:-1}:-fox} jumps over the ${unknown.target:-lazy dog}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests whether substitution in variable names is disabled per default.
     */
    @Test
    public void testReplaceInVariableDisabled() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21avorq15nf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableDisabled",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21avorq15nf(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53979);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53980);values.put("animal.1", "fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53981);values.put("animal.2", "mouse");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53982);values.put("species", "2");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53983);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53984);assertEquals(
                "Wrong result (1)",
                "The ${animal.${species}} jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
        __CLR4_5_215k615k6lvha7ijx.R.inc(53985);assertEquals(
                "Wrong result (2)",
                "The ${animal.${species:-1}} jumps over the lazy dog.",
                sub.replace("The ${animal.${species:-1}} jumps over the ${target}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests complex and recursive substitution in variable names.
     */
    @Test
    public void testReplaceInVariableRecursive() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29lao2215nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableRecursive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29lao2215nm(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53986);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53987);values.put("animal.2", "brown fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53988);values.put("animal.1", "white mouse");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53989);values.put("color", "white");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53990);values.put("species.white", "1");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53991);values.put("species.brown", "2");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53992);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53993);sub.setEnableSubstitutionInVariables(true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53994);assertEquals(
                "Wrong result (1)",
                "The white mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species.${color}}} jumps over the ${target}."));
        __CLR4_5_215k615k6lvha7ijx.R.inc(53995);assertEquals(
                "Wrong result (2)",
                "The brown fox jumps over the lazy dog.",
                sub.replace("The ${animal.${species.${unknownColor:-brown}}} jumps over the ${target}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    @Test
    public void testDefaultValueDelimiters() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),53996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qvyk0l15nw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testDefaultValueDelimiters",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qvyk0l15nw(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(53996);
        __CLR4_5_215k615k6lvha7ijx.R.inc(53997);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(53998);map.put("animal", "fox");
        __CLR4_5_215k615k6lvha7ijx.R.inc(53999);map.put("target", "dog");

        __CLR4_5_215k615k6lvha7ijx.R.inc(54000);StrSubstitutor sub = new StrSubstitutor(map, "${", "}", '$');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54001);assertEquals("The fox jumps over the lazy dog. 1234567890.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number:-1234567890}."));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54002);sub = new StrSubstitutor(map, "${", "}", '$', "?:");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54003);assertEquals("The fox jumps over the lazy dog. 1234567890.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number?:1234567890}."));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54004);sub = new StrSubstitutor(map, "${", "}", '$', "||");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54005);assertEquals("The fox jumps over the lazy dog. 1234567890.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number||1234567890}."));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54006);sub = new StrSubstitutor(map, "${", "}", '$', "!");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54007);assertEquals("The fox jumps over the lazy dog. 1234567890.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number!1234567890}."));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54008);sub = new StrSubstitutor(map, "${", "}", '$', "");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54009);sub.setValueDelimiterMatcher(null);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54010);assertEquals("The fox jumps over the lazy dog. ${undefined.number!1234567890}.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number!1234567890}."));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54011);sub = new StrSubstitutor(map, "${", "}", '$');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54012);sub.setValueDelimiterMatcher(null);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54013);assertEquals("The fox jumps over the lazy dog. ${undefined.number!1234567890}.",
                sub.replace("The ${animal} jumps over the lazy ${target}. ${undefined.number!1234567890}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests protected.
     */
    @Test
    public void testResolveVariable() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22lfyu515oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testResolveVariable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22lfyu515oe(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54014);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54015);final StrBuilder builder = new StrBuilder("Hi ${name}!");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54016);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54017);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54018);final StrSubstitutor sub = new StrSubstitutor(map) {
            @Override
            protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {try{__CLR4_5_215k615k6lvha7ijx.R.inc(54019);
                __CLR4_5_215k615k6lvha7ijx.R.inc(54020);assertEquals("name", variableName);
                __CLR4_5_215k615k6lvha7ijx.R.inc(54021);assertSame(builder, buf);
                __CLR4_5_215k615k6lvha7ijx.R.inc(54022);assertEquals(3, startPos);
                __CLR4_5_215k615k6lvha7ijx.R.inc(54023);assertEquals(10, endPos);
                __CLR4_5_215k615k6lvha7ijx.R.inc(54024);return "jakarta";
            }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}
        };
        __CLR4_5_215k615k6lvha7ijx.R.inc(54025);sub.replaceIn(builder);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54026);assertEquals("Hi jakarta!", builder.toString());
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorNoArgs() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r07ac315or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorNoArgs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r07ac315or(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54027);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54028);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54029);assertEquals("Hi ${name}", sub.replace("Hi ${name}"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorMapPrefixSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23zhzgi15ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapPrefixSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23zhzgi15ou(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54030);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54031);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54032);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54033);final StrSubstitutor sub = new StrSubstitutor(map, "<", ">");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54034);assertEquals("Hi < commons", sub.replace("Hi $< <name>"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorMapFull() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vfaw2215oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapFull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vfaw2215oz(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54035);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54036);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54037);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54038);StrSubstitutor sub = new StrSubstitutor(map, "<", ">", '!');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54039);assertEquals("Hi < commons", sub.replace("Hi !< <name>"));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54040);sub = new StrSubstitutor(map, "<", ">", '!', "||");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54041);assertEquals("Hi < commons", sub.replace("Hi !< <name2||commons>"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests get set.
     */
    @Test
    public void testGetSetEscape() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rljkyu15p6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetEscape",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rljkyu15p6(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54042);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54043);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54044);assertEquals('$', sub.getEscapeChar());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54045);sub.setEscapeChar('<');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54046);assertEquals('<', sub.getEscapeChar());
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests get set.
     */
    @Test
    public void testGetSetPrefix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nx65zr15pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetPrefix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nx65zr15pb(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54047);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54048);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54049);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54050);sub.setVariablePrefix('<');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54051);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.CharMatcher);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54052);sub.setVariablePrefix("<<");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54053);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54054);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(54055);sub.setVariablePrefix(null);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54056);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_5_215k615k6lvha7ijx.R.inc(54057);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54058);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54059);sub.setVariablePrefixMatcher(matcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54060);assertSame(matcher, sub.getVariablePrefixMatcher());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54061);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(54062);sub.setVariablePrefixMatcher(null);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54063);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_5_215k615k6lvha7ijx.R.inc(54064);assertSame(matcher, sub.getVariablePrefixMatcher());
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests get set.
     */
    @Test
    public void testGetSetSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxtrgq15pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxtrgq15pt(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54065);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54066);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54067);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54068);sub.setVariableSuffix('<');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54069);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.CharMatcher);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54070);sub.setVariableSuffix("<<");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54071);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54072);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(54073);sub.setVariableSuffix(null);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54074);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_5_215k615k6lvha7ijx.R.inc(54075);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54076);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54077);sub.setVariableSuffixMatcher(matcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54078);assertSame(matcher, sub.getVariableSuffixMatcher());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54079);try {
            __CLR4_5_215k615k6lvha7ijx.R.inc(54080);sub.setVariableSuffixMatcher(null);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54081);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_5_215k615k6lvha7ijx.R.inc(54082);assertSame(matcher, sub.getVariableSuffixMatcher());
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests get set.
     */
    @Test
    public void testGetSetValueDelimiter() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25dkspn15qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetValueDelimiter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25dkspn15qb(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54083);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54084);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54085);assertTrue(sub.getValueDelimiterMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54086);sub.setValueDelimiter(':');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54087);assertTrue(sub.getValueDelimiterMatcher() instanceof StrMatcher.CharMatcher);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54088);sub.setValueDelimiter("||");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54089);assertTrue(sub.getValueDelimiterMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54090);sub.setValueDelimiter(null);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54091);assertNull(sub.getValueDelimiterMatcher());

        __CLR4_5_215k615k6lvha7ijx.R.inc(54092);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54093);sub.setValueDelimiterMatcher(matcher);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54094);assertSame(matcher, sub.getValueDelimiterMatcher());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54095);sub.setValueDelimiterMatcher(null);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54096);assertNull(sub.getValueDelimiterMatcher());
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests static.
     */
    @Test
    public void testStaticReplace() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i8womz15qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplace",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i8womz15qp(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54097);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54098);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54099);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54100);assertEquals("Hi commons!", StrSubstitutor.replace("Hi ${name}!", map));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests static.
     */
    @Test
    public void testStaticReplacePrefixSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ph59fi15qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplacePrefixSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54101,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ph59fi15qt(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54101);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54102);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54103);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54104);assertEquals("Hi commons!", StrSubstitutor.replace("Hi <name>!", map, "<", ">"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Tests interpolation with system properties.
     */
    @Test
    public void testStaticReplaceSystemProperties() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zbhs2l15qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplaceSystemProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zbhs2l15qx(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54105);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54106);final StrBuilder buf = new StrBuilder();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54107);buf.append("Hi ").append(System.getProperty("user.name"));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54108);buf.append(", you are working with ");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54109);buf.append(System.getProperty("os.name"));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54110);buf.append(", your home directory is ");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54111);buf.append(System.getProperty("user.home")).append('.');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54112);assertEquals(buf.toString(), StrSubstitutor.replaceSystemProperties("Hi ${user.name}, you are "
            + "working with ${os.name}, your home "
            + "directory is ${user.home}."));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Test for LANG-1055: StrSubstitutor.replaceSystemProperties does not work consistently
     */
    @Test
    public void testLANG1055() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_278a2ai15r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testLANG1055",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_278a2ai15r5(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54113);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54114);System.setProperty("test_key",  "test_value");

        __CLR4_5_215k615k6lvha7ijx.R.inc(54115);final String expected = StrSubstitutor.replace("test_key=${test_key}", System.getProperties());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54116);final String actual = StrSubstitutor.replaceSystemProperties("test_key=${test_key}");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54117);assertEquals(expected, actual);
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    /**
     * Test the replace of a properties object
     */
    @Test
    public void testSubstituteDefaultProperties(){__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ce1o0h15ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testSubstituteDefaultProperties",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ce1o0h15ra(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54118);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54119);final String org = "${doesnotwork}";
        __CLR4_5_215k615k6lvha7ijx.R.inc(54120);System.setProperty("doesnotwork", "It works!");

        // create a new Properties object with the System.getProperties as default
        __CLR4_5_215k615k6lvha7ijx.R.inc(54121);final Properties props = new Properties(System.getProperties());

        __CLR4_5_215k615k6lvha7ijx.R.inc(54122);assertEquals("It works!", StrSubstitutor.replace(org, props));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    @Test
    public void testSamePrefixAndSuffix() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wduvad15rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testSamePrefixAndSuffix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wduvad15rf(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54123);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54124);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54125);map.put("greeting", "Hello");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54126);map.put(" there ", "XXX");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54127);map.put("name", "commons");
        __CLR4_5_215k615k6lvha7ijx.R.inc(54128);assertEquals("Hi commons!", StrSubstitutor.replace("Hi @name@!", map, "@", "@"));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54129);assertEquals("Hello there commons!", StrSubstitutor.replace("@greeting@ there @name@!", map, "@", "@"));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    @Test
    public void testSubstitutePreserveEscape() {__CLR4_5_215k615k6lvha7ijx.R.globalSliceStart(getClass().getName(),54130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fq6uio15rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215k615k6lvha7ijx.R.rethrow($CLV_t2$);}finally{__CLR4_5_215k615k6lvha7ijx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testSubstitutePreserveEscape",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54130,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fq6uio15rm(){try{__CLR4_5_215k615k6lvha7ijx.R.inc(54130);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54131);final String org = "${not-escaped} $${escaped}";
        __CLR4_5_215k615k6lvha7ijx.R.inc(54132);final Map<String, String> map = new HashMap<>();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54133);map.put("not-escaped", "value");

        __CLR4_5_215k615k6lvha7ijx.R.inc(54134);final StrSubstitutor sub = new StrSubstitutor(map, "${", "}", '$');
        __CLR4_5_215k615k6lvha7ijx.R.inc(54135);assertFalse(sub.isPreserveEscapes());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54136);assertEquals("value ${escaped}", sub.replace(org));

        __CLR4_5_215k615k6lvha7ijx.R.inc(54137);sub.setPreserveEscapes(true);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54138);assertTrue(sub.isPreserveEscapes());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54139);assertEquals("value $${escaped}", sub.replace(org));
    }finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void doTestReplace(final String expectedResult, final String replaceTemplate, final boolean substring) {try{__CLR4_5_215k615k6lvha7ijx.R.inc(54140);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54141);final String expectedShortResult = expectedResult.substring(1, expectedResult.length() - 1);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54142);final StrSubstitutor sub = new StrSubstitutor(values);

        // replace using String
        __CLR4_5_215k615k6lvha7ijx.R.inc(54143);assertEquals(expectedResult, sub.replace(replaceTemplate));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54144);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54145)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54146)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54147);assertEquals(expectedShortResult, sub.replace(replaceTemplate, 1, replaceTemplate.length() - 2));
        }

        // replace using char[]
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54148);final char[] chars = replaceTemplate.toCharArray();
        __CLR4_5_215k615k6lvha7ijx.R.inc(54149);assertEquals(expectedResult, sub.replace(chars));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54150);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54151)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54152)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54153);assertEquals(expectedShortResult, sub.replace(chars, 1, chars.length - 2));
        }

        // replace using StringBuffer
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54154);StringBuffer buf = new StringBuffer(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54155);assertEquals(expectedResult, sub.replace(buf));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54156);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54157)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54158)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54159);assertEquals(expectedShortResult, sub.replace(buf, 1, buf.length() - 2));
        }

        // replace using StringBuilder
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54160);StringBuilder builder = new StringBuilder(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54161);assertEquals(expectedResult, sub.replace(builder));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54162);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54163)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54164)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54165);assertEquals(expectedShortResult, sub.replace(builder, 1, builder.length() - 2));
        }

        // replace using StrBuilder
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54166);StrBuilder bld = new StrBuilder(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54167);assertEquals(expectedResult, sub.replace(bld));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54168);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54169)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54170)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54171);assertEquals(expectedShortResult, sub.replace(bld, 1, bld.length() - 2));
        }

        // replace using object
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54172);final MutableObject<String> obj = new MutableObject<>(replaceTemplate);  // toString returns template
        __CLR4_5_215k615k6lvha7ijx.R.inc(54173);assertEquals(expectedResult, sub.replace(obj));

        // replace in StringBuffer
        __CLR4_5_215k615k6lvha7ijx.R.inc(54174);buf = new StringBuffer(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54175);assertTrue(sub.replaceIn(buf));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54176);assertEquals(expectedResult, buf.toString());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54177);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54178)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54179)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54180);buf = new StringBuffer(replaceTemplate);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54181);assertTrue(sub.replaceIn(buf, 1, buf.length() - 2));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54182);assertEquals(expectedResult, buf.toString());  // expect full result as remainder is untouched
        }

        // replace in StringBuilder
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54183);builder = new StringBuilder(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54184);assertTrue(sub.replaceIn(builder));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54185);assertEquals(expectedResult, builder.toString());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54186);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54187)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54188)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54189);builder = new StringBuilder(replaceTemplate);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54190);assertTrue(sub.replaceIn(builder, 1, builder.length() - 2));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54191);assertEquals(expectedResult, builder.toString());  // expect full result as remainder is untouched
        }

        // replace in StrBuilder
        }__CLR4_5_215k615k6lvha7ijx.R.inc(54192);bld = new StrBuilder(replaceTemplate);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54193);assertTrue(sub.replaceIn(bld));
        __CLR4_5_215k615k6lvha7ijx.R.inc(54194);assertEquals(expectedResult, bld.toString());
        __CLR4_5_215k615k6lvha7ijx.R.inc(54195);if ((((substring)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54196)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54197)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54198);bld = new StrBuilder(replaceTemplate);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54199);assertTrue(sub.replaceIn(bld, 1, bld.length() - 2));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54200);assertEquals(expectedResult, bld.toString());  // expect full result as remainder is untouched
        }
    }}finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

    private void doTestNoReplace(final String replaceTemplate) {try{__CLR4_5_215k615k6lvha7ijx.R.inc(54201);
        __CLR4_5_215k615k6lvha7ijx.R.inc(54202);final StrSubstitutor sub = new StrSubstitutor(values);

        __CLR4_5_215k615k6lvha7ijx.R.inc(54203);if ((((replaceTemplate == null)&&(__CLR4_5_215k615k6lvha7ijx.R.iget(54204)!=0|true))||(__CLR4_5_215k615k6lvha7ijx.R.iget(54205)==0&false))) {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54206);assertEquals(null, sub.replace((String) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54207);assertEquals(null, sub.replace((String) null, 0, 100));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54208);assertEquals(null, sub.replace((char[]) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54209);assertEquals(null, sub.replace((char[]) null, 0, 100));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54210);assertEquals(null, sub.replace((StringBuffer) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54211);assertEquals(null, sub.replace((StringBuffer) null, 0, 100));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54212);assertEquals(null, sub.replace((StrBuilder) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54213);assertEquals(null, sub.replace((StrBuilder) null, 0, 100));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54214);assertEquals(null, sub.replace((Object) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54215);assertFalse(sub.replaceIn((StringBuffer) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54216);assertFalse(sub.replaceIn((StringBuffer) null, 0, 100));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54217);assertFalse(sub.replaceIn((StrBuilder) null));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54218);assertFalse(sub.replaceIn((StrBuilder) null, 0, 100));
        } }else {{
            __CLR4_5_215k615k6lvha7ijx.R.inc(54219);assertEquals(replaceTemplate, sub.replace(replaceTemplate));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54220);final StrBuilder bld = new StrBuilder(replaceTemplate);
            __CLR4_5_215k615k6lvha7ijx.R.inc(54221);assertFalse(sub.replaceIn(bld));
            __CLR4_5_215k615k6lvha7ijx.R.inc(54222);assertEquals(replaceTemplate, bld.toString());
        }
    }}finally{__CLR4_5_215k615k6lvha7ijx.R.flushNeeded();}}

}
