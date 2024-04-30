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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.naming.event.ObjectChangeListener;

import org.junit.Test;

/**
 * @since 3.0
 */
public class EventUtilsTest 
{static class __CLR4_5_2zchzchlvha7hs1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,45906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hzch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hzch(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45809);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45810);assertNotNull(new EventUtils());
        __CLR4_5_2zchzchlvha7hs1.R.inc(45811);final Constructor<?>[] cons = EventUtils.class.getDeclaredConstructors();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45812);assertEquals(1, cons.length);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45813);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45814);assertTrue(Modifier.isPublic(EventUtils.class.getModifiers()));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45815);assertFalse(Modifier.isFinal(EventUtils.class.getModifiers()));
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    
    @Test
    public void testAddEventListener()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284izruzco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284izruzco(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45816);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45817);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45818);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45819);final PropertyChangeListener listener = handler.createListener(PropertyChangeListener.class);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45820);assertEquals(0, handler.getEventCount("propertyChange"));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45821);EventUtils.addEventListener(src, PropertyChangeListener.class, listener);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45822);assertEquals(0, handler.getEventCount("propertyChange"));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45823);src.setProperty("newValue");
        __CLR4_5_2zchzchlvha7hs1.R.inc(45824);assertEquals(1, handler.getEventCount("propertyChange"));
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

    @Test
    public void testAddEventListenerWithNoAddMethod()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22tqqppzcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22tqqppzcx(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45825);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45826);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45827);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45828);final ObjectChangeListener listener = handler.createListener(ObjectChangeListener.class);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45829);try
        {
            __CLR4_5_2zchzchlvha7hs1.R.inc(45830);EventUtils.addEventListener(src, ObjectChangeListener.class, listener);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45831);fail("Should not be allowed to add a listener to an object that doesn't support it.");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_5_2zchzchlvha7hs1.R.inc(45832);assertEquals("Class " + src.getClass().getName() + " does not have a public add" + ObjectChangeListener.class.getSimpleName() + " method which takes a parameter of type " + ObjectChangeListener.class.getName() + ".", e.getMessage());
        }
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

    @Test
    public void testAddEventListenerThrowsException()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2srgtwqzd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2srgtwqzd5(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45833);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45834);final ExceptionEventSource src = new ExceptionEventSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45835);try
        {
            __CLR4_5_2zchzchlvha7hs1.R.inc(45836);EventUtils.addEventListener(src, PropertyChangeListener.class, new PropertyChangeListener()
            {
                @Override
                public void propertyChange(final PropertyChangeEvent e)
                {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45837);
                    // Do nothing!
                }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
            });
            __CLR4_5_2zchzchlvha7hs1.R.inc(45838);fail("Add method should have thrown an exception, so method should fail.");
        }
        catch (final RuntimeException e)
        {

        }
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

    @Test
    public void testAddEventListenerWithPrivateAddMethod()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d03lslzdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d03lslzdb(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45839);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45840);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45841);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45842);final VetoableChangeListener listener = handler.createListener(VetoableChangeListener.class);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45843);try
        {
            __CLR4_5_2zchzchlvha7hs1.R.inc(45844);EventUtils.addEventListener(src, VetoableChangeListener.class, listener);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45845);fail("Should not be allowed to add a listener to an object that doesn't support it.");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_5_2zchzchlvha7hs1.R.inc(45846);assertEquals("Class " + src.getClass().getName() + " does not have a public add" + VetoableChangeListener.class.getSimpleName() + " method which takes a parameter of type " + VetoableChangeListener.class.getName() + ".", e.getMessage());
        }
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

    @Test
    public void testBindEventsToMethod()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2seugwbzdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2seugwbzdj(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45847);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45848);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45849);final EventCounter counter = new EventCounter();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45850);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45851);assertEquals(0, counter.getCount());
        __CLR4_5_2zchzchlvha7hs1.R.inc(45852);src.setProperty("newValue");
        __CLR4_5_2zchzchlvha7hs1.R.inc(45853);assertEquals(1, counter.getCount());
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}


    @Test
    public void testBindEventsToMethodWithEvent()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_217jfmfzdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_217jfmfzdq(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45854);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45855);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45856);final EventCounterWithEvent counter = new EventCounterWithEvent();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45857);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45858);assertEquals(0, counter.getCount());
        __CLR4_5_2zchzchlvha7hs1.R.inc(45859);src.setProperty("newValue");
        __CLR4_5_2zchzchlvha7hs1.R.inc(45860);assertEquals(1, counter.getCount());
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}


    @Test
    public void testBindFilteredEventsToMethod()
    {__CLR4_5_2zchzchlvha7hs1.R.globalSliceStart(getClass().getName(),45861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d34lcyzdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zchzchlvha7hs1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zchzchlvha7hs1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d34lcyzdx(){try{__CLR4_5_2zchzchlvha7hs1.R.inc(45861);
        __CLR4_5_2zchzchlvha7hs1.R.inc(45862);final MultipleEventSource src = new MultipleEventSource();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45863);final EventCounter counter = new EventCounter();
        __CLR4_5_2zchzchlvha7hs1.R.inc(45864);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, MultipleEventListener.class, "event1");
        __CLR4_5_2zchzchlvha7hs1.R.inc(45865);assertEquals(0, counter.getCount());
        __CLR4_5_2zchzchlvha7hs1.R.inc(45866);src.listeners.fire().event1(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(0), Integer.valueOf(1)));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45867);assertEquals(1, counter.getCount());
        __CLR4_5_2zchzchlvha7hs1.R.inc(45868);src.listeners.fire().event2(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(1), Integer.valueOf(2)));
        __CLR4_5_2zchzchlvha7hs1.R.inc(45869);assertEquals(1, counter.getCount());
    }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

    public static interface MultipleEventListener
    {
        public void event1(PropertyChangeEvent e);

        public void event2(PropertyChangeEvent e);
    }

    public static class EventCounter
    {
        private int count;

        public void eventOccurred()
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45870);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45871);count++;
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45872);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45873);return count;
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }

    public static class EventCounterWithEvent
    {
        private int count;

        public void eventOccurred(final PropertyChangeEvent e)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45874);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45875);count++;
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45876);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45877);return count;
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }


    private static class EventCountingInvociationHandler implements InvocationHandler
    {
        private final Map<String, Integer> eventCounts = new TreeMap<>();

        public <L> L createListener(final Class<L> listenerType)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45878);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45879);return listenerType.cast(Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                    new Class[]{listenerType},
                    this));
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        public int getEventCount(final String eventName)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45880);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45881);final Integer count = eventCounts.get(eventName);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45882);return (((count == null )&&(__CLR4_5_2zchzchlvha7hs1.R.iget(45883)!=0|true))||(__CLR4_5_2zchzchlvha7hs1.R.iget(45884)==0&false))? 0 : count.intValue();
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45885);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45886);final Integer count = eventCounts.get(method.getName());
            __CLR4_5_2zchzchlvha7hs1.R.inc(45887);if ((((count == null)&&(__CLR4_5_2zchzchlvha7hs1.R.iget(45888)!=0|true))||(__CLR4_5_2zchzchlvha7hs1.R.iget(45889)==0&false)))
            {{
                __CLR4_5_2zchzchlvha7hs1.R.inc(45890);eventCounts.put(method.getName(), Integer.valueOf(1));
            }
            }else
            {{
                __CLR4_5_2zchzchlvha7hs1.R.inc(45891);eventCounts.put(method.getName(), Integer.valueOf(count.intValue() + 1));
            }
            }__CLR4_5_2zchzchlvha7hs1.R.inc(45892);return null;
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }

    public static class MultipleEventSource
    {
        private final EventListenerSupport<MultipleEventListener> listeners = EventListenerSupport.create(MultipleEventListener.class);

        public void addMultipleEventListener(final MultipleEventListener listener)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45893);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45894);listeners.addListener(listener);
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }

    public static class ExceptionEventSource
    {
        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45895);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45896);throw new RuntimeException();
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }

    public static class PropertyChangeSource
    {
        private final EventListenerSupport<PropertyChangeListener> listeners = EventListenerSupport.create(PropertyChangeListener.class);

        private String property;

        public void setProperty(final String property)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45897);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45898);final String oldValue = this.property;
            __CLR4_5_2zchzchlvha7hs1.R.inc(45899);this.property = property;
            __CLR4_5_2zchzchlvha7hs1.R.inc(45900);listeners.fire().propertyChange(new PropertyChangeEvent(this, "property", oldValue, property));
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        protected void addVetoableChangeListener(final VetoableChangeListener listener)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45901);
            // Do nothing!
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45902);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45903);listeners.addListener(listener);
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}

        public void removePropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_5_2zchzchlvha7hs1.R.inc(45904);
            __CLR4_5_2zchzchlvha7hs1.R.inc(45905);listeners.removeListener(listener);
        }finally{__CLR4_5_2zchzchlvha7hs1.R.flushNeeded();}}
    }
}
