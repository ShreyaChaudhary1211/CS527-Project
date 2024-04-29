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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.formats.RDFDocumentFormat;
import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.rdfxml.parser.Translators.TranslatorAccessor;
import org.semanticweb.owlapi.rdf.rdfxml.parser.TripleHandlers.HandlerAccessor;
import org.semanticweb.owlapi.util.AnonymousNodeChecker;
import org.semanticweb.owlapi.util.AnonymousNodeCheckerImpl;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.RemappingIndividualProvider;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.XSDVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;

/**
 * A parser/interpreter for an RDF graph which represents an OWL ontology. The
 * consumer interprets triple patterns in the graph to produce the appropriate
 * OWLAPI entities, class expressions and axioms. The parser is based on triple
 * handlers. A given triple handler handles a specific type of triple. Generally
 * speaking this is based on the predicate of a triple, for example, A
 * rdfs:subClassOf B is handled by a subClassOf handler. A handler determines if
 * it can handle a triple in a streaming mode (i.e. while parsing is taking
 * place) or if it can handle a triple after parsing has taken place and the
 * complete graph is in memory. Once a handler handles a triple, that triple is
 * deemed to have been consumed an is discarded. The parser attempts to consume
 * as many triples as possible while streaming parsing is taking place. Whether
 * or not a triple can be consumed during parsing is determined by installed
 * triple handlers.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLRDFConsumer implements RDFConsumer, AnonymousNodeChecker, OWLAnonymousIndividualByIdProvider {public static class __CLR4_5_2o3to3tlvicmcku{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32348,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The Constant DAML_OIL. */
    private static final String DAML_OIL = "http://www.daml.org/2001/03/daml+oil#";
    private static final Logger LOGGER = LoggerFactory.getLogger(OWLRDFConsumer.class);
    @Nonnull final TripleLogger tripleLogger;
    /** The configuration. */
    @Nonnull private final OWLOntologyLoaderConfiguration configuration;
    /** The owl ontology manager. */
    private final OWLOntologyManager owlOntologyManager;
    // The set of IRIs that are either explicitly typed
    // an an owl:Class, or are inferred to be an owl:Class
    // because they are used in some triple whose predicate
    // has the domain or range of owl:Class
    /** The class expression iris. */
    private final Set<IRI> classExpressionIRIs;
    /** Same as classExpressionIRIs but for object properties */
    private final Set<IRI> objectPropertyExpressionIRIs;
    /** Same as classExpressionIRIs but for data properties */
    private final Set<IRI> dataPropertyExpressionIRIs;
    /**
     * Same as classExpressionIRIs but for rdf properties things neither typed
     * as a data or object property - bad!
     */
    private final Set<IRI> propertyIRIs;
    /** Set of IRIs that are typed by non-system types and also owl:Thing */
    private final Set<IRI> individualIRIs;
    /** Same as classExpressionIRIs but for annotation properties */
    private final Set<IRI> annotationPropertyIRIs;
    /** The annotation iris. */
    private final Set<IRI> annotationIRIs;
    /** IRIs that had a type triple to rdfs:Datatange */
    private final Set<IRI> dataRangeIRIs;
    /** The IRI of the first reource that is typed as an ontology */
    private IRI firstOntologyIRI;
    /** IRIs that had a type triple to owl:Ontology */
    private final Set<IRI> ontologyIRIs;
    /** IRIs that had a type triple to owl:Restriction */
    private final Set<IRI> restrictionIRIs;
    /** Maps rdf:next triple subjects to objects */
    private final Map<IRI, IRI> listRestTripleMap;
    /** The list first resource triple map. */
    private final Map<IRI, IRI> listFirstResourceTripleMap;
    /** The list first literal triple map. */
    private final Map<IRI, OWLLiteral> listFirstLiteralTripleMap;
    /** The axioms. */
    private final Set<IRI> axioms = new HashSet<>();
    /** The shared anonymous nodes. */
    private final Map<IRI, Object> sharedAnonymousNodes = new HashMap<>();
    /** The pending annotations. */
    private final Set<OWLAnnotation> pendingAnnotations = new HashSet<>();
    /** The annotated anon source2 annotation map. */
    private final Map<IRI, Set<IRI>> annotatedAnonSource2AnnotationMap = new HashMap<>();
    /** The ontology that the RDF will be parsed into. */
    @Nonnull private final OWLOntology ontology;
    /** The expected axioms. */
    private int expectedAxioms = -1;
    /** The parsed axioms. */
    private int parsedAxioms = 0;
    /** The ontology format. */
    private RDFDocumentFormat ontologyFormat;
    /** The data factory. */
    private final OWLDataFactory dataFactory;
    /** The last added axiom. */
    private OWLAxiom lastAddedAxiom;
    /** The synonym map. */
    private Map<IRI, IRI> synonymMap;
    // SWRL Stuff
    /** The swrl rules. */
    private final Set<IRI> swrlRules;
    /** The swrl individual property atoms. */
    private final Set<IRI> swrlIndividualPropertyAtoms;
    /** The swrl data valued property atoms. */
    private final Set<IRI> swrlDataValuedPropertyAtoms;
    /** The swrl class atoms. */
    private final Set<IRI> swrlClassAtoms;
    /** The swrl data range atoms. */
    private final Set<IRI> swrlDataRangeAtoms;
    /** The swrl built in atoms. */
    private final Set<IRI> swrlBuiltInAtoms;
    /** The swrl variables. */
    private final Set<IRI> swrlVariables;
    /** The swrl same as atoms. */
    private final Set<IRI> swrlSameAsAtoms;
    /** The swrl different from atoms. */
    private final Set<IRI> swrlDifferentFromAtoms;
    /** The iri provider. */
    private IRIProvider iriProvider;
    /**
     * A cache of annotation axioms to be added at the end - saves some peek
     * memory doing this.
     */
    private final Collection<OWLAnnotationAxiom> parsedAnnotationAxioms = new ArrayList<>();
    /** The axioms to be removed. */
    private final Collection<OWLAxiom> axiomsToBeRemoved = new ArrayList<>();
    /** The parsed all triples. */
    private boolean parsedAllTriples = false;
    final HandlerAccessor handlerAccessor;
    final TranslatorAccessor translatorAccessor;
    private final AnonymousNodeChecker nodeCheckerDelegate;
    @Nonnull private final ArrayListMultimap<IRI, Class<?>> guessedDeclarations = ArrayListMultimap.create();
    RemappingIndividualProvider anonProvider;

    /**
     * Instantiates a new oWLRDF consumer.
     * 
     * @param ontology
     *        the ontology
     * @param configuration
     *        the configuration
     */
    public OWLRDFConsumer(@Nonnull OWLOntology ontology, @Nonnull OWLOntologyLoaderConfiguration configuration) {
        this(ontology, new AnonymousNodeCheckerImpl(), configuration);__CLR4_5_2o3to3tlvicmcku.R.inc(31242);try{__CLR4_5_2o3to3tlvicmcku.R.inc(31241);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Instantiates a new oWLRDF consumer.
     * 
     * @param ontology
     *        the ontology
     * @param checker
     *        anonymous node checker
     * @param configuration
     *        the configuration
     */
    public OWLRDFConsumer(@Nonnull OWLOntology ontology, @Nonnull AnonymousNodeChecker checker,
        @Nonnull OWLOntologyLoaderConfiguration configuration) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31243);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31244);nodeCheckerDelegate = checker;
        __CLR4_5_2o3to3tlvicmcku.R.inc(31245);owlOntologyManager = ontology.getOWLOntologyManager();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31246);this.ontology = ontology;
        __CLR4_5_2o3to3tlvicmcku.R.inc(31247);dataFactory = owlOntologyManager.getOWLDataFactory();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31248);anonProvider = new RemappingIndividualProvider(dataFactory);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31249);this.configuration = configuration;
        __CLR4_5_2o3to3tlvicmcku.R.inc(31250);handlerAccessor = new HandlerAccessor(this);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31251);translatorAccessor = new TranslatorAccessor(this);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31252);classExpressionIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31253);objectPropertyExpressionIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31254);dataPropertyExpressionIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31255);individualIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31256);annotationPropertyIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31257);for (IRI iri : BUILT_IN_ANNOTATION_PROPERTY_IRIS) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31258);annotationPropertyIRIs.add(iri);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31259);annotationIRIs = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31260);dataRangeIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31261);propertyIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31262);restrictionIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31263);ontologyIRIs = CollectionFactory.createSet();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31264);listFirstLiteralTripleMap = CollectionFactory.createMap();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31265);listFirstResourceTripleMap = CollectionFactory.createMap();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31266);listRestTripleMap = CollectionFactory.createMap();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31267);for (OWL2Datatype dt : OWL2Datatype.values()) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31268);dataRangeIRIs.add(dt.getIRI());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31269);dataRangeIRIs.add(OWLRDFVocabulary.RDFS_LITERAL.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31270);if ((((!configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31271)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31272)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31273);for (XSDVocabulary vocabulary : XSDVocabulary.values()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31274);dataRangeIRIs.add(vocabulary.getIRI());
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31275);swrlRules = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31276);swrlIndividualPropertyAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31277);swrlDataValuedPropertyAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31278);swrlClassAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31279);swrlDataRangeAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31280);swrlBuiltInAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31281);swrlVariables = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31282);swrlSameAsAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31283);swrlDifferentFromAtoms = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31284);classExpressionIRIs.add(OWLRDFVocabulary.OWL_THING.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31285);classExpressionIRIs.add(OWLRDFVocabulary.OWL_NOTHING.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31286);objectPropertyExpressionIRIs.add(OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31287);objectPropertyExpressionIRIs.add(OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31288);dataPropertyExpressionIRIs.add(OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31289);dataPropertyExpressionIRIs.add(OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31290);setupSynonymMap();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31291);setupSinglePredicateMaps();
        // Cache anything in the existing imports closure
        __CLR4_5_2o3to3tlvicmcku.R.inc(31292);importsClosureChanged();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31293);if ((((this.ontology.getOntologyID().getOntologyIRI().isPresent())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31294)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31295)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31296);addOntology(this.ontology.getOntologyID().getOntologyIRI().get());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31297);tripleLogger = new TripleLogger();
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void addPrefix(String abbreviation, String value) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31298);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31299);if ((((ontologyFormat.isPrefixOWLOntologyFormat())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31300)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31301)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31302);ontologyFormat.asPrefixOWLOntologyFormat().setPrefix(abbreviation, value);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Sets the iRI provider.
     * 
     * @param iriProvider
     *        the new iRI provider
     */
    protected void setIRIProvider(IRIProvider iriProvider) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31303);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31304);this.iriProvider = iriProvider;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void addSingleValuedResPredicate(OWLRDFVocabulary v) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31305);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31306);Map<IRI, IRI> map = CollectionFactory.createMap();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31307);singleValuedResTriplesByPredicate.put(v.getIRI(), map);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void setupSinglePredicateMaps() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31308);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31309);addSingleValuedResPredicate(OWL_ON_PROPERTY);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31310);addSingleValuedResPredicate(OWL_SOME_VALUES_FROM);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31311);addSingleValuedResPredicate(OWL_ALL_VALUES_FROM);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31312);addSingleValuedResPredicate(OWL_ON_CLASS);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31313);addSingleValuedResPredicate(OWL_ON_DATA_RANGE);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void setupSynonymMap() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31314);
        // We can load legacy ontologies by providing synonyms for built in
        // vocabulary
        // where the vocabulary has simply changed (e.g. DAML+OIL -> OWL)
        __CLR4_5_2o3to3tlvicmcku.R.inc(31315);synonymMap = CollectionFactory.createMap();
        // Legacy protege-owlapi representation of QCRs
        __CLR4_5_2o3to3tlvicmcku.R.inc(31316);synonymMap.put(IRI.create(Namespaces.OWL.getPrefixIRI(), "valuesFrom"), OWL_ON_CLASS.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31317);if ((((!configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31318)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31319)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31320);addDAMLOILVocabulary();
            __CLR4_5_2o3to3tlvicmcku.R.inc(31321);addIntermediateOWLSpecVocabulary();
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /** Adds the damloil vocabulary. */
    private void addDAMLOILVocabulary() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31322);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31323);synonymMap.put(IRI.create(DAML_OIL, "subClassOf"), RDFS_SUBCLASS_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31324);synonymMap.put(IRI.create(DAML_OIL, "imports"), OWL_IMPORTS.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31325);synonymMap.put(IRI.create(DAML_OIL, "range"), RDFS_RANGE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31326);synonymMap.put(IRI.create(DAML_OIL, "hasValue"), OWL_HAS_VALUE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31327);synonymMap.put(IRI.create(DAML_OIL, "type"), RDF_TYPE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31328);synonymMap.put(IRI.create(DAML_OIL, "domain"), RDFS_DOMAIN.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31329);synonymMap.put(IRI.create(DAML_OIL, "versionInfo"), OWL_VERSION_INFO.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31330);synonymMap.put(IRI.create(DAML_OIL, "comment"), RDFS_COMMENT.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31331);synonymMap.put(IRI.create(DAML_OIL, "onProperty"), OWL_ON_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31332);synonymMap.put(IRI.create(DAML_OIL, "toClass"), OWL_ALL_VALUES_FROM.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31333);synonymMap.put(IRI.create(DAML_OIL, "hasClass"), OWL_SOME_VALUES_FROM.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31334);synonymMap.put(IRI.create(DAML_OIL, "Restriction"), OWL_RESTRICTION.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31335);synonymMap.put(IRI.create(DAML_OIL, "Class"), OWL_CLASS.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31336);synonymMap.put(IRI.create(DAML_OIL, "Thing"), OWL_THING.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31337);synonymMap.put(IRI.create(DAML_OIL, "Nothing"), OWL_NOTHING.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31338);synonymMap.put(IRI.create(DAML_OIL, "minCardinality"), OWL_MIN_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31339);synonymMap.put(IRI.create(DAML_OIL, "cardinality"), OWL_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31340);synonymMap.put(IRI.create(DAML_OIL, "maxCardinality"), OWL_MAX_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31341);synonymMap.put(IRI.create(DAML_OIL, "inverseOf"), OWL_INVERSE_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31342);synonymMap.put(IRI.create(DAML_OIL, "samePropertyAs"), OWL_EQUIVALENT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31343);synonymMap.put(IRI.create(DAML_OIL, "hasClassQ"), OWL_ON_CLASS.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31344);synonymMap.put(IRI.create(DAML_OIL, "cardinalityQ"), OWL_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31345);synonymMap.put(IRI.create(DAML_OIL, "maxCardinalityQ"), OWL_MAX_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31346);synonymMap.put(IRI.create(DAML_OIL, "minCardinalityQ"), OWL_MIN_CARDINALITY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31347);synonymMap.put(IRI.create(DAML_OIL, "complementOf"), OWL_COMPLEMENT_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31348);synonymMap.put(IRI.create(DAML_OIL, "unionOf"), OWL_UNION_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31349);synonymMap.put(IRI.create(DAML_OIL, "intersectionOf"), OWL_INTERSECTION_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31350);synonymMap.put(IRI.create(DAML_OIL, "label"), RDFS_LABEL.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31351);synonymMap.put(IRI.create(DAML_OIL, "ObjectProperty"), OWL_OBJECT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31352);synonymMap.put(IRI.create(DAML_OIL, "DatatypeProperty"), OWL_DATA_PROPERTY.getIRI());
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * There may be some ontologies floating about that use early versions of
     * the OWL 1.1 vocabulary. We can map early versions of the vocabulary to
     * the current OWL 1.1 vocabulary.
     */
    private void addIntermediateOWLSpecVocabulary() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31353);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31354);for (OWLRDFVocabulary v : values()) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31355);addLegacyMapping(v);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31356);for (OWLFacet v : OWLFacet.values()) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31357);synonymMap.put(IRI.create(Namespaces.OWL.toString(), v.getShortForm()), v.getIRI());
            __CLR4_5_2o3to3tlvicmcku.R.inc(31358);synonymMap.put(IRI.create(Namespaces.OWL11.toString(), v.getShortForm()), v.getIRI());
            __CLR4_5_2o3to3tlvicmcku.R.inc(31359);synonymMap.put(IRI.create(Namespaces.OWL2.toString(), v.getShortForm()), v.getIRI());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31360);for (OWLFacet v : OWLFacet.values()) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31361);synonymMap.put(IRI.create(Namespaces.OWL2.toString(), v.getShortForm()), v.getIRI());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31362);synonymMap.put(DeprecatedVocabulary.OWL_NEGATIVE_DATA_PROPERTY_ASSERTION,
            OWLRDFVocabulary.OWL_NEGATIVE_PROPERTY_ASSERTION.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31363);synonymMap.put(DeprecatedVocabulary.OWL_NEGATIVE_OBJECT_PROPERTY_ASSERTION,
            OWLRDFVocabulary.OWL_NEGATIVE_PROPERTY_ASSERTION.getIRI());
        // Intermediate OWL 2 spec
        __CLR4_5_2o3to3tlvicmcku.R.inc(31364);synonymMap.put(DeprecatedVocabulary.OWL_SUBJECT, OWL_ANNOTATED_SOURCE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31365);synonymMap.put(DeprecatedVocabulary.OWL_PREDICATE, OWL_ANNOTATED_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31366);synonymMap.put(DeprecatedVocabulary.OWL_OBJECT, OWL_ANNOTATED_TARGET.getIRI());
        // Preliminary OWL 1.1 Vocab
        __CLR4_5_2o3to3tlvicmcku.R.inc(31367);synonymMap.put(IRI.create(Namespaces.OWL.toString(), "cardinalityType"), OWL_ON_CLASS.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31368);synonymMap.put(IRI.create(Namespaces.OWL.toString(), "dataComplementOf"), OWL_COMPLEMENT_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31369);synonymMap.put(DeprecatedVocabulary.OWL_ANTI_SYMMETRIC_PROPERTY, OWL_ASYMMETRIC_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31370);synonymMap.put(DeprecatedVocabulary.OWL_FUNCTIONAL_DATA_PROPERTY, OWL_FUNCTIONAL_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31371);synonymMap.put(DeprecatedVocabulary.OWL_FUNCTIONAL_OBJECT_PROPERTY, OWL_FUNCTIONAL_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31372);synonymMap.put(DeprecatedVocabulary.OWL_SUB_DATA_PROPERTY_OF, RDFS_SUB_PROPERTY_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31373);synonymMap.put(DeprecatedVocabulary.OWL_SUB_OBJECT_PROPERTY_OF, RDFS_SUB_PROPERTY_OF.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31374);synonymMap.put(DeprecatedVocabulary.OWL_OBJECT_PROPERTY_RANGE, RDFS_RANGE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31375);synonymMap.put(DeprecatedVocabulary.OWL_DATA_PROPERTY_RANGE, RDFS_RANGE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31376);synonymMap.put(DeprecatedVocabulary.OWL_OBJECT_PROPERTY_DOMAIN, RDFS_DOMAIN.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31377);synonymMap.put(DeprecatedVocabulary.OWL_DATA_PROPERTY_DOMAIN, RDFS_DOMAIN.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31378);synonymMap.put(DeprecatedVocabulary.OWL_DISJOINT_DATA_PROPERTIES, OWL_PROPERTY_DISJOINT_WITH.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31379);synonymMap.put(DeprecatedVocabulary.OWL_DISJOINT_OBJECT_PROPERTIES, OWL_PROPERTY_DISJOINT_WITH.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31380);synonymMap.put(DeprecatedVocabulary.OWL_EQUIVALENT_DATA_PROPERTIES, OWL_EQUIVALENT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31381);synonymMap.put(DeprecatedVocabulary.OWL_EQUIVALENT_OBJECT_PROPERTIES, OWL_EQUIVALENT_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31382);synonymMap.put(DeprecatedVocabulary.OWL_OBJECT_RESTRICTION, OWL_RESTRICTION.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31383);synonymMap.put(DeprecatedVocabulary.OWL_DATA_RESTRICTION, OWL_RESTRICTION.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31384);synonymMap.put(OWL_DATA_RANGE.getIRI(), RDFS_DATATYPE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31385);synonymMap.put(DeprecatedVocabulary.OWL_SUBJECT, OWL_ANNOTATED_SOURCE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31386);synonymMap.put(DeprecatedVocabulary.OWL_PREDICATE, OWL_ANNOTATED_PROPERTY.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31387);synonymMap.put(DeprecatedVocabulary.OWL_OBJECT, OWL_ANNOTATED_TARGET.getIRI());
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void addLegacyMapping(OWLRDFVocabulary v) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31388);
        // Map OWL11 to OWL
        // Map OWL2 to OWL
        __CLR4_5_2o3to3tlvicmcku.R.inc(31389);synonymMap.put(IRI.create(Namespaces.OWL2.toString(), v.getShortForm()), v.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31390);synonymMap.put(IRI.create(Namespaces.OWL11.toString(), v.getShortForm()), v.getIRI());
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the ontology.
     * 
     * @return the ontology
     */
    @Nonnull
    public OWLOntology getOntology() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31391);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31392);return ontology;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the ontology format.
     * 
     * @return the ontology format
     */
    @Nonnull
    public RDFDocumentFormat getOntologyFormat() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31393);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31394);return verifyNotNull(ontologyFormat, "ontology format has not been set yet");
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Sets the ontology format.
     * 
     * @param format
     *        the new ontology format
     */
    public void setOntologyFormat(RDFDocumentFormat format) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31395);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31396);ontologyFormat = format;
        __CLR4_5_2o3to3tlvicmcku.R.inc(31397);if ((((ontologyFormat.isPrefixOWLOntologyFormat())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31398)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31399)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31400);tripleLogger.setPrefixManager(ontologyFormat.asPrefixOWLOntologyFormat());
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Sets the expected axioms.
     * 
     * @param expectedAxioms
     *        the new expected axioms
     */
    public void setExpectedAxioms(int expectedAxioms) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31401);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31402);this.expectedAxioms = expectedAxioms;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the data factory.
     * 
     * @return the data factory
     */
    public OWLDataFactory getDataFactory() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31403);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31404);return dataFactory;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // We cache IRIs to save memory!!
    private final Map<String, IRI> IRIMap = CollectionFactory.createMap();

    /**
     * Gets any annotations that were translated since the last call of this
     * method (calling this method clears the current pending annotations).
     * 
     * @return The set (possibly empty) of pending annotations.
     */
    @Nonnull
    public Set<OWLAnnotation> getPendingAnnotations() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31405);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31406);Set<OWLAnnotation> annos = new LinkedHashSet<>(pendingAnnotations);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31407);pendingAnnotations.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31408);return annos;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Sets the pending annotations.
     * 
     * @param annotations
     *        the new pending annotations
     */
    protected void addPendingAnnotations(Set<OWLAnnotation> annotations) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31409);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31410);pendingAnnotations.addAll(annotations);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nullable
    private IRI getIRINullable(@Nullable String s) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31411);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31412);if ((((s == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31413)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31414)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31415);return null;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31416);return getIRI(s);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull
    private IRI getIRI(@Nonnull String s) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31417);
        // if (s == null) {
        // return null;
        // }
        __CLR4_5_2o3to3tlvicmcku.R.inc(31418);checkNotNull(s, "s cannot be null");
        __CLR4_5_2o3to3tlvicmcku.R.inc(31419);IRI iri = null;
        __CLR4_5_2o3to3tlvicmcku.R.inc(31420);if ((((iriProvider != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31421)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31422)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31423);iri = iriProvider.getIRI(s);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31424);if ((((iri != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31425)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31426)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31427);return iri;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31428);iri = IRIMap.get(s);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31429);if ((((iri == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31430)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31431)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31432);iri = IRI.create(s);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31433);IRIMap.put(s, iri);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31434);return iri;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /** Imports closure changed. */
    protected final void importsClosureChanged() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31435);
        // NOTE: This method only gets called when the ontology being parsed
        // adds a direct import. This is enough
        // for resolving the imports closure.
        // We cache IRIs of various entities here.
        // We also mop up any triples that weren't parsed and consumed in the
        // imports closure.
        __CLR4_5_2o3to3tlvicmcku.R.inc(31436);for (OWLOntology ont : owlOntologyManager.getImportsClosure(ontology)) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31437);for (OWLAnnotationProperty prop : ont.getAnnotationPropertiesInSignature(EXCLUDED)) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31438);annotationPropertyIRIs.add(prop.getIRI());
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31439);for (OWLDataProperty prop : ont.getDataPropertiesInSignature()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31440);dataPropertyExpressionIRIs.add(prop.getIRI());
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31441);for (OWLObjectProperty prop : ont.getObjectPropertiesInSignature()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31442);objectPropertyExpressionIRIs.add(prop.getIRI());
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31443);for (OWLClass cls : ont.getClassesInSignature()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31444);classExpressionIRIs.add(cls.getIRI());
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31445);for (OWLDatatype datatype : ont.getDatatypesInSignature()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31446);dataRangeIRIs.add(datatype.getIRI());
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31447);for (OWLNamedIndividual ind : ont.getIndividualsInSignature()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31448);individualIRIs.add(ind.getIRI());
            }
        }}
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public boolean isAnonymousNode(String iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31449);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31450);return nodeCheckerDelegate.isAnonymousNode(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public boolean isAnonymousSharedNode(String iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31451);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31452);return nodeCheckerDelegate.isAnonymousSharedNode(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public boolean isAnonymousNode(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31453);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31454);return nodeCheckerDelegate.isAnonymousNode(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the shared anonymous node.
     * 
     * @param iri
     *        the iri
     * @param translation
     *        the translation
     */
    protected void addSharedAnonymousNode(IRI iri, Object translation) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31455);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31456);sharedAnonymousNodes.put(iri, translation);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the shared anonymous node.
     * 
     * @param iri
     *        the iri
     * @return the shared anonymous node
     */
    protected Object getSharedAnonymousNode(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31457);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31458);return sharedAnonymousNodes.get(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private int lastPercentParsed = 0;

    /**
     * Adds the axiom.
     * 
     * @param axiom
     *        the axiom
     */
    protected void addAxiom(OWLAxiom axiom) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31459);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31460);if ((((expectedAxioms > 0)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31461)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31462)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31463);parsedAxioms++;
            __CLR4_5_2o3to3tlvicmcku.R.inc(31464);int percentParsed = (int) (parsedAxioms * 100.0 / expectedAxioms);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31465);if ((((lastPercentParsed != percentParsed)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31466)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31467)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31468);lastPercentParsed = percentParsed;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31469);if ((((axiom.isAnnotationAxiom())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31470)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31471)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31472);if ((((configuration.isLoadAnnotationAxioms())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31473)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31474)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31475);parsedAnnotationAxioms.add((OWLAnnotationAxiom) axiom);
            }
        }} }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31476);owlOntologyManager.addAxiom(ontology, axiom);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31477);lastAddedAxiom = axiom;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Marks an axioms for removal at the end of parsing. This is usually used
     * for annotated axioms, since the RDF serialization spec mandates that a
     * "base" triple must be included on serialization.
     * 
     * @param axiom
     *        The axiom to be removed.
     */
    protected void removeAxiom(OWLAxiom axiom) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31478);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31479);axiomsToBeRemoved.add(axiom);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Check for and process annotated declaration.
     * 
     * @param mainNode
     *        the main node
     */
    protected void checkForAndProcessAnnotatedDeclaration(IRI mainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31480);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31481);IRI annotatedPropertyObject = getResourceObject(mainNode, OWL_ANNOTATED_PROPERTY, false);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31482);if ((((annotatedPropertyObject == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31483)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31484)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31485);return;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31486);boolean rdfTypePredicate = annotatedPropertyObject.equals(RDF_TYPE.getIRI());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31487);if ((((!rdfTypePredicate)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31488)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31489)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31490);return;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31491);IRI annotatedTargetObject = getResourceObject(mainNode, OWL_ANNOTATED_TARGET, false);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31492);if ((((annotatedTargetObject == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31493)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31494)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31495);return;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31496);IRI annotatedSubjectObject = getResourceObject(mainNode, OWL_ANNOTATED_SOURCE, false);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31497);if ((((annotatedSubjectObject == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31498)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31499)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31500);return;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31501);boolean isEntityType = isEntityTypeIRI(annotatedTargetObject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31502);if ((((isEntityType)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31503)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31504)==0&false))) {{
            // This will add and record the declaration for us
            __CLR4_5_2o3to3tlvicmcku.R.inc(31505);handlerAccessor.handle(annotatedSubjectObject, annotatedPropertyObject, annotatedTargetObject);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Determines if the specified IRI is an IRI corresponding to owl:Class,
     * owl:DatatypeProperty, rdfs:Datatype, owl:ObjectProperty,
     * owl:AnnotationProperty, or owl:NamedIndividual.
     * 
     * @param iri
     *        The IRI to check
     * @return {@code true} if the IRI corresponds to a built in OWL entity IRI
     *         otherwise {@code false}.
     */
    private static boolean isEntityTypeIRI(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31506);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31507);return iri.equals(OWL_CLASS.getIRI()) || iri.equals(OWL_OBJECT_PROPERTY.getIRI()) || iri.equals(
            OWL_DATA_PROPERTY.getIRI()) || iri.equals(OWL_ANNOTATION_PROPERTY.getIRI()) || iri.equals(RDFS_DATATYPE
                .getIRI()) || iri.equals(OWL_NAMED_INDIVIDUAL.getIRI());
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Apply change.
     * 
     * @param change
     *        the change
     */
    protected void applyChange(@Nonnull OWLOntologyChange change) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31508);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31509);owlOntologyManager.applyChange(change);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Sets the ontology id.
     * 
     * @param ontologyID
     *        the new ontology id
     */
    protected void setOntologyID(@Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31510);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31511);applyChange(new SetOntologyID(ontology, ontologyID));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the ontology annotation.
     * 
     * @param annotation
     *        the annotation
     */
    protected void addOntologyAnnotation(@Nonnull OWLAnnotation annotation) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31512);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31513);applyChange(new AddOntologyAnnotation(ontology, annotation));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the import.
     * 
     * @param declaration
     *        the declaration
     */
    protected void addImport(@Nonnull OWLImportsDeclaration declaration) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31514);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31515);applyChange(new AddImport(ontology, declaration));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the last added axiom.
     * 
     * @return the last added axiom
     */
    public OWLAxiom getLastAddedAxiom() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31516);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31517);return lastAddedAxiom;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is individual.
     * 
     * @param iri
     *        the iri
     * @return true, if is individual
     */
    protected boolean isIndividual(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31518);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31519);return individualIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the rdf property.
     * 
     * @param iri
     *        the iri
     */
    protected void addRDFProperty(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31520);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31521);propertyIRIs.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is rDF property.
     * 
     * @param iri
     *        the iri
     * @return true, if is rDF property
     */
    protected boolean isRDFProperty(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31522);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31523);return propertyIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the class expression.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    public void addClassExpression(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31524);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31525);updateGuesses(iri, OWLClass.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31526);addType(iri, classExpressionIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void updateGuesses(IRI iri, Class<?> class1, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31527);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31528);if ((((explicitlyTyped && guessedDeclarations.containsKey(iri))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31529)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31530)==0&false))) {{
            // if an explicitly typed declaration has been added and there was a
            // guess for its type, replace it
            // Do not replace all guesses, as these might be due to punning
            __CLR4_5_2o3to3tlvicmcku.R.inc(31531);guessedDeclarations.remove(iri, class1);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31532);if ((((!explicitlyTyped)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31533)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31534)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31535);guessedDeclarations.put(iri, class1);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is class expression.
     * 
     * @param iri
     *        the iri
     * @return true, if is class expression
     */
    public boolean isClassExpression(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31536);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31537);return classExpressionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the object property.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    public void addObjectProperty(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31538);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31539);updateGuesses(iri, OWLObjectProperty.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31540);addType(iri, objectPropertyExpressionIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the data property.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    public void addDataProperty(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31541);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31542);updateGuesses(iri, OWLDataProperty.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31543);addType(iri, dataPropertyExpressionIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the annotation property.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    protected void addAnnotationProperty(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31544);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31545);updateGuesses(iri, OWLAnnotationProperty.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31546);addType(iri, annotationPropertyIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the data range.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    public void addDataRange(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31547);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31548);updateGuesses(iri, OWLDataRange.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31549);addType(iri, dataRangeIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the owl named individual.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly type
     */
    protected void addOWLNamedIndividual(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31550);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31551);updateGuesses(iri, OWLNamedIndividual.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31552);addType(iri, individualIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the owl restriction.
     * 
     * @param iri
     *        the iri
     * @param explicitlyTyped
     *        the explicitly typed
     */
    protected void addOWLRestriction(IRI iri, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31553);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31554);updateGuesses(iri, OWLClassExpression.class, explicitlyTyped);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31555);addType(iri, restrictionIRIs, explicitlyTyped);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void addType(IRI iri, Set<IRI> types, boolean explicitlyTyped) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31556);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31557);if ((((configuration.isStrict() && !explicitlyTyped)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31558)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31559)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31560);LOGGER.warn("STRICT: Not adding implicit type iri={} types={}", iri, types);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31561);return;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31562);types.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is restriction.
     * 
     * @param iri
     *        the iri
     * @return true, if is restriction
     */
    public boolean isRestriction(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31563);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31564);return restrictionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the annotation iri.
     * 
     * @param iri
     *        the iri
     */
    protected void addAnnotationIRI(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31565);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31566);annotationIRIs.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is annotation.
     * 
     * @param iri
     *        the iri
     * @return true, if is annotation
     */
    protected boolean isAnnotation(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31567);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31568);return annotationIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Determines if a given IRI is currently an object property IRI and not a
     * data property IRI and not an annotation property IRI. Note that this
     * method is only guaranteed to return the same value once all triples in
     * the imports closure of the RDF graph being parsed have been parsed.
     * 
     * @param iri
     *        The IRI to check.
     * @return {@code true} if the IRI is an object property IRI and not a data
     *         property IRI and not an annotation property IRI. Otherwise,
     *         {@code false}.
     */
    protected boolean isObjectPropertyOnly(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31569);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31570);return iri != null && !dataPropertyExpressionIRIs.contains(iri) && !annotationPropertyIRIs.contains(iri)
            && objectPropertyExpressionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is object property.
     * 
     * @param iri
     *        the iri
     * @return true, if is object property
     */
    protected boolean isObjectProperty(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31571);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31572);return objectPropertyExpressionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Determines if a given IRI is currently a data property IRI and not an
     * object property IRI and not an annotation property IRI. Note that this
     * method is only guaranteed to return the same value once all triples in
     * the imports closure of the RDF graph being parsed have been parsed.
     * 
     * @param iri
     *        The IRI to check.
     * @return {@code true} if the IRI is a data property IRI and not an object
     *         property IRI and not an annotation property IRI. Otherwise,
     *         {@code false}.
     */
    protected boolean isDataPropertyOnly(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31573);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31574);return iri != null && !objectPropertyExpressionIRIs.contains(iri) && !annotationPropertyIRIs.contains(iri)
            && dataPropertyExpressionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is data property.
     * 
     * @param iri
     *        the iri
     * @return true, if is data property
     */
    protected boolean isDataProperty(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31575);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31576);return dataPropertyExpressionIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Determines if a given IRI is currently an annotation property IRI and not
     * a data property IRI and not an object property IRI. Note that this method
     * is only guaranteed to return the same value once all triples in the
     * imports closure of the RDF graph being parsed have been parsed.
     * 
     * @param iri
     *        The IRI to check.
     * @return {@code true} if the IRI is an annotation property IRI and not a
     *         data property IRI and not an object property IRI. Otherwise,
     *         {@code false}.
     */
    protected boolean isAnnotationPropertyOnly(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31577);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31578);return iri != null && !objectPropertyExpressionIRIs.contains(iri) && !dataPropertyExpressionIRIs.contains(iri)
            && annotationPropertyIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is annotation property.
     * 
     * @param iri
     *        the iri
     * @return true, if is annotation property
     */
    protected boolean isAnnotationProperty(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31579);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31580);return annotationPropertyIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is ontology.
     * 
     * @param iri
     *        the iri
     * @return true, if is ontology
     */
    protected boolean isOntology(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31581);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31582);return ontologyIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the oWL ontology manager.
     * 
     * @return the oWL ontology manager
     */
    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31583);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31584);return owlOntologyManager;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Records an annotation of an anonymous node (either an annotation of an
     * annotation, or an annotation of an axiom for example).
     * 
     * @param annotatedAnonSource
     *        The source that the annotation annotates
     * @param annotationMainNode
     *        The annotations
     */
    public void addAnnotatedSource(IRI annotatedAnonSource, IRI annotationMainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31585);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31586);Set<IRI> annotationMainNodes = annotatedAnonSource2AnnotationMap.get(annotatedAnonSource);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31587);if ((((annotationMainNodes == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31588)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31589)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31590);annotationMainNodes = new HashSet<>();
            __CLR4_5_2o3to3tlvicmcku.R.inc(31591);annotatedAnonSource2AnnotationMap.put(annotatedAnonSource, annotationMainNodes);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31592);annotationMainNodes.add(annotationMainNode);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the main nodes of annotations that annotated the specified source.
     * 
     * @param source
     *        The source (axiom or annotation main node)
     * @return The set of main nodes that annotate the specified source
     */
    public Set<IRI> getAnnotatedSourceAnnotationMainNodes(IRI source) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31593);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31594);Set<IRI> mainNodes = annotatedAnonSource2AnnotationMap.get(source);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31595);if ((((mainNodes != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31596)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31597)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31598);return mainNodes;
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31599);return CollectionFactory.emptySet();
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // Helper methods for creating entities
    /**
     * Gets the oWL class.
     * 
     * @param iri
     *        the iri
     * @return the oWL class
     */
    @Nonnull
    protected OWLClass getOWLClass(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31600);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31601);return getDataFactory().getOWLClass(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the oWL object property.
     * 
     * @param iri
     *        the iri
     * @return the oWL object property
     */
    protected OWLObjectProperty getOWLObjectProperty(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31602);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31603);return getDataFactory().getOWLObjectProperty(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the oWL data property.
     * 
     * @param iri
     *        the iri
     * @return the oWL data property
     */
    protected OWLDataProperty getOWLDataProperty(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31604);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31605);return getDataFactory().getOWLDataProperty(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the oWL individual.
     * 
     * @param iri
     *        the iri
     * @return the oWL individual
     */
    @Nonnull
    protected OWLIndividual getOWLIndividual(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31606);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31607);if ((((isAnonymousNode(iri))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31608)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31609)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31610);return getOWLAnonymousIndividual(iri.toString());
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31611);return dataFactory.getOWLNamedIndividual(iri);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public OWLAnonymousIndividual getOWLAnonymousIndividual(String nodeId) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31612);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31613);return anonProvider.getOWLAnonymousIndividual(nodeId);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Consume triple.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     */
    protected void consumeTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31614);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31615);LOGGER.trace("consuming triple");
        __CLR4_5_2o3to3tlvicmcku.R.inc(31616);tripleLogger.justLog(subject, predicate, object);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31617);isTriplePresent(subject, predicate, object, true);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Consume triple.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param con
     *        the con
     */
    protected void consumeTriple(IRI subject, IRI predicate, OWLLiteral con) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31618);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31619);LOGGER.trace("consuming triple");
        __CLR4_5_2o3to3tlvicmcku.R.inc(31620);tripleLogger.justLog(subject, predicate, con);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31621);isTriplePresent(subject, predicate, con, true);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // SWRL Stuff
    /**
     * Adds the swrl rule.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLRule(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31622);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31623);swrlRules.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL rule.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL rule
     */
    protected boolean isSWRLRule(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31624);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31625);return swrlRules.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl individual property atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLIndividualPropertyAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31626);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31627);swrlIndividualPropertyAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL individual property atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL individual property atom
     */
    protected boolean isSWRLIndividualPropertyAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31628);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31629);return swrlIndividualPropertyAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl data property atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLDataPropertyAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31630);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31631);swrlDataValuedPropertyAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL data valued property atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL data valued property atom
     */
    protected boolean isSWRLDataValuedPropertyAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31632);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31633);return swrlDataValuedPropertyAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl class atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLClassAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31634);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31635);swrlClassAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL class atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL class atom
     */
    protected boolean isSWRLClassAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31636);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31637);return swrlClassAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl same as atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLSameAsAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31638);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31639);swrlSameAsAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL same as atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL same as atom
     */
    protected boolean isSWRLSameAsAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31640);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31641);return swrlSameAsAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl different from atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLDifferentFromAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31642);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31643);swrlDifferentFromAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL different from atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL different from atom
     */
    protected boolean isSWRLDifferentFromAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31644);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31645);return swrlDifferentFromAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl data range atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLDataRangeAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31646);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31647);swrlDataRangeAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL data range atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL data range atom
     */
    protected boolean isSWRLDataRangeAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31648);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31649);return swrlDataRangeAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl built in atom.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLBuiltInAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31650);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31651);swrlBuiltInAtoms.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL built in atom.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL built in atom
     */
    protected boolean isSWRLBuiltInAtom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31652);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31653);return swrlBuiltInAtoms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the swrl variable.
     * 
     * @param iri
     *        the iri
     */
    protected void addSWRLVariable(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31654);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31655);swrlVariables.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is sWRL variable.
     * 
     * @param iri
     *        the iri
     * @return true, if is sWRL variable
     */
    protected boolean isSWRLVariable(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31656);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31657);return swrlVariables.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // RDFConsumer implementation
    private static void printTriple(Object subject, Object predicate, Object object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31658);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31659);LOGGER.info("Unparsed triple: {} -> {} -> {}", subject, predicate, object);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /** Dump remaining triples. */
    protected void dumpRemainingTriples() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31660);
        // if info logging is disabled or all collections are empty, do not
        // output anything
        __CLR4_5_2o3to3tlvicmcku.R.inc(31661);if ((((LOGGER.isInfoEnabled() && singleValuedResTriplesByPredicate.size() + singleValuedLitTriplesByPredicate
            .size() + resTriplesBySubject.size() + litTriplesBySubject.size() > 0)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31662)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31663)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31664);for (IRI predicate : singleValuedResTriplesByPredicate.keySet()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31665);Map<IRI, IRI> map = singleValuedResTriplesByPredicate.get(predicate);
                __CLR4_5_2o3to3tlvicmcku.R.inc(31666);for (IRI subject : map.keySet()) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31667);IRI object = map.get(subject);
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31668);printTriple(subject, predicate, object);
                }
            }}
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31669);for (IRI predicate : singleValuedLitTriplesByPredicate.keySet()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31670);Map<IRI, OWLLiteral> map = singleValuedLitTriplesByPredicate.get(predicate);
                __CLR4_5_2o3to3tlvicmcku.R.inc(31671);for (IRI subject : map.keySet()) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31672);OWLLiteral object = map.get(subject);
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31673);printTriple(subject, predicate, object);
                }
            }}
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31674);for (IRI subject : new ArrayList<>(resTriplesBySubject.keySet())) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31675);Map<IRI, Collection<IRI>> map = resTriplesBySubject.get(subject);
                __CLR4_5_2o3to3tlvicmcku.R.inc(31676);for (IRI predicate : new ArrayList<>(map.keySet())) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31677);Collection<IRI> objects = map.get(predicate);
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31678);for (IRI object : objects) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(31679);printTriple(subject, predicate, object);
                    }
                }}
            }}
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31680);for (IRI subject : new ArrayList<>(litTriplesBySubject.keySet())) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31681);Map<IRI, Collection<OWLLiteral>> map = litTriplesBySubject.get(subject);
                __CLR4_5_2o3to3tlvicmcku.R.inc(31682);for (IRI predicate : new ArrayList<>(map.keySet())) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31683);Collection<OWLLiteral> objects = map.get(predicate);
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31684);for (OWLLiteral object : objects) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(31685);printTriple(subject, predicate, object);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void startModel(IRI physicalURI) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31686);}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is parsed all triples.
     * 
     * @return true, if is parsed all triples
     */
    public boolean isParsedAllTriples() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31687);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31688);return parsedAllTriples;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void endModel() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31689);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31690);parsedAllTriples = true;
        // We are now left with triples that could not be consumed during
        // streaming parsing
        __CLR4_5_2o3to3tlvicmcku.R.inc(31691);IRIMap.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31692);tripleLogger.logNumberOfTriples();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31693);translatorAccessor.consumeSWRLRules(swrlRules);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31694);Set<RDFTriple> remainingTriples = handlerAccessor.mopUp();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31695);if ((((ontologyFormat != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31696)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31697)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31698);RDFParserMetaData metaData = new RDFParserMetaData(RDFOntologyHeaderStatus.PARSED_ONE_HEADER, tripleLogger
                .count(), remainingTriples, guessedDeclarations);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31699);ontologyFormat.setOntologyLoaderMetaData(metaData);
        }
        // Do we need to change the ontology IRI?
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31700);chooseAndSetOntologyIRI();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31701);TripleLogger.logOntologyID(ontology.getOntologyID());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31702);dumpRemainingTriples();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31703);cleanup();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31704);addAnnotationAxioms();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31705);removeAxiomsScheduledForRemoval();
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void addAnnotationAxioms() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31706);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31707);for (OWLAxiom axiom : parsedAnnotationAxioms) {{
            assert (((axiom != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31708)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31709)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31710);owlOntologyManager.addAxiom(ontology, axiom);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void removeAxiomsScheduledForRemoval() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31711);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31712);for (OWLAxiom axiom : axiomsToBeRemoved) {{
            assert (((axiom != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31713)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31714)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31715);owlOntologyManager.removeAxiom(ontology, axiom);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Selects an IRI that should be used as the IRI of the parsed ontology, or
     * {@code null} if the parsed ontology does not have an IRI
     */
    private void chooseAndSetOntologyIRI() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31716);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31717);Optional<IRI> ontologyIRIToSet = Optional.absent();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31718);if ((((ontologyIRIs.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31719)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31720)==0&false))) {{
            // No ontology IRIs
            // We used to use the xml:base here. But this is probably incorrect
            // for OWL 2 now.
        } }else {__CLR4_5_2o3to3tlvicmcku.R.inc(31721);if ((((ontologyIRIs.size() == 1)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31722)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31723)==0&false))) {{
            // Exactly one ontologyIRI
            __CLR4_5_2o3to3tlvicmcku.R.inc(31724);IRI ontologyIRI = ontologyIRIs.iterator().next();
            assert (((ontologyIRI != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31725)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31726)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31727);if ((((!isAnonymousNode(ontologyIRI))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31728)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31729)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31730);ontologyIRIToSet = Optional.of(ontologyIRI);
            }
        }} }else {{
            // We have multiple to choose from
            // Choose one that isn't the object of an annotation assertion
            __CLR4_5_2o3to3tlvicmcku.R.inc(31731);Set<IRI> candidateIRIs = new HashSet<>(ontologyIRIs);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31732);for (OWLAnnotation anno : ontology.getAnnotations()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31733);if ((((anno.getValue() instanceof IRI)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31734)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31735)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31736);IRI iri = (IRI) anno.getValue();
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31737);if ((((ontologyIRIs.contains(iri))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31738)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31739)==0&false))) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(31740);candidateIRIs.remove(iri);
                    }
                }}
            }}
            // Choose the first one parsed
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31741);if ((((candidateIRIs.contains(firstOntologyIRI))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31742)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31743)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31744);ontologyIRIToSet = Optional.of(firstOntologyIRI);
            } }else {__CLR4_5_2o3to3tlvicmcku.R.inc(31745);if ((((!candidateIRIs.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31746)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31747)==0&false))) {{
                // Just pick any
                __CLR4_5_2o3to3tlvicmcku.R.inc(31748);ontologyIRIToSet = Optional.of(candidateIRIs.iterator().next());
            }
        }}}
        }}__CLR4_5_2o3to3tlvicmcku.R.inc(31749);if ((((ontologyIRIToSet.isPresent() && !NodeID.isAnonymousNodeIRI(ontologyIRIToSet.get()))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31750)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31751)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31752);Optional<IRI> versionIRI = ontology.getOntologyID().getVersionIRI();
            __CLR4_5_2o3to3tlvicmcku.R.inc(31753);OWLOntologyID ontologyID = new OWLOntologyID(ontologyIRIToSet, versionIRI);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31754);applyChange(new SetOntologyID(ontology, ontologyID));
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void cleanup() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31755);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31756);classExpressionIRIs.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31757);objectPropertyExpressionIRIs.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31758);dataPropertyExpressionIRIs.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31759);dataRangeIRIs.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31760);restrictionIRIs.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31761);listFirstLiteralTripleMap.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31762);listFirstResourceTripleMap.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31763);listRestTripleMap.clear();
        // XXX clean new members
        __CLR4_5_2o3to3tlvicmcku.R.inc(31764);translatorAccessor.cleanup();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31765);resTriplesBySubject.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31766);litTriplesBySubject.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31767);singleValuedLitTriplesByPredicate.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31768);singleValuedResTriplesByPredicate.clear();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31769);guessedDeclarations.clear();
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void includeModel(String logicalURI, String physicalURI) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31770);
        // XXX should this do nothing?
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void logicalURI(IRI logicalURI) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31771);
        // XXX what is the purpose of this?
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the synonym.
     * 
     * @param original
     *        the original
     * @return the synonym
     */
    @Nonnull
    protected IRI getSynonym(@Nonnull IRI original) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31772);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31773);if ((((!configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31774)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31775)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31776);IRI synonymIRI = synonymMap.get(original);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31777);if ((((synonymIRI != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31778)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31779)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31780);return synonymIRI;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31781);return original;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void statementWithLiteralValue(@Nonnull String subject, @Nonnull String predicate, @Nonnull String object,
        @Nullable String language, @Nullable String datatype) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31782);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31783);tripleLogger.logTriple(subject, predicate, object, language, datatype);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31784);IRI subjectIRI = getIRI(remapOnlyIfRemapped(subject));
        __CLR4_5_2o3to3tlvicmcku.R.inc(31785);IRI predicateIRI = getIRI(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31786);predicateIRI = getSynonym(predicateIRI);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31787);handlerAccessor.handleStreaming(subjectIRI, predicateIRI, object, getIRINullable(datatype), language);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void statementWithLiteralValue(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull String object,
        String language, IRI datatype) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31788);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31789);tripleLogger.logTriple(subject, predicate, object, language, datatype);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31790);handlerAccessor.handleStreaming(subject, getSynonym(predicate), object, datatype, language);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void statementWithResourceValue(@Nonnull String subject, @Nonnull String predicate, @Nonnull String object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31791);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31792);tripleLogger.logTriple(subject, predicate, object);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31793);IRI subjectIRI = getIRI(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31794);IRI predicateIRI = getIRI(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31795);predicateIRI = getSynonym(predicateIRI);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31796);IRI objectIRI = getSynonym(getIRI(object));
        __CLR4_5_2o3to3tlvicmcku.R.inc(31797);handlerAccessor.handleStreaming(subjectIRI, predicateIRI, objectIRI);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    public void statementWithResourceValue(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31798);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31799);tripleLogger.logTriple(subject, predicate, object);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31800);handlerAccessor.handleStreaming(subject, getSynonym(predicate), getSynonym(object));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * A convenience method to obtain an {@code OWLLiteral}.
     * 
     * @param literal
     *        The literal
     * @param datatype
     *        The data type
     * @param lang
     *        The lang
     * @return The {@code OWLLiteral} (either typed or untyped depending on the
     *         params)
     */
    @Nonnull
        OWLLiteral getOWLLiteral(@Nonnull String literal, @Nullable IRI datatype, @Nullable String lang) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31801);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31802);if ((((datatype != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31803)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31804)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31805);return dataFactory.getOWLLiteral(literal, dataFactory.getOWLDatatype(datatype));
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31806);return dataFactory.getOWLLiteral(literal, lang);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * compatibility proxy for TranslatorAccessor#translateClassExpression
     * 
     * @param i
     *        iri fr the class expression
     * @return translated class expression
     */
    @Nonnull
    public OWLClassExpression translateClassExpression(@Nonnull IRI i) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31807);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31808);return translatorAccessor.translateClassExpression(i);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Given a main node, translated data ranges according to Table 12.
     * 
     * @param mainNode
     *        The main node
     * @return The translated data range. If the data range could not be
     *         translated then an OWLDatatype with the given IRI is returned.
     */
    @Nonnull
    public OWLDataRange translateDataRange(@Nonnull IRI mainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31809);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31810);if ((((!isDataRange(mainNode) && configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31811)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31812)==0&false))) {{
            // Can't translated ANY according to Table 12
            __CLR4_5_2o3to3tlvicmcku.R.inc(31813);return generateAndLogParseError(EntityType.DATATYPE, mainNode);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31814);if ((((!isAnonymousNode(mainNode) && isDataRange(mainNode))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31815)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31816)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31817);return dataFactory.getOWLDatatype(mainNode);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31818);IRI intersectionOfObject = getResourceObject(mainNode, OWL_INTERSECTION_OF, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31819);if ((((intersectionOfObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31820)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31821)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31822);Set<OWLDataRange> dataRanges = translatorAccessor.translateToDataRangeSet(intersectionOfObject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31823);return dataFactory.getOWLDataIntersectionOf(dataRanges);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31824);IRI unionOfObject = getResourceObject(mainNode, OWL_UNION_OF, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31825);if ((((unionOfObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31826)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31827)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31828);Set<OWLDataRange> dataRanges = translatorAccessor.translateToDataRangeSet(unionOfObject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31829);return dataFactory.getOWLDataUnionOf(dataRanges);
        }
        // The plain complement of triple predicate is in here for legacy
        // reasons
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31830);IRI complementOfObject = getResourceObject(mainNode, OWL_DATATYPE_COMPLEMENT_OF, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31831);if ((((!configuration.isStrict() && complementOfObject == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31832)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31833)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31834);complementOfObject = getResourceObject(mainNode, OWL_COMPLEMENT_OF, true);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31835);if ((((complementOfObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31836)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31837)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31838);OWLDataRange operand = translateDataRange(complementOfObject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31839);return dataFactory.getOWLDataComplementOf(operand);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31840);IRI oneOfObject = getResourceObject(mainNode, OWL_ONE_OF, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31841);if ((((oneOfObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31842)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31843)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31844);Set<OWLLiteral> literals = translatorAccessor.translateToConstantSet(oneOfObject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31845);return dataFactory.getOWLDataOneOf(literals);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31846);IRI onDatatypeObject = getResourceObject(mainNode, OWL_ON_DATA_TYPE, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31847);if ((((onDatatypeObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31848)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31849)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31850);if ((((isAnonymousNode(onDatatypeObject))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31851)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31852)==0&false))) {{
                // TODO LOG ERROR
                __CLR4_5_2o3to3tlvicmcku.R.inc(31853);return dataFactory.getOWLDatatype(mainNode);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31854);OWLDatatype restrictedDataRange = (OWLDatatype) translateDataRange(onDatatypeObject);
            // Now we have to get the restricted facets - there is some legacy
            // translation code here... the current
            // spec uses a list of triples where the predicate is a facet and
            // the object a literal that is restricted
            // by the facet. Originally, there just used to be multiple
            // facet-"facet value" triples
            __CLR4_5_2o3to3tlvicmcku.R.inc(31855);Set<OWLFacetRestriction> restrictions = new HashSet<>();
            __CLR4_5_2o3to3tlvicmcku.R.inc(31856);IRI facetRestrictionList = getResourceObject(mainNode, OWL_WITH_RESTRICTIONS, true);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31857);if ((((facetRestrictionList != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31858)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31859)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31860);restrictions = translatorAccessor.translateToFacetRestrictionSet(facetRestrictionList);
            } }else {__CLR4_5_2o3to3tlvicmcku.R.inc(31861);if ((((!configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31862)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31863)==0&false))) {{
                // Try the legacy encoding
                __CLR4_5_2o3to3tlvicmcku.R.inc(31864);for (IRI facetIRI : OWLFacet.FACET_IRIS) {{
                    assert (((facetIRI != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31865)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31866)==0&false));
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31867);OWLLiteral val;
                    __CLR4_5_2o3to3tlvicmcku.R.inc(31868);while ((val = getLiteralObject(mainNode, facetIRI, true)) != null) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(31871);restrictions.add(dataFactory.getOWLFacetRestriction(OWLFacet.getFacet(facetIRI), val));
                    }
                }}
            }}
            }}__CLR4_5_2o3to3tlvicmcku.R.inc(31872);return dataFactory.getOWLDatatypeRestriction(restrictedDataRange, restrictions);
        }
        // Could not translated ANYTHING!
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31873);return generateAndLogParseError(EntityType.DATATYPE, mainNode);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Translate data property expression.
     * 
     * @param iri
     *        the iri
     * @return the oWL data property expression
     */
    @Nonnull
    public OWLDataPropertyExpression translateDataPropertyExpression(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31874);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31875);return dataFactory.getOWLDataProperty(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // Basic node translation - translation of entities
    /** The translated properties. */
    private final Map<IRI, OWLObjectPropertyExpression> translatedProperties = new HashMap<>();

    /**
     * Translate object property expression.
     * 
     * @param mainNode
     *        the main node
     * @return the oWL object property expression
     */
    @Nonnull
    public OWLObjectPropertyExpression translateObjectPropertyExpression(@Nonnull IRI mainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31876);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31877);OWLObjectPropertyExpression prop = translatedProperties.get(mainNode);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31878);if ((((prop != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31879)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31880)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31881);return prop;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31882);if ((((!isAnonymousNode(mainNode))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31883)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31884)==0&false))) {{
            // Simple object property
            __CLR4_5_2o3to3tlvicmcku.R.inc(31885);prop = dataFactory.getOWLObjectProperty(mainNode);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31886);translatedProperties.put(mainNode, prop);
        } }else {{
            // Inverse of a property expression
            __CLR4_5_2o3to3tlvicmcku.R.inc(31887);IRI inverseOfObject = getResourceObject(mainNode, OWL_INVERSE_OF, true);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31888);if ((((inverseOfObject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31889)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31890)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31891);OWLObjectPropertyExpression otherProperty = translateObjectPropertyExpression(inverseOfObject);
                __CLR4_5_2o3to3tlvicmcku.R.inc(31892);prop = dataFactory.getOWLObjectInverseOf(otherProperty);
            } }else {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31893);prop = dataFactory.getOWLObjectInverseOf(dataFactory.getOWLObjectProperty(mainNode));
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31894);objectPropertyExpressionIRIs.add(mainNode);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31895);translatedProperties.put(mainNode, prop);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31896);return prop;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Translate individual.
     * 
     * @param node
     *        the node
     * @return the oWL individual
     */
    @Nonnull
    public OWLIndividual translateIndividual(@Nonnull IRI node) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31897);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31898);return getOWLIndividual(node);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Translates the annotation on a main node. Triples whose subject is the
     * specified main node and whose subject is typed an an annotation property
     * (or is a built in annotation property) will be translated to annotation
     * on this main node.
     * 
     * @param mainNode
     *        The main node
     * @return The set of annotations on the main node
     */
    @Nonnull
    public Set<OWLAnnotation> translateAnnotations(IRI mainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31899);
        // Are we the subject of an annotation? If so, we need to ensure that
        // the annotations annotate us. This
        // will only happen if we are an annotation!
        __CLR4_5_2o3to3tlvicmcku.R.inc(31900);Map<IRI, Set<OWLAnnotation>> anns = new HashMap<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31901);Set<IRI> annotationMainNodes = getAnnotatedSourceAnnotationMainNodes(mainNode);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31902);if ((((!annotationMainNodes.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31903)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31904)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31905);for (IRI annotationMainNode : annotationMainNodes) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31906);anns.put(annotationMainNode, translateAnnotations(annotationMainNode));
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31907);Set<OWLAnnotation> mainNodeAnnotations = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31908);Set<IRI> predicates = getPredicatesBySubject(mainNode);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31909);for (IRI predicate : predicates) {{
            assert (((predicate != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31910)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31911)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31912);if ((((isAnnotationProperty(predicate))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31913)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31914)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31915);mapAnnotation(mainNode, anns, mainNodeAnnotations, predicate);
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31916);return mainNodeAnnotations;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    protected void mapAnnotation(IRI mainNode, Map<IRI, Set<OWLAnnotation>> anns,
        Set<OWLAnnotation> mainNodeAnnotations, IRI predicate) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31917);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31918);IRI resVal = getResourceObject(mainNode, predicate, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31919);while ((((resVal != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31920)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31921)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31922);OWLAnnotationProperty prop = dataFactory.getOWLAnnotationProperty(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31923);OWLAnnotationValue val;
            __CLR4_5_2o3to3tlvicmcku.R.inc(31924);if ((((isAnonymousNode(resVal))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31925)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31926)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31927);val = dataFactory.getOWLAnonymousIndividual(resVal.toString());
            } }else {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31928);val = resVal;
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31929);IRI annotation = getSubjectForAnnotatedPropertyAndObject(mainNode, predicate, resVal);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31930);Set<OWLAnnotation> c = anns.get(annotation);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31931);mainNodeAnnotations.add(dataFactory.getOWLAnnotation(prop, val, (((c != null )&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31932)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31933)==0&false))? c
                : Collections.<OWLAnnotation> emptySet()));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31934);resVal = getResourceObject(mainNode, predicate, true);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31935);OWLLiteral litVal = getLiteralObject(mainNode, predicate, true);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31936);while ((((litVal != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31937)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31938)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31939);OWLAnnotationProperty prop = dataFactory.getOWLAnnotationProperty(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31940);IRI annotation = getSubjectForAnnotatedPropertyAndObject(mainNode, predicate, litVal);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31941);Set<OWLAnnotation> c = anns.get(annotation);
            __CLR4_5_2o3to3tlvicmcku.R.inc(31942);mainNodeAnnotations.add(dataFactory.getOWLAnnotation(prop, litVal, (((c != null )&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31943)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31944)==0&false))? c
                : Collections.<OWLAnnotation> emptySet()));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31945);litVal = getLiteralObject(mainNode, predicate, true);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private @Nullable IRI getSubjectForAnnotatedPropertyAndObject(IRI n, IRI p, OWLLiteral v) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31946);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31947);for (IRI i : getAnnotatedSourceAnnotationMainNodes(n)) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31948);if ((((p.equals(getResourceObject(i, OWL_ANNOTATED_PROPERTY, false)) && v.equals(getLiteralObject(i,
                OWL_ANNOTATED_TARGET, false)))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31949)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31950)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31951);return i;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31952);return null;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private @Nullable IRI getSubjectForAnnotatedPropertyAndObject(IRI n, IRI p, IRI v) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31953);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31954);for (IRI i : getAnnotatedSourceAnnotationMainNodes(n)) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31955);if ((((p.equals(getResourceObject(i, OWL_ANNOTATED_PROPERTY, false)) && v.equals(getResourceObject(i,
                OWL_ANNOTATED_TARGET, false)))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31956)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31957)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(31958);return i;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31959);return null;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull private static final AtomicInteger ERRORCOUNTER = new AtomicInteger(0);

    @Nonnull
    private <E extends OWLEntity> E getErrorEntity(@Nonnull EntityType<E> entityType) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31960);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31961);IRI iri = IRI.create("http://org.semanticweb.owlapi/error#", "Error" + ERRORCOUNTER.incrementAndGet());
        __CLR4_5_2o3to3tlvicmcku.R.inc(31962);LOGGER.error("Entity not properly recognized, missing triples in input? {} for type {}", iri, entityType);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31963);if ((((configuration.isStrict())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31964)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31965)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31966);throw new OWLParserException("Entity not properly recognized, missing triples in input? " + iri
                + " for type " + entityType);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31967);return dataFactory.getOWLEntity(entityType, iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull
    private RDFResource getRDFResource(@Nonnull IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31968);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31969);if ((((isAnonymousNode(iri))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31970)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31971)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31972);return new RDFResourceBlankNode(iri, false, false);
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(31973);return new RDFResourceIRI(iri);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull
    private RDFTriple getRDFTriple(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31974);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31975);return new RDFTriple(getRDFResource(subject), new RDFResourceIRI(predicate), getRDFResource(object));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull
    private RDFTriple getRDFTriple(@Nonnull IRI subject, @Nonnull IRI predicate, @Nonnull OWLLiteral object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31976);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31977);return new RDFTriple(getRDFResource(subject), new RDFResourceIRI(predicate), new RDFLiteral(object));
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Nonnull
    private Set<RDFTriple> getTriplesForMainNode(@Nonnull IRI mainNode, IRI... augmentingTypes) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31978);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31979);Set<RDFTriple> triples = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(31980);for (IRI predicate : getPredicatesBySubject(mainNode)) {{
            assert (((predicate != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31981)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31982)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31983);for (IRI object : getResourceObjects(mainNode, predicate)) {{
                assert (((object != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31984)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31985)==0&false));
                __CLR4_5_2o3to3tlvicmcku.R.inc(31986);triples.add(getRDFTriple(mainNode, predicate, object));
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(31987);for (OWLLiteral object : getLiteralObjects(mainNode, predicate)) {{
                assert (((object != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31988)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31989)==0&false));
                __CLR4_5_2o3to3tlvicmcku.R.inc(31990);triples.add(getRDFTriple(mainNode, predicate, object));
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31991);for (IRI augmentingType : augmentingTypes) {{
            assert (((augmentingType != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(31992)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(31993)==0&false));
            __CLR4_5_2o3to3tlvicmcku.R.inc(31994);triples.add(getRDFTriple(mainNode, OWLRDFVocabulary.RDF_TYPE.getIRI(), augmentingType));
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(31995);return triples;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    private void logError(RDFResourceParseError error) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31996);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31997);ontologyFormat.addError(error);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * @param entityType
     *        entity type
     * @param mainNode
     *        main node
     * @param <E>
     *        entity type
     * @return error entity
     */
    @Nonnull
    public <E extends OWLEntity> E generateAndLogParseError(@Nonnull EntityType<E> entityType, @Nonnull IRI mainNode) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(31998);
        __CLR4_5_2o3to3tlvicmcku.R.inc(31999);E entity = getErrorEntity(entityType);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32000);RDFResource mainNodeResource = getRDFResource(mainNode);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32001);Set<RDFTriple> mainNodeTriples = getTriplesForMainNode(mainNode);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32002);RDFResourceParseError error = new RDFResourceParseError(entity, mainNodeResource, mainNodeTriples);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32003);logError(error);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32004);return entity;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the predicates by subject.
     * 
     * @param subject
     *        the subject
     * @return the predicates by subject
     */
    protected Set<IRI> getPredicatesBySubject(IRI subject) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32005);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32006);Set<IRI> iris = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(32007);Map<IRI, Collection<IRI>> predObjMap = resTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32008);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32009)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32010)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32011);iris.addAll(predObjMap.keySet());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32012);Map<IRI, Collection<OWLLiteral>> predObjMapLit = litTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32013);if ((((predObjMapLit != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32014)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32015)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32016);iris.addAll(predObjMapLit.keySet());
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32017);return iris;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the resource object.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param consume
     *        the consume
     * @return the resource object
     */
    protected IRI getResourceObject(IRI subject, OWLRDFVocabulary predicate, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32018);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32019);return getResourceObject(subject, predicate.getIRI(), consume);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the resource object.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param consume
     *        the consume
     * @return the resource object
     */
    protected IRI getResourceObject(IRI subject, IRI predicate, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32020);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32021);Map<IRI, IRI> subjPredMap = singleValuedResTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32022);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32023)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32024)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32025);IRI obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32026);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32027)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32028)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32029);subjPredMap.remove(subject);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32030);return obj;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32031);Map<IRI, Collection<IRI>> predObjMap = resTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32032);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32033)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32034)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32035);Collection<IRI> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32036);if ((((objects != null && !objects.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32037)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32038)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32039);IRI object = objects.iterator().next();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32040);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32041)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32042)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32043);objects.remove(object);
                }
                // if (objects.isEmpty()) {
                // predObjMap.remove(predicate);
                // if (predObjMap.isEmpty()) {
                // resTriplesBySubject.remove(subject);
                // }
                // }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32044);return object;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32045);return null;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the resource objects.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @return the resource objects
     */
    protected Set<IRI> getResourceObjects(IRI subject, IRI predicate) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32046);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32047);Set<IRI> result = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(32048);Map<IRI, IRI> subjPredMap = singleValuedResTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32049);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32050)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32051)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32052);IRI obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32053);if ((((obj != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32054)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32055)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32056);result.add(obj);
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32057);Map<IRI, Collection<IRI>> predObjMap = resTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32058);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32059)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32060)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32061);Collection<IRI> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32062);if ((((objects != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32063)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32064)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32065);result.addAll(objects);
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32066);return result;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the literal object.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param consume
     *        the consume
     * @return the literal object
     */
    protected OWLLiteral getLiteralObject(IRI subject, OWLRDFVocabulary predicate, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32067);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32068);return getLiteralObject(subject, predicate.getIRI(), consume);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the literal object.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param consume
     *        the consume
     * @return the literal object
     */
    protected OWLLiteral getLiteralObject(IRI subject, IRI predicate, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32069);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32070);Map<IRI, OWLLiteral> subjPredMap = singleValuedLitTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32071);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32072)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32073)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32074);OWLLiteral obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32075);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32076)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32077)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32078);subjPredMap.remove(subject);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32079);return obj;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32080);Map<IRI, Collection<OWLLiteral>> predObjMap = litTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32081);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32082)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32083)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32084);Collection<OWLLiteral> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32085);if ((((objects != null && !objects.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32086)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32087)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32088);OWLLiteral object = objects.iterator().next();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32089);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32090)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32091)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32092);objects.remove(object);
                }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32093);if ((((objects.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32094)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32095)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32096);predObjMap.remove(predicate);
                }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32097);return object;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32098);return null;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the literal objects.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @return the literal objects
     */
    protected Set<OWLLiteral> getLiteralObjects(IRI subject, IRI predicate) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32099);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32100);Set<OWLLiteral> result = new HashSet<>();
        __CLR4_5_2o3to3tlvicmcku.R.inc(32101);Map<IRI, OWLLiteral> subjPredMap = singleValuedLitTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32102);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32103)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32104)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32105);OWLLiteral obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32106);if ((((obj != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32107)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32108)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32109);result.add(obj);
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32110);Map<IRI, Collection<OWLLiteral>> predObjMap = litTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32111);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32112)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32113)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32114);Collection<OWLLiteral> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32115);if ((((objects != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32116)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32117)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32118);result.addAll(objects);
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32119);return result;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is triple present.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     * @param consume
     *        the consume
     * @return true, if is triple present
     */
    protected boolean isTriplePresent(IRI subject, IRI predicate, IRI object, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32120);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32121);Map<IRI, IRI> subjPredMap = singleValuedResTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32122);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32123)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32124)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32125);IRI obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32126);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32127)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32128)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32129);subjPredMap.remove(subject);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32130);return obj != null;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32131);Map<IRI, Collection<IRI>> predObjMap = resTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32132);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32133)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32134)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32135);Collection<IRI> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32136);if ((((objects != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32137)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32138)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32139);if ((((objects.contains(object))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32140)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32141)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32142);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32143)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32144)==0&false))) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(32145);objects.remove(object);
                        // if (objects.isEmpty()) {
                        // predObjMap.remove(predicate);
                        // if (predObjMap.isEmpty()) {
                        // resTriplesBySubject.remove(subject);
                        // }
                        // }
                    }
                    }__CLR4_5_2o3to3tlvicmcku.R.inc(32146);return true;
                }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32147);return false;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32148);return false;// searchGeneralResourceTriples(subject, predicate, object,
                     // consume) != null;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is general predicate.
     * 
     * @param predicate
     *        the predicate
     * @return true, if is general predicate
     */
    protected static boolean isGeneralPredicate(IRI predicate) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32149);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32150);return !predicate.isReservedVocabulary() || OWLRDFVocabulary.BUILT_IN_ANNOTATION_PROPERTY_IRIS.contains(
            predicate) || Namespaces.SWRL.inNamespace(predicate) || Namespaces.SWRLB.inNamespace(predicate);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is triple present.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     * @param consume
     *        the consume
     * @return true, if is triple present
     */
    protected boolean isTriplePresent(IRI subject, IRI predicate, OWLLiteral object, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32151);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32152);Map<IRI, OWLLiteral> subjPredMap = singleValuedLitTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32153);if ((((subjPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32154)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32155)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32156);OWLLiteral obj = subjPredMap.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32157);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32158)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32159)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32160);subjPredMap.remove(subject);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32161);return obj != null;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32162);Map<IRI, Collection<OWLLiteral>> predObjMap = litTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32163);if ((((predObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32164)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32165)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32166);Collection<OWLLiteral> objects = predObjMap.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32167);if ((((objects != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32168)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32169)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32170);if ((((objects.contains(object))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32171)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32172)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32173);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32174)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32175)==0&false))) {{
                        __CLR4_5_2o3to3tlvicmcku.R.inc(32176);objects.remove(object);
                        __CLR4_5_2o3to3tlvicmcku.R.inc(32177);if ((((objects.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32178)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32179)==0&false))) {{
                            __CLR4_5_2o3to3tlvicmcku.R.inc(32180);predObjMap.remove(predicate);
                            __CLR4_5_2o3to3tlvicmcku.R.inc(32181);if ((((predObjMap.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32182)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32183)==0&false))) {{
                                __CLR4_5_2o3to3tlvicmcku.R.inc(32184);litTriplesBySubject.remove(subject);
                            }
                        }}
                    }}
                    }__CLR4_5_2o3to3tlvicmcku.R.inc(32185);return true;
                }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32186);return false;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32187);return false;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks for predicate.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @return true, if successful
     */
    protected boolean hasPredicate(IRI subject, IRI predicate) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32188);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32189);Map<IRI, IRI> resPredMap = singleValuedResTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32190);if ((((resPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32191)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32192)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32193);return resPredMap.containsKey(subject);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32194);Map<IRI, OWLLiteral> litPredMap = singleValuedLitTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32195);if ((((litPredMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32196)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32197)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32198);return litPredMap.containsKey(subject);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32199);Map<IRI, Collection<IRI>> resPredObjMap = resTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32200);if ((((resPredObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32201)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32202)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32203);boolean b = resPredObjMap.containsKey(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32204);if ((((b)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32205)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32206)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32207);return true;
            }
        }}
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32208);Map<IRI, Collection<OWLLiteral>> litPredObjMap = litTriplesBySubject.get(subject);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32209);if ((((litPredObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32210)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32211)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32212);return litPredObjMap.containsKey(predicate);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32213);return false;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the rest.
     * 
     * @param subject
     *        the subject
     * @param object
     *        the object
     */
    protected void addRest(IRI subject, IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32214);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32215);listRestTripleMap.put(subject, object);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the first.
     * 
     * @param subject
     *        the subject
     * @param object
     *        the object
     */
    protected void addFirst(IRI subject, IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32216);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32217);listFirstResourceTripleMap.put(subject, object);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the first resource.
     * 
     * @param subject
     *        the subject
     * @param consume
     *        the consume
     * @return the first resource
     */
    protected IRI getFirstResource(IRI subject, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32218);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32219);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32220)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32221)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32222);return listFirstResourceTripleMap.remove(subject);
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32223);return listFirstResourceTripleMap.get(subject);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the first literal.
     * 
     * @param subject
     *        the subject
     * @return the first literal
     */
    protected OWLLiteral getFirstLiteral(IRI subject) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32224);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32225);return listFirstLiteralTripleMap.get(subject);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the rest.
     * 
     * @param subject
     *        the subject
     * @param consume
     *        the consume
     * @return the rest
     */
    protected IRI getRest(IRI subject, boolean consume) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32226);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32227);if ((((consume)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32228)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32229)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32230);return listRestTripleMap.remove(subject);
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32231);return listRestTripleMap.get(subject);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the first.
     * 
     * @param subject
     *        the subject
     * @param object
     *        the object
     */
    protected void addFirst(IRI subject, OWLLiteral object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32232);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32233);listFirstLiteralTripleMap.put(subject, object);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the ontology.
     * 
     * @param iri
     *        the iri
     */
    protected void addOntology(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32234);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32235);if ((((ontologyIRIs.isEmpty())&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32236)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32237)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32238);firstOntologyIRI = iri;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32239);ontologyIRIs.add(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the ontologies.
     * 
     * @return the ontologies
     */
    protected Set<IRI> getOntologies() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32240);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32241);return ontologyIRIs;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Adds the axiom.
     * 
     * @param axiomIRI
     *        the axiom iri
     */
    protected void addAxiom(IRI axiomIRI) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32242);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32243);axioms.add(axiomIRI);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is axiom.
     * 
     * @param iri
     *        the iri
     * @return true, if is axiom
     */
    protected boolean isAxiom(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32244);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32245);return axioms.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Checks if is data range.
     * 
     * @param iri
     *        the iri
     * @return true, if is data range
     */
    protected boolean isDataRange(IRI iri) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32246);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32247);return dataRangeIRIs.contains(iri);
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Gets the configuration.
     * 
     * @return the configuration
     */
    @Nonnull
    protected OWLOntologyLoaderConfiguration getConfiguration() {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32248);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32249);return configuration;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    // Triple Stuff
    /**
     * Iterate resource triples.
     * 
     * @param iterator
     *        the iterator
     */
    protected void iterateResourceTriples(ResourceTripleIterator iterator) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32250);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32251);for (IRI subject : resTriplesBySubject.keySet()) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32252);Map<IRI, Collection<IRI>> map = resTriplesBySubject.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32253);if ((((map == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32254)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32255)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32256);continue;
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32257);for (IRI predicate : map.keySet()) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32258);Collection<IRI> objects = map.get(predicate);
                __CLR4_5_2o3to3tlvicmcku.R.inc(32259);if ((((objects == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32260)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32261)==0&false))) {{
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32262);continue;
                }
                }__CLR4_5_2o3to3tlvicmcku.R.inc(32263);for (IRI object : objects.toArray(new IRI[objects.size()])) {{
                    assert (((subject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32264)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32265)==0&false));
                    assert (((predicate != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32266)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32267)==0&false));
                    assert (((object != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32268)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32269)==0&false));
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32270);iterator.handleResourceTriple(subject, predicate, object);
                }
            }}
        }}
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /**
     * Iterate literal triples.
     * 
     * @param iterator
     *        the iterator
     */
    protected void iterateLiteralTriples(LiteralTripleIterator iterator) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32271);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32272);for (IRI subject : new ArrayList<>(litTriplesBySubject.keySet())) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32273);Map<IRI, Collection<OWLLiteral>> map = litTriplesBySubject.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32274);if ((((map == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32275)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32276)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32277);continue;
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32278);for (IRI predicate : new ArrayList<>(map.keySet())) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32279);Collection<OWLLiteral> objects = map.get(predicate);
                __CLR4_5_2o3to3tlvicmcku.R.inc(32280);for (OWLLiteral object : new ArrayList<>(objects)) {{
                    assert (((subject != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32281)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32282)==0&false));
                    assert (((predicate != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32283)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32284)==0&false));
                    assert (((object != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32285)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32286)==0&false));
                    __CLR4_5_2o3to3tlvicmcku.R.inc(32287);iterator.handleLiteralTriple(subject, predicate, object);
                }
            }}
        }}
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    /*
     * Originally we had a special Triple class, which was specialised into
     * ResourceTriple and LiteralTriple - this was used to store triples.
     * However, with very large ontologies this proved to be inefficient in
     * terms of memory usage. Now we just store raw subjects, predicates and
     * object directly in varous maps.
     */
    // Resource triples
    /** Subject, predicate, object */
    private final Map<IRI, Map<IRI, Collection<IRI>>> resTriplesBySubject = CollectionFactory.createMap();
    /** Predicate, subject, object */
    private final Map<IRI, Map<IRI, IRI>> singleValuedResTriplesByPredicate = CollectionFactory.createMap();
    /** Literal triples */
    private final Map<IRI, Map<IRI, Collection<OWLLiteral>>> litTriplesBySubject = CollectionFactory.createMap();
    /** Predicate, subject, object */
    private final Map<IRI, Map<IRI, OWLLiteral>> singleValuedLitTriplesByPredicate = CollectionFactory.createMap();
    private final Map<IRI, IRI> remappedIRIs = CollectionFactory.createMap();
    private final Map<String, IRI> remappedIRIStrings = CollectionFactory.createMap();

    @Override
    @Nonnull
    public IRI remapIRI(@Nonnull IRI i) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32288);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32289);if ((((nodeCheckerDelegate.isAnonymousNode(i))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32290)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32291)==0&false))) {{
            // blank nodes do not need to be remapped in this method
            __CLR4_5_2o3to3tlvicmcku.R.inc(32292);return i;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32293);IRI computeIfAbsent = remappedIRIs.get(i);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32294);if ((((computeIfAbsent == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32295)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32296)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32297);computeIfAbsent = IRI.create(NodeID.nextAnonymousIRI());
            __CLR4_5_2o3to3tlvicmcku.R.inc(32298);remappedIRIs.put(i, computeIfAbsent);
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32299);remappedIRIStrings.put(i.toString(), computeIfAbsent);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32300);return computeIfAbsent;
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    @Override
    @Nonnull
    public String remapOnlyIfRemapped(@Nonnull String i) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32301);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32302);if ((((nodeCheckerDelegate.isAnonymousNode(i) || nodeCheckerDelegate.isAnonymousSharedNode(i))&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32303)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32304)==0&false))) {{
            // blank nodes do not need to be remapped in this method
            __CLR4_5_2o3to3tlvicmcku.R.inc(32305);return i;
        }
        }__CLR4_5_2o3to3tlvicmcku.R.inc(32306);IRI iri = remappedIRIStrings.get(i);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32307);return (((iri == null )&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32308)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32309)==0&false))? i : iri.toString();
    }finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    protected void addTriple(IRI subject, IRI predicate, IRI object) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32310);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32311);Map<IRI, IRI> subjObjMap = singleValuedResTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32312);if ((((subjObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32313)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32314)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32315);subjObjMap.put(subject, object);
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32316);Map<IRI, Collection<IRI>> map = resTriplesBySubject.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32317);if ((((map == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32318)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32319)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32320);map = CollectionFactory.createMap();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32321);resTriplesBySubject.put(subject, map);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32322);Collection<IRI> objects = map.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32323);if ((((objects == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32324)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32325)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32326);objects = new HashSet<>();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32327);map.put(predicate, objects);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32328);objects.add(object);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}

    protected void addTriple(IRI subject, IRI predicate, OWLLiteral con) {try{__CLR4_5_2o3to3tlvicmcku.R.inc(32329);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32330);Map<IRI, OWLLiteral> subjObjMap = singleValuedLitTriplesByPredicate.get(predicate);
        __CLR4_5_2o3to3tlvicmcku.R.inc(32331);if ((((subjObjMap != null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32332)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32333)==0&false))) {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32334);subjObjMap.put(subject, con);
        } }else {{
            __CLR4_5_2o3to3tlvicmcku.R.inc(32335);Map<IRI, Collection<OWLLiteral>> map = litTriplesBySubject.get(subject);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32336);if ((((map == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32337)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32338)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32339);map = CollectionFactory.createMap();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32340);litTriplesBySubject.put(subject, map);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32341);Collection<OWLLiteral> objects = map.get(predicate);
            __CLR4_5_2o3to3tlvicmcku.R.inc(32342);if ((((objects == null)&&(__CLR4_5_2o3to3tlvicmcku.R.iget(32343)!=0|true))||(__CLR4_5_2o3to3tlvicmcku.R.iget(32344)==0&false))) {{
                __CLR4_5_2o3to3tlvicmcku.R.inc(32345);objects = new HashSet<>();
                __CLR4_5_2o3to3tlvicmcku.R.inc(32346);map.put(predicate, objects);
            }
            }__CLR4_5_2o3to3tlvicmcku.R.inc(32347);objects.add(con);
        }
    }}finally{__CLR4_5_2o3to3tlvicmcku.R.flushNeeded();}}
}
