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
package org.apache.commons.lang3.math;

import org.apache.commons.lang3.Validate;

/**
 * <p>Provides IEEE-754r variants of NumberUtils methods. </p>
 *
 * <p>See: <a href="http://en.wikipedia.org/wiki/IEEE_754r">http://en.wikipedia.org/wiki/IEEE_754r</a></p>
 *
 * @since 2.4
 */
public class IEEE754rUtils {public static class __CLR4_5_2bt4bt4lvha7asd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,15388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
      * @since 3.4 Changed signature from min(double[]) to min(double...)
     */
    public static double min(final double... array) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15304);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15305);Validate.isTrue(array != null, "The Array must not be null");
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15306);Validate.isTrue(array.length != 0, "Array cannot be empty.");
    
        // Finds and returns min
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15307);double min = array[0];
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15308);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15309)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15310)==0&false)); i++) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15311);min = min(array[i], min);
        }
    
        }__CLR4_5_2bt4bt4lvha7asd.R.inc(15312);return min;
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from min(float[]) to min(float...)
     */
    public static float min(final float... array) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15313);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15314);Validate.isTrue(array != null, "The Array must not be null");
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15315);Validate.isTrue(array.length != 0, "Array cannot be empty.");
        
        // Finds and returns min
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15316);float min = array[0];
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15317);for (int i = 1; (((i < array.length)&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15318)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15319)==0&false)); i++) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15320);min = min(array[i], min);
        }
    
        }__CLR4_5_2bt4bt4lvha7asd.R.inc(15321);return min;
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15322);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15323);return min(min(a, b), c);
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15324);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15325);if((((Double.isNaN(a))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15326)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15327)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15328);return b;
        } }else
        {__CLR4_5_2bt4bt4lvha7asd.R.inc(15329);if((((Double.isNaN(b))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15330)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15331)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15332);return a;
        } }else {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15333);return Math.min(a, b);
        }
    }}}finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15334);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15335);return min(min(a, b), c);
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15336);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15337);if((((Float.isNaN(a))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15338)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15339)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15340);return b;
        } }else
        {__CLR4_5_2bt4bt4lvha7asd.R.inc(15341);if((((Float.isNaN(b))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15342)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15343)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15344);return a;
        } }else {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15345);return Math.min(a, b);
        }
    }}}finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(double[]) to max(double...)
     */
    public static double max(final double... array) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15346);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15347);Validate.isTrue(array != null, "The Array must not be null");
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15348);Validate.isTrue(array.length != 0, "Array cannot be empty.");
        
        // Finds and returns max
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15349);double max = array[0];
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15350);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15351)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15352)==0&false)); j++) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15353);max = max(array[j], max);
        }
    
        }__CLR4_5_2bt4bt4lvha7asd.R.inc(15354);return max;
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @since 3.4 Changed signature from max(float[]) to max(float...)
     */
    public static float max(final float... array) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15355);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15356);Validate.isTrue(array != null, "The Array must not be null");
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15357);Validate.isTrue(array.length != 0, "Array cannot be empty.");
        
        // Finds and returns max
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15358);float max = array[0];
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15359);for (int j = 1; (((j < array.length)&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15360)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15361)==0&false)); j++) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15362);max = max(array[j], max);
        }

        }__CLR4_5_2bt4bt4lvha7asd.R.inc(15363);return max;
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}
     
    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15364);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15365);return max(max(a, b), c);
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static double max(final double a, final double b) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15366);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15367);if((((Double.isNaN(a))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15368)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15369)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15370);return b;
        } }else
        {__CLR4_5_2bt4bt4lvha7asd.R.inc(15371);if((((Double.isNaN(b))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15372)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15373)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15374);return a;
        } }else {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15375);return Math.max(a, b);
        }
    }}}finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15376);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15377);return max(max(a, b), c);
    }finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static float max(final float a, final float b) {try{__CLR4_5_2bt4bt4lvha7asd.R.inc(15378);
        __CLR4_5_2bt4bt4lvha7asd.R.inc(15379);if((((Float.isNaN(a))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15380)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15381)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15382);return b;
        } }else
        {__CLR4_5_2bt4bt4lvha7asd.R.inc(15383);if((((Float.isNaN(b))&&(__CLR4_5_2bt4bt4lvha7asd.R.iget(15384)!=0|true))||(__CLR4_5_2bt4bt4lvha7asd.R.iget(15385)==0&false))) {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15386);return a;
        } }else {{
            __CLR4_5_2bt4bt4lvha7asd.R.inc(15387);return Math.max(a, b);
        }
    }}}finally{__CLR4_5_2bt4bt4lvha7asd.R.flushNeeded();}}

}
