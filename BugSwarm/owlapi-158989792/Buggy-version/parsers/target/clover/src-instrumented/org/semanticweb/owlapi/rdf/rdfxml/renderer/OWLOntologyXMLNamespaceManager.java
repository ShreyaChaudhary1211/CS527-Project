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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.NamespaceUtil;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;
import org.semanticweb.owlapi.vocab.Namespaces;

/**
 * The OWLOntologyNamespaceManager wraps a NamespaceManager (OWLOntologyFormat).
 * In the case where the appropriate prefixes and mappings don't exist in the
 * NamespaceManager (OWLOntologyFormat) this manager will create them.
 * 
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public class OWLOntologyXMLNamespaceManager extends XMLWriterNamespaceManager {public static class __CLR4_5_2rk2rk2lvicmd4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,35818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntology ontology;
    @Nonnull
    private final NamespaceUtil namespaceUtil = new NamespaceUtil();
    @Nonnull
    private final OWLDocumentFormat ontologyFormat;

    /**
     * @param ontology
     *        ontology
     * @param format
     *        format
     */
    public OWLOntologyXMLNamespaceManager(@Nonnull OWLOntology ontology,
        @Nonnull OWLDocumentFormat format) {
        super(getDefaultNamespace(ontology, format));__CLR4_5_2rk2rk2lvicmd4w.R.inc(35715);try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35714);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35716);this.ontology = checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35717);ontologyFormat = checkNotNull(format, "format cannot be null");
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35718);addWellKnownNamespace("skos", Namespaces.SKOS.toString());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35719);addWellKnownNamespace("dc", DublinCoreVocabulary.NAME_SPACE);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35720);processOntology();
    }finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology getOntology() {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35721);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35722);return ontology;
    }finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    private final void processOntology() {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35723);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35724);if ((((ontologyFormat instanceof PrefixDocumentFormat)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35725)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35726)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35727);PrefixDocumentFormat namespaceFormat = (PrefixDocumentFormat) ontologyFormat;
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35728);Map<String, String> namespacesByPrefix = namespaceFormat
                .getPrefixName2PrefixMap();
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35729);for (String prefixName : namespacesByPrefix.keySet()) {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35730);String xmlnsPrefixName = prefixName.substring(0, prefixName
                    .length() - 1);
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35731);String xmlnsPrefix = namespacesByPrefix.get(prefixName);
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35732);namespaceUtil.setPrefix(verifyNotNull(xmlnsPrefix),
                    verifyNotNull(xmlnsPrefixName));
            }
        }}
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35733);if ((((ontology.getAxiomCount(AxiomType.SWRL_RULE) != 0)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35734)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35735)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35736);namespaceUtil.setPrefix(Namespaces.SWRL.toString(), "swrl");
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35737);namespaceUtil.setPrefix(Namespaces.SWRLB.toString(), "swrlb");
        }
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35738);Set<OWLEntity> entities = getEntitiesThatRequireNamespaces();
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35739);for (OWLEntity ent : entities) {{
            assert (((ent != null)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35740)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35741)==0&false));
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35742);processEntity(ent);
        }
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35743);Map<String, String> ns2prefixMap = namespaceUtil
            .getNamespace2PrefixMap();
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35744);for (String ns : ns2prefixMap.keySet()) {{
            assert (((ns != null)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35745)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35746)==0&false));
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35747);if ((((!Namespaces.OWL11.inNamespace(ns) && !Namespaces.OWL11XML
                .inNamespace(ns))&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35748)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35749)==0&false))) {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35750);String prefix = ns2prefixMap.get(ns);
                assert (((prefix != null)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35751)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35752)==0&false));
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35753);setPrefix(prefix, ns);
            }
        }}
    }}finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    @Nonnull
    protected Set<OWLEntity> getEntitiesThatRequireNamespaces() {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35754);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35755);Set<OWLEntity> result = new HashSet<>();
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35756);result.addAll(ontology.getClassesInSignature());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35757);result.addAll(ontology.getObjectPropertiesInSignature());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35758);result.addAll(ontology.getDataPropertiesInSignature());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35759);result.addAll(ontology.getIndividualsInSignature());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35760);result.addAll(ontology.getAnnotationPropertiesInSignature());
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35761);return result;
    }finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    private void processEntity(@Nonnull OWLNamedObject entity) {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35762);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35763);processIRI(checkNotNull(entity, "entity cannot be null").getIRI());
    }finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    private void processIRI(@Nonnull IRI iri) {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35764);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35765);String ns = checkNotNull(iri, "iri cannot be null").getNamespace();
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35766);if ((((!(ns.isEmpty() || !iri.getRemainder().isPresent()))&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35767)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35768)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35769);namespaceUtil.getPrefix(ns);
        }
    }}finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    /**
     * Gets a suggested default namespace bases on the ID of an ontology. If the
     * ontology has an IRI then this IRI will be used to suggest a default
     * namespace, otherwise, the OWL namespace will be returned as the default
     * namespace
     * 
     * @param ontology
     *        The ontology
     * @param format
     *        format
     * @return A suggested default namespace
     */
    @Nonnull
    private static String getDefaultNamespace(@Nonnull OWLOntology ontology,
        @Nonnull OWLDocumentFormat format) {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35770);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35771);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35772);checkNotNull(format, "format cannot be null");
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35773);if ((((format instanceof PrefixDocumentFormat)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35774)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35775)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35776);PrefixDocumentFormat prefixOWLOntologyFormat = (PrefixDocumentFormat) format;
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35777);String defaultPrefix = prefixOWLOntologyFormat.getDefaultPrefix();
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35778);if ((((defaultPrefix != null)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35779)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35780)==0&false))) {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35781);return defaultPrefix;
            }
        }}
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35782);if ((((ontology.getOntologyID().isAnonymous())&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35783)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35784)==0&false))) {{
            // What do we return here? Just return the OWL namespace for now.
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35785);return Namespaces.OWL.toString();
        } }else {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35786);String base = ontology.getOntologyID().getOntologyIRI().get()
                .toString();
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35787);if ((((!base.endsWith("#") && !base.endsWith("/"))&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35788)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35789)==0&false))) {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35790);base += "#";
            }
            }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35791);return base;
        }
    }}finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}

    @Nullable
    @Override
    public String getQName(String name) {try{__CLR4_5_2rk2rk2lvicmd4w.R.inc(35792);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35793);checkNotNull(name, "name cannot be null");
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35794);String ns = XMLUtils.getNCNamePrefix(name);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35795);String fragment = XMLUtils.getNCNameSuffix(name);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35796);if ((((ns.equals(getDefaultNamespace()))&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35797)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35798)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35799);return fragment;
        }
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35800);if ((((name.startsWith("xmlns") || name.startsWith("xml:"))&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35801)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35802)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35803);return name;
        }
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35804);if ((((ns.isEmpty() || fragment == null || fragment.isEmpty())&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35805)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35806)==0&false))) {{
            // Couldn't split
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35807);return name;
        }
        }__CLR4_5_2rk2rk2lvicmd4w.R.inc(35808);String prefix = getPrefixForNamespace(ns);
        __CLR4_5_2rk2rk2lvicmd4w.R.inc(35809);if ((((prefix != null)&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35810)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35811)==0&false))) {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35812);if ((((!prefix.isEmpty())&&(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35813)!=0|true))||(__CLR4_5_2rk2rk2lvicmd4w.R.iget(35814)==0&false))) {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35815);return prefix + ":" + fragment;
            } }else {{
                __CLR4_5_2rk2rk2lvicmd4w.R.inc(35816);return fragment;
            }
        }} }else {{
            __CLR4_5_2rk2rk2lvicmd4w.R.inc(35817);return null;
        }
    }}finally{__CLR4_5_2rk2rk2lvicmd4w.R.flushNeeded();}}
}
