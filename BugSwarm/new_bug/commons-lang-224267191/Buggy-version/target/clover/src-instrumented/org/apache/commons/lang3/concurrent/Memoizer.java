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

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * <p>
 * Definition of an interface for a wrapper around a calculation that takes a
 * single parameter and returns a result. The results for the calculation will
 * be cached for future requests.
 * </p>
 * <p>
 * This is not a fully functional cache, there is no way of limiting or removing
 * results once they have been generated. However, it is possible to get the
 * implementation to regenerate the result for a given parameter, if an error
 * was thrown during the previous calculation, by setting the option during the
 * construction of the class. If this is not set the class will return the
 * cached exception.
 * </p>
 * <p>
 * Thanks should go to Brian Goetz, Tim Peierls and the members of JCP JSR-166
 * Expert Group for coming up with the original implementation of the class. It
 * was also published within Java Concurrency in Practice as a sample.
 * </p>
 *
 * @param <I>
 *            the type of the input to the calculation
 * @param <O>
 *            the type of the output of the calculation
 * 
 * @since 3.6
 */
public class Memoizer<I, O> implements Computable<I, O> {public static class __CLR4_5_2axvaxvlvha7aj8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final ConcurrentMap<I, Future<O>> cache = new ConcurrentHashMap<>();
    private final Computable<I, O> computable;
    private final boolean recalculate;

    /**
     * <p>
     * Constructs a Memoizer for the provided Computable calculation.
     * </p>
     * <p>
     * If a calculation is thrown an exception for any reason, this exception
     * will be cached and returned for all future calls with the provided
     * parameter.
     * </p>
     *
     * @param computable
     *            the computation whose results should be memorized
     */
    public Memoizer(final Computable<I, O> computable) {
        this(computable, false);__CLR4_5_2axvaxvlvha7aj8.R.inc(14180);try{__CLR4_5_2axvaxvlvha7aj8.R.inc(14179);
    }finally{__CLR4_5_2axvaxvlvha7aj8.R.flushNeeded();}}

    /**
     * <p>
     * Constructs a Memoizer for the provided Computable calculation, with the
     * option of whether a Computation that experiences an error should
     * recalculate on subsequent calls or return the same cached exception.
     * </p>
     *
     * @param computable
     *            the computation whose results should be memorized
     * @param recalculate
     *            determines whether the computation should be recalculated on
     *            subsequent calls if the previous call failed
     */
    public Memoizer(final Computable<I, O> computable, final boolean recalculate) {try{__CLR4_5_2axvaxvlvha7aj8.R.inc(14181);
        __CLR4_5_2axvaxvlvha7aj8.R.inc(14182);this.computable = computable;
        __CLR4_5_2axvaxvlvha7aj8.R.inc(14183);this.recalculate = recalculate;
    }finally{__CLR4_5_2axvaxvlvha7aj8.R.flushNeeded();}}

    /**
     * <p>
     * This method will return the result of the calculation and cache it, if it
     * has not previously been calculated.
     * </p>
     * <p>
     * This cache will also cache exceptions that occur during the computation
     * if the {@code recalculate} parameter is the constructor was set to
     * {@code false}, or not set. Otherwise, if an exception happened on the
     * previous calculation, the method will attempt again to generate a value.
     * </p>
     *
     * @param arg
     *            the argument for the calculation
     * @return the result of the calculation
     * @throws InterruptedException
     *             thrown if the calculation is interrupted
     */
    @Override
    public O compute(final I arg) throws InterruptedException {try{__CLR4_5_2axvaxvlvha7aj8.R.inc(14184);
        __CLR4_5_2axvaxvlvha7aj8.R.inc(14185);while (true) {{
            __CLR4_5_2axvaxvlvha7aj8.R.inc(14186);Future<O> future = cache.get(arg);
            __CLR4_5_2axvaxvlvha7aj8.R.inc(14187);if ((((future == null)&&(__CLR4_5_2axvaxvlvha7aj8.R.iget(14188)!=0|true))||(__CLR4_5_2axvaxvlvha7aj8.R.iget(14189)==0&false))) {{
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14190);final Callable<O> eval = new Callable<O>() {

                    @Override
                    public O call() throws InterruptedException {try{__CLR4_5_2axvaxvlvha7aj8.R.inc(14191);
                        __CLR4_5_2axvaxvlvha7aj8.R.inc(14192);return computable.compute(arg);
                    }finally{__CLR4_5_2axvaxvlvha7aj8.R.flushNeeded();}}
                };
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14193);final FutureTask<O> futureTask = new FutureTask<>(eval);
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14194);future = cache.putIfAbsent(arg, futureTask);
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14195);if ((((future == null)&&(__CLR4_5_2axvaxvlvha7aj8.R.iget(14196)!=0|true))||(__CLR4_5_2axvaxvlvha7aj8.R.iget(14197)==0&false))) {{
                    __CLR4_5_2axvaxvlvha7aj8.R.inc(14198);future = futureTask;
                    __CLR4_5_2axvaxvlvha7aj8.R.inc(14199);futureTask.run();
                }
            }}
            }__CLR4_5_2axvaxvlvha7aj8.R.inc(14200);try {
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14201);return future.get();
            } catch (final CancellationException e) {
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14202);cache.remove(arg, future);
            } catch (final ExecutionException e) {
                __CLR4_5_2axvaxvlvha7aj8.R.inc(14203);if ((((recalculate)&&(__CLR4_5_2axvaxvlvha7aj8.R.iget(14204)!=0|true))||(__CLR4_5_2axvaxvlvha7aj8.R.iget(14205)==0&false))) {{
                    __CLR4_5_2axvaxvlvha7aj8.R.inc(14206);cache.remove(arg, future);
                }

                }__CLR4_5_2axvaxvlvha7aj8.R.inc(14207);throw launderException(e.getCause());
            }
        }
    }}finally{__CLR4_5_2axvaxvlvha7aj8.R.flushNeeded();}}

    /**
     * <p>
     * This method launders a Throwable to either a RuntimeException, Error or
     * any other Exception wrapped in an IllegalStateException.
     * </p>
     *
     * @param throwable
     *            the throwable to laundered
     * @return a RuntimeException, Error or an IllegalStateException
     */
    private RuntimeException launderException(final Throwable throwable) {try{__CLR4_5_2axvaxvlvha7aj8.R.inc(14208);
        __CLR4_5_2axvaxvlvha7aj8.R.inc(14209);if ((((throwable instanceof RuntimeException)&&(__CLR4_5_2axvaxvlvha7aj8.R.iget(14210)!=0|true))||(__CLR4_5_2axvaxvlvha7aj8.R.iget(14211)==0&false))) {{
            __CLR4_5_2axvaxvlvha7aj8.R.inc(14212);return (RuntimeException) throwable;
        } }else {__CLR4_5_2axvaxvlvha7aj8.R.inc(14213);if ((((throwable instanceof Error)&&(__CLR4_5_2axvaxvlvha7aj8.R.iget(14214)!=0|true))||(__CLR4_5_2axvaxvlvha7aj8.R.iget(14215)==0&false))) {{
            __CLR4_5_2axvaxvlvha7aj8.R.inc(14216);throw (Error) throwable;
        } }else {{
            __CLR4_5_2axvaxvlvha7aj8.R.inc(14217);throw new IllegalStateException("Unchecked exception", throwable);
        }
    }}}finally{__CLR4_5_2axvaxvlvha7aj8.R.flushNeeded();}}
}
