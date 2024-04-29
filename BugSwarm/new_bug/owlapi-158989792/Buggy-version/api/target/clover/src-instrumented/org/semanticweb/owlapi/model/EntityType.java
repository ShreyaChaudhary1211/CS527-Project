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
package org.semanticweb.owlapi.model;

import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * Represents the different types of OWL 2 Entities.
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 * @param <E>
 *        entity type
 */
@SuppressWarnings("unused")
public final class EntityType<E extends OWLEntity> implements Serializable,
        HasShortForm, HasPrefixedName, HasIRI {public static class __CLR4_5_21r81r8lvicklt5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2299,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    //@formatter:off
    /** class entity */             @Nonnull    public static final EntityType<OWLClass> CLASS = new EntityType<OWLClass>( "Class", "Class", "Classes", OWL_CLASS);
    /** object property entity */   @Nonnull    public static final EntityType<OWLObjectProperty> OBJECT_PROPERTY = new EntityType<OWLObjectProperty>( "ObjectProperty", "Object property", "Object properties", OWL_OBJECT_PROPERTY);
    /** data property entity */     @Nonnull    public static final EntityType<OWLDataProperty> DATA_PROPERTY = new EntityType<OWLDataProperty>( "DataProperty", "Data property", "Data properties", OWL_DATA_PROPERTY);
    /** annotation property entity*/@Nonnull    public static final EntityType<OWLAnnotationProperty> ANNOTATION_PROPERTY = new EntityType<OWLAnnotationProperty>( "AnnotationProperty", "Annotation property", "Annotation properties", OWL_ANNOTATION_PROPERTY);
    /** named individual entity */  @Nonnull    public static final EntityType<OWLNamedIndividual> NAMED_INDIVIDUAL = new EntityType<OWLNamedIndividual>("NamedIndividual", "Named individual", "Named individuals", OWL_NAMED_INDIVIDUAL);
    /** datatype entity */          @Nonnull    public static final EntityType<OWLDatatype> DATATYPE = new EntityType<OWLDatatype>( "Datatype", "Datatype", "Datatypes", RDFS_DATATYPE);
    private static final List<EntityType<?>> VALUES = Collections.<EntityType<?>> unmodifiableList(Arrays.asList(CLASS, OBJECT_PROPERTY, DATA_PROPERTY, ANNOTATION_PROPERTY, NAMED_INDIVIDUAL, DATATYPE));
  //@formatter:on
    @Nonnull
    private final String name;
    @Nonnull
    private final OWLRDFVocabulary vocabulary;
    @Nonnull
    private final String printName;
    @Nonnull
    private final String pluralPrintName;

    private EntityType(@Nonnull String name, @Nonnull String print,
            @Nonnull String pluralPrint, @Nonnull OWLRDFVocabulary vocabulary) {try{__CLR4_5_21r81r8lvicklt5.R.inc(2276);
        __CLR4_5_21r81r8lvicklt5.R.inc(2277);this.name = name;
        __CLR4_5_21r81r8lvicklt5.R.inc(2278);this.vocabulary = vocabulary;
        __CLR4_5_21r81r8lvicklt5.R.inc(2279);printName = print;
        __CLR4_5_21r81r8lvicklt5.R.inc(2280);pluralPrintName = pluralPrint;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    /** @return toe vocabulary enum corresponding to this entity */
    public OWLRDFVocabulary getVocabulary() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2281);
        __CLR4_5_21r81r8lvicklt5.R.inc(2282);return vocabulary;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    /** @return this entity tipe name */
    public String getName() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2283);
        __CLR4_5_21r81r8lvicklt5.R.inc(2284);return name;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2285);
        __CLR4_5_21r81r8lvicklt5.R.inc(2286);return name;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    /** @return the list of known entity types */
    public static List<EntityType<?>> values() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2287);
        __CLR4_5_21r81r8lvicklt5.R.inc(2288);return VALUES;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    /** @return printable name */
    @Nonnull
    public String getPrintName() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2289);
        __CLR4_5_21r81r8lvicklt5.R.inc(2290);return printName;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    /** @return plural printable name */
    @Nonnull
    public String getPluralPrintName() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2291);
        __CLR4_5_21r81r8lvicklt5.R.inc(2292);return pluralPrintName;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    @Override
    public String getShortForm() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2293);
        __CLR4_5_21r81r8lvicklt5.R.inc(2294);return name;
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    @Override
    public String getPrefixedName() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2295);
        __CLR4_5_21r81r8lvicklt5.R.inc(2296);return vocabulary.getPrefixedName();
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_21r81r8lvicklt5.R.inc(2297);
        __CLR4_5_21r81r8lvicklt5.R.inc(2298);return vocabulary.getIRI();
    }finally{__CLR4_5_21r81r8lvicklt5.R.flushNeeded();}}
}
