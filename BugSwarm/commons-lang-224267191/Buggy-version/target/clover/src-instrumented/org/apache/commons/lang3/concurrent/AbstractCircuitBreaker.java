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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Base class for circuit breakers.
 *
 * @param <T> the type of the value monitored by this circuit breaker
 * @since 3.5
 */
public abstract class AbstractCircuitBreaker<T> implements CircuitBreaker<T> {public static class __CLR4_5_2am7am7lvha7aff{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,13784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The name of the <em>open</em> property as it is passed to registered
     * change listeners.
     */
    public static final String PROPERTY_NAME = "open";

    /** The current state of this circuit breaker. */
    protected final AtomicReference<State> state = new AtomicReference<>(State.CLOSED);

    /** An object for managing change listeners registered at this instance. */
    private final PropertyChangeSupport changeSupport;

    /**
     * Creates an {@code AbstractCircuitBreaker}. It also creates an internal {@code PropertyChangeSupport}.
     */
    public AbstractCircuitBreaker() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13759);
        __CLR4_5_2am7am7lvha7aff.R.inc(13760);changeSupport = new PropertyChangeSupport(this);
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isOpen() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13761);
        __CLR4_5_2am7am7lvha7aff.R.inc(13762);return isOpen(state.get());
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isClosed() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13763);
        __CLR4_5_2am7am7lvha7aff.R.inc(13764);return !isOpen();
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract boolean checkState();

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract boolean incrementAndCheckState(T increment);

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13765);
        __CLR4_5_2am7am7lvha7aff.R.inc(13766);changeState(State.CLOSED);
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public void open() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13767);
        __CLR4_5_2am7am7lvha7aff.R.inc(13768);changeState(State.OPEN);
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * Converts the given state value to a boolean <em>open</em> property.
     *
     * @param state the state to be converted
     * @return the boolean open flag
     */
    protected static boolean isOpen(final State state) {try{__CLR4_5_2am7am7lvha7aff.R.inc(13769);
        __CLR4_5_2am7am7lvha7aff.R.inc(13770);return state == State.OPEN;
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * Changes the internal state of this circuit breaker. If there is actually a change
     * of the state value, all registered change listeners are notified.
     *
     * @param newState the new state to be set
     */
    protected void changeState(final State newState) {try{__CLR4_5_2am7am7lvha7aff.R.inc(13771);
        __CLR4_5_2am7am7lvha7aff.R.inc(13772);if ((((state.compareAndSet(newState.oppositeState(), newState))&&(__CLR4_5_2am7am7lvha7aff.R.iget(13773)!=0|true))||(__CLR4_5_2am7am7lvha7aff.R.iget(13774)==0&false))) {{
            __CLR4_5_2am7am7lvha7aff.R.inc(13775);changeSupport.firePropertyChange(PROPERTY_NAME, !isOpen(newState), isOpen(newState));
        }
    }}finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * Adds a change listener to this circuit breaker. This listener is notified whenever
     * the state of this circuit breaker changes. If the listener is
     * <strong>null</strong>, it is silently ignored.
     *
     * @param listener the listener to be added
     */
    public void addChangeListener(final PropertyChangeListener listener) {try{__CLR4_5_2am7am7lvha7aff.R.inc(13776);
        __CLR4_5_2am7am7lvha7aff.R.inc(13777);changeSupport.addPropertyChangeListener(listener);
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * Removes the specified change listener from this circuit breaker.
     *
     * @param listener the listener to be removed
     */
    public void removeChangeListener(final PropertyChangeListener listener) {try{__CLR4_5_2am7am7lvha7aff.R.inc(13778);
        __CLR4_5_2am7am7lvha7aff.R.inc(13779);changeSupport.removePropertyChangeListener(listener);
    }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}

    /**
     * An internal enumeration representing the different states of a circuit
     * breaker. This class also contains some logic for performing state
     * transitions. This is done to avoid complex if-conditions in the code of
     * {@code CircuitBreaker}.
     */
    protected static enum State {
        CLOSED {
            /**
             * {@inheritDoc}
             */
            @Override
            public State oppositeState() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13780);
                __CLR4_5_2am7am7lvha7aff.R.inc(13781);return OPEN;
            }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}
        },

        OPEN {
            /**
             * {@inheritDoc}
             */
            @Override
            public State oppositeState() {try{__CLR4_5_2am7am7lvha7aff.R.inc(13782);
                __CLR4_5_2am7am7lvha7aff.R.inc(13783);return CLOSED;
            }finally{__CLR4_5_2am7am7lvha7aff.R.flushNeeded();}}
        };

        /**
         * Returns the opposite state to the represented state. This is useful
         * for flipping the current state.
         *
         * @return the opposite state
         */
        public abstract State oppositeState();
    }

}
