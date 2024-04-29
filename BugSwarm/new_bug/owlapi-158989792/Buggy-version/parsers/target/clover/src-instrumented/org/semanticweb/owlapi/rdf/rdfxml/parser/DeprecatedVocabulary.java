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

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.vocab.Namespaces;

final class DeprecatedVocabulary {public static class __CLR4_5_2o3so3slvicmcgf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,31241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //@formatter:off
    private static final String OWL = Namespaces.OWL.toString();
    /** http://www.w3.org/2002/07/owl#OntologyProperty **/                  public static final IRI OWL_ONTOLOGY_PROPERTY                   = IRI.create(OWL, "OntologyProperty");
    /** http://www.w3.org/2002/07/owl#AntisymmetricProperty **/             public static final IRI OWL_ANTI_SYMMETRIC_PROPERTY             = IRI.create(OWL, "AntisymmetricProperty");
    /** http://www.w3.org/2002/07/owl#DataRestriction **/                   public static final IRI OWL_DATA_RESTRICTION                    = IRI.create(OWL, "DataRestriction");
    /** http://www.w3.org/2002/07/owl#ObjectRestriction **/                 public static final IRI OWL_OBJECT_RESTRICTION                  = IRI.create(OWL, "ObjectRestriction");
    /** http://www.w3.org/2002/07/owl#SelfRestriction **/                   public static final IRI OWL_SELF_RESTRICTION                    = IRI.create(OWL, "SelfRestriction");
    /** http://www.w3.org/2002/07/owl#declaredAs **/                        public static final IRI OWL_DECLARED_AS                         = IRI.create(OWL, "declaredAs");
    /** http://www.w3.org/2002/07/owl#NegativeObjectPropertyAssertion **/   public static final IRI OWL_NEGATIVE_OBJECT_PROPERTY_ASSERTION  = IRI.create(OWL, "NegativeObjectPropertyAssertion");
    /** http://www.w3.org/2002/07/owl#NegativeDataPropertyAssertion **/     public static final IRI OWL_NEGATIVE_DATA_PROPERTY_ASSERTION    = IRI.create(OWL, "NegativeDataPropertyAssertion");
    /** http://www.w3.org/1999/02/22-rdf-syntax-ns#subject **/              public static final IRI RDF_SUBJECT                             = IRI.create(Namespaces.RDF.toString(), "subject");
    /** http://www.w3.org/1999/02/22-rdf-syntax-ns#predicate **/            public static final IRI RDF_PREDICATE                           = IRI.create(Namespaces.RDF.toString(), "predicate");
    /** http://www.w3.org/1999/02/22-rdf-syntax-ns#object **/               public static final IRI RDF_OBJECT                              = IRI.create(Namespaces.RDF.toString(), "object");
    /** http://www.w3.org/2002/07/owl#subject **/                           public static final IRI OWL_SUBJECT                             = IRI.create(OWL, "subject");
    /** http://www.w3.org/2002/07/owl#predicate **/                         public static final IRI OWL_PREDICATE                           = IRI.create(OWL, "predicate");
    /** http://www.w3.org/2002/07/owl#object **/                            public static final IRI OWL_OBJECT                              = IRI.create(OWL, "object");
    /** http://www.w3.org/2002/07/owl#objectPropertyDomain **/              public static final IRI OWL_OBJECT_PROPERTY_DOMAIN              = IRI.create(OWL, "objectPropertyDomain");
    /** http://www.w3.org/2002/07/owl#dataPropertyDomain **/                public static final IRI OWL_DATA_PROPERTY_DOMAIN                = IRI.create(OWL, "dataPropertyDomain");
    /** http://www.w3.org/2002/07/owl#dataPropertyRange **/                 public static final IRI OWL_DATA_PROPERTY_RANGE                 = IRI.create(OWL, "dataPropertyRange");
    /** http://www.w3.org/2002/07/owl#objectPropertyRange **/               public static final IRI OWL_OBJECT_PROPERTY_RANGE               = IRI.create(OWL, "objectPropertyRange");
    /** http://www.w3.org/2002/07/owl#subObjectPropertyOf **/               public static final IRI OWL_SUB_OBJECT_PROPERTY_OF              = IRI.create(OWL, "subObjectPropertyOf");
    /** http://www.w3.org/2002/07/owl#subDataPropertyOf **/                 public static final IRI OWL_SUB_DATA_PROPERTY_OF                = IRI.create(OWL, "subDataPropertyOf");
    /** http://www.w3.org/2002/07/owl#disjointDataProperties **/            public static final IRI OWL_DISJOINT_DATA_PROPERTIES            = IRI.create(OWL, "disjointDataProperties");
    /** http://www.w3.org/2002/07/owl#disjointObjectProperties **/          public static final IRI OWL_DISJOINT_OBJECT_PROPERTIES          = IRI.create(OWL, "disjointObjectProperties");
    /** http://www.w3.org/2002/07/owl#equivalentDataProperty **/            public static final IRI OWL_EQUIVALENT_DATA_PROPERTIES          = IRI.create(OWL, "equivalentDataProperty");
    /** http://www.w3.org/2002/07/owl#equivalentObjectProperty **/          public static final IRI OWL_EQUIVALENT_OBJECT_PROPERTIES        = IRI.create(OWL, "equivalentObjectProperty");
    /** http://www.w3.org/2002/07/owl#FunctionalDataProperty **/            public static final IRI OWL_FUNCTIONAL_DATA_PROPERTY            = IRI.create(OWL, "FunctionalDataProperty");
    /** http://www.w3.org/2002/07/owl#FunctionalObjectProperty **/          public static final IRI OWL_FUNCTIONAL_OBJECT_PROPERTY          = IRI.create(OWL, "FunctionalObjectProperty");
    /** http://www.w3.org/2002/07/owl#propertyChain **/                     public static final IRI OWL_PROPERTY_CHAIN                      = IRI.create(OWL, "propertyChain");

    private DeprecatedVocabulary () {try{__CLR4_5_2o3so3slvicmcgf.R.inc(31240);}finally{__CLR4_5_2o3so3slvicmcgf.R.flushNeeded();}}
    //@formatter:on
}
