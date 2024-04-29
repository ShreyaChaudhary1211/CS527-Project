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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;
import static org.semanticweb.owlapi.vocab.OWLXMLVocabulary.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLXMLVocabulary;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
enum PARSER_OWLXMLVocabulary implements HasIRI {
//@formatter:off
    /** CLASS                               */  PARSER_CLASS                               (CLASS                               ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28122); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28123);return new OWLClassElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_PROPERTY                       */  PARSER_DATA_PROPERTY                       (DATA_PROPERTY                       ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28124); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28125);return new OWLDataPropertyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY                     */  PARSER_OBJECT_PROPERTY                     (OBJECT_PROPERTY                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28126); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28127);return new OWLObjectPropertyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** NAMED_INDIVIDUAL                    */  PARSER_NAMED_INDIVIDUAL                    (NAMED_INDIVIDUAL                    ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28128); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28129);return new OWLIndividualElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ENTITY_ANNOTATION                   */  PARSER_ENTITY_ANNOTATION                   (ENTITY_ANNOTATION                   ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28130); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28131);return new LegacyEntityAnnotationElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANNOTATION_PROPERTY                 */  PARSER_ANNOTATION_PROPERTY                 (ANNOTATION_PROPERTY                 ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28132); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28133);return new OWLAnnotationPropertyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATATYPE                            */  PARSER_DATATYPE                            (DATATYPE                            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28134); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28135);return new OWLDatatypeElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANNOTATION                          */  PARSER_ANNOTATION                          (ANNOTATION                          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28136); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28137);return new OWLAnnotationElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANONYMOUS_INDIVIDUAL                */  PARSER_ANONYMOUS_INDIVIDUAL                (ANONYMOUS_INDIVIDUAL                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28138); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28139);return new OWLAnonymousIndividualElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** IMPORT                              */  PARSER_IMPORT                              (IMPORT                              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28140); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28141);return new OWLImportsHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ONTOLOGY                            */  PARSER_ONTOLOGY                            (ONTOLOGY                            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28142); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28143);return new OWLOntologyHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** LITERAL                             */  PARSER_LITERAL                             (LITERAL                             ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28144); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28145);return new OWLLiteralElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_INVERSE_OF                   */  PARSER_OBJECT_INVERSE_OF                   (OBJECT_INVERSE_OF                   ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28146); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28147);return new OWLInverseObjectPropertyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_COMPLEMENT_OF                  */  PARSER_DATA_COMPLEMENT_OF                  (DATA_COMPLEMENT_OF                  ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28148); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28149);return new OWLDataComplementOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_ONE_OF                         */  PARSER_DATA_ONE_OF                         (DATA_ONE_OF                         ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28150); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28151);return new OWLDataOneOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATATYPE_RESTRICTION                */  PARSER_DATATYPE_RESTRICTION                (DATATYPE_RESTRICTION                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28152); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28153);return new OWLDatatypeRestrictionElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** FACET_RESTRICTION                   */  PARSER_FACET_RESTRICTION                   (FACET_RESTRICTION                   ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28154); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28155);return new OWLDatatypeFacetRestrictionElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_UNION_OF                       */  PARSER_DATA_UNION_OF                       (DATA_UNION_OF                       ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28156); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28157);return new OWLDataUnionOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_INTERSECTION_OF                */  PARSER_DATA_INTERSECTION_OF                (DATA_INTERSECTION_OF                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28158); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28159);return new OWLDataIntersectionOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_INTERSECTION_OF              */  PARSER_OBJECT_INTERSECTION_OF              (OBJECT_INTERSECTION_OF              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28160); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28161);return new OWLObjectIntersectionOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_UNION_OF                     */  PARSER_OBJECT_UNION_OF                     (OBJECT_UNION_OF                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28162); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28163);return new OWLObjectUnionOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_COMPLEMENT_OF                */  PARSER_OBJECT_COMPLEMENT_OF                (OBJECT_COMPLEMENT_OF                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28164); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28165);return new OWLObjectComplementOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_ONE_OF                       */  PARSER_OBJECT_ONE_OF                       (OBJECT_ONE_OF                       ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28166); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28167);return new OWLObjectOneOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_SOME_VALUES_FROM             */  PARSER_OBJECT_SOME_VALUES_FROM             (OBJECT_SOME_VALUES_FROM             ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28168); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28169);return new OWLObjectSomeValuesFromElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_ALL_VALUES_FROM              */  PARSER_OBJECT_ALL_VALUES_FROM              (OBJECT_ALL_VALUES_FROM              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28170); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28171);return new OWLObjectAllValuesFromElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_HAS_SELF                     */  PARSER_OBJECT_HAS_SELF                     (OBJECT_HAS_SELF                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28172); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28173);return new OWLObjectExistsSelfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_HAS_VALUE                    */  PARSER_OBJECT_HAS_VALUE                    (OBJECT_HAS_VALUE                    ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28174); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28175);return new OWLObjectHasValueElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_MIN_CARDINALITY              */  PARSER_OBJECT_MIN_CARDINALITY              (OBJECT_MIN_CARDINALITY              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28176); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28177);return new OWLObjectMinCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_EXACT_CARDINALITY            */  PARSER_OBJECT_EXACT_CARDINALITY            (OBJECT_EXACT_CARDINALITY            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28178); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28179);return new OWLObjectExactCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_MAX_CARDINALITY              */  PARSER_OBJECT_MAX_CARDINALITY              (OBJECT_MAX_CARDINALITY              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28180); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28181);return new OWLObjectMaxCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_SOME_VALUES_FROM               */  PARSER_DATA_SOME_VALUES_FROM               (DATA_SOME_VALUES_FROM               ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28182); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28183);return new OWLDataSomeValuesFromElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_ALL_VALUES_FROM                */  PARSER_DATA_ALL_VALUES_FROM                (DATA_ALL_VALUES_FROM                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28184); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28185);return new OWLDataAllValuesFromElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_HAS_VALUE                      */  PARSER_DATA_HAS_VALUE                      (DATA_HAS_VALUE                      ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28186); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28187);return new OWLDataHasValueElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_MIN_CARDINALITY                */  PARSER_DATA_MIN_CARDINALITY                (DATA_MIN_CARDINALITY                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28188); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28189);return new OWLDataMinCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_EXACT_CARDINALITY              */  PARSER_DATA_EXACT_CARDINALITY              (DATA_EXACT_CARDINALITY              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28190); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28191);return new OWLDataExactCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_MAX_CARDINALITY                */  PARSER_DATA_MAX_CARDINALITY                (DATA_MAX_CARDINALITY                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28192); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28193);return new OWLDataMaxCardinalityElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SUB_CLASS_OF                        */  PARSER_SUB_CLASS_OF                        (SUB_CLASS_OF                        ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28194); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28195);return new OWLSubClassAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** EQUIVALENT_CLASSES                  */  PARSER_EQUIVALENT_CLASSES                  (EQUIVALENT_CLASSES                  ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28196); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28197);return new OWLEquivalentClassesAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DISJOINT_CLASSES                    */  PARSER_DISJOINT_CLASSES                    (DISJOINT_CLASSES                    ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28198); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28199);return new OWLDisjointClassesAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DISJOINT_UNION                      */  PARSER_DISJOINT_UNION                      (DISJOINT_UNION                      ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28200); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28201);return new OWLDisjointUnionElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** UNION_OF                            */  PARSER_UNION_OF                            (UNION_OF                            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28202); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28203);return new OWLUnionOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SUB_OBJECT_PROPERTY_OF              */  PARSER_SUB_OBJECT_PROPERTY_OF              (SUB_OBJECT_PROPERTY_OF              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28204); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28205);return new OWLSubObjectPropertyOfAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY_CHAIN               */  PARSER_OBJECT_PROPERTY_CHAIN               (OBJECT_PROPERTY_CHAIN               ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28206); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28207);return new OWLSubObjectPropertyChainElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** EQUIVALENT_OBJECT_PROPERTIES        */  PARSER_EQUIVALENT_OBJECT_PROPERTIES        (EQUIVALENT_OBJECT_PROPERTIES        ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28208); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28209);return new OWLEquivalentObjectPropertiesAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DISJOINT_OBJECT_PROPERTIES          */  PARSER_DISJOINT_OBJECT_PROPERTIES          (DISJOINT_OBJECT_PROPERTIES          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28210); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28211);return new OWLDisjointObjectPropertiesAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY_DOMAIN              */  PARSER_OBJECT_PROPERTY_DOMAIN              (OBJECT_PROPERTY_DOMAIN              ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28212); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28213);return new OWLObjectPropertyDomainElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY_RANGE               */  PARSER_OBJECT_PROPERTY_RANGE               (OBJECT_PROPERTY_RANGE               ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28214); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28215);return new OWLObjectPropertyRangeAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** INVERSE_OBJECT_PROPERTIES           */  PARSER_INVERSE_OBJECT_PROPERTIES           (INVERSE_OBJECT_PROPERTIES           ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28216); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28217);return new OWLInverseObjectPropertiesAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** FUNCTIONAL_OBJECT_PROPERTY          */  PARSER_FUNCTIONAL_OBJECT_PROPERTY          (FUNCTIONAL_OBJECT_PROPERTY          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28218); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28219);return new OWLFunctionalObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** INVERSE_FUNCTIONAL_OBJECT_PROPERTY  */  PARSER_INVERSE_FUNCTIONAL_OBJECT_PROPERTY  (INVERSE_FUNCTIONAL_OBJECT_PROPERTY  ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28220); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28221);return new OWLInverseFunctionalObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SYMMETRIC_OBJECT_PROPERTY           */  PARSER_SYMMETRIC_OBJECT_PROPERTY           (SYMMETRIC_OBJECT_PROPERTY           ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28222); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28223);return new OWLSymmetricObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ASYMMETRIC_OBJECT_PROPERTY          */  PARSER_ASYMMETRIC_OBJECT_PROPERTY          (ASYMMETRIC_OBJECT_PROPERTY          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28224); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28225);return new OWLAsymmetricObjectPropertyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** REFLEXIVE_OBJECT_PROPERTY           */  PARSER_REFLEXIVE_OBJECT_PROPERTY           (REFLEXIVE_OBJECT_PROPERTY           ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28226); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28227);return new OWLReflexiveObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** IRREFLEXIVE_OBJECT_PROPERTY         */  PARSER_IRREFLEXIVE_OBJECT_PROPERTY         (IRREFLEXIVE_OBJECT_PROPERTY         ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28228); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28229);return new OWLIrreflexiveObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** TRANSITIVE_OBJECT_PROPERTY          */  PARSER_TRANSITIVE_OBJECT_PROPERTY          (TRANSITIVE_OBJECT_PROPERTY          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28230); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28231);return new OWLTransitiveObjectPropertyAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SUB_DATA_PROPERTY_OF                */  PARSER_SUB_DATA_PROPERTY_OF                (SUB_DATA_PROPERTY_OF                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28232); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28233);return new OWLSubDataPropertyOfAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** EQUIVALENT_DATA_PROPERTIES          */  PARSER_EQUIVALENT_DATA_PROPERTIES          (EQUIVALENT_DATA_PROPERTIES          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28234); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28235);return new OWLEquivalentDataPropertiesAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DISJOINT_DATA_PROPERTIES            */  PARSER_DISJOINT_DATA_PROPERTIES            (DISJOINT_DATA_PROPERTIES            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28236); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28237);return new OWLDisjointDataPropertiesAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_PROPERTY_DOMAIN                */  PARSER_DATA_PROPERTY_DOMAIN                (DATA_PROPERTY_DOMAIN                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28238); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28239);return new OWLDataPropertyDomainAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_PROPERTY_RANGE                 */  PARSER_DATA_PROPERTY_RANGE                 (DATA_PROPERTY_RANGE                 ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28240); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28241);return new OWLDataPropertyRangeAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** FUNCTIONAL_DATA_PROPERTY            */  PARSER_FUNCTIONAL_DATA_PROPERTY            (FUNCTIONAL_DATA_PROPERTY            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28242); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28243);return new OWLFunctionalDataPropertyAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SAME_INDIVIDUAL                     */  PARSER_SAME_INDIVIDUAL                     (SAME_INDIVIDUAL                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28244); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28245);return new OWLSameIndividualsAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DIFFERENT_INDIVIDUALS               */  PARSER_DIFFERENT_INDIVIDUALS               (DIFFERENT_INDIVIDUALS               ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28246); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28247);return new OWLDifferentIndividualsAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** CLASS_ASSERTION                     */  PARSER_CLASS_ASSERTION                     (CLASS_ASSERTION                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28248); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28249);return new OWLClassAssertionAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY_ASSERTION           */  PARSER_OBJECT_PROPERTY_ASSERTION           (OBJECT_PROPERTY_ASSERTION           ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28250); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28251);return new OWLObjectPropertyAssertionAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_PROPERTY_ASSERTION             */  PARSER_DATA_PROPERTY_ASSERTION             (DATA_PROPERTY_ASSERTION             ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28252); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28253);return new OWLDataPropertyAssertionAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** NEGATIVE_OBJECT_PROPERTY_ASSERTION  */  PARSER_NEGATIVE_OBJECT_PROPERTY_ASSERTION  (NEGATIVE_OBJECT_PROPERTY_ASSERTION  ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28254); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28255);return new OWLNegativeObjectPropertyAssertionAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** NEGATIVE_DATA_PROPERTY_ASSERTION    */  PARSER_NEGATIVE_DATA_PROPERTY_ASSERTION    (NEGATIVE_DATA_PROPERTY_ASSERTION    ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28256); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28257);return new OWLNegativeDataPropertyAssertionAxiomElementHandler(             handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** HAS_KEY                             */  PARSER_HAS_KEY                             (HAS_KEY                             ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28258); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28259);return new OWLHasKeyElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DECLARATION                         */  PARSER_DECLARATION                         (DECLARATION                         ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28260); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28261);return new OWLDeclarationAxiomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANNOTATION_ASSERTION                */  PARSER_ANNOTATION_ASSERTION                (ANNOTATION_ASSERTION                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28262); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28263);return new OWLAnnotationAssertionElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANNOTATION_PROPERTY_DOMAIN          */  PARSER_ANNOTATION_PROPERTY_DOMAIN          (ANNOTATION_PROPERTY_DOMAIN          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28264); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28265);return new OWLAnnotationPropertyDomainElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ANNOTATION_PROPERTY_RANGE           */  PARSER_ANNOTATION_PROPERTY_RANGE           (ANNOTATION_PROPERTY_RANGE           ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28266); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28267);return new OWLAnnotationPropertyRangeElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SUB_ANNOTATION_PROPERTY_OF          */  PARSER_SUB_ANNOTATION_PROPERTY_OF          (SUB_ANNOTATION_PROPERTY_OF          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28268); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28269);return new OWLSubAnnotationPropertyOfElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATATYPE_DEFINITION                 */  PARSER_DATATYPE_DEFINITION                 (DATATYPE_DEFINITION                 ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28270); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28271);return new OWLDatatypeDefinitionElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** IRI_ELEMENT                         */  PARSER_IRI_ELEMENT                         (IRI_ELEMENT                         ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28272); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28273);return new IRIElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** ABBREVIATED_IRI_ELEMENT             */  PARSER_ABBREVIATED_IRI_ELEMENT             (ABBREVIATED_IRI_ELEMENT             ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28274); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28275);return new AbbreviatedIRIElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** NODE_ID                             */  PARSER_NODE_ID                             (NODE_ID                             ),
    /** ANNOTATION_URI                      */  PARSER_ANNOTATION_URI                      (ANNOTATION_URI                      ),
    /** LABEL                               */  PARSER_LABEL                               (LABEL                               ),
    /** COMMENT                             */  PARSER_COMMENT                             (COMMENT                             ),
    /** DOCUMENTATION                       */  PARSER_DOCUMENTATION                       (DOCUMENTATION                       ),
    /** DATATYPE_FACET                      */  PARSER_DATATYPE_FACET                      (DATATYPE_FACET                      ),
    /** DATATYPE_IRI                        */  PARSER_DATATYPE_IRI                        (DATATYPE_IRI                        ),
    /** DATA_RANGE                          */  PARSER_DATA_RANGE                          (DATA_RANGE                          ),
    /** PREFIX                              */  PARSER_PREFIX                              (PREFIX                              ),
    /** NAME_ATTRIBUTE                      */  PARSER_NAME_ATTRIBUTE                      (NAME_ATTRIBUTE                      ),
    /** IRI_ATTRIBUTE                       */  PARSER_IRI_ATTRIBUTE                       (IRI_ATTRIBUTE                       ),
    /** ABBREVIATED_IRI_ATTRIBUTE           */  PARSER_ABBREVIATED_IRI_ATTRIBUTE           (ABBREVIATED_IRI_ATTRIBUTE           ),
    /** CARDINALITY_ATTRIBUTE               */  PARSER_CARDINALITY_ATTRIBUTE               (CARDINALITY_ATTRIBUTE               ),
    
    // Rules Extensions
    /** DL_SAFE_RULE                        */  PARSER_DL_SAFE_RULE                        (DL_SAFE_RULE                        ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28276); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28277);return new SWRLRuleElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** BODY                                */  PARSER_BODY                                (BODY                                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28278); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28279);return new SWRLAtomListElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** HEAD                                */  PARSER_HEAD                                (HEAD                                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28280); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28281);return new SWRLAtomListElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** CLASS_ATOM                          */  PARSER_CLASS_ATOM                          (CLASS_ATOM                          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28282); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28283);return new SWRLClassAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_RANGE_ATOM                     */  PARSER_DATA_RANGE_ATOM                     (DATA_RANGE_ATOM                     ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28284); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28285);return new SWRLDataRangeAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** OBJECT_PROPERTY_ATOM                */  PARSER_OBJECT_PROPERTY_ATOM                (OBJECT_PROPERTY_ATOM                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28286); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28287);return new SWRLObjectPropertyAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DATA_PROPERTY_ATOM                  */  PARSER_DATA_PROPERTY_ATOM                  (DATA_PROPERTY_ATOM                  ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28288); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28289);return new SWRLDataPropertyAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** BUILT_IN_ATOM                       */  PARSER_BUILT_IN_ATOM                       (BUILT_IN_ATOM                       ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28290); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28291);return new SWRLBuiltInAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** SAME_INDIVIDUAL_ATOM                */  PARSER_SAME_INDIVIDUAL_ATOM                (SAME_INDIVIDUAL_ATOM                ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28292); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28293);return new SWRLSameIndividualAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DIFFERENT_INDIVIDUALS_ATOM          */  PARSER_DIFFERENT_INDIVIDUALS_ATOM          (DIFFERENT_INDIVIDUALS_ATOM          ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28294); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28295);return new SWRLDifferentIndividualsAtomElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** VARIABLE                            */  PARSER_VARIABLE                            (VARIABLE                            ) { @Nonnull @Override public OWLElementHandler<?> createHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28296); __CLR4_5_2lp6lp6lvicmc4h.R.inc(28297);return new SWRLVariableElementHandler(handler); }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}} },
    /** DESCRIPTION_GRAPH_RULE              */  PARSER_DESCRIPTION_GRAPH_RULE              (DESCRIPTION_GRAPH_RULE              );
//@formatter:on
    @Nonnull private final IRI iri;
    @Nonnull private final String shortName;

    PARSER_OWLXMLVocabulary(@Nonnull OWLXMLVocabulary name) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28298);
        __CLR4_5_2lp6lp6lvicmc4h.R.inc(28299);iri = IRI.create(Namespaces.OWL.toString(), name.getShortForm());
        __CLR4_5_2lp6lp6lvicmc4h.R.inc(28300);shortName = name.getShortForm();
    }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28301);
        __CLR4_5_2lp6lp6lvicmc4h.R.inc(28302);return iri;
    }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}}

    /**
     * @return short name
     */
    public String getShortName() {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28303);
        __CLR4_5_2lp6lp6lvicmc4h.R.inc(28304);return shortName;
    }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}}

    /**
     * @param handler
     *        owlxml handler
     * @return element handler
     */
    @Nonnull
        OWLElementHandler<?> createHandler(@SuppressWarnings("unused") @Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lp6lvicmc4h.R.inc(28305);
        __CLR4_5_2lp6lp6lvicmc4h.R.inc(28306);throw new OWLRuntimeException(shortName + " vocabulary element does not have a handler");
    }finally{__CLR4_5_2lp6lp6lvicmc4h.R.flushNeeded();}}
