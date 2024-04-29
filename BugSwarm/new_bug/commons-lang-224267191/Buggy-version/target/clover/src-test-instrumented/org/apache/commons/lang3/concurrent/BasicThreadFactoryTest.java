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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadFactory;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code BasicThreadFactory}.
 */
public class BasicThreadFactoryTest {static class __CLR4_5_2yedyedlvha7hna{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,44715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the test naming pattern. */
    private static final String PATTERN = "testThread-%d";

    /** The builder for creating a thread factory. */
    private BasicThreadFactory.Builder builder;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2yedyedlvha7hna.R.inc(44581);
        __CLR4_5_2yedyedlvha7hna.R.inc(44582);builder = new BasicThreadFactory.Builder();
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests the default options of a thread factory.
     *
     * @param factory the factory to be checked
     */
    private void checkFactoryDefaults(final BasicThreadFactory factory) {try{__CLR4_5_2yedyedlvha7hna.R.inc(44583);
        __CLR4_5_2yedyedlvha7hna.R.inc(44584);assertNull("Got a naming pattern", factory.getNamingPattern());
        __CLR4_5_2yedyedlvha7hna.R.inc(44585);assertNull("Got an exception handler", factory
                .getUncaughtExceptionHandler());
        __CLR4_5_2yedyedlvha7hna.R.inc(44586);assertNull("Got a priority", factory.getPriority());
        __CLR4_5_2yedyedlvha7hna.R.inc(44587);assertNull("Got a daemon flag", factory.getDaemonFlag());
        __CLR4_5_2yedyedlvha7hna.R.inc(44588);assertNotNull("No wrapped factory", factory.getWrappedFactory());
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests the default values used by the builder.
     */
    @Test
    public void testBuildDefaults() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_287p6utyel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildDefaults",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44589,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_287p6utyel(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44589);
        __CLR4_5_2yedyedlvha7hna.R.inc(44590);final BasicThreadFactory factory = builder.build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44591);checkFactoryDefaults(factory);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tries to set a null naming pattern.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildNamingPatternNull() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kywb8ayeo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,78,97,109,105,110,103,80,97,116,116,101,114,110,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildNamingPatternNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kywb8ayeo(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44592);
        __CLR4_5_2yedyedlvha7hna.R.inc(44593);builder.namingPattern(null);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tries to set a null wrapped factory.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildWrappedFactoryNull() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vz4ymnyeq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,87,114,97,112,112,101,100,70,97,99,116,111,114,121,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildWrappedFactoryNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vz4ymnyeq(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44594);
        __CLR4_5_2yedyedlvha7hna.R.inc(44595);builder.wrappedFactory(null);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tries to set a null exception handler.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildUncaughtExceptionHandlerNull() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23dt1y2yes();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,85,110,99,97,117,103,104,116,69,120,99,101,112,116,105,111,110,72,97,110,100,108,101,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildUncaughtExceptionHandlerNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23dt1y2yes(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44596);
        __CLR4_5_2yedyedlvha7hna.R.inc(44597);builder.uncaughtExceptionHandler(null);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests the reset() method of the builder.
     */
    @Test
    public void testBuilderReset() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nhl6zxyeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderReset",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nhl6zxyeu(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44598);
        __CLR4_5_2yedyedlvha7hna.R.inc(44599);final ThreadFactory wrappedFactory = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44600);final Thread.UncaughtExceptionHandler exHandler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44601);EasyMock.replay(wrappedFactory, exHandler);
        __CLR4_5_2yedyedlvha7hna.R.inc(44602);builder.namingPattern(PATTERN).daemon(true).priority(
                Thread.MAX_PRIORITY).uncaughtExceptionHandler(exHandler)
                .wrappedFactory(wrappedFactory);
        __CLR4_5_2yedyedlvha7hna.R.inc(44603);builder.reset();
        __CLR4_5_2yedyedlvha7hna.R.inc(44604);final BasicThreadFactory factory = builder.build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44605);checkFactoryDefaults(factory);
        __CLR4_5_2yedyedlvha7hna.R.inc(44606);assertNotSame("Wrapped factory not reset", wrappedFactory, factory
                .getWrappedFactory());
        __CLR4_5_2yedyedlvha7hna.R.inc(44607);EasyMock.verify(wrappedFactory, exHandler);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether reset() is automatically called after build().
     */
    @Test
    public void testBuilderResetAfterBuild() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25d5g5dyf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderResetAfterBuild",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44608,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25d5g5dyf4(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44608);
        __CLR4_5_2yedyedlvha7hna.R.inc(44609);builder.wrappedFactory(EasyMock.createNiceMock(ThreadFactory.class))
                .namingPattern(PATTERN).daemon(true).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44610);checkFactoryDefaults(builder.build());
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the naming pattern is applied to new threads.
     */
    @Test
    public void testNewThreadNamingPattern() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k0ax55yf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNamingPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k0ax55yf7(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44611);
        __CLR4_5_2yedyedlvha7hna.R.inc(44612);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44613);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44614);final int count = 12;
        __CLR4_5_2yedyedlvha7hna.R.inc(44615);for (int i = 0; (((i < count)&&(__CLR4_5_2yedyedlvha7hna.R.iget(44616)!=0|true))||(__CLR4_5_2yedyedlvha7hna.R.iget(44617)==0&false)); i++) {{
            __CLR4_5_2yedyedlvha7hna.R.inc(44618);EasyMock.expect(wrapped.newThread(r)).andReturn(new Thread());
        }
        }__CLR4_5_2yedyedlvha7hna.R.inc(44619);EasyMock.replay(wrapped, r);
        __CLR4_5_2yedyedlvha7hna.R.inc(44620);final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .namingPattern(PATTERN).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44621);for (int i = 0; (((i < count)&&(__CLR4_5_2yedyedlvha7hna.R.iget(44622)!=0|true))||(__CLR4_5_2yedyedlvha7hna.R.iget(44623)==0&false)); i++) {{
            __CLR4_5_2yedyedlvha7hna.R.inc(44624);final Thread t = factory.newThread(r);
            __CLR4_5_2yedyedlvha7hna.R.inc(44625);assertEquals("Wrong thread name", String.format(PATTERN, Long
                    .valueOf(i + 1)), t.getName());
            __CLR4_5_2yedyedlvha7hna.R.inc(44626);assertEquals("Wrong thread count", i + 1, factory.getThreadCount());
        }
        }__CLR4_5_2yedyedlvha7hna.R.inc(44627);EasyMock.verify(wrapped, r);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the thread name is not modified if no naming pattern is
     * set.
     */
    @Test
    public void testNewThreadNoNamingPattern() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o6u54ayfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoNamingPattern",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44628,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o6u54ayfo(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44628);
        __CLR4_5_2yedyedlvha7hna.R.inc(44629);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44630);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44631);final String name = "unchangedThreadName";
        __CLR4_5_2yedyedlvha7hna.R.inc(44632);final Thread t = new Thread(name);
        __CLR4_5_2yedyedlvha7hna.R.inc(44633);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44634);EasyMock.replay(wrapped, r);
        __CLR4_5_2yedyedlvha7hna.R.inc(44635);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44636);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44637);assertEquals("Name was changed", name, t.getName());
        __CLR4_5_2yedyedlvha7hna.R.inc(44638);EasyMock.verify(wrapped, r);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Helper method for testing whether the daemon flag is taken into account.
     *
     * @param flag the value of the flag
     */
    private void checkDaemonFlag(final boolean flag) {try{__CLR4_5_2yedyedlvha7hna.R.inc(44639);
        __CLR4_5_2yedyedlvha7hna.R.inc(44640);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44641);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44642);final Thread t = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44643);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44644);EasyMock.replay(wrapped, r);
        __CLR4_5_2yedyedlvha7hna.R.inc(44645);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).daemon(
                flag).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44646);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44647);assertTrue("Wrong daemon flag", flag == t.isDaemon());
        __CLR4_5_2yedyedlvha7hna.R.inc(44648);EasyMock.verify(wrapped, r);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether daemon threads can be created.
     */
    @Test
    public void testNewThreadDaemonTrue() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29h5969yg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonTrue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29h5969yg9(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44649);
        __CLR4_5_2yedyedlvha7hna.R.inc(44650);checkDaemonFlag(true);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the daemon status of new threads can be turned off.
     */
    @Test
    public void testNewThreadDaemonFalse() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rpwiy6ygb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonFalse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rpwiy6ygb(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44651);
        __CLR4_5_2yedyedlvha7hna.R.inc(44652);checkDaemonFlag(false);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the daemon flag is not touched on newly created threads if
     * it is not specified.
     */
    @Test
    public void testNewThreadNoDaemonFlag() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dyrq9cygd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoDaemonFlag",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dyrq9cygd(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44653);
        __CLR4_5_2yedyedlvha7hna.R.inc(44654);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44655);final Runnable r1 = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44656);final Runnable r2 = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44657);final Thread t1 = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44658);final Thread t2 = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44659);t1.setDaemon(true);
        __CLR4_5_2yedyedlvha7hna.R.inc(44660);EasyMock.expect(wrapped.newThread(r1)).andReturn(t1);
        __CLR4_5_2yedyedlvha7hna.R.inc(44661);EasyMock.expect(wrapped.newThread(r2)).andReturn(t2);
        __CLR4_5_2yedyedlvha7hna.R.inc(44662);EasyMock.replay(wrapped, r1, r2);
        __CLR4_5_2yedyedlvha7hna.R.inc(44663);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44664);assertSame("Wrong thread 1", t1, factory.newThread(r1));
        __CLR4_5_2yedyedlvha7hna.R.inc(44665);assertTrue("No daemon thread", t1.isDaemon());
        __CLR4_5_2yedyedlvha7hna.R.inc(44666);assertSame("Wrong thread 2", t2, factory.newThread(r2));
        __CLR4_5_2yedyedlvha7hna.R.inc(44667);assertFalse("A daemon thread", t2.isDaemon());
        __CLR4_5_2yedyedlvha7hna.R.inc(44668);EasyMock.verify(wrapped, r1, r2);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the priority is set on newly created threads.
     */
    @Test
    public void testNewThreadPriority() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28y96n7ygt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadPriority",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28y96n7ygt(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44669);
        __CLR4_5_2yedyedlvha7hna.R.inc(44670);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44671);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44672);final Thread t = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44673);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44674);EasyMock.replay(wrapped, r);
        __CLR4_5_2yedyedlvha7hna.R.inc(44675);final int priority = Thread.NORM_PRIORITY + 1;
        __CLR4_5_2yedyedlvha7hna.R.inc(44676);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).priority(
                priority).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44677);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44678);assertEquals("Wrong priority", priority, t.getPriority());
        __CLR4_5_2yedyedlvha7hna.R.inc(44679);EasyMock.verify(wrapped, r);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the original priority is not changed if no priority is
     * specified.
     */
    @Test
    public void testNewThreadNoPriority() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sbkk7wyh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoPriority",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sbkk7wyh4(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44680);
        __CLR4_5_2yedyedlvha7hna.R.inc(44681);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44682);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44683);final int orgPriority = Thread.NORM_PRIORITY + 1;
        __CLR4_5_2yedyedlvha7hna.R.inc(44684);final Thread t = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44685);t.setPriority(orgPriority);
        __CLR4_5_2yedyedlvha7hna.R.inc(44686);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44687);EasyMock.replay(wrapped, r);
        __CLR4_5_2yedyedlvha7hna.R.inc(44688);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44689);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44690);assertEquals("Wrong priority", orgPriority, t.getPriority());
        __CLR4_5_2yedyedlvha7hna.R.inc(44691);EasyMock.verify(wrapped, r);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the exception handler is set if one is provided.
     */
    @Test
    public void testNewThreadExHandler() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_236yxvqyhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadExHandler",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_236yxvqyhg(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44692);
        __CLR4_5_2yedyedlvha7hna.R.inc(44693);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44694);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44695);final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44696);final Thread t = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44697);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44698);EasyMock.replay(wrapped, r, handler);
        __CLR4_5_2yedyedlvha7hna.R.inc(44699);final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .uncaughtExceptionHandler(handler).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44700);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44701);assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        __CLR4_5_2yedyedlvha7hna.R.inc(44702);EasyMock.verify(wrapped, r, handler);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}

    /**
     * Tests whether the original exception handler is not touched if none is
     * specified.
     */
    @Test
    public void testNewThreadNoExHandler() {__CLR4_5_2yedyedlvha7hna.R.globalSliceStart(getClass().getName(),44703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fruba3yhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yedyedlvha7hna.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yedyedlvha7hna.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoExHandler",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fruba3yhr(){try{__CLR4_5_2yedyedlvha7hna.R.inc(44703);
        __CLR4_5_2yedyedlvha7hna.R.inc(44704);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44705);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44706);final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_5_2yedyedlvha7hna.R.inc(44707);final Thread t = new Thread();
        __CLR4_5_2yedyedlvha7hna.R.inc(44708);t.setUncaughtExceptionHandler(handler);
        __CLR4_5_2yedyedlvha7hna.R.inc(44709);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_5_2yedyedlvha7hna.R.inc(44710);EasyMock.replay(wrapped, r, handler);
        __CLR4_5_2yedyedlvha7hna.R.inc(44711);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_5_2yedyedlvha7hna.R.inc(44712);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_5_2yedyedlvha7hna.R.inc(44713);assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        __CLR4_5_2yedyedlvha7hna.R.inc(44714);EasyMock.verify(wrapped, r, handler);
    }finally{__CLR4_5_2yedyedlvha7hna.R.flushNeeded();}}
}
