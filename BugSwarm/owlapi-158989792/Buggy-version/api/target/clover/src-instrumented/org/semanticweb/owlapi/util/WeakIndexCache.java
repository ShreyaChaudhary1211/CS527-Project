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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;

import javax.annotation.Nonnull;

/**
 * A weakly linked cache - elements in the cache can be garbage collected.
 * 
 * @param <K>
 *        key type
 * @param <V>
 *        value type
 */
public class WeakIndexCache<K, V> implements Serializable {public static class __CLR4_5_2c52c52lvicksce{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    protected transient Map<K, WeakReference<V>> prefixCache = CollectionFactory
            .createSyncWeakMap();

    /**
     * @param s
     *        the cache key
     * @param v
     *        the cache value
     * @return the cached value
     */
    @Nonnull
    public V cache(@Nonnull K s, @Nonnull V v) {try{__CLR4_5_2c52c52lvicksce.R.inc(15734);
        __CLR4_5_2c52c52lvicksce.R.inc(15735);WeakReference<V> w = prefixCache.get(s);
        __CLR4_5_2c52c52lvicksce.R.inc(15736);if ((((w != null)&&(__CLR4_5_2c52c52lvicksce.R.iget(15737)!=0|true))||(__CLR4_5_2c52c52lvicksce.R.iget(15738)==0&false))) {{
            __CLR4_5_2c52c52lvicksce.R.inc(15739);V toReturn = w.get();
            __CLR4_5_2c52c52lvicksce.R.inc(15740);if ((((toReturn != null)&&(__CLR4_5_2c52c52lvicksce.R.iget(15741)!=0|true))||(__CLR4_5_2c52c52lvicksce.R.iget(15742)==0&false))) {{
                __CLR4_5_2c52c52lvicksce.R.inc(15743);return toReturn;
            }
        }}
        // need to add the new key and return it
        }__CLR4_5_2c52c52lvicksce.R.inc(15744);prefixCache.put(s, new WeakReference<>(v));
        __CLR4_5_2c52c52lvicksce.R.inc(15745);return v;
    }finally{__CLR4_5_2c52c52lvicksce.R.flushNeeded();}}

    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {try{__CLR4_5_2c52c52lvicksce.R.inc(15746);
        __CLR4_5_2c52c52lvicksce.R.inc(15747);in.defaultReadObject();
        __CLR4_5_2c52c52lvicksce.R.inc(15748);prefixCache = CollectionFactory.createSyncWeakMap();
    }finally{__CLR4_5_2c52c52lvicksce.R.flushNeeded();}}

    /**
     * @param k
     *        the key
     * @return the value
     */
    public V get(K k) {try{__CLR4_5_2c52c52lvicksce.R.inc(15749);
        __CLR4_5_2c52c52lvicksce.R.inc(15750);WeakReference<V> w = prefixCache.get(k);
        __CLR4_5_2c52c52lvicksce.R.inc(15751);if ((((w != null)&&(__CLR4_5_2c52c52lvicksce.R.iget(15752)!=0|true))||(__CLR4_5_2c52c52lvicksce.R.iget(15753)==0&false))) {{
            __CLR4_5_2c52c52lvicksce.R.inc(15754);V toReturn = w.get();
            __CLR4_5_2c52c52lvicksce.R.inc(15755);return toReturn;
        }
        }__CLR4_5_2c52c52lvicksce.R.inc(15756);return null;
    }finally{__CLR4_5_2c52c52lvicksce.R.flushNeeded();}}

    /**
     * @param k
     *        the key to check
     * @return true if the cache contains k as a key; note that, due to the
     *         nature of this cache, by the time the method returns the key may
     *         no longer be in the map.
     */
    public boolean contains(K k) {try{__CLR4_5_2c52c52lvicksce.R.inc(15757);
        __CLR4_5_2c52c52lvicksce.R.inc(15758);WeakReference<V> w = prefixCache.get(k);
        __CLR4_5_2c52c52lvicksce.R.inc(15759);if ((((w != null)&&(__CLR4_5_2c52c52lvicksce.R.iget(15760)!=0|true))||(__CLR4_5_2c52c52lvicksce.R.iget(15761)==0&false))) {{
            __CLR4_5_2c52c52lvicksce.R.inc(15762);V toReturn = w.get();
            __CLR4_5_2c52c52lvicksce.R.inc(15763);if ((((toReturn != null)&&(__CLR4_5_2c52c52lvicksce.R.iget(15764)!=0|true))||(__CLR4_5_2c52c52lvicksce.R.iget(15765)==0&false))) {{
                __CLR4_5_2c52c52lvicksce.R.inc(15766);return true;
            }
        }}
        }__CLR4_5_2c52c52lvicksce.R.inc(15767);return false;
    }finally{__CLR4_5_2c52c52lvicksce.R.flushNeeded();}}

    /** empty the cache. */
    public void clear() {try{__CLR4_5_2c52c52lvicksce.R.inc(15768);
        __CLR4_5_2c52c52lvicksce.R.inc(15769);prefixCache.clear();
    }finally{__CLR4_5_2c52c52lvicksce.R.flushNeeded();}}
}
