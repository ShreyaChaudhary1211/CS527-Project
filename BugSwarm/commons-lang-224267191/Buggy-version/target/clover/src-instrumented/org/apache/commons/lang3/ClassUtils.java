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

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.mutable.MutableObject;

/**
 * <p>Operates on classes without using reflection.</p>
 *
 * <p>This class handles invalid {@code null} inputs as best it can.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>The notion of a {@code canonical name} includes the human
 * readable name for the type, for example {@code int[]}. The
 * non-canonical method variants work with the JVM names, such as
 * {@code [I}. </p>
 *
 * @since 2.0
 */
public class ClassUtils {public static class __CLR4_5_23pe3pelvha78sg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,5370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Inclusivity literals for {@link #hierarchy(Class, Interfaces)}.
     * @since 3.2
     */
    public enum Interfaces {
        INCLUDE, EXCLUDE
    }

    /**
     * The package separator character: <code>'&#x2e;' == {@value}</code>.
     */
    public static final char PACKAGE_SEPARATOR_CHAR = '.';

    /**
     * The package separator String: <code>"&#x2e;"</code>.
     */
    public static final String PACKAGE_SEPARATOR = String.valueOf(PACKAGE_SEPARATOR_CHAR);

    /**
     * The inner class separator character: <code>'$' == {@value}</code>.
     */
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';

    /**
     * The inner class separator String: {@code "$"}.
     */
    public static final String INNER_CLASS_SEPARATOR = String.valueOf(INNER_CLASS_SEPARATOR_CHAR);