;public static class __CLR4_5_2lp6lp6lvicmc4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28307,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}

abstract class OWLElementHandler<O> {public static class __CLR4_5_2lp6lublvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final OWLXMLParserHandler handler;
    OWLElementHandler<?> parentHandler;
    @Nonnull final StringBuilder sb = new StringBuilder();
    String elementName;
    @Nonnull final OWLDataFactory df;

    /**
     * @return object
     */
    @Nonnull
    abstract O getOWLObject();

    /**
     * @throws UnloadableImportException
     *         if an import cannot be resolved
     */
    abstract void endElement();

    OWLElementHandler(@Nonnull OWLXMLParserHandler handler) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28307);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28308);this.handler = handler;
        __CLR4_5_2lp6lublvicmc4j.R.inc(28309);df = handler.getDataFactory();
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    @Nonnull
        IRI getIRIFromAttribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28310);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28311);if ((((localName.equals(IRI_ATTRIBUTE.getShortForm()))&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28312)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28313)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28314);return handler.getIRI(value);
        } }else {__CLR4_5_2lp6lublvicmc4j.R.inc(28315);if ((((localName.equals(ABBREVIATED_IRI_ATTRIBUTE.getShortForm()))&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28316)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28317)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28318);return handler.getAbbreviatedIRI(value);
        } }else {__CLR4_5_2lp6lublvicmc4j.R.inc(28319);if ((((localName.equals("URI"))&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28320)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28321)==0&false))) {{
            // Legacy
            __CLR4_5_2lp6lublvicmc4j.R.inc(28322);return handler.getIRI(value);
        }
        }}}__CLR4_5_2lp6lublvicmc4j.R.inc(28323);ensureAttributeNotNull(null, IRI_ATTRIBUTE.getShortForm());
        __CLR4_5_2lp6lublvicmc4j.R.inc(28324);return IRI.create("");
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    IRI getIRIFromElement(@Nonnull String elementLocalName, @Nonnull String textContent) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28325);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28326);if ((((elementLocalName.equals(IRI_ELEMENT.getShortForm()))&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28327)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28328)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28329);return handler.getIRI(textContent.trim());
        } }else {__CLR4_5_2lp6lublvicmc4j.R.inc(28330);if ((((elementLocalName.equals(ABBREVIATED_IRI_ELEMENT.getShortForm()))&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28331)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28332)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28333);return handler.getAbbreviatedIRI(textContent.trim());
        }
        }}__CLR4_5_2lp6lublvicmc4j.R.inc(28334);throw new OWLXMLParserException(handler, elementLocalName + " is not an IRI element");
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param handler
     *        element handler
     */
    void setParentHandler(@Nonnull OWLElementHandler<?> handler) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28335);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28336);parentHandler = handler;
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    @Nonnull
        OWLElementHandler<?> getParentHandler() {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28337);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28338);return verifyNotNull(parentHandler, "parentHandler cannot be null at this point");
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param localName
     *        local attribute name
     * @param value
     *        attribute value
     */
    @SuppressWarnings("unused")
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28339);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param name
     *        element name
     */
    void startElement(@Nonnull String name) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28340);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28341);elementName = name;
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    String getElementName() {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28342);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28343);return elementName;
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull AbstractOWLAxiomElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28344);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28345);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28346);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28347);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28348);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28349);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28350);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28351);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLSubObjectPropertyChainElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28352);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLDatatypeFacetRestrictionElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28353);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28354);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28355);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull AbstractIRIElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28356);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28357);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull SWRLAtomElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28358);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param h
     *        element handler
     */
    @SuppressWarnings("unused")
        void handleChild(@Nonnull SWRLAtomListElementHandler h) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28359);}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    void ensureNotNull(@Nullable Object element, String message) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28360);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28361);if ((((element == null)&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28362)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28363)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28364);throw new OWLXMLParserElementNotFoundException(handler, message);
        }
    }}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    void ensureAttributeNotNull(@Nullable Object element, String message) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28365);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28366);if ((((element == null)&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28367)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28368)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28369);throw new OWLXMLParserAttributeNotFoundException(handler, message);
        }
    }}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @param chars
     *        chars to handle
     * @param start
     *        start index
     * @param length
     *        end index
     */
    void handleChars(char[] chars, int start, int length) {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28370);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28371);if ((((isTextContentPossible())&&(__CLR4_5_2lp6lublvicmc4j.R.iget(28372)!=0|true))||(__CLR4_5_2lp6lublvicmc4j.R.iget(28373)==0&false))) {{
            __CLR4_5_2lp6lublvicmc4j.R.inc(28374);sb.append(chars, start, length);
        }
    }}finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @return text handled
     */
    @Nonnull
        String getText() {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28375);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28376);return sb.toString();
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}

    /**
     * @return true if text can be contained
     */
    boolean isTextContentPossible() {try{__CLR4_5_2lp6lublvicmc4j.R.inc(28377);
        __CLR4_5_2lp6lublvicmc4j.R.inc(28378);return false;
    }finally{__CLR4_5_2lp6lublvicmc4j.R.flushNeeded();}}
}

abstract class AbstractClassExpressionElementHandler extends OWLElementHandler<OWLClassExpression> {public static class __CLR4_5_2lp6lwblvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression desc;

    AbstractClassExpressionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lwblvicmc4j.R.inc(28380);try{__CLR4_5_2lp6lwblvicmc4j.R.inc(28379);
    }finally{__CLR4_5_2lp6lwblvicmc4j.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6lwblvicmc4j.R.inc(28381);
        __CLR4_5_2lp6lwblvicmc4j.R.inc(28382);endClassExpressionElement();
        __CLR4_5_2lp6lwblvicmc4j.R.inc(28383);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6lwblvicmc4j.R.flushNeeded();}}

    abstract void endClassExpressionElement();

    void setClassExpression(@Nonnull OWLClassExpression desc) {try{__CLR4_5_2lp6lwblvicmc4j.R.inc(28384);
        __CLR4_5_2lp6lwblvicmc4j.R.inc(28385);this.desc = desc;
    }finally{__CLR4_5_2lp6lwblvicmc4j.R.flushNeeded();}}

    @Override
        OWLClassExpression getOWLObject() {try{__CLR4_5_2lp6lwblvicmc4j.R.inc(28386);
        __CLR4_5_2lp6lwblvicmc4j.R.inc(28387);return verifyNotNull(desc);
    }finally{__CLR4_5_2lp6lwblvicmc4j.R.flushNeeded();}}
}

abstract class AbstractClassExpressionFillerRestriction extends
    AbstractObjectRestrictionElementHandler<OWLClassExpression> {public static class __CLR4_5_2lp6lwklvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractClassExpressionFillerRestriction(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lwklvicmc4j.R.inc(28389);try{__CLR4_5_2lp6lwklvicmc4j.R.inc(28388);
    }finally{__CLR4_5_2lp6lwklvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6lwklvicmc4j.R.inc(28390);
        __CLR4_5_2lp6lwklvicmc4j.R.inc(28391);setFiller(h.getOWLObject());
    }finally{__CLR4_5_2lp6lwklvicmc4j.R.flushNeeded();}}
}

abstract class AbstractClassExpressionOperandAxiomElementHandler extends
    AbstractOperandAxiomElementHandler<OWLClassExpression> {public static class __CLR4_5_2lp6lwolvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractClassExpressionOperandAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lwolvicmc4j.R.inc(28393);try{__CLR4_5_2lp6lwolvicmc4j.R.inc(28392);
    }finally{__CLR4_5_2lp6lwolvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6lwolvicmc4j.R.inc(28394);
        __CLR4_5_2lp6lwolvicmc4j.R.inc(28395);addOperand(h.getOWLObject());
    }finally{__CLR4_5_2lp6lwolvicmc4j.R.flushNeeded();}}
}

abstract class AbstractDataCardinalityRestrictionElementHandler extends
    AbstractDataRangeFillerRestrictionElementHandler {public static class __CLR4_5_2lp6lwslvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int cardinality;

    AbstractDataCardinalityRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lwslvicmc4j.R.inc(28397);try{__CLR4_5_2lp6lwslvicmc4j.R.inc(28396);
    }finally{__CLR4_5_2lp6lwslvicmc4j.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, String value) {try{__CLR4_5_2lp6lwslvicmc4j.R.inc(28398);
        __CLR4_5_2lp6lwslvicmc4j.R.inc(28399);if ((((localName.equals("cardinality"))&&(__CLR4_5_2lp6lwslvicmc4j.R.iget(28400)!=0|true))||(__CLR4_5_2lp6lwslvicmc4j.R.iget(28401)==0&false))) {{
            __CLR4_5_2lp6lwslvicmc4j.R.inc(28402);cardinality = Integer.parseInt(value);
        }
    }}finally{__CLR4_5_2lp6lwslvicmc4j.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6lwslvicmc4j.R.inc(28403);
        __CLR4_5_2lp6lwslvicmc4j.R.inc(28404);super.startElement(name);
        __CLR4_5_2lp6lwslvicmc4j.R.inc(28405);setFiller(df.getTopDatatype());
    }finally{__CLR4_5_2lp6lwslvicmc4j.R.flushNeeded();}}

    int getCardinality() {try{__CLR4_5_2lp6lwslvicmc4j.R.inc(28406);
        __CLR4_5_2lp6lwslvicmc4j.R.inc(28407);return cardinality;
    }finally{__CLR4_5_2lp6lwslvicmc4j.R.flushNeeded();}}
}

abstract class AbstractDataRangeFillerRestrictionElementHandler extends
    AbstractDataRestrictionElementHandler<OWLDataRange> {public static class __CLR4_5_2lp6lx4lvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractDataRangeFillerRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lx4lvicmc4j.R.inc(28409);try{__CLR4_5_2lp6lx4lvicmc4j.R.inc(28408);
    }finally{__CLR4_5_2lp6lx4lvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6lx4lvicmc4j.R.inc(28410);
        __CLR4_5_2lp6lx4lvicmc4j.R.inc(28411);setFiller(h.getOWLObject());
    }finally{__CLR4_5_2lp6lx4lvicmc4j.R.flushNeeded();}}
}

abstract class AbstractNaryBooleanClassExpressionElementHandler extends AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6lx8lvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLClassExpression> operands = new HashSet<>();

    AbstractNaryBooleanClassExpressionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lx8lvicmc4j.R.inc(28413);try{__CLR4_5_2lp6lx8lvicmc4j.R.inc(28412);
    }finally{__CLR4_5_2lp6lx8lvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6lx8lvicmc4j.R.inc(28414);
        __CLR4_5_2lp6lx8lvicmc4j.R.inc(28415);operands.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6lx8lvicmc4j.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6lx8lvicmc4j.R.inc(28416);
        __CLR4_5_2lp6lx8lvicmc4j.R.inc(28417);if ((((operands.size() >= 2)&&(__CLR4_5_2lp6lx8lvicmc4j.R.iget(28418)!=0|true))||(__CLR4_5_2lp6lx8lvicmc4j.R.iget(28419)==0&false))) {{
            __CLR4_5_2lp6lx8lvicmc4j.R.inc(28420);setClassExpression(createClassExpression(operands));
        } }else {__CLR4_5_2lp6lx8lvicmc4j.R.inc(28421);if ((((operands.size() == 1)&&(__CLR4_5_2lp6lx8lvicmc4j.R.iget(28422)!=0|true))||(__CLR4_5_2lp6lx8lvicmc4j.R.iget(28423)==0&false))) {{
            __CLR4_5_2lp6lx8lvicmc4j.R.inc(28424);setClassExpression(verifyNotNull(operands.iterator().next()));
        } }else {{
            __CLR4_5_2lp6lx8lvicmc4j.R.inc(28425);String template = "Found zero child elements of an %s element. At least 2 class expression elements are required as child elements of %s elements";
            __CLR4_5_2lp6lx8lvicmc4j.R.inc(28426);ensureNotNull(null, String.format(template, getElementName(), getElementName()));
        }
    }}}finally{__CLR4_5_2lp6lx8lvicmc4j.R.flushNeeded();}}

    @Nonnull
    abstract OWLClassExpression createClassExpression(@Nonnull Set<OWLClassExpression> expressions);
}

abstract class AbstractIRIElementHandler extends OWLElementHandler<IRI> {public static class __CLR4_5_2lp6lxnlvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractIRIElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lxnlvicmc4j.R.inc(28428);try{__CLR4_5_2lp6lxnlvicmc4j.R.inc(28427);
    }finally{__CLR4_5_2lp6lxnlvicmc4j.R.flushNeeded();}}
}

abstract class AbstractDataRestrictionElementHandler<F extends OWLObject> extends
    AbstractRestrictionElementHandler<OWLDataPropertyExpression, F> {public static class __CLR4_5_2lp6lxplvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28433,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractDataRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lxplvicmc4j.R.inc(28430);try{__CLR4_5_2lp6lxplvicmc4j.R.inc(28429);
    }finally{__CLR4_5_2lp6lxplvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6lxplvicmc4j.R.inc(28431);
        __CLR4_5_2lp6lxplvicmc4j.R.inc(28432);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6lxplvicmc4j.R.flushNeeded();}}
}

abstract class AbstractObjectRestrictionElementHandler<F extends OWLObject> extends
    AbstractRestrictionElementHandler<OWLObjectPropertyExpression, F> {public static class __CLR4_5_2lp6lxtlvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractObjectRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lxtlvicmc4j.R.inc(28434);try{__CLR4_5_2lp6lxtlvicmc4j.R.inc(28433);
    }finally{__CLR4_5_2lp6lxtlvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6lxtlvicmc4j.R.inc(28435);
        __CLR4_5_2lp6lxtlvicmc4j.R.inc(28436);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6lxtlvicmc4j.R.flushNeeded();}}
}

abstract class AbstractOperandAxiomElementHandler<O extends OWLObject> extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6lxxlvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<O> operands = new HashSet<>();

    AbstractOperandAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lxxlvicmc4j.R.inc(28438);try{__CLR4_5_2lp6lxxlvicmc4j.R.inc(28437);
    }finally{__CLR4_5_2lp6lxxlvicmc4j.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6lxxlvicmc4j.R.inc(28439);
        __CLR4_5_2lp6lxxlvicmc4j.R.inc(28440);super.startElement(name);
        __CLR4_5_2lp6lxxlvicmc4j.R.inc(28441);operands.clear();
    }finally{__CLR4_5_2lp6lxxlvicmc4j.R.flushNeeded();}}

    @Nonnull
        Set<O> getOperands() {try{__CLR4_5_2lp6lxxlvicmc4j.R.inc(28442);
        __CLR4_5_2lp6lxxlvicmc4j.R.inc(28443);return operands;
    }finally{__CLR4_5_2lp6lxxlvicmc4j.R.flushNeeded();}}

    void addOperand(O operand) {try{__CLR4_5_2lp6lxxlvicmc4j.R.inc(28444);
        __CLR4_5_2lp6lxxlvicmc4j.R.inc(28445);operands.add(operand);
    }finally{__CLR4_5_2lp6lxxlvicmc4j.R.flushNeeded();}}
}

abstract class AbstractOWLAssertionAxiomElementHandler<P extends OWLPropertyExpression, O extends OWLObject> extends
    AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6ly6lvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLIndividual subject;
    P property;
    O object;

    AbstractOWLAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6ly6lvicmc4j.R.inc(28447);try{__CLR4_5_2lp6ly6lvicmc4j.R.inc(28446);
    }finally{__CLR4_5_2lp6ly6lvicmc4j.R.flushNeeded();}}

    void setSubject(@Nonnull OWLIndividual subject) {try{__CLR4_5_2lp6ly6lvicmc4j.R.inc(28448);
        __CLR4_5_2lp6ly6lvicmc4j.R.inc(28449);this.subject = subject;
    }finally{__CLR4_5_2lp6ly6lvicmc4j.R.flushNeeded();}}

    void setProperty(@Nonnull P property) {try{__CLR4_5_2lp6ly6lvicmc4j.R.inc(28450);
        __CLR4_5_2lp6ly6lvicmc4j.R.inc(28451);this.property = property;
    }finally{__CLR4_5_2lp6ly6lvicmc4j.R.flushNeeded();}}

    void setObject(@Nonnull O object) {try{__CLR4_5_2lp6ly6lvicmc4j.R.inc(28452);
        __CLR4_5_2lp6ly6lvicmc4j.R.inc(28453);this.object = object;
    }finally{__CLR4_5_2lp6ly6lvicmc4j.R.flushNeeded();}}
}

abstract class AbstractOWLAxiomElementHandler extends OWLElementHandler<OWLAxiom> {public static class __CLR4_5_2lp6lyelvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAxiom axiom;
    @Nonnull final Set<OWLAnnotation> annotations = new HashSet<>();

    AbstractOWLAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lyelvicmc4j.R.inc(28455);try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28454);
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    @Override
        OWLAxiom getOWLObject() {try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28456);
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28457);return verifyNotNull(axiom);
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    void setAxiom(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28458);
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28459);this.axiom = axiom;
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28460);
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28461);annotations.clear();
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28462);
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28463);annotations.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6lyelvicmc4j.R.inc(28464);
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28465);setAxiom(createAxiom());
        __CLR4_5_2lp6lyelvicmc4j.R.inc(28466);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6lyelvicmc4j.R.flushNeeded();}}

    @Nonnull
    abstract OWLAxiom createAxiom();
}

abstract class AbstractOWLDataPropertyAssertionAxiomElementHandler extends
    AbstractOWLAssertionAxiomElementHandler<OWLDataPropertyExpression, OWLLiteral> {public static class __CLR4_5_2lp6lyrlvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLDataPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lyrlvicmc4j.R.inc(28468);try{__CLR4_5_2lp6lyrlvicmc4j.R.inc(28467);
    }finally{__CLR4_5_2lp6lyrlvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6lyrlvicmc4j.R.inc(28469);
        __CLR4_5_2lp6lyrlvicmc4j.R.inc(28470);setSubject(h.getOWLObject());
    }finally{__CLR4_5_2lp6lyrlvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6lyrlvicmc4j.R.inc(28471);
        __CLR4_5_2lp6lyrlvicmc4j.R.inc(28472);setSubject(h.getOWLObject());
    }finally{__CLR4_5_2lp6lyrlvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6lyrlvicmc4j.R.inc(28473);
        __CLR4_5_2lp6lyrlvicmc4j.R.inc(28474);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6lyrlvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6lyrlvicmc4j.R.inc(28475);
        __CLR4_5_2lp6lyrlvicmc4j.R.inc(28476);setObject(h.getOWLObject());
    }finally{__CLR4_5_2lp6lyrlvicmc4j.R.flushNeeded();}}
}

abstract class AbstractOWLDataPropertyOperandAxiomElementHandler extends
    AbstractOperandAxiomElementHandler<OWLDataPropertyExpression> {public static class __CLR4_5_2lp6lz1lvicmc4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLDataPropertyOperandAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lz1lvicmc4j.R.inc(28478);try{__CLR4_5_2lp6lz1lvicmc4j.R.inc(28477);
    }finally{__CLR4_5_2lp6lz1lvicmc4j.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6lz1lvicmc4j.R.inc(28479);
        __CLR4_5_2lp6lz1lvicmc4j.R.inc(28480);addOperand(h.getOWLObject());
    }finally{__CLR4_5_2lp6lz1lvicmc4j.R.flushNeeded();}}
}

abstract class AbstractOWLDataRangeHandler extends OWLElementHandler<OWLDataRange> {public static class __CLR4_5_2lp6lz5lvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28490,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataRange dataRange;

    AbstractOWLDataRangeHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lz5lvicmc4k.R.inc(28482);try{__CLR4_5_2lp6lz5lvicmc4k.R.inc(28481);
    }finally{__CLR4_5_2lp6lz5lvicmc4k.R.flushNeeded();}}

    void setDataRange(@Nonnull OWLDataRange dataRange) {try{__CLR4_5_2lp6lz5lvicmc4k.R.inc(28483);
        __CLR4_5_2lp6lz5lvicmc4k.R.inc(28484);this.dataRange = dataRange;
    }finally{__CLR4_5_2lp6lz5lvicmc4k.R.flushNeeded();}}

    @Override
        OWLDataRange getOWLObject() {try{__CLR4_5_2lp6lz5lvicmc4k.R.inc(28485);
        __CLR4_5_2lp6lz5lvicmc4k.R.inc(28486);return verifyNotNull(dataRange);
    }finally{__CLR4_5_2lp6lz5lvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6lz5lvicmc4k.R.inc(28487);
        __CLR4_5_2lp6lz5lvicmc4k.R.inc(28488);endDataRangeElement();
        __CLR4_5_2lp6lz5lvicmc4k.R.inc(28489);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6lz5lvicmc4k.R.flushNeeded();}}

    abstract void endDataRangeElement();
}

abstract class AbstractOWLIndividualOperandAxiomElementHandler extends
    AbstractOperandAxiomElementHandler<OWLIndividual> {public static class __CLR4_5_2lp6lzelvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLIndividualOperandAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lzelvicmc4k.R.inc(28491);try{__CLR4_5_2lp6lzelvicmc4k.R.inc(28490);
    }finally{__CLR4_5_2lp6lzelvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6lzelvicmc4k.R.inc(28492);
        __CLR4_5_2lp6lzelvicmc4k.R.inc(28493);addOperand(h.getOWLObject());
    }finally{__CLR4_5_2lp6lzelvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6lzelvicmc4k.R.inc(28494);
        __CLR4_5_2lp6lzelvicmc4k.R.inc(28495);addOperand(h.getOWLObject());
    }finally{__CLR4_5_2lp6lzelvicmc4k.R.flushNeeded();}}
}

abstract class AbstractOWLObjectCardinalityElementHandler extends AbstractClassExpressionFillerRestriction {public static class __CLR4_5_2lp6lzklvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int cardinality;

    AbstractOWLObjectCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lzklvicmc4k.R.inc(28497);try{__CLR4_5_2lp6lzklvicmc4k.R.inc(28496);
    }finally{__CLR4_5_2lp6lzklvicmc4k.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6lzklvicmc4k.R.inc(28498);
        __CLR4_5_2lp6lzklvicmc4k.R.inc(28499);super.startElement(name);
        __CLR4_5_2lp6lzklvicmc4k.R.inc(28500);setFiller(df.getOWLThing());
    }finally{__CLR4_5_2lp6lzklvicmc4k.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, String value) {try{__CLR4_5_2lp6lzklvicmc4k.R.inc(28501);
        __CLR4_5_2lp6lzklvicmc4k.R.inc(28502);if ((((localName.equals("cardinality"))&&(__CLR4_5_2lp6lzklvicmc4k.R.iget(28503)!=0|true))||(__CLR4_5_2lp6lzklvicmc4k.R.iget(28504)==0&false))) {{
            __CLR4_5_2lp6lzklvicmc4k.R.inc(28505);cardinality = Integer.parseInt(value);
        }
    }}finally{__CLR4_5_2lp6lzklvicmc4k.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6lzklvicmc4k.R.inc(28506);
        __CLR4_5_2lp6lzklvicmc4k.R.inc(28507);return createCardinalityRestriction();
    }finally{__CLR4_5_2lp6lzklvicmc4k.R.flushNeeded();}}

    @Nonnull
    abstract OWLClassExpression createCardinalityRestriction();

    int getCardinality() {try{__CLR4_5_2lp6lzklvicmc4k.R.inc(28508);
        __CLR4_5_2lp6lzklvicmc4k.R.inc(28509);return cardinality;
    }finally{__CLR4_5_2lp6lzklvicmc4k.R.flushNeeded();}}
}

abstract class AbstractOWLObjectPropertyAssertionAxiomElementHandler extends
    AbstractOWLAssertionAxiomElementHandler<OWLObjectPropertyExpression, OWLIndividual> {public static class __CLR4_5_2lp6lzylvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28532,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLObjectPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6lzylvicmc4k.R.inc(28511);try{__CLR4_5_2lp6lzylvicmc4k.R.inc(28510);
    }finally{__CLR4_5_2lp6lzylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6lzylvicmc4k.R.inc(28512);
        __CLR4_5_2lp6lzylvicmc4k.R.inc(28513);if ((((subject == null)&&(__CLR4_5_2lp6lzylvicmc4k.R.iget(28514)!=0|true))||(__CLR4_5_2lp6lzylvicmc4k.R.iget(28515)==0&false))) {{
            __CLR4_5_2lp6lzylvicmc4k.R.inc(28516);setSubject(h.getOWLObject());
        } }else {__CLR4_5_2lp6lzylvicmc4k.R.inc(28517);if ((((object == null)&&(__CLR4_5_2lp6lzylvicmc4k.R.iget(28518)!=0|true))||(__CLR4_5_2lp6lzylvicmc4k.R.iget(28519)==0&false))) {{
            __CLR4_5_2lp6lzylvicmc4k.R.inc(28520);setObject(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6lzylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6lzylvicmc4k.R.inc(28521);
        __CLR4_5_2lp6lzylvicmc4k.R.inc(28522);if ((((subject == null)&&(__CLR4_5_2lp6lzylvicmc4k.R.iget(28523)!=0|true))||(__CLR4_5_2lp6lzylvicmc4k.R.iget(28524)==0&false))) {{
            __CLR4_5_2lp6lzylvicmc4k.R.inc(28525);setSubject(h.getOWLObject());
        } }else {__CLR4_5_2lp6lzylvicmc4k.R.inc(28526);if ((((object == null)&&(__CLR4_5_2lp6lzylvicmc4k.R.iget(28527)!=0|true))||(__CLR4_5_2lp6lzylvicmc4k.R.iget(28528)==0&false))) {{
            __CLR4_5_2lp6lzylvicmc4k.R.inc(28529);setObject(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6lzylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6lzylvicmc4k.R.inc(28530);
        __CLR4_5_2lp6lzylvicmc4k.R.inc(28531);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6lzylvicmc4k.R.flushNeeded();}}
}

abstract class AbstractOWLObjectPropertyCharacteristicAxiomElementHandler extends
    AbstractOWLPropertyCharacteristicAxiomElementHandler<OWLObjectPropertyExpression> {public static class __CLR4_5_2lp6m0klvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m0klvicmc4k.R.inc(28533);try{__CLR4_5_2lp6m0klvicmc4k.R.inc(28532);
    }finally{__CLR4_5_2lp6m0klvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6m0klvicmc4k.R.inc(28534);
        __CLR4_5_2lp6m0klvicmc4k.R.inc(28535);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6m0klvicmc4k.R.flushNeeded();}}
}

abstract class AbstractOWLObjectPropertyElementHandler extends OWLElementHandler<OWLObjectPropertyExpression> {public static class __CLR4_5_2lp6m0olvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyExpression property;

    AbstractOWLObjectPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m0olvicmc4k.R.inc(28537);try{__CLR4_5_2lp6m0olvicmc4k.R.inc(28536);
    }finally{__CLR4_5_2lp6m0olvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m0olvicmc4k.R.inc(28538);
        __CLR4_5_2lp6m0olvicmc4k.R.inc(28539);endObjectPropertyElement();
        __CLR4_5_2lp6m0olvicmc4k.R.inc(28540);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m0olvicmc4k.R.flushNeeded();}}

    void setOWLObjectPropertyExpression(@Nonnull OWLObjectPropertyExpression prop) {try{__CLR4_5_2lp6m0olvicmc4k.R.inc(28541);
        __CLR4_5_2lp6m0olvicmc4k.R.inc(28542);property = prop;
    }finally{__CLR4_5_2lp6m0olvicmc4k.R.flushNeeded();}}

    @Override
        OWLObjectPropertyExpression getOWLObject() {try{__CLR4_5_2lp6m0olvicmc4k.R.inc(28543);
        __CLR4_5_2lp6m0olvicmc4k.R.inc(28544);return verifyNotNull(property);
    }finally{__CLR4_5_2lp6m0olvicmc4k.R.flushNeeded();}}

    abstract void endObjectPropertyElement();
}

abstract class AbstractOWLObjectPropertyOperandAxiomElementHandler extends
    AbstractOperandAxiomElementHandler<OWLObjectPropertyExpression> {public static class __CLR4_5_2lp6m0xlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    AbstractOWLObjectPropertyOperandAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m0xlvicmc4k.R.inc(28546);try{__CLR4_5_2lp6m0xlvicmc4k.R.inc(28545);
    }finally{__CLR4_5_2lp6m0xlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6m0xlvicmc4k.R.inc(28547);
        __CLR4_5_2lp6m0xlvicmc4k.R.inc(28548);addOperand(h.getOWLObject());
    }finally{__CLR4_5_2lp6m0xlvicmc4k.R.flushNeeded();}}
}

abstract class AbstractOWLPropertyCharacteristicAxiomElementHandler<P extends OWLObject> extends
    AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m11lvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    P property;

    AbstractOWLPropertyCharacteristicAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m11lvicmc4k.R.inc(28550);try{__CLR4_5_2lp6m11lvicmc4k.R.inc(28549);
    }finally{__CLR4_5_2lp6m11lvicmc4k.R.flushNeeded();}}

    void setProperty(@Nonnull P property) {try{__CLR4_5_2lp6m11lvicmc4k.R.inc(28551);
        __CLR4_5_2lp6m11lvicmc4k.R.inc(28552);this.property = property;
    }finally{__CLR4_5_2lp6m11lvicmc4k.R.flushNeeded();}}

    @Nonnull
        P getProperty() {try{__CLR4_5_2lp6m11lvicmc4k.R.inc(28553);
        __CLR4_5_2lp6m11lvicmc4k.R.inc(28554);return verifyNotNull(property);
    }finally{__CLR4_5_2lp6m11lvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m11lvicmc4k.R.inc(28555);
        __CLR4_5_2lp6m11lvicmc4k.R.inc(28556);ensureNotNull(property, "property element");
        __CLR4_5_2lp6m11lvicmc4k.R.inc(28557);return createPropertyCharacteristicAxiom();
    }finally{__CLR4_5_2lp6m11lvicmc4k.R.flushNeeded();}}

    @Nonnull
    abstract OWLAxiom createPropertyCharacteristicAxiom();
}

abstract class AbstractRestrictionElementHandler<P extends OWLPropertyExpression, F extends OWLObject> extends
    AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6m1alvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    P property;
    F filler;

    AbstractRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m1alvicmc4k.R.inc(28559);try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28558);
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    void setProperty(@Nonnull P prop) {try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28560);
        __CLR4_5_2lp6m1alvicmc4k.R.inc(28561);property = prop;
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    @Nonnull
        P getProperty() {try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28562);
        __CLR4_5_2lp6m1alvicmc4k.R.inc(28563);return verifyNotNull(property);
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    @Nonnull
        F getFiller() {try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28564);
        __CLR4_5_2lp6m1alvicmc4k.R.inc(28565);return verifyNotNull(filler);
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    void setFiller(@Nonnull F filler) {try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28566);
        __CLR4_5_2lp6m1alvicmc4k.R.inc(28567);this.filler = filler;
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6m1alvicmc4k.R.inc(28568);
        __CLR4_5_2lp6m1alvicmc4k.R.inc(28569);setClassExpression(createRestriction());
    }finally{__CLR4_5_2lp6m1alvicmc4k.R.flushNeeded();}}

    @Nonnull
    abstract OWLClassExpression createRestriction();
}

class AbbreviatedIRIElementHandler extends AbstractIRIElementHandler {public static class __CLR4_5_2lp6m1mlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;

    AbbreviatedIRIElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m1mlvicmc4k.R.inc(28571);try{__CLR4_5_2lp6m1mlvicmc4k.R.inc(28570);
    }finally{__CLR4_5_2lp6m1mlvicmc4k.R.flushNeeded();}}

    @Override
        boolean isTextContentPossible() {try{__CLR4_5_2lp6m1mlvicmc4k.R.inc(28572);
        __CLR4_5_2lp6m1mlvicmc4k.R.inc(28573);return true;
    }finally{__CLR4_5_2lp6m1mlvicmc4k.R.flushNeeded();}}

    @Override
        IRI getOWLObject() {try{__CLR4_5_2lp6m1mlvicmc4k.R.inc(28574);
        __CLR4_5_2lp6m1mlvicmc4k.R.inc(28575);return verifyNotNull(iri);
    }finally{__CLR4_5_2lp6m1mlvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m1mlvicmc4k.R.inc(28576);
        __CLR4_5_2lp6m1mlvicmc4k.R.inc(28577);String iriText = getText().trim();
        __CLR4_5_2lp6m1mlvicmc4k.R.inc(28578);iri = handler.getAbbreviatedIRI(iriText);
        __CLR4_5_2lp6m1mlvicmc4k.R.inc(28579);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m1mlvicmc4k.R.flushNeeded();}}
}

class IRIElementHandler extends AbstractIRIElementHandler {public static class __CLR4_5_2lp6m1wlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;

    IRIElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m1wlvicmc4k.R.inc(28581);try{__CLR4_5_2lp6m1wlvicmc4k.R.inc(28580);
    }finally{__CLR4_5_2lp6m1wlvicmc4k.R.flushNeeded();}}

    @Override
        boolean isTextContentPossible() {try{__CLR4_5_2lp6m1wlvicmc4k.R.inc(28582);
        __CLR4_5_2lp6m1wlvicmc4k.R.inc(28583);return true;
    }finally{__CLR4_5_2lp6m1wlvicmc4k.R.flushNeeded();}}

    @Override
        IRI getOWLObject() {try{__CLR4_5_2lp6m1wlvicmc4k.R.inc(28584);
        __CLR4_5_2lp6m1wlvicmc4k.R.inc(28585);return verifyNotNull(iri);
    }finally{__CLR4_5_2lp6m1wlvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m1wlvicmc4k.R.inc(28586);
        __CLR4_5_2lp6m1wlvicmc4k.R.inc(28587);String iriText = getText().trim();
        __CLR4_5_2lp6m1wlvicmc4k.R.inc(28588);iri = handler.getIRI(iriText);
        __CLR4_5_2lp6m1wlvicmc4k.R.inc(28589);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m1wlvicmc4k.R.flushNeeded();}}
}

class OWLUnionOfElementHandler extends OWLElementHandler<OWLClassExpression> {public static class __CLR4_5_2lp6m26lvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLUnionOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m26lvicmc4k.R.inc(28591);try{__CLR4_5_2lp6m26lvicmc4k.R.inc(28590);
    }finally{__CLR4_5_2lp6m26lvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6m26lvicmc4k.R.inc(28592);
        // We simply pass on to our parent, which MUST be an OWLDisjointUnionOf
        __CLR4_5_2lp6m26lvicmc4k.R.inc(28593);getParentHandler().handleChild(h);
    }finally{__CLR4_5_2lp6m26lvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m26lvicmc4k.R.inc(28594);}finally{__CLR4_5_2lp6m26lvicmc4k.R.flushNeeded();}}

    @Nonnull
    @Override
        OWLClassExpression getOWLObject() {try{__CLR4_5_2lp6m26lvicmc4k.R.inc(28595);
        __CLR4_5_2lp6m26lvicmc4k.R.inc(28596);throw new OWLRuntimeException("getOWLObject should not be called on OWLUnionOfElementHandler");
    }finally{__CLR4_5_2lp6m26lvicmc4k.R.flushNeeded();}}
}

class LegacyEntityAnnotationElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m2dlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLEntity entity;
    OWLAnnotation annotation;

    LegacyEntityAnnotationElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m2dlvicmc4k.R.inc(28598);try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28597);
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28599);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28600);OWLAnnotationAssertionAxiom toReturn = df.getOWLAnnotationAssertionAxiom(annotation.getProperty(), entity
            .getIRI(), annotation.getValue());
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28601);annotation = null;
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28602);entity = null;
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28603);return toReturn;
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28604);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28605);entity = h.getOWLObject().asOWLClass();
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28606);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28607);entity = h.getOWLObject().asOWLDataProperty();
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28608);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28609);entity = h.getOWLObject();
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28610);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28611);entity = h.getOWLObject().asOWLObjectProperty();
    }finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6m2dlvicmc4k.R.inc(28612);
        __CLR4_5_2lp6m2dlvicmc4k.R.inc(28613);if ((((entity == null)&&(__CLR4_5_2lp6m2dlvicmc4k.R.iget(28614)!=0|true))||(__CLR4_5_2lp6m2dlvicmc4k.R.iget(28615)==0&false))) {{
            __CLR4_5_2lp6m2dlvicmc4k.R.inc(28616);super.handleChild(h);
        } }else {{
            __CLR4_5_2lp6m2dlvicmc4k.R.inc(28617);annotation = h.getOWLObject();
        }
    }}finally{__CLR4_5_2lp6m2dlvicmc4k.R.flushNeeded();}}
}

class OWLAnnotationAssertionElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m2ylvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAnnotationAssertionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m2ylvicmc4k.R.inc(28619);try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28618);
    }finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}

    OWLAnnotationSubject subject;
    OWLAnnotationValue object;
    OWLAnnotationProperty property;

    @Override
        void handleChild(@Nonnull AbstractIRIElementHandler h) {try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28620);
        __CLR4_5_2lp6m2ylvicmc4k.R.inc(28621);if ((((subject == null)&&(__CLR4_5_2lp6m2ylvicmc4k.R.iget(28622)!=0|true))||(__CLR4_5_2lp6m2ylvicmc4k.R.iget(28623)==0&false))) {{
            __CLR4_5_2lp6m2ylvicmc4k.R.inc(28624);subject = h.getOWLObject();
        } }else {{
            __CLR4_5_2lp6m2ylvicmc4k.R.inc(28625);object = h.getOWLObject();
        }
    }}finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28626);
        __CLR4_5_2lp6m2ylvicmc4k.R.inc(28627);if ((((subject == null)&&(__CLR4_5_2lp6m2ylvicmc4k.R.iget(28628)!=0|true))||(__CLR4_5_2lp6m2ylvicmc4k.R.iget(28629)==0&false))) {{
            __CLR4_5_2lp6m2ylvicmc4k.R.inc(28630);subject = h.getOWLObject();
        } }else {{
            __CLR4_5_2lp6m2ylvicmc4k.R.inc(28631);object = h.getOWLObject();
        }
    }}finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28632);
        __CLR4_5_2lp6m2ylvicmc4k.R.inc(28633);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28634);
        __CLR4_5_2lp6m2ylvicmc4k.R.inc(28635);object = h.getOWLObject();
    }finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m2ylvicmc4k.R.inc(28636);
        __CLR4_5_2lp6m2ylvicmc4k.R.inc(28637);return df.getOWLAnnotationAssertionAxiom(verifyNotNull(property), verifyNotNull(subject), verifyNotNull(object),
            annotations);
    }finally{__CLR4_5_2lp6m2ylvicmc4k.R.flushNeeded();}}
}

class OWLAnnotationElementHandler extends OWLElementHandler<OWLAnnotation> {public static class __CLR4_5_2lp6m3ilvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLAnnotation> annotations = new HashSet<>();
    OWLAnnotationProperty property;
    OWLAnnotationValue object;

    OWLAnnotationElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m3ilvicmc4k.R.inc(28639);try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28638);
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28640);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28641);super.startElement(name);
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28642);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28643);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28644);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28645);super.attribute(localName, value);
        // Legacy Handling
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28646);if ((((localName.equals(ANNOTATION_URI.getShortForm()))&&(__CLR4_5_2lp6m3ilvicmc4k.R.iget(28647)!=0|true))||(__CLR4_5_2lp6m3ilvicmc4k.R.iget(28648)==0&false))) {{
            __CLR4_5_2lp6m3ilvicmc4k.R.inc(28649);IRI iri = handler.getIRI(value);
            __CLR4_5_2lp6m3ilvicmc4k.R.inc(28650);property = df.getOWLAnnotationProperty(iri);
        }
    }}finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28651);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28652);annotations.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28653);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28654);object = h.getOWLObject();
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28655);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28656);object = h.getOWLObject();
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28657);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28658);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractIRIElementHandler h) {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28659);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28660);object = h.getOWLObject();
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}

    @Override
        OWLAnnotation getOWLObject() {try{__CLR4_5_2lp6m3ilvicmc4k.R.inc(28661);
        __CLR4_5_2lp6m3ilvicmc4k.R.inc(28662);return df.getOWLAnnotation(verifyNotNull(property), verifyNotNull(object), annotations);
    }finally{__CLR4_5_2lp6m3ilvicmc4k.R.flushNeeded();}}
}

class OWLAnnotationPropertyDomainElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m47lvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28673,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI domain;
    OWLAnnotationProperty property;

    OWLAnnotationPropertyDomainElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m47lvicmc4k.R.inc(28664);try{__CLR4_5_2lp6m47lvicmc4k.R.inc(28663);
    }finally{__CLR4_5_2lp6m47lvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractIRIElementHandler h) {try{__CLR4_5_2lp6m47lvicmc4k.R.inc(28665);
        __CLR4_5_2lp6m47lvicmc4k.R.inc(28666);domain = h.getOWLObject();
    }finally{__CLR4_5_2lp6m47lvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6m47lvicmc4k.R.inc(28667);
        __CLR4_5_2lp6m47lvicmc4k.R.inc(28668);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m47lvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m47lvicmc4k.R.inc(28669);
        __CLR4_5_2lp6m47lvicmc4k.R.inc(28670);ensureNotNull(property, "Expected annotation property element");
        __CLR4_5_2lp6m47lvicmc4k.R.inc(28671);ensureNotNull(domain, "Expected iri element");
        __CLR4_5_2lp6m47lvicmc4k.R.inc(28672);return df.getOWLAnnotationPropertyDomainAxiom(verifyNotNull(property), verifyNotNull(domain), annotations);
    }finally{__CLR4_5_2lp6m47lvicmc4k.R.flushNeeded();}}
}

class OWLAnnotationPropertyElementHandler extends OWLElementHandler<OWLAnnotationProperty> {public static class __CLR4_5_2lp6m4hlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAnnotationProperty prop;
    IRI iri;

    OWLAnnotationPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m4hlvicmc4k.R.inc(28674);try{__CLR4_5_2lp6m4hlvicmc4k.R.inc(28673);
    }finally{__CLR4_5_2lp6m4hlvicmc4k.R.flushNeeded();}}

    @Override
        OWLAnnotationProperty getOWLObject() {try{__CLR4_5_2lp6m4hlvicmc4k.R.inc(28675);
        __CLR4_5_2lp6m4hlvicmc4k.R.inc(28676);return verifyNotNull(prop);
    }finally{__CLR4_5_2lp6m4hlvicmc4k.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m4hlvicmc4k.R.inc(28677);
        __CLR4_5_2lp6m4hlvicmc4k.R.inc(28678);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6m4hlvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m4hlvicmc4k.R.inc(28679);
        __CLR4_5_2lp6m4hlvicmc4k.R.inc(28680);prop = df.getOWLAnnotationProperty(verifyNotNull(iri));
        __CLR4_5_2lp6m4hlvicmc4k.R.inc(28681);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m4hlvicmc4k.R.flushNeeded();}}
}

class OWLAnnotationPropertyRangeElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m4qlvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI range;
    OWLAnnotationProperty property;

    OWLAnnotationPropertyRangeElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m4qlvicmc4k.R.inc(28683);try{__CLR4_5_2lp6m4qlvicmc4k.R.inc(28682);
    }finally{__CLR4_5_2lp6m4qlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractIRIElementHandler h) {try{__CLR4_5_2lp6m4qlvicmc4k.R.inc(28684);
        __CLR4_5_2lp6m4qlvicmc4k.R.inc(28685);range = h.getOWLObject();
    }finally{__CLR4_5_2lp6m4qlvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6m4qlvicmc4k.R.inc(28686);
        __CLR4_5_2lp6m4qlvicmc4k.R.inc(28687);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m4qlvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m4qlvicmc4k.R.inc(28688);
        __CLR4_5_2lp6m4qlvicmc4k.R.inc(28689);ensureNotNull(property, "Expected annotation property element");
        __CLR4_5_2lp6m4qlvicmc4k.R.inc(28690);ensureNotNull(range, "Expected IRI element");
        __CLR4_5_2lp6m4qlvicmc4k.R.inc(28691);return df.getOWLAnnotationPropertyRangeAxiom(verifyNotNull(property), verifyNotNull(range), annotations);
    }finally{__CLR4_5_2lp6m4qlvicmc4k.R.flushNeeded();}}
}

class OWLAnonymousIndividualElementHandler extends OWLElementHandler<OWLAnonymousIndividual> {public static class __CLR4_5_2lp6m50lvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAnonymousIndividual ind;

    OWLAnonymousIndividualElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m50lvicmc4k.R.inc(28693);try{__CLR4_5_2lp6m50lvicmc4k.R.inc(28692);
    }finally{__CLR4_5_2lp6m50lvicmc4k.R.flushNeeded();}}

    @Override
        OWLAnonymousIndividual getOWLObject() {try{__CLR4_5_2lp6m50lvicmc4k.R.inc(28694);
        __CLR4_5_2lp6m50lvicmc4k.R.inc(28695);return verifyNotNull(ind);
    }finally{__CLR4_5_2lp6m50lvicmc4k.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m50lvicmc4k.R.inc(28696);
        __CLR4_5_2lp6m50lvicmc4k.R.inc(28697);if ((((localName.equals(NODE_ID.getShortForm()))&&(__CLR4_5_2lp6m50lvicmc4k.R.iget(28698)!=0|true))||(__CLR4_5_2lp6m50lvicmc4k.R.iget(28699)==0&false))) {{
            __CLR4_5_2lp6m50lvicmc4k.R.inc(28700);ind = handler.getOWLAnonymousIndividual(value.trim());
        } }else {{
            __CLR4_5_2lp6m50lvicmc4k.R.inc(28701);super.attribute(localName, value);
        }
    }}finally{__CLR4_5_2lp6m50lvicmc4k.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m50lvicmc4k.R.inc(28702);
        __CLR4_5_2lp6m50lvicmc4k.R.inc(28703);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m50lvicmc4k.R.flushNeeded();}}
}

class OWLAsymmetricObjectPropertyAxiomElementHandler extends
    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6m5clvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28708,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAsymmetricObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m5clvicmc4k.R.inc(28705);try{__CLR4_5_2lp6m5clvicmc4k.R.inc(28704);
    }finally{__CLR4_5_2lp6m5clvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6m5clvicmc4k.R.inc(28706);
        __CLR4_5_2lp6m5clvicmc4k.R.inc(28707);return df.getOWLAsymmetricObjectPropertyAxiom(getProperty());
    }finally{__CLR4_5_2lp6m5clvicmc4k.R.flushNeeded();}}
}

class OWLAsymmetricObjectPropertyElementHandler extends AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6m5glvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28712,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAsymmetricObjectPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m5glvicmc4k.R.inc(28709);try{__CLR4_5_2lp6m5glvicmc4k.R.inc(28708);
    }finally{__CLR4_5_2lp6m5glvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6m5glvicmc4k.R.inc(28710);
        __CLR4_5_2lp6m5glvicmc4k.R.inc(28711);return df.getOWLAsymmetricObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6m5glvicmc4k.R.flushNeeded();}}
}

class OWLClassAssertionAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m5klvicmc4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLIndividual individual;
    OWLClassExpression classExpression;

    OWLClassAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m5klvicmc4k.R.inc(28713);try{__CLR4_5_2lp6m5klvicmc4k.R.inc(28712);
    }finally{__CLR4_5_2lp6m5klvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6m5klvicmc4k.R.inc(28714);
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28715);classExpression = h.getOWLObject();
    }finally{__CLR4_5_2lp6m5klvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6m5klvicmc4k.R.inc(28716);
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28717);individual = h.getOWLObject();
    }finally{__CLR4_5_2lp6m5klvicmc4k.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6m5klvicmc4k.R.inc(28718);
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28719);individual = h.getOWLObject();
    }finally{__CLR4_5_2lp6m5klvicmc4k.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m5klvicmc4k.R.inc(28720);
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28721);ensureNotNull(individual, "individual element");
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28722);ensureNotNull(classExpression, "classExpression kind element");
        assert (((classExpression != null)&&(__CLR4_5_2lp6m5klvicmc4k.R.iget(28723)!=0|true))||(__CLR4_5_2lp6m5klvicmc4k.R.iget(28724)==0&false));
        assert (((individual != null)&&(__CLR4_5_2lp6m5klvicmc4k.R.iget(28725)!=0|true))||(__CLR4_5_2lp6m5klvicmc4k.R.iget(28726)==0&false));
        __CLR4_5_2lp6m5klvicmc4k.R.inc(28727);return df.getOWLClassAssertionAxiom(verifyNotNull(classExpression), verifyNotNull(individual), annotations);
    }finally{__CLR4_5_2lp6m5klvicmc4k.R.flushNeeded();}}
}

class OWLClassElementHandler extends AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6m60lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;

    OWLClassElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m60lvicmc4l.R.inc(28729);try{__CLR4_5_2lp6m60lvicmc4l.R.inc(28728);
    }finally{__CLR4_5_2lp6m60lvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m60lvicmc4l.R.inc(28730);
        __CLR4_5_2lp6m60lvicmc4l.R.inc(28731);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6m60lvicmc4l.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6m60lvicmc4l.R.inc(28732);
        __CLR4_5_2lp6m60lvicmc4l.R.inc(28733);ensureAttributeNotNull(iri, "IRI");
        __CLR4_5_2lp6m60lvicmc4l.R.inc(28734);setClassExpression(df.getOWLClass(verifyNotNull(iri)));
    }finally{__CLR4_5_2lp6m60lvicmc4l.R.flushNeeded();}}
}

class OWLDataAllValuesFromElementHandler extends AbstractDataRangeFillerRestrictionElementHandler {public static class __CLR4_5_2lp6m67lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28739,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataAllValuesFromElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m67lvicmc4l.R.inc(28736);try{__CLR4_5_2lp6m67lvicmc4l.R.inc(28735);
    }finally{__CLR4_5_2lp6m67lvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m67lvicmc4l.R.inc(28737);
        __CLR4_5_2lp6m67lvicmc4l.R.inc(28738);return df.getOWLDataAllValuesFrom(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m67lvicmc4l.R.flushNeeded();}}
}

class OWLDataComplementOfElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m6blvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28746,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataRange operand;

    OWLDataComplementOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m6blvicmc4l.R.inc(28740);try{__CLR4_5_2lp6m6blvicmc4l.R.inc(28739);
    }finally{__CLR4_5_2lp6m6blvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m6blvicmc4l.R.inc(28741);
        __CLR4_5_2lp6m6blvicmc4l.R.inc(28742);operand = h.getOWLObject();
    }finally{__CLR4_5_2lp6m6blvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m6blvicmc4l.R.inc(28743);
        __CLR4_5_2lp6m6blvicmc4l.R.inc(28744);ensureNotNull(operand, "data range element");
        __CLR4_5_2lp6m6blvicmc4l.R.inc(28745);setDataRange(df.getOWLDataComplementOf(verifyNotNull(operand)));
    }finally{__CLR4_5_2lp6m6blvicmc4l.R.flushNeeded();}}
}

class OWLDataExactCardinalityElementHandler extends AbstractDataCardinalityRestrictionElementHandler {public static class __CLR4_5_2lp6m6ilvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataExactCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m6ilvicmc4l.R.inc(28747);try{__CLR4_5_2lp6m6ilvicmc4l.R.inc(28746);
    }finally{__CLR4_5_2lp6m6ilvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m6ilvicmc4l.R.inc(28748);
        __CLR4_5_2lp6m6ilvicmc4l.R.inc(28749);return df.getOWLDataExactCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m6ilvicmc4l.R.flushNeeded();}}
}

class OWLDataHasValueElementHandler extends AbstractDataRestrictionElementHandler<OWLLiteral> {public static class __CLR4_5_2lp6m6mlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataHasValueElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m6mlvicmc4l.R.inc(28751);try{__CLR4_5_2lp6m6mlvicmc4l.R.inc(28750);
    }finally{__CLR4_5_2lp6m6mlvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m6mlvicmc4l.R.inc(28752);
        __CLR4_5_2lp6m6mlvicmc4l.R.inc(28753);setFiller(h.getOWLObject());
    }finally{__CLR4_5_2lp6m6mlvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m6mlvicmc4l.R.inc(28754);
        __CLR4_5_2lp6m6mlvicmc4l.R.inc(28755);return df.getOWLDataHasValue(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m6mlvicmc4l.R.flushNeeded();}}
}

class OWLDataIntersectionOfElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m6slvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLDataRange> dataRanges = new HashSet<>();

    OWLDataIntersectionOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m6slvicmc4l.R.inc(28757);try{__CLR4_5_2lp6m6slvicmc4l.R.inc(28756);
    }finally{__CLR4_5_2lp6m6slvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m6slvicmc4l.R.inc(28758);
        __CLR4_5_2lp6m6slvicmc4l.R.inc(28759);dataRanges.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6m6slvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m6slvicmc4l.R.inc(28760);
        __CLR4_5_2lp6m6slvicmc4l.R.inc(28761);setDataRange(df.getOWLDataIntersectionOf(dataRanges));
    }finally{__CLR4_5_2lp6m6slvicmc4l.R.flushNeeded();}}
}

class OWLDataMaxCardinalityElementHandler extends AbstractDataCardinalityRestrictionElementHandler {public static class __CLR4_5_2lp6m6ylvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataMaxCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m6ylvicmc4l.R.inc(28763);try{__CLR4_5_2lp6m6ylvicmc4l.R.inc(28762);
    }finally{__CLR4_5_2lp6m6ylvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m6ylvicmc4l.R.inc(28764);
        __CLR4_5_2lp6m6ylvicmc4l.R.inc(28765);return df.getOWLDataMaxCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m6ylvicmc4l.R.flushNeeded();}}
}

class OWLDataMinCardinalityElementHandler extends AbstractDataCardinalityRestrictionElementHandler {public static class __CLR4_5_2lp6m72lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataMinCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m72lvicmc4l.R.inc(28767);try{__CLR4_5_2lp6m72lvicmc4l.R.inc(28766);
    }finally{__CLR4_5_2lp6m72lvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m72lvicmc4l.R.inc(28768);
        __CLR4_5_2lp6m72lvicmc4l.R.inc(28769);return df.getOWLDataMinCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m72lvicmc4l.R.flushNeeded();}}
}

class OWLDataOneOfElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m76lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLLiteral> constants = new HashSet<>();

    OWLDataOneOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m76lvicmc4l.R.inc(28771);try{__CLR4_5_2lp6m76lvicmc4l.R.inc(28770);
    }finally{__CLR4_5_2lp6m76lvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m76lvicmc4l.R.inc(28772);
        __CLR4_5_2lp6m76lvicmc4l.R.inc(28773);constants.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6m76lvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m76lvicmc4l.R.inc(28774);
        __CLR4_5_2lp6m76lvicmc4l.R.inc(28775);if ((((constants.isEmpty())&&(__CLR4_5_2lp6m76lvicmc4l.R.iget(28776)!=0|true))||(__CLR4_5_2lp6m76lvicmc4l.R.iget(28777)==0&false))) {{
            __CLR4_5_2lp6m76lvicmc4l.R.inc(28778);ensureNotNull(null, "data oneOf element");
        }
        }__CLR4_5_2lp6m76lvicmc4l.R.inc(28779);setDataRange(df.getOWLDataOneOf(constants));
    }finally{__CLR4_5_2lp6m76lvicmc4l.R.flushNeeded();}}
}

class OWLDataPropertyAssertionAxiomElementHandler extends AbstractOWLDataPropertyAssertionAxiomElementHandler {public static class __CLR4_5_2lp6m7glvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m7glvicmc4l.R.inc(28781);try{__CLR4_5_2lp6m7glvicmc4l.R.inc(28780);
    }finally{__CLR4_5_2lp6m7glvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m7glvicmc4l.R.inc(28782);
        __CLR4_5_2lp6m7glvicmc4l.R.inc(28783);return df.getOWLDataPropertyAssertionAxiom(verifyNotNull(property), verifyNotNull(subject), verifyNotNull(
            object), annotations);
    }finally{__CLR4_5_2lp6m7glvicmc4l.R.flushNeeded();}}
}

class OWLDataPropertyDomainAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m7klvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28794,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression domain;
    OWLDataPropertyExpression property;

    OWLDataPropertyDomainAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m7klvicmc4l.R.inc(28785);try{__CLR4_5_2lp6m7klvicmc4l.R.inc(28784);
    }finally{__CLR4_5_2lp6m7klvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6m7klvicmc4l.R.inc(28786);
        __CLR4_5_2lp6m7klvicmc4l.R.inc(28787);domain = h.getOWLObject();
    }finally{__CLR4_5_2lp6m7klvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6m7klvicmc4l.R.inc(28788);
        __CLR4_5_2lp6m7klvicmc4l.R.inc(28789);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m7klvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m7klvicmc4l.R.inc(28790);
        __CLR4_5_2lp6m7klvicmc4l.R.inc(28791);ensureNotNull(property, "data property element");
        __CLR4_5_2lp6m7klvicmc4l.R.inc(28792);ensureNotNull(domain, "class expression element");
        __CLR4_5_2lp6m7klvicmc4l.R.inc(28793);return df.getOWLDataPropertyDomainAxiom(verifyNotNull(property), verifyNotNull(domain), verifyNotNull(
            annotations));
    }finally{__CLR4_5_2lp6m7klvicmc4l.R.flushNeeded();}}
}

class OWLDataPropertyElementHandler extends OWLElementHandler<OWLDataPropertyExpression> {public static class __CLR4_5_2lp6m7ulvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataPropertyExpression prop;
    IRI iri;

    OWLDataPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m7ulvicmc4l.R.inc(28795);try{__CLR4_5_2lp6m7ulvicmc4l.R.inc(28794);
    }finally{__CLR4_5_2lp6m7ulvicmc4l.R.flushNeeded();}}

    @Override
        OWLDataPropertyExpression getOWLObject() {try{__CLR4_5_2lp6m7ulvicmc4l.R.inc(28796);
        __CLR4_5_2lp6m7ulvicmc4l.R.inc(28797);return verifyNotNull(prop);
    }finally{__CLR4_5_2lp6m7ulvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m7ulvicmc4l.R.inc(28798);
        __CLR4_5_2lp6m7ulvicmc4l.R.inc(28799);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6m7ulvicmc4l.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m7ulvicmc4l.R.inc(28800);
        __CLR4_5_2lp6m7ulvicmc4l.R.inc(28801);prop = df.getOWLDataProperty(verifyNotNull(iri));
        __CLR4_5_2lp6m7ulvicmc4l.R.inc(28802);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m7ulvicmc4l.R.flushNeeded();}}
}

class OWLDataPropertyRangeAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m83lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataPropertyExpression property;
    OWLDataRange range;

    OWLDataPropertyRangeAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m83lvicmc4l.R.inc(28804);try{__CLR4_5_2lp6m83lvicmc4l.R.inc(28803);
    }finally{__CLR4_5_2lp6m83lvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m83lvicmc4l.R.inc(28805);
        __CLR4_5_2lp6m83lvicmc4l.R.inc(28806);range = h.getOWLObject();
    }finally{__CLR4_5_2lp6m83lvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6m83lvicmc4l.R.inc(28807);
        __CLR4_5_2lp6m83lvicmc4l.R.inc(28808);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6m83lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m83lvicmc4l.R.inc(28809);
        __CLR4_5_2lp6m83lvicmc4l.R.inc(28810);ensureNotNull(property, "data property element");
        __CLR4_5_2lp6m83lvicmc4l.R.inc(28811);ensureNotNull(range, "data range element");
        __CLR4_5_2lp6m83lvicmc4l.R.inc(28812);return df.getOWLDataPropertyRangeAxiom(verifyNotNull(property), verifyNotNull(range), annotations);
    }finally{__CLR4_5_2lp6m83lvicmc4l.R.flushNeeded();}}
}

class OWLDataRestrictionElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m8dlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLLiteral constant;
    IRI facetIRI;

    OWLDataRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m8dlvicmc4l.R.inc(28814);try{__CLR4_5_2lp6m8dlvicmc4l.R.inc(28813);
    }finally{__CLR4_5_2lp6m8dlvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m8dlvicmc4l.R.inc(28815);
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28816);dataRange = h.getOWLObject();
    }finally{__CLR4_5_2lp6m8dlvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m8dlvicmc4l.R.inc(28817);
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28818);constant = h.getOWLObject();
    }finally{__CLR4_5_2lp6m8dlvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m8dlvicmc4l.R.inc(28819);
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28820);super.attribute(localName, value);
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28821);if ((((localName.equals("facet"))&&(__CLR4_5_2lp6m8dlvicmc4l.R.iget(28822)!=0|true))||(__CLR4_5_2lp6m8dlvicmc4l.R.iget(28823)==0&false))) {{
            __CLR4_5_2lp6m8dlvicmc4l.R.inc(28824);facetIRI = handler.getIRI(value);
        }
    }}finally{__CLR4_5_2lp6m8dlvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m8dlvicmc4l.R.inc(28825);
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28826);ensureNotNull(dataRange, "data range element");
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28827);ensureNotNull(constant, "typed constant element");
        __CLR4_5_2lp6m8dlvicmc4l.R.inc(28828);setDataRange(df.getOWLDatatypeRestriction((OWLDatatype) verifyNotNull(dataRange), OWLFacet.getFacet(
            verifyNotNull(facetIRI)), verifyNotNull(constant)));
    }finally{__CLR4_5_2lp6m8dlvicmc4l.R.flushNeeded();}}
}

class OWLDataSomeValuesFromElementHandler extends AbstractDataRangeFillerRestrictionElementHandler {public static class __CLR4_5_2lp6m8tlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataSomeValuesFromElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m8tlvicmc4l.R.inc(28830);try{__CLR4_5_2lp6m8tlvicmc4l.R.inc(28829);
    }finally{__CLR4_5_2lp6m8tlvicmc4l.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6m8tlvicmc4l.R.inc(28831);
        __CLR4_5_2lp6m8tlvicmc4l.R.inc(28832);return df.getOWLDataSomeValuesFrom(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6m8tlvicmc4l.R.flushNeeded();}}
}

class OWLDataUnionOfElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m8xlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28839,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLDataRange> dataRanges = new HashSet<>();

    OWLDataUnionOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m8xlvicmc4l.R.inc(28834);try{__CLR4_5_2lp6m8xlvicmc4l.R.inc(28833);
    }finally{__CLR4_5_2lp6m8xlvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m8xlvicmc4l.R.inc(28835);
        __CLR4_5_2lp6m8xlvicmc4l.R.inc(28836);dataRanges.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6m8xlvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m8xlvicmc4l.R.inc(28837);
        __CLR4_5_2lp6m8xlvicmc4l.R.inc(28838);setDataRange(df.getOWLDataUnionOf(dataRanges));
    }finally{__CLR4_5_2lp6m8xlvicmc4l.R.flushNeeded();}}
}

class OWLDatatypeDefinitionElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6m93lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28850,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDatatype datatype;
    OWLDataRange dataRange;

    OWLDatatypeDefinitionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m93lvicmc4l.R.inc(28840);try{__CLR4_5_2lp6m93lvicmc4l.R.inc(28839);
    }finally{__CLR4_5_2lp6m93lvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m93lvicmc4l.R.inc(28841);
        __CLR4_5_2lp6m93lvicmc4l.R.inc(28842);OWLDataRange handledDataRange = h.getOWLObject();
        __CLR4_5_2lp6m93lvicmc4l.R.inc(28843);if ((((handledDataRange.isDatatype() && datatype == null)&&(__CLR4_5_2lp6m93lvicmc4l.R.iget(28844)!=0|true))||(__CLR4_5_2lp6m93lvicmc4l.R.iget(28845)==0&false))) {{
            __CLR4_5_2lp6m93lvicmc4l.R.inc(28846);datatype = handledDataRange.asOWLDatatype();
        } }else {{
            __CLR4_5_2lp6m93lvicmc4l.R.inc(28847);dataRange = handledDataRange;
        }
    }}finally{__CLR4_5_2lp6m93lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6m93lvicmc4l.R.inc(28848);
        __CLR4_5_2lp6m93lvicmc4l.R.inc(28849);return df.getOWLDatatypeDefinitionAxiom(verifyNotNull(verifyNotNull(datatype)), verifyNotNull(dataRange),
            annotations);
    }finally{__CLR4_5_2lp6m93lvicmc4l.R.flushNeeded();}}
}

class OWLDatatypeElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m9elvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;

    OWLDatatypeElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m9elvicmc4l.R.inc(28851);try{__CLR4_5_2lp6m9elvicmc4l.R.inc(28850);
    }finally{__CLR4_5_2lp6m9elvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6m9elvicmc4l.R.inc(28852);
        __CLR4_5_2lp6m9elvicmc4l.R.inc(28853);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6m9elvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m9elvicmc4l.R.inc(28854);
        __CLR4_5_2lp6m9elvicmc4l.R.inc(28855);ensureAttributeNotNull(iri, "IRI");
        __CLR4_5_2lp6m9elvicmc4l.R.inc(28856);setDataRange(df.getOWLDatatype(verifyNotNull(iri)));
    }finally{__CLR4_5_2lp6m9elvicmc4l.R.flushNeeded();}}
}

class OWLDatatypeFacetRestrictionElementHandler extends OWLElementHandler<OWLFacetRestriction> {public static class __CLR4_5_2lp6m9llvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLFacet facet;
    OWLLiteral constant;

    OWLDatatypeFacetRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m9llvicmc4l.R.inc(28858);try{__CLR4_5_2lp6m9llvicmc4l.R.inc(28857);
    }finally{__CLR4_5_2lp6m9llvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6m9llvicmc4l.R.inc(28859);
        __CLR4_5_2lp6m9llvicmc4l.R.inc(28860);constant = h.getOWLObject();
    }finally{__CLR4_5_2lp6m9llvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, String value) {try{__CLR4_5_2lp6m9llvicmc4l.R.inc(28861);
        __CLR4_5_2lp6m9llvicmc4l.R.inc(28862);if ((((localName.equals("facet"))&&(__CLR4_5_2lp6m9llvicmc4l.R.iget(28863)!=0|true))||(__CLR4_5_2lp6m9llvicmc4l.R.iget(28864)==0&false))) {{
            __CLR4_5_2lp6m9llvicmc4l.R.inc(28865);facet = OWLFacet.getFacet(IRI.create(value));
        }
    }}finally{__CLR4_5_2lp6m9llvicmc4l.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6m9llvicmc4l.R.inc(28866);
        __CLR4_5_2lp6m9llvicmc4l.R.inc(28867);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6m9llvicmc4l.R.flushNeeded();}}

    @Override
        OWLFacetRestriction getOWLObject() {try{__CLR4_5_2lp6m9llvicmc4l.R.inc(28868);
        __CLR4_5_2lp6m9llvicmc4l.R.inc(28869);return df.getOWLFacetRestriction(verifyNotNull(facet), verifyNotNull(constant));
    }finally{__CLR4_5_2lp6m9llvicmc4l.R.flushNeeded();}}
}

class OWLDatatypeRestrictionElementHandler extends AbstractOWLDataRangeHandler {public static class __CLR4_5_2lp6m9ylvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDatatype restrictedDataRange;
    @Nonnull final Set<OWLFacetRestriction> facetRestrictions = new HashSet<>();

    OWLDatatypeRestrictionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6m9ylvicmc4l.R.inc(28871);try{__CLR4_5_2lp6m9ylvicmc4l.R.inc(28870);
    }finally{__CLR4_5_2lp6m9ylvicmc4l.R.flushNeeded();}}

    @Override
        void endDataRangeElement() {try{__CLR4_5_2lp6m9ylvicmc4l.R.inc(28872);
        __CLR4_5_2lp6m9ylvicmc4l.R.inc(28873);setDataRange(df.getOWLDatatypeRestriction(verifyNotNull(restrictedDataRange), facetRestrictions));
    }finally{__CLR4_5_2lp6m9ylvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6m9ylvicmc4l.R.inc(28874);
        __CLR4_5_2lp6m9ylvicmc4l.R.inc(28875);OWLDataRange dr = h.getOWLObject();
        __CLR4_5_2lp6m9ylvicmc4l.R.inc(28876);if ((((dr.isDatatype())&&(__CLR4_5_2lp6m9ylvicmc4l.R.iget(28877)!=0|true))||(__CLR4_5_2lp6m9ylvicmc4l.R.iget(28878)==0&false))) {{
            __CLR4_5_2lp6m9ylvicmc4l.R.inc(28879);restrictedDataRange = dr.asOWLDatatype();
        }
    }}finally{__CLR4_5_2lp6m9ylvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDatatypeFacetRestrictionElementHandler h) {try{__CLR4_5_2lp6m9ylvicmc4l.R.inc(28880);
        __CLR4_5_2lp6m9ylvicmc4l.R.inc(28881);facetRestrictions.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6m9ylvicmc4l.R.flushNeeded();}}
}

class OWLDeclarationAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6maalvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28908,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLEntity entity;
    // XXX this set seems unused
    @Nonnull final Set<OWLAnnotation> entityAnnotations = new HashSet<>();

    OWLDeclarationAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6maalvicmc4l.R.inc(28883);try{__CLR4_5_2lp6maalvicmc4l.R.inc(28882);
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28884);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28885);super.startElement(name);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28886);entity = null;
        __CLR4_5_2lp6maalvicmc4l.R.inc(28887);entityAnnotations.clear();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28888);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28889);entity = (OWLClass) h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28890);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28891);entity = (OWLEntity) h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28892);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28893);entity = (OWLEntity) h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28894);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28895);entity = (OWLEntity) h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28896);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28897);entity = h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28898);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28899);entity = h.getOWLObject();
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28900);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28901);return df.getOWLDeclarationAxiom(verifyNotNull(entity), annotations);
    }finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6maalvicmc4l.R.inc(28902);
        __CLR4_5_2lp6maalvicmc4l.R.inc(28903);if ((((entity == null)&&(__CLR4_5_2lp6maalvicmc4l.R.iget(28904)!=0|true))||(__CLR4_5_2lp6maalvicmc4l.R.iget(28905)==0&false))) {{
            __CLR4_5_2lp6maalvicmc4l.R.inc(28906);super.handleChild(h);
        } }else {{
            __CLR4_5_2lp6maalvicmc4l.R.inc(28907);entityAnnotations.add(h.getOWLObject());
        }
    }}finally{__CLR4_5_2lp6maalvicmc4l.R.flushNeeded();}}
}

class OWLDifferentIndividualsAxiomElementHandler extends AbstractOWLIndividualOperandAxiomElementHandler {public static class __CLR4_5_2lp6mb0lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDifferentIndividualsAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mb0lvicmc4l.R.inc(28909);try{__CLR4_5_2lp6mb0lvicmc4l.R.inc(28908);
    }finally{__CLR4_5_2lp6mb0lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mb0lvicmc4l.R.inc(28910);
        __CLR4_5_2lp6mb0lvicmc4l.R.inc(28911);return df.getOWLDifferentIndividualsAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mb0lvicmc4l.R.flushNeeded();}}
}

class OWLDisjointClassesAxiomElementHandler extends AbstractClassExpressionOperandAxiomElementHandler {public static class __CLR4_5_2lp6mb4lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28916,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDisjointClassesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mb4lvicmc4l.R.inc(28913);try{__CLR4_5_2lp6mb4lvicmc4l.R.inc(28912);
    }finally{__CLR4_5_2lp6mb4lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mb4lvicmc4l.R.inc(28914);
        __CLR4_5_2lp6mb4lvicmc4l.R.inc(28915);return df.getOWLDisjointClassesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mb4lvicmc4l.R.flushNeeded();}}
}

class OWLDisjointDataPropertiesAxiomElementHandler extends AbstractOWLDataPropertyOperandAxiomElementHandler {public static class __CLR4_5_2lp6mb8lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDisjointDataPropertiesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mb8lvicmc4l.R.inc(28917);try{__CLR4_5_2lp6mb8lvicmc4l.R.inc(28916);
    }finally{__CLR4_5_2lp6mb8lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mb8lvicmc4l.R.inc(28918);
        __CLR4_5_2lp6mb8lvicmc4l.R.inc(28919);return df.getOWLDisjointDataPropertiesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mb8lvicmc4l.R.flushNeeded();}}
}

class OWLDisjointObjectPropertiesAxiomElementHandler extends AbstractOWLObjectPropertyOperandAxiomElementHandler {public static class __CLR4_5_2lp6mbclvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28924,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDisjointObjectPropertiesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mbclvicmc4l.R.inc(28921);try{__CLR4_5_2lp6mbclvicmc4l.R.inc(28920);
    }finally{__CLR4_5_2lp6mbclvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mbclvicmc4l.R.inc(28922);
        __CLR4_5_2lp6mbclvicmc4l.R.inc(28923);return df.getOWLDisjointObjectPropertiesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mbclvicmc4l.R.flushNeeded();}}
}

class OWLDisjointUnionElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mbglvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28935,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClass cls;
    @Nonnull final Set<OWLClassExpression> classExpressions = new HashSet<>();

    OWLDisjointUnionElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mbglvicmc4l.R.inc(28925);try{__CLR4_5_2lp6mbglvicmc4l.R.inc(28924);
    }finally{__CLR4_5_2lp6mbglvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mbglvicmc4l.R.inc(28926);
        __CLR4_5_2lp6mbglvicmc4l.R.inc(28927);return df.getOWLDisjointUnionAxiom(verifyNotNull(cls), classExpressions, annotations);
    }finally{__CLR4_5_2lp6mbglvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mbglvicmc4l.R.inc(28928);
        __CLR4_5_2lp6mbglvicmc4l.R.inc(28929);if ((((cls == null)&&(__CLR4_5_2lp6mbglvicmc4l.R.iget(28930)!=0|true))||(__CLR4_5_2lp6mbglvicmc4l.R.iget(28931)==0&false))) {{
            __CLR4_5_2lp6mbglvicmc4l.R.inc(28932);OWLClassExpression desc = h.getOWLObject();
            __CLR4_5_2lp6mbglvicmc4l.R.inc(28933);cls = (OWLClass) desc;
        } }else {{
            __CLR4_5_2lp6mbglvicmc4l.R.inc(28934);classExpressions.add(h.getOWLObject());
        }
    }}finally{__CLR4_5_2lp6mbglvicmc4l.R.flushNeeded();}}
}

class OWLEquivalentClassesAxiomElementHandler extends AbstractClassExpressionOperandAxiomElementHandler {public static class __CLR4_5_2lp6mbrlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28939,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLEquivalentClassesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mbrlvicmc4l.R.inc(28936);try{__CLR4_5_2lp6mbrlvicmc4l.R.inc(28935);
    }finally{__CLR4_5_2lp6mbrlvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mbrlvicmc4l.R.inc(28937);
        __CLR4_5_2lp6mbrlvicmc4l.R.inc(28938);return df.getOWLEquivalentClassesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mbrlvicmc4l.R.flushNeeded();}}
}

class OWLEquivalentDataPropertiesAxiomElementHandler extends AbstractOWLDataPropertyOperandAxiomElementHandler {public static class __CLR4_5_2lp6mbvlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28943,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLEquivalentDataPropertiesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mbvlvicmc4l.R.inc(28940);try{__CLR4_5_2lp6mbvlvicmc4l.R.inc(28939);
    }finally{__CLR4_5_2lp6mbvlvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mbvlvicmc4l.R.inc(28941);
        __CLR4_5_2lp6mbvlvicmc4l.R.inc(28942);return df.getOWLEquivalentDataPropertiesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mbvlvicmc4l.R.flushNeeded();}}
}

class OWLEquivalentObjectPropertiesAxiomElementHandler extends AbstractOWLObjectPropertyOperandAxiomElementHandler {public static class __CLR4_5_2lp6mbzlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLEquivalentObjectPropertiesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mbzlvicmc4l.R.inc(28944);try{__CLR4_5_2lp6mbzlvicmc4l.R.inc(28943);
    }finally{__CLR4_5_2lp6mbzlvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mbzlvicmc4l.R.inc(28945);
        __CLR4_5_2lp6mbzlvicmc4l.R.inc(28946);return df.getOWLEquivalentObjectPropertiesAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mbzlvicmc4l.R.flushNeeded();}}
}

class OWLFunctionalDataPropertyAxiomElementHandler extends
    AbstractOWLPropertyCharacteristicAxiomElementHandler<OWLDataPropertyExpression> {public static class __CLR4_5_2lp6mc3lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28954,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLFunctionalDataPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mc3lvicmc4l.R.inc(28948);try{__CLR4_5_2lp6mc3lvicmc4l.R.inc(28947);
    }finally{__CLR4_5_2lp6mc3lvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6mc3lvicmc4l.R.inc(28949);
        __CLR4_5_2lp6mc3lvicmc4l.R.inc(28950);setProperty(h.getOWLObject());
    }finally{__CLR4_5_2lp6mc3lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mc3lvicmc4l.R.inc(28951);
        __CLR4_5_2lp6mc3lvicmc4l.R.inc(28952);ensureNotNull(getProperty(), "Expected data property element");
        __CLR4_5_2lp6mc3lvicmc4l.R.inc(28953);return df.getOWLFunctionalDataPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mc3lvicmc4l.R.flushNeeded();}}
}

class OWLFunctionalObjectPropertyAxiomElementHandler extends
    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6mcalvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLFunctionalObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mcalvicmc4l.R.inc(28955);try{__CLR4_5_2lp6mcalvicmc4l.R.inc(28954);
    }finally{__CLR4_5_2lp6mcalvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mcalvicmc4l.R.inc(28956);
        __CLR4_5_2lp6mcalvicmc4l.R.inc(28957);return df.getOWLFunctionalObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mcalvicmc4l.R.flushNeeded();}}
}

class OWLHasKeyElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mcelvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression ce;
    @Nonnull final Set<OWLPropertyExpression> props = new HashSet<>();

    OWLHasKeyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mcelvicmc4l.R.inc(28959);try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28958);
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28960);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28961);super.startElement(name);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28962);props.clear();
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28963);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28964);ce = h.getOWLObject();
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28965);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28966);props.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28967);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28968);props.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mcelvicmc4l.R.inc(28969);
        __CLR4_5_2lp6mcelvicmc4l.R.inc(28970);return df.getOWLHasKeyAxiom(verifyNotNull(ce), props, annotations);
    }finally{__CLR4_5_2lp6mcelvicmc4l.R.flushNeeded();}}
}

class OWLIndividualElementHandler extends OWLElementHandler<OWLNamedIndividual> {public static class __CLR4_5_2lp6mcrlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLNamedIndividual individual;
    IRI name;

    OWLIndividualElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mcrlvicmc4l.R.inc(28972);try{__CLR4_5_2lp6mcrlvicmc4l.R.inc(28971);
    }finally{__CLR4_5_2lp6mcrlvicmc4l.R.flushNeeded();}}

    @Override
        OWLNamedIndividual getOWLObject() {try{__CLR4_5_2lp6mcrlvicmc4l.R.inc(28973);
        __CLR4_5_2lp6mcrlvicmc4l.R.inc(28974);return verifyNotNull(individual);
    }finally{__CLR4_5_2lp6mcrlvicmc4l.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6mcrlvicmc4l.R.inc(28975);
        __CLR4_5_2lp6mcrlvicmc4l.R.inc(28976);name = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6mcrlvicmc4l.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mcrlvicmc4l.R.inc(28977);
        __CLR4_5_2lp6mcrlvicmc4l.R.inc(28978);individual = df.getOWLNamedIndividual(verifyNotNull(name));
        __CLR4_5_2lp6mcrlvicmc4l.R.inc(28979);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mcrlvicmc4l.R.flushNeeded();}}
}

class OWLInverseFunctionalObjectPropertyAxiomElementHandler extends
    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6md0lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,28984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLInverseFunctionalObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6md0lvicmc4l.R.inc(28981);try{__CLR4_5_2lp6md0lvicmc4l.R.inc(28980);
    }finally{__CLR4_5_2lp6md0lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6md0lvicmc4l.R.inc(28982);
        __CLR4_5_2lp6md0lvicmc4l.R.inc(28983);return df.getOWLInverseFunctionalObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6md0lvicmc4l.R.flushNeeded();}}
}

class OWLInverseObjectPropertiesAxiomElementHandler extends AbstractOWLObjectPropertyOperandAxiomElementHandler {public static class __CLR4_5_2lp6md4lvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLInverseObjectPropertiesAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6md4lvicmc4l.R.inc(28985);try{__CLR4_5_2lp6md4lvicmc4l.R.inc(28984);
    }finally{__CLR4_5_2lp6md4lvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6md4lvicmc4l.R.inc(28986);
        __CLR4_5_2lp6md4lvicmc4l.R.inc(28987);Set<OWLObjectPropertyExpression> props = getOperands();
        __CLR4_5_2lp6md4lvicmc4l.R.inc(28988);if ((((props.size() > 2 || props.size() < 1)&&(__CLR4_5_2lp6md4lvicmc4l.R.iget(28989)!=0|true))||(__CLR4_5_2lp6md4lvicmc4l.R.iget(28990)==0&false))) {{
            __CLR4_5_2lp6md4lvicmc4l.R.inc(28991);ensureNotNull(null, "Expected 2 object property expression elements");
        }
        }__CLR4_5_2lp6md4lvicmc4l.R.inc(28992);Iterator<OWLObjectPropertyExpression> it = props.iterator();
        __CLR4_5_2lp6md4lvicmc4l.R.inc(28993);OWLObjectPropertyExpression propA = it.next();
        __CLR4_5_2lp6md4lvicmc4l.R.inc(28994);OWLObjectPropertyExpression propB;
        __CLR4_5_2lp6md4lvicmc4l.R.inc(28995);if ((((it.hasNext())&&(__CLR4_5_2lp6md4lvicmc4l.R.iget(28996)!=0|true))||(__CLR4_5_2lp6md4lvicmc4l.R.iget(28997)==0&false))) {{
            __CLR4_5_2lp6md4lvicmc4l.R.inc(28998);propB = it.next();
        } }else {{
            // Syntactic variant of symmetric property
            __CLR4_5_2lp6md4lvicmc4l.R.inc(28999);propB = propA;
        }
        }assert (((propA != null)&&(__CLR4_5_2lp6md4lvicmc4l.R.iget(29000)!=0|true))||(__CLR4_5_2lp6md4lvicmc4l.R.iget(29001)==0&false));
        assert (((propB != null)&&(__CLR4_5_2lp6md4lvicmc4l.R.iget(29002)!=0|true))||(__CLR4_5_2lp6md4lvicmc4l.R.iget(29003)==0&false));
        __CLR4_5_2lp6md4lvicmc4l.R.inc(29004);return df.getOWLInverseObjectPropertiesAxiom(propA, propB, annotations);
    }finally{__CLR4_5_2lp6md4lvicmc4l.R.flushNeeded();}}
}

class OWLInverseObjectPropertyElementHandler extends AbstractOWLObjectPropertyElementHandler {public static class __CLR4_5_2lp6mdplvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29012,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyExpression inverse;

    OWLInverseObjectPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mdplvicmc4l.R.inc(29006);try{__CLR4_5_2lp6mdplvicmc4l.R.inc(29005);
    }finally{__CLR4_5_2lp6mdplvicmc4l.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mdplvicmc4l.R.inc(29007);
        __CLR4_5_2lp6mdplvicmc4l.R.inc(29008);inverse = h.getOWLObject();
    }finally{__CLR4_5_2lp6mdplvicmc4l.R.flushNeeded();}}

    @Override
        void endObjectPropertyElement() {try{__CLR4_5_2lp6mdplvicmc4l.R.inc(29009);
        __CLR4_5_2lp6mdplvicmc4l.R.inc(29010);ensureNotNull(inverse, OBJECT_INVERSE_OF.getShortForm());
        __CLR4_5_2lp6mdplvicmc4l.R.inc(29011);setOWLObjectPropertyExpression(df.getOWLObjectInverseOf(verifyNotNull(inverse)));
    }finally{__CLR4_5_2lp6mdplvicmc4l.R.flushNeeded();}}
}

class OWLIrreflexiveObjectPropertyAxiomElementHandler extends
    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6mdwlvicmc4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLIrreflexiveObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mdwlvicmc4l.R.inc(29013);try{__CLR4_5_2lp6mdwlvicmc4l.R.inc(29012);
    }finally{__CLR4_5_2lp6mdwlvicmc4l.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mdwlvicmc4l.R.inc(29014);
        __CLR4_5_2lp6mdwlvicmc4l.R.inc(29015);return df.getOWLIrreflexiveObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mdwlvicmc4l.R.flushNeeded();}}
}

class OWLLiteralElementHandler extends OWLElementHandler<OWLLiteral> {public static class __CLR4_5_2lp6me0lvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29042,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLLiteral literal;
    IRI iri;
    String lang;

    OWLLiteralElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6me0lvicmc4m.R.inc(29017);try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29016);
    }finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29018);
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29019);super.startElement(name);
    }finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29020);
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29021);if ((((localName.equals(DATATYPE_IRI.getShortForm()))&&(__CLR4_5_2lp6me0lvicmc4m.R.iget(29022)!=0|true))||(__CLR4_5_2lp6me0lvicmc4m.R.iget(29023)==0&false))) {{
            __CLR4_5_2lp6me0lvicmc4m.R.inc(29024);iri = handler.getIRI(value);
        } }else {__CLR4_5_2lp6me0lvicmc4m.R.inc(29025);if ((((localName.equals("lang"))&&(__CLR4_5_2lp6me0lvicmc4m.R.iget(29026)!=0|true))||(__CLR4_5_2lp6me0lvicmc4m.R.iget(29027)==0&false))) {{
            __CLR4_5_2lp6me0lvicmc4m.R.inc(29028);lang = value;
        }
    }}}finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29029);
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29030);if ((((iri != null && !iri.isPlainLiteral())&&(__CLR4_5_2lp6me0lvicmc4m.R.iget(29031)!=0|true))||(__CLR4_5_2lp6me0lvicmc4m.R.iget(29032)==0&false))) {{
            __CLR4_5_2lp6me0lvicmc4m.R.inc(29033);literal = df.getOWLLiteral(getText(), df.getOWLDatatype(verifyNotNull(iri)));
        } }else {{
            __CLR4_5_2lp6me0lvicmc4m.R.inc(29034);literal = df.getOWLLiteral(getText(), lang);
        }
        }__CLR4_5_2lp6me0lvicmc4m.R.inc(29035);lang = null;
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29036);iri = null;
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29037);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}

    @Override
        OWLLiteral getOWLObject() {try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29038);
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29039);return verifyNotNull(literal);
    }finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}

    @Override
        boolean isTextContentPossible() {try{__CLR4_5_2lp6me0lvicmc4m.R.inc(29040);
        __CLR4_5_2lp6me0lvicmc4m.R.inc(29041);return true;
    }finally{__CLR4_5_2lp6me0lvicmc4m.R.flushNeeded();}}
}

class OWLNegativeDataPropertyAssertionAxiomElementHandler extends AbstractOWLDataPropertyAssertionAxiomElementHandler {public static class __CLR4_5_2lp6meqlvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLNegativeDataPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6meqlvicmc4m.R.inc(29043);try{__CLR4_5_2lp6meqlvicmc4m.R.inc(29042);
    }finally{__CLR4_5_2lp6meqlvicmc4m.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6meqlvicmc4m.R.inc(29044);
        __CLR4_5_2lp6meqlvicmc4m.R.inc(29045);return df.getOWLNegativeDataPropertyAssertionAxiom(verifyNotNull(property), verifyNotNull(subject),
            verifyNotNull(object), annotations);
    }finally{__CLR4_5_2lp6meqlvicmc4m.R.flushNeeded();}}
}

class OWLNegativeObjectPropertyAssertionAxiomElementHandler extends
    AbstractOWLObjectPropertyAssertionAxiomElementHandler {public static class __CLR4_5_2lp6meulvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLNegativeObjectPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6meulvicmc4m.R.inc(29047);try{__CLR4_5_2lp6meulvicmc4m.R.inc(29046);
    }finally{__CLR4_5_2lp6meulvicmc4m.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6meulvicmc4m.R.inc(29048);
        __CLR4_5_2lp6meulvicmc4m.R.inc(29049);return df.getOWLNegativeObjectPropertyAssertionAxiom(verifyNotNull(property), verifyNotNull(subject),
            verifyNotNull(object), annotations);
    }finally{__CLR4_5_2lp6meulvicmc4m.R.flushNeeded();}}
}

class OWLObjectAllValuesFromElementHandler extends AbstractClassExpressionFillerRestriction {public static class __CLR4_5_2lp6meylvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectAllValuesFromElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6meylvicmc4m.R.inc(29051);try{__CLR4_5_2lp6meylvicmc4m.R.inc(29050);
    }finally{__CLR4_5_2lp6meylvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6meylvicmc4m.R.inc(29052);
        __CLR4_5_2lp6meylvicmc4m.R.inc(29053);return df.getOWLObjectAllValuesFrom(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6meylvicmc4m.R.flushNeeded();}}
}

class OWLObjectComplementOfElementHandler extends AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6mf2lvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression operand;

    OWLObjectComplementOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mf2lvicmc4m.R.inc(29055);try{__CLR4_5_2lp6mf2lvicmc4m.R.inc(29054);
    }finally{__CLR4_5_2lp6mf2lvicmc4m.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mf2lvicmc4m.R.inc(29056);
        __CLR4_5_2lp6mf2lvicmc4m.R.inc(29057);operand = h.getOWLObject();
    }finally{__CLR4_5_2lp6mf2lvicmc4m.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6mf2lvicmc4m.R.inc(29058);
        __CLR4_5_2lp6mf2lvicmc4m.R.inc(29059);ensureNotNull(operand, "class expression element");
        __CLR4_5_2lp6mf2lvicmc4m.R.inc(29060);setClassExpression(df.getOWLObjectComplementOf(verifyNotNull(operand)));
    }finally{__CLR4_5_2lp6mf2lvicmc4m.R.flushNeeded();}}
}

class OWLObjectExactCardinalityElementHandler extends AbstractOWLObjectCardinalityElementHandler {public static class __CLR4_5_2lp6mf9lvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectExactCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mf9lvicmc4m.R.inc(29062);try{__CLR4_5_2lp6mf9lvicmc4m.R.inc(29061);
    }finally{__CLR4_5_2lp6mf9lvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createCardinalityRestriction() {try{__CLR4_5_2lp6mf9lvicmc4m.R.inc(29063);
        __CLR4_5_2lp6mf9lvicmc4m.R.inc(29064);return df.getOWLObjectExactCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6mf9lvicmc4m.R.flushNeeded();}}
}

class OWLObjectExistsSelfElementHandler extends AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6mfdlvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyExpression property;

    OWLObjectExistsSelfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mfdlvicmc4m.R.inc(29066);try{__CLR4_5_2lp6mfdlvicmc4m.R.inc(29065);
    }finally{__CLR4_5_2lp6mfdlvicmc4m.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mfdlvicmc4m.R.inc(29067);
        __CLR4_5_2lp6mfdlvicmc4m.R.inc(29068);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6mfdlvicmc4m.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6mfdlvicmc4m.R.inc(29069);
        __CLR4_5_2lp6mfdlvicmc4m.R.inc(29070);ensureNotNull(property, "Was expecting object property expression element");
        __CLR4_5_2lp6mfdlvicmc4m.R.inc(29071);setClassExpression(df.getOWLObjectHasSelf(verifyNotNull(property)));
    }finally{__CLR4_5_2lp6mfdlvicmc4m.R.flushNeeded();}}
}

class OWLObjectHasValueElementHandler extends AbstractObjectRestrictionElementHandler<OWLIndividual> {public static class __CLR4_5_2lp6mfklvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectHasValueElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mfklvicmc4m.R.inc(29073);try{__CLR4_5_2lp6mfklvicmc4m.R.inc(29072);
    }finally{__CLR4_5_2lp6mfklvicmc4m.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mfklvicmc4m.R.inc(29074);
        __CLR4_5_2lp6mfklvicmc4m.R.inc(29075);setFiller(h.getOWLObject());
    }finally{__CLR4_5_2lp6mfklvicmc4m.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6mfklvicmc4m.R.inc(29076);
        __CLR4_5_2lp6mfklvicmc4m.R.inc(29077);setFiller(h.getOWLObject());
    }finally{__CLR4_5_2lp6mfklvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6mfklvicmc4m.R.inc(29078);
        __CLR4_5_2lp6mfklvicmc4m.R.inc(29079);return df.getOWLObjectHasValue(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6mfklvicmc4m.R.flushNeeded();}}
}

class OWLObjectIntersectionOfElementHandler extends AbstractNaryBooleanClassExpressionElementHandler {public static class __CLR4_5_2lp6mfslvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29084,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectIntersectionOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mfslvicmc4m.R.inc(29081);try{__CLR4_5_2lp6mfslvicmc4m.R.inc(29080);
    }finally{__CLR4_5_2lp6mfslvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createClassExpression(@Nonnull Set<OWLClassExpression> expressions) {try{__CLR4_5_2lp6mfslvicmc4m.R.inc(29082);
        __CLR4_5_2lp6mfslvicmc4m.R.inc(29083);return df.getOWLObjectIntersectionOf(expressions);
    }finally{__CLR4_5_2lp6mfslvicmc4m.R.flushNeeded();}}
}

class OWLObjectMaxCardinalityElementHandler extends AbstractOWLObjectCardinalityElementHandler {public static class __CLR4_5_2lp6mfwlvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectMaxCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mfwlvicmc4m.R.inc(29085);try{__CLR4_5_2lp6mfwlvicmc4m.R.inc(29084);
    }finally{__CLR4_5_2lp6mfwlvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createCardinalityRestriction() {try{__CLR4_5_2lp6mfwlvicmc4m.R.inc(29086);
        __CLR4_5_2lp6mfwlvicmc4m.R.inc(29087);return df.getOWLObjectMaxCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6mfwlvicmc4m.R.flushNeeded();}}
}

class OWLObjectMinCardinalityElementHandler extends AbstractOWLObjectCardinalityElementHandler {public static class __CLR4_5_2lp6mg0lvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectMinCardinalityElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mg0lvicmc4m.R.inc(29089);try{__CLR4_5_2lp6mg0lvicmc4m.R.inc(29088);
    }finally{__CLR4_5_2lp6mg0lvicmc4m.R.flushNeeded();}}

    @Override
        OWLClassExpression createCardinalityRestriction() {try{__CLR4_5_2lp6mg0lvicmc4m.R.inc(29090);
        __CLR4_5_2lp6mg0lvicmc4m.R.inc(29091);return df.getOWLObjectMinCardinality(getCardinality(), getProperty(), getFiller());
    }finally{__CLR4_5_2lp6mg0lvicmc4m.R.flushNeeded();}}
}

class OWLObjectOneOfElementHandler extends AbstractClassExpressionElementHandler {public static class __CLR4_5_2lp6mg4lvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final Set<OWLIndividual> individuals = new HashSet<>();

    OWLObjectOneOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mg4lvicmc4m.R.inc(29093);try{__CLR4_5_2lp6mg4lvicmc4m.R.inc(29092);
    }finally{__CLR4_5_2lp6mg4lvicmc4m.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mg4lvicmc4m.R.inc(29094);
        __CLR4_5_2lp6mg4lvicmc4m.R.inc(29095);individuals.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mg4lvicmc4m.R.flushNeeded();}}

    @Override
        void endClassExpressionElement() {try{__CLR4_5_2lp6mg4lvicmc4m.R.inc(29096);
        __CLR4_5_2lp6mg4lvicmc4m.R.inc(29097);if ((((individuals.size() < 1)&&(__CLR4_5_2lp6mg4lvicmc4m.R.iget(29098)!=0|true))||(__CLR4_5_2lp6mg4lvicmc4m.R.iget(29099)==0&false))) {{
            __CLR4_5_2lp6mg4lvicmc4m.R.inc(29100);ensureNotNull(null, "Expected at least one individual in object oneOf");
        }
        }__CLR4_5_2lp6mg4lvicmc4m.R.inc(29101);setClassExpression(df.getOWLObjectOneOf(individuals));
    }finally{__CLR4_5_2lp6mg4lvicmc4m.R.flushNeeded();}}
}

class OWLObjectPropertyAssertionAxiomElementHandler extends AbstractOWLObjectPropertyAssertionAxiomElementHandler {public static class __CLR4_5_2lp6mgelvicmc4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29106,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyAssertionAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mgelvicmc4m.R.inc(29103);try{__CLR4_5_2lp6mgelvicmc4m.R.inc(29102);
    }finally{__CLR4_5_2lp6mgelvicmc4m.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mgelvicmc4m.R.inc(29104);
        __CLR4_5_2lp6mgelvicmc4m.R.inc(29105);return df.getOWLObjectPropertyAssertionAxiom(verifyNotNull(property), verifyNotNull(subject), verifyNotNull(
            object), annotations);
    }finally{__CLR4_5_2lp6mgelvicmc4m.R.flushNeeded();}}
}

class OWLObjectPropertyDomainElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mgilvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29116,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression domain;
    OWLObjectPropertyExpression property;

    OWLObjectPropertyDomainElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mgilvicmc4n.R.inc(29107);try{__CLR4_5_2lp6mgilvicmc4n.R.inc(29106);
    }finally{__CLR4_5_2lp6mgilvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mgilvicmc4n.R.inc(29108);
        __CLR4_5_2lp6mgilvicmc4n.R.inc(29109);domain = h.getOWLObject();
    }finally{__CLR4_5_2lp6mgilvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mgilvicmc4n.R.inc(29110);
        __CLR4_5_2lp6mgilvicmc4n.R.inc(29111);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6mgilvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mgilvicmc4n.R.inc(29112);
        __CLR4_5_2lp6mgilvicmc4n.R.inc(29113);ensureNotNull(property, "Expected object property element");
        __CLR4_5_2lp6mgilvicmc4n.R.inc(29114);ensureNotNull(domain, "Expected class expression element");
        __CLR4_5_2lp6mgilvicmc4n.R.inc(29115);return df.getOWLObjectPropertyDomainAxiom(verifyNotNull(property), verifyNotNull(domain), verifyNotNull(
            annotations));
    }finally{__CLR4_5_2lp6mgilvicmc4n.R.flushNeeded();}}
}

class OWLObjectPropertyElementHandler extends AbstractOWLObjectPropertyElementHandler {public static class __CLR4_5_2lp6mgslvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;

    OWLObjectPropertyElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mgslvicmc4n.R.inc(29117);try{__CLR4_5_2lp6mgslvicmc4n.R.inc(29116);
    }finally{__CLR4_5_2lp6mgslvicmc4n.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6mgslvicmc4n.R.inc(29118);
        __CLR4_5_2lp6mgslvicmc4n.R.inc(29119);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6mgslvicmc4n.R.flushNeeded();}}

    @Override
        void endObjectPropertyElement() {try{__CLR4_5_2lp6mgslvicmc4n.R.inc(29120);
        __CLR4_5_2lp6mgslvicmc4n.R.inc(29121);setOWLObjectPropertyExpression(df.getOWLObjectProperty(verifyNotNull(iri)));
    }finally{__CLR4_5_2lp6mgslvicmc4n.R.flushNeeded();}}
}

class OWLObjectPropertyRangeAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mgylvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29132,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression range;
    OWLObjectPropertyExpression property;

    OWLObjectPropertyRangeAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mgylvicmc4n.R.inc(29123);try{__CLR4_5_2lp6mgylvicmc4n.R.inc(29122);
    }finally{__CLR4_5_2lp6mgylvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mgylvicmc4n.R.inc(29124);
        __CLR4_5_2lp6mgylvicmc4n.R.inc(29125);range = h.getOWLObject();
    }finally{__CLR4_5_2lp6mgylvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mgylvicmc4n.R.inc(29126);
        __CLR4_5_2lp6mgylvicmc4n.R.inc(29127);property = h.getOWLObject();
    }finally{__CLR4_5_2lp6mgylvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mgylvicmc4n.R.inc(29128);
        __CLR4_5_2lp6mgylvicmc4n.R.inc(29129);ensureNotNull(property, OBJECT_PROPERTY.getShortForm());
        __CLR4_5_2lp6mgylvicmc4n.R.inc(29130);ensureNotNull(range, "OWL class expression element");
        __CLR4_5_2lp6mgylvicmc4n.R.inc(29131);return df.getOWLObjectPropertyRangeAxiom(verifyNotNull(property), verifyNotNull(range), annotations);
    }finally{__CLR4_5_2lp6mgylvicmc4n.R.flushNeeded();}}
}

class OWLObjectSomeValuesFromElementHandler extends AbstractClassExpressionFillerRestriction {public static class __CLR4_5_2lp6mh8lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectSomeValuesFromElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mh8lvicmc4n.R.inc(29133);try{__CLR4_5_2lp6mh8lvicmc4n.R.inc(29132);
    }finally{__CLR4_5_2lp6mh8lvicmc4n.R.flushNeeded();}}

    @Override
        OWLClassExpression createRestriction() {try{__CLR4_5_2lp6mh8lvicmc4n.R.inc(29134);
        __CLR4_5_2lp6mh8lvicmc4n.R.inc(29135);return df.getOWLObjectSomeValuesFrom(getProperty(), getFiller());
    }finally{__CLR4_5_2lp6mh8lvicmc4n.R.flushNeeded();}}
}

class OWLObjectUnionOfElementHandler extends AbstractNaryBooleanClassExpressionElementHandler {public static class __CLR4_5_2lp6mhclvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectUnionOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mhclvicmc4n.R.inc(29137);try{__CLR4_5_2lp6mhclvicmc4n.R.inc(29136);
    }finally{__CLR4_5_2lp6mhclvicmc4n.R.flushNeeded();}}

    @Override
        OWLClassExpression createClassExpression(Set<OWLClassExpression> expressions) {try{__CLR4_5_2lp6mhclvicmc4n.R.inc(29138);
        __CLR4_5_2lp6mhclvicmc4n.R.inc(29139);return df.getOWLObjectUnionOf(expressions);
    }finally{__CLR4_5_2lp6mhclvicmc4n.R.flushNeeded();}}
}

class OWLReflexiveObjectPropertyAxiomElementHandler extends AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6mhglvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLReflexiveObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mhglvicmc4n.R.inc(29141);try{__CLR4_5_2lp6mhglvicmc4n.R.inc(29140);
    }finally{__CLR4_5_2lp6mhglvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mhglvicmc4n.R.inc(29142);
        __CLR4_5_2lp6mhglvicmc4n.R.inc(29143);return df.getOWLReflexiveObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mhglvicmc4n.R.flushNeeded();}}
}

class OWLSameIndividualsAxiomElementHandler extends AbstractOWLIndividualOperandAxiomElementHandler {public static class __CLR4_5_2lp6mhklvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLSameIndividualsAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mhklvicmc4n.R.inc(29145);try{__CLR4_5_2lp6mhklvicmc4n.R.inc(29144);
    }finally{__CLR4_5_2lp6mhklvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mhklvicmc4n.R.inc(29146);
        __CLR4_5_2lp6mhklvicmc4n.R.inc(29147);return df.getOWLSameIndividualAxiom(getOperands(), annotations);
    }finally{__CLR4_5_2lp6mhklvicmc4n.R.flushNeeded();}}
}

class OWLSubAnnotationPropertyOfElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mholvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLAnnotationProperty subProperty;
    OWLAnnotationProperty superProperty;

    OWLSubAnnotationPropertyOfElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mholvicmc4n.R.inc(29149);try{__CLR4_5_2lp6mholvicmc4n.R.inc(29148);
    }finally{__CLR4_5_2lp6mholvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationPropertyElementHandler h) {try{__CLR4_5_2lp6mholvicmc4n.R.inc(29150);
        __CLR4_5_2lp6mholvicmc4n.R.inc(29151);if ((((subProperty == null)&&(__CLR4_5_2lp6mholvicmc4n.R.iget(29152)!=0|true))||(__CLR4_5_2lp6mholvicmc4n.R.iget(29153)==0&false))) {{
            __CLR4_5_2lp6mholvicmc4n.R.inc(29154);subProperty = h.getOWLObject();
        } }else {__CLR4_5_2lp6mholvicmc4n.R.inc(29155);if ((((superProperty == null)&&(__CLR4_5_2lp6mholvicmc4n.R.iget(29156)!=0|true))||(__CLR4_5_2lp6mholvicmc4n.R.iget(29157)==0&false))) {{
            __CLR4_5_2lp6mholvicmc4n.R.inc(29158);superProperty = h.getOWLObject();
        } }else {{
            __CLR4_5_2lp6mholvicmc4n.R.inc(29159);ensureNotNull(null, "two annotation properties elements");
        }
    }}}finally{__CLR4_5_2lp6mholvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mholvicmc4n.R.inc(29160);
        __CLR4_5_2lp6mholvicmc4n.R.inc(29161);ensureNotNull(subProperty, "AnnotationProperty for sub property");
        __CLR4_5_2lp6mholvicmc4n.R.inc(29162);ensureNotNull(superProperty, "AnnotationProperty for super property");
        __CLR4_5_2lp6mholvicmc4n.R.inc(29163);return df.getOWLSubAnnotationPropertyOfAxiom(verifyNotNull(subProperty), verifyNotNull(superProperty),
            annotations);
    }finally{__CLR4_5_2lp6mholvicmc4n.R.flushNeeded();}}
}

class OWLSubClassAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mi4lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression subClass;
    OWLClassExpression supClass;

    OWLSubClassAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mi4lvicmc4n.R.inc(29165);try{__CLR4_5_2lp6mi4lvicmc4n.R.inc(29164);
    }finally{__CLR4_5_2lp6mi4lvicmc4n.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6mi4lvicmc4n.R.inc(29166);
        __CLR4_5_2lp6mi4lvicmc4n.R.inc(29167);super.startElement(name);
        __CLR4_5_2lp6mi4lvicmc4n.R.inc(29168);subClass = null;
        __CLR4_5_2lp6mi4lvicmc4n.R.inc(29169);supClass = null;
    }finally{__CLR4_5_2lp6mi4lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mi4lvicmc4n.R.inc(29170);
        __CLR4_5_2lp6mi4lvicmc4n.R.inc(29171);if ((((subClass == null)&&(__CLR4_5_2lp6mi4lvicmc4n.R.iget(29172)!=0|true))||(__CLR4_5_2lp6mi4lvicmc4n.R.iget(29173)==0&false))) {{
            __CLR4_5_2lp6mi4lvicmc4n.R.inc(29174);subClass = h.getOWLObject();
        } }else {__CLR4_5_2lp6mi4lvicmc4n.R.inc(29175);if ((((supClass == null)&&(__CLR4_5_2lp6mi4lvicmc4n.R.iget(29176)!=0|true))||(__CLR4_5_2lp6mi4lvicmc4n.R.iget(29177)==0&false))) {{
            __CLR4_5_2lp6mi4lvicmc4n.R.inc(29178);supClass = h.getOWLObject();
        }
    }}}finally{__CLR4_5_2lp6mi4lvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mi4lvicmc4n.R.inc(29179);
        __CLR4_5_2lp6mi4lvicmc4n.R.inc(29180);return df.getOWLSubClassOfAxiom(verifyNotNull(subClass), verifyNotNull(supClass), annotations);
    }finally{__CLR4_5_2lp6mi4lvicmc4n.R.flushNeeded();}}
}

class OWLSubDataPropertyOfAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6millvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataPropertyExpression subProperty;
    OWLDataPropertyExpression superProperty;

    OWLSubDataPropertyOfAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6millvicmc4n.R.inc(29182);try{__CLR4_5_2lp6millvicmc4n.R.inc(29181);
    }finally{__CLR4_5_2lp6millvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6millvicmc4n.R.inc(29183);
        __CLR4_5_2lp6millvicmc4n.R.inc(29184);if ((((subProperty == null)&&(__CLR4_5_2lp6millvicmc4n.R.iget(29185)!=0|true))||(__CLR4_5_2lp6millvicmc4n.R.iget(29186)==0&false))) {{
            __CLR4_5_2lp6millvicmc4n.R.inc(29187);subProperty = h.getOWLObject();
        } }else {__CLR4_5_2lp6millvicmc4n.R.inc(29188);if ((((superProperty == null)&&(__CLR4_5_2lp6millvicmc4n.R.iget(29189)!=0|true))||(__CLR4_5_2lp6millvicmc4n.R.iget(29190)==0&false))) {{
            __CLR4_5_2lp6millvicmc4n.R.inc(29191);superProperty = h.getOWLObject();
        } }else {{
            __CLR4_5_2lp6millvicmc4n.R.inc(29192);ensureNotNull(null, "two data property expression elements");
        }
    }}}finally{__CLR4_5_2lp6millvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6millvicmc4n.R.inc(29193);
        __CLR4_5_2lp6millvicmc4n.R.inc(29194);return df.getOWLSubDataPropertyOfAxiom(verifyNotNull(subProperty), verifyNotNull(superProperty), annotations);
    }finally{__CLR4_5_2lp6millvicmc4n.R.flushNeeded();}}
}

class OWLSubObjectPropertyChainElementHandler extends OWLElementHandler<List<OWLObjectPropertyExpression>> {public static class __CLR4_5_2lp6mizlvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final List<OWLObjectPropertyExpression> propertyList = new ArrayList<>();

    OWLSubObjectPropertyChainElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mizlvicmc4n.R.inc(29196);try{__CLR4_5_2lp6mizlvicmc4n.R.inc(29195);
    }finally{__CLR4_5_2lp6mizlvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mizlvicmc4n.R.inc(29197);
        __CLR4_5_2lp6mizlvicmc4n.R.inc(29198);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mizlvicmc4n.R.flushNeeded();}}

    @Override
        List<OWLObjectPropertyExpression> getOWLObject() {try{__CLR4_5_2lp6mizlvicmc4n.R.inc(29199);
        __CLR4_5_2lp6mizlvicmc4n.R.inc(29200);return propertyList;
    }finally{__CLR4_5_2lp6mizlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mizlvicmc4n.R.inc(29201);
        __CLR4_5_2lp6mizlvicmc4n.R.inc(29202);propertyList.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mizlvicmc4n.R.flushNeeded();}}
}

class OWLSubObjectPropertyOfAxiomElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mj7lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyExpression subProperty;
    List<OWLObjectPropertyExpression> propertyList;
    OWLObjectPropertyExpression superProperty;

    OWLSubObjectPropertyOfAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mj7lvicmc4n.R.inc(29204);try{__CLR4_5_2lp6mj7lvicmc4n.R.inc(29203);
    }finally{__CLR4_5_2lp6mj7lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mj7lvicmc4n.R.inc(29205);
        __CLR4_5_2lp6mj7lvicmc4n.R.inc(29206);if ((((subProperty == null && propertyList == null)&&(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29207)!=0|true))||(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29208)==0&false))) {{
            __CLR4_5_2lp6mj7lvicmc4n.R.inc(29209);subProperty = h.getOWLObject();
        } }else {__CLR4_5_2lp6mj7lvicmc4n.R.inc(29210);if ((((superProperty == null)&&(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29211)!=0|true))||(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29212)==0&false))) {{
            __CLR4_5_2lp6mj7lvicmc4n.R.inc(29213);superProperty = h.getOWLObject();
        } }else {{
            __CLR4_5_2lp6mj7lvicmc4n.R.inc(29214);ensureNotNull(null, "Expected two object property expression elements");
        }
    }}}finally{__CLR4_5_2lp6mj7lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLSubObjectPropertyChainElementHandler h) {try{__CLR4_5_2lp6mj7lvicmc4n.R.inc(29215);
        __CLR4_5_2lp6mj7lvicmc4n.R.inc(29216);propertyList = h.getOWLObject();
    }finally{__CLR4_5_2lp6mj7lvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mj7lvicmc4n.R.inc(29217);
        assert (((superProperty != null)&&(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29218)!=0|true))||(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29219)==0&false));
        assert (((subProperty != null || propertyList != null)&&(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29220)!=0|true))||(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29221)==0&false));
        __CLR4_5_2lp6mj7lvicmc4n.R.inc(29222);if ((((subProperty != null)&&(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29223)!=0|true))||(__CLR4_5_2lp6mj7lvicmc4n.R.iget(29224)==0&false))) {{
            __CLR4_5_2lp6mj7lvicmc4n.R.inc(29225);return df.getOWLSubObjectPropertyOfAxiom(verifyNotNull(subProperty), verifyNotNull(superProperty),
                annotations);
        } }else {{
            __CLR4_5_2lp6mj7lvicmc4n.R.inc(29226);return df.getOWLSubPropertyChainOfAxiom(verifyNotNull(propertyList), verifyNotNull(superProperty),
                annotations);
        }
    }}finally{__CLR4_5_2lp6mj7lvicmc4n.R.flushNeeded();}}
}

class OWLSymmetricObjectPropertyAxiomElementHandler extends AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6mjvlvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLSymmetricObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mjvlvicmc4n.R.inc(29228);try{__CLR4_5_2lp6mjvlvicmc4n.R.inc(29227);
    }finally{__CLR4_5_2lp6mjvlvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mjvlvicmc4n.R.inc(29229);
        __CLR4_5_2lp6mjvlvicmc4n.R.inc(29230);return df.getOWLSymmetricObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mjvlvicmc4n.R.flushNeeded();}}
}

class OWLTransitiveObjectPropertyAxiomElementHandler extends
    AbstractOWLObjectPropertyCharacteristicAxiomElementHandler {public static class __CLR4_5_2lp6mjzlvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLTransitiveObjectPropertyAxiomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mjzlvicmc4n.R.inc(29232);try{__CLR4_5_2lp6mjzlvicmc4n.R.inc(29231);
    }finally{__CLR4_5_2lp6mjzlvicmc4n.R.flushNeeded();}}

    @Override
        OWLAxiom createPropertyCharacteristicAxiom() {try{__CLR4_5_2lp6mjzlvicmc4n.R.inc(29233);
        __CLR4_5_2lp6mjzlvicmc4n.R.inc(29234);return df.getOWLTransitiveObjectPropertyAxiom(getProperty(), annotations);
    }finally{__CLR4_5_2lp6mjzlvicmc4n.R.flushNeeded();}}
}

abstract class SWRLAtomElementHandler extends OWLElementHandler<SWRLAtom> {public static class __CLR4_5_2lp6mk3lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    SWRLAtom atom;

    SWRLAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mk3lvicmc4n.R.inc(29236);try{__CLR4_5_2lp6mk3lvicmc4n.R.inc(29235);
    }finally{__CLR4_5_2lp6mk3lvicmc4n.R.flushNeeded();}}

    void setAtom(@Nonnull SWRLAtom atom) {try{__CLR4_5_2lp6mk3lvicmc4n.R.inc(29237);
        __CLR4_5_2lp6mk3lvicmc4n.R.inc(29238);this.atom = atom;
    }finally{__CLR4_5_2lp6mk3lvicmc4n.R.flushNeeded();}}

    @Override
        SWRLAtom getOWLObject() {try{__CLR4_5_2lp6mk3lvicmc4n.R.inc(29239);
        __CLR4_5_2lp6mk3lvicmc4n.R.inc(29240);return verifyNotNull(atom);
    }finally{__CLR4_5_2lp6mk3lvicmc4n.R.flushNeeded();}}
}

class SWRLAtomListElementHandler extends OWLElementHandler<List<SWRLAtom>> {public static class __CLR4_5_2lp6mk9lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull final List<SWRLAtom> atoms = new ArrayList<>();

    SWRLAtomListElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mk9lvicmc4n.R.inc(29242);try{__CLR4_5_2lp6mk9lvicmc4n.R.inc(29241);
    }finally{__CLR4_5_2lp6mk9lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLAtomElementHandler h) {try{__CLR4_5_2lp6mk9lvicmc4n.R.inc(29243);
        __CLR4_5_2lp6mk9lvicmc4n.R.inc(29244);atoms.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mk9lvicmc4n.R.flushNeeded();}}

    @Nonnull
    @Override
        List<SWRLAtom> getOWLObject() {try{__CLR4_5_2lp6mk9lvicmc4n.R.inc(29245);
        __CLR4_5_2lp6mk9lvicmc4n.R.inc(29246);return atoms;
    }finally{__CLR4_5_2lp6mk9lvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mk9lvicmc4n.R.inc(29247);
        __CLR4_5_2lp6mk9lvicmc4n.R.inc(29248);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mk9lvicmc4n.R.flushNeeded();}}
}

class SWRLBuiltInAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mkhlvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    IRI iri;
    @Nonnull final List<SWRLDArgument> args = new ArrayList<>();

    SWRLBuiltInAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mkhlvicmc4n.R.inc(29250);try{__CLR4_5_2lp6mkhlvicmc4n.R.inc(29249);
    }finally{__CLR4_5_2lp6mkhlvicmc4n.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6mkhlvicmc4n.R.inc(29251);
        __CLR4_5_2lp6mkhlvicmc4n.R.inc(29252);iri = getIRIFromAttribute(localName, value);
    }finally{__CLR4_5_2lp6mkhlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mkhlvicmc4n.R.inc(29253);
        __CLR4_5_2lp6mkhlvicmc4n.R.inc(29254);args.add(h.getOWLObject());
    }finally{__CLR4_5_2lp6mkhlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6mkhlvicmc4n.R.inc(29255);
        __CLR4_5_2lp6mkhlvicmc4n.R.inc(29256);args.add(df.getSWRLLiteralArgument(h.getOWLObject()));
    }finally{__CLR4_5_2lp6mkhlvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mkhlvicmc4n.R.inc(29257);
        __CLR4_5_2lp6mkhlvicmc4n.R.inc(29258);setAtom(df.getSWRLBuiltInAtom(verifyNotNull(iri), args));
        __CLR4_5_2lp6mkhlvicmc4n.R.inc(29259);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mkhlvicmc4n.R.flushNeeded();}}
}

class SWRLClassAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mkslvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLClassExpression ce;
    SWRLIArgument arg;

    SWRLClassAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mkslvicmc4n.R.inc(29261);try{__CLR4_5_2lp6mkslvicmc4n.R.inc(29260);
    }finally{__CLR4_5_2lp6mkslvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mkslvicmc4n.R.inc(29262);
        __CLR4_5_2lp6mkslvicmc4n.R.inc(29263);arg = h.getOWLObject();
    }finally{__CLR4_5_2lp6mkslvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6mkslvicmc4n.R.inc(29264);
        __CLR4_5_2lp6mkslvicmc4n.R.inc(29265);ce = h.getOWLObject();
    }finally{__CLR4_5_2lp6mkslvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mkslvicmc4n.R.inc(29266);
        __CLR4_5_2lp6mkslvicmc4n.R.inc(29267);arg = df.getSWRLIndividualArgument(h.getOWLObject());
    }finally{__CLR4_5_2lp6mkslvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mkslvicmc4n.R.inc(29268);
        __CLR4_5_2lp6mkslvicmc4n.R.inc(29269);setAtom(df.getSWRLClassAtom(verifyNotNull(ce), verifyNotNull(arg)));
        __CLR4_5_2lp6mkslvicmc4n.R.inc(29270);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mkslvicmc4n.R.flushNeeded();}}
}

class SWRLDataPropertyAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6ml3lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataPropertyExpression prop;
    SWRLIArgument arg0;
    SWRLDArgument arg1;

    SWRLDataPropertyAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6ml3lvicmc4n.R.inc(29272);try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29271);
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLDataPropertyElementHandler h) {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29273);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29274);prop = h.getOWLObject();
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29275);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29276);if ((((arg0 == null)&&(__CLR4_5_2lp6ml3lvicmc4n.R.iget(29277)!=0|true))||(__CLR4_5_2lp6ml3lvicmc4n.R.iget(29278)==0&false))) {{
            __CLR4_5_2lp6ml3lvicmc4n.R.inc(29279);arg0 = h.getOWLObject();
        } }else {__CLR4_5_2lp6ml3lvicmc4n.R.inc(29280);if ((((arg1 == null)&&(__CLR4_5_2lp6ml3lvicmc4n.R.iget(29281)!=0|true))||(__CLR4_5_2lp6ml3lvicmc4n.R.iget(29282)==0&false))) {{
            __CLR4_5_2lp6ml3lvicmc4n.R.inc(29283);arg1 = h.getOWLObject();
        }
    }}}finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29284);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29285);arg1 = df.getSWRLLiteralArgument(h.getOWLObject());
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29286);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29287);arg0 = df.getSWRLIndividualArgument(h.getOWLObject());
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnonymousIndividualElementHandler h) {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29288);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29289);arg0 = df.getSWRLIndividualArgument(h.getOWLObject());
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6ml3lvicmc4n.R.inc(29290);
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29291);setAtom(df.getSWRLDataPropertyAtom(verifyNotNull(prop), verifyNotNull(arg0), verifyNotNull(arg1)));
        __CLR4_5_2lp6ml3lvicmc4n.R.inc(29292);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6ml3lvicmc4n.R.flushNeeded();}}
}

class SWRLDataRangeAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mlplvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLDataRange prop;
    SWRLDArgument arg1;

    SWRLDataRangeAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mlplvicmc4n.R.inc(29294);try{__CLR4_5_2lp6mlplvicmc4n.R.inc(29293);
    }finally{__CLR4_5_2lp6mlplvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6mlplvicmc4n.R.inc(29295);
        __CLR4_5_2lp6mlplvicmc4n.R.inc(29296);prop = h.getOWLObject();
    }finally{__CLR4_5_2lp6mlplvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mlplvicmc4n.R.inc(29297);
        __CLR4_5_2lp6mlplvicmc4n.R.inc(29298);arg1 = h.getOWLObject();
    }finally{__CLR4_5_2lp6mlplvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLLiteralElementHandler h) {try{__CLR4_5_2lp6mlplvicmc4n.R.inc(29299);
        __CLR4_5_2lp6mlplvicmc4n.R.inc(29300);arg1 = df.getSWRLLiteralArgument(h.getOWLObject());
    }finally{__CLR4_5_2lp6mlplvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mlplvicmc4n.R.inc(29301);
        __CLR4_5_2lp6mlplvicmc4n.R.inc(29302);setAtom(df.getSWRLDataRangeAtom(verifyNotNull(prop), verifyNotNull(arg1)));
        __CLR4_5_2lp6mlplvicmc4n.R.inc(29303);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mlplvicmc4n.R.flushNeeded();}}
}

class SWRLDifferentIndividualsAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mm0lvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    SWRLIArgument arg0;
    SWRLIArgument arg1;

    SWRLDifferentIndividualsAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mm0lvicmc4n.R.inc(29305);try{__CLR4_5_2lp6mm0lvicmc4n.R.inc(29304);
    }finally{__CLR4_5_2lp6mm0lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mm0lvicmc4n.R.inc(29306);
        __CLR4_5_2lp6mm0lvicmc4n.R.inc(29307);if ((((arg0 == null)&&(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29308)!=0|true))||(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29309)==0&false))) {{
            __CLR4_5_2lp6mm0lvicmc4n.R.inc(29310);arg0 = h.getOWLObject();
        } }else {__CLR4_5_2lp6mm0lvicmc4n.R.inc(29311);if ((((arg1 == null)&&(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29312)!=0|true))||(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29313)==0&false))) {{
            __CLR4_5_2lp6mm0lvicmc4n.R.inc(29314);arg1 = h.getOWLObject();
        }
    }}}finally{__CLR4_5_2lp6mm0lvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mm0lvicmc4n.R.inc(29315);
        __CLR4_5_2lp6mm0lvicmc4n.R.inc(29316);if ((((arg0 == null)&&(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29317)!=0|true))||(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29318)==0&false))) {{
            __CLR4_5_2lp6mm0lvicmc4n.R.inc(29319);arg0 = df.getSWRLIndividualArgument(h.getOWLObject());
        } }else {__CLR4_5_2lp6mm0lvicmc4n.R.inc(29320);if ((((arg1 == null)&&(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29321)!=0|true))||(__CLR4_5_2lp6mm0lvicmc4n.R.iget(29322)==0&false))) {{
            __CLR4_5_2lp6mm0lvicmc4n.R.inc(29323);arg1 = df.getSWRLIndividualArgument(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6mm0lvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mm0lvicmc4n.R.inc(29324);
        __CLR4_5_2lp6mm0lvicmc4n.R.inc(29325);setAtom(df.getSWRLDifferentIndividualsAtom(verifyNotNull(arg0), verifyNotNull(arg1)));
        __CLR4_5_2lp6mm0lvicmc4n.R.inc(29326);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mm0lvicmc4n.R.flushNeeded();}}
}

class SWRLObjectPropertyAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mmnlvicmc4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLObjectPropertyExpression prop;
    SWRLIArgument arg0;
    SWRLIArgument arg1;

    SWRLObjectPropertyAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mmnlvicmc4n.R.inc(29328);try{__CLR4_5_2lp6mmnlvicmc4n.R.inc(29327);
    }finally{__CLR4_5_2lp6mmnlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLObjectPropertyElementHandler h) {try{__CLR4_5_2lp6mmnlvicmc4n.R.inc(29329);
        __CLR4_5_2lp6mmnlvicmc4n.R.inc(29330);prop = h.getOWLObject();
    }finally{__CLR4_5_2lp6mmnlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mmnlvicmc4n.R.inc(29331);
        __CLR4_5_2lp6mmnlvicmc4n.R.inc(29332);if ((((arg0 == null)&&(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29333)!=0|true))||(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29334)==0&false))) {{
            __CLR4_5_2lp6mmnlvicmc4n.R.inc(29335);arg0 = h.getOWLObject();
        } }else {__CLR4_5_2lp6mmnlvicmc4n.R.inc(29336);if ((((arg1 == null)&&(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29337)!=0|true))||(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29338)==0&false))) {{
            __CLR4_5_2lp6mmnlvicmc4n.R.inc(29339);arg1 = h.getOWLObject();
        }
    }}}finally{__CLR4_5_2lp6mmnlvicmc4n.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mmnlvicmc4n.R.inc(29340);
        __CLR4_5_2lp6mmnlvicmc4n.R.inc(29341);if ((((arg0 == null)&&(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29342)!=0|true))||(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29343)==0&false))) {{
            __CLR4_5_2lp6mmnlvicmc4n.R.inc(29344);arg0 = df.getSWRLIndividualArgument(h.getOWLObject());
        } }else {__CLR4_5_2lp6mmnlvicmc4n.R.inc(29345);if ((((arg1 == null)&&(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29346)!=0|true))||(__CLR4_5_2lp6mmnlvicmc4n.R.iget(29347)==0&false))) {{
            __CLR4_5_2lp6mmnlvicmc4n.R.inc(29348);arg1 = df.getSWRLIndividualArgument(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6mmnlvicmc4n.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mmnlvicmc4n.R.inc(29349);
        __CLR4_5_2lp6mmnlvicmc4n.R.inc(29350);setAtom(df.getSWRLObjectPropertyAtom(verifyNotNull(prop), verifyNotNull(arg0), verifyNotNull(arg1)));
        __CLR4_5_2lp6mmnlvicmc4n.R.inc(29351);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mmnlvicmc4n.R.flushNeeded();}}
}

class SWRLRuleElementHandler extends AbstractOWLAxiomElementHandler {public static class __CLR4_5_2lp6mnclvicmc4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Set<SWRLAtom> body;
    Set<SWRLAtom> head;

    SWRLRuleElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mnclvicmc4o.R.inc(29353);try{__CLR4_5_2lp6mnclvicmc4o.R.inc(29352);
    }finally{__CLR4_5_2lp6mnclvicmc4o.R.flushNeeded();}}

    @Override
        OWLAxiom createAxiom() {try{__CLR4_5_2lp6mnclvicmc4o.R.inc(29354);
        __CLR4_5_2lp6mnclvicmc4o.R.inc(29355);return df.getSWRLRule(verifyNotNull(body), verifyNotNull(head), annotations);
    }finally{__CLR4_5_2lp6mnclvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLAtomListElementHandler h) {try{__CLR4_5_2lp6mnclvicmc4o.R.inc(29356);
        __CLR4_5_2lp6mnclvicmc4o.R.inc(29357);if ((((body == null)&&(__CLR4_5_2lp6mnclvicmc4o.R.iget(29358)!=0|true))||(__CLR4_5_2lp6mnclvicmc4o.R.iget(29359)==0&false))) {{
            __CLR4_5_2lp6mnclvicmc4o.R.inc(29360);body = new LinkedHashSet<>(h.getOWLObject());
        } }else {__CLR4_5_2lp6mnclvicmc4o.R.inc(29361);if ((((head == null)&&(__CLR4_5_2lp6mnclvicmc4o.R.iget(29362)!=0|true))||(__CLR4_5_2lp6mnclvicmc4o.R.iget(29363)==0&false))) {{
            __CLR4_5_2lp6mnclvicmc4o.R.inc(29364);head = new LinkedHashSet<>(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6mnclvicmc4o.R.flushNeeded();}}
}

class SWRLSameIndividualAtomElementHandler extends SWRLAtomElementHandler {public static class __CLR4_5_2lp6mnplvicmc4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29388,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    SWRLIArgument arg0;
    SWRLIArgument arg1;

    SWRLSameIndividualAtomElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mnplvicmc4o.R.inc(29366);try{__CLR4_5_2lp6mnplvicmc4o.R.inc(29365);
    }finally{__CLR4_5_2lp6mnplvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull SWRLVariableElementHandler h) {try{__CLR4_5_2lp6mnplvicmc4o.R.inc(29367);
        __CLR4_5_2lp6mnplvicmc4o.R.inc(29368);if ((((arg0 == null)&&(__CLR4_5_2lp6mnplvicmc4o.R.iget(29369)!=0|true))||(__CLR4_5_2lp6mnplvicmc4o.R.iget(29370)==0&false))) {{
            __CLR4_5_2lp6mnplvicmc4o.R.inc(29371);arg0 = h.getOWLObject();
        } }else {__CLR4_5_2lp6mnplvicmc4o.R.inc(29372);if ((((arg1 == null)&&(__CLR4_5_2lp6mnplvicmc4o.R.iget(29373)!=0|true))||(__CLR4_5_2lp6mnplvicmc4o.R.iget(29374)==0&false))) {{
            __CLR4_5_2lp6mnplvicmc4o.R.inc(29375);arg1 = h.getOWLObject();
        }
    }}}finally{__CLR4_5_2lp6mnplvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLIndividualElementHandler h) {try{__CLR4_5_2lp6mnplvicmc4o.R.inc(29376);
        __CLR4_5_2lp6mnplvicmc4o.R.inc(29377);if ((((arg0 == null)&&(__CLR4_5_2lp6mnplvicmc4o.R.iget(29378)!=0|true))||(__CLR4_5_2lp6mnplvicmc4o.R.iget(29379)==0&false))) {{
            __CLR4_5_2lp6mnplvicmc4o.R.inc(29380);arg0 = df.getSWRLIndividualArgument(h.getOWLObject());
        } }else {__CLR4_5_2lp6mnplvicmc4o.R.inc(29381);if ((((arg1 == null)&&(__CLR4_5_2lp6mnplvicmc4o.R.iget(29382)!=0|true))||(__CLR4_5_2lp6mnplvicmc4o.R.iget(29383)==0&false))) {{
            __CLR4_5_2lp6mnplvicmc4o.R.inc(29384);arg1 = df.getSWRLIndividualArgument(h.getOWLObject());
        }
    }}}finally{__CLR4_5_2lp6mnplvicmc4o.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mnplvicmc4o.R.inc(29385);
        __CLR4_5_2lp6mnplvicmc4o.R.inc(29386);setAtom(df.getSWRLSameIndividualAtom(verifyNotNull(arg0), verifyNotNull(arg1)));
        __CLR4_5_2lp6mnplvicmc4o.R.inc(29387);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6mnplvicmc4o.R.flushNeeded();}}
}

class SWRLVariableElementHandler extends OWLElementHandler<SWRLVariable> {public static class __CLR4_5_2lp6moclvicmc4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    SWRLVariableElementHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6moclvicmc4o.R.inc(29389);try{__CLR4_5_2lp6moclvicmc4o.R.inc(29388);
    }finally{__CLR4_5_2lp6moclvicmc4o.R.flushNeeded();}}

    IRI iri;

    @Override
        void endElement() {try{__CLR4_5_2lp6moclvicmc4o.R.inc(29390);
        __CLR4_5_2lp6moclvicmc4o.R.inc(29391);getParentHandler().handleChild(this);
    }finally{__CLR4_5_2lp6moclvicmc4o.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, @Nonnull String value) {try{__CLR4_5_2lp6moclvicmc4o.R.inc(29392);
        __CLR4_5_2lp6moclvicmc4o.R.inc(29393);iri = IRI.create("urn:swrl#", value);
    }finally{__CLR4_5_2lp6moclvicmc4o.R.flushNeeded();}}

    @Override
        SWRLVariable getOWLObject() {try{__CLR4_5_2lp6moclvicmc4o.R.inc(29394);
        // iri could be null here if the input is malformed
        __CLR4_5_2lp6moclvicmc4o.R.inc(29395);return df.getSWRLVariable(verifyNotNull(iri));
    }finally{__CLR4_5_2lp6moclvicmc4o.R.flushNeeded();}}
}

class OWLOntologyHandler extends OWLElementHandler<OWLOntology> {public static class __CLR4_5_2lp6moklvicmc4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLOntologyHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6moklvicmc4o.R.inc(29397);try{__CLR4_5_2lp6moklvicmc4o.R.inc(29396);
    }finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void startElement(String name) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29398);}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void attribute(@Nonnull String localName, String value) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29399);
        __CLR4_5_2lp6moklvicmc4o.R.inc(29400);if ((((localName.equals("ontologyIRI"))&&(__CLR4_5_2lp6moklvicmc4o.R.iget(29401)!=0|true))||(__CLR4_5_2lp6moklvicmc4o.R.iget(29402)==0&false))) {{
            __CLR4_5_2lp6moklvicmc4o.R.inc(29403);OWLOntologyID newID = new OWLOntologyID(Optional.of(IRI.create(value)), handler.getOntology()
                .getOntologyID().getVersionIRI());
            __CLR4_5_2lp6moklvicmc4o.R.inc(29404);handler.getOWLOntologyManager().applyChange(new SetOntologyID(handler.getOntology(), newID));
        }
        }__CLR4_5_2lp6moklvicmc4o.R.inc(29405);if ((((localName.equals("versionIRI"))&&(__CLR4_5_2lp6moklvicmc4o.R.iget(29406)!=0|true))||(__CLR4_5_2lp6moklvicmc4o.R.iget(29407)==0&false))) {{
            __CLR4_5_2lp6moklvicmc4o.R.inc(29408);OWLOntologyID newID = new OWLOntologyID(handler.getOntology().getOntologyID().getOntologyIRI(), Optional.of(
                IRI.create(value)));
            __CLR4_5_2lp6moklvicmc4o.R.inc(29409);handler.getOWLOntologyManager().applyChange(new SetOntologyID(handler.getOntology(), newID));
        }
    }}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull AbstractOWLAxiomElementHandler h) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29410);
        __CLR4_5_2lp6moklvicmc4o.R.inc(29411);OWLAxiom axiom = h.getOWLObject();
        __CLR4_5_2lp6moklvicmc4o.R.inc(29412);if ((((!axiom.isAnnotationAxiom() || handler.getConfiguration().isLoadAnnotationAxioms())&&(__CLR4_5_2lp6moklvicmc4o.R.iget(29413)!=0|true))||(__CLR4_5_2lp6moklvicmc4o.R.iget(29414)==0&false))) {{
            __CLR4_5_2lp6moklvicmc4o.R.inc(29415);handler.getOWLOntologyManager().applyChange(new AddAxiom(handler.getOntology(), axiom));
        }
    }}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(AbstractOWLDataRangeHandler h) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29416);}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(AbstractClassExpressionElementHandler h) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29417);}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void handleChild(@Nonnull OWLAnnotationElementHandler h) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29418);
        __CLR4_5_2lp6moklvicmc4o.R.inc(29419);handler.getOWLOntologyManager().applyChange(new AddOntologyAnnotation(handler.getOntology(), h.getOWLObject()));
    }finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29420);}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        OWLOntology getOWLObject() {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29421);
        __CLR4_5_2lp6moklvicmc4o.R.inc(29422);return handler.getOntology();
    }finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}

    @Override
        void setParentHandler(OWLElementHandler<?> handler) {try{__CLR4_5_2lp6moklvicmc4o.R.inc(29423);}finally{__CLR4_5_2lp6moklvicmc4o.R.flushNeeded();}}
}

class OWLImportsHandler extends OWLElementHandler<OWLOntology> {public static class __CLR4_5_2lp6mpclvicmc4o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    OWLImportsHandler(@Nonnull OWLXMLParserHandler handler) {
        super(handler);__CLR4_5_2lp6mpclvicmc4o.R.inc(29425);try{__CLR4_5_2lp6mpclvicmc4o.R.inc(29424);
    }finally{__CLR4_5_2lp6mpclvicmc4o.R.flushNeeded();}}

    @Override
        void endElement() {try{__CLR4_5_2lp6mpclvicmc4o.R.inc(29426);
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29427);IRI ontIRI = handler.getIRI(getText().trim());
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29428);OWLImportsDeclaration decl = df.getOWLImportsDeclaration(ontIRI);
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29429);handler.getOWLOntologyManager().applyChange(new AddImport(handler.getOntology(), decl));
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29430);handler.getOWLOntologyManager().makeLoadImportRequest(decl, handler.getConfiguration());
    }finally{__CLR4_5_2lp6mpclvicmc4o.R.flushNeeded();}}

    @Override
        OWLOntology getOWLObject() {try{__CLR4_5_2lp6mpclvicmc4o.R.inc(29431);
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29432);throw new OWLRuntimeException("There is no OWLObject for imports handlers");
    }finally{__CLR4_5_2lp6mpclvicmc4o.R.flushNeeded();}}

    @Override
        boolean isTextContentPossible() {try{__CLR4_5_2lp6mpclvicmc4o.R.inc(29433);
        __CLR4_5_2lp6mpclvicmc4o.R.inc(29434);return true;
    }finally{__CLR4_5_2lp6mpclvicmc4o.R.flushNeeded();}}
}


