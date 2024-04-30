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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.vocab.Namespaces;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class OntologyIRIShortFormProvider implements IRIShortFormProvider {public static class __CLR4_5_2as1as1lvickrsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,14051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     *  IMPLEMENTATION NOTE.  I've avoided using Pattern (regexps) here so that this code can be compiled
     *  with the GWT compiler.
     */
    private static final String OWL_EXTENSION = ".owl";
    private static final String RDF_EXTENSION = ".rdf";
    private static final String XML_EXTENSION = ".xml";
    private static final String OBO_EXTENSION = ".obo";
    private static final String[] EXTENSIONS = { OWL_EXTENSION, RDF_EXTENSION, XML_EXTENSION, OBO_EXTENSION };
    private static final Map<IRI, String> WELL_KNOWN_SHORTFORMS = initWellKnownShortForms();
    private static final long serialVersionUID = 40000L;

    private static Map<IRI, String> initWellKnownShortForms() {try{__CLR4_5_2as1as1lvickrsk.R.inc(13969);
        __CLR4_5_2as1as1lvickrsk.R.inc(13970);Map<IRI, String> map = new HashMap<>();
        __CLR4_5_2as1as1lvickrsk.R.inc(13971);for (Namespaces ns : Namespaces.values()) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(13972);String iriPrefix = ns.getPrefixIRI();
            __CLR4_5_2as1as1lvickrsk.R.inc(13973);String iri;
            __CLR4_5_2as1as1lvickrsk.R.inc(13974);if ((((iriPrefix.endsWith("#") || iriPrefix.endsWith("/"))&&(__CLR4_5_2as1as1lvickrsk.R.iget(13975)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(13976)==0&false))) {{
                __CLR4_5_2as1as1lvickrsk.R.inc(13977);iri = iriPrefix.substring(0, iriPrefix.length() - 1);
            } }else {{
                __CLR4_5_2as1as1lvickrsk.R.inc(13978);iri = iriPrefix;
            }
            }assert (((iri != null)&&(__CLR4_5_2as1as1lvickrsk.R.iget(13979)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(13980)==0&false));
            __CLR4_5_2as1as1lvickrsk.R.inc(13981);map.put(IRI.create(iri), ns.getPrefixName().toLowerCase());
            __CLR4_5_2as1as1lvickrsk.R.inc(13982);map.put(IRI.create(iri + '/'), ns.getPrefixName().toLowerCase());
        }
        }__CLR4_5_2as1as1lvickrsk.R.inc(13983);return Collections.unmodifiableMap(map);
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * @param ont
     *        ontology to use
     * @return short form of the ontology IRI
     */
    public String getShortForm(OWLOntology ont) {try{__CLR4_5_2as1as1lvickrsk.R.inc(13984);
        __CLR4_5_2as1as1lvickrsk.R.inc(13985);OWLOntologyID ontologyID = ont.getOntologyID();
        __CLR4_5_2as1as1lvickrsk.R.inc(13986);if ((((ontologyID.getOntologyIRI().isPresent())&&(__CLR4_5_2as1as1lvickrsk.R.iget(13987)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(13988)==0&false))) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(13989);return getShortForm(verifyNotNull(ontologyID.getOntologyIRI().get()));
        } }else {{
            __CLR4_5_2as1as1lvickrsk.R.inc(13990);return ontologyID.toString();
        }
    }}finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getShortForm(IRI iri) {try{__CLR4_5_2as1as1lvickrsk.R.inc(13991);
        __CLR4_5_2as1as1lvickrsk.R.inc(13992);String wellKnownShortForm = getWellKnownShortForm(iri);
        __CLR4_5_2as1as1lvickrsk.R.inc(13993);if ((((wellKnownShortForm != null)&&(__CLR4_5_2as1as1lvickrsk.R.iget(13994)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(13995)==0&false))) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(13996);return wellKnownShortForm;
        }
        }__CLR4_5_2as1as1lvickrsk.R.inc(13997);URI uri = iri.toURI();
        __CLR4_5_2as1as1lvickrsk.R.inc(13998);String path = uri.getPath();
        __CLR4_5_2as1as1lvickrsk.R.inc(13999);String shortForm = null;
        __CLR4_5_2as1as1lvickrsk.R.inc(14000);if ((((path != null && !path.isEmpty())&&(__CLR4_5_2as1as1lvickrsk.R.iget(14001)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14002)==0&false))) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14003);StringTokenizer tokenizer = new StringTokenizer(path, "/", false);
            __CLR4_5_2as1as1lvickrsk.R.inc(14004);String candidatePathElement = "";
            __CLR4_5_2as1as1lvickrsk.R.inc(14005);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_2as1as1lvickrsk.R.iget(14006)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14007)==0&false))) {{
                __CLR4_5_2as1as1lvickrsk.R.inc(14008);String tok = tokenizer.nextToken();
                __CLR4_5_2as1as1lvickrsk.R.inc(14009);if ((((isCandidatePathElement(tok))&&(__CLR4_5_2as1as1lvickrsk.R.iget(14010)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14011)==0&false))) {{
                    __CLR4_5_2as1as1lvickrsk.R.inc(14012);candidatePathElement = stripExtensionIfPresent(tok);
                }
            }}
            }__CLR4_5_2as1as1lvickrsk.R.inc(14013);shortForm = candidatePathElement;
        } }else {__CLR4_5_2as1as1lvickrsk.R.inc(14014);if ((((uri.getHost() != null)&&(__CLR4_5_2as1as1lvickrsk.R.iget(14015)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14016)==0&false))) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14017);shortForm = iri.toString();
        } }else {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14018);shortForm = iri.toString();
        }
        }}__CLR4_5_2as1as1lvickrsk.R.inc(14019);return shortForm;
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    private static String getWellKnownShortForm(IRI iri) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14020);
        __CLR4_5_2as1as1lvickrsk.R.inc(14021);String wellKnownShortForm = WELL_KNOWN_SHORTFORMS.get(iri);
        __CLR4_5_2as1as1lvickrsk.R.inc(14022);if ((((wellKnownShortForm != null)&&(__CLR4_5_2as1as1lvickrsk.R.iget(14023)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14024)==0&false))) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14025);return wellKnownShortForm;
        }
        }__CLR4_5_2as1as1lvickrsk.R.inc(14026);return null;
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * Removes commonly used file name extensions to make the resulting short
     * form look nicer.
     * 
     * @param shortForm
     *        The short form.
     * @return The short form with the extension removed if it was present, or
     *         the original short form if no extension was present.
     */
    @Nonnull
    private static String stripExtensionIfPresent(String shortForm) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14027);
        __CLR4_5_2as1as1lvickrsk.R.inc(14028);String lowerCaseShortForm = shortForm.toLowerCase();
        __CLR4_5_2as1as1lvickrsk.R.inc(14029);for (String extension : EXTENSIONS) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14030);if ((((lowerCaseShortForm.endsWith(extension))&&(__CLR4_5_2as1as1lvickrsk.R.iget(14031)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14032)==0&false))) {{
                __CLR4_5_2as1as1lvickrsk.R.inc(14033);return shortForm.substring(0, shortForm.length() - extension.length());
            }
        }}
        }__CLR4_5_2as1as1lvickrsk.R.inc(14034);return shortForm;
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * Determines if the specified path element is a candidate short form.
     * 
     * @param pathElement
     *        The path element to test. Not {@code null}.
     * @return {@code true} if the specified path element is a candidate short
     *         form, otherwise {@code false}.
     */
    private static boolean isCandidatePathElement(String pathElement) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14035);
        __CLR4_5_2as1as1lvickrsk.R.inc(14036);return !pathElement.isEmpty() && !isVersionString(pathElement);
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * Determines if the specified string is a version number string. A version
     * string is a sequence of digits and periods.
     * 
     * @param s
     *        The string to test for.
     * @return {@code true} if the string is a version string, otherwise
     *         {@code false}.
     */
    private static boolean isVersionString(String s) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14037);
        __CLR4_5_2as1as1lvickrsk.R.inc(14038);for (int i = 0; (((i < s.length())&&(__CLR4_5_2as1as1lvickrsk.R.iget(14039)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14040)==0&false)); i++) {{
            __CLR4_5_2as1as1lvickrsk.R.inc(14041);char ch = s.charAt(i);
            __CLR4_5_2as1as1lvickrsk.R.inc(14042);if ((((!isVersionStringChar(ch))&&(__CLR4_5_2as1as1lvickrsk.R.iget(14043)!=0|true))||(__CLR4_5_2as1as1lvickrsk.R.iget(14044)==0&false))) {{
                __CLR4_5_2as1as1lvickrsk.R.inc(14045);return false;
            }
        }}
        }__CLR4_5_2as1as1lvickrsk.R.inc(14046);return true;
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * Determines if the specified character is a version string character
     * (either a digit or a period).
     * 
     * @param ch
     *        The character to test for.
     * @return {@code true} of the specified char is a version string char,
     *         otherwise {@code false}.
     */
    private static boolean isVersionStringChar(char ch) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14047);
        __CLR4_5_2as1as1lvickrsk.R.inc(14048);return isDigit(ch) || ch == '.' || ch == 'v';
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}

    /**
     * Determines if the specified char is a digit.
     * 
     * @param ch
     *        The char to test for.
     * @return {@code true} if the specified char is a digit, otherwise
     *         {@code false}.
     */
    private static boolean isDigit(char ch) {try{__CLR4_5_2as1as1lvickrsk.R.inc(14049);
        __CLR4_5_2as1as1lvickrsk.R.inc(14050);return ch >= '0' && ch <= '9';
    }finally{__CLR4_5_2as1as1lvickrsk.R.flushNeeded();}}
}
