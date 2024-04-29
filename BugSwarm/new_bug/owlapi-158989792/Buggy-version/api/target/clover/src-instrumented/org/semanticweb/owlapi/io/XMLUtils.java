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
package org.semanticweb.owlapi.io;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * This class contains various methods for checking QNames, NCNames etc. The
 * implementation is based on the <a href="http://www.w3.org/TR/xml-names/">W3C
 * namespaces in XML specification</a>.
 * 
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.3.0
 */
public final class XMLUtils {public static class __CLR4_5_21c11c1lvicklel{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** &amp;lt; shortcut. */
    public static final String LT = "&lt;";
    /** &amp;gt; shortcut. */
    public static final String GT = "&gt;";
    /** &amp;quot; shortcut. */
    public static final String QUOT = "&quot;";
    /** &amp;amp; shortcut. */
    public static final String AMP = "&amp;";
    /** &amp;apos; shortcut. */
    public static final String APOS = "&apos;";
    // For some point in the future
    /** OWL processing instruction. */
    public static final String OWL_PROCESSING_INSTRUCTION_NAME = "owl";

    private XMLUtils() {try{__CLR4_5_21c11c1lvicklel.R.inc(1729);}finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character is an XML name start character.
     * 
     * @param codePoint
     *        The code point of the character to be tested. For UTF-16
     *        characters the code point corresponds to the value of the char
     *        that represents the character.
     * @return {@code true} if {@code codePoint} is an XML name start character,
     *         otherwise {@code false}
     */
    public static boolean isXMLNameStartCharacter(int codePoint) {try{__CLR4_5_21c11c1lvicklel.R.inc(1730);
        __CLR4_5_21c11c1lvicklel.R.inc(1731);return codePoint == ':' || codePoint >= 'A' && codePoint <= 'Z' || codePoint == '_' || codePoint >= 'a'
            && codePoint <= 'z' || codePoint >= 0xC0 && codePoint <= 0xD6 || codePoint >= 0xD8 && codePoint <= 0xF6
            || codePoint >= 0xF8 && codePoint <= 0x2FF || codePoint >= 0x370 && codePoint <= 0x37D || codePoint >= 0x37F
                && codePoint <= 0x1FFF || codePoint >= 0x200C && codePoint <= 0x200D || codePoint >= 0x2070
                    && codePoint <= 0x218F || codePoint >= 0x2C00 && codePoint <= 0x2FEF || codePoint >= 0x3001
                        && codePoint <= 0xD7FF || codePoint >= 0xF900 && codePoint <= 0xFDCF || codePoint >= 0xFDF0
                            && codePoint <= 0xFFFD || codePoint >= 0x10000 && codePoint <= 0xEFFFF;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character is an XML name character.
     * 
     * @param codePoint
     *        The code point of the character to be tested. For UTF-8 and UTF-16
     *        characters the code point corresponds to the value of the char
     *        that represents the character.
     * @return {@code true} if {@code codePoint} is an XML name start character,
     *         otherwise {@code false}
     */
    public static boolean isXMLNameChar(int codePoint) {try{__CLR4_5_21c11c1lvicklel.R.inc(1732);
        __CLR4_5_21c11c1lvicklel.R.inc(1733);return isXMLNameStartCharacter(codePoint) || codePoint == '-' || codePoint == '.' || codePoint >= '0'
            && codePoint <= '9' || codePoint == 0xB7 || codePoint >= 0x0300 && codePoint <= 0x036F
            || codePoint >= 0x203F && codePoint <= 0x2040;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Deterimines if a character is an NCName (Non-Colonised Name) start
     * character.
     * 
     * @param codePoint
     *        The code point of the character to be tested. For UTF-8 and UTF-16
     *        characters the code point corresponds to the value of the char
     *        that represents the character.
     * @return {@code true} if {@code codePoint} is a NCName start character,
     *         otherwise {@code false}.
     */
    public static boolean isNCNameStartChar(int codePoint) {try{__CLR4_5_21c11c1lvicklel.R.inc(1734);
        __CLR4_5_21c11c1lvicklel.R.inc(1735);return codePoint != ':' && isXMLNameStartCharacter(codePoint);
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Deterimines if a character is an NCName (Non-Colonised Name) character.
     * 
     * @param codePoint
     *        The code point of the character to be tested. For UTF-8 and UTF-16
     *        characters the code point corresponds to the value of the char
     *        that represents the character.
     * @return {@code true} if {@code codePoint} is a NCName character,
     *         otherwise {@code false}.
     */
    public static boolean isNCNameChar(int codePoint) {try{__CLR4_5_21c11c1lvicklel.R.inc(1736);
        __CLR4_5_21c11c1lvicklel.R.inc(1737);return codePoint != ':' && isXMLNameChar(codePoint);
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character sequence is an NCName (Non-Colonised Name). An
     * NCName is a string which starts with an NCName start character and is
     * followed by zero or more NCName characters.
     * 
     * @param s
     *        The character sequence to be tested.
     * @return {@code true} if {@code s} is an NCName, otherwise {@code false}.
     */
    public static boolean isNCName(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1738);
        __CLR4_5_21c11c1lvicklel.R.inc(1739);if ((((isNullOrEmpty(s))&&(__CLR4_5_21c11c1lvicklel.R.iget(1740)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1741)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1742);return false;
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1743);int firstCodePoint = Character.codePointAt(s, 0);
        __CLR4_5_21c11c1lvicklel.R.inc(1744);if ((((!isNCNameStartChar(firstCodePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1745)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1746)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1747);return false;
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1748);for (int i = Character.charCount(firstCodePoint); (((i < s.length())&&(__CLR4_5_21c11c1lvicklel.R.iget(1749)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1750)==0&false));) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1751);int codePoint = Character.codePointAt(s, i);
            __CLR4_5_21c11c1lvicklel.R.inc(1752);if ((((!isNCNameChar(codePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1753)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1754)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1755);return false;
            }
            }__CLR4_5_21c11c1lvicklel.R.inc(1756);i += Character.charCount(codePoint);
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1757);return true;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character sequence is a QName. A QName is either an
     * NCName (LocalName), or an NCName followed by a colon followed by another
     * NCName (where the first NCName is referred to as the 'Prefix Name' and
     * the second NCName is referred to as the 'Local Name' - i.e.
     * PrefixName:LocalName).
     * 
     * @param s
     *        The character sequence to be tested.
     * @return {@code true} if {@code s} is a QName, otherwise {@code false}.
     */
    public static boolean isQName(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1758);
        __CLR4_5_21c11c1lvicklel.R.inc(1759);if ((((isNullOrEmpty(s))&&(__CLR4_5_21c11c1lvicklel.R.iget(1760)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1761)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1762);return false;
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1763);boolean foundColon = false;
        __CLR4_5_21c11c1lvicklel.R.inc(1764);boolean inNCName = false;
        __CLR4_5_21c11c1lvicklel.R.inc(1765);for (int i = 0; (((i < s.length())&&(__CLR4_5_21c11c1lvicklel.R.iget(1766)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1767)==0&false));) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1768);int codePoint = Character.codePointAt(s, i);
            __CLR4_5_21c11c1lvicklel.R.inc(1769);if ((((codePoint == ':')&&(__CLR4_5_21c11c1lvicklel.R.iget(1770)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1771)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1772);if ((((foundColon)&&(__CLR4_5_21c11c1lvicklel.R.iget(1773)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1774)==0&false))) {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1775);return false;
                }
                }__CLR4_5_21c11c1lvicklel.R.inc(1776);foundColon = true;
                __CLR4_5_21c11c1lvicklel.R.inc(1777);if ((((!inNCName)&&(__CLR4_5_21c11c1lvicklel.R.iget(1778)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1779)==0&false))) {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1780);return false;
                }
                }__CLR4_5_21c11c1lvicklel.R.inc(1781);inNCName = false;
            } }else {{
                __CLR4_5_21c11c1lvicklel.R.inc(1782);if ((((!inNCName)&&(__CLR4_5_21c11c1lvicklel.R.iget(1783)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1784)==0&false))) {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1785);if ((((!isXMLNameStartCharacter(codePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1786)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1787)==0&false))) {{
                        __CLR4_5_21c11c1lvicklel.R.inc(1788);return false;
                    }
                    }__CLR4_5_21c11c1lvicklel.R.inc(1789);inNCName = true;
                } }else {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1790);if ((((!isXMLNameChar(codePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1791)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1792)==0&false))) {{
                        __CLR4_5_21c11c1lvicklel.R.inc(1793);return false;
                    }
                }}
            }}
            }__CLR4_5_21c11c1lvicklel.R.inc(1794);i += Character.charCount(codePoint);
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1795);return true;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character sequence has a suffix that is an NCName.
     * 
     * @param s
     *        The character sequence.
     * @return {@code true} if the character sequence {@code s} has a suffix
     *         that is an NCName.
     */
    public static boolean hasNCNameSuffix(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1796);
        __CLR4_5_21c11c1lvicklel.R.inc(1797);return getNCNameSuffixIndex(s) != -1;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Gets the index of the longest NCName that is the suffix of a character
     * sequence.
     * 
     * @param s
     *        The character sequence.
     * @return The index of the longest suffix of the specified character
     *         sequence {@code s} that is an NCName, or -1 if the character
     *         sequence {@code s} does not have a suffix that is an NCName.
     */
    public static int getNCNameSuffixIndex(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1798);
        // identify bnode labels and do not try to split them
        __CLR4_5_21c11c1lvicklel.R.inc(1799);if ((((s.length() > 1 && s.charAt(0) == '_' && s.charAt(1) == ':')&&(__CLR4_5_21c11c1lvicklel.R.iget(1800)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1801)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1802);return -1;
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1803);int index = -1;
        __CLR4_5_21c11c1lvicklel.R.inc(1804);for (int i = s.length() - 1; (((i > -1)&&(__CLR4_5_21c11c1lvicklel.R.iget(1805)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1806)==0&false)); i--) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1807);if ((((!Character.isLowSurrogate(s.charAt(i)))&&(__CLR4_5_21c11c1lvicklel.R.iget(1808)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1809)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1810);int codePoint = Character.codePointAt(s, i);
                __CLR4_5_21c11c1lvicklel.R.inc(1811);if ((((isNCNameStartChar(codePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1812)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1813)==0&false))) {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1814);index = i;
                }
                }__CLR4_5_21c11c1lvicklel.R.inc(1815);if ((((!isNCNameChar(codePoint))&&(__CLR4_5_21c11c1lvicklel.R.iget(1816)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1817)==0&false))) {{
                    __CLR4_5_21c11c1lvicklel.R.inc(1818);break;
                }
            }}
        }}
        }__CLR4_5_21c11c1lvicklel.R.inc(1819);return index;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Get the longest NCName that is a suffix of a character sequence.
     * 
     * @param s
     *        The character sequence.
     * @return The String which is the longest suffix of the character sequence
     *         {@code s} that is an NCName, or {@code null} if the character
     *         sequence {@code s} does not have a suffix that is an NCName.
     */
    @Nullable
    public static String getNCNameSuffix(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1820);
        __CLR4_5_21c11c1lvicklel.R.inc(1821);if ((((s.length() > 1 && s.charAt(0) == '_' && s.charAt(1) == ':')&&(__CLR4_5_21c11c1lvicklel.R.iget(1822)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1823)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1824);return null;
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1825);int localPartStartIndex = getNCNameSuffixIndex(s);
        __CLR4_5_21c11c1lvicklel.R.inc(1826);if ((((localPartStartIndex > -1)&&(__CLR4_5_21c11c1lvicklel.R.iget(1827)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1828)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1829);return s.toString().substring(localPartStartIndex);
        } }else {{
            __CLR4_5_21c11c1lvicklel.R.inc(1830);return null;
        }
    }}finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * utility to get the part of a charsequence that is not the NCName
     * fragment.
     * 
     * @param s
     *        the charsequence to split
     * @return the prefix split at the last non-ncname character, or the whole
     *         input if no ncname is found
     */
    @Nonnull
    public static String getNCNamePrefix(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1831);
        __CLR4_5_21c11c1lvicklel.R.inc(1832);if ((((s.length() > 1 && s.charAt(0) == '_' && s.charAt(1) == ':')&&(__CLR4_5_21c11c1lvicklel.R.iget(1833)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1834)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1835);return s.toString();
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1836);int localPartStartIndex = getNCNameSuffixIndex(s);
        __CLR4_5_21c11c1lvicklel.R.inc(1837);if ((((localPartStartIndex > -1)&&(__CLR4_5_21c11c1lvicklel.R.iget(1838)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1839)==0&false))) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1840);return s.toString().substring(0, localPartStartIndex);
        } }else {{
            __CLR4_5_21c11c1lvicklel.R.inc(1841);return s.toString();
        }
    }}finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Escapes a character sequence so that it is valid XML.
     * 
     * @param s
     *        The character sequence.
     * @return The escaped version of the character sequence.
     */
    @Nonnull
    public static String escapeXML(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1842);
        // double quote -- quot
        // ampersand -- amp
        // less than -- lt
        // greater than -- gt
        // apostrophe -- apos
        __CLR4_5_21c11c1lvicklel.R.inc(1843);StringBuilder sb = new StringBuilder(s.length() * 2);
        __CLR4_5_21c11c1lvicklel.R.inc(1844);for (int i = 0; (((i < s.length())&&(__CLR4_5_21c11c1lvicklel.R.iget(1845)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1846)==0&false));) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1847);int codePoint = Character.codePointAt(s, i);
            __CLR4_5_21c11c1lvicklel.R.inc(1848);if ((((codePoint == '<')&&(__CLR4_5_21c11c1lvicklel.R.iget(1849)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1850)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1851);sb.append(LT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1852);if ((((codePoint == '>')&&(__CLR4_5_21c11c1lvicklel.R.iget(1853)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1854)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1855);sb.append(GT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1856);if ((((codePoint == '\"')&&(__CLR4_5_21c11c1lvicklel.R.iget(1857)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1858)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1859);sb.append(QUOT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1860);if ((((codePoint == '&')&&(__CLR4_5_21c11c1lvicklel.R.iget(1861)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1862)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1863);sb.append(AMP);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1864);if ((((codePoint == '\'')&&(__CLR4_5_21c11c1lvicklel.R.iget(1865)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1866)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1867);sb.append(APOS);
            } }else {{
                __CLR4_5_21c11c1lvicklel.R.inc(1868);sb.appendCodePoint(codePoint);
            }
            }}}}}__CLR4_5_21c11c1lvicklel.R.inc(1869);i += Character.charCount(codePoint);
        }
        }__CLR4_5_21c11c1lvicklel.R.inc(1870);return sb.toString();
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Escapes a subset of a char sequence so that it is valid XML. Escaped or
     * unchanged characters are added to destination.
     * 
     * @param chars
     *        chars to check
     * @param start
     *        start index (inclusive)
     * @param count
     *        number of characters
     * @param destination
     *        destination for escaped chars
     * @return The modified destination.
     */
    public static StringBuilder escapeXML(char[] chars, int start, int count, StringBuilder destination) {try{__CLR4_5_21c11c1lvicklel.R.inc(1871);
        // double quote -- quot
        // ampersand -- amp
        // less than -- lt
        // greater than -- gt
        // apostrophe -- apos
        __CLR4_5_21c11c1lvicklel.R.inc(1872);for (int i = 0; (((i < count)&&(__CLR4_5_21c11c1lvicklel.R.iget(1873)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1874)==0&false)); i++) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1875);char codePoint = chars[start + i];
            __CLR4_5_21c11c1lvicklel.R.inc(1876);if ((((codePoint == '<')&&(__CLR4_5_21c11c1lvicklel.R.iget(1877)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1878)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1879);destination.append(LT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1880);if ((((codePoint == '>')&&(__CLR4_5_21c11c1lvicklel.R.iget(1881)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1882)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1883);destination.append(GT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1884);if ((((codePoint == '\"')&&(__CLR4_5_21c11c1lvicklel.R.iget(1885)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1886)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1887);destination.append(QUOT);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1888);if ((((codePoint == '&')&&(__CLR4_5_21c11c1lvicklel.R.iget(1889)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1890)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1891);destination.append(AMP);
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1892);if ((((codePoint == '\'')&&(__CLR4_5_21c11c1lvicklel.R.iget(1893)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1894)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1895);destination.append(APOS);
            } }else {{
                __CLR4_5_21c11c1lvicklel.R.inc(1896);destination.append(codePoint);
            }
        }}}}}}
        }__CLR4_5_21c11c1lvicklel.R.inc(1897);return destination;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Escapes a string builder so that it is valid XML.
     * 
     * @param sb
     *        The string builder to escape.
     */
    public static void escapeXML(StringBuilder sb) {try{__CLR4_5_21c11c1lvicklel.R.inc(1898);
        // double quote -- quot
        // ampersand -- amp
        // less than -- lt
        // greater than -- gt
        // apostrophe -- apos
        __CLR4_5_21c11c1lvicklel.R.inc(1899);for (int i = 0; (((i < sb.length())&&(__CLR4_5_21c11c1lvicklel.R.iget(1900)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1901)==0&false));) {{
            __CLR4_5_21c11c1lvicklel.R.inc(1902);int codePoint = Character.codePointAt(sb, i);
            __CLR4_5_21c11c1lvicklel.R.inc(1903);int length = Character.charCount(codePoint);
            __CLR4_5_21c11c1lvicklel.R.inc(1904);if ((((codePoint == '<')&&(__CLR4_5_21c11c1lvicklel.R.iget(1905)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1906)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1907);sb.replace(i, i + length, LT);
                __CLR4_5_21c11c1lvicklel.R.inc(1908);i += LT.length();
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1909);if ((((codePoint == '>')&&(__CLR4_5_21c11c1lvicklel.R.iget(1910)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1911)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1912);sb.replace(i, i + length, GT);
                __CLR4_5_21c11c1lvicklel.R.inc(1913);i += GT.length();
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1914);if ((((codePoint == '\"')&&(__CLR4_5_21c11c1lvicklel.R.iget(1915)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1916)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1917);sb.replace(i, i + length, QUOT);
                __CLR4_5_21c11c1lvicklel.R.inc(1918);i += QUOT.length();
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1919);if ((((codePoint == '&')&&(__CLR4_5_21c11c1lvicklel.R.iget(1920)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1921)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1922);sb.replace(i, i + length, AMP);
                __CLR4_5_21c11c1lvicklel.R.inc(1923);i += AMP.length();
            } }else {__CLR4_5_21c11c1lvicklel.R.inc(1924);if ((((codePoint == '\'')&&(__CLR4_5_21c11c1lvicklel.R.iget(1925)!=0|true))||(__CLR4_5_21c11c1lvicklel.R.iget(1926)==0&false))) {{
                __CLR4_5_21c11c1lvicklel.R.inc(1927);sb.replace(i, i + length, APOS);
                __CLR4_5_21c11c1lvicklel.R.inc(1928);i += APOS.length();
            } }else {{
                __CLR4_5_21c11c1lvicklel.R.inc(1929);i += length;
            }
        }}}}}}
    }}finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}

    /**
     * Determines if a character sequence is {@code null} or empty.
     * 
     * @param s
     *        The character sequence.
     * @return {@code true} if the character sequence is {@code null},
     *         {@code true} if the character sequence is empty, otherwise
     *         {@code false}.
     */
    public static boolean isNullOrEmpty(CharSequence s) {try{__CLR4_5_21c11c1lvicklel.R.inc(1930);
        __CLR4_5_21c11c1lvicklel.R.inc(1931);return s == null || s.length() == 0;
    }finally{__CLR4_5_21c11c1lvicklel.R.flushNeeded();}}
}
