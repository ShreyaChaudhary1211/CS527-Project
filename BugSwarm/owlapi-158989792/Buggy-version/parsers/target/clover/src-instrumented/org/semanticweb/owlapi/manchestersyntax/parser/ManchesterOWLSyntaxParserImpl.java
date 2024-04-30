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
package org.semanticweb.owlapi.manchestersyntax.parser;

import static org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.*;
import static org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntaxTokenizer.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;

import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.OWLOntologyChecker;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntaxTokenizer.Token;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.NamespaceUtil;
import org.semanticweb.owlapi.util.OntologyAxiomPair;
import org.semanticweb.owlapi.util.RemappingIndividualProvider;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

import com.google.common.base.Optional;

/**
 * A parser for the Manchester OWL Syntax. All properties must be defined before
 * they are used. For example, consider the restriction hasPart some Leg. The
 * parser must know in advance whether or not hasPart is an object property or a
 * data property so that Leg gets parsed correctly. In a tool, such as an
 * editor, it is expected that hasPart will already exists as either a data
 * property or an object property. If a complete ontology is being parsed, it is
 * expected that hasPart will have been defined at the top of the file before it
 * is used in any class expressions or property assertions (e.g. ObjectProperty:
 * hasPart)
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class ManchesterOWLSyntaxParserImpl implements
    ManchesterOWLSyntaxParser {public static class __CLR4_5_2hsphsplvicmbnw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,25689,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // This parser was built by hand! After struggling with terrible
    // error messages produced by ANTLR (or JavaCC) I decides to construct
    // this parser by hand. The error messages that this parser generates
    // are specific to the Manchester OWL Syntax and are such that it should
    // be easy to use this parser in tools such as editors.
    @Nonnull
    private Provider<OWLOntologyLoaderConfiguration> configProvider;
    @Nonnull
    private Optional<OWLOntologyLoaderConfiguration> config = Optional.absent();
    protected OWLDataFactory dataFactory;
    private List<Token> tokens;
    private int tokenIndex;
    private OWLEntityChecker owlEntityChecker;
    private OWLOntologyChecker owlOntologyChecker = new OWLOntologyChecker() {

        @Nullable
        @Override
        public OWLOntology getOntology(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23065);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23066);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    };
    @Nonnull
    protected final Set<String> classNames = new HashSet<>();
    @Nonnull
    protected final Set<String> objectPropertyNames = new HashSet<>();
    @Nonnull
    protected final Set<String> dataPropertyNames = new HashSet<>();
    @Nonnull
    protected final Set<String> individualNames = new HashSet<>();
    @Nonnull
    protected final Set<String> dataTypeNames = new HashSet<>();
    @Nonnull
    protected final Set<String> annotationPropertyNames = new HashSet<>();
    @Nonnull
    private final Map<String, SWRLBuiltInsVocabulary> ruleBuiltIns = new HashMap<>();
    @Nonnull
    protected DefaultPrefixManager pm = new DefaultPrefixManager();
    @Nonnull
    protected final Set<ManchesterOWLSyntax> potentialKeywords = new HashSet<>();
    private OWLOntology defaultOntology;
    private final boolean allowEmptyFrameSections = false;
    private final Map<ManchesterOWLSyntax, AnnotatedListItemParser<OWLDataProperty, ?>> dataPropertyFrameSections = new EnumMap<>(
        ManchesterOWLSyntax.class);
    protected RemappingIndividualProvider anonProvider;

    /**
     * @param configurationProvider
     *        configuration provider
     * @param dataFactory
     *        dataFactory
     */
    @Inject
    public ManchesterOWLSyntaxParserImpl(
        @Nonnull Provider<OWLOntologyLoaderConfiguration> configurationProvider,
        @Nonnull OWLDataFactory dataFactory) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23067);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23068);configProvider = configurationProvider;
        __CLR4_5_2hsphsplvicmbnw.R.inc(23069);this.dataFactory = dataFactory;
        __CLR4_5_2hsphsplvicmbnw.R.inc(23070);anonProvider = new RemappingIndividualProvider(this.dataFactory);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23071);pm.setPrefix("rdf:", Namespaces.RDF.toString());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23072);pm.setPrefix("rdfs:", Namespaces.RDFS.toString());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23073);pm.setPrefix("owl:", Namespaces.OWL.toString());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23074);pm.setPrefix("dc:", DublinCoreVocabulary.NAME_SPACE);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23075);NamespaceUtil u = new NamespaceUtil();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23076);initialiseClassFrameSections();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23077);initialiseObjectPropertyFrameSections();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23078);initialiseDataPropertyFrameSections();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23079);initialiseAnnotationPropertyFrameSections();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23080);initialiseIndividualFrameSections();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23081);for (XSDVocabulary v : XSDVocabulary.values()) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23082);dataTypeNames.add(v.getIRI().toString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23083);dataTypeNames.add(v.getIRI().toQuotedString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23084);dataTypeNames.add(v.getPrefixedName());
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23085);for (OWL2Datatype v : OWL2Datatype.values()) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23086);dataTypeNames.add(v.getIRI().toString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23087);dataTypeNames.add(v.getIRI().toQuotedString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23088);dataTypeNames.add(v.getPrefixedName());
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23089);dataTypeNames.add(OWLRDFVocabulary.RDFS_LITERAL.getPrefixedName());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23090);dataTypeNames.add(OWLRDFVocabulary.RDF_XML_LITERAL.getShortForm());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23091);dataTypeNames.add(OWLRDFVocabulary.RDF_XML_LITERAL.getPrefixedName());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23092);for (IRI iri : OWLRDFVocabulary.BUILT_IN_ANNOTATION_PROPERTY_IRIS) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23093);String string = iri.toString();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23094);String ns = XMLUtils.getNCNamePrefix(string);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23095);String fragment = XMLUtils.getNCNameSuffix(string);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23096);annotationPropertyNames.add(u.getPrefix(ns) + ':'
                + ((((fragment != null )&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23097)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23098)==0&false))? fragment : ""));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23099);owlEntityChecker = new DefaultEntityChecker();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23100);for (SWRLBuiltInsVocabulary v : SWRLBuiltInsVocabulary.values()) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23101);ruleBuiltIns.put(v.getShortForm(), v);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23102);ruleBuiltIns.put(v.getIRI().toQuotedString(), v);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    @Nonnull
    public OWLOntologyLoaderConfiguration getOntologyLoaderConfiguration() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23103);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23104);if ((((config.isPresent())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23105)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23106)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23107);return config.get();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23108);config = Optional.of(configProvider.get());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23109);return config.get();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setOntologyLoaderConfigurationProvider(
        Provider<OWLOntologyLoaderConfiguration> provider) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23110);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23111);configProvider = provider;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setOntologyLoaderConfiguration(
        OWLOntologyLoaderConfiguration config) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23112);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23113);this.config = Optional.fromNullable(config);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setStringToParse(String s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23114);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23115);tokens = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23116);tokens.addAll(getTokenizer(s).tokenize());
        __CLR4_5_2hsphsplvicmbnw.R.inc(23117);tokenIndex = 0;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    protected static ManchesterOWLSyntaxTokenizer getTokenizer(String s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23118);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23119);return new ManchesterOWLSyntaxTokenizer(s);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private final Map<ManchesterOWLSyntax, AnnotatedListItemParser<OWLClass, ?>> classFrameSections = new EnumMap<>(
        ManchesterOWLSyntax.class);

    private void initialiseClassFrameSections() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23120);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23121);initialiseSection(new EntityAnnotationsListItemParser<OWLClass>(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23122);initialiseSection(new ClassSubClassOfListItemParser(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23123);initialiseSection(new ClassEquivalentToListItemParser(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23124);initialiseSection(new ClassDisjointWithListItemParser(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23125);initialiseSection(new ClassHasKeyListItemParser(), classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23126);initialiseSection(new ClassDisjointUnionOfListItemParser(),
            classFrameSections);
        // Extensions
        __CLR4_5_2hsphsplvicmbnw.R.inc(23127);initialiseSection(new ClassSuperClassOfListItemParser(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23128);initialiseSection(new ClassDisjointClassesListItemParser(),
            classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23129);initialiseSection(new ClassIndividualsListItemParser(),
            classFrameSections);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private final Map<ManchesterOWLSyntax, AnnotatedListItemParser<OWLObjectProperty, ?>> objectPropertyFrameSections = new EnumMap<>(
        ManchesterOWLSyntax.class);

    private void initialiseObjectPropertyFrameSections() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23130);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23131);initialiseSection(
            new EntityAnnotationsListItemParser<OWLObjectProperty>(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23132);initialiseSection(new ObjectPropertySubPropertyOfListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23133);initialiseSection(new ObjectPropertyEquivalentToListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23134);initialiseSection(new ObjectPropertyDisjointWithListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23135);initialiseSection(new ObjectPropertyDomainListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23136);initialiseSection(new ObjectPropertyRangeListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23137);initialiseSection(new ObjectPropertyInverseOfListItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23138);initialiseSection(new ObjectPropertyCharacteristicsItemParser(),
            objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23139);initialiseSection(new ObjectPropertySubPropertyChainListItemParser(),
            objectPropertyFrameSections);
        // Extensions
        __CLR4_5_2hsphsplvicmbnw.R.inc(23140);initialiseSection(new ObjectPropertySuperPropertyOfListItemParser(),
            objectPropertyFrameSections);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private void initialiseDataPropertyFrameSections() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23141);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23142);initialiseSection(new DataPropertySubPropertyOfListItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23143);initialiseSection(new DataPropertyEquivalentToListItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23144);initialiseSection(new DataPropertyDisjointWithListItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23145);initialiseSection(new DataPropertyDomainListItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23146);initialiseSection(new DataPropertyRangeListItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23147);initialiseSection(new DataPropertyCharacteristicsItemParser(),
            dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23148);initialiseSection(
            new EntityAnnotationsListItemParser<OWLDataProperty>(),
            dataPropertyFrameSections);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private final Map<ManchesterOWLSyntax, AnnotatedListItemParser<OWLAnnotationProperty, ?>> annotationPropertyFrameSections = new EnumMap<>(
        ManchesterOWLSyntax.class);

    private void initialiseAnnotationPropertyFrameSections() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23149);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23150);initialiseSection(new AnnotationPropertySubPropertyOfListItemParser(),
            annotationPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23151);initialiseSection(new AnnotationPropertyDomainListItemParser(),
            annotationPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23152);initialiseSection(new AnnotationPropertyRangeListItemParser(),
            annotationPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23153);initialiseSection(
            new EntityAnnotationsListItemParser<OWLAnnotationProperty>(),
            annotationPropertyFrameSections);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private final Map<ManchesterOWLSyntax, AnnotatedListItemParser<OWLIndividual, ?>> individualFrameSections = new EnumMap<>(
        ManchesterOWLSyntax.class);

    private void initialiseIndividualFrameSections() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23154);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23155);initialiseSection(new IndividualAnnotationItemParser(),
            individualFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23156);initialiseSection(new IndividualTypesItemParser(),
            individualFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23157);initialiseSection(new IndividualFactsItemParser(),
            individualFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23158);initialiseSection(new IndividualSameAsItemParser(),
            individualFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23159);initialiseSection(new IndividualDifferentFromItemParser(),
            individualFrameSections);
        // Extensions
        __CLR4_5_2hsphsplvicmbnw.R.inc(23160);initialiseSection(new IndividualDifferentIndividualsItemParser(),
            individualFrameSections);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setOWLEntityChecker(OWLEntityChecker owlEntityChecker) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23161);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23162);this.owlEntityChecker = owlEntityChecker;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isOntologyName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23163);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23164);return owlOntologyChecker.getOntology(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isClassName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23165);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23166);return classNames.contains(name) || owlEntityChecker != null
            && owlEntityChecker.getOWLClass(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLOntology getOntology(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23167);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23168);return owlOntologyChecker.getOntology(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setOWLOntologyChecker(
        @Nonnull OWLOntologyChecker owlOntologyChecker) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23169);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23170);this.owlOntologyChecker = owlOntologyChecker;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isObjectPropertyName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23171);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23172);return objectPropertyNames.contains(name) || owlEntityChecker != null
            && owlEntityChecker.getOWLObjectProperty(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isAnnotationPropertyName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23173);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23174);return annotationPropertyNames.contains(name)
            || owlEntityChecker != null && owlEntityChecker
                .getOWLAnnotationProperty(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isDataPropertyName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23175);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23176);return dataPropertyNames.contains(name) || owlEntityChecker != null
            && owlEntityChecker.getOWLDataProperty(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isIndividualName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23177);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23178);return individualNames.contains(name) || owlEntityChecker != null
            && owlEntityChecker.getOWLIndividual(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isDatatypeName(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23179);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23180);return dataTypeNames.contains(name) || owlEntityChecker != null
            && owlEntityChecker.getOWLDatatype(name) != null;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isSWRLBuiltin(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23181);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23182);return ruleBuiltIns.containsKey(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLClass getOWLClass(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23183);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23184);OWLClass cls = owlEntityChecker.getOWLClass(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23185);if ((((cls == null && classNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23186)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23187)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23188);cls = dataFactory.getOWLClass(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23189);if ((((cls == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23190)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23191)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23192);throw new ExceptionBuilder().withKeyword(potentialKeywords)
                .withClass().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23193);return cls;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLObjectProperty getOWLObjectProperty(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23194);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23195);OWLObjectProperty prop = owlEntityChecker.getOWLObjectProperty(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23196);if ((((prop == null && objectPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23197)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23198)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23199);prop = dataFactory.getOWLObjectProperty(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23200);if ((((prop == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23201)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23202)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23203);throw new ExceptionBuilder().withObject().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23204);return prop;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLIndividual getOWLIndividual(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23205);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23206);if ((((name.startsWith("_:"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23207)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23208)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23209);return anonProvider.getOWLAnonymousIndividual(name);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23210);return getOWLNamedIndividual(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLNamedIndividual getOWLNamedIndividual(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23211);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23212);OWLNamedIndividual ind = owlEntityChecker.getOWLIndividual(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23213);if ((((ind == null && individualNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23214)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23215)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23216);ind = dataFactory.getOWLNamedIndividual(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23217);if ((((ind == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23218)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23219)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23220);throw new ExceptionBuilder().withInd().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23221);return ind;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataProperty getOWLDataProperty(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23222);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23223);OWLDataProperty prop = owlEntityChecker.getOWLDataProperty(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23224);if ((((prop == null && dataPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23225)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23226)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23227);prop = dataFactory.getOWLDataProperty(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23228);if ((((prop == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23229)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23230)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23231);throw new ExceptionBuilder().withData().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23232);return prop;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDatatype getOWLDatatype(@Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23233);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23234);OWLDatatype dt = owlEntityChecker.getOWLDatatype(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23235);if ((((dt == null && dataTypeNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23236)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23237)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23238);dt = dataFactory.getOWLDatatype(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23239);if ((((dt == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23240)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23241)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23242);throw new ExceptionBuilder().withDt().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23243);return dt;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAnnotationProperty getOWLAnnotationProperty(
        @Nonnull String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23244);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23245);OWLAnnotationProperty prop = owlEntityChecker.getOWLAnnotationProperty(
            name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23246);if ((((prop == null && annotationPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23247)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23248)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23249);prop = dataFactory.getOWLAnnotationProperty(getIRI(name));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23250);if ((((prop == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23251)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23252)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23253);throw new ExceptionBuilder().withAnn().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23254);return prop;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    protected Token getLastToken() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23255);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23256);if ((((tokenIndex - 1 > -1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23257)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23258)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23259);return tokens.get(tokenIndex - 1);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23260);return tokens.get(0);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private String peekToken() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23261);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23262);return getToken().getToken();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private String consumeToken() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23263);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23264);String token = getToken().getToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23265);if ((((tokenIndex < tokens.size())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23266)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23267)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23268);tokenIndex++;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23269);return token;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private void consumeToken(String expected) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23270);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23271);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23272);if ((((!tok.equals(expected))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23273)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23274)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23275);throw new ExceptionBuilder().withKeyword(expected).build();
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private void consumeToken(ManchesterOWLSyntax expected) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23276);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23277);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23278);if ((((!expected.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23279)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23280)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23281);throw new ExceptionBuilder().withKeyword(expected).build();
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Token getToken() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23282);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23283);return tokens.get((((tokenIndex < tokens.size() )&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23284)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23285)==0&false))? tokenIndex
            : tokenIndex - 1);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    /* Parser */
    @Nonnull
    @Override
    public OWLClassExpression parseClassExpression() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23286);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23287);OWLClassExpression desc = parseUnion();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23288);if ((((!eof(consumeToken()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23289)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23290)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23291);throw new ExceptionBuilder().withKeyword(EOF).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23292);return desc;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public OWLClassExpression parseClassExpression(String s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23293);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23294);setStringToParse(s);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23295);return parseClassExpression();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    protected OWLClassExpression parseIntersection() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23296);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23297);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23298);String kw = AND.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23299);while ((((AND.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23300)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23301)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23302);potentialKeywords.remove(AND);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23303);ops.add(parseNonNaryClassExpression());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23304);potentialKeywords.add(AND);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23305);kw = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23306);if ((((AND.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23307)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23308)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23309);kw = consumeToken();
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23310);if ((((THAT.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23311)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23312)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23313);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23314);kw = AND.keyword();
            }
        }}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23315);if ((((ops.size() == 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23316)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23317)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23318);return ops.iterator().next();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23319);return dataFactory.getOWLObjectIntersectionOf(ops);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLClassExpression parseUnion() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23320);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23321);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23322);String kw = OR.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23323);while ((((OR.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23324)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23325)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23326);potentialKeywords.remove(OR);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23327);ops.add(parseIntersection());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23328);potentialKeywords.add(OR);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23329);kw = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23330);if ((((OR.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23331)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23332)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23333);kw = consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23334);if ((((ops.size() == 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23335)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23336)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23337);return ops.iterator().next();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23338);return dataFactory.getOWLObjectUnionOf(ops);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLObjectPropertyExpression parseObjectPropertyExpression(
        boolean allowUndeclared) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23339);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23340);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23341);if ((((INVERSE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23342)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23343)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23344);String open = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23345);boolean brackets = false;
            __CLR4_5_2hsphsplvicmbnw.R.inc(23346);if ((((OPEN.matches(open))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23347)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23348)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23349);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23350);brackets = true;
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23351);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23352);if ((((brackets)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23353)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23354)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23355);String close = consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23356);if ((((!CLOSE.matches(close))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23357)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23358)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23359);throw new ExceptionBuilder().withKeyword(CLOSE).build();
                }
            }}
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23360);return dataFactory.getOWLObjectInverseOf(prop);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23361);if ((((!allowUndeclared && !isObjectPropertyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23362)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23363)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23364);throw new ExceptionBuilder().withObject().build();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23365);return getOWLObjectProperty(tok);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLPropertyExpression parsePropertyExpression() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23366);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23367);String tok = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23368);if ((((isObjectPropertyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23369)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23370)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23371);return parseObjectPropertyExpression(false);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23372);if ((((INVERSE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23373)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23374)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23375);return parseObjectPropertyExpression(false);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23376);if ((((isDataPropertyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23377)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23378)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23379);return parseDataProperty();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23380);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23381);throw new ExceptionBuilder().withObject().withData().build();
        }
    }}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    /**
     * Parses all class expressions except ObjectIntersectionOf and
     * ObjectUnionOf.
     * 
     * @return The class expression which was parsed @ * if a non-nary class
     *         expression could not be parsed
     */
    private OWLClassExpression parseNonNaryClassExpression() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23382);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23383);String tok = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23384);if ((((NOT.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23385)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23386)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23387);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23388);OWLClassExpression complemented = parseNestedClassExpression(false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23389);return dataFactory.getOWLObjectComplementOf(complemented);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23390);if ((((isObjectPropertyName(tok) || INVERSE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23391)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23392)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23393);return parseObjectRestriction();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23394);if ((((isDataPropertyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23395)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23396)==0&false))) {{
            // Data restriction
            __CLR4_5_2hsphsplvicmbnw.R.inc(23397);return parseDataRestriction();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23398);if ((((OPENBRACE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23399)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23400)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23401);return parseObjectOneOf();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23402);if ((((OPEN.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23403)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23404)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23405);return parseNestedClassExpression(false);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23406);if ((((isClassName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23407)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23408)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23409);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23410);return getOWLClass(tok);
        }
        // Add option for strict class name checking
        }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23411);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23412);throw new ExceptionBuilder().withClass().withObject().withData()
                .withKeyword(OPEN, OPENBRACE, NOT, INVERSE).build();
        }
    }}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLClassExpression parseObjectRestriction() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23413);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23414);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23415);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23416);if ((((SOME.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23417)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23418)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23419);String possSelfToken = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23420);if ((((SELF.matches(possSelfToken))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23421)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23422)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23423);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23424);return dataFactory.getOWLObjectHasSelf(prop);
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23425);OWLClassExpression filler = null;
                __CLR4_5_2hsphsplvicmbnw.R.inc(23426);try {
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23427);filler = parseNestedClassExpression(false);
                } catch (ParserException e) {
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23428);e.getExpectedKeywords().add(SELF.keyword());
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23429);throw e;
                }
                __CLR4_5_2hsphsplvicmbnw.R.inc(23430);return dataFactory.getOWLObjectSomeValuesFrom(prop, filler);
            }
        }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23431);if ((((ONLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23432)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23433)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23434);OWLClassExpression filler = parseNestedClassExpression(false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23435);return dataFactory.getOWLObjectAllValuesFrom(prop, filler);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23436);if ((((VALUE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23437)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23438)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23439);String indName = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23440);if ((((!isIndividualName(indName))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23441)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23442)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23443);throw new ExceptionBuilder().withInd().build();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23444);return dataFactory.getOWLObjectHasValue(prop, getOWLIndividual(
                indName));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23445);if ((((MIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23446)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23447)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23448);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23449);OWLClassExpression filler = parseNestedClassExpression(true);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23450);return dataFactory.getOWLObjectMinCardinality(card, prop, filler);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23451);if ((((MAX.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23452)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23453)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23454);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23455);OWLClassExpression filler = parseNestedClassExpression(true);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23456);return dataFactory.getOWLObjectMaxCardinality(card, prop, filler);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23457);if ((((EXACTLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23458)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23459)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23460);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23461);OWLClassExpression filler = parseNestedClassExpression(true);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23462);return dataFactory.getOWLObjectExactCardinality(card, prop, filler);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23463);if ((((ONLYSOME.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23464)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23465)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23466);String tok = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23467);Set<OWLClassExpression> descs = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23468);if ((((!OPENBRACKET.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23469)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23470)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23471);descs.add(parseUnion());
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23472);descs.addAll(parseClassExpressionList(OPENBRACKET,
                    CLOSEBRACKET));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23473);Set<OWLClassExpression> ops = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23474);for (OWLClassExpression desc : descs) {{
                assert (((desc != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23475)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23476)==0&false));
                __CLR4_5_2hsphsplvicmbnw.R.inc(23477);ops.add(dataFactory.getOWLObjectSomeValuesFrom(prop, desc));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23478);OWLClassExpression filler;
            __CLR4_5_2hsphsplvicmbnw.R.inc(23479);if ((((descs.size() == 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23480)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23481)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23482);filler = descs.iterator().next();
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23483);filler = dataFactory.getOWLObjectUnionOf(descs);
            }
            }assert (((filler != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23484)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23485)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(23486);ops.add(dataFactory.getOWLObjectAllValuesFrom(prop, filler));
            __CLR4_5_2hsphsplvicmbnw.R.inc(23487);return dataFactory.getOWLObjectIntersectionOf(ops);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23488);if ((((SELF.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23489)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23490)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23491);return dataFactory.getOWLObjectHasSelf(prop);
        } }else {{
            // Error!
            __CLR4_5_2hsphsplvicmbnw.R.inc(23492);throw new ExceptionBuilder().withKeyword(SOME, ONLY, VALUE, MIN,
                MAX, EXACTLY, SELF).build();
        }
    }}}}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLClassExpression parseDataRestriction() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23493);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23494);OWLDataPropertyExpression prop = parseDataProperty();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23495);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23496);if ((((SOME.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23497)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23498)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23499);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23500);return dataFactory.getOWLDataSomeValuesFrom(prop, rng);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23501);if ((((ONLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23502)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23503)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23504);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23505);return dataFactory.getOWLDataAllValuesFrom(prop, rng);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23506);if ((((VALUE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23507)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23508)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23509);OWLLiteral con = parseLiteral(null);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23510);return dataFactory.getOWLDataHasValue(prop, con);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23511);if ((((MIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23512)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23513)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23514);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23515);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23516);return dataFactory.getOWLDataMinCardinality(card, prop, rng);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23517);if ((((EXACTLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23518)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23519)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23520);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23521);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23522);return dataFactory.getOWLDataExactCardinality(card, prop, rng);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23523);if ((((MAX.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23524)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23525)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23526);int card = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23527);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23528);return dataFactory.getOWLDataMaxCardinality(card, prop, rng);
        }
        }}}}}}__CLR4_5_2hsphsplvicmbnw.R.inc(23529);throw new ExceptionBuilder().withKeyword(SOME, ONLY, VALUE, MIN,
            EXACTLY, MAX).build();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLFacet parseFacet() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23530);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23531);String facet = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23532);if ((((MIN_INCLUSIVE_FACET.matches(facet, peekToken()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23533)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23534)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23535);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23536);return OWLFacet.MIN_INCLUSIVE;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23537);if ((((MAX_INCLUSIVE_FACET.matches(facet, peekToken()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23538)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23539)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23540);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23541);return OWLFacet.MAX_INCLUSIVE;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23542);if ((((MIN_EXCLUSIVE_FACET.matches(facet))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23543)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23544)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23545);return OWLFacet.MIN_EXCLUSIVE;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23546);if ((((MAX_EXCLUSIVE_FACET.matches(facet))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23547)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23548)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23549);return OWLFacet.MAX_EXCLUSIVE;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23550);return OWLFacet.getFacetBySymbolicName(facet);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDatatype parseDatatype() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23551);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23552);String name = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23553);return getOWLDatatype(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public OWLDataRange parseDataRange() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23554);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23555);return parseDataIntersectionOf();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataRange parseDataIntersectionOf() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23556);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23557);String sep = AND.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23558);Set<OWLDataRange> ranges = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23559);while ((((AND.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23560)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23561)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23562);ranges.add(parseDataUnionOf());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23563);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23564);if ((((AND.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23565)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23566)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23567);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23568);if ((((ranges.isEmpty())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23569)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23570)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23571);return dataFactory.getTopDatatype();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23572);if ((((ranges.size() == 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23573)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23574)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23575);return ranges.iterator().next();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23576);return dataFactory.getOWLDataIntersectionOf(ranges);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private OWLDataRange parseDataUnionOf() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23577);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23578);String sep = OR.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23579);Set<OWLDataRange> ranges = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23580);while ((((OR.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23581)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23582)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23583);ranges.add(parseDataRangePrimary());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23584);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23585);if ((((OR.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23586)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23587)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23588);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23589);if ((((ranges.size() == 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23590)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23591)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23592);return ranges.iterator().next();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23593);return dataFactory.getOWLDataUnionOf(ranges);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataRange parseDataRangePrimary() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23594);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23595);String tok = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23596);if ((((isDatatypeName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23597)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23598)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23599);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23600);OWLDatatype datatype = getOWLDatatype(tok);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23601);String next = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23602);if ((((OPENBRACKET.matches(next))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23603)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23604)==0&false))) {{
                // Restricted data range
                __CLR4_5_2hsphsplvicmbnw.R.inc(23605);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23606);String sep = COMMA.keyword();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23607);Set<OWLFacetRestriction> facetRestrictions = new HashSet<>();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23608);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23609)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23610)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23611);OWLFacet fv = parseFacet();
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23612);if ((((fv == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23613)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23614)==0&false))) {{
                        __CLR4_5_2hsphsplvicmbnw.R.inc(23615);throw new ExceptionBuilder().withKeyword(OWLFacet
                            .getFacets()).build();
                    }
                    }__CLR4_5_2hsphsplvicmbnw.R.inc(23616);OWLLiteral con = parseLiteral(datatype);
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23617);facetRestrictions.add(dataFactory.getOWLFacetRestriction(fv,
                        con));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23618);sep = consumeToken();
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(23619);if ((((!CLOSEBRACKET.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23620)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23621)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23622);throw new ExceptionBuilder().withKeyword(CLOSEBRACKET)
                        .build();
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(23623);return dataFactory.getOWLDatatypeRestriction(datatype,
                    facetRestrictions);
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23624);return datatype;
            }
        }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23625);if ((((NOT.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23626)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23627)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23628);return parseDataComplementOf();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23629);if ((((OPENBRACE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23630)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23631)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23632);return parseDataOneOf();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23633);if ((((OPEN.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23634)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23635)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23636);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23637);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23638);consumeToken(CLOSE.keyword());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23639);return rng;
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23640);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23641);throw new ExceptionBuilder().withDt().withKeyword(OPENBRACE, NOT)
                .build();
        }
    }}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLDataRange> parseDataRangeList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23642);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23643);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23644);Set<OWLDataRange> ranges = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23645);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23646)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23647)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23648);potentialKeywords.remove(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23649);OWLDataRange rng = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23650);ranges.add(rng);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23651);potentialKeywords.add(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23652);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23653);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23654)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23655)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23656);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23657);return ranges;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataRange parseDataOneOf() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23658);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23659);consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23660);Set<OWLLiteral> cons = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23661);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23662);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23663)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23664)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23665);OWLLiteral con = parseLiteral(null);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23666);cons.add(con);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23667);sep = consumeToken();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23668);if ((((!CLOSEBRACE.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23669)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23670)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23671);throw new ExceptionBuilder().withKeyword(COMMA, CLOSEBRACE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23672);return dataFactory.getOWLDataOneOf(cons);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataRange parseDataComplementOf() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23673);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23674);String not = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23675);if ((((!NOT.matches(not))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23676)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23677)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23678);throw new ExceptionBuilder().withKeyword(NOT).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23679);OWLDataRange complementedDataRange = parseDataRangePrimary();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23680);return dataFactory.getOWLDataComplementOf(complementedDataRange);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLLiteral parseLiteral(OWLDatatype datatype) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23681);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23682);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23683);if ((((tok.startsWith("\""))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23684)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23685)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23686);@Nonnull
            String lit = unquoteLiteral(tok);
            __CLR4_5_2hsphsplvicmbnw.R.inc(23687);if ((((peekToken().equals("^"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23688)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23689)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23690);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23691);if ((((!peekToken().equals("^"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23692)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23693)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23694);throw new ExceptionBuilder().withKeyword("^").build();
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(23695);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23696);return dataFactory.getOWLLiteral(lit, parseDatatype());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23697);if ((((peekToken().startsWith("@"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23698)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23699)==0&false))) {{
                // Plain literal with a language tag
                __CLR4_5_2hsphsplvicmbnw.R.inc(23700);String lang = consumeToken().substring(1);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23701);return dataFactory.getOWLLiteral(lit, lang);
            } }else {{
                // Plain literal without a language tag
                __CLR4_5_2hsphsplvicmbnw.R.inc(23702);return dataFactory.getOWLLiteral(lit, "");
            }
        }}} }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23703);if ((((datatype != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23704)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23705)==0&false))) {{
                // datatype is known from context
                __CLR4_5_2hsphsplvicmbnw.R.inc(23706);return dataFactory.getOWLLiteral(tok, datatype);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23707);try {
                __CLR4_5_2hsphsplvicmbnw.R.inc(23708);int i = Integer.parseInt(tok);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23709);return dataFactory.getOWLLiteral(i);
            } catch (@SuppressWarnings("unused") NumberFormatException e) {
                // Ignore - not interested
            }
            __CLR4_5_2hsphsplvicmbnw.R.inc(23710);if ((((tok.endsWith("f") || tok.endsWith("F"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23711)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23712)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23713);try {
                    // XXX this extra F might qualify as Float a Double INF/-INF
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23714);float f = Float.parseFloat(tok.replace("INF", "Infinity")
                        .replace("inf", "Infinity"));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23715);return dataFactory.getOWLLiteral(asFloat(f),
                        OWL2Datatype.XSD_FLOAT);
                } catch (@SuppressWarnings("unused") NumberFormatException e) {
                    // Ignore - not interested
                }
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23716);try {
                // ensure it's a valid double, or skip
                __CLR4_5_2hsphsplvicmbnw.R.inc(23717);Double.parseDouble(tok);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23718);return dataFactory.getOWLLiteral(tok, OWL2Datatype.XSD_DECIMAL);
            } catch (@SuppressWarnings("unused") NumberFormatException e) {
                // Ignore - not interested
            }
            __CLR4_5_2hsphsplvicmbnw.R.inc(23719);if ((((LITERAL_TRUE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23720)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23721)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23722);return dataFactory.getOWLLiteral(true);
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23723);if ((((LITERAL_FALSE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23724)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23725)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23726);return dataFactory.getOWLLiteral(false);
            }
        }}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23727);throw new ExceptionBuilder().withKeyword(LITERAL_TRUE, LITERAL_FALSE,
            LITERAL_INTEGER, LITERAL_FLOAT, LITERAL_DOUBLE, LITERAL_LITERAL,
            LITERAL_LIT_DATATYPE, LITERAL_LIT_LANG).build();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private String unquoteLiteral(String tok) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23728);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23729);String lit = "";
        __CLR4_5_2hsphsplvicmbnw.R.inc(23730);if ((((!tok.endsWith("\""))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23731)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23732)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23733);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23734);throw new ExceptionBuilder().withKeyword("\"").build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23735);if ((((tok.length() > 2)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23736)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23737)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23738);lit = tok.substring(1, tok.length() - 1);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23739);return verifyNotNull(lit);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private static String asFloat(float f) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23740);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23741);return Float.toString(f).replace("Infinity", "INF");
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private int parseInteger() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23742);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23743);String i = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23744);try {
            __CLR4_5_2hsphsplvicmbnw.R.inc(23745);return Integer.parseInt(i);
        } catch (@SuppressWarnings("unused") NumberFormatException e) {
            __CLR4_5_2hsphsplvicmbnw.R.inc(23746);throw new ExceptionBuilder().withInt().build();
        }
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLClassExpression parseNestedClassExpression(
        boolean lookaheadCheck) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23747);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23748);String tok = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23749);if ((((OPEN.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23750)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23751)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23752);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23753);OWLClassExpression desc = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23754);String closeBracket = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23755);if ((((!CLOSE.matches(closeBracket))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23756)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23757)==0&false))) {{
                // Error!
                __CLR4_5_2hsphsplvicmbnw.R.inc(23758);throw new ExceptionBuilder().withKeyword(CLOSE).build();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23759);return desc;
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23760);if ((((OPENBRACE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23761)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23762)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23763);return parseObjectOneOf();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23764);if ((((isClassName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23765)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23766)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23767);String name = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23768);return getOWLClass(name);
        }
        // XXX problem: if the class expression is missing, we should return
        // owl:Thing. But there are many ways in which it could be missing. Hard
        // to tell what sort of lookahead is needed.
        // The next two checks should cover most cases.
        }}}__CLR4_5_2hsphsplvicmbnw.R.inc(23769);for (ManchesterOWLSyntax x : values()) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23770);if ((((x.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23771)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23772)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23773);return dataFactory.getOWLThing();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23774);if ((((eof(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23775)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23776)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23777);return dataFactory.getOWLThing();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23778);if ((((!eof(tok) || !lookaheadCheck)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23779)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23780)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23781);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23782);throw new ExceptionBuilder().withKeyword(OPEN, OPENBRACE)
                .withClass().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23783);return dataFactory.getOWLThing();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLClassExpression parseObjectOneOf() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23784);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23785);String open = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23786);if ((((!OPENBRACE.matches(open))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23787)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23788)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23789);throw new ExceptionBuilder().withKeyword(OPENBRACE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23790);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23791);Set<OWLIndividual> inds = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23792);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23793)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23794)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23795);inds.add(parseIndividual());
            __CLR4_5_2hsphsplvicmbnw.R.inc(23796);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23797);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23798)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23799)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23800);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23801);String close = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23802);if ((((!CLOSEBRACE.matches(close))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23803)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23804)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23805);throw new ExceptionBuilder().withKeyword(CLOSEBRACE, COMMA).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23806);return dataFactory.getOWLObjectOneOf(inds);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private static <F> void initialiseSection(
        AnnotatedListItemParser<F, ?> parser,
        Map<ManchesterOWLSyntax, AnnotatedListItemParser<F, ?>> map,
        ManchesterOWLSyntax... synonyms) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23807);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23808);map.put(parser.getFrameSectionKeyword(), parser);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23809);for (ManchesterOWLSyntax syn : synonyms) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23810);map.put(syn, parser);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OntologyAxiomPair> parseFrames() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23811);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23812);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23813);Set<ManchesterOWLSyntax> possible = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23814);resetPossible(possible);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23815);while (true) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23816);String tok = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23817);if ((((CLASS.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23818)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23819)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23820);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23821);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23822);axioms.addAll(parseClassFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23823);possible.addAll(classFrameSections.keySet());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23824);if ((((OBJECT_PROPERTY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23825)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23826)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23827);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23828);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23829);axioms.addAll(parseObjectPropertyFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23830);possible.addAll(objectPropertyFrameSections.keySet());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23831);if ((((DATA_PROPERTY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23832)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23833)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23834);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23835);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23836);axioms.addAll(parseDataPropertyFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23837);possible.addAll(dataPropertyFrameSections.keySet());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23838);if ((((ANNOTATION_PROPERTY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23839)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23840)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23841);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23842);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23843);axioms.addAll(parseAnnotationPropertyFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23844);possible.addAll(Arrays.asList(SUB_PROPERTY_OF, DOMAIN, RANGE));
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23845);if ((((INDIVIDUAL.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23846)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23847)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23848);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23849);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23850);axioms.addAll(parseIndividualFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23851);possible.addAll(Arrays.asList(TYPES, FACTS, DIFFERENT_FROM,
                    SAME_AS));
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23852);if ((((DATATYPE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23853)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23854)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23855);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23856);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23857);axioms.addAll(parseDatatypeFrame());
                __CLR4_5_2hsphsplvicmbnw.R.inc(23858);possible.add(EQUIVALENT_TO);
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23859);if ((((VALUE_PARTITION.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23860)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23861)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23862);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23863);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23864);parseValuePartitionFrame();
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23865);if ((((RULE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23866)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23867)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23868);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23869);resetPossible(possible);
                __CLR4_5_2hsphsplvicmbnw.R.inc(23870);axioms.addAll(parseRuleFrame());
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23871);if ((((eof(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23872)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23873)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23874);break;
                } }else {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23875);consumeToken();
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23876);throw new ExceptionBuilder().withKeyword(possible).build();
                }
            }}
        }}}}}}}}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23877);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseDatatypeFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23878);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23879);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23880);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23881);if ((((!DATATYPE.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23882)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23883)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23884);throw new ExceptionBuilder().withKeyword(DATATYPE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23885);String subj = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23886);OWLDatatype datatype = getOWLDatatype(subj);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23887);axioms.add(new OntologyAxiomPair(defaultOntology, dataFactory
            .getOWLDeclarationAxiom(datatype)));
        __CLR4_5_2hsphsplvicmbnw.R.inc(23888);while (true) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23889);String sect = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23890);if ((((EQUIVALENT_TO.matches(sect))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23891)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23892)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23893);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23894);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23895);Set<OWLOntology> onts = getOntologies();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23896);Set<OWLDataRange> drs = parseDataRangeList();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23897);for (OWLOntology ont : onts) {{
                    assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23898)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23899)==0&false));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23900);for (OWLDataRange dr : drs) {{
                        assert (((dr != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23901)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23902)==0&false));
                        __CLR4_5_2hsphsplvicmbnw.R.inc(23903);axioms.add(new OntologyAxiomPair(ont, dataFactory
                            .getOWLDatatypeDefinitionAxiom(datatype, dr)));
                    }
                }}
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(23904);if ((((ANNOTATIONS.matches(sect))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23905)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23906)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23907);potentialKeywords.clear();
                __CLR4_5_2hsphsplvicmbnw.R.inc(23908);axioms.addAll(parseAnnotations(datatype.getIRI()));
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23909);break;
            }
        }}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23910);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private static void resetPossible(Set<ManchesterOWLSyntax> possible) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23911);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23912);possible.clear();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23913);possible.add(ANNOTATIONS);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23914);possible.add(ANNOTATION_PROPERTY);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23915);possible.add(CLASS);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23916);possible.add(OBJECT_PROPERTY);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23917);possible.add(DATATYPE);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23918);possible.add(DATA_PROPERTY);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23919);possible.add(INDIVIDUAL);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23920);possible.add(VALUE_PARTITION);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23921);possible.add(RULE);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseNaryEquivalentClasses() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23922);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23923);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23924);if ((((!EQUIVALENT_CLASSES.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23925)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23926)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23927);throw new ExceptionBuilder().withKeyword(EQUIVALENT_CLASSES)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23928);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23929);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23930);Set<OWLClassExpression> classExpressions = parseClassExpressionList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23931);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23932);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23933)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23934)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(23935);pairs.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLEquivalentClassesAxiom(classExpressions, annotations)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23936);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseNaryEquivalentProperties() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23937);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23938);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23939);if ((((!EQUIVALENT_PROPERTIES.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23940)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23941)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23942);throw new ExceptionBuilder().withKeyword(EQUIVALENT_PROPERTIES)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23943);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23944);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23945);Set<OWLPropertyExpression> properties = parsePropertyList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23946);OWLAxiom propertyAxiom;
        __CLR4_5_2hsphsplvicmbnw.R.inc(23947);if ((((properties.iterator().next().isObjectPropertyExpression())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23948)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23949)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23950);Set<OWLObjectPropertyExpression> ope = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23951);for (OWLPropertyExpression pe : properties) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23952);ope.add((OWLObjectPropertyExpression) pe);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23953);propertyAxiom = dataFactory.getOWLEquivalentObjectPropertiesAxiom(
                ope, annotations);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23954);Set<OWLDataPropertyExpression> dpe = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23955);for (OWLPropertyExpression pe : properties) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(23956);dpe.add((OWLDataPropertyExpression) pe);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(23957);propertyAxiom = dataFactory.getOWLEquivalentDataPropertiesAxiom(dpe,
                annotations);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23958);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23959);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23960)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23961)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(23962);pairs.add(new OntologyAxiomPair(ont, propertyAxiom));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23963);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotation> parseAnnotations() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23964);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23965);String next = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23966);@Nonnull
        Set<OWLAnnotation> annotations = CollectionFactory.emptySet();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23967);if ((((ANNOTATIONS.matches(next))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23968)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23969)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23970);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(23971);annotations = parseAnnotationList();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23972);return annotations;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseAnnotations(
        @Nonnull OWLAnnotationSubject s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23973);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23974);String header = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23975);if ((((!ANNOTATIONS.matches(header))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23976)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23977)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23978);throw new ExceptionBuilder().withKeyword(ANNOTATIONS).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23979);Set<OWLOntology> onts = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23980);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23981);Set<OWLAnnotation> annos = parseAnnotationList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23982);for (OWLOntology ont : onts) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23983)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23984)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(23985);for (OWLAnnotation anno : annos) {{
                assert (((anno != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23986)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23987)==0&false));
                __CLR4_5_2hsphsplvicmbnw.R.inc(23988);if ((((getOntologyLoaderConfiguration().isLoadAnnotationAxioms())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23989)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23990)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(23991);pairs.add(new OntologyAxiomPair(ont, dataFactory
                        .getOWLAnnotationAssertionAxiom(s, anno)));
                }
            }}
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(23992);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotation> parseAnnotationList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(23993);
        __CLR4_5_2hsphsplvicmbnw.R.inc(23994);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23995);Set<OWLAnnotation> annos = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(23996);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(23997)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(23998)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(23999);potentialKeywords.clear();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24000);Set<OWLAnnotation> annotations = parseAnnotations();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24001);OWLAnnotation anno = parseAnnotation();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24002);anno = anno.getAnnotatedAnnotation(annotations);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24003);annos.add(anno);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24004);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24005);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24006)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24007)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24008);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24009);return annos;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLAnnotation parseAnnotation() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24010);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24011);OWLAnnotationProperty annoProp = parseAnnotationProperty();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24012);String obj = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24013);OWLAnnotation anno = null;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24014);if ((((isIndividualName(obj) || isClassName(obj) || isObjectPropertyName(
            obj) || isDataPropertyName(obj))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24015)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24016)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24017);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24018);OWLAnnotationValue value;
            __CLR4_5_2hsphsplvicmbnw.R.inc(24019);if ((((obj.startsWith("_:"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24020)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24021)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24022);value = anonProvider.getOWLAnonymousIndividual(obj);
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24023);value = getIRI(obj);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24024);anno = dataFactory.getOWLAnnotation(annoProp, value);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24025);if ((((obj.startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24026)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24027)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24028);IRI value = parseIRI();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24029);anno = dataFactory.getOWLAnnotation(annoProp, value);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24030);OWLLiteral con = parseLiteral(null);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24031);anno = dataFactory.getOWLAnnotation(annoProp, con);
        }
        }}__CLR4_5_2hsphsplvicmbnw.R.inc(24032);return anno;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseClassFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24033);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24034);return parseClassFrame(false);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseClassFrameEOF() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24035);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24036);return parseClassFrame(true);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OntologyAxiomPair> parseClassFrame(boolean eof) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24037);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24038);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24039);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24040);if ((((!CLASS.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24041)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24042)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24043);throw new ExceptionBuilder().withKeyword(CLASS).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24044);String subj = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24045);OWLClass cls = getOWLClass(subj);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24046);axioms.add(new OntologyAxiomPair(defaultOntology, dataFactory
            .getOWLDeclarationAxiom(cls)));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24047);parseFrameSections(eof, axioms, cls, classFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24048);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OWLOntology> parseOntologyList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24049);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24050);potentialKeywords.clear();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24051);consumeToken(OPENBRACKET.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24052);consumeToken("in");
        __CLR4_5_2hsphsplvicmbnw.R.inc(24053);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24054);Set<OWLOntology> onts = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24055);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24056)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24057)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24058);String tok = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24059);if ((((isOntologyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24060)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24061)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24062);OWLOntology ont = getOntology(tok);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24063);if ((((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24064)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24065)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24066);onts.add(ont);
                }
            }} }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24067);throw new ExceptionBuilder().withOnto().build();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24068);sep = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24069);if ((((sep.equals(CLOSEBRACKET.keyword()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24070)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24071)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24072);break;
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24073);if ((((!COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24074)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24075)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24076);throw new ExceptionBuilder().withKeyword(COMMA, CLOSEBRACKET)
                    .build();
            }
        }}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24077);return onts;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OWLOntology> getOntologies() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24078);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24079);if ((((peekToken().equals(OPENBRACKET.keyword()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24080)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24081)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24082);return parseOntologyList();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24083);return CollectionFactory.createSet(defaultOntology);
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public void setDefaultOntology(@Nonnull OWLOntology defaultOntology) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24084);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24085);this.defaultOntology = defaultOntology;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private boolean isEmptyFrameSection(Map<ManchesterOWLSyntax, ?> parsers) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24086);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24087);if ((((!allowEmptyFrameSections)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24088)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24089)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24090);return false;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24091);String next = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24092);return !ANNOTATIONS.matches(next) && (parsers.containsKey(parse(next))
            || eof(next));
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private <F> void parseFrameSections(boolean eof,
        Set<OntologyAxiomPair> axioms, @Nonnull F frameSubject,
        Map<ManchesterOWLSyntax, AnnotatedListItemParser<F, ?>> sectionParsers) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24093);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24094);while (true) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24095);String sect = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24096);AnnotatedListItemParser<F, ?> parser = sectionParsers.get(parse(
                sect));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24097);if ((((parser != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24098)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24099)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24100);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24101);Set<OWLOntology> onts = getOntologies();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24102);if ((((!isEmptyFrameSection(sectionParsers))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24103)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24104)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24105);axioms.addAll(parseAnnotatedListItems(frameSubject, parser,
                        onts));
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24106);if ((((eof && !eof(sect))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24107)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24108)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24109);List<ManchesterOWLSyntax> expected = new ArrayList<>();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24110);expected.addAll(sectionParsers.keySet());
                __CLR4_5_2hsphsplvicmbnw.R.inc(24111);if ((((frameSubject instanceof OWLAnnotationSubject
                    || frameSubject instanceof OWLEntity)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24112)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24113)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24114);expected.add(ANNOTATIONS);
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(24115);throw new ExceptionBuilder().withKeyword(expected).build();
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24116);break;
            }
        }}}
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseObjectPropertyFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24117);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24118);return parseObjectPropertyFrame(false);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OntologyAxiomPair> parseObjectPropertyFrame(boolean eof) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24119);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24120);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24121);consumeToken(OBJECT_PROPERTY);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24122);String token = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24123);OWLObjectProperty prop = getOWLObjectProperty(token);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24124);if ((((!prop.isAnonymous())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24125)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24126)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24127);axioms.add(new OntologyAxiomPair(defaultOntology, dataFactory
                .getOWLDeclarationAxiom(prop.asOWLObjectProperty())));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24128);parseFrameSections(eof, axioms, prop, objectPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24129);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseDataPropertyFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24130);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24131);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24132);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24133);if ((((!DATA_PROPERTY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24134)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24135)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24136);throw new ExceptionBuilder().withKeyword(DATA_PROPERTY).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24137);String subj = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24138);OWLDataProperty prop = getOWLDataProperty(subj);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24139);axioms.add(new OntologyAxiomPair(defaultOntology, dataFactory
            .getOWLDeclarationAxiom(prop)));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24140);parseFrameSections(false, axioms, prop, dataPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24141);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseAnnotationPropertyFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24142);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24143);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24144);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24145);if ((((!ANNOTATION_PROPERTY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24146)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24147)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24148);throw new ExceptionBuilder().withKeyword(ANNOTATION_PROPERTY)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24149);String subj = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24150);OWLAnnotationProperty prop = getOWLAnnotationProperty(subj);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24151);for (OWLOntology ont : getOntologies()) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24152);axioms.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLDeclarationAxiom(prop)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24153);parseFrameSections(false, axioms, prop,
            annotationPropertyFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24154);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseIndividualFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24155);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24156);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24157);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24158);if ((((!INDIVIDUAL.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24159)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24160)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24161);throw new ExceptionBuilder().withKeyword(INDIVIDUAL).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24162);String subj = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24163);OWLIndividual ind = getOWLIndividual(subj);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24164);if ((((!ind.isAnonymous())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24165)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24166)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24167);axioms.add(new OntologyAxiomPair(getOntology(null), dataFactory
                .getOWLDeclarationAxiom(ind.asOWLNamedIndividual())));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24168);parseFrameSections(false, axioms, ind, individualFrameSections);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24169);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLPropertyAssertionAxiom<?, ?> parseFact(
        @Nonnull OWLIndividual ind) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24170);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24171);boolean negative = false;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24172);if ((((NOT.matches(peekToken()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24173)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24174)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24175);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24176);negative = true;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24177);String prop = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24178);if ((((isDataPropertyName(prop))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24179)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24180)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24181);OWLDataProperty p = parseDataProperty();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24182);OWLLiteral con = parseLiteral(null);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24183);if ((((!negative)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24184)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24185)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24186);return dataFactory.getOWLDataPropertyAssertionAxiom(p, ind,
                    con);
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24187);return dataFactory.getOWLNegativeDataPropertyAssertionAxiom(p,
                    ind, con);
            }
        }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24188);if ((((isObjectPropertyName(prop) || INVERSE.matches(prop))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24189)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24190)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24191);OWLObjectPropertyExpression p = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24192);if ((((!negative)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24193)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24194)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24195);return dataFactory.getOWLObjectPropertyAssertionAxiom(p, ind,
                    parseIndividual());
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24196);return dataFactory.getOWLNegativeObjectPropertyAssertionAxiom(p,
                    ind, parseIndividual());
            }
        }} }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24197);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24198);throw new ExceptionBuilder().withObject().withData().build();
        }
    }}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OntologyAxiomPair> parseValuePartitionFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24199);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24200);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24201);if ((((!VALUE_PARTITION.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24202)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24203)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24204);throw new ExceptionBuilder().withKeyword(VALUE_PARTITION).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24205);Set<OWLOntology> onts = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24206);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24207);String clsName = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24208);if ((((eof(clsName))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24209)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24210)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24211);throw new ExceptionBuilder().withObject().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24212);OWLClass cls = getOWLClass(clsName);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24213);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24214);axioms.addAll(parseValuePartitionValues(onts, cls));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24215);for (OWLOntology ont : onts) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24216)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24217)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24218);axioms.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLFunctionalObjectPropertyAxiom(prop)));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24219);axioms.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLObjectPropertyRangeAxiom(prop, cls)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24220);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private Set<OntologyAxiomPair> parseValuePartitionValues(
        @Nonnull Set<OWLOntology> onts, @Nonnull OWLClass superclass) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24221);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24222);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24223);Set<OWLClass> siblings = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24224);consumeToken(OPENBRACKET.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24225);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24226);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24227)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24228)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24229);String clsName = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24230);OWLClass cls = getOWLClass(clsName);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24231);siblings.add(cls);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24232);OWLSubClassOfAxiom ax = dataFactory.getOWLSubClassOfAxiom(cls,
                superclass);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24233);for (OWLOntology ont : onts) {{
                assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24234)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24235)==0&false));
                __CLR4_5_2hsphsplvicmbnw.R.inc(24236);axioms.add(new OntologyAxiomPair(ont, ax));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24237);if ((((peekToken().equals(OPENBRACKET.keyword()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24238)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24239)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24240);axioms.addAll(parseValuePartitionValues(onts, cls));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24241);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24242);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24243)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24244)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24245);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24246);consumeToken(CLOSEBRACKET.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24247);OWLAxiom ax = dataFactory.getOWLDisjointClassesAxiom(siblings);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24248);for (OWLOntology ont : onts) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24249)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24250)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24251);axioms.add(new OntologyAxiomPair(ont, ax));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24252);return axioms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public List<OntologyAxiomPair> parseRuleFrame() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24253);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24254);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24255);if ((((!RULE.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24256)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24257)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24258);throw new ExceptionBuilder().withKeyword(RULE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24259);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24260);List<SWRLAtom> body = parseRuleAtoms();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24261);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24262);if ((((!DASH.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24263)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24264)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24265);throw new ExceptionBuilder().withKeyword(DASH, COMMA).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24266);consumeToken(">");
        __CLR4_5_2hsphsplvicmbnw.R.inc(24267);List<SWRLAtom> head = parseRuleAtoms();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24268);SWRLRule rule = dataFactory.getSWRLRule(new LinkedHashSet<>(body),
            new LinkedHashSet<>(head));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24269);List<OntologyAxiomPair> pairs = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24270);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24271)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24272)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24273);pairs.add(new OntologyAxiomPair(ont, rule));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24274);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private List<SWRLAtom> parseRuleAtoms() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24275);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24276);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24277);List<SWRLAtom> atoms = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24278);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24279)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24280)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24281);potentialKeywords.remove(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24282);SWRLAtom atom = parseRuleAtom();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24283);atoms.add(atom);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24284);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24285);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24286)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24287)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24288);consumeToken();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24289);potentialKeywords.add(COMMA);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24290);return atoms;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLAtom parseRuleAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24291);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24292);String predicate = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24293);if ((((isClassName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24294)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24295)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24296);return parseClassAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24297);if ((((OPEN.matches(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24298)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24299)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24300);return parseClassAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24301);if ((((isObjectPropertyName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24302)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24303)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24304);return parseObjectPropertyAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24305);if ((((isDataPropertyName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24306)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24307)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24308);return parseDataPropertyAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24309);if ((((isDatatypeName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24310)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24311)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24312);return parseDataRangeAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24313);if ((((DIFFERENT_FROM.matchesEitherForm(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24314)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24315)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24316);return parseDifferentFromAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24317);if ((((SAME_AS.matchesEitherForm(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24318)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24319)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24320);return parseSameAsAtom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24321);if ((((isSWRLBuiltin(predicate) || predicate.startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24322)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24323)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24324);return parseBuiltInAtom();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24325);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24326);List<String> kw = new ArrayList<>(ruleBuiltIns.keySet());
            __CLR4_5_2hsphsplvicmbnw.R.inc(24327);kw.add(DIFFERENT_FROM.toString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(24328);kw.add(SAME_AS.toString());
            __CLR4_5_2hsphsplvicmbnw.R.inc(24329);Collections.sort(kw);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24330);throw new ExceptionBuilder().withKeyword(kw).withClass()
                .withObject().withData().build();
        }
    }}}}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLAtom parseDataPropertyAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24331);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24332);String predicate = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24333);if ((((!isDataPropertyName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24334)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24335)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24336);throw new ExceptionBuilder().withData().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24337);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24338);SWRLIArgument obj1 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24339);consumeToken(COMMA.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24340);SWRLDArgument obj2 = parseDObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24341);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24342);return dataFactory.getSWRLDataPropertyAtom(getOWLDataProperty(
            predicate), obj1, obj2);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLAtom parseDataRangeAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24343);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24344);OWLDataRange range = parseDataRange();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24345);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24346);SWRLVariable obj1 = parseDVariable();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24347);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24348);return dataFactory.getSWRLDataRangeAtom(range, obj1);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLAtom parseObjectPropertyAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24349);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24350);String predicate = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24351);if ((((!isObjectPropertyName(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24352)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24353)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24354);throw new ExceptionBuilder().withObject().build();
        }
        }assert (((predicate != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24355)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24356)==0&false));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24357);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24358);SWRLIArgument obj1 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24359);consumeToken(COMMA.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24360);SWRLIArgument obj2 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24361);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24362);return dataFactory.getSWRLObjectPropertyAtom(getOWLObjectProperty(
            predicate), obj1, obj2);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLAtom parseClassAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24363);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24364);OWLClassExpression predicate = parseUnion();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24365);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24366);SWRLIArgument obj = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24367);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24368);return dataFactory.getSWRLClassAtom(predicate, obj);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLDifferentIndividualsAtom parseDifferentFromAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24369);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24370);consumeToken(ManchesterOWLSyntax.DIFFERENT_FROM.toString());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24371);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24372);SWRLIArgument obj1 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24373);consumeToken(COMMA.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24374);SWRLIArgument obj2 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24375);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24376);return dataFactory.getSWRLDifferentIndividualsAtom(obj1, obj2);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLSameIndividualAtom parseSameAsAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24377);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24378);consumeToken(ManchesterOWLSyntax.SAME_AS.toString());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24379);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24380);SWRLIArgument obj1 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24381);consumeToken(COMMA.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24382);SWRLIArgument obj2 = parseIObject();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24383);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24384);return dataFactory.getSWRLSameIndividualAtom(obj1, obj2);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLIArgument parseIObject() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24385);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24386);String s = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24387);if ((((isIndividualName(s))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24388)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24389)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24390);return parseIIndividualObject();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24391);if ((((s.equals("?"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24392)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24393)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24394);return parseIVariable();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24395);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24396);throw new ExceptionBuilder().withInd().withKeyword("?$var$")
                .build();
        }
    }}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLVariable parseIVariable() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24397);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24398);return dataFactory.getSWRLVariable(parseVariable());
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLIndividualArgument parseIIndividualObject() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24399);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24400);return dataFactory.getSWRLIndividualArgument(parseIndividual());
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public IRI parseVariable() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24401);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24402);consumeToken("?");
        __CLR4_5_2hsphsplvicmbnw.R.inc(24403);String fragment = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24404);if ((((fragment.startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24405)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24406)==0&false))) {{
            // then the variable was saved with a full IRI
            // preserve the namespace
            __CLR4_5_2hsphsplvicmbnw.R.inc(24407);return parseIRI();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24408);consumeToken();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24409);return IRI.create("urn:swrl#", fragment);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLDArgument parseDObject() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24410);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24411);String s = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24412);if ((((s.equals("?"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24413)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24414)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24415);return parseDVariable();
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24416);try {
                __CLR4_5_2hsphsplvicmbnw.R.inc(24417);return parseLiteralObject();
            } catch (ParserException e) {
                __CLR4_5_2hsphsplvicmbnw.R.inc(24418);e.getExpectedKeywords().add("?");
                __CLR4_5_2hsphsplvicmbnw.R.inc(24419);throw e;
            }
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLVariable parseDVariable() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24420);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24421);IRI var = parseVariable();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24422);return dataFactory.getSWRLVariable(var);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private SWRLLiteralArgument parseLiteralObject() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24423);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24424);OWLLiteral lit = parseLiteral(null);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24425);return dataFactory.getSWRLLiteralArgument(lit);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private SWRLBuiltInAtom parseBuiltInAtom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24426);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24427);String predicate = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24428);consumeToken(OPEN.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24429);SWRLBuiltInsVocabulary v = null;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24430);IRI iri = null;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24431);if ((((!ruleBuiltIns.containsKey(predicate))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24432)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24433)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24434);iri = getIRI(predicate);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24435);v = ruleBuiltIns.get(predicate);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24436);iri = v.getIRI();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24437);List<SWRLDArgument> args = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24438);if ((((v != null && v.getMaxArity() >= 0)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24439)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24440)==0&false))) {{
            // We know the arity!
            __CLR4_5_2hsphsplvicmbnw.R.inc(24441);for (int i = 0; (((i < v.getMaxArity())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24442)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24443)==0&false)); i++) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24444);SWRLDArgument obj = parseDObject();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24445);args.add(obj);
                // parse at least the minumum arity
                __CLR4_5_2hsphsplvicmbnw.R.inc(24446);if ((((i < v.getMinArity() - 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24447)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24448)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24449);consumeToken(COMMA.keyword());
                } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24450);if ((((i < v.getMaxArity() - 1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24451)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24452)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24453);if ((((peekToken().equals(COMMA.keyword()))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24454)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24455)==0&false))) {{
                        __CLR4_5_2hsphsplvicmbnw.R.inc(24456);consumeToken();
                    } }else {{
                        __CLR4_5_2hsphsplvicmbnw.R.inc(24457);break;
                    }
                }}
            }}}
        }} }else {{
            // Unknown arity so just parse as many arguments as we can
            __CLR4_5_2hsphsplvicmbnw.R.inc(24458);String sep = COMMA.keyword();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24459);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24460)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24461)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24462);SWRLDArgument arg = parseDObject();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24463);args.add(arg);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24464);sep = peekToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24465);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24466)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24467)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24468);consumeToken();
                }
            }}
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24469);consumeToken(CLOSE.keyword());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24470);return dataFactory.getSWRLBuiltInAtom(iri, args);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseDisjointClasses() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24471);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24472);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24473);if ((((!DISJOINT_CLASSES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24474)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24475)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24476);throw new ExceptionBuilder().withKeyword(DISJOINT_CLASSES).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24477);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24478);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24479);Set<OWLClassExpression> classExpressions = parseClassExpressionList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24480);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24481);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24482)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24483)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24484);pairs.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLDisjointClassesAxiom(classExpressions, annotations)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24485);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseSameIndividual() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24486);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24487);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24488);if ((((!SAME_INDIVIDUAL.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24489)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24490)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24491);throw new ExceptionBuilder().withKeyword(SAME_INDIVIDUAL).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24492);Set<OWLIndividual> individuals = parseIndividualList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24493);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24494);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24495);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24496);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24497)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24498)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24499);pairs.add(new OntologyAxiomPair(ont, dataFactory
                .getOWLSameIndividualAxiom(individuals, annotations)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24500);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseDisjointProperties() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24501);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24502);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24503);if ((((!DISJOINT_PROPERTIES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24504)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24505)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24506);throw new ExceptionBuilder().withKeyword(DISJOINT_PROPERTIES)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24507);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24508);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24509);Set<OWLPropertyExpression> props = parsePropertyList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24510);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24511);OWLAxiom propertiesAxiom;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24512);if ((((props.iterator().next().isObjectPropertyExpression())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24513)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24514)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24515);Set<OWLObjectPropertyExpression> ope = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24516);for (OWLPropertyExpression pe : props) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24517);ope.add((OWLObjectPropertyExpression) pe);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24518);propertiesAxiom = dataFactory.getOWLDisjointObjectPropertiesAxiom(
                ope, annotations);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24519);Set<OWLDataPropertyExpression> dpe = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24520);for (OWLPropertyExpression pe : props) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24521);dpe.add((OWLDataPropertyExpression) pe);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24522);propertiesAxiom = dataFactory.getOWLDisjointDataPropertiesAxiom(dpe,
                annotations);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24523);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24524)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24525)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24526);pairs.add(new OntologyAxiomPair(ont, propertiesAxiom));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24527);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OntologyAxiomPair> parseDifferentIndividuals() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24528);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24529);String section = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24530);if ((((!DIFFERENT_INDIVIDUALS.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24531)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24532)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24533);throw new ExceptionBuilder().withKeyword(DIFFERENT_INDIVIDUALS)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24534);Set<OWLOntology> ontologies = getOntologies();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24535);Set<OWLAnnotation> annotations = parseAnnotations();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24536);Set<OWLIndividual> individuals = parseIndividualList();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24537);Set<OntologyAxiomPair> pairs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24538);for (OWLOntology ontology : ontologies) {{
            assert (((ontology != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24539)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24540)==0&false));
            __CLR4_5_2hsphsplvicmbnw.R.inc(24541);pairs.add(new OntologyAxiomPair(ontology, dataFactory
                .getOWLDifferentIndividualsAxiom(individuals, annotations)));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24542);return pairs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLObjectPropertyCharacteristicAxiom parseObjectPropertyCharacteristic(
        @Nonnull OWLObjectPropertyExpression prop) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24543);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24544);String characteristic = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24545);if ((((FUNCTIONAL.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24546)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24547)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24548);return dataFactory.getOWLFunctionalObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24549);if ((((INVERSE_FUNCTIONAL.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24550)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24551)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24552);return dataFactory.getOWLInverseFunctionalObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24553);if ((((SYMMETRIC.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24554)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24555)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24556);return dataFactory.getOWLSymmetricObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24557);if ((((ANTI_SYMMETRIC.matches(characteristic) || ASYMMETRIC.matches(
            characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24558)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24559)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24560);return dataFactory.getOWLAsymmetricObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24561);if ((((TRANSITIVE.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24562)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24563)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24564);return dataFactory.getOWLTransitiveObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24565);if ((((REFLEXIVE.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24566)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24567)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24568);return dataFactory.getOWLReflexiveObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24569);if ((((IRREFLEXIVE.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24570)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24571)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24572);return dataFactory.getOWLIrreflexiveObjectPropertyAxiom(prop);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24573);throw new ExceptionBuilder().withKeyword(FUNCTIONAL,
                INVERSE_FUNCTIONAL, SYMMETRIC, ANTI_SYMMETRIC, TRANSITIVE,
                REFLEXIVE, IRREFLEXIVE).build();
        }
    }}}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLDataPropertyCharacteristicAxiom parseDataPropertyCharacteristic(
        @Nonnull OWLDataPropertyExpression prop) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24574);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24575);String characteristic = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24576);if ((((FUNCTIONAL.matches(characteristic))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24577)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24578)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24579);return dataFactory.getOWLFunctionalDataPropertyAxiom(prop);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24580);throw new ExceptionBuilder().withKeyword(FUNCTIONAL).build();
        }
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> parseClassExpressionList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24581);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24582);Set<OWLClassExpression> descs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24583);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24584);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24585)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24586)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24587);potentialKeywords.remove(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24588);descs.add(parseUnion());
            __CLR4_5_2hsphsplvicmbnw.R.inc(24589);potentialKeywords.add(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24590);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24591);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24592)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24593)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24594);sep = consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24595);return descs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Set<OWLClassExpression> parseClassExpressionList(
        ManchesterOWLSyntax expectedOpen, ManchesterOWLSyntax expectedClose) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24596);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24597);String open = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24598);Set<OWLClassExpression> descs = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24599);if ((((!expectedOpen.matches(open))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24600)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24601)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24602);throw new ExceptionBuilder().withKeyword(expectedOpen).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24603);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24604);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24605)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24606)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24607);potentialKeywords.remove(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24608);OWLClassExpression desc = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24609);potentialKeywords.add(COMMA);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24610);descs.add(desc);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24611);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24612);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24613)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24614)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24615);sep = consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24616);String close = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24617);if ((((!expectedClose.matches(close))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24618)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24619)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24620);throw new ExceptionBuilder().withKeyword(expectedClose).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24621);return descs;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OWLPropertyExpression> parsePropertyList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24622);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24623);Set<OWLPropertyExpression> props = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24624);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24625);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24626)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24627)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24628);OWLPropertyExpression prop = parsePropertyExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24629);props.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24630);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24631);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24632)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24633)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24634);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24635);return props;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyExpression> parseObjectPropertyList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24636);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24637);Set<OWLObjectPropertyExpression> props = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24638);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24639);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24640)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24641)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24642);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24643);props.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24644);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24645);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24646)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24647)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24648);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24649);return props;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> parseDataPropertyList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24650);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24651);Set<OWLDataProperty> props = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24652);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24653);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24654)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24655)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24656);OWLDataProperty prop = parseDataProperty();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24657);props.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24658);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24659);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24660)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24661)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24662);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24663);return props;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> parseAnnotationPropertyList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24664);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24665);Set<OWLAnnotationProperty> props = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24666);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24667);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24668)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24669)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24670);OWLAnnotationProperty prop = parseAnnotationProperty();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24671);props.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24672);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24673);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24674)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24675)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24676);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24677);return props;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLIndividual> parseIndividualList() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24678);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24679);Set<OWLIndividual> inds = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24680);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24681);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24682)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24683)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24684);inds.add(parseIndividual());
            __CLR4_5_2hsphsplvicmbnw.R.inc(24685);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24686);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24687)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24688)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24689);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24690);return inds;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public List<OWLObjectPropertyExpression> parseObjectPropertyChain() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24691);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24692);String delim = "o";
        __CLR4_5_2hsphsplvicmbnw.R.inc(24693);List<OWLObjectPropertyExpression> properties = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24694);while ((((delim.equals("o"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24695)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24696)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24697);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24698);properties.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(24699);delim = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24700);if ((((delim.equals("o"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24701)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24702)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24703);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24704);return properties;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLIndividual parseIndividual() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24705);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24706);String name = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24707);if ((((!isIndividualName(name) && !name.startsWith("_:"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24708)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24709)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24710);throw new ExceptionBuilder().withInd().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24711);return getOWLIndividual(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLDataProperty parseDataProperty() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24712);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24713);String name = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24714);if ((((!isDataPropertyName(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24715)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24716)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24717);throw new ExceptionBuilder().withData().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24718);return getOWLDataProperty(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected OWLAnnotationProperty parseAnnotationProperty() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24719);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24720);String name = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24721);if ((((!isAnnotationPropertyName(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24722)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24723)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24724);throw new ExceptionBuilder().withAnn().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24725);return getOWLAnnotationProperty(name);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private Map<String, IRI> parsePrefixDeclaration() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24726);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24727);consumeToken(PREFIX);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24728);Map<String, IRI> map = new HashMap<>(2);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24729);String prefixName = consumeToken();
        // Handle legacy = character if necessart
        __CLR4_5_2hsphsplvicmbnw.R.inc(24730);if ((((peekToken().equals("="))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24731)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24732)==0&false))) {{
            // Legacy
            __CLR4_5_2hsphsplvicmbnw.R.inc(24733);consumeToken();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24734);IRI iri = parseIRI();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24735);map.put(prefixName, iri);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24736);return map;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLImportsDeclaration parseImportsDeclaration() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24737);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24738);consumeToken(IMPORT);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24739);return dataFactory.getOWLImportsDeclaration(parseIRI());
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    protected IRI parseIRI() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24740);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24741);String iriString = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24742);if ((((!(iriString.startsWith("<") && iriString.endsWith(">")))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24743)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24744)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24745);throw new ExceptionBuilder().withKeyword("<$IRI$>").build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24746);return IRI.create(iriString.substring(1, iriString.length() - 1));
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private void processDeclaredEntities() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24747);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24748);for (int i = 0; (((i < tokens.size())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24749)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24750)==0&false)); i++) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24751);String token = tokens.get(i).getToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24752);String name = null;
            __CLR4_5_2hsphsplvicmbnw.R.inc(24753);if ((((i + 1 < tokens.size())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24754)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24755)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24756);name = tokens.get(i + 1).getToken();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(24757);if ((((CLASS.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24758)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24759)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24760);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24761)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24762)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24763);classNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24764);if ((((OBJECT_PROPERTY.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24765)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24766)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24767);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24768)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24769)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24770);objectPropertyNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24771);if ((((DATA_PROPERTY.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24772)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24773)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24774);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24775)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24776)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24777);dataPropertyNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24778);if ((((INDIVIDUAL.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24779)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24780)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24781);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24782)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24783)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24784);individualNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24785);if ((((DATATYPE.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24786)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24787)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24788);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24789)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24790)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24791);dataTypeNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24792);if ((((ANNOTATION_PROPERTY.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24793)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24794)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24795);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24796)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24797)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24798);annotationPropertyNames.add(name);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24799);if ((((VALUE_PARTITION.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24800)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24801)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24802);if ((((name != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24803)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24804)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24805);objectPropertyNames.add(name);
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(24806);if ((((i + 2 < tokens.size())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24807)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24808)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24809);classNames.add(tokens.get(i + 2).getToken());
                }
            }}
        }}}}}}}}
    }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private void processDeclaredEntities(OWLDeclarationAxiom ax) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24810);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24811);ax.getEntity().accept(new OWLEntityVisitor() {

            @Override
            public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24812);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24813);annotationPropertyNames.add(pm.getShortForm(property.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

            @Override
            public void visit(OWLDatatype datatype) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24814);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24815);dataTypeNames.add(pm.getShortForm(datatype.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

            @Override
            public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24816);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24817);individualNames.add(pm.getShortForm(individual.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

            @Override
            public void visit(OWLDataProperty property) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24818);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24819);dataPropertyNames.add(pm.getShortForm(property.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

            @Override
            public void visit(OWLObjectProperty property) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24820);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24821);objectPropertyNames.add(pm.getShortForm(property.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

            @Override
            public void visit(OWLClass cls) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24822);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24823);classNames.add(pm.getShortForm(cls.getIRI()));
            }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public ManchesterSyntaxDocumentFormat parseOntology(
        @Nonnull OWLOntology ont) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24824);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24825);Set<OntologyAxiomPair> axioms = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24826);OWLOntologyID ontologyID = new OWLOntologyID();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24827);Set<AddImport> imports = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24828);Set<AddOntologyAnnotation> ontologyAnnotations = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24829);defaultOntology = ont;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24830);processDeclaredEntities();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24831);while (true) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24832);String section = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24833);if ((((ONTOLOGY.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24834)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24835)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24836);ManchesterOWLSyntaxOntologyHeader header = parseOntologyHeader(
                    false);
                __CLR4_5_2hsphsplvicmbnw.R.inc(24837);for (OWLImportsDeclaration decl : header
                    .getImportsDeclarations()) {{
                    assert (((decl != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24838)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24839)==0&false));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24840);imports.add(new AddImport(ont, decl));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24841);ont.getOWLOntologyManager().makeLoadImportRequest(decl,
                        getOntologyLoaderConfiguration());
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24842);OWLOntology imported = ont.getOWLOntologyManager()
                        .getImportedOntology(decl);
                    assert (((imported != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24843)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24844)==0&false));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24845);for (OWLDeclarationAxiom declaration : imported.getAxioms(
                        AxiomType.DECLARATION)) {{
                        __CLR4_5_2hsphsplvicmbnw.R.inc(24846);processDeclaredEntities(declaration);
                    }
                }}
                }__CLR4_5_2hsphsplvicmbnw.R.inc(24847);for (OWLAnnotation anno : header.getAnnotations()) {{
                    assert (((anno != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24848)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24849)==0&false));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24850);ontologyAnnotations.add(new AddOntologyAnnotation(ont,
                        anno));
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(24851);ontologyID = header.getOntologyID();
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24852);if ((((DISJOINT_CLASSES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24853)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24854)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24855);axioms.addAll(parseDisjointClasses());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24856);if ((((EQUIVALENT_CLASSES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24857)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24858)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24859);axioms.addAll(parseNaryEquivalentClasses());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24860);if ((((EQUIVALENT_PROPERTIES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24861)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24862)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24863);axioms.addAll(parseNaryEquivalentProperties());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24864);if ((((DISJOINT_PROPERTIES.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24865)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24866)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24867);axioms.addAll(parseDisjointProperties());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24868);if ((((DIFFERENT_INDIVIDUALS.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24869)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24870)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24871);axioms.addAll(parseDifferentIndividuals());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24872);if ((((SAME_INDIVIDUAL.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24873)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24874)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24875);axioms.addAll(parseSameIndividual());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24876);if ((((CLASS.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24877)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24878)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24879);axioms.addAll(parseClassFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24880);if ((((OBJECT_PROPERTY.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24881)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24882)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24883);axioms.addAll(parseObjectPropertyFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24884);if ((((DATA_PROPERTY.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24885)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24886)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24887);axioms.addAll(parseDataPropertyFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24888);if ((((INDIVIDUAL.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24889)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24890)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24891);axioms.addAll(parseIndividualFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24892);if ((((DATATYPE.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24893)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24894)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24895);axioms.addAll(parseDatatypeFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24896);if ((((ANNOTATION_PROPERTY.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24897)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24898)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24899);axioms.addAll(parseAnnotationPropertyFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24900);if ((((VALUE_PARTITION.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24901)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24902)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24903);axioms.addAll(parseValuePartitionFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24904);if ((((IMPORT.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24905)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24906)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24907);OWLImportsDeclaration decl = parseImportsDeclaration();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24908);ont.getOWLOntologyManager().makeLoadImportRequest(decl,
                    getOntologyLoaderConfiguration());
                __CLR4_5_2hsphsplvicmbnw.R.inc(24909);imports.add(new AddImport(ont, decl));
                __CLR4_5_2hsphsplvicmbnw.R.inc(24910);OWLOntology imported = ont.getOWLOntologyManager()
                    .getImportedOntology(decl);
                assert (((imported != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24911)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24912)==0&false));
                __CLR4_5_2hsphsplvicmbnw.R.inc(24913);for (OWLDeclarationAxiom declaration : imported.getAxioms(
                    AxiomType.DECLARATION)) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24914);processDeclaredEntities(declaration);
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24915);if ((((PREFIX.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24916)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24917)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24918);Map<String, IRI> nsMap = parsePrefixDeclaration();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24919);for (String ns : nsMap.keySet()) {{
                    assert (((ns != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24920)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24921)==0&false));
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24922);pm.setPrefix(ns, nsMap.get(ns).toString());
                }
            }} }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24923);if ((((RULE.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24924)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24925)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24926);axioms.addAll(parseRuleFrame());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24927);if ((((eof(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24928)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24929)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24930);break;
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24931);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24932);throw new ExceptionBuilder().withKeyword(CLASS, OBJECT_PROPERTY,
                    DATA_PROPERTY, INDIVIDUAL, DATATYPE, ANNOTATION_PROPERTY,
                    IMPORT, VALUE_PARTITION, PREFIX, EQUIVALENT_CLASSES,
                    DISJOINT_CLASSES, DISJOINT_PROPERTIES,
                    DIFFERENT_INDIVIDUALS, SAME_INDIVIDUAL).build();
            }
        }}}}}}}}}}}}}}}}}}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24933);List<OWLOntologyChange> changes = new ArrayList<>(axioms.size());
        __CLR4_5_2hsphsplvicmbnw.R.inc(24934);changes.addAll(imports);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24935);changes.addAll(ontologyAnnotations);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24936);for (OntologyAxiomPair pair : axioms) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24937);changes.add(new AddAxiom(ont, pair.getAxiom()));
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24938);changes.add(new SetOntologyID(ont, ontologyID));
        __CLR4_5_2hsphsplvicmbnw.R.inc(24939);ont.getOWLOntologyManager().applyChanges(changes);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24940);ManchesterSyntaxDocumentFormat format = new ManchesterSyntaxDocumentFormat();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24941);format.copyPrefixesFrom(pm);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24942);return format;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    private ManchesterOWLSyntaxOntologyHeader parseOntologyHeader(
        boolean toEOF) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(24943);
        __CLR4_5_2hsphsplvicmbnw.R.inc(24944);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24945);if ((((!ONTOLOGY.matches(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24946)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24947)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24948);throw new ExceptionBuilder().withKeyword(ONTOLOGY).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24949);IRI ontologyIRI = null;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24950);IRI versionIRI = null;
        __CLR4_5_2hsphsplvicmbnw.R.inc(24951);if ((((peekToken().startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24952)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24953)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24954);ontologyIRI = parseIRI();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24955);if ((((peekToken().startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24956)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24957)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24958);versionIRI = parseIRI();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(24959);Set<OWLAnnotation> annotations = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24960);Set<OWLImportsDeclaration> imports = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(24961);while (true) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(24962);String section = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(24963);if ((((IMPORT.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24964)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24965)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24966);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24967);tok = peekToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24968);Optional<IRI> importedIRI = Optional.absent();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24969);if ((((tok.startsWith("<"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24970)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24971)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24972);importedIRI = Optional.of(parseIRI());
                } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24973);if ((((isOntologyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24974)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24975)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24976);consumeToken();
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24977);OWLOntology ont = getOntology(tok);
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24978);if ((((ont != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24979)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24980)==0&false))) {{
                        __CLR4_5_2hsphsplvicmbnw.R.inc(24981);importedIRI = ont.getOntologyID().getOntologyIRI();
                    }
                }} }else {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24982);consumeToken();
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24983);throw new ExceptionBuilder().withOnto().withKeyword(
                        "<$ONTOLOGYYURI$>").build();
                }
                }}__CLR4_5_2hsphsplvicmbnw.R.inc(24984);if ((((!importedIRI.isPresent())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24985)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24986)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(24987);throw new ExceptionBuilder().withOnto().withKeyword(
                        "Imported IRI is null").build();
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(24988);IRI importedOntologyIRI = importedIRI.get();
                assert (((importedOntologyIRI != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24989)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24990)==0&false));
                __CLR4_5_2hsphsplvicmbnw.R.inc(24991);imports.add(dataFactory.getOWLImportsDeclaration(
                    importedOntologyIRI));
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24992);if ((((ANNOTATIONS.matches(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24993)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24994)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(24995);consumeToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(24996);annotations.addAll(parseAnnotationList());
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(24997);if ((((eof(section))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(24998)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(24999)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25000);break;
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25001);if ((((toEOF)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25002)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25003)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25004);throw new ExceptionBuilder().withKeyword(IMPORT, ANNOTATIONS)
                    .build();
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25005);break;
            }
        }}}}}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25006);return new ManchesterOWLSyntaxOntologyHeader(ontologyIRI, versionIRI,
            annotations, imports);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    protected class ExceptionBuilder {

        boolean ontologyNameExpected = false;
        boolean classNameExpected = false;
        boolean objectPropertyNameExpected = false;
        boolean dataPropertyNameExpected = false;
        boolean individualNameExpected = false;
        boolean datatypeNameExpected = false;
        boolean annotationPropertyNameExpected = false;
        boolean integerExpected = false;
        Set<String> keywords = new HashSet<>();
        List<String> tokenSequence;
        int start = -1;
        int line = -1;
        int column = -1;

        ExceptionBuilder() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25007);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25008);withKeyword(potentialKeywords);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        ExceptionBuilder(ParserException e) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25009);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25010);ontologyNameExpected = e.isOntologyNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25011);classNameExpected = e.isClassNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25012);objectPropertyNameExpected = e.isObjectPropertyNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25013);dataPropertyNameExpected = e.isDataPropertyNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25014);individualNameExpected = e.isIndividualNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25015);dataPropertyNameExpected = e.isDatatypeNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25016);annotationPropertyNameExpected = e
                .isAnnotationPropertyNameExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25017);integerExpected = e.isIntegerExpected();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25018);withKeyword(e.getExpectedKeywords());
            __CLR4_5_2hsphsplvicmbnw.R.inc(25019);tokenSequence = e.getTokenSequence();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25020);start = e.getStartPos();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25021);line = e.getLineNumber();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25022);column = e.getColumnNumber();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withOnto() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25023);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25024);ontologyNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25025);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withInt() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25026);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25027);integerExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25028);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withClass() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25029);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25030);classNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25031);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withObject() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25032);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25033);objectPropertyNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25034);withKeyword(INVERSE);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25035);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withData() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25036);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25037);dataPropertyNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25038);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withInd() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25039);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25040);individualNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25041);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withDt() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25042);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25043);datatypeNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25044);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withAnn() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25045);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25046);annotationPropertyNameExpected = true;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25047);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withKeyword(String s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25048);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25049);keywords.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25050);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withKeyword(ManchesterOWLSyntax s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25051);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25052);keywords.add(s.keyword());
            __CLR4_5_2hsphsplvicmbnw.R.inc(25053);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withKeyword(String... strings) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25054);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25055);for (String s : strings) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25056);keywords.add(s);
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25057);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ExceptionBuilder withKeyword(ManchesterOWLSyntax... keys) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25058);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25059);for (ManchesterOWLSyntax s : keys) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25060);keywords.add(s.keyword());
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25061);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public <T> ExceptionBuilder withKeyword(Collection<T> keys) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25062);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25063);for (T s : keys) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25064);if ((((s instanceof String)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25065)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25066)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(25067);withKeyword((String) s);
                }
                }__CLR4_5_2hsphsplvicmbnw.R.inc(25068);if ((((s instanceof ManchesterOWLSyntax)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25069)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25070)==0&false))) {{
                    __CLR4_5_2hsphsplvicmbnw.R.inc(25071);withKeyword((ManchesterOWLSyntax) s);
                }
            }}
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25072);return this;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        public ParserException build() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25073);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25074);if ((((tokenSequence == null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25075)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25076)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25077);Token lastToken = getLastToken();
                __CLR4_5_2hsphsplvicmbnw.R.inc(25078);tokenSequence = getTokenSequence();
                __CLR4_5_2hsphsplvicmbnw.R.inc(25079);start = lastToken.getPos();
                __CLR4_5_2hsphsplvicmbnw.R.inc(25080);line = lastToken.getRow();
                __CLR4_5_2hsphsplvicmbnw.R.inc(25081);column = lastToken.getCol();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25082);return new ParserException(tokenSequence, start, line, column,
                ontologyNameExpected, classNameExpected,
                objectPropertyNameExpected, dataPropertyNameExpected,
                individualNameExpected, datatypeNameExpected,
                annotationPropertyNameExpected, integerExpected, keywords);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    protected List<String> getTokenSequence() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25083);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25084);List<String> seq = new ArrayList<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25085);int index = tokenIndex - 1;
        __CLR4_5_2hsphsplvicmbnw.R.inc(25086);if ((((index < 0)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25087)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25088)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25089);index = 0;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25090);while ((((index < tokens.size() && seq.size() < 4 && !seq.contains(EOF))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25091)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25092)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25093);seq.add(tokens.get(index).getToken());
            __CLR4_5_2hsphsplvicmbnw.R.inc(25094);index++;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25095);if ((((seq.isEmpty())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25096)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25097)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25098);seq.add(EOF);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25099);return seq;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    class DefaultEntityChecker implements OWLEntityChecker {

        @Override
        public OWLClass getOWLClass(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25100);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25101);if ((((name.equals("Thing") || name.equals("owl:Thing"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25102)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25103)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25104);return dataFactory.getOWLThing();
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25105);if ((((name.equals("Nothing") || name.equals("owl:Nothing"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25106)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25107)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25108);return dataFactory.getOWLNothing();
            } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25109);if ((((classNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25110)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25111)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25112);return dataFactory.getOWLClass(getIRI(name));
            }
            }}}__CLR4_5_2hsphsplvicmbnw.R.inc(25113);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLObjectProperty getOWLObjectProperty(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25114);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25115);if ((((objectPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25116)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25117)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25118);return dataFactory.getOWLObjectProperty(getIRI(name));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25119);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLDataProperty getOWLDataProperty(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25120);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25121);if ((((dataPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25122)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25123)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25124);return dataFactory.getOWLDataProperty(getIRI(name));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25125);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLNamedIndividual getOWLIndividual(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25126);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25127);if ((((individualNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25128)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25129)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25130);return dataFactory.getOWLNamedIndividual(getIRI(name));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25131);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLDatatype getOWLDatatype(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25132);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25133);if ((((dataTypeNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25134)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25135)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25136);return dataFactory.getOWLDatatype(getIRI(name));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25137);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAnnotationProperty getOWLAnnotationProperty(String name) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25138);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25139);if ((((annotationPropertyNames.contains(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25140)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25141)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25142);return dataFactory.getOWLAnnotationProperty(getIRI(name));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25143);return null;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    private final Map<String, IRI> nameIRIMap = new HashMap<>();

    @Nonnull
    protected IRI getIRI(@Nonnull String inputName) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25144);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25145);String name = inputName;
        __CLR4_5_2hsphsplvicmbnw.R.inc(25146);boolean fullIRI = name.equals("<");
        __CLR4_5_2hsphsplvicmbnw.R.inc(25147);if ((((fullIRI)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25148)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25149)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25150);name = consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25151);consumeToken();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25152);IRI uri = nameIRIMap.get(name);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25153);if ((((uri != null)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25154)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25155)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25156);return uri;
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25157);if ((((fullIRI)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25158)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25159)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25160);uri = IRI.create(name);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25161);int colonIndex = name.indexOf(':');
            __CLR4_5_2hsphsplvicmbnw.R.inc(25162);if ((((colonIndex == -1)&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25163)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25164)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25165);name = ":" + name;
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25166);uri = pm.getIRI(name);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25167);nameIRIMap.put(name, uri);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25168);return uri;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public OWLAxiom parseAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25169);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25170);String token = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25171);if ((((isClassName(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25172)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25173)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25174);return parseAxiomWithClassExpressionStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25175);if ((((isObjectPropertyName(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25176)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25177)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25178);return parseAxiomWithObjectPropertyStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25179);if ((((isDataPropertyName(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25180)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25181)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25182);return parseAxiomWithDataPropertyStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25183);if ((((isIndividualName(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25184)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25185)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25186);return parseAxiomWithIndividualStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25187);if ((((INV.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25188)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25189)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25190);return parseAxiomWithObjectPropertyStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25191);if ((((OPEN.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25192)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25193)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25194);return parseAxiomWithClassExpressionStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25195);if ((((OPENBRACE.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25196)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25197)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25198);return parseAxiomWithClassExpressionStart();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25199);if ((((FUNCTIONAL.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25200)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25201)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25202);return parseFunctionPropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25203);if ((((INVERSE_FUNCTIONAL.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25204)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25205)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25206);return parseInverseFunctionalPropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25207);if ((((SYMMETRIC.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25208)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25209)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25210);return parseSymmetricPropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25211);if ((((ASYMMETRIC.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25212)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25213)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25214);return parseAsymmetricPropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25215);if ((((TRANSITIVE.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25216)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25217)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25218);return parseTransitivePropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25219);if ((((REFLEXIVE.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25220)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25221)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25222);return parseReflexivePropertyAxiom();
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25223);if ((((IRREFLEXIVE.matches(token))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25224)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25225)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25226);return parseIrreflexivePropertyAxiom();
        }
        }}}}}}}}}}}}}}__CLR4_5_2hsphsplvicmbnw.R.inc(25227);throw new ExceptionBuilder().withClass().withObject().withData()
            .withKeyword(OPEN, OPENBRACE, INV, FUNCTIONAL, INVERSE_FUNCTIONAL,
                SYMMETRIC, ASYMMETRIC, TRANSITIVE, REFLEXIVE, IRREFLEXIVE)
            .build();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Override
    public OWLClassAxiom parseClassAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25228);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25229);return (OWLClassAxiom) parseAxiom();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseAxiomWithIndividualStart() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25230);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25231);OWLIndividual ind = parseIndividual();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25232);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25233);if ((((TYPE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25234)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25235)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25236);OWLClassExpression type = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25237);return dataFactory.getOWLClassAssertionAxiom(type, ind);
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25238);throw new ExceptionBuilder().withKeyword(TYPE).build();
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseAxiomWithDataPropertyStart() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25239);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25240);OWLDataPropertyExpression prop = parseDataProperty();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25241);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25242);if ((((SOME.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25243)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25244)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25245);OWLDataRange dataRange = parseDataIntersectionOf();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25246);return parseClassAxiomRemainder(dataFactory
                .getOWLDataSomeValuesFrom(prop, dataRange));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25247);if ((((ONLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25248)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25249)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25250);OWLDataRange dataRange = parseDataIntersectionOf();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25251);return parseClassAxiomRemainder(dataFactory.getOWLDataAllValuesFrom(
                prop, dataRange));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25252);if ((((MIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25253)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25254)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25255);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25256);OWLDataRange dataRange = parseDataIntersectionOf();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25257);return parseClassAxiomRemainder(dataFactory
                .getOWLDataMinCardinality(cardi, prop, dataRange));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25258);if ((((MAX.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25259)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25260)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25261);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25262);OWLDataRange dataRange = parseDataIntersectionOf();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25263);return parseClassAxiomRemainder(dataFactory
                .getOWLDataMaxCardinality(cardi, prop, dataRange));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25264);if ((((EXACTLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25265)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25266)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25267);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25268);OWLDataRange dataRange = parseDataIntersectionOf();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25269);return parseClassAxiomRemainder(dataFactory
                .getOWLDataExactCardinality(cardi, prop, dataRange));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25270);if ((((SUB_PROPERTY_OF.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25271)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25272)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25273);OWLDataPropertyExpression superProperty = parseDataPropertyExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25274);return dataFactory.getOWLSubDataPropertyOfAxiom(prop,
                superProperty);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25275);if ((((EQUIVALENT_TO.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25276)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25277)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25278);OWLDataPropertyExpression equivProp = parseDataPropertyExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25279);return dataFactory.getOWLEquivalentDataPropertiesAxiom(prop,
                equivProp);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25280);if ((((DISJOINT_WITH.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25281)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25282)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25283);OWLDataPropertyExpression disjProp = parseDataPropertyExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25284);return dataFactory.getOWLDisjointDataPropertiesAxiom(prop,
                disjProp);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25285);if ((((DOMAIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25286)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25287)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25288);OWLClassExpression domain = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25289);return dataFactory.getOWLDataPropertyDomainAxiom(prop, domain);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25290);if ((((RANGE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25291)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25292)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25293);OWLDataRange range = parseDataRange();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25294);return dataFactory.getOWLDataPropertyRangeAxiom(prop, range);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25295);throw new ExceptionBuilder().withKeyword(SOME, ONLY, MIN, MAX,
                EXACTLY, SUB_PROPERTY_OF, EQUIVALENT_TO, DISJOINT_WITH, DOMAIN,
                RANGE).build();
        }
    }}}}}}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLDataPropertyExpression parseDataPropertyExpression() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25296);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25297);String tok = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25298);if ((((!isDataPropertyName(tok))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25299)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25300)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25301);throw new ExceptionBuilder().withData().build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25302);return getOWLDataProperty(tok);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseAxiomWithClassExpressionStart() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25303);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25304);return parseClassAxiomRemainder(parseUnion());
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseClassAxiomRemainder(
        @Nonnull OWLClassExpression startExpression) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25305);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25306);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25307);if ((((SUBCLASS_OF.matchesEitherForm(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25308)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25309)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25310);OWLClassExpression superClass = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25311);return dataFactory.getOWLSubClassOfAxiom(startExpression,
                superClass);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25312);if ((((DISJOINT_WITH.matchesEitherForm(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25313)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25314)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25315);OWLClassExpression disjointClass = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25316);return dataFactory.getOWLDisjointClassesAxiom(startExpression,
                disjointClass);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25317);if ((((EQUIVALENT_TO.matchesEitherForm(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25318)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25319)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25320);OWLClassExpression equivClass = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25321);return dataFactory.getOWLEquivalentClassesAxiom(startExpression,
                equivClass);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25322);if ((((AND.matchesEitherForm(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25323)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25324)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25325);OWLClassExpression conjunct = parseIntersection();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25326);Set<OWLClassExpression> conjuncts = conjunct.asConjunctSet();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25327);conjuncts.add(startExpression);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25328);OWLClassExpression ce = dataFactory.getOWLObjectIntersectionOf(
                conjuncts);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25329);return parseClassAxiomRemainder(ce);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25330);if ((((OR.matchesEitherForm(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25331)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25332)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25333);OWLClassExpression disjunct = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25334);Set<OWLClassExpression> disjuncts = disjunct.asDisjunctSet();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25335);disjuncts.add(startExpression);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25336);OWLClassExpression ce = dataFactory.getOWLObjectUnionOf(disjuncts);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25337);return parseClassAxiomRemainder(ce);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25338);throw new ExceptionBuilder().withKeyword(SUBCLASS_OF, DISJOINT_WITH,
                EQUIVALENT_TO, AND, OR).build();
        }
    }}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseAxiomWithObjectPropertyStart() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25339);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25340);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25341);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25342);if ((((SOME.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25343)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25344)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25345);OWLClassExpression filler = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25346);return parseClassAxiomRemainder(dataFactory
                .getOWLObjectSomeValuesFrom(prop, filler));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25347);if ((((ONLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25348)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25349)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25350);OWLClassExpression filler = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25351);return parseClassAxiomRemainder(dataFactory
                .getOWLObjectAllValuesFrom(prop, filler));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25352);if ((((MIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25353)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25354)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25355);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25356);OWLClassExpression filler = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25357);return parseClassAxiomRemainder(dataFactory
                .getOWLObjectMinCardinality(cardi, prop, filler));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25358);if ((((MAX.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25359)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25360)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25361);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25362);OWLClassExpression filler = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25363);return parseClassAxiomRemainder(dataFactory
                .getOWLObjectMaxCardinality(cardi, prop, filler));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25364);if ((((EXACTLY.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25365)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25366)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25367);int cardi = parseInteger();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25368);OWLClassExpression filler = parseUnion();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25369);return parseClassAxiomRemainder(dataFactory
                .getOWLObjectExactCardinality(cardi, prop, filler));
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25370);if ((((SUB_PROPERTY_OF.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25371)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25372)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25373);OWLObjectPropertyExpression superProperty = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25374);return dataFactory.getOWLSubObjectPropertyOfAxiom(prop,
                superProperty);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25375);if ((((EQUIVALENT_TO.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25376)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25377)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25378);OWLObjectPropertyExpression equivProp = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25379);return dataFactory.getOWLEquivalentObjectPropertiesAxiom(prop,
                equivProp);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25380);if ((((INVERSE_OF.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25381)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25382)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25383);OWLObjectPropertyExpression invProp = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25384);return dataFactory.getOWLInverseObjectPropertiesAxiom(prop,
                invProp);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25385);if ((((DISJOINT_WITH.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25386)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25387)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25388);OWLObjectPropertyExpression disjProp = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25389);return dataFactory.getOWLDisjointObjectPropertiesAxiom(prop,
                disjProp);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25390);if ((((DOMAIN.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25391)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25392)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25393);OWLClassExpression domain = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25394);return dataFactory.getOWLObjectPropertyDomainAxiom(prop, domain);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25395);if ((((RANGE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25396)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25397)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25398);OWLClassExpression range = parseClassExpression();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25399);return dataFactory.getOWLObjectPropertyRangeAxiom(prop, range);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25400);if ((((CHAIN_CONNECT.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25401)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25402)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25403);String sep = kw;
            __CLR4_5_2hsphsplvicmbnw.R.inc(25404);List<OWLObjectPropertyExpression> chain = new ArrayList<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25405);chain.add(prop);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25406);while ((((sep.equals("o"))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25407)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25408)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25409);OWLObjectPropertyExpression chainProp = parseObjectPropertyExpression(
                    false);
                __CLR4_5_2hsphsplvicmbnw.R.inc(25410);chain.add(chainProp);
                __CLR4_5_2hsphsplvicmbnw.R.inc(25411);sep = consumeToken();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25412);if ((((!SUB_PROPERTY_OF.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25413)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25414)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25415);throw new ExceptionBuilder().withKeyword(SUB_PROPERTY_OF)
                    .build();
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25416);OWLObjectPropertyExpression superProp = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25417);return dataFactory.getOWLSubPropertyChainOfAxiom(chain, superProp);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25418);throw new ExceptionBuilder().withKeyword(SOME, ONLY, MIN, MAX,
                EXACTLY, SUB_PROPERTY_OF, EQUIVALENT_TO, INVERSE_OF,
                DISJOINT_WITH, DOMAIN, RANGE, CHAIN_CONNECT).build();
        }
    }}}}}}}}}}}}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseInverseFunctionalPropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25419);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25420);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25421);if ((((!INVERSE_FUNCTIONAL.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25422)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25423)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25424);throw new ExceptionBuilder().withKeyword(INVERSE_FUNCTIONAL)
                .build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25425);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25426);return dataFactory.getOWLInverseFunctionalObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseSymmetricPropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25427);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25428);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25429);if ((((!SYMMETRIC.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25430)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25431)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25432);throw new ExceptionBuilder().withKeyword(SYMMETRIC).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25433);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25434);return dataFactory.getOWLSymmetricObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseAsymmetricPropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25435);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25436);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25437);if ((((!ASYMMETRIC.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25438)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25439)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25440);throw new ExceptionBuilder().withKeyword(ASYMMETRIC).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25441);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25442);return dataFactory.getOWLAsymmetricObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseTransitivePropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25443);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25444);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25445);if ((((!TRANSITIVE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25446)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25447)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25448);throw new ExceptionBuilder().withKeyword(TRANSITIVE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25449);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25450);return dataFactory.getOWLTransitiveObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseReflexivePropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25451);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25452);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25453);if ((((!REFLEXIVE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25454)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25455)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25456);throw new ExceptionBuilder().withKeyword(REFLEXIVE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25457);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25458);return dataFactory.getOWLReflexiveObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseIrreflexivePropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25459);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25460);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25461);if ((((!IRREFLEXIVE.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25462)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25463)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25464);throw new ExceptionBuilder().withKeyword(IRREFLEXIVE).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25465);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(false);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25466);return dataFactory.getOWLIrreflexiveObjectPropertyAxiom(prop);
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private OWLAxiom parseFunctionPropertyAxiom() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25467);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25468);String kw = consumeToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25469);if ((((!FUNCTIONAL.matches(kw))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25470)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25471)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25472);throw new ExceptionBuilder().withKeyword(FUNCTIONAL).build();
        }
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25473);String name = peekToken();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25474);if ((((isObjectPropertyName(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25475)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25476)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25477);OWLObjectPropertyExpression prop = parseObjectPropertyExpression(
                false);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25478);return dataFactory.getOWLFunctionalObjectPropertyAxiom(prop);
        } }else {__CLR4_5_2hsphsplvicmbnw.R.inc(25479);if ((((isDataPropertyName(name))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25480)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25481)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25482);OWLDataProperty prop = parseDataProperty();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25483);return dataFactory.getOWLFunctionalDataPropertyAxiom(prop);
        } }else {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25484);consumeToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25485);throw new ExceptionBuilder().withObject().withData().build();
        }
    }}}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    @Nonnull
    private <F, O> Set<OntologyAxiomPair> parseAnnotatedListItems(@Nonnull F s,
        @Nonnull AnnotatedListItemParser<F, O> itemParser,
        @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25486);
        __CLR4_5_2hsphsplvicmbnw.R.inc(25487);Set<OntologyAxiomPair> result = new HashSet<>();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25488);String sep = COMMA.keyword();
        __CLR4_5_2hsphsplvicmbnw.R.inc(25489);while ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25490)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25491)==0&false))) {{
            __CLR4_5_2hsphsplvicmbnw.R.inc(25492);Set<OWLAnnotation> annotations = parseAnnotations();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25493);O item = itemParser.parseItem(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25494);OWLAxiom axiom = itemParser.createAxiom(s, item, annotations);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25495);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25496);result.add(new OntologyAxiomPair(ontology, axiom));
            }
            }__CLR4_5_2hsphsplvicmbnw.R.inc(25497);sep = peekToken();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25498);if ((((COMMA.matches(sep))&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25499)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25500)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25501);consumeToken();
            }
        }}
        }__CLR4_5_2hsphsplvicmbnw.R.inc(25502);return result;
    }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

    interface AnnotatedListItemParser<F, O> {

        @Nonnull
        O parseItem(@Nonnull F s);

        @Nonnull
        OWLAxiom createAxiom(@Nonnull F s, @Nonnull O o,
            @Nonnull Set<OWLAnnotation> anns);

        ManchesterOWLSyntax getFrameSectionKeyword();
    }

    abstract class AnnotatedClassExpressionListItemParser<F> implements
        AnnotatedListItemParser<F, OWLClassExpression> {

        @Override
        public OWLClassExpression parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25503);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25504);return parseUnion();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotatedClassExpressionSetListItemParser<F> implements
        AnnotatedListItemParser<F, Set<OWLClassExpression>> {

        @Override
        public Set<OWLClassExpression> parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25505);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25506);return parseClassExpressionList();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotatedPropertyListListItemParser<F> implements
        AnnotatedListItemParser<F, Set<OWLPropertyExpression>> {

        @Override
        public Set<OWLPropertyExpression> parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25507);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25508);return parsePropertyList();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotatedIndividualsListItemParser<F> implements
        AnnotatedListItemParser<F, OWLIndividual> {

        @Override
        public OWLIndividual parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25509);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25510);return parseIndividual();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotationListItemParser<F> implements
        AnnotatedListItemParser<F, OWLAnnotation> {

        @Override
        public OWLAnnotation parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25511);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25512);return parseAnnotation();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassSubClassOfListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25513);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25514);return dataFactory.getOWLSubClassOfAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25515);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25516);return SUBCLASS_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassEquivalentToListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25517);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25518);return dataFactory.getOWLEquivalentClassesAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25519);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25520);return EQUIVALENT_TO;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassDisjointWithListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25521);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25522);Set<OWLClassExpression> disjointClasses = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25523);disjointClasses.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25524);disjointClasses.add(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25525);return dataFactory.getOWLDisjointClassesAxiom(disjointClasses,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25526);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25527);return DISJOINT_WITH;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassDisjointClassesListItemParser extends
        AnnotatedClassExpressionSetListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, Set<OWLClassExpression> o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25528);
            // o.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25529);return dataFactory.getOWLDisjointClassesAxiom(o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25530);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25531);return DISJOINT_CLASSES;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassDisjointUnionOfListItemParser extends
        AnnotatedClassExpressionSetListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, Set<OWLClassExpression> o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25532);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25533);return dataFactory.getOWLDisjointUnionAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25534);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25535);return DISJOINT_UNION_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassHasKeyListItemParser extends
        AnnotatedPropertyListListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, Set<OWLPropertyExpression> o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25536);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25537);return dataFactory.getOWLHasKeyAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25538);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25539);return HAS_KEY;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassSuperClassOfListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25540);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25541);return dataFactory.getOWLSubClassOfAxiom(o, s, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25542);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25543);return SUPERCLASS_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ClassIndividualsListItemParser extends
        AnnotatedIndividualsListItemParser<OWLClass> {

        @Override
        public OWLAxiom createAxiom(OWLClass s, OWLIndividual o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25544);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25545);return dataFactory.getOWLClassAssertionAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25546);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25547);return INDIVIDUALS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class EntityAnnotationsListItemParser<E extends OWLEntity> extends
        AnnotationListItemParser<E> {

        @Override
        public OWLAxiom createAxiom(E s, OWLAnnotation o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25548);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25549);return dataFactory.getOWLAnnotationAssertionAxiom(s.getIRI(), o,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25550);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25551);return ANNOTATIONS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class ObjectPropertyExpressionListItemParser<F> implements
        AnnotatedListItemParser<F, OWLObjectPropertyExpression> {

        @Override
        public OWLObjectPropertyExpression parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25552);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25553);return parseObjectPropertyExpression(false);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertySubPropertyOfListItemParser extends
        ObjectPropertyExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25554);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25555);return dataFactory.getOWLSubObjectPropertyOfAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25556);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25557);return SUB_PROPERTY_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertySuperPropertyOfListItemParser extends
        ObjectPropertyExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25558);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25559);return dataFactory.getOWLSubObjectPropertyOfAxiom(o, s, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25560);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25561);return SUPER_PROPERTY_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyEquivalentToListItemParser extends
        ObjectPropertyExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25562);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25563);return dataFactory.getOWLEquivalentObjectPropertiesAxiom(s, o,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25564);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25565);return EQUIVALENT_TO;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyDisjointWithListItemParser extends
        ObjectPropertyExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25566);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25567);Set<OWLObjectPropertyExpression> properties = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25568);properties.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25569);properties.add(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25570);return dataFactory.getOWLDisjointObjectPropertiesAxiom(properties,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25571);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25572);return DISJOINT_WITH;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyDomainListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25573);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25574);return dataFactory.getOWLObjectPropertyDomainAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25575);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25576);return DOMAIN;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyRangeListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25577);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25578);return dataFactory.getOWLObjectPropertyRangeAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25579);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25580);return RANGE;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyInverseOfListItemParser extends
        ObjectPropertyExpressionListItemParser<OWLObjectProperty> {

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25581);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25582);return dataFactory.getOWLInverseObjectPropertiesAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25583);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25584);return INVERSE_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertySubPropertyChainListItemParser implements
        AnnotatedListItemParser<OWLObjectProperty, List<OWLObjectPropertyExpression>> {

        @Override
        public List<OWLObjectPropertyExpression> parseItem(
            OWLObjectProperty s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25585);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25586);return parseObjectPropertyChain();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            List<OWLObjectPropertyExpression> o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25587);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25588);return dataFactory.getOWLSubPropertyChainOfAxiom(o, s, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25589);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25590);return SUB_PROPERTY_CHAIN;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class ObjectPropertyCharacteristicsItemParser implements
        AnnotatedListItemParser<OWLObjectProperty, OWLObjectPropertyCharacteristicAxiom> {

        @Override
        public OWLObjectPropertyCharacteristicAxiom parseItem(
            @Nonnull OWLObjectProperty s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25591);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25592);return parseObjectPropertyCharacteristic(s);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLObjectProperty s,
            OWLObjectPropertyCharacteristicAxiom o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25593);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25594);return o.getAnnotatedAxiom(anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25595);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25596);return CHARACTERISTICS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class DataPropertyExpressionListItemParser<F> implements
        AnnotatedListItemParser<F, OWLDataPropertyExpression> {

        @Override
        public OWLDataProperty parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25597);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25598);return parseDataProperty();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertySubPropertyOfListItemParser extends
        DataPropertyExpressionListItemParser<OWLDataProperty> {

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s,
            OWLDataPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25599);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25600);return dataFactory.getOWLSubDataPropertyOfAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25601);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25602);return SUB_PROPERTY_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertyEquivalentToListItemParser extends
        DataPropertyExpressionListItemParser<OWLDataProperty> {

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s,
            OWLDataPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25603);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25604);return dataFactory.getOWLEquivalentDataPropertiesAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25605);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25606);return EQUIVALENT_TO;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertyDisjointWithListItemParser extends
        DataPropertyExpressionListItemParser<OWLDataProperty> {

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s,
            OWLDataPropertyExpression o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25607);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25608);Set<OWLDataPropertyExpression> properties = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25609);properties.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25610);properties.add(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25611);return dataFactory.getOWLDisjointDataPropertiesAxiom(properties,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25612);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25613);return DISJOINT_WITH;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertyDomainListItemParser extends
        AnnotatedClassExpressionListItemParser<OWLDataProperty> {

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25614);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25615);return dataFactory.getOWLDataPropertyDomainAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25616);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25617);return DOMAIN;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotatedDataRangeListItemParser<F> implements
        AnnotatedListItemParser<F, OWLDataRange> {

        @Override
        public OWLDataRange parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25618);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25619);return parseDataRange();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertyRangeListItemParser extends
        AnnotatedDataRangeListItemParser<OWLDataProperty> {

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s, OWLDataRange o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25620);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25621);return dataFactory.getOWLDataPropertyRangeAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25622);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25623);return RANGE;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class DataPropertyCharacteristicsItemParser implements
        AnnotatedListItemParser<OWLDataProperty, OWLDataPropertyCharacteristicAxiom> {

        @Override
        public OWLDataPropertyCharacteristicAxiom parseItem(OWLDataProperty s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25624);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25625);return parseDataPropertyCharacteristic(s);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLDataProperty s,
            OWLDataPropertyCharacteristicAxiom o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25626);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25627);return o.getAnnotatedAxiom(anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25628);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25629);return CHARACTERISTICS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualTypesItemParser extends
        AnnotatedClassExpressionListItemParser<OWLIndividual> {

        @Override
        public OWLAxiom createAxiom(OWLIndividual s, OWLClassExpression o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25630);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25631);return dataFactory.getOWLClassAssertionAxiom(o, s, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25632);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25633);return TYPES;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualFactsItemParser implements
        AnnotatedListItemParser<OWLIndividual, OWLPropertyAssertionAxiom<?, ?>> {

        @Override
        public OWLPropertyAssertionAxiom<?, ?> parseItem(OWLIndividual s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25634);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25635);return parseFact(s);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(@Nonnull OWLIndividual s,
            OWLPropertyAssertionAxiom<?, ?> o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25636);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25637);return o.getAnnotatedAxiom(anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25638);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25639);return FACTS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualSameAsItemParser extends
        AnnotatedIndividualsListItemParser<OWLIndividual> {

        @Override
        public OWLAxiom createAxiom(OWLIndividual s, OWLIndividual o,
            @Nonnull Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25640);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25641);Set<OWLIndividual> individuals = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25642);individuals.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25643);individuals.add(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25644);return dataFactory.getOWLSameIndividualAxiom(individuals, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25645);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25646);return SAME_AS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualDifferentFromItemParser extends
        AnnotatedIndividualsListItemParser<OWLIndividual> {

        @Override
        public OWLAxiom createAxiom(OWLIndividual s, OWLIndividual o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25647);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25648);Set<OWLIndividual> individuals = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25649);individuals.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25650);individuals.add(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25651);return dataFactory.getOWLDifferentIndividualsAxiom(individuals,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25652);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25653);return DIFFERENT_FROM;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualDifferentIndividualsItemParser implements
        AnnotatedListItemParser<OWLIndividual, Set<OWLIndividual>> {

        @Override
        public Set<OWLIndividual> parseItem(OWLIndividual s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25654);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25655);return parseIndividualList();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLIndividual s, Set<OWLIndividual> o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25656);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25657);Set<OWLIndividual> individuals = new HashSet<>();
            __CLR4_5_2hsphsplvicmbnw.R.inc(25658);individuals.add(s);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25659);individuals.addAll(o);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25660);return dataFactory.getOWLDifferentIndividualsAxiom(individuals,
                anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25661);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25662);return DIFFERENT_INDIVIDUALS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class IndividualAnnotationItemParser implements
        AnnotatedListItemParser<OWLIndividual, OWLAnnotation> {

        @Override
        public OWLAnnotation parseItem(OWLIndividual s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25663);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25664);return parseAnnotation();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLIndividual s, OWLAnnotation o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25665);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25666);if ((((s.isAnonymous())&&(__CLR4_5_2hsphsplvicmbnw.R.iget(25667)!=0|true))||(__CLR4_5_2hsphsplvicmbnw.R.iget(25668)==0&false))) {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25669);return dataFactory.getOWLAnnotationAssertionAxiom(s
                    .asOWLAnonymousIndividual(), o, anns);
            } }else {{
                __CLR4_5_2hsphsplvicmbnw.R.inc(25670);return dataFactory.getOWLAnnotationAssertionAxiom(s
                    .asOWLNamedIndividual().getIRI(), o, anns);
            }
        }}finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25671);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25672);return ANNOTATIONS;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    abstract class AnnotatedIRIListItemParser<F> implements
        AnnotatedListItemParser<F, IRI> {

        @Override
        public IRI parseItem(F s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25673);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25674);return parseIRI();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class AnnotationPropertySubPropertyOfListItemParser implements
        AnnotatedListItemParser<OWLAnnotationProperty, OWLAnnotationProperty> {

        @Override
        public OWLAnnotationProperty parseItem(OWLAnnotationProperty s) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25675);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25676);return parseAnnotationProperty();
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public OWLAxiom createAxiom(OWLAnnotationProperty s,
            OWLAnnotationProperty o, Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25677);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25678);return dataFactory.getOWLSubAnnotationPropertyOfAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25679);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25680);return SUB_PROPERTY_OF;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class AnnotationPropertyDomainListItemParser extends
        AnnotatedIRIListItemParser<OWLAnnotationProperty> {

        @Override
        public OWLAxiom createAxiom(OWLAnnotationProperty s, IRI o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25681);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25682);return dataFactory.getOWLAnnotationPropertyDomainAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25683);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25684);return DOMAIN;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }

    class AnnotationPropertyRangeListItemParser extends
        AnnotatedIRIListItemParser<OWLAnnotationProperty> {

        @Override
        public OWLAxiom createAxiom(OWLAnnotationProperty s, IRI o,
            Set<OWLAnnotation> anns) {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25685);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25686);return dataFactory.getOWLAnnotationPropertyRangeAxiom(s, o, anns);
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}

        @Override
        public ManchesterOWLSyntax getFrameSectionKeyword() {try{__CLR4_5_2hsphsplvicmbnw.R.inc(25687);
            __CLR4_5_2hsphsplvicmbnw.R.inc(25688);return RANGE;
        }finally{__CLR4_5_2hsphsplvicmbnw.R.flushNeeded();}}
    }
}
