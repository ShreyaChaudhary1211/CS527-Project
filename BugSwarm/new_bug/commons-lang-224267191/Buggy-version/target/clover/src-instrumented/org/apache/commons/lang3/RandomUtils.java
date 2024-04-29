/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import java.util.Random;

/**
 * <p>Utility library that supplements the standard {@link Random} class.</p>
 * 
 * @since 3.3
 */
public class RandomUtils {public static class __CLR4_5_25cc5cclvha799j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Random object used by random method. This has to be not local to the
     * random method so as to not return the same value in the same millisecond.
     */
    private static final Random RANDOM = new Random();

    /**
     * <p>
     * {@code RandomUtils} instances should NOT be constructed in standard
     * programming. Instead, the class should be used as
     * {@code RandomUtils.nextBytes(5);}.
     * </p>
     * 
     * <p>
     * This constructor is public to permit tools that require a JavaBean
     * instance to operate.
     * </p>
     */
    public RandomUtils() {
        super();__CLR4_5_25cc5cclvha799j.R.inc(6925);try{__CLR4_5_25cc5cclvha799j.R.inc(6924);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p>
     * Returns a random boolean value
     * </p>
     *
     * @return the random boolean
     * @since 3.5
     */
    public static boolean nextBoolean() {try{__CLR4_5_25cc5cclvha799j.R.inc(6926);
        __CLR4_5_25cc5cclvha799j.R.inc(6927);return RANDOM.nextBoolean();
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}
    
    /**
     * <p>
     * Creates an array of random bytes.
     * </p>
     * 
     * @param count
     *            the size of the returned array
     * @return the random byte array
     * @throws IllegalArgumentException if {@code count} is negative
     */
    public static byte[] nextBytes(final int count) {try{__CLR4_5_25cc5cclvha799j.R.inc(6928);
        __CLR4_5_25cc5cclvha799j.R.inc(6929);Validate.isTrue(count >= 0, "Count cannot be negative.");

        __CLR4_5_25cc5cclvha799j.R.inc(6930);final byte[] result = new byte[count];
        __CLR4_5_25cc5cclvha799j.R.inc(6931);RANDOM.nextBytes(result);
        __CLR4_5_25cc5cclvha799j.R.inc(6932);return result;
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p>
     * Returns a random integer within the specified range.
     * </p>
     * 
     * @param startInclusive
     *            the smallest value that can be returned, must be non-negative
     * @param endExclusive
     *            the upper bound (not included)
     * @throws IllegalArgumentException
     *             if {@code startInclusive > endExclusive} or if
     *             {@code startInclusive} is negative
     * @return the random integer
     */
    public static int nextInt(final int startInclusive, final int endExclusive) {try{__CLR4_5_25cc5cclvha799j.R.inc(6933);
        __CLR4_5_25cc5cclvha799j.R.inc(6934);Validate.isTrue(endExclusive >= startInclusive,
                "Start value must be smaller or equal to end value.");
        __CLR4_5_25cc5cclvha799j.R.inc(6935);Validate.isTrue(startInclusive >= 0, "Both range values must be non-negative.");

        __CLR4_5_25cc5cclvha799j.R.inc(6936);if ((((startInclusive == endExclusive)&&(__CLR4_5_25cc5cclvha799j.R.iget(6937)!=0|true))||(__CLR4_5_25cc5cclvha799j.R.iget(6938)==0&false))) {{
            __CLR4_5_25cc5cclvha799j.R.inc(6939);return startInclusive;
        }
        
        }__CLR4_5_25cc5cclvha799j.R.inc(6940);return startInclusive + RANDOM.nextInt(endExclusive - startInclusive);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p> Returns a random int within 0 - Integer.MAX_VALUE </p>
     *
     * @return the random integer
     * @see #nextInt(int, int)
     * @since 3.5
     */
    public static int nextInt() {try{__CLR4_5_25cc5cclvha799j.R.inc(6941);
        __CLR4_5_25cc5cclvha799j.R.inc(6942);return nextInt(0, Integer.MAX_VALUE);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}
    
    /**
     * <p>
     * Returns a random long within the specified range.
     * </p>
     * 
     * @param startInclusive
     *            the smallest value that can be returned, must be non-negative
     * @param endExclusive
     *            the upper bound (not included)
     * @throws IllegalArgumentException
     *             if {@code startInclusive > endExclusive} or if
     *             {@code startInclusive} is negative
     * @return the random long
     */
    public static long nextLong(final long startInclusive, final long endExclusive) {try{__CLR4_5_25cc5cclvha799j.R.inc(6943);
        __CLR4_5_25cc5cclvha799j.R.inc(6944);Validate.isTrue(endExclusive >= startInclusive,
                "Start value must be smaller or equal to end value.");
        __CLR4_5_25cc5cclvha799j.R.inc(6945);Validate.isTrue(startInclusive >= 0, "Both range values must be non-negative.");

        __CLR4_5_25cc5cclvha799j.R.inc(6946);if ((((startInclusive == endExclusive)&&(__CLR4_5_25cc5cclvha799j.R.iget(6947)!=0|true))||(__CLR4_5_25cc5cclvha799j.R.iget(6948)==0&false))) {{
            __CLR4_5_25cc5cclvha799j.R.inc(6949);return startInclusive;
        }

        }__CLR4_5_25cc5cclvha799j.R.inc(6950);return (long) nextDouble(startInclusive, endExclusive);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p> Returns a random long within 0 - Long.MAX_VALUE </p>
     *
     * @return the random long
     * @see #nextLong(long, long)
     * @since 3.5
     */
    public static long nextLong() {try{__CLR4_5_25cc5cclvha799j.R.inc(6951);
        __CLR4_5_25cc5cclvha799j.R.inc(6952);return nextLong(0, Long.MAX_VALUE);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}
    
    /**
     * <p> 
     * Returns a random double within the specified range.
     * </p>
     * 
     * @param startInclusive
     *            the smallest value that can be returned, must be non-negative
     * @param endInclusive
     *            the upper bound (included)
     * @throws IllegalArgumentException
     *             if {@code startInclusive > endInclusive} or if
     *             {@code startInclusive} is negative
     * @return the random double
     */
    public static double nextDouble(final double startInclusive, final double endInclusive) {try{__CLR4_5_25cc5cclvha799j.R.inc(6953);
        __CLR4_5_25cc5cclvha799j.R.inc(6954);Validate.isTrue(endInclusive >= startInclusive,
                "Start value must be smaller or equal to end value.");
        __CLR4_5_25cc5cclvha799j.R.inc(6955);Validate.isTrue(startInclusive >= 0, "Both range values must be non-negative.");

        __CLR4_5_25cc5cclvha799j.R.inc(6956);if ((((startInclusive == endInclusive)&&(__CLR4_5_25cc5cclvha799j.R.iget(6957)!=0|true))||(__CLR4_5_25cc5cclvha799j.R.iget(6958)==0&false))) {{
            __CLR4_5_25cc5cclvha799j.R.inc(6959);return startInclusive;
        }
        
        }__CLR4_5_25cc5cclvha799j.R.inc(6960);return startInclusive + ((endInclusive - startInclusive) * RANDOM.nextDouble());
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p> Returns a random double within 0 - Double.MAX_VALUE </p>
     *
     * @return the random double
     * @see #nextDouble(double, double)
     * @since 3.5
     */
    public static double nextDouble() {try{__CLR4_5_25cc5cclvha799j.R.inc(6961);
        __CLR4_5_25cc5cclvha799j.R.inc(6962);return nextDouble(0, Double.MAX_VALUE);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p>
     * Returns a random float within the specified range.
     * </p>
     * 
     * @param startInclusive
     *            the smallest value that can be returned, must be non-negative
     * @param endInclusive
     *            the upper bound (included)
     * @throws IllegalArgumentException
     *             if {@code startInclusive > endInclusive} or if
     *             {@code startInclusive} is negative
     * @return the random float
     */
    public static float nextFloat(final float startInclusive, final float endInclusive) {try{__CLR4_5_25cc5cclvha799j.R.inc(6963);
        __CLR4_5_25cc5cclvha799j.R.inc(6964);Validate.isTrue(endInclusive >= startInclusive,
                "Start value must be smaller or equal to end value.");
        __CLR4_5_25cc5cclvha799j.R.inc(6965);Validate.isTrue(startInclusive >= 0, "Both range values must be non-negative.");
        
        __CLR4_5_25cc5cclvha799j.R.inc(6966);if ((((startInclusive == endInclusive)&&(__CLR4_5_25cc5cclvha799j.R.iget(6967)!=0|true))||(__CLR4_5_25cc5cclvha799j.R.iget(6968)==0&false))) {{
            __CLR4_5_25cc5cclvha799j.R.inc(6969);return startInclusive;
        }
        
        }__CLR4_5_25cc5cclvha799j.R.inc(6970);return startInclusive + ((endInclusive - startInclusive) * RANDOM.nextFloat());
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}

    /**
     * <p> Returns a random float within 0 - Float.MAX_VALUE </p>
     *
     * @return the random float
     * @see #nextFloat()
     * @since 3.5
     */
    public static float nextFloat() {try{__CLR4_5_25cc5cclvha799j.R.inc(6971);
        __CLR4_5_25cc5cclvha799j.R.inc(6972);return nextFloat(0, Float.MAX_VALUE);
    }finally{__CLR4_5_25cc5cclvha799j.R.flushNeeded();}}
}
