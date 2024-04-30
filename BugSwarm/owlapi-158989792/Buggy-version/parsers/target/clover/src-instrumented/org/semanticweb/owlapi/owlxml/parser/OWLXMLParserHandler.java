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
package org.semanticweb.owlapi.owlxml.parser;

import static org.semanticweb.owlapi.owlxml.parser.PARSER_OWLXMLVocabulary.*;
import static org.semanticweb.owlapi.vocab.OWLXMLVocabulary.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.RemappingIndividualProvider;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * A handler which knows about OWLXML.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
class OWLXMLParserHandler extends DefaultHandler implements OWLAnonymousIndividualByIdProvider {public static class __CLR4_5_2li6li6lvicmc0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntologyManager owlOntologyManager;
    @Nonnull private final OWLOntology ontology;
    private final List<OWLElementHandler<?>> handlerStack;
    @Nonnull private final Map<String, PARSER_OWLXMLVocabulary> handlerMap = new HashMap<>();
    @Nonnull private final Map<String, String> prefixName2PrefixMap = new HashMap<>();
    private Locator locator;
    private final Stack<URI> bases;
    @Nonnull private final OWLOntologyLoaderConfiguration configuration;
    private final RemappingIndividualProvider anonProvider;

    /**
     * @param ontology
     *        ontology to parse into
     */
    public OWLXMLParserHandler(@Nonnull OWLOntology ontology) {
        this(ontology, null, ontology.getOWLOntologyManager().getOntologyLoaderConfiguration());__CLR4_5_2li6li6lvicmc0s.R.inc(27871);try{__CLR4_5_2li6li6lvicmc0s.R.inc(27870);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology to add to
     * @param configuration
     *        load configuration
     */
    public OWLXMLParserHandler(@Nonnull OWLOntology ontology, @Nonnull OWLOntologyLoaderConfiguration configuration) {
        this(ontology, null, configuration);__CLR4_5_2li6li6lvicmc0s.R.inc(27873);try{__CLR4_5_2li6li6lvicmc0s.R.inc(27872);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void setDocumentLocator(Locator locator) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27874);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27875);super.setDocumentLocator(locator);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27876);this.locator = locator;
        __CLR4_5_2li6li6lvicmc0s.R.inc(27877);URI base = null;
        __CLR4_5_2li6li6lvicmc0s.R.inc(27878);try {
            __CLR4_5_2li6li6lvicmc0s.R.inc(27879);String systemId = locator.getSystemId();
            __CLR4_5_2li6li6lvicmc0s.R.inc(27880);if ((((systemId != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(27881)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(27882)==0&false))) {{
                __CLR4_5_2li6li6lvicmc0s.R.inc(27883);base = new URI(systemId);
            }
        }} catch (URISyntaxException e) {}
        __CLR4_5_2li6li6lvicmc0s.R.inc(27884);bases.push(base);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology to parse into
     * @param topHandler
     *        top level handler
     */
    public OWLXMLParserHandler(OWLOntology ontology, OWLElementHandler<?> topHandler) {
        this(ontology, topHandler, ontology.getOWLOntologyManager().getOntologyLoaderConfiguration());__CLR4_5_2li6li6lvicmc0s.R.inc(27886);try{__CLR4_5_2li6li6lvicmc0s.R.inc(27885);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * Creates an OWLXML handler with the specified top level handler. This
     * allows OWL/XML representations of axioms to be embedded in abitrary XML
     * documents e.g. DIG 2.0 documents. (The default handler behaviour expects
     * the top level element to be an Ontology element).
     * 
     * @param ontology
     *        The ontology object that the XML representation should be parsed
     *        into.
     * @param topHandler
     *        top level handler
     * @param configuration
     *        load configuration
     */
    public OWLXMLParserHandler(OWLOntology ontology, @Nullable OWLElementHandler<?> topHandler,
        @Nonnull OWLOntologyLoaderConfiguration configuration) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27887);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27888);owlOntologyManager = ontology.getOWLOntologyManager();
        __CLR4_5_2li6li6lvicmc0s.R.inc(27889);this.ontology = ontology;
        __CLR4_5_2li6li6lvicmc0s.R.inc(27890);bases = new Stack<>();
        __CLR4_5_2li6li6lvicmc0s.R.inc(27891);this.configuration = configuration;
        __CLR4_5_2li6li6lvicmc0s.R.inc(27892);handlerStack = new ArrayList<>();
        __CLR4_5_2li6li6lvicmc0s.R.inc(27893);anonProvider = new RemappingIndividualProvider(owlOntologyManager.getOWLDataFactory());
        __CLR4_5_2li6li6lvicmc0s.R.inc(27894);prefixName2PrefixMap.put("owl:", Namespaces.OWL.toString());
        __CLR4_5_2li6li6lvicmc0s.R.inc(27895);prefixName2PrefixMap.put("xsd:", Namespaces.XSD.toString());
        __CLR4_5_2li6li6lvicmc0s.R.inc(27896);if ((((topHandler != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(27897)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(27898)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(27899);handlerStack.add(0, topHandler);
        }
        }__CLR4_5_2li6li6lvicmc0s.R.inc(27900);addFactory(PARSER_ONTOLOGY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27901);addFactory(PARSER_ANNOTATION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27902);addFactory(PARSER_LITERAL, "Constant");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27903);addFactory(PARSER_IMPORT, "Imports");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27904);addFactory(PARSER_CLASS, "OWLClass");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27905);addFactory(PARSER_ANNOTATION_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27906);addFactory(PARSER_ANNOTATION_PROPERTY_DOMAIN);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27907);addFactory(PARSER_ANNOTATION_PROPERTY_RANGE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27908);addFactory(PARSER_SUB_ANNOTATION_PROPERTY_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27909);addFactory(PARSER_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27910);addFactory(PARSER_OBJECT_INVERSE_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27911);addFactory(PARSER_DATA_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27912);addFactory(PARSER_NAMED_INDIVIDUAL, "Individual");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27913);addFactory(PARSER_DATA_COMPLEMENT_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27914);addFactory(PARSER_DATA_ONE_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27915);addFactory(PARSER_DATATYPE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27916);addFactory(PARSER_DATATYPE_RESTRICTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27917);addFactory(PARSER_DATA_INTERSECTION_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27918);addFactory(PARSER_DATA_UNION_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27919);addFactory(PARSER_FACET_RESTRICTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27920);addFactory(PARSER_OBJECT_INTERSECTION_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27921);addFactory(PARSER_OBJECT_UNION_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27922);addFactory(PARSER_OBJECT_COMPLEMENT_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27923);addFactory(PARSER_OBJECT_ONE_OF);
        // Object Restrictions
        __CLR4_5_2li6li6lvicmc0s.R.inc(27924);addFactory(PARSER_OBJECT_SOME_VALUES_FROM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27925);addFactory(PARSER_OBJECT_ALL_VALUES_FROM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27926);addFactory(PARSER_OBJECT_HAS_SELF, "ObjectExistsSelf");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27927);addFactory(PARSER_OBJECT_HAS_VALUE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27928);addFactory(PARSER_OBJECT_MIN_CARDINALITY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27929);addFactory(PARSER_OBJECT_EXACT_CARDINALITY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27930);addFactory(PARSER_OBJECT_MAX_CARDINALITY);
        // Data Restrictions
        __CLR4_5_2li6li6lvicmc0s.R.inc(27931);addFactory(PARSER_DATA_SOME_VALUES_FROM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27932);addFactory(PARSER_DATA_ALL_VALUES_FROM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27933);addFactory(PARSER_DATA_HAS_VALUE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27934);addFactory(PARSER_DATA_MIN_CARDINALITY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27935);addFactory(PARSER_DATA_EXACT_CARDINALITY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27936);addFactory(PARSER_DATA_MAX_CARDINALITY);
        // Axioms
        __CLR4_5_2li6li6lvicmc0s.R.inc(27937);addFactory(PARSER_SUB_CLASS_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27938);addFactory(PARSER_EQUIVALENT_CLASSES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27939);addFactory(PARSER_DISJOINT_CLASSES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27940);addFactory(PARSER_DISJOINT_UNION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27941);addFactory(PARSER_UNION_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27942);addFactory(PARSER_SUB_OBJECT_PROPERTY_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27943);addFactory(PARSER_OBJECT_PROPERTY_CHAIN, "SubObjectPropertyChain");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27944);addFactory(PARSER_OBJECT_PROPERTY_CHAIN);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27945);addFactory(PARSER_EQUIVALENT_OBJECT_PROPERTIES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27946);addFactory(PARSER_DISJOINT_OBJECT_PROPERTIES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27947);addFactory(PARSER_OBJECT_PROPERTY_DOMAIN);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27948);addFactory(PARSER_OBJECT_PROPERTY_RANGE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27949);addFactory(PARSER_INVERSE_OBJECT_PROPERTIES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27950);addFactory(PARSER_FUNCTIONAL_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27951);addFactory(PARSER_INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27952);addFactory(PARSER_SYMMETRIC_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27953);addFactory(PARSER_ASYMMETRIC_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27954);addFactory(PARSER_REFLEXIVE_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27955);addFactory(PARSER_IRREFLEXIVE_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27956);addFactory(PARSER_TRANSITIVE_OBJECT_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27957);addFactory(PARSER_SUB_DATA_PROPERTY_OF);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27958);addFactory(PARSER_EQUIVALENT_DATA_PROPERTIES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27959);addFactory(PARSER_DISJOINT_DATA_PROPERTIES);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27960);addFactory(PARSER_DATA_PROPERTY_DOMAIN);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27961);addFactory(PARSER_DATA_PROPERTY_RANGE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27962);addFactory(PARSER_FUNCTIONAL_DATA_PROPERTY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27963);addFactory(PARSER_SAME_INDIVIDUAL, "SameIndividuals");
        __CLR4_5_2li6li6lvicmc0s.R.inc(27964);addFactory(PARSER_DIFFERENT_INDIVIDUALS);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27965);addFactory(PARSER_CLASS_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27966);addFactory(PARSER_OBJECT_PROPERTY_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27967);addFactory(PARSER_NEGATIVE_OBJECT_PROPERTY_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27968);addFactory(PARSER_NEGATIVE_DATA_PROPERTY_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27969);addFactory(PARSER_DATA_PROPERTY_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27970);addFactory(PARSER_ANNOTATION_ASSERTION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27971);addFactory(PARSER_ENTITY_ANNOTATION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27972);addFactory(PARSER_DECLARATION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27973);addFactory(PARSER_IRI_ELEMENT);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27974);addFactory(PARSER_ABBREVIATED_IRI_ELEMENT);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27975);addFactory(PARSER_ANONYMOUS_INDIVIDUAL);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27976);addFactory(PARSER_HAS_KEY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27977);addFactory(PARSER_DATATYPE_DEFINITION);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27978);addFactory(PARSER_DL_SAFE_RULE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27979);addFactory(PARSER_BODY);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27980);addFactory(PARSER_HEAD);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27981);addFactory(PARSER_VARIABLE);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27982);addFactory(PARSER_CLASS_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27983);addFactory(PARSER_OBJECT_PROPERTY_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27984);addFactory(PARSER_DATA_PROPERTY_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27985);addFactory(PARSER_DATA_RANGE_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27986);addFactory(PARSER_BUILT_IN_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27987);addFactory(PARSER_DIFFERENT_INDIVIDUALS_ATOM);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27988);addFactory(PARSER_SAME_INDIVIDUAL_ATOM);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public OWLAnonymousIndividual getOWLAnonymousIndividual(String nodeId) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27989);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27990);return anonProvider.getOWLAnonymousIndividual(nodeId);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return config
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration getConfiguration() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27991);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27992);return configuration;
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * Gets the line number that the parser is at.
     * 
     * @return A positive integer that represents the line number or -1 if the
     *         line number is not known.
     */
    public int getLineNumber() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27993);
        __CLR4_5_2li6li6lvicmc0s.R.inc(27994);if ((((locator != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(27995)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(27996)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(27997);return locator.getLineNumber();
        } }else {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(27998);return -1;
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return column number
     */
    public int getColumnNumber() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(27999);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28000);if ((((locator != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28001)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28002)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28003);return locator.getColumnNumber();
        } }else {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28004);return -1;
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    private final Map<String, IRI> iriMap = new HashMap<>();

    /**
     * @param iriStr
     *        iri
     * @return parsed, absolute iri
     */
    @Nonnull
    public IRI getIRI(String iriStr) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28005);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28006);try {
            __CLR4_5_2li6li6lvicmc0s.R.inc(28007);IRI iri = iriMap.get(iriStr);
            __CLR4_5_2li6li6lvicmc0s.R.inc(28008);if ((((iri == null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28009)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28010)==0&false))) {{
                __CLR4_5_2li6li6lvicmc0s.R.inc(28011);URI uri = new URI(iriStr);
                __CLR4_5_2li6li6lvicmc0s.R.inc(28012);if ((((!uri.isAbsolute())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28013)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28014)==0&false))) {{
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28015);URI base = getBase();
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28016);if ((((base == null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28017)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28018)==0&false))) {{
                        __CLR4_5_2li6li6lvicmc0s.R.inc(28019);throw new OWLXMLParserException(this, "Unable to resolve relative URI");
                    }
                    }__CLR4_5_2li6li6lvicmc0s.R.inc(28020);iri = IRI.create(base + iriStr);
                } }else {{
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28021);iri = IRI.create(uri);
                }
                }__CLR4_5_2li6li6lvicmc0s.R.inc(28022);iriMap.put(iriStr, iri);
            }
            }__CLR4_5_2li6li6lvicmc0s.R.inc(28023);return iri;
        } catch (URISyntaxException e) {
            __CLR4_5_2li6li6lvicmc0s.R.inc(28024);throw new OWLParserException(e, getLineNumber(), getColumnNumber());
        }
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    private static String getNormalisedAbbreviatedIRI(String input) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28025);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28026);if ((((input.indexOf(':') != -1)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28027)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28028)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28029);return input;
        } }else {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28030);return ':' + input;
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @param abbreviatedIRI
     *        short iri
     * @return extended iri
     */
    @Nonnull
    public IRI getAbbreviatedIRI(String abbreviatedIRI) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28031);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28032);String normalisedAbbreviatedIRI = getNormalisedAbbreviatedIRI(abbreviatedIRI);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28033);int sepIndex = normalisedAbbreviatedIRI.indexOf(':');
        __CLR4_5_2li6li6lvicmc0s.R.inc(28034);String prefixName = normalisedAbbreviatedIRI.substring(0, sepIndex + 1);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28035);String localName = normalisedAbbreviatedIRI.substring(sepIndex + 1);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28036);String base = prefixName2PrefixMap.get(prefixName);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28037);if ((((base == null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28038)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28039)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28040);throw new OWLXMLParserException(this, "Prefix name not defined: " + prefixName);
        }
        }__CLR4_5_2li6li6lvicmc0s.R.inc(28041);return getIRI(base + localName);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return prefix name to prefix
     */
    @Nonnull
    public Map<String, String> getPrefixName2PrefixMap() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28042);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28043);return prefixName2PrefixMap;
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    private void addFactory(PARSER_OWLXMLVocabulary factory, String... legacyElementNames) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28044);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28045);handlerMap.put(factory.getShortName(), factory);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28046);for (String elementName : legacyElementNames) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28047);handlerMap.put(elementName, factory);
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return ontology
     */
    @Nonnull
    public OWLOntology getOntology() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28048);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28049);return ontology;
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return data factory
     */
    @Nonnull
    public OWLDataFactory getDataFactory() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28050);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28051);return getOWLOntologyManager().getOWLDataFactory();
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void startDocument() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28052);}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void endDocument() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28053);}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28054);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28055);if ((((!handlerStack.isEmpty())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28056)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28057)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28058);try {
                __CLR4_5_2li6li6lvicmc0s.R.inc(28059);OWLElementHandler<?> handler = handlerStack.get(0);
                __CLR4_5_2li6li6lvicmc0s.R.inc(28060);if ((((handler.isTextContentPossible())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28061)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28062)==0&false))) {{
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28063);handler.handleChars(ch, start, length);
                }
            }} catch (OWLRuntimeException e) {
                __CLR4_5_2li6li6lvicmc0s.R.inc(28064);throw new SAXException(e);
            }
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28065);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28066);processXMLBase(attributes);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28067);if ((((localName.equals(PREFIX.getShortForm()))&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28068)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28069)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28070);String name = attributes.getValue(NAME_ATTRIBUTE.getShortForm());
            __CLR4_5_2li6li6lvicmc0s.R.inc(28071);String iriString = attributes.getValue(IRI_ATTRIBUTE.getShortForm());
            __CLR4_5_2li6li6lvicmc0s.R.inc(28072);if ((((name != null && iriString != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28073)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28074)==0&false))) {{
                __CLR4_5_2li6li6lvicmc0s.R.inc(28075);if ((((name.endsWith(":"))&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28076)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28077)==0&false))) {{
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28078);prefixName2PrefixMap.put(name, iriString);
                } }else {{
                    __CLR4_5_2li6li6lvicmc0s.R.inc(28079);prefixName2PrefixMap.put(name + ':', iriString);
                }
            }}
            }__CLR4_5_2li6li6lvicmc0s.R.inc(28080);return;
        }
        }__CLR4_5_2li6li6lvicmc0s.R.inc(28081);PARSER_OWLXMLVocabulary handlerFactory = handlerMap.get(localName);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28082);if ((((handlerFactory != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28083)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28084)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28085);OWLElementHandler<?> handler = handlerFactory.createHandler(this);
            __CLR4_5_2li6li6lvicmc0s.R.inc(28086);if ((((!handlerStack.isEmpty())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28087)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28088)==0&false))) {{
                __CLR4_5_2li6li6lvicmc0s.R.inc(28089);handler.setParentHandler(handlerStack.get(0));
            }
            }__CLR4_5_2li6li6lvicmc0s.R.inc(28090);handlerStack.add(0, handler);
            __CLR4_5_2li6li6lvicmc0s.R.inc(28091);for (int i = 0; (((i < attributes.getLength())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28092)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28093)==0&false)); i++) {{
                __CLR4_5_2li6li6lvicmc0s.R.inc(28094);handler.attribute(attributes.getLocalName(i), attributes.getValue(i));
            }
            }__CLR4_5_2li6li6lvicmc0s.R.inc(28095);handler.startElement(localName);
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    protected void processXMLBase(Attributes attributes) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28096);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28097);String base = attributes.getValue(Namespaces.XML.toString(), "base");
        __CLR4_5_2li6li6lvicmc0s.R.inc(28098);if ((((base != null)&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28099)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28100)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28101);bases.push(URI.create(base));
        } }else {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28102);bases.push(bases.peek());
        }
    }}finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * Return the base URI for resolution of relative URIs.
     * 
     * @return base URI or null if unavailable (xml:base not present and the
     *         document locator does not provide a URI)
     */
    public URI getBase() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28103);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28104);return bases.peek();
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void endElement(String uri, String localName, String qName) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28105);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28106);if ((((localName.equals(PREFIX.getShortForm()))&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28107)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28108)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28109);return;
        }
        }__CLR4_5_2li6li6lvicmc0s.R.inc(28110);if ((((!handlerStack.isEmpty())&&(__CLR4_5_2li6li6lvicmc0s.R.iget(28111)!=0|true))||(__CLR4_5_2li6li6lvicmc0s.R.iget(28112)==0&false))) {{
            __CLR4_5_2li6li6lvicmc0s.R.inc(28113);OWLElementHandler<?> handler = handlerStack.remove(0);
            __CLR4_5_2li6li6lvicmc0s.R.inc(28114);handler.endElement();
        }
        }__CLR4_5_2li6li6lvicmc0s.R.inc(28115);bases.pop();
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public void startPrefixMapping(String prefix, String uri) {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28116);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28117);prefixName2PrefixMap.put(prefix, uri);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28118);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28119);return super.resolveEntity(publicId, systemId);
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}

    /**
     * @return manager
     */
    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_2li6li6lvicmc0s.R.inc(28120);
        __CLR4_5_2li6li6lvicmc0s.R.inc(28121);return owlOntologyManager;
    }finally{__CLR4_5_2li6li6lvicmc0s.R.flushNeeded();}}
}
