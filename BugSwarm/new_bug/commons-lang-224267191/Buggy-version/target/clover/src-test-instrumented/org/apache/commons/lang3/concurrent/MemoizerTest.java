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
package org.apache.commons.lang3.concurrent;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EasyMockRunner.class)
public class MemoizerTest {static class __CLR4_5_2yv1yv1lvha7hoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Mock
    private Computable<Integer, Integer> computable;

    @Test
    public void testOnlyCallComputableOnceIfDoesNotThrowException() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nustd4yv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testOnlyCallComputableOnceIfDoesNotThrowException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nustd4yv1() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45181);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45182);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45183);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45184);expect(computable.compute(input)).andReturn(input);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45185);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45186);assertEquals("Should call computable first time", input, memoizer.compute(input));
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45187);assertEquals("Should not call the computable the second time", input, memoizer.compute(input));
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}

    @Test(expected = IllegalStateException.class)
    public void testDefaultBehaviourNotToRecalculateExecutionExceptions() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27dqy9cyv8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,101,102,97,117,108,116,66,101,104,97,118,105,111,117,114,78,111,116,84,111,82,101,99,97,108,99,117,108,97,116,101,69,120,101,99,117,116,105,111,110,69,120,99,101,112,116,105,111,110,115,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testDefaultBehaviourNotToRecalculateExecutionExceptions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27dqy9cyv8() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45188);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45189);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45190);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45191);final InterruptedException interruptedException = new InterruptedException();
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45192);expect(computable.compute(input)).andThrow(interruptedException);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45193);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45194);try {
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45195);memoizer.compute(input);
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45196);fail("Expected Throwable to be thrown!");
        } catch (final Throwable expected) {
            // Should always be thrown the first time
        }

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45197);memoizer.compute(input);
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}

    @Test(expected = IllegalStateException.class)
    public void testDoesNotRecalculateWhenSetToFalse() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qbt9m6yvi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,111,101,115,78,111,116,82,101,99,97,108,99,117,108,97,116,101,87,104,101,110,83,101,116,84,111,70,97,108,115,101,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testDoesNotRecalculateWhenSetToFalse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qbt9m6yvi() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45198);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45199);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45200);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable, false);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45201);final InterruptedException interruptedException = new InterruptedException();
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45202);expect(computable.compute(input)).andThrow(interruptedException);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45203);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45204);try {
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45205);memoizer.compute(input);
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45206);fail("Expected Throwable to be thrown!");
        } catch (final Throwable expected) {
            // Should always be thrown the first time
        }

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45207);memoizer.compute(input);
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}

    @Test
    public void testDoesRecalculateWhenSetToTrue() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4sno0yvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testDoesRecalculateWhenSetToTrue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4sno0yvs() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45208);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45209);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45210);final Integer answer = 3;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45211);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable, true);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45212);final InterruptedException interruptedException = new InterruptedException();
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45213);expect(computable.compute(input)).andThrow(interruptedException).andReturn(answer);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45214);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45215);try {
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45216);memoizer.compute(input);
            __CLR4_5_2yv1yv1lvha7hoy.R.inc(45217);fail("Expected Throwable to be thrown!");
        } catch (final Throwable expected) {
            // Should always be thrown the first time
        }

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45218);assertEquals(answer, memoizer.compute(input));
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void testWhenComputableThrowsRuntimeException() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25l7zi7yw3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,104,101,110,67,111,109,112,117,116,97,98,108,101,84,104,114,111,119,115,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testWhenComputableThrowsRuntimeException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25l7zi7yw3() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45219);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45220);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45221);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45222);final RuntimeException runtimeException = new RuntimeException("Some runtime exception");
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45223);expect(computable.compute(input)).andThrow(runtimeException);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45224);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45225);memoizer.compute(input);
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}

    @Test(expected = Error.class)
    public void testWhenComputableThrowsError() throws Exception {__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceStart(getClass().getName(),45226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l85p76ywa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,104,101,110,67,111,109,112,117,116,97,98,108,101,84,104,114,111,119,115,69,114,114,111,114,58,32,91,69,114,114,111,114,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof Error){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yv1yv1lvha7hoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yv1yv1lvha7hoy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MemoizerTest.testWhenComputableThrowsError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l85p76ywa() throws Exception{try{__CLR4_5_2yv1yv1lvha7hoy.R.inc(45226);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45227);final Integer input = 1;
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45228);final Memoizer<Integer, Integer> memoizer = new Memoizer<>(computable);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45229);final Error error = new Error();
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45230);expect(computable.compute(input)).andThrow(error);
        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45231);replay(computable);

        __CLR4_5_2yv1yv1lvha7hoy.R.inc(45232);memoizer.compute(input);
    }finally{__CLR4_5_2yv1yv1lvha7hoy.R.flushNeeded();}}
}
