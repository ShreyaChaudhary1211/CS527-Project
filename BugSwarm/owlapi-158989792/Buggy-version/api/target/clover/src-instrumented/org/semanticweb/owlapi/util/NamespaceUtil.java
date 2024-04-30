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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;
import org.semanticweb.owlapi.vocab.Namespaces;

/**
 * A utility class which can generate namespaces, local names and namespace
 * prefixes in accordance with the XML spec.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class NamespaceUtil implements Serializable {public static class __CLR4_5_26ze6zelvickqgm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final Map<String, String> namespace2PrefixMap = new HashMap<>();
    private final Map<String, String> standardNamespacePrefixMappings = new HashMap<>();
    private final AtomicInteger candidateIndex = new AtomicInteger(1);

    /** default constructor */
    public NamespaceUtil() {try{__CLR4_5_26ze6zelvickqgm.R.inc(9050);
        __CLR4_5_26ze6zelvickqgm.R.inc(9051);standardNamespacePrefixMappings.put(DublinCoreVocabulary.NAME_SPACE, "dc");
        __CLR4_5_26ze6zelvickqgm.R.inc(9052);standardNamespacePrefixMappings.put(Namespaces.SKOS.toString(), "skos");
        __CLR4_5_26ze6zelvickqgm.R.inc(9053);namespace2PrefixMap.put(Namespaces.OWL.toString(), "owl");
        __CLR4_5_26ze6zelvickqgm.R.inc(9054);namespace2PrefixMap.put(Namespaces.RDFS.toString(), "rdfs");
        __CLR4_5_26ze6zelvickqgm.R.inc(9055);namespace2PrefixMap.put(Namespaces.RDF.toString(), "rdf");
        __CLR4_5_26ze6zelvickqgm.R.inc(9056);namespace2PrefixMap.put(Namespaces.XSD.toString(), "xsd");
    }finally{__CLR4_5_26ze6zelvickqgm.R.flushNeeded();}}

    /**
     * Gets a prefix for the given namespace. If a mapping has not been
     * specified then a prefix will be computed and stored for the specified
     * namespace.
     * 
     * @param namespace
     *        The namespace whose prefix is to be retrieved.
     * @return The prefix for the specified namespace.
     */
    @Nonnull
    public String getPrefix(@Nonnull String namespace) {try{__CLR4_5_26ze6zelvickqgm.R.inc(9057);
        __CLR4_5_26ze6zelvickqgm.R.inc(9058);checkNotNull(namespace, "namespace cannot be null");
        __CLR4_5_26ze6zelvickqgm.R.inc(9059);String prefix = namespace2PrefixMap.get(namespace);
        __CLR4_5_26ze6zelvickqgm.R.inc(9060);if ((((prefix != null)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9061)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9062)==0&false))) {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9063);return prefix;
        }
        // We need to generate a candidate prefix
        }__CLR4_5_26ze6zelvickqgm.R.inc(9064);prefix = generatePrefix(namespace);
        __CLR4_5_26ze6zelvickqgm.R.inc(9065);namespace2PrefixMap.put(namespace, prefix);
        __CLR4_5_26ze6zelvickqgm.R.inc(9066);return prefix;
    }finally{__CLR4_5_26ze6zelvickqgm.R.flushNeeded();}}

    /**
     * @return namespace to prefix map
     */
    @Nonnull
    public Map<String, String> getNamespace2PrefixMap() {try{__CLR4_5_26ze6zelvickqgm.R.inc(9067);
        __CLR4_5_26ze6zelvickqgm.R.inc(9068);return Collections.unmodifiableMap(namespace2PrefixMap);
    }finally{__CLR4_5_26ze6zelvickqgm.R.flushNeeded();}}

    /**
     * Generates a candidate prefix for the specified namespace.
     * 
     * @param namespace
     *        The namespace that a prefix should be generated for. The
     *        implementation attempts to generate a prefix based on the
     *        namespace. If it cannot do this, a prefix of the form pn is
     *        generated, where n is an integer.
     * @return The generated prefix. Note that this method will not store the
     *         namespace to prefix mapping.
     */
    @Nonnull
    private String generatePrefix(@Nonnull String namespace) {try{__CLR4_5_26ze6zelvickqgm.R.inc(9069);
        __CLR4_5_26ze6zelvickqgm.R.inc(9070);checkNotNull(namespace, "namespace cannot be null");
        __CLR4_5_26ze6zelvickqgm.R.inc(9071);String prefix = standardNamespacePrefixMappings.get(namespace);
        __CLR4_5_26ze6zelvickqgm.R.inc(9072);if ((((prefix != null)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9073)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9074)==0&false))) {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9075);namespace2PrefixMap.put(namespace, prefix);
            __CLR4_5_26ze6zelvickqgm.R.inc(9076);return prefix;
        }
        }__CLR4_5_26ze6zelvickqgm.R.inc(9077);int startIndex = -1;
        __CLR4_5_26ze6zelvickqgm.R.inc(9078);for (int i = namespace.length() - 1; (((i > -1)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9079)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9080)==0&false)); i--) {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9081);char curChar = namespace.charAt(i);
            __CLR4_5_26ze6zelvickqgm.R.inc(9082);boolean isStartChar = XMLUtils.isNCNameStartChar(curChar);
            __CLR4_5_26ze6zelvickqgm.R.inc(9083);if ((((isStartChar || startIndex == -1)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9084)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9085)==0&false))) {{
                __CLR4_5_26ze6zelvickqgm.R.inc(9086);if ((((isStartChar)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9087)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9088)==0&false))) {{
                    __CLR4_5_26ze6zelvickqgm.R.inc(9089);startIndex = i;
                }
            }} }else {__CLR4_5_26ze6zelvickqgm.R.inc(9090);if ((((!XMLUtils.isNCNameChar(curChar))&&(__CLR4_5_26ze6zelvickqgm.R.iget(9091)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9092)==0&false))) {{
                __CLR4_5_26ze6zelvickqgm.R.inc(9093);break;
            }
        }}}
        }__CLR4_5_26ze6zelvickqgm.R.inc(9094);String computedPrefix = null;
        __CLR4_5_26ze6zelvickqgm.R.inc(9095);if ((((startIndex != -1)&&(__CLR4_5_26ze6zelvickqgm.R.iget(9096)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9097)==0&false))) {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9098);int endIndex = startIndex + 1;
            __CLR4_5_26ze6zelvickqgm.R.inc(9099);for (int i = startIndex; (((endIndex < namespace.length() && i < namespace.length())&&(__CLR4_5_26ze6zelvickqgm.R.iget(9100)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9101)==0&false)); i++) {{
                __CLR4_5_26ze6zelvickqgm.R.inc(9102);char curChar = namespace.charAt(endIndex);
                // We include any NCNameChar except a full stop (.) so
                // that if the URI looks like a file with an extension the
                // extension is removed.
                __CLR4_5_26ze6zelvickqgm.R.inc(9103);if ((((XMLUtils.isNCNameChar(curChar) && curChar != '.')&&(__CLR4_5_26ze6zelvickqgm.R.iget(9104)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9105)==0&false))) {{
                    __CLR4_5_26ze6zelvickqgm.R.inc(9106);endIndex = i + 1;
                } }else {{
                    __CLR4_5_26ze6zelvickqgm.R.inc(9107);break;
                }
            }}
            }__CLR4_5_26ze6zelvickqgm.R.inc(9108);computedPrefix = namespace.substring(startIndex, endIndex);
        } }else {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9109);computedPrefix = "p";
        }
        }__CLR4_5_26ze6zelvickqgm.R.inc(9110);String candidatePrefix = computedPrefix;
        __CLR4_5_26ze6zelvickqgm.R.inc(9111);while ((((namespace2PrefixMap.containsValue(candidatePrefix) || standardNamespacePrefixMappings.containsValue(
            candidatePrefix))&&(__CLR4_5_26ze6zelvickqgm.R.iget(9112)!=0|true))||(__CLR4_5_26ze6zelvickqgm.R.iget(9113)==0&false))) {{
            __CLR4_5_26ze6zelvickqgm.R.inc(9114);candidatePrefix = computedPrefix + candidateIndex.getAndIncrement();
        }
        }__CLR4_5_26ze6zelvickqgm.R.inc(9115);return verifyNotNull(candidatePrefix);
    }finally{__CLR4_5_26ze6zelvickqgm.R.flushNeeded();}}

    /**
     * Sets the prefix for the specified namespace. This will override any
     * computed prefix and take precedence over any computed prefix.
     * 
     * @param namespace
     *        The namespace whose prefix is to be set.
     * @param prefix
     *        The prefix for the namespace
     */
    public void setPrefix(@Nonnull String namespace, @Nonnull String prefix) {try{__CLR4_5_26ze6zelvickqgm.R.inc(9116);
        __CLR4_5_26ze6zelvickqgm.R.inc(9117);checkNotNull(namespace, "namespace cannot be null");
        __CLR4_5_26ze6zelvickqgm.R.inc(9118);checkNotNull(prefix, "prefix cannot be null");
        __CLR4_5_26ze6zelvickqgm.R.inc(9119);namespace2PrefixMap.put(namespace, prefix);
    }finally{__CLR4_5_26ze6zelvickqgm.R.flushNeeded();}}
}
