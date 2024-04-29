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

import org.apache.commons.lang3.math.NumberUtils;

/**
 * <p>An enum representing all the versions of the Java specification.
 * This is intended to mirror available values from the
 * <em>java.specification.version</em> System property. </p>
 *
 * @since 3.0
 */
public enum JavaVersion {
    
    /**
     * The Java version reported by Android. This is not an official Java version number.
     */
    JAVA_0_9(1.5f, "0.9"),
    
    /**
     * Java 1.1.
     */
    JAVA_1_1(1.1f, "1.1"),

    /**
     * Java 1.2.
     */
    JAVA_1_2(1.2f, "1.2"),

    /**
     * Java 1.3.
     */
    JAVA_1_3(1.3f, "1.3"),

    /**
     * Java 1.4.
     */
    JAVA_1_4(1.4f, "1.4"),

    /**
     * Java 1.5.
     */
    JAVA_1_5(1.5f, "1.5"),

    /**
     * Java 1.6.
     */
    JAVA_1_6(1.6f, "1.6"),

    /**
     * Java 1.7.
     */
    JAVA_1_7(1.7f, "1.7"),

    /**
     * Java 1.8.
     */
    JAVA_1_8(1.8f, "1.8"),

    /**
     * Java 1.9.
     * 
     * @deprecated As of release 3.5, replaced by {@link #JAVA_9}
     */
    @Deprecated
    JAVA_1_9(9.0f, "9"),

    /**
     * Java 9
     */
    JAVA_9(9.0f, "9"),

    /**
     * The most recent java version. Mainly introduced to avoid to break when a new version of Java is used.
     */
    JAVA_RECENT(maxVersion(), Float.toString(maxVersion()));

    /**
     * The float value.
     */
    private final float value;
    /**
     * The standard name.
     */
    private final String name;

