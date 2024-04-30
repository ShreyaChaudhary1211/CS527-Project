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
package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * TestCase for StopWatch.
 */
public class StopWatchTest  {static class __CLR4_5_218sz18szlvha7iya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,58224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testStopWatchSimple(){__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29307uc18sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSimple",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29307uc18sz(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58067);
        __CLR4_5_218sz18szlvha7iya.R.inc(58068);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58069);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58070);try {__CLR4_5_218sz18szlvha7iya.R.inc(58071);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58072);watch.stop();
        __CLR4_5_218sz18szlvha7iya.R.inc(58073);final long time = watch.getTime();
        __CLR4_5_218sz18szlvha7iya.R.inc(58074);assertEquals(time, watch.getTime());
        
        __CLR4_5_218sz18szlvha7iya.R.inc(58075);assertTrue(time >= 500);
        __CLR4_5_218sz18szlvha7iya.R.inc(58076);assertTrue(time < 700);
        
        __CLR4_5_218sz18szlvha7iya.R.inc(58077);watch.reset();
        __CLR4_5_218sz18szlvha7iya.R.inc(58078);assertEquals(0, watch.getTime());
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testStopWatchStatic() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29nvrhs18tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchStatic",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29nvrhs18tb(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58079);
        __CLR4_5_218sz18szlvha7iya.R.inc(58080);final StopWatch watch = StopWatch.createStarted();
        __CLR4_5_218sz18szlvha7iya.R.inc(58081);assertTrue(watch.isStarted());
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}
    
    @Test
    public void testStopWatchSimpleGet(){__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qb657418te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSimpleGet",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qb657418te(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58082);
        __CLR4_5_218sz18szlvha7iya.R.inc(58083);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58084);assertEquals(0, watch.getTime());
        __CLR4_5_218sz18szlvha7iya.R.inc(58085);assertEquals("00:00:00.000", watch.toString());
        
        __CLR4_5_218sz18szlvha7iya.R.inc(58086);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58087);try {__CLR4_5_218sz18szlvha7iya.R.inc(58088);Thread.sleep(500);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58089);assertTrue(watch.getTime() < 2000);
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testStopWatchGetWithTimeUnit() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26ys3af18tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchGetWithTimeUnit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26ys3af18tm(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58090);
        // Create a mock StopWatch with a time of 2:59:01.999
        __CLR4_5_218sz18szlvha7iya.R.inc(58091);final StopWatch watch = createMockStopWatch(
                TimeUnit.HOURS.toNanos(2)
              + TimeUnit.MINUTES.toNanos(59)
              + TimeUnit.SECONDS.toNanos(1)
              + TimeUnit.MILLISECONDS.toNanos(999));

        __CLR4_5_218sz18szlvha7iya.R.inc(58092);assertEquals(2L, watch.getTime(TimeUnit.HOURS));
        __CLR4_5_218sz18szlvha7iya.R.inc(58093);assertEquals(179L, watch.getTime(TimeUnit.MINUTES));
        __CLR4_5_218sz18szlvha7iya.R.inc(58094);assertEquals(10741L, watch.getTime(TimeUnit.SECONDS));
        __CLR4_5_218sz18szlvha7iya.R.inc(58095);assertEquals(10741999L, watch.getTime(TimeUnit.MILLISECONDS));
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testStopWatchSplit(){__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aart4q18ts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSplit",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aart4q18ts(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58096);
        __CLR4_5_218sz18szlvha7iya.R.inc(58097);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58098);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58099);try {__CLR4_5_218sz18szlvha7iya.R.inc(58100);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58101);watch.split();
        __CLR4_5_218sz18szlvha7iya.R.inc(58102);final long splitTime = watch.getSplitTime();
        __CLR4_5_218sz18szlvha7iya.R.inc(58103);final String splitStr = watch.toSplitString();
            __CLR4_5_218sz18szlvha7iya.R.inc(58104);try {__CLR4_5_218sz18szlvha7iya.R.inc(58105);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58106);watch.unsplit();
            __CLR4_5_218sz18szlvha7iya.R.inc(58107);try {__CLR4_5_218sz18szlvha7iya.R.inc(58108);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58109);watch.stop();
        __CLR4_5_218sz18szlvha7iya.R.inc(58110);final long totalTime = watch.getTime();

        __CLR4_5_218sz18szlvha7iya.R.inc(58111);assertEquals("Formatted split string not the correct length", 
                     splitStr.length(), 12);
        __CLR4_5_218sz18szlvha7iya.R.inc(58112);assertTrue(splitTime >= 500);
        __CLR4_5_218sz18szlvha7iya.R.inc(58113);assertTrue(splitTime < 700);
        __CLR4_5_218sz18szlvha7iya.R.inc(58114);assertTrue(totalTime >= 1500);
        __CLR4_5_218sz18szlvha7iya.R.inc(58115);assertTrue(totalTime < 1900);
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}
    
    @Test
    public void testStopWatchSuspend(){__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n1sciw18uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSuspend",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n1sciw18uc(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58116);
        __CLR4_5_218sz18szlvha7iya.R.inc(58117);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58118);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58119);try {__CLR4_5_218sz18szlvha7iya.R.inc(58120);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58121);watch.suspend();
        __CLR4_5_218sz18szlvha7iya.R.inc(58122);final long suspendTime = watch.getTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58123);try {__CLR4_5_218sz18szlvha7iya.R.inc(58124);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58125);watch.resume();
            __CLR4_5_218sz18szlvha7iya.R.inc(58126);try {__CLR4_5_218sz18szlvha7iya.R.inc(58127);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58128);watch.stop();
        __CLR4_5_218sz18szlvha7iya.R.inc(58129);final long totalTime = watch.getTime();
        
        __CLR4_5_218sz18szlvha7iya.R.inc(58130);assertTrue(suspendTime >= 500);
        __CLR4_5_218sz18szlvha7iya.R.inc(58131);assertTrue(suspendTime < 700);
        __CLR4_5_218sz18szlvha7iya.R.inc(58132);assertTrue(totalTime >= 1000);
        __CLR4_5_218sz18szlvha7iya.R.inc(58133);assertTrue(totalTime < 1300);
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testLang315() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sek6g218uu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testLang315",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sek6g218uu(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58134);
        __CLR4_5_218sz18szlvha7iya.R.inc(58135);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58136);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58137);try {__CLR4_5_218sz18szlvha7iya.R.inc(58138);Thread.sleep(200);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58139);watch.suspend();
        __CLR4_5_218sz18szlvha7iya.R.inc(58140);final long suspendTime = watch.getTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58141);try {__CLR4_5_218sz18szlvha7iya.R.inc(58142);Thread.sleep(200);} catch (final InterruptedException ex) {}
        __CLR4_5_218sz18szlvha7iya.R.inc(58143);watch.stop();
        __CLR4_5_218sz18szlvha7iya.R.inc(58144);final long totalTime = watch.getTime();
        __CLR4_5_218sz18szlvha7iya.R.inc(58145);assertTrue( suspendTime == totalTime );
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    // test bad states
    @Test
    public void testBadStates() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6e6p018v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testBadStates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6e6p018v6(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58146);
        __CLR4_5_218sz18szlvha7iya.R.inc(58147);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58148);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58149);watch.stop();
            __CLR4_5_218sz18szlvha7iya.R.inc(58150);fail("Calling stop on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58151);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58152);watch.stop();
            __CLR4_5_218sz18szlvha7iya.R.inc(58153);fail("Calling stop on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58154);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58155);watch.suspend();
            __CLR4_5_218sz18szlvha7iya.R.inc(58156);fail("Calling suspend on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58157);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58158);watch.split();
            __CLR4_5_218sz18szlvha7iya.R.inc(58159);fail("Calling split on a non-running StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58160);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58161);watch.unsplit();
            __CLR4_5_218sz18szlvha7iya.R.inc(58162);fail("Calling unsplit on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58163);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58164);watch.resume();
            __CLR4_5_218sz18szlvha7iya.R.inc(58165);fail("Calling resume on an unsuspended StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58166);watch.start();

        __CLR4_5_218sz18szlvha7iya.R.inc(58167);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58168);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58169);fail("Calling start on a started StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58170);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58171);watch.unsplit();
            __CLR4_5_218sz18szlvha7iya.R.inc(58172);fail("Calling unsplit on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58173);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58174);watch.getSplitTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58175);fail("Calling getSplitTime on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58176);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58177);watch.resume();
            __CLR4_5_218sz18szlvha7iya.R.inc(58178);fail("Calling resume on an unsuspended StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_5_218sz18szlvha7iya.R.inc(58179);watch.stop();

        __CLR4_5_218sz18szlvha7iya.R.inc(58180);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58181);watch.start();
            __CLR4_5_218sz18szlvha7iya.R.inc(58182);fail("Calling start on a stopped StopWatch should throw an exception as it needs to be reset. ");
        } catch(final IllegalStateException ise) {
            // expected
        }
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testGetStartTime() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2emi6gi18w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testGetStartTime",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2emi6gi18w7(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58183);
        __CLR4_5_218sz18szlvha7iya.R.inc(58184);final long beforeStopWatch = System.currentTimeMillis();
        __CLR4_5_218sz18szlvha7iya.R.inc(58185);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58186);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58187);watch.getStartTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58188);fail("Calling getStartTime on an unstarted StopWatch should throw an exception");
        } catch (final IllegalStateException expected) {
            // expected
        }
        __CLR4_5_218sz18szlvha7iya.R.inc(58189);watch.start();
        __CLR4_5_218sz18szlvha7iya.R.inc(58190);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58191);watch.getStartTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58192);Assert.assertTrue(watch.getStartTime() >= beforeStopWatch);
        } catch (final IllegalStateException ex) {
            __CLR4_5_218sz18szlvha7iya.R.inc(58193);fail("Start time should be available: " + ex.getMessage());
        }
        __CLR4_5_218sz18szlvha7iya.R.inc(58194);watch.reset();
        __CLR4_5_218sz18szlvha7iya.R.inc(58195);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58196);watch.getStartTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58197);fail("Calling getStartTime on a reset, but unstarted StopWatch should throw an exception");
        } catch (final IllegalStateException expected) {
            // expected
        }
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    @Test
    public void testBooleanStates() {__CLR4_5_218sz18szlvha7iya.R.globalSliceStart(getClass().getName(),58198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c15b1b18wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218sz18szlvha7iya.R.rethrow($CLV_t2$);}finally{__CLR4_5_218sz18szlvha7iya.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testBooleanStates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58198,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c15b1b18wm(){try{__CLR4_5_218sz18szlvha7iya.R.inc(58198);
        __CLR4_5_218sz18szlvha7iya.R.inc(58199);final StopWatch watch = new StopWatch();
        __CLR4_5_218sz18szlvha7iya.R.inc(58200);assertFalse(watch.isStarted());
        __CLR4_5_218sz18szlvha7iya.R.inc(58201);assertFalse(watch.isSuspended());
        __CLR4_5_218sz18szlvha7iya.R.inc(58202);assertTrue(watch.isStopped());

        __CLR4_5_218sz18szlvha7iya.R.inc(58203);watch.start();
        __CLR4_5_218sz18szlvha7iya.R.inc(58204);assertTrue(watch.isStarted());
        __CLR4_5_218sz18szlvha7iya.R.inc(58205);assertFalse(watch.isSuspended());
        __CLR4_5_218sz18szlvha7iya.R.inc(58206);assertFalse(watch.isStopped());

        __CLR4_5_218sz18szlvha7iya.R.inc(58207);watch.suspend();
        __CLR4_5_218sz18szlvha7iya.R.inc(58208);assertTrue(watch.isStarted());
        __CLR4_5_218sz18szlvha7iya.R.inc(58209);assertTrue(watch.isSuspended());
        __CLR4_5_218sz18szlvha7iya.R.inc(58210);assertFalse(watch.isStopped());

        __CLR4_5_218sz18szlvha7iya.R.inc(58211);watch.stop();
        __CLR4_5_218sz18szlvha7iya.R.inc(58212);assertFalse(watch.isStarted());
        __CLR4_5_218sz18szlvha7iya.R.inc(58213);assertFalse(watch.isSuspended());
        __CLR4_5_218sz18szlvha7iya.R.inc(58214);assertTrue(watch.isStopped());
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}

    /**
     * <p>
     * Creates a suspended StopWatch object which appears to have elapsed
     * for the requested amount of time in nanoseconds.
     * <p>
     * 
     * <pre>
     * // Create a mock StopWatch with a time of 2:59:01.999
     * final long nanos = TimeUnit.HOURS.toNanos(2)
     *         + TimeUnit.MINUTES.toNanos(59)
     *         + TimeUnit.SECONDS.toNanos(1)
     *         + TimeUnit.MILLISECONDS.toNanos(999);
     * final StopWatch watch = createMockStopWatch(nanos);
     * </pre>
     * 
     * @param nanos Time in nanoseconds to have elapsed on the stop watch
     * @return StopWatch in a suspended state with the elapsed time
     */
    private StopWatch createMockStopWatch(final long nanos) {try{__CLR4_5_218sz18szlvha7iya.R.inc(58215);
        __CLR4_5_218sz18szlvha7iya.R.inc(58216);final StopWatch watch = StopWatch.createStarted();
        __CLR4_5_218sz18szlvha7iya.R.inc(58217);watch.suspend();
        __CLR4_5_218sz18szlvha7iya.R.inc(58218);try {
            __CLR4_5_218sz18szlvha7iya.R.inc(58219);final long currentNanos = System.nanoTime();
            __CLR4_5_218sz18szlvha7iya.R.inc(58220);FieldUtils.writeField(watch, "startTime", currentNanos - nanos, true);
            __CLR4_5_218sz18szlvha7iya.R.inc(58221);FieldUtils.writeField(watch, "stopTime", currentNanos, true);
        } catch (final IllegalAccessException e) {
            __CLR4_5_218sz18szlvha7iya.R.inc(58222);return null;
        }
        __CLR4_5_218sz18szlvha7iya.R.inc(58223);return watch;
    }finally{__CLR4_5_218sz18szlvha7iya.R.flushNeeded();}}
}
