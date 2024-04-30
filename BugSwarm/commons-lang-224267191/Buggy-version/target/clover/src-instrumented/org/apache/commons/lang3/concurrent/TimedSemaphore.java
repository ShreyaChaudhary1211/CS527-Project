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

import org.apache.commons.lang3.Validate;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * A specialized <em>semaphore</em> implementation that provides a number of
 * permits in a given time frame.
 * </p>
 * <p>
 * This class is similar to the {@code java.util.concurrent.Semaphore} class
 * provided by the JDK in that it manages a configurable number of permits.
 * Using the {@link #acquire()} method a permit can be requested by a thread.
 * However, there is an additional timing dimension: there is no {@code
 * release()} method for freeing a permit, but all permits are automatically
 * released at the end of a configurable time frame. If a thread calls
 * {@link #acquire()} and the available permits are already exhausted for this
 * time frame, the thread is blocked. When the time frame ends all permits
 * requested so far are restored, and blocking threads are waked up again, so
 * that they can try to acquire a new permit. This basically means that in the
 * specified time frame only the given number of operations is possible.
 * </p>
 * <p>
 * A use case for this class is to artificially limit the load produced by a
 * process. As an example consider an application that issues database queries
 * on a production system in a background process to gather statistical
 * information. This background processing should not produce so much database
 * load that the functionality and the performance of the production system are
 * impacted. Here a {@code TimedSemaphore} could be installed to guarantee that
 * only a given number of database queries are issued per second.
 * </p>
 * <p>
 * A thread class for performing database queries could look as follows:
 * </p>
 *
 * <pre>
 * public class StatisticsThread extends Thread {
 *     // The semaphore for limiting database load.
 *     private final TimedSemaphore semaphore;
 *     // Create an instance and set the semaphore
 *     public StatisticsThread(TimedSemaphore timedSemaphore) {
 *         semaphore = timedSemaphore;
 *     }
 *     // Gather statistics
 *     public void run() {
 *         try {
 *             while(true) {
 *                 semaphore.acquire();   // limit database load
 *                 performQuery();        // issue a query
 *             }
 *         } catch(InterruptedException) {
 *             // fall through
 *         }
 *     }
 *     ...
 * }
 * </pre>
 *
 * <p>
 * The following code fragment shows how a {@code TimedSemaphore} is created
 * that allows only 10 operations per second and passed to the statistics
 * thread:
 * </p>
 *
 * <pre>
 * TimedSemaphore sem = new TimedSemaphore(1, TimeUnit.SECOND, 10);
 * StatisticsThread thread = new StatisticsThread(sem);
 * thread.start();
 * </pre>
 *
 * <p>
 * When creating an instance the time period for the semaphore must be
 * specified. {@code TimedSemaphore} uses an executor service with a
 * corresponding period to monitor this interval. The {@code
 * ScheduledExecutorService} to be used for this purpose can be provided at
 * construction time. Alternatively the class creates an internal executor
 * service.
 * </p>
 * <p>
 * Client code that uses {@code TimedSemaphore} has to call the
 * {@link #acquire()} method in each processing step. {@code TimedSemaphore}
 * keeps track of the number of invocations of the {@link #acquire()} method and
 * blocks the calling thread if the counter exceeds the limit specified. When
 * the timer signals the end of the time period the counter is reset and all
 * waiting threads are released. Then another cycle can start.
 * </p>
 * <p>
 * An alternative to {@code acquire()} is the {@link #tryAcquire()} method. This
 * method checks whether the semaphore is under the specified limit and
 * increases the internal counter if this is the case. The return value is then
 * <strong>true</strong>, and the calling thread can continue with its action.
 * If the semaphore is already at its limit, {@code tryAcquire()} immediately
 * returns <strong>false</strong> without blocking; the calling thread must
 * then abort its action. This usage scenario prevents blocking of threads.
 * </p>
 * <p>
 * It is possible to modify the limit at any time using the
 * {@link #setLimit(int)} method. This is useful if the load produced by an
 * operation has to be adapted dynamically. In the example scenario with the
 * thread collecting statistics it may make sense to specify a low limit during
 * day time while allowing a higher load in the night time. Reducing the limit
 * takes effect immediately by blocking incoming callers. If the limit is
 * increased, waiting threads are not released immediately, but wake up when the
 * timer runs out. Then, in the next period more processing steps can be
 * performed without blocking. By setting the limit to 0 the semaphore can be
 * switched off: in this mode the {@link #acquire()} method never blocks, but
 * lets all callers pass directly.
 * </p>
 * <p>
 * When the {@code TimedSemaphore} is no more needed its {@link #shutdown()}
 * method should be called. This causes the periodic task that monitors the time
 * interval to be canceled. If the {@code ScheduledExecutorService} has been
 * created by the semaphore at construction time, it is also shut down.
 * resources. After that {@link #acquire()} must not be called any more.
 * </p>
 *
 * @since 3.0
 */
public class TimedSemaphore {public static class __CLR4_5_2b1ab1alvha7ajx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Constant for a value representing no limit. If the limit is set to a
     * value less or equal this constant, the {@code TimedSemaphore} will be
     * effectively switched off.
     */
    public static final int NO_LIMIT = 0;

    /** Constant for the thread pool size for the executor. */
    private static final int THREAD_POOL_SIZE = 1;

    /** The executor service for managing the timer thread. */
    private final ScheduledExecutorService executorService;

    /** Stores the period for this timed semaphore. */
    private final long period;

    /** The time unit for the period. */
    private final TimeUnit unit;

    /** A flag whether the executor service was created by this object. */
    private final boolean ownExecutor;

    /** A future object representing the timer task. */
    private ScheduledFuture<?> task; // @GuardedBy("this")

    /** Stores the total number of invocations of the acquire() method. */
    private long totalAcquireCount; // @GuardedBy("this")

    /**
     * The counter for the periods. This counter is increased every time a
     * period ends.
     */
    private long periodCount; // @GuardedBy("this")

    /** The limit. */
    private int limit; // @GuardedBy("this")

    /** The current counter. */
    private int acquireCount;  // @GuardedBy("this")

    /** The number of invocations of acquire() in the last period. */
    private int lastCallsPerPeriod; // @GuardedBy("this")

    /** A flag whether shutdown() was called. */
    private boolean shutdown;  // @GuardedBy("this")

    /**
     * Creates a new instance of {@link TimedSemaphore} and initializes it with
     * the given time period and the limit.
     *
     * @param timePeriod the time period
     * @param timeUnit the unit for the period
     * @param limit the limit for the semaphore
     * @throws IllegalArgumentException if the period is less or equals 0
     */
    public TimedSemaphore(final long timePeriod, final TimeUnit timeUnit, final int limit) {
        this(null, timePeriod, timeUnit, limit);__CLR4_5_2b1ab1alvha7ajx.R.inc(14303);try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14302);
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Creates a new instance of {@link TimedSemaphore} and initializes it with
     * an executor service, the given time period, and the limit. The executor
     * service will be used for creating a periodic task for monitoring the time
     * period. It can be <b>null</b>, then a default service will be created.
     *
     * @param service the executor service
     * @param timePeriod the time period
     * @param timeUnit the unit for the period
     * @param limit the limit for the semaphore
     * @throws IllegalArgumentException if the period is less or equals 0
     */
    public TimedSemaphore(final ScheduledExecutorService service, final long timePeriod,
            final TimeUnit timeUnit, final int limit) {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14304);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14305);Validate.inclusiveBetween(1, Long.MAX_VALUE, timePeriod, "Time period must be greater than 0!");

        __CLR4_5_2b1ab1alvha7ajx.R.inc(14306);period = timePeriod;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14307);unit = timeUnit;

        __CLR4_5_2b1ab1alvha7ajx.R.inc(14308);if ((((service != null)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14309)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14310)==0&false))) {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14311);executorService = service;
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14312);ownExecutor = false;
        } }else {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14313);final ScheduledThreadPoolExecutor s = new ScheduledThreadPoolExecutor(
                    THREAD_POOL_SIZE);
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14314);s.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14315);s.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14316);executorService = s;
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14317);ownExecutor = true;
        }

        }__CLR4_5_2b1ab1alvha7ajx.R.inc(14318);setLimit(limit);
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the limit enforced by this semaphore. The limit determines how
     * many invocations of {@link #acquire()} are allowed within the monitored
     * period.
     *
     * @return the limit
     */
    public final synchronized int getLimit() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14319);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14320);return limit;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Sets the limit. This is the number of times the {@link #acquire()} method
     * can be called within the time period specified. If this limit is reached,
     * further invocations of {@link #acquire()} will block. Setting the limit
     * to a value &lt;= {@link #NO_LIMIT} will cause the limit to be disabled,
     * i.e. an arbitrary number of{@link #acquire()} invocations is allowed in
     * the time period.
     *
     * @param limit the limit
     */
    public final synchronized void setLimit(final int limit) {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14321);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14322);this.limit = limit;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Initializes a shutdown. After that the object cannot be used any more.
     * This method can be invoked an arbitrary number of times. All invocations
     * after the first one do not have any effect.
     */
    public synchronized void shutdown() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14323);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14324);if ((((!shutdown)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14325)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14326)==0&false))) {{

            __CLR4_5_2b1ab1alvha7ajx.R.inc(14327);if ((((ownExecutor)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14328)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14329)==0&false))) {{
                // if the executor was created by this instance, it has
                // to be shutdown
                __CLR4_5_2b1ab1alvha7ajx.R.inc(14330);getExecutorService().shutdownNow();
            }
            }__CLR4_5_2b1ab1alvha7ajx.R.inc(14331);if ((((task != null)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14332)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14333)==0&false))) {{
                __CLR4_5_2b1ab1alvha7ajx.R.inc(14334);task.cancel(false);
            }

            }__CLR4_5_2b1ab1alvha7ajx.R.inc(14335);shutdown = true;
        }
    }}finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Tests whether the {@link #shutdown()} method has been called on this
     * object. If this method returns <b>true</b>, this instance cannot be used
     * any longer.
     *
     * @return a flag whether a shutdown has been performed
     */
    public synchronized boolean isShutdown() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14336);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14337);return shutdown;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Acquires a permit from this semaphore. This method will block if
     * the limit for the current period has already been reached. If
     * {@link #shutdown()} has already been invoked, calling this method will
     * cause an exception. The very first call of this method starts the timer
     * task which monitors the time period set for this {@code TimedSemaphore}.
     * From now on the semaphore is active.
     *
     * @throws InterruptedException if the thread gets interrupted
     * @throws IllegalStateException if this semaphore is already shut down
     */
    public synchronized void acquire() throws InterruptedException {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14338);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14339);prepareAcquire();

        __CLR4_5_2b1ab1alvha7ajx.R.inc(14340);boolean canPass;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14341);do {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14342);canPass = acquirePermit();
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14343);if ((((!canPass)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14344)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14345)==0&false))) {{
                __CLR4_5_2b1ab1alvha7ajx.R.inc(14346);wait();
            }
        }} }while ((((!canPass)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14347)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14348)==0&false)));
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Tries to acquire a permit from this semaphore. If the limit of this semaphore has
     * not yet been reached, a permit is acquired, and this method returns
     * <strong>true</strong>. Otherwise, this method returns immediately with the result
     * <strong>false</strong>.
     *
     * @return <strong>true</strong> if a permit could be acquired; <strong>false</strong>
     * otherwise
     * @throws IllegalStateException if this semaphore is already shut down
     * @since 3.5
     */
    public synchronized boolean tryAcquire() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14349);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14350);prepareAcquire();
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14351);return acquirePermit();
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the number of (successful) acquire invocations during the last
     * period. This is the number of times the {@link #acquire()} method was
     * called without blocking. This can be useful for testing or debugging
     * purposes or to determine a meaningful threshold value. If a limit is set,
     * the value returned by this method won't be greater than this limit.
     *
     * @return the number of non-blocking invocations of the {@link #acquire()}
     * method
     */
    public synchronized int getLastAcquiresPerPeriod() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14352);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14353);return lastCallsPerPeriod;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the number of invocations of the {@link #acquire()} method for
     * the current period. This may be useful for testing or debugging purposes.
     *
     * @return the current number of {@link #acquire()} invocations
     */
    public synchronized int getAcquireCount() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14354);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14355);return acquireCount;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the number of calls to the {@link #acquire()} method that can
     * still be performed in the current period without blocking. This method
     * can give an indication whether it is safe to call the {@link #acquire()}
     * method without risking to be suspended. However, there is no guarantee
     * that a subsequent call to {@link #acquire()} actually is not-blocking
     * because in the mean time other threads may have invoked the semaphore.
     *
     * @return the current number of available {@link #acquire()} calls in the
     * current period
     */
    public synchronized int getAvailablePermits() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14356);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14357);return getLimit() - getAcquireCount();
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the average number of successful (i.e. non-blocking)
     * {@link #acquire()} invocations for the entire life-time of this {@code
     * TimedSemaphore}. This method can be used for instance for statistical
     * calculations.
     *
     * @return the average number of {@link #acquire()} invocations per time
     * unit
     */
    public synchronized double getAverageCallsPerPeriod() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14358);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14359);return (((periodCount == 0 )&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14360)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14361)==0&false))? 0 : (double) totalAcquireCount
                / (double) periodCount;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the time period. This is the time monitored by this semaphore.
     * Only a given number of invocations of the {@link #acquire()} method is
     * possible in this period.
     *
     * @return the time period
     */
    public long getPeriod() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14362);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14363);return period;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the time unit. This is the unit used by {@link #getPeriod()}.
     *
     * @return the time unit
     */
    public TimeUnit getUnit() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14364);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14365);return unit;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Returns the executor service used by this instance.
     *
     * @return the executor service
     */
    protected ScheduledExecutorService getExecutorService() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14366);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14367);return executorService;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Starts the timer. This method is called when {@link #acquire()} is called
     * for the first time. It schedules a task to be executed at fixed rate to
     * monitor the time period specified.
     *
     * @return a future object representing the task scheduled
     */
    protected ScheduledFuture<?> startTimer() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14368);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14369);return getExecutorService().scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14370);
                __CLR4_5_2b1ab1alvha7ajx.R.inc(14371);endOfPeriod();
            }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}
        }, getPeriod(), getPeriod(), getUnit());
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * The current time period is finished. This method is called by the timer
     * used internally to monitor the time period. It resets the counter and
     * releases the threads waiting for this barrier.
     */
    synchronized void endOfPeriod() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14372);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14373);lastCallsPerPeriod = acquireCount;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14374);totalAcquireCount += acquireCount;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14375);periodCount++;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14376);acquireCount = 0;
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14377);notifyAll();
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Prepares an acquire operation. Checks for the current state and starts the internal
     * timer if necessary. This method must be called with the lock of this object held.
     */
    private void prepareAcquire() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14378);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14379);if ((((isShutdown())&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14380)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14381)==0&false))) {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14382);throw new IllegalStateException("TimedSemaphore is shut down!");
        }

        }__CLR4_5_2b1ab1alvha7ajx.R.inc(14383);if ((((task == null)&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14384)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14385)==0&false))) {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14386);task = startTimer();
        }
    }}finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}

    /**
     * Internal helper method for acquiring a permit. This method checks whether currently
     * a permit can be acquired and - if so - increases the internal counter. The return
     * value indicates whether a permit could be acquired. This method must be called with
     * the lock of this object held.
     *
     * @return a flag whether a permit could be acquired
     */
    private boolean acquirePermit() {try{__CLR4_5_2b1ab1alvha7ajx.R.inc(14387);
        __CLR4_5_2b1ab1alvha7ajx.R.inc(14388);if ((((getLimit() <= NO_LIMIT || acquireCount < getLimit())&&(__CLR4_5_2b1ab1alvha7ajx.R.iget(14389)!=0|true))||(__CLR4_5_2b1ab1alvha7ajx.R.iget(14390)==0&false))) {{
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14391);acquireCount++;
            __CLR4_5_2b1ab1alvha7ajx.R.inc(14392);return true;
        }
        }__CLR4_5_2b1ab1alvha7ajx.R.inc(14393);return false;
    }finally{__CLR4_5_2b1ab1alvha7ajx.R.flushNeeded();}}
}
