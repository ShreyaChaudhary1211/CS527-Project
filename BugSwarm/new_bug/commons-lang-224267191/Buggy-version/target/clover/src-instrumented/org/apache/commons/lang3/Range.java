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
package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

/**
 * <p>An immutable range of objects from a minimum to maximum point inclusive.</p>
 * 
 * <p>The objects need to either be implementations of {@code Comparable}
 * or you need to supply a {@code Comparator}. </p>
 *
 * <p>#ThreadSafe# if the objects and comparator are thread-safe</p>
 * 
 * @since 3.0
 */
public final class Range<T> implements Serializable {public static class __CLR4_5_25dp5dplvha79ad{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,7119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * The ordering scheme used in this range.
     */
    private final Comparator<T> comparator;
    /**
     * The minimum value in this range (inclusive).
     */
    private final T minimum;
    /**
     * The maximum value in this range (inclusive).
     */
    private final T maximum;
    /**
     * Cached output hashCode (class is immutable).
     */
    private transient int hashCode;
    /**
     * Cached output toString (class is immutable).
     */
    private transient String toString;

    /**
     * <p>Obtains a range using the specified element as both the minimum
     * and maximum in this range.</p>
     * 
     * <p>The range uses the natural ordering of the elements to determine where
     * values lie in the range.</p>
     *
     * @param <T> the type of the elements in this range
     * @param element  the value to use for this range, not null
     * @return the range object, not null
     * @throws IllegalArgumentException if the element is null
     * @throws ClassCastException if the element is not {@code Comparable}
     */
    public static <T extends Comparable<T>> Range<T> is(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(6973);
        __CLR4_5_25dp5dplvha79ad.R.inc(6974);return between(element, element, null);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Obtains a range using the specified element as both the minimum
     * and maximum in this range.</p>
     * 
     * <p>The range uses the specified {@code Comparator} to determine where
     * values lie in the range.</p>
     *
     * @param <T> the type of the elements in this range
     * @param element  the value to use for this range, must not be {@code null}
     * @param comparator  the comparator to be used, null for natural ordering
     * @return the range object, not null
     * @throws IllegalArgumentException if the element is null
     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}
     */
    public static <T> Range<T> is(final T element, final Comparator<T> comparator) {try{__CLR4_5_25dp5dplvha79ad.R.inc(6975);
        __CLR4_5_25dp5dplvha79ad.R.inc(6976);return between(element, element, comparator);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Obtains a range with the specified minimum and maximum values (both inclusive).</p>
     * 
     * <p>The range uses the natural ordering of the elements to determine where
     * values lie in the range.</p>
     *
     * <p>The arguments may be passed in the order (min,max) or (max,min).
     * The getMinimum and getMaximum methods will return the correct values.</p>
     *
     * @param <T> the type of the elements in this range
     * @param fromInclusive  the first value that defines the edge of the range, inclusive
     * @param toInclusive  the second value that defines the edge of the range, inclusive
     * @return the range object, not null
     * @throws IllegalArgumentException if either element is null
     * @throws ClassCastException if the elements are not {@code Comparable}
     */
    public static <T extends Comparable<T>> Range<T> between(final T fromInclusive, final T toInclusive) {try{__CLR4_5_25dp5dplvha79ad.R.inc(6977);
        __CLR4_5_25dp5dplvha79ad.R.inc(6978);return between(fromInclusive, toInclusive, null);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Obtains a range with the specified minimum and maximum values (both inclusive).</p>
     * 
     * <p>The range uses the specified {@code Comparator} to determine where
     * values lie in the range.</p>
     *
     * <p>The arguments may be passed in the order (min,max) or (max,min).
     * The getMinimum and getMaximum methods will return the correct values.</p>
     *
     * @param <T> the type of the elements in this range
     * @param fromInclusive  the first value that defines the edge of the range, inclusive
     * @param toInclusive  the second value that defines the edge of the range, inclusive
     * @param comparator  the comparator to be used, null for natural ordering
     * @return the range object, not null
     * @throws IllegalArgumentException if either element is null
     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}
     */
    public static <T> Range<T> between(final T fromInclusive, final T toInclusive, final Comparator<T> comparator) {try{__CLR4_5_25dp5dplvha79ad.R.inc(6979);
        __CLR4_5_25dp5dplvha79ad.R.inc(6980);return new Range<>(fromInclusive, toInclusive, comparator);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * Creates an instance.
     *
     * @param element1  the first element, not null
     * @param element2  the second element, not null
     * @param comp  the comparator to be used, null for natural ordering
     */
    @SuppressWarnings("unchecked")
    private Range(final T element1, final T element2, final Comparator<T> comp) {try{__CLR4_5_25dp5dplvha79ad.R.inc(6981);
        __CLR4_5_25dp5dplvha79ad.R.inc(6982);if ((((element1 == null || element2 == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(6983)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(6984)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(6985);throw new IllegalArgumentException("Elements in a range must not be null: element1=" +
                                               element1 + ", element2=" + element2);
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(6986);if ((((comp == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(6987)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(6988)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(6989);this.comparator = ComparableComparator.INSTANCE;
        } }else {{
            __CLR4_5_25dp5dplvha79ad.R.inc(6990);this.comparator = comp;            
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(6991);if ((((this.comparator.compare(element1, element2) < 1)&&(__CLR4_5_25dp5dplvha79ad.R.iget(6992)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(6993)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(6994);this.minimum = element1;
            __CLR4_5_25dp5dplvha79ad.R.inc(6995);this.maximum = element2;
        } }else {{
            __CLR4_5_25dp5dplvha79ad.R.inc(6996);this.minimum = element2;
            __CLR4_5_25dp5dplvha79ad.R.inc(6997);this.maximum = element1;
        }
    }}finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    // Accessors
    //--------------------------------------------------------------------

    /**
     * <p>Gets the minimum value in this range.</p>
     *
     * @return the minimum value in this range, not null
     */
    public T getMinimum() {try{__CLR4_5_25dp5dplvha79ad.R.inc(6998);
        __CLR4_5_25dp5dplvha79ad.R.inc(6999);return minimum;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Gets the maximum value in this range.</p>
     *
     * @return the maximum value in this range, not null
     */
    public T getMaximum() {try{__CLR4_5_25dp5dplvha79ad.R.inc(7000);
        __CLR4_5_25dp5dplvha79ad.R.inc(7001);return maximum;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Gets the comparator being used to determine if objects are within the range.</p>
     * 
     * <p>Natural ordering uses an internal comparator implementation, thus this
     * method never returns null. See {@link #isNaturalOrdering()}.</p>
     *
     * @return the comparator being used, not null
     */
    public Comparator<T> getComparator() {try{__CLR4_5_25dp5dplvha79ad.R.inc(7002);
        __CLR4_5_25dp5dplvha79ad.R.inc(7003);return comparator;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Whether or not the Range is using the natural ordering of the elements.</p>
     * 
     * <p>Natural ordering uses an internal comparator implementation, thus this
     * method is the only way to check if a null comparator was specified.</p>
     *
     * @return true if using natural ordering
     */
    public boolean isNaturalOrdering() {try{__CLR4_5_25dp5dplvha79ad.R.inc(7004);
        __CLR4_5_25dp5dplvha79ad.R.inc(7005);return comparator == ComparableComparator.INSTANCE;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    // Element tests
    //--------------------------------------------------------------------

    /**
     * <p>Checks whether the specified element occurs within this range.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean contains(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7006);
        __CLR4_5_25dp5dplvha79ad.R.inc(7007);if ((((element == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7008)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7009)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7010);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7011);return comparator.compare(element, minimum) > -1 && comparator.compare(element, maximum) < 1;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is after the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if this range is entirely after the specified element
     */
    public boolean isAfter(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7012);
        __CLR4_5_25dp5dplvha79ad.R.inc(7013);if ((((element == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7014)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7015)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7016);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7017);return comparator.compare(element, minimum) < 0;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range starts with the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean isStartedBy(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7018);
        __CLR4_5_25dp5dplvha79ad.R.inc(7019);if ((((element == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7020)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7021)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7022);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7023);return comparator.compare(element, minimum) == 0;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range ends with the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean isEndedBy(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7024);
        __CLR4_5_25dp5dplvha79ad.R.inc(7025);if ((((element == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7026)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7027)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7028);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7029);return comparator.compare(element, maximum) == 0;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is before the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if this range is entirely before the specified element
     */
    public boolean isBefore(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7030);
        __CLR4_5_25dp5dplvha79ad.R.inc(7031);if ((((element == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7032)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7033)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7034);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7035);return comparator.compare(element, maximum) > 0;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks where the specified element occurs relative to this range.</p>
     * 
     * <p>The API is reminiscent of the Comparable interface returning {@code -1} if
     * the element is before the range, {@code 0} if contained within the range and
     * {@code 1} if the element is after the range. </p>
     *
     * @param element  the element to check for, not null
     * @return -1, 0 or +1 depending on the element's location relative to the range
     */
    public int elementCompareTo(final T element) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7036);
        // Comparable API says throw NPE on null
        __CLR4_5_25dp5dplvha79ad.R.inc(7037);Validate.notNull(element, "Element is null");
        __CLR4_5_25dp5dplvha79ad.R.inc(7038);if ((((isAfter(element))&&(__CLR4_5_25dp5dplvha79ad.R.iget(7039)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7040)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7041);return -1;
        } }else {__CLR4_5_25dp5dplvha79ad.R.inc(7042);if ((((isBefore(element))&&(__CLR4_5_25dp5dplvha79ad.R.iget(7043)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7044)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7045);return 1;
        } }else {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7046);return 0;
        }
    }}}finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    // Range tests
    //--------------------------------------------------------------------

    /**
     * <p>Checks whether this range contains all the elements of the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range contains the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean containsRange(final Range<T> otherRange) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7047);
        __CLR4_5_25dp5dplvha79ad.R.inc(7048);if ((((otherRange == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7049)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7050)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7051);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7052);return contains(otherRange.minimum)
            && contains(otherRange.maximum);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is completely after the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range is completely after the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isAfterRange(final Range<T> otherRange) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7053);
        __CLR4_5_25dp5dplvha79ad.R.inc(7054);if ((((otherRange == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7055)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7056)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7057);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7058);return isAfter(otherRange.maximum);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is overlapped by the specified range.</p>
     * 
     * <p>Two ranges overlap if there is at least one element in common.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to test, null returns false
     * @return true if the specified range overlaps with this
     *  range; otherwise, {@code false}
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isOverlappedBy(final Range<T> otherRange) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7059);
        __CLR4_5_25dp5dplvha79ad.R.inc(7060);if ((((otherRange == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7061)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7062)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7063);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7064);return otherRange.contains(minimum)
            || otherRange.contains(maximum)
            || contains(otherRange.minimum);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is completely before the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range is completely before the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isBeforeRange(final Range<T> otherRange) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7065);
        __CLR4_5_25dp5dplvha79ad.R.inc(7066);if ((((otherRange == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7067)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7068)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7069);return false;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7070);return isBefore(otherRange.minimum);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * Calculate the intersection of {@code this} and an overlapping Range.
     * @param other overlapping Range
     * @return range representing the intersection of {@code this} and {@code other} ({@code this} if equal)
     * @throws IllegalArgumentException if {@code other} does not overlap {@code this}
     * @since 3.0.1
     */
    public Range<T> intersectionWith(final Range<T> other) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7071);
        __CLR4_5_25dp5dplvha79ad.R.inc(7072);if ((((!this.isOverlappedBy(other))&&(__CLR4_5_25dp5dplvha79ad.R.iget(7073)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7074)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7075);throw new IllegalArgumentException(String.format(
                "Cannot calculate intersection with non-overlapping range %s", other));
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7076);if ((((this.equals(other))&&(__CLR4_5_25dp5dplvha79ad.R.iget(7077)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7078)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7079);return this;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7080);final T min = (((getComparator().compare(minimum, other.minimum) < 0 )&&(__CLR4_5_25dp5dplvha79ad.R.iget(7081)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7082)==0&false))? other.minimum : minimum;
        __CLR4_5_25dp5dplvha79ad.R.inc(7083);final T max = (((getComparator().compare(maximum, other.maximum) < 0 )&&(__CLR4_5_25dp5dplvha79ad.R.iget(7084)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7085)==0&false))? maximum : other.maximum;
        __CLR4_5_25dp5dplvha79ad.R.inc(7086);return between(min, max, getComparator());
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    // Basics
    //--------------------------------------------------------------------

    /**
     * <p>Compares this range to another object to test if they are equal.</p>.
     *
     * <p>To be equal, the minimum and maximum values must be equal, which
     * ignores any differences in the comparator.</p>
     *
     * @param obj the reference object with which to compare
     * @return true if this object is equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7087);
        __CLR4_5_25dp5dplvha79ad.R.inc(7088);if ((((obj == this)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7089)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7090)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7091);return true;
        } }else {__CLR4_5_25dp5dplvha79ad.R.inc(7092);if ((((obj == null || obj.getClass() != getClass())&&(__CLR4_5_25dp5dplvha79ad.R.iget(7093)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7094)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7095);return false;
        } }else {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7096);@SuppressWarnings("unchecked") // OK because we checked the class above
            final
            Range<T> range = (Range<T>) obj;
            __CLR4_5_25dp5dplvha79ad.R.inc(7097);return minimum.equals(range.minimum) &&
                   maximum.equals(range.maximum);
        }
    }}}finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Gets a suitable hash code for the range.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_5_25dp5dplvha79ad.R.inc(7098);
        __CLR4_5_25dp5dplvha79ad.R.inc(7099);int result = hashCode;
        __CLR4_5_25dp5dplvha79ad.R.inc(7100);if ((((hashCode == 0)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7101)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7102)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7103);result = 17;
            __CLR4_5_25dp5dplvha79ad.R.inc(7104);result = 37 * result + getClass().hashCode();
            __CLR4_5_25dp5dplvha79ad.R.inc(7105);result = 37 * result + minimum.hashCode();
            __CLR4_5_25dp5dplvha79ad.R.inc(7106);result = 37 * result + maximum.hashCode();
            __CLR4_5_25dp5dplvha79ad.R.inc(7107);hashCode = result;
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7108);return result;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Gets the range as a {@code String}.</p>
     *
     * <p>The format of the String is '[<i>min</i>..<i>max</i>]'.</p>
     *
     * @return the {@code String} representation of this range
     */
    @Override
    public String toString() {try{__CLR4_5_25dp5dplvha79ad.R.inc(7109);
        __CLR4_5_25dp5dplvha79ad.R.inc(7110);if ((((toString == null)&&(__CLR4_5_25dp5dplvha79ad.R.iget(7111)!=0|true))||(__CLR4_5_25dp5dplvha79ad.R.iget(7112)==0&false))) {{
            __CLR4_5_25dp5dplvha79ad.R.inc(7113);toString = "[" + minimum + ".." + maximum + "]";
        }
        }__CLR4_5_25dp5dplvha79ad.R.inc(7114);return toString;
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    /**
     * <p>Formats the receiver using the given format.</p>
     * 
     * <p>This uses {@link java.util.Formattable} to perform the formatting. Three variables may
     * be used to embed the minimum, maximum and comparator.
     * Use {@code %1$s} for the minimum element, {@code %2$s} for the maximum element
     * and {@code %3$s} for the comparator.
     * The default format used by {@code toString()} is {@code [%1$s..%2$s]}.</p>
     * 
     * @param format  the format string, optionally containing {@code %1$s}, {@code %2$s} and  {@code %3$s}, not null
     * @return the formatted string, not null
     */
    public String toString(final String format) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7115);
        __CLR4_5_25dp5dplvha79ad.R.inc(7116);return String.format(format, minimum, maximum, comparator);
    }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings({"rawtypes", "unchecked"})
    private enum ComparableComparator implements Comparator {
        INSTANCE;
        /**
         * Comparable based compare implementation. 
         *
         * @param obj1 left hand side of comparison
         * @param obj2 right hand side of comparison
         * @return negative, 0, positive comparison value
         */
        @Override
        public int compare(final Object obj1, final Object obj2) {try{__CLR4_5_25dp5dplvha79ad.R.inc(7117);
            __CLR4_5_25dp5dplvha79ad.R.inc(7118);return ((Comparable) obj1).compareTo(obj2);
        }finally{__CLR4_5_25dp5dplvha79ad.R.flushNeeded();}}
    }

}
