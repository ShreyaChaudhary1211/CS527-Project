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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;

import com.google.common.collect.Iterables;

import gnu.trove.map.hash.THashMap;
import gnu.trove.set.hash.THashSet;
import uk.ac.manchester.cs.owl.owlapi.InitVisitorFactory.InitCollectionVisitor;
import uk.ac.manchester.cs.owl.owlapi.InitVisitorFactory.InitVisitor;
import uk.ac.manchester.cs.owl.owlapi.util.collections.SmallSet;

/**
 * * Objects that identify contained maps - so that getting the keys of a
 * specific map does not require a specific method for each map nor does it
 * require the map to be copied and returned.
 * 
 * @author ignazio
 * @param <K>
 *        key
 * @param <V>
 *        value
 */
public class MapPointer<K, V extends OWLAxiom> {public static class __CLR4_5_21vd1vdlviclf92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,2683,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final float DEFAULT_LOAD_FACTOR = 0.75F;
    private static final int DEFAULT_INITIAL_CAPACITY = 5;
    @Nullable
    private final AxiomType<?> type;
    @Nullable
    private final OWLAxiomVisitorEx<?> visitor;
    private boolean initialized;
    @Nonnull
    protected final Internals i;
    private SoftReference<Set<IRI>> iris;
    private int size = 0;
    private final THashMap<K, Collection<V>> map = new THashMap<>(17, 0.75F);
    private boolean neverTrimmed = true;

