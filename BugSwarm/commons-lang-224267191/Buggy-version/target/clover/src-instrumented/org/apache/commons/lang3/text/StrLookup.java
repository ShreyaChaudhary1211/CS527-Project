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
package org.apache.commons.lang3.text;

import java.util.Map;

/**
 * Lookup a String key to a String value.
 * <p>
 * This class represents the simplest form of a string to string map.
 * It has a benefit over a map in that it can create the result on
 * demand based on the key.
 * <p>
 * This class comes complete with various factory methods.
 * If these do not suffice, you can subclass and implement your own matcher.
 * <p>
 * For example, it would be possible to implement a lookup that used the
 * key as a primary key, and looked up the value on demand from the database
 *
 * @since 2.2
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/StrLookup.html">
 * StrLookup</a> instead
 */
@Deprecated
public abstract class StrLookup<V> {public static class __CLR4_5_2fhcfhclvha7bnm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,20092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Lookup that always returns null.
     */
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup<>(null);

    /**
     * Lookup based on system properties.
     */
    private static final StrLookup<String> SYSTEM_PROPERTIES_LOOKUP = new SystemPropertiesStrLookup();

    //-----------------------------------------------------------------------
    /**
     * Returns a lookup which always returns null.
     *
     * @return a lookup that always returns null, not null
     */
    public static StrLookup<?> noneLookup() {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20064);
        __CLR4_5_2fhcfhclvha7bnm.R.inc(20065);return NONE_LOOKUP;
    }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}

    /**
     * Returns a new lookup which uses a copy of the current
     * {@link System#getProperties() System properties}.
     * <p>
     * If a security manager blocked access to system properties, then null will
     * be returned from every lookup.
     * <p>
     * If a null key is used, this lookup will throw a NullPointerException.
     *
     * @return a lookup using system properties, not null
     */
    public static StrLookup<String> systemPropertiesLookup() {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20066);
        __CLR4_5_2fhcfhclvha7bnm.R.inc(20067);return SYSTEM_PROPERTIES_LOOKUP;
    }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}

    /**
     * Returns a lookup which looks up values using a map.
     * <p>
     * If the map is null, then null will be returned from every lookup.
     * The map result object is converted to a string using toString().
     *
     * @param <V> the type of the values supported by the lookup
     * @param map  the map of keys to values, may be null
     * @return a lookup using the map, not null
     */
    public static <V> StrLookup<V> mapLookup(final Map<String, V> map) {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20068);
        __CLR4_5_2fhcfhclvha7bnm.R.inc(20069);return new MapStrLookup<>(map);
    }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     */
    protected StrLookup() {
        super();__CLR4_5_2fhcfhclvha7bnm.R.inc(20071);try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20070);
    }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}

    /**
     * Looks up a String key to a String value.
     * <p>
     * The internal implementation may use any mechanism to return the value.
     * The simplest implementation is to use a Map. However, virtually any
     * implementation is possible.
     * <p>
     * For example, it would be possible to implement a lookup that used the
     * key as a primary key, and looked up the value on demand from the database
     * Or, a numeric based implementation could be created that treats the key
     * as an integer, increments the value and return the result as a string -
     * converting 1 to 2, 15 to 16 etc.
     * <p>
     * The {@link #lookup(String)} method always returns a String, regardless of
     * the underlying data, by converting it as necessary. For example:
     * <pre>
     * Map&lt;String, Object&gt; map = new HashMap&lt;String, Object&gt;();
     * map.put("number", Integer.valueOf(2));
     * assertEquals("2", StrLookup.mapLookup(map).lookup("number"));
     * </pre>
     * @param key  the key to be looked up, may be null
     * @return the matching value, null if no match
     */
    public abstract String lookup(String key);

    //-----------------------------------------------------------------------
    /**
     * Lookup implementation that uses a Map.
     */
    static class MapStrLookup<V> extends StrLookup<V> {

        /** Map keys are variable names and value. */
        private final Map<String, V> map;

        /**
         * Creates a new instance backed by a Map.
         *
         * @param map  the map of keys to values, may be null
         */
        MapStrLookup(final Map<String, V> map) {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20072);
            __CLR4_5_2fhcfhclvha7bnm.R.inc(20073);this.map = map;
        }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}

        /**
         * Looks up a String key to a String value using the map.
         * <p>
         * If the map is null, then null is returned.
         * The map result object is converted to a string using toString().
         *
         * @param key  the key to be looked up, may be null
         * @return the matching value, null if no match
         */
        @Override
        public String lookup(final String key) {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20074);
            __CLR4_5_2fhcfhclvha7bnm.R.inc(20075);if ((((map == null)&&(__CLR4_5_2fhcfhclvha7bnm.R.iget(20076)!=0|true))||(__CLR4_5_2fhcfhclvha7bnm.R.iget(20077)==0&false))) {{
                __CLR4_5_2fhcfhclvha7bnm.R.inc(20078);return null;
            }
            }__CLR4_5_2fhcfhclvha7bnm.R.inc(20079);final Object obj = map.get(key);
            __CLR4_5_2fhcfhclvha7bnm.R.inc(20080);if ((((obj == null)&&(__CLR4_5_2fhcfhclvha7bnm.R.iget(20081)!=0|true))||(__CLR4_5_2fhcfhclvha7bnm.R.iget(20082)==0&false))) {{
                __CLR4_5_2fhcfhclvha7bnm.R.inc(20083);return null;
            }
            }__CLR4_5_2fhcfhclvha7bnm.R.inc(20084);return obj.toString();
        }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Lookup implementation based on system properties.
     */
    private static class SystemPropertiesStrLookup extends StrLookup<String> {
        /**
         * {@inheritDoc} This implementation directly accesses system properties.
         */
        @Override
        public String lookup(final String key) {try{__CLR4_5_2fhcfhclvha7bnm.R.inc(20085);
            __CLR4_5_2fhcfhclvha7bnm.R.inc(20086);if ((((key.length() > 0)&&(__CLR4_5_2fhcfhclvha7bnm.R.iget(20087)!=0|true))||(__CLR4_5_2fhcfhclvha7bnm.R.iget(20088)==0&false))) {{
                __CLR4_5_2fhcfhclvha7bnm.R.inc(20089);try {
                    __CLR4_5_2fhcfhclvha7bnm.R.inc(20090);return System.getProperty(key);
                } catch (final SecurityException scex) {
                    // Squelched. All lookup(String) will return null.
                }
            }
            }__CLR4_5_2fhcfhclvha7bnm.R.inc(20091);return null;
        }finally{__CLR4_5_2fhcfhclvha7bnm.R.flushNeeded();}}
    }
}
