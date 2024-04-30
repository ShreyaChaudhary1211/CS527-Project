/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.util;

import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class CollectionFactory {public static class __CLR4_5_255o55olvickpdi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6875,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionFactory.class.getName());
    private static final AtomicInteger EXPECTEDTHREADS = new AtomicInteger(8);

    /**
     * Sort the input collection; if the ordering is unstable and an error is
     * thrown (due to the use of TimSort in JDK 1.7 and newer), catch it and
     * leave the collection unsorted. NOTE: use this method if ordering is
     * desirable but not necessary.
     * 
     * @param <T>
     *        list type
     * @param toReturn
     *        list to sort
     */
    public static <T extends Comparable<T>> void sortOptionallyComparables(@Nonnull List<T> toReturn) {try{__CLR4_5_255o55olvickpdi.R.inc(6684);
        __CLR4_5_255o55olvickpdi.R.inc(6685);try {
            __CLR4_5_255o55olvickpdi.R.inc(6686);Collections.sort(toReturn);
        } catch (IllegalArgumentException e) {
            // catch possible sorting misbehaviour
            __CLR4_5_255o55olvickpdi.R.inc(6687);if ((((!e.getMessage().contains("Comparison method violates its general contract!"))&&(__CLR4_5_255o55olvickpdi.R.iget(6688)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6689)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6690);throw e;
            }
            // otherwise print a warning and leave the list unsorted
            }__CLR4_5_255o55olvickpdi.R.inc(6691);LOGGER.warn("Misbehaving triple comparator, leaving triples unsorted", e);
        }
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * Sort the input collection; if the ordering is unstable and an error is
     * thrown (due to the use of TimSort in JDK 1.7 and newer), catch it and
     * leave the collection unsorted. NOTE: use this method if ordering is
     * desirable but not necessary.
     * 
     * @param toReturn
     *        list to sort
     */
    public static void sortOptionally(@Nonnull List<? extends OWLObject> toReturn) {try{__CLR4_5_255o55olvickpdi.R.inc(6692);
        __CLR4_5_255o55olvickpdi.R.inc(6693);try {
            __CLR4_5_255o55olvickpdi.R.inc(6694);Collections.sort(toReturn);
        } catch (IllegalArgumentException e) {
            // catch possible sorting misbehaviour
            __CLR4_5_255o55olvickpdi.R.inc(6695);if ((((!e.getMessage().contains("Comparison method violates its general contract!"))&&(__CLR4_5_255o55olvickpdi.R.iget(6696)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6697)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6698);throw e;
            }
            // otherwise print a warning and leave the list unsorted
            }__CLR4_5_255o55olvickpdi.R.inc(6699);LOGGER.warn("Misbehaving triple comparator, leaving triples unsorted", e);
        }
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * Sort a copy of the input collection; if the ordering is unstable and an
     * error is thrown (due to the use of TimSort in JDK 1.7 and newer), catch
     * it and leave the collection unsorted. NOTE: use this method if ordering
     * is desirable but not necessary.
     * 
     * @param toReturn
     *        collection to sort
     * @param <T>
     *        list type
     * @return sorted copy of the input, if no errors are raised. Copy of the
     *         original otherwise.
     */
    @Nonnull
    public static <T extends Comparable<T>> List<T> sortOptionallyComparables(@Nonnull Collection<T> toReturn) {try{__CLR4_5_255o55olvickpdi.R.inc(6700);
        __CLR4_5_255o55olvickpdi.R.inc(6701);List<T> list = new ArrayList<>(toReturn);
        __CLR4_5_255o55olvickpdi.R.inc(6702);try {
            __CLR4_5_255o55olvickpdi.R.inc(6703);Collections.sort(list);
        } catch (IllegalArgumentException e) {
            // catch possible sorting misbehaviour
            __CLR4_5_255o55olvickpdi.R.inc(6704);if ((((!e.getMessage().contains("Comparison method violates its general contract!"))&&(__CLR4_5_255o55olvickpdi.R.iget(6705)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6706)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6707);throw e;
            }
            // otherwise print a warning and leave the list unsorted
            }__CLR4_5_255o55olvickpdi.R.inc(6708);LOGGER.warn("Misbehaving triple comparator, leaving triples unsorted", e);
        }
        __CLR4_5_255o55olvickpdi.R.inc(6709);return list;
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * Sort a copy of the input collection; if the ordering is unstable and an
     * error is thrown (due to the use of TimSort in JDK 1.7 and newer), catch
     * it and leave the collection unsorted. NOTE: use this method if ordering
     * is desirable but not necessary.
     * 
     * @param toReturn
     *        collection to sort
     * @param <T>
     *        list type
     * @return sorted copy of the input, if no errors are raised. Copy of the
     *         original otherwise.
     */
    @Nonnull
    public static <T extends OWLObject> List<T> sortOptionally(@Nonnull Collection<T> toReturn) {try{__CLR4_5_255o55olvickpdi.R.inc(6710);
        __CLR4_5_255o55olvickpdi.R.inc(6711);List<T> list = new ArrayList<>(toReturn);
        __CLR4_5_255o55olvickpdi.R.inc(6712);try {
            __CLR4_5_255o55olvickpdi.R.inc(6713);Collections.sort(list);
        } catch (IllegalArgumentException e) {
            // catch possible sorting misbehaviour
            __CLR4_5_255o55olvickpdi.R.inc(6714);if ((((!e.getMessage().contains("Comparison method violates its general contract!"))&&(__CLR4_5_255o55olvickpdi.R.iget(6715)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6716)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6717);throw e;
            }
            // otherwise print a warning and leave the list unsorted
            }__CLR4_5_255o55olvickpdi.R.inc(6718);LOGGER.warn("Misbehaving triple comparator, leaving triples unsorted", e);
        }
        __CLR4_5_255o55olvickpdi.R.inc(6719);return list;
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * Wrapper for Collections.emptySet() to allow nullity annotations.
     * 
     * @param <T>
     *        set type
     * @return empty set
     */
    @Nonnull
    public static <T> Set<T> emptySet() {try{__CLR4_5_255o55olvickpdi.R.inc(6720);
        __CLR4_5_255o55olvickpdi.R.inc(6721);return Collections.emptySet();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param value
     *        the number of expected threads that will access threadsafe
     *        collections; useful for increasing the concurrency in
     *        ConcurrentHashMaps
     */
    public static void setExpectedThreads(int value) {try{__CLR4_5_255o55olvickpdi.R.inc(6722);
        __CLR4_5_255o55olvickpdi.R.inc(6723);EXPECTEDTHREADS.set(value);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return The current number of expected threads.
     */
    public static int getExpectedThreads() {try{__CLR4_5_255o55olvickpdi.R.inc(6724);
        __CLR4_5_255o55olvickpdi.R.inc(6725);return EXPECTEDTHREADS.get();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> createSet() {try{__CLR4_5_255o55olvickpdi.R.inc(6726);
        // TODO large number of sets stay very small, wasting space
        __CLR4_5_255o55olvickpdi.R.inc(6727);return new HashSet<>();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> createLinkedSet() {try{__CLR4_5_255o55olvickpdi.R.inc(6728);
        // TODO large number of sets stay very small, wasting space
        __CLR4_5_255o55olvickpdi.R.inc(6729);return new LinkedHashSet<>();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh non threadsafe list
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> List<T> createList() {try{__CLR4_5_255o55olvickpdi.R.inc(6730);
        __CLR4_5_255o55olvickpdi.R.inc(6731);return new ArrayList<>();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh threadsafe list
     * @param <T>
     *        content type
     */
    @Nonnull
    public static <T> List<T> createSyncList() {try{__CLR4_5_255o55olvickpdi.R.inc(6732);
        __CLR4_5_255o55olvickpdi.R.inc(6733);return new CopyOnWriteArrayList<>();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param i
     *        iterable
     * @return list from iterable
     * @param <T>
     *        type
     */
    @Nonnull
    public static <T> List<T> list(Iterable<T> i) {try{__CLR4_5_255o55olvickpdi.R.inc(6734);
        __CLR4_5_255o55olvickpdi.R.inc(6735);return Lists.newArrayList(i);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param i
     *        iterable
     * @return list from iterable
     * @param <T>
     *        type
     */
    @Nonnull
    @SafeVarargs
    public static <T> List<T> list(T... i) {try{__CLR4_5_255o55olvickpdi.R.inc(6736);
        __CLR4_5_255o55olvickpdi.R.inc(6737);return Lists.newArrayList(i);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param i
     *        iterable
     * @return list from iterable
     * @param <T>
     *        type
     */
    @Nonnull
    public static <T> List<T> list(T i) {try{__CLR4_5_255o55olvickpdi.R.inc(6738);
        __CLR4_5_255o55olvickpdi.R.inc(6739);return Collections.singletonList(i);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return empty list
     * @param <T>
     *        type
     */
    @Nonnull
    public static <T> List<T> emptyList() {try{__CLR4_5_255o55olvickpdi.R.inc(6740);
        __CLR4_5_255o55olvickpdi.R.inc(6741);return Collections.emptyList();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param c
     *        values to add to the set
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> createSet(@Nonnull Collection<T> c) {try{__CLR4_5_255o55olvickpdi.R.inc(6742);
        __CLR4_5_255o55olvickpdi.R.inc(6743);return new HashSet<>(c);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param initialCapacity
     *        initial capacity for the new set
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> createSet(int initialCapacity) {try{__CLR4_5_255o55olvickpdi.R.inc(6744);
        __CLR4_5_255o55olvickpdi.R.inc(6745);return new HashSet<>(initialCapacity);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh map
     * @param <K>
     *        key type
     * @param <V>
     *        value type
     */
    @Nonnull
    public static <K, V> Map<K, V> createMap() {try{__CLR4_5_255o55olvickpdi.R.inc(6746);
        __CLR4_5_255o55olvickpdi.R.inc(6747);return new HashMap<>();
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return a new weak hashmap wrapped as a synchronized map
     * @param <K>
     *        key type
     * @param <V>
     *        value type
     */
    public static <K, V> Map<K, WeakReference<V>> createSyncWeakMap() {try{__CLR4_5_255o55olvickpdi.R.inc(6748);
        __CLR4_5_255o55olvickpdi.R.inc(6749);return Collections.synchronizedMap(new WeakHashMap<K, WeakReference<V>>());
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param elements
     *        values to add to the set
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    @SafeVarargs
    public static <T> Set<T> createSet(@Nonnull T... elements) {try{__CLR4_5_255o55olvickpdi.R.inc(6750);
        __CLR4_5_255o55olvickpdi.R.inc(6751);return Sets.newHashSet(elements);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param element
     *        value to add to the set
     * @return fresh non threadsafe set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> createSet(@Nonnull T element) {try{__CLR4_5_255o55olvickpdi.R.inc(6752);
        __CLR4_5_255o55olvickpdi.R.inc(6753);Set<T> result = createSet();
        __CLR4_5_255o55olvickpdi.R.inc(6754);result.add(element);
        __CLR4_5_255o55olvickpdi.R.inc(6755);return result;
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh threadsafe set
     * @param <T>
     *        set type
     */
    @Nonnull
    public static <T> Set<T> createSyncSet() {try{__CLR4_5_255o55olvickpdi.R.inc(6756);
        __CLR4_5_255o55olvickpdi.R.inc(6757);ConcurrentHashMap<T, Boolean> internalMap = createSyncMap();
        __CLR4_5_255o55olvickpdi.R.inc(6758);return Collections.newSetFromMap(internalMap);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @return fresh threadsafe hashmap
     * @param <K>
     *        key type
     * @param <V>
     *        value type
     */
    @Nonnull
    public static <K, V> ConcurrentHashMap<K, V> createSyncMap() {try{__CLR4_5_255o55olvickpdi.R.inc(6759);
        __CLR4_5_255o55olvickpdi.R.inc(6760);return new ConcurrentHashMap<>(16, 0.75F, EXPECTEDTHREADS.get());
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param source
     *        the collection to lazily copy
     * @return a lazy defensive copy for source; the source collection will not
     *         be copied until a method that modifies the collection gets
     *         called, e.g., add(), addAll()
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> getCopyOnRequestSet(Collection<T> source) {try{__CLR4_5_255o55olvickpdi.R.inc(6761);
        __CLR4_5_255o55olvickpdi.R.inc(6762);return getCopyOnRequestSetFromMutableCollection(source);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param source
     *        source collection
     * @return copy on request that builds a list from the input set
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> getCopyOnRequestSetFromMutableCollection(@Nullable Collection<T> source) {try{__CLR4_5_255o55olvickpdi.R.inc(6763);
        __CLR4_5_255o55olvickpdi.R.inc(6764);if ((((source == null || source.isEmpty())&&(__CLR4_5_255o55olvickpdi.R.iget(6765)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6766)==0&false))) {{
            __CLR4_5_255o55olvickpdi.R.inc(6767);return emptySet();
        }
        }__CLR4_5_255o55olvickpdi.R.inc(6768);return new ConditionalCopySet<>(source, true);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * @param source
     *        the source collection
     * @return copy on request that does not build a list immediately
     * @param <T>
     *        axiom type
     */
    @Nonnull
    public static <T> Set<T> getCopyOnRequestSetFromImmutableCollection(@Nullable Collection<T> source) {try{__CLR4_5_255o55olvickpdi.R.inc(6769);
        __CLR4_5_255o55olvickpdi.R.inc(6770);if ((((source == null || source.isEmpty())&&(__CLR4_5_255o55olvickpdi.R.iget(6771)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6772)==0&false))) {{
            __CLR4_5_255o55olvickpdi.R.inc(6773);return emptySet();
        }
        }__CLR4_5_255o55olvickpdi.R.inc(6774);return new ConditionalCopySet<>(source, false);
    }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

    /**
     * a set implementation that uses a delegate collection for all read-only
     * operations and makes a copy if changes are attempted. Useful for cheap
     * defensive copies: no costly rehashing on the original collection is made
     * unless changes are attempted. Changes are not mirrored back to the
     * original collection, although changes to the original set BEFORE changes
     * to the copy are reflected in the copy. If the source collection is not
     * supposed to change, then this collection behaves just like a regular
     * defensive copy; if the source collection can change, then this collection
     * should be built from a cheap copy of the original collection. For
     * example, if the source collection is a set, it can be copied into a list;
     * the cost of the copy operation from set to list is approximately 1/3 of
     * the cost of copying into a new HashSet. This is not efficient if the most
     * common operations performed on the copy are contains() or containsAll(),
     * since they are more expensive for lists wrt sets; a counter for these
     * calls is maintained by the collection, so if a large number of
     * contains/containsAll calls takes place, the delegate is turned into a
     * regular set. This implementation is not threadsafe even if the source set
     * is: there is no lock during the copy, and the new set is not threadsafe.
     * 
     * @param <T>
     *        the type contained
     */
    public static class ConditionalCopySet<T> implements Set<T> {

        private static final int MAXCONTAINS = 10;
        private boolean copyDone = false;
        protected Collection<T> delegate;
        private int containsCounter = 0;

        /**
         * @param source
         *        initial elements
         * @param listCopy
         *        true if a copy must be made
         */
        public ConditionalCopySet(@Nonnull Collection<T> source, boolean listCopy) {try{__CLR4_5_255o55olvickpdi.R.inc(6775);
            __CLR4_5_255o55olvickpdi.R.inc(6776);if ((((listCopy)&&(__CLR4_5_255o55olvickpdi.R.iget(6777)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6778)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6779);delegate = new ArrayList<>(source);
            } }else {{
                __CLR4_5_255o55olvickpdi.R.inc(6780);delegate = source;
            }
        }}finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_255o55olvickpdi.R.inc(6781);
            __CLR4_5_255o55olvickpdi.R.inc(6782);if ((((obj == null)&&(__CLR4_5_255o55olvickpdi.R.iget(6783)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6784)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6785);return false;
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6786);if ((((this == obj)&&(__CLR4_5_255o55olvickpdi.R.iget(6787)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6788)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6789);return true;
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6790);if ((((obj instanceof ConditionalCopySet)&&(__CLR4_5_255o55olvickpdi.R.iget(6791)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6792)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6793);return delegate.containsAll(((ConditionalCopySet<?>) obj).delegate)
                    && ((ConditionalCopySet<?>) obj).delegate.containsAll(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6794);if ((((obj instanceof Collection)&&(__CLR4_5_255o55olvickpdi.R.iget(6795)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6796)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6797);return delegate.containsAll((Collection<?>) obj) && ((Collection<?>) obj).containsAll(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6798);return false;
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_255o55olvickpdi.R.inc(6799);
            __CLR4_5_255o55olvickpdi.R.inc(6800);return delegate.hashCode();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_255o55olvickpdi.R.inc(6801);
            __CLR4_5_255o55olvickpdi.R.inc(6802);return delegate.toString();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean add(T e) {try{__CLR4_5_255o55olvickpdi.R.inc(6803);
            __CLR4_5_255o55olvickpdi.R.inc(6804);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6805)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6806)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6807);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6808);delegate = new LinkedHashSet<>(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6809);return delegate.add(e);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean addAll(Collection<? extends T> c) {try{__CLR4_5_255o55olvickpdi.R.inc(6810);
            __CLR4_5_255o55olvickpdi.R.inc(6811);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6812)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6813)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6814);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6815);delegate = new LinkedHashSet<>(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6816);return delegate.addAll(c);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public void clear() {try{__CLR4_5_255o55olvickpdi.R.inc(6817);
            __CLR4_5_255o55olvickpdi.R.inc(6818);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6819)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6820)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6821);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6822);delegate = new LinkedHashSet<>();
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6823);delegate.clear();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean contains(Object o) {try{__CLR4_5_255o55olvickpdi.R.inc(6824);
            __CLR4_5_255o55olvickpdi.R.inc(6825);containsCounter++;
            __CLR4_5_255o55olvickpdi.R.inc(6826);if ((((containsCounter >= MAXCONTAINS && !copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6827)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6828)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6829);checkDelegate();
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6830);return delegate.contains(o);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        private void checkDelegate() {try{__CLR4_5_255o55olvickpdi.R.inc(6831);
            // many calls to contains, inefficient if the delegate is not a
            // set
            __CLR4_5_255o55olvickpdi.R.inc(6832);if ((((!(delegate instanceof Set))&&(__CLR4_5_255o55olvickpdi.R.iget(6833)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6834)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6835);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6836);delegate = new LinkedHashSet<>(delegate);
            }
        }}finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean containsAll(Collection<?> c) {try{__CLR4_5_255o55olvickpdi.R.inc(6837);
            __CLR4_5_255o55olvickpdi.R.inc(6838);containsCounter++;
            __CLR4_5_255o55olvickpdi.R.inc(6839);if ((((containsCounter >= MAXCONTAINS && !copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6840)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6841)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6842);checkDelegate();
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6843);return delegate.containsAll(c);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean isEmpty() {try{__CLR4_5_255o55olvickpdi.R.inc(6844);
            __CLR4_5_255o55olvickpdi.R.inc(6845);return delegate.isEmpty();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Nonnull
        @Override
        public Iterator<T> iterator() {try{__CLR4_5_255o55olvickpdi.R.inc(6846);
            __CLR4_5_255o55olvickpdi.R.inc(6847);return delegate.iterator();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean remove(Object o) {try{__CLR4_5_255o55olvickpdi.R.inc(6848);
            __CLR4_5_255o55olvickpdi.R.inc(6849);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6850)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6851)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6852);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6853);delegate = new LinkedHashSet<>(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6854);return delegate.remove(o);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean removeAll(Collection<?> c) {try{__CLR4_5_255o55olvickpdi.R.inc(6855);
            __CLR4_5_255o55olvickpdi.R.inc(6856);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6857)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6858)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6859);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6860);delegate = new LinkedHashSet<>(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6861);return delegate.removeAll(c);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public boolean retainAll(Collection<?> c) {try{__CLR4_5_255o55olvickpdi.R.inc(6862);
            __CLR4_5_255o55olvickpdi.R.inc(6863);if ((((!copyDone)&&(__CLR4_5_255o55olvickpdi.R.iget(6864)!=0|true))||(__CLR4_5_255o55olvickpdi.R.iget(6865)==0&false))) {{
                __CLR4_5_255o55olvickpdi.R.inc(6866);copyDone = true;
                __CLR4_5_255o55olvickpdi.R.inc(6867);delegate = new LinkedHashSet<>(delegate);
            }
            }__CLR4_5_255o55olvickpdi.R.inc(6868);return delegate.retainAll(c);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_255o55olvickpdi.R.inc(6869);
            __CLR4_5_255o55olvickpdi.R.inc(6870);return delegate.size();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Nonnull
        @Override
        public Object[] toArray() {try{__CLR4_5_255o55olvickpdi.R.inc(6871);
            __CLR4_5_255o55olvickpdi.R.inc(6872);return delegate.toArray();
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}

        @Nonnull
        @Override
        public <Type> Type[] toArray(Type[] a) {try{__CLR4_5_255o55olvickpdi.R.inc(6873);
            __CLR4_5_255o55olvickpdi.R.inc(6874);return delegate.toArray(a);
        }finally{__CLR4_5_255o55olvickpdi.R.flushNeeded();}}
    }
}
