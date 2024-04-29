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
package org.semanticweb.owlapi.rdf.rdfxml.renderer;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;

/**
 * Developed as part of the CO-ODE project http://www.co-ode.org
 * 
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public class XMLWriterNamespaceManager {public static class __CLR4_5_2s1ls1llvicmda1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,36421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Map<String, String> prefixNamespaceMap = new HashMap<>();
    @Nonnull
    private final Map<String, String> namespacePrefixMap = new HashMap<>();
    @Nonnull
    private final Map<String, String> wellknownNamespaces = new HashMap<>();
    @Nonnull
    private String defaultNamespace;

    /**
     * @param defaultNamespace
     *        default namespace
     */
    public XMLWriterNamespaceManager(@Nonnull String defaultNamespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36345);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36346);this.defaultNamespace = checkNotNull(defaultNamespace,
            "defaultNamespace cannot be null");
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param prefix
     *        prefix
     * @param namespace
     *        namespace
     */
    public void addWellKnownNamespace(@Nonnull String prefix,
        @Nonnull String namespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36347);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36348);wellknownNamespaces.put(checkNotNull(prefix, "prefix cannot be null"),
            checkNotNull(namespace, "namespace cannot be null"));
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param prefix
     *        prefix
     * @param namespace
     *        namespace
     */
    public void setPrefix(@Nonnull String prefix, @Nonnull String namespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36349);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36350);checkNotNull(prefix, "prefix cannot be null");
        __CLR4_5_2s1ls1llvicmda1.R.inc(36351);checkNotNull(namespace, "namespace cannot be null");
        __CLR4_5_2s1ls1llvicmda1.R.inc(36352);prefixNamespaceMap.put(prefix, namespace);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36353);namespacePrefixMap.put(namespace, prefix);
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param namespace
     *        namespace
     * @return prefix for namespace, or null
     */
    @Nullable
    public String getPrefixForNamespace(@Nonnull String namespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36354);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36355);return namespacePrefixMap.get(checkNotNull(namespace,
            "namespace cannot be null"));
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param namespace
     *        namespace
     */
    public void setDefaultNamespace(@Nonnull String namespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36356);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36357);defaultNamespace = checkNotNull(namespace, "namespace cannot be null");
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param prefix
     *        prefix
     * @return namespace for prefix or null
     */
    @Nullable
    public String getNamespaceForPrefix(@Nonnull String prefix) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36358);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36359);return prefixNamespaceMap.get(checkNotNull(prefix,
            "prefix cannot be null"));
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * Gets a QName for a full URI.
     * 
     * @param name
     *        The name which represents the full name.
     * @return The QName representation or the input name if a QName could not
     *         be generated.
     */
    @Nullable
    public String getQName(@Nonnull String name) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36360);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36361);checkNotNull(name, "name cannot be null");
        __CLR4_5_2s1ls1llvicmda1.R.inc(36362);if ((((name.startsWith(defaultNamespace))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36363)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36364)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36365);return name.substring(defaultNamespace.length(), name.length());
        }
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36366);for (String ns : namespacePrefixMap.keySet()) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36367);if ((((name.startsWith(ns))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36368)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36369)==0&false))) {{
                __CLR4_5_2s1ls1llvicmda1.R.inc(36370);String localName = name.substring(ns.length(), name.length());
                __CLR4_5_2s1ls1llvicmda1.R.inc(36371);return namespacePrefixMap.get(ns) + ':' + localName;
            }
        }}
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36372);return name;
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * Gets a QName for an IRI.
     * 
     * @param name
     *        The name which represents the full name.
     * @return The QName representation or the input IRI if a QName could not be
     *         generated.
     */
    @Nonnull
    public String getQName(@Nonnull IRI name) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36373);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36374);if ((((name.getNamespace().equals(defaultNamespace))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36375)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36376)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36377);return name.prefixedBy("");
        }
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36378);String candidate = namespacePrefixMap.get(name.getNamespace());
        __CLR4_5_2s1ls1llvicmda1.R.inc(36379);if ((((candidate != null)&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36380)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36381)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36382);return name.prefixedBy(candidate + ':');
        }
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36383);return name.toString();
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @param namespace
     *        namespace
     */
    public void createPrefixForNamespace(@Nonnull String namespace) {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36384);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36385);checkNotNull(namespace, "namespace cannot be null");
        __CLR4_5_2s1ls1llvicmda1.R.inc(36386);if ((((namespace.equals(defaultNamespace))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36387)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36388)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36389);return;
        }
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36390);String prefix = wellknownNamespaces.get(namespace);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36391);if ((((prefix != null)&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36392)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36393)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36394);setPrefix(prefix, namespace);
        }
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36395);if ((((!namespacePrefixMap.containsKey(namespace))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36396)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36397)==0&false))) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36398);int counter = 1;
            __CLR4_5_2s1ls1llvicmda1.R.inc(36399);while ((((prefixNamespaceMap.get("p" + counter) != null)&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36400)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36401)==0&false))) {{
                __CLR4_5_2s1ls1llvicmda1.R.inc(36402);counter++;
            }
            }__CLR4_5_2s1ls1llvicmda1.R.inc(36403);setPrefix("p" + counter, namespace);
        }
    }}finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @return default namespace
     */
    @Nonnull
    public String getDefaultNamespace() {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36404);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36405);return defaultNamespace;
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @return iterable on prefixes
     */
    @Nonnull
    public Iterable<String> getPrefixes() {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36406);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36407);return prefixNamespaceMap.keySet();
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * @return iterable of namespaces
     */
    @Nonnull
    public Iterable<String> getNamespaces() {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36408);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36409);return namespacePrefixMap.keySet();
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}

    /**
     * Search for a prefix other than "" for the default namespace
     * 
     * @return the first prefix found for the default namespace that is not ""
     */
    @Nonnull
    public String getDefaultPrefix() {try{__CLR4_5_2s1ls1llvicmda1.R.inc(36410);
        __CLR4_5_2s1ls1llvicmda1.R.inc(36411);for (String prefix : prefixNamespaceMap.keySet()) {{
            __CLR4_5_2s1ls1llvicmda1.R.inc(36412);if ((((!prefix.isEmpty())&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36413)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36414)==0&false))) {{
                // if the default has a blank entry then skip it
                __CLR4_5_2s1ls1llvicmda1.R.inc(36415);String ns = prefixNamespaceMap.get(prefix);
                __CLR4_5_2s1ls1llvicmda1.R.inc(36416);if ((((ns.equals(defaultNamespace))&&(__CLR4_5_2s1ls1llvicmda1.R.iget(36417)!=0|true))||(__CLR4_5_2s1ls1llvicmda1.R.iget(36418)==0&false))) {{
                    __CLR4_5_2s1ls1llvicmda1.R.inc(36419);return prefix;
                }
            }}
        }}
        }__CLR4_5_2s1ls1llvicmda1.R.inc(36420);return "";
    }finally{__CLR4_5_2s1ls1llvicmda1.R.flushNeeded();}}
}
