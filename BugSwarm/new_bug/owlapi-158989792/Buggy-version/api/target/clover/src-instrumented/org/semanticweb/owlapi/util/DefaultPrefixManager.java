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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.vocab.Namespaces;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
public class DefaultPrefixManager implements PrefixManager, ShortFormProvider, IRIShortFormProvider {public static class __CLR4_5_25j55j5lvickpp6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,7320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull private Map<String, String> prefix2NamespaceMap;
    @Nonnull private final Map<String, String> reverseprefix2NamespaceMap;
    @Nonnull private StringComparator comparator;

    /**
     * @param defaultPrefix
     *        default prefix
     */
    @Deprecated
    public DefaultPrefixManager(@Nullable String defaultPrefix) {
        this(null, null, defaultPrefix);__CLR4_5_25j55j5lvickpp6.R.inc(7170);try{__CLR4_5_25j55j5lvickpp6.R.inc(7169);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    /**
     * @param pm
     *        the prefix manager to copy
     * @param c
     *        comparator to sort prefixes
     * @param defaultPrefix
     *        default prefix
     */
    public DefaultPrefixManager(@Nullable PrefixManager pm, @Nullable StringComparator c,
        @Nullable String defaultPrefix) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7171);
        __CLR4_5_25j55j5lvickpp6.R.inc(7172);comparator = (((c == null )&&(__CLR4_5_25j55j5lvickpp6.R.iget(7173)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7174)==0&false))? new StringLengthComparator() : c;
        __CLR4_5_25j55j5lvickpp6.R.inc(7175);prefix2NamespaceMap = new TreeMap<>(comparator);
        __CLR4_5_25j55j5lvickpp6.R.inc(7176);reverseprefix2NamespaceMap = new TreeMap<>(comparator);
        __CLR4_5_25j55j5lvickpp6.R.inc(7177);setupDefaultPrefixes();
        __CLR4_5_25j55j5lvickpp6.R.inc(7178);if ((((pm != null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7179)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7180)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7181);copyPrefixesFrom(pm);
        }
        }__CLR4_5_25j55j5lvickpp6.R.inc(7182);if ((((defaultPrefix != null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7183)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7184)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7185);setDefaultPrefix(defaultPrefix);
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    /**
     * default constructor setting the comparator to string lenght comparator
     */
    public DefaultPrefixManager() {
        this(null, null, null);__CLR4_5_25j55j5lvickpp6.R.inc(7187);try{__CLR4_5_25j55j5lvickpp6.R.inc(7186);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public StringComparator getPrefixComparator() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7188);
        __CLR4_5_25j55j5lvickpp6.R.inc(7189);return comparator;
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void setPrefixComparator(StringComparator comparator) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7190);
        __CLR4_5_25j55j5lvickpp6.R.inc(7191);checkNotNull(comparator, "comparator cannot be null");
        __CLR4_5_25j55j5lvickpp6.R.inc(7192);this.comparator = comparator;
        __CLR4_5_25j55j5lvickpp6.R.inc(7193);Map<String, String> p = prefix2NamespaceMap;
        __CLR4_5_25j55j5lvickpp6.R.inc(7194);prefix2NamespaceMap = new TreeMap<>(comparator);
        __CLR4_5_25j55j5lvickpp6.R.inc(7195);prefix2NamespaceMap.putAll(p);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7196);
        __CLR4_5_25j55j5lvickpp6.R.inc(7197);prefix2NamespaceMap.clear();
        __CLR4_5_25j55j5lvickpp6.R.inc(7198);reverseprefix2NamespaceMap.clear();
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public Set<String> getPrefixNames() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7199);
        __CLR4_5_25j55j5lvickpp6.R.inc(7200);return new HashSet<>(prefix2NamespaceMap.keySet());
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    private void setupDefaultPrefixes() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7201);
        __CLR4_5_25j55j5lvickpp6.R.inc(7202);setPrefix("owl:", Namespaces.OWL.toString());
        __CLR4_5_25j55j5lvickpp6.R.inc(7203);setPrefix("rdfs:", Namespaces.RDFS.toString());
        __CLR4_5_25j55j5lvickpp6.R.inc(7204);setPrefix("rdf:", Namespaces.RDF.toString());
        __CLR4_5_25j55j5lvickpp6.R.inc(7205);setPrefix("xsd:", Namespaces.XSD.toString());
        __CLR4_5_25j55j5lvickpp6.R.inc(7206);setPrefix("xml:", Namespaces.XML.toString());
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void setDefaultPrefix(@Nullable String defaultPrefix) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7207);
        __CLR4_5_25j55j5lvickpp6.R.inc(7208);String prefixToUnregister = prefix2NamespaceMap.get(":");
        __CLR4_5_25j55j5lvickpp6.R.inc(7209);if ((((prefixToUnregister != null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7210)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7211)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7212);prefix2NamespaceMap.remove(":");
            __CLR4_5_25j55j5lvickpp6.R.inc(7213);Iterator<Map.Entry<String, String>> it = reverseprefix2NamespaceMap.entrySet().iterator();
            __CLR4_5_25j55j5lvickpp6.R.inc(7214);while ((((it.hasNext())&&(__CLR4_5_25j55j5lvickpp6.R.iget(7215)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7216)==0&false))) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7217);Map.Entry<String, String> e = it.next();
                __CLR4_5_25j55j5lvickpp6.R.inc(7218);if ((((e.getKey().equals(prefixToUnregister) && e.getValue().equals(":"))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7219)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7220)==0&false))) {{
                    __CLR4_5_25j55j5lvickpp6.R.inc(7221);it.remove();
                }
            }}
        }}
        }__CLR4_5_25j55j5lvickpp6.R.inc(7222);if ((((defaultPrefix == null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7223)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7224)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7225);return;
        }
        }__CLR4_5_25j55j5lvickpp6.R.inc(7226);prefix2NamespaceMap.put(":", defaultPrefix);
        __CLR4_5_25j55j5lvickpp6.R.inc(7227);if ((((!reverseprefix2NamespaceMap.containsKey(defaultPrefix))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7228)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7229)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7230);reverseprefix2NamespaceMap.put(defaultPrefix, ":");
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public String getPrefixIRI(IRI iri) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7231);
        __CLR4_5_25j55j5lvickpp6.R.inc(7232);String prefix = reverseprefix2NamespaceMap.get(iri.getNamespace());
        __CLR4_5_25j55j5lvickpp6.R.inc(7233);if ((((prefix == null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7234)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7235)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7236);String iriString = iri.toString();
            __CLR4_5_25j55j5lvickpp6.R.inc(7237);String prefixed = null;
            __CLR4_5_25j55j5lvickpp6.R.inc(7238);for (String s : reverseprefix2NamespaceMap.keySet()) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7239);if ((((iriString.startsWith(s) && noSplits(iriString, s.length()))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7240)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7241)==0&false))) {{
                    __CLR4_5_25j55j5lvickpp6.R.inc(7242);prefix = reverseprefix2NamespaceMap.get(s);
                    __CLR4_5_25j55j5lvickpp6.R.inc(7243);prefixed = iriString.replace(s, prefix);
                }
            }}
            }__CLR4_5_25j55j5lvickpp6.R.inc(7244);if ((((prefixed != null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7245)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7246)==0&false))) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7247);return prefixed;
            }
        }}
        }__CLR4_5_25j55j5lvickpp6.R.inc(7248);if ((((prefix == null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7249)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7250)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7251);return null;
        }
        }__CLR4_5_25j55j5lvickpp6.R.inc(7252);return iri.prefixedBy(prefix);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    private static boolean noSplits(String s, int index) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7253);
        __CLR4_5_25j55j5lvickpp6.R.inc(7254);return s.indexOf('#', index)<0 && s.indexOf('/', index)<0; 
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public String getDefaultPrefix() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7255);
        __CLR4_5_25j55j5lvickpp6.R.inc(7256);return prefix2NamespaceMap.get(":");
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public boolean containsPrefixMapping(String prefixName) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7257);
        __CLR4_5_25j55j5lvickpp6.R.inc(7258);return prefix2NamespaceMap.get(prefixName) != null;
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void copyPrefixesFrom(PrefixManager from) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7259);
        __CLR4_5_25j55j5lvickpp6.R.inc(7260);copyPrefixesFrom(from.getPrefixName2PrefixMap());
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void copyPrefixesFrom(Map<String, String> from) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7261);
        __CLR4_5_25j55j5lvickpp6.R.inc(7262);for (Map.Entry<String, String> e : from.entrySet()) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7263);setPrefix(e.getKey(), e.getValue());
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public IRI getIRI(String prefixIRI) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7264);
        __CLR4_5_25j55j5lvickpp6.R.inc(7265);if ((((prefixIRI.startsWith("<"))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7266)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7267)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7268);return IRI.create(prefixIRI.substring(1, prefixIRI.length() - 1));
        }
        }__CLR4_5_25j55j5lvickpp6.R.inc(7269);int sep = prefixIRI.indexOf(':');
        __CLR4_5_25j55j5lvickpp6.R.inc(7270);if ((((sep == -1)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7271)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7272)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7273);if ((((getDefaultPrefix() != null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7274)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7275)==0&false))) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7276);return IRI.create(getDefaultPrefix() + prefixIRI);
            } }else {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7277);return IRI.create(prefixIRI);
            }
        }} }else {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7278);String prefixName = prefixIRI.substring(0, sep + 1);
            __CLR4_5_25j55j5lvickpp6.R.inc(7279);if ((((!containsPrefixMapping(prefixName))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7280)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7281)==0&false))) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7282);throw new OWLRuntimeException("Prefix not registered for prefix name: " + prefixName);
            }
            }__CLR4_5_25j55j5lvickpp6.R.inc(7283);String prefix = getPrefix(prefixName);
            __CLR4_5_25j55j5lvickpp6.R.inc(7284);String localName = prefixIRI.substring(sep + 1);
            __CLR4_5_25j55j5lvickpp6.R.inc(7285);return IRI.create(prefix, localName);
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public Map<String, String> getPrefixName2PrefixMap() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7286);
        __CLR4_5_25j55j5lvickpp6.R.inc(7287);return Collections.unmodifiableMap(prefix2NamespaceMap);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public String getPrefix(String prefixName) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7288);
        __CLR4_5_25j55j5lvickpp6.R.inc(7289);return prefix2NamespaceMap.get(prefixName);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void setPrefix(String inputPrefixName, String prefix) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7290);
        __CLR4_5_25j55j5lvickpp6.R.inc(7291);checkNotNull(inputPrefixName, "prefixName cannot be null");
        __CLR4_5_25j55j5lvickpp6.R.inc(7292);checkNotNull(prefix, "prefix cannot be null");
        __CLR4_5_25j55j5lvickpp6.R.inc(7293);String _prefixName = inputPrefixName;
        __CLR4_5_25j55j5lvickpp6.R.inc(7294);if ((((!_prefixName.endsWith(":"))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7295)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7296)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7297);_prefixName += ":";
        }
        }__CLR4_5_25j55j5lvickpp6.R.inc(7298);prefix2NamespaceMap.put(_prefixName, prefix);
        __CLR4_5_25j55j5lvickpp6.R.inc(7299);reverseprefix2NamespaceMap.put(prefix, _prefixName);
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void unregisterNamespace(String namespace) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7300);
        __CLR4_5_25j55j5lvickpp6.R.inc(7301);List<String> toRemove = new ArrayList<>();
        __CLR4_5_25j55j5lvickpp6.R.inc(7302);for (Map.Entry<String, String> e : prefix2NamespaceMap.entrySet()) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7303);if ((((e.getValue().equals(namespace))&&(__CLR4_5_25j55j5lvickpp6.R.iget(7304)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7305)==0&false))) {{
                __CLR4_5_25j55j5lvickpp6.R.inc(7306);toRemove.add(e.getKey());
            }
        }}
        }__CLR4_5_25j55j5lvickpp6.R.inc(7307);reverseprefix2NamespaceMap.remove(namespace);
        __CLR4_5_25j55j5lvickpp6.R.inc(7308);for (String s : toRemove) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7309);prefix2NamespaceMap.remove(s);
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public String getShortForm(IRI iri) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7310);
        __CLR4_5_25j55j5lvickpp6.R.inc(7311);String sf = getPrefixIRI(iri);
        __CLR4_5_25j55j5lvickpp6.R.inc(7312);if ((((sf == null)&&(__CLR4_5_25j55j5lvickpp6.R.iget(7313)!=0|true))||(__CLR4_5_25j55j5lvickpp6.R.iget(7314)==0&false))) {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7315);return iri.toQuotedString();
        } }else {{
            __CLR4_5_25j55j5lvickpp6.R.inc(7316);return sf;
        }
    }}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public String getShortForm(OWLEntity entity) {try{__CLR4_5_25j55j5lvickpp6.R.inc(7317);
        __CLR4_5_25j55j5lvickpp6.R.inc(7318);return getShortForm(entity.getIRI());
    }finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_25j55j5lvickpp6.R.inc(7319);}finally{__CLR4_5_25j55j5lvickpp6.R.flushNeeded();}}
}
