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
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.io.IOException;
import java.io.Writer;
import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.RDFRendererBase;
import org.semanticweb.owlapi.util.AnnotationValueShortFormProvider;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.VersionInfo;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class RDFXMLRenderer extends RDFRendererBase {public static class __CLR4_5_2rngrnglvicmd5r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,35991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final RDFXMLWriter writer;
    @Nonnull private final Set<RDFResource> pending = new HashSet<>();
    @Nonnull private final RDFXMLNamespaceManager qnameManager;
    @Nonnull private final OWLDocumentFormat format;
    ShortFormProvider labelMaker;

    /**
     * @param ontology
     *        ontology
     * @param w
     *        writer
     */
    public RDFXMLRenderer(@Nonnull OWLOntology ontology, @Nonnull Writer w) {
        this(checkNotNull(ontology, "ontology cannot be null"), checkNotNull(w, "w cannot be null"), verifyNotNull(
            ontology.getOWLOntologyManager().getOntologyFormat(ontology)));__CLR4_5_2rngrnglvicmd5r.R.inc(35837);try{__CLR4_5_2rngrnglvicmd5r.R.inc(35836);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology
     * @param w
     *        writer
     * @param format
     *        format
     */
    public RDFXMLRenderer(@Nonnull OWLOntology ontology, @Nonnull Writer w, @Nonnull OWLDocumentFormat format) {
        super(checkNotNull(ontology, "ontology cannot be null"), checkNotNull(format, "format cannot be null"));__CLR4_5_2rngrnglvicmd5r.R.inc(35839);try{__CLR4_5_2rngrnglvicmd5r.R.inc(35838);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35840);this.format = checkNotNull(format, "format cannot be null");
        __CLR4_5_2rngrnglvicmd5r.R.inc(35841);qnameManager = new RDFXMLNamespaceManager(ontology, format);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35842);String defaultNamespace = qnameManager.getDefaultNamespace();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35843);String base = base(defaultNamespace);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35844);writer = new RDFXMLWriter(XMLWriterFactory.createXMLWriter(checkNotNull(w, "w cannot be null"), qnameManager,
            base));
        __CLR4_5_2rngrnglvicmd5r.R.inc(35845);Map<OWLAnnotationProperty, List<String>> prefLangMap = new HashMap<>();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35846);OWLOntologyManager manager = ontology.getOWLOntologyManager();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35847);OWLDataFactory df = manager.getOWLDataFactory();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35848);OWLAnnotationProperty labelProp = df.getOWLAnnotationProperty(RDFS_LABEL.getIRI());
        __CLR4_5_2rngrnglvicmd5r.R.inc(35849);labelMaker = new AnnotationValueShortFormProvider(Collections.singletonList(labelProp), prefLangMap, manager);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Nonnull
    private static String base(@Nonnull String defaultNamespace) {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35850);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35851);String base;
        __CLR4_5_2rngrnglvicmd5r.R.inc(35852);if ((((defaultNamespace.endsWith("#"))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35853)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35854)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35855);base = defaultNamespace.substring(0, defaultNamespace.length() - 1);
        } }else {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35856);base = defaultNamespace;
        }
        }__CLR4_5_2rngrnglvicmd5r.R.inc(35857);return base;
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    /**
     * @return unserializable entities
     */
    @Nonnull
    public Set<OWLEntity> getUnserialisableEntities() {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35858);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35859);return qnameManager.getEntitiesWithInvalidQNames();
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void beginDocument() throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35860);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35861);writer.startDocument();
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void endDocument() throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35862);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35863);writer.endDocument();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35864);writer.writeComment(VersionInfo.getVersionInfo().getGeneratedByMessage());
        __CLR4_5_2rngrnglvicmd5r.R.inc(35865);if ((((!format.isAddMissingTypes())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35866)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35867)==0&false))) {{
            // missing type declarations could have been omitted, adding a
            // comment to document it
            __CLR4_5_2rngrnglvicmd5r.R.inc(35868);writer.writeComment("Warning: type declarations were not added automatically.");
        }
    }}finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeIndividualComments(@Nonnull OWLNamedIndividual ind) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35869);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35870);writeCommentForEntity("ind", ind);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeClassComment(@Nonnull OWLClass cls) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35871);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35872);writeCommentForEntity("cls", cls);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeDataPropertyComment(@Nonnull OWLDataProperty prop) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35873);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35874);writeCommentForEntity("prop", prop);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeObjectPropertyComment(@Nonnull OWLObjectProperty prop) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35875);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35876);writeCommentForEntity("prop", prop);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeAnnotationPropertyComment(@Nonnull OWLAnnotationProperty prop) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35877);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35878);writeCommentForEntity("prop", prop);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeDatatypeComment(@Nonnull OWLDatatype datatype) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35879);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35880);writeCommentForEntity("datatype", datatype);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    private void writeCommentForEntity(String msg, OWLEntity entity) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35881);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35882);if ((((XMLWriterPreferences.getInstance().isBannersEnabled())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35883)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35884)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35885);checkNotNull(entity, msg + " cannot be null");
            __CLR4_5_2rngrnglvicmd5r.R.inc(35886);String iriString = entity.getIRI().toString();
            __CLR4_5_2rngrnglvicmd5r.R.inc(35887);if ((((XMLWriterPreferences.getInstance().isLabelsAsBanner())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35888)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35889)==0&false))) {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35890);String labelString = labelMaker.getShortForm(entity);
                __CLR4_5_2rngrnglvicmd5r.R.inc(35891);String commentString = null;
                __CLR4_5_2rngrnglvicmd5r.R.inc(35892);if ((((!iriString.equals(labelString))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35893)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35894)==0&false))) {{
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35895);commentString = labelString;
                } }else {{
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35896);commentString = iriString;
                }
                }__CLR4_5_2rngrnglvicmd5r.R.inc(35897);writer.writeComment(XMLUtils.escapeXML(commentString));
            } }else {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35898);writer.writeComment(XMLUtils.escapeXML(iriString));
            }
        }}
    }}finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    protected void writeBanner(@Nonnull String name) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35899);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35900);writer.writeComment(
            "\n///////////////////////////////////////////////////////////////////////////////////////\n//\n// "
                + checkNotNull(name, "name cannot be null")
                + "\n//\n///////////////////////////////////////////////////////////////////////////////////////\n");
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}

    @Override
    public void render(@Nonnull RDFResource node) throws IOException {try{__CLR4_5_2rngrnglvicmd5r.R.inc(35901);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35902);checkNotNull(node, "node cannot be null");
        __CLR4_5_2rngrnglvicmd5r.R.inc(35903);if ((((pending.contains(node))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35904)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35905)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35906);return;
        }
        }__CLR4_5_2rngrnglvicmd5r.R.inc(35907);pending.add(node);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35908);RDFTriple candidatePrettyPrintTypeTriple = null;
        __CLR4_5_2rngrnglvicmd5r.R.inc(35909);Collection<RDFTriple> triples = graph.getTriplesForSubject(node);
        __CLR4_5_2rngrnglvicmd5r.R.inc(35910);for (RDFTriple triple : triples) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35911);IRI propertyIRI = triple.getPredicate().getIRI();
            __CLR4_5_2rngrnglvicmd5r.R.inc(35912);if ((((propertyIRI.equals(RDF_TYPE.getIRI()) && !triple.getObject().isAnonymous() && BUILT_IN_VOCABULARY_IRIS
                .contains(triple.getObject().getIRI()) && prettyPrintedTypes.contains(triple.getObject().getIRI()))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35913)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35914)==0&false))) {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35915);candidatePrettyPrintTypeTriple = triple;
            }
        }}
        }__CLR4_5_2rngrnglvicmd5r.R.inc(35916);if ((((candidatePrettyPrintTypeTriple == null)&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35917)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35918)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35919);writer.writeStartElement(RDF_DESCRIPTION.getIRI());
        } }else {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35920);writer.writeStartElement(candidatePrettyPrintTypeTriple.getObject().getIRI());
        }
        }__CLR4_5_2rngrnglvicmd5r.R.inc(35921);if ((((!node.isAnonymous())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35922)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35923)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35924);writer.writeAboutAttribute(node.getIRI());
        } }else {__CLR4_5_2rngrnglvicmd5r.R.inc(35925);if ((((node.isIndividual() && node.shouldOutputId())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35926)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35927)==0&false))) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35928);writer.writeNodeIDAttribute((RDFResourceBlankNode) node);
        }
        }}__CLR4_5_2rngrnglvicmd5r.R.inc(35929);for (RDFTriple triple : triples) {{
            __CLR4_5_2rngrnglvicmd5r.R.inc(35930);if ((((candidatePrettyPrintTypeTriple != null && candidatePrettyPrintTypeTriple.equals(triple))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35931)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35932)==0&false))) {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35933);continue;
            }
            }__CLR4_5_2rngrnglvicmd5r.R.inc(35934);writer.writeStartElement(triple.getPredicate().getIRI());
            __CLR4_5_2rngrnglvicmd5r.R.inc(35935);RDFNode objectNode = triple.getObject();
            __CLR4_5_2rngrnglvicmd5r.R.inc(35936);if ((((!objectNode.isLiteral())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35937)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35938)==0&false))) {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35939);RDFResource objectRes = (RDFResource) objectNode;
                __CLR4_5_2rngrnglvicmd5r.R.inc(35940);if ((((objectRes.isAnonymous())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35941)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35942)==0&false))) {{
                    // Special rendering for lists
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35943);if ((((isObjectList(objectRes))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35944)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35945)==0&false))) {{
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35946);writer.writeParseTypeAttribute();
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35947);List<RDFNode> list = new ArrayList<>();
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35948);toJavaList(objectRes, list);
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35949);for (RDFNode n : list) {{
                            __CLR4_5_2rngrnglvicmd5r.R.inc(35950);if ((((n.isAnonymous())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35951)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35952)==0&false))) {{
                                __CLR4_5_2rngrnglvicmd5r.R.inc(35953);render((RDFResourceBlankNode) n);
                            } }else {{
                                __CLR4_5_2rngrnglvicmd5r.R.inc(35954);if ((((n.isLiteral())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35955)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35956)==0&false))) {{
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35957);RDFLiteral litNode = (RDFLiteral) n;
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35958);writer.writeStartElement(RDFS_LITERAL.getIRI());
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35959);if ((((!litNode.isPlainLiteral())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35960)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35961)==0&false))) {{
                                        __CLR4_5_2rngrnglvicmd5r.R.inc(35962);writer.writeDatatypeAttribute(litNode.getDatatype());
                                    } }else {__CLR4_5_2rngrnglvicmd5r.R.inc(35963);if ((((litNode.hasLang())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35964)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35965)==0&false))) {{
                                        __CLR4_5_2rngrnglvicmd5r.R.inc(35966);writer.writeLangAttribute(litNode.getLang());
                                    }
                                    }}__CLR4_5_2rngrnglvicmd5r.R.inc(35967);writer.writeTextContent(litNode.getLexicalValue());
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35968);writer.writeEndElement();
                                } }else {{
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35969);writer.writeStartElement(RDF_DESCRIPTION.getIRI());
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35970);writer.writeAboutAttribute(n.getIRI());
                                    __CLR4_5_2rngrnglvicmd5r.R.inc(35971);writer.writeEndElement();
                                }
                            }}
                        }}
                    }} }else {__CLR4_5_2rngrnglvicmd5r.R.inc(35972);if ((((objectRes.equals(node))&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35973)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35974)==0&false))) {{
                        // special case for triples with same object and subject
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35975);writer.writeNodeIDAttribute((RDFResourceBlankNode) objectRes);
                    } }else {{
                        __CLR4_5_2rngrnglvicmd5r.R.inc(35976);render(objectRes);
                    }
                }}} }else {{
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35977);writer.writeResourceAttribute(objectRes.getIRI());
                }
            }} }else {{
                __CLR4_5_2rngrnglvicmd5r.R.inc(35978);RDFLiteral rdfLiteralNode = (RDFLiteral) objectNode;
                __CLR4_5_2rngrnglvicmd5r.R.inc(35979);if ((((!rdfLiteralNode.isPlainLiteral())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35980)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35981)==0&false))) {{
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35982);writer.writeDatatypeAttribute(rdfLiteralNode.getDatatype());
                } }else {__CLR4_5_2rngrnglvicmd5r.R.inc(35983);if ((((rdfLiteralNode.hasLang())&&(__CLR4_5_2rngrnglvicmd5r.R.iget(35984)!=0|true))||(__CLR4_5_2rngrnglvicmd5r.R.iget(35985)==0&false))) {{
                    __CLR4_5_2rngrnglvicmd5r.R.inc(35986);writer.writeLangAttribute(rdfLiteralNode.getLang());
                }
                }}__CLR4_5_2rngrnglvicmd5r.R.inc(35987);writer.writeTextContent(rdfLiteralNode.getLexicalValue());
            }
            }__CLR4_5_2rngrnglvicmd5r.R.inc(35988);writer.writeEndElement();
        }
        }__CLR4_5_2rngrnglvicmd5r.R.inc(35989);writer.writeEndElement();
        __CLR4_5_2rngrnglvicmd5r.R.inc(35990);pending.remove(node);
    }finally{__CLR4_5_2rngrnglvicmd5r.R.flushNeeded();}}
}
