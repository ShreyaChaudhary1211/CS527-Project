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
package org.apache.commons.lang3.exception;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;


/**
 * Abstract test of an ExceptionContext implementation.
 */
public abstract class AbstractExceptionContextTest<T extends ExceptionContext & Serializable> {static class __CLR4_5_2zf6zf6lvha7hse{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final String TEST_MESSAGE_2 = "This is monotonous";
    protected static final String TEST_MESSAGE = "Test Message";
    protected T exceptionContext;

    protected static class ObjectWithFaultyToString {
        @Override
        public String toString() {try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45906);
            __CLR4_5_2zf6zf6lvha7hse.R.inc(45907);throw new RuntimeException("Crap");
        }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}
    }


    @Before
    public void setUp() throws Exception {try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45908);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45909);exceptionContext
            .addContextValue("test1", null)
            .addContextValue("test2", "some value")
            .addContextValue("test Date", new Date())
            .addContextValue("test Nbr", Integer.valueOf(5))
            .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testAddContextValue() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bjv62wzfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testAddContextValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bjv62wzfa(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45910);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45911);final String message = exceptionContext.getFormattedExceptionMessage(TEST_MESSAGE);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45912);assertTrue(message.indexOf(TEST_MESSAGE) >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45913);assertTrue(message.indexOf("test1") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45914);assertTrue(message.indexOf("test2") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45915);assertTrue(message.indexOf("test Date") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45916);assertTrue(message.indexOf("test Nbr") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45917);assertTrue(message.indexOf("some value") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45918);assertTrue(message.indexOf("5") >= 0);

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45919);assertTrue(exceptionContext.getFirstContextValue("test1") == null);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45920);assertTrue(exceptionContext.getFirstContextValue("test2").equals("some value"));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45921);assertEquals(5, exceptionContext.getContextLabels().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45922);assertTrue(exceptionContext.getContextLabels().contains("test1"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45923);assertTrue(exceptionContext.getContextLabels().contains("test2"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45924);assertTrue(exceptionContext.getContextLabels().contains("test Date"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45925);assertTrue(exceptionContext.getContextLabels().contains("test Nbr"));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45926);exceptionContext.addContextValue("test2", "different value");
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45927);assertEquals(5, exceptionContext.getContextLabels().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45928);assertTrue(exceptionContext.getContextLabels().contains("test2"));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45929);final String contextMessage = exceptionContext.getFormattedExceptionMessage(null);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45930);assertTrue(contextMessage.indexOf(TEST_MESSAGE) == -1);
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testSetContextValue() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvu3rtzfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testSetContextValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvu3rtzfv(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45931);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45932);exceptionContext.addContextValue("test2", "different value");
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45933);exceptionContext.setContextValue("test3", "3");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45934);final String message = exceptionContext.getFormattedExceptionMessage(TEST_MESSAGE);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45935);assertTrue(message.indexOf(TEST_MESSAGE) >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45936);assertTrue(message.indexOf("test Poorly written obj") >= 0);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45937);assertTrue(message.indexOf("Crap") >= 0);

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45938);assertTrue(exceptionContext.getFirstContextValue("crap") == null);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45939);assertTrue(exceptionContext.getFirstContextValue("test Poorly written obj") instanceof ObjectWithFaultyToString);

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45940);assertEquals(7, exceptionContext.getContextEntries().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45941);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45942);assertTrue(exceptionContext.getContextLabels().contains("test Poorly written obj"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45943);assertTrue(!exceptionContext.getContextLabels().contains("crap"));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45944);exceptionContext.setContextValue("test Poorly written obj", "replacement");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45945);assertEquals(7, exceptionContext.getContextEntries().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45946);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45947);exceptionContext.setContextValue("test2", "another");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45948);assertEquals(6, exceptionContext.getContextEntries().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45949);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45950);final String contextMessage = exceptionContext.getFormattedExceptionMessage(null);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45951);assertTrue(contextMessage.indexOf(TEST_MESSAGE) == -1);
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testGetFirstContextValue() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2loxcq3zgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetFirstContextValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2loxcq3zgg(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45952);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45953);exceptionContext.addContextValue("test2", "different value");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45954);assertTrue(exceptionContext.getFirstContextValue("test1") == null);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45955);assertTrue(exceptionContext.getFirstContextValue("test2").equals("some value"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45956);assertTrue(exceptionContext.getFirstContextValue("crap") == null);

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45957);exceptionContext.setContextValue("test2", "another");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45958);assertTrue(exceptionContext.getFirstContextValue("test2").equals("another"));
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testGetContextValues() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d4iylozgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d4iylozgn(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45959);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45960);exceptionContext.addContextValue("test2", "different value");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45961);assertEquals(exceptionContext.getContextValues("test1"), Collections.singletonList(null));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45962);assertEquals(exceptionContext.getContextValues("test2"), Arrays.asList("some value", "different value"));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45963);exceptionContext.setContextValue("test2", "another");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45964);assertTrue(exceptionContext.getFirstContextValue("test2").equals("another"));
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testGetContextLabels() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23o6b9tzgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextLabels",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23o6b9tzgt(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45965);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45966);assertEquals(5, exceptionContext.getContextEntries().size());
        
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45967);exceptionContext.addContextValue("test2", "different value");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45968);final Set<String> labels = exceptionContext.getContextLabels();
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45969);assertEquals(6, exceptionContext.getContextEntries().size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45970);assertEquals(5, labels.size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45971);assertTrue(labels.contains("test1"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45972);assertTrue(labels.contains("test2"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45973);assertTrue(labels.contains("test Date"));
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45974);assertTrue(labels.contains("test Nbr"));
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}

    @Test
    public void testGetContextEntries() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21nkzd8zh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextEntries",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21nkzd8zh3(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45975);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45976);assertEquals(5, exceptionContext.getContextEntries().size());
        
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45977);exceptionContext.addContextValue("test2", "different value");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45978);final List<Pair<String, Object>> entries = exceptionContext.getContextEntries();
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45979);assertEquals(6, entries.size());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45980);assertEquals("test1", entries.get(0).getKey());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45981);assertEquals("test2", entries.get(1).getKey());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45982);assertEquals("test Date", entries.get(2).getKey());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45983);assertEquals("test Nbr", entries.get(3).getKey());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45984);assertEquals("test Poorly written obj", entries.get(4).getKey());
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45985);assertEquals("test2", entries.get(5).getKey());
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}
    
    @Test
    public void testJavaSerialization() {__CLR4_5_2zf6zf6lvha7hse.R.globalSliceStart(getClass().getName(),45986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2igcnczzhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zf6zf6lvha7hse.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zf6zf6lvha7hse.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testJavaSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2igcnczzhe(){try{__CLR4_5_2zf6zf6lvha7hse.R.inc(45986);
        __CLR4_5_2zf6zf6lvha7hse.R.inc(45987);exceptionContext.setContextValue("test Poorly written obj", "serializable replacement");

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45988);final T clone = SerializationUtils.deserialize(SerializationUtils.serialize(exceptionContext));

        __CLR4_5_2zf6zf6lvha7hse.R.inc(45989);assertEquals(exceptionContext.getFormattedExceptionMessage(null), clone.getFormattedExceptionMessage(null));
    }finally{__CLR4_5_2zf6zf6lvha7hse.R.flushNeeded();}}
}