    /**
     * Maps names of primitives to their corresponding primitive {@code Class}es.
     */
    private static final Map<String, Class<?>> namePrimitiveMap = new HashMap<>();
    static {try{__CLR4_5_23pe3pelvha78sg.R.inc(4802);
         __CLR4_5_23pe3pelvha78sg.R.inc(4803);namePrimitiveMap.put("boolean", Boolean.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4804);namePrimitiveMap.put("byte", Byte.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4805);namePrimitiveMap.put("char", Character.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4806);namePrimitiveMap.put("short", Short.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4807);namePrimitiveMap.put("int", Integer.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4808);namePrimitiveMap.put("long", Long.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4809);namePrimitiveMap.put("double", Double.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4810);namePrimitiveMap.put("float", Float.TYPE);
         __CLR4_5_23pe3pelvha78sg.R.inc(4811);namePrimitiveMap.put("void", Void.TYPE);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Maps primitive {@code Class}es to their corresponding wrapper {@code Class}.
     */
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<>();
    static {try{__CLR4_5_23pe3pelvha78sg.R.inc(4812);
         __CLR4_5_23pe3pelvha78sg.R.inc(4813);primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4814);primitiveWrapperMap.put(Byte.TYPE, Byte.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4815);primitiveWrapperMap.put(Character.TYPE, Character.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4816);primitiveWrapperMap.put(Short.TYPE, Short.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4817);primitiveWrapperMap.put(Integer.TYPE, Integer.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4818);primitiveWrapperMap.put(Long.TYPE, Long.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4819);primitiveWrapperMap.put(Double.TYPE, Double.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4820);primitiveWrapperMap.put(Float.TYPE, Float.class);
         __CLR4_5_23pe3pelvha78sg.R.inc(4821);primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Maps wrapper {@code Class}es to their corresponding primitive types.
     */
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<>();
    static {try{__CLR4_5_23pe3pelvha78sg.R.inc(4822);
        __CLR4_5_23pe3pelvha78sg.R.inc(4823);for (final Map.Entry<Class<?>, Class<?>> entry : primitiveWrapperMap.entrySet()) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4824);final Class<?> primitiveClass = entry.getKey();
            __CLR4_5_23pe3pelvha78sg.R.inc(4825);final Class<?> wrapperClass = entry.getValue();
            __CLR4_5_23pe3pelvha78sg.R.inc(4826);if ((((!primitiveClass.equals(wrapperClass))&&(__CLR4_5_23pe3pelvha78sg.R.iget(4827)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4828)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(4829);wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
            }
        }}
    }}finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Maps a primitive class name to its corresponding abbreviation used in array class names.
     */
    private static final Map<String, String> abbreviationMap;

    /**
     * Maps an abbreviation used in array class names to corresponding primitive class name.
     */
    private static final Map<String, String> reverseAbbreviationMap;

    /**
     * Feed abbreviation maps
     */
    static {try{__CLR4_5_23pe3pelvha78sg.R.inc(4830);
        __CLR4_5_23pe3pelvha78sg.R.inc(4831);final Map<String, String> m = new HashMap<>();
        __CLR4_5_23pe3pelvha78sg.R.inc(4832);m.put("int", "I");
        __CLR4_5_23pe3pelvha78sg.R.inc(4833);m.put("boolean", "Z");
        __CLR4_5_23pe3pelvha78sg.R.inc(4834);m.put("float", "F");
        __CLR4_5_23pe3pelvha78sg.R.inc(4835);m.put("long", "J");
        __CLR4_5_23pe3pelvha78sg.R.inc(4836);m.put("short", "S");
        __CLR4_5_23pe3pelvha78sg.R.inc(4837);m.put("byte", "B");
        __CLR4_5_23pe3pelvha78sg.R.inc(4838);m.put("double", "D");
        __CLR4_5_23pe3pelvha78sg.R.inc(4839);m.put("char", "C");
        __CLR4_5_23pe3pelvha78sg.R.inc(4840);final Map<String, String> r = new HashMap<>();
        __CLR4_5_23pe3pelvha78sg.R.inc(4841);for (final Map.Entry<String, String> e : m.entrySet()) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4842);r.put(e.getValue(), e.getKey());
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4843);abbreviationMap = Collections.unmodifiableMap(m);
        __CLR4_5_23pe3pelvha78sg.R.inc(4844);reverseAbbreviationMap = Collections.unmodifiableMap(r);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>ClassUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as
     * {@code ClassUtils.getShortClassName(cls)}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ClassUtils() {
      super();__CLR4_5_23pe3pelvha78sg.R.inc(4846);try{__CLR4_5_23pe3pelvha78sg.R.inc(4845);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Short class name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the class name minus the package name for an {@code Object}.</p>
     *
     * @param object  the class to get the short name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the class name of the object without the package name, or the null value
     */
    public static String getShortClassName(final Object object, final String valueIfNull) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4847);
        __CLR4_5_23pe3pelvha78sg.R.inc(4848);if ((((object == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4849)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4850)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4851);return valueIfNull;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4852);return getShortClassName(object.getClass());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the class name minus the package name from a {@code Class}.</p>
     *
     * <p>Consider using the Java 5 API {@link Class#getSimpleName()} instead.
     * The one known difference is that this code will return {@code "Map.Entry"} while
     * the {@code java.lang.Class} variant will simply return {@code "Entry"}. </p>
     *
     * @param cls  the class to get the short name for.
     * @return the class name without the package name or an empty string
     */
    public static String getShortClassName(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4853);
        __CLR4_5_23pe3pelvha78sg.R.inc(4854);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4855)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4856)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4857);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4858);return getShortClassName(cls.getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the class name minus the package name from a String.</p>
     *
     * <p>The string passed in is assumed to be a class name - it is not checked.</p>

     * <p>Note that this method differs from Class.getSimpleName() in that this will
     * return {@code "Map.Entry"} whilst the {@code java.lang.Class} variant will simply
     * return {@code "Entry"}. </p>
     *
     * @param className  the className to get the short name for
     * @return the class name of the class without the package name or an empty string
     */
    public static String getShortClassName(String className) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4859);
        __CLR4_5_23pe3pelvha78sg.R.inc(4860);if ((((StringUtils.isEmpty(className))&&(__CLR4_5_23pe3pelvha78sg.R.iget(4861)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4862)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4863);return StringUtils.EMPTY;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(4864);final StringBuilder arrayPrefix = new StringBuilder();

        // Handle array encoding
        __CLR4_5_23pe3pelvha78sg.R.inc(4865);if ((((className.startsWith("["))&&(__CLR4_5_23pe3pelvha78sg.R.iget(4866)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4867)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4868);while ((((className.charAt(0) == '[')&&(__CLR4_5_23pe3pelvha78sg.R.iget(4869)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4870)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(4871);className = className.substring(1);
                __CLR4_5_23pe3pelvha78sg.R.inc(4872);arrayPrefix.append("[]");
            }
            // Strip Object type encoding
            }__CLR4_5_23pe3pelvha78sg.R.inc(4873);if ((((className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';')&&(__CLR4_5_23pe3pelvha78sg.R.iget(4874)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4875)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(4876);className = className.substring(1, className.length() - 1);
            }

            }__CLR4_5_23pe3pelvha78sg.R.inc(4877);if ((((reverseAbbreviationMap.containsKey(className))&&(__CLR4_5_23pe3pelvha78sg.R.iget(4878)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4879)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(4880);className = reverseAbbreviationMap.get(className);
            }
        }}

        }__CLR4_5_23pe3pelvha78sg.R.inc(4881);final int lastDotIdx = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        __CLR4_5_23pe3pelvha78sg.R.inc(4882);final int innerIdx = className.indexOf(
                INNER_CLASS_SEPARATOR_CHAR, (((lastDotIdx == -1 )&&(__CLR4_5_23pe3pelvha78sg.R.iget(4883)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4884)==0&false))? 0 : lastDotIdx + 1);
        __CLR4_5_23pe3pelvha78sg.R.inc(4885);String out = className.substring(lastDotIdx + 1);
        __CLR4_5_23pe3pelvha78sg.R.inc(4886);if ((((innerIdx != -1)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4887)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4888)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4889);out = out.replace(INNER_CLASS_SEPARATOR_CHAR, PACKAGE_SEPARATOR_CHAR);
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4890);return out + arrayPrefix;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Null-safe version of <code>aClass.getSimpleName()</code></p>
     *
     * @param cls the class for which to get the simple name.
     * @return the simple class name.
     * @since 3.0
     * @see Class#getSimpleName()
     */
    public static String getSimpleName(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4891);
        __CLR4_5_23pe3pelvha78sg.R.inc(4892);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4893)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4894)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4895);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4896);return cls.getSimpleName();
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Null-safe version of <code>aClass.getSimpleName()</code></p>
     *
     * @param object the object for which to get the simple class name.
     * @param valueIfNull the value to return if <code>object</code> is <code>null</code>
     * @return the simple class name.
     * @since 3.0
     * @see Class#getSimpleName()
     */
    public static String getSimpleName(final Object object, final String valueIfNull) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4897);
        __CLR4_5_23pe3pelvha78sg.R.inc(4898);if ((((object == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4899)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4900)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4901);return valueIfNull;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4902);return getSimpleName(object.getClass());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Package name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the package name of an {@code Object}.</p>
     *
     * @param object  the class to get the package name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the package name of the object, or the null value
     */
    public static String getPackageName(final Object object, final String valueIfNull) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4903);
        __CLR4_5_23pe3pelvha78sg.R.inc(4904);if ((((object == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4905)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4906)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4907);return valueIfNull;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4908);return getPackageName(object.getClass());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the package name of a {@code Class}.</p>
     *
     * @param cls  the class to get the package name for, may be {@code null}.
     * @return the package name or an empty string
     */
    public static String getPackageName(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4909);
        __CLR4_5_23pe3pelvha78sg.R.inc(4910);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4911)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4912)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4913);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4914);return getPackageName(cls.getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the package name from a {@code String}.</p>
     *
     * <p>The string passed in is assumed to be a class name - it is not checked.</p>
     * <p>If the class is unpackaged, return an empty string.</p>
     *
     * @param className  the className to get the package name for, may be {@code null}
     * @return the package name or an empty string
     */
    public static String getPackageName(String className) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4915);
        __CLR4_5_23pe3pelvha78sg.R.inc(4916);if ((((StringUtils.isEmpty(className))&&(__CLR4_5_23pe3pelvha78sg.R.iget(4917)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4918)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4919);return StringUtils.EMPTY;
        }

        // Strip array encoding
        }__CLR4_5_23pe3pelvha78sg.R.inc(4920);while ((((className.charAt(0) == '[')&&(__CLR4_5_23pe3pelvha78sg.R.iget(4921)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4922)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4923);className = className.substring(1);
        }
        // Strip Object type encoding
        }__CLR4_5_23pe3pelvha78sg.R.inc(4924);if ((((className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';')&&(__CLR4_5_23pe3pelvha78sg.R.iget(4925)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4926)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4927);className = className.substring(1);
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(4928);final int i = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        __CLR4_5_23pe3pelvha78sg.R.inc(4929);if ((((i == -1)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4930)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4931)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4932);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4933);return className.substring(0, i);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Abbreviated name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the abbreviated name of a {@code Class}.</p>
     *
     * @param cls  the class to get the abbreviated name for, may be {@code null}
     * @param len  the desired length of the abbreviated name
     * @return the abbreviated name or an empty string
     * @throws IllegalArgumentException if len &lt;= 0
     * @see #getAbbreviatedName(String, int)
     * @since 3.4
     */
    public static String getAbbreviatedName(final Class<?> cls, final int len) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4934);
      __CLR4_5_23pe3pelvha78sg.R.inc(4935);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4936)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4937)==0&false))) {{
        __CLR4_5_23pe3pelvha78sg.R.inc(4938);return StringUtils.EMPTY;
      }
      }__CLR4_5_23pe3pelvha78sg.R.inc(4939);return getAbbreviatedName(cls.getName(), len);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the abbreviated class name from a {@code String}.</p>
     *
     * <p>The string passed in is assumed to be a class name - it is not checked.</p>
     *
     * <p>The abbreviation algorithm will shorten the class name, usually without
     * significant loss of meaning.</p>
     * <p>The abbreviated class name will always include the complete package hierarchy.
     * If enough space is available, rightmost sub-packages will be displayed in full
     * length.</p>
     *
     * <p>The following table illustrates the algorithm:</p>
     * <table summary="abbreviation examples">
     * <tr><td>className</td><td>len</td><td>return</td></tr>
     * <tr><td>              null</td><td> 1</td><td>""</td></tr>
     * <tr><td>"java.lang.String"</td><td> 5</td><td>"j.l.String"</td></tr>
     * <tr><td>"java.lang.String"</td><td>15</td><td>"j.lang.String"</td></tr>
     * <tr><td>"java.lang.String"</td><td>30</td><td>"java.lang.String"</td></tr>
     * </table>
     * @param className  the className to get the abbreviated name for, may be {@code null}
     * @param len  the desired length of the abbreviated name
     * @return the abbreviated name or an empty string
     * @throws IllegalArgumentException if len &lt;= 0
     * @since 3.4
     */
    public static String getAbbreviatedName(final String className, final int len) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4940);
      __CLR4_5_23pe3pelvha78sg.R.inc(4941);if ((((len <= 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4942)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4943)==0&false))) {{
        __CLR4_5_23pe3pelvha78sg.R.inc(4944);throw new IllegalArgumentException("len must be > 0");
      }
      }__CLR4_5_23pe3pelvha78sg.R.inc(4945);if ((((className == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4946)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4947)==0&false))) {{
        __CLR4_5_23pe3pelvha78sg.R.inc(4948);return StringUtils.EMPTY;
      }

      }__CLR4_5_23pe3pelvha78sg.R.inc(4949);int availableSpace = len;
      __CLR4_5_23pe3pelvha78sg.R.inc(4950);final int packageLevels = StringUtils.countMatches(className, '.');
      __CLR4_5_23pe3pelvha78sg.R.inc(4951);final String[] output = new String[packageLevels + 1];
      __CLR4_5_23pe3pelvha78sg.R.inc(4952);int endIndex = className.length() - 1;
      __CLR4_5_23pe3pelvha78sg.R.inc(4953);for (int level = packageLevels; (((level >= 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4954)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4955)==0&false)); level--) {{
        __CLR4_5_23pe3pelvha78sg.R.inc(4956);final int startIndex = className.lastIndexOf('.', endIndex);
        __CLR4_5_23pe3pelvha78sg.R.inc(4957);final String part = className.substring(startIndex + 1, endIndex + 1);
        __CLR4_5_23pe3pelvha78sg.R.inc(4958);availableSpace -= part.length();
        __CLR4_5_23pe3pelvha78sg.R.inc(4959);if ((((level > 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4960)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4961)==0&false))) {{
          // all elements except top level require an additional char space
          __CLR4_5_23pe3pelvha78sg.R.inc(4962);availableSpace--;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4963);if ((((level == packageLevels)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4964)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4965)==0&false))) {{
          // ClassName is always complete
          __CLR4_5_23pe3pelvha78sg.R.inc(4966);output[level] = part;
        } }else {{
          __CLR4_5_23pe3pelvha78sg.R.inc(4967);if ((((availableSpace > 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4968)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4969)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4970);output[level] = part;
          } }else {{
            // if no space is left still the first char is used
            __CLR4_5_23pe3pelvha78sg.R.inc(4971);output[level] = part.substring(0, 1);
          }
        }}
        }__CLR4_5_23pe3pelvha78sg.R.inc(4972);endIndex = startIndex - 1;
      }

      }__CLR4_5_23pe3pelvha78sg.R.inc(4973);return StringUtils.join(output, '.');
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Superclasses/Superinterfaces
    // ----------------------------------------------------------------------
    /**
     * <p>Gets a {@code List} of superclasses for the given class.</p>
     *
     * @param cls  the class to look up, may be {@code null}
     * @return the {@code List} of superclasses in order going up from this one
     *  {@code null} if null input
     */
    public static List<Class<?>> getAllSuperclasses(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4974);
        __CLR4_5_23pe3pelvha78sg.R.inc(4975);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4976)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4977)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4978);return null;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4979);final List<Class<?>> classes = new ArrayList<>();
        __CLR4_5_23pe3pelvha78sg.R.inc(4980);Class<?> superclass = cls.getSuperclass();
        __CLR4_5_23pe3pelvha78sg.R.inc(4981);while ((((superclass != null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4982)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4983)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4984);classes.add(superclass);
            __CLR4_5_23pe3pelvha78sg.R.inc(4985);superclass = superclass.getSuperclass();
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(4986);return classes;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets a {@code List} of all interfaces implemented by the given
     * class and its superclasses.</p>
     *
     * <p>The order is determined by looking through each interface in turn as
     * declared in the source file and following its hierarchy up. Then each
     * superclass is considered in the same way. Later duplicates are ignored,
     * so the order is maintained.</p>
     *
     * @param cls  the class to look up, may be {@code null}
     * @return the {@code List} of interfaces in order,
     *  {@code null} if null input
     */
    public static List<Class<?>> getAllInterfaces(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4987);
        __CLR4_5_23pe3pelvha78sg.R.inc(4988);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4989)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4990)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4991);return null;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(4992);final LinkedHashSet<Class<?>> interfacesFound = new LinkedHashSet<>();
        __CLR4_5_23pe3pelvha78sg.R.inc(4993);getAllInterfaces(cls, interfacesFound);

        __CLR4_5_23pe3pelvha78sg.R.inc(4994);return new ArrayList<>(interfacesFound);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Get the interfaces for the specified class.
     *
     * @param cls  the class to look up, may be {@code null}
     * @param interfacesFound the {@code Set} of interfaces for the class
     */
    private static void getAllInterfaces(Class<?> cls, final HashSet<Class<?>> interfacesFound) {try{__CLR4_5_23pe3pelvha78sg.R.inc(4995);
        __CLR4_5_23pe3pelvha78sg.R.inc(4996);while ((((cls != null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(4997)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(4998)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(4999);final Class<?>[] interfaces = cls.getInterfaces();

            __CLR4_5_23pe3pelvha78sg.R.inc(5000);for (final Class<?> i : interfaces) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5001);if ((((interfacesFound.add(i))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5002)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5003)==0&false))) {{
                    __CLR4_5_23pe3pelvha78sg.R.inc(5004);getAllInterfaces(i, interfacesFound);
                }
            }}

            }__CLR4_5_23pe3pelvha78sg.R.inc(5005);cls = cls.getSuperclass();
         }
     }}finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Convert list
    // ----------------------------------------------------------------------
    /**
     * <p>Given a {@code List} of class names, this method converts them into classes.</p>
     *
     * <p>A new {@code List} is returned. If the class name cannot be found, {@code null}
     * is stored in the {@code List}. If the class name in the {@code List} is
     * {@code null}, {@code null} is stored in the output {@code List}.</p>
     *
     * @param classNames  the classNames to change
     * @return a {@code List} of Class objects corresponding to the class names,
     *  {@code null} if null input
     * @throws ClassCastException if classNames contains a non String entry
     */
    public static List<Class<?>> convertClassNamesToClasses(final List<String> classNames) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5006);
        __CLR4_5_23pe3pelvha78sg.R.inc(5007);if ((((classNames == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5008)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5009)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5010);return null;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5011);final List<Class<?>> classes = new ArrayList<>(classNames.size());
        __CLR4_5_23pe3pelvha78sg.R.inc(5012);for (final String className : classNames) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5013);try {
                __CLR4_5_23pe3pelvha78sg.R.inc(5014);classes.add(Class.forName(className));
            } catch (final Exception ex) {
                __CLR4_5_23pe3pelvha78sg.R.inc(5015);classes.add(null);
            }
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5016);return classes;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Given a {@code List} of {@code Class} objects, this method converts
     * them into class names.</p>
     *
     * <p>A new {@code List} is returned. {@code null} objects will be copied into
     * the returned list as {@code null}.</p>
     *
     * @param classes  the classes to change
     * @return a {@code List} of class names corresponding to the Class objects,
     *  {@code null} if null input
     * @throws ClassCastException if {@code classes} contains a non-{@code Class} entry
     */
    public static List<String> convertClassesToClassNames(final List<Class<?>> classes) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5017);
        __CLR4_5_23pe3pelvha78sg.R.inc(5018);if ((((classes == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5019)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5020)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5021);return null;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5022);final List<String> classNames = new ArrayList<>(classes.size());
        __CLR4_5_23pe3pelvha78sg.R.inc(5023);for (final Class<?> cls : classes) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5024);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5025)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5026)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5027);classNames.add(null);
            } }else {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5028);classNames.add(cls.getName());
            }
        }}
        }__CLR4_5_23pe3pelvha78sg.R.inc(5029);return classNames;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Is assignable
    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Classes can be assigned to another array of Classes.</p>
     *
     * <p>This method calls {@link #isAssignable(Class, Class) isAssignable} for each
     * Class pair in the input arrays. It can be used to check if a set of arguments
     * (the first parameter) are suitably compatible with a set of method parameter types
     * (the second parameter).</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this
     * method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a {@code long},
     * {@code float} or {@code double}. This method returns the correct
     * result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method will
     * return {@code true} if {@code null} is passed in and the toClass is
     * non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * <p><strong>Since Lang 3.0,</strong> this method will default behavior for
     * calculating assignability between primitive and wrapper types <em>corresponding
     * to the running Java version</em>; i.e. autoboxing will be the default
     * behavior in VMs running Java versions &gt; 1.5.</p>
     *
     * @param classArray  the array of Classes to check, may be {@code null}
     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(final Class<?>[] classArray, final Class<?>... toClassArray) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5030);
        __CLR4_5_23pe3pelvha78sg.R.inc(5031);return isAssignable(classArray, toClassArray, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Checks if an array of Classes can be assigned to another array of Classes.</p>
     *
     * <p>This method calls {@link #isAssignable(Class, Class) isAssignable} for each
     * Class pair in the input arrays. It can be used to check if a set of arguments
     * (the first parameter) are suitably compatible with a set of method parameter types
     * (the second parameter).</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this
     * method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a {@code long},
     * {@code float} or {@code double}. This method returns the correct
     * result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method will
     * return {@code true} if {@code null} is passed in and the toClass is
     * non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * @param classArray  the array of Classes to check, may be {@code null}
     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}
     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(Class<?>[] classArray, Class<?>[] toClassArray, final boolean autoboxing) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5032);
        __CLR4_5_23pe3pelvha78sg.R.inc(5033);if ((((ArrayUtils.isSameLength(classArray, toClassArray) == false)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5034)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5035)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5036);return false;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5037);if ((((classArray == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5038)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5039)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5040);classArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5041);if ((((toClassArray == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5042)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5043)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5044);toClassArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5045);for (int i = 0; (((i < classArray.length)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5046)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5047)==0&false)); i++) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5048);if ((((isAssignable(classArray[i], toClassArray[i], autoboxing) == false)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5049)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5050)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5051);return false;
            }
        }}
        }__CLR4_5_23pe3pelvha78sg.R.inc(5052);return true;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Returns whether the given {@code type} is a primitive or primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character},
     * {@link Short}, {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     *
     * @param type
     *            The class to query or null.
     * @return true if the given {@code type} is a primitive or primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character},
     *         {@link Short}, {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     * @since 3.1
     */
    public static boolean isPrimitiveOrWrapper(final Class<?> type) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5053);
        __CLR4_5_23pe3pelvha78sg.R.inc(5054);if ((((type == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5055)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5056)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5057);return false;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5058);return type.isPrimitive() || isPrimitiveWrapper(type);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Returns whether the given {@code type} is a primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character}, {@link Short},
     * {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     *
     * @param type
     *            The class to query or null.
     * @return true if the given {@code type} is a primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character}, {@link Short},
     *         {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     * @since 3.1
     */
    public static boolean isPrimitiveWrapper(final Class<?> type) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5059);
        __CLR4_5_23pe3pelvha78sg.R.inc(5060);return wrapperPrimitiveMap.containsKey(type);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Checks if one {@code Class} can be assigned to a variable of
     * another {@code Class}.</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method,
     * this method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a long, float or
     * double. This method returns the correct result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method
     * will return {@code true} if {@code null} is passed in and the
     * toClass is non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * <p><strong>Since Lang 3.0,</strong> this method will default behavior for
     * calculating assignability between primitive and wrapper types <em>corresponding
     * to the running Java version</em>; i.e. autoboxing will be the default
     * behavior in VMs running Java versions &gt; 1.5.</p>
     *
     * @param cls  the Class to check, may be null
     * @param toClass  the Class to try to assign into, returns false if null
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(final Class<?> cls, final Class<?> toClass) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5061);
        __CLR4_5_23pe3pelvha78sg.R.inc(5062);return isAssignable(cls, toClass, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Checks if one {@code Class} can be assigned to a variable of
     * another {@code Class}.</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method,
     * this method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a long, float or
     * double. This method returns the correct result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method
     * will return {@code true} if {@code null} is passed in and the
     * toClass is non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * @param cls  the Class to check, may be null
     * @param toClass  the Class to try to assign into, returns false if null
     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(Class<?> cls, final Class<?> toClass, final boolean autoboxing) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5063);
        __CLR4_5_23pe3pelvha78sg.R.inc(5064);if ((((toClass == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5065)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5066)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5067);return false;
        }
        // have to check for null, as isAssignableFrom doesn't
        }__CLR4_5_23pe3pelvha78sg.R.inc(5068);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5069)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5070)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5071);return !toClass.isPrimitive();
        }
        //autoboxing:
        }__CLR4_5_23pe3pelvha78sg.R.inc(5072);if ((((autoboxing)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5073)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5074)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5075);if ((((cls.isPrimitive() && !toClass.isPrimitive())&&(__CLR4_5_23pe3pelvha78sg.R.iget(5076)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5077)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5078);cls = primitiveToWrapper(cls);
                __CLR4_5_23pe3pelvha78sg.R.inc(5079);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5080)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5081)==0&false))) {{
                    __CLR4_5_23pe3pelvha78sg.R.inc(5082);return false;
                }
            }}
            }__CLR4_5_23pe3pelvha78sg.R.inc(5083);if ((((toClass.isPrimitive() && !cls.isPrimitive())&&(__CLR4_5_23pe3pelvha78sg.R.iget(5084)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5085)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5086);cls = wrapperToPrimitive(cls);
                __CLR4_5_23pe3pelvha78sg.R.inc(5087);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5088)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5089)==0&false))) {{
                    __CLR4_5_23pe3pelvha78sg.R.inc(5090);return false;
                }
            }}
        }}
        }__CLR4_5_23pe3pelvha78sg.R.inc(5091);if ((((cls.equals(toClass))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5092)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5093)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5094);return true;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5095);if ((((cls.isPrimitive())&&(__CLR4_5_23pe3pelvha78sg.R.iget(5096)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5097)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5098);if ((((toClass.isPrimitive() == false)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5099)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5100)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5101);return false;
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5102);if ((((Integer.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5103)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5104)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5105);return Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5106);if ((((Long.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5107)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5108)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5109);return Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5110);if ((((Boolean.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5111)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5112)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5113);return false;
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5114);if ((((Double.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5115)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5116)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5117);return false;
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5118);if ((((Float.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5119)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5120)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5121);return Double.TYPE.equals(toClass);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5122);if ((((Character.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5123)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5124)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5125);return Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5126);if ((((Short.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5127)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5128)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5129);return Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5130);if ((((Byte.TYPE.equals(cls))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5131)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5132)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5133);return Short.TYPE.equals(toClass)
                    || Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            // should never get here
            }__CLR4_5_23pe3pelvha78sg.R.inc(5134);return false;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5135);return toClass.isAssignableFrom(cls);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts the specified primitive Class object to its corresponding
     * wrapper Class object.</p>
     *
     * <p>NOTE: From v2.2, this method handles {@code Void.TYPE},
     * returning {@code Void.TYPE}.</p>
     *
     * @param cls  the class to convert, may be null
     * @return the wrapper class for {@code cls} or {@code cls} if
     * {@code cls} is not a primitive. {@code null} if null input.
     * @since 2.1
     */
    public static Class<?> primitiveToWrapper(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5136);
        __CLR4_5_23pe3pelvha78sg.R.inc(5137);Class<?> convertedClass = cls;
        __CLR4_5_23pe3pelvha78sg.R.inc(5138);if ((((cls != null && cls.isPrimitive())&&(__CLR4_5_23pe3pelvha78sg.R.iget(5139)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5140)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5141);convertedClass = primitiveWrapperMap.get(cls);
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5142);return convertedClass;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts the specified array of primitive Class objects to an array of
     * its corresponding wrapper Class objects.</p>
     *
     * @param classes  the class array to convert, may be null or empty
     * @return an array which contains for each given class, the wrapper class or
     * the original class if class is not a primitive. {@code null} if null input.
     * Empty array if an empty array passed in.
     * @since 2.1
     */
    public static Class<?>[] primitivesToWrappers(final Class<?>... classes) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5143);
        __CLR4_5_23pe3pelvha78sg.R.inc(5144);if ((((classes == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5145)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5146)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5147);return null;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(5148);if ((((classes.length == 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5149)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5150)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5151);return classes;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(5152);final Class<?>[] convertedClasses = new Class[classes.length];
        __CLR4_5_23pe3pelvha78sg.R.inc(5153);for (int i = 0; (((i < classes.length)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5154)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5155)==0&false)); i++) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5156);convertedClasses[i] = primitiveToWrapper(classes[i]);
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5157);return convertedClasses;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts the specified wrapper class to its corresponding primitive
     * class.</p>
     *
     * <p>This method is the counter part of {@code primitiveToWrapper()}.
     * If the passed in class is a wrapper class for a primitive type, this
     * primitive type will be returned (e.g. {@code Integer.TYPE} for
     * {@code Integer.class}). For other classes, or if the parameter is
     * <b>null</b>, the return value is <b>null</b>.</p>
     *
     * @param cls the class to convert, may be <b>null</b>
     * @return the corresponding primitive type if {@code cls} is a
     * wrapper class, <b>null</b> otherwise
     * @see #primitiveToWrapper(Class)
     * @since 2.4
     */
    public static Class<?> wrapperToPrimitive(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5158);
        __CLR4_5_23pe3pelvha78sg.R.inc(5159);return wrapperPrimitiveMap.get(cls);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts the specified array of wrapper Class objects to an array of
     * its corresponding primitive Class objects.</p>
     *
     * <p>This method invokes {@code wrapperToPrimitive()} for each element
     * of the passed in array.</p>
     *
     * @param classes  the class array to convert, may be null or empty
     * @return an array which contains for each given class, the primitive class or
     * <b>null</b> if the original class is not a wrapper class. {@code null} if null input.
     * Empty array if an empty array passed in.
     * @see #wrapperToPrimitive(Class)
     * @since 2.4
     */
    public static Class<?>[] wrappersToPrimitives(final Class<?>... classes) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5160);
        __CLR4_5_23pe3pelvha78sg.R.inc(5161);if ((((classes == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5162)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5163)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5164);return null;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(5165);if ((((classes.length == 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5166)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5167)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5168);return classes;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(5169);final Class<?>[] convertedClasses = new Class[classes.length];
        __CLR4_5_23pe3pelvha78sg.R.inc(5170);for (int i = 0; (((i < classes.length)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5171)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5172)==0&false)); i++) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5173);convertedClasses[i] = wrapperToPrimitive(classes[i]);
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5174);return convertedClasses;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Inner class
    // ----------------------------------------------------------------------
    /**
     * <p>Is the specified class an inner class or static nested class.</p>
     *
     * @param cls  the class to check, may be null
     * @return {@code true} if the class is an inner or static nested class,
     *  false if not or {@code null}
     */
    public static boolean isInnerClass(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5175);
        __CLR4_5_23pe3pelvha78sg.R.inc(5176);return cls != null && cls.getEnclosingClass() != null;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Class loading
    // ----------------------------------------------------------------------
    /**
     * Returns the class represented by {@code className} using the
     * {@code classLoader}.  This implementation supports the syntaxes
     * "{@code java.util.Map.Entry[]}", "{@code java.util.Map$Entry[]}",
     * "{@code [Ljava.util.Map.Entry;}", and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param classLoader  the class loader to use to load the class
     * @param className  the class name
     * @param initialize  whether the class must be initialized
     * @return the class represented by {@code className} using the {@code classLoader}
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(
            final ClassLoader classLoader, final String className, final boolean initialize) throws ClassNotFoundException {try{__CLR4_5_23pe3pelvha78sg.R.inc(5177);
        __CLR4_5_23pe3pelvha78sg.R.inc(5178);try {
            __CLR4_5_23pe3pelvha78sg.R.inc(5179);Class<?> clazz;
            __CLR4_5_23pe3pelvha78sg.R.inc(5180);if ((((namePrimitiveMap.containsKey(className))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5181)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5182)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5183);clazz = namePrimitiveMap.get(className);
            } }else {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5184);clazz = Class.forName(toCanonicalName(className), initialize, classLoader);
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5185);return clazz;
        } catch (final ClassNotFoundException ex) {
            // allow path separators (.) as inner class name separators
            __CLR4_5_23pe3pelvha78sg.R.inc(5186);final int lastDotIndex = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);

            __CLR4_5_23pe3pelvha78sg.R.inc(5187);if ((((lastDotIndex != -1)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5188)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5189)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5190);try {
                    __CLR4_5_23pe3pelvha78sg.R.inc(5191);return getClass(classLoader, className.substring(0, lastDotIndex) +
                            INNER_CLASS_SEPARATOR_CHAR + className.substring(lastDotIndex + 1),
                            initialize);
                } catch (final ClassNotFoundException ex2) { // NOPMD
                    // ignore exception
                }
            }

            }__CLR4_5_23pe3pelvha78sg.R.inc(5192);throw ex;
        }
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Returns the (initialized) class represented by {@code className}
     * using the {@code classLoader}.  This implementation supports
     * the syntaxes "{@code java.util.Map.Entry[]}",
     * "{@code java.util.Map$Entry[]}", "{@code [Ljava.util.Map.Entry;}",
     * and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param classLoader  the class loader to use to load the class
     * @param className  the class name
     * @return the class represented by {@code className} using the {@code classLoader}
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final ClassLoader classLoader, final String className) throws ClassNotFoundException {try{__CLR4_5_23pe3pelvha78sg.R.inc(5193);
        __CLR4_5_23pe3pelvha78sg.R.inc(5194);return getClass(classLoader, className, true);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Returns the (initialized) class represented by {@code className}
     * using the current thread's context class loader. This implementation
     * supports the syntaxes "{@code java.util.Map.Entry[]}",
     * "{@code java.util.Map$Entry[]}", "{@code [Ljava.util.Map.Entry;}",
     * and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param className  the class name
     * @return the class represented by {@code className} using the current thread's context class loader
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final String className) throws ClassNotFoundException {try{__CLR4_5_23pe3pelvha78sg.R.inc(5195);
        __CLR4_5_23pe3pelvha78sg.R.inc(5196);return getClass(className, true);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Returns the class represented by {@code className} using the
     * current thread's context class loader. This implementation supports the
     * syntaxes "{@code java.util.Map.Entry[]}", "{@code java.util.Map$Entry[]}",
     * "{@code [Ljava.util.Map.Entry;}", and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param className  the class name
     * @param initialize  whether the class must be initialized
     * @return the class represented by {@code className} using the current thread's context class loader
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final String className, final boolean initialize) throws ClassNotFoundException {try{__CLR4_5_23pe3pelvha78sg.R.inc(5197);
        __CLR4_5_23pe3pelvha78sg.R.inc(5198);final ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        __CLR4_5_23pe3pelvha78sg.R.inc(5199);final ClassLoader loader = (((contextCL == null )&&(__CLR4_5_23pe3pelvha78sg.R.iget(5200)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5201)==0&false))? ClassUtils.class.getClassLoader() : contextCL;
        __CLR4_5_23pe3pelvha78sg.R.inc(5202);return getClass(loader, className, initialize);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Public method
    // ----------------------------------------------------------------------
    /**
     * <p>Returns the desired Method much like {@code Class.getMethod}, however
     * it ensures that the returned Method is from a public class or interface and not
     * from an anonymous inner class. This means that the Method is invokable and
     * doesn't fall foul of Java bug
     * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4071957">4071957</a>).</p>
     *
     *  <pre>
     *  <code>Set set = Collections.unmodifiableSet(...);
     *  Method method = ClassUtils.getPublicMethod(set.getClass(), "isEmpty",  new Class[0]);
     *  Object result = method.invoke(set, new Object[]);</code>
     *  </pre>
     *
     * @param cls  the class to check, not null
     * @param methodName  the name of the method
     * @param parameterTypes  the list of parameters
     * @return the method
     * @throws NullPointerException if the class is null
     * @throws SecurityException if a security violation occurred
     * @throws NoSuchMethodException if the method is not found in the given class
     *  or if the method doesn't conform with the requirements
     */
    public static Method getPublicMethod(final Class<?> cls, final String methodName, final Class<?>... parameterTypes)
            throws SecurityException, NoSuchMethodException {try{__CLR4_5_23pe3pelvha78sg.R.inc(5203);

        __CLR4_5_23pe3pelvha78sg.R.inc(5204);final Method declaredMethod = cls.getMethod(methodName, parameterTypes);
        __CLR4_5_23pe3pelvha78sg.R.inc(5205);if ((((Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers()))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5206)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5207)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5208);return declaredMethod;
        }

        }__CLR4_5_23pe3pelvha78sg.R.inc(5209);final List<Class<?>> candidateClasses = new ArrayList<>();
        __CLR4_5_23pe3pelvha78sg.R.inc(5210);candidateClasses.addAll(getAllInterfaces(cls));
        __CLR4_5_23pe3pelvha78sg.R.inc(5211);candidateClasses.addAll(getAllSuperclasses(cls));

        __CLR4_5_23pe3pelvha78sg.R.inc(5212);for (final Class<?> candidateClass : candidateClasses) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5213);if ((((!Modifier.isPublic(candidateClass.getModifiers()))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5214)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5215)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5216);continue;
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5217);Method candidateMethod;
            __CLR4_5_23pe3pelvha78sg.R.inc(5218);try {
                __CLR4_5_23pe3pelvha78sg.R.inc(5219);candidateMethod = candidateClass.getMethod(methodName, parameterTypes);
            } catch (final NoSuchMethodException ex) {
                __CLR4_5_23pe3pelvha78sg.R.inc(5220);continue;
            }
            __CLR4_5_23pe3pelvha78sg.R.inc(5221);if ((((Modifier.isPublic(candidateMethod.getDeclaringClass().getModifiers()))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5222)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5223)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5224);return candidateMethod;
            }
        }}

        }__CLR4_5_23pe3pelvha78sg.R.inc(5225);throw new NoSuchMethodException("Can't find a public method for " +
                methodName + " " + ArrayUtils.toString(parameterTypes));
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * Converts a class name to a JLS style class name.
     *
     * @param className  the class name
     * @return the converted name
     */
    private static String toCanonicalName(String className) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5226);
        __CLR4_5_23pe3pelvha78sg.R.inc(5227);className = StringUtils.deleteWhitespace(className);
        __CLR4_5_23pe3pelvha78sg.R.inc(5228);Validate.notNull(className, "className must not be null.");
        __CLR4_5_23pe3pelvha78sg.R.inc(5229);if ((((className.endsWith("[]"))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5230)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5231)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5232);final StringBuilder classNameBuffer = new StringBuilder();
            __CLR4_5_23pe3pelvha78sg.R.inc(5233);while ((((className.endsWith("[]"))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5234)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5235)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5236);className = className.substring(0, className.length() - 2);
                __CLR4_5_23pe3pelvha78sg.R.inc(5237);classNameBuffer.append("[");
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5238);final String abbreviation = abbreviationMap.get(className);
            __CLR4_5_23pe3pelvha78sg.R.inc(5239);if ((((abbreviation != null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5240)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5241)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5242);classNameBuffer.append(abbreviation);
            } }else {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5243);classNameBuffer.append("L").append(className).append(";");
            }
            }__CLR4_5_23pe3pelvha78sg.R.inc(5244);className = classNameBuffer.toString();
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5245);return className;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts an array of {@code Object} in to an array of {@code Class} objects.
     * If any of these objects is null, a null element will be inserted into the array.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array an {@code Object} array
     * @return a {@code Class} array, {@code null} if null array input
     * @since 2.4
     */
    public static Class<?>[] toClass(final Object... array) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5246);
        __CLR4_5_23pe3pelvha78sg.R.inc(5247);if ((((array == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5248)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5249)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5250);return null;
        } }else {__CLR4_5_23pe3pelvha78sg.R.inc(5251);if ((((array.length == 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5252)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5253)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5254);return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }}__CLR4_5_23pe3pelvha78sg.R.inc(5255);final Class<?>[] classes = new Class[array.length];
        __CLR4_5_23pe3pelvha78sg.R.inc(5256);for (int i = 0; (((i < array.length)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5257)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5258)==0&false)); i++) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5259);classes[i] = (((array[i] == null )&&(__CLR4_5_23pe3pelvha78sg.R.iget(5260)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5261)==0&false))? null : array[i].getClass();
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5262);return classes;
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Short canonical name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the canonical name minus the package name for an {@code Object}.</p>
     *
     * @param object  the class to get the short name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the canonical name of the object without the package name, or the null value
     * @since 2.4
     */
    public static String getShortCanonicalName(final Object object, final String valueIfNull) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5263);
        __CLR4_5_23pe3pelvha78sg.R.inc(5264);if ((((object == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5265)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5266)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5267);return valueIfNull;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5268);return getShortCanonicalName(object.getClass().getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the canonical name minus the package name from a {@code Class}.</p>
     *
     * @param cls  the class to get the short name for.
     * @return the canonical name without the package name or an empty string
     * @since 2.4
     */
    public static String getShortCanonicalName(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5269);
        __CLR4_5_23pe3pelvha78sg.R.inc(5270);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5271)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5272)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5273);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5274);return getShortCanonicalName(cls.getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the canonical name minus the package name from a String.</p>
     *
     * <p>The string passed in is assumed to be a canonical name - it is not checked.</p>
     *
     * @param canonicalName  the class name to get the short name for
     * @return the canonical name of the class without the package name or an empty string
     * @since 2.4
     */
    public static String getShortCanonicalName(final String canonicalName) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5275);
        __CLR4_5_23pe3pelvha78sg.R.inc(5276);return ClassUtils.getShortClassName(getCanonicalName(canonicalName));
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    // Package name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the package name from the canonical name of an {@code Object}.</p>
     *
     * @param object  the class to get the package name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the package name of the object, or the null value
     * @since 2.4
     */
    public static String getPackageCanonicalName(final Object object, final String valueIfNull) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5277);
        __CLR4_5_23pe3pelvha78sg.R.inc(5278);if ((((object == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5279)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5280)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5281);return valueIfNull;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5282);return getPackageCanonicalName(object.getClass().getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the package name from the canonical name of a {@code Class}.</p>
     *
     * @param cls  the class to get the package name for, may be {@code null}.
     * @return the package name or an empty string
     * @since 2.4
     */
    public static String getPackageCanonicalName(final Class<?> cls) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5283);
        __CLR4_5_23pe3pelvha78sg.R.inc(5284);if ((((cls == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5285)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5286)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5287);return StringUtils.EMPTY;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5288);return getPackageCanonicalName(cls.getName());
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Gets the package name from the canonical name. </p>
     *
     * <p>The string passed in is assumed to be a canonical name - it is not checked.</p>
     * <p>If the class is unpackaged, return an empty string.</p>
     *
     * @param canonicalName  the canonical name to get the package name for, may be {@code null}
     * @return the package name or an empty string
     * @since 2.4
     */
    public static String getPackageCanonicalName(final String canonicalName) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5289);
        __CLR4_5_23pe3pelvha78sg.R.inc(5290);return ClassUtils.getPackageName(getCanonicalName(canonicalName));
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * <p>Converts a given name of class into canonical format.
     * If name of class is not a name of array class it returns
     * unchanged name.</p>
     * <p>Example:
     * <ul>
     * <li>{@code getCanonicalName("[I") = "int[]"}</li>
     * <li>{@code getCanonicalName("[Ljava.lang.String;") = "java.lang.String[]"}</li>
     * <li>{@code getCanonicalName("java.lang.String") = "java.lang.String"}</li>
     * </ul>
     * </p>
     *
     * @param className the name of class
     * @return canonical form of class name
     * @since 2.4
     */
    private static String getCanonicalName(String className) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5291);
        __CLR4_5_23pe3pelvha78sg.R.inc(5292);className = StringUtils.deleteWhitespace(className);
        __CLR4_5_23pe3pelvha78sg.R.inc(5293);if ((((className == null)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5294)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5295)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5296);return null;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5297);int dim = 0;
        __CLR4_5_23pe3pelvha78sg.R.inc(5298);while ((((className.startsWith("["))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5299)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5300)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5301);dim++;
            __CLR4_5_23pe3pelvha78sg.R.inc(5302);className = className.substring(1);
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5303);if ((((dim < 1)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5304)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5305)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5306);return className;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5307);if ((((className.startsWith("L"))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5308)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5309)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5310);className = className.substring(
                1,
                (((className.endsWith(";")
                    )&&(__CLR4_5_23pe3pelvha78sg.R.iget(5311)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5312)==0&false))? className.length() - 1
                    : className.length());
        } }else {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5313);if ((((className.length() > 0)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5314)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5315)==0&false))) {{
                __CLR4_5_23pe3pelvha78sg.R.inc(5316);className = reverseAbbreviationMap.get(className.substring(0, 1));
            }
        }}
        }__CLR4_5_23pe3pelvha78sg.R.inc(5317);final StringBuilder canonicalClassNameBuffer = new StringBuilder(className);
        __CLR4_5_23pe3pelvha78sg.R.inc(5318);for (int i = 0; (((i < dim)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5319)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5320)==0&false)); i++) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5321);canonicalClassNameBuffer.append("[]");
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5322);return canonicalClassNameBuffer.toString();
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Get an {@link Iterable} that can iterate over a class hierarchy in ascending (subclass to superclass) order,
     * excluding interfaces.
     *
     * @param type the type to get the class hierarchy from
     * @return Iterable an Iterable over the class hierarchy of the given class
     * @since 3.2
     */
    public static Iterable<Class<?>> hierarchy(final Class<?> type) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5323);
        __CLR4_5_23pe3pelvha78sg.R.inc(5324);return hierarchy(type, Interfaces.EXCLUDE);
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

    /**
     * Get an {@link Iterable} that can iterate over a class hierarchy in ascending (subclass to superclass) order.
     *
     * @param type the type to get the class hierarchy from
     * @param interfacesBehavior switch indicating whether to include or exclude interfaces
     * @return Iterable an Iterable over the class hierarchy of the given class
     * @since 3.2
     */
    public static Iterable<Class<?>> hierarchy(final Class<?> type, final Interfaces interfacesBehavior) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5325);
        __CLR4_5_23pe3pelvha78sg.R.inc(5326);final Iterable<Class<?>> classes = new Iterable<Class<?>>() {
    
            @Override
            public Iterator<Class<?>> iterator() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5327);
                __CLR4_5_23pe3pelvha78sg.R.inc(5328);final MutableObject<Class<?>> next = new MutableObject<Class<?>>(type);
                __CLR4_5_23pe3pelvha78sg.R.inc(5329);return new Iterator<Class<?>>() {
    
                    @Override
                    public boolean hasNext() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5330);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5331);return next.getValue() != null;
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                    @Override
                    public Class<?> next() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5332);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5333);final Class<?> result = next.getValue();
                        __CLR4_5_23pe3pelvha78sg.R.inc(5334);next.setValue(result.getSuperclass());
                        __CLR4_5_23pe3pelvha78sg.R.inc(5335);return result;
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                    @Override
                    public void remove() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5336);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5337);throw new UnsupportedOperationException();
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                };
            }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
        };
        __CLR4_5_23pe3pelvha78sg.R.inc(5338);if ((((interfacesBehavior != Interfaces.INCLUDE)&&(__CLR4_5_23pe3pelvha78sg.R.iget(5339)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5340)==0&false))) {{
            __CLR4_5_23pe3pelvha78sg.R.inc(5341);return classes;
        }
        }__CLR4_5_23pe3pelvha78sg.R.inc(5342);return new Iterable<Class<?>>() {
    
            @Override
            public Iterator<Class<?>> iterator() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5343);
                __CLR4_5_23pe3pelvha78sg.R.inc(5344);final Set<Class<?>> seenInterfaces = new HashSet<>();
                __CLR4_5_23pe3pelvha78sg.R.inc(5345);final Iterator<Class<?>> wrapped = classes.iterator();
    
                __CLR4_5_23pe3pelvha78sg.R.inc(5346);return new Iterator<Class<?>>() {
                    Iterator<Class<?>> interfaces = Collections.<Class<?>> emptySet().iterator();
    
                    @Override
                    public boolean hasNext() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5347);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5348);return interfaces.hasNext() || wrapped.hasNext();
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                    @Override
                    public Class<?> next() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5349);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5350);if ((((interfaces.hasNext())&&(__CLR4_5_23pe3pelvha78sg.R.iget(5351)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5352)==0&false))) {{
                            __CLR4_5_23pe3pelvha78sg.R.inc(5353);final Class<?> nextInterface = interfaces.next();
                            __CLR4_5_23pe3pelvha78sg.R.inc(5354);seenInterfaces.add(nextInterface);
                            __CLR4_5_23pe3pelvha78sg.R.inc(5355);return nextInterface;
                        }
                        }__CLR4_5_23pe3pelvha78sg.R.inc(5356);final Class<?> nextSuperclass = wrapped.next();
                        __CLR4_5_23pe3pelvha78sg.R.inc(5357);final Set<Class<?>> currentInterfaces = new LinkedHashSet<>();
                        __CLR4_5_23pe3pelvha78sg.R.inc(5358);walkInterfaces(currentInterfaces, nextSuperclass);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5359);interfaces = currentInterfaces.iterator();
                        __CLR4_5_23pe3pelvha78sg.R.inc(5360);return nextSuperclass;
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                    private void walkInterfaces(final Set<Class<?>> addTo, final Class<?> c) {try{__CLR4_5_23pe3pelvha78sg.R.inc(5361);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5362);for (final Class<?> iface : c.getInterfaces()) {{
                            __CLR4_5_23pe3pelvha78sg.R.inc(5363);if ((((!seenInterfaces.contains(iface))&&(__CLR4_5_23pe3pelvha78sg.R.iget(5364)!=0|true))||(__CLR4_5_23pe3pelvha78sg.R.iget(5365)==0&false))) {{
                                __CLR4_5_23pe3pelvha78sg.R.inc(5366);addTo.add(iface);
                            }
                            }__CLR4_5_23pe3pelvha78sg.R.inc(5367);walkInterfaces(addTo, iface);
                        }
                    }}finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                    @Override
                    public void remove() {try{__CLR4_5_23pe3pelvha78sg.R.inc(5368);
                        __CLR4_5_23pe3pelvha78sg.R.inc(5369);throw new UnsupportedOperationException();
                    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
    
                };
            }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}
        };
    }finally{__CLR4_5_23pe3pelvha78sg.R.flushNeeded();}}

}