    /**
     * @param t
     *        type of axioms contained
     * @param v
     *        visitor
     * @param initialized
     *        true if initialized
     * @param i
     *        internals containing this pointer
     */
    public MapPointer(@Nullable AxiomType<?> t, @Nullable OWLAxiomVisitorEx<?> v, boolean initialized,
        @Nonnull Internals i) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2425);
        __CLR4_5_21vd1vdlviclf92.R.inc(2426);type = t;
        __CLR4_5_21vd1vdlviclf92.R.inc(2427);visitor = v;
        __CLR4_5_21vd1vdlviclf92.R.inc(2428);this.initialized = initialized;
        __CLR4_5_21vd1vdlviclf92.R.inc(2429);this.i = checkNotNull(i, "i cannot be null");
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param e
     *        entity
     * @return true if an entity with the same iri as the input exists in the
     *         collection
     */
    public synchronized boolean containsReference(OWLEntity e) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2430);
        __CLR4_5_21vd1vdlviclf92.R.inc(2431);return map.containsKey(e);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param e
     *        IRI
     * @return true if an entity with the same iri as the input exists in the
     *         collection
     */
    public synchronized boolean containsReference(IRI e) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2432);
        __CLR4_5_21vd1vdlviclf92.R.inc(2433);Set<IRI> set = null;
        __CLR4_5_21vd1vdlviclf92.R.inc(2434);if ((((iris != null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2435)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2436)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2437);set = iris.get();
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2438);if ((((set == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2439)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2440)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2441);set = initSet();
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2442);return set.contains(e);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    private Set<IRI> initSet() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2443);
        __CLR4_5_21vd1vdlviclf92.R.inc(2444);Set<IRI> set = CollectionFactory.createSet();
        __CLR4_5_21vd1vdlviclf92.R.inc(2445);for (K k : map.keySet()) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2446);if ((((k instanceof OWLEntity)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2447)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2448)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2449);set.add(((OWLEntity) k).getIRI());
            } }else {__CLR4_5_21vd1vdlviclf92.R.inc(2450);if ((((k instanceof IRI)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2451)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2452)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2453);set.add((IRI) k);
            }
        }}}
        }__CLR4_5_21vd1vdlviclf92.R.inc(2454);iris = new SoftReference<>(set);
        __CLR4_5_21vd1vdlviclf92.R.inc(2455);return set;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @return true if initialized
     */
    public synchronized boolean isInitialized() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2456);
        __CLR4_5_21vd1vdlviclf92.R.inc(2457);return initialized;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * init the map pointer
     * 
     * @return the map pointer
     */
    @SuppressWarnings({ "unchecked", "null" })
    public synchronized MapPointer<K, V> init() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2458);
        __CLR4_5_21vd1vdlviclf92.R.inc(2459);if ((((initialized)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2460)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2461)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2462);return this;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2463);initialized = true;
        __CLR4_5_21vd1vdlviclf92.R.inc(2464);if ((((visitor == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2465)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2466)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2467);return this;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2468);if ((((visitor instanceof InitVisitor)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2469)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2470)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2471);for (V ax : (Collection<V>) i.getAxiomsByType().getValues(type)) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2472);K key = ax.accept((InitVisitor<K>) visitor);
                // this can only be null because the visitor return nulls in
                // methods that do not declare it
                __CLR4_5_21vd1vdlviclf92.R.inc(2473);if ((((key != null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2474)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2475)==0&false))) {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2476);putInternal(key, ax);
                }
            }}
        }} }else {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2477);for (V ax : (Collection<V>) i.getAxiomsByType().getValues(type)) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2478);Collection<K> keys = ax.accept((InitCollectionVisitor<K>) visitor);
                __CLR4_5_21vd1vdlviclf92.R.inc(2479);for (K key : keys) {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2480);putInternal(key, ax);
                }
            }}
        }}
        }__CLR4_5_21vd1vdlviclf92.R.inc(2481);return this;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    @Nonnull
    @Override
    public synchronized String toString() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2482);
        __CLR4_5_21vd1vdlviclf92.R.inc(2483);return initialized + map.toString();
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @return keyset
     */
    @Nonnull
    public synchronized Iterable<K> keySet() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2484);
        __CLR4_5_21vd1vdlviclf92.R.inc(2485);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2486);Set<K> keySet = map.keySet();
        assert (((keySet != null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2487)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2488)==0&false));
        __CLR4_5_21vd1vdlviclf92.R.inc(2489);return keySet;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to look up
     * @return value
     */
    @Nonnull
    public synchronized List<V> getValues(K key) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2490);
        __CLR4_5_21vd1vdlviclf92.R.inc(2491);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2492);return get(key);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param <T>
     *        type of key
     * @param filter
     *        filter to satisfy
     * @param key
     *        key
     * @return set of values
     */
    @Nonnull
    public synchronized <T> Collection<OWLAxiom> filterAxioms(@Nonnull OWLAxiomSearchFilter filter, @Nonnull T key) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2493);
        __CLR4_5_21vd1vdlviclf92.R.inc(2494);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2495);List<OWLAxiom> toReturn = new ArrayList<>();
        __CLR4_5_21vd1vdlviclf92.R.inc(2496);for (AxiomType<?> at : filter.getAxiomTypes()) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2497);Collection<V> collection = map.get(at);
            __CLR4_5_21vd1vdlviclf92.R.inc(2498);if ((((collection != null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2499)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2500)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2501);for (OWLAxiom ax : collection) {{
                    assert (((ax != null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2502)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2503)==0&false));
                    __CLR4_5_21vd1vdlviclf92.R.inc(2504);if ((((filter.pass(ax, key))&&(__CLR4_5_21vd1vdlviclf92.R.iget(2505)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2506)==0&false))) {{
                        __CLR4_5_21vd1vdlviclf92.R.inc(2507);toReturn.add(ax);
                    }
                }}
            }}
        }}
        }__CLR4_5_21vd1vdlviclf92.R.inc(2508);return toReturn;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to look up
     * @return true if there are values for key
     */
    public synchronized boolean hasValues(K key) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2509);
        __CLR4_5_21vd1vdlviclf92.R.inc(2510);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2511);return map.containsKey(key);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to add
     * @param value
     *        value to add
     * @return true if addition happens
     */
    public synchronized boolean put(K key, V value) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2512);
        // lazy init: no elements added until a recall is made
        __CLR4_5_21vd1vdlviclf92.R.inc(2513);if ((((!initialized)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2514)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2515)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2516);return false;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2517);iris = null;
        __CLR4_5_21vd1vdlviclf92.R.inc(2518);return putInternal(key, value);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to look up
     * @param value
     *        value to remove
     * @return true if removal happens
     */
    public synchronized boolean remove(K key, V value) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2519);
        __CLR4_5_21vd1vdlviclf92.R.inc(2520);if ((((!initialized)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2521)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2522)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2523);return false;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2524);iris = null;
        __CLR4_5_21vd1vdlviclf92.R.inc(2525);return removeInternal(key, value);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to look up
     * @return true if there are values for key
     */
    @Nonnull
    public synchronized Boolean containsKey(K key) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2526);
        __CLR4_5_21vd1vdlviclf92.R.inc(2527);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2528);return map.containsKey(key);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @param key
     *        key to look up
     * @param value
     *        value to look up
     * @return true if key and value are contained
     */
    public synchronized boolean contains(K key, V value) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2529);
        __CLR4_5_21vd1vdlviclf92.R.inc(2530);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2531);return containsEntry(key, value);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @return all values contained
     */
    @Nonnull
    public synchronized Iterable<V> getAllValues() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2532);
        __CLR4_5_21vd1vdlviclf92.R.inc(2533);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2534);return values();
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @return number of mapping contained
     */
    public synchronized int size() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2535);
        __CLR4_5_21vd1vdlviclf92.R.inc(2536);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2537);if ((((neverTrimmed)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2538)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2539)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2540);trimToSize();
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2541);return size;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * @return true if empty
     */
    public synchronized boolean isEmpty() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2542);
        __CLR4_5_21vd1vdlviclf92.R.inc(2543);init();
        __CLR4_5_21vd1vdlviclf92.R.inc(2544);return size == 0;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    private boolean putInternal(K k, V v) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2545);
        __CLR4_5_21vd1vdlviclf92.R.inc(2546);Collection<V> set = map.get(k);
        __CLR4_5_21vd1vdlviclf92.R.inc(2547);if ((((set == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2548)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2549)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2550);set = Collections.singleton(v);
            __CLR4_5_21vd1vdlviclf92.R.inc(2551);map.put(k, set);
            __CLR4_5_21vd1vdlviclf92.R.inc(2552);size++;
            __CLR4_5_21vd1vdlviclf92.R.inc(2553);return true;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2554);if ((((set.size() == 1)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2555)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2556)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2557);if ((((set.contains(v))&&(__CLR4_5_21vd1vdlviclf92.R.iget(2558)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2559)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2560);return false;
            } }else {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2561);set = new SmallSet<>(set);
                __CLR4_5_21vd1vdlviclf92.R.inc(2562);map.put(k, set);
            }
        }} }else {__CLR4_5_21vd1vdlviclf92.R.inc(2563);if ((((set.size() == 3)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2564)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2565)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2566);if ((((set.contains(v))&&(__CLR4_5_21vd1vdlviclf92.R.iget(2567)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2568)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2569);return false;
            } }else {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2570);set = makeSet(set, v);
                __CLR4_5_21vd1vdlviclf92.R.inc(2571);map.put(k, set);
                __CLR4_5_21vd1vdlviclf92.R.inc(2572);size++;
                __CLR4_5_21vd1vdlviclf92.R.inc(2573);return true;
            }
        }}
        }}__CLR4_5_21vd1vdlviclf92.R.inc(2574);boolean added = set.add(v);
        __CLR4_5_21vd1vdlviclf92.R.inc(2575);if ((((added)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2576)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2577)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2578);size++;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2579);return added;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    private boolean containsEntry(K k, V v) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2580);
        __CLR4_5_21vd1vdlviclf92.R.inc(2581);Collection<V> t = map.get(k);
        __CLR4_5_21vd1vdlviclf92.R.inc(2582);if ((((t == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2583)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2584)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2585);return false;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2586);return t.contains(v);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    private boolean removeInternal(K k, V v) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2587);
        __CLR4_5_21vd1vdlviclf92.R.inc(2588);if ((((neverTrimmed)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2589)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2590)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2591);trimToSize();
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2592);Collection<V> t = map.get(k);
        __CLR4_5_21vd1vdlviclf92.R.inc(2593);if ((((t == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2594)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2595)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2596);return false;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2597);if ((((t.size() == 1)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2598)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2599)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2600);if ((((t.contains(v))&&(__CLR4_5_21vd1vdlviclf92.R.iget(2601)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2602)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2603);map.remove(k);
                __CLR4_5_21vd1vdlviclf92.R.inc(2604);size--;
                __CLR4_5_21vd1vdlviclf92.R.inc(2605);return true;
            } }else {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2606);return false;
            }
        }}
        }__CLR4_5_21vd1vdlviclf92.R.inc(2607);boolean removed = t.remove(v);
        __CLR4_5_21vd1vdlviclf92.R.inc(2608);if ((((removed)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2609)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2610)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2611);size--;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2612);if ((((t.isEmpty())&&(__CLR4_5_21vd1vdlviclf92.R.iget(2613)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2614)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2615);map.remove(k);
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2616);return removed;
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    private static class THashSetForSet<E> extends THashSet<E> {

        private boolean constructing = true;

        public THashSetForSet(Collection<E> set, E toAdd, int capacity, float load) {
            super(capacity, load);__CLR4_5_21vd1vdlviclf92.R.inc(2618);try{__CLR4_5_21vd1vdlviclf92.R.inc(2617);
            __CLR4_5_21vd1vdlviclf92.R.inc(2619);for (E e : set) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2620);add(e);
            }
            }__CLR4_5_21vd1vdlviclf92.R.inc(2621);add(toAdd);
            __CLR4_5_21vd1vdlviclf92.R.inc(2622);constructing = false;
        }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

        @Override
        protected boolean equals(Object notnull, Object two) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2623);
            // shortcut: during construction from a set, no element is
            // duplicate. The extra element is also guaranteed to be unique,
            // given the use made in this class.
            __CLR4_5_21vd1vdlviclf92.R.inc(2624);if ((((constructing)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2625)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2626)==0&false))) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2627);return notnull == two;
            }
            }__CLR4_5_21vd1vdlviclf92.R.inc(2628);return super.equals(notnull, two);
        }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}
    }

    private Collection<V> makeSet(Collection<V> collection, V extra) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2629);
        __CLR4_5_21vd1vdlviclf92.R.inc(2630);if ((((neverTrimmed)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2631)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2632)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2633);List<V> list = new ArrayList<>(collection);
            __CLR4_5_21vd1vdlviclf92.R.inc(2634);list.add(extra);
            __CLR4_5_21vd1vdlviclf92.R.inc(2635);return list;
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2636);return new THashSetForSet<>(collection, extra, DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    @Nonnull
    private Iterable<V> values() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2637);
        __CLR4_5_21vd1vdlviclf92.R.inc(2638);return Iterables.concat(map.values());
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    @Nonnull
    private List<V> get(K k) {try{__CLR4_5_21vd1vdlviclf92.R.inc(2639);
        __CLR4_5_21vd1vdlviclf92.R.inc(2640);Collection<V> t = map.get(k);
        __CLR4_5_21vd1vdlviclf92.R.inc(2641);if ((((t == null)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2642)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2643)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2644);return CollectionFactory.emptyList();
        }
        }__CLR4_5_21vd1vdlviclf92.R.inc(2645);return new ArrayList<>(t);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    /**
     * Trims the capacity of the map entries . An application can use this
     * operation to minimize the storage of the map pointer instance.
     */
    private static AtomicLong totalInUse = new AtomicLong(0);
    private static AtomicLong totalAllocated = new AtomicLong(0);

    /**
     * Trim internal map to size.
     */
    public synchronized void trimToSize() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2646);
        __CLR4_5_21vd1vdlviclf92.R.inc(2647);if ((((initialized)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2648)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2649)==0&false))) {{
            __CLR4_5_21vd1vdlviclf92.R.inc(2650);map.trimToSize();
            __CLR4_5_21vd1vdlviclf92.R.inc(2651);neverTrimmed = false;
            __CLR4_5_21vd1vdlviclf92.R.inc(2652);for (Map.Entry<K, Collection<V>> entry : map.entrySet()) {{
                __CLR4_5_21vd1vdlviclf92.R.inc(2653);Collection<V> set = entry.getValue();
                __CLR4_5_21vd1vdlviclf92.R.inc(2654);if ((((set instanceof ArrayList)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2655)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2656)==0&false))) {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2657);THashSet<V> value = new THashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
                    __CLR4_5_21vd1vdlviclf92.R.inc(2658);value.addAll(set);
                    __CLR4_5_21vd1vdlviclf92.R.inc(2659);entry.setValue(value);
                    __CLR4_5_21vd1vdlviclf92.R.inc(2660);size = size - set.size() + value.size();
                    __CLR4_5_21vd1vdlviclf92.R.inc(2661);value.trimToSize();
                } }else {__CLR4_5_21vd1vdlviclf92.R.inc(2662);if ((((set instanceof THashSet)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2663)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2664)==0&false))) {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2665);THashSet<V> vs = (THashSet<V>) set;
                    __CLR4_5_21vd1vdlviclf92.R.inc(2666);vs.trimToSize();
                    __CLR4_5_21vd1vdlviclf92.R.inc(2667);totalInUse.addAndGet(set.size());
                    __CLR4_5_21vd1vdlviclf92.R.inc(2668);totalAllocated.addAndGet(vs.capacity());
                } }else {__CLR4_5_21vd1vdlviclf92.R.inc(2669);if ((((set instanceof SmallSet<?>)&&(__CLR4_5_21vd1vdlviclf92.R.iget(2670)!=0|true))||(__CLR4_5_21vd1vdlviclf92.R.iget(2671)==0&false))) {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2672);totalInUse.addAndGet(set.size());
                    __CLR4_5_21vd1vdlviclf92.R.inc(2673);totalAllocated.addAndGet(3);
                } }else {{
                    __CLR4_5_21vd1vdlviclf92.R.inc(2674);totalInUse.addAndGet(1);
                    __CLR4_5_21vd1vdlviclf92.R.inc(2675);totalAllocated.addAndGet(1);
                }
            }}}}
        }}
    }}finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    static void resetCounts() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2676);
        __CLR4_5_21vd1vdlviclf92.R.inc(2677);totalAllocated.set(0);
        __CLR4_5_21vd1vdlviclf92.R.inc(2678);totalInUse.set(0);
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    static long getTotalInUse() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2679);
        __CLR4_5_21vd1vdlviclf92.R.inc(2680);return totalInUse.get();
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}

    static long getTotalAllocated() {try{__CLR4_5_21vd1vdlviclf92.R.inc(2681);
        __CLR4_5_21vd1vdlviclf92.R.inc(2682);return totalAllocated.get();
    }finally{__CLR4_5_21vd1vdlviclf92.R.flushNeeded();}}
}
