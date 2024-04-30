/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 * 
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * 
 * Copyright (C) 2011, The University of Queensland
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see http://www.gnu.org/licenses/.
 * 
 * 
 * Alternatively, the contents of this file may be used under the terms of the Apache License,
 * Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable
 * instead of those above.
 * 
 * Copyright 2011, The University of Queensland
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.semanticweb.owlapi.rio;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.openrdf.OpenRDFUtil;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFHandlerException;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.RDFRendererBase;
import org.semanticweb.owlapi.rio.utils.RioUtils;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.VersionInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public class RioRenderer extends RDFRendererBase {public static class __CLR4_5_2huhulvicnc61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger logger = LoggerFactory
        .getLogger(RioRenderer.class);
    private final RDFHandler writer;
    private final DefaultPrefixManager pm;
    @Nonnull
    private final Set<RDFResource> pendingNodes = new LinkedHashSet<>();
    @Nonnull
    private final Set<RDFTriple> renderedStatements = new LinkedHashSet<>();
    private final Resource[] contexts;
    private Map<RDFTriple, RDFResourceBlankNode> triplesWithRemappedNodes;

    /**
     * @param ontology
     *        ontology
     * @param writer
     *        writer
     * @param format
     *        format
     * @param contexts
     *        contexts
     */
    public RioRenderer(@Nonnull final OWLOntology ontology,
        final RDFHandler writer, final OWLDocumentFormat format,
        final Resource... contexts) {
        super(ontology, format);__CLR4_5_2huhulvicnc61.R.inc(643);try{__CLR4_5_2huhulvicnc61.R.inc(642);
        __CLR4_5_2huhulvicnc61.R.inc(644);OpenRDFUtil.verifyContextNotNull(contexts);
        __CLR4_5_2huhulvicnc61.R.inc(645);this.contexts = contexts;
        __CLR4_5_2huhulvicnc61.R.inc(646);this.writer = writer;
        __CLR4_5_2huhulvicnc61.R.inc(647);pm = new DefaultPrefixManager();
        __CLR4_5_2huhulvicnc61.R.inc(648);if ((((!ontology.isAnonymous())&&(__CLR4_5_2huhulvicnc61.R.iget(649)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(650)==0&false))) {{
            __CLR4_5_2huhulvicnc61.R.inc(651);String ontologyIRIString = ontology.getOntologyID()
                .getOntologyIRI().get().toString();
            __CLR4_5_2huhulvicnc61.R.inc(652);String defaultPrefix = ontologyIRIString;
            __CLR4_5_2huhulvicnc61.R.inc(653);if ((((!ontologyIRIString.endsWith("/"))&&(__CLR4_5_2huhulvicnc61.R.iget(654)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(655)==0&false))) {{
                __CLR4_5_2huhulvicnc61.R.inc(656);defaultPrefix = ontologyIRIString + '#';
            }
            }__CLR4_5_2huhulvicnc61.R.inc(657);pm.setDefaultPrefix(defaultPrefix);
        }
        // copy prefixes out of the given format if it is a
        // PrefixOWLOntologyFormat
        }__CLR4_5_2huhulvicnc61.R.inc(658);if ((((format instanceof PrefixDocumentFormat)&&(__CLR4_5_2huhulvicnc61.R.iget(659)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(660)==0&false))) {{
            __CLR4_5_2huhulvicnc61.R.inc(661);PrefixDocumentFormat prefixFormat = (PrefixDocumentFormat) format;
            __CLR4_5_2huhulvicnc61.R.inc(662);pm.copyPrefixesFrom(prefixFormat);
            __CLR4_5_2huhulvicnc61.R.inc(663);pm.setPrefixComparator(prefixFormat.getPrefixComparator());
        }
        // base = "";
    }}finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void beginDocument() throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(664);
        __CLR4_5_2huhulvicnc61.R.inc(665);pendingNodes.clear();
        __CLR4_5_2huhulvicnc61.R.inc(666);renderedStatements.clear();
        __CLR4_5_2huhulvicnc61.R.inc(667);try {
            __CLR4_5_2huhulvicnc61.R.inc(668);writer.startRDF();
        } catch (RDFHandlerException e) {
            __CLR4_5_2huhulvicnc61.R.inc(669);throw new IOException(e);
        }
        // Namespaces
        __CLR4_5_2huhulvicnc61.R.inc(670);writeNamespaces();
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void endDocument() throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(671);
        __CLR4_5_2huhulvicnc61.R.inc(672);writeComment(VersionInfo.getVersionInfo().getGeneratedByMessage());
        __CLR4_5_2huhulvicnc61.R.inc(673);try {
            __CLR4_5_2huhulvicnc61.R.inc(674);writer.endRDF();
        } catch (RDFHandlerException e) {
            __CLR4_5_2huhulvicnc61.R.inc(675);throw new IOException(e);
        }
        __CLR4_5_2huhulvicnc61.R.inc(676);if ((((logger.isTraceEnabled())&&(__CLR4_5_2huhulvicnc61.R.iget(677)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(678)==0&false))) {{
            __CLR4_5_2huhulvicnc61.R.inc(679);logger.trace("pendingNodes={}", pendingNodes.size());
            __CLR4_5_2huhulvicnc61.R.inc(680);logger.trace("renderedStatements={}", renderedStatements.size());
        }
        }__CLR4_5_2huhulvicnc61.R.inc(681);pendingNodes.clear();
        __CLR4_5_2huhulvicnc61.R.inc(682);renderedStatements.clear();
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void endObject() throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(683);
        __CLR4_5_2huhulvicnc61.R.inc(684);writeComment("");
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void renderOntologyHeader() throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(685);
        __CLR4_5_2huhulvicnc61.R.inc(686);super.renderOntologyHeader();
        __CLR4_5_2huhulvicnc61.R.inc(687);triplesWithRemappedNodes = graph.computeRemappingForSharedNodes();
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void createGraph(Set<? extends OWLObject> objects) {try{__CLR4_5_2huhulvicnc61.R.inc(688);
        __CLR4_5_2huhulvicnc61.R.inc(689);super.createGraph(objects);
        __CLR4_5_2huhulvicnc61.R.inc(690);triplesWithRemappedNodes = graph.computeRemappingForSharedNodes();
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    /**
     * Renders the triples whose subject is the specified node
     * 
     * @param node
     *        The node
     */
    @Override
    public void render(final RDFResource node) throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(691);
        __CLR4_5_2huhulvicnc61.R.inc(692);if ((((pendingNodes.contains(node))&&(__CLR4_5_2huhulvicnc61.R.iget(693)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(694)==0&false))) {{
            __CLR4_5_2huhulvicnc61.R.inc(695);return;
        }
        }__CLR4_5_2huhulvicnc61.R.inc(696);pendingNodes.add(node);
        __CLR4_5_2huhulvicnc61.R.inc(697);final Collection<RDFTriple> triples = graph.getTriplesForSubject(node);
        __CLR4_5_2huhulvicnc61.R.inc(698);if ((((logger.isTraceEnabled())&&(__CLR4_5_2huhulvicnc61.R.iget(699)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(700)==0&false))) {{
            __CLR4_5_2huhulvicnc61.R.inc(701);logger.trace("triples.size()={}", triples.size());
            __CLR4_5_2huhulvicnc61.R.inc(702);if ((((!triples.isEmpty())&&(__CLR4_5_2huhulvicnc61.R.iget(703)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(704)==0&false))) {{
                __CLR4_5_2huhulvicnc61.R.inc(705);logger.trace("triples={}", triples);
            }
        }}
        }__CLR4_5_2huhulvicnc61.R.inc(706);for (final RDFTriple triple : triples) {{
            __CLR4_5_2huhulvicnc61.R.inc(707);RDFTriple tripleToRender = triple;
            __CLR4_5_2huhulvicnc61.R.inc(708);RDFResourceBlankNode remappedNode = null;
            __CLR4_5_2huhulvicnc61.R.inc(709);if ((((triplesWithRemappedNodes != null)&&(__CLR4_5_2huhulvicnc61.R.iget(710)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(711)==0&false))) {{
                __CLR4_5_2huhulvicnc61.R.inc(712);remappedNode = triplesWithRemappedNodes.get(tripleToRender);
            }
            }__CLR4_5_2huhulvicnc61.R.inc(713);if ((((remappedNode != null)&&(__CLR4_5_2huhulvicnc61.R.iget(714)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(715)==0&false))) {{
                __CLR4_5_2huhulvicnc61.R.inc(716);tripleToRender = new RDFTriple(tripleToRender.getSubject(),
                    tripleToRender.getPredicate(), remappedNode);
            }
            }__CLR4_5_2huhulvicnc61.R.inc(717);if ((((!node.equals(tripleToRender.getSubject()))&&(__CLR4_5_2huhulvicnc61.R.iget(718)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(719)==0&false))) {{
                // the node will not match the triple subject if the node itself
                // is a remapped blank node
                // in which case the triple subject needs remapping as well
                __CLR4_5_2huhulvicnc61.R.inc(720);tripleToRender = new RDFTriple(node,
                    tripleToRender.getPredicate(),
                    tripleToRender.getObject());
            }
            }__CLR4_5_2huhulvicnc61.R.inc(721);try {
                __CLR4_5_2huhulvicnc61.R.inc(722);if ((((!renderedStatements.contains(tripleToRender))&&(__CLR4_5_2huhulvicnc61.R.iget(723)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(724)==0&false))) {{
                    __CLR4_5_2huhulvicnc61.R.inc(725);renderedStatements.add(tripleToRender);
                    // then we go back and get context-sensitive statements and
                    // actually pass those to the RDFHandler
                    __CLR4_5_2huhulvicnc61.R.inc(726);for (Statement statement : RioUtils.tripleAsStatements(
                        tripleToRender, contexts)) {{
                        __CLR4_5_2huhulvicnc61.R.inc(727);writer.handleStatement(statement);
                        __CLR4_5_2huhulvicnc61.R.inc(728);if ((((tripleToRender.getObject() instanceof RDFResource)&&(__CLR4_5_2huhulvicnc61.R.iget(729)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(730)==0&false))) {{
                            __CLR4_5_2huhulvicnc61.R.inc(731);render((RDFResource) tripleToRender.getObject());
                        }
                    }}
                }} }else {__CLR4_5_2huhulvicnc61.R.inc(732);if ((((logger.isTraceEnabled())&&(__CLR4_5_2huhulvicnc61.R.iget(733)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(734)==0&false))) {{
                    __CLR4_5_2huhulvicnc61.R.inc(735);logger.trace(
                        "not printing duplicate statement, or recursing on its object: {}",
                        tripleToRender);
                }
            }}} catch (RDFHandlerException e) {
                __CLR4_5_2huhulvicnc61.R.inc(736);throw new IOException(e);
            }
        }
        }__CLR4_5_2huhulvicnc61.R.inc(737);pendingNodes.remove(node);
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeAnnotationPropertyComment(
        @Nonnull OWLAnnotationProperty prop) throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(738);
        __CLR4_5_2huhulvicnc61.R.inc(739);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeBanner(final String name) throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(740);
        __CLR4_5_2huhulvicnc61.R.inc(741);writeComment("");
        __CLR4_5_2huhulvicnc61.R.inc(742);writeComment("");
        __CLR4_5_2huhulvicnc61.R.inc(743);writeComment("#################################################################");
        __CLR4_5_2huhulvicnc61.R.inc(744);writeComment("#");
        __CLR4_5_2huhulvicnc61.R.inc(745);writeComment("#    " + name);
        __CLR4_5_2huhulvicnc61.R.inc(746);writeComment("#");
        __CLR4_5_2huhulvicnc61.R.inc(747);writeComment("#################################################################");
        __CLR4_5_2huhulvicnc61.R.inc(748);writeComment("");
        __CLR4_5_2huhulvicnc61.R.inc(749);writeComment("");
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeClassComment(@Nonnull final OWLClass cls)
        throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(750);
        __CLR4_5_2huhulvicnc61.R.inc(751);writeComment(cls.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    private void writeComment(final String comment) throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(752);
        __CLR4_5_2huhulvicnc61.R.inc(753);try {
            __CLR4_5_2huhulvicnc61.R.inc(754);writer.handleComment(comment);
        } catch (RDFHandlerException e) {
            __CLR4_5_2huhulvicnc61.R.inc(755);throw new IOException(e);
        }
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeDataPropertyComment(@Nonnull OWLDataProperty prop)
        throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(756);
        __CLR4_5_2huhulvicnc61.R.inc(757);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeDatatypeComment(@Nonnull OWLDatatype datatype)
        throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(758);
        __CLR4_5_2huhulvicnc61.R.inc(759);writeComment(datatype.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeIndividualComments(@Nonnull OWLNamedIndividual ind)
        throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(760);
        __CLR4_5_2huhulvicnc61.R.inc(761);writeComment(ind.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    private void writeNamespaces() throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(762);
        // Send the prefixes from the prefixmanager to the RDFHandler
        // NOTE: These may be derived from a PrefixOWLOntologyFormat
        __CLR4_5_2huhulvicnc61.R.inc(763);for (String prefixName : pm.getPrefixName2PrefixMap().keySet()) {{
            assert (((prefixName != null)&&(__CLR4_5_2huhulvicnc61.R.iget(764)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(765)==0&false));
            __CLR4_5_2huhulvicnc61.R.inc(766);final String prefix = pm.getPrefix(prefixName);
            // OWLAPI generally stores prefixes with a colon at the end, while
            // Sesame Rio expects
            // prefixes without the colon
            __CLR4_5_2huhulvicnc61.R.inc(767);if ((((prefixName.endsWith(":"))&&(__CLR4_5_2huhulvicnc61.R.iget(768)!=0|true))||(__CLR4_5_2huhulvicnc61.R.iget(769)==0&false))) {{
                __CLR4_5_2huhulvicnc61.R.inc(770);prefixName = prefixName.substring(0, prefixName.length() - 1);
            }
            }__CLR4_5_2huhulvicnc61.R.inc(771);try {
                __CLR4_5_2huhulvicnc61.R.inc(772);writer.handleNamespace(prefixName, prefix);
            } catch (RDFHandlerException e) {
                __CLR4_5_2huhulvicnc61.R.inc(773);throw new IOException(e);
            }
        }
    }}finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}

    @Override
    protected void writeObjectPropertyComment(
        @Nonnull final OWLObjectProperty prop) throws IOException {try{__CLR4_5_2huhulvicnc61.R.inc(774);
        __CLR4_5_2huhulvicnc61.R.inc(775);writeComment(prop.getIRI().toString());
    }finally{__CLR4_5_2huhulvicnc61.R.flushNeeded();}}
}
