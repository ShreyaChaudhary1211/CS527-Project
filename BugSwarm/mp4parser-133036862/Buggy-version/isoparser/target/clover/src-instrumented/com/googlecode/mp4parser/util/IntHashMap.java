/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.util;/*
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

/*
 * Note: originally released under the GNU LGPL v2.1, 
 * but rereleased by the original author under the ASF license (above).
 */

/**
 * <p>A hash map that uses primitive ints for the key rather than objects.</p>
 * <p>Note that this class is for internal optimization purposes only, and may
 * not be supported in future releases of Apache Commons Lang.  Utilities of
 * this sort may be included in future releases of Apache Commons Collections.</p>
 *
 * @author Justin Couch
 * @author Alex Chaffee (alex@apache.org)
 * @author Stephen Colebourne
 * @version $Revision: 561230 $
 * @see java.util.HashMap
 * @since 2.0
 */
public class IntHashMap {public static class __CLR4_5_2fkmfkmlvlulned{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The hash table data.
     */
    private transient Entry table[];

    /**
     * The total number of entries in the hash table.
     */
    private transient int count;

    /**
     * The table is rehashed when its size exceeds this threshold.  (The
     * value of this field is (int)(capacity * loadFactor).)
     *
     * @serial
     */
    private int threshold;

    /**
     * The load factor for the hashtable.
     *
     * @serial
     */
    private float loadFactor;

    /**
     * <p>Innerclass that acts as a datastructure to create a new entry in the
     * table.</p>
     */
    private static class Entry {
        int hash;
        int key;
        Object value;
        Entry next;

