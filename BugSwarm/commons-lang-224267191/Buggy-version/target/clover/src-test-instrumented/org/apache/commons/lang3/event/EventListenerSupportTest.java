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

package org.apache.commons.lang3.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * @since 3.0
 */
public class EventListenerSupportTest {static class __CLR4_5_2z9hz9hlvha7hrm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45809,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAddListenerNoDuplicates() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xsu98zz9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testAddListenerNoDuplicates",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xsu98zz9h(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45701);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45702);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45703);final VetoableChangeListener[] listeners = listenerSupport.getListeners();
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45704);assertEquals(0, listeners.length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45705);assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType());
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45706);final VetoableChangeListener[] empty = listeners;
        //for fun, show that the same empty instance is used 
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45707);assertSame(empty, listenerSupport.getListeners());

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45708);final VetoableChangeListener listener1 = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45709);listenerSupport.addListener(listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45710);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45711);listenerSupport.addListener(listener1, false);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45712);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45713);listenerSupport.removeListener(listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45714);assertSame(empty, listenerSupport.getListeners());
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testAddNullListener() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ksxpvzz9v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,78,117,108,108,76,105,115,116,101,110,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testAddNullListener",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ksxpvzz9v(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45715);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45716);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45717);listenerSupport.addListener(null);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testRemoveNullListener() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3lh7cz9y();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,78,117,108,108,76,105,115,116,101,110,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testRemoveNullListener",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3lh7cz9y(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45718);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45719);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45720);listenerSupport.removeListener(null);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test
    public void testEventDispatchOrder() throws PropertyVetoException {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j1y2r7za1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testEventDispatchOrder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j1y2r7za1() throws PropertyVetoException{try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45721);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45722);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45723);final List<VetoableChangeListener> calledListeners = new ArrayList<>();

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45724);final VetoableChangeListener listener1 = createListener(calledListeners);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45725);final VetoableChangeListener listener2 = createListener(calledListeners);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45726);listenerSupport.addListener(listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45727);listenerSupport.addListener(listener2);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45728);listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45729);assertEquals(calledListeners.size(), 2);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45730);assertSame(calledListeners.get(0), listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45731);assertSame(calledListeners.get(1), listener2);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithNonInterfaceParameter() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tsw8eozac();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,87,105,116,104,78,111,110,73,110,116,101,114,102,97,99,101,80,97,114,97,109,101,116,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testCreateWithNonInterfaceParameter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45732,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tsw8eozac(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45732);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45733);EventListenerSupport.create(String.class);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testCreateWithNullParameter() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nax1sbzae();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,87,105,116,104,78,117,108,108,80,97,114,97,109,101,116,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testCreateWithNullParameter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nax1sbzae(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45734);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45735);EventListenerSupport.create(null);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test
    public void testRemoveListenerDuringEvent() throws PropertyVetoException {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bijiaezag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testRemoveListenerDuringEvent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bijiaezag() throws PropertyVetoException{try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45736);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45737);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45738);for (int i = 0; (((i < 10)&&(__CLR4_5_2z9hz9hlvha7hrm.R.iget(45739)!=0|true))||(__CLR4_5_2z9hz9hlvha7hrm.R.iget(45740)==0&false)); ++i) {{
            __CLR4_5_2z9hz9hlvha7hrm.R.inc(45741);addDeregisterListener(listenerSupport);
        }
        }__CLR4_5_2z9hz9hlvha7hrm.R.inc(45742);assertEquals(listenerSupport.getListenerCount(), 10);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45743);listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45744);assertEquals(listenerSupport.getListenerCount(), 0);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test
    public void testGetListeners() {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2op2t5uzap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testGetListeners",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2op2t5uzap(){try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45745);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45746);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45747);final VetoableChangeListener[] listeners = listenerSupport.getListeners();
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45748);assertEquals(0, listeners.length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45749);assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType());
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45750);final VetoableChangeListener[] empty = listeners;
        //for fun, show that the same empty instance is used 
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45751);assertSame(empty, listenerSupport.getListeners());

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45752);final VetoableChangeListener listener1 = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45753);listenerSupport.addListener(listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45754);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45755);final VetoableChangeListener listener2 = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45756);listenerSupport.addListener(listener2);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45757);assertEquals(2, listenerSupport.getListeners().length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45758);listenerSupport.removeListener(listener1);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45759);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45760);listenerSupport.removeListener(listener2);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45761);assertSame(empty, listenerSupport.getListeners());
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException, PropertyVetoException {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26m1on9zb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26m1on9zb6() throws IOException, ClassNotFoundException, PropertyVetoException{try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45762);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45763);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45764);listenerSupport.addListener(new VetoableChangeListener() {

            @Override
            public void vetoableChange(final PropertyChangeEvent e) {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45765);
            }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
        });
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45766);listenerSupport.addListener(EasyMock.createNiceMock(VetoableChangeListener.class));

        //serialize:
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45767);final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45768);final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45769);objectOutputStream.writeObject(listenerSupport);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45770);objectOutputStream.close();

        //deserialize:
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45771);@SuppressWarnings("unchecked")
        final
        EventListenerSupport<VetoableChangeListener> deserializedListenerSupport = (EventListenerSupport<VetoableChangeListener>) new ObjectInputStream(
                new ByteArrayInputStream(outputStream.toByteArray())).readObject();

        //make sure we get a listener array back, of the correct component type, and that it contains only the serializable mock
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45772);final VetoableChangeListener[] listeners = deserializedListenerSupport.getListeners();
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45773);assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType());
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45774);assertEquals(1, listeners.length);

        //now verify that the mock still receives events; we can infer that the proxy was correctly reconstituted
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45775);final VetoableChangeListener listener = listeners[0];
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45776);final PropertyChangeEvent evt = new PropertyChangeEvent(new Date(), "Day", 7, 9);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45777);listener.vetoableChange(evt);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45778);EasyMock.replay(listener);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45779);deserializedListenerSupport.fire().vetoableChange(evt);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45780);EasyMock.verify(listener);

        //remove listener and verify we get an empty array of listeners
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45781);deserializedListenerSupport.removeListener(listener);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45782);assertEquals(0, deserializedListenerSupport.getListeners().length);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    @Test
    public void testSubclassInvocationHandling() throws PropertyVetoException {__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceStart(getClass().getName(),45783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28gb1buzbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z9hz9hlvha7hrm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z9hz9hlvha7hrm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testSubclassInvocationHandling",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28gb1buzbr() throws PropertyVetoException{try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45783);

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45784);final
        EventListenerSupport<VetoableChangeListener> eventListenerSupport = new EventListenerSupport<VetoableChangeListener>(
                VetoableChangeListener.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected java.lang.reflect.InvocationHandler createInvocationHandler() {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45785);
                __CLR4_5_2z9hz9hlvha7hrm.R.inc(45786);return new ProxyInvocationHandler() {
                    /**
                     * {@inheritDoc}
                     */
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args)
                            throws Throwable {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45787);
                        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45788);return ((("vetoableChange".equals(method.getName())
                                && "Hour".equals(((PropertyChangeEvent) args[0]).getPropertyName()) )&&(__CLR4_5_2z9hz9hlvha7hrm.R.iget(45789)!=0|true))||(__CLR4_5_2z9hz9hlvha7hrm.R.iget(45790)==0&false))? null
                                : super.invoke(proxy, method, args);
                    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
                };
            }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
        };

        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45791);final VetoableChangeListener listener = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45792);eventListenerSupport.addListener(listener);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45793);final Object source = new Date();
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45794);final PropertyChangeEvent ignore = new PropertyChangeEvent(source, "Hour", 5, 6);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45795);final PropertyChangeEvent respond = new PropertyChangeEvent(source, "Day", 6, 7);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45796);listener.vetoableChange(respond);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45797);EasyMock.replay(listener);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45798);eventListenerSupport.fire().vetoableChange(ignore);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45799);eventListenerSupport.fire().vetoableChange(respond);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45800);EasyMock.verify(listener);
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    private void addDeregisterListener(final EventListenerSupport<VetoableChangeListener> listenerSupport) {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45801);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45802);listenerSupport.addListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(final PropertyChangeEvent e) {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45803);
                __CLR4_5_2z9hz9hlvha7hrm.R.inc(45804);listenerSupport.removeListener(this);
            }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}

    private VetoableChangeListener createListener(final List<VetoableChangeListener> calledListeners) {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45805);
        __CLR4_5_2z9hz9hlvha7hrm.R.inc(45806);return new VetoableChangeListener() {
            @Override
            public void vetoableChange(final PropertyChangeEvent e) {try{__CLR4_5_2z9hz9hlvha7hrm.R.inc(45807);
                __CLR4_5_2z9hz9hlvha7hrm.R.inc(45808);calledListeners.add(this);
            }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
        };
    }finally{__CLR4_5_2z9hz9hlvha7hrm.R.flushNeeded();}}
}
