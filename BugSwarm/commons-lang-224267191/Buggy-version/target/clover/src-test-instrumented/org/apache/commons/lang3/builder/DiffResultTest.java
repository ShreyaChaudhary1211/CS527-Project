/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests {@link DiffResult}.
 */
public class DiffResultTest {static class __CLR4_5_2v5ov5olvha7gw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,40428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final SimpleClass SIMPLE_FALSE = new SimpleClass(false);
    private static final SimpleClass SIMPLE_TRUE = new SimpleClass(true);
    private static final ToStringStyle SHORT_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

    private static class SimpleClass implements Diffable<SimpleClass> {
        private final boolean booleanField;

        public SimpleClass(final boolean booleanField) {try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40380);
            __CLR4_5_2v5ov5olvha7gw6.R.inc(40381);this.booleanField = booleanField;
        }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

        public static String getFieldName() {try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40382);
            __CLR4_5_2v5ov5olvha7gw6.R.inc(40383);return "booleanField";
        }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

        @Override
        public DiffResult diff(final SimpleClass obj) {try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40384);
            __CLR4_5_2v5ov5olvha7gw6.R.inc(40385);return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append(getFieldName(), booleanField, obj.booleanField)
                    .build();
        }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}
    }

    private static class EmptyClass {
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testListIsNonModifiable() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkfgdav5u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,105,115,116,73,115,78,111,110,77,111,100,105,102,105,97,98,108,101,58,32,91,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testListIsNonModifiable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkfgdav5u(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40386);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40387);final SimpleClass lhs = new SimpleClass(true);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40388);final SimpleClass rhs = new SimpleClass(false);

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40389);final List<Diff<?>> diffs = lhs.diff(rhs).getDiffs();

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40390);final DiffResult list = new DiffResult(lhs, rhs, diffs, SHORT_STYLE);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40391);assertEquals(diffs, list.getDiffs());
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40392);assertEquals(1, list.getNumberOfDiffs());
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40393);list.getDiffs().remove(0);
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d9uicnv62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testIterator",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d9uicnv62(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40394);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40395);final SimpleClass lhs = new SimpleClass(true);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40396);final SimpleClass rhs = new SimpleClass(false);

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40397);final List<Diff<?>> diffs = lhs.diff(rhs).getDiffs();
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40398);final Iterator<Diff<?>> expectedIterator = diffs.iterator();

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40399);final DiffResult list = new DiffResult(lhs, rhs, diffs, SHORT_STYLE);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40400);final Iterator<Diff<?>> iterator = list.iterator();

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40401);while ((((iterator.hasNext())&&(__CLR4_5_2v5ov5olvha7gw6.R.iget(40402)!=0|true))||(__CLR4_5_2v5ov5olvha7gw6.R.iget(40403)==0&false))) {{
            __CLR4_5_2v5ov5olvha7gw6.R.inc(40404);assertTrue(expectedIterator.hasNext());
            __CLR4_5_2v5ov5olvha7gw6.R.inc(40405);assertEquals(expectedIterator.next(), iterator.next());
        }
    }}finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test
    public void testToStringOutput() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utrdpiv6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testToStringOutput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utrdpiv6e(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40406);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40407);final DiffResult list = new DiffBuilder(new EmptyClass(), new EmptyClass(),
                ToStringStyle.SHORT_PREFIX_STYLE).append("test", false, true)
                .build();
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40408);assertEquals(
                "DiffResultTest.EmptyClass[test=false] differs from DiffResultTest.EmptyClass[test=true]",
                list.toString());
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test
    public void testToStringSpecifyStyleOutput() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29esnaiv6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testToStringSpecifyStyleOutput",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29esnaiv6h(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40409);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40410);final DiffResult list = SIMPLE_FALSE.diff(SIMPLE_TRUE);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40411);assertTrue(list.getToStringStyle().equals(SHORT_STYLE));

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40412);final String lhsString = new ToStringBuilder(SIMPLE_FALSE,
                ToStringStyle.MULTI_LINE_STYLE).append(
                SimpleClass.getFieldName(), SIMPLE_FALSE.booleanField).build();

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40413);final String rhsString = new ToStringBuilder(SIMPLE_TRUE,
                ToStringStyle.MULTI_LINE_STYLE).append(
                SimpleClass.getFieldName(), SIMPLE_TRUE.booleanField).build();

        __CLR4_5_2v5ov5olvha7gw6.R.inc(40414);final String expectedOutput = String.format("%s differs from %s", lhsString,
                rhsString);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40415);assertEquals(expectedOutput,
                list.toString(ToStringStyle.MULTI_LINE_STYLE));
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNullLhs() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ggd8lv6o();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,76,104,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testNullLhs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ggd8lv6o(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40416);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40417);new DiffResult(null, SIMPLE_FALSE, SIMPLE_TRUE.diff(SIMPLE_FALSE)
                .getDiffs(), SHORT_STYLE);
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNullRhs() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bcnrxxv6q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,82,104,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testNullRhs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bcnrxxv6q(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40418);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40419);new DiffResult(SIMPLE_TRUE, null, SIMPLE_TRUE.diff(SIMPLE_FALSE)
                .getDiffs(), SHORT_STYLE);
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testNullList() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g76ifyv6s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,76,105,115,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testNullList",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g76ifyv6s(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40420);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40421);new DiffResult(SIMPLE_TRUE, SIMPLE_FALSE, null, SHORT_STYLE);
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test
    public void testNullStyle() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tmtdrv6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testNullStyle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tmtdrv6u(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40422);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40423);final DiffResult diffResult = new DiffResult(SIMPLE_TRUE, SIMPLE_FALSE, SIMPLE_TRUE
                .diff(SIMPLE_FALSE).getDiffs(), null);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40424);assertEquals(ToStringStyle.DEFAULT_STYLE, diffResult.getToStringStyle());
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}

    @Test
    public void testNoDifferencesString() {__CLR4_5_2v5ov5olvha7gw6.R.globalSliceStart(getClass().getName(),40425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u1imhxv6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v5ov5olvha7gw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v5ov5olvha7gw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DiffResultTest.testNoDifferencesString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u1imhxv6x(){try{__CLR4_5_2v5ov5olvha7gw6.R.inc(40425);
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40426);final DiffResult diffResult = new DiffBuilder(SIMPLE_TRUE, SIMPLE_TRUE,
                SHORT_STYLE).build();
        __CLR4_5_2v5ov5olvha7gw6.R.inc(40427);assertEquals(DiffResult.OBJECTS_SAME_STRING, diffResult.toString());
    }finally{__CLR4_5_2v5ov5olvha7gw6.R.flushNeeded();}}
}
