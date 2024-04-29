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
package org.semanticweb.owlapi.vocab;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.HasPrefixedName;
import org.semanticweb.owlapi.model.HasShortForm;
import org.semanticweb.owlapi.model.IRI;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public enum OWLXMLVocabulary implements HasShortForm, HasIRI, HasPrefixedName {
//@formatter:off
    /** CLASS                               */  CLASS                               ("Class"),
    /** DATA_PROPERTY                       */  DATA_PROPERTY                       ("DataProperty"),
    /** OBJECT_PROPERTY                     */  OBJECT_PROPERTY                     ("ObjectProperty"),
    /** NAMED_INDIVIDUAL                    */  NAMED_INDIVIDUAL                    ("NamedIndividual"),
    /** ENTITY_ANNOTATION                   */  ENTITY_ANNOTATION                   ("EntityAnnotation"),
    /** ANNOTATION_PROPERTY                 */  ANNOTATION_PROPERTY                 ("AnnotationProperty"),
    /** DATATYPE                            */  DATATYPE                            ("Datatype"),
    /** ANNOTATION                          */  ANNOTATION                          ("Annotation"),
    /** ANONYMOUS_INDIVIDUAL                */  ANONYMOUS_INDIVIDUAL                ("AnonymousIndividual"),
    /** NODE_ID                             */  NODE_ID                             ("nodeID"),
    /** ANNOTATION_URI                      */  ANNOTATION_URI                      ("annotationURI"),
    /** IMPORT                              */  IMPORT                              ("Import"),
    /** LABEL                               */  LABEL                               ("Label"),
    /** COMMENT                             */  COMMENT                             ("Comment"),
    /** DOCUMENTATION                       */  DOCUMENTATION                       ("Documentation"),
    /** ONTOLOGY                            */  ONTOLOGY                            ("Ontology"),
    /** LITERAL                             */  LITERAL                             ("Literal"),
    /** OBJECT_INVERSE_OF                   */  OBJECT_INVERSE_OF                   ("ObjectInverseOf"),
    /** DATA_COMPLEMENT_OF                  */  DATA_COMPLEMENT_OF                  ("DataComplementOf"),
    /** DATA_ONE_OF                         */  DATA_ONE_OF                         ("DataOneOf"),
    /** DATATYPE_RESTRICTION                */  DATATYPE_RESTRICTION                ("DatatypeRestriction"),
    /** FACET_RESTRICTION                   */  FACET_RESTRICTION                   ("FacetRestriction"),
    /** DATA_UNION_OF                       */  DATA_UNION_OF                       ("DataUnionOf"),
    /** DATA_INTERSECTION_OF                */  DATA_INTERSECTION_OF                ("DataIntersectionOf"),
    /** DATATYPE_FACET                      */  DATATYPE_FACET                      ("facet"),
    /** DATATYPE_IRI                        */  DATATYPE_IRI                        ("datatypeIRI"),
    /** DATA_RANGE                          */  DATA_RANGE                          ("DataRange"),
    /** OBJECT_INTERSECTION_OF              */  OBJECT_INTERSECTION_OF              ("ObjectIntersectionOf"),
    /** OBJECT_UNION_OF                     */  OBJECT_UNION_OF                     ("ObjectUnionOf"),
    /** OBJECT_COMPLEMENT_OF                */  OBJECT_COMPLEMENT_OF                ("ObjectComplementOf"),
    /** OBJECT_ONE_OF                       */  OBJECT_ONE_OF                       ("ObjectOneOf"),
    /** OBJECT_SOME_VALUES_FROM             */  OBJECT_SOME_VALUES_FROM             ("ObjectSomeValuesFrom"),
    /** OBJECT_ALL_VALUES_FROM              */  OBJECT_ALL_VALUES_FROM              ("ObjectAllValuesFrom"),
    /** OBJECT_HAS_SELF                     */  OBJECT_HAS_SELF                     ("ObjectHasSelf"),
    /** OBJECT_HAS_VALUE                    */  OBJECT_HAS_VALUE                    ("ObjectHasValue"),
    /** OBJECT_MIN_CARDINALITY              */  OBJECT_MIN_CARDINALITY              ("ObjectMinCardinality"),
    /** OBJECT_EXACT_CARDINALITY            */  OBJECT_EXACT_CARDINALITY            ("ObjectExactCardinality"),
    /** OBJECT_MAX_CARDINALITY              */  OBJECT_MAX_CARDINALITY              ("ObjectMaxCardinality"),
    /** DATA_SOME_VALUES_FROM               */  DATA_SOME_VALUES_FROM               ("DataSomeValuesFrom"),
    /** DATA_ALL_VALUES_FROM                */  DATA_ALL_VALUES_FROM                ("DataAllValuesFrom"),
    /** DATA_HAS_VALUE                      */  DATA_HAS_VALUE                      ("DataHasValue"),
    /** DATA_MIN_CARDINALITY                */  DATA_MIN_CARDINALITY                ("DataMinCardinality"),
    /** DATA_EXACT_CARDINALITY              */  DATA_EXACT_CARDINALITY              ("DataExactCardinality"),
    /** DATA_MAX_CARDINALITY                */  DATA_MAX_CARDINALITY                ("DataMaxCardinality"),
    /** SUB_CLASS_OF                        */  SUB_CLASS_OF                        ("SubClassOf"),
    /** EQUIVALENT_CLASSES                  */  EQUIVALENT_CLASSES                  ("EquivalentClasses"),
    /** DISJOINT_CLASSES                    */  DISJOINT_CLASSES                    ("DisjointClasses"),
    /** DISJOINT_UNION                      */  DISJOINT_UNION                      ("DisjointUnion"),
    /** UNION_OF                            */  UNION_OF                            ("UnionOf"),
    /** SUB_OBJECT_PROPERTY_OF              */  SUB_OBJECT_PROPERTY_OF              ("SubObjectPropertyOf"),
    /** OBJECT_PROPERTY_CHAIN               */  OBJECT_PROPERTY_CHAIN               ("ObjectPropertyChain"),
    /** EQUIVALENT_OBJECT_PROPERTIES        */  EQUIVALENT_OBJECT_PROPERTIES        ("EquivalentObjectProperties"),
    /** DISJOINT_OBJECT_PROPERTIES          */  DISJOINT_OBJECT_PROPERTIES          ("DisjointObjectProperties"),
    /** OBJECT_PROPERTY_DOMAIN              */  OBJECT_PROPERTY_DOMAIN              ("ObjectPropertyDomain"),
    /** OBJECT_PROPERTY_RANGE               */  OBJECT_PROPERTY_RANGE               ("ObjectPropertyRange"),
    /** INVERSE_OBJECT_PROPERTIES           */  INVERSE_OBJECT_PROPERTIES           ("InverseObjectProperties"),
    /** FUNCTIONAL_OBJECT_PROPERTY          */  FUNCTIONAL_OBJECT_PROPERTY          ("FunctionalObjectProperty"),
    /** INVERSE_FUNCTIONAL_OBJECT_PROPERTY  */  INVERSE_FUNCTIONAL_OBJECT_PROPERTY  ("InverseFunctionalObjectProperty"),
    /** SYMMETRIC_OBJECT_PROPERTY           */  SYMMETRIC_OBJECT_PROPERTY           ("SymmetricObjectProperty"),
    /** ASYMMETRIC_OBJECT_PROPERTY          */  ASYMMETRIC_OBJECT_PROPERTY          ("AsymmetricObjectProperty"),
    /** REFLEXIVE_OBJECT_PROPERTY           */  REFLEXIVE_OBJECT_PROPERTY           ("ReflexiveObjectProperty"),
    /** IRREFLEXIVE_OBJECT_PROPERTY         */  IRREFLEXIVE_OBJECT_PROPERTY         ("IrreflexiveObjectProperty"),
    /** TRANSITIVE_OBJECT_PROPERTY          */  TRANSITIVE_OBJECT_PROPERTY          ("TransitiveObjectProperty"),
    /** SUB_DATA_PROPERTY_OF                */  SUB_DATA_PROPERTY_OF                ("SubDataPropertyOf"),
    /** EQUIVALENT_DATA_PROPERTIES          */  EQUIVALENT_DATA_PROPERTIES          ("EquivalentDataProperties"),
    /** DISJOINT_DATA_PROPERTIES            */  DISJOINT_DATA_PROPERTIES            ("DisjointDataProperties"),
    /** DATA_PROPERTY_DOMAIN                */  DATA_PROPERTY_DOMAIN                ("DataPropertyDomain"),
    /** DATA_PROPERTY_RANGE                 */  DATA_PROPERTY_RANGE                 ("DataPropertyRange"),
    /** FUNCTIONAL_DATA_PROPERTY            */  FUNCTIONAL_DATA_PROPERTY            ("FunctionalDataProperty"),
    /** SAME_INDIVIDUAL                     */  SAME_INDIVIDUAL                     ("SameIndividual"),
    /** DIFFERENT_INDIVIDUALS               */  DIFFERENT_INDIVIDUALS               ("DifferentIndividuals"),
    /** CLASS_ASSERTION                     */  CLASS_ASSERTION                     ("ClassAssertion"),
    /** OBJECT_PROPERTY_ASSERTION           */  OBJECT_PROPERTY_ASSERTION           ("ObjectPropertyAssertion"),
    /** DATA_PROPERTY_ASSERTION             */  DATA_PROPERTY_ASSERTION             ("DataPropertyAssertion"),
    /** NEGATIVE_OBJECT_PROPERTY_ASSERTION  */  NEGATIVE_OBJECT_PROPERTY_ASSERTION  ("NegativeObjectPropertyAssertion"),
    /** NEGATIVE_DATA_PROPERTY_ASSERTION    */  NEGATIVE_DATA_PROPERTY_ASSERTION    ("NegativeDataPropertyAssertion"),
    /** HAS_KEY                             */  HAS_KEY                             ("HasKey"),
    /** DECLARATION                         */  DECLARATION                         ("Declaration"),
    /** ANNOTATION_ASSERTION                */  ANNOTATION_ASSERTION                ("AnnotationAssertion"),
    /** ANNOTATION_PROPERTY_DOMAIN          */  ANNOTATION_PROPERTY_DOMAIN          ("AnnotationPropertyDomain"),
    /** ANNOTATION_PROPERTY_RANGE           */  ANNOTATION_PROPERTY_RANGE           ("AnnotationPropertyRange"),
    /** SUB_ANNOTATION_PROPERTY_OF          */  SUB_ANNOTATION_PROPERTY_OF          ("SubAnnotationPropertyOf"),
    /** DATATYPE_DEFINITION                 */  DATATYPE_DEFINITION                 ("DatatypeDefinition"),
    /** PREFIX                              */  PREFIX                              ("Prefix"),
    /** NAME_ATTRIBUTE                      */  NAME_ATTRIBUTE                      ("name"),
    /** IRI_ATTRIBUTE                       */  IRI_ATTRIBUTE                       ("IRI"),
    /** ABBREVIATED_IRI_ATTRIBUTE           */  ABBREVIATED_IRI_ATTRIBUTE           ("abbreviatedIRI"),
    /** IRI_ELEMENT                         */  IRI_ELEMENT                         ("IRI"),
    /** ABBREVIATED_IRI_ELEMENT             */  ABBREVIATED_IRI_ELEMENT             ("AbbreviatedIRI"),
    /** CARDINALITY_ATTRIBUTE               */  CARDINALITY_ATTRIBUTE               ("cardinality"),
    
    // Rules Extensions
    /** DL_SAFE_RULE                        */  DL_SAFE_RULE                        ("DLSafeRule"),
    /** BODY                                */  BODY                                ("Body"),
    /** HEAD                                */  HEAD                                ("Head"),
    /** CLASS_ATOM                          */  CLASS_ATOM                          ("ClassAtom"),
    /** DATA_RANGE_ATOM                     */  DATA_RANGE_ATOM                     ("DataRangeAtom"),
    /** OBJECT_PROPERTY_ATOM                */  OBJECT_PROPERTY_ATOM                ("ObjectPropertyAtom"),
    /** DATA_PROPERTY_ATOM                  */  DATA_PROPERTY_ATOM                  ("DataPropertyAtom"),
    /** BUILT_IN_ATOM                       */  BUILT_IN_ATOM                       ("BuiltInAtom"),
    /** SAME_INDIVIDUAL_ATOM                */  SAME_INDIVIDUAL_ATOM                ("SameIndividualAtom"),
    /** DIFFERENT_INDIVIDUALS_ATOM          */  DIFFERENT_INDIVIDUALS_ATOM          ("DifferentIndividualsAtom"),
    /** VARIABLE                            */  VARIABLE                            ("Variable"),
    /** DESCRIPTION_GRAPH_RULE              */  DESCRIPTION_GRAPH_RULE              ("DescriptionGraphRule");
//@formatter:on
    @Nonnull
    private final IRI iri;
    @Nonnull
    private final String shortName;
    @Nonnull
    private final String prefixedName;

    OWLXMLVocabulary(@Nonnull String name) {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(15986);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15987);iri = IRI.create(Namespaces.OWL.toString(), name);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15988);shortName = name;
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15989);prefixedName = Namespaces.OWL.getPrefixName() + ':' + name;
    }finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(15990);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15991);return iri;
    }finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(15992);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15993);return iri.toString();
    }finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}

    static final Set<IRI> BUILT_IN_IRIS;
    static {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(15994);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15995);BUILT_IN_IRIS = new HashSet<>();
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15996);for (OWLRDFVocabulary v : OWLRDFVocabulary.values()) {{
            __CLR4_5_2cc2cc2lvicksgu.R.inc(15997);BUILT_IN_IRIS.add(v.getIRI());
        }
    }}finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}

    @Override
    public String getShortForm() {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(15998);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(15999);return shortName;
    }finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_2cc2cc2lvicksgu.R.inc(16000);
        __CLR4_5_2cc2cc2lvicksgu.R.inc(16001);return prefixedName;
    }finally{__CLR4_5_2cc2cc2lvicksgu.R.flushNeeded();}}
;public static class __CLR4_5_2cc2cc2lvicksgu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,16002,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
