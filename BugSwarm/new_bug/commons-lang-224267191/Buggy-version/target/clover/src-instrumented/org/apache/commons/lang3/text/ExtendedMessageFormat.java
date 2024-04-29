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

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/**
 * Extends <code>java.text.MessageFormat</code> to allow pluggable/additional formatting
 * options for embedded format elements.  Client code should specify a registry
 * of <code>FormatFactory</code> instances associated with <code>String</code>
 * format names.  This registry will be consulted when the format elements are
 * parsed from the message pattern.  In this way custom patterns can be specified,
 * and the formats supported by <code>java.text.MessageFormat</code> can be overridden
 * at the format and/or format style level (see MessageFormat).  A "format element"
 * embedded in the message pattern is specified (<b>()?</b> signifies optionality):<br>
 * <code>{</code><i>argument-number</i><b>(</b><code>,</code><i>format-name</i><b>
 * (</b><code>,</code><i>format-style</i><b>)?)?</b><code>}</code>
 *
 * <p>
 * <i>format-name</i> and <i>format-style</i> values are trimmed of surrounding whitespace
 * in the manner of <code>java.text.MessageFormat</code>.  If <i>format-name</i> denotes
 * <code>FormatFactory formatFactoryInstance</code> in <code>registry</code>, a <code>Format</code>
 * matching <i>format-name</i> and <i>format-style</i> is requested from
 * <code>formatFactoryInstance</code>.  If this is successful, the <code>Format</code>
 * found is used for this format element.
 * </p>
 *
 * <p><b>NOTICE:</b> The various subformat mutator methods are considered unnecessary; they exist on the parent
 * class to allow the type of customization which it is the job of this class to provide in
 * a configurable fashion.  These methods have thus been disabled and will throw
 * <code>UnsupportedOperationException</code> if called.
 * </p>
 *
 * <p>Limitations inherited from <code>java.text.MessageFormat</code>:</p>
 * <ul>
 * <li>When using "choice" subformats, support for nested formatting instructions is limited
 *     to that provided by the base class.</li>
 * <li>Thread-safety of <code>Format</code>s, including <code>MessageFormat</code> and thus
 *     <code>ExtendedMessageFormat</code>, is not guaranteed.</li>
 * </ul>
 *
 * @since 2.4
 * @deprecated as of 3.6, use commons-text
 * <a href="https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/ExtendedMessageFormat.html">
 * ExtendedMessageFormat</a> instead
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public class ExtendedMessageFormat extends MessageFormat {public static class __CLR4_5_2e5de5dlvha7bgf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,18614,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = -2362048321261811743L;
    private static final int HASH_SEED = 31;

    private static final String DUMMY_PATTERN = "";
    private static final char START_FMT = ',';
    private static final char END_FE = '}';
    private static final char START_FE = '{';
    private static final char QUOTE = '\'';

    private String toPattern;
    private final Map<String, ? extends FormatFactory> registry;

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern) {
        this(pattern, Locale.getDefault());__CLR4_5_2e5de5dlvha7bgf.R.inc(18338);try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18337);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale) {
        this(pattern, locale, null);__CLR4_5_2e5de5dlvha7bgf.R.inc(18340);try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18339);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Map<String, ? extends FormatFactory> registry) {
        this(pattern, Locale.getDefault(), registry);__CLR4_5_2e5de5dlvha7bgf.R.inc(18342);try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18341);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale, final Map<String, ? extends FormatFactory> registry) {
        super(DUMMY_PATTERN);__CLR4_5_2e5de5dlvha7bgf.R.inc(18344);try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18343);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18345);setLocale(locale);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18346);this.registry = registry;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18347);applyPattern(pattern);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toPattern() {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18348);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18349);return toPattern;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Apply the specified pattern.
     *
     * @param pattern String
     */
    @Override
    public final void applyPattern(final String pattern) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18350);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18351);if ((((registry == null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18352)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18353)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18354);super.applyPattern(pattern);
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18355);toPattern = super.toPattern();
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18356);return;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18357);final ArrayList<Format> foundFormats = new ArrayList<>();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18358);final ArrayList<String> foundDescriptions = new ArrayList<>();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18359);final StringBuilder stripCustom = new StringBuilder(pattern.length());

        __CLR4_5_2e5de5dlvha7bgf.R.inc(18360);final ParsePosition pos = new ParsePosition(0);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18361);final char[] c = pattern.toCharArray();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18362);int fmtCount = 0;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18363);while ((((pos.getIndex() < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18364)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18365)==0&false))) {{
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2e5de5dlvha7bgf.R.inc(18366);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_5_2_bool0) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18367);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18368);appendQuotedString(pattern, pos, stripCustom);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18369);break;
            case START_FE:if (!__CLB4_5_2_bool0) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18370);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18371);fmtCount++;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18372);seekNonWs(pattern, pos);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18373);final int start = pos.getIndex();
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18374);final int index = readArgumentIndex(pattern, next(pos));
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18375);stripCustom.append(START_FE).append(index);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18376);seekNonWs(pattern, pos);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18377);Format format = null;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18378);String formatDescription = null;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18379);if ((((c[pos.getIndex()] == START_FMT)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18380)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18381)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18382);formatDescription = parseFormatDescription(pattern,
                            next(pos));
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18383);format = getFormat(formatDescription);
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18384);if ((((format == null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18385)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18386)==0&false))) {{
                        __CLR4_5_2e5de5dlvha7bgf.R.inc(18387);stripCustom.append(START_FMT).append(formatDescription);
                    }
                }}
                }__CLR4_5_2e5de5dlvha7bgf.R.inc(18388);foundFormats.add(format);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18389);foundDescriptions.add((((format == null )&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18390)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18391)==0&false))? null : formatDescription);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18392);Validate.isTrue(foundFormats.size() == fmtCount);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18393);Validate.isTrue(foundDescriptions.size() == fmtCount);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18394);if ((((c[pos.getIndex()] != END_FE)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18395)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18396)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18397);throw new IllegalArgumentException(
                            "Unreadable format element at position " + start);
                }
                //$FALL-THROUGH$
            }default:if (!__CLB4_5_2_bool0) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18398);__CLB4_5_2_bool0=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18399);stripCustom.append(c[pos.getIndex()]);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18400);next(pos);
            }
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18401);super.applyPattern(stripCustom.toString());
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18402);toPattern = insertFormats(super.toPattern(), foundDescriptions);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18403);if ((((containsElements(foundFormats))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18404)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18405)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18406);final Format[] origFormats = getFormats();
            // only loop over what we know we have, as MessageFormat on Java 1.3
            // seems to provide an extra format element:
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18407);int i = 0;
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18408);for (final Iterator<Format> it = foundFormats.iterator(); (((it.hasNext())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18409)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18410)==0&false)); i++) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18411);final Format f = it.next();
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18412);if ((((f != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18413)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18414)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18415);origFormats[i] = f;
                }
            }}
            }__CLR4_5_2e5de5dlvha7bgf.R.inc(18416);super.setFormats(origFormats);
        }
    }}finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param formatElementIndex format element index
     * @param newFormat the new format
     * @throws UnsupportedOperationException always thrown since this isn't supported by ExtendMessageFormat
     */
    @Override
    public void setFormat(final int formatElementIndex, final Format newFormat) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18417);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18418);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param argumentIndex argument index
     * @param newFormat the new format
     * @throws UnsupportedOperationException always thrown since this isn't supported by ExtendMessageFormat
     */
    @Override
    public void setFormatByArgumentIndex(final int argumentIndex, final Format newFormat) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18419);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18420);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException always thrown since this isn't supported by ExtendMessageFormat
     */
    @Override
    public void setFormats(final Format[] newFormats) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18421);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18422);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException always thrown since this isn't supported by ExtendMessageFormat
     */
    @Override
    public void setFormatsByArgumentIndex(final Format[] newFormats) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18423);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18424);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Check if this extended message format is equal to another object.
     *
     * @param obj the object to compare to
     * @return true if this object equals the other, otherwise false
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18425);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18426);if ((((obj == this)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18427)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18428)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18429);return true;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18430);if ((((obj == null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18431)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18432)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18433);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18434);if ((((!super.equals(obj))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18435)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18436)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18437);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18438);if ((((ObjectUtils.notEqual(getClass(), obj.getClass()))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18439)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18440)==0&false))) {{
          __CLR4_5_2e5de5dlvha7bgf.R.inc(18441);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18442);final ExtendedMessageFormat rhs = (ExtendedMessageFormat)obj;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18443);if ((((ObjectUtils.notEqual(toPattern, rhs.toPattern))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18444)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18445)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18446);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18447);if ((((ObjectUtils.notEqual(registry, rhs.registry))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18448)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18449)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18450);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18451);return true;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18452);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18453);int result = super.hashCode();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18454);result = HASH_SEED * result + Objects.hashCode(registry);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18455);result = HASH_SEED * result + Objects.hashCode(toPattern);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18456);return result;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Get a custom format from a format description.
     *
     * @param desc String
     * @return Format
     */
    private Format getFormat(final String desc) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18457);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18458);if ((((registry != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18459)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18460)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18461);String name = desc;
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18462);String args = null;
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18463);final int i = desc.indexOf(START_FMT);
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18464);if ((((i > 0)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18465)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18466)==0&false))) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18467);name = desc.substring(0, i).trim();
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18468);args = desc.substring(i + 1).trim();
            }
            }__CLR4_5_2e5de5dlvha7bgf.R.inc(18469);final FormatFactory factory = registry.get(name);
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18470);if ((((factory != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18471)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18472)==0&false))) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18473);return factory.getFormat(name, args, getLocale());
            }
        }}
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18474);return null;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Read the argument index from the current format element
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @return argument index
     */
    private int readArgumentIndex(final String pattern, final ParsePosition pos) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18475);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18476);final int start = pos.getIndex();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18477);seekNonWs(pattern, pos);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18478);final StringBuilder result = new StringBuilder();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18479);boolean error = false;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18480);for (; (((!error && pos.getIndex() < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18481)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18482)==0&false)); next(pos)) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18483);char c = pattern.charAt(pos.getIndex());
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18484);if ((((Character.isWhitespace(c))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18485)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18486)==0&false))) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18487);seekNonWs(pattern, pos);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18488);c = pattern.charAt(pos.getIndex());
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18489);if ((((c != START_FMT && c != END_FE)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18490)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18491)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18492);error = true;
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18493);continue;
                }
            }}
            }__CLR4_5_2e5de5dlvha7bgf.R.inc(18494);if (((((c == START_FMT || c == END_FE) && result.length() > 0)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18495)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18496)==0&false))) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18497);try {
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18498);return Integer.parseInt(result.toString());
                } catch (final NumberFormatException e) { // NOPMD
                    // we've already ensured only digits, so unless something
                    // outlandishly large was specified we should be okay.
                }
            }
            }__CLR4_5_2e5de5dlvha7bgf.R.inc(18499);error = !Character.isDigit(c);
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18500);result.append(c);
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18501);if ((((error)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18502)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18503)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18504);throw new IllegalArgumentException(
                    "Invalid format argument index at position " + start + ": "
                            + pattern.substring(start, pos.getIndex()));
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18505);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Parse the format component of a format element.
     *
     * @param pattern string to parse
     * @param pos current parse position
     * @return Format description String
     */
    private String parseFormatDescription(final String pattern, final ParsePosition pos) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18506);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18507);final int start = pos.getIndex();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18508);seekNonWs(pattern, pos);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18509);final int text = pos.getIndex();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18510);int depth = 1;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18511);for (; (((pos.getIndex() < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18512)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18513)==0&false)); next(pos)) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2e5de5dlvha7bgf.R.inc(18514);switch (pattern.charAt(pos.getIndex())) {
            case START_FE:if (!__CLB4_5_2_bool1) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18515);__CLB4_5_2_bool1=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18516);depth++;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18517);break;
            case END_FE:if (!__CLB4_5_2_bool1) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18518);__CLB4_5_2_bool1=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18519);depth--;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18520);if ((((depth == 0)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18521)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18522)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18523);return pattern.substring(text, pos.getIndex());
                }
                }__CLR4_5_2e5de5dlvha7bgf.R.inc(18524);break;
            case QUOTE:if (!__CLB4_5_2_bool1) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18525);__CLB4_5_2_bool1=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18526);getQuotedString(pattern, pos);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18527);break;
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18528);__CLB4_5_2_bool1=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18529);break;
            }
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18530);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Insert formats back into the pattern for toPattern() support.
     *
     * @param pattern source
     * @param customPatterns The custom patterns to re-insert, if any
     * @return full pattern
     */
    private String insertFormats(final String pattern, final ArrayList<String> customPatterns) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18531);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18532);if ((((!containsElements(customPatterns))&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18533)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18534)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18535);return pattern;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18536);final StringBuilder sb = new StringBuilder(pattern.length() * 2);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18537);final ParsePosition pos = new ParsePosition(0);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18538);int fe = -1;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18539);int depth = 0;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18540);while ((((pos.getIndex() < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18541)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18542)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18543);final char c = pattern.charAt(pos.getIndex());
            boolean __CLB4_5_2_bool2=false;__CLR4_5_2e5de5dlvha7bgf.R.inc(18544);switch (c) {
            case QUOTE:if (!__CLB4_5_2_bool2) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18545);__CLB4_5_2_bool2=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18546);appendQuotedString(pattern, pos, sb);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18547);break;
            case START_FE:if (!__CLB4_5_2_bool2) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18548);__CLB4_5_2_bool2=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18549);depth++;
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18550);sb.append(START_FE).append(readArgumentIndex(pattern, next(pos)));
                // do not look for custom patterns when they are embedded, e.g. in a choice
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18551);if ((((depth == 1)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18552)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18553)==0&false))) {{
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18554);fe++;
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18555);final String customPattern = customPatterns.get(fe);
                    __CLR4_5_2e5de5dlvha7bgf.R.inc(18556);if ((((customPattern != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18557)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18558)==0&false))) {{
                        __CLR4_5_2e5de5dlvha7bgf.R.inc(18559);sb.append(START_FMT).append(customPattern);
                    }
                }}
                }__CLR4_5_2e5de5dlvha7bgf.R.inc(18560);break;
            case END_FE:if (!__CLB4_5_2_bool2) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18561);__CLB4_5_2_bool2=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18562);depth--;
                //$FALL-THROUGH$
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18563);__CLB4_5_2_bool2=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18564);sb.append(c);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18565);next(pos);
            }
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18566);return sb.toString();
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Consume whitespace from the current parse position.
     *
     * @param pattern String to read
     * @param pos current position
     */
    private void seekNonWs(final String pattern, final ParsePosition pos) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18567);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18568);int len = 0;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18569);final char[] buffer = pattern.toCharArray();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18570);do {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18571);len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18572);pos.setIndex(pos.getIndex() + len);
        } }while ((((len > 0 && pos.getIndex() < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18573)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18574)==0&false)));
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Convenience method to advance parse position by 1
     *
     * @param pos ParsePosition
     * @return <code>pos</code>
     */
    private ParsePosition next(final ParsePosition pos) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18575);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18576);pos.setIndex(pos.getIndex() + 1);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18577);return pos;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Consume a quoted string, adding it to <code>appendTo</code> if
     * specified.
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @param appendTo optional StringBuilder to append
     * @return <code>appendTo</code>
     */
    private StringBuilder appendQuotedString(final String pattern, final ParsePosition pos,
            final StringBuilder appendTo) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18578);
        assert (((pattern.toCharArray()[pos.getIndex()] == QUOTE )&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18579)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18580)==0&false)): 
            "Quoted string must start with quote character";

        // handle quote character at the beginning of the string
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18581);if((((appendTo != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18582)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18583)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18584);appendTo.append(QUOTE);
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18585);next(pos);

        __CLR4_5_2e5de5dlvha7bgf.R.inc(18586);final int start = pos.getIndex();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18587);final char[] c = pattern.toCharArray();
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18588);final int lastHold = start;
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18589);for (int i = pos.getIndex(); (((i < pattern.length())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18590)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18591)==0&false)); i++) {{
            boolean __CLB4_5_2_bool3=false;__CLR4_5_2e5de5dlvha7bgf.R.inc(18592);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_5_2_bool3) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18593);__CLB4_5_2_bool3=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18594);next(pos);
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18595);return (((appendTo == null )&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18596)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18597)==0&false))? null : appendTo.append(c, lastHold,
                        pos.getIndex() - lastHold);
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_2e5de5dlvha7bgf.R.inc(18598);__CLB4_5_2_bool3=true;}
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18599);next(pos);
            }
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18600);throw new IllegalArgumentException(
                "Unterminated quoted string at position " + start);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Consume quoted string only
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     */
    private void getQuotedString(final String pattern, final ParsePosition pos) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18601);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18602);appendQuotedString(pattern, pos, null);
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}

    /**
     * Learn whether the specified Collection contains non-null elements.
     * @param coll to check
     * @return <code>true</code> if some Object was found, <code>false</code> otherwise.
     */
    private boolean containsElements(final Collection<?> coll) {try{__CLR4_5_2e5de5dlvha7bgf.R.inc(18603);
        __CLR4_5_2e5de5dlvha7bgf.R.inc(18604);if ((((coll == null || coll.isEmpty())&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18605)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18606)==0&false))) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18607);return false;
        }
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18608);for (final Object name : coll) {{
            __CLR4_5_2e5de5dlvha7bgf.R.inc(18609);if ((((name != null)&&(__CLR4_5_2e5de5dlvha7bgf.R.iget(18610)!=0|true))||(__CLR4_5_2e5de5dlvha7bgf.R.iget(18611)==0&false))) {{
                __CLR4_5_2e5de5dlvha7bgf.R.inc(18612);return true;
            }
        }}
        }__CLR4_5_2e5de5dlvha7bgf.R.inc(18613);return false;
    }finally{__CLR4_5_2e5de5dlvha7bgf.R.flushNeeded();}}
}
