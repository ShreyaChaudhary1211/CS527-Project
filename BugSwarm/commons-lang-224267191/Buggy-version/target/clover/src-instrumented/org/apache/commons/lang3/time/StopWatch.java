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

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * <code>StopWatch</code> provides a convenient API for timings.
 * </p>
 * 
 * <p>
 * To start the watch, call {@link #start()} or {@link StopWatch#createStarted()}. At this point you can:
 * </p>
 * <ul>
 * <li>{@link #split()} the watch to get the time whilst the watch continues in the background. {@link #unsplit()} will
 * remove the effect of the split. At this point, these three options are available again.</li>
 * <li>{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch to continue. Any time between the
 * suspend and resume will not be counted in the total. At this point, these three options are available again.</li>
 * <li>{@link #stop()} the watch to complete the timing session.</li>
 * </ul>
 * 
 * <p>
 * It is intended that the output methods {@link #toString()} and {@link #getTime()} should only be called after stop,
 * split or suspend, however a suitable result will be returned at other points.
 * </p>
 * 
 * <p>
 * NOTE: As from v2.1, the methods protect against inappropriate calls. Thus you cannot now call stop before start,
 * resume before suspend or unsplit before split.
 * </p>
 * 
 * <p>
 * 1. split(), suspend(), or stop() cannot be invoked twice<br>
 * 2. unsplit() may only be called if the watch has been split()<br>
 * 3. resume() may only be called if the watch has been suspend()<br>
 * 4. start() cannot be called twice without calling reset()
 * </p>
 * 
 * <p>This class is not thread-safe</p>
 * 
 * @since 2.0
 */
public class StopWatch {public static class __CLR4_5_2i8ri8rlvha7cql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,23767,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long NANO_2_MILLIS = 1000000L;


    /**
     * Provides a started stopwatch for convenience.
     *
     * @return StopWatch a stopwatch that's already been started. 
     *
     * @since 3.5
     */
    public static StopWatch createStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23643);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23644);final StopWatch sw = new StopWatch();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23645);sw.start();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23646);return sw;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
    
    /**
     * Enumeration type which indicates the status of stopwatch.
     */
    private enum State {

        UNSTARTED {
            @Override boolean isStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23647); __CLR4_5_2i8ri8rlvha7cql.R.inc(23648);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isStopped() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23649); __CLR4_5_2i8ri8rlvha7cql.R.inc(23650);return true;  }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isSuspended() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23651); __CLR4_5_2i8ri8rlvha7cql.R.inc(23652);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
        },
        RUNNING {
            @Override boolean isStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23653); __CLR4_5_2i8ri8rlvha7cql.R.inc(23654);return true; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isStopped() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23655); __CLR4_5_2i8ri8rlvha7cql.R.inc(23656);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isSuspended() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23657); __CLR4_5_2i8ri8rlvha7cql.R.inc(23658);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
        },
        STOPPED {
            @Override boolean isStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23659); __CLR4_5_2i8ri8rlvha7cql.R.inc(23660);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isStopped() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23661); __CLR4_5_2i8ri8rlvha7cql.R.inc(23662);return true; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isSuspended() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23663); __CLR4_5_2i8ri8rlvha7cql.R.inc(23664);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
        },
        SUSPENDED {
            @Override boolean isStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23665); __CLR4_5_2i8ri8rlvha7cql.R.inc(23666);return true; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override boolean isStopped() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23667); __CLR4_5_2i8ri8rlvha7cql.R.inc(23668);return false; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
            @Override  boolean isSuspended() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23669); __CLR4_5_2i8ri8rlvha7cql.R.inc(23670);return true; }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
        };

        /**
         * <p>
         * The method is used to find out if the StopWatch is started. A suspended
         * StopWatch is also started watch.
         * </p>

         * @return boolean
         *             If the StopWatch is started.
         */
        abstract boolean isStarted();

        /**
         * <p>
         * This method is used to find out whether the StopWatch is stopped. The
         * stopwatch which's not yet started and explicitly stopped stopwatch is
         * considered as stopped.
         * </p>
         *
         * @return boolean
         *             If the StopWatch is stopped.
         */
        abstract boolean isStopped();

        /**
         * <p>
         * This method is used to find out whether the StopWatch is suspended.
         * </p>
         *
         * @return boolean
         *             If the StopWatch is suspended.
         */
        abstract boolean isSuspended();
    }

    /**
     * Enumeration type which indicates the split status of stopwatch.
     */    
    private enum SplitState {
        SPLIT,
        UNSPLIT
    }
    /**
     * The current running state of the StopWatch.
     */
    private State runningState = State.UNSTARTED;

    /**
     * Whether the stopwatch has a split time recorded.
     */
    private SplitState splitState = SplitState.UNSPLIT;

    /**
     * The start time.
     */
    private long startTime;

    /**
     * The start time in Millis - nanoTime is only for elapsed time so we 
     * need to also store the currentTimeMillis to maintain the old 
     * getStartTime API.
     */
    private long startTimeMillis;

    /**
     * The stop time.
     */
    private long stopTime;

    /**
     * <p>
     * Constructor.
     * </p>
     */
    public StopWatch() {
        super();__CLR4_5_2i8ri8rlvha7cql.R.inc(23672);try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23671);
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Start the stopwatch.
     * </p>
     * 
     * <p>
     * This method starts a new timing session, clearing any previous values.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is already running.
     */
    public void start() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23673);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23674);if ((((this.runningState == State.STOPPED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23675)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23676)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23677);throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23678);if ((((this.runningState != State.UNSTARTED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23679)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23680)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23681);throw new IllegalStateException("Stopwatch already started. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23682);this.startTime = System.nanoTime();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23683);this.startTimeMillis = System.currentTimeMillis();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23684);this.runningState = State.RUNNING;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}


    /**
     * <p>
     * Stop the stopwatch.
     * </p>
     * 
     * <p>
     * This method ends a new timing session, allowing the time to be retrieved.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not running.
     */
    public void stop() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23685);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23686);if ((((this.runningState != State.RUNNING && this.runningState != State.SUSPENDED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23687)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23688)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23689);throw new IllegalStateException("Stopwatch is not running. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23690);if ((((this.runningState == State.RUNNING)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23691)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23692)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23693);this.stopTime = System.nanoTime();
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23694);this.runningState = State.STOPPED;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Resets the stopwatch. Stops it if need be.
     * </p>
     * 
     * <p>
     * This method clears the internal values to allow the object to be reused.
     * </p>
     */
    public void reset() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23695);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23696);this.runningState = State.UNSTARTED;
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23697);this.splitState = SplitState.UNSPLIT;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Split the time.
     * </p>
     * 
     * <p>
     * This method sets the stop time of the watch to allow a time to be extracted. The start time is unaffected,
     * enabling {@link #unsplit()} to continue the timing from the original start point.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not running.
     */
    public void split() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23698);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23699);if ((((this.runningState != State.RUNNING)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23700)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23701)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23702);throw new IllegalStateException("Stopwatch is not running. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23703);this.stopTime = System.nanoTime();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23704);this.splitState = SplitState.SPLIT;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Remove a split.
     * </p>
     * 
     * <p>
     * This method clears the stop time. The start time is unaffected, enabling timing from the original start point to
     * continue.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not been split.
     */
    public void unsplit() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23705);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23706);if ((((this.splitState != SplitState.SPLIT)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23707)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23708)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23709);throw new IllegalStateException("Stopwatch has not been split. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23710);this.splitState = SplitState.UNSPLIT;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Suspend the stopwatch for later resumption.
     * </p>
     * 
     * <p>
     * This method suspends the watch until it is resumed. The watch will not include time between the suspend and
     * resume calls in the total time.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not currently running.
     */
    public void suspend() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23711);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23712);if ((((this.runningState != State.RUNNING)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23713)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23714)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23715);throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23716);this.stopTime = System.nanoTime();
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23717);this.runningState = State.SUSPENDED;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Resume the stopwatch after a suspend.
     * </p>
     * 
     * <p>
     * This method resumes the watch after it was suspended. The watch will not include time between the suspend and
     * resume calls in the total time.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not been suspended.
     */
    public void resume() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23718);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23719);if ((((this.runningState != State.SUSPENDED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23720)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23721)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23722);throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23723);this.startTime += System.nanoTime() - this.stopTime;
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23724);this.runningState = State.RUNNING;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Get the time on the stopwatch.
     * </p>
     * 
     * <p>
     * This is either the time between the start and the moment this method is called, or the amount of time between
     * start and stop.
     * </p>
     * 
     * @return the time in milliseconds
     */
    public long getTime() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23725);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23726);return getNanoTime() / NANO_2_MILLIS;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Get the time on the stopwatch in the specified TimeUnit.
     * </p>
     * 
     * <p>
     * This is either the time between the start and the moment this method is called, or the amount of time between
     * start and stop. The resulting time will be expressed in the desired TimeUnit with any remainder rounded down.
     * For example, if the specified unit is {@code TimeUnit.HOURS} and the stopwatch time is 59 minutes, then the
     * result returned will be {@code 0}.
     * </p>
     * 
     * @param timeUnit the unit of time, not null
     * @return the time in the specified TimeUnit, rounded down
     * @since 3.5
     */
    public long getTime(final TimeUnit timeUnit) {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23727);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23728);return timeUnit.convert(getNanoTime(), TimeUnit.NANOSECONDS);
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Get the time on the stopwatch in nanoseconds.
     * </p>
     * 
     * <p>
     * This is either the time between the start and the moment this method is called, or the amount of time between
     * start and stop.
     * </p>
     * 
     * @return the time in nanoseconds
     * @since 3.0
     */
    public long getNanoTime() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23729);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23730);if ((((this.runningState == State.STOPPED || this.runningState == State.SUSPENDED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23731)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23732)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23733);return this.stopTime - this.startTime;
        } }else {__CLR4_5_2i8ri8rlvha7cql.R.inc(23734);if ((((this.runningState == State.UNSTARTED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23735)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23736)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23737);return 0;
        } }else {__CLR4_5_2i8ri8rlvha7cql.R.inc(23738);if ((((this.runningState == State.RUNNING)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23739)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23740)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23741);return System.nanoTime() - this.startTime;
        }
        }}}__CLR4_5_2i8ri8rlvha7cql.R.inc(23742);throw new RuntimeException("Illegal running state has occurred.");
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Get the split time on the stopwatch.
     * </p>
     * 
     * <p>
     * This is the time between start and latest split.
     * </p>
     * 
     * @return the split time in milliseconds
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not yet been split.
     * @since 2.1
     */
    public long getSplitTime() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23743);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23744);return getSplitNanoTime() / NANO_2_MILLIS;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}
    /**
     * <p>
     * Get the split time on the stopwatch in nanoseconds.
     * </p>
     * 
     * <p>
     * This is the time between start and latest split.
     * </p>
     * 
     * @return the split time in nanoseconds
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not yet been split.
     * @since 3.0
     */
    public long getSplitNanoTime() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23745);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23746);if ((((this.splitState != SplitState.SPLIT)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23747)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23748)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23749);throw new IllegalStateException("Stopwatch must be split to get the split time. ");
        }
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23750);return this.stopTime - this.startTime;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * Returns the time this stopwatch was started.
     * 
     * @return the time this stopwatch was started
     * @throws IllegalStateException
     *             if this StopWatch has not been started
     * @since 2.4
     */
    public long getStartTime() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23751);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23752);if ((((this.runningState == State.UNSTARTED)&&(__CLR4_5_2i8ri8rlvha7cql.R.iget(23753)!=0|true))||(__CLR4_5_2i8ri8rlvha7cql.R.iget(23754)==0&false))) {{
            __CLR4_5_2i8ri8rlvha7cql.R.inc(23755);throw new IllegalStateException("Stopwatch has not been started");
        }
        // System.nanoTime is for elapsed time
        }__CLR4_5_2i8ri8rlvha7cql.R.inc(23756);return this.startTimeMillis;
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Gets a summary of the time that the stopwatch recorded as a string.
     * </p>
     * 
     * <p>
     * The format used is ISO 8601-like, <i>hours</i>:<i>minutes</i>:<i>seconds</i>.<i>milliseconds</i>.
     * </p>
     * 
     * @return the time as a String
     */
    @Override
    public String toString() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23757);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23758);return DurationFormatUtils.formatDurationHMS(getTime());
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * Gets a summary of the split time that the stopwatch recorded as a string.
     * </p>
     * 
     * <p>
     * The format used is ISO 8601-like, <i>hours</i>:<i>minutes</i>:<i>seconds</i>.<i>milliseconds</i>.
     * </p>
     * 
     * @return the split time as a String
     * @since 2.1
     */
    public String toSplitString() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23759);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23760);return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * The method is used to find out if the StopWatch is started. A suspended
     * StopWatch is also started watch.
     * </p>
     *
     * @return boolean
     *             If the StopWatch is started.
     * @since 3.2
     */
    public boolean isStarted() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23761);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23762);return runningState.isStarted();
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * This method is used to find out whether the StopWatch is suspended.
     * </p>
     *
     * @return boolean
     *             If the StopWatch is suspended.
     * @since 3.2
     */
    public boolean isSuspended() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23763);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23764);return runningState.isSuspended();
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}

    /**
     * <p>
     * This method is used to find out whether the StopWatch is stopped. The
     * stopwatch which's not yet started and explicitly stopped stopwatch is
     * considered as stopped.
     * </p>
     *
     * @return boolean
     *             If the StopWatch is stopped.
     * @since 3.2
     */
    public boolean isStopped() {try{__CLR4_5_2i8ri8rlvha7cql.R.inc(23765);
        __CLR4_5_2i8ri8rlvha7cql.R.inc(23766);return runningState.isStopped();
    }finally{__CLR4_5_2i8ri8rlvha7cql.R.flushNeeded();}}    

}
