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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;
import static org.semanticweb.owlapi.vocab.SWRLVocabulary.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLIArgument;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.SWRLVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class Translators {public static class __CLR4_5_2ph5ph5lvicmcvw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,33888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(Translators.class);

    private Translators() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33017);}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

    static OptimisedListTranslator<OWLPropertyExpression> getListTranslator(
            OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33018);
        __CLR4_5_2ph5ph5lvicmcvw.R.inc(33019);return new OptimisedListTranslator<>(consumer,
                new HasKeyListItemTranslator(consumer));
    }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

    static class TranslatorAccessor {

        /**
         * A translator for lists of class expressions (such lists are used in
         * intersections, unions etc.)
         */
        private final OptimisedListTranslator<OWLClassExpression> classExpressionListTranslator;
        /** The class expression translators. */
        private final List<ClassExpressionTranslator> classExpressionTranslators = new ArrayList<>();
        /**
         * A translator for individual lists (such lists are used in object
         * oneOf constructs)
         */
        private final OptimisedListTranslator<OWLIndividual> individualListTranslator;
        /** The object property list translator. */
        private final OptimisedListTranslator<OWLObjectPropertyExpression> objectPropertyListTranslator;
        /** The constant list translator. */
        private final OptimisedListTranslator<OWLLiteral> constantListTranslator;
        /** The data property list translator. */
        private final OptimisedListTranslator<OWLDataPropertyExpression> dataPropertyListTranslator;
        /** The data range list translator. */
        private final OptimisedListTranslator<OWLDataRange> dataRangeListTranslator;
        /** The face restriction list translator. */
        private final OptimisedListTranslator<OWLFacetRestriction> faceRestrictionListTranslator;
        private final OWLRDFConsumer consumer;

        TranslatorAccessor(OWLRDFConsumer r) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33020);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33021);consumer = r;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33022);classExpressionListTranslator = new OptimisedListTranslator<>(r,
                    new ClassExpressionListItemTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33023);individualListTranslator = new OptimisedListTranslator<>(r,
                    new IndividualListItemTranslator(r));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33024);constantListTranslator = new OptimisedListTranslator<>(r,
                    new TypedConstantListItemTranslator());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33025);objectPropertyListTranslator = new OptimisedListTranslator<>(r,
                    new ObjectPropertyListItemTranslator(r));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33026);dataPropertyListTranslator = new OptimisedListTranslator<>(r,
                    new DataPropertyListItemTranslator(r));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33027);dataRangeListTranslator = new OptimisedListTranslator<>(r,
                    new DataRangeListItemTranslator(r));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33028);faceRestrictionListTranslator = new OptimisedListTranslator<>(r,
                    new OWLFacetRestrictionListItemTranslator(r));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33029);classExpressionTranslators.add(new NamedClassTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33030);classExpressionTranslators.add(new ObjectIntersectionOfTranslator(
                    r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33031);classExpressionTranslators
                    .add(new ObjectUnionOfTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33032);classExpressionTranslators.add(new ObjectComplementOfTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33033);classExpressionTranslators.add(new ObjectOneOfTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33034);classExpressionTranslators.add(new ObjectSomeValuesFromTranslator(
                    r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33035);classExpressionTranslators.add(new ObjectAllValuesFromTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33036);classExpressionTranslators
                    .add(new ObjectHasValueTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33037);classExpressionTranslators
                    .add(new ObjectHasSelfTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33038);classExpressionTranslators
                    .add(new ObjectMinQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33039);classExpressionTranslators
                    .add(new ObjectMaxQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33040);classExpressionTranslators
                    .add(new ObjectQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33041);classExpressionTranslators.add(new ObjectMinCardinalityTranslator(
                    r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33042);classExpressionTranslators.add(new ObjectMaxCardinalityTranslator(
                    r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33043);classExpressionTranslators.add(new ObjectCardinalityTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33044);classExpressionTranslators.add(new DataSomeValuesFromTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33045);classExpressionTranslators.add(new DataAllValuesFromTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33046);classExpressionTranslators.add(new DataHasValueTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33047);classExpressionTranslators
                    .add(new DataMinQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33048);classExpressionTranslators
                    .add(new DataMaxQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33049);classExpressionTranslators
                    .add(new DataQualifiedCardinalityTranslator(r, this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33050);classExpressionTranslators.add(new DataMinCardinalityTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33051);classExpressionTranslators.add(new DataMaxCardinalityTranslator(r,
                    this));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33052);classExpressionTranslators.add(new DataCardinalityTranslator(r,
                    this));
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLClassExpression> translateToClassExpressionSet(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33053);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33054);return classExpressionListTranslator.translateToSet(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        private OWLClassExpression translateClassExpressionInternal(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33055);
            // Some optimisations...
            // We either have a class or a restriction
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33056);Mode mode = (((consumer.getConfiguration().isStrict() )&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33057)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33058)==0&false))? Mode.STRICT
                    : Mode.LAX;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33059);for (ClassExpressionTranslator translator : classExpressionTranslators) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33060);if ((((translator.matches(mainNode, mode))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33061)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33062)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33063);return translator.translate(mainNode);
                }
            }}
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33064);if ((((!consumer.isAnonymousNode(mainNode))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33065)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33066)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33067);return consumer.getDataFactory().getOWLClass(mainNode);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33068);return consumer.generateAndLogParseError(EntityType.CLASS,
                        mainNode);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        public void consumeSWRLRules(Set<IRI> swrlRules) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33069);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33070);SWRLRuleTranslator translator = new SWRLRuleTranslator(consumer,
                    this);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33071);for (IRI ruleIRI : swrlRules) {{
                assert (((ruleIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33072)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33073)==0&false));
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33074);translator.translateRule(ruleIRI);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        public OWLClassExpression getClassExpressionIfTranslated(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33075);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33076);return translatedClassExpression.get(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        public void cleanup() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33077);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33078);translatedClassExpression.clear();
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected List<OWLObjectPropertyExpression>
                translateToObjectPropertyList(@Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33079);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33080);return objectPropertyListTranslator.translateList(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected List<OWLDataPropertyExpression> translateToDataPropertyList(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33081);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33082);return dataPropertyListTranslator.translateList(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLLiteral> translateToConstantSet(@Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33083);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33084);return constantListTranslator.translateToSet(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLIndividual> translateToIndividualSet(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33085);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33086);return individualListTranslator.translateToSet(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLDataRange> translateToDataRangeSet(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33087);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33088);return dataRangeListTranslator.translateToSet(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        protected Set<OWLFacetRestriction> translateToFacetRestrictionSet(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33089);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33090);return faceRestrictionListTranslator.translateToSet(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        private final Map<IRI, OWLClassExpression> translatedClassExpression = new HashMap<>();

        @Nonnull
        protected OWLClassExpression translateClassExpression(
                @Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33091);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33092);OWLClassExpression ce = translatedClassExpression.get(mainNode);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33093);if ((((ce == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33094)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33095)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33096);ce = translateClassExpressionInternal(mainNode);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33097);translatedClassExpression.put(mainNode, ce);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33098);return ce;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    abstract static class AbstractClassExpressionTranslator implements
            ClassExpressionTranslator {

        private final OWLRDFConsumer consumer;
        private final ClassExpressionMatcher classExpressionMatcher = new ClassExpressionMatcher();
        private final DataRangeMatcher dataRangeMatcher = new DataRangeMatcher();
        private final IndividualMatcher individualMatcher = new IndividualMatcher();
        protected final TranslatorAccessor accessor;

        protected AbstractClassExpressionTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33099);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33100);this.consumer = consumer;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33101);this.accessor = accessor;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matches(IRI mainNode, Mode mode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33102);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33103);if ((((mode.equals(Mode.LAX))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33104)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33105)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33106);return matchesLax(mainNode);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33107);return matchesStrict(mainNode);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected OWLRDFConsumer getConsumer() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33108);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33109);return consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected OWLDataFactory getDataFactory() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33110);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33111);return consumer.getDataFactory();
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isAnonymous(@Nonnull IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33112);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33113);return consumer.isAnonymousNode(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isResourcePresent(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33114);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33115);return consumer.getResourceObject(mainNode, predicate, false) != null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isLiteralPresent(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33116);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33117);return consumer.getLiteralObject(mainNode, predicate, false) != null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isRestrictionStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33118);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33119);return consumer.isRestriction(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isRestrictionLax(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33120);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33121);return consumer.isRestriction(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isNonNegativeIntegerStrict(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33122);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33123);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate,
                    false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33124);if ((((literal == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33125)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33126)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33127);return false;
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33128);OWLDatatype datatype = literal.getDatatype();
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33129);OWL2Datatype nni = OWL2Datatype.XSD_NON_NEGATIVE_INTEGER;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33130);return datatype.getIRI().equals(nni.getIRI())
                    && nni.isInLexicalSpace(literal.getLiteral());
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isNonNegativeIntegerLax(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33131);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33132);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate,
                    false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33133);if ((((literal == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33134)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33135)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33136);return false;
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33137);return OWL2Datatype.XSD_INTEGER
                    .isInLexicalSpace(verifyNotNull(literal.getLiteral().trim()));
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected int
                translateInteger(IRI mainNode, OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33138);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33139);OWLLiteral literal = consumer.getLiteralObject(mainNode, predicate,
                    true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33140);if ((((literal == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33141)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33142)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33143);return 0;
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33144);try {
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33145);return Integer.parseInt(literal.getLiteral().trim());
            } catch (NumberFormatException e) {
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33146);return 0;
            }
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isClassExpressionStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33147);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33148);return consumer.isClassExpression(node)
                    && !consumer.isDataRange(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isClassExpressionStrict(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33149);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33150);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33151);return object != null && isClassExpressionStrict(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isClassExpressionLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33152);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33153);return consumer.isClassExpression(mainNode)
                    || consumer.isParsedAllTriples()
                    && !consumer.isDataRange(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isClassExpressionLax(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33154);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33155);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33156);return object != null && isClassExpressionLax(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isObjectPropertyStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33157);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33158);return consumer.isObjectPropertyOnly(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isObjectPropertyStrict(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33159);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33160);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33161);return object != null && isObjectPropertyStrict(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isObjectPropertyLax(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33162);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33163);return consumer.isObjectProperty(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isObjectPropertyLax(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33164);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33165);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33166);return object != null && isObjectPropertyLax(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataPropertyStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33167);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33168);return consumer.isDataPropertyOnly(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataPropertyStrict(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33169);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33170);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33171);return object != null && isDataPropertyStrict(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataPropertyLax(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33172);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33173);return consumer.isDataProperty(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataPropertyLax(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33174);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33175);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33176);return object != null && isDataPropertyLax(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataRangeStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33177);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33178);return consumer.isDataRange(node)
                    && !consumer.isClassExpression(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataRangeStrict(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33179);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33180);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33181);return isDataRangeStrict(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataRangeLax(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33182);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33183);return consumer.isParsedAllTriples() && consumer.isDataRange(node);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataRangeLax(IRI mainNode,
                OWLRDFVocabulary predicate) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33184);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33185);IRI object = consumer.getResourceObject(mainNode, predicate, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33186);return object != null && isDataRangeLax(object);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean
                isClassExpressionListStrict(IRI mainNode, int minSize) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33187);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33188);return isResourceListStrict(mainNode, classExpressionMatcher,
                    minSize);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isDataRangeListStrict(IRI mainNode, int minSize) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33189);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33190);return isResourceListStrict(mainNode, dataRangeMatcher, minSize);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isIndividualListStrict(IRI mainNode, int minSize) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33191);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33192);return isResourceListStrict(mainNode, individualMatcher, minSize);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        protected boolean isResourceListStrict(@Nullable IRI mainNode,
                TypeMatcher typeMatcher, int minSize) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33193);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33194);if ((((mainNode == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33195)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33196)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33197);return false;
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33198);IRI currentListNode = mainNode;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33199);Set<IRI> visitedListNodes = new HashSet<>();
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33200);int size = 0;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33201);while (true) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33202);IRI firstObject = consumer.getResourceObject(currentListNode,
                        RDF_FIRST, false);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33203);if ((((firstObject == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33204)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33205)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33206);return false;
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33207);if ((((!typeMatcher.isTypeStrict(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33208)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33209)==0&false))) {{
                    // Something in the list that is not of the required type
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33210);return false;
                } }else {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33211);size++;
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33212);IRI restObject = consumer.getResourceObject(currentListNode,
                        RDF_REST, false);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33213);if ((((visitedListNodes.contains(restObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33214)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33215)==0&false))) {{
                    // Cycle - Non-terminating
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33216);return false;
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33217);if ((((restObject == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33218)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33219)==0&false))) {{
                    // Not terminated properly
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33220);return false;
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33221);if ((((restObject.equals(RDF_NIL.getIRI()))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33222)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33223)==0&false))) {{
                    // Terminated properly
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33224);return size >= minSize;
                }
                // Carry on
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33225);visitedListNodes.add(restObject);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33226);currentListNode = restObject;
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        private interface TypeMatcher {

            boolean isTypeStrict(IRI node);
        }

        private class ClassExpressionMatcher implements TypeMatcher {

            ClassExpressionMatcher() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33227);}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33228);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33229);return isClassExpressionStrict(node);
            }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
        }

        private class DataRangeMatcher implements TypeMatcher {

            DataRangeMatcher() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33230);}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33231);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33232);return isDataRangeStrict(node);
            }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
        }

        private class IndividualMatcher implements TypeMatcher {

            IndividualMatcher() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33233);}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

            @Override
            public boolean isTypeStrict(IRI node) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33234);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33235);return true;
            }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
        }
    }

    static class ClassExpressionListItemTranslator implements
            ListItemTranslator<OWLClassExpression> {

        private final OWLRDFConsumer consumer;
        protected final TranslatorAccessor accessor;

        ClassExpressionListItemTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33236);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33237);this.consumer = consumer;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33238);this.accessor = accessor;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLClassExpression translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33239);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33240);consumer.addClassExpression(firstObject, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33241);return accessor.translateClassExpression(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLClassExpression translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33242);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33243);return consumer.getDataFactory().getOWLThing();
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * Give a node in an RDF graph, which represents the main node of an OWL
     * class expression, the {@code ClassExpressionTranslator} consumes the
     * triples that represent the class expression, and translates the triples
     * to the appropriate OWL API {@code OWLClassExpression} object.
     */
    public interface ClassExpressionTranslator {

        /**
         * @param mainNode
         *        mainNode
         * @param mode
         *        mode
         * @return true if parameter matches
         */
        boolean matches(@Nonnull IRI mainNode, @Nonnull Mode mode);

        /**
         * @param mainNode
         *        mainNode
         * @return true if parameter matches strictly
         */
        boolean matchesStrict(@Nonnull IRI mainNode);

        /**
         * @param mainNode
         *        mainNode
         * @return true if parameter matches in lax mode
         */
        boolean matchesLax(@Nonnull IRI mainNode);

        /**
         * Translates the specified main node into an {@code OWLClassExpression}
         * . All triples used in the translation are consumed.
         * 
         * @param mainNode
         *        The main node of the set of triples that represent the class
         *        expression.
         * @return The class expression that represents the translation.
         */
        @Nonnull
        OWLClassExpression translate(@Nonnull IRI mainNode);
    }

    static class DataAllValuesFromTranslator extends
            AbstractClassExpressionTranslator {

        DataAllValuesFromTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33245);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33244);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33246);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33247);return isRestrictionStrict(mainNode)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeStrict(mainNode, OWL_ALL_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33248);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33249);return isDataRangeLax(mainNode, OWL_ALL_VALUES_FROM)
                    && isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    || isDataPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isResourcePresent(mainNode, OWL_ALL_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataAllValuesFrom translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33250);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33251);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33252);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33253)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33254)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33255);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33256);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ALL_VALUES_FROM, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33257)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33258)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33259);OWLDataRange filler = getConsumer().translateDataRange(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33260);return getDataFactory().getOWLDataAllValuesFrom(property, filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33262);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33261);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33263);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33264);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33265);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33266);return isNonNegativeIntegerLax(mainNode, OWL_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataExactCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33267);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33268);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33269);int cardi = translateInteger(mainNode, OWL_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33270);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33271)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33272)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33273);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33274);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33275);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33276)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33277)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33278);OWLDataRange filler = getConsumer().translateDataRange(
                        fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33279);return getDataFactory().getOWLDataExactCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33280);return getDataFactory().getOWLDataExactCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataHasValueTranslator extends
            AbstractClassExpressionTranslator {

        DataHasValueTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33282);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33281);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33283);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33284);return isRestrictionStrict(mainNode)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isLiteralPresent(mainNode, OWL_HAS_VALUE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33285);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33286);return isLiteralPresent(mainNode, OWL_HAS_VALUE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataHasValue translate(@Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33287);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33288);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33289);OWLLiteral lit = getConsumer().getLiteralObject(mainNode,
                    OWL_HAS_VALUE, true);
            assert (((lit != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33290)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33291)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33292);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33293)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33294)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33295);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33296);return getDataFactory().getOWLDataHasValue(property, lit);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataMaxCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataMaxCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33298);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33297);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33299);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33300);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_MAX_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33301);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33302);return isNonNegativeIntegerLax(mainNode, OWL_MAX_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataMaxCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33303);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33304);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33305);int cardi = translateInteger(mainNode, OWL_MAX_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33306);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33307)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33308)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33309);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33310);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33311);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33312)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33313)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33314);OWLDataRange filler = getConsumer().translateDataRange(
                        fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33315);return getDataFactory().getOWLDataMaxCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33316);return getDataFactory().getOWLDataMaxCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataMaxQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataMaxQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33318);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33317);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33319);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33320);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_MAX_QUALIFIED_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeStrict(mainNode, OWL_ON_DATA_RANGE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33321);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33322);return isNonNegativeIntegerLax(mainNode,
                    OWL_MAX_QUALIFIED_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeLax(mainNode, OWL_ON_DATA_RANGE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataMaxCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33323);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33324);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33325);int cardi = translateInteger(mainNode,
                    OWL_MAX_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33326);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33327)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33328)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33329);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33330);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33331)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33332)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33333);OWLDataRange filler = getConsumer().translateDataRange(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33334);return getDataFactory().getOWLDataMaxCardinality(cardi, property,
                    filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataMinCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataMinCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33336);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33335);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33337);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33338);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_MIN_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33339);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33340);return isNonNegativeIntegerLax(mainNode, OWL_MIN_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataMinCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33341);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33342);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33343);int cardi = translateInteger(mainNode, OWL_MIN_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33344);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33345)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33346)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33347);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33348);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33349);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33350)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33351)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33352);OWLDataRange filler = getConsumer().translateDataRange(
                        fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33353);return getDataFactory().getOWLDataMinCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33354);return getDataFactory().getOWLDataMinCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataMinQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataMinQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33356);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33355);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33357);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33358);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_MIN_QUALIFIED_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeStrict(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33359);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33360);return isNonNegativeIntegerLax(mainNode,
                    OWL_MIN_QUALIFIED_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeLax(mainNode, OWL_ON_DATA_RANGE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataMinCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33361);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33362);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33363);int cardi = translateInteger(mainNode,
                    OWL_MIN_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33364);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33365)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33366)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33367);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33368);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33369)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33370)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33371);OWLDataRange filler = getConsumer().translateDataRange(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33372);return getDataFactory().getOWLDataMinCardinality(cardi, property,
                    filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataPropertyListItemTranslator implements
            ListItemTranslator<OWLDataPropertyExpression> {

        private final OWLRDFConsumer consumer;

        DataPropertyListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33373);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33374);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataPropertyExpression translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33375);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33376);consumer.addDataProperty(firstObject, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33377);return consumer.getOWLDataProperty(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataPropertyExpression translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33378);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33379);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        DataQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33381);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33380);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33382);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33383);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_QUALIFIED_CARDINALITY)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeStrict(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33384);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33385);return isNonNegativeIntegerLax(mainNode, OWL_QUALIFIED_CARDINALITY)
                    && isDataPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeLax(mainNode, OWL_ON_DATA_RANGE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataExactCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33386);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33387);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33388);int cardi = translateInteger(mainNode, OWL_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33389);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33390)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33391)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33392);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33393);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_DATA_RANGE, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33394)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33395)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33396);OWLDataRange filler = getConsumer().translateDataRange(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33397);return getDataFactory().getOWLDataExactCardinality(cardi, property,
                    filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataRangeListItemTranslator implements
            ListItemTranslator<OWLDataRange> {

        private final OWLRDFConsumer consumer;

        DataRangeListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33398);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33399);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataRange translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33400);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33401);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataRange translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33402);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33403);return consumer.translateDataRange(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class DataSomeValuesFromTranslator extends
            AbstractClassExpressionTranslator {

        DataSomeValuesFromTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33405);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33404);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33406);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33407);return isRestrictionStrict(mainNode)
                    && isDataPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isDataRangeStrict(mainNode, OWL_SOME_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33408);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33409);return isDataRangeLax(mainNode, OWL_SOME_VALUES_FROM)
                    && isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    || isDataPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isResourcePresent(mainNode, OWL_SOME_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLDataSomeValuesFrom translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33410);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33411);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33412);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33413)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33414)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33415);OWLDataPropertyExpression property = getConsumer()
                    .translateDataPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33416);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_SOME_VALUES_FROM, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33417)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33418)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33419);OWLDataRange filler = getConsumer().translateDataRange(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33420);return getDataFactory().getOWLDataSomeValuesFrom(property, filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class HasKeyListItemTranslator implements
            ListItemTranslator<OWLPropertyExpression> {

        private final OWLRDFConsumer consumer;

        HasKeyListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33421);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33422);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLPropertyExpression translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33423);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33424);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLPropertyExpression translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33425);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33426);if ((((consumer.isObjectPropertyOnly(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33427)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33428)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33429);return consumer.getDataFactory().getOWLObjectProperty(
                        firstObject);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33430);if ((((consumer.isDataPropertyOnly(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33431)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33432)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33433);return consumer.getDataFactory()
                        .getOWLDataProperty(firstObject);
            }
            // If neither condition was true, the property has been illegally
            // punned, or is untyped
            // use the first translation available, since there is no way to
            // know which is correct
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33434);OWLPropertyExpression property = null;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33435);if ((((consumer.isObjectProperty(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33436)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33437)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33438);LOGGER.warn(
                        "Property {} has been punned illegally: found declaration as OWLObjectProperty",
                        firstObject);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33439);property = consumer.getDataFactory().getOWLObjectProperty(
                        firstObject);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33440);if ((((consumer.isDataProperty(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33441)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33442)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33443);LOGGER.warn(
                        "Property {} has been punned illegally: found declaration as OWLDataProperty",
                        firstObject);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33444);if ((((property == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33445)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33446)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33447);property = consumer.getDataFactory().getOWLDataProperty(
                            firstObject);
                }
            }}
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33448);if ((((consumer.isAnnotationProperty(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33449)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33450)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33451);LOGGER.warn(
                        "Property {} has been punned illegally: found declaration as OWLAnnotationProperty",
                        firstObject);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33452);if ((((property == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33453)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33454)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33455);property = consumer.getDataFactory()
                            .getOWLAnnotationProperty(firstObject);
                }
            }}
            // if there is no declaration for the property at this point, warn
            // and consider it a datatype property.
            // This matches existing behaviour.
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33456);if ((((property == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33457)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33458)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33459);LOGGER.warn(
                        "Property {} is undeclared at this point in parsing: typing as OWLDataProperty",
                        firstObject);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33460);property = consumer.getDataFactory().getOWLDataProperty(
                        firstObject);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33461);return property;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class IndividualListItemTranslator implements
            ListItemTranslator<OWLIndividual> {

        private final OWLRDFConsumer consumer;

        IndividualListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33462);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33463);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLIndividual translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33464);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33465);return consumer.translateIndividual(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLIndividual translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33466);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33467);LOGGER.info("Cannot translate list item to individual, because rdf:first triple is a literal triple");
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33468);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * Translates and consumes an item in an RDF list.
     * 
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     * @param <O>
     *        type
     */
    public interface ListItemTranslator<O extends OWLObject> {

        /**
         * The rdf:first triple that represents the item to be translated. This
         * triple will point to something like a class expression, individual.
         * 
         * @param firstObject
         *        The rdf:first triple that points to the item to be translated.
         * @return The translated item.
         */
        O translate(@Nonnull IRI firstObject);

        /**
         * @param firstObject
         *        firstObject
         * @return translated item
         */
        O translate(@Nonnull OWLLiteral firstObject);
    }

    static class NamedClassTranslator extends AbstractClassExpressionTranslator {

        NamedClassTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33470);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33469);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33471);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33472);return !isAnonymous(mainNode) && isClassExpressionStrict(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33473);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33474);return !isAnonymous(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        /**
         * Translates the specified main node into an {@code OWLClassExpression}
         * . All triples used in the translation are consumed.
         * 
         * @param mainNode
         *        The main node of the set of triples that represent the class
         *        expression.
         * @return The class expression that represents the translation.
         */
        @Override
        public OWLClass translate(@Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33475);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33476);return getConsumer().getOWLClass(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class OWLFacetRestrictionListItemTranslator implements
            ListItemTranslator<OWLFacetRestriction> {

        private final OWLRDFConsumer consumer;

        OWLFacetRestrictionListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33477);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33478);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLFacetRestriction translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33479);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33480);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLFacetRestriction translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33481);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33482);for (OWLFacet facet : OWLFacet.values()) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33483);OWLLiteral lit = consumer.getLiteralObject(firstObject,
                        facet.getIRI(), true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33484);if ((((lit != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33485)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33486)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33487);return consumer.getDataFactory().getOWLFacetRestriction(
                            facet, lit);
                }
            }}
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33488);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class OWLObjectPropertyExpressionListItemTranslator implements
            ListItemTranslator<OWLObjectPropertyExpression> {

        private final OWLRDFConsumer consumer;

        OWLObjectPropertyExpressionListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33489);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33490);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectPropertyExpression translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33491);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33492);return consumer.translateObjectPropertyExpression(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectPropertyExpression translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33493);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33494);LOGGER.info("Cannot translate list item as an object property, because rdf:first triple is a literal triple");
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33495);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectAllValuesFromTranslator extends
            AbstractClassExpressionTranslator {

        ObjectAllValuesFromTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33497);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33496);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33498);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33499);return isRestrictionStrict(mainNode)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionStrict(mainNode, OWL_ALL_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33500);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33501);return isClassExpressionLax(mainNode, OWL_ALL_VALUES_FROM)
                    && isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    || isObjectPropertyLax(mainNode)
                    && isResourcePresent(mainNode, OWL_ALL_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectAllValuesFrom translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33502);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33503);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33504);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33505)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33506)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33507);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33508);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ALL_VALUES_FROM, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33509)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33510)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33511);OWLClassExpression filler = accessor
                    .translateClassExpression(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33512);return getDataFactory().getOWLObjectAllValuesFrom(property, filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33514);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33513);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33515);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33516);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33517);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33518);return isNonNegativeIntegerLax(mainNode, OWL_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectExactCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33519);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33520);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33521);int cardi = translateInteger(mainNode, OWL_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33522);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33523)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33524)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33525);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33526);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33527);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33528)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33529)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33530);OWLClassExpression filler = accessor
                        .translateClassExpression(fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33531);return getDataFactory().getOWLObjectExactCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33532);return getDataFactory().getOWLObjectExactCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * Translates a set of triples that represent an {@code OWLComplementOf}
     * class expression.
     * 
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectComplementOfTranslator extends
            AbstractClassExpressionTranslator {

        ObjectComplementOfTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33534);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33533);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33535);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33536);IRI complementOfIRI = getConsumer().getResourceObject(mainNode,
                    OWL_COMPLEMENT_OF, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33537);return isClassExpressionStrict(mainNode)
                    && isClassExpressionStrict(complementOfIRI);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33538);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33539);return isResourcePresent(mainNode, OWL_COMPLEMENT_OF)
                    && isClassExpressionLax(mainNode);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectComplementOf translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33540);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33541);IRI complementOfObject = getConsumer().getResourceObject(mainNode,
                    OWL_COMPLEMENT_OF, true);
            assert (((complementOfObject != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33542)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33543)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33544);OWLClassExpression operand = accessor
                    .translateClassExpression(complementOfObject);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33545);return getDataFactory().getOWLObjectComplementOf(operand);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectHasSelfTranslator extends
            AbstractClassExpressionTranslator {

        ObjectHasSelfTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33547);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33546);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33548);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33549);OWLLiteral literal = getConsumer().getLiteralObject(mainNode,
                    OWL_HAS_SELF.getIRI(), false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33550);return literal != null && isStrictBooleanTrueLiteral(literal)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        private static boolean isStrictBooleanTrueLiteral(OWLLiteral literal) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33551);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33552);return OWL2Datatype.XSD_BOOLEAN.getIRI().equals(
                    literal.getDatatype().getIRI())
                    && literal.getLiteral().toLowerCase(Locale.ENGLISH)
                            .equals("true");
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33553);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33554);return isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    && isLiteralPresent(mainNode, OWL_HAS_SELF);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectHasSelf translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33555);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33556);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33557);getConsumer().getLiteralObject(mainNode, OWL_HAS_SELF, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33558);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33559)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33560)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33561);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33562);return getDataFactory().getOWLObjectHasSelf(property);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectHasValueTranslator extends
            AbstractClassExpressionTranslator {

        ObjectHasValueTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33564);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33563);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33565);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33566);return isRestrictionStrict(mainNode)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isResourcePresent(mainNode, OWL_HAS_VALUE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33567);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33568);return isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    && isResourcePresent(mainNode, OWL_HAS_VALUE);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectHasValue translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33569);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33570);IRI value = getConsumer().getResourceObject(mainNode,
                    OWL_HAS_VALUE, true);
            assert (((value != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33571)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33572)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33573);OWLIndividual individual = getConsumer().translateIndividual(value);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33574);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33575)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33576)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33577);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33578);return getDataFactory().getOWLObjectHasValue(property, individual);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * A class expression translator which produces an {@code OWLIntersectionOf}
     * . This relies on the main node having an intersectionOf triple.
     * 
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectIntersectionOfTranslator extends
            AbstractClassExpressionTranslator {

        ObjectIntersectionOfTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33580);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33579);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33581);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33582);IRI listNode = getConsumer().getResourceObject(mainNode,
                    OWL_INTERSECTION_OF, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33583);return isClassExpressionStrict(mainNode)
                    && isClassExpressionListStrict(listNode, 2);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33584);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33585);return isResourcePresent(mainNode, OWL_INTERSECTION_OF);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectIntersectionOf translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33586);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33587);IRI listNode = getConsumer().getResourceObject(mainNode,
                    OWL_INTERSECTION_OF, true);
            assert (((listNode != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33588)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33589)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33590);Set<OWLClassExpression> classExpressions = accessor
                    .translateToClassExpressionSet(listNode);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33591);return getDataFactory()
                    .getOWLObjectIntersectionOf(classExpressions);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectMaxCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectMaxCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33593);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33592);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33594);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33595);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_MAX_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33596);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33597);return isNonNegativeIntegerLax(mainNode, OWL_MAX_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectMaxCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33598);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33599);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33600);int cardi = translateInteger(mainNode, OWL_MAX_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33601);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33602)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33603)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33604);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33605);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33606);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33607)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33608)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33609);OWLClassExpression filler = accessor
                        .translateClassExpression(fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33610);return getDataFactory().getOWLObjectMaxCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33611);return getDataFactory().getOWLObjectMaxCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University of Manchester, Bio-Health
     *         Informatics Group
     * @since 3.1.0
     */
    static class ObjectMaxQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectMaxQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33613);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33612);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33614);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33615);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_MAX_QUALIFIED_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionStrict(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33616);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33617);return isNonNegativeIntegerLax(mainNode,
                    OWL_MAX_QUALIFIED_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionLax(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectMaxCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33618);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33619);int cardi = translateInteger(mainNode,
                    OWL_MAX_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33620);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33621)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33622)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33623);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33624);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33625)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33626)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33627);OWLClassExpression filler = accessor
                    .translateClassExpression(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33628);return getDataFactory().getOWLObjectMaxCardinality(cardi, property,
                    filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectMinCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectMinCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33630);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33629);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33631);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33632);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode, OWL_MIN_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33633);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33634);return isNonNegativeIntegerLax(mainNode, OWL_MIN_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectMinCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33635);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33636);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33637);int cardi = translateInteger(mainNode, OWL_MIN_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33638);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33639)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33640)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33641);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33642);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33643);if ((((fillerIRI != null
                    && !getConsumer().getConfiguration().isStrict())&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33644)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33645)==0&false))) {{
                // Be tolerant
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33646);OWLClassExpression filler = accessor
                        .translateClassExpression(fillerIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33647);return getDataFactory().getOWLObjectMinCardinality(cardi,
                        property, filler);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33648);return getDataFactory().getOWLObjectMinCardinality(cardi,
                        property);
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectMinQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectMinQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33650);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33649);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33651);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33652);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_MIN_QUALIFIED_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionStrict(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33653);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33654);return isNonNegativeIntegerLax(mainNode,
                    OWL_MIN_QUALIFIED_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionLax(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectMinCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33655);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33656);int cardi = translateInteger(mainNode,
                    OWL_MIN_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33657);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33658)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33659)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33660);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33661);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33662)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33663)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33664);OWLClassExpression filler = accessor
                    .translateClassExpression(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33665);return getDataFactory().getOWLObjectMinCardinality(cardi, property,
                    filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class ObjectOneOfTranslator extends
            AbstractClassExpressionTranslator {

        ObjectOneOfTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33667);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33666);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33668);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33669);IRI listNode = getConsumer().getResourceObject(mainNode,
                    OWL_ONE_OF, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33670);return isIndividualListStrict(listNode, 1);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33671);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33672);return isResourcePresent(mainNode, OWL_ONE_OF);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectOneOf translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33673);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33674);IRI oneOfObject = getConsumer().getResourceObject(mainNode,
                    OWL_ONE_OF, true);
            assert (((oneOfObject != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33675)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33676)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33677);Set<OWLIndividual> individuals = accessor
                    .translateToIndividualSet(oneOfObject);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33678);return getDataFactory().getOWLObjectOneOf(individuals);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectPropertyListItemTranslator implements
            ListItemTranslator<OWLObjectPropertyExpression> {

        private final OWLRDFConsumer consumer;

        ObjectPropertyListItemTranslator(OWLRDFConsumer consumer) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33679);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33680);this.consumer = consumer;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        /**
         * The rdf:first triple that represents the item to be translated. This
         * triple will point to something like a class expression, individual.
         * 
         * @param firstObject
         *        The rdf:first triple that points to the item to be translated.
         * @return The translated item.
         */
        @Override
        public OWLObjectPropertyExpression translate(@Nonnull IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33681);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33682);consumer.addObjectProperty(firstObject, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33683);return consumer.translateObjectPropertyExpression(firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectPropertyExpression translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33684);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33685);LOGGER.info("Cannot translate list item as an object property, because rdf:first triple is a literal triple");
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33686);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University of Manchester, Bio-Health
     *         Informatics Group
     * @since 3.1.0
     */
    static class ObjectQualifiedCardinalityTranslator extends
            AbstractClassExpressionTranslator {

        ObjectQualifiedCardinalityTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33688);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33687);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33689);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33690);return isRestrictionStrict(mainNode)
                    && isNonNegativeIntegerStrict(mainNode,
                            OWL_QUALIFIED_CARDINALITY)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionStrict(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33691);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33692);return isNonNegativeIntegerLax(mainNode, OWL_QUALIFIED_CARDINALITY)
                    && isObjectPropertyLax(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionLax(mainNode, OWL_ON_CLASS);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectExactCardinality translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33693);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33694);int cardi = translateInteger(mainNode, OWL_QUALIFIED_CARDINALITY);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33695);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33696)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33697)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33698);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33699);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_CLASS, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33700)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33701)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33702);OWLClassExpression filler = accessor
                    .translateClassExpression(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33703);return getDataFactory().getOWLObjectExactCardinality(cardi,
                    property, filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectSomeValuesFromTranslator extends
            AbstractClassExpressionTranslator {

        ObjectSomeValuesFromTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33705);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33704);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33706);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33707);return isRestrictionStrict(mainNode)
                    && isObjectPropertyStrict(mainNode, OWL_ON_PROPERTY)
                    && isClassExpressionStrict(mainNode, OWL_SOME_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33708);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33709);return isClassExpressionLax(mainNode, OWL_SOME_VALUES_FROM)
                    && isResourcePresent(mainNode, OWL_ON_PROPERTY)
                    || isObjectPropertyLax(mainNode)
                    && isResourcePresent(mainNode, OWL_SOME_VALUES_FROM);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectSomeValuesFrom translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33710);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33711);getConsumer().consumeTriple(mainNode, RDF_TYPE.getIRI(),
                    OWL_RESTRICTION.getIRI());
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33712);IRI propertyIRI = getConsumer().getResourceObject(mainNode,
                    OWL_ON_PROPERTY, true);
            assert (((propertyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33713)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33714)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33715);OWLObjectPropertyExpression property = getConsumer()
                    .translateObjectPropertyExpression(propertyIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33716);IRI fillerIRI = getConsumer().getResourceObject(mainNode,
                    OWL_SOME_VALUES_FROM, true);
            assert (((fillerIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33717)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33718)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33719);OWLClassExpression filler = accessor
                    .translateClassExpression(fillerIRI);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33720);return getDataFactory()
                    .getOWLObjectSomeValuesFrom(property, filler);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    /**
     * Translates a set of triples to an {@code OWLUnionOf}.
     * 
     * @author Matthew Horridge, The University Of Manchester, Bio-Health
     *         Informatics Group
     * @since 2.0.0
     */
    static class ObjectUnionOfTranslator extends
            AbstractClassExpressionTranslator {

        ObjectUnionOfTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {
            super(consumer, accessor);__CLR4_5_2ph5ph5lvicmcvw.R.inc(33722);try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33721);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesStrict(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33723);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33724);IRI listNode = getConsumer().getResourceObject(mainNode,
                    OWL_UNION_OF, false);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33725);return isClassExpressionStrict(mainNode)
                    && isClassExpressionListStrict(listNode, 2);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public boolean matchesLax(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33726);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33727);return isResourcePresent(mainNode, OWL_UNION_OF);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLObjectUnionOf translate(IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33728);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33729);IRI listNode = getConsumer().getResourceObject(mainNode,
                    OWL_UNION_OF, true);
            assert (((listNode != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33730)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33731)==0&false));
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33732);Set<OWLClassExpression> classExpressions = accessor
                    .translateToClassExpressionSet(listNode);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33733);return getDataFactory().getOWLObjectUnionOf(classExpressions);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class SWRLAtomListItemTranslator implements
            ListItemTranslator<SWRLAtom> {

        private final OWLRDFConsumer consumer;
        protected final OWLDataFactory dataFactory;
        protected final TranslatorAccessor accessor;

        SWRLAtomListItemTranslator(OWLRDFConsumer consumer,
                TranslatorAccessor accessor) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33734);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33735);this.consumer = consumer;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33736);this.accessor = accessor;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33737);dataFactory = consumer.getDataFactory();
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public SWRLAtom translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33738);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33739);if ((((consumer.isSWRLBuiltInAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33740)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33741)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33742);IRI builtInIRI = consumer.getResourceObject(firstObject,
                        BUILT_IN.getIRI(), true);
                assert (((builtInIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33743)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33744)==0&false));
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33745);IRI mainIRI = consumer.getResourceObject(firstObject,
                        ARGUMENTS.getIRI(), true);
                assert (((mainIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33746)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33747)==0&false));
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33748);OptimisedListTranslator<SWRLDArgument> listTranslator = new OptimisedListTranslator<>(
                        consumer, new SWRLAtomDObjectListItemTranslator());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33749);List<SWRLDArgument> args = listTranslator
                        .translateList(mainIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33750);return dataFactory.getSWRLBuiltInAtom(builtInIRI, args);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33751);if ((((consumer.isSWRLClassAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33752)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33753)==0&false))) {{
                // C(?x) or C(ind)
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33754);SWRLIArgument iObject = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33755);IRI classIRI = consumer.getResourceObject(firstObject,
                        CLASS_PREDICATE.getIRI(), true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33756);if ((((classIRI == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33757)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33758)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33759);throw new OWLRuntimeException(
                            "Don't know how to translate SWRL Atom: class IRI is null "
                                    + firstObject);
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33760);OWLClassExpression desc = accessor
                        .translateClassExpression(classIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33761);return dataFactory.getSWRLClassAtom(desc, iObject);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33762);if ((((consumer.isSWRLDataRangeAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33763)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33764)==0&false))) {{
                // DR(?x) or DR(val)
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33765);SWRLDArgument dObject = translateSWRLAtomDObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33766);IRI dataRangeIRI = consumer.getResourceObject(firstObject,
                        DATA_RANGE.getIRI(), true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33767);if ((((dataRangeIRI == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33768)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33769)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33770);throw new OWLRuntimeException(
                            "Don't know how to translate SWRL Atom: data range IRI is null "
                                    + firstObject);
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33771);OWLDataRange dataRange = consumer
                        .translateDataRange(dataRangeIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33772);return dataFactory.getSWRLDataRangeAtom(dataRange, dObject);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33773);if ((((consumer.isSWRLDataValuedPropertyAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33774)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33775)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33776);SWRLIArgument arg1 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33777);SWRLDArgument arg2 = translateSWRLAtomDObject(firstObject,
                        ARGUMENT_2.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33778);IRI dataPropertyIRI = consumer.getResourceObject(firstObject,
                        PROPERTY_PREDICATE.getIRI(), true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33779);if ((((dataPropertyIRI == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33780)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33781)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33782);throw new OWLRuntimeException(
                            "Don't know how to translate SWRL Atom: data property IRI is null "
                                    + firstObject);
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33783);OWLDataPropertyExpression prop = consumer
                        .translateDataPropertyExpression(dataPropertyIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33784);return dataFactory.getSWRLDataPropertyAtom(prop, arg1, arg2);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33785);if ((((consumer.isSWRLIndividualPropertyAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33786)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33787)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33788);SWRLIArgument arg1 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33789);SWRLIArgument arg2 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_2.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33790);IRI objectPropertyIRI = consumer.getResourceObject(firstObject,
                        PROPERTY_PREDICATE.getIRI(), true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33791);if ((((objectPropertyIRI == null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33792)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33793)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33794);throw new OWLRuntimeException(
                            "Don't know how to translate SWRL Atom: object property IRI is null "
                                    + firstObject);
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33795);OWLObjectPropertyExpression prop = consumer
                        .translateObjectPropertyExpression(objectPropertyIRI);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33796);return dataFactory.getSWRLObjectPropertyAtom(prop, arg1, arg2);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33797);if ((((consumer.isSWRLSameAsAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33798)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33799)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33800);SWRLIArgument arg1 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33801);SWRLIArgument arg2 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_2.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33802);return dataFactory.getSWRLSameIndividualAtom(arg1, arg2);
            } }else {__CLR4_5_2ph5ph5lvicmcvw.R.inc(33803);if ((((consumer.isSWRLDifferentFromAtom(firstObject))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33804)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33805)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33806);SWRLIArgument arg1 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_1.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33807);SWRLIArgument arg2 = translateSWRLAtomIObject(firstObject,
                        ARGUMENT_2.getIRI());
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33808);return dataFactory.getSWRLDifferentIndividualsAtom(arg1, arg2);
            }
            }}}}}}}__CLR4_5_2ph5ph5lvicmcvw.R.inc(33809);throw new OWLRuntimeException(
                    "Don't know how to translate SWRL Atom: " + firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public SWRLAtom translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33810);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33811);throw new OWLRuntimeException("Unexpected literal in atom list: "
                    + firstObject);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        private SWRLIArgument translateSWRLAtomIObject(IRI mainIRI,
                IRI argPredicateIRI) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33812);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33813);IRI argIRI = consumer.getResourceObject(mainIRI, argPredicateIRI,
                    true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33814);if ((((argIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33815)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33816)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33817);if ((((consumer.isSWRLVariable(argIRI))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33818)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33819)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33820);return dataFactory.getSWRLVariable(argIRI);
                } }else {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33821);return dataFactory.getSWRLIndividualArgument(consumer
                            .getOWLIndividual(argIRI));
                }
            }} }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33822);throw new OWLRuntimeException(
                        "Cannot translate SWRL Atom I-Object for "
                                + argPredicateIRI + " Triple not found.");
            }
        }}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Nonnull
        private SWRLDArgument translateSWRLAtomDObject(IRI mainIRI,
                IRI argPredicateIRI) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33823);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33824);IRI argIRI = consumer.getResourceObject(mainIRI, argPredicateIRI,
                    true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33825);if ((((argIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33826)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33827)==0&false))) {{
                // Must be a variable -- double check
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33828);if ((((!consumer.isSWRLVariable(argIRI))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33829)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33830)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33831);LOGGER.info(
                            "Expected SWRL variable for SWRL Data Object: {} (possibly untyped)",
                            argIRI);
                }
                }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33832);return dataFactory.getSWRLVariable(argIRI);
            } }else {{
                // Must be a literal
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33833);OWLLiteral con = consumer.getLiteralObject(mainIRI,
                        argPredicateIRI, true);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33834);if ((((con != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33835)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33836)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33837);return dataFactory.getSWRLLiteralArgument(con);
                }
            }}
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33838);throw new IllegalStateException(
                    "Could not translate SWRL Atom D-Object");
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        private class SWRLAtomDObjectListItemTranslator implements
                ListItemTranslator<SWRLDArgument> {

            SWRLAtomDObjectListItemTranslator() {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33839);}finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

            @Override
            public SWRLDArgument translate(@Nonnull IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33840);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33841);return dataFactory.getSWRLVariable(firstObject);
            }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

            @Override
            public SWRLDArgument translate(@Nonnull OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33842);
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33843);return dataFactory.getSWRLLiteralArgument(firstObject);
            }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
        }
    }

    static class SWRLRuleTranslator {

        private final OWLRDFConsumer consumer;
        private final OptimisedListTranslator<SWRLAtom> listTranslator;

        SWRLRuleTranslator(OWLRDFConsumer consumer, TranslatorAccessor accessor) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33844);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33845);this.consumer = consumer;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33846);listTranslator = new OptimisedListTranslator<>(consumer,
                    new SWRLAtomListItemTranslator(consumer, accessor));
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        /**
         * @param mainNode
         *        rule to translate
         */
        public void translateRule(@Nonnull IRI mainNode) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33847);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33848);IRI remappedNode = consumer.remapIRI(mainNode);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33849);Set<OWLAnnotation> annotations = new HashSet<>();
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33850);Set<IRI> predicates = consumer.getPredicatesBySubject(remappedNode);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33851);for (IRI i : predicates) {{
                assert (((i != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33852)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33853)==0&false));
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33854);if ((((consumer.isAnnotationProperty(i))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33855)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33856)==0&false))) {{
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33857);OWLAnnotationProperty p = consumer.getDataFactory()
                            .getOWLAnnotationProperty(i);
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33858);OWLLiteral literal = consumer.getLiteralObject(
                            remappedNode, i, true);
                    __CLR4_5_2ph5ph5lvicmcvw.R.inc(33859);while ((((literal != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33860)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33861)==0&false))) {{
                        __CLR4_5_2ph5ph5lvicmcvw.R.inc(33862);annotations.add(consumer.getDataFactory()
                                .getOWLAnnotation(p, literal));
                        __CLR4_5_2ph5ph5lvicmcvw.R.inc(33863);literal = consumer.getLiteralObject(remappedNode, i,
                                true);
                    }
                }}
            }}
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33864);@Nonnull
            Set<SWRLAtom> consequent = CollectionFactory.emptySet();
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33865);IRI ruleHeadIRI = consumer.getResourceObject(remappedNode,
                    SWRLVocabulary.HEAD.getIRI(), true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33866);if ((((ruleHeadIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33867)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33868)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33869);consequent = listTranslator.translateToSet(ruleHeadIRI);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33870);@Nonnull
            Set<SWRLAtom> antecedent = CollectionFactory.emptySet();
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33871);IRI ruleBodyIRI = consumer.getResourceObject(remappedNode,
                    SWRLVocabulary.BODY.getIRI(), true);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33872);if ((((ruleBodyIRI != null)&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33873)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33874)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33875);antecedent = listTranslator.translateToSet(ruleBodyIRI);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33876);SWRLRule rule = null;
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33877);if ((((!consumer.isAnonymousNode(remappedNode))&&(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33878)!=0|true))||(__CLR4_5_2ph5ph5lvicmcvw.R.iget(33879)==0&false))) {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33880);rule = consumer.getDataFactory().getSWRLRule(antecedent,
                        consequent, annotations);
            } }else {{
                __CLR4_5_2ph5ph5lvicmcvw.R.inc(33881);rule = consumer.getDataFactory().getSWRLRule(antecedent,
                        consequent, annotations);
            }
            }__CLR4_5_2ph5ph5lvicmcvw.R.inc(33882);consumer.addAxiom(rule);
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }

    static class TypedConstantListItemTranslator implements
            ListItemTranslator<OWLLiteral> {

        @Override
        public OWLLiteral translate(IRI firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33883);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33884);LOGGER.info("Cannot translate list item to a constant because rdf:first triple is a resource triple");
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33885);return null;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}

        @Override
        public OWLLiteral translate(OWLLiteral firstObject) {try{__CLR4_5_2ph5ph5lvicmcvw.R.inc(33886);
            __CLR4_5_2ph5ph5lvicmcvw.R.inc(33887);return firstObject;
        }finally{__CLR4_5_2ph5ph5lvicmcvw.R.flushNeeded();}}
    }
}
