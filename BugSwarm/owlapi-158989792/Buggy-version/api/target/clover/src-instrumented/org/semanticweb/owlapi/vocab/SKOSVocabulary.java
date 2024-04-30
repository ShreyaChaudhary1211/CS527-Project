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

import static org.semanticweb.owlapi.model.EntityType.*;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.HasPrefixedName;
import org.semanticweb.owlapi.model.HasShortForm;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public enum SKOSVocabulary implements HasShortForm, HasIRI, HasPrefixedName {
//@formatter:off
    /** BROADMATCH        */  BROADMATCH          ("broadMatch",          OBJECT_PROPERTY), 
    /** BROADER           */  BROADER             ("broader",             OBJECT_PROPERTY), 
    /** BROADERTRANSITIVE */  BROADERTRANSITIVE   ("broaderTransitive",   OBJECT_PROPERTY), 
    /** CLOSEMATCH        */  CLOSEMATCH          ("closeMatch",          OBJECT_PROPERTY), 
    /** EXACTMATCH        */  EXACTMATCH          ("exactMatch",          OBJECT_PROPERTY), 
    /** HASTOPCONCEPT     */  HASTOPCONCEPT       ("hasTopConcept",       OBJECT_PROPERTY), 
    /** INSCHEME          */  INSCHEME            ("inScheme",            OBJECT_PROPERTY), 
    /** MAPPINGRELATION   */  MAPPINGRELATION     ("mappingRelation",     OBJECT_PROPERTY), 
    /** MEMBER            */  MEMBER              ("member",              OBJECT_PROPERTY), 
    /** MEMBERLIST        */  MEMBERLIST          ("memberList",          OBJECT_PROPERTY), 
    /** NARROWMATCH       */  NARROWMATCH         ("narrowMatch",         OBJECT_PROPERTY), 
    /** NARROWER          */  NARROWER            ("narrower",            OBJECT_PROPERTY), 
    /** NARROWTRANSITIVE  */  NARROWTRANSITIVE    ("narrowTransitive",    OBJECT_PROPERTY), 
    /** RELATED           */  RELATED             ("related",             OBJECT_PROPERTY), 
    /** RELATEDMATCH      */  RELATEDMATCH        ("relatedMatch",        OBJECT_PROPERTY), 
    /** SEMANTICRELATION  */  SEMANTICRELATION    ("semanticRelation",    OBJECT_PROPERTY), 
    /** TOPCONCEPTOF      */  TOPCONCEPTOF        ("topConceptOf",        OBJECT_PROPERTY), 
    /** COLLECTION        */  COLLECTION          ("Collection",          CLASS), 
    /** CONCEPT           */  CONCEPT             ("Concept",             CLASS), 
    /** CONCEPTSCHEME     */  CONCEPTSCHEME       ("ConceptScheme",       CLASS), 
    /** ORDEREDCOLLECTION */  ORDEREDCOLLECTION   ("OrderedCollection",   CLASS), 
    /** TOPCONCEPT        */  TOPCONCEPT          ("TopConcept",          CLASS), 
    /** ALTLABEL          */  ALTLABEL            ("altLabel",            ANNOTATION_PROPERTY), 
    /** CHANGENOTE        */  CHANGENOTE          ("changeNote",          ANNOTATION_PROPERTY), 
    /** DEFINITION        */  DEFINITION          ("definition",          ANNOTATION_PROPERTY), 
    /** EDITORIALNOTE     */  EDITORIALNOTE       ("editorialNote",       ANNOTATION_PROPERTY), 
    /** EXAMPLE           */  EXAMPLE             ("example",             ANNOTATION_PROPERTY), 
    /** HIDDENLABEL       */  HIDDENLABEL         ("hiddenLabel",         ANNOTATION_PROPERTY), 
    /** HISTORYNOTE       */  HISTORYNOTE         ("historyNote",         ANNOTATION_PROPERTY), 
    /** NOTE              */  NOTE                ("note",                ANNOTATION_PROPERTY), 
    /** PREFLABEL         */  PREFLABEL           ("prefLabel",           ANNOTATION_PROPERTY), 
    /** SCOPENOTE         */  SCOPENOTE           ("scopeNote",           ANNOTATION_PROPERTY),
    /** @deprecated No longer used */
    @Deprecated
    DOCUMENT("Document", CLASS),
    /** @deprecated No longer used */
    @Deprecated
    IMAGE("Image", CLASS),
    /** @deprecated No longer used */
    @Deprecated
    COLLECTABLEPROPERTY("CollectableProperty", ANNOTATION_PROPERTY),
    /** @deprecated No longer used */
    @Deprecated
    RESOURCE("Resource", CLASS),
    /** @deprecated No longer used */
    @Deprecated
    COMMENT("comment", ANNOTATION_PROPERTY);
//@formatter:on
    /** all IRIs */
    public static final Set<IRI> ALL_IRIS;
    static {try{__CLR4_5_2cciccilvicksh9.R.inc(16002);
        __CLR4_5_2cciccilvicksh9.R.inc(16003);ALL_IRIS = new HashSet<>();
        __CLR4_5_2cciccilvicksh9.R.inc(16004);for (SKOSVocabulary v : SKOSVocabulary.values()) {{
            __CLR4_5_2cciccilvicksh9.R.inc(16005);ALL_IRIS.add(v.getIRI());
        }
    }}finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}
    @Nonnull
    private final String localName;
    @Nonnull
    private final IRI iri;
    @Nonnull
    private final EntityType<?> entityType;
    @Nonnull
    private final String prefixedName;

    SKOSVocabulary(@Nonnull String localname, @Nonnull EntityType<?> entityType) {try{__CLR4_5_2cciccilvicksh9.R.inc(16006);
        __CLR4_5_2cciccilvicksh9.R.inc(16007);localName = localname;
        __CLR4_5_2cciccilvicksh9.R.inc(16008);prefixedName = Namespaces.SKOS.getPrefixName() + ':' + localname;
        __CLR4_5_2cciccilvicksh9.R.inc(16009);this.entityType = entityType;
        __CLR4_5_2cciccilvicksh9.R.inc(16010);iri = IRI.create(Namespaces.SKOS.toString(), localname);
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /** @return entity type */
    public EntityType<?> getEntityType() {try{__CLR4_5_2cciccilvicksh9.R.inc(16011);
        __CLR4_5_2cciccilvicksh9.R.inc(16012);return entityType;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /** @return local name */
    public String getLocalName() {try{__CLR4_5_2cciccilvicksh9.R.inc(16013);
        __CLR4_5_2cciccilvicksh9.R.inc(16014);return localName;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2cciccilvicksh9.R.inc(16015);
        __CLR4_5_2cciccilvicksh9.R.inc(16016);return iri;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /**
     * @param dataFactory
     *        data factory to use
     * @return set of SKOS annotation properties
     */
    public static Set<OWLAnnotationProperty> getAnnotationProperties(
            OWLDataFactory dataFactory) {try{__CLR4_5_2cciccilvicksh9.R.inc(16017);
        __CLR4_5_2cciccilvicksh9.R.inc(16018);Set<OWLAnnotationProperty> result = new HashSet<>();
        __CLR4_5_2cciccilvicksh9.R.inc(16019);for (SKOSVocabulary v : values()) {{
            __CLR4_5_2cciccilvicksh9.R.inc(16020);if ((((v.entityType.equals(ANNOTATION_PROPERTY))&&(__CLR4_5_2cciccilvicksh9.R.iget(16021)!=0|true))||(__CLR4_5_2cciccilvicksh9.R.iget(16022)==0&false))) {{
                __CLR4_5_2cciccilvicksh9.R.inc(16023);result.add(dataFactory.getOWLAnnotationProperty(v.iri));
            }
        }}
        }__CLR4_5_2cciccilvicksh9.R.inc(16024);return result;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /**
     * @param dataFactory
     *        data factory to use
     * @return set of SKOS object properties
     */
    public static Set<OWLObjectProperty> getObjectProperties(
            OWLDataFactory dataFactory) {try{__CLR4_5_2cciccilvicksh9.R.inc(16025);
        __CLR4_5_2cciccilvicksh9.R.inc(16026);Set<OWLObjectProperty> result = new HashSet<>();
        __CLR4_5_2cciccilvicksh9.R.inc(16027);for (SKOSVocabulary v : values()) {{
            __CLR4_5_2cciccilvicksh9.R.inc(16028);if ((((v.entityType.equals(OBJECT_PROPERTY))&&(__CLR4_5_2cciccilvicksh9.R.iget(16029)!=0|true))||(__CLR4_5_2cciccilvicksh9.R.iget(16030)==0&false))) {{
                __CLR4_5_2cciccilvicksh9.R.inc(16031);result.add(dataFactory.getOWLObjectProperty(v.iri));
            }
        }}
        }__CLR4_5_2cciccilvicksh9.R.inc(16032);return result;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /**
     * @param dataFactory
     *        data factory to use
     * @return set of SKOS data properties
     */
    public static Set<OWLDataProperty> getDataProperties(
            OWLDataFactory dataFactory) {try{__CLR4_5_2cciccilvicksh9.R.inc(16033);
        __CLR4_5_2cciccilvicksh9.R.inc(16034);Set<OWLDataProperty> result = new HashSet<>();
        __CLR4_5_2cciccilvicksh9.R.inc(16035);for (SKOSVocabulary v : values()) {{
            __CLR4_5_2cciccilvicksh9.R.inc(16036);if ((((v.entityType.equals(DATA_PROPERTY))&&(__CLR4_5_2cciccilvicksh9.R.iget(16037)!=0|true))||(__CLR4_5_2cciccilvicksh9.R.iget(16038)==0&false))) {{
                __CLR4_5_2cciccilvicksh9.R.inc(16039);result.add(dataFactory.getOWLDataProperty(v.iri));
            }
        }}
        }__CLR4_5_2cciccilvicksh9.R.inc(16040);return result;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    /**
     * @param dataFactory
     *        data factory to use
     * @return set of SKOS classes
     */
    public static Set<OWLClass> getClasses(OWLDataFactory dataFactory) {try{__CLR4_5_2cciccilvicksh9.R.inc(16041);
        __CLR4_5_2cciccilvicksh9.R.inc(16042);Set<OWLClass> result = new HashSet<>();
        __CLR4_5_2cciccilvicksh9.R.inc(16043);for (SKOSVocabulary v : values()) {{
            __CLR4_5_2cciccilvicksh9.R.inc(16044);if ((((v.entityType.equals(CLASS))&&(__CLR4_5_2cciccilvicksh9.R.iget(16045)!=0|true))||(__CLR4_5_2cciccilvicksh9.R.iget(16046)==0&false))) {{
                __CLR4_5_2cciccilvicksh9.R.inc(16047);result.add(dataFactory.getOWLClass(v.iri));
            }
        }}
        }__CLR4_5_2cciccilvicksh9.R.inc(16048);return result;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    @Override
    @Nonnull
    public String getShortForm() {try{__CLR4_5_2cciccilvicksh9.R.inc(16049);
        __CLR4_5_2cciccilvicksh9.R.inc(16050);return localName;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_2cciccilvicksh9.R.inc(16051);
        __CLR4_5_2cciccilvicksh9.R.inc(16052);return prefixedName;
    }finally{__CLR4_5_2cciccilvicksh9.R.flushNeeded();}}
;public static class __CLR4_5_2cciccilvicksh9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,16053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