    /**
     * Constructor.
     *
     * @param value  the float value
     * @param name  the standard name, not null
     */
    JavaVersion(final float value, final String name) {try{__CLR4_5_24vj4vjlvha793u.R.inc(6319);
        __CLR4_5_24vj4vjlvha793u.R.inc(6320);this.value = value;
        __CLR4_5_24vj4vjlvha793u.R.inc(6321);this.name = name;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Whether this version of Java is at least the version of Java passed in.</p>
     *
     * <p>For example:<br>
     *  {@code myVersion.atLeast(JavaVersion.JAVA_1_4)}<p>
     *
     * @param requiredVersion  the version to check against, not null
     * @return true if this version is equal to or greater than the specified version
     */
    public boolean atLeast(final JavaVersion requiredVersion) {try{__CLR4_5_24vj4vjlvha793u.R.inc(6322);
        __CLR4_5_24vj4vjlvha793u.R.inc(6323);return this.value >= requiredVersion.value;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    /**
     * Transforms the given string with a Java version number to the
     * corresponding constant of this enumeration class. This method is used
     * internally.
     *
     * @param nom the Java version as string
     * @return the corresponding enumeration constant or <b>null</b> if the
     * version is unknown
     */
    // helper for static importing
    static JavaVersion getJavaVersion(final String nom) {try{__CLR4_5_24vj4vjlvha793u.R.inc(6324);
        __CLR4_5_24vj4vjlvha793u.R.inc(6325);return get(nom);
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    /**
     * Transforms the given string with a Java version number to the
     * corresponding constant of this enumeration class. This method is used
     * internally.
     *
     * @param nom the Java version as string
     * @return the corresponding enumeration constant or <b>null</b> if the
     * version is unknown
     */
    static JavaVersion get(final String nom) {try{__CLR4_5_24vj4vjlvha793u.R.inc(6326);
        __CLR4_5_24vj4vjlvha793u.R.inc(6327);if (((("0.9".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6328)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6329)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6330);return JAVA_0_9;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6331);if (((("1.1".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6332)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6333)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6334);return JAVA_1_1;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6335);if (((("1.2".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6336)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6337)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6338);return JAVA_1_2;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6339);if (((("1.3".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6340)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6341)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6342);return JAVA_1_3;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6343);if (((("1.4".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6344)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6345)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6346);return JAVA_1_4;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6347);if (((("1.5".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6348)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6349)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6350);return JAVA_1_5;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6351);if (((("1.6".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6352)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6353)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6354);return JAVA_1_6;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6355);if (((("1.7".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6356)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6357)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6358);return JAVA_1_7;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6359);if (((("1.8".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6360)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6361)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6362);return JAVA_1_8;
        } }else {__CLR4_5_24vj4vjlvha793u.R.inc(6363);if (((("9".equals(nom))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6364)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6365)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6366);return JAVA_9;
        }
        }}}}}}}}}}__CLR4_5_24vj4vjlvha793u.R.inc(6367);if ((((nom == null)&&(__CLR4_5_24vj4vjlvha793u.R.iget(6368)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6369)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6370);return null;
        }
        }__CLR4_5_24vj4vjlvha793u.R.inc(6371);final float v = toFloatVersion(nom);
        __CLR4_5_24vj4vjlvha793u.R.inc(6372);if (((((v - 1.) < 1.)&&(__CLR4_5_24vj4vjlvha793u.R.iget(6373)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6374)==0&false))) {{ // then we need to check decimals > .9
            __CLR4_5_24vj4vjlvha793u.R.inc(6375);final int firstComma = Math.max(nom.indexOf('.'), nom.indexOf(','));
            __CLR4_5_24vj4vjlvha793u.R.inc(6376);final int end = Math.max(nom.length(), nom.indexOf(',', firstComma));
            __CLR4_5_24vj4vjlvha793u.R.inc(6377);if ((((Float.parseFloat(nom.substring(firstComma + 1, end)) > .9f)&&(__CLR4_5_24vj4vjlvha793u.R.iget(6378)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6379)==0&false))) {{
                __CLR4_5_24vj4vjlvha793u.R.inc(6380);return JAVA_RECENT;
            }
        }}
        }__CLR4_5_24vj4vjlvha793u.R.inc(6381);return null;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>The string value is overridden to return the standard name.</p>
     *
     * <p>For example, <code>"1.5"</code>.</p>
     *
     * @return the name, not null
     */
    @Override
    public String toString() {try{__CLR4_5_24vj4vjlvha793u.R.inc(6382);
        __CLR4_5_24vj4vjlvha793u.R.inc(6383);return name;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    /**
     * Gets the Java Version from the system or 99.0 if the {@code java.specification.version} system property is not set.
     * 
     * @return the value of {@code java.specification.version} system property or 99.0 if it is not set.
     */
    private static float maxVersion() {try{__CLR4_5_24vj4vjlvha793u.R.inc(6384);
        __CLR4_5_24vj4vjlvha793u.R.inc(6385);final float v = toFloatVersion(System.getProperty("java.specification.version", "99.0"));
        __CLR4_5_24vj4vjlvha793u.R.inc(6386);if ((((v > 0)&&(__CLR4_5_24vj4vjlvha793u.R.iget(6387)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6388)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6389);return v;
        }
        }__CLR4_5_24vj4vjlvha793u.R.inc(6390);return 99f;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}

    /**
     * Parses a float value from a String.
     * 
     * @param value the String to parse.
     * @return the float value represented by the string or -1 if the given String can not be parsed.
     */
    private static float toFloatVersion(final String value) {try{__CLR4_5_24vj4vjlvha793u.R.inc(6391);
        __CLR4_5_24vj4vjlvha793u.R.inc(6392);final int defaultReturnValue = -1;
        __CLR4_5_24vj4vjlvha793u.R.inc(6393);if ((((value.contains("."))&&(__CLR4_5_24vj4vjlvha793u.R.iget(6394)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6395)==0&false))) {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6396);final String[] toParse = value.split("\\.");
            __CLR4_5_24vj4vjlvha793u.R.inc(6397);if ((((toParse.length >= 2)&&(__CLR4_5_24vj4vjlvha793u.R.iget(6398)!=0|true))||(__CLR4_5_24vj4vjlvha793u.R.iget(6399)==0&false))) {{
                __CLR4_5_24vj4vjlvha793u.R.inc(6400);return NumberUtils.toFloat(toParse[0] + '.' + toParse[1], defaultReturnValue);
            }
        }} }else {{
            __CLR4_5_24vj4vjlvha793u.R.inc(6401);return NumberUtils.toFloat(value, defaultReturnValue);
        }
        }__CLR4_5_24vj4vjlvha793u.R.inc(6402);return defaultReturnValue;
    }finally{__CLR4_5_24vj4vjlvha793u.R.flushNeeded();}}
;public static class __CLR4_5_24vj4vjlvha793u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
