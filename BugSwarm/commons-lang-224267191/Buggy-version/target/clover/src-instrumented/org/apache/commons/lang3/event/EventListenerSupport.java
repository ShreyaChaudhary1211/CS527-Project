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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.Validate;

/**
 * <p>An EventListenerSupport object can be used to manage a list of event
 * listeners of a particular type. The class provides
 * {@link #addListener(Object)} and {@link #removeListener(Object)} methods
 * for registering listeners, as well as a {@link #fire()} method for firing
 * events to the listeners.
 * </p>
 *
 * <p>
 * To use this class, suppose you want to support ActionEvents.  You would do:
 * </p>
 * <pre><code>
 * public class MyActionEventSource
 * {
 *   private EventListenerSupport&lt;ActionListener&gt; actionListeners =
 *       EventListenerSupport.create(ActionListener.class);
 *
 *   public void someMethodThatFiresAction()
 *   {
 *     ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "somethingCool");
 *     actionListeners.fire().actionPerformed(e);
 *   }
 * }
 * </code></pre>
 *
 * <p>
 * Serializing an {@link EventListenerSupport} instance will result in any
 * non-{@link Serializable} listeners being silently dropped.
 * </p>
 *
 * @param <L> the type of event listener that is supported by this proxy.
 *
 * @since 3.0
 */
public class EventListenerSupport<L> implements Serializable {public static class __CLR4_5_2b3ub3ulvha7al4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 3593265990380473632L;

    /**
     * The list used to hold the registered listeners. This list is
     * intentionally a thread-safe copy-on-write-array so that traversals over
     * the list of listeners will be atomic.
     */
    private List<L> listeners = new CopyOnWriteArrayList<>();

    /**
     * The proxy representing the collection of listeners. Calls to this proxy
     * object will sent to all registered listeners.
     */
    private transient L proxy;

    /**
     * Empty typed array for #getListeners().
     */
    private transient L[] prototypeArray;

    /**
     * Creates an EventListenerSupport object which supports the specified
     * listener type.
     *
     * @param <T> the type of the listener interface
     * @param listenerInterface the type of listener interface that will receive
     *        events posted using this class.
     *
     * @return an EventListenerSupport object which supports the specified
     *         listener type.
     *
     * @throws NullPointerException if <code>listenerInterface</code> is
     *         <code>null</code>.
     * @throws IllegalArgumentException if <code>listenerInterface</code> is
     *         not an interface.
     */
    public static <T> EventListenerSupport<T> create(final Class<T> listenerInterface) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14394);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14395);return new EventListenerSupport<>(listenerInterface);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Creates an EventListenerSupport object which supports the provided
     * listener interface.
     *
     * @param listenerInterface the type of listener interface that will receive
     *        events posted using this class.
     *
     * @throws NullPointerException if <code>listenerInterface</code> is
     *         <code>null</code>.
     * @throws IllegalArgumentException if <code>listenerInterface</code> is
     *         not an interface.
     */
    public EventListenerSupport(final Class<L> listenerInterface) {
        this(listenerInterface, Thread.currentThread().getContextClassLoader());__CLR4_5_2b3ub3ulvha7al4.R.inc(14397);try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14396);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Creates an EventListenerSupport object which supports the provided
     * listener interface using the specified class loader to create the JDK
     * dynamic proxy.
     *
     * @param listenerInterface the listener interface.
     * @param classLoader       the class loader.
     *
     * @throws NullPointerException if <code>listenerInterface</code> or
     *         <code>classLoader</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>listenerInterface</code> is
     *         not an interface.
     */
    public EventListenerSupport(final Class<L> listenerInterface, final ClassLoader classLoader) {
        this();__CLR4_5_2b3ub3ulvha7al4.R.inc(14399);try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14398);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14400);Validate.notNull(listenerInterface, "Listener interface cannot be null.");
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14401);Validate.notNull(classLoader, "ClassLoader cannot be null.");
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14402);Validate.isTrue(listenerInterface.isInterface(), "Class {0} is not an interface",
                listenerInterface.getName());
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14403);initializeTransientFields(listenerInterface, classLoader);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Create a new EventListenerSupport instance.
     * Serialization-friendly constructor.
     */
    private EventListenerSupport() {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14404);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Returns a proxy object which can be used to call listener methods on all
     * of the registered event listeners. All calls made to this proxy will be
     * forwarded to all registered listeners.
     *
     * @return a proxy object which can be used to call listener methods on all
     * of the registered event listeners
     */
    public L fire() {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14405);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14406);return proxy;
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

