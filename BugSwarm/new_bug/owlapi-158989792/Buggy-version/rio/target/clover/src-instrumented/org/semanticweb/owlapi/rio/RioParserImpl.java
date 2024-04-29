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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Nonnull;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.RDF;
import org.openrdf.rio.RDFHandler;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFParseException;
import org.openrdf.rio.RDFParser;
import org.openrdf.rio.Rio;
import org.openrdf.rio.UnsupportedRDFormatException;
import org.openrdf.rio.helpers.BasicParserSettings;
import org.openrdf.rio.helpers.StatementCollector;
import org.semanticweb.owlapi.annotations.HasPriority;
import org.semanticweb.owlapi.formats.RioRDFDocumentFormatFactory;
import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.UnloadableImportException;
import org.semanticweb.owlapi.util.AnonymousNodeChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
@HasPriority(7)
public class RioParserImpl extends AbstractOWLParser implements RioParser {public static class __CLR4_5_2e3e3lvicnc5d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    protected static final Logger LOGGER = LoggerFactory
            .getLogger(RioParserImpl.class);
    @Nonnull
    private final RioRDFDocumentFormatFactory owlFormatFactory;

    /**
     * @param nextFormat
     *        format factory
     */
    public RioParserImpl(@Nonnull RioRDFDocumentFormatFactory nextFormat) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(507);
        __CLR4_5_2e3e3lvicnc5d.R.inc(508);owlFormatFactory = checkNotNull(nextFormat, "nextFormat cannot be null");
    }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

    @Nonnull
    @Override
    public RioRDFDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_2e3e3lvicnc5d.R.inc(509);
        __CLR4_5_2e3e3lvicnc5d.R.inc(510);return owlFormatFactory;
    }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

    @Override
    public OWLDocumentFormat parse(
            final OWLOntologyDocumentSource documentSource,
            final OWLOntology ontology,
            final OWLOntologyLoaderConfiguration configuration)
            throws IOException {try{__CLR4_5_2e3e3lvicnc5d.R.inc(511);
        __CLR4_5_2e3e3lvicnc5d.R.inc(512);try {
            __CLR4_5_2e3e3lvicnc5d.R.inc(513);RioOWLRDFConsumerAdapter consumer = new RioOWLRDFConsumerAdapter(
                    ontology, new AnonymousNodeChecker() {

                        @Override
                        public boolean isAnonymousNode(final IRI iri) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(514);
                            // HACK: FIXME: When the mess of having blank nodes
                            // represented as IRIs is
                            // finished remove the genid hack below
                            __CLR4_5_2e3e3lvicnc5d.R.inc(515);if ((((iri.toString().startsWith("_:")
                                    || iri.toString().contains("genid"))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(516)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(517)==0&false))) {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(518);LOGGER.trace("isAnonymousNode(IRI {})", iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(519);return true;
                            } }else {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(520);LOGGER.trace("NOT isAnonymousNode(IRI {})", iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(521);return false;
                            }
                        }}finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

                        @Override
                        public boolean isAnonymousNode(final String iri) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(522);
                            // HACK: FIXME: When the mess of having blank nodes
                            // represented as IRIs is
                            // finished remove the genid hack below
                            __CLR4_5_2e3e3lvicnc5d.R.inc(523);if ((((iri.startsWith("_:") || iri.contains("genid"))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(524)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(525)==0&false))) {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(526);LOGGER.trace("isAnonymousNode(String {})", iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(527);return true;
                            } }else {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(528);LOGGER.trace("NOT isAnonymousNode(String {})",
                                        iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(529);return false;
                            }
                        }}finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

                        // TODO: apparently we should be tracking whether they
                        // gave a name to the blank
                        // node themselves
                        @Override
                        public boolean isAnonymousSharedNode(final String iri) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(530);
                            // HACK: FIXME: When the mess of having blank nodes
                            // represented as IRIs is
                            // finished remove the genid hack below
                            __CLR4_5_2e3e3lvicnc5d.R.inc(531);if ((((iri.startsWith("_:") || iri.contains("genid"))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(532)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(533)==0&false))) {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(534);LOGGER.trace(
                                        "isAnonymousSharedNode(String {})", iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(535);return true;
                            } }else {{
                                __CLR4_5_2e3e3lvicnc5d.R.inc(536);LOGGER.trace(
                                        "NOT isAnonymousSharedNode(String {})",
                                        iri);
                                __CLR4_5_2e3e3lvicnc5d.R.inc(537);return false;
                            }
                        }}finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}
                    }, configuration);
            __CLR4_5_2e3e3lvicnc5d.R.inc(538);consumer.setOntologyFormat(owlFormatFactory.createFormat());
            __CLR4_5_2e3e3lvicnc5d.R.inc(539);String baseUri = "urn:default:baseUri:";
            // Override the default baseUri for non-anonymous ontologies
            __CLR4_5_2e3e3lvicnc5d.R.inc(540);if ((((!ontology.getOntologyID().isAnonymous()
                    && ontology.getOntologyID().getDefaultDocumentIRI()
                            .isPresent())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(541)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(542)==0&false))) {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(543);baseUri = ontology.getOntologyID().getDefaultDocumentIRI()
                        .get().toString();
            }
            }__CLR4_5_2e3e3lvicnc5d.R.inc(544);RioParserRDFHandler handler = new RioParserRDFHandler(consumer);
            __CLR4_5_2e3e3lvicnc5d.R.inc(545);if ((((documentSource instanceof RioMemoryTripleSource)&&(__CLR4_5_2e3e3lvicnc5d.R.iget(546)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(547)==0&false))) {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(548);RioMemoryTripleSource tripleSource = (RioMemoryTripleSource) documentSource;
                __CLR4_5_2e3e3lvicnc5d.R.inc(549);Map<String, String> namespaces = tripleSource.getNamespaces();
                __CLR4_5_2e3e3lvicnc5d.R.inc(550);Iterator<Statement> statementsIterator = tripleSource
                        .getStatementIterator();
                __CLR4_5_2e3e3lvicnc5d.R.inc(551);handler.startRDF();
                __CLR4_5_2e3e3lvicnc5d.R.inc(552);for (Entry<String, String> nextNamespace : namespaces
                        .entrySet()) {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(553);handler.handleNamespace(nextNamespace.getKey(),
                            nextNamespace.getValue());
                }
                }__CLR4_5_2e3e3lvicnc5d.R.inc(554);while ((((statementsIterator.hasNext())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(555)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(556)==0&false))) {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(557);handler.handleStatement(statementsIterator.next());
                }
                }__CLR4_5_2e3e3lvicnc5d.R.inc(558);handler.endRDF();
            } }else {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(559);parseDocumentSource(documentSource, baseUri, handler);
            }
            }__CLR4_5_2e3e3lvicnc5d.R.inc(560);return consumer.getOntologyFormat();
        } catch (final RDFParseException e) {
            __CLR4_5_2e3e3lvicnc5d.R.inc(561);throw new OWLParserException(e);
        } catch (final RDFHandlerException e) {
            // See sourceforge bug 3566820 for more information about this
            // branch
            __CLR4_5_2e3e3lvicnc5d.R.inc(562);if ((((e.getCause() != null
                    && e.getCause().getCause() != null
                    && e.getCause().getCause() instanceof UnloadableImportException)&&(__CLR4_5_2e3e3lvicnc5d.R.iget(563)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(564)==0&false))) {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(565);throw (UnloadableImportException) e.getCause().getCause();
            } }else {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(566);throw new OWLParserException(e);
            }
        }} catch (final UnsupportedRDFormatException e) {
            __CLR4_5_2e3e3lvicnc5d.R.inc(567);throw new OWLParserException(e);
        } catch (final MalformedURLException e) {
            __CLR4_5_2e3e3lvicnc5d.R.inc(568);throw new OWLParserException(e);
        }
    }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

    /**
     * Parse the given document source and return a {@link StatementCollector}
     * containing the RDF statements found in the source.
     * 
     * @param documentSource
     *        An {@link OWLOntologyDocumentSource} containing RDF statements.
     * @param baseUri
     *        The base URI to use when parsing the document source.
     * @param handler
     *        rdf handler
     * @throws UnsupportedRDFormatException
     *         If the document contains a format which is currently unsupported,
     *         based on the parsers that are currently available.
     * @throws IOException
     *         If there is an input/output exception while accessing the
     *         document source.
     * @throws RDFParseException
     *         If there is an error while parsing the document source.
     * @throws RDFHandlerException
     *         If there is an error related to the processing of the RDF
     *         statements after parsing.
     * @throws MalformedURLException
     *         If there are malformed URLs.
     */
    protected void parseDocumentSource(
            final OWLOntologyDocumentSource documentSource,
            final String baseUri, final RDFHandler handler) throws IOException,
            RDFParseException, RDFHandlerException {try{__CLR4_5_2e3e3lvicnc5d.R.inc(569);
        __CLR4_5_2e3e3lvicnc5d.R.inc(570);final RDFParser createParser = Rio.createParser(owlFormatFactory
                .getRioFormat());
        __CLR4_5_2e3e3lvicnc5d.R.inc(571);createParser.getParserConfig().addNonFatalError(
                BasicParserSettings.VERIFY_DATATYPE_VALUES);
        __CLR4_5_2e3e3lvicnc5d.R.inc(572);createParser.getParserConfig().addNonFatalError(
                BasicParserSettings.VERIFY_LANGUAGE_TAGS);
        __CLR4_5_2e3e3lvicnc5d.R.inc(573);createParser.setRDFHandler(handler);
        __CLR4_5_2e3e3lvicnc5d.R.inc(574);long rioParseStart = System.currentTimeMillis();
        __CLR4_5_2e3e3lvicnc5d.R.inc(575);if ((((owlFormatFactory.isTextual() && documentSource.isReaderAvailable())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(576)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(577)==0&false))) {{
            __CLR4_5_2e3e3lvicnc5d.R.inc(578);createParser.parse(documentSource.getReader(), baseUri);
        } }else {__CLR4_5_2e3e3lvicnc5d.R.inc(579);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(580)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(581)==0&false))) {{
            __CLR4_5_2e3e3lvicnc5d.R.inc(582);createParser.parse(documentSource.getInputStream(), baseUri);
        } }else {{
            __CLR4_5_2e3e3lvicnc5d.R.inc(583);URL url = URI.create(documentSource.getDocumentIRI().toString())
                    .toURL();
            __CLR4_5_2e3e3lvicnc5d.R.inc(584);URLConnection conn = url.openConnection();
            __CLR4_5_2e3e3lvicnc5d.R.inc(585);createParser.parse(conn.getInputStream(), baseUri);
        }
        }}__CLR4_5_2e3e3lvicnc5d.R.inc(586);if ((((LOGGER.isDebugEnabled())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(587)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(588)==0&false))) {{
            __CLR4_5_2e3e3lvicnc5d.R.inc(589);LOGGER.debug("rioParse: timing={}", System.currentTimeMillis()
                    - rioParseStart);
        }
    }}finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e3e3lvicnc5d.R.inc(590);
        __CLR4_5_2e3e3lvicnc5d.R.inc(591);return getClass().getName() + " : " + owlFormatFactory;
    }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

    private static class RioParserRDFHandler implements RDFHandler {

        private static final Logger LOG = LoggerFactory
                .getLogger(RioParserRDFHandler.class);
        private final RDFHandler consumer;
        private long owlParseStart;
        private final Set<Resource> typedLists = new HashSet<>();
        private final ValueFactory vf = ValueFactoryImpl.getInstance();

        RioParserRDFHandler(RDFHandler consumer) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(592);
            __CLR4_5_2e3e3lvicnc5d.R.inc(593);this.consumer = consumer;
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

        @Override
        public void startRDF() {try{__CLR4_5_2e3e3lvicnc5d.R.inc(594);
            __CLR4_5_2e3e3lvicnc5d.R.inc(595);owlParseStart = System.currentTimeMillis();
            __CLR4_5_2e3e3lvicnc5d.R.inc(596);try {
                __CLR4_5_2e3e3lvicnc5d.R.inc(597);consumer.startRDF();
            } catch (RDFHandlerException e) {
                __CLR4_5_2e3e3lvicnc5d.R.inc(598);throw new OWLParserException(e);
            }
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

        @Override
        public void endRDF() {try{__CLR4_5_2e3e3lvicnc5d.R.inc(599);
            __CLR4_5_2e3e3lvicnc5d.R.inc(600);try {
                __CLR4_5_2e3e3lvicnc5d.R.inc(601);consumer.endRDF();
                __CLR4_5_2e3e3lvicnc5d.R.inc(602);if ((((LOG.isDebugEnabled())&&(__CLR4_5_2e3e3lvicnc5d.R.iget(603)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(604)==0&false))) {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(605);LOG.debug("owlParse: timing={}", System.currentTimeMillis()
                            - owlParseStart);
                }
            }} catch (RDFHandlerException e) {
                __CLR4_5_2e3e3lvicnc5d.R.inc(606);throw new OWLParserException(e);
            }
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

        @Override
        public void handleNamespace(String prefix, String uri) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(607);
            __CLR4_5_2e3e3lvicnc5d.R.inc(608);try {
                __CLR4_5_2e3e3lvicnc5d.R.inc(609);consumer.handleNamespace(prefix, uri);
            } catch (RDFHandlerException e) {
                __CLR4_5_2e3e3lvicnc5d.R.inc(610);throw new OWLParserException(e);
            }
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

        @Override
        public void handleStatement(Statement nextStatement) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(611);
            __CLR4_5_2e3e3lvicnc5d.R.inc(612);if ((((nextStatement.getPredicate().equals(RDF.FIRST)
                    || nextStatement.getPredicate().equals(RDF.REST))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(613)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(614)==0&false))) {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(615);if ((((!typedLists.contains(nextStatement.getSubject()))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(616)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(617)==0&false))) {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(618);typedLists.add(nextStatement.getSubject());
                    __CLR4_5_2e3e3lvicnc5d.R.inc(619);try {
                        __CLR4_5_2e3e3lvicnc5d.R.inc(620);consumer.handleStatement(vf.createStatement(
                                nextStatement.getSubject(), RDF.TYPE, RDF.LIST));
                    } catch (RDFHandlerException e) {
                        __CLR4_5_2e3e3lvicnc5d.R.inc(621);throw new OWLParserException(e);
                    }
                    __CLR4_5_2e3e3lvicnc5d.R.inc(622);LOG.debug("Implicitly typing list={}", nextStatement);
                }
            }} }else {__CLR4_5_2e3e3lvicnc5d.R.inc(623);if ((((nextStatement.getPredicate().equals(RDF.TYPE)
                    && nextStatement.getObject().equals(RDF.LIST))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(624)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(625)==0&false))) {{
                __CLR4_5_2e3e3lvicnc5d.R.inc(626);if ((((!typedLists.contains(nextStatement.getSubject()))&&(__CLR4_5_2e3e3lvicnc5d.R.iget(627)!=0|true))||(__CLR4_5_2e3e3lvicnc5d.R.iget(628)==0&false))) {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(629);LOG.debug("Explicit list type found={}", nextStatement);
                    __CLR4_5_2e3e3lvicnc5d.R.inc(630);typedLists.add(nextStatement.getSubject());
                } }else {{
                    __CLR4_5_2e3e3lvicnc5d.R.inc(631);LOG.debug(
                            "duplicate rdf:type rdf:List statements found={}",
                            nextStatement);
                }
            }}
            }}__CLR4_5_2e3e3lvicnc5d.R.inc(632);try {
                __CLR4_5_2e3e3lvicnc5d.R.inc(633);consumer.handleStatement(nextStatement);
            } catch (RDFHandlerException e) {
                __CLR4_5_2e3e3lvicnc5d.R.inc(634);throw new OWLParserException(e);
            }
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}

        @Override
        public void handleComment(String comment) {try{__CLR4_5_2e3e3lvicnc5d.R.inc(635);
            // do nothing
        }finally{__CLR4_5_2e3e3lvicnc5d.R.flushNeeded();}}
    }
}
