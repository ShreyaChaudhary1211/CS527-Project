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
package org.semanticweb.owlapi.rdf.rdfxml.parser;

import static org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy.INCLUDE_GRAPH;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.formats.AbstractRDFPrefixDocumentFormat;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.SKOSVocabulary;
import org.semanticweb.owlapi.vocab.SWRLVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class TripleHandlers {public static class __CLR4_5_2q5cq5clvicmd34{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,35660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final Logger LOGGER = LoggerFactory.getLogger(TripleHandlers.class);

    private TripleHandlers() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33888);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

    static class HandlerAccessor {

        /** Handlers for built in types */
        @Nonnull private final Map<IRI, BuiltInTypeHandler> builtInTypes;
        /**
         * Handler for triples that denote nodes which represent axioms. i.e.
         * owl:AllDisjointClasses owl:AllDisjointProperties owl:AllDifferent
         * owl:NegativePropertyAssertion owl:Axiom These need to be handled
         * separately from other types, because the base triples for annotated
         * axioms should be in the ontology before annotations on the annotated
         * versions of these axioms are parsed.
         */
        @Nonnull protected final Map<IRI, BuiltInTypeHandler> axiomTypes;
        /** Handlers for build in predicates */
        @Nonnull protected final Map<IRI, TriplePredicateHandler> predicates;
        /**
         * Handlers for general literal triples (i.e. triples which have
         * predicates that are not part of the built in OWL/RDFS/RDF vocabulary.
         * Such triples either constitute annotationIRIs of relationships
         * between an individual and a data literal (typed or untyped)
         */
        protected final List<LiteralTripleHandler> literals;
        /**
         * Handlers for general resource triples (i.e. triples which have
         * predicates that are not part of the built in OWL/RDFS/RDF vocabulary.
         * Such triples either constitute annotationIRIs or relationships
         * between an individual and another individual.
         */
        protected final List<ResourceTripleHandler> resources;
        /** The inverse of handler. */
        @Nonnull protected final TPInverseOfHandler inverseOf;
        /** The non built in type handler. */
        @Nonnull private final TPTypeHandler nonBuiltInTypes;
        @Nonnull protected final OWLRDFConsumer consumer;

        HandlerAccessor(@Nonnull OWLRDFConsumer r) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33889);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33890);consumer = r;
            __CLR4_5_2q5cq5clvicmd34.R.inc(33891);builtInTypes = getBasicTypeHandlers(r, r.getConfiguration());
            __CLR4_5_2q5cq5clvicmd34.R.inc(33892);axiomTypes = getAxiomTypeHandlers(r);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33893);inverseOf = new TPInverseOfHandler(r);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33894);nonBuiltInTypes = new TPTypeHandler(r);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33895);predicates = getPredicateHandlers(r);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33896);literals = getLiteralTripleHandlers(r);
            // General resource/object triples - i.e. triples which have a
            // predicate
            // that is not a built in IRI. Annotation properties get precedence
            // over object properties, so that if we have the statement
            // a:A a:foo a:B and a:foo
            // is typed as both an annotation and data property then the
            // statement will be translated as an annotation on a:A
            __CLR4_5_2q5cq5clvicmd34.R.inc(33897);resources = getResourceTripleHandlers(r);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        void apply(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33898);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33899);if ((((OWLRDFConsumer.isGeneralPredicate(predicate))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33900)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33901)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33902);for (LiteralTripleHandler lhandler : literals) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33903);if ((((lhandler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33904)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33905)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33906);lhandler.handleTriple(subject, predicate, object);
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33907);return;
                    }
                }}
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        void apply(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33908);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33909);if ((((OWLRDFConsumer.isGeneralPredicate(predicate))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33910)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33911)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33912);for (ResourceTripleHandler handler : resources) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33913);if ((((handler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33914)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33915)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33916);handler.handleTriple(subject, predicate, object);
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33917);return;
                    }
                }}
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        void applyAnnotations(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33918);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33919);BuiltInTypeHandler builtInTypeHandler = axiomTypes.get(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33920);if ((((builtInTypeHandler != null && builtInTypeHandler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33921)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33922)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33923);builtInTypeHandler.handleTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        public void consumeNonReservedPredicateTriples() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33924);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33925);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33926);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33927);apply(subject, predicate, object);
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            __CLR4_5_2q5cq5clvicmd34.R.inc(33928);consumer.iterateLiteralTriples(new LiteralTripleIterator() {

                @Override
                public void handleLiteralTriple(IRI subject, @Nonnull IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33929);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33930);apply(subject, predicate, object);
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        public void consumeAnnotatedAxioms() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33931);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33932);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33933);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33934);applyAnnotations(subject, predicate, object);
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Called when a resource triple has been parsed.
         * 
         * @param subject
         *        The subject of the triple that has been parsed
         * @param predicate
         *        The predicate of the triple that has been parsed
         * @param object
         *        The object of the triple that has been parsed
         */
        public void handleStreaming(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33935);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33936);boolean consumed = false;
            __CLR4_5_2q5cq5clvicmd34.R.inc(33937);if ((((predicate.equals(RDF_TYPE.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33938)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33939)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33940);BuiltInTypeHandler handler = builtInTypes.get(object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(33941);if ((((handler != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33942)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33943)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33944);if ((((handler.canHandleStreaming(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33945)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33946)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33947);handler.handleTriple(subject, predicate, object);
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33948);consumed = true;
                    }
                }} }else {__CLR4_5_2q5cq5clvicmd34.R.inc(33949);if ((((axiomTypes.get(object) == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33950)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33951)==0&false))) {{
                    // Not a built in type
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33952);consumer.addOWLNamedIndividual(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33953);if ((((nonBuiltInTypes.canHandleStreaming(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33954)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33955)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33956);nonBuiltInTypes.handleTriple(subject, predicate, object);
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33957);consumed = true;
                    }
                }} }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33958);consumer.addAxiom(subject);
                }
            }}} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33959);ResourceTripleHandler handler = predicates.get(predicate);
                __CLR4_5_2q5cq5clvicmd34.R.inc(33960);if ((((handler != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33961)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33962)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33963);if ((((handler.canHandleStreaming(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33964)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33965)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33966);handler.handleTriple(subject, predicate, object);
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33967);consumed = true;
                    }
                }} }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33968);for (ResourceTripleHandler resHandler : resources) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(33969);if ((((resHandler.canHandleStreaming(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33970)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33971)==0&false))) {{
                            __CLR4_5_2q5cq5clvicmd34.R.inc(33972);resHandler.handleTriple(subject, predicate, object);
                            __CLR4_5_2q5cq5clvicmd34.R.inc(33973);consumed = true;
                            __CLR4_5_2q5cq5clvicmd34.R.inc(33974);break;
                        }
                    }}
                }}
            }}
            }__CLR4_5_2q5cq5clvicmd34.R.inc(33975);if ((((!consumed)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33976)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33977)==0&false))) {{
                // Not consumed, so add the triple
                __CLR4_5_2q5cq5clvicmd34.R.inc(33978);consumer.addTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        public void handleStreaming(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull String literal, IRI datatype,
            String lang) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33979);
            // Convert all literals to OWLConstants
            __CLR4_5_2q5cq5clvicmd34.R.inc(33980);OWLLiteral con = consumer.getOWLLiteral(literal, datatype, lang);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33981);handleStreaming(subject, predicate, con);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void handleStreaming(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull OWLLiteral con) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33982);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33983);for (LiteralTripleHandler handler : literals) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33984);if ((((handler.canHandleStreaming(subject, predicate, con))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33985)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33986)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33987);handler.handleTriple(subject, predicate, con);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33988);return;
                }
            }}
            }__CLR4_5_2q5cq5clvicmd34.R.inc(33989);consumer.addTriple(subject, predicate, con);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Handles triples in a non-streaming mode. Type triples whose type is
         * an axiom type, are NOT handled.
         * 
         * @param subject
         *        The subject of the triple
         * @param predicate
         *        The predicate of the triple
         * @param object
         *        The object of the triple
         */
        protected void handle(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(33990);
            __CLR4_5_2q5cq5clvicmd34.R.inc(33991);if ((((predicate.equals(OWLRDFVocabulary.RDF_TYPE.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33992)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33993)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(33994);BuiltInTypeHandler typeHandler = builtInTypes.get(object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(33995);if ((((typeHandler != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(33996)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(33997)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(33998);typeHandler.handleTriple(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(33999);if ((((axiomTypes.get(object) == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34000)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34001)==0&false))) {{
                    // C(a)
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34002);OWLIndividual ind = consumer.translateIndividual(subject);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34003);OWLClassExpression ce = consumer.translatorAccessor.translateClassExpression(object);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34004);consumer.addAxiom(consumer.getDataFactory().getOWLClassAssertionAxiom(ce, ind, consumer
                        .getPendingAnnotations()));
                }
            }}} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34005);TriplePredicateHandler handler = predicates.get(predicate);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34006);if ((((handler != null && handler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34007)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34008)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34009);handler.handleTriple(subject, predicate, object);
                } }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34010);for (ResourceTripleHandler resHandler : resources) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(34011);if ((((resHandler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34012)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34013)==0&false))) {{
                            __CLR4_5_2q5cq5clvicmd34.R.inc(34014);resHandler.handleTriple(subject, predicate, object);
                            __CLR4_5_2q5cq5clvicmd34.R.inc(34015);break;
                        }
                    }}
                }}
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Handle.
         * 
         * @param subject
         *        the subject
         * @param predicate
         *        the predicate
         * @param object
         *        the object
         */
        protected void handle(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34016);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34017);for (LiteralTripleHandler handler : literals) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34018);if ((((handler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34019)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34020)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34021);handler.handleTriple(subject, predicate, object);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34022);break;
                }
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * We need to mop up all remaining triples. These triples will be in the
         * triples by subject map. Other triples which reside in the triples by
         * predicate (single valued) triple aren't "root" triples for axioms.
         * First we translate all system triples and then go for triples whose
         * predicates are not system/reserved vocabulary IRIs to translate these
         * into ABox assertions or annotationIRIs
         * 
         * @return any remaining triples
         */
        @Nonnull
        public Set<RDFTriple> mopUp() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34023);
            // We need to mop up all remaining triples. These triples will be in
            // the triples by subject map. Other triples which reside in the
            // triples by predicate (single valued) triple aren't "root" triples
            // for axioms. First we translate all system triples, starting with
            // property ranges, then go for triples whose predicates are not
            // system/reserved vocabulary IRIs to translate these into ABox
            // assertions or annotationIRIs
            __CLR4_5_2q5cq5clvicmd34.R.inc(34024);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34025);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34026);TriplePredicateHandler propertyRangeHandler = predicates.get(RDFS_RANGE.getIRI());
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34027);if ((((propertyRangeHandler.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34028)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34029)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(34030);propertyRangeHandler.handleTriple(subject, predicate, object);
                    }
                }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            // Now handle non-reserved predicate triples
            __CLR4_5_2q5cq5clvicmd34.R.inc(34031);consumeNonReservedPredicateTriples();
            // Now axiom annotations
            __CLR4_5_2q5cq5clvicmd34.R.inc(34032);consumeAnnotatedAxioms();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34033);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(@Nonnull IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34034);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34035);handle(subject, predicate, object);
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            __CLR4_5_2q5cq5clvicmd34.R.inc(34036);consumer.iterateLiteralTriples(new LiteralTripleIterator() {

                @Override
                public void handleLiteralTriple(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34037);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34038);handle(subject, predicate, object);
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            // Inverse property axioms
            __CLR4_5_2q5cq5clvicmd34.R.inc(34039);inverseOf.setAxiomParsingMode(true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34040);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34041);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34042);if ((((inverseOf.canHandle(subject, predicate, object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34043)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34044)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(34045);inverseOf.handleTriple(subject, predicate, object);
                    }
                }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            __CLR4_5_2q5cq5clvicmd34.R.inc(34046);return getRemainingTriples();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        private Set<RDFTriple> getRemainingTriples() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34047);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34048);final Set<RDFTriple> remainingTriples = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34049);consumer.iterateResourceTriples(new ResourceTripleIterator() {

                @Override
                public void handleResourceTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34050);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34051);remainingTriples.add(new RDFTriple(subject, consumer.isAnonymousNode(subject), predicate, object,
                        consumer.isAnonymousNode(object)));
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            __CLR4_5_2q5cq5clvicmd34.R.inc(34052);consumer.iterateLiteralTriples(new LiteralTripleIterator() {

                @Override
                public void handleLiteralTriple(@Nonnull IRI subject, @Nonnull IRI predicate,
                    @Nonnull OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34053);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34054);remainingTriples.add(new RDFTriple(subject, consumer.isAnonymousNode(subject), predicate, object));
                }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
            });
            __CLR4_5_2q5cq5clvicmd34.R.inc(34055);return remainingTriples;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        private static List<ResourceTripleHandler> getResourceTripleHandlers(@Nonnull OWLRDFConsumer r) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34056);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34057);return CollectionFactory.list((ResourceTripleHandler) new GTPObjectPropertyAssertionHandler(r),
                new GTPAnnotationResourceTripleHandler(r));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected Map<IRI, TriplePredicateHandler> getPredicateHandlers(@Nonnull OWLRDFConsumer r) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34058);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34059);Map<IRI, TriplePredicateHandler> predicateHandlers = new ConcurrentHashMap<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34060);add(predicateHandlers, new TPDifferentFromHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34061);add(predicateHandlers, new TPDisjointUnionHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34062);add(predicateHandlers, new TPDisjointWithHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34063);add(predicateHandlers, new TPEquivalentClassHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34064);add(predicateHandlers, new TPEquivalentPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34065);add(predicateHandlers, new TPPropertyDomainHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34066);add(predicateHandlers, new TPPropertyRangeHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34067);add(predicateHandlers, new TPSameAsHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34068);add(predicateHandlers, new TPSubClassOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34069);add(predicateHandlers, new TPSubPropertyOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34070);add(predicateHandlers, nonBuiltInTypes);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34071);add(predicateHandlers, new TPDistinctMembersHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34072);add(predicateHandlers, new TPImportsHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34073);add(predicateHandlers, new TPIntersectionOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34074);add(predicateHandlers, new TPUnionOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34075);add(predicateHandlers, new TPComplementOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34076);add(predicateHandlers, new TPOneOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34077);add(predicateHandlers, new TPSomeValuesFromHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34078);add(predicateHandlers, new TPAllValuesFromHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34079);add(predicateHandlers, new TPRestHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34080);add(predicateHandlers, new TPFirstResourceHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34081);add(predicateHandlers, new TPDeclaredAsHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34082);add(predicateHandlers, new TPHasKeyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34083);add(predicateHandlers, new TPVersionIRIHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34084);add(predicateHandlers, new TPPropertyChainAxiomHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34085);add(predicateHandlers, new TPAnnotatedSourceHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34086);add(predicateHandlers, new TPAnnotatedPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34087);add(predicateHandlers, new TPAnnotatedTargetHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34088);add(predicateHandlers, new TPPropertyDisjointWithHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34089);add(predicateHandlers, inverseOf);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34090);add(predicateHandlers, new TPOnPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34091);add(predicateHandlers, new TPOnClassHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34092);add(predicateHandlers, new TPOnDataRangeHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34093);add(predicateHandlers, new TPComplementOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34094);add(predicateHandlers, new TPDatatypeComplementOfHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34095);return predicateHandlers;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        public static Map<IRI, BuiltInTypeHandler> getAxiomTypeHandlers(@Nonnull OWLRDFConsumer r) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34096);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34097);Map<IRI, BuiltInTypeHandler> map = new ConcurrentHashMap<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34098);add(map, new TypeAxiomHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34099);add(map, new TypeAllDifferentHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34100);add(map, new TypeAllDisjointClassesHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34101);add(map, new TypeAllDisjointPropertiesHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34102);add(map, new TypeNegativePropertyAssertionHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34103);return map;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * General literal triples - i.e. triples which have a predicate that is
         * not a built in IRI. Annotation properties get precedence over data
         * properties, so that if we have the statement<br>
         * a:A a:foo a:B<br>
         * and a:foo is typed as both an annotation and data property then the
         * statement will be translated as an annotation on a:A
         * 
         * @param r
         *        consumer
         * @return handlers
         */
        @Nonnull
        public static List<LiteralTripleHandler> getLiteralTripleHandlers(@Nonnull OWLRDFConsumer r) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34104);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34105);return CollectionFactory.list((LiteralTripleHandler) new GTPDataPropertyAssertionHandler(r),
                new TPFirstLiteralHandler(r), new GTPAnnotationLiteralHandler(r));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private static void add(@Nonnull Map<IRI, BuiltInTypeHandler> m, @Nonnull BuiltInTypeHandler h) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34106);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34107);m.put(h.getTypeIRI(), h);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private static void add(@Nonnull Map<IRI, TriplePredicateHandler> map, @Nonnull TriplePredicateHandler h) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34108);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34109);map.put(h.getPredicateIRI(), h);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        public static Map<IRI, BuiltInTypeHandler> getBasicTypeHandlers(@Nonnull OWLRDFConsumer r,
            @Nonnull OWLOntologyLoaderConfiguration config) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34110);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34111);Map<IRI, BuiltInTypeHandler> map = new ConcurrentHashMap<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34112);add(map, new TypeOntologyPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34113);add(map, new TypeAsymmetricPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34114);add(map, new TypeClassHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34115);add(map, new TypeObjectPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34116);add(map, new TypeDataPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34117);add(map, new TypeDatatypeHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34118);add(map, new TypeFunctionalPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34119);add(map, new TypeInverseFunctionalPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34120);add(map, new TypeIrreflexivePropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34121);add(map, new TypeReflexivePropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34122);add(map, new TypeSymmetricPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34123);add(map, new TypeTransitivePropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34124);add(map, new TypeRestrictionHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34125);add(map, new TypeListHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34126);add(map, new TypeAnnotationPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34127);add(map, new TypeDeprecatedClassHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34128);add(map, new TypeDeprecatedPropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34129);add(map, new TypeDataRangeHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34130);add(map, new TypeOntologyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34131);add(map, new TypeNegativeDataPropertyAssertionHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34132);add(map, new TypeRDFSClassHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34133);add(map, new TypeSelfRestrictionHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34134);add(map, new TypePropertyHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34135);add(map, new TypeNamedIndividualHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34136);add(map, new TypeAnnotationHandler(r));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34137);if ((((!config.isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34138)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34139)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34140);add(map, new TypeSWRLAtomListHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34141);add(map, new TypeSWRLBuiltInAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34142);add(map, new TypeSWRLBuiltInHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34143);add(map, new TypeSWRLClassAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34144);add(map, new TypeSWRLDataRangeAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34145);add(map, new TypeSWRLDataValuedPropertyAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34146);add(map, new TypeSWRLDifferentIndividualsAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34147);add(map, new TypeSWRLImpHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34148);add(map, new TypeSWRLIndividualPropertyAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34149);add(map, new TypeSWRLSameIndividualAtomHandler(r));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34150);add(map, new TypeSWRLVariableHandler(r));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34151);return map;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    /**
     * A base handler for equivalent class axioms where the axiom is stated in a
     * direct way without an equivalent class triple. For example A
     * intersectionOf (C or C)
     */
    abstract static class AbstractNamedEquivalentClassAxiomHandler extends AbstractTriplePredicateHandler {

        AbstractNamedEquivalentClassAxiomHandler(@Nonnull OWLRDFConsumer consumer, IRI predicateIRI) {
            super(consumer, predicateIRI);__CLR4_5_2q5cq5clvicmd34.R.inc(34153);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34152);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34154);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34155);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34156);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34157);return super.canHandle(subject, predicate, object) && !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34158);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34159);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34160);Set<OWLClassExpression> operands = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34161);operands.add(translateClassExpression(subject));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34162);operands.add(translateEquivalentClass(object));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34163);addAxiom(df.getOWLEquivalentClassesAxiom(operands));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected abstract OWLClassExpression translateEquivalentClass(@Nonnull IRI mainNode);
    }

    abstract static class AbstractResourceTripleHandler extends AbstractTripleHandler implements ResourceTripleHandler {

        protected AbstractResourceTripleHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34165);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34164);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isSubjectOrObjectAnonymous(@Nonnull IRI subject, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34166);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34167);return isAnonymous(subject) || isAnonymous(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isSubjectAndObjectMatchingClassExpressionOrMatchingDataRange(IRI subject, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34168);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34169);return isSubjectAndObjectClassExpression(subject, object) || isSubjectAndObjectDataRange(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isSubjectAndObjectDataRange(IRI subject, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34170);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34171);return consumer.isDataRange(subject) && consumer.isDataRange(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isSubjectAndObjectClassExpression(IRI subject, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34172);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34173);return consumer.isClassExpression(subject) && consumer.isClassExpression(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * @param subject
         *        subject
         * @param object
         *        object
         */
        protected void inferTypes(IRI subject, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34174);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34175);if ((((consumer.isClassExpression(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34176)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34177)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34178);consumer.addClassExpression(subject, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34179);if ((((consumer.isDataRange(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34180)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34181)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34182);consumer.addDataRange(subject, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34183);if ((((consumer.isClassExpression(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34184)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34185)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34186);consumer.addClassExpression(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34187);if ((((consumer.isDataRange(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34188)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34189)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34190);consumer.addDataRange(object, false);
            }
        }}}}}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class AbstractTripleHandler {

        @Nonnull protected final OWLRDFConsumer consumer;
        @Nonnull private final ClassExpressionMatcher classExpressionMatcher = new ClassExpressionMatcher();
        @Nonnull private final DataRangeMatcher dataRangeMatcher = new DataRangeMatcher();
        @Nonnull private final IndividualMatcher individualMatcher = new IndividualMatcher();
        protected final OWLDataFactory df;

        protected AbstractTripleHandler(@Nonnull OWLRDFConsumer consumer) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34191);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34192);this.consumer = consumer;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34193);df = consumer.getDataFactory();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLAnnotation> getPendingAnnotations() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34194);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34195);return consumer.getPendingAnnotations();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected void consumeTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34196);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34197);consumer.consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected void consumeTriple(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34198);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34199);consumer.consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isStrict() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34200);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34201);return consumer.getConfiguration().isStrict();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isObjectPropertyOnly(IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34202);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34203);return consumer.isObjectPropertyOnly(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataPropertyOnly(IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34204);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34205);return consumer.isDataPropertyOnly(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isAnnotationPropertyOnly(IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34206);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34207);return consumer.isAnnotationPropertyOnly(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isAnnotationPropertyStrict(IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34208);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34209);return consumer.isAnnotationPropertyOnly(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isAnnotationPropertyLax(IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34210);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34211);return consumer.isAnnotationProperty(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected void addAxiom(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34212);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34213);consumer.addAxiom(axiom);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected OWLClassExpression translateClassExpression(@Nonnull IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34214);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34215);return consumer.translatorAccessor.translateClassExpression(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected OWLObjectPropertyExpression translateObjectProperty(@Nonnull IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34216);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34217);return consumer.translateObjectPropertyExpression(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected OWLDataPropertyExpression translateDataProperty(@Nonnull IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34218);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34219);return consumer.translateDataPropertyExpression(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected OWLDataRange translateDataRange(@Nonnull IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34220);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34221);return consumer.translateDataRange(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        protected OWLIndividual translateIndividual(@Nonnull IRI iri) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34222);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34223);return consumer.translateIndividual(iri);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isAnonymous(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34224);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34225);return consumer.isAnonymousNode(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isResourcePresent(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34226);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34227);return consumer.getResourceObject(mainNode, predicate, false) != null;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isLiteralPresent(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34228);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34229);return consumer.getLiteralObject(mainNode, predicate, false) != null;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isRestrictionStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34230);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34231);return consumer.isRestriction(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isRestrictionLax(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34232);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34233);return consumer.isRestriction(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isNonNegativeIntegerStrict(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34234);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34235);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34236);if ((((literal == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34237)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34238)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34239);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34240);OWLDatatype datatype = literal.getDatatype();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34241);OWL2Datatype nni = OWL2Datatype.XSD_NON_NEGATIVE_INTEGER;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34242);return datatype.getIRI().equals(nni.getIRI()) && nni.isInLexicalSpace(literal.getLiteral());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isNonNegativeIntegerLax(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34243);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34244);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34245);if ((((literal == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34246)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34247)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34248);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34249);return OWL2Datatype.XSD_INTEGER.isInLexicalSpace(verifyNotNull(literal.getLiteral().trim()));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected int translateInteger(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34250);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34251);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate, true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34252);if ((((literal == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34253)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34254)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34255);return 0;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34256);try {
                __CLR4_5_2q5cq5clvicmd34.R.inc(34257);return Integer.parseInt(literal.getLiteral().trim());
            } catch (NumberFormatException e) {
                __CLR4_5_2q5cq5clvicmd34.R.inc(34258);return 0;
            }
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isClassExpressionStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34259);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34260);return consumer.isClassExpression(node) && !consumer.isDataRange(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isClassExpressionStrict(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34261);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34262);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34263);return object != null && isClassExpressionStrict(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isClassExpressionLax(@Nonnull IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34264);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34265);return consumer.isClassExpression(mainNode) || consumer.isParsedAllTriples() && !consumer.isDataRange(
                mainNode);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isClassExpressionLax(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34266);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34267);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34268);return object != null && isClassExpressionLax(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isObjectPropertyStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34269);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34270);return consumer.isObjectPropertyOnly(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isObjectPropertyStrict(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34271);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34272);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34273);return object != null && isObjectPropertyStrict(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isObjectPropertyLax(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34274);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34275);return consumer.isObjectProperty(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isObjectPropertyLax(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34276);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34277);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34278);return object != null && isObjectPropertyLax(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataPropertyStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34279);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34280);return consumer.isDataPropertyOnly(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataPropertyStrict(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34281);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34282);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34283);return object != null && isDataPropertyStrict(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataPropertyLax(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34284);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34285);return consumer.isDataProperty(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataPropertyLax(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34286);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34287);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34288);return object != null && isDataPropertyLax(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataRangeStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34289);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34290);return consumer.isDataRange(node) && !consumer.isClassExpression(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataRangeStrict(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34291);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34292);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            assert (((object != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34293)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34294)==0&false));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34295);return isDataRangeStrict(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataRangeLax(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34296);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34297);return consumer.isDataRange(node);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataRangeLax(@Nonnull IRI mainNode, @Nonnull OWLRDFVocabulary predicate) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34298);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34299);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34300);return object != null && isDataRangeLax(mainNode);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isClassExpressionListStrict(@Nonnull IRI mainNode, int minSize) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34301);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34302);return isResourceListStrict(mainNode, classExpressionMatcher, minSize);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isDataRangeListStrict(@Nonnull IRI mainNode, int minSize) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34303);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34304);return isResourceListStrict(mainNode, dataRangeMatcher, minSize);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isIndividualListStrict(@Nonnull IRI mainNode, int minSize) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34305);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34306);return isResourceListStrict(mainNode, individualMatcher, minSize);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected boolean isResourceListStrict(@Nullable IRI mainNode, @Nonnull TypeMatcher typeMatcher, int minSize) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34307);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34308);if ((((mainNode == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34309)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34310)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34311);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34312);IRI currentListNode = mainNode;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34313);Set<IRI> visitedListNodes = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34314);int size = 0;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34315);while (true) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34316);IRI firstObject = consumer.getResourceObject(currentListNode, RDF_FIRST, false);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34317);if ((((firstObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34318)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34319)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34320);return false;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34321);if ((((!typeMatcher.isTypeStrict(firstObject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34322)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34323)==0&false))) {{
                    // Something in the list that is not of the required type
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34324);return false;
                } }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34325);size++;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34326);IRI restObject = consumer.getResourceObject(currentListNode, RDF_REST, false);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34327);if ((((visitedListNodes.contains(restObject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34328)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34329)==0&false))) {{
                    // Cycle - Non-terminating
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34330);return false;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34331);if ((((restObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34332)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34333)==0&false))) {{
                    // Not terminated properly
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34334);return false;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34335);if ((((restObject.equals(RDF_NIL.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34336)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34337)==0&false))) {{
                    // Terminated properly
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34338);return size >= minSize;
                }
                // Carry on
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34339);visitedListNodes.add(restObject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34340);currentListNode = restObject;
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        class ClassExpressionMatcher implements TypeMatcher {

            ClassExpressionMatcher() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34341);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34342);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34343);return isClassExpressionStrict(node);
            }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
        }

        class DataRangeMatcher implements TypeMatcher {

            DataRangeMatcher() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34344);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34345);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34346);return isDataRangeStrict(node);
            }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
        }

        class IndividualMatcher implements TypeMatcher {

            IndividualMatcher() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34347);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(@Nonnull IRI node) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34348);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34349);return true;
            }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
        }
    }

    abstract static class AbstractBuiltInTypeHandler extends AbstractTriplePredicateHandler implements
        BuiltInTypeHandler {

        private final IRI typeIRI;

        protected AbstractBuiltInTypeHandler(@Nonnull OWLRDFConsumer consumer, IRI typeIRI) {
            super(consumer, RDF_TYPE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34351);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34350);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34352);this.typeIRI = typeIRI;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34353);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34354);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34355);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34356);return predicate.equals(RDF_TYPE.getIRI()) && object.equals(typeIRI);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public IRI getTypeIRI() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34357);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34358);return typeIRI;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPAnnotationLiteralHandler extends AbstractTripleHandler implements LiteralTripleHandler {

        GTPAnnotationLiteralHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34360);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34359);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34361);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34362);return !isAnonymous(subject) && !consumer.isAnnotation(subject) && consumer.isAnnotationProperty(predicate);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34363);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34364);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34365)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34366)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34367);return isAnnotationPropertyOnly(predicate);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34368);boolean axiom = consumer.isAxiom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34369);if ((((axiom)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34370)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34371)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34372);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34373);boolean annotation = consumer.isAnnotation(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34374);if ((((annotation)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34375)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34376)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34377);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34378);if ((((consumer.isAnnotationProperty(predicate))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34379)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34380)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34381);return true;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34382);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34383)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34384)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34385);if ((((isClassExpressionLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34386)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34387)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34388);return true;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34389);if ((((isDataRangeLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34390)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34391)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34392);return true;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34393);if ((((isObjectPropertyLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34394)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34395)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34396);return true;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34397);if ((((isDataPropertyLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34398)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34399)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34400);return true;
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34401);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34402);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34403);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34404);OWLAnnotationProperty prop = df.getOWLAnnotationProperty(predicate);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34405);OWLAnnotationSubject annotationSubject;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34406);if ((((isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34407)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34408)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34409);annotationSubject = consumer.getOWLAnonymousIndividual(subject.toString());
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34410);annotationSubject = subject;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34411);if ((((consumer.isOntology(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34412)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34413)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34414);consumer.addOntologyAnnotation(df.getOWLAnnotation(prop, object, getPendingAnnotations()));
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34415);OWLAnnotationAssertionAxiom ax = df.getOWLAnnotationAssertionAxiom(prop, annotationSubject, object,
                    getPendingAnnotations());
                __CLR4_5_2q5cq5clvicmd34.R.inc(34416);addAxiom(ax);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34417);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPAnnotationResourceTripleHandler extends AbstractResourceTripleHandler {

        GTPAnnotationResourceTripleHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34419);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34418);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34420);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34421);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34422)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34423)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34424);return false;
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34425);return !isAnonymous(subject) && !isAnonymous(object) && consumer.isAnnotationProperty(predicate);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34426);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34427);boolean builtInAnnotationProperty = BUILT_IN_ANNOTATION_PROPERTY_IRIS.contains(predicate);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34428);return !consumer.isAxiom(subject) && !consumer.isAnnotation(subject) && (builtInAnnotationProperty
                || !predicate.isReservedVocabulary());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34429);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34430);OWLAnnotationValue value;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34431);if ((((isAnonymous(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34432)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34433)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34434);value = consumer.getOWLAnonymousIndividual(object.toString());
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34435);value = object;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34436);OWLAnnotationProperty prop = df.getOWLAnnotationProperty(predicate);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34437);OWLAnnotation anno = df.getOWLAnnotation(prop, value);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34438);OWLAnnotationSubject annoSubject;
            __CLR4_5_2q5cq5clvicmd34.R.inc(34439);if ((((isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34440)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34441)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34442);annoSubject = consumer.getOWLAnonymousIndividual(subject.toString());
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34443);annoSubject = subject;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34444);if ((((consumer.isOntology(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34445)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34446)==0&false))) {{
                // Assume we annotation our ontology?
                __CLR4_5_2q5cq5clvicmd34.R.inc(34447);consumer.addOntologyAnnotation(anno);
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34448);OWLAxiom decAx = df.getOWLAnnotationAssertionAxiom(annoSubject, anno, getPendingAnnotations());
                __CLR4_5_2q5cq5clvicmd34.R.inc(34449);addAxiom(decAx);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34450);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPDataPropertyAssertionHandler extends AbstractTripleHandler implements LiteralTripleHandler {

        GTPDataPropertyAssertionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34452);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34451);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34453);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34454);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34455)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34456)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34457);return isDataPropertyStrict(predicate);
            } }else {{
                // Handle annotation assertions as annotation assertions only!
                __CLR4_5_2q5cq5clvicmd34.R.inc(34458);return isDataPropertyLax(predicate) && !consumer.isAnnotationProperty(predicate);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34459);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34460);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34461);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34462);addAxiom(df.getOWLDataPropertyAssertionAxiom(translateDataProperty(predicate), translateIndividual(subject),
                object, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34463);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPLiteralTripleHandler extends AbstractTripleHandler implements LiteralTripleHandler {

        GTPLiteralTripleHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34465);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34464);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34466);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34467);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34468)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34469)==0&false))) {{} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34470);if ((((isAnnotationPropertyLax(predicate))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34471)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34472)==0&false))) {{} }else {{}
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34473);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34474);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34475)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34476)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34477);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34478);return isAnnotationPropertyLax(predicate);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34479);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34480);return isAnnotationPropertyStrict(predicate) || isDataPropertyStrict(predicate);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPObjectPropertyAssertionHandler extends AbstractResourceTripleHandler {

        GTPObjectPropertyAssertionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34482);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34481);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34483);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34484);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34485)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34486)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34487);return isObjectPropertyStrict(predicate);
            } }else {{
                // Handle annotation assertions as annotation assertions only!
                __CLR4_5_2q5cq5clvicmd34.R.inc(34488);return isObjectPropertyLax(predicate) && !isAnnotationPropertyOnly(predicate);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34489);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34490);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34491);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34492);if ((((consumer.isObjectProperty(predicate))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34493)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34494)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34495);consumeTriple(subject, predicate, object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34496);addAxiom(df.getOWLObjectPropertyAssertionAxiom(translateObjectProperty(predicate), translateIndividual(
                    subject), translateIndividual(object), getPendingAnnotations()));
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class GTPResourceTripleHandler extends AbstractResourceTripleHandler {

        GTPResourceTripleHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34498);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34497);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34499);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34500);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34501);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34502);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34503);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class SKOSClassTripleHandler extends AbstractBuiltInTypeHandler {

        SKOSClassTripleHandler(@Nonnull OWLRDFConsumer consumer, @Nonnull SKOSVocabulary v) {
            super(consumer, v.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34505);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34504);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34506);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34507);OWLIndividual ind = df.getOWLNamedIndividual(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34508);OWLClass skosConcept = df.getOWLClass(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34509);addAxiom(df.getOWLClassAssertionAxiom(skosConcept, ind));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPAllValuesFromHandler extends AbstractTriplePredicateHandler {

        TPAllValuesFromHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ALL_VALUES_FROM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34511);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34510);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34512);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34513);consumer.addOWLRestriction(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34514);IRI propIRI = consumer.getResourceObject(subject, OWL_ON_PROPERTY.getIRI(), false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34515);if ((((propIRI != null && (!consumer.isAnonymousNode(object) || consumer.translatorAccessor
                .getClassExpressionIfTranslated(object) != null))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34516)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34517)==0&false))) {{
                // The filler is either a datatype or named class
                __CLR4_5_2q5cq5clvicmd34.R.inc(34518);if ((((consumer.isObjectPropertyOnly(propIRI))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34519)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34520)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34521);consumer.addClassExpression(object, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34522);consumer.addTriple(subject, predicate, object);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34523);consumer.translatorAccessor.translateClassExpression(subject);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34524);return true;
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34525);if ((((consumer.isDataPropertyOnly(propIRI))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34526)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34527)==0&false))) {{}
            }}}
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34528);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34529);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPAnnotatedPropertyHandler extends AbstractTriplePredicateHandler {

        TPAnnotatedPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ANNOTATED_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34531);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34530);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34532);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34533);consumer.addAnnotatedSource(object, subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34534);consumer.checkForAndProcessAnnotatedDeclaration(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34535);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34536);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPAnnotatedSourceHandler extends AbstractTriplePredicateHandler {

        TPAnnotatedSourceHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ANNOTATED_SOURCE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34538);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34537);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34539);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34540);consumer.addAnnotatedSource(object, subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34541);consumer.checkForAndProcessAnnotatedDeclaration(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34542);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34543);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPAnnotatedTargetHandler extends AbstractTriplePredicateHandler {

        TPAnnotatedTargetHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ANNOTATED_TARGET.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34545);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34544);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34546);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34547);consumer.addAnnotatedSource(object, subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34548);consumer.checkForAndProcessAnnotatedDeclaration(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34549);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34550);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPComplementOfHandler extends AbstractNamedEquivalentClassAxiomHandler {

        TPComplementOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_COMPLEMENT_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34552);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34551);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34553);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34554);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34555);consumer.addClassExpression(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34556);return super.canHandleStreaming(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        protected OWLClassExpression translateEquivalentClass(@Nonnull IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34557);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34558);return df.getOWLObjectComplementOf(consumer.translatorAccessor.translateClassExpression(mainNode));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPDatatypeComplementOfHandler extends AbstractTriplePredicateHandler {

        TPDatatypeComplementOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DATATYPE_COMPLEMENT_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34560);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34559);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34561);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34562);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34563);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34564);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34565);consumer.addDataRange(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34566);consumer.addDataRange(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34567);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    @Deprecated
    static class TPDeclaredAsHandler extends AbstractTriplePredicateHandler {

        TPDeclaredAsHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, DeprecatedVocabulary.OWL_DECLARED_AS);__CLR4_5_2q5cq5clvicmd34.R.inc(34569);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34568);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34570);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34571);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34572);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34573);if ((((object.equals(OWL_CLASS.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34574)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34575)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34576);addAxiom(df.getOWLDeclarationAxiom(df.getOWLClass(subject), getPendingAnnotations()));
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34577);if ((((object.equals(OWL_OBJECT_PROPERTY.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34578)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34579)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34580);addAxiom(df.getOWLDeclarationAxiom(df.getOWLObjectProperty(subject), getPendingAnnotations()));
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34581);if ((((object.equals(OWL_DATA_PROPERTY.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34582)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34583)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34584);addAxiom(df.getOWLDeclarationAxiom(df.getOWLDataProperty(subject), getPendingAnnotations()));
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34585);if ((((object.equals(OWL_DATATYPE.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34586)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34587)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34588);addAxiom(df.getOWLDeclarationAxiom(df.getOWLDatatype(subject), getPendingAnnotations()));
            }
        }}}}}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPDifferentFromHandler extends AbstractTriplePredicateHandler {

        TPDifferentFromHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DIFFERENT_FROM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34590);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34589);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34591);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34592);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34593);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34594);Set<OWLIndividual> inds = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34595);inds.add(translateIndividual(subject));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34596);inds.add(translateIndividual(object));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34597);addAxiom(df.getOWLDifferentIndividualsAxiom(inds, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34598);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPDisjointUnionHandler extends AbstractTriplePredicateHandler {

        TPDisjointUnionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DISJOINT_UNION_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34600);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34599);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34601);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34602);return super.canHandle(subject, predicate, object) && !consumer.isAnonymousNode(subject) && consumer
                .isClassExpression(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34603);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34604);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34605);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34606);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34607);if ((((!consumer.isAnonymousNode(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34608)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34609)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34610);OWLClass cls = (OWLClass) translateClassExpression(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34611);Set<OWLClassExpression> classExpressions = consumer.translatorAccessor.translateToClassExpressionSet(
                    object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34612);addAxiom(df.getOWLDisjointUnionAxiom(cls, classExpressions, getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34613);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPDisjointWithHandler extends AbstractTriplePredicateHandler {

        TPDisjointWithHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DISJOINT_WITH.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34615);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34614);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34616);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34617);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34618);consumer.addClassExpression(object, false);
            // NB: In strict parsing the above type triples won't get added
            // because
            // they aren't explicit,
            // so we need an extra check to see if there are type triples for
            // the
            // classes
            __CLR4_5_2q5cq5clvicmd34.R.inc(34619);return !isSubjectOrObjectAnonymous(subject, object) && isSubjectAndObjectClassExpression(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34620);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34621);return super.canHandle(subject, predicate, object) && isSubjectAndObjectClassExpression(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34622);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34623);Set<OWLClassExpression> operands = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34624);operands.add(translateClassExpression(subject));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34625);operands.add(translateClassExpression(object));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34626);addAxiom(df.getOWLDisjointClassesAxiom(operands, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34627);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPDistinctMembersHandler extends AbstractTriplePredicateHandler {

        TPDistinctMembersHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DISTINCT_MEMBERS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34629);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34628);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34630);
            // We need all of the list triples to be loaded :(
            __CLR4_5_2q5cq5clvicmd34.R.inc(34631);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34632);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34633);Set<OWLIndividual> inds = consumer.translatorAccessor.translateToIndividualSet(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34634);addAxiom(df.getOWLDifferentIndividualsAxiom(inds, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34635);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPEquivalentClassHandler extends AbstractTriplePredicateHandler {

        TPEquivalentClassHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_EQUIVALENT_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34637);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34636);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34638);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34639);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34640);return super.canHandle(subject, predicate, object)
                && isSubjectAndObjectMatchingClassExpressionOrMatchingDataRange(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34641);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34642);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34643);return !isStrict() && !isSubjectOrObjectAnonymous(subject, object)
                && isSubjectAndObjectMatchingClassExpressionOrMatchingDataRange(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34644);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34645);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34646)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34647)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34648);if ((((isClassExpressionStrict(subject) && isClassExpressionStrict(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34649)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34650)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34651);translateEquivalentClasses(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34652);if ((((isDataRangeStrict(subject) && isDataRangeStrict(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34653)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34654)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34655);translateEquivalentDataRanges(subject, predicate, object);
                }
            }}} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34656);if ((((isClassExpressionLax(subject) && isClassExpressionLax(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34657)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34658)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34659);translateEquivalentClasses(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34660);if ((((isDataRangeLax(subject) || isDataRangeLax(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34661)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34662)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34663);translateEquivalentDataRanges(subject, predicate, object);
                }
            }}}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateEquivalentDataRanges(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34664);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34665);OWLDatatype datatype = df.getOWLDatatype(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34666);OWLDataRange dataRange = consumer.translateDataRange(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34667);OWLDatatypeDefinitionAxiom def = df.getOWLDatatypeDefinitionAxiom(datatype, dataRange,
                getPendingAnnotations());
            __CLR4_5_2q5cq5clvicmd34.R.inc(34668);addAxiom(def);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34669);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateEquivalentClasses(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34670);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34671);Set<OWLClassExpression> operands = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34672);operands.add(translateClassExpression(subject));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34673);operands.add(translateClassExpression(object));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34674);addAxiom(df.getOWLEquivalentClassesAxiom(operands, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34675);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPEquivalentPropertyHandler extends AbstractTriplePredicateHandler {

        TPEquivalentPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_EQUIVALENT_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34677);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34676);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34678);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34679);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34680);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34681);Set<OWLAnnotation> pendingAnnotations = getPendingAnnotations();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34682);if ((((consumer.isObjectProperty(subject) && consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34683)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34684)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34685);Set<OWLObjectPropertyExpression> props = new HashSet<>();
                __CLR4_5_2q5cq5clvicmd34.R.inc(34686);props.add(translateObjectProperty(subject));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34687);props.add(translateObjectProperty(object));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34688);addAxiom(df.getOWLEquivalentObjectPropertiesAxiom(props, pendingAnnotations));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34689);consumeTriple(subject, predicate, object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34690);if ((((consumer.isDataProperty(subject) && consumer.isDataProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34691)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34692)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34693);Set<OWLDataPropertyExpression> props = new HashSet<>();
                __CLR4_5_2q5cq5clvicmd34.R.inc(34694);props.add(translateDataProperty(subject));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34695);props.add(translateDataProperty(object));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34696);addAxiom(df.getOWLEquivalentDataPropertiesAxiom(props, pendingAnnotations));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34697);consumeTriple(subject, predicate, object);
            }
            // TODO: LOG ERROR
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPFirstLiteralHandler extends AbstractTripleHandler implements LiteralTripleHandler {

        TPFirstLiteralHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(34699);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34698);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nullable IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34700);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34701);return predicate != null && predicate.equals(RDF_FIRST.getIRI());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, @Nullable IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34702);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34703);return predicate != null && predicate.equals(RDF_FIRST.getIRI());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, OWLLiteral object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34704);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34705);consumer.addFirst(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34706);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPFirstResourceHandler extends AbstractTriplePredicateHandler {

        TPFirstResourceHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDF_FIRST.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34708);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34707);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34709);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34710);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34711);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34712);consumer.addFirst(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34713);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPHasKeyHandler extends AbstractTriplePredicateHandler {

        private final OptimisedListTranslator<OWLPropertyExpression> listTranslator;

        TPHasKeyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_HAS_KEY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34715);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34714);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34716);listTranslator = Translators.getListTranslator(consumer);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34717);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34718);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34719);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34720);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34721);if ((((consumer.isClassExpression(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34722)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34723)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34724);consumeTriple(subject, predicate, object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34725);OWLClassExpression ce = translateClassExpression(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34726);Set<OWLPropertyExpression> props = listTranslator.translateToSet(object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34727);addAxiom(df.getOWLHasKeyAxiom(ce, props, getPendingAnnotations()));
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPHasValueHandler extends AbstractTriplePredicateHandler {

        TPHasValueHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_HAS_VALUE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34729);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34728);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34730);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34731);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34732);consumer.addOWLRestriction(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34733);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPImportsHandler extends AbstractTriplePredicateHandler {

        TPImportsHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_IMPORTS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34735);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34734);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34736);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34737);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34738);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34739);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34740);consumer.addOntology(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34741);consumer.addOntology(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34742);OWLImportsDeclaration importsDeclaration = df.getOWLImportsDeclaration(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34743);consumer.addImport(importsDeclaration);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34744);if ((((!consumer.getConfiguration().isIgnoredImport(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34745)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34746)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34747);OWLOntologyManager man = consumer.getOWLOntologyManager();
                __CLR4_5_2q5cq5clvicmd34.R.inc(34748);man.makeLoadImportRequest(importsDeclaration, consumer.getConfiguration());
                __CLR4_5_2q5cq5clvicmd34.R.inc(34749);OWLOntology importedOntology = man.getImportedOntology(importsDeclaration);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34750);if ((((importedOntology != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34751)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34752)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34753);OWLDocumentFormat importedOntologyFormat = man.getOntologyFormat(importedOntology);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34754);if ((((importedOntologyFormat instanceof AbstractRDFPrefixDocumentFormat && importedOntology
                        .isAnonymous())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34755)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34756)==0&false))) {{
                        __CLR4_5_2q5cq5clvicmd34.R.inc(34757);if ((((consumer.getConfiguration().getMissingOntologyHeaderStrategy() == INCLUDE_GRAPH)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34758)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34759)==0&false))) {{
                            // We should have just included the triples rather
                            // than imported them. So,
                            // we remove the imports statement, add the axioms
                            // from the imported ontology to
                            // out importing ontology and remove the imported
                            // ontology.
                            // WHO EVER THOUGHT THAT THIS WAS A GOOD IDEA?
                            __CLR4_5_2q5cq5clvicmd34.R.inc(34760);man.applyChange(new RemoveImport(consumer.getOntology(), importsDeclaration));
                            __CLR4_5_2q5cq5clvicmd34.R.inc(34761);for (OWLImportsDeclaration decl : importedOntology.getImportsDeclarations()) {{
                                assert (((decl != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34762)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34763)==0&false));
                                __CLR4_5_2q5cq5clvicmd34.R.inc(34764);man.applyChange(new AddImport(consumer.getOntology(), decl));
                            }
                            }__CLR4_5_2q5cq5clvicmd34.R.inc(34765);for (OWLAnnotation anno : importedOntology.getAnnotations()) {{
                                assert (((anno != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34766)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34767)==0&false));
                                __CLR4_5_2q5cq5clvicmd34.R.inc(34768);man.applyChange(new AddOntologyAnnotation(consumer.getOntology(), anno));
                            }
                            }__CLR4_5_2q5cq5clvicmd34.R.inc(34769);for (OWLAxiom ax : importedOntology.getAxioms()) {{
                                __CLR4_5_2q5cq5clvicmd34.R.inc(34770);consumer.addAxiom(ax);
                            }
                            }__CLR4_5_2q5cq5clvicmd34.R.inc(34771);man.removeOntology(importedOntology);
                        }
                    }}
                }}
                }__CLR4_5_2q5cq5clvicmd34.R.inc(34772);consumer.importsClosureChanged();
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    /** A handler for top level intersection classes. */
    static class TPIntersectionOfHandler extends AbstractNamedEquivalentClassAxiomHandler {

        TPIntersectionOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_INTERSECTION_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34774);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34773);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        protected OWLClassExpression translateEquivalentClass(IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34775);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34776);return df.getOWLObjectIntersectionOf(consumer.translatorAccessor.translateToClassExpressionSet(mainNode));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34777);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34778);if ((((consumer.isClassExpression(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34779)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34780)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34781);consumer.addClassExpression(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34782);if ((((consumer.isClassExpression(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34783)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34784)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34785);consumer.addClassExpression(subject, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34786);if ((((consumer.isDataRange(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34787)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34788)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34789);consumer.addDataRange(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34790);if ((((consumer.isDataRange(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34791)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34792)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34793);consumer.addDataRange(subject, false);
            }
            }}}}__CLR4_5_2q5cq5clvicmd34.R.inc(34794);return super.canHandleStreaming(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    /** owl:inverseOf is used in both property expressions AND axioms. */
    static class TPInverseOfHandler extends AbstractTriplePredicateHandler {

        private boolean axiomParsingMode = false;

        TPInverseOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_INVERSE_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34796);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34795);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        public boolean isAxiomParsingMode() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34797);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34798);return axiomParsingMode;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        public void setAxiomParsingMode(boolean axiomParsingMode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34799);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34800);this.axiomParsingMode = axiomParsingMode;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34801);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34802);consumer.addObjectProperty(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34803);consumer.addObjectProperty(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34804);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34805);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34806);return super.canHandle(subject, predicate, object) && consumer.isObjectProperty(subject) && consumer
                .isObjectProperty(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34807);
            // Only do axiom translation
            __CLR4_5_2q5cq5clvicmd34.R.inc(34808);if ((((axiomParsingMode && consumer.isObjectProperty(subject) && consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34809)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34810)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34811);addAxiom(df.getOWLInverseObjectPropertiesAxiom(translateObjectProperty(subject),
                    translateObjectProperty(object), getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34812);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPOnClassHandler extends AbstractTriplePredicateHandler {

        TPOnClassHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ON_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34814);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34813);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34815);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34816);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34817);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34818);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34819);consumer.addClassExpression(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34820);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPOnDataRangeHandler extends AbstractTriplePredicateHandler {

        TPOnDataRangeHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ON_DATA_RANGE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34822);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34821);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34823);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34824);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34825);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34826);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34827);consumer.addDataRange(object, true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34828);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPOnPropertyHandler extends AbstractTriplePredicateHandler {

        TPOnPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ON_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34830);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34829);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34831);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34832);consumer.addOWLRestriction(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34833);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34834);}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPOneOfHandler extends AbstractNamedEquivalentClassAxiomHandler {

        TPOneOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ONE_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34836);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34835);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        protected OWLClassExpression translateEquivalentClass(IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34837);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34838);return df.getOWLObjectOneOf(consumer.translatorAccessor.translateToIndividualSet(mainNode));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPPropertyChainAxiomHandler extends AbstractTriplePredicateHandler {

        TPPropertyChainAxiomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_PROPERTY_CHAIN_AXIOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34840);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34839);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34841);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34842);consumer.addObjectProperty(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34843);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34844);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34845);OWLObjectPropertyExpression superProp = consumer.translateObjectPropertyExpression(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34846);List<OWLObjectPropertyExpression> chain = consumer.translatorAccessor.translateToObjectPropertyList(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34847);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34848);Set<OWLAnnotation> annos = getPendingAnnotations();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34849);addAxiom(df.getOWLSubPropertyChainOfAxiom(chain, superProp, annos));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPPropertyDisjointWithHandler extends AbstractTriplePredicateHandler {

        TPPropertyDisjointWithHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_PROPERTY_DISJOINT_WITH.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34851);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34850);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34852);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34853);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34854);return super.canHandle(subject, predicate, object) && (consumer.isObjectProperty(subject) && consumer
                .isObjectProperty(object) || consumer.isDataProperty(subject) && consumer.isDataProperty(object));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34855);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34856);if ((((consumer.isDataProperty(subject) && consumer.isDataProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34857)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34858)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34859);addAxiom(df.getOWLDisjointDataPropertiesAxiom(CollectionFactory.createSet(translateDataProperty(
                    subject), translateDataProperty(object)), getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34860);consumeTriple(subject, predicate, object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34861);if ((((consumer.isObjectProperty(subject) && consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34862)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34863)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34864);addAxiom(df.getOWLDisjointObjectPropertiesAxiom(CollectionFactory.createSet(translateObjectProperty(
                    subject), translateObjectProperty(object)), getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(34865);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34866);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34867);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34868);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPPropertyDomainHandler extends AbstractTriplePredicateHandler {

        TPPropertyDomainHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_DOMAIN.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34870);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34869);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34871);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34872);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34873);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34874);if ((((consumer.isObjectProperty(subject) && consumer.isClassExpression(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34875)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34876)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34877);translateObjectPropertyDomain(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34878);if ((((consumer.isDataPropertyOnly(subject) && consumer.isClassExpression(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34879)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34880)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34881);translateDataPropertyDomain(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34882);if ((((consumer.isAnnotationProperty(subject) && consumer.isClassExpression(object) && !consumer
                .isAnonymousNode(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34883)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34884)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34885);translateAnnotationPropertyDomain(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34886);if ((((!isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34887)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34888)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34889);consumer.addAnnotationProperty(subject, false);
                __CLR4_5_2q5cq5clvicmd34.R.inc(34890);translateAnnotationPropertyDomain(subject, predicate, object);
            }
        }}}}}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateAnnotationPropertyDomain(@Nonnull IRI subject, @Nonnull IRI predicate,
            @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34891);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34892);OWLAnnotationProperty prop = df.getOWLAnnotationProperty(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34893);addAxiom(df.getOWLAnnotationPropertyDomainAxiom(prop, object, getPendingAnnotations()));
            // TODO: Handle anonymous domain - error?
            __CLR4_5_2q5cq5clvicmd34.R.inc(34894);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateDataPropertyDomain(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34895);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34896);addAxiom(df.getOWLDataPropertyDomainAxiom(translateDataProperty(subject), translateClassExpression(object),
                getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34897);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateObjectPropertyDomain(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34898);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34899);addAxiom(df.getOWLObjectPropertyDomainAxiom(translateObjectProperty(subject), translateClassExpression(
                object), getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34900);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPPropertyRangeHandler extends AbstractTriplePredicateHandler {

        TPPropertyRangeHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_RANGE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34902);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34901);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34903);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34904);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34905);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34906);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34907);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34908)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34909)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34910);if ((((isObjectPropertyStrict(subject) && isClassExpressionStrict(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34911)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34912)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34913);translateAsObjectPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34914);if ((((isDataPropertyStrict(subject) && isDataRangeStrict(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34915)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34916)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34917);translateAsDataPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34918);if ((((consumer.isAnnotationProperty(subject) && !consumer.isAnonymousNode(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34919)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34920)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34921);translateAsAnnotationPropertyRange(subject, predicate, object);
                }
            }}}} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34922);if ((((isObjectPropertyStrict(subject) && consumer.isClassExpression(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34923)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34924)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34925);translateAsObjectPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34926);if ((((isDataPropertyStrict(subject) && consumer.isDataRange(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34927)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34928)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34929);translateAsDataPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34930);if ((((consumer.isAnnotationProperty(subject) && !consumer.isAnonymousNode(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34931)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34932)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34933);translateAsAnnotationPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34934);if ((((isAnnotationPropertyOnly(subject) && !isAnonymous(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34935)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34936)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34937);translateAsAnnotationPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34938);if ((((isClassExpressionLax(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34939)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34940)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34941);consumer.addObjectProperty(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34942);translateAsObjectPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34943);if ((((isDataRangeLax(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34944)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34945)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34946);consumer.addDataProperty(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34947);translateAsDataPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34948);if ((((isObjectPropertyLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34949)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34950)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34951);consumer.addObjectProperty(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34952);translateAsObjectPropertyRange(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(34953);if ((((isDataPropertyLax(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34954)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34955)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34956);consumer.addDataProperty(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34957);translateAsDataPropertyRange(subject, predicate, object);
                } }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34958);consumer.addAnnotationProperty(subject, false);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(34959);translateAsAnnotationPropertyRange(subject, predicate, object);
                }
            }}}}}}}}}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateAsAnnotationPropertyRange(@Nonnull IRI subject, @Nonnull IRI predicate,
            @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34960);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34961);OWLAnnotationProperty prop = df.getOWLAnnotationProperty(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34962);addAxiom(df.getOWLAnnotationPropertyRangeAxiom(prop, object, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34963);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateAsDataPropertyRange(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34964);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34965);OWLDataPropertyExpression property = translateDataProperty(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34966);OWLDataRange dataRange = translateDataRange(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34967);addAxiom(df.getOWLDataPropertyRangeAxiom(property, dataRange, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34968);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateAsObjectPropertyRange(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34969);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34970);OWLObjectPropertyExpression property = translateObjectProperty(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34971);OWLClassExpression range = translateClassExpression(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34972);addAxiom(df.getOWLObjectPropertyRangeAxiom(property, range, getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34973);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPRestHandler extends AbstractTriplePredicateHandler {

        TPRestHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDF_REST.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34975);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34974);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34976);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34977);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34978);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34979);if ((((!object.equals(RDF_NIL.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(34980)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(34981)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(34982);consumer.addRest(subject, object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(34983);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPSameAsHandler extends AbstractTriplePredicateHandler {

        TPSameAsHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_SAME_AS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34985);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34984);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34986);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34987);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34988);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34989);Set<OWLIndividual> inds = new HashSet<>();
            __CLR4_5_2q5cq5clvicmd34.R.inc(34990);inds.add(translateIndividual(subject));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34991);inds.add(translateIndividual(object));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34992);addAxiom(df.getOWLSameIndividualAxiom(inds, consumer.getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(34993);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPSomeValuesFromHandler extends AbstractTriplePredicateHandler {

        TPSomeValuesFromHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_SOME_VALUES_FROM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(34995);try{__CLR4_5_2q5cq5clvicmd34.R.inc(34994);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34996);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34997);handleTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(34998);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(34999);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35000);consumer.addOWLRestriction(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35001);if ((((consumer.isDataRange(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35002)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35003)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35004);IRI property = consumer.getResourceObject(subject, OWL_ON_PROPERTY.getIRI(), false);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35005);if ((((property != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35006)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35007)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35008);consumer.addDataProperty(property, false);
                }
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    /**
     * Handles rdfs:subClassOf triples. If handling is set to strict then the
     * triple is only consumed if the subject and object are typed as classes.
     */
    static class TPSubClassOfHandler extends AbstractTriplePredicateHandler {

        TPSubClassOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_SUBCLASS_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35010);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35009);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35011);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35012);return super.canHandle(subject, predicate, object) && isTyped(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private boolean isTyped(IRI subject, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35013);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35014);return consumer.isClassExpression(subject) && consumer.isClassExpression(object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35015);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35016);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35017);consumer.addClassExpression(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35018);return !isStrict() && !isSubjectOrObjectAnonymous(subject, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35019);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35020);if ((((isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35021)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35022)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35023);if ((((isClassExpressionStrict(subject) && isClassExpressionStrict(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35024)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35025)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35026);translate(subject, predicate, object);
                }
            }} }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35027);if ((((isClassExpressionLax(subject) && isClassExpressionLax(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35028)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35029)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35030);translate(subject, predicate, object);
                }
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translate(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35031);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35032);OWLClassExpression subClass = translateClassExpression(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35033);OWLClassExpression supClass = translateClassExpression(object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35034);Set<OWLAnnotation> pendingAnnotations = consumer.getPendingAnnotations();
            __CLR4_5_2q5cq5clvicmd34.R.inc(35035);OWLAxiom ax = df.getOWLSubClassOfAxiom(subClass, supClass, pendingAnnotations);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35036);addAxiom(ax);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35037);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPSubPropertyOfHandler extends AbstractTriplePredicateHandler {

        TPSubPropertyOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_SUB_PROPERTY_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35039);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35038);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35040);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35041);if ((((consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35042)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35043)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35044);consumer.addObjectProperty(subject, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35045);if ((((consumer.isDataProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35046)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35047)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35048);consumer.addDataProperty(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35049);if ((((consumer.isAnnotationProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35050)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35051)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35052);consumer.addAnnotationProperty(subject, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35053);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35054)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35055)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35056);consumer.addObjectProperty(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35057);if ((((consumer.isDataProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35058)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35059)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35060);consumer.addDataProperty(object, false);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35061);if ((((consumer.isAnnotationProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35062)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35063)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35064);consumer.addAnnotationProperty(object, false);
            }
            }}}}}}__CLR4_5_2q5cq5clvicmd34.R.inc(35065);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35066);
            // First check for object property chain
            __CLR4_5_2q5cq5clvicmd34.R.inc(35067);if ((((!isStrict() && consumer.hasPredicate(subject, DeprecatedVocabulary.OWL_PROPERTY_CHAIN))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35068)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35069)==0&false))) {{
                // Property chain
                __CLR4_5_2q5cq5clvicmd34.R.inc(35070);IRI chainList = consumer.getResourceObject(subject, DeprecatedVocabulary.OWL_PROPERTY_CHAIN, true);
                assert (((chainList != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35071)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35072)==0&false));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35073);List<OWLObjectPropertyExpression> properties = consumer.translatorAccessor
                    .translateToObjectPropertyList(chainList);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35074);addAxiom(df.getOWLSubPropertyChainOfAxiom(properties, translateObjectProperty(object),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35075);consumeTriple(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35076);if ((((!isStrict() && consumer.hasPredicate(subject, RDF_FIRST.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35077)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35078)==0&false))) {{
                // Legacy object property chain representation
                __CLR4_5_2q5cq5clvicmd34.R.inc(35079);List<OWLObjectPropertyExpression> properties = consumer.translatorAccessor
                    .translateToObjectPropertyList(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35080);addAxiom(df.getOWLSubPropertyChainOfAxiom(properties, translateObjectProperty(object),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35081);consumeTriple(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35082);if ((((consumer.isObjectProperty(subject) && consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35083)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35084)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35085);translateSubObjectProperty(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35086);if ((((consumer.isDataProperty(subject) && consumer.isDataProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35087)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35088)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35089);translateSubDataProperty(subject, predicate, object);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35090);if ((((!isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35091)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35092)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35093);if ((((consumer.isObjectProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35094)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35095)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35096);translateSubObjectProperty(subject, predicate, object);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35097);if ((((consumer.isDataProperty(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35098)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35099)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35100);translateSubDataProperty(subject, predicate, object);
                } }else {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35101);OWLAnnotationProperty subAnnoProp = df.getOWLAnnotationProperty(subject);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35102);OWLAnnotationProperty superAnnoProp = df.getOWLAnnotationProperty(object);
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35103);addAxiom(df.getOWLSubAnnotationPropertyOfAxiom(subAnnoProp, superAnnoProp,
                        getPendingAnnotations()));
                }
                }}__CLR4_5_2q5cq5clvicmd34.R.inc(35104);consumeTriple(subject, predicate, object);
            }
        }}}}}}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateSubObjectProperty(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35105);
            // Object - object
            __CLR4_5_2q5cq5clvicmd34.R.inc(35106);addAxiom(df.getOWLSubObjectPropertyOfAxiom(translateObjectProperty(subject), translateObjectProperty(
                object), getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(35107);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateSubDataProperty(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35108);
            // Data - Data
            __CLR4_5_2q5cq5clvicmd34.R.inc(35109);addAxiom(df.getOWLSubDataPropertyOfAxiom(translateDataProperty(subject), translateDataProperty(object),
                getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(35110);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPTypeHandler extends AbstractTriplePredicateHandler {

        TPTypeHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDF_TYPE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35112);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35111);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35113);
            // Can handle if object isn;t anonymous and either the object
            // IRI is owl:Thing, or it is not part of the build in vocabulary
            __CLR4_5_2q5cq5clvicmd34.R.inc(35114);consumer.addClassExpression(object, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35115);if ((((isAnonymous(object))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35116)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35117)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35118);return false;
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35119);if ((((object.isReservedVocabulary())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35120)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35121)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35122);return object.equals(OWL_THING.getIRI());
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35123);return true;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35124);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35125);if ((((BUILT_IN_VOCABULARY_IRIS.contains(object) && !object.equals(OWL_THING.getIRI()))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35126)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35127)==0&false))) {{
                // Can't have instance of built in vocabulary!
                // Shall we throw an exception here?
                __CLR4_5_2q5cq5clvicmd34.R.inc(35128);LOGGER.info("Individual of builtin type {}", object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35129);addAxiom(df.getOWLClassAssertionAxiom(translateClassExpression(object), translateIndividual(subject),
                getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(35130);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPUnionOfHandler extends AbstractNamedEquivalentClassAxiomHandler {

        TPUnionOfHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_UNION_OF.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35132);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35131);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        protected OWLClassExpression translateEquivalentClass(IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35133);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35134);return df.getOWLObjectUnionOf(consumer.translatorAccessor.translateToClassExpressionSet(mainNode));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TPVersionIRIHandler extends AbstractTriplePredicateHandler {

        TPVersionIRIHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_VERSION_IRI.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35136);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35135);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35137);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35138);OWLOntology ontology = consumer.getOntology();
            // only setup the versionIRI if it is null before this point
            __CLR4_5_2q5cq5clvicmd34.R.inc(35139);if ((((!ontology.getOntologyID().getVersionIRI().isPresent())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35140)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35141)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35142);Optional<IRI> ontologyIRI = ontology.getOntologyID().getOntologyIRI();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35143);Optional<IRI> versionIRI = Optional.of(object);
                // If there was no ontologyIRI before this point and the subject
                // of this statement was not anonymous,
                // then use the subject IRI as the ontology IRI, else we keep
                // the previous definition for the ontology IRI
                __CLR4_5_2q5cq5clvicmd34.R.inc(35144);if ((((!ontologyIRI.isPresent() && !isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35145)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35146)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35147);ontologyIRI = Optional.of(subject);
                }
                }__CLR4_5_2q5cq5clvicmd34.R.inc(35148);OWLOntologyID ontologyID = new OWLOntologyID(ontologyIRI, versionIRI);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35149);consumer.setOntologyID(ontologyID);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35150);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35151);
            // Always apply at the end
            __CLR4_5_2q5cq5clvicmd34.R.inc(35152);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35153);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35154);return predicate.equals(OWL_VERSION_IRI.getIRI());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    abstract static class AbstractTriplePredicateHandler extends AbstractResourceTripleHandler implements
        TriplePredicateHandler {

        private final IRI predicateIRI;

        AbstractTriplePredicateHandler(@Nonnull OWLRDFConsumer consumer, IRI predicateIRI) {
            super(consumer);__CLR4_5_2q5cq5clvicmd34.R.inc(35156);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35155);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35157);this.predicateIRI = predicateIRI;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35158);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35159);inferTypes(subject, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35160);return predicate.equals(predicateIRI);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public IRI getPredicateIRI() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35161);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35162);return predicateIRI;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAllDifferentHandler extends AbstractBuiltInTypeHandler {

        TypeAllDifferentHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ALL_DIFFERENT.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35164);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35163);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35165);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35166);return super.canHandle(subject, predicate, object) && consumer.getResourceObject(subject, OWL_MEMBERS,
                false) != null;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35167);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35168);IRI listNode = consumer.getResourceObject(subject, OWL_MEMBERS.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35169);if ((((listNode != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35170)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35171)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35172);Set<OWLIndividual> inds = consumer.translatorAccessor.translateToIndividualSet(listNode);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35173);addAxiom(df.getOWLDifferentIndividualsAxiom(inds, getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35174);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35175);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35176);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAllDisjointClassesHandler extends AbstractBuiltInTypeHandler {

        TypeAllDisjointClassesHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ALL_DISJOINT_CLASSES.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35178);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35177);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandle(IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35179);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35180);return super.canHandle(subject, predicate, object) && consumer.getResourceObject(subject, OWL_MEMBERS,
                false) != null;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35181);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35182);IRI listNode = consumer.getResourceObject(subject, OWL_MEMBERS.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35183);if ((((listNode != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35184)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35185)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35186);Set<OWLClassExpression> desc = consumer.translatorAccessor.translateToClassExpressionSet(listNode);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35187);Set<OWLAnnotation> annotations = consumer.translateAnnotations(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35188);addAxiom(df.getOWLDisjointClassesAxiom(desc, annotations));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35189);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35190);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35191);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAllDisjointPropertiesHandler extends AbstractBuiltInTypeHandler {

        TypeAllDisjointPropertiesHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ALL_DISJOINT_PROPERTIES.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35193);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35192);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35194);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35195);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35196);IRI listNode = consumer.getResourceObject(subject, OWL_MEMBERS.getIRI(), true);
            assert (((listNode != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35197)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35198)==0&false));
            __CLR4_5_2q5cq5clvicmd34.R.inc(35199);if ((((consumer.isObjectProperty(consumer.getFirstResource(listNode, false)))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35200)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35201)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35202);Set<OWLAnnotation> annotations = consumer.translateAnnotations(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35203);List<OWLObjectPropertyExpression> props = consumer.translatorAccessor.translateToObjectPropertyList(
                    listNode);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35204);consumer.addAxiom(df.getOWLDisjointObjectPropertiesAxiom(new HashSet<>(props), annotations));
            } }else {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35205);Set<OWLAnnotation> annotations = consumer.translateAnnotations(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35206);List<OWLDataPropertyExpression> props = consumer.translatorAccessor.translateToDataPropertyList(
                    listNode);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35207);consumer.addAxiom(df.getOWLDisjointDataPropertiesAxiom(new HashSet<>(props), annotations));
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35208);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35209);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAnnotationHandler extends AbstractBuiltInTypeHandler {

        TypeAnnotationHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ANNOTATION.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35211);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35210);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35212);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35213);consumer.addAnnotationIRI(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAnnotationPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeAnnotationPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ANNOTATION_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35215);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35214);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35216);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35217);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35218)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35219)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35220);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35221);OWLAnnotationProperty property = df.getOWLAnnotationProperty(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35222);addAxiom(df.getOWLDeclarationAxiom(property, annos));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35223);consumeTriple(subject, predicate, object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35224);consumer.addAnnotationProperty(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAsymmetricPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeAsymmetricPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ASYMMETRIC_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35226);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35225);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35227);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35228);consumer.addObjectProperty(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35229);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35230);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35231);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35232)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35233)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35234);addAxiom(df.getOWLAsymmetricObjectPropertyAxiom(translateObjectProperty(subject),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35235);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeAxiomHandler extends AbstractBuiltInTypeHandler {

        TypeAxiomHandler(@Nonnull OWLRDFConsumer consumer) {
            this(consumer, OWL_AXIOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35237);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35236);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        TypeAxiomHandler(@Nonnull OWLRDFConsumer consumer, IRI typeIRI) {
            super(consumer, typeIRI);__CLR4_5_2q5cq5clvicmd34.R.inc(35239);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35238);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35240);
            // We can't handle this is a streaming fashion, because we can't
            // be sure that the subject, predicate, object triples have been
            // parsed.
            __CLR4_5_2q5cq5clvicmd34.R.inc(35241);consumer.addAxiom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35242);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Gets the IRI of the predicate of the triple that specifies the target
         * of a reified axiom
         * 
         * @return The IRI, by default this is owl:annotatedTarget
         */
        protected static OWLRDFVocabulary getTargetTriplePredicate() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35243);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35244);return OWL_ANNOTATED_TARGET;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Gets the IRI of the predicate of the triple that specifies that
         * predicate of a reified axiom
         * 
         * @return The IRI, by default this is owl:annotatedProperty
         */
        protected static OWLRDFVocabulary getPropertyTriplePredicate() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35245);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35246);return OWL_ANNOTATED_PROPERTY;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Gets the IRI of the predicate of the triple that specifies the source
         * of a reified axiom
         * 
         * @return The IRI, by default this is owl:annotatedSource
         */
        protected static OWLRDFVocabulary getSourceTriplePredicate() {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35247);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35248);return OWL_ANNOTATED_SOURCE;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35249);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35250);IRI annotatedSource = getObjectOfSourceTriple(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35251);IRI annotatedProperty = getObjectOfPropertyTriple(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35252);IRI annotatedTarget = getObjectOfTargetTriple(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35253);OWLLiteral annotatedTargetLiteral = null;
            __CLR4_5_2q5cq5clvicmd34.R.inc(35254);if ((((annotatedTarget == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35255)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35256)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35257);annotatedTargetLiteral = getTargetLiteral(subject);
            }
            // check that other conditions are not invalid
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35258);if ((((annotatedSource != null && annotatedProperty != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35259)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35260)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35261);consumeTriple(subject, predicate, object);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35262);Set<OWLAnnotation> annotations = consumer.translateAnnotations(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35263);consumer.addPendingAnnotations(annotations);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35264);if ((((annotatedTarget != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35265)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35266)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35267);consumer.handlerAccessor.handle(annotatedSource, annotatedProperty, annotatedTarget);
                } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35268);if ((((annotatedTargetLiteral != null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35269)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35270)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35271);consumer.handlerAccessor.handle(annotatedSource, annotatedProperty, annotatedTargetLiteral);
                }
                }}__CLR4_5_2q5cq5clvicmd34.R.inc(35272);if ((((!annotations.isEmpty())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35273)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35274)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35275);OWLAxiom ax = consumer.getLastAddedAxiom();
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35276);consumer.removeAxiom(ax.getAxiomWithoutAnnotations());
                }
            }}
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @SuppressWarnings("unused")
        protected OWLAxiom handleAxiomTriples(IRI subjectTriple, IRI predicateTriple, IRI objectTriple,
            Set<OWLAnnotation> annotations) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35277);
            // Reconstitute the original triple from the reification triples
            __CLR4_5_2q5cq5clvicmd34.R.inc(35278);return consumer.getLastAddedAxiom();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        protected OWLAxiom handleAxiomTriples(@Nonnull IRI subjectTripleObject, @Nonnull IRI predicateTripleObject,
            @Nonnull OWLLiteral con, @SuppressWarnings("unused") Set<OWLAnnotation> annotations) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35279);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35280);consumer.handlerAccessor.handle(subjectTripleObject, predicateTripleObject, con);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35281);return consumer.getLastAddedAxiom();
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
        private OWLLiteral getTargetLiteral(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35282);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35283);OWLLiteral con = consumer.getLiteralObject(subject, getTargetTriplePredicate(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35284);if ((((con == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35285)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35286)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35287);con = consumer.getLiteralObject(subject, DeprecatedVocabulary.RDF_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35288);return verifyNotNull(con);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Gets the object of the target triple that has the specified main node
         * 
         * @param mainNode
         *        The main node
         * @return The object of the triple that has the specified mainNode as
         *         its subject and the IRI returned by the
         *         {@code TypeAxiomHandler#getSourceTriplePredicate()} method.
         *         For backwards compatibility, a search will also be performed
         *         for triples whos subject is the specified mainNode and
         *         predicate rdf:object
         */
        @Nullable
        private IRI getObjectOfTargetTriple(IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35289);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35290);IRI objectTripleObject = consumer.getResourceObject(mainNode, getTargetTriplePredicate(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35291);if ((((objectTripleObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35292)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35293)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35294);objectTripleObject = consumer.getResourceObject(mainNode, DeprecatedVocabulary.RDF_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35295);if ((((objectTripleObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35296)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35297)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35298);objectTripleObject = consumer.getResourceObject(mainNode, DeprecatedVocabulary.OWL_PROPERTY_CHAIN,
                    true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35299);return objectTripleObject;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nullable
        private IRI getObjectOfPropertyTriple(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35300);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35301);IRI predicateTripleObject = consumer.getResourceObject(subject, getPropertyTriplePredicate(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35302);if ((((predicateTripleObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35303)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35304)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35305);predicateTripleObject = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_PREDICATE, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35306);return predicateTripleObject;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        /**
         * Gets the source IRI for an annotated or reified axiom
         * 
         * @param mainNode
         *        The main node of the triple
         * @return The source object
         * @throws OWLRDFXMLParserMalformedNodeException
         *         malformed node
         */
        @Nullable
        private IRI getObjectOfSourceTriple(IRI mainNode) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35307);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35308);IRI subjectTripleObject = consumer.getResourceObject(mainNode, getSourceTriplePredicate(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35309);if ((((subjectTripleObject == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35310)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35311)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35312);subjectTripleObject = consumer.getResourceObject(mainNode, DeprecatedVocabulary.RDF_SUBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35313);return subjectTripleObject;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeClassHandler extends AbstractBuiltInTypeHandler {

        TypeClassHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35315);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35314);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35316);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35317);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35318)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35319)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35320);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35321);OWLClass owlClass = df.getOWLClass(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35322);addAxiom(df.getOWLDeclarationAxiom(owlClass, annos));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35323);consumer.addClassExpression(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeDataPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeDataPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DATA_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35325);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35324);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35326);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35327);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35328)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35329)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35330);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35331);OWLDataProperty owlDataProperty = df.getOWLDataProperty(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35332);addAxiom(df.getOWLDeclarationAxiom(owlDataProperty, annos));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35333);consumer.addDataProperty(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeDataRangeHandler extends AbstractBuiltInTypeHandler {

        TypeDataRangeHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DATA_RANGE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35335);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35334);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35336);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35337);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35338)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35339)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35340);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeDatatypeHandler extends AbstractBuiltInTypeHandler {

        TypeDatatypeHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_DATATYPE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35342);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35341);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35343);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35344);if ((((!consumer.isAnonymousNode(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35345)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35346)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35347);OWLDatatype dt = df.getOWLDatatype(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35348);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35349);addAxiom(df.getOWLDeclarationAxiom(dt, annos));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35350);consumer.addDataRange(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeDeprecatedClassHandler extends AbstractBuiltInTypeHandler {

        TypeDeprecatedClassHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DEPRECATED_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35352);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35351);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35353);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35354);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35355);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35356);addAxiom(df.getDeprecatedOWLAnnotationAssertionAxiom(subject));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeDeprecatedPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeDeprecatedPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_DEPRECATED_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35358);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35357);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35359);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35360);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35361);addAxiom(df.getDeprecatedOWLAnnotationAssertionAxiom(subject));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeFunctionalPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeFunctionalPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_FUNCTIONAL_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35363);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35362);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35364);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35365);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35366);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35367);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35368)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35369)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35370);addAxiom(df.getOWLFunctionalObjectPropertyAxiom(translateObjectProperty(subject),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35371);consumeTriple(subject, predicate, object);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35372);if ((((consumer.isDataProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35373)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35374)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35375);addAxiom(df.getOWLFunctionalDataPropertyAxiom(translateDataProperty(subject), getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35376);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeInverseFunctionalPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeInverseFunctionalPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_INVERSE_FUNCTIONAL_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35378);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35377);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35379);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35380);consumer.handlerAccessor.handle(subject, predicate, OWL_OBJECT_PROPERTY.getIRI());
            __CLR4_5_2q5cq5clvicmd34.R.inc(35381);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35382);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35383);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35384)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35385)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35386);OWLObjectPropertyExpression property = translateObjectProperty(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35387);addAxiom(df.getOWLInverseFunctionalObjectPropertyAxiom(property, getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35388);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeIrreflexivePropertyHandler extends AbstractBuiltInTypeHandler {

        TypeIrreflexivePropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_IRREFLEXIVE_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35390);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35389);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35391);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35392);consumer.addObjectProperty(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35393);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35394);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35395);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35396)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35397)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35398);addAxiom(df.getOWLIrreflexiveObjectPropertyAxiom(translateObjectProperty(subject),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35399);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeListHandler extends AbstractBuiltInTypeHandler {

        TypeListHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDF_LIST.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35401);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35400);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35402);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35403);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeNamedIndividualHandler extends AbstractBuiltInTypeHandler {

        TypeNamedIndividualHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_NAMED_INDIVIDUAL.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35405);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35404);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35406);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35407);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35408)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35409)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35410);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35411);OWLNamedIndividual individual = df.getOWLNamedIndividual(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35412);addAxiom(df.getOWLDeclarationAxiom(individual, annos));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35413);consumer.addOWLNamedIndividual(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeNegativeDataPropertyAssertionHandler extends AbstractBuiltInTypeHandler {

        TypeNegativeDataPropertyAssertionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, DeprecatedVocabulary.OWL_NEGATIVE_DATA_PROPERTY_ASSERTION);__CLR4_5_2q5cq5clvicmd34.R.inc(35415);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35414);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35416);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35417);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35418);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35419);IRI source = source(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35420);IRI property = property(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35421);OWLLiteral target = target(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35422);OWLIndividual sourceInd = consumer.getOWLIndividual(source);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35423);OWLDataPropertyExpression prop = consumer.translateDataPropertyExpression(property);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35424);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35425);consumer.translateAnnotations(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35426);Set<OWLAnnotation> annos = consumer.getPendingAnnotations();
            __CLR4_5_2q5cq5clvicmd34.R.inc(35427);addAxiom(df.getOWLNegativeDataPropertyAssertionAxiom(prop, sourceInd, target, annos));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            OWLLiteral target(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35428);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35429);OWLLiteral target = consumer.getLiteralObject(subject, OWL_TARGET_VALUE.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35430);if ((((target == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35431)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35432)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35433);target = consumer.getLiteralObject(subject, DeprecatedVocabulary.OWL_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35434);if ((((target == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35435)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35436)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35437);target = consumer.getLiteralObject(subject, DeprecatedVocabulary.RDF_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35438);return verifyNotNull(target);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            IRI property(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35439);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35440);IRI property = consumer.getResourceObject(subject, OWL_ASSERTION_PROPERTY.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35441);if ((((property == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35442)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35443)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35444);property = consumer.getResourceObject(subject, DeprecatedVocabulary.OWL_PREDICATE, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35445);if ((((property == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35446)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35447)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35448);property = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_PREDICATE, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35449);return verifyNotNull(property);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            IRI source(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35450);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35451);IRI source = consumer.getResourceObject(subject, OWL_SOURCE_INDIVIDUAL.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35452);if ((((source == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35453)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35454)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35455);source = consumer.getResourceObject(subject, DeprecatedVocabulary.OWL_SUBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35456);if ((((source == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35457)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35458)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35459);source = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_SUBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35460);return verifyNotNull(source);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeNegativePropertyAssertionHandler extends AbstractBuiltInTypeHandler {

        TypeNegativePropertyAssertionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_NEGATIVE_PROPERTY_ASSERTION.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35462);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35461);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35463);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35464);return false;
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35465);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35466);IRI source = source(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35467);IRI property = property(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35468);Object target = target(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35469);Set<OWLAnnotation> annos = consumer.translateAnnotations(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35470);if ((((target instanceof OWLLiteral && (!isStrict() || consumer.isDataProperty(property)))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35471)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35472)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35473);translateNegativeDataPropertyAssertion(subject, predicate, object, source, property,
                    (OWLLiteral) target, annos);
            } }else {__CLR4_5_2q5cq5clvicmd34.R.inc(35474);if ((((target instanceof IRI && (!isStrict() || consumer.isObjectProperty(property)))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35475)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35476)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35477);translateNegativeObjectPropertyAssertion(subject, predicate, object, source, property, (IRI) target,
                    annos);
            }
            // TODO LOG ERROR
        }}}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            Object target(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35478);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35479);Object target = consumer.getResourceObject(subject, OWL_TARGET_INDIVIDUAL.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35480);if ((((target == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35481)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35482)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35483);target = consumer.getLiteralObject(subject, OWL_TARGET_VALUE.getIRI(), true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35484);if ((((target == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35485)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35486)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35487);target = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35488);if ((((target == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35489)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35490)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35491);target = consumer.getLiteralObject(subject, DeprecatedVocabulary.RDF_OBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35492);return verifyNotNull(target);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            IRI property(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35493);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35494);IRI property = consumer.getResourceObject(subject, OWL_ASSERTION_PROPERTY.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35495);if ((((property == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35496)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35497)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35498);property = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_PREDICATE, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35499);return verifyNotNull(property);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Nonnull
            IRI source(IRI subject) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35500);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35501);IRI source = consumer.getResourceObject(subject, OWL_SOURCE_INDIVIDUAL.getIRI(), true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35502);if ((((source == null)&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35503)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35504)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35505);source = consumer.getResourceObject(subject, DeprecatedVocabulary.RDF_SUBJECT, true);
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35506);return verifyNotNull(source);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateNegativeObjectPropertyAssertion(@Nonnull IRI subject, @Nonnull IRI predicate,
            @Nonnull IRI object, @Nonnull IRI source, @Nonnull IRI property, @Nonnull IRI target,
            @Nonnull Set<OWLAnnotation> annos) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35507);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35508);OWLIndividual sourceInd = consumer.getOWLIndividual(source);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35509);OWLObjectPropertyExpression prop = consumer.translateObjectPropertyExpression(property);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35510);OWLIndividual targetInd = consumer.getOWLIndividual(target);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35511);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35512);addAxiom(df.getOWLNegativeObjectPropertyAssertionAxiom(prop, sourceInd, targetInd, annos));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        private void translateNegativeDataPropertyAssertion(@Nonnull IRI subject, @Nonnull IRI predicate,
            @Nonnull IRI object, @Nonnull IRI source, @Nonnull IRI property, @Nonnull OWLLiteral target,
            @Nonnull Set<OWLAnnotation> annos) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35513);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35514);OWLIndividual sourceInd = consumer.getOWLIndividual(source);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35515);OWLDataPropertyExpression prop = consumer.translateDataPropertyExpression(property);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35516);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35517);addAxiom(df.getOWLNegativeDataPropertyAssertionAxiom(prop, sourceInd, target, annos));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeObjectPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeObjectPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_OBJECT_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35519);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35518);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35520);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35521);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35522)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35523)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35524);OWLObjectProperty owlObjectProperty = df.getOWLObjectProperty(subject);
                __CLR4_5_2q5cq5clvicmd34.R.inc(35525);Set<OWLAnnotation> annos = getPendingAnnotations();
                __CLR4_5_2q5cq5clvicmd34.R.inc(35526);addAxiom(df.getOWLDeclarationAxiom(owlObjectProperty, annos));
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35527);consumer.addObjectProperty(subject, true);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeOntologyHandler extends AbstractBuiltInTypeHandler {

        TypeOntologyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_ONTOLOGY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35529);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35528);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35530);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35531);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35532);if ((((!isAnonymous(subject) && consumer.getOntologies().isEmpty())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35533)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35534)==0&false))) {{
                // Set IRI if it is not null before this point, and make sure to
                // preserve the version IRI if it also existed before this point
                __CLR4_5_2q5cq5clvicmd34.R.inc(35535);if ((((!consumer.getOntology().getOntologyID().getOntologyIRI().isPresent())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35536)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35537)==0&false))) {{
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35538);OWLOntologyID id = new OWLOntologyID(Optional.of(subject), consumer.getOntology().getOntologyID()
                        .getVersionIRI());
                    __CLR4_5_2q5cq5clvicmd34.R.inc(35539);consumer.applyChange(new SetOntologyID(consumer.getOntology(), id));
                }
            }}
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35540);consumer.addOntology(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeOntologyPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeOntologyPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, DeprecatedVocabulary.OWL_ONTOLOGY_PROPERTY);__CLR4_5_2q5cq5clvicmd34.R.inc(35542);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35541);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35543);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35544);consumeTriple(subject, predicate, object);
            // Add a type triple for an annotation property (Table 6 in Mapping
            // to RDF Graph Spec)
            __CLR4_5_2q5cq5clvicmd34.R.inc(35545);consumer.handlerAccessor.handle(subject, predicate, OWL_ANNOTATION_PROPERTY.getIRI());
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypePropertyHandler extends AbstractBuiltInTypeHandler {

        TypePropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDF_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35547);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35546);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35548);
            // We need to consume this triple
            __CLR4_5_2q5cq5clvicmd34.R.inc(35549);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35550);LOGGER.info("Usage of rdf vocabulary: {} -> {} -> {}", subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeRDFSClassHandler extends AbstractBuiltInTypeHandler {

        TypeRDFSClassHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, RDFS_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35552);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35551);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35553);
            // TODO: Change to rdfs:Class? (See table 5 in the spec)
            __CLR4_5_2q5cq5clvicmd34.R.inc(35554);consumer.addClassExpression(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35555);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35556);if ((((!isStrict())&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35557)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35558)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35559);consumer.handlerAccessor.handle(subject, predicate, OWL_CLASS.getIRI());
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeReflexivePropertyHandler extends AbstractBuiltInTypeHandler {

        TypeReflexivePropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_REFLEXIVE_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35561);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35560);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35562);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35563);consumer.addObjectProperty(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35564);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35565);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35566);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35567)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35568)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35569);addAxiom(df.getOWLReflexiveObjectPropertyAxiom(translateObjectProperty(subject),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35570);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeRestrictionHandler extends AbstractBuiltInTypeHandler {

        TypeRestrictionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_RESTRICTION.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35572);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35571);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35573);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35574);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35575);consumer.addOWLRestriction(subject, true);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35576);consumer.addClassExpression(subject, false);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLAtomListHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLAtomListHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.ATOM_LIST.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35578);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35577);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35579);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35580);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLBuiltInAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLBuiltInAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.BUILT_IN_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35582);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35581);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35583);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35584);consumer.addSWRLBuiltInAtom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35585);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLBuiltInHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLBuiltInHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.BUILT_IN_CLASS.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35587);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35586);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35588);
            // Just consume - I don't care about this
            __CLR4_5_2q5cq5clvicmd34.R.inc(35589);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLClassAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLClassAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.CLASS_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35591);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35590);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35592);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35593);consumer.addSWRLClassAtom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35594);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLDataRangeAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLDataRangeAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.DATA_RANGE_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35596);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35595);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35597);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35598);consumer.addSWRLDataRangeAtom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35599);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLDataValuedPropertyAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLDataValuedPropertyAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.DATAVALUED_PROPERTY_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35601);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35600);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35602);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35603);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35604);consumer.addSWRLDataPropertyAtom(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLDifferentIndividualsAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLDifferentIndividualsAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.DIFFERENT_INDIVIDUALS_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35606);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35605);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35607);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35608);consumer.addSWRLDifferentFromAtom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35609);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLImpHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLImpHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.IMP.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35611);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35610);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35612);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35613);IRI remapIRI = consumer.remapIRI(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35614);consumeTriple(remapIRI, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35615);consumer.addSWRLRule(remapIRI);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLIndividualPropertyAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLIndividualPropertyAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.INDIVIDUAL_PROPERTY_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35617);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35616);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35618);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35619);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35620);consumer.addSWRLIndividualPropertyAtom(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLSameIndividualAtomHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLSameIndividualAtomHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.SAME_INDIVIDUAL_ATOM.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35622);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35621);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35623);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35624);consumer.addSWRLSameAsAtom(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35625);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSWRLVariableHandler extends AbstractBuiltInTypeHandler {

        TypeSWRLVariableHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, SWRLVocabulary.VARIABLE.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35627);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35626);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35628);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35629);consumer.addSWRLVariable(subject);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35630);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSelfRestrictionHandler extends AbstractBuiltInTypeHandler {

        TypeSelfRestrictionHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, DeprecatedVocabulary.OWL_SELF_RESTRICTION);__CLR4_5_2q5cq5clvicmd34.R.inc(35632);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35631);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35633);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35634);consumeTriple(subject, predicate, object);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35635);consumer.addOWLRestriction(subject, false);
            // Patch to new OWL syntax
            __CLR4_5_2q5cq5clvicmd34.R.inc(35636);consumer.addTriple(subject, OWL_HAS_SELF.getIRI(), df.getOWLLiteral(true));
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeSymmetricPropertyHandler extends AbstractBuiltInTypeHandler {

        TypeSymmetricPropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_SYMMETRIC_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35638);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35637);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35639);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35640);if ((((!isAnonymous(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35641)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35642)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35643);consumer.handlerAccessor.handle(subject, predicate, OWL_OBJECT_PROPERTY.getIRI());
            }
            }__CLR4_5_2q5cq5clvicmd34.R.inc(35644);consumer.addObjectProperty(subject, false);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35645);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35646);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35647);if ((((consumer.isObjectProperty(subject))&&(__CLR4_5_2q5cq5clvicmd34.R.iget(35648)!=0|true))||(__CLR4_5_2q5cq5clvicmd34.R.iget(35649)==0&false))) {{
                __CLR4_5_2q5cq5clvicmd34.R.inc(35650);addAxiom(df.getOWLSymmetricObjectPropertyAxiom(translateObjectProperty(subject),
                    getPendingAnnotations()));
                __CLR4_5_2q5cq5clvicmd34.R.inc(35651);consumeTriple(subject, predicate, object);
            }
        }}finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }

    static class TypeTransitivePropertyHandler extends AbstractBuiltInTypeHandler {

        TypeTransitivePropertyHandler(@Nonnull OWLRDFConsumer consumer) {
            super(consumer, OWL_TRANSITIVE_PROPERTY.getIRI());__CLR4_5_2q5cq5clvicmd34.R.inc(35653);try{__CLR4_5_2q5cq5clvicmd34.R.inc(35652);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35654);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35655);consumer.handlerAccessor.handle(subject, predicate, OWL_OBJECT_PROPERTY.getIRI());
            __CLR4_5_2q5cq5clvicmd34.R.inc(35656);return !isAnonymous(subject);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}

        @Override
        public void handleTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2q5cq5clvicmd34.R.inc(35657);
            __CLR4_5_2q5cq5clvicmd34.R.inc(35658);addAxiom(df.getOWLTransitiveObjectPropertyAxiom(translateObjectProperty(subject), getPendingAnnotations()));
            __CLR4_5_2q5cq5clvicmd34.R.inc(35659);consumeTriple(subject, predicate, object);
        }finally{__CLR4_5_2q5cq5clvicmd34.R.flushNeeded();}}
    }
}
