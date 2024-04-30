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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * <p>Operations to assist when working with a {@link Locale}.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * @since 2.2
 */
public class LocaleUtils {public static class __CLR4_5_24xv4xvlvha794h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,6559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Concurrent map of language locales by country. */
    private static final ConcurrentMap<String, List<Locale>> cLanguagesByCountry = 
        new ConcurrentHashMap<>();

    /** Concurrent map of country locales by language. */
    private static final ConcurrentMap<String, List<Locale>> cCountriesByLanguage = 
        new ConcurrentHashMap<>();

    /**
     * <p>{@code LocaleUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code LocaleUtils.toLocale("en_GB");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public LocaleUtils() {
      super();__CLR4_5_24xv4xvlvha794h.R.inc(6404);try{__CLR4_5_24xv4xvlvha794h.R.inc(6403);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a Locale.</p>
     *
     * <p>This method takes the string format of a locale and creates the
     * locale object from it.</p>
     *
     * <pre>
     *   LocaleUtils.toLocale("")           = new Locale("", "")
     *   LocaleUtils.toLocale("en")         = new Locale("en", "")
     *   LocaleUtils.toLocale("en_GB")      = new Locale("en", "GB")
     *   LocaleUtils.toLocale("en_001")     = new Locale("en", "001")
     *   LocaleUtils.toLocale("en_GB_xxx")  = new Locale("en", "GB", "xxx")   (#)
     * </pre>
     *
     * <p>(#) The behaviour of the JDK variant constructor changed between JDK1.3 and JDK1.4.
     * In JDK1.3, the constructor upper cases the variant, in JDK1.4, it doesn't.
     * Thus, the result from getVariant() may vary depending on your JDK.</p>
     *
     * <p>This method validates the input strictly.
     * The language code must be lowercase.
     * The country code must be uppercase.
     * The separator must be an underscore.
     * The length must be correct.
     * </p>
     *
     * @param str  the locale String to convert, null returns null
     * @return a Locale, null if null input
     * @throws IllegalArgumentException if the string is an invalid format
     * @see Locale#forLanguageTag(String)
     */
    public static Locale toLocale(final String str) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6405);
        __CLR4_5_24xv4xvlvha794h.R.inc(6406);if ((((str == null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6407)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6408)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6409);return null;
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6410);if ((((str.isEmpty())&&(__CLR4_5_24xv4xvlvha794h.R.iget(6411)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6412)==0&false))) {{ // LANG-941 - JDK 8 introduced an empty locale where all fields are blank
            __CLR4_5_24xv4xvlvha794h.R.inc(6413);return new Locale(StringUtils.EMPTY, StringUtils.EMPTY);
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6414);if ((((str.contains("#"))&&(__CLR4_5_24xv4xvlvha794h.R.iget(6415)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6416)==0&false))) {{ // LANG-879 - Cannot handle Java 7 script & extensions
            __CLR4_5_24xv4xvlvha794h.R.inc(6417);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6418);final int len = str.length();
        __CLR4_5_24xv4xvlvha794h.R.inc(6419);if ((((len < 2)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6420)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6421)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6422);throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6423);final char ch0 = str.charAt(0);
        __CLR4_5_24xv4xvlvha794h.R.inc(6424);if ((((ch0 == '_')&&(__CLR4_5_24xv4xvlvha794h.R.iget(6425)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6426)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6427);if ((((len < 3)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6428)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6429)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6430);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6431);final char ch1 = str.charAt(1);
            __CLR4_5_24xv4xvlvha794h.R.inc(6432);final char ch2 = str.charAt(2);
            __CLR4_5_24xv4xvlvha794h.R.inc(6433);if ((((!Character.isUpperCase(ch1) || !Character.isUpperCase(ch2))&&(__CLR4_5_24xv4xvlvha794h.R.iget(6434)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6435)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6436);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6437);if ((((len == 3)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6438)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6439)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6440);return new Locale(StringUtils.EMPTY, str.substring(1, 3));
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6441);if ((((len < 5)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6442)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6443)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6444);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6445);if ((((str.charAt(3) != '_')&&(__CLR4_5_24xv4xvlvha794h.R.iget(6446)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6447)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6448);throw new IllegalArgumentException("Invalid locale format: " + str);
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6449);return new Locale(StringUtils.EMPTY, str.substring(1, 3), str.substring(4));
        }

        }__CLR4_5_24xv4xvlvha794h.R.inc(6450);return parseLocale(str);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    /**
     * Tries to parse a locale from the given String.
     *
     * @param str the String to parse a locale from.
     * @return a Locale instance parsed from the given String.
     * @throws IllegalArgumentException if the given String can not be parsed.
     */
    private static Locale parseLocale(final String str) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6451);
        __CLR4_5_24xv4xvlvha794h.R.inc(6452);if ((((isISO639LanguageCode(str))&&(__CLR4_5_24xv4xvlvha794h.R.iget(6453)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6454)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6455);return new Locale(str);
        }

        }__CLR4_5_24xv4xvlvha794h.R.inc(6456);final String[] segments = str.split("_", -1);
        __CLR4_5_24xv4xvlvha794h.R.inc(6457);final String language = segments[0];
        __CLR4_5_24xv4xvlvha794h.R.inc(6458);if ((((segments.length == 2)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6459)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6460)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6461);final String country = segments[1];
            __CLR4_5_24xv4xvlvha794h.R.inc(6462);if ((((isISO639LanguageCode(language) && isISO3166CountryCode(country) ||
                    isNumericAreaCode(country))&&(__CLR4_5_24xv4xvlvha794h.R.iget(6463)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6464)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6465);return new Locale(language, country);
            }
        }} }else {__CLR4_5_24xv4xvlvha794h.R.inc(6466);if ((((segments.length == 3)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6467)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6468)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6469);final String country = segments[1];
            __CLR4_5_24xv4xvlvha794h.R.inc(6470);final String variant = segments[2];
            __CLR4_5_24xv4xvlvha794h.R.inc(6471);if ((((isISO639LanguageCode(language) &&
                    (country.length() == 0 || isISO3166CountryCode(country) || isNumericAreaCode(country)) &&
                    variant.length() > 0)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6472)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6473)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6474);return new Locale(language, country, variant);
            }
        }}
        }}__CLR4_5_24xv4xvlvha794h.R.inc(6475);throw new IllegalArgumentException("Invalid locale format: " + str);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    /**
     * Checks whether the given String is a ISO 639 compliant language code.
     *
     * @param str the String to check.
     * @return true, if the given String is a ISO 639 compliant language code.
     */
    private static boolean isISO639LanguageCode(final String str) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6476);
        __CLR4_5_24xv4xvlvha794h.R.inc(6477);return StringUtils.isAllLowerCase(str) && (str.length() == 2 || str.length() == 3);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    /**
     * Checks whether the given String is a ISO 3166 alpha-2 country code.
     *
     * @param str the String to check
     * @return true, is the given String is a ISO 3166 compliant country code.
     */
    private static boolean isISO3166CountryCode(final String str) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6478);
        __CLR4_5_24xv4xvlvha794h.R.inc(6479);return StringUtils.isAllUpperCase(str) && str.length() == 2;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    /**
     * Checks whether the given String is a UN M.49 numeric area code.
     *
     * @param str the String to check
     * @return true, is the given String is a UN M.49 numeric area code.
     */
    private static boolean isNumericAreaCode(final String str) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6480);
        __CLR4_5_24xv4xvlvha794h.R.inc(6481);return StringUtils.isNumeric(str) && str.length() == 3;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of locales to search through when performing
     * a locale search.</p>
     *
     * <pre>
     * localeLookupList(Locale("fr","CA","xxx"))
     *   = [Locale("fr","CA","xxx"), Locale("fr","CA"), Locale("fr")]
     * </pre>
     *
     * @param locale  the locale to start from
     * @return the unmodifiable list of Locale objects, 0 being locale, not null
     */
    public static List<Locale> localeLookupList(final Locale locale) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6482);
        __CLR4_5_24xv4xvlvha794h.R.inc(6483);return localeLookupList(locale, locale);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of locales to search through when performing
     * a locale search.</p>
     *
     * <pre>
     * localeLookupList(Locale("fr", "CA", "xxx"), Locale("en"))
     *   = [Locale("fr","CA","xxx"), Locale("fr","CA"), Locale("fr"), Locale("en"]
     * </pre>
     *
     * <p>The result list begins with the most specific locale, then the
     * next more general and so on, finishing with the default locale.
     * The list will never contain the same locale twice.</p>
     *
     * @param locale  the locale to start from, null returns empty list
     * @param defaultLocale  the default locale to use if no other is found
     * @return the unmodifiable list of Locale objects, 0 being locale, not null
     */
    public static List<Locale> localeLookupList(final Locale locale, final Locale defaultLocale) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6484);
        __CLR4_5_24xv4xvlvha794h.R.inc(6485);final List<Locale> list = new ArrayList<>(4);
        __CLR4_5_24xv4xvlvha794h.R.inc(6486);if ((((locale != null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6487)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6488)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6489);list.add(locale);
            __CLR4_5_24xv4xvlvha794h.R.inc(6490);if ((((locale.getVariant().length() > 0)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6491)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6492)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6493);list.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6494);if ((((locale.getCountry().length() > 0)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6495)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6496)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6497);list.add(new Locale(locale.getLanguage(), StringUtils.EMPTY));
            }
            }__CLR4_5_24xv4xvlvha794h.R.inc(6498);if ((((list.contains(defaultLocale) == false)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6499)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6500)==0&false))) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6501);list.add(defaultLocale);
            }
        }}
        }__CLR4_5_24xv4xvlvha794h.R.inc(6502);return Collections.unmodifiableList(list);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains an unmodifiable list of installed locales.</p>
     * 
     * <p>This method is a wrapper around {@link Locale#getAvailableLocales()}.
     * It is more efficient, as the JDK method must create a new array each
     * time it is called.</p>
     *
     * @return the unmodifiable list of available locales
     */
    public static List<Locale> availableLocaleList() {try{__CLR4_5_24xv4xvlvha794h.R.inc(6503);
        __CLR4_5_24xv4xvlvha794h.R.inc(6504);return SyncAvoid.AVAILABLE_LOCALE_LIST;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains an unmodifiable set of installed locales.</p>
     * 
     * <p>This method is a wrapper around {@link Locale#getAvailableLocales()}.
     * It is more efficient, as the JDK method must create a new array each
     * time it is called.</p>
     *
     * @return the unmodifiable set of available locales
     */
    public static Set<Locale> availableLocaleSet() {try{__CLR4_5_24xv4xvlvha794h.R.inc(6505);
        __CLR4_5_24xv4xvlvha794h.R.inc(6506);return SyncAvoid.AVAILABLE_LOCALE_SET;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the locale specified is in the list of available locales.</p>
     *
     * @param locale the Locale object to check if it is available
     * @return true if the locale is a known locale
     */
    public static boolean isAvailableLocale(final Locale locale) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6507);
        __CLR4_5_24xv4xvlvha794h.R.inc(6508);return availableLocaleList().contains(locale);
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of languages supported for a given country.</p>
     *
     * <p>This method takes a country code and searches to find the
     * languages available for that country. Variant locales are removed.</p>
     *
     * @param countryCode  the 2 letter country code, null returns empty
     * @return an unmodifiable List of Locale objects, not null
     */
    public static List<Locale> languagesByCountry(final String countryCode) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6509);
        __CLR4_5_24xv4xvlvha794h.R.inc(6510);if ((((countryCode == null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6511)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6512)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6513);return Collections.emptyList();
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6514);List<Locale> langs = cLanguagesByCountry.get(countryCode);
        __CLR4_5_24xv4xvlvha794h.R.inc(6515);if ((((langs == null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6516)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6517)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6518);langs = new ArrayList<>();
            __CLR4_5_24xv4xvlvha794h.R.inc(6519);final List<Locale> locales = availableLocaleList();
            __CLR4_5_24xv4xvlvha794h.R.inc(6520);for (int i = 0; (((i < locales.size())&&(__CLR4_5_24xv4xvlvha794h.R.iget(6521)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6522)==0&false)); i++) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6523);final Locale locale = locales.get(i);
                __CLR4_5_24xv4xvlvha794h.R.inc(6524);if ((((countryCode.equals(locale.getCountry()) &&
                        locale.getVariant().isEmpty())&&(__CLR4_5_24xv4xvlvha794h.R.iget(6525)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6526)==0&false))) {{
                    __CLR4_5_24xv4xvlvha794h.R.inc(6527);langs.add(locale);
                }
            }}
            }__CLR4_5_24xv4xvlvha794h.R.inc(6528);langs = Collections.unmodifiableList(langs);
            __CLR4_5_24xv4xvlvha794h.R.inc(6529);cLanguagesByCountry.putIfAbsent(countryCode, langs);
            __CLR4_5_24xv4xvlvha794h.R.inc(6530);langs = cLanguagesByCountry.get(countryCode);
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6531);return langs;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Obtains the list of countries supported for a given language.</p>
     * 
     * <p>This method takes a language code and searches to find the
     * countries available for that language. Variant locales are removed.</p>
     *
     * @param languageCode  the 2 letter language code, null returns empty
     * @return an unmodifiable List of Locale objects, not null
     */
    public static List<Locale> countriesByLanguage(final String languageCode) {try{__CLR4_5_24xv4xvlvha794h.R.inc(6532);
        __CLR4_5_24xv4xvlvha794h.R.inc(6533);if ((((languageCode == null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6534)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6535)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6536);return Collections.emptyList();
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6537);List<Locale> countries = cCountriesByLanguage.get(languageCode);
        __CLR4_5_24xv4xvlvha794h.R.inc(6538);if ((((countries == null)&&(__CLR4_5_24xv4xvlvha794h.R.iget(6539)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6540)==0&false))) {{
            __CLR4_5_24xv4xvlvha794h.R.inc(6541);countries = new ArrayList<>();
            __CLR4_5_24xv4xvlvha794h.R.inc(6542);final List<Locale> locales = availableLocaleList();
            __CLR4_5_24xv4xvlvha794h.R.inc(6543);for (int i = 0; (((i < locales.size())&&(__CLR4_5_24xv4xvlvha794h.R.iget(6544)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6545)==0&false)); i++) {{
                __CLR4_5_24xv4xvlvha794h.R.inc(6546);final Locale locale = locales.get(i);
                __CLR4_5_24xv4xvlvha794h.R.inc(6547);if ((((languageCode.equals(locale.getLanguage()) &&
                        locale.getCountry().length() != 0 &&
                        locale.getVariant().isEmpty())&&(__CLR4_5_24xv4xvlvha794h.R.iget(6548)!=0|true))||(__CLR4_5_24xv4xvlvha794h.R.iget(6549)==0&false))) {{
                    __CLR4_5_24xv4xvlvha794h.R.inc(6550);countries.add(locale);
                }
            }}
            }__CLR4_5_24xv4xvlvha794h.R.inc(6551);countries = Collections.unmodifiableList(countries);
            __CLR4_5_24xv4xvlvha794h.R.inc(6552);cCountriesByLanguage.putIfAbsent(languageCode, countries);
            __CLR4_5_24xv4xvlvha794h.R.inc(6553);countries = cCountriesByLanguage.get(languageCode);
        }
        }__CLR4_5_24xv4xvlvha794h.R.inc(6554);return countries;
    }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // class to avoid synchronization (Init on demand)
    static class SyncAvoid {
        /** Unmodifiable list of available locales. */
        private static final List<Locale> AVAILABLE_LOCALE_LIST;
        /** Unmodifiable set of available locales. */
        private static final Set<Locale> AVAILABLE_LOCALE_SET;
        
        static {try{__CLR4_5_24xv4xvlvha794h.R.inc(6555);
            __CLR4_5_24xv4xvlvha794h.R.inc(6556);final List<Locale> list = new ArrayList<>(Arrays.asList(Locale.getAvailableLocales()));  // extra safe
            __CLR4_5_24xv4xvlvha794h.R.inc(6557);AVAILABLE_LOCALE_LIST = Collections.unmodifiableList(list);
            __CLR4_5_24xv4xvlvha794h.R.inc(6558);AVAILABLE_LOCALE_SET = Collections.unmodifiableSet(new HashSet<>(list));
        }finally{__CLR4_5_24xv4xvlvha794h.R.flushNeeded();}}
    }

}