        /**
         * <p>Create a new entry with the given values.</p>
         *
         * @param hash  The code used to hash the object with
         * @param key   The key used to enter this in the table
         * @param value The value for this key
         * @param next  A reference to the next entry in the table
         */
        protected Entry(int hash, int key, Object value, Entry next) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20182);
            __CLR4_5_2fkmfkmlvlulned.R.inc(20183);this.hash = hash;
            __CLR4_5_2fkmfkmlvlulned.R.inc(20184);this.key = key;
            __CLR4_5_2fkmfkmlvlulned.R.inc(20185);this.value = value;
            __CLR4_5_2fkmfkmlvlulned.R.inc(20186);this.next = next;
        }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}
    }

    /**
     * <p>Constructs a new, empty hashtable with a default capacity and load
     * factor, which is <code>20</code> and <code>0.75</code> respectively.</p>
     */
    public IntHashMap() {
        this(20, 0.75f);__CLR4_5_2fkmfkmlvlulned.R.inc(20188);try{__CLR4_5_2fkmfkmlvlulned.R.inc(20187);
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Constructs a new, empty hashtable with the specified initial capacity
     * and default load factor, which is <code>0.75</code>.</p>
     *
     * @param initialCapacity the initial capacity of the hashtable.
     * @throws IllegalArgumentException if the initial capacity is less
     *                                  than zero.
     */
    public IntHashMap(int initialCapacity) {
        this(initialCapacity, 0.75f);__CLR4_5_2fkmfkmlvlulned.R.inc(20190);try{__CLR4_5_2fkmfkmlvlulned.R.inc(20189);
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Constructs a new, empty hashtable with the specified initial
     * capacity and the specified load factor.</p>
     *
     * @param initialCapacity the initial capacity of the hashtable.
     * @param loadFactor      the load factor of the hashtable.
     * @throws IllegalArgumentException if the initial capacity is less
     *                                  than zero, or if the load factor is nonpositive.
     */
    public IntHashMap(int initialCapacity, float loadFactor) {
        super();__CLR4_5_2fkmfkmlvlulned.R.inc(20192);try{__CLR4_5_2fkmfkmlvlulned.R.inc(20191);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20193);if ((((initialCapacity < 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20194)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20195)==0&false))) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20196);throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20197);if ((((loadFactor <= 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20198)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20199)==0&false))) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20200);throw new IllegalArgumentException("Illegal Load: " + loadFactor);
        }
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20201);if ((((initialCapacity == 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20202)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20203)==0&false))) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20204);initialCapacity = 1;
        }

        }__CLR4_5_2fkmfkmlvlulned.R.inc(20205);this.loadFactor = loadFactor;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20206);table = new Entry[initialCapacity];
        __CLR4_5_2fkmfkmlvlulned.R.inc(20207);threshold = (int) (initialCapacity * loadFactor);
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Returns the number of keys in this hashtable.</p>
     *
     * @return the number of keys in this hashtable.
     */
    public int size() {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20208);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20209);return count;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Tests if this hashtable maps no keys to values.</p>
     *
     * @return <code>true</code> if this hashtable maps no keys to values;
     *         <code>false</code> otherwise.
     */
    public boolean isEmpty() {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20210);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20211);return count == 0;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Tests if some key maps into the specified value in this hashtable.
     * This operation is more expensive than the <code>containsKey</code>
     * method.</p>
     * <p>Note that this method is identical in functionality to containsValue,
     * (which is part of the Map interface in the collections framework).</p>
     *
     * @param value a value to search for.
     * @return <code>true</code> if and only if some key maps to the
     *         <code>value</code> argument in this hashtable as
     *         determined by the <tt>equals</tt> method;
     *         <code>false</code> otherwise.
     * @throws NullPointerException if the value is <code>null</code>.
     * @see #containsKey(int)
     * @see #containsValue(Object)
     * @see java.util.Map
     */
    public boolean contains(Object value) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20212);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20213);if ((((value == null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20214)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20215)==0&false))) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20216);throw new NullPointerException();
        }

        }__CLR4_5_2fkmfkmlvlulned.R.inc(20217);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20218);for (int i = tab.length; (((i-- > 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20219)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20220)==0&false)); ) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20221);for (Entry e = tab[i]; (((e != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20222)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20223)==0&false)); e = e.next) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20224);if ((((e.value.equals(value))&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20225)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20226)==0&false))) {{
                    __CLR4_5_2fkmfkmlvlulned.R.inc(20227);return true;
                }
            }}
        }}
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20228);return false;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if this HashMap maps one or more keys
     * to this value.</p>
     * <p>Note that this method is identical in functionality to contains
     * (which predates the Map interface).</p>
     *
     * @param value value whose presence in this HashMap is to be tested.
     * @return boolean <code>true</code> if the value is contained
     * @see java.util.Map
     * @since JDK1.2
     */
    public boolean containsValue(Object value) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20229);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20230);return contains(value);
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Tests if the specified object is a key in this hashtable.</p>
     *
     * @param key possible key.
     * @return <code>true</code> if and only if the specified object is a
     *         key in this hashtable, as determined by the <tt>equals</tt>
     *         method; <code>false</code> otherwise.
     * @see #contains(Object)
     */
    public boolean containsKey(int key) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20231);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20232);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20233);int hash = key;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20234);int index = (hash & 0x7FFFFFFF) % tab.length;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20235);for (Entry e = tab[index]; (((e != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20236)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20237)==0&false)); e = e.next) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20238);if ((((e.hash == hash)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20239)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20240)==0&false))) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20241);return true;
            }
        }}
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20242);return false;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Returns the value to which the specified key is mapped in this map.</p>
     *
     * @param key a key in the hashtable.
     * @return the value to which the key is mapped in this hashtable;
     *         <code>null</code> if the key is not mapped to any value in
     *         this hashtable.
     * @see #put(int, Object)
     */
    public Object get(int key) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20243);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20244);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20245);int hash = key;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20246);int index = (hash & 0x7FFFFFFF) % tab.length;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20247);for (Entry e = tab[index]; (((e != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20248)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20249)==0&false)); e = e.next) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20250);if ((((e.hash == hash)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20251)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20252)==0&false))) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20253);return e.value;
            }
        }}
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20254);return null;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Increases the capacity of and internally reorganizes this
     * hashtable, in order to accommodate and access its entries more
     * efficiently.</p>
     * <p>This method is called automatically when the number of keys
     * in the hashtable exceeds this hashtable's capacity and load
     * factor.</p>
     */
    protected void rehash() {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20255);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20256);int oldCapacity = table.length;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20257);Entry oldMap[] = table;

        __CLR4_5_2fkmfkmlvlulned.R.inc(20258);int newCapacity = oldCapacity * 2 + 1;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20259);Entry newMap[] = new Entry[newCapacity];

        __CLR4_5_2fkmfkmlvlulned.R.inc(20260);threshold = (int) (newCapacity * loadFactor);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20261);table = newMap;

        __CLR4_5_2fkmfkmlvlulned.R.inc(20262);for (int i = oldCapacity; (((i-- > 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20263)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20264)==0&false)); ) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20265);for (Entry old = oldMap[i]; (((old != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20266)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20267)==0&false)); ) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20268);Entry e = old;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20269);old = old.next;

                __CLR4_5_2fkmfkmlvlulned.R.inc(20270);int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20271);e.next = newMap[index];
                __CLR4_5_2fkmfkmlvlulned.R.inc(20272);newMap[index] = e;
            }
        }}
    }}finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Maps the specified <code>key</code> to the specified
     * <code>value</code> in this hashtable. The key cannot be
     * <code>null</code>. </p>
     * <p>The value can be retrieved by calling the <code>get</code> method
     * with a key that is equal to the original key.</p>
     *
     * @param key   the hashtable key.
     * @param value the value.
     * @return the previous value of the specified key in this hashtable,
     *         or <code>null</code> if it did not have one.
     * @throws NullPointerException if the key is <code>null</code>.
     * @see #get(int)
     */
    public Object put(int key, Object value) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20273);
        // Makes sure the key is not already in the hashtable.
        __CLR4_5_2fkmfkmlvlulned.R.inc(20274);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20275);int hash = key;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20276);int index = (hash & 0x7FFFFFFF) % tab.length;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20277);for (Entry e = tab[index]; (((e != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20278)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20279)==0&false)); e = e.next) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20280);if ((((e.hash == hash)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20281)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20282)==0&false))) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20283);Object old = e.value;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20284);e.value = value;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20285);return old;
            }
        }}

        }__CLR4_5_2fkmfkmlvlulned.R.inc(20286);if ((((count >= threshold)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20287)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20288)==0&false))) {{
            // Rehash the table if the threshold is exceeded
            __CLR4_5_2fkmfkmlvlulned.R.inc(20289);rehash();

            __CLR4_5_2fkmfkmlvlulned.R.inc(20290);tab = table;
            __CLR4_5_2fkmfkmlvlulned.R.inc(20291);index = (hash & 0x7FFFFFFF) % tab.length;
        }

        // Creates the new entry.
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20292);Entry e = new Entry(hash, key, value, tab[index]);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20293);tab[index] = e;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20294);count++;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20295);return null;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Removes the key (and its corresponding value) from this
     * hashtable.</p>
     * <p>This method does nothing if the key is not present in the
     * hashtable.</p>
     *
     * @param key the key that needs to be removed.
     * @return the value to which the key had been mapped in this hashtable,
     *         or <code>null</code> if the key did not have a mapping.
     */
    public Object remove(int key) {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20296);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20297);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20298);int hash = key;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20299);int index = (hash & 0x7FFFFFFF) % tab.length;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20300);for (Entry e = tab[index], prev = null; (((e != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20301)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20302)==0&false)); prev = e, e = e.next) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20303);if ((((e.hash == hash)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20304)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20305)==0&false))) {{
                __CLR4_5_2fkmfkmlvlulned.R.inc(20306);if ((((prev != null)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20307)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20308)==0&false))) {{
                    __CLR4_5_2fkmfkmlvlulned.R.inc(20309);prev.next = e.next;
                } }else {{
                    __CLR4_5_2fkmfkmlvlulned.R.inc(20310);tab[index] = e.next;
                }
                }__CLR4_5_2fkmfkmlvlulned.R.inc(20311);count--;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20312);Object oldValue = e.value;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20313);e.value = null;
                __CLR4_5_2fkmfkmlvlulned.R.inc(20314);return oldValue;
            }
        }}
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20315);return null;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

    /**
     * <p>Clears this hashtable so that it contains no keys.</p>
     */
    public synchronized void clear() {try{__CLR4_5_2fkmfkmlvlulned.R.inc(20316);
        __CLR4_5_2fkmfkmlvlulned.R.inc(20317);Entry tab[] = table;
        __CLR4_5_2fkmfkmlvlulned.R.inc(20318);for (int index = tab.length; (((--index >= 0)&&(__CLR4_5_2fkmfkmlvlulned.R.iget(20319)!=0|true))||(__CLR4_5_2fkmfkmlvlulned.R.iget(20320)==0&false)); ) {{
            __CLR4_5_2fkmfkmlvlulned.R.inc(20321);tab[index] = null;
        }
        }__CLR4_5_2fkmfkmlvlulned.R.inc(20322);count = 0;
    }finally{__CLR4_5_2fkmfkmlvlulned.R.flushNeeded();}}

}

