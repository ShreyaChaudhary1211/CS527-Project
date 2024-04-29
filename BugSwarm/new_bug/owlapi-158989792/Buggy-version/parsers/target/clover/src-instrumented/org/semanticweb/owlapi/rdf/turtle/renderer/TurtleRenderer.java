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
package org.semanticweb.owlapi.rdf.turtle.renderer;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.RDFLiteral;
import org.semanticweb.owlapi.io.RDFNode;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFResourceIRI;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.NodeID;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.rdf.RDFRendererBase;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.EscapeUtils;
import org.semanticweb.owlapi.util.VersionInfo;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class TurtleRenderer extends RDFRendererBase {public static class __CLR4_5_2vdfvdflvicmdky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,40996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final PrintWriter writer;
    private final PrefixManager pm;
    private final Set<RDFResource> pending = new HashSet<>();
    private final Deque<RDFResourceBlankNode> nodesToRenderSeparately = new LinkedList<>();
    private final String base;
    private final OWLDocumentFormat format;
    int bufferLength = 0;
    int lastNewLineIndex = 0;
    @Nonnull protected final Deque<Integer> tabs = new LinkedList<>();
    int level = 0;

    /**
     * @param ontology
     *        ontology
     * @param writer
     *        writer
     * @param format
     *        format
     */
    public TurtleRenderer(@Nonnull OWLOntology ontology, Writer writer, OWLDocumentFormat format) {
        super(ontology, format);__CLR4_5_2vdfvdflvicmdky.R.inc(40660);try{__CLR4_5_2vdfvdflvicmdky.R.inc(40659);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40661);this.format = checkNotNull(format, "format cannot be null");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40662);this.writer = new PrintWriter(writer);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40663);pm = new DefaultPrefixManager();
        __CLR4_5_2vdfvdflvicmdky.R.inc(40664);if ((((!ontology.isAnonymous())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40665)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40666)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40667);String ontologyIRIString = ontology.getOntologyID().getOntologyIRI().get().toString();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40668);String defaultPrefix = ontologyIRIString;
            __CLR4_5_2vdfvdflvicmdky.R.inc(40669);if ((((!ontologyIRIString.endsWith("/"))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40670)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40671)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40672);defaultPrefix = ontologyIRIString + '#';
            }
            }__CLR4_5_2vdfvdflvicmdky.R.inc(40673);pm.setDefaultPrefix(defaultPrefix);
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40674);if ((((format instanceof PrefixDocumentFormat)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40675)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40676)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40677);PrefixDocumentFormat prefixFormat = (PrefixDocumentFormat) format;
            __CLR4_5_2vdfvdflvicmdky.R.inc(40678);pm.copyPrefixesFrom(prefixFormat);
            __CLR4_5_2vdfvdflvicmdky.R.inc(40679);pm.setPrefixComparator(prefixFormat.getPrefixComparator());
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40680);base = "";
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void writeNamespaces() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40681);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40682);for (Map.Entry<String, String> e : pm.getPrefixName2PrefixMap().entrySet()) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40683);write("@prefix ");
            __CLR4_5_2vdfvdflvicmdky.R.inc(40684);write(e.getKey());
            __CLR4_5_2vdfvdflvicmdky.R.inc(40685);writeSpace();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40686);writeAsURI(e.getValue());
            __CLR4_5_2vdfvdflvicmdky.R.inc(40687);write(" .");
            __CLR4_5_2vdfvdflvicmdky.R.inc(40688);writeNewLine();
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    protected void pushTab() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40689);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40690);tabs.push(getIndent());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    protected void popTab() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40691);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40692);if ((((!tabs.isEmpty())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40693)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40694)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40695);tabs.pop();
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void write(@Nonnull String s) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40696);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40697);int newLineIndex = s.indexOf('\n');
        __CLR4_5_2vdfvdflvicmdky.R.inc(40698);if ((((newLineIndex != -1)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40699)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40700)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40701);lastNewLineIndex = bufferLength + newLineIndex;
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40702);writer.write(s);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40703);bufferLength += s.length();
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private int getCurrentPos() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40704);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40705);return bufferLength;
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private Integer getIndent() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40706);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40707);return Integer.valueOf(getCurrentPos() - lastNewLineIndex);
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void writeAsURI(@Nonnull String s) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40708);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40709);write("<");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40710);if ((((s.startsWith(base))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40711)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40712)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40713);write(s.substring(base.length()));
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40714);write(s);
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40715);write(">");
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private static String escapeDot(String iri) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40716);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40717);if ((((iri.endsWith("."))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40718)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40719)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40720);return iri.substring(0, iri.length() - 1) + "\\u002E";
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40721);return iri;
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void write(@Nonnull IRI iri) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40722);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40723);if ((((NodeID.isAnonymousNodeIRI(iri))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40724)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40725)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40726);write(iri.toString());
        } }else {__CLR4_5_2vdfvdflvicmdky.R.inc(40727);if ((((iri.equals(ontology.getOntologyID().getOntologyIRI().orNull()))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40728)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40729)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40730);writeAsURI(iri.toString());
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40731);String name = pm.getPrefixIRI(iri);
            __CLR4_5_2vdfvdflvicmdky.R.inc(40732);if ((((name == null)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40733)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40734)==0&false))) {{
                // No QName!
                // As this is not an XML output, qnames are not necessary; other
                // splits are allowed.
                __CLR4_5_2vdfvdflvicmdky.R.inc(40735);name = forceSplitIfPrefixExists(iri);
            }
            }__CLR4_5_2vdfvdflvicmdky.R.inc(40736);if ((((name == null)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40737)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40738)==0&false))) {{
                // no qname and no matching prefix
                __CLR4_5_2vdfvdflvicmdky.R.inc(40739);writeAsURI(iri.toString());
            } }else {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40740);if ((((name.endsWith("."))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40741)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40742)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40743);writeAsURI(iri.toString());
                } }else {__CLR4_5_2vdfvdflvicmdky.R.inc(40744);if ((((name.indexOf(':') != -1)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40745)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40746)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40747);write(name);
                } }else {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40748);write(":");
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40749);write(name);
                }
            }}}
        }}
    }}}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private String forceSplitIfPrefixExists(IRI iri) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40750);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40751);List<Map.Entry<String, String>> prefixName2PrefixMap = new ArrayList<>(pm.getPrefixName2PrefixMap().entrySet());
        // sort the entries in reverse lexicographic order by value (longest
        // prefix first)
        __CLR4_5_2vdfvdflvicmdky.R.inc(40752);Collections.sort(prefixName2PrefixMap, new Comparator<Map.Entry<String, String>>() {

            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40753);
                __CLR4_5_2vdfvdflvicmdky.R.inc(40754);return o2.getValue().compareTo(o1.getValue());
            }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}
        });
        __CLR4_5_2vdfvdflvicmdky.R.inc(40755);String actualIRI = iri.toString();
        __CLR4_5_2vdfvdflvicmdky.R.inc(40756);for (Map.Entry<String, String> e : prefixName2PrefixMap) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40757);if ((((actualIRI.startsWith(e.getValue()) && noSplits(actualIRI, e.getValue().length()))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40758)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40759)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40760);return e.getKey() + actualIRI.substring(e.getValue().length());
            }
        }}
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40761);return null;
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}
    
    private boolean noSplits(String s, int index) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40762);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40763);return s.indexOf('#', index)<0 && s.indexOf('/', index)<0; 
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void writeNewLine() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40764);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40765);write("\n");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40766);int tabIndent = 0;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40767);if ((((!tabs.isEmpty())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40768)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40769)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40770);tabIndent = tabs.peek().intValue();
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40771);for (int i = 1; (((i < tabIndent)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40772)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40773)==0&false)); i++) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40774);writeSpace();
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    protected void writeAt() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40775);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40776);write("@");
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    protected void writeSpace() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40777);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40778);write(" ");
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void write(@Nonnull RDFNode node) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40779);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40780);if ((((node.isLiteral())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40781)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40782)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40783);write((RDFLiteral) node);
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40784);write((RDFResource) node);
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void write(@Nonnull RDFLiteral node) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40785);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40786);if ((((!node.isPlainLiteral())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40787)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40788)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40789);if ((((node.getDatatype().equals(XSDVocabulary.INTEGER.getIRI()))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40790)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40791)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40792);write(node.getLexicalValue());
            } }else {__CLR4_5_2vdfvdflvicmdky.R.inc(40793);if ((((node.getDatatype().equals(XSDVocabulary.DECIMAL.getIRI()))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40794)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40795)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40796);write(node.getLexicalValue());
            } }else {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40797);writeStringLiteral(node.getLexicalValue());
                __CLR4_5_2vdfvdflvicmdky.R.inc(40798);write("^^");
                __CLR4_5_2vdfvdflvicmdky.R.inc(40799);write(node.getDatatype());
            }
        }}} }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40800);writeStringLiteral(node.getLexicalValue());
            __CLR4_5_2vdfvdflvicmdky.R.inc(40801);if ((((node.hasLang())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40802)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40803)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40804);writeAt();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40805);write(node.getLang());
            }
        }}
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void writeStringLiteral(@Nonnull String literal) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40806);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40807);String escapedLiteral = EscapeUtils.escapeString(literal);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40808);if ((((escapedLiteral.indexOf('\n') != -1)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40809)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40810)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40811);write("\"\"\"");
            __CLR4_5_2vdfvdflvicmdky.R.inc(40812);write(escapedLiteral);
            __CLR4_5_2vdfvdflvicmdky.R.inc(40813);write("\"\"\"");
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40814);write("\"");
            __CLR4_5_2vdfvdflvicmdky.R.inc(40815);write(escapedLiteral);
            __CLR4_5_2vdfvdflvicmdky.R.inc(40816);write("\"");
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void write(@Nonnull RDFResource node) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40817);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40818);if ((((!node.isAnonymous())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40819)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40820)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40821);write(node.getIRI());
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40822);pushTab();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40823);if ((((!isObjectList(node))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40824)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40825)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40826);render(node);
            } }else {{
                // List - special syntax
                __CLR4_5_2vdfvdflvicmdky.R.inc(40827);List<RDFNode> list = new ArrayList<>();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40828);toJavaList(node, list);
                __CLR4_5_2vdfvdflvicmdky.R.inc(40829);pushTab();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40830);write("(");
                __CLR4_5_2vdfvdflvicmdky.R.inc(40831);writeSpace();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40832);pushTab();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40833);for (Iterator<RDFNode> it = list.iterator(); (((it.hasNext())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40834)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40835)==0&false));) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40836);write(verifyNotNull(it.next()));
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40837);if ((((it.hasNext())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40838)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40839)==0&false))) {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40840);writeNewLine();
                    }
                }}
                }__CLR4_5_2vdfvdflvicmdky.R.inc(40841);popTab();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40842);writeNewLine();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40843);write(")");
                __CLR4_5_2vdfvdflvicmdky.R.inc(40844);popTab();
            }
            }__CLR4_5_2vdfvdflvicmdky.R.inc(40845);popTab();
        }
    }}finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void beginDocument() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40846);
        // Namespaces
        __CLR4_5_2vdfvdflvicmdky.R.inc(40847);writeNamespaces();
        __CLR4_5_2vdfvdflvicmdky.R.inc(40848);write("@base ");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40849);write("<");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40850);if ((((!ontology.isAnonymous())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40851)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40852)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40853);write(ontology.getOntologyID().getOntologyIRI().get().toString());
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40854);write(Namespaces.OWL.toString());
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40855);write("> .\n\n");
        // Ontology URI
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void endDocument() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40856);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40857);writeComment(VersionInfo.getVersionInfo().getGeneratedByMessage());
        __CLR4_5_2vdfvdflvicmdky.R.inc(40858);if ((((!format.isAddMissingTypes())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40859)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40860)==0&false))) {{
            // missing type declarations could have been omitted, adding a
            // comment to document it
            __CLR4_5_2vdfvdflvicmdky.R.inc(40861);writeComment("Warning: type declarations were not added automatically.");
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40862);writer.flush();
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeClassComment(@Nonnull OWLClass cls) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40863);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40864);writeComment(cls.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeObjectPropertyComment(@Nonnull OWLObjectProperty prop) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40865);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40866);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeDataPropertyComment(@Nonnull OWLDataProperty prop) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40867);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40868);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeIndividualComments(@Nonnull OWLNamedIndividual ind) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40869);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40870);writeComment(ind.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeAnnotationPropertyComment(@Nonnull OWLAnnotationProperty prop) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40871);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40872);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeDatatypeComment(@Nonnull OWLDatatype datatype) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40873);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40874);writeComment(datatype.getIRI().toString());
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    private void writeComment(@Nonnull String comment) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40875);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40876);write("###  ");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40877);write(comment);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40878);writeNewLine();
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void endObject() {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40879);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40880);writeNewLine();
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    protected void writeBanner(String name) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40881);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40882);writer.print("#################################################################\n#    ");
        __CLR4_5_2vdfvdflvicmdky.R.inc(40883);writer.println(name);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40884);writer.println("#################################################################\n");
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}

    @Override
    public void render(@Nonnull RDFResource node) {try{__CLR4_5_2vdfvdflvicmdky.R.inc(40885);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40886);level++;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40887);Collection<RDFTriple> triples;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40888);if ((((pending.contains(node))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40889)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40890)==0&false))) {{
            // We essentially remove all structure sharing during parsing - any
            // cycles therefore indicate a bug!
            __CLR4_5_2vdfvdflvicmdky.R.inc(40891);triples = Collections.emptyList();
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40892);triples = graph.getTriplesForSubject(node);
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40893);pending.add(node);
        __CLR4_5_2vdfvdflvicmdky.R.inc(40894);RDFResource lastSubject = null;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40895);RDFResourceIRI lastPredicate = null;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40896);boolean first = true;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40897);for (RDFTriple triple : triples) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40898);RDFResource subj = triple.getSubject();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40899);RDFResourceIRI pred = triple.getPredicate();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40900);RDFNode object = triple.getObject();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40901);if ((((lastSubject != null && (subj.equals(lastSubject) || subj.isAnonymous()))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40902)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40903)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40904);if ((((lastPredicate != null && pred.equals(lastPredicate))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40905)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40906)==0&false))) {{
                    // Only the object differs from previous triple
                    // Just write the object
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40907);write(" ,");
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40908);writeNewLine();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40909);if ((((object.isAnonymous() && object.isIndividual() && object.shouldOutputId())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40910)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40911)==0&false))) {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40912);if ((((!pending.contains(object))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40913)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40914)==0&false))) {{
                            __CLR4_5_2vdfvdflvicmdky.R.inc(40915);nodesToRenderSeparately.add((RDFResourceBlankNode) object);
                        }
                        }__CLR4_5_2vdfvdflvicmdky.R.inc(40916);write(object.getIRI());
                    } }else {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40917);write(object);
                    }
                }} }else {{
                    // The predicate, object differ from previous triple
                    // Just write the predicate and object
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40918);write(" ;");
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40919);popTab();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40920);writeNewLine();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40921);write(triple.getPredicate());
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40922);writeSpace();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40923);pushTab();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40924);if ((((object.isAnonymous() && object.isIndividual() && object.shouldOutputId())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40925)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40926)==0&false))) {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40927);if ((((!pending.contains(object))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40928)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40929)==0&false))) {{
                            __CLR4_5_2vdfvdflvicmdky.R.inc(40930);nodesToRenderSeparately.add((RDFResourceBlankNode) object);
                        }
                        }__CLR4_5_2vdfvdflvicmdky.R.inc(40931);write(object.getIRI());
                    } }else {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40932);write(object);
                    }
                }}
            }} }else {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40933);if ((((!first)&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40934)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40935)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40936);popTab();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40937);popTab();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40938);writeNewLine();
                }
                // Subject, predicate and object are different from last triple
                }__CLR4_5_2vdfvdflvicmdky.R.inc(40939);if ((((!node.isAnonymous())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40940)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40941)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40942);write(subj);
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40943);writeSpace();
                } }else {__CLR4_5_2vdfvdflvicmdky.R.inc(40944);if ((((node.isIndividual() && node.shouldOutputId())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40945)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40946)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40947);write(subj.getIRI());
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40948);writeSpace();
                } }else {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40949);pushTab();
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40950);write("[");
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40951);writeSpace();
                }
                }}__CLR4_5_2vdfvdflvicmdky.R.inc(40952);pushTab();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40953);write(triple.getPredicate());
                __CLR4_5_2vdfvdflvicmdky.R.inc(40954);writeSpace();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40955);pushTab();
                __CLR4_5_2vdfvdflvicmdky.R.inc(40956);if ((((object.isAnonymous() && object.isIndividual() && object.shouldOutputId())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40957)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40958)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40959);if ((((!pending.contains(object))&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40960)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40961)==0&false))) {{
                        __CLR4_5_2vdfvdflvicmdky.R.inc(40962);nodesToRenderSeparately.add((RDFResourceBlankNode) object);
                    }
                    }__CLR4_5_2vdfvdflvicmdky.R.inc(40963);write(object.getIRI());
                } }else {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40964);write(object);
                }
            }}
            }__CLR4_5_2vdfvdflvicmdky.R.inc(40965);lastSubject = subj;
            __CLR4_5_2vdfvdflvicmdky.R.inc(40966);lastPredicate = pred;
            __CLR4_5_2vdfvdflvicmdky.R.inc(40967);first = false;
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40968);if ((((node.isAnonymous())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40969)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40970)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40971);popTab();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40972);popTab();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40973);if ((((!node.isIndividual() || !node.shouldOutputId())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40974)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40975)==0&false))) {{
                __CLR4_5_2vdfvdflvicmdky.R.inc(40976);if ((((triples.isEmpty())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40977)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40978)==0&false))) {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40979);write("[ ");
                } }else {{
                    __CLR4_5_2vdfvdflvicmdky.R.inc(40980);writeNewLine();
                }
                }__CLR4_5_2vdfvdflvicmdky.R.inc(40981);write("]");
            }
            }__CLR4_5_2vdfvdflvicmdky.R.inc(40982);popTab();
        } }else {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40983);popTab();
            __CLR4_5_2vdfvdflvicmdky.R.inc(40984);popTab();
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40985);if ((((level == 1 && !triples.isEmpty())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40986)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40987)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40988);write(" .\n\n");
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40989);writer.flush();
        __CLR4_5_2vdfvdflvicmdky.R.inc(40990);level--;
        __CLR4_5_2vdfvdflvicmdky.R.inc(40991);while ((((!nodesToRenderSeparately.isEmpty())&&(__CLR4_5_2vdfvdflvicmdky.R.iget(40992)!=0|true))||(__CLR4_5_2vdfvdflvicmdky.R.iget(40993)==0&false))) {{
            __CLR4_5_2vdfvdflvicmdky.R.inc(40994);render(nodesToRenderSeparately.poll());
        }
        }__CLR4_5_2vdfvdflvicmdky.R.inc(40995);pending.remove(node);
    }finally{__CLR4_5_2vdfvdflvicmdky.R.flushNeeded();}}
}
