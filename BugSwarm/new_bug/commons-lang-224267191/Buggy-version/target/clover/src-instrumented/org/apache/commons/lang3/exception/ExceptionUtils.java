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
package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/**
 * <p>Provides utilities for manipulating and examining 
 * <code>Throwable</code> objects.</p>
 *
 * @since 1.0
 */
public class ExceptionUtils {public static class __CLR4_5_2bafbaflvha7am9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,14872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * <p>Used when printing stack frames to denote the start of a
     * wrapped exception.</p>
     *
     * <p>Package private for accessibility by test suite.</p>
     */
    static final String WRAPPED_MARKER = " [wrapped] ";

    /**
     * <p>The names of methods commonly used to access a wrapped exception.</p>
     */
    // TODO: Remove in Lang 4.0
    private static final String[] CAUSE_METHOD_NAMES = {
        "getCause",
        "getNextException",
        "getTargetException",
        "getException",
        "getSourceException",
        "getRootCause",
        "getCausedByException",
        "getNested",
        "getLinkedException",
        "getNestedException",
        "getLinkedCause",
        "getThrowable",
    };

    /**
     * <p>
     * Public constructor allows an instance of <code>ExceptionUtils</code> to be created, although that is not
     * normally necessary.
     * </p>
     */
    public ExceptionUtils() {
        super();__CLR4_5_2bafbaflvha7am9.R.inc(14632);try{__CLR4_5_2bafbaflvha7am9.R.inc(14631);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the default names used when searching for the cause of an exception.</p>
     *
     * <p>This may be modified and used in the overloaded getCause(Throwable, String[]) method.</p>
     *
     * @return cloned array of the default method names
     * @since 3.0
     * @deprecated This feature will be removed in Lang 4.0
     */
    @Deprecated
    public static String[] getDefaultCauseMethodNames() {try{__CLR4_5_2bafbaflvha7am9.R.inc(14633);
        __CLR4_5_2bafbaflvha7am9.R.inc(14634);return ArrayUtils.clone(CAUSE_METHOD_NAMES);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Introspects the <code>Throwable</code> to obtain the cause.</p>
     *
     * <p>The method searches for methods with specific names that return a 
     * <code>Throwable</code> object. This will pick up most wrapping exceptions,
     * including those from JDK 1.4.
     *
     * <p>The default list searched for are:</p>
     * <ul>
     *  <li><code>getCause()</code></li>
     *  <li><code>getNextException()</code></li>
     *  <li><code>getTargetException()</code></li>
     *  <li><code>getException()</code></li>
     *  <li><code>getSourceException()</code></li>
     *  <li><code>getRootCause()</code></li>
     *  <li><code>getCausedByException()</code></li>
     *  <li><code>getNested()</code></li>
     * </ul>
     * 
     * <p>If none of the above is found, returns <code>null</code>.</p>
     *
     * @param throwable  the throwable to introspect for a cause, may be null
     * @return the cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     * @since 1.0
     * @deprecated This feature will be removed in Lang 4.0, use {@link Throwable#getCause} instead
     */
    @Deprecated
    public static Throwable getCause(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14635);
        __CLR4_5_2bafbaflvha7am9.R.inc(14636);return getCause(throwable, null);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Introspects the <code>Throwable</code> to obtain the cause.</p>
     *
     * <p>A <code>null</code> set of method names means use the default set.
     * A <code>null</code> in the set of method names will be ignored.</p>
     *
     * @param throwable  the throwable to introspect for a cause, may be null
     * @param methodNames  the method names, null treated as default set
     * @return the cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     * @since 1.0
     * @deprecated This feature will be removed in Lang 4.0, use {@link Throwable#getCause} instead
     */
    @Deprecated
    public static Throwable getCause(final Throwable throwable, String[] methodNames) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14637);
        __CLR4_5_2bafbaflvha7am9.R.inc(14638);if ((((throwable == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14639)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14640)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14641);return null;
        }

        }__CLR4_5_2bafbaflvha7am9.R.inc(14642);if ((((methodNames == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14643)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14644)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14645);final Throwable cause = throwable.getCause();
            __CLR4_5_2bafbaflvha7am9.R.inc(14646);if ((((cause != null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14647)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14648)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14649);return cause;
            }

            }__CLR4_5_2bafbaflvha7am9.R.inc(14650);methodNames = CAUSE_METHOD_NAMES;
        }

        }__CLR4_5_2bafbaflvha7am9.R.inc(14651);for (final String methodName : methodNames) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14652);if ((((methodName != null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14653)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14654)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14655);final Throwable legacyCause = getCauseUsingMethodName(throwable, methodName);
                __CLR4_5_2bafbaflvha7am9.R.inc(14656);if ((((legacyCause != null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14657)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14658)==0&false))) {{
                    __CLR4_5_2bafbaflvha7am9.R.inc(14659);return legacyCause;
                }
            }}
        }}

        }__CLR4_5_2bafbaflvha7am9.R.inc(14660);return null;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Introspects the <code>Throwable</code> to obtain the root cause.</p>
     *
     * <p>This method walks through the exception chain to the last element,
     * "root" of the tree, using {@link #getCause(Throwable)}, and
     * returns that exception.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. If the throwable parameter
     * has a cause of itself, then null will be returned. If the throwable
     * parameter cause chain loops, the last element in the chain before the
     * loop is returned.</p>
     *
     * @param throwable  the throwable to get the root cause for, may be null
     * @return the root cause of the <code>Throwable</code>,
     *  <code>null</code> if none found or null throwable input
     */
    public static Throwable getRootCause(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14661);
        __CLR4_5_2bafbaflvha7am9.R.inc(14662);final List<Throwable> list = getThrowableList(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14663);return (((list.size() < 2 )&&(__CLR4_5_2bafbaflvha7am9.R.iget(14664)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14665)==0&false))? null : list.get(list.size() - 1);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Finds a <code>Throwable</code> by method name.</p>
     *
     * @param throwable  the exception to examine
     * @param methodName  the name of the method to find and invoke
     * @return the wrapped exception, or <code>null</code> if not found
     */
    // TODO: Remove in Lang 4.0
    private static Throwable getCauseUsingMethodName(final Throwable throwable, final String methodName) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14666);
        __CLR4_5_2bafbaflvha7am9.R.inc(14667);Method method = null;
        __CLR4_5_2bafbaflvha7am9.R.inc(14668);try {
            __CLR4_5_2bafbaflvha7am9.R.inc(14669);method = throwable.getClass().getMethod(methodName);
        } catch (final NoSuchMethodException | SecurityException ignored) { // NOPMD
            // exception ignored
        }

        __CLR4_5_2bafbaflvha7am9.R.inc(14670);if ((((method != null && Throwable.class.isAssignableFrom(method.getReturnType()))&&(__CLR4_5_2bafbaflvha7am9.R.iget(14671)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14672)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14673);try {
                __CLR4_5_2bafbaflvha7am9.R.inc(14674);return (Throwable) method.invoke(throwable);
            } catch (final IllegalAccessException | IllegalArgumentException | InvocationTargetException ignored) { // NOPMD
                // exception ignored
            }
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14675);return null;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Counts the number of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return <code>1</code>.
     * A throwable with one cause will return <code>2</code> and so on.
     * A <code>null</code> throwable will return <code>0</code>.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. The cause chain is
     * processed until the end is reached, or until the next item in the
     * chain is already in the result set.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @return the count of throwables, zero if null input
     */
    public static int getThrowableCount(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14676);
        __CLR4_5_2bafbaflvha7am9.R.inc(14677);return getThrowableList(throwable).size();
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Returns the list of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return an array containing
     * one element - the input throwable.
     * A throwable with one cause will return an array containing
     * two elements. - the input throwable and the cause throwable.
     * A <code>null</code> throwable will return an array of size zero.</p>
     *
     * <p>From version 2.2, this method handles recursive cause structures
     * that might otherwise cause infinite loops. The cause chain is
     * processed until the end is reached, or until the next item in the
     * chain is already in the result set.</p>
     *
     * @see #getThrowableList(Throwable)
     * @param throwable  the throwable to inspect, may be null
     * @return the array of throwables, never null
     */
    public static Throwable[] getThrowables(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14678);
        __CLR4_5_2bafbaflvha7am9.R.inc(14679);final List<Throwable> list = getThrowableList(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14680);return list.toArray(new Throwable[list.size()]);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Returns the list of <code>Throwable</code> objects in the
     * exception chain.</p>
     *
     * <p>A throwable without cause will return a list containing
     * one element - the input throwable.
     * A throwable with one cause will return a list containing
     * two elements. - the input throwable and the cause throwable.
     * A <code>null</code> throwable will return a list of size zero.</p>
     *
     * <p>This method handles recursive cause structures that might
     * otherwise cause infinite loops. The cause chain is processed until
     * the end is reached, or until the next item in the chain is already
     * in the result set.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @return the list of throwables, never null
     * @since Commons Lang 2.2
     */
    public static List<Throwable> getThrowableList(Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14681);
        __CLR4_5_2bafbaflvha7am9.R.inc(14682);final List<Throwable> list = new ArrayList<>();
        __CLR4_5_2bafbaflvha7am9.R.inc(14683);while ((((throwable != null && list.contains(throwable) == false)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14684)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14685)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14686);list.add(throwable);
            __CLR4_5_2bafbaflvha7am9.R.inc(14687);throwable = ExceptionUtils.getCause(throwable);
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14688);return list;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified class (exactly) in the exception chain.
     * Subclasses of the specified class do not match - see
     * {@link #indexOfType(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param clazz  the class to search for, subclasses do not match, null returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     */
    public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14689);
        __CLR4_5_2bafbaflvha7am9.R.inc(14690);return indexOf(throwable, clazz, 0, false);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified type in the exception chain from
     * a specified index.
     * Subclasses of the specified class do not match - see
     * {@link #indexOfType(Throwable, Class, int)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.
     * A negative start index is treated as zero.
     * A start index greater than the number of throwables returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param clazz  the class to search for, subclasses do not match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     */
    public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz, final int fromIndex) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14691);
        __CLR4_5_2bafbaflvha7am9.R.inc(14692);return indexOf(throwable, clazz, fromIndex, false);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified class or subclass in the exception chain.
     * Subclasses of the specified class do match - see
     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     * @since 2.1
     */
    public static int indexOfType(final Throwable throwable, final Class<?> type) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14693);
        __CLR4_5_2bafbaflvha7am9.R.inc(14694);return indexOf(throwable, type, 0, true);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Returns the (zero based) index of the first <code>Throwable</code>
     * that matches the specified type in the exception chain from
     * a specified index.
     * Subclasses of the specified class do match - see
     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.</p>
     *
     * <p>A <code>null</code> throwable returns <code>-1</code>.
     * A <code>null</code> type returns <code>-1</code>.
     * No match in the chain returns <code>-1</code>.
     * A negative start index is treated as zero.
     * A start index greater than the number of throwables returns <code>-1</code>.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @return the index into the throwable chain, -1 if no match or null input
     * @since 2.1
     */
    public static int indexOfType(final Throwable throwable, final Class<?> type, final int fromIndex) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14695);
        __CLR4_5_2bafbaflvha7am9.R.inc(14696);return indexOf(throwable, type, fromIndex, true);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Worker method for the <code>indexOfType</code> methods.</p>
     *
     * @param throwable  the throwable to inspect, may be null
     * @param type  the type to search for, subclasses match, null returns -1
     * @param fromIndex  the (zero based) index of the starting position,
     *  negative treated as zero, larger than chain size returns -1
     * @param subclass if <code>true</code>, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares
     * using references
     * @return index of the <code>type</code> within throwables nested within the specified <code>throwable</code>
     */
    private static int indexOf(final Throwable throwable, final Class<?> type, int fromIndex, final boolean subclass) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14697);
        __CLR4_5_2bafbaflvha7am9.R.inc(14698);if ((((throwable == null || type == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14699)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14700)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14701);return -1;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14702);if ((((fromIndex < 0)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14703)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14704)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14705);fromIndex = 0;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14706);final Throwable[] throwables = ExceptionUtils.getThrowables(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14707);if ((((fromIndex >= throwables.length)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14708)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14709)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14710);return -1;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14711);if ((((subclass)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14712)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14713)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14714);for (int i = fromIndex; (((i < throwables.length)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14715)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14716)==0&false)); i++) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14717);if ((((type.isAssignableFrom(throwables[i].getClass()))&&(__CLR4_5_2bafbaflvha7am9.R.iget(14718)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14719)==0&false))) {{
                    __CLR4_5_2bafbaflvha7am9.R.inc(14720);return i;
                }
            }}
        }} }else {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14721);for (int i = fromIndex; (((i < throwables.length)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14722)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14723)==0&false)); i++) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14724);if ((((type.equals(throwables[i].getClass()))&&(__CLR4_5_2bafbaflvha7am9.R.iget(14725)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14726)==0&false))) {{
                    __CLR4_5_2bafbaflvha7am9.R.inc(14727);return i;
                }
            }}
        }}
        }__CLR4_5_2bafbaflvha7am9.R.inc(14728);return -1;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Prints a compact stack trace for the root cause of a throwable
     * to <code>System.err</code>.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14729);
        __CLR4_5_2bafbaflvha7am9.R.inc(14730);printRootCauseStackTrace(throwable, System.err);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Prints a compact stack trace for the root cause of a throwable.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output, may be null
     * @param stream  the stream to output to, may not be null
     * @throws IllegalArgumentException if the stream is <code>null</code>
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintStream stream) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14731);
        __CLR4_5_2bafbaflvha7am9.R.inc(14732);if ((((throwable == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14733)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14734)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14735);return;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14736);Validate.isTrue(stream != null, "The PrintStream must not be null");
        __CLR4_5_2bafbaflvha7am9.R.inc(14737);final String trace[] = getRootCauseStackTrace(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14738);for (final String element : trace) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14739);stream.println(element);
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14740);stream.flush();
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Prints a compact stack trace for the root cause of a throwable.</p>
     *
     * <p>The compact stack trace starts with the root cause and prints
     * stack frames up to the place where it was caught and wrapped.
     * Then it prints the wrapped exception and continues with stack frames
     * until the wrapper exception is caught and wrapped again, etc.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * Note that this is the opposite order to the JDK1.4 display.</p>
     *
     * <p>The method is equivalent to <code>printStackTrace</code> for throwables
     * that don't have nested causes.</p>
     *
     * @param throwable  the throwable to output, may be null
     * @param writer  the writer to output to, may not be null
     * @throws IllegalArgumentException if the writer is <code>null</code>
     * @since 2.0
     */
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintWriter writer) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14741);
        __CLR4_5_2bafbaflvha7am9.R.inc(14742);if ((((throwable == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14743)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14744)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14745);return;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14746);Validate.isTrue(writer != null, "The PrintWriter must not be null");
        __CLR4_5_2bafbaflvha7am9.R.inc(14747);final String trace[] = getRootCauseStackTrace(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14748);for (final String element : trace) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14749);writer.println(element);
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14750);writer.flush();
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Creates a compact stack trace for the root cause of the supplied
     * <code>Throwable</code>.</p>
     *
     * <p>The output of this method is consistent across JDK versions.
     * It consists of the root exception followed by each of its wrapping
     * exceptions separated by '[wrapped]'. Note that this is the opposite
     * order to the JDK1.4 display.</p>
     *
     * @param throwable  the throwable to examine, may be null
     * @return an array of stack trace frames, never null
     * @since 2.0
     */
    public static String[] getRootCauseStackTrace(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14751);
        __CLR4_5_2bafbaflvha7am9.R.inc(14752);if ((((throwable == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14753)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14754)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14755);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14756);final Throwable throwables[] = getThrowables(throwable);
        __CLR4_5_2bafbaflvha7am9.R.inc(14757);final int count = throwables.length;
        __CLR4_5_2bafbaflvha7am9.R.inc(14758);final List<String> frames = new ArrayList<>();
        __CLR4_5_2bafbaflvha7am9.R.inc(14759);List<String> nextTrace = getStackFrameList(throwables[count - 1]);
        __CLR4_5_2bafbaflvha7am9.R.inc(14760);for (int i = count; (((--i >= 0)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14761)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14762)==0&false));) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14763);final List<String> trace = nextTrace;
            __CLR4_5_2bafbaflvha7am9.R.inc(14764);if ((((i != 0)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14765)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14766)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14767);nextTrace = getStackFrameList(throwables[i - 1]);
                __CLR4_5_2bafbaflvha7am9.R.inc(14768);removeCommonFrames(trace, nextTrace);
            }
            }__CLR4_5_2bafbaflvha7am9.R.inc(14769);if ((((i == count - 1)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14770)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14771)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14772);frames.add(throwables[i].toString());
            } }else {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14773);frames.add(WRAPPED_MARKER + throwables[i].toString());
            }
            }__CLR4_5_2bafbaflvha7am9.R.inc(14774);for (int j = 0; (((j < trace.size())&&(__CLR4_5_2bafbaflvha7am9.R.iget(14775)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14776)==0&false)); j++) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14777);frames.add(trace.get(j));
            }
        }}
        }__CLR4_5_2bafbaflvha7am9.R.inc(14778);return frames.toArray(new String[frames.size()]);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Removes common frames from the cause trace given the two stack traces.</p>
     *
     * @param causeFrames  stack trace of a cause throwable
     * @param wrapperFrames  stack trace of a wrapper throwable
     * @throws IllegalArgumentException if either argument is null
     * @since 2.0
     */
    public static void removeCommonFrames(final List<String> causeFrames, final List<String> wrapperFrames) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14779);
        __CLR4_5_2bafbaflvha7am9.R.inc(14780);if ((((causeFrames == null || wrapperFrames == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14781)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14782)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14783);throw new IllegalArgumentException("The List must not be null");
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14784);int causeFrameIndex = causeFrames.size() - 1;
        __CLR4_5_2bafbaflvha7am9.R.inc(14785);int wrapperFrameIndex = wrapperFrames.size() - 1;
        __CLR4_5_2bafbaflvha7am9.R.inc(14786);while ((((causeFrameIndex >= 0 && wrapperFrameIndex >= 0)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14787)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14788)==0&false))) {{
            // Remove the frame from the cause trace if it is the same
            // as in the wrapper trace
            __CLR4_5_2bafbaflvha7am9.R.inc(14789);final String causeFrame = causeFrames.get(causeFrameIndex);
            __CLR4_5_2bafbaflvha7am9.R.inc(14790);final String wrapperFrame = wrapperFrames.get(wrapperFrameIndex);
            __CLR4_5_2bafbaflvha7am9.R.inc(14791);if ((((causeFrame.equals(wrapperFrame))&&(__CLR4_5_2bafbaflvha7am9.R.iget(14792)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14793)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14794);causeFrames.remove(causeFrameIndex);
            }
            }__CLR4_5_2bafbaflvha7am9.R.inc(14795);causeFrameIndex--;
            __CLR4_5_2bafbaflvha7am9.R.inc(14796);wrapperFrameIndex--;
        }
    }}finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets the stack trace from a Throwable as a String.</p>
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
     *
     * @param throwable  the <code>Throwable</code> to be examined
     * @return the stack trace as generated by the exception's
     *  <code>printStackTrace(PrintWriter)</code> method
     */
    public static String getStackTrace(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14797);
        __CLR4_5_2bafbaflvha7am9.R.inc(14798);final StringWriter sw = new StringWriter();
        __CLR4_5_2bafbaflvha7am9.R.inc(14799);final PrintWriter pw = new PrintWriter(sw, true);
        __CLR4_5_2bafbaflvha7am9.R.inc(14800);throwable.printStackTrace(pw);
        __CLR4_5_2bafbaflvha7am9.R.inc(14801);return sw.getBuffer().toString();
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Captures the stack trace associated with the specified
     * <code>Throwable</code> object, decomposing it into a list of
     * stack frames.</p>
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
     *
     * @param throwable  the <code>Throwable</code> to examine, may be null
     * @return an array of strings describing each stack frame, never null
     */
    public static String[] getStackFrames(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14802);
        __CLR4_5_2bafbaflvha7am9.R.inc(14803);if ((((throwable == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14804)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14805)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14806);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14807);return getStackFrames(getStackTrace(throwable));
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns an array where each element is a line from the argument.</p>
     *
     * <p>The end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.</p>
     *
     * @param stackTrace  a stack trace String
     * @return an array where each element is a line from the argument
     */
    static String[] getStackFrames(final String stackTrace) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14808);
        __CLR4_5_2bafbaflvha7am9.R.inc(14809);final String linebreak = System.lineSeparator();
        __CLR4_5_2bafbaflvha7am9.R.inc(14810);final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak);
        __CLR4_5_2bafbaflvha7am9.R.inc(14811);final List<String> list = new ArrayList<>();
        __CLR4_5_2bafbaflvha7am9.R.inc(14812);while ((((frames.hasMoreTokens())&&(__CLR4_5_2bafbaflvha7am9.R.iget(14813)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14814)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14815);list.add(frames.nextToken());
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14816);return list.toArray(new String[list.size()]);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * <p>Produces a <code>List</code> of stack frames - the message
     * is not included. Only the trace of the specified exception is
     * returned, any caused by trace is stripped.</p>
     *
     * <p>This works in most cases - it will only fail if the exception
     * message contains a line that starts with:
     * <code>&quot;&nbsp;&nbsp;&nbsp;at&quot;.</code></p>
     * 
     * @param t is any throwable
     * @return List of stack frames
     */
    static List<String> getStackFrameList(final Throwable t) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14817);
        __CLR4_5_2bafbaflvha7am9.R.inc(14818);final String stackTrace = getStackTrace(t);
        __CLR4_5_2bafbaflvha7am9.R.inc(14819);final String linebreak = System.lineSeparator();
        __CLR4_5_2bafbaflvha7am9.R.inc(14820);final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak);
        __CLR4_5_2bafbaflvha7am9.R.inc(14821);final List<String> list = new ArrayList<>();
        __CLR4_5_2bafbaflvha7am9.R.inc(14822);boolean traceStarted = false;
        __CLR4_5_2bafbaflvha7am9.R.inc(14823);while ((((frames.hasMoreTokens())&&(__CLR4_5_2bafbaflvha7am9.R.iget(14824)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14825)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14826);final String token = frames.nextToken();
            // Determine if the line starts with <whitespace>at
            __CLR4_5_2bafbaflvha7am9.R.inc(14827);final int at = token.indexOf("at");
            __CLR4_5_2bafbaflvha7am9.R.inc(14828);if ((((at != -1 && token.substring(0, at).trim().isEmpty())&&(__CLR4_5_2bafbaflvha7am9.R.iget(14829)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14830)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14831);traceStarted = true;
                __CLR4_5_2bafbaflvha7am9.R.inc(14832);list.add(token);
            } }else {__CLR4_5_2bafbaflvha7am9.R.inc(14833);if ((((traceStarted)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14834)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14835)==0&false))) {{
                __CLR4_5_2bafbaflvha7am9.R.inc(14836);break;
            }
        }}}
        }__CLR4_5_2bafbaflvha7am9.R.inc(14837);return list;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a short message summarising the exception.
     * <p>
     * The message returned is of the form
     * {ClassNameWithoutPackage}: {ThrowableMessage}
     *
     * @param th  the throwable to get a message for, null returns empty string
     * @return the message, non-null
     * @since Commons Lang 2.2
     */
    public static String getMessage(final Throwable th) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14838);
        __CLR4_5_2bafbaflvha7am9.R.inc(14839);if ((((th == null)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14840)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14841)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14842);return StringUtils.EMPTY;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14843);final String clsName = ClassUtils.getShortClassName(th, null);
        __CLR4_5_2bafbaflvha7am9.R.inc(14844);final String msg = th.getMessage();
        __CLR4_5_2bafbaflvha7am9.R.inc(14845);return clsName + ": " + StringUtils.defaultString(msg);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a short message summarising the root cause exception.
     * <p>
     * The message returned is of the form
     * {ClassNameWithoutPackage}: {ThrowableMessage}
     *
     * @param th  the throwable to get a message for, null returns empty string
     * @return the message, non-null
     * @since Commons Lang 2.2
     */
    public static String getRootCauseMessage(final Throwable th) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14846);
        __CLR4_5_2bafbaflvha7am9.R.inc(14847);Throwable root = ExceptionUtils.getRootCause(th);
        __CLR4_5_2bafbaflvha7am9.R.inc(14848);root = (((root == null )&&(__CLR4_5_2bafbaflvha7am9.R.iget(14849)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14850)==0&false))? th : root;
        __CLR4_5_2bafbaflvha7am9.R.inc(14851);return getMessage(root);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * Throw a checked exception without adding the exception to the throws
     * clause of the calling method. This method prevents throws clause
     * pollution and reduces the clutter of "Caused by" exceptions in the
     * stacktrace.
     * <p>
     * The use of this technique may be controversial, but exceedingly useful to
     * library developers.
     * <code>
     *  public int propagateExample { // note that there is no throws clause
     *      try {
     *          return invocation(); // throws IOException
     *      } catch (Exception e) {
     *          return ExceptionUtils.rethrow(e);  // propagates a checked exception
     *      }
     *  }
     * </code>
     * <p>
     * This is an alternative to the more conservative approach of wrapping the
     * checked exception in a RuntimeException:
     * <code>
     *  public int wrapExample { // note that there is no throws clause
     *      try {
     *          return invocation(); // throws IOException
     *      } catch (Error e) {
     *          throw e;
     *      } catch (RuntimeException e) {
     *          throw e;  // wraps a checked exception
     *      } catch (Exception e) {
     *          throw new UndeclaredThrowableException(e);  // wraps a checked exception
     *      }
     *  }
     * </code>
     * <p>
     * One downside to using this approach is that the java compiler will not
     * allow invoking code to specify a checked exception in a catch clause
     * unless there is some code path within the try block that has invoked a
     * method declared with that checked exception. If the invoking site wishes
     * to catch the shaded checked exception, it must either invoke the shaded
     * code through a method re-declaring the desired checked exception, or
     * catch Exception and use the instanceof operator. Either of these
     * techniques are required when interacting with non-java jvm code such as
     * Jython, Scala, or Groovy, since these languages do not consider any
     * exceptions as checked.
     *
     * @param throwable
     *            The throwable to rethrow.
     * @param <R> The type of the returned value.
     * @return Never actually returned, this generic type matches any type
     *         which the calling site requires. "Returning" the results of this
     *         method, as done in the propagateExample above, will satisfy the
     *         java compiler requirement that all code paths return a value.
     * @since 3.5
     * @see #wrapAndThrow(Throwable)
     */
    public static <R> R rethrow(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14852);
        // claim that the typeErasure invocation throws a RuntimeException
        __CLR4_5_2bafbaflvha7am9.R.inc(14853);return ExceptionUtils.<R, RuntimeException> typeErasure(throwable);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * Claim a Throwable is another Exception type using type erasure. This
     * hides a checked exception from the java compiler, allowing a checked
     * exception to be thrown without having the exception in the method's throw
     * clause.
     */
    @SuppressWarnings("unchecked")
    private static <R, T extends Throwable> R typeErasure(final Throwable throwable) throws T {try{__CLR4_5_2bafbaflvha7am9.R.inc(14854);
        __CLR4_5_2bafbaflvha7am9.R.inc(14855);throw (T) throwable;
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * Throw a checked exception without adding the exception to the throws
     * clause of the calling method. For checked exceptions, this method throws
     * an UndeclaredThrowableException wrapping the checked exception. For
     * Errors and RuntimeExceptions, the original exception is rethrown.
     * <p>
     * The downside to using this approach is that invoking code which needs to
     * handle specific checked exceptions must sniff up the exception chain to
     * determine if the caught exception was caused by the checked exception.
     *
     * @param throwable
     *            The throwable to rethrow.
     * @param <R> The type of the returned value.
     * @return Never actually returned, this generic type matches any type
     *         which the calling site requires. "Returning" the results of this
     *         method will satisfy the java compiler requirement that all code
     *         paths return a value.
     * @since 3.5
     * @see #rethrow(Throwable)
     * @see #hasCause(Throwable, Class)
     */
    public static <R> R wrapAndThrow(final Throwable throwable) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14856);
        __CLR4_5_2bafbaflvha7am9.R.inc(14857);if ((((throwable instanceof RuntimeException)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14858)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14859)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14860);throw (RuntimeException) throwable;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14861);if ((((throwable instanceof Error)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14862)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14863)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14864);throw (Error) throwable;
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14865);throw new UndeclaredThrowableException(throwable);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}

    /**
     * Does the throwable's causal chain have an immediate or wrapped exception
     * of the given type?
     *
     * @param chain
     *            The root of a Throwable causal chain.
     * @param type
     *            The exception type to test.
     * @return true, if chain is an instance of type or is an
     *         UndeclaredThrowableException wrapping a cause.
     * @since 3.5
     * @see #wrapAndThrow(Throwable)
     */
    public static boolean hasCause(Throwable chain,
            final Class<? extends Throwable> type) {try{__CLR4_5_2bafbaflvha7am9.R.inc(14866);
        __CLR4_5_2bafbaflvha7am9.R.inc(14867);if ((((chain instanceof UndeclaredThrowableException)&&(__CLR4_5_2bafbaflvha7am9.R.iget(14868)!=0|true))||(__CLR4_5_2bafbaflvha7am9.R.iget(14869)==0&false))) {{
            __CLR4_5_2bafbaflvha7am9.R.inc(14870);chain = chain.getCause();
        }
        }__CLR4_5_2bafbaflvha7am9.R.inc(14871);return type.isInstance(chain);
    }finally{__CLR4_5_2bafbaflvha7am9.R.flushNeeded();}}
}
