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

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * A simple implementation of the <a
 * href="http://martinfowler.com/bliki/CircuitBreaker.html">Circuit Breaker</a> pattern
 * that counts specific events.
 * </p>
 * <p>
 * A <em>circuit breaker</em> can be used to protect an application against unreliable
 * services or unexpected load. A newly created {@code EventCountCircuitBreaker} object is
 * initially in state <em>closed</em> meaning that no problem has been detected. When the
 * application encounters specific events (like errors or service timeouts), it tells the
 * circuit breaker to increment an internal counter. If the number of events reported in a
 * specific time interval exceeds a configurable threshold, the circuit breaker changes
 * into state <em>open</em>. This means that there is a problem with the associated sub
 * system; the application should no longer call it, but give it some time to settle down.
 * The circuit breaker can be configured to switch back to <em>closed</em> state after a
 * certain time frame if the number of events received goes below a threshold.
 * </p>
 * <p>
 * When a {@code EventCountCircuitBreaker} object is constructed the following parameters
 * can be provided:
 * </p>
 * <ul>
 * <li>A threshold for the number of events that causes a state transition to
 * <em>open</em> state. If more events are received in the configured check interval, the
 * circuit breaker switches to <em>open</em> state.</li>
 * <li>The interval for checks whether the circuit breaker should open. So it is possible
 * to specify something like "The circuit breaker should open if more than 10 errors are
 * encountered in a minute."</li>
 * <li>The same parameters can be specified for automatically closing the circuit breaker
 * again, as in "If the number of requests goes down to 100 per minute, the circuit
 * breaker should close itself again". Depending on the use case, it may make sense to use
 * a slightly lower threshold for closing the circuit breaker than for opening it to avoid
 * continuously flipping when the number of events received is close to the threshold.</li>
 * </ul>
 * <p>
 * This class supports the following typical use cases:
 * </p>
 * <p>
 * <strong>Protecting against load peaks</strong>
 * </p>
 * <p>
 * Imagine you have a server which can handle a certain number of requests per minute.
 * Suddenly, the number of requests increases significantly - maybe because a connected
 * partner system is going mad or due to a denial of service attack. A
 * {@code EventCountCircuitBreaker} can be configured to stop the application from
 * processing requests when a sudden peak load is detected and to start request processing
 * again when things calm down. The following code fragment shows a typical example of
 * such a scenario. Here the {@code EventCountCircuitBreaker} allows up to 1000 requests
 * per minute before it interferes. When the load goes down again to 800 requests per
 * second it switches back to state <em>closed</em>:
 * </p>
 *
 * <pre>
 * EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(1000, 1, TimeUnit.MINUTE, 800);
 * ...
 * public void handleRequest(Request request) {
 *     if (breaker.incrementAndCheckState()) {
 *         // actually handle this request
 *     } else {
 *         // do something else, e.g. send an error code
 *     }
 * }
 * </pre>
 * <p>
 * <strong>Deal with an unreliable service</strong>
 * </p>
 * <p>
 * In this scenario, an application uses an external service which may fail from time to
 * time. If there are too many errors, the service is considered down and should not be
 * called for a while. This can be achieved using the following pattern - in this concrete
 * example we accept up to 5 errors in 2 minutes; if this limit is reached, the service is
 * given a rest time of 10 minutes:
 * </p>
 *
 * <pre>
 * EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(5, 2, TimeUnit.MINUTE, 5, 10, TimeUnit.MINUTE);
 * ...
 * public void handleRequest(Request request) {
 *     if (breaker.checkState()) {
 *         try {
 *             service.doSomething();
 *         } catch (ServiceException ex) {
 *             breaker.incrementAndCheckState();
 *         }
 *     } else {
 *         // return an error code, use an alternative service, etc.
 *     }
 * }
 * </pre>
 * <p>
 * In addition to automatic state transitions, the state of a circuit breaker can be
 * changed manually using the methods {@link #open()} and {@link #close()}. It is also
 * possible to register {@code PropertyChangeListener} objects that get notified whenever
 * a state transition occurs. This is useful, for instance to directly react on a freshly
 * detected error condition.
 * </p>
 * <p>
 * <em>Implementation notes:</em>
 * </p>
 * <ul>
 * <li>This implementation uses non-blocking algorithms to update the internal counter and
 * state. This should be pretty efficient if there is not too much contention.</li>
 * <li>This implementation is not intended to operate as a high-precision timer in very
 * short check intervals. It is deliberately kept simple to avoid complex and
 * time-consuming state checks. It should work well in time intervals from a few seconds
 * up to minutes and longer. If the intervals become too short, there might be race
 * conditions causing spurious state transitions.</li>
 * <li>The handling of check intervals is a bit simplistic. Therefore, there is no
 * guarantee that the circuit breaker is triggered at a specific point in time; there may
 * be some delay (less than a check interval).</li>
 * </ul>
 * @since 3.5
 */
public class EventCountCircuitBreaker extends AbstractCircuitBreaker<Integer> {public static class __CLR4_5_2auzauzlvha7ahu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** A map for accessing the strategy objects for the different states. */
    private static final Map<State, StateStrategy> STRATEGY_MAP = createStrategyMap();

    /** Stores information about the current check interval. */
    private final AtomicReference<CheckIntervalData> checkIntervalData;

    /** The threshold for opening the circuit breaker. */
    private final int openingThreshold;

    /** The time interval for opening the circuit breaker. */
    private final long openingInterval;

    /** The threshold for closing the circuit breaker. */
    private final int closingThreshold;

    /** The time interval for closing the circuit breaker. */
    private final long closingInterval;

    /**
     * Creates a new instance of {@code EventCountCircuitBreaker} and initializes all properties for
     * opening and closing it based on threshold values for events occurring in specific
     * intervals.
     *
     * @param openingThreshold the threshold for opening the circuit breaker; if this
     * number of events is received in the time span determined by the opening interval,
     * the circuit breaker is opened
     * @param openingInterval the interval for opening the circuit breaker
     * @param openingUnit the {@code TimeUnit} defining the opening interval
     * @param closingThreshold the threshold for closing the circuit breaker; if the
     * number of events received in the time span determined by the closing interval goes
     * below this threshold, the circuit breaker is closed again
     * @param closingInterval the interval for closing the circuit breaker
     * @param closingUnit the {@code TimeUnit} defining the closing interval
     */
    public EventCountCircuitBreaker(final int openingThreshold, final long openingInterval,
                                    final TimeUnit openingUnit, final int closingThreshold, final long closingInterval,
                                    final TimeUnit closingUnit) {
        super();__CLR4_5_2auzauzlvha7ahu.R.inc(14076);try{__CLR4_5_2auzauzlvha7ahu.R.inc(14075);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14077);checkIntervalData = new AtomicReference<>(new CheckIntervalData(0, 0));
        __CLR4_5_2auzauzlvha7ahu.R.inc(14078);this.openingThreshold = openingThreshold;
        __CLR4_5_2auzauzlvha7ahu.R.inc(14079);this.openingInterval = openingUnit.toNanos(openingInterval);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14080);this.closingThreshold = closingThreshold;
        __CLR4_5_2auzauzlvha7ahu.R.inc(14081);this.closingInterval = closingUnit.toNanos(closingInterval);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code EventCountCircuitBreaker} with the same interval for opening
     * and closing checks.
     *
     * @param openingThreshold the threshold for opening the circuit breaker; if this
     * number of events is received in the time span determined by the check interval, the
     * circuit breaker is opened
     * @param checkInterval the check interval for opening or closing the circuit breaker
     * @param checkUnit the {@code TimeUnit} defining the check interval
     * @param closingThreshold the threshold for closing the circuit breaker; if the
     * number of events received in the time span determined by the check interval goes
     * below this threshold, the circuit breaker is closed again
     */
    public EventCountCircuitBreaker(final int openingThreshold, final long checkInterval, final TimeUnit checkUnit,
                                    final int closingThreshold) {
        this(openingThreshold, checkInterval, checkUnit, closingThreshold, checkInterval,
                checkUnit);__CLR4_5_2auzauzlvha7ahu.R.inc(14083);try{__CLR4_5_2auzauzlvha7ahu.R.inc(14082);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code EventCountCircuitBreaker} which uses the same parameters for
     * opening and closing checks.
     *
     * @param threshold the threshold for changing the status of the circuit breaker; if
     * the number of events received in a check interval is greater than this value, the
     * circuit breaker is opened; if it is lower than this value, it is closed again
     * @param checkInterval the check interval for opening or closing the circuit breaker
     * @param checkUnit the {@code TimeUnit} defining the check interval
     */
    public EventCountCircuitBreaker(final int threshold, final long checkInterval, final TimeUnit checkUnit) {
        this(threshold, checkInterval, checkUnit, threshold);__CLR4_5_2auzauzlvha7ahu.R.inc(14085);try{__CLR4_5_2auzauzlvha7ahu.R.inc(14084);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the threshold value for opening the circuit breaker. If this number of
     * events is received in the time span determined by the opening interval, the circuit
     * breaker is opened.
     *
     * @return the opening threshold
     */
    public int getOpeningThreshold() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14086);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14087);return openingThreshold;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the interval (in nanoseconds) for checking for the opening threshold.
     *
     * @return the opening check interval
     */
    public long getOpeningInterval() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14088);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14089);return openingInterval;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the threshold value for closing the circuit breaker. If the number of
     * events received in the time span determined by the closing interval goes below this
     * threshold, the circuit breaker is closed again.
     *
     * @return the closing threshold
     */
    public int getClosingThreshold() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14090);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14091);return closingThreshold;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the interval (in nanoseconds) for checking for the closing threshold.
     *
     * @return the opening check interval
     */
    public long getClosingInterval() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14092);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14093);return closingInterval;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * {@inheritDoc} This implementation checks the internal event counter against the
     * threshold values and the check intervals. This may cause a state change of this
     * circuit breaker.
     */
    @Override
    public boolean checkState() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14094);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14095);return performStateCheck(0);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean incrementAndCheckState(final Integer increment)
            throws CircuitBreakingException {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14096);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14097);return performStateCheck(1);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Increments the monitored value by <strong>1</strong> and performs a check of the current state of this
     * circuit breaker. This method works like {@link #checkState()}, but the monitored
     * value is incremented before the state check is performed.
     *
     * @return <strong>true</strong> if the circuit breaker is now closed;
     * <strong>false</strong> otherwise
     */
    public boolean incrementAndCheckState() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14098);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14099);return incrementAndCheckState(1);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * {@inheritDoc} This circuit breaker may close itself again if the number of events
     * received during a check interval goes below the closing threshold. If this circuit
     * breaker is already open, this method has no effect, except that a new check
     * interval is started.
     */
    @Override
    public void open() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14100);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14101);super.open();
        __CLR4_5_2auzauzlvha7ahu.R.inc(14102);checkIntervalData.set(new CheckIntervalData(0, now()));
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * {@inheritDoc} A new check interval is started. If too many events are received in
     * this interval, the circuit breaker changes again to state open. If this circuit
     * breaker is already closed, this method has no effect, except that a new check
     * interval is started.
     */
    @Override
    public void close() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14103);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14104);super.close();
        __CLR4_5_2auzauzlvha7ahu.R.inc(14105);checkIntervalData.set(new CheckIntervalData(0, now()));
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Actually checks the state of this circuit breaker and executes a state transition
     * if necessary.
     *
     * @param increment the increment for the internal counter
     * @return a flag whether the circuit breaker is now closed
     */
    private boolean performStateCheck(final int increment) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14106);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14107);CheckIntervalData currentData;
        __CLR4_5_2auzauzlvha7ahu.R.inc(14108);CheckIntervalData nextData;
        __CLR4_5_2auzauzlvha7ahu.R.inc(14109);State currentState;

        __CLR4_5_2auzauzlvha7ahu.R.inc(14110);do {{
            __CLR4_5_2auzauzlvha7ahu.R.inc(14111);final long time = now();
            __CLR4_5_2auzauzlvha7ahu.R.inc(14112);currentState = state.get();
            __CLR4_5_2auzauzlvha7ahu.R.inc(14113);currentData = checkIntervalData.get();
            __CLR4_5_2auzauzlvha7ahu.R.inc(14114);nextData = nextCheckIntervalData(increment, currentData, currentState, time);
        } }while ((((!updateCheckIntervalData(currentData, nextData))&&(__CLR4_5_2auzauzlvha7ahu.R.iget(14115)!=0|true))||(__CLR4_5_2auzauzlvha7ahu.R.iget(14116)==0&false)));

        // This might cause a race condition if other changes happen in between!
        // Refer to the header comment!
        __CLR4_5_2auzauzlvha7ahu.R.inc(14117);if ((((stateStrategy(currentState).isStateTransition(this, currentData, nextData))&&(__CLR4_5_2auzauzlvha7ahu.R.iget(14118)!=0|true))||(__CLR4_5_2auzauzlvha7ahu.R.iget(14119)==0&false))) {{
            __CLR4_5_2auzauzlvha7ahu.R.inc(14120);currentState = currentState.oppositeState();
            __CLR4_5_2auzauzlvha7ahu.R.inc(14121);changeStateAndStartNewCheckInterval(currentState);
        }
        }__CLR4_5_2auzauzlvha7ahu.R.inc(14122);return !isOpen(currentState);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Updates the {@code CheckIntervalData} object. The current data object is replaced
     * by the one modified by the last check. The return value indicates whether this was
     * successful. If it is <strong>false</strong>, another thread interfered, and the
     * whole operation has to be redone.
     *
     * @param currentData the current check data object
     * @param nextData the replacing check data object
     * @return a flag whether the update was successful
     */
    private boolean updateCheckIntervalData(final CheckIntervalData currentData,
            final CheckIntervalData nextData) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14123);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14124);return currentData == nextData
                || checkIntervalData.compareAndSet(currentData, nextData);
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Changes the state of this circuit breaker and also initializes a new
     * {@code CheckIntervalData} object.
     *
     * @param newState the new state to be set
     */
    private void changeStateAndStartNewCheckInterval(final State newState) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14125);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14126);changeState(newState);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14127);checkIntervalData.set(new CheckIntervalData(0, now()));
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Calculates the next {@code CheckIntervalData} object based on the current data and
     * the current state. The next data object takes the counter increment and the current
     * time into account.
     *
     * @param increment the increment for the internal counter
     * @param currentData the current check data object
     * @param currentState the current state of the circuit breaker
     * @param time the current time
     * @return the updated {@code CheckIntervalData} object
     */
    private CheckIntervalData nextCheckIntervalData(final int increment,
            final CheckIntervalData currentData, final State currentState, final long time) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14128);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14129);CheckIntervalData nextData;
        __CLR4_5_2auzauzlvha7ahu.R.inc(14130);if ((((stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time))&&(__CLR4_5_2auzauzlvha7ahu.R.iget(14131)!=0|true))||(__CLR4_5_2auzauzlvha7ahu.R.iget(14132)==0&false))) {{
            __CLR4_5_2auzauzlvha7ahu.R.inc(14133);nextData = new CheckIntervalData(increment, time);
        } }else {{
            __CLR4_5_2auzauzlvha7ahu.R.inc(14134);nextData = currentData.increment(increment);
        }
        }__CLR4_5_2auzauzlvha7ahu.R.inc(14135);return nextData;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the current time in nanoseconds. This method is used to obtain the current
     * time. This is needed to calculate the check intervals correctly.
     *
     * @return the current time in nanoseconds
     */
    long now() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14136);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14137);return System.nanoTime();
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Returns the {@code StateStrategy} object responsible for the given state.
     *
     * @param state the state
     * @return the corresponding {@code StateStrategy}
     * @throws CircuitBreakingException if the strategy cannot be resolved
     */
    private static StateStrategy stateStrategy(final State state) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14138);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14139);final StateStrategy strategy = STRATEGY_MAP.get(state);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14140);return strategy;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * Creates the map with strategy objects. It allows access for a strategy for a given
     * state.
     *
     * @return the strategy map
     */
    private static Map<State, StateStrategy> createStrategyMap() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14141);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14142);final Map<State, StateStrategy> map = new EnumMap<>(State.class);
        __CLR4_5_2auzauzlvha7ahu.R.inc(14143);map.put(State.CLOSED, new StateStrategyClosed());
        __CLR4_5_2auzauzlvha7ahu.R.inc(14144);map.put(State.OPEN, new StateStrategyOpen());
        __CLR4_5_2auzauzlvha7ahu.R.inc(14145);return map;
    }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

    /**
     * An internally used data class holding information about the checks performed by
     * this class. Basically, the number of received events and the start time of the
     * current check interval are stored.
     */
    private static class CheckIntervalData {
        /** The counter for events. */
        private final int eventCount;

        /** The start time of the current check interval. */
        private final long checkIntervalStart;

        /**
         * Creates a new instance of {@code CheckIntervalData}.
         *
         * @param count the current count value
         * @param intervalStart the start time of the check interval
         */
        public CheckIntervalData(final int count, final long intervalStart) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14146);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14147);eventCount = count;
            __CLR4_5_2auzauzlvha7ahu.R.inc(14148);checkIntervalStart = intervalStart;
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * Returns the event counter.
         *
         * @return the number of received events
         */
        public int getEventCount() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14149);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14150);return eventCount;
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * Returns the start time of the current check interval.
         *
         * @return the check interval start time
         */
        public long getCheckIntervalStart() {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14151);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14152);return checkIntervalStart;
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * Returns a new instance of {@code CheckIntervalData} with the event counter
         * incremented by the given delta. If the delta is 0, this object is returned.
         *
         * @param delta the delta
         * @return the updated instance
         */
        public CheckIntervalData increment(final int delta) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14153);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14154);return ((((delta != 0) )&&(__CLR4_5_2auzauzlvha7ahu.R.iget(14155)!=0|true))||(__CLR4_5_2auzauzlvha7ahu.R.iget(14156)==0&false))? new CheckIntervalData(getEventCount() + delta,
                    getCheckIntervalStart()) : this;
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}
    }

    /**
     * Internally used class for executing check logic based on the current state of the
     * circuit breaker. Having this logic extracted into special classes avoids complex
     * if-then-else cascades.
     */
    private abstract static class StateStrategy {
        /**
         * Returns a flag whether the end of the current check interval is reached.
         *
         * @param breaker the {@code CircuitBreaker}
         * @param currentData the current state object
         * @param now the current time
         * @return a flag whether the end of the current check interval is reached
         */
        public boolean isCheckIntervalFinished(final EventCountCircuitBreaker breaker,
                final CheckIntervalData currentData, final long now) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14157);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14158);return now - currentData.getCheckIntervalStart() > fetchCheckInterval(breaker);
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * Checks whether the specified {@code CheckIntervalData} objects indicate that a
         * state transition should occur. Here the logic which checks for thresholds
         * depending on the current state is implemented.
         *
         * @param breaker the {@code CircuitBreaker}
         * @param currentData the current {@code CheckIntervalData} object
         * @param nextData the updated {@code CheckIntervalData} object
         * @return a flag whether a state transition should be performed
         */
        public abstract boolean isStateTransition(EventCountCircuitBreaker breaker,
                CheckIntervalData currentData, CheckIntervalData nextData);

        /**
         * Obtains the check interval to applied for the represented state from the given
         * {@code CircuitBreaker}.
         *
         * @param breaker the {@code CircuitBreaker}
         * @return the check interval to be applied
         */
        protected abstract long fetchCheckInterval(EventCountCircuitBreaker breaker);
    }

    /**
     * A specialized {@code StateStrategy} implementation for the state closed.
     */
    private static class StateStrategyClosed extends StateStrategy {

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isStateTransition(final EventCountCircuitBreaker breaker,
                final CheckIntervalData currentData, final CheckIntervalData nextData) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14159);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14160);return nextData.getEventCount() > breaker.getOpeningThreshold();
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected long fetchCheckInterval(final EventCountCircuitBreaker breaker) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14161);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14162);return breaker.getOpeningInterval();
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}
    }

    /**
     * A specialized {@code StateStrategy} implementation for the state open.
     */
    private static class StateStrategyOpen extends StateStrategy {
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean isStateTransition(final EventCountCircuitBreaker breaker,
                final CheckIntervalData currentData, final CheckIntervalData nextData) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14163);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14164);return nextData.getCheckIntervalStart() != currentData
                    .getCheckIntervalStart()
                    && currentData.getEventCount() < breaker.getClosingThreshold();
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected long fetchCheckInterval(final EventCountCircuitBreaker breaker) {try{__CLR4_5_2auzauzlvha7ahu.R.inc(14165);
            __CLR4_5_2auzauzlvha7ahu.R.inc(14166);return breaker.getClosingInterval();
        }finally{__CLR4_5_2auzauzlvha7ahu.R.flushNeeded();}}
    }

}