//**********************************************************************************************************************
// Other Methods
//**********************************************************************************************************************

    /**
     * Registers an event listener.
     *
     * @param listener the event listener (may not be <code>null</code>).
     *
     * @throws NullPointerException if <code>listener</code> is
     *         <code>null</code>.
     */
    public void addListener(final L listener) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14407);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14408);addListener(listener, true);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Registers an event listener.  Will not add a pre-existing listener
     * object to the list if <code>allowDuplicate</code> is false.
     *
     * @param listener the event listener (may not be <code>null</code>).
     * @param allowDuplicate the flag for determining if duplicate listener
     * objects are allowed to be registered.
     *
     * @throws NullPointerException if <code>listener</code> is <code>null</code>.
     * @since 3.5
     */
    public void addListener(final L listener, final boolean allowDuplicate) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14409);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14410);Validate.notNull(listener, "Listener object cannot be null.");
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14411);if ((((allowDuplicate)&&(__CLR4_5_2b3ub3ulvha7al4.R.iget(14412)!=0|true))||(__CLR4_5_2b3ub3ulvha7al4.R.iget(14413)==0&false))) {{
            __CLR4_5_2b3ub3ulvha7al4.R.inc(14414);listeners.add(listener);
        } }else {__CLR4_5_2b3ub3ulvha7al4.R.inc(14415);if ((((!listeners.contains(listener))&&(__CLR4_5_2b3ub3ulvha7al4.R.iget(14416)!=0|true))||(__CLR4_5_2b3ub3ulvha7al4.R.iget(14417)==0&false))) {{
            __CLR4_5_2b3ub3ulvha7al4.R.inc(14418);listeners.add(listener);
        }
    }}}finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Returns the number of registered listeners.
     *
     * @return the number of registered listeners.
     */
    int getListenerCount() {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14419);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14420);return listeners.size();
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Unregisters an event listener.
     *
     * @param listener the event listener (may not be <code>null</code>).
     *
     * @throws NullPointerException if <code>listener</code> is
     *         <code>null</code>.
     */
    public void removeListener(final L listener) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14421);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14422);Validate.notNull(listener, "Listener object cannot be null.");
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14423);listeners.remove(listener);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Get an array containing the currently registered listeners.
     * Modification to this array's elements will have no effect on the
     * {@link EventListenerSupport} instance.
     * @return L[]
     */
    public L[] getListeners() {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14424);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14425);return listeners.toArray(prototypeArray);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Serialize.
     * @param objectOutputStream the output stream
     * @throws IOException if an IO error occurs
     */
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14426);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14427);final ArrayList<L> serializableListeners = new ArrayList<>();

        // don't just rely on instanceof Serializable:
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14428);ObjectOutputStream testObjectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14429);for (final L listener : listeners) {{
            __CLR4_5_2b3ub3ulvha7al4.R.inc(14430);try {
                __CLR4_5_2b3ub3ulvha7al4.R.inc(14431);testObjectOutputStream.writeObject(listener);
                __CLR4_5_2b3ub3ulvha7al4.R.inc(14432);serializableListeners.add(listener);
            } catch (final IOException exception) {
                //recreate test stream in case of indeterminate state
                __CLR4_5_2b3ub3ulvha7al4.R.inc(14433);testObjectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        /*
         * we can reconstitute everything we need from an array of our listeners,
         * which has the additional advantage of typically requiring less storage than a list:
         */
        }__CLR4_5_2b3ub3ulvha7al4.R.inc(14434);objectOutputStream.writeObject(serializableListeners.toArray(prototypeArray));
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Deserialize.
     * @param objectInputStream the input stream
     * @throws IOException if an IO error occurs
     * @throws ClassNotFoundException if the class cannot be resolved
     */
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14435);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14436);@SuppressWarnings("unchecked") // Will throw CCE here if not correct
        final
        L[] srcListeners = (L[]) objectInputStream.readObject();

        __CLR4_5_2b3ub3ulvha7al4.R.inc(14437);this.listeners = new CopyOnWriteArrayList<>(srcListeners);

        __CLR4_5_2b3ub3ulvha7al4.R.inc(14438);@SuppressWarnings("unchecked") // Will throw CCE here if not correct
        final
        Class<L> listenerInterface = (Class<L>) srcListeners.getClass().getComponentType();

        __CLR4_5_2b3ub3ulvha7al4.R.inc(14439);initializeTransientFields(listenerInterface, Thread.currentThread().getContextClassLoader());
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Initialize transient fields.
     * @param listenerInterface the class of the listener interface
     * @param classLoader the class loader to be used
     */
    private void initializeTransientFields(final Class<L> listenerInterface, final ClassLoader classLoader) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14440);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14441);@SuppressWarnings("unchecked") // Will throw CCE here if not correct
        final
        L[] array = (L[]) Array.newInstance(listenerInterface, 0);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14442);this.prototypeArray = array;
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14443);createProxy(listenerInterface, classLoader);
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Create the proxy object.
     * @param listenerInterface the class of the listener interface
     * @param classLoader the class loader to be used
     */
    private void createProxy(final Class<L> listenerInterface, final ClassLoader classLoader) {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14444);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14445);proxy = listenerInterface.cast(Proxy.newProxyInstance(classLoader,
                new Class[] { listenerInterface }, createInvocationHandler()));
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * Create the {@link InvocationHandler} responsible for broadcasting calls
     * to the managed listeners.  Subclasses can override to provide custom behavior.
     * @return ProxyInvocationHandler
     */
    protected InvocationHandler createInvocationHandler() {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14446);
        __CLR4_5_2b3ub3ulvha7al4.R.inc(14447);return new ProxyInvocationHandler();
    }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}

    /**
     * An invocation handler used to dispatch the event(s) to all the listeners.
     */
    protected class ProxyInvocationHandler implements InvocationHandler {

        /**
         * Propagates the method call to all registered listeners in place of
         * the proxy listener object.
         *
         * @param unusedProxy the proxy object representing a listener on which the
         *        invocation was called; not used
         * @param method the listener method that will be called on all of the
         *        listeners.
         * @param args event arguments to propagate to the listeners.
         * @return the result of the method call
         * @throws Throwable if an error occurs
         */
        @Override
        public Object invoke(final Object unusedProxy, final Method method, final Object[] args) throws Throwable {try{__CLR4_5_2b3ub3ulvha7al4.R.inc(14448);
            __CLR4_5_2b3ub3ulvha7al4.R.inc(14449);for (final L listener : listeners) {{
                __CLR4_5_2b3ub3ulvha7al4.R.inc(14450);method.invoke(listener, args);
            }
            }__CLR4_5_2b3ub3ulvha7al4.R.inc(14451);return null;
        }finally{__CLR4_5_2b3ub3ulvha7al4.R.flushNeeded();}}
    }
}
